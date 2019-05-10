package com.cyc.cycjava.cycl;

import com.cyc.tool.subl.util.SubLFiles;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Sort;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Mapping;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Locks;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Hashtables;
import com.cyc.cycjava.cycl.sbhl.sbhl_search_methods;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Time;
import com.cyc.cycjava.cycl.inference.harness.inference_datastructures_enumerated_types;
import com.cyc.cycjava.cycl.inference.harness.inference_datastructures_inference;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Equality;
import com.cyc.cycjava.cycl.inference.harness.inference_kernel;
import com.cyc.cycjava.cycl.inference.ask_utilities;
import com.cyc.cycjava.cycl.inference.harness.inference_datastructures_problem_store;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.reader;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Functions;
import com.cyc.cycjava.cycl.sbhl.sbhl_links;
import com.cyc.cycjava.cycl.sbhl.sbhl_graphs;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.*;
import com.cyc.cycjava.cycl.sbhl.sbhl_macros;
import com.cyc.cycjava.cycl.sbhl.sbhl_search_utilities;
import com.cyc.cycjava.cycl.sbhl.sbhl_marking_utilities;
import com.cyc.cycjava.cycl.sbhl.sbhl_link_vars;
import com.cyc.cycjava.cycl.sbhl.sbhl_module_utilities;
import com.cyc.cycjava.cycl.sbhl.sbhl_module_vars;
import com.cyc.cycjava.cycl.sbhl.sbhl_paranoia;
import com.cyc.cycjava.cycl.sbhl.sbhl_search_vars;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.cdestructuring_bind;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Numbers;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.SubLThread;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Threads;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Sequences;
import com.cyc.cycjava.cycl.sbhl.sbhl_marking_vars;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLProcess;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.conses_high;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Symbols;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Types;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Values;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Errors;
import com.cyc.tool.subl.jrtl.nativeCode.type.number.SubLInteger;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObject;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLString;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLList;
import com.cyc.tool.subl.jrtl.nativeCode.type.symbol.SubLSymbol;
import com.cyc.tool.subl.util.SubLFile;
import com.cyc.tool.subl.util.SubLTranslatedFile;

public final class rkf_salient_descriptor
    extends
      SubLTranslatedFile
{
  public static final SubLFile me;
  public static final String myName = "com.cyc.cycjava.cycl.rkf_salient_descriptor";
  public static final String myFingerPrint = "6c46decf777ef4ef4540a497d8fed6dd252583cf40af31a6f3627464ce1ddd38";
  @SubLTranslatedFile.SubL(source = "cycl/rkf-salient-descriptor.lisp", position = 809L)
  private static SubLSymbol $rkf_salient_formula_types$;
  @SubLTranslatedFile.SubL(source = "cycl/rkf-salient-descriptor.lisp", position = 6023L)
  public static SubLSymbol $rkf_salient_descriptor_number_cutoff$;
  @SubLTranslatedFile.SubL(source = "cycl/rkf-salient-descriptor.lisp", position = 6259L)
  public static SubLSymbol $rkf_salient_descriptor_time_cutoff$;
  @SubLTranslatedFile.SubL(source = "cycl/rkf-salient-descriptor.lisp", position = 6445L)
  public static SubLSymbol $rkf_salient_descriptor_transformation_cutoff$;
  @SubLTranslatedFile.SubL(source = "cycl/rkf-salient-descriptor.lisp", position = 6804L)
  public static SubLSymbol $rkf_sd_exclude_known_promptsP$;
  @SubLTranslatedFile.SubL(source = "cycl/rkf-salient-descriptor.lisp", position = 12413L)
  public static SubLSymbol $rkf_sd_problem_store$;
  @SubLTranslatedFile.SubL(source = "cycl/rkf-salient-descriptor.lisp", position = 12463L)
  public static SubLSymbol $rkf_sd_problem_store_checkpoints$;
  @SubLTranslatedFile.SubL(source = "cycl/rkf-salient-descriptor.lisp", position = 13517L)
  public static SubLSymbol $rkf_sd_reuse_problem_storeP$;
  @SubLTranslatedFile.SubL(source = "cycl/rkf-salient-descriptor.lisp", position = 25380L)
  public static SubLSymbol $rkf_sd_induced_superiors_cutoff$;
  @SubLTranslatedFile.SubL(source = "cycl/rkf-salient-descriptor.lisp", position = 47743L)
  private static SubLSymbol $rkf_sd_known_time_cutoff$;
  @SubLTranslatedFile.SubL(source = "cycl/rkf-salient-descriptor.lisp", position = 47950L)
  private static SubLSymbol $rkf_sd_known_max_depth_max$;
  @SubLTranslatedFile.SubL(source = "cycl/rkf-salient-descriptor.lisp", position = 48517L)
  private static SubLSymbol $rkf_sd_known_destroy_inferencesP$;
  @SubLTranslatedFile.SubL(source = "cycl/rkf-salient-descriptor.lisp", position = 60376L)
  public static SubLSymbol $rkf_sd_formulas_max_depth_max$;
  @SubLTranslatedFile.SubL(source = "cycl/rkf-salient-descriptor.lisp", position = 60436L)
  private static SubLSymbol $cache_salient_descriptor_ask_resultsP$;
  @SubLTranslatedFile.SubL(source = "cycl/rkf-salient-descriptor.lisp", position = 69941L)
  private static SubLSymbol $rkf_deprecated_rules$;
  @SubLTranslatedFile.SubL(source = "cycl/rkf-salient-descriptor.lisp", position = 71653L)
  private static SubLSymbol $rkf_sd_rule_neg_lit_max$;
  @SubLTranslatedFile.SubL(source = "cycl/rkf-salient-descriptor.lisp", position = 71705L)
  private static SubLSymbol $rkf_sd_rule_pos_lit_max$;
  @SubLTranslatedFile.SubL(source = "cycl/rkf-salient-descriptor.lisp", position = 71756L)
  private static SubLSymbol $rkf_sd_rule_neg_lit_min$;
  @SubLTranslatedFile.SubL(source = "cycl/rkf-salient-descriptor.lisp", position = 71807L)
  private static SubLSymbol $rkf_sd_rule_pos_lit_min$;
  @SubLTranslatedFile.SubL(source = "cycl/rkf-salient-descriptor.lisp", position = 76930L)
  private static SubLSymbol $rkf_salient_descriptor_cache$;
  @SubLTranslatedFile.SubL(source = "cycl/rkf-salient-descriptor.lisp", position = 77101L)
  private static SubLSymbol $rkf_salient_descriptor_cache_lock$;
  @SubLTranslatedFile.SubL(source = "cycl/rkf-salient-descriptor.lisp", position = 77806L)
  private static SubLSymbol $rkf_salient_descriptor_ignore_cache$;
  @SubLTranslatedFile.SubL(source = "cycl/rkf-salient-descriptor.lisp", position = 77955L)
  private static SubLSymbol $rkf_salient_descriptor_ignore_cache_lock$;
  @SubLTranslatedFile.SubL(source = "cycl/rkf-salient-descriptor.lisp", position = 78730L)
  private static SubLSymbol $rkf_choice_count_cutoff$;
  @SubLTranslatedFile.SubL(source = "cycl/rkf-salient-descriptor.lisp", position = 79145L)
  public static SubLSymbol $rkf_examples_to_show$;
  @SubLTranslatedFile.SubL(source = "cycl/rkf-salient-descriptor.lisp", position = 94861L)
  public static SubLSymbol $rkf_example_instances_backchain_level$;
  @SubLTranslatedFile.SubL(source = "cycl/rkf-salient-descriptor.lisp", position = 95038L)
  public static SubLSymbol $rkf_example_instances_time_cutoff$;
  @SubLTranslatedFile.SubL(source = "cycl/rkf-salient-descriptor.lisp", position = 95220L)
  public static SubLSymbol $rkf_example_instances_wff_checkP$;
  @SubLTranslatedFile.SubL(source = "cycl/rkf-salient-descriptor.lisp", position = 100580L)
  public static SubLSymbol $rkf_example_not_known_false_time_cutoff$;
  private static final SubLList $list0;
  private static final SubLSymbol $sym1$RKF_SALIENT_DESCRIPTOR_FORMULA_TYPE_P;
  private static final SubLSymbol $kw2$REQUIREMENT;
  private static final SubLSymbol $kw3$STRONG;
  private static final SubLSymbol $kw4$WEAK;
  private static final SubLSymbol $kw5$NEIGHBOR;
  private static final SubLString $str6$_S_is_not_a_valid_salience_type;
  private static final SubLSymbol $sym7$FORT_P;
  private static final SubLSymbol $sym8$HLMT_P;
  private static final SubLSymbol $sym9$LISTP;
  private static final SubLObject $const10$keRequirement;
  private static final SubLObject $const11$keStrongSuggestion;
  private static final SubLObject $const12$keWeakSuggestion;
  private static final SubLObject $const13$keInteractionRequirement;
  private static final SubLObject $const14$keInteractionStrongSuggestion;
  private static final SubLInteger $int15$90;
  private static final SubLSymbol $sym16$WITH_POSSIBLY_NEW_MEMOIZATION_STATE;
  private static final SubLSymbol $sym17$WITH_SBHL_RESOURCED_MARKING_SPACES;
  private static final SubLString $str18$RKF_Salient_Descriptor__Couldn_t_;
  private static final SubLInteger $int19$50000;
  private static final SubLSymbol $sym20$POSITIVE_INTEGER_P;
  private static final SubLSymbol $kw21$ISA;
  private static final SubLList $list22;
  private static final SubLSymbol $sym23$_X;
  private static final SubLObject $const24$isa;
  private static final SubLObject $const25$genls;
  private static final SubLSymbol $sym26$RKF_SALIENT_DESCRIPTOR_META_ISA_TYPE_VIOLATION_;
  private static final SubLSymbol $sym27$RKF_SALIENT_DESCRIPTOR_TYPE_SPECS;
  private static final SubLSymbol $kw28$BREADTH;
  private static final SubLSymbol $kw29$QUEUE;
  private static final SubLSymbol $kw30$STACK;
  private static final SubLSymbol $sym31$RELEVANT_SBHL_TV_IS_GENERAL_TV;
  private static final SubLSymbol $kw32$ERROR;
  private static final SubLString $str33$_A_is_not_a__A;
  private static final SubLSymbol $sym34$SBHL_TRUE_TV_P;
  private static final SubLSymbol $kw35$CERROR;
  private static final SubLString $str36$continue_anyway;
  private static final SubLSymbol $kw37$WARN;
  private static final SubLString $str38$_A_is_not_a_valid__sbhl_type_erro;
  private static final SubLObject $const39$typeGenls;
  private static final SubLSymbol $kw40$DEPTH;
  private static final SubLObject $const41$genlPreds;
  private static final SubLString $str42$_A_is_neither_SET_P_nor_LISTP_;
  private static final SubLString $str43$attempting_to_bind_direction_link;
  private static final SubLString $str44$Node__a_does_not_pass_sbhl_type_t;
  private static final SubLObject $const45$genlInverse;
  private static final SubLSymbol $sym46$REUSE_EXISTING_;
  private static final SubLSymbol $sym47$STORE;
  private static final SubLSymbol $sym48$CLET;
  private static final SubLList $list49;
  private static final SubLList $list50;
  private static final SubLList $list51;
  private static final SubLSymbol $sym52$CUNWIND_PROTECT;
  private static final SubLSymbol $sym53$PROGN;
  private static final SubLSymbol $sym54$PUNLESS;
  private static final SubLSymbol $sym55$RKF_SD_FREE_PROBLEM_STORE;
  private static final SubLSymbol $kw56$NOT_FOUND;
  private static final SubLSymbol $kw57$ANY;
  private static final SubLSymbol $kw58$BIN_PRED;
  private static final SubLSymbol $kw59$ALL;
  private static final SubLSymbol $kw60$META_ISA;
  private static final SubLString $str61$Can_t_identify__S_common_properti;
  private static final SubLInteger $int62$25000;
  private static final SubLList $list63;
  private static final SubLSymbol $sym64$FIRST;
  private static final SubLInteger $int65$25;
  private static final SubLList $list66;
  private static final SubLList $list67;
  private static final SubLList $list68;
  private static final SubLSymbol $kw69$PROBLEM_STORE;
  private static final SubLSymbol $kw70$ANSWER_LANGUAGE;
  private static final SubLSymbol $kw71$HL;
  private static final SubLSymbol $kw72$CONDITIONAL_SENTENCE_;
  private static final SubLSymbol $sym73$_COLLECTION_TYPE;
  private static final SubLSymbol $sym74$_INSTANCE;
  private static final SubLObject $const75$implies;
  private static final SubLObject $const76$thereExists;
  private static final SubLSymbol $sym77$_TYPE;
  private static final SubLObject $const78$and;
  private static final SubLList $list79;
  private static final SubLSymbol $kw80$TERM;
  private static final SubLSymbol $kw81$GENLS;
  private static final SubLList $list82;
  private static final SubLList $list83;
  private static final SubLList $list84;
  private static final SubLSymbol $kw85$SUPERIOR;
  private static final SubLSymbol $kw86$ASCENDING;
  private static final SubLSymbol $sym87$ALL_ISA;
  private static final SubLSymbol $sym88$ALL_GENLS;
  private static final SubLSymbol $sym89$RKF_INDUCED_SALIENT_DESCRIPTOR_BINARY_PREDS;
  private static final SubLSymbol $sym90$RKF_INDUCED_SALIENT_DESCRIPTOR_META_ISAS;
  private static final SubLSymbol $sym91$CAR;
  private static final SubLSymbol $sym92$RKF_SALIENT_DESCRIPTOR_GENL_;
  private static final SubLList $list93;
  private static final SubLSymbol $sym94$_SPEC;
  private static final SubLSymbol $sym95$RKF_MAKE_BIN_PRED_FORMULA;
  private static final SubLSymbol $sym96$RKF_MAKE_META_ISA_FORMULA;
  private static final SubLList $list97;
  private static final SubLSymbol $kw98$CODE;
  private static final SubLList $list99;
  private static final SubLList $list100;
  private static final SubLSymbol $kw101$INTERMEDIATE_STEP_VALIDATION_LEVEL;
  private static final SubLSymbol $kw102$ARG_TYPE;
  private static final SubLSymbol $kw103$CACHE_INFERENCE_RESULTS_;
  private static final SubLSymbol $kw104$RESULT_UNIQUENESS;
  private static final SubLSymbol $kw105$BINDINGS;
  private static final SubLSymbol $kw106$RETURN;
  private static final SubLSymbol $kw107$TEMPLATE;
  private static final SubLSymbol $kw108$PRODUCTIVITY_LIMIT;
  private static final SubLInteger $int109$100000;
  private static final SubLSymbol $kw110$MAX_NUMBER;
  private static final SubLSymbol $kw111$MAX_TIME;
  private static final SubLSymbol $kw112$PROBABLY_APPROXIMATELY_DONE;
  private static final SubLSymbol $kw113$MAX_TRANSFORMATION_DEPTH;
  private static final SubLInteger $int114$100;
  private static final SubLObject $const115$keInducedStrongSuggestionPreds;
  private static final SubLObject $const116$keInducedWeakSuggestionPreds;
  private static final SubLObject $const117$keInducedSuggestionPreds;
  private static final SubLObject $const118$keGenlsInducedStrongSuggestionPre;
  private static final SubLObject $const119$keGenlsInducedWeakSuggestionPreds;
  private static final SubLObject $const120$keGenlsInducedSuggestionPreds;
  private static final SubLObject $const121$SpecsFn;
  private static final SubLSymbol $kw122$GENL;
  private static final SubLSymbol $sym123$_PRED;
  private static final SubLObject $const124$AnytimePSC;
  private static final SubLObject $const125$unknownSentence;
  private static final SubLSymbol $sym126$_GENL;
  private static final SubLList $list127;
  private static final SubLObject $const128$different;
  private static final SubLList $list129;
  private static final SubLString $str130$_S___halted_with_reason__S__;
  private static final SubLSymbol $sym131$_COUNT;
  private static final SubLObject $const132$assertedArg1BinaryPreds_Count;
  private static final SubLList $list133;
  private static final SubLList $list134;
  private static final SubLString $str135$Type_violation___S__S__S;
  private static final SubLObject $const136$keRelevantPreds;
  private static final SubLSymbol $sym137$RKF_SALIENT_DESCRIPTOR_GET_INFERIORS;
  private static final SubLInteger $int138$200;
  private static final SubLSymbol $sym139$INSTANCES;
  private static final SubLSymbol $sym140$SPECS;
  private static final SubLSymbol $sym141$RKF_SALIENT_DESCRIPTOR_BINARY_PRED_TYPE_VIOLATION_;
  private static final SubLString $str142$violation___S_not_a_known_spec_of;
  private static final SubLSymbol $sym143$RKF_TERM_BINARY_PREDS;
  private static final SubLInteger $int144$10000;
  private static final SubLSymbol $kw145$GAF;
  private static final SubLSymbol $sym146$RKF_TERM_ALL_META_ISAS;
  private static final SubLList $list147;
  private static final SubLSymbol $sym148$EL_VAR_;
  private static final SubLSymbol $sym149$RKF_SD_EL_WFF_;
  private static final SubLSymbol $sym150$ALIST__;
  private static final SubLObject $const151$quotedIsa;
  private static final SubLList $list152;
  private static final SubLList $list153;
  private static final SubLList $list154;
  private static final SubLList $list155;
  private static final SubLList $list156;
  private static final SubLSymbol $kw157$NEGATION_BY_FAILURE_;
  private static final SubLSymbol $kw158$ALLOW_INDETERMINATE_RESULTS_;
  private static final SubLSymbol $kw159$FORGET_EXTRA_RESULTS_;
  private static final SubLSymbol $kw160$BROWSABLE_;
  private static final SubLSymbol $kw161$CONTINUABLE_;
  private static final SubLSymbol $sym162$RKF_SD_KNOWN;
  private static final SubLString $str163$_S_is_not_continuable____Exit_con;
  private static final SubLSymbol $kw164$EXHAUST;
  private static final SubLString $str165$RKF_SD_KNOWN_timed_out_on__S;
  private static final SubLList $list166;
  private static final SubLSymbol $sym167$RKF_SD_GET_CONJUNCT_BINDINGS;
  private static final SubLList $list168;
  private static final SubLSymbol $sym169$HL_VAR_;
  private static final SubLSymbol $kw170$NEG;
  private static final SubLSymbol $sym171$FULLY_BOUND_P;
  private static final SubLSymbol $kw172$POS;
  private static final SubLSymbol $kw173$KNOWN;
  private static final SubLSymbol $kw174$UNKNOWN;
  private static final SubLSymbol $kw175$MISMATCH;
  private static final SubLSymbol $sym176$RKF_SD_CHECK_LIT;
  private static final SubLSymbol $kw177$MALFORMED;
  private static final SubLSymbol $kw178$IRRELEVANT;
  private static final SubLSymbol $kw179$FALSE;
  private static final SubLSymbol $kw180$BINDINGS_AND_SUPPORTS;
  private static final SubLSymbol $sym181$_FORMULA;
  private static final SubLString $str182$Timed_out_after__S_seconds_gettin;
  private static final SubLString $str183$P_A_D__getting__S_for__S___;
  private static final SubLList $list184;
  private static final SubLSymbol $kw185$IGNORE;
  private static final SubLSymbol $kw186$UNINITIALIZED;
  private static final SubLSymbol $sym187$RELEVANT_MT_IS_EVERYTHING;
  private static final SubLObject $const188$EverythingPSC;
  private static final SubLObject $const189$deprecatedSalientDescriptorRule;
  private static final SubLObject $const190$deprecatedSalientDescriptorRuleAs;
  private static final SubLSymbol $sym191$DEPRECATE_SALIENT_DESCRIPTOR_RULE;
  private static final SubLSymbol $sym192$UNDEPRECATE_SALIENT_DESCRIPTOR_RULE;
  private static final SubLObject $const193$ArgConstraintPredicate;
  private static final SubLList $list194;
  private static final SubLSymbol $kw195$ANYTHING;
  private static final SubLObject $const196$TransitiveBinaryPredicate;
  private static final SubLObject $const197$BinaryPredicate;
  private static final SubLObject $const198$transitiveViaArg;
  private static final SubLObject $const199$transitiveViaArgInverse;
  private static final SubLList $list200;
  private static final SubLList $list201;
  private static final SubLSymbol $sym202$_RKF_SALIENT_DESCRIPTOR_CACHE_;
  private static final SubLString $str203$RKF_Salient_Descriptor_Cache_Lock;
  private static final SubLSymbol $sym204$_RKF_SALIENT_DESCRIPTOR_IGNORE_CACHE_;
  private static final SubLObject $const205$singleEntryFormatInArgs;
  private static final SubLList $list206;
  private static final SubLList $list207;
  private static final SubLObject $const208$argFormat;
  private static final SubLList $list209;
  private static final SubLSymbol $sym210$EXPRESSION_FIND;
  private static final SubLSymbol $sym211$RKF_SALIENT_DESCRIPTOR_SUBPROMPT_P;
  private static final SubLList $list212;
  private static final SubLSymbol $kw213$CONFIRM;
  private static final SubLList $list214;
  private static final SubLSymbol $kw215$CHOICE;
  private static final SubLSymbol $kw216$SPECIFY;
  private static final SubLList $list217;
  private static final SubLList $list218;
  private static final SubLObject $const219$True_JustificationTruth;
  private static final SubLObject $const220$disjointWith;
  private static final SubLSymbol $kw221$STRENGTHEN;
  private static final SubLSymbol $sym222$RKF_SD_EXAMPLES;
  private static final SubLSymbol $sym223$EL_FORMULA_P;
  private static final SubLSymbol $kw224$NOT_TRIED;
  private static final SubLSymbol $kw225$FORT;
  private static final SubLList $list226;
  private static final SubLList $list227;
  private static final SubLObject $const228$relationAllInstance;
  private static final SubLObject $const229$knownSentence;
  private static final SubLSymbol $sym230$RKF_SD_ADD_KNOWN_SENTENCE;
  private static final SubLSymbol $kw231$VAR;
  private static final SubLSymbol $sym232$RKF_SD_COMPLETE_COLL_BINDINGS_OK_;
  private static final SubLObject $const233$elementOf;
  private static final SubLObject $const234$TheSet;
  private static final SubLSymbol $sym235$RKF_SD_SMALL_SET_BINDINGS_OK_;
  private static final SubLObject $const236$notAssertible;
  private static final SubLObject $const237$or;
  private static final SubLObject $const238$termDependsOn;
  private static final SubLObject $const239$uiaDisplayTerm;
  private static final SubLSymbol $kw240$CONSTRAINT_MATCHER;
  private static final SubLSymbol $kw241$PRECEDENT;
  private static final SubLSymbol $sym242$RKF_SD_EXAMPLE_TERM;
  private static final SubLSymbol $sym243$RKF_EXAMPLE_WFF__INT;
  private static final SubLSymbol $kw244$IGNORE_ERRORS_TARGET;
  private static final SubLSymbol $sym245$IGNORE_ERRORS_HANDLER;
  private static final SubLString $str246$__RKF_EXAMPLE_INSTANCES_ASK_timed;
  private static final SubLSymbol $sym247$GENERALITY_ESTIMATE_;
  private static final SubLSymbol $sym248$RKF_BETTER_EXAMPLE_;
  private static final SubLSymbol $kw249$BUG_WORKAROUND;

  @SubLTranslatedFile.SubL(source = "cycl/rkf-salient-descriptor.lisp", position = 1001L)
  public static SubLObject rkf_salient_descriptor_formula_type_p(final SubLObject v_object)
  {
    return subl_promotions.memberP( v_object, $rkf_salient_formula_types$.getGlobalValue(), UNPROVIDED, UNPROVIDED );
  }

  @SubLTranslatedFile.SubL(source = "cycl/rkf-salient-descriptor.lisp", position = 1118L)
  public static SubLObject rkf_salient_formulas(final SubLObject type, final SubLObject fort, SubLObject mt)
  {
    if( mt == UNPROVIDED )
    {
      mt = control_vars.$rkf_mt$.getDynamicValue();
    }
    assert NIL != rkf_salient_descriptor_formula_type_p( type ) : type;
    if( type.eql( $kw2$REQUIREMENT ) )
    {
      return rkf_salient_requirements( fort, mt );
    }
    if( type.eql( $kw3$STRONG ) )
    {
      return rkf_salient_strong_suggestions( fort, mt );
    }
    if( type.eql( $kw4$WEAK ) )
    {
      return rkf_salient_weak_suggestions( fort, mt );
    }
    if( type.eql( $kw5$NEIGHBOR ) )
    {
      return rkf_salient_neighbor_suggestions( fort, mt );
    }
    Errors.error( $str6$_S_is_not_a_valid_salience_type, type );
    return Values.values( NIL, NIL );
  }

  @SubLTranslatedFile.SubL(source = "cycl/rkf-salient-descriptor.lisp", position = 1768L)
  public static SubLObject rkf_salient_requirements(final SubLObject fort, SubLObject mt)
  {
    if( mt == UNPROVIDED )
    {
      mt = control_vars.$rkf_mt$.getDynamicValue();
    }
    assert NIL != forts.fort_p( fort ) : fort;
    assert NIL != hlmt.hlmt_p( mt ) : mt;
    return rkf_requirements( fort, mt );
  }

  @SubLTranslatedFile.SubL(source = "cycl/rkf-salient-descriptor.lisp", position = 1990L)
  public static SubLObject rkf_salient_strong_suggestions(final SubLObject fort, SubLObject mt)
  {
    if( mt == UNPROVIDED )
    {
      mt = control_vars.$rkf_mt$.getDynamicValue();
    }
    assert NIL != forts.fort_p( fort ) : fort;
    assert NIL != hlmt.hlmt_p( mt ) : mt;
    return rkf_strong_suggestions( fort, mt );
  }

  @SubLTranslatedFile.SubL(source = "cycl/rkf-salient-descriptor.lisp", position = 2222L)
  public static SubLObject rkf_salient_weak_suggestions(final SubLObject fort, SubLObject mt)
  {
    if( mt == UNPROVIDED )
    {
      mt = control_vars.$rkf_mt$.getDynamicValue();
    }
    assert NIL != forts.fort_p( fort ) : fort;
    assert NIL != hlmt.hlmt_p( mt ) : mt;
    return rkf_weak_suggestions( fort, mt );
  }

  @SubLTranslatedFile.SubL(source = "cycl/rkf-salient-descriptor.lisp", position = 2448L)
  public static SubLObject rkf_salient_neighbor_suggestions(final SubLObject fort, SubLObject mt)
  {
    if( mt == UNPROVIDED )
    {
      mt = control_vars.$rkf_mt$.getDynamicValue();
    }
    assert NIL != forts.fort_p( fort ) : fort;
    assert NIL != hlmt.hlmt_p( mt ) : mt;
    return rkf_induced_salient_descriptor_query_sentences( fort, mt );
  }

  @SubLTranslatedFile.SubL(source = "cycl/rkf-salient-descriptor.lisp", position = 2698L)
  public static SubLObject rkf_salient_descriptor(final SubLObject fort, SubLObject mt, SubLObject ignored)
  {
    if( mt == UNPROVIDED )
    {
      mt = control_vars.$rkf_mt$.getDynamicValue();
    }
    if( ignored == UNPROVIDED )
    {
      ignored = NIL;
    }
    assert NIL != Types.listp( ignored ) : ignored;
    if( NIL == forts.fort_p( fort ) )
    {
      return NIL;
    }
    final SubLObject cache_key = ConsesLow.list( fort, mt );
    if( NIL == rkf_sd_present( cache_key ) )
    {
      rkf_sd_update( cache_key, NIL );
    }
    SubLObject pending_formulas = rkf_sd_lookup( cache_key );
    if( NIL != pending_formulas )
    {
      final SubLObject next_formula = pending_formulas.first();
      pending_formulas = pending_formulas.rest();
      rkf_sd_update( cache_key, pending_formulas );
      return next_formula;
    }
    SubLObject new_formulas = rkf_strong_suggestions( fort, mt );
    new_formulas = conses_high.set_difference( new_formulas, ignored, Symbols.symbol_function( EQUAL ), UNPROVIDED );
    if( NIL != new_formulas )
    {
      new_formulas = rkf_sort_salient_formulas( new_formulas );
      rkf_sd_update( cache_key, new_formulas );
      return rkf_salient_descriptor( fort, mt, ignored );
    }
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/rkf-salient-descriptor.lisp", position = 4026L)
  public static SubLObject rkf_salient_descriptor_parallel(final SubLObject fort, SubLObject mt)
  {
    if( mt == UNPROVIDED )
    {
      mt = control_vars.$rkf_mt$.getDynamicValue();
    }
    if( NIL == forts.fort_p( fort ) )
    {
      return NIL;
    }
    final SubLObject cache_key = ConsesLow.list( fort, mt );
    if( NIL == rkf_sd_present( cache_key ) )
    {
      rkf_sd_update( cache_key, NIL );
    }
    if( NIL == rkf_sd_ignore_present( cache_key ) )
    {
      rkf_sd_ignore_update( cache_key, NIL );
    }
    SubLObject pending_formulas = rkf_sd_lookup( cache_key );
    final SubLObject ignore_formulas = rkf_sd_ignore_lookup( cache_key );
    pending_formulas = conses_high.set_difference( pending_formulas, ignore_formulas, Symbols.symbol_function( EQUAL ), UNPROVIDED );
    if( NIL != pending_formulas )
    {
      rkf_sd_update( cache_key, NIL );
      rkf_sd_ignore_update( cache_key, conses_high.union( pending_formulas, ignore_formulas, Symbols.symbol_function( EQUAL ), UNPROVIDED ) );
      return conses_high.copy_tree( pending_formulas );
    }
    SubLObject new_formulas = rkf_strong_suggestions( fort, mt );
    new_formulas = conses_high.set_difference( new_formulas, ignore_formulas, Symbols.symbol_function( EQUAL ), UNPROVIDED );
    if( NIL != new_formulas )
    {
      rkf_sd_ignore_update( cache_key, conses_high.union( new_formulas, pending_formulas, Symbols.symbol_function( EQUAL ), UNPROVIDED ) );
      return new_formulas;
    }
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/rkf-salient-descriptor.lisp", position = 5169L)
  public static SubLObject rkf_requirements(final SubLObject fort, SubLObject mt)
  {
    if( mt == UNPROVIDED )
    {
      mt = control_vars.$rkf_mt$.getDynamicValue();
    }
    return rkf_salient_descriptor_formulas( fort, $const10$keRequirement, mt );
  }

  @SubLTranslatedFile.SubL(source = "cycl/rkf-salient-descriptor.lisp", position = 5300L)
  public static SubLObject rkf_strong_suggestions(final SubLObject fort, SubLObject mt)
  {
    if( mt == UNPROVIDED )
    {
      mt = control_vars.$rkf_mt$.getDynamicValue();
    }
    return rkf_salient_descriptor_formulas( fort, $const11$keStrongSuggestion, mt );
  }

  @SubLTranslatedFile.SubL(source = "cycl/rkf-salient-descriptor.lisp", position = 5442L)
  public static SubLObject rkf_neighbor_suggestions(final SubLObject fort, SubLObject mt)
  {
    if( mt == UNPROVIDED )
    {
      mt = control_vars.$rkf_mt$.getDynamicValue();
    }
    return rkf_salient_neighbor_suggestions( fort, mt );
  }

  @SubLTranslatedFile.SubL(source = "cycl/rkf-salient-descriptor.lisp", position = 5566L)
  public static SubLObject rkf_weak_suggestions(final SubLObject fort, SubLObject mt)
  {
    if( mt == UNPROVIDED )
    {
      mt = control_vars.$rkf_mt$.getDynamicValue();
    }
    return rkf_salient_descriptor_formulas( fort, $const12$keWeakSuggestion, mt );
  }

  @SubLTranslatedFile.SubL(source = "cycl/rkf-salient-descriptor.lisp", position = 5704L)
  public static SubLObject rkf_interaction_requirements(final SubLObject fort, SubLObject mt)
  {
    if( mt == UNPROVIDED )
    {
      mt = control_vars.$rkf_mt$.getDynamicValue();
    }
    return rkf_salient_descriptor_formulas( fort, $const13$keInteractionRequirement, mt );
  }

  @SubLTranslatedFile.SubL(source = "cycl/rkf-salient-descriptor.lisp", position = 5858L)
  public static SubLObject rkf_interaction_strong_suggestions(final SubLObject fort, SubLObject mt)
  {
    if( mt == UNPROVIDED )
    {
      mt = control_vars.$rkf_mt$.getDynamicValue();
    }
    return rkf_salient_descriptor_formulas( fort, $const14$keInteractionStrongSuggestion, mt );
  }

  @SubLTranslatedFile.SubL(source = "cycl/rkf-salient-descriptor.lisp", position = 6579L)
  public static SubLObject with_rkf_sd_memoization(final SubLObject macroform, final SubLObject environment)
  {
    final SubLObject datum = macroform.rest();
    final SubLObject body;
    final SubLObject current = body = datum;
    return ConsesLow.list( $sym16$WITH_POSSIBLY_NEW_MEMOIZATION_STATE, ConsesLow.listS( $sym17$WITH_SBHL_RESOURCED_MARKING_SPACES, SIX_INTEGER, ConsesLow.append( body, NIL ) ) );
  }

  @SubLTranslatedFile.SubL(source = "cycl/rkf-salient-descriptor.lisp", position = 6864L)
  public static SubLObject rkf_induced_salient_descriptor_query_sentences(final SubLObject v_term, SubLObject mt)
  {
    if( mt == UNPROVIDED )
    {
      mt = control_vars.$rkf_mt$.getDynamicValue();
    }
    final SubLThread thread = SubLProcess.currentSubLThread();
    SubLObject query_sentences = NIL;
    SubLObject justifications = NIL;
    final SubLObject local_state;
    final SubLObject state = local_state = memoization_state.possibly_new_memoization_state();
    final SubLObject _prev_bind_0 = memoization_state.$memoization_state$.currentBinding( thread );
    try
    {
      memoization_state.$memoization_state$.bind( local_state, thread );
      final SubLObject original_memoization_process = memoization_state.memoization_state_original_process( local_state );
      try
      {
        final SubLObject already_resourcing_p = sbhl_marking_vars.$resourcing_sbhl_marking_spaces_p$.getDynamicValue( thread );
        final SubLObject _prev_bind_0_$1 = sbhl_marking_vars.$resourced_sbhl_marking_space_limit$.currentBinding( thread );
        final SubLObject _prev_bind_2 = sbhl_marking_vars.$resourced_sbhl_marking_spaces$.currentBinding( thread );
        final SubLObject _prev_bind_3 = sbhl_marking_vars.$resourcing_sbhl_marking_spaces_p$.currentBinding( thread );
        try
        {
          sbhl_marking_vars.$resourced_sbhl_marking_space_limit$.bind( sbhl_marking_vars.determine_resource_limit( already_resourcing_p, SIX_INTEGER ), thread );
          sbhl_marking_vars.$resourced_sbhl_marking_spaces$.bind( sbhl_marking_vars.possibly_new_marking_resource( already_resourcing_p ), thread );
          sbhl_marking_vars.$resourcing_sbhl_marking_spaces_p$.bind( T, thread );
          final SubLObject induction_basis_properties = rkf_sd_induction_basis_properties( v_term, mt );
          final SubLObject maximally_generalP = NIL;
          final SubLObject _prev_bind_0_$2 = $rkf_salient_descriptor_number_cutoff$.currentBinding( thread );
          try
          {
            $rkf_salient_descriptor_number_cutoff$.bind( NIL, thread );
            thread.resetMultipleValues();
            final SubLObject common_properties = rkf_induced_salient_descriptor_common_properties( induction_basis_properties, mt, maximally_generalP, UNPROVIDED );
            final SubLObject basis_properties = thread.secondMultipleValue();
            thread.resetMultipleValues();
            justifications = rkf_sd_justifications_from_basis_properties( v_term, basis_properties, mt );
            SubLObject cdolist_list_var = common_properties;
            SubLObject common_property = NIL;
            common_property = cdolist_list_var.first();
            while ( NIL != cdolist_list_var)
            {
              final SubLObject query_sentence = properties.property_to_sentence( common_property, v_term );
              if( NIL == $rkf_sd_exclude_known_promptsP$.getDynamicValue( thread ) || NIL == rkf_sd_known( query_sentence, mt, UNPROVIDED ) )
              {
                query_sentences = ConsesLow.cons( query_sentence, query_sentences );
              }
              cdolist_list_var = cdolist_list_var.rest();
              common_property = cdolist_list_var.first();
            }
            query_sentences = Sequences.nreverse( query_sentences );
          }
          finally
          {
            $rkf_salient_descriptor_number_cutoff$.rebind( _prev_bind_0_$2, thread );
          }
        }
        finally
        {
          sbhl_marking_vars.$resourcing_sbhl_marking_spaces_p$.rebind( _prev_bind_3, thread );
          sbhl_marking_vars.$resourced_sbhl_marking_spaces$.rebind( _prev_bind_2, thread );
          sbhl_marking_vars.$resourced_sbhl_marking_space_limit$.rebind( _prev_bind_0_$1, thread );
        }
      }
      finally
      {
        final SubLObject _prev_bind_0_$3 = Threads.$is_thread_performing_cleanupP$.currentBinding( thread );
        try
        {
          Threads.$is_thread_performing_cleanupP$.bind( T, thread );
          final SubLObject _values = Values.getValuesAsVector();
          memoization_state.memoization_state_possibly_clear_original_process( local_state, original_memoization_process );
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
      memoization_state.$memoization_state$.rebind( _prev_bind_0, thread );
    }
    return Values.values( query_sentences, justifications );
  }

  @SubLTranslatedFile.SubL(source = "cycl/rkf-salient-descriptor.lisp", position = 8055L)
  public static SubLObject rkf_sd_justifications_from_basis_properties(final SubLObject v_term, final SubLObject basis_properties, final SubLObject mt)
  {
    SubLObject justifications = NIL;
    SubLObject cdolist_list_var = basis_properties;
    SubLObject basis_property = NIL;
    basis_property = cdolist_list_var.first();
    while ( NIL != cdolist_list_var)
    {
      final SubLObject fact = properties.property_to_sentence( basis_property, v_term );
      final SubLObject justification = rkf_query_utilities.rkf_justify( fact, mt ).first();
      if( NIL == arguments.supports_p( justification ) )
      {
        Errors.warn( $str18$RKF_Salient_Descriptor__Couldn_t_, fact, mt );
      }
      justifications = ConsesLow.cons( justification, justifications );
      cdolist_list_var = cdolist_list_var.rest();
      basis_property = cdolist_list_var.first();
    }
    return Sequences.nreverse( justifications );
  }

  @SubLTranslatedFile.SubL(source = "cycl/rkf-salient-descriptor.lisp", position = 8529L)
  public static SubLObject rkf_close_isas(final SubLObject v_term, final SubLObject mt)
  {
    final SubLObject generality_cutoff = $int19$50000;
    final SubLObject all_isas = isa.isa( v_term, mt, UNPROVIDED );
    SubLObject close_isas = NIL;
    SubLObject cdolist_list_var = all_isas;
    SubLObject v_isa = NIL;
    v_isa = cdolist_list_var.first();
    while ( NIL != cdolist_list_var)
    {
      if( !cardinality_estimates.generality_estimate( v_isa ).numG( generality_cutoff ) )
      {
        close_isas = ConsesLow.cons( v_isa, close_isas );
      }
      cdolist_list_var = cdolist_list_var.rest();
      v_isa = cdolist_list_var.first();
    }
    return close_isas;
  }

  @SubLTranslatedFile.SubL(source = "cycl/rkf-salient-descriptor.lisp", position = 8868L)
  public static SubLObject rkf_close_genls(final SubLObject v_term, final SubLObject mt)
  {
    final SubLObject generality_cutoff = $int19$50000;
    final SubLObject all_genls = genls.genls( v_term, mt, UNPROVIDED );
    SubLObject close_genls = NIL;
    SubLObject cdolist_list_var = all_genls;
    SubLObject genl = NIL;
    genl = cdolist_list_var.first();
    while ( NIL != cdolist_list_var)
    {
      if( !cardinality_estimates.generality_estimate( genl ).numG( generality_cutoff ) )
      {
        close_genls = ConsesLow.cons( genl, close_genls );
      }
      cdolist_list_var = cdolist_list_var.rest();
      genl = cdolist_list_var.first();
    }
    return close_genls;
  }

  @SubLTranslatedFile.SubL(source = "cycl/rkf-salient-descriptor.lisp", position = 9219L)
  public static SubLObject rkf_induced_salient_descriptor_meta_isas(final SubLObject mt, final SubLObject superior, final SubLObject type, SubLObject known_meta_isas, SubLObject lax_factor)
  {
    if( known_meta_isas == UNPROVIDED )
    {
      known_meta_isas = NIL;
    }
    if( lax_factor == UNPROVIDED )
    {
      lax_factor = TEN_INTEGER;
    }
    final SubLThread thread = SubLProcess.currentSubLThread();
    assert NIL != subl_promotions.positive_integer_p( lax_factor ) : lax_factor;
    final SubLObject siblings = rkf_salient_descriptor_get_inferiors( mt, superior, type, UNPROVIDED );
    final SubLObject sibling_count = Sequences.length( siblings );
    final SubLObject min_occurence = number_utilities.maximum( ConsesLow.list( Numbers.integerDivide( sibling_count, lax_factor ), FIVE_INTEGER ), UNPROVIDED );
    SubLObject alist = NIL;
    if( $kw21$ISA == type )
    {
      final SubLObject mt_var = mt_relevance_macros.with_inference_mt_relevance_validate( mt );
      final SubLObject _prev_bind_0 = mt_relevance_macros.$mt$.currentBinding( thread );
      final SubLObject _prev_bind_2 = mt_relevance_macros.$relevant_mt_function$.currentBinding( thread );
      final SubLObject _prev_bind_3 = mt_relevance_macros.$relevant_mts$.currentBinding( thread );
      try
      {
        mt_relevance_macros.$mt$.bind( mt_relevance_macros.update_inference_mt_relevance_mt( mt_var ), thread );
        mt_relevance_macros.$relevant_mt_function$.bind( mt_relevance_macros.update_inference_mt_relevance_function( mt_var ), thread );
        mt_relevance_macros.$relevant_mts$.bind( mt_relevance_macros.update_inference_mt_relevance_mt_list( mt_var ), thread );
        known_meta_isas = ConsesLow.append( known_meta_isas, isa.all_isa( superior, UNPROVIDED, UNPROVIDED ) );
      }
      finally
      {
        mt_relevance_macros.$relevant_mts$.rebind( _prev_bind_3, thread );
        mt_relevance_macros.$relevant_mt_function$.rebind( _prev_bind_2, thread );
        mt_relevance_macros.$mt$.rebind( _prev_bind_0, thread );
      }
    }
    if( sibling_count.numGE( min_occurence ) )
    {
      SubLObject cdolist_list_var = siblings;
      SubLObject sibling = NIL;
      sibling = cdolist_list_var.first();
      while ( NIL != cdolist_list_var)
      {
        SubLObject cdolist_list_var_$4 = rkf_term_meta_isas( sibling, mt );
        SubLObject meta_isa = NIL;
        meta_isa = cdolist_list_var_$4.first();
        while ( NIL != cdolist_list_var_$4)
        {
          if( NIL == subl_promotions.memberP( meta_isa, known_meta_isas, UNPROVIDED, UNPROVIDED ) && NIL == rkf_relevance_utilities.rkf_irrelevant_term( meta_isa, mt ) )
          {
            final SubLObject mt_var2 = mt_relevance_macros.with_inference_mt_relevance_validate( mt );
            final SubLObject _prev_bind_4 = mt_relevance_macros.$mt$.currentBinding( thread );
            final SubLObject _prev_bind_5 = mt_relevance_macros.$relevant_mt_function$.currentBinding( thread );
            final SubLObject _prev_bind_6 = mt_relevance_macros.$relevant_mts$.currentBinding( thread );
            try
            {
              mt_relevance_macros.$mt$.bind( mt_relevance_macros.update_inference_mt_relevance_mt( mt_var2 ), thread );
              mt_relevance_macros.$relevant_mt_function$.bind( mt_relevance_macros.update_inference_mt_relevance_function( mt_var2 ), thread );
              mt_relevance_macros.$relevant_mts$.bind( mt_relevance_macros.update_inference_mt_relevance_mt_list( mt_var2 ), thread );
              final SubLObject current_count = list_utilities.alist_lookup( alist, meta_isa, Symbols.symbol_function( EQUAL ), ZERO_INTEGER );
              alist = list_utilities.alist_enter( alist, meta_isa, number_utilities.f_1X( current_count ), Symbols.symbol_function( EQUAL ) );
            }
            finally
            {
              mt_relevance_macros.$relevant_mts$.rebind( _prev_bind_6, thread );
              mt_relevance_macros.$relevant_mt_function$.rebind( _prev_bind_5, thread );
              mt_relevance_macros.$mt$.rebind( _prev_bind_4, thread );
            }
          }
          cdolist_list_var_$4 = cdolist_list_var_$4.rest();
          meta_isa = cdolist_list_var_$4.first();
        }
        cdolist_list_var = cdolist_list_var.rest();
        sibling = cdolist_list_var.first();
      }
    }
    SubLObject filtered = NIL;
    SubLObject cdolist_list_var2 = alist;
    SubLObject item = NIL;
    item = cdolist_list_var2.first();
    while ( NIL != cdolist_list_var2)
    {
      SubLObject current;
      final SubLObject datum = current = item;
      SubLObject meta_isa2 = NIL;
      SubLObject count = NIL;
      cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list22 );
      meta_isa2 = current.first();
      current = ( count = current.rest() );
      if( !count.numL( min_occurence ) && NIL == rkf_salient_descriptor_meta_isa_type_violationP( superior, meta_isa2, mt ) )
      {
        filtered = ConsesLow.cons( item, filtered );
      }
      cdolist_list_var2 = cdolist_list_var2.rest();
      item = cdolist_list_var2.first();
    }
    return filtered;
  }

  @SubLTranslatedFile.SubL(source = "cycl/rkf-salient-descriptor.lisp", position = 10636L)
  public static SubLObject rkf_make_meta_isa_formula(final SubLObject v_term, final SubLObject meta_isa)
  {
    final SubLObject new_var = czer_utilities.unique_el_var_wrt_expression( v_term, $sym23$_X );
    return el_utilities.make_existential( new_var, el_utilities.make_conjunction( ConsesLow.list( el_utilities.make_binary_formula( $const24$isa, new_var, meta_isa ), el_utilities.make_binary_formula( $const24$isa,
        v_term, new_var ) ) ) );
  }

  @SubLTranslatedFile.SubL(source = "cycl/rkf-salient-descriptor.lisp", position = 10996L)
  public static SubLObject rkf_make_bin_pred_formula(final SubLObject v_term, final SubLObject bin_pred)
  {
    return el_utilities.make_existential( $sym23$_X, el_utilities.make_binary_formula( bin_pred, v_term, $sym23$_X ) );
  }

  @SubLTranslatedFile.SubL(source = "cycl/rkf-salient-descriptor.lisp", position = 11130L)
  public static SubLObject rkf_make_salient_descriptor_rule(final SubLObject term_var, final SubLObject superior, final SubLObject consequent, final SubLObject type)
  {
    final SubLObject superior_pred = ( type == $kw21$ISA ) ? $const24$isa : $const25$genls;
    return el_utilities.make_implication( el_utilities.make_binary_formula( superior_pred, term_var, superior ), el_utilities.make_binary_formula( $const11$keStrongSuggestion, term_var, consequent ) );
  }

  @SubLTranslatedFile.SubL(source = "cycl/rkf-salient-descriptor.lisp", position = 11431L)
  public static SubLObject rkf_salient_descriptor_meta_isa_type_violationP_internal(final SubLObject v_term, final SubLObject meta_isa, final SubLObject mt)
  {
    final SubLObject type_specs = rkf_salient_descriptor_type_specs( meta_isa, mt );
    SubLObject malP = NIL;
    if( NIL == malP )
    {
      SubLObject csome_list_var = type_specs;
      SubLObject type_spec = NIL;
      type_spec = csome_list_var.first();
      while ( NIL == malP && NIL != csome_list_var)
      {
        if( NIL == rkf_salient_descriptor_genlP( v_term, type_spec, mt ) )
        {
          malP = T;
        }
        csome_list_var = csome_list_var.rest();
        type_spec = csome_list_var.first();
      }
    }
    return malP;
  }

  @SubLTranslatedFile.SubL(source = "cycl/rkf-salient-descriptor.lisp", position = 11431L)
  public static SubLObject rkf_salient_descriptor_meta_isa_type_violationP(final SubLObject v_term, final SubLObject meta_isa, final SubLObject mt)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    final SubLObject v_memoization_state = memoization_state.$memoization_state$.getDynamicValue( thread );
    SubLObject caching_state = NIL;
    if( NIL == v_memoization_state )
    {
      return rkf_salient_descriptor_meta_isa_type_violationP_internal( v_term, meta_isa, mt );
    }
    caching_state = memoization_state.memoization_state_lookup( v_memoization_state, $sym26$RKF_SALIENT_DESCRIPTOR_META_ISA_TYPE_VIOLATION_, UNPROVIDED );
    if( NIL == caching_state )
    {
      caching_state = memoization_state.create_caching_state( memoization_state.memoization_state_lock( v_memoization_state ), $sym26$RKF_SALIENT_DESCRIPTOR_META_ISA_TYPE_VIOLATION_, THREE_INTEGER, NIL, EQUAL,
          UNPROVIDED );
      memoization_state.memoization_state_put( v_memoization_state, $sym26$RKF_SALIENT_DESCRIPTOR_META_ISA_TYPE_VIOLATION_, caching_state );
    }
    final SubLObject sxhash = memoization_state.sxhash_calc_3( v_term, meta_isa, mt );
    final SubLObject collisions = memoization_state.caching_state_lookup( caching_state, sxhash, UNPROVIDED );
    if( !collisions.eql( memoization_state.$memoized_item_not_found$.getGlobalValue() ) )
    {
      SubLObject cdolist_list_var = collisions;
      SubLObject collision = NIL;
      collision = cdolist_list_var.first();
      while ( NIL != cdolist_list_var)
      {
        SubLObject cached_args = collision.first();
        final SubLObject results2 = conses_high.second( collision );
        if( v_term.equal( cached_args.first() ) )
        {
          cached_args = cached_args.rest();
          if( meta_isa.equal( cached_args.first() ) )
          {
            cached_args = cached_args.rest();
            if( NIL != cached_args && NIL == cached_args.rest() && mt.equal( cached_args.first() ) )
            {
              return memoization_state.caching_results( results2 );
            }
          }
        }
        cdolist_list_var = cdolist_list_var.rest();
        collision = cdolist_list_var.first();
      }
    }
    final SubLObject results3 = Values.arg2( thread.resetMultipleValues(), Values.multiple_value_list( rkf_salient_descriptor_meta_isa_type_violationP_internal( v_term, meta_isa, mt ) ) );
    memoization_state.caching_state_enter_multi_key_n( caching_state, sxhash, collisions, results3, ConsesLow.list( v_term, meta_isa, mt ) );
    return memoization_state.caching_results( results3 );
  }

  @SubLTranslatedFile.SubL(source = "cycl/rkf-salient-descriptor.lisp", position = 11837L)
  public static SubLObject rkf_salient_descriptor_type_specs_internal(final SubLObject collection, final SubLObject mt)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    SubLObject type_specs = NIL;
    final SubLObject mt_var = mt_relevance_macros.with_inference_mt_relevance_validate( mt );
    final SubLObject _prev_bind_0 = mt_relevance_macros.$mt$.currentBinding( thread );
    final SubLObject _prev_bind_2 = mt_relevance_macros.$relevant_mt_function$.currentBinding( thread );
    final SubLObject _prev_bind_3 = mt_relevance_macros.$relevant_mts$.currentBinding( thread );
    try
    {
      mt_relevance_macros.$mt$.bind( mt_relevance_macros.update_inference_mt_relevance_mt( mt_var ), thread );
      mt_relevance_macros.$relevant_mt_function$.bind( mt_relevance_macros.update_inference_mt_relevance_function( mt_var ), thread );
      mt_relevance_macros.$relevant_mts$.bind( mt_relevance_macros.update_inference_mt_relevance_mt_list( mt_var ), thread );
      SubLObject node_var = collection;
      final SubLObject deck_type = $kw30$STACK;
      final SubLObject recur_deck = deck.create_deck( deck_type );
      final SubLObject _prev_bind_0_$5 = sbhl_marking_vars.$sbhl_space$.currentBinding( thread );
      try
      {
        sbhl_marking_vars.$sbhl_space$.bind( sbhl_marking_vars.get_sbhl_marking_space(), thread );
        try
        {
          final SubLObject tv_var = NIL;
          final SubLObject _prev_bind_0_$6 = sbhl_search_vars.$sbhl_tv$.currentBinding( thread );
          final SubLObject _prev_bind_1_$7 = sbhl_search_vars.$relevant_sbhl_tv_function$.currentBinding( thread );
          try
          {
            sbhl_search_vars.$sbhl_tv$.bind( ( NIL != tv_var ) ? tv_var : sbhl_search_vars.get_sbhl_true_tv(), thread );
            sbhl_search_vars.$relevant_sbhl_tv_function$.bind( ( NIL != tv_var ) ? $sym31$RELEVANT_SBHL_TV_IS_GENERAL_TV : sbhl_search_vars.$relevant_sbhl_tv_function$.getDynamicValue( thread ), thread );
            if( NIL != tv_var && NIL != sbhl_paranoia.sbhl_object_type_checking_p() && NIL == sbhl_search_vars.sbhl_true_tv_p( tv_var ) )
            {
              final SubLObject pcase_var = sbhl_paranoia.$sbhl_type_error_action$.getDynamicValue( thread );
              if( pcase_var.eql( $kw32$ERROR ) )
              {
                sbhl_paranoia.sbhl_error( ONE_INTEGER, $str33$_A_is_not_a__A, tv_var, $sym34$SBHL_TRUE_TV_P, UNPROVIDED, UNPROVIDED, UNPROVIDED );
              }
              else if( pcase_var.eql( $kw35$CERROR ) )
              {
                sbhl_paranoia.sbhl_cerror( ONE_INTEGER, $str36$continue_anyway, $str33$_A_is_not_a__A, tv_var, $sym34$SBHL_TRUE_TV_P, UNPROVIDED, UNPROVIDED, UNPROVIDED );
              }
              else if( pcase_var.eql( $kw37$WARN ) )
              {
                Errors.warn( $str33$_A_is_not_a__A, tv_var, $sym34$SBHL_TRUE_TV_P );
              }
              else
              {
                Errors.warn( $str38$_A_is_not_a_valid__sbhl_type_erro, sbhl_paranoia.$sbhl_type_error_action$.getDynamicValue( thread ) );
                Errors.cerror( $str36$continue_anyway, $str33$_A_is_not_a__A, tv_var, $sym34$SBHL_TRUE_TV_P );
              }
            }
            final SubLObject _prev_bind_0_$7 = sbhl_search_vars.$sbhl_search_module$.currentBinding( thread );
            final SubLObject _prev_bind_1_$8 = sbhl_search_vars.$sbhl_search_module_type$.currentBinding( thread );
            final SubLObject _prev_bind_2_$10 = sbhl_search_vars.$sbhl_add_node_to_result_test$.currentBinding( thread );
            final SubLObject _prev_bind_4 = sbhl_search_vars.$genl_inverse_mode_p$.currentBinding( thread );
            final SubLObject _prev_bind_5 = sbhl_module_vars.$sbhl_module$.currentBinding( thread );
            try
            {
              sbhl_search_vars.$sbhl_search_module$.bind( sbhl_module_vars.get_sbhl_module( $const25$genls ), thread );
              sbhl_search_vars.$sbhl_search_module_type$.bind( sbhl_module_utilities.get_sbhl_module_type( sbhl_module_vars.get_sbhl_module( $const25$genls ) ), thread );
              sbhl_search_vars.$sbhl_add_node_to_result_test$.bind( sbhl_module_utilities.get_sbhl_add_node_to_result_test( sbhl_module_vars.get_sbhl_module( $const25$genls ) ), thread );
              sbhl_search_vars.$genl_inverse_mode_p$.bind( NIL, thread );
              sbhl_module_vars.$sbhl_module$.bind( sbhl_module_vars.get_sbhl_module( $const25$genls ), thread );
              if( NIL != sbhl_paranoia.suspend_sbhl_type_checkingP() || NIL != sbhl_module_utilities.apply_sbhl_module_type_test( collection, sbhl_module_vars.get_sbhl_module( UNPROVIDED ) ) )
              {
                final SubLObject _prev_bind_0_$8 = sbhl_search_vars.$sbhl_search_direction$.currentBinding( thread );
                final SubLObject _prev_bind_1_$9 = sbhl_link_vars.$sbhl_link_direction$.currentBinding( thread );
                final SubLObject _prev_bind_2_$11 = sbhl_search_vars.$genl_inverse_mode_p$.currentBinding( thread );
                try
                {
                  sbhl_search_vars.$sbhl_search_direction$.bind( sbhl_search_vars.get_sbhl_forward_search_direction(), thread );
                  sbhl_link_vars.$sbhl_link_direction$.bind( sbhl_module_utilities.sbhl_search_direction_to_link_direction( sbhl_search_vars.get_sbhl_forward_search_direction(), sbhl_module_vars.get_sbhl_module(
                      $const25$genls ) ), thread );
                  sbhl_search_vars.$genl_inverse_mode_p$.bind( NIL, thread );
                  sbhl_marking_utilities.sbhl_mark_node_marked( node_var, UNPROVIDED );
                  while ( NIL != node_var)
                  {
                    final SubLObject super_coll = node_var;
                    final SubLObject node_var_$14 = $const39$typeGenls;
                    final SubLObject deck_type_$15 = $kw29$QUEUE;
                    final SubLObject recur_deck_$16 = deck.create_deck( deck_type_$15 );
                    SubLObject node_and_predicate_mode = NIL;
                    final SubLObject _prev_bind_0_$9 = sbhl_marking_vars.$sbhl_space$.currentBinding( thread );
                    try
                    {
                      sbhl_marking_vars.$sbhl_space$.bind( sbhl_marking_vars.get_sbhl_marking_space(), thread );
                      try
                      {
                        final SubLObject tv_var_$18 = NIL;
                        final SubLObject _prev_bind_0_$10 = sbhl_search_vars.$sbhl_tv$.currentBinding( thread );
                        final SubLObject _prev_bind_1_$10 = sbhl_search_vars.$relevant_sbhl_tv_function$.currentBinding( thread );
                        try
                        {
                          sbhl_search_vars.$sbhl_tv$.bind( ( NIL != tv_var_$18 ) ? tv_var_$18 : sbhl_search_vars.get_sbhl_true_tv(), thread );
                          sbhl_search_vars.$relevant_sbhl_tv_function$.bind( ( NIL != tv_var_$18 ) ? $sym31$RELEVANT_SBHL_TV_IS_GENERAL_TV : sbhl_search_vars.$relevant_sbhl_tv_function$.getDynamicValue( thread ),
                              thread );
                          if( NIL != tv_var_$18 && NIL != sbhl_paranoia.sbhl_object_type_checking_p() && NIL == sbhl_search_vars.sbhl_true_tv_p( tv_var_$18 ) )
                          {
                            final SubLObject pcase_var2 = sbhl_paranoia.$sbhl_type_error_action$.getDynamicValue( thread );
                            if( pcase_var2.eql( $kw32$ERROR ) )
                            {
                              sbhl_paranoia.sbhl_error( ONE_INTEGER, $str33$_A_is_not_a__A, tv_var_$18, $sym34$SBHL_TRUE_TV_P, UNPROVIDED, UNPROVIDED, UNPROVIDED );
                            }
                            else if( pcase_var2.eql( $kw35$CERROR ) )
                            {
                              sbhl_paranoia.sbhl_cerror( ONE_INTEGER, $str36$continue_anyway, $str33$_A_is_not_a__A, tv_var_$18, $sym34$SBHL_TRUE_TV_P, UNPROVIDED, UNPROVIDED, UNPROVIDED );
                            }
                            else if( pcase_var2.eql( $kw37$WARN ) )
                            {
                              Errors.warn( $str33$_A_is_not_a__A, tv_var_$18, $sym34$SBHL_TRUE_TV_P );
                            }
                            else
                            {
                              Errors.warn( $str38$_A_is_not_a_valid__sbhl_type_erro, sbhl_paranoia.$sbhl_type_error_action$.getDynamicValue( thread ) );
                              Errors.cerror( $str36$continue_anyway, $str33$_A_is_not_a__A, tv_var_$18, $sym34$SBHL_TRUE_TV_P );
                            }
                          }
                          final SubLObject _prev_bind_0_$11 = sbhl_search_vars.$sbhl_search_module$.currentBinding( thread );
                          final SubLObject _prev_bind_1_$11 = sbhl_search_vars.$sbhl_search_module_type$.currentBinding( thread );
                          final SubLObject _prev_bind_2_$12 = sbhl_search_vars.$sbhl_add_node_to_result_test$.currentBinding( thread );
                          final SubLObject _prev_bind_3_$24 = sbhl_search_vars.$genl_inverse_mode_p$.currentBinding( thread );
                          final SubLObject _prev_bind_4_$25 = sbhl_module_vars.$sbhl_module$.currentBinding( thread );
                          try
                          {
                            sbhl_search_vars.$sbhl_search_module$.bind( sbhl_module_vars.get_sbhl_module( $const41$genlPreds ), thread );
                            sbhl_search_vars.$sbhl_search_module_type$.bind( sbhl_module_utilities.get_sbhl_module_type( sbhl_module_vars.get_sbhl_module( $const41$genlPreds ) ), thread );
                            sbhl_search_vars.$sbhl_add_node_to_result_test$.bind( sbhl_module_utilities.get_sbhl_add_node_to_result_test( sbhl_module_vars.get_sbhl_module( $const41$genlPreds ) ), thread );
                            sbhl_search_vars.$genl_inverse_mode_p$.bind( NIL, thread );
                            sbhl_module_vars.$sbhl_module$.bind( sbhl_module_vars.get_sbhl_module( $const41$genlPreds ), thread );
                            if( NIL != sbhl_paranoia.suspend_sbhl_type_checkingP() || NIL != sbhl_module_utilities.apply_sbhl_module_type_test( $const39$typeGenls, sbhl_module_vars.get_sbhl_module( UNPROVIDED ) ) )
                            {
                              final SubLObject _prev_bind_0_$12 = sbhl_search_vars.$sbhl_search_direction$.currentBinding( thread );
                              final SubLObject _prev_bind_1_$12 = sbhl_link_vars.$sbhl_link_direction$.currentBinding( thread );
                              final SubLObject _prev_bind_2_$13 = sbhl_search_vars.$genl_inverse_mode_p$.currentBinding( thread );
                              try
                              {
                                sbhl_search_vars.$sbhl_search_direction$.bind( sbhl_search_vars.get_sbhl_backward_search_direction(), thread );
                                sbhl_link_vars.$sbhl_link_direction$.bind( sbhl_module_utilities.sbhl_search_direction_to_link_direction( sbhl_search_vars.get_sbhl_backward_search_direction(), sbhl_module_vars
                                    .get_sbhl_module( $const41$genlPreds ) ), thread );
                                sbhl_search_vars.$genl_inverse_mode_p$.bind( NIL, thread );
                                sbhl_marking_utilities.sbhl_mark_node_marked( node_var_$14, UNPROVIDED );
                                for( node_and_predicate_mode = ConsesLow.list( $const39$typeGenls, sbhl_search_vars.genl_inverse_mode_p() ); NIL != node_and_predicate_mode; node_and_predicate_mode = deck.deck_pop(
                                    recur_deck_$16 ) )
                                {
                                  final SubLObject node_var_$15 = node_and_predicate_mode.first();
                                  final SubLObject predicate_mode = conses_high.second( node_and_predicate_mode );
                                  final SubLObject spec_pred = node_var_$15;
                                  final SubLObject _prev_bind_0_$13 = sbhl_search_vars.$genl_inverse_mode_p$.currentBinding( thread );
                                  try
                                  {
                                    sbhl_search_vars.$genl_inverse_mode_p$.bind( predicate_mode, thread );
                                    if( NIL != sbhl_search_utilities.apply_sbhl_add_node_test( sbhl_search_vars.get_sbhl_search_add_node_test(), node_var_$15 ) )
                                    {
                                      SubLObject cdolist_list_var = kb_mapping_utilities.pred_values( super_coll, spec_pred, UNPROVIDED, UNPROVIDED, UNPROVIDED );
                                      SubLObject type_spec = NIL;
                                      type_spec = cdolist_list_var.first();
                                      while ( NIL != cdolist_list_var)
                                      {
                                        final SubLObject item_var = type_spec;
                                        if( NIL == conses_high.member( item_var, type_specs, Symbols.symbol_function( EQUAL ), Symbols.symbol_function( IDENTITY ) ) )
                                        {
                                          type_specs = ConsesLow.cons( item_var, type_specs );
                                        }
                                        cdolist_list_var = cdolist_list_var.rest();
                                        type_spec = cdolist_list_var.first();
                                      }
                                    }
                                    SubLObject cdolist_list_var2;
                                    final SubLObject accessible_modules = cdolist_list_var2 = sbhl_macros.get_sbhl_accessible_modules( sbhl_module_vars.get_sbhl_module( $const41$genlPreds ) );
                                    SubLObject module_var = NIL;
                                    module_var = cdolist_list_var2.first();
                                    while ( NIL != cdolist_list_var2)
                                    {
                                      final SubLObject _prev_bind_0_$14 = sbhl_module_vars.$sbhl_module$.currentBinding( thread );
                                      final SubLObject _prev_bind_1_$13 = sbhl_search_vars.$genl_inverse_mode_p$.currentBinding( thread );
                                      try
                                      {
                                        sbhl_module_vars.$sbhl_module$.bind( module_var, thread );
                                        sbhl_search_vars.$genl_inverse_mode_p$.bind( ( NIL != sbhl_search_vars.flip_genl_inverse_modeP( UNPROVIDED, UNPROVIDED ) ) ? makeBoolean(
                                            NIL == sbhl_search_vars.$genl_inverse_mode_p$.getDynamicValue( thread ) ) : sbhl_search_vars.$genl_inverse_mode_p$.getDynamicValue( thread ), thread );
                                        final SubLObject node = function_terms.naut_to_nart( node_var_$15 );
                                        if( NIL != sbhl_link_vars.sbhl_node_object_p( node ) )
                                        {
                                          final SubLObject d_link = sbhl_graphs.get_sbhl_graph_link( node, sbhl_module_vars.get_sbhl_module( UNPROVIDED ) );
                                          if( NIL != d_link )
                                          {
                                            final SubLObject mt_links = sbhl_links.get_sbhl_mt_links( d_link, sbhl_link_vars.get_sbhl_link_direction(), sbhl_module_vars.get_sbhl_module( UNPROVIDED ) );
                                            if( NIL != mt_links )
                                            {
                                              SubLObject iteration_state;
                                              for( iteration_state = dictionary_contents.do_dictionary_contents_state( dictionary.dictionary_contents( mt_links ) ); NIL == dictionary_contents
                                                  .do_dictionary_contents_doneP( iteration_state ); iteration_state = dictionary_contents.do_dictionary_contents_next( iteration_state ) )
                                              {
                                                thread.resetMultipleValues();
                                                final SubLObject mt_$33 = dictionary_contents.do_dictionary_contents_key_value( iteration_state );
                                                final SubLObject tv_links = thread.secondMultipleValue();
                                                thread.resetMultipleValues();
                                                if( NIL != mt_relevance_macros.relevant_mtP( mt_$33 ) )
                                                {
                                                  final SubLObject _prev_bind_0_$15 = sbhl_link_vars.$sbhl_link_mt$.currentBinding( thread );
                                                  try
                                                  {
                                                    sbhl_link_vars.$sbhl_link_mt$.bind( mt_$33, thread );
                                                    SubLObject iteration_state_$35;
                                                    for( iteration_state_$35 = dictionary_contents.do_dictionary_contents_state( dictionary.dictionary_contents( tv_links ) ); NIL == dictionary_contents
                                                        .do_dictionary_contents_doneP( iteration_state_$35 ); iteration_state_$35 = dictionary_contents.do_dictionary_contents_next( iteration_state_$35 ) )
                                                    {
                                                      thread.resetMultipleValues();
                                                      final SubLObject tv = dictionary_contents.do_dictionary_contents_key_value( iteration_state_$35 );
                                                      final SubLObject link_nodes = thread.secondMultipleValue();
                                                      thread.resetMultipleValues();
                                                      if( NIL != sbhl_search_vars.relevant_sbhl_tvP( tv ) )
                                                      {
                                                        final SubLObject _prev_bind_0_$16 = sbhl_link_vars.$sbhl_link_tv$.currentBinding( thread );
                                                        try
                                                        {
                                                          sbhl_link_vars.$sbhl_link_tv$.bind( tv, thread );
                                                          final SubLObject sol = link_nodes;
                                                          if( NIL != set.set_p( sol ) )
                                                          {
                                                            final SubLObject set_contents_var = set.do_set_internal( sol );
                                                            SubLObject basis_object;
                                                            SubLObject state;
                                                            SubLObject node_vars_link_node;
                                                            for( basis_object = set_contents.do_set_contents_basis_object( set_contents_var ), state = NIL, state = set_contents.do_set_contents_initial_state(
                                                                basis_object, set_contents_var ); NIL == set_contents.do_set_contents_doneP( basis_object, state ); state = set_contents.do_set_contents_update_state(
                                                                    state ) )
                                                            {
                                                              node_vars_link_node = set_contents.do_set_contents_next( basis_object, state );
                                                              if( NIL != set_contents.do_set_contents_element_validP( state, node_vars_link_node ) && NIL == sbhl_marking_utilities.sbhl_search_path_termination_p(
                                                                  node_vars_link_node, UNPROVIDED ) )
                                                              {
                                                                sbhl_marking_utilities.sbhl_mark_node_marked( node_vars_link_node, UNPROVIDED );
                                                                deck.deck_push( ConsesLow.list( node_vars_link_node, sbhl_search_vars.genl_inverse_mode_p() ), recur_deck_$16 );
                                                              }
                                                            }
                                                          }
                                                          else if( sol.isList() )
                                                          {
                                                            SubLObject csome_list_var = sol;
                                                            SubLObject node_vars_link_node2 = NIL;
                                                            node_vars_link_node2 = csome_list_var.first();
                                                            while ( NIL != csome_list_var)
                                                            {
                                                              if( NIL == sbhl_marking_utilities.sbhl_search_path_termination_p( node_vars_link_node2, UNPROVIDED ) )
                                                              {
                                                                sbhl_marking_utilities.sbhl_mark_node_marked( node_vars_link_node2, UNPROVIDED );
                                                                deck.deck_push( ConsesLow.list( node_vars_link_node2, sbhl_search_vars.genl_inverse_mode_p() ), recur_deck_$16 );
                                                              }
                                                              csome_list_var = csome_list_var.rest();
                                                              node_vars_link_node2 = csome_list_var.first();
                                                            }
                                                          }
                                                          else
                                                          {
                                                            Errors.error( $str42$_A_is_neither_SET_P_nor_LISTP_, sol );
                                                          }
                                                        }
                                                        finally
                                                        {
                                                          sbhl_link_vars.$sbhl_link_tv$.rebind( _prev_bind_0_$16, thread );
                                                        }
                                                      }
                                                    }
                                                    dictionary_contents.do_dictionary_contents_finalize( iteration_state_$35 );
                                                  }
                                                  finally
                                                  {
                                                    sbhl_link_vars.$sbhl_link_mt$.rebind( _prev_bind_0_$15, thread );
                                                  }
                                                }
                                              }
                                              dictionary_contents.do_dictionary_contents_finalize( iteration_state );
                                            }
                                          }
                                          else
                                          {
                                            sbhl_paranoia.sbhl_error( FIVE_INTEGER, $str43$attempting_to_bind_direction_link, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED );
                                          }
                                        }
                                        else if( NIL != obsolete.cnat_p( node, UNPROVIDED ) )
                                        {
                                          SubLObject cdolist_list_var_$37;
                                          final SubLObject new_list = cdolist_list_var_$37 = ( ( NIL != sbhl_link_vars.sbhl_randomize_lists_p() ) ? list_utilities.randomize_list( sbhl_module_utilities
                                              .get_sbhl_module_relevant_naut_link_generators( sbhl_link_vars.get_sbhl_link_direction(), sbhl_search_vars.$sbhl_tv$.getDynamicValue( thread ), sbhl_module_vars
                                                  .get_sbhl_module( UNPROVIDED ) ) )
                                              : sbhl_module_utilities.get_sbhl_module_relevant_naut_link_generators( sbhl_link_vars.get_sbhl_link_direction(), sbhl_search_vars.$sbhl_tv$.getDynamicValue( thread ),
                                                  sbhl_module_vars.get_sbhl_module( UNPROVIDED ) ) );
                                          SubLObject generating_fn = NIL;
                                          generating_fn = cdolist_list_var_$37.first();
                                          while ( NIL != cdolist_list_var_$37)
                                          {
                                            final SubLObject _prev_bind_0_$17 = sbhl_link_vars.$sbhl_link_generator$.currentBinding( thread );
                                            try
                                            {
                                              sbhl_link_vars.$sbhl_link_generator$.bind( generating_fn, thread );
                                              final SubLObject sol2;
                                              final SubLObject link_nodes2 = sol2 = Functions.funcall( generating_fn, node );
                                              if( NIL != set.set_p( sol2 ) )
                                              {
                                                final SubLObject set_contents_var2 = set.do_set_internal( sol2 );
                                                SubLObject basis_object2;
                                                SubLObject state2;
                                                SubLObject node_vars_link_node3;
                                                for( basis_object2 = set_contents.do_set_contents_basis_object( set_contents_var2 ), state2 = NIL, state2 = set_contents.do_set_contents_initial_state( basis_object2,
                                                    set_contents_var2 ); NIL == set_contents.do_set_contents_doneP( basis_object2, state2 ); state2 = set_contents.do_set_contents_update_state( state2 ) )
                                                {
                                                  node_vars_link_node3 = set_contents.do_set_contents_next( basis_object2, state2 );
                                                  if( NIL != set_contents.do_set_contents_element_validP( state2, node_vars_link_node3 ) && NIL == sbhl_marking_utilities.sbhl_search_path_termination_p(
                                                      node_vars_link_node3, UNPROVIDED ) )
                                                  {
                                                    sbhl_marking_utilities.sbhl_mark_node_marked( node_vars_link_node3, UNPROVIDED );
                                                    deck.deck_push( ConsesLow.list( node_vars_link_node3, sbhl_search_vars.genl_inverse_mode_p() ), recur_deck_$16 );
                                                  }
                                                }
                                              }
                                              else if( sol2.isList() )
                                              {
                                                SubLObject csome_list_var2 = sol2;
                                                SubLObject node_vars_link_node4 = NIL;
                                                node_vars_link_node4 = csome_list_var2.first();
                                                while ( NIL != csome_list_var2)
                                                {
                                                  if( NIL == sbhl_marking_utilities.sbhl_search_path_termination_p( node_vars_link_node4, UNPROVIDED ) )
                                                  {
                                                    sbhl_marking_utilities.sbhl_mark_node_marked( node_vars_link_node4, UNPROVIDED );
                                                    deck.deck_push( ConsesLow.list( node_vars_link_node4, sbhl_search_vars.genl_inverse_mode_p() ), recur_deck_$16 );
                                                  }
                                                  csome_list_var2 = csome_list_var2.rest();
                                                  node_vars_link_node4 = csome_list_var2.first();
                                                }
                                              }
                                              else
                                              {
                                                Errors.error( $str42$_A_is_neither_SET_P_nor_LISTP_, sol2 );
                                              }
                                            }
                                            finally
                                            {
                                              sbhl_link_vars.$sbhl_link_generator$.rebind( _prev_bind_0_$17, thread );
                                            }
                                            cdolist_list_var_$37 = cdolist_list_var_$37.rest();
                                            generating_fn = cdolist_list_var_$37.first();
                                          }
                                        }
                                      }
                                      finally
                                      {
                                        sbhl_search_vars.$genl_inverse_mode_p$.rebind( _prev_bind_1_$13, thread );
                                        sbhl_module_vars.$sbhl_module$.rebind( _prev_bind_0_$14, thread );
                                      }
                                      cdolist_list_var2 = cdolist_list_var2.rest();
                                      module_var = cdolist_list_var2.first();
                                    }
                                  }
                                  finally
                                  {
                                    sbhl_search_vars.$genl_inverse_mode_p$.rebind( _prev_bind_0_$13, thread );
                                  }
                                }
                              }
                              finally
                              {
                                sbhl_search_vars.$genl_inverse_mode_p$.rebind( _prev_bind_2_$13, thread );
                                sbhl_link_vars.$sbhl_link_direction$.rebind( _prev_bind_1_$12, thread );
                                sbhl_search_vars.$sbhl_search_direction$.rebind( _prev_bind_0_$12, thread );
                              }
                            }
                            else
                            {
                              sbhl_paranoia.sbhl_warn( TWO_INTEGER, $str44$Node__a_does_not_pass_sbhl_type_t, $const39$typeGenls, sbhl_module_utilities.get_sbhl_type_test( sbhl_module_vars.get_sbhl_module(
                                  UNPROVIDED ) ), UNPROVIDED, UNPROVIDED, UNPROVIDED );
                            }
                          }
                          finally
                          {
                            sbhl_module_vars.$sbhl_module$.rebind( _prev_bind_4_$25, thread );
                            sbhl_search_vars.$genl_inverse_mode_p$.rebind( _prev_bind_3_$24, thread );
                            sbhl_search_vars.$sbhl_add_node_to_result_test$.rebind( _prev_bind_2_$12, thread );
                            sbhl_search_vars.$sbhl_search_module_type$.rebind( _prev_bind_1_$11, thread );
                            sbhl_search_vars.$sbhl_search_module$.rebind( _prev_bind_0_$11, thread );
                          }
                        }
                        finally
                        {
                          sbhl_search_vars.$relevant_sbhl_tv_function$.rebind( _prev_bind_1_$10, thread );
                          sbhl_search_vars.$sbhl_tv$.rebind( _prev_bind_0_$10, thread );
                        }
                      }
                      finally
                      {
                        final SubLObject _prev_bind_0_$18 = Threads.$is_thread_performing_cleanupP$.currentBinding( thread );
                        try
                        {
                          Threads.$is_thread_performing_cleanupP$.bind( T, thread );
                          final SubLObject _values = Values.getValuesAsVector();
                          sbhl_marking_vars.free_sbhl_marking_space( sbhl_marking_vars.$sbhl_space$.getDynamicValue( thread ) );
                          Values.restoreValuesFromVector( _values );
                        }
                        finally
                        {
                          Threads.$is_thread_performing_cleanupP$.rebind( _prev_bind_0_$18, thread );
                        }
                      }
                    }
                    finally
                    {
                      sbhl_marking_vars.$sbhl_space$.rebind( _prev_bind_0_$9, thread );
                    }
                    final SubLObject node_var_$16 = $const39$typeGenls;
                    final SubLObject deck_type_$16 = $kw29$QUEUE;
                    final SubLObject recur_deck_$17 = deck.create_deck( deck_type_$16 );
                    node_and_predicate_mode = NIL;
                    final SubLObject _prev_bind_0_$19 = sbhl_marking_vars.$sbhl_space$.currentBinding( thread );
                    try
                    {
                      sbhl_marking_vars.$sbhl_space$.bind( sbhl_marking_vars.get_sbhl_marking_space(), thread );
                      try
                      {
                        final SubLObject tv_var_$19 = NIL;
                        final SubLObject _prev_bind_0_$20 = sbhl_search_vars.$sbhl_tv$.currentBinding( thread );
                        final SubLObject _prev_bind_1_$14 = sbhl_search_vars.$relevant_sbhl_tv_function$.currentBinding( thread );
                        try
                        {
                          sbhl_search_vars.$sbhl_tv$.bind( ( NIL != tv_var_$19 ) ? tv_var_$19 : sbhl_search_vars.get_sbhl_true_tv(), thread );
                          sbhl_search_vars.$relevant_sbhl_tv_function$.bind( ( NIL != tv_var_$19 ) ? $sym31$RELEVANT_SBHL_TV_IS_GENERAL_TV : sbhl_search_vars.$relevant_sbhl_tv_function$.getDynamicValue( thread ),
                              thread );
                          if( NIL != tv_var_$19 && NIL != sbhl_paranoia.sbhl_object_type_checking_p() && NIL == sbhl_search_vars.sbhl_true_tv_p( tv_var_$19 ) )
                          {
                            final SubLObject pcase_var2 = sbhl_paranoia.$sbhl_type_error_action$.getDynamicValue( thread );
                            if( pcase_var2.eql( $kw32$ERROR ) )
                            {
                              sbhl_paranoia.sbhl_error( ONE_INTEGER, $str33$_A_is_not_a__A, tv_var_$19, $sym34$SBHL_TRUE_TV_P, UNPROVIDED, UNPROVIDED, UNPROVIDED );
                            }
                            else if( pcase_var2.eql( $kw35$CERROR ) )
                            {
                              sbhl_paranoia.sbhl_cerror( ONE_INTEGER, $str36$continue_anyway, $str33$_A_is_not_a__A, tv_var_$19, $sym34$SBHL_TRUE_TV_P, UNPROVIDED, UNPROVIDED, UNPROVIDED );
                            }
                            else if( pcase_var2.eql( $kw37$WARN ) )
                            {
                              Errors.warn( $str33$_A_is_not_a__A, tv_var_$19, $sym34$SBHL_TRUE_TV_P );
                            }
                            else
                            {
                              Errors.warn( $str38$_A_is_not_a_valid__sbhl_type_erro, sbhl_paranoia.$sbhl_type_error_action$.getDynamicValue( thread ) );
                              Errors.cerror( $str36$continue_anyway, $str33$_A_is_not_a__A, tv_var_$19, $sym34$SBHL_TRUE_TV_P );
                            }
                          }
                          final SubLObject _prev_bind_0_$21 = sbhl_search_vars.$sbhl_search_module$.currentBinding( thread );
                          final SubLObject _prev_bind_1_$15 = sbhl_search_vars.$sbhl_search_module_type$.currentBinding( thread );
                          final SubLObject _prev_bind_2_$14 = sbhl_search_vars.$sbhl_add_node_to_result_test$.currentBinding( thread );
                          final SubLObject _prev_bind_3_$25 = sbhl_search_vars.$genl_inverse_mode_p$.currentBinding( thread );
                          final SubLObject _prev_bind_4_$26 = sbhl_module_vars.$sbhl_module$.currentBinding( thread );
                          try
                          {
                            sbhl_search_vars.$sbhl_search_module$.bind( sbhl_module_vars.get_sbhl_module( $const45$genlInverse ), thread );
                            sbhl_search_vars.$sbhl_search_module_type$.bind( sbhl_module_utilities.get_sbhl_module_type( sbhl_module_vars.get_sbhl_module( $const45$genlInverse ) ), thread );
                            sbhl_search_vars.$sbhl_add_node_to_result_test$.bind( sbhl_module_utilities.get_sbhl_add_node_to_result_test( sbhl_module_vars.get_sbhl_module( $const45$genlInverse ) ), thread );
                            sbhl_search_vars.$genl_inverse_mode_p$.bind( NIL, thread );
                            sbhl_module_vars.$sbhl_module$.bind( sbhl_module_vars.get_sbhl_module( $const45$genlInverse ), thread );
                            if( NIL != sbhl_paranoia.suspend_sbhl_type_checkingP() || NIL != sbhl_module_utilities.apply_sbhl_module_type_test( $const39$typeGenls, sbhl_module_vars.get_sbhl_module( UNPROVIDED ) ) )
                            {
                              final SubLObject _prev_bind_0_$22 = sbhl_search_vars.$sbhl_search_direction$.currentBinding( thread );
                              final SubLObject _prev_bind_1_$16 = sbhl_link_vars.$sbhl_link_direction$.currentBinding( thread );
                              final SubLObject _prev_bind_2_$15 = sbhl_search_vars.$genl_inverse_mode_p$.currentBinding( thread );
                              try
                              {
                                sbhl_search_vars.$sbhl_search_direction$.bind( sbhl_search_vars.get_sbhl_backward_search_direction(), thread );
                                sbhl_link_vars.$sbhl_link_direction$.bind( sbhl_module_utilities.sbhl_search_direction_to_link_direction( sbhl_search_vars.get_sbhl_backward_search_direction(), sbhl_module_vars
                                    .get_sbhl_module( $const45$genlInverse ) ), thread );
                                sbhl_search_vars.$genl_inverse_mode_p$.bind( NIL, thread );
                                sbhl_marking_utilities.sbhl_mark_node_marked( node_var_$16, UNPROVIDED );
                                for( node_and_predicate_mode = ConsesLow.list( $const39$typeGenls, sbhl_search_vars.genl_inverse_mode_p() ); NIL != node_and_predicate_mode; node_and_predicate_mode = deck.deck_pop(
                                    recur_deck_$17 ) )
                                {
                                  final SubLObject node_var_$17 = node_and_predicate_mode.first();
                                  final SubLObject predicate_mode = conses_high.second( node_and_predicate_mode );
                                  final SubLObject spec_pred = node_var_$17;
                                  final SubLObject _prev_bind_0_$23 = sbhl_search_vars.$genl_inverse_mode_p$.currentBinding( thread );
                                  try
                                  {
                                    sbhl_search_vars.$genl_inverse_mode_p$.bind( predicate_mode, thread );
                                    if( NIL != sbhl_search_utilities.apply_sbhl_add_node_test( sbhl_search_vars.get_sbhl_search_add_node_test(), node_var_$17 ) )
                                    {
                                      SubLObject cdolist_list_var = kb_mapping_utilities.pred_values( super_coll, spec_pred, TWO_INTEGER, ONE_INTEGER, UNPROVIDED );
                                      SubLObject type_spec = NIL;
                                      type_spec = cdolist_list_var.first();
                                      while ( NIL != cdolist_list_var)
                                      {
                                        final SubLObject item_var = type_spec;
                                        if( NIL == conses_high.member( item_var, type_specs, Symbols.symbol_function( EQUAL ), Symbols.symbol_function( IDENTITY ) ) )
                                        {
                                          type_specs = ConsesLow.cons( item_var, type_specs );
                                        }
                                        cdolist_list_var = cdolist_list_var.rest();
                                        type_spec = cdolist_list_var.first();
                                      }
                                    }
                                    SubLObject cdolist_list_var2;
                                    final SubLObject accessible_modules = cdolist_list_var2 = sbhl_macros.get_sbhl_accessible_modules( sbhl_module_vars.get_sbhl_module( $const45$genlInverse ) );
                                    SubLObject module_var = NIL;
                                    module_var = cdolist_list_var2.first();
                                    while ( NIL != cdolist_list_var2)
                                    {
                                      final SubLObject _prev_bind_0_$24 = sbhl_module_vars.$sbhl_module$.currentBinding( thread );
                                      final SubLObject _prev_bind_1_$17 = sbhl_search_vars.$genl_inverse_mode_p$.currentBinding( thread );
                                      try
                                      {
                                        sbhl_module_vars.$sbhl_module$.bind( module_var, thread );
                                        sbhl_search_vars.$genl_inverse_mode_p$.bind( ( NIL != sbhl_search_vars.flip_genl_inverse_modeP( UNPROVIDED, UNPROVIDED ) ) ? makeBoolean(
                                            NIL == sbhl_search_vars.$genl_inverse_mode_p$.getDynamicValue( thread ) ) : sbhl_search_vars.$genl_inverse_mode_p$.getDynamicValue( thread ), thread );
                                        final SubLObject node = function_terms.naut_to_nart( node_var_$17 );
                                        if( NIL != sbhl_link_vars.sbhl_node_object_p( node ) )
                                        {
                                          final SubLObject d_link = sbhl_graphs.get_sbhl_graph_link( node, sbhl_module_vars.get_sbhl_module( UNPROVIDED ) );
                                          if( NIL != d_link )
                                          {
                                            final SubLObject mt_links = sbhl_links.get_sbhl_mt_links( d_link, sbhl_link_vars.get_sbhl_link_direction(), sbhl_module_vars.get_sbhl_module( UNPROVIDED ) );
                                            if( NIL != mt_links )
                                            {
                                              SubLObject iteration_state;
                                              for( iteration_state = dictionary_contents.do_dictionary_contents_state( dictionary.dictionary_contents( mt_links ) ); NIL == dictionary_contents
                                                  .do_dictionary_contents_doneP( iteration_state ); iteration_state = dictionary_contents.do_dictionary_contents_next( iteration_state ) )
                                              {
                                                thread.resetMultipleValues();
                                                final SubLObject mt_$34 = dictionary_contents.do_dictionary_contents_key_value( iteration_state );
                                                final SubLObject tv_links = thread.secondMultipleValue();
                                                thread.resetMultipleValues();
                                                if( NIL != mt_relevance_macros.relevant_mtP( mt_$34 ) )
                                                {
                                                  final SubLObject _prev_bind_0_$25 = sbhl_link_vars.$sbhl_link_mt$.currentBinding( thread );
                                                  try
                                                  {
                                                    sbhl_link_vars.$sbhl_link_mt$.bind( mt_$34, thread );
                                                    SubLObject iteration_state_$36;
                                                    for( iteration_state_$36 = dictionary_contents.do_dictionary_contents_state( dictionary.dictionary_contents( tv_links ) ); NIL == dictionary_contents
                                                        .do_dictionary_contents_doneP( iteration_state_$36 ); iteration_state_$36 = dictionary_contents.do_dictionary_contents_next( iteration_state_$36 ) )
                                                    {
                                                      thread.resetMultipleValues();
                                                      final SubLObject tv = dictionary_contents.do_dictionary_contents_key_value( iteration_state_$36 );
                                                      final SubLObject link_nodes = thread.secondMultipleValue();
                                                      thread.resetMultipleValues();
                                                      if( NIL != sbhl_search_vars.relevant_sbhl_tvP( tv ) )
                                                      {
                                                        final SubLObject _prev_bind_0_$26 = sbhl_link_vars.$sbhl_link_tv$.currentBinding( thread );
                                                        try
                                                        {
                                                          sbhl_link_vars.$sbhl_link_tv$.bind( tv, thread );
                                                          final SubLObject sol = link_nodes;
                                                          if( NIL != set.set_p( sol ) )
                                                          {
                                                            final SubLObject set_contents_var = set.do_set_internal( sol );
                                                            SubLObject basis_object;
                                                            SubLObject state;
                                                            SubLObject node_vars_link_node;
                                                            for( basis_object = set_contents.do_set_contents_basis_object( set_contents_var ), state = NIL, state = set_contents.do_set_contents_initial_state(
                                                                basis_object, set_contents_var ); NIL == set_contents.do_set_contents_doneP( basis_object, state ); state = set_contents.do_set_contents_update_state(
                                                                    state ) )
                                                            {
                                                              node_vars_link_node = set_contents.do_set_contents_next( basis_object, state );
                                                              if( NIL != set_contents.do_set_contents_element_validP( state, node_vars_link_node ) && NIL == sbhl_marking_utilities.sbhl_search_path_termination_p(
                                                                  node_vars_link_node, UNPROVIDED ) )
                                                              {
                                                                sbhl_marking_utilities.sbhl_mark_node_marked( node_vars_link_node, UNPROVIDED );
                                                                deck.deck_push( ConsesLow.list( node_vars_link_node, sbhl_search_vars.genl_inverse_mode_p() ), recur_deck_$17 );
                                                              }
                                                            }
                                                          }
                                                          else if( sol.isList() )
                                                          {
                                                            SubLObject csome_list_var = sol;
                                                            SubLObject node_vars_link_node2 = NIL;
                                                            node_vars_link_node2 = csome_list_var.first();
                                                            while ( NIL != csome_list_var)
                                                            {
                                                              if( NIL == sbhl_marking_utilities.sbhl_search_path_termination_p( node_vars_link_node2, UNPROVIDED ) )
                                                              {
                                                                sbhl_marking_utilities.sbhl_mark_node_marked( node_vars_link_node2, UNPROVIDED );
                                                                deck.deck_push( ConsesLow.list( node_vars_link_node2, sbhl_search_vars.genl_inverse_mode_p() ), recur_deck_$17 );
                                                              }
                                                              csome_list_var = csome_list_var.rest();
                                                              node_vars_link_node2 = csome_list_var.first();
                                                            }
                                                          }
                                                          else
                                                          {
                                                            Errors.error( $str42$_A_is_neither_SET_P_nor_LISTP_, sol );
                                                          }
                                                        }
                                                        finally
                                                        {
                                                          sbhl_link_vars.$sbhl_link_tv$.rebind( _prev_bind_0_$26, thread );
                                                        }
                                                      }
                                                    }
                                                    dictionary_contents.do_dictionary_contents_finalize( iteration_state_$36 );
                                                  }
                                                  finally
                                                  {
                                                    sbhl_link_vars.$sbhl_link_mt$.rebind( _prev_bind_0_$25, thread );
                                                  }
                                                }
                                              }
                                              dictionary_contents.do_dictionary_contents_finalize( iteration_state );
                                            }
                                          }
                                          else
                                          {
                                            sbhl_paranoia.sbhl_error( FIVE_INTEGER, $str43$attempting_to_bind_direction_link, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED );
                                          }
                                        }
                                        else if( NIL != obsolete.cnat_p( node, UNPROVIDED ) )
                                        {
                                          SubLObject cdolist_list_var_$38;
                                          final SubLObject new_list = cdolist_list_var_$38 = ( ( NIL != sbhl_link_vars.sbhl_randomize_lists_p() ) ? list_utilities.randomize_list( sbhl_module_utilities
                                              .get_sbhl_module_relevant_naut_link_generators( sbhl_link_vars.get_sbhl_link_direction(), sbhl_search_vars.$sbhl_tv$.getDynamicValue( thread ), sbhl_module_vars
                                                  .get_sbhl_module( UNPROVIDED ) ) )
                                              : sbhl_module_utilities.get_sbhl_module_relevant_naut_link_generators( sbhl_link_vars.get_sbhl_link_direction(), sbhl_search_vars.$sbhl_tv$.getDynamicValue( thread ),
                                                  sbhl_module_vars.get_sbhl_module( UNPROVIDED ) ) );
                                          SubLObject generating_fn = NIL;
                                          generating_fn = cdolist_list_var_$38.first();
                                          while ( NIL != cdolist_list_var_$38)
                                          {
                                            final SubLObject _prev_bind_0_$27 = sbhl_link_vars.$sbhl_link_generator$.currentBinding( thread );
                                            try
                                            {
                                              sbhl_link_vars.$sbhl_link_generator$.bind( generating_fn, thread );
                                              final SubLObject sol2;
                                              final SubLObject link_nodes2 = sol2 = Functions.funcall( generating_fn, node );
                                              if( NIL != set.set_p( sol2 ) )
                                              {
                                                final SubLObject set_contents_var2 = set.do_set_internal( sol2 );
                                                SubLObject basis_object2;
                                                SubLObject state2;
                                                SubLObject node_vars_link_node3;
                                                for( basis_object2 = set_contents.do_set_contents_basis_object( set_contents_var2 ), state2 = NIL, state2 = set_contents.do_set_contents_initial_state( basis_object2,
                                                    set_contents_var2 ); NIL == set_contents.do_set_contents_doneP( basis_object2, state2 ); state2 = set_contents.do_set_contents_update_state( state2 ) )
                                                {
                                                  node_vars_link_node3 = set_contents.do_set_contents_next( basis_object2, state2 );
                                                  if( NIL != set_contents.do_set_contents_element_validP( state2, node_vars_link_node3 ) && NIL == sbhl_marking_utilities.sbhl_search_path_termination_p(
                                                      node_vars_link_node3, UNPROVIDED ) )
                                                  {
                                                    sbhl_marking_utilities.sbhl_mark_node_marked( node_vars_link_node3, UNPROVIDED );
                                                    deck.deck_push( ConsesLow.list( node_vars_link_node3, sbhl_search_vars.genl_inverse_mode_p() ), recur_deck_$17 );
                                                  }
                                                }
                                              }
                                              else if( sol2.isList() )
                                              {
                                                SubLObject csome_list_var2 = sol2;
                                                SubLObject node_vars_link_node4 = NIL;
                                                node_vars_link_node4 = csome_list_var2.first();
                                                while ( NIL != csome_list_var2)
                                                {
                                                  if( NIL == sbhl_marking_utilities.sbhl_search_path_termination_p( node_vars_link_node4, UNPROVIDED ) )
                                                  {
                                                    sbhl_marking_utilities.sbhl_mark_node_marked( node_vars_link_node4, UNPROVIDED );
                                                    deck.deck_push( ConsesLow.list( node_vars_link_node4, sbhl_search_vars.genl_inverse_mode_p() ), recur_deck_$17 );
                                                  }
                                                  csome_list_var2 = csome_list_var2.rest();
                                                  node_vars_link_node4 = csome_list_var2.first();
                                                }
                                              }
                                              else
                                              {
                                                Errors.error( $str42$_A_is_neither_SET_P_nor_LISTP_, sol2 );
                                              }
                                            }
                                            finally
                                            {
                                              sbhl_link_vars.$sbhl_link_generator$.rebind( _prev_bind_0_$27, thread );
                                            }
                                            cdolist_list_var_$38 = cdolist_list_var_$38.rest();
                                            generating_fn = cdolist_list_var_$38.first();
                                          }
                                        }
                                      }
                                      finally
                                      {
                                        sbhl_search_vars.$genl_inverse_mode_p$.rebind( _prev_bind_1_$17, thread );
                                        sbhl_module_vars.$sbhl_module$.rebind( _prev_bind_0_$24, thread );
                                      }
                                      cdolist_list_var2 = cdolist_list_var2.rest();
                                      module_var = cdolist_list_var2.first();
                                    }
                                  }
                                  finally
                                  {
                                    sbhl_search_vars.$genl_inverse_mode_p$.rebind( _prev_bind_0_$23, thread );
                                  }
                                }
                              }
                              finally
                              {
                                sbhl_search_vars.$genl_inverse_mode_p$.rebind( _prev_bind_2_$15, thread );
                                sbhl_link_vars.$sbhl_link_direction$.rebind( _prev_bind_1_$16, thread );
                                sbhl_search_vars.$sbhl_search_direction$.rebind( _prev_bind_0_$22, thread );
                              }
                            }
                            else
                            {
                              sbhl_paranoia.sbhl_warn( TWO_INTEGER, $str44$Node__a_does_not_pass_sbhl_type_t, $const39$typeGenls, sbhl_module_utilities.get_sbhl_type_test( sbhl_module_vars.get_sbhl_module(
                                  UNPROVIDED ) ), UNPROVIDED, UNPROVIDED, UNPROVIDED );
                            }
                          }
                          finally
                          {
                            sbhl_module_vars.$sbhl_module$.rebind( _prev_bind_4_$26, thread );
                            sbhl_search_vars.$genl_inverse_mode_p$.rebind( _prev_bind_3_$25, thread );
                            sbhl_search_vars.$sbhl_add_node_to_result_test$.rebind( _prev_bind_2_$14, thread );
                            sbhl_search_vars.$sbhl_search_module_type$.rebind( _prev_bind_1_$15, thread );
                            sbhl_search_vars.$sbhl_search_module$.rebind( _prev_bind_0_$21, thread );
                          }
                        }
                        finally
                        {
                          sbhl_search_vars.$relevant_sbhl_tv_function$.rebind( _prev_bind_1_$14, thread );
                          sbhl_search_vars.$sbhl_tv$.rebind( _prev_bind_0_$20, thread );
                        }
                      }
                      finally
                      {
                        final SubLObject _prev_bind_0_$28 = Threads.$is_thread_performing_cleanupP$.currentBinding( thread );
                        try
                        {
                          Threads.$is_thread_performing_cleanupP$.bind( T, thread );
                          final SubLObject _values2 = Values.getValuesAsVector();
                          sbhl_marking_vars.free_sbhl_marking_space( sbhl_marking_vars.$sbhl_space$.getDynamicValue( thread ) );
                          Values.restoreValuesFromVector( _values2 );
                        }
                        finally
                        {
                          Threads.$is_thread_performing_cleanupP$.rebind( _prev_bind_0_$28, thread );
                        }
                      }
                    }
                    finally
                    {
                      sbhl_marking_vars.$sbhl_space$.rebind( _prev_bind_0_$19, thread );
                    }
                    SubLObject cdolist_list_var3;
                    final SubLObject accessible_modules2 = cdolist_list_var3 = sbhl_macros.get_sbhl_accessible_modules( sbhl_module_vars.get_sbhl_module( $const25$genls ) );
                    SubLObject module_var2 = NIL;
                    module_var2 = cdolist_list_var3.first();
                    while ( NIL != cdolist_list_var3)
                    {
                      final SubLObject _prev_bind_0_$29 = sbhl_module_vars.$sbhl_module$.currentBinding( thread );
                      final SubLObject _prev_bind_1_$18 = sbhl_search_vars.$genl_inverse_mode_p$.currentBinding( thread );
                      try
                      {
                        sbhl_module_vars.$sbhl_module$.bind( module_var2, thread );
                        sbhl_search_vars.$genl_inverse_mode_p$.bind( ( NIL != sbhl_search_vars.flip_genl_inverse_modeP( UNPROVIDED, UNPROVIDED ) ) ? makeBoolean( NIL == sbhl_search_vars.$genl_inverse_mode_p$
                            .getDynamicValue( thread ) ) : sbhl_search_vars.$genl_inverse_mode_p$.getDynamicValue( thread ), thread );
                        final SubLObject node2 = function_terms.naut_to_nart( node_var );
                        if( NIL != sbhl_link_vars.sbhl_node_object_p( node2 ) )
                        {
                          final SubLObject d_link2 = sbhl_graphs.get_sbhl_graph_link( node2, sbhl_module_vars.get_sbhl_module( UNPROVIDED ) );
                          if( NIL != d_link2 )
                          {
                            final SubLObject mt_links2 = sbhl_links.get_sbhl_mt_links( d_link2, sbhl_link_vars.get_sbhl_link_direction(), sbhl_module_vars.get_sbhl_module( UNPROVIDED ) );
                            if( NIL != mt_links2 )
                            {
                              SubLObject iteration_state2;
                              for( iteration_state2 = dictionary_contents.do_dictionary_contents_state( dictionary.dictionary_contents( mt_links2 ) ); NIL == dictionary_contents.do_dictionary_contents_doneP(
                                  iteration_state2 ); iteration_state2 = dictionary_contents.do_dictionary_contents_next( iteration_state2 ) )
                              {
                                thread.resetMultipleValues();
                                final SubLObject mt_$35 = dictionary_contents.do_dictionary_contents_key_value( iteration_state2 );
                                final SubLObject tv_links2 = thread.secondMultipleValue();
                                thread.resetMultipleValues();
                                if( NIL != mt_relevance_macros.relevant_mtP( mt_$35 ) )
                                {
                                  final SubLObject _prev_bind_0_$30 = sbhl_link_vars.$sbhl_link_mt$.currentBinding( thread );
                                  try
                                  {
                                    sbhl_link_vars.$sbhl_link_mt$.bind( mt_$35, thread );
                                    SubLObject iteration_state_$37;
                                    for( iteration_state_$37 = dictionary_contents.do_dictionary_contents_state( dictionary.dictionary_contents( tv_links2 ) ); NIL == dictionary_contents.do_dictionary_contents_doneP(
                                        iteration_state_$37 ); iteration_state_$37 = dictionary_contents.do_dictionary_contents_next( iteration_state_$37 ) )
                                    {
                                      thread.resetMultipleValues();
                                      final SubLObject tv2 = dictionary_contents.do_dictionary_contents_key_value( iteration_state_$37 );
                                      final SubLObject link_nodes3 = thread.secondMultipleValue();
                                      thread.resetMultipleValues();
                                      if( NIL != sbhl_search_vars.relevant_sbhl_tvP( tv2 ) )
                                      {
                                        final SubLObject _prev_bind_0_$31 = sbhl_link_vars.$sbhl_link_tv$.currentBinding( thread );
                                        try
                                        {
                                          sbhl_link_vars.$sbhl_link_tv$.bind( tv2, thread );
                                          final SubLObject sol3 = link_nodes3;
                                          if( NIL != set.set_p( sol3 ) )
                                          {
                                            final SubLObject set_contents_var3 = set.do_set_internal( sol3 );
                                            SubLObject basis_object3;
                                            SubLObject state3;
                                            SubLObject node_vars_link_node5;
                                            for( basis_object3 = set_contents.do_set_contents_basis_object( set_contents_var3 ), state3 = NIL, state3 = set_contents.do_set_contents_initial_state( basis_object3,
                                                set_contents_var3 ); NIL == set_contents.do_set_contents_doneP( basis_object3, state3 ); state3 = set_contents.do_set_contents_update_state( state3 ) )
                                            {
                                              node_vars_link_node5 = set_contents.do_set_contents_next( basis_object3, state3 );
                                              if( NIL != set_contents.do_set_contents_element_validP( state3, node_vars_link_node5 ) && NIL == sbhl_marking_utilities.sbhl_search_path_termination_p( node_vars_link_node5,
                                                  UNPROVIDED ) )
                                              {
                                                sbhl_marking_utilities.sbhl_mark_node_marked( node_vars_link_node5, UNPROVIDED );
                                                deck.deck_push( node_vars_link_node5, recur_deck );
                                              }
                                            }
                                          }
                                          else if( sol3.isList() )
                                          {
                                            SubLObject csome_list_var3 = sol3;
                                            SubLObject node_vars_link_node6 = NIL;
                                            node_vars_link_node6 = csome_list_var3.first();
                                            while ( NIL != csome_list_var3)
                                            {
                                              if( NIL == sbhl_marking_utilities.sbhl_search_path_termination_p( node_vars_link_node6, UNPROVIDED ) )
                                              {
                                                sbhl_marking_utilities.sbhl_mark_node_marked( node_vars_link_node6, UNPROVIDED );
                                                deck.deck_push( node_vars_link_node6, recur_deck );
                                              }
                                              csome_list_var3 = csome_list_var3.rest();
                                              node_vars_link_node6 = csome_list_var3.first();
                                            }
                                          }
                                          else
                                          {
                                            Errors.error( $str42$_A_is_neither_SET_P_nor_LISTP_, sol3 );
                                          }
                                        }
                                        finally
                                        {
                                          sbhl_link_vars.$sbhl_link_tv$.rebind( _prev_bind_0_$31, thread );
                                        }
                                      }
                                    }
                                    dictionary_contents.do_dictionary_contents_finalize( iteration_state_$37 );
                                  }
                                  finally
                                  {
                                    sbhl_link_vars.$sbhl_link_mt$.rebind( _prev_bind_0_$30, thread );
                                  }
                                }
                              }
                              dictionary_contents.do_dictionary_contents_finalize( iteration_state2 );
                            }
                          }
                          else
                          {
                            sbhl_paranoia.sbhl_error( FIVE_INTEGER, $str43$attempting_to_bind_direction_link, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED );
                          }
                        }
                        else if( NIL != obsolete.cnat_p( node2, UNPROVIDED ) )
                        {
                          SubLObject cdolist_list_var_$39;
                          final SubLObject new_list2 = cdolist_list_var_$39 = ( ( NIL != sbhl_link_vars.sbhl_randomize_lists_p() ) ? list_utilities.randomize_list( sbhl_module_utilities
                              .get_sbhl_module_relevant_naut_link_generators( sbhl_link_vars.get_sbhl_link_direction(), sbhl_search_vars.$sbhl_tv$.getDynamicValue( thread ), sbhl_module_vars.get_sbhl_module(
                                  UNPROVIDED ) ) )
                              : sbhl_module_utilities.get_sbhl_module_relevant_naut_link_generators( sbhl_link_vars.get_sbhl_link_direction(), sbhl_search_vars.$sbhl_tv$.getDynamicValue( thread ), sbhl_module_vars
                                  .get_sbhl_module( UNPROVIDED ) ) );
                          SubLObject generating_fn2 = NIL;
                          generating_fn2 = cdolist_list_var_$39.first();
                          while ( NIL != cdolist_list_var_$39)
                          {
                            final SubLObject _prev_bind_0_$32 = sbhl_link_vars.$sbhl_link_generator$.currentBinding( thread );
                            try
                            {
                              sbhl_link_vars.$sbhl_link_generator$.bind( generating_fn2, thread );
                              final SubLObject sol4;
                              final SubLObject link_nodes4 = sol4 = Functions.funcall( generating_fn2, node2 );
                              if( NIL != set.set_p( sol4 ) )
                              {
                                final SubLObject set_contents_var4 = set.do_set_internal( sol4 );
                                SubLObject basis_object4;
                                SubLObject state4;
                                SubLObject node_vars_link_node7;
                                for( basis_object4 = set_contents.do_set_contents_basis_object( set_contents_var4 ), state4 = NIL, state4 = set_contents.do_set_contents_initial_state( basis_object4,
                                    set_contents_var4 ); NIL == set_contents.do_set_contents_doneP( basis_object4, state4 ); state4 = set_contents.do_set_contents_update_state( state4 ) )
                                {
                                  node_vars_link_node7 = set_contents.do_set_contents_next( basis_object4, state4 );
                                  if( NIL != set_contents.do_set_contents_element_validP( state4, node_vars_link_node7 ) && NIL == sbhl_marking_utilities.sbhl_search_path_termination_p( node_vars_link_node7,
                                      UNPROVIDED ) )
                                  {
                                    sbhl_marking_utilities.sbhl_mark_node_marked( node_vars_link_node7, UNPROVIDED );
                                    deck.deck_push( node_vars_link_node7, recur_deck );
                                  }
                                }
                              }
                              else if( sol4.isList() )
                              {
                                SubLObject csome_list_var4 = sol4;
                                SubLObject node_vars_link_node8 = NIL;
                                node_vars_link_node8 = csome_list_var4.first();
                                while ( NIL != csome_list_var4)
                                {
                                  if( NIL == sbhl_marking_utilities.sbhl_search_path_termination_p( node_vars_link_node8, UNPROVIDED ) )
                                  {
                                    sbhl_marking_utilities.sbhl_mark_node_marked( node_vars_link_node8, UNPROVIDED );
                                    deck.deck_push( node_vars_link_node8, recur_deck );
                                  }
                                  csome_list_var4 = csome_list_var4.rest();
                                  node_vars_link_node8 = csome_list_var4.first();
                                }
                              }
                              else
                              {
                                Errors.error( $str42$_A_is_neither_SET_P_nor_LISTP_, sol4 );
                              }
                            }
                            finally
                            {
                              sbhl_link_vars.$sbhl_link_generator$.rebind( _prev_bind_0_$32, thread );
                            }
                            cdolist_list_var_$39 = cdolist_list_var_$39.rest();
                            generating_fn2 = cdolist_list_var_$39.first();
                          }
                        }
                      }
                      finally
                      {
                        sbhl_search_vars.$genl_inverse_mode_p$.rebind( _prev_bind_1_$18, thread );
                        sbhl_module_vars.$sbhl_module$.rebind( _prev_bind_0_$29, thread );
                      }
                      cdolist_list_var3 = cdolist_list_var3.rest();
                      module_var2 = cdolist_list_var3.first();
                    }
                    node_var = deck.deck_pop( recur_deck );
                  }
                }
                finally
                {
                  sbhl_search_vars.$genl_inverse_mode_p$.rebind( _prev_bind_2_$11, thread );
                  sbhl_link_vars.$sbhl_link_direction$.rebind( _prev_bind_1_$9, thread );
                  sbhl_search_vars.$sbhl_search_direction$.rebind( _prev_bind_0_$8, thread );
                }
              }
              else
              {
                sbhl_paranoia.sbhl_warn( TWO_INTEGER, $str44$Node__a_does_not_pass_sbhl_type_t, collection, sbhl_module_utilities.get_sbhl_type_test( sbhl_module_vars.get_sbhl_module( UNPROVIDED ) ), UNPROVIDED,
                    UNPROVIDED, UNPROVIDED );
              }
            }
            finally
            {
              sbhl_module_vars.$sbhl_module$.rebind( _prev_bind_5, thread );
              sbhl_search_vars.$genl_inverse_mode_p$.rebind( _prev_bind_4, thread );
              sbhl_search_vars.$sbhl_add_node_to_result_test$.rebind( _prev_bind_2_$10, thread );
              sbhl_search_vars.$sbhl_search_module_type$.rebind( _prev_bind_1_$8, thread );
              sbhl_search_vars.$sbhl_search_module$.rebind( _prev_bind_0_$7, thread );
            }
          }
          finally
          {
            sbhl_search_vars.$relevant_sbhl_tv_function$.rebind( _prev_bind_1_$7, thread );
            sbhl_search_vars.$sbhl_tv$.rebind( _prev_bind_0_$6, thread );
          }
        }
        finally
        {
          final SubLObject _prev_bind_0_$33 = Threads.$is_thread_performing_cleanupP$.currentBinding( thread );
          try
          {
            Threads.$is_thread_performing_cleanupP$.bind( T, thread );
            final SubLObject _values3 = Values.getValuesAsVector();
            sbhl_marking_vars.free_sbhl_marking_space( sbhl_marking_vars.$sbhl_space$.getDynamicValue( thread ) );
            Values.restoreValuesFromVector( _values3 );
          }
          finally
          {
            Threads.$is_thread_performing_cleanupP$.rebind( _prev_bind_0_$33, thread );
          }
        }
      }
      finally
      {
        sbhl_marking_vars.$sbhl_space$.rebind( _prev_bind_0_$5, thread );
      }
    }
    finally
    {
      mt_relevance_macros.$relevant_mts$.rebind( _prev_bind_3, thread );
      mt_relevance_macros.$relevant_mt_function$.rebind( _prev_bind_2, thread );
      mt_relevance_macros.$mt$.rebind( _prev_bind_0, thread );
    }
    return type_specs;
  }

  @SubLTranslatedFile.SubL(source = "cycl/rkf-salient-descriptor.lisp", position = 11837L)
  public static SubLObject rkf_salient_descriptor_type_specs(final SubLObject collection, final SubLObject mt)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    final SubLObject v_memoization_state = memoization_state.$memoization_state$.getDynamicValue( thread );
    SubLObject caching_state = NIL;
    if( NIL == v_memoization_state )
    {
      return rkf_salient_descriptor_type_specs_internal( collection, mt );
    }
    caching_state = memoization_state.memoization_state_lookup( v_memoization_state, $sym27$RKF_SALIENT_DESCRIPTOR_TYPE_SPECS, UNPROVIDED );
    if( NIL == caching_state )
    {
      caching_state = memoization_state.create_caching_state( memoization_state.memoization_state_lock( v_memoization_state ), $sym27$RKF_SALIENT_DESCRIPTOR_TYPE_SPECS, TWO_INTEGER, NIL, EQUAL, UNPROVIDED );
      memoization_state.memoization_state_put( v_memoization_state, $sym27$RKF_SALIENT_DESCRIPTOR_TYPE_SPECS, caching_state );
    }
    final SubLObject sxhash = memoization_state.sxhash_calc_2( collection, mt );
    final SubLObject collisions = memoization_state.caching_state_lookup( caching_state, sxhash, UNPROVIDED );
    if( !collisions.eql( memoization_state.$memoized_item_not_found$.getGlobalValue() ) )
    {
      SubLObject cdolist_list_var = collisions;
      SubLObject collision = NIL;
      collision = cdolist_list_var.first();
      while ( NIL != cdolist_list_var)
      {
        SubLObject cached_args = collision.first();
        final SubLObject results2 = conses_high.second( collision );
        if( collection.equal( cached_args.first() ) )
        {
          cached_args = cached_args.rest();
          if( NIL != cached_args && NIL == cached_args.rest() && mt.equal( cached_args.first() ) )
          {
            return memoization_state.caching_results( results2 );
          }
        }
        cdolist_list_var = cdolist_list_var.rest();
        collision = cdolist_list_var.first();
      }
    }
    final SubLObject results3 = Values.arg2( thread.resetMultipleValues(), Values.multiple_value_list( rkf_salient_descriptor_type_specs_internal( collection, mt ) ) );
    memoization_state.caching_state_enter_multi_key_n( caching_state, sxhash, collisions, results3, ConsesLow.list( collection, mt ) );
    return memoization_state.caching_results( results3 );
  }

  @SubLTranslatedFile.SubL(source = "cycl/rkf-salient-descriptor.lisp", position = 12536L)
  public static SubLObject reusing_rkf_sd_problem_store(final SubLObject macroform, final SubLObject environment)
  {
    final SubLObject datum = macroform.rest();
    final SubLObject body;
    final SubLObject current = body = datum;
    final SubLObject reuse_existingP = $sym46$REUSE_EXISTING_;
    final SubLObject store = $sym47$STORE;
    return ConsesLow.list( $sym48$CLET, ConsesLow.list( reader.bq_cons( reuse_existingP, $list49 ), $list50, reader.bq_cons( store, $list51 ) ), ConsesLow.list( $sym52$CUNWIND_PROTECT, reader.bq_cons( $sym53$PROGN,
        ConsesLow.append( body, NIL ) ), ConsesLow.list( $sym54$PUNLESS, reuse_existingP, ConsesLow.list( $sym55$RKF_SD_FREE_PROBLEM_STORE, store ) ) ) );
  }

  @SubLTranslatedFile.SubL(source = "cycl/rkf-salient-descriptor.lisp", position = 12939L)
  public static SubLObject rkf_sd_problem_store_okP(final SubLObject problem_store)
  {
    return makeBoolean( NIL != inference_datastructures_problem_store.valid_problem_store_p( problem_store ) && NIL != rkf_sd_problem_store_checkpoint_currentP( problem_store ) );
  }

  @SubLTranslatedFile.SubL(source = "cycl/rkf-salient-descriptor.lisp", position = 13116L)
  public static SubLObject rkf_sd_problem_store_checkpoint_currentP(final SubLObject problem_store)
  {
    final SubLObject checkpoint = rkf_sd_problem_store_checkpoint( problem_store );
    final SubLObject currentP = makeBoolean( NIL != kb_utilities.theory_checkpoint_p( checkpoint ) && NIL != kb_utilities.theory_checkpoint_currentP( checkpoint ) );
    return currentP;
  }

  @SubLTranslatedFile.SubL(source = "cycl/rkf-salient-descriptor.lisp", position = 13379L)
  public static SubLObject rkf_sd_problem_store_checkpoint(final SubLObject store)
  {
    return dictionary.dictionary_lookup( $rkf_sd_problem_store_checkpoints$.getGlobalValue(), store, $kw56$NOT_FOUND );
  }

  @SubLTranslatedFile.SubL(source = "cycl/rkf-salient-descriptor.lisp", position = 13575L)
  public static SubLObject rkf_sd_find_or_make_problem_store()
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    return ( NIL != $rkf_sd_reuse_problem_storeP$.getDynamicValue( thread ) ) ? ( ( NIL != rkf_sd_problem_store_okP( $rkf_sd_problem_store$.getDynamicValue( thread ) ) ) ? $rkf_sd_problem_store$.getDynamicValue( thread )
        : rkf_sd_make_problem_store() ) : NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/rkf-salient-descriptor.lisp", position = 13801L)
  public static SubLObject rkf_sd_make_problem_store()
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    if( NIL != inference_datastructures_problem_store.problem_store_p( $rkf_sd_problem_store$.getDynamicValue( thread ) ) )
    {
      inference_datastructures_problem_store.destroy_problem_store( $rkf_sd_problem_store$.getDynamicValue( thread ) );
    }
    final SubLObject problem_store = inference_datastructures_problem_store.new_problem_store( rkf_sd_known_problem_store_properties() );
    dictionary.dictionary_enter( $rkf_sd_problem_store_checkpoints$.getGlobalValue(), problem_store, kb_utilities.new_theory_checkpoint() );
    return problem_store;
  }

  @SubLTranslatedFile.SubL(source = "cycl/rkf-salient-descriptor.lisp", position = 14159L)
  public static SubLObject rkf_sd_free_problem_store(final SubLObject store)
  {
    dictionary.dictionary_remove( $rkf_sd_problem_store_checkpoints$.getGlobalValue(), store );
    inference_datastructures_problem_store.destroy_problem_store( store );
    return store;
  }

  @SubLTranslatedFile.SubL(source = "cycl/rkf-salient-descriptor.lisp", position = 14322L)
  public static SubLObject rkf_induced_salient_descriptor_common_properties(final SubLObject induction_basis_properties, final SubLObject mt, SubLObject maximally_generalP, SubLObject rule_type)
  {
    if( maximally_generalP == UNPROVIDED )
    {
      maximally_generalP = NIL;
    }
    if( rule_type == UNPROVIDED )
    {
      rule_type = $kw57$ANY;
    }
    final SubLThread thread = SubLProcess.currentSubLThread();
    SubLObject common_properties = NIL;
    SubLObject basis_properties = NIL;
    SubLObject rule_specs = NIL;
    final SubLObject pcase_var = rule_type;
    if( pcase_var.eql( $kw58$BIN_PRED ) )
    {
      thread.resetMultipleValues();
      final SubLObject common_properties_$75 = rkf_induced_salient_descriptor_bin_pred_properties( induction_basis_properties, mt, maximally_generalP, $kw59$ALL );
      final SubLObject basis_properties_$76 = thread.secondMultipleValue();
      final SubLObject rule_specs_$77 = thread.thirdMultipleValue();
      thread.resetMultipleValues();
      common_properties = common_properties_$75;
      basis_properties = basis_properties_$76;
      rule_specs = rule_specs_$77;
    }
    else if( pcase_var.eql( $kw60$META_ISA ) )
    {
      thread.resetMultipleValues();
      final SubLObject common_properties_$76 = rkf_induced_salient_descriptor_meta_isa_properties( induction_basis_properties, mt, maximally_generalP );
      final SubLObject basis_properties_$77 = thread.secondMultipleValue();
      final SubLObject rule_specs_$78 = thread.thirdMultipleValue();
      thread.resetMultipleValues();
      common_properties = common_properties_$76;
      basis_properties = basis_properties_$77;
      rule_specs = rule_specs_$78;
    }
    else if( pcase_var.eql( $kw57$ANY ) )
    {
      thread.resetMultipleValues();
      final SubLObject common_properties_$77 = rkf_induced_salient_descriptor_common_properties_int( induction_basis_properties, mt, maximally_generalP );
      final SubLObject basis_properties_$78 = thread.secondMultipleValue();
      thread.resetMultipleValues();
      common_properties = common_properties_$77;
      basis_properties = basis_properties_$78;
    }
    else
    {
      Errors.warn( $str61$Can_t_identify__S_common_properti );
    }
    return Values.values( common_properties, basis_properties, rule_specs );
  }

  @SubLTranslatedFile.SubL(source = "cycl/rkf-salient-descriptor.lisp", position = 15901L)
  public static SubLObject rkf_induced_salient_descriptor_common_properties_int(final SubLObject known_properties, final SubLObject mt, final SubLObject maximally_generalP)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    SubLObject v_properties = NIL;
    SubLObject basis_properties = NIL;
    thread.resetMultipleValues();
    final SubLObject bin_pred_properties = rkf_induced_salient_descriptor_bin_pred_properties( known_properties, mt, maximally_generalP, $kw59$ALL );
    final SubLObject bin_pred_basis_properties = thread.secondMultipleValue();
    thread.resetMultipleValues();
    v_properties = ConsesLow.append( v_properties, bin_pred_properties );
    basis_properties = ConsesLow.append( basis_properties, bin_pred_basis_properties );
    thread.resetMultipleValues();
    final SubLObject meta_isa_properties = rkf_induced_salient_descriptor_meta_isa_properties( known_properties, mt, maximally_generalP );
    final SubLObject meta_isa_basis_properties = thread.secondMultipleValue();
    thread.resetMultipleValues();
    v_properties = ConsesLow.append( v_properties, meta_isa_properties );
    basis_properties = ConsesLow.append( basis_properties, meta_isa_basis_properties );
    return Values.values( v_properties, basis_properties );
  }

  @SubLTranslatedFile.SubL(source = "cycl/rkf-salient-descriptor.lisp", position = 16867L)
  public static SubLObject rkf_induced_salient_descriptor_bin_pred_properties(final SubLObject basis_properties, final SubLObject mt, final SubLObject maximally_generalP, final SubLObject strength)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    SubLObject enoughP = NIL;
    SubLObject bin_pred_info = NIL;
    final SubLObject generality_cutoff = $int62$25000;
    final SubLObject reuse_existingP = rkf_sd_problem_store_okP( $rkf_sd_problem_store$.getDynamicValue( thread ) );
    final SubLObject _prev_bind_0 = $rkf_sd_problem_store$.currentBinding( thread );
    try
    {
      $rkf_sd_problem_store$.bind( rkf_sd_find_or_make_problem_store(), thread );
      final SubLObject store = $rkf_sd_problem_store$.getDynamicValue( thread );
      try
      {
        if( NIL == enoughP )
        {
          SubLObject csome_list_var = basis_properties;
          SubLObject basis_property = NIL;
          basis_property = csome_list_var.first();
          while ( NIL == enoughP && NIL != csome_list_var)
          {
            SubLObject cdolist_list_var = rkf_induced_salient_descriptor_bin_pred_info( basis_property, mt, generality_cutoff, strength );
            SubLObject new_info = NIL;
            new_info = cdolist_list_var.first();
            while ( NIL != cdolist_list_var)
            {
              SubLObject current;
              final SubLObject datum = current = new_info;
              SubLObject slot = NIL;
              SubLObject superior = NIL;
              SubLObject isa_or_genls = NIL;
              cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list63 );
              slot = current.first();
              current = current.rest();
              cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list63 );
              superior = current.first();
              current = current.rest();
              cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list63 );
              isa_or_genls = current.first();
              current = current.rest();
              if( NIL == current )
              {
                if( NIL == subl_promotions.memberP( slot, bin_pred_info, Symbols.symbol_function( EQUAL ), Symbols.symbol_function( $sym64$FIRST ) ) )
                {
                  bin_pred_info = ConsesLow.cons( ConsesLow.list( slot, superior, isa_or_genls ), bin_pred_info );
                }
              }
              else
              {
                cdestructuring_bind.cdestructuring_bind_error( datum, $list63 );
              }
              cdolist_list_var = cdolist_list_var.rest();
              new_info = cdolist_list_var.first();
            }
            enoughP = makeBoolean( $rkf_salient_descriptor_number_cutoff$.getDynamicValue( thread ).isNumber() && NIL != list_utilities.lengthGE( bin_pred_info, $rkf_salient_descriptor_number_cutoff$.getDynamicValue(
                thread ), UNPROVIDED ) );
            csome_list_var = csome_list_var.rest();
            basis_property = csome_list_var.first();
          }
        }
      }
      finally
      {
        final SubLObject _prev_bind_0_$83 = Threads.$is_thread_performing_cleanupP$.currentBinding( thread );
        try
        {
          Threads.$is_thread_performing_cleanupP$.bind( T, thread );
          final SubLObject _values = Values.getValuesAsVector();
          if( NIL == reuse_existingP )
          {
            rkf_sd_free_problem_store( store );
          }
          Values.restoreValuesFromVector( _values );
        }
        finally
        {
          Threads.$is_thread_performing_cleanupP$.rebind( _prev_bind_0_$83, thread );
        }
      }
    }
    finally
    {
      $rkf_sd_problem_store$.rebind( _prev_bind_0, thread );
    }
    thread.resetMultipleValues();
    final SubLObject v_properties = rkf_sd_properties_from_bin_pred_info( $rkf_salient_descriptor_number_cutoff$.getDynamicValue( thread ).isNumber() ? list_utilities.first_n( $rkf_salient_descriptor_number_cutoff$
        .getDynamicValue( thread ), bin_pred_info ) : bin_pred_info );
    final SubLObject justifications = thread.secondMultipleValue();
    final SubLObject rule_specs = thread.thirdMultipleValue();
    thread.resetMultipleValues();
    return Values.values( v_properties, justifications, rule_specs );
  }

  @SubLTranslatedFile.SubL(source = "cycl/rkf-salient-descriptor.lisp", position = 17950L)
  public static SubLObject rkf_induced_salient_descriptor_bin_pred_info(final SubLObject basis_property, final SubLObject mt, final SubLObject generality_cutoff, final SubLObject strength)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    SubLObject bin_pred_info = NIL;
    thread.resetMultipleValues();
    final SubLObject superior = rkf_sd_deconstruct_basis_property( basis_property );
    final SubLObject isa_or_genls = thread.secondMultipleValue();
    thread.resetMultipleValues();
    if( NIL != forts.fort_p( superior ) && cardinality_estimates.generality_estimate( superior ).numL( generality_cutoff ) )
    {
      SubLObject cdolist_list_var;
      final SubLObject slot_counts = cdolist_list_var = rkf_induced_salient_descriptor_binary_preds( mt, superior, isa_or_genls, $int65$25, strength, UNPROVIDED );
      SubLObject slot_count = NIL;
      slot_count = cdolist_list_var.first();
      while ( NIL != cdolist_list_var)
      {
        SubLObject current;
        final SubLObject datum = current = slot_count;
        SubLObject slot = NIL;
        SubLObject count = NIL;
        cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list66 );
        slot = current.first();
        current = ( count = current.rest() );
        if( NIL == subl_promotions.memberP( slot, bin_pred_info, Symbols.symbol_function( EQUAL ), Symbols.symbol_function( $sym64$FIRST ) ) )
        {
          bin_pred_info = ConsesLow.cons( ConsesLow.list( slot, superior, isa_or_genls ), bin_pred_info );
        }
        cdolist_list_var = cdolist_list_var.rest();
        slot_count = cdolist_list_var.first();
      }
    }
    return bin_pred_info;
  }

  @SubLTranslatedFile.SubL(source = "cycl/rkf-salient-descriptor.lisp", position = 18748L)
  public static SubLObject rkf_induced_salient_descriptor_meta_isa_properties(final SubLObject basis_properties, final SubLObject mt, final SubLObject maximally_generalP)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    SubLObject enoughP = NIL;
    SubLObject meta_isa_info = NIL;
    final SubLObject generality_cutoff = $int62$25000;
    final SubLObject reuse_existingP = rkf_sd_problem_store_okP( $rkf_sd_problem_store$.getDynamicValue( thread ) );
    final SubLObject _prev_bind_0 = $rkf_sd_problem_store$.currentBinding( thread );
    try
    {
      $rkf_sd_problem_store$.bind( rkf_sd_find_or_make_problem_store(), thread );
      final SubLObject store = $rkf_sd_problem_store$.getDynamicValue( thread );
      try
      {
        final SubLObject known_meta_isas = rkf_known_meta_isas_from_basis_properties( basis_properties, mt );
        if( NIL == enoughP )
        {
          SubLObject csome_list_var = basis_properties;
          SubLObject basis_property = NIL;
          basis_property = csome_list_var.first();
          while ( NIL == enoughP && NIL != csome_list_var)
          {
            SubLObject cdolist_list_var = rkf_induced_salient_descriptor_meta_isa_info( basis_property, mt, generality_cutoff );
            SubLObject new_info = NIL;
            new_info = cdolist_list_var.first();
            while ( NIL != cdolist_list_var)
            {
              SubLObject current;
              final SubLObject datum = current = new_info;
              SubLObject collection_type = NIL;
              SubLObject superior = NIL;
              SubLObject isa_or_genls = NIL;
              cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list67 );
              collection_type = current.first();
              current = current.rest();
              cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list67 );
              superior = current.first();
              current = current.rest();
              cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list67 );
              isa_or_genls = current.first();
              current = current.rest();
              if( NIL == current )
              {
                if( NIL == subl_promotions.memberP( collection_type, meta_isa_info, Symbols.symbol_function( EQUAL ), Symbols.symbol_function( $sym64$FIRST ) ) && NIL == conses_high.member( collection_type,
                    known_meta_isas, Symbols.symbol_function( EQUAL ), UNPROVIDED ) )
                {
                  meta_isa_info = ConsesLow.cons( ConsesLow.list( collection_type, superior, isa_or_genls ), meta_isa_info );
                }
              }
              else
              {
                cdestructuring_bind.cdestructuring_bind_error( datum, $list67 );
              }
              cdolist_list_var = cdolist_list_var.rest();
              new_info = cdolist_list_var.first();
            }
            enoughP = makeBoolean( $rkf_salient_descriptor_number_cutoff$.getDynamicValue( thread ).isNumber() && NIL != list_utilities.lengthGE( meta_isa_info, $rkf_salient_descriptor_number_cutoff$.getDynamicValue(
                thread ), UNPROVIDED ) );
            csome_list_var = csome_list_var.rest();
            basis_property = csome_list_var.first();
          }
        }
      }
      finally
      {
        final SubLObject _prev_bind_0_$84 = Threads.$is_thread_performing_cleanupP$.currentBinding( thread );
        try
        {
          Threads.$is_thread_performing_cleanupP$.bind( T, thread );
          final SubLObject _values = Values.getValuesAsVector();
          if( NIL == reuse_existingP )
          {
            rkf_sd_free_problem_store( store );
          }
          Values.restoreValuesFromVector( _values );
        }
        finally
        {
          Threads.$is_thread_performing_cleanupP$.rebind( _prev_bind_0_$84, thread );
        }
      }
    }
    finally
    {
      $rkf_sd_problem_store$.rebind( _prev_bind_0, thread );
    }
    thread.resetMultipleValues();
    final SubLObject v_properties = rkf_sd_properties_from_meta_isa_info( $rkf_salient_descriptor_number_cutoff$.getDynamicValue( thread ).isNumber() ? list_utilities.first_n( $rkf_salient_descriptor_number_cutoff$
        .getDynamicValue( thread ), meta_isa_info ) : meta_isa_info );
    final SubLObject justifications = thread.secondMultipleValue();
    final SubLObject rule_specs = thread.thirdMultipleValue();
    thread.resetMultipleValues();
    return Values.values( v_properties, justifications, rule_specs );
  }

  @SubLTranslatedFile.SubL(source = "cycl/rkf-salient-descriptor.lisp", position = 20007L)
  public static SubLObject rkf_known_meta_isas_from_basis_properties(final SubLObject basis_properties, final SubLObject mt)
  {
    SubLObject known_meta_isas = NIL;
    SubLObject cdolist_list_var = basis_properties;
    SubLObject basis_property = NIL;
    basis_property = cdolist_list_var.first();
    while ( NIL != cdolist_list_var)
    {
      SubLObject cdolist_list_var_$85 = rkf_known_meta_isas_from_basis_property( basis_property, mt );
      SubLObject known_meta_isa = NIL;
      known_meta_isa = cdolist_list_var_$85.first();
      while ( NIL != cdolist_list_var_$85)
      {
        final SubLObject item_var = known_meta_isa;
        if( NIL == conses_high.member( item_var, known_meta_isas, Symbols.symbol_function( EQL ), Symbols.symbol_function( IDENTITY ) ) )
        {
          known_meta_isas = ConsesLow.cons( item_var, known_meta_isas );
        }
        cdolist_list_var_$85 = cdolist_list_var_$85.rest();
        known_meta_isa = cdolist_list_var_$85.first();
      }
      cdolist_list_var = cdolist_list_var.rest();
      basis_property = cdolist_list_var.first();
    }
    return known_meta_isas;
  }

  @SubLTranslatedFile.SubL(source = "cycl/rkf-salient-descriptor.lisp", position = 20433L)
  public static SubLObject rkf_known_meta_isas_from_basis_property(final SubLObject basis_property, final SubLObject mt)
  {
    if( NIL != formula_pattern_match.formula_matches_pattern( basis_property, $list68 ) )
    {
      final SubLObject lowest_known_isa = cycl_utilities.formula_arg2( basis_property, UNPROVIDED );
      final SubLObject all_known_isas = genls.all_genls( lowest_known_isa, mt, UNPROVIDED );
      SubLObject known_meta_isas = NIL;
      SubLObject cdolist_list_var = all_known_isas;
      SubLObject known_isa = NIL;
      known_isa = cdolist_list_var.first();
      while ( NIL != cdolist_list_var)
      {
        SubLObject cdolist_list_var_$86 = isa.all_isa( known_isa, mt, UNPROVIDED );
        SubLObject known_meta_isa = NIL;
        known_meta_isa = cdolist_list_var_$86.first();
        while ( NIL != cdolist_list_var_$86)
        {
          final SubLObject item_var = known_meta_isa;
          if( NIL == conses_high.member( item_var, known_meta_isas, Symbols.symbol_function( EQL ), Symbols.symbol_function( IDENTITY ) ) )
          {
            known_meta_isas = ConsesLow.cons( item_var, known_meta_isas );
          }
          cdolist_list_var_$86 = cdolist_list_var_$86.rest();
          known_meta_isa = cdolist_list_var_$86.first();
        }
        cdolist_list_var = cdolist_list_var.rest();
        known_isa = cdolist_list_var.first();
      }
      return known_meta_isas;
    }
    final SubLObject v_properties = ConsesLow.list( $kw69$PROBLEM_STORE, rkf_sd_find_or_make_problem_store(), $kw70$ANSWER_LANGUAGE, $kw71$HL, $kw72$CONDITIONAL_SENTENCE_, T );
    final SubLObject meta_isa_var = $sym73$_COLLECTION_TYPE;
    final SubLObject instance_var = $sym74$_INSTANCE;
    final SubLObject basis_sentence = properties.property_to_sentence( basis_property, instance_var );
    final SubLObject query_sentence = ConsesLow.list( $const75$implies, basis_sentence, ConsesLow.list( $const76$thereExists, $sym77$_TYPE, ConsesLow.list( $const78$and, ConsesLow.list( $const24$isa, $sym77$_TYPE,
        meta_isa_var ), ConsesLow.listS( $const24$isa, instance_var, $list79 ) ) ) );
    final SubLObject meta_isas = ask_utilities.query_variable( meta_isa_var, query_sentence, mt, v_properties );
    return meta_isas;
  }

  @SubLTranslatedFile.SubL(source = "cycl/rkf-salient-descriptor.lisp", position = 21612L)
  public static SubLObject rkf_induced_salient_descriptor_meta_isa_info(final SubLObject basis_property, final SubLObject mt, final SubLObject generality_cutoff)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    SubLObject meta_isa_info = NIL;
    thread.resetMultipleValues();
    final SubLObject superior = rkf_sd_deconstruct_basis_property( basis_property );
    final SubLObject isa_or_genls = thread.secondMultipleValue();
    thread.resetMultipleValues();
    if( NIL != forts.fort_p( superior ) && cardinality_estimates.generality_estimate( superior ).numL( generality_cutoff ) )
    {
      SubLObject cdolist_list_var;
      final SubLObject slot_counts = cdolist_list_var = rkf_induced_salient_descriptor_meta_isas( mt, superior, isa_or_genls, UNPROVIDED, UNPROVIDED );
      SubLObject slot_count = NIL;
      slot_count = cdolist_list_var.first();
      while ( NIL != cdolist_list_var)
      {
        SubLObject current;
        final SubLObject datum = current = slot_count;
        SubLObject slot = NIL;
        SubLObject count = NIL;
        cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list66 );
        slot = current.first();
        current = ( count = current.rest() );
        if( NIL == subl_promotions.memberP( slot, meta_isa_info, Symbols.symbol_function( EQUAL ), Symbols.symbol_function( $sym64$FIRST ) ) )
        {
          meta_isa_info = ConsesLow.cons( ConsesLow.list( slot, superior, isa_or_genls ), meta_isa_info );
        }
        cdolist_list_var = cdolist_list_var.rest();
        slot_count = cdolist_list_var.first();
      }
    }
    return meta_isa_info;
  }

  @SubLTranslatedFile.SubL(source = "cycl/rkf-salient-descriptor.lisp", position = 22376L)
  public static SubLObject rkf_sd_deconstruct_basis_property(final SubLObject basis_property)
  {
    final SubLObject v_term = $kw80$TERM;
    final SubLObject sentence = properties.property_to_sentence( basis_property, v_term );
    final SubLObject pcase_var = cycl_utilities.formula_arg0( sentence );
    if( pcase_var.eql( $const24$isa ) )
    {
      return Values.values( cycl_utilities.formula_arg2( sentence, UNPROVIDED ), $kw21$ISA );
    }
    if( pcase_var.eql( $const25$genls ) )
    {
      return Values.values( cycl_utilities.formula_arg2( sentence, UNPROVIDED ), $kw81$GENLS );
    }
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/rkf-salient-descriptor.lisp", position = 22845L)
  public static SubLObject rkf_sd_construct_basis_property(final SubLObject superior, final SubLObject isa_or_genls)
  {
    final SubLObject v_term = $kw80$TERM;
    if( isa_or_genls.eql( $kw21$ISA ) )
    {
      return properties.sentence_to_property( el_utilities.make_binary_formula( $const24$isa, v_term, superior ), v_term );
    }
    if( isa_or_genls.eql( $kw81$GENLS ) )
    {
      return properties.sentence_to_property( el_utilities.make_binary_formula( $const25$genls, v_term, superior ), v_term );
    }
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/rkf-salient-descriptor.lisp", position = 23194L)
  public static SubLObject rkf_sd_properties_from_bin_pred_info(final SubLObject info)
  {
    SubLObject v_properties = NIL;
    SubLObject basis_properties = NIL;
    SubLObject rule_specs = NIL;
    final SubLObject var = $sym23$_X;
    final SubLObject v_term = $kw80$TERM;
    SubLObject cdolist_list_var = info;
    SubLObject item = NIL;
    item = cdolist_list_var.first();
    while ( NIL != cdolist_list_var)
    {
      SubLObject current;
      final SubLObject datum = current = item;
      SubLObject bin_pred = NIL;
      SubLObject superior = NIL;
      SubLObject isa_or_genls = NIL;
      cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list82 );
      bin_pred = current.first();
      current = current.rest();
      cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list82 );
      superior = current.first();
      current = current.rest();
      cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list82 );
      isa_or_genls = current.first();
      current = current.rest();
      if( NIL == current )
      {
        final SubLObject sentence = el_utilities.make_binary_formula( bin_pred, v_term, var );
        final SubLObject property = properties.sentence_to_property( sentence, v_term );
        final SubLObject basis_property = rkf_sd_make_superior_basis_property( superior, isa_or_genls );
        final SubLObject rule_spec = new_rkf_salient_descriptor_rule_spec( $kw58$BIN_PRED, isa_or_genls, superior, bin_pred );
        v_properties = ConsesLow.cons( property, v_properties );
        basis_properties = ConsesLow.cons( basis_property, basis_properties );
        rule_specs = ConsesLow.cons( rule_spec, rule_specs );
      }
      else
      {
        cdestructuring_bind.cdestructuring_bind_error( datum, $list82 );
      }
      cdolist_list_var = cdolist_list_var.rest();
      item = cdolist_list_var.first();
    }
    return Values.values( Sequences.nreverse( v_properties ), Sequences.nreverse( basis_properties ), Sequences.nreverse( rule_specs ) );
  }

  @SubLTranslatedFile.SubL(source = "cycl/rkf-salient-descriptor.lisp", position = 23971L)
  public static SubLObject rkf_sd_properties_from_meta_isa_info(final SubLObject info)
  {
    SubLObject v_properties = NIL;
    SubLObject basis_properties = NIL;
    SubLObject rule_specs = NIL;
    final SubLObject var = $sym77$_TYPE;
    final SubLObject v_term = $kw80$TERM;
    SubLObject cdolist_list_var = info;
    SubLObject item = NIL;
    item = cdolist_list_var.first();
    while ( NIL != cdolist_list_var)
    {
      SubLObject current;
      final SubLObject datum = current = item;
      SubLObject meta_isa = NIL;
      SubLObject superior = NIL;
      SubLObject isa_or_genls = NIL;
      cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list83 );
      meta_isa = current.first();
      current = current.rest();
      cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list83 );
      superior = current.first();
      current = current.rest();
      cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list83 );
      isa_or_genls = current.first();
      current = current.rest();
      if( NIL == current )
      {
        final SubLObject sentence = el_utilities.make_conjunction( ConsesLow.list( el_utilities.make_binary_formula( $const24$isa, v_term, var ), el_utilities.make_binary_formula( $const24$isa, var, meta_isa ) ) );
        final SubLObject property = properties.sentence_to_property( sentence, v_term );
        final SubLObject basis_property = rkf_sd_make_superior_basis_property( superior, isa_or_genls );
        final SubLObject rule_spec = new_rkf_salient_descriptor_rule_spec( $kw60$META_ISA, isa_or_genls, superior, meta_isa );
        v_properties = ConsesLow.cons( property, v_properties );
        basis_properties = ConsesLow.cons( basis_property, basis_properties );
        rule_specs = ConsesLow.cons( rule_spec, rule_specs );
      }
      else
      {
        cdestructuring_bind.cdestructuring_bind_error( datum, $list83 );
      }
      cdolist_list_var = cdolist_list_var.rest();
      item = cdolist_list_var.first();
    }
    return Values.values( Sequences.nreverse( v_properties ), Sequences.nreverse( basis_properties ), Sequences.nreverse( rule_specs ) );
  }

  @SubLTranslatedFile.SubL(source = "cycl/rkf-salient-descriptor.lisp", position = 24827L)
  public static SubLObject rkf_sd_make_superior_basis_property(final SubLObject superior, final SubLObject isa_or_genls)
  {
    return rkf_sd_construct_basis_property( superior, isa_or_genls );
  }

  @SubLTranslatedFile.SubL(source = "cycl/rkf-salient-descriptor.lisp", position = 24969L)
  public static SubLObject rkf_sd_induction_basis_properties(final SubLObject v_term, final SubLObject mt)
  {
    final SubLObject isa_properties = rkf_induced_salient_descriptor_superior_properties( v_term, mt, $kw21$ISA, UNPROVIDED );
    return ( NIL != fort_types_interface.collectionP( v_term ) ) ? ConsesLow.append( isa_properties, rkf_induced_salient_descriptor_superior_properties( v_term, mt, $kw81$GENLS, UNPROVIDED ) ) : isa_properties;
  }

  @SubLTranslatedFile.SubL(source = "cycl/rkf-salient-descriptor.lisp", position = 25444L)
  public static SubLObject rkf_induced_salient_descriptor_superior_properties(final SubLObject v_term, final SubLObject mt, final SubLObject isa_or_genls, SubLObject maximally_generalP)
  {
    if( maximally_generalP == UNPROVIDED )
    {
      maximally_generalP = NIL;
    }
    final SubLThread thread = SubLProcess.currentSubLThread();
    final SubLObject superior_property = ( isa_or_genls == $kw21$ISA ) ? properties.sentence_to_property( ConsesLow.listS( $const24$isa, v_term, $list84 ), $kw85$SUPERIOR )
        : properties.sentence_to_property( ConsesLow.listS( $const25$genls, v_term, $list84 ), $kw85$SUPERIOR );
    final SubLObject query_properties = ConsesLow.list( $kw70$ANSWER_LANGUAGE, $kw71$HL, $kw69$PROBLEM_STORE, rkf_sd_find_or_make_problem_store() );
    final SubLObject all_superiors = properties.property_extent( superior_property, mt, query_properties );
    final SubLObject superiors_cutoff = $rkf_sd_induced_superiors_cutoff$.getDynamicValue( thread );
    final SubLObject sorted_superiors = cardinality_estimates.sort_by_generality_estimate( all_superiors, $kw86$ASCENDING );
    SubLObject superiors = superiors_cutoff.isNumber() ? list_utilities.first_n( superiors_cutoff, sorted_superiors ) : sorted_superiors;
    if( NIL != maximally_generalP )
    {
      superiors = Sequences.nreverse( superiors );
    }
    SubLObject ans = NIL;
    SubLObject cdolist_list_var = superiors;
    SubLObject superior = NIL;
    superior = cdolist_list_var.first();
    while ( NIL != cdolist_list_var)
    {
      ans = ConsesLow.cons( rkf_sd_construct_basis_property( superior, isa_or_genls ), ans );
      cdolist_list_var = cdolist_list_var.rest();
      superior = cdolist_list_var.first();
    }
    return Sequences.nreverse( ans );
  }

  @SubLTranslatedFile.SubL(source = "cycl/rkf-salient-descriptor.lisp", position = 26581L)
  public static SubLObject rkf_induced_salient_descriptor_superiors(final SubLObject v_term, final SubLObject mt, final SubLObject isa_or_genls, final SubLObject maximally_generalP)
  {
    final SubLObject superior_fn = ( isa_or_genls == $kw21$ISA ) ? $sym87$ALL_ISA : $sym88$ALL_GENLS;
    final SubLObject superior_property = ( isa_or_genls == $kw21$ISA ) ? properties.sentence_to_property( ConsesLow.listS( $const24$isa, v_term, $list84 ), $kw85$SUPERIOR )
        : properties.sentence_to_property( ConsesLow.listS( $const25$genls, v_term, $list84 ), $kw85$SUPERIOR );
    final SubLObject superiors_cutoff = FOUR_INTEGER;
    final SubLObject sorted_superiors = cardinality_estimates.sort_by_generality_estimate( Functions.funcall( superior_fn, v_term, mt ), $kw86$ASCENDING );
    SubLObject superiors = list_utilities.first_n( superiors_cutoff, sorted_superiors );
    if( NIL != maximally_generalP )
    {
      superiors = Sequences.nreverse( superiors );
    }
    return superiors;
  }

  @SubLTranslatedFile.SubL(source = "cycl/rkf-salient-descriptor.lisp", position = 27454L)
  public static SubLObject rkf_induced_salient_descriptor_slots(final SubLObject superiors, final SubLObject isa_or_genls, final SubLObject rule_type, final SubLObject mt, SubLObject known_meta_isas)
  {
    if( known_meta_isas == UNPROVIDED )
    {
      known_meta_isas = NIL;
    }
    final SubLThread thread = SubLProcess.currentSubLThread();
    SubLObject enoughP = NIL;
    final SubLObject generality_cutoff = $int62$25000;
    SubLObject v_slots = NIL;
    final SubLObject reuse_existingP = rkf_sd_problem_store_okP( $rkf_sd_problem_store$.getDynamicValue( thread ) );
    final SubLObject _prev_bind_0 = $rkf_sd_problem_store$.currentBinding( thread );
    try
    {
      $rkf_sd_problem_store$.bind( rkf_sd_find_or_make_problem_store(), thread );
      final SubLObject store = $rkf_sd_problem_store$.getDynamicValue( thread );
      try
      {
        if( NIL == enoughP )
        {
          SubLObject csome_list_var = superiors;
          SubLObject superior = NIL;
          superior = csome_list_var.first();
          while ( NIL == enoughP && NIL != csome_list_var)
          {
            if( cardinality_estimates.generality_estimate( superior ).numL( generality_cutoff ) )
            {
              final SubLObject slot_fn = ( rule_type == $kw58$BIN_PRED ) ? $sym89$RKF_INDUCED_SALIENT_DESCRIPTOR_BINARY_PREDS : $sym90$RKF_INDUCED_SALIENT_DESCRIPTOR_META_ISAS;
              final SubLObject slot_args = ( rule_type == $kw58$BIN_PRED ) ? ConsesLow.list( mt, superior, isa_or_genls ) : ConsesLow.list( mt, superior, isa_or_genls, known_meta_isas );
              SubLObject cdolist_list_var;
              final SubLObject slot_counts = cdolist_list_var = Functions.apply( slot_fn, slot_args );
              SubLObject slot_count = NIL;
              slot_count = cdolist_list_var.first();
              while ( NIL != cdolist_list_var)
              {
                SubLObject current;
                final SubLObject datum = current = slot_count;
                SubLObject slot = NIL;
                SubLObject count = NIL;
                cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list66 );
                slot = current.first();
                current = ( count = current.rest() );
                if( NIL == subl_promotions.memberP( slot, v_slots, Symbols.symbol_function( EQUAL ), Symbols.symbol_function( $sym91$CAR ) ) )
                {
                  v_slots = ConsesLow.cons( ConsesLow.cons( slot, superior ), v_slots );
                }
                cdolist_list_var = cdolist_list_var.rest();
                slot_count = cdolist_list_var.first();
              }
              enoughP = makeBoolean( $rkf_salient_descriptor_number_cutoff$.getDynamicValue( thread ).isNumber() && NIL != list_utilities.lengthGE( v_slots, $rkf_salient_descriptor_number_cutoff$.getDynamicValue(
                  thread ), UNPROVIDED ) );
            }
            csome_list_var = csome_list_var.rest();
            superior = csome_list_var.first();
          }
        }
      }
      finally
      {
        final SubLObject _prev_bind_0_$87 = Threads.$is_thread_performing_cleanupP$.currentBinding( thread );
        try
        {
          Threads.$is_thread_performing_cleanupP$.bind( T, thread );
          final SubLObject _values = Values.getValuesAsVector();
          if( NIL == reuse_existingP )
          {
            rkf_sd_free_problem_store( store );
          }
          Values.restoreValuesFromVector( _values );
        }
        finally
        {
          Threads.$is_thread_performing_cleanupP$.rebind( _prev_bind_0_$87, thread );
        }
      }
    }
    finally
    {
      $rkf_sd_problem_store$.rebind( _prev_bind_0, thread );
    }
    return v_slots;
  }

  @SubLTranslatedFile.SubL(source = "cycl/rkf-salient-descriptor.lisp", position = 28627L)
  public static SubLObject rkf_salient_descriptor_specP(final SubLObject col1, final SubLObject col2, SubLObject mt)
  {
    if( mt == UNPROVIDED )
    {
      mt = mt_relevance_macros.$mt$.getDynamicValue();
    }
    return rkf_salient_descriptor_genlP( col2, col1, mt );
  }

  @SubLTranslatedFile.SubL(source = "cycl/rkf-salient-descriptor.lisp", position = 28758L)
  public static SubLObject rkf_salient_descriptor_genlP_internal(final SubLObject col1, final SubLObject col2, final SubLObject mt)
  {
    return genls.genlP( col1, col2, mt, UNPROVIDED );
  }

  @SubLTranslatedFile.SubL(source = "cycl/rkf-salient-descriptor.lisp", position = 28758L)
  public static SubLObject rkf_salient_descriptor_genlP(final SubLObject col1, final SubLObject col2, final SubLObject mt)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    final SubLObject v_memoization_state = memoization_state.$memoization_state$.getDynamicValue( thread );
    SubLObject caching_state = NIL;
    if( NIL == v_memoization_state )
    {
      return rkf_salient_descriptor_genlP_internal( col1, col2, mt );
    }
    caching_state = memoization_state.memoization_state_lookup( v_memoization_state, $sym92$RKF_SALIENT_DESCRIPTOR_GENL_, UNPROVIDED );
    if( NIL == caching_state )
    {
      caching_state = memoization_state.create_caching_state( memoization_state.memoization_state_lock( v_memoization_state ), $sym92$RKF_SALIENT_DESCRIPTOR_GENL_, THREE_INTEGER, NIL, EQUAL, UNPROVIDED );
      memoization_state.memoization_state_put( v_memoization_state, $sym92$RKF_SALIENT_DESCRIPTOR_GENL_, caching_state );
    }
    final SubLObject sxhash = memoization_state.sxhash_calc_3( col1, col2, mt );
    final SubLObject collisions = memoization_state.caching_state_lookup( caching_state, sxhash, UNPROVIDED );
    if( !collisions.eql( memoization_state.$memoized_item_not_found$.getGlobalValue() ) )
    {
      SubLObject cdolist_list_var = collisions;
      SubLObject collision = NIL;
      collision = cdolist_list_var.first();
      while ( NIL != cdolist_list_var)
      {
        SubLObject cached_args = collision.first();
        final SubLObject results2 = conses_high.second( collision );
        if( col1.equal( cached_args.first() ) )
        {
          cached_args = cached_args.rest();
          if( col2.equal( cached_args.first() ) )
          {
            cached_args = cached_args.rest();
            if( NIL != cached_args && NIL == cached_args.rest() && mt.equal( cached_args.first() ) )
            {
              return memoization_state.caching_results( results2 );
            }
          }
        }
        cdolist_list_var = cdolist_list_var.rest();
        collision = cdolist_list_var.first();
      }
    }
    final SubLObject results3 = Values.arg2( thread.resetMultipleValues(), Values.multiple_value_list( rkf_salient_descriptor_genlP_internal( col1, col2, mt ) ) );
    memoization_state.caching_state_enter_multi_key_n( caching_state, sxhash, collisions, results3, ConsesLow.list( col1, col2, mt ) );
    return memoization_state.caching_results( results3 );
  }

  @SubLTranslatedFile.SubL(source = "cycl/rkf-salient-descriptor.lisp", position = 28868L)
  public static SubLObject rkf_salient_descriptor_rule_from_spec(final SubLObject rule_spec, SubLObject mt)
  {
    if( mt == UNPROVIDED )
    {
      mt = control_vars.$rkf_mt$.getDynamicValue();
    }
    SubLObject rule_type = NIL;
    SubLObject isa_or_genls = NIL;
    SubLObject superior = NIL;
    SubLObject slot = NIL;
    cdestructuring_bind.destructuring_bind_must_consp( rule_spec, rule_spec, $list93 );
    rule_type = rule_spec.first();
    SubLObject current = rule_spec.rest();
    cdestructuring_bind.destructuring_bind_must_consp( current, rule_spec, $list93 );
    isa_or_genls = current.first();
    current = current.rest();
    cdestructuring_bind.destructuring_bind_must_consp( current, rule_spec, $list93 );
    superior = current.first();
    current = current.rest();
    cdestructuring_bind.destructuring_bind_must_consp( current, rule_spec, $list93 );
    slot = current.first();
    current = current.rest();
    if( NIL == current )
    {
      final SubLObject default_var = ( isa_or_genls == $kw21$ISA ) ? $sym74$_INSTANCE : $sym94$_SPEC;
      final SubLObject term_var = czer_utilities.unique_el_var_wrt_expression( slot, default_var );
      final SubLObject formula_fn = ( rule_type == $kw58$BIN_PRED ) ? $sym95$RKF_MAKE_BIN_PRED_FORMULA : $sym96$RKF_MAKE_META_ISA_FORMULA;
      final SubLObject consequent = Functions.funcall( formula_fn, term_var, slot );
      final SubLObject rule = rkf_make_salient_descriptor_rule( term_var, superior, consequent, isa_or_genls );
      return rkf_formula_optimizer.rkf_tersify( rule, mt );
    }
    cdestructuring_bind.cdestructuring_bind_error( rule_spec, $list93 );
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/rkf-salient-descriptor.lisp", position = 29462L)
  public static SubLObject rkf_rule_spec_supports(final SubLObject v_term, final SubLObject rule_spec, final SubLObject mt)
  {
    final SubLObject super_sentence = rkf_justification_sentence_from_rule_spec( v_term, rule_spec );
    final SubLObject ask_results = ask_utilities.ask_justified( super_sentence, mt, NIL, UNPROVIDED, UNPROVIDED, UNPROVIDED );
    final SubLObject first_result = ask_results.first();
    SubLObject supports = conses_high.second( first_result );
    final SubLObject induced_rule_support = rkf_induced_rule_support( rule_spec, mt );
    if( NIL != induced_rule_support )
    {
      supports = ConsesLow.cons( induced_rule_support, supports );
    }
    return Sequences.nreverse( supports );
  }

  @SubLTranslatedFile.SubL(source = "cycl/rkf-salient-descriptor.lisp", position = 29904L)
  public static SubLObject rkf_justification_sentence_from_rule_spec(final SubLObject v_term, final SubLObject rule_spec)
  {
    SubLObject current;
    final SubLObject datum = current = rule_spec.rest();
    SubLObject isa_or_genls = NIL;
    SubLObject v_super = NIL;
    SubLObject slot = NIL;
    cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list97 );
    isa_or_genls = current.first();
    current = current.rest();
    cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list97 );
    v_super = current.first();
    current = current.rest();
    cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list97 );
    slot = current.first();
    current = current.rest();
    if( NIL == current )
    {
      final SubLObject super_pred = ( isa_or_genls == $kw21$ISA ) ? $const24$isa : $const25$genls;
      final SubLObject super_sentence = el_utilities.make_binary_formula( super_pred, v_term, v_super );
      return super_sentence;
    }
    cdestructuring_bind.cdestructuring_bind_error( datum, $list97 );
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/rkf-salient-descriptor.lisp", position = 30229L)
  public static SubLObject rkf_induced_rule_support(final SubLObject rule_spec, final SubLObject mt)
  {
    SubLObject rule_type = NIL;
    SubLObject isa_or_genls = NIL;
    SubLObject superior = NIL;
    SubLObject slot = NIL;
    cdestructuring_bind.destructuring_bind_must_consp( rule_spec, rule_spec, $list93 );
    rule_type = rule_spec.first();
    SubLObject current = rule_spec.rest();
    cdestructuring_bind.destructuring_bind_must_consp( current, rule_spec, $list93 );
    isa_or_genls = current.first();
    current = current.rest();
    cdestructuring_bind.destructuring_bind_must_consp( current, rule_spec, $list93 );
    superior = current.first();
    current = current.rest();
    cdestructuring_bind.destructuring_bind_must_consp( current, rule_spec, $list93 );
    slot = current.first();
    current = current.rest();
    if( NIL != current )
    {
      cdestructuring_bind.cdestructuring_bind_error( rule_spec, $list93 );
      return NIL;
    }
    final SubLObject pcase_var = rule_type;
    if( pcase_var.eql( $kw60$META_ISA ) )
    {
      final SubLObject super_pred = ( isa_or_genls == $kw21$ISA ) ? $const24$isa : $const25$genls;
      final SubLObject term_var = $sym23$_X;
      final SubLObject rule_sentence = ConsesLow.list( $const75$implies, ConsesLow.list( super_pred, term_var, superior ), ConsesLow.list( $const11$keStrongSuggestion, term_var, rkf_make_meta_isa_formula( term_var,
          slot ) ) );
      final SubLObject fake_hl_support = ConsesLow.listS( $kw98$CODE, rule_sentence, mt, $list99 );
      return fake_hl_support;
    }
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/rkf-salient-descriptor.lisp", position = 30787L)
  public static SubLObject rkf_salient_descriptor_rule_spec_p(final SubLObject obj)
  {
    return makeBoolean( obj.isList() && NIL != list_utilities.lengthE( obj, FOUR_INTEGER, UNPROVIDED ) && NIL != conses_high.member( obj.first(), $list100, UNPROVIDED, UNPROVIDED ) );
  }

  @SubLTranslatedFile.SubL(source = "cycl/rkf-salient-descriptor.lisp", position = 30946L)
  public static SubLObject new_rkf_salient_descriptor_rule_spec(final SubLObject rule_type, final SubLObject isa_or_genls, final SubLObject superior, final SubLObject slot)
  {
    return ConsesLow.list( rule_type, isa_or_genls, superior, slot );
  }

  @SubLTranslatedFile.SubL(source = "cycl/rkf-salient-descriptor.lisp", position = 31094L)
  public static SubLObject rkf_salient_descriptor_rule_spec_slot(final SubLObject rule_spec)
  {
    return conses_high.fourth( rule_spec );
  }

  @SubLTranslatedFile.SubL(source = "cycl/rkf-salient-descriptor.lisp", position = 31189L)
  public static SubLObject rkf_sd_binary_preds_inference_properties(final SubLObject var)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    return ConsesLow.list( new SubLObject[] { $kw69$PROBLEM_STORE, rkf_sd_find_or_make_problem_store(), $kw70$ANSWER_LANGUAGE, $kw71$HL, $kw101$INTERMEDIATE_STEP_VALIDATION_LEVEL, $kw102$ARG_TYPE,
      $kw103$CACHE_INFERENCE_RESULTS_, NIL, $kw104$RESULT_UNIQUENESS, $kw105$BINDINGS, $kw106$RETURN, ConsesLow.list( $kw107$TEMPLATE, var ), $kw108$PRODUCTIVITY_LIMIT, $int109$100000, $kw110$MAX_NUMBER,
      $rkf_salient_descriptor_number_cutoff$.getDynamicValue( thread ), $kw111$MAX_TIME, $rkf_salient_descriptor_time_cutoff$.getDynamicValue( thread ), $kw112$PROBABLY_APPROXIMATELY_DONE, ONE_INTEGER,
      $kw113$MAX_TRANSFORMATION_DEPTH, $rkf_salient_descriptor_transformation_cutoff$.getDynamicValue( thread )
    } );
  }

  @SubLTranslatedFile.SubL(source = "cycl/rkf-salient-descriptor.lisp", position = 31761L)
  public static SubLObject rkf_collection_promising_for_binary_pred_inductionP(final SubLObject mt, final SubLObject collection, SubLObject type, SubLObject minimum_to_count_as_promising)
  {
    if( type == UNPROVIDED )
    {
      type = $kw21$ISA;
    }
    if( minimum_to_count_as_promising == UNPROVIDED )
    {
      minimum_to_count_as_promising = THREE_INTEGER;
    }
    final SubLThread thread = SubLProcess.currentSubLThread();
    SubLObject badP = makeBoolean( NIL == forts.fort_p( collection ) );
    if( NIL == badP )
    {
      final SubLObject min_inferiors = $int65$25;
      final SubLObject max_specs = $int114$100;
      final SubLObject mt_var = mt_relevance_macros.with_inference_mt_relevance_validate( mt );
      final SubLObject _prev_bind_0 = mt_relevance_macros.$mt$.currentBinding( thread );
      final SubLObject _prev_bind_2 = mt_relevance_macros.$relevant_mt_function$.currentBinding( thread );
      final SubLObject _prev_bind_3 = mt_relevance_macros.$relevant_mts$.currentBinding( thread );
      try
      {
        mt_relevance_macros.$mt$.bind( mt_relevance_macros.update_inference_mt_relevance_mt( mt_var ), thread );
        mt_relevance_macros.$relevant_mt_function$.bind( mt_relevance_macros.update_inference_mt_relevance_function( mt_var ), thread );
        mt_relevance_macros.$relevant_mts$.bind( mt_relevance_macros.update_inference_mt_relevance_mt_list( mt_var ), thread );
        final SubLObject inferior_estimate = ( $kw21$ISA == type ) ? cardinality_estimates.instance_cardinality( collection ) : cardinality_estimates.spec_cardinality( collection );
        badP = makeBoolean( inferior_estimate.numL( min_inferiors ) || cardinality_estimates.spec_cardinality( collection ).numG( max_specs ) || NIL != list_utilities.lengthL( rkf_salient_descriptor_get_inferiors( mt,
            collection, type, min_inferiors ), min_inferiors, UNPROVIDED ) );
      }
      finally
      {
        mt_relevance_macros.$relevant_mts$.rebind( _prev_bind_3, thread );
        mt_relevance_macros.$relevant_mt_function$.rebind( _prev_bind_2, thread );
        mt_relevance_macros.$mt$.rebind( _prev_bind_0, thread );
      }
      if( NIL == badP )
      {
        final SubLObject _prev_bind_4 = $rkf_salient_descriptor_number_cutoff$.currentBinding( thread );
        try
        {
          $rkf_salient_descriptor_number_cutoff$.bind( Numbers.multiply( TWO_INTEGER, minimum_to_count_as_promising ), thread );
          badP = list_utilities.lengthL( rkf_induced_salient_descriptor_binary_preds( mt, collection, type, $int65$25, $kw59$ALL, UNPROVIDED ), minimum_to_count_as_promising, UNPROVIDED );
        }
        finally
        {
          $rkf_salient_descriptor_number_cutoff$.rebind( _prev_bind_4, thread );
        }
      }
    }
    return makeBoolean( NIL == badP );
  }

  @SubLTranslatedFile.SubL(source = "cycl/rkf-salient-descriptor.lisp", position = 32889L)
  public static SubLObject rkf_induced_suggestion_pred_of_strength(final SubLObject strength, final SubLObject type)
  {
    if( type.eql( $kw21$ISA ) )
    {
      if( strength.eql( $kw3$STRONG ) )
      {
        return $const115$keInducedStrongSuggestionPreds;
      }
      if( strength.eql( $kw4$WEAK ) )
      {
        return $const116$keInducedWeakSuggestionPreds;
      }
      return $const117$keInducedSuggestionPreds;
    }
    else
    {
      if( strength.eql( $kw3$STRONG ) )
      {
        return $const118$keGenlsInducedStrongSuggestionPre;
      }
      if( strength.eql( $kw4$WEAK ) )
      {
        return $const119$keGenlsInducedWeakSuggestionPreds;
      }
      return $const120$keGenlsInducedSuggestionPreds;
    }
  }

  @SubLTranslatedFile.SubL(source = "cycl/rkf-salient-descriptor.lisp", position = 33392L)
  public static SubLObject rkf_induced_salient_descriptor_binary_preds(final SubLObject mt, final SubLObject superior, final SubLObject type, SubLObject lax_factor, SubLObject strength, SubLObject omit_preds_for_genlsP)
  {
    if( lax_factor == UNPROVIDED )
    {
      lax_factor = TEN_INTEGER;
    }
    if( strength == UNPROVIDED )
    {
      strength = $kw3$STRONG;
    }
    if( omit_preds_for_genlsP == UNPROVIDED )
    {
      omit_preds_for_genlsP = T;
    }
    final SubLThread thread = SubLProcess.currentSubLThread();
    assert NIL != subl_promotions.positive_integer_p( lax_factor ) : lax_factor;
    if( type != $kw21$ISA )
    {
      final SubLObject siblings = rkf_salient_descriptor_get_inferiors( mt, superior, type, UNPROVIDED );
      final SubLObject sibling_count = Sequences.length( siblings );
      final SubLObject strong_min_min = FIVE_INTEGER;
      final SubLObject factored_min = Numbers.integerDivide( sibling_count, lax_factor );
      final SubLObject strong_min = number_utilities.maximum( ConsesLow.list( factored_min, strong_min_min ), UNPROVIDED );
      final SubLObject max_occurence = ( strength == $kw3$STRONG ) ? NIL : number_utilities.f_1_( strong_min );
      final SubLObject min_min = ( strength == $kw3$STRONG ) ? strong_min_min : TWO_INTEGER;
      final SubLObject min_occurence = number_utilities.maximum( ConsesLow.list( factored_min, min_min ), UNPROVIDED );
      SubLObject alist = NIL;
      if( sibling_count.numG( min_occurence ) )
      {
        SubLObject cdolist_list_var = siblings;
        SubLObject sibling = NIL;
        sibling = cdolist_list_var.first();
        while ( NIL != cdolist_list_var)
        {
          SubLObject cdolist_list_var_$90 = rkf_term_binary_preds( sibling, mt );
          SubLObject binary_pred = NIL;
          binary_pred = cdolist_list_var_$90.first();
          while ( NIL != cdolist_list_var_$90)
          {
            final SubLObject current_count = list_utilities.alist_lookup( alist, binary_pred, Symbols.symbol_function( EQUAL ), ZERO_INTEGER );
            alist = list_utilities.alist_enter( alist, binary_pred, number_utilities.f_1X( current_count ), Symbols.symbol_function( EQUAL ) );
            cdolist_list_var_$90 = cdolist_list_var_$90.rest();
            binary_pred = cdolist_list_var_$90.first();
          }
          cdolist_list_var = cdolist_list_var.rest();
          sibling = cdolist_list_var.first();
        }
      }
      SubLObject filtered = NIL;
      SubLObject cdolist_list_var2 = alist;
      SubLObject item = NIL;
      item = cdolist_list_var2.first();
      while ( NIL != cdolist_list_var2)
      {
        SubLObject current;
        final SubLObject datum = current = item;
        SubLObject binary_pred2 = NIL;
        SubLObject count = NIL;
        cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list134 );
        binary_pred2 = current.first();
        current = ( count = current.rest() );
        if( !count.numL( min_occurence ) )
        {
          if( NIL == max_occurence || !count.numG( max_occurence ) )
          {
            if( NIL != rkf_salient_descriptor_binary_pred_type_violationP( superior, binary_pred2, mt ) )
            {
              Errors.warn( $str135$Type_violation___S__S__S, superior, binary_pred2, mt );
            }
            else
            {
              filtered = ConsesLow.cons( ConsesLow.cons( binary_pred2, count ), filtered );
            }
          }
        }
        cdolist_list_var2 = cdolist_list_var2.rest();
        item = cdolist_list_var2.first();
      }
      return filtered;
    }
    if( NIL != el_utilities.possibly_naut_p( superior ) && cycl_utilities.nat_functor( superior ).eql( $const121$SpecsFn ) )
    {
      return rkf_induced_salient_descriptor_binary_preds( mt, cycl_utilities.nat_arg1( superior, UNPROVIDED ), $kw122$GENL, lax_factor, strength, omit_preds_for_genlsP );
    }
    SubLObject ans = NIL;
    final SubLObject var = $sym123$_PRED;
    final SubLObject _prev_bind_0 = $rkf_salient_descriptor_transformation_cutoff$.currentBinding( thread );
    try
    {
      $rkf_salient_descriptor_transformation_cutoff$.bind( ZERO_INTEGER, thread );
      final SubLObject v_properties = rkf_sd_binary_preds_inference_properties( var );
      final SubLObject sugg_pred = rkf_induced_suggestion_pred_of_strength( strength, type );
      final SubLObject anytime_mt = hlmt_czer.canonicalize_hlmt( hlmt.new_hlmt( ConsesLow.list( mt, $const124$AnytimePSC ) ) );
      SubLObject query_sentence = ConsesLow.list( sugg_pred, superior, var );
      if( NIL != omit_preds_for_genlsP )
      {
        query_sentence = ConsesLow.list( $const78$and, query_sentence, ConsesLow.list( $const125$unknownSentence, ConsesLow.list( $const76$thereExists, $sym126$_GENL, ConsesLow.list( $const78$and, ConsesLow.listS(
            $const25$genls, superior, $list127 ), ConsesLow.listS( $const128$different, superior, $list127 ), ConsesLow.list( sugg_pred, $sym126$_GENL, var ) ) ) ) );
      }
      thread.resetMultipleValues();
      final SubLObject preds = inference_kernel.new_cyc_query( query_sentence, anytime_mt, v_properties );
      final SubLObject reason = thread.secondMultipleValue();
      thread.resetMultipleValues();
      if( NIL == subl_promotions.memberP( reason, $list129, UNPROVIDED, UNPROVIDED ) )
      {
        Errors.warn( $str130$_S___halted_with_reason__S__, query_sentence, reason );
      }
      SubLObject cdolist_list_var = preds;
      SubLObject pred = NIL;
      pred = cdolist_list_var.first();
      while ( NIL != cdolist_list_var)
      {
        if( NIL == rkf_sd_never_use_binary_pred_p( pred ) )
        {
          final SubLObject count2 = ask_utilities.query_variable( $sym131$_COUNT, ConsesLow.listS( $const132$assertedArg1BinaryPreds_Count, superior, pred, $list133 ), mt, v_properties ).first();
          if( count2.isInteger() )
          {
            ans = ConsesLow.cons( ConsesLow.cons( pred, count2 ), ans );
          }
        }
        cdolist_list_var = cdolist_list_var.rest();
        pred = cdolist_list_var.first();
      }
    }
    finally
    {
      $rkf_salient_descriptor_transformation_cutoff$.rebind( _prev_bind_0, thread );
    }
    return ans;
  }

  @SubLTranslatedFile.SubL(source = "cycl/rkf-salient-descriptor.lisp", position = 36594L)
  public static SubLObject rkf_noninduced_salient_descriptor_binary_preds(final SubLObject mt, final SubLObject superior, final SubLObject isa_or_genls)
  {
    if( isa_or_genls.eql( $kw21$ISA ) )
    {
      SubLObject ans = NIL;
      final SubLObject var = $sym123$_PRED;
      final SubLObject v_properties = rkf_sd_binary_preds_inference_properties( var );
      SubLObject cdolist_list_var;
      final SubLObject preds = cdolist_list_var = inference_kernel.new_cyc_query( ConsesLow.list( $const136$keRelevantPreds, superior, var ), mt, v_properties );
      SubLObject pred = NIL;
      pred = cdolist_list_var.first();
      while ( NIL != cdolist_list_var)
      {
        if( NIL == rkf_sd_never_use_binary_pred_p( pred ) )
        {
          ans = ConsesLow.cons( pred, ans );
        }
        cdolist_list_var = cdolist_list_var.rest();
        pred = cdolist_list_var.first();
      }
      return ans;
    }
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/rkf-salient-descriptor.lisp", position = 37064L)
  public static SubLObject rkf_sd_never_use_binary_pred_p(final SubLObject pred)
  {
    return Equality.eq( pred, $const24$isa );
  }

  @SubLTranslatedFile.SubL(source = "cycl/rkf-salient-descriptor.lisp", position = 37149L)
  public static SubLObject rkf_salient_descriptor_get_inferiors_internal(final SubLObject mt, final SubLObject superior, final SubLObject type, SubLObject inferior_max)
  {
    if( inferior_max == UNPROVIDED )
    {
      inferior_max = $int138$200;
    }
    final SubLObject inferior_fn = ( type == $kw21$ISA ) ? $sym139$INSTANCES : $sym140$SPECS;
    SubLObject inferiors = NIL;
    SubLObject target_num = NIL;
    SubLObject specs = NIL;
    target_num = inferior_max;
    SubLObject new_inferiors;
    for( specs = ConsesLow.cons( superior, genls.specs( superior, mt, UNPROVIDED ) ); NIL != specs && NIL == list_utilities.lengthGE( inferiors, inferior_max, UNPROVIDED ); inferiors = ConsesLow.nconc( inferiors,
        new_inferiors ), target_num = Numbers.subtract( inferior_max, Sequences.length( inferiors ) ), specs = specs.rest() )
    {
      final SubLObject current_term = specs.first();
      new_inferiors = list_utilities.random_n( target_num, Functions.funcall( inferior_fn, current_term, mt ) );
    }
    return inferiors;
  }

  @SubLTranslatedFile.SubL(source = "cycl/rkf-salient-descriptor.lisp", position = 37149L)
  public static SubLObject rkf_salient_descriptor_get_inferiors(final SubLObject mt, final SubLObject superior, final SubLObject type, SubLObject inferior_max)
  {
    if( inferior_max == UNPROVIDED )
    {
      inferior_max = $int138$200;
    }
    final SubLThread thread = SubLProcess.currentSubLThread();
    final SubLObject v_memoization_state = memoization_state.$memoization_state$.getDynamicValue( thread );
    SubLObject caching_state = NIL;
    if( NIL == v_memoization_state )
    {
      return rkf_salient_descriptor_get_inferiors_internal( mt, superior, type, inferior_max );
    }
    caching_state = memoization_state.memoization_state_lookup( v_memoization_state, $sym137$RKF_SALIENT_DESCRIPTOR_GET_INFERIORS, UNPROVIDED );
    if( NIL == caching_state )
    {
      caching_state = memoization_state.create_caching_state( memoization_state.memoization_state_lock( v_memoization_state ), $sym137$RKF_SALIENT_DESCRIPTOR_GET_INFERIORS, FOUR_INTEGER, NIL, EQUAL, UNPROVIDED );
      memoization_state.memoization_state_put( v_memoization_state, $sym137$RKF_SALIENT_DESCRIPTOR_GET_INFERIORS, caching_state );
    }
    final SubLObject sxhash = memoization_state.sxhash_calc_4( mt, superior, type, inferior_max );
    final SubLObject collisions = memoization_state.caching_state_lookup( caching_state, sxhash, UNPROVIDED );
    if( !collisions.eql( memoization_state.$memoized_item_not_found$.getGlobalValue() ) )
    {
      SubLObject cdolist_list_var = collisions;
      SubLObject collision = NIL;
      collision = cdolist_list_var.first();
      while ( NIL != cdolist_list_var)
      {
        SubLObject cached_args = collision.first();
        final SubLObject results2 = conses_high.second( collision );
        if( mt.equal( cached_args.first() ) )
        {
          cached_args = cached_args.rest();
          if( superior.equal( cached_args.first() ) )
          {
            cached_args = cached_args.rest();
            if( type.equal( cached_args.first() ) )
            {
              cached_args = cached_args.rest();
              if( NIL != cached_args && NIL == cached_args.rest() && inferior_max.equal( cached_args.first() ) )
              {
                return memoization_state.caching_results( results2 );
              }
            }
          }
        }
        cdolist_list_var = cdolist_list_var.rest();
        collision = cdolist_list_var.first();
      }
    }
    final SubLObject results3 = Values.arg2( thread.resetMultipleValues(), Values.multiple_value_list( rkf_salient_descriptor_get_inferiors_internal( mt, superior, type, inferior_max ) ) );
    memoization_state.caching_state_enter_multi_key_n( caching_state, sxhash, collisions, results3, ConsesLow.list( mt, superior, type, inferior_max ) );
    return memoization_state.caching_results( results3 );
  }

  @SubLTranslatedFile.SubL(source = "cycl/rkf-salient-descriptor.lisp", position = 37747L)
  public static SubLObject rkf_salient_descriptor_binary_pred_type_violationP_internal(final SubLObject v_term, final SubLObject binary_pred, final SubLObject mt)
  {
    final SubLObject arg1_genls = kb_accessors.arg1_genl( binary_pred, mt );
    SubLObject malP = NIL;
    if( NIL == malP )
    {
      SubLObject csome_list_var = arg1_genls;
      SubLObject arg1_genl = NIL;
      arg1_genl = csome_list_var.first();
      while ( NIL == malP && NIL != csome_list_var)
      {
        if( NIL != disjoint_with.collections_disjointP( v_term, arg1_genl, mt ) )
        {
          Errors.warn( $str142$violation___S_not_a_known_spec_of, v_term, arg1_genl, mt );
          malP = T;
        }
        csome_list_var = csome_list_var.rest();
        arg1_genl = csome_list_var.first();
      }
    }
    return malP;
  }

  @SubLTranslatedFile.SubL(source = "cycl/rkf-salient-descriptor.lisp", position = 37747L)
  public static SubLObject rkf_salient_descriptor_binary_pred_type_violationP(final SubLObject v_term, final SubLObject binary_pred, final SubLObject mt)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    final SubLObject v_memoization_state = memoization_state.$memoization_state$.getDynamicValue( thread );
    SubLObject caching_state = NIL;
    if( NIL == v_memoization_state )
    {
      return rkf_salient_descriptor_binary_pred_type_violationP_internal( v_term, binary_pred, mt );
    }
    caching_state = memoization_state.memoization_state_lookup( v_memoization_state, $sym141$RKF_SALIENT_DESCRIPTOR_BINARY_PRED_TYPE_VIOLATION_, UNPROVIDED );
    if( NIL == caching_state )
    {
      caching_state = memoization_state.create_caching_state( memoization_state.memoization_state_lock( v_memoization_state ), $sym141$RKF_SALIENT_DESCRIPTOR_BINARY_PRED_TYPE_VIOLATION_, THREE_INTEGER, NIL, EQUAL,
          UNPROVIDED );
      memoization_state.memoization_state_put( v_memoization_state, $sym141$RKF_SALIENT_DESCRIPTOR_BINARY_PRED_TYPE_VIOLATION_, caching_state );
    }
    final SubLObject sxhash = memoization_state.sxhash_calc_3( v_term, binary_pred, mt );
    final SubLObject collisions = memoization_state.caching_state_lookup( caching_state, sxhash, UNPROVIDED );
    if( !collisions.eql( memoization_state.$memoized_item_not_found$.getGlobalValue() ) )
    {
      SubLObject cdolist_list_var = collisions;
      SubLObject collision = NIL;
      collision = cdolist_list_var.first();
      while ( NIL != cdolist_list_var)
      {
        SubLObject cached_args = collision.first();
        final SubLObject results2 = conses_high.second( collision );
        if( v_term.equal( cached_args.first() ) )
        {
          cached_args = cached_args.rest();
          if( binary_pred.equal( cached_args.first() ) )
          {
            cached_args = cached_args.rest();
            if( NIL != cached_args && NIL == cached_args.rest() && mt.equal( cached_args.first() ) )
            {
              return memoization_state.caching_results( results2 );
            }
          }
        }
        cdolist_list_var = cdolist_list_var.rest();
        collision = cdolist_list_var.first();
      }
    }
    final SubLObject results3 = Values.arg2( thread.resetMultipleValues(), Values.multiple_value_list( rkf_salient_descriptor_binary_pred_type_violationP_internal( v_term, binary_pred, mt ) ) );
    memoization_state.caching_state_enter_multi_key_n( caching_state, sxhash, collisions, results3, ConsesLow.list( v_term, binary_pred, mt ) );
    return memoization_state.caching_results( results3 );
  }

  @SubLTranslatedFile.SubL(source = "cycl/rkf-salient-descriptor.lisp", position = 38257L)
  public static SubLObject rkf_term_binary_preds_internal(final SubLObject v_term, final SubLObject mt)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    SubLObject preds = NIL;
    final SubLObject generality_cutoff = $int144$10000;
    final SubLObject mt_var = mt_relevance_macros.with_inference_mt_relevance_validate( mt );
    final SubLObject _prev_bind_0 = mt_relevance_macros.$mt$.currentBinding( thread );
    final SubLObject _prev_bind_2 = mt_relevance_macros.$relevant_mt_function$.currentBinding( thread );
    final SubLObject _prev_bind_3 = mt_relevance_macros.$relevant_mts$.currentBinding( thread );
    try
    {
      mt_relevance_macros.$mt$.bind( mt_relevance_macros.update_inference_mt_relevance_mt( mt_var ), thread );
      mt_relevance_macros.$relevant_mt_function$.bind( mt_relevance_macros.update_inference_mt_relevance_function( mt_var ), thread );
      mt_relevance_macros.$relevant_mts$.bind( mt_relevance_macros.update_inference_mt_relevance_mt_list( mt_var ), thread );
      final SubLObject pred_var = NIL;
      if( NIL != kb_mapping_macros.do_gaf_arg_index_key_validator( v_term, ONE_INTEGER, pred_var ) )
      {
        final SubLObject iterator_var = kb_mapping_macros.new_gaf_arg_final_index_spec_iterator( v_term, ONE_INTEGER, pred_var );
        SubLObject done_var = NIL;
        final SubLObject token_var = NIL;
        while ( NIL == done_var)
        {
          final SubLObject final_index_spec = iteration.iteration_next_without_values_macro_helper( iterator_var, token_var );
          final SubLObject valid = makeBoolean( !token_var.eql( final_index_spec ) );
          if( NIL != valid )
          {
            SubLObject final_index_iterator = NIL;
            try
            {
              final_index_iterator = kb_mapping_macros.new_final_index_iterator( final_index_spec, $kw145$GAF, NIL, NIL );
              SubLObject done_var_$91 = NIL;
              final SubLObject token_var_$92 = NIL;
              while ( NIL == done_var_$91)
              {
                final SubLObject as = iteration.iteration_next_without_values_macro_helper( final_index_iterator, token_var_$92 );
                final SubLObject valid_$93 = makeBoolean( !token_var_$92.eql( as ) );
                if( NIL != valid_$93 )
                {
                  final SubLObject pred = assertions_high.gaf_arg0( as );
                  if( NIL != assertions_high.asserted_assertionP( as ) && NIL != list_utilities.lengthE( assertions_high.gaf_formula( as ), THREE_INTEGER, UNPROVIDED ) && cardinality_estimates.generality_estimate( pred )
                      .numL( generality_cutoff ) && NIL == lexicon_vars.name_string_predP( pred ) && NIL == lexicon_vars.term_strings_predP( pred ) && NIL == rkf_relevance_utilities.rkf_irrelevant_term( pred, mt ) )
                  {
                    final SubLObject item_var = pred;
                    if( NIL == conses_high.member( item_var, preds, Symbols.symbol_function( EQL ), Symbols.symbol_function( IDENTITY ) ) )
                    {
                      preds = ConsesLow.cons( item_var, preds );
                    }
                  }
                }
                done_var_$91 = makeBoolean( NIL == valid_$93 );
              }
            }
            finally
            {
              final SubLObject _prev_bind_0_$94 = Threads.$is_thread_performing_cleanupP$.currentBinding( thread );
              try
              {
                Threads.$is_thread_performing_cleanupP$.bind( T, thread );
                final SubLObject _values = Values.getValuesAsVector();
                if( NIL != final_index_iterator )
                {
                  kb_mapping_macros.destroy_final_index_iterator( final_index_iterator );
                }
                Values.restoreValuesFromVector( _values );
              }
              finally
              {
                Threads.$is_thread_performing_cleanupP$.rebind( _prev_bind_0_$94, thread );
              }
            }
          }
          done_var = makeBoolean( NIL == valid );
        }
      }
    }
    finally
    {
      mt_relevance_macros.$relevant_mts$.rebind( _prev_bind_3, thread );
      mt_relevance_macros.$relevant_mt_function$.rebind( _prev_bind_2, thread );
      mt_relevance_macros.$mt$.rebind( _prev_bind_0, thread );
    }
    return preds;
  }

  @SubLTranslatedFile.SubL(source = "cycl/rkf-salient-descriptor.lisp", position = 38257L)
  public static SubLObject rkf_term_binary_preds(final SubLObject v_term, final SubLObject mt)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    final SubLObject v_memoization_state = memoization_state.$memoization_state$.getDynamicValue( thread );
    SubLObject caching_state = NIL;
    if( NIL == v_memoization_state )
    {
      return rkf_term_binary_preds_internal( v_term, mt );
    }
    caching_state = memoization_state.memoization_state_lookup( v_memoization_state, $sym143$RKF_TERM_BINARY_PREDS, UNPROVIDED );
    if( NIL == caching_state )
    {
      caching_state = memoization_state.create_caching_state( memoization_state.memoization_state_lock( v_memoization_state ), $sym143$RKF_TERM_BINARY_PREDS, TWO_INTEGER, NIL, EQUAL, UNPROVIDED );
      memoization_state.memoization_state_put( v_memoization_state, $sym143$RKF_TERM_BINARY_PREDS, caching_state );
    }
    final SubLObject sxhash = memoization_state.sxhash_calc_2( v_term, mt );
    final SubLObject collisions = memoization_state.caching_state_lookup( caching_state, sxhash, UNPROVIDED );
    if( !collisions.eql( memoization_state.$memoized_item_not_found$.getGlobalValue() ) )
    {
      SubLObject cdolist_list_var = collisions;
      SubLObject collision = NIL;
      collision = cdolist_list_var.first();
      while ( NIL != cdolist_list_var)
      {
        SubLObject cached_args = collision.first();
        final SubLObject results2 = conses_high.second( collision );
        if( v_term.equal( cached_args.first() ) )
        {
          cached_args = cached_args.rest();
          if( NIL != cached_args && NIL == cached_args.rest() && mt.equal( cached_args.first() ) )
          {
            return memoization_state.caching_results( results2 );
          }
        }
        cdolist_list_var = cdolist_list_var.rest();
        collision = cdolist_list_var.first();
      }
    }
    final SubLObject results3 = Values.arg2( thread.resetMultipleValues(), Values.multiple_value_list( rkf_term_binary_preds_internal( v_term, mt ) ) );
    memoization_state.caching_state_enter_multi_key_n( caching_state, sxhash, collisions, results3, ConsesLow.list( v_term, mt ) );
    return memoization_state.caching_results( results3 );
  }

  @SubLTranslatedFile.SubL(source = "cycl/rkf-salient-descriptor.lisp", position = 38892L)
  public static SubLObject rkf_term_meta_isas(final SubLObject v_term, final SubLObject mt)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    SubLObject meta_isas = NIL;
    final SubLObject mt_var = mt_relevance_macros.with_inference_mt_relevance_validate( mt );
    final SubLObject _prev_bind_0 = mt_relevance_macros.$mt$.currentBinding( thread );
    final SubLObject _prev_bind_2 = mt_relevance_macros.$relevant_mt_function$.currentBinding( thread );
    final SubLObject _prev_bind_3 = mt_relevance_macros.$relevant_mts$.currentBinding( thread );
    try
    {
      mt_relevance_macros.$mt$.bind( mt_relevance_macros.update_inference_mt_relevance_mt( mt_var ), thread );
      mt_relevance_macros.$relevant_mt_function$.bind( mt_relevance_macros.update_inference_mt_relevance_function( mt_var ), thread );
      mt_relevance_macros.$relevant_mts$.bind( mt_relevance_macros.update_inference_mt_relevance_mt_list( mt_var ), thread );
      SubLObject cdolist_list_var = rkf_close_isas( v_term, mt );
      SubLObject v_isa = NIL;
      v_isa = cdolist_list_var.first();
      while ( NIL != cdolist_list_var)
      {
        SubLObject cdolist_list_var_$95 = rkf_close_isas( v_isa, mt );
        SubLObject meta_isa = NIL;
        meta_isa = cdolist_list_var_$95.first();
        while ( NIL != cdolist_list_var_$95)
        {
          if( NIL == rkf_relevance_utilities.rkf_irrelevant_term( meta_isa, mt ) )
          {
            final SubLObject item_var = meta_isa;
            if( NIL == conses_high.member( item_var, meta_isas, Symbols.symbol_function( EQL ), Symbols.symbol_function( IDENTITY ) ) )
            {
              meta_isas = ConsesLow.cons( item_var, meta_isas );
            }
          }
          cdolist_list_var_$95 = cdolist_list_var_$95.rest();
          meta_isa = cdolist_list_var_$95.first();
        }
        cdolist_list_var = cdolist_list_var.rest();
        v_isa = cdolist_list_var.first();
      }
    }
    finally
    {
      mt_relevance_macros.$relevant_mts$.rebind( _prev_bind_3, thread );
      mt_relevance_macros.$relevant_mt_function$.rebind( _prev_bind_2, thread );
      mt_relevance_macros.$mt$.rebind( _prev_bind_0, thread );
    }
    return meta_isas;
  }

  @SubLTranslatedFile.SubL(source = "cycl/rkf-salient-descriptor.lisp", position = 39282L)
  public static SubLObject rkf_term_all_meta_isas_internal(final SubLObject v_term, final SubLObject mt)
  {
    SubLObject meta_isas = NIL;
    SubLObject irrelevant = NIL;
    SubLObject cdolist_list_var = isa.all_isa( v_term, mt, UNPROVIDED );
    SubLObject v_isa = NIL;
    v_isa = cdolist_list_var.first();
    while ( NIL != cdolist_list_var)
    {
      SubLObject cdolist_list_var_$96 = isa.all_isa( v_isa, mt, UNPROVIDED );
      SubLObject meta_isa = NIL;
      meta_isa = cdolist_list_var_$96.first();
      while ( NIL != cdolist_list_var_$96)
      {
        if( NIL == conses_high.member( meta_isa, meta_isas, UNPROVIDED, UNPROVIDED ) )
        {
          if( NIL != rkf_relevance_utilities.rkf_irrelevant_term( meta_isa, mt ) )
          {
            final SubLObject item_var = meta_isa;
            if( NIL == conses_high.member( item_var, irrelevant, Symbols.symbol_function( EQL ), Symbols.symbol_function( IDENTITY ) ) )
            {
              irrelevant = ConsesLow.cons( item_var, irrelevant );
            }
          }
          else if( NIL == subl_promotions.memberP( meta_isa, irrelevant, UNPROVIDED, UNPROVIDED ) )
          {
            meta_isas = ConsesLow.cons( meta_isa, meta_isas );
          }
        }
        cdolist_list_var_$96 = cdolist_list_var_$96.rest();
        meta_isa = cdolist_list_var_$96.first();
      }
      cdolist_list_var = cdolist_list_var.rest();
      v_isa = cdolist_list_var.first();
    }
    return meta_isas;
  }

  @SubLTranslatedFile.SubL(source = "cycl/rkf-salient-descriptor.lisp", position = 39282L)
  public static SubLObject rkf_term_all_meta_isas(final SubLObject v_term, final SubLObject mt)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    final SubLObject v_memoization_state = memoization_state.$memoization_state$.getDynamicValue( thread );
    SubLObject caching_state = NIL;
    if( NIL == v_memoization_state )
    {
      return rkf_term_all_meta_isas_internal( v_term, mt );
    }
    caching_state = memoization_state.memoization_state_lookup( v_memoization_state, $sym146$RKF_TERM_ALL_META_ISAS, UNPROVIDED );
    if( NIL == caching_state )
    {
      caching_state = memoization_state.create_caching_state( memoization_state.memoization_state_lock( v_memoization_state ), $sym146$RKF_TERM_ALL_META_ISAS, TWO_INTEGER, NIL, EQUAL, UNPROVIDED );
      memoization_state.memoization_state_put( v_memoization_state, $sym146$RKF_TERM_ALL_META_ISAS, caching_state );
    }
    final SubLObject sxhash = memoization_state.sxhash_calc_2( v_term, mt );
    final SubLObject collisions = memoization_state.caching_state_lookup( caching_state, sxhash, UNPROVIDED );
    if( !collisions.eql( memoization_state.$memoized_item_not_found$.getGlobalValue() ) )
    {
      SubLObject cdolist_list_var = collisions;
      SubLObject collision = NIL;
      collision = cdolist_list_var.first();
      while ( NIL != cdolist_list_var)
      {
        SubLObject cached_args = collision.first();
        final SubLObject results2 = conses_high.second( collision );
        if( v_term.equal( cached_args.first() ) )
        {
          cached_args = cached_args.rest();
          if( NIL != cached_args && NIL == cached_args.rest() && mt.equal( cached_args.first() ) )
          {
            return memoization_state.caching_results( results2 );
          }
        }
        cdolist_list_var = cdolist_list_var.rest();
        collision = cdolist_list_var.first();
      }
    }
    final SubLObject results3 = Values.arg2( thread.resetMultipleValues(), Values.multiple_value_list( rkf_term_all_meta_isas_internal( v_term, mt ) ) );
    memoization_state.caching_state_enter_multi_key_n( caching_state, sxhash, collisions, results3, ConsesLow.list( v_term, mt ) );
    return memoization_state.caching_results( results3 );
  }

  @SubLTranslatedFile.SubL(source = "cycl/rkf-salient-descriptor.lisp", position = 39763L)
  public static SubLObject rkf_rule_cnfs_for_term(final SubLObject rule, final SubLObject v_term, SubLObject mt)
  {
    if( mt == UNPROVIDED )
    {
      mt = control_vars.$rkf_mt$.getDynamicValue();
    }
    final SubLThread thread = SubLProcess.currentSubLThread();
    SubLObject cnf_pairs = NIL;
    final SubLObject el_cnf = rkf_sd_el_cnf_of_rule( rule );
    final SubLObject local_state;
    final SubLObject state = local_state = memoization_state.possibly_new_memoization_state();
    final SubLObject _prev_bind_0 = memoization_state.$memoization_state$.currentBinding( thread );
    try
    {
      memoization_state.$memoization_state$.bind( local_state, thread );
      final SubLObject original_memoization_process = memoization_state.memoization_state_original_process( local_state );
      try
      {
        final SubLObject already_resourcing_p = sbhl_marking_vars.$resourcing_sbhl_marking_spaces_p$.getDynamicValue( thread );
        final SubLObject _prev_bind_0_$97 = sbhl_marking_vars.$resourced_sbhl_marking_space_limit$.currentBinding( thread );
        final SubLObject _prev_bind_2 = sbhl_marking_vars.$resourced_sbhl_marking_spaces$.currentBinding( thread );
        final SubLObject _prev_bind_3 = sbhl_marking_vars.$resourcing_sbhl_marking_spaces_p$.currentBinding( thread );
        try
        {
          sbhl_marking_vars.$resourced_sbhl_marking_space_limit$.bind( sbhl_marking_vars.determine_resource_limit( already_resourcing_p, SIX_INTEGER ), thread );
          sbhl_marking_vars.$resourced_sbhl_marking_spaces$.bind( sbhl_marking_vars.possibly_new_marking_resource( already_resourcing_p ), thread );
          sbhl_marking_vars.$resourcing_sbhl_marking_spaces_p$.bind( T, thread );
          final SubLObject mt_var = mt_relevance_macros.with_inference_mt_relevance_validate( mt );
          final SubLObject _prev_bind_0_$98 = mt_relevance_macros.$mt$.currentBinding( thread );
          final SubLObject _prev_bind_1_$99 = mt_relevance_macros.$relevant_mt_function$.currentBinding( thread );
          final SubLObject _prev_bind_2_$100 = mt_relevance_macros.$relevant_mts$.currentBinding( thread );
          try
          {
            mt_relevance_macros.$mt$.bind( mt_relevance_macros.update_inference_mt_relevance_mt( mt_var ), thread );
            mt_relevance_macros.$relevant_mt_function$.bind( mt_relevance_macros.update_inference_mt_relevance_function( mt_var ), thread );
            mt_relevance_macros.$relevant_mts$.bind( mt_relevance_macros.update_inference_mt_relevance_mt_list( mt_var ), thread );
            SubLObject cdolist_list_var = rkf_partial_bindings_for_term( rule, v_term, mt );
            SubLObject v_bindings = NIL;
            v_bindings = cdolist_list_var.first();
            while ( NIL != cdolist_list_var)
            {
              SubLObject bound_el_cnf = conses_high.copy_tree( el_cnf );
              SubLObject deduced_neg_lits = NIL;
              SubLObject justification_conjuncts = NIL;
              SubLObject cdolist_list_var_$101 = v_bindings;
              SubLObject cons = NIL;
              cons = cdolist_list_var_$101.first();
              while ( NIL != cdolist_list_var_$101)
              {
                SubLObject current;
                final SubLObject datum = current = cons;
                SubLObject var = NIL;
                SubLObject v_term_$102 = NIL;
                cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list147 );
                var = current.first();
                current = ( v_term_$102 = current.rest() );
                bound_el_cnf = conses_high.nsubst( v_term_$102, var, bound_el_cnf, UNPROVIDED, UNPROVIDED );
                cdolist_list_var_$101 = cdolist_list_var_$101.rest();
                cons = cdolist_list_var_$101.first();
              }
              SubLObject cdolist_list_var_$102 = clauses.neg_lits( bound_el_cnf );
              SubLObject neg_lit = NIL;
              neg_lit = cdolist_list_var_$102.first();
              while ( NIL != cdolist_list_var_$102)
              {
                if( NIL != cycl_utilities.expression_find_if( $sym148$EL_VAR_, neg_lit, UNPROVIDED, UNPROVIDED ) || NIL == rkf_sd_known( neg_lit, mt, UNPROVIDED ) )
                {
                  deduced_neg_lits = ConsesLow.cons( neg_lit, deduced_neg_lits );
                }
                else
                {
                  justification_conjuncts = ConsesLow.cons( neg_lit, justification_conjuncts );
                }
                cdolist_list_var_$102 = cdolist_list_var_$102.rest();
                neg_lit = cdolist_list_var_$102.first();
              }
              final SubLObject deduced_cnf = clauses.make_clause( deduced_neg_lits, clauses.pos_lits( bound_el_cnf ) );
              final SubLObject justification_formula = rkf_sd_conjoin( justification_conjuncts, NIL, NIL );
              final SubLObject item_var = ConsesLow.list( deduced_cnf, justification_formula );
              if( NIL == conses_high.member( item_var, cnf_pairs, Symbols.symbol_function( EQUAL ), Symbols.symbol_function( IDENTITY ) ) )
              {
                cnf_pairs = ConsesLow.cons( item_var, cnf_pairs );
              }
              cdolist_list_var = cdolist_list_var.rest();
              v_bindings = cdolist_list_var.first();
            }
          }
          finally
          {
            mt_relevance_macros.$relevant_mts$.rebind( _prev_bind_2_$100, thread );
            mt_relevance_macros.$relevant_mt_function$.rebind( _prev_bind_1_$99, thread );
            mt_relevance_macros.$mt$.rebind( _prev_bind_0_$98, thread );
          }
        }
        finally
        {
          sbhl_marking_vars.$resourcing_sbhl_marking_spaces_p$.rebind( _prev_bind_3, thread );
          sbhl_marking_vars.$resourced_sbhl_marking_spaces$.rebind( _prev_bind_2, thread );
          sbhl_marking_vars.$resourced_sbhl_marking_space_limit$.rebind( _prev_bind_0_$97, thread );
        }
      }
      finally
      {
        final SubLObject _prev_bind_0_$99 = Threads.$is_thread_performing_cleanupP$.currentBinding( thread );
        try
        {
          Threads.$is_thread_performing_cleanupP$.bind( T, thread );
          final SubLObject _values = Values.getValuesAsVector();
          memoization_state.memoization_state_possibly_clear_original_process( local_state, original_memoization_process );
          Values.restoreValuesFromVector( _values );
        }
        finally
        {
          Threads.$is_thread_performing_cleanupP$.rebind( _prev_bind_0_$99, thread );
        }
      }
    }
    finally
    {
      memoization_state.$memoization_state$.rebind( _prev_bind_0, thread );
    }
    return cnf_pairs;
  }

  @SubLTranslatedFile.SubL(source = "cycl/rkf-salient-descriptor.lisp", position = 40953L)
  public static SubLObject rkf_sd_el_cnf_of_rule(final SubLObject rule)
  {
    final SubLObject hl_cnf = assertions_high.assertion_cnf( rule );
    final SubLObject el_vars = assertions_high.assertion_el_variables( rule );
    return rkf_sd_el_cnf_of_hl_cnf( hl_cnf, el_vars );
  }

  @SubLTranslatedFile.SubL(source = "cycl/rkf-salient-descriptor.lisp", position = 41136L)
  public static SubLObject rkf_sd_el_cnf_of_hl_cnf(final SubLObject hl_cnf, final SubLObject el_vars)
  {
    SubLObject el_cnf = conses_high.copy_tree( hl_cnf );
    SubLObject list_var = NIL;
    SubLObject el_var = NIL;
    SubLObject i = NIL;
    list_var = el_vars;
    el_var = list_var.first();
    for( i = ZERO_INTEGER; NIL != list_var; list_var = list_var.rest(), el_var = list_var.first(), i = Numbers.add( ONE_INTEGER, i ) )
    {
      final SubLObject hl_var = variables.get_variable( i );
      el_cnf = conses_high.nsubst( el_var, hl_var, el_cnf, UNPROVIDED, UNPROVIDED );
    }
    return el_cnf;
  }

  @SubLTranslatedFile.SubL(source = "cycl/rkf-salient-descriptor.lisp", position = 41382L)
  public static SubLObject rkf_sd_el_wffP_internal(final SubLObject el_formula, final SubLObject mt)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    SubLObject wffP = NIL;
    final SubLObject _prev_bind_0 = at_vars.$at_admit_consistent_nartsP$.currentBinding( thread );
    final SubLObject _prev_bind_2 = at_vars.$at_admit_consistent_nautsP$.currentBinding( thread );
    final SubLObject _prev_bind_3 = wff_vars.$provide_wff_suggestionsP$.currentBinding( thread );
    final SubLObject _prev_bind_4 = control_vars.$within_assert$.currentBinding( thread );
    final SubLObject _prev_bind_5 = control_vars.$suppress_conflict_noticesP$.currentBinding( thread );
    try
    {
      at_vars.$at_admit_consistent_nartsP$.bind( NIL, thread );
      at_vars.$at_admit_consistent_nautsP$.bind( NIL, thread );
      wff_vars.$provide_wff_suggestionsP$.bind( NIL, thread );
      control_vars.$within_assert$.bind( T, thread );
      control_vars.$suppress_conflict_noticesP$.bind( T, thread );
      wffP = wff.el_wffP( el_formula, mt, UNPROVIDED );
    }
    finally
    {
      control_vars.$suppress_conflict_noticesP$.rebind( _prev_bind_5, thread );
      control_vars.$within_assert$.rebind( _prev_bind_4, thread );
      wff_vars.$provide_wff_suggestionsP$.rebind( _prev_bind_3, thread );
      at_vars.$at_admit_consistent_nautsP$.rebind( _prev_bind_2, thread );
      at_vars.$at_admit_consistent_nartsP$.rebind( _prev_bind_0, thread );
    }
    return wffP;
  }

  @SubLTranslatedFile.SubL(source = "cycl/rkf-salient-descriptor.lisp", position = 41382L)
  public static SubLObject rkf_sd_el_wffP(final SubLObject el_formula, final SubLObject mt)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    final SubLObject v_memoization_state = memoization_state.$memoization_state$.getDynamicValue( thread );
    SubLObject caching_state = NIL;
    if( NIL == v_memoization_state )
    {
      return rkf_sd_el_wffP_internal( el_formula, mt );
    }
    caching_state = memoization_state.memoization_state_lookup( v_memoization_state, $sym149$RKF_SD_EL_WFF_, UNPROVIDED );
    if( NIL == caching_state )
    {
      caching_state = memoization_state.create_caching_state( memoization_state.memoization_state_lock( v_memoization_state ), $sym149$RKF_SD_EL_WFF_, TWO_INTEGER, NIL, EQUAL, UNPROVIDED );
      memoization_state.memoization_state_put( v_memoization_state, $sym149$RKF_SD_EL_WFF_, caching_state );
    }
    final SubLObject sxhash = memoization_state.sxhash_calc_2( el_formula, mt );
    final SubLObject collisions = memoization_state.caching_state_lookup( caching_state, sxhash, UNPROVIDED );
    if( !collisions.eql( memoization_state.$memoized_item_not_found$.getGlobalValue() ) )
    {
      SubLObject cdolist_list_var = collisions;
      SubLObject collision = NIL;
      collision = cdolist_list_var.first();
      while ( NIL != cdolist_list_var)
      {
        SubLObject cached_args = collision.first();
        final SubLObject results2 = conses_high.second( collision );
        if( el_formula.equal( cached_args.first() ) )
        {
          cached_args = cached_args.rest();
          if( NIL != cached_args && NIL == cached_args.rest() && mt.equal( cached_args.first() ) )
          {
            return memoization_state.caching_results( results2 );
          }
        }
        cdolist_list_var = cdolist_list_var.rest();
        collision = cdolist_list_var.first();
      }
    }
    final SubLObject results3 = Values.arg2( thread.resetMultipleValues(), Values.multiple_value_list( rkf_sd_el_wffP_internal( el_formula, mt ) ) );
    memoization_state.caching_state_enter_multi_key_n( caching_state, sxhash, collisions, results3, ConsesLow.list( el_formula, mt ) );
    return memoization_state.caching_results( results3 );
  }

  @SubLTranslatedFile.SubL(source = "cycl/rkf-salient-descriptor.lisp", position = 41709L)
  public static SubLObject rkf_partial_bindings_for_term(final SubLObject rule, final SubLObject v_term, SubLObject mt)
  {
    if( mt == UNPROVIDED )
    {
      mt = control_vars.$rkf_mt$.getDynamicValue();
    }
    SubLObject ans = NIL;
    if( NIL != genl_mts.genl_mtP( mt, assertions_high.assertion_mt( rule ), UNPROVIDED, UNPROVIDED ) )
    {
      final SubLObject rule_formula = uncanonicalizer.assertion_el_formula( rule );
      final SubLObject constraint_table = rkf_sd_constraint_table( rule_formula, mt );
      final SubLObject antecedent = cycl_utilities.formula_arg1( rule_formula, UNPROVIDED );
      SubLObject cdolist_list_var = cycl_utilities.expression_gather( antecedent, $sym148$EL_VAR_, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED );
      SubLObject el_var = NIL;
      el_var = cdolist_list_var.first();
      while ( NIL != cdolist_list_var)
      {
        final SubLObject el_var_constraint_clauses = dictionary.dictionary_lookup( constraint_table, el_var, UNPROVIDED );
        final SubLObject el_var_constraint_formula = rkf_sd_conjoin( el_var_constraint_clauses, NIL, NIL );
        final SubLObject substituted = cycl_utilities.expression_subst( v_term, el_var, el_var_constraint_formula, UNPROVIDED, UNPROVIDED );
        final SubLObject rejectedP = makeBoolean( NIL != el_utilities.el_formula_p( substituted ) && NIL != rkf_sd_rejected( substituted, mt ) );
        if( NIL == rejectedP )
        {
          SubLObject cdolist_list_var_$105 = rkf_partial_bindings_for_term_var( el_var, v_term, antecedent, mt );
          SubLObject new_bindings = NIL;
          new_bindings = cdolist_list_var_$105.first();
          while ( NIL != cdolist_list_var_$105)
          {
            final SubLObject item_var = new_bindings;
            if( NIL == conses_high.member( item_var, ans, Symbols.symbol_function( $sym150$ALIST__ ), Symbols.symbol_function( IDENTITY ) ) )
            {
              ans = ConsesLow.cons( item_var, ans );
            }
            cdolist_list_var_$105 = cdolist_list_var_$105.rest();
            new_bindings = cdolist_list_var_$105.first();
          }
        }
        cdolist_list_var = cdolist_list_var.rest();
        el_var = cdolist_list_var.first();
      }
    }
    return ans;
  }

  @SubLTranslatedFile.SubL(source = "cycl/rkf-salient-descriptor.lisp", position = 42699L)
  public static SubLObject rkf_partial_bindings_for_term_var(final SubLObject el_var, final SubLObject v_term, final SubLObject antecedent, final SubLObject mt)
  {
    final SubLObject query_formula = conses_high.subst( v_term, el_var, antecedent, UNPROVIDED, UNPROVIDED );
    SubLObject ans = NIL;
    SubLObject cdolist_list_var = rkf_partial_bindings_for_formula( query_formula, mt, UNPROVIDED, UNPROVIDED, UNPROVIDED );
    SubLObject more_bindings = NIL;
    more_bindings = cdolist_list_var.first();
    while ( NIL != cdolist_list_var)
    {
      final SubLObject item_var;
      final SubLObject full_bindings = item_var = list_utilities.alist_enter( more_bindings, el_var, v_term, UNPROVIDED );
      if( NIL == conses_high.member( item_var, ans, Symbols.symbol_function( $sym150$ALIST__ ), Symbols.symbol_function( IDENTITY ) ) )
      {
        ans = ConsesLow.cons( item_var, ans );
      }
      cdolist_list_var = cdolist_list_var.rest();
      more_bindings = cdolist_list_var.first();
    }
    return ans;
  }

  @SubLTranslatedFile.SubL(source = "cycl/rkf-salient-descriptor.lisp", position = 43341L)
  public static SubLObject rkf_partial_bindings_for_formula(final SubLObject formula, final SubLObject mt, SubLObject unbound_var_max, SubLObject unknown_clause_max, SubLObject bindings_max)
  {
    if( unbound_var_max == UNPROVIDED )
    {
      unbound_var_max = TWO_INTEGER;
    }
    if( unknown_clause_max == UNPROVIDED )
    {
      unknown_clause_max = TWO_INTEGER;
    }
    if( bindings_max == UNPROVIDED )
    {
      bindings_max = TWO_INTEGER;
    }
    final SubLThread thread = SubLProcess.currentSubLThread();
    SubLObject ans = NIL;
    SubLObject doneP = NIL;
    if( NIL != el_utilities.el_conjunction_p( formula ) && NIL != rkf_sd_el_wffP( formula, mt ) && NIL == rkf_sd_known( formula, mt, UNPROVIDED ) )
    {
      final SubLObject constraint_table = rkf_sd_constraint_table( formula, mt );
      final SubLObject _prev_bind_0 = api_control_vars.$generate_readable_fi_results$.currentBinding( thread );
      try
      {
        api_control_vars.$generate_readable_fi_results$.bind( NIL, thread );
        if( NIL == doneP )
        {
          SubLObject csome_list_var = cycl_utilities.formula_args( formula, UNPROVIDED );
          SubLObject conjunct = NIL;
          conjunct = csome_list_var.first();
          while ( NIL == doneP && NIL != csome_list_var)
          {
            if( NIL == rkf_sd_el_fully_bound_p( conjunct ) )
            {
              SubLObject constraint_clauses = NIL;
              SubLObject cdolist_list_var = cycl_utilities.expression_gather( conjunct, $sym148$EL_VAR_, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED );
              SubLObject conjunct_var = NIL;
              conjunct_var = cdolist_list_var.first();
              while ( NIL != cdolist_list_var)
              {
                constraint_clauses = ConsesLow.cons( ConsesLow.list( $const125$unknownSentence, ConsesLow.listS( $const151$quotedIsa, conjunct_var, $list152 ) ), constraint_clauses );
                SubLObject cdolist_list_var_$106 = dictionary.dictionary_lookup( constraint_table, conjunct_var, UNPROVIDED );
                SubLObject clause = NIL;
                clause = cdolist_list_var_$106.first();
                while ( NIL != cdolist_list_var_$106)
                {
                  constraint_clauses = ConsesLow.cons( clause, constraint_clauses );
                  cdolist_list_var_$106 = cdolist_list_var_$106.rest();
                  clause = cdolist_list_var_$106.first();
                }
                cdolist_list_var = cdolist_list_var.rest();
                conjunct_var = cdolist_list_var.first();
              }
              final SubLObject query_formula = rkf_sd_conjoin( ConsesLow.cons( conjunct, constraint_clauses ), NIL, NIL );
              SubLObject cdolist_list_var2;
              SubLObject unknown_conjuncts = cdolist_list_var2 = Sequences.remove( conjunct, cycl_utilities.formula_args( formula, UNPROVIDED ), UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED );
              SubLObject unknown_conjunct = NIL;
              unknown_conjunct = cdolist_list_var2.first();
              while ( NIL != cdolist_list_var2)
              {
                rkf_sd_known( unknown_conjunct, mt, UNPROVIDED );
                cdolist_list_var2 = cdolist_list_var2.rest();
                unknown_conjunct = cdolist_list_var2.first();
              }
              if( NIL == doneP )
              {
                SubLObject csome_list_var_$107 = rkf_sd_get_conjunct_bindings( query_formula, mt );
                SubLObject v_bindings = NIL;
                v_bindings = csome_list_var_$107.first();
                while ( NIL == doneP && NIL != csome_list_var_$107)
                {
                  if( NIL != v_bindings )
                  {
                    SubLObject cdolist_list_var3 = v_bindings;
                    SubLObject cons = NIL;
                    cons = cdolist_list_var3.first();
                    while ( NIL != cdolist_list_var3)
                    {
                      SubLObject current;
                      final SubLObject datum = current = cons;
                      SubLObject el_var = NIL;
                      SubLObject v_term = NIL;
                      cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list153 );
                      el_var = current.first();
                      current = ( v_term = current.rest() );
                      unknown_conjuncts = conses_high.subst( v_term, el_var, unknown_conjuncts, UNPROVIDED, UNPROVIDED );
                      cdolist_list_var3 = cdolist_list_var3.rest();
                      cons = cdolist_list_var3.first();
                    }
                    if( NIL != list_utilities.lengthLE( list_utilities.tree_gather( unknown_conjuncts, $sym148$EL_VAR_, UNPROVIDED, UNPROVIDED, UNPROVIDED ), unbound_var_max, UNPROVIDED ) )
                    {
                      SubLObject filtered_unknowns = NIL;
                      SubLObject malP = NIL;
                      if( NIL == malP )
                      {
                        SubLObject csome_list_var_$108 = unknown_conjuncts;
                        SubLObject unknown = NIL;
                        unknown = csome_list_var_$108.first();
                        while ( NIL == malP && NIL != csome_list_var_$108)
                        {
                          if( NIL == rkf_sd_el_fully_bound_p( unknown ) )
                          {
                            filtered_unknowns = ConsesLow.cons( unknown, filtered_unknowns );
                          }
                          else if( NIL == rkf_sd_el_wffP( unknown, mt ) )
                          {
                            malP = T;
                          }
                          else if( NIL != rkf_sd_rejected( unknown, mt ) )
                          {
                            malP = T;
                          }
                          else if( NIL == rkf_sd_known( unknown, mt, UNPROVIDED ) )
                          {
                            filtered_unknowns = ConsesLow.cons( unknown, filtered_unknowns );
                          }
                          csome_list_var_$108 = csome_list_var_$108.rest();
                          unknown = csome_list_var_$108.first();
                        }
                      }
                      malP = list_utilities.lengthG( filtered_unknowns, unknown_clause_max, UNPROVIDED );
                      if( NIL == malP )
                      {
                        final SubLObject mega_formula = rkf_sd_conjoin( filtered_unknowns, UNPROVIDED, UNPROVIDED );
                        if( NIL != rkf_sd_el_wffP( mega_formula, mt ) )
                        {
                          final SubLObject item_var = v_bindings;
                          if( NIL == conses_high.member( item_var, ans, Symbols.symbol_function( $sym150$ALIST__ ), Symbols.symbol_function( IDENTITY ) ) )
                          {
                            ans = ConsesLow.cons( item_var, ans );
                          }
                        }
                      }
                    }
                  }
                  csome_list_var_$107 = csome_list_var_$107.rest();
                  v_bindings = csome_list_var_$107.first();
                }
              }
              doneP = list_utilities.lengthGE( ans, bindings_max, UNPROVIDED );
            }
            csome_list_var = csome_list_var.rest();
            conjunct = csome_list_var.first();
          }
        }
      }
      finally
      {
        api_control_vars.$generate_readable_fi_results$.rebind( _prev_bind_0, thread );
      }
    }
    return ans;
  }

  @SubLTranslatedFile.SubL(source = "cycl/rkf-salient-descriptor.lisp", position = 45816L)
  public static SubLObject rkf_sd_constraint_table(final SubLObject formula, final SubLObject mt)
  {
    final SubLObject constraint_formula = at_var_types.inter_formula_variables_arg_constraints( formula, mt, UNPROVIDED );
    final SubLObject conjuncts = ( NIL != el_utilities.el_conjunction_p( constraint_formula ) ) ? cycl_utilities.formula_args( constraint_formula, UNPROVIDED ) : ConsesLow.list( constraint_formula );
    final SubLObject constraint_table = dictionary.new_dictionary( UNPROVIDED, UNPROVIDED );
    SubLObject cdolist_list_var = conjuncts;
    SubLObject conjunct = NIL;
    conjunct = cdolist_list_var.first();
    while ( NIL != cdolist_list_var)
    {
      if( NIL != formula_pattern_match.formula_matches_pattern( conjunct, $list154 ) || NIL != formula_pattern_match.formula_matches_pattern( conjunct, $list155 ) )
      {
        dictionary_utilities.dictionary_push( constraint_table, cycl_utilities.formula_arg1( conjunct, UNPROVIDED ), conjunct );
      }
      cdolist_list_var = cdolist_list_var.rest();
      conjunct = cdolist_list_var.first();
    }
    return constraint_table;
  }

  @SubLTranslatedFile.SubL(source = "cycl/rkf-salient-descriptor.lisp", position = 46486L)
  public static SubLObject rkf_sd_rejected(final SubLObject sentence, final SubLObject mt)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    final SubLObject negation_by_failureP = rkf_sd_use_negation_by_failureP( sentence );
    SubLObject rejectP = T;
    if( NIL != el_utilities.el_formula_p( sentence ) )
    {
      final SubLObject _prev_bind_0 = control_vars.$negation_by_failure$.currentBinding( thread );
      try
      {
        control_vars.$negation_by_failure$.bind( negation_by_failureP, thread );
        thread.resetMultipleValues();
        final SubLObject negation_knownP = rkf_sd_known( el_utilities.make_negation( sentence ), mt, UNPROVIDED );
        final SubLObject timed_outP = thread.secondMultipleValue();
        thread.resetMultipleValues();
        rejectP = makeBoolean( NIL != negation_knownP || NIL != timed_outP );
      }
      finally
      {
        control_vars.$negation_by_failure$.rebind( _prev_bind_0, thread );
      }
    }
    return rejectP;
  }

  @SubLTranslatedFile.SubL(source = "cycl/rkf-salient-descriptor.lisp", position = 47143L)
  public static SubLObject rkf_sd_use_negation_by_failureP(final SubLObject sentence)
  {
    return formula_pattern_match.formula_matches_pattern( sentence, $list156 );
  }

  @SubLTranslatedFile.SubL(source = "cycl/rkf-salient-descriptor.lisp", position = 47268L)
  public static SubLObject rkf_sd_known_problem_store_properties()
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    return ConsesLow.list( $kw101$INTERMEDIATE_STEP_VALIDATION_LEVEL, $kw102$ARG_TYPE, $kw157$NEGATION_BY_FAILURE_, control_vars.$negation_by_failure$.getDynamicValue( thread ) );
  }

  @SubLTranslatedFile.SubL(source = "cycl/rkf-salient-descriptor.lisp", position = 47438L)
  public static SubLObject rkf_sd_known_static_inference_properties(final SubLObject problem_store, SubLObject exclude_indeterminatesP)
  {
    if( exclude_indeterminatesP == UNPROVIDED )
    {
      exclude_indeterminatesP = T;
    }
    final SubLObject v_properties = ConsesLow.list( $kw69$PROBLEM_STORE, problem_store, $kw104$RESULT_UNIQUENESS, $kw105$BINDINGS, $kw158$ALLOW_INDETERMINATE_RESULTS_, makeBoolean( NIL == exclude_indeterminatesP ) );
    return v_properties;
  }

  @SubLTranslatedFile.SubL(source = "cycl/rkf-salient-descriptor.lisp", position = 48005L)
  public static SubLObject rkf_sd_known_dynamic_inference_properties(final SubLObject max_transformation_depth, final SubLObject max_transformation_depth_max)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    return ConsesLow.list( new SubLObject[] { $kw70$ANSWER_LANGUAGE, $kw71$HL, $kw103$CACHE_INFERENCE_RESULTS_, NIL, $kw159$FORGET_EXTRA_RESULTS_, T, $kw110$MAX_NUMBER, ONE_INTEGER, $kw160$BROWSABLE_, T,
      $kw161$CONTINUABLE_, max_transformation_depth.eql( max_transformation_depth_max ) ? NIL : T, $kw111$MAX_TIME, $rkf_sd_known_time_cutoff$.getDynamicValue( thread ), $kw113$MAX_TRANSFORMATION_DEPTH,
      max_transformation_depth, $kw108$PRODUCTIVITY_LIMIT, $int109$100000
    } );
  }

  @SubLTranslatedFile.SubL(source = "cycl/rkf-salient-descriptor.lisp", position = 48578L)
  public static SubLObject rkf_sd_known_internal(final SubLObject sentence, final SubLObject mt, SubLObject exclude_indeterminatesP)
  {
    if( exclude_indeterminatesP == UNPROVIDED )
    {
      exclude_indeterminatesP = T;
    }
    final SubLThread thread = SubLProcess.currentSubLThread();
    SubLObject ans = NIL;
    SubLObject timed_outP = NIL;
    if( NIL != el_utilities.el_formula_p( sentence ) )
    {
      final SubLObject problem_store = rkf_sd_find_or_make_problem_store();
      final SubLObject already_resourcing_p = sbhl_marking_vars.$resourcing_sbhl_marking_spaces_p$.getDynamicValue( thread );
      final SubLObject _prev_bind_0 = sbhl_marking_vars.$resourced_sbhl_marking_space_limit$.currentBinding( thread );
      final SubLObject _prev_bind_2 = sbhl_marking_vars.$resourced_sbhl_marking_spaces$.currentBinding( thread );
      final SubLObject _prev_bind_3 = sbhl_marking_vars.$resourcing_sbhl_marking_spaces_p$.currentBinding( thread );
      try
      {
        sbhl_marking_vars.$resourced_sbhl_marking_space_limit$.bind( sbhl_marking_vars.determine_resource_limit( already_resourcing_p, SIX_INTEGER ), thread );
        sbhl_marking_vars.$resourced_sbhl_marking_spaces$.bind( sbhl_marking_vars.possibly_new_marking_resource( already_resourcing_p ), thread );
        sbhl_marking_vars.$resourcing_sbhl_marking_spaces_p$.bind( T, thread );
        final SubLObject v_properties = rkf_sd_known_static_inference_properties( problem_store, exclude_indeterminatesP );
        final SubLObject inference = inference_kernel.new_continuable_inference( sentence, mt, v_properties );
        SubLObject max_depth = ZERO_INTEGER;
        final SubLObject max_depth_max = $rkf_sd_known_max_depth_max$.getDynamicValue( thread );
        for( SubLObject no_more_bindingsP = NIL; NIL == ans && NIL == no_more_bindingsP; ans = T )
        {
          thread.resetMultipleValues();
          final SubLObject binding_lists = inference_kernel.continue_inference( inference, rkf_sd_known_dynamic_inference_properties( max_depth, max_depth_max ) );
          final SubLObject exit_condition = thread.secondMultipleValue();
          thread.resetMultipleValues();
          if( $kw111$MAX_TIME == exit_condition )
          {
            timed_outP = T;
            no_more_bindingsP = T;
          }
          else if( NIL == inference_datastructures_inference.continuable_inference_p( inference ) )
          {
            if( NIL != inference_datastructures_enumerated_types.inference_error_suspend_status_p( exit_condition ) )
            {
              Errors.warn( $str163$_S_is_not_continuable____Exit_con, inference, exit_condition );
            }
            no_more_bindingsP = T;
          }
          else if( NIL == binding_lists && max_depth.numGE( max_depth_max ) )
          {
            no_more_bindingsP = T;
          }
          else if( $kw164$EXHAUST == exit_condition && max_depth.numL( max_depth_max ) )
          {
            max_depth = Numbers.add( max_depth, ONE_INTEGER );
          }
          if( NIL != rkf_sd_known_some_good_binding_list_for_query_amongP( binding_lists, sentence, mt, exclude_indeterminatesP ) )
          {
          }
        }
        if( NIL != $rkf_sd_known_destroy_inferencesP$.getDynamicValue( thread ) )
        {
          inference_datastructures_inference.destroy_inference( inference );
        }
      }
      finally
      {
        sbhl_marking_vars.$resourcing_sbhl_marking_spaces_p$.rebind( _prev_bind_3, thread );
        sbhl_marking_vars.$resourced_sbhl_marking_spaces$.rebind( _prev_bind_2, thread );
        sbhl_marking_vars.$resourced_sbhl_marking_space_limit$.rebind( _prev_bind_0, thread );
      }
    }
    if( NIL != timed_outP && $rkf_sd_known_time_cutoff$.getDynamicValue( thread ).isPositive() )
    {
      Errors.warn( $str165$RKF_SD_KNOWN_timed_out_on__S, sentence );
    }
    return Values.values( ans, timed_outP );
  }

  @SubLTranslatedFile.SubL(source = "cycl/rkf-salient-descriptor.lisp", position = 48578L)
  public static SubLObject rkf_sd_known(final SubLObject sentence, final SubLObject mt, SubLObject exclude_indeterminatesP)
  {
    if( exclude_indeterminatesP == UNPROVIDED )
    {
      exclude_indeterminatesP = T;
    }
    final SubLThread thread = SubLProcess.currentSubLThread();
    final SubLObject v_memoization_state = memoization_state.$memoization_state$.getDynamicValue( thread );
    SubLObject caching_state = NIL;
    if( NIL == v_memoization_state )
    {
      return rkf_sd_known_internal( sentence, mt, exclude_indeterminatesP );
    }
    caching_state = memoization_state.memoization_state_lookup( v_memoization_state, $sym162$RKF_SD_KNOWN, UNPROVIDED );
    if( NIL == caching_state )
    {
      caching_state = memoization_state.create_caching_state( memoization_state.memoization_state_lock( v_memoization_state ), $sym162$RKF_SD_KNOWN, THREE_INTEGER, NIL, EQUAL, UNPROVIDED );
      memoization_state.memoization_state_put( v_memoization_state, $sym162$RKF_SD_KNOWN, caching_state );
    }
    final SubLObject sxhash = memoization_state.sxhash_calc_3( sentence, mt, exclude_indeterminatesP );
    final SubLObject collisions = memoization_state.caching_state_lookup( caching_state, sxhash, UNPROVIDED );
    if( !collisions.eql( memoization_state.$memoized_item_not_found$.getGlobalValue() ) )
    {
      SubLObject cdolist_list_var = collisions;
      SubLObject collision = NIL;
      collision = cdolist_list_var.first();
      while ( NIL != cdolist_list_var)
      {
        SubLObject cached_args = collision.first();
        final SubLObject results2 = conses_high.second( collision );
        if( sentence.equal( cached_args.first() ) )
        {
          cached_args = cached_args.rest();
          if( mt.equal( cached_args.first() ) )
          {
            cached_args = cached_args.rest();
            if( NIL != cached_args && NIL == cached_args.rest() && exclude_indeterminatesP.equal( cached_args.first() ) )
            {
              return memoization_state.caching_results( results2 );
            }
          }
        }
        cdolist_list_var = cdolist_list_var.rest();
        collision = cdolist_list_var.first();
      }
    }
    final SubLObject results3 = Values.arg2( thread.resetMultipleValues(), Values.multiple_value_list( rkf_sd_known_internal( sentence, mt, exclude_indeterminatesP ) ) );
    memoization_state.caching_state_enter_multi_key_n( caching_state, sxhash, collisions, results3, ConsesLow.list( sentence, mt, exclude_indeterminatesP ) );
    return memoization_state.caching_results( results3 );
  }

  @SubLTranslatedFile.SubL(source = "cycl/rkf-salient-descriptor.lisp", position = 50453L)
  public static SubLObject rkf_sd_existentially_unbind(final SubLObject sentence)
  {
    SubLObject new_sentence = el_utilities.copy_expression( sentence );
    SubLObject vars = NIL;
    while ( NIL != el_utilities.el_existential_p( new_sentence ))
    {
      SubLObject current;
      final SubLObject datum = current = cycl_utilities.formula_args( new_sentence, UNPROVIDED );
      SubLObject var = NIL;
      SubLObject body = NIL;
      cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list166 );
      var = current.first();
      current = current.rest();
      cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list166 );
      body = current.first();
      current = current.rest();
      if( NIL == current )
      {
        new_sentence = body;
        vars = ConsesLow.cons( var, vars );
      }
      else
      {
        cdestructuring_bind.cdestructuring_bind_error( datum, $list166 );
      }
    }
    return Values.values( new_sentence, vars );
  }

  @SubLTranslatedFile.SubL(source = "cycl/rkf-salient-descriptor.lisp", position = 50770L)
  public static SubLObject rkf_sd_possibly_existentially_unbind(final SubLObject sentence)
  {
    return ( NIL != el_utilities.el_existential_p( sentence ) ) ? rkf_sd_existentially_unbind( sentence ) : Values.values( sentence, el_utilities.sentence_free_variables( sentence, UNPROVIDED, UNPROVIDED, UNPROVIDED ) );
  }

  @SubLTranslatedFile.SubL(source = "cycl/rkf-salient-descriptor.lisp", position = 51416L)
  public static SubLObject rkf_sd_known_some_good_binding_list_for_query_amongP(final SubLObject binding_lists, final SubLObject query_sentence, final SubLObject mt, final SubLObject exclude_indeterminatesP)
  {
    SubLObject good_foundP;
    SubLObject rest;
    SubLObject binding_list;
    for( good_foundP = NIL, rest = NIL, rest = binding_lists; NIL == good_foundP && NIL != rest; rest = rest.rest() )
    {
      binding_list = rest.first();
      if( NIL != rkf_sd_known_good_binding_list_for_queryP( binding_list, query_sentence, mt, exclude_indeterminatesP ) )
      {
        good_foundP = T;
      }
    }
    return good_foundP;
  }

  @SubLTranslatedFile.SubL(source = "cycl/rkf-salient-descriptor.lisp", position = 51876L)
  public static SubLObject rkf_sd_known_good_binding_list_for_queryP(final SubLObject binding_list, final SubLObject query_sentence, final SubLObject mt, final SubLObject exclude_indeterminatesP)
  {
    if( NIL == exclude_indeterminatesP || NIL != cyc_kernel.closed_query_bindings_p( binding_list ) )
    {
      return T;
    }
    final SubLObject bound_sentence = bindings.apply_bindings( binding_list, query_sentence );
    return makeBoolean( NIL == pph_proof.sentence_trivial_for_justification_paraphraseP( bound_sentence, UNPROVIDED ) );
  }

  @SubLTranslatedFile.SubL(source = "cycl/rkf-salient-descriptor.lisp", position = 52310L)
  public static SubLObject rkf_sd_get_conjunct_bindings_internal(final SubLObject conjunct, final SubLObject mt)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    final SubLObject inference_properties = ConsesLow.list( new SubLObject[] { $kw69$PROBLEM_STORE, rkf_sd_find_or_make_problem_store(), $kw70$ANSWER_LANGUAGE, $kw71$HL, $kw103$CACHE_INFERENCE_RESULTS_, NIL,
      $kw104$RESULT_UNIQUENESS, $kw105$BINDINGS, $kw106$RETURN, $kw105$BINDINGS, $kw110$MAX_NUMBER, TWENTY_INTEGER, $kw111$MAX_TIME, ONE_INTEGER, $kw113$MAX_TRANSFORMATION_DEPTH, ZERO_INTEGER
    } );
    final SubLObject scoped_vars = NIL;
    thread.resetMultipleValues();
    final SubLObject hl_conjunct = rkf_sd_hl_for_el_vars_in_formula( conjunct );
    final SubLObject var_table = thread.secondMultipleValue();
    thread.resetMultipleValues();
    thread.resetMultipleValues();
    final SubLObject dnfs = clausifier.dnf_clausal_form( hl_conjunct, mt );
    final SubLObject new_mt = thread.secondMultipleValue();
    thread.resetMultipleValues();
    if( NIL != list_utilities.singletonP( dnfs ) )
    {
      final SubLObject dnf = dnfs.first();
      final SubLObject hl_bindings = inference_kernel.new_cyc_query_from_dnf( dnf, new_mt, scoped_vars, inference_properties );
      SubLObject el_bindings = conses_high.copy_list( hl_bindings );
      SubLObject cdolist_list_var = var_table;
      SubLObject cons = NIL;
      cons = cdolist_list_var.first();
      while ( NIL != cdolist_list_var)
      {
        SubLObject current;
        final SubLObject datum = current = cons;
        SubLObject hl_var = NIL;
        SubLObject el_var = NIL;
        cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list168 );
        hl_var = current.first();
        current = ( el_var = current.rest() );
        el_bindings = conses_high.subst( el_var, hl_var, el_bindings, UNPROVIDED, UNPROVIDED );
        cdolist_list_var = cdolist_list_var.rest();
        cons = cdolist_list_var.first();
      }
      return el_bindings;
    }
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/rkf-salient-descriptor.lisp", position = 52310L)
  public static SubLObject rkf_sd_get_conjunct_bindings(final SubLObject conjunct, final SubLObject mt)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    final SubLObject v_memoization_state = memoization_state.$memoization_state$.getDynamicValue( thread );
    SubLObject caching_state = NIL;
    if( NIL == v_memoization_state )
    {
      return rkf_sd_get_conjunct_bindings_internal( conjunct, mt );
    }
    caching_state = memoization_state.memoization_state_lookup( v_memoization_state, $sym167$RKF_SD_GET_CONJUNCT_BINDINGS, UNPROVIDED );
    if( NIL == caching_state )
    {
      caching_state = memoization_state.create_caching_state( memoization_state.memoization_state_lock( v_memoization_state ), $sym167$RKF_SD_GET_CONJUNCT_BINDINGS, TWO_INTEGER, NIL, EQUAL, UNPROVIDED );
      memoization_state.memoization_state_put( v_memoization_state, $sym167$RKF_SD_GET_CONJUNCT_BINDINGS, caching_state );
    }
    final SubLObject sxhash = memoization_state.sxhash_calc_2( conjunct, mt );
    final SubLObject collisions = memoization_state.caching_state_lookup( caching_state, sxhash, UNPROVIDED );
    if( !collisions.eql( memoization_state.$memoized_item_not_found$.getGlobalValue() ) )
    {
      SubLObject cdolist_list_var = collisions;
      SubLObject collision = NIL;
      collision = cdolist_list_var.first();
      while ( NIL != cdolist_list_var)
      {
        SubLObject cached_args = collision.first();
        final SubLObject results2 = conses_high.second( collision );
        if( conjunct.equal( cached_args.first() ) )
        {
          cached_args = cached_args.rest();
          if( NIL != cached_args && NIL == cached_args.rest() && mt.equal( cached_args.first() ) )
          {
            return memoization_state.caching_results( results2 );
          }
        }
        cdolist_list_var = cdolist_list_var.rest();
        collision = cdolist_list_var.first();
      }
    }
    final SubLObject results3 = Values.arg2( thread.resetMultipleValues(), Values.multiple_value_list( rkf_sd_get_conjunct_bindings_internal( conjunct, mt ) ) );
    memoization_state.caching_state_enter_multi_key_n( caching_state, sxhash, collisions, results3, ConsesLow.list( conjunct, mt ) );
    return memoization_state.caching_results( results3 );
  }

  @SubLTranslatedFile.SubL(source = "cycl/rkf-salient-descriptor.lisp", position = 53158L)
  public static SubLObject rkf_sd_hl_for_el_vars_in_formula(final SubLObject formula)
  {
    SubLObject new_formula = el_utilities.copy_expression( formula );
    SubLObject table = NIL;
    SubLObject next_hl_var_num = ZERO_INTEGER;
    SubLObject cdolist_list_var = cycl_utilities.expression_gather( formula, $sym148$EL_VAR_, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED );
    SubLObject el_var = NIL;
    el_var = cdolist_list_var.first();
    while ( NIL != cdolist_list_var)
    {
      final SubLObject hl_var = variables.get_variable( next_hl_var_num );
      new_formula = cycl_utilities.expression_nsubst( hl_var, el_var, new_formula, UNPROVIDED, UNPROVIDED );
      table = list_utilities.alist_enter( table, hl_var, el_var, UNPROVIDED );
      next_hl_var_num = Numbers.add( next_hl_var_num, ONE_INTEGER );
      cdolist_list_var = cdolist_list_var.rest();
      el_var = cdolist_list_var.first();
    }
    return Values.values( new_formula, table );
  }

  @SubLTranslatedFile.SubL(source = "cycl/rkf-salient-descriptor.lisp", position = 53602L)
  public static SubLObject rkf_potential_rule_for_termP(final SubLObject rule, final SubLObject v_term, SubLObject mt)
  {
    if( mt == UNPROVIDED )
    {
      mt = control_vars.$rkf_mt$.getDynamicValue();
    }
    final SubLThread thread = SubLProcess.currentSubLThread();
    SubLObject ans = NIL;
    final SubLObject cnf = assertions_high.assertion_cnf( rule );
    if( NIL != genl_mts.genl_mtP( mt, assertions_high.assertion_mt( rule ), UNPROVIDED, UNPROVIDED ) )
    {
      final SubLObject mt_var = mt_relevance_macros.with_inference_mt_relevance_validate( mt );
      final SubLObject _prev_bind_0 = mt_relevance_macros.$mt$.currentBinding( thread );
      final SubLObject _prev_bind_2 = mt_relevance_macros.$relevant_mt_function$.currentBinding( thread );
      final SubLObject _prev_bind_3 = mt_relevance_macros.$relevant_mts$.currentBinding( thread );
      try
      {
        mt_relevance_macros.$mt$.bind( mt_relevance_macros.update_inference_mt_relevance_mt( mt_var ), thread );
        mt_relevance_macros.$relevant_mt_function$.bind( mt_relevance_macros.update_inference_mt_relevance_function( mt_var ), thread );
        mt_relevance_macros.$relevant_mts$.bind( mt_relevance_macros.update_inference_mt_relevance_mt_list( mt_var ), thread );
        SubLObject cdolist_list_var = list_utilities.tree_gather( cnf, $sym169$HL_VAR_, UNPROVIDED, UNPROVIDED, UNPROVIDED );
        SubLObject var = NIL;
        var = cdolist_list_var.first();
        while ( NIL != cdolist_list_var)
        {
          SubLObject bad_subP = NIL;
          final SubLObject subbed = conses_high.subst( v_term, var, conses_high.copy_tree( cnf ), UNPROVIDED, UNPROVIDED );
          if( NIL == bad_subP )
          {
            SubLObject csome_list_var = ConsesLow.nconc( clauses.neg_lits( subbed ), clauses.pos_lits( subbed ) );
            SubLObject neg_lit = NIL;
            neg_lit = csome_list_var.first();
            while ( NIL == bad_subP && NIL != csome_list_var)
            {
              if( NIL == wff.semantically_wf_literalP( neg_lit, UNPROVIDED ) )
              {
                bad_subP = T;
              }
              csome_list_var = csome_list_var.rest();
              neg_lit = csome_list_var.first();
            }
          }
          if( NIL == bad_subP )
          {
            ans = ConsesLow.cons( var, ans );
          }
          cdolist_list_var = cdolist_list_var.rest();
          var = cdolist_list_var.first();
        }
      }
      finally
      {
        mt_relevance_macros.$relevant_mts$.rebind( _prev_bind_3, thread );
        mt_relevance_macros.$relevant_mt_function$.rebind( _prev_bind_2, thread );
        mt_relevance_macros.$mt$.rebind( _prev_bind_0, thread );
      }
    }
    return ans;
  }

  @SubLTranslatedFile.SubL(source = "cycl/rkf-salient-descriptor.lisp", position = 54299L)
  public static SubLObject rkf_sd_asent_unify(final SubLObject gaf_lit, final SubLObject rule_lit, SubLObject mt)
  {
    if( mt == UNPROVIDED )
    {
      mt = mt_relevance_macros.$mt$.getDynamicValue();
    }
    return unification_utilities.asent_unify( gaf_lit, rule_lit, UNPROVIDED, UNPROVIDED );
  }

  @SubLTranslatedFile.SubL(source = "cycl/rkf-salient-descriptor.lisp", position = 54428L)
  public static SubLObject rkf_unsatisfied_cnf_subbed_rule_formula(final SubLObject rule, final SubLObject gaf_lit, final SubLObject rule_sense, final SubLObject mt)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    SubLObject cnf_copy = conses_high.copy_tree( assertions_high.assertion_cnf( rule ) );
    final SubLObject el_vars = assertions_high.assertion_el_variables( rule );
    SubLObject rejectedP = NIL;
    SubLObject v_bindings = NIL;
    SubLObject ans = NIL;
    final SubLObject local_state;
    final SubLObject state = local_state = memoization_state.possibly_new_memoization_state();
    final SubLObject _prev_bind_0 = memoization_state.$memoization_state$.currentBinding( thread );
    try
    {
      memoization_state.$memoization_state$.bind( local_state, thread );
      final SubLObject original_memoization_process = memoization_state.memoization_state_original_process( local_state );
      try
      {
        final SubLObject already_resourcing_p = sbhl_marking_vars.$resourcing_sbhl_marking_spaces_p$.getDynamicValue( thread );
        final SubLObject _prev_bind_0_$109 = sbhl_marking_vars.$resourced_sbhl_marking_space_limit$.currentBinding( thread );
        final SubLObject _prev_bind_2 = sbhl_marking_vars.$resourced_sbhl_marking_spaces$.currentBinding( thread );
        final SubLObject _prev_bind_3 = sbhl_marking_vars.$resourcing_sbhl_marking_spaces_p$.currentBinding( thread );
        try
        {
          sbhl_marking_vars.$resourced_sbhl_marking_space_limit$.bind( sbhl_marking_vars.determine_resource_limit( already_resourcing_p, SIX_INTEGER ), thread );
          sbhl_marking_vars.$resourced_sbhl_marking_spaces$.bind( sbhl_marking_vars.possibly_new_marking_resource( already_resourcing_p ), thread );
          sbhl_marking_vars.$resourcing_sbhl_marking_spaces_p$.bind( T, thread );
          final SubLObject reuse_existingP = rkf_sd_problem_store_okP( $rkf_sd_problem_store$.getDynamicValue( thread ) );
          final SubLObject _prev_bind_0_$110 = $rkf_sd_problem_store$.currentBinding( thread );
          try
          {
            $rkf_sd_problem_store$.bind( rkf_sd_find_or_make_problem_store(), thread );
            final SubLObject store = $rkf_sd_problem_store$.getDynamicValue( thread );
            try
            {
              if( $kw170$NEG == rule_sense )
              {
                if( NIL == v_bindings )
                {
                  SubLObject csome_list_var;
                  SubLObject neg_lit;
                  for( csome_list_var = clauses.neg_lits( cnf_copy ), neg_lit = NIL, neg_lit = csome_list_var.first(); NIL == v_bindings && NIL != csome_list_var; v_bindings = rkf_sd_asent_unify( gaf_lit, neg_lit,
                      mt ), csome_list_var = csome_list_var.rest(), neg_lit = csome_list_var.first() )
                  {
                  }
                }
                if( NIL != v_bindings )
                {
                  cnf_copy = bindings.subst_bindings( v_bindings, cnf_copy );
                  final SubLObject new_neg_lits = Sequences.remove( gaf_lit, clauses.neg_lits( cnf_copy ), Symbols.symbol_function( EQUAL ), UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED );
                  cnf_copy = clauses.make_clause( new_neg_lits, clauses.pos_lits( cnf_copy ) );
                  rejectedP = rkf_unsatisfied_cnf_rejectP( cnf_copy, mt, el_vars );
                }
                if( NIL == rejectedP )
                {
                  ans = uncanonicalizer.cnf_el_formula( cnf_copy, mt, el_vars );
                }
              }
            }
            finally
            {
              final SubLObject _prev_bind_0_$111 = Threads.$is_thread_performing_cleanupP$.currentBinding( thread );
              try
              {
                Threads.$is_thread_performing_cleanupP$.bind( T, thread );
                final SubLObject _values = Values.getValuesAsVector();
                if( NIL == reuse_existingP )
                {
                  rkf_sd_free_problem_store( store );
                }
                Values.restoreValuesFromVector( _values );
              }
              finally
              {
                Threads.$is_thread_performing_cleanupP$.rebind( _prev_bind_0_$111, thread );
              }
            }
          }
          finally
          {
            $rkf_sd_problem_store$.rebind( _prev_bind_0_$110, thread );
          }
        }
        finally
        {
          sbhl_marking_vars.$resourcing_sbhl_marking_spaces_p$.rebind( _prev_bind_3, thread );
          sbhl_marking_vars.$resourced_sbhl_marking_spaces$.rebind( _prev_bind_2, thread );
          sbhl_marking_vars.$resourced_sbhl_marking_space_limit$.rebind( _prev_bind_0_$109, thread );
        }
      }
      finally
      {
        final SubLObject _prev_bind_0_$112 = Threads.$is_thread_performing_cleanupP$.currentBinding( thread );
        try
        {
          Threads.$is_thread_performing_cleanupP$.bind( T, thread );
          final SubLObject _values2 = Values.getValuesAsVector();
          memoization_state.memoization_state_possibly_clear_original_process( local_state, original_memoization_process );
          Values.restoreValuesFromVector( _values2 );
        }
        finally
        {
          Threads.$is_thread_performing_cleanupP$.rebind( _prev_bind_0_$112, thread );
        }
      }
    }
    finally
    {
      memoization_state.$memoization_state$.rebind( _prev_bind_0, thread );
    }
    return ans;
  }

  @SubLTranslatedFile.SubL(source = "cycl/rkf-salient-descriptor.lisp", position = 55355L)
  public static SubLObject rkf_unsatisfied_cnf_rejectP(final SubLObject cnf_copy, final SubLObject mt, final SubLObject el_vars)
  {
    final SubLObject pos_lits = clauses.pos_lits( cnf_copy );
    final SubLObject consequent = ( NIL != pos_lits ) ? uncanonicalizer.cnf_el_formula( clauses.make_clause( NIL, pos_lits ), mt, el_vars ) : NIL;
    SubLObject rejectedP = makeBoolean( NIL == pos_lits || ( NIL != rkf_sd_el_fully_bound_p( consequent ) && NIL != rkf_sd_known( consequent, mt, UNPROVIDED ) ) );
    if( NIL == rejectedP )
    {
      final SubLObject fully_bound_neg_lits = list_utilities.remove_if_not( $sym171$FULLY_BOUND_P, clauses.neg_lits( cnf_copy ), UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED );
      rejectedP = makeBoolean( NIL != fully_bound_neg_lits && NIL != rkf_sd_rejected( rkf_sd_conjoin( fully_bound_neg_lits, NIL, NIL ), mt ) );
    }
    if( NIL == rejectedP )
    {
      final SubLObject fully_bound_pos_lits = list_utilities.remove_if_not( $sym171$FULLY_BOUND_P, clauses.pos_lits( cnf_copy ), UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED );
      rejectedP = makeBoolean( NIL != fully_bound_pos_lits && NIL != rkf_sd_rejected( rkf_sd_conjoin( fully_bound_pos_lits, NIL, NIL ), mt ) );
    }
    return rejectedP;
  }

  @SubLTranslatedFile.SubL(source = "cycl/rkf-salient-descriptor.lisp", position = 56193L)
  public static SubLObject rkf_sd_neg_lits_knownP(final SubLObject neg_lits, final SubLObject mt)
  {
    if( NIL != neg_lits )
    {
      final SubLObject antecedent_formula = rkf_sd_conjoin( neg_lits, UNPROVIDED, UNPROVIDED );
      return rkf_sd_known( rkf_sd_existentially_bind_vars( antecedent_formula ), mt, NIL );
    }
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/rkf-salient-descriptor.lisp", position = 56417L)
  public static SubLObject rkf_sd_el_fully_bound_p(final SubLObject el_formula)
  {
    return makeBoolean( NIL == cycl_utilities.expression_find_if( $sym148$EL_VAR_, el_formula, UNPROVIDED, UNPROVIDED ) );
  }

  @SubLTranslatedFile.SubL(source = "cycl/rkf-salient-descriptor.lisp", position = 56530L)
  public static SubLObject rkf_make_el_cnf(final SubLObject neg_lits, final SubLObject pos_lits, final SubLObject rule)
  {
    final SubLObject rule_el_vars = assertions_high.assertion_el_variables( rule );
    SubLObject cnf = conses_high.copy_tree( clauses.make_clause( neg_lits, pos_lits ) );
    SubLObject list_var = NIL;
    SubLObject rule_el_var = NIL;
    SubLObject i = NIL;
    list_var = rule_el_vars;
    rule_el_var = list_var.first();
    for( i = ZERO_INTEGER; NIL != list_var; list_var = list_var.rest(), rule_el_var = list_var.first(), i = Numbers.add( ONE_INTEGER, i ) )
    {
      final SubLObject hl_var = variables.find_variable_by_id( i );
      cnf = conses_high.nsubst( rule_el_var, hl_var, cnf, UNPROVIDED, UNPROVIDED );
    }
    return cnf;
  }

  @SubLTranslatedFile.SubL(source = "cycl/rkf-salient-descriptor.lisp", position = 56903L)
  public static SubLObject rkf_make_el_conjunction(final SubLObject lits, final SubLObject rule)
  {
    final SubLObject rule_el_vars = assertions_high.assertion_el_variables( rule );
    SubLObject ans = rkf_sd_conjoin( lits, NIL, NIL );
    SubLObject list_var = NIL;
    SubLObject rule_el_var = NIL;
    SubLObject i = NIL;
    list_var = rule_el_vars;
    rule_el_var = list_var.first();
    for( i = ZERO_INTEGER; NIL != list_var; list_var = list_var.rest(), rule_el_var = list_var.first(), i = Numbers.add( ONE_INTEGER, i ) )
    {
      final SubLObject hl_var = variables.find_variable_by_id( i );
      ans = conses_high.nsubst( rule_el_var, hl_var, ans, UNPROVIDED, UNPROVIDED );
    }
    return ans;
  }

  @SubLTranslatedFile.SubL(source = "cycl/rkf-salient-descriptor.lisp", position = 57257L)
  public static SubLObject rkf_rule_partially_satisfied_by_gaf_litP(final SubLObject rule, final SubLObject gaf_lit, final SubLObject rule_sense)
  {
    final SubLObject cnf = assertions_high.assertion_cnf( rule );
    final SubLObject complementary_truth_lits = ( $kw170$NEG == rule_sense ) ? clauses.neg_lits( cnf ) : clauses.pos_lits( cnf );
    SubLObject matching_lit = NIL;
    SubLObject v_bindings = NIL;
    SubLObject unresolved_neg_lits = NIL;
    SubLObject unresolved_pos_lits = NIL;
    if( NIL == matching_lit )
    {
      SubLObject csome_list_var = complementary_truth_lits;
      SubLObject lit = NIL;
      lit = csome_list_var.first();
      while ( NIL == matching_lit && NIL != csome_list_var)
      {
        v_bindings = unification_utilities.asent_unify( gaf_lit, lit, UNPROVIDED, UNPROVIDED );
        if( NIL != v_bindings )
        {
          matching_lit = lit;
        }
        csome_list_var = csome_list_var.rest();
        lit = csome_list_var.first();
      }
    }
    if( NIL == gaf_lit || NIL != matching_lit )
    {
      unresolved_neg_lits = rkf_find_unresolved_lits( rule, $kw170$NEG, v_bindings, matching_lit );
      unresolved_pos_lits = unresolved_neg_lits.isList() ? rkf_find_unresolved_lits( rule, $kw172$POS, v_bindings, matching_lit ) : NIL;
    }
    return Values.values( unresolved_neg_lits, unresolved_pos_lits );
  }

  @SubLTranslatedFile.SubL(source = "cycl/rkf-salient-descriptor.lisp", position = 58077L)
  public static SubLObject rkf_find_unresolved_lits(final SubLObject rule, final SubLObject sense, final SubLObject v_bindings, final SubLObject matching_lit)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    SubLObject mismatchP = NIL;
    final SubLObject cnf = conses_high.copy_tree( assertions_high.assertion_cnf( rule ) );
    final SubLObject lits = ( sense == $kw170$NEG ) ? clauses.neg_lits( cnf ) : clauses.pos_lits( cnf );
    final SubLObject el_vars = assertions_high.assertion_el_variables( rule );
    SubLObject unresolved = NIL;
    SubLObject resolved = NIL;
    if( NIL == mismatchP )
    {
      SubLObject csome_list_var = lits;
      SubLObject lit = NIL;
      lit = csome_list_var.first();
      while ( NIL == mismatchP && NIL != csome_list_var)
      {
        if( !lit.equal( matching_lit ) )
        {
          thread.resetMultipleValues();
          final SubLObject result = rkf_sd_check_lit( lit, v_bindings, el_vars );
          final SubLObject el_lit = thread.secondMultipleValue();
          thread.resetMultipleValues();
          final SubLObject pcase_var = result;
          if( pcase_var.eql( $kw173$KNOWN ) )
          {
            resolved = ConsesLow.cons( el_lit, resolved );
          }
          else if( pcase_var.eql( $kw174$UNKNOWN ) )
          {
            unresolved = ConsesLow.cons( el_lit, unresolved );
          }
          else
          {
            mismatchP = T;
          }
        }
        csome_list_var = csome_list_var.rest();
        lit = csome_list_var.first();
      }
    }
    return Values.values( ( NIL != mismatchP ) ? $kw175$MISMATCH : unresolved, resolved );
  }

  @SubLTranslatedFile.SubL(source = "cycl/rkf-salient-descriptor.lisp", position = 58748L)
  public static SubLObject rkf_subst_el_bindings(final SubLObject v_bindings, final SubLObject lit)
  {
    SubLObject ans = el_utilities.copy_expression( lit );
    SubLObject cdolist_list_var = v_bindings;
    SubLObject binding = NIL;
    binding = cdolist_list_var.first();
    while ( NIL != cdolist_list_var)
    {
      SubLObject current;
      final SubLObject datum = current = binding;
      SubLObject var = NIL;
      SubLObject v_term = NIL;
      cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list147 );
      var = current.first();
      current = ( v_term = current.rest() );
      ans = conses_high.nsubst( v_term, var, ans, UNPROVIDED, UNPROVIDED );
      cdolist_list_var = cdolist_list_var.rest();
      binding = cdolist_list_var.first();
    }
    return ans;
  }

  @SubLTranslatedFile.SubL(source = "cycl/rkf-salient-descriptor.lisp", position = 58973L)
  public static SubLObject rkf_sd_existentially_bind_vars(SubLObject formula)
  {
    SubLObject cdolist_list_var = el_utilities.sentence_free_variables( formula, UNPROVIDED, UNPROVIDED, UNPROVIDED );
    SubLObject var = NIL;
    var = cdolist_list_var.first();
    while ( NIL != cdolist_list_var)
    {
      formula = el_utilities.make_existential( var, formula );
      cdolist_list_var = cdolist_list_var.rest();
      var = cdolist_list_var.first();
    }
    return formula;
  }

  @SubLTranslatedFile.SubL(source = "cycl/rkf-salient-descriptor.lisp", position = 59153L)
  public static SubLObject rkf_sd_check_lit_internal(final SubLObject lit, final SubLObject el_bindings, final SubLObject el_vars)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    SubLObject el = el_utilities.copy_expression( lit );
    SubLObject bound = NIL;
    SubLObject result = $kw174$UNKNOWN;
    SubLObject list_var = NIL;
    SubLObject el_var = NIL;
    SubLObject i = NIL;
    list_var = el_vars;
    el_var = list_var.first();
    for( i = ZERO_INTEGER; NIL != list_var; list_var = list_var.rest(), el_var = list_var.first(), i = Numbers.add( ONE_INTEGER, i ) )
    {
      final SubLObject hl_var = variables.find_variable_by_id( i );
      el = conses_high.nsubst( el_var, hl_var, el, UNPROVIDED, UNPROVIDED );
    }
    el = rkf_subst_el_bindings( el_bindings, el );
    bound = rkf_sd_existentially_bind_vars( el_utilities.copy_expression( el ) );
    if( NIL == rkf_sd_el_wffP( el, mt_relevance_macros.$mt$.getDynamicValue( thread ) ) )
    {
      result = $kw177$MALFORMED;
    }
    else if( NIL != rkf_relevance_utilities.rkf_irrelevant_formula( lit, mt_relevance_macros.$mt$.getDynamicValue( thread ) ) )
    {
      result = $kw178$IRRELEVANT;
    }
    else if( NIL != rkf_sd_known( el_utilities.make_negation( bound ), mt_relevance_macros.$mt$.getDynamicValue( thread ), UNPROVIDED ) )
    {
      result = $kw179$FALSE;
    }
    else if( NIL != rkf_sd_known( bound, mt_relevance_macros.$mt$.getDynamicValue( thread ), UNPROVIDED ) )
    {
      result = $kw173$KNOWN;
    }
    return Values.values( result, el );
  }

  @SubLTranslatedFile.SubL(source = "cycl/rkf-salient-descriptor.lisp", position = 59153L)
  public static SubLObject rkf_sd_check_lit(final SubLObject lit, final SubLObject el_bindings, final SubLObject el_vars)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    final SubLObject v_memoization_state = memoization_state.$memoization_state$.getDynamicValue( thread );
    SubLObject caching_state = NIL;
    if( NIL == v_memoization_state )
    {
      return rkf_sd_check_lit_internal( lit, el_bindings, el_vars );
    }
    caching_state = memoization_state.memoization_state_lookup( v_memoization_state, $sym176$RKF_SD_CHECK_LIT, UNPROVIDED );
    if( NIL == caching_state )
    {
      caching_state = memoization_state.create_caching_state( memoization_state.memoization_state_lock( v_memoization_state ), $sym176$RKF_SD_CHECK_LIT, THREE_INTEGER, NIL, EQUAL, UNPROVIDED );
      memoization_state.memoization_state_put( v_memoization_state, $sym176$RKF_SD_CHECK_LIT, caching_state );
    }
    final SubLObject sxhash = memoization_state.sxhash_calc_3( lit, el_bindings, el_vars );
    final SubLObject collisions = memoization_state.caching_state_lookup( caching_state, sxhash, UNPROVIDED );
    if( !collisions.eql( memoization_state.$memoized_item_not_found$.getGlobalValue() ) )
    {
      SubLObject cdolist_list_var = collisions;
      SubLObject collision = NIL;
      collision = cdolist_list_var.first();
      while ( NIL != cdolist_list_var)
      {
        SubLObject cached_args = collision.first();
        final SubLObject results2 = conses_high.second( collision );
        if( lit.equal( cached_args.first() ) )
        {
          cached_args = cached_args.rest();
          if( el_bindings.equal( cached_args.first() ) )
          {
            cached_args = cached_args.rest();
            if( NIL != cached_args && NIL == cached_args.rest() && el_vars.equal( cached_args.first() ) )
            {
              return memoization_state.caching_results( results2 );
            }
          }
        }
        cdolist_list_var = cdolist_list_var.rest();
        collision = cdolist_list_var.first();
      }
    }
    final SubLObject results3 = Values.arg2( thread.resetMultipleValues(), Values.multiple_value_list( rkf_sd_check_lit_internal( lit, el_bindings, el_vars ) ) );
    memoization_state.caching_state_enter_multi_key_n( caching_state, sxhash, collisions, results3, ConsesLow.list( lit, el_bindings, el_vars ) );
    return memoization_state.caching_results( results3 );
  }

  @SubLTranslatedFile.SubL(source = "cycl/rkf-salient-descriptor.lisp", position = 60172L)
  public static SubLObject rkf_sd_formulas_static_inference_properties(final SubLObject problem_store)
  {
    return ConsesLow.list( $kw69$PROBLEM_STORE, problem_store, $kw104$RESULT_UNIQUENESS, $kw105$BINDINGS );
  }

  @SubLTranslatedFile.SubL(source = "cycl/rkf-salient-descriptor.lisp", position = 60504L)
  public static SubLObject rkf_sd_formulas_dynamic_inference_properties(final SubLObject max_transformation_depth)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    return ConsesLow.list( new SubLObject[] { $kw70$ANSWER_LANGUAGE, $kw71$HL, $kw103$CACHE_INFERENCE_RESULTS_, $cache_salient_descriptor_ask_resultsP$.getDynamicValue( thread ), $kw159$FORGET_EXTRA_RESULTS_, NIL,
      $kw106$RETURN, $kw180$BINDINGS_AND_SUPPORTS, $kw110$MAX_NUMBER, ONE_INTEGER, $kw161$CONTINUABLE_, T, $kw111$MAX_TIME, $rkf_salient_descriptor_time_cutoff$.getDynamicValue( thread ), $kw113$MAX_TRANSFORMATION_DEPTH,
      max_transformation_depth, $kw108$PRODUCTIVITY_LIMIT, $int109$100000
    } );
  }

  @SubLTranslatedFile.SubL(source = "cycl/rkf-salient-descriptor.lisp", position = 61004L)
  public static SubLObject rkf_salient_descriptor_formulas(final SubLObject fort, final SubLObject salience_pred, SubLObject mt)
  {
    if( mt == UNPROVIDED )
    {
      mt = control_vars.$rkf_mt$.getDynamicValue();
    }
    final SubLThread thread = SubLProcess.currentSubLThread();
    SubLObject formulas = NIL;
    SubLObject justifications = NIL;
    final SubLObject _prev_bind_0 = control_vars.$within_assert$.currentBinding( thread );
    final SubLObject _prev_bind_2 = wff_utilities.$check_arg_typesP$.currentBinding( thread );
    final SubLObject _prev_bind_3 = at_vars.$at_check_arg_typesP$.currentBinding( thread );
    final SubLObject _prev_bind_4 = wff_utilities.$check_wff_semanticsP$.currentBinding( thread );
    final SubLObject _prev_bind_5 = wff_utilities.$check_wff_coherenceP$.currentBinding( thread );
    final SubLObject _prev_bind_6 = wff_utilities.$check_var_typesP$.currentBinding( thread );
    final SubLObject _prev_bind_7 = czer_vars.$simplify_literalP$.currentBinding( thread );
    final SubLObject _prev_bind_8 = at_vars.$at_check_relator_constraintsP$.currentBinding( thread );
    final SubLObject _prev_bind_9 = at_vars.$at_check_arg_formatP$.currentBinding( thread );
    final SubLObject _prev_bind_10 = wff_vars.$validate_constantsP$.currentBinding( thread );
    final SubLObject _prev_bind_11 = system_parameters.$suspend_sbhl_type_checkingP$.currentBinding( thread );
    try
    {
      control_vars.$within_assert$.bind( NIL, thread );
      wff_utilities.$check_arg_typesP$.bind( NIL, thread );
      at_vars.$at_check_arg_typesP$.bind( NIL, thread );
      wff_utilities.$check_wff_semanticsP$.bind( NIL, thread );
      wff_utilities.$check_wff_coherenceP$.bind( NIL, thread );
      wff_utilities.$check_var_typesP$.bind( NIL, thread );
      czer_vars.$simplify_literalP$.bind( NIL, thread );
      at_vars.$at_check_relator_constraintsP$.bind( NIL, thread );
      at_vars.$at_check_arg_formatP$.bind( NIL, thread );
      wff_vars.$validate_constantsP$.bind( NIL, thread );
      system_parameters.$suspend_sbhl_type_checkingP$.bind( T, thread );
      final SubLObject local_state;
      final SubLObject state = local_state = memoization_state.possibly_new_memoization_state();
      final SubLObject _prev_bind_0_$113 = memoization_state.$memoization_state$.currentBinding( thread );
      try
      {
        memoization_state.$memoization_state$.bind( local_state, thread );
        final SubLObject original_memoization_process = memoization_state.memoization_state_original_process( local_state );
        try
        {
          final SubLObject already_resourcing_p = sbhl_marking_vars.$resourcing_sbhl_marking_spaces_p$.getDynamicValue( thread );
          final SubLObject _prev_bind_0_$114 = sbhl_marking_vars.$resourced_sbhl_marking_space_limit$.currentBinding( thread );
          final SubLObject _prev_bind_1_$115 = sbhl_marking_vars.$resourced_sbhl_marking_spaces$.currentBinding( thread );
          final SubLObject _prev_bind_2_$116 = sbhl_marking_vars.$resourcing_sbhl_marking_spaces_p$.currentBinding( thread );
          try
          {
            sbhl_marking_vars.$resourced_sbhl_marking_space_limit$.bind( sbhl_marking_vars.determine_resource_limit( already_resourcing_p, SIX_INTEGER ), thread );
            sbhl_marking_vars.$resourced_sbhl_marking_spaces$.bind( sbhl_marking_vars.possibly_new_marking_resource( already_resourcing_p ), thread );
            sbhl_marking_vars.$resourcing_sbhl_marking_spaces_p$.bind( T, thread );
            final SubLObject formula_var = $sym181$_FORMULA;
            final SubLObject inference = rkf_salient_descriptor_formulas_inference( fort, formula_var, salience_pred, mt );
            final SubLObject max_depth_max = $rkf_sd_formulas_max_depth_max$.getDynamicValue( thread );
            SubLObject max_depth = ZERO_INTEGER;
            SubLObject results_queue = NIL;
            SubLObject no_more_bindingsP = NIL;
            while ( NIL == no_more_bindingsP && ( !$rkf_salient_descriptor_number_cutoff$.getDynamicValue( thread ).isNumber() || NIL == list_utilities.lengthG( formulas, $rkf_salient_descriptor_number_cutoff$
                .getDynamicValue( thread ), UNPROVIDED ) ))
            {
              thread.resetMultipleValues();
              final SubLObject new_formulas = rkf_salient_descriptor_formulas_one_batch( inference, max_depth, mt, formula_var, results_queue );
              final SubLObject new_justs = thread.secondMultipleValue();
              final SubLObject exit_condition = thread.thirdMultipleValue();
              final SubLObject more_results = thread.fourthMultipleValue();
              thread.resetMultipleValues();
              results_queue = more_results;
              SubLObject new_formula = NIL;
              SubLObject new_formula_$117 = NIL;
              SubLObject new_just = NIL;
              SubLObject new_just_$118 = NIL;
              new_formula = new_formulas;
              new_formula_$117 = new_formula.first();
              new_just = new_justs;
              new_just_$118 = new_just.first();
              while ( NIL != new_just || NIL != new_formula)
              {
                formulas = ConsesLow.cons( new_formula_$117, formulas );
                justifications = ConsesLow.cons( new_just_$118, justifications );
                new_formula = new_formula.rest();
                new_formula_$117 = new_formula.first();
                new_just = new_just.rest();
                new_just_$118 = new_just.first();
              }
              if( $kw111$MAX_TIME == exit_condition )
              {
                Errors.warn( $str182$Timed_out_after__S_seconds_gettin, $rkf_salient_descriptor_time_cutoff$.getDynamicValue( thread ), salience_pred, fort );
                no_more_bindingsP = T;
              }
              else if( $kw112$PROBABLY_APPROXIMATELY_DONE == exit_condition )
              {
                Errors.warn( $str183$P_A_D__getting__S_for__S___, salience_pred, fort );
                no_more_bindingsP = T;
              }
              else if( NIL == inference_datastructures_inference.continuable_inference_p( inference ) )
              {
                no_more_bindingsP = T;
              }
              else if( NIL != inference_datastructures_enumerated_types.exhausted_inference_suspend_status_p( exit_condition ) && max_depth.numGE( max_depth_max ) )
              {
                no_more_bindingsP = T;
              }
              else
              {
                if( NIL == inference_datastructures_enumerated_types.exhausted_inference_suspend_status_p( exit_condition ) )
                {
                  continue;
                }
                max_depth = Numbers.add( max_depth, ONE_INTEGER );
              }
            }
          }
          finally
          {
            sbhl_marking_vars.$resourcing_sbhl_marking_spaces_p$.rebind( _prev_bind_2_$116, thread );
            sbhl_marking_vars.$resourced_sbhl_marking_spaces$.rebind( _prev_bind_1_$115, thread );
            sbhl_marking_vars.$resourced_sbhl_marking_space_limit$.rebind( _prev_bind_0_$114, thread );
          }
        }
        finally
        {
          final SubLObject _prev_bind_0_$115 = Threads.$is_thread_performing_cleanupP$.currentBinding( thread );
          try
          {
            Threads.$is_thread_performing_cleanupP$.bind( T, thread );
            final SubLObject _values = Values.getValuesAsVector();
            memoization_state.memoization_state_possibly_clear_original_process( local_state, original_memoization_process );
            Values.restoreValuesFromVector( _values );
          }
          finally
          {
            Threads.$is_thread_performing_cleanupP$.rebind( _prev_bind_0_$115, thread );
          }
        }
      }
      finally
      {
        memoization_state.$memoization_state$.rebind( _prev_bind_0_$113, thread );
      }
    }
    finally
    {
      system_parameters.$suspend_sbhl_type_checkingP$.rebind( _prev_bind_11, thread );
      wff_vars.$validate_constantsP$.rebind( _prev_bind_10, thread );
      at_vars.$at_check_arg_formatP$.rebind( _prev_bind_9, thread );
      at_vars.$at_check_relator_constraintsP$.rebind( _prev_bind_8, thread );
      czer_vars.$simplify_literalP$.rebind( _prev_bind_7, thread );
      wff_utilities.$check_var_typesP$.rebind( _prev_bind_6, thread );
      wff_utilities.$check_wff_coherenceP$.rebind( _prev_bind_5, thread );
      wff_utilities.$check_wff_semanticsP$.rebind( _prev_bind_4, thread );
      at_vars.$at_check_arg_typesP$.rebind( _prev_bind_3, thread );
      wff_utilities.$check_arg_typesP$.rebind( _prev_bind_2, thread );
      control_vars.$within_assert$.rebind( _prev_bind_0, thread );
    }
    return Values.values( formulas, justifications );
  }

  @SubLTranslatedFile.SubL(source = "cycl/rkf-salient-descriptor.lisp", position = 62871L)
  public static SubLObject rkf_salient_descriptor_formulas_inference(final SubLObject fort, final SubLObject formula_var, final SubLObject salience_pred, final SubLObject mt)
  {
    final SubLObject problem_store = rkf_sd_find_or_make_problem_store();
    final SubLObject test_sentence = ConsesLow.list( salience_pred, fort, formula_var );
    final SubLObject inference = inference_kernel.new_continuable_inference( test_sentence, mt, rkf_sd_formulas_static_inference_properties( problem_store ) );
    return inference;
  }

  @SubLTranslatedFile.SubL(source = "cycl/rkf-salient-descriptor.lisp", position = 63238L)
  public static SubLObject rkf_salient_descriptor_formulas_one_batch_continue_inference(final SubLObject inference, final SubLObject inference_properties)
  {
    return inference_kernel.continue_inference( inference, inference_properties );
  }

  @SubLTranslatedFile.SubL(source = "cycl/rkf-salient-descriptor.lisp", position = 63410L)
  public static SubLObject rkf_salient_descriptor_formulas_one_batch(final SubLObject inference, final SubLObject max_depth, final SubLObject mt, final SubLObject formula_var, SubLObject ask_results)
  {
    if( ask_results == UNPROVIDED )
    {
      ask_results = NIL;
    }
    final SubLThread thread = SubLProcess.currentSubLThread();
    SubLObject formulas = NIL;
    SubLObject justifications = NIL;
    final SubLObject inference_properties = rkf_sd_formulas_dynamic_inference_properties( max_depth );
    final SubLObject max_time = conses_high.getf( inference_properties, $kw111$MAX_TIME, NIL );
    final SubLObject max_internal_real_time = ( NIL != max_time ) ? numeric_date_utilities.elapsed_seconds_to_elapsed_internal_real_time( max_time ) : NIL;
    SubLObject total_internal_real_time = ZERO_INTEGER;
    for( SubLObject doneP = NIL; NIL == doneP; doneP = T )
    {
      final SubLObject start_internal_real_time = Time.get_internal_real_time();
      if( NIL == ask_results )
      {
        ask_results = rkf_salient_descriptor_formulas_one_batch_continue_inference( inference, inference_properties );
      }
      total_internal_real_time = Numbers.add( total_internal_real_time, numeric_date_utilities.elapsed_internal_real_time( start_internal_real_time, UNPROVIDED ) );
      while ( NIL != ask_results && NIL == formulas)
      {
        final SubLObject result = ask_results.first();
        ask_results = ask_results.rest();
        SubLObject current;
        final SubLObject datum = current = result;
        SubLObject v_bindings = NIL;
        SubLObject supports = NIL;
        cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list184 );
        v_bindings = current.first();
        current = current.rest();
        cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list184 );
        supports = current.first();
        current = current.rest();
        if( NIL == current )
        {
          SubLObject badP = NIL;
          if( NIL == badP )
          {
            SubLObject csome_list_var = supports;
            SubLObject support = NIL;
            support = csome_list_var.first();
            while ( NIL == badP && NIL != csome_list_var)
            {
              if( NIL != rkf_deprecated_sd_ruleP( support, mt ) )
              {
                badP = T;
              }
              csome_list_var = csome_list_var.rest();
              support = csome_list_var.first();
            }
          }
          if( NIL != badP )
          {
            continue;
          }
          final SubLObject formula = bindings.variable_lookup( formula_var, v_bindings );
          if( NIL == el_utilities.el_existential_p( formula ) )
          {
            continue;
          }
          final SubLObject de_existentialized = rkf_sd_existentially_unbind( formula );
          if( NIL != rkf_irrelevant_sd_formulaP( de_existentialized, mt ) || ( NIL != $rkf_sd_exclude_known_promptsP$.getDynamicValue( thread ) && NIL != rkf_sd_known( de_existentialized, mt, T ) ) )
          {
            continue;
          }
          formulas = ConsesLow.cons( de_existentialized, formulas );
          justifications = ConsesLow.cons( supports, justifications );
        }
        else
        {
          cdestructuring_bind.cdestructuring_bind_error( datum, $list184 );
        }
      }
      if( NIL != formulas || $kw110$MAX_NUMBER != inference_datastructures_inference.inference_suspend_status( inference ) || ( max_internal_real_time.isInteger() && !total_internal_real_time.numL(
          max_internal_real_time ) ) )
      {
      }
    }
    return Values.values( formulas, justifications, inference_datastructures_inference.inference_suspend_status( inference ), ask_results );
  }

  @SubLTranslatedFile.SubL(source = "cycl/rkf-salient-descriptor.lisp", position = 66091L)
  public static SubLObject rkf_irrelevant_sd_formulaP(final SubLObject de_existentialized_formula, final SubLObject mt)
  {
    final SubLObject prompt_formula = rkf_sd_remove_nonassertible_conjuncts( de_existentialized_formula );
    return makeBoolean( NIL == prompt_formula || NIL != list_utilities.sublisp_boolean( rkf_relevance_utilities.rkf_irrelevant_formula( prompt_formula, mt ) ) );
  }

  @SubLTranslatedFile.SubL(source = "cycl/rkf-salient-descriptor.lisp", position = 66554L)
  public static SubLObject rkf_sd_remove_nonassertible_conjuncts(final SubLObject el_formula)
  {
    if( NIL == el_utilities.el_conjunction_p( el_formula ) )
    {
      return el_formula;
    }
    SubLObject assertible_conjuncts = NIL;
    SubLObject cdolist_list_var;
    final SubLObject args = cdolist_list_var = cycl_utilities.formula_args( el_formula, $kw185$IGNORE );
    SubLObject conjunct = NIL;
    conjunct = cdolist_list_var.first();
    while ( NIL != cdolist_list_var)
    {
      if( NIL == kb_accessors.not_assertible_predicateP( cycl_utilities.formula_arg0( conjunct ), UNPROVIDED ) )
      {
        assertible_conjuncts = ConsesLow.cons( conjunct, assertible_conjuncts );
      }
      cdolist_list_var = cdolist_list_var.rest();
      conjunct = cdolist_list_var.first();
    }
    return rkf_sd_conjoin( Sequences.nreverse( assertible_conjuncts ), UNPROVIDED, UNPROVIDED );
  }

  @SubLTranslatedFile.SubL(source = "cycl/rkf-salient-descriptor.lisp", position = 70001L)
  public static SubLObject initialize_rkf_deprecated_rules()
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    $rkf_deprecated_rules$.setGlobalValue( dictionary.new_dictionary( Symbols.symbol_function( EQUAL ), UNPROVIDED ) );
    final SubLObject _prev_bind_0 = mt_relevance_macros.$relevant_mt_function$.currentBinding( thread );
    final SubLObject _prev_bind_2 = mt_relevance_macros.$mt$.currentBinding( thread );
    try
    {
      mt_relevance_macros.$relevant_mt_function$.bind( $sym187$RELEVANT_MT_IS_EVERYTHING, thread );
      mt_relevance_macros.$mt$.bind( $const188$EverythingPSC, thread );
      final SubLObject node_var = $const189$deprecatedSalientDescriptorRule;
      final SubLObject deck_type = $kw29$QUEUE;
      final SubLObject recur_deck = deck.create_deck( deck_type );
      SubLObject node_and_predicate_mode = NIL;
      final SubLObject _prev_bind_0_$120 = sbhl_marking_vars.$sbhl_space$.currentBinding( thread );
      try
      {
        sbhl_marking_vars.$sbhl_space$.bind( sbhl_marking_vars.get_sbhl_marking_space(), thread );
        try
        {
          final SubLObject tv_var = NIL;
          final SubLObject _prev_bind_0_$121 = sbhl_search_vars.$sbhl_tv$.currentBinding( thread );
          final SubLObject _prev_bind_1_$122 = sbhl_search_vars.$relevant_sbhl_tv_function$.currentBinding( thread );
          try
          {
            sbhl_search_vars.$sbhl_tv$.bind( ( NIL != tv_var ) ? tv_var : sbhl_search_vars.get_sbhl_true_tv(), thread );
            sbhl_search_vars.$relevant_sbhl_tv_function$.bind( ( NIL != tv_var ) ? $sym31$RELEVANT_SBHL_TV_IS_GENERAL_TV : sbhl_search_vars.$relevant_sbhl_tv_function$.getDynamicValue( thread ), thread );
            if( NIL != tv_var && NIL != sbhl_paranoia.sbhl_object_type_checking_p() && NIL == sbhl_search_vars.sbhl_true_tv_p( tv_var ) )
            {
              final SubLObject pcase_var = sbhl_paranoia.$sbhl_type_error_action$.getDynamicValue( thread );
              if( pcase_var.eql( $kw32$ERROR ) )
              {
                sbhl_paranoia.sbhl_error( ONE_INTEGER, $str33$_A_is_not_a__A, tv_var, $sym34$SBHL_TRUE_TV_P, UNPROVIDED, UNPROVIDED, UNPROVIDED );
              }
              else if( pcase_var.eql( $kw35$CERROR ) )
              {
                sbhl_paranoia.sbhl_cerror( ONE_INTEGER, $str36$continue_anyway, $str33$_A_is_not_a__A, tv_var, $sym34$SBHL_TRUE_TV_P, UNPROVIDED, UNPROVIDED, UNPROVIDED );
              }
              else if( pcase_var.eql( $kw37$WARN ) )
              {
                Errors.warn( $str33$_A_is_not_a__A, tv_var, $sym34$SBHL_TRUE_TV_P );
              }
              else
              {
                Errors.warn( $str38$_A_is_not_a_valid__sbhl_type_erro, sbhl_paranoia.$sbhl_type_error_action$.getDynamicValue( thread ) );
                Errors.cerror( $str36$continue_anyway, $str33$_A_is_not_a__A, tv_var, $sym34$SBHL_TRUE_TV_P );
              }
            }
            final SubLObject _prev_bind_0_$122 = sbhl_search_vars.$sbhl_search_module$.currentBinding( thread );
            final SubLObject _prev_bind_1_$123 = sbhl_search_vars.$sbhl_search_module_type$.currentBinding( thread );
            final SubLObject _prev_bind_3 = sbhl_search_vars.$sbhl_add_node_to_result_test$.currentBinding( thread );
            final SubLObject _prev_bind_4 = sbhl_search_vars.$genl_inverse_mode_p$.currentBinding( thread );
            final SubLObject _prev_bind_5 = sbhl_module_vars.$sbhl_module$.currentBinding( thread );
            try
            {
              sbhl_search_vars.$sbhl_search_module$.bind( sbhl_module_vars.get_sbhl_module( $const41$genlPreds ), thread );
              sbhl_search_vars.$sbhl_search_module_type$.bind( sbhl_module_utilities.get_sbhl_module_type( sbhl_module_vars.get_sbhl_module( $const41$genlPreds ) ), thread );
              sbhl_search_vars.$sbhl_add_node_to_result_test$.bind( sbhl_module_utilities.get_sbhl_add_node_to_result_test( sbhl_module_vars.get_sbhl_module( $const41$genlPreds ) ), thread );
              sbhl_search_vars.$genl_inverse_mode_p$.bind( NIL, thread );
              sbhl_module_vars.$sbhl_module$.bind( sbhl_module_vars.get_sbhl_module( $const41$genlPreds ), thread );
              if( NIL != sbhl_paranoia.suspend_sbhl_type_checkingP() || NIL != sbhl_module_utilities.apply_sbhl_module_type_test( $const189$deprecatedSalientDescriptorRule, sbhl_module_vars.get_sbhl_module(
                  UNPROVIDED ) ) )
              {
                final SubLObject _prev_bind_0_$123 = sbhl_search_vars.$sbhl_search_direction$.currentBinding( thread );
                final SubLObject _prev_bind_1_$124 = sbhl_link_vars.$sbhl_link_direction$.currentBinding( thread );
                final SubLObject _prev_bind_2_$127 = sbhl_search_vars.$genl_inverse_mode_p$.currentBinding( thread );
                try
                {
                  sbhl_search_vars.$sbhl_search_direction$.bind( sbhl_search_vars.get_sbhl_backward_search_direction(), thread );
                  sbhl_link_vars.$sbhl_link_direction$.bind( sbhl_module_utilities.sbhl_search_direction_to_link_direction( sbhl_search_vars.get_sbhl_backward_search_direction(), sbhl_module_vars.get_sbhl_module(
                      $const41$genlPreds ) ), thread );
                  sbhl_search_vars.$genl_inverse_mode_p$.bind( NIL, thread );
                  sbhl_marking_utilities.sbhl_mark_node_marked( node_var, UNPROVIDED );
                  for( node_and_predicate_mode = ConsesLow.list( $const189$deprecatedSalientDescriptorRule, sbhl_search_vars.genl_inverse_mode_p() ); NIL != node_and_predicate_mode; node_and_predicate_mode = deck
                      .deck_pop( recur_deck ) )
                  {
                    final SubLObject node_var_$128 = node_and_predicate_mode.first();
                    final SubLObject predicate_mode = conses_high.second( node_and_predicate_mode );
                    final SubLObject dep_pred = node_var_$128;
                    final SubLObject _prev_bind_0_$124 = sbhl_search_vars.$genl_inverse_mode_p$.currentBinding( thread );
                    try
                    {
                      sbhl_search_vars.$genl_inverse_mode_p$.bind( predicate_mode, thread );
                      if( NIL != sbhl_search_utilities.apply_sbhl_add_node_test( sbhl_search_vars.get_sbhl_search_add_node_test(), node_var_$128 ) )
                      {
                        final SubLObject pred_var = dep_pred;
                        if( NIL != kb_mapping_macros.do_predicate_extent_index_key_validator( pred_var ) )
                        {
                          final SubLObject str = NIL;
                          final SubLObject _prev_bind_0_$125 = utilities_macros.$progress_start_time$.currentBinding( thread );
                          final SubLObject _prev_bind_1_$125 = utilities_macros.$progress_last_pacification_time$.currentBinding( thread );
                          final SubLObject _prev_bind_2_$128 = utilities_macros.$progress_elapsed_seconds_for_notification$.currentBinding( thread );
                          final SubLObject _prev_bind_3_$133 = utilities_macros.$progress_notification_count$.currentBinding( thread );
                          final SubLObject _prev_bind_4_$134 = utilities_macros.$progress_pacifications_since_last_nl$.currentBinding( thread );
                          final SubLObject _prev_bind_6 = utilities_macros.$progress_count$.currentBinding( thread );
                          final SubLObject _prev_bind_7 = utilities_macros.$is_noting_progressP$.currentBinding( thread );
                          final SubLObject _prev_bind_8 = utilities_macros.$silent_progressP$.currentBinding( thread );
                          try
                          {
                            utilities_macros.$progress_start_time$.bind( Time.get_universal_time(), thread );
                            utilities_macros.$progress_last_pacification_time$.bind( utilities_macros.$progress_start_time$.getDynamicValue( thread ), thread );
                            utilities_macros.$progress_elapsed_seconds_for_notification$.bind( utilities_macros.$suppress_all_progress_faster_than_seconds$.getDynamicValue( thread ), thread );
                            utilities_macros.$progress_notification_count$.bind( ZERO_INTEGER, thread );
                            utilities_macros.$progress_pacifications_since_last_nl$.bind( ZERO_INTEGER, thread );
                            utilities_macros.$progress_count$.bind( ZERO_INTEGER, thread );
                            utilities_macros.$is_noting_progressP$.bind( T, thread );
                            utilities_macros.$silent_progressP$.bind( ( NIL != str ) ? utilities_macros.$silent_progressP$.getDynamicValue( thread ) : T, thread );
                            utilities_macros.noting_progress_preamble( str );
                            final SubLObject iterator_var = kb_mapping_macros.new_predicate_extent_final_index_spec_iterator( pred_var );
                            SubLObject done_var = NIL;
                            final SubLObject token_var = NIL;
                            while ( NIL == done_var)
                            {
                              final SubLObject final_index_spec = iteration.iteration_next_without_values_macro_helper( iterator_var, token_var );
                              final SubLObject valid = makeBoolean( !token_var.eql( final_index_spec ) );
                              if( NIL != valid )
                              {
                                utilities_macros.note_progress();
                                SubLObject final_index_iterator = NIL;
                                try
                                {
                                  final_index_iterator = kb_mapping_macros.new_final_index_iterator( final_index_spec, $kw145$GAF, NIL, NIL );
                                  SubLObject done_var_$135 = NIL;
                                  final SubLObject token_var_$136 = NIL;
                                  while ( NIL == done_var_$135)
                                  {
                                    final SubLObject as = iteration.iteration_next_without_values_macro_helper( final_index_iterator, token_var_$136 );
                                    final SubLObject valid_$137 = makeBoolean( !token_var_$136.eql( as ) );
                                    if( NIL != valid_$137 )
                                    {
                                      rkf_deprecate_rule_internal( assertions_high.gaf_arg1( as ), assertions_high.assertion_mt( as ) );
                                    }
                                    done_var_$135 = makeBoolean( NIL == valid_$137 );
                                  }
                                }
                                finally
                                {
                                  final SubLObject _prev_bind_0_$126 = Threads.$is_thread_performing_cleanupP$.currentBinding( thread );
                                  try
                                  {
                                    Threads.$is_thread_performing_cleanupP$.bind( T, thread );
                                    final SubLObject _values = Values.getValuesAsVector();
                                    if( NIL != final_index_iterator )
                                    {
                                      kb_mapping_macros.destroy_final_index_iterator( final_index_iterator );
                                    }
                                    Values.restoreValuesFromVector( _values );
                                  }
                                  finally
                                  {
                                    Threads.$is_thread_performing_cleanupP$.rebind( _prev_bind_0_$126, thread );
                                  }
                                }
                              }
                              done_var = makeBoolean( NIL == valid );
                            }
                            utilities_macros.noting_progress_postamble();
                          }
                          finally
                          {
                            utilities_macros.$silent_progressP$.rebind( _prev_bind_8, thread );
                            utilities_macros.$is_noting_progressP$.rebind( _prev_bind_7, thread );
                            utilities_macros.$progress_count$.rebind( _prev_bind_6, thread );
                            utilities_macros.$progress_pacifications_since_last_nl$.rebind( _prev_bind_4_$134, thread );
                            utilities_macros.$progress_notification_count$.rebind( _prev_bind_3_$133, thread );
                            utilities_macros.$progress_elapsed_seconds_for_notification$.rebind( _prev_bind_2_$128, thread );
                            utilities_macros.$progress_last_pacification_time$.rebind( _prev_bind_1_$125, thread );
                            utilities_macros.$progress_start_time$.rebind( _prev_bind_0_$125, thread );
                          }
                        }
                      }
                      SubLObject cdolist_list_var;
                      final SubLObject accessible_modules = cdolist_list_var = sbhl_macros.get_sbhl_accessible_modules( sbhl_module_vars.get_sbhl_module( $const41$genlPreds ) );
                      SubLObject module_var = NIL;
                      module_var = cdolist_list_var.first();
                      while ( NIL != cdolist_list_var)
                      {
                        final SubLObject _prev_bind_0_$127 = sbhl_module_vars.$sbhl_module$.currentBinding( thread );
                        final SubLObject _prev_bind_1_$126 = sbhl_search_vars.$genl_inverse_mode_p$.currentBinding( thread );
                        try
                        {
                          sbhl_module_vars.$sbhl_module$.bind( module_var, thread );
                          sbhl_search_vars.$genl_inverse_mode_p$.bind( ( NIL != sbhl_search_vars.flip_genl_inverse_modeP( UNPROVIDED, UNPROVIDED ) ) ? makeBoolean( NIL == sbhl_search_vars.$genl_inverse_mode_p$
                              .getDynamicValue( thread ) ) : sbhl_search_vars.$genl_inverse_mode_p$.getDynamicValue( thread ), thread );
                          final SubLObject node = function_terms.naut_to_nart( node_var_$128 );
                          if( NIL != sbhl_link_vars.sbhl_node_object_p( node ) )
                          {
                            final SubLObject d_link = sbhl_graphs.get_sbhl_graph_link( node, sbhl_module_vars.get_sbhl_module( UNPROVIDED ) );
                            if( NIL != d_link )
                            {
                              final SubLObject mt_links = sbhl_links.get_sbhl_mt_links( d_link, sbhl_link_vars.get_sbhl_link_direction(), sbhl_module_vars.get_sbhl_module( UNPROVIDED ) );
                              if( NIL != mt_links )
                              {
                                SubLObject iteration_state;
                                for( iteration_state = dictionary_contents.do_dictionary_contents_state( dictionary.dictionary_contents( mt_links ) ); NIL == dictionary_contents.do_dictionary_contents_doneP(
                                    iteration_state ); iteration_state = dictionary_contents.do_dictionary_contents_next( iteration_state ) )
                                {
                                  thread.resetMultipleValues();
                                  final SubLObject mt = dictionary_contents.do_dictionary_contents_key_value( iteration_state );
                                  final SubLObject tv_links = thread.secondMultipleValue();
                                  thread.resetMultipleValues();
                                  if( NIL != mt_relevance_macros.relevant_mtP( mt ) )
                                  {
                                    final SubLObject _prev_bind_0_$128 = sbhl_link_vars.$sbhl_link_mt$.currentBinding( thread );
                                    try
                                    {
                                      sbhl_link_vars.$sbhl_link_mt$.bind( mt, thread );
                                      SubLObject iteration_state_$142;
                                      for( iteration_state_$142 = dictionary_contents.do_dictionary_contents_state( dictionary.dictionary_contents( tv_links ) ); NIL == dictionary_contents.do_dictionary_contents_doneP(
                                          iteration_state_$142 ); iteration_state_$142 = dictionary_contents.do_dictionary_contents_next( iteration_state_$142 ) )
                                      {
                                        thread.resetMultipleValues();
                                        final SubLObject tv = dictionary_contents.do_dictionary_contents_key_value( iteration_state_$142 );
                                        final SubLObject link_nodes = thread.secondMultipleValue();
                                        thread.resetMultipleValues();
                                        if( NIL != sbhl_search_vars.relevant_sbhl_tvP( tv ) )
                                        {
                                          final SubLObject _prev_bind_0_$129 = sbhl_link_vars.$sbhl_link_tv$.currentBinding( thread );
                                          try
                                          {
                                            sbhl_link_vars.$sbhl_link_tv$.bind( tv, thread );
                                            final SubLObject sol = link_nodes;
                                            if( NIL != set.set_p( sol ) )
                                            {
                                              final SubLObject set_contents_var = set.do_set_internal( sol );
                                              SubLObject basis_object;
                                              SubLObject state;
                                              SubLObject node_vars_link_node;
                                              for( basis_object = set_contents.do_set_contents_basis_object( set_contents_var ), state = NIL, state = set_contents.do_set_contents_initial_state( basis_object,
                                                  set_contents_var ); NIL == set_contents.do_set_contents_doneP( basis_object, state ); state = set_contents.do_set_contents_update_state( state ) )
                                              {
                                                node_vars_link_node = set_contents.do_set_contents_next( basis_object, state );
                                                if( NIL != set_contents.do_set_contents_element_validP( state, node_vars_link_node ) && NIL == sbhl_marking_utilities.sbhl_search_path_termination_p( node_vars_link_node,
                                                    UNPROVIDED ) )
                                                {
                                                  sbhl_marking_utilities.sbhl_mark_node_marked( node_vars_link_node, UNPROVIDED );
                                                  deck.deck_push( ConsesLow.list( node_vars_link_node, sbhl_search_vars.genl_inverse_mode_p() ), recur_deck );
                                                }
                                              }
                                            }
                                            else if( sol.isList() )
                                            {
                                              SubLObject csome_list_var = sol;
                                              SubLObject node_vars_link_node2 = NIL;
                                              node_vars_link_node2 = csome_list_var.first();
                                              while ( NIL != csome_list_var)
                                              {
                                                if( NIL == sbhl_marking_utilities.sbhl_search_path_termination_p( node_vars_link_node2, UNPROVIDED ) )
                                                {
                                                  sbhl_marking_utilities.sbhl_mark_node_marked( node_vars_link_node2, UNPROVIDED );
                                                  deck.deck_push( ConsesLow.list( node_vars_link_node2, sbhl_search_vars.genl_inverse_mode_p() ), recur_deck );
                                                }
                                                csome_list_var = csome_list_var.rest();
                                                node_vars_link_node2 = csome_list_var.first();
                                              }
                                            }
                                            else
                                            {
                                              Errors.error( $str42$_A_is_neither_SET_P_nor_LISTP_, sol );
                                            }
                                          }
                                          finally
                                          {
                                            sbhl_link_vars.$sbhl_link_tv$.rebind( _prev_bind_0_$129, thread );
                                          }
                                        }
                                      }
                                      dictionary_contents.do_dictionary_contents_finalize( iteration_state_$142 );
                                    }
                                    finally
                                    {
                                      sbhl_link_vars.$sbhl_link_mt$.rebind( _prev_bind_0_$128, thread );
                                    }
                                  }
                                }
                                dictionary_contents.do_dictionary_contents_finalize( iteration_state );
                              }
                            }
                            else
                            {
                              sbhl_paranoia.sbhl_error( FIVE_INTEGER, $str43$attempting_to_bind_direction_link, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED );
                            }
                          }
                          else if( NIL != obsolete.cnat_p( node, UNPROVIDED ) )
                          {
                            SubLObject cdolist_list_var_$144;
                            final SubLObject new_list = cdolist_list_var_$144 = ( ( NIL != sbhl_link_vars.sbhl_randomize_lists_p() ) ? list_utilities.randomize_list( sbhl_module_utilities
                                .get_sbhl_module_relevant_naut_link_generators( sbhl_link_vars.get_sbhl_link_direction(), sbhl_search_vars.$sbhl_tv$.getDynamicValue( thread ), sbhl_module_vars.get_sbhl_module(
                                    UNPROVIDED ) ) )
                                : sbhl_module_utilities.get_sbhl_module_relevant_naut_link_generators( sbhl_link_vars.get_sbhl_link_direction(), sbhl_search_vars.$sbhl_tv$.getDynamicValue( thread ), sbhl_module_vars
                                    .get_sbhl_module( UNPROVIDED ) ) );
                            SubLObject generating_fn = NIL;
                            generating_fn = cdolist_list_var_$144.first();
                            while ( NIL != cdolist_list_var_$144)
                            {
                              final SubLObject _prev_bind_0_$130 = sbhl_link_vars.$sbhl_link_generator$.currentBinding( thread );
                              try
                              {
                                sbhl_link_vars.$sbhl_link_generator$.bind( generating_fn, thread );
                                final SubLObject sol2;
                                final SubLObject link_nodes2 = sol2 = Functions.funcall( generating_fn, node );
                                if( NIL != set.set_p( sol2 ) )
                                {
                                  final SubLObject set_contents_var2 = set.do_set_internal( sol2 );
                                  SubLObject basis_object2;
                                  SubLObject state2;
                                  SubLObject node_vars_link_node3;
                                  for( basis_object2 = set_contents.do_set_contents_basis_object( set_contents_var2 ), state2 = NIL, state2 = set_contents.do_set_contents_initial_state( basis_object2,
                                      set_contents_var2 ); NIL == set_contents.do_set_contents_doneP( basis_object2, state2 ); state2 = set_contents.do_set_contents_update_state( state2 ) )
                                  {
                                    node_vars_link_node3 = set_contents.do_set_contents_next( basis_object2, state2 );
                                    if( NIL != set_contents.do_set_contents_element_validP( state2, node_vars_link_node3 ) && NIL == sbhl_marking_utilities.sbhl_search_path_termination_p( node_vars_link_node3,
                                        UNPROVIDED ) )
                                    {
                                      sbhl_marking_utilities.sbhl_mark_node_marked( node_vars_link_node3, UNPROVIDED );
                                      deck.deck_push( ConsesLow.list( node_vars_link_node3, sbhl_search_vars.genl_inverse_mode_p() ), recur_deck );
                                    }
                                  }
                                }
                                else if( sol2.isList() )
                                {
                                  SubLObject csome_list_var2 = sol2;
                                  SubLObject node_vars_link_node4 = NIL;
                                  node_vars_link_node4 = csome_list_var2.first();
                                  while ( NIL != csome_list_var2)
                                  {
                                    if( NIL == sbhl_marking_utilities.sbhl_search_path_termination_p( node_vars_link_node4, UNPROVIDED ) )
                                    {
                                      sbhl_marking_utilities.sbhl_mark_node_marked( node_vars_link_node4, UNPROVIDED );
                                      deck.deck_push( ConsesLow.list( node_vars_link_node4, sbhl_search_vars.genl_inverse_mode_p() ), recur_deck );
                                    }
                                    csome_list_var2 = csome_list_var2.rest();
                                    node_vars_link_node4 = csome_list_var2.first();
                                  }
                                }
                                else
                                {
                                  Errors.error( $str42$_A_is_neither_SET_P_nor_LISTP_, sol2 );
                                }
                              }
                              finally
                              {
                                sbhl_link_vars.$sbhl_link_generator$.rebind( _prev_bind_0_$130, thread );
                              }
                              cdolist_list_var_$144 = cdolist_list_var_$144.rest();
                              generating_fn = cdolist_list_var_$144.first();
                            }
                          }
                        }
                        finally
                        {
                          sbhl_search_vars.$genl_inverse_mode_p$.rebind( _prev_bind_1_$126, thread );
                          sbhl_module_vars.$sbhl_module$.rebind( _prev_bind_0_$127, thread );
                        }
                        cdolist_list_var = cdolist_list_var.rest();
                        module_var = cdolist_list_var.first();
                      }
                    }
                    finally
                    {
                      sbhl_search_vars.$genl_inverse_mode_p$.rebind( _prev_bind_0_$124, thread );
                    }
                  }
                }
                finally
                {
                  sbhl_search_vars.$genl_inverse_mode_p$.rebind( _prev_bind_2_$127, thread );
                  sbhl_link_vars.$sbhl_link_direction$.rebind( _prev_bind_1_$124, thread );
                  sbhl_search_vars.$sbhl_search_direction$.rebind( _prev_bind_0_$123, thread );
                }
              }
              else
              {
                sbhl_paranoia.sbhl_warn( TWO_INTEGER, $str44$Node__a_does_not_pass_sbhl_type_t, $const189$deprecatedSalientDescriptorRule, sbhl_module_utilities.get_sbhl_type_test( sbhl_module_vars.get_sbhl_module(
                    UNPROVIDED ) ), UNPROVIDED, UNPROVIDED, UNPROVIDED );
              }
            }
            finally
            {
              sbhl_module_vars.$sbhl_module$.rebind( _prev_bind_5, thread );
              sbhl_search_vars.$genl_inverse_mode_p$.rebind( _prev_bind_4, thread );
              sbhl_search_vars.$sbhl_add_node_to_result_test$.rebind( _prev_bind_3, thread );
              sbhl_search_vars.$sbhl_search_module_type$.rebind( _prev_bind_1_$123, thread );
              sbhl_search_vars.$sbhl_search_module$.rebind( _prev_bind_0_$122, thread );
            }
          }
          finally
          {
            sbhl_search_vars.$relevant_sbhl_tv_function$.rebind( _prev_bind_1_$122, thread );
            sbhl_search_vars.$sbhl_tv$.rebind( _prev_bind_0_$121, thread );
          }
        }
        finally
        {
          final SubLObject _prev_bind_0_$131 = Threads.$is_thread_performing_cleanupP$.currentBinding( thread );
          try
          {
            Threads.$is_thread_performing_cleanupP$.bind( T, thread );
            final SubLObject _values2 = Values.getValuesAsVector();
            sbhl_marking_vars.free_sbhl_marking_space( sbhl_marking_vars.$sbhl_space$.getDynamicValue( thread ) );
            Values.restoreValuesFromVector( _values2 );
          }
          finally
          {
            Threads.$is_thread_performing_cleanupP$.rebind( _prev_bind_0_$131, thread );
          }
        }
      }
      finally
      {
        sbhl_marking_vars.$sbhl_space$.rebind( _prev_bind_0_$120, thread );
      }
    }
    finally
    {
      mt_relevance_macros.$mt$.rebind( _prev_bind_2, thread );
      mt_relevance_macros.$relevant_mt_function$.rebind( _prev_bind_0, thread );
    }
    return $rkf_deprecated_rules$.getGlobalValue();
  }

  @SubLTranslatedFile.SubL(source = "cycl/rkf-salient-descriptor.lisp", position = 70344L)
  public static SubLObject rkf_deprecate_rule_internal(final SubLObject rule, final SubLObject mt)
  {
    if( NIL == dictionary.dictionary_p( $rkf_deprecated_rules$.getGlobalValue() ) )
    {
      initialize_rkf_deprecated_rules();
    }
    dictionary.dictionary_enter( $rkf_deprecated_rules$.getGlobalValue(), rule, mt );
    return rule;
  }

  @SubLTranslatedFile.SubL(source = "cycl/rkf-salient-descriptor.lisp", position = 70553L)
  public static SubLObject rkf_salient_descriptor_deprecate_rule(final SubLObject rule, final SubLObject mt)
  {
    if( NIL != assertion_handles.assertion_p( rule ) )
    {
      rkf_assertion_utilities.rkf_assert( ConsesLow.list( $const190$deprecatedSalientDescriptorRuleAs, rule ), mt, UNPROVIDED, UNPROVIDED );
    }
    else if( NIL != el_utilities.el_formula_p( rule ) )
    {
      rkf_assertion_utilities.rkf_assert( ConsesLow.list( $const189$deprecatedSalientDescriptorRule, rule ), mt, UNPROVIDED, UNPROVIDED );
    }
    rkf_deprecate_rule_internal( rule, mt );
    return rule;
  }

  @SubLTranslatedFile.SubL(source = "cycl/rkf-salient-descriptor.lisp", position = 70865L)
  public static SubLObject deprecate_salient_descriptor_rule(final SubLObject argument, final SubLObject assertion)
  {
    final SubLObject rule = assertions_high.gaf_arg1( assertion );
    final SubLObject mt = assertions_high.assertion_mt( assertion );
    return rkf_deprecate_rule_internal( rule, mt );
  }

  @SubLTranslatedFile.SubL(source = "cycl/rkf-salient-descriptor.lisp", position = 71082L)
  public static SubLObject undeprecate_salient_descriptor_rule(final SubLObject argument, final SubLObject assertion)
  {
    $rkf_deprecated_rules$.setGlobalValue( $kw186$UNINITIALIZED );
    return assertion;
  }

  @SubLTranslatedFile.SubL(source = "cycl/rkf-salient-descriptor.lisp", position = 71260L)
  public static SubLObject rkf_deprecated_sd_ruleP(final SubLObject rule, final SubLObject mt)
  {
    if( NIL == dictionary.dictionary_p( $rkf_deprecated_rules$.getGlobalValue() ) )
    {
      initialize_rkf_deprecated_rules();
    }
    SubLObject ans = NIL;
    if( NIL != assertion_handles.assertion_p( rule ) || NIL != el_utilities.el_formula_p( rule ) )
    {
      final SubLObject dep_mt = dictionary.dictionary_lookup( $rkf_deprecated_rules$.getGlobalValue(), rule, $kw56$NOT_FOUND );
      ans = makeBoolean( NIL != hlmt.hlmt_p( dep_mt ) && NIL != genl_mts.genl_mtP( mt, dep_mt, UNPROVIDED, UNPROVIDED ) );
    }
    return ans;
  }

  @SubLTranslatedFile.SubL(source = "cycl/rkf-salient-descriptor.lisp", position = 71858L)
  public static SubLObject rkf_bad_sd_ruleP(final SubLObject rule, final SubLObject mt)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    if( NIL != assertion_handles.assertion_p( rule ) && NIL != list_utilities.lengthG( clauses.neg_lits( assertions_high.assertion_cnf( rule ) ), $rkf_sd_rule_neg_lit_max$.getDynamicValue( thread ), UNPROVIDED ) )
    {
      return T;
    }
    if( NIL != assertion_handles.assertion_p( rule ) && NIL != list_utilities.lengthL( clauses.neg_lits( assertions_high.assertion_cnf( rule ) ), $rkf_sd_rule_neg_lit_min$.getDynamicValue( thread ), UNPROVIDED ) )
    {
      return T;
    }
    if( NIL != assertion_handles.assertion_p( rule ) && NIL != list_utilities.lengthG( clauses.pos_lits( assertions_high.assertion_cnf( rule ) ), $rkf_sd_rule_pos_lit_max$.getDynamicValue( thread ), UNPROVIDED ) )
    {
      return T;
    }
    if( NIL != assertion_handles.assertion_p( rule ) && NIL != list_utilities.lengthL( clauses.pos_lits( assertions_high.assertion_cnf( rule ) ), $rkf_sd_rule_pos_lit_min$.getDynamicValue( thread ), UNPROVIDED ) )
    {
      return T;
    }
    if( NIL != rkf_deprecated_sd_ruleP( rule, mt ) )
    {
      return T;
    }
    if( NIL != assertion_handles.assertion_p( rule ) && NIL != rkf_sd_tva_equivalent_ruleP( rule, NIL ) )
    {
      return T;
    }
    if( NIL != assertion_handles.assertion_p( rule ) && NIL != rkf_sd_type_based_strengthening_ruleP( rule ) )
    {
      return T;
    }
    if( NIL != assertion_handles.assertion_p( rule ) && NIL != rkf_relevance_utilities.rkf_irrelevant_formula( uncanonicalizer.assertion_el_formula( rule ), mt ) )
    {
      return T;
    }
    if( NIL != rkf_sd_arg_constraint_ruleP( rule ) )
    {
      return T;
    }
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/rkf-salient-descriptor.lisp", position = 73223L)
  public static SubLObject rkf_sd_arg_constraint_ruleP(final SubLObject rule)
  {
    SubLObject ans = NIL;
    if( NIL != assertion_handles.assertion_p( rule ) )
    {
      final SubLObject cnf = assertions_high.assertion_cnf( rule );
      if( NIL == ans )
      {
        SubLObject csome_list_var = clauses.pos_lits( cnf );
        SubLObject pos_lit = NIL;
        pos_lit = csome_list_var.first();
        while ( NIL == ans && NIL != csome_list_var)
        {
          if( NIL != isa.isaP( cycl_utilities.atomic_sentence_predicate( pos_lit ), $const193$ArgConstraintPredicate, UNPROVIDED, UNPROVIDED ) )
          {
            ans = T;
          }
          csome_list_var = csome_list_var.rest();
          pos_lit = csome_list_var.first();
        }
      }
    }
    return ans;
  }

  @SubLTranslatedFile.SubL(source = "cycl/rkf-salient-descriptor.lisp", position = 73583L)
  public static SubLObject rkf_sd_tva_equivalent_ruleP(final SubLObject as, SubLObject strictP)
  {
    if( strictP == UNPROVIDED )
    {
      strictP = T;
    }
    final SubLObject cnf = assertions_high.assertion_cnf( as );
    final SubLObject neg_lits = clauses.neg_lits( cnf );
    final SubLObject pos_lits = clauses.pos_lits( cnf );
    SubLObject tva = NIL;
    if( NIL != list_utilities.lengthGE( neg_lits, TWO_INTEGER, UNPROVIDED ) && ( NIL == strictP || NIL != list_utilities.lengthE( neg_lits, TWO_INTEGER, UNPROVIDED ) ) && NIL != list_utilities.lengthE( pos_lits,
        ONE_INTEGER, UNPROVIDED ) && ( NIL == strictP || NIL == list_utilities.find_if_not( $sym169$HL_VAR_, cycl_utilities.formula_args( pos_lits.first(), UNPROVIDED ), UNPROVIDED, UNPROVIDED, UNPROVIDED ) ) )
    {
      final SubLObject pos_lit = pos_lits.first();
      SubLObject arg0 = NIL;
      final SubLObject arg2 = cycl_utilities.atomic_sentence_predicate( pos_lit );
      final SubLObject neg_lit_pattern = el_utilities.make_binary_formula( arg2, $list194, ( NIL != strictP ) ? $list194 : $kw195$ANYTHING );
      SubLObject arg3 = NIL;
      SubLObject arg4 = NIL;
      if( NIL != forts.fort_p( arg2 ) && NIL == arg3 )
      {
        SubLObject csome_list_var = neg_lits;
        SubLObject neg_lit = NIL;
        neg_lit = csome_list_var.first();
        while ( NIL == arg3 && NIL != csome_list_var)
        {
          if( NIL != formula_pattern_match.formula_matches_pattern( neg_lit, neg_lit_pattern ) && NIL == arg3 )
          {
            SubLObject csome_list_var_$147 = Sequences.remove( neg_lit, neg_lits, Symbols.symbol_function( EQUAL ), UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED );
            SubLObject other_lit = NIL;
            other_lit = csome_list_var_$147.first();
            while ( NIL == arg3 && NIL != csome_list_var_$147)
            {
              final SubLObject other_pred = cycl_utilities.atomic_sentence_predicate( other_lit );
              if( NIL != ( ( NIL != strictP ) ? isa.isaP( other_pred, $const196$TransitiveBinaryPredicate, UNPROVIDED, UNPROVIDED ) : isa.isaP( other_pred, $const197$BinaryPredicate, UNPROVIDED, UNPROVIDED ) ) )
              {
                SubLObject list_var = NIL;
                SubLObject pos_lit_arg = NIL;
                SubLObject arg_num = NIL;
                list_var = pos_lit;
                pos_lit_arg = list_var.first();
                for( arg_num = ZERO_INTEGER; NIL == arg4 && NIL != list_var; list_var = list_var.rest(), pos_lit_arg = list_var.first(), arg_num = Numbers.add( ONE_INTEGER, arg_num ) )
                {
                  final SubLObject neg_lit_arg = cycl_utilities.atomic_sentence_arg( neg_lit, arg_num, UNPROVIDED );
                  if( !arg_num.isZero() && !pos_lit_arg.eql( neg_lit_arg ) && pos_lit.equal( cycl_utilities.expression_subst( pos_lit_arg, neg_lit_arg, neg_lit, UNPROVIDED, UNPROVIDED ) ) )
                  {
                    if( cycl_utilities.formula_args( other_lit, UNPROVIDED ).equal( ConsesLow.list( neg_lit_arg, pos_lit_arg ) ) )
                    {
                      arg0 = $const198$transitiveViaArg;
                    }
                    else if( cycl_utilities.formula_args( other_lit, UNPROVIDED ).equal( ConsesLow.list( pos_lit_arg, neg_lit_arg ) ) )
                    {
                      arg0 = $const199$transitiveViaArgInverse;
                    }
                    if( NIL != arg0 )
                    {
                      arg4 = arg_num;
                    }
                  }
                }
                if( NIL != arg4 )
                {
                  arg3 = other_pred;
                  if( arg3.eql( arg2 ) )
                  {
                    tva = el_utilities.make_binary_formula( $const24$isa, arg2, $const196$TransitiveBinaryPredicate );
                  }
                  else
                  {
                    tva = el_utilities.make_ternary_formula( arg0, arg2, arg3, arg4 );
                  }
                }
              }
              csome_list_var_$147 = csome_list_var_$147.rest();
              other_lit = csome_list_var_$147.first();
            }
          }
          csome_list_var = csome_list_var.rest();
          neg_lit = csome_list_var.first();
        }
      }
    }
    return tva;
  }

  @SubLTranslatedFile.SubL(source = "cycl/rkf-salient-descriptor.lisp", position = 75500L)
  public static SubLObject rkf_sd_type_based_strengthening_ruleP(final SubLObject rule)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    SubLObject ans = NIL;
    final SubLObject hl_cnf = assertions_high.assertion_cnf( rule );
    SubLObject current;
    final SubLObject datum = current = hl_cnf;
    SubLObject neg_lits = NIL;
    SubLObject pos_lits = NIL;
    cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list200 );
    neg_lits = current.first();
    current = current.rest();
    cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list200 );
    pos_lits = current.first();
    current = current.rest();
    if( NIL == current )
    {
      if( NIL != list_utilities.lengthE( neg_lits, TWO_INTEGER, UNPROVIDED ) && NIL != list_utilities.lengthE( pos_lits, ONE_INTEGER, UNPROVIDED ) )
      {
        SubLObject constraint_lit = NIL;
        SubLObject constrained_var = NIL;
        if( NIL == constraint_lit )
        {
          SubLObject csome_list_var = neg_lits;
          SubLObject neg_lit = NIL;
          neg_lit = csome_list_var.first();
          while ( NIL == constraint_lit && NIL != csome_list_var)
          {
            if( NIL != subl_promotions.memberP( cycl_utilities.atomic_sentence_predicate( neg_lit ), $list201, UNPROVIDED, UNPROVIDED ) && NIL != variables.variable_p( cycl_utilities.atomic_sentence_arg( neg_lit,
                ONE_INTEGER, UNPROVIDED ) ) )
            {
              constraint_lit = neg_lit;
              constrained_var = cycl_utilities.atomic_sentence_arg( neg_lit, ONE_INTEGER, UNPROVIDED );
            }
            csome_list_var = csome_list_var.rest();
            neg_lit = csome_list_var.first();
          }
        }
        if( NIL != constraint_lit )
        {
          final SubLObject other_neg_lit = Sequences.remove( constraint_lit, neg_lits, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED ).first();
          final SubLObject other_neg_lit_pred = cycl_utilities.atomic_sentence_predicate( other_neg_lit );
          final SubLObject pos_lit = pos_lits.first();
          final SubLObject pos_lit_pred = cycl_utilities.atomic_sentence_predicate( pos_lit );
          final SubLObject _prev_bind_0 = mt_relevance_macros.$relevant_mt_function$.currentBinding( thread );
          final SubLObject _prev_bind_2 = mt_relevance_macros.$mt$.currentBinding( thread );
          try
          {
            mt_relevance_macros.$relevant_mt_function$.bind( $sym187$RELEVANT_MT_IS_EVERYTHING, thread );
            mt_relevance_macros.$mt$.bind( $const188$EverythingPSC, thread );
            ans = makeBoolean( NIL != subl_promotions.memberP( constrained_var, cycl_utilities.formula_args( other_neg_lit, UNPROVIDED ), UNPROVIDED, UNPROVIDED ) && NIL != conses_high.member( constrained_var,
                cycl_utilities.formula_args( pos_lit, UNPROVIDED ), UNPROVIDED, UNPROVIDED ) && NIL != el_utilities.same_formula_arity_p( other_neg_lit, pos_lit, UNPROVIDED ) && NIL != forts.fort_p( other_neg_lit_pred )
                && NIL != forts.fort_p( pos_lit_pred ) && NIL != sbhl_search_methods.sbhl_min_ceilings( $const41$genlPreds, ConsesLow.list( other_neg_lit_pred, pos_lit_pred ), UNPROVIDED, UNPROVIDED, UNPROVIDED ) );
          }
          finally
          {
            mt_relevance_macros.$mt$.rebind( _prev_bind_2, thread );
            mt_relevance_macros.$relevant_mt_function$.rebind( _prev_bind_0, thread );
          }
        }
      }
    }
    else
    {
      cdestructuring_bind.cdestructuring_bind_error( datum, $list200 );
    }
    return ans;
  }

  @SubLTranslatedFile.SubL(source = "cycl/rkf-salient-descriptor.lisp", position = 76836L)
  public static SubLObject rkf_sort_salient_formulas(final SubLObject suggestions)
  {
    return suggestions;
  }

  @SubLTranslatedFile.SubL(source = "cycl/rkf-salient-descriptor.lisp", position = 77273L)
  public static SubLObject rkf_sd_clear()
  {
    return Hashtables.clrhash( $rkf_salient_descriptor_cache$.getGlobalValue() );
  }

  @SubLTranslatedFile.SubL(source = "cycl/rkf-salient-descriptor.lisp", position = 77356L)
  public static SubLObject rkf_sd_present(final SubLObject cache_key)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    thread.resetMultipleValues();
    final SubLObject value = rkf_sd_lookup( cache_key );
    final SubLObject present = thread.secondMultipleValue();
    thread.resetMultipleValues();
    return present;
  }

  @SubLTranslatedFile.SubL(source = "cycl/rkf-salient-descriptor.lisp", position = 77505L)
  public static SubLObject rkf_sd_lookup(final SubLObject cache_key)
  {
    return Hashtables.gethash( cache_key, $rkf_salient_descriptor_cache$.getGlobalValue(), NIL );
  }

  @SubLTranslatedFile.SubL(source = "cycl/rkf-salient-descriptor.lisp", position = 77612L)
  public static SubLObject rkf_sd_update(final SubLObject cache_key, final SubLObject formulas)
  {
    SubLObject release = NIL;
    try
    {
      release = Locks.seize_lock( $rkf_salient_descriptor_cache_lock$.getGlobalValue() );
      Hashtables.sethash( cache_key, $rkf_salient_descriptor_cache$.getGlobalValue(), formulas );
    }
    finally
    {
      if( NIL != release )
      {
        Locks.release_lock( $rkf_salient_descriptor_cache_lock$.getGlobalValue() );
      }
    }
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/rkf-salient-descriptor.lisp", position = 78141L)
  public static SubLObject rkf_sd_ignore_clear()
  {
    return Hashtables.clrhash( $rkf_salient_descriptor_ignore_cache$.getGlobalValue() );
  }

  @SubLTranslatedFile.SubL(source = "cycl/rkf-salient-descriptor.lisp", position = 78238L)
  public static SubLObject rkf_sd_ignore_present(final SubLObject cache_key)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    thread.resetMultipleValues();
    final SubLObject value = rkf_sd_lookup( cache_key );
    final SubLObject present = thread.secondMultipleValue();
    thread.resetMultipleValues();
    return present;
  }

  @SubLTranslatedFile.SubL(source = "cycl/rkf-salient-descriptor.lisp", position = 78394L)
  public static SubLObject rkf_sd_ignore_lookup(final SubLObject cache_key)
  {
    return Hashtables.gethash( cache_key, $rkf_salient_descriptor_ignore_cache$.getGlobalValue(), NIL );
  }

  @SubLTranslatedFile.SubL(source = "cycl/rkf-salient-descriptor.lisp", position = 78515L)
  public static SubLObject rkf_sd_ignore_update(final SubLObject cache_key, final SubLObject formulas)
  {
    SubLObject release = NIL;
    try
    {
      release = Locks.seize_lock( $rkf_salient_descriptor_ignore_cache_lock$.getGlobalValue() );
      Hashtables.sethash( cache_key, $rkf_salient_descriptor_ignore_cache$.getGlobalValue(), formulas );
    }
    finally
    {
      if( NIL != release )
      {
        Locks.release_lock( $rkf_salient_descriptor_ignore_cache_lock$.getGlobalValue() );
      }
    }
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/rkf-salient-descriptor.lisp", position = 79256L)
  public static SubLObject rkf_salient_descriptor_get_subprompts(final SubLObject formula, final SubLObject v_term, final SubLObject domain_mt, final SubLObject confirmedP, SubLObject salient_property_sentence)
  {
    if( salient_property_sentence == UNPROVIDED )
    {
      salient_property_sentence = NIL;
    }
    return ( NIL != confirmedP ) ? rkf_salient_descriptor_followups( formula, v_term, domain_mt, salient_property_sentence )
        : ConsesLow.list( rkf_salient_descriptor_subprompt_from_formula( formula, v_term, domain_mt, salient_property_sentence ) );
  }

  @SubLTranslatedFile.SubL(source = "cycl/rkf-salient-descriptor.lisp", position = 79631L)
  public static SubLObject rkf_salient_descriptor_single_entry_varP(final SubLObject var, final SubLObject formula, final SubLObject mt)
  {
    SubLObject single_entryP = rkf_sd_single_entry_var_top_levelP( var, formula, mt );
    final SubLObject args = cycl_utilities.formula_args( formula, $kw185$IGNORE );
    SubLObject rest;
    SubLObject subformula;
    for( rest = NIL, rest = args; NIL == single_entryP && NIL != rest; single_entryP = makeBoolean( NIL != el_utilities.el_formula_p( subformula ) && NIL != rkf_salient_descriptor_single_entry_varP( var, subformula,
        mt ) ), rest = rest.rest() )
    {
      subformula = rest.first();
    }
    return single_entryP;
  }

  @SubLTranslatedFile.SubL(source = "cycl/rkf-salient-descriptor.lisp", position = 80068L)
  public static SubLObject rkf_sd_single_entry_var_top_levelP(final SubLObject var, final SubLObject formula, final SubLObject mt)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    final SubLObject var_position = Sequences.position( var, formula, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED );
    final SubLObject pred = cycl_utilities.formula_arg0( formula );
    SubLObject single_entryP = NIL;
    if( var_position.isInteger() )
    {
      final SubLObject mt_var = mt_relevance_macros.with_inference_mt_relevance_validate( mt );
      final SubLObject _prev_bind_0 = mt_relevance_macros.$mt$.currentBinding( thread );
      final SubLObject _prev_bind_2 = mt_relevance_macros.$relevant_mt_function$.currentBinding( thread );
      final SubLObject _prev_bind_3 = mt_relevance_macros.$relevant_mts$.currentBinding( thread );
      try
      {
        mt_relevance_macros.$mt$.bind( mt_relevance_macros.update_inference_mt_relevance_mt( mt_var ), thread );
        mt_relevance_macros.$relevant_mt_function$.bind( mt_relevance_macros.update_inference_mt_relevance_function( mt_var ), thread );
        mt_relevance_macros.$relevant_mts$.bind( mt_relevance_macros.update_inference_mt_relevance_mt_list( mt_var ), thread );
        single_entryP = subl_promotions.memberP( var_position, kb_mapping_utilities.pred_values( pred, $const205$singleEntryFormatInArgs, UNPROVIDED, UNPROVIDED, UNPROVIDED ), UNPROVIDED, UNPROVIDED );
        if( NIL == single_entryP )
        {
          SubLObject csome_list_var = kb_mapping_utilities.pred_value_tuples( pred, $const208$argFormat, ONE_INTEGER, $list209, UNPROVIDED );
          SubLObject pair = NIL;
          pair = csome_list_var.first();
          while ( NIL == single_entryP && NIL != csome_list_var)
          {
            SubLObject current;
            final SubLObject datum = current = pair;
            SubLObject argnum = NIL;
            SubLObject format = NIL;
            cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list206 );
            argnum = current.first();
            current = current.rest();
            cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list206 );
            format = current.first();
            current = current.rest();
            if( NIL == current )
            {
              single_entryP = makeBoolean( argnum.eql( var_position ) && NIL != conses_high.member( format, $list207, UNPROVIDED, UNPROVIDED ) );
            }
            else
            {
              cdestructuring_bind.cdestructuring_bind_error( datum, $list206 );
            }
            csome_list_var = csome_list_var.rest();
            pair = csome_list_var.first();
          }
        }
      }
      finally
      {
        mt_relevance_macros.$relevant_mts$.rebind( _prev_bind_3, thread );
        mt_relevance_macros.$relevant_mt_function$.rebind( _prev_bind_2, thread );
        mt_relevance_macros.$mt$.rebind( _prev_bind_0, thread );
      }
    }
    return single_entryP;
  }

  @SubLTranslatedFile.SubL(source = "cycl/rkf-salient-descriptor.lisp", position = 80899L)
  public static SubLObject rkf_salient_property_sentence_from_justification(final SubLObject v_term, final SubLObject justification)
  {
    if( NIL != rkf_salient_descriptor_rule_spec_p( justification ) )
    {
      return rkf_justification_sentence_from_rule_spec( v_term, justification );
    }
    if( NIL != arguments.supports_p( justification ) )
    {
      SubLObject conjuncts = NIL;
      SubLObject cdolist_list_var = justification;
      SubLObject support = NIL;
      support = cdolist_list_var.first();
      while ( NIL != cdolist_list_var)
      {
        final SubLObject support_sentence = arguments.support_sentence( support );
        if( NIL != cycl_utilities.expression_find( v_term, support_sentence, NIL, Symbols.symbol_function( EQUAL ), UNPROVIDED ) )
        {
          conjuncts = ConsesLow.cons( support_sentence, conjuncts );
        }
        cdolist_list_var = cdolist_list_var.rest();
        support = cdolist_list_var.first();
      }
      return rkf_sd_conjoin( conjuncts, T, NIL );
    }
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/rkf-salient-descriptor.lisp", position = 81450L)
  public static SubLObject rkf_sd_conjoin(final SubLObject conjuncts, SubLObject simplifyP, SubLObject uniquifyP)
  {
    if( simplifyP == UNPROVIDED )
    {
      simplifyP = NIL;
    }
    if( uniquifyP == UNPROVIDED )
    {
      uniquifyP = NIL;
    }
    final SubLObject pcase_var = Sequences.length( conjuncts );
    if( pcase_var.eql( ZERO_INTEGER ) )
    {
      return NIL;
    }
    if( pcase_var.eql( ONE_INTEGER ) )
    {
      return conjuncts.first();
    }
    final SubLObject uniquified_conjuncts = ( NIL != uniquifyP ) ? rkf_sd_uniquify_conjuncts( conjuncts ) : conjuncts;
    return simplifier.conjoin( uniquified_conjuncts, simplifyP );
  }

  @SubLTranslatedFile.SubL(source = "cycl/rkf-salient-descriptor.lisp", position = 81952L)
  public static SubLObject rkf_sd_uniquify_conjuncts(final SubLObject conjuncts)
  {
    SubLObject new_conjuncts = NIL;
    SubLObject cdolist_list_var = conjuncts;
    SubLObject conjunct = NIL;
    conjunct = cdolist_list_var.first();
    while ( NIL != cdolist_list_var)
    {
      if( NIL != new_conjuncts )
      {
        SubLObject cdolist_list_var_$148 = cycl_utilities.expression_gather( conjunct, $sym148$EL_VAR_, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED );
        SubLObject el_var = NIL;
        el_var = cdolist_list_var_$148.first();
        while ( NIL != cdolist_list_var_$148)
        {
          if( NIL != subl_promotions.memberP( el_var, new_conjuncts, $sym210$EXPRESSION_FIND, UNPROVIDED ) )
          {
            final SubLObject replacement_var = czer_utilities.unique_el_var_wrt_expression( new_conjuncts, el_var );
            conjunct = cycl_utilities.formula_subst( replacement_var, el_var, conjunct, UNPROVIDED, UNPROVIDED );
          }
          cdolist_list_var_$148 = cdolist_list_var_$148.rest();
          el_var = cdolist_list_var_$148.first();
        }
      }
      new_conjuncts = ConsesLow.cons( conjunct, new_conjuncts );
      cdolist_list_var = cdolist_list_var.rest();
      conjunct = cdolist_list_var.first();
    }
    return Sequences.nreverse( new_conjuncts );
  }

  @SubLTranslatedFile.SubL(source = "cycl/rkf-salient-descriptor.lisp", position = 82569L)
  public static SubLObject rkf_salient_descriptor_subprompts_p(final SubLObject v_object)
  {
    return makeBoolean( NIL != list_utilities.proper_list_p( v_object ) && NIL != list_utilities.every_in_list( $sym211$RKF_SALIENT_DESCRIPTOR_SUBPROMPT_P, v_object, UNPROVIDED ) );
  }

  @SubLTranslatedFile.SubL(source = "cycl/rkf-salient-descriptor.lisp", position = 82738L)
  public static SubLObject rkf_salient_descriptor_subprompt_p(final SubLObject v_object)
  {
    return makeBoolean( v_object.isList() && v_object.first().isKeyword() && NIL != conses_high.member( v_object.first(), $list212, UNPROVIDED, UNPROVIDED ) );
  }

  @SubLTranslatedFile.SubL(source = "cycl/rkf-salient-descriptor.lisp", position = 82928L)
  public static SubLObject rkf_salient_descriptor_subprompt_assert_sentence(final SubLObject subprompt, SubLObject v_term, SubLObject var_to_specify)
  {
    if( v_term == UNPROVIDED )
    {
      v_term = NIL;
    }
    if( var_to_specify == UNPROVIDED )
    {
      var_to_specify = NIL;
    }
    final SubLObject pcase_var = rkf_salient_descriptor_subprompt_type( subprompt );
    if( pcase_var.eql( $kw213$CONFIRM ) )
    {
      SubLObject template = conses_high.second( subprompt );
      final SubLObject constraints = rkf_salient_descriptor_subprompt_constraint_sentence( subprompt );
      if( NIL != var_to_specify )
      {
        if( NIL != formula_pattern_match.formula_matches_pattern( template, ConsesLow.listS( $const76$thereExists, var_to_specify, $list214 ) ) )
        {
          template = cycl_utilities.formula_arg2( template, UNPROVIDED );
        }
        template = rkf_sd_remove_constraints( template, constraints );
        return cycl_utilities.expression_subst( v_term, var_to_specify, template, UNPROVIDED, UNPROVIDED );
      }
      return template;
    }
    else
    {
      if( !pcase_var.eql( $kw215$CHOICE ) && !pcase_var.eql( $kw216$SPECIFY ) )
      {
        return NIL;
      }
      final SubLObject template = conses_high.fourth( subprompt );
      if( NIL != var_to_specify )
      {
        return cycl_utilities.expression_subst( v_term, var_to_specify, template, UNPROVIDED, UNPROVIDED );
      }
      return template;
    }
  }

  @SubLTranslatedFile.SubL(source = "cycl/rkf-salient-descriptor.lisp", position = 83727L)
  public static SubLObject rkf_salient_descriptor_subprompt_var(final SubLObject subprompt)
  {
    final SubLObject pcase_var = rkf_salient_descriptor_subprompt_type( subprompt );
    if( pcase_var.eql( $kw213$CONFIRM ) )
    {
      return conses_high.third( subprompt );
    }
    if( pcase_var.eql( $kw216$SPECIFY ) )
    {
      return conses_high.second( subprompt );
    }
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/rkf-salient-descriptor.lisp", position = 83932L)
  public static SubLObject rkf_salient_descriptor_subprompt_known_check_sentence(final SubLObject subprompt)
  {
    final SubLObject pcase_var = rkf_salient_descriptor_subprompt_type( subprompt );
    if( pcase_var.eql( $kw213$CONFIRM ) || pcase_var.eql( $kw215$CHOICE ) )
    {
      return rkf_salient_descriptor_subprompt_assert_sentence( subprompt, UNPROVIDED, UNPROVIDED );
    }
    if( pcase_var.eql( $kw216$SPECIFY ) )
    {
      final SubLObject var = conses_high.second( subprompt );
      final SubLObject var_constraint = ConsesLow.list( $const125$unknownSentence, ConsesLow.listS( $const24$isa, var, $list217 ) );
      return rkf_sd_conjoin( ConsesLow.list( conses_high.fourth( subprompt ), var_constraint ), NIL, NIL );
    }
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/rkf-salient-descriptor.lisp", position = 84370L)
  public static SubLObject rkf_salient_descriptor_subprompt_constraint_sentence(final SubLObject subprompt)
  {
    final SubLObject pcase_var = rkf_salient_descriptor_subprompt_type( subprompt );
    if( pcase_var.eql( $kw213$CONFIRM ) )
    {
      return conses_high.fifth( subprompt );
    }
    if( pcase_var.eql( $kw215$CHOICE ) || pcase_var.eql( $kw216$SPECIFY ) )
    {
      return conses_high.third( subprompt );
    }
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/rkf-salient-descriptor.lisp", position = 84600L)
  public static SubLObject rkf_salient_descriptor_subprompt_examples(final SubLObject subprompt)
  {
    final SubLObject pcase_var = rkf_salient_descriptor_subprompt_type( subprompt );
    if( pcase_var.eql( $kw213$CONFIRM ) )
    {
      return conses_high.fourth( subprompt );
    }
    if( pcase_var.eql( $kw216$SPECIFY ) )
    {
      return conses_high.fifth( subprompt );
    }
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/rkf-salient-descriptor.lisp", position = 84810L)
  public static SubLObject rkf_salient_descriptor_subprompt_set_examples(final SubLObject subprompt, final SubLObject examples)
  {
    final SubLObject pcase_var = rkf_salient_descriptor_subprompt_type( subprompt );
    if( pcase_var.eql( $kw213$CONFIRM ) )
    {
      return ConsesLow.set_nth( THREE_INTEGER, subprompt, examples );
    }
    if( pcase_var.eql( $kw216$SPECIFY ) )
    {
      return ConsesLow.set_nth( FOUR_INTEGER, subprompt, examples );
    }
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/rkf-salient-descriptor.lisp", position = 85058L)
  public static SubLObject rkf_salient_descriptor_subprompt_type(final SubLObject subprompt)
  {
    return subprompt.first();
  }

  @SubLTranslatedFile.SubL(source = "cycl/rkf-salient-descriptor.lisp", position = 85151L)
  public static SubLObject rkf_salient_descriptor_subprompt_from_formula(final SubLObject formula, final SubLObject v_term, SubLObject mt, SubLObject salient_property_sentence)
  {
    if( mt == UNPROVIDED )
    {
      mt = control_vars.$rkf_mt$.getDynamicValue();
    }
    if( salient_property_sentence == UNPROVIDED )
    {
      salient_property_sentence = NIL;
    }
    final SubLThread thread = SubLProcess.currentSubLThread();
    thread.resetMultipleValues();
    final SubLObject examples = rkf_sd_examples( formula, v_term, mt, salient_property_sentence, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED );
    final SubLObject var = thread.secondMultipleValue();
    final SubLObject constraint_sentence = thread.thirdMultipleValue();
    final SubLObject assert_sentence = thread.fourthMultipleValue();
    thread.resetMultipleValues();
    return ConsesLow.list( $kw213$CONFIRM, formula, var, examples, constraint_sentence );
  }

  @SubLTranslatedFile.SubL(source = "cycl/rkf-salient-descriptor.lisp", position = 85530L)
  public static SubLObject rkf_salient_descriptor_followups(final SubLObject formula, final SubLObject v_term, SubLObject mt, SubLObject salient_property_sentence)
  {
    if( mt == UNPROVIDED )
    {
      mt = control_vars.$rkf_mt$.getDynamicValue();
    }
    if( salient_property_sentence == UNPROVIDED )
    {
      salient_property_sentence = NIL;
    }
    final SubLThread thread = SubLProcess.currentSubLThread();
    thread.resetMultipleValues();
    final SubLObject body = rkf_sd_possibly_existentially_unbind( formula );
    final SubLObject v_variables = thread.secondMultipleValue();
    thread.resetMultipleValues();
    if( NIL != formula_pattern_match.formula_matches_pattern( body, $list218 ) )
    {
      final SubLObject isa_sentence = cycl_utilities.formula_arg1( body, UNPROVIDED );
      final SubLObject non_instance = cycl_utilities.atomic_sentence_arg1( isa_sentence, UNPROVIDED );
      final SubLObject collection = cycl_utilities.atomic_sentence_arg2( isa_sentence, UNPROVIDED );
      final SubLObject isas = isa.isa( non_instance, mt, $const219$True_JustificationTruth );
      SubLObject disjoint_sentences = NIL;
      SubLObject cdolist_list_var = isas;
      SubLObject v_isa = NIL;
      v_isa = cdolist_list_var.first();
      while ( NIL != cdolist_list_var)
      {
        final SubLObject item_var = el_utilities.make_binary_formula( $const220$disjointWith, v_isa, collection );
        if( NIL == conses_high.member( item_var, disjoint_sentences, Symbols.symbol_function( EQL ), Symbols.symbol_function( IDENTITY ) ) )
        {
          disjoint_sentences = ConsesLow.cons( item_var, disjoint_sentences );
        }
        cdolist_list_var = cdolist_list_var.rest();
        v_isa = cdolist_list_var.first();
      }
      return ConsesLow.list( ConsesLow.list( $kw221$STRENGTHEN, disjoint_sentences ) );
    }
    SubLObject followups_for_variables = NIL;
    SubLObject cdolist_list_var2 = v_variables;
    SubLObject variable = NIL;
    variable = cdolist_list_var2.first();
    while ( NIL != cdolist_list_var2)
    {
      followups_for_variables = ConsesLow.cons( rkf_salient_descriptor_followup_for_variable( body, v_term, variable, mt, salient_property_sentence ), followups_for_variables );
      cdolist_list_var2 = cdolist_list_var2.rest();
      variable = cdolist_list_var2.first();
    }
    return Sequences.nreverse( followups_for_variables );
  }

  @SubLTranslatedFile.SubL(source = "cycl/rkf-salient-descriptor.lisp", position = 86545L)
  public static SubLObject rkf_salient_descriptor_followup_for_variable(final SubLObject formula, final SubLObject v_term, final SubLObject variable, final SubLObject mt, final SubLObject salient_property_sentence)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    final SubLObject subform = rkf_salient_descriptor_assert_formula( formula );
    final SubLObject complete_coll_bindings = rkf_salient_descriptor_complete_coll_bindings( variable, subform, mt );
    final SubLObject small_set_bindings = ( NIL != complete_coll_bindings ) ? NIL : rkf_salient_descriptor_small_set_bindings( variable, subform );
    if( NIL != complete_coll_bindings )
    {
      final SubLObject col = bindings.subst_bindings( complete_coll_bindings, variables.find_variable_by_id( ZERO_INTEGER ) );
      final SubLObject assert_formula = bindings.subst_bindings( complete_coll_bindings, variables.find_variable_by_id( ONE_INTEGER ) );
      final SubLObject all_fort_instances = rkf_ontology_utilities.rkf_all_fort_instances( col, mt );
      return ConsesLow.list( $kw215$CHOICE, variable, all_fort_instances, assert_formula );
    }
    if( NIL != small_set_bindings )
    {
      final SubLObject elements = bindings.subst_bindings( small_set_bindings, variables.find_variable_by_id( ONE_INTEGER ) );
      final SubLObject assert_formula = bindings.subst_bindings( small_set_bindings, variables.find_variable_by_id( ZERO_INTEGER ) );
      return ConsesLow.list( $kw215$CHOICE, variable, elements, assert_formula );
    }
    thread.resetMultipleValues();
    final SubLObject examples = rkf_sd_examples( formula, v_term, mt, salient_property_sentence, NIL, $kw59$ALL, variable, UNPROVIDED );
    final SubLObject examples_var = thread.secondMultipleValue();
    final SubLObject variable_constraints = thread.thirdMultipleValue();
    final SubLObject assert_sentence = thread.fourthMultipleValue();
    thread.resetMultipleValues();
    return ConsesLow.list( $kw216$SPECIFY, variable, variable_constraints, assert_sentence, examples );
  }

  @SubLTranslatedFile.SubL(source = "cycl/rkf-salient-descriptor.lisp", position = 88044L)
  public static SubLObject rkf_sd_examples_internal(final SubLObject formula, final SubLObject v_term, final SubLObject mt, final SubLObject salient_property_sentence, SubLObject used_examples, SubLObject include_types,
      SubLObject variable, SubLObject num_of_examples)
  {
    if( used_examples == UNPROVIDED )
    {
      used_examples = NIL;
    }
    if( include_types == UNPROVIDED )
    {
      include_types = $kw59$ALL;
    }
    if( variable == UNPROVIDED )
    {
      variable = NIL;
    }
    if( num_of_examples == UNPROVIDED )
    {
      num_of_examples = ( NIL != rkf_macros.rkf_generate_examplesP() ) ? $rkf_examples_to_show$.getDynamicValue() : ZERO_INTEGER;
    }
    final SubLThread thread = SubLProcess.currentSubLThread();
    assert NIL != el_utilities.el_formula_p( formula ) : formula;
    thread.resetMultipleValues();
    final SubLObject body = rkf_sd_possibly_existentially_unbind( formula );
    final SubLObject v_variables = thread.secondMultipleValue();
    thread.resetMultipleValues();
    if( NIL != variable )
    {
      if( NIL == subl_promotions.memberP( variable, v_variables, Symbols.symbol_function( EQ ), UNPROVIDED ) )
      {
        return Values.values( $kw224$NOT_TRIED, variable, NIL, body );
      }
    }
    else
    {
      if( NIL == list_utilities.singletonP( v_variables ) )
      {
        return Values.values( $kw224$NOT_TRIED, v_variables, NIL, body );
      }
      variable = v_variables.first();
    }
    final SubLObject subform = rkf_salient_descriptor_assert_formula( body );
    final SubLObject variable_constraints = rkf_tools.rkf_type_constraints( variable, subform, mt );
    final SubLObject assert_sentence = subform;
    final SubLObject salient_property = properties.sentence_to_property( salient_property_sentence, v_term );
    final SubLObject examples = num_of_examples.numG( ONE_INTEGER ) ? rkf_example_instances( variable, assert_sentence, v_term, variable_constraints, salient_property, mt, num_of_examples, used_examples, include_types )
        : $kw224$NOT_TRIED;
    return Values.values( examples, variable, variable_constraints, assert_sentence );
  }

  @SubLTranslatedFile.SubL(source = "cycl/rkf-salient-descriptor.lisp", position = 88044L)
  public static SubLObject rkf_sd_examples(final SubLObject formula, final SubLObject v_term, final SubLObject mt, final SubLObject salient_property_sentence, SubLObject used_examples, SubLObject include_types,
      SubLObject variable, SubLObject num_of_examples)
  {
    if( used_examples == UNPROVIDED )
    {
      used_examples = NIL;
    }
    if( include_types == UNPROVIDED )
    {
      include_types = $kw59$ALL;
    }
    if( variable == UNPROVIDED )
    {
      variable = NIL;
    }
    if( num_of_examples == UNPROVIDED )
    {
      num_of_examples = ( NIL != rkf_macros.rkf_generate_examplesP() ) ? $rkf_examples_to_show$.getDynamicValue() : ZERO_INTEGER;
    }
    final SubLThread thread = SubLProcess.currentSubLThread();
    final SubLObject v_memoization_state = memoization_state.$memoization_state$.getDynamicValue( thread );
    SubLObject caching_state = NIL;
    if( NIL == v_memoization_state )
    {
      return rkf_sd_examples_internal( formula, v_term, mt, salient_property_sentence, used_examples, include_types, variable, num_of_examples );
    }
    caching_state = memoization_state.memoization_state_lookup( v_memoization_state, $sym222$RKF_SD_EXAMPLES, UNPROVIDED );
    if( NIL == caching_state )
    {
      caching_state = memoization_state.create_caching_state( memoization_state.memoization_state_lock( v_memoization_state ), $sym222$RKF_SD_EXAMPLES, EIGHT_INTEGER, NIL, EQUAL, UNPROVIDED );
      memoization_state.memoization_state_put( v_memoization_state, $sym222$RKF_SD_EXAMPLES, caching_state );
    }
    final SubLObject sxhash = memoization_state.sxhash_calc_8( formula, v_term, mt, salient_property_sentence, used_examples, include_types, variable, num_of_examples );
    final SubLObject collisions = memoization_state.caching_state_lookup( caching_state, sxhash, UNPROVIDED );
    if( !collisions.eql( memoization_state.$memoized_item_not_found$.getGlobalValue() ) )
    {
      SubLObject cdolist_list_var = collisions;
      SubLObject collision = NIL;
      collision = cdolist_list_var.first();
      while ( NIL != cdolist_list_var)
      {
        SubLObject cached_args = collision.first();
        final SubLObject results2 = conses_high.second( collision );
        if( formula.equal( cached_args.first() ) )
        {
          cached_args = cached_args.rest();
          if( v_term.equal( cached_args.first() ) )
          {
            cached_args = cached_args.rest();
            if( mt.equal( cached_args.first() ) )
            {
              cached_args = cached_args.rest();
              if( salient_property_sentence.equal( cached_args.first() ) )
              {
                cached_args = cached_args.rest();
                if( used_examples.equal( cached_args.first() ) )
                {
                  cached_args = cached_args.rest();
                  if( include_types.equal( cached_args.first() ) )
                  {
                    cached_args = cached_args.rest();
                    if( variable.equal( cached_args.first() ) )
                    {
                      cached_args = cached_args.rest();
                      if( NIL != cached_args && NIL == cached_args.rest() && num_of_examples.equal( cached_args.first() ) )
                      {
                        return memoization_state.caching_results( results2 );
                      }
                    }
                  }
                }
              }
            }
          }
        }
        cdolist_list_var = cdolist_list_var.rest();
        collision = cdolist_list_var.first();
      }
    }
    final SubLObject results3 = Values.arg2( thread.resetMultipleValues(), Values.multiple_value_list( rkf_sd_examples_internal( formula, v_term, mt, salient_property_sentence, used_examples, include_types, variable,
        num_of_examples ) ) );
    memoization_state.caching_state_enter_multi_key_n( caching_state, sxhash, collisions, results3, ConsesLow.list( formula, v_term, mt, salient_property_sentence, used_examples, include_types, variable,
        num_of_examples ) );
    return memoization_state.caching_results( results3 );
  }

  @SubLTranslatedFile.SubL(source = "cycl/rkf-salient-descriptor.lisp", position = 89750L)
  public static SubLObject rkf_sd_precedent_query_sentence(final SubLObject new_var, final SubLObject v_term, final SubLObject knowledge_gap_sentence, SubLObject salient_property)
  {
    if( salient_property == UNPROVIDED )
    {
      salient_property = NIL;
    }
    SubLObject combined = ( NIL != salient_property ) ? rkf_sd_add_salient_property( knowledge_gap_sentence, salient_property, v_term ) : knowledge_gap_sentence;
    if( NIL != formula_pattern_match.formula_matches_pattern( knowledge_gap_sentence, ConsesLow.listS( $kw225$FORT, v_term, $list226 ) ) && NIL != formula_pattern_match.formula_matches_pattern( salient_property,
        $list227 ) )
    {
      final SubLObject rai_knowledge_gap_sentence = el_utilities.make_el_formula( $const228$relationAllInstance, cycl_utilities.formula_terms( knowledge_gap_sentence, UNPROVIDED ), UNPROVIDED );
      final SubLObject genls_property = properties.sentence_to_property( el_utilities.make_el_formula( $const25$genls, cycl_utilities.formula_args( properties.property_to_sentence( salient_property, v_term ),
          UNPROVIDED ), UNPROVIDED ), v_term );
      final SubLObject rai_combined = rkf_sd_add_salient_property( rai_knowledge_gap_sentence, genls_property, v_term );
      combined = simplifier.disjoin( ConsesLow.list( combined, rai_combined ), UNPROVIDED );
    }
    return cycl_utilities.expression_subst( new_var, v_term, combined, UNPROVIDED, UNPROVIDED );
  }

  @SubLTranslatedFile.SubL(source = "cycl/rkf-salient-descriptor.lisp", position = 90798L)
  public static SubLObject rkf_sd_add_salient_property(final SubLObject knowledge_gap_sentence, final SubLObject salient_property, final SubLObject v_term)
  {
    SubLObject salient_property_sentence = properties.property_to_sentence( salient_property, v_term );
    if( ZERO_INTEGER.eql( rkf_example_instances_backchain_level() ) )
    {
      salient_property_sentence = rkf_sd_add_known_sentence( salient_property_sentence );
    }
    return rkf_sd_conjoin( ConsesLow.list( knowledge_gap_sentence, salient_property_sentence ), T, NIL );
  }

  @SubLTranslatedFile.SubL(source = "cycl/rkf-salient-descriptor.lisp", position = 91221L)
  public static SubLObject rkf_sd_add_known_sentence(final SubLObject sentence)
  {
    if( NIL != cycl_grammar.cycl_atomic_sentence_p( sentence ) )
    {
      return el_utilities.make_unary_formula( $const229$knownSentence, sentence );
    }
    if( NIL != el_utilities.el_conjunction_p( sentence ) )
    {
      return simplifier.conjoin( Mapping.mapcar( $sym230$RKF_SD_ADD_KNOWN_SENTENCE, cycl_utilities.formula_args( sentence, UNPROVIDED ) ), UNPROVIDED );
    }
    return sentence;
  }

  @SubLTranslatedFile.SubL(source = "cycl/rkf-salient-descriptor.lisp", position = 91585L)
  public static SubLObject rkf_sd_remove_constraints(final SubLObject subform, final SubLObject variable_constraints)
  {
    if( NIL != el_utilities.el_conjunction_p( subform ) )
    {
      SubLObject assert_conjuncts = NIL;
      SubLObject cdolist_list_var = cycl_utilities.formula_args( subform, UNPROVIDED );
      SubLObject conjunct = NIL;
      conjunct = cdolist_list_var.first();
      while ( NIL != cdolist_list_var)
      {
        if( NIL == cycl_utilities.expression_find( conjunct, variable_constraints, NIL, Symbols.symbol_function( EQUAL ), UNPROVIDED ) )
        {
          assert_conjuncts = ConsesLow.cons( conjunct, assert_conjuncts );
        }
        cdolist_list_var = cdolist_list_var.rest();
        conjunct = cdolist_list_var.first();
      }
      return rkf_sd_conjoin( assert_conjuncts, NIL, NIL );
    }
    return subform;
  }

  @SubLTranslatedFile.SubL(source = "cycl/rkf-salient-descriptor.lisp", position = 92045L)
  public static SubLObject rkf_salient_descriptor_complete_coll_bindings(final SubLObject variable, final SubLObject subform, final SubLObject mt)
  {
    final SubLObject conjuncts = ConsesLow.list( ConsesLow.list( $const24$isa, $kw231$VAR, variables.find_variable_by_id( ZERO_INTEGER ) ), variables.find_variable_by_id( ONE_INTEGER ) );
    final SubLObject v_bindings = rkf_salient_descriptor_bindings( variable, subform, conjuncts, $sym232$RKF_SD_COMPLETE_COLL_BINDINGS_OK_, mt );
    return v_bindings;
  }

  @SubLTranslatedFile.SubL(source = "cycl/rkf-salient-descriptor.lisp", position = 92369L)
  public static SubLObject rkf_sd_complete_coll_bindings_okP(final SubLObject v_bindings, final SubLObject mt)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    if( NIL == v_bindings )
    {
      return NIL;
    }
    final SubLObject col = bindings.subst_bindings( v_bindings, variables.find_variable_by_id( ZERO_INTEGER ) );
    return makeBoolean( NIL != forts.fort_p( col ) && NIL != kb_accessors.completely_enumerable_collectionP( col, mt ) && NIL != list_utilities.lengthLE( rkf_ontology_utilities.rkf_all_fort_instances( col, mt ),
        $rkf_choice_count_cutoff$.getDynamicValue( thread ), UNPROVIDED ) );
  }

  @SubLTranslatedFile.SubL(source = "cycl/rkf-salient-descriptor.lisp", position = 92691L)
  public static SubLObject rkf_salient_descriptor_small_set_bindings(final SubLObject variable, final SubLObject subform)
  {
    final SubLObject conjuncts = ConsesLow.list( variables.find_variable_by_id( ZERO_INTEGER ), ConsesLow.list( $const233$elementOf, $kw231$VAR, reader.bq_cons( $const234$TheSet, variables.find_variable_by_id(
        ONE_INTEGER ) ) ) );
    final SubLObject v_bindings = rkf_salient_descriptor_bindings( variable, subform, conjuncts, $sym235$RKF_SD_SMALL_SET_BINDINGS_OK_, UNPROVIDED );
    return v_bindings;
  }

  @SubLTranslatedFile.SubL(source = "cycl/rkf-salient-descriptor.lisp", position = 93020L)
  public static SubLObject rkf_sd_small_set_bindings_okP(final SubLObject v_bindings, final SubLObject mt)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    if( NIL == v_bindings )
    {
      return NIL;
    }
    final SubLObject elements = bindings.subst_bindings( v_bindings, variables.find_variable_by_id( ONE_INTEGER ) );
    return list_utilities.lengthLE( elements, $rkf_choice_count_cutoff$.getDynamicValue( thread ), UNPROVIDED );
  }

  @SubLTranslatedFile.SubL(source = "cycl/rkf-salient-descriptor.lisp", position = 93255L)
  public static SubLObject rkf_salient_descriptor_bindings(final SubLObject variable, final SubLObject subform, final SubLObject conjuncts, final SubLObject test, SubLObject mt)
  {
    if( mt == UNPROVIDED )
    {
      mt = NIL;
    }
    final SubLObject v_bindings = unification_utilities.term_unify( cycl_utilities.expression_subst( variable, $kw231$VAR, el_utilities.make_conjunction( conjuncts ), UNPROVIDED, UNPROVIDED ), subform, UNPROVIDED,
        UNPROVIDED );
    if( NIL != Functions.funcall( test, v_bindings, mt ) )
    {
      return v_bindings;
    }
    final SubLObject backward_bindings = unification_utilities.term_unify( cycl_utilities.expression_subst( variable, $kw231$VAR, el_utilities.make_conjunction( Sequences.nreverse( conjuncts ) ), UNPROVIDED,
        UNPROVIDED ), subform, UNPROVIDED, UNPROVIDED );
    return ( NIL != Functions.funcall( test, backward_bindings, mt ) ) ? backward_bindings : NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/rkf-salient-descriptor.lisp", position = 93741L)
  public static SubLObject rkf_salient_descriptor_assert_formula(final SubLObject formula)
  {
    if( NIL == el_utilities.el_conjunction_p( formula ) )
    {
      return formula;
    }
    SubLObject conjuncts = NIL;
    SubLObject cdolist_list_var;
    final SubLObject args = cdolist_list_var = cycl_utilities.formula_args( formula, $kw185$IGNORE );
    SubLObject subform = NIL;
    subform = cdolist_list_var.first();
    while ( NIL != cdolist_list_var)
    {
      if( NIL == rkf_salient_descriptor_not_assertible_sentenceP( subform ) )
      {
        conjuncts = ConsesLow.cons( subform, conjuncts );
      }
      cdolist_list_var = cdolist_list_var.rest();
      subform = cdolist_list_var.first();
    }
    return rkf_sd_conjoin( Sequences.nreverse( conjuncts ), T, NIL );
  }

  @SubLTranslatedFile.SubL(source = "cycl/rkf-salient-descriptor.lisp", position = 94222L)
  public static SubLObject rkf_salient_descriptor_not_assertible_sentenceP(final SubLObject conjunct)
  {
    if( NIL != cycl_grammar.cycl_atomic_sentence_p( conjunct ) )
    {
      final SubLObject predicate = cycl_utilities.atomic_sentence_predicate( conjunct );
      final SubLObject not_assertibleP = list_utilities.sublisp_boolean( kb_mapping_utilities.fpred_value( predicate, $const236$notAssertible, ONE_INTEGER, ONE_INTEGER, UNPROVIDED ) );
      return not_assertibleP;
    }
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/rkf-salient-descriptor.lisp", position = 94671L)
  public static SubLObject rkf_generate_interaction_example_instances_formula(final SubLObject variable, final SubLObject mt)
  {
    return el_utilities.list_to_elf( ConsesLow.list( $const237$or, ConsesLow.list( $const238$termDependsOn, variable, mt ), ConsesLow.list( $const239$uiaDisplayTerm, variable, mt ) ) );
  }

  @SubLTranslatedFile.SubL(source = "cycl/rkf-salient-descriptor.lisp", position = 94930L)
  public static SubLObject rkf_example_instances_backchain_level()
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    return $rkf_example_instances_backchain_level$.getDynamicValue( thread );
  }

  @SubLTranslatedFile.SubL(source = "cycl/rkf-salient-descriptor.lisp", position = 95329L)
  public static SubLObject rkf_example_instances(final SubLObject variable, final SubLObject knowledge_gap_sentence, final SubLObject v_term, final SubLObject constraints, final SubLObject salient_property,
      final SubLObject mt, SubLObject how_many, SubLObject used_examples, SubLObject include_types)
  {
    if( how_many == UNPROVIDED )
    {
      how_many = THREE_INTEGER;
    }
    if( used_examples == UNPROVIDED )
    {
      used_examples = NIL;
    }
    if( include_types == UNPROVIDED )
    {
      include_types = $kw59$ALL;
    }
    final SubLThread thread = SubLProcess.currentSubLThread();
    SubLObject examples = NIL;
    final SubLObject focal_term_analog_var = czer_utilities.unique_el_var_wrt_expression( knowledge_gap_sentence, UNPROVIDED );
    final SubLObject local_state;
    final SubLObject state = local_state = memoization_state.possibly_new_memoization_state();
    final SubLObject _prev_bind_0 = memoization_state.$memoization_state$.currentBinding( thread );
    try
    {
      memoization_state.$memoization_state$.bind( local_state, thread );
      final SubLObject original_memoization_process = memoization_state.memoization_state_original_process( local_state );
      try
      {
        final SubLObject already_resourcing_p = sbhl_marking_vars.$resourcing_sbhl_marking_spaces_p$.getDynamicValue( thread );
        final SubLObject _prev_bind_0_$149 = sbhl_marking_vars.$resourced_sbhl_marking_space_limit$.currentBinding( thread );
        final SubLObject _prev_bind_2 = sbhl_marking_vars.$resourced_sbhl_marking_spaces$.currentBinding( thread );
        final SubLObject _prev_bind_3 = sbhl_marking_vars.$resourcing_sbhl_marking_spaces_p$.currentBinding( thread );
        try
        {
          sbhl_marking_vars.$resourced_sbhl_marking_space_limit$.bind( sbhl_marking_vars.determine_resource_limit( already_resourcing_p, SIX_INTEGER ), thread );
          sbhl_marking_vars.$resourced_sbhl_marking_spaces$.bind( sbhl_marking_vars.possibly_new_marking_resource( already_resourcing_p ), thread );
          sbhl_marking_vars.$resourcing_sbhl_marking_spaces_p$.bind( T, thread );
          final SubLObject reuse_existingP = rkf_sd_problem_store_okP( $rkf_sd_problem_store$.getDynamicValue( thread ) );
          final SubLObject _prev_bind_0_$150 = $rkf_sd_problem_store$.currentBinding( thread );
          try
          {
            $rkf_sd_problem_store$.bind( rkf_sd_find_or_make_problem_store(), thread );
            final SubLObject store = $rkf_sd_problem_store$.getDynamicValue( thread );
            try
            {
              SubLObject adjusted_how_many = rkf_sd_examples_adjusted_number_constraint( how_many );
              final SubLObject local_terms = ( NIL != rkf_example_types_include_type_p( include_types, $kw240$CONSTRAINT_MATCHER ) ) ? rkf_local_example_instances( variable, v_term, constraints, mt, adjusted_how_many,
                  used_examples, focal_term_analog_var ) : NIL;
              SubLObject precedents = NIL;
              if( NIL != rkf_example_types_include_type_p( include_types, $kw241$PRECEDENT ) )
              {
                final SubLObject precedent_query_sentence = rkf_sd_precedent_query_sentence( focal_term_analog_var, v_term, knowledge_gap_sentence, salient_property );
                precedents = rkf_asserted_example_instances( variable, precedent_query_sentence, mt, how_many, used_examples, focal_term_analog_var );
              }
              examples = rkf_add_examples( conses_high.intersection( local_terms, precedents, Symbols.symbol_function( EQUAL ), $sym242$RKF_SD_EXAMPLE_TERM ), variable, knowledge_gap_sentence, mt, examples, how_many,
                  UNPROVIDED );
              examples = rkf_add_examples( local_terms, variable, knowledge_gap_sentence, mt, examples, how_many, UNPROVIDED );
              examples = rkf_add_examples( precedents, variable, knowledge_gap_sentence, mt, examples, how_many, UNPROVIDED );
              adjusted_how_many = rkf_sd_examples_adjusted_number_constraint( Numbers.subtract( how_many, Sequences.length( examples ) ) );
              if( adjusted_how_many.isPositive() && NIL != rkf_example_types_include_type_p( include_types, $kw240$CONSTRAINT_MATCHER ) )
              {
                final SubLObject constraint_matchers = rkf_example_instances_ask( variable, constraints, mt, adjusted_how_many, $kw240$CONSTRAINT_MATCHER, used_examples, focal_term_analog_var );
                examples = rkf_add_examples( constraint_matchers, variable, knowledge_gap_sentence, mt, examples, how_many, UNPROVIDED );
              }
            }
            finally
            {
              final SubLObject _prev_bind_0_$151 = Threads.$is_thread_performing_cleanupP$.currentBinding( thread );
              try
              {
                Threads.$is_thread_performing_cleanupP$.bind( T, thread );
                final SubLObject _values = Values.getValuesAsVector();
                if( NIL == reuse_existingP )
                {
                  rkf_sd_free_problem_store( store );
                }
                Values.restoreValuesFromVector( _values );
              }
              finally
              {
                Threads.$is_thread_performing_cleanupP$.rebind( _prev_bind_0_$151, thread );
              }
            }
          }
          finally
          {
            $rkf_sd_problem_store$.rebind( _prev_bind_0_$150, thread );
          }
        }
        finally
        {
          sbhl_marking_vars.$resourcing_sbhl_marking_spaces_p$.rebind( _prev_bind_3, thread );
          sbhl_marking_vars.$resourced_sbhl_marking_spaces$.rebind( _prev_bind_2, thread );
          sbhl_marking_vars.$resourced_sbhl_marking_space_limit$.rebind( _prev_bind_0_$149, thread );
        }
      }
      finally
      {
        final SubLObject _prev_bind_0_$152 = Threads.$is_thread_performing_cleanupP$.currentBinding( thread );
        try
        {
          Threads.$is_thread_performing_cleanupP$.bind( T, thread );
          final SubLObject _values2 = Values.getValuesAsVector();
          memoization_state.memoization_state_possibly_clear_original_process( local_state, original_memoization_process );
          Values.restoreValuesFromVector( _values2 );
        }
        finally
        {
          Threads.$is_thread_performing_cleanupP$.rebind( _prev_bind_0_$152, thread );
        }
      }
    }
    finally
    {
      memoization_state.$memoization_state$.rebind( _prev_bind_0, thread );
    }
    return list_utilities.first_n( how_many, examples );
  }

  @SubLTranslatedFile.SubL(source = "cycl/rkf-salient-descriptor.lisp", position = 98079L)
  public static SubLObject rkf_sd_examples_adjusted_number_constraint(final SubLObject how_many)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    final SubLObject fudge_factor = ( NIL != $rkf_example_instances_wff_checkP$.getDynamicValue( thread ) ) ? FOUR_INTEGER : ONE_INTEGER;
    return Numbers.multiply( how_many, fudge_factor );
  }

  @SubLTranslatedFile.SubL(source = "cycl/rkf-salient-descriptor.lisp", position = 98258L)
  public static SubLObject rkf_asserted_example_instances(final SubLObject variable, final SubLObject precedent_query_sentence, final SubLObject mt, final SubLObject how_many, final SubLObject used_examples,
      final SubLObject focal_term_analog_var)
  {
    return rkf_example_instances_ask( variable, precedent_query_sentence, mt, how_many, $kw241$PRECEDENT, used_examples, focal_term_analog_var );
  }

  @SubLTranslatedFile.SubL(source = "cycl/rkf-salient-descriptor.lisp", position = 98531L)
  public static SubLObject rkf_local_example_instances(final SubLObject variable, final SubLObject v_term, final SubLObject constraints, final SubLObject mt, final SubLObject how_many, final SubLObject used_examples,
      final SubLObject focal_term_analog_var)
  {
    final SubLObject local_terms_query_sentence = rkf_generate_interaction_example_instances_formula( variable, mt );
    final SubLObject constrained_local_query_sentence = ( NIL != el_utilities.el_formula_p( constraints ) ) ? rkf_sd_conjoin( ConsesLow.list( constraints, local_terms_query_sentence ), NIL, NIL )
        : local_terms_query_sentence;
    final SubLObject local_terms = Sequences.remove( v_term, rkf_example_instances_ask( variable, constrained_local_query_sentence, mt, how_many, $kw240$CONSTRAINT_MATCHER, used_examples, focal_term_analog_var ), Symbols
        .symbol_function( EQUAL ), $sym242$RKF_SD_EXAMPLE_TERM, UNPROVIDED, UNPROVIDED, UNPROVIDED );
    return local_terms;
  }

  @SubLTranslatedFile.SubL(source = "cycl/rkf-salient-descriptor.lisp", position = 99207L)
  public static SubLObject rkf_example_types_include_type_p(final SubLObject include_types, final SubLObject type)
  {
    return makeBoolean( include_types == $kw59$ALL || NIL != conses_high.member( type, include_types, UNPROVIDED, UNPROVIDED ) );
  }

  @SubLTranslatedFile.SubL(source = "cycl/rkf-salient-descriptor.lisp", position = 99409L)
  public static SubLObject rkf_add_examples(final SubLObject candidates, final SubLObject var, final SubLObject knowledge_gap_sentence, final SubLObject mt, final SubLObject examples, final SubLObject how_many,
      SubLObject further_constraint_sentence)
  {
    if( further_constraint_sentence == UNPROVIDED )
    {
      further_constraint_sentence = NIL;
    }
    final SubLThread thread = SubLProcess.currentSubLThread();
    final SubLObject how_many_more = Numbers.subtract( how_many, Sequences.length( examples ) );
    SubLObject enoughP = makeBoolean( !how_many_more.isPositive() );
    SubLObject new_examples = NIL;
    if( NIL == enoughP )
    {
      SubLObject csome_list_var = candidates;
      SubLObject candidate = NIL;
      candidate = csome_list_var.first();
      while ( NIL == enoughP && NIL != csome_list_var)
      {
        if( NIL == rkf_example_in_examplesP( candidate, examples ) && NIL == rkf_example_in_examplesP( candidate, new_examples ) && ( NIL == el_utilities.el_formula_p( further_constraint_sentence )
            || NIL != rkf_sd_known( cycl_utilities.expression_subst( rkf_salient_descriptor_datastructures.rkf_sd_example_term( candidate ), var, further_constraint_sentence, UNPROVIDED, UNPROVIDED ), mt, UNPROVIDED ) )
            && ( $kw240$CONSTRAINT_MATCHER != rkf_salient_descriptor_datastructures.rkf_sd_example_type( candidate ) || NIL != rkf_example_not_known_falseP( candidate, var, knowledge_gap_sentence, mt ) )
            && ( NIL == $rkf_example_instances_wff_checkP$.getDynamicValue( thread ) || NIL != rkf_example_wffP( candidate, var, knowledge_gap_sentence, mt ) ) )
        {
          new_examples = ConsesLow.cons( candidate, new_examples );
          enoughP = list_utilities.lengthGE( new_examples, how_many_more, UNPROVIDED );
        }
        csome_list_var = csome_list_var.rest();
        candidate = csome_list_var.first();
      }
    }
    return ConsesLow.nconc( examples, Sequences.nreverse( new_examples ) );
  }

  @SubLTranslatedFile.SubL(source = "cycl/rkf-salient-descriptor.lisp", position = 100427L)
  public static SubLObject rkf_example_in_examplesP(final SubLObject candidate, final SubLObject examples)
  {
    return subl_promotions.memberP( rkf_salient_descriptor_datastructures.rkf_sd_example_term( candidate ), examples, Symbols.symbol_function( EQUAL ), Symbols.symbol_function( $sym242$RKF_SD_EXAMPLE_TERM ) );
  }

  @SubLTranslatedFile.SubL(source = "cycl/rkf-salient-descriptor.lisp", position = 100814L)
  public static SubLObject rkf_example_not_known_falseP(final SubLObject example, final SubLObject var, final SubLObject knowledge_gap_sentence, final SubLObject mt)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    final SubLObject example_term = rkf_salient_descriptor_datastructures.rkf_sd_example_term( example );
    final SubLObject ask_sentence = el_utilities.make_negation( cycl_utilities.expression_subst( example_term, var, knowledge_gap_sentence, UNPROVIDED, UNPROVIDED ) );
    SubLObject result = NIL;
    final SubLObject _prev_bind_0 = $rkf_sd_known_time_cutoff$.currentBinding( thread );
    try
    {
      $rkf_sd_known_time_cutoff$.bind( $rkf_example_not_known_false_time_cutoff$.getDynamicValue( thread ).isNumber() ? Numbers.min( $rkf_sd_known_time_cutoff$.getDynamicValue( thread ),
          $rkf_example_not_known_false_time_cutoff$.getDynamicValue( thread ) ) : $rkf_sd_known_time_cutoff$.getDynamicValue( thread ), thread );
      result = makeBoolean( NIL == rkf_sd_known( ask_sentence, mt, UNPROVIDED ) );
    }
    finally
    {
      $rkf_sd_known_time_cutoff$.rebind( _prev_bind_0, thread );
    }
    return result;
  }

  @SubLTranslatedFile.SubL(source = "cycl/rkf-salient-descriptor.lisp", position = 101357L)
  public static SubLObject rkf_example_wffP(final SubLObject example, final SubLObject var, final SubLObject knowledge_gap_sentence, final SubLObject mt)
  {
    final SubLObject example_term = rkf_salient_descriptor_datastructures.rkf_sd_example_term( example );
    final SubLObject ask_sentence = cycl_utilities.expression_subst( example_term, var, knowledge_gap_sentence, UNPROVIDED, UNPROVIDED );
    return rkf_example_wffP_int( ask_sentence, mt );
  }

  @SubLTranslatedFile.SubL(source = "cycl/rkf-salient-descriptor.lisp", position = 101613L)
  public static SubLObject rkf_example_wffP_int_internal(final SubLObject ask_sentence, final SubLObject mt)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    SubLObject result = NIL;
    SubLObject ignore_errors_tag = NIL;
    try
    {
      thread.throwStack.push( $kw244$IGNORE_ERRORS_TARGET );
      final SubLObject _prev_bind_0 = Errors.$error_handler$.currentBinding( thread );
      try
      {
        Errors.$error_handler$.bind( Symbols.symbol_function( $sym245$IGNORE_ERRORS_HANDLER ), thread );
        try
        {
          final SubLObject _prev_bind_0_$153 = wff_vars.$validate_expansionsP$.currentBinding( thread );
          final SubLObject _prev_bind_2 = control_vars.$suppress_conflict_noticesP$.currentBinding( thread );
          try
          {
            wff_vars.$validate_expansionsP$.bind( T, thread );
            control_vars.$suppress_conflict_noticesP$.bind( T, thread );
            result = wff.el_wff_assertibleP( ask_sentence, mt, UNPROVIDED );
          }
          finally
          {
            control_vars.$suppress_conflict_noticesP$.rebind( _prev_bind_2, thread );
            wff_vars.$validate_expansionsP$.rebind( _prev_bind_0_$153, thread );
          }
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
      ignore_errors_tag = Errors.handleThrowable( ccatch_env_var, $kw244$IGNORE_ERRORS_TARGET );
    }
    finally
    {
      thread.throwStack.pop();
    }
    return result;
  }

  @SubLTranslatedFile.SubL(source = "cycl/rkf-salient-descriptor.lisp", position = 101613L)
  public static SubLObject rkf_example_wffP_int(final SubLObject ask_sentence, final SubLObject mt)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    final SubLObject v_memoization_state = memoization_state.$memoization_state$.getDynamicValue( thread );
    SubLObject caching_state = NIL;
    if( NIL == v_memoization_state )
    {
      return rkf_example_wffP_int_internal( ask_sentence, mt );
    }
    caching_state = memoization_state.memoization_state_lookup( v_memoization_state, $sym243$RKF_EXAMPLE_WFF__INT, UNPROVIDED );
    if( NIL == caching_state )
    {
      caching_state = memoization_state.create_caching_state( memoization_state.memoization_state_lock( v_memoization_state ), $sym243$RKF_EXAMPLE_WFF__INT, TWO_INTEGER, NIL, EQUAL, UNPROVIDED );
      memoization_state.memoization_state_put( v_memoization_state, $sym243$RKF_EXAMPLE_WFF__INT, caching_state );
    }
    final SubLObject sxhash = memoization_state.sxhash_calc_2( ask_sentence, mt );
    final SubLObject collisions = memoization_state.caching_state_lookup( caching_state, sxhash, UNPROVIDED );
    if( !collisions.eql( memoization_state.$memoized_item_not_found$.getGlobalValue() ) )
    {
      SubLObject cdolist_list_var = collisions;
      SubLObject collision = NIL;
      collision = cdolist_list_var.first();
      while ( NIL != cdolist_list_var)
      {
        SubLObject cached_args = collision.first();
        final SubLObject results2 = conses_high.second( collision );
        if( ask_sentence.equal( cached_args.first() ) )
        {
          cached_args = cached_args.rest();
          if( NIL != cached_args && NIL == cached_args.rest() && mt.equal( cached_args.first() ) )
          {
            return memoization_state.caching_results( results2 );
          }
        }
        cdolist_list_var = cdolist_list_var.rest();
        collision = cdolist_list_var.first();
      }
    }
    final SubLObject results3 = Values.arg2( thread.resetMultipleValues(), Values.multiple_value_list( rkf_example_wffP_int_internal( ask_sentence, mt ) ) );
    memoization_state.caching_state_enter_multi_key_n( caching_state, sxhash, collisions, results3, ConsesLow.list( ask_sentence, mt ) );
    return memoization_state.caching_results( results3 );
  }

  @SubLTranslatedFile.SubL(source = "cycl/rkf-salient-descriptor.lisp", position = 101891L)
  public static SubLObject rkf_example_instances_ask_properties(final SubLObject how_many, final SubLObject how_many_known)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    SubLObject fudge_factor = TWO_INTEGER;
    if( NIL == $rkf_example_instances_wff_checkP$.getDynamicValue( thread ) )
    {
      fudge_factor = ONE_INTEGER;
    }
    return ConsesLow.list( new SubLObject[] { $kw69$PROBLEM_STORE, rkf_sd_find_or_make_problem_store(), $kw70$ANSWER_LANGUAGE, $kw71$HL, $kw103$CACHE_INFERENCE_RESULTS_, NIL, $kw104$RESULT_UNIQUENESS, $kw105$BINDINGS,
      $kw106$RETURN, $kw180$BINDINGS_AND_SUPPORTS, $kw110$MAX_NUMBER, Numbers.add( how_many_known, Numbers.multiply( fudge_factor, how_many ) ), $kw159$FORGET_EXTRA_RESULTS_, T, $kw111$MAX_TIME,
      $rkf_example_instances_time_cutoff$.getDynamicValue( thread ), $kw108$PRODUCTIVITY_LIMIT, $int109$100000, $kw113$MAX_TRANSFORMATION_DEPTH, rkf_example_instances_backchain_level()
    } );
  }

  @SubLTranslatedFile.SubL(source = "cycl/rkf-salient-descriptor.lisp", position = 102650L)
  public static SubLObject rkf_example_instances_ask(final SubLObject variable, SubLObject formula, final SubLObject mt, final SubLObject how_many, final SubLObject example_type, SubLObject used_examples,
      final SubLObject focal_term_analog_var)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    if( NIL == cycl_utilities.expression_find( variable, formula, UNPROVIDED, UNPROVIDED, UNPROVIDED ) )
    {
      return NIL;
    }
    SubLObject cdolist_list_var = el_utilities.sentence_free_variables( formula, UNPROVIDED, UNPROVIDED, UNPROVIDED );
    SubLObject var = NIL;
    var = cdolist_list_var.first();
    while ( NIL != cdolist_list_var)
    {
      if( !var.eql( variable ) && !var.eql( focal_term_analog_var ) )
      {
        formula = el_utilities.make_existential( var, formula );
      }
      cdolist_list_var = cdolist_list_var.rest();
      var = cdolist_list_var.first();
    }
    SubLObject ans = NIL;
    SubLObject enoughP = list_utilities.lengthGE( ans, how_many, UNPROVIDED );
    final SubLObject v_properties = rkf_example_instances_ask_properties( how_many, Sequences.length( used_examples ) );
    SubLObject candidates = NIL;
    if( NIL == enoughP )
    {
      thread.resetMultipleValues();
      final SubLObject ask_results = inference_kernel.new_cyc_query( formula, mt, v_properties );
      final SubLObject exit_condition = thread.secondMultipleValue();
      thread.resetMultipleValues();
      if( $kw111$MAX_TIME == exit_condition && $rkf_example_instances_time_cutoff$.getDynamicValue( thread ).isPositive() )
      {
        Errors.warn( $str246$__RKF_EXAMPLE_INSTANCES_ASK_timed, $rkf_example_instances_time_cutoff$.getDynamicValue( thread ), formula, mt );
      }
      SubLObject cdolist_list_var2 = ask_results;
      SubLObject ask_result = NIL;
      ask_result = cdolist_list_var2.first();
      while ( NIL != cdolist_list_var2)
      {
        SubLObject current;
        final SubLObject datum = current = ask_result;
        SubLObject v_bindings = NIL;
        SubLObject supports = NIL;
        cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list184 );
        v_bindings = current.first();
        current = current.rest();
        cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list184 );
        supports = current.first();
        current = current.rest();
        if( NIL == current )
        {
          final SubLObject v_term = bindings.variable_lookup( variable, v_bindings );
          final SubLObject focal_term_analog = bindings.variable_lookup( focal_term_analog_var, v_bindings );
          if( NIL == subl_promotions.memberP( v_term, candidates, Symbols.symbol_function( EQUAL ), $sym242$RKF_SD_EXAMPLE_TERM ) && NIL == conses_high.member( v_term, used_examples, Symbols.symbol_function( EQUAL ),
              $sym242$RKF_SD_EXAMPLE_TERM ) )
          {
            final SubLObject example = rkf_salient_descriptor_datastructures.new_rkf_sd_example( example_type, v_term, supports, focal_term_analog );
            candidates = ConsesLow.cons( example, candidates );
          }
        }
        else
        {
          cdestructuring_bind.cdestructuring_bind_error( datum, $list184 );
        }
        cdolist_list_var2 = cdolist_list_var2.rest();
        ask_result = cdolist_list_var2.first();
      }
    }
    candidates = Sort.sort( candidates, $sym247$GENERALITY_ESTIMATE_, $sym242$RKF_SD_EXAMPLE_TERM );
    if( NIL == enoughP )
    {
      SubLObject csome_list_var = candidates;
      SubLObject candidate = NIL;
      candidate = csome_list_var.first();
      while ( NIL == enoughP && NIL != csome_list_var)
      {
        if( NIL == rkf_bad_exampleP( candidate, mt ) )
        {
          ans = ConsesLow.cons( candidate, ans );
          enoughP = list_utilities.lengthGE( ans, how_many, UNPROVIDED );
        }
        csome_list_var = csome_list_var.rest();
        candidate = csome_list_var.first();
      }
    }
    ans = Sort.sort( ans, $sym248$RKF_BETTER_EXAMPLE_, UNPROVIDED );
    if( NIL == ans && NIL != el_utilities.el_disjunction_p( formula ) )
    {
      SubLObject cdolist_list_var3 = cycl_utilities.formula_args( formula, UNPROVIDED );
      SubLObject disjunct = NIL;
      disjunct = cdolist_list_var3.first();
      while ( NIL != cdolist_list_var3)
      {
        final SubLObject _prev_bind_0 = $rkf_sd_problem_store$.currentBinding( thread );
        try
        {
          $rkf_sd_problem_store$.bind( $kw249$BUG_WORKAROUND, thread );
          final SubLObject new_examples = rkf_example_instances_ask( variable, disjunct, mt, how_many, example_type, used_examples, focal_term_analog_var );
          ans = ( used_examples = ConsesLow.append( ans, new_examples ) );
        }
        finally
        {
          $rkf_sd_problem_store$.rebind( _prev_bind_0, thread );
        }
        cdolist_list_var3 = cdolist_list_var3.rest();
        disjunct = cdolist_list_var3.first();
      }
    }
    return list_utilities.first_n( how_many, ans );
  }

  @SubLTranslatedFile.SubL(source = "cycl/rkf-salient-descriptor.lisp", position = 104990L)
  public static SubLObject rkf_bad_exampleP(final SubLObject candidate, final SubLObject mt)
  {
    final SubLObject v_term = rkf_salient_descriptor_datastructures.rkf_sd_example_term( candidate );
    return makeBoolean( NIL != rkf_relevance_utilities.rkf_irrelevant_term( v_term, mt ) || NIL != kb_accessors.indeterminate_termP( v_term ) );
  }

  @SubLTranslatedFile.SubL(source = "cycl/rkf-salient-descriptor.lisp", position = 105170L)
  public static SubLObject rkf_better_exampleP(final SubLObject ex1, final SubLObject ex2)
  {
    final SubLObject term1 = rkf_salient_descriptor_datastructures.rkf_sd_example_term( ex1 );
    final SubLObject term2 = rkf_salient_descriptor_datastructures.rkf_sd_example_term( ex2 );
    if( NIL != constant_handles.constant_p( term1 ) && NIL == constant_handles.constant_p( term2 ) )
    {
      return T;
    }
    return NIL;
  }

  public static SubLObject declare_rkf_salient_descriptor_file()
  {
    SubLFiles.declareFunction( me, "rkf_salient_descriptor_formula_type_p", "RKF-SALIENT-DESCRIPTOR-FORMULA-TYPE-P", 1, 0, false );
    SubLFiles.declareFunction( me, "rkf_salient_formulas", "RKF-SALIENT-FORMULAS", 2, 1, false );
    SubLFiles.declareFunction( me, "rkf_salient_requirements", "RKF-SALIENT-REQUIREMENTS", 1, 1, false );
    SubLFiles.declareFunction( me, "rkf_salient_strong_suggestions", "RKF-SALIENT-STRONG-SUGGESTIONS", 1, 1, false );
    SubLFiles.declareFunction( me, "rkf_salient_weak_suggestions", "RKF-SALIENT-WEAK-SUGGESTIONS", 1, 1, false );
    SubLFiles.declareFunction( me, "rkf_salient_neighbor_suggestions", "RKF-SALIENT-NEIGHBOR-SUGGESTIONS", 1, 1, false );
    SubLFiles.declareFunction( me, "rkf_salient_descriptor", "RKF-SALIENT-DESCRIPTOR", 1, 2, false );
    SubLFiles.declareFunction( me, "rkf_salient_descriptor_parallel", "RKF-SALIENT-DESCRIPTOR-PARALLEL", 1, 1, false );
    SubLFiles.declareFunction( me, "rkf_requirements", "RKF-REQUIREMENTS", 1, 1, false );
    SubLFiles.declareFunction( me, "rkf_strong_suggestions", "RKF-STRONG-SUGGESTIONS", 1, 1, false );
    SubLFiles.declareFunction( me, "rkf_neighbor_suggestions", "RKF-NEIGHBOR-SUGGESTIONS", 1, 1, false );
    SubLFiles.declareFunction( me, "rkf_weak_suggestions", "RKF-WEAK-SUGGESTIONS", 1, 1, false );
    SubLFiles.declareFunction( me, "rkf_interaction_requirements", "RKF-INTERACTION-REQUIREMENTS", 1, 1, false );
    SubLFiles.declareFunction( me, "rkf_interaction_strong_suggestions", "RKF-INTERACTION-STRONG-SUGGESTIONS", 1, 1, false );
    SubLFiles.declareMacro( me, "with_rkf_sd_memoization", "WITH-RKF-SD-MEMOIZATION" );
    SubLFiles.declareFunction( me, "rkf_induced_salient_descriptor_query_sentences", "RKF-INDUCED-SALIENT-DESCRIPTOR-QUERY-SENTENCES", 1, 1, false );
    SubLFiles.declareFunction( me, "rkf_sd_justifications_from_basis_properties", "RKF-SD-JUSTIFICATIONS-FROM-BASIS-PROPERTIES", 3, 0, false );
    SubLFiles.declareFunction( me, "rkf_close_isas", "RKF-CLOSE-ISAS", 2, 0, false );
    SubLFiles.declareFunction( me, "rkf_close_genls", "RKF-CLOSE-GENLS", 2, 0, false );
    SubLFiles.declareFunction( me, "rkf_induced_salient_descriptor_meta_isas", "RKF-INDUCED-SALIENT-DESCRIPTOR-META-ISAS", 3, 2, false );
    SubLFiles.declareFunction( me, "rkf_make_meta_isa_formula", "RKF-MAKE-META-ISA-FORMULA", 2, 0, false );
    SubLFiles.declareFunction( me, "rkf_make_bin_pred_formula", "RKF-MAKE-BIN-PRED-FORMULA", 2, 0, false );
    SubLFiles.declareFunction( me, "rkf_make_salient_descriptor_rule", "RKF-MAKE-SALIENT-DESCRIPTOR-RULE", 4, 0, false );
    SubLFiles.declareFunction( me, "rkf_salient_descriptor_meta_isa_type_violationP_internal", "RKF-SALIENT-DESCRIPTOR-META-ISA-TYPE-VIOLATION?-INTERNAL", 3, 0, false );
    SubLFiles.declareFunction( me, "rkf_salient_descriptor_meta_isa_type_violationP", "RKF-SALIENT-DESCRIPTOR-META-ISA-TYPE-VIOLATION?", 3, 0, false );
    SubLFiles.declareFunction( me, "rkf_salient_descriptor_type_specs_internal", "RKF-SALIENT-DESCRIPTOR-TYPE-SPECS-INTERNAL", 2, 0, false );
    SubLFiles.declareFunction( me, "rkf_salient_descriptor_type_specs", "RKF-SALIENT-DESCRIPTOR-TYPE-SPECS", 2, 0, false );
    SubLFiles.declareMacro( me, "reusing_rkf_sd_problem_store", "REUSING-RKF-SD-PROBLEM-STORE" );
    SubLFiles.declareFunction( me, "rkf_sd_problem_store_okP", "RKF-SD-PROBLEM-STORE-OK?", 1, 0, false );
    SubLFiles.declareFunction( me, "rkf_sd_problem_store_checkpoint_currentP", "RKF-SD-PROBLEM-STORE-CHECKPOINT-CURRENT?", 1, 0, false );
    SubLFiles.declareFunction( me, "rkf_sd_problem_store_checkpoint", "RKF-SD-PROBLEM-STORE-CHECKPOINT", 1, 0, false );
    SubLFiles.declareFunction( me, "rkf_sd_find_or_make_problem_store", "RKF-SD-FIND-OR-MAKE-PROBLEM-STORE", 0, 0, false );
    SubLFiles.declareFunction( me, "rkf_sd_make_problem_store", "RKF-SD-MAKE-PROBLEM-STORE", 0, 0, false );
    SubLFiles.declareFunction( me, "rkf_sd_free_problem_store", "RKF-SD-FREE-PROBLEM-STORE", 1, 0, false );
    SubLFiles.declareFunction( me, "rkf_induced_salient_descriptor_common_properties", "RKF-INDUCED-SALIENT-DESCRIPTOR-COMMON-PROPERTIES", 2, 2, false );
    SubLFiles.declareFunction( me, "rkf_induced_salient_descriptor_common_properties_int", "RKF-INDUCED-SALIENT-DESCRIPTOR-COMMON-PROPERTIES-INT", 3, 0, false );
    SubLFiles.declareFunction( me, "rkf_induced_salient_descriptor_bin_pred_properties", "RKF-INDUCED-SALIENT-DESCRIPTOR-BIN-PRED-PROPERTIES", 4, 0, false );
    SubLFiles.declareFunction( me, "rkf_induced_salient_descriptor_bin_pred_info", "RKF-INDUCED-SALIENT-DESCRIPTOR-BIN-PRED-INFO", 4, 0, false );
    SubLFiles.declareFunction( me, "rkf_induced_salient_descriptor_meta_isa_properties", "RKF-INDUCED-SALIENT-DESCRIPTOR-META-ISA-PROPERTIES", 3, 0, false );
    SubLFiles.declareFunction( me, "rkf_known_meta_isas_from_basis_properties", "RKF-KNOWN-META-ISAS-FROM-BASIS-PROPERTIES", 2, 0, false );
    SubLFiles.declareFunction( me, "rkf_known_meta_isas_from_basis_property", "RKF-KNOWN-META-ISAS-FROM-BASIS-PROPERTY", 2, 0, false );
    SubLFiles.declareFunction( me, "rkf_induced_salient_descriptor_meta_isa_info", "RKF-INDUCED-SALIENT-DESCRIPTOR-META-ISA-INFO", 3, 0, false );
    SubLFiles.declareFunction( me, "rkf_sd_deconstruct_basis_property", "RKF-SD-DECONSTRUCT-BASIS-PROPERTY", 1, 0, false );
    SubLFiles.declareFunction( me, "rkf_sd_construct_basis_property", "RKF-SD-CONSTRUCT-BASIS-PROPERTY", 2, 0, false );
    SubLFiles.declareFunction( me, "rkf_sd_properties_from_bin_pred_info", "RKF-SD-PROPERTIES-FROM-BIN-PRED-INFO", 1, 0, false );
    SubLFiles.declareFunction( me, "rkf_sd_properties_from_meta_isa_info", "RKF-SD-PROPERTIES-FROM-META-ISA-INFO", 1, 0, false );
    SubLFiles.declareFunction( me, "rkf_sd_make_superior_basis_property", "RKF-SD-MAKE-SUPERIOR-BASIS-PROPERTY", 2, 0, false );
    SubLFiles.declareFunction( me, "rkf_sd_induction_basis_properties", "RKF-SD-INDUCTION-BASIS-PROPERTIES", 2, 0, false );
    SubLFiles.declareFunction( me, "rkf_induced_salient_descriptor_superior_properties", "RKF-INDUCED-SALIENT-DESCRIPTOR-SUPERIOR-PROPERTIES", 3, 1, false );
    SubLFiles.declareFunction( me, "rkf_induced_salient_descriptor_superiors", "RKF-INDUCED-SALIENT-DESCRIPTOR-SUPERIORS", 4, 0, false );
    SubLFiles.declareFunction( me, "rkf_induced_salient_descriptor_slots", "RKF-INDUCED-SALIENT-DESCRIPTOR-SLOTS", 4, 1, false );
    SubLFiles.declareFunction( me, "rkf_salient_descriptor_specP", "RKF-SALIENT-DESCRIPTOR-SPEC?", 2, 1, false );
    SubLFiles.declareFunction( me, "rkf_salient_descriptor_genlP_internal", "RKF-SALIENT-DESCRIPTOR-GENL?-INTERNAL", 3, 0, false );
    SubLFiles.declareFunction( me, "rkf_salient_descriptor_genlP", "RKF-SALIENT-DESCRIPTOR-GENL?", 3, 0, false );
    SubLFiles.declareFunction( me, "rkf_salient_descriptor_rule_from_spec", "RKF-SALIENT-DESCRIPTOR-RULE-FROM-SPEC", 1, 1, false );
    SubLFiles.declareFunction( me, "rkf_rule_spec_supports", "RKF-RULE-SPEC-SUPPORTS", 3, 0, false );
    SubLFiles.declareFunction( me, "rkf_justification_sentence_from_rule_spec", "RKF-JUSTIFICATION-SENTENCE-FROM-RULE-SPEC", 2, 0, false );
    SubLFiles.declareFunction( me, "rkf_induced_rule_support", "RKF-INDUCED-RULE-SUPPORT", 2, 0, false );
    SubLFiles.declareFunction( me, "rkf_salient_descriptor_rule_spec_p", "RKF-SALIENT-DESCRIPTOR-RULE-SPEC-P", 1, 0, false );
    SubLFiles.declareFunction( me, "new_rkf_salient_descriptor_rule_spec", "NEW-RKF-SALIENT-DESCRIPTOR-RULE-SPEC", 4, 0, false );
    SubLFiles.declareFunction( me, "rkf_salient_descriptor_rule_spec_slot", "RKF-SALIENT-DESCRIPTOR-RULE-SPEC-SLOT", 1, 0, false );
    SubLFiles.declareFunction( me, "rkf_sd_binary_preds_inference_properties", "RKF-SD-BINARY-PREDS-INFERENCE-PROPERTIES", 1, 0, false );
    SubLFiles.declareFunction( me, "rkf_collection_promising_for_binary_pred_inductionP", "RKF-COLLECTION-PROMISING-FOR-BINARY-PRED-INDUCTION?", 2, 2, false );
    SubLFiles.declareFunction( me, "rkf_induced_suggestion_pred_of_strength", "RKF-INDUCED-SUGGESTION-PRED-OF-STRENGTH", 2, 0, false );
    SubLFiles.declareFunction( me, "rkf_induced_salient_descriptor_binary_preds", "RKF-INDUCED-SALIENT-DESCRIPTOR-BINARY-PREDS", 3, 3, false );
    SubLFiles.declareFunction( me, "rkf_noninduced_salient_descriptor_binary_preds", "RKF-NONINDUCED-SALIENT-DESCRIPTOR-BINARY-PREDS", 3, 0, false );
    SubLFiles.declareFunction( me, "rkf_sd_never_use_binary_pred_p", "RKF-SD-NEVER-USE-BINARY-PRED-P", 1, 0, false );
    SubLFiles.declareFunction( me, "rkf_salient_descriptor_get_inferiors_internal", "RKF-SALIENT-DESCRIPTOR-GET-INFERIORS-INTERNAL", 3, 1, false );
    SubLFiles.declareFunction( me, "rkf_salient_descriptor_get_inferiors", "RKF-SALIENT-DESCRIPTOR-GET-INFERIORS", 3, 1, false );
    SubLFiles.declareFunction( me, "rkf_salient_descriptor_binary_pred_type_violationP_internal", "RKF-SALIENT-DESCRIPTOR-BINARY-PRED-TYPE-VIOLATION?-INTERNAL", 3, 0, false );
    SubLFiles.declareFunction( me, "rkf_salient_descriptor_binary_pred_type_violationP", "RKF-SALIENT-DESCRIPTOR-BINARY-PRED-TYPE-VIOLATION?", 3, 0, false );
    SubLFiles.declareFunction( me, "rkf_term_binary_preds_internal", "RKF-TERM-BINARY-PREDS-INTERNAL", 2, 0, false );
    SubLFiles.declareFunction( me, "rkf_term_binary_preds", "RKF-TERM-BINARY-PREDS", 2, 0, false );
    SubLFiles.declareFunction( me, "rkf_term_meta_isas", "RKF-TERM-META-ISAS", 2, 0, false );
    SubLFiles.declareFunction( me, "rkf_term_all_meta_isas_internal", "RKF-TERM-ALL-META-ISAS-INTERNAL", 2, 0, false );
    SubLFiles.declareFunction( me, "rkf_term_all_meta_isas", "RKF-TERM-ALL-META-ISAS", 2, 0, false );
    SubLFiles.declareFunction( me, "rkf_rule_cnfs_for_term", "RKF-RULE-CNFS-FOR-TERM", 2, 1, false );
    SubLFiles.declareFunction( me, "rkf_sd_el_cnf_of_rule", "RKF-SD-EL-CNF-OF-RULE", 1, 0, false );
    SubLFiles.declareFunction( me, "rkf_sd_el_cnf_of_hl_cnf", "RKF-SD-EL-CNF-OF-HL-CNF", 2, 0, false );
    SubLFiles.declareFunction( me, "rkf_sd_el_wffP_internal", "RKF-SD-EL-WFF?-INTERNAL", 2, 0, false );
    SubLFiles.declareFunction( me, "rkf_sd_el_wffP", "RKF-SD-EL-WFF?", 2, 0, false );
    SubLFiles.declareFunction( me, "rkf_partial_bindings_for_term", "RKF-PARTIAL-BINDINGS-FOR-TERM", 2, 1, false );
    SubLFiles.declareFunction( me, "rkf_partial_bindings_for_term_var", "RKF-PARTIAL-BINDINGS-FOR-TERM-VAR", 4, 0, false );
    SubLFiles.declareFunction( me, "rkf_partial_bindings_for_formula", "RKF-PARTIAL-BINDINGS-FOR-FORMULA", 2, 3, false );
    SubLFiles.declareFunction( me, "rkf_sd_constraint_table", "RKF-SD-CONSTRAINT-TABLE", 2, 0, false );
    SubLFiles.declareFunction( me, "rkf_sd_rejected", "RKF-SD-REJECTED", 2, 0, false );
    SubLFiles.declareFunction( me, "rkf_sd_use_negation_by_failureP", "RKF-SD-USE-NEGATION-BY-FAILURE?", 1, 0, false );
    SubLFiles.declareFunction( me, "rkf_sd_known_problem_store_properties", "RKF-SD-KNOWN-PROBLEM-STORE-PROPERTIES", 0, 0, false );
    SubLFiles.declareFunction( me, "rkf_sd_known_static_inference_properties", "RKF-SD-KNOWN-STATIC-INFERENCE-PROPERTIES", 1, 1, false );
    SubLFiles.declareFunction( me, "rkf_sd_known_dynamic_inference_properties", "RKF-SD-KNOWN-DYNAMIC-INFERENCE-PROPERTIES", 2, 0, false );
    SubLFiles.declareFunction( me, "rkf_sd_known_internal", "RKF-SD-KNOWN-INTERNAL", 2, 1, false );
    SubLFiles.declareFunction( me, "rkf_sd_known", "RKF-SD-KNOWN", 2, 1, false );
    SubLFiles.declareFunction( me, "rkf_sd_existentially_unbind", "RKF-SD-EXISTENTIALLY-UNBIND", 1, 0, false );
    SubLFiles.declareFunction( me, "rkf_sd_possibly_existentially_unbind", "RKF-SD-POSSIBLY-EXISTENTIALLY-UNBIND", 1, 0, false );
    SubLFiles.declareFunction( me, "rkf_sd_known_some_good_binding_list_for_query_amongP", "RKF-SD-KNOWN-SOME-GOOD-BINDING-LIST-FOR-QUERY-AMONG?", 4, 0, false );
    SubLFiles.declareFunction( me, "rkf_sd_known_good_binding_list_for_queryP", "RKF-SD-KNOWN-GOOD-BINDING-LIST-FOR-QUERY?", 4, 0, false );
    SubLFiles.declareFunction( me, "rkf_sd_get_conjunct_bindings_internal", "RKF-SD-GET-CONJUNCT-BINDINGS-INTERNAL", 2, 0, false );
    SubLFiles.declareFunction( me, "rkf_sd_get_conjunct_bindings", "RKF-SD-GET-CONJUNCT-BINDINGS", 2, 0, false );
    SubLFiles.declareFunction( me, "rkf_sd_hl_for_el_vars_in_formula", "RKF-SD-HL-FOR-EL-VARS-IN-FORMULA", 1, 0, false );
    SubLFiles.declareFunction( me, "rkf_potential_rule_for_termP", "RKF-POTENTIAL-RULE-FOR-TERM?", 2, 1, false );
    SubLFiles.declareFunction( me, "rkf_sd_asent_unify", "RKF-SD-ASENT-UNIFY", 2, 1, false );
    SubLFiles.declareFunction( me, "rkf_unsatisfied_cnf_subbed_rule_formula", "RKF-UNSATISFIED-CNF-SUBBED-RULE-FORMULA", 4, 0, false );
    SubLFiles.declareFunction( me, "rkf_unsatisfied_cnf_rejectP", "RKF-UNSATISFIED-CNF-REJECT?", 3, 0, false );
    SubLFiles.declareFunction( me, "rkf_sd_neg_lits_knownP", "RKF-SD-NEG-LITS-KNOWN?", 2, 0, false );
    SubLFiles.declareFunction( me, "rkf_sd_el_fully_bound_p", "RKF-SD-EL-FULLY-BOUND-P", 1, 0, false );
    SubLFiles.declareFunction( me, "rkf_make_el_cnf", "RKF-MAKE-EL-CNF", 3, 0, false );
    SubLFiles.declareFunction( me, "rkf_make_el_conjunction", "RKF-MAKE-EL-CONJUNCTION", 2, 0, false );
    SubLFiles.declareFunction( me, "rkf_rule_partially_satisfied_by_gaf_litP", "RKF-RULE-PARTIALLY-SATISFIED-BY-GAF-LIT?", 3, 0, false );
    SubLFiles.declareFunction( me, "rkf_find_unresolved_lits", "RKF-FIND-UNRESOLVED-LITS", 4, 0, false );
    SubLFiles.declareFunction( me, "rkf_subst_el_bindings", "RKF-SUBST-EL-BINDINGS", 2, 0, false );
    SubLFiles.declareFunction( me, "rkf_sd_existentially_bind_vars", "RKF-SD-EXISTENTIALLY-BIND-VARS", 1, 0, false );
    SubLFiles.declareFunction( me, "rkf_sd_check_lit_internal", "RKF-SD-CHECK-LIT-INTERNAL", 3, 0, false );
    SubLFiles.declareFunction( me, "rkf_sd_check_lit", "RKF-SD-CHECK-LIT", 3, 0, false );
    SubLFiles.declareFunction( me, "rkf_sd_formulas_static_inference_properties", "RKF-SD-FORMULAS-STATIC-INFERENCE-PROPERTIES", 1, 0, false );
    SubLFiles.declareFunction( me, "rkf_sd_formulas_dynamic_inference_properties", "RKF-SD-FORMULAS-DYNAMIC-INFERENCE-PROPERTIES", 1, 0, false );
    SubLFiles.declareFunction( me, "rkf_salient_descriptor_formulas", "RKF-SALIENT-DESCRIPTOR-FORMULAS", 2, 1, false );
    SubLFiles.declareFunction( me, "rkf_salient_descriptor_formulas_inference", "RKF-SALIENT-DESCRIPTOR-FORMULAS-INFERENCE", 4, 0, false );
    SubLFiles.declareFunction( me, "rkf_salient_descriptor_formulas_one_batch_continue_inference", "RKF-SALIENT-DESCRIPTOR-FORMULAS-ONE-BATCH-CONTINUE-INFERENCE", 2, 0, false );
    SubLFiles.declareFunction( me, "rkf_salient_descriptor_formulas_one_batch", "RKF-SALIENT-DESCRIPTOR-FORMULAS-ONE-BATCH", 4, 1, false );
    SubLFiles.declareFunction( me, "rkf_irrelevant_sd_formulaP", "RKF-IRRELEVANT-SD-FORMULA?", 2, 0, false );
    SubLFiles.declareFunction( me, "rkf_sd_remove_nonassertible_conjuncts", "RKF-SD-REMOVE-NONASSERTIBLE-CONJUNCTS", 1, 0, false );
    SubLFiles.declareFunction( me, "initialize_rkf_deprecated_rules", "INITIALIZE-RKF-DEPRECATED-RULES", 0, 0, false );
    SubLFiles.declareFunction( me, "rkf_deprecate_rule_internal", "RKF-DEPRECATE-RULE-INTERNAL", 2, 0, false );
    SubLFiles.declareFunction( me, "rkf_salient_descriptor_deprecate_rule", "RKF-SALIENT-DESCRIPTOR-DEPRECATE-RULE", 2, 0, false );
    SubLFiles.declareFunction( me, "deprecate_salient_descriptor_rule", "DEPRECATE-SALIENT-DESCRIPTOR-RULE", 2, 0, false );
    SubLFiles.declareFunction( me, "undeprecate_salient_descriptor_rule", "UNDEPRECATE-SALIENT-DESCRIPTOR-RULE", 2, 0, false );
    SubLFiles.declareFunction( me, "rkf_deprecated_sd_ruleP", "RKF-DEPRECATED-SD-RULE?", 2, 0, false );
    SubLFiles.declareFunction( me, "rkf_bad_sd_ruleP", "RKF-BAD-SD-RULE?", 2, 0, false );
    SubLFiles.declareFunction( me, "rkf_sd_arg_constraint_ruleP", "RKF-SD-ARG-CONSTRAINT-RULE?", 1, 0, false );
    SubLFiles.declareFunction( me, "rkf_sd_tva_equivalent_ruleP", "RKF-SD-TVA-EQUIVALENT-RULE?", 1, 1, false );
    SubLFiles.declareFunction( me, "rkf_sd_type_based_strengthening_ruleP", "RKF-SD-TYPE-BASED-STRENGTHENING-RULE?", 1, 0, false );
    SubLFiles.declareFunction( me, "rkf_sort_salient_formulas", "RKF-SORT-SALIENT-FORMULAS", 1, 0, false );
    SubLFiles.declareFunction( me, "rkf_sd_clear", "RKF-SD-CLEAR", 0, 0, false );
    SubLFiles.declareFunction( me, "rkf_sd_present", "RKF-SD-PRESENT", 1, 0, false );
    SubLFiles.declareFunction( me, "rkf_sd_lookup", "RKF-SD-LOOKUP", 1, 0, false );
    SubLFiles.declareFunction( me, "rkf_sd_update", "RKF-SD-UPDATE", 2, 0, false );
    SubLFiles.declareFunction( me, "rkf_sd_ignore_clear", "RKF-SD-IGNORE-CLEAR", 0, 0, false );
    SubLFiles.declareFunction( me, "rkf_sd_ignore_present", "RKF-SD-IGNORE-PRESENT", 1, 0, false );
    SubLFiles.declareFunction( me, "rkf_sd_ignore_lookup", "RKF-SD-IGNORE-LOOKUP", 1, 0, false );
    SubLFiles.declareFunction( me, "rkf_sd_ignore_update", "RKF-SD-IGNORE-UPDATE", 2, 0, false );
    SubLFiles.declareFunction( me, "rkf_salient_descriptor_get_subprompts", "RKF-SALIENT-DESCRIPTOR-GET-SUBPROMPTS", 4, 1, false );
    SubLFiles.declareFunction( me, "rkf_salient_descriptor_single_entry_varP", "RKF-SALIENT-DESCRIPTOR-SINGLE-ENTRY-VAR?", 3, 0, false );
    SubLFiles.declareFunction( me, "rkf_sd_single_entry_var_top_levelP", "RKF-SD-SINGLE-ENTRY-VAR-TOP-LEVEL?", 3, 0, false );
    SubLFiles.declareFunction( me, "rkf_salient_property_sentence_from_justification", "RKF-SALIENT-PROPERTY-SENTENCE-FROM-JUSTIFICATION", 2, 0, false );
    SubLFiles.declareFunction( me, "rkf_sd_conjoin", "RKF-SD-CONJOIN", 1, 2, false );
    SubLFiles.declareFunction( me, "rkf_sd_uniquify_conjuncts", "RKF-SD-UNIQUIFY-CONJUNCTS", 1, 0, false );
    SubLFiles.declareFunction( me, "rkf_salient_descriptor_subprompts_p", "RKF-SALIENT-DESCRIPTOR-SUBPROMPTS-P", 1, 0, false );
    SubLFiles.declareFunction( me, "rkf_salient_descriptor_subprompt_p", "RKF-SALIENT-DESCRIPTOR-SUBPROMPT-P", 1, 0, false );
    SubLFiles.declareFunction( me, "rkf_salient_descriptor_subprompt_assert_sentence", "RKF-SALIENT-DESCRIPTOR-SUBPROMPT-ASSERT-SENTENCE", 1, 2, false );
    SubLFiles.declareFunction( me, "rkf_salient_descriptor_subprompt_var", "RKF-SALIENT-DESCRIPTOR-SUBPROMPT-VAR", 1, 0, false );
    SubLFiles.declareFunction( me, "rkf_salient_descriptor_subprompt_known_check_sentence", "RKF-SALIENT-DESCRIPTOR-SUBPROMPT-KNOWN-CHECK-SENTENCE", 1, 0, false );
    SubLFiles.declareFunction( me, "rkf_salient_descriptor_subprompt_constraint_sentence", "RKF-SALIENT-DESCRIPTOR-SUBPROMPT-CONSTRAINT-SENTENCE", 1, 0, false );
    SubLFiles.declareFunction( me, "rkf_salient_descriptor_subprompt_examples", "RKF-SALIENT-DESCRIPTOR-SUBPROMPT-EXAMPLES", 1, 0, false );
    SubLFiles.declareFunction( me, "rkf_salient_descriptor_subprompt_set_examples", "RKF-SALIENT-DESCRIPTOR-SUBPROMPT-SET-EXAMPLES", 2, 0, false );
    SubLFiles.declareFunction( me, "rkf_salient_descriptor_subprompt_type", "RKF-SALIENT-DESCRIPTOR-SUBPROMPT-TYPE", 1, 0, false );
    SubLFiles.declareFunction( me, "rkf_salient_descriptor_subprompt_from_formula", "RKF-SALIENT-DESCRIPTOR-SUBPROMPT-FROM-FORMULA", 2, 2, false );
    SubLFiles.declareFunction( me, "rkf_salient_descriptor_followups", "RKF-SALIENT-DESCRIPTOR-FOLLOWUPS", 2, 2, false );
    SubLFiles.declareFunction( me, "rkf_salient_descriptor_followup_for_variable", "RKF-SALIENT-DESCRIPTOR-FOLLOWUP-FOR-VARIABLE", 5, 0, false );
    SubLFiles.declareFunction( me, "rkf_sd_examples_internal", "RKF-SD-EXAMPLES-INTERNAL", 4, 4, false );
    SubLFiles.declareFunction( me, "rkf_sd_examples", "RKF-SD-EXAMPLES", 4, 4, false );
    SubLFiles.declareFunction( me, "rkf_sd_precedent_query_sentence", "RKF-SD-PRECEDENT-QUERY-SENTENCE", 3, 1, false );
    SubLFiles.declareFunction( me, "rkf_sd_add_salient_property", "RKF-SD-ADD-SALIENT-PROPERTY", 3, 0, false );
    SubLFiles.declareFunction( me, "rkf_sd_add_known_sentence", "RKF-SD-ADD-KNOWN-SENTENCE", 1, 0, false );
    SubLFiles.declareFunction( me, "rkf_sd_remove_constraints", "RKF-SD-REMOVE-CONSTRAINTS", 2, 0, false );
    SubLFiles.declareFunction( me, "rkf_salient_descriptor_complete_coll_bindings", "RKF-SALIENT-DESCRIPTOR-COMPLETE-COLL-BINDINGS", 3, 0, false );
    SubLFiles.declareFunction( me, "rkf_sd_complete_coll_bindings_okP", "RKF-SD-COMPLETE-COLL-BINDINGS-OK?", 2, 0, false );
    SubLFiles.declareFunction( me, "rkf_salient_descriptor_small_set_bindings", "RKF-SALIENT-DESCRIPTOR-SMALL-SET-BINDINGS", 2, 0, false );
    SubLFiles.declareFunction( me, "rkf_sd_small_set_bindings_okP", "RKF-SD-SMALL-SET-BINDINGS-OK?", 2, 0, false );
    SubLFiles.declareFunction( me, "rkf_salient_descriptor_bindings", "RKF-SALIENT-DESCRIPTOR-BINDINGS", 4, 1, false );
    SubLFiles.declareFunction( me, "rkf_salient_descriptor_assert_formula", "RKF-SALIENT-DESCRIPTOR-ASSERT-FORMULA", 1, 0, false );
    SubLFiles.declareFunction( me, "rkf_salient_descriptor_not_assertible_sentenceP", "RKF-SALIENT-DESCRIPTOR-NOT-ASSERTIBLE-SENTENCE?", 1, 0, false );
    SubLFiles.declareFunction( me, "rkf_generate_interaction_example_instances_formula", "RKF-GENERATE-INTERACTION-EXAMPLE-INSTANCES-FORMULA", 2, 0, false );
    SubLFiles.declareFunction( me, "rkf_example_instances_backchain_level", "RKF-EXAMPLE-INSTANCES-BACKCHAIN-LEVEL", 0, 0, false );
    SubLFiles.declareFunction( me, "rkf_example_instances", "RKF-EXAMPLE-INSTANCES", 6, 3, false );
    SubLFiles.declareFunction( me, "rkf_sd_examples_adjusted_number_constraint", "RKF-SD-EXAMPLES-ADJUSTED-NUMBER-CONSTRAINT", 1, 0, false );
    SubLFiles.declareFunction( me, "rkf_asserted_example_instances", "RKF-ASSERTED-EXAMPLE-INSTANCES", 6, 0, false );
    SubLFiles.declareFunction( me, "rkf_local_example_instances", "RKF-LOCAL-EXAMPLE-INSTANCES", 7, 0, false );
    SubLFiles.declareFunction( me, "rkf_example_types_include_type_p", "RKF-EXAMPLE-TYPES-INCLUDE-TYPE-P", 2, 0, false );
    SubLFiles.declareFunction( me, "rkf_add_examples", "RKF-ADD-EXAMPLES", 6, 1, false );
    SubLFiles.declareFunction( me, "rkf_example_in_examplesP", "RKF-EXAMPLE-IN-EXAMPLES?", 2, 0, false );
    SubLFiles.declareFunction( me, "rkf_example_not_known_falseP", "RKF-EXAMPLE-NOT-KNOWN-FALSE?", 4, 0, false );
    SubLFiles.declareFunction( me, "rkf_example_wffP", "RKF-EXAMPLE-WFF?", 4, 0, false );
    SubLFiles.declareFunction( me, "rkf_example_wffP_int_internal", "RKF-EXAMPLE-WFF?-INT-INTERNAL", 2, 0, false );
    SubLFiles.declareFunction( me, "rkf_example_wffP_int", "RKF-EXAMPLE-WFF?-INT", 2, 0, false );
    SubLFiles.declareFunction( me, "rkf_example_instances_ask_properties", "RKF-EXAMPLE-INSTANCES-ASK-PROPERTIES", 2, 0, false );
    SubLFiles.declareFunction( me, "rkf_example_instances_ask", "RKF-EXAMPLE-INSTANCES-ASK", 7, 0, false );
    SubLFiles.declareFunction( me, "rkf_bad_exampleP", "RKF-BAD-EXAMPLE?", 2, 0, false );
    SubLFiles.declareFunction( me, "rkf_better_exampleP", "RKF-BETTER-EXAMPLE?", 2, 0, false );
    return NIL;
  }

  public static SubLObject init_rkf_salient_descriptor_file()
  {
    $rkf_salient_formula_types$ = SubLFiles.deflexical( "*RKF-SALIENT-FORMULA-TYPES*", $list0 );
    $rkf_salient_descriptor_number_cutoff$ = SubLFiles.defparameter( "*RKF-SALIENT-DESCRIPTOR-NUMBER-CUTOFF*", ONE_INTEGER );
    $rkf_salient_descriptor_time_cutoff$ = SubLFiles.defparameter( "*RKF-SALIENT-DESCRIPTOR-TIME-CUTOFF*", $int15$90 );
    $rkf_salient_descriptor_transformation_cutoff$ = SubLFiles.defparameter( "*RKF-SALIENT-DESCRIPTOR-TRANSFORMATION-CUTOFF*", ONE_INTEGER );
    $rkf_sd_exclude_known_promptsP$ = SubLFiles.defparameter( "*RKF-SD-EXCLUDE-KNOWN-PROMPTS?*", T );
    $rkf_sd_problem_store$ = SubLFiles.defparameter( "*RKF-SD-PROBLEM-STORE*", NIL );
    $rkf_sd_problem_store_checkpoints$ = SubLFiles.deflexical( "*RKF-SD-PROBLEM-STORE-CHECKPOINTS*", dictionary.new_dictionary( UNPROVIDED, UNPROVIDED ) );
    $rkf_sd_reuse_problem_storeP$ = SubLFiles.defparameter( "*RKF-SD-REUSE-PROBLEM-STORE?*", T );
    $rkf_sd_induced_superiors_cutoff$ = SubLFiles.defparameter( "*RKF-SD-INDUCED-SUPERIORS-CUTOFF*", NIL );
    $rkf_sd_known_time_cutoff$ = SubLFiles.defparameter( "*RKF-SD-KNOWN-TIME-CUTOFF*", TEN_INTEGER );
    $rkf_sd_known_max_depth_max$ = SubLFiles.defparameter( "*RKF-SD-KNOWN-MAX-DEPTH-MAX*", ONE_INTEGER );
    $rkf_sd_known_destroy_inferencesP$ = SubLFiles.defparameter( "*RKF-SD-KNOWN-DESTROY-INFERENCES?*", T );
    $rkf_sd_formulas_max_depth_max$ = SubLFiles.defparameter( "*RKF-SD-FORMULAS-MAX-DEPTH-MAX*", ONE_INTEGER );
    $cache_salient_descriptor_ask_resultsP$ = SubLFiles.defparameter( "*CACHE-SALIENT-DESCRIPTOR-ASK-RESULTS?*", NIL );
    $rkf_deprecated_rules$ = SubLFiles.deflexical( "*RKF-DEPRECATED-RULES*", $kw186$UNINITIALIZED );
    $rkf_sd_rule_neg_lit_max$ = SubLFiles.defparameter( "*RKF-SD-RULE-NEG-LIT-MAX*", SIX_INTEGER );
    $rkf_sd_rule_pos_lit_max$ = SubLFiles.defparameter( "*RKF-SD-RULE-POS-LIT-MAX*", ONE_INTEGER );
    $rkf_sd_rule_neg_lit_min$ = SubLFiles.defparameter( "*RKF-SD-RULE-NEG-LIT-MIN*", TWO_INTEGER );
    $rkf_sd_rule_pos_lit_min$ = SubLFiles.defparameter( "*RKF-SD-RULE-POS-LIT-MIN*", ONE_INTEGER );
    $rkf_salient_descriptor_cache$ = SubLFiles.deflexical( "*RKF-SALIENT-DESCRIPTOR-CACHE*", maybeDefault( $sym202$_RKF_SALIENT_DESCRIPTOR_CACHE_, $rkf_salient_descriptor_cache$, () -> ( Hashtables.make_hash_table(
        TEN_INTEGER, Symbols.symbol_function( EQUAL ), UNPROVIDED ) ) ) );
    $rkf_salient_descriptor_cache_lock$ = SubLFiles.deflexical( "*RKF-SALIENT-DESCRIPTOR-CACHE-LOCK*", Locks.make_lock( $str203$RKF_Salient_Descriptor_Cache_Lock ) );
    $rkf_salient_descriptor_ignore_cache$ = SubLFiles.deflexical( "*RKF-SALIENT-DESCRIPTOR-IGNORE-CACHE*", maybeDefault( $sym204$_RKF_SALIENT_DESCRIPTOR_IGNORE_CACHE_, $rkf_salient_descriptor_ignore_cache$,
        () -> ( Hashtables.make_hash_table( TEN_INTEGER, Symbols.symbol_function( EQUAL ), UNPROVIDED ) ) ) );
    $rkf_salient_descriptor_ignore_cache_lock$ = SubLFiles.deflexical( "*RKF-SALIENT-DESCRIPTOR-IGNORE-CACHE-LOCK*", Locks.make_lock( $str203$RKF_Salient_Descriptor_Cache_Lock ) );
    $rkf_choice_count_cutoff$ = SubLFiles.defparameter( "*RKF-CHOICE-COUNT-CUTOFF*", TEN_INTEGER );
    $rkf_examples_to_show$ = SubLFiles.defparameter( "*RKF-EXAMPLES-TO-SHOW*", FIVE_INTEGER );
    $rkf_example_instances_backchain_level$ = SubLFiles.defparameter( "*RKF-EXAMPLE-INSTANCES-BACKCHAIN-LEVEL*", ZERO_INTEGER );
    $rkf_example_instances_time_cutoff$ = SubLFiles.defparameter( "*RKF-EXAMPLE-INSTANCES-TIME-CUTOFF*", FIVE_INTEGER );
    $rkf_example_instances_wff_checkP$ = SubLFiles.defvar( "*RKF-EXAMPLE-INSTANCES-WFF-CHECK?*", T );
    $rkf_example_not_known_false_time_cutoff$ = SubLFiles.defparameter( "*RKF-EXAMPLE-NOT-KNOWN-FALSE-TIME-CUTOFF*", NIL );
    return NIL;
  }

  public static SubLObject setup_rkf_salient_descriptor_file()
  {
    memoization_state.note_memoized_function( $sym26$RKF_SALIENT_DESCRIPTOR_META_ISA_TYPE_VIOLATION_ );
    memoization_state.note_memoized_function( $sym27$RKF_SALIENT_DESCRIPTOR_TYPE_SPECS );
    memoization_state.note_memoized_function( $sym92$RKF_SALIENT_DESCRIPTOR_GENL_ );
    memoization_state.note_memoized_function( $sym137$RKF_SALIENT_DESCRIPTOR_GET_INFERIORS );
    memoization_state.note_memoized_function( $sym141$RKF_SALIENT_DESCRIPTOR_BINARY_PRED_TYPE_VIOLATION_ );
    memoization_state.note_memoized_function( $sym143$RKF_TERM_BINARY_PREDS );
    memoization_state.note_memoized_function( $sym146$RKF_TERM_ALL_META_ISAS );
    memoization_state.note_memoized_function( $sym149$RKF_SD_EL_WFF_ );
    memoization_state.note_memoized_function( $sym162$RKF_SD_KNOWN );
    memoization_state.note_memoized_function( $sym167$RKF_SD_GET_CONJUNCT_BINDINGS );
    memoization_state.note_memoized_function( $sym176$RKF_SD_CHECK_LIT );
    utilities_macros.register_kb_function( $sym191$DEPRECATE_SALIENT_DESCRIPTOR_RULE );
    utilities_macros.register_kb_function( $sym192$UNDEPRECATE_SALIENT_DESCRIPTOR_RULE );
    subl_macro_promotions.declare_defglobal( $sym202$_RKF_SALIENT_DESCRIPTOR_CACHE_ );
    subl_macro_promotions.declare_defglobal( $sym204$_RKF_SALIENT_DESCRIPTOR_IGNORE_CACHE_ );
    memoization_state.note_memoized_function( $sym222$RKF_SD_EXAMPLES );
    memoization_state.note_memoized_function( $sym243$RKF_EXAMPLE_WFF__INT );
    return NIL;
  }

  @Override
  public void declareFunctions()
  {
    declare_rkf_salient_descriptor_file();
  }

  @Override
  public void initializeVariables()
  {
    init_rkf_salient_descriptor_file();
  }

  @Override
  public void runTopLevelForms()
  {
    setup_rkf_salient_descriptor_file();
  }
  static
  {
    me = new rkf_salient_descriptor();
    $rkf_salient_formula_types$ = null;
    $rkf_salient_descriptor_number_cutoff$ = null;
    $rkf_salient_descriptor_time_cutoff$ = null;
    $rkf_salient_descriptor_transformation_cutoff$ = null;
    $rkf_sd_exclude_known_promptsP$ = null;
    $rkf_sd_problem_store$ = null;
    $rkf_sd_problem_store_checkpoints$ = null;
    $rkf_sd_reuse_problem_storeP$ = null;
    $rkf_sd_induced_superiors_cutoff$ = null;
    $rkf_sd_known_time_cutoff$ = null;
    $rkf_sd_known_max_depth_max$ = null;
    $rkf_sd_known_destroy_inferencesP$ = null;
    $rkf_sd_formulas_max_depth_max$ = null;
    $cache_salient_descriptor_ask_resultsP$ = null;
    $rkf_deprecated_rules$ = null;
    $rkf_sd_rule_neg_lit_max$ = null;
    $rkf_sd_rule_pos_lit_max$ = null;
    $rkf_sd_rule_neg_lit_min$ = null;
    $rkf_sd_rule_pos_lit_min$ = null;
    $rkf_salient_descriptor_cache$ = null;
    $rkf_salient_descriptor_cache_lock$ = null;
    $rkf_salient_descriptor_ignore_cache$ = null;
    $rkf_salient_descriptor_ignore_cache_lock$ = null;
    $rkf_choice_count_cutoff$ = null;
    $rkf_examples_to_show$ = null;
    $rkf_example_instances_backchain_level$ = null;
    $rkf_example_instances_time_cutoff$ = null;
    $rkf_example_instances_wff_checkP$ = null;
    $rkf_example_not_known_false_time_cutoff$ = null;
    $list0 = ConsesLow.list( makeKeyword( "REQUIREMENT" ), makeKeyword( "STRONG" ), makeKeyword( "WEAK" ), makeKeyword( "NEIGHBOR" ) );
    $sym1$RKF_SALIENT_DESCRIPTOR_FORMULA_TYPE_P = makeSymbol( "RKF-SALIENT-DESCRIPTOR-FORMULA-TYPE-P" );
    $kw2$REQUIREMENT = makeKeyword( "REQUIREMENT" );
    $kw3$STRONG = makeKeyword( "STRONG" );
    $kw4$WEAK = makeKeyword( "WEAK" );
    $kw5$NEIGHBOR = makeKeyword( "NEIGHBOR" );
    $str6$_S_is_not_a_valid_salience_type = makeString( "~S is not a valid salience-type" );
    $sym7$FORT_P = makeSymbol( "FORT-P" );
    $sym8$HLMT_P = makeSymbol( "HLMT-P" );
    $sym9$LISTP = makeSymbol( "LISTP" );
    $const10$keRequirement = constant_handles.reader_make_constant_shell( makeString( "keRequirement" ) );
    $const11$keStrongSuggestion = constant_handles.reader_make_constant_shell( makeString( "keStrongSuggestion" ) );
    $const12$keWeakSuggestion = constant_handles.reader_make_constant_shell( makeString( "keWeakSuggestion" ) );
    $const13$keInteractionRequirement = constant_handles.reader_make_constant_shell( makeString( "keInteractionRequirement" ) );
    $const14$keInteractionStrongSuggestion = constant_handles.reader_make_constant_shell( makeString( "keInteractionStrongSuggestion" ) );
    $int15$90 = makeInteger( 90 );
    $sym16$WITH_POSSIBLY_NEW_MEMOIZATION_STATE = makeSymbol( "WITH-POSSIBLY-NEW-MEMOIZATION-STATE" );
    $sym17$WITH_SBHL_RESOURCED_MARKING_SPACES = makeSymbol( "WITH-SBHL-RESOURCED-MARKING-SPACES" );
    $str18$RKF_Salient_Descriptor__Couldn_t_ = makeString( "RKF Salient Descriptor: Couldn't justify~% ~S in ~S~%" );
    $int19$50000 = makeInteger( 50000 );
    $sym20$POSITIVE_INTEGER_P = makeSymbol( "POSITIVE-INTEGER-P" );
    $kw21$ISA = makeKeyword( "ISA" );
    $list22 = ConsesLow.cons( makeSymbol( "META-ISA" ), makeSymbol( "COUNT" ) );
    $sym23$_X = makeSymbol( "?X" );
    $const24$isa = constant_handles.reader_make_constant_shell( makeString( "isa" ) );
    $const25$genls = constant_handles.reader_make_constant_shell( makeString( "genls" ) );
    $sym26$RKF_SALIENT_DESCRIPTOR_META_ISA_TYPE_VIOLATION_ = makeSymbol( "RKF-SALIENT-DESCRIPTOR-META-ISA-TYPE-VIOLATION?" );
    $sym27$RKF_SALIENT_DESCRIPTOR_TYPE_SPECS = makeSymbol( "RKF-SALIENT-DESCRIPTOR-TYPE-SPECS" );
    $kw28$BREADTH = makeKeyword( "BREADTH" );
    $kw29$QUEUE = makeKeyword( "QUEUE" );
    $kw30$STACK = makeKeyword( "STACK" );
    $sym31$RELEVANT_SBHL_TV_IS_GENERAL_TV = makeSymbol( "RELEVANT-SBHL-TV-IS-GENERAL-TV" );
    $kw32$ERROR = makeKeyword( "ERROR" );
    $str33$_A_is_not_a__A = makeString( "~A is not a ~A" );
    $sym34$SBHL_TRUE_TV_P = makeSymbol( "SBHL-TRUE-TV-P" );
    $kw35$CERROR = makeKeyword( "CERROR" );
    $str36$continue_anyway = makeString( "continue anyway" );
    $kw37$WARN = makeKeyword( "WARN" );
    $str38$_A_is_not_a_valid__sbhl_type_erro = makeString( "~A is not a valid *sbhl-type-error-action* value" );
    $const39$typeGenls = constant_handles.reader_make_constant_shell( makeString( "typeGenls" ) );
    $kw40$DEPTH = makeKeyword( "DEPTH" );
    $const41$genlPreds = constant_handles.reader_make_constant_shell( makeString( "genlPreds" ) );
    $str42$_A_is_neither_SET_P_nor_LISTP_ = makeString( "~A is neither SET-P nor LISTP." );
    $str43$attempting_to_bind_direction_link = makeString( "attempting to bind direction link variable, to NIL. macro body not executed." );
    $str44$Node__a_does_not_pass_sbhl_type_t = makeString( "Node ~a does not pass sbhl-type-test ~a~%" );
    $const45$genlInverse = constant_handles.reader_make_constant_shell( makeString( "genlInverse" ) );
    $sym46$REUSE_EXISTING_ = makeUninternedSymbol( "REUSE-EXISTING?" );
    $sym47$STORE = makeUninternedSymbol( "STORE" );
    $sym48$CLET = makeSymbol( "CLET" );
    $list49 = ConsesLow.list( ConsesLow.list( makeSymbol( "RKF-SD-PROBLEM-STORE-OK?" ), makeSymbol( "*RKF-SD-PROBLEM-STORE*" ) ) );
    $list50 = ConsesLow.list( makeSymbol( "*RKF-SD-PROBLEM-STORE*" ), ConsesLow.list( makeSymbol( "RKF-SD-FIND-OR-MAKE-PROBLEM-STORE" ) ) );
    $list51 = ConsesLow.list( makeSymbol( "*RKF-SD-PROBLEM-STORE*" ) );
    $sym52$CUNWIND_PROTECT = makeSymbol( "CUNWIND-PROTECT" );
    $sym53$PROGN = makeSymbol( "PROGN" );
    $sym54$PUNLESS = makeSymbol( "PUNLESS" );
    $sym55$RKF_SD_FREE_PROBLEM_STORE = makeSymbol( "RKF-SD-FREE-PROBLEM-STORE" );
    $kw56$NOT_FOUND = makeKeyword( "NOT-FOUND" );
    $kw57$ANY = makeKeyword( "ANY" );
    $kw58$BIN_PRED = makeKeyword( "BIN-PRED" );
    $kw59$ALL = makeKeyword( "ALL" );
    $kw60$META_ISA = makeKeyword( "META-ISA" );
    $str61$Can_t_identify__S_common_properti = makeString( "Can't identify ~S common properties yet." );
    $int62$25000 = makeInteger( 25000 );
    $list63 = ConsesLow.list( makeSymbol( "SLOT" ), makeSymbol( "SUPERIOR" ), makeSymbol( "ISA-OR-GENLS" ) );
    $sym64$FIRST = makeSymbol( "FIRST" );
    $int65$25 = makeInteger( 25 );
    $list66 = ConsesLow.cons( makeSymbol( "SLOT" ), makeSymbol( "COUNT" ) );
    $list67 = ConsesLow.list( makeSymbol( "COLLECTION-TYPE" ), makeSymbol( "SUPERIOR" ), makeSymbol( "ISA-OR-GENLS" ) );
    $list68 = ConsesLow.list( constant_handles.reader_make_constant_shell( makeString( "isa" ) ), makeKeyword( "TERM" ), makeKeyword( "FORT" ) );
    $kw69$PROBLEM_STORE = makeKeyword( "PROBLEM-STORE" );
    $kw70$ANSWER_LANGUAGE = makeKeyword( "ANSWER-LANGUAGE" );
    $kw71$HL = makeKeyword( "HL" );
    $kw72$CONDITIONAL_SENTENCE_ = makeKeyword( "CONDITIONAL-SENTENCE?" );
    $sym73$_COLLECTION_TYPE = makeSymbol( "?COLLECTION-TYPE" );
    $sym74$_INSTANCE = makeSymbol( "?INSTANCE" );
    $const75$implies = constant_handles.reader_make_constant_shell( makeString( "implies" ) );
    $const76$thereExists = constant_handles.reader_make_constant_shell( makeString( "thereExists" ) );
    $sym77$_TYPE = makeSymbol( "?TYPE" );
    $const78$and = constant_handles.reader_make_constant_shell( makeString( "and" ) );
    $list79 = ConsesLow.list( makeSymbol( "?TYPE" ) );
    $kw80$TERM = makeKeyword( "TERM" );
    $kw81$GENLS = makeKeyword( "GENLS" );
    $list82 = ConsesLow.list( makeSymbol( "BIN-PRED" ), makeSymbol( "SUPERIOR" ), makeSymbol( "ISA-OR-GENLS" ) );
    $list83 = ConsesLow.list( makeSymbol( "META-ISA" ), makeSymbol( "SUPERIOR" ), makeSymbol( "ISA-OR-GENLS" ) );
    $list84 = ConsesLow.list( makeKeyword( "SUPERIOR" ) );
    $kw85$SUPERIOR = makeKeyword( "SUPERIOR" );
    $kw86$ASCENDING = makeKeyword( "ASCENDING" );
    $sym87$ALL_ISA = makeSymbol( "ALL-ISA" );
    $sym88$ALL_GENLS = makeSymbol( "ALL-GENLS" );
    $sym89$RKF_INDUCED_SALIENT_DESCRIPTOR_BINARY_PREDS = makeSymbol( "RKF-INDUCED-SALIENT-DESCRIPTOR-BINARY-PREDS" );
    $sym90$RKF_INDUCED_SALIENT_DESCRIPTOR_META_ISAS = makeSymbol( "RKF-INDUCED-SALIENT-DESCRIPTOR-META-ISAS" );
    $sym91$CAR = makeSymbol( "CAR" );
    $sym92$RKF_SALIENT_DESCRIPTOR_GENL_ = makeSymbol( "RKF-SALIENT-DESCRIPTOR-GENL?" );
    $list93 = ConsesLow.list( makeSymbol( "RULE-TYPE" ), makeSymbol( "ISA-OR-GENLS" ), makeSymbol( "SUPERIOR" ), makeSymbol( "SLOT" ) );
    $sym94$_SPEC = makeSymbol( "?SPEC" );
    $sym95$RKF_MAKE_BIN_PRED_FORMULA = makeSymbol( "RKF-MAKE-BIN-PRED-FORMULA" );
    $sym96$RKF_MAKE_META_ISA_FORMULA = makeSymbol( "RKF-MAKE-META-ISA-FORMULA" );
    $list97 = ConsesLow.list( makeSymbol( "ISA-OR-GENLS" ), makeSymbol( "SUPER" ), makeSymbol( "SLOT" ) );
    $kw98$CODE = makeKeyword( "CODE" );
    $list99 = ConsesLow.list( makeKeyword( "TRUE-DEF" ) );
    $list100 = ConsesLow.list( makeKeyword( "BIN-PRED" ), makeKeyword( "META-ISA" ) );
    $kw101$INTERMEDIATE_STEP_VALIDATION_LEVEL = makeKeyword( "INTERMEDIATE-STEP-VALIDATION-LEVEL" );
    $kw102$ARG_TYPE = makeKeyword( "ARG-TYPE" );
    $kw103$CACHE_INFERENCE_RESULTS_ = makeKeyword( "CACHE-INFERENCE-RESULTS?" );
    $kw104$RESULT_UNIQUENESS = makeKeyword( "RESULT-UNIQUENESS" );
    $kw105$BINDINGS = makeKeyword( "BINDINGS" );
    $kw106$RETURN = makeKeyword( "RETURN" );
    $kw107$TEMPLATE = makeKeyword( "TEMPLATE" );
    $kw108$PRODUCTIVITY_LIMIT = makeKeyword( "PRODUCTIVITY-LIMIT" );
    $int109$100000 = makeInteger( 100000 );
    $kw110$MAX_NUMBER = makeKeyword( "MAX-NUMBER" );
    $kw111$MAX_TIME = makeKeyword( "MAX-TIME" );
    $kw112$PROBABLY_APPROXIMATELY_DONE = makeKeyword( "PROBABLY-APPROXIMATELY-DONE" );
    $kw113$MAX_TRANSFORMATION_DEPTH = makeKeyword( "MAX-TRANSFORMATION-DEPTH" );
    $int114$100 = makeInteger( 100 );
    $const115$keInducedStrongSuggestionPreds = constant_handles.reader_make_constant_shell( makeString( "keInducedStrongSuggestionPreds" ) );
    $const116$keInducedWeakSuggestionPreds = constant_handles.reader_make_constant_shell( makeString( "keInducedWeakSuggestionPreds" ) );
    $const117$keInducedSuggestionPreds = constant_handles.reader_make_constant_shell( makeString( "keInducedSuggestionPreds" ) );
    $const118$keGenlsInducedStrongSuggestionPre = constant_handles.reader_make_constant_shell( makeString( "keGenlsInducedStrongSuggestionPreds" ) );
    $const119$keGenlsInducedWeakSuggestionPreds = constant_handles.reader_make_constant_shell( makeString( "keGenlsInducedWeakSuggestionPreds" ) );
    $const120$keGenlsInducedSuggestionPreds = constant_handles.reader_make_constant_shell( makeString( "keGenlsInducedSuggestionPreds" ) );
    $const121$SpecsFn = constant_handles.reader_make_constant_shell( makeString( "SpecsFn" ) );
    $kw122$GENL = makeKeyword( "GENL" );
    $sym123$_PRED = makeSymbol( "?PRED" );
    $const124$AnytimePSC = constant_handles.reader_make_constant_shell( makeString( "AnytimePSC" ) );
    $const125$unknownSentence = constant_handles.reader_make_constant_shell( makeString( "unknownSentence" ) );
    $sym126$_GENL = makeSymbol( "?GENL" );
    $list127 = ConsesLow.list( makeSymbol( "?GENL" ) );
    $const128$different = constant_handles.reader_make_constant_shell( makeString( "different" ) );
    $list129 = ConsesLow.list( makeKeyword( "EXHAUST-TOTAL" ), makeKeyword( "MAX-NUMBER" ) );
    $str130$_S___halted_with_reason__S__ = makeString( "~S~% halted with reason ~S~%" );
    $sym131$_COUNT = makeSymbol( "?COUNT" );
    $const132$assertedArg1BinaryPreds_Count = constant_handles.reader_make_constant_shell( makeString( "assertedArg1BinaryPreds-Count" ) );
    $list133 = ConsesLow.list( makeSymbol( "?COUNT" ) );
    $list134 = ConsesLow.cons( makeSymbol( "BINARY-PRED" ), makeSymbol( "COUNT" ) );
    $str135$Type_violation___S__S__S = makeString( "Type violation: ~S ~S ~S" );
    $const136$keRelevantPreds = constant_handles.reader_make_constant_shell( makeString( "keRelevantPreds" ) );
    $sym137$RKF_SALIENT_DESCRIPTOR_GET_INFERIORS = makeSymbol( "RKF-SALIENT-DESCRIPTOR-GET-INFERIORS" );
    $int138$200 = makeInteger( 200 );
    $sym139$INSTANCES = makeSymbol( "INSTANCES" );
    $sym140$SPECS = makeSymbol( "SPECS" );
    $sym141$RKF_SALIENT_DESCRIPTOR_BINARY_PRED_TYPE_VIOLATION_ = makeSymbol( "RKF-SALIENT-DESCRIPTOR-BINARY-PRED-TYPE-VIOLATION?" );
    $str142$violation___S_not_a_known_spec_of = makeString( "violation: ~S not a known spec of ~S in ~S~%" );
    $sym143$RKF_TERM_BINARY_PREDS = makeSymbol( "RKF-TERM-BINARY-PREDS" );
    $int144$10000 = makeInteger( 10000 );
    $kw145$GAF = makeKeyword( "GAF" );
    $sym146$RKF_TERM_ALL_META_ISAS = makeSymbol( "RKF-TERM-ALL-META-ISAS" );
    $list147 = ConsesLow.cons( makeSymbol( "VAR" ), makeSymbol( "TERM" ) );
    $sym148$EL_VAR_ = makeSymbol( "EL-VAR?" );
    $sym149$RKF_SD_EL_WFF_ = makeSymbol( "RKF-SD-EL-WFF?" );
    $sym150$ALIST__ = makeSymbol( "ALIST-=" );
    $const151$quotedIsa = constant_handles.reader_make_constant_shell( makeString( "quotedIsa" ) );
    $list152 = ConsesLow.list( constant_handles.reader_make_constant_shell( makeString( "CycLNonAtomicTerm" ) ) );
    $list153 = ConsesLow.cons( makeSymbol( "EL-VAR" ), makeSymbol( "TERM" ) );
    $list154 = ConsesLow.list( constant_handles.reader_make_constant_shell( makeString( "isa" ) ), ConsesLow.list( makeKeyword( "TEST" ), makeSymbol( "EL-VAR?" ) ), makeKeyword( "FORT" ) );
    $list155 = ConsesLow.list( constant_handles.reader_make_constant_shell( makeString( "genls" ) ), ConsesLow.list( makeKeyword( "TEST" ), makeSymbol( "EL-VAR?" ) ), makeKeyword( "FORT" ) );
    $list156 = ConsesLow.list( constant_handles.reader_make_constant_shell( makeString( "isa" ) ), makeKeyword( "FORT" ), makeKeyword( "FORT" ) );
    $kw157$NEGATION_BY_FAILURE_ = makeKeyword( "NEGATION-BY-FAILURE?" );
    $kw158$ALLOW_INDETERMINATE_RESULTS_ = makeKeyword( "ALLOW-INDETERMINATE-RESULTS?" );
    $kw159$FORGET_EXTRA_RESULTS_ = makeKeyword( "FORGET-EXTRA-RESULTS?" );
    $kw160$BROWSABLE_ = makeKeyword( "BROWSABLE?" );
    $kw161$CONTINUABLE_ = makeKeyword( "CONTINUABLE?" );
    $sym162$RKF_SD_KNOWN = makeSymbol( "RKF-SD-KNOWN" );
    $str163$_S_is_not_continuable____Exit_con = makeString( "~S is not continuable.~% Exit condition: ~S~%" );
    $kw164$EXHAUST = makeKeyword( "EXHAUST" );
    $str165$RKF_SD_KNOWN_timed_out_on__S = makeString( "RKF-SD-KNOWN timed out on ~S" );
    $list166 = ConsesLow.list( makeSymbol( "VAR" ), makeSymbol( "BODY" ) );
    $sym167$RKF_SD_GET_CONJUNCT_BINDINGS = makeSymbol( "RKF-SD-GET-CONJUNCT-BINDINGS" );
    $list168 = ConsesLow.cons( makeSymbol( "HL-VAR" ), makeSymbol( "EL-VAR" ) );
    $sym169$HL_VAR_ = makeSymbol( "HL-VAR?" );
    $kw170$NEG = makeKeyword( "NEG" );
    $sym171$FULLY_BOUND_P = makeSymbol( "FULLY-BOUND-P" );
    $kw172$POS = makeKeyword( "POS" );
    $kw173$KNOWN = makeKeyword( "KNOWN" );
    $kw174$UNKNOWN = makeKeyword( "UNKNOWN" );
    $kw175$MISMATCH = makeKeyword( "MISMATCH" );
    $sym176$RKF_SD_CHECK_LIT = makeSymbol( "RKF-SD-CHECK-LIT" );
    $kw177$MALFORMED = makeKeyword( "MALFORMED" );
    $kw178$IRRELEVANT = makeKeyword( "IRRELEVANT" );
    $kw179$FALSE = makeKeyword( "FALSE" );
    $kw180$BINDINGS_AND_SUPPORTS = makeKeyword( "BINDINGS-AND-SUPPORTS" );
    $sym181$_FORMULA = makeSymbol( "?FORMULA" );
    $str182$Timed_out_after__S_seconds_gettin = makeString( "Timed out after ~S seconds getting ~S for ~S.~%" );
    $str183$P_A_D__getting__S_for__S___ = makeString( "P.A.D. getting ~S for ~S.~%" );
    $list184 = ConsesLow.list( makeSymbol( "BINDINGS" ), makeSymbol( "SUPPORTS" ) );
    $kw185$IGNORE = makeKeyword( "IGNORE" );
    $kw186$UNINITIALIZED = makeKeyword( "UNINITIALIZED" );
    $sym187$RELEVANT_MT_IS_EVERYTHING = makeSymbol( "RELEVANT-MT-IS-EVERYTHING" );
    $const188$EverythingPSC = constant_handles.reader_make_constant_shell( makeString( "EverythingPSC" ) );
    $const189$deprecatedSalientDescriptorRule = constant_handles.reader_make_constant_shell( makeString( "deprecatedSalientDescriptorRule" ) );
    $const190$deprecatedSalientDescriptorRuleAs = constant_handles.reader_make_constant_shell( makeString( "deprecatedSalientDescriptorRuleAssertion" ) );
    $sym191$DEPRECATE_SALIENT_DESCRIPTOR_RULE = makeSymbol( "DEPRECATE-SALIENT-DESCRIPTOR-RULE" );
    $sym192$UNDEPRECATE_SALIENT_DESCRIPTOR_RULE = makeSymbol( "UNDEPRECATE-SALIENT-DESCRIPTOR-RULE" );
    $const193$ArgConstraintPredicate = constant_handles.reader_make_constant_shell( makeString( "ArgConstraintPredicate" ) );
    $list194 = ConsesLow.list( makeKeyword( "TEST" ), makeSymbol( "HL-VAR?" ) );
    $kw195$ANYTHING = makeKeyword( "ANYTHING" );
    $const196$TransitiveBinaryPredicate = constant_handles.reader_make_constant_shell( makeString( "TransitiveBinaryPredicate" ) );
    $const197$BinaryPredicate = constant_handles.reader_make_constant_shell( makeString( "BinaryPredicate" ) );
    $const198$transitiveViaArg = constant_handles.reader_make_constant_shell( makeString( "transitiveViaArg" ) );
    $const199$transitiveViaArgInverse = constant_handles.reader_make_constant_shell( makeString( "transitiveViaArgInverse" ) );
    $list200 = ConsesLow.list( makeSymbol( "NEG-LITS" ), makeSymbol( "POS-LITS" ) );
    $list201 = ConsesLow.list( constant_handles.reader_make_constant_shell( makeString( "isa" ) ), constant_handles.reader_make_constant_shell( makeString( "genls" ) ) );
    $sym202$_RKF_SALIENT_DESCRIPTOR_CACHE_ = makeSymbol( "*RKF-SALIENT-DESCRIPTOR-CACHE*" );
    $str203$RKF_Salient_Descriptor_Cache_Lock = makeString( "RKF Salient Descriptor Cache Lock" );
    $sym204$_RKF_SALIENT_DESCRIPTOR_IGNORE_CACHE_ = makeSymbol( "*RKF-SALIENT-DESCRIPTOR-IGNORE-CACHE*" );
    $const205$singleEntryFormatInArgs = constant_handles.reader_make_constant_shell( makeString( "singleEntryFormatInArgs" ) );
    $list206 = ConsesLow.list( makeSymbol( "ARGNUM" ), makeSymbol( "FORMAT" ) );
    $list207 = ConsesLow.list( constant_handles.reader_make_constant_shell( makeString( "SingleEntry" ) ), constant_handles.reader_make_constant_shell( makeString( "singleEntryFormatInArgs" ) ) );
    $const208$argFormat = constant_handles.reader_make_constant_shell( makeString( "argFormat" ) );
    $list209 = ConsesLow.list( TWO_INTEGER, THREE_INTEGER );
    $sym210$EXPRESSION_FIND = makeSymbol( "EXPRESSION-FIND" );
    $sym211$RKF_SALIENT_DESCRIPTOR_SUBPROMPT_P = makeSymbol( "RKF-SALIENT-DESCRIPTOR-SUBPROMPT-P" );
    $list212 = ConsesLow.list( makeKeyword( "CONFIRM" ), makeKeyword( "CHOICE" ), makeKeyword( "SPECIFY" ), makeKeyword( "STRENGTHEN" ) );
    $kw213$CONFIRM = makeKeyword( "CONFIRM" );
    $list214 = ConsesLow.list( makeKeyword( "ANYTHING" ) );
    $kw215$CHOICE = makeKeyword( "CHOICE" );
    $kw216$SPECIFY = makeKeyword( "SPECIFY" );
    $list217 = ConsesLow.list( constant_handles.reader_make_constant_shell( makeString( "SkolemTerm" ) ) );
    $list218 = ConsesLow.list( constant_handles.reader_make_constant_shell( makeString( "not" ) ), ConsesLow.list( constant_handles.reader_make_constant_shell( makeString( "isa" ) ), makeKeyword( "FORT" ), makeKeyword(
        "FORT" ) ) );
    $const219$True_JustificationTruth = constant_handles.reader_make_constant_shell( makeString( "True-JustificationTruth" ) );
    $const220$disjointWith = constant_handles.reader_make_constant_shell( makeString( "disjointWith" ) );
    $kw221$STRENGTHEN = makeKeyword( "STRENGTHEN" );
    $sym222$RKF_SD_EXAMPLES = makeSymbol( "RKF-SD-EXAMPLES" );
    $sym223$EL_FORMULA_P = makeSymbol( "EL-FORMULA-P" );
    $kw224$NOT_TRIED = makeKeyword( "NOT-TRIED" );
    $kw225$FORT = makeKeyword( "FORT" );
    $list226 = ConsesLow.list( ConsesLow.list( makeKeyword( "TEST" ), makeSymbol( "EL-VAR?" ) ) );
    $list227 = ConsesLow.list( constant_handles.reader_make_constant_shell( makeString( "isa" ) ), makeKeyword( "ANYTHING" ), makeKeyword( "FORT" ) );
    $const228$relationAllInstance = constant_handles.reader_make_constant_shell( makeString( "relationAllInstance" ) );
    $const229$knownSentence = constant_handles.reader_make_constant_shell( makeString( "knownSentence" ) );
    $sym230$RKF_SD_ADD_KNOWN_SENTENCE = makeSymbol( "RKF-SD-ADD-KNOWN-SENTENCE" );
    $kw231$VAR = makeKeyword( "VAR" );
    $sym232$RKF_SD_COMPLETE_COLL_BINDINGS_OK_ = makeSymbol( "RKF-SD-COMPLETE-COLL-BINDINGS-OK?" );
    $const233$elementOf = constant_handles.reader_make_constant_shell( makeString( "elementOf" ) );
    $const234$TheSet = constant_handles.reader_make_constant_shell( makeString( "TheSet" ) );
    $sym235$RKF_SD_SMALL_SET_BINDINGS_OK_ = makeSymbol( "RKF-SD-SMALL-SET-BINDINGS-OK?" );
    $const236$notAssertible = constant_handles.reader_make_constant_shell( makeString( "notAssertible" ) );
    $const237$or = constant_handles.reader_make_constant_shell( makeString( "or" ) );
    $const238$termDependsOn = constant_handles.reader_make_constant_shell( makeString( "termDependsOn" ) );
    $const239$uiaDisplayTerm = constant_handles.reader_make_constant_shell( makeString( "uiaDisplayTerm" ) );
    $kw240$CONSTRAINT_MATCHER = makeKeyword( "CONSTRAINT-MATCHER" );
    $kw241$PRECEDENT = makeKeyword( "PRECEDENT" );
    $sym242$RKF_SD_EXAMPLE_TERM = makeSymbol( "RKF-SD-EXAMPLE-TERM" );
    $sym243$RKF_EXAMPLE_WFF__INT = makeSymbol( "RKF-EXAMPLE-WFF?-INT" );
    $kw244$IGNORE_ERRORS_TARGET = makeKeyword( "IGNORE-ERRORS-TARGET" );
    $sym245$IGNORE_ERRORS_HANDLER = makeSymbol( "IGNORE-ERRORS-HANDLER", "SUBLISP" );
    $str246$__RKF_EXAMPLE_INSTANCES_ASK_timed = makeString( "~&RKF-EXAMPLE-INSTANCES-ASK timed out after ~S seconds on ~S in ~S" );
    $sym247$GENERALITY_ESTIMATE_ = makeSymbol( "GENERALITY-ESTIMATE>" );
    $sym248$RKF_BETTER_EXAMPLE_ = makeSymbol( "RKF-BETTER-EXAMPLE?" );
    $kw249$BUG_WORKAROUND = makeKeyword( "BUG-WORKAROUND" );
  }
}
/*
 * 
 * Total time: 4626 ms
 * 
 */