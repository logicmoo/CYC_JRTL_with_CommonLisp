package com.cyc.cycjava.cycl.inference.harness;

import com.cyc.tool.subl.jrtl.nativeCode.subLisp.UnaryFunction;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.SubLStructDecl;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.CommonSymbols;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.SubLStructDeclNative;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLStructNative;
import com.cyc.cycjava.cycl.constant_handles;
import com.cyc.cycjava.cycl.subl_macro_promotions;
import com.cyc.cycjava.cycl.access_macros;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.visitation;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.SubLSpecialOperatorDeclarations;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Structures;
import com.cyc.tool.subl.util.SubLFiles;
import com.cyc.cycjava.cycl.sksi.sksi_infrastructure.sksi_infrastructure_macros;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.reader;
import com.cyc.cycjava.cycl.inference.inference_event;
import com.cyc.cycjava.cycl.dictionary_utilities;
import com.cyc.cycjava.cycl.assertions_high;
import com.cyc.cycjava.cycl.inference.leviathan;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Sort;
import com.cyc.cycjava.cycl.assertion_utilities;
import com.cyc.cycjava.cycl.date_utilities;
import com.cyc.cycjava.cycl.kb_control_vars;
import com.cyc.cycjava.cycl.arguments;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Sxhash;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.print_macros;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Time;
import com.cyc.cycjava.cycl.set_utilities;
import com.cyc.cycjava.cycl.misc_utilities;
import com.cyc.cycjava.cycl.inference.inference_pad_data;
import com.cyc.cycjava.cycl.accumulation;
import com.cyc.cycjava.cycl.keyhash_utilities;
import com.cyc.cycjava.cycl.kb_utilities;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.print_high;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Strings;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Characters;
import com.cyc.cycjava.cycl.format_cycl_expression;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.streams_high;
import com.cyc.cycjava.cycl.cycl_utilities;
import com.cyc.cycjava.cycl.clauses;
import java.util.Map;
import java.util.Iterator;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Hashtables;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Vectors;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Numbers;
import com.cyc.cycjava.cycl.numeric_date_utilities;
import com.cyc.cycjava.cycl.list_utilities;
import com.cyc.cycjava.cycl.number_utilities;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Types;
import com.cyc.cycjava.cycl.bindings;
import com.cyc.cycjava.cycl.hlmt;
import com.cyc.cycjava.cycl.el_utilities;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Locks;
import com.cyc.cycjava.cycl.set_contents;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Values;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Dynamic;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Threads;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.SubLThread;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Sequences;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLProcess;
import com.cyc.cycjava.cycl.set;
import com.cyc.cycjava.cycl.queues;
import com.cyc.cycjava.cycl.dictionary;
import com.cyc.cycjava.cycl.id_index;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.cdestructuring_bind;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.PrintLow;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Equality;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.*;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Functions;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Errors;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.conses_high;
import com.cyc.cycjava.cycl.subl_promotions;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Symbols;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObject;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLString;
import com.cyc.tool.subl.jrtl.nativeCode.type.number.SubLInteger;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLList;
import com.cyc.tool.subl.jrtl.nativeCode.type.symbol.SubLSymbol;
import com.cyc.tool.subl.util.SubLFile;
import com.cyc.tool.subl.util.SubLTranslatedFile;

public final class inference_datastructures_inference
    extends
      SubLTranslatedFile
{
  public static final SubLFile me;
  public static final String myName = "com.cyc.cycjava.cycl.inference.harness.inference_datastructures_inference";
  public static final String myFingerPrint = "dec25da45c9614186ba4f29d70061e4e72e3a1abb713ab3f2948d5b4421529f6";
  @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-datastructures-inference.lisp", position = 1232L)
  private static SubLSymbol $inference_types$;
  @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-datastructures-inference.lisp", position = 3537L)
  public static SubLSymbol $dtp_inference$;
  @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-datastructures-inference.lisp", position = 77146L)
  private static SubLSymbol $pad_times_to_first_answer$;
  @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-datastructures-inference.lisp", position = 100373L)
  public static SubLSymbol $dtp_inference_answer$;
  @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-datastructures-inference.lisp", position = 111419L)
  public static SubLSymbol $dtp_inference_answer_justification$;
  private static final SubLList $list0;
  private static final SubLSymbol $sym1$INFERENCE;
  private static final SubLSymbol $sym2$INFERENCE_P;
  private static final SubLList $list3;
  private static final SubLList $list4;
  private static final SubLList $list5;
  private static final SubLList $list6;
  private static final SubLSymbol $sym7$PRINT_INFERENCE;
  private static final SubLInteger $int8$21;
  private static final SubLInteger $int9$22;
  private static final SubLInteger $int10$23;
  private static final SubLInteger $int11$24;
  private static final SubLInteger $int12$25;
  private static final SubLInteger $int13$26;
  private static final SubLInteger $int14$27;
  private static final SubLInteger $int15$28;
  private static final SubLInteger $int16$29;
  private static final SubLInteger $int17$30;
  private static final SubLInteger $int18$31;
  private static final SubLInteger $int19$32;
  private static final SubLInteger $int20$33;
  private static final SubLInteger $int21$34;
  private static final SubLInteger $int22$35;
  private static final SubLInteger $int23$36;
  private static final SubLInteger $int24$37;
  private static final SubLInteger $int25$38;
  private static final SubLInteger $int26$39;
  private static final SubLInteger $int27$40;
  private static final SubLInteger $int28$41;
  private static final SubLInteger $int29$42;
  private static final SubLInteger $int30$43;
  private static final SubLInteger $int31$44;
  private static final SubLInteger $int32$45;
  private static final SubLInteger $int33$46;
  private static final SubLInteger $int34$47;
  private static final SubLInteger $int35$48;
  private static final SubLInteger $int36$49;
  private static final SubLInteger $int37$50;
  private static final SubLInteger $int38$51;
  private static final SubLInteger $int39$52;
  private static final SubLInteger $int40$53;
  private static final SubLInteger $int41$54;
  private static final SubLInteger $int42$55;
  private static final SubLInteger $int43$56;
  private static final SubLInteger $int44$57;
  private static final SubLInteger $int45$58;
  private static final SubLInteger $int46$59;
  private static final SubLInteger $int47$60;
  private static final SubLInteger $int48$61;
  private static final SubLInteger $int49$62;
  private static final SubLInteger $int50$63;
  private static final SubLInteger $int51$64;
  private static final SubLInteger $int52$65;
  private static final SubLInteger $int53$66;
  private static final SubLInteger $int54$67;
  private static final SubLInteger $int55$68;
  private static final SubLInteger $int56$69;
  private static final SubLInteger $int57$70;
  private static final SubLInteger $int58$71;
  private static final SubLInteger $int59$72;
  private static final SubLSymbol $sym60$INFERENCE_PRINT_FUNCTION_TRAMPOLINE;
  private static final SubLList $list61;
  private static final SubLSymbol $sym62$INFRNC_SUID;
  private static final SubLSymbol $sym63$_CSETF_INFRNC_SUID;
  private static final SubLSymbol $sym64$INFRNC_PROBLEM_STORE;
  private static final SubLSymbol $sym65$_CSETF_INFRNC_PROBLEM_STORE;
  private static final SubLSymbol $sym66$INFRNC_FORWARD_PROPAGATE;
  private static final SubLSymbol $sym67$_CSETF_INFRNC_FORWARD_PROPAGATE;
  private static final SubLSymbol $sym68$INFRNC_INPUT_MT;
  private static final SubLSymbol $sym69$_CSETF_INFRNC_INPUT_MT;
  private static final SubLSymbol $sym70$INFRNC_INPUT_EL_QUERY;
  private static final SubLSymbol $sym71$_CSETF_INFRNC_INPUT_EL_QUERY;
  private static final SubLSymbol $sym72$INFRNC_INPUT_NON_EXPLANATORY_EL_QUERY;
  private static final SubLSymbol $sym73$_CSETF_INFRNC_INPUT_NON_EXPLANATORY_EL_QUERY;
  private static final SubLSymbol $sym74$INFRNC_INPUT_QUERY_PROPERTIES;
  private static final SubLSymbol $sym75$_CSETF_INFRNC_INPUT_QUERY_PROPERTIES;
  private static final SubLSymbol $sym76$INFRNC_MT;
  private static final SubLSymbol $sym77$_CSETF_INFRNC_MT;
  private static final SubLSymbol $sym78$INFRNC_EL_QUERY;
  private static final SubLSymbol $sym79$_CSETF_INFRNC_EL_QUERY;
  private static final SubLSymbol $sym80$INFRNC_EL_BINDINGS;
  private static final SubLSymbol $sym81$_CSETF_INFRNC_EL_BINDINGS;
  private static final SubLSymbol $sym82$INFRNC_HL_QUERY;
  private static final SubLSymbol $sym83$_CSETF_INFRNC_HL_QUERY;
  private static final SubLSymbol $sym84$INFRNC_EXPLANATORY_SUBQUERY;
  private static final SubLSymbol $sym85$_CSETF_INFRNC_EXPLANATORY_SUBQUERY;
  private static final SubLSymbol $sym86$INFRNC_NON_EXPLANATORY_SUBQUERY;
  private static final SubLSymbol $sym87$_CSETF_INFRNC_NON_EXPLANATORY_SUBQUERY;
  private static final SubLSymbol $sym88$INFRNC_FREE_HL_VARS;
  private static final SubLSymbol $sym89$_CSETF_INFRNC_FREE_HL_VARS;
  private static final SubLSymbol $sym90$INFRNC_HYPOTHETICAL_BINDINGS;
  private static final SubLSymbol $sym91$_CSETF_INFRNC_HYPOTHETICAL_BINDINGS;
  private static final SubLSymbol $sym92$INFRNC_ANSWER_ID_INDEX;
  private static final SubLSymbol $sym93$_CSETF_INFRNC_ANSWER_ID_INDEX;
  private static final SubLSymbol $sym94$INFRNC_ANSWER_BINDINGS_INDEX;
  private static final SubLSymbol $sym95$_CSETF_INFRNC_ANSWER_BINDINGS_INDEX;
  private static final SubLSymbol $sym96$INFRNC_NEW_ANSWER_ID_START;
  private static final SubLSymbol $sym97$_CSETF_INFRNC_NEW_ANSWER_ID_START;
  private static final SubLSymbol $sym98$INFRNC_NEW_ANSWER_JUSTIFICATIONS;
  private static final SubLSymbol $sym99$_CSETF_INFRNC_NEW_ANSWER_JUSTIFICATIONS;
  private static final SubLSymbol $sym100$INFRNC_STATUS;
  private static final SubLSymbol $sym101$_CSETF_INFRNC_STATUS;
  private static final SubLSymbol $sym102$INFRNC_SUSPEND_STATUS;
  private static final SubLSymbol $sym103$_CSETF_INFRNC_SUSPEND_STATUS;
  private static final SubLSymbol $sym104$INFRNC_ROOT_LINK;
  private static final SubLSymbol $sym105$_CSETF_INFRNC_ROOT_LINK;
  private static final SubLSymbol $sym106$INFRNC_RELEVANT_PROBLEMS;
  private static final SubLSymbol $sym107$_CSETF_INFRNC_RELEVANT_PROBLEMS;
  private static final SubLSymbol $sym108$INFRNC_STRATEGY_SET;
  private static final SubLSymbol $sym109$_CSETF_INFRNC_STRATEGY_SET;
  private static final SubLSymbol $sym110$INFRNC_CONTROL_PROCESS;
  private static final SubLSymbol $sym111$_CSETF_INFRNC_CONTROL_PROCESS;
  private static final SubLSymbol $sym112$INFRNC_INTERRUPTING_PROCESSES;
  private static final SubLSymbol $sym113$_CSETF_INFRNC_INTERRUPTING_PROCESSES;
  private static final SubLSymbol $sym114$INFRNC_MAX_TRANSFORMATION_DEPTH_REACHED;
  private static final SubLSymbol $sym115$_CSETF_INFRNC_MAX_TRANSFORMATION_DEPTH_REACHED;
  private static final SubLSymbol $sym116$INFRNC_DISJUNCTION_FREE_EL_VARS_POLICY;
  private static final SubLSymbol $sym117$_CSETF_INFRNC_DISJUNCTION_FREE_EL_VARS_POLICY;
  private static final SubLSymbol $sym118$INFRNC_RESULT_UNIQUENESS_CRITERION;
  private static final SubLSymbol $sym119$_CSETF_INFRNC_RESULT_UNIQUENESS_CRITERION;
  private static final SubLSymbol $sym120$INFRNC_ALLOW_HL_PREDICATE_TRANSFORMATION_;
  private static final SubLSymbol $sym121$_CSETF_INFRNC_ALLOW_HL_PREDICATE_TRANSFORMATION_;
  private static final SubLSymbol $sym122$INFRNC_ALLOW_UNBOUND_PREDICATE_TRANSFORMATION_;
  private static final SubLSymbol $sym123$_CSETF_INFRNC_ALLOW_UNBOUND_PREDICATE_TRANSFORMATION_;
  private static final SubLSymbol $sym124$INFRNC_ALLOW_EVALUATABLE_PREDICATE_TRANSFORMATION_;
  private static final SubLSymbol $sym125$_CSETF_INFRNC_ALLOW_EVALUATABLE_PREDICATE_TRANSFORMATION_;
  private static final SubLSymbol $sym126$INFRNC_ALLOW_INDETERMINATE_RESULTS_;
  private static final SubLSymbol $sym127$_CSETF_INFRNC_ALLOW_INDETERMINATE_RESULTS_;
  private static final SubLSymbol $sym128$INFRNC_ALLOWED_RULES;
  private static final SubLSymbol $sym129$_CSETF_INFRNC_ALLOWED_RULES;
  private static final SubLSymbol $sym130$INFRNC_FORBIDDEN_RULES;
  private static final SubLSymbol $sym131$_CSETF_INFRNC_FORBIDDEN_RULES;
  private static final SubLSymbol $sym132$INFRNC_ALLOWED_MODULES;
  private static final SubLSymbol $sym133$_CSETF_INFRNC_ALLOWED_MODULES;
  private static final SubLSymbol $sym134$INFRNC_ALLOW_ABNORMALITY_CHECKING_;
  private static final SubLSymbol $sym135$_CSETF_INFRNC_ALLOW_ABNORMALITY_CHECKING_;
  private static final SubLSymbol $sym136$INFRNC_TRANSITIVE_CLOSURE_MODE;
  private static final SubLSymbol $sym137$_CSETF_INFRNC_TRANSITIVE_CLOSURE_MODE;
  private static final SubLSymbol $sym138$INFRNC_PROBLEM_STORE_PRIVATE_;
  private static final SubLSymbol $sym139$_CSETF_INFRNC_PROBLEM_STORE_PRIVATE_;
  private static final SubLSymbol $sym140$INFRNC_CONTINUABLE_;
  private static final SubLSymbol $sym141$_CSETF_INFRNC_CONTINUABLE_;
  private static final SubLSymbol $sym142$INFRNC_BROWSABLE_;
  private static final SubLSymbol $sym143$_CSETF_INFRNC_BROWSABLE_;
  private static final SubLSymbol $sym144$INFRNC_RETURN_TYPE;
  private static final SubLSymbol $sym145$_CSETF_INFRNC_RETURN_TYPE;
  private static final SubLSymbol $sym146$INFRNC_ANSWER_LANGUAGE;
  private static final SubLSymbol $sym147$_CSETF_INFRNC_ANSWER_LANGUAGE;
  private static final SubLSymbol $sym148$INFRNC_CACHE_RESULTS_;
  private static final SubLSymbol $sym149$_CSETF_INFRNC_CACHE_RESULTS_;
  private static final SubLSymbol $sym150$INFRNC_BLOCKING_;
  private static final SubLSymbol $sym151$_CSETF_INFRNC_BLOCKING_;
  private static final SubLSymbol $sym152$INFRNC_MAX_NUMBER;
  private static final SubLSymbol $sym153$_CSETF_INFRNC_MAX_NUMBER;
  private static final SubLSymbol $sym154$INFRNC_MAX_TIME;
  private static final SubLSymbol $sym155$_CSETF_INFRNC_MAX_TIME;
  private static final SubLSymbol $sym156$INFRNC_MAX_STEP;
  private static final SubLSymbol $sym157$_CSETF_INFRNC_MAX_STEP;
  private static final SubLSymbol $sym158$INFRNC_MODE;
  private static final SubLSymbol $sym159$_CSETF_INFRNC_MODE;
  private static final SubLSymbol $sym160$INFRNC_FORWARD_MAX_TIME;
  private static final SubLSymbol $sym161$_CSETF_INFRNC_FORWARD_MAX_TIME;
  private static final SubLSymbol $sym162$INFRNC_MAX_PROOF_DEPTH;
  private static final SubLSymbol $sym163$_CSETF_INFRNC_MAX_PROOF_DEPTH;
  private static final SubLSymbol $sym164$INFRNC_MAX_TRANSFORMATION_DEPTH;
  private static final SubLSymbol $sym165$_CSETF_INFRNC_MAX_TRANSFORMATION_DEPTH;
  private static final SubLSymbol $sym166$INFRNC_MIN_RULE_UTILITY;
  private static final SubLSymbol $sym167$_CSETF_INFRNC_MIN_RULE_UTILITY;
  private static final SubLSymbol $sym168$INFRNC_PROBABLY_APPROXIMATELY_DONE;
  private static final SubLSymbol $sym169$_CSETF_INFRNC_PROBABLY_APPROXIMATELY_DONE;
  private static final SubLSymbol $sym170$INFRNC_METRICS_TEMPLATE;
  private static final SubLSymbol $sym171$_CSETF_INFRNC_METRICS_TEMPLATE;
  private static final SubLSymbol $sym172$INFRNC_START_UNIVERSAL_TIME;
  private static final SubLSymbol $sym173$_CSETF_INFRNC_START_UNIVERSAL_TIME;
  private static final SubLSymbol $sym174$INFRNC_START_INTERNAL_REAL_TIME;
  private static final SubLSymbol $sym175$_CSETF_INFRNC_START_INTERNAL_REAL_TIME;
  private static final SubLSymbol $sym176$INFRNC_END_INTERNAL_REAL_TIME;
  private static final SubLSymbol $sym177$_CSETF_INFRNC_END_INTERNAL_REAL_TIME;
  private static final SubLSymbol $sym178$INFRNC_PAD_INTERNAL_REAL_TIME;
  private static final SubLSymbol $sym179$_CSETF_INFRNC_PAD_INTERNAL_REAL_TIME;
  private static final SubLSymbol $sym180$INFRNC_HYPOTHESIZATION_TIME;
  private static final SubLSymbol $sym181$_CSETF_INFRNC_HYPOTHESIZATION_TIME;
  private static final SubLSymbol $sym182$INFRNC_CUMULATIVE_TIME;
  private static final SubLSymbol $sym183$_CSETF_INFRNC_CUMULATIVE_TIME;
  private static final SubLSymbol $sym184$INFRNC_STEP_COUNT;
  private static final SubLSymbol $sym185$_CSETF_INFRNC_STEP_COUNT;
  private static final SubLSymbol $sym186$INFRNC_CUMULATIVE_STEP_COUNT;
  private static final SubLSymbol $sym187$_CSETF_INFRNC_CUMULATIVE_STEP_COUNT;
  private static final SubLSymbol $sym188$INFRNC_EVENTS;
  private static final SubLSymbol $sym189$_CSETF_INFRNC_EVENTS;
  private static final SubLSymbol $sym190$INFRNC_HALT_CONDITIONS;
  private static final SubLSymbol $sym191$_CSETF_INFRNC_HALT_CONDITIONS;
  private static final SubLSymbol $sym192$INFRNC_ACCUMULATORS;
  private static final SubLSymbol $sym193$_CSETF_INFRNC_ACCUMULATORS;
  private static final SubLSymbol $sym194$INFRNC_PROOF_WATERMARK;
  private static final SubLSymbol $sym195$_CSETF_INFRNC_PROOF_WATERMARK;
  private static final SubLSymbol $sym196$INFRNC_PROBLEM_WORKING_TIME_DATA;
  private static final SubLSymbol $sym197$_CSETF_INFRNC_PROBLEM_WORKING_TIME_DATA;
  private static final SubLSymbol $sym198$INFRNC_TYPE;
  private static final SubLSymbol $sym199$_CSETF_INFRNC_TYPE;
  private static final SubLSymbol $sym200$INFRNC_DATA;
  private static final SubLSymbol $sym201$_CSETF_INFRNC_DATA;
  private static final SubLSymbol $sym202$INFRNC_PROPERTIES;
  private static final SubLSymbol $sym203$_CSETF_INFRNC_PROPERTIES;
  private static final SubLSymbol $kw204$SUID;
  private static final SubLSymbol $kw205$PROBLEM_STORE;
  private static final SubLSymbol $kw206$FORWARD_PROPAGATE;
  private static final SubLSymbol $kw207$INPUT_MT;
  private static final SubLSymbol $kw208$INPUT_EL_QUERY;
  private static final SubLSymbol $kw209$INPUT_NON_EXPLANATORY_EL_QUERY;
  private static final SubLSymbol $kw210$INPUT_QUERY_PROPERTIES;
  private static final SubLSymbol $kw211$MT;
  private static final SubLSymbol $kw212$EL_QUERY;
  private static final SubLSymbol $kw213$EL_BINDINGS;
  private static final SubLSymbol $kw214$HL_QUERY;
  private static final SubLSymbol $kw215$EXPLANATORY_SUBQUERY;
  private static final SubLSymbol $kw216$NON_EXPLANATORY_SUBQUERY;
  private static final SubLSymbol $kw217$FREE_HL_VARS;
  private static final SubLSymbol $kw218$HYPOTHETICAL_BINDINGS;
  private static final SubLSymbol $kw219$ANSWER_ID_INDEX;
  private static final SubLSymbol $kw220$ANSWER_BINDINGS_INDEX;
  private static final SubLSymbol $kw221$NEW_ANSWER_ID_START;
  private static final SubLSymbol $kw222$NEW_ANSWER_JUSTIFICATIONS;
  private static final SubLSymbol $kw223$STATUS;
  private static final SubLSymbol $kw224$SUSPEND_STATUS;
  private static final SubLSymbol $kw225$ROOT_LINK;
  private static final SubLSymbol $kw226$RELEVANT_PROBLEMS;
  private static final SubLSymbol $kw227$STRATEGY_SET;
  private static final SubLSymbol $kw228$CONTROL_PROCESS;
  private static final SubLSymbol $kw229$INTERRUPTING_PROCESSES;
  private static final SubLSymbol $kw230$MAX_TRANSFORMATION_DEPTH_REACHED;
  private static final SubLSymbol $kw231$DISJUNCTION_FREE_EL_VARS_POLICY;
  private static final SubLSymbol $kw232$RESULT_UNIQUENESS_CRITERION;
  private static final SubLSymbol $kw233$ALLOW_HL_PREDICATE_TRANSFORMATION_;
  private static final SubLSymbol $kw234$ALLOW_UNBOUND_PREDICATE_TRANSFORMATION_;
  private static final SubLSymbol $kw235$ALLOW_EVALUATABLE_PREDICATE_TRANSFORMATION_;
  private static final SubLSymbol $kw236$ALLOW_INDETERMINATE_RESULTS_;
  private static final SubLSymbol $kw237$ALLOWED_RULES;
  private static final SubLSymbol $kw238$FORBIDDEN_RULES;
  private static final SubLSymbol $kw239$ALLOWED_MODULES;
  private static final SubLSymbol $kw240$ALLOW_ABNORMALITY_CHECKING_;
  private static final SubLSymbol $kw241$TRANSITIVE_CLOSURE_MODE;
  private static final SubLSymbol $kw242$PROBLEM_STORE_PRIVATE_;
  private static final SubLSymbol $kw243$CONTINUABLE_;
  private static final SubLSymbol $kw244$BROWSABLE_;
  private static final SubLSymbol $kw245$RETURN_TYPE;
  private static final SubLSymbol $kw246$ANSWER_LANGUAGE;
  private static final SubLSymbol $kw247$CACHE_RESULTS_;
  private static final SubLSymbol $kw248$BLOCKING_;
  private static final SubLSymbol $kw249$MAX_NUMBER;
  private static final SubLSymbol $kw250$MAX_TIME;
  private static final SubLSymbol $kw251$MAX_STEP;
  private static final SubLSymbol $kw252$MODE;
  private static final SubLSymbol $kw253$FORWARD_MAX_TIME;
  private static final SubLSymbol $kw254$MAX_PROOF_DEPTH;
  private static final SubLSymbol $kw255$MAX_TRANSFORMATION_DEPTH;
  private static final SubLSymbol $kw256$MIN_RULE_UTILITY;
  private static final SubLSymbol $kw257$PROBABLY_APPROXIMATELY_DONE;
  private static final SubLSymbol $kw258$METRICS_TEMPLATE;
  private static final SubLSymbol $kw259$START_UNIVERSAL_TIME;
  private static final SubLSymbol $kw260$START_INTERNAL_REAL_TIME;
  private static final SubLSymbol $kw261$END_INTERNAL_REAL_TIME;
  private static final SubLSymbol $kw262$PAD_INTERNAL_REAL_TIME;
  private static final SubLSymbol $kw263$HYPOTHESIZATION_TIME;
  private static final SubLSymbol $kw264$CUMULATIVE_TIME;
  private static final SubLSymbol $kw265$STEP_COUNT;
  private static final SubLSymbol $kw266$CUMULATIVE_STEP_COUNT;
  private static final SubLSymbol $kw267$EVENTS;
  private static final SubLSymbol $kw268$HALT_CONDITIONS;
  private static final SubLSymbol $kw269$ACCUMULATORS;
  private static final SubLSymbol $kw270$PROOF_WATERMARK;
  private static final SubLSymbol $kw271$PROBLEM_WORKING_TIME_DATA;
  private static final SubLSymbol $kw272$TYPE;
  private static final SubLSymbol $kw273$DATA;
  private static final SubLSymbol $kw274$PROPERTIES;
  private static final SubLString $str275$Invalid_slot__S_for_construction_;
  private static final SubLSymbol $kw276$BEGIN;
  private static final SubLSymbol $sym277$MAKE_INFERENCE;
  private static final SubLSymbol $kw278$SLOT;
  private static final SubLSymbol $kw279$END;
  private static final SubLSymbol $sym280$VISIT_DEFSTRUCT_OBJECT_INFERENCE_METHOD;
  private static final SubLSymbol $kw281$DEAD;
  private static final SubLString $str282$_Invalid_INFERENCE__s_;
  private static final SubLString $str283$_INFERENCE__a__a__a__s_in__s_;
  private static final SubLSymbol $sym284$SXHASH_INFERENCE_METHOD;
  private static final SubLSymbol $kw285$NEW;
  private static final SubLSymbol $kw286$PREPARED;
  private static final SubLSymbol $kw287$READY;
  private static final SubLSymbol $kw288$RUNNING;
  private static final SubLSymbol $kw289$SUSPENDED;
  private static final SubLList $list290;
  private static final SubLSymbol $sym291$DO_SET;
  private static final SubLSymbol $sym292$INFERENCE_RELEVANT_PROBLEMS;
  private static final SubLList $list293;
  private static final SubLSymbol $sym294$DO_QUEUE_ELEMENTS;
  private static final SubLSymbol $sym295$INFERENCE_NEW_ANSWER_JUSTIFICATIONS;
  private static final SubLList $list296;
  private static final SubLSymbol $sym297$START_ID;
  private static final SubLSymbol $sym298$END_ID;
  private static final SubLSymbol $sym299$ID;
  private static final SubLSymbol $sym300$INF;
  private static final SubLSymbol $sym301$CLET;
  private static final SubLSymbol $sym302$INFERENCE_NEW_ANSWER_ID_START;
  private static final SubLSymbol $sym303$INFERENCE_NEXT_NEW_ANSWER_ID;
  private static final SubLSymbol $sym304$CDO;
  private static final SubLSymbol $sym305$1_;
  private static final SubLSymbol $sym306$__;
  private static final SubLSymbol $sym307$FIND_INFERENCE_ANSWER_BY_ID;
  private static final SubLList $list308;
  private static final SubLList $list309;
  private static final SubLSymbol $kw310$ALLOW_OTHER_KEYS;
  private static final SubLSymbol $kw311$ORDERED;
  private static final SubLSymbol $sym312$ID;
  private static final SubLSymbol $sym313$DO_ID_INDEX;
  private static final SubLSymbol $sym314$INFERENCE_ANSWER_ID_INDEX;
  private static final SubLSymbol $sym315$IGNORE;
  private static final SubLList $list316;
  private static final SubLSymbol $sym317$START_ID;
  private static final SubLSymbol $sym318$END_ID;
  private static final SubLSymbol $sym319$ID;
  private static final SubLSymbol $sym320$INF;
  private static final SubLSymbol $sym321$CSETQ;
  private static final SubLSymbol $sym322$ANSWER;
  private static final SubLSymbol $sym323$DO_INFERENCE_ANSWERS;
  private static final SubLSymbol $sym324$DO_INFERENCE_ANSWER_JUSTIFICATIONS;
  private static final SubLList $list325;
  private static final SubLSymbol $sym326$DO_QUEUE_DEQUEUE;
  private static final SubLSymbol $sym327$INFERENCE_INTERRUPTING_PROCESSES;
  private static final SubLList $list328;
  private static final SubLList $list329;
  private static final SubLSymbol $kw330$PROOF_STATUS;
  private static final SubLSymbol $sym331$ROOT_PROBLEM;
  private static final SubLSymbol $sym332$INFERENCE_ROOT_PROBLEM;
  private static final SubLSymbol $sym333$PWHEN;
  private static final SubLSymbol $sym334$DO_PROBLEM_PROOFS;
  private static final SubLList $list335;
  private static final SubLList $list336;
  private static final SubLSymbol $kw337$DONE;
  private static final SubLSymbol $sym338$INFERENCE_ALLOWED_RULES;
  private static final SubLList $list339;
  private static final SubLSymbol $sym340$WITH_LOCK_HELD;
  private static final SubLSymbol $sym341$INFERENCE_PROBLEM_WORKING_TIME_LOCK;
  private static final SubLSymbol $sym342$PROBLEM_STORE_P;
  private static final SubLSymbol $kw343$TAUTOLOGY;
  private static final SubLSymbol $kw344$IGNORE_ERRORS_TARGET;
  private static final SubLSymbol $sym345$IGNORE_ERRORS_HANDLER;
  private static final SubLSymbol $kw346$FREE;
  private static final SubLSymbol $sym347$DO_INFERENCE_NEW_ANSWERS;
  private static final SubLSymbol $sym348$DO_INFERENCE_NEW_ANSWER_JUSTIFICATIONS;
  private static final SubLSymbol $sym349$FORWARD_PROPAGATE_P;
  private static final SubLSymbol $sym350$POSSIBLY_MT_P;
  private static final SubLSymbol $sym351$POSSIBLY_INFERENCE_SENTENCE_P;
  private static final SubLSymbol $sym352$QUERY_PROPERTIES_P;
  private static final SubLSymbol $sym353$HLMT_P;
  private static final SubLSymbol $sym354$BINDING_LIST_P;
  private static final SubLSymbol $sym355$PROBLEM_QUERY_P;
  private static final SubLSymbol $sym356$EXPLANATORY_SUBQUERY_SPEC_P;
  private static final SubLSymbol $sym357$NON_EXPLANATORY_SUBQUERY_SPEC_P;
  private static final SubLSymbol $sym358$LISTP;
  private static final SubLSymbol $sym359$INFERENCE_STATUS_P;
  private static final SubLSymbol $sym360$INFERENCE_SUSPEND_STATUS_P;
  private static final SubLSymbol $sym361$ANSWER_LINK_P;
  private static final SubLSymbol $sym362$PROCESSP;
  private static final SubLSymbol $sym363$NON_NEGATIVE_INTEGER_P;
  private static final SubLSymbol $sym364$INFERENCE_DISJUNCTION_FREE_EL_VARS_POLICY_P;
  private static final SubLSymbol $sym365$RESULT_UNIQUENESS_CRITERION_P;
  private static final SubLSymbol $sym366$BOOLEANP;
  private static final SubLSymbol $sym367$ALLOWED_MODULES_SPEC_P;
  private static final SubLSymbol $sym368$INFERENCE_TRANSITIVE_CLOSURE_MODE_P;
  private static final SubLSymbol $sym369$INFERENCE_RETURN_TYPE_P;
  private static final SubLSymbol $sym370$INFERENCE_ANSWER_LANGUAGE_P;
  private static final SubLSymbol $sym371$NON_NEGATIVE_NUMBER_P;
  private static final SubLSymbol $sym372$INFERENCE_MODE_P;
  private static final SubLString $str373$Forward_max_time__s_cannot_be_gre;
  private static final SubLSymbol $sym374$RULE_UTILITY_P;
  private static final SubLSymbol $sym375$PROBABILITY_P;
  private static final SubLSymbol $sym376$NON_DOTTED_LIST_P;
  private static final SubLSymbol $sym377$QUERY_METRIC_P;
  private static final SubLSymbol $sym378$UNIVERSAL_TIME_P;
  private static final SubLSymbol $sym379$POTENTIALLY_INFINITE_INTEGER_P;
  private static final SubLSymbol $sym380$NUMBERP;
  private static final SubLSymbol $sym381$INFERENCE_EVENT_TYPE_P;
  private static final SubLSymbol $sym382$INFERENCE_HALT_CONDITION_P;
  private static final SubLSymbol $sym383$INFERENCE_TYPE_P;
  private static final SubLSymbol $sym384$PROPERTY_LIST_P;
  private static final SubLList $list385;
  private static final SubLSymbol $sym386$INFERENCE_VAR;
  private static final SubLSymbol $sym387$INFERENCE_PROBLEM_STORE_SUID;
  private static final SubLSymbol $sym388$INFERENCE_SUID;
  private static final SubLSymbol $kw389$SKIP;
  private static final SubLSymbol $sym390$SUCCESSFUL_INFERENCE_P;
  private static final SubLSymbol $kw391$NEG;
  private static final SubLList $list392;
  private static final SubLSymbol $sym393$HLMT_EQUAL;
  private static final SubLSymbol $kw394$POS;
  private static final SubLList $list395;
  private static final SubLSymbol $sym396$QUERY_PROPERTY_P;
  private static final SubLSymbol $sym397$NEW_CYC_QUERY;
  private static final SubLString $str398$_new_cyc_query_A;
  private static final SubLString $str399$_____A;
  private static final SubLString $str400$_A;
  private static final SubLString $str401$_____list______;
  private static final SubLSymbol $kw402$DOWNCASE;
  private static final SubLString $str403$_S__find_problem_store_by_id__S__;
  private static final SubLSymbol $kw404$ALL;
  private static final SubLString $str405$_S__list;
  private static final SubLString $str406$_________find_object_by_hl_extern;
  private static final SubLString $str407$_______;
  private static final SubLString $str408$_S__S______;
  private static final SubLString $str409$_;
  private static final SubLSymbol $kw410$PROOF;
  private static final SubLSymbol $kw411$BINDINGS;
  private static final SubLSymbol $kw412$NONE;
  private static final SubLList $list413;
  private static final SubLSymbol $sym414$INFERENCE_ACCUMULATOR_TYPE_P;
  private static final SubLSymbol $sym415$ACCUMULATOR_P;
  private static final SubLSymbol $sym416$_PAD_TIMES_TO_FIRST_ANSWER_;
  private static final SubLSymbol $kw417$UNINITIALIZED;
  private static final SubLSymbol $kw418$POSITIVE_INFINITY;
  private static final SubLSymbol $sym419$_;
  private static final SubLSymbol $kw420$LOOK_NO_DEEPER_FOR_ADDITIONAL_ANSWERS;
  private static final SubLString $str421$got_a_null_answer_for__s;
  private static final SubLSymbol $kw422$GOOD;
  private static final SubLSymbol $kw423$TACTICAL;
  private static final SubLSymbol $kw424$NO_GOOD;
  private static final SubLSymbol $kw425$NEUTRAL;
  private static final SubLSymbol $sym426$INFERENCE_STATIC_PROPERTIES_P;
  private static final SubLSymbol $sym427$ALLOWED_RULES_SPEC_P;
  private static final SubLSymbol $sym428$FORBIDDEN_RULES_SPEC_P;
  private static final SubLSymbol $sym429$QUERY_DYNAMIC_PROPERTIES_P;
  private static final SubLSymbol $kw430$INFERENCE_MODE;
  private static final SubLSymbol $sym431$PROBLEM_P;
  private static final SubLSymbol $sym432$STRATEGY_P;
  private static final SubLSymbol $sym433$INFERENCE_ANSWER_P;
  private static final SubLSymbol $sym434$INFERENCE_ANSWER_JUSTIFICATION_P;
  private static final SubLString $str435$variables__S_were_removed;
  private static final SubLString $str436$variables__S_were_added;
  private static final SubLString $str437$variables__S_contain_duplications;
  private static final SubLSymbol $kw438$SIMPLEST;
  private static final SubLSymbol $sym439$SIMPLEST_INFERENCE_P;
  private static final SubLSymbol $sym440$STRATEGY_TYPE_P;
  private static final SubLSymbol $sym441$INFERENCE_ANSWER;
  private static final SubLList $list442;
  private static final SubLList $list443;
  private static final SubLList $list444;
  private static final SubLList $list445;
  private static final SubLSymbol $sym446$PRINT_INFERENCE_ANSWER;
  private static final SubLSymbol $sym447$INFERENCE_ANSWER_PRINT_FUNCTION_TRAMPOLINE;
  private static final SubLList $list448;
  private static final SubLSymbol $sym449$INF_ANSWER_SUID;
  private static final SubLSymbol $sym450$_CSETF_INF_ANSWER_SUID;
  private static final SubLSymbol $sym451$INF_ANSWER_INFERENCE;
  private static final SubLSymbol $sym452$_CSETF_INF_ANSWER_INFERENCE;
  private static final SubLSymbol $sym453$INF_ANSWER_BINDINGS;
  private static final SubLSymbol $sym454$_CSETF_INF_ANSWER_BINDINGS;
  private static final SubLSymbol $sym455$INF_ANSWER_JUSTIFICATIONS;
  private static final SubLSymbol $sym456$_CSETF_INF_ANSWER_JUSTIFICATIONS;
  private static final SubLSymbol $sym457$INF_ANSWER_ELAPSED_CREATION_TIME;
  private static final SubLSymbol $sym458$_CSETF_INF_ANSWER_ELAPSED_CREATION_TIME;
  private static final SubLSymbol $sym459$INF_ANSWER_STEP_COUNT;
  private static final SubLSymbol $sym460$_CSETF_INF_ANSWER_STEP_COUNT;
  private static final SubLSymbol $kw461$INFERENCE;
  private static final SubLSymbol $kw462$JUSTIFICATIONS;
  private static final SubLSymbol $kw463$ELAPSED_CREATION_TIME;
  private static final SubLSymbol $sym464$MAKE_INFERENCE_ANSWER;
  private static final SubLSymbol $sym465$VISIT_DEFSTRUCT_OBJECT_INFERENCE_ANSWER_METHOD;
  private static final SubLString $str466$_Invalid_INFERENCE_ANSWER__s_;
  private static final SubLString $str467$_INFERENCE_ANSWER__a_for_INFERENC;
  private static final SubLSymbol $sym468$SXHASH_INFERENCE_ANSWER_METHOD;
  private static final SubLSymbol $sym469$BINDINGS_P;
  private static final SubLList $list470;
  private static final SubLSymbol $sym471$DO_LIST;
  private static final SubLSymbol $sym472$INFERENCE_ANSWER_JUSTIFICATIONS;
  private static final SubLList $list473;
  private static final SubLSymbol $sym474$CDOLIST_NUMBERED;
  private static final SubLSymbol $sym475$JUSTIFICATION_EQUAL;
  private static final SubLSymbol $sym476$INFERENCE_ANSWER_JUSTIFICATION_SUPPORTS;
  private static final SubLSymbol $kw477$HL;
  private static final SubLSymbol $kw478$EL;
  private static final SubLString $str479$_S_was_not_an_inference_answer_la;
  private static final SubLSymbol $sym480$INFERENCE_ANSWER_EL_SENTENCE;
  private static final SubLSymbol $sym481$INFERENCE_ANSWER_JUSTIFICATION;
  private static final SubLList $list482;
  private static final SubLList $list483;
  private static final SubLList $list484;
  private static final SubLList $list485;
  private static final SubLSymbol $sym486$PRINT_INFERENCE_ANSWER_JUSTIFICATION;
  private static final SubLSymbol $sym487$INFERENCE_ANSWER_JUSTIFICATION_PRINT_FUNCTION_TRAMPOLINE;
  private static final SubLList $list488;
  private static final SubLSymbol $sym489$INF_ANS_JUST_ANSWER;
  private static final SubLSymbol $sym490$_CSETF_INF_ANS_JUST_ANSWER;
  private static final SubLSymbol $sym491$INF_ANS_JUST_SUPPORTS;
  private static final SubLSymbol $sym492$_CSETF_INF_ANS_JUST_SUPPORTS;
  private static final SubLSymbol $sym493$INF_ANS_JUST_PRAGMA_SUPPORTS;
  private static final SubLSymbol $sym494$_CSETF_INF_ANS_JUST_PRAGMA_SUPPORTS;
  private static final SubLSymbol $sym495$INF_ANS_JUST_PROOFS;
  private static final SubLSymbol $sym496$_CSETF_INF_ANS_JUST_PROOFS;
  private static final SubLSymbol $kw497$ANSWER;
  private static final SubLSymbol $kw498$SUPPORTS;
  private static final SubLSymbol $kw499$PRAGMA_SUPPORTS;
  private static final SubLSymbol $kw500$PROOFS;
  private static final SubLSymbol $sym501$MAKE_INFERENCE_ANSWER_JUSTIFICATION;
  private static final SubLSymbol $sym502$VISIT_DEFSTRUCT_OBJECT_INFERENCE_ANSWER_JUSTIFICATION_METHOD;
  private static final SubLString $str503$_INF_ANS_JUST__s_;
  private static final SubLSymbol $sym504$SXHASH_INFERENCE_ANSWER_JUSTIFICATION_METHOD;
  private static final SubLSymbol $sym505$HL_JUSTIFICATION_P;
  private static final SubLObject $const506$Now;
  private static final SubLList $list507;
  private static final SubLSymbol $sym508$INFERENCE_ANSWER_JUSTIFICATION_PROOFS;
  private static final SubLList $list509;
  private static final SubLSymbol $sym510$INFERENCE;
  private static final SubLSymbol $sym511$ANSWER;
  private static final SubLSymbol $sym512$PROOF_VAR;
  private static final SubLSymbol $sym513$DO_PROBLEM_SUPPORTED_INFERENCES;
  private static final SubLSymbol $sym514$PROOF_SUPPORTED_PROBLEM;
  private static final SubLSymbol $sym515$MEMBER_;
  private static final SubLList $list516;
  private static final SubLList $list517;
  private static final SubLSymbol $sym518$ANSWER;
  private static final SubLSymbol $sym519$JUSTIFICATION;
  private static final SubLSymbol $sym520$PROOF;
  private static final SubLSymbol $sym521$DO_INFERENCE_ANSWER_JUSTIFICATION_PROOFS;
  private static final SubLSymbol $sym522$DO_PROOF_ALL_SUBPROOFS;
  private static final SubLSymbol $sym523$RULE_ASSERTION_;
  private static final SubLSymbol $sym524$PROOF_P;
  private static final SubLSymbol $kw525$TV;
  private static final SubLSymbol $kw526$TRUE;
  private static final SubLSymbol $kw527$FALSE;
  private static final SubLSymbol $sym528$INFERENCE_METRICS;
  private static final SubLSymbol $sym529$INFERENCE_QUERY_METRIC_P;
  private static final SubLSymbol $sym530$TERM__;
  private static final SubLSymbol $sym531$CAR;
  private static final SubLSymbol $kw532$NEW_ROOT_TIMES;
  private static final SubLSymbol $kw533$NEW_ROOT_COUNT;
  private static final SubLSymbol $kw534$PROBLEM_CREATION_TIMES;
  private static final SubLSymbol $kw535$INFERENCE_ANSWER_QUERY_PROPERTIES;
  private static final SubLSymbol $kw536$INFERENCE_STRONGEST_QUERY_PROPERTIES;
  private static final SubLSymbol $kw537$INFERENCE_MOST_EFFICIENT_QUERY_PROPERTIES;
  private static final SubLSymbol $kw538$INFERENCE_IDS;
  private static final SubLString $str539$time_to_implement_metric__S;
  private static final SubLSymbol $sym540$PROOF_SUID;
  private static final SubLSymbol $sym541$_;
  private static final SubLSymbol $sym542$CDR;
  private static final SubLList $list543;
  private static final SubLSymbol $sym544$INFERENCE_VAR;
  private static final SubLSymbol $sym545$WITH_INFERENCE_PROBLEM_WORKING_TIME_LOCK;
  private static final SubLSymbol $sym546$INFERENCE_PROBLEM_WORKING_TIME_TABLE;
  private static final SubLString $str547$Inference_problem_working_time_lo;
  private static final SubLSymbol $kw548$NEW_ANSWER;
  private static final SubLSymbol $kw549$STATUS_CHANGE;
  private static final SubLSymbol $kw550$NEW_TRANSFORMATION_DEPTH_REACHED;
  private static final SubLSymbol $sym551$INFERENCES_VAR;
  private static final SubLSymbol $sym552$INFERENCE_VAR;
  private static final SubLSymbol $sym553$TACTIC_VAR;
  private static final SubLSymbol $sym554$START_TIME;
  private static final SubLList $list555;
  private static final SubLList $list556;
  private static final SubLList $list557;
  private static final SubLSymbol $sym558$CUNWIND_PROTECT;
  private static final SubLSymbol $sym559$PROGN;
  private static final SubLSymbol $sym560$POSSIBLY_SIGNAL_SKSI_QUERY_START;
  private static final SubLSymbol $sym561$INFERENCE_TIME_SO_FAR;
  private static final SubLList $list562;
  private static final SubLSymbol $sym563$POSSIBLY_ADD_INFERENCE_SKSI_QUERY_START_TIME;
  private static final SubLSymbol $sym564$POSSIBLY_SIGNAL_SKSI_QUERY_END;
  private static final SubLSymbol $sym565$POSSIBLY_INCREMENT_INFERENCE_SKSI_QUERY_TOTAL_TIME;
  private static final SubLSymbol $sym566$_;
  private static final SubLSymbol $sym567$INFERENCE_WITHIN_SKSI_QUERY_EXECUTION;
  private static final SubLSymbol $kw568$START_TIME;
  private static final SubLSymbol $kw569$START;
  private static final SubLSymbol $kw570$END_TIME;
  private static final SubLSymbol $kw571$SKSI_QUERY_TOTAL_TIME;
  private static final SubLSymbol $kw572$SKSI_QUERY_START_TIMES;
  private static final SubLSymbol $kw573$SKSI_QUERY;
  private static final SubLList $list574;
  private static final SubLList $list575;
  private static final SubLSymbol $kw576$SPARQL;
  private static final SubLSymbol $kw577$RESULT_SET;
  private static final SubLSymbol $sym578$INFERENCES;
  private static final SubLSymbol $sym579$INFERENCE;
  private static final SubLSymbol $sym580$START;
  private static final SubLSymbol $sym581$END;
  private static final SubLSymbol $sym582$COUNT;
  private static final SubLSymbol $sym583$LAST_ONE;
  private static final SubLSymbol $sym584$FWHEN;
  private static final SubLSymbol $sym585$INFERENCE_CUMULATIVE_TIME_SO_FAR;
  private static final SubLSymbol $sym586$LENGTH;
  private static final SubLSymbol $sym587$POSSIBLY_ADD_INFERENCE_SPARQL_QUERY_PROFILE;
  private static final SubLSymbol $sym588$INFERENCE_WITHIN_SPARQL_QUERY_EXECUTION;
  private static final SubLSymbol $kw589$SPARQL_QUERY_PROFILE;
  private static final SubLSymbol $kw590$SKSI_QUERY_TOTAL_TIME_ACC;
  private static final SubLSymbol $kw591$SKSI_QUERY_START_TIMES_ACC;
  private static final SubLSymbol $kw592$SPARQL_QUERY_PROFILE_ACC;

  @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-datastructures-inference.lisp", position = 1349L)
  public static SubLObject inference_type_p(final SubLObject v_object)
  {
    return subl_promotions.memberP( v_object, $inference_types$.getGlobalValue(), Symbols.symbol_function( EQ ), UNPROVIDED );
  }

  @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-datastructures-inference.lisp", position = 3537L)
  public static SubLObject inference_print_function_trampoline(final SubLObject v_object, final SubLObject stream)
  {
    print_inference( v_object, stream, ZERO_INTEGER );
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-datastructures-inference.lisp", position = 3537L)
  public static SubLObject inference_p(final SubLObject v_object)
  {
    return ( v_object.getClass() == $inference_native.class ) ? T : NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-datastructures-inference.lisp", position = 3537L)
  public static SubLObject infrnc_suid(final SubLObject v_object)
  {
    assert NIL != inference_p( v_object ) : v_object;
    return v_object.getField2();
  }

  @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-datastructures-inference.lisp", position = 3537L)
  public static SubLObject infrnc_problem_store(final SubLObject v_object)
  {
    assert NIL != inference_p( v_object ) : v_object;
    return v_object.getField3();
  }

  @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-datastructures-inference.lisp", position = 3537L)
  public static SubLObject infrnc_forward_propagate(final SubLObject v_object)
  {
    assert NIL != inference_p( v_object ) : v_object;
    return v_object.getField4();
  }

  @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-datastructures-inference.lisp", position = 3537L)
  public static SubLObject infrnc_input_mt(final SubLObject v_object)
  {
    assert NIL != inference_p( v_object ) : v_object;
    return v_object.getField5();
  }

  @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-datastructures-inference.lisp", position = 3537L)
  public static SubLObject infrnc_input_el_query(final SubLObject v_object)
  {
    assert NIL != inference_p( v_object ) : v_object;
    return v_object.getField6();
  }

  @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-datastructures-inference.lisp", position = 3537L)
  public static SubLObject infrnc_input_non_explanatory_el_query(final SubLObject v_object)
  {
    assert NIL != inference_p( v_object ) : v_object;
    return v_object.getField7();
  }

  @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-datastructures-inference.lisp", position = 3537L)
  public static SubLObject infrnc_input_query_properties(final SubLObject v_object)
  {
    assert NIL != inference_p( v_object ) : v_object;
    return v_object.getField8();
  }

  @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-datastructures-inference.lisp", position = 3537L)
  public static SubLObject infrnc_mt(final SubLObject v_object)
  {
    assert NIL != inference_p( v_object ) : v_object;
    return v_object.getField9();
  }

  @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-datastructures-inference.lisp", position = 3537L)
  public static SubLObject infrnc_el_query(final SubLObject v_object)
  {
    assert NIL != inference_p( v_object ) : v_object;
    return v_object.getField10();
  }

  @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-datastructures-inference.lisp", position = 3537L)
  public static SubLObject infrnc_el_bindings(final SubLObject v_object)
  {
    assert NIL != inference_p( v_object ) : v_object;
    return v_object.getField11();
  }

  @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-datastructures-inference.lisp", position = 3537L)
  public static SubLObject infrnc_hl_query(final SubLObject v_object)
  {
    assert NIL != inference_p( v_object ) : v_object;
    return v_object.getField12();
  }

  @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-datastructures-inference.lisp", position = 3537L)
  public static SubLObject infrnc_explanatory_subquery(final SubLObject v_object)
  {
    assert NIL != inference_p( v_object ) : v_object;
    return v_object.getField13();
  }

  @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-datastructures-inference.lisp", position = 3537L)
  public static SubLObject infrnc_non_explanatory_subquery(final SubLObject v_object)
  {
    assert NIL != inference_p( v_object ) : v_object;
    return v_object.getField14();
  }

  @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-datastructures-inference.lisp", position = 3537L)
  public static SubLObject infrnc_free_hl_vars(final SubLObject v_object)
  {
    assert NIL != inference_p( v_object ) : v_object;
    return v_object.getField15();
  }

  @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-datastructures-inference.lisp", position = 3537L)
  public static SubLObject infrnc_hypothetical_bindings(final SubLObject v_object)
  {
    assert NIL != inference_p( v_object ) : v_object;
    return v_object.getField16();
  }

  @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-datastructures-inference.lisp", position = 3537L)
  public static SubLObject infrnc_answer_id_index(final SubLObject v_object)
  {
    assert NIL != inference_p( v_object ) : v_object;
    return v_object.getField17();
  }

  @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-datastructures-inference.lisp", position = 3537L)
  public static SubLObject infrnc_answer_bindings_index(final SubLObject v_object)
  {
    assert NIL != inference_p( v_object ) : v_object;
    return v_object.getField18();
  }

  @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-datastructures-inference.lisp", position = 3537L)
  public static SubLObject infrnc_new_answer_id_start(final SubLObject v_object)
  {
    assert NIL != inference_p( v_object ) : v_object;
    return v_object.getField19();
  }

  @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-datastructures-inference.lisp", position = 3537L)
  public static SubLObject infrnc_new_answer_justifications(final SubLObject v_object)
  {
    assert NIL != inference_p( v_object ) : v_object;
    return v_object.getField20();
  }

  @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-datastructures-inference.lisp", position = 3537L)
  public static SubLObject infrnc_status(final SubLObject v_object)
  {
    assert NIL != inference_p( v_object ) : v_object;
    return ( ($inference_native) v_object ).$status;
  }

  @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-datastructures-inference.lisp", position = 3537L)
  public static SubLObject infrnc_suspend_status(final SubLObject v_object)
  {
    assert NIL != inference_p( v_object ) : v_object;
    return ( ($inference_native) v_object ).$suspend_status;
  }

  @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-datastructures-inference.lisp", position = 3537L)
  public static SubLObject infrnc_root_link(final SubLObject v_object)
  {
    assert NIL != inference_p( v_object ) : v_object;
    return ( ($inference_native) v_object ).$root_link;
  }

  @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-datastructures-inference.lisp", position = 3537L)
  public static SubLObject infrnc_relevant_problems(final SubLObject v_object)
  {
    assert NIL != inference_p( v_object ) : v_object;
    return ( ($inference_native) v_object ).$relevant_problems;
  }

  @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-datastructures-inference.lisp", position = 3537L)
  public static SubLObject infrnc_strategy_set(final SubLObject v_object)
  {
    assert NIL != inference_p( v_object ) : v_object;
    return ( ($inference_native) v_object ).$strategy_set;
  }

  @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-datastructures-inference.lisp", position = 3537L)
  public static SubLObject infrnc_control_process(final SubLObject v_object)
  {
    assert NIL != inference_p( v_object ) : v_object;
    return ( ($inference_native) v_object ).$control_process;
  }

  @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-datastructures-inference.lisp", position = 3537L)
  public static SubLObject infrnc_interrupting_processes(final SubLObject v_object)
  {
    assert NIL != inference_p( v_object ) : v_object;
    return ( ($inference_native) v_object ).$interrupting_processes;
  }

  @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-datastructures-inference.lisp", position = 3537L)
  public static SubLObject infrnc_max_transformation_depth_reached(final SubLObject v_object)
  {
    assert NIL != inference_p( v_object ) : v_object;
    return ( ($inference_native) v_object ).$max_transformation_depth_reached;
  }

  @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-datastructures-inference.lisp", position = 3537L)
  public static SubLObject infrnc_disjunction_free_el_vars_policy(final SubLObject v_object)
  {
    assert NIL != inference_p( v_object ) : v_object;
    return ( ($inference_native) v_object ).$disjunction_free_el_vars_policy;
  }

  @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-datastructures-inference.lisp", position = 3537L)
  public static SubLObject infrnc_result_uniqueness_criterion(final SubLObject v_object)
  {
    assert NIL != inference_p( v_object ) : v_object;
    return ( ($inference_native) v_object ).$result_uniqueness_criterion;
  }

  @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-datastructures-inference.lisp", position = 3537L)
  public static SubLObject infrnc_allow_hl_predicate_transformationP(final SubLObject v_object)
  {
    assert NIL != inference_p( v_object ) : v_object;
    return ( ($inference_native) v_object ).$allow_hl_predicate_transformationP;
  }

  @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-datastructures-inference.lisp", position = 3537L)
  public static SubLObject infrnc_allow_unbound_predicate_transformationP(final SubLObject v_object)
  {
    assert NIL != inference_p( v_object ) : v_object;
    return ( ($inference_native) v_object ).$allow_unbound_predicate_transformationP;
  }

  @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-datastructures-inference.lisp", position = 3537L)
  public static SubLObject infrnc_allow_evaluatable_predicate_transformationP(final SubLObject v_object)
  {
    assert NIL != inference_p( v_object ) : v_object;
    return ( ($inference_native) v_object ).$allow_evaluatable_predicate_transformationP;
  }

  @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-datastructures-inference.lisp", position = 3537L)
  public static SubLObject infrnc_allow_indeterminate_resultsP(final SubLObject v_object)
  {
    assert NIL != inference_p( v_object ) : v_object;
    return ( ($inference_native) v_object ).$allow_indeterminate_resultsP;
  }

  @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-datastructures-inference.lisp", position = 3537L)
  public static SubLObject infrnc_allowed_rules(final SubLObject v_object)
  {
    assert NIL != inference_p( v_object ) : v_object;
    return ( ($inference_native) v_object ).$allowed_rules;
  }

  @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-datastructures-inference.lisp", position = 3537L)
  public static SubLObject infrnc_forbidden_rules(final SubLObject v_object)
  {
    assert NIL != inference_p( v_object ) : v_object;
    return ( ($inference_native) v_object ).$forbidden_rules;
  }

  @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-datastructures-inference.lisp", position = 3537L)
  public static SubLObject infrnc_allowed_modules(final SubLObject v_object)
  {
    assert NIL != inference_p( v_object ) : v_object;
    return ( ($inference_native) v_object ).$allowed_modules;
  }

  @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-datastructures-inference.lisp", position = 3537L)
  public static SubLObject infrnc_allow_abnormality_checkingP(final SubLObject v_object)
  {
    assert NIL != inference_p( v_object ) : v_object;
    return ( ($inference_native) v_object ).$allow_abnormality_checkingP;
  }

  @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-datastructures-inference.lisp", position = 3537L)
  public static SubLObject infrnc_transitive_closure_mode(final SubLObject v_object)
  {
    assert NIL != inference_p( v_object ) : v_object;
    return ( ($inference_native) v_object ).$transitive_closure_mode;
  }

  @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-datastructures-inference.lisp", position = 3537L)
  public static SubLObject infrnc_problem_store_privateP(final SubLObject v_object)
  {
    assert NIL != inference_p( v_object ) : v_object;
    return ( ($inference_native) v_object ).$problem_store_privateP;
  }

  @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-datastructures-inference.lisp", position = 3537L)
  public static SubLObject infrnc_continuableP(final SubLObject v_object)
  {
    assert NIL != inference_p( v_object ) : v_object;
    return ( ($inference_native) v_object ).$continuableP;
  }

  @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-datastructures-inference.lisp", position = 3537L)
  public static SubLObject infrnc_browsableP(final SubLObject v_object)
  {
    assert NIL != inference_p( v_object ) : v_object;
    return ( ($inference_native) v_object ).$browsableP;
  }

  @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-datastructures-inference.lisp", position = 3537L)
  public static SubLObject infrnc_return_type(final SubLObject v_object)
  {
    assert NIL != inference_p( v_object ) : v_object;
    return ( ($inference_native) v_object ).$return_type;
  }

  @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-datastructures-inference.lisp", position = 3537L)
  public static SubLObject infrnc_answer_language(final SubLObject v_object)
  {
    assert NIL != inference_p( v_object ) : v_object;
    return ( ($inference_native) v_object ).$answer_language;
  }

  @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-datastructures-inference.lisp", position = 3537L)
  public static SubLObject infrnc_cache_resultsP(final SubLObject v_object)
  {
    assert NIL != inference_p( v_object ) : v_object;
    return ( ($inference_native) v_object ).$cache_resultsP;
  }

  @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-datastructures-inference.lisp", position = 3537L)
  public static SubLObject infrnc_blockingP(final SubLObject v_object)
  {
    assert NIL != inference_p( v_object ) : v_object;
    return ( ($inference_native) v_object ).$blockingP;
  }

  @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-datastructures-inference.lisp", position = 3537L)
  public static SubLObject infrnc_max_number(final SubLObject v_object)
  {
    assert NIL != inference_p( v_object ) : v_object;
    return ( ($inference_native) v_object ).$max_number;
  }

  @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-datastructures-inference.lisp", position = 3537L)
  public static SubLObject infrnc_max_time(final SubLObject v_object)
  {
    assert NIL != inference_p( v_object ) : v_object;
    return ( ($inference_native) v_object ).$max_time;
  }

  @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-datastructures-inference.lisp", position = 3537L)
  public static SubLObject infrnc_max_step(final SubLObject v_object)
  {
    assert NIL != inference_p( v_object ) : v_object;
    return ( ($inference_native) v_object ).$max_step;
  }

  @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-datastructures-inference.lisp", position = 3537L)
  public static SubLObject infrnc_mode(final SubLObject v_object)
  {
    assert NIL != inference_p( v_object ) : v_object;
    return ( ($inference_native) v_object ).$mode;
  }

  @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-datastructures-inference.lisp", position = 3537L)
  public static SubLObject infrnc_forward_max_time(final SubLObject v_object)
  {
    assert NIL != inference_p( v_object ) : v_object;
    return ( ($inference_native) v_object ).$forward_max_time;
  }

  @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-datastructures-inference.lisp", position = 3537L)
  public static SubLObject infrnc_max_proof_depth(final SubLObject v_object)
  {
    assert NIL != inference_p( v_object ) : v_object;
    return ( ($inference_native) v_object ).$max_proof_depth;
  }

  @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-datastructures-inference.lisp", position = 3537L)
  public static SubLObject infrnc_max_transformation_depth(final SubLObject v_object)
  {
    assert NIL != inference_p( v_object ) : v_object;
    return ( ($inference_native) v_object ).$max_transformation_depth;
  }

  @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-datastructures-inference.lisp", position = 3537L)
  public static SubLObject infrnc_min_rule_utility(final SubLObject v_object)
  {
    assert NIL != inference_p( v_object ) : v_object;
    return ( ($inference_native) v_object ).$min_rule_utility;
  }

  @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-datastructures-inference.lisp", position = 3537L)
  public static SubLObject infrnc_probably_approximately_done(final SubLObject v_object)
  {
    assert NIL != inference_p( v_object ) : v_object;
    return ( ($inference_native) v_object ).$probably_approximately_done;
  }

  @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-datastructures-inference.lisp", position = 3537L)
  public static SubLObject infrnc_metrics_template(final SubLObject v_object)
  {
    assert NIL != inference_p( v_object ) : v_object;
    return ( ($inference_native) v_object ).$metrics_template;
  }

  @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-datastructures-inference.lisp", position = 3537L)
  public static SubLObject infrnc_start_universal_time(final SubLObject v_object)
  {
    assert NIL != inference_p( v_object ) : v_object;
    return ( ($inference_native) v_object ).$start_universal_time;
  }

  @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-datastructures-inference.lisp", position = 3537L)
  public static SubLObject infrnc_start_internal_real_time(final SubLObject v_object)
  {
    assert NIL != inference_p( v_object ) : v_object;
    return ( ($inference_native) v_object ).$start_internal_real_time;
  }

  @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-datastructures-inference.lisp", position = 3537L)
  public static SubLObject infrnc_end_internal_real_time(final SubLObject v_object)
  {
    assert NIL != inference_p( v_object ) : v_object;
    return ( ($inference_native) v_object ).$end_internal_real_time;
  }

  @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-datastructures-inference.lisp", position = 3537L)
  public static SubLObject infrnc_pad_internal_real_time(final SubLObject v_object)
  {
    assert NIL != inference_p( v_object ) : v_object;
    return ( ($inference_native) v_object ).$pad_internal_real_time;
  }

  @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-datastructures-inference.lisp", position = 3537L)
  public static SubLObject infrnc_hypothesization_time(final SubLObject v_object)
  {
    assert NIL != inference_p( v_object ) : v_object;
    return ( ($inference_native) v_object ).$hypothesization_time;
  }

  @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-datastructures-inference.lisp", position = 3537L)
  public static SubLObject infrnc_cumulative_time(final SubLObject v_object)
  {
    assert NIL != inference_p( v_object ) : v_object;
    return ( ($inference_native) v_object ).$cumulative_time;
  }

  @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-datastructures-inference.lisp", position = 3537L)
  public static SubLObject infrnc_step_count(final SubLObject v_object)
  {
    assert NIL != inference_p( v_object ) : v_object;
    return ( ($inference_native) v_object ).$step_count;
  }

  @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-datastructures-inference.lisp", position = 3537L)
  public static SubLObject infrnc_cumulative_step_count(final SubLObject v_object)
  {
    assert NIL != inference_p( v_object ) : v_object;
    return ( ($inference_native) v_object ).$cumulative_step_count;
  }

  @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-datastructures-inference.lisp", position = 3537L)
  public static SubLObject infrnc_events(final SubLObject v_object)
  {
    assert NIL != inference_p( v_object ) : v_object;
    return ( ($inference_native) v_object ).$events;
  }

  @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-datastructures-inference.lisp", position = 3537L)
  public static SubLObject infrnc_halt_conditions(final SubLObject v_object)
  {
    assert NIL != inference_p( v_object ) : v_object;
    return ( ($inference_native) v_object ).$halt_conditions;
  }

  @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-datastructures-inference.lisp", position = 3537L)
  public static SubLObject infrnc_accumulators(final SubLObject v_object)
  {
    assert NIL != inference_p( v_object ) : v_object;
    return ( ($inference_native) v_object ).$accumulators;
  }

  @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-datastructures-inference.lisp", position = 3537L)
  public static SubLObject infrnc_proof_watermark(final SubLObject v_object)
  {
    assert NIL != inference_p( v_object ) : v_object;
    return ( ($inference_native) v_object ).$proof_watermark;
  }

  @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-datastructures-inference.lisp", position = 3537L)
  public static SubLObject infrnc_problem_working_time_data(final SubLObject v_object)
  {
    assert NIL != inference_p( v_object ) : v_object;
    return ( ($inference_native) v_object ).$problem_working_time_data;
  }

  @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-datastructures-inference.lisp", position = 3537L)
  public static SubLObject infrnc_type(final SubLObject v_object)
  {
    assert NIL != inference_p( v_object ) : v_object;
    return ( ($inference_native) v_object ).$type;
  }

  @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-datastructures-inference.lisp", position = 3537L)
  public static SubLObject infrnc_data(final SubLObject v_object)
  {
    assert NIL != inference_p( v_object ) : v_object;
    return ( ($inference_native) v_object ).$data;
  }

  @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-datastructures-inference.lisp", position = 3537L)
  public static SubLObject infrnc_properties(final SubLObject v_object)
  {
    assert NIL != inference_p( v_object ) : v_object;
    return ( ($inference_native) v_object ).$properties;
  }

  @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-datastructures-inference.lisp", position = 3537L)
  public static SubLObject _csetf_infrnc_suid(final SubLObject v_object, final SubLObject value)
  {
    assert NIL != inference_p( v_object ) : v_object;
    return v_object.setField2( value );
  }

  @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-datastructures-inference.lisp", position = 3537L)
  public static SubLObject _csetf_infrnc_problem_store(final SubLObject v_object, final SubLObject value)
  {
    assert NIL != inference_p( v_object ) : v_object;
    return v_object.setField3( value );
  }

  @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-datastructures-inference.lisp", position = 3537L)
  public static SubLObject _csetf_infrnc_forward_propagate(final SubLObject v_object, final SubLObject value)
  {
    assert NIL != inference_p( v_object ) : v_object;
    return v_object.setField4( value );
  }

  @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-datastructures-inference.lisp", position = 3537L)
  public static SubLObject _csetf_infrnc_input_mt(final SubLObject v_object, final SubLObject value)
  {
    assert NIL != inference_p( v_object ) : v_object;
    return v_object.setField5( value );
  }

  @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-datastructures-inference.lisp", position = 3537L)
  public static SubLObject _csetf_infrnc_input_el_query(final SubLObject v_object, final SubLObject value)
  {
    assert NIL != inference_p( v_object ) : v_object;
    return v_object.setField6( value );
  }

  @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-datastructures-inference.lisp", position = 3537L)
  public static SubLObject _csetf_infrnc_input_non_explanatory_el_query(final SubLObject v_object, final SubLObject value)
  {
    assert NIL != inference_p( v_object ) : v_object;
    return v_object.setField7( value );
  }

  @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-datastructures-inference.lisp", position = 3537L)
  public static SubLObject _csetf_infrnc_input_query_properties(final SubLObject v_object, final SubLObject value)
  {
    assert NIL != inference_p( v_object ) : v_object;
    return v_object.setField8( value );
  }

  @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-datastructures-inference.lisp", position = 3537L)
  public static SubLObject _csetf_infrnc_mt(final SubLObject v_object, final SubLObject value)
  {
    assert NIL != inference_p( v_object ) : v_object;
    return v_object.setField9( value );
  }

  @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-datastructures-inference.lisp", position = 3537L)
  public static SubLObject _csetf_infrnc_el_query(final SubLObject v_object, final SubLObject value)
  {
    assert NIL != inference_p( v_object ) : v_object;
    return v_object.setField10( value );
  }

  @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-datastructures-inference.lisp", position = 3537L)
  public static SubLObject _csetf_infrnc_el_bindings(final SubLObject v_object, final SubLObject value)
  {
    assert NIL != inference_p( v_object ) : v_object;
    return v_object.setField11( value );
  }

  @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-datastructures-inference.lisp", position = 3537L)
  public static SubLObject _csetf_infrnc_hl_query(final SubLObject v_object, final SubLObject value)
  {
    assert NIL != inference_p( v_object ) : v_object;
    return v_object.setField12( value );
  }

  @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-datastructures-inference.lisp", position = 3537L)
  public static SubLObject _csetf_infrnc_explanatory_subquery(final SubLObject v_object, final SubLObject value)
  {
    assert NIL != inference_p( v_object ) : v_object;
    return v_object.setField13( value );
  }

  @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-datastructures-inference.lisp", position = 3537L)
  public static SubLObject _csetf_infrnc_non_explanatory_subquery(final SubLObject v_object, final SubLObject value)
  {
    assert NIL != inference_p( v_object ) : v_object;
    return v_object.setField14( value );
  }

  @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-datastructures-inference.lisp", position = 3537L)
  public static SubLObject _csetf_infrnc_free_hl_vars(final SubLObject v_object, final SubLObject value)
  {
    assert NIL != inference_p( v_object ) : v_object;
    return v_object.setField15( value );
  }

  @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-datastructures-inference.lisp", position = 3537L)
  public static SubLObject _csetf_infrnc_hypothetical_bindings(final SubLObject v_object, final SubLObject value)
  {
    assert NIL != inference_p( v_object ) : v_object;
    return v_object.setField16( value );
  }

  @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-datastructures-inference.lisp", position = 3537L)
  public static SubLObject _csetf_infrnc_answer_id_index(final SubLObject v_object, final SubLObject value)
  {
    assert NIL != inference_p( v_object ) : v_object;
    return v_object.setField17( value );
  }

  @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-datastructures-inference.lisp", position = 3537L)
  public static SubLObject _csetf_infrnc_answer_bindings_index(final SubLObject v_object, final SubLObject value)
  {
    assert NIL != inference_p( v_object ) : v_object;
    return v_object.setField18( value );
  }

  @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-datastructures-inference.lisp", position = 3537L)
  public static SubLObject _csetf_infrnc_new_answer_id_start(final SubLObject v_object, final SubLObject value)
  {
    assert NIL != inference_p( v_object ) : v_object;
    return v_object.setField19( value );
  }

  @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-datastructures-inference.lisp", position = 3537L)
  public static SubLObject _csetf_infrnc_new_answer_justifications(final SubLObject v_object, final SubLObject value)
  {
    assert NIL != inference_p( v_object ) : v_object;
    return v_object.setField20( value );
  }

  @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-datastructures-inference.lisp", position = 3537L)
  public static SubLObject _csetf_infrnc_status(final SubLObject v_object, final SubLObject value)
  {
    assert NIL != inference_p( v_object ) : v_object;
    return ( ($inference_native) v_object ).$status = value;
  }

  @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-datastructures-inference.lisp", position = 3537L)
  public static SubLObject _csetf_infrnc_suspend_status(final SubLObject v_object, final SubLObject value)
  {
    assert NIL != inference_p( v_object ) : v_object;
    return ( ($inference_native) v_object ).$suspend_status = value;
  }

  @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-datastructures-inference.lisp", position = 3537L)
  public static SubLObject _csetf_infrnc_root_link(final SubLObject v_object, final SubLObject value)
  {
    assert NIL != inference_p( v_object ) : v_object;
    return ( ($inference_native) v_object ).$root_link = value;
  }

  @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-datastructures-inference.lisp", position = 3537L)
  public static SubLObject _csetf_infrnc_relevant_problems(final SubLObject v_object, final SubLObject value)
  {
    assert NIL != inference_p( v_object ) : v_object;
    return ( ($inference_native) v_object ).$relevant_problems = value;
  }

  @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-datastructures-inference.lisp", position = 3537L)
  public static SubLObject _csetf_infrnc_strategy_set(final SubLObject v_object, final SubLObject value)
  {
    assert NIL != inference_p( v_object ) : v_object;
    return ( ($inference_native) v_object ).$strategy_set = value;
  }

  @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-datastructures-inference.lisp", position = 3537L)
  public static SubLObject _csetf_infrnc_control_process(final SubLObject v_object, final SubLObject value)
  {
    assert NIL != inference_p( v_object ) : v_object;
    return ( ($inference_native) v_object ).$control_process = value;
  }

  @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-datastructures-inference.lisp", position = 3537L)
  public static SubLObject _csetf_infrnc_interrupting_processes(final SubLObject v_object, final SubLObject value)
  {
    assert NIL != inference_p( v_object ) : v_object;
    return ( ($inference_native) v_object ).$interrupting_processes = value;
  }

  @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-datastructures-inference.lisp", position = 3537L)
  public static SubLObject _csetf_infrnc_max_transformation_depth_reached(final SubLObject v_object, final SubLObject value)
  {
    assert NIL != inference_p( v_object ) : v_object;
    return ( ($inference_native) v_object ).$max_transformation_depth_reached = value;
  }

  @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-datastructures-inference.lisp", position = 3537L)
  public static SubLObject _csetf_infrnc_disjunction_free_el_vars_policy(final SubLObject v_object, final SubLObject value)
  {
    assert NIL != inference_p( v_object ) : v_object;
    return ( ($inference_native) v_object ).$disjunction_free_el_vars_policy = value;
  }

  @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-datastructures-inference.lisp", position = 3537L)
  public static SubLObject _csetf_infrnc_result_uniqueness_criterion(final SubLObject v_object, final SubLObject value)
  {
    assert NIL != inference_p( v_object ) : v_object;
    return ( ($inference_native) v_object ).$result_uniqueness_criterion = value;
  }

  @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-datastructures-inference.lisp", position = 3537L)
  public static SubLObject _csetf_infrnc_allow_hl_predicate_transformationP(final SubLObject v_object, final SubLObject value)
  {
    assert NIL != inference_p( v_object ) : v_object;
    return ( ($inference_native) v_object ).$allow_hl_predicate_transformationP = value;
  }

  @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-datastructures-inference.lisp", position = 3537L)
  public static SubLObject _csetf_infrnc_allow_unbound_predicate_transformationP(final SubLObject v_object, final SubLObject value)
  {
    assert NIL != inference_p( v_object ) : v_object;
    return ( ($inference_native) v_object ).$allow_unbound_predicate_transformationP = value;
  }

  @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-datastructures-inference.lisp", position = 3537L)
  public static SubLObject _csetf_infrnc_allow_evaluatable_predicate_transformationP(final SubLObject v_object, final SubLObject value)
  {
    assert NIL != inference_p( v_object ) : v_object;
    return ( ($inference_native) v_object ).$allow_evaluatable_predicate_transformationP = value;
  }

  @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-datastructures-inference.lisp", position = 3537L)
  public static SubLObject _csetf_infrnc_allow_indeterminate_resultsP(final SubLObject v_object, final SubLObject value)
  {
    assert NIL != inference_p( v_object ) : v_object;
    return ( ($inference_native) v_object ).$allow_indeterminate_resultsP = value;
  }

  @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-datastructures-inference.lisp", position = 3537L)
  public static SubLObject _csetf_infrnc_allowed_rules(final SubLObject v_object, final SubLObject value)
  {
    assert NIL != inference_p( v_object ) : v_object;
    return ( ($inference_native) v_object ).$allowed_rules = value;
  }

  @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-datastructures-inference.lisp", position = 3537L)
  public static SubLObject _csetf_infrnc_forbidden_rules(final SubLObject v_object, final SubLObject value)
  {
    assert NIL != inference_p( v_object ) : v_object;
    return ( ($inference_native) v_object ).$forbidden_rules = value;
  }

  @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-datastructures-inference.lisp", position = 3537L)
  public static SubLObject _csetf_infrnc_allowed_modules(final SubLObject v_object, final SubLObject value)
  {
    assert NIL != inference_p( v_object ) : v_object;
    return ( ($inference_native) v_object ).$allowed_modules = value;
  }

  @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-datastructures-inference.lisp", position = 3537L)
  public static SubLObject _csetf_infrnc_allow_abnormality_checkingP(final SubLObject v_object, final SubLObject value)
  {
    assert NIL != inference_p( v_object ) : v_object;
    return ( ($inference_native) v_object ).$allow_abnormality_checkingP = value;
  }

  @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-datastructures-inference.lisp", position = 3537L)
  public static SubLObject _csetf_infrnc_transitive_closure_mode(final SubLObject v_object, final SubLObject value)
  {
    assert NIL != inference_p( v_object ) : v_object;
    return ( ($inference_native) v_object ).$transitive_closure_mode = value;
  }

  @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-datastructures-inference.lisp", position = 3537L)
  public static SubLObject _csetf_infrnc_problem_store_privateP(final SubLObject v_object, final SubLObject value)
  {
    assert NIL != inference_p( v_object ) : v_object;
    return ( ($inference_native) v_object ).$problem_store_privateP = value;
  }

  @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-datastructures-inference.lisp", position = 3537L)
  public static SubLObject _csetf_infrnc_continuableP(final SubLObject v_object, final SubLObject value)
  {
    assert NIL != inference_p( v_object ) : v_object;
    return ( ($inference_native) v_object ).$continuableP = value;
  }

  @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-datastructures-inference.lisp", position = 3537L)
  public static SubLObject _csetf_infrnc_browsableP(final SubLObject v_object, final SubLObject value)
  {
    assert NIL != inference_p( v_object ) : v_object;
    return ( ($inference_native) v_object ).$browsableP = value;
  }

  @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-datastructures-inference.lisp", position = 3537L)
  public static SubLObject _csetf_infrnc_return_type(final SubLObject v_object, final SubLObject value)
  {
    assert NIL != inference_p( v_object ) : v_object;
    return ( ($inference_native) v_object ).$return_type = value;
  }

  @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-datastructures-inference.lisp", position = 3537L)
  public static SubLObject _csetf_infrnc_answer_language(final SubLObject v_object, final SubLObject value)
  {
    assert NIL != inference_p( v_object ) : v_object;
    return ( ($inference_native) v_object ).$answer_language = value;
  }

  @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-datastructures-inference.lisp", position = 3537L)
  public static SubLObject _csetf_infrnc_cache_resultsP(final SubLObject v_object, final SubLObject value)
  {
    assert NIL != inference_p( v_object ) : v_object;
    return ( ($inference_native) v_object ).$cache_resultsP = value;
  }

  @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-datastructures-inference.lisp", position = 3537L)
  public static SubLObject _csetf_infrnc_blockingP(final SubLObject v_object, final SubLObject value)
  {
    assert NIL != inference_p( v_object ) : v_object;
    return ( ($inference_native) v_object ).$blockingP = value;
  }

  @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-datastructures-inference.lisp", position = 3537L)
  public static SubLObject _csetf_infrnc_max_number(final SubLObject v_object, final SubLObject value)
  {
    assert NIL != inference_p( v_object ) : v_object;
    return ( ($inference_native) v_object ).$max_number = value;
  }

  @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-datastructures-inference.lisp", position = 3537L)
  public static SubLObject _csetf_infrnc_max_time(final SubLObject v_object, final SubLObject value)
  {
    assert NIL != inference_p( v_object ) : v_object;
    return ( ($inference_native) v_object ).$max_time = value;
  }

  @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-datastructures-inference.lisp", position = 3537L)
  public static SubLObject _csetf_infrnc_max_step(final SubLObject v_object, final SubLObject value)
  {
    assert NIL != inference_p( v_object ) : v_object;
    return ( ($inference_native) v_object ).$max_step = value;
  }

  @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-datastructures-inference.lisp", position = 3537L)
  public static SubLObject _csetf_infrnc_mode(final SubLObject v_object, final SubLObject value)
  {
    assert NIL != inference_p( v_object ) : v_object;
    return ( ($inference_native) v_object ).$mode = value;
  }

  @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-datastructures-inference.lisp", position = 3537L)
  public static SubLObject _csetf_infrnc_forward_max_time(final SubLObject v_object, final SubLObject value)
  {
    assert NIL != inference_p( v_object ) : v_object;
    return ( ($inference_native) v_object ).$forward_max_time = value;
  }

  @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-datastructures-inference.lisp", position = 3537L)
  public static SubLObject _csetf_infrnc_max_proof_depth(final SubLObject v_object, final SubLObject value)
  {
    assert NIL != inference_p( v_object ) : v_object;
    return ( ($inference_native) v_object ).$max_proof_depth = value;
  }

  @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-datastructures-inference.lisp", position = 3537L)
  public static SubLObject _csetf_infrnc_max_transformation_depth(final SubLObject v_object, final SubLObject value)
  {
    assert NIL != inference_p( v_object ) : v_object;
    return ( ($inference_native) v_object ).$max_transformation_depth = value;
  }

  @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-datastructures-inference.lisp", position = 3537L)
  public static SubLObject _csetf_infrnc_min_rule_utility(final SubLObject v_object, final SubLObject value)
  {
    assert NIL != inference_p( v_object ) : v_object;
    return ( ($inference_native) v_object ).$min_rule_utility = value;
  }

  @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-datastructures-inference.lisp", position = 3537L)
  public static SubLObject _csetf_infrnc_probably_approximately_done(final SubLObject v_object, final SubLObject value)
  {
    assert NIL != inference_p( v_object ) : v_object;
    return ( ($inference_native) v_object ).$probably_approximately_done = value;
  }

  @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-datastructures-inference.lisp", position = 3537L)
  public static SubLObject _csetf_infrnc_metrics_template(final SubLObject v_object, final SubLObject value)
  {
    assert NIL != inference_p( v_object ) : v_object;
    return ( ($inference_native) v_object ).$metrics_template = value;
  }

  @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-datastructures-inference.lisp", position = 3537L)
  public static SubLObject _csetf_infrnc_start_universal_time(final SubLObject v_object, final SubLObject value)
  {
    assert NIL != inference_p( v_object ) : v_object;
    return ( ($inference_native) v_object ).$start_universal_time = value;
  }

  @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-datastructures-inference.lisp", position = 3537L)
  public static SubLObject _csetf_infrnc_start_internal_real_time(final SubLObject v_object, final SubLObject value)
  {
    assert NIL != inference_p( v_object ) : v_object;
    return ( ($inference_native) v_object ).$start_internal_real_time = value;
  }

  @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-datastructures-inference.lisp", position = 3537L)
  public static SubLObject _csetf_infrnc_end_internal_real_time(final SubLObject v_object, final SubLObject value)
  {
    assert NIL != inference_p( v_object ) : v_object;
    return ( ($inference_native) v_object ).$end_internal_real_time = value;
  }

  @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-datastructures-inference.lisp", position = 3537L)
  public static SubLObject _csetf_infrnc_pad_internal_real_time(final SubLObject v_object, final SubLObject value)
  {
    assert NIL != inference_p( v_object ) : v_object;
    return ( ($inference_native) v_object ).$pad_internal_real_time = value;
  }

  @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-datastructures-inference.lisp", position = 3537L)
  public static SubLObject _csetf_infrnc_hypothesization_time(final SubLObject v_object, final SubLObject value)
  {
    assert NIL != inference_p( v_object ) : v_object;
    return ( ($inference_native) v_object ).$hypothesization_time = value;
  }

  @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-datastructures-inference.lisp", position = 3537L)
  public static SubLObject _csetf_infrnc_cumulative_time(final SubLObject v_object, final SubLObject value)
  {
    assert NIL != inference_p( v_object ) : v_object;
    return ( ($inference_native) v_object ).$cumulative_time = value;
  }

  @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-datastructures-inference.lisp", position = 3537L)
  public static SubLObject _csetf_infrnc_step_count(final SubLObject v_object, final SubLObject value)
  {
    assert NIL != inference_p( v_object ) : v_object;
    return ( ($inference_native) v_object ).$step_count = value;
  }

  @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-datastructures-inference.lisp", position = 3537L)
  public static SubLObject _csetf_infrnc_cumulative_step_count(final SubLObject v_object, final SubLObject value)
  {
    assert NIL != inference_p( v_object ) : v_object;
    return ( ($inference_native) v_object ).$cumulative_step_count = value;
  }

  @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-datastructures-inference.lisp", position = 3537L)
  public static SubLObject _csetf_infrnc_events(final SubLObject v_object, final SubLObject value)
  {
    assert NIL != inference_p( v_object ) : v_object;
    return ( ($inference_native) v_object ).$events = value;
  }

  @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-datastructures-inference.lisp", position = 3537L)
  public static SubLObject _csetf_infrnc_halt_conditions(final SubLObject v_object, final SubLObject value)
  {
    assert NIL != inference_p( v_object ) : v_object;
    return ( ($inference_native) v_object ).$halt_conditions = value;
  }

  @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-datastructures-inference.lisp", position = 3537L)
  public static SubLObject _csetf_infrnc_accumulators(final SubLObject v_object, final SubLObject value)
  {
    assert NIL != inference_p( v_object ) : v_object;
    return ( ($inference_native) v_object ).$accumulators = value;
  }

  @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-datastructures-inference.lisp", position = 3537L)
  public static SubLObject _csetf_infrnc_proof_watermark(final SubLObject v_object, final SubLObject value)
  {
    assert NIL != inference_p( v_object ) : v_object;
    return ( ($inference_native) v_object ).$proof_watermark = value;
  }

  @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-datastructures-inference.lisp", position = 3537L)
  public static SubLObject _csetf_infrnc_problem_working_time_data(final SubLObject v_object, final SubLObject value)
  {
    assert NIL != inference_p( v_object ) : v_object;
    return ( ($inference_native) v_object ).$problem_working_time_data = value;
  }

  @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-datastructures-inference.lisp", position = 3537L)
  public static SubLObject _csetf_infrnc_type(final SubLObject v_object, final SubLObject value)
  {
    assert NIL != inference_p( v_object ) : v_object;
    return ( ($inference_native) v_object ).$type = value;
  }

  @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-datastructures-inference.lisp", position = 3537L)
  public static SubLObject _csetf_infrnc_data(final SubLObject v_object, final SubLObject value)
  {
    assert NIL != inference_p( v_object ) : v_object;
    return ( ($inference_native) v_object ).$data = value;
  }

  @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-datastructures-inference.lisp", position = 3537L)
  public static SubLObject _csetf_infrnc_properties(final SubLObject v_object, final SubLObject value)
  {
    assert NIL != inference_p( v_object ) : v_object;
    return ( ($inference_native) v_object ).$properties = value;
  }

  @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-datastructures-inference.lisp", position = 3537L)
  public static SubLObject make_inference(SubLObject arglist)
  {
    if( arglist == UNPROVIDED )
    {
      arglist = NIL;
    }
    final SubLObject v_new = new $inference_native();
    SubLObject next;
    SubLObject current_arg;
    SubLObject current_value;
    SubLObject pcase_var;
    for( next = NIL, next = arglist; NIL != next; next = conses_high.cddr( next ) )
    {
      current_arg = next.first();
      current_value = conses_high.cadr( next );
      pcase_var = current_arg;
      if( pcase_var.eql( $kw204$SUID ) )
      {
        _csetf_infrnc_suid( v_new, current_value );
      }
      else if( pcase_var.eql( $kw205$PROBLEM_STORE ) )
      {
        _csetf_infrnc_problem_store( v_new, current_value );
      }
      else if( pcase_var.eql( $kw206$FORWARD_PROPAGATE ) )
      {
        _csetf_infrnc_forward_propagate( v_new, current_value );
      }
      else if( pcase_var.eql( $kw207$INPUT_MT ) )
      {
        _csetf_infrnc_input_mt( v_new, current_value );
      }
      else if( pcase_var.eql( $kw208$INPUT_EL_QUERY ) )
      {
        _csetf_infrnc_input_el_query( v_new, current_value );
      }
      else if( pcase_var.eql( $kw209$INPUT_NON_EXPLANATORY_EL_QUERY ) )
      {
        _csetf_infrnc_input_non_explanatory_el_query( v_new, current_value );
      }
      else if( pcase_var.eql( $kw210$INPUT_QUERY_PROPERTIES ) )
      {
        _csetf_infrnc_input_query_properties( v_new, current_value );
      }
      else if( pcase_var.eql( $kw211$MT ) )
      {
        _csetf_infrnc_mt( v_new, current_value );
      }
      else if( pcase_var.eql( $kw212$EL_QUERY ) )
      {
        _csetf_infrnc_el_query( v_new, current_value );
      }
      else if( pcase_var.eql( $kw213$EL_BINDINGS ) )
      {
        _csetf_infrnc_el_bindings( v_new, current_value );
      }
      else if( pcase_var.eql( $kw214$HL_QUERY ) )
      {
        _csetf_infrnc_hl_query( v_new, current_value );
      }
      else if( pcase_var.eql( $kw215$EXPLANATORY_SUBQUERY ) )
      {
        _csetf_infrnc_explanatory_subquery( v_new, current_value );
      }
      else if( pcase_var.eql( $kw216$NON_EXPLANATORY_SUBQUERY ) )
      {
        _csetf_infrnc_non_explanatory_subquery( v_new, current_value );
      }
      else if( pcase_var.eql( $kw217$FREE_HL_VARS ) )
      {
        _csetf_infrnc_free_hl_vars( v_new, current_value );
      }
      else if( pcase_var.eql( $kw218$HYPOTHETICAL_BINDINGS ) )
      {
        _csetf_infrnc_hypothetical_bindings( v_new, current_value );
      }
      else if( pcase_var.eql( $kw219$ANSWER_ID_INDEX ) )
      {
        _csetf_infrnc_answer_id_index( v_new, current_value );
      }
      else if( pcase_var.eql( $kw220$ANSWER_BINDINGS_INDEX ) )
      {
        _csetf_infrnc_answer_bindings_index( v_new, current_value );
      }
      else if( pcase_var.eql( $kw221$NEW_ANSWER_ID_START ) )
      {
        _csetf_infrnc_new_answer_id_start( v_new, current_value );
      }
      else if( pcase_var.eql( $kw222$NEW_ANSWER_JUSTIFICATIONS ) )
      {
        _csetf_infrnc_new_answer_justifications( v_new, current_value );
      }
      else if( pcase_var.eql( $kw223$STATUS ) )
      {
        _csetf_infrnc_status( v_new, current_value );
      }
      else if( pcase_var.eql( $kw224$SUSPEND_STATUS ) )
      {
        _csetf_infrnc_suspend_status( v_new, current_value );
      }
      else if( pcase_var.eql( $kw225$ROOT_LINK ) )
      {
        _csetf_infrnc_root_link( v_new, current_value );
      }
      else if( pcase_var.eql( $kw226$RELEVANT_PROBLEMS ) )
      {
        _csetf_infrnc_relevant_problems( v_new, current_value );
      }
      else if( pcase_var.eql( $kw227$STRATEGY_SET ) )
      {
        _csetf_infrnc_strategy_set( v_new, current_value );
      }
      else if( pcase_var.eql( $kw228$CONTROL_PROCESS ) )
      {
        _csetf_infrnc_control_process( v_new, current_value );
      }
      else if( pcase_var.eql( $kw229$INTERRUPTING_PROCESSES ) )
      {
        _csetf_infrnc_interrupting_processes( v_new, current_value );
      }
      else if( pcase_var.eql( $kw230$MAX_TRANSFORMATION_DEPTH_REACHED ) )
      {
        _csetf_infrnc_max_transformation_depth_reached( v_new, current_value );
      }
      else if( pcase_var.eql( $kw231$DISJUNCTION_FREE_EL_VARS_POLICY ) )
      {
        _csetf_infrnc_disjunction_free_el_vars_policy( v_new, current_value );
      }
      else if( pcase_var.eql( $kw232$RESULT_UNIQUENESS_CRITERION ) )
      {
        _csetf_infrnc_result_uniqueness_criterion( v_new, current_value );
      }
      else if( pcase_var.eql( $kw233$ALLOW_HL_PREDICATE_TRANSFORMATION_ ) )
      {
        _csetf_infrnc_allow_hl_predicate_transformationP( v_new, current_value );
      }
      else if( pcase_var.eql( $kw234$ALLOW_UNBOUND_PREDICATE_TRANSFORMATION_ ) )
      {
        _csetf_infrnc_allow_unbound_predicate_transformationP( v_new, current_value );
      }
      else if( pcase_var.eql( $kw235$ALLOW_EVALUATABLE_PREDICATE_TRANSFORMATION_ ) )
      {
        _csetf_infrnc_allow_evaluatable_predicate_transformationP( v_new, current_value );
      }
      else if( pcase_var.eql( $kw236$ALLOW_INDETERMINATE_RESULTS_ ) )
      {
        _csetf_infrnc_allow_indeterminate_resultsP( v_new, current_value );
      }
      else if( pcase_var.eql( $kw237$ALLOWED_RULES ) )
      {
        _csetf_infrnc_allowed_rules( v_new, current_value );
      }
      else if( pcase_var.eql( $kw238$FORBIDDEN_RULES ) )
      {
        _csetf_infrnc_forbidden_rules( v_new, current_value );
      }
      else if( pcase_var.eql( $kw239$ALLOWED_MODULES ) )
      {
        _csetf_infrnc_allowed_modules( v_new, current_value );
      }
      else if( pcase_var.eql( $kw240$ALLOW_ABNORMALITY_CHECKING_ ) )
      {
        _csetf_infrnc_allow_abnormality_checkingP( v_new, current_value );
      }
      else if( pcase_var.eql( $kw241$TRANSITIVE_CLOSURE_MODE ) )
      {
        _csetf_infrnc_transitive_closure_mode( v_new, current_value );
      }
      else if( pcase_var.eql( $kw242$PROBLEM_STORE_PRIVATE_ ) )
      {
        _csetf_infrnc_problem_store_privateP( v_new, current_value );
      }
      else if( pcase_var.eql( $kw243$CONTINUABLE_ ) )
      {
        _csetf_infrnc_continuableP( v_new, current_value );
      }
      else if( pcase_var.eql( $kw244$BROWSABLE_ ) )
      {
        _csetf_infrnc_browsableP( v_new, current_value );
      }
      else if( pcase_var.eql( $kw245$RETURN_TYPE ) )
      {
        _csetf_infrnc_return_type( v_new, current_value );
      }
      else if( pcase_var.eql( $kw246$ANSWER_LANGUAGE ) )
      {
        _csetf_infrnc_answer_language( v_new, current_value );
      }
      else if( pcase_var.eql( $kw247$CACHE_RESULTS_ ) )
      {
        _csetf_infrnc_cache_resultsP( v_new, current_value );
      }
      else if( pcase_var.eql( $kw248$BLOCKING_ ) )
      {
        _csetf_infrnc_blockingP( v_new, current_value );
      }
      else if( pcase_var.eql( $kw249$MAX_NUMBER ) )
      {
        _csetf_infrnc_max_number( v_new, current_value );
      }
      else if( pcase_var.eql( $kw250$MAX_TIME ) )
      {
        _csetf_infrnc_max_time( v_new, current_value );
      }
      else if( pcase_var.eql( $kw251$MAX_STEP ) )
      {
        _csetf_infrnc_max_step( v_new, current_value );
      }
      else if( pcase_var.eql( $kw252$MODE ) )
      {
        _csetf_infrnc_mode( v_new, current_value );
      }
      else if( pcase_var.eql( $kw253$FORWARD_MAX_TIME ) )
      {
        _csetf_infrnc_forward_max_time( v_new, current_value );
      }
      else if( pcase_var.eql( $kw254$MAX_PROOF_DEPTH ) )
      {
        _csetf_infrnc_max_proof_depth( v_new, current_value );
      }
      else if( pcase_var.eql( $kw255$MAX_TRANSFORMATION_DEPTH ) )
      {
        _csetf_infrnc_max_transformation_depth( v_new, current_value );
      }
      else if( pcase_var.eql( $kw256$MIN_RULE_UTILITY ) )
      {
        _csetf_infrnc_min_rule_utility( v_new, current_value );
      }
      else if( pcase_var.eql( $kw257$PROBABLY_APPROXIMATELY_DONE ) )
      {
        _csetf_infrnc_probably_approximately_done( v_new, current_value );
      }
      else if( pcase_var.eql( $kw258$METRICS_TEMPLATE ) )
      {
        _csetf_infrnc_metrics_template( v_new, current_value );
      }
      else if( pcase_var.eql( $kw259$START_UNIVERSAL_TIME ) )
      {
        _csetf_infrnc_start_universal_time( v_new, current_value );
      }
      else if( pcase_var.eql( $kw260$START_INTERNAL_REAL_TIME ) )
      {
        _csetf_infrnc_start_internal_real_time( v_new, current_value );
      }
      else if( pcase_var.eql( $kw261$END_INTERNAL_REAL_TIME ) )
      {
        _csetf_infrnc_end_internal_real_time( v_new, current_value );
      }
      else if( pcase_var.eql( $kw262$PAD_INTERNAL_REAL_TIME ) )
      {
        _csetf_infrnc_pad_internal_real_time( v_new, current_value );
      }
      else if( pcase_var.eql( $kw263$HYPOTHESIZATION_TIME ) )
      {
        _csetf_infrnc_hypothesization_time( v_new, current_value );
      }
      else if( pcase_var.eql( $kw264$CUMULATIVE_TIME ) )
      {
        _csetf_infrnc_cumulative_time( v_new, current_value );
      }
      else if( pcase_var.eql( $kw265$STEP_COUNT ) )
      {
        _csetf_infrnc_step_count( v_new, current_value );
      }
      else if( pcase_var.eql( $kw266$CUMULATIVE_STEP_COUNT ) )
      {
        _csetf_infrnc_cumulative_step_count( v_new, current_value );
      }
      else if( pcase_var.eql( $kw267$EVENTS ) )
      {
        _csetf_infrnc_events( v_new, current_value );
      }
      else if( pcase_var.eql( $kw268$HALT_CONDITIONS ) )
      {
        _csetf_infrnc_halt_conditions( v_new, current_value );
      }
      else if( pcase_var.eql( $kw269$ACCUMULATORS ) )
      {
        _csetf_infrnc_accumulators( v_new, current_value );
      }
      else if( pcase_var.eql( $kw270$PROOF_WATERMARK ) )
      {
        _csetf_infrnc_proof_watermark( v_new, current_value );
      }
      else if( pcase_var.eql( $kw271$PROBLEM_WORKING_TIME_DATA ) )
      {
        _csetf_infrnc_problem_working_time_data( v_new, current_value );
      }
      else if( pcase_var.eql( $kw272$TYPE ) )
      {
        _csetf_infrnc_type( v_new, current_value );
      }
      else if( pcase_var.eql( $kw273$DATA ) )
      {
        _csetf_infrnc_data( v_new, current_value );
      }
      else if( pcase_var.eql( $kw274$PROPERTIES ) )
      {
        _csetf_infrnc_properties( v_new, current_value );
      }
      else
      {
        Errors.error( $str275$Invalid_slot__S_for_construction_, current_arg );
      }
    }
    return v_new;
  }

  @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-datastructures-inference.lisp", position = 3537L)
  public static SubLObject visit_defstruct_inference(final SubLObject obj, final SubLObject visitor_fn)
  {
    Functions.funcall( visitor_fn, obj, $kw276$BEGIN, $sym277$MAKE_INFERENCE, $int58$71 );
    Functions.funcall( visitor_fn, obj, $kw278$SLOT, $kw204$SUID, infrnc_suid( obj ) );
    Functions.funcall( visitor_fn, obj, $kw278$SLOT, $kw205$PROBLEM_STORE, infrnc_problem_store( obj ) );
    Functions.funcall( visitor_fn, obj, $kw278$SLOT, $kw206$FORWARD_PROPAGATE, infrnc_forward_propagate( obj ) );
    Functions.funcall( visitor_fn, obj, $kw278$SLOT, $kw207$INPUT_MT, infrnc_input_mt( obj ) );
    Functions.funcall( visitor_fn, obj, $kw278$SLOT, $kw208$INPUT_EL_QUERY, infrnc_input_el_query( obj ) );
    Functions.funcall( visitor_fn, obj, $kw278$SLOT, $kw209$INPUT_NON_EXPLANATORY_EL_QUERY, infrnc_input_non_explanatory_el_query( obj ) );
    Functions.funcall( visitor_fn, obj, $kw278$SLOT, $kw210$INPUT_QUERY_PROPERTIES, infrnc_input_query_properties( obj ) );
    Functions.funcall( visitor_fn, obj, $kw278$SLOT, $kw211$MT, infrnc_mt( obj ) );
    Functions.funcall( visitor_fn, obj, $kw278$SLOT, $kw212$EL_QUERY, infrnc_el_query( obj ) );
    Functions.funcall( visitor_fn, obj, $kw278$SLOT, $kw213$EL_BINDINGS, infrnc_el_bindings( obj ) );
    Functions.funcall( visitor_fn, obj, $kw278$SLOT, $kw214$HL_QUERY, infrnc_hl_query( obj ) );
    Functions.funcall( visitor_fn, obj, $kw278$SLOT, $kw215$EXPLANATORY_SUBQUERY, infrnc_explanatory_subquery( obj ) );
    Functions.funcall( visitor_fn, obj, $kw278$SLOT, $kw216$NON_EXPLANATORY_SUBQUERY, infrnc_non_explanatory_subquery( obj ) );
    Functions.funcall( visitor_fn, obj, $kw278$SLOT, $kw217$FREE_HL_VARS, infrnc_free_hl_vars( obj ) );
    Functions.funcall( visitor_fn, obj, $kw278$SLOT, $kw218$HYPOTHETICAL_BINDINGS, infrnc_hypothetical_bindings( obj ) );
    Functions.funcall( visitor_fn, obj, $kw278$SLOT, $kw219$ANSWER_ID_INDEX, infrnc_answer_id_index( obj ) );
    Functions.funcall( visitor_fn, obj, $kw278$SLOT, $kw220$ANSWER_BINDINGS_INDEX, infrnc_answer_bindings_index( obj ) );
    Functions.funcall( visitor_fn, obj, $kw278$SLOT, $kw221$NEW_ANSWER_ID_START, infrnc_new_answer_id_start( obj ) );
    Functions.funcall( visitor_fn, obj, $kw278$SLOT, $kw222$NEW_ANSWER_JUSTIFICATIONS, infrnc_new_answer_justifications( obj ) );
    Functions.funcall( visitor_fn, obj, $kw278$SLOT, $kw223$STATUS, infrnc_status( obj ) );
    Functions.funcall( visitor_fn, obj, $kw278$SLOT, $kw224$SUSPEND_STATUS, infrnc_suspend_status( obj ) );
    Functions.funcall( visitor_fn, obj, $kw278$SLOT, $kw225$ROOT_LINK, infrnc_root_link( obj ) );
    Functions.funcall( visitor_fn, obj, $kw278$SLOT, $kw226$RELEVANT_PROBLEMS, infrnc_relevant_problems( obj ) );
    Functions.funcall( visitor_fn, obj, $kw278$SLOT, $kw227$STRATEGY_SET, infrnc_strategy_set( obj ) );
    Functions.funcall( visitor_fn, obj, $kw278$SLOT, $kw228$CONTROL_PROCESS, infrnc_control_process( obj ) );
    Functions.funcall( visitor_fn, obj, $kw278$SLOT, $kw229$INTERRUPTING_PROCESSES, infrnc_interrupting_processes( obj ) );
    Functions.funcall( visitor_fn, obj, $kw278$SLOT, $kw230$MAX_TRANSFORMATION_DEPTH_REACHED, infrnc_max_transformation_depth_reached( obj ) );
    Functions.funcall( visitor_fn, obj, $kw278$SLOT, $kw231$DISJUNCTION_FREE_EL_VARS_POLICY, infrnc_disjunction_free_el_vars_policy( obj ) );
    Functions.funcall( visitor_fn, obj, $kw278$SLOT, $kw232$RESULT_UNIQUENESS_CRITERION, infrnc_result_uniqueness_criterion( obj ) );
    Functions.funcall( visitor_fn, obj, $kw278$SLOT, $kw233$ALLOW_HL_PREDICATE_TRANSFORMATION_, infrnc_allow_hl_predicate_transformationP( obj ) );
    Functions.funcall( visitor_fn, obj, $kw278$SLOT, $kw234$ALLOW_UNBOUND_PREDICATE_TRANSFORMATION_, infrnc_allow_unbound_predicate_transformationP( obj ) );
    Functions.funcall( visitor_fn, obj, $kw278$SLOT, $kw235$ALLOW_EVALUATABLE_PREDICATE_TRANSFORMATION_, infrnc_allow_evaluatable_predicate_transformationP( obj ) );
    Functions.funcall( visitor_fn, obj, $kw278$SLOT, $kw236$ALLOW_INDETERMINATE_RESULTS_, infrnc_allow_indeterminate_resultsP( obj ) );
    Functions.funcall( visitor_fn, obj, $kw278$SLOT, $kw237$ALLOWED_RULES, infrnc_allowed_rules( obj ) );
    Functions.funcall( visitor_fn, obj, $kw278$SLOT, $kw238$FORBIDDEN_RULES, infrnc_forbidden_rules( obj ) );
    Functions.funcall( visitor_fn, obj, $kw278$SLOT, $kw239$ALLOWED_MODULES, infrnc_allowed_modules( obj ) );
    Functions.funcall( visitor_fn, obj, $kw278$SLOT, $kw240$ALLOW_ABNORMALITY_CHECKING_, infrnc_allow_abnormality_checkingP( obj ) );
    Functions.funcall( visitor_fn, obj, $kw278$SLOT, $kw241$TRANSITIVE_CLOSURE_MODE, infrnc_transitive_closure_mode( obj ) );
    Functions.funcall( visitor_fn, obj, $kw278$SLOT, $kw242$PROBLEM_STORE_PRIVATE_, infrnc_problem_store_privateP( obj ) );
    Functions.funcall( visitor_fn, obj, $kw278$SLOT, $kw243$CONTINUABLE_, infrnc_continuableP( obj ) );
    Functions.funcall( visitor_fn, obj, $kw278$SLOT, $kw244$BROWSABLE_, infrnc_browsableP( obj ) );
    Functions.funcall( visitor_fn, obj, $kw278$SLOT, $kw245$RETURN_TYPE, infrnc_return_type( obj ) );
    Functions.funcall( visitor_fn, obj, $kw278$SLOT, $kw246$ANSWER_LANGUAGE, infrnc_answer_language( obj ) );
    Functions.funcall( visitor_fn, obj, $kw278$SLOT, $kw247$CACHE_RESULTS_, infrnc_cache_resultsP( obj ) );
    Functions.funcall( visitor_fn, obj, $kw278$SLOT, $kw248$BLOCKING_, infrnc_blockingP( obj ) );
    Functions.funcall( visitor_fn, obj, $kw278$SLOT, $kw249$MAX_NUMBER, infrnc_max_number( obj ) );
    Functions.funcall( visitor_fn, obj, $kw278$SLOT, $kw250$MAX_TIME, infrnc_max_time( obj ) );
    Functions.funcall( visitor_fn, obj, $kw278$SLOT, $kw251$MAX_STEP, infrnc_max_step( obj ) );
    Functions.funcall( visitor_fn, obj, $kw278$SLOT, $kw252$MODE, infrnc_mode( obj ) );
    Functions.funcall( visitor_fn, obj, $kw278$SLOT, $kw253$FORWARD_MAX_TIME, infrnc_forward_max_time( obj ) );
    Functions.funcall( visitor_fn, obj, $kw278$SLOT, $kw254$MAX_PROOF_DEPTH, infrnc_max_proof_depth( obj ) );
    Functions.funcall( visitor_fn, obj, $kw278$SLOT, $kw255$MAX_TRANSFORMATION_DEPTH, infrnc_max_transformation_depth( obj ) );
    Functions.funcall( visitor_fn, obj, $kw278$SLOT, $kw256$MIN_RULE_UTILITY, infrnc_min_rule_utility( obj ) );
    Functions.funcall( visitor_fn, obj, $kw278$SLOT, $kw257$PROBABLY_APPROXIMATELY_DONE, infrnc_probably_approximately_done( obj ) );
    Functions.funcall( visitor_fn, obj, $kw278$SLOT, $kw258$METRICS_TEMPLATE, infrnc_metrics_template( obj ) );
    Functions.funcall( visitor_fn, obj, $kw278$SLOT, $kw259$START_UNIVERSAL_TIME, infrnc_start_universal_time( obj ) );
    Functions.funcall( visitor_fn, obj, $kw278$SLOT, $kw260$START_INTERNAL_REAL_TIME, infrnc_start_internal_real_time( obj ) );
    Functions.funcall( visitor_fn, obj, $kw278$SLOT, $kw261$END_INTERNAL_REAL_TIME, infrnc_end_internal_real_time( obj ) );
    Functions.funcall( visitor_fn, obj, $kw278$SLOT, $kw262$PAD_INTERNAL_REAL_TIME, infrnc_pad_internal_real_time( obj ) );
    Functions.funcall( visitor_fn, obj, $kw278$SLOT, $kw263$HYPOTHESIZATION_TIME, infrnc_hypothesization_time( obj ) );
    Functions.funcall( visitor_fn, obj, $kw278$SLOT, $kw264$CUMULATIVE_TIME, infrnc_cumulative_time( obj ) );
    Functions.funcall( visitor_fn, obj, $kw278$SLOT, $kw265$STEP_COUNT, infrnc_step_count( obj ) );
    Functions.funcall( visitor_fn, obj, $kw278$SLOT, $kw266$CUMULATIVE_STEP_COUNT, infrnc_cumulative_step_count( obj ) );
    Functions.funcall( visitor_fn, obj, $kw278$SLOT, $kw267$EVENTS, infrnc_events( obj ) );
    Functions.funcall( visitor_fn, obj, $kw278$SLOT, $kw268$HALT_CONDITIONS, infrnc_halt_conditions( obj ) );
    Functions.funcall( visitor_fn, obj, $kw278$SLOT, $kw269$ACCUMULATORS, infrnc_accumulators( obj ) );
    Functions.funcall( visitor_fn, obj, $kw278$SLOT, $kw270$PROOF_WATERMARK, infrnc_proof_watermark( obj ) );
    Functions.funcall( visitor_fn, obj, $kw278$SLOT, $kw271$PROBLEM_WORKING_TIME_DATA, infrnc_problem_working_time_data( obj ) );
    Functions.funcall( visitor_fn, obj, $kw278$SLOT, $kw272$TYPE, infrnc_type( obj ) );
    Functions.funcall( visitor_fn, obj, $kw278$SLOT, $kw273$DATA, infrnc_data( obj ) );
    Functions.funcall( visitor_fn, obj, $kw278$SLOT, $kw274$PROPERTIES, infrnc_properties( obj ) );
    Functions.funcall( visitor_fn, obj, $kw279$END, $sym277$MAKE_INFERENCE, $int58$71 );
    return obj;
  }

  @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-datastructures-inference.lisp", position = 3537L)
  public static SubLObject visit_defstruct_object_inference_method(final SubLObject obj, final SubLObject visitor_fn)
  {
    return visit_defstruct_inference( obj, visitor_fn );
  }

  @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-datastructures-inference.lisp", position = 15174L)
  public static SubLObject valid_inference_p(final SubLObject v_object)
  {
    return makeBoolean( NIL != inference_p( v_object ) && NIL == inference_invalid_p( v_object ) );
  }

  @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-datastructures-inference.lisp", position = 15299L)
  public static SubLObject invalid_inference_p(final SubLObject v_object)
  {
    return makeBoolean( NIL != inference_p( v_object ) && NIL != inference_invalid_p( v_object ) );
  }

  @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-datastructures-inference.lisp", position = 15419L)
  public static SubLObject inference_invalid_p(final SubLObject inference)
  {
    return Equality.eq( $kw281$DEAD, inference_status( inference ) );
  }

  @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-datastructures-inference.lisp", position = 15557L)
  public static SubLObject print_inference(final SubLObject v_object, final SubLObject stream, final SubLObject depth)
  {
    if( NIL != inference_invalid_p( v_object ) )
    {
      PrintLow.format( stream, $str282$_Invalid_INFERENCE__s_, infrnc_suid( v_object ) );
    }
    else
    {
      PrintLow.format( stream, $str283$_INFERENCE__a__a__a__s_in__s_, new SubLObject[] { inference_datastructures_problem_store.problem_store_suid( inference_problem_store( v_object ) ), inference_suid( v_object ),
        inference_status( v_object ), inference_input_el_query( v_object ), inference_input_mt( v_object )
      } );
    }
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-datastructures-inference.lisp", position = 16017L)
  public static SubLObject sxhash_inference_method(final SubLObject v_object)
  {
    return infrnc_suid( v_object );
  }

  @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-datastructures-inference.lisp", position = 16091L)
  public static SubLObject new_inference_p(final SubLObject v_object)
  {
    return makeBoolean( NIL != inference_p( v_object ) && $kw285$NEW == inference_status( v_object ) );
  }

  @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-datastructures-inference.lisp", position = 16235L)
  public static SubLObject prepared_inference_p(final SubLObject v_object)
  {
    return makeBoolean( NIL != inference_p( v_object ) && $kw286$PREPARED == inference_status( v_object ) );
  }

  @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-datastructures-inference.lisp", position = 16368L)
  public static SubLObject ready_inference_p(final SubLObject v_object)
  {
    return makeBoolean( NIL != inference_p( v_object ) && $kw287$READY == inference_status( v_object ) );
  }

  @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-datastructures-inference.lisp", position = 16495L)
  public static SubLObject running_inference_p(final SubLObject v_object)
  {
    return makeBoolean( NIL != inference_p( v_object ) && $kw288$RUNNING == inference_status( v_object ) );
  }

  @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-datastructures-inference.lisp", position = 16626L)
  public static SubLObject suspended_inference_p(final SubLObject v_object)
  {
    return makeBoolean( NIL != inference_p( v_object ) && $kw289$SUSPENDED == inference_status( v_object ) );
  }

  @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-datastructures-inference.lisp", position = 16761L)
  public static SubLObject continuable_inference_p(final SubLObject v_object)
  {
    if( NIL != inference_p( v_object ) )
    {
      final SubLObject status = inference_status( v_object );
      if( NIL != inference_datastructures_enumerated_types.continuable_inference_status_p( status ) )
      {
        if( $kw289$SUSPENDED != status )
        {
          return T;
        }
        if( NIL != inference_continuableP( v_object ) )
        {
          final SubLObject suspend_status = inference_suspend_status( v_object );
          return inference_datastructures_enumerated_types.continuable_inference_suspend_status_p( suspend_status );
        }
      }
    }
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-datastructures-inference.lisp", position = 17171L)
  public static SubLObject exhausted_inference_p(final SubLObject v_object)
  {
    return makeBoolean( NIL != suspended_inference_p( v_object ) && NIL != inference_datastructures_enumerated_types.exhausted_inference_suspend_status_p( inference_suspend_status( v_object ) ) );
  }

  @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-datastructures-inference.lisp", position = 17354L)
  public static SubLObject do_inference_relevant_problems(final SubLObject macroform, final SubLObject environment)
  {
    SubLObject current;
    final SubLObject datum = current = macroform.rest();
    cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list290 );
    final SubLObject temp = current.rest();
    current = current.first();
    SubLObject problem_var = NIL;
    SubLObject inference = NIL;
    cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list290 );
    problem_var = current.first();
    current = current.rest();
    cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list290 );
    inference = current.first();
    current = current.rest();
    if( NIL == current )
    {
      final SubLObject body;
      current = ( body = temp );
      return ConsesLow.listS( $sym291$DO_SET, ConsesLow.list( problem_var, ConsesLow.list( $sym292$INFERENCE_RELEVANT_PROBLEMS, inference ) ), ConsesLow.append( body, NIL ) );
    }
    cdestructuring_bind.cdestructuring_bind_error( datum, $list290 );
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-datastructures-inference.lisp", position = 17542L)
  public static SubLObject do_inference_new_answer_justifications(final SubLObject macroform, final SubLObject environment)
  {
    SubLObject current;
    final SubLObject datum = current = macroform.rest();
    cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list293 );
    final SubLObject temp = current.rest();
    current = current.first();
    SubLObject just_var = NIL;
    SubLObject inference = NIL;
    cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list293 );
    just_var = current.first();
    current = current.rest();
    cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list293 );
    inference = current.first();
    current = current.rest();
    if( NIL == current )
    {
      final SubLObject body;
      current = ( body = temp );
      return ConsesLow.listS( $sym294$DO_QUEUE_ELEMENTS, ConsesLow.list( just_var, ConsesLow.list( $sym295$INFERENCE_NEW_ANSWER_JUSTIFICATIONS, inference ) ), ConsesLow.append( body, NIL ) );
    }
    cdestructuring_bind.cdestructuring_bind_error( datum, $list293 );
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-datastructures-inference.lisp", position = 17737L)
  public static SubLObject do_inference_new_answers(final SubLObject macroform, final SubLObject environment)
  {
    SubLObject current;
    final SubLObject datum = current = macroform.rest();
    cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list296 );
    final SubLObject temp = current.rest();
    current = current.first();
    SubLObject answer_var = NIL;
    SubLObject inference = NIL;
    cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list296 );
    answer_var = current.first();
    current = current.rest();
    cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list296 );
    inference = current.first();
    current = current.rest();
    if( NIL == current )
    {
      final SubLObject body;
      current = ( body = temp );
      final SubLObject start_id = $sym297$START_ID;
      final SubLObject end_id = $sym298$END_ID;
      final SubLObject id = $sym299$ID;
      final SubLObject inf = $sym300$INF;
      return ConsesLow.list( $sym301$CLET, ConsesLow.list( ConsesLow.list( inf, inference ), ConsesLow.list( start_id, ConsesLow.list( $sym302$INFERENCE_NEW_ANSWER_ID_START, inference ) ), ConsesLow.list( end_id,
          ConsesLow.list( $sym303$INFERENCE_NEXT_NEW_ANSWER_ID, inference ) ) ), ConsesLow.list( $sym304$CDO, ConsesLow.list( ConsesLow.list( id, start_id, ConsesLow.list( $sym305$1_, id ) ) ), ConsesLow.list( ConsesLow
              .list( $sym306$__, id, end_id ) ), ConsesLow.listS( $sym301$CLET, ConsesLow.list( ConsesLow.list( answer_var, ConsesLow.list( $sym307$FIND_INFERENCE_ANSWER_BY_ID, inf, id ) ) ), ConsesLow.append( body,
                  NIL ) ) ) );
    }
    cdestructuring_bind.cdestructuring_bind_error( datum, $list296 );
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-datastructures-inference.lisp", position = 18159L)
  public static SubLObject do_inference_answers(final SubLObject macroform, final SubLObject environment)
  {
    SubLObject current;
    final SubLObject datum = current = macroform.rest();
    cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list308 );
    final SubLObject temp = current.rest();
    current = current.first();
    SubLObject answer_var = NIL;
    SubLObject inference = NIL;
    cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list308 );
    answer_var = current.first();
    current = current.rest();
    cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list308 );
    inference = current.first();
    current = current.rest();
    SubLObject allow_other_keys_p = NIL;
    SubLObject rest = current;
    SubLObject bad = NIL;
    SubLObject current_$1 = NIL;
    while ( NIL != rest)
    {
      cdestructuring_bind.destructuring_bind_must_consp( rest, datum, $list308 );
      current_$1 = rest.first();
      rest = rest.rest();
      cdestructuring_bind.destructuring_bind_must_consp( rest, datum, $list308 );
      if( NIL == conses_high.member( current_$1, $list309, UNPROVIDED, UNPROVIDED ) )
      {
        bad = T;
      }
      if( current_$1 == $kw310$ALLOW_OTHER_KEYS )
      {
        allow_other_keys_p = rest.first();
      }
      rest = rest.rest();
    }
    if( NIL != bad && NIL == allow_other_keys_p )
    {
      cdestructuring_bind.cdestructuring_bind_error( datum, $list308 );
    }
    final SubLObject ordered_tail = cdestructuring_bind.property_list_member( $kw311$ORDERED, current );
    final SubLObject ordered = ( NIL != ordered_tail ) ? conses_high.cadr( ordered_tail ) : NIL;
    final SubLObject body;
    current = ( body = temp );
    final SubLObject id = $sym312$ID;
    return ConsesLow.listS( $sym313$DO_ID_INDEX, ConsesLow.list( id, answer_var, ConsesLow.list( $sym314$INFERENCE_ANSWER_ID_INDEX, inference ), $kw311$ORDERED, ordered ), ConsesLow.list( $sym315$IGNORE, id ), ConsesLow
        .append( body, NIL ) );
  }

  @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-datastructures-inference.lisp", position = 18405L)
  public static SubLObject do_inference_answers_from_index(final SubLObject macroform, final SubLObject environment)
  {
    SubLObject current;
    final SubLObject datum = current = macroform.rest();
    cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list316 );
    final SubLObject temp = current.rest();
    current = current.first();
    SubLObject answer_var = NIL;
    SubLObject inference = NIL;
    SubLObject start_index = NIL;
    cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list316 );
    answer_var = current.first();
    current = current.rest();
    cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list316 );
    inference = current.first();
    current = current.rest();
    cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list316 );
    start_index = current.first();
    current = current.rest();
    if( NIL == current )
    {
      final SubLObject body;
      current = ( body = temp );
      final SubLObject start_id = $sym317$START_ID;
      final SubLObject end_id = $sym318$END_ID;
      final SubLObject id = $sym319$ID;
      final SubLObject inf = $sym320$INF;
      return ConsesLow.list( $sym301$CLET, ConsesLow.list( ConsesLow.list( inf, inference ), ConsesLow.list( start_id, start_index ), ConsesLow.list( end_id, ConsesLow.list( $sym303$INFERENCE_NEXT_NEW_ANSWER_ID,
          inference ) ) ), ConsesLow.list( $sym304$CDO, ConsesLow.list( ConsesLow.list( id, start_id, ConsesLow.list( $sym305$1_, id ) ) ), ConsesLow.list( ConsesLow.list( $sym306$__, id, end_id ) ), ConsesLow.listS(
              $sym301$CLET, ConsesLow.list( ConsesLow.list( answer_var, ConsesLow.list( $sym307$FIND_INFERENCE_ANSWER_BY_ID, inf, id ) ) ), ConsesLow.append( body, NIL ) ) ), ConsesLow.list( $sym321$CSETQ, start_index,
                  end_id ) );
    }
    cdestructuring_bind.cdestructuring_bind_error( datum, $list316 );
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-datastructures-inference.lisp", position = 19129L)
  public static SubLObject do_inference_justifications(final SubLObject macroform, final SubLObject environment)
  {
    SubLObject current;
    final SubLObject datum = current = macroform.rest();
    cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list293 );
    final SubLObject temp = current.rest();
    current = current.first();
    SubLObject just_var = NIL;
    SubLObject inference = NIL;
    cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list293 );
    just_var = current.first();
    current = current.rest();
    cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list293 );
    inference = current.first();
    current = current.rest();
    if( NIL == current )
    {
      final SubLObject body;
      current = ( body = temp );
      final SubLObject v_answer = $sym322$ANSWER;
      return ConsesLow.list( $sym323$DO_INFERENCE_ANSWERS, ConsesLow.list( v_answer, inference ), ConsesLow.listS( $sym324$DO_INFERENCE_ANSWER_JUSTIFICATIONS, ConsesLow.list( just_var, v_answer ), ConsesLow.append( body,
          NIL ) ) );
    }
    cdestructuring_bind.cdestructuring_bind_error( datum, $list293 );
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-datastructures-inference.lisp", position = 19373L)
  public static SubLObject do_inference_interrupting_processes(final SubLObject macroform, final SubLObject environment)
  {
    SubLObject current;
    final SubLObject datum = current = macroform.rest();
    cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list325 );
    final SubLObject temp = current.rest();
    current = current.first();
    SubLObject process_var = NIL;
    SubLObject inference = NIL;
    cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list325 );
    process_var = current.first();
    current = current.rest();
    cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list325 );
    inference = current.first();
    current = current.rest();
    if( NIL == current )
    {
      final SubLObject body;
      current = ( body = temp );
      return ConsesLow.listS( $sym326$DO_QUEUE_DEQUEUE, ConsesLow.list( process_var, ConsesLow.list( $sym327$INFERENCE_INTERRUPTING_PROCESSES, inference ) ), ConsesLow.append( body, NIL ) );
    }
    cdestructuring_bind.cdestructuring_bind_error( datum, $list325 );
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-datastructures-inference.lisp", position = 19565L)
  public static SubLObject do_inference_root_proofs(final SubLObject macroform, final SubLObject environment)
  {
    SubLObject current;
    final SubLObject datum = current = macroform.rest();
    cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list328 );
    final SubLObject temp = current.rest();
    current = current.first();
    SubLObject proof_var = NIL;
    SubLObject inference = NIL;
    cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list328 );
    proof_var = current.first();
    current = current.rest();
    cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list328 );
    inference = current.first();
    current = current.rest();
    SubLObject allow_other_keys_p = NIL;
    SubLObject rest = current;
    SubLObject bad = NIL;
    SubLObject current_$2 = NIL;
    while ( NIL != rest)
    {
      cdestructuring_bind.destructuring_bind_must_consp( rest, datum, $list328 );
      current_$2 = rest.first();
      rest = rest.rest();
      cdestructuring_bind.destructuring_bind_must_consp( rest, datum, $list328 );
      if( NIL == conses_high.member( current_$2, $list329, UNPROVIDED, UNPROVIDED ) )
      {
        bad = T;
      }
      if( current_$2 == $kw310$ALLOW_OTHER_KEYS )
      {
        allow_other_keys_p = rest.first();
      }
      rest = rest.rest();
    }
    if( NIL != bad && NIL == allow_other_keys_p )
    {
      cdestructuring_bind.cdestructuring_bind_error( datum, $list328 );
    }
    final SubLObject proof_status_tail = cdestructuring_bind.property_list_member( $kw330$PROOF_STATUS, current );
    final SubLObject proof_status = ( NIL != proof_status_tail ) ? conses_high.cadr( proof_status_tail ) : NIL;
    final SubLObject body;
    current = ( body = temp );
    final SubLObject root_problem = $sym331$ROOT_PROBLEM;
    return ConsesLow.list( $sym301$CLET, ConsesLow.list( ConsesLow.list( root_problem, ConsesLow.list( $sym332$INFERENCE_ROOT_PROBLEM, inference ) ) ), ConsesLow.list( $sym333$PWHEN, root_problem, ConsesLow.listS(
        $sym334$DO_PROBLEM_PROOFS, ConsesLow.list( proof_var, root_problem, $kw330$PROOF_STATUS, proof_status ), ConsesLow.append( body, NIL ) ) ) );
  }

  @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-datastructures-inference.lisp", position = 19889L)
  public static SubLObject do_inference_allowed_rules(final SubLObject macroform, final SubLObject environment)
  {
    SubLObject current;
    final SubLObject datum = current = macroform.rest();
    cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list335 );
    final SubLObject temp = current.rest();
    current = current.first();
    SubLObject rule_var = NIL;
    SubLObject inference = NIL;
    cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list335 );
    rule_var = current.first();
    current = current.rest();
    cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list335 );
    inference = current.first();
    current = current.rest();
    SubLObject allow_other_keys_p = NIL;
    SubLObject rest = current;
    SubLObject bad = NIL;
    SubLObject current_$3 = NIL;
    while ( NIL != rest)
    {
      cdestructuring_bind.destructuring_bind_must_consp( rest, datum, $list335 );
      current_$3 = rest.first();
      rest = rest.rest();
      cdestructuring_bind.destructuring_bind_must_consp( rest, datum, $list335 );
      if( NIL == conses_high.member( current_$3, $list336, UNPROVIDED, UNPROVIDED ) )
      {
        bad = T;
      }
      if( current_$3 == $kw310$ALLOW_OTHER_KEYS )
      {
        allow_other_keys_p = rest.first();
      }
      rest = rest.rest();
    }
    if( NIL != bad && NIL == allow_other_keys_p )
    {
      cdestructuring_bind.cdestructuring_bind_error( datum, $list335 );
    }
    final SubLObject done_tail = cdestructuring_bind.property_list_member( $kw337$DONE, current );
    final SubLObject done = ( NIL != done_tail ) ? conses_high.cadr( done_tail ) : NIL;
    final SubLObject body;
    current = ( body = temp );
    return ConsesLow.listS( $sym291$DO_SET, ConsesLow.list( rule_var, ConsesLow.list( $sym338$INFERENCE_ALLOWED_RULES, inference ), $kw337$DONE, done ), ConsesLow.append( body, NIL ) );
  }

  @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-datastructures-inference.lisp", position = 20071L)
  public static SubLObject with_inference_problem_working_time_lock(final SubLObject macroform, final SubLObject environment)
  {
    SubLObject current;
    final SubLObject datum = current = macroform.rest();
    cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list339 );
    final SubLObject temp = current.rest();
    current = current.first();
    SubLObject inference = NIL;
    cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list339 );
    inference = current.first();
    current = current.rest();
    if( NIL == current )
    {
      final SubLObject body;
      current = ( body = temp );
      return ConsesLow.listS( $sym340$WITH_LOCK_HELD, ConsesLow.list( ConsesLow.list( $sym341$INFERENCE_PROBLEM_WORKING_TIME_LOCK, inference ) ), ConsesLow.append( body, NIL ) );
    }
    cdestructuring_bind.cdestructuring_bind_error( datum, $list339 );
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-datastructures-inference.lisp", position = 20246L)
  public static SubLObject new_inference(final SubLObject store)
  {
    assert NIL != inference_datastructures_problem_store.problem_store_p( store ) : store;
    final SubLObject inf = make_inference( UNPROVIDED );
    final SubLObject suid = inference_datastructures_problem_store.problem_store_new_inference_id( store );
    inference_metrics.increment_inference_historical_count();
    _csetf_infrnc_suid( inf, suid );
    _csetf_infrnc_problem_store( inf, store );
    _csetf_infrnc_forward_propagate( inf, NIL );
    _csetf_infrnc_hypothetical_bindings( inf, NIL );
    _csetf_infrnc_answer_id_index( inf, id_index.new_id_index( TEN_INTEGER, ZERO_INTEGER ) );
    _csetf_infrnc_answer_bindings_index( inf, dictionary.new_dictionary( Symbols.symbol_function( EQUAL ), UNPROVIDED ) );
    _csetf_infrnc_new_answer_justifications( inf, queues.create_queue( UNPROVIDED ) );
    reset_inference_new_answers( inf );
    set_inference_status( inf, $kw285$NEW );
    _csetf_infrnc_relevant_problems( inf, set.new_set( Symbols.symbol_function( EQ ), UNPROVIDED ) );
    _csetf_infrnc_strategy_set( inf, set.new_set( Symbols.symbol_function( EQ ), UNPROVIDED ) );
    clear_inference_control_process( inf );
    _csetf_infrnc_interrupting_processes( inf, queues.create_queue( UNPROVIDED ) );
    _csetf_infrnc_max_transformation_depth_reached( inf, ZERO_INTEGER );
    set_inference_answer_language( inf, inference_datastructures_enumerated_types.$inference_default_answer_language$.getGlobalValue() );
    set_inference_disjunction_free_el_vars_policy( inf, inference_datastructures_enumerated_types.$default_inference_disjunction_free_el_vars_policy$.getGlobalValue() );
    set_inference_cache_results( inf, NIL );
    set_inference_continuable( inf, inference_datastructures_enumerated_types.$inference_default_continuableP$.getGlobalValue() );
    set_inference_browsable( inf, inference_datastructures_enumerated_types.$inference_default_browsableP$.getGlobalValue() );
    set_inference_max_number( inf, inference_datastructures_enumerated_types.$default_max_number$.getGlobalValue() );
    set_inference_max_time( inf, inference_datastructures_enumerated_types.$default_max_time$.getGlobalValue() );
    set_inference_max_step( inf, inference_datastructures_enumerated_types.$default_max_step$.getGlobalValue() );
    set_inference_mode( inf, inference_datastructures_enumerated_types.$default_inference_mode$.getGlobalValue() );
    set_inference_forward_max_time( inf, inference_datastructures_enumerated_types.$default_forward_max_time$.getGlobalValue() );
    set_inference_hypothesization_time( inf, ZERO_INTEGER );
    set_inference_cumulative_time( inf, ZERO_INTEGER );
    set_inference_step_count( inf, ZERO_INTEGER );
    set_inference_cumulative_step_count( inf, ZERO_INTEGER );
    set_inference_max_proof_depth( inf, inference_datastructures_enumerated_types.$default_max_proof_depth$.getGlobalValue() );
    set_inference_max_transformation_depth( inf, inference_datastructures_enumerated_types.$default_max_transformation_depth$.getGlobalValue() );
    set_inference_min_rule_utility( inf, inference_datastructures_enumerated_types.$default_min_rule_utility$.getGlobalValue() );
    set_inference_probably_approximately_done( inf, inference_datastructures_enumerated_types.$default_probably_approximately_done$.getGlobalValue() );
    set_inference_metrics_template( inf, inference_datastructures_enumerated_types.$default_inference_metrics_template$.getGlobalValue() );
    _csetf_infrnc_accumulators( inf, dictionary.new_dictionary( Symbols.symbol_function( EQ ), UNPROVIDED ) );
    _csetf_infrnc_proof_watermark( inf, ZERO_INTEGER );
    clear_inference_blocking( inf );
    inference_datastructures_problem_store.add_problem_store_inference( store, inf );
    return inf;
  }

  @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-datastructures-inference.lisp", position = 23612L)
  public static SubLObject new_tautological_inference(final SubLObject store)
  {
    final SubLObject inference = new_inference( store );
    set_inference_status( inference, $kw343$TAUTOLOGY );
    return inference;
  }

  @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-datastructures-inference.lisp", position = 23780L)
  public static SubLObject destroy_all_inferences()
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    SubLObject cdolist_list_var;
    final SubLObject inferences = cdolist_list_var = all_inferences();
    SubLObject inference = NIL;
    inference = cdolist_list_var.first();
    while ( NIL != cdolist_list_var)
    {
      SubLObject ignore_errors_tag = NIL;
      try
      {
        thread.throwStack.push( $kw344$IGNORE_ERRORS_TARGET );
        final SubLObject _prev_bind_0 = Errors.$error_handler$.currentBinding( thread );
        try
        {
          Errors.$error_handler$.bind( Symbols.symbol_function( $sym345$IGNORE_ERRORS_HANDLER ), thread );
          try
          {
            destroy_inference( inference );
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
        ignore_errors_tag = Errors.handleThrowable( ccatch_env_var, $kw344$IGNORE_ERRORS_TARGET );
      }
      finally
      {
        thread.throwStack.pop();
      }
      cdolist_list_var = cdolist_list_var.rest();
      inference = cdolist_list_var.first();
    }
    return Sequences.length( inferences );
  }

  @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-datastructures-inference.lisp", position = 24033L)
  public static SubLObject destroy_inference(final SubLObject inference)
  {
    if( NIL != valid_inference_p( inference ) )
    {
      try
      {
        inference_strategist.inference_abort_if_running( inference );
      }
      finally
      {
        final SubLObject _prev_bind_0 = Dynamic.currentBinding( Threads.$is_thread_performing_cleanupP$ );
        try
        {
          Dynamic.bind( Threads.$is_thread_performing_cleanupP$, T );
          final SubLObject _values = Values.getValuesAsVector();
          note_inference_invalid( inference );
          final SubLObject set_var = inference_strategy_set( inference );
          final SubLObject set_contents_var = set.do_set_internal( set_var );
          SubLObject basis_object;
          SubLObject state;
          SubLObject strategy;
          for( basis_object = set_contents.do_set_contents_basis_object( set_contents_var ), state = NIL, state = set_contents.do_set_contents_initial_state( basis_object, set_contents_var ); NIL == set_contents
              .do_set_contents_doneP( basis_object, state ); state = set_contents.do_set_contents_update_state( state ) )
          {
            strategy = set_contents.do_set_contents_next( basis_object, state );
            if( NIL != set_contents.do_set_contents_element_validP( state, strategy ) )
            {
              inference_datastructures_strategy.destroy_inference_strategy( strategy );
            }
          }
          final SubLObject root_link = inference_root_link( inference );
          inference_datastructures_problem_link.destroy_problem_link( root_link );
          final SubLObject store = inference_problem_store( inference );
          inference_datastructures_problem_store.remove_problem_store_inference( store, inference );
          destroy_inference_int( inference );
          Values.restoreValuesFromVector( _values );
        }
        finally
        {
          Dynamic.rebind( Threads.$is_thread_performing_cleanupP$, _prev_bind_0 );
        }
      }
    }
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-datastructures-inference.lisp", position = 24894L)
  public static SubLObject destroy_inference_and_problem_store(final SubLObject inference)
  {
    if( NIL != inference_p( inference ) )
    {
      final SubLObject store = inference_problem_store( inference );
      destroy_inference( inference );
      inference_datastructures_problem_store.destroy_problem_store( store );
    }
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-datastructures-inference.lisp", position = 25304L)
  public static SubLObject destroy_problem_store_inference(final SubLObject inference)
  {
    if( NIL != valid_inference_p( inference ) )
    {
      inference_strategist.inference_abort_if_running( inference );
      note_inference_invalid( inference );
      return destroy_inference_int( inference );
    }
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-datastructures-inference.lisp", position = 25567L)
  public static SubLObject destroy_inference_int(final SubLObject inf)
  {
    inference_datastructures_forward_propagate.destroy_forward_propagate( infrnc_forward_propagate( inf ) );
    _csetf_infrnc_problem_store( inf, $kw346$FREE );
    _csetf_infrnc_forward_propagate( inf, $kw346$FREE );
    _csetf_infrnc_input_mt( inf, $kw346$FREE );
    _csetf_infrnc_input_el_query( inf, $kw346$FREE );
    _csetf_infrnc_input_non_explanatory_el_query( inf, $kw346$FREE );
    _csetf_infrnc_input_query_properties( inf, $kw346$FREE );
    _csetf_infrnc_mt( inf, $kw346$FREE );
    _csetf_infrnc_el_query( inf, $kw346$FREE );
    _csetf_infrnc_el_bindings( inf, $kw346$FREE );
    _csetf_infrnc_hl_query( inf, $kw346$FREE );
    _csetf_infrnc_explanatory_subquery( inf, $kw346$FREE );
    _csetf_infrnc_non_explanatory_subquery( inf, $kw346$FREE );
    _csetf_infrnc_free_hl_vars( inf, $kw346$FREE );
    _csetf_infrnc_hypothetical_bindings( inf, $kw346$FREE );
    id_index.clear_id_index( infrnc_answer_id_index( inf ) );
    _csetf_infrnc_answer_id_index( inf, $kw346$FREE );
    dictionary.clear_dictionary( infrnc_answer_bindings_index( inf ) );
    _csetf_infrnc_answer_bindings_index( inf, $kw346$FREE );
    _csetf_infrnc_new_answer_id_start( inf, $kw346$FREE );
    queues.clear_queue( infrnc_new_answer_justifications( inf ) );
    _csetf_infrnc_new_answer_justifications( inf, $kw346$FREE );
    _csetf_infrnc_suspend_status( inf, $kw346$FREE );
    _csetf_infrnc_root_link( inf, $kw346$FREE );
    clear_inference_relevant_problems( inf );
    _csetf_infrnc_relevant_problems( inf, $kw346$FREE );
    clear_inference_strategy_set( inf );
    _csetf_infrnc_strategy_set( inf, $kw346$FREE );
    clear_inference_control_process( inf );
    _csetf_infrnc_control_process( inf, $kw346$FREE );
    queues.clear_queue( infrnc_interrupting_processes( inf ) );
    _csetf_infrnc_interrupting_processes( inf, $kw346$FREE );
    _csetf_infrnc_max_transformation_depth_reached( inf, $kw346$FREE );
    clear_inference_blocking( inf );
    _csetf_infrnc_blockingP( inf, $kw346$FREE );
    _csetf_infrnc_disjunction_free_el_vars_policy( inf, $kw346$FREE );
    _csetf_infrnc_result_uniqueness_criterion( inf, $kw346$FREE );
    _csetf_infrnc_allow_hl_predicate_transformationP( inf, $kw346$FREE );
    _csetf_infrnc_allow_unbound_predicate_transformationP( inf, $kw346$FREE );
    _csetf_infrnc_allow_evaluatable_predicate_transformationP( inf, $kw346$FREE );
    _csetf_infrnc_allow_indeterminate_resultsP( inf, $kw346$FREE );
    _csetf_infrnc_allowed_rules( inf, $kw346$FREE );
    _csetf_infrnc_forbidden_rules( inf, $kw346$FREE );
    _csetf_infrnc_allowed_modules( inf, $kw346$FREE );
    _csetf_infrnc_allow_abnormality_checkingP( inf, $kw346$FREE );
    _csetf_infrnc_transitive_closure_mode( inf, $kw346$FREE );
    _csetf_infrnc_problem_store_privateP( inf, $kw346$FREE );
    _csetf_infrnc_continuableP( inf, $kw346$FREE );
    _csetf_infrnc_browsableP( inf, $kw346$FREE );
    _csetf_infrnc_return_type( inf, $kw346$FREE );
    _csetf_infrnc_answer_language( inf, $kw346$FREE );
    _csetf_infrnc_cache_resultsP( inf, $kw346$FREE );
    _csetf_infrnc_max_number( inf, $kw346$FREE );
    _csetf_infrnc_max_time( inf, $kw346$FREE );
    _csetf_infrnc_max_step( inf, $kw346$FREE );
    _csetf_infrnc_mode( inf, $kw346$FREE );
    _csetf_infrnc_forward_max_time( inf, $kw346$FREE );
    _csetf_infrnc_max_proof_depth( inf, $kw346$FREE );
    _csetf_infrnc_max_transformation_depth( inf, $kw346$FREE );
    _csetf_infrnc_min_rule_utility( inf, $kw346$FREE );
    _csetf_infrnc_probably_approximately_done( inf, $kw346$FREE );
    _csetf_infrnc_metrics_template( inf, $kw346$FREE );
    _csetf_infrnc_start_universal_time( inf, $kw346$FREE );
    _csetf_infrnc_start_internal_real_time( inf, $kw346$FREE );
    _csetf_infrnc_end_internal_real_time( inf, $kw346$FREE );
    _csetf_infrnc_pad_internal_real_time( inf, $kw346$FREE );
    _csetf_infrnc_hypothesization_time( inf, $kw346$FREE );
    _csetf_infrnc_cumulative_time( inf, $kw346$FREE );
    _csetf_infrnc_step_count( inf, $kw346$FREE );
    _csetf_infrnc_cumulative_step_count( inf, $kw346$FREE );
    _csetf_infrnc_events( inf, $kw346$FREE );
    _csetf_infrnc_halt_conditions( inf, $kw346$FREE );
    _csetf_infrnc_accumulators( inf, $kw346$FREE );
    _csetf_infrnc_proof_watermark( inf, $kw346$FREE );
    SubLObject lock = inference_problem_working_time_lock( inf );
    if( !lock.isLock() )
    {
      lock = NIL;
    }
    if( NIL != lock )
    {
      SubLObject release = NIL;
      try
      {
        release = Locks.seize_lock( lock );
        _csetf_infrnc_problem_working_time_data( inf, $kw346$FREE );
      }
      finally
      {
        if( NIL != release )
        {
          Locks.release_lock( lock );
        }
      }
    }
    else
    {
      _csetf_infrnc_problem_working_time_data( inf, $kw346$FREE );
    }
    _csetf_infrnc_type( inf, $kw346$FREE );
    _csetf_infrnc_data( inf, $kw346$FREE );
    _csetf_infrnc_properties( inf, $kw346$FREE );
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-datastructures-inference.lisp", position = 30362L)
  public static SubLObject note_inference_invalid(final SubLObject inference)
  {
    set_inference_status( inference, $kw281$DEAD );
    return inference;
  }

  @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-datastructures-inference.lisp", position = 30474L)
  public static SubLObject inference_suid(final SubLObject inference)
  {
    assert NIL != inference_p( inference ) : inference;
    return infrnc_suid( inference );
  }

  @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-datastructures-inference.lisp", position = 30602L)
  public static SubLObject inference_problem_store(final SubLObject inference)
  {
    assert NIL != inference_p( inference ) : inference;
    return infrnc_problem_store( inference );
  }

  @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-datastructures-inference.lisp", position = 30736L)
  public static SubLObject inference_forward_propagate(final SubLObject inference)
  {
    assert NIL != inference_p( inference ) : inference;
    return infrnc_forward_propagate( inference );
  }

  @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-datastructures-inference.lisp", position = 30878L)
  public static SubLObject inference_input_mt(final SubLObject inference)
  {
    assert NIL != inference_p( inference ) : inference;
    return infrnc_input_mt( inference );
  }

  @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-datastructures-inference.lisp", position = 31002L)
  public static SubLObject inference_input_el_query(final SubLObject inference)
  {
    assert NIL != inference_p( inference ) : inference;
    return infrnc_input_el_query( inference );
  }

  @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-datastructures-inference.lisp", position = 31138L)
  public static SubLObject inference_input_non_explanatory_el_query(final SubLObject inference)
  {
    assert NIL != inference_p( inference ) : inference;
    return infrnc_input_non_explanatory_el_query( inference );
  }

  @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-datastructures-inference.lisp", position = 31306L)
  public static SubLObject inference_input_query_properties(final SubLObject inference)
  {
    assert NIL != inference_p( inference ) : inference;
    return infrnc_input_query_properties( inference );
  }

  @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-datastructures-inference.lisp", position = 31531L)
  public static SubLObject inference_mt(final SubLObject inference)
  {
    assert NIL != inference_p( inference ) : inference;
    return infrnc_mt( inference );
  }

  @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-datastructures-inference.lisp", position = 31643L)
  public static SubLObject inference_el_query(final SubLObject inference)
  {
    assert NIL != inference_p( inference ) : inference;
    return infrnc_el_query( inference );
  }

  @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-datastructures-inference.lisp", position = 31767L)
  public static SubLObject inference_el_ist_query(final SubLObject inference)
  {
    assert NIL != inference_p( inference ) : inference;
    return el_utilities.make_ist_sentence( infrnc_mt( inference ), infrnc_el_query( inference ) );
  }

  @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-datastructures-inference.lisp", position = 31937L)
  public static SubLObject inference_el_bindings(final SubLObject inference)
  {
    assert NIL != inference_p( inference ) : inference;
    return infrnc_el_bindings( inference );
  }

  @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-datastructures-inference.lisp", position = 32161L)
  public static SubLObject inference_hl_query(final SubLObject inference)
  {
    assert NIL != inference_p( inference ) : inference;
    return infrnc_hl_query( inference );
  }

  @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-datastructures-inference.lisp", position = 32286L)
  public static SubLObject inference_explanatory_subquery(final SubLObject inference)
  {
    assert NIL != inference_p( inference ) : inference;
    return infrnc_explanatory_subquery( inference );
  }

  @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-datastructures-inference.lisp", position = 32434L)
  public static SubLObject inference_non_explanatory_subquery(final SubLObject inference)
  {
    assert NIL != inference_p( inference ) : inference;
    return infrnc_non_explanatory_subquery( inference );
  }

  @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-datastructures-inference.lisp", position = 32590L)
  public static SubLObject inference_free_hl_vars(final SubLObject inference)
  {
    assert NIL != inference_p( inference ) : inference;
    return infrnc_free_hl_vars( inference );
  }

  @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-datastructures-inference.lisp", position = 32722L)
  public static SubLObject inference_hypothetical_bindings(final SubLObject inference)
  {
    assert NIL != inference_p( inference ) : inference;
    return infrnc_hypothetical_bindings( inference );
  }

  @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-datastructures-inference.lisp", position = 32873L)
  public static SubLObject inference_answer_id_index(final SubLObject inference)
  {
    assert NIL != inference_p( inference ) : inference;
    return infrnc_answer_id_index( inference );
  }

  @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-datastructures-inference.lisp", position = 33046L)
  public static SubLObject inference_answer_bindings_index(final SubLObject inference)
  {
    assert NIL != inference_p( inference ) : inference;
    return infrnc_answer_bindings_index( inference );
  }

  @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-datastructures-inference.lisp", position = 33194L)
  public static SubLObject inference_new_answer_id_start(final SubLObject inference)
  {
    assert NIL != inference_p( inference ) : inference;
    return infrnc_new_answer_id_start( inference );
  }

  @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-datastructures-inference.lisp", position = 33379L)
  public static SubLObject inference_new_answer_justifications(final SubLObject inference)
  {
    assert NIL != inference_p( inference ) : inference;
    return infrnc_new_answer_justifications( inference );
  }

  @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-datastructures-inference.lisp", position = 33590L)
  public static SubLObject inference_status(final SubLObject inference)
  {
    assert NIL != inference_p( inference ) : inference;
    return infrnc_status( inference );
  }

  @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-datastructures-inference.lisp", position = 33711L)
  public static SubLObject inference_suspend_status(final SubLObject inference)
  {
    assert NIL != inference_p( inference ) : inference;
    return infrnc_suspend_status( inference );
  }

  @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-datastructures-inference.lisp", position = 33871L)
  public static SubLObject inference_root_link(final SubLObject inference)
  {
    assert NIL != inference_p( inference ) : inference;
    return infrnc_root_link( inference );
  }

  @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-datastructures-inference.lisp", position = 34047L)
  public static SubLObject inference_relevant_problems(final SubLObject inference)
  {
    assert NIL != inference_p( inference ) : inference;
    return infrnc_relevant_problems( inference );
  }

  @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-datastructures-inference.lisp", position = 34189L)
  public static SubLObject inference_strategy_set(final SubLObject inference)
  {
    assert NIL != inference_p( inference ) : inference;
    return infrnc_strategy_set( inference );
  }

  @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-datastructures-inference.lisp", position = 34321L)
  public static SubLObject inference_control_process(final SubLObject inference)
  {
    assert NIL != inference_p( inference ) : inference;
    return infrnc_control_process( inference );
  }

  @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-datastructures-inference.lisp", position = 34459L)
  public static SubLObject inference_interrupting_processes(final SubLObject inference)
  {
    assert NIL != inference_p( inference ) : inference;
    return infrnc_interrupting_processes( inference );
  }

  @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-datastructures-inference.lisp", position = 34609L)
  public static SubLObject inference_max_transformation_depth_reached(final SubLObject inference)
  {
    assert NIL != inference_p( inference ) : inference;
    return infrnc_max_transformation_depth_reached( inference );
  }

  @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-datastructures-inference.lisp", position = 34779L)
  public static SubLObject inference_answer_language(final SubLObject inference)
  {
    assert NIL != inference_p( inference ) : inference;
    return infrnc_answer_language( inference );
  }

  @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-datastructures-inference.lisp", position = 34917L)
  public static SubLObject inference_cache_resultsP(final SubLObject inference)
  {
    assert NIL != inference_p( inference ) : inference;
    return infrnc_cache_resultsP( inference );
  }

  @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-datastructures-inference.lisp", position = 35053L)
  public static SubLObject inference_blockingP(final SubLObject inference)
  {
    assert NIL != inference_p( inference ) : inference;
    return infrnc_blockingP( inference );
  }

  @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-datastructures-inference.lisp", position = 35179L)
  public static SubLObject inference_disjunction_free_el_vars_policy(final SubLObject inference)
  {
    assert NIL != inference_p( inference ) : inference;
    return infrnc_disjunction_free_el_vars_policy( inference );
  }

  @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-datastructures-inference.lisp", position = 35349L)
  public static SubLObject inference_result_uniqueness_criterion(final SubLObject inference)
  {
    assert NIL != inference_p( inference ) : inference;
    return infrnc_result_uniqueness_criterion( inference );
  }

  @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-datastructures-inference.lisp", position = 35511L)
  public static SubLObject inference_allow_hl_predicate_transformationP(final SubLObject inference)
  {
    assert NIL != inference_p( inference ) : inference;
    return infrnc_allow_hl_predicate_transformationP( inference );
  }

  @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-datastructures-inference.lisp", position = 35687L)
  public static SubLObject inference_allow_unbound_predicate_transformationP(final SubLObject inference)
  {
    assert NIL != inference_p( inference ) : inference;
    return infrnc_allow_unbound_predicate_transformationP( inference );
  }

  @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-datastructures-inference.lisp", position = 35873L)
  public static SubLObject inference_allow_evaluatable_predicate_transformationP(final SubLObject inference)
  {
    assert NIL != inference_p( inference ) : inference;
    return infrnc_allow_evaluatable_predicate_transformationP( inference );
  }

  @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-datastructures-inference.lisp", position = 36067L)
  public static SubLObject inference_allow_indeterminate_resultsP(final SubLObject inference)
  {
    assert NIL != inference_p( inference ) : inference;
    return infrnc_allow_indeterminate_resultsP( inference );
  }

  @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-datastructures-inference.lisp", position = 36231L)
  public static SubLObject inference_allowed_rules(final SubLObject inference)
  {
    assert NIL != inference_p( inference ) : inference;
    return infrnc_allowed_rules( inference );
  }

  @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-datastructures-inference.lisp", position = 36365L)
  public static SubLObject inference_forbidden_rules(final SubLObject inference)
  {
    assert NIL != inference_p( inference ) : inference;
    return infrnc_forbidden_rules( inference );
  }

  @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-datastructures-inference.lisp", position = 36503L)
  public static SubLObject inference_allowed_modules(final SubLObject inference)
  {
    assert NIL != inference_p( inference ) : inference;
    return infrnc_allowed_modules( inference );
  }

  @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-datastructures-inference.lisp", position = 36641L)
  public static SubLObject inference_allow_abnormality_checkingP(final SubLObject inference)
  {
    assert NIL != inference_p( inference ) : inference;
    return infrnc_allow_abnormality_checkingP( inference );
  }

  @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-datastructures-inference.lisp", position = 36803L)
  public static SubLObject inference_transitive_closure_mode(final SubLObject inference)
  {
    assert NIL != inference_p( inference ) : inference;
    return infrnc_transitive_closure_mode( inference );
  }

  @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-datastructures-inference.lisp", position = 36957L)
  public static SubLObject inference_problem_store_privateP(final SubLObject inference)
  {
    assert NIL != inference_p( inference ) : inference;
    return infrnc_problem_store_privateP( inference );
  }

  @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-datastructures-inference.lisp", position = 37109L)
  public static SubLObject inference_continuableP(final SubLObject inference)
  {
    assert NIL != inference_p( inference ) : inference;
    return infrnc_continuableP( inference );
  }

  @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-datastructures-inference.lisp", position = 37314L)
  public static SubLObject inference_browsableP(final SubLObject inference)
  {
    assert NIL != inference_p( inference ) : inference;
    return infrnc_browsableP( inference );
  }

  @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-datastructures-inference.lisp", position = 37513L)
  public static SubLObject inference_return_type(final SubLObject inference)
  {
    assert NIL != inference_p( inference ) : inference;
    return infrnc_return_type( inference );
  }

  @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-datastructures-inference.lisp", position = 37728L)
  public static SubLObject inference_max_time(final SubLObject inference)
  {
    assert NIL != inference_p( inference ) : inference;
    return infrnc_max_time( inference );
  }

  @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-datastructures-inference.lisp", position = 37929L)
  public static SubLObject inference_max_step(final SubLObject inference)
  {
    assert NIL != inference_p( inference ) : inference;
    return infrnc_max_step( inference );
  }

  @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-datastructures-inference.lisp", position = 38136L)
  public static SubLObject inference_mode(final SubLObject inference)
  {
    assert NIL != inference_p( inference ) : inference;
    return infrnc_mode( inference );
  }

  @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-datastructures-inference.lisp", position = 38281L)
  public static SubLObject inference_forward_max_time(final SubLObject inference)
  {
    assert NIL != inference_p( inference ) : inference;
    return infrnc_forward_max_time( inference );
  }

  @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-datastructures-inference.lisp", position = 38498L)
  public static SubLObject inference_max_number(final SubLObject inference)
  {
    assert NIL != inference_p( inference ) : inference;
    return infrnc_max_number( inference );
  }

  @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-datastructures-inference.lisp", position = 38710L)
  public static SubLObject inference_max_proof_depth(final SubLObject inference)
  {
    assert NIL != inference_p( inference ) : inference;
    return infrnc_max_proof_depth( inference );
  }

  @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-datastructures-inference.lisp", position = 38940L)
  public static SubLObject inference_max_transformation_depth(final SubLObject inference)
  {
    assert NIL != inference_p( inference ) : inference;
    return infrnc_max_transformation_depth( inference );
  }

  @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-datastructures-inference.lisp", position = 39096L)
  public static SubLObject inference_min_rule_utility(final SubLObject inference)
  {
    assert NIL != inference_p( inference ) : inference;
    return infrnc_min_rule_utility( inference );
  }

  @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-datastructures-inference.lisp", position = 39236L)
  public static SubLObject inference_probably_approximately_done(final SubLObject inference)
  {
    assert NIL != inference_p( inference ) : inference;
    return infrnc_probably_approximately_done( inference );
  }

  @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-datastructures-inference.lisp", position = 39483L)
  public static SubLObject inference_metrics_template(final SubLObject inference)
  {
    assert NIL != inference_p( inference ) : inference;
    return infrnc_metrics_template( inference );
  }

  @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-datastructures-inference.lisp", position = 39623L)
  public static SubLObject inference_start_universal_time(final SubLObject inference)
  {
    assert NIL != inference_p( inference ) : inference;
    return infrnc_start_universal_time( inference );
  }

  @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-datastructures-inference.lisp", position = 39771L)
  public static SubLObject inference_start_internal_real_time(final SubLObject inference)
  {
    assert NIL != inference_p( inference ) : inference;
    return infrnc_start_internal_real_time( inference );
  }

  @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-datastructures-inference.lisp", position = 39925L)
  public static SubLObject inference_end_internal_real_time(final SubLObject inference)
  {
    assert NIL != inference_p( inference ) : inference;
    return infrnc_end_internal_real_time( inference );
  }

  @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-datastructures-inference.lisp", position = 40077L)
  public static SubLObject inference_pad_internal_real_time(final SubLObject inference)
  {
    assert NIL != inference_p( inference ) : inference;
    return infrnc_pad_internal_real_time( inference );
  }

  @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-datastructures-inference.lisp", position = 40229L)
  public static SubLObject inference_hypothesization_time(final SubLObject inference)
  {
    assert NIL != inference_p( inference ) : inference;
    return infrnc_hypothesization_time( inference );
  }

  @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-datastructures-inference.lisp", position = 40689L)
  public static SubLObject inference_cumulative_time(final SubLObject inference)
  {
    assert NIL != inference_p( inference ) : inference;
    return infrnc_cumulative_time( inference );
  }

  @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-datastructures-inference.lisp", position = 41024L)
  public static SubLObject inference_step_count(final SubLObject inference)
  {
    assert NIL != inference_p( inference ) : inference;
    return infrnc_step_count( inference );
  }

  @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-datastructures-inference.lisp", position = 41242L)
  public static SubLObject inference_cumulative_step_count(final SubLObject inference)
  {
    assert NIL != inference_p( inference ) : inference;
    return infrnc_cumulative_step_count( inference );
  }

  @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-datastructures-inference.lisp", position = 41493L)
  public static SubLObject inference_problem_working_time_data(final SubLObject inference)
  {
    assert NIL != inference_p( inference ) : inference;
    return infrnc_problem_working_time_data( inference );
  }

  @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-datastructures-inference.lisp", position = 41649L)
  public static SubLObject inference_events(final SubLObject inference)
  {
    assert NIL != inference_p( inference ) : inference;
    return infrnc_events( inference );
  }

  @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-datastructures-inference.lisp", position = 41769L)
  public static SubLObject inference_accumulators(final SubLObject inference)
  {
    assert NIL != inference_p( inference ) : inference;
    return infrnc_accumulators( inference );
  }

  @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-datastructures-inference.lisp", position = 41899L)
  public static SubLObject inference_proof_watermark(final SubLObject inference)
  {
    assert NIL != inference_p( inference ) : inference;
    return infrnc_proof_watermark( inference );
  }

  @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-datastructures-inference.lisp", position = 42037L)
  public static SubLObject inference_type(final SubLObject inference)
  {
    assert NIL != inference_p( inference ) : inference;
    return infrnc_type( inference );
  }

  @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-datastructures-inference.lisp", position = 42153L)
  public static SubLObject inference_data(final SubLObject inference)
  {
    assert NIL != inference_p( inference ) : inference;
    return infrnc_data( inference );
  }

  @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-datastructures-inference.lisp", position = 42267L)
  public static SubLObject inference_properties(final SubLObject inference)
  {
    assert NIL != inference_p( inference ) : inference;
    return infrnc_properties( inference );
  }

  @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-datastructures-inference.lisp", position = 42395L)
  public static SubLObject set_inference_forward_propagate(final SubLObject inference, final SubLObject forward_propagate)
  {
    assert NIL != inference_p( inference ) : inference;
    if( NIL != forward_propagate && !assertionsDisabledInClass && NIL == inference_datastructures_forward_propagate.forward_propagate_p( forward_propagate ) )
    {
      throw new AssertionError( forward_propagate );
    }
    _csetf_infrnc_forward_propagate( inference, forward_propagate );
    return inference;
  }

  @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-datastructures-inference.lisp", position = 42673L)
  public static SubLObject set_inference_input_mt(final SubLObject inference, final SubLObject mt)
  {
    assert NIL != inference_p( inference ) : inference;
    if( NIL != mt && !assertionsDisabledInClass && NIL == hlmt.possibly_mt_p( mt ) )
    {
      throw new AssertionError( mt );
    }
    _csetf_infrnc_input_mt( inference, mt );
    return inference;
  }

  @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-datastructures-inference.lisp", position = 42870L)
  public static SubLObject set_inference_input_el_query(final SubLObject inference, final SubLObject el_query)
  {
    assert NIL != inference_p( inference ) : inference;
    if( NIL != el_query && !assertionsDisabledInClass && NIL == el_utilities.possibly_inference_sentence_p( el_query ) )
    {
      throw new AssertionError( el_query );
    }
    _csetf_infrnc_input_el_query( inference, el_query );
    return inference;
  }

  @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-datastructures-inference.lisp", position = 43113L)
  public static SubLObject set_inference_input_non_explanatory_el_query(final SubLObject inference, final SubLObject el_query)
  {
    assert NIL != inference_p( inference ) : inference;
    if( NIL != el_query && !assertionsDisabledInClass && NIL == el_utilities.possibly_inference_sentence_p( el_query ) )
    {
      throw new AssertionError( el_query );
    }
    _csetf_infrnc_input_non_explanatory_el_query( inference, el_query );
    return inference;
  }

  @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-datastructures-inference.lisp", position = 43388L)
  public static SubLObject set_inference_input_query_properties(final SubLObject inference, final SubLObject query_properties)
  {
    assert NIL != inference_p( inference ) : inference;
    if( NIL != query_properties && !assertionsDisabledInClass && NIL == inference_datastructures_enumerated_types.query_properties_p( query_properties ) )
    {
      throw new AssertionError( query_properties );
    }
    _csetf_infrnc_input_query_properties( inference, query_properties );
    return inference;
  }

  @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-datastructures-inference.lisp", position = 43660L)
  public static SubLObject set_inference_mt(final SubLObject inference, final SubLObject mt)
  {
    assert NIL != inference_p( inference ) : inference;
    if( NIL != mt && !assertionsDisabledInClass && NIL == hlmt.hlmt_p( mt ) )
    {
      throw new AssertionError( mt );
    }
    _csetf_infrnc_mt( inference, mt );
    return inference;
  }

  @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-datastructures-inference.lisp", position = 43838L)
  public static SubLObject set_inference_el_query(final SubLObject inference, final SubLObject el_query)
  {
    assert NIL != inference_p( inference ) : inference;
    if( NIL != el_query && !assertionsDisabledInClass && NIL == el_utilities.possibly_inference_sentence_p( el_query ) )
    {
      throw new AssertionError( el_query );
    }
    _csetf_infrnc_el_query( inference, el_query );
    return inference;
  }

  @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-datastructures-inference.lisp", position = 44069L)
  public static SubLObject set_inference_el_bindings(final SubLObject inference, final SubLObject el_bindings)
  {
    assert NIL != inference_p( inference ) : inference;
    assert NIL != bindings.binding_list_p( el_bindings ) : el_bindings;
    _csetf_infrnc_el_bindings( inference, el_bindings );
    return inference;
  }

  @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-datastructures-inference.lisp", position = 44289L)
  public static SubLObject set_inference_hl_query(final SubLObject inference, final SubLObject hl_query)
  {
    assert NIL != inference_p( inference ) : inference;
    assert NIL != inference_datastructures_problem_query.problem_query_p( hl_query ) : hl_query;
    _csetf_infrnc_hl_query( inference, hl_query );
    return inference;
  }

  @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-datastructures-inference.lisp", position = 44496L)
  public static SubLObject set_inference_explanatory_subquery(final SubLObject inference, final SubLObject explanatory_subquery)
  {
    assert NIL != inference_p( inference ) : inference;
    assert NIL != inference_datastructures_problem_query.explanatory_subquery_spec_p( explanatory_subquery ) : explanatory_subquery;
    _csetf_infrnc_explanatory_subquery( inference, explanatory_subquery );
    return inference;
  }

  @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-datastructures-inference.lisp", position = 44774L)
  public static SubLObject set_inference_non_explanatory_subquery(final SubLObject inference, final SubLObject non_explanatory_subquery)
  {
    assert NIL != inference_p( inference ) : inference;
    assert NIL != inference_datastructures_problem_query.non_explanatory_subquery_spec_p( non_explanatory_subquery ) : non_explanatory_subquery;
    _csetf_infrnc_non_explanatory_subquery( inference, non_explanatory_subquery );
    return inference;
  }

  @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-datastructures-inference.lisp", position = 45076L)
  public static SubLObject set_inference_free_hl_vars(final SubLObject inference, final SubLObject free_hl_vars)
  {
    assert NIL != inference_p( inference ) : inference;
    assert NIL != Types.listp( free_hl_vars ) : free_hl_vars;
    _csetf_infrnc_free_hl_vars( inference, free_hl_vars );
    return inference;
  }

  @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-datastructures-inference.lisp", position = 45292L)
  public static SubLObject set_inference_hypothetical_bindings(final SubLObject inference, final SubLObject hypothetical_bindings)
  {
    assert NIL != inference_p( inference ) : inference;
    if( NIL != hypothetical_bindings && !assertionsDisabledInClass && NIL == bindings.binding_list_p( hypothetical_bindings ) )
    {
      throw new AssertionError( hypothetical_bindings );
    }
    _csetf_infrnc_hypothetical_bindings( inference, hypothetical_bindings );
    return inference;
  }

  @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-datastructures-inference.lisp", position = 45574L)
  public static SubLObject set_inference_status(final SubLObject inference, final SubLObject status)
  {
    assert NIL != inference_p( inference ) : inference;
    assert NIL != inference_datastructures_enumerated_types.inference_status_p( status ) : status;
    _csetf_infrnc_status( inference, status );
    if( NIL == inference_datastructures_enumerated_types.inference_suspend_status_applicableP( status ) )
    {
      _csetf_infrnc_suspend_status( inference, NIL );
    }
    possibly_signal_inference_status_change( inference );
    return inference;
  }

  @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-datastructures-inference.lisp", position = 46020L)
  public static SubLObject set_inference_suspend_status(final SubLObject inference, final SubLObject suspend_status)
  {
    assert NIL != inference_p( inference ) : inference;
    assert NIL != inference_datastructures_enumerated_types.inference_suspend_status_p( suspend_status ) : suspend_status;
    _csetf_infrnc_suspend_status( inference, suspend_status );
    return inference;
  }

  @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-datastructures-inference.lisp", position = 46267L)
  public static SubLObject set_inference_root_link(final SubLObject inference, final SubLObject root_link)
  {
    assert NIL != inference_p( inference ) : inference;
    assert NIL != inference_worker_answer.answer_link_p( root_link ) : root_link;
    _csetf_infrnc_root_link( inference, root_link );
    return inference;
  }

  @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-datastructures-inference.lisp", position = 46476L)
  public static SubLObject set_inference_control_process(final SubLObject inference, final SubLObject process)
  {
    assert NIL != inference_p( inference ) : inference;
    if( NIL != process && !assertionsDisabledInClass && NIL == Types.processp( process ) )
    {
      throw new AssertionError( process );
    }
    _csetf_infrnc_control_process( inference, process );
    return inference;
  }

  @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-datastructures-inference.lisp", position = 46695L)
  public static SubLObject set_inference_max_transformation_depth_reached(final SubLObject inference, final SubLObject depth)
  {
    assert NIL != inference_p( inference ) : inference;
    assert NIL != subl_promotions.non_negative_integer_p( depth ) : depth;
    _csetf_infrnc_max_transformation_depth_reached( inference, depth );
    return inference;
  }

  @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-datastructures-inference.lisp", position = 46945L)
  public static SubLObject set_inference_disjunction_free_el_vars_policy(final SubLObject inference, final SubLObject disjunction_free_el_vars_policy)
  {
    assert NIL != inference_p( inference ) : inference;
    assert NIL != inference_datastructures_enumerated_types.inference_disjunction_free_el_vars_policy_p( disjunction_free_el_vars_policy ) : disjunction_free_el_vars_policy;
    _csetf_infrnc_disjunction_free_el_vars_policy( inference, disjunction_free_el_vars_policy );
    return inference;
  }

  @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-datastructures-inference.lisp", position = 47292L)
  public static SubLObject set_inference_result_uniqueness_criterion(final SubLObject inference, final SubLObject criterion)
  {
    assert NIL != inference_p( inference ) : inference;
    assert NIL != inference_datastructures_enumerated_types.result_uniqueness_criterion_p( criterion ) : criterion;
    _csetf_infrnc_result_uniqueness_criterion( inference, criterion );
    return inference;
  }

  @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-datastructures-inference.lisp", position = 47553L)
  public static SubLObject set_inference_allow_hl_predicate_transformation(final SubLObject inference, final SubLObject allowP)
  {
    assert NIL != inference_p( inference ) : inference;
    assert NIL != Types.booleanp( allowP ) : allowP;
    _csetf_infrnc_allow_hl_predicate_transformationP( inference, allowP );
    return inference;
  }

  @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-datastructures-inference.lisp", position = 47795L)
  public static SubLObject set_inference_allow_unbound_predicate_transformation(final SubLObject inference, final SubLObject allowP)
  {
    assert NIL != inference_p( inference ) : inference;
    assert NIL != Types.booleanp( allowP ) : allowP;
    _csetf_infrnc_allow_unbound_predicate_transformationP( inference, allowP );
    return inference;
  }

  @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-datastructures-inference.lisp", position = 48047L)
  public static SubLObject set_inference_allow_evaluatable_predicate_transformation(final SubLObject inference, final SubLObject allowP)
  {
    assert NIL != inference_p( inference ) : inference;
    assert NIL != Types.booleanp( allowP ) : allowP;
    _csetf_infrnc_allow_evaluatable_predicate_transformationP( inference, allowP );
    return inference;
  }

  @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-datastructures-inference.lisp", position = 48307L)
  public static SubLObject set_inference_allow_indeterminate_results(final SubLObject inference, final SubLObject allowP)
  {
    assert NIL != inference_p( inference ) : inference;
    assert NIL != Types.booleanp( allowP ) : allowP;
    _csetf_infrnc_allow_indeterminate_resultsP( inference, allowP );
    return inference;
  }

  @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-datastructures-inference.lisp", position = 48537L)
  public static SubLObject set_inference_allowed_rules(final SubLObject inference, final SubLObject allowed_rules)
  {
    assert NIL != inference_p( inference ) : inference;
    _csetf_infrnc_allowed_rules( inference, allowed_rules );
    return inference;
  }

  @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-datastructures-inference.lisp", position = 48848L)
  public static SubLObject set_inference_forbidden_rules(final SubLObject inference, final SubLObject forbidden_rules)
  {
    assert NIL != inference_p( inference ) : inference;
    _csetf_infrnc_forbidden_rules( inference, forbidden_rules );
    return inference;
  }

  @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-datastructures-inference.lisp", position = 49176L)
  public static SubLObject set_inference_allowed_modules(final SubLObject inference, final SubLObject allowed_modules)
  {
    assert NIL != inference_p( inference ) : inference;
    assert NIL != inference_modules.allowed_modules_spec_p( allowed_modules ) : allowed_modules;
    _csetf_infrnc_allowed_modules( inference, allowed_modules );
    return inference;
  }

  @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-datastructures-inference.lisp", position = 49422L)
  public static SubLObject set_inference_allow_abnormality_checking(final SubLObject inference, final SubLObject allowP)
  {
    assert NIL != inference_p( inference ) : inference;
    assert NIL != Types.booleanp( allowP ) : allowP;
    _csetf_infrnc_allow_abnormality_checkingP( inference, allowP );
    return inference;
  }

  @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-datastructures-inference.lisp", position = 49650L)
  public static SubLObject set_inference_transitive_closure_mode(final SubLObject inference, final SubLObject transitive_closure_mode)
  {
    assert NIL != inference_p( inference ) : inference;
    assert NIL != inference_datastructures_enumerated_types.inference_transitive_closure_mode_p( transitive_closure_mode ) : transitive_closure_mode;
    _csetf_infrnc_transitive_closure_mode( inference, transitive_closure_mode );
    return inference;
  }

  @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-datastructures-inference.lisp", position = 49949L)
  public static SubLObject set_inference_problem_store_private(final SubLObject inference, final SubLObject privateP)
  {
    assert NIL != inference_p( inference ) : inference;
    assert NIL != Types.booleanp( privateP ) : privateP;
    _csetf_infrnc_problem_store_privateP( inference, privateP );
    return inference;
  }

  @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-datastructures-inference.lisp", position = 50175L)
  public static SubLObject set_inference_continuable(final SubLObject inference, final SubLObject continuableP)
  {
    assert NIL != Types.booleanp( continuableP ) : continuableP;
    _csetf_infrnc_continuableP( inference, continuableP );
    return inference;
  }

  @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-datastructures-inference.lisp", position = 50394L)
  public static SubLObject set_inference_browsable(final SubLObject inference, final SubLObject browsableP)
  {
    assert NIL != Types.booleanp( browsableP ) : browsableP;
    _csetf_infrnc_browsableP( inference, browsableP );
    return inference;
  }

  @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-datastructures-inference.lisp", position = 50603L)
  public static SubLObject set_inference_return_type(final SubLObject inference, final SubLObject return_type)
  {
    assert NIL != inference_datastructures_enumerated_types.inference_return_type_p( return_type ) : return_type;
    _csetf_infrnc_return_type( inference, return_type );
    return inference;
  }

  @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-datastructures-inference.lisp", position = 50833L)
  public static SubLObject set_inference_answer_language(final SubLObject inference, final SubLObject answer_language)
  {
    assert NIL != inference_p( inference ) : inference;
    assert NIL != inference_datastructures_enumerated_types.inference_answer_language_p( answer_language ) : answer_language;
    _csetf_infrnc_answer_language( inference, answer_language );
    return inference;
  }

  @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-datastructures-inference.lisp", position = 51086L)
  public static SubLObject set_inference_cache_results(final SubLObject inference, final SubLObject cache_resultsP)
  {
    assert NIL != inference_p( inference ) : inference;
    assert NIL != Types.booleanp( cache_resultsP ) : cache_resultsP;
    _csetf_infrnc_cache_resultsP( inference, cache_resultsP );
    return inference;
  }

  @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-datastructures-inference.lisp", position = 51314L)
  public static SubLObject note_inference_blocking(final SubLObject inference)
  {
    assert NIL != inference_p( inference ) : inference;
    _csetf_infrnc_blockingP( inference, T );
    return inference;
  }

  @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-datastructures-inference.lisp", position = 51466L)
  public static SubLObject clear_inference_blocking(final SubLObject inference)
  {
    assert NIL != inference_p( inference ) : inference;
    _csetf_infrnc_blockingP( inference, NIL );
    return inference;
  }

  @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-datastructures-inference.lisp", position = 51621L)
  public static SubLObject set_inference_max_number(final SubLObject inference, final SubLObject max_number)
  {
    if( NIL != max_number && !assertionsDisabledInClass && NIL == subl_promotions.non_negative_integer_p( max_number ) )
    {
      throw new AssertionError( max_number );
    }
    _csetf_infrnc_max_number( inference, max_number );
    return inference;
  }

  @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-datastructures-inference.lisp", position = 51856L)
  public static SubLObject set_inference_max_time(final SubLObject inference, final SubLObject max_time)
  {
    if( NIL != max_time && !assertionsDisabledInClass && NIL == number_utilities.non_negative_number_p( max_time ) )
    {
      throw new AssertionError( max_time );
    }
    _csetf_infrnc_max_time( inference, max_time );
    return inference;
  }

  @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-datastructures-inference.lisp", position = 52080L)
  public static SubLObject set_inference_max_step(final SubLObject inference, final SubLObject max_step)
  {
    if( NIL != max_step && !assertionsDisabledInClass && NIL == subl_promotions.non_negative_integer_p( max_step ) )
    {
      throw new AssertionError( max_step );
    }
    _csetf_infrnc_max_step( inference, max_step );
    return inference;
  }

  @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-datastructures-inference.lisp", position = 52305L)
  public static SubLObject set_inference_mode(final SubLObject inference, final SubLObject mode)
  {
    assert NIL != inference_datastructures_enumerated_types.inference_mode_p( mode ) : mode;
    _csetf_infrnc_mode( inference, mode );
    return inference;
  }

  @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-datastructures-inference.lisp", position = 52493L)
  public static SubLObject set_inference_forward_max_time(final SubLObject inference, final SubLObject forward_max_time)
  {
    if( NIL != forward_max_time && !assertionsDisabledInClass && NIL == number_utilities.non_negative_number_p( forward_max_time ) )
    {
      throw new AssertionError( forward_max_time );
    }
    final SubLObject max_time = inference_max_time( inference );
    if( max_time.isInteger() && forward_max_time.isInteger() && max_time.numL( forward_max_time ) )
    {
      Errors.error( $str373$Forward_max_time__s_cannot_be_gre, forward_max_time, max_time );
    }
    _csetf_infrnc_forward_max_time( inference, forward_max_time );
    return inference;
  }

  @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-datastructures-inference.lisp", position = 53005L)
  public static SubLObject set_inference_max_proof_depth(final SubLObject inference, final SubLObject max_proof_depth)
  {
    if( NIL != max_proof_depth && !assertionsDisabledInClass && NIL == subl_promotions.non_negative_integer_p( max_proof_depth ) )
    {
      throw new AssertionError( max_proof_depth );
    }
    _csetf_infrnc_max_proof_depth( inference, max_proof_depth );
    return inference;
  }

  @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-datastructures-inference.lisp", position = 53265L)
  public static SubLObject set_inference_max_transformation_depth(final SubLObject inference, final SubLObject max_transformation_depth)
  {
    if( NIL != max_transformation_depth && !assertionsDisabledInClass && NIL == subl_promotions.non_negative_integer_p( max_transformation_depth ) )
    {
      throw new AssertionError( max_transformation_depth );
    }
    _csetf_infrnc_max_transformation_depth( inference, max_transformation_depth );
    return inference;
  }

  @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-datastructures-inference.lisp", position = 53570L)
  public static SubLObject set_inference_min_rule_utility(final SubLObject inference, final SubLObject min_rule_utility)
  {
    assert NIL != inference_analysis.rule_utility_p( min_rule_utility ) : min_rule_utility;
    _csetf_infrnc_min_rule_utility( inference, min_rule_utility );
    return inference;
  }

  @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-datastructures-inference.lisp", position = 53816L)
  public static SubLObject set_inference_probably_approximately_done(final SubLObject inference, final SubLObject probability)
  {
    assert NIL != number_utilities.probability_p( probability ) : probability;
    _csetf_infrnc_probably_approximately_done( inference, probability );
    return inference;
  }

  @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-datastructures-inference.lisp", position = 54068L)
  public static SubLObject set_inference_metrics_template(final SubLObject inference, final SubLObject metrics_template)
  {
    assert NIL != list_utilities.non_dotted_list_p( metrics_template ) : metrics_template;
    SubLObject cdolist_list_var = metrics_template;
    SubLObject elem = NIL;
    elem = cdolist_list_var.first();
    while ( NIL != cdolist_list_var)
    {
      assert NIL != inference_datastructures_enumerated_types.query_metric_p( elem ) : elem;
      cdolist_list_var = cdolist_list_var.rest();
      elem = cdolist_list_var.first();
    }
    _csetf_infrnc_metrics_template( inference, metrics_template );
    return inference;
  }

  @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-datastructures-inference.lisp", position = 54319L)
  public static SubLObject set_inference_start_universal_time(final SubLObject inference, final SubLObject universal_time)
  {
    assert NIL != inference_p( inference ) : inference;
    assert NIL != numeric_date_utilities.universal_time_p( universal_time ) : universal_time;
    _csetf_infrnc_start_universal_time( inference, universal_time );
    return inference;
  }

  @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-datastructures-inference.lisp", position = 54566L)
  public static SubLObject set_inference_start_internal_real_time(final SubLObject inference, final SubLObject internal_real_time)
  {
    assert NIL != inference_p( inference ) : inference;
    assert NIL != subl_promotions.non_negative_integer_p( internal_real_time ) : internal_real_time;
    _csetf_infrnc_start_internal_real_time( inference, internal_real_time );
    return inference;
  }

  @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-datastructures-inference.lisp", position = 54839L)
  public static SubLObject set_inference_end_internal_real_time(final SubLObject inference, final SubLObject end_internal_real_time)
  {
    assert NIL != inference_p( inference ) : inference;
    if( NIL != end_internal_real_time && !assertionsDisabledInClass && NIL == subl_promotions.non_negative_integer_p( end_internal_real_time ) )
    {
      throw new AssertionError( end_internal_real_time );
    }
    _csetf_infrnc_end_internal_real_time( inference, end_internal_real_time );
    return inference;
  }

  @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-datastructures-inference.lisp", position = 55132L)
  public static SubLObject set_inference_pad_internal_real_time(final SubLObject inference, final SubLObject pad_internal_real_time)
  {
    assert NIL != inference_p( inference ) : inference;
    if( NIL != pad_internal_real_time && !assertionsDisabledInClass && NIL == number_utilities.potentially_infinite_integer_p( pad_internal_real_time ) )
    {
      throw new AssertionError( pad_internal_real_time );
    }
    _csetf_infrnc_pad_internal_real_time( inference, pad_internal_real_time );
    return inference;
  }

  @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-datastructures-inference.lisp", position = 55432L)
  public static SubLObject set_inference_hypothesization_time(final SubLObject inference, final SubLObject hypothesization_time)
  {
    assert NIL != inference_p( inference ) : inference;
    assert NIL != Types.numberp( hypothesization_time ) : hypothesization_time;
    _csetf_infrnc_hypothesization_time( inference, hypothesization_time );
    return inference;
  }

  @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-datastructures-inference.lisp", position = 55690L)
  public static SubLObject set_inference_cumulative_time(final SubLObject inference, final SubLObject cumulative_time)
  {
    assert NIL != inference_p( inference ) : inference;
    assert NIL != Types.numberp( cumulative_time ) : cumulative_time;
    _csetf_infrnc_cumulative_time( inference, cumulative_time );
    return inference;
  }

  @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-datastructures-inference.lisp", position = 55921L)
  public static SubLObject set_inference_step_count(final SubLObject inference, final SubLObject step_count)
  {
    assert NIL != subl_promotions.non_negative_integer_p( step_count ) : step_count;
    _csetf_infrnc_step_count( inference, step_count );
    return inference;
  }

  @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-datastructures-inference.lisp", position = 56143L)
  public static SubLObject increment_inference_step_count(final SubLObject inference)
  {
    _csetf_infrnc_step_count( inference, Numbers.add( infrnc_step_count( inference ), ONE_INTEGER ) );
    return inference;
  }

  @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-datastructures-inference.lisp", position = 56301L)
  public static SubLObject set_inference_cumulative_step_count(final SubLObject inference, final SubLObject cumulative_step_count)
  {
    assert NIL != subl_promotions.non_negative_integer_p( cumulative_step_count ) : cumulative_step_count;
    _csetf_infrnc_cumulative_step_count( inference, cumulative_step_count );
    return inference;
  }

  @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-datastructures-inference.lisp", position = 56578L)
  public static SubLObject increment_inference_cumulative_step_count(final SubLObject inference)
  {
    _csetf_infrnc_cumulative_step_count( inference, Numbers.add( infrnc_cumulative_step_count( inference ), ONE_INTEGER ) );
    return inference;
  }

  @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-datastructures-inference.lisp", position = 56758L)
  public static SubLObject set_inference_problem_working_time_data(final SubLObject inference, final SubLObject data)
  {
    assert NIL != inference_p( inference ) : inference;
    assert NIL != Types.listp( data ) : data;
    _csetf_infrnc_problem_working_time_data( inference, data );
    return inference;
  }

  @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-datastructures-inference.lisp", position = 56974L)
  public static SubLObject set_inference_events(final SubLObject inference, final SubLObject event_types)
  {
    assert NIL != inference_p( inference ) : inference;
    assert NIL != list_utilities.non_dotted_list_p( event_types ) : event_types;
    SubLObject cdolist_list_var = event_types;
    SubLObject elem = NIL;
    elem = cdolist_list_var.first();
    while ( NIL != cdolist_list_var)
    {
      assert NIL != inference_datastructures_enumerated_types.inference_event_type_p( elem ) : elem;
      cdolist_list_var = cdolist_list_var.rest();
      elem = cdolist_list_var.first();
    }
    _csetf_infrnc_events( inference, event_types );
    return inference;
  }

  @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-datastructures-inference.lisp", position = 57195L)
  public static SubLObject set_inference_halt_conditions(final SubLObject inference, final SubLObject halt_conditions)
  {
    assert NIL != inference_p( inference ) : inference;
    assert NIL != list_utilities.non_dotted_list_p( halt_conditions ) : halt_conditions;
    SubLObject cdolist_list_var = halt_conditions;
    SubLObject elem = NIL;
    elem = cdolist_list_var.first();
    while ( NIL != cdolist_list_var)
    {
      assert NIL != inference_datastructures_enumerated_types.inference_halt_condition_p( elem ) : elem;
      cdolist_list_var = cdolist_list_var.rest();
      elem = cdolist_list_var.first();
    }
    _csetf_infrnc_halt_conditions( inference, halt_conditions );
    return inference;
  }

  @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-datastructures-inference.lisp", position = 57450L)
  public static SubLObject set_inference_type(final SubLObject inference, final SubLObject type)
  {
    assert NIL != inference_p( inference ) : inference;
    assert NIL != inference_type_p( type ) : type;
    _csetf_infrnc_type( inference, type );
    return inference;
  }

  @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-datastructures-inference.lisp", position = 57635L)
  public static SubLObject set_inference_data(final SubLObject inference, final SubLObject data)
  {
    assert NIL != inference_p( inference ) : inference;
    _csetf_infrnc_data( inference, data );
    return inference;
  }

  @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-datastructures-inference.lisp", position = 57783L)
  public static SubLObject set_inference_properties(final SubLObject inference, final SubLObject v_properties)
  {
    assert NIL != inference_p( inference ) : inference;
    assert NIL != list_utilities.property_list_p( v_properties ) : v_properties;
    _csetf_infrnc_properties( inference, v_properties );
    return inference;
  }

  @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-datastructures-inference.lisp", position = 57999L)
  public static SubLObject set_inference_property(final SubLObject inference, final SubLObject key, final SubLObject value)
  {
    assert NIL != inference_p( inference ) : inference;
    SubLObject v_properties = infrnc_properties( inference );
    v_properties = conses_high.putf( v_properties, key, value );
    _csetf_infrnc_properties( inference, v_properties );
    return inference;
  }

  @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-datastructures-inference.lisp", position = 58265L)
  public static SubLObject push_inference_property(final SubLObject inference, final SubLObject key, final SubLObject value)
  {
    assert NIL != inference_p( inference ) : inference;
    SubLObject v_properties = infrnc_properties( inference );
    v_properties = conses_high.putf( v_properties, key, ConsesLow.cons( value, list_utilities.plist_lookup( v_properties, key, NIL ) ) );
    _csetf_infrnc_properties( inference, v_properties );
    return inference;
  }

  @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-datastructures-inference.lisp", position = 58531L)
  public static SubLObject inference_ids(final SubLObject inference)
  {
    assert NIL != inference_p( inference ) : inference;
    return ConsesLow.list( inference_problem_store_suid( inference ), inference_suid( inference ) );
  }

  @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-datastructures-inference.lisp", position = 58731L)
  public static SubLObject with_inference_ids(final SubLObject macroform, final SubLObject environment)
  {
    SubLObject current;
    final SubLObject datum = current = macroform.rest();
    cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list385 );
    final SubLObject temp = current.rest();
    current = current.first();
    SubLObject store_id_var = NIL;
    SubLObject inference_id_var = NIL;
    SubLObject inference = NIL;
    cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list385 );
    store_id_var = current.first();
    current = current.rest();
    cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list385 );
    inference_id_var = current.first();
    current = current.rest();
    cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list385 );
    inference = current.first();
    current = current.rest();
    if( NIL == current )
    {
      final SubLObject body;
      current = ( body = temp );
      final SubLObject inference_var = $sym386$INFERENCE_VAR;
      return ConsesLow.listS( $sym301$CLET, ConsesLow.list( ConsesLow.list( inference_var, inference ), ConsesLow.list( store_id_var, ConsesLow.list( $sym387$INFERENCE_PROBLEM_STORE_SUID, inference_var ) ), ConsesLow
          .list( inference_id_var, ConsesLow.list( $sym388$INFERENCE_SUID, inference_var ) ) ), ConsesLow.append( body, NIL ) );
    }
    cdestructuring_bind.cdestructuring_bind_error( datum, $list385 );
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-datastructures-inference.lisp", position = 59116L)
  public static SubLObject inference_problem_store_suid(final SubLObject inference)
  {
    return inference_datastructures_problem_store.problem_store_suid( inference_problem_store( inference ) );
  }

  @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-datastructures-inference.lisp", position = 59242L)
  public static SubLObject all_inferences()
  {
    SubLObject inferences = NIL;
    final SubLObject idx = inference_datastructures_problem_store.problem_store_id_index();
    if( NIL == id_index.id_index_objects_empty_p( idx, $kw389$SKIP ) )
    {
      final SubLObject idx_$4 = idx;
      if( NIL == id_index.id_index_dense_objects_empty_p( idx_$4, $kw389$SKIP ) )
      {
        final SubLObject vector_var = id_index.id_index_dense_objects( idx_$4 );
        final SubLObject backwardP_var = NIL;
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
        for( length = Sequences.length( vector_var ), v_iteration = NIL, v_iteration = ZERO_INTEGER; v_iteration.numL( length ); v_iteration = Numbers.add( v_iteration, ONE_INTEGER ) )
        {
          id = ( ( NIL != backwardP_var ) ? Numbers.subtract( length, v_iteration, ONE_INTEGER ) : v_iteration );
          store = Vectors.aref( vector_var, id );
          if( NIL == id_index.id_index_tombstone_p( store ) || NIL == id_index.id_index_skip_tombstones_p( $kw389$SKIP ) )
          {
            if( NIL != id_index.id_index_tombstone_p( store ) )
            {
              store = $kw389$SKIP;
            }
            idx_$5 = inference_datastructures_problem_store.problem_store_inference_id_index( store );
            if( NIL == id_index.id_index_objects_empty_p( idx_$5, $kw389$SKIP ) )
            {
              idx_$6 = idx_$5;
              if( NIL == id_index.id_index_dense_objects_empty_p( idx_$6, $kw389$SKIP ) )
              {
                vector_var_$7 = id_index.id_index_dense_objects( idx_$6 );
                backwardP_var_$8 = NIL;
                for( length_$9 = Sequences.length( vector_var_$7 ), v_iteration_$10 = NIL, v_iteration_$10 = ZERO_INTEGER; v_iteration_$10.numL( length_$9 ); v_iteration_$10 = Numbers.add( v_iteration_$10,
                    ONE_INTEGER ) )
                {
                  id_$11 = ( ( NIL != backwardP_var_$8 ) ? Numbers.subtract( length_$9, v_iteration_$10, ONE_INTEGER ) : v_iteration_$10 );
                  inference = Vectors.aref( vector_var_$7, id_$11 );
                  if( NIL == id_index.id_index_tombstone_p( inference ) || NIL == id_index.id_index_skip_tombstones_p( $kw389$SKIP ) )
                  {
                    if( NIL != id_index.id_index_tombstone_p( inference ) )
                    {
                      inference = $kw389$SKIP;
                    }
                    inferences = ConsesLow.cons( inference, inferences );
                  }
                }
              }
              idx_$7 = idx_$5;
              if( NIL == id_index.id_index_sparse_objects_empty_p( idx_$7 ) )
              {
                cdohash_table = id_index.id_index_sparse_objects( idx_$7 );
                id_$12 = NIL;
                inference2 = NIL;
                cdohash_iterator = Hashtables.getEntrySetIterator( cdohash_table );
                try
                {
                  while ( Hashtables.iteratorHasNext( cdohash_iterator ))
                  {
                    cdohash_entry = Hashtables.iteratorNextEntry( cdohash_iterator );
                    id_$12 = Hashtables.getEntryKey( cdohash_entry );
                    inference2 = Hashtables.getEntryValue( cdohash_entry );
                    inferences = ConsesLow.cons( inference2, inferences );
                  }
                }
                finally
                {
                  Hashtables.releaseEntrySetIterator( cdohash_iterator );
                }
              }
            }
          }
        }
      }
      final SubLObject idx_$8 = idx;
      if( NIL == id_index.id_index_sparse_objects_empty_p( idx_$8 ) )
      {
        final SubLObject cdohash_table2 = id_index.id_index_sparse_objects( idx_$8 );
        SubLObject id2 = NIL;
        SubLObject store2 = NIL;
        final Iterator cdohash_iterator2 = Hashtables.getEntrySetIterator( cdohash_table2 );
        try
        {
          while ( Hashtables.iteratorHasNext( cdohash_iterator2 ))
          {
            final Map.Entry cdohash_entry2 = Hashtables.iteratorNextEntry( cdohash_iterator2 );
            id2 = Hashtables.getEntryKey( cdohash_entry2 );
            store2 = Hashtables.getEntryValue( cdohash_entry2 );
            final SubLObject idx_$9 = inference_datastructures_problem_store.problem_store_inference_id_index( store2 );
            if( NIL == id_index.id_index_objects_empty_p( idx_$9, $kw389$SKIP ) )
            {
              final SubLObject idx_$10 = idx_$9;
              if( NIL == id_index.id_index_dense_objects_empty_p( idx_$10, $kw389$SKIP ) )
              {
                final SubLObject vector_var2 = id_index.id_index_dense_objects( idx_$10 );
                final SubLObject backwardP_var2 = NIL;
                SubLObject length2;
                SubLObject v_iteration2;
                SubLObject id_$13;
                SubLObject inference3;
                for( length2 = Sequences.length( vector_var2 ), v_iteration2 = NIL, v_iteration2 = ZERO_INTEGER; v_iteration2.numL( length2 ); v_iteration2 = Numbers.add( v_iteration2, ONE_INTEGER ) )
                {
                  id_$13 = ( ( NIL != backwardP_var2 ) ? Numbers.subtract( length2, v_iteration2, ONE_INTEGER ) : v_iteration2 );
                  inference3 = Vectors.aref( vector_var2, id_$13 );
                  if( NIL == id_index.id_index_tombstone_p( inference3 ) || NIL == id_index.id_index_skip_tombstones_p( $kw389$SKIP ) )
                  {
                    if( NIL != id_index.id_index_tombstone_p( inference3 ) )
                    {
                      inference3 = $kw389$SKIP;
                    }
                    inferences = ConsesLow.cons( inference3, inferences );
                  }
                }
              }
              final SubLObject idx_$11 = idx_$9;
              if( NIL != id_index.id_index_sparse_objects_empty_p( idx_$11 ) )
              {
                continue;
              }
              final SubLObject cdohash_table_$19 = id_index.id_index_sparse_objects( idx_$11 );
              SubLObject id_$14 = NIL;
              SubLObject inference4 = NIL;
              final Iterator cdohash_iterator_$21 = Hashtables.getEntrySetIterator( cdohash_table_$19 );
              try
              {
                while ( Hashtables.iteratorHasNext( cdohash_iterator_$21 ))
                {
                  final Map.Entry cdohash_entry_$22 = Hashtables.iteratorNextEntry( cdohash_iterator_$21 );
                  id_$14 = Hashtables.getEntryKey( cdohash_entry_$22 );
                  inference4 = Hashtables.getEntryValue( cdohash_entry_$22 );
                  inferences = ConsesLow.cons( inference4, inferences );
                }
              }
              finally
              {
                Hashtables.releaseEntrySetIterator( cdohash_iterator_$21 );
              }
            }
          }
        }
        finally
        {
          Hashtables.releaseEntrySetIterator( cdohash_iterator2 );
        }
      }
    }
    return Sequences.nreverse( inferences );
  }

  @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-datastructures-inference.lisp", position = 59483L)
  public static SubLObject all_successful_inferences()
  {
    return list_utilities.delete_if_not( $sym390$SUCCESSFUL_INFERENCE_P, all_inferences(), UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED );
  }

  @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-datastructures-inference.lisp", position = 59597L)
  public static SubLObject inference_strategies(final SubLObject inference)
  {
    return set.set_element_list( inference_strategy_set( inference ) );
  }

  @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-datastructures-inference.lisp", position = 59768L)
  public static SubLObject inference_hl_mts(final SubLObject inference)
  {
    assert NIL != inference_p( inference ) : inference;
    final SubLObject hl_query = inference_hl_query( inference );
    SubLObject mts = NIL;
    SubLObject cdolist_list_var = hl_query;
    SubLObject contextualized_clause = NIL;
    contextualized_clause = cdolist_list_var.first();
    while ( NIL != cdolist_list_var)
    {
      SubLObject sense = $kw391$NEG;
      SubLObject index_var = ZERO_INTEGER;
      SubLObject cdolist_list_var_$23 = clauses.neg_lits( contextualized_clause );
      SubLObject contextualized_asent = NIL;
      contextualized_asent = cdolist_list_var_$23.first();
      while ( NIL != cdolist_list_var_$23)
      {
        SubLObject current;
        final SubLObject datum = current = contextualized_asent;
        SubLObject mt = NIL;
        SubLObject asent = NIL;
        cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list392 );
        mt = current.first();
        current = current.rest();
        cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list392 );
        asent = current.first();
        current = current.rest();
        if( NIL == current )
        {
          final SubLObject item_var = mt;
          if( NIL == conses_high.member( item_var, mts, $sym393$HLMT_EQUAL, Symbols.symbol_function( IDENTITY ) ) )
          {
            mts = ConsesLow.cons( item_var, mts );
          }
        }
        else
        {
          cdestructuring_bind.cdestructuring_bind_error( datum, $list392 );
        }
        index_var = Numbers.add( index_var, ONE_INTEGER );
        cdolist_list_var_$23 = cdolist_list_var_$23.rest();
        contextualized_asent = cdolist_list_var_$23.first();
      }
      sense = $kw394$POS;
      index_var = ZERO_INTEGER;
      SubLObject cdolist_list_var_$24 = clauses.pos_lits( contextualized_clause );
      contextualized_asent = NIL;
      contextualized_asent = cdolist_list_var_$24.first();
      while ( NIL != cdolist_list_var_$24)
      {
        SubLObject current;
        final SubLObject datum = current = contextualized_asent;
        SubLObject mt = NIL;
        SubLObject asent = NIL;
        cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list392 );
        mt = current.first();
        current = current.rest();
        cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list392 );
        asent = current.first();
        current = current.rest();
        if( NIL == current )
        {
          final SubLObject item_var = mt;
          if( NIL == conses_high.member( item_var, mts, $sym393$HLMT_EQUAL, Symbols.symbol_function( IDENTITY ) ) )
          {
            mts = ConsesLow.cons( item_var, mts );
          }
        }
        else
        {
          cdestructuring_bind.cdestructuring_bind_error( datum, $list392 );
        }
        index_var = Numbers.add( index_var, ONE_INTEGER );
        cdolist_list_var_$24 = cdolist_list_var_$24.rest();
        contextualized_asent = cdolist_list_var_$24.first();
      }
      cdolist_list_var = cdolist_list_var.rest();
      contextualized_clause = cdolist_list_var.first();
    }
    return Sequences.nreverse( mts );
  }

  @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-datastructures-inference.lisp", position = 60180L)
  public static SubLObject inference_first_hl_query_mt(final SubLObject inference)
  {
    assert NIL != inference_p( inference ) : inference;
    final SubLObject hl_query = inference_hl_query( inference );
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
    for( result = NIL, rest = NIL, rest = hl_query; NIL == result && NIL != rest; rest = rest.rest() )
    {
      contextualized_clause = rest.first();
      sense = $kw391$NEG;
      index_var = ZERO_INTEGER;
      cdolist_list_var = clauses.neg_lits( contextualized_clause );
      contextualized_asent = NIL;
      contextualized_asent = cdolist_list_var.first();
      while ( NIL != cdolist_list_var)
      {
        datum = ( current = contextualized_asent );
        hl_mt = NIL;
        asent = NIL;
        cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list395 );
        hl_mt = current.first();
        current = current.rest();
        cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list395 );
        asent = current.first();
        current = current.rest();
        if( NIL == current )
        {
          result = hl_mt;
        }
        else
        {
          cdestructuring_bind.cdestructuring_bind_error( datum, $list395 );
        }
        index_var = Numbers.add( index_var, ONE_INTEGER );
        cdolist_list_var = cdolist_list_var.rest();
        contextualized_asent = cdolist_list_var.first();
      }
      sense = $kw394$POS;
      index_var = ZERO_INTEGER;
      cdolist_list_var = clauses.pos_lits( contextualized_clause );
      contextualized_asent = NIL;
      contextualized_asent = cdolist_list_var.first();
      while ( NIL != cdolist_list_var)
      {
        datum = ( current = contextualized_asent );
        hl_mt = NIL;
        asent = NIL;
        cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list395 );
        hl_mt = current.first();
        current = current.rest();
        cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list395 );
        asent = current.first();
        current = current.rest();
        if( NIL == current )
        {
          result = hl_mt;
        }
        else
        {
          cdestructuring_bind.cdestructuring_bind_error( datum, $list395 );
        }
        index_var = Numbers.add( index_var, ONE_INTEGER );
        cdolist_list_var = cdolist_list_var.rest();
        contextualized_asent = cdolist_list_var.first();
      }
    }
    return result;
  }

  @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-datastructures-inference.lisp", position = 60595L)
  public static SubLObject inference_no_free_hl_varsP(final SubLObject inference)
  {
    return Types.sublisp_null( inference_free_hl_vars( inference ) );
  }

  @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-datastructures-inference.lisp", position = 60705L)
  public static SubLObject inference_free_el_vars(final SubLObject inference)
  {
    final SubLObject el_bindings = inference_el_bindings( inference );
    final SubLObject free_hl_vars = inference_free_hl_vars( inference );
    return bindings.apply_bindings_backwards( el_bindings, free_hl_vars );
  }

  @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-datastructures-inference.lisp", position = 60933L)
  public static SubLObject inference_input_query_property(final SubLObject inference, final SubLObject property, SubLObject v_default)
  {
    if( v_default == UNPROVIDED )
    {
      v_default = NIL;
    }
    assert NIL != inference_p( inference ) : inference;
    assert NIL != inference_datastructures_enumerated_types.query_property_p( property ) : property;
    return conses_high.getf( infrnc_input_query_properties( inference ), property, v_default );
  }

  @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-datastructures-inference.lisp", position = 61175L)
  public static SubLObject inference_to_new_cyc_query_arguments(final SubLObject inference)
  {
    assert NIL != inference_p( inference ) : inference;
    SubLObject sentence = inference_input_el_query( inference );
    if( NIL == sentence )
    {
      sentence = cycl_utilities.hl_to_el( inference_czer.contextualized_dnf_clauses_formula( inference_hl_query( inference ), UNPROVIDED ) );
    }
    return Values.values( sentence, inference_input_mt( inference ), inference_datastructures_enumerated_types.inference_input_non_default_query_properties( inference ) );
  }

  @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-datastructures-inference.lisp", position = 61749L)
  public static SubLObject inference_to_new_cyc_query_form(final SubLObject inference)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    thread.resetMultipleValues();
    final SubLObject sentence = inference_to_new_cyc_query_arguments( inference );
    final SubLObject mt = thread.secondMultipleValue();
    final SubLObject query_properties = thread.thirdMultipleValue();
    thread.resetMultipleValues();
    return ConsesLow.listS( $sym397$NEW_CYC_QUERY, list_utilities.quotify( sentence ), ConsesLow.append( ( NIL != mt || NIL != query_properties ) ? ConsesLow.list( list_utilities.quotify( mt ) ) : NIL,
        ( NIL != query_properties ) ? ConsesLow.list( list_utilities.quotify( query_properties ) ) : NIL, NIL ) );
  }

  @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-datastructures-inference.lisp", position = 62201L)
  public static SubLObject inference_to_new_cyc_query_form_string(final SubLObject inference)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    thread.resetMultipleValues();
    SubLObject sentence = inference_to_new_cyc_query_arguments( inference );
    SubLObject mt = thread.secondMultipleValue();
    final SubLObject query_properties = thread.thirdMultipleValue();
    thread.resetMultipleValues();
    sentence = cycl_utilities.hl_to_el( sentence );
    mt = cycl_utilities.hl_to_el( mt );
    return inference_args_to_new_cyc_query_form_string( sentence, mt, query_properties );
  }

  @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-datastructures-inference.lisp", position = 62675L)
  public static SubLObject inference_args_to_new_cyc_query_form_string(final SubLObject sentence, final SubLObject mt, final SubLObject query_properties)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    SubLObject result = NIL;
    SubLObject stream = NIL;
    try
    {
      stream = streams_high.make_private_string_output_stream();
      final SubLObject sentence_string = format_cycl_expression.format_cycl_expression_to_string( sentence, ONE_INTEGER );
      Strings.set_char( sentence_string, TWO_INTEGER, Characters.CHAR_quote );
      PrintLow.format( stream, $str398$_new_cyc_query_A, sentence_string );
      if( NIL != mt || NIL != query_properties )
      {
        final SubLObject mt_string = format_cycl_expression.format_cycl_expression_to_string( mt, ONE_INTEGER );
        if( mt.isAtom() )
        {
          PrintLow.format( stream, $str399$_____A, mt_string );
        }
        else
        {
          Strings.set_char( mt_string, TWO_INTEGER, Characters.CHAR_quote );
          PrintLow.format( stream, $str400$_A, mt_string );
        }
      }
      if( NIL != query_properties )
      {
        PrintLow.format( stream, $str401$_____list______ );
        final SubLObject _prev_bind_0 = print_high.$print_case$.currentBinding( thread );
        try
        {
          print_high.$print_case$.bind( $kw402$DOWNCASE, thread );
          SubLObject remainder;
          SubLObject property;
          SubLObject value;
          SubLObject cdolist_list_var;
          SubLObject one_value;
          for( remainder = NIL, remainder = query_properties; NIL != remainder; remainder = conses_high.cddr( remainder ) )
          {
            property = remainder.first();
            value = conses_high.cadr( remainder );
            if( property == $kw205$PROBLEM_STORE )
            {
              PrintLow.format( stream, $str403$_S__find_problem_store_by_id__S__, property, inference_datastructures_problem_store.problem_store_suid( value ) );
            }
            else if( ( property == $kw237$ALLOWED_RULES || property == $kw238$FORBIDDEN_RULES ) && value != $kw404$ALL )
            {
              PrintLow.format( stream, $str405$_S__list, property );
              cdolist_list_var = value;
              one_value = NIL;
              one_value = cdolist_list_var.first();
              while ( NIL != cdolist_list_var)
              {
                PrintLow.format( stream, $str406$_________find_object_by_hl_extern, kb_utilities.hl_external_id_string( one_value ) );
                cdolist_list_var = cdolist_list_var.rest();
                one_value = cdolist_list_var.first();
              }
              PrintLow.format( stream, $str407$_______ );
            }
            else if( NIL != list_utilities.self_evaluating_form_p( value ) )
            {
              PrintLow.format( stream, $str408$_S__S______, property, value );
            }
            else
            {
              PrintLow.format( stream, $str408$_S__S______, property, list_utilities.quotify( value ) );
            }
          }
        }
        finally
        {
          print_high.$print_case$.rebind( _prev_bind_0, thread );
        }
        PrintLow.format( stream, $str409$_ );
      }
      PrintLow.format( stream, $str409$_ );
      result = streams_high.get_output_stream_string( stream );
    }
    finally
    {
      final SubLObject _prev_bind_2 = Threads.$is_thread_performing_cleanupP$.currentBinding( thread );
      try
      {
        Threads.$is_thread_performing_cleanupP$.bind( T, thread );
        final SubLObject _values = Values.getValuesAsVector();
        streams_high.close( stream, UNPROVIDED );
        Values.restoreValuesFromVector( _values );
      }
      finally
      {
        Threads.$is_thread_performing_cleanupP$.rebind( _prev_bind_2, thread );
      }
    }
    return result;
  }

  @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-datastructures-inference.lisp", position = 64240L)
  public static SubLObject inference_root_mapped_problem(final SubLObject inference)
  {
    final SubLObject root_link = inference_root_link( inference );
    if( NIL != root_link )
    {
      return inference_worker_answer.answer_link_supporting_mapped_problem( root_link );
    }
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-datastructures-inference.lisp", position = 64441L)
  public static SubLObject inference_root_problem(final SubLObject inference)
  {
    final SubLObject root_mapped_problem = inference_root_mapped_problem( inference );
    if( NIL != root_mapped_problem )
    {
      return inference_datastructures_problem_link.mapped_problem_problem( root_mapped_problem );
    }
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-datastructures-inference.lisp", position = 64660L)
  public static SubLObject inference_unique_wrt_proofsP(final SubLObject inference)
  {
    return Equality.eq( $kw410$PROOF, inference_result_uniqueness_criterion( inference ) );
  }

  @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-datastructures-inference.lisp", position = 64791L)
  public static SubLObject inference_unique_wrt_bindingsP(final SubLObject inference)
  {
    return Equality.eq( $kw411$BINDINGS, inference_result_uniqueness_criterion( inference ) );
  }

  @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-datastructures-inference.lisp", position = 64927L)
  public static SubLObject inference_compute_answer_justificationsP(final SubLObject inference)
  {
    return inference_datastructures_problem_store.problem_store_compute_answer_justificationsP( inference_problem_store( inference ) );
  }

  @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-datastructures-inference.lisp", position = 65091L)
  public static SubLObject inference_computes_metricsP(final SubLObject inference)
  {
    return list_utilities.sublisp_boolean( inference_metrics_template( inference ) );
  }

  @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-datastructures-inference.lisp", position = 65208L)
  public static SubLObject inference_computes_metricP(final SubLObject inference, final SubLObject metric)
  {
    return list_utilities.member_eqP( metric, inference_metrics_template( inference ) );
  }

  @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-datastructures-inference.lisp", position = 65341L)
  public static SubLObject inference_problem_store_private_wrt_dynamic_propertiesP(final SubLObject inference)
  {
    return makeBoolean( NIL != inference_problem_store_privateP( inference ) && NIL == inference_continuableP( inference ) );
  }

  @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-datastructures-inference.lisp", position = 65671L)
  public static SubLObject inference_dynamic_properties_exhaustiveP(final SubLObject inference)
  {
    return makeBoolean( NIL == inference_max_time( inference ) && NIL == inference_max_step( inference ) && NIL == inference_max_number( inference ) && ( NIL == simplest_inference_p( inference )
        || NIL == inference_datastructures_strategy.strategy_unique_wrt_bindingsP( simplest_inference_strategy( inference ) ) || NIL == inference_no_free_hl_varsP( inference ) ) );
  }

  @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-datastructures-inference.lisp", position = 66246L)
  public static SubLObject inference_allows_use_of_all_rulesP(final SubLObject inference)
  {
    return makeBoolean( $kw404$ALL == inference_allowed_rules( inference ) && $kw412$NONE == inference_forbidden_rules( inference ) );
  }

  @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-datastructures-inference.lisp", position = 66430L)
  public static SubLObject inference_allows_use_of_ruleP(final SubLObject inference, final SubLObject rule)
  {
    if( NIL != inference_allows_use_of_all_rulesP( inference ) )
    {
      return T;
    }
    if( $kw412$NONE == inference_forbidden_rules( inference ) )
    {
      return set.set_memberP( rule, inference_allowed_rules( inference ) );
    }
    if( $kw404$ALL == inference_allowed_rules( inference ) )
    {
      return makeBoolean( NIL == set.set_memberP( rule, inference_forbidden_rules( inference ) ) );
    }
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-datastructures-inference.lisp", position = 66815L)
  public static SubLObject inference_filter_rules(final SubLObject inference, final SubLObject rules)
  {
    if( NIL != inference_allows_use_of_all_rulesP( inference ) )
    {
      return rules;
    }
    final SubLObject inference_allowed_rules_list = inference_allowed_rules_list( inference );
    final SubLObject inference_forbidden_rules_list = inference_forbidden_rules_list( inference );
    SubLObject filtered_rules = NIL;
    if( $kw412$NONE == inference_forbidden_rules_list )
    {
      filtered_rules = keyhash_utilities.fast_intersection( rules, inference_allowed_rules_list, UNPROVIDED, UNPROVIDED, UNPROVIDED );
    }
    else if( $kw404$ALL == inference_allowed_rules_list )
    {
      filtered_rules = list_utilities.fast_set_difference( rules, inference_forbidden_rules_list, UNPROVIDED );
    }
    else
    {
      filtered_rules = keyhash_utilities.fast_intersection( rules, inference_allowed_rules_list, UNPROVIDED, UNPROVIDED, UNPROVIDED );
      filtered_rules = list_utilities.fast_set_difference( filtered_rules, inference_forbidden_rules_list, UNPROVIDED );
    }
    return filtered_rules;
  }

  @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-datastructures-inference.lisp", position = 67777L)
  public static SubLObject inference_allows_use_of_all_modulesP(final SubLObject inference)
  {
    return Equality.eq( $kw404$ALL, inference_allowed_modules( inference ) );
  }

  @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-datastructures-inference.lisp", position = 67902L)
  public static SubLObject inference_allows_use_of_moduleP(final SubLObject inference, final SubLObject hl_module)
  {
    return makeBoolean( NIL != inference_allows_use_of_all_modulesP( inference ) || NIL != inference_modules.hl_module_allowedP( hl_module, inference_allowed_modules( inference ) ) );
  }

  @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-datastructures-inference.lisp", position = 68113L)
  public static SubLObject inference_forget_extra_resultsP(final SubLObject inference)
  {
    return inference_datastructures_enumerated_types.inference_properties_forget_extra_resultsP( inference_input_query_properties( inference ) );
  }

  @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-datastructures-inference.lisp", position = 68276L)
  public static SubLObject inference_has_some_answerP(final SubLObject inference)
  {
    final SubLObject v_id_index = inference_answer_id_index( inference );
    return Numbers.plusp( id_index.id_index_count( v_id_index ) );
  }

  @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-datastructures-inference.lisp", position = 68439L)
  public static SubLObject find_inference_answer_by_id(final SubLObject inference, final SubLObject id)
  {
    assert NIL != subl_promotions.non_negative_integer_p( id ) : id;
    final SubLObject v_id_index = inference_answer_id_index( inference );
    return id_index.id_index_lookup( v_id_index, id, UNPROVIDED );
  }

  @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-datastructures-inference.lisp", position = 68643L)
  public static SubLObject find_inference_answer_by_ids(final SubLObject store_id, final SubLObject inference_id, final SubLObject answer_id)
  {
    final SubLObject inference = inference_datastructures_problem_store.find_inference_by_ids( store_id, inference_id );
    if( NIL != inference )
    {
      final SubLObject v_answer = find_inference_answer_by_id( inference, answer_id );
      return v_answer;
    }
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-datastructures-inference.lisp", position = 68905L)
  public static SubLObject inference_answer_signature(final SubLObject v_answer)
  {
    return ConsesLow.list( inference_datastructures_problem_store.problem_store_suid( inference_answer_problem_store( v_answer ) ), inference_suid( inference_answer_inference( v_answer ) ), inference_answer_suid(
        v_answer ) );
  }

  @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-datastructures-inference.lisp", position = 69205L)
  public static SubLObject find_inference_answer_from_signature(final SubLObject signature)
  {
    SubLObject problem_store_suid = NIL;
    SubLObject inference_suid = NIL;
    SubLObject answer_suid = NIL;
    cdestructuring_bind.destructuring_bind_must_consp( signature, signature, $list413 );
    problem_store_suid = signature.first();
    SubLObject current = signature.rest();
    cdestructuring_bind.destructuring_bind_must_consp( current, signature, $list413 );
    inference_suid = current.first();
    current = current.rest();
    cdestructuring_bind.destructuring_bind_must_consp( current, signature, $list413 );
    answer_suid = current.first();
    current = current.rest();
    if( NIL == current )
    {
      return find_inference_answer_by_ids( problem_store_suid, inference_suid, answer_suid );
    }
    cdestructuring_bind.cdestructuring_bind_error( signature, $list413 );
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-datastructures-inference.lisp", position = 69555L)
  public static SubLObject inference_first_answer(final SubLObject inference)
  {
    return inference_first_answer_with_id_or_greater( inference, ZERO_INTEGER );
  }

  @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-datastructures-inference.lisp", position = 69671L)
  public static SubLObject inference_last_answer(final SubLObject inference)
  {
    final SubLObject limit = inference_next_new_answer_id( inference );
    SubLObject v_answer = NIL;
    if( NIL == v_answer )
    {
      SubLObject end_var;
      SubLObject id;
      for( end_var = MINUS_ONE_INTEGER, id = NIL, id = number_utilities.f_1_( limit ); NIL == v_answer && !id.numLE( end_var ); v_answer = find_inference_answer_by_id( inference, id ), id = Numbers.add( id,
          MINUS_ONE_INTEGER ) )
      {
      }
    }
    return v_answer;
  }

  @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-datastructures-inference.lisp", position = 69981L)
  public static SubLObject inference_first_answer_with_id_or_greater(final SubLObject inference, final SubLObject min_id)
  {
    final SubLObject limit = inference_next_new_answer_id( inference );
    SubLObject v_answer = NIL;
    if( NIL == v_answer )
    {
      SubLObject end_var;
      SubLObject id;
      for( end_var = limit, id = NIL, id = min_id; NIL == v_answer && !id.numGE( end_var ); v_answer = find_inference_answer_by_id( inference, id ), id = number_utilities.f_1X( id ) )
      {
      }
    }
    return v_answer;
  }

  @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-datastructures-inference.lisp", position = 70384L)
  public static SubLObject inference_first_answer_elapsed_time(final SubLObject inference)
  {
    final SubLObject first_answer = inference_first_answer( inference );
    if( NIL != first_answer )
    {
      return inference_answer_elapsed_time( first_answer, NIL );
    }
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-datastructures-inference.lisp", position = 70634L)
  public static SubLObject inference_first_answer_step_count(final SubLObject inference)
  {
    final SubLObject first_answer = inference_first_answer( inference );
    if( NIL != first_answer )
    {
      return inference_answer_step_count( first_answer );
    }
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-datastructures-inference.lisp", position = 70876L)
  public static SubLObject inference_last_answer_elapsed_time(final SubLObject inference)
  {
    final SubLObject last_answer = inference_last_answer( inference );
    if( NIL != last_answer )
    {
      return inference_answer_elapsed_time( last_answer, NIL );
    }
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-datastructures-inference.lisp", position = 71121L)
  public static SubLObject inference_last_answer_step_count(final SubLObject inference)
  {
    final SubLObject first_answer = inference_last_answer( inference );
    if( NIL != first_answer )
    {
      return inference_answer_step_count( first_answer );
    }
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-datastructures-inference.lisp", position = 71361L)
  public static SubLObject inference_last_answer_id(final SubLObject inference)
  {
    final SubLObject last_answer = inference_last_answer( inference );
    return ( NIL != last_answer ) ? inference_answer_suid( last_answer ) : NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-datastructures-inference.lisp", position = 71578L)
  public static SubLObject inference_answer_count_at_elapsed_time(final SubLObject inference, final SubLObject elapsed_seconds)
  {
    final SubLObject elapsed_internal_real_time = numeric_date_utilities.elapsed_seconds_to_elapsed_internal_real_time( elapsed_seconds );
    SubLObject count = ZERO_INTEGER;
    final SubLObject idx = inference_answer_id_index( inference );
    if( NIL == id_index.id_index_objects_empty_p( idx, $kw389$SKIP ) )
    {
      final SubLObject idx_$25 = idx;
      if( NIL == id_index.id_index_dense_objects_empty_p( idx_$25, $kw389$SKIP ) )
      {
        final SubLObject vector_var = id_index.id_index_dense_objects( idx_$25 );
        final SubLObject backwardP_var = NIL;
        SubLObject length;
        SubLObject v_iteration;
        SubLObject id;
        SubLObject v_answer;
        for( length = Sequences.length( vector_var ), v_iteration = NIL, v_iteration = ZERO_INTEGER; v_iteration.numL( length ); v_iteration = Numbers.add( v_iteration, ONE_INTEGER ) )
        {
          id = ( ( NIL != backwardP_var ) ? Numbers.subtract( length, v_iteration, ONE_INTEGER ) : v_iteration );
          v_answer = Vectors.aref( vector_var, id );
          if( NIL == id_index.id_index_tombstone_p( v_answer ) || NIL == id_index.id_index_skip_tombstones_p( $kw389$SKIP ) )
          {
            if( NIL != id_index.id_index_tombstone_p( v_answer ) )
            {
              v_answer = $kw389$SKIP;
            }
            if( inference_answer_elapsed_creation_time( v_answer ).numLE( elapsed_internal_real_time ) )
            {
              count = Numbers.add( count, ONE_INTEGER );
            }
          }
        }
      }
      final SubLObject idx_$26 = idx;
      if( NIL == id_index.id_index_sparse_objects_empty_p( idx_$26 ) )
      {
        final SubLObject cdohash_table = id_index.id_index_sparse_objects( idx_$26 );
        SubLObject id2 = NIL;
        SubLObject v_answer2 = NIL;
        final Iterator cdohash_iterator = Hashtables.getEntrySetIterator( cdohash_table );
        try
        {
          while ( Hashtables.iteratorHasNext( cdohash_iterator ))
          {
            final Map.Entry cdohash_entry = Hashtables.iteratorNextEntry( cdohash_iterator );
            id2 = Hashtables.getEntryKey( cdohash_entry );
            v_answer2 = Hashtables.getEntryValue( cdohash_entry );
            if( inference_answer_elapsed_creation_time( v_answer2 ).numLE( elapsed_internal_real_time ) )
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

  @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-datastructures-inference.lisp", position = 72120L)
  public static SubLObject inference_answer_count_at_30_seconds(final SubLObject inference)
  {
    return inference_answer_count_at_elapsed_time( inference, $int17$30 );
  }

  @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-datastructures-inference.lisp", position = 72248L)
  public static SubLObject inference_answer_count_at_60_seconds(final SubLObject inference)
  {
    return inference_answer_count_at_elapsed_time( inference, $int47$60 );
  }

  @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-datastructures-inference.lisp", position = 72376L)
  public static SubLObject inference_answer_times(final SubLObject inference)
  {
    SubLObject times = NIL;
    final SubLObject idx = inference_answer_id_index( inference );
    if( NIL == id_index.id_index_objects_empty_p( idx, $kw389$SKIP ) )
    {
      final SubLObject idx_$27 = idx;
      if( NIL == id_index.id_index_dense_objects_empty_p( idx_$27, $kw389$SKIP ) )
      {
        final SubLObject vector_var = id_index.id_index_dense_objects( idx_$27 );
        final SubLObject backwardP_var = NIL;
        SubLObject length;
        SubLObject v_iteration;
        SubLObject id;
        SubLObject v_answer;
        for( length = Sequences.length( vector_var ), v_iteration = NIL, v_iteration = ZERO_INTEGER; v_iteration.numL( length ); v_iteration = Numbers.add( v_iteration, ONE_INTEGER ) )
        {
          id = ( ( NIL != backwardP_var ) ? Numbers.subtract( length, v_iteration, ONE_INTEGER ) : v_iteration );
          v_answer = Vectors.aref( vector_var, id );
          if( NIL == id_index.id_index_tombstone_p( v_answer ) || NIL == id_index.id_index_skip_tombstones_p( $kw389$SKIP ) )
          {
            if( NIL != id_index.id_index_tombstone_p( v_answer ) )
            {
              v_answer = $kw389$SKIP;
            }
            times = ConsesLow.cons( inference_answer_elapsed_creation_time( v_answer ), times );
          }
        }
      }
      final SubLObject idx_$28 = idx;
      if( NIL == id_index.id_index_sparse_objects_empty_p( idx_$28 ) || NIL == id_index.id_index_skip_tombstones_p( $kw389$SKIP ) )
      {
        final SubLObject sparse = id_index.id_index_sparse_objects( idx_$28 );
        SubLObject id2 = id_index.id_index_sparse_id_threshold( idx_$28 );
        final SubLObject end_id = id_index.id_index_next_id( idx_$28 );
        final SubLObject v_default = ( NIL != id_index.id_index_skip_tombstones_p( $kw389$SKIP ) ) ? NIL : $kw389$SKIP;
        while ( id2.numL( end_id ))
        {
          final SubLObject v_answer2 = Hashtables.gethash_without_values( id2, sparse, v_default );
          if( NIL == id_index.id_index_skip_tombstones_p( $kw389$SKIP ) || NIL == id_index.id_index_tombstone_p( v_answer2 ) )
          {
            times = ConsesLow.cons( inference_answer_elapsed_creation_time( v_answer2 ), times );
          }
          id2 = Numbers.add( id2, ONE_INTEGER );
        }
      }
    }
    return Sequences.nreverse( times );
  }

  @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-datastructures-inference.lisp", position = 72602L)
  public static SubLObject inference_answer_step_counts(final SubLObject inference)
  {
    SubLObject times = NIL;
    final SubLObject idx = inference_answer_id_index( inference );
    if( NIL == id_index.id_index_objects_empty_p( idx, $kw389$SKIP ) )
    {
      final SubLObject idx_$29 = idx;
      if( NIL == id_index.id_index_dense_objects_empty_p( idx_$29, $kw389$SKIP ) )
      {
        final SubLObject vector_var = id_index.id_index_dense_objects( idx_$29 );
        final SubLObject backwardP_var = NIL;
        SubLObject length;
        SubLObject v_iteration;
        SubLObject id;
        SubLObject v_answer;
        for( length = Sequences.length( vector_var ), v_iteration = NIL, v_iteration = ZERO_INTEGER; v_iteration.numL( length ); v_iteration = Numbers.add( v_iteration, ONE_INTEGER ) )
        {
          id = ( ( NIL != backwardP_var ) ? Numbers.subtract( length, v_iteration, ONE_INTEGER ) : v_iteration );
          v_answer = Vectors.aref( vector_var, id );
          if( NIL == id_index.id_index_tombstone_p( v_answer ) || NIL == id_index.id_index_skip_tombstones_p( $kw389$SKIP ) )
          {
            if( NIL != id_index.id_index_tombstone_p( v_answer ) )
            {
              v_answer = $kw389$SKIP;
            }
            times = ConsesLow.cons( inference_answer_step_count( v_answer ), times );
          }
        }
      }
      final SubLObject idx_$30 = idx;
      if( NIL == id_index.id_index_sparse_objects_empty_p( idx_$30 ) || NIL == id_index.id_index_skip_tombstones_p( $kw389$SKIP ) )
      {
        final SubLObject sparse = id_index.id_index_sparse_objects( idx_$30 );
        SubLObject id2 = id_index.id_index_sparse_id_threshold( idx_$30 );
        final SubLObject end_id = id_index.id_index_next_id( idx_$30 );
        final SubLObject v_default = ( NIL != id_index.id_index_skip_tombstones_p( $kw389$SKIP ) ) ? NIL : $kw389$SKIP;
        while ( id2.numL( end_id ))
        {
          final SubLObject v_answer2 = Hashtables.gethash_without_values( id2, sparse, v_default );
          if( NIL == id_index.id_index_skip_tombstones_p( $kw389$SKIP ) || NIL == id_index.id_index_tombstone_p( v_answer2 ) )
          {
            times = ConsesLow.cons( inference_answer_step_count( v_answer2 ), times );
          }
          id2 = Numbers.add( id2, ONE_INTEGER );
        }
      }
    }
    return Sequences.nreverse( times );
  }

  @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-datastructures-inference.lisp", position = 72823L)
  public static SubLObject inference_new_root_metrics(final SubLObject inference)
  {
    if( NIL != simplest_inference_p( inference ) )
    {
      final SubLObject strategy = simplest_inference_strategy( inference );
      if( NIL != striping_tactician.striping_tactician_p( strategy ) )
      {
        return striping_tactician.striping_tactician_new_root_metrics( strategy );
      }
    }
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-datastructures-inference.lisp", position = 73886L)
  public static SubLObject inference_end_universal_time(final SubLObject inference)
  {
    final SubLObject end_real_time = inference_end_internal_real_time( inference );
    if( NIL != end_real_time )
    {
      final SubLObject start_real_time = inference_start_internal_real_time( inference );
      final SubLObject elapsed = numeric_date_utilities.elapsed_internal_real_time( start_real_time, end_real_time );
      final SubLObject seconds = numeric_date_utilities.elapsed_internal_real_time_to_elapsed_seconds( elapsed );
      final SubLObject start_time = inference_start_universal_time( inference );
      final SubLObject end_time = numeric_date_utilities.universal_time_seconds_from_now( seconds, start_time );
      return end_time;
    }
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-datastructures-inference.lisp", position = 74445L)
  public static SubLObject inference_maintain_term_working_setP(final SubLObject inference)
  {
    assert NIL != inference_p( inference ) : inference;
    return list_utilities.sublisp_boolean( inference_problem_working_time_data( inference ) );
  }

  @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-datastructures-inference.lisp", position = 74617L)
  public static SubLObject inference_halt_condition_presentP(final SubLObject inference, final SubLObject halt_condition)
  {
    assert NIL != inference_p( inference ) : inference;
    assert NIL != inference_datastructures_enumerated_types.inference_halt_condition_p( halt_condition ) : halt_condition;
    return list_utilities.member_eqP( halt_condition, infrnc_halt_conditions( inference ) );
  }

  @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-datastructures-inference.lisp", position = 74861L)
  public static SubLObject add_inference_accumulator(final SubLObject inference, final SubLObject accumulator_type, final SubLObject accumulator)
  {
    assert NIL != inference_p( inference ) : inference;
    assert NIL != inference_datastructures_enumerated_types.inference_accumulator_type_p( accumulator_type ) : accumulator_type;
    assert NIL != accumulation.accumulator_p( accumulator ) : accumulator;
    final SubLObject dict = inference_accumulators( inference );
    dictionary.dictionary_enter( dict, accumulator_type, accumulator );
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-datastructures-inference.lisp", position = 75207L)
  public static SubLObject inference_accumulator(final SubLObject inference, final SubLObject accumulator_type)
  {
    assert NIL != inference_p( inference ) : inference;
    assert NIL != inference_datastructures_enumerated_types.inference_accumulator_type_p( accumulator_type ) : accumulator_type;
    final SubLObject dict = inference_accumulators( inference );
    SubLObject accumulator = dictionary.dictionary_lookup_without_values( dict, accumulator_type, UNPROVIDED );
    if( NIL == accumulator )
    {
      accumulator = inference_datastructures_enumerated_types.initialize_inference_accumulator( accumulator_type );
      dictionary.dictionary_enter( dict, accumulator_type, accumulator );
    }
    return accumulator;
  }

  @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-datastructures-inference.lisp", position = 75714L)
  public static SubLObject inference_accumulator_contents(final SubLObject inference, final SubLObject accumulator_type)
  {
    assert NIL != inference_p( inference ) : inference;
    assert NIL != inference_datastructures_enumerated_types.inference_accumulator_type_p( accumulator_type ) : accumulator_type;
    return accumulation.accumulation_contents( inference_accumulator( inference, accumulator_type ), UNPROVIDED );
  }

  @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-datastructures-inference.lisp", position = 75975L)
  public static SubLObject inference_accumulate(final SubLObject inference, final SubLObject accumulator_type, final SubLObject element)
  {
    assert NIL != inference_p( inference ) : inference;
    assert NIL != inference_datastructures_enumerated_types.inference_accumulator_type_p( accumulator_type ) : accumulator_type;
    return accumulation.accumulation_add( inference_accumulator( inference, accumulator_type ), element );
  }

  @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-datastructures-inference.lisp", position = 76308L)
  public static SubLObject set_inference_proof_watermark(final SubLObject inference, final SubLObject proof_watermark)
  {
    assert NIL != inference_p( inference ) : inference;
    assert NIL != subl_promotions.non_negative_integer_p( proof_watermark ) : proof_watermark;
    _csetf_infrnc_proof_watermark( inference, proof_watermark );
    return inference;
  }

  @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-datastructures-inference.lisp", position = 76556L)
  public static SubLObject compute_inference_pad_internal_real_time(final SubLObject inference)
  {
    final SubLObject pad_probability = inference_probably_approximately_done( inference );
    final SubLObject pad_seconds = probably_approximately_done_cutoff_time( pad_probability );
    if( NIL != number_utilities.positive_infinity_p( pad_seconds ) )
    {
      return number_utilities.positive_infinity();
    }
    final SubLObject pad_seconds_remaining = Numbers.subtract( pad_seconds, inference_cumulative_time( inference ) );
    final SubLObject start_time = inference_start_internal_real_time( inference );
    final SubLObject pad_time = numeric_date_utilities.internal_real_time_seconds_from_now( pad_seconds_remaining, start_time );
    return pad_time;
  }

  @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-datastructures-inference.lisp", position = 77210L)
  public static SubLObject initialize_pad_table(final SubLObject filename)
  {
    final SubLObject scaled_times_to_first_answer = misc_utilities.scale_by_bogomips( inference_pad_data.$non_tkb_final_times_to_first_answer$.getGlobalValue(), inference_pad_data.$non_tkb_final_bogomips$
        .getGlobalValue() );
    $pad_times_to_first_answer$.setGlobalValue( scaled_times_to_first_answer );
    return Sequences.length( $pad_times_to_first_answer$.getGlobalValue() );
  }

  @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-datastructures-inference.lisp", position = 77589L)
  public static SubLObject pad_table_initializedP()
  {
    return Types.consp( $pad_times_to_first_answer$.getGlobalValue() );
  }

  @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-datastructures-inference.lisp", position = 77679L)
  public static SubLObject probably_approximately_done_cutoff_time(final SubLObject probability)
  {
    if( NIL != list_utilities.safe_E( ONE_INTEGER, probability ) || NIL == pad_table_initializedP() )
    {
      return $kw418$POSITIVE_INFINITY;
    }
    return number_utilities.percentile_sorted( $pad_times_to_first_answer$.getGlobalValue(), probability );
  }

  @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-datastructures-inference.lisp", position = 78010L)
  public static SubLObject compute_pad_from_time(final SubLObject time)
  {
    if( NIL == pad_table_initializedP() )
    {
      return NIL;
    }
    final SubLObject times = conses_high.member( time, $pad_times_to_first_answer$.getGlobalValue(), Symbols.symbol_function( $sym419$_ ), UNPROVIDED );
    SubLObject pad = NIL;
    SubLObject total = NIL;
    SubLObject index = NIL;
    if( NIL == times )
    {
      return NIL;
    }
    total = Sequences.length( $pad_times_to_first_answer$.getGlobalValue() );
    index = Numbers.subtract( total, Sequences.length( times ) );
    pad = Numbers.divide( index, total );
    return pad;
  }

  @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-datastructures-inference.lisp", position = 78359L)
  public static SubLObject inference_note_transformation_depth(final SubLObject inference, final SubLObject depth)
  {
    final SubLObject max_transformation_depth_reached = inference_max_transformation_depth_reached( inference );
    if( depth.numG( max_transformation_depth_reached ) )
    {
      return inference_note_new_transformation_depth_reached( inference, depth );
    }
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-datastructures-inference.lisp", position = 78750L)
  public static SubLObject inference_note_new_transformation_depth_reached(final SubLObject inference, final SubLObject depth)
  {
    set_inference_max_transformation_depth_reached( inference, depth );
    possibly_signal_inference_new_transformation_depth_reached( inference, depth );
    if( NIL != inference_halt_condition_presentP( inference, $kw420$LOOK_NO_DEEPER_FOR_ADDITIONAL_ANSWERS ) && NIL != subl_promotions.positive_integer_p( inference_answer_count( inference ) ) )
    {
      set_inference_suspend_status( inference, $kw420$LOOK_NO_DEEPER_FOR_ADDITIONAL_ANSWERS );
      return $kw420$LOOK_NO_DEEPER_FOR_ADDITIONAL_ANSWERS;
    }
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-datastructures-inference.lisp", position = 79280L)
  public static SubLObject find_inference_answer_by_bindings(final SubLObject inference, final SubLObject v_bindings)
  {
    assert NIL != bindings.binding_list_p( v_bindings ) : v_bindings;
    final SubLObject dict = inference_answer_bindings_index( inference );
    return dictionary.dictionary_lookup( dict, v_bindings, UNPROVIDED );
  }

  @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-datastructures-inference.lisp", position = 79500L)
  public static SubLObject new_inference_answer_id(final SubLObject inference)
  {
    final SubLObject v_id_index = inference_answer_id_index( inference );
    return id_index.id_index_reserve( v_id_index );
  }

  @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-datastructures-inference.lisp", position = 79652L)
  public static SubLObject inference_count()
  {
    SubLObject count = ZERO_INTEGER;
    final SubLObject idx = inference_datastructures_problem_store.problem_store_id_index();
    if( NIL == id_index.id_index_objects_empty_p( idx, $kw389$SKIP ) )
    {
      final SubLObject idx_$31 = idx;
      if( NIL == id_index.id_index_dense_objects_empty_p( idx_$31, $kw389$SKIP ) )
      {
        final SubLObject vector_var = id_index.id_index_dense_objects( idx_$31 );
        final SubLObject backwardP_var = NIL;
        SubLObject length;
        SubLObject v_iteration;
        SubLObject id;
        SubLObject store;
        for( length = Sequences.length( vector_var ), v_iteration = NIL, v_iteration = ZERO_INTEGER; v_iteration.numL( length ); v_iteration = Numbers.add( v_iteration, ONE_INTEGER ) )
        {
          id = ( ( NIL != backwardP_var ) ? Numbers.subtract( length, v_iteration, ONE_INTEGER ) : v_iteration );
          store = Vectors.aref( vector_var, id );
          if( NIL == id_index.id_index_tombstone_p( store ) || NIL == id_index.id_index_skip_tombstones_p( $kw389$SKIP ) )
          {
            if( NIL != id_index.id_index_tombstone_p( store ) )
            {
              store = $kw389$SKIP;
            }
            count = Numbers.add( count, inference_datastructures_problem_store.problem_store_inference_count( store ) );
          }
        }
      }
      final SubLObject idx_$32 = idx;
      if( NIL == id_index.id_index_sparse_objects_empty_p( idx_$32 ) )
      {
        final SubLObject cdohash_table = id_index.id_index_sparse_objects( idx_$32 );
        SubLObject id2 = NIL;
        SubLObject store2 = NIL;
        final Iterator cdohash_iterator = Hashtables.getEntrySetIterator( cdohash_table );
        try
        {
          while ( Hashtables.iteratorHasNext( cdohash_iterator ))
          {
            final Map.Entry cdohash_entry = Hashtables.iteratorNextEntry( cdohash_iterator );
            id2 = Hashtables.getEntryKey( cdohash_entry );
            store2 = Hashtables.getEntryValue( cdohash_entry );
            count = Numbers.add( count, inference_datastructures_problem_store.problem_store_inference_count( store2 ) );
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

  @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-datastructures-inference.lisp", position = 79860L)
  public static SubLObject inference_all_answers(final SubLObject inference, SubLObject start_id)
  {
    if( start_id == UNPROVIDED )
    {
      start_id = ZERO_INTEGER;
    }
    assert NIL != inference_p( inference ) : inference;
    assert NIL != subl_promotions.non_negative_integer_p( start_id ) : start_id;
    SubLObject answers = NIL;
    final SubLObject start_id_$33 = start_id;
    SubLObject end_id;
    SubLObject id;
    SubLObject v_answer;
    for( end_id = inference_next_new_answer_id( inference ), id = NIL, id = start_id_$33; !id.numGE( end_id ); id = number_utilities.f_1X( id ) )
    {
      v_answer = find_inference_answer_by_id( inference, id );
      answers = ConsesLow.cons( v_answer, answers );
    }
    start_id = end_id;
    return Sequences.nreverse( answers );
  }

  @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-datastructures-inference.lisp", position = 80341L)
  public static SubLObject inference_all_new_answers(final SubLObject inference)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    SubLObject answers = NIL;
    final SubLObject start_id = inference_new_answer_id_start( inference );
    SubLObject end_id;
    SubLObject id;
    SubLObject v_answer;
    for( end_id = inference_next_new_answer_id( inference ), id = NIL, id = start_id; !id.numGE( end_id ); id = number_utilities.f_1X( id ) )
    {
      v_answer = find_inference_answer_by_id( inference, id );
      if( NIL == Errors.$ignore_mustsP$.getDynamicValue( thread ) && NIL == v_answer )
      {
        Errors.error( $str421$got_a_null_answer_for__s, inference );
      }
      answers = ConsesLow.cons( v_answer, answers );
    }
    return Sequences.nreverse( answers );
  }

  @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-datastructures-inference.lisp", position = 80656L)
  public static SubLObject inference_allowed_rules_list(final SubLObject inference)
  {
    assert NIL != inference_p( inference ) : inference;
    final SubLObject allowed_rules = infrnc_allowed_rules( inference );
    return ( NIL != set.set_p( allowed_rules ) ) ? set.set_element_list( allowed_rules ) : allowed_rules;
  }

  @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-datastructures-inference.lisp", position = 80939L)
  public static SubLObject inference_allowed_rule_count(final SubLObject inference)
  {
    final SubLObject allowed_rules = infrnc_allowed_rules( inference );
    return ( NIL != set.set_p( allowed_rules ) ) ? set.set_size( allowed_rules ) : $kw418$POSITIVE_INFINITY;
  }

  @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-datastructures-inference.lisp", position = 81199L)
  public static SubLObject inference_forbidden_rules_list(final SubLObject inference)
  {
    assert NIL != inference_p( inference ) : inference;
    final SubLObject forbidden_rules = infrnc_forbidden_rules( inference );
    return ( NIL != set.set_p( forbidden_rules ) ) ? set.set_element_list( forbidden_rules ) : forbidden_rules;
  }

  @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-datastructures-inference.lisp", position = 81495L)
  public static SubLObject inference_forbidden_rule_count(final SubLObject inference)
  {
    final SubLObject forbidden_rules = infrnc_forbidden_rules( inference );
    return ( NIL != set.set_p( forbidden_rules ) ) ? set.set_size( forbidden_rules ) : ZERO_INTEGER;
  }

  @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-datastructures-inference.lisp", position = 81748L)
  public static SubLObject inference_interrupt_signaledP(final SubLObject inference)
  {
    return makeBoolean( NIL == queues.queue_empty_p( inference_interrupting_processes( inference ) ) );
  }

  @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-datastructures-inference.lisp", position = 81886L)
  public static SubLObject inference_no_interrupt_signaledP(final SubLObject inference)
  {
    return queues.queue_empty_p( inference_interrupting_processes( inference ) );
  }

  @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-datastructures-inference.lisp", position = 82020L)
  public static SubLObject inference_interrupt_handledP(final SubLObject inference)
  {
    return inference_no_interrupt_signaledP( inference );
  }

  @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-datastructures-inference.lisp", position = 82191L)
  public static SubLObject inference_answer_count(final SubLObject inference)
  {
    return id_index.id_index_count( inference_answer_id_index( inference ) );
  }

  @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-datastructures-inference.lisp", position = 82310L)
  public static SubLObject inference_new_answer_count(final SubLObject inference)
  {
    return Numbers.subtract( inference_answer_count( inference ), inference_new_answer_id_start( inference ) );
  }

  @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-datastructures-inference.lisp", position = 82461L)
  public static SubLObject successful_inference_p(final SubLObject v_object)
  {
    return makeBoolean( NIL != inference_p( v_object ) && inference_answer_count( v_object ).isPositive() );
  }

  @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-datastructures-inference.lisp", position = 82643L)
  public static SubLObject inference_new_justification_count(final SubLObject inference)
  {
    return queues.queue_size( inference_new_answer_justifications( inference ) );
  }

  @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-datastructures-inference.lisp", position = 82779L)
  public static SubLObject inference_new_result_count(final SubLObject inference)
  {
    assert NIL != inference_p( inference ) : inference;
    if( NIL != inference_unique_wrt_proofsP( inference ) )
    {
      return inference_new_justification_count( inference );
    }
    return inference_new_answer_count( inference );
  }

  @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-datastructures-inference.lisp", position = 83035L)
  public static SubLObject forward_inference_p(final SubLObject inference)
  {
    return makeBoolean( NIL != inference_p( inference ) && NIL != inference_datastructures_problem_store.problem_store_forwardP( inference_problem_store( inference ) ) );
  }

  @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-datastructures-inference.lisp", position = 83193L)
  public static SubLObject backward_inference_p(final SubLObject inference)
  {
    return makeBoolean( NIL != inference_p( inference ) && NIL == forward_inference_p( inference ) );
  }

  @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-datastructures-inference.lisp", position = 83332L)
  public static SubLObject abductive_inference_p(final SubLObject inference)
  {
    return makeBoolean( NIL != inference_p( inference ) && NIL != inference_datastructures_problem_store.problem_store_abduction_allowedP( inference_problem_store( inference ) ) );
  }

  @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-datastructures-inference.lisp", position = 83502L)
  public static SubLObject inference_provability_status(final SubLObject inference)
  {
    assert NIL != inference_p( inference ) : inference;
    if( NIL != inference_has_some_answerP( inference ) )
    {
      return $kw422$GOOD;
    }
    if( NIL != inference_worker.no_good_problem_p( inference_root_problem( inference ), $kw423$TACTICAL ) )
    {
      return $kw424$NO_GOOD;
    }
    return $kw425$NEUTRAL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-datastructures-inference.lisp", position = 83926L)
  public static SubLObject good_inference_p(final SubLObject v_object)
  {
    return makeBoolean( NIL != inference_p( v_object ) && $kw422$GOOD == inference_provability_status( v_object ) );
  }

  @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-datastructures-inference.lisp", position = 84123L)
  public static SubLObject neutral_inference_p(final SubLObject v_object)
  {
    return makeBoolean( NIL != inference_p( v_object ) && $kw425$NEUTRAL == inference_provability_status( v_object ) );
  }

  @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-datastructures-inference.lisp", position = 84353L)
  public static SubLObject no_good_inference_p(final SubLObject v_object)
  {
    return makeBoolean( NIL != inference_p( v_object ) && $kw424$NO_GOOD == inference_provability_status( v_object ) );
  }

  @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-datastructures-inference.lisp", position = 84567L)
  public static SubLObject closed_inference_p(final SubLObject v_object)
  {
    return makeBoolean( NIL != inference_p( v_object ) && NIL != inference_no_free_hl_varsP( v_object ) );
  }

  @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-datastructures-inference.lisp", position = 84777L)
  public static SubLObject inference_set_static_properties(final SubLObject inference, final SubLObject static_properties)
  {
    assert NIL != inference_datastructures_enumerated_types.inference_static_properties_p( static_properties ) : static_properties;
    final SubLObject disjunction_free_el_vars_policy = inference_datastructures_enumerated_types.inference_properties_disjunction_free_el_vars_policy( static_properties );
    set_inference_disjunction_free_el_vars_policy( inference, disjunction_free_el_vars_policy );
    final SubLObject uniqueness_criterion = inference_datastructures_enumerated_types.inference_properties_uniqueness_criterion( static_properties );
    set_inference_result_uniqueness_criterion( inference, uniqueness_criterion );
    final SubLObject allow_hl_predicate_transformationP = inference_datastructures_enumerated_types.inference_properties_allow_hl_predicate_transformationP( static_properties );
    set_inference_allow_hl_predicate_transformation( inference, allow_hl_predicate_transformationP );
    final SubLObject allow_unbound_predicate_transformationP = inference_datastructures_enumerated_types.inference_properties_allow_unbound_predicate_transformationP( static_properties );
    set_inference_allow_unbound_predicate_transformation( inference, allow_unbound_predicate_transformationP );
    final SubLObject allow_evaluatable_predicate_transformationP = inference_datastructures_enumerated_types.inference_properties_allow_evaluatable_predicate_transformationP( static_properties );
    set_inference_allow_evaluatable_predicate_transformation( inference, allow_evaluatable_predicate_transformationP );
    final SubLObject allow_indeterminate_resultsP = inference_datastructures_enumerated_types.inference_properties_allow_indeterminate_resultsP( static_properties );
    set_inference_allow_indeterminate_results( inference, allow_indeterminate_resultsP );
    final SubLObject allowed_rules = inference_datastructures_enumerated_types.inference_properties_allowed_rules( static_properties );
    assert NIL != inference_utilities.allowed_rules_spec_p( allowed_rules ) : allowed_rules;
    if( $kw404$ALL == allowed_rules )
    {
      set_inference_allowed_rules( inference, $kw404$ALL );
    }
    else
    {
      set_inference_allowed_rules( inference, set_utilities.construct_set_from_list( allowed_rules, Symbols.symbol_function( EQL ), UNPROVIDED ) );
    }
    final SubLObject forbidden_rules = inference_datastructures_enumerated_types.inference_properties_forbidden_rules( static_properties );
    assert NIL != inference_utilities.forbidden_rules_spec_p( forbidden_rules ) : forbidden_rules;
    if( $kw412$NONE == forbidden_rules )
    {
      set_inference_forbidden_rules( inference, $kw412$NONE );
    }
    else
    {
      set_inference_forbidden_rules( inference, set_utilities.construct_set_from_list( forbidden_rules, Symbols.symbol_function( EQL ), UNPROVIDED ) );
    }
    final SubLObject allowed_modules = inference_datastructures_enumerated_types.inference_properties_allowed_modules( static_properties );
    set_inference_allowed_modules( inference, allowed_modules );
    final SubLObject allow_abnormality_checkingP = inference_datastructures_enumerated_types.inference_properties_allow_abnormality_checkingP( static_properties );
    set_inference_allow_abnormality_checking( inference, allow_abnormality_checkingP );
    final SubLObject transitive_closure_mode = inference_datastructures_enumerated_types.inference_properties_transitive_closure_mode( static_properties );
    set_inference_transitive_closure_mode( inference, transitive_closure_mode );
    final SubLObject maintain_term_working_setP = inference_datastructures_enumerated_types.inference_properties_maintain_term_working_setP( static_properties );
    if( NIL != maintain_term_working_setP )
    {
      initialize_inference_problem_working_time_data( inference );
    }
    final SubLObject events = inference_datastructures_enumerated_types.inference_properties_events( static_properties );
    set_inference_events( inference, events );
    final SubLObject halt_conditions = inference_datastructures_enumerated_types.inference_properties_halt_conditions( static_properties );
    set_inference_halt_conditions( inference, halt_conditions );
    return inference;
  }

  @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-datastructures-inference.lisp", position = 87895L)
  public static SubLObject update_inference_input_query_properties(final SubLObject inference, final SubLObject input_dynamic_properties)
  {
    assert NIL != inference_datastructures_enumerated_types.query_dynamic_properties_p( input_dynamic_properties ) : input_dynamic_properties;
    SubLObject input_query_properties = infrnc_input_query_properties( inference );
    final SubLObject static_mode = inference_datastructures_enumerated_types.inference_properties_mode( input_query_properties );
    final SubLObject dynamic_mode = inference_datastructures_enumerated_types.inference_properties_mode( input_dynamic_properties );
    final SubLObject mode_mismatchP = makeBoolean( !static_mode.eql( dynamic_mode ) );
    if( NIL != mode_mismatchP )
    {
      input_query_properties = inference_datastructures_enumerated_types.extract_query_static_properties( inference_strategist.explicify_inference_mode_defaults( input_query_properties ) );
      input_query_properties = conses_high.putf( input_query_properties, $kw430$INFERENCE_MODE, dynamic_mode );
      input_query_properties = inference_strategist.implicify_inference_mode_defaults( input_query_properties );
    }
    SubLObject remainder;
    SubLObject property;
    SubLObject value;
    for( remainder = NIL, remainder = input_dynamic_properties; NIL != remainder; remainder = conses_high.cddr( remainder ) )
    {
      property = remainder.first();
      value = conses_high.cadr( remainder );
      input_query_properties = conses_high.putf( input_query_properties, property, value );
    }
    set_inference_input_query_properties( inference, input_query_properties );
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-datastructures-inference.lisp", position = 89035L)
  public static SubLObject add_inference_relevant_problem(final SubLObject inference, final SubLObject problem)
  {
    assert NIL != inference_p( inference ) : inference;
    assert NIL != inference_datastructures_problem.problem_p( problem ) : problem;
    set.set_add( problem, infrnc_relevant_problems( inference ) );
    return inference;
  }

  @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-datastructures-inference.lisp", position = 89251L)
  public static SubLObject remove_inference_relevant_problem(final SubLObject inference, final SubLObject problem)
  {
    assert NIL != inference_p( inference ) : inference;
    assert NIL != inference_datastructures_problem.problem_p( problem ) : problem;
    set.set_remove( problem, infrnc_relevant_problems( inference ) );
    return inference;
  }

  @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-datastructures-inference.lisp", position = 89473L)
  public static SubLObject clear_inference_relevant_problems(final SubLObject inference)
  {
    assert NIL != inference_p( inference ) : inference;
    set.clear_set( infrnc_relevant_problems( inference ) );
    return inference;
  }

  @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-datastructures-inference.lisp", position = 89645L)
  public static SubLObject add_inference_strategy(final SubLObject inference, final SubLObject strategy)
  {
    assert NIL != inference_p( inference ) : inference;
    assert NIL != inference_datastructures_strategy.strategy_p( strategy ) : strategy;
    set.set_add( strategy, infrnc_strategy_set( inference ) );
    return inference;
  }

  @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-datastructures-inference.lisp", position = 89852L)
  public static SubLObject remove_inference_strategy(final SubLObject inference, final SubLObject strategy)
  {
    assert NIL != inference_p( inference ) : inference;
    assert NIL != inference_datastructures_strategy.strategy_p( strategy ) : strategy;
    set.set_remove( strategy, infrnc_strategy_set( inference ) );
    return inference;
  }

  @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-datastructures-inference.lisp", position = 90065L)
  public static SubLObject clear_inference_strategy_set(final SubLObject inference)
  {
    assert NIL != inference_p( inference ) : inference;
    set.clear_set( infrnc_strategy_set( inference ) );
    return inference;
  }

  @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-datastructures-inference.lisp", position = 90227L)
  public static SubLObject reset_inference_new_answer_id(final SubLObject inference)
  {
    final SubLObject next_id = inference_next_new_answer_id( inference );
    _csetf_infrnc_new_answer_id_start( inference, next_id );
    return inference;
  }

  @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-datastructures-inference.lisp", position = 90426L)
  public static SubLObject inference_next_new_answer_id(final SubLObject inference)
  {
    final SubLObject v_id_index = inference_answer_id_index( inference );
    return id_index.id_index_next_id( v_id_index );
  }

  @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-datastructures-inference.lisp", position = 90624L)
  public static SubLObject add_inference_new_answer_by_id(final SubLObject inference, final SubLObject v_answer)
  {
    assert NIL != inference_answer_p( v_answer ) : v_answer;
    final SubLObject id = inference_answer_suid( v_answer );
    final SubLObject v_id_index = inference_answer_id_index( inference );
    id_index.id_index_enter_autoextend( v_id_index, id, v_answer, NIL );
    return inference;
  }

  @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-datastructures-inference.lisp", position = 90904L)
  public static SubLObject remove_inference_new_answer_by_id(final SubLObject inference, final SubLObject v_answer)
  {
    assert NIL != inference_answer_p( v_answer ) : v_answer;
    final SubLObject id = inference_answer_suid( v_answer );
    final SubLObject v_id_index = inference_answer_id_index( inference );
    id_index.id_index_remove( v_id_index, id );
    return inference;
  }

  @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-datastructures-inference.lisp", position = 91166L)
  public static SubLObject add_inference_new_answer_by_bindings(final SubLObject inference, final SubLObject v_answer)
  {
    assert NIL != inference_answer_p( v_answer ) : v_answer;
    final SubLObject v_bindings = inference_answer_bindings( v_answer );
    final SubLObject index = inference_answer_bindings_index( inference );
    dictionary.dictionary_enter( index, v_bindings, v_answer );
    return inference;
  }

  @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-datastructures-inference.lisp", position = 91547L)
  public static SubLObject remove_inference_new_answer_by_bindings(final SubLObject inference, final SubLObject v_answer)
  {
    assert NIL != inference_answer_p( v_answer ) : v_answer;
    final SubLObject v_bindings = inference_answer_bindings( v_answer );
    final SubLObject index = inference_answer_bindings_index( inference );
    dictionary.dictionary_remove( index, v_bindings );
    return inference;
  }

  @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-datastructures-inference.lisp", position = 91836L)
  public static SubLObject reset_inference_new_answer_justifications(final SubLObject inference)
  {
    queues.clear_queue( inference_new_answer_justifications( inference ) );
    return inference;
  }

  @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-datastructures-inference.lisp", position = 91990L)
  public static SubLObject add_inference_new_answer_justification(final SubLObject inference, final SubLObject answer_justification)
  {
    assert NIL != inference_answer_justification_p( answer_justification ) : answer_justification;
    queues.enqueue( answer_justification, inference_new_answer_justifications( inference ) );
    return inference;
  }

  @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-datastructures-inference.lisp", position = 92318L)
  public static SubLObject remove_inference_new_answer_justification(final SubLObject inference, final SubLObject answer_justification)
  {
    assert NIL != inference_answer_justification_p( answer_justification ) : answer_justification;
    queues.remqueue( answer_justification, inference_new_answer_justifications( inference ), UNPROVIDED );
    return inference;
  }

  @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-datastructures-inference.lisp", position = 92650L)
  public static SubLObject clear_inference_control_process(final SubLObject inference)
  {
    return set_inference_control_process( inference, NIL );
  }

  @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-datastructures-inference.lisp", position = 92769L)
  public static SubLObject set_inference_control_process_to_me(final SubLObject inference)
  {
    return set_inference_control_process( inference, Threads.current_process() );
  }

  @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-datastructures-inference.lisp", position = 92905L)
  public static SubLObject note_inference_interrupt_signaled(final SubLObject inference, final SubLObject process)
  {
    assert NIL != Types.processp( process ) : process;
    queues.enqueue( process, inference_interrupting_processes( inference ) );
    return inference;
  }

  @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-datastructures-inference.lisp", position = 93092L)
  public static SubLObject increment_inference_cumulative_time(final SubLObject inference, final SubLObject time_delta)
  {
    SubLObject cumulative_time = inference_cumulative_time( inference );
    cumulative_time = Numbers.add( cumulative_time, time_delta );
    set_inference_cumulative_time( inference, cumulative_time );
    return inference;
  }

  @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-datastructures-inference.lisp", position = 93355L)
  public static SubLObject reorder_inference_free_hl_vars(final SubLObject inference, final SubLObject new_hl_vars)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    final SubLObject old_hl_vars = inference_free_hl_vars( inference );
    if( NIL == Errors.$ignore_mustsP$.getDynamicValue( thread ) && NIL == conses_high.subsetp( old_hl_vars, new_hl_vars, Symbols.symbol_function( EQL ), UNPROVIDED ) )
    {
      Errors.error( $str435$variables__S_were_removed, conses_high.set_difference( old_hl_vars, new_hl_vars, Symbols.symbol_function( EQL ), UNPROVIDED ) );
    }
    if( NIL == Errors.$ignore_mustsP$.getDynamicValue( thread ) && NIL == conses_high.subsetp( new_hl_vars, old_hl_vars, Symbols.symbol_function( EQL ), UNPROVIDED ) )
    {
      Errors.error( $str436$variables__S_were_added, conses_high.set_difference( new_hl_vars, old_hl_vars, Symbols.symbol_function( EQL ), UNPROVIDED ) );
    }
    if( NIL == Errors.$ignore_mustsP$.getDynamicValue( thread ) && !Sequences.length( old_hl_vars ).numE( Sequences.length( new_hl_vars ) ) )
    {
      Errors.error( $str437$variables__S_contain_duplications, new_hl_vars );
    }
    set_inference_free_hl_vars( inference, new_hl_vars );
    return inference;
  }

  @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-datastructures-inference.lisp", position = 94027L)
  public static SubLObject reorder_inference_free_el_vars(final SubLObject inference, final SubLObject new_el_vars)
  {
    final SubLObject el_bindings = inference_el_bindings( inference );
    final SubLObject new_hl_vars = bindings.apply_bindings( el_bindings, new_el_vars );
    return reorder_inference_free_hl_vars( inference, new_hl_vars );
  }

  @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-datastructures-inference.lisp", position = 94358L)
  public static SubLObject reset_inference_new_answers(final SubLObject inference)
  {
    reset_inference_new_answer_id( inference );
    reset_inference_new_answer_justifications( inference );
    return inference;
  }

  @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-datastructures-inference.lisp", position = 94551L)
  public static SubLObject add_inference_new_answer(final SubLObject inference, final SubLObject v_answer)
  {
    assert NIL != inference_answer_p( v_answer ) : v_answer;
    add_inference_new_answer_by_id( inference, v_answer );
    add_inference_new_answer_by_bindings( inference, v_answer );
    return inference;
  }

  @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-datastructures-inference.lisp", position = 94782L)
  public static SubLObject remove_inference_new_answer(final SubLObject inference, final SubLObject v_answer)
  {
    assert NIL != inference_answer_p( v_answer ) : v_answer;
    remove_inference_new_answer_by_id( inference, v_answer );
    remove_inference_new_answer_by_bindings( inference, v_answer );
    return inference;
  }

  @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-datastructures-inference.lisp", position = 95022L)
  public static SubLObject initialize_inference_time_properties(final SubLObject inference)
  {
    final SubLObject real_time_now = Time.get_internal_real_time();
    final SubLObject now = Time.get_universal_time();
    set_inference_start_internal_real_time( inference, real_time_now );
    set_inference_start_universal_time( inference, now );
    final SubLObject max_time = inference_max_time( inference );
    final SubLObject end_time = ( NIL != max_time ) ? numeric_date_utilities.internal_real_time_seconds_from_now( max_time, real_time_now ) : NIL;
    set_inference_end_internal_real_time( inference, end_time );
    final SubLObject pad_time = compute_inference_pad_internal_real_time( inference );
    set_inference_pad_internal_real_time( inference, pad_time );
    return inference;
  }

  @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-datastructures-inference.lisp", position = 95690L)
  public static SubLObject finalize_inference_time_properties(final SubLObject inference)
  {
    final SubLObject delta_time = inference_time_so_far( inference, NIL );
    increment_inference_cumulative_time( inference, delta_time );
    return inference;
  }

  @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-datastructures-inference.lisp", position = 95900L)
  public static SubLObject inference_elapsed_internal_real_time_since_start(final SubLObject inference)
  {
    final SubLObject start = inference_start_internal_real_time( inference );
    final SubLObject elapsed = numeric_date_utilities.elapsed_internal_real_time( start, UNPROVIDED );
    return elapsed;
  }

  @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-datastructures-inference.lisp", position = 96114L)
  public static SubLObject inference_elapsed_universal_time_since_start(final SubLObject inference)
  {
    final SubLObject start = inference_start_universal_time( inference );
    final SubLObject elapsed = subl_promotions.elapsed_universal_time( start, UNPROVIDED );
    return elapsed;
  }

  @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-datastructures-inference.lisp", position = 96316L)
  public static SubLObject inference_time_so_far(final SubLObject inference, SubLObject seconds_granularityP)
  {
    if( seconds_granularityP == UNPROVIDED )
    {
      seconds_granularityP = T;
    }
    SubLObject seconds = ZERO_INTEGER;
    if( NIL != running_inference_p( inference ) )
    {
      if( NIL != seconds_granularityP )
      {
        seconds = inference_elapsed_universal_time_since_start( inference );
      }
      else
      {
        final SubLObject elapsed = inference_elapsed_internal_real_time_since_start( inference );
        seconds = numeric_date_utilities.elapsed_internal_real_time_to_elapsed_seconds( elapsed );
      }
    }
    return seconds;
  }

  @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-datastructures-inference.lisp", position = 96843L)
  public static SubLObject inference_remaining_time(final SubLObject inference, SubLObject seconds_granularityP)
  {
    if( seconds_granularityP == UNPROVIDED )
    {
      seconds_granularityP = T;
    }
    assert NIL != inference_p( inference ) : inference;
    final SubLObject end = inference_end_internal_real_time( inference );
    if( NIL != running_inference_p( inference ) && end.isInteger() )
    {
      final SubLObject now = Time.get_internal_real_time();
      final SubLObject remaining = numeric_date_utilities.elapsed_internal_real_time( now, end );
      SubLObject remaining_seconds = numeric_date_utilities.elapsed_internal_real_time_to_elapsed_seconds( remaining );
      if( NIL != seconds_granularityP )
      {
        remaining_seconds = Numbers.truncate( remaining_seconds, UNPROVIDED );
      }
      return remaining_seconds;
    }
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-datastructures-inference.lisp", position = 97549L)
  public static SubLObject inference_cumulative_time_so_far(final SubLObject inference, SubLObject seconds_granularityP)
  {
    if( seconds_granularityP == UNPROVIDED )
    {
      seconds_granularityP = T;
    }
    final SubLObject cumulative = inference_cumulative_time( inference );
    final SubLObject so_far = inference_time_so_far( inference, NIL );
    SubLObject total = Numbers.add( cumulative, so_far );
    if( NIL != seconds_granularityP )
    {
      total = Numbers.truncate( total, UNPROVIDED );
    }
    return total;
  }

  @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-datastructures-inference.lisp", position = 98003L)
  public static SubLObject inference_signal_interrupt(final SubLObject inference)
  {
    note_inference_interrupt_signaled( inference, Threads.current_process() );
    return inference;
  }

  @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-datastructures-inference.lisp", position = 98197L)
  public static SubLObject inference_handle_interrupts(final SubLObject inference)
  {
    SubLObject interrupt_handledP = NIL;
    if( NIL != valid_inference_p( inference ) )
    {
      for( SubLObject q = inference_interrupting_processes( inference ), done_var = queues.queue_empty_p( q ); NIL == done_var; done_var = queues.queue_empty_p( q ) )
      {
        final SubLObject process = queues.dequeue( q );
        Threads.process_unblock( process );
        interrupt_handledP = T;
      }
    }
    return interrupt_handledP;
  }

  @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-datastructures-inference.lisp", position = 98594L)
  public static SubLObject simplest_inference_p(final SubLObject v_object)
  {
    return makeBoolean( NIL != inference_p( v_object ) && $kw438$SIMPLEST == inference_type( v_object ) );
  }

  @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-datastructures-inference.lisp", position = 98803L)
  public static SubLObject new_simplest_inference(final SubLObject store)
  {
    assert NIL != inference_datastructures_problem_store.problem_store_p( store ) : store;
    final SubLObject inference = new_inference( store );
    set_inference_type( inference, $kw438$SIMPLEST );
    return inference;
  }

  @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-datastructures-inference.lisp", position = 99018L)
  public static SubLObject simplest_inference_strategy(final SubLObject inference)
  {
    assert NIL != simplest_inference_p( inference ) : inference;
    return inference_data( inference );
  }

  @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-datastructures-inference.lisp", position = 99171L)
  public static SubLObject set_simplest_inference_strategy(final SubLObject inference, final SubLObject strategy)
  {
    assert NIL != simplest_inference_p( inference ) : inference;
    assert NIL != inference_datastructures_strategy.strategy_p( strategy ) : strategy;
    _csetf_infrnc_data( inference, strategy );
    return inference;
  }

  @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-datastructures-inference.lisp", position = 99398L)
  public static SubLObject new_simplest_inference_of_type(final SubLObject store, final SubLObject strategy_type)
  {
    assert NIL != inference_datastructures_problem_store.problem_store_p( store ) : store;
    assert NIL != inference_datastructures_strategy.strategy_type_p( strategy_type ) : strategy_type;
    final SubLObject inference = new_simplest_inference( store );
    final SubLObject strategy = inference_datastructures_strategy.new_strategy( strategy_type, inference );
    set_simplest_inference_strategy( inference, strategy );
    inference_tactician.clear_strategy_step_count();
    return inference;
  }

  @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-datastructures-inference.lisp", position = 99797L)
  public static SubLObject new_simplest_inference_with_new_store(final SubLObject strategy_type)
  {
    final SubLObject new_store = inference_datastructures_problem_store.new_problem_store( UNPROVIDED );
    return new_simplest_inference_of_type( new_store, strategy_type );
  }

  @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-datastructures-inference.lisp", position = 100373L)
  public static SubLObject inference_answer_print_function_trampoline(final SubLObject v_object, final SubLObject stream)
  {
    print_inference_answer( v_object, stream, ZERO_INTEGER );
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-datastructures-inference.lisp", position = 100373L)
  public static SubLObject inference_answer_p(final SubLObject v_object)
  {
    return ( v_object.getClass() == $inference_answer_native.class ) ? T : NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-datastructures-inference.lisp", position = 100373L)
  public static SubLObject inf_answer_suid(final SubLObject v_object)
  {
    assert NIL != inference_answer_p( v_object ) : v_object;
    return v_object.getField2();
  }

  @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-datastructures-inference.lisp", position = 100373L)
  public static SubLObject inf_answer_inference(final SubLObject v_object)
  {
    assert NIL != inference_answer_p( v_object ) : v_object;
    return v_object.getField3();
  }

  @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-datastructures-inference.lisp", position = 100373L)
  public static SubLObject inf_answer_bindings(final SubLObject v_object)
  {
    assert NIL != inference_answer_p( v_object ) : v_object;
    return v_object.getField4();
  }

  @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-datastructures-inference.lisp", position = 100373L)
  public static SubLObject inf_answer_justifications(final SubLObject v_object)
  {
    assert NIL != inference_answer_p( v_object ) : v_object;
    return v_object.getField5();
  }

  @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-datastructures-inference.lisp", position = 100373L)
  public static SubLObject inf_answer_elapsed_creation_time(final SubLObject v_object)
  {
    assert NIL != inference_answer_p( v_object ) : v_object;
    return v_object.getField6();
  }

  @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-datastructures-inference.lisp", position = 100373L)
  public static SubLObject inf_answer_step_count(final SubLObject v_object)
  {
    assert NIL != inference_answer_p( v_object ) : v_object;
    return v_object.getField7();
  }

  @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-datastructures-inference.lisp", position = 100373L)
  public static SubLObject _csetf_inf_answer_suid(final SubLObject v_object, final SubLObject value)
  {
    assert NIL != inference_answer_p( v_object ) : v_object;
    return v_object.setField2( value );
  }

  @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-datastructures-inference.lisp", position = 100373L)
  public static SubLObject _csetf_inf_answer_inference(final SubLObject v_object, final SubLObject value)
  {
    assert NIL != inference_answer_p( v_object ) : v_object;
    return v_object.setField3( value );
  }

  @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-datastructures-inference.lisp", position = 100373L)
  public static SubLObject _csetf_inf_answer_bindings(final SubLObject v_object, final SubLObject value)
  {
    assert NIL != inference_answer_p( v_object ) : v_object;
    return v_object.setField4( value );
  }

  @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-datastructures-inference.lisp", position = 100373L)
  public static SubLObject _csetf_inf_answer_justifications(final SubLObject v_object, final SubLObject value)
  {
    assert NIL != inference_answer_p( v_object ) : v_object;
    return v_object.setField5( value );
  }

  @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-datastructures-inference.lisp", position = 100373L)
  public static SubLObject _csetf_inf_answer_elapsed_creation_time(final SubLObject v_object, final SubLObject value)
  {
    assert NIL != inference_answer_p( v_object ) : v_object;
    return v_object.setField6( value );
  }

  @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-datastructures-inference.lisp", position = 100373L)
  public static SubLObject _csetf_inf_answer_step_count(final SubLObject v_object, final SubLObject value)
  {
    assert NIL != inference_answer_p( v_object ) : v_object;
    return v_object.setField7( value );
  }

  @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-datastructures-inference.lisp", position = 100373L)
  public static SubLObject make_inference_answer(SubLObject arglist)
  {
    if( arglist == UNPROVIDED )
    {
      arglist = NIL;
    }
    final SubLObject v_new = new $inference_answer_native();
    SubLObject next;
    SubLObject current_arg;
    SubLObject current_value;
    SubLObject pcase_var;
    for( next = NIL, next = arglist; NIL != next; next = conses_high.cddr( next ) )
    {
      current_arg = next.first();
      current_value = conses_high.cadr( next );
      pcase_var = current_arg;
      if( pcase_var.eql( $kw204$SUID ) )
      {
        _csetf_inf_answer_suid( v_new, current_value );
      }
      else if( pcase_var.eql( $kw461$INFERENCE ) )
      {
        _csetf_inf_answer_inference( v_new, current_value );
      }
      else if( pcase_var.eql( $kw411$BINDINGS ) )
      {
        _csetf_inf_answer_bindings( v_new, current_value );
      }
      else if( pcase_var.eql( $kw462$JUSTIFICATIONS ) )
      {
        _csetf_inf_answer_justifications( v_new, current_value );
      }
      else if( pcase_var.eql( $kw463$ELAPSED_CREATION_TIME ) )
      {
        _csetf_inf_answer_elapsed_creation_time( v_new, current_value );
      }
      else if( pcase_var.eql( $kw265$STEP_COUNT ) )
      {
        _csetf_inf_answer_step_count( v_new, current_value );
      }
      else
      {
        Errors.error( $str275$Invalid_slot__S_for_construction_, current_arg );
      }
    }
    return v_new;
  }

  @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-datastructures-inference.lisp", position = 100373L)
  public static SubLObject visit_defstruct_inference_answer(final SubLObject obj, final SubLObject visitor_fn)
  {
    Functions.funcall( visitor_fn, obj, $kw276$BEGIN, $sym464$MAKE_INFERENCE_ANSWER, SIX_INTEGER );
    Functions.funcall( visitor_fn, obj, $kw278$SLOT, $kw204$SUID, inf_answer_suid( obj ) );
    Functions.funcall( visitor_fn, obj, $kw278$SLOT, $kw461$INFERENCE, inf_answer_inference( obj ) );
    Functions.funcall( visitor_fn, obj, $kw278$SLOT, $kw411$BINDINGS, inf_answer_bindings( obj ) );
    Functions.funcall( visitor_fn, obj, $kw278$SLOT, $kw462$JUSTIFICATIONS, inf_answer_justifications( obj ) );
    Functions.funcall( visitor_fn, obj, $kw278$SLOT, $kw463$ELAPSED_CREATION_TIME, inf_answer_elapsed_creation_time( obj ) );
    Functions.funcall( visitor_fn, obj, $kw278$SLOT, $kw265$STEP_COUNT, inf_answer_step_count( obj ) );
    Functions.funcall( visitor_fn, obj, $kw279$END, $sym464$MAKE_INFERENCE_ANSWER, SIX_INTEGER );
    return obj;
  }

  @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-datastructures-inference.lisp", position = 100373L)
  public static SubLObject visit_defstruct_object_inference_answer_method(final SubLObject obj, final SubLObject visitor_fn)
  {
    return visit_defstruct_inference_answer( obj, visitor_fn );
  }

  @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-datastructures-inference.lisp", position = 101264L)
  public static SubLObject valid_inference_answer_p(final SubLObject v_object)
  {
    return makeBoolean( NIL != inference_answer_p( v_object ) && NIL == inference_answer_invalid_p( v_object ) );
  }

  @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-datastructures-inference.lisp", position = 101410L)
  public static SubLObject inference_answer_invalid_p(final SubLObject inference_answer)
  {
    return Equality.eq( $kw346$FREE, inference_answer_bindings( inference_answer ) );
  }

  @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-datastructures-inference.lisp", position = 101592L)
  public static SubLObject print_inference_answer(final SubLObject v_object, final SubLObject stream, final SubLObject depth)
  {
    if( NIL != inference_answer_invalid_p( v_object ) )
    {
      PrintLow.format( stream, $str466$_Invalid_INFERENCE_ANSWER__s_, inf_answer_suid( v_object ) );
    }
    else
    {
      final SubLObject inference = inference_answer_inference( v_object );
      final SubLObject inf_suid = inference_suid( inference );
      final SubLObject store = inference_problem_store( inference );
      final SubLObject store_suid = ( NIL != inference_datastructures_problem_store.problem_store_p( store ) ) ? inference_datastructures_problem_store.problem_store_suid( store ) : NIL;
      PrintLow.format( stream, $str467$_INFERENCE_ANSWER__a_for_INFERENC, new SubLObject[] { inference_answer_suid( v_object ), store_suid, inf_suid, inference_answer_bindings( v_object )
      } );
    }
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-datastructures-inference.lisp", position = 102275L)
  public static SubLObject sxhash_inference_answer_method(final SubLObject v_object)
  {
    return inf_answer_suid( v_object );
  }

  @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-datastructures-inference.lisp", position = 102360L)
  public static SubLObject new_inference_answer(final SubLObject inference, final SubLObject v_bindings)
  {
    assert NIL != inference_p( inference ) : inference;
    assert NIL != bindings.bindings_p( v_bindings ) : v_bindings;
    final SubLObject v_answer = make_inference_answer( UNPROVIDED );
    final SubLObject suid = new_inference_answer_id( inference );
    if( suid.isZero() )
    {
      inference_metrics.increment_successful_inference_historical_count();
    }
    _csetf_inf_answer_suid( v_answer, suid );
    _csetf_inf_answer_inference( v_answer, inference );
    set_inference_answer_bindings( v_answer, v_bindings );
    _csetf_inf_answer_justifications( v_answer, NIL );
    initialize_inference_answer_elapsed_creation_time( v_answer );
    final SubLObject step_count = inference_cumulative_step_count( inference );
    set_inference_answer_step_count( v_answer, step_count );
    add_inference_new_answer( inference, v_answer );
    possibly_signal_new_inference_answer( inference, v_answer );
    return v_answer;
  }

  @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-datastructures-inference.lisp", position = 103302L)
  public static SubLObject find_or_create_inference_answer(final SubLObject inference, final SubLObject v_bindings)
  {
    assert NIL != inference_p( inference ) : inference;
    SubLObject v_answer = find_inference_answer_by_bindings( inference, v_bindings );
    SubLObject newP = NIL;
    if( NIL == v_answer )
    {
      v_answer = new_inference_answer( inference, v_bindings );
      newP = T;
    }
    return Values.values( v_answer, newP );
  }

  @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-datastructures-inference.lisp", position = 103756L)
  public static SubLObject do_inference_answer_justifications(final SubLObject macroform, final SubLObject environment)
  {
    SubLObject current;
    final SubLObject datum = current = macroform.rest();
    cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list470 );
    final SubLObject temp = current.rest();
    current = current.first();
    SubLObject just_var = NIL;
    SubLObject inference_answer = NIL;
    cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list470 );
    just_var = current.first();
    current = current.rest();
    cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list470 );
    inference_answer = current.first();
    current = current.rest();
    if( NIL == current )
    {
      final SubLObject body;
      current = ( body = temp );
      return ConsesLow.listS( $sym471$DO_LIST, ConsesLow.list( just_var, ConsesLow.list( $sym472$INFERENCE_ANSWER_JUSTIFICATIONS, inference_answer ) ), ConsesLow.append( body, NIL ) );
    }
    cdestructuring_bind.cdestructuring_bind_error( datum, $list470 );
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-datastructures-inference.lisp", position = 103961L)
  public static SubLObject do_inference_answer_justifications_numbered(final SubLObject macroform, final SubLObject environment)
  {
    SubLObject current;
    final SubLObject datum = current = macroform.rest();
    cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list473 );
    final SubLObject temp = current.rest();
    current = current.first();
    SubLObject just_var = NIL;
    SubLObject index_var = NIL;
    SubLObject inference_answer = NIL;
    cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list473 );
    just_var = current.first();
    current = current.rest();
    cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list473 );
    index_var = current.first();
    current = current.rest();
    cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list473 );
    inference_answer = current.first();
    current = current.rest();
    if( NIL == current )
    {
      final SubLObject body;
      current = ( body = temp );
      return ConsesLow.listS( $sym474$CDOLIST_NUMBERED, ConsesLow.list( just_var, index_var, ConsesLow.list( $sym472$INFERENCE_ANSWER_JUSTIFICATIONS, inference_answer ) ), ConsesLow.append( body, NIL ) );
    }
    cdestructuring_bind.cdestructuring_bind_error( datum, $list473 );
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-datastructures-inference.lisp", position = 104191L)
  public static SubLObject destroy_inference_answer(final SubLObject v_answer)
  {
    if( NIL != valid_inference_answer_p( v_answer ) )
    {
      note_inference_answer_invalid( v_answer );
      SubLObject cdolist_list_var = inference_answer_justifications( v_answer );
      SubLObject justification = NIL;
      justification = cdolist_list_var.first();
      while ( NIL != cdolist_list_var)
      {
        destroy_inference_answer_justification( justification );
        cdolist_list_var = cdolist_list_var.rest();
        justification = cdolist_list_var.first();
      }
      final SubLObject inference = inference_answer_inference( v_answer );
      remove_inference_new_answer( inference, v_answer );
      return destroy_inference_answer_int( v_answer );
    }
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-datastructures-inference.lisp", position = 104661L)
  public static SubLObject destroy_inference_answer_int(final SubLObject v_answer)
  {
    _csetf_inf_answer_justifications( v_answer, $kw346$FREE );
    _csetf_inf_answer_inference( v_answer, $kw346$FREE );
    return v_answer;
  }

  @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-datastructures-inference.lisp", position = 104878L)
  public static SubLObject note_inference_answer_invalid(final SubLObject v_answer)
  {
    _csetf_inf_answer_bindings( v_answer, $kw346$FREE );
    return v_answer;
  }

  @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-datastructures-inference.lisp", position = 104995L)
  public static SubLObject inference_answer_suid(final SubLObject inference_answer)
  {
    assert NIL != inference_answer_p( inference_answer ) : inference_answer;
    return inf_answer_suid( inference_answer );
  }

  @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-datastructures-inference.lisp", position = 105162L)
  public static SubLObject inference_answer_inference(final SubLObject inference_answer)
  {
    assert NIL != inference_answer_p( inference_answer ) : inference_answer;
    return inf_answer_inference( inference_answer );
  }

  @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-datastructures-inference.lisp", position = 105327L)
  public static SubLObject inference_answer_bindings(final SubLObject inference_answer)
  {
    assert NIL != inference_answer_p( inference_answer ) : inference_answer;
    return inf_answer_bindings( inference_answer );
  }

  @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-datastructures-inference.lisp", position = 105490L)
  public static SubLObject inference_answer_justifications(final SubLObject inference_answer)
  {
    assert NIL != inference_answer_p( inference_answer ) : inference_answer;
    return inf_answer_justifications( inference_answer );
  }

  @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-datastructures-inference.lisp", position = 105714L)
  public static SubLObject inference_answer_elapsed_creation_time(final SubLObject inference_answer)
  {
    assert NIL != inference_answer_p( inference_answer ) : inference_answer;
    return inf_answer_elapsed_creation_time( inference_answer );
  }

  @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-datastructures-inference.lisp", position = 105903L)
  public static SubLObject inference_answer_step_count(final SubLObject inference_answer)
  {
    assert NIL != inference_answer_p( inference_answer ) : inference_answer;
    return inf_answer_step_count( inference_answer );
  }

  @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-datastructures-inference.lisp", position = 106067L)
  public static SubLObject set_inference_answer_bindings(final SubLObject inference_answer, final SubLObject v_bindings)
  {
    assert NIL != bindings.bindings_p( v_bindings ) : v_bindings;
    _csetf_inf_answer_bindings( inference_answer, v_bindings );
    return inference_answer;
  }

  @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-datastructures-inference.lisp", position = 106273L)
  public static SubLObject set_inference_answer_elapsed_creation_time(final SubLObject inference_answer, final SubLObject elapsed_creation_time)
  {
    _csetf_inf_answer_elapsed_creation_time( inference_answer, elapsed_creation_time );
    return inference_answer;
  }

  @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-datastructures-inference.lisp", position = 106597L)
  public static SubLObject set_inference_answer_step_count(final SubLObject inference_answer, final SubLObject step_count)
  {
    _csetf_inf_answer_step_count( inference_answer, step_count );
    return inference_answer;
  }

  @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-datastructures-inference.lisp", position = 106866L)
  public static SubLObject inference_answer_problem_store(final SubLObject inference_answer)
  {
    assert NIL != inference_answer_p( inference_answer ) : inference_answer;
    return inference_problem_store( inference_answer_inference( inference_answer ) );
  }

  @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-datastructures-inference.lisp", position = 107081L)
  public static SubLObject inference_answer_free_el_vars(final SubLObject inference_answer)
  {
    return inference_free_el_vars( inference_answer_inference( inference_answer ) );
  }

  @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-datastructures-inference.lisp", position = 107229L)
  public static SubLObject inference_answer_elapsed_time(final SubLObject inference_answer, SubLObject seconds_granularityP)
  {
    if( seconds_granularityP == UNPROVIDED )
    {
      seconds_granularityP = T;
    }
    assert NIL != inference_answer_p( inference_answer ) : inference_answer;
    final SubLObject elapsed_time = inference_answer_elapsed_creation_time( inference_answer );
    SubLObject seconds = numeric_date_utilities.elapsed_internal_real_time_to_elapsed_seconds( elapsed_time );
    if( NIL != seconds_granularityP )
    {
      seconds = Numbers.truncate( seconds, UNPROVIDED );
    }
    return seconds;
  }

  @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-datastructures-inference.lisp", position = 107635L)
  public static SubLObject inference_answer_creation_time(final SubLObject inference_answer)
  {
    final SubLObject inference = inference_answer_inference( inference_answer );
    final SubLObject start = inference_start_universal_time( inference );
    final SubLObject elapsed = inference_answer_elapsed_time( inference_answer, T );
    return numeric_date_utilities.universal_time_seconds_from_now( elapsed, start );
  }

  @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-datastructures-inference.lisp", position = 108039L)
  public static SubLObject find_inference_answer_justification(final SubLObject inference_answer, final SubLObject hl_justification)
  {
    final SubLObject existing_justifications = inference_answer_justifications( inference_answer );
    return Sequences.find( hl_justification, existing_justifications, $sym475$JUSTIFICATION_EQUAL, $sym476$INFERENCE_ANSWER_JUSTIFICATION_SUPPORTS, UNPROVIDED, UNPROVIDED );
  }

  @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-datastructures-inference.lisp", position = 108413L)
  public static SubLObject inference_answer_result_bindings(final SubLObject v_answer)
  {
    final SubLObject inference = inference_answer_inference( v_answer );
    final SubLObject pcase_var;
    final SubLObject answer_language = pcase_var = inference_answer_language( inference );
    if( pcase_var.eql( $kw477$HL ) )
    {
      return inference_answer_bindings( v_answer );
    }
    if( pcase_var.eql( $kw478$EL ) )
    {
      return inference_kernel.inference_answer_el_bindings( v_answer );
    }
    Errors.error( $str479$_S_was_not_an_inference_answer_la, answer_language );
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-datastructures-inference.lisp", position = 108821L)
  public static SubLObject inference_answer_bindings_equalP(final SubLObject answer1, final SubLObject answer2)
  {
    assert NIL != inference_answer_p( answer1 ) : answer1;
    assert NIL != inference_answer_p( answer2 ) : answer2;
    return Equality.equal( inference_answer_bindings( answer1 ), inference_answer_bindings( answer2 ) );
  }

  @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-datastructures-inference.lisp", position = 109071L)
  public static SubLObject inference_answer_newP(final SubLObject inference_answer)
  {
    assert NIL != inference_answer_p( inference_answer ) : inference_answer;
    final SubLObject inference = inference_answer_inference( inference_answer );
    final SubLObject answer_id = inference_answer_suid( inference_answer );
    final SubLObject new_answer_id_start = inference_new_answer_id_start( inference );
    return Numbers.numGE( answer_id, new_answer_id_start );
  }

  @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-datastructures-inference.lisp", position = 109418L)
  public static SubLObject inference_answer_L(final SubLObject answer1, final SubLObject answer2)
  {
    return Numbers.numL( inference_answer_suid( answer1 ), inference_answer_suid( answer2 ) );
  }

  @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-datastructures-inference.lisp", position = 109640L)
  public static SubLObject inference_answer_el_sentence(final SubLObject inference_answer)
  {
    assert NIL != inference_answer_p( inference_answer ) : inference_answer;
    final SubLObject inference = inference_answer_inference( inference_answer );
    final SubLObject el_sentence = inference_input_el_query( inference );
    final SubLObject result_bindings = inference_answer_result_bindings( inference_answer );
    final SubLObject answer_el_sentence = bindings.apply_bindings( result_bindings, el_sentence );
    return answer_el_sentence;
  }

  @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-datastructures-inference.lisp", position = 110111L)
  public static SubLObject inference_answer_justification_count(final SubLObject inference_answer)
  {
    return Sequences.length( inference_answer_justifications( inference_answer ) );
  }

  @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-datastructures-inference.lisp", position = 110252L)
  public static SubLObject add_inference_answer_justification(final SubLObject inference_answer, final SubLObject justification)
  {
    assert NIL != inference_answer_justification_p( justification ) : justification;
    _csetf_inf_answer_justifications( inference_answer, ConsesLow.cons( justification, inf_answer_justifications( inference_answer ) ) );
    return inference_answer;
  }

  @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-datastructures-inference.lisp", position = 110518L)
  public static SubLObject remove_inference_answer_justification(final SubLObject inference_answer, final SubLObject justification)
  {
    assert NIL != inference_answer_justification_p( justification ) : justification;
    _csetf_inf_answer_justifications( inference_answer, Sequences.delete( justification, inf_answer_justifications( inference_answer ), UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED ) );
    return inference_answer;
  }

  @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-datastructures-inference.lisp", position = 110770L)
  public static SubLObject initialize_inference_answer_elapsed_creation_time(final SubLObject inference_answer)
  {
    final SubLObject inference = inference_answer_inference( inference_answer );
    final SubLObject start = inference_start_internal_real_time( inference );
    final SubLObject elapsed = numeric_date_utilities.elapsed_internal_real_time( start, UNPROVIDED );
    set_inference_answer_elapsed_creation_time( inference_answer, elapsed );
    return inference_answer;
  }

  @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-datastructures-inference.lisp", position = 111419L)
  public static SubLObject inference_answer_justification_print_function_trampoline(final SubLObject v_object, final SubLObject stream)
  {
    print_inference_answer_justification( v_object, stream, ZERO_INTEGER );
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-datastructures-inference.lisp", position = 111419L)
  public static SubLObject inference_answer_justification_p(final SubLObject v_object)
  {
    return ( v_object.getClass() == $inference_answer_justification_native.class ) ? T : NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-datastructures-inference.lisp", position = 111419L)
  public static SubLObject inf_ans_just_answer(final SubLObject v_object)
  {
    assert NIL != inference_answer_justification_p( v_object ) : v_object;
    return v_object.getField2();
  }

  @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-datastructures-inference.lisp", position = 111419L)
  public static SubLObject inf_ans_just_supports(final SubLObject v_object)
  {
    assert NIL != inference_answer_justification_p( v_object ) : v_object;
    return v_object.getField3();
  }

  @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-datastructures-inference.lisp", position = 111419L)
  public static SubLObject inf_ans_just_pragma_supports(final SubLObject v_object)
  {
    assert NIL != inference_answer_justification_p( v_object ) : v_object;
    return v_object.getField4();
  }

  @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-datastructures-inference.lisp", position = 111419L)
  public static SubLObject inf_ans_just_proofs(final SubLObject v_object)
  {
    assert NIL != inference_answer_justification_p( v_object ) : v_object;
    return v_object.getField5();
  }

  @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-datastructures-inference.lisp", position = 111419L)
  public static SubLObject _csetf_inf_ans_just_answer(final SubLObject v_object, final SubLObject value)
  {
    assert NIL != inference_answer_justification_p( v_object ) : v_object;
    return v_object.setField2( value );
  }

  @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-datastructures-inference.lisp", position = 111419L)
  public static SubLObject _csetf_inf_ans_just_supports(final SubLObject v_object, final SubLObject value)
  {
    assert NIL != inference_answer_justification_p( v_object ) : v_object;
    return v_object.setField3( value );
  }

  @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-datastructures-inference.lisp", position = 111419L)
  public static SubLObject _csetf_inf_ans_just_pragma_supports(final SubLObject v_object, final SubLObject value)
  {
    assert NIL != inference_answer_justification_p( v_object ) : v_object;
    return v_object.setField4( value );
  }

  @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-datastructures-inference.lisp", position = 111419L)
  public static SubLObject _csetf_inf_ans_just_proofs(final SubLObject v_object, final SubLObject value)
  {
    assert NIL != inference_answer_justification_p( v_object ) : v_object;
    return v_object.setField5( value );
  }

  @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-datastructures-inference.lisp", position = 111419L)
  public static SubLObject make_inference_answer_justification(SubLObject arglist)
  {
    if( arglist == UNPROVIDED )
    {
      arglist = NIL;
    }
    final SubLObject v_new = new $inference_answer_justification_native();
    SubLObject next;
    SubLObject current_arg;
    SubLObject current_value;
    SubLObject pcase_var;
    for( next = NIL, next = arglist; NIL != next; next = conses_high.cddr( next ) )
    {
      current_arg = next.first();
      current_value = conses_high.cadr( next );
      pcase_var = current_arg;
      if( pcase_var.eql( $kw497$ANSWER ) )
      {
        _csetf_inf_ans_just_answer( v_new, current_value );
      }
      else if( pcase_var.eql( $kw498$SUPPORTS ) )
      {
        _csetf_inf_ans_just_supports( v_new, current_value );
      }
      else if( pcase_var.eql( $kw499$PRAGMA_SUPPORTS ) )
      {
        _csetf_inf_ans_just_pragma_supports( v_new, current_value );
      }
      else if( pcase_var.eql( $kw500$PROOFS ) )
      {
        _csetf_inf_ans_just_proofs( v_new, current_value );
      }
      else
      {
        Errors.error( $str275$Invalid_slot__S_for_construction_, current_arg );
      }
    }
    return v_new;
  }

  @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-datastructures-inference.lisp", position = 111419L)
  public static SubLObject visit_defstruct_inference_answer_justification(final SubLObject obj, final SubLObject visitor_fn)
  {
    Functions.funcall( visitor_fn, obj, $kw276$BEGIN, $sym501$MAKE_INFERENCE_ANSWER_JUSTIFICATION, FOUR_INTEGER );
    Functions.funcall( visitor_fn, obj, $kw278$SLOT, $kw497$ANSWER, inf_ans_just_answer( obj ) );
    Functions.funcall( visitor_fn, obj, $kw278$SLOT, $kw498$SUPPORTS, inf_ans_just_supports( obj ) );
    Functions.funcall( visitor_fn, obj, $kw278$SLOT, $kw499$PRAGMA_SUPPORTS, inf_ans_just_pragma_supports( obj ) );
    Functions.funcall( visitor_fn, obj, $kw278$SLOT, $kw500$PROOFS, inf_ans_just_proofs( obj ) );
    Functions.funcall( visitor_fn, obj, $kw279$END, $sym501$MAKE_INFERENCE_ANSWER_JUSTIFICATION, FOUR_INTEGER );
    return obj;
  }

  @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-datastructures-inference.lisp", position = 111419L)
  public static SubLObject visit_defstruct_object_inference_answer_justification_method(final SubLObject obj, final SubLObject visitor_fn)
  {
    return visit_defstruct_inference_answer_justification( obj, visitor_fn );
  }

  @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-datastructures-inference.lisp", position = 112039L)
  public static SubLObject valid_inference_answer_justification_p(final SubLObject v_object)
  {
    return makeBoolean( NIL != inference_answer_justification_p( v_object ) && NIL == inference_answer_justification_invalid_p( v_object ) );
  }

  @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-datastructures-inference.lisp", position = 112227L)
  public static SubLObject inference_answer_justification_invalid_p(final SubLObject inference_answer_justification)
  {
    return Equality.eq( $kw346$FREE, inference_answer_justification_supports( inference_answer_justification ) );
  }

  @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-datastructures-inference.lisp", position = 112493L)
  public static SubLObject print_inference_answer_justification(final SubLObject v_object, final SubLObject stream, final SubLObject depth)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    if( NIL != inference_answer_justification_invalid_p( v_object ) )
    {
      if( NIL != print_high.$print_readably$.getDynamicValue( thread ) )
      {
        print_high.print_not_readable( v_object, stream );
      }
      else
      {
        print_macros.print_unreadable_object_preamble( stream, v_object, T, NIL );
        print_macros.print_unreadable_object_postamble( stream, v_object, T, T );
      }
    }
    else
    {
      PrintLow.format( stream, $str503$_INF_ANS_JUST__s_, inference_answer_justification_supports( v_object ) );
    }
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-datastructures-inference.lisp", position = 112826L)
  public static SubLObject sxhash_inference_answer_justification_method(final SubLObject v_object)
  {
    return Numbers.logxor( Sxhash.sxhash( inf_ans_just_answer( v_object ) ), Sxhash.sxhash( inf_ans_just_supports( v_object ) ) );
  }

  @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-datastructures-inference.lisp", position = 113034L)
  public static SubLObject list_of_inference_answer_justification_p(final SubLObject v_object)
  {
    if( NIL != list_utilities.non_dotted_list_p( v_object ) )
    {
      SubLObject cdolist_list_var = v_object;
      SubLObject subobject = NIL;
      subobject = cdolist_list_var.first();
      while ( NIL != cdolist_list_var)
      {
        if( NIL == inference_answer_justification_p( subobject ) )
        {
          return NIL;
        }
        cdolist_list_var = cdolist_list_var.rest();
        subobject = cdolist_list_var.first();
      }
      return T;
    }
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-datastructures-inference.lisp", position = 113303L)
  public static SubLObject new_inference_answer_justification(final SubLObject v_answer, final SubLObject supports, final SubLObject pragma_supports)
  {
    assert NIL != inference_answer_p( v_answer ) : v_answer;
    assert NIL != arguments.hl_justification_p( supports ) : supports;
    final SubLObject just = make_inference_answer_justification( UNPROVIDED );
    _csetf_inf_ans_just_answer( just, v_answer );
    _csetf_inf_ans_just_supports( just, supports );
    _csetf_inf_ans_just_pragma_supports( just, pragma_supports );
    add_inference_answer_justification( v_answer, just );
    return just;
  }

  @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-datastructures-inference.lisp", position = 113798L)
  public static SubLObject find_or_create_inference_answer_justification(final SubLObject inference, final SubLObject v_bindings, SubLObject supports, final SubLObject pragma_supports)
  {
    assert NIL != inference_p( inference ) : inference;
    supports = arguments.canonicalize_hl_justification( supports );
    final SubLObject v_answer = find_or_create_inference_answer( inference, v_bindings );
    SubLObject justification = find_inference_answer_justification( v_answer, supports );
    SubLObject newP = NIL;
    if( NIL == justification )
    {
      justification = new_inference_answer_justification( v_answer, supports, pragma_supports );
      add_inference_new_answer_justification( inference, justification );
      newP = T;
    }
    return Values.values( justification, newP );
  }

  @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-datastructures-inference.lisp", position = 114710L)
  public static SubLObject subst_indexical_referents_into_answer_bindings(SubLObject v_bindings, final SubLObject supports)
  {
    SubLObject bindings_values = bindings.bindings_values( v_bindings );
    SubLObject replaced_somethingP = NIL;
    if( NIL != kb_control_vars.date_kb_loaded_p() )
    {
      final SubLObject now_value = date_utilities.indexical_now();
      if( NIL != cycl_utilities.expression_find( now_value, bindings_values, NIL, Symbols.symbol_function( EQUAL ), UNPROVIDED ) )
      {
        bindings_values = cycl_utilities.expression_subst( $const506$Now, now_value, bindings_values, Symbols.symbol_function( EQUAL ), UNPROVIDED );
        replaced_somethingP = T;
      }
    }
    if( NIL != replaced_somethingP )
    {
      v_bindings = bindings.make_variable_bindings( bindings.bindings_variables( v_bindings ), bindings_values );
    }
    return v_bindings;
  }

  @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-datastructures-inference.lisp", position = 116373L)
  public static SubLObject destroy_inference_answer_justification(final SubLObject justification)
  {
    if( NIL != valid_inference_answer_justification_p( justification ) )
    {
      note_inference_answer_justification_invalid( justification );
      final SubLObject inference = inference_answer_justification_inference( justification );
      remove_inference_new_answer_justification( inference, justification );
      final SubLObject v_answer = inference_answer_justification_answer( justification );
      remove_inference_answer_justification( v_answer, justification );
      return destroy_inference_answer_justification_int( justification );
    }
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-datastructures-inference.lisp", position = 116987L)
  public static SubLObject destroy_inference_answer_justification_int(final SubLObject justification)
  {
    _csetf_inf_ans_just_answer( justification, $kw346$FREE );
    return justification;
  }

  @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-datastructures-inference.lisp", position = 117138L)
  public static SubLObject note_inference_answer_justification_invalid(final SubLObject justification)
  {
    _csetf_inf_ans_just_supports( justification, $kw346$FREE );
    _csetf_inf_ans_just_pragma_supports( justification, $kw346$FREE );
    return justification;
  }

  @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-datastructures-inference.lisp", position = 117353L)
  public static SubLObject inference_answer_justification_answer(final SubLObject justification)
  {
    assert NIL != inference_answer_justification_p( justification ) : justification;
    return inf_ans_just_answer( justification );
  }

  @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-datastructures-inference.lisp", position = 117545L)
  public static SubLObject inference_answer_justification_supports(final SubLObject justification)
  {
    assert NIL != inference_answer_justification_p( justification ) : justification;
    return inf_ans_just_supports( justification );
  }

  @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-datastructures-inference.lisp", position = 117729L)
  public static SubLObject inference_answer_justification_pragmatic_supports(final SubLObject justification)
  {
    assert NIL != inference_answer_justification_p( justification ) : justification;
    return inf_ans_just_pragma_supports( justification );
  }

  @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-datastructures-inference.lisp", position = 117930L)
  public static SubLObject inference_answer_justification_proofs(final SubLObject justification)
  {
    assert NIL != inference_answer_justification_p( justification ) : justification;
    return inf_ans_just_proofs( justification );
  }

  @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-datastructures-inference.lisp", position = 118110L)
  public static SubLObject do_inference_answer_justification_proofs(final SubLObject macroform, final SubLObject environment)
  {
    SubLObject current;
    final SubLObject datum = current = macroform.rest();
    cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list507 );
    final SubLObject temp = current.rest();
    current = current.first();
    SubLObject proof_var = NIL;
    SubLObject justification = NIL;
    cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list507 );
    proof_var = current.first();
    current = current.rest();
    cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list507 );
    justification = current.first();
    current = current.rest();
    if( NIL == current )
    {
      final SubLObject body;
      current = ( body = temp );
      return ConsesLow.listS( $sym471$DO_LIST, ConsesLow.list( proof_var, ConsesLow.list( $sym508$INFERENCE_ANSWER_JUSTIFICATION_PROOFS, justification ) ), ConsesLow.append( body, NIL ) );
    }
    cdestructuring_bind.cdestructuring_bind_error( datum, $list507 );
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-datastructures-inference.lisp", position = 118323L)
  public static SubLObject do_proof_dependent_inference_answer_justifications(final SubLObject macroform, final SubLObject environment)
  {
    SubLObject current;
    final SubLObject datum = current = macroform.rest();
    cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list509 );
    final SubLObject temp = current.rest();
    current = current.first();
    SubLObject justification_var = NIL;
    SubLObject proof = NIL;
    cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list509 );
    justification_var = current.first();
    current = current.rest();
    cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list509 );
    proof = current.first();
    current = current.rest();
    if( NIL == current )
    {
      final SubLObject body;
      current = ( body = temp );
      final SubLObject inference = $sym510$INFERENCE;
      final SubLObject v_answer = $sym511$ANSWER;
      final SubLObject proof_var = $sym512$PROOF_VAR;
      return ConsesLow.list( $sym301$CLET, ConsesLow.list( ConsesLow.list( proof_var, proof ) ), ConsesLow.list( $sym513$DO_PROBLEM_SUPPORTED_INFERENCES, ConsesLow.list( inference, ConsesLow.list(
          $sym514$PROOF_SUPPORTED_PROBLEM, proof_var ) ), ConsesLow.list( $sym323$DO_INFERENCE_ANSWERS, ConsesLow.list( v_answer, inference ), ConsesLow.list( $sym324$DO_INFERENCE_ANSWER_JUSTIFICATIONS, ConsesLow.list(
              justification_var, v_answer ), ConsesLow.listS( $sym333$PWHEN, ConsesLow.listS( $sym515$MEMBER_, proof_var, ConsesLow.list( $sym508$INFERENCE_ANSWER_JUSTIFICATION_PROOFS, justification_var ), $list516 ),
                  ConsesLow.append( body, NIL ) ) ) ) ) );
    }
    cdestructuring_bind.cdestructuring_bind_error( datum, $list509 );
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-datastructures-inference.lisp", position = 118842L)
  public static SubLObject do_inference_all_subproofs(final SubLObject macroform, final SubLObject environment)
  {
    SubLObject current;
    final SubLObject datum = current = macroform.rest();
    cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list517 );
    final SubLObject temp = current.rest();
    current = current.first();
    SubLObject subproof_var = NIL;
    SubLObject inference = NIL;
    cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list517 );
    subproof_var = current.first();
    current = current.rest();
    cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list517 );
    inference = current.first();
    current = current.rest();
    if( NIL == current )
    {
      final SubLObject body;
      current = ( body = temp );
      final SubLObject v_answer = $sym518$ANSWER;
      final SubLObject justification = $sym519$JUSTIFICATION;
      final SubLObject proof = $sym520$PROOF;
      return ConsesLow.list( $sym323$DO_INFERENCE_ANSWERS, ConsesLow.list( v_answer, inference ), ConsesLow.list( $sym324$DO_INFERENCE_ANSWER_JUSTIFICATIONS, ConsesLow.list( justification, v_answer ), ConsesLow.list(
          $sym521$DO_INFERENCE_ANSWER_JUSTIFICATION_PROOFS, ConsesLow.list( proof, justification ), ConsesLow.listS( $sym522$DO_PROOF_ALL_SUBPROOFS, ConsesLow.list( subproof_var, proof ), ConsesLow.append( body,
              NIL ) ) ) ) );
    }
    cdestructuring_bind.cdestructuring_bind_error( datum, $list517 );
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-datastructures-inference.lisp", position = 119319L)
  public static SubLObject inference_answer_first_justification(final SubLObject v_answer)
  {
    final SubLObject cdolist_list_var = inference_answer_justifications( v_answer );
    SubLObject justification = NIL;
    justification = cdolist_list_var.first();
    if( NIL != cdolist_list_var )
    {
      return justification;
    }
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-datastructures-inference.lisp", position = 119485L)
  public static SubLObject inference_answer_justification_first_proof(final SubLObject justification)
  {
    final SubLObject cdolist_list_var = inference_answer_justification_proofs( justification );
    SubLObject proof = NIL;
    proof = cdolist_list_var.first();
    if( NIL != cdolist_list_var )
    {
      return proof;
    }
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-datastructures-inference.lisp", position = 119647L)
  public static SubLObject inference_first_proof(final SubLObject inference)
  {
    final SubLObject v_answer = inference_first_answer( inference );
    if( NIL != v_answer )
    {
      final SubLObject justification = inference_answer_first_justification( v_answer );
      if( NIL != justification )
      {
        final SubLObject proof = inference_answer_justification_first_proof( justification );
        return proof;
      }
    }
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-datastructures-inference.lisp", position = 119971L)
  public static SubLObject inference_answer_justification_inference(final SubLObject justification)
  {
    return inference_answer_inference( inference_answer_justification_answer( justification ) );
  }

  @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-datastructures-inference.lisp", position = 120137L)
  public static SubLObject inference_answer_justification_store(final SubLObject justification)
  {
    return inference_problem_store( inference_answer_inference( inference_answer_justification_answer( justification ) ) );
  }

  @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-datastructures-inference.lisp", position = 120327L)
  public static SubLObject inference_answer_justification_rules(final SubLObject justification)
  {
    final SubLObject supports = inference_answer_justification_supports( justification );
    final SubLObject rules = assertion_utilities.sort_assertions( list_utilities.remove_if_not( Symbols.symbol_function( $sym523$RULE_ASSERTION_ ), supports, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED ) );
    return rules;
  }

  @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-datastructures-inference.lisp", position = 120568L)
  public static SubLObject add_inference_answer_justification_proof(final SubLObject justification, final SubLObject proof)
  {
    assert NIL != inference_datastructures_proof.proof_p( proof ) : proof;
    _csetf_inf_ans_just_proofs( justification, ConsesLow.cons( proof, inf_ans_just_proofs( justification ) ) );
    return justification;
  }

  @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-datastructures-inference.lisp", position = 120778L)
  public static SubLObject new_inference_answer_justification_from_proof(final SubLObject v_answer, final SubLObject supports, final SubLObject pragma_supports, final SubLObject proof)
  {
    final SubLObject justification = new_inference_answer_justification( v_answer, supports, pragma_supports );
    add_inference_answer_justification_proof( justification, proof );
    return justification;
  }

  @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-datastructures-inference.lisp", position = 121096L)
  public static SubLObject inference_answer_justification_to_tms_deduction_spec(final SubLObject justification, final SubLObject truth)
  {
    final SubLObject supports = inference_answer_justification_supports( justification );
    final SubLObject tv = argumentation.compute_supports_tv( supports, truth );
    return ConsesLow.list( $kw498$SUPPORTS, supports, $kw525$TV, tv );
  }

  @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-datastructures-inference.lisp", position = 121360L)
  public static SubLObject inference_answer_justification_to_true_tms_deduction_spec(final SubLObject justification)
  {
    return inference_answer_justification_to_tms_deduction_spec( justification, $kw526$TRUE );
  }

  @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-datastructures-inference.lisp", position = 121537L)
  public static SubLObject inference_answer_justification_to_false_tms_deduction_spec(final SubLObject justification)
  {
    return inference_answer_justification_to_tms_deduction_spec( justification, $kw527$FALSE );
  }

  @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-datastructures-inference.lisp", position = 121716L)
  public static SubLObject destroy_proof_inference_answer_justifications(final SubLObject proof)
  {
    final SubLObject set_contents_var = inference_datastructures_problem.problem_dependent_links( inference_datastructures_proof.proof_supported_problem( proof ) );
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
    for( basis_object = set_contents.do_set_contents_basis_object( set_contents_var ), state = NIL, state = set_contents.do_set_contents_initial_state( basis_object, set_contents_var ); NIL == set_contents
        .do_set_contents_doneP( basis_object, state ); state = set_contents.do_set_contents_update_state( state ) )
    {
      link = set_contents.do_set_contents_next( basis_object, state );
      if( NIL != set_contents.do_set_contents_element_validP( state, link ) )
      {
        inference = inference_datastructures_problem_link.problem_link_supported_inference( link );
        if( NIL != inference )
        {
          idx = inference_answer_id_index( inference );
          if( NIL == id_index.id_index_objects_empty_p( idx, $kw389$SKIP ) )
          {
            idx_$34 = idx;
            if( NIL == id_index.id_index_dense_objects_empty_p( idx_$34, $kw389$SKIP ) )
            {
              vector_var = id_index.id_index_dense_objects( idx_$34 );
              backwardP_var = NIL;
              for( length = Sequences.length( vector_var ), v_iteration = NIL, v_iteration = ZERO_INTEGER; v_iteration.numL( length ); v_iteration = Numbers.add( v_iteration, ONE_INTEGER ) )
              {
                id = ( ( NIL != backwardP_var ) ? Numbers.subtract( length, v_iteration, ONE_INTEGER ) : v_iteration );
                v_answer = Vectors.aref( vector_var, id );
                if( NIL == id_index.id_index_tombstone_p( v_answer ) || NIL == id_index.id_index_skip_tombstones_p( $kw389$SKIP ) )
                {
                  if( NIL != id_index.id_index_tombstone_p( v_answer ) )
                  {
                    v_answer = $kw389$SKIP;
                  }
                  cdolist_list_var = inference_answer_justifications( v_answer );
                  justification = NIL;
                  justification = cdolist_list_var.first();
                  while ( NIL != cdolist_list_var)
                  {
                    if( NIL != subl_promotions.memberP( proof, inference_answer_justification_proofs( justification ), Symbols.symbol_function( EQL ), UNPROVIDED ) )
                    {
                      destroy_inference_answer_justification( justification );
                    }
                    cdolist_list_var = cdolist_list_var.rest();
                    justification = cdolist_list_var.first();
                  }
                }
              }
            }
            idx_$35 = idx;
            if( NIL == id_index.id_index_sparse_objects_empty_p( idx_$35 ) )
            {
              cdohash_table = id_index.id_index_sparse_objects( idx_$35 );
              id2 = NIL;
              v_answer2 = NIL;
              cdohash_iterator = Hashtables.getEntrySetIterator( cdohash_table );
              try
              {
                while ( Hashtables.iteratorHasNext( cdohash_iterator ))
                {
                  cdohash_entry = Hashtables.iteratorNextEntry( cdohash_iterator );
                  id2 = Hashtables.getEntryKey( cdohash_entry );
                  v_answer2 = Hashtables.getEntryValue( cdohash_entry );
                  cdolist_list_var2 = inference_answer_justifications( v_answer2 );
                  justification2 = NIL;
                  justification2 = cdolist_list_var2.first();
                  while ( NIL != cdolist_list_var2)
                  {
                    if( NIL != subl_promotions.memberP( proof, inference_answer_justification_proofs( justification2 ), Symbols.symbol_function( EQL ), UNPROVIDED ) )
                    {
                      destroy_inference_answer_justification( justification2 );
                    }
                    cdolist_list_var2 = cdolist_list_var2.rest();
                    justification2 = cdolist_list_var2.first();
                  }
                }
              }
              finally
              {
                Hashtables.releaseEntrySetIterator( cdohash_iterator );
              }
            }
          }
        }
      }
    }
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-datastructures-inference.lisp", position = 122124L)
  public static SubLObject inference_time_per_answer(final SubLObject inference)
  {
    final SubLObject total_time = inference_cumulative_time( inference );
    final SubLObject answer_count = inference_answer_count( inference );
    SubLObject time_per_answer = NIL;
    if( total_time.isNumber() && NIL != subl_promotions.positive_integer_p( answer_count ) )
    {
      time_per_answer = Numbers.divide( total_time, answer_count );
    }
    return time_per_answer;
  }

  @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-datastructures-inference.lisp", position = 122503L)
  public static SubLObject inference_steps_per_answer(final SubLObject inference)
  {
    final SubLObject total_steps = inference_cumulative_step_count( inference );
    final SubLObject answer_count = inference_answer_count( inference );
    SubLObject steps_per_answer = NIL;
    if( total_steps.isNumber() && NIL != subl_promotions.positive_integer_p( answer_count ) )
    {
      steps_per_answer = Numbers.divide( total_steps, answer_count );
    }
    return steps_per_answer;
  }

  @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-datastructures-inference.lisp", position = 122874L)
  public static SubLObject inference_wasted_time_after_last_answer(final SubLObject inference)
  {
    final SubLObject total_time = inference_cumulative_time( inference );
    final SubLObject last_answer_time = inference_last_answer_elapsed_time( inference );
    final SubLObject wasted_time_after_last_answer = list_utilities.safe_difference( total_time, last_answer_time );
    return wasted_time_after_last_answer;
  }

  @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-datastructures-inference.lisp", position = 123196L)
  public static SubLObject inference_latency_improvement_from_iterativity(final SubLObject inference)
  {
    final SubLObject total_time = inference_cumulative_time( inference );
    final SubLObject first_answer_time = inference_first_answer_elapsed_time( inference );
    final SubLObject latency_improvement_from_iterativity = list_utilities.safe_difference( total_time, first_answer_time );
    return latency_improvement_from_iterativity;
  }

  @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-datastructures-inference.lisp", position = 123542L)
  public static SubLObject inference_metrics(final SubLObject inference)
  {
    final SubLObject template = inference_metrics_template( inference );
    final SubLObject metrics = list_utilities.tree_gather( template, Symbols.symbol_function( $sym529$INFERENCE_QUERY_METRIC_P ), UNPROVIDED, UNPROVIDED, UNPROVIDED );
    return inference_compute_metrics_plist( inference, metrics );
  }

  @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-datastructures-inference.lisp", position = 123876L)
  public static SubLObject inference_compute_metrics(final SubLObject inference)
  {
    final SubLObject template = inference_metrics_template( inference );
    final SubLObject metrics = list_utilities.tree_gather( template, Symbols.symbol_function( $sym529$INFERENCE_QUERY_METRIC_P ), UNPROVIDED, UNPROVIDED, UNPROVIDED );
    SubLObject v_answer = conses_high.copy_tree( template );
    final SubLObject metrics_bindings = inference_compute_metrics_alist( inference, metrics );
    v_answer = conses_high.nsublis( metrics_bindings, v_answer, Symbols.symbol_function( EQL ), UNPROVIDED );
    return v_answer;
  }

  @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-datastructures-inference.lisp", position = 124322L)
  public static SubLObject inference_compute_metrics_plist(final SubLObject inference, final SubLObject metrics)
  {
    SubLObject alist = inference_compute_metrics_alist( inference, metrics );
    alist = Sort.sort( alist, Symbols.symbol_function( $sym530$TERM__ ), Symbols.symbol_function( $sym531$CAR ) );
    return list_utilities.alist_to_plist( alist );
  }

  @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-datastructures-inference.lisp", position = 124724L)
  public static SubLObject inference_compute_metrics_alist(final SubLObject inference, final SubLObject metrics)
  {
    final SubLObject store = inference_problem_store( inference );
    SubLObject metrics_bindings = NIL;
    SubLObject answer_query_properties = NIL;
    SubLObject cdolist_list_var = metrics;
    SubLObject metric = NIL;
    metric = cdolist_list_var.first();
    while ( NIL != cdolist_list_var)
    {
      final SubLObject metric_object = inference_metrics.inference_metric_lookup( metric );
      if( NIL != metric_object )
      {
        final SubLObject result = inference_metrics.inference_metric_evaluate( metric_object, inference, store );
        metrics_bindings = ConsesLow.cons( ConsesLow.cons( metric, result ), metrics_bindings );
      }
      else
      {
        final SubLObject pcase_var = metric;
        if( !pcase_var.eql( $kw532$NEW_ROOT_TIMES ) )
        {
          if( !pcase_var.eql( $kw533$NEW_ROOT_COUNT ) )
          {
            if( pcase_var.eql( $kw534$PROBLEM_CREATION_TIMES ) )
            {
              final SubLObject problem_creation_times = leviathan.historical_problem_creation_times();
              metrics_bindings = ConsesLow.cons( ConsesLow.cons( $kw534$PROBLEM_CREATION_TIMES, problem_creation_times ), metrics_bindings );
            }
            else if( pcase_var.eql( $kw535$INFERENCE_ANSWER_QUERY_PROPERTIES ) )
            {
              if( NIL == answer_query_properties )
              {
                answer_query_properties = inference_parameters.inference_compute_inference_answer_query_properties( inference );
              }
              metrics_bindings = ConsesLow.cons( ConsesLow.cons( $kw535$INFERENCE_ANSWER_QUERY_PROPERTIES, answer_query_properties ), metrics_bindings );
            }
            else if( pcase_var.eql( $kw536$INFERENCE_STRONGEST_QUERY_PROPERTIES ) )
            {
              if( NIL == answer_query_properties )
              {
                answer_query_properties = inference_parameters.inference_compute_inference_answer_query_properties( inference );
              }
              if( NIL != answer_query_properties )
              {
                metrics_bindings = ConsesLow.cons( ConsesLow.cons( $kw536$INFERENCE_STRONGEST_QUERY_PROPERTIES, inference_parameters.compute_most_complete_query_properties( answer_query_properties ) ),
                    metrics_bindings );
              }
            }
            else if( pcase_var.eql( $kw537$INFERENCE_MOST_EFFICIENT_QUERY_PROPERTIES ) )
            {
              final SubLObject proof_query_properties = inference_parameters.inference_compute_proof_query_properties( inference );
              final SubLObject strengthened_properties = inference_parameters.compute_most_efficient_query_properties( proof_query_properties );
              metrics_bindings = ConsesLow.cons( ConsesLow.cons( $kw537$INFERENCE_MOST_EFFICIENT_QUERY_PROPERTIES, strengthened_properties ), metrics_bindings );
            }
            else if( pcase_var.eql( $kw538$INFERENCE_IDS ) )
            {
              metrics_bindings = ConsesLow.cons( ConsesLow.cons( $kw538$INFERENCE_IDS, ConsesLow.list( inference_datastructures_problem_store.problem_store_suid( store ), inference_suid( inference ) ) ),
                  metrics_bindings );
            }
            else
            {
              Errors.sublisp_break( $str539$time_to_implement_metric__S, new SubLObject[] { metric
              } );
            }
          }
        }
      }
      cdolist_list_var = cdolist_list_var.rest();
      metric = cdolist_list_var.first();
    }
    return metrics_bindings;
  }

  @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-datastructures-inference.lisp", position = 126844L)
  public static SubLObject inference_transformation_rules_in_answers(final SubLObject inference)
  {
    assert NIL != inference_p( inference ) : inference;
    SubLObject success_rules = set_contents.new_set_contents( ZERO_INTEGER, Symbols.symbol_function( EQL ) );
    final SubLObject idx = inference_answer_id_index( inference );
    if( NIL == id_index.id_index_objects_empty_p( idx, $kw389$SKIP ) )
    {
      final SubLObject idx_$36 = idx;
      if( NIL == id_index.id_index_dense_objects_empty_p( idx_$36, $kw389$SKIP ) )
      {
        final SubLObject vector_var = id_index.id_index_dense_objects( idx_$36 );
        final SubLObject backwardP_var = NIL;
        SubLObject length;
        SubLObject v_iteration;
        SubLObject id;
        SubLObject v_answer;
        SubLObject cdolist_list_var;
        SubLObject justification;
        SubLObject cdolist_list_var_$37;
        SubLObject rule;
        for( length = Sequences.length( vector_var ), v_iteration = NIL, v_iteration = ZERO_INTEGER; v_iteration.numL( length ); v_iteration = Numbers.add( v_iteration, ONE_INTEGER ) )
        {
          id = ( ( NIL != backwardP_var ) ? Numbers.subtract( length, v_iteration, ONE_INTEGER ) : v_iteration );
          v_answer = Vectors.aref( vector_var, id );
          if( NIL == id_index.id_index_tombstone_p( v_answer ) || NIL == id_index.id_index_skip_tombstones_p( $kw389$SKIP ) )
          {
            if( NIL != id_index.id_index_tombstone_p( v_answer ) )
            {
              v_answer = $kw389$SKIP;
            }
            cdolist_list_var = inference_answer_justifications( v_answer );
            justification = NIL;
            justification = cdolist_list_var.first();
            while ( NIL != cdolist_list_var)
            {
              cdolist_list_var_$37 = inference_answer_justification_supports( justification );
              rule = NIL;
              rule = cdolist_list_var_$37.first();
              while ( NIL != cdolist_list_var_$37)
              {
                if( NIL != assertions_high.rule_assertionP( rule ) )
                {
                  success_rules = set_contents.set_contents_add( rule, success_rules, Symbols.symbol_function( EQL ) );
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
      final SubLObject idx_$37 = idx;
      if( NIL == id_index.id_index_sparse_objects_empty_p( idx_$37 ) )
      {
        final SubLObject cdohash_table = id_index.id_index_sparse_objects( idx_$37 );
        SubLObject id2 = NIL;
        SubLObject v_answer2 = NIL;
        final Iterator cdohash_iterator = Hashtables.getEntrySetIterator( cdohash_table );
        try
        {
          while ( Hashtables.iteratorHasNext( cdohash_iterator ))
          {
            final Map.Entry cdohash_entry = Hashtables.iteratorNextEntry( cdohash_iterator );
            id2 = Hashtables.getEntryKey( cdohash_entry );
            v_answer2 = Hashtables.getEntryValue( cdohash_entry );
            SubLObject cdolist_list_var2 = inference_answer_justifications( v_answer2 );
            SubLObject justification2 = NIL;
            justification2 = cdolist_list_var2.first();
            while ( NIL != cdolist_list_var2)
            {
              SubLObject cdolist_list_var_$38 = inference_answer_justification_supports( justification2 );
              SubLObject rule2 = NIL;
              rule2 = cdolist_list_var_$38.first();
              while ( NIL != cdolist_list_var_$38)
              {
                if( NIL != assertions_high.rule_assertionP( rule2 ) )
                {
                  success_rules = set_contents.set_contents_add( rule2, success_rules, Symbols.symbol_function( EQL ) );
                }
                cdolist_list_var_$38 = cdolist_list_var_$38.rest();
                rule2 = cdolist_list_var_$38.first();
              }
              cdolist_list_var2 = cdolist_list_var2.rest();
              justification2 = cdolist_list_var2.first();
            }
          }
        }
        finally
        {
          Hashtables.releaseEntrySetIterator( cdohash_iterator );
        }
      }
    }
    return set_contents.set_contents_element_list( success_rules );
  }

  @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-datastructures-inference.lisp", position = 127442L)
  public static SubLObject inference_all_answer_proofs(final SubLObject inference)
  {
    if( NIL != inference_has_some_answerP( inference ) )
    {
      final SubLObject answer_proofs = set.new_set( Symbols.symbol_function( EQL ), UNPROVIDED );
      final SubLObject idx = inference_answer_id_index( inference );
      if( NIL == id_index.id_index_objects_empty_p( idx, $kw389$SKIP ) )
      {
        final SubLObject idx_$40 = idx;
        if( NIL == id_index.id_index_dense_objects_empty_p( idx_$40, $kw389$SKIP ) )
        {
          final SubLObject vector_var = id_index.id_index_dense_objects( idx_$40 );
          final SubLObject backwardP_var = NIL;
          SubLObject length;
          SubLObject v_iteration;
          SubLObject id;
          SubLObject v_answer;
          SubLObject cdolist_list_var;
          SubLObject justification;
          SubLObject cdolist_list_var_$41;
          SubLObject proof;
          for( length = Sequences.length( vector_var ), v_iteration = NIL, v_iteration = ZERO_INTEGER; v_iteration.numL( length ); v_iteration = Numbers.add( v_iteration, ONE_INTEGER ) )
          {
            id = ( ( NIL != backwardP_var ) ? Numbers.subtract( length, v_iteration, ONE_INTEGER ) : v_iteration );
            v_answer = Vectors.aref( vector_var, id );
            if( NIL == id_index.id_index_tombstone_p( v_answer ) || NIL == id_index.id_index_skip_tombstones_p( $kw389$SKIP ) )
            {
              if( NIL != id_index.id_index_tombstone_p( v_answer ) )
              {
                v_answer = $kw389$SKIP;
              }
              cdolist_list_var = inference_answer_justifications( v_answer );
              justification = NIL;
              justification = cdolist_list_var.first();
              while ( NIL != cdolist_list_var)
              {
                cdolist_list_var_$41 = inference_answer_justification_proofs( justification );
                proof = NIL;
                proof = cdolist_list_var_$41.first();
                while ( NIL != cdolist_list_var_$41)
                {
                  set.set_add( proof, answer_proofs );
                  cdolist_list_var_$41 = cdolist_list_var_$41.rest();
                  proof = cdolist_list_var_$41.first();
                }
                cdolist_list_var = cdolist_list_var.rest();
                justification = cdolist_list_var.first();
              }
            }
          }
        }
        final SubLObject idx_$41 = idx;
        if( NIL == id_index.id_index_sparse_objects_empty_p( idx_$41 ) )
        {
          final SubLObject cdohash_table = id_index.id_index_sparse_objects( idx_$41 );
          SubLObject id2 = NIL;
          SubLObject v_answer2 = NIL;
          final Iterator cdohash_iterator = Hashtables.getEntrySetIterator( cdohash_table );
          try
          {
            while ( Hashtables.iteratorHasNext( cdohash_iterator ))
            {
              final Map.Entry cdohash_entry = Hashtables.iteratorNextEntry( cdohash_iterator );
              id2 = Hashtables.getEntryKey( cdohash_entry );
              v_answer2 = Hashtables.getEntryValue( cdohash_entry );
              SubLObject cdolist_list_var2 = inference_answer_justifications( v_answer2 );
              SubLObject justification2 = NIL;
              justification2 = cdolist_list_var2.first();
              while ( NIL != cdolist_list_var2)
              {
                SubLObject cdolist_list_var_$42 = inference_answer_justification_proofs( justification2 );
                SubLObject proof2 = NIL;
                proof2 = cdolist_list_var_$42.first();
                while ( NIL != cdolist_list_var_$42)
                {
                  set.set_add( proof2, answer_proofs );
                  cdolist_list_var_$42 = cdolist_list_var_$42.rest();
                  proof2 = cdolist_list_var_$42.first();
                }
                cdolist_list_var2 = cdolist_list_var2.rest();
                justification2 = cdolist_list_var2.first();
              }
            }
          }
          finally
          {
            Hashtables.releaseEntrySetIterator( cdohash_iterator );
          }
        }
      }
      return Sort.sort( set.set_element_list( answer_proofs ), Symbols.symbol_function( $sym419$_ ), Symbols.symbol_function( $sym540$PROOF_SUID ) );
    }
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-datastructures-inference.lisp", position = 127877L)
  public static SubLObject inference_all_answer_subproofs(final SubLObject inference)
  {
    if( NIL != inference_has_some_answerP( inference ) )
    {
      SubLObject answer_subproofs = set_contents.new_set_contents( ZERO_INTEGER, Symbols.symbol_function( EQL ) );
      final SubLObject idx = inference_answer_id_index( inference );
      if( NIL == id_index.id_index_objects_empty_p( idx, $kw389$SKIP ) )
      {
        final SubLObject idx_$44 = idx;
        if( NIL == id_index.id_index_dense_objects_empty_p( idx_$44, $kw389$SKIP ) )
        {
          final SubLObject vector_var = id_index.id_index_dense_objects( idx_$44 );
          final SubLObject backwardP_var = NIL;
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
          for( length = Sequences.length( vector_var ), v_iteration = NIL, v_iteration = ZERO_INTEGER; v_iteration.numL( length ); v_iteration = Numbers.add( v_iteration, ONE_INTEGER ) )
          {
            id = ( ( NIL != backwardP_var ) ? Numbers.subtract( length, v_iteration, ONE_INTEGER ) : v_iteration );
            v_answer = Vectors.aref( vector_var, id );
            if( NIL == id_index.id_index_tombstone_p( v_answer ) || NIL == id_index.id_index_skip_tombstones_p( $kw389$SKIP ) )
            {
              if( NIL != id_index.id_index_tombstone_p( v_answer ) )
              {
                v_answer = $kw389$SKIP;
              }
              cdolist_list_var = inference_answer_justifications( v_answer );
              justification = NIL;
              justification = cdolist_list_var.first();
              while ( NIL != cdolist_list_var)
              {
                cdolist_list_var_$45 = inference_answer_justification_proofs( justification );
                proof = NIL;
                proof = cdolist_list_var_$45.first();
                while ( NIL != cdolist_list_var_$45)
                {
                  cdolist_list_var_$46 = inference_datastructures_proof.all_proof_subproofs( proof );
                  subproof = NIL;
                  subproof = cdolist_list_var_$46.first();
                  while ( NIL != cdolist_list_var_$46)
                  {
                    answer_subproofs = set_contents.set_contents_add( subproof, answer_subproofs, Symbols.symbol_function( EQL ) );
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
        final SubLObject idx_$45 = idx;
        if( NIL == id_index.id_index_sparse_objects_empty_p( idx_$45 ) )
        {
          final SubLObject cdohash_table = id_index.id_index_sparse_objects( idx_$45 );
          SubLObject id2 = NIL;
          SubLObject v_answer2 = NIL;
          final Iterator cdohash_iterator = Hashtables.getEntrySetIterator( cdohash_table );
          try
          {
            while ( Hashtables.iteratorHasNext( cdohash_iterator ))
            {
              final Map.Entry cdohash_entry = Hashtables.iteratorNextEntry( cdohash_iterator );
              id2 = Hashtables.getEntryKey( cdohash_entry );
              v_answer2 = Hashtables.getEntryValue( cdohash_entry );
              SubLObject cdolist_list_var2 = inference_answer_justifications( v_answer2 );
              SubLObject justification2 = NIL;
              justification2 = cdolist_list_var2.first();
              while ( NIL != cdolist_list_var2)
              {
                SubLObject cdolist_list_var_$47 = inference_answer_justification_proofs( justification2 );
                SubLObject proof2 = NIL;
                proof2 = cdolist_list_var_$47.first();
                while ( NIL != cdolist_list_var_$47)
                {
                  SubLObject cdolist_list_var_$48 = inference_datastructures_proof.all_proof_subproofs( proof2 );
                  SubLObject subproof2 = NIL;
                  subproof2 = cdolist_list_var_$48.first();
                  while ( NIL != cdolist_list_var_$48)
                  {
                    answer_subproofs = set_contents.set_contents_add( subproof2, answer_subproofs, Symbols.symbol_function( EQL ) );
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
          }
          finally
          {
            Hashtables.releaseEntrySetIterator( cdohash_iterator );
          }
        }
      }
      return Sort.sort( set_contents.set_contents_element_list( answer_subproofs ), Symbols.symbol_function( $sym419$_ ), Symbols.symbol_function( $sym540$PROOF_SUID ) );
    }
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-datastructures-inference.lisp", position = 128526L)
  public static SubLObject inference_answer_justification_all_subproofs(final SubLObject answer_justification)
  {
    SubLObject answer_subproofs = set_contents.new_set_contents( ZERO_INTEGER, Symbols.symbol_function( EQL ) );
    SubLObject cdolist_list_var = inference_answer_justification_proofs( answer_justification );
    SubLObject proof = NIL;
    proof = cdolist_list_var.first();
    while ( NIL != cdolist_list_var)
    {
      SubLObject cdolist_list_var_$50 = inference_datastructures_proof.all_proof_subproofs( proof );
      SubLObject subproof = NIL;
      subproof = cdolist_list_var_$50.first();
      while ( NIL != cdolist_list_var_$50)
      {
        answer_subproofs = set_contents.set_contents_add( subproof, answer_subproofs, Symbols.symbol_function( EQL ) );
        cdolist_list_var_$50 = cdolist_list_var_$50.rest();
        subproof = cdolist_list_var_$50.first();
      }
      cdolist_list_var = cdolist_list_var.rest();
      proof = cdolist_list_var.first();
    }
    return Sort.sort( set_contents.set_contents_element_list( answer_subproofs ), Symbols.symbol_function( $sym419$_ ), Symbols.symbol_function( $sym540$PROOF_SUID ) );
  }

  @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-datastructures-inference.lisp", position = 129052L)
  public static SubLObject inference_all_answer_supports(final SubLObject inference)
  {
    if( NIL != inference_has_some_answerP( inference ) )
    {
      SubLObject supports = set_contents.new_set_contents( ZERO_INTEGER, Symbols.symbol_function( EQUAL ) );
      final SubLObject idx = inference_answer_id_index( inference );
      if( NIL == id_index.id_index_objects_empty_p( idx, $kw389$SKIP ) )
      {
        final SubLObject idx_$51 = idx;
        if( NIL == id_index.id_index_dense_objects_empty_p( idx_$51, $kw389$SKIP ) )
        {
          final SubLObject vector_var = id_index.id_index_dense_objects( idx_$51 );
          final SubLObject backwardP_var = NIL;
          SubLObject length;
          SubLObject v_iteration;
          SubLObject id;
          SubLObject v_answer;
          SubLObject cdolist_list_var;
          SubLObject justification;
          SubLObject cdolist_list_var_$52;
          SubLObject support;
          for( length = Sequences.length( vector_var ), v_iteration = NIL, v_iteration = ZERO_INTEGER; v_iteration.numL( length ); v_iteration = Numbers.add( v_iteration, ONE_INTEGER ) )
          {
            id = ( ( NIL != backwardP_var ) ? Numbers.subtract( length, v_iteration, ONE_INTEGER ) : v_iteration );
            v_answer = Vectors.aref( vector_var, id );
            if( NIL == id_index.id_index_tombstone_p( v_answer ) || NIL == id_index.id_index_skip_tombstones_p( $kw389$SKIP ) )
            {
              if( NIL != id_index.id_index_tombstone_p( v_answer ) )
              {
                v_answer = $kw389$SKIP;
              }
              cdolist_list_var = inference_answer_justifications( v_answer );
              justification = NIL;
              justification = cdolist_list_var.first();
              while ( NIL != cdolist_list_var)
              {
                cdolist_list_var_$52 = inference_answer_justification_supports( justification );
                support = NIL;
                support = cdolist_list_var_$52.first();
                while ( NIL != cdolist_list_var_$52)
                {
                  supports = set_contents.set_contents_add( support, supports, Symbols.symbol_function( EQUAL ) );
                  cdolist_list_var_$52 = cdolist_list_var_$52.rest();
                  support = cdolist_list_var_$52.first();
                }
                cdolist_list_var = cdolist_list_var.rest();
                justification = cdolist_list_var.first();
              }
            }
          }
        }
        final SubLObject idx_$52 = idx;
        if( NIL == id_index.id_index_sparse_objects_empty_p( idx_$52 ) )
        {
          final SubLObject cdohash_table = id_index.id_index_sparse_objects( idx_$52 );
          SubLObject id2 = NIL;
          SubLObject v_answer2 = NIL;
          final Iterator cdohash_iterator = Hashtables.getEntrySetIterator( cdohash_table );
          try
          {
            while ( Hashtables.iteratorHasNext( cdohash_iterator ))
            {
              final Map.Entry cdohash_entry = Hashtables.iteratorNextEntry( cdohash_iterator );
              id2 = Hashtables.getEntryKey( cdohash_entry );
              v_answer2 = Hashtables.getEntryValue( cdohash_entry );
              SubLObject cdolist_list_var2 = inference_answer_justifications( v_answer2 );
              SubLObject justification2 = NIL;
              justification2 = cdolist_list_var2.first();
              while ( NIL != cdolist_list_var2)
              {
                SubLObject cdolist_list_var_$53 = inference_answer_justification_supports( justification2 );
                SubLObject support2 = NIL;
                support2 = cdolist_list_var_$53.first();
                while ( NIL != cdolist_list_var_$53)
                {
                  supports = set_contents.set_contents_add( support2, supports, Symbols.symbol_function( EQUAL ) );
                  cdolist_list_var_$53 = cdolist_list_var_$53.rest();
                  support2 = cdolist_list_var_$53.first();
                }
                cdolist_list_var2 = cdolist_list_var2.rest();
                justification2 = cdolist_list_var2.first();
              }
            }
          }
          finally
          {
            Hashtables.releaseEntrySetIterator( cdohash_iterator );
          }
        }
      }
      return arguments.sort_supports( set_contents.set_contents_element_list( supports ) );
    }
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-datastructures-inference.lisp", position = 129621L)
  public static SubLObject inference_all_answer_modules(final SubLObject inference)
  {
    final SubLObject answer_subproofs = inference_all_answer_subproofs( inference );
    if( NIL != answer_subproofs )
    {
      final SubLObject module_counts = dictionary.new_dictionary( Symbols.symbol_function( EQL ), UNPROVIDED );
      SubLObject cdolist_list_var = answer_subproofs;
      SubLObject proof = NIL;
      proof = cdolist_list_var.first();
      while ( NIL != cdolist_list_var)
      {
        SubLObject module_name = NIL;
        if( NIL != inference_worker.content_proof_p( proof ) )
        {
          final SubLObject hl_module = inference_worker.content_proof_hl_module( proof );
          module_name = inference_modules.hl_module_name( hl_module );
        }
        else if( NIL != inference_worker.logical_proof_p( proof ) )
        {
          module_name = inference_worker.structural_proof_type( proof );
        }
        if( NIL != module_name )
        {
          dictionary_utilities.dictionary_increment( module_counts, module_name, UNPROVIDED );
        }
        cdolist_list_var = cdolist_list_var.rest();
        proof = cdolist_list_var.first();
      }
      return Sort.sort( dictionary_utilities.dictionary_to_alist( module_counts ), Symbols.symbol_function( $sym541$_ ), Symbols.symbol_function( $sym542$CDR ) );
    }
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-datastructures-inference.lisp", position = 130282L)
  public static SubLObject problem_relevant_to_some_strategyP(final SubLObject problem)
  {
    return list_utilities.sublisp_boolean( first_problem_relevant_strategy( problem ) );
  }

  @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-datastructures-inference.lisp", position = 130540L)
  public static SubLObject first_problem_relevant_strategy(final SubLObject problem)
  {
    final SubLObject store = inference_datastructures_problem.problem_store( problem );
    final SubLObject idx = inference_datastructures_problem_store.problem_store_inference_id_index( store );
    if( NIL == id_index.id_index_objects_empty_p( idx, $kw389$SKIP ) )
    {
      final SubLObject idx_$55 = idx;
      if( NIL == id_index.id_index_dense_objects_empty_p( idx_$55, $kw389$SKIP ) )
      {
        final SubLObject vector_var = id_index.id_index_dense_objects( idx_$55 );
        final SubLObject backwardP_var = NIL;
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
        for( length = Sequences.length( vector_var ), v_iteration = NIL, v_iteration = ZERO_INTEGER; v_iteration.numL( length ); v_iteration = Numbers.add( v_iteration, ONE_INTEGER ) )
        {
          id = ( ( NIL != backwardP_var ) ? Numbers.subtract( length, v_iteration, ONE_INTEGER ) : v_iteration );
          inference = Vectors.aref( vector_var, id );
          if( NIL == id_index.id_index_tombstone_p( inference ) || NIL == id_index.id_index_skip_tombstones_p( $kw389$SKIP ) )
          {
            if( NIL != id_index.id_index_tombstone_p( inference ) )
            {
              inference = $kw389$SKIP;
            }
            if( NIL != inference_datastructures_problem.problem_relevant_to_inferenceP( problem, inference ) )
            {
              inference_var = inference;
              set_var = inference_strategy_set( inference_var );
              set_contents_var = set.do_set_internal( set_var );
              for( basis_object = set_contents.do_set_contents_basis_object( set_contents_var ), state = NIL, state = set_contents.do_set_contents_initial_state( basis_object, set_contents_var ); NIL == set_contents
                  .do_set_contents_doneP( basis_object, state ); state = set_contents.do_set_contents_update_state( state ) )
              {
                strategy = set_contents.do_set_contents_next( basis_object, state );
                if( NIL != set_contents.do_set_contents_element_validP( state, strategy ) )
                {
                  return strategy;
                }
              }
            }
          }
        }
      }
      final SubLObject idx_$56 = idx;
      if( NIL == id_index.id_index_sparse_objects_empty_p( idx_$56 ) )
      {
        final SubLObject cdohash_table = id_index.id_index_sparse_objects( idx_$56 );
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
            if( NIL != inference_datastructures_problem.problem_relevant_to_inferenceP( problem, inference2 ) )
            {
              final SubLObject inference_var2 = inference2;
              final SubLObject set_var2 = inference_strategy_set( inference_var2 );
              final SubLObject set_contents_var2 = set.do_set_internal( set_var2 );
              SubLObject basis_object2;
              SubLObject state2;
              SubLObject strategy2;
              for( basis_object2 = set_contents.do_set_contents_basis_object( set_contents_var2 ), state2 = NIL, state2 = set_contents.do_set_contents_initial_state( basis_object2,
                  set_contents_var2 ); NIL == set_contents.do_set_contents_doneP( basis_object2, state2 ); state2 = set_contents.do_set_contents_update_state( state2 ) )
              {
                strategy2 = set_contents.do_set_contents_next( basis_object2, state2 );
                if( NIL != set_contents.do_set_contents_element_validP( state2, strategy2 ) )
                {
                  return strategy2;
                }
              }
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

  @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-datastructures-inference.lisp", position = 130675L)
  public static SubLObject problem_or_inference_p(final SubLObject v_object)
  {
    return makeBoolean( NIL != inference_datastructures_problem.problem_p( v_object ) || NIL != inference_p( v_object ) );
  }

  @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-datastructures-inference.lisp", position = 130817L)
  public static SubLObject with_inference_problem_working_time_table(final SubLObject macroform, final SubLObject environment)
  {
    SubLObject current;
    final SubLObject datum = current = macroform.rest();
    cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list543 );
    final SubLObject temp = current.rest();
    current = current.first();
    SubLObject table_var = NIL;
    SubLObject inference = NIL;
    cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list543 );
    table_var = current.first();
    current = current.rest();
    cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list543 );
    inference = current.first();
    current = current.rest();
    if( NIL == current )
    {
      final SubLObject body;
      current = ( body = temp );
      final SubLObject inference_var = $sym544$INFERENCE_VAR;
      return ConsesLow.list( $sym301$CLET, ConsesLow.list( ConsesLow.list( inference_var, inference ) ), ConsesLow.list( $sym545$WITH_INFERENCE_PROBLEM_WORKING_TIME_LOCK, ConsesLow.list( inference_var ), ConsesLow.listS(
          $sym301$CLET, ConsesLow.list( ConsesLow.list( table_var, ConsesLow.list( $sym546$INFERENCE_PROBLEM_WORKING_TIME_TABLE, inference_var ) ) ), ConsesLow.append( body, NIL ) ) ) );
    }
    cdestructuring_bind.cdestructuring_bind_error( datum, $list543 );
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-datastructures-inference.lisp", position = 131244L)
  public static SubLObject inference_problem_working_time_lock(final SubLObject inference)
  {
    final SubLObject data = inference_problem_working_time_data( inference );
    return data.first();
  }

  @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-datastructures-inference.lisp", position = 131456L)
  public static SubLObject inference_problem_working_time_table(final SubLObject inference)
  {
    final SubLObject data = inference_problem_working_time_data( inference );
    return conses_high.second( data );
  }

  @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-datastructures-inference.lisp", position = 131665L)
  public static SubLObject initialize_inference_problem_working_time_data(final SubLObject inference)
  {
    final SubLObject lock = Locks.make_lock( $str547$Inference_problem_working_time_lo );
    final SubLObject table = Hashtables.make_hash_table( $int11$24, UNPROVIDED, UNPROVIDED );
    final SubLObject data = ConsesLow.list( lock, table );
    set_inference_problem_working_time_data( inference, data );
    return data;
  }

  @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-datastructures-inference.lisp", position = 131944L)
  public static SubLObject inference_note_tactic_executed(final SubLObject inference, final SubLObject tactic)
  {
    SubLObject result = NIL;
    if( NIL != inference_maintain_term_working_setP( inference ) )
    {
      final SubLObject problem = inference_datastructures_tactic.tactic_problem( tactic );
      final SubLObject now = Time.get_internal_real_time();
      final SubLObject lock = inference_problem_working_time_lock( inference );
      SubLObject release = NIL;
      try
      {
        release = Locks.seize_lock( lock );
        final SubLObject table = inference_problem_working_time_table( inference );
        final SubLObject already_being_worked_on = Hashtables.gethash_without_values( problem, table, UNPROVIDED );
        if( NIL == already_being_worked_on )
        {
          Hashtables.sethash( problem, table, now );
          result = T;
        }
      }
      finally
      {
        if( NIL != release )
        {
          Locks.release_lock( lock );
        }
      }
    }
    return result;
  }

  @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-datastructures-inference.lisp", position = 132434L)
  public static SubLObject inference_note_problem_pending(final SubLObject inference, final SubLObject problem)
  {
    SubLObject result = NIL;
    if( NIL != inference_maintain_term_working_setP( inference ) )
    {
      final SubLObject lock = inference_problem_working_time_lock( inference );
      SubLObject release = NIL;
      try
      {
        release = Locks.seize_lock( lock );
        final SubLObject table = inference_problem_working_time_table( inference );
        Hashtables.remhash( problem, table );
        result = T;
      }
      finally
      {
        if( NIL != release )
        {
          Locks.release_lock( lock );
        }
      }
    }
    return result;
  }

  @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-datastructures-inference.lisp", position = 132712L)
  public static SubLObject signal_inference_eventP(final SubLObject inference, final SubLObject event_type)
  {
    assert NIL != inference_p( inference ) : inference;
    assert NIL != inference_datastructures_enumerated_types.inference_event_type_p( event_type ) : event_type;
    return list_utilities.member_eqP( event_type, inference_events( inference ) );
  }

  @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-datastructures-inference.lisp", position = 132985L)
  public static SubLObject possibly_signal_new_inference_answer(final SubLObject inference, final SubLObject new_answer)
  {
    if( NIL != signal_inference_eventP( inference, $kw548$NEW_ANSWER ) )
    {
      return signal_new_inference_answer( inference, new_answer );
    }
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-datastructures-inference.lisp", position = 133287L)
  public static SubLObject signal_new_inference_answer(final SubLObject inference, final SubLObject new_answer)
  {
    final SubLObject store_id = inference_datastructures_problem_store.problem_store_suid( inference_problem_store( inference ) );
    final SubLObject inference_id = inference_suid( inference );
    final SubLObject new_answer_id = inference_answer_suid( new_answer );
    return inference_event.post_inference_new_answer_event( store_id, inference_id, new_answer_id );
  }

  @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-datastructures-inference.lisp", position = 133655L)
  public static SubLObject possibly_signal_inference_status_change(final SubLObject inference)
  {
    if( NIL != signal_inference_eventP( inference, $kw549$STATUS_CHANGE ) )
    {
      return signal_inference_status_change( inference, inference_status( inference ) );
    }
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-datastructures-inference.lisp", position = 133967L)
  public static SubLObject signal_inference_status_change(final SubLObject inference, final SubLObject new_status)
  {
    final SubLObject store_id = inference_datastructures_problem_store.problem_store_suid( inference_problem_store( inference ) );
    final SubLObject inference_id = inference_suid( inference );
    return inference_event.post_inference_status_change_event( store_id, inference_id, new_status );
  }

  @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-datastructures-inference.lisp", position = 134283L)
  public static SubLObject possibly_signal_inference_new_transformation_depth_reached(final SubLObject inference, final SubLObject new_depth)
  {
    if( NIL != signal_inference_eventP( inference, $kw550$NEW_TRANSFORMATION_DEPTH_REACHED ) )
    {
      return signal_inference_new_transformation_depth_reached( inference, new_depth );
    }
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-datastructures-inference.lisp", position = 134625L)
  public static SubLObject signal_inference_new_transformation_depth_reached(final SubLObject inference, final SubLObject new_depth)
  {
    final SubLObject store_id = inference_datastructures_problem_store.problem_store_suid( inference_problem_store( inference ) );
    final SubLObject inference_id = inference_suid( inference );
    return inference_event.post_inference_new_transformation_depth_reached_event( store_id, inference_id, new_depth );
  }

  @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-datastructures-inference.lisp", position = 134977L)
  public static SubLObject inference_within_sksi_query_execution(final SubLObject macroform, final SubLObject environment)
  {
    final SubLObject datum = macroform.rest();
    final SubLObject body;
    final SubLObject current = body = datum;
    final SubLObject inferences_var = $sym551$INFERENCES_VAR;
    final SubLObject inference_var = $sym552$INFERENCE_VAR;
    final SubLObject tactic_var = $sym553$TACTIC_VAR;
    final SubLObject start_time = $sym554$START_TIME;
    return ConsesLow.list( $sym301$CLET, ConsesLow.list( reader.bq_cons( inferences_var, $list555 ), reader.bq_cons( inference_var, $list556 ), reader.bq_cons( tactic_var, $list557 ), start_time ), ConsesLow.list(
        $sym558$CUNWIND_PROTECT, ConsesLow.listS( $sym559$PROGN, ConsesLow.list( $sym560$POSSIBLY_SIGNAL_SKSI_QUERY_START, inference_var, tactic_var ), ConsesLow.list( $sym321$CSETQ, start_time, ConsesLow.listS(
            $sym561$INFERENCE_TIME_SO_FAR, inference_var, $list562 ) ), ConsesLow.list( $sym563$POSSIBLY_ADD_INFERENCE_SKSI_QUERY_START_TIME, inferences_var, start_time ), ConsesLow.append( body, NIL ) ), ConsesLow.list(
                $sym564$POSSIBLY_SIGNAL_SKSI_QUERY_END, inference_var, tactic_var ), ConsesLow.list( $sym565$POSSIBLY_INCREMENT_INFERENCE_SKSI_QUERY_TOTAL_TIME, inferences_var, ConsesLow.list( $sym566$_, ConsesLow.listS(
                    $sym561$INFERENCE_TIME_SO_FAR, inference_var, $list562 ), start_time ) ) ) );
  }

  @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-datastructures-inference.lisp", position = 135785L)
  public static SubLObject possibly_signal_sksi_query_start(final SubLObject inference, final SubLObject tactic)
  {
    if( NIL != inference && NIL != tactic )
    {
      final SubLObject start_time = inference_time_so_far( inference, NIL );
      final SubLObject v_properties = ConsesLow.list( $kw568$START_TIME, start_time );
      return possibly_signal_sksi_query( inference, tactic, $kw569$START, v_properties );
    }
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-datastructures-inference.lisp", position = 136145L)
  public static SubLObject possibly_signal_sksi_query_end(final SubLObject inference, final SubLObject tactic)
  {
    if( NIL != inference && NIL != tactic )
    {
      final SubLObject end_time = inference_time_so_far( inference, NIL );
      final SubLObject v_properties = ConsesLow.list( $kw570$END_TIME, end_time );
      return possibly_signal_sksi_query( inference, tactic, $kw279$END, v_properties );
    }
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-datastructures-inference.lisp", position = 136477L)
  public static SubLObject possibly_increment_inference_sksi_query_total_time(final SubLObject inferences, final SubLObject elapsed_seconds)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    if( NIL != inferences && NIL != elapsed_seconds )
    {
      if( NIL != sksi_infrastructure_macros.sksi_profiling_onP() )
      {
        sksi_infrastructure_macros.$sksi_sql_query_time$.setDynamicValue( Numbers.add( sksi_infrastructure_macros.$sksi_sql_query_time$.getDynamicValue( thread ), elapsed_seconds ), thread );
        sksi_infrastructure_macros.$sksi_sql_query_count$.setDynamicValue( Numbers.add( sksi_infrastructure_macros.$sksi_sql_query_count$.getDynamicValue( thread ), ONE_INTEGER ), thread );
      }
      SubLObject cdolist_list_var = inferences;
      SubLObject inference = NIL;
      inference = cdolist_list_var.first();
      while ( NIL != cdolist_list_var)
      {
        if( NIL != inference_computes_metricP( inference, $kw571$SKSI_QUERY_TOTAL_TIME ) )
        {
          return increment_inference_sksi_query_total_time( inference, elapsed_seconds );
        }
        cdolist_list_var = cdolist_list_var.rest();
        inference = cdolist_list_var.first();
      }
    }
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-datastructures-inference.lisp", position = 137005L)
  public static SubLObject possibly_add_inference_sksi_query_start_time(final SubLObject inferences, final SubLObject elapsed_seconds)
  {
    if( NIL != inferences && NIL != elapsed_seconds )
    {
      if( NIL != sksi_infrastructure_macros.sksi_profiling_onP() )
      {
      }
      SubLObject cdolist_list_var = inferences;
      SubLObject inference = NIL;
      inference = cdolist_list_var.first();
      while ( NIL != cdolist_list_var)
      {
        if( NIL != inference_computes_metricP( inference, $kw572$SKSI_QUERY_START_TIMES ) )
        {
          return add_inference_sksi_query_start_time( inference, elapsed_seconds );
        }
        cdolist_list_var = cdolist_list_var.rest();
        inference = cdolist_list_var.first();
      }
    }
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-datastructures-inference.lisp", position = 137497L)
  public static SubLObject possibly_signal_sksi_query(final SubLObject inference, final SubLObject tactic, final SubLObject status, SubLObject v_properties)
  {
    if( v_properties == UNPROVIDED )
    {
      v_properties = NIL;
    }
    if( NIL != signal_inference_eventP( inference, $kw573$SKSI_QUERY ) )
    {
      return signal_sksi_query( inference, tactic, status, v_properties );
    }
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-datastructures-inference.lisp", position = 137775L)
  public static SubLObject signal_sksi_query(final SubLObject inference, final SubLObject tactic, final SubLObject status, SubLObject v_properties)
  {
    if( v_properties == UNPROVIDED )
    {
      v_properties = NIL;
    }
    final SubLObject problem = inference_datastructures_tactic.tactic_problem( tactic );
    final SubLObject store = inference_datastructures_problem.problem_store( problem );
    final SubLObject store_id = inference_datastructures_problem_store.problem_store_suid( store );
    final SubLObject inference_id = inference_suid( inference );
    final SubLObject problem_id = inference_datastructures_problem.problem_suid( problem );
    final SubLObject tactic_id = inference_datastructures_tactic.tactic_suid( tactic );
    return inference_event.post_sksi_query_event( store_id, inference_id, problem_id, tactic_id, status, v_properties );
  }

  @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-datastructures-inference.lisp", position = 138263L)
  public static SubLObject inference_within_sparql_query_execution(final SubLObject macroform, final SubLObject environment)
  {
    SubLObject current;
    final SubLObject datum = current = macroform.rest();
    cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list574 );
    final SubLObject temp = current.rest();
    current = current.first();
    SubLObject allow_other_keys_p = NIL;
    SubLObject rest = current;
    SubLObject bad = NIL;
    SubLObject current_$57 = NIL;
    while ( NIL != rest)
    {
      cdestructuring_bind.destructuring_bind_must_consp( rest, datum, $list574 );
      current_$57 = rest.first();
      rest = rest.rest();
      cdestructuring_bind.destructuring_bind_must_consp( rest, datum, $list574 );
      if( NIL == conses_high.member( current_$57, $list575, UNPROVIDED, UNPROVIDED ) )
      {
        bad = T;
      }
      if( current_$57 == $kw310$ALLOW_OTHER_KEYS )
      {
        allow_other_keys_p = rest.first();
      }
      rest = rest.rest();
    }
    if( NIL != bad && NIL == allow_other_keys_p )
    {
      cdestructuring_bind.cdestructuring_bind_error( datum, $list574 );
    }
    final SubLObject sparql_tail = cdestructuring_bind.property_list_member( $kw576$SPARQL, current );
    final SubLObject sparql = ( NIL != sparql_tail ) ? conses_high.cadr( sparql_tail ) : NIL;
    final SubLObject result_set_tail = cdestructuring_bind.property_list_member( $kw577$RESULT_SET, current );
    final SubLObject result_set = ( NIL != result_set_tail ) ? conses_high.cadr( result_set_tail ) : NIL;
    final SubLObject body;
    current = ( body = temp );
    final SubLObject inferences = $sym578$INFERENCES;
    final SubLObject inference = $sym579$INFERENCE;
    final SubLObject start = $sym580$START;
    final SubLObject end = $sym581$END;
    final SubLObject count = $sym582$COUNT;
    return ConsesLow.list( $sym301$CLET, ConsesLow.list( reader.bq_cons( inferences, $list555 ), ConsesLow.list( inference, ConsesLow.list( $sym583$LAST_ONE, inferences ) ), start, end, count ), ConsesLow.list(
        $sym558$CUNWIND_PROTECT, ConsesLow.listS( $sym559$PROGN, ConsesLow.list( $sym321$CSETQ, start, ConsesLow.list( $sym584$FWHEN, inference, ConsesLow.listS( $sym585$INFERENCE_CUMULATIVE_TIME_SO_FAR, inference,
            $list562 ) ) ), ConsesLow.append( body, NIL ) ), ConsesLow.list( $sym321$CSETQ, end, ConsesLow.list( $sym584$FWHEN, inference, ConsesLow.listS( $sym585$INFERENCE_CUMULATIVE_TIME_SO_FAR, inference,
                $list562 ) ) ), ConsesLow.list( $sym321$CSETQ, count, ConsesLow.list( $sym586$LENGTH, result_set ) ), ConsesLow.list( $sym587$POSSIBLY_ADD_INFERENCE_SPARQL_QUERY_PROFILE, inferences, start, end,
                    count ) ) );
  }

  @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-datastructures-inference.lisp", position = 138990L)
  public static SubLObject possibly_add_inference_sparql_query_profile(final SubLObject inferences, final SubLObject start, final SubLObject end, final SubLObject count)
  {
    if( NIL != inferences && NIL != start && NIL != end && NIL != count )
    {
      SubLObject cdolist_list_var = inferences;
      SubLObject inference = NIL;
      inference = cdolist_list_var.first();
      while ( NIL != cdolist_list_var)
      {
        if( NIL != inference_computes_metricP( inference, $kw589$SPARQL_QUERY_PROFILE ) )
        {
          final SubLObject profile = ConsesLow.list( start, end, count );
          return add_inference_sparql_query_profile( inference, profile );
        }
        cdolist_list_var = cdolist_list_var.rest();
        inference = cdolist_list_var.first();
      }
    }
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-datastructures-inference.lisp", position = 139418L)
  public static SubLObject increment_inference_sksi_query_total_time(final SubLObject inference, final SubLObject elapsed_seconds)
  {
    assert NIL != inference_p( inference ) : inference;
    assert NIL != number_utilities.non_negative_number_p( elapsed_seconds ) : elapsed_seconds;
    return inference_accumulate( inference, $kw590$SKSI_QUERY_TOTAL_TIME_ACC, elapsed_seconds );
  }

  @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-datastructures-inference.lisp", position = 139780L)
  public static SubLObject add_inference_sksi_query_start_time(final SubLObject inference, final SubLObject elapsed_seconds)
  {
    assert NIL != inference_p( inference ) : inference;
    assert NIL != number_utilities.non_negative_number_p( elapsed_seconds ) : elapsed_seconds;
    return inference_accumulate( inference, $kw591$SKSI_QUERY_START_TIMES_ACC, elapsed_seconds );
  }

  @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-datastructures-inference.lisp", position = 140065L)
  public static SubLObject add_inference_sparql_query_profile(final SubLObject inference, final SubLObject profile)
  {
    assert NIL != inference_p( inference ) : inference;
    assert NIL != Types.listp( profile ) : profile;
    assert NIL != list_utilities.non_dotted_list_p( profile ) : profile;
    SubLObject cdolist_list_var = profile;
    SubLObject elem = NIL;
    elem = cdolist_list_var.first();
    while ( NIL != cdolist_list_var)
    {
      assert NIL != number_utilities.non_negative_number_p( elem ) : elem;
      cdolist_list_var = cdolist_list_var.rest();
      elem = cdolist_list_var.first();
    }
    return inference_accumulate( inference, $kw592$SPARQL_QUERY_PROFILE_ACC, profile );
  }

  public static SubLObject declare_inference_datastructures_inference_file()
  {
    SubLFiles.declareFunction( me, "inference_type_p", "INFERENCE-TYPE-P", 1, 0, false );
    SubLFiles.declareFunction( me, "inference_print_function_trampoline", "INFERENCE-PRINT-FUNCTION-TRAMPOLINE", 2, 0, false );
    SubLFiles.declareFunction( me, "inference_p", "INFERENCE-P", 1, 0, false );
    new $inference_p$UnaryFunction();
    SubLFiles.declareFunction( me, "infrnc_suid", "INFRNC-SUID", 1, 0, false );
    SubLFiles.declareFunction( me, "infrnc_problem_store", "INFRNC-PROBLEM-STORE", 1, 0, false );
    SubLFiles.declareFunction( me, "infrnc_forward_propagate", "INFRNC-FORWARD-PROPAGATE", 1, 0, false );
    SubLFiles.declareFunction( me, "infrnc_input_mt", "INFRNC-INPUT-MT", 1, 0, false );
    SubLFiles.declareFunction( me, "infrnc_input_el_query", "INFRNC-INPUT-EL-QUERY", 1, 0, false );
    SubLFiles.declareFunction( me, "infrnc_input_non_explanatory_el_query", "INFRNC-INPUT-NON-EXPLANATORY-EL-QUERY", 1, 0, false );
    SubLFiles.declareFunction( me, "infrnc_input_query_properties", "INFRNC-INPUT-QUERY-PROPERTIES", 1, 0, false );
    SubLFiles.declareFunction( me, "infrnc_mt", "INFRNC-MT", 1, 0, false );
    SubLFiles.declareFunction( me, "infrnc_el_query", "INFRNC-EL-QUERY", 1, 0, false );
    SubLFiles.declareFunction( me, "infrnc_el_bindings", "INFRNC-EL-BINDINGS", 1, 0, false );
    SubLFiles.declareFunction( me, "infrnc_hl_query", "INFRNC-HL-QUERY", 1, 0, false );
    SubLFiles.declareFunction( me, "infrnc_explanatory_subquery", "INFRNC-EXPLANATORY-SUBQUERY", 1, 0, false );
    SubLFiles.declareFunction( me, "infrnc_non_explanatory_subquery", "INFRNC-NON-EXPLANATORY-SUBQUERY", 1, 0, false );
    SubLFiles.declareFunction( me, "infrnc_free_hl_vars", "INFRNC-FREE-HL-VARS", 1, 0, false );
    SubLFiles.declareFunction( me, "infrnc_hypothetical_bindings", "INFRNC-HYPOTHETICAL-BINDINGS", 1, 0, false );
    SubLFiles.declareFunction( me, "infrnc_answer_id_index", "INFRNC-ANSWER-ID-INDEX", 1, 0, false );
    SubLFiles.declareFunction( me, "infrnc_answer_bindings_index", "INFRNC-ANSWER-BINDINGS-INDEX", 1, 0, false );
    SubLFiles.declareFunction( me, "infrnc_new_answer_id_start", "INFRNC-NEW-ANSWER-ID-START", 1, 0, false );
    SubLFiles.declareFunction( me, "infrnc_new_answer_justifications", "INFRNC-NEW-ANSWER-JUSTIFICATIONS", 1, 0, false );
    SubLFiles.declareFunction( me, "infrnc_status", "INFRNC-STATUS", 1, 0, false );
    SubLFiles.declareFunction( me, "infrnc_suspend_status", "INFRNC-SUSPEND-STATUS", 1, 0, false );
    SubLFiles.declareFunction( me, "infrnc_root_link", "INFRNC-ROOT-LINK", 1, 0, false );
    SubLFiles.declareFunction( me, "infrnc_relevant_problems", "INFRNC-RELEVANT-PROBLEMS", 1, 0, false );
    SubLFiles.declareFunction( me, "infrnc_strategy_set", "INFRNC-STRATEGY-SET", 1, 0, false );
    SubLFiles.declareFunction( me, "infrnc_control_process", "INFRNC-CONTROL-PROCESS", 1, 0, false );
    SubLFiles.declareFunction( me, "infrnc_interrupting_processes", "INFRNC-INTERRUPTING-PROCESSES", 1, 0, false );
    SubLFiles.declareFunction( me, "infrnc_max_transformation_depth_reached", "INFRNC-MAX-TRANSFORMATION-DEPTH-REACHED", 1, 0, false );
    SubLFiles.declareFunction( me, "infrnc_disjunction_free_el_vars_policy", "INFRNC-DISJUNCTION-FREE-EL-VARS-POLICY", 1, 0, false );
    SubLFiles.declareFunction( me, "infrnc_result_uniqueness_criterion", "INFRNC-RESULT-UNIQUENESS-CRITERION", 1, 0, false );
    SubLFiles.declareFunction( me, "infrnc_allow_hl_predicate_transformationP", "INFRNC-ALLOW-HL-PREDICATE-TRANSFORMATION?", 1, 0, false );
    SubLFiles.declareFunction( me, "infrnc_allow_unbound_predicate_transformationP", "INFRNC-ALLOW-UNBOUND-PREDICATE-TRANSFORMATION?", 1, 0, false );
    SubLFiles.declareFunction( me, "infrnc_allow_evaluatable_predicate_transformationP", "INFRNC-ALLOW-EVALUATABLE-PREDICATE-TRANSFORMATION?", 1, 0, false );
    SubLFiles.declareFunction( me, "infrnc_allow_indeterminate_resultsP", "INFRNC-ALLOW-INDETERMINATE-RESULTS?", 1, 0, false );
    SubLFiles.declareFunction( me, "infrnc_allowed_rules", "INFRNC-ALLOWED-RULES", 1, 0, false );
    SubLFiles.declareFunction( me, "infrnc_forbidden_rules", "INFRNC-FORBIDDEN-RULES", 1, 0, false );
    SubLFiles.declareFunction( me, "infrnc_allowed_modules", "INFRNC-ALLOWED-MODULES", 1, 0, false );
    SubLFiles.declareFunction( me, "infrnc_allow_abnormality_checkingP", "INFRNC-ALLOW-ABNORMALITY-CHECKING?", 1, 0, false );
    SubLFiles.declareFunction( me, "infrnc_transitive_closure_mode", "INFRNC-TRANSITIVE-CLOSURE-MODE", 1, 0, false );
    SubLFiles.declareFunction( me, "infrnc_problem_store_privateP", "INFRNC-PROBLEM-STORE-PRIVATE?", 1, 0, false );
    SubLFiles.declareFunction( me, "infrnc_continuableP", "INFRNC-CONTINUABLE?", 1, 0, false );
    SubLFiles.declareFunction( me, "infrnc_browsableP", "INFRNC-BROWSABLE?", 1, 0, false );
    SubLFiles.declareFunction( me, "infrnc_return_type", "INFRNC-RETURN-TYPE", 1, 0, false );
    SubLFiles.declareFunction( me, "infrnc_answer_language", "INFRNC-ANSWER-LANGUAGE", 1, 0, false );
    SubLFiles.declareFunction( me, "infrnc_cache_resultsP", "INFRNC-CACHE-RESULTS?", 1, 0, false );
    SubLFiles.declareFunction( me, "infrnc_blockingP", "INFRNC-BLOCKING?", 1, 0, false );
    SubLFiles.declareFunction( me, "infrnc_max_number", "INFRNC-MAX-NUMBER", 1, 0, false );
    SubLFiles.declareFunction( me, "infrnc_max_time", "INFRNC-MAX-TIME", 1, 0, false );
    SubLFiles.declareFunction( me, "infrnc_max_step", "INFRNC-MAX-STEP", 1, 0, false );
    SubLFiles.declareFunction( me, "infrnc_mode", "INFRNC-MODE", 1, 0, false );
    SubLFiles.declareFunction( me, "infrnc_forward_max_time", "INFRNC-FORWARD-MAX-TIME", 1, 0, false );
    SubLFiles.declareFunction( me, "infrnc_max_proof_depth", "INFRNC-MAX-PROOF-DEPTH", 1, 0, false );
    SubLFiles.declareFunction( me, "infrnc_max_transformation_depth", "INFRNC-MAX-TRANSFORMATION-DEPTH", 1, 0, false );
    SubLFiles.declareFunction( me, "infrnc_min_rule_utility", "INFRNC-MIN-RULE-UTILITY", 1, 0, false );
    SubLFiles.declareFunction( me, "infrnc_probably_approximately_done", "INFRNC-PROBABLY-APPROXIMATELY-DONE", 1, 0, false );
    SubLFiles.declareFunction( me, "infrnc_metrics_template", "INFRNC-METRICS-TEMPLATE", 1, 0, false );
    SubLFiles.declareFunction( me, "infrnc_start_universal_time", "INFRNC-START-UNIVERSAL-TIME", 1, 0, false );
    SubLFiles.declareFunction( me, "infrnc_start_internal_real_time", "INFRNC-START-INTERNAL-REAL-TIME", 1, 0, false );
    SubLFiles.declareFunction( me, "infrnc_end_internal_real_time", "INFRNC-END-INTERNAL-REAL-TIME", 1, 0, false );
    SubLFiles.declareFunction( me, "infrnc_pad_internal_real_time", "INFRNC-PAD-INTERNAL-REAL-TIME", 1, 0, false );
    SubLFiles.declareFunction( me, "infrnc_hypothesization_time", "INFRNC-HYPOTHESIZATION-TIME", 1, 0, false );
    SubLFiles.declareFunction( me, "infrnc_cumulative_time", "INFRNC-CUMULATIVE-TIME", 1, 0, false );
    SubLFiles.declareFunction( me, "infrnc_step_count", "INFRNC-STEP-COUNT", 1, 0, false );
    SubLFiles.declareFunction( me, "infrnc_cumulative_step_count", "INFRNC-CUMULATIVE-STEP-COUNT", 1, 0, false );
    SubLFiles.declareFunction( me, "infrnc_events", "INFRNC-EVENTS", 1, 0, false );
    SubLFiles.declareFunction( me, "infrnc_halt_conditions", "INFRNC-HALT-CONDITIONS", 1, 0, false );
    SubLFiles.declareFunction( me, "infrnc_accumulators", "INFRNC-ACCUMULATORS", 1, 0, false );
    SubLFiles.declareFunction( me, "infrnc_proof_watermark", "INFRNC-PROOF-WATERMARK", 1, 0, false );
    SubLFiles.declareFunction( me, "infrnc_problem_working_time_data", "INFRNC-PROBLEM-WORKING-TIME-DATA", 1, 0, false );
    SubLFiles.declareFunction( me, "infrnc_type", "INFRNC-TYPE", 1, 0, false );
    SubLFiles.declareFunction( me, "infrnc_data", "INFRNC-DATA", 1, 0, false );
    SubLFiles.declareFunction( me, "infrnc_properties", "INFRNC-PROPERTIES", 1, 0, false );
    SubLFiles.declareFunction( me, "_csetf_infrnc_suid", "_CSETF-INFRNC-SUID", 2, 0, false );
    SubLFiles.declareFunction( me, "_csetf_infrnc_problem_store", "_CSETF-INFRNC-PROBLEM-STORE", 2, 0, false );
    SubLFiles.declareFunction( me, "_csetf_infrnc_forward_propagate", "_CSETF-INFRNC-FORWARD-PROPAGATE", 2, 0, false );
    SubLFiles.declareFunction( me, "_csetf_infrnc_input_mt", "_CSETF-INFRNC-INPUT-MT", 2, 0, false );
    SubLFiles.declareFunction( me, "_csetf_infrnc_input_el_query", "_CSETF-INFRNC-INPUT-EL-QUERY", 2, 0, false );
    SubLFiles.declareFunction( me, "_csetf_infrnc_input_non_explanatory_el_query", "_CSETF-INFRNC-INPUT-NON-EXPLANATORY-EL-QUERY", 2, 0, false );
    SubLFiles.declareFunction( me, "_csetf_infrnc_input_query_properties", "_CSETF-INFRNC-INPUT-QUERY-PROPERTIES", 2, 0, false );
    SubLFiles.declareFunction( me, "_csetf_infrnc_mt", "_CSETF-INFRNC-MT", 2, 0, false );
    SubLFiles.declareFunction( me, "_csetf_infrnc_el_query", "_CSETF-INFRNC-EL-QUERY", 2, 0, false );
    SubLFiles.declareFunction( me, "_csetf_infrnc_el_bindings", "_CSETF-INFRNC-EL-BINDINGS", 2, 0, false );
    SubLFiles.declareFunction( me, "_csetf_infrnc_hl_query", "_CSETF-INFRNC-HL-QUERY", 2, 0, false );
    SubLFiles.declareFunction( me, "_csetf_infrnc_explanatory_subquery", "_CSETF-INFRNC-EXPLANATORY-SUBQUERY", 2, 0, false );
    SubLFiles.declareFunction( me, "_csetf_infrnc_non_explanatory_subquery", "_CSETF-INFRNC-NON-EXPLANATORY-SUBQUERY", 2, 0, false );
    SubLFiles.declareFunction( me, "_csetf_infrnc_free_hl_vars", "_CSETF-INFRNC-FREE-HL-VARS", 2, 0, false );
    SubLFiles.declareFunction( me, "_csetf_infrnc_hypothetical_bindings", "_CSETF-INFRNC-HYPOTHETICAL-BINDINGS", 2, 0, false );
    SubLFiles.declareFunction( me, "_csetf_infrnc_answer_id_index", "_CSETF-INFRNC-ANSWER-ID-INDEX", 2, 0, false );
    SubLFiles.declareFunction( me, "_csetf_infrnc_answer_bindings_index", "_CSETF-INFRNC-ANSWER-BINDINGS-INDEX", 2, 0, false );
    SubLFiles.declareFunction( me, "_csetf_infrnc_new_answer_id_start", "_CSETF-INFRNC-NEW-ANSWER-ID-START", 2, 0, false );
    SubLFiles.declareFunction( me, "_csetf_infrnc_new_answer_justifications", "_CSETF-INFRNC-NEW-ANSWER-JUSTIFICATIONS", 2, 0, false );
    SubLFiles.declareFunction( me, "_csetf_infrnc_status", "_CSETF-INFRNC-STATUS", 2, 0, false );
    SubLFiles.declareFunction( me, "_csetf_infrnc_suspend_status", "_CSETF-INFRNC-SUSPEND-STATUS", 2, 0, false );
    SubLFiles.declareFunction( me, "_csetf_infrnc_root_link", "_CSETF-INFRNC-ROOT-LINK", 2, 0, false );
    SubLFiles.declareFunction( me, "_csetf_infrnc_relevant_problems", "_CSETF-INFRNC-RELEVANT-PROBLEMS", 2, 0, false );
    SubLFiles.declareFunction( me, "_csetf_infrnc_strategy_set", "_CSETF-INFRNC-STRATEGY-SET", 2, 0, false );
    SubLFiles.declareFunction( me, "_csetf_infrnc_control_process", "_CSETF-INFRNC-CONTROL-PROCESS", 2, 0, false );
    SubLFiles.declareFunction( me, "_csetf_infrnc_interrupting_processes", "_CSETF-INFRNC-INTERRUPTING-PROCESSES", 2, 0, false );
    SubLFiles.declareFunction( me, "_csetf_infrnc_max_transformation_depth_reached", "_CSETF-INFRNC-MAX-TRANSFORMATION-DEPTH-REACHED", 2, 0, false );
    SubLFiles.declareFunction( me, "_csetf_infrnc_disjunction_free_el_vars_policy", "_CSETF-INFRNC-DISJUNCTION-FREE-EL-VARS-POLICY", 2, 0, false );
    SubLFiles.declareFunction( me, "_csetf_infrnc_result_uniqueness_criterion", "_CSETF-INFRNC-RESULT-UNIQUENESS-CRITERION", 2, 0, false );
    SubLFiles.declareFunction( me, "_csetf_infrnc_allow_hl_predicate_transformationP", "_CSETF-INFRNC-ALLOW-HL-PREDICATE-TRANSFORMATION?", 2, 0, false );
    SubLFiles.declareFunction( me, "_csetf_infrnc_allow_unbound_predicate_transformationP", "_CSETF-INFRNC-ALLOW-UNBOUND-PREDICATE-TRANSFORMATION?", 2, 0, false );
    SubLFiles.declareFunction( me, "_csetf_infrnc_allow_evaluatable_predicate_transformationP", "_CSETF-INFRNC-ALLOW-EVALUATABLE-PREDICATE-TRANSFORMATION?", 2, 0, false );
    SubLFiles.declareFunction( me, "_csetf_infrnc_allow_indeterminate_resultsP", "_CSETF-INFRNC-ALLOW-INDETERMINATE-RESULTS?", 2, 0, false );
    SubLFiles.declareFunction( me, "_csetf_infrnc_allowed_rules", "_CSETF-INFRNC-ALLOWED-RULES", 2, 0, false );
    SubLFiles.declareFunction( me, "_csetf_infrnc_forbidden_rules", "_CSETF-INFRNC-FORBIDDEN-RULES", 2, 0, false );
    SubLFiles.declareFunction( me, "_csetf_infrnc_allowed_modules", "_CSETF-INFRNC-ALLOWED-MODULES", 2, 0, false );
    SubLFiles.declareFunction( me, "_csetf_infrnc_allow_abnormality_checkingP", "_CSETF-INFRNC-ALLOW-ABNORMALITY-CHECKING?", 2, 0, false );
    SubLFiles.declareFunction( me, "_csetf_infrnc_transitive_closure_mode", "_CSETF-INFRNC-TRANSITIVE-CLOSURE-MODE", 2, 0, false );
    SubLFiles.declareFunction( me, "_csetf_infrnc_problem_store_privateP", "_CSETF-INFRNC-PROBLEM-STORE-PRIVATE?", 2, 0, false );
    SubLFiles.declareFunction( me, "_csetf_infrnc_continuableP", "_CSETF-INFRNC-CONTINUABLE?", 2, 0, false );
    SubLFiles.declareFunction( me, "_csetf_infrnc_browsableP", "_CSETF-INFRNC-BROWSABLE?", 2, 0, false );
    SubLFiles.declareFunction( me, "_csetf_infrnc_return_type", "_CSETF-INFRNC-RETURN-TYPE", 2, 0, false );
    SubLFiles.declareFunction( me, "_csetf_infrnc_answer_language", "_CSETF-INFRNC-ANSWER-LANGUAGE", 2, 0, false );
    SubLFiles.declareFunction( me, "_csetf_infrnc_cache_resultsP", "_CSETF-INFRNC-CACHE-RESULTS?", 2, 0, false );
    SubLFiles.declareFunction( me, "_csetf_infrnc_blockingP", "_CSETF-INFRNC-BLOCKING?", 2, 0, false );
    SubLFiles.declareFunction( me, "_csetf_infrnc_max_number", "_CSETF-INFRNC-MAX-NUMBER", 2, 0, false );
    SubLFiles.declareFunction( me, "_csetf_infrnc_max_time", "_CSETF-INFRNC-MAX-TIME", 2, 0, false );
    SubLFiles.declareFunction( me, "_csetf_infrnc_max_step", "_CSETF-INFRNC-MAX-STEP", 2, 0, false );
    SubLFiles.declareFunction( me, "_csetf_infrnc_mode", "_CSETF-INFRNC-MODE", 2, 0, false );
    SubLFiles.declareFunction( me, "_csetf_infrnc_forward_max_time", "_CSETF-INFRNC-FORWARD-MAX-TIME", 2, 0, false );
    SubLFiles.declareFunction( me, "_csetf_infrnc_max_proof_depth", "_CSETF-INFRNC-MAX-PROOF-DEPTH", 2, 0, false );
    SubLFiles.declareFunction( me, "_csetf_infrnc_max_transformation_depth", "_CSETF-INFRNC-MAX-TRANSFORMATION-DEPTH", 2, 0, false );
    SubLFiles.declareFunction( me, "_csetf_infrnc_min_rule_utility", "_CSETF-INFRNC-MIN-RULE-UTILITY", 2, 0, false );
    SubLFiles.declareFunction( me, "_csetf_infrnc_probably_approximately_done", "_CSETF-INFRNC-PROBABLY-APPROXIMATELY-DONE", 2, 0, false );
    SubLFiles.declareFunction( me, "_csetf_infrnc_metrics_template", "_CSETF-INFRNC-METRICS-TEMPLATE", 2, 0, false );
    SubLFiles.declareFunction( me, "_csetf_infrnc_start_universal_time", "_CSETF-INFRNC-START-UNIVERSAL-TIME", 2, 0, false );
    SubLFiles.declareFunction( me, "_csetf_infrnc_start_internal_real_time", "_CSETF-INFRNC-START-INTERNAL-REAL-TIME", 2, 0, false );
    SubLFiles.declareFunction( me, "_csetf_infrnc_end_internal_real_time", "_CSETF-INFRNC-END-INTERNAL-REAL-TIME", 2, 0, false );
    SubLFiles.declareFunction( me, "_csetf_infrnc_pad_internal_real_time", "_CSETF-INFRNC-PAD-INTERNAL-REAL-TIME", 2, 0, false );
    SubLFiles.declareFunction( me, "_csetf_infrnc_hypothesization_time", "_CSETF-INFRNC-HYPOTHESIZATION-TIME", 2, 0, false );
    SubLFiles.declareFunction( me, "_csetf_infrnc_cumulative_time", "_CSETF-INFRNC-CUMULATIVE-TIME", 2, 0, false );
    SubLFiles.declareFunction( me, "_csetf_infrnc_step_count", "_CSETF-INFRNC-STEP-COUNT", 2, 0, false );
    SubLFiles.declareFunction( me, "_csetf_infrnc_cumulative_step_count", "_CSETF-INFRNC-CUMULATIVE-STEP-COUNT", 2, 0, false );
    SubLFiles.declareFunction( me, "_csetf_infrnc_events", "_CSETF-INFRNC-EVENTS", 2, 0, false );
    SubLFiles.declareFunction( me, "_csetf_infrnc_halt_conditions", "_CSETF-INFRNC-HALT-CONDITIONS", 2, 0, false );
    SubLFiles.declareFunction( me, "_csetf_infrnc_accumulators", "_CSETF-INFRNC-ACCUMULATORS", 2, 0, false );
    SubLFiles.declareFunction( me, "_csetf_infrnc_proof_watermark", "_CSETF-INFRNC-PROOF-WATERMARK", 2, 0, false );
    SubLFiles.declareFunction( me, "_csetf_infrnc_problem_working_time_data", "_CSETF-INFRNC-PROBLEM-WORKING-TIME-DATA", 2, 0, false );
    SubLFiles.declareFunction( me, "_csetf_infrnc_type", "_CSETF-INFRNC-TYPE", 2, 0, false );
    SubLFiles.declareFunction( me, "_csetf_infrnc_data", "_CSETF-INFRNC-DATA", 2, 0, false );
    SubLFiles.declareFunction( me, "_csetf_infrnc_properties", "_CSETF-INFRNC-PROPERTIES", 2, 0, false );
    SubLFiles.declareFunction( me, "make_inference", "MAKE-INFERENCE", 0, 1, false );
    SubLFiles.declareFunction( me, "visit_defstruct_inference", "VISIT-DEFSTRUCT-INFERENCE", 2, 0, false );
    SubLFiles.declareFunction( me, "visit_defstruct_object_inference_method", "VISIT-DEFSTRUCT-OBJECT-INFERENCE-METHOD", 2, 0, false );
    SubLFiles.declareFunction( me, "valid_inference_p", "VALID-INFERENCE-P", 1, 0, false );
    SubLFiles.declareFunction( me, "invalid_inference_p", "INVALID-INFERENCE-P", 1, 0, false );
    SubLFiles.declareFunction( me, "inference_invalid_p", "INFERENCE-INVALID-P", 1, 0, false );
    SubLFiles.declareFunction( me, "print_inference", "PRINT-INFERENCE", 3, 0, false );
    SubLFiles.declareFunction( me, "sxhash_inference_method", "SXHASH-INFERENCE-METHOD", 1, 0, false );
    new $sxhash_inference_method$UnaryFunction();
    SubLFiles.declareFunction( me, "new_inference_p", "NEW-INFERENCE-P", 1, 0, false );
    SubLFiles.declareFunction( me, "prepared_inference_p", "PREPARED-INFERENCE-P", 1, 0, false );
    SubLFiles.declareFunction( me, "ready_inference_p", "READY-INFERENCE-P", 1, 0, false );
    SubLFiles.declareFunction( me, "running_inference_p", "RUNNING-INFERENCE-P", 1, 0, false );
    SubLFiles.declareFunction( me, "suspended_inference_p", "SUSPENDED-INFERENCE-P", 1, 0, false );
    SubLFiles.declareFunction( me, "continuable_inference_p", "CONTINUABLE-INFERENCE-P", 1, 0, false );
    SubLFiles.declareFunction( me, "exhausted_inference_p", "EXHAUSTED-INFERENCE-P", 1, 0, false );
    SubLFiles.declareMacro( me, "do_inference_relevant_problems", "DO-INFERENCE-RELEVANT-PROBLEMS" );
    SubLFiles.declareMacro( me, "do_inference_new_answer_justifications", "DO-INFERENCE-NEW-ANSWER-JUSTIFICATIONS" );
    SubLFiles.declareMacro( me, "do_inference_new_answers", "DO-INFERENCE-NEW-ANSWERS" );
    SubLFiles.declareMacro( me, "do_inference_answers", "DO-INFERENCE-ANSWERS" );
    SubLFiles.declareMacro( me, "do_inference_answers_from_index", "DO-INFERENCE-ANSWERS-FROM-INDEX" );
    SubLFiles.declareMacro( me, "do_inference_justifications", "DO-INFERENCE-JUSTIFICATIONS" );
    SubLFiles.declareMacro( me, "do_inference_interrupting_processes", "DO-INFERENCE-INTERRUPTING-PROCESSES" );
    SubLFiles.declareMacro( me, "do_inference_root_proofs", "DO-INFERENCE-ROOT-PROOFS" );
    SubLFiles.declareMacro( me, "do_inference_allowed_rules", "DO-INFERENCE-ALLOWED-RULES" );
    SubLFiles.declareMacro( me, "with_inference_problem_working_time_lock", "WITH-INFERENCE-PROBLEM-WORKING-TIME-LOCK" );
    SubLFiles.declareFunction( me, "new_inference", "NEW-INFERENCE", 1, 0, false );
    SubLFiles.declareFunction( me, "new_tautological_inference", "NEW-TAUTOLOGICAL-INFERENCE", 1, 0, false );
    SubLFiles.declareFunction( me, "destroy_all_inferences", "DESTROY-ALL-INFERENCES", 0, 0, false );
    SubLFiles.declareFunction( me, "destroy_inference", "DESTROY-INFERENCE", 1, 0, false );
    SubLFiles.declareFunction( me, "destroy_inference_and_problem_store", "DESTROY-INFERENCE-AND-PROBLEM-STORE", 1, 0, false );
    SubLFiles.declareFunction( me, "destroy_problem_store_inference", "DESTROY-PROBLEM-STORE-INFERENCE", 1, 0, false );
    SubLFiles.declareFunction( me, "destroy_inference_int", "DESTROY-INFERENCE-INT", 1, 0, false );
    SubLFiles.declareFunction( me, "note_inference_invalid", "NOTE-INFERENCE-INVALID", 1, 0, false );
    SubLFiles.declareFunction( me, "inference_suid", "INFERENCE-SUID", 1, 0, false );
    SubLFiles.declareFunction( me, "inference_problem_store", "INFERENCE-PROBLEM-STORE", 1, 0, false );
    SubLFiles.declareFunction( me, "inference_forward_propagate", "INFERENCE-FORWARD-PROPAGATE", 1, 0, false );
    SubLFiles.declareFunction( me, "inference_input_mt", "INFERENCE-INPUT-MT", 1, 0, false );
    SubLFiles.declareFunction( me, "inference_input_el_query", "INFERENCE-INPUT-EL-QUERY", 1, 0, false );
    SubLFiles.declareFunction( me, "inference_input_non_explanatory_el_query", "INFERENCE-INPUT-NON-EXPLANATORY-EL-QUERY", 1, 0, false );
    SubLFiles.declareFunction( me, "inference_input_query_properties", "INFERENCE-INPUT-QUERY-PROPERTIES", 1, 0, false );
    SubLFiles.declareFunction( me, "inference_mt", "INFERENCE-MT", 1, 0, false );
    SubLFiles.declareFunction( me, "inference_el_query", "INFERENCE-EL-QUERY", 1, 0, false );
    SubLFiles.declareFunction( me, "inference_el_ist_query", "INFERENCE-EL-IST-QUERY", 1, 0, false );
    SubLFiles.declareFunction( me, "inference_el_bindings", "INFERENCE-EL-BINDINGS", 1, 0, false );
    SubLFiles.declareFunction( me, "inference_hl_query", "INFERENCE-HL-QUERY", 1, 0, false );
    SubLFiles.declareFunction( me, "inference_explanatory_subquery", "INFERENCE-EXPLANATORY-SUBQUERY", 1, 0, false );
    SubLFiles.declareFunction( me, "inference_non_explanatory_subquery", "INFERENCE-NON-EXPLANATORY-SUBQUERY", 1, 0, false );
    SubLFiles.declareFunction( me, "inference_free_hl_vars", "INFERENCE-FREE-HL-VARS", 1, 0, false );
    SubLFiles.declareFunction( me, "inference_hypothetical_bindings", "INFERENCE-HYPOTHETICAL-BINDINGS", 1, 0, false );
    SubLFiles.declareFunction( me, "inference_answer_id_index", "INFERENCE-ANSWER-ID-INDEX", 1, 0, false );
    SubLFiles.declareFunction( me, "inference_answer_bindings_index", "INFERENCE-ANSWER-BINDINGS-INDEX", 1, 0, false );
    SubLFiles.declareFunction( me, "inference_new_answer_id_start", "INFERENCE-NEW-ANSWER-ID-START", 1, 0, false );
    SubLFiles.declareFunction( me, "inference_new_answer_justifications", "INFERENCE-NEW-ANSWER-JUSTIFICATIONS", 1, 0, false );
    SubLFiles.declareFunction( me, "inference_status", "INFERENCE-STATUS", 1, 0, false );
    SubLFiles.declareFunction( me, "inference_suspend_status", "INFERENCE-SUSPEND-STATUS", 1, 0, false );
    SubLFiles.declareFunction( me, "inference_root_link", "INFERENCE-ROOT-LINK", 1, 0, false );
    SubLFiles.declareFunction( me, "inference_relevant_problems", "INFERENCE-RELEVANT-PROBLEMS", 1, 0, false );
    SubLFiles.declareFunction( me, "inference_strategy_set", "INFERENCE-STRATEGY-SET", 1, 0, false );
    SubLFiles.declareFunction( me, "inference_control_process", "INFERENCE-CONTROL-PROCESS", 1, 0, false );
    SubLFiles.declareFunction( me, "inference_interrupting_processes", "INFERENCE-INTERRUPTING-PROCESSES", 1, 0, false );
    SubLFiles.declareFunction( me, "inference_max_transformation_depth_reached", "INFERENCE-MAX-TRANSFORMATION-DEPTH-REACHED", 1, 0, false );
    SubLFiles.declareFunction( me, "inference_answer_language", "INFERENCE-ANSWER-LANGUAGE", 1, 0, false );
    SubLFiles.declareFunction( me, "inference_cache_resultsP", "INFERENCE-CACHE-RESULTS?", 1, 0, false );
    SubLFiles.declareFunction( me, "inference_blockingP", "INFERENCE-BLOCKING?", 1, 0, false );
    SubLFiles.declareFunction( me, "inference_disjunction_free_el_vars_policy", "INFERENCE-DISJUNCTION-FREE-EL-VARS-POLICY", 1, 0, false );
    SubLFiles.declareFunction( me, "inference_result_uniqueness_criterion", "INFERENCE-RESULT-UNIQUENESS-CRITERION", 1, 0, false );
    SubLFiles.declareFunction( me, "inference_allow_hl_predicate_transformationP", "INFERENCE-ALLOW-HL-PREDICATE-TRANSFORMATION?", 1, 0, false );
    SubLFiles.declareFunction( me, "inference_allow_unbound_predicate_transformationP", "INFERENCE-ALLOW-UNBOUND-PREDICATE-TRANSFORMATION?", 1, 0, false );
    SubLFiles.declareFunction( me, "inference_allow_evaluatable_predicate_transformationP", "INFERENCE-ALLOW-EVALUATABLE-PREDICATE-TRANSFORMATION?", 1, 0, false );
    SubLFiles.declareFunction( me, "inference_allow_indeterminate_resultsP", "INFERENCE-ALLOW-INDETERMINATE-RESULTS?", 1, 0, false );
    SubLFiles.declareFunction( me, "inference_allowed_rules", "INFERENCE-ALLOWED-RULES", 1, 0, false );
    SubLFiles.declareFunction( me, "inference_forbidden_rules", "INFERENCE-FORBIDDEN-RULES", 1, 0, false );
    SubLFiles.declareFunction( me, "inference_allowed_modules", "INFERENCE-ALLOWED-MODULES", 1, 0, false );
    SubLFiles.declareFunction( me, "inference_allow_abnormality_checkingP", "INFERENCE-ALLOW-ABNORMALITY-CHECKING?", 1, 0, false );
    SubLFiles.declareFunction( me, "inference_transitive_closure_mode", "INFERENCE-TRANSITIVE-CLOSURE-MODE", 1, 0, false );
    SubLFiles.declareFunction( me, "inference_problem_store_privateP", "INFERENCE-PROBLEM-STORE-PRIVATE?", 1, 0, false );
    SubLFiles.declareFunction( me, "inference_continuableP", "INFERENCE-CONTINUABLE?", 1, 0, false );
    SubLFiles.declareFunction( me, "inference_browsableP", "INFERENCE-BROWSABLE?", 1, 0, false );
    SubLFiles.declareFunction( me, "inference_return_type", "INFERENCE-RETURN-TYPE", 1, 0, false );
    SubLFiles.declareFunction( me, "inference_max_time", "INFERENCE-MAX-TIME", 1, 0, false );
    SubLFiles.declareFunction( me, "inference_max_step", "INFERENCE-MAX-STEP", 1, 0, false );
    SubLFiles.declareFunction( me, "inference_mode", "INFERENCE-MODE", 1, 0, false );
    SubLFiles.declareFunction( me, "inference_forward_max_time", "INFERENCE-FORWARD-MAX-TIME", 1, 0, false );
    SubLFiles.declareFunction( me, "inference_max_number", "INFERENCE-MAX-NUMBER", 1, 0, false );
    SubLFiles.declareFunction( me, "inference_max_proof_depth", "INFERENCE-MAX-PROOF-DEPTH", 1, 0, false );
    SubLFiles.declareFunction( me, "inference_max_transformation_depth", "INFERENCE-MAX-TRANSFORMATION-DEPTH", 1, 0, false );
    SubLFiles.declareFunction( me, "inference_min_rule_utility", "INFERENCE-MIN-RULE-UTILITY", 1, 0, false );
    SubLFiles.declareFunction( me, "inference_probably_approximately_done", "INFERENCE-PROBABLY-APPROXIMATELY-DONE", 1, 0, false );
    SubLFiles.declareFunction( me, "inference_metrics_template", "INFERENCE-METRICS-TEMPLATE", 1, 0, false );
    SubLFiles.declareFunction( me, "inference_start_universal_time", "INFERENCE-START-UNIVERSAL-TIME", 1, 0, false );
    SubLFiles.declareFunction( me, "inference_start_internal_real_time", "INFERENCE-START-INTERNAL-REAL-TIME", 1, 0, false );
    SubLFiles.declareFunction( me, "inference_end_internal_real_time", "INFERENCE-END-INTERNAL-REAL-TIME", 1, 0, false );
    SubLFiles.declareFunction( me, "inference_pad_internal_real_time", "INFERENCE-PAD-INTERNAL-REAL-TIME", 1, 0, false );
    SubLFiles.declareFunction( me, "inference_hypothesization_time", "INFERENCE-HYPOTHESIZATION-TIME", 1, 0, false );
    SubLFiles.declareFunction( me, "inference_cumulative_time", "INFERENCE-CUMULATIVE-TIME", 1, 0, false );
    SubLFiles.declareFunction( me, "inference_step_count", "INFERENCE-STEP-COUNT", 1, 0, false );
    SubLFiles.declareFunction( me, "inference_cumulative_step_count", "INFERENCE-CUMULATIVE-STEP-COUNT", 1, 0, false );
    SubLFiles.declareFunction( me, "inference_problem_working_time_data", "INFERENCE-PROBLEM-WORKING-TIME-DATA", 1, 0, false );
    SubLFiles.declareFunction( me, "inference_events", "INFERENCE-EVENTS", 1, 0, false );
    SubLFiles.declareFunction( me, "inference_accumulators", "INFERENCE-ACCUMULATORS", 1, 0, false );
    SubLFiles.declareFunction( me, "inference_proof_watermark", "INFERENCE-PROOF-WATERMARK", 1, 0, false );
    SubLFiles.declareFunction( me, "inference_type", "INFERENCE-TYPE", 1, 0, false );
    SubLFiles.declareFunction( me, "inference_data", "INFERENCE-DATA", 1, 0, false );
    SubLFiles.declareFunction( me, "inference_properties", "INFERENCE-PROPERTIES", 1, 0, false );
    SubLFiles.declareFunction( me, "set_inference_forward_propagate", "SET-INFERENCE-FORWARD-PROPAGATE", 2, 0, false );
    SubLFiles.declareFunction( me, "set_inference_input_mt", "SET-INFERENCE-INPUT-MT", 2, 0, false );
    SubLFiles.declareFunction( me, "set_inference_input_el_query", "SET-INFERENCE-INPUT-EL-QUERY", 2, 0, false );
    SubLFiles.declareFunction( me, "set_inference_input_non_explanatory_el_query", "SET-INFERENCE-INPUT-NON-EXPLANATORY-EL-QUERY", 2, 0, false );
    SubLFiles.declareFunction( me, "set_inference_input_query_properties", "SET-INFERENCE-INPUT-QUERY-PROPERTIES", 2, 0, false );
    SubLFiles.declareFunction( me, "set_inference_mt", "SET-INFERENCE-MT", 2, 0, false );
    SubLFiles.declareFunction( me, "set_inference_el_query", "SET-INFERENCE-EL-QUERY", 2, 0, false );
    SubLFiles.declareFunction( me, "set_inference_el_bindings", "SET-INFERENCE-EL-BINDINGS", 2, 0, false );
    SubLFiles.declareFunction( me, "set_inference_hl_query", "SET-INFERENCE-HL-QUERY", 2, 0, false );
    SubLFiles.declareFunction( me, "set_inference_explanatory_subquery", "SET-INFERENCE-EXPLANATORY-SUBQUERY", 2, 0, false );
    SubLFiles.declareFunction( me, "set_inference_non_explanatory_subquery", "SET-INFERENCE-NON-EXPLANATORY-SUBQUERY", 2, 0, false );
    SubLFiles.declareFunction( me, "set_inference_free_hl_vars", "SET-INFERENCE-FREE-HL-VARS", 2, 0, false );
    SubLFiles.declareFunction( me, "set_inference_hypothetical_bindings", "SET-INFERENCE-HYPOTHETICAL-BINDINGS", 2, 0, false );
    SubLFiles.declareFunction( me, "set_inference_status", "SET-INFERENCE-STATUS", 2, 0, false );
    SubLFiles.declareFunction( me, "set_inference_suspend_status", "SET-INFERENCE-SUSPEND-STATUS", 2, 0, false );
    SubLFiles.declareFunction( me, "set_inference_root_link", "SET-INFERENCE-ROOT-LINK", 2, 0, false );
    SubLFiles.declareFunction( me, "set_inference_control_process", "SET-INFERENCE-CONTROL-PROCESS", 2, 0, false );
    SubLFiles.declareFunction( me, "set_inference_max_transformation_depth_reached", "SET-INFERENCE-MAX-TRANSFORMATION-DEPTH-REACHED", 2, 0, false );
    SubLFiles.declareFunction( me, "set_inference_disjunction_free_el_vars_policy", "SET-INFERENCE-DISJUNCTION-FREE-EL-VARS-POLICY", 2, 0, false );
    SubLFiles.declareFunction( me, "set_inference_result_uniqueness_criterion", "SET-INFERENCE-RESULT-UNIQUENESS-CRITERION", 2, 0, false );
    SubLFiles.declareFunction( me, "set_inference_allow_hl_predicate_transformation", "SET-INFERENCE-ALLOW-HL-PREDICATE-TRANSFORMATION", 2, 0, false );
    SubLFiles.declareFunction( me, "set_inference_allow_unbound_predicate_transformation", "SET-INFERENCE-ALLOW-UNBOUND-PREDICATE-TRANSFORMATION", 2, 0, false );
    SubLFiles.declareFunction( me, "set_inference_allow_evaluatable_predicate_transformation", "SET-INFERENCE-ALLOW-EVALUATABLE-PREDICATE-TRANSFORMATION", 2, 0, false );
    SubLFiles.declareFunction( me, "set_inference_allow_indeterminate_results", "SET-INFERENCE-ALLOW-INDETERMINATE-RESULTS", 2, 0, false );
    SubLFiles.declareFunction( me, "set_inference_allowed_rules", "SET-INFERENCE-ALLOWED-RULES", 2, 0, false );
    SubLFiles.declareFunction( me, "set_inference_forbidden_rules", "SET-INFERENCE-FORBIDDEN-RULES", 2, 0, false );
    SubLFiles.declareFunction( me, "set_inference_allowed_modules", "SET-INFERENCE-ALLOWED-MODULES", 2, 0, false );
    SubLFiles.declareFunction( me, "set_inference_allow_abnormality_checking", "SET-INFERENCE-ALLOW-ABNORMALITY-CHECKING", 2, 0, false );
    SubLFiles.declareFunction( me, "set_inference_transitive_closure_mode", "SET-INFERENCE-TRANSITIVE-CLOSURE-MODE", 2, 0, false );
    SubLFiles.declareFunction( me, "set_inference_problem_store_private", "SET-INFERENCE-PROBLEM-STORE-PRIVATE", 2, 0, false );
    SubLFiles.declareFunction( me, "set_inference_continuable", "SET-INFERENCE-CONTINUABLE", 2, 0, false );
    SubLFiles.declareFunction( me, "set_inference_browsable", "SET-INFERENCE-BROWSABLE", 2, 0, false );
    SubLFiles.declareFunction( me, "set_inference_return_type", "SET-INFERENCE-RETURN-TYPE", 2, 0, false );
    SubLFiles.declareFunction( me, "set_inference_answer_language", "SET-INFERENCE-ANSWER-LANGUAGE", 2, 0, false );
    SubLFiles.declareFunction( me, "set_inference_cache_results", "SET-INFERENCE-CACHE-RESULTS", 2, 0, false );
    SubLFiles.declareFunction( me, "note_inference_blocking", "NOTE-INFERENCE-BLOCKING", 1, 0, false );
    SubLFiles.declareFunction( me, "clear_inference_blocking", "CLEAR-INFERENCE-BLOCKING", 1, 0, false );
    SubLFiles.declareFunction( me, "set_inference_max_number", "SET-INFERENCE-MAX-NUMBER", 2, 0, false );
    SubLFiles.declareFunction( me, "set_inference_max_time", "SET-INFERENCE-MAX-TIME", 2, 0, false );
    SubLFiles.declareFunction( me, "set_inference_max_step", "SET-INFERENCE-MAX-STEP", 2, 0, false );
    SubLFiles.declareFunction( me, "set_inference_mode", "SET-INFERENCE-MODE", 2, 0, false );
    SubLFiles.declareFunction( me, "set_inference_forward_max_time", "SET-INFERENCE-FORWARD-MAX-TIME", 2, 0, false );
    SubLFiles.declareFunction( me, "set_inference_max_proof_depth", "SET-INFERENCE-MAX-PROOF-DEPTH", 2, 0, false );
    SubLFiles.declareFunction( me, "set_inference_max_transformation_depth", "SET-INFERENCE-MAX-TRANSFORMATION-DEPTH", 2, 0, false );
    SubLFiles.declareFunction( me, "set_inference_min_rule_utility", "SET-INFERENCE-MIN-RULE-UTILITY", 2, 0, false );
    SubLFiles.declareFunction( me, "set_inference_probably_approximately_done", "SET-INFERENCE-PROBABLY-APPROXIMATELY-DONE", 2, 0, false );
    SubLFiles.declareFunction( me, "set_inference_metrics_template", "SET-INFERENCE-METRICS-TEMPLATE", 2, 0, false );
    SubLFiles.declareFunction( me, "set_inference_start_universal_time", "SET-INFERENCE-START-UNIVERSAL-TIME", 2, 0, false );
    SubLFiles.declareFunction( me, "set_inference_start_internal_real_time", "SET-INFERENCE-START-INTERNAL-REAL-TIME", 2, 0, false );
    SubLFiles.declareFunction( me, "set_inference_end_internal_real_time", "SET-INFERENCE-END-INTERNAL-REAL-TIME", 2, 0, false );
    SubLFiles.declareFunction( me, "set_inference_pad_internal_real_time", "SET-INFERENCE-PAD-INTERNAL-REAL-TIME", 2, 0, false );
    SubLFiles.declareFunction( me, "set_inference_hypothesization_time", "SET-INFERENCE-HYPOTHESIZATION-TIME", 2, 0, false );
    SubLFiles.declareFunction( me, "set_inference_cumulative_time", "SET-INFERENCE-CUMULATIVE-TIME", 2, 0, false );
    SubLFiles.declareFunction( me, "set_inference_step_count", "SET-INFERENCE-STEP-COUNT", 2, 0, false );
    SubLFiles.declareFunction( me, "increment_inference_step_count", "INCREMENT-INFERENCE-STEP-COUNT", 1, 0, false );
    SubLFiles.declareFunction( me, "set_inference_cumulative_step_count", "SET-INFERENCE-CUMULATIVE-STEP-COUNT", 2, 0, false );
    SubLFiles.declareFunction( me, "increment_inference_cumulative_step_count", "INCREMENT-INFERENCE-CUMULATIVE-STEP-COUNT", 1, 0, false );
    SubLFiles.declareFunction( me, "set_inference_problem_working_time_data", "SET-INFERENCE-PROBLEM-WORKING-TIME-DATA", 2, 0, false );
    SubLFiles.declareFunction( me, "set_inference_events", "SET-INFERENCE-EVENTS", 2, 0, false );
    SubLFiles.declareFunction( me, "set_inference_halt_conditions", "SET-INFERENCE-HALT-CONDITIONS", 2, 0, false );
    SubLFiles.declareFunction( me, "set_inference_type", "SET-INFERENCE-TYPE", 2, 0, false );
    SubLFiles.declareFunction( me, "set_inference_data", "SET-INFERENCE-DATA", 2, 0, false );
    SubLFiles.declareFunction( me, "set_inference_properties", "SET-INFERENCE-PROPERTIES", 2, 0, false );
    SubLFiles.declareFunction( me, "set_inference_property", "SET-INFERENCE-PROPERTY", 3, 0, false );
    SubLFiles.declareFunction( me, "push_inference_property", "PUSH-INFERENCE-PROPERTY", 3, 0, false );
    SubLFiles.declareFunction( me, "inference_ids", "INFERENCE-IDS", 1, 0, false );
    SubLFiles.declareMacro( me, "with_inference_ids", "WITH-INFERENCE-IDS" );
    SubLFiles.declareFunction( me, "inference_problem_store_suid", "INFERENCE-PROBLEM-STORE-SUID", 1, 0, false );
    SubLFiles.declareFunction( me, "all_inferences", "ALL-INFERENCES", 0, 0, false );
    SubLFiles.declareFunction( me, "all_successful_inferences", "ALL-SUCCESSFUL-INFERENCES", 0, 0, false );
    SubLFiles.declareFunction( me, "inference_strategies", "INFERENCE-STRATEGIES", 1, 0, false );
    SubLFiles.declareFunction( me, "inference_hl_mts", "INFERENCE-HL-MTS", 1, 0, false );
    SubLFiles.declareFunction( me, "inference_first_hl_query_mt", "INFERENCE-FIRST-HL-QUERY-MT", 1, 0, false );
    SubLFiles.declareFunction( me, "inference_no_free_hl_varsP", "INFERENCE-NO-FREE-HL-VARS?", 1, 0, false );
    SubLFiles.declareFunction( me, "inference_free_el_vars", "INFERENCE-FREE-EL-VARS", 1, 0, false );
    SubLFiles.declareFunction( me, "inference_input_query_property", "INFERENCE-INPUT-QUERY-PROPERTY", 2, 1, false );
    SubLFiles.declareFunction( me, "inference_to_new_cyc_query_arguments", "INFERENCE-TO-NEW-CYC-QUERY-ARGUMENTS", 1, 0, false );
    SubLFiles.declareFunction( me, "inference_to_new_cyc_query_form", "INFERENCE-TO-NEW-CYC-QUERY-FORM", 1, 0, false );
    SubLFiles.declareFunction( me, "inference_to_new_cyc_query_form_string", "INFERENCE-TO-NEW-CYC-QUERY-FORM-STRING", 1, 0, false );
    SubLFiles.declareFunction( me, "inference_args_to_new_cyc_query_form_string", "INFERENCE-ARGS-TO-NEW-CYC-QUERY-FORM-STRING", 3, 0, false );
    SubLFiles.declareFunction( me, "inference_root_mapped_problem", "INFERENCE-ROOT-MAPPED-PROBLEM", 1, 0, false );
    SubLFiles.declareFunction( me, "inference_root_problem", "INFERENCE-ROOT-PROBLEM", 1, 0, false );
    SubLFiles.declareFunction( me, "inference_unique_wrt_proofsP", "INFERENCE-UNIQUE-WRT-PROOFS?", 1, 0, false );
    SubLFiles.declareFunction( me, "inference_unique_wrt_bindingsP", "INFERENCE-UNIQUE-WRT-BINDINGS?", 1, 0, false );
    SubLFiles.declareFunction( me, "inference_compute_answer_justificationsP", "INFERENCE-COMPUTE-ANSWER-JUSTIFICATIONS?", 1, 0, false );
    SubLFiles.declareFunction( me, "inference_computes_metricsP", "INFERENCE-COMPUTES-METRICS?", 1, 0, false );
    SubLFiles.declareFunction( me, "inference_computes_metricP", "INFERENCE-COMPUTES-METRIC?", 2, 0, false );
    SubLFiles.declareFunction( me, "inference_problem_store_private_wrt_dynamic_propertiesP", "INFERENCE-PROBLEM-STORE-PRIVATE-WRT-DYNAMIC-PROPERTIES?", 1, 0, false );
    SubLFiles.declareFunction( me, "inference_dynamic_properties_exhaustiveP", "INFERENCE-DYNAMIC-PROPERTIES-EXHAUSTIVE?", 1, 0, false );
    SubLFiles.declareFunction( me, "inference_allows_use_of_all_rulesP", "INFERENCE-ALLOWS-USE-OF-ALL-RULES?", 1, 0, false );
    SubLFiles.declareFunction( me, "inference_allows_use_of_ruleP", "INFERENCE-ALLOWS-USE-OF-RULE?", 2, 0, false );
    SubLFiles.declareFunction( me, "inference_filter_rules", "INFERENCE-FILTER-RULES", 2, 0, false );
    SubLFiles.declareFunction( me, "inference_allows_use_of_all_modulesP", "INFERENCE-ALLOWS-USE-OF-ALL-MODULES?", 1, 0, false );
    SubLFiles.declareFunction( me, "inference_allows_use_of_moduleP", "INFERENCE-ALLOWS-USE-OF-MODULE?", 2, 0, false );
    SubLFiles.declareFunction( me, "inference_forget_extra_resultsP", "INFERENCE-FORGET-EXTRA-RESULTS?", 1, 0, false );
    SubLFiles.declareFunction( me, "inference_has_some_answerP", "INFERENCE-HAS-SOME-ANSWER?", 1, 0, false );
    SubLFiles.declareFunction( me, "find_inference_answer_by_id", "FIND-INFERENCE-ANSWER-BY-ID", 2, 0, false );
    SubLFiles.declareFunction( me, "find_inference_answer_by_ids", "FIND-INFERENCE-ANSWER-BY-IDS", 3, 0, false );
    SubLFiles.declareFunction( me, "inference_answer_signature", "INFERENCE-ANSWER-SIGNATURE", 1, 0, false );
    SubLFiles.declareFunction( me, "find_inference_answer_from_signature", "FIND-INFERENCE-ANSWER-FROM-SIGNATURE", 1, 0, false );
    SubLFiles.declareFunction( me, "inference_first_answer", "INFERENCE-FIRST-ANSWER", 1, 0, false );
    SubLFiles.declareFunction( me, "inference_last_answer", "INFERENCE-LAST-ANSWER", 1, 0, false );
    SubLFiles.declareFunction( me, "inference_first_answer_with_id_or_greater", "INFERENCE-FIRST-ANSWER-WITH-ID-OR-GREATER", 2, 0, false );
    SubLFiles.declareFunction( me, "inference_first_answer_elapsed_time", "INFERENCE-FIRST-ANSWER-ELAPSED-TIME", 1, 0, false );
    SubLFiles.declareFunction( me, "inference_first_answer_step_count", "INFERENCE-FIRST-ANSWER-STEP-COUNT", 1, 0, false );
    SubLFiles.declareFunction( me, "inference_last_answer_elapsed_time", "INFERENCE-LAST-ANSWER-ELAPSED-TIME", 1, 0, false );
    SubLFiles.declareFunction( me, "inference_last_answer_step_count", "INFERENCE-LAST-ANSWER-STEP-COUNT", 1, 0, false );
    SubLFiles.declareFunction( me, "inference_last_answer_id", "INFERENCE-LAST-ANSWER-ID", 1, 0, false );
    SubLFiles.declareFunction( me, "inference_answer_count_at_elapsed_time", "INFERENCE-ANSWER-COUNT-AT-ELAPSED-TIME", 2, 0, false );
    SubLFiles.declareFunction( me, "inference_answer_count_at_30_seconds", "INFERENCE-ANSWER-COUNT-AT-30-SECONDS", 1, 0, false );
    SubLFiles.declareFunction( me, "inference_answer_count_at_60_seconds", "INFERENCE-ANSWER-COUNT-AT-60-SECONDS", 1, 0, false );
    SubLFiles.declareFunction( me, "inference_answer_times", "INFERENCE-ANSWER-TIMES", 1, 0, false );
    SubLFiles.declareFunction( me, "inference_answer_step_counts", "INFERENCE-ANSWER-STEP-COUNTS", 1, 0, false );
    SubLFiles.declareFunction( me, "inference_new_root_metrics", "INFERENCE-NEW-ROOT-METRICS", 1, 0, false );
    SubLFiles.declareFunction( me, "inference_end_universal_time", "INFERENCE-END-UNIVERSAL-TIME", 1, 0, false );
    SubLFiles.declareFunction( me, "inference_maintain_term_working_setP", "INFERENCE-MAINTAIN-TERM-WORKING-SET?", 1, 0, false );
    SubLFiles.declareFunction( me, "inference_halt_condition_presentP", "INFERENCE-HALT-CONDITION-PRESENT?", 2, 0, false );
    SubLFiles.declareFunction( me, "add_inference_accumulator", "ADD-INFERENCE-ACCUMULATOR", 3, 0, false );
    SubLFiles.declareFunction( me, "inference_accumulator", "INFERENCE-ACCUMULATOR", 2, 0, false );
    SubLFiles.declareFunction( me, "inference_accumulator_contents", "INFERENCE-ACCUMULATOR-CONTENTS", 2, 0, false );
    SubLFiles.declareFunction( me, "inference_accumulate", "INFERENCE-ACCUMULATE", 3, 0, false );
    SubLFiles.declareFunction( me, "set_inference_proof_watermark", "SET-INFERENCE-PROOF-WATERMARK", 2, 0, false );
    SubLFiles.declareFunction( me, "compute_inference_pad_internal_real_time", "COMPUTE-INFERENCE-PAD-INTERNAL-REAL-TIME", 1, 0, false );
    SubLFiles.declareFunction( me, "initialize_pad_table", "INITIALIZE-PAD-TABLE", 1, 0, false );
    SubLFiles.declareFunction( me, "pad_table_initializedP", "PAD-TABLE-INITIALIZED?", 0, 0, false );
    SubLFiles.declareFunction( me, "probably_approximately_done_cutoff_time", "PROBABLY-APPROXIMATELY-DONE-CUTOFF-TIME", 1, 0, false );
    SubLFiles.declareFunction( me, "compute_pad_from_time", "COMPUTE-PAD-FROM-TIME", 1, 0, false );
    SubLFiles.declareFunction( me, "inference_note_transformation_depth", "INFERENCE-NOTE-TRANSFORMATION-DEPTH", 2, 0, false );
    SubLFiles.declareFunction( me, "inference_note_new_transformation_depth_reached", "INFERENCE-NOTE-NEW-TRANSFORMATION-DEPTH-REACHED", 2, 0, false );
    SubLFiles.declareFunction( me, "find_inference_answer_by_bindings", "FIND-INFERENCE-ANSWER-BY-BINDINGS", 2, 0, false );
    SubLFiles.declareFunction( me, "new_inference_answer_id", "NEW-INFERENCE-ANSWER-ID", 1, 0, false );
    SubLFiles.declareFunction( me, "inference_count", "INFERENCE-COUNT", 0, 0, false );
    SubLFiles.declareFunction( me, "inference_all_answers", "INFERENCE-ALL-ANSWERS", 1, 1, false );
    SubLFiles.declareFunction( me, "inference_all_new_answers", "INFERENCE-ALL-NEW-ANSWERS", 1, 0, false );
    SubLFiles.declareFunction( me, "inference_allowed_rules_list", "INFERENCE-ALLOWED-RULES-LIST", 1, 0, false );
    SubLFiles.declareFunction( me, "inference_allowed_rule_count", "INFERENCE-ALLOWED-RULE-COUNT", 1, 0, false );
    SubLFiles.declareFunction( me, "inference_forbidden_rules_list", "INFERENCE-FORBIDDEN-RULES-LIST", 1, 0, false );
    SubLFiles.declareFunction( me, "inference_forbidden_rule_count", "INFERENCE-FORBIDDEN-RULE-COUNT", 1, 0, false );
    SubLFiles.declareFunction( me, "inference_interrupt_signaledP", "INFERENCE-INTERRUPT-SIGNALED?", 1, 0, false );
    SubLFiles.declareFunction( me, "inference_no_interrupt_signaledP", "INFERENCE-NO-INTERRUPT-SIGNALED?", 1, 0, false );
    SubLFiles.declareFunction( me, "inference_interrupt_handledP", "INFERENCE-INTERRUPT-HANDLED?", 1, 0, false );
    SubLFiles.declareFunction( me, "inference_answer_count", "INFERENCE-ANSWER-COUNT", 1, 0, false );
    SubLFiles.declareFunction( me, "inference_new_answer_count", "INFERENCE-NEW-ANSWER-COUNT", 1, 0, false );
    SubLFiles.declareFunction( me, "successful_inference_p", "SUCCESSFUL-INFERENCE-P", 1, 0, false );
    SubLFiles.declareFunction( me, "inference_new_justification_count", "INFERENCE-NEW-JUSTIFICATION-COUNT", 1, 0, false );
    SubLFiles.declareFunction( me, "inference_new_result_count", "INFERENCE-NEW-RESULT-COUNT", 1, 0, false );
    SubLFiles.declareFunction( me, "forward_inference_p", "FORWARD-INFERENCE-P", 1, 0, false );
    SubLFiles.declareFunction( me, "backward_inference_p", "BACKWARD-INFERENCE-P", 1, 0, false );
    SubLFiles.declareFunction( me, "abductive_inference_p", "ABDUCTIVE-INFERENCE-P", 1, 0, false );
    SubLFiles.declareFunction( me, "inference_provability_status", "INFERENCE-PROVABILITY-STATUS", 1, 0, false );
    SubLFiles.declareFunction( me, "good_inference_p", "GOOD-INFERENCE-P", 1, 0, false );
    SubLFiles.declareFunction( me, "neutral_inference_p", "NEUTRAL-INFERENCE-P", 1, 0, false );
    SubLFiles.declareFunction( me, "no_good_inference_p", "NO-GOOD-INFERENCE-P", 1, 0, false );
    SubLFiles.declareFunction( me, "closed_inference_p", "CLOSED-INFERENCE-P", 1, 0, false );
    SubLFiles.declareFunction( me, "inference_set_static_properties", "INFERENCE-SET-STATIC-PROPERTIES", 2, 0, false );
    SubLFiles.declareFunction( me, "update_inference_input_query_properties", "UPDATE-INFERENCE-INPUT-QUERY-PROPERTIES", 2, 0, false );
    SubLFiles.declareFunction( me, "add_inference_relevant_problem", "ADD-INFERENCE-RELEVANT-PROBLEM", 2, 0, false );
    SubLFiles.declareFunction( me, "remove_inference_relevant_problem", "REMOVE-INFERENCE-RELEVANT-PROBLEM", 2, 0, false );
    SubLFiles.declareFunction( me, "clear_inference_relevant_problems", "CLEAR-INFERENCE-RELEVANT-PROBLEMS", 1, 0, false );
    SubLFiles.declareFunction( me, "add_inference_strategy", "ADD-INFERENCE-STRATEGY", 2, 0, false );
    SubLFiles.declareFunction( me, "remove_inference_strategy", "REMOVE-INFERENCE-STRATEGY", 2, 0, false );
    SubLFiles.declareFunction( me, "clear_inference_strategy_set", "CLEAR-INFERENCE-STRATEGY-SET", 1, 0, false );
    SubLFiles.declareFunction( me, "reset_inference_new_answer_id", "RESET-INFERENCE-NEW-ANSWER-ID", 1, 0, false );
    SubLFiles.declareFunction( me, "inference_next_new_answer_id", "INFERENCE-NEXT-NEW-ANSWER-ID", 1, 0, false );
    SubLFiles.declareFunction( me, "add_inference_new_answer_by_id", "ADD-INFERENCE-NEW-ANSWER-BY-ID", 2, 0, false );
    SubLFiles.declareFunction( me, "remove_inference_new_answer_by_id", "REMOVE-INFERENCE-NEW-ANSWER-BY-ID", 2, 0, false );
    SubLFiles.declareFunction( me, "add_inference_new_answer_by_bindings", "ADD-INFERENCE-NEW-ANSWER-BY-BINDINGS", 2, 0, false );
    SubLFiles.declareFunction( me, "remove_inference_new_answer_by_bindings", "REMOVE-INFERENCE-NEW-ANSWER-BY-BINDINGS", 2, 0, false );
    SubLFiles.declareFunction( me, "reset_inference_new_answer_justifications", "RESET-INFERENCE-NEW-ANSWER-JUSTIFICATIONS", 1, 0, false );
    SubLFiles.declareFunction( me, "add_inference_new_answer_justification", "ADD-INFERENCE-NEW-ANSWER-JUSTIFICATION", 2, 0, false );
    SubLFiles.declareFunction( me, "remove_inference_new_answer_justification", "REMOVE-INFERENCE-NEW-ANSWER-JUSTIFICATION", 2, 0, false );
    SubLFiles.declareFunction( me, "clear_inference_control_process", "CLEAR-INFERENCE-CONTROL-PROCESS", 1, 0, false );
    SubLFiles.declareFunction( me, "set_inference_control_process_to_me", "SET-INFERENCE-CONTROL-PROCESS-TO-ME", 1, 0, false );
    SubLFiles.declareFunction( me, "note_inference_interrupt_signaled", "NOTE-INFERENCE-INTERRUPT-SIGNALED", 2, 0, false );
    SubLFiles.declareFunction( me, "increment_inference_cumulative_time", "INCREMENT-INFERENCE-CUMULATIVE-TIME", 2, 0, false );
    SubLFiles.declareFunction( me, "reorder_inference_free_hl_vars", "REORDER-INFERENCE-FREE-HL-VARS", 2, 0, false );
    SubLFiles.declareFunction( me, "reorder_inference_free_el_vars", "REORDER-INFERENCE-FREE-EL-VARS", 2, 0, false );
    SubLFiles.declareFunction( me, "reset_inference_new_answers", "RESET-INFERENCE-NEW-ANSWERS", 1, 0, false );
    SubLFiles.declareFunction( me, "add_inference_new_answer", "ADD-INFERENCE-NEW-ANSWER", 2, 0, false );
    SubLFiles.declareFunction( me, "remove_inference_new_answer", "REMOVE-INFERENCE-NEW-ANSWER", 2, 0, false );
    SubLFiles.declareFunction( me, "initialize_inference_time_properties", "INITIALIZE-INFERENCE-TIME-PROPERTIES", 1, 0, false );
    SubLFiles.declareFunction( me, "finalize_inference_time_properties", "FINALIZE-INFERENCE-TIME-PROPERTIES", 1, 0, false );
    SubLFiles.declareFunction( me, "inference_elapsed_internal_real_time_since_start", "INFERENCE-ELAPSED-INTERNAL-REAL-TIME-SINCE-START", 1, 0, false );
    SubLFiles.declareFunction( me, "inference_elapsed_universal_time_since_start", "INFERENCE-ELAPSED-UNIVERSAL-TIME-SINCE-START", 1, 0, false );
    SubLFiles.declareFunction( me, "inference_time_so_far", "INFERENCE-TIME-SO-FAR", 1, 1, false );
    SubLFiles.declareFunction( me, "inference_remaining_time", "INFERENCE-REMAINING-TIME", 1, 1, false );
    SubLFiles.declareFunction( me, "inference_cumulative_time_so_far", "INFERENCE-CUMULATIVE-TIME-SO-FAR", 1, 1, false );
    SubLFiles.declareFunction( me, "inference_signal_interrupt", "INFERENCE-SIGNAL-INTERRUPT", 1, 0, false );
    SubLFiles.declareFunction( me, "inference_handle_interrupts", "INFERENCE-HANDLE-INTERRUPTS", 1, 0, false );
    SubLFiles.declareFunction( me, "simplest_inference_p", "SIMPLEST-INFERENCE-P", 1, 0, false );
    SubLFiles.declareFunction( me, "new_simplest_inference", "NEW-SIMPLEST-INFERENCE", 1, 0, false );
    SubLFiles.declareFunction( me, "simplest_inference_strategy", "SIMPLEST-INFERENCE-STRATEGY", 1, 0, false );
    SubLFiles.declareFunction( me, "set_simplest_inference_strategy", "SET-SIMPLEST-INFERENCE-STRATEGY", 2, 0, false );
    SubLFiles.declareFunction( me, "new_simplest_inference_of_type", "NEW-SIMPLEST-INFERENCE-OF-TYPE", 2, 0, false );
    SubLFiles.declareFunction( me, "new_simplest_inference_with_new_store", "NEW-SIMPLEST-INFERENCE-WITH-NEW-STORE", 1, 0, false );
    SubLFiles.declareFunction( me, "inference_answer_print_function_trampoline", "INFERENCE-ANSWER-PRINT-FUNCTION-TRAMPOLINE", 2, 0, false );
    SubLFiles.declareFunction( me, "inference_answer_p", "INFERENCE-ANSWER-P", 1, 0, false );
    new $inference_answer_p$UnaryFunction();
    SubLFiles.declareFunction( me, "inf_answer_suid", "INF-ANSWER-SUID", 1, 0, false );
    SubLFiles.declareFunction( me, "inf_answer_inference", "INF-ANSWER-INFERENCE", 1, 0, false );
    SubLFiles.declareFunction( me, "inf_answer_bindings", "INF-ANSWER-BINDINGS", 1, 0, false );
    SubLFiles.declareFunction( me, "inf_answer_justifications", "INF-ANSWER-JUSTIFICATIONS", 1, 0, false );
    SubLFiles.declareFunction( me, "inf_answer_elapsed_creation_time", "INF-ANSWER-ELAPSED-CREATION-TIME", 1, 0, false );
    SubLFiles.declareFunction( me, "inf_answer_step_count", "INF-ANSWER-STEP-COUNT", 1, 0, false );
    SubLFiles.declareFunction( me, "_csetf_inf_answer_suid", "_CSETF-INF-ANSWER-SUID", 2, 0, false );
    SubLFiles.declareFunction( me, "_csetf_inf_answer_inference", "_CSETF-INF-ANSWER-INFERENCE", 2, 0, false );
    SubLFiles.declareFunction( me, "_csetf_inf_answer_bindings", "_CSETF-INF-ANSWER-BINDINGS", 2, 0, false );
    SubLFiles.declareFunction( me, "_csetf_inf_answer_justifications", "_CSETF-INF-ANSWER-JUSTIFICATIONS", 2, 0, false );
    SubLFiles.declareFunction( me, "_csetf_inf_answer_elapsed_creation_time", "_CSETF-INF-ANSWER-ELAPSED-CREATION-TIME", 2, 0, false );
    SubLFiles.declareFunction( me, "_csetf_inf_answer_step_count", "_CSETF-INF-ANSWER-STEP-COUNT", 2, 0, false );
    SubLFiles.declareFunction( me, "make_inference_answer", "MAKE-INFERENCE-ANSWER", 0, 1, false );
    SubLFiles.declareFunction( me, "visit_defstruct_inference_answer", "VISIT-DEFSTRUCT-INFERENCE-ANSWER", 2, 0, false );
    SubLFiles.declareFunction( me, "visit_defstruct_object_inference_answer_method", "VISIT-DEFSTRUCT-OBJECT-INFERENCE-ANSWER-METHOD", 2, 0, false );
    SubLFiles.declareFunction( me, "valid_inference_answer_p", "VALID-INFERENCE-ANSWER-P", 1, 0, false );
    SubLFiles.declareFunction( me, "inference_answer_invalid_p", "INFERENCE-ANSWER-INVALID-P", 1, 0, false );
    SubLFiles.declareFunction( me, "print_inference_answer", "PRINT-INFERENCE-ANSWER", 3, 0, false );
    SubLFiles.declareFunction( me, "sxhash_inference_answer_method", "SXHASH-INFERENCE-ANSWER-METHOD", 1, 0, false );
    SubLFiles.declareFunction( me, "new_inference_answer", "NEW-INFERENCE-ANSWER", 2, 0, false );
    SubLFiles.declareFunction( me, "find_or_create_inference_answer", "FIND-OR-CREATE-INFERENCE-ANSWER", 2, 0, false );
    SubLFiles.declareMacro( me, "do_inference_answer_justifications", "DO-INFERENCE-ANSWER-JUSTIFICATIONS" );
    SubLFiles.declareMacro( me, "do_inference_answer_justifications_numbered", "DO-INFERENCE-ANSWER-JUSTIFICATIONS-NUMBERED" );
    SubLFiles.declareFunction( me, "destroy_inference_answer", "DESTROY-INFERENCE-ANSWER", 1, 0, false );
    SubLFiles.declareFunction( me, "destroy_inference_answer_int", "DESTROY-INFERENCE-ANSWER-INT", 1, 0, false );
    SubLFiles.declareFunction( me, "note_inference_answer_invalid", "NOTE-INFERENCE-ANSWER-INVALID", 1, 0, false );
    SubLFiles.declareFunction( me, "inference_answer_suid", "INFERENCE-ANSWER-SUID", 1, 0, false );
    SubLFiles.declareFunction( me, "inference_answer_inference", "INFERENCE-ANSWER-INFERENCE", 1, 0, false );
    SubLFiles.declareFunction( me, "inference_answer_bindings", "INFERENCE-ANSWER-BINDINGS", 1, 0, false );
    SubLFiles.declareFunction( me, "inference_answer_justifications", "INFERENCE-ANSWER-JUSTIFICATIONS", 1, 0, false );
    SubLFiles.declareFunction( me, "inference_answer_elapsed_creation_time", "INFERENCE-ANSWER-ELAPSED-CREATION-TIME", 1, 0, false );
    SubLFiles.declareFunction( me, "inference_answer_step_count", "INFERENCE-ANSWER-STEP-COUNT", 1, 0, false );
    SubLFiles.declareFunction( me, "set_inference_answer_bindings", "SET-INFERENCE-ANSWER-BINDINGS", 2, 0, false );
    SubLFiles.declareFunction( me, "set_inference_answer_elapsed_creation_time", "SET-INFERENCE-ANSWER-ELAPSED-CREATION-TIME", 2, 0, false );
    SubLFiles.declareFunction( me, "set_inference_answer_step_count", "SET-INFERENCE-ANSWER-STEP-COUNT", 2, 0, false );
    SubLFiles.declareFunction( me, "inference_answer_problem_store", "INFERENCE-ANSWER-PROBLEM-STORE", 1, 0, false );
    SubLFiles.declareFunction( me, "inference_answer_free_el_vars", "INFERENCE-ANSWER-FREE-EL-VARS", 1, 0, false );
    SubLFiles.declareFunction( me, "inference_answer_elapsed_time", "INFERENCE-ANSWER-ELAPSED-TIME", 1, 1, false );
    SubLFiles.declareFunction( me, "inference_answer_creation_time", "INFERENCE-ANSWER-CREATION-TIME", 1, 0, false );
    SubLFiles.declareFunction( me, "find_inference_answer_justification", "FIND-INFERENCE-ANSWER-JUSTIFICATION", 2, 0, false );
    SubLFiles.declareFunction( me, "inference_answer_result_bindings", "INFERENCE-ANSWER-RESULT-BINDINGS", 1, 0, false );
    SubLFiles.declareFunction( me, "inference_answer_bindings_equalP", "INFERENCE-ANSWER-BINDINGS-EQUAL?", 2, 0, false );
    SubLFiles.declareFunction( me, "inference_answer_newP", "INFERENCE-ANSWER-NEW?", 1, 0, false );
    SubLFiles.declareFunction( me, "inference_answer_L", "INFERENCE-ANSWER-<", 2, 0, false );
    SubLFiles.declareFunction( me, "inference_answer_el_sentence", "INFERENCE-ANSWER-EL-SENTENCE", 1, 0, false );
    SubLFiles.declareFunction( me, "inference_answer_justification_count", "INFERENCE-ANSWER-JUSTIFICATION-COUNT", 1, 0, false );
    SubLFiles.declareFunction( me, "add_inference_answer_justification", "ADD-INFERENCE-ANSWER-JUSTIFICATION", 2, 0, false );
    SubLFiles.declareFunction( me, "remove_inference_answer_justification", "REMOVE-INFERENCE-ANSWER-JUSTIFICATION", 2, 0, false );
    SubLFiles.declareFunction( me, "initialize_inference_answer_elapsed_creation_time", "INITIALIZE-INFERENCE-ANSWER-ELAPSED-CREATION-TIME", 1, 0, false );
    SubLFiles.declareFunction( me, "inference_answer_justification_print_function_trampoline", "INFERENCE-ANSWER-JUSTIFICATION-PRINT-FUNCTION-TRAMPOLINE", 2, 0, false );
    SubLFiles.declareFunction( me, "inference_answer_justification_p", "INFERENCE-ANSWER-JUSTIFICATION-P", 1, 0, false );
    new $inference_answer_justification_p$UnaryFunction();
    SubLFiles.declareFunction( me, "inf_ans_just_answer", "INF-ANS-JUST-ANSWER", 1, 0, false );
    SubLFiles.declareFunction( me, "inf_ans_just_supports", "INF-ANS-JUST-SUPPORTS", 1, 0, false );
    SubLFiles.declareFunction( me, "inf_ans_just_pragma_supports", "INF-ANS-JUST-PRAGMA-SUPPORTS", 1, 0, false );
    SubLFiles.declareFunction( me, "inf_ans_just_proofs", "INF-ANS-JUST-PROOFS", 1, 0, false );
    SubLFiles.declareFunction( me, "_csetf_inf_ans_just_answer", "_CSETF-INF-ANS-JUST-ANSWER", 2, 0, false );
    SubLFiles.declareFunction( me, "_csetf_inf_ans_just_supports", "_CSETF-INF-ANS-JUST-SUPPORTS", 2, 0, false );
    SubLFiles.declareFunction( me, "_csetf_inf_ans_just_pragma_supports", "_CSETF-INF-ANS-JUST-PRAGMA-SUPPORTS", 2, 0, false );
    SubLFiles.declareFunction( me, "_csetf_inf_ans_just_proofs", "_CSETF-INF-ANS-JUST-PROOFS", 2, 0, false );
    SubLFiles.declareFunction( me, "make_inference_answer_justification", "MAKE-INFERENCE-ANSWER-JUSTIFICATION", 0, 1, false );
    SubLFiles.declareFunction( me, "visit_defstruct_inference_answer_justification", "VISIT-DEFSTRUCT-INFERENCE-ANSWER-JUSTIFICATION", 2, 0, false );
    SubLFiles.declareFunction( me, "visit_defstruct_object_inference_answer_justification_method", "VISIT-DEFSTRUCT-OBJECT-INFERENCE-ANSWER-JUSTIFICATION-METHOD", 2, 0, false );
    SubLFiles.declareFunction( me, "valid_inference_answer_justification_p", "VALID-INFERENCE-ANSWER-JUSTIFICATION-P", 1, 0, false );
    SubLFiles.declareFunction( me, "inference_answer_justification_invalid_p", "INFERENCE-ANSWER-JUSTIFICATION-INVALID-P", 1, 0, false );
    SubLFiles.declareFunction( me, "print_inference_answer_justification", "PRINT-INFERENCE-ANSWER-JUSTIFICATION", 3, 0, false );
    SubLFiles.declareFunction( me, "sxhash_inference_answer_justification_method", "SXHASH-INFERENCE-ANSWER-JUSTIFICATION-METHOD", 1, 0, false );
    SubLFiles.declareFunction( me, "list_of_inference_answer_justification_p", "LIST-OF-INFERENCE-ANSWER-JUSTIFICATION-P", 1, 0, false );
    SubLFiles.declareFunction( me, "new_inference_answer_justification", "NEW-INFERENCE-ANSWER-JUSTIFICATION", 3, 0, false );
    SubLFiles.declareFunction( me, "find_or_create_inference_answer_justification", "FIND-OR-CREATE-INFERENCE-ANSWER-JUSTIFICATION", 4, 0, false );
    SubLFiles.declareFunction( me, "subst_indexical_referents_into_answer_bindings", "SUBST-INDEXICAL-REFERENTS-INTO-ANSWER-BINDINGS", 2, 0, false );
    SubLFiles.declareFunction( me, "destroy_inference_answer_justification", "DESTROY-INFERENCE-ANSWER-JUSTIFICATION", 1, 0, false );
    SubLFiles.declareFunction( me, "destroy_inference_answer_justification_int", "DESTROY-INFERENCE-ANSWER-JUSTIFICATION-INT", 1, 0, false );
    SubLFiles.declareFunction( me, "note_inference_answer_justification_invalid", "NOTE-INFERENCE-ANSWER-JUSTIFICATION-INVALID", 1, 0, false );
    SubLFiles.declareFunction( me, "inference_answer_justification_answer", "INFERENCE-ANSWER-JUSTIFICATION-ANSWER", 1, 0, false );
    SubLFiles.declareFunction( me, "inference_answer_justification_supports", "INFERENCE-ANSWER-JUSTIFICATION-SUPPORTS", 1, 0, false );
    new $inference_answer_justification_supports$UnaryFunction();
    SubLFiles.declareFunction( me, "inference_answer_justification_pragmatic_supports", "INFERENCE-ANSWER-JUSTIFICATION-PRAGMATIC-SUPPORTS", 1, 0, false );
    SubLFiles.declareFunction( me, "inference_answer_justification_proofs", "INFERENCE-ANSWER-JUSTIFICATION-PROOFS", 1, 0, false );
    SubLFiles.declareMacro( me, "do_inference_answer_justification_proofs", "DO-INFERENCE-ANSWER-JUSTIFICATION-PROOFS" );
    SubLFiles.declareMacro( me, "do_proof_dependent_inference_answer_justifications", "DO-PROOF-DEPENDENT-INFERENCE-ANSWER-JUSTIFICATIONS" );
    SubLFiles.declareMacro( me, "do_inference_all_subproofs", "DO-INFERENCE-ALL-SUBPROOFS" );
    SubLFiles.declareFunction( me, "inference_answer_first_justification", "INFERENCE-ANSWER-FIRST-JUSTIFICATION", 1, 0, false );
    SubLFiles.declareFunction( me, "inference_answer_justification_first_proof", "INFERENCE-ANSWER-JUSTIFICATION-FIRST-PROOF", 1, 0, false );
    SubLFiles.declareFunction( me, "inference_first_proof", "INFERENCE-FIRST-PROOF", 1, 0, false );
    SubLFiles.declareFunction( me, "inference_answer_justification_inference", "INFERENCE-ANSWER-JUSTIFICATION-INFERENCE", 1, 0, false );
    SubLFiles.declareFunction( me, "inference_answer_justification_store", "INFERENCE-ANSWER-JUSTIFICATION-STORE", 1, 0, false );
    SubLFiles.declareFunction( me, "inference_answer_justification_rules", "INFERENCE-ANSWER-JUSTIFICATION-RULES", 1, 0, false );
    SubLFiles.declareFunction( me, "add_inference_answer_justification_proof", "ADD-INFERENCE-ANSWER-JUSTIFICATION-PROOF", 2, 0, false );
    SubLFiles.declareFunction( me, "new_inference_answer_justification_from_proof", "NEW-INFERENCE-ANSWER-JUSTIFICATION-FROM-PROOF", 4, 0, false );
    SubLFiles.declareFunction( me, "inference_answer_justification_to_tms_deduction_spec", "INFERENCE-ANSWER-JUSTIFICATION-TO-TMS-DEDUCTION-SPEC", 2, 0, false );
    SubLFiles.declareFunction( me, "inference_answer_justification_to_true_tms_deduction_spec", "INFERENCE-ANSWER-JUSTIFICATION-TO-TRUE-TMS-DEDUCTION-SPEC", 1, 0, false );
    SubLFiles.declareFunction( me, "inference_answer_justification_to_false_tms_deduction_spec", "INFERENCE-ANSWER-JUSTIFICATION-TO-FALSE-TMS-DEDUCTION-SPEC", 1, 0, false );
    SubLFiles.declareFunction( me, "destroy_proof_inference_answer_justifications", "DESTROY-PROOF-INFERENCE-ANSWER-JUSTIFICATIONS", 1, 0, false );
    SubLFiles.declareFunction( me, "inference_time_per_answer", "INFERENCE-TIME-PER-ANSWER", 1, 0, false );
    SubLFiles.declareFunction( me, "inference_steps_per_answer", "INFERENCE-STEPS-PER-ANSWER", 1, 0, false );
    SubLFiles.declareFunction( me, "inference_wasted_time_after_last_answer", "INFERENCE-WASTED-TIME-AFTER-LAST-ANSWER", 1, 0, false );
    SubLFiles.declareFunction( me, "inference_latency_improvement_from_iterativity", "INFERENCE-LATENCY-IMPROVEMENT-FROM-ITERATIVITY", 1, 0, false );
    SubLFiles.declareFunction( me, "inference_metrics", "INFERENCE-METRICS", 1, 0, false );
    SubLFiles.declareFunction( me, "inference_compute_metrics", "INFERENCE-COMPUTE-METRICS", 1, 0, false );
    SubLFiles.declareFunction( me, "inference_compute_metrics_plist", "INFERENCE-COMPUTE-METRICS-PLIST", 2, 0, false );
    SubLFiles.declareFunction( me, "inference_compute_metrics_alist", "INFERENCE-COMPUTE-METRICS-ALIST", 2, 0, false );
    SubLFiles.declareFunction( me, "inference_transformation_rules_in_answers", "INFERENCE-TRANSFORMATION-RULES-IN-ANSWERS", 1, 0, false );
    SubLFiles.declareFunction( me, "inference_all_answer_proofs", "INFERENCE-ALL-ANSWER-PROOFS", 1, 0, false );
    SubLFiles.declareFunction( me, "inference_all_answer_subproofs", "INFERENCE-ALL-ANSWER-SUBPROOFS", 1, 0, false );
    SubLFiles.declareFunction( me, "inference_answer_justification_all_subproofs", "INFERENCE-ANSWER-JUSTIFICATION-ALL-SUBPROOFS", 1, 0, false );
    SubLFiles.declareFunction( me, "inference_all_answer_supports", "INFERENCE-ALL-ANSWER-SUPPORTS", 1, 0, false );
    SubLFiles.declareFunction( me, "inference_all_answer_modules", "INFERENCE-ALL-ANSWER-MODULES", 1, 0, false );
    SubLFiles.declareFunction( me, "problem_relevant_to_some_strategyP", "PROBLEM-RELEVANT-TO-SOME-STRATEGY?", 1, 0, false );
    SubLFiles.declareFunction( me, "first_problem_relevant_strategy", "FIRST-PROBLEM-RELEVANT-STRATEGY", 1, 0, false );
    SubLFiles.declareFunction( me, "problem_or_inference_p", "PROBLEM-OR-INFERENCE-P", 1, 0, false );
    SubLFiles.declareMacro( me, "with_inference_problem_working_time_table", "WITH-INFERENCE-PROBLEM-WORKING-TIME-TABLE" );
    SubLFiles.declareFunction( me, "inference_problem_working_time_lock", "INFERENCE-PROBLEM-WORKING-TIME-LOCK", 1, 0, false );
    SubLFiles.declareFunction( me, "inference_problem_working_time_table", "INFERENCE-PROBLEM-WORKING-TIME-TABLE", 1, 0, false );
    SubLFiles.declareFunction( me, "initialize_inference_problem_working_time_data", "INITIALIZE-INFERENCE-PROBLEM-WORKING-TIME-DATA", 1, 0, false );
    SubLFiles.declareFunction( me, "inference_note_tactic_executed", "INFERENCE-NOTE-TACTIC-EXECUTED", 2, 0, false );
    SubLFiles.declareFunction( me, "inference_note_problem_pending", "INFERENCE-NOTE-PROBLEM-PENDING", 2, 0, false );
    SubLFiles.declareFunction( me, "signal_inference_eventP", "SIGNAL-INFERENCE-EVENT?", 2, 0, false );
    SubLFiles.declareFunction( me, "possibly_signal_new_inference_answer", "POSSIBLY-SIGNAL-NEW-INFERENCE-ANSWER", 2, 0, false );
    SubLFiles.declareFunction( me, "signal_new_inference_answer", "SIGNAL-NEW-INFERENCE-ANSWER", 2, 0, false );
    SubLFiles.declareFunction( me, "possibly_signal_inference_status_change", "POSSIBLY-SIGNAL-INFERENCE-STATUS-CHANGE", 1, 0, false );
    SubLFiles.declareFunction( me, "signal_inference_status_change", "SIGNAL-INFERENCE-STATUS-CHANGE", 2, 0, false );
    SubLFiles.declareFunction( me, "possibly_signal_inference_new_transformation_depth_reached", "POSSIBLY-SIGNAL-INFERENCE-NEW-TRANSFORMATION-DEPTH-REACHED", 2, 0, false );
    SubLFiles.declareFunction( me, "signal_inference_new_transformation_depth_reached", "SIGNAL-INFERENCE-NEW-TRANSFORMATION-DEPTH-REACHED", 2, 0, false );
    SubLFiles.declareMacro( me, "inference_within_sksi_query_execution", "INFERENCE-WITHIN-SKSI-QUERY-EXECUTION" );
    SubLFiles.declareFunction( me, "possibly_signal_sksi_query_start", "POSSIBLY-SIGNAL-SKSI-QUERY-START", 2, 0, false );
    SubLFiles.declareFunction( me, "possibly_signal_sksi_query_end", "POSSIBLY-SIGNAL-SKSI-QUERY-END", 2, 0, false );
    SubLFiles.declareFunction( me, "possibly_increment_inference_sksi_query_total_time", "POSSIBLY-INCREMENT-INFERENCE-SKSI-QUERY-TOTAL-TIME", 2, 0, false );
    SubLFiles.declareFunction( me, "possibly_add_inference_sksi_query_start_time", "POSSIBLY-ADD-INFERENCE-SKSI-QUERY-START-TIME", 2, 0, false );
    SubLFiles.declareFunction( me, "possibly_signal_sksi_query", "POSSIBLY-SIGNAL-SKSI-QUERY", 3, 1, false );
    SubLFiles.declareFunction( me, "signal_sksi_query", "SIGNAL-SKSI-QUERY", 3, 1, false );
    SubLFiles.declareMacro( me, "inference_within_sparql_query_execution", "INFERENCE-WITHIN-SPARQL-QUERY-EXECUTION" );
    SubLFiles.declareFunction( me, "possibly_add_inference_sparql_query_profile", "POSSIBLY-ADD-INFERENCE-SPARQL-QUERY-PROFILE", 4, 0, false );
    SubLFiles.declareFunction( me, "increment_inference_sksi_query_total_time", "INCREMENT-INFERENCE-SKSI-QUERY-TOTAL-TIME", 2, 0, false );
    SubLFiles.declareFunction( me, "add_inference_sksi_query_start_time", "ADD-INFERENCE-SKSI-QUERY-START-TIME", 2, 0, false );
    SubLFiles.declareFunction( me, "add_inference_sparql_query_profile", "ADD-INFERENCE-SPARQL-QUERY-PROFILE", 2, 0, false );
    return NIL;
  }

  public static SubLObject init_inference_datastructures_inference_file()
  {
    $inference_types$ = SubLFiles.deflexical( "*INFERENCE-TYPES*", $list0 );
    $dtp_inference$ = SubLFiles.defconstant( "*DTP-INFERENCE*", $sym1$INFERENCE );
    $pad_times_to_first_answer$ = SubLFiles.deflexical( "*PAD-TIMES-TO-FIRST-ANSWER*", ( maybeDefault( $sym416$_PAD_TIMES_TO_FIRST_ANSWER_, $pad_times_to_first_answer$, $kw417$UNINITIALIZED ) ) );
    $dtp_inference_answer$ = SubLFiles.defconstant( "*DTP-INFERENCE-ANSWER*", $sym441$INFERENCE_ANSWER );
    $dtp_inference_answer_justification$ = SubLFiles.defconstant( "*DTP-INFERENCE-ANSWER-JUSTIFICATION*", $sym481$INFERENCE_ANSWER_JUSTIFICATION );
    return NIL;
  }

  public static SubLObject setup_inference_datastructures_inference_file()
  {
    Structures.register_method( print_high.$print_object_method_table$.getGlobalValue(), $dtp_inference$.getGlobalValue(), Symbols.symbol_function( $sym60$INFERENCE_PRINT_FUNCTION_TRAMPOLINE ) );
    SubLSpecialOperatorDeclarations.proclaim( $list61 );
    Structures.def_csetf( $sym62$INFRNC_SUID, $sym63$_CSETF_INFRNC_SUID );
    Structures.def_csetf( $sym64$INFRNC_PROBLEM_STORE, $sym65$_CSETF_INFRNC_PROBLEM_STORE );
    Structures.def_csetf( $sym66$INFRNC_FORWARD_PROPAGATE, $sym67$_CSETF_INFRNC_FORWARD_PROPAGATE );
    Structures.def_csetf( $sym68$INFRNC_INPUT_MT, $sym69$_CSETF_INFRNC_INPUT_MT );
    Structures.def_csetf( $sym70$INFRNC_INPUT_EL_QUERY, $sym71$_CSETF_INFRNC_INPUT_EL_QUERY );
    Structures.def_csetf( $sym72$INFRNC_INPUT_NON_EXPLANATORY_EL_QUERY, $sym73$_CSETF_INFRNC_INPUT_NON_EXPLANATORY_EL_QUERY );
    Structures.def_csetf( $sym74$INFRNC_INPUT_QUERY_PROPERTIES, $sym75$_CSETF_INFRNC_INPUT_QUERY_PROPERTIES );
    Structures.def_csetf( $sym76$INFRNC_MT, $sym77$_CSETF_INFRNC_MT );
    Structures.def_csetf( $sym78$INFRNC_EL_QUERY, $sym79$_CSETF_INFRNC_EL_QUERY );
    Structures.def_csetf( $sym80$INFRNC_EL_BINDINGS, $sym81$_CSETF_INFRNC_EL_BINDINGS );
    Structures.def_csetf( $sym82$INFRNC_HL_QUERY, $sym83$_CSETF_INFRNC_HL_QUERY );
    Structures.def_csetf( $sym84$INFRNC_EXPLANATORY_SUBQUERY, $sym85$_CSETF_INFRNC_EXPLANATORY_SUBQUERY );
    Structures.def_csetf( $sym86$INFRNC_NON_EXPLANATORY_SUBQUERY, $sym87$_CSETF_INFRNC_NON_EXPLANATORY_SUBQUERY );
    Structures.def_csetf( $sym88$INFRNC_FREE_HL_VARS, $sym89$_CSETF_INFRNC_FREE_HL_VARS );
    Structures.def_csetf( $sym90$INFRNC_HYPOTHETICAL_BINDINGS, $sym91$_CSETF_INFRNC_HYPOTHETICAL_BINDINGS );
    Structures.def_csetf( $sym92$INFRNC_ANSWER_ID_INDEX, $sym93$_CSETF_INFRNC_ANSWER_ID_INDEX );
    Structures.def_csetf( $sym94$INFRNC_ANSWER_BINDINGS_INDEX, $sym95$_CSETF_INFRNC_ANSWER_BINDINGS_INDEX );
    Structures.def_csetf( $sym96$INFRNC_NEW_ANSWER_ID_START, $sym97$_CSETF_INFRNC_NEW_ANSWER_ID_START );
    Structures.def_csetf( $sym98$INFRNC_NEW_ANSWER_JUSTIFICATIONS, $sym99$_CSETF_INFRNC_NEW_ANSWER_JUSTIFICATIONS );
    Structures.def_csetf( $sym100$INFRNC_STATUS, $sym101$_CSETF_INFRNC_STATUS );
    Structures.def_csetf( $sym102$INFRNC_SUSPEND_STATUS, $sym103$_CSETF_INFRNC_SUSPEND_STATUS );
    Structures.def_csetf( $sym104$INFRNC_ROOT_LINK, $sym105$_CSETF_INFRNC_ROOT_LINK );
    Structures.def_csetf( $sym106$INFRNC_RELEVANT_PROBLEMS, $sym107$_CSETF_INFRNC_RELEVANT_PROBLEMS );
    Structures.def_csetf( $sym108$INFRNC_STRATEGY_SET, $sym109$_CSETF_INFRNC_STRATEGY_SET );
    Structures.def_csetf( $sym110$INFRNC_CONTROL_PROCESS, $sym111$_CSETF_INFRNC_CONTROL_PROCESS );
    Structures.def_csetf( $sym112$INFRNC_INTERRUPTING_PROCESSES, $sym113$_CSETF_INFRNC_INTERRUPTING_PROCESSES );
    Structures.def_csetf( $sym114$INFRNC_MAX_TRANSFORMATION_DEPTH_REACHED, $sym115$_CSETF_INFRNC_MAX_TRANSFORMATION_DEPTH_REACHED );
    Structures.def_csetf( $sym116$INFRNC_DISJUNCTION_FREE_EL_VARS_POLICY, $sym117$_CSETF_INFRNC_DISJUNCTION_FREE_EL_VARS_POLICY );
    Structures.def_csetf( $sym118$INFRNC_RESULT_UNIQUENESS_CRITERION, $sym119$_CSETF_INFRNC_RESULT_UNIQUENESS_CRITERION );
    Structures.def_csetf( $sym120$INFRNC_ALLOW_HL_PREDICATE_TRANSFORMATION_, $sym121$_CSETF_INFRNC_ALLOW_HL_PREDICATE_TRANSFORMATION_ );
    Structures.def_csetf( $sym122$INFRNC_ALLOW_UNBOUND_PREDICATE_TRANSFORMATION_, $sym123$_CSETF_INFRNC_ALLOW_UNBOUND_PREDICATE_TRANSFORMATION_ );
    Structures.def_csetf( $sym124$INFRNC_ALLOW_EVALUATABLE_PREDICATE_TRANSFORMATION_, $sym125$_CSETF_INFRNC_ALLOW_EVALUATABLE_PREDICATE_TRANSFORMATION_ );
    Structures.def_csetf( $sym126$INFRNC_ALLOW_INDETERMINATE_RESULTS_, $sym127$_CSETF_INFRNC_ALLOW_INDETERMINATE_RESULTS_ );
    Structures.def_csetf( $sym128$INFRNC_ALLOWED_RULES, $sym129$_CSETF_INFRNC_ALLOWED_RULES );
    Structures.def_csetf( $sym130$INFRNC_FORBIDDEN_RULES, $sym131$_CSETF_INFRNC_FORBIDDEN_RULES );
    Structures.def_csetf( $sym132$INFRNC_ALLOWED_MODULES, $sym133$_CSETF_INFRNC_ALLOWED_MODULES );
    Structures.def_csetf( $sym134$INFRNC_ALLOW_ABNORMALITY_CHECKING_, $sym135$_CSETF_INFRNC_ALLOW_ABNORMALITY_CHECKING_ );
    Structures.def_csetf( $sym136$INFRNC_TRANSITIVE_CLOSURE_MODE, $sym137$_CSETF_INFRNC_TRANSITIVE_CLOSURE_MODE );
    Structures.def_csetf( $sym138$INFRNC_PROBLEM_STORE_PRIVATE_, $sym139$_CSETF_INFRNC_PROBLEM_STORE_PRIVATE_ );
    Structures.def_csetf( $sym140$INFRNC_CONTINUABLE_, $sym141$_CSETF_INFRNC_CONTINUABLE_ );
    Structures.def_csetf( $sym142$INFRNC_BROWSABLE_, $sym143$_CSETF_INFRNC_BROWSABLE_ );
    Structures.def_csetf( $sym144$INFRNC_RETURN_TYPE, $sym145$_CSETF_INFRNC_RETURN_TYPE );
    Structures.def_csetf( $sym146$INFRNC_ANSWER_LANGUAGE, $sym147$_CSETF_INFRNC_ANSWER_LANGUAGE );
    Structures.def_csetf( $sym148$INFRNC_CACHE_RESULTS_, $sym149$_CSETF_INFRNC_CACHE_RESULTS_ );
    Structures.def_csetf( $sym150$INFRNC_BLOCKING_, $sym151$_CSETF_INFRNC_BLOCKING_ );
    Structures.def_csetf( $sym152$INFRNC_MAX_NUMBER, $sym153$_CSETF_INFRNC_MAX_NUMBER );
    Structures.def_csetf( $sym154$INFRNC_MAX_TIME, $sym155$_CSETF_INFRNC_MAX_TIME );
    Structures.def_csetf( $sym156$INFRNC_MAX_STEP, $sym157$_CSETF_INFRNC_MAX_STEP );
    Structures.def_csetf( $sym158$INFRNC_MODE, $sym159$_CSETF_INFRNC_MODE );
    Structures.def_csetf( $sym160$INFRNC_FORWARD_MAX_TIME, $sym161$_CSETF_INFRNC_FORWARD_MAX_TIME );
    Structures.def_csetf( $sym162$INFRNC_MAX_PROOF_DEPTH, $sym163$_CSETF_INFRNC_MAX_PROOF_DEPTH );
    Structures.def_csetf( $sym164$INFRNC_MAX_TRANSFORMATION_DEPTH, $sym165$_CSETF_INFRNC_MAX_TRANSFORMATION_DEPTH );
    Structures.def_csetf( $sym166$INFRNC_MIN_RULE_UTILITY, $sym167$_CSETF_INFRNC_MIN_RULE_UTILITY );
    Structures.def_csetf( $sym168$INFRNC_PROBABLY_APPROXIMATELY_DONE, $sym169$_CSETF_INFRNC_PROBABLY_APPROXIMATELY_DONE );
    Structures.def_csetf( $sym170$INFRNC_METRICS_TEMPLATE, $sym171$_CSETF_INFRNC_METRICS_TEMPLATE );
    Structures.def_csetf( $sym172$INFRNC_START_UNIVERSAL_TIME, $sym173$_CSETF_INFRNC_START_UNIVERSAL_TIME );
    Structures.def_csetf( $sym174$INFRNC_START_INTERNAL_REAL_TIME, $sym175$_CSETF_INFRNC_START_INTERNAL_REAL_TIME );
    Structures.def_csetf( $sym176$INFRNC_END_INTERNAL_REAL_TIME, $sym177$_CSETF_INFRNC_END_INTERNAL_REAL_TIME );
    Structures.def_csetf( $sym178$INFRNC_PAD_INTERNAL_REAL_TIME, $sym179$_CSETF_INFRNC_PAD_INTERNAL_REAL_TIME );
    Structures.def_csetf( $sym180$INFRNC_HYPOTHESIZATION_TIME, $sym181$_CSETF_INFRNC_HYPOTHESIZATION_TIME );
    Structures.def_csetf( $sym182$INFRNC_CUMULATIVE_TIME, $sym183$_CSETF_INFRNC_CUMULATIVE_TIME );
    Structures.def_csetf( $sym184$INFRNC_STEP_COUNT, $sym185$_CSETF_INFRNC_STEP_COUNT );
    Structures.def_csetf( $sym186$INFRNC_CUMULATIVE_STEP_COUNT, $sym187$_CSETF_INFRNC_CUMULATIVE_STEP_COUNT );
    Structures.def_csetf( $sym188$INFRNC_EVENTS, $sym189$_CSETF_INFRNC_EVENTS );
    Structures.def_csetf( $sym190$INFRNC_HALT_CONDITIONS, $sym191$_CSETF_INFRNC_HALT_CONDITIONS );
    Structures.def_csetf( $sym192$INFRNC_ACCUMULATORS, $sym193$_CSETF_INFRNC_ACCUMULATORS );
    Structures.def_csetf( $sym194$INFRNC_PROOF_WATERMARK, $sym195$_CSETF_INFRNC_PROOF_WATERMARK );
    Structures.def_csetf( $sym196$INFRNC_PROBLEM_WORKING_TIME_DATA, $sym197$_CSETF_INFRNC_PROBLEM_WORKING_TIME_DATA );
    Structures.def_csetf( $sym198$INFRNC_TYPE, $sym199$_CSETF_INFRNC_TYPE );
    Structures.def_csetf( $sym200$INFRNC_DATA, $sym201$_CSETF_INFRNC_DATA );
    Structures.def_csetf( $sym202$INFRNC_PROPERTIES, $sym203$_CSETF_INFRNC_PROPERTIES );
    Equality.identity( $sym1$INFERENCE );
    Structures.register_method( visitation.$visit_defstruct_object_method_table$.getGlobalValue(), $dtp_inference$.getGlobalValue(), Symbols.symbol_function( $sym280$VISIT_DEFSTRUCT_OBJECT_INFERENCE_METHOD ) );
    Structures.register_method( Sxhash.$sxhash_method_table$.getGlobalValue(), $dtp_inference$.getGlobalValue(), Symbols.symbol_function( $sym284$SXHASH_INFERENCE_METHOD ) );
    access_macros.register_macro_helper( $sym314$INFERENCE_ANSWER_ID_INDEX, $sym323$DO_INFERENCE_ANSWERS );
    access_macros.register_macro_helper( $sym302$INFERENCE_NEW_ANSWER_ID_START, $sym347$DO_INFERENCE_NEW_ANSWERS );
    access_macros.register_macro_helper( $sym295$INFERENCE_NEW_ANSWER_JUSTIFICATIONS, $sym348$DO_INFERENCE_NEW_ANSWER_JUSTIFICATIONS );
    subl_macro_promotions.declare_defglobal( $sym416$_PAD_TIMES_TO_FIRST_ANSWER_ );
    access_macros.register_macro_helper( $sym303$INFERENCE_NEXT_NEW_ANSWER_ID, $sym347$DO_INFERENCE_NEW_ANSWERS );
    Structures.register_method( print_high.$print_object_method_table$.getGlobalValue(), $dtp_inference_answer$.getGlobalValue(), Symbols.symbol_function( $sym447$INFERENCE_ANSWER_PRINT_FUNCTION_TRAMPOLINE ) );
    SubLSpecialOperatorDeclarations.proclaim( $list448 );
    Structures.def_csetf( $sym449$INF_ANSWER_SUID, $sym450$_CSETF_INF_ANSWER_SUID );
    Structures.def_csetf( $sym451$INF_ANSWER_INFERENCE, $sym452$_CSETF_INF_ANSWER_INFERENCE );
    Structures.def_csetf( $sym453$INF_ANSWER_BINDINGS, $sym454$_CSETF_INF_ANSWER_BINDINGS );
    Structures.def_csetf( $sym455$INF_ANSWER_JUSTIFICATIONS, $sym456$_CSETF_INF_ANSWER_JUSTIFICATIONS );
    Structures.def_csetf( $sym457$INF_ANSWER_ELAPSED_CREATION_TIME, $sym458$_CSETF_INF_ANSWER_ELAPSED_CREATION_TIME );
    Structures.def_csetf( $sym459$INF_ANSWER_STEP_COUNT, $sym460$_CSETF_INF_ANSWER_STEP_COUNT );
    Equality.identity( $sym441$INFERENCE_ANSWER );
    Structures.register_method( visitation.$visit_defstruct_object_method_table$.getGlobalValue(), $dtp_inference_answer$.getGlobalValue(), Symbols.symbol_function(
        $sym465$VISIT_DEFSTRUCT_OBJECT_INFERENCE_ANSWER_METHOD ) );
    Structures.register_method( Sxhash.$sxhash_method_table$.getGlobalValue(), $dtp_inference_answer$.getGlobalValue(), Symbols.symbol_function( $sym468$SXHASH_INFERENCE_ANSWER_METHOD ) );
    access_macros.register_macro_helper( $sym472$INFERENCE_ANSWER_JUSTIFICATIONS, $sym324$DO_INFERENCE_ANSWER_JUSTIFICATIONS );
    access_macros.register_external_symbol( $sym480$INFERENCE_ANSWER_EL_SENTENCE );
    Structures.register_method( print_high.$print_object_method_table$.getGlobalValue(), $dtp_inference_answer_justification$.getGlobalValue(), Symbols.symbol_function(
        $sym487$INFERENCE_ANSWER_JUSTIFICATION_PRINT_FUNCTION_TRAMPOLINE ) );
    SubLSpecialOperatorDeclarations.proclaim( $list488 );
    Structures.def_csetf( $sym489$INF_ANS_JUST_ANSWER, $sym490$_CSETF_INF_ANS_JUST_ANSWER );
    Structures.def_csetf( $sym491$INF_ANS_JUST_SUPPORTS, $sym492$_CSETF_INF_ANS_JUST_SUPPORTS );
    Structures.def_csetf( $sym493$INF_ANS_JUST_PRAGMA_SUPPORTS, $sym494$_CSETF_INF_ANS_JUST_PRAGMA_SUPPORTS );
    Structures.def_csetf( $sym495$INF_ANS_JUST_PROOFS, $sym496$_CSETF_INF_ANS_JUST_PROOFS );
    Equality.identity( $sym481$INFERENCE_ANSWER_JUSTIFICATION );
    Structures.register_method( visitation.$visit_defstruct_object_method_table$.getGlobalValue(), $dtp_inference_answer_justification$.getGlobalValue(), Symbols.symbol_function(
        $sym502$VISIT_DEFSTRUCT_OBJECT_INFERENCE_ANSWER_JUSTIFICATION_METHOD ) );
    Structures.register_method( Sxhash.$sxhash_method_table$.getGlobalValue(), $dtp_inference_answer_justification$.getGlobalValue(), Symbols.symbol_function( $sym504$SXHASH_INFERENCE_ANSWER_JUSTIFICATION_METHOD ) );
    access_macros.register_external_symbol( $sym528$INFERENCE_METRICS );
    access_macros.register_macro_helper( $sym341$INFERENCE_PROBLEM_WORKING_TIME_LOCK, $sym545$WITH_INFERENCE_PROBLEM_WORKING_TIME_LOCK );
    access_macros.register_macro_helper( $sym560$POSSIBLY_SIGNAL_SKSI_QUERY_START, $sym567$INFERENCE_WITHIN_SKSI_QUERY_EXECUTION );
    access_macros.register_macro_helper( $sym564$POSSIBLY_SIGNAL_SKSI_QUERY_END, $sym567$INFERENCE_WITHIN_SKSI_QUERY_EXECUTION );
    access_macros.register_macro_helper( $sym565$POSSIBLY_INCREMENT_INFERENCE_SKSI_QUERY_TOTAL_TIME, $sym567$INFERENCE_WITHIN_SKSI_QUERY_EXECUTION );
    access_macros.register_macro_helper( $sym563$POSSIBLY_ADD_INFERENCE_SKSI_QUERY_START_TIME, $sym567$INFERENCE_WITHIN_SKSI_QUERY_EXECUTION );
    access_macros.register_macro_helper( $sym587$POSSIBLY_ADD_INFERENCE_SPARQL_QUERY_PROFILE, $sym588$INFERENCE_WITHIN_SPARQL_QUERY_EXECUTION );
    return NIL;
  }

  @Override
  public void declareFunctions()
  {
    declare_inference_datastructures_inference_file();
  }

  @Override
  public void initializeVariables()
  {
    init_inference_datastructures_inference_file();
  }

  @Override
  public void runTopLevelForms()
  {
    setup_inference_datastructures_inference_file();
  }
  static
  {
    me = new inference_datastructures_inference();
    $inference_types$ = null;
    $dtp_inference$ = null;
    $pad_times_to_first_answer$ = null;
    $dtp_inference_answer$ = null;
    $dtp_inference_answer_justification$ = null;
    $list0 = ConsesLow.list( makeKeyword( "SIMPLEST" ) );
    $sym1$INFERENCE = makeSymbol( "INFERENCE" );
    $sym2$INFERENCE_P = makeSymbol( "INFERENCE-P" );
    $list3 = ConsesLow.list( new SubLObject[] { makeSymbol( "SUID" ), makeSymbol( "PROBLEM-STORE" ), makeSymbol( "FORWARD-PROPAGATE" ), makeSymbol( "INPUT-MT" ), makeSymbol( "INPUT-EL-QUERY" ), makeSymbol(
        "INPUT-NON-EXPLANATORY-EL-QUERY" ), makeSymbol( "INPUT-QUERY-PROPERTIES" ), makeSymbol( "MT" ), makeSymbol( "EL-QUERY" ), makeSymbol( "EL-BINDINGS" ), makeSymbol( "HL-QUERY" ), makeSymbol(
            "EXPLANATORY-SUBQUERY" ), makeSymbol( "NON-EXPLANATORY-SUBQUERY" ), makeSymbol( "FREE-HL-VARS" ), makeSymbol( "HYPOTHETICAL-BINDINGS" ), makeSymbol( "ANSWER-ID-INDEX" ), makeSymbol( "ANSWER-BINDINGS-INDEX" ),
      makeSymbol( "NEW-ANSWER-ID-START" ), makeSymbol( "NEW-ANSWER-JUSTIFICATIONS" ), makeSymbol( "STATUS" ), makeSymbol( "SUSPEND-STATUS" ), makeSymbol( "ROOT-LINK" ), makeSymbol( "RELEVANT-PROBLEMS" ), makeSymbol(
          "STRATEGY-SET" ), makeSymbol( "CONTROL-PROCESS" ), makeSymbol( "INTERRUPTING-PROCESSES" ), makeSymbol( "MAX-TRANSFORMATION-DEPTH-REACHED" ), makeSymbol( "DISJUNCTION-FREE-EL-VARS-POLICY" ), makeSymbol(
              "RESULT-UNIQUENESS-CRITERION" ), makeSymbol( "ALLOW-HL-PREDICATE-TRANSFORMATION?" ), makeSymbol( "ALLOW-UNBOUND-PREDICATE-TRANSFORMATION?" ), makeSymbol( "ALLOW-EVALUATABLE-PREDICATE-TRANSFORMATION?" ),
      makeSymbol( "ALLOW-INDETERMINATE-RESULTS?" ), makeSymbol( "ALLOWED-RULES" ), makeSymbol( "FORBIDDEN-RULES" ), makeSymbol( "ALLOWED-MODULES" ), makeSymbol( "ALLOW-ABNORMALITY-CHECKING?" ), makeSymbol(
          "TRANSITIVE-CLOSURE-MODE" ), makeSymbol( "PROBLEM-STORE-PRIVATE?" ), makeSymbol( "CONTINUABLE?" ), makeSymbol( "BROWSABLE?" ), makeSymbol( "RETURN-TYPE" ), makeSymbol( "ANSWER-LANGUAGE" ), makeSymbol(
              "CACHE-RESULTS?" ), makeSymbol( "BLOCKING?" ), makeSymbol( "MAX-NUMBER" ), makeSymbol( "MAX-TIME" ), makeSymbol( "MAX-STEP" ), makeSymbol( "MODE" ), makeSymbol( "FORWARD-MAX-TIME" ), makeSymbol(
                  "MAX-PROOF-DEPTH" ), makeSymbol( "MAX-TRANSFORMATION-DEPTH" ), makeSymbol( "MIN-RULE-UTILITY" ), makeSymbol( "PROBABLY-APPROXIMATELY-DONE" ), makeSymbol( "METRICS-TEMPLATE" ), makeSymbol(
                      "START-UNIVERSAL-TIME" ), makeSymbol( "START-INTERNAL-REAL-TIME" ), makeSymbol( "END-INTERNAL-REAL-TIME" ), makeSymbol( "PAD-INTERNAL-REAL-TIME" ), makeSymbol( "HYPOTHESIZATION-TIME" ), makeSymbol(
                          "CUMULATIVE-TIME" ), makeSymbol( "STEP-COUNT" ), makeSymbol( "CUMULATIVE-STEP-COUNT" ), makeSymbol( "EVENTS" ), makeSymbol( "HALT-CONDITIONS" ), makeSymbol( "ACCUMULATORS" ), makeSymbol(
                              "PROOF-WATERMARK" ), makeSymbol( "PROBLEM-WORKING-TIME-DATA" ), makeSymbol( "TYPE" ), makeSymbol( "DATA" ), makeSymbol( "PROPERTIES" )
    } );
    $list4 = ConsesLow.list( new SubLObject[] { makeKeyword( "SUID" ), makeKeyword( "PROBLEM-STORE" ), makeKeyword( "FORWARD-PROPAGATE" ), makeKeyword( "INPUT-MT" ), makeKeyword( "INPUT-EL-QUERY" ), makeKeyword(
        "INPUT-NON-EXPLANATORY-EL-QUERY" ), makeKeyword( "INPUT-QUERY-PROPERTIES" ), makeKeyword( "MT" ), makeKeyword( "EL-QUERY" ), makeKeyword( "EL-BINDINGS" ), makeKeyword( "HL-QUERY" ), makeKeyword(
            "EXPLANATORY-SUBQUERY" ), makeKeyword( "NON-EXPLANATORY-SUBQUERY" ), makeKeyword( "FREE-HL-VARS" ), makeKeyword( "HYPOTHETICAL-BINDINGS" ), makeKeyword( "ANSWER-ID-INDEX" ), makeKeyword(
                "ANSWER-BINDINGS-INDEX" ), makeKeyword( "NEW-ANSWER-ID-START" ), makeKeyword( "NEW-ANSWER-JUSTIFICATIONS" ), makeKeyword( "STATUS" ), makeKeyword( "SUSPEND-STATUS" ), makeKeyword( "ROOT-LINK" ),
      makeKeyword( "RELEVANT-PROBLEMS" ), makeKeyword( "STRATEGY-SET" ), makeKeyword( "CONTROL-PROCESS" ), makeKeyword( "INTERRUPTING-PROCESSES" ), makeKeyword( "MAX-TRANSFORMATION-DEPTH-REACHED" ), makeKeyword(
          "DISJUNCTION-FREE-EL-VARS-POLICY" ), makeKeyword( "RESULT-UNIQUENESS-CRITERION" ), makeKeyword( "ALLOW-HL-PREDICATE-TRANSFORMATION?" ), makeKeyword( "ALLOW-UNBOUND-PREDICATE-TRANSFORMATION?" ), makeKeyword(
              "ALLOW-EVALUATABLE-PREDICATE-TRANSFORMATION?" ), makeKeyword( "ALLOW-INDETERMINATE-RESULTS?" ), makeKeyword( "ALLOWED-RULES" ), makeKeyword( "FORBIDDEN-RULES" ), makeKeyword( "ALLOWED-MODULES" ),
      makeKeyword( "ALLOW-ABNORMALITY-CHECKING?" ), makeKeyword( "TRANSITIVE-CLOSURE-MODE" ), makeKeyword( "PROBLEM-STORE-PRIVATE?" ), makeKeyword( "CONTINUABLE?" ), makeKeyword( "BROWSABLE?" ), makeKeyword(
          "RETURN-TYPE" ), makeKeyword( "ANSWER-LANGUAGE" ), makeKeyword( "CACHE-RESULTS?" ), makeKeyword( "BLOCKING?" ), makeKeyword( "MAX-NUMBER" ), makeKeyword( "MAX-TIME" ), makeKeyword( "MAX-STEP" ), makeKeyword(
              "MODE" ), makeKeyword( "FORWARD-MAX-TIME" ), makeKeyword( "MAX-PROOF-DEPTH" ), makeKeyword( "MAX-TRANSFORMATION-DEPTH" ), makeKeyword( "MIN-RULE-UTILITY" ), makeKeyword( "PROBABLY-APPROXIMATELY-DONE" ),
      makeKeyword( "METRICS-TEMPLATE" ), makeKeyword( "START-UNIVERSAL-TIME" ), makeKeyword( "START-INTERNAL-REAL-TIME" ), makeKeyword( "END-INTERNAL-REAL-TIME" ), makeKeyword( "PAD-INTERNAL-REAL-TIME" ), makeKeyword(
          "HYPOTHESIZATION-TIME" ), makeKeyword( "CUMULATIVE-TIME" ), makeKeyword( "STEP-COUNT" ), makeKeyword( "CUMULATIVE-STEP-COUNT" ), makeKeyword( "EVENTS" ), makeKeyword( "HALT-CONDITIONS" ), makeKeyword(
              "ACCUMULATORS" ), makeKeyword( "PROOF-WATERMARK" ), makeKeyword( "PROBLEM-WORKING-TIME-DATA" ), makeKeyword( "TYPE" ), makeKeyword( "DATA" ), makeKeyword( "PROPERTIES" )
    } );
    $list5 = ConsesLow.list( new SubLObject[] { makeSymbol( "INFRNC-SUID" ), makeSymbol( "INFRNC-PROBLEM-STORE" ), makeSymbol( "INFRNC-FORWARD-PROPAGATE" ), makeSymbol( "INFRNC-INPUT-MT" ), makeSymbol(
        "INFRNC-INPUT-EL-QUERY" ), makeSymbol( "INFRNC-INPUT-NON-EXPLANATORY-EL-QUERY" ), makeSymbol( "INFRNC-INPUT-QUERY-PROPERTIES" ), makeSymbol( "INFRNC-MT" ), makeSymbol( "INFRNC-EL-QUERY" ), makeSymbol(
            "INFRNC-EL-BINDINGS" ), makeSymbol( "INFRNC-HL-QUERY" ), makeSymbol( "INFRNC-EXPLANATORY-SUBQUERY" ), makeSymbol( "INFRNC-NON-EXPLANATORY-SUBQUERY" ), makeSymbol( "INFRNC-FREE-HL-VARS" ), makeSymbol(
                "INFRNC-HYPOTHETICAL-BINDINGS" ), makeSymbol( "INFRNC-ANSWER-ID-INDEX" ), makeSymbol( "INFRNC-ANSWER-BINDINGS-INDEX" ), makeSymbol( "INFRNC-NEW-ANSWER-ID-START" ), makeSymbol(
                    "INFRNC-NEW-ANSWER-JUSTIFICATIONS" ), makeSymbol( "INFRNC-STATUS" ), makeSymbol( "INFRNC-SUSPEND-STATUS" ), makeSymbol( "INFRNC-ROOT-LINK" ), makeSymbol( "INFRNC-RELEVANT-PROBLEMS" ), makeSymbol(
                        "INFRNC-STRATEGY-SET" ), makeSymbol( "INFRNC-CONTROL-PROCESS" ), makeSymbol( "INFRNC-INTERRUPTING-PROCESSES" ), makeSymbol( "INFRNC-MAX-TRANSFORMATION-DEPTH-REACHED" ), makeSymbol(
                            "INFRNC-DISJUNCTION-FREE-EL-VARS-POLICY" ), makeSymbol( "INFRNC-RESULT-UNIQUENESS-CRITERION" ), makeSymbol( "INFRNC-ALLOW-HL-PREDICATE-TRANSFORMATION?" ), makeSymbol(
                                "INFRNC-ALLOW-UNBOUND-PREDICATE-TRANSFORMATION?" ), makeSymbol( "INFRNC-ALLOW-EVALUATABLE-PREDICATE-TRANSFORMATION?" ), makeSymbol( "INFRNC-ALLOW-INDETERMINATE-RESULTS?" ), makeSymbol(
                                    "INFRNC-ALLOWED-RULES" ), makeSymbol( "INFRNC-FORBIDDEN-RULES" ), makeSymbol( "INFRNC-ALLOWED-MODULES" ), makeSymbol( "INFRNC-ALLOW-ABNORMALITY-CHECKING?" ), makeSymbol(
                                        "INFRNC-TRANSITIVE-CLOSURE-MODE" ), makeSymbol( "INFRNC-PROBLEM-STORE-PRIVATE?" ), makeSymbol( "INFRNC-CONTINUABLE?" ), makeSymbol( "INFRNC-BROWSABLE?" ), makeSymbol(
                                            "INFRNC-RETURN-TYPE" ), makeSymbol( "INFRNC-ANSWER-LANGUAGE" ), makeSymbol( "INFRNC-CACHE-RESULTS?" ), makeSymbol( "INFRNC-BLOCKING?" ), makeSymbol( "INFRNC-MAX-NUMBER" ),
      makeSymbol( "INFRNC-MAX-TIME" ), makeSymbol( "INFRNC-MAX-STEP" ), makeSymbol( "INFRNC-MODE" ), makeSymbol( "INFRNC-FORWARD-MAX-TIME" ), makeSymbol( "INFRNC-MAX-PROOF-DEPTH" ), makeSymbol(
          "INFRNC-MAX-TRANSFORMATION-DEPTH" ), makeSymbol( "INFRNC-MIN-RULE-UTILITY" ), makeSymbol( "INFRNC-PROBABLY-APPROXIMATELY-DONE" ), makeSymbol( "INFRNC-METRICS-TEMPLATE" ), makeSymbol(
              "INFRNC-START-UNIVERSAL-TIME" ), makeSymbol( "INFRNC-START-INTERNAL-REAL-TIME" ), makeSymbol( "INFRNC-END-INTERNAL-REAL-TIME" ), makeSymbol( "INFRNC-PAD-INTERNAL-REAL-TIME" ), makeSymbol(
                  "INFRNC-HYPOTHESIZATION-TIME" ), makeSymbol( "INFRNC-CUMULATIVE-TIME" ), makeSymbol( "INFRNC-STEP-COUNT" ), makeSymbol( "INFRNC-CUMULATIVE-STEP-COUNT" ), makeSymbol( "INFRNC-EVENTS" ), makeSymbol(
                      "INFRNC-HALT-CONDITIONS" ), makeSymbol( "INFRNC-ACCUMULATORS" ), makeSymbol( "INFRNC-PROOF-WATERMARK" ), makeSymbol( "INFRNC-PROBLEM-WORKING-TIME-DATA" ), makeSymbol( "INFRNC-TYPE" ), makeSymbol(
                          "INFRNC-DATA" ), makeSymbol( "INFRNC-PROPERTIES" )
    } );
    $list6 = ConsesLow.list( new SubLObject[] { makeSymbol( "_CSETF-INFRNC-SUID" ), makeSymbol( "_CSETF-INFRNC-PROBLEM-STORE" ), makeSymbol( "_CSETF-INFRNC-FORWARD-PROPAGATE" ), makeSymbol( "_CSETF-INFRNC-INPUT-MT" ),
      makeSymbol( "_CSETF-INFRNC-INPUT-EL-QUERY" ), makeSymbol( "_CSETF-INFRNC-INPUT-NON-EXPLANATORY-EL-QUERY" ), makeSymbol( "_CSETF-INFRNC-INPUT-QUERY-PROPERTIES" ), makeSymbol( "_CSETF-INFRNC-MT" ), makeSymbol(
          "_CSETF-INFRNC-EL-QUERY" ), makeSymbol( "_CSETF-INFRNC-EL-BINDINGS" ), makeSymbol( "_CSETF-INFRNC-HL-QUERY" ), makeSymbol( "_CSETF-INFRNC-EXPLANATORY-SUBQUERY" ), makeSymbol(
              "_CSETF-INFRNC-NON-EXPLANATORY-SUBQUERY" ), makeSymbol( "_CSETF-INFRNC-FREE-HL-VARS" ), makeSymbol( "_CSETF-INFRNC-HYPOTHETICAL-BINDINGS" ), makeSymbol( "_CSETF-INFRNC-ANSWER-ID-INDEX" ), makeSymbol(
                  "_CSETF-INFRNC-ANSWER-BINDINGS-INDEX" ), makeSymbol( "_CSETF-INFRNC-NEW-ANSWER-ID-START" ), makeSymbol( "_CSETF-INFRNC-NEW-ANSWER-JUSTIFICATIONS" ), makeSymbol( "_CSETF-INFRNC-STATUS" ), makeSymbol(
                      "_CSETF-INFRNC-SUSPEND-STATUS" ), makeSymbol( "_CSETF-INFRNC-ROOT-LINK" ), makeSymbol( "_CSETF-INFRNC-RELEVANT-PROBLEMS" ), makeSymbol( "_CSETF-INFRNC-STRATEGY-SET" ), makeSymbol(
                          "_CSETF-INFRNC-CONTROL-PROCESS" ), makeSymbol( "_CSETF-INFRNC-INTERRUPTING-PROCESSES" ), makeSymbol( "_CSETF-INFRNC-MAX-TRANSFORMATION-DEPTH-REACHED" ), makeSymbol(
                              "_CSETF-INFRNC-DISJUNCTION-FREE-EL-VARS-POLICY" ), makeSymbol( "_CSETF-INFRNC-RESULT-UNIQUENESS-CRITERION" ), makeSymbol( "_CSETF-INFRNC-ALLOW-HL-PREDICATE-TRANSFORMATION?" ), makeSymbol(
                                  "_CSETF-INFRNC-ALLOW-UNBOUND-PREDICATE-TRANSFORMATION?" ), makeSymbol( "_CSETF-INFRNC-ALLOW-EVALUATABLE-PREDICATE-TRANSFORMATION?" ), makeSymbol(
                                      "_CSETF-INFRNC-ALLOW-INDETERMINATE-RESULTS?" ), makeSymbol( "_CSETF-INFRNC-ALLOWED-RULES" ), makeSymbol( "_CSETF-INFRNC-FORBIDDEN-RULES" ), makeSymbol(
                                          "_CSETF-INFRNC-ALLOWED-MODULES" ), makeSymbol( "_CSETF-INFRNC-ALLOW-ABNORMALITY-CHECKING?" ), makeSymbol( "_CSETF-INFRNC-TRANSITIVE-CLOSURE-MODE" ), makeSymbol(
                                              "_CSETF-INFRNC-PROBLEM-STORE-PRIVATE?" ), makeSymbol( "_CSETF-INFRNC-CONTINUABLE?" ), makeSymbol( "_CSETF-INFRNC-BROWSABLE?" ), makeSymbol( "_CSETF-INFRNC-RETURN-TYPE" ),
      makeSymbol( "_CSETF-INFRNC-ANSWER-LANGUAGE" ), makeSymbol( "_CSETF-INFRNC-CACHE-RESULTS?" ), makeSymbol( "_CSETF-INFRNC-BLOCKING?" ), makeSymbol( "_CSETF-INFRNC-MAX-NUMBER" ), makeSymbol(
          "_CSETF-INFRNC-MAX-TIME" ), makeSymbol( "_CSETF-INFRNC-MAX-STEP" ), makeSymbol( "_CSETF-INFRNC-MODE" ), makeSymbol( "_CSETF-INFRNC-FORWARD-MAX-TIME" ), makeSymbol( "_CSETF-INFRNC-MAX-PROOF-DEPTH" ), makeSymbol(
              "_CSETF-INFRNC-MAX-TRANSFORMATION-DEPTH" ), makeSymbol( "_CSETF-INFRNC-MIN-RULE-UTILITY" ), makeSymbol( "_CSETF-INFRNC-PROBABLY-APPROXIMATELY-DONE" ), makeSymbol( "_CSETF-INFRNC-METRICS-TEMPLATE" ),
      makeSymbol( "_CSETF-INFRNC-START-UNIVERSAL-TIME" ), makeSymbol( "_CSETF-INFRNC-START-INTERNAL-REAL-TIME" ), makeSymbol( "_CSETF-INFRNC-END-INTERNAL-REAL-TIME" ), makeSymbol(
          "_CSETF-INFRNC-PAD-INTERNAL-REAL-TIME" ), makeSymbol( "_CSETF-INFRNC-HYPOTHESIZATION-TIME" ), makeSymbol( "_CSETF-INFRNC-CUMULATIVE-TIME" ), makeSymbol( "_CSETF-INFRNC-STEP-COUNT" ), makeSymbol(
              "_CSETF-INFRNC-CUMULATIVE-STEP-COUNT" ), makeSymbol( "_CSETF-INFRNC-EVENTS" ), makeSymbol( "_CSETF-INFRNC-HALT-CONDITIONS" ), makeSymbol( "_CSETF-INFRNC-ACCUMULATORS" ), makeSymbol(
                  "_CSETF-INFRNC-PROOF-WATERMARK" ), makeSymbol( "_CSETF-INFRNC-PROBLEM-WORKING-TIME-DATA" ), makeSymbol( "_CSETF-INFRNC-TYPE" ), makeSymbol( "_CSETF-INFRNC-DATA" ), makeSymbol(
                      "_CSETF-INFRNC-PROPERTIES" )
    } );
    $sym7$PRINT_INFERENCE = makeSymbol( "PRINT-INFERENCE" );
    $int8$21 = makeInteger( 21 );
    $int9$22 = makeInteger( 22 );
    $int10$23 = makeInteger( 23 );
    $int11$24 = makeInteger( 24 );
    $int12$25 = makeInteger( 25 );
    $int13$26 = makeInteger( 26 );
    $int14$27 = makeInteger( 27 );
    $int15$28 = makeInteger( 28 );
    $int16$29 = makeInteger( 29 );
    $int17$30 = makeInteger( 30 );
    $int18$31 = makeInteger( 31 );
    $int19$32 = makeInteger( 32 );
    $int20$33 = makeInteger( 33 );
    $int21$34 = makeInteger( 34 );
    $int22$35 = makeInteger( 35 );
    $int23$36 = makeInteger( 36 );
    $int24$37 = makeInteger( 37 );
    $int25$38 = makeInteger( 38 );
    $int26$39 = makeInteger( 39 );
    $int27$40 = makeInteger( 40 );
    $int28$41 = makeInteger( 41 );
    $int29$42 = makeInteger( 42 );
    $int30$43 = makeInteger( 43 );
    $int31$44 = makeInteger( 44 );
    $int32$45 = makeInteger( 45 );
    $int33$46 = makeInteger( 46 );
    $int34$47 = makeInteger( 47 );
    $int35$48 = makeInteger( 48 );
    $int36$49 = makeInteger( 49 );
    $int37$50 = makeInteger( 50 );
    $int38$51 = makeInteger( 51 );
    $int39$52 = makeInteger( 52 );
    $int40$53 = makeInteger( 53 );
    $int41$54 = makeInteger( 54 );
    $int42$55 = makeInteger( 55 );
    $int43$56 = makeInteger( 56 );
    $int44$57 = makeInteger( 57 );
    $int45$58 = makeInteger( 58 );
    $int46$59 = makeInteger( 59 );
    $int47$60 = makeInteger( 60 );
    $int48$61 = makeInteger( 61 );
    $int49$62 = makeInteger( 62 );
    $int50$63 = makeInteger( 63 );
    $int51$64 = makeInteger( 64 );
    $int52$65 = makeInteger( 65 );
    $int53$66 = makeInteger( 66 );
    $int54$67 = makeInteger( 67 );
    $int55$68 = makeInteger( 68 );
    $int56$69 = makeInteger( 69 );
    $int57$70 = makeInteger( 70 );
    $int58$71 = makeInteger( 71 );
    $int59$72 = makeInteger( 72 );
    $sym60$INFERENCE_PRINT_FUNCTION_TRAMPOLINE = makeSymbol( "INFERENCE-PRINT-FUNCTION-TRAMPOLINE" );
    $list61 = ConsesLow.list( makeSymbol( "OPTIMIZE-FUNCALL" ), makeSymbol( "INFERENCE-P" ) );
    $sym62$INFRNC_SUID = makeSymbol( "INFRNC-SUID" );
    $sym63$_CSETF_INFRNC_SUID = makeSymbol( "_CSETF-INFRNC-SUID" );
    $sym64$INFRNC_PROBLEM_STORE = makeSymbol( "INFRNC-PROBLEM-STORE" );
    $sym65$_CSETF_INFRNC_PROBLEM_STORE = makeSymbol( "_CSETF-INFRNC-PROBLEM-STORE" );
    $sym66$INFRNC_FORWARD_PROPAGATE = makeSymbol( "INFRNC-FORWARD-PROPAGATE" );
    $sym67$_CSETF_INFRNC_FORWARD_PROPAGATE = makeSymbol( "_CSETF-INFRNC-FORWARD-PROPAGATE" );
    $sym68$INFRNC_INPUT_MT = makeSymbol( "INFRNC-INPUT-MT" );
    $sym69$_CSETF_INFRNC_INPUT_MT = makeSymbol( "_CSETF-INFRNC-INPUT-MT" );
    $sym70$INFRNC_INPUT_EL_QUERY = makeSymbol( "INFRNC-INPUT-EL-QUERY" );
    $sym71$_CSETF_INFRNC_INPUT_EL_QUERY = makeSymbol( "_CSETF-INFRNC-INPUT-EL-QUERY" );
    $sym72$INFRNC_INPUT_NON_EXPLANATORY_EL_QUERY = makeSymbol( "INFRNC-INPUT-NON-EXPLANATORY-EL-QUERY" );
    $sym73$_CSETF_INFRNC_INPUT_NON_EXPLANATORY_EL_QUERY = makeSymbol( "_CSETF-INFRNC-INPUT-NON-EXPLANATORY-EL-QUERY" );
    $sym74$INFRNC_INPUT_QUERY_PROPERTIES = makeSymbol( "INFRNC-INPUT-QUERY-PROPERTIES" );
    $sym75$_CSETF_INFRNC_INPUT_QUERY_PROPERTIES = makeSymbol( "_CSETF-INFRNC-INPUT-QUERY-PROPERTIES" );
    $sym76$INFRNC_MT = makeSymbol( "INFRNC-MT" );
    $sym77$_CSETF_INFRNC_MT = makeSymbol( "_CSETF-INFRNC-MT" );
    $sym78$INFRNC_EL_QUERY = makeSymbol( "INFRNC-EL-QUERY" );
    $sym79$_CSETF_INFRNC_EL_QUERY = makeSymbol( "_CSETF-INFRNC-EL-QUERY" );
    $sym80$INFRNC_EL_BINDINGS = makeSymbol( "INFRNC-EL-BINDINGS" );
    $sym81$_CSETF_INFRNC_EL_BINDINGS = makeSymbol( "_CSETF-INFRNC-EL-BINDINGS" );
    $sym82$INFRNC_HL_QUERY = makeSymbol( "INFRNC-HL-QUERY" );
    $sym83$_CSETF_INFRNC_HL_QUERY = makeSymbol( "_CSETF-INFRNC-HL-QUERY" );
    $sym84$INFRNC_EXPLANATORY_SUBQUERY = makeSymbol( "INFRNC-EXPLANATORY-SUBQUERY" );
    $sym85$_CSETF_INFRNC_EXPLANATORY_SUBQUERY = makeSymbol( "_CSETF-INFRNC-EXPLANATORY-SUBQUERY" );
    $sym86$INFRNC_NON_EXPLANATORY_SUBQUERY = makeSymbol( "INFRNC-NON-EXPLANATORY-SUBQUERY" );
    $sym87$_CSETF_INFRNC_NON_EXPLANATORY_SUBQUERY = makeSymbol( "_CSETF-INFRNC-NON-EXPLANATORY-SUBQUERY" );
    $sym88$INFRNC_FREE_HL_VARS = makeSymbol( "INFRNC-FREE-HL-VARS" );
    $sym89$_CSETF_INFRNC_FREE_HL_VARS = makeSymbol( "_CSETF-INFRNC-FREE-HL-VARS" );
    $sym90$INFRNC_HYPOTHETICAL_BINDINGS = makeSymbol( "INFRNC-HYPOTHETICAL-BINDINGS" );
    $sym91$_CSETF_INFRNC_HYPOTHETICAL_BINDINGS = makeSymbol( "_CSETF-INFRNC-HYPOTHETICAL-BINDINGS" );
    $sym92$INFRNC_ANSWER_ID_INDEX = makeSymbol( "INFRNC-ANSWER-ID-INDEX" );
    $sym93$_CSETF_INFRNC_ANSWER_ID_INDEX = makeSymbol( "_CSETF-INFRNC-ANSWER-ID-INDEX" );
    $sym94$INFRNC_ANSWER_BINDINGS_INDEX = makeSymbol( "INFRNC-ANSWER-BINDINGS-INDEX" );
    $sym95$_CSETF_INFRNC_ANSWER_BINDINGS_INDEX = makeSymbol( "_CSETF-INFRNC-ANSWER-BINDINGS-INDEX" );
    $sym96$INFRNC_NEW_ANSWER_ID_START = makeSymbol( "INFRNC-NEW-ANSWER-ID-START" );
    $sym97$_CSETF_INFRNC_NEW_ANSWER_ID_START = makeSymbol( "_CSETF-INFRNC-NEW-ANSWER-ID-START" );
    $sym98$INFRNC_NEW_ANSWER_JUSTIFICATIONS = makeSymbol( "INFRNC-NEW-ANSWER-JUSTIFICATIONS" );
    $sym99$_CSETF_INFRNC_NEW_ANSWER_JUSTIFICATIONS = makeSymbol( "_CSETF-INFRNC-NEW-ANSWER-JUSTIFICATIONS" );
    $sym100$INFRNC_STATUS = makeSymbol( "INFRNC-STATUS" );
    $sym101$_CSETF_INFRNC_STATUS = makeSymbol( "_CSETF-INFRNC-STATUS" );
    $sym102$INFRNC_SUSPEND_STATUS = makeSymbol( "INFRNC-SUSPEND-STATUS" );
    $sym103$_CSETF_INFRNC_SUSPEND_STATUS = makeSymbol( "_CSETF-INFRNC-SUSPEND-STATUS" );
    $sym104$INFRNC_ROOT_LINK = makeSymbol( "INFRNC-ROOT-LINK" );
    $sym105$_CSETF_INFRNC_ROOT_LINK = makeSymbol( "_CSETF-INFRNC-ROOT-LINK" );
    $sym106$INFRNC_RELEVANT_PROBLEMS = makeSymbol( "INFRNC-RELEVANT-PROBLEMS" );
    $sym107$_CSETF_INFRNC_RELEVANT_PROBLEMS = makeSymbol( "_CSETF-INFRNC-RELEVANT-PROBLEMS" );
    $sym108$INFRNC_STRATEGY_SET = makeSymbol( "INFRNC-STRATEGY-SET" );
    $sym109$_CSETF_INFRNC_STRATEGY_SET = makeSymbol( "_CSETF-INFRNC-STRATEGY-SET" );
    $sym110$INFRNC_CONTROL_PROCESS = makeSymbol( "INFRNC-CONTROL-PROCESS" );
    $sym111$_CSETF_INFRNC_CONTROL_PROCESS = makeSymbol( "_CSETF-INFRNC-CONTROL-PROCESS" );
    $sym112$INFRNC_INTERRUPTING_PROCESSES = makeSymbol( "INFRNC-INTERRUPTING-PROCESSES" );
    $sym113$_CSETF_INFRNC_INTERRUPTING_PROCESSES = makeSymbol( "_CSETF-INFRNC-INTERRUPTING-PROCESSES" );
    $sym114$INFRNC_MAX_TRANSFORMATION_DEPTH_REACHED = makeSymbol( "INFRNC-MAX-TRANSFORMATION-DEPTH-REACHED" );
    $sym115$_CSETF_INFRNC_MAX_TRANSFORMATION_DEPTH_REACHED = makeSymbol( "_CSETF-INFRNC-MAX-TRANSFORMATION-DEPTH-REACHED" );
    $sym116$INFRNC_DISJUNCTION_FREE_EL_VARS_POLICY = makeSymbol( "INFRNC-DISJUNCTION-FREE-EL-VARS-POLICY" );
    $sym117$_CSETF_INFRNC_DISJUNCTION_FREE_EL_VARS_POLICY = makeSymbol( "_CSETF-INFRNC-DISJUNCTION-FREE-EL-VARS-POLICY" );
    $sym118$INFRNC_RESULT_UNIQUENESS_CRITERION = makeSymbol( "INFRNC-RESULT-UNIQUENESS-CRITERION" );
    $sym119$_CSETF_INFRNC_RESULT_UNIQUENESS_CRITERION = makeSymbol( "_CSETF-INFRNC-RESULT-UNIQUENESS-CRITERION" );
    $sym120$INFRNC_ALLOW_HL_PREDICATE_TRANSFORMATION_ = makeSymbol( "INFRNC-ALLOW-HL-PREDICATE-TRANSFORMATION?" );
    $sym121$_CSETF_INFRNC_ALLOW_HL_PREDICATE_TRANSFORMATION_ = makeSymbol( "_CSETF-INFRNC-ALLOW-HL-PREDICATE-TRANSFORMATION?" );
    $sym122$INFRNC_ALLOW_UNBOUND_PREDICATE_TRANSFORMATION_ = makeSymbol( "INFRNC-ALLOW-UNBOUND-PREDICATE-TRANSFORMATION?" );
    $sym123$_CSETF_INFRNC_ALLOW_UNBOUND_PREDICATE_TRANSFORMATION_ = makeSymbol( "_CSETF-INFRNC-ALLOW-UNBOUND-PREDICATE-TRANSFORMATION?" );
    $sym124$INFRNC_ALLOW_EVALUATABLE_PREDICATE_TRANSFORMATION_ = makeSymbol( "INFRNC-ALLOW-EVALUATABLE-PREDICATE-TRANSFORMATION?" );
    $sym125$_CSETF_INFRNC_ALLOW_EVALUATABLE_PREDICATE_TRANSFORMATION_ = makeSymbol( "_CSETF-INFRNC-ALLOW-EVALUATABLE-PREDICATE-TRANSFORMATION?" );
    $sym126$INFRNC_ALLOW_INDETERMINATE_RESULTS_ = makeSymbol( "INFRNC-ALLOW-INDETERMINATE-RESULTS?" );
    $sym127$_CSETF_INFRNC_ALLOW_INDETERMINATE_RESULTS_ = makeSymbol( "_CSETF-INFRNC-ALLOW-INDETERMINATE-RESULTS?" );
    $sym128$INFRNC_ALLOWED_RULES = makeSymbol( "INFRNC-ALLOWED-RULES" );
    $sym129$_CSETF_INFRNC_ALLOWED_RULES = makeSymbol( "_CSETF-INFRNC-ALLOWED-RULES" );
    $sym130$INFRNC_FORBIDDEN_RULES = makeSymbol( "INFRNC-FORBIDDEN-RULES" );
    $sym131$_CSETF_INFRNC_FORBIDDEN_RULES = makeSymbol( "_CSETF-INFRNC-FORBIDDEN-RULES" );
    $sym132$INFRNC_ALLOWED_MODULES = makeSymbol( "INFRNC-ALLOWED-MODULES" );
    $sym133$_CSETF_INFRNC_ALLOWED_MODULES = makeSymbol( "_CSETF-INFRNC-ALLOWED-MODULES" );
    $sym134$INFRNC_ALLOW_ABNORMALITY_CHECKING_ = makeSymbol( "INFRNC-ALLOW-ABNORMALITY-CHECKING?" );
    $sym135$_CSETF_INFRNC_ALLOW_ABNORMALITY_CHECKING_ = makeSymbol( "_CSETF-INFRNC-ALLOW-ABNORMALITY-CHECKING?" );
    $sym136$INFRNC_TRANSITIVE_CLOSURE_MODE = makeSymbol( "INFRNC-TRANSITIVE-CLOSURE-MODE" );
    $sym137$_CSETF_INFRNC_TRANSITIVE_CLOSURE_MODE = makeSymbol( "_CSETF-INFRNC-TRANSITIVE-CLOSURE-MODE" );
    $sym138$INFRNC_PROBLEM_STORE_PRIVATE_ = makeSymbol( "INFRNC-PROBLEM-STORE-PRIVATE?" );
    $sym139$_CSETF_INFRNC_PROBLEM_STORE_PRIVATE_ = makeSymbol( "_CSETF-INFRNC-PROBLEM-STORE-PRIVATE?" );
    $sym140$INFRNC_CONTINUABLE_ = makeSymbol( "INFRNC-CONTINUABLE?" );
    $sym141$_CSETF_INFRNC_CONTINUABLE_ = makeSymbol( "_CSETF-INFRNC-CONTINUABLE?" );
    $sym142$INFRNC_BROWSABLE_ = makeSymbol( "INFRNC-BROWSABLE?" );
    $sym143$_CSETF_INFRNC_BROWSABLE_ = makeSymbol( "_CSETF-INFRNC-BROWSABLE?" );
    $sym144$INFRNC_RETURN_TYPE = makeSymbol( "INFRNC-RETURN-TYPE" );
    $sym145$_CSETF_INFRNC_RETURN_TYPE = makeSymbol( "_CSETF-INFRNC-RETURN-TYPE" );
    $sym146$INFRNC_ANSWER_LANGUAGE = makeSymbol( "INFRNC-ANSWER-LANGUAGE" );
    $sym147$_CSETF_INFRNC_ANSWER_LANGUAGE = makeSymbol( "_CSETF-INFRNC-ANSWER-LANGUAGE" );
    $sym148$INFRNC_CACHE_RESULTS_ = makeSymbol( "INFRNC-CACHE-RESULTS?" );
    $sym149$_CSETF_INFRNC_CACHE_RESULTS_ = makeSymbol( "_CSETF-INFRNC-CACHE-RESULTS?" );
    $sym150$INFRNC_BLOCKING_ = makeSymbol( "INFRNC-BLOCKING?" );
    $sym151$_CSETF_INFRNC_BLOCKING_ = makeSymbol( "_CSETF-INFRNC-BLOCKING?" );
    $sym152$INFRNC_MAX_NUMBER = makeSymbol( "INFRNC-MAX-NUMBER" );
    $sym153$_CSETF_INFRNC_MAX_NUMBER = makeSymbol( "_CSETF-INFRNC-MAX-NUMBER" );
    $sym154$INFRNC_MAX_TIME = makeSymbol( "INFRNC-MAX-TIME" );
    $sym155$_CSETF_INFRNC_MAX_TIME = makeSymbol( "_CSETF-INFRNC-MAX-TIME" );
    $sym156$INFRNC_MAX_STEP = makeSymbol( "INFRNC-MAX-STEP" );
    $sym157$_CSETF_INFRNC_MAX_STEP = makeSymbol( "_CSETF-INFRNC-MAX-STEP" );
    $sym158$INFRNC_MODE = makeSymbol( "INFRNC-MODE" );
    $sym159$_CSETF_INFRNC_MODE = makeSymbol( "_CSETF-INFRNC-MODE" );
    $sym160$INFRNC_FORWARD_MAX_TIME = makeSymbol( "INFRNC-FORWARD-MAX-TIME" );
    $sym161$_CSETF_INFRNC_FORWARD_MAX_TIME = makeSymbol( "_CSETF-INFRNC-FORWARD-MAX-TIME" );
    $sym162$INFRNC_MAX_PROOF_DEPTH = makeSymbol( "INFRNC-MAX-PROOF-DEPTH" );
    $sym163$_CSETF_INFRNC_MAX_PROOF_DEPTH = makeSymbol( "_CSETF-INFRNC-MAX-PROOF-DEPTH" );
    $sym164$INFRNC_MAX_TRANSFORMATION_DEPTH = makeSymbol( "INFRNC-MAX-TRANSFORMATION-DEPTH" );
    $sym165$_CSETF_INFRNC_MAX_TRANSFORMATION_DEPTH = makeSymbol( "_CSETF-INFRNC-MAX-TRANSFORMATION-DEPTH" );
    $sym166$INFRNC_MIN_RULE_UTILITY = makeSymbol( "INFRNC-MIN-RULE-UTILITY" );
    $sym167$_CSETF_INFRNC_MIN_RULE_UTILITY = makeSymbol( "_CSETF-INFRNC-MIN-RULE-UTILITY" );
    $sym168$INFRNC_PROBABLY_APPROXIMATELY_DONE = makeSymbol( "INFRNC-PROBABLY-APPROXIMATELY-DONE" );
    $sym169$_CSETF_INFRNC_PROBABLY_APPROXIMATELY_DONE = makeSymbol( "_CSETF-INFRNC-PROBABLY-APPROXIMATELY-DONE" );
    $sym170$INFRNC_METRICS_TEMPLATE = makeSymbol( "INFRNC-METRICS-TEMPLATE" );
    $sym171$_CSETF_INFRNC_METRICS_TEMPLATE = makeSymbol( "_CSETF-INFRNC-METRICS-TEMPLATE" );
    $sym172$INFRNC_START_UNIVERSAL_TIME = makeSymbol( "INFRNC-START-UNIVERSAL-TIME" );
    $sym173$_CSETF_INFRNC_START_UNIVERSAL_TIME = makeSymbol( "_CSETF-INFRNC-START-UNIVERSAL-TIME" );
    $sym174$INFRNC_START_INTERNAL_REAL_TIME = makeSymbol( "INFRNC-START-INTERNAL-REAL-TIME" );
    $sym175$_CSETF_INFRNC_START_INTERNAL_REAL_TIME = makeSymbol( "_CSETF-INFRNC-START-INTERNAL-REAL-TIME" );
    $sym176$INFRNC_END_INTERNAL_REAL_TIME = makeSymbol( "INFRNC-END-INTERNAL-REAL-TIME" );
    $sym177$_CSETF_INFRNC_END_INTERNAL_REAL_TIME = makeSymbol( "_CSETF-INFRNC-END-INTERNAL-REAL-TIME" );
    $sym178$INFRNC_PAD_INTERNAL_REAL_TIME = makeSymbol( "INFRNC-PAD-INTERNAL-REAL-TIME" );
    $sym179$_CSETF_INFRNC_PAD_INTERNAL_REAL_TIME = makeSymbol( "_CSETF-INFRNC-PAD-INTERNAL-REAL-TIME" );
    $sym180$INFRNC_HYPOTHESIZATION_TIME = makeSymbol( "INFRNC-HYPOTHESIZATION-TIME" );
    $sym181$_CSETF_INFRNC_HYPOTHESIZATION_TIME = makeSymbol( "_CSETF-INFRNC-HYPOTHESIZATION-TIME" );
    $sym182$INFRNC_CUMULATIVE_TIME = makeSymbol( "INFRNC-CUMULATIVE-TIME" );
    $sym183$_CSETF_INFRNC_CUMULATIVE_TIME = makeSymbol( "_CSETF-INFRNC-CUMULATIVE-TIME" );
    $sym184$INFRNC_STEP_COUNT = makeSymbol( "INFRNC-STEP-COUNT" );
    $sym185$_CSETF_INFRNC_STEP_COUNT = makeSymbol( "_CSETF-INFRNC-STEP-COUNT" );
    $sym186$INFRNC_CUMULATIVE_STEP_COUNT = makeSymbol( "INFRNC-CUMULATIVE-STEP-COUNT" );
    $sym187$_CSETF_INFRNC_CUMULATIVE_STEP_COUNT = makeSymbol( "_CSETF-INFRNC-CUMULATIVE-STEP-COUNT" );
    $sym188$INFRNC_EVENTS = makeSymbol( "INFRNC-EVENTS" );
    $sym189$_CSETF_INFRNC_EVENTS = makeSymbol( "_CSETF-INFRNC-EVENTS" );
    $sym190$INFRNC_HALT_CONDITIONS = makeSymbol( "INFRNC-HALT-CONDITIONS" );
    $sym191$_CSETF_INFRNC_HALT_CONDITIONS = makeSymbol( "_CSETF-INFRNC-HALT-CONDITIONS" );
    $sym192$INFRNC_ACCUMULATORS = makeSymbol( "INFRNC-ACCUMULATORS" );
    $sym193$_CSETF_INFRNC_ACCUMULATORS = makeSymbol( "_CSETF-INFRNC-ACCUMULATORS" );
    $sym194$INFRNC_PROOF_WATERMARK = makeSymbol( "INFRNC-PROOF-WATERMARK" );
    $sym195$_CSETF_INFRNC_PROOF_WATERMARK = makeSymbol( "_CSETF-INFRNC-PROOF-WATERMARK" );
    $sym196$INFRNC_PROBLEM_WORKING_TIME_DATA = makeSymbol( "INFRNC-PROBLEM-WORKING-TIME-DATA" );
    $sym197$_CSETF_INFRNC_PROBLEM_WORKING_TIME_DATA = makeSymbol( "_CSETF-INFRNC-PROBLEM-WORKING-TIME-DATA" );
    $sym198$INFRNC_TYPE = makeSymbol( "INFRNC-TYPE" );
    $sym199$_CSETF_INFRNC_TYPE = makeSymbol( "_CSETF-INFRNC-TYPE" );
    $sym200$INFRNC_DATA = makeSymbol( "INFRNC-DATA" );
    $sym201$_CSETF_INFRNC_DATA = makeSymbol( "_CSETF-INFRNC-DATA" );
    $sym202$INFRNC_PROPERTIES = makeSymbol( "INFRNC-PROPERTIES" );
    $sym203$_CSETF_INFRNC_PROPERTIES = makeSymbol( "_CSETF-INFRNC-PROPERTIES" );
    $kw204$SUID = makeKeyword( "SUID" );
    $kw205$PROBLEM_STORE = makeKeyword( "PROBLEM-STORE" );
    $kw206$FORWARD_PROPAGATE = makeKeyword( "FORWARD-PROPAGATE" );
    $kw207$INPUT_MT = makeKeyword( "INPUT-MT" );
    $kw208$INPUT_EL_QUERY = makeKeyword( "INPUT-EL-QUERY" );
    $kw209$INPUT_NON_EXPLANATORY_EL_QUERY = makeKeyword( "INPUT-NON-EXPLANATORY-EL-QUERY" );
    $kw210$INPUT_QUERY_PROPERTIES = makeKeyword( "INPUT-QUERY-PROPERTIES" );
    $kw211$MT = makeKeyword( "MT" );
    $kw212$EL_QUERY = makeKeyword( "EL-QUERY" );
    $kw213$EL_BINDINGS = makeKeyword( "EL-BINDINGS" );
    $kw214$HL_QUERY = makeKeyword( "HL-QUERY" );
    $kw215$EXPLANATORY_SUBQUERY = makeKeyword( "EXPLANATORY-SUBQUERY" );
    $kw216$NON_EXPLANATORY_SUBQUERY = makeKeyword( "NON-EXPLANATORY-SUBQUERY" );
    $kw217$FREE_HL_VARS = makeKeyword( "FREE-HL-VARS" );
    $kw218$HYPOTHETICAL_BINDINGS = makeKeyword( "HYPOTHETICAL-BINDINGS" );
    $kw219$ANSWER_ID_INDEX = makeKeyword( "ANSWER-ID-INDEX" );
    $kw220$ANSWER_BINDINGS_INDEX = makeKeyword( "ANSWER-BINDINGS-INDEX" );
    $kw221$NEW_ANSWER_ID_START = makeKeyword( "NEW-ANSWER-ID-START" );
    $kw222$NEW_ANSWER_JUSTIFICATIONS = makeKeyword( "NEW-ANSWER-JUSTIFICATIONS" );
    $kw223$STATUS = makeKeyword( "STATUS" );
    $kw224$SUSPEND_STATUS = makeKeyword( "SUSPEND-STATUS" );
    $kw225$ROOT_LINK = makeKeyword( "ROOT-LINK" );
    $kw226$RELEVANT_PROBLEMS = makeKeyword( "RELEVANT-PROBLEMS" );
    $kw227$STRATEGY_SET = makeKeyword( "STRATEGY-SET" );
    $kw228$CONTROL_PROCESS = makeKeyword( "CONTROL-PROCESS" );
    $kw229$INTERRUPTING_PROCESSES = makeKeyword( "INTERRUPTING-PROCESSES" );
    $kw230$MAX_TRANSFORMATION_DEPTH_REACHED = makeKeyword( "MAX-TRANSFORMATION-DEPTH-REACHED" );
    $kw231$DISJUNCTION_FREE_EL_VARS_POLICY = makeKeyword( "DISJUNCTION-FREE-EL-VARS-POLICY" );
    $kw232$RESULT_UNIQUENESS_CRITERION = makeKeyword( "RESULT-UNIQUENESS-CRITERION" );
    $kw233$ALLOW_HL_PREDICATE_TRANSFORMATION_ = makeKeyword( "ALLOW-HL-PREDICATE-TRANSFORMATION?" );
    $kw234$ALLOW_UNBOUND_PREDICATE_TRANSFORMATION_ = makeKeyword( "ALLOW-UNBOUND-PREDICATE-TRANSFORMATION?" );
    $kw235$ALLOW_EVALUATABLE_PREDICATE_TRANSFORMATION_ = makeKeyword( "ALLOW-EVALUATABLE-PREDICATE-TRANSFORMATION?" );
    $kw236$ALLOW_INDETERMINATE_RESULTS_ = makeKeyword( "ALLOW-INDETERMINATE-RESULTS?" );
    $kw237$ALLOWED_RULES = makeKeyword( "ALLOWED-RULES" );
    $kw238$FORBIDDEN_RULES = makeKeyword( "FORBIDDEN-RULES" );
    $kw239$ALLOWED_MODULES = makeKeyword( "ALLOWED-MODULES" );
    $kw240$ALLOW_ABNORMALITY_CHECKING_ = makeKeyword( "ALLOW-ABNORMALITY-CHECKING?" );
    $kw241$TRANSITIVE_CLOSURE_MODE = makeKeyword( "TRANSITIVE-CLOSURE-MODE" );
    $kw242$PROBLEM_STORE_PRIVATE_ = makeKeyword( "PROBLEM-STORE-PRIVATE?" );
    $kw243$CONTINUABLE_ = makeKeyword( "CONTINUABLE?" );
    $kw244$BROWSABLE_ = makeKeyword( "BROWSABLE?" );
    $kw245$RETURN_TYPE = makeKeyword( "RETURN-TYPE" );
    $kw246$ANSWER_LANGUAGE = makeKeyword( "ANSWER-LANGUAGE" );
    $kw247$CACHE_RESULTS_ = makeKeyword( "CACHE-RESULTS?" );
    $kw248$BLOCKING_ = makeKeyword( "BLOCKING?" );
    $kw249$MAX_NUMBER = makeKeyword( "MAX-NUMBER" );
    $kw250$MAX_TIME = makeKeyword( "MAX-TIME" );
    $kw251$MAX_STEP = makeKeyword( "MAX-STEP" );
    $kw252$MODE = makeKeyword( "MODE" );
    $kw253$FORWARD_MAX_TIME = makeKeyword( "FORWARD-MAX-TIME" );
    $kw254$MAX_PROOF_DEPTH = makeKeyword( "MAX-PROOF-DEPTH" );
    $kw255$MAX_TRANSFORMATION_DEPTH = makeKeyword( "MAX-TRANSFORMATION-DEPTH" );
    $kw256$MIN_RULE_UTILITY = makeKeyword( "MIN-RULE-UTILITY" );
    $kw257$PROBABLY_APPROXIMATELY_DONE = makeKeyword( "PROBABLY-APPROXIMATELY-DONE" );
    $kw258$METRICS_TEMPLATE = makeKeyword( "METRICS-TEMPLATE" );
    $kw259$START_UNIVERSAL_TIME = makeKeyword( "START-UNIVERSAL-TIME" );
    $kw260$START_INTERNAL_REAL_TIME = makeKeyword( "START-INTERNAL-REAL-TIME" );
    $kw261$END_INTERNAL_REAL_TIME = makeKeyword( "END-INTERNAL-REAL-TIME" );
    $kw262$PAD_INTERNAL_REAL_TIME = makeKeyword( "PAD-INTERNAL-REAL-TIME" );
    $kw263$HYPOTHESIZATION_TIME = makeKeyword( "HYPOTHESIZATION-TIME" );
    $kw264$CUMULATIVE_TIME = makeKeyword( "CUMULATIVE-TIME" );
    $kw265$STEP_COUNT = makeKeyword( "STEP-COUNT" );
    $kw266$CUMULATIVE_STEP_COUNT = makeKeyword( "CUMULATIVE-STEP-COUNT" );
    $kw267$EVENTS = makeKeyword( "EVENTS" );
    $kw268$HALT_CONDITIONS = makeKeyword( "HALT-CONDITIONS" );
    $kw269$ACCUMULATORS = makeKeyword( "ACCUMULATORS" );
    $kw270$PROOF_WATERMARK = makeKeyword( "PROOF-WATERMARK" );
    $kw271$PROBLEM_WORKING_TIME_DATA = makeKeyword( "PROBLEM-WORKING-TIME-DATA" );
    $kw272$TYPE = makeKeyword( "TYPE" );
    $kw273$DATA = makeKeyword( "DATA" );
    $kw274$PROPERTIES = makeKeyword( "PROPERTIES" );
    $str275$Invalid_slot__S_for_construction_ = makeString( "Invalid slot ~S for construction function" );
    $kw276$BEGIN = makeKeyword( "BEGIN" );
    $sym277$MAKE_INFERENCE = makeSymbol( "MAKE-INFERENCE" );
    $kw278$SLOT = makeKeyword( "SLOT" );
    $kw279$END = makeKeyword( "END" );
    $sym280$VISIT_DEFSTRUCT_OBJECT_INFERENCE_METHOD = makeSymbol( "VISIT-DEFSTRUCT-OBJECT-INFERENCE-METHOD" );
    $kw281$DEAD = makeKeyword( "DEAD" );
    $str282$_Invalid_INFERENCE__s_ = makeString( "<Invalid INFERENCE ~s>" );
    $str283$_INFERENCE__a__a__a__s_in__s_ = makeString( "<INFERENCE ~a.~a:~a:~s in ~s>" );
    $sym284$SXHASH_INFERENCE_METHOD = makeSymbol( "SXHASH-INFERENCE-METHOD" );
    $kw285$NEW = makeKeyword( "NEW" );
    $kw286$PREPARED = makeKeyword( "PREPARED" );
    $kw287$READY = makeKeyword( "READY" );
    $kw288$RUNNING = makeKeyword( "RUNNING" );
    $kw289$SUSPENDED = makeKeyword( "SUSPENDED" );
    $list290 = ConsesLow.list( ConsesLow.list( makeSymbol( "PROBLEM-VAR" ), makeSymbol( "INFERENCE" ) ), makeSymbol( "&BODY" ), makeSymbol( "BODY" ) );
    $sym291$DO_SET = makeSymbol( "DO-SET" );
    $sym292$INFERENCE_RELEVANT_PROBLEMS = makeSymbol( "INFERENCE-RELEVANT-PROBLEMS" );
    $list293 = ConsesLow.list( ConsesLow.list( makeSymbol( "JUST-VAR" ), makeSymbol( "INFERENCE" ) ), makeSymbol( "&BODY" ), makeSymbol( "BODY" ) );
    $sym294$DO_QUEUE_ELEMENTS = makeSymbol( "DO-QUEUE-ELEMENTS" );
    $sym295$INFERENCE_NEW_ANSWER_JUSTIFICATIONS = makeSymbol( "INFERENCE-NEW-ANSWER-JUSTIFICATIONS" );
    $list296 = ConsesLow.list( ConsesLow.list( makeSymbol( "ANSWER-VAR" ), makeSymbol( "INFERENCE" ) ), makeSymbol( "&BODY" ), makeSymbol( "BODY" ) );
    $sym297$START_ID = makeUninternedSymbol( "START-ID" );
    $sym298$END_ID = makeUninternedSymbol( "END-ID" );
    $sym299$ID = makeUninternedSymbol( "ID" );
    $sym300$INF = makeUninternedSymbol( "INF" );
    $sym301$CLET = makeSymbol( "CLET" );
    $sym302$INFERENCE_NEW_ANSWER_ID_START = makeSymbol( "INFERENCE-NEW-ANSWER-ID-START" );
    $sym303$INFERENCE_NEXT_NEW_ANSWER_ID = makeSymbol( "INFERENCE-NEXT-NEW-ANSWER-ID" );
    $sym304$CDO = makeSymbol( "CDO" );
    $sym305$1_ = makeSymbol( "1+" );
    $sym306$__ = makeSymbol( ">=" );
    $sym307$FIND_INFERENCE_ANSWER_BY_ID = makeSymbol( "FIND-INFERENCE-ANSWER-BY-ID" );
    $list308 = ConsesLow.list( ConsesLow.list( makeSymbol( "ANSWER-VAR" ), makeSymbol( "INFERENCE" ), makeSymbol( "&KEY" ), makeSymbol( "ORDERED" ) ), makeSymbol( "&BODY" ), makeSymbol( "BODY" ) );
    $list309 = ConsesLow.list( makeKeyword( "ORDERED" ) );
    $kw310$ALLOW_OTHER_KEYS = makeKeyword( "ALLOW-OTHER-KEYS" );
    $kw311$ORDERED = makeKeyword( "ORDERED" );
    $sym312$ID = makeUninternedSymbol( "ID" );
    $sym313$DO_ID_INDEX = makeSymbol( "DO-ID-INDEX" );
    $sym314$INFERENCE_ANSWER_ID_INDEX = makeSymbol( "INFERENCE-ANSWER-ID-INDEX" );
    $sym315$IGNORE = makeSymbol( "IGNORE" );
    $list316 = ConsesLow.list( ConsesLow.list( makeSymbol( "ANSWER-VAR" ), makeSymbol( "INFERENCE" ), makeSymbol( "START-INDEX" ) ), makeSymbol( "&BODY" ), makeSymbol( "BODY" ) );
    $sym317$START_ID = makeUninternedSymbol( "START-ID" );
    $sym318$END_ID = makeUninternedSymbol( "END-ID" );
    $sym319$ID = makeUninternedSymbol( "ID" );
    $sym320$INF = makeUninternedSymbol( "INF" );
    $sym321$CSETQ = makeSymbol( "CSETQ" );
    $sym322$ANSWER = makeUninternedSymbol( "ANSWER" );
    $sym323$DO_INFERENCE_ANSWERS = makeSymbol( "DO-INFERENCE-ANSWERS" );
    $sym324$DO_INFERENCE_ANSWER_JUSTIFICATIONS = makeSymbol( "DO-INFERENCE-ANSWER-JUSTIFICATIONS" );
    $list325 = ConsesLow.list( ConsesLow.list( makeSymbol( "PROCESS-VAR" ), makeSymbol( "INFERENCE" ) ), makeSymbol( "&BODY" ), makeSymbol( "BODY" ) );
    $sym326$DO_QUEUE_DEQUEUE = makeSymbol( "DO-QUEUE-DEQUEUE" );
    $sym327$INFERENCE_INTERRUPTING_PROCESSES = makeSymbol( "INFERENCE-INTERRUPTING-PROCESSES" );
    $list328 = ConsesLow.list( ConsesLow.list( makeSymbol( "PROOF-VAR" ), makeSymbol( "INFERENCE" ), makeSymbol( "&KEY" ), makeSymbol( "PROOF-STATUS" ) ), makeSymbol( "&BODY" ), makeSymbol( "BODY" ) );
    $list329 = ConsesLow.list( makeKeyword( "PROOF-STATUS" ) );
    $kw330$PROOF_STATUS = makeKeyword( "PROOF-STATUS" );
    $sym331$ROOT_PROBLEM = makeUninternedSymbol( "ROOT-PROBLEM" );
    $sym332$INFERENCE_ROOT_PROBLEM = makeSymbol( "INFERENCE-ROOT-PROBLEM" );
    $sym333$PWHEN = makeSymbol( "PWHEN" );
    $sym334$DO_PROBLEM_PROOFS = makeSymbol( "DO-PROBLEM-PROOFS" );
    $list335 = ConsesLow.list( ConsesLow.list( makeSymbol( "RULE-VAR" ), makeSymbol( "INFERENCE" ), makeSymbol( "&KEY" ), makeSymbol( "DONE" ) ), makeSymbol( "&BODY" ), makeSymbol( "BODY" ) );
    $list336 = ConsesLow.list( makeKeyword( "DONE" ) );
    $kw337$DONE = makeKeyword( "DONE" );
    $sym338$INFERENCE_ALLOWED_RULES = makeSymbol( "INFERENCE-ALLOWED-RULES" );
    $list339 = ConsesLow.list( ConsesLow.list( makeSymbol( "INFERENCE" ) ), makeSymbol( "&BODY" ), makeSymbol( "BODY" ) );
    $sym340$WITH_LOCK_HELD = makeSymbol( "WITH-LOCK-HELD" );
    $sym341$INFERENCE_PROBLEM_WORKING_TIME_LOCK = makeSymbol( "INFERENCE-PROBLEM-WORKING-TIME-LOCK" );
    $sym342$PROBLEM_STORE_P = makeSymbol( "PROBLEM-STORE-P" );
    $kw343$TAUTOLOGY = makeKeyword( "TAUTOLOGY" );
    $kw344$IGNORE_ERRORS_TARGET = makeKeyword( "IGNORE-ERRORS-TARGET" );
    $sym345$IGNORE_ERRORS_HANDLER = makeSymbol( "IGNORE-ERRORS-HANDLER", "SUBLISP" );
    $kw346$FREE = makeKeyword( "FREE" );
    $sym347$DO_INFERENCE_NEW_ANSWERS = makeSymbol( "DO-INFERENCE-NEW-ANSWERS" );
    $sym348$DO_INFERENCE_NEW_ANSWER_JUSTIFICATIONS = makeSymbol( "DO-INFERENCE-NEW-ANSWER-JUSTIFICATIONS" );
    $sym349$FORWARD_PROPAGATE_P = makeSymbol( "FORWARD-PROPAGATE-P" );
    $sym350$POSSIBLY_MT_P = makeSymbol( "POSSIBLY-MT-P" );
    $sym351$POSSIBLY_INFERENCE_SENTENCE_P = makeSymbol( "POSSIBLY-INFERENCE-SENTENCE-P" );
    $sym352$QUERY_PROPERTIES_P = makeSymbol( "QUERY-PROPERTIES-P" );
    $sym353$HLMT_P = makeSymbol( "HLMT-P" );
    $sym354$BINDING_LIST_P = makeSymbol( "BINDING-LIST-P" );
    $sym355$PROBLEM_QUERY_P = makeSymbol( "PROBLEM-QUERY-P" );
    $sym356$EXPLANATORY_SUBQUERY_SPEC_P = makeSymbol( "EXPLANATORY-SUBQUERY-SPEC-P" );
    $sym357$NON_EXPLANATORY_SUBQUERY_SPEC_P = makeSymbol( "NON-EXPLANATORY-SUBQUERY-SPEC-P" );
    $sym358$LISTP = makeSymbol( "LISTP" );
    $sym359$INFERENCE_STATUS_P = makeSymbol( "INFERENCE-STATUS-P" );
    $sym360$INFERENCE_SUSPEND_STATUS_P = makeSymbol( "INFERENCE-SUSPEND-STATUS-P" );
    $sym361$ANSWER_LINK_P = makeSymbol( "ANSWER-LINK-P" );
    $sym362$PROCESSP = makeSymbol( "PROCESSP" );
    $sym363$NON_NEGATIVE_INTEGER_P = makeSymbol( "NON-NEGATIVE-INTEGER-P" );
    $sym364$INFERENCE_DISJUNCTION_FREE_EL_VARS_POLICY_P = makeSymbol( "INFERENCE-DISJUNCTION-FREE-EL-VARS-POLICY-P" );
    $sym365$RESULT_UNIQUENESS_CRITERION_P = makeSymbol( "RESULT-UNIQUENESS-CRITERION-P" );
    $sym366$BOOLEANP = makeSymbol( "BOOLEANP" );
    $sym367$ALLOWED_MODULES_SPEC_P = makeSymbol( "ALLOWED-MODULES-SPEC-P" );
    $sym368$INFERENCE_TRANSITIVE_CLOSURE_MODE_P = makeSymbol( "INFERENCE-TRANSITIVE-CLOSURE-MODE-P" );
    $sym369$INFERENCE_RETURN_TYPE_P = makeSymbol( "INFERENCE-RETURN-TYPE-P" );
    $sym370$INFERENCE_ANSWER_LANGUAGE_P = makeSymbol( "INFERENCE-ANSWER-LANGUAGE-P" );
    $sym371$NON_NEGATIVE_NUMBER_P = makeSymbol( "NON-NEGATIVE-NUMBER-P" );
    $sym372$INFERENCE_MODE_P = makeSymbol( "INFERENCE-MODE-P" );
    $str373$Forward_max_time__s_cannot_be_gre = makeString( "Forward max time ~s cannot be greater than max time ~s" );
    $sym374$RULE_UTILITY_P = makeSymbol( "RULE-UTILITY-P" );
    $sym375$PROBABILITY_P = makeSymbol( "PROBABILITY-P" );
    $sym376$NON_DOTTED_LIST_P = makeSymbol( "NON-DOTTED-LIST-P" );
    $sym377$QUERY_METRIC_P = makeSymbol( "QUERY-METRIC-P" );
    $sym378$UNIVERSAL_TIME_P = makeSymbol( "UNIVERSAL-TIME-P" );
    $sym379$POTENTIALLY_INFINITE_INTEGER_P = makeSymbol( "POTENTIALLY-INFINITE-INTEGER-P" );
    $sym380$NUMBERP = makeSymbol( "NUMBERP" );
    $sym381$INFERENCE_EVENT_TYPE_P = makeSymbol( "INFERENCE-EVENT-TYPE-P" );
    $sym382$INFERENCE_HALT_CONDITION_P = makeSymbol( "INFERENCE-HALT-CONDITION-P" );
    $sym383$INFERENCE_TYPE_P = makeSymbol( "INFERENCE-TYPE-P" );
    $sym384$PROPERTY_LIST_P = makeSymbol( "PROPERTY-LIST-P" );
    $list385 = ConsesLow.list( ConsesLow.list( makeSymbol( "STORE-ID-VAR" ), makeSymbol( "INFERENCE-ID-VAR" ), makeSymbol( "INFERENCE" ) ), makeSymbol( "&BODY" ), makeSymbol( "BODY" ) );
    $sym386$INFERENCE_VAR = makeUninternedSymbol( "INFERENCE-VAR" );
    $sym387$INFERENCE_PROBLEM_STORE_SUID = makeSymbol( "INFERENCE-PROBLEM-STORE-SUID" );
    $sym388$INFERENCE_SUID = makeSymbol( "INFERENCE-SUID" );
    $kw389$SKIP = makeKeyword( "SKIP" );
    $sym390$SUCCESSFUL_INFERENCE_P = makeSymbol( "SUCCESSFUL-INFERENCE-P" );
    $kw391$NEG = makeKeyword( "NEG" );
    $list392 = ConsesLow.list( makeSymbol( "MT" ), makeSymbol( "ASENT" ) );
    $sym393$HLMT_EQUAL = makeSymbol( "HLMT-EQUAL" );
    $kw394$POS = makeKeyword( "POS" );
    $list395 = ConsesLow.list( makeSymbol( "HL-MT" ), makeSymbol( "ASENT" ) );
    $sym396$QUERY_PROPERTY_P = makeSymbol( "QUERY-PROPERTY-P" );
    $sym397$NEW_CYC_QUERY = makeSymbol( "NEW-CYC-QUERY" );
    $str398$_new_cyc_query_A = makeString( "(new-cyc-query~A" );
    $str399$_____A = makeString( "~%  ~A" );
    $str400$_A = makeString( "~A" );
    $str401$_____list______ = makeString( "~%  (list~%    " );
    $kw402$DOWNCASE = makeKeyword( "DOWNCASE" );
    $str403$_S__find_problem_store_by_id__S__ = makeString( "~S (find-problem-store-by-id ~S)~%    " );
    $kw404$ALL = makeKeyword( "ALL" );
    $str405$_S__list = makeString( "~S (list" );
    $str406$_________find_object_by_hl_extern = makeString( "~&      (find-object-by-hl-external-id-string ~S)" );
    $str407$_______ = makeString( ")~%    " );
    $str408$_S__S______ = makeString( "~S ~S~%    " );
    $str409$_ = makeString( ")" );
    $kw410$PROOF = makeKeyword( "PROOF" );
    $kw411$BINDINGS = makeKeyword( "BINDINGS" );
    $kw412$NONE = makeKeyword( "NONE" );
    $list413 = ConsesLow.list( makeSymbol( "PROBLEM-STORE-SUID" ), makeSymbol( "INFERENCE-SUID" ), makeSymbol( "ANSWER-SUID" ) );
    $sym414$INFERENCE_ACCUMULATOR_TYPE_P = makeSymbol( "INFERENCE-ACCUMULATOR-TYPE-P" );
    $sym415$ACCUMULATOR_P = makeSymbol( "ACCUMULATOR-P" );
    $sym416$_PAD_TIMES_TO_FIRST_ANSWER_ = makeSymbol( "*PAD-TIMES-TO-FIRST-ANSWER*" );
    $kw417$UNINITIALIZED = makeKeyword( "UNINITIALIZED" );
    $kw418$POSITIVE_INFINITY = makeKeyword( "POSITIVE-INFINITY" );
    $sym419$_ = makeSymbol( "<" );
    $kw420$LOOK_NO_DEEPER_FOR_ADDITIONAL_ANSWERS = makeKeyword( "LOOK-NO-DEEPER-FOR-ADDITIONAL-ANSWERS" );
    $str421$got_a_null_answer_for__s = makeString( "got a null answer for ~s" );
    $kw422$GOOD = makeKeyword( "GOOD" );
    $kw423$TACTICAL = makeKeyword( "TACTICAL" );
    $kw424$NO_GOOD = makeKeyword( "NO-GOOD" );
    $kw425$NEUTRAL = makeKeyword( "NEUTRAL" );
    $sym426$INFERENCE_STATIC_PROPERTIES_P = makeSymbol( "INFERENCE-STATIC-PROPERTIES-P" );
    $sym427$ALLOWED_RULES_SPEC_P = makeSymbol( "ALLOWED-RULES-SPEC-P" );
    $sym428$FORBIDDEN_RULES_SPEC_P = makeSymbol( "FORBIDDEN-RULES-SPEC-P" );
    $sym429$QUERY_DYNAMIC_PROPERTIES_P = makeSymbol( "QUERY-DYNAMIC-PROPERTIES-P" );
    $kw430$INFERENCE_MODE = makeKeyword( "INFERENCE-MODE" );
    $sym431$PROBLEM_P = makeSymbol( "PROBLEM-P" );
    $sym432$STRATEGY_P = makeSymbol( "STRATEGY-P" );
    $sym433$INFERENCE_ANSWER_P = makeSymbol( "INFERENCE-ANSWER-P" );
    $sym434$INFERENCE_ANSWER_JUSTIFICATION_P = makeSymbol( "INFERENCE-ANSWER-JUSTIFICATION-P" );
    $str435$variables__S_were_removed = makeString( "variables ~S were removed" );
    $str436$variables__S_were_added = makeString( "variables ~S were added" );
    $str437$variables__S_contain_duplications = makeString( "variables ~S contain duplications" );
    $kw438$SIMPLEST = makeKeyword( "SIMPLEST" );
    $sym439$SIMPLEST_INFERENCE_P = makeSymbol( "SIMPLEST-INFERENCE-P" );
    $sym440$STRATEGY_TYPE_P = makeSymbol( "STRATEGY-TYPE-P" );
    $sym441$INFERENCE_ANSWER = makeSymbol( "INFERENCE-ANSWER" );
    $list442 = ConsesLow.list( makeSymbol( "SUID" ), makeSymbol( "INFERENCE" ), makeSymbol( "BINDINGS" ), makeSymbol( "JUSTIFICATIONS" ), makeSymbol( "ELAPSED-CREATION-TIME" ), makeSymbol( "STEP-COUNT" ) );
    $list443 = ConsesLow.list( makeKeyword( "SUID" ), makeKeyword( "INFERENCE" ), makeKeyword( "BINDINGS" ), makeKeyword( "JUSTIFICATIONS" ), makeKeyword( "ELAPSED-CREATION-TIME" ), makeKeyword( "STEP-COUNT" ) );
    $list444 = ConsesLow.list( makeSymbol( "INF-ANSWER-SUID" ), makeSymbol( "INF-ANSWER-INFERENCE" ), makeSymbol( "INF-ANSWER-BINDINGS" ), makeSymbol( "INF-ANSWER-JUSTIFICATIONS" ), makeSymbol(
        "INF-ANSWER-ELAPSED-CREATION-TIME" ), makeSymbol( "INF-ANSWER-STEP-COUNT" ) );
    $list445 = ConsesLow.list( makeSymbol( "_CSETF-INF-ANSWER-SUID" ), makeSymbol( "_CSETF-INF-ANSWER-INFERENCE" ), makeSymbol( "_CSETF-INF-ANSWER-BINDINGS" ), makeSymbol( "_CSETF-INF-ANSWER-JUSTIFICATIONS" ),
        makeSymbol( "_CSETF-INF-ANSWER-ELAPSED-CREATION-TIME" ), makeSymbol( "_CSETF-INF-ANSWER-STEP-COUNT" ) );
    $sym446$PRINT_INFERENCE_ANSWER = makeSymbol( "PRINT-INFERENCE-ANSWER" );
    $sym447$INFERENCE_ANSWER_PRINT_FUNCTION_TRAMPOLINE = makeSymbol( "INFERENCE-ANSWER-PRINT-FUNCTION-TRAMPOLINE" );
    $list448 = ConsesLow.list( makeSymbol( "OPTIMIZE-FUNCALL" ), makeSymbol( "INFERENCE-ANSWER-P" ) );
    $sym449$INF_ANSWER_SUID = makeSymbol( "INF-ANSWER-SUID" );
    $sym450$_CSETF_INF_ANSWER_SUID = makeSymbol( "_CSETF-INF-ANSWER-SUID" );
    $sym451$INF_ANSWER_INFERENCE = makeSymbol( "INF-ANSWER-INFERENCE" );
    $sym452$_CSETF_INF_ANSWER_INFERENCE = makeSymbol( "_CSETF-INF-ANSWER-INFERENCE" );
    $sym453$INF_ANSWER_BINDINGS = makeSymbol( "INF-ANSWER-BINDINGS" );
    $sym454$_CSETF_INF_ANSWER_BINDINGS = makeSymbol( "_CSETF-INF-ANSWER-BINDINGS" );
    $sym455$INF_ANSWER_JUSTIFICATIONS = makeSymbol( "INF-ANSWER-JUSTIFICATIONS" );
    $sym456$_CSETF_INF_ANSWER_JUSTIFICATIONS = makeSymbol( "_CSETF-INF-ANSWER-JUSTIFICATIONS" );
    $sym457$INF_ANSWER_ELAPSED_CREATION_TIME = makeSymbol( "INF-ANSWER-ELAPSED-CREATION-TIME" );
    $sym458$_CSETF_INF_ANSWER_ELAPSED_CREATION_TIME = makeSymbol( "_CSETF-INF-ANSWER-ELAPSED-CREATION-TIME" );
    $sym459$INF_ANSWER_STEP_COUNT = makeSymbol( "INF-ANSWER-STEP-COUNT" );
    $sym460$_CSETF_INF_ANSWER_STEP_COUNT = makeSymbol( "_CSETF-INF-ANSWER-STEP-COUNT" );
    $kw461$INFERENCE = makeKeyword( "INFERENCE" );
    $kw462$JUSTIFICATIONS = makeKeyword( "JUSTIFICATIONS" );
    $kw463$ELAPSED_CREATION_TIME = makeKeyword( "ELAPSED-CREATION-TIME" );
    $sym464$MAKE_INFERENCE_ANSWER = makeSymbol( "MAKE-INFERENCE-ANSWER" );
    $sym465$VISIT_DEFSTRUCT_OBJECT_INFERENCE_ANSWER_METHOD = makeSymbol( "VISIT-DEFSTRUCT-OBJECT-INFERENCE-ANSWER-METHOD" );
    $str466$_Invalid_INFERENCE_ANSWER__s_ = makeString( "<Invalid INFERENCE-ANSWER ~s>" );
    $str467$_INFERENCE_ANSWER__a_for_INFERENC = makeString( "<INFERENCE-ANSWER ~a for INFERENCE ~a.~a:~a>" );
    $sym468$SXHASH_INFERENCE_ANSWER_METHOD = makeSymbol( "SXHASH-INFERENCE-ANSWER-METHOD" );
    $sym469$BINDINGS_P = makeSymbol( "BINDINGS-P" );
    $list470 = ConsesLow.list( ConsesLow.list( makeSymbol( "JUST-VAR" ), makeSymbol( "INFERENCE-ANSWER" ) ), makeSymbol( "&BODY" ), makeSymbol( "BODY" ) );
    $sym471$DO_LIST = makeSymbol( "DO-LIST" );
    $sym472$INFERENCE_ANSWER_JUSTIFICATIONS = makeSymbol( "INFERENCE-ANSWER-JUSTIFICATIONS" );
    $list473 = ConsesLow.list( ConsesLow.list( makeSymbol( "JUST-VAR" ), makeSymbol( "INDEX-VAR" ), makeSymbol( "INFERENCE-ANSWER" ) ), makeSymbol( "&BODY" ), makeSymbol( "BODY" ) );
    $sym474$CDOLIST_NUMBERED = makeSymbol( "CDOLIST-NUMBERED" );
    $sym475$JUSTIFICATION_EQUAL = makeSymbol( "JUSTIFICATION-EQUAL" );
    $sym476$INFERENCE_ANSWER_JUSTIFICATION_SUPPORTS = makeSymbol( "INFERENCE-ANSWER-JUSTIFICATION-SUPPORTS" );
    $kw477$HL = makeKeyword( "HL" );
    $kw478$EL = makeKeyword( "EL" );
    $str479$_S_was_not_an_inference_answer_la = makeString( "~S was not an inference-answer-language-p" );
    $sym480$INFERENCE_ANSWER_EL_SENTENCE = makeSymbol( "INFERENCE-ANSWER-EL-SENTENCE" );
    $sym481$INFERENCE_ANSWER_JUSTIFICATION = makeSymbol( "INFERENCE-ANSWER-JUSTIFICATION" );
    $list482 = ConsesLow.list( makeSymbol( "ANSWER" ), makeSymbol( "SUPPORTS" ), makeSymbol( "PRAGMA-SUPPORTS" ), makeSymbol( "PROOFS" ) );
    $list483 = ConsesLow.list( makeKeyword( "ANSWER" ), makeKeyword( "SUPPORTS" ), makeKeyword( "PRAGMA-SUPPORTS" ), makeKeyword( "PROOFS" ) );
    $list484 = ConsesLow.list( makeSymbol( "INF-ANS-JUST-ANSWER" ), makeSymbol( "INF-ANS-JUST-SUPPORTS" ), makeSymbol( "INF-ANS-JUST-PRAGMA-SUPPORTS" ), makeSymbol( "INF-ANS-JUST-PROOFS" ) );
    $list485 = ConsesLow.list( makeSymbol( "_CSETF-INF-ANS-JUST-ANSWER" ), makeSymbol( "_CSETF-INF-ANS-JUST-SUPPORTS" ), makeSymbol( "_CSETF-INF-ANS-JUST-PRAGMA-SUPPORTS" ), makeSymbol( "_CSETF-INF-ANS-JUST-PROOFS" ) );
    $sym486$PRINT_INFERENCE_ANSWER_JUSTIFICATION = makeSymbol( "PRINT-INFERENCE-ANSWER-JUSTIFICATION" );
    $sym487$INFERENCE_ANSWER_JUSTIFICATION_PRINT_FUNCTION_TRAMPOLINE = makeSymbol( "INFERENCE-ANSWER-JUSTIFICATION-PRINT-FUNCTION-TRAMPOLINE" );
    $list488 = ConsesLow.list( makeSymbol( "OPTIMIZE-FUNCALL" ), makeSymbol( "INFERENCE-ANSWER-JUSTIFICATION-P" ) );
    $sym489$INF_ANS_JUST_ANSWER = makeSymbol( "INF-ANS-JUST-ANSWER" );
    $sym490$_CSETF_INF_ANS_JUST_ANSWER = makeSymbol( "_CSETF-INF-ANS-JUST-ANSWER" );
    $sym491$INF_ANS_JUST_SUPPORTS = makeSymbol( "INF-ANS-JUST-SUPPORTS" );
    $sym492$_CSETF_INF_ANS_JUST_SUPPORTS = makeSymbol( "_CSETF-INF-ANS-JUST-SUPPORTS" );
    $sym493$INF_ANS_JUST_PRAGMA_SUPPORTS = makeSymbol( "INF-ANS-JUST-PRAGMA-SUPPORTS" );
    $sym494$_CSETF_INF_ANS_JUST_PRAGMA_SUPPORTS = makeSymbol( "_CSETF-INF-ANS-JUST-PRAGMA-SUPPORTS" );
    $sym495$INF_ANS_JUST_PROOFS = makeSymbol( "INF-ANS-JUST-PROOFS" );
    $sym496$_CSETF_INF_ANS_JUST_PROOFS = makeSymbol( "_CSETF-INF-ANS-JUST-PROOFS" );
    $kw497$ANSWER = makeKeyword( "ANSWER" );
    $kw498$SUPPORTS = makeKeyword( "SUPPORTS" );
    $kw499$PRAGMA_SUPPORTS = makeKeyword( "PRAGMA-SUPPORTS" );
    $kw500$PROOFS = makeKeyword( "PROOFS" );
    $sym501$MAKE_INFERENCE_ANSWER_JUSTIFICATION = makeSymbol( "MAKE-INFERENCE-ANSWER-JUSTIFICATION" );
    $sym502$VISIT_DEFSTRUCT_OBJECT_INFERENCE_ANSWER_JUSTIFICATION_METHOD = makeSymbol( "VISIT-DEFSTRUCT-OBJECT-INFERENCE-ANSWER-JUSTIFICATION-METHOD" );
    $str503$_INF_ANS_JUST__s_ = makeString( "<INF-ANS-JUST:~s>" );
    $sym504$SXHASH_INFERENCE_ANSWER_JUSTIFICATION_METHOD = makeSymbol( "SXHASH-INFERENCE-ANSWER-JUSTIFICATION-METHOD" );
    $sym505$HL_JUSTIFICATION_P = makeSymbol( "HL-JUSTIFICATION-P" );
    $const506$Now = constant_handles.reader_make_constant_shell( makeString( "Now" ) );
    $list507 = ConsesLow.list( ConsesLow.list( makeSymbol( "PROOF-VAR" ), makeSymbol( "JUSTIFICATION" ) ), makeSymbol( "&BODY" ), makeSymbol( "BODY" ) );
    $sym508$INFERENCE_ANSWER_JUSTIFICATION_PROOFS = makeSymbol( "INFERENCE-ANSWER-JUSTIFICATION-PROOFS" );
    $list509 = ConsesLow.list( ConsesLow.list( makeSymbol( "JUSTIFICATION-VAR" ), makeSymbol( "PROOF" ) ), makeSymbol( "&BODY" ), makeSymbol( "BODY" ) );
    $sym510$INFERENCE = makeUninternedSymbol( "INFERENCE" );
    $sym511$ANSWER = makeUninternedSymbol( "ANSWER" );
    $sym512$PROOF_VAR = makeUninternedSymbol( "PROOF-VAR" );
    $sym513$DO_PROBLEM_SUPPORTED_INFERENCES = makeSymbol( "DO-PROBLEM-SUPPORTED-INFERENCES" );
    $sym514$PROOF_SUPPORTED_PROBLEM = makeSymbol( "PROOF-SUPPORTED-PROBLEM" );
    $sym515$MEMBER_ = makeSymbol( "MEMBER?" );
    $list516 = ConsesLow.list( ConsesLow.list( makeSymbol( "FUNCTION" ), EQL ) );
    $list517 = ConsesLow.list( ConsesLow.list( makeSymbol( "SUBPROOF-VAR" ), makeSymbol( "INFERENCE" ) ), makeSymbol( "&BODY" ), makeSymbol( "BODY" ) );
    $sym518$ANSWER = makeUninternedSymbol( "ANSWER" );
    $sym519$JUSTIFICATION = makeUninternedSymbol( "JUSTIFICATION" );
    $sym520$PROOF = makeUninternedSymbol( "PROOF" );
    $sym521$DO_INFERENCE_ANSWER_JUSTIFICATION_PROOFS = makeSymbol( "DO-INFERENCE-ANSWER-JUSTIFICATION-PROOFS" );
    $sym522$DO_PROOF_ALL_SUBPROOFS = makeSymbol( "DO-PROOF-ALL-SUBPROOFS" );
    $sym523$RULE_ASSERTION_ = makeSymbol( "RULE-ASSERTION?" );
    $sym524$PROOF_P = makeSymbol( "PROOF-P" );
    $kw525$TV = makeKeyword( "TV" );
    $kw526$TRUE = makeKeyword( "TRUE" );
    $kw527$FALSE = makeKeyword( "FALSE" );
    $sym528$INFERENCE_METRICS = makeSymbol( "INFERENCE-METRICS" );
    $sym529$INFERENCE_QUERY_METRIC_P = makeSymbol( "INFERENCE-QUERY-METRIC-P" );
    $sym530$TERM__ = makeSymbol( "TERM-<" );
    $sym531$CAR = makeSymbol( "CAR" );
    $kw532$NEW_ROOT_TIMES = makeKeyword( "NEW-ROOT-TIMES" );
    $kw533$NEW_ROOT_COUNT = makeKeyword( "NEW-ROOT-COUNT" );
    $kw534$PROBLEM_CREATION_TIMES = makeKeyword( "PROBLEM-CREATION-TIMES" );
    $kw535$INFERENCE_ANSWER_QUERY_PROPERTIES = makeKeyword( "INFERENCE-ANSWER-QUERY-PROPERTIES" );
    $kw536$INFERENCE_STRONGEST_QUERY_PROPERTIES = makeKeyword( "INFERENCE-STRONGEST-QUERY-PROPERTIES" );
    $kw537$INFERENCE_MOST_EFFICIENT_QUERY_PROPERTIES = makeKeyword( "INFERENCE-MOST-EFFICIENT-QUERY-PROPERTIES" );
    $kw538$INFERENCE_IDS = makeKeyword( "INFERENCE-IDS" );
    $str539$time_to_implement_metric__S = makeString( "time to implement metric ~S" );
    $sym540$PROOF_SUID = makeSymbol( "PROOF-SUID" );
    $sym541$_ = makeSymbol( ">" );
    $sym542$CDR = makeSymbol( "CDR" );
    $list543 = ConsesLow.list( ConsesLow.list( makeSymbol( "TABLE-VAR" ), makeSymbol( "INFERENCE" ) ), makeSymbol( "&BODY" ), makeSymbol( "BODY" ) );
    $sym544$INFERENCE_VAR = makeUninternedSymbol( "INFERENCE-VAR" );
    $sym545$WITH_INFERENCE_PROBLEM_WORKING_TIME_LOCK = makeSymbol( "WITH-INFERENCE-PROBLEM-WORKING-TIME-LOCK" );
    $sym546$INFERENCE_PROBLEM_WORKING_TIME_TABLE = makeSymbol( "INFERENCE-PROBLEM-WORKING-TIME-TABLE" );
    $str547$Inference_problem_working_time_lo = makeString( "Inference problem working time lock" );
    $kw548$NEW_ANSWER = makeKeyword( "NEW-ANSWER" );
    $kw549$STATUS_CHANGE = makeKeyword( "STATUS-CHANGE" );
    $kw550$NEW_TRANSFORMATION_DEPTH_REACHED = makeKeyword( "NEW-TRANSFORMATION-DEPTH-REACHED" );
    $sym551$INFERENCES_VAR = makeUninternedSymbol( "INFERENCES-VAR" );
    $sym552$INFERENCE_VAR = makeUninternedSymbol( "INFERENCE-VAR" );
    $sym553$TACTIC_VAR = makeUninternedSymbol( "TACTIC-VAR" );
    $sym554$START_TIME = makeUninternedSymbol( "START-TIME" );
    $list555 = ConsesLow.list( ConsesLow.list( makeSymbol( "CURRENT-CONTROLLING-INFERENCES" ) ) );
    $list556 = ConsesLow.list( ConsesLow.list( makeSymbol( "CURRENT-CONTROLLING-INFERENCE" ) ) );
    $list557 = ConsesLow.list( ConsesLow.list( makeSymbol( "CURRENTLY-EXECUTING-TACTIC" ) ) );
    $sym558$CUNWIND_PROTECT = makeSymbol( "CUNWIND-PROTECT" );
    $sym559$PROGN = makeSymbol( "PROGN" );
    $sym560$POSSIBLY_SIGNAL_SKSI_QUERY_START = makeSymbol( "POSSIBLY-SIGNAL-SKSI-QUERY-START" );
    $sym561$INFERENCE_TIME_SO_FAR = makeSymbol( "INFERENCE-TIME-SO-FAR" );
    $list562 = ConsesLow.list( NIL );
    $sym563$POSSIBLY_ADD_INFERENCE_SKSI_QUERY_START_TIME = makeSymbol( "POSSIBLY-ADD-INFERENCE-SKSI-QUERY-START-TIME" );
    $sym564$POSSIBLY_SIGNAL_SKSI_QUERY_END = makeSymbol( "POSSIBLY-SIGNAL-SKSI-QUERY-END" );
    $sym565$POSSIBLY_INCREMENT_INFERENCE_SKSI_QUERY_TOTAL_TIME = makeSymbol( "POSSIBLY-INCREMENT-INFERENCE-SKSI-QUERY-TOTAL-TIME" );
    $sym566$_ = makeSymbol( "-" );
    $sym567$INFERENCE_WITHIN_SKSI_QUERY_EXECUTION = makeSymbol( "INFERENCE-WITHIN-SKSI-QUERY-EXECUTION" );
    $kw568$START_TIME = makeKeyword( "START-TIME" );
    $kw569$START = makeKeyword( "START" );
    $kw570$END_TIME = makeKeyword( "END-TIME" );
    $kw571$SKSI_QUERY_TOTAL_TIME = makeKeyword( "SKSI-QUERY-TOTAL-TIME" );
    $kw572$SKSI_QUERY_START_TIMES = makeKeyword( "SKSI-QUERY-START-TIMES" );
    $kw573$SKSI_QUERY = makeKeyword( "SKSI-QUERY" );
    $list574 = ConsesLow.list( ConsesLow.list( makeSymbol( "&KEY" ), makeSymbol( "SPARQL" ), makeSymbol( "RESULT-SET" ) ), makeSymbol( "&BODY" ), makeSymbol( "BODY" ) );
    $list575 = ConsesLow.list( makeKeyword( "SPARQL" ), makeKeyword( "RESULT-SET" ) );
    $kw576$SPARQL = makeKeyword( "SPARQL" );
    $kw577$RESULT_SET = makeKeyword( "RESULT-SET" );
    $sym578$INFERENCES = makeUninternedSymbol( "INFERENCES" );
    $sym579$INFERENCE = makeUninternedSymbol( "INFERENCE" );
    $sym580$START = makeUninternedSymbol( "START" );
    $sym581$END = makeUninternedSymbol( "END" );
    $sym582$COUNT = makeUninternedSymbol( "COUNT" );
    $sym583$LAST_ONE = makeSymbol( "LAST-ONE" );
    $sym584$FWHEN = makeSymbol( "FWHEN" );
    $sym585$INFERENCE_CUMULATIVE_TIME_SO_FAR = makeSymbol( "INFERENCE-CUMULATIVE-TIME-SO-FAR" );
    $sym586$LENGTH = makeSymbol( "LENGTH" );
    $sym587$POSSIBLY_ADD_INFERENCE_SPARQL_QUERY_PROFILE = makeSymbol( "POSSIBLY-ADD-INFERENCE-SPARQL-QUERY-PROFILE" );
    $sym588$INFERENCE_WITHIN_SPARQL_QUERY_EXECUTION = makeSymbol( "INFERENCE-WITHIN-SPARQL-QUERY-EXECUTION" );
    $kw589$SPARQL_QUERY_PROFILE = makeKeyword( "SPARQL-QUERY-PROFILE" );
    $kw590$SKSI_QUERY_TOTAL_TIME_ACC = makeKeyword( "SKSI-QUERY-TOTAL-TIME-ACC" );
    $kw591$SKSI_QUERY_START_TIMES_ACC = makeKeyword( "SKSI-QUERY-START-TIMES-ACC" );
    $kw592$SPARQL_QUERY_PROFILE_ACC = makeKeyword( "SPARQL-QUERY-PROFILE-ACC" );
  }

  public static final class $inference_native
      extends
        SubLStructNative
  {
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
    private static final SubLStructDeclNative structDecl;

    public $inference_native()
    {
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
    public SubLStructDecl getStructDecl()
    {
      return $inference_native.structDecl;
    }

    @Override
    public SubLObject getField2()
    {
      return this.$suid;
    }

    @Override
    public SubLObject getField3()
    {
      return this.$problem_store;
    }

    @Override
    public SubLObject getField4()
    {
      return this.$forward_propagate;
    }

    @Override
    public SubLObject getField5()
    {
      return this.$input_mt;
    }

    @Override
    public SubLObject getField6()
    {
      return this.$input_el_query;
    }

    @Override
    public SubLObject getField7()
    {
      return this.$input_non_explanatory_el_query;
    }

    @Override
    public SubLObject getField8()
    {
      return this.$input_query_properties;
    }

    @Override
    public SubLObject getField9()
    {
      return this.$mt;
    }

    @Override
    public SubLObject getField10()
    {
      return this.$el_query;
    }

    @Override
    public SubLObject getField11()
    {
      return this.$el_bindings;
    }

    @Override
    public SubLObject getField12()
    {
      return this.$hl_query;
    }

    @Override
    public SubLObject getField13()
    {
      return this.$explanatory_subquery;
    }

    @Override
    public SubLObject getField14()
    {
      return this.$non_explanatory_subquery;
    }

    @Override
    public SubLObject getField15()
    {
      return this.$free_hl_vars;
    }

    @Override
    public SubLObject getField16()
    {
      return this.$hypothetical_bindings;
    }

    @Override
    public SubLObject getField17()
    {
      return this.$answer_id_index;
    }

    @Override
    public SubLObject getField18()
    {
      return this.$answer_bindings_index;
    }

    @Override
    public SubLObject getField19()
    {
      return this.$new_answer_id_start;
    }

    @Override
    public SubLObject getField20()
    {
      return this.$new_answer_justifications;
    }

    public SubLObject getField21()
    {
      return this.$status;
    }

    public SubLObject getField22()
    {
      return this.$suspend_status;
    }

    public SubLObject getField23()
    {
      return this.$root_link;
    }

    public SubLObject getField24()
    {
      return this.$relevant_problems;
    }

    public SubLObject getField25()
    {
      return this.$strategy_set;
    }

    public SubLObject getField26()
    {
      return this.$control_process;
    }

    public SubLObject getField27()
    {
      return this.$interrupting_processes;
    }

    public SubLObject getField28()
    {
      return this.$max_transformation_depth_reached;
    }

    public SubLObject getField29()
    {
      return this.$disjunction_free_el_vars_policy;
    }

    public SubLObject getField30()
    {
      return this.$result_uniqueness_criterion;
    }

    public SubLObject getField31()
    {
      return this.$allow_hl_predicate_transformationP;
    }

    public SubLObject getField32()
    {
      return this.$allow_unbound_predicate_transformationP;
    }

    public SubLObject getField33()
    {
      return this.$allow_evaluatable_predicate_transformationP;
    }

    public SubLObject getField34()
    {
      return this.$allow_indeterminate_resultsP;
    }

    public SubLObject getField35()
    {
      return this.$allowed_rules;
    }

    public SubLObject getField36()
    {
      return this.$forbidden_rules;
    }

    public SubLObject getField37()
    {
      return this.$allowed_modules;
    }

    public SubLObject getField38()
    {
      return this.$allow_abnormality_checkingP;
    }

    public SubLObject getField39()
    {
      return this.$transitive_closure_mode;
    }

    public SubLObject getField40()
    {
      return this.$problem_store_privateP;
    }

    public SubLObject getField41()
    {
      return this.$continuableP;
    }

    public SubLObject getField42()
    {
      return this.$browsableP;
    }

    public SubLObject getField43()
    {
      return this.$return_type;
    }

    public SubLObject getField44()
    {
      return this.$answer_language;
    }

    public SubLObject getField45()
    {
      return this.$cache_resultsP;
    }

    public SubLObject getField46()
    {
      return this.$blockingP;
    }

    public SubLObject getField47()
    {
      return this.$max_number;
    }

    public SubLObject getField48()
    {
      return this.$max_time;
    }

    public SubLObject getField49()
    {
      return this.$max_step;
    }

    public SubLObject getField50()
    {
      return this.$mode;
    }

    public SubLObject getField51()
    {
      return this.$forward_max_time;
    }

    public SubLObject getField52()
    {
      return this.$max_proof_depth;
    }

    public SubLObject getField53()
    {
      return this.$max_transformation_depth;
    }

    public SubLObject getField54()
    {
      return this.$min_rule_utility;
    }

    public SubLObject getField55()
    {
      return this.$probably_approximately_done;
    }

    public SubLObject getField56()
    {
      return this.$metrics_template;
    }

    public SubLObject getField57()
    {
      return this.$start_universal_time;
    }

    public SubLObject getField58()
    {
      return this.$start_internal_real_time;
    }

    public SubLObject getField59()
    {
      return this.$end_internal_real_time;
    }

    public SubLObject getField60()
    {
      return this.$pad_internal_real_time;
    }

    public SubLObject getField61()
    {
      return this.$hypothesization_time;
    }

    public SubLObject getField62()
    {
      return this.$cumulative_time;
    }

    public SubLObject getField63()
    {
      return this.$step_count;
    }

    public SubLObject getField64()
    {
      return this.$cumulative_step_count;
    }

    public SubLObject getField65()
    {
      return this.$events;
    }

    public SubLObject getField66()
    {
      return this.$halt_conditions;
    }

    public SubLObject getField67()
    {
      return this.$accumulators;
    }

    public SubLObject getField68()
    {
      return this.$proof_watermark;
    }

    public SubLObject getField69()
    {
      return this.$problem_working_time_data;
    }

    public SubLObject getField70()
    {
      return this.$type;
    }

    public SubLObject getField71()
    {
      return this.$data;
    }

    public SubLObject getField72()
    {
      return this.$properties;
    }

    @Override
    public SubLObject setField2(final SubLObject value)
    {
      return this.$suid = value;
    }

    @Override
    public SubLObject setField3(final SubLObject value)
    {
      return this.$problem_store = value;
    }

    @Override
    public SubLObject setField4(final SubLObject value)
    {
      return this.$forward_propagate = value;
    }

    @Override
    public SubLObject setField5(final SubLObject value)
    {
      return this.$input_mt = value;
    }

    @Override
    public SubLObject setField6(final SubLObject value)
    {
      return this.$input_el_query = value;
    }

    @Override
    public SubLObject setField7(final SubLObject value)
    {
      return this.$input_non_explanatory_el_query = value;
    }

    @Override
    public SubLObject setField8(final SubLObject value)
    {
      return this.$input_query_properties = value;
    }

    @Override
    public SubLObject setField9(final SubLObject value)
    {
      return this.$mt = value;
    }

    @Override
    public SubLObject setField10(final SubLObject value)
    {
      return this.$el_query = value;
    }

    @Override
    public SubLObject setField11(final SubLObject value)
    {
      return this.$el_bindings = value;
    }

    @Override
    public SubLObject setField12(final SubLObject value)
    {
      return this.$hl_query = value;
    }

    @Override
    public SubLObject setField13(final SubLObject value)
    {
      return this.$explanatory_subquery = value;
    }

    @Override
    public SubLObject setField14(final SubLObject value)
    {
      return this.$non_explanatory_subquery = value;
    }

    @Override
    public SubLObject setField15(final SubLObject value)
    {
      return this.$free_hl_vars = value;
    }

    @Override
    public SubLObject setField16(final SubLObject value)
    {
      return this.$hypothetical_bindings = value;
    }

    @Override
    public SubLObject setField17(final SubLObject value)
    {
      return this.$answer_id_index = value;
    }

    @Override
    public SubLObject setField18(final SubLObject value)
    {
      return this.$answer_bindings_index = value;
    }

    @Override
    public SubLObject setField19(final SubLObject value)
    {
      return this.$new_answer_id_start = value;
    }

    @Override
    public SubLObject setField20(final SubLObject value)
    {
      return this.$new_answer_justifications = value;
    }

    public SubLObject setField21(final SubLObject value)
    {
      return this.$status = value;
    }

    public SubLObject setField22(final SubLObject value)
    {
      return this.$suspend_status = value;
    }

    public SubLObject setField23(final SubLObject value)
    {
      return this.$root_link = value;
    }

    public SubLObject setField24(final SubLObject value)
    {
      return this.$relevant_problems = value;
    }

    public SubLObject setField25(final SubLObject value)
    {
      return this.$strategy_set = value;
    }

    public SubLObject setField26(final SubLObject value)
    {
      return this.$control_process = value;
    }

    public SubLObject setField27(final SubLObject value)
    {
      return this.$interrupting_processes = value;
    }

    public SubLObject setField28(final SubLObject value)
    {
      return this.$max_transformation_depth_reached = value;
    }

    public SubLObject setField29(final SubLObject value)
    {
      return this.$disjunction_free_el_vars_policy = value;
    }

    public SubLObject setField30(final SubLObject value)
    {
      return this.$result_uniqueness_criterion = value;
    }

    public SubLObject setField31(final SubLObject value)
    {
      return this.$allow_hl_predicate_transformationP = value;
    }

    public SubLObject setField32(final SubLObject value)
    {
      return this.$allow_unbound_predicate_transformationP = value;
    }

    public SubLObject setField33(final SubLObject value)
    {
      return this.$allow_evaluatable_predicate_transformationP = value;
    }

    public SubLObject setField34(final SubLObject value)
    {
      return this.$allow_indeterminate_resultsP = value;
    }

    public SubLObject setField35(final SubLObject value)
    {
      return this.$allowed_rules = value;
    }

    public SubLObject setField36(final SubLObject value)
    {
      return this.$forbidden_rules = value;
    }

    public SubLObject setField37(final SubLObject value)
    {
      return this.$allowed_modules = value;
    }

    public SubLObject setField38(final SubLObject value)
    {
      return this.$allow_abnormality_checkingP = value;
    }

    public SubLObject setField39(final SubLObject value)
    {
      return this.$transitive_closure_mode = value;
    }

    public SubLObject setField40(final SubLObject value)
    {
      return this.$problem_store_privateP = value;
    }

    public SubLObject setField41(final SubLObject value)
    {
      return this.$continuableP = value;
    }

    public SubLObject setField42(final SubLObject value)
    {
      return this.$browsableP = value;
    }

    public SubLObject setField43(final SubLObject value)
    {
      return this.$return_type = value;
    }

    public SubLObject setField44(final SubLObject value)
    {
      return this.$answer_language = value;
    }

    public SubLObject setField45(final SubLObject value)
    {
      return this.$cache_resultsP = value;
    }

    public SubLObject setField46(final SubLObject value)
    {
      return this.$blockingP = value;
    }

    public SubLObject setField47(final SubLObject value)
    {
      return this.$max_number = value;
    }

    public SubLObject setField48(final SubLObject value)
    {
      return this.$max_time = value;
    }

    public SubLObject setField49(final SubLObject value)
    {
      return this.$max_step = value;
    }

    public SubLObject setField50(final SubLObject value)
    {
      return this.$mode = value;
    }

    public SubLObject setField51(final SubLObject value)
    {
      return this.$forward_max_time = value;
    }

    public SubLObject setField52(final SubLObject value)
    {
      return this.$max_proof_depth = value;
    }

    public SubLObject setField53(final SubLObject value)
    {
      return this.$max_transformation_depth = value;
    }

    public SubLObject setField54(final SubLObject value)
    {
      return this.$min_rule_utility = value;
    }

    public SubLObject setField55(final SubLObject value)
    {
      return this.$probably_approximately_done = value;
    }

    public SubLObject setField56(final SubLObject value)
    {
      return this.$metrics_template = value;
    }

    public SubLObject setField57(final SubLObject value)
    {
      return this.$start_universal_time = value;
    }

    public SubLObject setField58(final SubLObject value)
    {
      return this.$start_internal_real_time = value;
    }

    public SubLObject setField59(final SubLObject value)
    {
      return this.$end_internal_real_time = value;
    }

    public SubLObject setField60(final SubLObject value)
    {
      return this.$pad_internal_real_time = value;
    }

    public SubLObject setField61(final SubLObject value)
    {
      return this.$hypothesization_time = value;
    }

    public SubLObject setField62(final SubLObject value)
    {
      return this.$cumulative_time = value;
    }

    public SubLObject setField63(final SubLObject value)
    {
      return this.$step_count = value;
    }

    public SubLObject setField64(final SubLObject value)
    {
      return this.$cumulative_step_count = value;
    }

    public SubLObject setField65(final SubLObject value)
    {
      return this.$events = value;
    }

    public SubLObject setField66(final SubLObject value)
    {
      return this.$halt_conditions = value;
    }

    public SubLObject setField67(final SubLObject value)
    {
      return this.$accumulators = value;
    }

    public SubLObject setField68(final SubLObject value)
    {
      return this.$proof_watermark = value;
    }

    public SubLObject setField69(final SubLObject value)
    {
      return this.$problem_working_time_data = value;
    }

    public SubLObject setField70(final SubLObject value)
    {
      return this.$type = value;
    }

    public SubLObject setField71(final SubLObject value)
    {
      return this.$data = value;
    }

    public SubLObject setField72(final SubLObject value)
    {
      return this.$properties = value;
    }
    static
    {
      structDecl = Structures.makeStructDeclNative( $inference_native.class, $sym1$INFERENCE, $sym2$INFERENCE_P, $list3, $list4, new String[] { "$suid", "$problem_store", "$forward_propagate", "$input_mt",
        "$input_el_query", "$input_non_explanatory_el_query", "$input_query_properties", "$mt", "$el_query", "$el_bindings", "$hl_query", "$explanatory_subquery", "$non_explanatory_subquery", "$free_hl_vars",
        "$hypothetical_bindings", "$answer_id_index", "$answer_bindings_index", "$new_answer_id_start", "$new_answer_justifications", "$status", "$suspend_status", "$root_link", "$relevant_problems", "$strategy_set",
        "$control_process", "$interrupting_processes", "$max_transformation_depth_reached", "$disjunction_free_el_vars_policy", "$result_uniqueness_criterion", "$allow_hl_predicate_transformationP",
        "$allow_unbound_predicate_transformationP", "$allow_evaluatable_predicate_transformationP", "$allow_indeterminate_resultsP", "$allowed_rules", "$forbidden_rules", "$allowed_modules",
        "$allow_abnormality_checkingP", "$transitive_closure_mode", "$problem_store_privateP", "$continuableP", "$browsableP", "$return_type", "$answer_language", "$cache_resultsP", "$blockingP", "$max_number",
        "$max_time", "$max_step", "$mode", "$forward_max_time", "$max_proof_depth", "$max_transformation_depth", "$min_rule_utility", "$probably_approximately_done", "$metrics_template", "$start_universal_time",
        "$start_internal_real_time", "$end_internal_real_time", "$pad_internal_real_time", "$hypothesization_time", "$cumulative_time", "$step_count", "$cumulative_step_count", "$events", "$halt_conditions",
        "$accumulators", "$proof_watermark", "$problem_working_time_data", "$type", "$data", "$properties"
      }, $list5, $list6, $sym7$PRINT_INFERENCE );
    }
  }

  public static final class $inference_p$UnaryFunction
      extends
        UnaryFunction
  {
    public $inference_p$UnaryFunction()
    {
      super( SubLTranslatedFile.extractFunctionNamed( "INFERENCE-P" ) );
    }

    @Override
    public SubLObject processItem(final SubLObject arg1)
    {
      return inference_p( arg1 );
    }
  }

  public static final class $sxhash_inference_method$UnaryFunction
      extends
        UnaryFunction
  {
    public $sxhash_inference_method$UnaryFunction()
    {
      super( SubLTranslatedFile.extractFunctionNamed( "SXHASH-INFERENCE-METHOD" ) );
    }

    @Override
    public SubLObject processItem(final SubLObject arg1)
    {
      return sxhash_inference_method( arg1 );
    }
  }

  public static final class $inference_answer_native
      extends
        SubLStructNative
  {
    public SubLObject $suid;
    public SubLObject $inference;
    public SubLObject $bindings;
    public SubLObject $justifications;
    public SubLObject $elapsed_creation_time;
    public SubLObject $step_count;
    private static final SubLStructDeclNative structDecl;

    public $inference_answer_native()
    {
      this.$suid = CommonSymbols.NIL;
      this.$inference = CommonSymbols.NIL;
      this.$bindings = CommonSymbols.NIL;
      this.$justifications = CommonSymbols.NIL;
      this.$elapsed_creation_time = CommonSymbols.NIL;
      this.$step_count = CommonSymbols.NIL;
    }

    @Override
    public SubLStructDecl getStructDecl()
    {
      return $inference_answer_native.structDecl;
    }

    @Override
    public SubLObject getField2()
    {
      return this.$suid;
    }

    @Override
    public SubLObject getField3()
    {
      return this.$inference;
    }

    @Override
    public SubLObject getField4()
    {
      return this.$bindings;
    }

    @Override
    public SubLObject getField5()
    {
      return this.$justifications;
    }

    @Override
    public SubLObject getField6()
    {
      return this.$elapsed_creation_time;
    }

    @Override
    public SubLObject getField7()
    {
      return this.$step_count;
    }

    @Override
    public SubLObject setField2(final SubLObject value)
    {
      return this.$suid = value;
    }

    @Override
    public SubLObject setField3(final SubLObject value)
    {
      return this.$inference = value;
    }

    @Override
    public SubLObject setField4(final SubLObject value)
    {
      return this.$bindings = value;
    }

    @Override
    public SubLObject setField5(final SubLObject value)
    {
      return this.$justifications = value;
    }

    @Override
    public SubLObject setField6(final SubLObject value)
    {
      return this.$elapsed_creation_time = value;
    }

    @Override
    public SubLObject setField7(final SubLObject value)
    {
      return this.$step_count = value;
    }
    static
    {
      structDecl = Structures.makeStructDeclNative( $inference_answer_native.class, $sym441$INFERENCE_ANSWER, $sym433$INFERENCE_ANSWER_P, $list442, $list443, new String[] { "$suid", "$inference", "$bindings",
        "$justifications", "$elapsed_creation_time", "$step_count"
      }, $list444, $list445, $sym446$PRINT_INFERENCE_ANSWER );
    }
  }

  public static final class $inference_answer_p$UnaryFunction
      extends
        UnaryFunction
  {
    public $inference_answer_p$UnaryFunction()
    {
      super( SubLTranslatedFile.extractFunctionNamed( "INFERENCE-ANSWER-P" ) );
    }

    @Override
    public SubLObject processItem(final SubLObject arg1)
    {
      return inference_answer_p( arg1 );
    }
  }

  public static final class $inference_answer_justification_native
      extends
        SubLStructNative
  {
    public SubLObject $answer;
    public SubLObject $supports;
    public SubLObject $pragma_supports;
    public SubLObject $proofs;
    private static final SubLStructDeclNative structDecl;

    public $inference_answer_justification_native()
    {
      this.$answer = CommonSymbols.NIL;
      this.$supports = CommonSymbols.NIL;
      this.$pragma_supports = CommonSymbols.NIL;
      this.$proofs = CommonSymbols.NIL;
    }

    @Override
    public SubLStructDecl getStructDecl()
    {
      return $inference_answer_justification_native.structDecl;
    }

    @Override
    public SubLObject getField2()
    {
      return this.$answer;
    }

    @Override
    public SubLObject getField3()
    {
      return this.$supports;
    }

    @Override
    public SubLObject getField4()
    {
      return this.$pragma_supports;
    }

    @Override
    public SubLObject getField5()
    {
      return this.$proofs;
    }

    @Override
    public SubLObject setField2(final SubLObject value)
    {
      return this.$answer = value;
    }

    @Override
    public SubLObject setField3(final SubLObject value)
    {
      return this.$supports = value;
    }

    @Override
    public SubLObject setField4(final SubLObject value)
    {
      return this.$pragma_supports = value;
    }

    @Override
    public SubLObject setField5(final SubLObject value)
    {
      return this.$proofs = value;
    }
    static
    {
      structDecl = Structures.makeStructDeclNative( $inference_answer_justification_native.class, $sym481$INFERENCE_ANSWER_JUSTIFICATION, $sym434$INFERENCE_ANSWER_JUSTIFICATION_P, $list482, $list483, new String[] {
        "$answer", "$supports", "$pragma_supports", "$proofs"
      }, $list484, $list485, $sym486$PRINT_INFERENCE_ANSWER_JUSTIFICATION );
    }
  }

  public static final class $inference_answer_justification_p$UnaryFunction
      extends
        UnaryFunction
  {
    public $inference_answer_justification_p$UnaryFunction()
    {
      super( SubLTranslatedFile.extractFunctionNamed( "INFERENCE-ANSWER-JUSTIFICATION-P" ) );
    }

    @Override
    public SubLObject processItem(final SubLObject arg1)
    {
      return inference_answer_justification_p( arg1 );
    }
  }

  public static final class $inference_answer_justification_supports$UnaryFunction
      extends
        UnaryFunction
  {
    public $inference_answer_justification_supports$UnaryFunction()
    {
      super( SubLTranslatedFile.extractFunctionNamed( "INFERENCE-ANSWER-JUSTIFICATION-SUPPORTS" ) );
    }

    @Override
    public SubLObject processItem(final SubLObject arg1)
    {
      return inference_answer_justification_supports( arg1 );
    }
  }
}
/*
 * 
 * Total time: 3488 ms synthetic
 */