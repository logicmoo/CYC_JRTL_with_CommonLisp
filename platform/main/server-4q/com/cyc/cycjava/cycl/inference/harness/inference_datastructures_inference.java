package com.cyc.cycjava.cycl.inference.harness;

import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow.*;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.*;
import static com.cyc.tool.subl.util.SubLFiles.*;

import java.util.Iterator;
import java.util.Map;

import com.cyc.cycjava.cycl.access_macros;
import com.cyc.cycjava.cycl.accumulation;
import com.cyc.cycjava.cycl.arguments;
import com.cyc.cycjava.cycl.assertion_utilities;
import com.cyc.cycjava.cycl.assertions_high;
import com.cyc.cycjava.cycl.bindings;
import com.cyc.cycjava.cycl.clauses;
import com.cyc.cycjava.cycl.cycl_utilities;
import com.cyc.cycjava.cycl.date_utilities;
import com.cyc.cycjava.cycl.dictionary;
import com.cyc.cycjava.cycl.dictionary_utilities;
import com.cyc.cycjava.cycl.el_utilities;
import com.cyc.cycjava.cycl.format_cycl_expression;
import com.cyc.cycjava.cycl.hlmt;
import com.cyc.cycjava.cycl.id_index;
import com.cyc.cycjava.cycl.kb_control_vars;
import com.cyc.cycjava.cycl.kb_utilities;
import com.cyc.cycjava.cycl.keyhash_utilities;
import com.cyc.cycjava.cycl.list_utilities;
import com.cyc.cycjava.cycl.misc_utilities;
import com.cyc.cycjava.cycl.number_utilities;
import com.cyc.cycjava.cycl.numeric_date_utilities;
import com.cyc.cycjava.cycl.queues;
import com.cyc.cycjava.cycl.set;
import com.cyc.cycjava.cycl.set_contents;
import com.cyc.cycjava.cycl.set_utilities;
import com.cyc.cycjava.cycl.subl_macro_promotions;
import com.cyc.cycjava.cycl.subl_promotions;
import com.cyc.cycjava.cycl.inference.inference_event;
import com.cyc.cycjava.cycl.inference.inference_pad_data;
import com.cyc.cycjava.cycl.inference.leviathan;
import com.cyc.cycjava.cycl.sksi.sksi_infrastructure.sksi_infrastructure_macros;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Characters;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.CommonSymbols;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Dynamic;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Equality;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Errors;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Functions;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Hashtables;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Locks;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Numbers;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.PrintLow;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Sequences;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Sort;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Strings;
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
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.conses_high;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.print_high;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.print_macros;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.reader;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.streams_high;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.visitation;
import com.cyc.tool.subl.util.SubLFile;
import com.cyc.tool.subl.util.SubLTranslatedFile;

public class inference_datastructures_inference extends SubLTranslatedFile {
    public static SubLFile me;
    public static String myName = "com.cyc.cycjava.cycl.inference.harness.inference_datastructures_inference";
    public static String myFingerPrint = "dec25da45c9614186ba4f29d70061e4e72e3a1abb713ab3f2948d5b4421529f6";
    @SubL(source = "cycl/inference/harness/inference-datastructures-inference.lisp", position = 1200L)
    private static SubLSymbol $inference_types$;
    @SubL(source = "cycl/inference/harness/inference-datastructures-inference.lisp", position = 3500L)
    public static SubLSymbol $dtp_inference$;
    @SubL(source = "cycl/inference/harness/inference-datastructures-inference.lisp", position = 77100L)
    private static SubLSymbol $pad_times_to_first_answer$;
    @SubL(source = "cycl/inference/harness/inference-datastructures-inference.lisp", position = 100300L)
    public static SubLSymbol $dtp_inference_answer$;
    @SubL(source = "cycl/inference/harness/inference-datastructures-inference.lisp", position = 111400L)
    public static SubLSymbol $dtp_inference_answer_justification$;
    private static SubLList $list0;
    private static SubLSymbol $sym1$INFERENCE;
    private static SubLSymbol $sym2$INFERENCE_P;
    private static SubLList $list3;
    private static SubLList $list4;
    private static SubLList $list5;
    private static SubLList $list6;
    private static SubLSymbol $sym7$PRINT_INFERENCE;
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
    private static SubLInteger $int$50;
    private static SubLInteger $int$51;
    private static SubLInteger $int$52;
    private static SubLInteger $int$53;
    private static SubLInteger $int$54;
    private static SubLInteger $int$55;
    private static SubLInteger $int$56;
    private static SubLInteger $int$57;
    private static SubLInteger $int$58;
    private static SubLInteger $int$59;
    private static SubLInteger $int$60;
    private static SubLInteger $int$61;
    private static SubLInteger $int$62;
    private static SubLInteger $int$63;
    private static SubLInteger $int$64;
    private static SubLInteger $int$65;
    private static SubLInteger $int$66;
    private static SubLInteger $int$67;
    private static SubLInteger $int$68;
    private static SubLInteger $int$69;
    private static SubLInteger $int$70;
    private static SubLInteger $int$71;
    private static SubLInteger $int$72;
    private static SubLSymbol $sym60$INFERENCE_PRINT_FUNCTION_TRAMPOLINE;
    private static SubLList $list61;
    private static SubLSymbol $sym62$INFRNC_SUID;
    private static SubLSymbol $sym63$_CSETF_INFRNC_SUID;
    private static SubLSymbol $sym64$INFRNC_PROBLEM_STORE;
    private static SubLSymbol $sym65$_CSETF_INFRNC_PROBLEM_STORE;
    private static SubLSymbol $sym66$INFRNC_FORWARD_PROPAGATE;
    private static SubLSymbol $sym67$_CSETF_INFRNC_FORWARD_PROPAGATE;
    private static SubLSymbol $sym68$INFRNC_INPUT_MT;
    private static SubLSymbol $sym69$_CSETF_INFRNC_INPUT_MT;
    private static SubLSymbol $sym70$INFRNC_INPUT_EL_QUERY;
    private static SubLSymbol $sym71$_CSETF_INFRNC_INPUT_EL_QUERY;
    private static SubLSymbol $sym72$INFRNC_INPUT_NON_EXPLANATORY_EL_QUERY;
    private static SubLSymbol $sym73$_CSETF_INFRNC_INPUT_NON_EXPLANATORY_EL_QUERY;
    private static SubLSymbol $sym74$INFRNC_INPUT_QUERY_PROPERTIES;
    private static SubLSymbol $sym75$_CSETF_INFRNC_INPUT_QUERY_PROPERTIES;
    private static SubLSymbol $sym76$INFRNC_MT;
    private static SubLSymbol $sym77$_CSETF_INFRNC_MT;
    private static SubLSymbol $sym78$INFRNC_EL_QUERY;
    private static SubLSymbol $sym79$_CSETF_INFRNC_EL_QUERY;
    private static SubLSymbol $sym80$INFRNC_EL_BINDINGS;
    private static SubLSymbol $sym81$_CSETF_INFRNC_EL_BINDINGS;
    private static SubLSymbol $sym82$INFRNC_HL_QUERY;
    private static SubLSymbol $sym83$_CSETF_INFRNC_HL_QUERY;
    private static SubLSymbol $sym84$INFRNC_EXPLANATORY_SUBQUERY;
    private static SubLSymbol $sym85$_CSETF_INFRNC_EXPLANATORY_SUBQUERY;
    private static SubLSymbol $sym86$INFRNC_NON_EXPLANATORY_SUBQUERY;
    private static SubLSymbol $sym87$_CSETF_INFRNC_NON_EXPLANATORY_SUBQUERY;
    private static SubLSymbol $sym88$INFRNC_FREE_HL_VARS;
    private static SubLSymbol $sym89$_CSETF_INFRNC_FREE_HL_VARS;
    private static SubLSymbol $sym90$INFRNC_HYPOTHETICAL_BINDINGS;
    private static SubLSymbol $sym91$_CSETF_INFRNC_HYPOTHETICAL_BINDINGS;
    private static SubLSymbol $sym92$INFRNC_ANSWER_ID_INDEX;
    private static SubLSymbol $sym93$_CSETF_INFRNC_ANSWER_ID_INDEX;
    private static SubLSymbol $sym94$INFRNC_ANSWER_BINDINGS_INDEX;
    private static SubLSymbol $sym95$_CSETF_INFRNC_ANSWER_BINDINGS_INDEX;
    private static SubLSymbol $sym96$INFRNC_NEW_ANSWER_ID_START;
    private static SubLSymbol $sym97$_CSETF_INFRNC_NEW_ANSWER_ID_START;
    private static SubLSymbol $sym98$INFRNC_NEW_ANSWER_JUSTIFICATIONS;
    private static SubLSymbol $sym99$_CSETF_INFRNC_NEW_ANSWER_JUSTIFICATIONS;
    private static SubLSymbol $sym100$INFRNC_STATUS;
    private static SubLSymbol $sym101$_CSETF_INFRNC_STATUS;
    private static SubLSymbol $sym102$INFRNC_SUSPEND_STATUS;
    private static SubLSymbol $sym103$_CSETF_INFRNC_SUSPEND_STATUS;
    private static SubLSymbol $sym104$INFRNC_ROOT_LINK;
    private static SubLSymbol $sym105$_CSETF_INFRNC_ROOT_LINK;
    private static SubLSymbol $sym106$INFRNC_RELEVANT_PROBLEMS;
    private static SubLSymbol $sym107$_CSETF_INFRNC_RELEVANT_PROBLEMS;
    private static SubLSymbol $sym108$INFRNC_STRATEGY_SET;
    private static SubLSymbol $sym109$_CSETF_INFRNC_STRATEGY_SET;
    private static SubLSymbol $sym110$INFRNC_CONTROL_PROCESS;
    private static SubLSymbol $sym111$_CSETF_INFRNC_CONTROL_PROCESS;
    private static SubLSymbol $sym112$INFRNC_INTERRUPTING_PROCESSES;
    private static SubLSymbol $sym113$_CSETF_INFRNC_INTERRUPTING_PROCESSES;
    private static SubLSymbol $sym114$INFRNC_MAX_TRANSFORMATION_DEPTH_REACHED;
    private static SubLSymbol $sym115$_CSETF_INFRNC_MAX_TRANSFORMATION_DEPTH_REACHED;
    private static SubLSymbol $sym116$INFRNC_DISJUNCTION_FREE_EL_VARS_POLICY;
    private static SubLSymbol $sym117$_CSETF_INFRNC_DISJUNCTION_FREE_EL_VARS_POLICY;
    private static SubLSymbol $sym118$INFRNC_RESULT_UNIQUENESS_CRITERION;
    private static SubLSymbol $sym119$_CSETF_INFRNC_RESULT_UNIQUENESS_CRITERION;
    private static SubLSymbol $sym120$INFRNC_ALLOW_HL_PREDICATE_TRANSFORMATION_;
    private static SubLSymbol $sym121$_CSETF_INFRNC_ALLOW_HL_PREDICATE_TRANSFORMATION_;
    private static SubLSymbol $sym122$INFRNC_ALLOW_UNBOUND_PREDICATE_TRANSFORMATION_;
    private static SubLSymbol $sym123$_CSETF_INFRNC_ALLOW_UNBOUND_PREDICATE_TRANSFORMATION_;
    private static SubLSymbol $sym124$INFRNC_ALLOW_EVALUATABLE_PREDICATE_TRANSFORMATION_;
    private static SubLSymbol $sym125$_CSETF_INFRNC_ALLOW_EVALUATABLE_PREDICATE_TRANSFORMATION_;
    private static SubLSymbol $sym126$INFRNC_ALLOW_INDETERMINATE_RESULTS_;
    private static SubLSymbol $sym127$_CSETF_INFRNC_ALLOW_INDETERMINATE_RESULTS_;
    private static SubLSymbol $sym128$INFRNC_ALLOWED_RULES;
    private static SubLSymbol $sym129$_CSETF_INFRNC_ALLOWED_RULES;
    private static SubLSymbol $sym130$INFRNC_FORBIDDEN_RULES;
    private static SubLSymbol $sym131$_CSETF_INFRNC_FORBIDDEN_RULES;
    private static SubLSymbol $sym132$INFRNC_ALLOWED_MODULES;
    private static SubLSymbol $sym133$_CSETF_INFRNC_ALLOWED_MODULES;
    private static SubLSymbol $sym134$INFRNC_ALLOW_ABNORMALITY_CHECKING_;
    private static SubLSymbol $sym135$_CSETF_INFRNC_ALLOW_ABNORMALITY_CHECKING_;
    private static SubLSymbol $sym136$INFRNC_TRANSITIVE_CLOSURE_MODE;
    private static SubLSymbol $sym137$_CSETF_INFRNC_TRANSITIVE_CLOSURE_MODE;
    private static SubLSymbol $sym138$INFRNC_PROBLEM_STORE_PRIVATE_;
    private static SubLSymbol $sym139$_CSETF_INFRNC_PROBLEM_STORE_PRIVATE_;
    private static SubLSymbol $sym140$INFRNC_CONTINUABLE_;
    private static SubLSymbol $sym141$_CSETF_INFRNC_CONTINUABLE_;
    private static SubLSymbol $sym142$INFRNC_BROWSABLE_;
    private static SubLSymbol $sym143$_CSETF_INFRNC_BROWSABLE_;
    private static SubLSymbol $sym144$INFRNC_RETURN_TYPE;
    private static SubLSymbol $sym145$_CSETF_INFRNC_RETURN_TYPE;
    private static SubLSymbol $sym146$INFRNC_ANSWER_LANGUAGE;
    private static SubLSymbol $sym147$_CSETF_INFRNC_ANSWER_LANGUAGE;
    private static SubLSymbol $sym148$INFRNC_CACHE_RESULTS_;
    private static SubLSymbol $sym149$_CSETF_INFRNC_CACHE_RESULTS_;
    private static SubLSymbol $sym150$INFRNC_BLOCKING_;
    private static SubLSymbol $sym151$_CSETF_INFRNC_BLOCKING_;
    private static SubLSymbol $sym152$INFRNC_MAX_NUMBER;
    private static SubLSymbol $sym153$_CSETF_INFRNC_MAX_NUMBER;
    private static SubLSymbol $sym154$INFRNC_MAX_TIME;
    private static SubLSymbol $sym155$_CSETF_INFRNC_MAX_TIME;
    private static SubLSymbol $sym156$INFRNC_MAX_STEP;
    private static SubLSymbol $sym157$_CSETF_INFRNC_MAX_STEP;
    private static SubLSymbol $sym158$INFRNC_MODE;
    private static SubLSymbol $sym159$_CSETF_INFRNC_MODE;
    private static SubLSymbol $sym160$INFRNC_FORWARD_MAX_TIME;
    private static SubLSymbol $sym161$_CSETF_INFRNC_FORWARD_MAX_TIME;
    private static SubLSymbol $sym162$INFRNC_MAX_PROOF_DEPTH;
    private static SubLSymbol $sym163$_CSETF_INFRNC_MAX_PROOF_DEPTH;
    private static SubLSymbol $sym164$INFRNC_MAX_TRANSFORMATION_DEPTH;
    private static SubLSymbol $sym165$_CSETF_INFRNC_MAX_TRANSFORMATION_DEPTH;
    private static SubLSymbol $sym166$INFRNC_MIN_RULE_UTILITY;
    private static SubLSymbol $sym167$_CSETF_INFRNC_MIN_RULE_UTILITY;
    private static SubLSymbol $sym168$INFRNC_PROBABLY_APPROXIMATELY_DONE;
    private static SubLSymbol $sym169$_CSETF_INFRNC_PROBABLY_APPROXIMATELY_DONE;
    private static SubLSymbol $sym170$INFRNC_METRICS_TEMPLATE;
    private static SubLSymbol $sym171$_CSETF_INFRNC_METRICS_TEMPLATE;
    private static SubLSymbol $sym172$INFRNC_START_UNIVERSAL_TIME;
    private static SubLSymbol $sym173$_CSETF_INFRNC_START_UNIVERSAL_TIME;
    private static SubLSymbol $sym174$INFRNC_START_INTERNAL_REAL_TIME;
    private static SubLSymbol $sym175$_CSETF_INFRNC_START_INTERNAL_REAL_TIME;
    private static SubLSymbol $sym176$INFRNC_END_INTERNAL_REAL_TIME;
    private static SubLSymbol $sym177$_CSETF_INFRNC_END_INTERNAL_REAL_TIME;
    private static SubLSymbol $sym178$INFRNC_PAD_INTERNAL_REAL_TIME;
    private static SubLSymbol $sym179$_CSETF_INFRNC_PAD_INTERNAL_REAL_TIME;
    private static SubLSymbol $sym180$INFRNC_HYPOTHESIZATION_TIME;
    private static SubLSymbol $sym181$_CSETF_INFRNC_HYPOTHESIZATION_TIME;
    private static SubLSymbol $sym182$INFRNC_CUMULATIVE_TIME;
    private static SubLSymbol $sym183$_CSETF_INFRNC_CUMULATIVE_TIME;
    private static SubLSymbol $sym184$INFRNC_STEP_COUNT;
    private static SubLSymbol $sym185$_CSETF_INFRNC_STEP_COUNT;
    private static SubLSymbol $sym186$INFRNC_CUMULATIVE_STEP_COUNT;
    private static SubLSymbol $sym187$_CSETF_INFRNC_CUMULATIVE_STEP_COUNT;
    private static SubLSymbol $sym188$INFRNC_EVENTS;
    private static SubLSymbol $sym189$_CSETF_INFRNC_EVENTS;
    private static SubLSymbol $sym190$INFRNC_HALT_CONDITIONS;
    private static SubLSymbol $sym191$_CSETF_INFRNC_HALT_CONDITIONS;
    private static SubLSymbol $sym192$INFRNC_ACCUMULATORS;
    private static SubLSymbol $sym193$_CSETF_INFRNC_ACCUMULATORS;
    private static SubLSymbol $sym194$INFRNC_PROOF_WATERMARK;
    private static SubLSymbol $sym195$_CSETF_INFRNC_PROOF_WATERMARK;
    private static SubLSymbol $sym196$INFRNC_PROBLEM_WORKING_TIME_DATA;
    private static SubLSymbol $sym197$_CSETF_INFRNC_PROBLEM_WORKING_TIME_DATA;
    private static SubLSymbol $sym198$INFRNC_TYPE;
    private static SubLSymbol $sym199$_CSETF_INFRNC_TYPE;
    private static SubLSymbol $sym200$INFRNC_DATA;
    private static SubLSymbol $sym201$_CSETF_INFRNC_DATA;
    private static SubLSymbol $sym202$INFRNC_PROPERTIES;
    private static SubLSymbol $sym203$_CSETF_INFRNC_PROPERTIES;
    private static SubLSymbol $SUID;
    private static SubLSymbol $PROBLEM_STORE;
    private static SubLSymbol $FORWARD_PROPAGATE;
    private static SubLSymbol $INPUT_MT;
    private static SubLSymbol $INPUT_EL_QUERY;
    private static SubLSymbol $INPUT_NON_EXPLANATORY_EL_QUERY;
    private static SubLSymbol $INPUT_QUERY_PROPERTIES;
    private static SubLSymbol $MT;
    private static SubLSymbol $EL_QUERY;
    private static SubLSymbol $EL_BINDINGS;
    private static SubLSymbol $HL_QUERY;
    private static SubLSymbol $EXPLANATORY_SUBQUERY;
    private static SubLSymbol $NON_EXPLANATORY_SUBQUERY;
    private static SubLSymbol $FREE_HL_VARS;
    private static SubLSymbol $HYPOTHETICAL_BINDINGS;
    private static SubLSymbol $ANSWER_ID_INDEX;
    private static SubLSymbol $ANSWER_BINDINGS_INDEX;
    private static SubLSymbol $NEW_ANSWER_ID_START;
    private static SubLSymbol $NEW_ANSWER_JUSTIFICATIONS;
    private static SubLSymbol $STATUS;
    private static SubLSymbol $SUSPEND_STATUS;
    private static SubLSymbol $ROOT_LINK;
    private static SubLSymbol $RELEVANT_PROBLEMS;
    private static SubLSymbol $STRATEGY_SET;
    private static SubLSymbol $CONTROL_PROCESS;
    private static SubLSymbol $INTERRUPTING_PROCESSES;
    private static SubLSymbol $MAX_TRANSFORMATION_DEPTH_REACHED;
    private static SubLSymbol $DISJUNCTION_FREE_EL_VARS_POLICY;
    private static SubLSymbol $RESULT_UNIQUENESS_CRITERION;
    private static SubLSymbol $ALLOW_HL_PREDICATE_TRANSFORMATION_;
    private static SubLSymbol $ALLOW_UNBOUND_PREDICATE_TRANSFORMATION_;
    private static SubLSymbol $ALLOW_EVALUATABLE_PREDICATE_TRANSFORMATION_;
    private static SubLSymbol $ALLOW_INDETERMINATE_RESULTS_;
    private static SubLSymbol $ALLOWED_RULES;
    private static SubLSymbol $FORBIDDEN_RULES;
    private static SubLSymbol $ALLOWED_MODULES;
    private static SubLSymbol $ALLOW_ABNORMALITY_CHECKING_;
    private static SubLSymbol $TRANSITIVE_CLOSURE_MODE;
    private static SubLSymbol $PROBLEM_STORE_PRIVATE_;
    private static SubLSymbol $CONTINUABLE_;
    private static SubLSymbol $BROWSABLE_;
    private static SubLSymbol $RETURN_TYPE;
    private static SubLSymbol $ANSWER_LANGUAGE;
    private static SubLSymbol $CACHE_RESULTS_;
    private static SubLSymbol $BLOCKING_;
    private static SubLSymbol $MAX_NUMBER;
    private static SubLSymbol $MAX_TIME;
    private static SubLSymbol $MAX_STEP;
    private static SubLSymbol $MODE;
    private static SubLSymbol $FORWARD_MAX_TIME;
    private static SubLSymbol $MAX_PROOF_DEPTH;
    private static SubLSymbol $MAX_TRANSFORMATION_DEPTH;
    private static SubLSymbol $MIN_RULE_UTILITY;
    private static SubLSymbol $PROBABLY_APPROXIMATELY_DONE;
    private static SubLSymbol $METRICS_TEMPLATE;
    private static SubLSymbol $START_UNIVERSAL_TIME;
    private static SubLSymbol $START_INTERNAL_REAL_TIME;
    private static SubLSymbol $END_INTERNAL_REAL_TIME;
    private static SubLSymbol $PAD_INTERNAL_REAL_TIME;
    private static SubLSymbol $HYPOTHESIZATION_TIME;
    private static SubLSymbol $CUMULATIVE_TIME;
    private static SubLSymbol $STEP_COUNT;
    private static SubLSymbol $CUMULATIVE_STEP_COUNT;
    private static SubLSymbol $EVENTS;
    private static SubLSymbol $HALT_CONDITIONS;
    private static SubLSymbol $ACCUMULATORS;
    private static SubLSymbol $PROOF_WATERMARK;
    private static SubLSymbol $PROBLEM_WORKING_TIME_DATA;
    private static SubLSymbol $TYPE;
    private static SubLSymbol $DATA;
    private static SubLSymbol $PROPERTIES;
    private static SubLString $str275$Invalid_slot__S_for_construction_;
    private static SubLSymbol $BEGIN;
    private static SubLSymbol $sym277$MAKE_INFERENCE;
    private static SubLSymbol $SLOT;
    private static SubLSymbol $END;
    private static SubLSymbol $sym280$VISIT_DEFSTRUCT_OBJECT_INFERENCE_METHOD;
    private static SubLSymbol $DEAD;
    private static SubLString $str282$_Invalid_INFERENCE__s_;
    private static SubLString $str283$_INFERENCE__a__a__a__s_in__s_;
    private static SubLSymbol $sym284$SXHASH_INFERENCE_METHOD;
    private static SubLSymbol $NEW;
    private static SubLSymbol $PREPARED;
    private static SubLSymbol $READY;
    private static SubLSymbol $RUNNING;
    private static SubLSymbol $SUSPENDED;
    private static SubLList $list290;
    private static SubLSymbol $sym291$DO_SET;
    private static SubLSymbol $sym292$INFERENCE_RELEVANT_PROBLEMS;
    private static SubLList $list293;
    private static SubLSymbol $sym294$DO_QUEUE_ELEMENTS;
    private static SubLSymbol $sym295$INFERENCE_NEW_ANSWER_JUSTIFICATIONS;
    private static SubLList $list296;
    private static SubLSymbol $sym297$START_ID;
    private static SubLSymbol $sym298$END_ID;
    private static SubLSymbol $sym299$ID;
    private static SubLSymbol $sym300$INF;
    private static SubLSymbol $sym301$CLET;
    private static SubLSymbol $sym302$INFERENCE_NEW_ANSWER_ID_START;
    private static SubLSymbol $sym303$INFERENCE_NEXT_NEW_ANSWER_ID;
    private static SubLSymbol $sym304$CDO;
    private static SubLSymbol $sym305$1_;
    private static SubLSymbol $sym306$__;
    private static SubLSymbol $sym307$FIND_INFERENCE_ANSWER_BY_ID;
    private static SubLList $list308;
    private static SubLList $list309;
    private static SubLSymbol $ALLOW_OTHER_KEYS;
    private static SubLSymbol $ORDERED;
    private static SubLSymbol $sym312$ID;
    private static SubLSymbol $sym313$DO_ID_INDEX;
    private static SubLSymbol $sym314$INFERENCE_ANSWER_ID_INDEX;
    private static SubLSymbol $sym315$IGNORE;
    private static SubLList $list316;
    private static SubLSymbol $sym317$START_ID;
    private static SubLSymbol $sym318$END_ID;
    private static SubLSymbol $sym319$ID;
    private static SubLSymbol $sym320$INF;
    private static SubLSymbol $sym321$CSETQ;
    private static SubLSymbol $sym322$ANSWER;
    private static SubLSymbol $sym323$DO_INFERENCE_ANSWERS;
    private static SubLSymbol $sym324$DO_INFERENCE_ANSWER_JUSTIFICATIONS;
    private static SubLList $list325;
    private static SubLSymbol $sym326$DO_QUEUE_DEQUEUE;
    private static SubLSymbol $sym327$INFERENCE_INTERRUPTING_PROCESSES;
    private static SubLList $list328;
    private static SubLList $list329;
    private static SubLSymbol $PROOF_STATUS;
    private static SubLSymbol $sym331$ROOT_PROBLEM;
    private static SubLSymbol $sym332$INFERENCE_ROOT_PROBLEM;
    private static SubLSymbol $sym333$PWHEN;
    private static SubLSymbol $sym334$DO_PROBLEM_PROOFS;
    private static SubLList $list335;
    private static SubLList $list336;
    private static SubLSymbol $DONE;
    private static SubLSymbol $sym338$INFERENCE_ALLOWED_RULES;
    private static SubLList $list339;
    private static SubLSymbol $sym340$WITH_LOCK_HELD;
    private static SubLSymbol $sym341$INFERENCE_PROBLEM_WORKING_TIME_LOCK;
    private static SubLSymbol $sym342$PROBLEM_STORE_P;
    private static SubLSymbol $TAUTOLOGY;
    private static SubLSymbol $IGNORE_ERRORS_TARGET;
    private static SubLSymbol $sym345$IGNORE_ERRORS_HANDLER;
    private static SubLSymbol $FREE;
    private static SubLSymbol $sym347$DO_INFERENCE_NEW_ANSWERS;
    private static SubLSymbol $sym348$DO_INFERENCE_NEW_ANSWER_JUSTIFICATIONS;
    private static SubLSymbol $sym349$FORWARD_PROPAGATE_P;
    private static SubLSymbol $sym350$POSSIBLY_MT_P;
    private static SubLSymbol $sym351$POSSIBLY_INFERENCE_SENTENCE_P;
    private static SubLSymbol $sym352$QUERY_PROPERTIES_P;
    private static SubLSymbol $sym353$HLMT_P;
    private static SubLSymbol $sym354$BINDING_LIST_P;
    private static SubLSymbol $sym355$PROBLEM_QUERY_P;
    private static SubLSymbol $sym356$EXPLANATORY_SUBQUERY_SPEC_P;
    private static SubLSymbol $sym357$NON_EXPLANATORY_SUBQUERY_SPEC_P;
    private static SubLSymbol $sym358$LISTP;
    private static SubLSymbol $sym359$INFERENCE_STATUS_P;
    private static SubLSymbol $sym360$INFERENCE_SUSPEND_STATUS_P;
    private static SubLSymbol $sym361$ANSWER_LINK_P;
    private static SubLSymbol $sym362$PROCESSP;
    private static SubLSymbol $sym363$NON_NEGATIVE_INTEGER_P;
    private static SubLSymbol $sym364$INFERENCE_DISJUNCTION_FREE_EL_VARS_POLICY_P;
    private static SubLSymbol $sym365$RESULT_UNIQUENESS_CRITERION_P;
    private static SubLSymbol $sym366$BOOLEANP;
    private static SubLSymbol $sym367$ALLOWED_MODULES_SPEC_P;
    private static SubLSymbol $sym368$INFERENCE_TRANSITIVE_CLOSURE_MODE_P;
    private static SubLSymbol $sym369$INFERENCE_RETURN_TYPE_P;
    private static SubLSymbol $sym370$INFERENCE_ANSWER_LANGUAGE_P;
    private static SubLSymbol $sym371$NON_NEGATIVE_NUMBER_P;
    private static SubLSymbol $sym372$INFERENCE_MODE_P;
    private static SubLString $str373$Forward_max_time__s_cannot_be_gre;
    private static SubLSymbol $sym374$RULE_UTILITY_P;
    private static SubLSymbol $sym375$PROBABILITY_P;
    private static SubLSymbol $sym376$NON_DOTTED_LIST_P;
    private static SubLSymbol $sym377$QUERY_METRIC_P;
    private static SubLSymbol $sym378$UNIVERSAL_TIME_P;
    private static SubLSymbol $sym379$POTENTIALLY_INFINITE_INTEGER_P;
    private static SubLSymbol $sym380$NUMBERP;
    private static SubLSymbol $sym381$INFERENCE_EVENT_TYPE_P;
    private static SubLSymbol $sym382$INFERENCE_HALT_CONDITION_P;
    private static SubLSymbol $sym383$INFERENCE_TYPE_P;
    private static SubLSymbol $sym384$PROPERTY_LIST_P;
    private static SubLList $list385;
    private static SubLSymbol $sym386$INFERENCE_VAR;
    private static SubLSymbol $sym387$INFERENCE_PROBLEM_STORE_SUID;
    private static SubLSymbol $sym388$INFERENCE_SUID;
    private static SubLSymbol $SKIP;
    private static SubLSymbol $sym390$SUCCESSFUL_INFERENCE_P;
    private static SubLSymbol $NEG;
    private static SubLList $list392;
    private static SubLSymbol $sym393$HLMT_EQUAL;
    private static SubLSymbol $POS;
    private static SubLList $list395;
    private static SubLSymbol $sym396$QUERY_PROPERTY_P;
    private static SubLSymbol $sym397$NEW_CYC_QUERY;
    private static SubLString $str398$_new_cyc_query_A;
    private static SubLString $str399$_____A;
    private static SubLString $str400$_A;
    private static SubLString $str401$_____list______;
    private static SubLSymbol $DOWNCASE;
    private static SubLString $str403$_S__find_problem_store_by_id__S__;
    private static SubLSymbol $ALL;
    private static SubLString $str405$_S__list;
    private static SubLString $str406$_________find_object_by_hl_extern;
    private static SubLString $str407$_______;
    private static SubLString $str408$_S__S______;
    private static SubLString $str409$_;
    private static SubLSymbol $PROOF;
    private static SubLSymbol $BINDINGS;
    private static SubLSymbol $NONE;
    private static SubLList $list413;
    private static SubLSymbol $sym414$INFERENCE_ACCUMULATOR_TYPE_P;
    private static SubLSymbol $sym415$ACCUMULATOR_P;
    private static SubLSymbol $sym416$_PAD_TIMES_TO_FIRST_ANSWER_;
    private static SubLSymbol $UNINITIALIZED;
    private static SubLSymbol $POSITIVE_INFINITY;
    private static SubLSymbol $sym419$_;
    private static SubLSymbol $LOOK_NO_DEEPER_FOR_ADDITIONAL_ANSWERS;
    private static SubLString $str421$got_a_null_answer_for__s;
    private static SubLSymbol $GOOD;
    private static SubLSymbol $TACTICAL;
    private static SubLSymbol $NO_GOOD;
    private static SubLSymbol $NEUTRAL;
    private static SubLSymbol $sym426$INFERENCE_STATIC_PROPERTIES_P;
    private static SubLSymbol $sym427$ALLOWED_RULES_SPEC_P;
    private static SubLSymbol $sym428$FORBIDDEN_RULES_SPEC_P;
    private static SubLSymbol $sym429$QUERY_DYNAMIC_PROPERTIES_P;
    private static SubLSymbol $INFERENCE_MODE;
    private static SubLSymbol $sym431$PROBLEM_P;
    private static SubLSymbol $sym432$STRATEGY_P;
    private static SubLSymbol $sym433$INFERENCE_ANSWER_P;
    private static SubLSymbol $sym434$INFERENCE_ANSWER_JUSTIFICATION_P;
    private static SubLString $str435$variables__S_were_removed;
    private static SubLString $str436$variables__S_were_added;
    private static SubLString $str437$variables__S_contain_duplications;
    private static SubLSymbol $SIMPLEST;
    private static SubLSymbol $sym439$SIMPLEST_INFERENCE_P;
    private static SubLSymbol $sym440$STRATEGY_TYPE_P;
    private static SubLSymbol $sym441$INFERENCE_ANSWER;
    private static SubLList $list442;
    private static SubLList $list443;
    private static SubLList $list444;
    private static SubLList $list445;
    private static SubLSymbol $sym446$PRINT_INFERENCE_ANSWER;
    private static SubLSymbol $sym447$INFERENCE_ANSWER_PRINT_FUNCTION_TRAMPOLINE;
    private static SubLList $list448;
    private static SubLSymbol $sym449$INF_ANSWER_SUID;
    private static SubLSymbol $sym450$_CSETF_INF_ANSWER_SUID;
    private static SubLSymbol $sym451$INF_ANSWER_INFERENCE;
    private static SubLSymbol $sym452$_CSETF_INF_ANSWER_INFERENCE;
    private static SubLSymbol $sym453$INF_ANSWER_BINDINGS;
    private static SubLSymbol $sym454$_CSETF_INF_ANSWER_BINDINGS;
    private static SubLSymbol $sym455$INF_ANSWER_JUSTIFICATIONS;
    private static SubLSymbol $sym456$_CSETF_INF_ANSWER_JUSTIFICATIONS;
    private static SubLSymbol $sym457$INF_ANSWER_ELAPSED_CREATION_TIME;
    private static SubLSymbol $sym458$_CSETF_INF_ANSWER_ELAPSED_CREATION_TIME;
    private static SubLSymbol $sym459$INF_ANSWER_STEP_COUNT;
    private static SubLSymbol $sym460$_CSETF_INF_ANSWER_STEP_COUNT;
    private static SubLSymbol $INFERENCE;
    private static SubLSymbol $JUSTIFICATIONS;
    private static SubLSymbol $ELAPSED_CREATION_TIME;
    private static SubLSymbol $sym464$MAKE_INFERENCE_ANSWER;
    private static SubLSymbol $sym465$VISIT_DEFSTRUCT_OBJECT_INFERENCE_ANSWER_METHOD;
    private static SubLString $str466$_Invalid_INFERENCE_ANSWER__s_;
    private static SubLString $str467$_INFERENCE_ANSWER__a_for_INFERENC;
    private static SubLSymbol $sym468$SXHASH_INFERENCE_ANSWER_METHOD;
    private static SubLSymbol $sym469$BINDINGS_P;
    private static SubLList $list470;
    private static SubLSymbol $sym471$DO_LIST;
    private static SubLSymbol $sym472$INFERENCE_ANSWER_JUSTIFICATIONS;
    private static SubLList $list473;
    private static SubLSymbol $sym474$CDOLIST_NUMBERED;
    private static SubLSymbol $sym475$JUSTIFICATION_EQUAL;
    private static SubLSymbol $sym476$INFERENCE_ANSWER_JUSTIFICATION_SUPPORTS;
    private static SubLSymbol $HL;
    private static SubLSymbol $EL;
    private static SubLString $str479$_S_was_not_an_inference_answer_la;
    private static SubLSymbol $sym480$INFERENCE_ANSWER_EL_SENTENCE;
    private static SubLSymbol $sym481$INFERENCE_ANSWER_JUSTIFICATION;
    private static SubLList $list482;
    private static SubLList $list483;
    private static SubLList $list484;
    private static SubLList $list485;
    private static SubLSymbol $sym486$PRINT_INFERENCE_ANSWER_JUSTIFICATION;
    private static SubLSymbol $sym487$INFERENCE_ANSWER_JUSTIFICATION_PRINT_FUNCTION_TRAMPOLINE;
    private static SubLList $list488;
    private static SubLSymbol $sym489$INF_ANS_JUST_ANSWER;
    private static SubLSymbol $sym490$_CSETF_INF_ANS_JUST_ANSWER;
    private static SubLSymbol $sym491$INF_ANS_JUST_SUPPORTS;
    private static SubLSymbol $sym492$_CSETF_INF_ANS_JUST_SUPPORTS;
    private static SubLSymbol $sym493$INF_ANS_JUST_PRAGMA_SUPPORTS;
    private static SubLSymbol $sym494$_CSETF_INF_ANS_JUST_PRAGMA_SUPPORTS;
    private static SubLSymbol $sym495$INF_ANS_JUST_PROOFS;
    private static SubLSymbol $sym496$_CSETF_INF_ANS_JUST_PROOFS;
    private static SubLSymbol $ANSWER;
    private static SubLSymbol $SUPPORTS;
    private static SubLSymbol $PRAGMA_SUPPORTS;
    private static SubLSymbol $PROOFS;
    private static SubLSymbol $sym501$MAKE_INFERENCE_ANSWER_JUSTIFICATION;
    private static SubLSymbol $sym502$VISIT_DEFSTRUCT_OBJECT_INFERENCE_ANSWER_JUSTIFICATION_METHOD;
    private static SubLString $str503$_INF_ANS_JUST__s_;
    private static SubLSymbol $sym504$SXHASH_INFERENCE_ANSWER_JUSTIFICATION_METHOD;
    private static SubLSymbol $sym505$HL_JUSTIFICATION_P;
    private static SubLObject $$Now;
    private static SubLList $list507;
    private static SubLSymbol $sym508$INFERENCE_ANSWER_JUSTIFICATION_PROOFS;
    private static SubLList $list509;
    private static SubLSymbol $sym510$INFERENCE;
    private static SubLSymbol $sym511$ANSWER;
    private static SubLSymbol $sym512$PROOF_VAR;
    private static SubLSymbol $sym513$DO_PROBLEM_SUPPORTED_INFERENCES;
    private static SubLSymbol $sym514$PROOF_SUPPORTED_PROBLEM;
    private static SubLSymbol $sym515$MEMBER_;
    private static SubLList $list516;
    private static SubLList $list517;
    private static SubLSymbol $sym518$ANSWER;
    private static SubLSymbol $sym519$JUSTIFICATION;
    private static SubLSymbol $sym520$PROOF;
    private static SubLSymbol $sym521$DO_INFERENCE_ANSWER_JUSTIFICATION_PROOFS;
    private static SubLSymbol $sym522$DO_PROOF_ALL_SUBPROOFS;
    private static SubLSymbol $sym523$RULE_ASSERTION_;
    private static SubLSymbol $sym524$PROOF_P;
    private static SubLSymbol $TV;
    private static SubLSymbol $TRUE;
    private static SubLSymbol $FALSE;
    private static SubLSymbol $sym528$INFERENCE_METRICS;
    private static SubLSymbol $sym529$INFERENCE_QUERY_METRIC_P;
    private static SubLSymbol $sym530$TERM__;
    private static SubLSymbol $sym531$CAR;
    private static SubLSymbol $NEW_ROOT_TIMES;
    private static SubLSymbol $NEW_ROOT_COUNT;
    private static SubLSymbol $PROBLEM_CREATION_TIMES;
    private static SubLSymbol $INFERENCE_ANSWER_QUERY_PROPERTIES;
    private static SubLSymbol $INFERENCE_STRONGEST_QUERY_PROPERTIES;
    private static SubLSymbol $INFERENCE_MOST_EFFICIENT_QUERY_PROPERTIES;
    private static SubLSymbol $INFERENCE_IDS;
    private static SubLString $str539$time_to_implement_metric__S;
    private static SubLSymbol $sym540$PROOF_SUID;
    private static SubLSymbol $sym541$_;
    private static SubLSymbol $sym542$CDR;
    private static SubLList $list543;
    private static SubLSymbol $sym544$INFERENCE_VAR;
    private static SubLSymbol $sym545$WITH_INFERENCE_PROBLEM_WORKING_TIME_LOCK;
    private static SubLSymbol $sym546$INFERENCE_PROBLEM_WORKING_TIME_TABLE;
    private static SubLString $str547$Inference_problem_working_time_lo;
    private static SubLSymbol $NEW_ANSWER;
    private static SubLSymbol $STATUS_CHANGE;
    private static SubLSymbol $NEW_TRANSFORMATION_DEPTH_REACHED;
    private static SubLSymbol $sym551$INFERENCES_VAR;
    private static SubLSymbol $sym552$INFERENCE_VAR;
    private static SubLSymbol $sym553$TACTIC_VAR;
    private static SubLSymbol $sym554$START_TIME;
    private static SubLList $list555;
    private static SubLList $list556;
    private static SubLList $list557;
    private static SubLSymbol $sym558$CUNWIND_PROTECT;
    private static SubLSymbol $sym559$PROGN;
    private static SubLSymbol $sym560$POSSIBLY_SIGNAL_SKSI_QUERY_START;
    private static SubLSymbol $sym561$INFERENCE_TIME_SO_FAR;
    private static SubLList $list562;
    private static SubLSymbol $sym563$POSSIBLY_ADD_INFERENCE_SKSI_QUERY_START_TIME;
    private static SubLSymbol $sym564$POSSIBLY_SIGNAL_SKSI_QUERY_END;
    private static SubLSymbol $sym565$POSSIBLY_INCREMENT_INFERENCE_SKSI_QUERY_TOTAL_TIME;
    private static SubLSymbol $sym566$_;
    private static SubLSymbol $sym567$INFERENCE_WITHIN_SKSI_QUERY_EXECUTION;
    private static SubLSymbol $START_TIME;
    private static SubLSymbol $START;
    private static SubLSymbol $END_TIME;
    private static SubLSymbol $SKSI_QUERY_TOTAL_TIME;
    private static SubLSymbol $SKSI_QUERY_START_TIMES;
    private static SubLSymbol $SKSI_QUERY;
    private static SubLList $list574;
    private static SubLList $list575;
    private static SubLSymbol $SPARQL;
    private static SubLSymbol $RESULT_SET;
    private static SubLSymbol $sym578$INFERENCES;
    private static SubLSymbol $sym579$INFERENCE;
    private static SubLSymbol $sym580$START;
    private static SubLSymbol $sym581$END;
    private static SubLSymbol $sym582$COUNT;
    private static SubLSymbol $sym583$LAST_ONE;
    private static SubLSymbol $sym584$FWHEN;
    private static SubLSymbol $sym585$INFERENCE_CUMULATIVE_TIME_SO_FAR;
    private static SubLSymbol $sym586$LENGTH;
    private static SubLSymbol $sym587$POSSIBLY_ADD_INFERENCE_SPARQL_QUERY_PROFILE;
    private static SubLSymbol $sym588$INFERENCE_WITHIN_SPARQL_QUERY_EXECUTION;
    private static SubLSymbol $SPARQL_QUERY_PROFILE;
    private static SubLSymbol $SKSI_QUERY_TOTAL_TIME_ACC;
    private static SubLSymbol $SKSI_QUERY_START_TIMES_ACC;
    private static SubLSymbol $SPARQL_QUERY_PROFILE_ACC;

    @SubL(source = "cycl/inference/harness/inference-datastructures-inference.lisp", position = 1300L)
    public static SubLObject inference_type_p(SubLObject v_object) {
        return subl_promotions.memberP(v_object, $inference_types$.getGlobalValue(), Symbols.symbol_function(EQ), UNPROVIDED);
    }

    @SubL(source = "cycl/inference/harness/inference-datastructures-inference.lisp", position = 3500L)
    public static SubLObject inference_print_function_trampoline(SubLObject v_object, SubLObject stream) {
        print_inference(v_object, stream, ZERO_INTEGER);
        return NIL;
    }

    @SubL(source = "cycl/inference/harness/inference-datastructures-inference.lisp", position = 3500L)
    public static SubLObject inference_p(SubLObject v_object) {
        return (v_object.getClass() == $inference_native.class) ? T : NIL;
    }

    @SubL(source = "cycl/inference/harness/inference-datastructures-inference.lisp", position = 3500L)
    public static SubLObject infrnc_suid(SubLObject v_object) {
        assert NIL != inference_p(v_object) : v_object;
        return v_object.getField2();
    }

    @SubL(source = "cycl/inference/harness/inference-datastructures-inference.lisp", position = 3500L)
    public static SubLObject infrnc_problem_store(SubLObject v_object) {
        assert NIL != inference_p(v_object) : v_object;
        return v_object.getField3();
    }

    @SubL(source = "cycl/inference/harness/inference-datastructures-inference.lisp", position = 3500L)
    public static SubLObject infrnc_forward_propagate(SubLObject v_object) {
        assert NIL != inference_p(v_object) : v_object;
        return v_object.getField4();
    }

    @SubL(source = "cycl/inference/harness/inference-datastructures-inference.lisp", position = 3500L)
    public static SubLObject infrnc_input_mt(SubLObject v_object) {
        assert NIL != inference_p(v_object) : v_object;
        return v_object.getField5();
    }

    @SubL(source = "cycl/inference/harness/inference-datastructures-inference.lisp", position = 3500L)
    public static SubLObject infrnc_input_el_query(SubLObject v_object) {
        assert NIL != inference_p(v_object) : v_object;
        return v_object.getField6();
    }

    @SubL(source = "cycl/inference/harness/inference-datastructures-inference.lisp", position = 3500L)
    public static SubLObject infrnc_input_non_explanatory_el_query(SubLObject v_object) {
        assert NIL != inference_p(v_object) : v_object;
        return v_object.getField7();
    }

    @SubL(source = "cycl/inference/harness/inference-datastructures-inference.lisp", position = 3500L)
    public static SubLObject infrnc_input_query_properties(SubLObject v_object) {
        assert NIL != inference_p(v_object) : v_object;
        return v_object.getField8();
    }

    @SubL(source = "cycl/inference/harness/inference-datastructures-inference.lisp", position = 3500L)
    public static SubLObject infrnc_mt(SubLObject v_object) {
        assert NIL != inference_p(v_object) : v_object;
        return v_object.getField9();
    }

    @SubL(source = "cycl/inference/harness/inference-datastructures-inference.lisp", position = 3500L)
    public static SubLObject infrnc_el_query(SubLObject v_object) {
        assert NIL != inference_p(v_object) : v_object;
        return v_object.getField10();
    }

    @SubL(source = "cycl/inference/harness/inference-datastructures-inference.lisp", position = 3500L)
    public static SubLObject infrnc_el_bindings(SubLObject v_object) {
        assert NIL != inference_p(v_object) : v_object;
        return v_object.getField11();
    }

    @SubL(source = "cycl/inference/harness/inference-datastructures-inference.lisp", position = 3500L)
    public static SubLObject infrnc_hl_query(SubLObject v_object) {
        assert NIL != inference_p(v_object) : v_object;
        return v_object.getField12();
    }

    @SubL(source = "cycl/inference/harness/inference-datastructures-inference.lisp", position = 3500L)
    public static SubLObject infrnc_explanatory_subquery(SubLObject v_object) {
        assert NIL != inference_p(v_object) : v_object;
        return v_object.getField13();
    }

    @SubL(source = "cycl/inference/harness/inference-datastructures-inference.lisp", position = 3500L)
    public static SubLObject infrnc_non_explanatory_subquery(SubLObject v_object) {
        assert NIL != inference_p(v_object) : v_object;
        return v_object.getField14();
    }

    @SubL(source = "cycl/inference/harness/inference-datastructures-inference.lisp", position = 3500L)
    public static SubLObject infrnc_free_hl_vars(SubLObject v_object) {
        assert NIL != inference_p(v_object) : v_object;
        return v_object.getField15();
    }

    @SubL(source = "cycl/inference/harness/inference-datastructures-inference.lisp", position = 3500L)
    public static SubLObject infrnc_hypothetical_bindings(SubLObject v_object) {
        assert NIL != inference_p(v_object) : v_object;
        return v_object.getField16();
    }

    @SubL(source = "cycl/inference/harness/inference-datastructures-inference.lisp", position = 3500L)
    public static SubLObject infrnc_answer_id_index(SubLObject v_object) {
        assert NIL != inference_p(v_object) : v_object;
        return v_object.getField17();
    }

    @SubL(source = "cycl/inference/harness/inference-datastructures-inference.lisp", position = 3500L)
    public static SubLObject infrnc_answer_bindings_index(SubLObject v_object) {
        assert NIL != inference_p(v_object) : v_object;
        return v_object.getField18();
    }

    @SubL(source = "cycl/inference/harness/inference-datastructures-inference.lisp", position = 3500L)
    public static SubLObject infrnc_new_answer_id_start(SubLObject v_object) {
        assert NIL != inference_p(v_object) : v_object;
        return v_object.getField19();
    }

    @SubL(source = "cycl/inference/harness/inference-datastructures-inference.lisp", position = 3500L)
    public static SubLObject infrnc_new_answer_justifications(SubLObject v_object) {
        assert NIL != inference_p(v_object) : v_object;
        return v_object.getField20();
    }

    @SubL(source = "cycl/inference/harness/inference-datastructures-inference.lisp", position = 3500L)
    public static SubLObject infrnc_status(SubLObject v_object) {
        assert NIL != inference_p(v_object) : v_object;
        return (($inference_native) v_object).$status;
    }

    @SubL(source = "cycl/inference/harness/inference-datastructures-inference.lisp", position = 3500L)
    public static SubLObject infrnc_suspend_status(SubLObject v_object) {
        assert NIL != inference_p(v_object) : v_object;
        return (($inference_native) v_object).$suspend_status;
    }

    @SubL(source = "cycl/inference/harness/inference-datastructures-inference.lisp", position = 3500L)
    public static SubLObject infrnc_root_link(SubLObject v_object) {
        assert NIL != inference_p(v_object) : v_object;
        return (($inference_native) v_object).$root_link;
    }

    @SubL(source = "cycl/inference/harness/inference-datastructures-inference.lisp", position = 3500L)
    public static SubLObject infrnc_relevant_problems(SubLObject v_object) {
        assert NIL != inference_p(v_object) : v_object;
        return (($inference_native) v_object).$relevant_problems;
    }

    @SubL(source = "cycl/inference/harness/inference-datastructures-inference.lisp", position = 3500L)
    public static SubLObject infrnc_strategy_set(SubLObject v_object) {
        assert NIL != inference_p(v_object) : v_object;
        return (($inference_native) v_object).$strategy_set;
    }

    @SubL(source = "cycl/inference/harness/inference-datastructures-inference.lisp", position = 3500L)
    public static SubLObject infrnc_control_process(SubLObject v_object) {
        assert NIL != inference_p(v_object) : v_object;
        return (($inference_native) v_object).$control_process;
    }

    @SubL(source = "cycl/inference/harness/inference-datastructures-inference.lisp", position = 3500L)
    public static SubLObject infrnc_interrupting_processes(SubLObject v_object) {
        assert NIL != inference_p(v_object) : v_object;
        return (($inference_native) v_object).$interrupting_processes;
    }

    @SubL(source = "cycl/inference/harness/inference-datastructures-inference.lisp", position = 3500L)
    public static SubLObject infrnc_max_transformation_depth_reached(SubLObject v_object) {
        assert NIL != inference_p(v_object) : v_object;
        return (($inference_native) v_object).$max_transformation_depth_reached;
    }

    @SubL(source = "cycl/inference/harness/inference-datastructures-inference.lisp", position = 3500L)
    public static SubLObject infrnc_disjunction_free_el_vars_policy(SubLObject v_object) {
        assert NIL != inference_p(v_object) : v_object;
        return (($inference_native) v_object).$disjunction_free_el_vars_policy;
    }

    @SubL(source = "cycl/inference/harness/inference-datastructures-inference.lisp", position = 3500L)
    public static SubLObject infrnc_result_uniqueness_criterion(SubLObject v_object) {
        assert NIL != inference_p(v_object) : v_object;
        return (($inference_native) v_object).$result_uniqueness_criterion;
    }

    @SubL(source = "cycl/inference/harness/inference-datastructures-inference.lisp", position = 3500L)
    public static SubLObject infrnc_allow_hl_predicate_transformationP(SubLObject v_object) {
        assert NIL != inference_p(v_object) : v_object;
        return (($inference_native) v_object).$allow_hl_predicate_transformationP;
    }

    @SubL(source = "cycl/inference/harness/inference-datastructures-inference.lisp", position = 3500L)
    public static SubLObject infrnc_allow_unbound_predicate_transformationP(SubLObject v_object) {
        assert NIL != inference_p(v_object) : v_object;
        return (($inference_native) v_object).$allow_unbound_predicate_transformationP;
    }

    @SubL(source = "cycl/inference/harness/inference-datastructures-inference.lisp", position = 3500L)
    public static SubLObject infrnc_allow_evaluatable_predicate_transformationP(SubLObject v_object) {
        assert NIL != inference_p(v_object) : v_object;
        return (($inference_native) v_object).$allow_evaluatable_predicate_transformationP;
    }

    @SubL(source = "cycl/inference/harness/inference-datastructures-inference.lisp", position = 3500L)
    public static SubLObject infrnc_allow_indeterminate_resultsP(SubLObject v_object) {
        assert NIL != inference_p(v_object) : v_object;
        return (($inference_native) v_object).$allow_indeterminate_resultsP;
    }

    @SubL(source = "cycl/inference/harness/inference-datastructures-inference.lisp", position = 3500L)
    public static SubLObject infrnc_allowed_rules(SubLObject v_object) {
        assert NIL != inference_p(v_object) : v_object;
        return (($inference_native) v_object).$allowed_rules;
    }

    @SubL(source = "cycl/inference/harness/inference-datastructures-inference.lisp", position = 3500L)
    public static SubLObject infrnc_forbidden_rules(SubLObject v_object) {
        assert NIL != inference_p(v_object) : v_object;
        return (($inference_native) v_object).$forbidden_rules;
    }

    @SubL(source = "cycl/inference/harness/inference-datastructures-inference.lisp", position = 3500L)
    public static SubLObject infrnc_allowed_modules(SubLObject v_object) {
        assert NIL != inference_p(v_object) : v_object;
        return (($inference_native) v_object).$allowed_modules;
    }

    @SubL(source = "cycl/inference/harness/inference-datastructures-inference.lisp", position = 3500L)
    public static SubLObject infrnc_allow_abnormality_checkingP(SubLObject v_object) {
        assert NIL != inference_p(v_object) : v_object;
        return (($inference_native) v_object).$allow_abnormality_checkingP;
    }

    @SubL(source = "cycl/inference/harness/inference-datastructures-inference.lisp", position = 3500L)
    public static SubLObject infrnc_transitive_closure_mode(SubLObject v_object) {
        assert NIL != inference_p(v_object) : v_object;
        return (($inference_native) v_object).$transitive_closure_mode;
    }

    @SubL(source = "cycl/inference/harness/inference-datastructures-inference.lisp", position = 3500L)
    public static SubLObject infrnc_problem_store_privateP(SubLObject v_object) {
        assert NIL != inference_p(v_object) : v_object;
        return (($inference_native) v_object).$problem_store_privateP;
    }

    @SubL(source = "cycl/inference/harness/inference-datastructures-inference.lisp", position = 3500L)
    public static SubLObject infrnc_continuableP(SubLObject v_object) {
        assert NIL != inference_p(v_object) : v_object;
        return (($inference_native) v_object).$continuableP;
    }

    @SubL(source = "cycl/inference/harness/inference-datastructures-inference.lisp", position = 3500L)
    public static SubLObject infrnc_browsableP(SubLObject v_object) {
        assert NIL != inference_p(v_object) : v_object;
        return (($inference_native) v_object).$browsableP;
    }

    @SubL(source = "cycl/inference/harness/inference-datastructures-inference.lisp", position = 3500L)
    public static SubLObject infrnc_return_type(SubLObject v_object) {
        assert NIL != inference_p(v_object) : v_object;
        return (($inference_native) v_object).$return_type;
    }

    @SubL(source = "cycl/inference/harness/inference-datastructures-inference.lisp", position = 3500L)
    public static SubLObject infrnc_answer_language(SubLObject v_object) {
        assert NIL != inference_p(v_object) : v_object;
        return (($inference_native) v_object).$answer_language;
    }

    @SubL(source = "cycl/inference/harness/inference-datastructures-inference.lisp", position = 3500L)
    public static SubLObject infrnc_cache_resultsP(SubLObject v_object) {
        assert NIL != inference_p(v_object) : v_object;
        return (($inference_native) v_object).$cache_resultsP;
    }

    @SubL(source = "cycl/inference/harness/inference-datastructures-inference.lisp", position = 3500L)
    public static SubLObject infrnc_blockingP(SubLObject v_object) {
        assert NIL != inference_p(v_object) : v_object;
        return (($inference_native) v_object).$blockingP;
    }

    @SubL(source = "cycl/inference/harness/inference-datastructures-inference.lisp", position = 3500L)
    public static SubLObject infrnc_max_number(SubLObject v_object) {
        assert NIL != inference_p(v_object) : v_object;
        return (($inference_native) v_object).$max_number;
    }

    @SubL(source = "cycl/inference/harness/inference-datastructures-inference.lisp", position = 3500L)
    public static SubLObject infrnc_max_time(SubLObject v_object) {
        assert NIL != inference_p(v_object) : v_object;
        return (($inference_native) v_object).$max_time;
    }

    @SubL(source = "cycl/inference/harness/inference-datastructures-inference.lisp", position = 3500L)
    public static SubLObject infrnc_max_step(SubLObject v_object) {
        assert NIL != inference_p(v_object) : v_object;
        return (($inference_native) v_object).$max_step;
    }

    @SubL(source = "cycl/inference/harness/inference-datastructures-inference.lisp", position = 3500L)
    public static SubLObject infrnc_mode(SubLObject v_object) {
        assert NIL != inference_p(v_object) : v_object;
        return (($inference_native) v_object).$mode;
    }

    @SubL(source = "cycl/inference/harness/inference-datastructures-inference.lisp", position = 3500L)
    public static SubLObject infrnc_forward_max_time(SubLObject v_object) {
        assert NIL != inference_p(v_object) : v_object;
        return (($inference_native) v_object).$forward_max_time;
    }

    @SubL(source = "cycl/inference/harness/inference-datastructures-inference.lisp", position = 3500L)
    public static SubLObject infrnc_max_proof_depth(SubLObject v_object) {
        assert NIL != inference_p(v_object) : v_object;
        return (($inference_native) v_object).$max_proof_depth;
    }

    @SubL(source = "cycl/inference/harness/inference-datastructures-inference.lisp", position = 3500L)
    public static SubLObject infrnc_max_transformation_depth(SubLObject v_object) {
        assert NIL != inference_p(v_object) : v_object;
        return (($inference_native) v_object).$max_transformation_depth;
    }

    @SubL(source = "cycl/inference/harness/inference-datastructures-inference.lisp", position = 3500L)
    public static SubLObject infrnc_min_rule_utility(SubLObject v_object) {
        assert NIL != inference_p(v_object) : v_object;
        return (($inference_native) v_object).$min_rule_utility;
    }

    @SubL(source = "cycl/inference/harness/inference-datastructures-inference.lisp", position = 3500L)
    public static SubLObject infrnc_probably_approximately_done(SubLObject v_object) {
        assert NIL != inference_p(v_object) : v_object;
        return (($inference_native) v_object).$probably_approximately_done;
    }

    @SubL(source = "cycl/inference/harness/inference-datastructures-inference.lisp", position = 3500L)
    public static SubLObject infrnc_metrics_template(SubLObject v_object) {
        assert NIL != inference_p(v_object) : v_object;
        return (($inference_native) v_object).$metrics_template;
    }

    @SubL(source = "cycl/inference/harness/inference-datastructures-inference.lisp", position = 3500L)
    public static SubLObject infrnc_start_universal_time(SubLObject v_object) {
        assert NIL != inference_p(v_object) : v_object;
        return (($inference_native) v_object).$start_universal_time;
    }

    @SubL(source = "cycl/inference/harness/inference-datastructures-inference.lisp", position = 3500L)
    public static SubLObject infrnc_start_internal_real_time(SubLObject v_object) {
        assert NIL != inference_p(v_object) : v_object;
        return (($inference_native) v_object).$start_internal_real_time;
    }

    @SubL(source = "cycl/inference/harness/inference-datastructures-inference.lisp", position = 3500L)
    public static SubLObject infrnc_end_internal_real_time(SubLObject v_object) {
        assert NIL != inference_p(v_object) : v_object;
        return (($inference_native) v_object).$end_internal_real_time;
    }

    @SubL(source = "cycl/inference/harness/inference-datastructures-inference.lisp", position = 3500L)
    public static SubLObject infrnc_pad_internal_real_time(SubLObject v_object) {
        assert NIL != inference_p(v_object) : v_object;
        return (($inference_native) v_object).$pad_internal_real_time;
    }

    @SubL(source = "cycl/inference/harness/inference-datastructures-inference.lisp", position = 3500L)
    public static SubLObject infrnc_hypothesization_time(SubLObject v_object) {
        assert NIL != inference_p(v_object) : v_object;
        return (($inference_native) v_object).$hypothesization_time;
    }

    @SubL(source = "cycl/inference/harness/inference-datastructures-inference.lisp", position = 3500L)
    public static SubLObject infrnc_cumulative_time(SubLObject v_object) {
        assert NIL != inference_p(v_object) : v_object;
        return (($inference_native) v_object).$cumulative_time;
    }

    @SubL(source = "cycl/inference/harness/inference-datastructures-inference.lisp", position = 3500L)
    public static SubLObject infrnc_step_count(SubLObject v_object) {
        assert NIL != inference_p(v_object) : v_object;
        return (($inference_native) v_object).$step_count;
    }

    @SubL(source = "cycl/inference/harness/inference-datastructures-inference.lisp", position = 3500L)
    public static SubLObject infrnc_cumulative_step_count(SubLObject v_object) {
        assert NIL != inference_p(v_object) : v_object;
        return (($inference_native) v_object).$cumulative_step_count;
    }

    @SubL(source = "cycl/inference/harness/inference-datastructures-inference.lisp", position = 3500L)
    public static SubLObject infrnc_events(SubLObject v_object) {
        assert NIL != inference_p(v_object) : v_object;
        return (($inference_native) v_object).$events;
    }

    @SubL(source = "cycl/inference/harness/inference-datastructures-inference.lisp", position = 3500L)
    public static SubLObject infrnc_halt_conditions(SubLObject v_object) {
        assert NIL != inference_p(v_object) : v_object;
        return (($inference_native) v_object).$halt_conditions;
    }

    @SubL(source = "cycl/inference/harness/inference-datastructures-inference.lisp", position = 3500L)
    public static SubLObject infrnc_accumulators(SubLObject v_object) {
        assert NIL != inference_p(v_object) : v_object;
        return (($inference_native) v_object).$accumulators;
    }

    @SubL(source = "cycl/inference/harness/inference-datastructures-inference.lisp", position = 3500L)
    public static SubLObject infrnc_proof_watermark(SubLObject v_object) {
        assert NIL != inference_p(v_object) : v_object;
        return (($inference_native) v_object).$proof_watermark;
    }

    @SubL(source = "cycl/inference/harness/inference-datastructures-inference.lisp", position = 3500L)
    public static SubLObject infrnc_problem_working_time_data(SubLObject v_object) {
        assert NIL != inference_p(v_object) : v_object;
        return (($inference_native) v_object).$problem_working_time_data;
    }

    @SubL(source = "cycl/inference/harness/inference-datastructures-inference.lisp", position = 3500L)
    public static SubLObject infrnc_type(SubLObject v_object) {
        assert NIL != inference_p(v_object) : v_object;
        return (($inference_native) v_object).$type;
    }

    @SubL(source = "cycl/inference/harness/inference-datastructures-inference.lisp", position = 3500L)
    public static SubLObject infrnc_data(SubLObject v_object) {
        assert NIL != inference_p(v_object) : v_object;
        return (($inference_native) v_object).$data;
    }

    @SubL(source = "cycl/inference/harness/inference-datastructures-inference.lisp", position = 3500L)
    public static SubLObject infrnc_properties(SubLObject v_object) {
        assert NIL != inference_p(v_object) : v_object;
        return (($inference_native) v_object).$properties;
    }

    @SubL(source = "cycl/inference/harness/inference-datastructures-inference.lisp", position = 3500L)
    public static SubLObject _csetf_infrnc_suid(SubLObject v_object, SubLObject value) {
        assert NIL != inference_p(v_object) : v_object;
        return v_object.setField2(value);
    }

    @SubL(source = "cycl/inference/harness/inference-datastructures-inference.lisp", position = 3500L)
    public static SubLObject _csetf_infrnc_problem_store(SubLObject v_object, SubLObject value) {
        assert NIL != inference_p(v_object) : v_object;
        return v_object.setField3(value);
    }

    @SubL(source = "cycl/inference/harness/inference-datastructures-inference.lisp", position = 3500L)
    public static SubLObject _csetf_infrnc_forward_propagate(SubLObject v_object, SubLObject value) {
        assert NIL != inference_p(v_object) : v_object;
        return v_object.setField4(value);
    }

    @SubL(source = "cycl/inference/harness/inference-datastructures-inference.lisp", position = 3500L)
    public static SubLObject _csetf_infrnc_input_mt(SubLObject v_object, SubLObject value) {
        assert NIL != inference_p(v_object) : v_object;
        return v_object.setField5(value);
    }

    @SubL(source = "cycl/inference/harness/inference-datastructures-inference.lisp", position = 3500L)
    public static SubLObject _csetf_infrnc_input_el_query(SubLObject v_object, SubLObject value) {
        assert NIL != inference_p(v_object) : v_object;
        return v_object.setField6(value);
    }

    @SubL(source = "cycl/inference/harness/inference-datastructures-inference.lisp", position = 3500L)
    public static SubLObject _csetf_infrnc_input_non_explanatory_el_query(SubLObject v_object, SubLObject value) {
        assert NIL != inference_p(v_object) : v_object;
        return v_object.setField7(value);
    }

    @SubL(source = "cycl/inference/harness/inference-datastructures-inference.lisp", position = 3500L)
    public static SubLObject _csetf_infrnc_input_query_properties(SubLObject v_object, SubLObject value) {
        assert NIL != inference_p(v_object) : v_object;
        return v_object.setField8(value);
    }

    @SubL(source = "cycl/inference/harness/inference-datastructures-inference.lisp", position = 3500L)
    public static SubLObject _csetf_infrnc_mt(SubLObject v_object, SubLObject value) {
        assert NIL != inference_p(v_object) : v_object;
        return v_object.setField9(value);
    }

    @SubL(source = "cycl/inference/harness/inference-datastructures-inference.lisp", position = 3500L)
    public static SubLObject _csetf_infrnc_el_query(SubLObject v_object, SubLObject value) {
        assert NIL != inference_p(v_object) : v_object;
        return v_object.setField10(value);
    }

    @SubL(source = "cycl/inference/harness/inference-datastructures-inference.lisp", position = 3500L)
    public static SubLObject _csetf_infrnc_el_bindings(SubLObject v_object, SubLObject value) {
        assert NIL != inference_p(v_object) : v_object;
        return v_object.setField11(value);
    }

    @SubL(source = "cycl/inference/harness/inference-datastructures-inference.lisp", position = 3500L)
    public static SubLObject _csetf_infrnc_hl_query(SubLObject v_object, SubLObject value) {
        assert NIL != inference_p(v_object) : v_object;
        return v_object.setField12(value);
    }

    @SubL(source = "cycl/inference/harness/inference-datastructures-inference.lisp", position = 3500L)
    public static SubLObject _csetf_infrnc_explanatory_subquery(SubLObject v_object, SubLObject value) {
        assert NIL != inference_p(v_object) : v_object;
        return v_object.setField13(value);
    }

    @SubL(source = "cycl/inference/harness/inference-datastructures-inference.lisp", position = 3500L)
    public static SubLObject _csetf_infrnc_non_explanatory_subquery(SubLObject v_object, SubLObject value) {
        assert NIL != inference_p(v_object) : v_object;
        return v_object.setField14(value);
    }

    @SubL(source = "cycl/inference/harness/inference-datastructures-inference.lisp", position = 3500L)
    public static SubLObject _csetf_infrnc_free_hl_vars(SubLObject v_object, SubLObject value) {
        assert NIL != inference_p(v_object) : v_object;
        return v_object.setField15(value);
    }

    @SubL(source = "cycl/inference/harness/inference-datastructures-inference.lisp", position = 3500L)
    public static SubLObject _csetf_infrnc_hypothetical_bindings(SubLObject v_object, SubLObject value) {
        assert NIL != inference_p(v_object) : v_object;
        return v_object.setField16(value);
    }

    @SubL(source = "cycl/inference/harness/inference-datastructures-inference.lisp", position = 3500L)
    public static SubLObject _csetf_infrnc_answer_id_index(SubLObject v_object, SubLObject value) {
        assert NIL != inference_p(v_object) : v_object;
        return v_object.setField17(value);
    }

    @SubL(source = "cycl/inference/harness/inference-datastructures-inference.lisp", position = 3500L)
    public static SubLObject _csetf_infrnc_answer_bindings_index(SubLObject v_object, SubLObject value) {
        assert NIL != inference_p(v_object) : v_object;
        return v_object.setField18(value);
    }

    @SubL(source = "cycl/inference/harness/inference-datastructures-inference.lisp", position = 3500L)
    public static SubLObject _csetf_infrnc_new_answer_id_start(SubLObject v_object, SubLObject value) {
        assert NIL != inference_p(v_object) : v_object;
        return v_object.setField19(value);
    }

    @SubL(source = "cycl/inference/harness/inference-datastructures-inference.lisp", position = 3500L)
    public static SubLObject _csetf_infrnc_new_answer_justifications(SubLObject v_object, SubLObject value) {
        assert NIL != inference_p(v_object) : v_object;
        return v_object.setField20(value);
    }

    @SubL(source = "cycl/inference/harness/inference-datastructures-inference.lisp", position = 3500L)
    public static SubLObject _csetf_infrnc_status(SubLObject v_object, SubLObject value) {
        assert NIL != inference_p(v_object) : v_object;
        return (($inference_native) v_object).$status = value;
    }

    @SubL(source = "cycl/inference/harness/inference-datastructures-inference.lisp", position = 3500L)
    public static SubLObject _csetf_infrnc_suspend_status(SubLObject v_object, SubLObject value) {
        assert NIL != inference_p(v_object) : v_object;
        return (($inference_native) v_object).$suspend_status = value;
    }

    @SubL(source = "cycl/inference/harness/inference-datastructures-inference.lisp", position = 3500L)
    public static SubLObject _csetf_infrnc_root_link(SubLObject v_object, SubLObject value) {
        assert NIL != inference_p(v_object) : v_object;
        return (($inference_native) v_object).$root_link = value;
    }

    @SubL(source = "cycl/inference/harness/inference-datastructures-inference.lisp", position = 3500L)
    public static SubLObject _csetf_infrnc_relevant_problems(SubLObject v_object, SubLObject value) {
        assert NIL != inference_p(v_object) : v_object;
        return (($inference_native) v_object).$relevant_problems = value;
    }

    @SubL(source = "cycl/inference/harness/inference-datastructures-inference.lisp", position = 3500L)
    public static SubLObject _csetf_infrnc_strategy_set(SubLObject v_object, SubLObject value) {
        assert NIL != inference_p(v_object) : v_object;
        return (($inference_native) v_object).$strategy_set = value;
    }

    @SubL(source = "cycl/inference/harness/inference-datastructures-inference.lisp", position = 3500L)
    public static SubLObject _csetf_infrnc_control_process(SubLObject v_object, SubLObject value) {
        assert NIL != inference_p(v_object) : v_object;
        return (($inference_native) v_object).$control_process = value;
    }

    @SubL(source = "cycl/inference/harness/inference-datastructures-inference.lisp", position = 3500L)
    public static SubLObject _csetf_infrnc_interrupting_processes(SubLObject v_object, SubLObject value) {
        assert NIL != inference_p(v_object) : v_object;
        return (($inference_native) v_object).$interrupting_processes = value;
    }

    @SubL(source = "cycl/inference/harness/inference-datastructures-inference.lisp", position = 3500L)
    public static SubLObject _csetf_infrnc_max_transformation_depth_reached(SubLObject v_object, SubLObject value) {
        assert NIL != inference_p(v_object) : v_object;
        return (($inference_native) v_object).$max_transformation_depth_reached = value;
    }

    @SubL(source = "cycl/inference/harness/inference-datastructures-inference.lisp", position = 3500L)
    public static SubLObject _csetf_infrnc_disjunction_free_el_vars_policy(SubLObject v_object, SubLObject value) {
        assert NIL != inference_p(v_object) : v_object;
        return (($inference_native) v_object).$disjunction_free_el_vars_policy = value;
    }

    @SubL(source = "cycl/inference/harness/inference-datastructures-inference.lisp", position = 3500L)
    public static SubLObject _csetf_infrnc_result_uniqueness_criterion(SubLObject v_object, SubLObject value) {
        assert NIL != inference_p(v_object) : v_object;
        return (($inference_native) v_object).$result_uniqueness_criterion = value;
    }

    @SubL(source = "cycl/inference/harness/inference-datastructures-inference.lisp", position = 3500L)
    public static SubLObject _csetf_infrnc_allow_hl_predicate_transformationP(SubLObject v_object, SubLObject value) {
        assert NIL != inference_p(v_object) : v_object;
        return (($inference_native) v_object).$allow_hl_predicate_transformationP = value;
    }

    @SubL(source = "cycl/inference/harness/inference-datastructures-inference.lisp", position = 3500L)
    public static SubLObject _csetf_infrnc_allow_unbound_predicate_transformationP(SubLObject v_object, SubLObject value) {
        assert NIL != inference_p(v_object) : v_object;
        return (($inference_native) v_object).$allow_unbound_predicate_transformationP = value;
    }

    @SubL(source = "cycl/inference/harness/inference-datastructures-inference.lisp", position = 3500L)
    public static SubLObject _csetf_infrnc_allow_evaluatable_predicate_transformationP(SubLObject v_object, SubLObject value) {
        assert NIL != inference_p(v_object) : v_object;
        return (($inference_native) v_object).$allow_evaluatable_predicate_transformationP = value;
    }

    @SubL(source = "cycl/inference/harness/inference-datastructures-inference.lisp", position = 3500L)
    public static SubLObject _csetf_infrnc_allow_indeterminate_resultsP(SubLObject v_object, SubLObject value) {
        assert NIL != inference_p(v_object) : v_object;
        return (($inference_native) v_object).$allow_indeterminate_resultsP = value;
    }

    @SubL(source = "cycl/inference/harness/inference-datastructures-inference.lisp", position = 3500L)
    public static SubLObject _csetf_infrnc_allowed_rules(SubLObject v_object, SubLObject value) {
        assert NIL != inference_p(v_object) : v_object;
        return (($inference_native) v_object).$allowed_rules = value;
    }

    @SubL(source = "cycl/inference/harness/inference-datastructures-inference.lisp", position = 3500L)
    public static SubLObject _csetf_infrnc_forbidden_rules(SubLObject v_object, SubLObject value) {
        assert NIL != inference_p(v_object) : v_object;
        return (($inference_native) v_object).$forbidden_rules = value;
    }

    @SubL(source = "cycl/inference/harness/inference-datastructures-inference.lisp", position = 3500L)
    public static SubLObject _csetf_infrnc_allowed_modules(SubLObject v_object, SubLObject value) {
        assert NIL != inference_p(v_object) : v_object;
        return (($inference_native) v_object).$allowed_modules = value;
    }

    @SubL(source = "cycl/inference/harness/inference-datastructures-inference.lisp", position = 3500L)
    public static SubLObject _csetf_infrnc_allow_abnormality_checkingP(SubLObject v_object, SubLObject value) {
        assert NIL != inference_p(v_object) : v_object;
        return (($inference_native) v_object).$allow_abnormality_checkingP = value;
    }

    @SubL(source = "cycl/inference/harness/inference-datastructures-inference.lisp", position = 3500L)
    public static SubLObject _csetf_infrnc_transitive_closure_mode(SubLObject v_object, SubLObject value) {
        assert NIL != inference_p(v_object) : v_object;
        return (($inference_native) v_object).$transitive_closure_mode = value;
    }

    @SubL(source = "cycl/inference/harness/inference-datastructures-inference.lisp", position = 3500L)
    public static SubLObject _csetf_infrnc_problem_store_privateP(SubLObject v_object, SubLObject value) {
        assert NIL != inference_p(v_object) : v_object;
        return (($inference_native) v_object).$problem_store_privateP = value;
    }

    @SubL(source = "cycl/inference/harness/inference-datastructures-inference.lisp", position = 3500L)
    public static SubLObject _csetf_infrnc_continuableP(SubLObject v_object, SubLObject value) {
        assert NIL != inference_p(v_object) : v_object;
        return (($inference_native) v_object).$continuableP = value;
    }

    @SubL(source = "cycl/inference/harness/inference-datastructures-inference.lisp", position = 3500L)
    public static SubLObject _csetf_infrnc_browsableP(SubLObject v_object, SubLObject value) {
        assert NIL != inference_p(v_object) : v_object;
        return (($inference_native) v_object).$browsableP = value;
    }

    @SubL(source = "cycl/inference/harness/inference-datastructures-inference.lisp", position = 3500L)
    public static SubLObject _csetf_infrnc_return_type(SubLObject v_object, SubLObject value) {
        assert NIL != inference_p(v_object) : v_object;
        return (($inference_native) v_object).$return_type = value;
    }

    @SubL(source = "cycl/inference/harness/inference-datastructures-inference.lisp", position = 3500L)
    public static SubLObject _csetf_infrnc_answer_language(SubLObject v_object, SubLObject value) {
        assert NIL != inference_p(v_object) : v_object;
        return (($inference_native) v_object).$answer_language = value;
    }

    @SubL(source = "cycl/inference/harness/inference-datastructures-inference.lisp", position = 3500L)
    public static SubLObject _csetf_infrnc_cache_resultsP(SubLObject v_object, SubLObject value) {
        assert NIL != inference_p(v_object) : v_object;
        return (($inference_native) v_object).$cache_resultsP = value;
    }

    @SubL(source = "cycl/inference/harness/inference-datastructures-inference.lisp", position = 3500L)
    public static SubLObject _csetf_infrnc_blockingP(SubLObject v_object, SubLObject value) {
        assert NIL != inference_p(v_object) : v_object;
        return (($inference_native) v_object).$blockingP = value;
    }

    @SubL(source = "cycl/inference/harness/inference-datastructures-inference.lisp", position = 3500L)
    public static SubLObject _csetf_infrnc_max_number(SubLObject v_object, SubLObject value) {
        assert NIL != inference_p(v_object) : v_object;
        return (($inference_native) v_object).$max_number = value;
    }

    @SubL(source = "cycl/inference/harness/inference-datastructures-inference.lisp", position = 3500L)
    public static SubLObject _csetf_infrnc_max_time(SubLObject v_object, SubLObject value) {
        assert NIL != inference_p(v_object) : v_object;
        return (($inference_native) v_object).$max_time = value;
    }

    @SubL(source = "cycl/inference/harness/inference-datastructures-inference.lisp", position = 3500L)
    public static SubLObject _csetf_infrnc_max_step(SubLObject v_object, SubLObject value) {
        assert NIL != inference_p(v_object) : v_object;
        return (($inference_native) v_object).$max_step = value;
    }

    @SubL(source = "cycl/inference/harness/inference-datastructures-inference.lisp", position = 3500L)
    public static SubLObject _csetf_infrnc_mode(SubLObject v_object, SubLObject value) {
        assert NIL != inference_p(v_object) : v_object;
        return (($inference_native) v_object).$mode = value;
    }

    @SubL(source = "cycl/inference/harness/inference-datastructures-inference.lisp", position = 3500L)
    public static SubLObject _csetf_infrnc_forward_max_time(SubLObject v_object, SubLObject value) {
        assert NIL != inference_p(v_object) : v_object;
        return (($inference_native) v_object).$forward_max_time = value;
    }

    @SubL(source = "cycl/inference/harness/inference-datastructures-inference.lisp", position = 3500L)
    public static SubLObject _csetf_infrnc_max_proof_depth(SubLObject v_object, SubLObject value) {
        assert NIL != inference_p(v_object) : v_object;
        return (($inference_native) v_object).$max_proof_depth = value;
    }

    @SubL(source = "cycl/inference/harness/inference-datastructures-inference.lisp", position = 3500L)
    public static SubLObject _csetf_infrnc_max_transformation_depth(SubLObject v_object, SubLObject value) {
        assert NIL != inference_p(v_object) : v_object;
        return (($inference_native) v_object).$max_transformation_depth = value;
    }

    @SubL(source = "cycl/inference/harness/inference-datastructures-inference.lisp", position = 3500L)
    public static SubLObject _csetf_infrnc_min_rule_utility(SubLObject v_object, SubLObject value) {
        assert NIL != inference_p(v_object) : v_object;
        return (($inference_native) v_object).$min_rule_utility = value;
    }

    @SubL(source = "cycl/inference/harness/inference-datastructures-inference.lisp", position = 3500L)
    public static SubLObject _csetf_infrnc_probably_approximately_done(SubLObject v_object, SubLObject value) {
        assert NIL != inference_p(v_object) : v_object;
        return (($inference_native) v_object).$probably_approximately_done = value;
    }

    @SubL(source = "cycl/inference/harness/inference-datastructures-inference.lisp", position = 3500L)
    public static SubLObject _csetf_infrnc_metrics_template(SubLObject v_object, SubLObject value) {
        assert NIL != inference_p(v_object) : v_object;
        return (($inference_native) v_object).$metrics_template = value;
    }

    @SubL(source = "cycl/inference/harness/inference-datastructures-inference.lisp", position = 3500L)
    public static SubLObject _csetf_infrnc_start_universal_time(SubLObject v_object, SubLObject value) {
        assert NIL != inference_p(v_object) : v_object;
        return (($inference_native) v_object).$start_universal_time = value;
    }

    @SubL(source = "cycl/inference/harness/inference-datastructures-inference.lisp", position = 3500L)
    public static SubLObject _csetf_infrnc_start_internal_real_time(SubLObject v_object, SubLObject value) {
        assert NIL != inference_p(v_object) : v_object;
        return (($inference_native) v_object).$start_internal_real_time = value;
    }

    @SubL(source = "cycl/inference/harness/inference-datastructures-inference.lisp", position = 3500L)
    public static SubLObject _csetf_infrnc_end_internal_real_time(SubLObject v_object, SubLObject value) {
        assert NIL != inference_p(v_object) : v_object;
        return (($inference_native) v_object).$end_internal_real_time = value;
    }

    @SubL(source = "cycl/inference/harness/inference-datastructures-inference.lisp", position = 3500L)
    public static SubLObject _csetf_infrnc_pad_internal_real_time(SubLObject v_object, SubLObject value) {
        assert NIL != inference_p(v_object) : v_object;
        return (($inference_native) v_object).$pad_internal_real_time = value;
    }

    @SubL(source = "cycl/inference/harness/inference-datastructures-inference.lisp", position = 3500L)
    public static SubLObject _csetf_infrnc_hypothesization_time(SubLObject v_object, SubLObject value) {
        assert NIL != inference_p(v_object) : v_object;
        return (($inference_native) v_object).$hypothesization_time = value;
    }

    @SubL(source = "cycl/inference/harness/inference-datastructures-inference.lisp", position = 3500L)
    public static SubLObject _csetf_infrnc_cumulative_time(SubLObject v_object, SubLObject value) {
        assert NIL != inference_p(v_object) : v_object;
        return (($inference_native) v_object).$cumulative_time = value;
    }

    @SubL(source = "cycl/inference/harness/inference-datastructures-inference.lisp", position = 3500L)
    public static SubLObject _csetf_infrnc_step_count(SubLObject v_object, SubLObject value) {
        assert NIL != inference_p(v_object) : v_object;
        return (($inference_native) v_object).$step_count = value;
    }

    @SubL(source = "cycl/inference/harness/inference-datastructures-inference.lisp", position = 3500L)
    public static SubLObject _csetf_infrnc_cumulative_step_count(SubLObject v_object, SubLObject value) {
        assert NIL != inference_p(v_object) : v_object;
        return (($inference_native) v_object).$cumulative_step_count = value;
    }

    @SubL(source = "cycl/inference/harness/inference-datastructures-inference.lisp", position = 3500L)
    public static SubLObject _csetf_infrnc_events(SubLObject v_object, SubLObject value) {
        assert NIL != inference_p(v_object) : v_object;
        return (($inference_native) v_object).$events = value;
    }

    @SubL(source = "cycl/inference/harness/inference-datastructures-inference.lisp", position = 3500L)
    public static SubLObject _csetf_infrnc_halt_conditions(SubLObject v_object, SubLObject value) {
        assert NIL != inference_p(v_object) : v_object;
        return (($inference_native) v_object).$halt_conditions = value;
    }

    @SubL(source = "cycl/inference/harness/inference-datastructures-inference.lisp", position = 3500L)
    public static SubLObject _csetf_infrnc_accumulators(SubLObject v_object, SubLObject value) {
        assert NIL != inference_p(v_object) : v_object;
        return (($inference_native) v_object).$accumulators = value;
    }

    @SubL(source = "cycl/inference/harness/inference-datastructures-inference.lisp", position = 3500L)
    public static SubLObject _csetf_infrnc_proof_watermark(SubLObject v_object, SubLObject value) {
        assert NIL != inference_p(v_object) : v_object;
        return (($inference_native) v_object).$proof_watermark = value;
    }

    @SubL(source = "cycl/inference/harness/inference-datastructures-inference.lisp", position = 3500L)
    public static SubLObject _csetf_infrnc_problem_working_time_data(SubLObject v_object, SubLObject value) {
        assert NIL != inference_p(v_object) : v_object;
        return (($inference_native) v_object).$problem_working_time_data = value;
    }

    @SubL(source = "cycl/inference/harness/inference-datastructures-inference.lisp", position = 3500L)
    public static SubLObject _csetf_infrnc_type(SubLObject v_object, SubLObject value) {
        assert NIL != inference_p(v_object) : v_object;
        return (($inference_native) v_object).$type = value;
    }

    @SubL(source = "cycl/inference/harness/inference-datastructures-inference.lisp", position = 3500L)
    public static SubLObject _csetf_infrnc_data(SubLObject v_object, SubLObject value) {
        assert NIL != inference_p(v_object) : v_object;
        return (($inference_native) v_object).$data = value;
    }

    @SubL(source = "cycl/inference/harness/inference-datastructures-inference.lisp", position = 3500L)
    public static SubLObject _csetf_infrnc_properties(SubLObject v_object, SubLObject value) {
        assert NIL != inference_p(v_object) : v_object;
        return (($inference_native) v_object).$properties = value;
    }

    @SubL(source = "cycl/inference/harness/inference-datastructures-inference.lisp", position = 3500L)
    public static SubLObject make_inference(SubLObject arglist) {
        if (arglist == UNPROVIDED) {
            arglist = NIL;
        }
        SubLObject v_new = new $inference_native();
        SubLObject next;
        SubLObject current_arg;
        SubLObject current_value;
        SubLObject pcase_var;
        for (next = NIL, next = arglist; NIL != next; next = conses_high.cddr(next)) {
            current_arg = next.first();
            current_value = conses_high.cadr(next);
            pcase_var = current_arg;
            if (pcase_var.eql($SUID)) {
                _csetf_infrnc_suid(v_new, current_value);
            } else if (pcase_var.eql($PROBLEM_STORE)) {
                _csetf_infrnc_problem_store(v_new, current_value);
            } else if (pcase_var.eql($FORWARD_PROPAGATE)) {
                _csetf_infrnc_forward_propagate(v_new, current_value);
            } else if (pcase_var.eql($INPUT_MT)) {
                _csetf_infrnc_input_mt(v_new, current_value);
            } else if (pcase_var.eql($INPUT_EL_QUERY)) {
                _csetf_infrnc_input_el_query(v_new, current_value);
            } else if (pcase_var.eql($INPUT_NON_EXPLANATORY_EL_QUERY)) {
                _csetf_infrnc_input_non_explanatory_el_query(v_new, current_value);
            } else if (pcase_var.eql($INPUT_QUERY_PROPERTIES)) {
                _csetf_infrnc_input_query_properties(v_new, current_value);
            } else if (pcase_var.eql($MT)) {
                _csetf_infrnc_mt(v_new, current_value);
            } else if (pcase_var.eql($EL_QUERY)) {
                _csetf_infrnc_el_query(v_new, current_value);
            } else if (pcase_var.eql($EL_BINDINGS)) {
                _csetf_infrnc_el_bindings(v_new, current_value);
            } else if (pcase_var.eql($HL_QUERY)) {
                _csetf_infrnc_hl_query(v_new, current_value);
            } else if (pcase_var.eql($EXPLANATORY_SUBQUERY)) {
                _csetf_infrnc_explanatory_subquery(v_new, current_value);
            } else if (pcase_var.eql($NON_EXPLANATORY_SUBQUERY)) {
                _csetf_infrnc_non_explanatory_subquery(v_new, current_value);
            } else if (pcase_var.eql($FREE_HL_VARS)) {
                _csetf_infrnc_free_hl_vars(v_new, current_value);
            } else if (pcase_var.eql($HYPOTHETICAL_BINDINGS)) {
                _csetf_infrnc_hypothetical_bindings(v_new, current_value);
            } else if (pcase_var.eql($ANSWER_ID_INDEX)) {
                _csetf_infrnc_answer_id_index(v_new, current_value);
            } else if (pcase_var.eql($ANSWER_BINDINGS_INDEX)) {
                _csetf_infrnc_answer_bindings_index(v_new, current_value);
            } else if (pcase_var.eql($NEW_ANSWER_ID_START)) {
                _csetf_infrnc_new_answer_id_start(v_new, current_value);
            } else if (pcase_var.eql($NEW_ANSWER_JUSTIFICATIONS)) {
                _csetf_infrnc_new_answer_justifications(v_new, current_value);
            } else if (pcase_var.eql($STATUS)) {
                _csetf_infrnc_status(v_new, current_value);
            } else if (pcase_var.eql($SUSPEND_STATUS)) {
                _csetf_infrnc_suspend_status(v_new, current_value);
            } else if (pcase_var.eql($ROOT_LINK)) {
                _csetf_infrnc_root_link(v_new, current_value);
            } else if (pcase_var.eql($RELEVANT_PROBLEMS)) {
                _csetf_infrnc_relevant_problems(v_new, current_value);
            } else if (pcase_var.eql($STRATEGY_SET)) {
                _csetf_infrnc_strategy_set(v_new, current_value);
            } else if (pcase_var.eql($CONTROL_PROCESS)) {
                _csetf_infrnc_control_process(v_new, current_value);
            } else if (pcase_var.eql($INTERRUPTING_PROCESSES)) {
                _csetf_infrnc_interrupting_processes(v_new, current_value);
            } else if (pcase_var.eql($MAX_TRANSFORMATION_DEPTH_REACHED)) {
                _csetf_infrnc_max_transformation_depth_reached(v_new, current_value);
            } else if (pcase_var.eql($DISJUNCTION_FREE_EL_VARS_POLICY)) {
                _csetf_infrnc_disjunction_free_el_vars_policy(v_new, current_value);
            } else if (pcase_var.eql($RESULT_UNIQUENESS_CRITERION)) {
                _csetf_infrnc_result_uniqueness_criterion(v_new, current_value);
            } else if (pcase_var.eql($ALLOW_HL_PREDICATE_TRANSFORMATION_)) {
                _csetf_infrnc_allow_hl_predicate_transformationP(v_new, current_value);
            } else if (pcase_var.eql($ALLOW_UNBOUND_PREDICATE_TRANSFORMATION_)) {
                _csetf_infrnc_allow_unbound_predicate_transformationP(v_new, current_value);
            } else if (pcase_var.eql($ALLOW_EVALUATABLE_PREDICATE_TRANSFORMATION_)) {
                _csetf_infrnc_allow_evaluatable_predicate_transformationP(v_new, current_value);
            } else if (pcase_var.eql($ALLOW_INDETERMINATE_RESULTS_)) {
                _csetf_infrnc_allow_indeterminate_resultsP(v_new, current_value);
            } else if (pcase_var.eql($ALLOWED_RULES)) {
                _csetf_infrnc_allowed_rules(v_new, current_value);
            } else if (pcase_var.eql($FORBIDDEN_RULES)) {
                _csetf_infrnc_forbidden_rules(v_new, current_value);
            } else if (pcase_var.eql($ALLOWED_MODULES)) {
                _csetf_infrnc_allowed_modules(v_new, current_value);
            } else if (pcase_var.eql($ALLOW_ABNORMALITY_CHECKING_)) {
                _csetf_infrnc_allow_abnormality_checkingP(v_new, current_value);
            } else if (pcase_var.eql($TRANSITIVE_CLOSURE_MODE)) {
                _csetf_infrnc_transitive_closure_mode(v_new, current_value);
            } else if (pcase_var.eql($PROBLEM_STORE_PRIVATE_)) {
                _csetf_infrnc_problem_store_privateP(v_new, current_value);
            } else if (pcase_var.eql($CONTINUABLE_)) {
                _csetf_infrnc_continuableP(v_new, current_value);
            } else if (pcase_var.eql($BROWSABLE_)) {
                _csetf_infrnc_browsableP(v_new, current_value);
            } else if (pcase_var.eql($RETURN_TYPE)) {
                _csetf_infrnc_return_type(v_new, current_value);
            } else if (pcase_var.eql($ANSWER_LANGUAGE)) {
                _csetf_infrnc_answer_language(v_new, current_value);
            } else if (pcase_var.eql($CACHE_RESULTS_)) {
                _csetf_infrnc_cache_resultsP(v_new, current_value);
            } else if (pcase_var.eql($BLOCKING_)) {
                _csetf_infrnc_blockingP(v_new, current_value);
            } else if (pcase_var.eql($MAX_NUMBER)) {
                _csetf_infrnc_max_number(v_new, current_value);
            } else if (pcase_var.eql($MAX_TIME)) {
                _csetf_infrnc_max_time(v_new, current_value);
            } else if (pcase_var.eql($MAX_STEP)) {
                _csetf_infrnc_max_step(v_new, current_value);
            } else if (pcase_var.eql($MODE)) {
                _csetf_infrnc_mode(v_new, current_value);
            } else if (pcase_var.eql($FORWARD_MAX_TIME)) {
                _csetf_infrnc_forward_max_time(v_new, current_value);
            } else if (pcase_var.eql($MAX_PROOF_DEPTH)) {
                _csetf_infrnc_max_proof_depth(v_new, current_value);
            } else if (pcase_var.eql($MAX_TRANSFORMATION_DEPTH)) {
                _csetf_infrnc_max_transformation_depth(v_new, current_value);
            } else if (pcase_var.eql($MIN_RULE_UTILITY)) {
                _csetf_infrnc_min_rule_utility(v_new, current_value);
            } else if (pcase_var.eql($PROBABLY_APPROXIMATELY_DONE)) {
                _csetf_infrnc_probably_approximately_done(v_new, current_value);
            } else if (pcase_var.eql($METRICS_TEMPLATE)) {
                _csetf_infrnc_metrics_template(v_new, current_value);
            } else if (pcase_var.eql($START_UNIVERSAL_TIME)) {
                _csetf_infrnc_start_universal_time(v_new, current_value);
            } else if (pcase_var.eql($START_INTERNAL_REAL_TIME)) {
                _csetf_infrnc_start_internal_real_time(v_new, current_value);
            } else if (pcase_var.eql($END_INTERNAL_REAL_TIME)) {
                _csetf_infrnc_end_internal_real_time(v_new, current_value);
            } else if (pcase_var.eql($PAD_INTERNAL_REAL_TIME)) {
                _csetf_infrnc_pad_internal_real_time(v_new, current_value);
            } else if (pcase_var.eql($HYPOTHESIZATION_TIME)) {
                _csetf_infrnc_hypothesization_time(v_new, current_value);
            } else if (pcase_var.eql($CUMULATIVE_TIME)) {
                _csetf_infrnc_cumulative_time(v_new, current_value);
            } else if (pcase_var.eql($STEP_COUNT)) {
                _csetf_infrnc_step_count(v_new, current_value);
            } else if (pcase_var.eql($CUMULATIVE_STEP_COUNT)) {
                _csetf_infrnc_cumulative_step_count(v_new, current_value);
            } else if (pcase_var.eql($EVENTS)) {
                _csetf_infrnc_events(v_new, current_value);
            } else if (pcase_var.eql($HALT_CONDITIONS)) {
                _csetf_infrnc_halt_conditions(v_new, current_value);
            } else if (pcase_var.eql($ACCUMULATORS)) {
                _csetf_infrnc_accumulators(v_new, current_value);
            } else if (pcase_var.eql($PROOF_WATERMARK)) {
                _csetf_infrnc_proof_watermark(v_new, current_value);
            } else if (pcase_var.eql($PROBLEM_WORKING_TIME_DATA)) {
                _csetf_infrnc_problem_working_time_data(v_new, current_value);
            } else if (pcase_var.eql($TYPE)) {
                _csetf_infrnc_type(v_new, current_value);
            } else if (pcase_var.eql($DATA)) {
                _csetf_infrnc_data(v_new, current_value);
            } else if (pcase_var.eql($PROPERTIES)) {
                _csetf_infrnc_properties(v_new, current_value);
            } else {
                Errors.error($str275$Invalid_slot__S_for_construction_, current_arg);
            }
        }
        return v_new;
    }

    @SubL(source = "cycl/inference/harness/inference-datastructures-inference.lisp", position = 3500L)
    public static SubLObject visit_defstruct_inference(SubLObject obj, SubLObject visitor_fn) {
        Functions.funcall(visitor_fn, obj, $BEGIN, $sym277$MAKE_INFERENCE, $int$71);
        Functions.funcall(visitor_fn, obj, $SLOT, $SUID, infrnc_suid(obj));
        Functions.funcall(visitor_fn, obj, $SLOT, $PROBLEM_STORE, infrnc_problem_store(obj));
        Functions.funcall(visitor_fn, obj, $SLOT, $FORWARD_PROPAGATE, infrnc_forward_propagate(obj));
        Functions.funcall(visitor_fn, obj, $SLOT, $INPUT_MT, infrnc_input_mt(obj));
        Functions.funcall(visitor_fn, obj, $SLOT, $INPUT_EL_QUERY, infrnc_input_el_query(obj));
        Functions.funcall(visitor_fn, obj, $SLOT, $INPUT_NON_EXPLANATORY_EL_QUERY, infrnc_input_non_explanatory_el_query(obj));
        Functions.funcall(visitor_fn, obj, $SLOT, $INPUT_QUERY_PROPERTIES, infrnc_input_query_properties(obj));
        Functions.funcall(visitor_fn, obj, $SLOT, $MT, infrnc_mt(obj));
        Functions.funcall(visitor_fn, obj, $SLOT, $EL_QUERY, infrnc_el_query(obj));
        Functions.funcall(visitor_fn, obj, $SLOT, $EL_BINDINGS, infrnc_el_bindings(obj));
        Functions.funcall(visitor_fn, obj, $SLOT, $HL_QUERY, infrnc_hl_query(obj));
        Functions.funcall(visitor_fn, obj, $SLOT, $EXPLANATORY_SUBQUERY, infrnc_explanatory_subquery(obj));
        Functions.funcall(visitor_fn, obj, $SLOT, $NON_EXPLANATORY_SUBQUERY, infrnc_non_explanatory_subquery(obj));
        Functions.funcall(visitor_fn, obj, $SLOT, $FREE_HL_VARS, infrnc_free_hl_vars(obj));
        Functions.funcall(visitor_fn, obj, $SLOT, $HYPOTHETICAL_BINDINGS, infrnc_hypothetical_bindings(obj));
        Functions.funcall(visitor_fn, obj, $SLOT, $ANSWER_ID_INDEX, infrnc_answer_id_index(obj));
        Functions.funcall(visitor_fn, obj, $SLOT, $ANSWER_BINDINGS_INDEX, infrnc_answer_bindings_index(obj));
        Functions.funcall(visitor_fn, obj, $SLOT, $NEW_ANSWER_ID_START, infrnc_new_answer_id_start(obj));
        Functions.funcall(visitor_fn, obj, $SLOT, $NEW_ANSWER_JUSTIFICATIONS, infrnc_new_answer_justifications(obj));
        Functions.funcall(visitor_fn, obj, $SLOT, $STATUS, infrnc_status(obj));
        Functions.funcall(visitor_fn, obj, $SLOT, $SUSPEND_STATUS, infrnc_suspend_status(obj));
        Functions.funcall(visitor_fn, obj, $SLOT, $ROOT_LINK, infrnc_root_link(obj));
        Functions.funcall(visitor_fn, obj, $SLOT, $RELEVANT_PROBLEMS, infrnc_relevant_problems(obj));
        Functions.funcall(visitor_fn, obj, $SLOT, $STRATEGY_SET, infrnc_strategy_set(obj));
        Functions.funcall(visitor_fn, obj, $SLOT, $CONTROL_PROCESS, infrnc_control_process(obj));
        Functions.funcall(visitor_fn, obj, $SLOT, $INTERRUPTING_PROCESSES, infrnc_interrupting_processes(obj));
        Functions.funcall(visitor_fn, obj, $SLOT, $MAX_TRANSFORMATION_DEPTH_REACHED, infrnc_max_transformation_depth_reached(obj));
        Functions.funcall(visitor_fn, obj, $SLOT, $DISJUNCTION_FREE_EL_VARS_POLICY, infrnc_disjunction_free_el_vars_policy(obj));
        Functions.funcall(visitor_fn, obj, $SLOT, $RESULT_UNIQUENESS_CRITERION, infrnc_result_uniqueness_criterion(obj));
        Functions.funcall(visitor_fn, obj, $SLOT, $ALLOW_HL_PREDICATE_TRANSFORMATION_, infrnc_allow_hl_predicate_transformationP(obj));
        Functions.funcall(visitor_fn, obj, $SLOT, $ALLOW_UNBOUND_PREDICATE_TRANSFORMATION_, infrnc_allow_unbound_predicate_transformationP(obj));
        Functions.funcall(visitor_fn, obj, $SLOT, $ALLOW_EVALUATABLE_PREDICATE_TRANSFORMATION_, infrnc_allow_evaluatable_predicate_transformationP(obj));
        Functions.funcall(visitor_fn, obj, $SLOT, $ALLOW_INDETERMINATE_RESULTS_, infrnc_allow_indeterminate_resultsP(obj));
        Functions.funcall(visitor_fn, obj, $SLOT, $ALLOWED_RULES, infrnc_allowed_rules(obj));
        Functions.funcall(visitor_fn, obj, $SLOT, $FORBIDDEN_RULES, infrnc_forbidden_rules(obj));
        Functions.funcall(visitor_fn, obj, $SLOT, $ALLOWED_MODULES, infrnc_allowed_modules(obj));
        Functions.funcall(visitor_fn, obj, $SLOT, $ALLOW_ABNORMALITY_CHECKING_, infrnc_allow_abnormality_checkingP(obj));
        Functions.funcall(visitor_fn, obj, $SLOT, $TRANSITIVE_CLOSURE_MODE, infrnc_transitive_closure_mode(obj));
        Functions.funcall(visitor_fn, obj, $SLOT, $PROBLEM_STORE_PRIVATE_, infrnc_problem_store_privateP(obj));
        Functions.funcall(visitor_fn, obj, $SLOT, $CONTINUABLE_, infrnc_continuableP(obj));
        Functions.funcall(visitor_fn, obj, $SLOT, $BROWSABLE_, infrnc_browsableP(obj));
        Functions.funcall(visitor_fn, obj, $SLOT, $RETURN_TYPE, infrnc_return_type(obj));
        Functions.funcall(visitor_fn, obj, $SLOT, $ANSWER_LANGUAGE, infrnc_answer_language(obj));
        Functions.funcall(visitor_fn, obj, $SLOT, $CACHE_RESULTS_, infrnc_cache_resultsP(obj));
        Functions.funcall(visitor_fn, obj, $SLOT, $BLOCKING_, infrnc_blockingP(obj));
        Functions.funcall(visitor_fn, obj, $SLOT, $MAX_NUMBER, infrnc_max_number(obj));
        Functions.funcall(visitor_fn, obj, $SLOT, $MAX_TIME, infrnc_max_time(obj));
        Functions.funcall(visitor_fn, obj, $SLOT, $MAX_STEP, infrnc_max_step(obj));
        Functions.funcall(visitor_fn, obj, $SLOT, $MODE, infrnc_mode(obj));
        Functions.funcall(visitor_fn, obj, $SLOT, $FORWARD_MAX_TIME, infrnc_forward_max_time(obj));
        Functions.funcall(visitor_fn, obj, $SLOT, $MAX_PROOF_DEPTH, infrnc_max_proof_depth(obj));
        Functions.funcall(visitor_fn, obj, $SLOT, $MAX_TRANSFORMATION_DEPTH, infrnc_max_transformation_depth(obj));
        Functions.funcall(visitor_fn, obj, $SLOT, $MIN_RULE_UTILITY, infrnc_min_rule_utility(obj));
        Functions.funcall(visitor_fn, obj, $SLOT, $PROBABLY_APPROXIMATELY_DONE, infrnc_probably_approximately_done(obj));
        Functions.funcall(visitor_fn, obj, $SLOT, $METRICS_TEMPLATE, infrnc_metrics_template(obj));
        Functions.funcall(visitor_fn, obj, $SLOT, $START_UNIVERSAL_TIME, infrnc_start_universal_time(obj));
        Functions.funcall(visitor_fn, obj, $SLOT, $START_INTERNAL_REAL_TIME, infrnc_start_internal_real_time(obj));
        Functions.funcall(visitor_fn, obj, $SLOT, $END_INTERNAL_REAL_TIME, infrnc_end_internal_real_time(obj));
        Functions.funcall(visitor_fn, obj, $SLOT, $PAD_INTERNAL_REAL_TIME, infrnc_pad_internal_real_time(obj));
        Functions.funcall(visitor_fn, obj, $SLOT, $HYPOTHESIZATION_TIME, infrnc_hypothesization_time(obj));
        Functions.funcall(visitor_fn, obj, $SLOT, $CUMULATIVE_TIME, infrnc_cumulative_time(obj));
        Functions.funcall(visitor_fn, obj, $SLOT, $STEP_COUNT, infrnc_step_count(obj));
        Functions.funcall(visitor_fn, obj, $SLOT, $CUMULATIVE_STEP_COUNT, infrnc_cumulative_step_count(obj));
        Functions.funcall(visitor_fn, obj, $SLOT, $EVENTS, infrnc_events(obj));
        Functions.funcall(visitor_fn, obj, $SLOT, $HALT_CONDITIONS, infrnc_halt_conditions(obj));
        Functions.funcall(visitor_fn, obj, $SLOT, $ACCUMULATORS, infrnc_accumulators(obj));
        Functions.funcall(visitor_fn, obj, $SLOT, $PROOF_WATERMARK, infrnc_proof_watermark(obj));
        Functions.funcall(visitor_fn, obj, $SLOT, $PROBLEM_WORKING_TIME_DATA, infrnc_problem_working_time_data(obj));
        Functions.funcall(visitor_fn, obj, $SLOT, $TYPE, infrnc_type(obj));
        Functions.funcall(visitor_fn, obj, $SLOT, $DATA, infrnc_data(obj));
        Functions.funcall(visitor_fn, obj, $SLOT, $PROPERTIES, infrnc_properties(obj));
        Functions.funcall(visitor_fn, obj, $END, $sym277$MAKE_INFERENCE, $int$71);
        return obj;
    }

    @SubL(source = "cycl/inference/harness/inference-datastructures-inference.lisp", position = 3500L)
    public static SubLObject visit_defstruct_object_inference_method(SubLObject obj, SubLObject visitor_fn) {
        return visit_defstruct_inference(obj, visitor_fn);
    }

    @SubL(source = "cycl/inference/harness/inference-datastructures-inference.lisp", position = 15100L)
    public static SubLObject valid_inference_p(SubLObject v_object) {
        return makeBoolean(NIL != inference_p(v_object) && NIL == inference_invalid_p(v_object));
    }

    @SubL(source = "cycl/inference/harness/inference-datastructures-inference.lisp", position = 15200L)
    public static SubLObject invalid_inference_p(SubLObject v_object) {
        return makeBoolean(NIL != inference_p(v_object) && NIL != inference_invalid_p(v_object));
    }

    @SubL(source = "cycl/inference/harness/inference-datastructures-inference.lisp", position = 15400L)
    public static SubLObject inference_invalid_p(SubLObject inference) {
        return Equality.eq($DEAD, inference_status(inference));
    }

    @SubL(source = "cycl/inference/harness/inference-datastructures-inference.lisp", position = 15500L)
    public static SubLObject print_inference(SubLObject v_object, SubLObject stream, SubLObject depth) {
        if (NIL != inference_invalid_p(v_object)) {
            PrintLow.format(stream, $str282$_Invalid_INFERENCE__s_, infrnc_suid(v_object));
        } else {
            PrintLow.format(stream, $str283$_INFERENCE__a__a__a__s_in__s_,
                    new SubLObject[] { inference_datastructures_problem_store.problem_store_suid(inference_problem_store(v_object)), inference_suid(v_object), inference_status(v_object), inference_input_el_query(v_object), inference_input_mt(v_object) });
        }
        return NIL;
    }

    @SubL(source = "cycl/inference/harness/inference-datastructures-inference.lisp", position = 16000L)
    public static SubLObject sxhash_inference_method(SubLObject v_object) {
        return infrnc_suid(v_object);
    }

    @SubL(source = "cycl/inference/harness/inference-datastructures-inference.lisp", position = 16000L)
    public static SubLObject new_inference_p(SubLObject v_object) {
        return makeBoolean(NIL != inference_p(v_object) && $NEW == inference_status(v_object));
    }

    @SubL(source = "cycl/inference/harness/inference-datastructures-inference.lisp", position = 16200L)
    public static SubLObject prepared_inference_p(SubLObject v_object) {
        return makeBoolean(NIL != inference_p(v_object) && $PREPARED == inference_status(v_object));
    }

    @SubL(source = "cycl/inference/harness/inference-datastructures-inference.lisp", position = 16300L)
    public static SubLObject ready_inference_p(SubLObject v_object) {
        return makeBoolean(NIL != inference_p(v_object) && $READY == inference_status(v_object));
    }

    @SubL(source = "cycl/inference/harness/inference-datastructures-inference.lisp", position = 16400L)
    public static SubLObject running_inference_p(SubLObject v_object) {
        return makeBoolean(NIL != inference_p(v_object) && $RUNNING == inference_status(v_object));
    }

    @SubL(source = "cycl/inference/harness/inference-datastructures-inference.lisp", position = 16600L)
    public static SubLObject suspended_inference_p(SubLObject v_object) {
        return makeBoolean(NIL != inference_p(v_object) && $SUSPENDED == inference_status(v_object));
    }

    @SubL(source = "cycl/inference/harness/inference-datastructures-inference.lisp", position = 16700L)
    public static SubLObject continuable_inference_p(SubLObject v_object) {
        if (NIL != inference_p(v_object)) {
            SubLObject status = inference_status(v_object);
            if (NIL != inference_datastructures_enumerated_types.continuable_inference_status_p(status)) {
                if ($SUSPENDED != status) {
                    return T;
                }
                if (NIL != inference_continuableP(v_object)) {
                    SubLObject suspend_status = inference_suspend_status(v_object);
                    return inference_datastructures_enumerated_types.continuable_inference_suspend_status_p(suspend_status);
                }
            }
        }
        return NIL;
    }

    @SubL(source = "cycl/inference/harness/inference-datastructures-inference.lisp", position = 17100L)
    public static SubLObject exhausted_inference_p(SubLObject v_object) {
        return makeBoolean(NIL != suspended_inference_p(v_object) && NIL != inference_datastructures_enumerated_types.exhausted_inference_suspend_status_p(inference_suspend_status(v_object)));
    }

    @SubL(source = "cycl/inference/harness/inference-datastructures-inference.lisp", position = 17300L)
    public static SubLObject do_inference_relevant_problems(SubLObject macroform, SubLObject environment) {
        SubLObject current;
        SubLObject datum = current = macroform.rest();
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, $list290);
        SubLObject temp = current.rest();
        current = current.first();
        SubLObject problem_var = NIL;
        SubLObject inference = NIL;
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, $list290);
        problem_var = current.first();
        current = current.rest();
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, $list290);
        inference = current.first();
        current = current.rest();
        if (NIL == current) {
            SubLObject body;
            current = (body = temp);
            return listS($sym291$DO_SET, list(problem_var, list($sym292$INFERENCE_RELEVANT_PROBLEMS, inference)), append(body, NIL));
        }
        cdestructuring_bind.cdestructuring_bind_error(datum, $list290);
        return NIL;
    }

    @SubL(source = "cycl/inference/harness/inference-datastructures-inference.lisp", position = 17500L)
    public static SubLObject do_inference_new_answer_justifications(SubLObject macroform, SubLObject environment) {
        SubLObject current;
        SubLObject datum = current = macroform.rest();
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, $list293);
        SubLObject temp = current.rest();
        current = current.first();
        SubLObject just_var = NIL;
        SubLObject inference = NIL;
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, $list293);
        just_var = current.first();
        current = current.rest();
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, $list293);
        inference = current.first();
        current = current.rest();
        if (NIL == current) {
            SubLObject body;
            current = (body = temp);
            return listS($sym294$DO_QUEUE_ELEMENTS, list(just_var, list($sym295$INFERENCE_NEW_ANSWER_JUSTIFICATIONS, inference)), append(body, NIL));
        }
        cdestructuring_bind.cdestructuring_bind_error(datum, $list293);
        return NIL;
    }

    @SubL(source = "cycl/inference/harness/inference-datastructures-inference.lisp", position = 17700L)
    public static SubLObject do_inference_new_answers(SubLObject macroform, SubLObject environment) {
        SubLObject current;
        SubLObject datum = current = macroform.rest();
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, $list296);
        SubLObject temp = current.rest();
        current = current.first();
        SubLObject answer_var = NIL;
        SubLObject inference = NIL;
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, $list296);
        answer_var = current.first();
        current = current.rest();
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, $list296);
        inference = current.first();
        current = current.rest();
        if (NIL == current) {
            SubLObject body;
            current = (body = temp);
            SubLObject start_id = $sym297$START_ID;
            SubLObject end_id = $sym298$END_ID;
            SubLObject id = $sym299$ID;
            SubLObject inf = $sym300$INF;
            return list($sym301$CLET, list(list(inf, inference), list(start_id, list($sym302$INFERENCE_NEW_ANSWER_ID_START, inference)), list(end_id, list($sym303$INFERENCE_NEXT_NEW_ANSWER_ID, inference))),
                    list($sym304$CDO, list(list(id, start_id, list($sym305$1_, id))), list(list($sym306$__, id, end_id)), listS($sym301$CLET, list(list(answer_var, list($sym307$FIND_INFERENCE_ANSWER_BY_ID, inf, id))), append(body, NIL))));
        }
        cdestructuring_bind.cdestructuring_bind_error(datum, $list296);
        return NIL;
    }

    @SubL(source = "cycl/inference/harness/inference-datastructures-inference.lisp", position = 18100L)
    public static SubLObject do_inference_answers(SubLObject macroform, SubLObject environment) {
        SubLObject current;
        SubLObject datum = current = macroform.rest();
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, $list308);
        SubLObject temp = current.rest();
        current = current.first();
        SubLObject answer_var = NIL;
        SubLObject inference = NIL;
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, $list308);
        answer_var = current.first();
        current = current.rest();
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, $list308);
        inference = current.first();
        current = current.rest();
        SubLObject allow_other_keys_p = NIL;
        SubLObject rest = current;
        SubLObject bad = NIL;
        SubLObject current_$1 = NIL;
        while (NIL != rest) {
            cdestructuring_bind.destructuring_bind_must_consp(rest, datum, $list308);
            current_$1 = rest.first();
            rest = rest.rest();
            cdestructuring_bind.destructuring_bind_must_consp(rest, datum, $list308);
            if (NIL == conses_high.member(current_$1, $list309, UNPROVIDED, UNPROVIDED)) {
                bad = T;
            }
            if (current_$1 == $ALLOW_OTHER_KEYS) {
                allow_other_keys_p = rest.first();
            }
            rest = rest.rest();
        }
        if (NIL != bad && NIL == allow_other_keys_p) {
            cdestructuring_bind.cdestructuring_bind_error(datum, $list308);
        }
        SubLObject ordered_tail = cdestructuring_bind.property_list_member($ORDERED, current);
        SubLObject ordered = (NIL != ordered_tail) ? conses_high.cadr(ordered_tail) : NIL;
        SubLObject body;
        current = (body = temp);
        SubLObject id = $sym312$ID;
        return listS($sym313$DO_ID_INDEX, list(id, answer_var, list($sym314$INFERENCE_ANSWER_ID_INDEX, inference), $ORDERED, ordered), list($sym315$IGNORE, id), append(body, NIL));
    }

    @SubL(source = "cycl/inference/harness/inference-datastructures-inference.lisp", position = 18400L)
    public static SubLObject do_inference_answers_from_index(SubLObject macroform, SubLObject environment) {
        SubLObject current;
        SubLObject datum = current = macroform.rest();
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, $list316);
        SubLObject temp = current.rest();
        current = current.first();
        SubLObject answer_var = NIL;
        SubLObject inference = NIL;
        SubLObject start_index = NIL;
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, $list316);
        answer_var = current.first();
        current = current.rest();
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, $list316);
        inference = current.first();
        current = current.rest();
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, $list316);
        start_index = current.first();
        current = current.rest();
        if (NIL == current) {
            SubLObject body;
            current = (body = temp);
            SubLObject start_id = $sym317$START_ID;
            SubLObject end_id = $sym318$END_ID;
            SubLObject id = $sym319$ID;
            SubLObject inf = $sym320$INF;
            return list($sym301$CLET, list(list(inf, inference), list(start_id, start_index), list(end_id, list($sym303$INFERENCE_NEXT_NEW_ANSWER_ID, inference))),
                    list($sym304$CDO, list(list(id, start_id, list($sym305$1_, id))), list(list($sym306$__, id, end_id)), listS($sym301$CLET, list(list(answer_var, list($sym307$FIND_INFERENCE_ANSWER_BY_ID, inf, id))), append(body, NIL))), list($sym321$CSETQ, start_index, end_id));
        }
        cdestructuring_bind.cdestructuring_bind_error(datum, $list316);
        return NIL;
    }

    @SubL(source = "cycl/inference/harness/inference-datastructures-inference.lisp", position = 19100L)
    public static SubLObject do_inference_justifications(SubLObject macroform, SubLObject environment) {
        SubLObject current;
        SubLObject datum = current = macroform.rest();
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, $list293);
        SubLObject temp = current.rest();
        current = current.first();
        SubLObject just_var = NIL;
        SubLObject inference = NIL;
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, $list293);
        just_var = current.first();
        current = current.rest();
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, $list293);
        inference = current.first();
        current = current.rest();
        if (NIL == current) {
            SubLObject body;
            current = (body = temp);
            SubLObject v_answer = $sym322$ANSWER;
            return list($sym323$DO_INFERENCE_ANSWERS, list(v_answer, inference), listS($sym324$DO_INFERENCE_ANSWER_JUSTIFICATIONS, list(just_var, v_answer), append(body, NIL)));
        }
        cdestructuring_bind.cdestructuring_bind_error(datum, $list293);
        return NIL;
    }

    @SubL(source = "cycl/inference/harness/inference-datastructures-inference.lisp", position = 19300L)
    public static SubLObject do_inference_interrupting_processes(SubLObject macroform, SubLObject environment) {
        SubLObject current;
        SubLObject datum = current = macroform.rest();
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, $list325);
        SubLObject temp = current.rest();
        current = current.first();
        SubLObject process_var = NIL;
        SubLObject inference = NIL;
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, $list325);
        process_var = current.first();
        current = current.rest();
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, $list325);
        inference = current.first();
        current = current.rest();
        if (NIL == current) {
            SubLObject body;
            current = (body = temp);
            return listS($sym326$DO_QUEUE_DEQUEUE, list(process_var, list($sym327$INFERENCE_INTERRUPTING_PROCESSES, inference)), append(body, NIL));
        }
        cdestructuring_bind.cdestructuring_bind_error(datum, $list325);
        return NIL;
    }

    @SubL(source = "cycl/inference/harness/inference-datastructures-inference.lisp", position = 19500L)
    public static SubLObject do_inference_root_proofs(SubLObject macroform, SubLObject environment) {
        SubLObject current;
        SubLObject datum = current = macroform.rest();
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, $list328);
        SubLObject temp = current.rest();
        current = current.first();
        SubLObject proof_var = NIL;
        SubLObject inference = NIL;
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, $list328);
        proof_var = current.first();
        current = current.rest();
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, $list328);
        inference = current.first();
        current = current.rest();
        SubLObject allow_other_keys_p = NIL;
        SubLObject rest = current;
        SubLObject bad = NIL;
        SubLObject current_$2 = NIL;
        while (NIL != rest) {
            cdestructuring_bind.destructuring_bind_must_consp(rest, datum, $list328);
            current_$2 = rest.first();
            rest = rest.rest();
            cdestructuring_bind.destructuring_bind_must_consp(rest, datum, $list328);
            if (NIL == conses_high.member(current_$2, $list329, UNPROVIDED, UNPROVIDED)) {
                bad = T;
            }
            if (current_$2 == $ALLOW_OTHER_KEYS) {
                allow_other_keys_p = rest.first();
            }
            rest = rest.rest();
        }
        if (NIL != bad && NIL == allow_other_keys_p) {
            cdestructuring_bind.cdestructuring_bind_error(datum, $list328);
        }
        SubLObject proof_status_tail = cdestructuring_bind.property_list_member($PROOF_STATUS, current);
        SubLObject proof_status = (NIL != proof_status_tail) ? conses_high.cadr(proof_status_tail) : NIL;
        SubLObject body;
        current = (body = temp);
        SubLObject root_problem = $sym331$ROOT_PROBLEM;
        return list($sym301$CLET, list(list(root_problem, list($sym332$INFERENCE_ROOT_PROBLEM, inference))), list($sym333$PWHEN, root_problem, listS($sym334$DO_PROBLEM_PROOFS, list(proof_var, root_problem, $PROOF_STATUS, proof_status), append(body, NIL))));
    }

    @SubL(source = "cycl/inference/harness/inference-datastructures-inference.lisp", position = 19800L)
    public static SubLObject do_inference_allowed_rules(SubLObject macroform, SubLObject environment) {
        SubLObject current;
        SubLObject datum = current = macroform.rest();
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, $list335);
        SubLObject temp = current.rest();
        current = current.first();
        SubLObject rule_var = NIL;
        SubLObject inference = NIL;
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, $list335);
        rule_var = current.first();
        current = current.rest();
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, $list335);
        inference = current.first();
        current = current.rest();
        SubLObject allow_other_keys_p = NIL;
        SubLObject rest = current;
        SubLObject bad = NIL;
        SubLObject current_$3 = NIL;
        while (NIL != rest) {
            cdestructuring_bind.destructuring_bind_must_consp(rest, datum, $list335);
            current_$3 = rest.first();
            rest = rest.rest();
            cdestructuring_bind.destructuring_bind_must_consp(rest, datum, $list335);
            if (NIL == conses_high.member(current_$3, $list336, UNPROVIDED, UNPROVIDED)) {
                bad = T;
            }
            if (current_$3 == $ALLOW_OTHER_KEYS) {
                allow_other_keys_p = rest.first();
            }
            rest = rest.rest();
        }
        if (NIL != bad && NIL == allow_other_keys_p) {
            cdestructuring_bind.cdestructuring_bind_error(datum, $list335);
        }
        SubLObject done_tail = cdestructuring_bind.property_list_member($DONE, current);
        SubLObject done = (NIL != done_tail) ? conses_high.cadr(done_tail) : NIL;
        SubLObject body;
        current = (body = temp);
        return listS($sym291$DO_SET, list(rule_var, list($sym338$INFERENCE_ALLOWED_RULES, inference), $DONE, done), append(body, NIL));
    }

    @SubL(source = "cycl/inference/harness/inference-datastructures-inference.lisp", position = 20000L)
    public static SubLObject with_inference_problem_working_time_lock(SubLObject macroform, SubLObject environment) {
        SubLObject current;
        SubLObject datum = current = macroform.rest();
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, $list339);
        SubLObject temp = current.rest();
        current = current.first();
        SubLObject inference = NIL;
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, $list339);
        inference = current.first();
        current = current.rest();
        if (NIL == current) {
            SubLObject body;
            current = (body = temp);
            return listS($sym340$WITH_LOCK_HELD, list(list($sym341$INFERENCE_PROBLEM_WORKING_TIME_LOCK, inference)), append(body, NIL));
        }
        cdestructuring_bind.cdestructuring_bind_error(datum, $list339);
        return NIL;
    }

    @SubL(source = "cycl/inference/harness/inference-datastructures-inference.lisp", position = 20200L)
    public static SubLObject new_inference(SubLObject store) {
        assert NIL != inference_datastructures_problem_store.problem_store_p(store) : store;
        SubLObject inf = make_inference(UNPROVIDED);
        SubLObject suid = inference_datastructures_problem_store.problem_store_new_inference_id(store);
        inference_metrics.increment_inference_historical_count();
        _csetf_infrnc_suid(inf, suid);
        _csetf_infrnc_problem_store(inf, store);
        _csetf_infrnc_forward_propagate(inf, NIL);
        _csetf_infrnc_hypothetical_bindings(inf, NIL);
        _csetf_infrnc_answer_id_index(inf, id_index.new_id_index(TEN_INTEGER, ZERO_INTEGER));
        _csetf_infrnc_answer_bindings_index(inf, dictionary.new_dictionary(Symbols.symbol_function(EQUAL), UNPROVIDED));
        _csetf_infrnc_new_answer_justifications(inf, queues.create_queue(UNPROVIDED));
        reset_inference_new_answers(inf);
        set_inference_status(inf, $NEW);
        _csetf_infrnc_relevant_problems(inf, set.new_set(Symbols.symbol_function(EQ), UNPROVIDED));
        _csetf_infrnc_strategy_set(inf, set.new_set(Symbols.symbol_function(EQ), UNPROVIDED));
        clear_inference_control_process(inf);
        _csetf_infrnc_interrupting_processes(inf, queues.create_queue(UNPROVIDED));
        _csetf_infrnc_max_transformation_depth_reached(inf, ZERO_INTEGER);
        set_inference_answer_language(inf, inference_datastructures_enumerated_types.$inference_default_answer_language$.getGlobalValue());
        set_inference_disjunction_free_el_vars_policy(inf, inference_datastructures_enumerated_types.$default_inference_disjunction_free_el_vars_policy$.getGlobalValue());
        set_inference_cache_results(inf, NIL);
        set_inference_continuable(inf, inference_datastructures_enumerated_types.$inference_default_continuableP$.getGlobalValue());
        set_inference_browsable(inf, inference_datastructures_enumerated_types.$inference_default_browsableP$.getGlobalValue());
        set_inference_max_number(inf, inference_datastructures_enumerated_types.$default_max_number$.getGlobalValue());
        set_inference_max_time(inf, inference_datastructures_enumerated_types.$default_max_time$.getGlobalValue());
        set_inference_max_step(inf, inference_datastructures_enumerated_types.$default_max_step$.getGlobalValue());
        set_inference_mode(inf, inference_datastructures_enumerated_types.$default_inference_mode$.getGlobalValue());
        set_inference_forward_max_time(inf, inference_datastructures_enumerated_types.$default_forward_max_time$.getGlobalValue());
        set_inference_hypothesization_time(inf, ZERO_INTEGER);
        set_inference_cumulative_time(inf, ZERO_INTEGER);
        set_inference_step_count(inf, ZERO_INTEGER);
        set_inference_cumulative_step_count(inf, ZERO_INTEGER);
        set_inference_max_proof_depth(inf, inference_datastructures_enumerated_types.$default_max_proof_depth$.getGlobalValue());
        set_inference_max_transformation_depth(inf, inference_datastructures_enumerated_types.$default_max_transformation_depth$.getGlobalValue());
        set_inference_min_rule_utility(inf, inference_datastructures_enumerated_types.$default_min_rule_utility$.getGlobalValue());
        set_inference_probably_approximately_done(inf, inference_datastructures_enumerated_types.$default_probably_approximately_done$.getGlobalValue());
        set_inference_metrics_template(inf, inference_datastructures_enumerated_types.$default_inference_metrics_template$.getGlobalValue());
        _csetf_infrnc_accumulators(inf, dictionary.new_dictionary(Symbols.symbol_function(EQ), UNPROVIDED));
        _csetf_infrnc_proof_watermark(inf, ZERO_INTEGER);
        clear_inference_blocking(inf);
        inference_datastructures_problem_store.add_problem_store_inference(store, inf);
        return inf;
    }

    @SubL(source = "cycl/inference/harness/inference-datastructures-inference.lisp", position = 23600L)
    public static SubLObject new_tautological_inference(SubLObject store) {
        SubLObject inference = new_inference(store);
        set_inference_status(inference, $TAUTOLOGY);
        return inference;
    }

    @SubL(source = "cycl/inference/harness/inference-datastructures-inference.lisp", position = 23700L)
    public static SubLObject destroy_all_inferences() {
        SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject cdolist_list_var;
        SubLObject inferences = cdolist_list_var = all_inferences();
        SubLObject inference = NIL;
        inference = cdolist_list_var.first();
        while (NIL != cdolist_list_var) {
            SubLObject ignore_errors_tag = NIL;
            try {
                thread.throwStack.push($IGNORE_ERRORS_TARGET);
                SubLObject _prev_bind_0 = Errors.$error_handler$.currentBinding(thread);
                try {
                    Errors.$error_handler$.bind(Symbols.symbol_function($sym345$IGNORE_ERRORS_HANDLER), thread);
                    try {
                        destroy_inference(inference);
                    } catch (Throwable catch_var) {
                        Errors.handleThrowable(catch_var, NIL);
                    }
                } finally {
                    Errors.$error_handler$.rebind(_prev_bind_0, thread);
                }
            } catch (Throwable ccatch_env_var) {
                ignore_errors_tag = Errors.handleThrowable(ccatch_env_var, $IGNORE_ERRORS_TARGET);
            } finally {
                thread.throwStack.pop();
            }
            cdolist_list_var = cdolist_list_var.rest();
            inference = cdolist_list_var.first();
        }
        return Sequences.length(inferences);
    }

    @SubL(source = "cycl/inference/harness/inference-datastructures-inference.lisp", position = 24000L)
    public static SubLObject destroy_inference(SubLObject inference) {
        if (NIL != valid_inference_p(inference)) {
            try {
                inference_strategist.inference_abort_if_running(inference);
            } finally {
                SubLObject _prev_bind_0 = Dynamic.currentBinding(Threads.$is_thread_performing_cleanupP$);
                try {
                    Dynamic.bind(Threads.$is_thread_performing_cleanupP$, T);
                    SubLObject _values = Values.getValuesAsVector();
                    note_inference_invalid(inference);
                    SubLObject set_var = inference_strategy_set(inference);
                    SubLObject set_contents_var = set.do_set_internal(set_var);
                    SubLObject basis_object;
                    SubLObject state;
                    SubLObject strategy;
                    for (basis_object = set_contents.do_set_contents_basis_object(set_contents_var), state = NIL, state = set_contents.do_set_contents_initial_state(basis_object, set_contents_var); NIL == set_contents.do_set_contents_doneP(basis_object,
                            state); state = set_contents.do_set_contents_update_state(state)) {
                        strategy = set_contents.do_set_contents_next(basis_object, state);
                        if (NIL != set_contents.do_set_contents_element_validP(state, strategy)) {
                            inference_datastructures_strategy.destroy_inference_strategy(strategy);
                        }
                    }
                    SubLObject root_link = inference_root_link(inference);
                    inference_datastructures_problem_link.destroy_problem_link(root_link);
                    SubLObject store = inference_problem_store(inference);
                    inference_datastructures_problem_store.remove_problem_store_inference(store, inference);
                    destroy_inference_int(inference);
                    Values.restoreValuesFromVector(_values);
                } finally {
                    Dynamic.rebind(Threads.$is_thread_performing_cleanupP$, _prev_bind_0);
                }
            }
        }
        return NIL;
    }

    @SubL(source = "cycl/inference/harness/inference-datastructures-inference.lisp", position = 24800L)
    public static SubLObject destroy_inference_and_problem_store(SubLObject inference) {
        if (NIL != inference_p(inference)) {
            SubLObject store = inference_problem_store(inference);
            destroy_inference(inference);
            inference_datastructures_problem_store.destroy_problem_store(store);
        }
        return NIL;
    }

    @SubL(source = "cycl/inference/harness/inference-datastructures-inference.lisp", position = 25300L)
    public static SubLObject destroy_problem_store_inference(SubLObject inference) {
        if (NIL != valid_inference_p(inference)) {
            inference_strategist.inference_abort_if_running(inference);
            note_inference_invalid(inference);
            return destroy_inference_int(inference);
        }
        return NIL;
    }

    @SubL(source = "cycl/inference/harness/inference-datastructures-inference.lisp", position = 25500L)
    public static SubLObject destroy_inference_int(SubLObject inf) {
        inference_datastructures_forward_propagate.destroy_forward_propagate(infrnc_forward_propagate(inf));
        _csetf_infrnc_problem_store(inf, $FREE);
        _csetf_infrnc_forward_propagate(inf, $FREE);
        _csetf_infrnc_input_mt(inf, $FREE);
        _csetf_infrnc_input_el_query(inf, $FREE);
        _csetf_infrnc_input_non_explanatory_el_query(inf, $FREE);
        _csetf_infrnc_input_query_properties(inf, $FREE);
        _csetf_infrnc_mt(inf, $FREE);
        _csetf_infrnc_el_query(inf, $FREE);
        _csetf_infrnc_el_bindings(inf, $FREE);
        _csetf_infrnc_hl_query(inf, $FREE);
        _csetf_infrnc_explanatory_subquery(inf, $FREE);
        _csetf_infrnc_non_explanatory_subquery(inf, $FREE);
        _csetf_infrnc_free_hl_vars(inf, $FREE);
        _csetf_infrnc_hypothetical_bindings(inf, $FREE);
        id_index.clear_id_index(infrnc_answer_id_index(inf));
        _csetf_infrnc_answer_id_index(inf, $FREE);
        dictionary.clear_dictionary(infrnc_answer_bindings_index(inf));
        _csetf_infrnc_answer_bindings_index(inf, $FREE);
        _csetf_infrnc_new_answer_id_start(inf, $FREE);
        queues.clear_queue(infrnc_new_answer_justifications(inf));
        _csetf_infrnc_new_answer_justifications(inf, $FREE);
        _csetf_infrnc_suspend_status(inf, $FREE);
        _csetf_infrnc_root_link(inf, $FREE);
        clear_inference_relevant_problems(inf);
        _csetf_infrnc_relevant_problems(inf, $FREE);
        clear_inference_strategy_set(inf);
        _csetf_infrnc_strategy_set(inf, $FREE);
        clear_inference_control_process(inf);
        _csetf_infrnc_control_process(inf, $FREE);
        queues.clear_queue(infrnc_interrupting_processes(inf));
        _csetf_infrnc_interrupting_processes(inf, $FREE);
        _csetf_infrnc_max_transformation_depth_reached(inf, $FREE);
        clear_inference_blocking(inf);
        _csetf_infrnc_blockingP(inf, $FREE);
        _csetf_infrnc_disjunction_free_el_vars_policy(inf, $FREE);
        _csetf_infrnc_result_uniqueness_criterion(inf, $FREE);
        _csetf_infrnc_allow_hl_predicate_transformationP(inf, $FREE);
        _csetf_infrnc_allow_unbound_predicate_transformationP(inf, $FREE);
        _csetf_infrnc_allow_evaluatable_predicate_transformationP(inf, $FREE);
        _csetf_infrnc_allow_indeterminate_resultsP(inf, $FREE);
        _csetf_infrnc_allowed_rules(inf, $FREE);
        _csetf_infrnc_forbidden_rules(inf, $FREE);
        _csetf_infrnc_allowed_modules(inf, $FREE);
        _csetf_infrnc_allow_abnormality_checkingP(inf, $FREE);
        _csetf_infrnc_transitive_closure_mode(inf, $FREE);
        _csetf_infrnc_problem_store_privateP(inf, $FREE);
        _csetf_infrnc_continuableP(inf, $FREE);
        _csetf_infrnc_browsableP(inf, $FREE);
        _csetf_infrnc_return_type(inf, $FREE);
        _csetf_infrnc_answer_language(inf, $FREE);
        _csetf_infrnc_cache_resultsP(inf, $FREE);
        _csetf_infrnc_max_number(inf, $FREE);
        _csetf_infrnc_max_time(inf, $FREE);
        _csetf_infrnc_max_step(inf, $FREE);
        _csetf_infrnc_mode(inf, $FREE);
        _csetf_infrnc_forward_max_time(inf, $FREE);
        _csetf_infrnc_max_proof_depth(inf, $FREE);
        _csetf_infrnc_max_transformation_depth(inf, $FREE);
        _csetf_infrnc_min_rule_utility(inf, $FREE);
        _csetf_infrnc_probably_approximately_done(inf, $FREE);
        _csetf_infrnc_metrics_template(inf, $FREE);
        _csetf_infrnc_start_universal_time(inf, $FREE);
        _csetf_infrnc_start_internal_real_time(inf, $FREE);
        _csetf_infrnc_end_internal_real_time(inf, $FREE);
        _csetf_infrnc_pad_internal_real_time(inf, $FREE);
        _csetf_infrnc_hypothesization_time(inf, $FREE);
        _csetf_infrnc_cumulative_time(inf, $FREE);
        _csetf_infrnc_step_count(inf, $FREE);
        _csetf_infrnc_cumulative_step_count(inf, $FREE);
        _csetf_infrnc_events(inf, $FREE);
        _csetf_infrnc_halt_conditions(inf, $FREE);
        _csetf_infrnc_accumulators(inf, $FREE);
        _csetf_infrnc_proof_watermark(inf, $FREE);
        SubLObject lock = inference_problem_working_time_lock(inf);
        if (!lock.isLock()) {
            lock = NIL;
        }
        if (NIL != lock) {
            SubLObject release = NIL;
            try {
                release = Locks.seize_lock(lock);
                _csetf_infrnc_problem_working_time_data(inf, $FREE);
            } finally {
                if (NIL != release) {
                    Locks.release_lock(lock);
                }
            }
        } else {
            _csetf_infrnc_problem_working_time_data(inf, $FREE);
        }
        _csetf_infrnc_type(inf, $FREE);
        _csetf_infrnc_data(inf, $FREE);
        _csetf_infrnc_properties(inf, $FREE);
        return NIL;
    }

    @SubL(source = "cycl/inference/harness/inference-datastructures-inference.lisp", position = 30300L)
    public static SubLObject note_inference_invalid(SubLObject inference) {
        set_inference_status(inference, $DEAD);
        return inference;
    }

    @SubL(source = "cycl/inference/harness/inference-datastructures-inference.lisp", position = 30400L)
    public static SubLObject inference_suid(SubLObject inference) {
        assert NIL != inference_p(inference) : inference;
        return infrnc_suid(inference);
    }

    @SubL(source = "cycl/inference/harness/inference-datastructures-inference.lisp", position = 30600L)
    public static SubLObject inference_problem_store(SubLObject inference) {
        assert NIL != inference_p(inference) : inference;
        return infrnc_problem_store(inference);
    }

    @SubL(source = "cycl/inference/harness/inference-datastructures-inference.lisp", position = 30700L)
    public static SubLObject inference_forward_propagate(SubLObject inference) {
        assert NIL != inference_p(inference) : inference;
        return infrnc_forward_propagate(inference);
    }

    @SubL(source = "cycl/inference/harness/inference-datastructures-inference.lisp", position = 30800L)
    public static SubLObject inference_input_mt(SubLObject inference) {
        assert NIL != inference_p(inference) : inference;
        return infrnc_input_mt(inference);
    }

    @SubL(source = "cycl/inference/harness/inference-datastructures-inference.lisp", position = 31000L)
    public static SubLObject inference_input_el_query(SubLObject inference) {
        assert NIL != inference_p(inference) : inference;
        return infrnc_input_el_query(inference);
    }

    @SubL(source = "cycl/inference/harness/inference-datastructures-inference.lisp", position = 31100L)
    public static SubLObject inference_input_non_explanatory_el_query(SubLObject inference) {
        assert NIL != inference_p(inference) : inference;
        return infrnc_input_non_explanatory_el_query(inference);
    }

    @SubL(source = "cycl/inference/harness/inference-datastructures-inference.lisp", position = 31300L)
    public static SubLObject inference_input_query_properties(SubLObject inference) {
        assert NIL != inference_p(inference) : inference;
        return infrnc_input_query_properties(inference);
    }

    @SubL(source = "cycl/inference/harness/inference-datastructures-inference.lisp", position = 31500L)
    public static SubLObject inference_mt(SubLObject inference) {
        assert NIL != inference_p(inference) : inference;
        return infrnc_mt(inference);
    }

    @SubL(source = "cycl/inference/harness/inference-datastructures-inference.lisp", position = 31600L)
    public static SubLObject inference_el_query(SubLObject inference) {
        assert NIL != inference_p(inference) : inference;
        return infrnc_el_query(inference);
    }

    @SubL(source = "cycl/inference/harness/inference-datastructures-inference.lisp", position = 31700L)
    public static SubLObject inference_el_ist_query(SubLObject inference) {
        assert NIL != inference_p(inference) : inference;
        return el_utilities.make_ist_sentence(infrnc_mt(inference), infrnc_el_query(inference));
    }

    @SubL(source = "cycl/inference/harness/inference-datastructures-inference.lisp", position = 31900L)
    public static SubLObject inference_el_bindings(SubLObject inference) {
        assert NIL != inference_p(inference) : inference;
        return infrnc_el_bindings(inference);
    }

    @SubL(source = "cycl/inference/harness/inference-datastructures-inference.lisp", position = 32100L)
    public static SubLObject inference_hl_query(SubLObject inference) {
        assert NIL != inference_p(inference) : inference;
        return infrnc_hl_query(inference);
    }

    @SubL(source = "cycl/inference/harness/inference-datastructures-inference.lisp", position = 32200L)
    public static SubLObject inference_explanatory_subquery(SubLObject inference) {
        assert NIL != inference_p(inference) : inference;
        return infrnc_explanatory_subquery(inference);
    }

    @SubL(source = "cycl/inference/harness/inference-datastructures-inference.lisp", position = 32400L)
    public static SubLObject inference_non_explanatory_subquery(SubLObject inference) {
        assert NIL != inference_p(inference) : inference;
        return infrnc_non_explanatory_subquery(inference);
    }

    @SubL(source = "cycl/inference/harness/inference-datastructures-inference.lisp", position = 32500L)
    public static SubLObject inference_free_hl_vars(SubLObject inference) {
        assert NIL != inference_p(inference) : inference;
        return infrnc_free_hl_vars(inference);
    }

    @SubL(source = "cycl/inference/harness/inference-datastructures-inference.lisp", position = 32700L)
    public static SubLObject inference_hypothetical_bindings(SubLObject inference) {
        assert NIL != inference_p(inference) : inference;
        return infrnc_hypothetical_bindings(inference);
    }

    @SubL(source = "cycl/inference/harness/inference-datastructures-inference.lisp", position = 32800L)
    public static SubLObject inference_answer_id_index(SubLObject inference) {
        assert NIL != inference_p(inference) : inference;
        return infrnc_answer_id_index(inference);
    }

    @SubL(source = "cycl/inference/harness/inference-datastructures-inference.lisp", position = 33000L)
    public static SubLObject inference_answer_bindings_index(SubLObject inference) {
        assert NIL != inference_p(inference) : inference;
        return infrnc_answer_bindings_index(inference);
    }

    @SubL(source = "cycl/inference/harness/inference-datastructures-inference.lisp", position = 33100L)
    public static SubLObject inference_new_answer_id_start(SubLObject inference) {
        assert NIL != inference_p(inference) : inference;
        return infrnc_new_answer_id_start(inference);
    }

    @SubL(source = "cycl/inference/harness/inference-datastructures-inference.lisp", position = 33300L)
    public static SubLObject inference_new_answer_justifications(SubLObject inference) {
        assert NIL != inference_p(inference) : inference;
        return infrnc_new_answer_justifications(inference);
    }

    @SubL(source = "cycl/inference/harness/inference-datastructures-inference.lisp", position = 33500L)
    public static SubLObject inference_status(SubLObject inference) {
        assert NIL != inference_p(inference) : inference;
        return infrnc_status(inference);
    }

    @SubL(source = "cycl/inference/harness/inference-datastructures-inference.lisp", position = 33700L)
    public static SubLObject inference_suspend_status(SubLObject inference) {
        assert NIL != inference_p(inference) : inference;
        return infrnc_suspend_status(inference);
    }

    @SubL(source = "cycl/inference/harness/inference-datastructures-inference.lisp", position = 33800L)
    public static SubLObject inference_root_link(SubLObject inference) {
        assert NIL != inference_p(inference) : inference;
        return infrnc_root_link(inference);
    }

    @SubL(source = "cycl/inference/harness/inference-datastructures-inference.lisp", position = 34000L)
    public static SubLObject inference_relevant_problems(SubLObject inference) {
        assert NIL != inference_p(inference) : inference;
        return infrnc_relevant_problems(inference);
    }

    @SubL(source = "cycl/inference/harness/inference-datastructures-inference.lisp", position = 34100L)
    public static SubLObject inference_strategy_set(SubLObject inference) {
        assert NIL != inference_p(inference) : inference;
        return infrnc_strategy_set(inference);
    }

    @SubL(source = "cycl/inference/harness/inference-datastructures-inference.lisp", position = 34300L)
    public static SubLObject inference_control_process(SubLObject inference) {
        assert NIL != inference_p(inference) : inference;
        return infrnc_control_process(inference);
    }

    @SubL(source = "cycl/inference/harness/inference-datastructures-inference.lisp", position = 34400L)
    public static SubLObject inference_interrupting_processes(SubLObject inference) {
        assert NIL != inference_p(inference) : inference;
        return infrnc_interrupting_processes(inference);
    }

    @SubL(source = "cycl/inference/harness/inference-datastructures-inference.lisp", position = 34600L)
    public static SubLObject inference_max_transformation_depth_reached(SubLObject inference) {
        assert NIL != inference_p(inference) : inference;
        return infrnc_max_transformation_depth_reached(inference);
    }

    @SubL(source = "cycl/inference/harness/inference-datastructures-inference.lisp", position = 34700L)
    public static SubLObject inference_answer_language(SubLObject inference) {
        assert NIL != inference_p(inference) : inference;
        return infrnc_answer_language(inference);
    }

    @SubL(source = "cycl/inference/harness/inference-datastructures-inference.lisp", position = 34900L)
    public static SubLObject inference_cache_resultsP(SubLObject inference) {
        assert NIL != inference_p(inference) : inference;
        return infrnc_cache_resultsP(inference);
    }

    @SubL(source = "cycl/inference/harness/inference-datastructures-inference.lisp", position = 35000L)
    public static SubLObject inference_blockingP(SubLObject inference) {
        assert NIL != inference_p(inference) : inference;
        return infrnc_blockingP(inference);
    }

    @SubL(source = "cycl/inference/harness/inference-datastructures-inference.lisp", position = 35100L)
    public static SubLObject inference_disjunction_free_el_vars_policy(SubLObject inference) {
        assert NIL != inference_p(inference) : inference;
        return infrnc_disjunction_free_el_vars_policy(inference);
    }

    @SubL(source = "cycl/inference/harness/inference-datastructures-inference.lisp", position = 35300L)
    public static SubLObject inference_result_uniqueness_criterion(SubLObject inference) {
        assert NIL != inference_p(inference) : inference;
        return infrnc_result_uniqueness_criterion(inference);
    }

    @SubL(source = "cycl/inference/harness/inference-datastructures-inference.lisp", position = 35500L)
    public static SubLObject inference_allow_hl_predicate_transformationP(SubLObject inference) {
        assert NIL != inference_p(inference) : inference;
        return infrnc_allow_hl_predicate_transformationP(inference);
    }

    @SubL(source = "cycl/inference/harness/inference-datastructures-inference.lisp", position = 35600L)
    public static SubLObject inference_allow_unbound_predicate_transformationP(SubLObject inference) {
        assert NIL != inference_p(inference) : inference;
        return infrnc_allow_unbound_predicate_transformationP(inference);
    }

    @SubL(source = "cycl/inference/harness/inference-datastructures-inference.lisp", position = 35800L)
    public static SubLObject inference_allow_evaluatable_predicate_transformationP(SubLObject inference) {
        assert NIL != inference_p(inference) : inference;
        return infrnc_allow_evaluatable_predicate_transformationP(inference);
    }

    @SubL(source = "cycl/inference/harness/inference-datastructures-inference.lisp", position = 36000L)
    public static SubLObject inference_allow_indeterminate_resultsP(SubLObject inference) {
        assert NIL != inference_p(inference) : inference;
        return infrnc_allow_indeterminate_resultsP(inference);
    }

    @SubL(source = "cycl/inference/harness/inference-datastructures-inference.lisp", position = 36200L)
    public static SubLObject inference_allowed_rules(SubLObject inference) {
        assert NIL != inference_p(inference) : inference;
        return infrnc_allowed_rules(inference);
    }

    @SubL(source = "cycl/inference/harness/inference-datastructures-inference.lisp", position = 36300L)
    public static SubLObject inference_forbidden_rules(SubLObject inference) {
        assert NIL != inference_p(inference) : inference;
        return infrnc_forbidden_rules(inference);
    }

    @SubL(source = "cycl/inference/harness/inference-datastructures-inference.lisp", position = 36500L)
    public static SubLObject inference_allowed_modules(SubLObject inference) {
        assert NIL != inference_p(inference) : inference;
        return infrnc_allowed_modules(inference);
    }

    @SubL(source = "cycl/inference/harness/inference-datastructures-inference.lisp", position = 36600L)
    public static SubLObject inference_allow_abnormality_checkingP(SubLObject inference) {
        assert NIL != inference_p(inference) : inference;
        return infrnc_allow_abnormality_checkingP(inference);
    }

    @SubL(source = "cycl/inference/harness/inference-datastructures-inference.lisp", position = 36800L)
    public static SubLObject inference_transitive_closure_mode(SubLObject inference) {
        assert NIL != inference_p(inference) : inference;
        return infrnc_transitive_closure_mode(inference);
    }

    @SubL(source = "cycl/inference/harness/inference-datastructures-inference.lisp", position = 36900L)
    public static SubLObject inference_problem_store_privateP(SubLObject inference) {
        assert NIL != inference_p(inference) : inference;
        return infrnc_problem_store_privateP(inference);
    }

    @SubL(source = "cycl/inference/harness/inference-datastructures-inference.lisp", position = 37100L)
    public static SubLObject inference_continuableP(SubLObject inference) {
        assert NIL != inference_p(inference) : inference;
        return infrnc_continuableP(inference);
    }

    @SubL(source = "cycl/inference/harness/inference-datastructures-inference.lisp", position = 37300L)
    public static SubLObject inference_browsableP(SubLObject inference) {
        assert NIL != inference_p(inference) : inference;
        return infrnc_browsableP(inference);
    }

    @SubL(source = "cycl/inference/harness/inference-datastructures-inference.lisp", position = 37500L)
    public static SubLObject inference_return_type(SubLObject inference) {
        assert NIL != inference_p(inference) : inference;
        return infrnc_return_type(inference);
    }

    @SubL(source = "cycl/inference/harness/inference-datastructures-inference.lisp", position = 37700L)
    public static SubLObject inference_max_time(SubLObject inference) {
        assert NIL != inference_p(inference) : inference;
        return infrnc_max_time(inference);
    }

    @SubL(source = "cycl/inference/harness/inference-datastructures-inference.lisp", position = 37900L)
    public static SubLObject inference_max_step(SubLObject inference) {
        assert NIL != inference_p(inference) : inference;
        return infrnc_max_step(inference);
    }

    @SubL(source = "cycl/inference/harness/inference-datastructures-inference.lisp", position = 38100L)
    public static SubLObject inference_mode(SubLObject inference) {
        assert NIL != inference_p(inference) : inference;
        return infrnc_mode(inference);
    }

    @SubL(source = "cycl/inference/harness/inference-datastructures-inference.lisp", position = 38200L)
    public static SubLObject inference_forward_max_time(SubLObject inference) {
        assert NIL != inference_p(inference) : inference;
        return infrnc_forward_max_time(inference);
    }

    @SubL(source = "cycl/inference/harness/inference-datastructures-inference.lisp", position = 38400L)
    public static SubLObject inference_max_number(SubLObject inference) {
        assert NIL != inference_p(inference) : inference;
        return infrnc_max_number(inference);
    }

    @SubL(source = "cycl/inference/harness/inference-datastructures-inference.lisp", position = 38700L)
    public static SubLObject inference_max_proof_depth(SubLObject inference) {
        assert NIL != inference_p(inference) : inference;
        return infrnc_max_proof_depth(inference);
    }

    @SubL(source = "cycl/inference/harness/inference-datastructures-inference.lisp", position = 38900L)
    public static SubLObject inference_max_transformation_depth(SubLObject inference) {
        assert NIL != inference_p(inference) : inference;
        return infrnc_max_transformation_depth(inference);
    }

    @SubL(source = "cycl/inference/harness/inference-datastructures-inference.lisp", position = 39000L)
    public static SubLObject inference_min_rule_utility(SubLObject inference) {
        assert NIL != inference_p(inference) : inference;
        return infrnc_min_rule_utility(inference);
    }

    @SubL(source = "cycl/inference/harness/inference-datastructures-inference.lisp", position = 39200L)
    public static SubLObject inference_probably_approximately_done(SubLObject inference) {
        assert NIL != inference_p(inference) : inference;
        return infrnc_probably_approximately_done(inference);
    }

    @SubL(source = "cycl/inference/harness/inference-datastructures-inference.lisp", position = 39400L)
    public static SubLObject inference_metrics_template(SubLObject inference) {
        assert NIL != inference_p(inference) : inference;
        return infrnc_metrics_template(inference);
    }

    @SubL(source = "cycl/inference/harness/inference-datastructures-inference.lisp", position = 39600L)
    public static SubLObject inference_start_universal_time(SubLObject inference) {
        assert NIL != inference_p(inference) : inference;
        return infrnc_start_universal_time(inference);
    }

    @SubL(source = "cycl/inference/harness/inference-datastructures-inference.lisp", position = 39700L)
    public static SubLObject inference_start_internal_real_time(SubLObject inference) {
        assert NIL != inference_p(inference) : inference;
        return infrnc_start_internal_real_time(inference);
    }

    @SubL(source = "cycl/inference/harness/inference-datastructures-inference.lisp", position = 39900L)
    public static SubLObject inference_end_internal_real_time(SubLObject inference) {
        assert NIL != inference_p(inference) : inference;
        return infrnc_end_internal_real_time(inference);
    }

    @SubL(source = "cycl/inference/harness/inference-datastructures-inference.lisp", position = 40000L)
    public static SubLObject inference_pad_internal_real_time(SubLObject inference) {
        assert NIL != inference_p(inference) : inference;
        return infrnc_pad_internal_real_time(inference);
    }

    @SubL(source = "cycl/inference/harness/inference-datastructures-inference.lisp", position = 40200L)
    public static SubLObject inference_hypothesization_time(SubLObject inference) {
        assert NIL != inference_p(inference) : inference;
        return infrnc_hypothesization_time(inference);
    }

    @SubL(source = "cycl/inference/harness/inference-datastructures-inference.lisp", position = 40600L)
    public static SubLObject inference_cumulative_time(SubLObject inference) {
        assert NIL != inference_p(inference) : inference;
        return infrnc_cumulative_time(inference);
    }

    @SubL(source = "cycl/inference/harness/inference-datastructures-inference.lisp", position = 41000L)
    public static SubLObject inference_step_count(SubLObject inference) {
        assert NIL != inference_p(inference) : inference;
        return infrnc_step_count(inference);
    }

    @SubL(source = "cycl/inference/harness/inference-datastructures-inference.lisp", position = 41200L)
    public static SubLObject inference_cumulative_step_count(SubLObject inference) {
        assert NIL != inference_p(inference) : inference;
        return infrnc_cumulative_step_count(inference);
    }

    @SubL(source = "cycl/inference/harness/inference-datastructures-inference.lisp", position = 41400L)
    public static SubLObject inference_problem_working_time_data(SubLObject inference) {
        assert NIL != inference_p(inference) : inference;
        return infrnc_problem_working_time_data(inference);
    }

    @SubL(source = "cycl/inference/harness/inference-datastructures-inference.lisp", position = 41600L)
    public static SubLObject inference_events(SubLObject inference) {
        assert NIL != inference_p(inference) : inference;
        return infrnc_events(inference);
    }

    @SubL(source = "cycl/inference/harness/inference-datastructures-inference.lisp", position = 41700L)
    public static SubLObject inference_accumulators(SubLObject inference) {
        assert NIL != inference_p(inference) : inference;
        return infrnc_accumulators(inference);
    }

    @SubL(source = "cycl/inference/harness/inference-datastructures-inference.lisp", position = 41800L)
    public static SubLObject inference_proof_watermark(SubLObject inference) {
        assert NIL != inference_p(inference) : inference;
        return infrnc_proof_watermark(inference);
    }

    @SubL(source = "cycl/inference/harness/inference-datastructures-inference.lisp", position = 42000L)
    public static SubLObject inference_type(SubLObject inference) {
        assert NIL != inference_p(inference) : inference;
        return infrnc_type(inference);
    }

    @SubL(source = "cycl/inference/harness/inference-datastructures-inference.lisp", position = 42100L)
    public static SubLObject inference_data(SubLObject inference) {
        assert NIL != inference_p(inference) : inference;
        return infrnc_data(inference);
    }

    @SubL(source = "cycl/inference/harness/inference-datastructures-inference.lisp", position = 42200L)
    public static SubLObject inference_properties(SubLObject inference) {
        assert NIL != inference_p(inference) : inference;
        return infrnc_properties(inference);
    }

    @SubL(source = "cycl/inference/harness/inference-datastructures-inference.lisp", position = 42300L)
    public static SubLObject set_inference_forward_propagate(SubLObject inference, SubLObject forward_propagate) {
        assert NIL != inference_p(inference) : inference;
        if (NIL != forward_propagate && !assertionsDisabledInClass && NIL == inference_datastructures_forward_propagate.forward_propagate_p(forward_propagate)) {
            throw new AssertionError(forward_propagate);
        }
        _csetf_infrnc_forward_propagate(inference, forward_propagate);
        return inference;
    }

    @SubL(source = "cycl/inference/harness/inference-datastructures-inference.lisp", position = 42600L)
    public static SubLObject set_inference_input_mt(SubLObject inference, SubLObject mt) {
        assert NIL != inference_p(inference) : inference;
        if (NIL != mt && !assertionsDisabledInClass && NIL == hlmt.possibly_mt_p(mt)) {
            throw new AssertionError(mt);
        }
        _csetf_infrnc_input_mt(inference, mt);
        return inference;
    }

    @SubL(source = "cycl/inference/harness/inference-datastructures-inference.lisp", position = 42800L)
    public static SubLObject set_inference_input_el_query(SubLObject inference, SubLObject el_query) {
        assert NIL != inference_p(inference) : inference;
        if (NIL != el_query && !assertionsDisabledInClass && NIL == el_utilities.possibly_inference_sentence_p(el_query)) {
            throw new AssertionError(el_query);
        }
        _csetf_infrnc_input_el_query(inference, el_query);
        return inference;
    }

    @SubL(source = "cycl/inference/harness/inference-datastructures-inference.lisp", position = 43100L)
    public static SubLObject set_inference_input_non_explanatory_el_query(SubLObject inference, SubLObject el_query) {
        assert NIL != inference_p(inference) : inference;
        if (NIL != el_query && !assertionsDisabledInClass && NIL == el_utilities.possibly_inference_sentence_p(el_query)) {
            throw new AssertionError(el_query);
        }
        _csetf_infrnc_input_non_explanatory_el_query(inference, el_query);
        return inference;
    }

    @SubL(source = "cycl/inference/harness/inference-datastructures-inference.lisp", position = 43300L)
    public static SubLObject set_inference_input_query_properties(SubLObject inference, SubLObject query_properties) {
        assert NIL != inference_p(inference) : inference;
        if (NIL != query_properties && !assertionsDisabledInClass && NIL == inference_datastructures_enumerated_types.query_properties_p(query_properties)) {
            throw new AssertionError(query_properties);
        }
        _csetf_infrnc_input_query_properties(inference, query_properties);
        return inference;
    }

    @SubL(source = "cycl/inference/harness/inference-datastructures-inference.lisp", position = 43600L)
    public static SubLObject set_inference_mt(SubLObject inference, SubLObject mt) {
        assert NIL != inference_p(inference) : inference;
        if (NIL != mt && !assertionsDisabledInClass && NIL == hlmt.hlmt_p(mt)) {
            throw new AssertionError(mt);
        }
        _csetf_infrnc_mt(inference, mt);
        return inference;
    }

    @SubL(source = "cycl/inference/harness/inference-datastructures-inference.lisp", position = 43800L)
    public static SubLObject set_inference_el_query(SubLObject inference, SubLObject el_query) {
        assert NIL != inference_p(inference) : inference;
        if (NIL != el_query && !assertionsDisabledInClass && NIL == el_utilities.possibly_inference_sentence_p(el_query)) {
            throw new AssertionError(el_query);
        }
        _csetf_infrnc_el_query(inference, el_query);
        return inference;
    }

    @SubL(source = "cycl/inference/harness/inference-datastructures-inference.lisp", position = 44000L)
    public static SubLObject set_inference_el_bindings(SubLObject inference, SubLObject el_bindings) {
        assert NIL != inference_p(inference) : inference;
        assert NIL != bindings.binding_list_p(el_bindings) : el_bindings;
        _csetf_infrnc_el_bindings(inference, el_bindings);
        return inference;
    }

    @SubL(source = "cycl/inference/harness/inference-datastructures-inference.lisp", position = 44200L)
    public static SubLObject set_inference_hl_query(SubLObject inference, SubLObject hl_query) {
        assert NIL != inference_p(inference) : inference;
        assert NIL != inference_datastructures_problem_query.problem_query_p(hl_query) : hl_query;
        _csetf_infrnc_hl_query(inference, hl_query);
        return inference;
    }

    @SubL(source = "cycl/inference/harness/inference-datastructures-inference.lisp", position = 44400L)
    public static SubLObject set_inference_explanatory_subquery(SubLObject inference, SubLObject explanatory_subquery) {
        assert NIL != inference_p(inference) : inference;
        assert NIL != inference_datastructures_problem_query.explanatory_subquery_spec_p(explanatory_subquery) : explanatory_subquery;
        _csetf_infrnc_explanatory_subquery(inference, explanatory_subquery);
        return inference;
    }

    @SubL(source = "cycl/inference/harness/inference-datastructures-inference.lisp", position = 44700L)
    public static SubLObject set_inference_non_explanatory_subquery(SubLObject inference, SubLObject non_explanatory_subquery) {
        assert NIL != inference_p(inference) : inference;
        assert NIL != inference_datastructures_problem_query.non_explanatory_subquery_spec_p(non_explanatory_subquery) : non_explanatory_subquery;
        _csetf_infrnc_non_explanatory_subquery(inference, non_explanatory_subquery);
        return inference;
    }

    @SubL(source = "cycl/inference/harness/inference-datastructures-inference.lisp", position = 45000L)
    public static SubLObject set_inference_free_hl_vars(SubLObject inference, SubLObject free_hl_vars) {
        assert NIL != inference_p(inference) : inference;
        assert NIL != Types.listp(free_hl_vars) : free_hl_vars;
        _csetf_infrnc_free_hl_vars(inference, free_hl_vars);
        return inference;
    }

    @SubL(source = "cycl/inference/harness/inference-datastructures-inference.lisp", position = 45200L)
    public static SubLObject set_inference_hypothetical_bindings(SubLObject inference, SubLObject hypothetical_bindings) {
        assert NIL != inference_p(inference) : inference;
        if (NIL != hypothetical_bindings && !assertionsDisabledInClass && NIL == bindings.binding_list_p(hypothetical_bindings)) {
            throw new AssertionError(hypothetical_bindings);
        }
        _csetf_infrnc_hypothetical_bindings(inference, hypothetical_bindings);
        return inference;
    }

    @SubL(source = "cycl/inference/harness/inference-datastructures-inference.lisp", position = 45500L)
    public static SubLObject set_inference_status(SubLObject inference, SubLObject status) {
        assert NIL != inference_p(inference) : inference;
        assert NIL != inference_datastructures_enumerated_types.inference_status_p(status) : status;
        _csetf_infrnc_status(inference, status);
        if (NIL == inference_datastructures_enumerated_types.inference_suspend_status_applicableP(status)) {
            _csetf_infrnc_suspend_status(inference, NIL);
        }
        possibly_signal_inference_status_change(inference);
        return inference;
    }

    @SubL(source = "cycl/inference/harness/inference-datastructures-inference.lisp", position = 46000L)
    public static SubLObject set_inference_suspend_status(SubLObject inference, SubLObject suspend_status) {
        assert NIL != inference_p(inference) : inference;
        assert NIL != inference_datastructures_enumerated_types.inference_suspend_status_p(suspend_status) : suspend_status;
        _csetf_infrnc_suspend_status(inference, suspend_status);
        return inference;
    }

    @SubL(source = "cycl/inference/harness/inference-datastructures-inference.lisp", position = 46200L)
    public static SubLObject set_inference_root_link(SubLObject inference, SubLObject root_link) {
        assert NIL != inference_p(inference) : inference;
        assert NIL != inference_worker_answer.answer_link_p(root_link) : root_link;
        _csetf_infrnc_root_link(inference, root_link);
        return inference;
    }

    @SubL(source = "cycl/inference/harness/inference-datastructures-inference.lisp", position = 46400L)
    public static SubLObject set_inference_control_process(SubLObject inference, SubLObject process) {
        assert NIL != inference_p(inference) : inference;
        if (NIL != process && !assertionsDisabledInClass && NIL == Types.processp(process)) {
            throw new AssertionError(process);
        }
        _csetf_infrnc_control_process(inference, process);
        return inference;
    }

    @SubL(source = "cycl/inference/harness/inference-datastructures-inference.lisp", position = 46600L)
    public static SubLObject set_inference_max_transformation_depth_reached(SubLObject inference, SubLObject depth) {
        assert NIL != inference_p(inference) : inference;
        assert NIL != subl_promotions.non_negative_integer_p(depth) : depth;
        _csetf_infrnc_max_transformation_depth_reached(inference, depth);
        return inference;
    }

    @SubL(source = "cycl/inference/harness/inference-datastructures-inference.lisp", position = 46900L)
    public static SubLObject set_inference_disjunction_free_el_vars_policy(SubLObject inference, SubLObject disjunction_free_el_vars_policy) {
        assert NIL != inference_p(inference) : inference;
        assert NIL != inference_datastructures_enumerated_types.inference_disjunction_free_el_vars_policy_p(disjunction_free_el_vars_policy) : disjunction_free_el_vars_policy;
        _csetf_infrnc_disjunction_free_el_vars_policy(inference, disjunction_free_el_vars_policy);
        return inference;
    }

    @SubL(source = "cycl/inference/harness/inference-datastructures-inference.lisp", position = 47200L)
    public static SubLObject set_inference_result_uniqueness_criterion(SubLObject inference, SubLObject criterion) {
        assert NIL != inference_p(inference) : inference;
        assert NIL != inference_datastructures_enumerated_types.result_uniqueness_criterion_p(criterion) : criterion;
        _csetf_infrnc_result_uniqueness_criterion(inference, criterion);
        return inference;
    }

    @SubL(source = "cycl/inference/harness/inference-datastructures-inference.lisp", position = 47500L)
    public static SubLObject set_inference_allow_hl_predicate_transformation(SubLObject inference, SubLObject allowP) {
        assert NIL != inference_p(inference) : inference;
        assert NIL != Types.booleanp(allowP) : allowP;
        _csetf_infrnc_allow_hl_predicate_transformationP(inference, allowP);
        return inference;
    }

    @SubL(source = "cycl/inference/harness/inference-datastructures-inference.lisp", position = 47700L)
    public static SubLObject set_inference_allow_unbound_predicate_transformation(SubLObject inference, SubLObject allowP) {
        assert NIL != inference_p(inference) : inference;
        assert NIL != Types.booleanp(allowP) : allowP;
        _csetf_infrnc_allow_unbound_predicate_transformationP(inference, allowP);
        return inference;
    }

    @SubL(source = "cycl/inference/harness/inference-datastructures-inference.lisp", position = 48000L)
    public static SubLObject set_inference_allow_evaluatable_predicate_transformation(SubLObject inference, SubLObject allowP) {
        assert NIL != inference_p(inference) : inference;
        assert NIL != Types.booleanp(allowP) : allowP;
        _csetf_infrnc_allow_evaluatable_predicate_transformationP(inference, allowP);
        return inference;
    }

    @SubL(source = "cycl/inference/harness/inference-datastructures-inference.lisp", position = 48300L)
    public static SubLObject set_inference_allow_indeterminate_results(SubLObject inference, SubLObject allowP) {
        assert NIL != inference_p(inference) : inference;
        assert NIL != Types.booleanp(allowP) : allowP;
        _csetf_infrnc_allow_indeterminate_resultsP(inference, allowP);
        return inference;
    }

    @SubL(source = "cycl/inference/harness/inference-datastructures-inference.lisp", position = 48500L)
    public static SubLObject set_inference_allowed_rules(SubLObject inference, SubLObject allowed_rules) {
        assert NIL != inference_p(inference) : inference;
        _csetf_infrnc_allowed_rules(inference, allowed_rules);
        return inference;
    }

    @SubL(source = "cycl/inference/harness/inference-datastructures-inference.lisp", position = 48800L)
    public static SubLObject set_inference_forbidden_rules(SubLObject inference, SubLObject forbidden_rules) {
        assert NIL != inference_p(inference) : inference;
        _csetf_infrnc_forbidden_rules(inference, forbidden_rules);
        return inference;
    }

    @SubL(source = "cycl/inference/harness/inference-datastructures-inference.lisp", position = 49100L)
    public static SubLObject set_inference_allowed_modules(SubLObject inference, SubLObject allowed_modules) {
        assert NIL != inference_p(inference) : inference;
        assert NIL != inference_modules.allowed_modules_spec_p(allowed_modules) : allowed_modules;
        _csetf_infrnc_allowed_modules(inference, allowed_modules);
        return inference;
    }

    @SubL(source = "cycl/inference/harness/inference-datastructures-inference.lisp", position = 49400L)
    public static SubLObject set_inference_allow_abnormality_checking(SubLObject inference, SubLObject allowP) {
        assert NIL != inference_p(inference) : inference;
        assert NIL != Types.booleanp(allowP) : allowP;
        _csetf_infrnc_allow_abnormality_checkingP(inference, allowP);
        return inference;
    }

    @SubL(source = "cycl/inference/harness/inference-datastructures-inference.lisp", position = 49600L)
    public static SubLObject set_inference_transitive_closure_mode(SubLObject inference, SubLObject transitive_closure_mode) {
        assert NIL != inference_p(inference) : inference;
        assert NIL != inference_datastructures_enumerated_types.inference_transitive_closure_mode_p(transitive_closure_mode) : transitive_closure_mode;
        _csetf_infrnc_transitive_closure_mode(inference, transitive_closure_mode);
        return inference;
    }

    @SubL(source = "cycl/inference/harness/inference-datastructures-inference.lisp", position = 49900L)
    public static SubLObject set_inference_problem_store_private(SubLObject inference, SubLObject privateP) {
        assert NIL != inference_p(inference) : inference;
        assert NIL != Types.booleanp(privateP) : privateP;
        _csetf_infrnc_problem_store_privateP(inference, privateP);
        return inference;
    }

    @SubL(source = "cycl/inference/harness/inference-datastructures-inference.lisp", position = 50100L)
    public static SubLObject set_inference_continuable(SubLObject inference, SubLObject continuableP) {
        assert NIL != Types.booleanp(continuableP) : continuableP;
        _csetf_infrnc_continuableP(inference, continuableP);
        return inference;
    }

    @SubL(source = "cycl/inference/harness/inference-datastructures-inference.lisp", position = 50300L)
    public static SubLObject set_inference_browsable(SubLObject inference, SubLObject browsableP) {
        assert NIL != Types.booleanp(browsableP) : browsableP;
        _csetf_infrnc_browsableP(inference, browsableP);
        return inference;
    }

    @SubL(source = "cycl/inference/harness/inference-datastructures-inference.lisp", position = 50600L)
    public static SubLObject set_inference_return_type(SubLObject inference, SubLObject return_type) {
        assert NIL != inference_datastructures_enumerated_types.inference_return_type_p(return_type) : return_type;
        _csetf_infrnc_return_type(inference, return_type);
        return inference;
    }

    @SubL(source = "cycl/inference/harness/inference-datastructures-inference.lisp", position = 50800L)
    public static SubLObject set_inference_answer_language(SubLObject inference, SubLObject answer_language) {
        assert NIL != inference_p(inference) : inference;
        assert NIL != inference_datastructures_enumerated_types.inference_answer_language_p(answer_language) : answer_language;
        _csetf_infrnc_answer_language(inference, answer_language);
        return inference;
    }

    @SubL(source = "cycl/inference/harness/inference-datastructures-inference.lisp", position = 51000L)
    public static SubLObject set_inference_cache_results(SubLObject inference, SubLObject cache_resultsP) {
        assert NIL != inference_p(inference) : inference;
        assert NIL != Types.booleanp(cache_resultsP) : cache_resultsP;
        _csetf_infrnc_cache_resultsP(inference, cache_resultsP);
        return inference;
    }

    @SubL(source = "cycl/inference/harness/inference-datastructures-inference.lisp", position = 51300L)
    public static SubLObject note_inference_blocking(SubLObject inference) {
        assert NIL != inference_p(inference) : inference;
        _csetf_infrnc_blockingP(inference, T);
        return inference;
    }

    @SubL(source = "cycl/inference/harness/inference-datastructures-inference.lisp", position = 51400L)
    public static SubLObject clear_inference_blocking(SubLObject inference) {
        assert NIL != inference_p(inference) : inference;
        _csetf_infrnc_blockingP(inference, NIL);
        return inference;
    }

    @SubL(source = "cycl/inference/harness/inference-datastructures-inference.lisp", position = 51600L)
    public static SubLObject set_inference_max_number(SubLObject inference, SubLObject max_number) {
        if (NIL != max_number && !assertionsDisabledInClass && NIL == subl_promotions.non_negative_integer_p(max_number)) {
            throw new AssertionError(max_number);
        }
        _csetf_infrnc_max_number(inference, max_number);
        return inference;
    }

    @SubL(source = "cycl/inference/harness/inference-datastructures-inference.lisp", position = 51800L)
    public static SubLObject set_inference_max_time(SubLObject inference, SubLObject max_time) {
        if (NIL != max_time && !assertionsDisabledInClass && NIL == number_utilities.non_negative_number_p(max_time)) {
            throw new AssertionError(max_time);
        }
        _csetf_infrnc_max_time(inference, max_time);
        return inference;
    }

    @SubL(source = "cycl/inference/harness/inference-datastructures-inference.lisp", position = 52000L)
    public static SubLObject set_inference_max_step(SubLObject inference, SubLObject max_step) {
        if (NIL != max_step && !assertionsDisabledInClass && NIL == subl_promotions.non_negative_integer_p(max_step)) {
            throw new AssertionError(max_step);
        }
        _csetf_infrnc_max_step(inference, max_step);
        return inference;
    }

    @SubL(source = "cycl/inference/harness/inference-datastructures-inference.lisp", position = 52300L)
    public static SubLObject set_inference_mode(SubLObject inference, SubLObject mode) {
        assert NIL != inference_datastructures_enumerated_types.inference_mode_p(mode) : mode;
        _csetf_infrnc_mode(inference, mode);
        return inference;
    }

    @SubL(source = "cycl/inference/harness/inference-datastructures-inference.lisp", position = 52400L)
    public static SubLObject set_inference_forward_max_time(SubLObject inference, SubLObject forward_max_time) {
        if (NIL != forward_max_time && !assertionsDisabledInClass && NIL == number_utilities.non_negative_number_p(forward_max_time)) {
            throw new AssertionError(forward_max_time);
        }
        SubLObject max_time = inference_max_time(inference);
        if (max_time.isInteger() && forward_max_time.isInteger() && max_time.numL(forward_max_time)) {
            Errors.error($str373$Forward_max_time__s_cannot_be_gre, forward_max_time, max_time);
        }
        _csetf_infrnc_forward_max_time(inference, forward_max_time);
        return inference;
    }

    @SubL(source = "cycl/inference/harness/inference-datastructures-inference.lisp", position = 53000L)
    public static SubLObject set_inference_max_proof_depth(SubLObject inference, SubLObject max_proof_depth) {
        if (NIL != max_proof_depth && !assertionsDisabledInClass && NIL == subl_promotions.non_negative_integer_p(max_proof_depth)) {
            throw new AssertionError(max_proof_depth);
        }
        _csetf_infrnc_max_proof_depth(inference, max_proof_depth);
        return inference;
    }

    @SubL(source = "cycl/inference/harness/inference-datastructures-inference.lisp", position = 53200L)
    public static SubLObject set_inference_max_transformation_depth(SubLObject inference, SubLObject max_transformation_depth) {
        if (NIL != max_transformation_depth && !assertionsDisabledInClass && NIL == subl_promotions.non_negative_integer_p(max_transformation_depth)) {
            throw new AssertionError(max_transformation_depth);
        }
        _csetf_infrnc_max_transformation_depth(inference, max_transformation_depth);
        return inference;
    }

    @SubL(source = "cycl/inference/harness/inference-datastructures-inference.lisp", position = 53500L)
    public static SubLObject set_inference_min_rule_utility(SubLObject inference, SubLObject min_rule_utility) {
        assert NIL != inference_analysis.rule_utility_p(min_rule_utility) : min_rule_utility;
        _csetf_infrnc_min_rule_utility(inference, min_rule_utility);
        return inference;
    }

    @SubL(source = "cycl/inference/harness/inference-datastructures-inference.lisp", position = 53800L)
    public static SubLObject set_inference_probably_approximately_done(SubLObject inference, SubLObject probability) {
        assert NIL != number_utilities.probability_p(probability) : probability;
        _csetf_infrnc_probably_approximately_done(inference, probability);
        return inference;
    }

    @SubL(source = "cycl/inference/harness/inference-datastructures-inference.lisp", position = 54000L)
    public static SubLObject set_inference_metrics_template(SubLObject inference, SubLObject metrics_template) {
        assert NIL != list_utilities.non_dotted_list_p(metrics_template) : metrics_template;
        SubLObject cdolist_list_var = metrics_template;
        SubLObject elem = NIL;
        elem = cdolist_list_var.first();
        while (NIL != cdolist_list_var) {
            assert NIL != inference_datastructures_enumerated_types.query_metric_p(elem) : elem;
            cdolist_list_var = cdolist_list_var.rest();
            elem = cdolist_list_var.first();
        }
        _csetf_infrnc_metrics_template(inference, metrics_template);
        return inference;
    }

    @SubL(source = "cycl/inference/harness/inference-datastructures-inference.lisp", position = 54300L)
    public static SubLObject set_inference_start_universal_time(SubLObject inference, SubLObject universal_time) {
        assert NIL != inference_p(inference) : inference;
        assert NIL != numeric_date_utilities.universal_time_p(universal_time) : universal_time;
        _csetf_infrnc_start_universal_time(inference, universal_time);
        return inference;
    }

    @SubL(source = "cycl/inference/harness/inference-datastructures-inference.lisp", position = 54500L)
    public static SubLObject set_inference_start_internal_real_time(SubLObject inference, SubLObject internal_real_time) {
        assert NIL != inference_p(inference) : inference;
        assert NIL != subl_promotions.non_negative_integer_p(internal_real_time) : internal_real_time;
        _csetf_infrnc_start_internal_real_time(inference, internal_real_time);
        return inference;
    }

    @SubL(source = "cycl/inference/harness/inference-datastructures-inference.lisp", position = 54800L)
    public static SubLObject set_inference_end_internal_real_time(SubLObject inference, SubLObject end_internal_real_time) {
        assert NIL != inference_p(inference) : inference;
        if (NIL != end_internal_real_time && !assertionsDisabledInClass && NIL == subl_promotions.non_negative_integer_p(end_internal_real_time)) {
            throw new AssertionError(end_internal_real_time);
        }
        _csetf_infrnc_end_internal_real_time(inference, end_internal_real_time);
        return inference;
    }

    @SubL(source = "cycl/inference/harness/inference-datastructures-inference.lisp", position = 55100L)
    public static SubLObject set_inference_pad_internal_real_time(SubLObject inference, SubLObject pad_internal_real_time) {
        assert NIL != inference_p(inference) : inference;
        if (NIL != pad_internal_real_time && !assertionsDisabledInClass && NIL == number_utilities.potentially_infinite_integer_p(pad_internal_real_time)) {
            throw new AssertionError(pad_internal_real_time);
        }
        _csetf_infrnc_pad_internal_real_time(inference, pad_internal_real_time);
        return inference;
    }

    @SubL(source = "cycl/inference/harness/inference-datastructures-inference.lisp", position = 55400L)
    public static SubLObject set_inference_hypothesization_time(SubLObject inference, SubLObject hypothesization_time) {
        assert NIL != inference_p(inference) : inference;
        assert NIL != Types.numberp(hypothesization_time) : hypothesization_time;
        _csetf_infrnc_hypothesization_time(inference, hypothesization_time);
        return inference;
    }

    @SubL(source = "cycl/inference/harness/inference-datastructures-inference.lisp", position = 55600L)
    public static SubLObject set_inference_cumulative_time(SubLObject inference, SubLObject cumulative_time) {
        assert NIL != inference_p(inference) : inference;
        assert NIL != Types.numberp(cumulative_time) : cumulative_time;
        _csetf_infrnc_cumulative_time(inference, cumulative_time);
        return inference;
    }

    @SubL(source = "cycl/inference/harness/inference-datastructures-inference.lisp", position = 55900L)
    public static SubLObject set_inference_step_count(SubLObject inference, SubLObject step_count) {
        assert NIL != subl_promotions.non_negative_integer_p(step_count) : step_count;
        _csetf_infrnc_step_count(inference, step_count);
        return inference;
    }

    @SubL(source = "cycl/inference/harness/inference-datastructures-inference.lisp", position = 56100L)
    public static SubLObject increment_inference_step_count(SubLObject inference) {
        _csetf_infrnc_step_count(inference, Numbers.add(infrnc_step_count(inference), ONE_INTEGER));
        return inference;
    }

    @SubL(source = "cycl/inference/harness/inference-datastructures-inference.lisp", position = 56300L)
    public static SubLObject set_inference_cumulative_step_count(SubLObject inference, SubLObject cumulative_step_count) {
        assert NIL != subl_promotions.non_negative_integer_p(cumulative_step_count) : cumulative_step_count;
        _csetf_infrnc_cumulative_step_count(inference, cumulative_step_count);
        return inference;
    }

    @SubL(source = "cycl/inference/harness/inference-datastructures-inference.lisp", position = 56500L)
    public static SubLObject increment_inference_cumulative_step_count(SubLObject inference) {
        _csetf_infrnc_cumulative_step_count(inference, Numbers.add(infrnc_cumulative_step_count(inference), ONE_INTEGER));
        return inference;
    }

    @SubL(source = "cycl/inference/harness/inference-datastructures-inference.lisp", position = 56700L)
    public static SubLObject set_inference_problem_working_time_data(SubLObject inference, SubLObject data) {
        assert NIL != inference_p(inference) : inference;
        assert NIL != Types.listp(data) : data;
        _csetf_infrnc_problem_working_time_data(inference, data);
        return inference;
    }

    @SubL(source = "cycl/inference/harness/inference-datastructures-inference.lisp", position = 56900L)
    public static SubLObject set_inference_events(SubLObject inference, SubLObject event_types) {
        assert NIL != inference_p(inference) : inference;
        assert NIL != list_utilities.non_dotted_list_p(event_types) : event_types;
        SubLObject cdolist_list_var = event_types;
        SubLObject elem = NIL;
        elem = cdolist_list_var.first();
        while (NIL != cdolist_list_var) {
            assert NIL != inference_datastructures_enumerated_types.inference_event_type_p(elem) : elem;
            cdolist_list_var = cdolist_list_var.rest();
            elem = cdolist_list_var.first();
        }
        _csetf_infrnc_events(inference, event_types);
        return inference;
    }

    @SubL(source = "cycl/inference/harness/inference-datastructures-inference.lisp", position = 57100L)
    public static SubLObject set_inference_halt_conditions(SubLObject inference, SubLObject halt_conditions) {
        assert NIL != inference_p(inference) : inference;
        assert NIL != list_utilities.non_dotted_list_p(halt_conditions) : halt_conditions;
        SubLObject cdolist_list_var = halt_conditions;
        SubLObject elem = NIL;
        elem = cdolist_list_var.first();
        while (NIL != cdolist_list_var) {
            assert NIL != inference_datastructures_enumerated_types.inference_halt_condition_p(elem) : elem;
            cdolist_list_var = cdolist_list_var.rest();
            elem = cdolist_list_var.first();
        }
        _csetf_infrnc_halt_conditions(inference, halt_conditions);
        return inference;
    }

    @SubL(source = "cycl/inference/harness/inference-datastructures-inference.lisp", position = 57400L)
    public static SubLObject set_inference_type(SubLObject inference, SubLObject type) {
        assert NIL != inference_p(inference) : inference;
        assert NIL != inference_type_p(type) : type;
        _csetf_infrnc_type(inference, type);
        return inference;
    }

    @SubL(source = "cycl/inference/harness/inference-datastructures-inference.lisp", position = 57600L)
    public static SubLObject set_inference_data(SubLObject inference, SubLObject data) {
        assert NIL != inference_p(inference) : inference;
        _csetf_infrnc_data(inference, data);
        return inference;
    }

    @SubL(source = "cycl/inference/harness/inference-datastructures-inference.lisp", position = 57700L)
    public static SubLObject set_inference_properties(SubLObject inference, SubLObject v_properties) {
        assert NIL != inference_p(inference) : inference;
        assert NIL != list_utilities.property_list_p(v_properties) : v_properties;
        _csetf_infrnc_properties(inference, v_properties);
        return inference;
    }

    @SubL(source = "cycl/inference/harness/inference-datastructures-inference.lisp", position = 57900L)
    public static SubLObject set_inference_property(SubLObject inference, SubLObject key, SubLObject value) {
        assert NIL != inference_p(inference) : inference;
        SubLObject v_properties = infrnc_properties(inference);
        v_properties = conses_high.putf(v_properties, key, value);
        _csetf_infrnc_properties(inference, v_properties);
        return inference;
    }

    @SubL(source = "cycl/inference/harness/inference-datastructures-inference.lisp", position = 58200L)
    public static SubLObject push_inference_property(SubLObject inference, SubLObject key, SubLObject value) {
        assert NIL != inference_p(inference) : inference;
        SubLObject v_properties = infrnc_properties(inference);
        v_properties = conses_high.putf(v_properties, key, cons(value, list_utilities.plist_lookup(v_properties, key, NIL)));
        _csetf_infrnc_properties(inference, v_properties);
        return inference;
    }

    @SubL(source = "cycl/inference/harness/inference-datastructures-inference.lisp", position = 58500L)
    public static SubLObject inference_ids(SubLObject inference) {
        assert NIL != inference_p(inference) : inference;
        return list(inference_problem_store_suid(inference), inference_suid(inference));
    }

    @SubL(source = "cycl/inference/harness/inference-datastructures-inference.lisp", position = 58700L)
    public static SubLObject with_inference_ids(SubLObject macroform, SubLObject environment) {
        SubLObject current;
        SubLObject datum = current = macroform.rest();
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, $list385);
        SubLObject temp = current.rest();
        current = current.first();
        SubLObject store_id_var = NIL;
        SubLObject inference_id_var = NIL;
        SubLObject inference = NIL;
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, $list385);
        store_id_var = current.first();
        current = current.rest();
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, $list385);
        inference_id_var = current.first();
        current = current.rest();
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, $list385);
        inference = current.first();
        current = current.rest();
        if (NIL == current) {
            SubLObject body;
            current = (body = temp);
            SubLObject inference_var = $sym386$INFERENCE_VAR;
            return listS($sym301$CLET, list(list(inference_var, inference), list(store_id_var, list($sym387$INFERENCE_PROBLEM_STORE_SUID, inference_var)), list(inference_id_var, list($sym388$INFERENCE_SUID, inference_var))), append(body, NIL));
        }
        cdestructuring_bind.cdestructuring_bind_error(datum, $list385);
        return NIL;
    }

    @SubL(source = "cycl/inference/harness/inference-datastructures-inference.lisp", position = 59100L)
    public static SubLObject inference_problem_store_suid(SubLObject inference) {
        return inference_datastructures_problem_store.problem_store_suid(inference_problem_store(inference));
    }

    @SubL(source = "cycl/inference/harness/inference-datastructures-inference.lisp", position = 59200L)
    public static SubLObject all_inferences() {
        SubLObject inferences = NIL;
        SubLObject idx = inference_datastructures_problem_store.problem_store_id_index();
        if (NIL == id_index.id_index_objects_empty_p(idx, $SKIP)) {
            SubLObject idx_$4 = idx;
            if (NIL == id_index.id_index_dense_objects_empty_p(idx_$4, $SKIP)) {
                SubLObject vector_var = id_index.id_index_dense_objects(idx_$4);
                SubLObject backwardP_var = NIL;
                SubLObject length;
                SubLObject v_iteration;
                SubLObject id;
                SubLObject store;
                SubLObject idx_$5;
                SubLObject idx_$6;
                SubLObject vector_var_$7;
                SubLObject backwardP_var_$8;
                SubLObject length_$9;
                SubLObject v_iteration_$10;
                SubLObject id_$11;
                SubLObject inference;
                SubLObject idx_$7;
                SubLObject cdohash_table;
                SubLObject id_$12;
                SubLObject inference2;
                Iterator cdohash_iterator;
                Map.Entry cdohash_entry;
                for (length = Sequences.length(vector_var), v_iteration = NIL, v_iteration = ZERO_INTEGER; v_iteration.numL(length); v_iteration = Numbers.add(v_iteration, ONE_INTEGER)) {
                    id = ((NIL != backwardP_var) ? Numbers.subtract(length, v_iteration, ONE_INTEGER) : v_iteration);
                    store = Vectors.aref(vector_var, id);
                    if (NIL == id_index.id_index_tombstone_p(store) || NIL == id_index.id_index_skip_tombstones_p($SKIP)) {
                        if (NIL != id_index.id_index_tombstone_p(store)) {
                            store = $SKIP;
                        }
                        idx_$5 = inference_datastructures_problem_store.problem_store_inference_id_index(store);
                        if (NIL == id_index.id_index_objects_empty_p(idx_$5, $SKIP)) {
                            idx_$6 = idx_$5;
                            if (NIL == id_index.id_index_dense_objects_empty_p(idx_$6, $SKIP)) {
                                vector_var_$7 = id_index.id_index_dense_objects(idx_$6);
                                backwardP_var_$8 = NIL;
                                for (length_$9 = Sequences.length(vector_var_$7), v_iteration_$10 = NIL, v_iteration_$10 = ZERO_INTEGER; v_iteration_$10.numL(length_$9); v_iteration_$10 = Numbers.add(v_iteration_$10, ONE_INTEGER)) {
                                    id_$11 = ((NIL != backwardP_var_$8) ? Numbers.subtract(length_$9, v_iteration_$10, ONE_INTEGER) : v_iteration_$10);
                                    inference = Vectors.aref(vector_var_$7, id_$11);
                                    if (NIL == id_index.id_index_tombstone_p(inference) || NIL == id_index.id_index_skip_tombstones_p($SKIP)) {
                                        if (NIL != id_index.id_index_tombstone_p(inference)) {
                                            inference = $SKIP;
                                        }
                                        inferences = cons(inference, inferences);
                                    }
                                }
                            }
                            idx_$7 = idx_$5;
                            if (NIL == id_index.id_index_sparse_objects_empty_p(idx_$7)) {
                                cdohash_table = id_index.id_index_sparse_objects(idx_$7);
                                id_$12 = NIL;
                                inference2 = NIL;
                                cdohash_iterator = Hashtables.getEntrySetIterator(cdohash_table);
                                try {
                                    while (Hashtables.iteratorHasNext(cdohash_iterator)) {
                                        cdohash_entry = Hashtables.iteratorNextEntry(cdohash_iterator);
                                        id_$12 = Hashtables.getEntryKey(cdohash_entry);
                                        inference2 = Hashtables.getEntryValue(cdohash_entry);
                                        inferences = cons(inference2, inferences);
                                    }
                                } finally {
                                    Hashtables.releaseEntrySetIterator(cdohash_iterator);
                                }
                            }
                        }
                    }
                }
            }
            SubLObject idx_$8 = idx;
            if (NIL == id_index.id_index_sparse_objects_empty_p(idx_$8)) {
                SubLObject cdohash_table2 = id_index.id_index_sparse_objects(idx_$8);
                SubLObject id2 = NIL;
                SubLObject store2 = NIL;
                Iterator cdohash_iterator2 = Hashtables.getEntrySetIterator(cdohash_table2);
                try {
                    while (Hashtables.iteratorHasNext(cdohash_iterator2)) {
                        Map.Entry cdohash_entry2 = Hashtables.iteratorNextEntry(cdohash_iterator2);
                        id2 = Hashtables.getEntryKey(cdohash_entry2);
                        store2 = Hashtables.getEntryValue(cdohash_entry2);
                        SubLObject idx_$9 = inference_datastructures_problem_store.problem_store_inference_id_index(store2);
                        if (NIL == id_index.id_index_objects_empty_p(idx_$9, $SKIP)) {
                            SubLObject idx_$10 = idx_$9;
                            if (NIL == id_index.id_index_dense_objects_empty_p(idx_$10, $SKIP)) {
                                SubLObject vector_var2 = id_index.id_index_dense_objects(idx_$10);
                                SubLObject backwardP_var2 = NIL;
                                SubLObject length2;
                                SubLObject v_iteration2;
                                SubLObject id_$13;
                                SubLObject inference3;
                                for (length2 = Sequences.length(vector_var2), v_iteration2 = NIL, v_iteration2 = ZERO_INTEGER; v_iteration2.numL(length2); v_iteration2 = Numbers.add(v_iteration2, ONE_INTEGER)) {
                                    id_$13 = ((NIL != backwardP_var2) ? Numbers.subtract(length2, v_iteration2, ONE_INTEGER) : v_iteration2);
                                    inference3 = Vectors.aref(vector_var2, id_$13);
                                    if (NIL == id_index.id_index_tombstone_p(inference3) || NIL == id_index.id_index_skip_tombstones_p($SKIP)) {
                                        if (NIL != id_index.id_index_tombstone_p(inference3)) {
                                            inference3 = $SKIP;
                                        }
                                        inferences = cons(inference3, inferences);
                                    }
                                }
                            }
                            SubLObject idx_$11 = idx_$9;
                            if (NIL != id_index.id_index_sparse_objects_empty_p(idx_$11)) {
                                continue;
                            }
                            SubLObject cdohash_table_$19 = id_index.id_index_sparse_objects(idx_$11);
                            SubLObject id_$14 = NIL;
                            SubLObject inference4 = NIL;
                            Iterator cdohash_iterator_$21 = Hashtables.getEntrySetIterator(cdohash_table_$19);
                            try {
                                while (Hashtables.iteratorHasNext(cdohash_iterator_$21)) {
                                    Map.Entry cdohash_entry_$22 = Hashtables.iteratorNextEntry(cdohash_iterator_$21);
                                    id_$14 = Hashtables.getEntryKey(cdohash_entry_$22);
                                    inference4 = Hashtables.getEntryValue(cdohash_entry_$22);
                                    inferences = cons(inference4, inferences);
                                }
                            } finally {
                                Hashtables.releaseEntrySetIterator(cdohash_iterator_$21);
                            }
                        }
                    }
                } finally {
                    Hashtables.releaseEntrySetIterator(cdohash_iterator2);
                }
            }
        }
        return Sequences.nreverse(inferences);
    }

    @SubL(source = "cycl/inference/harness/inference-datastructures-inference.lisp", position = 59400L)
    public static SubLObject all_successful_inferences() {
        return list_utilities.delete_if_not($sym390$SUCCESSFUL_INFERENCE_P, all_inferences(), UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
    }

    @SubL(source = "cycl/inference/harness/inference-datastructures-inference.lisp", position = 59500L)
    public static SubLObject inference_strategies(SubLObject inference) {
        return set.set_element_list(inference_strategy_set(inference));
    }

    @SubL(source = "cycl/inference/harness/inference-datastructures-inference.lisp", position = 59700L)
    public static SubLObject inference_hl_mts(SubLObject inference) {
        assert NIL != inference_p(inference) : inference;
        SubLObject hl_query = inference_hl_query(inference);
        SubLObject mts = NIL;
        SubLObject cdolist_list_var = hl_query;
        SubLObject contextualized_clause = NIL;
        contextualized_clause = cdolist_list_var.first();
        while (NIL != cdolist_list_var) {
            SubLObject sense = $NEG;
            SubLObject index_var = ZERO_INTEGER;
            SubLObject cdolist_list_var_$23 = clauses.neg_lits(contextualized_clause);
            SubLObject contextualized_asent = NIL;
            contextualized_asent = cdolist_list_var_$23.first();
            while (NIL != cdolist_list_var_$23) {
                SubLObject current;
                SubLObject datum = current = contextualized_asent;
                SubLObject mt = NIL;
                SubLObject asent = NIL;
                cdestructuring_bind.destructuring_bind_must_consp(current, datum, $list392);
                mt = current.first();
                current = current.rest();
                cdestructuring_bind.destructuring_bind_must_consp(current, datum, $list392);
                asent = current.first();
                current = current.rest();
                if (NIL == current) {
                    SubLObject item_var = mt;
                    if (NIL == conses_high.member(item_var, mts, $sym393$HLMT_EQUAL, Symbols.symbol_function(IDENTITY))) {
                        mts = cons(item_var, mts);
                    }
                } else {
                    cdestructuring_bind.cdestructuring_bind_error(datum, $list392);
                }
                index_var = Numbers.add(index_var, ONE_INTEGER);
                cdolist_list_var_$23 = cdolist_list_var_$23.rest();
                contextualized_asent = cdolist_list_var_$23.first();
            }
            sense = $POS;
            index_var = ZERO_INTEGER;
            SubLObject cdolist_list_var_$24 = clauses.pos_lits(contextualized_clause);
            contextualized_asent = NIL;
            contextualized_asent = cdolist_list_var_$24.first();
            while (NIL != cdolist_list_var_$24) {
                SubLObject current;
                SubLObject datum = current = contextualized_asent;
                SubLObject mt = NIL;
                SubLObject asent = NIL;
                cdestructuring_bind.destructuring_bind_must_consp(current, datum, $list392);
                mt = current.first();
                current = current.rest();
                cdestructuring_bind.destructuring_bind_must_consp(current, datum, $list392);
                asent = current.first();
                current = current.rest();
                if (NIL == current) {
                    SubLObject item_var = mt;
                    if (NIL == conses_high.member(item_var, mts, $sym393$HLMT_EQUAL, Symbols.symbol_function(IDENTITY))) {
                        mts = cons(item_var, mts);
                    }
                } else {
                    cdestructuring_bind.cdestructuring_bind_error(datum, $list392);
                }
                index_var = Numbers.add(index_var, ONE_INTEGER);
                cdolist_list_var_$24 = cdolist_list_var_$24.rest();
                contextualized_asent = cdolist_list_var_$24.first();
            }
            cdolist_list_var = cdolist_list_var.rest();
            contextualized_clause = cdolist_list_var.first();
        }
        return Sequences.nreverse(mts);
    }

    @SubL(source = "cycl/inference/harness/inference-datastructures-inference.lisp", position = 60100L)
    public static SubLObject inference_first_hl_query_mt(SubLObject inference) {
        assert NIL != inference_p(inference) : inference;
        SubLObject hl_query = inference_hl_query(inference);
        SubLObject result;
        SubLObject rest;
        SubLObject contextualized_clause;
        SubLObject sense;
        SubLObject index_var;
        SubLObject cdolist_list_var;
        SubLObject contextualized_asent;
        SubLObject current;
        SubLObject datum;
        SubLObject hl_mt;
        SubLObject asent;
        for (result = NIL, rest = NIL, rest = hl_query; NIL == result && NIL != rest; rest = rest.rest()) {
            contextualized_clause = rest.first();
            sense = $NEG;
            index_var = ZERO_INTEGER;
            cdolist_list_var = clauses.neg_lits(contextualized_clause);
            contextualized_asent = NIL;
            contextualized_asent = cdolist_list_var.first();
            while (NIL != cdolist_list_var) {
                datum = (current = contextualized_asent);
                hl_mt = NIL;
                asent = NIL;
                cdestructuring_bind.destructuring_bind_must_consp(current, datum, $list395);
                hl_mt = current.first();
                current = current.rest();
                cdestructuring_bind.destructuring_bind_must_consp(current, datum, $list395);
                asent = current.first();
                current = current.rest();
                if (NIL == current) {
                    result = hl_mt;
                } else {
                    cdestructuring_bind.cdestructuring_bind_error(datum, $list395);
                }
                index_var = Numbers.add(index_var, ONE_INTEGER);
                cdolist_list_var = cdolist_list_var.rest();
                contextualized_asent = cdolist_list_var.first();
            }
            sense = $POS;
            index_var = ZERO_INTEGER;
            cdolist_list_var = clauses.pos_lits(contextualized_clause);
            contextualized_asent = NIL;
            contextualized_asent = cdolist_list_var.first();
            while (NIL != cdolist_list_var) {
                datum = (current = contextualized_asent);
                hl_mt = NIL;
                asent = NIL;
                cdestructuring_bind.destructuring_bind_must_consp(current, datum, $list395);
                hl_mt = current.first();
                current = current.rest();
                cdestructuring_bind.destructuring_bind_must_consp(current, datum, $list395);
                asent = current.first();
                current = current.rest();
                if (NIL == current) {
                    result = hl_mt;
                } else {
                    cdestructuring_bind.cdestructuring_bind_error(datum, $list395);
                }
                index_var = Numbers.add(index_var, ONE_INTEGER);
                cdolist_list_var = cdolist_list_var.rest();
                contextualized_asent = cdolist_list_var.first();
            }
        }
        return result;
    }

    @SubL(source = "cycl/inference/harness/inference-datastructures-inference.lisp", position = 60500L)
    public static SubLObject inference_no_free_hl_varsP(SubLObject inference) {
        return Types.sublisp_null(inference_free_hl_vars(inference));
    }

    @SubL(source = "cycl/inference/harness/inference-datastructures-inference.lisp", position = 60700L)
    public static SubLObject inference_free_el_vars(SubLObject inference) {
        SubLObject el_bindings = inference_el_bindings(inference);
        SubLObject free_hl_vars = inference_free_hl_vars(inference);
        return bindings.apply_bindings_backwards(el_bindings, free_hl_vars);
    }

    @SubL(source = "cycl/inference/harness/inference-datastructures-inference.lisp", position = 60900L)
    public static SubLObject inference_input_query_property(SubLObject inference, SubLObject property, SubLObject v_default) {
        if (v_default == UNPROVIDED) {
            v_default = NIL;
        }
        assert NIL != inference_p(inference) : inference;
        assert NIL != inference_datastructures_enumerated_types.query_property_p(property) : property;
        return conses_high.getf(infrnc_input_query_properties(inference), property, v_default);
    }

    @SubL(source = "cycl/inference/harness/inference-datastructures-inference.lisp", position = 61100L)
    public static SubLObject inference_to_new_cyc_query_arguments(SubLObject inference) {
        assert NIL != inference_p(inference) : inference;
        SubLObject sentence = inference_input_el_query(inference);
        if (NIL == sentence) {
            sentence = cycl_utilities.hl_to_el(inference_czer.contextualized_dnf_clauses_formula(inference_hl_query(inference), UNPROVIDED));
        }
        return Values.values(sentence, inference_input_mt(inference), inference_datastructures_enumerated_types.inference_input_non_default_query_properties(inference));
    }

    @SubL(source = "cycl/inference/harness/inference-datastructures-inference.lisp", position = 61700L)
    public static SubLObject inference_to_new_cyc_query_form(SubLObject inference) {
        SubLThread thread = SubLProcess.currentSubLThread();
        thread.resetMultipleValues();
        SubLObject sentence = inference_to_new_cyc_query_arguments(inference);
        SubLObject mt = thread.secondMultipleValue();
        SubLObject query_properties = thread.thirdMultipleValue();
        thread.resetMultipleValues();
        return listS($sym397$NEW_CYC_QUERY, list_utilities.quotify(sentence), append((NIL != mt || NIL != query_properties) ? list(list_utilities.quotify(mt)) : NIL, (NIL != query_properties) ? list(list_utilities.quotify(query_properties)) : NIL, NIL));
    }

    @SubL(source = "cycl/inference/harness/inference-datastructures-inference.lisp", position = 62200L)
    public static SubLObject inference_to_new_cyc_query_form_string(SubLObject inference) {
        SubLThread thread = SubLProcess.currentSubLThread();
        thread.resetMultipleValues();
        SubLObject sentence = inference_to_new_cyc_query_arguments(inference);
        SubLObject mt = thread.secondMultipleValue();
        SubLObject query_properties = thread.thirdMultipleValue();
        thread.resetMultipleValues();
        sentence = cycl_utilities.hl_to_el(sentence);
        mt = cycl_utilities.hl_to_el(mt);
        return inference_args_to_new_cyc_query_form_string(sentence, mt, query_properties);
    }

    @SubL(source = "cycl/inference/harness/inference-datastructures-inference.lisp", position = 62600L)
    public static SubLObject inference_args_to_new_cyc_query_form_string(SubLObject sentence, SubLObject mt, SubLObject query_properties) {
        SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject result = NIL;
        SubLObject stream = NIL;
        try {
            stream = streams_high.make_private_string_output_stream();
            SubLObject sentence_string = format_cycl_expression.format_cycl_expression_to_string(sentence, ONE_INTEGER);
            Strings.set_char(sentence_string, TWO_INTEGER, Characters.CHAR_quote);
            PrintLow.format(stream, $str398$_new_cyc_query_A, sentence_string);
            if (NIL != mt || NIL != query_properties) {
                SubLObject mt_string = format_cycl_expression.format_cycl_expression_to_string(mt, ONE_INTEGER);
                if (mt.isAtom()) {
                    PrintLow.format(stream, $str399$_____A, mt_string);
                } else {
                    Strings.set_char(mt_string, TWO_INTEGER, Characters.CHAR_quote);
                    PrintLow.format(stream, $str400$_A, mt_string);
                }
            }
            if (NIL != query_properties) {
                PrintLow.format(stream, $str401$_____list______);
                SubLObject _prev_bind_0 = print_high.$print_case$.currentBinding(thread);
                try {
                    print_high.$print_case$.bind($DOWNCASE, thread);
                    SubLObject remainder;
                    SubLObject property;
                    SubLObject value;
                    SubLObject cdolist_list_var;
                    SubLObject one_value;
                    for (remainder = NIL, remainder = query_properties; NIL != remainder; remainder = conses_high.cddr(remainder)) {
                        property = remainder.first();
                        value = conses_high.cadr(remainder);
                        if (property == $PROBLEM_STORE) {
                            PrintLow.format(stream, $str403$_S__find_problem_store_by_id__S__, property, inference_datastructures_problem_store.problem_store_suid(value));
                        } else if ((property == $ALLOWED_RULES || property == $FORBIDDEN_RULES) && value != $ALL) {
                            PrintLow.format(stream, $str405$_S__list, property);
                            cdolist_list_var = value;
                            one_value = NIL;
                            one_value = cdolist_list_var.first();
                            while (NIL != cdolist_list_var) {
                                PrintLow.format(stream, $str406$_________find_object_by_hl_extern, kb_utilities.hl_external_id_string(one_value));
                                cdolist_list_var = cdolist_list_var.rest();
                                one_value = cdolist_list_var.first();
                            }
                            PrintLow.format(stream, $str407$_______);
                        } else if (NIL != list_utilities.self_evaluating_form_p(value)) {
                            PrintLow.format(stream, $str408$_S__S______, property, value);
                        } else {
                            PrintLow.format(stream, $str408$_S__S______, property, list_utilities.quotify(value));
                        }
                    }
                } finally {
                    print_high.$print_case$.rebind(_prev_bind_0, thread);
                }
                PrintLow.format(stream, $str409$_);
            }
            PrintLow.format(stream, $str409$_);
            result = streams_high.get_output_stream_string(stream);
        } finally {
            SubLObject _prev_bind_2 = Threads.$is_thread_performing_cleanupP$.currentBinding(thread);
            try {
                Threads.$is_thread_performing_cleanupP$.bind(T, thread);
                SubLObject _values = Values.getValuesAsVector();
                streams_high.close(stream, UNPROVIDED);
                Values.restoreValuesFromVector(_values);
            } finally {
                Threads.$is_thread_performing_cleanupP$.rebind(_prev_bind_2, thread);
            }
        }
        return result;
    }

    @SubL(source = "cycl/inference/harness/inference-datastructures-inference.lisp", position = 64200L)
    public static SubLObject inference_root_mapped_problem(SubLObject inference) {
        SubLObject root_link = inference_root_link(inference);
        if (NIL != root_link) {
            return inference_worker_answer.answer_link_supporting_mapped_problem(root_link);
        }
        return NIL;
    }

    @SubL(source = "cycl/inference/harness/inference-datastructures-inference.lisp", position = 64400L)
    public static SubLObject inference_root_problem(SubLObject inference) {
        SubLObject root_mapped_problem = inference_root_mapped_problem(inference);
        if (NIL != root_mapped_problem) {
            return inference_datastructures_problem_link.mapped_problem_problem(root_mapped_problem);
        }
        return NIL;
    }

    @SubL(source = "cycl/inference/harness/inference-datastructures-inference.lisp", position = 64600L)
    public static SubLObject inference_unique_wrt_proofsP(SubLObject inference) {
        return Equality.eq($PROOF, inference_result_uniqueness_criterion(inference));
    }

    @SubL(source = "cycl/inference/harness/inference-datastructures-inference.lisp", position = 64700L)
    public static SubLObject inference_unique_wrt_bindingsP(SubLObject inference) {
        return Equality.eq($BINDINGS, inference_result_uniqueness_criterion(inference));
    }

    @SubL(source = "cycl/inference/harness/inference-datastructures-inference.lisp", position = 64900L)
    public static SubLObject inference_compute_answer_justificationsP(SubLObject inference) {
        return inference_datastructures_problem_store.problem_store_compute_answer_justificationsP(inference_problem_store(inference));
    }

    @SubL(source = "cycl/inference/harness/inference-datastructures-inference.lisp", position = 65000L)
    public static SubLObject inference_computes_metricsP(SubLObject inference) {
        return list_utilities.sublisp_boolean(inference_metrics_template(inference));
    }

    @SubL(source = "cycl/inference/harness/inference-datastructures-inference.lisp", position = 65200L)
    public static SubLObject inference_computes_metricP(SubLObject inference, SubLObject metric) {
        return list_utilities.member_eqP(metric, inference_metrics_template(inference));
    }

    @SubL(source = "cycl/inference/harness/inference-datastructures-inference.lisp", position = 65300L)
    public static SubLObject inference_problem_store_private_wrt_dynamic_propertiesP(SubLObject inference) {
        return makeBoolean(NIL != inference_problem_store_privateP(inference) && NIL == inference_continuableP(inference));
    }

    @SubL(source = "cycl/inference/harness/inference-datastructures-inference.lisp", position = 65600L)
    public static SubLObject inference_dynamic_properties_exhaustiveP(SubLObject inference) {
        return makeBoolean(NIL == inference_max_time(inference) && NIL == inference_max_step(inference) && NIL == inference_max_number(inference)
                && (NIL == simplest_inference_p(inference) || NIL == inference_datastructures_strategy.strategy_unique_wrt_bindingsP(simplest_inference_strategy(inference)) || NIL == inference_no_free_hl_varsP(inference)));
    }

    @SubL(source = "cycl/inference/harness/inference-datastructures-inference.lisp", position = 66200L)
    public static SubLObject inference_allows_use_of_all_rulesP(SubLObject inference) {
        return makeBoolean($ALL == inference_allowed_rules(inference) && $NONE == inference_forbidden_rules(inference));
    }

    @SubL(source = "cycl/inference/harness/inference-datastructures-inference.lisp", position = 66400L)
    public static SubLObject inference_allows_use_of_ruleP(SubLObject inference, SubLObject rule) {
        if (NIL != inference_allows_use_of_all_rulesP(inference)) {
            return T;
        }
        if ($NONE == inference_forbidden_rules(inference)) {
            return set.set_memberP(rule, inference_allowed_rules(inference));
        }
        if ($ALL == inference_allowed_rules(inference)) {
            return makeBoolean(NIL == set.set_memberP(rule, inference_forbidden_rules(inference)));
        }
        return NIL;
    }

    @SubL(source = "cycl/inference/harness/inference-datastructures-inference.lisp", position = 66800L)
    public static SubLObject inference_filter_rules(SubLObject inference, SubLObject rules) {
        if (NIL != inference_allows_use_of_all_rulesP(inference)) {
            return rules;
        }
        SubLObject inference_allowed_rules_list = inference_allowed_rules_list(inference);
        SubLObject inference_forbidden_rules_list = inference_forbidden_rules_list(inference);
        SubLObject filtered_rules = NIL;
        if ($NONE == inference_forbidden_rules_list) {
            filtered_rules = keyhash_utilities.fast_intersection(rules, inference_allowed_rules_list, UNPROVIDED, UNPROVIDED, UNPROVIDED);
        } else if ($ALL == inference_allowed_rules_list) {
            filtered_rules = list_utilities.fast_set_difference(rules, inference_forbidden_rules_list, UNPROVIDED);
        } else {
            filtered_rules = keyhash_utilities.fast_intersection(rules, inference_allowed_rules_list, UNPROVIDED, UNPROVIDED, UNPROVIDED);
            filtered_rules = list_utilities.fast_set_difference(filtered_rules, inference_forbidden_rules_list, UNPROVIDED);
        }
        return filtered_rules;
    }

    @SubL(source = "cycl/inference/harness/inference-datastructures-inference.lisp", position = 67700L)
    public static SubLObject inference_allows_use_of_all_modulesP(SubLObject inference) {
        return Equality.eq($ALL, inference_allowed_modules(inference));
    }

    @SubL(source = "cycl/inference/harness/inference-datastructures-inference.lisp", position = 67900L)
    public static SubLObject inference_allows_use_of_moduleP(SubLObject inference, SubLObject hl_module) {
        return makeBoolean(NIL != inference_allows_use_of_all_modulesP(inference) || NIL != inference_modules.hl_module_allowedP(hl_module, inference_allowed_modules(inference)));
    }

    @SubL(source = "cycl/inference/harness/inference-datastructures-inference.lisp", position = 68100L)
    public static SubLObject inference_forget_extra_resultsP(SubLObject inference) {
        return inference_datastructures_enumerated_types.inference_properties_forget_extra_resultsP(inference_input_query_properties(inference));
    }

    @SubL(source = "cycl/inference/harness/inference-datastructures-inference.lisp", position = 68200L)
    public static SubLObject inference_has_some_answerP(SubLObject inference) {
        SubLObject v_id_index = inference_answer_id_index(inference);
        return Numbers.plusp(id_index.id_index_count(v_id_index));
    }

    @SubL(source = "cycl/inference/harness/inference-datastructures-inference.lisp", position = 68400L)
    public static SubLObject find_inference_answer_by_id(SubLObject inference, SubLObject id) {
        assert NIL != subl_promotions.non_negative_integer_p(id) : id;
        SubLObject v_id_index = inference_answer_id_index(inference);
        return id_index.id_index_lookup(v_id_index, id, UNPROVIDED);
    }

    @SubL(source = "cycl/inference/harness/inference-datastructures-inference.lisp", position = 68600L)
    public static SubLObject find_inference_answer_by_ids(SubLObject store_id, SubLObject inference_id, SubLObject answer_id) {
        SubLObject inference = inference_datastructures_problem_store.find_inference_by_ids(store_id, inference_id);
        if (NIL != inference) {
            SubLObject v_answer = find_inference_answer_by_id(inference, answer_id);
            return v_answer;
        }
        return NIL;
    }

    @SubL(source = "cycl/inference/harness/inference-datastructures-inference.lisp", position = 68900L)
    public static SubLObject inference_answer_signature(SubLObject v_answer) {
        return list(inference_datastructures_problem_store.problem_store_suid(inference_answer_problem_store(v_answer)), inference_suid(inference_answer_inference(v_answer)), inference_answer_suid(v_answer));
    }

    @SubL(source = "cycl/inference/harness/inference-datastructures-inference.lisp", position = 69200L)
    public static SubLObject find_inference_answer_from_signature(SubLObject signature) {
        SubLObject problem_store_suid = NIL;
        SubLObject inference_suid = NIL;
        SubLObject answer_suid = NIL;
        cdestructuring_bind.destructuring_bind_must_consp(signature, signature, $list413);
        problem_store_suid = signature.first();
        SubLObject current = signature.rest();
        cdestructuring_bind.destructuring_bind_must_consp(current, signature, $list413);
        inference_suid = current.first();
        current = current.rest();
        cdestructuring_bind.destructuring_bind_must_consp(current, signature, $list413);
        answer_suid = current.first();
        current = current.rest();
        if (NIL == current) {
            return find_inference_answer_by_ids(problem_store_suid, inference_suid, answer_suid);
        }
        cdestructuring_bind.cdestructuring_bind_error(signature, $list413);
        return NIL;
    }

    @SubL(source = "cycl/inference/harness/inference-datastructures-inference.lisp", position = 69500L)
    public static SubLObject inference_first_answer(SubLObject inference) {
        return inference_first_answer_with_id_or_greater(inference, ZERO_INTEGER);
    }

    @SubL(source = "cycl/inference/harness/inference-datastructures-inference.lisp", position = 69600L)
    public static SubLObject inference_last_answer(SubLObject inference) {
        SubLObject limit = inference_next_new_answer_id(inference);
        SubLObject v_answer = NIL;
        if (NIL == v_answer) {
            SubLObject end_var;
            SubLObject id;
            for (end_var = MINUS_ONE_INTEGER, id = NIL, id = number_utilities.f_1_(limit); NIL == v_answer && !id.numLE(end_var); v_answer = find_inference_answer_by_id(inference, id), id = Numbers.add(id, MINUS_ONE_INTEGER)) {
            }
        }
        return v_answer;
    }

    @SubL(source = "cycl/inference/harness/inference-datastructures-inference.lisp", position = 69900L)
    public static SubLObject inference_first_answer_with_id_or_greater(SubLObject inference, SubLObject min_id) {
        SubLObject limit = inference_next_new_answer_id(inference);
        SubLObject v_answer = NIL;
        if (NIL == v_answer) {
            SubLObject end_var;
            SubLObject id;
            for (end_var = limit, id = NIL, id = min_id; NIL == v_answer && !id.numGE(end_var); v_answer = find_inference_answer_by_id(inference, id), id = number_utilities.f_1X(id)) {
            }
        }
        return v_answer;
    }

    @SubL(source = "cycl/inference/harness/inference-datastructures-inference.lisp", position = 70300L)
    public static SubLObject inference_first_answer_elapsed_time(SubLObject inference) {
        SubLObject first_answer = inference_first_answer(inference);
        if (NIL != first_answer) {
            return inference_answer_elapsed_time(first_answer, NIL);
        }
        return NIL;
    }

    @SubL(source = "cycl/inference/harness/inference-datastructures-inference.lisp", position = 70600L)
    public static SubLObject inference_first_answer_step_count(SubLObject inference) {
        SubLObject first_answer = inference_first_answer(inference);
        if (NIL != first_answer) {
            return inference_answer_step_count(first_answer);
        }
        return NIL;
    }

    @SubL(source = "cycl/inference/harness/inference-datastructures-inference.lisp", position = 70800L)
    public static SubLObject inference_last_answer_elapsed_time(SubLObject inference) {
        SubLObject last_answer = inference_last_answer(inference);
        if (NIL != last_answer) {
            return inference_answer_elapsed_time(last_answer, NIL);
        }
        return NIL;
    }

    @SubL(source = "cycl/inference/harness/inference-datastructures-inference.lisp", position = 71100L)
    public static SubLObject inference_last_answer_step_count(SubLObject inference) {
        SubLObject first_answer = inference_last_answer(inference);
        if (NIL != first_answer) {
            return inference_answer_step_count(first_answer);
        }
        return NIL;
    }

    @SubL(source = "cycl/inference/harness/inference-datastructures-inference.lisp", position = 71300L)
    public static SubLObject inference_last_answer_id(SubLObject inference) {
        SubLObject last_answer = inference_last_answer(inference);
        return (NIL != last_answer) ? inference_answer_suid(last_answer) : NIL;
    }

    @SubL(source = "cycl/inference/harness/inference-datastructures-inference.lisp", position = 71500L)
    public static SubLObject inference_answer_count_at_elapsed_time(SubLObject inference, SubLObject elapsed_seconds) {
        SubLObject elapsed_internal_real_time = numeric_date_utilities.elapsed_seconds_to_elapsed_internal_real_time(elapsed_seconds);
        SubLObject count = ZERO_INTEGER;
        SubLObject idx = inference_answer_id_index(inference);
        if (NIL == id_index.id_index_objects_empty_p(idx, $SKIP)) {
            SubLObject idx_$25 = idx;
            if (NIL == id_index.id_index_dense_objects_empty_p(idx_$25, $SKIP)) {
                SubLObject vector_var = id_index.id_index_dense_objects(idx_$25);
                SubLObject backwardP_var = NIL;
                SubLObject length;
                SubLObject v_iteration;
                SubLObject id;
                SubLObject v_answer;
                for (length = Sequences.length(vector_var), v_iteration = NIL, v_iteration = ZERO_INTEGER; v_iteration.numL(length); v_iteration = Numbers.add(v_iteration, ONE_INTEGER)) {
                    id = ((NIL != backwardP_var) ? Numbers.subtract(length, v_iteration, ONE_INTEGER) : v_iteration);
                    v_answer = Vectors.aref(vector_var, id);
                    if (NIL == id_index.id_index_tombstone_p(v_answer) || NIL == id_index.id_index_skip_tombstones_p($SKIP)) {
                        if (NIL != id_index.id_index_tombstone_p(v_answer)) {
                            v_answer = $SKIP;
                        }
                        if (inference_answer_elapsed_creation_time(v_answer).numLE(elapsed_internal_real_time)) {
                            count = Numbers.add(count, ONE_INTEGER);
                        }
                    }
                }
            }
            SubLObject idx_$26 = idx;
            if (NIL == id_index.id_index_sparse_objects_empty_p(idx_$26)) {
                SubLObject cdohash_table = id_index.id_index_sparse_objects(idx_$26);
                SubLObject id2 = NIL;
                SubLObject v_answer2 = NIL;
                Iterator cdohash_iterator = Hashtables.getEntrySetIterator(cdohash_table);
                try {
                    while (Hashtables.iteratorHasNext(cdohash_iterator)) {
                        Map.Entry cdohash_entry = Hashtables.iteratorNextEntry(cdohash_iterator);
                        id2 = Hashtables.getEntryKey(cdohash_entry);
                        v_answer2 = Hashtables.getEntryValue(cdohash_entry);
                        if (inference_answer_elapsed_creation_time(v_answer2).numLE(elapsed_internal_real_time)) {
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

    @SubL(source = "cycl/inference/harness/inference-datastructures-inference.lisp", position = 72100L)
    public static SubLObject inference_answer_count_at_30_seconds(SubLObject inference) {
        return inference_answer_count_at_elapsed_time(inference, $int$30);
    }

    @SubL(source = "cycl/inference/harness/inference-datastructures-inference.lisp", position = 72200L)
    public static SubLObject inference_answer_count_at_60_seconds(SubLObject inference) {
        return inference_answer_count_at_elapsed_time(inference, $int$60);
    }

    @SubL(source = "cycl/inference/harness/inference-datastructures-inference.lisp", position = 72300L)
    public static SubLObject inference_answer_times(SubLObject inference) {
        SubLObject times = NIL;
        SubLObject idx = inference_answer_id_index(inference);
        if (NIL == id_index.id_index_objects_empty_p(idx, $SKIP)) {
            SubLObject idx_$27 = idx;
            if (NIL == id_index.id_index_dense_objects_empty_p(idx_$27, $SKIP)) {
                SubLObject vector_var = id_index.id_index_dense_objects(idx_$27);
                SubLObject backwardP_var = NIL;
                SubLObject length;
                SubLObject v_iteration;
                SubLObject id;
                SubLObject v_answer;
                for (length = Sequences.length(vector_var), v_iteration = NIL, v_iteration = ZERO_INTEGER; v_iteration.numL(length); v_iteration = Numbers.add(v_iteration, ONE_INTEGER)) {
                    id = ((NIL != backwardP_var) ? Numbers.subtract(length, v_iteration, ONE_INTEGER) : v_iteration);
                    v_answer = Vectors.aref(vector_var, id);
                    if (NIL == id_index.id_index_tombstone_p(v_answer) || NIL == id_index.id_index_skip_tombstones_p($SKIP)) {
                        if (NIL != id_index.id_index_tombstone_p(v_answer)) {
                            v_answer = $SKIP;
                        }
                        times = cons(inference_answer_elapsed_creation_time(v_answer), times);
                    }
                }
            }
            SubLObject idx_$28 = idx;
            if (NIL == id_index.id_index_sparse_objects_empty_p(idx_$28) || NIL == id_index.id_index_skip_tombstones_p($SKIP)) {
                SubLObject sparse = id_index.id_index_sparse_objects(idx_$28);
                SubLObject id2 = id_index.id_index_sparse_id_threshold(idx_$28);
                SubLObject end_id = id_index.id_index_next_id(idx_$28);
                SubLObject v_default = (NIL != id_index.id_index_skip_tombstones_p($SKIP)) ? NIL : $SKIP;
                while (id2.numL(end_id)) {
                    SubLObject v_answer2 = Hashtables.gethash_without_values(id2, sparse, v_default);
                    if (NIL == id_index.id_index_skip_tombstones_p($SKIP) || NIL == id_index.id_index_tombstone_p(v_answer2)) {
                        times = cons(inference_answer_elapsed_creation_time(v_answer2), times);
                    }
                    id2 = Numbers.add(id2, ONE_INTEGER);
                }
            }
        }
        return Sequences.nreverse(times);
    }

    @SubL(source = "cycl/inference/harness/inference-datastructures-inference.lisp", position = 72600L)
    public static SubLObject inference_answer_step_counts(SubLObject inference) {
        SubLObject times = NIL;
        SubLObject idx = inference_answer_id_index(inference);
        if (NIL == id_index.id_index_objects_empty_p(idx, $SKIP)) {
            SubLObject idx_$29 = idx;
            if (NIL == id_index.id_index_dense_objects_empty_p(idx_$29, $SKIP)) {
                SubLObject vector_var = id_index.id_index_dense_objects(idx_$29);
                SubLObject backwardP_var = NIL;
                SubLObject length;
                SubLObject v_iteration;
                SubLObject id;
                SubLObject v_answer;
                for (length = Sequences.length(vector_var), v_iteration = NIL, v_iteration = ZERO_INTEGER; v_iteration.numL(length); v_iteration = Numbers.add(v_iteration, ONE_INTEGER)) {
                    id = ((NIL != backwardP_var) ? Numbers.subtract(length, v_iteration, ONE_INTEGER) : v_iteration);
                    v_answer = Vectors.aref(vector_var, id);
                    if (NIL == id_index.id_index_tombstone_p(v_answer) || NIL == id_index.id_index_skip_tombstones_p($SKIP)) {
                        if (NIL != id_index.id_index_tombstone_p(v_answer)) {
                            v_answer = $SKIP;
                        }
                        times = cons(inference_answer_step_count(v_answer), times);
                    }
                }
            }
            SubLObject idx_$30 = idx;
            if (NIL == id_index.id_index_sparse_objects_empty_p(idx_$30) || NIL == id_index.id_index_skip_tombstones_p($SKIP)) {
                SubLObject sparse = id_index.id_index_sparse_objects(idx_$30);
                SubLObject id2 = id_index.id_index_sparse_id_threshold(idx_$30);
                SubLObject end_id = id_index.id_index_next_id(idx_$30);
                SubLObject v_default = (NIL != id_index.id_index_skip_tombstones_p($SKIP)) ? NIL : $SKIP;
                while (id2.numL(end_id)) {
                    SubLObject v_answer2 = Hashtables.gethash_without_values(id2, sparse, v_default);
                    if (NIL == id_index.id_index_skip_tombstones_p($SKIP) || NIL == id_index.id_index_tombstone_p(v_answer2)) {
                        times = cons(inference_answer_step_count(v_answer2), times);
                    }
                    id2 = Numbers.add(id2, ONE_INTEGER);
                }
            }
        }
        return Sequences.nreverse(times);
    }

    @SubL(source = "cycl/inference/harness/inference-datastructures-inference.lisp", position = 72800L)
    public static SubLObject inference_new_root_metrics(SubLObject inference) {
        if (NIL != simplest_inference_p(inference)) {
            SubLObject strategy = simplest_inference_strategy(inference);
            if (NIL != striping_tactician.striping_tactician_p(strategy)) {
                return striping_tactician.striping_tactician_new_root_metrics(strategy);
            }
        }
        return NIL;
    }

    @SubL(source = "cycl/inference/harness/inference-datastructures-inference.lisp", position = 73800L)
    public static SubLObject inference_end_universal_time(SubLObject inference) {
        SubLObject end_real_time = inference_end_internal_real_time(inference);
        if (NIL != end_real_time) {
            SubLObject start_real_time = inference_start_internal_real_time(inference);
            SubLObject elapsed = numeric_date_utilities.elapsed_internal_real_time(start_real_time, end_real_time);
            SubLObject seconds = numeric_date_utilities.elapsed_internal_real_time_to_elapsed_seconds(elapsed);
            SubLObject start_time = inference_start_universal_time(inference);
            SubLObject end_time = numeric_date_utilities.universal_time_seconds_from_now(seconds, start_time);
            return end_time;
        }
        return NIL;
    }

    @SubL(source = "cycl/inference/harness/inference-datastructures-inference.lisp", position = 74400L)
    public static SubLObject inference_maintain_term_working_setP(SubLObject inference) {
        assert NIL != inference_p(inference) : inference;
        return list_utilities.sublisp_boolean(inference_problem_working_time_data(inference));
    }

    @SubL(source = "cycl/inference/harness/inference-datastructures-inference.lisp", position = 74600L)
    public static SubLObject inference_halt_condition_presentP(SubLObject inference, SubLObject halt_condition) {
        assert NIL != inference_p(inference) : inference;
        assert NIL != inference_datastructures_enumerated_types.inference_halt_condition_p(halt_condition) : halt_condition;
        return list_utilities.member_eqP(halt_condition, infrnc_halt_conditions(inference));
    }

    @SubL(source = "cycl/inference/harness/inference-datastructures-inference.lisp", position = 74800L)
    public static SubLObject add_inference_accumulator(SubLObject inference, SubLObject accumulator_type, SubLObject accumulator) {
        assert NIL != inference_p(inference) : inference;
        assert NIL != inference_datastructures_enumerated_types.inference_accumulator_type_p(accumulator_type) : accumulator_type;
        assert NIL != accumulation.accumulator_p(accumulator) : accumulator;
        SubLObject dict = inference_accumulators(inference);
        dictionary.dictionary_enter(dict, accumulator_type, accumulator);
        return NIL;
    }

    @SubL(source = "cycl/inference/harness/inference-datastructures-inference.lisp", position = 75200L)
    public static SubLObject inference_accumulator(SubLObject inference, SubLObject accumulator_type) {
        assert NIL != inference_p(inference) : inference;
        assert NIL != inference_datastructures_enumerated_types.inference_accumulator_type_p(accumulator_type) : accumulator_type;
        SubLObject dict = inference_accumulators(inference);
        SubLObject accumulator = dictionary.dictionary_lookup_without_values(dict, accumulator_type, UNPROVIDED);
        if (NIL == accumulator) {
            accumulator = inference_datastructures_enumerated_types.initialize_inference_accumulator(accumulator_type);
            dictionary.dictionary_enter(dict, accumulator_type, accumulator);
        }
        return accumulator;
    }

    @SubL(source = "cycl/inference/harness/inference-datastructures-inference.lisp", position = 75700L)
    public static SubLObject inference_accumulator_contents(SubLObject inference, SubLObject accumulator_type) {
        assert NIL != inference_p(inference) : inference;
        assert NIL != inference_datastructures_enumerated_types.inference_accumulator_type_p(accumulator_type) : accumulator_type;
        return accumulation.accumulation_contents(inference_accumulator(inference, accumulator_type), UNPROVIDED);
    }

    @SubL(source = "cycl/inference/harness/inference-datastructures-inference.lisp", position = 75900L)
    public static SubLObject inference_accumulate(SubLObject inference, SubLObject accumulator_type, SubLObject element) {
        assert NIL != inference_p(inference) : inference;
        assert NIL != inference_datastructures_enumerated_types.inference_accumulator_type_p(accumulator_type) : accumulator_type;
        return accumulation.accumulation_add(inference_accumulator(inference, accumulator_type), element);
    }

    @SubL(source = "cycl/inference/harness/inference-datastructures-inference.lisp", position = 76300L)
    public static SubLObject set_inference_proof_watermark(SubLObject inference, SubLObject proof_watermark) {
        assert NIL != inference_p(inference) : inference;
        assert NIL != subl_promotions.non_negative_integer_p(proof_watermark) : proof_watermark;
        _csetf_infrnc_proof_watermark(inference, proof_watermark);
        return inference;
    }

    @SubL(source = "cycl/inference/harness/inference-datastructures-inference.lisp", position = 76500L)
    public static SubLObject compute_inference_pad_internal_real_time(SubLObject inference) {
        SubLObject pad_probability = inference_probably_approximately_done(inference);
        SubLObject pad_seconds = probably_approximately_done_cutoff_time(pad_probability);
        if (NIL != number_utilities.positive_infinity_p(pad_seconds)) {
            return number_utilities.positive_infinity();
        }
        SubLObject pad_seconds_remaining = Numbers.subtract(pad_seconds, inference_cumulative_time(inference));
        SubLObject start_time = inference_start_internal_real_time(inference);
        SubLObject pad_time = numeric_date_utilities.internal_real_time_seconds_from_now(pad_seconds_remaining, start_time);
        return pad_time;
    }

    @SubL(source = "cycl/inference/harness/inference-datastructures-inference.lisp", position = 77200L)
    public static SubLObject initialize_pad_table(SubLObject filename) {
        SubLObject scaled_times_to_first_answer = misc_utilities.scale_by_bogomips(inference_pad_data.$non_tkb_final_times_to_first_answer$.getGlobalValue(), inference_pad_data.$non_tkb_final_bogomips$.getGlobalValue());
        $pad_times_to_first_answer$.setGlobalValue(scaled_times_to_first_answer);
        return Sequences.length($pad_times_to_first_answer$.getGlobalValue());
    }

    @SubL(source = "cycl/inference/harness/inference-datastructures-inference.lisp", position = 77500L)
    public static SubLObject pad_table_initializedP() {
        return Types.consp($pad_times_to_first_answer$.getGlobalValue());
    }

    @SubL(source = "cycl/inference/harness/inference-datastructures-inference.lisp", position = 77600L)
    public static SubLObject probably_approximately_done_cutoff_time(SubLObject probability) {
        if (NIL != list_utilities.safe_E(ONE_INTEGER, probability) || NIL == pad_table_initializedP()) {
            return $POSITIVE_INFINITY;
        }
        return number_utilities.percentile_sorted($pad_times_to_first_answer$.getGlobalValue(), probability);
    }

    @SubL(source = "cycl/inference/harness/inference-datastructures-inference.lisp", position = 78000L)
    public static SubLObject compute_pad_from_time(SubLObject time) {
        if (NIL == pad_table_initializedP()) {
            return NIL;
        }
        SubLObject times = conses_high.member(time, $pad_times_to_first_answer$.getGlobalValue(), Symbols.symbol_function($sym419$_), UNPROVIDED);
        SubLObject pad = NIL;
        SubLObject total = NIL;
        SubLObject index = NIL;
        if (NIL == times) {
            return NIL;
        }
        total = Sequences.length($pad_times_to_first_answer$.getGlobalValue());
        index = Numbers.subtract(total, Sequences.length(times));
        pad = Numbers.divide(index, total);
        return pad;
    }

    @SubL(source = "cycl/inference/harness/inference-datastructures-inference.lisp", position = 78300L)
    public static SubLObject inference_note_transformation_depth(SubLObject inference, SubLObject depth) {
        SubLObject max_transformation_depth_reached = inference_max_transformation_depth_reached(inference);
        if (depth.numG(max_transformation_depth_reached)) {
            return inference_note_new_transformation_depth_reached(inference, depth);
        }
        return NIL;
    }

    @SubL(source = "cycl/inference/harness/inference-datastructures-inference.lisp", position = 78700L)
    public static SubLObject inference_note_new_transformation_depth_reached(SubLObject inference, SubLObject depth) {
        set_inference_max_transformation_depth_reached(inference, depth);
        possibly_signal_inference_new_transformation_depth_reached(inference, depth);
        if (NIL != inference_halt_condition_presentP(inference, $LOOK_NO_DEEPER_FOR_ADDITIONAL_ANSWERS) && NIL != subl_promotions.positive_integer_p(inference_answer_count(inference))) {
            set_inference_suspend_status(inference, $LOOK_NO_DEEPER_FOR_ADDITIONAL_ANSWERS);
            return $LOOK_NO_DEEPER_FOR_ADDITIONAL_ANSWERS;
        }
        return NIL;
    }

    @SubL(source = "cycl/inference/harness/inference-datastructures-inference.lisp", position = 79200L)
    public static SubLObject find_inference_answer_by_bindings(SubLObject inference, SubLObject v_bindings) {
        assert NIL != bindings.binding_list_p(v_bindings) : v_bindings;
        SubLObject dict = inference_answer_bindings_index(inference);
        return dictionary.dictionary_lookup(dict, v_bindings, UNPROVIDED);
    }

    @SubL(source = "cycl/inference/harness/inference-datastructures-inference.lisp", position = 79500L)
    public static SubLObject new_inference_answer_id(SubLObject inference) {
        SubLObject v_id_index = inference_answer_id_index(inference);
        return id_index.id_index_reserve(v_id_index);
    }

    @SubL(source = "cycl/inference/harness/inference-datastructures-inference.lisp", position = 79600L)
    public static SubLObject inference_count() {
        SubLObject count = ZERO_INTEGER;
        SubLObject idx = inference_datastructures_problem_store.problem_store_id_index();
        if (NIL == id_index.id_index_objects_empty_p(idx, $SKIP)) {
            SubLObject idx_$31 = idx;
            if (NIL == id_index.id_index_dense_objects_empty_p(idx_$31, $SKIP)) {
                SubLObject vector_var = id_index.id_index_dense_objects(idx_$31);
                SubLObject backwardP_var = NIL;
                SubLObject length;
                SubLObject v_iteration;
                SubLObject id;
                SubLObject store;
                for (length = Sequences.length(vector_var), v_iteration = NIL, v_iteration = ZERO_INTEGER; v_iteration.numL(length); v_iteration = Numbers.add(v_iteration, ONE_INTEGER)) {
                    id = ((NIL != backwardP_var) ? Numbers.subtract(length, v_iteration, ONE_INTEGER) : v_iteration);
                    store = Vectors.aref(vector_var, id);
                    if (NIL == id_index.id_index_tombstone_p(store) || NIL == id_index.id_index_skip_tombstones_p($SKIP)) {
                        if (NIL != id_index.id_index_tombstone_p(store)) {
                            store = $SKIP;
                        }
                        count = Numbers.add(count, inference_datastructures_problem_store.problem_store_inference_count(store));
                    }
                }
            }
            SubLObject idx_$32 = idx;
            if (NIL == id_index.id_index_sparse_objects_empty_p(idx_$32)) {
                SubLObject cdohash_table = id_index.id_index_sparse_objects(idx_$32);
                SubLObject id2 = NIL;
                SubLObject store2 = NIL;
                Iterator cdohash_iterator = Hashtables.getEntrySetIterator(cdohash_table);
                try {
                    while (Hashtables.iteratorHasNext(cdohash_iterator)) {
                        Map.Entry cdohash_entry = Hashtables.iteratorNextEntry(cdohash_iterator);
                        id2 = Hashtables.getEntryKey(cdohash_entry);
                        store2 = Hashtables.getEntryValue(cdohash_entry);
                        count = Numbers.add(count, inference_datastructures_problem_store.problem_store_inference_count(store2));
                    }
                } finally {
                    Hashtables.releaseEntrySetIterator(cdohash_iterator);
                }
            }
        }
        return count;
    }

    @SubL(source = "cycl/inference/harness/inference-datastructures-inference.lisp", position = 79800L)
    public static SubLObject inference_all_answers(SubLObject inference, SubLObject start_id) {
        if (start_id == UNPROVIDED) {
            start_id = ZERO_INTEGER;
        }
        assert NIL != inference_p(inference) : inference;
        assert NIL != subl_promotions.non_negative_integer_p(start_id) : start_id;
        SubLObject answers = NIL;
        SubLObject start_id_$33 = start_id;
        SubLObject end_id;
        SubLObject id;
        SubLObject v_answer;
        for (end_id = inference_next_new_answer_id(inference), id = NIL, id = start_id_$33; !id.numGE(end_id); id = number_utilities.f_1X(id)) {
            v_answer = find_inference_answer_by_id(inference, id);
            answers = cons(v_answer, answers);
        }
        start_id = end_id;
        return Sequences.nreverse(answers);
    }

    @SubL(source = "cycl/inference/harness/inference-datastructures-inference.lisp", position = 80300L)
    public static SubLObject inference_all_new_answers(SubLObject inference) {
        SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject answers = NIL;
        SubLObject start_id = inference_new_answer_id_start(inference);
        SubLObject end_id;
        SubLObject id;
        SubLObject v_answer;
        for (end_id = inference_next_new_answer_id(inference), id = NIL, id = start_id; !id.numGE(end_id); id = number_utilities.f_1X(id)) {
            v_answer = find_inference_answer_by_id(inference, id);
            if (NIL == Errors.$ignore_mustsP$.getDynamicValue(thread) && NIL == v_answer) {
                Errors.error($str421$got_a_null_answer_for__s, inference);
            }
            answers = cons(v_answer, answers);
        }
        return Sequences.nreverse(answers);
    }

    @SubL(source = "cycl/inference/harness/inference-datastructures-inference.lisp", position = 80600L)
    public static SubLObject inference_allowed_rules_list(SubLObject inference) {
        assert NIL != inference_p(inference) : inference;
        SubLObject allowed_rules = infrnc_allowed_rules(inference);
        return (NIL != set.set_p(allowed_rules)) ? set.set_element_list(allowed_rules) : allowed_rules;
    }

    @SubL(source = "cycl/inference/harness/inference-datastructures-inference.lisp", position = 80900L)
    public static SubLObject inference_allowed_rule_count(SubLObject inference) {
        SubLObject allowed_rules = infrnc_allowed_rules(inference);
        return (NIL != set.set_p(allowed_rules)) ? set.set_size(allowed_rules) : $POSITIVE_INFINITY;
    }

    @SubL(source = "cycl/inference/harness/inference-datastructures-inference.lisp", position = 81100L)
    public static SubLObject inference_forbidden_rules_list(SubLObject inference) {
        assert NIL != inference_p(inference) : inference;
        SubLObject forbidden_rules = infrnc_forbidden_rules(inference);
        return (NIL != set.set_p(forbidden_rules)) ? set.set_element_list(forbidden_rules) : forbidden_rules;
    }

    @SubL(source = "cycl/inference/harness/inference-datastructures-inference.lisp", position = 81400L)
    public static SubLObject inference_forbidden_rule_count(SubLObject inference) {
        SubLObject forbidden_rules = infrnc_forbidden_rules(inference);
        return (NIL != set.set_p(forbidden_rules)) ? set.set_size(forbidden_rules) : ZERO_INTEGER;
    }

    @SubL(source = "cycl/inference/harness/inference-datastructures-inference.lisp", position = 81700L)
    public static SubLObject inference_interrupt_signaledP(SubLObject inference) {
        return makeBoolean(NIL == queues.queue_empty_p(inference_interrupting_processes(inference)));
    }

    @SubL(source = "cycl/inference/harness/inference-datastructures-inference.lisp", position = 81800L)
    public static SubLObject inference_no_interrupt_signaledP(SubLObject inference) {
        return queues.queue_empty_p(inference_interrupting_processes(inference));
    }

    @SubL(source = "cycl/inference/harness/inference-datastructures-inference.lisp", position = 82000L)
    public static SubLObject inference_interrupt_handledP(SubLObject inference) {
        return inference_no_interrupt_signaledP(inference);
    }

    @SubL(source = "cycl/inference/harness/inference-datastructures-inference.lisp", position = 82100L)
    public static SubLObject inference_answer_count(SubLObject inference) {
        return id_index.id_index_count(inference_answer_id_index(inference));
    }

    @SubL(source = "cycl/inference/harness/inference-datastructures-inference.lisp", position = 82300L)
    public static SubLObject inference_new_answer_count(SubLObject inference) {
        return Numbers.subtract(inference_answer_count(inference), inference_new_answer_id_start(inference));
    }

    @SubL(source = "cycl/inference/harness/inference-datastructures-inference.lisp", position = 82400L)
    public static SubLObject successful_inference_p(SubLObject v_object) {
        return makeBoolean(NIL != inference_p(v_object) && inference_answer_count(v_object).isPositive());
    }

    @SubL(source = "cycl/inference/harness/inference-datastructures-inference.lisp", position = 82600L)
    public static SubLObject inference_new_justification_count(SubLObject inference) {
        return queues.queue_size(inference_new_answer_justifications(inference));
    }

    @SubL(source = "cycl/inference/harness/inference-datastructures-inference.lisp", position = 82700L)
    public static SubLObject inference_new_result_count(SubLObject inference) {
        assert NIL != inference_p(inference) : inference;
        if (NIL != inference_unique_wrt_proofsP(inference)) {
            return inference_new_justification_count(inference);
        }
        return inference_new_answer_count(inference);
    }

    @SubL(source = "cycl/inference/harness/inference-datastructures-inference.lisp", position = 83000L)
    public static SubLObject forward_inference_p(SubLObject inference) {
        return makeBoolean(NIL != inference_p(inference) && NIL != inference_datastructures_problem_store.problem_store_forwardP(inference_problem_store(inference)));
    }

    @SubL(source = "cycl/inference/harness/inference-datastructures-inference.lisp", position = 83100L)
    public static SubLObject backward_inference_p(SubLObject inference) {
        return makeBoolean(NIL != inference_p(inference) && NIL == forward_inference_p(inference));
    }

    @SubL(source = "cycl/inference/harness/inference-datastructures-inference.lisp", position = 83300L)
    public static SubLObject abductive_inference_p(SubLObject inference) {
        return makeBoolean(NIL != inference_p(inference) && NIL != inference_datastructures_problem_store.problem_store_abduction_allowedP(inference_problem_store(inference)));
    }

    @SubL(source = "cycl/inference/harness/inference-datastructures-inference.lisp", position = 83500L)
    public static SubLObject inference_provability_status(SubLObject inference) {
        assert NIL != inference_p(inference) : inference;
        if (NIL != inference_has_some_answerP(inference)) {
            return $GOOD;
        }
        if (NIL != inference_worker.no_good_problem_p(inference_root_problem(inference), $TACTICAL)) {
            return $NO_GOOD;
        }
        return $NEUTRAL;
    }

    @SubL(source = "cycl/inference/harness/inference-datastructures-inference.lisp", position = 83900L)
    public static SubLObject good_inference_p(SubLObject v_object) {
        return makeBoolean(NIL != inference_p(v_object) && $GOOD == inference_provability_status(v_object));
    }

    @SubL(source = "cycl/inference/harness/inference-datastructures-inference.lisp", position = 84100L)
    public static SubLObject neutral_inference_p(SubLObject v_object) {
        return makeBoolean(NIL != inference_p(v_object) && $NEUTRAL == inference_provability_status(v_object));
    }

    @SubL(source = "cycl/inference/harness/inference-datastructures-inference.lisp", position = 84300L)
    public static SubLObject no_good_inference_p(SubLObject v_object) {
        return makeBoolean(NIL != inference_p(v_object) && $NO_GOOD == inference_provability_status(v_object));
    }

    @SubL(source = "cycl/inference/harness/inference-datastructures-inference.lisp", position = 84500L)
    public static SubLObject closed_inference_p(SubLObject v_object) {
        return makeBoolean(NIL != inference_p(v_object) && NIL != inference_no_free_hl_varsP(v_object));
    }

    @SubL(source = "cycl/inference/harness/inference-datastructures-inference.lisp", position = 84700L)
    public static SubLObject inference_set_static_properties(SubLObject inference, SubLObject static_properties) {
        assert NIL != inference_datastructures_enumerated_types.inference_static_properties_p(static_properties) : static_properties;
        SubLObject disjunction_free_el_vars_policy = inference_datastructures_enumerated_types.inference_properties_disjunction_free_el_vars_policy(static_properties);
        set_inference_disjunction_free_el_vars_policy(inference, disjunction_free_el_vars_policy);
        SubLObject uniqueness_criterion = inference_datastructures_enumerated_types.inference_properties_uniqueness_criterion(static_properties);
        set_inference_result_uniqueness_criterion(inference, uniqueness_criterion);
        SubLObject allow_hl_predicate_transformationP = inference_datastructures_enumerated_types.inference_properties_allow_hl_predicate_transformationP(static_properties);
        set_inference_allow_hl_predicate_transformation(inference, allow_hl_predicate_transformationP);
        SubLObject allow_unbound_predicate_transformationP = inference_datastructures_enumerated_types.inference_properties_allow_unbound_predicate_transformationP(static_properties);
        set_inference_allow_unbound_predicate_transformation(inference, allow_unbound_predicate_transformationP);
        SubLObject allow_evaluatable_predicate_transformationP = inference_datastructures_enumerated_types.inference_properties_allow_evaluatable_predicate_transformationP(static_properties);
        set_inference_allow_evaluatable_predicate_transformation(inference, allow_evaluatable_predicate_transformationP);
        SubLObject allow_indeterminate_resultsP = inference_datastructures_enumerated_types.inference_properties_allow_indeterminate_resultsP(static_properties);
        set_inference_allow_indeterminate_results(inference, allow_indeterminate_resultsP);
        SubLObject allowed_rules = inference_datastructures_enumerated_types.inference_properties_allowed_rules(static_properties);
        assert NIL != inference_utilities.allowed_rules_spec_p(allowed_rules) : allowed_rules;
        if ($ALL == allowed_rules) {
            set_inference_allowed_rules(inference, $ALL);
        } else {
            set_inference_allowed_rules(inference, set_utilities.construct_set_from_list(allowed_rules, Symbols.symbol_function(EQL), UNPROVIDED));
        }
        SubLObject forbidden_rules = inference_datastructures_enumerated_types.inference_properties_forbidden_rules(static_properties);
        assert NIL != inference_utilities.forbidden_rules_spec_p(forbidden_rules) : forbidden_rules;
        if ($NONE == forbidden_rules) {
            set_inference_forbidden_rules(inference, $NONE);
        } else {
            set_inference_forbidden_rules(inference, set_utilities.construct_set_from_list(forbidden_rules, Symbols.symbol_function(EQL), UNPROVIDED));
        }
        SubLObject allowed_modules = inference_datastructures_enumerated_types.inference_properties_allowed_modules(static_properties);
        set_inference_allowed_modules(inference, allowed_modules);
        SubLObject allow_abnormality_checkingP = inference_datastructures_enumerated_types.inference_properties_allow_abnormality_checkingP(static_properties);
        set_inference_allow_abnormality_checking(inference, allow_abnormality_checkingP);
        SubLObject transitive_closure_mode = inference_datastructures_enumerated_types.inference_properties_transitive_closure_mode(static_properties);
        set_inference_transitive_closure_mode(inference, transitive_closure_mode);
        SubLObject maintain_term_working_setP = inference_datastructures_enumerated_types.inference_properties_maintain_term_working_setP(static_properties);
        if (NIL != maintain_term_working_setP) {
            initialize_inference_problem_working_time_data(inference);
        }
        SubLObject events = inference_datastructures_enumerated_types.inference_properties_events(static_properties);
        set_inference_events(inference, events);
        SubLObject halt_conditions = inference_datastructures_enumerated_types.inference_properties_halt_conditions(static_properties);
        set_inference_halt_conditions(inference, halt_conditions);
        return inference;
    }

    @SubL(source = "cycl/inference/harness/inference-datastructures-inference.lisp", position = 87800L)
    public static SubLObject update_inference_input_query_properties(SubLObject inference, SubLObject input_dynamic_properties) {
        assert NIL != inference_datastructures_enumerated_types.query_dynamic_properties_p(input_dynamic_properties) : input_dynamic_properties;
        SubLObject input_query_properties = infrnc_input_query_properties(inference);
        SubLObject static_mode = inference_datastructures_enumerated_types.inference_properties_mode(input_query_properties);
        SubLObject dynamic_mode = inference_datastructures_enumerated_types.inference_properties_mode(input_dynamic_properties);
        SubLObject mode_mismatchP = makeBoolean(!static_mode.eql(dynamic_mode));
        if (NIL != mode_mismatchP) {
            input_query_properties = inference_datastructures_enumerated_types.extract_query_static_properties(inference_strategist.explicify_inference_mode_defaults(input_query_properties));
            input_query_properties = conses_high.putf(input_query_properties, $INFERENCE_MODE, dynamic_mode);
            input_query_properties = inference_strategist.implicify_inference_mode_defaults(input_query_properties);
        }
        SubLObject remainder;
        SubLObject property;
        SubLObject value;
        for (remainder = NIL, remainder = input_dynamic_properties; NIL != remainder; remainder = conses_high.cddr(remainder)) {
            property = remainder.first();
            value = conses_high.cadr(remainder);
            input_query_properties = conses_high.putf(input_query_properties, property, value);
        }
        set_inference_input_query_properties(inference, input_query_properties);
        return NIL;
    }

    @SubL(source = "cycl/inference/harness/inference-datastructures-inference.lisp", position = 89000L)
    public static SubLObject add_inference_relevant_problem(SubLObject inference, SubLObject problem) {
        assert NIL != inference_p(inference) : inference;
        assert NIL != inference_datastructures_problem.problem_p(problem) : problem;
        set.set_add(problem, infrnc_relevant_problems(inference));
        return inference;
    }

    @SubL(source = "cycl/inference/harness/inference-datastructures-inference.lisp", position = 89200L)
    public static SubLObject remove_inference_relevant_problem(SubLObject inference, SubLObject problem) {
        assert NIL != inference_p(inference) : inference;
        assert NIL != inference_datastructures_problem.problem_p(problem) : problem;
        set.set_remove(problem, infrnc_relevant_problems(inference));
        return inference;
    }

    @SubL(source = "cycl/inference/harness/inference-datastructures-inference.lisp", position = 89400L)
    public static SubLObject clear_inference_relevant_problems(SubLObject inference) {
        assert NIL != inference_p(inference) : inference;
        set.clear_set(infrnc_relevant_problems(inference));
        return inference;
    }

    @SubL(source = "cycl/inference/harness/inference-datastructures-inference.lisp", position = 89600L)
    public static SubLObject add_inference_strategy(SubLObject inference, SubLObject strategy) {
        assert NIL != inference_p(inference) : inference;
        assert NIL != inference_datastructures_strategy.strategy_p(strategy) : strategy;
        set.set_add(strategy, infrnc_strategy_set(inference));
        return inference;
    }

    @SubL(source = "cycl/inference/harness/inference-datastructures-inference.lisp", position = 89800L)
    public static SubLObject remove_inference_strategy(SubLObject inference, SubLObject strategy) {
        assert NIL != inference_p(inference) : inference;
        assert NIL != inference_datastructures_strategy.strategy_p(strategy) : strategy;
        set.set_remove(strategy, infrnc_strategy_set(inference));
        return inference;
    }

    @SubL(source = "cycl/inference/harness/inference-datastructures-inference.lisp", position = 90000L)
    public static SubLObject clear_inference_strategy_set(SubLObject inference) {
        assert NIL != inference_p(inference) : inference;
        set.clear_set(infrnc_strategy_set(inference));
        return inference;
    }

    @SubL(source = "cycl/inference/harness/inference-datastructures-inference.lisp", position = 90200L)
    public static SubLObject reset_inference_new_answer_id(SubLObject inference) {
        SubLObject next_id = inference_next_new_answer_id(inference);
        _csetf_infrnc_new_answer_id_start(inference, next_id);
        return inference;
    }

    @SubL(source = "cycl/inference/harness/inference-datastructures-inference.lisp", position = 90400L)
    public static SubLObject inference_next_new_answer_id(SubLObject inference) {
        SubLObject v_id_index = inference_answer_id_index(inference);
        return id_index.id_index_next_id(v_id_index);
    }

    @SubL(source = "cycl/inference/harness/inference-datastructures-inference.lisp", position = 90600L)
    public static SubLObject add_inference_new_answer_by_id(SubLObject inference, SubLObject v_answer) {
        assert NIL != inference_answer_p(v_answer) : v_answer;
        SubLObject id = inference_answer_suid(v_answer);
        SubLObject v_id_index = inference_answer_id_index(inference);
        id_index.id_index_enter_autoextend(v_id_index, id, v_answer, NIL);
        return inference;
    }

    @SubL(source = "cycl/inference/harness/inference-datastructures-inference.lisp", position = 90900L)
    public static SubLObject remove_inference_new_answer_by_id(SubLObject inference, SubLObject v_answer) {
        assert NIL != inference_answer_p(v_answer) : v_answer;
        SubLObject id = inference_answer_suid(v_answer);
        SubLObject v_id_index = inference_answer_id_index(inference);
        id_index.id_index_remove(v_id_index, id);
        return inference;
    }

    @SubL(source = "cycl/inference/harness/inference-datastructures-inference.lisp", position = 91100L)
    public static SubLObject add_inference_new_answer_by_bindings(SubLObject inference, SubLObject v_answer) {
        assert NIL != inference_answer_p(v_answer) : v_answer;
        SubLObject v_bindings = inference_answer_bindings(v_answer);
        SubLObject index = inference_answer_bindings_index(inference);
        dictionary.dictionary_enter(index, v_bindings, v_answer);
        return inference;
    }

    @SubL(source = "cycl/inference/harness/inference-datastructures-inference.lisp", position = 91500L)
    public static SubLObject remove_inference_new_answer_by_bindings(SubLObject inference, SubLObject v_answer) {
        assert NIL != inference_answer_p(v_answer) : v_answer;
        SubLObject v_bindings = inference_answer_bindings(v_answer);
        SubLObject index = inference_answer_bindings_index(inference);
        dictionary.dictionary_remove(index, v_bindings);
        return inference;
    }

    @SubL(source = "cycl/inference/harness/inference-datastructures-inference.lisp", position = 91800L)
    public static SubLObject reset_inference_new_answer_justifications(SubLObject inference) {
        queues.clear_queue(inference_new_answer_justifications(inference));
        return inference;
    }

    @SubL(source = "cycl/inference/harness/inference-datastructures-inference.lisp", position = 91900L)
    public static SubLObject add_inference_new_answer_justification(SubLObject inference, SubLObject answer_justification) {
        assert NIL != inference_answer_justification_p(answer_justification) : answer_justification;
        queues.enqueue(answer_justification, inference_new_answer_justifications(inference));
        return inference;
    }

    @SubL(source = "cycl/inference/harness/inference-datastructures-inference.lisp", position = 92300L)
    public static SubLObject remove_inference_new_answer_justification(SubLObject inference, SubLObject answer_justification) {
        assert NIL != inference_answer_justification_p(answer_justification) : answer_justification;
        queues.remqueue(answer_justification, inference_new_answer_justifications(inference), UNPROVIDED);
        return inference;
    }

    @SubL(source = "cycl/inference/harness/inference-datastructures-inference.lisp", position = 92600L)
    public static SubLObject clear_inference_control_process(SubLObject inference) {
        return set_inference_control_process(inference, NIL);
    }

    @SubL(source = "cycl/inference/harness/inference-datastructures-inference.lisp", position = 92700L)
    public static SubLObject set_inference_control_process_to_me(SubLObject inference) {
        return set_inference_control_process(inference, Threads.current_process());
    }

    @SubL(source = "cycl/inference/harness/inference-datastructures-inference.lisp", position = 92900L)
    public static SubLObject note_inference_interrupt_signaled(SubLObject inference, SubLObject process) {
        assert NIL != Types.processp(process) : process;
        queues.enqueue(process, inference_interrupting_processes(inference));
        return inference;
    }

    @SubL(source = "cycl/inference/harness/inference-datastructures-inference.lisp", position = 93000L)
    public static SubLObject increment_inference_cumulative_time(SubLObject inference, SubLObject time_delta) {
        SubLObject cumulative_time = inference_cumulative_time(inference);
        cumulative_time = Numbers.add(cumulative_time, time_delta);
        set_inference_cumulative_time(inference, cumulative_time);
        return inference;
    }

    @SubL(source = "cycl/inference/harness/inference-datastructures-inference.lisp", position = 93300L)
    public static SubLObject reorder_inference_free_hl_vars(SubLObject inference, SubLObject new_hl_vars) {
        SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject old_hl_vars = inference_free_hl_vars(inference);
        if (NIL == Errors.$ignore_mustsP$.getDynamicValue(thread) && NIL == conses_high.subsetp(old_hl_vars, new_hl_vars, Symbols.symbol_function(EQL), UNPROVIDED)) {
            Errors.error($str435$variables__S_were_removed, conses_high.set_difference(old_hl_vars, new_hl_vars, Symbols.symbol_function(EQL), UNPROVIDED));
        }
        if (NIL == Errors.$ignore_mustsP$.getDynamicValue(thread) && NIL == conses_high.subsetp(new_hl_vars, old_hl_vars, Symbols.symbol_function(EQL), UNPROVIDED)) {
            Errors.error($str436$variables__S_were_added, conses_high.set_difference(new_hl_vars, old_hl_vars, Symbols.symbol_function(EQL), UNPROVIDED));
        }
        if (NIL == Errors.$ignore_mustsP$.getDynamicValue(thread) && !Sequences.length(old_hl_vars).numE(Sequences.length(new_hl_vars))) {
            Errors.error($str437$variables__S_contain_duplications, new_hl_vars);
        }
        set_inference_free_hl_vars(inference, new_hl_vars);
        return inference;
    }

    @SubL(source = "cycl/inference/harness/inference-datastructures-inference.lisp", position = 94000L)
    public static SubLObject reorder_inference_free_el_vars(SubLObject inference, SubLObject new_el_vars) {
        SubLObject el_bindings = inference_el_bindings(inference);
        SubLObject new_hl_vars = bindings.apply_bindings(el_bindings, new_el_vars);
        return reorder_inference_free_hl_vars(inference, new_hl_vars);
    }

    @SubL(source = "cycl/inference/harness/inference-datastructures-inference.lisp", position = 94300L)
    public static SubLObject reset_inference_new_answers(SubLObject inference) {
        reset_inference_new_answer_id(inference);
        reset_inference_new_answer_justifications(inference);
        return inference;
    }

    @SubL(source = "cycl/inference/harness/inference-datastructures-inference.lisp", position = 94500L)
    public static SubLObject add_inference_new_answer(SubLObject inference, SubLObject v_answer) {
        assert NIL != inference_answer_p(v_answer) : v_answer;
        add_inference_new_answer_by_id(inference, v_answer);
        add_inference_new_answer_by_bindings(inference, v_answer);
        return inference;
    }

    @SubL(source = "cycl/inference/harness/inference-datastructures-inference.lisp", position = 94700L)
    public static SubLObject remove_inference_new_answer(SubLObject inference, SubLObject v_answer) {
        assert NIL != inference_answer_p(v_answer) : v_answer;
        remove_inference_new_answer_by_id(inference, v_answer);
        remove_inference_new_answer_by_bindings(inference, v_answer);
        return inference;
    }

    @SubL(source = "cycl/inference/harness/inference-datastructures-inference.lisp", position = 95000L)
    public static SubLObject initialize_inference_time_properties(SubLObject inference) {
        SubLObject real_time_now = Time.get_internal_real_time();
        SubLObject now = Time.get_universal_time();
        set_inference_start_internal_real_time(inference, real_time_now);
        set_inference_start_universal_time(inference, now);
        SubLObject max_time = inference_max_time(inference);
        SubLObject end_time = (NIL != max_time) ? numeric_date_utilities.internal_real_time_seconds_from_now(max_time, real_time_now) : NIL;
        set_inference_end_internal_real_time(inference, end_time);
        SubLObject pad_time = compute_inference_pad_internal_real_time(inference);
        set_inference_pad_internal_real_time(inference, pad_time);
        return inference;
    }

    @SubL(source = "cycl/inference/harness/inference-datastructures-inference.lisp", position = 95600L)
    public static SubLObject finalize_inference_time_properties(SubLObject inference) {
        SubLObject delta_time = inference_time_so_far(inference, NIL);
        increment_inference_cumulative_time(inference, delta_time);
        return inference;
    }

    @SubL(source = "cycl/inference/harness/inference-datastructures-inference.lisp", position = 95900L)
    public static SubLObject inference_elapsed_internal_real_time_since_start(SubLObject inference) {
        SubLObject start = inference_start_internal_real_time(inference);
        SubLObject elapsed = numeric_date_utilities.elapsed_internal_real_time(start, UNPROVIDED);
        return elapsed;
    }

    @SubL(source = "cycl/inference/harness/inference-datastructures-inference.lisp", position = 96100L)
    public static SubLObject inference_elapsed_universal_time_since_start(SubLObject inference) {
        SubLObject start = inference_start_universal_time(inference);
        SubLObject elapsed = subl_promotions.elapsed_universal_time(start, UNPROVIDED);
        return elapsed;
    }

    @SubL(source = "cycl/inference/harness/inference-datastructures-inference.lisp", position = 96300L)
    public static SubLObject inference_time_so_far(SubLObject inference, SubLObject seconds_granularityP) {
        if (seconds_granularityP == UNPROVIDED) {
            seconds_granularityP = T;
        }
        SubLObject seconds = ZERO_INTEGER;
        if (NIL != running_inference_p(inference)) {
            if (NIL != seconds_granularityP) {
                seconds = inference_elapsed_universal_time_since_start(inference);
            } else {
                SubLObject elapsed = inference_elapsed_internal_real_time_since_start(inference);
                seconds = numeric_date_utilities.elapsed_internal_real_time_to_elapsed_seconds(elapsed);
            }
        }
        return seconds;
    }

    @SubL(source = "cycl/inference/harness/inference-datastructures-inference.lisp", position = 96800L)
    public static SubLObject inference_remaining_time(SubLObject inference, SubLObject seconds_granularityP) {
        if (seconds_granularityP == UNPROVIDED) {
            seconds_granularityP = T;
        }
        assert NIL != inference_p(inference) : inference;
        SubLObject end = inference_end_internal_real_time(inference);
        if (NIL != running_inference_p(inference) && end.isInteger()) {
            SubLObject now = Time.get_internal_real_time();
            SubLObject remaining = numeric_date_utilities.elapsed_internal_real_time(now, end);
            SubLObject remaining_seconds = numeric_date_utilities.elapsed_internal_real_time_to_elapsed_seconds(remaining);
            if (NIL != seconds_granularityP) {
                remaining_seconds = Numbers.truncate(remaining_seconds, UNPROVIDED);
            }
            return remaining_seconds;
        }
        return NIL;
    }

    @SubL(source = "cycl/inference/harness/inference-datastructures-inference.lisp", position = 97500L)
    public static SubLObject inference_cumulative_time_so_far(SubLObject inference, SubLObject seconds_granularityP) {
        if (seconds_granularityP == UNPROVIDED) {
            seconds_granularityP = T;
        }
        SubLObject cumulative = inference_cumulative_time(inference);
        SubLObject so_far = inference_time_so_far(inference, NIL);
        SubLObject total = Numbers.add(cumulative, so_far);
        if (NIL != seconds_granularityP) {
            total = Numbers.truncate(total, UNPROVIDED);
        }
        return total;
    }

    @SubL(source = "cycl/inference/harness/inference-datastructures-inference.lisp", position = 98000L)
    public static SubLObject inference_signal_interrupt(SubLObject inference) {
        note_inference_interrupt_signaled(inference, Threads.current_process());
        return inference;
    }

    @SubL(source = "cycl/inference/harness/inference-datastructures-inference.lisp", position = 98100L)
    public static SubLObject inference_handle_interrupts(SubLObject inference) {
        SubLObject interrupt_handledP = NIL;
        if (NIL != valid_inference_p(inference)) {
            for (SubLObject q = inference_interrupting_processes(inference), done_var = queues.queue_empty_p(q); NIL == done_var; done_var = queues.queue_empty_p(q)) {
                SubLObject process = queues.dequeue(q);
                Threads.process_unblock(process);
                interrupt_handledP = T;
            }
        }
        return interrupt_handledP;
    }

    @SubL(source = "cycl/inference/harness/inference-datastructures-inference.lisp", position = 98500L)
    public static SubLObject simplest_inference_p(SubLObject v_object) {
        return makeBoolean(NIL != inference_p(v_object) && $SIMPLEST == inference_type(v_object));
    }

    @SubL(source = "cycl/inference/harness/inference-datastructures-inference.lisp", position = 98800L)
    public static SubLObject new_simplest_inference(SubLObject store) {
        assert NIL != inference_datastructures_problem_store.problem_store_p(store) : store;
        SubLObject inference = new_inference(store);
        set_inference_type(inference, $SIMPLEST);
        return inference;
    }

    @SubL(source = "cycl/inference/harness/inference-datastructures-inference.lisp", position = 99000L)
    public static SubLObject simplest_inference_strategy(SubLObject inference) {
        assert NIL != simplest_inference_p(inference) : inference;
        return inference_data(inference);
    }

    @SubL(source = "cycl/inference/harness/inference-datastructures-inference.lisp", position = 99100L)
    public static SubLObject set_simplest_inference_strategy(SubLObject inference, SubLObject strategy) {
        assert NIL != simplest_inference_p(inference) : inference;
        assert NIL != inference_datastructures_strategy.strategy_p(strategy) : strategy;
        _csetf_infrnc_data(inference, strategy);
        return inference;
    }

    @SubL(source = "cycl/inference/harness/inference-datastructures-inference.lisp", position = 99300L)
    public static SubLObject new_simplest_inference_of_type(SubLObject store, SubLObject strategy_type) {
        assert NIL != inference_datastructures_problem_store.problem_store_p(store) : store;
        assert NIL != inference_datastructures_strategy.strategy_type_p(strategy_type) : strategy_type;
        SubLObject inference = new_simplest_inference(store);
        SubLObject strategy = inference_datastructures_strategy.new_strategy(strategy_type, inference);
        set_simplest_inference_strategy(inference, strategy);
        inference_tactician.clear_strategy_step_count();
        return inference;
    }

    @SubL(source = "cycl/inference/harness/inference-datastructures-inference.lisp", position = 99700L)
    public static SubLObject new_simplest_inference_with_new_store(SubLObject strategy_type) {
        SubLObject new_store = inference_datastructures_problem_store.new_problem_store(UNPROVIDED);
        return new_simplest_inference_of_type(new_store, strategy_type);
    }

    @SubL(source = "cycl/inference/harness/inference-datastructures-inference.lisp", position = 100300L)
    public static SubLObject inference_answer_print_function_trampoline(SubLObject v_object, SubLObject stream) {
        print_inference_answer(v_object, stream, ZERO_INTEGER);
        return NIL;
    }

    @SubL(source = "cycl/inference/harness/inference-datastructures-inference.lisp", position = 100300L)
    public static SubLObject inference_answer_p(SubLObject v_object) {
        return (v_object.getClass() == $inference_answer_native.class) ? T : NIL;
    }

    @SubL(source = "cycl/inference/harness/inference-datastructures-inference.lisp", position = 100300L)
    public static SubLObject inf_answer_suid(SubLObject v_object) {
        assert NIL != inference_answer_p(v_object) : v_object;
        return v_object.getField2();
    }

    @SubL(source = "cycl/inference/harness/inference-datastructures-inference.lisp", position = 100300L)
    public static SubLObject inf_answer_inference(SubLObject v_object) {
        assert NIL != inference_answer_p(v_object) : v_object;
        return v_object.getField3();
    }

    @SubL(source = "cycl/inference/harness/inference-datastructures-inference.lisp", position = 100300L)
    public static SubLObject inf_answer_bindings(SubLObject v_object) {
        assert NIL != inference_answer_p(v_object) : v_object;
        return v_object.getField4();
    }

    @SubL(source = "cycl/inference/harness/inference-datastructures-inference.lisp", position = 100300L)
    public static SubLObject inf_answer_justifications(SubLObject v_object) {
        assert NIL != inference_answer_p(v_object) : v_object;
        return v_object.getField5();
    }

    @SubL(source = "cycl/inference/harness/inference-datastructures-inference.lisp", position = 100300L)
    public static SubLObject inf_answer_elapsed_creation_time(SubLObject v_object) {
        assert NIL != inference_answer_p(v_object) : v_object;
        return v_object.getField6();
    }

    @SubL(source = "cycl/inference/harness/inference-datastructures-inference.lisp", position = 100300L)
    public static SubLObject inf_answer_step_count(SubLObject v_object) {
        assert NIL != inference_answer_p(v_object) : v_object;
        return v_object.getField7();
    }

    @SubL(source = "cycl/inference/harness/inference-datastructures-inference.lisp", position = 100300L)
    public static SubLObject _csetf_inf_answer_suid(SubLObject v_object, SubLObject value) {
        assert NIL != inference_answer_p(v_object) : v_object;
        return v_object.setField2(value);
    }

    @SubL(source = "cycl/inference/harness/inference-datastructures-inference.lisp", position = 100300L)
    public static SubLObject _csetf_inf_answer_inference(SubLObject v_object, SubLObject value) {
        assert NIL != inference_answer_p(v_object) : v_object;
        return v_object.setField3(value);
    }

    @SubL(source = "cycl/inference/harness/inference-datastructures-inference.lisp", position = 100300L)
    public static SubLObject _csetf_inf_answer_bindings(SubLObject v_object, SubLObject value) {
        assert NIL != inference_answer_p(v_object) : v_object;
        return v_object.setField4(value);
    }

    @SubL(source = "cycl/inference/harness/inference-datastructures-inference.lisp", position = 100300L)
    public static SubLObject _csetf_inf_answer_justifications(SubLObject v_object, SubLObject value) {
        assert NIL != inference_answer_p(v_object) : v_object;
        return v_object.setField5(value);
    }

    @SubL(source = "cycl/inference/harness/inference-datastructures-inference.lisp", position = 100300L)
    public static SubLObject _csetf_inf_answer_elapsed_creation_time(SubLObject v_object, SubLObject value) {
        assert NIL != inference_answer_p(v_object) : v_object;
        return v_object.setField6(value);
    }

    @SubL(source = "cycl/inference/harness/inference-datastructures-inference.lisp", position = 100300L)
    public static SubLObject _csetf_inf_answer_step_count(SubLObject v_object, SubLObject value) {
        assert NIL != inference_answer_p(v_object) : v_object;
        return v_object.setField7(value);
    }

    @SubL(source = "cycl/inference/harness/inference-datastructures-inference.lisp", position = 100300L)
    public static SubLObject make_inference_answer(SubLObject arglist) {
        if (arglist == UNPROVIDED) {
            arglist = NIL;
        }
        SubLObject v_new = new $inference_answer_native();
        SubLObject next;
        SubLObject current_arg;
        SubLObject current_value;
        SubLObject pcase_var;
        for (next = NIL, next = arglist; NIL != next; next = conses_high.cddr(next)) {
            current_arg = next.first();
            current_value = conses_high.cadr(next);
            pcase_var = current_arg;
            if (pcase_var.eql($SUID)) {
                _csetf_inf_answer_suid(v_new, current_value);
            } else if (pcase_var.eql($INFERENCE)) {
                _csetf_inf_answer_inference(v_new, current_value);
            } else if (pcase_var.eql($BINDINGS)) {
                _csetf_inf_answer_bindings(v_new, current_value);
            } else if (pcase_var.eql($JUSTIFICATIONS)) {
                _csetf_inf_answer_justifications(v_new, current_value);
            } else if (pcase_var.eql($ELAPSED_CREATION_TIME)) {
                _csetf_inf_answer_elapsed_creation_time(v_new, current_value);
            } else if (pcase_var.eql($STEP_COUNT)) {
                _csetf_inf_answer_step_count(v_new, current_value);
            } else {
                Errors.error($str275$Invalid_slot__S_for_construction_, current_arg);
            }
        }
        return v_new;
    }

    @SubL(source = "cycl/inference/harness/inference-datastructures-inference.lisp", position = 100300L)
    public static SubLObject visit_defstruct_inference_answer(SubLObject obj, SubLObject visitor_fn) {
        Functions.funcall(visitor_fn, obj, $BEGIN, $sym464$MAKE_INFERENCE_ANSWER, SIX_INTEGER);
        Functions.funcall(visitor_fn, obj, $SLOT, $SUID, inf_answer_suid(obj));
        Functions.funcall(visitor_fn, obj, $SLOT, $INFERENCE, inf_answer_inference(obj));
        Functions.funcall(visitor_fn, obj, $SLOT, $BINDINGS, inf_answer_bindings(obj));
        Functions.funcall(visitor_fn, obj, $SLOT, $JUSTIFICATIONS, inf_answer_justifications(obj));
        Functions.funcall(visitor_fn, obj, $SLOT, $ELAPSED_CREATION_TIME, inf_answer_elapsed_creation_time(obj));
        Functions.funcall(visitor_fn, obj, $SLOT, $STEP_COUNT, inf_answer_step_count(obj));
        Functions.funcall(visitor_fn, obj, $END, $sym464$MAKE_INFERENCE_ANSWER, SIX_INTEGER);
        return obj;
    }

    @SubL(source = "cycl/inference/harness/inference-datastructures-inference.lisp", position = 100300L)
    public static SubLObject visit_defstruct_object_inference_answer_method(SubLObject obj, SubLObject visitor_fn) {
        return visit_defstruct_inference_answer(obj, visitor_fn);
    }

    @SubL(source = "cycl/inference/harness/inference-datastructures-inference.lisp", position = 101200L)
    public static SubLObject valid_inference_answer_p(SubLObject v_object) {
        return makeBoolean(NIL != inference_answer_p(v_object) && NIL == inference_answer_invalid_p(v_object));
    }

    @SubL(source = "cycl/inference/harness/inference-datastructures-inference.lisp", position = 101400L)
    public static SubLObject inference_answer_invalid_p(SubLObject inference_answer) {
        return Equality.eq($FREE, inference_answer_bindings(inference_answer));
    }

    @SubL(source = "cycl/inference/harness/inference-datastructures-inference.lisp", position = 101500L)
    public static SubLObject print_inference_answer(SubLObject v_object, SubLObject stream, SubLObject depth) {
        if (NIL != inference_answer_invalid_p(v_object)) {
            PrintLow.format(stream, $str466$_Invalid_INFERENCE_ANSWER__s_, inf_answer_suid(v_object));
        } else {
            SubLObject inference = inference_answer_inference(v_object);
            SubLObject inf_suid = inference_suid(inference);
            SubLObject store = inference_problem_store(inference);
            SubLObject store_suid = (NIL != inference_datastructures_problem_store.problem_store_p(store)) ? inference_datastructures_problem_store.problem_store_suid(store) : NIL;
            PrintLow.format(stream, $str467$_INFERENCE_ANSWER__a_for_INFERENC, new SubLObject[] { inference_answer_suid(v_object), store_suid, inf_suid, inference_answer_bindings(v_object) });
        }
        return NIL;
    }

    @SubL(source = "cycl/inference/harness/inference-datastructures-inference.lisp", position = 102200L)
    public static SubLObject sxhash_inference_answer_method(SubLObject v_object) {
        return inf_answer_suid(v_object);
    }

    @SubL(source = "cycl/inference/harness/inference-datastructures-inference.lisp", position = 102300L)
    public static SubLObject new_inference_answer(SubLObject inference, SubLObject v_bindings) {
        assert NIL != inference_p(inference) : inference;
        assert NIL != bindings.bindings_p(v_bindings) : v_bindings;
        SubLObject v_answer = make_inference_answer(UNPROVIDED);
        SubLObject suid = new_inference_answer_id(inference);
        if (suid.isZero()) {
            inference_metrics.increment_successful_inference_historical_count();
        }
        _csetf_inf_answer_suid(v_answer, suid);
        _csetf_inf_answer_inference(v_answer, inference);
        set_inference_answer_bindings(v_answer, v_bindings);
        _csetf_inf_answer_justifications(v_answer, NIL);
        initialize_inference_answer_elapsed_creation_time(v_answer);
        SubLObject step_count = inference_cumulative_step_count(inference);
        set_inference_answer_step_count(v_answer, step_count);
        add_inference_new_answer(inference, v_answer);
        possibly_signal_new_inference_answer(inference, v_answer);
        return v_answer;
    }

    @SubL(source = "cycl/inference/harness/inference-datastructures-inference.lisp", position = 103300L)
    public static SubLObject find_or_create_inference_answer(SubLObject inference, SubLObject v_bindings) {
        assert NIL != inference_p(inference) : inference;
        SubLObject v_answer = find_inference_answer_by_bindings(inference, v_bindings);
        SubLObject newP = NIL;
        if (NIL == v_answer) {
            v_answer = new_inference_answer(inference, v_bindings);
            newP = T;
        }
        return Values.values(v_answer, newP);
    }

    @SubL(source = "cycl/inference/harness/inference-datastructures-inference.lisp", position = 103700L)
    public static SubLObject do_inference_answer_justifications(SubLObject macroform, SubLObject environment) {
        SubLObject current;
        SubLObject datum = current = macroform.rest();
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, $list470);
        SubLObject temp = current.rest();
        current = current.first();
        SubLObject just_var = NIL;
        SubLObject inference_answer = NIL;
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, $list470);
        just_var = current.first();
        current = current.rest();
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, $list470);
        inference_answer = current.first();
        current = current.rest();
        if (NIL == current) {
            SubLObject body;
            current = (body = temp);
            return listS($sym471$DO_LIST, list(just_var, list($sym472$INFERENCE_ANSWER_JUSTIFICATIONS, inference_answer)), append(body, NIL));
        }
        cdestructuring_bind.cdestructuring_bind_error(datum, $list470);
        return NIL;
    }

    @SubL(source = "cycl/inference/harness/inference-datastructures-inference.lisp", position = 103900L)
    public static SubLObject do_inference_answer_justifications_numbered(SubLObject macroform, SubLObject environment) {
        SubLObject current;
        SubLObject datum = current = macroform.rest();
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, $list473);
        SubLObject temp = current.rest();
        current = current.first();
        SubLObject just_var = NIL;
        SubLObject index_var = NIL;
        SubLObject inference_answer = NIL;
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, $list473);
        just_var = current.first();
        current = current.rest();
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, $list473);
        index_var = current.first();
        current = current.rest();
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, $list473);
        inference_answer = current.first();
        current = current.rest();
        if (NIL == current) {
            SubLObject body;
            current = (body = temp);
            return listS($sym474$CDOLIST_NUMBERED, list(just_var, index_var, list($sym472$INFERENCE_ANSWER_JUSTIFICATIONS, inference_answer)), append(body, NIL));
        }
        cdestructuring_bind.cdestructuring_bind_error(datum, $list473);
        return NIL;
    }

    @SubL(source = "cycl/inference/harness/inference-datastructures-inference.lisp", position = 104100L)
    public static SubLObject destroy_inference_answer(SubLObject v_answer) {
        if (NIL != valid_inference_answer_p(v_answer)) {
            note_inference_answer_invalid(v_answer);
            SubLObject cdolist_list_var = inference_answer_justifications(v_answer);
            SubLObject justification = NIL;
            justification = cdolist_list_var.first();
            while (NIL != cdolist_list_var) {
                destroy_inference_answer_justification(justification);
                cdolist_list_var = cdolist_list_var.rest();
                justification = cdolist_list_var.first();
            }
            SubLObject inference = inference_answer_inference(v_answer);
            remove_inference_new_answer(inference, v_answer);
            return destroy_inference_answer_int(v_answer);
        }
        return NIL;
    }

    @SubL(source = "cycl/inference/harness/inference-datastructures-inference.lisp", position = 104600L)
    public static SubLObject destroy_inference_answer_int(SubLObject v_answer) {
        _csetf_inf_answer_justifications(v_answer, $FREE);
        _csetf_inf_answer_inference(v_answer, $FREE);
        return v_answer;
    }

    @SubL(source = "cycl/inference/harness/inference-datastructures-inference.lisp", position = 104800L)
    public static SubLObject note_inference_answer_invalid(SubLObject v_answer) {
        _csetf_inf_answer_bindings(v_answer, $FREE);
        return v_answer;
    }

    @SubL(source = "cycl/inference/harness/inference-datastructures-inference.lisp", position = 104900L)
    public static SubLObject inference_answer_suid(SubLObject inference_answer) {
        assert NIL != inference_answer_p(inference_answer) : inference_answer;
        return inf_answer_suid(inference_answer);
    }

    @SubL(source = "cycl/inference/harness/inference-datastructures-inference.lisp", position = 105100L)
    public static SubLObject inference_answer_inference(SubLObject inference_answer) {
        assert NIL != inference_answer_p(inference_answer) : inference_answer;
        return inf_answer_inference(inference_answer);
    }

    @SubL(source = "cycl/inference/harness/inference-datastructures-inference.lisp", position = 105300L)
    public static SubLObject inference_answer_bindings(SubLObject inference_answer) {
        assert NIL != inference_answer_p(inference_answer) : inference_answer;
        return inf_answer_bindings(inference_answer);
    }

    @SubL(source = "cycl/inference/harness/inference-datastructures-inference.lisp", position = 105400L)
    public static SubLObject inference_answer_justifications(SubLObject inference_answer) {
        assert NIL != inference_answer_p(inference_answer) : inference_answer;
        return inf_answer_justifications(inference_answer);
    }

    @SubL(source = "cycl/inference/harness/inference-datastructures-inference.lisp", position = 105700L)
    public static SubLObject inference_answer_elapsed_creation_time(SubLObject inference_answer) {
        assert NIL != inference_answer_p(inference_answer) : inference_answer;
        return inf_answer_elapsed_creation_time(inference_answer);
    }

    @SubL(source = "cycl/inference/harness/inference-datastructures-inference.lisp", position = 105900L)
    public static SubLObject inference_answer_step_count(SubLObject inference_answer) {
        assert NIL != inference_answer_p(inference_answer) : inference_answer;
        return inf_answer_step_count(inference_answer);
    }

    @SubL(source = "cycl/inference/harness/inference-datastructures-inference.lisp", position = 106000L)
    public static SubLObject set_inference_answer_bindings(SubLObject inference_answer, SubLObject v_bindings) {
        assert NIL != bindings.bindings_p(v_bindings) : v_bindings;
        _csetf_inf_answer_bindings(inference_answer, v_bindings);
        return inference_answer;
    }

    @SubL(source = "cycl/inference/harness/inference-datastructures-inference.lisp", position = 106200L)
    public static SubLObject set_inference_answer_elapsed_creation_time(SubLObject inference_answer, SubLObject elapsed_creation_time) {
        _csetf_inf_answer_elapsed_creation_time(inference_answer, elapsed_creation_time);
        return inference_answer;
    }

    @SubL(source = "cycl/inference/harness/inference-datastructures-inference.lisp", position = 106500L)
    public static SubLObject set_inference_answer_step_count(SubLObject inference_answer, SubLObject step_count) {
        _csetf_inf_answer_step_count(inference_answer, step_count);
        return inference_answer;
    }

    @SubL(source = "cycl/inference/harness/inference-datastructures-inference.lisp", position = 106800L)
    public static SubLObject inference_answer_problem_store(SubLObject inference_answer) {
        assert NIL != inference_answer_p(inference_answer) : inference_answer;
        return inference_problem_store(inference_answer_inference(inference_answer));
    }

    @SubL(source = "cycl/inference/harness/inference-datastructures-inference.lisp", position = 107000L)
    public static SubLObject inference_answer_free_el_vars(SubLObject inference_answer) {
        return inference_free_el_vars(inference_answer_inference(inference_answer));
    }

    @SubL(source = "cycl/inference/harness/inference-datastructures-inference.lisp", position = 107200L)
    public static SubLObject inference_answer_elapsed_time(SubLObject inference_answer, SubLObject seconds_granularityP) {
        if (seconds_granularityP == UNPROVIDED) {
            seconds_granularityP = T;
        }
        assert NIL != inference_answer_p(inference_answer) : inference_answer;
        SubLObject elapsed_time = inference_answer_elapsed_creation_time(inference_answer);
        SubLObject seconds = numeric_date_utilities.elapsed_internal_real_time_to_elapsed_seconds(elapsed_time);
        if (NIL != seconds_granularityP) {
            seconds = Numbers.truncate(seconds, UNPROVIDED);
        }
        return seconds;
    }

    @SubL(source = "cycl/inference/harness/inference-datastructures-inference.lisp", position = 107600L)
    public static SubLObject inference_answer_creation_time(SubLObject inference_answer) {
        SubLObject inference = inference_answer_inference(inference_answer);
        SubLObject start = inference_start_universal_time(inference);
        SubLObject elapsed = inference_answer_elapsed_time(inference_answer, T);
        return numeric_date_utilities.universal_time_seconds_from_now(elapsed, start);
    }

    @SubL(source = "cycl/inference/harness/inference-datastructures-inference.lisp", position = 108000L)
    public static SubLObject find_inference_answer_justification(SubLObject inference_answer, SubLObject hl_justification) {
        SubLObject existing_justifications = inference_answer_justifications(inference_answer);
        return Sequences.find(hl_justification, existing_justifications, $sym475$JUSTIFICATION_EQUAL, $sym476$INFERENCE_ANSWER_JUSTIFICATION_SUPPORTS, UNPROVIDED, UNPROVIDED);
    }

    @SubL(source = "cycl/inference/harness/inference-datastructures-inference.lisp", position = 108400L)
    public static SubLObject inference_answer_result_bindings(SubLObject v_answer) {
        SubLObject inference = inference_answer_inference(v_answer);
        SubLObject pcase_var;
        SubLObject answer_language = pcase_var = inference_answer_language(inference);
        if (pcase_var.eql($HL)) {
            return inference_answer_bindings(v_answer);
        }
        if (pcase_var.eql($EL)) {
            return inference_kernel.inference_answer_el_bindings(v_answer);
        }
        Errors.error($str479$_S_was_not_an_inference_answer_la, answer_language);
        return NIL;
    }

    @SubL(source = "cycl/inference/harness/inference-datastructures-inference.lisp", position = 108800L)
    public static SubLObject inference_answer_bindings_equalP(SubLObject answer1, SubLObject answer2) {
        assert NIL != inference_answer_p(answer1) : answer1;
        assert NIL != inference_answer_p(answer2) : answer2;
        return Equality.equal(inference_answer_bindings(answer1), inference_answer_bindings(answer2));
    }

    @SubL(source = "cycl/inference/harness/inference-datastructures-inference.lisp", position = 109000L)
    public static SubLObject inference_answer_newP(SubLObject inference_answer) {
        assert NIL != inference_answer_p(inference_answer) : inference_answer;
        SubLObject inference = inference_answer_inference(inference_answer);
        SubLObject answer_id = inference_answer_suid(inference_answer);
        SubLObject new_answer_id_start = inference_new_answer_id_start(inference);
        return Numbers.numGE(answer_id, new_answer_id_start);
    }

    @SubL(source = "cycl/inference/harness/inference-datastructures-inference.lisp", position = 109400L)
    public static SubLObject inference_answer_L(SubLObject answer1, SubLObject answer2) {
        return Numbers.numL(inference_answer_suid(answer1), inference_answer_suid(answer2));
    }

    @SubL(source = "cycl/inference/harness/inference-datastructures-inference.lisp", position = 109600L)
    public static SubLObject inference_answer_el_sentence(SubLObject inference_answer) {
        assert NIL != inference_answer_p(inference_answer) : inference_answer;
        SubLObject inference = inference_answer_inference(inference_answer);
        SubLObject el_sentence = inference_input_el_query(inference);
        SubLObject result_bindings = inference_answer_result_bindings(inference_answer);
        SubLObject answer_el_sentence = bindings.apply_bindings(result_bindings, el_sentence);
        return answer_el_sentence;
    }

    @SubL(source = "cycl/inference/harness/inference-datastructures-inference.lisp", position = 110100L)
    public static SubLObject inference_answer_justification_count(SubLObject inference_answer) {
        return Sequences.length(inference_answer_justifications(inference_answer));
    }

    @SubL(source = "cycl/inference/harness/inference-datastructures-inference.lisp", position = 110200L)
    public static SubLObject add_inference_answer_justification(SubLObject inference_answer, SubLObject justification) {
        assert NIL != inference_answer_justification_p(justification) : justification;
        _csetf_inf_answer_justifications(inference_answer, cons(justification, inf_answer_justifications(inference_answer)));
        return inference_answer;
    }

    @SubL(source = "cycl/inference/harness/inference-datastructures-inference.lisp", position = 110500L)
    public static SubLObject remove_inference_answer_justification(SubLObject inference_answer, SubLObject justification) {
        assert NIL != inference_answer_justification_p(justification) : justification;
        _csetf_inf_answer_justifications(inference_answer, Sequences.delete(justification, inf_answer_justifications(inference_answer), UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED));
        return inference_answer;
    }

    @SubL(source = "cycl/inference/harness/inference-datastructures-inference.lisp", position = 110700L)
    public static SubLObject initialize_inference_answer_elapsed_creation_time(SubLObject inference_answer) {
        SubLObject inference = inference_answer_inference(inference_answer);
        SubLObject start = inference_start_internal_real_time(inference);
        SubLObject elapsed = numeric_date_utilities.elapsed_internal_real_time(start, UNPROVIDED);
        set_inference_answer_elapsed_creation_time(inference_answer, elapsed);
        return inference_answer;
    }

    @SubL(source = "cycl/inference/harness/inference-datastructures-inference.lisp", position = 111400L)
    public static SubLObject inference_answer_justification_print_function_trampoline(SubLObject v_object, SubLObject stream) {
        print_inference_answer_justification(v_object, stream, ZERO_INTEGER);
        return NIL;
    }

    @SubL(source = "cycl/inference/harness/inference-datastructures-inference.lisp", position = 111400L)
    public static SubLObject inference_answer_justification_p(SubLObject v_object) {
        return (v_object.getClass() == $inference_answer_justification_native.class) ? T : NIL;
    }

    @SubL(source = "cycl/inference/harness/inference-datastructures-inference.lisp", position = 111400L)
    public static SubLObject inf_ans_just_answer(SubLObject v_object) {
        assert NIL != inference_answer_justification_p(v_object) : v_object;
        return v_object.getField2();
    }

    @SubL(source = "cycl/inference/harness/inference-datastructures-inference.lisp", position = 111400L)
    public static SubLObject inf_ans_just_supports(SubLObject v_object) {
        assert NIL != inference_answer_justification_p(v_object) : v_object;
        return v_object.getField3();
    }

    @SubL(source = "cycl/inference/harness/inference-datastructures-inference.lisp", position = 111400L)
    public static SubLObject inf_ans_just_pragma_supports(SubLObject v_object) {
        assert NIL != inference_answer_justification_p(v_object) : v_object;
        return v_object.getField4();
    }

    @SubL(source = "cycl/inference/harness/inference-datastructures-inference.lisp", position = 111400L)
    public static SubLObject inf_ans_just_proofs(SubLObject v_object) {
        assert NIL != inference_answer_justification_p(v_object) : v_object;
        return v_object.getField5();
    }

    @SubL(source = "cycl/inference/harness/inference-datastructures-inference.lisp", position = 111400L)
    public static SubLObject _csetf_inf_ans_just_answer(SubLObject v_object, SubLObject value) {
        assert NIL != inference_answer_justification_p(v_object) : v_object;
        return v_object.setField2(value);
    }

    @SubL(source = "cycl/inference/harness/inference-datastructures-inference.lisp", position = 111400L)
    public static SubLObject _csetf_inf_ans_just_supports(SubLObject v_object, SubLObject value) {
        assert NIL != inference_answer_justification_p(v_object) : v_object;
        return v_object.setField3(value);
    }

    @SubL(source = "cycl/inference/harness/inference-datastructures-inference.lisp", position = 111400L)
    public static SubLObject _csetf_inf_ans_just_pragma_supports(SubLObject v_object, SubLObject value) {
        assert NIL != inference_answer_justification_p(v_object) : v_object;
        return v_object.setField4(value);
    }

    @SubL(source = "cycl/inference/harness/inference-datastructures-inference.lisp", position = 111400L)
    public static SubLObject _csetf_inf_ans_just_proofs(SubLObject v_object, SubLObject value) {
        assert NIL != inference_answer_justification_p(v_object) : v_object;
        return v_object.setField5(value);
    }

    @SubL(source = "cycl/inference/harness/inference-datastructures-inference.lisp", position = 111400L)
    public static SubLObject make_inference_answer_justification(SubLObject arglist) {
        if (arglist == UNPROVIDED) {
            arglist = NIL;
        }
        SubLObject v_new = new $inference_answer_justification_native();
        SubLObject next;
        SubLObject current_arg;
        SubLObject current_value;
        SubLObject pcase_var;
        for (next = NIL, next = arglist; NIL != next; next = conses_high.cddr(next)) {
            current_arg = next.first();
            current_value = conses_high.cadr(next);
            pcase_var = current_arg;
            if (pcase_var.eql($ANSWER)) {
                _csetf_inf_ans_just_answer(v_new, current_value);
            } else if (pcase_var.eql($SUPPORTS)) {
                _csetf_inf_ans_just_supports(v_new, current_value);
            } else if (pcase_var.eql($PRAGMA_SUPPORTS)) {
                _csetf_inf_ans_just_pragma_supports(v_new, current_value);
            } else if (pcase_var.eql($PROOFS)) {
                _csetf_inf_ans_just_proofs(v_new, current_value);
            } else {
                Errors.error($str275$Invalid_slot__S_for_construction_, current_arg);
            }
        }
        return v_new;
    }

    @SubL(source = "cycl/inference/harness/inference-datastructures-inference.lisp", position = 111400L)
    public static SubLObject visit_defstruct_inference_answer_justification(SubLObject obj, SubLObject visitor_fn) {
        Functions.funcall(visitor_fn, obj, $BEGIN, $sym501$MAKE_INFERENCE_ANSWER_JUSTIFICATION, FOUR_INTEGER);
        Functions.funcall(visitor_fn, obj, $SLOT, $ANSWER, inf_ans_just_answer(obj));
        Functions.funcall(visitor_fn, obj, $SLOT, $SUPPORTS, inf_ans_just_supports(obj));
        Functions.funcall(visitor_fn, obj, $SLOT, $PRAGMA_SUPPORTS, inf_ans_just_pragma_supports(obj));
        Functions.funcall(visitor_fn, obj, $SLOT, $PROOFS, inf_ans_just_proofs(obj));
        Functions.funcall(visitor_fn, obj, $END, $sym501$MAKE_INFERENCE_ANSWER_JUSTIFICATION, FOUR_INTEGER);
        return obj;
    }

    @SubL(source = "cycl/inference/harness/inference-datastructures-inference.lisp", position = 111400L)
    public static SubLObject visit_defstruct_object_inference_answer_justification_method(SubLObject obj, SubLObject visitor_fn) {
        return visit_defstruct_inference_answer_justification(obj, visitor_fn);
    }

    @SubL(source = "cycl/inference/harness/inference-datastructures-inference.lisp", position = 112000L)
    public static SubLObject valid_inference_answer_justification_p(SubLObject v_object) {
        return makeBoolean(NIL != inference_answer_justification_p(v_object) && NIL == inference_answer_justification_invalid_p(v_object));
    }

    @SubL(source = "cycl/inference/harness/inference-datastructures-inference.lisp", position = 112200L)
    public static SubLObject inference_answer_justification_invalid_p(SubLObject inference_answer_justification) {
        return Equality.eq($FREE, inference_answer_justification_supports(inference_answer_justification));
    }

    @SubL(source = "cycl/inference/harness/inference-datastructures-inference.lisp", position = 112400L)
    public static SubLObject print_inference_answer_justification(SubLObject v_object, SubLObject stream, SubLObject depth) {
        SubLThread thread = SubLProcess.currentSubLThread();
        if (NIL != inference_answer_justification_invalid_p(v_object)) {
            if (NIL != print_high.$print_readably$.getDynamicValue(thread)) {
                print_high.print_not_readable(v_object, stream);
            } else {
                print_macros.print_unreadable_object_preamble(stream, v_object, T, NIL);
                print_macros.print_unreadable_object_postamble(stream, v_object, T, T);
            }
        } else {
            PrintLow.format(stream, $str503$_INF_ANS_JUST__s_, inference_answer_justification_supports(v_object));
        }
        return NIL;
    }

    @SubL(source = "cycl/inference/harness/inference-datastructures-inference.lisp", position = 112800L)
    public static SubLObject sxhash_inference_answer_justification_method(SubLObject v_object) {
        return Numbers.logxor(Sxhash.sxhash(inf_ans_just_answer(v_object)), Sxhash.sxhash(inf_ans_just_supports(v_object)));
    }

    @SubL(source = "cycl/inference/harness/inference-datastructures-inference.lisp", position = 113000L)
    public static SubLObject list_of_inference_answer_justification_p(SubLObject v_object) {
        if (NIL != list_utilities.non_dotted_list_p(v_object)) {
            SubLObject cdolist_list_var = v_object;
            SubLObject subobject = NIL;
            subobject = cdolist_list_var.first();
            while (NIL != cdolist_list_var) {
                if (NIL == inference_answer_justification_p(subobject)) {
                    return NIL;
                }
                cdolist_list_var = cdolist_list_var.rest();
                subobject = cdolist_list_var.first();
            }
            return T;
        }
        return NIL;
    }

    @SubL(source = "cycl/inference/harness/inference-datastructures-inference.lisp", position = 113300L)
    public static SubLObject new_inference_answer_justification(SubLObject v_answer, SubLObject supports, SubLObject pragma_supports) {
        assert NIL != inference_answer_p(v_answer) : v_answer;
        assert NIL != arguments.hl_justification_p(supports) : supports;
        SubLObject just = make_inference_answer_justification(UNPROVIDED);
        _csetf_inf_ans_just_answer(just, v_answer);
        _csetf_inf_ans_just_supports(just, supports);
        _csetf_inf_ans_just_pragma_supports(just, pragma_supports);
        add_inference_answer_justification(v_answer, just);
        return just;
    }

    @SubL(source = "cycl/inference/harness/inference-datastructures-inference.lisp", position = 113700L)
    public static SubLObject find_or_create_inference_answer_justification(SubLObject inference, SubLObject v_bindings, SubLObject supports, SubLObject pragma_supports) {
        assert NIL != inference_p(inference) : inference;
        supports = arguments.canonicalize_hl_justification(supports);
        SubLObject v_answer = find_or_create_inference_answer(inference, v_bindings);
        SubLObject justification = find_inference_answer_justification(v_answer, supports);
        SubLObject newP = NIL;
        if (NIL == justification) {
            justification = new_inference_answer_justification(v_answer, supports, pragma_supports);
            add_inference_new_answer_justification(inference, justification);
            newP = T;
        }
        return Values.values(justification, newP);
    }

    @SubL(source = "cycl/inference/harness/inference-datastructures-inference.lisp", position = 114700L)
    public static SubLObject subst_indexical_referents_into_answer_bindings(SubLObject v_bindings, SubLObject supports) {
        SubLObject bindings_values = bindings.bindings_values(v_bindings);
        SubLObject replaced_somethingP = NIL;
        if (NIL != kb_control_vars.date_kb_loaded_p()) {
            SubLObject now_value = date_utilities.indexical_now();
            if (NIL != cycl_utilities.expression_find(now_value, bindings_values, NIL, Symbols.symbol_function(EQUAL), UNPROVIDED)) {
                bindings_values = cycl_utilities.expression_subst($$Now, now_value, bindings_values, Symbols.symbol_function(EQUAL), UNPROVIDED);
                replaced_somethingP = T;
            }
        }
        if (NIL != replaced_somethingP) {
            v_bindings = bindings.make_variable_bindings(bindings.bindings_variables(v_bindings), bindings_values);
        }
        return v_bindings;
    }

    @SubL(source = "cycl/inference/harness/inference-datastructures-inference.lisp", position = 116300L)
    public static SubLObject destroy_inference_answer_justification(SubLObject justification) {
        if (NIL != valid_inference_answer_justification_p(justification)) {
            note_inference_answer_justification_invalid(justification);
            SubLObject inference = inference_answer_justification_inference(justification);
            remove_inference_new_answer_justification(inference, justification);
            SubLObject v_answer = inference_answer_justification_answer(justification);
            remove_inference_answer_justification(v_answer, justification);
            return destroy_inference_answer_justification_int(justification);
        }
        return NIL;
    }

    @SubL(source = "cycl/inference/harness/inference-datastructures-inference.lisp", position = 116900L)
    public static SubLObject destroy_inference_answer_justification_int(SubLObject justification) {
        _csetf_inf_ans_just_answer(justification, $FREE);
        return justification;
    }

    @SubL(source = "cycl/inference/harness/inference-datastructures-inference.lisp", position = 117100L)
    public static SubLObject note_inference_answer_justification_invalid(SubLObject justification) {
        _csetf_inf_ans_just_supports(justification, $FREE);
        _csetf_inf_ans_just_pragma_supports(justification, $FREE);
        return justification;
    }

    @SubL(source = "cycl/inference/harness/inference-datastructures-inference.lisp", position = 117300L)
    public static SubLObject inference_answer_justification_answer(SubLObject justification) {
        assert NIL != inference_answer_justification_p(justification) : justification;
        return inf_ans_just_answer(justification);
    }

    @SubL(source = "cycl/inference/harness/inference-datastructures-inference.lisp", position = 117500L)
    public static SubLObject inference_answer_justification_supports(SubLObject justification) {
        assert NIL != inference_answer_justification_p(justification) : justification;
        return inf_ans_just_supports(justification);
    }

    @SubL(source = "cycl/inference/harness/inference-datastructures-inference.lisp", position = 117700L)
    public static SubLObject inference_answer_justification_pragmatic_supports(SubLObject justification) {
        assert NIL != inference_answer_justification_p(justification) : justification;
        return inf_ans_just_pragma_supports(justification);
    }

    @SubL(source = "cycl/inference/harness/inference-datastructures-inference.lisp", position = 117900L)
    public static SubLObject inference_answer_justification_proofs(SubLObject justification) {
        assert NIL != inference_answer_justification_p(justification) : justification;
        return inf_ans_just_proofs(justification);
    }

    @SubL(source = "cycl/inference/harness/inference-datastructures-inference.lisp", position = 118100L)
    public static SubLObject do_inference_answer_justification_proofs(SubLObject macroform, SubLObject environment) {
        SubLObject current;
        SubLObject datum = current = macroform.rest();
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, $list507);
        SubLObject temp = current.rest();
        current = current.first();
        SubLObject proof_var = NIL;
        SubLObject justification = NIL;
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, $list507);
        proof_var = current.first();
        current = current.rest();
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, $list507);
        justification = current.first();
        current = current.rest();
        if (NIL == current) {
            SubLObject body;
            current = (body = temp);
            return listS($sym471$DO_LIST, list(proof_var, list($sym508$INFERENCE_ANSWER_JUSTIFICATION_PROOFS, justification)), append(body, NIL));
        }
        cdestructuring_bind.cdestructuring_bind_error(datum, $list507);
        return NIL;
    }

    @SubL(source = "cycl/inference/harness/inference-datastructures-inference.lisp", position = 118300L)
    public static SubLObject do_proof_dependent_inference_answer_justifications(SubLObject macroform, SubLObject environment) {
        SubLObject current;
        SubLObject datum = current = macroform.rest();
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, $list509);
        SubLObject temp = current.rest();
        current = current.first();
        SubLObject justification_var = NIL;
        SubLObject proof = NIL;
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, $list509);
        justification_var = current.first();
        current = current.rest();
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, $list509);
        proof = current.first();
        current = current.rest();
        if (NIL == current) {
            SubLObject body;
            current = (body = temp);
            SubLObject inference = $sym510$INFERENCE;
            SubLObject v_answer = $sym511$ANSWER;
            SubLObject proof_var = $sym512$PROOF_VAR;
            return list($sym301$CLET, list(list(proof_var, proof)), list($sym513$DO_PROBLEM_SUPPORTED_INFERENCES, list(inference, list($sym514$PROOF_SUPPORTED_PROBLEM, proof_var)), list($sym323$DO_INFERENCE_ANSWERS, list(v_answer, inference),
                    list($sym324$DO_INFERENCE_ANSWER_JUSTIFICATIONS, list(justification_var, v_answer), listS($sym333$PWHEN, listS($sym515$MEMBER_, proof_var, list($sym508$INFERENCE_ANSWER_JUSTIFICATION_PROOFS, justification_var), $list516), append(body, NIL))))));
        }
        cdestructuring_bind.cdestructuring_bind_error(datum, $list509);
        return NIL;
    }

    @SubL(source = "cycl/inference/harness/inference-datastructures-inference.lisp", position = 118800L)
    public static SubLObject do_inference_all_subproofs(SubLObject macroform, SubLObject environment) {
        SubLObject current;
        SubLObject datum = current = macroform.rest();
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, $list517);
        SubLObject temp = current.rest();
        current = current.first();
        SubLObject subproof_var = NIL;
        SubLObject inference = NIL;
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, $list517);
        subproof_var = current.first();
        current = current.rest();
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, $list517);
        inference = current.first();
        current = current.rest();
        if (NIL == current) {
            SubLObject body;
            current = (body = temp);
            SubLObject v_answer = $sym518$ANSWER;
            SubLObject justification = $sym519$JUSTIFICATION;
            SubLObject proof = $sym520$PROOF;
            return list($sym323$DO_INFERENCE_ANSWERS, list(v_answer, inference),
                    list($sym324$DO_INFERENCE_ANSWER_JUSTIFICATIONS, list(justification, v_answer), list($sym521$DO_INFERENCE_ANSWER_JUSTIFICATION_PROOFS, list(proof, justification), listS($sym522$DO_PROOF_ALL_SUBPROOFS, list(subproof_var, proof), append(body, NIL)))));
        }
        cdestructuring_bind.cdestructuring_bind_error(datum, $list517);
        return NIL;
    }

    @SubL(source = "cycl/inference/harness/inference-datastructures-inference.lisp", position = 119300L)
    public static SubLObject inference_answer_first_justification(SubLObject v_answer) {
        SubLObject cdolist_list_var = inference_answer_justifications(v_answer);
        SubLObject justification = NIL;
        justification = cdolist_list_var.first();
        if (NIL != cdolist_list_var) {
            return justification;
        }
        return NIL;
    }

    @SubL(source = "cycl/inference/harness/inference-datastructures-inference.lisp", position = 119400L)
    public static SubLObject inference_answer_justification_first_proof(SubLObject justification) {
        SubLObject cdolist_list_var = inference_answer_justification_proofs(justification);
        SubLObject proof = NIL;
        proof = cdolist_list_var.first();
        if (NIL != cdolist_list_var) {
            return proof;
        }
        return NIL;
    }

    @SubL(source = "cycl/inference/harness/inference-datastructures-inference.lisp", position = 119600L)
    public static SubLObject inference_first_proof(SubLObject inference) {
        SubLObject v_answer = inference_first_answer(inference);
        if (NIL != v_answer) {
            SubLObject justification = inference_answer_first_justification(v_answer);
            if (NIL != justification) {
                SubLObject proof = inference_answer_justification_first_proof(justification);
                return proof;
            }
        }
        return NIL;
    }

    @SubL(source = "cycl/inference/harness/inference-datastructures-inference.lisp", position = 119900L)
    public static SubLObject inference_answer_justification_inference(SubLObject justification) {
        return inference_answer_inference(inference_answer_justification_answer(justification));
    }

    @SubL(source = "cycl/inference/harness/inference-datastructures-inference.lisp", position = 120100L)
    public static SubLObject inference_answer_justification_store(SubLObject justification) {
        return inference_problem_store(inference_answer_inference(inference_answer_justification_answer(justification)));
    }

    @SubL(source = "cycl/inference/harness/inference-datastructures-inference.lisp", position = 120300L)
    public static SubLObject inference_answer_justification_rules(SubLObject justification) {
        SubLObject supports = inference_answer_justification_supports(justification);
        SubLObject rules = assertion_utilities.sort_assertions(list_utilities.remove_if_not(Symbols.symbol_function($sym523$RULE_ASSERTION_), supports, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED));
        return rules;
    }

    @SubL(source = "cycl/inference/harness/inference-datastructures-inference.lisp", position = 120500L)
    public static SubLObject add_inference_answer_justification_proof(SubLObject justification, SubLObject proof) {
        assert NIL != inference_datastructures_proof.proof_p(proof) : proof;
        _csetf_inf_ans_just_proofs(justification, cons(proof, inf_ans_just_proofs(justification)));
        return justification;
    }

    @SubL(source = "cycl/inference/harness/inference-datastructures-inference.lisp", position = 120700L)
    public static SubLObject new_inference_answer_justification_from_proof(SubLObject v_answer, SubLObject supports, SubLObject pragma_supports, SubLObject proof) {
        SubLObject justification = new_inference_answer_justification(v_answer, supports, pragma_supports);
        add_inference_answer_justification_proof(justification, proof);
        return justification;
    }

    @SubL(source = "cycl/inference/harness/inference-datastructures-inference.lisp", position = 121000L)
    public static SubLObject inference_answer_justification_to_tms_deduction_spec(SubLObject justification, SubLObject truth) {
        SubLObject supports = inference_answer_justification_supports(justification);
        SubLObject tv = argumentation.compute_supports_tv(supports, truth);
        return list($SUPPORTS, supports, $TV, tv);
    }

    @SubL(source = "cycl/inference/harness/inference-datastructures-inference.lisp", position = 121300L)
    public static SubLObject inference_answer_justification_to_true_tms_deduction_spec(SubLObject justification) {
        return inference_answer_justification_to_tms_deduction_spec(justification, $TRUE);
    }

    @SubL(source = "cycl/inference/harness/inference-datastructures-inference.lisp", position = 121500L)
    public static SubLObject inference_answer_justification_to_false_tms_deduction_spec(SubLObject justification) {
        return inference_answer_justification_to_tms_deduction_spec(justification, $FALSE);
    }

    @SubL(source = "cycl/inference/harness/inference-datastructures-inference.lisp", position = 121700L)
    public static SubLObject destroy_proof_inference_answer_justifications(SubLObject proof) {
        SubLObject set_contents_var = inference_datastructures_problem.problem_dependent_links(inference_datastructures_proof.proof_supported_problem(proof));
        SubLObject basis_object;
        SubLObject state;
        SubLObject link;
        SubLObject inference;
        SubLObject idx;
        SubLObject idx_$34;
        SubLObject vector_var;
        SubLObject backwardP_var;
        SubLObject length;
        SubLObject v_iteration;
        SubLObject id;
        SubLObject v_answer;
        SubLObject cdolist_list_var;
        SubLObject justification;
        SubLObject idx_$35;
        SubLObject cdohash_table;
        SubLObject id2;
        SubLObject v_answer2;
        Iterator cdohash_iterator;
        Map.Entry cdohash_entry;
        SubLObject cdolist_list_var2;
        SubLObject justification2;
        for (basis_object = set_contents.do_set_contents_basis_object(set_contents_var), state = NIL, state = set_contents.do_set_contents_initial_state(basis_object, set_contents_var); NIL == set_contents.do_set_contents_doneP(basis_object,
                state); state = set_contents.do_set_contents_update_state(state)) {
            link = set_contents.do_set_contents_next(basis_object, state);
            if (NIL != set_contents.do_set_contents_element_validP(state, link)) {
                inference = inference_datastructures_problem_link.problem_link_supported_inference(link);
                if (NIL != inference) {
                    idx = inference_answer_id_index(inference);
                    if (NIL == id_index.id_index_objects_empty_p(idx, $SKIP)) {
                        idx_$34 = idx;
                        if (NIL == id_index.id_index_dense_objects_empty_p(idx_$34, $SKIP)) {
                            vector_var = id_index.id_index_dense_objects(idx_$34);
                            backwardP_var = NIL;
                            for (length = Sequences.length(vector_var), v_iteration = NIL, v_iteration = ZERO_INTEGER; v_iteration.numL(length); v_iteration = Numbers.add(v_iteration, ONE_INTEGER)) {
                                id = ((NIL != backwardP_var) ? Numbers.subtract(length, v_iteration, ONE_INTEGER) : v_iteration);
                                v_answer = Vectors.aref(vector_var, id);
                                if (NIL == id_index.id_index_tombstone_p(v_answer) || NIL == id_index.id_index_skip_tombstones_p($SKIP)) {
                                    if (NIL != id_index.id_index_tombstone_p(v_answer)) {
                                        v_answer = $SKIP;
                                    }
                                    cdolist_list_var = inference_answer_justifications(v_answer);
                                    justification = NIL;
                                    justification = cdolist_list_var.first();
                                    while (NIL != cdolist_list_var) {
                                        if (NIL != subl_promotions.memberP(proof, inference_answer_justification_proofs(justification), Symbols.symbol_function(EQL), UNPROVIDED)) {
                                            destroy_inference_answer_justification(justification);
                                        }
                                        cdolist_list_var = cdolist_list_var.rest();
                                        justification = cdolist_list_var.first();
                                    }
                                }
                            }
                        }
                        idx_$35 = idx;
                        if (NIL == id_index.id_index_sparse_objects_empty_p(idx_$35)) {
                            cdohash_table = id_index.id_index_sparse_objects(idx_$35);
                            id2 = NIL;
                            v_answer2 = NIL;
                            cdohash_iterator = Hashtables.getEntrySetIterator(cdohash_table);
                            try {
                                while (Hashtables.iteratorHasNext(cdohash_iterator)) {
                                    cdohash_entry = Hashtables.iteratorNextEntry(cdohash_iterator);
                                    id2 = Hashtables.getEntryKey(cdohash_entry);
                                    v_answer2 = Hashtables.getEntryValue(cdohash_entry);
                                    cdolist_list_var2 = inference_answer_justifications(v_answer2);
                                    justification2 = NIL;
                                    justification2 = cdolist_list_var2.first();
                                    while (NIL != cdolist_list_var2) {
                                        if (NIL != subl_promotions.memberP(proof, inference_answer_justification_proofs(justification2), Symbols.symbol_function(EQL), UNPROVIDED)) {
                                            destroy_inference_answer_justification(justification2);
                                        }
                                        cdolist_list_var2 = cdolist_list_var2.rest();
                                        justification2 = cdolist_list_var2.first();
                                    }
                                }
                            } finally {
                                Hashtables.releaseEntrySetIterator(cdohash_iterator);
                            }
                        }
                    }
                }
            }
        }
        return NIL;
    }

    @SubL(source = "cycl/inference/harness/inference-datastructures-inference.lisp", position = 122100L)
    public static SubLObject inference_time_per_answer(SubLObject inference) {
        SubLObject total_time = inference_cumulative_time(inference);
        SubLObject answer_count = inference_answer_count(inference);
        SubLObject time_per_answer = NIL;
        if (total_time.isNumber() && NIL != subl_promotions.positive_integer_p(answer_count)) {
            time_per_answer = Numbers.divide(total_time, answer_count);
        }
        return time_per_answer;
    }

    @SubL(source = "cycl/inference/harness/inference-datastructures-inference.lisp", position = 122500L)
    public static SubLObject inference_steps_per_answer(SubLObject inference) {
        SubLObject total_steps = inference_cumulative_step_count(inference);
        SubLObject answer_count = inference_answer_count(inference);
        SubLObject steps_per_answer = NIL;
        if (total_steps.isNumber() && NIL != subl_promotions.positive_integer_p(answer_count)) {
            steps_per_answer = Numbers.divide(total_steps, answer_count);
        }
        return steps_per_answer;
    }

    @SubL(source = "cycl/inference/harness/inference-datastructures-inference.lisp", position = 122800L)
    public static SubLObject inference_wasted_time_after_last_answer(SubLObject inference) {
        SubLObject total_time = inference_cumulative_time(inference);
        SubLObject last_answer_time = inference_last_answer_elapsed_time(inference);
        SubLObject wasted_time_after_last_answer = list_utilities.safe_difference(total_time, last_answer_time);
        return wasted_time_after_last_answer;
    }

    @SubL(source = "cycl/inference/harness/inference-datastructures-inference.lisp", position = 123100L)
    public static SubLObject inference_latency_improvement_from_iterativity(SubLObject inference) {
        SubLObject total_time = inference_cumulative_time(inference);
        SubLObject first_answer_time = inference_first_answer_elapsed_time(inference);
        SubLObject latency_improvement_from_iterativity = list_utilities.safe_difference(total_time, first_answer_time);
        return latency_improvement_from_iterativity;
    }

    @SubL(source = "cycl/inference/harness/inference-datastructures-inference.lisp", position = 123500L)
    public static SubLObject inference_metrics(SubLObject inference) {
        SubLObject template = inference_metrics_template(inference);
        SubLObject metrics = list_utilities.tree_gather(template, Symbols.symbol_function($sym529$INFERENCE_QUERY_METRIC_P), UNPROVIDED, UNPROVIDED, UNPROVIDED);
        return inference_compute_metrics_plist(inference, metrics);
    }

    @SubL(source = "cycl/inference/harness/inference-datastructures-inference.lisp", position = 123800L)
    public static SubLObject inference_compute_metrics(SubLObject inference) {
        SubLObject template = inference_metrics_template(inference);
        SubLObject metrics = list_utilities.tree_gather(template, Symbols.symbol_function($sym529$INFERENCE_QUERY_METRIC_P), UNPROVIDED, UNPROVIDED, UNPROVIDED);
        SubLObject v_answer = conses_high.copy_tree(template);
        SubLObject metrics_bindings = inference_compute_metrics_alist(inference, metrics);
        v_answer = conses_high.nsublis(metrics_bindings, v_answer, Symbols.symbol_function(EQL), UNPROVIDED);
        return v_answer;
    }

    @SubL(source = "cycl/inference/harness/inference-datastructures-inference.lisp", position = 124300L)
    public static SubLObject inference_compute_metrics_plist(SubLObject inference, SubLObject metrics) {
        SubLObject alist = inference_compute_metrics_alist(inference, metrics);
        alist = Sort.sort(alist, Symbols.symbol_function($sym530$TERM__), Symbols.symbol_function($sym531$CAR));
        return list_utilities.alist_to_plist(alist);
    }

    @SubL(source = "cycl/inference/harness/inference-datastructures-inference.lisp", position = 124700L)
    public static SubLObject inference_compute_metrics_alist(SubLObject inference, SubLObject metrics) {
        SubLObject store = inference_problem_store(inference);
        SubLObject metrics_bindings = NIL;
        SubLObject answer_query_properties = NIL;
        SubLObject cdolist_list_var = metrics;
        SubLObject metric = NIL;
        metric = cdolist_list_var.first();
        while (NIL != cdolist_list_var) {
            SubLObject metric_object = inference_metrics.inference_metric_lookup(metric);
            if (NIL != metric_object) {
                SubLObject result = inference_metrics.inference_metric_evaluate(metric_object, inference, store);
                metrics_bindings = cons(cons(metric, result), metrics_bindings);
            } else {
                SubLObject pcase_var = metric;
                if (!pcase_var.eql($NEW_ROOT_TIMES)) {
                    if (!pcase_var.eql($NEW_ROOT_COUNT)) {
                        if (pcase_var.eql($PROBLEM_CREATION_TIMES)) {
                            SubLObject problem_creation_times = leviathan.historical_problem_creation_times();
                            metrics_bindings = cons(cons($PROBLEM_CREATION_TIMES, problem_creation_times), metrics_bindings);
                        } else if (pcase_var.eql($INFERENCE_ANSWER_QUERY_PROPERTIES)) {
                            if (NIL == answer_query_properties) {
                                answer_query_properties = inference_parameters.inference_compute_inference_answer_query_properties(inference);
                            }
                            metrics_bindings = cons(cons($INFERENCE_ANSWER_QUERY_PROPERTIES, answer_query_properties), metrics_bindings);
                        } else if (pcase_var.eql($INFERENCE_STRONGEST_QUERY_PROPERTIES)) {
                            if (NIL == answer_query_properties) {
                                answer_query_properties = inference_parameters.inference_compute_inference_answer_query_properties(inference);
                            }
                            if (NIL != answer_query_properties) {
                                metrics_bindings = cons(cons($INFERENCE_STRONGEST_QUERY_PROPERTIES, inference_parameters.compute_most_complete_query_properties(answer_query_properties)), metrics_bindings);
                            }
                        } else if (pcase_var.eql($INFERENCE_MOST_EFFICIENT_QUERY_PROPERTIES)) {
                            SubLObject proof_query_properties = inference_parameters.inference_compute_proof_query_properties(inference);
                            SubLObject strengthened_properties = inference_parameters.compute_most_efficient_query_properties(proof_query_properties);
                            metrics_bindings = cons(ConsesLow.cons($INFERENCE_MOST_EFFICIENT_QUERY_PROPERTIES, strengthened_properties), metrics_bindings);
                        } else if (pcase_var.eql($INFERENCE_IDS)) {
                            metrics_bindings = cons(ConsesLow.cons($INFERENCE_IDS, list(inference_datastructures_problem_store.problem_store_suid(store), inference_suid(inference))), metrics_bindings);
                        } else {
                            Errors.sublisp_break($str539$time_to_implement_metric__S, new SubLObject[] { metric });
                        }
                    }
                }
            }
            cdolist_list_var = cdolist_list_var.rest();
            metric = cdolist_list_var.first();
        }
        return metrics_bindings;
    }

    @SubL(source = "cycl/inference/harness/inference-datastructures-inference.lisp", position = 126800L)
    public static SubLObject inference_transformation_rules_in_answers(SubLObject inference) {
        assert NIL != inference_p(inference) : inference;
        SubLObject success_rules = set_contents.new_set_contents(ZERO_INTEGER, Symbols.symbol_function(EQL));
        SubLObject idx = inference_answer_id_index(inference);
        if (NIL == id_index.id_index_objects_empty_p(idx, $SKIP)) {
            SubLObject idx_$36 = idx;
            if (NIL == id_index.id_index_dense_objects_empty_p(idx_$36, $SKIP)) {
                SubLObject vector_var = id_index.id_index_dense_objects(idx_$36);
                SubLObject backwardP_var = NIL;
                SubLObject length;
                SubLObject v_iteration;
                SubLObject id;
                SubLObject v_answer;
                SubLObject cdolist_list_var;
                SubLObject justification;
                SubLObject cdolist_list_var_$37;
                SubLObject rule;
                for (length = Sequences.length(vector_var), v_iteration = NIL, v_iteration = ZERO_INTEGER; v_iteration.numL(length); v_iteration = Numbers.add(v_iteration, ONE_INTEGER)) {
                    id = ((NIL != backwardP_var) ? Numbers.subtract(length, v_iteration, ONE_INTEGER) : v_iteration);
                    v_answer = Vectors.aref(vector_var, id);
                    if (NIL == id_index.id_index_tombstone_p(v_answer) || NIL == id_index.id_index_skip_tombstones_p($SKIP)) {
                        if (NIL != id_index.id_index_tombstone_p(v_answer)) {
                            v_answer = $SKIP;
                        }
                        cdolist_list_var = inference_answer_justifications(v_answer);
                        justification = NIL;
                        justification = cdolist_list_var.first();
                        while (NIL != cdolist_list_var) {
                            cdolist_list_var_$37 = inference_answer_justification_supports(justification);
                            rule = NIL;
                            rule = cdolist_list_var_$37.first();
                            while (NIL != cdolist_list_var_$37) {
                                if (NIL != assertions_high.rule_assertionP(rule)) {
                                    success_rules = set_contents.set_contents_add(rule, success_rules, Symbols.symbol_function(EQL));
                                }
                                cdolist_list_var_$37 = cdolist_list_var_$37.rest();
                                rule = cdolist_list_var_$37.first();
                            }
                            cdolist_list_var = cdolist_list_var.rest();
                            justification = cdolist_list_var.first();
                        }
                    }
                }
            }
            SubLObject idx_$37 = idx;
            if (NIL == id_index.id_index_sparse_objects_empty_p(idx_$37)) {
                SubLObject cdohash_table = id_index.id_index_sparse_objects(idx_$37);
                SubLObject id2 = NIL;
                SubLObject v_answer2 = NIL;
                Iterator cdohash_iterator = Hashtables.getEntrySetIterator(cdohash_table);
                try {
                    while (Hashtables.iteratorHasNext(cdohash_iterator)) {
                        Map.Entry cdohash_entry = Hashtables.iteratorNextEntry(cdohash_iterator);
                        id2 = Hashtables.getEntryKey(cdohash_entry);
                        v_answer2 = Hashtables.getEntryValue(cdohash_entry);
                        SubLObject cdolist_list_var2 = inference_answer_justifications(v_answer2);
                        SubLObject justification2 = NIL;
                        justification2 = cdolist_list_var2.first();
                        while (NIL != cdolist_list_var2) {
                            SubLObject cdolist_list_var_$38 = inference_answer_justification_supports(justification2);
                            SubLObject rule2 = NIL;
                            rule2 = cdolist_list_var_$38.first();
                            while (NIL != cdolist_list_var_$38) {
                                if (NIL != assertions_high.rule_assertionP(rule2)) {
                                    success_rules = set_contents.set_contents_add(rule2, success_rules, Symbols.symbol_function(EQL));
                                }
                                cdolist_list_var_$38 = cdolist_list_var_$38.rest();
                                rule2 = cdolist_list_var_$38.first();
                            }
                            cdolist_list_var2 = cdolist_list_var2.rest();
                            justification2 = cdolist_list_var2.first();
                        }
                    }
                } finally {
                    Hashtables.releaseEntrySetIterator(cdohash_iterator);
                }
            }
        }
        return set_contents.set_contents_element_list(success_rules);
    }

    @SubL(source = "cycl/inference/harness/inference-datastructures-inference.lisp", position = 127400L)
    public static SubLObject inference_all_answer_proofs(SubLObject inference) {
        if (NIL != inference_has_some_answerP(inference)) {
            SubLObject answer_proofs = set.new_set(Symbols.symbol_function(EQL), UNPROVIDED);
            SubLObject idx = inference_answer_id_index(inference);
            if (NIL == id_index.id_index_objects_empty_p(idx, $SKIP)) {
                SubLObject idx_$40 = idx;
                if (NIL == id_index.id_index_dense_objects_empty_p(idx_$40, $SKIP)) {
                    SubLObject vector_var = id_index.id_index_dense_objects(idx_$40);
                    SubLObject backwardP_var = NIL;
                    SubLObject length;
                    SubLObject v_iteration;
                    SubLObject id;
                    SubLObject v_answer;
                    SubLObject cdolist_list_var;
                    SubLObject justification;
                    SubLObject cdolist_list_var_$41;
                    SubLObject proof;
                    for (length = Sequences.length(vector_var), v_iteration = NIL, v_iteration = ZERO_INTEGER; v_iteration.numL(length); v_iteration = Numbers.add(v_iteration, ONE_INTEGER)) {
                        id = ((NIL != backwardP_var) ? Numbers.subtract(length, v_iteration, ONE_INTEGER) : v_iteration);
                        v_answer = Vectors.aref(vector_var, id);
                        if (NIL == id_index.id_index_tombstone_p(v_answer) || NIL == id_index.id_index_skip_tombstones_p($SKIP)) {
                            if (NIL != id_index.id_index_tombstone_p(v_answer)) {
                                v_answer = $SKIP;
                            }
                            cdolist_list_var = inference_answer_justifications(v_answer);
                            justification = NIL;
                            justification = cdolist_list_var.first();
                            while (NIL != cdolist_list_var) {
                                cdolist_list_var_$41 = inference_answer_justification_proofs(justification);
                                proof = NIL;
                                proof = cdolist_list_var_$41.first();
                                while (NIL != cdolist_list_var_$41) {
                                    set.set_add(proof, answer_proofs);
                                    cdolist_list_var_$41 = cdolist_list_var_$41.rest();
                                    proof = cdolist_list_var_$41.first();
                                }
                                cdolist_list_var = cdolist_list_var.rest();
                                justification = cdolist_list_var.first();
                            }
                        }
                    }
                }
                SubLObject idx_$41 = idx;
                if (NIL == id_index.id_index_sparse_objects_empty_p(idx_$41)) {
                    SubLObject cdohash_table = id_index.id_index_sparse_objects(idx_$41);
                    SubLObject id2 = NIL;
                    SubLObject v_answer2 = NIL;
                    Iterator cdohash_iterator = Hashtables.getEntrySetIterator(cdohash_table);
                    try {
                        while (Hashtables.iteratorHasNext(cdohash_iterator)) {
                            Map.Entry cdohash_entry = Hashtables.iteratorNextEntry(cdohash_iterator);
                            id2 = Hashtables.getEntryKey(cdohash_entry);
                            v_answer2 = Hashtables.getEntryValue(cdohash_entry);
                            SubLObject cdolist_list_var2 = inference_answer_justifications(v_answer2);
                            SubLObject justification2 = NIL;
                            justification2 = cdolist_list_var2.first();
                            while (NIL != cdolist_list_var2) {
                                SubLObject cdolist_list_var_$42 = inference_answer_justification_proofs(justification2);
                                SubLObject proof2 = NIL;
                                proof2 = cdolist_list_var_$42.first();
                                while (NIL != cdolist_list_var_$42) {
                                    set.set_add(proof2, answer_proofs);
                                    cdolist_list_var_$42 = cdolist_list_var_$42.rest();
                                    proof2 = cdolist_list_var_$42.first();
                                }
                                cdolist_list_var2 = cdolist_list_var2.rest();
                                justification2 = cdolist_list_var2.first();
                            }
                        }
                    } finally {
                        Hashtables.releaseEntrySetIterator(cdohash_iterator);
                    }
                }
            }
            return Sort.sort(set.set_element_list(answer_proofs), Symbols.symbol_function($sym419$_), Symbols.symbol_function($sym540$PROOF_SUID));
        }
        return NIL;
    }

    @SubL(source = "cycl/inference/harness/inference-datastructures-inference.lisp", position = 127800L)
    public static SubLObject inference_all_answer_subproofs(SubLObject inference) {
        if (NIL != inference_has_some_answerP(inference)) {
            SubLObject answer_subproofs = set_contents.new_set_contents(ZERO_INTEGER, Symbols.symbol_function(EQL));
            SubLObject idx = inference_answer_id_index(inference);
            if (NIL == id_index.id_index_objects_empty_p(idx, $SKIP)) {
                SubLObject idx_$44 = idx;
                if (NIL == id_index.id_index_dense_objects_empty_p(idx_$44, $SKIP)) {
                    SubLObject vector_var = id_index.id_index_dense_objects(idx_$44);
                    SubLObject backwardP_var = NIL;
                    SubLObject length;
                    SubLObject v_iteration;
                    SubLObject id;
                    SubLObject v_answer;
                    SubLObject cdolist_list_var;
                    SubLObject justification;
                    SubLObject cdolist_list_var_$45;
                    SubLObject proof;
                    SubLObject cdolist_list_var_$46;
                    SubLObject subproof;
                    for (length = Sequences.length(vector_var), v_iteration = NIL, v_iteration = ZERO_INTEGER; v_iteration.numL(length); v_iteration = Numbers.add(v_iteration, ONE_INTEGER)) {
                        id = ((NIL != backwardP_var) ? Numbers.subtract(length, v_iteration, ONE_INTEGER) : v_iteration);
                        v_answer = Vectors.aref(vector_var, id);
                        if (NIL == id_index.id_index_tombstone_p(v_answer) || NIL == id_index.id_index_skip_tombstones_p($SKIP)) {
                            if (NIL != id_index.id_index_tombstone_p(v_answer)) {
                                v_answer = $SKIP;
                            }
                            cdolist_list_var = inference_answer_justifications(v_answer);
                            justification = NIL;
                            justification = cdolist_list_var.first();
                            while (NIL != cdolist_list_var) {
                                cdolist_list_var_$45 = inference_answer_justification_proofs(justification);
                                proof = NIL;
                                proof = cdolist_list_var_$45.first();
                                while (NIL != cdolist_list_var_$45) {
                                    cdolist_list_var_$46 = inference_datastructures_proof.all_proof_subproofs(proof);
                                    subproof = NIL;
                                    subproof = cdolist_list_var_$46.first();
                                    while (NIL != cdolist_list_var_$46) {
                                        answer_subproofs = set_contents.set_contents_add(subproof, answer_subproofs, Symbols.symbol_function(EQL));
                                        cdolist_list_var_$46 = cdolist_list_var_$46.rest();
                                        subproof = cdolist_list_var_$46.first();
                                    }
                                    cdolist_list_var_$45 = cdolist_list_var_$45.rest();
                                    proof = cdolist_list_var_$45.first();
                                }
                                cdolist_list_var = cdolist_list_var.rest();
                                justification = cdolist_list_var.first();
                            }
                        }
                    }
                }
                SubLObject idx_$45 = idx;
                if (NIL == id_index.id_index_sparse_objects_empty_p(idx_$45)) {
                    SubLObject cdohash_table = id_index.id_index_sparse_objects(idx_$45);
                    SubLObject id2 = NIL;
                    SubLObject v_answer2 = NIL;
                    Iterator cdohash_iterator = Hashtables.getEntrySetIterator(cdohash_table);
                    try {
                        while (Hashtables.iteratorHasNext(cdohash_iterator)) {
                            Map.Entry cdohash_entry = Hashtables.iteratorNextEntry(cdohash_iterator);
                            id2 = Hashtables.getEntryKey(cdohash_entry);
                            v_answer2 = Hashtables.getEntryValue(cdohash_entry);
                            SubLObject cdolist_list_var2 = inference_answer_justifications(v_answer2);
                            SubLObject justification2 = NIL;
                            justification2 = cdolist_list_var2.first();
                            while (NIL != cdolist_list_var2) {
                                SubLObject cdolist_list_var_$47 = inference_answer_justification_proofs(justification2);
                                SubLObject proof2 = NIL;
                                proof2 = cdolist_list_var_$47.first();
                                while (NIL != cdolist_list_var_$47) {
                                    SubLObject cdolist_list_var_$48 = inference_datastructures_proof.all_proof_subproofs(proof2);
                                    SubLObject subproof2 = NIL;
                                    subproof2 = cdolist_list_var_$48.first();
                                    while (NIL != cdolist_list_var_$48) {
                                        answer_subproofs = set_contents.set_contents_add(subproof2, answer_subproofs, Symbols.symbol_function(EQL));
                                        cdolist_list_var_$48 = cdolist_list_var_$48.rest();
                                        subproof2 = cdolist_list_var_$48.first();
                                    }
                                    cdolist_list_var_$47 = cdolist_list_var_$47.rest();
                                    proof2 = cdolist_list_var_$47.first();
                                }
                                cdolist_list_var2 = cdolist_list_var2.rest();
                                justification2 = cdolist_list_var2.first();
                            }
                        }
                    } finally {
                        Hashtables.releaseEntrySetIterator(cdohash_iterator);
                    }
                }
            }
            return Sort.sort(set_contents.set_contents_element_list(answer_subproofs), Symbols.symbol_function($sym419$_), Symbols.symbol_function($sym540$PROOF_SUID));
        }
        return NIL;
    }

    @SubL(source = "cycl/inference/harness/inference-datastructures-inference.lisp", position = 128500L)
    public static SubLObject inference_answer_justification_all_subproofs(SubLObject answer_justification) {
        SubLObject answer_subproofs = set_contents.new_set_contents(ZERO_INTEGER, Symbols.symbol_function(EQL));
        SubLObject cdolist_list_var = inference_answer_justification_proofs(answer_justification);
        SubLObject proof = NIL;
        proof = cdolist_list_var.first();
        while (NIL != cdolist_list_var) {
            SubLObject cdolist_list_var_$50 = inference_datastructures_proof.all_proof_subproofs(proof);
            SubLObject subproof = NIL;
            subproof = cdolist_list_var_$50.first();
            while (NIL != cdolist_list_var_$50) {
                answer_subproofs = set_contents.set_contents_add(subproof, answer_subproofs, Symbols.symbol_function(EQL));
                cdolist_list_var_$50 = cdolist_list_var_$50.rest();
                subproof = cdolist_list_var_$50.first();
            }
            cdolist_list_var = cdolist_list_var.rest();
            proof = cdolist_list_var.first();
        }
        return Sort.sort(set_contents.set_contents_element_list(answer_subproofs), Symbols.symbol_function($sym419$_), Symbols.symbol_function($sym540$PROOF_SUID));
    }

    @SubL(source = "cycl/inference/harness/inference-datastructures-inference.lisp", position = 129000L)
    public static SubLObject inference_all_answer_supports(SubLObject inference) {
        if (NIL != inference_has_some_answerP(inference)) {
            SubLObject supports = set_contents.new_set_contents(ZERO_INTEGER, Symbols.symbol_function(EQUAL));
            SubLObject idx = inference_answer_id_index(inference);
            if (NIL == id_index.id_index_objects_empty_p(idx, $SKIP)) {
                SubLObject idx_$51 = idx;
                if (NIL == id_index.id_index_dense_objects_empty_p(idx_$51, $SKIP)) {
                    SubLObject vector_var = id_index.id_index_dense_objects(idx_$51);
                    SubLObject backwardP_var = NIL;
                    SubLObject length;
                    SubLObject v_iteration;
                    SubLObject id;
                    SubLObject v_answer;
                    SubLObject cdolist_list_var;
                    SubLObject justification;
                    SubLObject cdolist_list_var_$52;
                    SubLObject support;
                    for (length = Sequences.length(vector_var), v_iteration = NIL, v_iteration = ZERO_INTEGER; v_iteration.numL(length); v_iteration = Numbers.add(v_iteration, ONE_INTEGER)) {
                        id = ((NIL != backwardP_var) ? Numbers.subtract(length, v_iteration, ONE_INTEGER) : v_iteration);
                        v_answer = Vectors.aref(vector_var, id);
                        if (NIL == id_index.id_index_tombstone_p(v_answer) || NIL == id_index.id_index_skip_tombstones_p($SKIP)) {
                            if (NIL != id_index.id_index_tombstone_p(v_answer)) {
                                v_answer = $SKIP;
                            }
                            cdolist_list_var = inference_answer_justifications(v_answer);
                            justification = NIL;
                            justification = cdolist_list_var.first();
                            while (NIL != cdolist_list_var) {
                                cdolist_list_var_$52 = inference_answer_justification_supports(justification);
                                support = NIL;
                                support = cdolist_list_var_$52.first();
                                while (NIL != cdolist_list_var_$52) {
                                    supports = set_contents.set_contents_add(support, supports, Symbols.symbol_function(EQUAL));
                                    cdolist_list_var_$52 = cdolist_list_var_$52.rest();
                                    support = cdolist_list_var_$52.first();
                                }
                                cdolist_list_var = cdolist_list_var.rest();
                                justification = cdolist_list_var.first();
                            }
                        }
                    }
                }
                SubLObject idx_$52 = idx;
                if (NIL == id_index.id_index_sparse_objects_empty_p(idx_$52)) {
                    SubLObject cdohash_table = id_index.id_index_sparse_objects(idx_$52);
                    SubLObject id2 = NIL;
                    SubLObject v_answer2 = NIL;
                    Iterator cdohash_iterator = Hashtables.getEntrySetIterator(cdohash_table);
                    try {
                        while (Hashtables.iteratorHasNext(cdohash_iterator)) {
                            Map.Entry cdohash_entry = Hashtables.iteratorNextEntry(cdohash_iterator);
                            id2 = Hashtables.getEntryKey(cdohash_entry);
                            v_answer2 = Hashtables.getEntryValue(cdohash_entry);
                            SubLObject cdolist_list_var2 = inference_answer_justifications(v_answer2);
                            SubLObject justification2 = NIL;
                            justification2 = cdolist_list_var2.first();
                            while (NIL != cdolist_list_var2) {
                                SubLObject cdolist_list_var_$53 = inference_answer_justification_supports(justification2);
                                SubLObject support2 = NIL;
                                support2 = cdolist_list_var_$53.first();
                                while (NIL != cdolist_list_var_$53) {
                                    supports = set_contents.set_contents_add(support2, supports, Symbols.symbol_function(EQUAL));
                                    cdolist_list_var_$53 = cdolist_list_var_$53.rest();
                                    support2 = cdolist_list_var_$53.first();
                                }
                                cdolist_list_var2 = cdolist_list_var2.rest();
                                justification2 = cdolist_list_var2.first();
                            }
                        }
                    } finally {
                        Hashtables.releaseEntrySetIterator(cdohash_iterator);
                    }
                }
            }
            return arguments.sort_supports(set_contents.set_contents_element_list(supports));
        }
        return NIL;
    }

    @SubL(source = "cycl/inference/harness/inference-datastructures-inference.lisp", position = 129600L)
    public static SubLObject inference_all_answer_modules(SubLObject inference) {
        SubLObject answer_subproofs = inference_all_answer_subproofs(inference);
        if (NIL != answer_subproofs) {
            SubLObject module_counts = dictionary.new_dictionary(Symbols.symbol_function(EQL), UNPROVIDED);
            SubLObject cdolist_list_var = answer_subproofs;
            SubLObject proof = NIL;
            proof = cdolist_list_var.first();
            while (NIL != cdolist_list_var) {
                SubLObject module_name = NIL;
                if (NIL != inference_worker.content_proof_p(proof)) {
                    SubLObject hl_module = inference_worker.content_proof_hl_module(proof);
                    module_name = inference_modules.hl_module_name(hl_module);
                } else if (NIL != inference_worker.logical_proof_p(proof)) {
                    module_name = inference_worker.structural_proof_type(proof);
                }
                if (NIL != module_name) {
                    dictionary_utilities.dictionary_increment(module_counts, module_name, UNPROVIDED);
                }
                cdolist_list_var = cdolist_list_var.rest();
                proof = cdolist_list_var.first();
            }
            return Sort.sort(dictionary_utilities.dictionary_to_alist(module_counts), Symbols.symbol_function($sym541$_), Symbols.symbol_function($sym542$CDR));
        }
        return NIL;
    }

    @SubL(source = "cycl/inference/harness/inference-datastructures-inference.lisp", position = 130200L)
    public static SubLObject problem_relevant_to_some_strategyP(SubLObject problem) {
        return list_utilities.sublisp_boolean(first_problem_relevant_strategy(problem));
    }

    @SubL(source = "cycl/inference/harness/inference-datastructures-inference.lisp", position = 130500L)
    public static SubLObject first_problem_relevant_strategy(SubLObject problem) {
        SubLObject store = inference_datastructures_problem.problem_store(problem);
        SubLObject idx = inference_datastructures_problem_store.problem_store_inference_id_index(store);
        if (NIL == id_index.id_index_objects_empty_p(idx, $SKIP)) {
            SubLObject idx_$55 = idx;
            if (NIL == id_index.id_index_dense_objects_empty_p(idx_$55, $SKIP)) {
                SubLObject vector_var = id_index.id_index_dense_objects(idx_$55);
                SubLObject backwardP_var = NIL;
                SubLObject length;
                SubLObject v_iteration;
                SubLObject id;
                SubLObject inference;
                SubLObject inference_var;
                SubLObject set_var;
                SubLObject set_contents_var;
                SubLObject basis_object;
                SubLObject state;
                SubLObject strategy;
                for (length = Sequences.length(vector_var), v_iteration = NIL, v_iteration = ZERO_INTEGER; v_iteration.numL(length); v_iteration = Numbers.add(v_iteration, ONE_INTEGER)) {
                    id = ((NIL != backwardP_var) ? Numbers.subtract(length, v_iteration, ONE_INTEGER) : v_iteration);
                    inference = Vectors.aref(vector_var, id);
                    if (NIL == id_index.id_index_tombstone_p(inference) || NIL == id_index.id_index_skip_tombstones_p($SKIP)) {
                        if (NIL != id_index.id_index_tombstone_p(inference)) {
                            inference = $SKIP;
                        }
                        if (NIL != inference_datastructures_problem.problem_relevant_to_inferenceP(problem, inference)) {
                            inference_var = inference;
                            set_var = inference_strategy_set(inference_var);
                            set_contents_var = set.do_set_internal(set_var);
                            for (basis_object = set_contents.do_set_contents_basis_object(set_contents_var), state = NIL, state = set_contents.do_set_contents_initial_state(basis_object, set_contents_var); NIL == set_contents.do_set_contents_doneP(basis_object,
                                    state); state = set_contents.do_set_contents_update_state(state)) {
                                strategy = set_contents.do_set_contents_next(basis_object, state);
                                if (NIL != set_contents.do_set_contents_element_validP(state, strategy)) {
                                    return strategy;
                                }
                            }
                        }
                    }
                }
            }
            SubLObject idx_$56 = idx;
            if (NIL == id_index.id_index_sparse_objects_empty_p(idx_$56)) {
                SubLObject cdohash_table = id_index.id_index_sparse_objects(idx_$56);
                SubLObject id2 = NIL;
                SubLObject inference2 = NIL;
                Iterator cdohash_iterator = Hashtables.getEntrySetIterator(cdohash_table);
                try {
                    while (Hashtables.iteratorHasNext(cdohash_iterator)) {
                        Map.Entry cdohash_entry = Hashtables.iteratorNextEntry(cdohash_iterator);
                        id2 = Hashtables.getEntryKey(cdohash_entry);
                        inference2 = Hashtables.getEntryValue(cdohash_entry);
                        if (NIL != inference_datastructures_problem.problem_relevant_to_inferenceP(problem, inference2)) {
                            SubLObject inference_var2 = inference2;
                            SubLObject set_var2 = inference_strategy_set(inference_var2);
                            SubLObject set_contents_var2 = set.do_set_internal(set_var2);
                            SubLObject basis_object2;
                            SubLObject state2;
                            SubLObject strategy2;
                            for (basis_object2 = set_contents.do_set_contents_basis_object(set_contents_var2), state2 = NIL, state2 = set_contents.do_set_contents_initial_state(basis_object2, set_contents_var2); NIL == set_contents.do_set_contents_doneP(basis_object2,
                                    state2); state2 = set_contents.do_set_contents_update_state(state2)) {
                                strategy2 = set_contents.do_set_contents_next(basis_object2, state2);
                                if (NIL != set_contents.do_set_contents_element_validP(state2, strategy2)) {
                                    return strategy2;
                                }
                            }
                        }
                    }
                } finally {
                    Hashtables.releaseEntrySetIterator(cdohash_iterator);
                }
            }
        }
        return NIL;
    }

    @SubL(source = "cycl/inference/harness/inference-datastructures-inference.lisp", position = 130600L)
    public static SubLObject problem_or_inference_p(SubLObject v_object) {
        return makeBoolean(NIL != inference_datastructures_problem.problem_p(v_object) || NIL != inference_p(v_object));
    }

    @SubL(source = "cycl/inference/harness/inference-datastructures-inference.lisp", position = 130800L)
    public static SubLObject with_inference_problem_working_time_table(SubLObject macroform, SubLObject environment) {
        SubLObject current;
        SubLObject datum = current = macroform.rest();
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, $list543);
        SubLObject temp = current.rest();
        current = current.first();
        SubLObject table_var = NIL;
        SubLObject inference = NIL;
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, $list543);
        table_var = current.first();
        current = current.rest();
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, $list543);
        inference = current.first();
        current = current.rest();
        if (NIL == current) {
            SubLObject body;
            current = (body = temp);
            SubLObject inference_var = $sym544$INFERENCE_VAR;
            return list($sym301$CLET, list(list(inference_var, inference)), list($sym545$WITH_INFERENCE_PROBLEM_WORKING_TIME_LOCK, list(inference_var), listS($sym301$CLET, list(list(table_var, ConsesLow.list($sym546$INFERENCE_PROBLEM_WORKING_TIME_TABLE, inference_var))), append(body, NIL))));
        }
        cdestructuring_bind.cdestructuring_bind_error(datum, $list543);
        return NIL;
    }

    @SubL(source = "cycl/inference/harness/inference-datastructures-inference.lisp", position = 131200L)
    public static SubLObject inference_problem_working_time_lock(SubLObject inference) {
        SubLObject data = inference_problem_working_time_data(inference);
        return data.first();
    }

    @SubL(source = "cycl/inference/harness/inference-datastructures-inference.lisp", position = 131400L)
    public static SubLObject inference_problem_working_time_table(SubLObject inference) {
        SubLObject data = inference_problem_working_time_data(inference);
        return conses_high.second(data);
    }

    @SubL(source = "cycl/inference/harness/inference-datastructures-inference.lisp", position = 131600L)
    public static SubLObject initialize_inference_problem_working_time_data(SubLObject inference) {
        SubLObject lock = Locks.make_lock($str547$Inference_problem_working_time_lo);
        SubLObject table = Hashtables.make_hash_table($int$24, UNPROVIDED, UNPROVIDED);
        SubLObject data = list(lock, table);
        set_inference_problem_working_time_data(inference, data);
        return data;
    }

    @SubL(source = "cycl/inference/harness/inference-datastructures-inference.lisp", position = 131900L)
    public static SubLObject inference_note_tactic_executed(SubLObject inference, SubLObject tactic) {
        SubLObject result = NIL;
        if (NIL != inference_maintain_term_working_setP(inference)) {
            SubLObject problem = inference_datastructures_tactic.tactic_problem(tactic);
            SubLObject now = Time.get_internal_real_time();
            SubLObject lock = inference_problem_working_time_lock(inference);
            SubLObject release = NIL;
            try {
                release = Locks.seize_lock(lock);
                SubLObject table = inference_problem_working_time_table(inference);
                SubLObject already_being_worked_on = Hashtables.gethash_without_values(problem, table, UNPROVIDED);
                if (NIL == already_being_worked_on) {
                    Hashtables.sethash(problem, table, now);
                    result = T;
                }
            } finally {
                if (NIL != release) {
                    Locks.release_lock(lock);
                }
            }
        }
        return result;
    }

    @SubL(source = "cycl/inference/harness/inference-datastructures-inference.lisp", position = 132400L)
    public static SubLObject inference_note_problem_pending(SubLObject inference, SubLObject problem) {
        SubLObject result = NIL;
        if (NIL != inference_maintain_term_working_setP(inference)) {
            SubLObject lock = inference_problem_working_time_lock(inference);
            SubLObject release = NIL;
            try {
                release = Locks.seize_lock(lock);
                SubLObject table = inference_problem_working_time_table(inference);
                Hashtables.remhash(problem, table);
                result = T;
            } finally {
                if (NIL != release) {
                    Locks.release_lock(lock);
                }
            }
        }
        return result;
    }

    @SubL(source = "cycl/inference/harness/inference-datastructures-inference.lisp", position = 132700L)
    public static SubLObject signal_inference_eventP(SubLObject inference, SubLObject event_type) {
        assert NIL != inference_p(inference) : inference;
        assert NIL != inference_datastructures_enumerated_types.inference_event_type_p(event_type) : event_type;
        return list_utilities.member_eqP(event_type, inference_events(inference));
    }

    @SubL(source = "cycl/inference/harness/inference-datastructures-inference.lisp", position = 132900L)
    public static SubLObject possibly_signal_new_inference_answer(SubLObject inference, SubLObject new_answer) {
        if (NIL != signal_inference_eventP(inference, $NEW_ANSWER)) {
            return signal_new_inference_answer(inference, new_answer);
        }
        return NIL;
    }

    @SubL(source = "cycl/inference/harness/inference-datastructures-inference.lisp", position = 133200L)
    public static SubLObject signal_new_inference_answer(SubLObject inference, SubLObject new_answer) {
        SubLObject store_id = inference_datastructures_problem_store.problem_store_suid(inference_problem_store(inference));
        SubLObject inference_id = inference_suid(inference);
        SubLObject new_answer_id = inference_answer_suid(new_answer);
        return inference_event.post_inference_new_answer_event(store_id, inference_id, new_answer_id);
    }

    @SubL(source = "cycl/inference/harness/inference-datastructures-inference.lisp", position = 133600L)
    public static SubLObject possibly_signal_inference_status_change(SubLObject inference) {
        if (NIL != signal_inference_eventP(inference, $STATUS_CHANGE)) {
            return signal_inference_status_change(inference, inference_status(inference));
        }
        return NIL;
    }

    @SubL(source = "cycl/inference/harness/inference-datastructures-inference.lisp", position = 133900L)
    public static SubLObject signal_inference_status_change(SubLObject inference, SubLObject new_status) {
        SubLObject store_id = inference_datastructures_problem_store.problem_store_suid(inference_problem_store(inference));
        SubLObject inference_id = inference_suid(inference);
        return inference_event.post_inference_status_change_event(store_id, inference_id, new_status);
    }

    @SubL(source = "cycl/inference/harness/inference-datastructures-inference.lisp", position = 134200L)
    public static SubLObject possibly_signal_inference_new_transformation_depth_reached(SubLObject inference, SubLObject new_depth) {
        if (NIL != signal_inference_eventP(inference, $NEW_TRANSFORMATION_DEPTH_REACHED)) {
            return signal_inference_new_transformation_depth_reached(inference, new_depth);
        }
        return NIL;
    }

    @SubL(source = "cycl/inference/harness/inference-datastructures-inference.lisp", position = 134600L)
    public static SubLObject signal_inference_new_transformation_depth_reached(SubLObject inference, SubLObject new_depth) {
        SubLObject store_id = inference_datastructures_problem_store.problem_store_suid(inference_problem_store(inference));
        SubLObject inference_id = inference_suid(inference);
        return inference_event.post_inference_new_transformation_depth_reached_event(store_id, inference_id, new_depth);
    }

    @SubL(source = "cycl/inference/harness/inference-datastructures-inference.lisp", position = 134900L)
    public static SubLObject inference_within_sksi_query_execution(SubLObject macroform, SubLObject environment) {
        SubLObject datum = macroform.rest();
        SubLObject body;
        SubLObject current = body = datum;
        SubLObject inferences_var = $sym551$INFERENCES_VAR;
        SubLObject inference_var = $sym552$INFERENCE_VAR;
        SubLObject tactic_var = $sym553$TACTIC_VAR;
        SubLObject start_time = $sym554$START_TIME;
        return list($sym301$CLET, list(reader.bq_cons(inferences_var, $list555), reader.bq_cons(inference_var, $list556), reader.bq_cons(tactic_var, $list557), start_time),
                list($sym558$CUNWIND_PROTECT,
                        listS($sym559$PROGN, list($sym560$POSSIBLY_SIGNAL_SKSI_QUERY_START, inference_var, tactic_var), list($sym321$CSETQ, start_time, listS($sym561$INFERENCE_TIME_SO_FAR, inference_var, $list562)),
                                list($sym563$POSSIBLY_ADD_INFERENCE_SKSI_QUERY_START_TIME, inferences_var, start_time), append(body, NIL)),
                        list($sym564$POSSIBLY_SIGNAL_SKSI_QUERY_END, inference_var, tactic_var), list($sym565$POSSIBLY_INCREMENT_INFERENCE_SKSI_QUERY_TOTAL_TIME, inferences_var, list($sym566$_, listS($sym561$INFERENCE_TIME_SO_FAR, inference_var, $list562), start_time))));
    }

    @SubL(source = "cycl/inference/harness/inference-datastructures-inference.lisp", position = 135700L)
    public static SubLObject possibly_signal_sksi_query_start(SubLObject inference, SubLObject tactic) {
        if (NIL != inference && NIL != tactic) {
            SubLObject start_time = inference_time_so_far(inference, NIL);
            SubLObject v_properties = list($START_TIME, start_time);
            return possibly_signal_sksi_query(inference, tactic, $START, v_properties);
        }
        return NIL;
    }

    @SubL(source = "cycl/inference/harness/inference-datastructures-inference.lisp", position = 136100L)
    public static SubLObject possibly_signal_sksi_query_end(SubLObject inference, SubLObject tactic) {
        if (NIL != inference && NIL != tactic) {
            SubLObject end_time = inference_time_so_far(inference, NIL);
            SubLObject v_properties = list($END_TIME, end_time);
            return possibly_signal_sksi_query(inference, tactic, $END, v_properties);
        }
        return NIL;
    }

    @SubL(source = "cycl/inference/harness/inference-datastructures-inference.lisp", position = 136400L)
    public static SubLObject possibly_increment_inference_sksi_query_total_time(SubLObject inferences, SubLObject elapsed_seconds) {
        SubLThread thread = SubLProcess.currentSubLThread();
        if (NIL != inferences && NIL != elapsed_seconds) {
            if (NIL != sksi_infrastructure_macros.sksi_profiling_onP()) {
                sksi_infrastructure_macros.$sksi_sql_query_time$.setDynamicValue(Numbers.add(sksi_infrastructure_macros.$sksi_sql_query_time$.getDynamicValue(thread), elapsed_seconds), thread);
                sksi_infrastructure_macros.$sksi_sql_query_count$.setDynamicValue(Numbers.add(sksi_infrastructure_macros.$sksi_sql_query_count$.getDynamicValue(thread), ONE_INTEGER), thread);
            }
            SubLObject cdolist_list_var = inferences;
            SubLObject inference = NIL;
            inference = cdolist_list_var.first();
            while (NIL != cdolist_list_var) {
                if (NIL != inference_computes_metricP(inference, $SKSI_QUERY_TOTAL_TIME)) {
                    return increment_inference_sksi_query_total_time(inference, elapsed_seconds);
                }
                cdolist_list_var = cdolist_list_var.rest();
                inference = cdolist_list_var.first();
            }
        }
        return NIL;
    }

    @SubL(source = "cycl/inference/harness/inference-datastructures-inference.lisp", position = 137000L)
    public static SubLObject possibly_add_inference_sksi_query_start_time(SubLObject inferences, SubLObject elapsed_seconds) {
        if (NIL != inferences && NIL != elapsed_seconds) {
            if (NIL != sksi_infrastructure_macros.sksi_profiling_onP()) {
            }
            SubLObject cdolist_list_var = inferences;
            SubLObject inference = NIL;
            inference = cdolist_list_var.first();
            while (NIL != cdolist_list_var) {
                if (NIL != inference_computes_metricP(inference, $SKSI_QUERY_START_TIMES)) {
                    return add_inference_sksi_query_start_time(inference, elapsed_seconds);
                }
                cdolist_list_var = cdolist_list_var.rest();
                inference = cdolist_list_var.first();
            }
        }
        return NIL;
    }

    @SubL(source = "cycl/inference/harness/inference-datastructures-inference.lisp", position = 137400L)
    public static SubLObject possibly_signal_sksi_query(SubLObject inference, SubLObject tactic, SubLObject status, SubLObject v_properties) {
        if (v_properties == UNPROVIDED) {
            v_properties = NIL;
        }
        if (NIL != signal_inference_eventP(inference, $SKSI_QUERY)) {
            return signal_sksi_query(inference, tactic, status, v_properties);
        }
        return NIL;
    }

    @SubL(source = "cycl/inference/harness/inference-datastructures-inference.lisp", position = 137700L)
    public static SubLObject signal_sksi_query(SubLObject inference, SubLObject tactic, SubLObject status, SubLObject v_properties) {
        if (v_properties == UNPROVIDED) {
            v_properties = NIL;
        }
        SubLObject problem = inference_datastructures_tactic.tactic_problem(tactic);
        SubLObject store = inference_datastructures_problem.problem_store(problem);
        SubLObject store_id = inference_datastructures_problem_store.problem_store_suid(store);
        SubLObject inference_id = inference_suid(inference);
        SubLObject problem_id = inference_datastructures_problem.problem_suid(problem);
        SubLObject tactic_id = inference_datastructures_tactic.tactic_suid(tactic);
        return inference_event.post_sksi_query_event(store_id, inference_id, problem_id, tactic_id, status, v_properties);
    }

    @SubL(source = "cycl/inference/harness/inference-datastructures-inference.lisp", position = 138200L)
    public static SubLObject inference_within_sparql_query_execution(SubLObject macroform, SubLObject environment) {
        SubLObject current;
        SubLObject datum = current = macroform.rest();
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, $list574);
        SubLObject temp = current.rest();
        current = current.first();
        SubLObject allow_other_keys_p = NIL;
        SubLObject rest = current;
        SubLObject bad = NIL;
        SubLObject current_$57 = NIL;
        while (NIL != rest) {
            cdestructuring_bind.destructuring_bind_must_consp(rest, datum, $list574);
            current_$57 = rest.first();
            rest = rest.rest();
            cdestructuring_bind.destructuring_bind_must_consp(rest, datum, $list574);
            if (NIL == conses_high.member(current_$57, $list575, UNPROVIDED, UNPROVIDED)) {
                bad = T;
            }
            if (current_$57 == $ALLOW_OTHER_KEYS) {
                allow_other_keys_p = rest.first();
            }
            rest = rest.rest();
        }
        if (NIL != bad && NIL == allow_other_keys_p) {
            cdestructuring_bind.cdestructuring_bind_error(datum, $list574);
        }
        SubLObject sparql_tail = cdestructuring_bind.property_list_member($SPARQL, current);
        SubLObject sparql = (NIL != sparql_tail) ? conses_high.cadr(sparql_tail) : NIL;
        SubLObject result_set_tail = cdestructuring_bind.property_list_member($RESULT_SET, current);
        SubLObject result_set = (NIL != result_set_tail) ? conses_high.cadr(result_set_tail) : NIL;
        SubLObject body;
        current = (body = temp);
        SubLObject inferences = $sym578$INFERENCES;
        SubLObject inference = $sym579$INFERENCE;
        SubLObject start = $sym580$START;
        SubLObject end = $sym581$END;
        SubLObject count = $sym582$COUNT;
        return list($sym301$CLET, list(reader.bq_cons(inferences, $list555), list(inference, list($sym583$LAST_ONE, inferences)), start, end, count),
                list($sym558$CUNWIND_PROTECT, listS($sym559$PROGN, list($sym321$CSETQ, start, list($sym584$FWHEN, inference, listS($sym585$INFERENCE_CUMULATIVE_TIME_SO_FAR, inference, $list562))), append(body, NIL)),
                        list($sym321$CSETQ, end, list($sym584$FWHEN, inference, listS($sym585$INFERENCE_CUMULATIVE_TIME_SO_FAR, inference, $list562))), list($sym321$CSETQ, count, list($sym586$LENGTH, result_set)),
                        list($sym587$POSSIBLY_ADD_INFERENCE_SPARQL_QUERY_PROFILE, inferences, start, end, count)));
    }

    @SubL(source = "cycl/inference/harness/inference-datastructures-inference.lisp", position = 138900L)
    public static SubLObject possibly_add_inference_sparql_query_profile(SubLObject inferences, SubLObject start, SubLObject end, SubLObject count) {
        if (NIL != inferences && NIL != start && NIL != end && NIL != count) {
            SubLObject cdolist_list_var = inferences;
            SubLObject inference = NIL;
            inference = cdolist_list_var.first();
            while (NIL != cdolist_list_var) {
                if (NIL != inference_computes_metricP(inference, $SPARQL_QUERY_PROFILE)) {
                    SubLObject profile = list(start, end, count);
                    return add_inference_sparql_query_profile(inference, profile);
                }
                cdolist_list_var = cdolist_list_var.rest();
                inference = cdolist_list_var.first();
            }
        }
        return NIL;
    }

    @SubL(source = "cycl/inference/harness/inference-datastructures-inference.lisp", position = 139400L)
    public static SubLObject increment_inference_sksi_query_total_time(SubLObject inference, SubLObject elapsed_seconds) {
        assert NIL != inference_p(inference) : inference;
        assert NIL != number_utilities.non_negative_number_p(elapsed_seconds) : elapsed_seconds;
        return inference_accumulate(inference, $SKSI_QUERY_TOTAL_TIME_ACC, elapsed_seconds);
    }

    @SubL(source = "cycl/inference/harness/inference-datastructures-inference.lisp", position = 139700L)
    public static SubLObject add_inference_sksi_query_start_time(SubLObject inference, SubLObject elapsed_seconds) {
        assert NIL != inference_p(inference) : inference;
        assert NIL != number_utilities.non_negative_number_p(elapsed_seconds) : elapsed_seconds;
        return inference_accumulate(inference, $SKSI_QUERY_START_TIMES_ACC, elapsed_seconds);
    }

    @SubL(source = "cycl/inference/harness/inference-datastructures-inference.lisp", position = 140000L)
    public static SubLObject add_inference_sparql_query_profile(SubLObject inference, SubLObject profile) {
        assert NIL != inference_p(inference) : inference;
        assert NIL != Types.listp(profile) : profile;
        assert NIL != list_utilities.non_dotted_list_p(profile) : profile;
        SubLObject cdolist_list_var = profile;
        SubLObject elem = NIL;
        elem = cdolist_list_var.first();
        while (NIL != cdolist_list_var) {
            assert NIL != number_utilities.non_negative_number_p(elem) : elem;
            cdolist_list_var = cdolist_list_var.rest();
            elem = cdolist_list_var.first();
        }
        return inference_accumulate(inference, $SPARQL_QUERY_PROFILE_ACC, profile);
    }

    public static SubLObject declare_inference_datastructures_inference_file() {
        declareFunction(myName, "inference_type_p", "INFERENCE-TYPE-P", 1, 0, false);
        declareFunction(myName, "inference_print_function_trampoline", "INFERENCE-PRINT-FUNCTION-TRAMPOLINE", 2, 0, false);
        declareFunction(myName, "inference_p", "INFERENCE-P", 1, 0, false);
        new $inference_p$UnaryFunction();
        declareFunction(myName, "infrnc_suid", "INFRNC-SUID", 1, 0, false);
        declareFunction(myName, "infrnc_problem_store", "INFRNC-PROBLEM-STORE", 1, 0, false);
        declareFunction(myName, "infrnc_forward_propagate", "INFRNC-FORWARD-PROPAGATE", 1, 0, false);
        declareFunction(myName, "infrnc_input_mt", "INFRNC-INPUT-MT", 1, 0, false);
        declareFunction(myName, "infrnc_input_el_query", "INFRNC-INPUT-EL-QUERY", 1, 0, false);
        declareFunction(myName, "infrnc_input_non_explanatory_el_query", "INFRNC-INPUT-NON-EXPLANATORY-EL-QUERY", 1, 0, false);
        declareFunction(myName, "infrnc_input_query_properties", "INFRNC-INPUT-QUERY-PROPERTIES", 1, 0, false);
        declareFunction(myName, "infrnc_mt", "INFRNC-MT", 1, 0, false);
        declareFunction(myName, "infrnc_el_query", "INFRNC-EL-QUERY", 1, 0, false);
        declareFunction(myName, "infrnc_el_bindings", "INFRNC-EL-BINDINGS", 1, 0, false);
        declareFunction(myName, "infrnc_hl_query", "INFRNC-HL-QUERY", 1, 0, false);
        declareFunction(myName, "infrnc_explanatory_subquery", "INFRNC-EXPLANATORY-SUBQUERY", 1, 0, false);
        declareFunction(myName, "infrnc_non_explanatory_subquery", "INFRNC-NON-EXPLANATORY-SUBQUERY", 1, 0, false);
        declareFunction(myName, "infrnc_free_hl_vars", "INFRNC-FREE-HL-VARS", 1, 0, false);
        declareFunction(myName, "infrnc_hypothetical_bindings", "INFRNC-HYPOTHETICAL-BINDINGS", 1, 0, false);
        declareFunction(myName, "infrnc_answer_id_index", "INFRNC-ANSWER-ID-INDEX", 1, 0, false);
        declareFunction(myName, "infrnc_answer_bindings_index", "INFRNC-ANSWER-BINDINGS-INDEX", 1, 0, false);
        declareFunction(myName, "infrnc_new_answer_id_start", "INFRNC-NEW-ANSWER-ID-START", 1, 0, false);
        declareFunction(myName, "infrnc_new_answer_justifications", "INFRNC-NEW-ANSWER-JUSTIFICATIONS", 1, 0, false);
        declareFunction(myName, "infrnc_status", "INFRNC-STATUS", 1, 0, false);
        declareFunction(myName, "infrnc_suspend_status", "INFRNC-SUSPEND-STATUS", 1, 0, false);
        declareFunction(myName, "infrnc_root_link", "INFRNC-ROOT-LINK", 1, 0, false);
        declareFunction(myName, "infrnc_relevant_problems", "INFRNC-RELEVANT-PROBLEMS", 1, 0, false);
        declareFunction(myName, "infrnc_strategy_set", "INFRNC-STRATEGY-SET", 1, 0, false);
        declareFunction(myName, "infrnc_control_process", "INFRNC-CONTROL-PROCESS", 1, 0, false);
        declareFunction(myName, "infrnc_interrupting_processes", "INFRNC-INTERRUPTING-PROCESSES", 1, 0, false);
        declareFunction(myName, "infrnc_max_transformation_depth_reached", "INFRNC-MAX-TRANSFORMATION-DEPTH-REACHED", 1, 0, false);
        declareFunction(myName, "infrnc_disjunction_free_el_vars_policy", "INFRNC-DISJUNCTION-FREE-EL-VARS-POLICY", 1, 0, false);
        declareFunction(myName, "infrnc_result_uniqueness_criterion", "INFRNC-RESULT-UNIQUENESS-CRITERION", 1, 0, false);
        declareFunction(myName, "infrnc_allow_hl_predicate_transformationP", "INFRNC-ALLOW-HL-PREDICATE-TRANSFORMATION?", 1, 0, false);
        declareFunction(myName, "infrnc_allow_unbound_predicate_transformationP", "INFRNC-ALLOW-UNBOUND-PREDICATE-TRANSFORMATION?", 1, 0, false);
        declareFunction(myName, "infrnc_allow_evaluatable_predicate_transformationP", "INFRNC-ALLOW-EVALUATABLE-PREDICATE-TRANSFORMATION?", 1, 0, false);
        declareFunction(myName, "infrnc_allow_indeterminate_resultsP", "INFRNC-ALLOW-INDETERMINATE-RESULTS?", 1, 0, false);
        declareFunction(myName, "infrnc_allowed_rules", "INFRNC-ALLOWED-RULES", 1, 0, false);
        declareFunction(myName, "infrnc_forbidden_rules", "INFRNC-FORBIDDEN-RULES", 1, 0, false);
        declareFunction(myName, "infrnc_allowed_modules", "INFRNC-ALLOWED-MODULES", 1, 0, false);
        declareFunction(myName, "infrnc_allow_abnormality_checkingP", "INFRNC-ALLOW-ABNORMALITY-CHECKING?", 1, 0, false);
        declareFunction(myName, "infrnc_transitive_closure_mode", "INFRNC-TRANSITIVE-CLOSURE-MODE", 1, 0, false);
        declareFunction(myName, "infrnc_problem_store_privateP", "INFRNC-PROBLEM-STORE-PRIVATE?", 1, 0, false);
        declareFunction(myName, "infrnc_continuableP", "INFRNC-CONTINUABLE?", 1, 0, false);
        declareFunction(myName, "infrnc_browsableP", "INFRNC-BROWSABLE?", 1, 0, false);
        declareFunction(myName, "infrnc_return_type", "INFRNC-RETURN-TYPE", 1, 0, false);
        declareFunction(myName, "infrnc_answer_language", "INFRNC-ANSWER-LANGUAGE", 1, 0, false);
        declareFunction(myName, "infrnc_cache_resultsP", "INFRNC-CACHE-RESULTS?", 1, 0, false);
        declareFunction(myName, "infrnc_blockingP", "INFRNC-BLOCKING?", 1, 0, false);
        declareFunction(myName, "infrnc_max_number", "INFRNC-MAX-NUMBER", 1, 0, false);
        declareFunction(myName, "infrnc_max_time", "INFRNC-MAX-TIME", 1, 0, false);
        declareFunction(myName, "infrnc_max_step", "INFRNC-MAX-STEP", 1, 0, false);
        declareFunction(myName, "infrnc_mode", "INFRNC-MODE", 1, 0, false);
        declareFunction(myName, "infrnc_forward_max_time", "INFRNC-FORWARD-MAX-TIME", 1, 0, false);
        declareFunction(myName, "infrnc_max_proof_depth", "INFRNC-MAX-PROOF-DEPTH", 1, 0, false);
        declareFunction(myName, "infrnc_max_transformation_depth", "INFRNC-MAX-TRANSFORMATION-DEPTH", 1, 0, false);
        declareFunction(myName, "infrnc_min_rule_utility", "INFRNC-MIN-RULE-UTILITY", 1, 0, false);
        declareFunction(myName, "infrnc_probably_approximately_done", "INFRNC-PROBABLY-APPROXIMATELY-DONE", 1, 0, false);
        declareFunction(myName, "infrnc_metrics_template", "INFRNC-METRICS-TEMPLATE", 1, 0, false);
        declareFunction(myName, "infrnc_start_universal_time", "INFRNC-START-UNIVERSAL-TIME", 1, 0, false);
        declareFunction(myName, "infrnc_start_internal_real_time", "INFRNC-START-INTERNAL-REAL-TIME", 1, 0, false);
        declareFunction(myName, "infrnc_end_internal_real_time", "INFRNC-END-INTERNAL-REAL-TIME", 1, 0, false);
        declareFunction(myName, "infrnc_pad_internal_real_time", "INFRNC-PAD-INTERNAL-REAL-TIME", 1, 0, false);
        declareFunction(myName, "infrnc_hypothesization_time", "INFRNC-HYPOTHESIZATION-TIME", 1, 0, false);
        declareFunction(myName, "infrnc_cumulative_time", "INFRNC-CUMULATIVE-TIME", 1, 0, false);
        declareFunction(myName, "infrnc_step_count", "INFRNC-STEP-COUNT", 1, 0, false);
        declareFunction(myName, "infrnc_cumulative_step_count", "INFRNC-CUMULATIVE-STEP-COUNT", 1, 0, false);
        declareFunction(myName, "infrnc_events", "INFRNC-EVENTS", 1, 0, false);
        declareFunction(myName, "infrnc_halt_conditions", "INFRNC-HALT-CONDITIONS", 1, 0, false);
        declareFunction(myName, "infrnc_accumulators", "INFRNC-ACCUMULATORS", 1, 0, false);
        declareFunction(myName, "infrnc_proof_watermark", "INFRNC-PROOF-WATERMARK", 1, 0, false);
        declareFunction(myName, "infrnc_problem_working_time_data", "INFRNC-PROBLEM-WORKING-TIME-DATA", 1, 0, false);
        declareFunction(myName, "infrnc_type", "INFRNC-TYPE", 1, 0, false);
        declareFunction(myName, "infrnc_data", "INFRNC-DATA", 1, 0, false);
        declareFunction(myName, "infrnc_properties", "INFRNC-PROPERTIES", 1, 0, false);
        declareFunction(myName, "_csetf_infrnc_suid", "_CSETF-INFRNC-SUID", 2, 0, false);
        declareFunction(myName, "_csetf_infrnc_problem_store", "_CSETF-INFRNC-PROBLEM-STORE", 2, 0, false);
        declareFunction(myName, "_csetf_infrnc_forward_propagate", "_CSETF-INFRNC-FORWARD-PROPAGATE", 2, 0, false);
        declareFunction(myName, "_csetf_infrnc_input_mt", "_CSETF-INFRNC-INPUT-MT", 2, 0, false);
        declareFunction(myName, "_csetf_infrnc_input_el_query", "_CSETF-INFRNC-INPUT-EL-QUERY", 2, 0, false);
        declareFunction(myName, "_csetf_infrnc_input_non_explanatory_el_query", "_CSETF-INFRNC-INPUT-NON-EXPLANATORY-EL-QUERY", 2, 0, false);
        declareFunction(myName, "_csetf_infrnc_input_query_properties", "_CSETF-INFRNC-INPUT-QUERY-PROPERTIES", 2, 0, false);
        declareFunction(myName, "_csetf_infrnc_mt", "_CSETF-INFRNC-MT", 2, 0, false);
        declareFunction(myName, "_csetf_infrnc_el_query", "_CSETF-INFRNC-EL-QUERY", 2, 0, false);
        declareFunction(myName, "_csetf_infrnc_el_bindings", "_CSETF-INFRNC-EL-BINDINGS", 2, 0, false);
        declareFunction(myName, "_csetf_infrnc_hl_query", "_CSETF-INFRNC-HL-QUERY", 2, 0, false);
        declareFunction(myName, "_csetf_infrnc_explanatory_subquery", "_CSETF-INFRNC-EXPLANATORY-SUBQUERY", 2, 0, false);
        declareFunction(myName, "_csetf_infrnc_non_explanatory_subquery", "_CSETF-INFRNC-NON-EXPLANATORY-SUBQUERY", 2, 0, false);
        declareFunction(myName, "_csetf_infrnc_free_hl_vars", "_CSETF-INFRNC-FREE-HL-VARS", 2, 0, false);
        declareFunction(myName, "_csetf_infrnc_hypothetical_bindings", "_CSETF-INFRNC-HYPOTHETICAL-BINDINGS", 2, 0, false);
        declareFunction(myName, "_csetf_infrnc_answer_id_index", "_CSETF-INFRNC-ANSWER-ID-INDEX", 2, 0, false);
        declareFunction(myName, "_csetf_infrnc_answer_bindings_index", "_CSETF-INFRNC-ANSWER-BINDINGS-INDEX", 2, 0, false);
        declareFunction(myName, "_csetf_infrnc_new_answer_id_start", "_CSETF-INFRNC-NEW-ANSWER-ID-START", 2, 0, false);
        declareFunction(myName, "_csetf_infrnc_new_answer_justifications", "_CSETF-INFRNC-NEW-ANSWER-JUSTIFICATIONS", 2, 0, false);
        declareFunction(myName, "_csetf_infrnc_status", "_CSETF-INFRNC-STATUS", 2, 0, false);
        declareFunction(myName, "_csetf_infrnc_suspend_status", "_CSETF-INFRNC-SUSPEND-STATUS", 2, 0, false);
        declareFunction(myName, "_csetf_infrnc_root_link", "_CSETF-INFRNC-ROOT-LINK", 2, 0, false);
        declareFunction(myName, "_csetf_infrnc_relevant_problems", "_CSETF-INFRNC-RELEVANT-PROBLEMS", 2, 0, false);
        declareFunction(myName, "_csetf_infrnc_strategy_set", "_CSETF-INFRNC-STRATEGY-SET", 2, 0, false);
        declareFunction(myName, "_csetf_infrnc_control_process", "_CSETF-INFRNC-CONTROL-PROCESS", 2, 0, false);
        declareFunction(myName, "_csetf_infrnc_interrupting_processes", "_CSETF-INFRNC-INTERRUPTING-PROCESSES", 2, 0, false);
        declareFunction(myName, "_csetf_infrnc_max_transformation_depth_reached", "_CSETF-INFRNC-MAX-TRANSFORMATION-DEPTH-REACHED", 2, 0, false);
        declareFunction(myName, "_csetf_infrnc_disjunction_free_el_vars_policy", "_CSETF-INFRNC-DISJUNCTION-FREE-EL-VARS-POLICY", 2, 0, false);
        declareFunction(myName, "_csetf_infrnc_result_uniqueness_criterion", "_CSETF-INFRNC-RESULT-UNIQUENESS-CRITERION", 2, 0, false);
        declareFunction(myName, "_csetf_infrnc_allow_hl_predicate_transformationP", "_CSETF-INFRNC-ALLOW-HL-PREDICATE-TRANSFORMATION?", 2, 0, false);
        declareFunction(myName, "_csetf_infrnc_allow_unbound_predicate_transformationP", "_CSETF-INFRNC-ALLOW-UNBOUND-PREDICATE-TRANSFORMATION?", 2, 0, false);
        declareFunction(myName, "_csetf_infrnc_allow_evaluatable_predicate_transformationP", "_CSETF-INFRNC-ALLOW-EVALUATABLE-PREDICATE-TRANSFORMATION?", 2, 0, false);
        declareFunction(myName, "_csetf_infrnc_allow_indeterminate_resultsP", "_CSETF-INFRNC-ALLOW-INDETERMINATE-RESULTS?", 2, 0, false);
        declareFunction(myName, "_csetf_infrnc_allowed_rules", "_CSETF-INFRNC-ALLOWED-RULES", 2, 0, false);
        declareFunction(myName, "_csetf_infrnc_forbidden_rules", "_CSETF-INFRNC-FORBIDDEN-RULES", 2, 0, false);
        declareFunction(myName, "_csetf_infrnc_allowed_modules", "_CSETF-INFRNC-ALLOWED-MODULES", 2, 0, false);
        declareFunction(myName, "_csetf_infrnc_allow_abnormality_checkingP", "_CSETF-INFRNC-ALLOW-ABNORMALITY-CHECKING?", 2, 0, false);
        declareFunction(myName, "_csetf_infrnc_transitive_closure_mode", "_CSETF-INFRNC-TRANSITIVE-CLOSURE-MODE", 2, 0, false);
        declareFunction(myName, "_csetf_infrnc_problem_store_privateP", "_CSETF-INFRNC-PROBLEM-STORE-PRIVATE?", 2, 0, false);
        declareFunction(myName, "_csetf_infrnc_continuableP", "_CSETF-INFRNC-CONTINUABLE?", 2, 0, false);
        declareFunction(myName, "_csetf_infrnc_browsableP", "_CSETF-INFRNC-BROWSABLE?", 2, 0, false);
        declareFunction(myName, "_csetf_infrnc_return_type", "_CSETF-INFRNC-RETURN-TYPE", 2, 0, false);
        declareFunction(myName, "_csetf_infrnc_answer_language", "_CSETF-INFRNC-ANSWER-LANGUAGE", 2, 0, false);
        declareFunction(myName, "_csetf_infrnc_cache_resultsP", "_CSETF-INFRNC-CACHE-RESULTS?", 2, 0, false);
        declareFunction(myName, "_csetf_infrnc_blockingP", "_CSETF-INFRNC-BLOCKING?", 2, 0, false);
        declareFunction(myName, "_csetf_infrnc_max_number", "_CSETF-INFRNC-MAX-NUMBER", 2, 0, false);
        declareFunction(myName, "_csetf_infrnc_max_time", "_CSETF-INFRNC-MAX-TIME", 2, 0, false);
        declareFunction(myName, "_csetf_infrnc_max_step", "_CSETF-INFRNC-MAX-STEP", 2, 0, false);
        declareFunction(myName, "_csetf_infrnc_mode", "_CSETF-INFRNC-MODE", 2, 0, false);
        declareFunction(myName, "_csetf_infrnc_forward_max_time", "_CSETF-INFRNC-FORWARD-MAX-TIME", 2, 0, false);
        declareFunction(myName, "_csetf_infrnc_max_proof_depth", "_CSETF-INFRNC-MAX-PROOF-DEPTH", 2, 0, false);
        declareFunction(myName, "_csetf_infrnc_max_transformation_depth", "_CSETF-INFRNC-MAX-TRANSFORMATION-DEPTH", 2, 0, false);
        declareFunction(myName, "_csetf_infrnc_min_rule_utility", "_CSETF-INFRNC-MIN-RULE-UTILITY", 2, 0, false);
        declareFunction(myName, "_csetf_infrnc_probably_approximately_done", "_CSETF-INFRNC-PROBABLY-APPROXIMATELY-DONE", 2, 0, false);
        declareFunction(myName, "_csetf_infrnc_metrics_template", "_CSETF-INFRNC-METRICS-TEMPLATE", 2, 0, false);
        declareFunction(myName, "_csetf_infrnc_start_universal_time", "_CSETF-INFRNC-START-UNIVERSAL-TIME", 2, 0, false);
        declareFunction(myName, "_csetf_infrnc_start_internal_real_time", "_CSETF-INFRNC-START-INTERNAL-REAL-TIME", 2, 0, false);
        declareFunction(myName, "_csetf_infrnc_end_internal_real_time", "_CSETF-INFRNC-END-INTERNAL-REAL-TIME", 2, 0, false);
        declareFunction(myName, "_csetf_infrnc_pad_internal_real_time", "_CSETF-INFRNC-PAD-INTERNAL-REAL-TIME", 2, 0, false);
        declareFunction(myName, "_csetf_infrnc_hypothesization_time", "_CSETF-INFRNC-HYPOTHESIZATION-TIME", 2, 0, false);
        declareFunction(myName, "_csetf_infrnc_cumulative_time", "_CSETF-INFRNC-CUMULATIVE-TIME", 2, 0, false);
        declareFunction(myName, "_csetf_infrnc_step_count", "_CSETF-INFRNC-STEP-COUNT", 2, 0, false);
        declareFunction(myName, "_csetf_infrnc_cumulative_step_count", "_CSETF-INFRNC-CUMULATIVE-STEP-COUNT", 2, 0, false);
        declareFunction(myName, "_csetf_infrnc_events", "_CSETF-INFRNC-EVENTS", 2, 0, false);
        declareFunction(myName, "_csetf_infrnc_halt_conditions", "_CSETF-INFRNC-HALT-CONDITIONS", 2, 0, false);
        declareFunction(myName, "_csetf_infrnc_accumulators", "_CSETF-INFRNC-ACCUMULATORS", 2, 0, false);
        declareFunction(myName, "_csetf_infrnc_proof_watermark", "_CSETF-INFRNC-PROOF-WATERMARK", 2, 0, false);
        declareFunction(myName, "_csetf_infrnc_problem_working_time_data", "_CSETF-INFRNC-PROBLEM-WORKING-TIME-DATA", 2, 0, false);
        declareFunction(myName, "_csetf_infrnc_type", "_CSETF-INFRNC-TYPE", 2, 0, false);
        declareFunction(myName, "_csetf_infrnc_data", "_CSETF-INFRNC-DATA", 2, 0, false);
        declareFunction(myName, "_csetf_infrnc_properties", "_CSETF-INFRNC-PROPERTIES", 2, 0, false);
        declareFunction(myName, "make_inference", "MAKE-INFERENCE", 0, 1, false);
        declareFunction(myName, "visit_defstruct_inference", "VISIT-DEFSTRUCT-INFERENCE", 2, 0, false);
        declareFunction(myName, "visit_defstruct_object_inference_method", "VISIT-DEFSTRUCT-OBJECT-INFERENCE-METHOD", 2, 0, false);
        declareFunction(myName, "valid_inference_p", "VALID-INFERENCE-P", 1, 0, false);
        declareFunction(myName, "invalid_inference_p", "INVALID-INFERENCE-P", 1, 0, false);
        declareFunction(myName, "inference_invalid_p", "INFERENCE-INVALID-P", 1, 0, false);
        declareFunction(myName, "print_inference", "PRINT-INFERENCE", 3, 0, false);
        declareFunction(myName, "sxhash_inference_method", "SXHASH-INFERENCE-METHOD", 1, 0, false);
        new $sxhash_inference_method$UnaryFunction();
        declareFunction(myName, "new_inference_p", "NEW-INFERENCE-P", 1, 0, false);
        declareFunction(myName, "prepared_inference_p", "PREPARED-INFERENCE-P", 1, 0, false);
        declareFunction(myName, "ready_inference_p", "READY-INFERENCE-P", 1, 0, false);
        declareFunction(myName, "running_inference_p", "RUNNING-INFERENCE-P", 1, 0, false);
        declareFunction(myName, "suspended_inference_p", "SUSPENDED-INFERENCE-P", 1, 0, false);
        declareFunction(myName, "continuable_inference_p", "CONTINUABLE-INFERENCE-P", 1, 0, false);
        declareFunction(myName, "exhausted_inference_p", "EXHAUSTED-INFERENCE-P", 1, 0, false);
        declareMacro(me, "do_inference_relevant_problems", "DO-INFERENCE-RELEVANT-PROBLEMS");
        declareMacro(me, "do_inference_new_answer_justifications", "DO-INFERENCE-NEW-ANSWER-JUSTIFICATIONS");
        declareMacro(me, "do_inference_new_answers", "DO-INFERENCE-NEW-ANSWERS");
        declareMacro(me, "do_inference_answers", "DO-INFERENCE-ANSWERS");
        declareMacro(me, "do_inference_answers_from_index", "DO-INFERENCE-ANSWERS-FROM-INDEX");
        declareMacro(me, "do_inference_justifications", "DO-INFERENCE-JUSTIFICATIONS");
        declareMacro(me, "do_inference_interrupting_processes", "DO-INFERENCE-INTERRUPTING-PROCESSES");
        declareMacro(me, "do_inference_root_proofs", "DO-INFERENCE-ROOT-PROOFS");
        declareMacro(me, "do_inference_allowed_rules", "DO-INFERENCE-ALLOWED-RULES");
        declareMacro(me, "with_inference_problem_working_time_lock", "WITH-INFERENCE-PROBLEM-WORKING-TIME-LOCK");
        declareFunction(myName, "new_inference", "NEW-INFERENCE", 1, 0, false);
        declareFunction(myName, "new_tautological_inference", "NEW-TAUTOLOGICAL-INFERENCE", 1, 0, false);
        declareFunction(myName, "destroy_all_inferences", "DESTROY-ALL-INFERENCES", 0, 0, false);
        declareFunction(myName, "destroy_inference", "DESTROY-INFERENCE", 1, 0, false);
        declareFunction(myName, "destroy_inference_and_problem_store", "DESTROY-INFERENCE-AND-PROBLEM-STORE", 1, 0, false);
        declareFunction(myName, "destroy_problem_store_inference", "DESTROY-PROBLEM-STORE-INFERENCE", 1, 0, false);
        declareFunction(myName, "destroy_inference_int", "DESTROY-INFERENCE-INT", 1, 0, false);
        declareFunction(myName, "note_inference_invalid", "NOTE-INFERENCE-INVALID", 1, 0, false);
        declareFunction(myName, "inference_suid", "INFERENCE-SUID", 1, 0, false);
        declareFunction(myName, "inference_problem_store", "INFERENCE-PROBLEM-STORE", 1, 0, false);
        declareFunction(myName, "inference_forward_propagate", "INFERENCE-FORWARD-PROPAGATE", 1, 0, false);
        declareFunction(myName, "inference_input_mt", "INFERENCE-INPUT-MT", 1, 0, false);
        declareFunction(myName, "inference_input_el_query", "INFERENCE-INPUT-EL-QUERY", 1, 0, false);
        declareFunction(myName, "inference_input_non_explanatory_el_query", "INFERENCE-INPUT-NON-EXPLANATORY-EL-QUERY", 1, 0, false);
        declareFunction(myName, "inference_input_query_properties", "INFERENCE-INPUT-QUERY-PROPERTIES", 1, 0, false);
        declareFunction(myName, "inference_mt", "INFERENCE-MT", 1, 0, false);
        declareFunction(myName, "inference_el_query", "INFERENCE-EL-QUERY", 1, 0, false);
        declareFunction(myName, "inference_el_ist_query", "INFERENCE-EL-IST-QUERY", 1, 0, false);
        declareFunction(myName, "inference_el_bindings", "INFERENCE-EL-BINDINGS", 1, 0, false);
        declareFunction(myName, "inference_hl_query", "INFERENCE-HL-QUERY", 1, 0, false);
        declareFunction(myName, "inference_explanatory_subquery", "INFERENCE-EXPLANATORY-SUBQUERY", 1, 0, false);
        declareFunction(myName, "inference_non_explanatory_subquery", "INFERENCE-NON-EXPLANATORY-SUBQUERY", 1, 0, false);
        declareFunction(myName, "inference_free_hl_vars", "INFERENCE-FREE-HL-VARS", 1, 0, false);
        declareFunction(myName, "inference_hypothetical_bindings", "INFERENCE-HYPOTHETICAL-BINDINGS", 1, 0, false);
        declareFunction(myName, "inference_answer_id_index", "INFERENCE-ANSWER-ID-INDEX", 1, 0, false);
        declareFunction(myName, "inference_answer_bindings_index", "INFERENCE-ANSWER-BINDINGS-INDEX", 1, 0, false);
        declareFunction(myName, "inference_new_answer_id_start", "INFERENCE-NEW-ANSWER-ID-START", 1, 0, false);
        declareFunction(myName, "inference_new_answer_justifications", "INFERENCE-NEW-ANSWER-JUSTIFICATIONS", 1, 0, false);
        declareFunction(myName, "inference_status", "INFERENCE-STATUS", 1, 0, false);
        declareFunction(myName, "inference_suspend_status", "INFERENCE-SUSPEND-STATUS", 1, 0, false);
        declareFunction(myName, "inference_root_link", "INFERENCE-ROOT-LINK", 1, 0, false);
        declareFunction(myName, "inference_relevant_problems", "INFERENCE-RELEVANT-PROBLEMS", 1, 0, false);
        declareFunction(myName, "inference_strategy_set", "INFERENCE-STRATEGY-SET", 1, 0, false);
        declareFunction(myName, "inference_control_process", "INFERENCE-CONTROL-PROCESS", 1, 0, false);
        declareFunction(myName, "inference_interrupting_processes", "INFERENCE-INTERRUPTING-PROCESSES", 1, 0, false);
        declareFunction(myName, "inference_max_transformation_depth_reached", "INFERENCE-MAX-TRANSFORMATION-DEPTH-REACHED", 1, 0, false);
        declareFunction(myName, "inference_answer_language", "INFERENCE-ANSWER-LANGUAGE", 1, 0, false);
        declareFunction(myName, "inference_cache_resultsP", "INFERENCE-CACHE-RESULTS?", 1, 0, false);
        declareFunction(myName, "inference_blockingP", "INFERENCE-BLOCKING?", 1, 0, false);
        declareFunction(myName, "inference_disjunction_free_el_vars_policy", "INFERENCE-DISJUNCTION-FREE-EL-VARS-POLICY", 1, 0, false);
        declareFunction(myName, "inference_result_uniqueness_criterion", "INFERENCE-RESULT-UNIQUENESS-CRITERION", 1, 0, false);
        declareFunction(myName, "inference_allow_hl_predicate_transformationP", "INFERENCE-ALLOW-HL-PREDICATE-TRANSFORMATION?", 1, 0, false);
        declareFunction(myName, "inference_allow_unbound_predicate_transformationP", "INFERENCE-ALLOW-UNBOUND-PREDICATE-TRANSFORMATION?", 1, 0, false);
        declareFunction(myName, "inference_allow_evaluatable_predicate_transformationP", "INFERENCE-ALLOW-EVALUATABLE-PREDICATE-TRANSFORMATION?", 1, 0, false);
        declareFunction(myName, "inference_allow_indeterminate_resultsP", "INFERENCE-ALLOW-INDETERMINATE-RESULTS?", 1, 0, false);
        declareFunction(myName, "inference_allowed_rules", "INFERENCE-ALLOWED-RULES", 1, 0, false);
        declareFunction(myName, "inference_forbidden_rules", "INFERENCE-FORBIDDEN-RULES", 1, 0, false);
        declareFunction(myName, "inference_allowed_modules", "INFERENCE-ALLOWED-MODULES", 1, 0, false);
        declareFunction(myName, "inference_allow_abnormality_checkingP", "INFERENCE-ALLOW-ABNORMALITY-CHECKING?", 1, 0, false);
        declareFunction(myName, "inference_transitive_closure_mode", "INFERENCE-TRANSITIVE-CLOSURE-MODE", 1, 0, false);
        declareFunction(myName, "inference_problem_store_privateP", "INFERENCE-PROBLEM-STORE-PRIVATE?", 1, 0, false);
        declareFunction(myName, "inference_continuableP", "INFERENCE-CONTINUABLE?", 1, 0, false);
        declareFunction(myName, "inference_browsableP", "INFERENCE-BROWSABLE?", 1, 0, false);
        declareFunction(myName, "inference_return_type", "INFERENCE-RETURN-TYPE", 1, 0, false);
        declareFunction(myName, "inference_max_time", "INFERENCE-MAX-TIME", 1, 0, false);
        declareFunction(myName, "inference_max_step", "INFERENCE-MAX-STEP", 1, 0, false);
        declareFunction(myName, "inference_mode", "INFERENCE-MODE", 1, 0, false);
        declareFunction(myName, "inference_forward_max_time", "INFERENCE-FORWARD-MAX-TIME", 1, 0, false);
        declareFunction(myName, "inference_max_number", "INFERENCE-MAX-NUMBER", 1, 0, false);
        declareFunction(myName, "inference_max_proof_depth", "INFERENCE-MAX-PROOF-DEPTH", 1, 0, false);
        declareFunction(myName, "inference_max_transformation_depth", "INFERENCE-MAX-TRANSFORMATION-DEPTH", 1, 0, false);
        declareFunction(myName, "inference_min_rule_utility", "INFERENCE-MIN-RULE-UTILITY", 1, 0, false);
        declareFunction(myName, "inference_probably_approximately_done", "INFERENCE-PROBABLY-APPROXIMATELY-DONE", 1, 0, false);
        declareFunction(myName, "inference_metrics_template", "INFERENCE-METRICS-TEMPLATE", 1, 0, false);
        declareFunction(myName, "inference_start_universal_time", "INFERENCE-START-UNIVERSAL-TIME", 1, 0, false);
        declareFunction(myName, "inference_start_internal_real_time", "INFERENCE-START-INTERNAL-REAL-TIME", 1, 0, false);
        declareFunction(myName, "inference_end_internal_real_time", "INFERENCE-END-INTERNAL-REAL-TIME", 1, 0, false);
        declareFunction(myName, "inference_pad_internal_real_time", "INFERENCE-PAD-INTERNAL-REAL-TIME", 1, 0, false);
        declareFunction(myName, "inference_hypothesization_time", "INFERENCE-HYPOTHESIZATION-TIME", 1, 0, false);
        declareFunction(myName, "inference_cumulative_time", "INFERENCE-CUMULATIVE-TIME", 1, 0, false);
        declareFunction(myName, "inference_step_count", "INFERENCE-STEP-COUNT", 1, 0, false);
        declareFunction(myName, "inference_cumulative_step_count", "INFERENCE-CUMULATIVE-STEP-COUNT", 1, 0, false);
        declareFunction(myName, "inference_problem_working_time_data", "INFERENCE-PROBLEM-WORKING-TIME-DATA", 1, 0, false);
        declareFunction(myName, "inference_events", "INFERENCE-EVENTS", 1, 0, false);
        declareFunction(myName, "inference_accumulators", "INFERENCE-ACCUMULATORS", 1, 0, false);
        declareFunction(myName, "inference_proof_watermark", "INFERENCE-PROOF-WATERMARK", 1, 0, false);
        declareFunction(myName, "inference_type", "INFERENCE-TYPE", 1, 0, false);
        declareFunction(myName, "inference_data", "INFERENCE-DATA", 1, 0, false);
        declareFunction(myName, "inference_properties", "INFERENCE-PROPERTIES", 1, 0, false);
        declareFunction(myName, "set_inference_forward_propagate", "SET-INFERENCE-FORWARD-PROPAGATE", 2, 0, false);
        declareFunction(myName, "set_inference_input_mt", "SET-INFERENCE-INPUT-MT", 2, 0, false);
        declareFunction(myName, "set_inference_input_el_query", "SET-INFERENCE-INPUT-EL-QUERY", 2, 0, false);
        declareFunction(myName, "set_inference_input_non_explanatory_el_query", "SET-INFERENCE-INPUT-NON-EXPLANATORY-EL-QUERY", 2, 0, false);
        declareFunction(myName, "set_inference_input_query_properties", "SET-INFERENCE-INPUT-QUERY-PROPERTIES", 2, 0, false);
        declareFunction(myName, "set_inference_mt", "SET-INFERENCE-MT", 2, 0, false);
        declareFunction(myName, "set_inference_el_query", "SET-INFERENCE-EL-QUERY", 2, 0, false);
        declareFunction(myName, "set_inference_el_bindings", "SET-INFERENCE-EL-BINDINGS", 2, 0, false);
        declareFunction(myName, "set_inference_hl_query", "SET-INFERENCE-HL-QUERY", 2, 0, false);
        declareFunction(myName, "set_inference_explanatory_subquery", "SET-INFERENCE-EXPLANATORY-SUBQUERY", 2, 0, false);
        declareFunction(myName, "set_inference_non_explanatory_subquery", "SET-INFERENCE-NON-EXPLANATORY-SUBQUERY", 2, 0, false);
        declareFunction(myName, "set_inference_free_hl_vars", "SET-INFERENCE-FREE-HL-VARS", 2, 0, false);
        declareFunction(myName, "set_inference_hypothetical_bindings", "SET-INFERENCE-HYPOTHETICAL-BINDINGS", 2, 0, false);
        declareFunction(myName, "set_inference_status", "SET-INFERENCE-STATUS", 2, 0, false);
        declareFunction(myName, "set_inference_suspend_status", "SET-INFERENCE-SUSPEND-STATUS", 2, 0, false);
        declareFunction(myName, "set_inference_root_link", "SET-INFERENCE-ROOT-LINK", 2, 0, false);
        declareFunction(myName, "set_inference_control_process", "SET-INFERENCE-CONTROL-PROCESS", 2, 0, false);
        declareFunction(myName, "set_inference_max_transformation_depth_reached", "SET-INFERENCE-MAX-TRANSFORMATION-DEPTH-REACHED", 2, 0, false);
        declareFunction(myName, "set_inference_disjunction_free_el_vars_policy", "SET-INFERENCE-DISJUNCTION-FREE-EL-VARS-POLICY", 2, 0, false);
        declareFunction(myName, "set_inference_result_uniqueness_criterion", "SET-INFERENCE-RESULT-UNIQUENESS-CRITERION", 2, 0, false);
        declareFunction(myName, "set_inference_allow_hl_predicate_transformation", "SET-INFERENCE-ALLOW-HL-PREDICATE-TRANSFORMATION", 2, 0, false);
        declareFunction(myName, "set_inference_allow_unbound_predicate_transformation", "SET-INFERENCE-ALLOW-UNBOUND-PREDICATE-TRANSFORMATION", 2, 0, false);
        declareFunction(myName, "set_inference_allow_evaluatable_predicate_transformation", "SET-INFERENCE-ALLOW-EVALUATABLE-PREDICATE-TRANSFORMATION", 2, 0, false);
        declareFunction(myName, "set_inference_allow_indeterminate_results", "SET-INFERENCE-ALLOW-INDETERMINATE-RESULTS", 2, 0, false);
        declareFunction(myName, "set_inference_allowed_rules", "SET-INFERENCE-ALLOWED-RULES", 2, 0, false);
        declareFunction(myName, "set_inference_forbidden_rules", "SET-INFERENCE-FORBIDDEN-RULES", 2, 0, false);
        declareFunction(myName, "set_inference_allowed_modules", "SET-INFERENCE-ALLOWED-MODULES", 2, 0, false);
        declareFunction(myName, "set_inference_allow_abnormality_checking", "SET-INFERENCE-ALLOW-ABNORMALITY-CHECKING", 2, 0, false);
        declareFunction(myName, "set_inference_transitive_closure_mode", "SET-INFERENCE-TRANSITIVE-CLOSURE-MODE", 2, 0, false);
        declareFunction(myName, "set_inference_problem_store_private", "SET-INFERENCE-PROBLEM-STORE-PRIVATE", 2, 0, false);
        declareFunction(myName, "set_inference_continuable", "SET-INFERENCE-CONTINUABLE", 2, 0, false);
        declareFunction(myName, "set_inference_browsable", "SET-INFERENCE-BROWSABLE", 2, 0, false);
        declareFunction(myName, "set_inference_return_type", "SET-INFERENCE-RETURN-TYPE", 2, 0, false);
        declareFunction(myName, "set_inference_answer_language", "SET-INFERENCE-ANSWER-LANGUAGE", 2, 0, false);
        declareFunction(myName, "set_inference_cache_results", "SET-INFERENCE-CACHE-RESULTS", 2, 0, false);
        declareFunction(myName, "note_inference_blocking", "NOTE-INFERENCE-BLOCKING", 1, 0, false);
        declareFunction(myName, "clear_inference_blocking", "CLEAR-INFERENCE-BLOCKING", 1, 0, false);
        declareFunction(myName, "set_inference_max_number", "SET-INFERENCE-MAX-NUMBER", 2, 0, false);
        declareFunction(myName, "set_inference_max_time", "SET-INFERENCE-MAX-TIME", 2, 0, false);
        declareFunction(myName, "set_inference_max_step", "SET-INFERENCE-MAX-STEP", 2, 0, false);
        declareFunction(myName, "set_inference_mode", "SET-INFERENCE-MODE", 2, 0, false);
        declareFunction(myName, "set_inference_forward_max_time", "SET-INFERENCE-FORWARD-MAX-TIME", 2, 0, false);
        declareFunction(myName, "set_inference_max_proof_depth", "SET-INFERENCE-MAX-PROOF-DEPTH", 2, 0, false);
        declareFunction(myName, "set_inference_max_transformation_depth", "SET-INFERENCE-MAX-TRANSFORMATION-DEPTH", 2, 0, false);
        declareFunction(myName, "set_inference_min_rule_utility", "SET-INFERENCE-MIN-RULE-UTILITY", 2, 0, false);
        declareFunction(myName, "set_inference_probably_approximately_done", "SET-INFERENCE-PROBABLY-APPROXIMATELY-DONE", 2, 0, false);
        declareFunction(myName, "set_inference_metrics_template", "SET-INFERENCE-METRICS-TEMPLATE", 2, 0, false);
        declareFunction(myName, "set_inference_start_universal_time", "SET-INFERENCE-START-UNIVERSAL-TIME", 2, 0, false);
        declareFunction(myName, "set_inference_start_internal_real_time", "SET-INFERENCE-START-INTERNAL-REAL-TIME", 2, 0, false);
        declareFunction(myName, "set_inference_end_internal_real_time", "SET-INFERENCE-END-INTERNAL-REAL-TIME", 2, 0, false);
        declareFunction(myName, "set_inference_pad_internal_real_time", "SET-INFERENCE-PAD-INTERNAL-REAL-TIME", 2, 0, false);
        declareFunction(myName, "set_inference_hypothesization_time", "SET-INFERENCE-HYPOTHESIZATION-TIME", 2, 0, false);
        declareFunction(myName, "set_inference_cumulative_time", "SET-INFERENCE-CUMULATIVE-TIME", 2, 0, false);
        declareFunction(myName, "set_inference_step_count", "SET-INFERENCE-STEP-COUNT", 2, 0, false);
        declareFunction(myName, "increment_inference_step_count", "INCREMENT-INFERENCE-STEP-COUNT", 1, 0, false);
        declareFunction(myName, "set_inference_cumulative_step_count", "SET-INFERENCE-CUMULATIVE-STEP-COUNT", 2, 0, false);
        declareFunction(myName, "increment_inference_cumulative_step_count", "INCREMENT-INFERENCE-CUMULATIVE-STEP-COUNT", 1, 0, false);
        declareFunction(myName, "set_inference_problem_working_time_data", "SET-INFERENCE-PROBLEM-WORKING-TIME-DATA", 2, 0, false);
        declareFunction(myName, "set_inference_events", "SET-INFERENCE-EVENTS", 2, 0, false);
        declareFunction(myName, "set_inference_halt_conditions", "SET-INFERENCE-HALT-CONDITIONS", 2, 0, false);
        declareFunction(myName, "set_inference_type", "SET-INFERENCE-TYPE", 2, 0, false);
        declareFunction(myName, "set_inference_data", "SET-INFERENCE-DATA", 2, 0, false);
        declareFunction(myName, "set_inference_properties", "SET-INFERENCE-PROPERTIES", 2, 0, false);
        declareFunction(myName, "set_inference_property", "SET-INFERENCE-PROPERTY", 3, 0, false);
        declareFunction(myName, "push_inference_property", "PUSH-INFERENCE-PROPERTY", 3, 0, false);
        declareFunction(myName, "inference_ids", "INFERENCE-IDS", 1, 0, false);
        declareMacro(me, "with_inference_ids", "WITH-INFERENCE-IDS");
        declareFunction(myName, "inference_problem_store_suid", "INFERENCE-PROBLEM-STORE-SUID", 1, 0, false);
        declareFunction(myName, "all_inferences", "ALL-INFERENCES", 0, 0, false);
        declareFunction(myName, "all_successful_inferences", "ALL-SUCCESSFUL-INFERENCES", 0, 0, false);
        declareFunction(myName, "inference_strategies", "INFERENCE-STRATEGIES", 1, 0, false);
        declareFunction(myName, "inference_hl_mts", "INFERENCE-HL-MTS", 1, 0, false);
        declareFunction(myName, "inference_first_hl_query_mt", "INFERENCE-FIRST-HL-QUERY-MT", 1, 0, false);
        declareFunction(myName, "inference_no_free_hl_varsP", "INFERENCE-NO-FREE-HL-VARS?", 1, 0, false);
        declareFunction(myName, "inference_free_el_vars", "INFERENCE-FREE-EL-VARS", 1, 0, false);
        declareFunction(myName, "inference_input_query_property", "INFERENCE-INPUT-QUERY-PROPERTY", 2, 1, false);
        declareFunction(myName, "inference_to_new_cyc_query_arguments", "INFERENCE-TO-NEW-CYC-QUERY-ARGUMENTS", 1, 0, false);
        declareFunction(myName, "inference_to_new_cyc_query_form", "INFERENCE-TO-NEW-CYC-QUERY-FORM", 1, 0, false);
        declareFunction(myName, "inference_to_new_cyc_query_form_string", "INFERENCE-TO-NEW-CYC-QUERY-FORM-STRING", 1, 0, false);
        declareFunction(myName, "inference_args_to_new_cyc_query_form_string", "INFERENCE-ARGS-TO-NEW-CYC-QUERY-FORM-STRING", 3, 0, false);
        declareFunction(myName, "inference_root_mapped_problem", "INFERENCE-ROOT-MAPPED-PROBLEM", 1, 0, false);
        declareFunction(myName, "inference_root_problem", "INFERENCE-ROOT-PROBLEM", 1, 0, false);
        declareFunction(myName, "inference_unique_wrt_proofsP", "INFERENCE-UNIQUE-WRT-PROOFS?", 1, 0, false);
        declareFunction(myName, "inference_unique_wrt_bindingsP", "INFERENCE-UNIQUE-WRT-BINDINGS?", 1, 0, false);
        declareFunction(myName, "inference_compute_answer_justificationsP", "INFERENCE-COMPUTE-ANSWER-JUSTIFICATIONS?", 1, 0, false);
        declareFunction(myName, "inference_computes_metricsP", "INFERENCE-COMPUTES-METRICS?", 1, 0, false);
        declareFunction(myName, "inference_computes_metricP", "INFERENCE-COMPUTES-METRIC?", 2, 0, false);
        declareFunction(myName, "inference_problem_store_private_wrt_dynamic_propertiesP", "INFERENCE-PROBLEM-STORE-PRIVATE-WRT-DYNAMIC-PROPERTIES?", 1, 0, false);
        declareFunction(myName, "inference_dynamic_properties_exhaustiveP", "INFERENCE-DYNAMIC-PROPERTIES-EXHAUSTIVE?", 1, 0, false);
        declareFunction(myName, "inference_allows_use_of_all_rulesP", "INFERENCE-ALLOWS-USE-OF-ALL-RULES?", 1, 0, false);
        declareFunction(myName, "inference_allows_use_of_ruleP", "INFERENCE-ALLOWS-USE-OF-RULE?", 2, 0, false);
        declareFunction(myName, "inference_filter_rules", "INFERENCE-FILTER-RULES", 2, 0, false);
        declareFunction(myName, "inference_allows_use_of_all_modulesP", "INFERENCE-ALLOWS-USE-OF-ALL-MODULES?", 1, 0, false);
        declareFunction(myName, "inference_allows_use_of_moduleP", "INFERENCE-ALLOWS-USE-OF-MODULE?", 2, 0, false);
        declareFunction(myName, "inference_forget_extra_resultsP", "INFERENCE-FORGET-EXTRA-RESULTS?", 1, 0, false);
        declareFunction(myName, "inference_has_some_answerP", "INFERENCE-HAS-SOME-ANSWER?", 1, 0, false);
        declareFunction(myName, "find_inference_answer_by_id", "FIND-INFERENCE-ANSWER-BY-ID", 2, 0, false);
        declareFunction(myName, "find_inference_answer_by_ids", "FIND-INFERENCE-ANSWER-BY-IDS", 3, 0, false);
        declareFunction(myName, "inference_answer_signature", "INFERENCE-ANSWER-SIGNATURE", 1, 0, false);
        declareFunction(myName, "find_inference_answer_from_signature", "FIND-INFERENCE-ANSWER-FROM-SIGNATURE", 1, 0, false);
        declareFunction(myName, "inference_first_answer", "INFERENCE-FIRST-ANSWER", 1, 0, false);
        declareFunction(myName, "inference_last_answer", "INFERENCE-LAST-ANSWER", 1, 0, false);
        declareFunction(myName, "inference_first_answer_with_id_or_greater", "INFERENCE-FIRST-ANSWER-WITH-ID-OR-GREATER", 2, 0, false);
        declareFunction(myName, "inference_first_answer_elapsed_time", "INFERENCE-FIRST-ANSWER-ELAPSED-TIME", 1, 0, false);
        declareFunction(myName, "inference_first_answer_step_count", "INFERENCE-FIRST-ANSWER-STEP-COUNT", 1, 0, false);
        declareFunction(myName, "inference_last_answer_elapsed_time", "INFERENCE-LAST-ANSWER-ELAPSED-TIME", 1, 0, false);
        declareFunction(myName, "inference_last_answer_step_count", "INFERENCE-LAST-ANSWER-STEP-COUNT", 1, 0, false);
        declareFunction(myName, "inference_last_answer_id", "INFERENCE-LAST-ANSWER-ID", 1, 0, false);
        declareFunction(myName, "inference_answer_count_at_elapsed_time", "INFERENCE-ANSWER-COUNT-AT-ELAPSED-TIME", 2, 0, false);
        declareFunction(myName, "inference_answer_count_at_30_seconds", "INFERENCE-ANSWER-COUNT-AT-30-SECONDS", 1, 0, false);
        declareFunction(myName, "inference_answer_count_at_60_seconds", "INFERENCE-ANSWER-COUNT-AT-60-SECONDS", 1, 0, false);
        declareFunction(myName, "inference_answer_times", "INFERENCE-ANSWER-TIMES", 1, 0, false);
        declareFunction(myName, "inference_answer_step_counts", "INFERENCE-ANSWER-STEP-COUNTS", 1, 0, false);
        declareFunction(myName, "inference_new_root_metrics", "INFERENCE-NEW-ROOT-METRICS", 1, 0, false);
        declareFunction(myName, "inference_end_universal_time", "INFERENCE-END-UNIVERSAL-TIME", 1, 0, false);
        declareFunction(myName, "inference_maintain_term_working_setP", "INFERENCE-MAINTAIN-TERM-WORKING-SET?", 1, 0, false);
        declareFunction(myName, "inference_halt_condition_presentP", "INFERENCE-HALT-CONDITION-PRESENT?", 2, 0, false);
        declareFunction(myName, "add_inference_accumulator", "ADD-INFERENCE-ACCUMULATOR", 3, 0, false);
        declareFunction(myName, "inference_accumulator", "INFERENCE-ACCUMULATOR", 2, 0, false);
        declareFunction(myName, "inference_accumulator_contents", "INFERENCE-ACCUMULATOR-CONTENTS", 2, 0, false);
        declareFunction(myName, "inference_accumulate", "INFERENCE-ACCUMULATE", 3, 0, false);
        declareFunction(myName, "set_inference_proof_watermark", "SET-INFERENCE-PROOF-WATERMARK", 2, 0, false);
        declareFunction(myName, "compute_inference_pad_internal_real_time", "COMPUTE-INFERENCE-PAD-INTERNAL-REAL-TIME", 1, 0, false);
        declareFunction(myName, "initialize_pad_table", "INITIALIZE-PAD-TABLE", 1, 0, false);
        declareFunction(myName, "pad_table_initializedP", "PAD-TABLE-INITIALIZED?", 0, 0, false);
        declareFunction(myName, "probably_approximately_done_cutoff_time", "PROBABLY-APPROXIMATELY-DONE-CUTOFF-TIME", 1, 0, false);
        declareFunction(myName, "compute_pad_from_time", "COMPUTE-PAD-FROM-TIME", 1, 0, false);
        declareFunction(myName, "inference_note_transformation_depth", "INFERENCE-NOTE-TRANSFORMATION-DEPTH", 2, 0, false);
        declareFunction(myName, "inference_note_new_transformation_depth_reached", "INFERENCE-NOTE-NEW-TRANSFORMATION-DEPTH-REACHED", 2, 0, false);
        declareFunction(myName, "find_inference_answer_by_bindings", "FIND-INFERENCE-ANSWER-BY-BINDINGS", 2, 0, false);
        declareFunction(myName, "new_inference_answer_id", "NEW-INFERENCE-ANSWER-ID", 1, 0, false);
        declareFunction(myName, "inference_count", "INFERENCE-COUNT", 0, 0, false);
        declareFunction(myName, "inference_all_answers", "INFERENCE-ALL-ANSWERS", 1, 1, false);
        declareFunction(myName, "inference_all_new_answers", "INFERENCE-ALL-NEW-ANSWERS", 1, 0, false);
        declareFunction(myName, "inference_allowed_rules_list", "INFERENCE-ALLOWED-RULES-LIST", 1, 0, false);
        declareFunction(myName, "inference_allowed_rule_count", "INFERENCE-ALLOWED-RULE-COUNT", 1, 0, false);
        declareFunction(myName, "inference_forbidden_rules_list", "INFERENCE-FORBIDDEN-RULES-LIST", 1, 0, false);
        declareFunction(myName, "inference_forbidden_rule_count", "INFERENCE-FORBIDDEN-RULE-COUNT", 1, 0, false);
        declareFunction(myName, "inference_interrupt_signaledP", "INFERENCE-INTERRUPT-SIGNALED?", 1, 0, false);
        declareFunction(myName, "inference_no_interrupt_signaledP", "INFERENCE-NO-INTERRUPT-SIGNALED?", 1, 0, false);
        declareFunction(myName, "inference_interrupt_handledP", "INFERENCE-INTERRUPT-HANDLED?", 1, 0, false);
        declareFunction(myName, "inference_answer_count", "INFERENCE-ANSWER-COUNT", 1, 0, false);
        declareFunction(myName, "inference_new_answer_count", "INFERENCE-NEW-ANSWER-COUNT", 1, 0, false);
        declareFunction(myName, "successful_inference_p", "SUCCESSFUL-INFERENCE-P", 1, 0, false);
        declareFunction(myName, "inference_new_justification_count", "INFERENCE-NEW-JUSTIFICATION-COUNT", 1, 0, false);
        declareFunction(myName, "inference_new_result_count", "INFERENCE-NEW-RESULT-COUNT", 1, 0, false);
        declareFunction(myName, "forward_inference_p", "FORWARD-INFERENCE-P", 1, 0, false);
        declareFunction(myName, "backward_inference_p", "BACKWARD-INFERENCE-P", 1, 0, false);
        declareFunction(myName, "abductive_inference_p", "ABDUCTIVE-INFERENCE-P", 1, 0, false);
        declareFunction(myName, "inference_provability_status", "INFERENCE-PROVABILITY-STATUS", 1, 0, false);
        declareFunction(myName, "good_inference_p", "GOOD-INFERENCE-P", 1, 0, false);
        declareFunction(myName, "neutral_inference_p", "NEUTRAL-INFERENCE-P", 1, 0, false);
        declareFunction(myName, "no_good_inference_p", "NO-GOOD-INFERENCE-P", 1, 0, false);
        declareFunction(myName, "closed_inference_p", "CLOSED-INFERENCE-P", 1, 0, false);
        declareFunction(myName, "inference_set_static_properties", "INFERENCE-SET-STATIC-PROPERTIES", 2, 0, false);
        declareFunction(myName, "update_inference_input_query_properties", "UPDATE-INFERENCE-INPUT-QUERY-PROPERTIES", 2, 0, false);
        declareFunction(myName, "add_inference_relevant_problem", "ADD-INFERENCE-RELEVANT-PROBLEM", 2, 0, false);
        declareFunction(myName, "remove_inference_relevant_problem", "REMOVE-INFERENCE-RELEVANT-PROBLEM", 2, 0, false);
        declareFunction(myName, "clear_inference_relevant_problems", "CLEAR-INFERENCE-RELEVANT-PROBLEMS", 1, 0, false);
        declareFunction(myName, "add_inference_strategy", "ADD-INFERENCE-STRATEGY", 2, 0, false);
        declareFunction(myName, "remove_inference_strategy", "REMOVE-INFERENCE-STRATEGY", 2, 0, false);
        declareFunction(myName, "clear_inference_strategy_set", "CLEAR-INFERENCE-STRATEGY-SET", 1, 0, false);
        declareFunction(myName, "reset_inference_new_answer_id", "RESET-INFERENCE-NEW-ANSWER-ID", 1, 0, false);
        declareFunction(myName, "inference_next_new_answer_id", "INFERENCE-NEXT-NEW-ANSWER-ID", 1, 0, false);
        declareFunction(myName, "add_inference_new_answer_by_id", "ADD-INFERENCE-NEW-ANSWER-BY-ID", 2, 0, false);
        declareFunction(myName, "remove_inference_new_answer_by_id", "REMOVE-INFERENCE-NEW-ANSWER-BY-ID", 2, 0, false);
        declareFunction(myName, "add_inference_new_answer_by_bindings", "ADD-INFERENCE-NEW-ANSWER-BY-BINDINGS", 2, 0, false);
        declareFunction(myName, "remove_inference_new_answer_by_bindings", "REMOVE-INFERENCE-NEW-ANSWER-BY-BINDINGS", 2, 0, false);
        declareFunction(myName, "reset_inference_new_answer_justifications", "RESET-INFERENCE-NEW-ANSWER-JUSTIFICATIONS", 1, 0, false);
        declareFunction(myName, "add_inference_new_answer_justification", "ADD-INFERENCE-NEW-ANSWER-JUSTIFICATION", 2, 0, false);
        declareFunction(myName, "remove_inference_new_answer_justification", "REMOVE-INFERENCE-NEW-ANSWER-JUSTIFICATION", 2, 0, false);
        declareFunction(myName, "clear_inference_control_process", "CLEAR-INFERENCE-CONTROL-PROCESS", 1, 0, false);
        declareFunction(myName, "set_inference_control_process_to_me", "SET-INFERENCE-CONTROL-PROCESS-TO-ME", 1, 0, false);
        declareFunction(myName, "note_inference_interrupt_signaled", "NOTE-INFERENCE-INTERRUPT-SIGNALED", 2, 0, false);
        declareFunction(myName, "increment_inference_cumulative_time", "INCREMENT-INFERENCE-CUMULATIVE-TIME", 2, 0, false);
        declareFunction(myName, "reorder_inference_free_hl_vars", "REORDER-INFERENCE-FREE-HL-VARS", 2, 0, false);
        declareFunction(myName, "reorder_inference_free_el_vars", "REORDER-INFERENCE-FREE-EL-VARS", 2, 0, false);
        declareFunction(myName, "reset_inference_new_answers", "RESET-INFERENCE-NEW-ANSWERS", 1, 0, false);
        declareFunction(myName, "add_inference_new_answer", "ADD-INFERENCE-NEW-ANSWER", 2, 0, false);
        declareFunction(myName, "remove_inference_new_answer", "REMOVE-INFERENCE-NEW-ANSWER", 2, 0, false);
        declareFunction(myName, "initialize_inference_time_properties", "INITIALIZE-INFERENCE-TIME-PROPERTIES", 1, 0, false);
        declareFunction(myName, "finalize_inference_time_properties", "FINALIZE-INFERENCE-TIME-PROPERTIES", 1, 0, false);
        declareFunction(myName, "inference_elapsed_internal_real_time_since_start", "INFERENCE-ELAPSED-INTERNAL-REAL-TIME-SINCE-START", 1, 0, false);
        declareFunction(myName, "inference_elapsed_universal_time_since_start", "INFERENCE-ELAPSED-UNIVERSAL-TIME-SINCE-START", 1, 0, false);
        declareFunction(myName, "inference_time_so_far", "INFERENCE-TIME-SO-FAR", 1, 1, false);
        declareFunction(myName, "inference_remaining_time", "INFERENCE-REMAINING-TIME", 1, 1, false);
        declareFunction(myName, "inference_cumulative_time_so_far", "INFERENCE-CUMULATIVE-TIME-SO-FAR", 1, 1, false);
        declareFunction(myName, "inference_signal_interrupt", "INFERENCE-SIGNAL-INTERRUPT", 1, 0, false);
        declareFunction(myName, "inference_handle_interrupts", "INFERENCE-HANDLE-INTERRUPTS", 1, 0, false);
        declareFunction(myName, "simplest_inference_p", "SIMPLEST-INFERENCE-P", 1, 0, false);
        declareFunction(myName, "new_simplest_inference", "NEW-SIMPLEST-INFERENCE", 1, 0, false);
        declareFunction(myName, "simplest_inference_strategy", "SIMPLEST-INFERENCE-STRATEGY", 1, 0, false);
        declareFunction(myName, "set_simplest_inference_strategy", "SET-SIMPLEST-INFERENCE-STRATEGY", 2, 0, false);
        declareFunction(myName, "new_simplest_inference_of_type", "NEW-SIMPLEST-INFERENCE-OF-TYPE", 2, 0, false);
        declareFunction(myName, "new_simplest_inference_with_new_store", "NEW-SIMPLEST-INFERENCE-WITH-NEW-STORE", 1, 0, false);
        declareFunction(myName, "inference_answer_print_function_trampoline", "INFERENCE-ANSWER-PRINT-FUNCTION-TRAMPOLINE", 2, 0, false);
        declareFunction(myName, "inference_answer_p", "INFERENCE-ANSWER-P", 1, 0, false);
        new $inference_answer_p$UnaryFunction();
        declareFunction(myName, "inf_answer_suid", "INF-ANSWER-SUID", 1, 0, false);
        declareFunction(myName, "inf_answer_inference", "INF-ANSWER-INFERENCE", 1, 0, false);
        declareFunction(myName, "inf_answer_bindings", "INF-ANSWER-BINDINGS", 1, 0, false);
        declareFunction(myName, "inf_answer_justifications", "INF-ANSWER-JUSTIFICATIONS", 1, 0, false);
        declareFunction(myName, "inf_answer_elapsed_creation_time", "INF-ANSWER-ELAPSED-CREATION-TIME", 1, 0, false);
        declareFunction(myName, "inf_answer_step_count", "INF-ANSWER-STEP-COUNT", 1, 0, false);
        declareFunction(myName, "_csetf_inf_answer_suid", "_CSETF-INF-ANSWER-SUID", 2, 0, false);
        declareFunction(myName, "_csetf_inf_answer_inference", "_CSETF-INF-ANSWER-INFERENCE", 2, 0, false);
        declareFunction(myName, "_csetf_inf_answer_bindings", "_CSETF-INF-ANSWER-BINDINGS", 2, 0, false);
        declareFunction(myName, "_csetf_inf_answer_justifications", "_CSETF-INF-ANSWER-JUSTIFICATIONS", 2, 0, false);
        declareFunction(myName, "_csetf_inf_answer_elapsed_creation_time", "_CSETF-INF-ANSWER-ELAPSED-CREATION-TIME", 2, 0, false);
        declareFunction(myName, "_csetf_inf_answer_step_count", "_CSETF-INF-ANSWER-STEP-COUNT", 2, 0, false);
        declareFunction(myName, "make_inference_answer", "MAKE-INFERENCE-ANSWER", 0, 1, false);
        declareFunction(myName, "visit_defstruct_inference_answer", "VISIT-DEFSTRUCT-INFERENCE-ANSWER", 2, 0, false);
        declareFunction(myName, "visit_defstruct_object_inference_answer_method", "VISIT-DEFSTRUCT-OBJECT-INFERENCE-ANSWER-METHOD", 2, 0, false);
        declareFunction(myName, "valid_inference_answer_p", "VALID-INFERENCE-ANSWER-P", 1, 0, false);
        declareFunction(myName, "inference_answer_invalid_p", "INFERENCE-ANSWER-INVALID-P", 1, 0, false);
        declareFunction(myName, "print_inference_answer", "PRINT-INFERENCE-ANSWER", 3, 0, false);
        declareFunction(myName, "sxhash_inference_answer_method", "SXHASH-INFERENCE-ANSWER-METHOD", 1, 0, false);
        declareFunction(myName, "new_inference_answer", "NEW-INFERENCE-ANSWER", 2, 0, false);
        declareFunction(myName, "find_or_create_inference_answer", "FIND-OR-CREATE-INFERENCE-ANSWER", 2, 0, false);
        declareMacro(me, "do_inference_answer_justifications", "DO-INFERENCE-ANSWER-JUSTIFICATIONS");
        declareMacro(me, "do_inference_answer_justifications_numbered", "DO-INFERENCE-ANSWER-JUSTIFICATIONS-NUMBERED");
        declareFunction(myName, "destroy_inference_answer", "DESTROY-INFERENCE-ANSWER", 1, 0, false);
        declareFunction(myName, "destroy_inference_answer_int", "DESTROY-INFERENCE-ANSWER-INT", 1, 0, false);
        declareFunction(myName, "note_inference_answer_invalid", "NOTE-INFERENCE-ANSWER-INVALID", 1, 0, false);
        declareFunction(myName, "inference_answer_suid", "INFERENCE-ANSWER-SUID", 1, 0, false);
        declareFunction(myName, "inference_answer_inference", "INFERENCE-ANSWER-INFERENCE", 1, 0, false);
        declareFunction(myName, "inference_answer_bindings", "INFERENCE-ANSWER-BINDINGS", 1, 0, false);
        declareFunction(myName, "inference_answer_justifications", "INFERENCE-ANSWER-JUSTIFICATIONS", 1, 0, false);
        declareFunction(myName, "inference_answer_elapsed_creation_time", "INFERENCE-ANSWER-ELAPSED-CREATION-TIME", 1, 0, false);
        declareFunction(myName, "inference_answer_step_count", "INFERENCE-ANSWER-STEP-COUNT", 1, 0, false);
        declareFunction(myName, "set_inference_answer_bindings", "SET-INFERENCE-ANSWER-BINDINGS", 2, 0, false);
        declareFunction(myName, "set_inference_answer_elapsed_creation_time", "SET-INFERENCE-ANSWER-ELAPSED-CREATION-TIME", 2, 0, false);
        declareFunction(myName, "set_inference_answer_step_count", "SET-INFERENCE-ANSWER-STEP-COUNT", 2, 0, false);
        declareFunction(myName, "inference_answer_problem_store", "INFERENCE-ANSWER-PROBLEM-STORE", 1, 0, false);
        declareFunction(myName, "inference_answer_free_el_vars", "INFERENCE-ANSWER-FREE-EL-VARS", 1, 0, false);
        declareFunction(myName, "inference_answer_elapsed_time", "INFERENCE-ANSWER-ELAPSED-TIME", 1, 1, false);
        declareFunction(myName, "inference_answer_creation_time", "INFERENCE-ANSWER-CREATION-TIME", 1, 0, false);
        declareFunction(myName, "find_inference_answer_justification", "FIND-INFERENCE-ANSWER-JUSTIFICATION", 2, 0, false);
        declareFunction(myName, "inference_answer_result_bindings", "INFERENCE-ANSWER-RESULT-BINDINGS", 1, 0, false);
        declareFunction(myName, "inference_answer_bindings_equalP", "INFERENCE-ANSWER-BINDINGS-EQUAL?", 2, 0, false);
        declareFunction(myName, "inference_answer_newP", "INFERENCE-ANSWER-NEW?", 1, 0, false);
        declareFunction(myName, "inference_answer_L", "INFERENCE-ANSWER-<", 2, 0, false);
        declareFunction(myName, "inference_answer_el_sentence", "INFERENCE-ANSWER-EL-SENTENCE", 1, 0, false);
        declareFunction(myName, "inference_answer_justification_count", "INFERENCE-ANSWER-JUSTIFICATION-COUNT", 1, 0, false);
        declareFunction(myName, "add_inference_answer_justification", "ADD-INFERENCE-ANSWER-JUSTIFICATION", 2, 0, false);
        declareFunction(myName, "remove_inference_answer_justification", "REMOVE-INFERENCE-ANSWER-JUSTIFICATION", 2, 0, false);
        declareFunction(myName, "initialize_inference_answer_elapsed_creation_time", "INITIALIZE-INFERENCE-ANSWER-ELAPSED-CREATION-TIME", 1, 0, false);
        declareFunction(myName, "inference_answer_justification_print_function_trampoline", "INFERENCE-ANSWER-JUSTIFICATION-PRINT-FUNCTION-TRAMPOLINE", 2, 0, false);
        declareFunction(myName, "inference_answer_justification_p", "INFERENCE-ANSWER-JUSTIFICATION-P", 1, 0, false);
        new $inference_answer_justification_p$UnaryFunction();
        declareFunction(myName, "inf_ans_just_answer", "INF-ANS-JUST-ANSWER", 1, 0, false);
        declareFunction(myName, "inf_ans_just_supports", "INF-ANS-JUST-SUPPORTS", 1, 0, false);
        declareFunction(myName, "inf_ans_just_pragma_supports", "INF-ANS-JUST-PRAGMA-SUPPORTS", 1, 0, false);
        declareFunction(myName, "inf_ans_just_proofs", "INF-ANS-JUST-PROOFS", 1, 0, false);
        declareFunction(myName, "_csetf_inf_ans_just_answer", "_CSETF-INF-ANS-JUST-ANSWER", 2, 0, false);
        declareFunction(myName, "_csetf_inf_ans_just_supports", "_CSETF-INF-ANS-JUST-SUPPORTS", 2, 0, false);
        declareFunction(myName, "_csetf_inf_ans_just_pragma_supports", "_CSETF-INF-ANS-JUST-PRAGMA-SUPPORTS", 2, 0, false);
        declareFunction(myName, "_csetf_inf_ans_just_proofs", "_CSETF-INF-ANS-JUST-PROOFS", 2, 0, false);
        declareFunction(myName, "make_inference_answer_justification", "MAKE-INFERENCE-ANSWER-JUSTIFICATION", 0, 1, false);
        declareFunction(myName, "visit_defstruct_inference_answer_justification", "VISIT-DEFSTRUCT-INFERENCE-ANSWER-JUSTIFICATION", 2, 0, false);
        declareFunction(myName, "visit_defstruct_object_inference_answer_justification_method", "VISIT-DEFSTRUCT-OBJECT-INFERENCE-ANSWER-JUSTIFICATION-METHOD", 2, 0, false);
        declareFunction(myName, "valid_inference_answer_justification_p", "VALID-INFERENCE-ANSWER-JUSTIFICATION-P", 1, 0, false);
        declareFunction(myName, "inference_answer_justification_invalid_p", "INFERENCE-ANSWER-JUSTIFICATION-INVALID-P", 1, 0, false);
        declareFunction(myName, "print_inference_answer_justification", "PRINT-INFERENCE-ANSWER-JUSTIFICATION", 3, 0, false);
        declareFunction(myName, "sxhash_inference_answer_justification_method", "SXHASH-INFERENCE-ANSWER-JUSTIFICATION-METHOD", 1, 0, false);
        declareFunction(myName, "list_of_inference_answer_justification_p", "LIST-OF-INFERENCE-ANSWER-JUSTIFICATION-P", 1, 0, false);
        declareFunction(myName, "new_inference_answer_justification", "NEW-INFERENCE-ANSWER-JUSTIFICATION", 3, 0, false);
        declareFunction(myName, "find_or_create_inference_answer_justification", "FIND-OR-CREATE-INFERENCE-ANSWER-JUSTIFICATION", 4, 0, false);
        declareFunction(myName, "subst_indexical_referents_into_answer_bindings", "SUBST-INDEXICAL-REFERENTS-INTO-ANSWER-BINDINGS", 2, 0, false);
        declareFunction(myName, "destroy_inference_answer_justification", "DESTROY-INFERENCE-ANSWER-JUSTIFICATION", 1, 0, false);
        declareFunction(myName, "destroy_inference_answer_justification_int", "DESTROY-INFERENCE-ANSWER-JUSTIFICATION-INT", 1, 0, false);
        declareFunction(myName, "note_inference_answer_justification_invalid", "NOTE-INFERENCE-ANSWER-JUSTIFICATION-INVALID", 1, 0, false);
        declareFunction(myName, "inference_answer_justification_answer", "INFERENCE-ANSWER-JUSTIFICATION-ANSWER", 1, 0, false);
        declareFunction(myName, "inference_answer_justification_supports", "INFERENCE-ANSWER-JUSTIFICATION-SUPPORTS", 1, 0, false);
        new $inference_answer_justification_supports$UnaryFunction();
        declareFunction(myName, "inference_answer_justification_pragmatic_supports", "INFERENCE-ANSWER-JUSTIFICATION-PRAGMATIC-SUPPORTS", 1, 0, false);
        declareFunction(myName, "inference_answer_justification_proofs", "INFERENCE-ANSWER-JUSTIFICATION-PROOFS", 1, 0, false);
        declareMacro(me, "do_inference_answer_justification_proofs", "DO-INFERENCE-ANSWER-JUSTIFICATION-PROOFS");
        declareMacro(me, "do_proof_dependent_inference_answer_justifications", "DO-PROOF-DEPENDENT-INFERENCE-ANSWER-JUSTIFICATIONS");
        declareMacro(me, "do_inference_all_subproofs", "DO-INFERENCE-ALL-SUBPROOFS");
        declareFunction(myName, "inference_answer_first_justification", "INFERENCE-ANSWER-FIRST-JUSTIFICATION", 1, 0, false);
        declareFunction(myName, "inference_answer_justification_first_proof", "INFERENCE-ANSWER-JUSTIFICATION-FIRST-PROOF", 1, 0, false);
        declareFunction(myName, "inference_first_proof", "INFERENCE-FIRST-PROOF", 1, 0, false);
        declareFunction(myName, "inference_answer_justification_inference", "INFERENCE-ANSWER-JUSTIFICATION-INFERENCE", 1, 0, false);
        declareFunction(myName, "inference_answer_justification_store", "INFERENCE-ANSWER-JUSTIFICATION-STORE", 1, 0, false);
        declareFunction(myName, "inference_answer_justification_rules", "INFERENCE-ANSWER-JUSTIFICATION-RULES", 1, 0, false);
        declareFunction(myName, "add_inference_answer_justification_proof", "ADD-INFERENCE-ANSWER-JUSTIFICATION-PROOF", 2, 0, false);
        declareFunction(myName, "new_inference_answer_justification_from_proof", "NEW-INFERENCE-ANSWER-JUSTIFICATION-FROM-PROOF", 4, 0, false);
        declareFunction(myName, "inference_answer_justification_to_tms_deduction_spec", "INFERENCE-ANSWER-JUSTIFICATION-TO-TMS-DEDUCTION-SPEC", 2, 0, false);
        declareFunction(myName, "inference_answer_justification_to_true_tms_deduction_spec", "INFERENCE-ANSWER-JUSTIFICATION-TO-TRUE-TMS-DEDUCTION-SPEC", 1, 0, false);
        declareFunction(myName, "inference_answer_justification_to_false_tms_deduction_spec", "INFERENCE-ANSWER-JUSTIFICATION-TO-FALSE-TMS-DEDUCTION-SPEC", 1, 0, false);
        declareFunction(myName, "destroy_proof_inference_answer_justifications", "DESTROY-PROOF-INFERENCE-ANSWER-JUSTIFICATIONS", 1, 0, false);
        declareFunction(myName, "inference_time_per_answer", "INFERENCE-TIME-PER-ANSWER", 1, 0, false);
        declareFunction(myName, "inference_steps_per_answer", "INFERENCE-STEPS-PER-ANSWER", 1, 0, false);
        declareFunction(myName, "inference_wasted_time_after_last_answer", "INFERENCE-WASTED-TIME-AFTER-LAST-ANSWER", 1, 0, false);
        declareFunction(myName, "inference_latency_improvement_from_iterativity", "INFERENCE-LATENCY-IMPROVEMENT-FROM-ITERATIVITY", 1, 0, false);
        declareFunction(myName, "inference_metrics", "INFERENCE-METRICS", 1, 0, false);
        declareFunction(myName, "inference_compute_metrics", "INFERENCE-COMPUTE-METRICS", 1, 0, false);
        declareFunction(myName, "inference_compute_metrics_plist", "INFERENCE-COMPUTE-METRICS-PLIST", 2, 0, false);
        declareFunction(myName, "inference_compute_metrics_alist", "INFERENCE-COMPUTE-METRICS-ALIST", 2, 0, false);
        declareFunction(myName, "inference_transformation_rules_in_answers", "INFERENCE-TRANSFORMATION-RULES-IN-ANSWERS", 1, 0, false);
        declareFunction(myName, "inference_all_answer_proofs", "INFERENCE-ALL-ANSWER-PROOFS", 1, 0, false);
        declareFunction(myName, "inference_all_answer_subproofs", "INFERENCE-ALL-ANSWER-SUBPROOFS", 1, 0, false);
        declareFunction(myName, "inference_answer_justification_all_subproofs", "INFERENCE-ANSWER-JUSTIFICATION-ALL-SUBPROOFS", 1, 0, false);
        declareFunction(myName, "inference_all_answer_supports", "INFERENCE-ALL-ANSWER-SUPPORTS", 1, 0, false);
        declareFunction(myName, "inference_all_answer_modules", "INFERENCE-ALL-ANSWER-MODULES", 1, 0, false);
        declareFunction(myName, "problem_relevant_to_some_strategyP", "PROBLEM-RELEVANT-TO-SOME-STRATEGY?", 1, 0, false);
        declareFunction(myName, "first_problem_relevant_strategy", "FIRST-PROBLEM-RELEVANT-STRATEGY", 1, 0, false);
        declareFunction(myName, "problem_or_inference_p", "PROBLEM-OR-INFERENCE-P", 1, 0, false);
        declareMacro(me, "with_inference_problem_working_time_table", "WITH-INFERENCE-PROBLEM-WORKING-TIME-TABLE");
        declareFunction(myName, "inference_problem_working_time_lock", "INFERENCE-PROBLEM-WORKING-TIME-LOCK", 1, 0, false);
        declareFunction(myName, "inference_problem_working_time_table", "INFERENCE-PROBLEM-WORKING-TIME-TABLE", 1, 0, false);
        declareFunction(myName, "initialize_inference_problem_working_time_data", "INITIALIZE-INFERENCE-PROBLEM-WORKING-TIME-DATA", 1, 0, false);
        declareFunction(myName, "inference_note_tactic_executed", "INFERENCE-NOTE-TACTIC-EXECUTED", 2, 0, false);
        declareFunction(myName, "inference_note_problem_pending", "INFERENCE-NOTE-PROBLEM-PENDING", 2, 0, false);
        declareFunction(myName, "signal_inference_eventP", "SIGNAL-INFERENCE-EVENT?", 2, 0, false);
        declareFunction(myName, "possibly_signal_new_inference_answer", "POSSIBLY-SIGNAL-NEW-INFERENCE-ANSWER", 2, 0, false);
        declareFunction(myName, "signal_new_inference_answer", "SIGNAL-NEW-INFERENCE-ANSWER", 2, 0, false);
        declareFunction(myName, "possibly_signal_inference_status_change", "POSSIBLY-SIGNAL-INFERENCE-STATUS-CHANGE", 1, 0, false);
        declareFunction(myName, "signal_inference_status_change", "SIGNAL-INFERENCE-STATUS-CHANGE", 2, 0, false);
        declareFunction(myName, "possibly_signal_inference_new_transformation_depth_reached", "POSSIBLY-SIGNAL-INFERENCE-NEW-TRANSFORMATION-DEPTH-REACHED", 2, 0, false);
        declareFunction(myName, "signal_inference_new_transformation_depth_reached", "SIGNAL-INFERENCE-NEW-TRANSFORMATION-DEPTH-REACHED", 2, 0, false);
        declareMacro(me, "inference_within_sksi_query_execution", "INFERENCE-WITHIN-SKSI-QUERY-EXECUTION");
        declareFunction(myName, "possibly_signal_sksi_query_start", "POSSIBLY-SIGNAL-SKSI-QUERY-START", 2, 0, false);
        declareFunction(myName, "possibly_signal_sksi_query_end", "POSSIBLY-SIGNAL-SKSI-QUERY-END", 2, 0, false);
        declareFunction(myName, "possibly_increment_inference_sksi_query_total_time", "POSSIBLY-INCREMENT-INFERENCE-SKSI-QUERY-TOTAL-TIME", 2, 0, false);
        declareFunction(myName, "possibly_add_inference_sksi_query_start_time", "POSSIBLY-ADD-INFERENCE-SKSI-QUERY-START-TIME", 2, 0, false);
        declareFunction(myName, "possibly_signal_sksi_query", "POSSIBLY-SIGNAL-SKSI-QUERY", 3, 1, false);
        declareFunction(myName, "signal_sksi_query", "SIGNAL-SKSI-QUERY", 3, 1, false);
        declareMacro(me, "inference_within_sparql_query_execution", "INFERENCE-WITHIN-SPARQL-QUERY-EXECUTION");
        declareFunction(myName, "possibly_add_inference_sparql_query_profile", "POSSIBLY-ADD-INFERENCE-SPARQL-QUERY-PROFILE", 4, 0, false);
        declareFunction(myName, "increment_inference_sksi_query_total_time", "INCREMENT-INFERENCE-SKSI-QUERY-TOTAL-TIME", 2, 0, false);
        declareFunction(myName, "add_inference_sksi_query_start_time", "ADD-INFERENCE-SKSI-QUERY-START-TIME", 2, 0, false);
        declareFunction(myName, "add_inference_sparql_query_profile", "ADD-INFERENCE-SPARQL-QUERY-PROFILE", 2, 0, false);
        return NIL;
    }

    public static SubLObject init_inference_datastructures_inference_file() {
        $inference_types$ = deflexical("*INFERENCE-TYPES*", $list0);
        $dtp_inference$ = defconstant("*DTP-INFERENCE*", $sym1$INFERENCE);
        $pad_times_to_first_answer$ = deflexical("*PAD-TIMES-TO-FIRST-ANSWER*", (maybeDefault($sym416$_PAD_TIMES_TO_FIRST_ANSWER_, $pad_times_to_first_answer$, $UNINITIALIZED)));
        $dtp_inference_answer$ = defconstant("*DTP-INFERENCE-ANSWER*", $sym441$INFERENCE_ANSWER);
        $dtp_inference_answer_justification$ = defconstant("*DTP-INFERENCE-ANSWER-JUSTIFICATION*", $sym481$INFERENCE_ANSWER_JUSTIFICATION);
        return NIL;
    }

    public static SubLObject setup_inference_datastructures_inference_file() {
        Structures.register_method(print_high.$print_object_method_table$.getGlobalValue(), $dtp_inference$.getGlobalValue(), Symbols.symbol_function($sym60$INFERENCE_PRINT_FUNCTION_TRAMPOLINE));
        SubLSpecialOperatorDeclarations.proclaim($list61);
        Structures.def_csetf($sym62$INFRNC_SUID, $sym63$_CSETF_INFRNC_SUID);
        Structures.def_csetf($sym64$INFRNC_PROBLEM_STORE, $sym65$_CSETF_INFRNC_PROBLEM_STORE);
        Structures.def_csetf($sym66$INFRNC_FORWARD_PROPAGATE, $sym67$_CSETF_INFRNC_FORWARD_PROPAGATE);
        Structures.def_csetf($sym68$INFRNC_INPUT_MT, $sym69$_CSETF_INFRNC_INPUT_MT);
        Structures.def_csetf($sym70$INFRNC_INPUT_EL_QUERY, $sym71$_CSETF_INFRNC_INPUT_EL_QUERY);
        Structures.def_csetf($sym72$INFRNC_INPUT_NON_EXPLANATORY_EL_QUERY, $sym73$_CSETF_INFRNC_INPUT_NON_EXPLANATORY_EL_QUERY);
        Structures.def_csetf($sym74$INFRNC_INPUT_QUERY_PROPERTIES, $sym75$_CSETF_INFRNC_INPUT_QUERY_PROPERTIES);
        Structures.def_csetf($sym76$INFRNC_MT, $sym77$_CSETF_INFRNC_MT);
        Structures.def_csetf($sym78$INFRNC_EL_QUERY, $sym79$_CSETF_INFRNC_EL_QUERY);
        Structures.def_csetf($sym80$INFRNC_EL_BINDINGS, $sym81$_CSETF_INFRNC_EL_BINDINGS);
        Structures.def_csetf($sym82$INFRNC_HL_QUERY, $sym83$_CSETF_INFRNC_HL_QUERY);
        Structures.def_csetf($sym84$INFRNC_EXPLANATORY_SUBQUERY, $sym85$_CSETF_INFRNC_EXPLANATORY_SUBQUERY);
        Structures.def_csetf($sym86$INFRNC_NON_EXPLANATORY_SUBQUERY, $sym87$_CSETF_INFRNC_NON_EXPLANATORY_SUBQUERY);
        Structures.def_csetf($sym88$INFRNC_FREE_HL_VARS, $sym89$_CSETF_INFRNC_FREE_HL_VARS);
        Structures.def_csetf($sym90$INFRNC_HYPOTHETICAL_BINDINGS, $sym91$_CSETF_INFRNC_HYPOTHETICAL_BINDINGS);
        Structures.def_csetf($sym92$INFRNC_ANSWER_ID_INDEX, $sym93$_CSETF_INFRNC_ANSWER_ID_INDEX);
        Structures.def_csetf($sym94$INFRNC_ANSWER_BINDINGS_INDEX, $sym95$_CSETF_INFRNC_ANSWER_BINDINGS_INDEX);
        Structures.def_csetf($sym96$INFRNC_NEW_ANSWER_ID_START, $sym97$_CSETF_INFRNC_NEW_ANSWER_ID_START);
        Structures.def_csetf($sym98$INFRNC_NEW_ANSWER_JUSTIFICATIONS, $sym99$_CSETF_INFRNC_NEW_ANSWER_JUSTIFICATIONS);
        Structures.def_csetf($sym100$INFRNC_STATUS, $sym101$_CSETF_INFRNC_STATUS);
        Structures.def_csetf($sym102$INFRNC_SUSPEND_STATUS, $sym103$_CSETF_INFRNC_SUSPEND_STATUS);
        Structures.def_csetf($sym104$INFRNC_ROOT_LINK, $sym105$_CSETF_INFRNC_ROOT_LINK);
        Structures.def_csetf($sym106$INFRNC_RELEVANT_PROBLEMS, $sym107$_CSETF_INFRNC_RELEVANT_PROBLEMS);
        Structures.def_csetf($sym108$INFRNC_STRATEGY_SET, $sym109$_CSETF_INFRNC_STRATEGY_SET);
        Structures.def_csetf($sym110$INFRNC_CONTROL_PROCESS, $sym111$_CSETF_INFRNC_CONTROL_PROCESS);
        Structures.def_csetf($sym112$INFRNC_INTERRUPTING_PROCESSES, $sym113$_CSETF_INFRNC_INTERRUPTING_PROCESSES);
        Structures.def_csetf($sym114$INFRNC_MAX_TRANSFORMATION_DEPTH_REACHED, $sym115$_CSETF_INFRNC_MAX_TRANSFORMATION_DEPTH_REACHED);
        Structures.def_csetf($sym116$INFRNC_DISJUNCTION_FREE_EL_VARS_POLICY, $sym117$_CSETF_INFRNC_DISJUNCTION_FREE_EL_VARS_POLICY);
        Structures.def_csetf($sym118$INFRNC_RESULT_UNIQUENESS_CRITERION, $sym119$_CSETF_INFRNC_RESULT_UNIQUENESS_CRITERION);
        Structures.def_csetf($sym120$INFRNC_ALLOW_HL_PREDICATE_TRANSFORMATION_, $sym121$_CSETF_INFRNC_ALLOW_HL_PREDICATE_TRANSFORMATION_);
        Structures.def_csetf($sym122$INFRNC_ALLOW_UNBOUND_PREDICATE_TRANSFORMATION_, $sym123$_CSETF_INFRNC_ALLOW_UNBOUND_PREDICATE_TRANSFORMATION_);
        Structures.def_csetf($sym124$INFRNC_ALLOW_EVALUATABLE_PREDICATE_TRANSFORMATION_, $sym125$_CSETF_INFRNC_ALLOW_EVALUATABLE_PREDICATE_TRANSFORMATION_);
        Structures.def_csetf($sym126$INFRNC_ALLOW_INDETERMINATE_RESULTS_, $sym127$_CSETF_INFRNC_ALLOW_INDETERMINATE_RESULTS_);
        Structures.def_csetf($sym128$INFRNC_ALLOWED_RULES, $sym129$_CSETF_INFRNC_ALLOWED_RULES);
        Structures.def_csetf($sym130$INFRNC_FORBIDDEN_RULES, $sym131$_CSETF_INFRNC_FORBIDDEN_RULES);
        Structures.def_csetf($sym132$INFRNC_ALLOWED_MODULES, $sym133$_CSETF_INFRNC_ALLOWED_MODULES);
        Structures.def_csetf($sym134$INFRNC_ALLOW_ABNORMALITY_CHECKING_, $sym135$_CSETF_INFRNC_ALLOW_ABNORMALITY_CHECKING_);
        Structures.def_csetf($sym136$INFRNC_TRANSITIVE_CLOSURE_MODE, $sym137$_CSETF_INFRNC_TRANSITIVE_CLOSURE_MODE);
        Structures.def_csetf($sym138$INFRNC_PROBLEM_STORE_PRIVATE_, $sym139$_CSETF_INFRNC_PROBLEM_STORE_PRIVATE_);
        Structures.def_csetf($sym140$INFRNC_CONTINUABLE_, $sym141$_CSETF_INFRNC_CONTINUABLE_);
        Structures.def_csetf($sym142$INFRNC_BROWSABLE_, $sym143$_CSETF_INFRNC_BROWSABLE_);
        Structures.def_csetf($sym144$INFRNC_RETURN_TYPE, $sym145$_CSETF_INFRNC_RETURN_TYPE);
        Structures.def_csetf($sym146$INFRNC_ANSWER_LANGUAGE, $sym147$_CSETF_INFRNC_ANSWER_LANGUAGE);
        Structures.def_csetf($sym148$INFRNC_CACHE_RESULTS_, $sym149$_CSETF_INFRNC_CACHE_RESULTS_);
        Structures.def_csetf($sym150$INFRNC_BLOCKING_, $sym151$_CSETF_INFRNC_BLOCKING_);
        Structures.def_csetf($sym152$INFRNC_MAX_NUMBER, $sym153$_CSETF_INFRNC_MAX_NUMBER);
        Structures.def_csetf($sym154$INFRNC_MAX_TIME, $sym155$_CSETF_INFRNC_MAX_TIME);
        Structures.def_csetf($sym156$INFRNC_MAX_STEP, $sym157$_CSETF_INFRNC_MAX_STEP);
        Structures.def_csetf($sym158$INFRNC_MODE, $sym159$_CSETF_INFRNC_MODE);
        Structures.def_csetf($sym160$INFRNC_FORWARD_MAX_TIME, $sym161$_CSETF_INFRNC_FORWARD_MAX_TIME);
        Structures.def_csetf($sym162$INFRNC_MAX_PROOF_DEPTH, $sym163$_CSETF_INFRNC_MAX_PROOF_DEPTH);
        Structures.def_csetf($sym164$INFRNC_MAX_TRANSFORMATION_DEPTH, $sym165$_CSETF_INFRNC_MAX_TRANSFORMATION_DEPTH);
        Structures.def_csetf($sym166$INFRNC_MIN_RULE_UTILITY, $sym167$_CSETF_INFRNC_MIN_RULE_UTILITY);
        Structures.def_csetf($sym168$INFRNC_PROBABLY_APPROXIMATELY_DONE, $sym169$_CSETF_INFRNC_PROBABLY_APPROXIMATELY_DONE);
        Structures.def_csetf($sym170$INFRNC_METRICS_TEMPLATE, $sym171$_CSETF_INFRNC_METRICS_TEMPLATE);
        Structures.def_csetf($sym172$INFRNC_START_UNIVERSAL_TIME, $sym173$_CSETF_INFRNC_START_UNIVERSAL_TIME);
        Structures.def_csetf($sym174$INFRNC_START_INTERNAL_REAL_TIME, $sym175$_CSETF_INFRNC_START_INTERNAL_REAL_TIME);
        Structures.def_csetf($sym176$INFRNC_END_INTERNAL_REAL_TIME, $sym177$_CSETF_INFRNC_END_INTERNAL_REAL_TIME);
        Structures.def_csetf($sym178$INFRNC_PAD_INTERNAL_REAL_TIME, $sym179$_CSETF_INFRNC_PAD_INTERNAL_REAL_TIME);
        Structures.def_csetf($sym180$INFRNC_HYPOTHESIZATION_TIME, $sym181$_CSETF_INFRNC_HYPOTHESIZATION_TIME);
        Structures.def_csetf($sym182$INFRNC_CUMULATIVE_TIME, $sym183$_CSETF_INFRNC_CUMULATIVE_TIME);
        Structures.def_csetf($sym184$INFRNC_STEP_COUNT, $sym185$_CSETF_INFRNC_STEP_COUNT);
        Structures.def_csetf($sym186$INFRNC_CUMULATIVE_STEP_COUNT, $sym187$_CSETF_INFRNC_CUMULATIVE_STEP_COUNT);
        Structures.def_csetf($sym188$INFRNC_EVENTS, $sym189$_CSETF_INFRNC_EVENTS);
        Structures.def_csetf($sym190$INFRNC_HALT_CONDITIONS, $sym191$_CSETF_INFRNC_HALT_CONDITIONS);
        Structures.def_csetf($sym192$INFRNC_ACCUMULATORS, $sym193$_CSETF_INFRNC_ACCUMULATORS);
        Structures.def_csetf($sym194$INFRNC_PROOF_WATERMARK, $sym195$_CSETF_INFRNC_PROOF_WATERMARK);
        Structures.def_csetf($sym196$INFRNC_PROBLEM_WORKING_TIME_DATA, $sym197$_CSETF_INFRNC_PROBLEM_WORKING_TIME_DATA);
        Structures.def_csetf($sym198$INFRNC_TYPE, $sym199$_CSETF_INFRNC_TYPE);
        Structures.def_csetf($sym200$INFRNC_DATA, $sym201$_CSETF_INFRNC_DATA);
        Structures.def_csetf($sym202$INFRNC_PROPERTIES, $sym203$_CSETF_INFRNC_PROPERTIES);
        Equality.identity($sym1$INFERENCE);
        Structures.register_method(visitation.$visit_defstruct_object_method_table$.getGlobalValue(), $dtp_inference$.getGlobalValue(), Symbols.symbol_function($sym280$VISIT_DEFSTRUCT_OBJECT_INFERENCE_METHOD));
        Structures.register_method(Sxhash.$sxhash_method_table$.getGlobalValue(), $dtp_inference$.getGlobalValue(), Symbols.symbol_function($sym284$SXHASH_INFERENCE_METHOD));
        access_macros.register_macro_helper($sym314$INFERENCE_ANSWER_ID_INDEX, $sym323$DO_INFERENCE_ANSWERS);
        access_macros.register_macro_helper($sym302$INFERENCE_NEW_ANSWER_ID_START, $sym347$DO_INFERENCE_NEW_ANSWERS);
        access_macros.register_macro_helper($sym295$INFERENCE_NEW_ANSWER_JUSTIFICATIONS, $sym348$DO_INFERENCE_NEW_ANSWER_JUSTIFICATIONS);
        subl_macro_promotions.declare_defglobal($sym416$_PAD_TIMES_TO_FIRST_ANSWER_);
        access_macros.register_macro_helper($sym303$INFERENCE_NEXT_NEW_ANSWER_ID, $sym347$DO_INFERENCE_NEW_ANSWERS);
        Structures.register_method(print_high.$print_object_method_table$.getGlobalValue(), $dtp_inference_answer$.getGlobalValue(), Symbols.symbol_function($sym447$INFERENCE_ANSWER_PRINT_FUNCTION_TRAMPOLINE));
        SubLSpecialOperatorDeclarations.proclaim($list448);
        Structures.def_csetf($sym449$INF_ANSWER_SUID, $sym450$_CSETF_INF_ANSWER_SUID);
        Structures.def_csetf($sym451$INF_ANSWER_INFERENCE, $sym452$_CSETF_INF_ANSWER_INFERENCE);
        Structures.def_csetf($sym453$INF_ANSWER_BINDINGS, $sym454$_CSETF_INF_ANSWER_BINDINGS);
        Structures.def_csetf($sym455$INF_ANSWER_JUSTIFICATIONS, $sym456$_CSETF_INF_ANSWER_JUSTIFICATIONS);
        Structures.def_csetf($sym457$INF_ANSWER_ELAPSED_CREATION_TIME, $sym458$_CSETF_INF_ANSWER_ELAPSED_CREATION_TIME);
        Structures.def_csetf($sym459$INF_ANSWER_STEP_COUNT, $sym460$_CSETF_INF_ANSWER_STEP_COUNT);
        Equality.identity($sym441$INFERENCE_ANSWER);
        Structures.register_method(visitation.$visit_defstruct_object_method_table$.getGlobalValue(), $dtp_inference_answer$.getGlobalValue(), Symbols.symbol_function($sym465$VISIT_DEFSTRUCT_OBJECT_INFERENCE_ANSWER_METHOD));
        Structures.register_method(Sxhash.$sxhash_method_table$.getGlobalValue(), $dtp_inference_answer$.getGlobalValue(), Symbols.symbol_function($sym468$SXHASH_INFERENCE_ANSWER_METHOD));
        access_macros.register_macro_helper($sym472$INFERENCE_ANSWER_JUSTIFICATIONS, $sym324$DO_INFERENCE_ANSWER_JUSTIFICATIONS);
        access_macros.register_external_symbol($sym480$INFERENCE_ANSWER_EL_SENTENCE);
        Structures.register_method(print_high.$print_object_method_table$.getGlobalValue(), $dtp_inference_answer_justification$.getGlobalValue(), Symbols.symbol_function($sym487$INFERENCE_ANSWER_JUSTIFICATION_PRINT_FUNCTION_TRAMPOLINE));
        SubLSpecialOperatorDeclarations.proclaim($list488);
        Structures.def_csetf($sym489$INF_ANS_JUST_ANSWER, $sym490$_CSETF_INF_ANS_JUST_ANSWER);
        Structures.def_csetf($sym491$INF_ANS_JUST_SUPPORTS, $sym492$_CSETF_INF_ANS_JUST_SUPPORTS);
        Structures.def_csetf($sym493$INF_ANS_JUST_PRAGMA_SUPPORTS, $sym494$_CSETF_INF_ANS_JUST_PRAGMA_SUPPORTS);
        Structures.def_csetf($sym495$INF_ANS_JUST_PROOFS, $sym496$_CSETF_INF_ANS_JUST_PROOFS);
        Equality.identity($sym481$INFERENCE_ANSWER_JUSTIFICATION);
        Structures.register_method(visitation.$visit_defstruct_object_method_table$.getGlobalValue(), $dtp_inference_answer_justification$.getGlobalValue(), Symbols.symbol_function($sym502$VISIT_DEFSTRUCT_OBJECT_INFERENCE_ANSWER_JUSTIFICATION_METHOD));
        Structures.register_method(Sxhash.$sxhash_method_table$.getGlobalValue(), $dtp_inference_answer_justification$.getGlobalValue(), Symbols.symbol_function($sym504$SXHASH_INFERENCE_ANSWER_JUSTIFICATION_METHOD));
        access_macros.register_external_symbol($sym528$INFERENCE_METRICS);
        access_macros.register_macro_helper($sym341$INFERENCE_PROBLEM_WORKING_TIME_LOCK, $sym545$WITH_INFERENCE_PROBLEM_WORKING_TIME_LOCK);
        access_macros.register_macro_helper($sym560$POSSIBLY_SIGNAL_SKSI_QUERY_START, $sym567$INFERENCE_WITHIN_SKSI_QUERY_EXECUTION);
        access_macros.register_macro_helper($sym564$POSSIBLY_SIGNAL_SKSI_QUERY_END, $sym567$INFERENCE_WITHIN_SKSI_QUERY_EXECUTION);
        access_macros.register_macro_helper($sym565$POSSIBLY_INCREMENT_INFERENCE_SKSI_QUERY_TOTAL_TIME, $sym567$INFERENCE_WITHIN_SKSI_QUERY_EXECUTION);
        access_macros.register_macro_helper($sym563$POSSIBLY_ADD_INFERENCE_SKSI_QUERY_START_TIME, $sym567$INFERENCE_WITHIN_SKSI_QUERY_EXECUTION);
        access_macros.register_macro_helper($sym587$POSSIBLY_ADD_INFERENCE_SPARQL_QUERY_PROFILE, $sym588$INFERENCE_WITHIN_SPARQL_QUERY_EXECUTION);
        return NIL;
    }

    @Override
    public void declareFunctions() {
        declare_inference_datastructures_inference_file();
    }

    @Override
    public void initializeVariables() {
        init_inference_datastructures_inference_file();
    }

    @Override
    public void runTopLevelForms() {
        setup_inference_datastructures_inference_file();
    }

    static {
        me = new inference_datastructures_inference();
        $inference_types$ = null;
        $dtp_inference$ = null;
        $pad_times_to_first_answer$ = null;
        $dtp_inference_answer$ = null;
        $dtp_inference_answer_justification$ = null;
        $list0 = list(makeKeyword("SIMPLEST"));
        $sym1$INFERENCE = makeSymbol("INFERENCE");
        $sym2$INFERENCE_P = makeSymbol("INFERENCE-P");
        $list3 = list(new SubLObject[] { makeSymbol("SUID"), makeSymbol("PROBLEM-STORE"), makeSymbol("FORWARD-PROPAGATE"), makeSymbol("INPUT-MT"), makeSymbol("INPUT-EL-QUERY"), makeSymbol("INPUT-NON-EXPLANATORY-EL-QUERY"), makeSymbol("INPUT-QUERY-PROPERTIES"), makeSymbol("MT"),
                makeSymbol("EL-QUERY"), makeSymbol("EL-BINDINGS"), makeSymbol("HL-QUERY"), makeSymbol("EXPLANATORY-SUBQUERY"), makeSymbol("NON-EXPLANATORY-SUBQUERY"), makeSymbol("FREE-HL-VARS"), makeSymbol("HYPOTHETICAL-BINDINGS"), makeSymbol("ANSWER-ID-INDEX"), makeSymbol("ANSWER-BINDINGS-INDEX"),
                makeSymbol("NEW-ANSWER-ID-START"), makeSymbol("NEW-ANSWER-JUSTIFICATIONS"), makeSymbol("STATUS"), makeSymbol("SUSPEND-STATUS"), makeSymbol("ROOT-LINK"), makeSymbol("RELEVANT-PROBLEMS"), makeSymbol("STRATEGY-SET"), makeSymbol("CONTROL-PROCESS"), makeSymbol("INTERRUPTING-PROCESSES"),
                makeSymbol("MAX-TRANSFORMATION-DEPTH-REACHED"), makeSymbol("DISJUNCTION-FREE-EL-VARS-POLICY"), makeSymbol("RESULT-UNIQUENESS-CRITERION"), makeSymbol("ALLOW-HL-PREDICATE-TRANSFORMATION?"), makeSymbol("ALLOW-UNBOUND-PREDICATE-TRANSFORMATION?"),
                makeSymbol("ALLOW-EVALUATABLE-PREDICATE-TRANSFORMATION?"), makeSymbol("ALLOW-INDETERMINATE-RESULTS?"), makeSymbol("ALLOWED-RULES"), makeSymbol("FORBIDDEN-RULES"), makeSymbol("ALLOWED-MODULES"), makeSymbol("ALLOW-ABNORMALITY-CHECKING?"), makeSymbol("TRANSITIVE-CLOSURE-MODE"),
                makeSymbol("PROBLEM-STORE-PRIVATE?"), makeSymbol("CONTINUABLE?"), makeSymbol("BROWSABLE?"), makeSymbol("RETURN-TYPE"), makeSymbol("ANSWER-LANGUAGE"), makeSymbol("CACHE-RESULTS?"), makeSymbol("BLOCKING?"), makeSymbol("MAX-NUMBER"), makeSymbol("MAX-TIME"), makeSymbol("MAX-STEP"),
                makeSymbol("MODE"), makeSymbol("FORWARD-MAX-TIME"), makeSymbol("MAX-PROOF-DEPTH"), makeSymbol("MAX-TRANSFORMATION-DEPTH"), makeSymbol("MIN-RULE-UTILITY"), makeSymbol("PROBABLY-APPROXIMATELY-DONE"), makeSymbol("METRICS-TEMPLATE"), makeSymbol("START-UNIVERSAL-TIME"),
                makeSymbol("START-INTERNAL-REAL-TIME"), makeSymbol("END-INTERNAL-REAL-TIME"), makeSymbol("PAD-INTERNAL-REAL-TIME"), makeSymbol("HYPOTHESIZATION-TIME"), makeSymbol("CUMULATIVE-TIME"), makeSymbol("STEP-COUNT"), makeSymbol("CUMULATIVE-STEP-COUNT"), makeSymbol("EVENTS"),
                makeSymbol("HALT-CONDITIONS"), makeSymbol("ACCUMULATORS"), makeSymbol("PROOF-WATERMARK"), makeSymbol("PROBLEM-WORKING-TIME-DATA"), makeSymbol("TYPE"), makeSymbol("DATA"), makeSymbol("PROPERTIES") });
        $list4 = list(new SubLObject[] { makeKeyword("SUID"), makeKeyword("PROBLEM-STORE"), makeKeyword("FORWARD-PROPAGATE"), makeKeyword("INPUT-MT"), makeKeyword("INPUT-EL-QUERY"), makeKeyword("INPUT-NON-EXPLANATORY-EL-QUERY"), makeKeyword("INPUT-QUERY-PROPERTIES"), makeKeyword("MT"),
                makeKeyword("EL-QUERY"), makeKeyword("EL-BINDINGS"), makeKeyword("HL-QUERY"), makeKeyword("EXPLANATORY-SUBQUERY"), makeKeyword("NON-EXPLANATORY-SUBQUERY"), makeKeyword("FREE-HL-VARS"), makeKeyword("HYPOTHETICAL-BINDINGS"), makeKeyword("ANSWER-ID-INDEX"),
                makeKeyword("ANSWER-BINDINGS-INDEX"), makeKeyword("NEW-ANSWER-ID-START"), makeKeyword("NEW-ANSWER-JUSTIFICATIONS"), makeKeyword("STATUS"), makeKeyword("SUSPEND-STATUS"), makeKeyword("ROOT-LINK"), makeKeyword("RELEVANT-PROBLEMS"), makeKeyword("STRATEGY-SET"),
                makeKeyword("CONTROL-PROCESS"), makeKeyword("INTERRUPTING-PROCESSES"), makeKeyword("MAX-TRANSFORMATION-DEPTH-REACHED"), makeKeyword("DISJUNCTION-FREE-EL-VARS-POLICY"), makeKeyword("RESULT-UNIQUENESS-CRITERION"), makeKeyword("ALLOW-HL-PREDICATE-TRANSFORMATION?"),
                makeKeyword("ALLOW-UNBOUND-PREDICATE-TRANSFORMATION?"), makeKeyword("ALLOW-EVALUATABLE-PREDICATE-TRANSFORMATION?"), makeKeyword("ALLOW-INDETERMINATE-RESULTS?"), makeKeyword("ALLOWED-RULES"), makeKeyword("FORBIDDEN-RULES"), makeKeyword("ALLOWED-MODULES"),
                makeKeyword("ALLOW-ABNORMALITY-CHECKING?"), makeKeyword("TRANSITIVE-CLOSURE-MODE"), makeKeyword("PROBLEM-STORE-PRIVATE?"), makeKeyword("CONTINUABLE?"), makeKeyword("BROWSABLE?"), makeKeyword("RETURN-TYPE"), makeKeyword("ANSWER-LANGUAGE"), makeKeyword("CACHE-RESULTS?"),
                makeKeyword("BLOCKING?"), makeKeyword("MAX-NUMBER"), makeKeyword("MAX-TIME"), makeKeyword("MAX-STEP"), makeKeyword("MODE"), makeKeyword("FORWARD-MAX-TIME"), makeKeyword("MAX-PROOF-DEPTH"), makeKeyword("MAX-TRANSFORMATION-DEPTH"), makeKeyword("MIN-RULE-UTILITY"),
                makeKeyword("PROBABLY-APPROXIMATELY-DONE"), makeKeyword("METRICS-TEMPLATE"), makeKeyword("START-UNIVERSAL-TIME"), makeKeyword("START-INTERNAL-REAL-TIME"), makeKeyword("END-INTERNAL-REAL-TIME"), makeKeyword("PAD-INTERNAL-REAL-TIME"), makeKeyword("HYPOTHESIZATION-TIME"),
                makeKeyword("CUMULATIVE-TIME"), makeKeyword("STEP-COUNT"), makeKeyword("CUMULATIVE-STEP-COUNT"), makeKeyword("EVENTS"), makeKeyword("HALT-CONDITIONS"), makeKeyword("ACCUMULATORS"), makeKeyword("PROOF-WATERMARK"), makeKeyword("PROBLEM-WORKING-TIME-DATA"), makeKeyword("TYPE"),
                makeKeyword("DATA"), makeKeyword("PROPERTIES") });
        $list5 = list(new SubLObject[] { makeSymbol("INFRNC-SUID"), makeSymbol("INFRNC-PROBLEM-STORE"), makeSymbol("INFRNC-FORWARD-PROPAGATE"), makeSymbol("INFRNC-INPUT-MT"), makeSymbol("INFRNC-INPUT-EL-QUERY"), makeSymbol("INFRNC-INPUT-NON-EXPLANATORY-EL-QUERY"),
                makeSymbol("INFRNC-INPUT-QUERY-PROPERTIES"), makeSymbol("INFRNC-MT"), makeSymbol("INFRNC-EL-QUERY"), makeSymbol("INFRNC-EL-BINDINGS"), makeSymbol("INFRNC-HL-QUERY"), makeSymbol("INFRNC-EXPLANATORY-SUBQUERY"), makeSymbol("INFRNC-NON-EXPLANATORY-SUBQUERY"),
                makeSymbol("INFRNC-FREE-HL-VARS"), makeSymbol("INFRNC-HYPOTHETICAL-BINDINGS"), makeSymbol("INFRNC-ANSWER-ID-INDEX"), makeSymbol("INFRNC-ANSWER-BINDINGS-INDEX"), makeSymbol("INFRNC-NEW-ANSWER-ID-START"), makeSymbol("INFRNC-NEW-ANSWER-JUSTIFICATIONS"), makeSymbol("INFRNC-STATUS"),
                makeSymbol("INFRNC-SUSPEND-STATUS"), makeSymbol("INFRNC-ROOT-LINK"), makeSymbol("INFRNC-RELEVANT-PROBLEMS"), makeSymbol("INFRNC-STRATEGY-SET"), makeSymbol("INFRNC-CONTROL-PROCESS"), makeSymbol("INFRNC-INTERRUPTING-PROCESSES"), makeSymbol("INFRNC-MAX-TRANSFORMATION-DEPTH-REACHED"),
                makeSymbol("INFRNC-DISJUNCTION-FREE-EL-VARS-POLICY"), makeSymbol("INFRNC-RESULT-UNIQUENESS-CRITERION"), makeSymbol("INFRNC-ALLOW-HL-PREDICATE-TRANSFORMATION?"), makeSymbol("INFRNC-ALLOW-UNBOUND-PREDICATE-TRANSFORMATION?"),
                makeSymbol("INFRNC-ALLOW-EVALUATABLE-PREDICATE-TRANSFORMATION?"), makeSymbol("INFRNC-ALLOW-INDETERMINATE-RESULTS?"), makeSymbol("INFRNC-ALLOWED-RULES"), makeSymbol("INFRNC-FORBIDDEN-RULES"), makeSymbol("INFRNC-ALLOWED-MODULES"), makeSymbol("INFRNC-ALLOW-ABNORMALITY-CHECKING?"),
                makeSymbol("INFRNC-TRANSITIVE-CLOSURE-MODE"), makeSymbol("INFRNC-PROBLEM-STORE-PRIVATE?"), makeSymbol("INFRNC-CONTINUABLE?"), makeSymbol("INFRNC-BROWSABLE?"), makeSymbol("INFRNC-RETURN-TYPE"), makeSymbol("INFRNC-ANSWER-LANGUAGE"), makeSymbol("INFRNC-CACHE-RESULTS?"),
                makeSymbol("INFRNC-BLOCKING?"), makeSymbol("INFRNC-MAX-NUMBER"), makeSymbol("INFRNC-MAX-TIME"), makeSymbol("INFRNC-MAX-STEP"), makeSymbol("INFRNC-MODE"), makeSymbol("INFRNC-FORWARD-MAX-TIME"), makeSymbol("INFRNC-MAX-PROOF-DEPTH"), makeSymbol("INFRNC-MAX-TRANSFORMATION-DEPTH"),
                makeSymbol("INFRNC-MIN-RULE-UTILITY"), makeSymbol("INFRNC-PROBABLY-APPROXIMATELY-DONE"), makeSymbol("INFRNC-METRICS-TEMPLATE"), makeSymbol("INFRNC-START-UNIVERSAL-TIME"), makeSymbol("INFRNC-START-INTERNAL-REAL-TIME"), makeSymbol("INFRNC-END-INTERNAL-REAL-TIME"),
                makeSymbol("INFRNC-PAD-INTERNAL-REAL-TIME"), makeSymbol("INFRNC-HYPOTHESIZATION-TIME"), makeSymbol("INFRNC-CUMULATIVE-TIME"), makeSymbol("INFRNC-STEP-COUNT"), makeSymbol("INFRNC-CUMULATIVE-STEP-COUNT"), makeSymbol("INFRNC-EVENTS"), makeSymbol("INFRNC-HALT-CONDITIONS"),
                makeSymbol("INFRNC-ACCUMULATORS"), makeSymbol("INFRNC-PROOF-WATERMARK"), makeSymbol("INFRNC-PROBLEM-WORKING-TIME-DATA"), makeSymbol("INFRNC-TYPE"), makeSymbol("INFRNC-DATA"), makeSymbol("INFRNC-PROPERTIES") });
        $list6 = list(new SubLObject[] { makeSymbol("_CSETF-INFRNC-SUID"), makeSymbol("_CSETF-INFRNC-PROBLEM-STORE"), makeSymbol("_CSETF-INFRNC-FORWARD-PROPAGATE"), makeSymbol("_CSETF-INFRNC-INPUT-MT"), makeSymbol("_CSETF-INFRNC-INPUT-EL-QUERY"),
                makeSymbol("_CSETF-INFRNC-INPUT-NON-EXPLANATORY-EL-QUERY"), makeSymbol("_CSETF-INFRNC-INPUT-QUERY-PROPERTIES"), makeSymbol("_CSETF-INFRNC-MT"), makeSymbol("_CSETF-INFRNC-EL-QUERY"), makeSymbol("_CSETF-INFRNC-EL-BINDINGS"), makeSymbol("_CSETF-INFRNC-HL-QUERY"),
                makeSymbol("_CSETF-INFRNC-EXPLANATORY-SUBQUERY"), makeSymbol("_CSETF-INFRNC-NON-EXPLANATORY-SUBQUERY"), makeSymbol("_CSETF-INFRNC-FREE-HL-VARS"), makeSymbol("_CSETF-INFRNC-HYPOTHETICAL-BINDINGS"), makeSymbol("_CSETF-INFRNC-ANSWER-ID-INDEX"),
                makeSymbol("_CSETF-INFRNC-ANSWER-BINDINGS-INDEX"), makeSymbol("_CSETF-INFRNC-NEW-ANSWER-ID-START"), makeSymbol("_CSETF-INFRNC-NEW-ANSWER-JUSTIFICATIONS"), makeSymbol("_CSETF-INFRNC-STATUS"), makeSymbol("_CSETF-INFRNC-SUSPEND-STATUS"), makeSymbol("_CSETF-INFRNC-ROOT-LINK"),
                makeSymbol("_CSETF-INFRNC-RELEVANT-PROBLEMS"), makeSymbol("_CSETF-INFRNC-STRATEGY-SET"), makeSymbol("_CSETF-INFRNC-CONTROL-PROCESS"), makeSymbol("_CSETF-INFRNC-INTERRUPTING-PROCESSES"), makeSymbol("_CSETF-INFRNC-MAX-TRANSFORMATION-DEPTH-REACHED"),
                makeSymbol("_CSETF-INFRNC-DISJUNCTION-FREE-EL-VARS-POLICY"), makeSymbol("_CSETF-INFRNC-RESULT-UNIQUENESS-CRITERION"), makeSymbol("_CSETF-INFRNC-ALLOW-HL-PREDICATE-TRANSFORMATION?"), makeSymbol("_CSETF-INFRNC-ALLOW-UNBOUND-PREDICATE-TRANSFORMATION?"),
                makeSymbol("_CSETF-INFRNC-ALLOW-EVALUATABLE-PREDICATE-TRANSFORMATION?"), makeSymbol("_CSETF-INFRNC-ALLOW-INDETERMINATE-RESULTS?"), makeSymbol("_CSETF-INFRNC-ALLOWED-RULES"), makeSymbol("_CSETF-INFRNC-FORBIDDEN-RULES"), makeSymbol("_CSETF-INFRNC-ALLOWED-MODULES"),
                makeSymbol("_CSETF-INFRNC-ALLOW-ABNORMALITY-CHECKING?"), makeSymbol("_CSETF-INFRNC-TRANSITIVE-CLOSURE-MODE"), makeSymbol("_CSETF-INFRNC-PROBLEM-STORE-PRIVATE?"), makeSymbol("_CSETF-INFRNC-CONTINUABLE?"), makeSymbol("_CSETF-INFRNC-BROWSABLE?"), makeSymbol("_CSETF-INFRNC-RETURN-TYPE"),
                makeSymbol("_CSETF-INFRNC-ANSWER-LANGUAGE"), makeSymbol("_CSETF-INFRNC-CACHE-RESULTS?"), makeSymbol("_CSETF-INFRNC-BLOCKING?"), makeSymbol("_CSETF-INFRNC-MAX-NUMBER"), makeSymbol("_CSETF-INFRNC-MAX-TIME"), makeSymbol("_CSETF-INFRNC-MAX-STEP"), makeSymbol("_CSETF-INFRNC-MODE"),
                makeSymbol("_CSETF-INFRNC-FORWARD-MAX-TIME"), makeSymbol("_CSETF-INFRNC-MAX-PROOF-DEPTH"), makeSymbol("_CSETF-INFRNC-MAX-TRANSFORMATION-DEPTH"), makeSymbol("_CSETF-INFRNC-MIN-RULE-UTILITY"), makeSymbol("_CSETF-INFRNC-PROBABLY-APPROXIMATELY-DONE"),
                makeSymbol("_CSETF-INFRNC-METRICS-TEMPLATE"), makeSymbol("_CSETF-INFRNC-START-UNIVERSAL-TIME"), makeSymbol("_CSETF-INFRNC-START-INTERNAL-REAL-TIME"), makeSymbol("_CSETF-INFRNC-END-INTERNAL-REAL-TIME"), makeSymbol("_CSETF-INFRNC-PAD-INTERNAL-REAL-TIME"),
                makeSymbol("_CSETF-INFRNC-HYPOTHESIZATION-TIME"), makeSymbol("_CSETF-INFRNC-CUMULATIVE-TIME"), makeSymbol("_CSETF-INFRNC-STEP-COUNT"), makeSymbol("_CSETF-INFRNC-CUMULATIVE-STEP-COUNT"), makeSymbol("_CSETF-INFRNC-EVENTS"), makeSymbol("_CSETF-INFRNC-HALT-CONDITIONS"),
                makeSymbol("_CSETF-INFRNC-ACCUMULATORS"), makeSymbol("_CSETF-INFRNC-PROOF-WATERMARK"), makeSymbol("_CSETF-INFRNC-PROBLEM-WORKING-TIME-DATA"), makeSymbol("_CSETF-INFRNC-TYPE"), makeSymbol("_CSETF-INFRNC-DATA"), makeSymbol("_CSETF-INFRNC-PROPERTIES") });
        $sym7$PRINT_INFERENCE = makeSymbol("PRINT-INFERENCE");
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
        $int$50 = makeInteger(50);
        $int$51 = makeInteger(51);
        $int$52 = makeInteger(52);
        $int$53 = makeInteger(53);
        $int$54 = makeInteger(54);
        $int$55 = makeInteger(55);
        $int$56 = makeInteger(56);
        $int$57 = makeInteger(57);
        $int$58 = makeInteger(58);
        $int$59 = makeInteger(59);
        $int$60 = makeInteger(60);
        $int$61 = makeInteger(61);
        $int$62 = makeInteger(62);
        $int$63 = makeInteger(63);
        $int$64 = makeInteger(64);
        $int$65 = makeInteger(65);
        $int$66 = makeInteger(66);
        $int$67 = makeInteger(67);
        $int$68 = makeInteger(68);
        $int$69 = makeInteger(69);
        $int$70 = makeInteger(70);
        $int$71 = makeInteger(71);
        $int$72 = makeInteger(72);
        $sym60$INFERENCE_PRINT_FUNCTION_TRAMPOLINE = makeSymbol("INFERENCE-PRINT-FUNCTION-TRAMPOLINE");
        $list61 = list(makeSymbol("OPTIMIZE-FUNCALL"), makeSymbol("INFERENCE-P"));
        $sym62$INFRNC_SUID = makeSymbol("INFRNC-SUID");
        $sym63$_CSETF_INFRNC_SUID = makeSymbol("_CSETF-INFRNC-SUID");
        $sym64$INFRNC_PROBLEM_STORE = makeSymbol("INFRNC-PROBLEM-STORE");
        $sym65$_CSETF_INFRNC_PROBLEM_STORE = makeSymbol("_CSETF-INFRNC-PROBLEM-STORE");
        $sym66$INFRNC_FORWARD_PROPAGATE = makeSymbol("INFRNC-FORWARD-PROPAGATE");
        $sym67$_CSETF_INFRNC_FORWARD_PROPAGATE = makeSymbol("_CSETF-INFRNC-FORWARD-PROPAGATE");
        $sym68$INFRNC_INPUT_MT = makeSymbol("INFRNC-INPUT-MT");
        $sym69$_CSETF_INFRNC_INPUT_MT = makeSymbol("_CSETF-INFRNC-INPUT-MT");
        $sym70$INFRNC_INPUT_EL_QUERY = makeSymbol("INFRNC-INPUT-EL-QUERY");
        $sym71$_CSETF_INFRNC_INPUT_EL_QUERY = makeSymbol("_CSETF-INFRNC-INPUT-EL-QUERY");
        $sym72$INFRNC_INPUT_NON_EXPLANATORY_EL_QUERY = makeSymbol("INFRNC-INPUT-NON-EXPLANATORY-EL-QUERY");
        $sym73$_CSETF_INFRNC_INPUT_NON_EXPLANATORY_EL_QUERY = makeSymbol("_CSETF-INFRNC-INPUT-NON-EXPLANATORY-EL-QUERY");
        $sym74$INFRNC_INPUT_QUERY_PROPERTIES = makeSymbol("INFRNC-INPUT-QUERY-PROPERTIES");
        $sym75$_CSETF_INFRNC_INPUT_QUERY_PROPERTIES = makeSymbol("_CSETF-INFRNC-INPUT-QUERY-PROPERTIES");
        $sym76$INFRNC_MT = makeSymbol("INFRNC-MT");
        $sym77$_CSETF_INFRNC_MT = makeSymbol("_CSETF-INFRNC-MT");
        $sym78$INFRNC_EL_QUERY = makeSymbol("INFRNC-EL-QUERY");
        $sym79$_CSETF_INFRNC_EL_QUERY = makeSymbol("_CSETF-INFRNC-EL-QUERY");
        $sym80$INFRNC_EL_BINDINGS = makeSymbol("INFRNC-EL-BINDINGS");
        $sym81$_CSETF_INFRNC_EL_BINDINGS = makeSymbol("_CSETF-INFRNC-EL-BINDINGS");
        $sym82$INFRNC_HL_QUERY = makeSymbol("INFRNC-HL-QUERY");
        $sym83$_CSETF_INFRNC_HL_QUERY = makeSymbol("_CSETF-INFRNC-HL-QUERY");
        $sym84$INFRNC_EXPLANATORY_SUBQUERY = makeSymbol("INFRNC-EXPLANATORY-SUBQUERY");
        $sym85$_CSETF_INFRNC_EXPLANATORY_SUBQUERY = makeSymbol("_CSETF-INFRNC-EXPLANATORY-SUBQUERY");
        $sym86$INFRNC_NON_EXPLANATORY_SUBQUERY = makeSymbol("INFRNC-NON-EXPLANATORY-SUBQUERY");
        $sym87$_CSETF_INFRNC_NON_EXPLANATORY_SUBQUERY = makeSymbol("_CSETF-INFRNC-NON-EXPLANATORY-SUBQUERY");
        $sym88$INFRNC_FREE_HL_VARS = makeSymbol("INFRNC-FREE-HL-VARS");
        $sym89$_CSETF_INFRNC_FREE_HL_VARS = makeSymbol("_CSETF-INFRNC-FREE-HL-VARS");
        $sym90$INFRNC_HYPOTHETICAL_BINDINGS = makeSymbol("INFRNC-HYPOTHETICAL-BINDINGS");
        $sym91$_CSETF_INFRNC_HYPOTHETICAL_BINDINGS = makeSymbol("_CSETF-INFRNC-HYPOTHETICAL-BINDINGS");
        $sym92$INFRNC_ANSWER_ID_INDEX = makeSymbol("INFRNC-ANSWER-ID-INDEX");
        $sym93$_CSETF_INFRNC_ANSWER_ID_INDEX = makeSymbol("_CSETF-INFRNC-ANSWER-ID-INDEX");
        $sym94$INFRNC_ANSWER_BINDINGS_INDEX = makeSymbol("INFRNC-ANSWER-BINDINGS-INDEX");
        $sym95$_CSETF_INFRNC_ANSWER_BINDINGS_INDEX = makeSymbol("_CSETF-INFRNC-ANSWER-BINDINGS-INDEX");
        $sym96$INFRNC_NEW_ANSWER_ID_START = makeSymbol("INFRNC-NEW-ANSWER-ID-START");
        $sym97$_CSETF_INFRNC_NEW_ANSWER_ID_START = makeSymbol("_CSETF-INFRNC-NEW-ANSWER-ID-START");
        $sym98$INFRNC_NEW_ANSWER_JUSTIFICATIONS = makeSymbol("INFRNC-NEW-ANSWER-JUSTIFICATIONS");
        $sym99$_CSETF_INFRNC_NEW_ANSWER_JUSTIFICATIONS = makeSymbol("_CSETF-INFRNC-NEW-ANSWER-JUSTIFICATIONS");
        $sym100$INFRNC_STATUS = makeSymbol("INFRNC-STATUS");
        $sym101$_CSETF_INFRNC_STATUS = makeSymbol("_CSETF-INFRNC-STATUS");
        $sym102$INFRNC_SUSPEND_STATUS = makeSymbol("INFRNC-SUSPEND-STATUS");
        $sym103$_CSETF_INFRNC_SUSPEND_STATUS = makeSymbol("_CSETF-INFRNC-SUSPEND-STATUS");
        $sym104$INFRNC_ROOT_LINK = makeSymbol("INFRNC-ROOT-LINK");
        $sym105$_CSETF_INFRNC_ROOT_LINK = makeSymbol("_CSETF-INFRNC-ROOT-LINK");
        $sym106$INFRNC_RELEVANT_PROBLEMS = makeSymbol("INFRNC-RELEVANT-PROBLEMS");
        $sym107$_CSETF_INFRNC_RELEVANT_PROBLEMS = makeSymbol("_CSETF-INFRNC-RELEVANT-PROBLEMS");
        $sym108$INFRNC_STRATEGY_SET = makeSymbol("INFRNC-STRATEGY-SET");
        $sym109$_CSETF_INFRNC_STRATEGY_SET = makeSymbol("_CSETF-INFRNC-STRATEGY-SET");
        $sym110$INFRNC_CONTROL_PROCESS = makeSymbol("INFRNC-CONTROL-PROCESS");
        $sym111$_CSETF_INFRNC_CONTROL_PROCESS = makeSymbol("_CSETF-INFRNC-CONTROL-PROCESS");
        $sym112$INFRNC_INTERRUPTING_PROCESSES = makeSymbol("INFRNC-INTERRUPTING-PROCESSES");
        $sym113$_CSETF_INFRNC_INTERRUPTING_PROCESSES = makeSymbol("_CSETF-INFRNC-INTERRUPTING-PROCESSES");
        $sym114$INFRNC_MAX_TRANSFORMATION_DEPTH_REACHED = makeSymbol("INFRNC-MAX-TRANSFORMATION-DEPTH-REACHED");
        $sym115$_CSETF_INFRNC_MAX_TRANSFORMATION_DEPTH_REACHED = makeSymbol("_CSETF-INFRNC-MAX-TRANSFORMATION-DEPTH-REACHED");
        $sym116$INFRNC_DISJUNCTION_FREE_EL_VARS_POLICY = makeSymbol("INFRNC-DISJUNCTION-FREE-EL-VARS-POLICY");
        $sym117$_CSETF_INFRNC_DISJUNCTION_FREE_EL_VARS_POLICY = makeSymbol("_CSETF-INFRNC-DISJUNCTION-FREE-EL-VARS-POLICY");
        $sym118$INFRNC_RESULT_UNIQUENESS_CRITERION = makeSymbol("INFRNC-RESULT-UNIQUENESS-CRITERION");
        $sym119$_CSETF_INFRNC_RESULT_UNIQUENESS_CRITERION = makeSymbol("_CSETF-INFRNC-RESULT-UNIQUENESS-CRITERION");
        $sym120$INFRNC_ALLOW_HL_PREDICATE_TRANSFORMATION_ = makeSymbol("INFRNC-ALLOW-HL-PREDICATE-TRANSFORMATION?");
        $sym121$_CSETF_INFRNC_ALLOW_HL_PREDICATE_TRANSFORMATION_ = makeSymbol("_CSETF-INFRNC-ALLOW-HL-PREDICATE-TRANSFORMATION?");
        $sym122$INFRNC_ALLOW_UNBOUND_PREDICATE_TRANSFORMATION_ = makeSymbol("INFRNC-ALLOW-UNBOUND-PREDICATE-TRANSFORMATION?");
        $sym123$_CSETF_INFRNC_ALLOW_UNBOUND_PREDICATE_TRANSFORMATION_ = makeSymbol("_CSETF-INFRNC-ALLOW-UNBOUND-PREDICATE-TRANSFORMATION?");
        $sym124$INFRNC_ALLOW_EVALUATABLE_PREDICATE_TRANSFORMATION_ = makeSymbol("INFRNC-ALLOW-EVALUATABLE-PREDICATE-TRANSFORMATION?");
        $sym125$_CSETF_INFRNC_ALLOW_EVALUATABLE_PREDICATE_TRANSFORMATION_ = makeSymbol("_CSETF-INFRNC-ALLOW-EVALUATABLE-PREDICATE-TRANSFORMATION?");
        $sym126$INFRNC_ALLOW_INDETERMINATE_RESULTS_ = makeSymbol("INFRNC-ALLOW-INDETERMINATE-RESULTS?");
        $sym127$_CSETF_INFRNC_ALLOW_INDETERMINATE_RESULTS_ = makeSymbol("_CSETF-INFRNC-ALLOW-INDETERMINATE-RESULTS?");
        $sym128$INFRNC_ALLOWED_RULES = makeSymbol("INFRNC-ALLOWED-RULES");
        $sym129$_CSETF_INFRNC_ALLOWED_RULES = makeSymbol("_CSETF-INFRNC-ALLOWED-RULES");
        $sym130$INFRNC_FORBIDDEN_RULES = makeSymbol("INFRNC-FORBIDDEN-RULES");
        $sym131$_CSETF_INFRNC_FORBIDDEN_RULES = makeSymbol("_CSETF-INFRNC-FORBIDDEN-RULES");
        $sym132$INFRNC_ALLOWED_MODULES = makeSymbol("INFRNC-ALLOWED-MODULES");
        $sym133$_CSETF_INFRNC_ALLOWED_MODULES = makeSymbol("_CSETF-INFRNC-ALLOWED-MODULES");
        $sym134$INFRNC_ALLOW_ABNORMALITY_CHECKING_ = makeSymbol("INFRNC-ALLOW-ABNORMALITY-CHECKING?");
        $sym135$_CSETF_INFRNC_ALLOW_ABNORMALITY_CHECKING_ = makeSymbol("_CSETF-INFRNC-ALLOW-ABNORMALITY-CHECKING?");
        $sym136$INFRNC_TRANSITIVE_CLOSURE_MODE = makeSymbol("INFRNC-TRANSITIVE-CLOSURE-MODE");
        $sym137$_CSETF_INFRNC_TRANSITIVE_CLOSURE_MODE = makeSymbol("_CSETF-INFRNC-TRANSITIVE-CLOSURE-MODE");
        $sym138$INFRNC_PROBLEM_STORE_PRIVATE_ = makeSymbol("INFRNC-PROBLEM-STORE-PRIVATE?");
        $sym139$_CSETF_INFRNC_PROBLEM_STORE_PRIVATE_ = makeSymbol("_CSETF-INFRNC-PROBLEM-STORE-PRIVATE?");
        $sym140$INFRNC_CONTINUABLE_ = makeSymbol("INFRNC-CONTINUABLE?");
        $sym141$_CSETF_INFRNC_CONTINUABLE_ = makeSymbol("_CSETF-INFRNC-CONTINUABLE?");
        $sym142$INFRNC_BROWSABLE_ = makeSymbol("INFRNC-BROWSABLE?");
        $sym143$_CSETF_INFRNC_BROWSABLE_ = makeSymbol("_CSETF-INFRNC-BROWSABLE?");
        $sym144$INFRNC_RETURN_TYPE = makeSymbol("INFRNC-RETURN-TYPE");
        $sym145$_CSETF_INFRNC_RETURN_TYPE = makeSymbol("_CSETF-INFRNC-RETURN-TYPE");
        $sym146$INFRNC_ANSWER_LANGUAGE = makeSymbol("INFRNC-ANSWER-LANGUAGE");
        $sym147$_CSETF_INFRNC_ANSWER_LANGUAGE = makeSymbol("_CSETF-INFRNC-ANSWER-LANGUAGE");
        $sym148$INFRNC_CACHE_RESULTS_ = makeSymbol("INFRNC-CACHE-RESULTS?");
        $sym149$_CSETF_INFRNC_CACHE_RESULTS_ = makeSymbol("_CSETF-INFRNC-CACHE-RESULTS?");
        $sym150$INFRNC_BLOCKING_ = makeSymbol("INFRNC-BLOCKING?");
        $sym151$_CSETF_INFRNC_BLOCKING_ = makeSymbol("_CSETF-INFRNC-BLOCKING?");
        $sym152$INFRNC_MAX_NUMBER = makeSymbol("INFRNC-MAX-NUMBER");
        $sym153$_CSETF_INFRNC_MAX_NUMBER = makeSymbol("_CSETF-INFRNC-MAX-NUMBER");
        $sym154$INFRNC_MAX_TIME = makeSymbol("INFRNC-MAX-TIME");
        $sym155$_CSETF_INFRNC_MAX_TIME = makeSymbol("_CSETF-INFRNC-MAX-TIME");
        $sym156$INFRNC_MAX_STEP = makeSymbol("INFRNC-MAX-STEP");
        $sym157$_CSETF_INFRNC_MAX_STEP = makeSymbol("_CSETF-INFRNC-MAX-STEP");
        $sym158$INFRNC_MODE = makeSymbol("INFRNC-MODE");
        $sym159$_CSETF_INFRNC_MODE = makeSymbol("_CSETF-INFRNC-MODE");
        $sym160$INFRNC_FORWARD_MAX_TIME = makeSymbol("INFRNC-FORWARD-MAX-TIME");
        $sym161$_CSETF_INFRNC_FORWARD_MAX_TIME = makeSymbol("_CSETF-INFRNC-FORWARD-MAX-TIME");
        $sym162$INFRNC_MAX_PROOF_DEPTH = makeSymbol("INFRNC-MAX-PROOF-DEPTH");
        $sym163$_CSETF_INFRNC_MAX_PROOF_DEPTH = makeSymbol("_CSETF-INFRNC-MAX-PROOF-DEPTH");
        $sym164$INFRNC_MAX_TRANSFORMATION_DEPTH = makeSymbol("INFRNC-MAX-TRANSFORMATION-DEPTH");
        $sym165$_CSETF_INFRNC_MAX_TRANSFORMATION_DEPTH = makeSymbol("_CSETF-INFRNC-MAX-TRANSFORMATION-DEPTH");
        $sym166$INFRNC_MIN_RULE_UTILITY = makeSymbol("INFRNC-MIN-RULE-UTILITY");
        $sym167$_CSETF_INFRNC_MIN_RULE_UTILITY = makeSymbol("_CSETF-INFRNC-MIN-RULE-UTILITY");
        $sym168$INFRNC_PROBABLY_APPROXIMATELY_DONE = makeSymbol("INFRNC-PROBABLY-APPROXIMATELY-DONE");
        $sym169$_CSETF_INFRNC_PROBABLY_APPROXIMATELY_DONE = makeSymbol("_CSETF-INFRNC-PROBABLY-APPROXIMATELY-DONE");
        $sym170$INFRNC_METRICS_TEMPLATE = makeSymbol("INFRNC-METRICS-TEMPLATE");
        $sym171$_CSETF_INFRNC_METRICS_TEMPLATE = makeSymbol("_CSETF-INFRNC-METRICS-TEMPLATE");
        $sym172$INFRNC_START_UNIVERSAL_TIME = makeSymbol("INFRNC-START-UNIVERSAL-TIME");
        $sym173$_CSETF_INFRNC_START_UNIVERSAL_TIME = makeSymbol("_CSETF-INFRNC-START-UNIVERSAL-TIME");
        $sym174$INFRNC_START_INTERNAL_REAL_TIME = makeSymbol("INFRNC-START-INTERNAL-REAL-TIME");
        $sym175$_CSETF_INFRNC_START_INTERNAL_REAL_TIME = makeSymbol("_CSETF-INFRNC-START-INTERNAL-REAL-TIME");
        $sym176$INFRNC_END_INTERNAL_REAL_TIME = makeSymbol("INFRNC-END-INTERNAL-REAL-TIME");
        $sym177$_CSETF_INFRNC_END_INTERNAL_REAL_TIME = makeSymbol("_CSETF-INFRNC-END-INTERNAL-REAL-TIME");
        $sym178$INFRNC_PAD_INTERNAL_REAL_TIME = makeSymbol("INFRNC-PAD-INTERNAL-REAL-TIME");
        $sym179$_CSETF_INFRNC_PAD_INTERNAL_REAL_TIME = makeSymbol("_CSETF-INFRNC-PAD-INTERNAL-REAL-TIME");
        $sym180$INFRNC_HYPOTHESIZATION_TIME = makeSymbol("INFRNC-HYPOTHESIZATION-TIME");
        $sym181$_CSETF_INFRNC_HYPOTHESIZATION_TIME = makeSymbol("_CSETF-INFRNC-HYPOTHESIZATION-TIME");
        $sym182$INFRNC_CUMULATIVE_TIME = makeSymbol("INFRNC-CUMULATIVE-TIME");
        $sym183$_CSETF_INFRNC_CUMULATIVE_TIME = makeSymbol("_CSETF-INFRNC-CUMULATIVE-TIME");
        $sym184$INFRNC_STEP_COUNT = makeSymbol("INFRNC-STEP-COUNT");
        $sym185$_CSETF_INFRNC_STEP_COUNT = makeSymbol("_CSETF-INFRNC-STEP-COUNT");
        $sym186$INFRNC_CUMULATIVE_STEP_COUNT = makeSymbol("INFRNC-CUMULATIVE-STEP-COUNT");
        $sym187$_CSETF_INFRNC_CUMULATIVE_STEP_COUNT = makeSymbol("_CSETF-INFRNC-CUMULATIVE-STEP-COUNT");
        $sym188$INFRNC_EVENTS = makeSymbol("INFRNC-EVENTS");
        $sym189$_CSETF_INFRNC_EVENTS = makeSymbol("_CSETF-INFRNC-EVENTS");
        $sym190$INFRNC_HALT_CONDITIONS = makeSymbol("INFRNC-HALT-CONDITIONS");
        $sym191$_CSETF_INFRNC_HALT_CONDITIONS = makeSymbol("_CSETF-INFRNC-HALT-CONDITIONS");
        $sym192$INFRNC_ACCUMULATORS = makeSymbol("INFRNC-ACCUMULATORS");
        $sym193$_CSETF_INFRNC_ACCUMULATORS = makeSymbol("_CSETF-INFRNC-ACCUMULATORS");
        $sym194$INFRNC_PROOF_WATERMARK = makeSymbol("INFRNC-PROOF-WATERMARK");
        $sym195$_CSETF_INFRNC_PROOF_WATERMARK = makeSymbol("_CSETF-INFRNC-PROOF-WATERMARK");
        $sym196$INFRNC_PROBLEM_WORKING_TIME_DATA = makeSymbol("INFRNC-PROBLEM-WORKING-TIME-DATA");
        $sym197$_CSETF_INFRNC_PROBLEM_WORKING_TIME_DATA = makeSymbol("_CSETF-INFRNC-PROBLEM-WORKING-TIME-DATA");
        $sym198$INFRNC_TYPE = makeSymbol("INFRNC-TYPE");
        $sym199$_CSETF_INFRNC_TYPE = makeSymbol("_CSETF-INFRNC-TYPE");
        $sym200$INFRNC_DATA = makeSymbol("INFRNC-DATA");
        $sym201$_CSETF_INFRNC_DATA = makeSymbol("_CSETF-INFRNC-DATA");
        $sym202$INFRNC_PROPERTIES = makeSymbol("INFRNC-PROPERTIES");
        $sym203$_CSETF_INFRNC_PROPERTIES = makeSymbol("_CSETF-INFRNC-PROPERTIES");
        $SUID = makeKeyword("SUID");
        $PROBLEM_STORE = makeKeyword("PROBLEM-STORE");
        $FORWARD_PROPAGATE = makeKeyword("FORWARD-PROPAGATE");
        $INPUT_MT = makeKeyword("INPUT-MT");
        $INPUT_EL_QUERY = makeKeyword("INPUT-EL-QUERY");
        $INPUT_NON_EXPLANATORY_EL_QUERY = makeKeyword("INPUT-NON-EXPLANATORY-EL-QUERY");
        $INPUT_QUERY_PROPERTIES = makeKeyword("INPUT-QUERY-PROPERTIES");
        $MT = makeKeyword("MT");
        $EL_QUERY = makeKeyword("EL-QUERY");
        $EL_BINDINGS = makeKeyword("EL-BINDINGS");
        $HL_QUERY = makeKeyword("HL-QUERY");
        $EXPLANATORY_SUBQUERY = makeKeyword("EXPLANATORY-SUBQUERY");
        $NON_EXPLANATORY_SUBQUERY = makeKeyword("NON-EXPLANATORY-SUBQUERY");
        $FREE_HL_VARS = makeKeyword("FREE-HL-VARS");
        $HYPOTHETICAL_BINDINGS = makeKeyword("HYPOTHETICAL-BINDINGS");
        $ANSWER_ID_INDEX = makeKeyword("ANSWER-ID-INDEX");
        $ANSWER_BINDINGS_INDEX = makeKeyword("ANSWER-BINDINGS-INDEX");
        $NEW_ANSWER_ID_START = makeKeyword("NEW-ANSWER-ID-START");
        $NEW_ANSWER_JUSTIFICATIONS = makeKeyword("NEW-ANSWER-JUSTIFICATIONS");
        $STATUS = makeKeyword("STATUS");
        $SUSPEND_STATUS = makeKeyword("SUSPEND-STATUS");
        $ROOT_LINK = makeKeyword("ROOT-LINK");
        $RELEVANT_PROBLEMS = makeKeyword("RELEVANT-PROBLEMS");
        $STRATEGY_SET = makeKeyword("STRATEGY-SET");
        $CONTROL_PROCESS = makeKeyword("CONTROL-PROCESS");
        $INTERRUPTING_PROCESSES = makeKeyword("INTERRUPTING-PROCESSES");
        $MAX_TRANSFORMATION_DEPTH_REACHED = makeKeyword("MAX-TRANSFORMATION-DEPTH-REACHED");
        $DISJUNCTION_FREE_EL_VARS_POLICY = makeKeyword("DISJUNCTION-FREE-EL-VARS-POLICY");
        $RESULT_UNIQUENESS_CRITERION = makeKeyword("RESULT-UNIQUENESS-CRITERION");
        $ALLOW_HL_PREDICATE_TRANSFORMATION_ = makeKeyword("ALLOW-HL-PREDICATE-TRANSFORMATION?");
        $ALLOW_UNBOUND_PREDICATE_TRANSFORMATION_ = makeKeyword("ALLOW-UNBOUND-PREDICATE-TRANSFORMATION?");
        $ALLOW_EVALUATABLE_PREDICATE_TRANSFORMATION_ = makeKeyword("ALLOW-EVALUATABLE-PREDICATE-TRANSFORMATION?");
        $ALLOW_INDETERMINATE_RESULTS_ = makeKeyword("ALLOW-INDETERMINATE-RESULTS?");
        $ALLOWED_RULES = makeKeyword("ALLOWED-RULES");
        $FORBIDDEN_RULES = makeKeyword("FORBIDDEN-RULES");
        $ALLOWED_MODULES = makeKeyword("ALLOWED-MODULES");
        $ALLOW_ABNORMALITY_CHECKING_ = makeKeyword("ALLOW-ABNORMALITY-CHECKING?");
        $TRANSITIVE_CLOSURE_MODE = makeKeyword("TRANSITIVE-CLOSURE-MODE");
        $PROBLEM_STORE_PRIVATE_ = makeKeyword("PROBLEM-STORE-PRIVATE?");
        $CONTINUABLE_ = makeKeyword("CONTINUABLE?");
        $BROWSABLE_ = makeKeyword("BROWSABLE?");
        $RETURN_TYPE = makeKeyword("RETURN-TYPE");
        $ANSWER_LANGUAGE = makeKeyword("ANSWER-LANGUAGE");
        $CACHE_RESULTS_ = makeKeyword("CACHE-RESULTS?");
        $BLOCKING_ = makeKeyword("BLOCKING?");
        $MAX_NUMBER = makeKeyword("MAX-NUMBER");
        $MAX_TIME = makeKeyword("MAX-TIME");
        $MAX_STEP = makeKeyword("MAX-STEP");
        $MODE = makeKeyword("MODE");
        $FORWARD_MAX_TIME = makeKeyword("FORWARD-MAX-TIME");
        $MAX_PROOF_DEPTH = makeKeyword("MAX-PROOF-DEPTH");
        $MAX_TRANSFORMATION_DEPTH = makeKeyword("MAX-TRANSFORMATION-DEPTH");
        $MIN_RULE_UTILITY = makeKeyword("MIN-RULE-UTILITY");
        $PROBABLY_APPROXIMATELY_DONE = makeKeyword("PROBABLY-APPROXIMATELY-DONE");
        $METRICS_TEMPLATE = makeKeyword("METRICS-TEMPLATE");
        $START_UNIVERSAL_TIME = makeKeyword("START-UNIVERSAL-TIME");
        $START_INTERNAL_REAL_TIME = makeKeyword("START-INTERNAL-REAL-TIME");
        $END_INTERNAL_REAL_TIME = makeKeyword("END-INTERNAL-REAL-TIME");
        $PAD_INTERNAL_REAL_TIME = makeKeyword("PAD-INTERNAL-REAL-TIME");
        $HYPOTHESIZATION_TIME = makeKeyword("HYPOTHESIZATION-TIME");
        $CUMULATIVE_TIME = makeKeyword("CUMULATIVE-TIME");
        $STEP_COUNT = makeKeyword("STEP-COUNT");
        $CUMULATIVE_STEP_COUNT = makeKeyword("CUMULATIVE-STEP-COUNT");
        $EVENTS = makeKeyword("EVENTS");
        $HALT_CONDITIONS = makeKeyword("HALT-CONDITIONS");
        $ACCUMULATORS = makeKeyword("ACCUMULATORS");
        $PROOF_WATERMARK = makeKeyword("PROOF-WATERMARK");
        $PROBLEM_WORKING_TIME_DATA = makeKeyword("PROBLEM-WORKING-TIME-DATA");
        $TYPE = makeKeyword("TYPE");
        $DATA = makeKeyword("DATA");
        $PROPERTIES = makeKeyword("PROPERTIES");
        $str275$Invalid_slot__S_for_construction_ = makeString("Invalid slot ~S for construction function");
        $BEGIN = makeKeyword("BEGIN");
        $sym277$MAKE_INFERENCE = makeSymbol("MAKE-INFERENCE");
        $SLOT = makeKeyword("SLOT");
        $END = makeKeyword("END");
        $sym280$VISIT_DEFSTRUCT_OBJECT_INFERENCE_METHOD = makeSymbol("VISIT-DEFSTRUCT-OBJECT-INFERENCE-METHOD");
        $DEAD = makeKeyword("DEAD");
        $str282$_Invalid_INFERENCE__s_ = makeString("<Invalid INFERENCE ~s>");
        $str283$_INFERENCE__a__a__a__s_in__s_ = makeString("<INFERENCE ~a.~a:~a:~s in ~s>");
        $sym284$SXHASH_INFERENCE_METHOD = makeSymbol("SXHASH-INFERENCE-METHOD");
        $NEW = makeKeyword("NEW");
        $PREPARED = makeKeyword("PREPARED");
        $READY = makeKeyword("READY");
        $RUNNING = makeKeyword("RUNNING");
        $SUSPENDED = makeKeyword("SUSPENDED");
        $list290 = list(list(makeSymbol("PROBLEM-VAR"), makeSymbol("INFERENCE")), makeSymbol("&BODY"), makeSymbol("BODY"));
        $sym291$DO_SET = makeSymbol("DO-SET");
        $sym292$INFERENCE_RELEVANT_PROBLEMS = makeSymbol("INFERENCE-RELEVANT-PROBLEMS");
        $list293 = list(list(makeSymbol("JUST-VAR"), makeSymbol("INFERENCE")), makeSymbol("&BODY"), makeSymbol("BODY"));
        $sym294$DO_QUEUE_ELEMENTS = makeSymbol("DO-QUEUE-ELEMENTS");
        $sym295$INFERENCE_NEW_ANSWER_JUSTIFICATIONS = makeSymbol("INFERENCE-NEW-ANSWER-JUSTIFICATIONS");
        $list296 = list(list(makeSymbol("ANSWER-VAR"), makeSymbol("INFERENCE")), makeSymbol("&BODY"), makeSymbol("BODY"));
        $sym297$START_ID = makeUninternedSymbol("START-ID");
        $sym298$END_ID = makeUninternedSymbol("END-ID");
        $sym299$ID = makeUninternedSymbol("ID");
        $sym300$INF = makeUninternedSymbol("INF");
        $sym301$CLET = makeSymbol("CLET");
        $sym302$INFERENCE_NEW_ANSWER_ID_START = makeSymbol("INFERENCE-NEW-ANSWER-ID-START");
        $sym303$INFERENCE_NEXT_NEW_ANSWER_ID = makeSymbol("INFERENCE-NEXT-NEW-ANSWER-ID");
        $sym304$CDO = makeSymbol("CDO");
        $sym305$1_ = makeSymbol("1+");
        $sym306$__ = makeSymbol(">=");
        $sym307$FIND_INFERENCE_ANSWER_BY_ID = makeSymbol("FIND-INFERENCE-ANSWER-BY-ID");
        $list308 = list(list(makeSymbol("ANSWER-VAR"), makeSymbol("INFERENCE"), makeSymbol("&KEY"), makeSymbol("ORDERED")), makeSymbol("&BODY"), makeSymbol("BODY"));
        $list309 = list(makeKeyword("ORDERED"));
        $ALLOW_OTHER_KEYS = makeKeyword("ALLOW-OTHER-KEYS");
        $ORDERED = makeKeyword("ORDERED");
        $sym312$ID = makeUninternedSymbol("ID");
        $sym313$DO_ID_INDEX = makeSymbol("DO-ID-INDEX");
        $sym314$INFERENCE_ANSWER_ID_INDEX = makeSymbol("INFERENCE-ANSWER-ID-INDEX");
        $sym315$IGNORE = makeSymbol("IGNORE");
        $list316 = list(list(makeSymbol("ANSWER-VAR"), makeSymbol("INFERENCE"), makeSymbol("START-INDEX")), makeSymbol("&BODY"), makeSymbol("BODY"));
        $sym317$START_ID = makeUninternedSymbol("START-ID");
        $sym318$END_ID = makeUninternedSymbol("END-ID");
        $sym319$ID = makeUninternedSymbol("ID");
        $sym320$INF = makeUninternedSymbol("INF");
        $sym321$CSETQ = makeSymbol("CSETQ");
        $sym322$ANSWER = makeUninternedSymbol("ANSWER");
        $sym323$DO_INFERENCE_ANSWERS = makeSymbol("DO-INFERENCE-ANSWERS");
        $sym324$DO_INFERENCE_ANSWER_JUSTIFICATIONS = makeSymbol("DO-INFERENCE-ANSWER-JUSTIFICATIONS");
        $list325 = list(list(makeSymbol("PROCESS-VAR"), makeSymbol("INFERENCE")), makeSymbol("&BODY"), makeSymbol("BODY"));
        $sym326$DO_QUEUE_DEQUEUE = makeSymbol("DO-QUEUE-DEQUEUE");
        $sym327$INFERENCE_INTERRUPTING_PROCESSES = makeSymbol("INFERENCE-INTERRUPTING-PROCESSES");
        $list328 = list(list(makeSymbol("PROOF-VAR"), makeSymbol("INFERENCE"), makeSymbol("&KEY"), makeSymbol("PROOF-STATUS")), makeSymbol("&BODY"), makeSymbol("BODY"));
        $list329 = list(makeKeyword("PROOF-STATUS"));
        $PROOF_STATUS = makeKeyword("PROOF-STATUS");
        $sym331$ROOT_PROBLEM = makeUninternedSymbol("ROOT-PROBLEM");
        $sym332$INFERENCE_ROOT_PROBLEM = makeSymbol("INFERENCE-ROOT-PROBLEM");
        $sym333$PWHEN = makeSymbol("PWHEN");
        $sym334$DO_PROBLEM_PROOFS = makeSymbol("DO-PROBLEM-PROOFS");
        $list335 = list(list(makeSymbol("RULE-VAR"), makeSymbol("INFERENCE"), makeSymbol("&KEY"), makeSymbol("DONE")), makeSymbol("&BODY"), makeSymbol("BODY"));
        $list336 = list(makeKeyword("DONE"));
        $DONE = makeKeyword("DONE");
        $sym338$INFERENCE_ALLOWED_RULES = makeSymbol("INFERENCE-ALLOWED-RULES");
        $list339 = list(list(makeSymbol("INFERENCE")), makeSymbol("&BODY"), makeSymbol("BODY"));
        $sym340$WITH_LOCK_HELD = makeSymbol("WITH-LOCK-HELD");
        $sym341$INFERENCE_PROBLEM_WORKING_TIME_LOCK = makeSymbol("INFERENCE-PROBLEM-WORKING-TIME-LOCK");
        $sym342$PROBLEM_STORE_P = makeSymbol("PROBLEM-STORE-P");
        $TAUTOLOGY = makeKeyword("TAUTOLOGY");
        $IGNORE_ERRORS_TARGET = makeKeyword("IGNORE-ERRORS-TARGET");
        $sym345$IGNORE_ERRORS_HANDLER = makeSymbol("IGNORE-ERRORS-HANDLER", "SUBLISP");
        $FREE = makeKeyword("FREE");
        $sym347$DO_INFERENCE_NEW_ANSWERS = makeSymbol("DO-INFERENCE-NEW-ANSWERS");
        $sym348$DO_INFERENCE_NEW_ANSWER_JUSTIFICATIONS = makeSymbol("DO-INFERENCE-NEW-ANSWER-JUSTIFICATIONS");
        $sym349$FORWARD_PROPAGATE_P = makeSymbol("FORWARD-PROPAGATE-P");
        $sym350$POSSIBLY_MT_P = makeSymbol("POSSIBLY-MT-P");
        $sym351$POSSIBLY_INFERENCE_SENTENCE_P = makeSymbol("POSSIBLY-INFERENCE-SENTENCE-P");
        $sym352$QUERY_PROPERTIES_P = makeSymbol("QUERY-PROPERTIES-P");
        $sym353$HLMT_P = makeSymbol("HLMT-P");
        $sym354$BINDING_LIST_P = makeSymbol("BINDING-LIST-P");
        $sym355$PROBLEM_QUERY_P = makeSymbol("PROBLEM-QUERY-P");
        $sym356$EXPLANATORY_SUBQUERY_SPEC_P = makeSymbol("EXPLANATORY-SUBQUERY-SPEC-P");
        $sym357$NON_EXPLANATORY_SUBQUERY_SPEC_P = makeSymbol("NON-EXPLANATORY-SUBQUERY-SPEC-P");
        $sym358$LISTP = makeSymbol("LISTP");
        $sym359$INFERENCE_STATUS_P = makeSymbol("INFERENCE-STATUS-P");
        $sym360$INFERENCE_SUSPEND_STATUS_P = makeSymbol("INFERENCE-SUSPEND-STATUS-P");
        $sym361$ANSWER_LINK_P = makeSymbol("ANSWER-LINK-P");
        $sym362$PROCESSP = makeSymbol("PROCESSP");
        $sym363$NON_NEGATIVE_INTEGER_P = makeSymbol("NON-NEGATIVE-INTEGER-P");
        $sym364$INFERENCE_DISJUNCTION_FREE_EL_VARS_POLICY_P = makeSymbol("INFERENCE-DISJUNCTION-FREE-EL-VARS-POLICY-P");
        $sym365$RESULT_UNIQUENESS_CRITERION_P = makeSymbol("RESULT-UNIQUENESS-CRITERION-P");
        $sym366$BOOLEANP = makeSymbol("BOOLEANP");
        $sym367$ALLOWED_MODULES_SPEC_P = makeSymbol("ALLOWED-MODULES-SPEC-P");
        $sym368$INFERENCE_TRANSITIVE_CLOSURE_MODE_P = makeSymbol("INFERENCE-TRANSITIVE-CLOSURE-MODE-P");
        $sym369$INFERENCE_RETURN_TYPE_P = makeSymbol("INFERENCE-RETURN-TYPE-P");
        $sym370$INFERENCE_ANSWER_LANGUAGE_P = makeSymbol("INFERENCE-ANSWER-LANGUAGE-P");
        $sym371$NON_NEGATIVE_NUMBER_P = makeSymbol("NON-NEGATIVE-NUMBER-P");
        $sym372$INFERENCE_MODE_P = makeSymbol("INFERENCE-MODE-P");
        $str373$Forward_max_time__s_cannot_be_gre = makeString("Forward max time ~s cannot be greater than max time ~s");
        $sym374$RULE_UTILITY_P = makeSymbol("RULE-UTILITY-P");
        $sym375$PROBABILITY_P = makeSymbol("PROBABILITY-P");
        $sym376$NON_DOTTED_LIST_P = makeSymbol("NON-DOTTED-LIST-P");
        $sym377$QUERY_METRIC_P = makeSymbol("QUERY-METRIC-P");
        $sym378$UNIVERSAL_TIME_P = makeSymbol("UNIVERSAL-TIME-P");
        $sym379$POTENTIALLY_INFINITE_INTEGER_P = makeSymbol("POTENTIALLY-INFINITE-INTEGER-P");
        $sym380$NUMBERP = makeSymbol("NUMBERP");
        $sym381$INFERENCE_EVENT_TYPE_P = makeSymbol("INFERENCE-EVENT-TYPE-P");
        $sym382$INFERENCE_HALT_CONDITION_P = makeSymbol("INFERENCE-HALT-CONDITION-P");
        $sym383$INFERENCE_TYPE_P = makeSymbol("INFERENCE-TYPE-P");
        $sym384$PROPERTY_LIST_P = makeSymbol("PROPERTY-LIST-P");
        $list385 = list(list(makeSymbol("STORE-ID-VAR"), makeSymbol("INFERENCE-ID-VAR"), makeSymbol("INFERENCE")), makeSymbol("&BODY"), makeSymbol("BODY"));
        $sym386$INFERENCE_VAR = makeUninternedSymbol("INFERENCE-VAR");
        $sym387$INFERENCE_PROBLEM_STORE_SUID = makeSymbol("INFERENCE-PROBLEM-STORE-SUID");
        $sym388$INFERENCE_SUID = makeSymbol("INFERENCE-SUID");
        $SKIP = makeKeyword("SKIP");
        $sym390$SUCCESSFUL_INFERENCE_P = makeSymbol("SUCCESSFUL-INFERENCE-P");
        $NEG = makeKeyword("NEG");
        $list392 = list(makeSymbol("MT"), makeSymbol("ASENT"));
        $sym393$HLMT_EQUAL = makeSymbol("HLMT-EQUAL");
        $POS = makeKeyword("POS");
        $list395 = list(makeSymbol("HL-MT"), makeSymbol("ASENT"));
        $sym396$QUERY_PROPERTY_P = makeSymbol("QUERY-PROPERTY-P");
        $sym397$NEW_CYC_QUERY = makeSymbol("NEW-CYC-QUERY");
        $str398$_new_cyc_query_A = makeString("(new-cyc-query~A");
        $str399$_____A = makeString("~%  ~A");
        $str400$_A = makeString("~A");
        $str401$_____list______ = makeString("~%  (list~%    ");
        $DOWNCASE = makeKeyword("DOWNCASE");
        $str403$_S__find_problem_store_by_id__S__ = makeString("~S (find-problem-store-by-id ~S)~%    ");
        $ALL = makeKeyword("ALL");
        $str405$_S__list = makeString("~S (list");
        $str406$_________find_object_by_hl_extern = makeString("~&      (find-object-by-hl-external-id-string ~S)");
        $str407$_______ = makeString(")~%    ");
        $str408$_S__S______ = makeString("~S ~S~%    ");
        $str409$_ = makeString(")");
        $PROOF = makeKeyword("PROOF");
        $BINDINGS = makeKeyword("BINDINGS");
        $NONE = makeKeyword("NONE");
        $list413 = list(makeSymbol("PROBLEM-STORE-SUID"), makeSymbol("INFERENCE-SUID"), makeSymbol("ANSWER-SUID"));
        $sym414$INFERENCE_ACCUMULATOR_TYPE_P = makeSymbol("INFERENCE-ACCUMULATOR-TYPE-P");
        $sym415$ACCUMULATOR_P = makeSymbol("ACCUMULATOR-P");
        $sym416$_PAD_TIMES_TO_FIRST_ANSWER_ = makeSymbol("*PAD-TIMES-TO-FIRST-ANSWER*");
        $UNINITIALIZED = makeKeyword("UNINITIALIZED");
        $POSITIVE_INFINITY = makeKeyword("POSITIVE-INFINITY");
        $sym419$_ = makeSymbol("<");
        $LOOK_NO_DEEPER_FOR_ADDITIONAL_ANSWERS = makeKeyword("LOOK-NO-DEEPER-FOR-ADDITIONAL-ANSWERS");
        $str421$got_a_null_answer_for__s = makeString("got a null answer for ~s");
        $GOOD = makeKeyword("GOOD");
        $TACTICAL = makeKeyword("TACTICAL");
        $NO_GOOD = makeKeyword("NO-GOOD");
        $NEUTRAL = makeKeyword("NEUTRAL");
        $sym426$INFERENCE_STATIC_PROPERTIES_P = makeSymbol("INFERENCE-STATIC-PROPERTIES-P");
        $sym427$ALLOWED_RULES_SPEC_P = makeSymbol("ALLOWED-RULES-SPEC-P");
        $sym428$FORBIDDEN_RULES_SPEC_P = makeSymbol("FORBIDDEN-RULES-SPEC-P");
        $sym429$QUERY_DYNAMIC_PROPERTIES_P = makeSymbol("QUERY-DYNAMIC-PROPERTIES-P");
        $INFERENCE_MODE = makeKeyword("INFERENCE-MODE");
        $sym431$PROBLEM_P = makeSymbol("PROBLEM-P");
        $sym432$STRATEGY_P = makeSymbol("STRATEGY-P");
        $sym433$INFERENCE_ANSWER_P = makeSymbol("INFERENCE-ANSWER-P");
        $sym434$INFERENCE_ANSWER_JUSTIFICATION_P = makeSymbol("INFERENCE-ANSWER-JUSTIFICATION-P");
        $str435$variables__S_were_removed = makeString("variables ~S were removed");
        $str436$variables__S_were_added = makeString("variables ~S were added");
        $str437$variables__S_contain_duplications = makeString("variables ~S contain duplications");
        $SIMPLEST = makeKeyword("SIMPLEST");
        $sym439$SIMPLEST_INFERENCE_P = makeSymbol("SIMPLEST-INFERENCE-P");
        $sym440$STRATEGY_TYPE_P = makeSymbol("STRATEGY-TYPE-P");
        $sym441$INFERENCE_ANSWER = makeSymbol("INFERENCE-ANSWER");
        $list442 = list(makeSymbol("SUID"), makeSymbol("INFERENCE"), makeSymbol("BINDINGS"), makeSymbol("JUSTIFICATIONS"), makeSymbol("ELAPSED-CREATION-TIME"), makeSymbol("STEP-COUNT"));
        $list443 = list(makeKeyword("SUID"), makeKeyword("INFERENCE"), makeKeyword("BINDINGS"), makeKeyword("JUSTIFICATIONS"), makeKeyword("ELAPSED-CREATION-TIME"), makeKeyword("STEP-COUNT"));
        $list444 = list(makeSymbol("INF-ANSWER-SUID"), makeSymbol("INF-ANSWER-INFERENCE"), makeSymbol("INF-ANSWER-BINDINGS"), makeSymbol("INF-ANSWER-JUSTIFICATIONS"), makeSymbol("INF-ANSWER-ELAPSED-CREATION-TIME"), makeSymbol("INF-ANSWER-STEP-COUNT"));
        $list445 = list(makeSymbol("_CSETF-INF-ANSWER-SUID"), makeSymbol("_CSETF-INF-ANSWER-INFERENCE"), makeSymbol("_CSETF-INF-ANSWER-BINDINGS"), makeSymbol("_CSETF-INF-ANSWER-JUSTIFICATIONS"), makeSymbol("_CSETF-INF-ANSWER-ELAPSED-CREATION-TIME"), makeSymbol("_CSETF-INF-ANSWER-STEP-COUNT"));
        $sym446$PRINT_INFERENCE_ANSWER = makeSymbol("PRINT-INFERENCE-ANSWER");
        $sym447$INFERENCE_ANSWER_PRINT_FUNCTION_TRAMPOLINE = makeSymbol("INFERENCE-ANSWER-PRINT-FUNCTION-TRAMPOLINE");
        $list448 = list(makeSymbol("OPTIMIZE-FUNCALL"), makeSymbol("INFERENCE-ANSWER-P"));
        $sym449$INF_ANSWER_SUID = makeSymbol("INF-ANSWER-SUID");
        $sym450$_CSETF_INF_ANSWER_SUID = makeSymbol("_CSETF-INF-ANSWER-SUID");
        $sym451$INF_ANSWER_INFERENCE = makeSymbol("INF-ANSWER-INFERENCE");
        $sym452$_CSETF_INF_ANSWER_INFERENCE = makeSymbol("_CSETF-INF-ANSWER-INFERENCE");
        $sym453$INF_ANSWER_BINDINGS = makeSymbol("INF-ANSWER-BINDINGS");
        $sym454$_CSETF_INF_ANSWER_BINDINGS = makeSymbol("_CSETF-INF-ANSWER-BINDINGS");
        $sym455$INF_ANSWER_JUSTIFICATIONS = makeSymbol("INF-ANSWER-JUSTIFICATIONS");
        $sym456$_CSETF_INF_ANSWER_JUSTIFICATIONS = makeSymbol("_CSETF-INF-ANSWER-JUSTIFICATIONS");
        $sym457$INF_ANSWER_ELAPSED_CREATION_TIME = makeSymbol("INF-ANSWER-ELAPSED-CREATION-TIME");
        $sym458$_CSETF_INF_ANSWER_ELAPSED_CREATION_TIME = makeSymbol("_CSETF-INF-ANSWER-ELAPSED-CREATION-TIME");
        $sym459$INF_ANSWER_STEP_COUNT = makeSymbol("INF-ANSWER-STEP-COUNT");
        $sym460$_CSETF_INF_ANSWER_STEP_COUNT = makeSymbol("_CSETF-INF-ANSWER-STEP-COUNT");
        $INFERENCE = makeKeyword("INFERENCE");
        $JUSTIFICATIONS = makeKeyword("JUSTIFICATIONS");
        $ELAPSED_CREATION_TIME = makeKeyword("ELAPSED-CREATION-TIME");
        $sym464$MAKE_INFERENCE_ANSWER = makeSymbol("MAKE-INFERENCE-ANSWER");
        $sym465$VISIT_DEFSTRUCT_OBJECT_INFERENCE_ANSWER_METHOD = makeSymbol("VISIT-DEFSTRUCT-OBJECT-INFERENCE-ANSWER-METHOD");
        $str466$_Invalid_INFERENCE_ANSWER__s_ = makeString("<Invalid INFERENCE-ANSWER ~s>");
        $str467$_INFERENCE_ANSWER__a_for_INFERENC = makeString("<INFERENCE-ANSWER ~a for INFERENCE ~a.~a:~a>");
        $sym468$SXHASH_INFERENCE_ANSWER_METHOD = makeSymbol("SXHASH-INFERENCE-ANSWER-METHOD");
        $sym469$BINDINGS_P = makeSymbol("BINDINGS-P");
        $list470 = list(list(makeSymbol("JUST-VAR"), makeSymbol("INFERENCE-ANSWER")), makeSymbol("&BODY"), makeSymbol("BODY"));
        $sym471$DO_LIST = makeSymbol("DO-LIST");
        $sym472$INFERENCE_ANSWER_JUSTIFICATIONS = makeSymbol("INFERENCE-ANSWER-JUSTIFICATIONS");
        $list473 = list(list(makeSymbol("JUST-VAR"), makeSymbol("INDEX-VAR"), makeSymbol("INFERENCE-ANSWER")), makeSymbol("&BODY"), makeSymbol("BODY"));
        $sym474$CDOLIST_NUMBERED = makeSymbol("CDOLIST-NUMBERED");
        $sym475$JUSTIFICATION_EQUAL = makeSymbol("JUSTIFICATION-EQUAL");
        $sym476$INFERENCE_ANSWER_JUSTIFICATION_SUPPORTS = makeSymbol("INFERENCE-ANSWER-JUSTIFICATION-SUPPORTS");
        $HL = makeKeyword("HL");
        $EL = makeKeyword("EL");
        $str479$_S_was_not_an_inference_answer_la = makeString("~S was not an inference-answer-language-p");
        $sym480$INFERENCE_ANSWER_EL_SENTENCE = makeSymbol("INFERENCE-ANSWER-EL-SENTENCE");
        $sym481$INFERENCE_ANSWER_JUSTIFICATION = makeSymbol("INFERENCE-ANSWER-JUSTIFICATION");
        $list482 = list(makeSymbol("ANSWER"), makeSymbol("SUPPORTS"), makeSymbol("PRAGMA-SUPPORTS"), makeSymbol("PROOFS"));
        $list483 = list(makeKeyword("ANSWER"), makeKeyword("SUPPORTS"), makeKeyword("PRAGMA-SUPPORTS"), makeKeyword("PROOFS"));
        $list484 = list(makeSymbol("INF-ANS-JUST-ANSWER"), makeSymbol("INF-ANS-JUST-SUPPORTS"), makeSymbol("INF-ANS-JUST-PRAGMA-SUPPORTS"), makeSymbol("INF-ANS-JUST-PROOFS"));
        $list485 = list(makeSymbol("_CSETF-INF-ANS-JUST-ANSWER"), makeSymbol("_CSETF-INF-ANS-JUST-SUPPORTS"), makeSymbol("_CSETF-INF-ANS-JUST-PRAGMA-SUPPORTS"), makeSymbol("_CSETF-INF-ANS-JUST-PROOFS"));
        $sym486$PRINT_INFERENCE_ANSWER_JUSTIFICATION = makeSymbol("PRINT-INFERENCE-ANSWER-JUSTIFICATION");
        $sym487$INFERENCE_ANSWER_JUSTIFICATION_PRINT_FUNCTION_TRAMPOLINE = makeSymbol("INFERENCE-ANSWER-JUSTIFICATION-PRINT-FUNCTION-TRAMPOLINE");
        $list488 = list(makeSymbol("OPTIMIZE-FUNCALL"), makeSymbol("INFERENCE-ANSWER-JUSTIFICATION-P"));
        $sym489$INF_ANS_JUST_ANSWER = makeSymbol("INF-ANS-JUST-ANSWER");
        $sym490$_CSETF_INF_ANS_JUST_ANSWER = makeSymbol("_CSETF-INF-ANS-JUST-ANSWER");
        $sym491$INF_ANS_JUST_SUPPORTS = makeSymbol("INF-ANS-JUST-SUPPORTS");
        $sym492$_CSETF_INF_ANS_JUST_SUPPORTS = makeSymbol("_CSETF-INF-ANS-JUST-SUPPORTS");
        $sym493$INF_ANS_JUST_PRAGMA_SUPPORTS = makeSymbol("INF-ANS-JUST-PRAGMA-SUPPORTS");
        $sym494$_CSETF_INF_ANS_JUST_PRAGMA_SUPPORTS = makeSymbol("_CSETF-INF-ANS-JUST-PRAGMA-SUPPORTS");
        $sym495$INF_ANS_JUST_PROOFS = makeSymbol("INF-ANS-JUST-PROOFS");
        $sym496$_CSETF_INF_ANS_JUST_PROOFS = makeSymbol("_CSETF-INF-ANS-JUST-PROOFS");
        $ANSWER = makeKeyword("ANSWER");
        $SUPPORTS = makeKeyword("SUPPORTS");
        $PRAGMA_SUPPORTS = makeKeyword("PRAGMA-SUPPORTS");
        $PROOFS = makeKeyword("PROOFS");
        $sym501$MAKE_INFERENCE_ANSWER_JUSTIFICATION = makeSymbol("MAKE-INFERENCE-ANSWER-JUSTIFICATION");
        $sym502$VISIT_DEFSTRUCT_OBJECT_INFERENCE_ANSWER_JUSTIFICATION_METHOD = makeSymbol("VISIT-DEFSTRUCT-OBJECT-INFERENCE-ANSWER-JUSTIFICATION-METHOD");
        $str503$_INF_ANS_JUST__s_ = makeString("<INF-ANS-JUST:~s>");
        $sym504$SXHASH_INFERENCE_ANSWER_JUSTIFICATION_METHOD = makeSymbol("SXHASH-INFERENCE-ANSWER-JUSTIFICATION-METHOD");
        $sym505$HL_JUSTIFICATION_P = makeSymbol("HL-JUSTIFICATION-P");
        $$Now = makeConstSym(("Now"));
        $list507 = list(list(makeSymbol("PROOF-VAR"), makeSymbol("JUSTIFICATION")), makeSymbol("&BODY"), makeSymbol("BODY"));
        $sym508$INFERENCE_ANSWER_JUSTIFICATION_PROOFS = makeSymbol("INFERENCE-ANSWER-JUSTIFICATION-PROOFS");
        $list509 = list(list(makeSymbol("JUSTIFICATION-VAR"), makeSymbol("PROOF")), makeSymbol("&BODY"), makeSymbol("BODY"));
        $sym510$INFERENCE = makeUninternedSymbol("INFERENCE");
        $sym511$ANSWER = makeUninternedSymbol("ANSWER");
        $sym512$PROOF_VAR = makeUninternedSymbol("PROOF-VAR");
        $sym513$DO_PROBLEM_SUPPORTED_INFERENCES = makeSymbol("DO-PROBLEM-SUPPORTED-INFERENCES");
        $sym514$PROOF_SUPPORTED_PROBLEM = makeSymbol("PROOF-SUPPORTED-PROBLEM");
        $sym515$MEMBER_ = makeSymbol("MEMBER?");
        $list516 = list(list(makeSymbol("FUNCTION"), EQL));
        $list517 = list(list(makeSymbol("SUBPROOF-VAR"), makeSymbol("INFERENCE")), makeSymbol("&BODY"), makeSymbol("BODY"));
        $sym518$ANSWER = makeUninternedSymbol("ANSWER");
        $sym519$JUSTIFICATION = makeUninternedSymbol("JUSTIFICATION");
        $sym520$PROOF = makeUninternedSymbol("PROOF");
        $sym521$DO_INFERENCE_ANSWER_JUSTIFICATION_PROOFS = makeSymbol("DO-INFERENCE-ANSWER-JUSTIFICATION-PROOFS");
        $sym522$DO_PROOF_ALL_SUBPROOFS = makeSymbol("DO-PROOF-ALL-SUBPROOFS");
        $sym523$RULE_ASSERTION_ = makeSymbol("RULE-ASSERTION?");
        $sym524$PROOF_P = makeSymbol("PROOF-P");
        $TV = makeKeyword("TV");
        $TRUE = makeKeyword("TRUE");
        $FALSE = makeKeyword("FALSE");
        $sym528$INFERENCE_METRICS = makeSymbol("INFERENCE-METRICS");
        $sym529$INFERENCE_QUERY_METRIC_P = makeSymbol("INFERENCE-QUERY-METRIC-P");
        $sym530$TERM__ = makeSymbol("TERM-<");
        $sym531$CAR = makeSymbol("CAR");
        $NEW_ROOT_TIMES = makeKeyword("NEW-ROOT-TIMES");
        $NEW_ROOT_COUNT = makeKeyword("NEW-ROOT-COUNT");
        $PROBLEM_CREATION_TIMES = makeKeyword("PROBLEM-CREATION-TIMES");
        $INFERENCE_ANSWER_QUERY_PROPERTIES = makeKeyword("INFERENCE-ANSWER-QUERY-PROPERTIES");
        $INFERENCE_STRONGEST_QUERY_PROPERTIES = makeKeyword("INFERENCE-STRONGEST-QUERY-PROPERTIES");
        $INFERENCE_MOST_EFFICIENT_QUERY_PROPERTIES = makeKeyword("INFERENCE-MOST-EFFICIENT-QUERY-PROPERTIES");
        $INFERENCE_IDS = makeKeyword("INFERENCE-IDS");
        $str539$time_to_implement_metric__S = makeString("time to implement metric ~S");
        $sym540$PROOF_SUID = makeSymbol("PROOF-SUID");
        $sym541$_ = makeSymbol(">");
        $sym542$CDR = makeSymbol("CDR");
        $list543 = list(list(makeSymbol("TABLE-VAR"), makeSymbol("INFERENCE")), makeSymbol("&BODY"), makeSymbol("BODY"));
        $sym544$INFERENCE_VAR = makeUninternedSymbol("INFERENCE-VAR");
        $sym545$WITH_INFERENCE_PROBLEM_WORKING_TIME_LOCK = makeSymbol("WITH-INFERENCE-PROBLEM-WORKING-TIME-LOCK");
        $sym546$INFERENCE_PROBLEM_WORKING_TIME_TABLE = makeSymbol("INFERENCE-PROBLEM-WORKING-TIME-TABLE");
        $str547$Inference_problem_working_time_lo = makeString("Inference problem working time lock");
        $NEW_ANSWER = makeKeyword("NEW-ANSWER");
        $STATUS_CHANGE = makeKeyword("STATUS-CHANGE");
        $NEW_TRANSFORMATION_DEPTH_REACHED = makeKeyword("NEW-TRANSFORMATION-DEPTH-REACHED");
        $sym551$INFERENCES_VAR = makeUninternedSymbol("INFERENCES-VAR");
        $sym552$INFERENCE_VAR = makeUninternedSymbol("INFERENCE-VAR");
        $sym553$TACTIC_VAR = makeUninternedSymbol("TACTIC-VAR");
        $sym554$START_TIME = makeUninternedSymbol("START-TIME");
        $list555 = list(list(makeSymbol("CURRENT-CONTROLLING-INFERENCES")));
        $list556 = list(list(makeSymbol("CURRENT-CONTROLLING-INFERENCE")));
        $list557 = list(list(makeSymbol("CURRENTLY-EXECUTING-TACTIC")));
        $sym558$CUNWIND_PROTECT = makeSymbol("CUNWIND-PROTECT");
        $sym559$PROGN = makeSymbol("PROGN");
        $sym560$POSSIBLY_SIGNAL_SKSI_QUERY_START = makeSymbol("POSSIBLY-SIGNAL-SKSI-QUERY-START");
        $sym561$INFERENCE_TIME_SO_FAR = makeSymbol("INFERENCE-TIME-SO-FAR");
        $list562 = list(NIL);
        $sym563$POSSIBLY_ADD_INFERENCE_SKSI_QUERY_START_TIME = makeSymbol("POSSIBLY-ADD-INFERENCE-SKSI-QUERY-START-TIME");
        $sym564$POSSIBLY_SIGNAL_SKSI_QUERY_END = makeSymbol("POSSIBLY-SIGNAL-SKSI-QUERY-END");
        $sym565$POSSIBLY_INCREMENT_INFERENCE_SKSI_QUERY_TOTAL_TIME = makeSymbol("POSSIBLY-INCREMENT-INFERENCE-SKSI-QUERY-TOTAL-TIME");
        $sym566$_ = makeSymbol("-");
        $sym567$INFERENCE_WITHIN_SKSI_QUERY_EXECUTION = makeSymbol("INFERENCE-WITHIN-SKSI-QUERY-EXECUTION");
        $START_TIME = makeKeyword("START-TIME");
        $START = makeKeyword("START");
        $END_TIME = makeKeyword("END-TIME");
        $SKSI_QUERY_TOTAL_TIME = makeKeyword("SKSI-QUERY-TOTAL-TIME");
        $SKSI_QUERY_START_TIMES = makeKeyword("SKSI-QUERY-START-TIMES");
        $SKSI_QUERY = makeKeyword("SKSI-QUERY");
        $list574 = list(list(makeSymbol("&KEY"), makeSymbol("SPARQL"), makeSymbol("RESULT-SET")), makeSymbol("&BODY"), makeSymbol("BODY"));
        $list575 = list(makeKeyword("SPARQL"), makeKeyword("RESULT-SET"));
        $SPARQL = makeKeyword("SPARQL");
        $RESULT_SET = makeKeyword("RESULT-SET");
        $sym578$INFERENCES = makeUninternedSymbol("INFERENCES");
        $sym579$INFERENCE = makeUninternedSymbol("INFERENCE");
        $sym580$START = makeUninternedSymbol("START");
        $sym581$END = makeUninternedSymbol("END");
        $sym582$COUNT = makeUninternedSymbol("COUNT");
        $sym583$LAST_ONE = makeSymbol("LAST-ONE");
        $sym584$FWHEN = makeSymbol("FWHEN");
        $sym585$INFERENCE_CUMULATIVE_TIME_SO_FAR = makeSymbol("INFERENCE-CUMULATIVE-TIME-SO-FAR");
        $sym586$LENGTH = makeSymbol("LENGTH");
        $sym587$POSSIBLY_ADD_INFERENCE_SPARQL_QUERY_PROFILE = makeSymbol("POSSIBLY-ADD-INFERENCE-SPARQL-QUERY-PROFILE");
        $sym588$INFERENCE_WITHIN_SPARQL_QUERY_EXECUTION = makeSymbol("INFERENCE-WITHIN-SPARQL-QUERY-EXECUTION");
        $SPARQL_QUERY_PROFILE = makeKeyword("SPARQL-QUERY-PROFILE");
        $SKSI_QUERY_TOTAL_TIME_ACC = makeKeyword("SKSI-QUERY-TOTAL-TIME-ACC");
        $SKSI_QUERY_START_TIMES_ACC = makeKeyword("SKSI-QUERY-START-TIMES-ACC");
        $SPARQL_QUERY_PROFILE_ACC = makeKeyword("SPARQL-QUERY-PROFILE-ACC");
    }

    public static class $inference_native extends SubLStructNative {
        public SubLObject $suid;
        public SubLObject $problem_store;
        public SubLObject $forward_propagate;
        public SubLObject $input_mt;
        public SubLObject $input_el_query;
        public SubLObject $input_non_explanatory_el_query;
        public SubLObject $input_query_properties;
        public SubLObject $mt;
        public SubLObject $el_query;
        public SubLObject $el_bindings;
        public SubLObject $hl_query;
        public SubLObject $explanatory_subquery;
        public SubLObject $non_explanatory_subquery;
        public SubLObject $free_hl_vars;
        public SubLObject $hypothetical_bindings;
        public SubLObject $answer_id_index;
        public SubLObject $answer_bindings_index;
        public SubLObject $new_answer_id_start;
        public SubLObject $new_answer_justifications;
        public SubLObject $status;
        public SubLObject $suspend_status;
        public SubLObject $root_link;
        public SubLObject $relevant_problems;
        public SubLObject $strategy_set;
        public SubLObject $control_process;
        public SubLObject $interrupting_processes;
        public SubLObject $max_transformation_depth_reached;
        public SubLObject $disjunction_free_el_vars_policy;
        public SubLObject $result_uniqueness_criterion;
        public SubLObject $allow_hl_predicate_transformationP;
        public SubLObject $allow_unbound_predicate_transformationP;
        public SubLObject $allow_evaluatable_predicate_transformationP;
        public SubLObject $allow_indeterminate_resultsP;
        public SubLObject $allowed_rules;
        public SubLObject $forbidden_rules;
        public SubLObject $allowed_modules;
        public SubLObject $allow_abnormality_checkingP;
        public SubLObject $transitive_closure_mode;
        public SubLObject $problem_store_privateP;
        public SubLObject $continuableP;
        public SubLObject $browsableP;
        public SubLObject $return_type;
        public SubLObject $answer_language;
        public SubLObject $cache_resultsP;
        public SubLObject $blockingP;
        public SubLObject $max_number;
        public SubLObject $max_time;
        public SubLObject $max_step;
        public SubLObject $mode;
        public SubLObject $forward_max_time;
        public SubLObject $max_proof_depth;
        public SubLObject $max_transformation_depth;
        public SubLObject $min_rule_utility;
        public SubLObject $probably_approximately_done;
        public SubLObject $metrics_template;
        public SubLObject $start_universal_time;
        public SubLObject $start_internal_real_time;
        public SubLObject $end_internal_real_time;
        public SubLObject $pad_internal_real_time;
        public SubLObject $hypothesization_time;
        public SubLObject $cumulative_time;
        public SubLObject $step_count;
        public SubLObject $cumulative_step_count;
        public SubLObject $events;
        public SubLObject $halt_conditions;
        public SubLObject $accumulators;
        public SubLObject $proof_watermark;
        public SubLObject $problem_working_time_data;
        public SubLObject $type;
        public SubLObject $data;
        public SubLObject $properties;
        private static SubLStructDeclNative structDecl;

        public $inference_native() {
            this.$suid = CommonSymbols.NIL;
            this.$problem_store = CommonSymbols.NIL;
            this.$forward_propagate = CommonSymbols.NIL;
            this.$input_mt = CommonSymbols.NIL;
            this.$input_el_query = CommonSymbols.NIL;
            this.$input_non_explanatory_el_query = CommonSymbols.NIL;
            this.$input_query_properties = CommonSymbols.NIL;
            this.$mt = CommonSymbols.NIL;
            this.$el_query = CommonSymbols.NIL;
            this.$el_bindings = CommonSymbols.NIL;
            this.$hl_query = CommonSymbols.NIL;
            this.$explanatory_subquery = CommonSymbols.NIL;
            this.$non_explanatory_subquery = CommonSymbols.NIL;
            this.$free_hl_vars = CommonSymbols.NIL;
            this.$hypothetical_bindings = CommonSymbols.NIL;
            this.$answer_id_index = CommonSymbols.NIL;
            this.$answer_bindings_index = CommonSymbols.NIL;
            this.$new_answer_id_start = CommonSymbols.NIL;
            this.$new_answer_justifications = CommonSymbols.NIL;
            this.$status = CommonSymbols.NIL;
            this.$suspend_status = CommonSymbols.NIL;
            this.$root_link = CommonSymbols.NIL;
            this.$relevant_problems = CommonSymbols.NIL;
            this.$strategy_set = CommonSymbols.NIL;
            this.$control_process = CommonSymbols.NIL;
            this.$interrupting_processes = CommonSymbols.NIL;
            this.$max_transformation_depth_reached = CommonSymbols.NIL;
            this.$disjunction_free_el_vars_policy = CommonSymbols.NIL;
            this.$result_uniqueness_criterion = CommonSymbols.NIL;
            this.$allow_hl_predicate_transformationP = CommonSymbols.NIL;
            this.$allow_unbound_predicate_transformationP = CommonSymbols.NIL;
            this.$allow_evaluatable_predicate_transformationP = CommonSymbols.NIL;
            this.$allow_indeterminate_resultsP = CommonSymbols.NIL;
            this.$allowed_rules = CommonSymbols.NIL;
            this.$forbidden_rules = CommonSymbols.NIL;
            this.$allowed_modules = CommonSymbols.NIL;
            this.$allow_abnormality_checkingP = CommonSymbols.NIL;
            this.$transitive_closure_mode = CommonSymbols.NIL;
            this.$problem_store_privateP = CommonSymbols.NIL;
            this.$continuableP = CommonSymbols.NIL;
            this.$browsableP = CommonSymbols.NIL;
            this.$return_type = CommonSymbols.NIL;
            this.$answer_language = CommonSymbols.NIL;
            this.$cache_resultsP = CommonSymbols.NIL;
            this.$blockingP = CommonSymbols.NIL;
            this.$max_number = CommonSymbols.NIL;
            this.$max_time = CommonSymbols.NIL;
            this.$max_step = CommonSymbols.NIL;
            this.$mode = CommonSymbols.NIL;
            this.$forward_max_time = CommonSymbols.NIL;
            this.$max_proof_depth = CommonSymbols.NIL;
            this.$max_transformation_depth = CommonSymbols.NIL;
            this.$min_rule_utility = CommonSymbols.NIL;
            this.$probably_approximately_done = CommonSymbols.NIL;
            this.$metrics_template = CommonSymbols.NIL;
            this.$start_universal_time = CommonSymbols.NIL;
            this.$start_internal_real_time = CommonSymbols.NIL;
            this.$end_internal_real_time = CommonSymbols.NIL;
            this.$pad_internal_real_time = CommonSymbols.NIL;
            this.$hypothesization_time = CommonSymbols.NIL;
            this.$cumulative_time = CommonSymbols.NIL;
            this.$step_count = CommonSymbols.NIL;
            this.$cumulative_step_count = CommonSymbols.NIL;
            this.$events = CommonSymbols.NIL;
            this.$halt_conditions = CommonSymbols.NIL;
            this.$accumulators = CommonSymbols.NIL;
            this.$proof_watermark = CommonSymbols.NIL;
            this.$problem_working_time_data = CommonSymbols.NIL;
            this.$type = CommonSymbols.NIL;
            this.$data = CommonSymbols.NIL;
            this.$properties = CommonSymbols.NIL;
        }

        @Override
        public SubLStructDecl getStructDecl() {
            return $inference_native.structDecl;
        }

        @Override
        public SubLObject getField2() {
            return this.$suid;
        }

        @Override
        public SubLObject getField3() {
            return this.$problem_store;
        }

        @Override
        public SubLObject getField4() {
            return this.$forward_propagate;
        }

        @Override
        public SubLObject getField5() {
            return this.$input_mt;
        }

        @Override
        public SubLObject getField6() {
            return this.$input_el_query;
        }

        @Override
        public SubLObject getField7() {
            return this.$input_non_explanatory_el_query;
        }

        @Override
        public SubLObject getField8() {
            return this.$input_query_properties;
        }

        @Override
        public SubLObject getField9() {
            return this.$mt;
        }

        @Override
        public SubLObject getField10() {
            return this.$el_query;
        }

        @Override
        public SubLObject getField11() {
            return this.$el_bindings;
        }

        @Override
        public SubLObject getField12() {
            return this.$hl_query;
        }

        @Override
        public SubLObject getField13() {
            return this.$explanatory_subquery;
        }

        @Override
        public SubLObject getField14() {
            return this.$non_explanatory_subquery;
        }

        @Override
        public SubLObject getField15() {
            return this.$free_hl_vars;
        }

        @Override
        public SubLObject getField16() {
            return this.$hypothetical_bindings;
        }

        @Override
        public SubLObject getField17() {
            return this.$answer_id_index;
        }

        @Override
        public SubLObject getField18() {
            return this.$answer_bindings_index;
        }

        @Override
        public SubLObject getField19() {
            return this.$new_answer_id_start;
        }

        @Override
        public SubLObject getField20() {
            return this.$new_answer_justifications;
        }

        public SubLObject getField21() {
            return this.$status;
        }

        public SubLObject getField22() {
            return this.$suspend_status;
        }

        public SubLObject getField23() {
            return this.$root_link;
        }

        public SubLObject getField24() {
            return this.$relevant_problems;
        }

        public SubLObject getField25() {
            return this.$strategy_set;
        }

        public SubLObject getField26() {
            return this.$control_process;
        }

        public SubLObject getField27() {
            return this.$interrupting_processes;
        }

        public SubLObject getField28() {
            return this.$max_transformation_depth_reached;
        }

        public SubLObject getField29() {
            return this.$disjunction_free_el_vars_policy;
        }

        public SubLObject getField30() {
            return this.$result_uniqueness_criterion;
        }

        public SubLObject getField31() {
            return this.$allow_hl_predicate_transformationP;
        }

        public SubLObject getField32() {
            return this.$allow_unbound_predicate_transformationP;
        }

        public SubLObject getField33() {
            return this.$allow_evaluatable_predicate_transformationP;
        }

        public SubLObject getField34() {
            return this.$allow_indeterminate_resultsP;
        }

        public SubLObject getField35() {
            return this.$allowed_rules;
        }

        public SubLObject getField36() {
            return this.$forbidden_rules;
        }

        public SubLObject getField37() {
            return this.$allowed_modules;
        }

        public SubLObject getField38() {
            return this.$allow_abnormality_checkingP;
        }

        public SubLObject getField39() {
            return this.$transitive_closure_mode;
        }

        public SubLObject getField40() {
            return this.$problem_store_privateP;
        }

        public SubLObject getField41() {
            return this.$continuableP;
        }

        public SubLObject getField42() {
            return this.$browsableP;
        }

        public SubLObject getField43() {
            return this.$return_type;
        }

        public SubLObject getField44() {
            return this.$answer_language;
        }

        public SubLObject getField45() {
            return this.$cache_resultsP;
        }

        public SubLObject getField46() {
            return this.$blockingP;
        }

        public SubLObject getField47() {
            return this.$max_number;
        }

        public SubLObject getField48() {
            return this.$max_time;
        }

        public SubLObject getField49() {
            return this.$max_step;
        }

        public SubLObject getField50() {
            return this.$mode;
        }

        public SubLObject getField51() {
            return this.$forward_max_time;
        }

        public SubLObject getField52() {
            return this.$max_proof_depth;
        }

        public SubLObject getField53() {
            return this.$max_transformation_depth;
        }

        public SubLObject getField54() {
            return this.$min_rule_utility;
        }

        public SubLObject getField55() {
            return this.$probably_approximately_done;
        }

        public SubLObject getField56() {
            return this.$metrics_template;
        }

        public SubLObject getField57() {
            return this.$start_universal_time;
        }

        public SubLObject getField58() {
            return this.$start_internal_real_time;
        }

        public SubLObject getField59() {
            return this.$end_internal_real_time;
        }

        public SubLObject getField60() {
            return this.$pad_internal_real_time;
        }

        public SubLObject getField61() {
            return this.$hypothesization_time;
        }

        public SubLObject getField62() {
            return this.$cumulative_time;
        }

        public SubLObject getField63() {
            return this.$step_count;
        }

        public SubLObject getField64() {
            return this.$cumulative_step_count;
        }

        public SubLObject getField65() {
            return this.$events;
        }

        public SubLObject getField66() {
            return this.$halt_conditions;
        }

        public SubLObject getField67() {
            return this.$accumulators;
        }

        public SubLObject getField68() {
            return this.$proof_watermark;
        }

        public SubLObject getField69() {
            return this.$problem_working_time_data;
        }

        public SubLObject getField70() {
            return this.$type;
        }

        public SubLObject getField71() {
            return this.$data;
        }

        public SubLObject getField72() {
            return this.$properties;
        }

        @Override
        public SubLObject setField2(SubLObject value) {
            return this.$suid = value;
        }

        @Override
        public SubLObject setField3(SubLObject value) {
            return this.$problem_store = value;
        }

        @Override
        public SubLObject setField4(SubLObject value) {
            return this.$forward_propagate = value;
        }

        @Override
        public SubLObject setField5(SubLObject value) {
            return this.$input_mt = value;
        }

        @Override
        public SubLObject setField6(SubLObject value) {
            return this.$input_el_query = value;
        }

        @Override
        public SubLObject setField7(SubLObject value) {
            return this.$input_non_explanatory_el_query = value;
        }

        @Override
        public SubLObject setField8(SubLObject value) {
            return this.$input_query_properties = value;
        }

        @Override
        public SubLObject setField9(SubLObject value) {
            return this.$mt = value;
        }

        @Override
        public SubLObject setField10(SubLObject value) {
            return this.$el_query = value;
        }

        @Override
        public SubLObject setField11(SubLObject value) {
            return this.$el_bindings = value;
        }

        @Override
        public SubLObject setField12(SubLObject value) {
            return this.$hl_query = value;
        }

        @Override
        public SubLObject setField13(SubLObject value) {
            return this.$explanatory_subquery = value;
        }

        @Override
        public SubLObject setField14(SubLObject value) {
            return this.$non_explanatory_subquery = value;
        }

        @Override
        public SubLObject setField15(SubLObject value) {
            return this.$free_hl_vars = value;
        }

        @Override
        public SubLObject setField16(SubLObject value) {
            return this.$hypothetical_bindings = value;
        }

        @Override
        public SubLObject setField17(SubLObject value) {
            return this.$answer_id_index = value;
        }

        @Override
        public SubLObject setField18(SubLObject value) {
            return this.$answer_bindings_index = value;
        }

        @Override
        public SubLObject setField19(SubLObject value) {
            return this.$new_answer_id_start = value;
        }

        @Override
        public SubLObject setField20(SubLObject value) {
            return this.$new_answer_justifications = value;
        }

        public SubLObject setField21(SubLObject value) {
            return this.$status = value;
        }

        public SubLObject setField22(SubLObject value) {
            return this.$suspend_status = value;
        }

        public SubLObject setField23(SubLObject value) {
            return this.$root_link = value;
        }

        public SubLObject setField24(SubLObject value) {
            return this.$relevant_problems = value;
        }

        public SubLObject setField25(SubLObject value) {
            return this.$strategy_set = value;
        }

        public SubLObject setField26(SubLObject value) {
            return this.$control_process = value;
        }

        public SubLObject setField27(SubLObject value) {
            return this.$interrupting_processes = value;
        }

        public SubLObject setField28(SubLObject value) {
            return this.$max_transformation_depth_reached = value;
        }

        public SubLObject setField29(SubLObject value) {
            return this.$disjunction_free_el_vars_policy = value;
        }

        public SubLObject setField30(SubLObject value) {
            return this.$result_uniqueness_criterion = value;
        }

        public SubLObject setField31(SubLObject value) {
            return this.$allow_hl_predicate_transformationP = value;
        }

        public SubLObject setField32(SubLObject value) {
            return this.$allow_unbound_predicate_transformationP = value;
        }

        public SubLObject setField33(SubLObject value) {
            return this.$allow_evaluatable_predicate_transformationP = value;
        }

        public SubLObject setField34(SubLObject value) {
            return this.$allow_indeterminate_resultsP = value;
        }

        public SubLObject setField35(SubLObject value) {
            return this.$allowed_rules = value;
        }

        public SubLObject setField36(SubLObject value) {
            return this.$forbidden_rules = value;
        }

        public SubLObject setField37(SubLObject value) {
            return this.$allowed_modules = value;
        }

        public SubLObject setField38(SubLObject value) {
            return this.$allow_abnormality_checkingP = value;
        }

        public SubLObject setField39(SubLObject value) {
            return this.$transitive_closure_mode = value;
        }

        public SubLObject setField40(SubLObject value) {
            return this.$problem_store_privateP = value;
        }

        public SubLObject setField41(SubLObject value) {
            return this.$continuableP = value;
        }

        public SubLObject setField42(SubLObject value) {
            return this.$browsableP = value;
        }

        public SubLObject setField43(SubLObject value) {
            return this.$return_type = value;
        }

        public SubLObject setField44(SubLObject value) {
            return this.$answer_language = value;
        }

        public SubLObject setField45(SubLObject value) {
            return this.$cache_resultsP = value;
        }

        public SubLObject setField46(SubLObject value) {
            return this.$blockingP = value;
        }

        public SubLObject setField47(SubLObject value) {
            return this.$max_number = value;
        }

        public SubLObject setField48(SubLObject value) {
            return this.$max_time = value;
        }

        public SubLObject setField49(SubLObject value) {
            return this.$max_step = value;
        }

        public SubLObject setField50(SubLObject value) {
            return this.$mode = value;
        }

        public SubLObject setField51(SubLObject value) {
            return this.$forward_max_time = value;
        }

        public SubLObject setField52(SubLObject value) {
            return this.$max_proof_depth = value;
        }

        public SubLObject setField53(SubLObject value) {
            return this.$max_transformation_depth = value;
        }

        public SubLObject setField54(SubLObject value) {
            return this.$min_rule_utility = value;
        }

        public SubLObject setField55(SubLObject value) {
            return this.$probably_approximately_done = value;
        }

        public SubLObject setField56(SubLObject value) {
            return this.$metrics_template = value;
        }

        public SubLObject setField57(SubLObject value) {
            return this.$start_universal_time = value;
        }

        public SubLObject setField58(SubLObject value) {
            return this.$start_internal_real_time = value;
        }

        public SubLObject setField59(SubLObject value) {
            return this.$end_internal_real_time = value;
        }

        public SubLObject setField60(SubLObject value) {
            return this.$pad_internal_real_time = value;
        }

        public SubLObject setField61(SubLObject value) {
            return this.$hypothesization_time = value;
        }

        public SubLObject setField62(SubLObject value) {
            return this.$cumulative_time = value;
        }

        public SubLObject setField63(SubLObject value) {
            return this.$step_count = value;
        }

        public SubLObject setField64(SubLObject value) {
            return this.$cumulative_step_count = value;
        }

        public SubLObject setField65(SubLObject value) {
            return this.$events = value;
        }

        public SubLObject setField66(SubLObject value) {
            return this.$halt_conditions = value;
        }

        public SubLObject setField67(SubLObject value) {
            return this.$accumulators = value;
        }

        public SubLObject setField68(SubLObject value) {
            return this.$proof_watermark = value;
        }

        public SubLObject setField69(SubLObject value) {
            return this.$problem_working_time_data = value;
        }

        public SubLObject setField70(SubLObject value) {
            return this.$type = value;
        }

        public SubLObject setField71(SubLObject value) {
            return this.$data = value;
        }

        public SubLObject setField72(SubLObject value) {
            return this.$properties = value;
        }

        static {
            structDecl = Structures.makeStructDeclNative($inference_native.class, $sym1$INFERENCE, $sym2$INFERENCE_P, $list3, $list4,
                    new String[] { "$suid", "$problem_store", "$forward_propagate", "$input_mt", "$input_el_query", "$input_non_explanatory_el_query", "$input_query_properties", "$mt", "$el_query", "$el_bindings", "$hl_query", "$explanatory_subquery", "$non_explanatory_subquery", "$free_hl_vars",
                            "$hypothetical_bindings", "$answer_id_index", "$answer_bindings_index", "$new_answer_id_start", "$new_answer_justifications", "$status", "$suspend_status", "$root_link", "$relevant_problems", "$strategy_set", "$control_process", "$interrupting_processes",
                            "$max_transformation_depth_reached", "$disjunction_free_el_vars_policy", "$result_uniqueness_criterion", "$allow_hl_predicate_transformationP", "$allow_unbound_predicate_transformationP", "$allow_evaluatable_predicate_transformationP", "$allow_indeterminate_resultsP",
                            "$allowed_rules", "$forbidden_rules", "$allowed_modules", "$allow_abnormality_checkingP", "$transitive_closure_mode", "$problem_store_privateP", "$continuableP", "$browsableP", "$return_type", "$answer_language", "$cache_resultsP", "$blockingP", "$max_number",
                            "$max_time", "$max_step", "$mode", "$forward_max_time", "$max_proof_depth", "$max_transformation_depth", "$min_rule_utility", "$probably_approximately_done", "$metrics_template", "$start_universal_time", "$start_internal_real_time", "$end_internal_real_time",
                            "$pad_internal_real_time", "$hypothesization_time", "$cumulative_time", "$step_count", "$cumulative_step_count", "$events", "$halt_conditions", "$accumulators", "$proof_watermark", "$problem_working_time_data", "$type", "$data", "$properties" },
                    $list5, $list6, $sym7$PRINT_INFERENCE);
        }
    }

    public static class $inference_p$UnaryFunction extends UnaryFunction {
        public $inference_p$UnaryFunction() {
            super(SubLTranslatedFile.extractFunctionNamed("INFERENCE-P"));
        }

        @Override
        public SubLObject processItem(SubLObject arg1) {
            return inference_p(arg1);
        }
    }

    public static class $sxhash_inference_method$UnaryFunction extends UnaryFunction {
        public $sxhash_inference_method$UnaryFunction() {
            super(SubLTranslatedFile.extractFunctionNamed("SXHASH-INFERENCE-METHOD"));
        }

        @Override
        public SubLObject processItem(SubLObject arg1) {
            return sxhash_inference_method(arg1);
        }
    }

    public static class $inference_answer_native extends SubLStructNative {
        public SubLObject $suid;
        public SubLObject $inference;
        public SubLObject $bindings;
        public SubLObject $justifications;
        public SubLObject $elapsed_creation_time;
        public SubLObject $step_count;
        private static SubLStructDeclNative structDecl;

        public $inference_answer_native() {
            this.$suid = CommonSymbols.NIL;
            this.$inference = CommonSymbols.NIL;
            this.$bindings = CommonSymbols.NIL;
            this.$justifications = CommonSymbols.NIL;
            this.$elapsed_creation_time = CommonSymbols.NIL;
            this.$step_count = CommonSymbols.NIL;
        }

        @Override
        public SubLStructDecl getStructDecl() {
            return $inference_answer_native.structDecl;
        }

        @Override
        public SubLObject getField2() {
            return this.$suid;
        }

        @Override
        public SubLObject getField3() {
            return this.$inference;
        }

        @Override
        public SubLObject getField4() {
            return this.$bindings;
        }

        @Override
        public SubLObject getField5() {
            return this.$justifications;
        }

        @Override
        public SubLObject getField6() {
            return this.$elapsed_creation_time;
        }

        @Override
        public SubLObject getField7() {
            return this.$step_count;
        }

        @Override
        public SubLObject setField2(SubLObject value) {
            return this.$suid = value;
        }

        @Override
        public SubLObject setField3(SubLObject value) {
            return this.$inference = value;
        }

        @Override
        public SubLObject setField4(SubLObject value) {
            return this.$bindings = value;
        }

        @Override
        public SubLObject setField5(SubLObject value) {
            return this.$justifications = value;
        }

        @Override
        public SubLObject setField6(SubLObject value) {
            return this.$elapsed_creation_time = value;
        }

        @Override
        public SubLObject setField7(SubLObject value) {
            return this.$step_count = value;
        }

        static {
            structDecl = Structures.makeStructDeclNative($inference_answer_native.class, $sym441$INFERENCE_ANSWER, $sym433$INFERENCE_ANSWER_P, $list442, $list443, new String[] { "$suid", "$inference", "$bindings", "$justifications", "$elapsed_creation_time", "$step_count" }, $list444, $list445,
                    $sym446$PRINT_INFERENCE_ANSWER);
        }
    }

    public static class $inference_answer_p$UnaryFunction extends UnaryFunction {
        public $inference_answer_p$UnaryFunction() {
            super(SubLTranslatedFile.extractFunctionNamed("INFERENCE-ANSWER-P"));
        }

        @Override
        public SubLObject processItem(SubLObject arg1) {
            return inference_answer_p(arg1);
        }
    }

    public static class $inference_answer_justification_native extends SubLStructNative {
        public SubLObject $answer;
        public SubLObject $supports;
        public SubLObject $pragma_supports;
        public SubLObject $proofs;
        private static SubLStructDeclNative structDecl;

        public $inference_answer_justification_native() {
            this.$answer = CommonSymbols.NIL;
            this.$supports = CommonSymbols.NIL;
            this.$pragma_supports = CommonSymbols.NIL;
            this.$proofs = CommonSymbols.NIL;
        }

        @Override
        public SubLStructDecl getStructDecl() {
            return $inference_answer_justification_native.structDecl;
        }

        @Override
        public SubLObject getField2() {
            return this.$answer;
        }

        @Override
        public SubLObject getField3() {
            return this.$supports;
        }

        @Override
        public SubLObject getField4() {
            return this.$pragma_supports;
        }

        @Override
        public SubLObject getField5() {
            return this.$proofs;
        }

        @Override
        public SubLObject setField2(SubLObject value) {
            return this.$answer = value;
        }

        @Override
        public SubLObject setField3(SubLObject value) {
            return this.$supports = value;
        }

        @Override
        public SubLObject setField4(SubLObject value) {
            return this.$pragma_supports = value;
        }

        @Override
        public SubLObject setField5(SubLObject value) {
            return this.$proofs = value;
        }

        static {
            structDecl = Structures.makeStructDeclNative($inference_answer_justification_native.class, $sym481$INFERENCE_ANSWER_JUSTIFICATION, $sym434$INFERENCE_ANSWER_JUSTIFICATION_P, $list482, $list483, new String[] { "$answer", "$supports", "$pragma_supports", "$proofs" }, $list484, $list485,
                    $sym486$PRINT_INFERENCE_ANSWER_JUSTIFICATION);
        }
    }

    public static class $inference_answer_justification_p$UnaryFunction extends UnaryFunction {
        public $inference_answer_justification_p$UnaryFunction() {
            super(SubLTranslatedFile.extractFunctionNamed("INFERENCE-ANSWER-JUSTIFICATION-P"));
        }

        @Override
        public SubLObject processItem(SubLObject arg1) {
            return inference_answer_justification_p(arg1);
        }
    }

    public static class $inference_answer_justification_supports$UnaryFunction extends UnaryFunction {
        public $inference_answer_justification_supports$UnaryFunction() {
            super(SubLTranslatedFile.extractFunctionNamed("INFERENCE-ANSWER-JUSTIFICATION-SUPPORTS"));
        }

        @Override
        public SubLObject processItem(SubLObject arg1) {
            return inference_answer_justification_supports(arg1);
        }
    }

}
/*
 *
 * Total time: 3488 ms synthetic
 */