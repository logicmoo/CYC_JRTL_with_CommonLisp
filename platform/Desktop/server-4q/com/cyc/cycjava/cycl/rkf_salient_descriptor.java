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

public final class rkf_salient_descriptor extends SubLTranslatedFile
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
    public static SubLObject rkf_salient_descriptor_formula_type_p(final SubLObject v_object) {
        return subl_promotions.memberP(v_object, rkf_salient_descriptor.$rkf_salient_formula_types$.getGlobalValue(), (SubLObject)rkf_salient_descriptor.UNPROVIDED, (SubLObject)rkf_salient_descriptor.UNPROVIDED);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/rkf-salient-descriptor.lisp", position = 1118L)
    public static SubLObject rkf_salient_formulas(final SubLObject type, final SubLObject fort, SubLObject mt) {
        if (mt == rkf_salient_descriptor.UNPROVIDED) {
            mt = control_vars.$rkf_mt$.getDynamicValue();
        }
        assert rkf_salient_descriptor.NIL != rkf_salient_descriptor_formula_type_p(type) : type;
        if (type.eql((SubLObject)rkf_salient_descriptor.$kw2$REQUIREMENT)) {
            return rkf_salient_requirements(fort, mt);
        }
        if (type.eql((SubLObject)rkf_salient_descriptor.$kw3$STRONG)) {
            return rkf_salient_strong_suggestions(fort, mt);
        }
        if (type.eql((SubLObject)rkf_salient_descriptor.$kw4$WEAK)) {
            return rkf_salient_weak_suggestions(fort, mt);
        }
        if (type.eql((SubLObject)rkf_salient_descriptor.$kw5$NEIGHBOR)) {
            return rkf_salient_neighbor_suggestions(fort, mt);
        }
        Errors.error((SubLObject)rkf_salient_descriptor.$str6$_S_is_not_a_valid_salience_type, type);
        return Values.values((SubLObject)rkf_salient_descriptor.NIL, (SubLObject)rkf_salient_descriptor.NIL);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/rkf-salient-descriptor.lisp", position = 1768L)
    public static SubLObject rkf_salient_requirements(final SubLObject fort, SubLObject mt) {
        if (mt == rkf_salient_descriptor.UNPROVIDED) {
            mt = control_vars.$rkf_mt$.getDynamicValue();
        }
        assert rkf_salient_descriptor.NIL != forts.fort_p(fort) : fort;
        assert rkf_salient_descriptor.NIL != hlmt.hlmt_p(mt) : mt;
        return rkf_requirements(fort, mt);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/rkf-salient-descriptor.lisp", position = 1990L)
    public static SubLObject rkf_salient_strong_suggestions(final SubLObject fort, SubLObject mt) {
        if (mt == rkf_salient_descriptor.UNPROVIDED) {
            mt = control_vars.$rkf_mt$.getDynamicValue();
        }
        assert rkf_salient_descriptor.NIL != forts.fort_p(fort) : fort;
        assert rkf_salient_descriptor.NIL != hlmt.hlmt_p(mt) : mt;
        return rkf_strong_suggestions(fort, mt);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/rkf-salient-descriptor.lisp", position = 2222L)
    public static SubLObject rkf_salient_weak_suggestions(final SubLObject fort, SubLObject mt) {
        if (mt == rkf_salient_descriptor.UNPROVIDED) {
            mt = control_vars.$rkf_mt$.getDynamicValue();
        }
        assert rkf_salient_descriptor.NIL != forts.fort_p(fort) : fort;
        assert rkf_salient_descriptor.NIL != hlmt.hlmt_p(mt) : mt;
        return rkf_weak_suggestions(fort, mt);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/rkf-salient-descriptor.lisp", position = 2448L)
    public static SubLObject rkf_salient_neighbor_suggestions(final SubLObject fort, SubLObject mt) {
        if (mt == rkf_salient_descriptor.UNPROVIDED) {
            mt = control_vars.$rkf_mt$.getDynamicValue();
        }
        assert rkf_salient_descriptor.NIL != forts.fort_p(fort) : fort;
        assert rkf_salient_descriptor.NIL != hlmt.hlmt_p(mt) : mt;
        return rkf_induced_salient_descriptor_query_sentences(fort, mt);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/rkf-salient-descriptor.lisp", position = 2698L)
    public static SubLObject rkf_salient_descriptor(final SubLObject fort, SubLObject mt, SubLObject ignored) {
        if (mt == rkf_salient_descriptor.UNPROVIDED) {
            mt = control_vars.$rkf_mt$.getDynamicValue();
        }
        if (ignored == rkf_salient_descriptor.UNPROVIDED) {
            ignored = (SubLObject)rkf_salient_descriptor.NIL;
        }
        assert rkf_salient_descriptor.NIL != Types.listp(ignored) : ignored;
        if (rkf_salient_descriptor.NIL == forts.fort_p(fort)) {
            return (SubLObject)rkf_salient_descriptor.NIL;
        }
        final SubLObject cache_key = (SubLObject)ConsesLow.list(fort, mt);
        if (rkf_salient_descriptor.NIL == rkf_sd_present(cache_key)) {
            rkf_sd_update(cache_key, (SubLObject)rkf_salient_descriptor.NIL);
        }
        SubLObject pending_formulas = rkf_sd_lookup(cache_key);
        if (rkf_salient_descriptor.NIL != pending_formulas) {
            final SubLObject next_formula = pending_formulas.first();
            pending_formulas = pending_formulas.rest();
            rkf_sd_update(cache_key, pending_formulas);
            return next_formula;
        }
        SubLObject new_formulas = rkf_strong_suggestions(fort, mt);
        new_formulas = conses_high.set_difference(new_formulas, ignored, Symbols.symbol_function((SubLObject)rkf_salient_descriptor.EQUAL), (SubLObject)rkf_salient_descriptor.UNPROVIDED);
        if (rkf_salient_descriptor.NIL != new_formulas) {
            new_formulas = rkf_sort_salient_formulas(new_formulas);
            rkf_sd_update(cache_key, new_formulas);
            return rkf_salient_descriptor(fort, mt, ignored);
        }
        return (SubLObject)rkf_salient_descriptor.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/rkf-salient-descriptor.lisp", position = 4026L)
    public static SubLObject rkf_salient_descriptor_parallel(final SubLObject fort, SubLObject mt) {
        if (mt == rkf_salient_descriptor.UNPROVIDED) {
            mt = control_vars.$rkf_mt$.getDynamicValue();
        }
        if (rkf_salient_descriptor.NIL == forts.fort_p(fort)) {
            return (SubLObject)rkf_salient_descriptor.NIL;
        }
        final SubLObject cache_key = (SubLObject)ConsesLow.list(fort, mt);
        if (rkf_salient_descriptor.NIL == rkf_sd_present(cache_key)) {
            rkf_sd_update(cache_key, (SubLObject)rkf_salient_descriptor.NIL);
        }
        if (rkf_salient_descriptor.NIL == rkf_sd_ignore_present(cache_key)) {
            rkf_sd_ignore_update(cache_key, (SubLObject)rkf_salient_descriptor.NIL);
        }
        SubLObject pending_formulas = rkf_sd_lookup(cache_key);
        final SubLObject ignore_formulas = rkf_sd_ignore_lookup(cache_key);
        pending_formulas = conses_high.set_difference(pending_formulas, ignore_formulas, Symbols.symbol_function((SubLObject)rkf_salient_descriptor.EQUAL), (SubLObject)rkf_salient_descriptor.UNPROVIDED);
        if (rkf_salient_descriptor.NIL != pending_formulas) {
            rkf_sd_update(cache_key, (SubLObject)rkf_salient_descriptor.NIL);
            rkf_sd_ignore_update(cache_key, conses_high.union(pending_formulas, ignore_formulas, Symbols.symbol_function((SubLObject)rkf_salient_descriptor.EQUAL), (SubLObject)rkf_salient_descriptor.UNPROVIDED));
            return conses_high.copy_tree(pending_formulas);
        }
        SubLObject new_formulas = rkf_strong_suggestions(fort, mt);
        new_formulas = conses_high.set_difference(new_formulas, ignore_formulas, Symbols.symbol_function((SubLObject)rkf_salient_descriptor.EQUAL), (SubLObject)rkf_salient_descriptor.UNPROVIDED);
        if (rkf_salient_descriptor.NIL != new_formulas) {
            rkf_sd_ignore_update(cache_key, conses_high.union(new_formulas, pending_formulas, Symbols.symbol_function((SubLObject)rkf_salient_descriptor.EQUAL), (SubLObject)rkf_salient_descriptor.UNPROVIDED));
            return new_formulas;
        }
        return (SubLObject)rkf_salient_descriptor.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/rkf-salient-descriptor.lisp", position = 5169L)
    public static SubLObject rkf_requirements(final SubLObject fort, SubLObject mt) {
        if (mt == rkf_salient_descriptor.UNPROVIDED) {
            mt = control_vars.$rkf_mt$.getDynamicValue();
        }
        return rkf_salient_descriptor_formulas(fort, rkf_salient_descriptor.$const10$keRequirement, mt);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/rkf-salient-descriptor.lisp", position = 5300L)
    public static SubLObject rkf_strong_suggestions(final SubLObject fort, SubLObject mt) {
        if (mt == rkf_salient_descriptor.UNPROVIDED) {
            mt = control_vars.$rkf_mt$.getDynamicValue();
        }
        return rkf_salient_descriptor_formulas(fort, rkf_salient_descriptor.$const11$keStrongSuggestion, mt);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/rkf-salient-descriptor.lisp", position = 5442L)
    public static SubLObject rkf_neighbor_suggestions(final SubLObject fort, SubLObject mt) {
        if (mt == rkf_salient_descriptor.UNPROVIDED) {
            mt = control_vars.$rkf_mt$.getDynamicValue();
        }
        return rkf_salient_neighbor_suggestions(fort, mt);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/rkf-salient-descriptor.lisp", position = 5566L)
    public static SubLObject rkf_weak_suggestions(final SubLObject fort, SubLObject mt) {
        if (mt == rkf_salient_descriptor.UNPROVIDED) {
            mt = control_vars.$rkf_mt$.getDynamicValue();
        }
        return rkf_salient_descriptor_formulas(fort, rkf_salient_descriptor.$const12$keWeakSuggestion, mt);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/rkf-salient-descriptor.lisp", position = 5704L)
    public static SubLObject rkf_interaction_requirements(final SubLObject fort, SubLObject mt) {
        if (mt == rkf_salient_descriptor.UNPROVIDED) {
            mt = control_vars.$rkf_mt$.getDynamicValue();
        }
        return rkf_salient_descriptor_formulas(fort, rkf_salient_descriptor.$const13$keInteractionRequirement, mt);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/rkf-salient-descriptor.lisp", position = 5858L)
    public static SubLObject rkf_interaction_strong_suggestions(final SubLObject fort, SubLObject mt) {
        if (mt == rkf_salient_descriptor.UNPROVIDED) {
            mt = control_vars.$rkf_mt$.getDynamicValue();
        }
        return rkf_salient_descriptor_formulas(fort, rkf_salient_descriptor.$const14$keInteractionStrongSuggestion, mt);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/rkf-salient-descriptor.lisp", position = 6579L)
    public static SubLObject with_rkf_sd_memoization(final SubLObject macroform, final SubLObject environment) {
        final SubLObject datum = macroform.rest();
        final SubLObject body;
        final SubLObject current = body = datum;
        return (SubLObject)ConsesLow.list((SubLObject)rkf_salient_descriptor.$sym16$WITH_POSSIBLY_NEW_MEMOIZATION_STATE, (SubLObject)ConsesLow.listS((SubLObject)rkf_salient_descriptor.$sym17$WITH_SBHL_RESOURCED_MARKING_SPACES, (SubLObject)rkf_salient_descriptor.SIX_INTEGER, ConsesLow.append(body, (SubLObject)rkf_salient_descriptor.NIL)));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/rkf-salient-descriptor.lisp", position = 6864L)
    public static SubLObject rkf_induced_salient_descriptor_query_sentences(final SubLObject v_term, SubLObject mt) {
        if (mt == rkf_salient_descriptor.UNPROVIDED) {
            mt = control_vars.$rkf_mt$.getDynamicValue();
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject query_sentences = (SubLObject)rkf_salient_descriptor.NIL;
        SubLObject justifications = (SubLObject)rkf_salient_descriptor.NIL;
        final SubLObject local_state;
        final SubLObject state = local_state = memoization_state.possibly_new_memoization_state();
        final SubLObject _prev_bind_0 = memoization_state.$memoization_state$.currentBinding(thread);
        try {
            memoization_state.$memoization_state$.bind(local_state, thread);
            final SubLObject original_memoization_process = memoization_state.memoization_state_original_process(local_state);
            try {
                final SubLObject already_resourcing_p = sbhl_marking_vars.$resourcing_sbhl_marking_spaces_p$.getDynamicValue(thread);
                final SubLObject _prev_bind_0_$1 = sbhl_marking_vars.$resourced_sbhl_marking_space_limit$.currentBinding(thread);
                final SubLObject _prev_bind_2 = sbhl_marking_vars.$resourced_sbhl_marking_spaces$.currentBinding(thread);
                final SubLObject _prev_bind_3 = sbhl_marking_vars.$resourcing_sbhl_marking_spaces_p$.currentBinding(thread);
                try {
                    sbhl_marking_vars.$resourced_sbhl_marking_space_limit$.bind(sbhl_marking_vars.determine_resource_limit(already_resourcing_p, (SubLObject)rkf_salient_descriptor.SIX_INTEGER), thread);
                    sbhl_marking_vars.$resourced_sbhl_marking_spaces$.bind(sbhl_marking_vars.possibly_new_marking_resource(already_resourcing_p), thread);
                    sbhl_marking_vars.$resourcing_sbhl_marking_spaces_p$.bind((SubLObject)rkf_salient_descriptor.T, thread);
                    final SubLObject induction_basis_properties = rkf_sd_induction_basis_properties(v_term, mt);
                    final SubLObject maximally_generalP = (SubLObject)rkf_salient_descriptor.NIL;
                    final SubLObject _prev_bind_0_$2 = rkf_salient_descriptor.$rkf_salient_descriptor_number_cutoff$.currentBinding(thread);
                    try {
                        rkf_salient_descriptor.$rkf_salient_descriptor_number_cutoff$.bind((SubLObject)rkf_salient_descriptor.NIL, thread);
                        thread.resetMultipleValues();
                        final SubLObject common_properties = rkf_induced_salient_descriptor_common_properties(induction_basis_properties, mt, maximally_generalP, (SubLObject)rkf_salient_descriptor.UNPROVIDED);
                        final SubLObject basis_properties = thread.secondMultipleValue();
                        thread.resetMultipleValues();
                        justifications = rkf_sd_justifications_from_basis_properties(v_term, basis_properties, mt);
                        SubLObject cdolist_list_var = common_properties;
                        SubLObject common_property = (SubLObject)rkf_salient_descriptor.NIL;
                        common_property = cdolist_list_var.first();
                        while (rkf_salient_descriptor.NIL != cdolist_list_var) {
                            final SubLObject query_sentence = properties.property_to_sentence(common_property, v_term);
                            if (rkf_salient_descriptor.NIL == rkf_salient_descriptor.$rkf_sd_exclude_known_promptsP$.getDynamicValue(thread) || rkf_salient_descriptor.NIL == rkf_sd_known(query_sentence, mt, (SubLObject)rkf_salient_descriptor.UNPROVIDED)) {
                                query_sentences = (SubLObject)ConsesLow.cons(query_sentence, query_sentences);
                            }
                            cdolist_list_var = cdolist_list_var.rest();
                            common_property = cdolist_list_var.first();
                        }
                        query_sentences = Sequences.nreverse(query_sentences);
                    }
                    finally {
                        rkf_salient_descriptor.$rkf_salient_descriptor_number_cutoff$.rebind(_prev_bind_0_$2, thread);
                    }
                }
                finally {
                    sbhl_marking_vars.$resourcing_sbhl_marking_spaces_p$.rebind(_prev_bind_3, thread);
                    sbhl_marking_vars.$resourced_sbhl_marking_spaces$.rebind(_prev_bind_2, thread);
                    sbhl_marking_vars.$resourced_sbhl_marking_space_limit$.rebind(_prev_bind_0_$1, thread);
                }
            }
            finally {
                final SubLObject _prev_bind_0_$3 = Threads.$is_thread_performing_cleanupP$.currentBinding(thread);
                try {
                    Threads.$is_thread_performing_cleanupP$.bind((SubLObject)rkf_salient_descriptor.T, thread);
                    final SubLObject _values = Values.getValuesAsVector();
                    memoization_state.memoization_state_possibly_clear_original_process(local_state, original_memoization_process);
                    Values.restoreValuesFromVector(_values);
                }
                finally {
                    Threads.$is_thread_performing_cleanupP$.rebind(_prev_bind_0_$3, thread);
                }
            }
        }
        finally {
            memoization_state.$memoization_state$.rebind(_prev_bind_0, thread);
        }
        return Values.values(query_sentences, justifications);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/rkf-salient-descriptor.lisp", position = 8055L)
    public static SubLObject rkf_sd_justifications_from_basis_properties(final SubLObject v_term, final SubLObject basis_properties, final SubLObject mt) {
        SubLObject justifications = (SubLObject)rkf_salient_descriptor.NIL;
        SubLObject cdolist_list_var = basis_properties;
        SubLObject basis_property = (SubLObject)rkf_salient_descriptor.NIL;
        basis_property = cdolist_list_var.first();
        while (rkf_salient_descriptor.NIL != cdolist_list_var) {
            final SubLObject fact = properties.property_to_sentence(basis_property, v_term);
            final SubLObject justification = rkf_query_utilities.rkf_justify(fact, mt).first();
            if (rkf_salient_descriptor.NIL == arguments.supports_p(justification)) {
                Errors.warn((SubLObject)rkf_salient_descriptor.$str18$RKF_Salient_Descriptor__Couldn_t_, fact, mt);
            }
            justifications = (SubLObject)ConsesLow.cons(justification, justifications);
            cdolist_list_var = cdolist_list_var.rest();
            basis_property = cdolist_list_var.first();
        }
        return Sequences.nreverse(justifications);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/rkf-salient-descriptor.lisp", position = 8529L)
    public static SubLObject rkf_close_isas(final SubLObject v_term, final SubLObject mt) {
        final SubLObject generality_cutoff = (SubLObject)rkf_salient_descriptor.$int19$50000;
        final SubLObject all_isas = isa.isa(v_term, mt, (SubLObject)rkf_salient_descriptor.UNPROVIDED);
        SubLObject close_isas = (SubLObject)rkf_salient_descriptor.NIL;
        SubLObject cdolist_list_var = all_isas;
        SubLObject v_isa = (SubLObject)rkf_salient_descriptor.NIL;
        v_isa = cdolist_list_var.first();
        while (rkf_salient_descriptor.NIL != cdolist_list_var) {
            if (!cardinality_estimates.generality_estimate(v_isa).numG(generality_cutoff)) {
                close_isas = (SubLObject)ConsesLow.cons(v_isa, close_isas);
            }
            cdolist_list_var = cdolist_list_var.rest();
            v_isa = cdolist_list_var.first();
        }
        return close_isas;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/rkf-salient-descriptor.lisp", position = 8868L)
    public static SubLObject rkf_close_genls(final SubLObject v_term, final SubLObject mt) {
        final SubLObject generality_cutoff = (SubLObject)rkf_salient_descriptor.$int19$50000;
        final SubLObject all_genls = genls.genls(v_term, mt, (SubLObject)rkf_salient_descriptor.UNPROVIDED);
        SubLObject close_genls = (SubLObject)rkf_salient_descriptor.NIL;
        SubLObject cdolist_list_var = all_genls;
        SubLObject genl = (SubLObject)rkf_salient_descriptor.NIL;
        genl = cdolist_list_var.first();
        while (rkf_salient_descriptor.NIL != cdolist_list_var) {
            if (!cardinality_estimates.generality_estimate(genl).numG(generality_cutoff)) {
                close_genls = (SubLObject)ConsesLow.cons(genl, close_genls);
            }
            cdolist_list_var = cdolist_list_var.rest();
            genl = cdolist_list_var.first();
        }
        return close_genls;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/rkf-salient-descriptor.lisp", position = 9219L)
    public static SubLObject rkf_induced_salient_descriptor_meta_isas(final SubLObject mt, final SubLObject superior, final SubLObject type, SubLObject known_meta_isas, SubLObject lax_factor) {
        if (known_meta_isas == rkf_salient_descriptor.UNPROVIDED) {
            known_meta_isas = (SubLObject)rkf_salient_descriptor.NIL;
        }
        if (lax_factor == rkf_salient_descriptor.UNPROVIDED) {
            lax_factor = (SubLObject)rkf_salient_descriptor.TEN_INTEGER;
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        assert rkf_salient_descriptor.NIL != subl_promotions.positive_integer_p(lax_factor) : lax_factor;
        final SubLObject siblings = rkf_salient_descriptor_get_inferiors(mt, superior, type, (SubLObject)rkf_salient_descriptor.UNPROVIDED);
        final SubLObject sibling_count = Sequences.length(siblings);
        final SubLObject min_occurence = number_utilities.maximum((SubLObject)ConsesLow.list(Numbers.integerDivide(sibling_count, lax_factor), (SubLObject)rkf_salient_descriptor.FIVE_INTEGER), (SubLObject)rkf_salient_descriptor.UNPROVIDED);
        SubLObject alist = (SubLObject)rkf_salient_descriptor.NIL;
        if (rkf_salient_descriptor.$kw21$ISA == type) {
            final SubLObject mt_var = mt_relevance_macros.with_inference_mt_relevance_validate(mt);
            final SubLObject _prev_bind_0 = mt_relevance_macros.$mt$.currentBinding(thread);
            final SubLObject _prev_bind_2 = mt_relevance_macros.$relevant_mt_function$.currentBinding(thread);
            final SubLObject _prev_bind_3 = mt_relevance_macros.$relevant_mts$.currentBinding(thread);
            try {
                mt_relevance_macros.$mt$.bind(mt_relevance_macros.update_inference_mt_relevance_mt(mt_var), thread);
                mt_relevance_macros.$relevant_mt_function$.bind(mt_relevance_macros.update_inference_mt_relevance_function(mt_var), thread);
                mt_relevance_macros.$relevant_mts$.bind(mt_relevance_macros.update_inference_mt_relevance_mt_list(mt_var), thread);
                known_meta_isas = ConsesLow.append(known_meta_isas, isa.all_isa(superior, (SubLObject)rkf_salient_descriptor.UNPROVIDED, (SubLObject)rkf_salient_descriptor.UNPROVIDED));
            }
            finally {
                mt_relevance_macros.$relevant_mts$.rebind(_prev_bind_3, thread);
                mt_relevance_macros.$relevant_mt_function$.rebind(_prev_bind_2, thread);
                mt_relevance_macros.$mt$.rebind(_prev_bind_0, thread);
            }
        }
        if (sibling_count.numGE(min_occurence)) {
            SubLObject cdolist_list_var = siblings;
            SubLObject sibling = (SubLObject)rkf_salient_descriptor.NIL;
            sibling = cdolist_list_var.first();
            while (rkf_salient_descriptor.NIL != cdolist_list_var) {
                SubLObject cdolist_list_var_$4 = rkf_term_meta_isas(sibling, mt);
                SubLObject meta_isa = (SubLObject)rkf_salient_descriptor.NIL;
                meta_isa = cdolist_list_var_$4.first();
                while (rkf_salient_descriptor.NIL != cdolist_list_var_$4) {
                    if (rkf_salient_descriptor.NIL == subl_promotions.memberP(meta_isa, known_meta_isas, (SubLObject)rkf_salient_descriptor.UNPROVIDED, (SubLObject)rkf_salient_descriptor.UNPROVIDED) && rkf_salient_descriptor.NIL == rkf_relevance_utilities.rkf_irrelevant_term(meta_isa, mt)) {
                        final SubLObject mt_var2 = mt_relevance_macros.with_inference_mt_relevance_validate(mt);
                        final SubLObject _prev_bind_4 = mt_relevance_macros.$mt$.currentBinding(thread);
                        final SubLObject _prev_bind_5 = mt_relevance_macros.$relevant_mt_function$.currentBinding(thread);
                        final SubLObject _prev_bind_6 = mt_relevance_macros.$relevant_mts$.currentBinding(thread);
                        try {
                            mt_relevance_macros.$mt$.bind(mt_relevance_macros.update_inference_mt_relevance_mt(mt_var2), thread);
                            mt_relevance_macros.$relevant_mt_function$.bind(mt_relevance_macros.update_inference_mt_relevance_function(mt_var2), thread);
                            mt_relevance_macros.$relevant_mts$.bind(mt_relevance_macros.update_inference_mt_relevance_mt_list(mt_var2), thread);
                            final SubLObject current_count = list_utilities.alist_lookup(alist, meta_isa, Symbols.symbol_function((SubLObject)rkf_salient_descriptor.EQUAL), (SubLObject)rkf_salient_descriptor.ZERO_INTEGER);
                            alist = list_utilities.alist_enter(alist, meta_isa, number_utilities.f_1X(current_count), Symbols.symbol_function((SubLObject)rkf_salient_descriptor.EQUAL));
                        }
                        finally {
                            mt_relevance_macros.$relevant_mts$.rebind(_prev_bind_6, thread);
                            mt_relevance_macros.$relevant_mt_function$.rebind(_prev_bind_5, thread);
                            mt_relevance_macros.$mt$.rebind(_prev_bind_4, thread);
                        }
                    }
                    cdolist_list_var_$4 = cdolist_list_var_$4.rest();
                    meta_isa = cdolist_list_var_$4.first();
                }
                cdolist_list_var = cdolist_list_var.rest();
                sibling = cdolist_list_var.first();
            }
        }
        SubLObject filtered = (SubLObject)rkf_salient_descriptor.NIL;
        SubLObject cdolist_list_var2 = alist;
        SubLObject item = (SubLObject)rkf_salient_descriptor.NIL;
        item = cdolist_list_var2.first();
        while (rkf_salient_descriptor.NIL != cdolist_list_var2) {
            SubLObject current;
            final SubLObject datum = current = item;
            SubLObject meta_isa2 = (SubLObject)rkf_salient_descriptor.NIL;
            SubLObject count = (SubLObject)rkf_salient_descriptor.NIL;
            cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)rkf_salient_descriptor.$list22);
            meta_isa2 = current.first();
            current = (count = current.rest());
            if (!count.numL(min_occurence) && rkf_salient_descriptor.NIL == rkf_salient_descriptor_meta_isa_type_violationP(superior, meta_isa2, mt)) {
                filtered = (SubLObject)ConsesLow.cons(item, filtered);
            }
            cdolist_list_var2 = cdolist_list_var2.rest();
            item = cdolist_list_var2.first();
        }
        return filtered;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/rkf-salient-descriptor.lisp", position = 10636L)
    public static SubLObject rkf_make_meta_isa_formula(final SubLObject v_term, final SubLObject meta_isa) {
        final SubLObject new_var = czer_utilities.unique_el_var_wrt_expression(v_term, (SubLObject)rkf_salient_descriptor.$sym23$_X);
        return el_utilities.make_existential(new_var, el_utilities.make_conjunction((SubLObject)ConsesLow.list(el_utilities.make_binary_formula(rkf_salient_descriptor.$const24$isa, new_var, meta_isa), el_utilities.make_binary_formula(rkf_salient_descriptor.$const24$isa, v_term, new_var))));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/rkf-salient-descriptor.lisp", position = 10996L)
    public static SubLObject rkf_make_bin_pred_formula(final SubLObject v_term, final SubLObject bin_pred) {
        return el_utilities.make_existential((SubLObject)rkf_salient_descriptor.$sym23$_X, el_utilities.make_binary_formula(bin_pred, v_term, (SubLObject)rkf_salient_descriptor.$sym23$_X));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/rkf-salient-descriptor.lisp", position = 11130L)
    public static SubLObject rkf_make_salient_descriptor_rule(final SubLObject term_var, final SubLObject superior, final SubLObject consequent, final SubLObject type) {
        final SubLObject superior_pred = (type == rkf_salient_descriptor.$kw21$ISA) ? rkf_salient_descriptor.$const24$isa : rkf_salient_descriptor.$const25$genls;
        return el_utilities.make_implication(el_utilities.make_binary_formula(superior_pred, term_var, superior), el_utilities.make_binary_formula(rkf_salient_descriptor.$const11$keStrongSuggestion, term_var, consequent));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/rkf-salient-descriptor.lisp", position = 11431L)
    public static SubLObject rkf_salient_descriptor_meta_isa_type_violationP_internal(final SubLObject v_term, final SubLObject meta_isa, final SubLObject mt) {
        final SubLObject type_specs = rkf_salient_descriptor_type_specs(meta_isa, mt);
        SubLObject malP = (SubLObject)rkf_salient_descriptor.NIL;
        if (rkf_salient_descriptor.NIL == malP) {
            SubLObject csome_list_var = type_specs;
            SubLObject type_spec = (SubLObject)rkf_salient_descriptor.NIL;
            type_spec = csome_list_var.first();
            while (rkf_salient_descriptor.NIL == malP && rkf_salient_descriptor.NIL != csome_list_var) {
                if (rkf_salient_descriptor.NIL == rkf_salient_descriptor_genlP(v_term, type_spec, mt)) {
                    malP = (SubLObject)rkf_salient_descriptor.T;
                }
                csome_list_var = csome_list_var.rest();
                type_spec = csome_list_var.first();
            }
        }
        return malP;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/rkf-salient-descriptor.lisp", position = 11431L)
    public static SubLObject rkf_salient_descriptor_meta_isa_type_violationP(final SubLObject v_term, final SubLObject meta_isa, final SubLObject mt) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject v_memoization_state = memoization_state.$memoization_state$.getDynamicValue(thread);
        SubLObject caching_state = (SubLObject)rkf_salient_descriptor.NIL;
        if (rkf_salient_descriptor.NIL == v_memoization_state) {
            return rkf_salient_descriptor_meta_isa_type_violationP_internal(v_term, meta_isa, mt);
        }
        caching_state = memoization_state.memoization_state_lookup(v_memoization_state, (SubLObject)rkf_salient_descriptor.$sym26$RKF_SALIENT_DESCRIPTOR_META_ISA_TYPE_VIOLATION_, (SubLObject)rkf_salient_descriptor.UNPROVIDED);
        if (rkf_salient_descriptor.NIL == caching_state) {
            caching_state = memoization_state.create_caching_state(memoization_state.memoization_state_lock(v_memoization_state), (SubLObject)rkf_salient_descriptor.$sym26$RKF_SALIENT_DESCRIPTOR_META_ISA_TYPE_VIOLATION_, (SubLObject)rkf_salient_descriptor.THREE_INTEGER, (SubLObject)rkf_salient_descriptor.NIL, (SubLObject)rkf_salient_descriptor.EQUAL, (SubLObject)rkf_salient_descriptor.UNPROVIDED);
            memoization_state.memoization_state_put(v_memoization_state, (SubLObject)rkf_salient_descriptor.$sym26$RKF_SALIENT_DESCRIPTOR_META_ISA_TYPE_VIOLATION_, caching_state);
        }
        final SubLObject sxhash = memoization_state.sxhash_calc_3(v_term, meta_isa, mt);
        final SubLObject collisions = memoization_state.caching_state_lookup(caching_state, sxhash, (SubLObject)rkf_salient_descriptor.UNPROVIDED);
        if (!collisions.eql(memoization_state.$memoized_item_not_found$.getGlobalValue())) {
            SubLObject cdolist_list_var = collisions;
            SubLObject collision = (SubLObject)rkf_salient_descriptor.NIL;
            collision = cdolist_list_var.first();
            while (rkf_salient_descriptor.NIL != cdolist_list_var) {
                SubLObject cached_args = collision.first();
                final SubLObject results2 = conses_high.second(collision);
                if (v_term.equal(cached_args.first())) {
                    cached_args = cached_args.rest();
                    if (meta_isa.equal(cached_args.first())) {
                        cached_args = cached_args.rest();
                        if (rkf_salient_descriptor.NIL != cached_args && rkf_salient_descriptor.NIL == cached_args.rest() && mt.equal(cached_args.first())) {
                            return memoization_state.caching_results(results2);
                        }
                    }
                }
                cdolist_list_var = cdolist_list_var.rest();
                collision = cdolist_list_var.first();
            }
        }
        final SubLObject results3 = Values.arg2(thread.resetMultipleValues(), (SubLObject)Values.multiple_value_list(rkf_salient_descriptor_meta_isa_type_violationP_internal(v_term, meta_isa, mt)));
        memoization_state.caching_state_enter_multi_key_n(caching_state, sxhash, collisions, results3, (SubLObject)ConsesLow.list(v_term, meta_isa, mt));
        return memoization_state.caching_results(results3);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/rkf-salient-descriptor.lisp", position = 11837L)
    public static SubLObject rkf_salient_descriptor_type_specs_internal(final SubLObject collection, final SubLObject mt) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject type_specs = (SubLObject)rkf_salient_descriptor.NIL;
        final SubLObject mt_var = mt_relevance_macros.with_inference_mt_relevance_validate(mt);
        final SubLObject _prev_bind_0 = mt_relevance_macros.$mt$.currentBinding(thread);
        final SubLObject _prev_bind_2 = mt_relevance_macros.$relevant_mt_function$.currentBinding(thread);
        final SubLObject _prev_bind_3 = mt_relevance_macros.$relevant_mts$.currentBinding(thread);
        try {
            mt_relevance_macros.$mt$.bind(mt_relevance_macros.update_inference_mt_relevance_mt(mt_var), thread);
            mt_relevance_macros.$relevant_mt_function$.bind(mt_relevance_macros.update_inference_mt_relevance_function(mt_var), thread);
            mt_relevance_macros.$relevant_mts$.bind(mt_relevance_macros.update_inference_mt_relevance_mt_list(mt_var), thread);
            SubLObject node_var = collection;
            final SubLObject deck_type = (SubLObject)rkf_salient_descriptor.$kw30$STACK;
            final SubLObject recur_deck = deck.create_deck(deck_type);
            final SubLObject _prev_bind_0_$5 = sbhl_marking_vars.$sbhl_space$.currentBinding(thread);
            try {
                sbhl_marking_vars.$sbhl_space$.bind(sbhl_marking_vars.get_sbhl_marking_space(), thread);
                try {
                    final SubLObject tv_var = (SubLObject)rkf_salient_descriptor.NIL;
                    final SubLObject _prev_bind_0_$6 = sbhl_search_vars.$sbhl_tv$.currentBinding(thread);
                    final SubLObject _prev_bind_1_$7 = sbhl_search_vars.$relevant_sbhl_tv_function$.currentBinding(thread);
                    try {
                        sbhl_search_vars.$sbhl_tv$.bind((rkf_salient_descriptor.NIL != tv_var) ? tv_var : sbhl_search_vars.get_sbhl_true_tv(), thread);
                        sbhl_search_vars.$relevant_sbhl_tv_function$.bind((SubLObject)((rkf_salient_descriptor.NIL != tv_var) ? rkf_salient_descriptor.$sym31$RELEVANT_SBHL_TV_IS_GENERAL_TV : sbhl_search_vars.$relevant_sbhl_tv_function$.getDynamicValue(thread)), thread);
                        if (rkf_salient_descriptor.NIL != tv_var && rkf_salient_descriptor.NIL != sbhl_paranoia.sbhl_object_type_checking_p() && rkf_salient_descriptor.NIL == sbhl_search_vars.sbhl_true_tv_p(tv_var)) {
                            final SubLObject pcase_var = sbhl_paranoia.$sbhl_type_error_action$.getDynamicValue(thread);
                            if (pcase_var.eql((SubLObject)rkf_salient_descriptor.$kw32$ERROR)) {
                                sbhl_paranoia.sbhl_error((SubLObject)rkf_salient_descriptor.ONE_INTEGER, (SubLObject)rkf_salient_descriptor.$str33$_A_is_not_a__A, tv_var, (SubLObject)rkf_salient_descriptor.$sym34$SBHL_TRUE_TV_P, (SubLObject)rkf_salient_descriptor.UNPROVIDED, (SubLObject)rkf_salient_descriptor.UNPROVIDED, (SubLObject)rkf_salient_descriptor.UNPROVIDED);
                            }
                            else if (pcase_var.eql((SubLObject)rkf_salient_descriptor.$kw35$CERROR)) {
                                sbhl_paranoia.sbhl_cerror((SubLObject)rkf_salient_descriptor.ONE_INTEGER, (SubLObject)rkf_salient_descriptor.$str36$continue_anyway, (SubLObject)rkf_salient_descriptor.$str33$_A_is_not_a__A, tv_var, (SubLObject)rkf_salient_descriptor.$sym34$SBHL_TRUE_TV_P, (SubLObject)rkf_salient_descriptor.UNPROVIDED, (SubLObject)rkf_salient_descriptor.UNPROVIDED, (SubLObject)rkf_salient_descriptor.UNPROVIDED);
                            }
                            else if (pcase_var.eql((SubLObject)rkf_salient_descriptor.$kw37$WARN)) {
                                Errors.warn((SubLObject)rkf_salient_descriptor.$str33$_A_is_not_a__A, tv_var, (SubLObject)rkf_salient_descriptor.$sym34$SBHL_TRUE_TV_P);
                            }
                            else {
                                Errors.warn((SubLObject)rkf_salient_descriptor.$str38$_A_is_not_a_valid__sbhl_type_erro, sbhl_paranoia.$sbhl_type_error_action$.getDynamicValue(thread));
                                Errors.cerror((SubLObject)rkf_salient_descriptor.$str36$continue_anyway, (SubLObject)rkf_salient_descriptor.$str33$_A_is_not_a__A, tv_var, (SubLObject)rkf_salient_descriptor.$sym34$SBHL_TRUE_TV_P);
                            }
                        }
                        final SubLObject _prev_bind_0_$7 = sbhl_search_vars.$sbhl_search_module$.currentBinding(thread);
                        final SubLObject _prev_bind_1_$8 = sbhl_search_vars.$sbhl_search_module_type$.currentBinding(thread);
                        final SubLObject _prev_bind_2_$10 = sbhl_search_vars.$sbhl_add_node_to_result_test$.currentBinding(thread);
                        final SubLObject _prev_bind_4 = sbhl_search_vars.$genl_inverse_mode_p$.currentBinding(thread);
                        final SubLObject _prev_bind_5 = sbhl_module_vars.$sbhl_module$.currentBinding(thread);
                        try {
                            sbhl_search_vars.$sbhl_search_module$.bind(sbhl_module_vars.get_sbhl_module(rkf_salient_descriptor.$const25$genls), thread);
                            sbhl_search_vars.$sbhl_search_module_type$.bind(sbhl_module_utilities.get_sbhl_module_type(sbhl_module_vars.get_sbhl_module(rkf_salient_descriptor.$const25$genls)), thread);
                            sbhl_search_vars.$sbhl_add_node_to_result_test$.bind(sbhl_module_utilities.get_sbhl_add_node_to_result_test(sbhl_module_vars.get_sbhl_module(rkf_salient_descriptor.$const25$genls)), thread);
                            sbhl_search_vars.$genl_inverse_mode_p$.bind((SubLObject)rkf_salient_descriptor.NIL, thread);
                            sbhl_module_vars.$sbhl_module$.bind(sbhl_module_vars.get_sbhl_module(rkf_salient_descriptor.$const25$genls), thread);
                            if (rkf_salient_descriptor.NIL != sbhl_paranoia.suspend_sbhl_type_checkingP() || rkf_salient_descriptor.NIL != sbhl_module_utilities.apply_sbhl_module_type_test(collection, sbhl_module_vars.get_sbhl_module((SubLObject)rkf_salient_descriptor.UNPROVIDED))) {
                                final SubLObject _prev_bind_0_$8 = sbhl_search_vars.$sbhl_search_direction$.currentBinding(thread);
                                final SubLObject _prev_bind_1_$9 = sbhl_link_vars.$sbhl_link_direction$.currentBinding(thread);
                                final SubLObject _prev_bind_2_$11 = sbhl_search_vars.$genl_inverse_mode_p$.currentBinding(thread);
                                try {
                                    sbhl_search_vars.$sbhl_search_direction$.bind(sbhl_search_vars.get_sbhl_forward_search_direction(), thread);
                                    sbhl_link_vars.$sbhl_link_direction$.bind(sbhl_module_utilities.sbhl_search_direction_to_link_direction(sbhl_search_vars.get_sbhl_forward_search_direction(), sbhl_module_vars.get_sbhl_module(rkf_salient_descriptor.$const25$genls)), thread);
                                    sbhl_search_vars.$genl_inverse_mode_p$.bind((SubLObject)rkf_salient_descriptor.NIL, thread);
                                    sbhl_marking_utilities.sbhl_mark_node_marked(node_var, (SubLObject)rkf_salient_descriptor.UNPROVIDED);
                                    while (rkf_salient_descriptor.NIL != node_var) {
                                        final SubLObject super_coll = node_var;
                                        final SubLObject node_var_$14 = rkf_salient_descriptor.$const39$typeGenls;
                                        final SubLObject deck_type_$15 = (SubLObject)rkf_salient_descriptor.$kw29$QUEUE;
                                        final SubLObject recur_deck_$16 = deck.create_deck(deck_type_$15);
                                        SubLObject node_and_predicate_mode = (SubLObject)rkf_salient_descriptor.NIL;
                                        final SubLObject _prev_bind_0_$9 = sbhl_marking_vars.$sbhl_space$.currentBinding(thread);
                                        try {
                                            sbhl_marking_vars.$sbhl_space$.bind(sbhl_marking_vars.get_sbhl_marking_space(), thread);
                                            try {
                                                final SubLObject tv_var_$18 = (SubLObject)rkf_salient_descriptor.NIL;
                                                final SubLObject _prev_bind_0_$10 = sbhl_search_vars.$sbhl_tv$.currentBinding(thread);
                                                final SubLObject _prev_bind_1_$10 = sbhl_search_vars.$relevant_sbhl_tv_function$.currentBinding(thread);
                                                try {
                                                    sbhl_search_vars.$sbhl_tv$.bind((rkf_salient_descriptor.NIL != tv_var_$18) ? tv_var_$18 : sbhl_search_vars.get_sbhl_true_tv(), thread);
                                                    sbhl_search_vars.$relevant_sbhl_tv_function$.bind((SubLObject)((rkf_salient_descriptor.NIL != tv_var_$18) ? rkf_salient_descriptor.$sym31$RELEVANT_SBHL_TV_IS_GENERAL_TV : sbhl_search_vars.$relevant_sbhl_tv_function$.getDynamicValue(thread)), thread);
                                                    if (rkf_salient_descriptor.NIL != tv_var_$18 && rkf_salient_descriptor.NIL != sbhl_paranoia.sbhl_object_type_checking_p() && rkf_salient_descriptor.NIL == sbhl_search_vars.sbhl_true_tv_p(tv_var_$18)) {
                                                        final SubLObject pcase_var2 = sbhl_paranoia.$sbhl_type_error_action$.getDynamicValue(thread);
                                                        if (pcase_var2.eql((SubLObject)rkf_salient_descriptor.$kw32$ERROR)) {
                                                            sbhl_paranoia.sbhl_error((SubLObject)rkf_salient_descriptor.ONE_INTEGER, (SubLObject)rkf_salient_descriptor.$str33$_A_is_not_a__A, tv_var_$18, (SubLObject)rkf_salient_descriptor.$sym34$SBHL_TRUE_TV_P, (SubLObject)rkf_salient_descriptor.UNPROVIDED, (SubLObject)rkf_salient_descriptor.UNPROVIDED, (SubLObject)rkf_salient_descriptor.UNPROVIDED);
                                                        }
                                                        else if (pcase_var2.eql((SubLObject)rkf_salient_descriptor.$kw35$CERROR)) {
                                                            sbhl_paranoia.sbhl_cerror((SubLObject)rkf_salient_descriptor.ONE_INTEGER, (SubLObject)rkf_salient_descriptor.$str36$continue_anyway, (SubLObject)rkf_salient_descriptor.$str33$_A_is_not_a__A, tv_var_$18, (SubLObject)rkf_salient_descriptor.$sym34$SBHL_TRUE_TV_P, (SubLObject)rkf_salient_descriptor.UNPROVIDED, (SubLObject)rkf_salient_descriptor.UNPROVIDED, (SubLObject)rkf_salient_descriptor.UNPROVIDED);
                                                        }
                                                        else if (pcase_var2.eql((SubLObject)rkf_salient_descriptor.$kw37$WARN)) {
                                                            Errors.warn((SubLObject)rkf_salient_descriptor.$str33$_A_is_not_a__A, tv_var_$18, (SubLObject)rkf_salient_descriptor.$sym34$SBHL_TRUE_TV_P);
                                                        }
                                                        else {
                                                            Errors.warn((SubLObject)rkf_salient_descriptor.$str38$_A_is_not_a_valid__sbhl_type_erro, sbhl_paranoia.$sbhl_type_error_action$.getDynamicValue(thread));
                                                            Errors.cerror((SubLObject)rkf_salient_descriptor.$str36$continue_anyway, (SubLObject)rkf_salient_descriptor.$str33$_A_is_not_a__A, tv_var_$18, (SubLObject)rkf_salient_descriptor.$sym34$SBHL_TRUE_TV_P);
                                                        }
                                                    }
                                                    final SubLObject _prev_bind_0_$11 = sbhl_search_vars.$sbhl_search_module$.currentBinding(thread);
                                                    final SubLObject _prev_bind_1_$11 = sbhl_search_vars.$sbhl_search_module_type$.currentBinding(thread);
                                                    final SubLObject _prev_bind_2_$12 = sbhl_search_vars.$sbhl_add_node_to_result_test$.currentBinding(thread);
                                                    final SubLObject _prev_bind_3_$24 = sbhl_search_vars.$genl_inverse_mode_p$.currentBinding(thread);
                                                    final SubLObject _prev_bind_4_$25 = sbhl_module_vars.$sbhl_module$.currentBinding(thread);
                                                    try {
                                                        sbhl_search_vars.$sbhl_search_module$.bind(sbhl_module_vars.get_sbhl_module(rkf_salient_descriptor.$const41$genlPreds), thread);
                                                        sbhl_search_vars.$sbhl_search_module_type$.bind(sbhl_module_utilities.get_sbhl_module_type(sbhl_module_vars.get_sbhl_module(rkf_salient_descriptor.$const41$genlPreds)), thread);
                                                        sbhl_search_vars.$sbhl_add_node_to_result_test$.bind(sbhl_module_utilities.get_sbhl_add_node_to_result_test(sbhl_module_vars.get_sbhl_module(rkf_salient_descriptor.$const41$genlPreds)), thread);
                                                        sbhl_search_vars.$genl_inverse_mode_p$.bind((SubLObject)rkf_salient_descriptor.NIL, thread);
                                                        sbhl_module_vars.$sbhl_module$.bind(sbhl_module_vars.get_sbhl_module(rkf_salient_descriptor.$const41$genlPreds), thread);
                                                        if (rkf_salient_descriptor.NIL != sbhl_paranoia.suspend_sbhl_type_checkingP() || rkf_salient_descriptor.NIL != sbhl_module_utilities.apply_sbhl_module_type_test(rkf_salient_descriptor.$const39$typeGenls, sbhl_module_vars.get_sbhl_module((SubLObject)rkf_salient_descriptor.UNPROVIDED))) {
                                                            final SubLObject _prev_bind_0_$12 = sbhl_search_vars.$sbhl_search_direction$.currentBinding(thread);
                                                            final SubLObject _prev_bind_1_$12 = sbhl_link_vars.$sbhl_link_direction$.currentBinding(thread);
                                                            final SubLObject _prev_bind_2_$13 = sbhl_search_vars.$genl_inverse_mode_p$.currentBinding(thread);
                                                            try {
                                                                sbhl_search_vars.$sbhl_search_direction$.bind(sbhl_search_vars.get_sbhl_backward_search_direction(), thread);
                                                                sbhl_link_vars.$sbhl_link_direction$.bind(sbhl_module_utilities.sbhl_search_direction_to_link_direction(sbhl_search_vars.get_sbhl_backward_search_direction(), sbhl_module_vars.get_sbhl_module(rkf_salient_descriptor.$const41$genlPreds)), thread);
                                                                sbhl_search_vars.$genl_inverse_mode_p$.bind((SubLObject)rkf_salient_descriptor.NIL, thread);
                                                                sbhl_marking_utilities.sbhl_mark_node_marked(node_var_$14, (SubLObject)rkf_salient_descriptor.UNPROVIDED);
                                                                for (node_and_predicate_mode = (SubLObject)ConsesLow.list(rkf_salient_descriptor.$const39$typeGenls, sbhl_search_vars.genl_inverse_mode_p()); rkf_salient_descriptor.NIL != node_and_predicate_mode; node_and_predicate_mode = deck.deck_pop(recur_deck_$16)) {
                                                                    final SubLObject node_var_$15 = node_and_predicate_mode.first();
                                                                    final SubLObject predicate_mode = conses_high.second(node_and_predicate_mode);
                                                                    final SubLObject spec_pred = node_var_$15;
                                                                    final SubLObject _prev_bind_0_$13 = sbhl_search_vars.$genl_inverse_mode_p$.currentBinding(thread);
                                                                    try {
                                                                        sbhl_search_vars.$genl_inverse_mode_p$.bind(predicate_mode, thread);
                                                                        if (rkf_salient_descriptor.NIL != sbhl_search_utilities.apply_sbhl_add_node_test(sbhl_search_vars.get_sbhl_search_add_node_test(), node_var_$15)) {
                                                                            SubLObject cdolist_list_var = kb_mapping_utilities.pred_values(super_coll, spec_pred, (SubLObject)rkf_salient_descriptor.UNPROVIDED, (SubLObject)rkf_salient_descriptor.UNPROVIDED, (SubLObject)rkf_salient_descriptor.UNPROVIDED);
                                                                            SubLObject type_spec = (SubLObject)rkf_salient_descriptor.NIL;
                                                                            type_spec = cdolist_list_var.first();
                                                                            while (rkf_salient_descriptor.NIL != cdolist_list_var) {
                                                                                final SubLObject item_var = type_spec;
                                                                                if (rkf_salient_descriptor.NIL == conses_high.member(item_var, type_specs, Symbols.symbol_function((SubLObject)rkf_salient_descriptor.EQUAL), Symbols.symbol_function((SubLObject)rkf_salient_descriptor.IDENTITY))) {
                                                                                    type_specs = (SubLObject)ConsesLow.cons(item_var, type_specs);
                                                                                }
                                                                                cdolist_list_var = cdolist_list_var.rest();
                                                                                type_spec = cdolist_list_var.first();
                                                                            }
                                                                        }
                                                                        SubLObject cdolist_list_var2;
                                                                        final SubLObject accessible_modules = cdolist_list_var2 = sbhl_macros.get_sbhl_accessible_modules(sbhl_module_vars.get_sbhl_module(rkf_salient_descriptor.$const41$genlPreds));
                                                                        SubLObject module_var = (SubLObject)rkf_salient_descriptor.NIL;
                                                                        module_var = cdolist_list_var2.first();
                                                                        while (rkf_salient_descriptor.NIL != cdolist_list_var2) {
                                                                            final SubLObject _prev_bind_0_$14 = sbhl_module_vars.$sbhl_module$.currentBinding(thread);
                                                                            final SubLObject _prev_bind_1_$13 = sbhl_search_vars.$genl_inverse_mode_p$.currentBinding(thread);
                                                                            try {
                                                                                sbhl_module_vars.$sbhl_module$.bind(module_var, thread);
                                                                                sbhl_search_vars.$genl_inverse_mode_p$.bind((SubLObject)((rkf_salient_descriptor.NIL != sbhl_search_vars.flip_genl_inverse_modeP((SubLObject)rkf_salient_descriptor.UNPROVIDED, (SubLObject)rkf_salient_descriptor.UNPROVIDED)) ? SubLObjectFactory.makeBoolean(rkf_salient_descriptor.NIL == sbhl_search_vars.$genl_inverse_mode_p$.getDynamicValue(thread)) : sbhl_search_vars.$genl_inverse_mode_p$.getDynamicValue(thread)), thread);
                                                                                final SubLObject node = function_terms.naut_to_nart(node_var_$15);
                                                                                if (rkf_salient_descriptor.NIL != sbhl_link_vars.sbhl_node_object_p(node)) {
                                                                                    final SubLObject d_link = sbhl_graphs.get_sbhl_graph_link(node, sbhl_module_vars.get_sbhl_module((SubLObject)rkf_salient_descriptor.UNPROVIDED));
                                                                                    if (rkf_salient_descriptor.NIL != d_link) {
                                                                                        final SubLObject mt_links = sbhl_links.get_sbhl_mt_links(d_link, sbhl_link_vars.get_sbhl_link_direction(), sbhl_module_vars.get_sbhl_module((SubLObject)rkf_salient_descriptor.UNPROVIDED));
                                                                                        if (rkf_salient_descriptor.NIL != mt_links) {
                                                                                            SubLObject iteration_state;
                                                                                            for (iteration_state = dictionary_contents.do_dictionary_contents_state(dictionary.dictionary_contents(mt_links)); rkf_salient_descriptor.NIL == dictionary_contents.do_dictionary_contents_doneP(iteration_state); iteration_state = dictionary_contents.do_dictionary_contents_next(iteration_state)) {
                                                                                                thread.resetMultipleValues();
                                                                                                final SubLObject mt_$33 = dictionary_contents.do_dictionary_contents_key_value(iteration_state);
                                                                                                final SubLObject tv_links = thread.secondMultipleValue();
                                                                                                thread.resetMultipleValues();
                                                                                                if (rkf_salient_descriptor.NIL != mt_relevance_macros.relevant_mtP(mt_$33)) {
                                                                                                    final SubLObject _prev_bind_0_$15 = sbhl_link_vars.$sbhl_link_mt$.currentBinding(thread);
                                                                                                    try {
                                                                                                        sbhl_link_vars.$sbhl_link_mt$.bind(mt_$33, thread);
                                                                                                        SubLObject iteration_state_$35;
                                                                                                        for (iteration_state_$35 = dictionary_contents.do_dictionary_contents_state(dictionary.dictionary_contents(tv_links)); rkf_salient_descriptor.NIL == dictionary_contents.do_dictionary_contents_doneP(iteration_state_$35); iteration_state_$35 = dictionary_contents.do_dictionary_contents_next(iteration_state_$35)) {
                                                                                                            thread.resetMultipleValues();
                                                                                                            final SubLObject tv = dictionary_contents.do_dictionary_contents_key_value(iteration_state_$35);
                                                                                                            final SubLObject link_nodes = thread.secondMultipleValue();
                                                                                                            thread.resetMultipleValues();
                                                                                                            if (rkf_salient_descriptor.NIL != sbhl_search_vars.relevant_sbhl_tvP(tv)) {
                                                                                                                final SubLObject _prev_bind_0_$16 = sbhl_link_vars.$sbhl_link_tv$.currentBinding(thread);
                                                                                                                try {
                                                                                                                    sbhl_link_vars.$sbhl_link_tv$.bind(tv, thread);
                                                                                                                    final SubLObject sol = link_nodes;
                                                                                                                    if (rkf_salient_descriptor.NIL != set.set_p(sol)) {
                                                                                                                        final SubLObject set_contents_var = set.do_set_internal(sol);
                                                                                                                        SubLObject basis_object;
                                                                                                                        SubLObject state;
                                                                                                                        SubLObject node_vars_link_node;
                                                                                                                        for (basis_object = set_contents.do_set_contents_basis_object(set_contents_var), state = (SubLObject)rkf_salient_descriptor.NIL, state = set_contents.do_set_contents_initial_state(basis_object, set_contents_var); rkf_salient_descriptor.NIL == set_contents.do_set_contents_doneP(basis_object, state); state = set_contents.do_set_contents_update_state(state)) {
                                                                                                                            node_vars_link_node = set_contents.do_set_contents_next(basis_object, state);
                                                                                                                            if (rkf_salient_descriptor.NIL != set_contents.do_set_contents_element_validP(state, node_vars_link_node) && rkf_salient_descriptor.NIL == sbhl_marking_utilities.sbhl_search_path_termination_p(node_vars_link_node, (SubLObject)rkf_salient_descriptor.UNPROVIDED)) {
                                                                                                                                sbhl_marking_utilities.sbhl_mark_node_marked(node_vars_link_node, (SubLObject)rkf_salient_descriptor.UNPROVIDED);
                                                                                                                                deck.deck_push((SubLObject)ConsesLow.list(node_vars_link_node, sbhl_search_vars.genl_inverse_mode_p()), recur_deck_$16);
                                                                                                                            }
                                                                                                                        }
                                                                                                                    }
                                                                                                                    else if (sol.isList()) {
                                                                                                                        SubLObject csome_list_var = sol;
                                                                                                                        SubLObject node_vars_link_node2 = (SubLObject)rkf_salient_descriptor.NIL;
                                                                                                                        node_vars_link_node2 = csome_list_var.first();
                                                                                                                        while (rkf_salient_descriptor.NIL != csome_list_var) {
                                                                                                                            if (rkf_salient_descriptor.NIL == sbhl_marking_utilities.sbhl_search_path_termination_p(node_vars_link_node2, (SubLObject)rkf_salient_descriptor.UNPROVIDED)) {
                                                                                                                                sbhl_marking_utilities.sbhl_mark_node_marked(node_vars_link_node2, (SubLObject)rkf_salient_descriptor.UNPROVIDED);
                                                                                                                                deck.deck_push((SubLObject)ConsesLow.list(node_vars_link_node2, sbhl_search_vars.genl_inverse_mode_p()), recur_deck_$16);
                                                                                                                            }
                                                                                                                            csome_list_var = csome_list_var.rest();
                                                                                                                            node_vars_link_node2 = csome_list_var.first();
                                                                                                                        }
                                                                                                                    }
                                                                                                                    else {
                                                                                                                        Errors.error((SubLObject)rkf_salient_descriptor.$str42$_A_is_neither_SET_P_nor_LISTP_, sol);
                                                                                                                    }
                                                                                                                }
                                                                                                                finally {
                                                                                                                    sbhl_link_vars.$sbhl_link_tv$.rebind(_prev_bind_0_$16, thread);
                                                                                                                }
                                                                                                            }
                                                                                                        }
                                                                                                        dictionary_contents.do_dictionary_contents_finalize(iteration_state_$35);
                                                                                                    }
                                                                                                    finally {
                                                                                                        sbhl_link_vars.$sbhl_link_mt$.rebind(_prev_bind_0_$15, thread);
                                                                                                    }
                                                                                                }
                                                                                            }
                                                                                            dictionary_contents.do_dictionary_contents_finalize(iteration_state);
                                                                                        }
                                                                                    }
                                                                                    else {
                                                                                        sbhl_paranoia.sbhl_error((SubLObject)rkf_salient_descriptor.FIVE_INTEGER, (SubLObject)rkf_salient_descriptor.$str43$attempting_to_bind_direction_link, (SubLObject)rkf_salient_descriptor.UNPROVIDED, (SubLObject)rkf_salient_descriptor.UNPROVIDED, (SubLObject)rkf_salient_descriptor.UNPROVIDED, (SubLObject)rkf_salient_descriptor.UNPROVIDED, (SubLObject)rkf_salient_descriptor.UNPROVIDED);
                                                                                    }
                                                                                }
                                                                                else if (rkf_salient_descriptor.NIL != obsolete.cnat_p(node, (SubLObject)rkf_salient_descriptor.UNPROVIDED)) {
                                                                                    SubLObject cdolist_list_var_$37;
                                                                                    final SubLObject new_list = cdolist_list_var_$37 = ((rkf_salient_descriptor.NIL != sbhl_link_vars.sbhl_randomize_lists_p()) ? list_utilities.randomize_list(sbhl_module_utilities.get_sbhl_module_relevant_naut_link_generators(sbhl_link_vars.get_sbhl_link_direction(), sbhl_search_vars.$sbhl_tv$.getDynamicValue(thread), sbhl_module_vars.get_sbhl_module((SubLObject)rkf_salient_descriptor.UNPROVIDED))) : sbhl_module_utilities.get_sbhl_module_relevant_naut_link_generators(sbhl_link_vars.get_sbhl_link_direction(), sbhl_search_vars.$sbhl_tv$.getDynamicValue(thread), sbhl_module_vars.get_sbhl_module((SubLObject)rkf_salient_descriptor.UNPROVIDED)));
                                                                                    SubLObject generating_fn = (SubLObject)rkf_salient_descriptor.NIL;
                                                                                    generating_fn = cdolist_list_var_$37.first();
                                                                                    while (rkf_salient_descriptor.NIL != cdolist_list_var_$37) {
                                                                                        final SubLObject _prev_bind_0_$17 = sbhl_link_vars.$sbhl_link_generator$.currentBinding(thread);
                                                                                        try {
                                                                                            sbhl_link_vars.$sbhl_link_generator$.bind(generating_fn, thread);
                                                                                            final SubLObject sol2;
                                                                                            final SubLObject link_nodes2 = sol2 = Functions.funcall(generating_fn, node);
                                                                                            if (rkf_salient_descriptor.NIL != set.set_p(sol2)) {
                                                                                                final SubLObject set_contents_var2 = set.do_set_internal(sol2);
                                                                                                SubLObject basis_object2;
                                                                                                SubLObject state2;
                                                                                                SubLObject node_vars_link_node3;
                                                                                                for (basis_object2 = set_contents.do_set_contents_basis_object(set_contents_var2), state2 = (SubLObject)rkf_salient_descriptor.NIL, state2 = set_contents.do_set_contents_initial_state(basis_object2, set_contents_var2); rkf_salient_descriptor.NIL == set_contents.do_set_contents_doneP(basis_object2, state2); state2 = set_contents.do_set_contents_update_state(state2)) {
                                                                                                    node_vars_link_node3 = set_contents.do_set_contents_next(basis_object2, state2);
                                                                                                    if (rkf_salient_descriptor.NIL != set_contents.do_set_contents_element_validP(state2, node_vars_link_node3) && rkf_salient_descriptor.NIL == sbhl_marking_utilities.sbhl_search_path_termination_p(node_vars_link_node3, (SubLObject)rkf_salient_descriptor.UNPROVIDED)) {
                                                                                                        sbhl_marking_utilities.sbhl_mark_node_marked(node_vars_link_node3, (SubLObject)rkf_salient_descriptor.UNPROVIDED);
                                                                                                        deck.deck_push((SubLObject)ConsesLow.list(node_vars_link_node3, sbhl_search_vars.genl_inverse_mode_p()), recur_deck_$16);
                                                                                                    }
                                                                                                }
                                                                                            }
                                                                                            else if (sol2.isList()) {
                                                                                                SubLObject csome_list_var2 = sol2;
                                                                                                SubLObject node_vars_link_node4 = (SubLObject)rkf_salient_descriptor.NIL;
                                                                                                node_vars_link_node4 = csome_list_var2.first();
                                                                                                while (rkf_salient_descriptor.NIL != csome_list_var2) {
                                                                                                    if (rkf_salient_descriptor.NIL == sbhl_marking_utilities.sbhl_search_path_termination_p(node_vars_link_node4, (SubLObject)rkf_salient_descriptor.UNPROVIDED)) {
                                                                                                        sbhl_marking_utilities.sbhl_mark_node_marked(node_vars_link_node4, (SubLObject)rkf_salient_descriptor.UNPROVIDED);
                                                                                                        deck.deck_push((SubLObject)ConsesLow.list(node_vars_link_node4, sbhl_search_vars.genl_inverse_mode_p()), recur_deck_$16);
                                                                                                    }
                                                                                                    csome_list_var2 = csome_list_var2.rest();
                                                                                                    node_vars_link_node4 = csome_list_var2.first();
                                                                                                }
                                                                                            }
                                                                                            else {
                                                                                                Errors.error((SubLObject)rkf_salient_descriptor.$str42$_A_is_neither_SET_P_nor_LISTP_, sol2);
                                                                                            }
                                                                                        }
                                                                                        finally {
                                                                                            sbhl_link_vars.$sbhl_link_generator$.rebind(_prev_bind_0_$17, thread);
                                                                                        }
                                                                                        cdolist_list_var_$37 = cdolist_list_var_$37.rest();
                                                                                        generating_fn = cdolist_list_var_$37.first();
                                                                                    }
                                                                                }
                                                                            }
                                                                            finally {
                                                                                sbhl_search_vars.$genl_inverse_mode_p$.rebind(_prev_bind_1_$13, thread);
                                                                                sbhl_module_vars.$sbhl_module$.rebind(_prev_bind_0_$14, thread);
                                                                            }
                                                                            cdolist_list_var2 = cdolist_list_var2.rest();
                                                                            module_var = cdolist_list_var2.first();
                                                                        }
                                                                    }
                                                                    finally {
                                                                        sbhl_search_vars.$genl_inverse_mode_p$.rebind(_prev_bind_0_$13, thread);
                                                                    }
                                                                }
                                                            }
                                                            finally {
                                                                sbhl_search_vars.$genl_inverse_mode_p$.rebind(_prev_bind_2_$13, thread);
                                                                sbhl_link_vars.$sbhl_link_direction$.rebind(_prev_bind_1_$12, thread);
                                                                sbhl_search_vars.$sbhl_search_direction$.rebind(_prev_bind_0_$12, thread);
                                                            }
                                                        }
                                                        else {
                                                            sbhl_paranoia.sbhl_warn((SubLObject)rkf_salient_descriptor.TWO_INTEGER, (SubLObject)rkf_salient_descriptor.$str44$Node__a_does_not_pass_sbhl_type_t, rkf_salient_descriptor.$const39$typeGenls, sbhl_module_utilities.get_sbhl_type_test(sbhl_module_vars.get_sbhl_module((SubLObject)rkf_salient_descriptor.UNPROVIDED)), (SubLObject)rkf_salient_descriptor.UNPROVIDED, (SubLObject)rkf_salient_descriptor.UNPROVIDED, (SubLObject)rkf_salient_descriptor.UNPROVIDED);
                                                        }
                                                    }
                                                    finally {
                                                        sbhl_module_vars.$sbhl_module$.rebind(_prev_bind_4_$25, thread);
                                                        sbhl_search_vars.$genl_inverse_mode_p$.rebind(_prev_bind_3_$24, thread);
                                                        sbhl_search_vars.$sbhl_add_node_to_result_test$.rebind(_prev_bind_2_$12, thread);
                                                        sbhl_search_vars.$sbhl_search_module_type$.rebind(_prev_bind_1_$11, thread);
                                                        sbhl_search_vars.$sbhl_search_module$.rebind(_prev_bind_0_$11, thread);
                                                    }
                                                }
                                                finally {
                                                    sbhl_search_vars.$relevant_sbhl_tv_function$.rebind(_prev_bind_1_$10, thread);
                                                    sbhl_search_vars.$sbhl_tv$.rebind(_prev_bind_0_$10, thread);
                                                }
                                            }
                                            finally {
                                                final SubLObject _prev_bind_0_$18 = Threads.$is_thread_performing_cleanupP$.currentBinding(thread);
                                                try {
                                                    Threads.$is_thread_performing_cleanupP$.bind((SubLObject)rkf_salient_descriptor.T, thread);
                                                    final SubLObject _values = Values.getValuesAsVector();
                                                    sbhl_marking_vars.free_sbhl_marking_space(sbhl_marking_vars.$sbhl_space$.getDynamicValue(thread));
                                                    Values.restoreValuesFromVector(_values);
                                                }
                                                finally {
                                                    Threads.$is_thread_performing_cleanupP$.rebind(_prev_bind_0_$18, thread);
                                                }
                                            }
                                        }
                                        finally {
                                            sbhl_marking_vars.$sbhl_space$.rebind(_prev_bind_0_$9, thread);
                                        }
                                        final SubLObject node_var_$16 = rkf_salient_descriptor.$const39$typeGenls;
                                        final SubLObject deck_type_$16 = (SubLObject)rkf_salient_descriptor.$kw29$QUEUE;
                                        final SubLObject recur_deck_$17 = deck.create_deck(deck_type_$16);
                                        node_and_predicate_mode = (SubLObject)rkf_salient_descriptor.NIL;
                                        final SubLObject _prev_bind_0_$19 = sbhl_marking_vars.$sbhl_space$.currentBinding(thread);
                                        try {
                                            sbhl_marking_vars.$sbhl_space$.bind(sbhl_marking_vars.get_sbhl_marking_space(), thread);
                                            try {
                                                final SubLObject tv_var_$19 = (SubLObject)rkf_salient_descriptor.NIL;
                                                final SubLObject _prev_bind_0_$20 = sbhl_search_vars.$sbhl_tv$.currentBinding(thread);
                                                final SubLObject _prev_bind_1_$14 = sbhl_search_vars.$relevant_sbhl_tv_function$.currentBinding(thread);
                                                try {
                                                    sbhl_search_vars.$sbhl_tv$.bind((rkf_salient_descriptor.NIL != tv_var_$19) ? tv_var_$19 : sbhl_search_vars.get_sbhl_true_tv(), thread);
                                                    sbhl_search_vars.$relevant_sbhl_tv_function$.bind((SubLObject)((rkf_salient_descriptor.NIL != tv_var_$19) ? rkf_salient_descriptor.$sym31$RELEVANT_SBHL_TV_IS_GENERAL_TV : sbhl_search_vars.$relevant_sbhl_tv_function$.getDynamicValue(thread)), thread);
                                                    if (rkf_salient_descriptor.NIL != tv_var_$19 && rkf_salient_descriptor.NIL != sbhl_paranoia.sbhl_object_type_checking_p() && rkf_salient_descriptor.NIL == sbhl_search_vars.sbhl_true_tv_p(tv_var_$19)) {
                                                        final SubLObject pcase_var2 = sbhl_paranoia.$sbhl_type_error_action$.getDynamicValue(thread);
                                                        if (pcase_var2.eql((SubLObject)rkf_salient_descriptor.$kw32$ERROR)) {
                                                            sbhl_paranoia.sbhl_error((SubLObject)rkf_salient_descriptor.ONE_INTEGER, (SubLObject)rkf_salient_descriptor.$str33$_A_is_not_a__A, tv_var_$19, (SubLObject)rkf_salient_descriptor.$sym34$SBHL_TRUE_TV_P, (SubLObject)rkf_salient_descriptor.UNPROVIDED, (SubLObject)rkf_salient_descriptor.UNPROVIDED, (SubLObject)rkf_salient_descriptor.UNPROVIDED);
                                                        }
                                                        else if (pcase_var2.eql((SubLObject)rkf_salient_descriptor.$kw35$CERROR)) {
                                                            sbhl_paranoia.sbhl_cerror((SubLObject)rkf_salient_descriptor.ONE_INTEGER, (SubLObject)rkf_salient_descriptor.$str36$continue_anyway, (SubLObject)rkf_salient_descriptor.$str33$_A_is_not_a__A, tv_var_$19, (SubLObject)rkf_salient_descriptor.$sym34$SBHL_TRUE_TV_P, (SubLObject)rkf_salient_descriptor.UNPROVIDED, (SubLObject)rkf_salient_descriptor.UNPROVIDED, (SubLObject)rkf_salient_descriptor.UNPROVIDED);
                                                        }
                                                        else if (pcase_var2.eql((SubLObject)rkf_salient_descriptor.$kw37$WARN)) {
                                                            Errors.warn((SubLObject)rkf_salient_descriptor.$str33$_A_is_not_a__A, tv_var_$19, (SubLObject)rkf_salient_descriptor.$sym34$SBHL_TRUE_TV_P);
                                                        }
                                                        else {
                                                            Errors.warn((SubLObject)rkf_salient_descriptor.$str38$_A_is_not_a_valid__sbhl_type_erro, sbhl_paranoia.$sbhl_type_error_action$.getDynamicValue(thread));
                                                            Errors.cerror((SubLObject)rkf_salient_descriptor.$str36$continue_anyway, (SubLObject)rkf_salient_descriptor.$str33$_A_is_not_a__A, tv_var_$19, (SubLObject)rkf_salient_descriptor.$sym34$SBHL_TRUE_TV_P);
                                                        }
                                                    }
                                                    final SubLObject _prev_bind_0_$21 = sbhl_search_vars.$sbhl_search_module$.currentBinding(thread);
                                                    final SubLObject _prev_bind_1_$15 = sbhl_search_vars.$sbhl_search_module_type$.currentBinding(thread);
                                                    final SubLObject _prev_bind_2_$14 = sbhl_search_vars.$sbhl_add_node_to_result_test$.currentBinding(thread);
                                                    final SubLObject _prev_bind_3_$25 = sbhl_search_vars.$genl_inverse_mode_p$.currentBinding(thread);
                                                    final SubLObject _prev_bind_4_$26 = sbhl_module_vars.$sbhl_module$.currentBinding(thread);
                                                    try {
                                                        sbhl_search_vars.$sbhl_search_module$.bind(sbhl_module_vars.get_sbhl_module(rkf_salient_descriptor.$const45$genlInverse), thread);
                                                        sbhl_search_vars.$sbhl_search_module_type$.bind(sbhl_module_utilities.get_sbhl_module_type(sbhl_module_vars.get_sbhl_module(rkf_salient_descriptor.$const45$genlInverse)), thread);
                                                        sbhl_search_vars.$sbhl_add_node_to_result_test$.bind(sbhl_module_utilities.get_sbhl_add_node_to_result_test(sbhl_module_vars.get_sbhl_module(rkf_salient_descriptor.$const45$genlInverse)), thread);
                                                        sbhl_search_vars.$genl_inverse_mode_p$.bind((SubLObject)rkf_salient_descriptor.NIL, thread);
                                                        sbhl_module_vars.$sbhl_module$.bind(sbhl_module_vars.get_sbhl_module(rkf_salient_descriptor.$const45$genlInverse), thread);
                                                        if (rkf_salient_descriptor.NIL != sbhl_paranoia.suspend_sbhl_type_checkingP() || rkf_salient_descriptor.NIL != sbhl_module_utilities.apply_sbhl_module_type_test(rkf_salient_descriptor.$const39$typeGenls, sbhl_module_vars.get_sbhl_module((SubLObject)rkf_salient_descriptor.UNPROVIDED))) {
                                                            final SubLObject _prev_bind_0_$22 = sbhl_search_vars.$sbhl_search_direction$.currentBinding(thread);
                                                            final SubLObject _prev_bind_1_$16 = sbhl_link_vars.$sbhl_link_direction$.currentBinding(thread);
                                                            final SubLObject _prev_bind_2_$15 = sbhl_search_vars.$genl_inverse_mode_p$.currentBinding(thread);
                                                            try {
                                                                sbhl_search_vars.$sbhl_search_direction$.bind(sbhl_search_vars.get_sbhl_backward_search_direction(), thread);
                                                                sbhl_link_vars.$sbhl_link_direction$.bind(sbhl_module_utilities.sbhl_search_direction_to_link_direction(sbhl_search_vars.get_sbhl_backward_search_direction(), sbhl_module_vars.get_sbhl_module(rkf_salient_descriptor.$const45$genlInverse)), thread);
                                                                sbhl_search_vars.$genl_inverse_mode_p$.bind((SubLObject)rkf_salient_descriptor.NIL, thread);
                                                                sbhl_marking_utilities.sbhl_mark_node_marked(node_var_$16, (SubLObject)rkf_salient_descriptor.UNPROVIDED);
                                                                for (node_and_predicate_mode = (SubLObject)ConsesLow.list(rkf_salient_descriptor.$const39$typeGenls, sbhl_search_vars.genl_inverse_mode_p()); rkf_salient_descriptor.NIL != node_and_predicate_mode; node_and_predicate_mode = deck.deck_pop(recur_deck_$17)) {
                                                                    final SubLObject node_var_$17 = node_and_predicate_mode.first();
                                                                    final SubLObject predicate_mode = conses_high.second(node_and_predicate_mode);
                                                                    final SubLObject spec_pred = node_var_$17;
                                                                    final SubLObject _prev_bind_0_$23 = sbhl_search_vars.$genl_inverse_mode_p$.currentBinding(thread);
                                                                    try {
                                                                        sbhl_search_vars.$genl_inverse_mode_p$.bind(predicate_mode, thread);
                                                                        if (rkf_salient_descriptor.NIL != sbhl_search_utilities.apply_sbhl_add_node_test(sbhl_search_vars.get_sbhl_search_add_node_test(), node_var_$17)) {
                                                                            SubLObject cdolist_list_var = kb_mapping_utilities.pred_values(super_coll, spec_pred, (SubLObject)rkf_salient_descriptor.TWO_INTEGER, (SubLObject)rkf_salient_descriptor.ONE_INTEGER, (SubLObject)rkf_salient_descriptor.UNPROVIDED);
                                                                            SubLObject type_spec = (SubLObject)rkf_salient_descriptor.NIL;
                                                                            type_spec = cdolist_list_var.first();
                                                                            while (rkf_salient_descriptor.NIL != cdolist_list_var) {
                                                                                final SubLObject item_var = type_spec;
                                                                                if (rkf_salient_descriptor.NIL == conses_high.member(item_var, type_specs, Symbols.symbol_function((SubLObject)rkf_salient_descriptor.EQUAL), Symbols.symbol_function((SubLObject)rkf_salient_descriptor.IDENTITY))) {
                                                                                    type_specs = (SubLObject)ConsesLow.cons(item_var, type_specs);
                                                                                }
                                                                                cdolist_list_var = cdolist_list_var.rest();
                                                                                type_spec = cdolist_list_var.first();
                                                                            }
                                                                        }
                                                                        SubLObject cdolist_list_var2;
                                                                        final SubLObject accessible_modules = cdolist_list_var2 = sbhl_macros.get_sbhl_accessible_modules(sbhl_module_vars.get_sbhl_module(rkf_salient_descriptor.$const45$genlInverse));
                                                                        SubLObject module_var = (SubLObject)rkf_salient_descriptor.NIL;
                                                                        module_var = cdolist_list_var2.first();
                                                                        while (rkf_salient_descriptor.NIL != cdolist_list_var2) {
                                                                            final SubLObject _prev_bind_0_$24 = sbhl_module_vars.$sbhl_module$.currentBinding(thread);
                                                                            final SubLObject _prev_bind_1_$17 = sbhl_search_vars.$genl_inverse_mode_p$.currentBinding(thread);
                                                                            try {
                                                                                sbhl_module_vars.$sbhl_module$.bind(module_var, thread);
                                                                                sbhl_search_vars.$genl_inverse_mode_p$.bind((SubLObject)((rkf_salient_descriptor.NIL != sbhl_search_vars.flip_genl_inverse_modeP((SubLObject)rkf_salient_descriptor.UNPROVIDED, (SubLObject)rkf_salient_descriptor.UNPROVIDED)) ? SubLObjectFactory.makeBoolean(rkf_salient_descriptor.NIL == sbhl_search_vars.$genl_inverse_mode_p$.getDynamicValue(thread)) : sbhl_search_vars.$genl_inverse_mode_p$.getDynamicValue(thread)), thread);
                                                                                final SubLObject node = function_terms.naut_to_nart(node_var_$17);
                                                                                if (rkf_salient_descriptor.NIL != sbhl_link_vars.sbhl_node_object_p(node)) {
                                                                                    final SubLObject d_link = sbhl_graphs.get_sbhl_graph_link(node, sbhl_module_vars.get_sbhl_module((SubLObject)rkf_salient_descriptor.UNPROVIDED));
                                                                                    if (rkf_salient_descriptor.NIL != d_link) {
                                                                                        final SubLObject mt_links = sbhl_links.get_sbhl_mt_links(d_link, sbhl_link_vars.get_sbhl_link_direction(), sbhl_module_vars.get_sbhl_module((SubLObject)rkf_salient_descriptor.UNPROVIDED));
                                                                                        if (rkf_salient_descriptor.NIL != mt_links) {
                                                                                            SubLObject iteration_state;
                                                                                            for (iteration_state = dictionary_contents.do_dictionary_contents_state(dictionary.dictionary_contents(mt_links)); rkf_salient_descriptor.NIL == dictionary_contents.do_dictionary_contents_doneP(iteration_state); iteration_state = dictionary_contents.do_dictionary_contents_next(iteration_state)) {
                                                                                                thread.resetMultipleValues();
                                                                                                final SubLObject mt_$34 = dictionary_contents.do_dictionary_contents_key_value(iteration_state);
                                                                                                final SubLObject tv_links = thread.secondMultipleValue();
                                                                                                thread.resetMultipleValues();
                                                                                                if (rkf_salient_descriptor.NIL != mt_relevance_macros.relevant_mtP(mt_$34)) {
                                                                                                    final SubLObject _prev_bind_0_$25 = sbhl_link_vars.$sbhl_link_mt$.currentBinding(thread);
                                                                                                    try {
                                                                                                        sbhl_link_vars.$sbhl_link_mt$.bind(mt_$34, thread);
                                                                                                        SubLObject iteration_state_$36;
                                                                                                        for (iteration_state_$36 = dictionary_contents.do_dictionary_contents_state(dictionary.dictionary_contents(tv_links)); rkf_salient_descriptor.NIL == dictionary_contents.do_dictionary_contents_doneP(iteration_state_$36); iteration_state_$36 = dictionary_contents.do_dictionary_contents_next(iteration_state_$36)) {
                                                                                                            thread.resetMultipleValues();
                                                                                                            final SubLObject tv = dictionary_contents.do_dictionary_contents_key_value(iteration_state_$36);
                                                                                                            final SubLObject link_nodes = thread.secondMultipleValue();
                                                                                                            thread.resetMultipleValues();
                                                                                                            if (rkf_salient_descriptor.NIL != sbhl_search_vars.relevant_sbhl_tvP(tv)) {
                                                                                                                final SubLObject _prev_bind_0_$26 = sbhl_link_vars.$sbhl_link_tv$.currentBinding(thread);
                                                                                                                try {
                                                                                                                    sbhl_link_vars.$sbhl_link_tv$.bind(tv, thread);
                                                                                                                    final SubLObject sol = link_nodes;
                                                                                                                    if (rkf_salient_descriptor.NIL != set.set_p(sol)) {
                                                                                                                        final SubLObject set_contents_var = set.do_set_internal(sol);
                                                                                                                        SubLObject basis_object;
                                                                                                                        SubLObject state;
                                                                                                                        SubLObject node_vars_link_node;
                                                                                                                        for (basis_object = set_contents.do_set_contents_basis_object(set_contents_var), state = (SubLObject)rkf_salient_descriptor.NIL, state = set_contents.do_set_contents_initial_state(basis_object, set_contents_var); rkf_salient_descriptor.NIL == set_contents.do_set_contents_doneP(basis_object, state); state = set_contents.do_set_contents_update_state(state)) {
                                                                                                                            node_vars_link_node = set_contents.do_set_contents_next(basis_object, state);
                                                                                                                            if (rkf_salient_descriptor.NIL != set_contents.do_set_contents_element_validP(state, node_vars_link_node) && rkf_salient_descriptor.NIL == sbhl_marking_utilities.sbhl_search_path_termination_p(node_vars_link_node, (SubLObject)rkf_salient_descriptor.UNPROVIDED)) {
                                                                                                                                sbhl_marking_utilities.sbhl_mark_node_marked(node_vars_link_node, (SubLObject)rkf_salient_descriptor.UNPROVIDED);
                                                                                                                                deck.deck_push((SubLObject)ConsesLow.list(node_vars_link_node, sbhl_search_vars.genl_inverse_mode_p()), recur_deck_$17);
                                                                                                                            }
                                                                                                                        }
                                                                                                                    }
                                                                                                                    else if (sol.isList()) {
                                                                                                                        SubLObject csome_list_var = sol;
                                                                                                                        SubLObject node_vars_link_node2 = (SubLObject)rkf_salient_descriptor.NIL;
                                                                                                                        node_vars_link_node2 = csome_list_var.first();
                                                                                                                        while (rkf_salient_descriptor.NIL != csome_list_var) {
                                                                                                                            if (rkf_salient_descriptor.NIL == sbhl_marking_utilities.sbhl_search_path_termination_p(node_vars_link_node2, (SubLObject)rkf_salient_descriptor.UNPROVIDED)) {
                                                                                                                                sbhl_marking_utilities.sbhl_mark_node_marked(node_vars_link_node2, (SubLObject)rkf_salient_descriptor.UNPROVIDED);
                                                                                                                                deck.deck_push((SubLObject)ConsesLow.list(node_vars_link_node2, sbhl_search_vars.genl_inverse_mode_p()), recur_deck_$17);
                                                                                                                            }
                                                                                                                            csome_list_var = csome_list_var.rest();
                                                                                                                            node_vars_link_node2 = csome_list_var.first();
                                                                                                                        }
                                                                                                                    }
                                                                                                                    else {
                                                                                                                        Errors.error((SubLObject)rkf_salient_descriptor.$str42$_A_is_neither_SET_P_nor_LISTP_, sol);
                                                                                                                    }
                                                                                                                }
                                                                                                                finally {
                                                                                                                    sbhl_link_vars.$sbhl_link_tv$.rebind(_prev_bind_0_$26, thread);
                                                                                                                }
                                                                                                            }
                                                                                                        }
                                                                                                        dictionary_contents.do_dictionary_contents_finalize(iteration_state_$36);
                                                                                                    }
                                                                                                    finally {
                                                                                                        sbhl_link_vars.$sbhl_link_mt$.rebind(_prev_bind_0_$25, thread);
                                                                                                    }
                                                                                                }
                                                                                            }
                                                                                            dictionary_contents.do_dictionary_contents_finalize(iteration_state);
                                                                                        }
                                                                                    }
                                                                                    else {
                                                                                        sbhl_paranoia.sbhl_error((SubLObject)rkf_salient_descriptor.FIVE_INTEGER, (SubLObject)rkf_salient_descriptor.$str43$attempting_to_bind_direction_link, (SubLObject)rkf_salient_descriptor.UNPROVIDED, (SubLObject)rkf_salient_descriptor.UNPROVIDED, (SubLObject)rkf_salient_descriptor.UNPROVIDED, (SubLObject)rkf_salient_descriptor.UNPROVIDED, (SubLObject)rkf_salient_descriptor.UNPROVIDED);
                                                                                    }
                                                                                }
                                                                                else if (rkf_salient_descriptor.NIL != obsolete.cnat_p(node, (SubLObject)rkf_salient_descriptor.UNPROVIDED)) {
                                                                                    SubLObject cdolist_list_var_$38;
                                                                                    final SubLObject new_list = cdolist_list_var_$38 = ((rkf_salient_descriptor.NIL != sbhl_link_vars.sbhl_randomize_lists_p()) ? list_utilities.randomize_list(sbhl_module_utilities.get_sbhl_module_relevant_naut_link_generators(sbhl_link_vars.get_sbhl_link_direction(), sbhl_search_vars.$sbhl_tv$.getDynamicValue(thread), sbhl_module_vars.get_sbhl_module((SubLObject)rkf_salient_descriptor.UNPROVIDED))) : sbhl_module_utilities.get_sbhl_module_relevant_naut_link_generators(sbhl_link_vars.get_sbhl_link_direction(), sbhl_search_vars.$sbhl_tv$.getDynamicValue(thread), sbhl_module_vars.get_sbhl_module((SubLObject)rkf_salient_descriptor.UNPROVIDED)));
                                                                                    SubLObject generating_fn = (SubLObject)rkf_salient_descriptor.NIL;
                                                                                    generating_fn = cdolist_list_var_$38.first();
                                                                                    while (rkf_salient_descriptor.NIL != cdolist_list_var_$38) {
                                                                                        final SubLObject _prev_bind_0_$27 = sbhl_link_vars.$sbhl_link_generator$.currentBinding(thread);
                                                                                        try {
                                                                                            sbhl_link_vars.$sbhl_link_generator$.bind(generating_fn, thread);
                                                                                            final SubLObject sol2;
                                                                                            final SubLObject link_nodes2 = sol2 = Functions.funcall(generating_fn, node);
                                                                                            if (rkf_salient_descriptor.NIL != set.set_p(sol2)) {
                                                                                                final SubLObject set_contents_var2 = set.do_set_internal(sol2);
                                                                                                SubLObject basis_object2;
                                                                                                SubLObject state2;
                                                                                                SubLObject node_vars_link_node3;
                                                                                                for (basis_object2 = set_contents.do_set_contents_basis_object(set_contents_var2), state2 = (SubLObject)rkf_salient_descriptor.NIL, state2 = set_contents.do_set_contents_initial_state(basis_object2, set_contents_var2); rkf_salient_descriptor.NIL == set_contents.do_set_contents_doneP(basis_object2, state2); state2 = set_contents.do_set_contents_update_state(state2)) {
                                                                                                    node_vars_link_node3 = set_contents.do_set_contents_next(basis_object2, state2);
                                                                                                    if (rkf_salient_descriptor.NIL != set_contents.do_set_contents_element_validP(state2, node_vars_link_node3) && rkf_salient_descriptor.NIL == sbhl_marking_utilities.sbhl_search_path_termination_p(node_vars_link_node3, (SubLObject)rkf_salient_descriptor.UNPROVIDED)) {
                                                                                                        sbhl_marking_utilities.sbhl_mark_node_marked(node_vars_link_node3, (SubLObject)rkf_salient_descriptor.UNPROVIDED);
                                                                                                        deck.deck_push((SubLObject)ConsesLow.list(node_vars_link_node3, sbhl_search_vars.genl_inverse_mode_p()), recur_deck_$17);
                                                                                                    }
                                                                                                }
                                                                                            }
                                                                                            else if (sol2.isList()) {
                                                                                                SubLObject csome_list_var2 = sol2;
                                                                                                SubLObject node_vars_link_node4 = (SubLObject)rkf_salient_descriptor.NIL;
                                                                                                node_vars_link_node4 = csome_list_var2.first();
                                                                                                while (rkf_salient_descriptor.NIL != csome_list_var2) {
                                                                                                    if (rkf_salient_descriptor.NIL == sbhl_marking_utilities.sbhl_search_path_termination_p(node_vars_link_node4, (SubLObject)rkf_salient_descriptor.UNPROVIDED)) {
                                                                                                        sbhl_marking_utilities.sbhl_mark_node_marked(node_vars_link_node4, (SubLObject)rkf_salient_descriptor.UNPROVIDED);
                                                                                                        deck.deck_push((SubLObject)ConsesLow.list(node_vars_link_node4, sbhl_search_vars.genl_inverse_mode_p()), recur_deck_$17);
                                                                                                    }
                                                                                                    csome_list_var2 = csome_list_var2.rest();
                                                                                                    node_vars_link_node4 = csome_list_var2.first();
                                                                                                }
                                                                                            }
                                                                                            else {
                                                                                                Errors.error((SubLObject)rkf_salient_descriptor.$str42$_A_is_neither_SET_P_nor_LISTP_, sol2);
                                                                                            }
                                                                                        }
                                                                                        finally {
                                                                                            sbhl_link_vars.$sbhl_link_generator$.rebind(_prev_bind_0_$27, thread);
                                                                                        }
                                                                                        cdolist_list_var_$38 = cdolist_list_var_$38.rest();
                                                                                        generating_fn = cdolist_list_var_$38.first();
                                                                                    }
                                                                                }
                                                                            }
                                                                            finally {
                                                                                sbhl_search_vars.$genl_inverse_mode_p$.rebind(_prev_bind_1_$17, thread);
                                                                                sbhl_module_vars.$sbhl_module$.rebind(_prev_bind_0_$24, thread);
                                                                            }
                                                                            cdolist_list_var2 = cdolist_list_var2.rest();
                                                                            module_var = cdolist_list_var2.first();
                                                                        }
                                                                    }
                                                                    finally {
                                                                        sbhl_search_vars.$genl_inverse_mode_p$.rebind(_prev_bind_0_$23, thread);
                                                                    }
                                                                }
                                                            }
                                                            finally {
                                                                sbhl_search_vars.$genl_inverse_mode_p$.rebind(_prev_bind_2_$15, thread);
                                                                sbhl_link_vars.$sbhl_link_direction$.rebind(_prev_bind_1_$16, thread);
                                                                sbhl_search_vars.$sbhl_search_direction$.rebind(_prev_bind_0_$22, thread);
                                                            }
                                                        }
                                                        else {
                                                            sbhl_paranoia.sbhl_warn((SubLObject)rkf_salient_descriptor.TWO_INTEGER, (SubLObject)rkf_salient_descriptor.$str44$Node__a_does_not_pass_sbhl_type_t, rkf_salient_descriptor.$const39$typeGenls, sbhl_module_utilities.get_sbhl_type_test(sbhl_module_vars.get_sbhl_module((SubLObject)rkf_salient_descriptor.UNPROVIDED)), (SubLObject)rkf_salient_descriptor.UNPROVIDED, (SubLObject)rkf_salient_descriptor.UNPROVIDED, (SubLObject)rkf_salient_descriptor.UNPROVIDED);
                                                        }
                                                    }
                                                    finally {
                                                        sbhl_module_vars.$sbhl_module$.rebind(_prev_bind_4_$26, thread);
                                                        sbhl_search_vars.$genl_inverse_mode_p$.rebind(_prev_bind_3_$25, thread);
                                                        sbhl_search_vars.$sbhl_add_node_to_result_test$.rebind(_prev_bind_2_$14, thread);
                                                        sbhl_search_vars.$sbhl_search_module_type$.rebind(_prev_bind_1_$15, thread);
                                                        sbhl_search_vars.$sbhl_search_module$.rebind(_prev_bind_0_$21, thread);
                                                    }
                                                }
                                                finally {
                                                    sbhl_search_vars.$relevant_sbhl_tv_function$.rebind(_prev_bind_1_$14, thread);
                                                    sbhl_search_vars.$sbhl_tv$.rebind(_prev_bind_0_$20, thread);
                                                }
                                            }
                                            finally {
                                                final SubLObject _prev_bind_0_$28 = Threads.$is_thread_performing_cleanupP$.currentBinding(thread);
                                                try {
                                                    Threads.$is_thread_performing_cleanupP$.bind((SubLObject)rkf_salient_descriptor.T, thread);
                                                    final SubLObject _values2 = Values.getValuesAsVector();
                                                    sbhl_marking_vars.free_sbhl_marking_space(sbhl_marking_vars.$sbhl_space$.getDynamicValue(thread));
                                                    Values.restoreValuesFromVector(_values2);
                                                }
                                                finally {
                                                    Threads.$is_thread_performing_cleanupP$.rebind(_prev_bind_0_$28, thread);
                                                }
                                            }
                                        }
                                        finally {
                                            sbhl_marking_vars.$sbhl_space$.rebind(_prev_bind_0_$19, thread);
                                        }
                                        SubLObject cdolist_list_var3;
                                        final SubLObject accessible_modules2 = cdolist_list_var3 = sbhl_macros.get_sbhl_accessible_modules(sbhl_module_vars.get_sbhl_module(rkf_salient_descriptor.$const25$genls));
                                        SubLObject module_var2 = (SubLObject)rkf_salient_descriptor.NIL;
                                        module_var2 = cdolist_list_var3.first();
                                        while (rkf_salient_descriptor.NIL != cdolist_list_var3) {
                                            final SubLObject _prev_bind_0_$29 = sbhl_module_vars.$sbhl_module$.currentBinding(thread);
                                            final SubLObject _prev_bind_1_$18 = sbhl_search_vars.$genl_inverse_mode_p$.currentBinding(thread);
                                            try {
                                                sbhl_module_vars.$sbhl_module$.bind(module_var2, thread);
                                                sbhl_search_vars.$genl_inverse_mode_p$.bind((SubLObject)((rkf_salient_descriptor.NIL != sbhl_search_vars.flip_genl_inverse_modeP((SubLObject)rkf_salient_descriptor.UNPROVIDED, (SubLObject)rkf_salient_descriptor.UNPROVIDED)) ? SubLObjectFactory.makeBoolean(rkf_salient_descriptor.NIL == sbhl_search_vars.$genl_inverse_mode_p$.getDynamicValue(thread)) : sbhl_search_vars.$genl_inverse_mode_p$.getDynamicValue(thread)), thread);
                                                final SubLObject node2 = function_terms.naut_to_nart(node_var);
                                                if (rkf_salient_descriptor.NIL != sbhl_link_vars.sbhl_node_object_p(node2)) {
                                                    final SubLObject d_link2 = sbhl_graphs.get_sbhl_graph_link(node2, sbhl_module_vars.get_sbhl_module((SubLObject)rkf_salient_descriptor.UNPROVIDED));
                                                    if (rkf_salient_descriptor.NIL != d_link2) {
                                                        final SubLObject mt_links2 = sbhl_links.get_sbhl_mt_links(d_link2, sbhl_link_vars.get_sbhl_link_direction(), sbhl_module_vars.get_sbhl_module((SubLObject)rkf_salient_descriptor.UNPROVIDED));
                                                        if (rkf_salient_descriptor.NIL != mt_links2) {
                                                            SubLObject iteration_state2;
                                                            for (iteration_state2 = dictionary_contents.do_dictionary_contents_state(dictionary.dictionary_contents(mt_links2)); rkf_salient_descriptor.NIL == dictionary_contents.do_dictionary_contents_doneP(iteration_state2); iteration_state2 = dictionary_contents.do_dictionary_contents_next(iteration_state2)) {
                                                                thread.resetMultipleValues();
                                                                final SubLObject mt_$35 = dictionary_contents.do_dictionary_contents_key_value(iteration_state2);
                                                                final SubLObject tv_links2 = thread.secondMultipleValue();
                                                                thread.resetMultipleValues();
                                                                if (rkf_salient_descriptor.NIL != mt_relevance_macros.relevant_mtP(mt_$35)) {
                                                                    final SubLObject _prev_bind_0_$30 = sbhl_link_vars.$sbhl_link_mt$.currentBinding(thread);
                                                                    try {
                                                                        sbhl_link_vars.$sbhl_link_mt$.bind(mt_$35, thread);
                                                                        SubLObject iteration_state_$37;
                                                                        for (iteration_state_$37 = dictionary_contents.do_dictionary_contents_state(dictionary.dictionary_contents(tv_links2)); rkf_salient_descriptor.NIL == dictionary_contents.do_dictionary_contents_doneP(iteration_state_$37); iteration_state_$37 = dictionary_contents.do_dictionary_contents_next(iteration_state_$37)) {
                                                                            thread.resetMultipleValues();
                                                                            final SubLObject tv2 = dictionary_contents.do_dictionary_contents_key_value(iteration_state_$37);
                                                                            final SubLObject link_nodes3 = thread.secondMultipleValue();
                                                                            thread.resetMultipleValues();
                                                                            if (rkf_salient_descriptor.NIL != sbhl_search_vars.relevant_sbhl_tvP(tv2)) {
                                                                                final SubLObject _prev_bind_0_$31 = sbhl_link_vars.$sbhl_link_tv$.currentBinding(thread);
                                                                                try {
                                                                                    sbhl_link_vars.$sbhl_link_tv$.bind(tv2, thread);
                                                                                    final SubLObject sol3 = link_nodes3;
                                                                                    if (rkf_salient_descriptor.NIL != set.set_p(sol3)) {
                                                                                        final SubLObject set_contents_var3 = set.do_set_internal(sol3);
                                                                                        SubLObject basis_object3;
                                                                                        SubLObject state3;
                                                                                        SubLObject node_vars_link_node5;
                                                                                        for (basis_object3 = set_contents.do_set_contents_basis_object(set_contents_var3), state3 = (SubLObject)rkf_salient_descriptor.NIL, state3 = set_contents.do_set_contents_initial_state(basis_object3, set_contents_var3); rkf_salient_descriptor.NIL == set_contents.do_set_contents_doneP(basis_object3, state3); state3 = set_contents.do_set_contents_update_state(state3)) {
                                                                                            node_vars_link_node5 = set_contents.do_set_contents_next(basis_object3, state3);
                                                                                            if (rkf_salient_descriptor.NIL != set_contents.do_set_contents_element_validP(state3, node_vars_link_node5) && rkf_salient_descriptor.NIL == sbhl_marking_utilities.sbhl_search_path_termination_p(node_vars_link_node5, (SubLObject)rkf_salient_descriptor.UNPROVIDED)) {
                                                                                                sbhl_marking_utilities.sbhl_mark_node_marked(node_vars_link_node5, (SubLObject)rkf_salient_descriptor.UNPROVIDED);
                                                                                                deck.deck_push(node_vars_link_node5, recur_deck);
                                                                                            }
                                                                                        }
                                                                                    }
                                                                                    else if (sol3.isList()) {
                                                                                        SubLObject csome_list_var3 = sol3;
                                                                                        SubLObject node_vars_link_node6 = (SubLObject)rkf_salient_descriptor.NIL;
                                                                                        node_vars_link_node6 = csome_list_var3.first();
                                                                                        while (rkf_salient_descriptor.NIL != csome_list_var3) {
                                                                                            if (rkf_salient_descriptor.NIL == sbhl_marking_utilities.sbhl_search_path_termination_p(node_vars_link_node6, (SubLObject)rkf_salient_descriptor.UNPROVIDED)) {
                                                                                                sbhl_marking_utilities.sbhl_mark_node_marked(node_vars_link_node6, (SubLObject)rkf_salient_descriptor.UNPROVIDED);
                                                                                                deck.deck_push(node_vars_link_node6, recur_deck);
                                                                                            }
                                                                                            csome_list_var3 = csome_list_var3.rest();
                                                                                            node_vars_link_node6 = csome_list_var3.first();
                                                                                        }
                                                                                    }
                                                                                    else {
                                                                                        Errors.error((SubLObject)rkf_salient_descriptor.$str42$_A_is_neither_SET_P_nor_LISTP_, sol3);
                                                                                    }
                                                                                }
                                                                                finally {
                                                                                    sbhl_link_vars.$sbhl_link_tv$.rebind(_prev_bind_0_$31, thread);
                                                                                }
                                                                            }
                                                                        }
                                                                        dictionary_contents.do_dictionary_contents_finalize(iteration_state_$37);
                                                                    }
                                                                    finally {
                                                                        sbhl_link_vars.$sbhl_link_mt$.rebind(_prev_bind_0_$30, thread);
                                                                    }
                                                                }
                                                            }
                                                            dictionary_contents.do_dictionary_contents_finalize(iteration_state2);
                                                        }
                                                    }
                                                    else {
                                                        sbhl_paranoia.sbhl_error((SubLObject)rkf_salient_descriptor.FIVE_INTEGER, (SubLObject)rkf_salient_descriptor.$str43$attempting_to_bind_direction_link, (SubLObject)rkf_salient_descriptor.UNPROVIDED, (SubLObject)rkf_salient_descriptor.UNPROVIDED, (SubLObject)rkf_salient_descriptor.UNPROVIDED, (SubLObject)rkf_salient_descriptor.UNPROVIDED, (SubLObject)rkf_salient_descriptor.UNPROVIDED);
                                                    }
                                                }
                                                else if (rkf_salient_descriptor.NIL != obsolete.cnat_p(node2, (SubLObject)rkf_salient_descriptor.UNPROVIDED)) {
                                                    SubLObject cdolist_list_var_$39;
                                                    final SubLObject new_list2 = cdolist_list_var_$39 = ((rkf_salient_descriptor.NIL != sbhl_link_vars.sbhl_randomize_lists_p()) ? list_utilities.randomize_list(sbhl_module_utilities.get_sbhl_module_relevant_naut_link_generators(sbhl_link_vars.get_sbhl_link_direction(), sbhl_search_vars.$sbhl_tv$.getDynamicValue(thread), sbhl_module_vars.get_sbhl_module((SubLObject)rkf_salient_descriptor.UNPROVIDED))) : sbhl_module_utilities.get_sbhl_module_relevant_naut_link_generators(sbhl_link_vars.get_sbhl_link_direction(), sbhl_search_vars.$sbhl_tv$.getDynamicValue(thread), sbhl_module_vars.get_sbhl_module((SubLObject)rkf_salient_descriptor.UNPROVIDED)));
                                                    SubLObject generating_fn2 = (SubLObject)rkf_salient_descriptor.NIL;
                                                    generating_fn2 = cdolist_list_var_$39.first();
                                                    while (rkf_salient_descriptor.NIL != cdolist_list_var_$39) {
                                                        final SubLObject _prev_bind_0_$32 = sbhl_link_vars.$sbhl_link_generator$.currentBinding(thread);
                                                        try {
                                                            sbhl_link_vars.$sbhl_link_generator$.bind(generating_fn2, thread);
                                                            final SubLObject sol4;
                                                            final SubLObject link_nodes4 = sol4 = Functions.funcall(generating_fn2, node2);
                                                            if (rkf_salient_descriptor.NIL != set.set_p(sol4)) {
                                                                final SubLObject set_contents_var4 = set.do_set_internal(sol4);
                                                                SubLObject basis_object4;
                                                                SubLObject state4;
                                                                SubLObject node_vars_link_node7;
                                                                for (basis_object4 = set_contents.do_set_contents_basis_object(set_contents_var4), state4 = (SubLObject)rkf_salient_descriptor.NIL, state4 = set_contents.do_set_contents_initial_state(basis_object4, set_contents_var4); rkf_salient_descriptor.NIL == set_contents.do_set_contents_doneP(basis_object4, state4); state4 = set_contents.do_set_contents_update_state(state4)) {
                                                                    node_vars_link_node7 = set_contents.do_set_contents_next(basis_object4, state4);
                                                                    if (rkf_salient_descriptor.NIL != set_contents.do_set_contents_element_validP(state4, node_vars_link_node7) && rkf_salient_descriptor.NIL == sbhl_marking_utilities.sbhl_search_path_termination_p(node_vars_link_node7, (SubLObject)rkf_salient_descriptor.UNPROVIDED)) {
                                                                        sbhl_marking_utilities.sbhl_mark_node_marked(node_vars_link_node7, (SubLObject)rkf_salient_descriptor.UNPROVIDED);
                                                                        deck.deck_push(node_vars_link_node7, recur_deck);
                                                                    }
                                                                }
                                                            }
                                                            else if (sol4.isList()) {
                                                                SubLObject csome_list_var4 = sol4;
                                                                SubLObject node_vars_link_node8 = (SubLObject)rkf_salient_descriptor.NIL;
                                                                node_vars_link_node8 = csome_list_var4.first();
                                                                while (rkf_salient_descriptor.NIL != csome_list_var4) {
                                                                    if (rkf_salient_descriptor.NIL == sbhl_marking_utilities.sbhl_search_path_termination_p(node_vars_link_node8, (SubLObject)rkf_salient_descriptor.UNPROVIDED)) {
                                                                        sbhl_marking_utilities.sbhl_mark_node_marked(node_vars_link_node8, (SubLObject)rkf_salient_descriptor.UNPROVIDED);
                                                                        deck.deck_push(node_vars_link_node8, recur_deck);
                                                                    }
                                                                    csome_list_var4 = csome_list_var4.rest();
                                                                    node_vars_link_node8 = csome_list_var4.first();
                                                                }
                                                            }
                                                            else {
                                                                Errors.error((SubLObject)rkf_salient_descriptor.$str42$_A_is_neither_SET_P_nor_LISTP_, sol4);
                                                            }
                                                        }
                                                        finally {
                                                            sbhl_link_vars.$sbhl_link_generator$.rebind(_prev_bind_0_$32, thread);
                                                        }
                                                        cdolist_list_var_$39 = cdolist_list_var_$39.rest();
                                                        generating_fn2 = cdolist_list_var_$39.first();
                                                    }
                                                }
                                            }
                                            finally {
                                                sbhl_search_vars.$genl_inverse_mode_p$.rebind(_prev_bind_1_$18, thread);
                                                sbhl_module_vars.$sbhl_module$.rebind(_prev_bind_0_$29, thread);
                                            }
                                            cdolist_list_var3 = cdolist_list_var3.rest();
                                            module_var2 = cdolist_list_var3.first();
                                        }
                                        node_var = deck.deck_pop(recur_deck);
                                    }
                                }
                                finally {
                                    sbhl_search_vars.$genl_inverse_mode_p$.rebind(_prev_bind_2_$11, thread);
                                    sbhl_link_vars.$sbhl_link_direction$.rebind(_prev_bind_1_$9, thread);
                                    sbhl_search_vars.$sbhl_search_direction$.rebind(_prev_bind_0_$8, thread);
                                }
                            }
                            else {
                                sbhl_paranoia.sbhl_warn((SubLObject)rkf_salient_descriptor.TWO_INTEGER, (SubLObject)rkf_salient_descriptor.$str44$Node__a_does_not_pass_sbhl_type_t, collection, sbhl_module_utilities.get_sbhl_type_test(sbhl_module_vars.get_sbhl_module((SubLObject)rkf_salient_descriptor.UNPROVIDED)), (SubLObject)rkf_salient_descriptor.UNPROVIDED, (SubLObject)rkf_salient_descriptor.UNPROVIDED, (SubLObject)rkf_salient_descriptor.UNPROVIDED);
                            }
                        }
                        finally {
                            sbhl_module_vars.$sbhl_module$.rebind(_prev_bind_5, thread);
                            sbhl_search_vars.$genl_inverse_mode_p$.rebind(_prev_bind_4, thread);
                            sbhl_search_vars.$sbhl_add_node_to_result_test$.rebind(_prev_bind_2_$10, thread);
                            sbhl_search_vars.$sbhl_search_module_type$.rebind(_prev_bind_1_$8, thread);
                            sbhl_search_vars.$sbhl_search_module$.rebind(_prev_bind_0_$7, thread);
                        }
                    }
                    finally {
                        sbhl_search_vars.$relevant_sbhl_tv_function$.rebind(_prev_bind_1_$7, thread);
                        sbhl_search_vars.$sbhl_tv$.rebind(_prev_bind_0_$6, thread);
                    }
                }
                finally {
                    final SubLObject _prev_bind_0_$33 = Threads.$is_thread_performing_cleanupP$.currentBinding(thread);
                    try {
                        Threads.$is_thread_performing_cleanupP$.bind((SubLObject)rkf_salient_descriptor.T, thread);
                        final SubLObject _values3 = Values.getValuesAsVector();
                        sbhl_marking_vars.free_sbhl_marking_space(sbhl_marking_vars.$sbhl_space$.getDynamicValue(thread));
                        Values.restoreValuesFromVector(_values3);
                    }
                    finally {
                        Threads.$is_thread_performing_cleanupP$.rebind(_prev_bind_0_$33, thread);
                    }
                }
            }
            finally {
                sbhl_marking_vars.$sbhl_space$.rebind(_prev_bind_0_$5, thread);
            }
        }
        finally {
            mt_relevance_macros.$relevant_mts$.rebind(_prev_bind_3, thread);
            mt_relevance_macros.$relevant_mt_function$.rebind(_prev_bind_2, thread);
            mt_relevance_macros.$mt$.rebind(_prev_bind_0, thread);
        }
        return type_specs;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/rkf-salient-descriptor.lisp", position = 11837L)
    public static SubLObject rkf_salient_descriptor_type_specs(final SubLObject collection, final SubLObject mt) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject v_memoization_state = memoization_state.$memoization_state$.getDynamicValue(thread);
        SubLObject caching_state = (SubLObject)rkf_salient_descriptor.NIL;
        if (rkf_salient_descriptor.NIL == v_memoization_state) {
            return rkf_salient_descriptor_type_specs_internal(collection, mt);
        }
        caching_state = memoization_state.memoization_state_lookup(v_memoization_state, (SubLObject)rkf_salient_descriptor.$sym27$RKF_SALIENT_DESCRIPTOR_TYPE_SPECS, (SubLObject)rkf_salient_descriptor.UNPROVIDED);
        if (rkf_salient_descriptor.NIL == caching_state) {
            caching_state = memoization_state.create_caching_state(memoization_state.memoization_state_lock(v_memoization_state), (SubLObject)rkf_salient_descriptor.$sym27$RKF_SALIENT_DESCRIPTOR_TYPE_SPECS, (SubLObject)rkf_salient_descriptor.TWO_INTEGER, (SubLObject)rkf_salient_descriptor.NIL, (SubLObject)rkf_salient_descriptor.EQUAL, (SubLObject)rkf_salient_descriptor.UNPROVIDED);
            memoization_state.memoization_state_put(v_memoization_state, (SubLObject)rkf_salient_descriptor.$sym27$RKF_SALIENT_DESCRIPTOR_TYPE_SPECS, caching_state);
        }
        final SubLObject sxhash = memoization_state.sxhash_calc_2(collection, mt);
        final SubLObject collisions = memoization_state.caching_state_lookup(caching_state, sxhash, (SubLObject)rkf_salient_descriptor.UNPROVIDED);
        if (!collisions.eql(memoization_state.$memoized_item_not_found$.getGlobalValue())) {
            SubLObject cdolist_list_var = collisions;
            SubLObject collision = (SubLObject)rkf_salient_descriptor.NIL;
            collision = cdolist_list_var.first();
            while (rkf_salient_descriptor.NIL != cdolist_list_var) {
                SubLObject cached_args = collision.first();
                final SubLObject results2 = conses_high.second(collision);
                if (collection.equal(cached_args.first())) {
                    cached_args = cached_args.rest();
                    if (rkf_salient_descriptor.NIL != cached_args && rkf_salient_descriptor.NIL == cached_args.rest() && mt.equal(cached_args.first())) {
                        return memoization_state.caching_results(results2);
                    }
                }
                cdolist_list_var = cdolist_list_var.rest();
                collision = cdolist_list_var.first();
            }
        }
        final SubLObject results3 = Values.arg2(thread.resetMultipleValues(), (SubLObject)Values.multiple_value_list(rkf_salient_descriptor_type_specs_internal(collection, mt)));
        memoization_state.caching_state_enter_multi_key_n(caching_state, sxhash, collisions, results3, (SubLObject)ConsesLow.list(collection, mt));
        return memoization_state.caching_results(results3);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/rkf-salient-descriptor.lisp", position = 12536L)
    public static SubLObject reusing_rkf_sd_problem_store(final SubLObject macroform, final SubLObject environment) {
        final SubLObject datum = macroform.rest();
        final SubLObject body;
        final SubLObject current = body = datum;
        final SubLObject reuse_existingP = (SubLObject)rkf_salient_descriptor.$sym46$REUSE_EXISTING_;
        final SubLObject store = (SubLObject)rkf_salient_descriptor.$sym47$STORE;
        return (SubLObject)ConsesLow.list((SubLObject)rkf_salient_descriptor.$sym48$CLET, (SubLObject)ConsesLow.list(reader.bq_cons(reuse_existingP, (SubLObject)rkf_salient_descriptor.$list49), (SubLObject)rkf_salient_descriptor.$list50, reader.bq_cons(store, (SubLObject)rkf_salient_descriptor.$list51)), (SubLObject)ConsesLow.list((SubLObject)rkf_salient_descriptor.$sym52$CUNWIND_PROTECT, reader.bq_cons((SubLObject)rkf_salient_descriptor.$sym53$PROGN, ConsesLow.append(body, (SubLObject)rkf_salient_descriptor.NIL)), (SubLObject)ConsesLow.list((SubLObject)rkf_salient_descriptor.$sym54$PUNLESS, reuse_existingP, (SubLObject)ConsesLow.list((SubLObject)rkf_salient_descriptor.$sym55$RKF_SD_FREE_PROBLEM_STORE, store))));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/rkf-salient-descriptor.lisp", position = 12939L)
    public static SubLObject rkf_sd_problem_store_okP(final SubLObject problem_store) {
        return (SubLObject)SubLObjectFactory.makeBoolean(rkf_salient_descriptor.NIL != inference_datastructures_problem_store.valid_problem_store_p(problem_store) && rkf_salient_descriptor.NIL != rkf_sd_problem_store_checkpoint_currentP(problem_store));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/rkf-salient-descriptor.lisp", position = 13116L)
    public static SubLObject rkf_sd_problem_store_checkpoint_currentP(final SubLObject problem_store) {
        final SubLObject checkpoint = rkf_sd_problem_store_checkpoint(problem_store);
        final SubLObject currentP = (SubLObject)SubLObjectFactory.makeBoolean(rkf_salient_descriptor.NIL != kb_utilities.theory_checkpoint_p(checkpoint) && rkf_salient_descriptor.NIL != kb_utilities.theory_checkpoint_currentP(checkpoint));
        return currentP;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/rkf-salient-descriptor.lisp", position = 13379L)
    public static SubLObject rkf_sd_problem_store_checkpoint(final SubLObject store) {
        return dictionary.dictionary_lookup(rkf_salient_descriptor.$rkf_sd_problem_store_checkpoints$.getGlobalValue(), store, (SubLObject)rkf_salient_descriptor.$kw56$NOT_FOUND);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/rkf-salient-descriptor.lisp", position = 13575L)
    public static SubLObject rkf_sd_find_or_make_problem_store() {
        final SubLThread thread = SubLProcess.currentSubLThread();
        return (SubLObject)((rkf_salient_descriptor.NIL != rkf_salient_descriptor.$rkf_sd_reuse_problem_storeP$.getDynamicValue(thread)) ? ((rkf_salient_descriptor.NIL != rkf_sd_problem_store_okP(rkf_salient_descriptor.$rkf_sd_problem_store$.getDynamicValue(thread))) ? rkf_salient_descriptor.$rkf_sd_problem_store$.getDynamicValue(thread) : rkf_sd_make_problem_store()) : rkf_salient_descriptor.NIL);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/rkf-salient-descriptor.lisp", position = 13801L)
    public static SubLObject rkf_sd_make_problem_store() {
        final SubLThread thread = SubLProcess.currentSubLThread();
        if (rkf_salient_descriptor.NIL != inference_datastructures_problem_store.problem_store_p(rkf_salient_descriptor.$rkf_sd_problem_store$.getDynamicValue(thread))) {
            inference_datastructures_problem_store.destroy_problem_store(rkf_salient_descriptor.$rkf_sd_problem_store$.getDynamicValue(thread));
        }
        final SubLObject problem_store = inference_datastructures_problem_store.new_problem_store(rkf_sd_known_problem_store_properties());
        dictionary.dictionary_enter(rkf_salient_descriptor.$rkf_sd_problem_store_checkpoints$.getGlobalValue(), problem_store, kb_utilities.new_theory_checkpoint());
        return problem_store;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/rkf-salient-descriptor.lisp", position = 14159L)
    public static SubLObject rkf_sd_free_problem_store(final SubLObject store) {
        dictionary.dictionary_remove(rkf_salient_descriptor.$rkf_sd_problem_store_checkpoints$.getGlobalValue(), store);
        inference_datastructures_problem_store.destroy_problem_store(store);
        return store;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/rkf-salient-descriptor.lisp", position = 14322L)
    public static SubLObject rkf_induced_salient_descriptor_common_properties(final SubLObject induction_basis_properties, final SubLObject mt, SubLObject maximally_generalP, SubLObject rule_type) {
        if (maximally_generalP == rkf_salient_descriptor.UNPROVIDED) {
            maximally_generalP = (SubLObject)rkf_salient_descriptor.NIL;
        }
        if (rule_type == rkf_salient_descriptor.UNPROVIDED) {
            rule_type = (SubLObject)rkf_salient_descriptor.$kw57$ANY;
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject common_properties = (SubLObject)rkf_salient_descriptor.NIL;
        SubLObject basis_properties = (SubLObject)rkf_salient_descriptor.NIL;
        SubLObject rule_specs = (SubLObject)rkf_salient_descriptor.NIL;
        final SubLObject pcase_var = rule_type;
        if (pcase_var.eql((SubLObject)rkf_salient_descriptor.$kw58$BIN_PRED)) {
            thread.resetMultipleValues();
            final SubLObject common_properties_$75 = rkf_induced_salient_descriptor_bin_pred_properties(induction_basis_properties, mt, maximally_generalP, (SubLObject)rkf_salient_descriptor.$kw59$ALL);
            final SubLObject basis_properties_$76 = thread.secondMultipleValue();
            final SubLObject rule_specs_$77 = thread.thirdMultipleValue();
            thread.resetMultipleValues();
            common_properties = common_properties_$75;
            basis_properties = basis_properties_$76;
            rule_specs = rule_specs_$77;
        }
        else if (pcase_var.eql((SubLObject)rkf_salient_descriptor.$kw60$META_ISA)) {
            thread.resetMultipleValues();
            final SubLObject common_properties_$76 = rkf_induced_salient_descriptor_meta_isa_properties(induction_basis_properties, mt, maximally_generalP);
            final SubLObject basis_properties_$77 = thread.secondMultipleValue();
            final SubLObject rule_specs_$78 = thread.thirdMultipleValue();
            thread.resetMultipleValues();
            common_properties = common_properties_$76;
            basis_properties = basis_properties_$77;
            rule_specs = rule_specs_$78;
        }
        else if (pcase_var.eql((SubLObject)rkf_salient_descriptor.$kw57$ANY)) {
            thread.resetMultipleValues();
            final SubLObject common_properties_$77 = rkf_induced_salient_descriptor_common_properties_int(induction_basis_properties, mt, maximally_generalP);
            final SubLObject basis_properties_$78 = thread.secondMultipleValue();
            thread.resetMultipleValues();
            common_properties = common_properties_$77;
            basis_properties = basis_properties_$78;
        }
        else {
            Errors.warn((SubLObject)rkf_salient_descriptor.$str61$Can_t_identify__S_common_properti);
        }
        return Values.values(common_properties, basis_properties, rule_specs);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/rkf-salient-descriptor.lisp", position = 15901L)
    public static SubLObject rkf_induced_salient_descriptor_common_properties_int(final SubLObject known_properties, final SubLObject mt, final SubLObject maximally_generalP) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject v_properties = (SubLObject)rkf_salient_descriptor.NIL;
        SubLObject basis_properties = (SubLObject)rkf_salient_descriptor.NIL;
        thread.resetMultipleValues();
        final SubLObject bin_pred_properties = rkf_induced_salient_descriptor_bin_pred_properties(known_properties, mt, maximally_generalP, (SubLObject)rkf_salient_descriptor.$kw59$ALL);
        final SubLObject bin_pred_basis_properties = thread.secondMultipleValue();
        thread.resetMultipleValues();
        v_properties = ConsesLow.append(v_properties, bin_pred_properties);
        basis_properties = ConsesLow.append(basis_properties, bin_pred_basis_properties);
        thread.resetMultipleValues();
        final SubLObject meta_isa_properties = rkf_induced_salient_descriptor_meta_isa_properties(known_properties, mt, maximally_generalP);
        final SubLObject meta_isa_basis_properties = thread.secondMultipleValue();
        thread.resetMultipleValues();
        v_properties = ConsesLow.append(v_properties, meta_isa_properties);
        basis_properties = ConsesLow.append(basis_properties, meta_isa_basis_properties);
        return Values.values(v_properties, basis_properties);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/rkf-salient-descriptor.lisp", position = 16867L)
    public static SubLObject rkf_induced_salient_descriptor_bin_pred_properties(final SubLObject basis_properties, final SubLObject mt, final SubLObject maximally_generalP, final SubLObject strength) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject enoughP = (SubLObject)rkf_salient_descriptor.NIL;
        SubLObject bin_pred_info = (SubLObject)rkf_salient_descriptor.NIL;
        final SubLObject generality_cutoff = (SubLObject)rkf_salient_descriptor.$int62$25000;
        final SubLObject reuse_existingP = rkf_sd_problem_store_okP(rkf_salient_descriptor.$rkf_sd_problem_store$.getDynamicValue(thread));
        final SubLObject _prev_bind_0 = rkf_salient_descriptor.$rkf_sd_problem_store$.currentBinding(thread);
        try {
            rkf_salient_descriptor.$rkf_sd_problem_store$.bind(rkf_sd_find_or_make_problem_store(), thread);
            final SubLObject store = rkf_salient_descriptor.$rkf_sd_problem_store$.getDynamicValue(thread);
            try {
                if (rkf_salient_descriptor.NIL == enoughP) {
                    SubLObject csome_list_var = basis_properties;
                    SubLObject basis_property = (SubLObject)rkf_salient_descriptor.NIL;
                    basis_property = csome_list_var.first();
                    while (rkf_salient_descriptor.NIL == enoughP && rkf_salient_descriptor.NIL != csome_list_var) {
                        SubLObject cdolist_list_var = rkf_induced_salient_descriptor_bin_pred_info(basis_property, mt, generality_cutoff, strength);
                        SubLObject new_info = (SubLObject)rkf_salient_descriptor.NIL;
                        new_info = cdolist_list_var.first();
                        while (rkf_salient_descriptor.NIL != cdolist_list_var) {
                            SubLObject current;
                            final SubLObject datum = current = new_info;
                            SubLObject slot = (SubLObject)rkf_salient_descriptor.NIL;
                            SubLObject superior = (SubLObject)rkf_salient_descriptor.NIL;
                            SubLObject isa_or_genls = (SubLObject)rkf_salient_descriptor.NIL;
                            cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)rkf_salient_descriptor.$list63);
                            slot = current.first();
                            current = current.rest();
                            cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)rkf_salient_descriptor.$list63);
                            superior = current.first();
                            current = current.rest();
                            cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)rkf_salient_descriptor.$list63);
                            isa_or_genls = current.first();
                            current = current.rest();
                            if (rkf_salient_descriptor.NIL == current) {
                                if (rkf_salient_descriptor.NIL == subl_promotions.memberP(slot, bin_pred_info, Symbols.symbol_function((SubLObject)rkf_salient_descriptor.EQUAL), Symbols.symbol_function((SubLObject)rkf_salient_descriptor.$sym64$FIRST))) {
                                    bin_pred_info = (SubLObject)ConsesLow.cons((SubLObject)ConsesLow.list(slot, superior, isa_or_genls), bin_pred_info);
                                }
                            }
                            else {
                                cdestructuring_bind.cdestructuring_bind_error(datum, (SubLObject)rkf_salient_descriptor.$list63);
                            }
                            cdolist_list_var = cdolist_list_var.rest();
                            new_info = cdolist_list_var.first();
                        }
                        enoughP = (SubLObject)SubLObjectFactory.makeBoolean(rkf_salient_descriptor.$rkf_salient_descriptor_number_cutoff$.getDynamicValue(thread).isNumber() && rkf_salient_descriptor.NIL != list_utilities.lengthGE(bin_pred_info, rkf_salient_descriptor.$rkf_salient_descriptor_number_cutoff$.getDynamicValue(thread), (SubLObject)rkf_salient_descriptor.UNPROVIDED));
                        csome_list_var = csome_list_var.rest();
                        basis_property = csome_list_var.first();
                    }
                }
            }
            finally {
                final SubLObject _prev_bind_0_$83 = Threads.$is_thread_performing_cleanupP$.currentBinding(thread);
                try {
                    Threads.$is_thread_performing_cleanupP$.bind((SubLObject)rkf_salient_descriptor.T, thread);
                    final SubLObject _values = Values.getValuesAsVector();
                    if (rkf_salient_descriptor.NIL == reuse_existingP) {
                        rkf_sd_free_problem_store(store);
                    }
                    Values.restoreValuesFromVector(_values);
                }
                finally {
                    Threads.$is_thread_performing_cleanupP$.rebind(_prev_bind_0_$83, thread);
                }
            }
        }
        finally {
            rkf_salient_descriptor.$rkf_sd_problem_store$.rebind(_prev_bind_0, thread);
        }
        thread.resetMultipleValues();
        final SubLObject v_properties = rkf_sd_properties_from_bin_pred_info(rkf_salient_descriptor.$rkf_salient_descriptor_number_cutoff$.getDynamicValue(thread).isNumber() ? list_utilities.first_n(rkf_salient_descriptor.$rkf_salient_descriptor_number_cutoff$.getDynamicValue(thread), bin_pred_info) : bin_pred_info);
        final SubLObject justifications = thread.secondMultipleValue();
        final SubLObject rule_specs = thread.thirdMultipleValue();
        thread.resetMultipleValues();
        return Values.values(v_properties, justifications, rule_specs);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/rkf-salient-descriptor.lisp", position = 17950L)
    public static SubLObject rkf_induced_salient_descriptor_bin_pred_info(final SubLObject basis_property, final SubLObject mt, final SubLObject generality_cutoff, final SubLObject strength) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject bin_pred_info = (SubLObject)rkf_salient_descriptor.NIL;
        thread.resetMultipleValues();
        final SubLObject superior = rkf_sd_deconstruct_basis_property(basis_property);
        final SubLObject isa_or_genls = thread.secondMultipleValue();
        thread.resetMultipleValues();
        if (rkf_salient_descriptor.NIL != forts.fort_p(superior) && cardinality_estimates.generality_estimate(superior).numL(generality_cutoff)) {
            SubLObject cdolist_list_var;
            final SubLObject slot_counts = cdolist_list_var = rkf_induced_salient_descriptor_binary_preds(mt, superior, isa_or_genls, (SubLObject)rkf_salient_descriptor.$int65$25, strength, (SubLObject)rkf_salient_descriptor.UNPROVIDED);
            SubLObject slot_count = (SubLObject)rkf_salient_descriptor.NIL;
            slot_count = cdolist_list_var.first();
            while (rkf_salient_descriptor.NIL != cdolist_list_var) {
                SubLObject current;
                final SubLObject datum = current = slot_count;
                SubLObject slot = (SubLObject)rkf_salient_descriptor.NIL;
                SubLObject count = (SubLObject)rkf_salient_descriptor.NIL;
                cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)rkf_salient_descriptor.$list66);
                slot = current.first();
                current = (count = current.rest());
                if (rkf_salient_descriptor.NIL == subl_promotions.memberP(slot, bin_pred_info, Symbols.symbol_function((SubLObject)rkf_salient_descriptor.EQUAL), Symbols.symbol_function((SubLObject)rkf_salient_descriptor.$sym64$FIRST))) {
                    bin_pred_info = (SubLObject)ConsesLow.cons((SubLObject)ConsesLow.list(slot, superior, isa_or_genls), bin_pred_info);
                }
                cdolist_list_var = cdolist_list_var.rest();
                slot_count = cdolist_list_var.first();
            }
        }
        return bin_pred_info;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/rkf-salient-descriptor.lisp", position = 18748L)
    public static SubLObject rkf_induced_salient_descriptor_meta_isa_properties(final SubLObject basis_properties, final SubLObject mt, final SubLObject maximally_generalP) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject enoughP = (SubLObject)rkf_salient_descriptor.NIL;
        SubLObject meta_isa_info = (SubLObject)rkf_salient_descriptor.NIL;
        final SubLObject generality_cutoff = (SubLObject)rkf_salient_descriptor.$int62$25000;
        final SubLObject reuse_existingP = rkf_sd_problem_store_okP(rkf_salient_descriptor.$rkf_sd_problem_store$.getDynamicValue(thread));
        final SubLObject _prev_bind_0 = rkf_salient_descriptor.$rkf_sd_problem_store$.currentBinding(thread);
        try {
            rkf_salient_descriptor.$rkf_sd_problem_store$.bind(rkf_sd_find_or_make_problem_store(), thread);
            final SubLObject store = rkf_salient_descriptor.$rkf_sd_problem_store$.getDynamicValue(thread);
            try {
                final SubLObject known_meta_isas = rkf_known_meta_isas_from_basis_properties(basis_properties, mt);
                if (rkf_salient_descriptor.NIL == enoughP) {
                    SubLObject csome_list_var = basis_properties;
                    SubLObject basis_property = (SubLObject)rkf_salient_descriptor.NIL;
                    basis_property = csome_list_var.first();
                    while (rkf_salient_descriptor.NIL == enoughP && rkf_salient_descriptor.NIL != csome_list_var) {
                        SubLObject cdolist_list_var = rkf_induced_salient_descriptor_meta_isa_info(basis_property, mt, generality_cutoff);
                        SubLObject new_info = (SubLObject)rkf_salient_descriptor.NIL;
                        new_info = cdolist_list_var.first();
                        while (rkf_salient_descriptor.NIL != cdolist_list_var) {
                            SubLObject current;
                            final SubLObject datum = current = new_info;
                            SubLObject collection_type = (SubLObject)rkf_salient_descriptor.NIL;
                            SubLObject superior = (SubLObject)rkf_salient_descriptor.NIL;
                            SubLObject isa_or_genls = (SubLObject)rkf_salient_descriptor.NIL;
                            cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)rkf_salient_descriptor.$list67);
                            collection_type = current.first();
                            current = current.rest();
                            cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)rkf_salient_descriptor.$list67);
                            superior = current.first();
                            current = current.rest();
                            cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)rkf_salient_descriptor.$list67);
                            isa_or_genls = current.first();
                            current = current.rest();
                            if (rkf_salient_descriptor.NIL == current) {
                                if (rkf_salient_descriptor.NIL == subl_promotions.memberP(collection_type, meta_isa_info, Symbols.symbol_function((SubLObject)rkf_salient_descriptor.EQUAL), Symbols.symbol_function((SubLObject)rkf_salient_descriptor.$sym64$FIRST)) && rkf_salient_descriptor.NIL == conses_high.member(collection_type, known_meta_isas, Symbols.symbol_function((SubLObject)rkf_salient_descriptor.EQUAL), (SubLObject)rkf_salient_descriptor.UNPROVIDED)) {
                                    meta_isa_info = (SubLObject)ConsesLow.cons((SubLObject)ConsesLow.list(collection_type, superior, isa_or_genls), meta_isa_info);
                                }
                            }
                            else {
                                cdestructuring_bind.cdestructuring_bind_error(datum, (SubLObject)rkf_salient_descriptor.$list67);
                            }
                            cdolist_list_var = cdolist_list_var.rest();
                            new_info = cdolist_list_var.first();
                        }
                        enoughP = (SubLObject)SubLObjectFactory.makeBoolean(rkf_salient_descriptor.$rkf_salient_descriptor_number_cutoff$.getDynamicValue(thread).isNumber() && rkf_salient_descriptor.NIL != list_utilities.lengthGE(meta_isa_info, rkf_salient_descriptor.$rkf_salient_descriptor_number_cutoff$.getDynamicValue(thread), (SubLObject)rkf_salient_descriptor.UNPROVIDED));
                        csome_list_var = csome_list_var.rest();
                        basis_property = csome_list_var.first();
                    }
                }
            }
            finally {
                final SubLObject _prev_bind_0_$84 = Threads.$is_thread_performing_cleanupP$.currentBinding(thread);
                try {
                    Threads.$is_thread_performing_cleanupP$.bind((SubLObject)rkf_salient_descriptor.T, thread);
                    final SubLObject _values = Values.getValuesAsVector();
                    if (rkf_salient_descriptor.NIL == reuse_existingP) {
                        rkf_sd_free_problem_store(store);
                    }
                    Values.restoreValuesFromVector(_values);
                }
                finally {
                    Threads.$is_thread_performing_cleanupP$.rebind(_prev_bind_0_$84, thread);
                }
            }
        }
        finally {
            rkf_salient_descriptor.$rkf_sd_problem_store$.rebind(_prev_bind_0, thread);
        }
        thread.resetMultipleValues();
        final SubLObject v_properties = rkf_sd_properties_from_meta_isa_info(rkf_salient_descriptor.$rkf_salient_descriptor_number_cutoff$.getDynamicValue(thread).isNumber() ? list_utilities.first_n(rkf_salient_descriptor.$rkf_salient_descriptor_number_cutoff$.getDynamicValue(thread), meta_isa_info) : meta_isa_info);
        final SubLObject justifications = thread.secondMultipleValue();
        final SubLObject rule_specs = thread.thirdMultipleValue();
        thread.resetMultipleValues();
        return Values.values(v_properties, justifications, rule_specs);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/rkf-salient-descriptor.lisp", position = 20007L)
    public static SubLObject rkf_known_meta_isas_from_basis_properties(final SubLObject basis_properties, final SubLObject mt) {
        SubLObject known_meta_isas = (SubLObject)rkf_salient_descriptor.NIL;
        SubLObject cdolist_list_var = basis_properties;
        SubLObject basis_property = (SubLObject)rkf_salient_descriptor.NIL;
        basis_property = cdolist_list_var.first();
        while (rkf_salient_descriptor.NIL != cdolist_list_var) {
            SubLObject cdolist_list_var_$85 = rkf_known_meta_isas_from_basis_property(basis_property, mt);
            SubLObject known_meta_isa = (SubLObject)rkf_salient_descriptor.NIL;
            known_meta_isa = cdolist_list_var_$85.first();
            while (rkf_salient_descriptor.NIL != cdolist_list_var_$85) {
                final SubLObject item_var = known_meta_isa;
                if (rkf_salient_descriptor.NIL == conses_high.member(item_var, known_meta_isas, Symbols.symbol_function((SubLObject)rkf_salient_descriptor.EQL), Symbols.symbol_function((SubLObject)rkf_salient_descriptor.IDENTITY))) {
                    known_meta_isas = (SubLObject)ConsesLow.cons(item_var, known_meta_isas);
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
    public static SubLObject rkf_known_meta_isas_from_basis_property(final SubLObject basis_property, final SubLObject mt) {
        if (rkf_salient_descriptor.NIL != formula_pattern_match.formula_matches_pattern(basis_property, (SubLObject)rkf_salient_descriptor.$list68)) {
            final SubLObject lowest_known_isa = cycl_utilities.formula_arg2(basis_property, (SubLObject)rkf_salient_descriptor.UNPROVIDED);
            final SubLObject all_known_isas = genls.all_genls(lowest_known_isa, mt, (SubLObject)rkf_salient_descriptor.UNPROVIDED);
            SubLObject known_meta_isas = (SubLObject)rkf_salient_descriptor.NIL;
            SubLObject cdolist_list_var = all_known_isas;
            SubLObject known_isa = (SubLObject)rkf_salient_descriptor.NIL;
            known_isa = cdolist_list_var.first();
            while (rkf_salient_descriptor.NIL != cdolist_list_var) {
                SubLObject cdolist_list_var_$86 = isa.all_isa(known_isa, mt, (SubLObject)rkf_salient_descriptor.UNPROVIDED);
                SubLObject known_meta_isa = (SubLObject)rkf_salient_descriptor.NIL;
                known_meta_isa = cdolist_list_var_$86.first();
                while (rkf_salient_descriptor.NIL != cdolist_list_var_$86) {
                    final SubLObject item_var = known_meta_isa;
                    if (rkf_salient_descriptor.NIL == conses_high.member(item_var, known_meta_isas, Symbols.symbol_function((SubLObject)rkf_salient_descriptor.EQL), Symbols.symbol_function((SubLObject)rkf_salient_descriptor.IDENTITY))) {
                        known_meta_isas = (SubLObject)ConsesLow.cons(item_var, known_meta_isas);
                    }
                    cdolist_list_var_$86 = cdolist_list_var_$86.rest();
                    known_meta_isa = cdolist_list_var_$86.first();
                }
                cdolist_list_var = cdolist_list_var.rest();
                known_isa = cdolist_list_var.first();
            }
            return known_meta_isas;
        }
        final SubLObject v_properties = (SubLObject)ConsesLow.list((SubLObject)rkf_salient_descriptor.$kw69$PROBLEM_STORE, rkf_sd_find_or_make_problem_store(), (SubLObject)rkf_salient_descriptor.$kw70$ANSWER_LANGUAGE, (SubLObject)rkf_salient_descriptor.$kw71$HL, (SubLObject)rkf_salient_descriptor.$kw72$CONDITIONAL_SENTENCE_, (SubLObject)rkf_salient_descriptor.T);
        final SubLObject meta_isa_var = (SubLObject)rkf_salient_descriptor.$sym73$_COLLECTION_TYPE;
        final SubLObject instance_var = (SubLObject)rkf_salient_descriptor.$sym74$_INSTANCE;
        final SubLObject basis_sentence = properties.property_to_sentence(basis_property, instance_var);
        final SubLObject query_sentence = (SubLObject)ConsesLow.list(rkf_salient_descriptor.$const75$implies, basis_sentence, (SubLObject)ConsesLow.list(rkf_salient_descriptor.$const76$thereExists, (SubLObject)rkf_salient_descriptor.$sym77$_TYPE, (SubLObject)ConsesLow.list(rkf_salient_descriptor.$const78$and, (SubLObject)ConsesLow.list(rkf_salient_descriptor.$const24$isa, (SubLObject)rkf_salient_descriptor.$sym77$_TYPE, meta_isa_var), (SubLObject)ConsesLow.listS(rkf_salient_descriptor.$const24$isa, instance_var, (SubLObject)rkf_salient_descriptor.$list79))));
        final SubLObject meta_isas = ask_utilities.query_variable(meta_isa_var, query_sentence, mt, v_properties);
        return meta_isas;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/rkf-salient-descriptor.lisp", position = 21612L)
    public static SubLObject rkf_induced_salient_descriptor_meta_isa_info(final SubLObject basis_property, final SubLObject mt, final SubLObject generality_cutoff) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject meta_isa_info = (SubLObject)rkf_salient_descriptor.NIL;
        thread.resetMultipleValues();
        final SubLObject superior = rkf_sd_deconstruct_basis_property(basis_property);
        final SubLObject isa_or_genls = thread.secondMultipleValue();
        thread.resetMultipleValues();
        if (rkf_salient_descriptor.NIL != forts.fort_p(superior) && cardinality_estimates.generality_estimate(superior).numL(generality_cutoff)) {
            SubLObject cdolist_list_var;
            final SubLObject slot_counts = cdolist_list_var = rkf_induced_salient_descriptor_meta_isas(mt, superior, isa_or_genls, (SubLObject)rkf_salient_descriptor.UNPROVIDED, (SubLObject)rkf_salient_descriptor.UNPROVIDED);
            SubLObject slot_count = (SubLObject)rkf_salient_descriptor.NIL;
            slot_count = cdolist_list_var.first();
            while (rkf_salient_descriptor.NIL != cdolist_list_var) {
                SubLObject current;
                final SubLObject datum = current = slot_count;
                SubLObject slot = (SubLObject)rkf_salient_descriptor.NIL;
                SubLObject count = (SubLObject)rkf_salient_descriptor.NIL;
                cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)rkf_salient_descriptor.$list66);
                slot = current.first();
                current = (count = current.rest());
                if (rkf_salient_descriptor.NIL == subl_promotions.memberP(slot, meta_isa_info, Symbols.symbol_function((SubLObject)rkf_salient_descriptor.EQUAL), Symbols.symbol_function((SubLObject)rkf_salient_descriptor.$sym64$FIRST))) {
                    meta_isa_info = (SubLObject)ConsesLow.cons((SubLObject)ConsesLow.list(slot, superior, isa_or_genls), meta_isa_info);
                }
                cdolist_list_var = cdolist_list_var.rest();
                slot_count = cdolist_list_var.first();
            }
        }
        return meta_isa_info;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/rkf-salient-descriptor.lisp", position = 22376L)
    public static SubLObject rkf_sd_deconstruct_basis_property(final SubLObject basis_property) {
        final SubLObject v_term = (SubLObject)rkf_salient_descriptor.$kw80$TERM;
        final SubLObject sentence = properties.property_to_sentence(basis_property, v_term);
        final SubLObject pcase_var = cycl_utilities.formula_arg0(sentence);
        if (pcase_var.eql(rkf_salient_descriptor.$const24$isa)) {
            return Values.values(cycl_utilities.formula_arg2(sentence, (SubLObject)rkf_salient_descriptor.UNPROVIDED), (SubLObject)rkf_salient_descriptor.$kw21$ISA);
        }
        if (pcase_var.eql(rkf_salient_descriptor.$const25$genls)) {
            return Values.values(cycl_utilities.formula_arg2(sentence, (SubLObject)rkf_salient_descriptor.UNPROVIDED), (SubLObject)rkf_salient_descriptor.$kw81$GENLS);
        }
        return (SubLObject)rkf_salient_descriptor.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/rkf-salient-descriptor.lisp", position = 22845L)
    public static SubLObject rkf_sd_construct_basis_property(final SubLObject superior, final SubLObject isa_or_genls) {
        final SubLObject v_term = (SubLObject)rkf_salient_descriptor.$kw80$TERM;
        if (isa_or_genls.eql((SubLObject)rkf_salient_descriptor.$kw21$ISA)) {
            return properties.sentence_to_property(el_utilities.make_binary_formula(rkf_salient_descriptor.$const24$isa, v_term, superior), v_term);
        }
        if (isa_or_genls.eql((SubLObject)rkf_salient_descriptor.$kw81$GENLS)) {
            return properties.sentence_to_property(el_utilities.make_binary_formula(rkf_salient_descriptor.$const25$genls, v_term, superior), v_term);
        }
        return (SubLObject)rkf_salient_descriptor.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/rkf-salient-descriptor.lisp", position = 23194L)
    public static SubLObject rkf_sd_properties_from_bin_pred_info(final SubLObject info) {
        SubLObject v_properties = (SubLObject)rkf_salient_descriptor.NIL;
        SubLObject basis_properties = (SubLObject)rkf_salient_descriptor.NIL;
        SubLObject rule_specs = (SubLObject)rkf_salient_descriptor.NIL;
        final SubLObject var = (SubLObject)rkf_salient_descriptor.$sym23$_X;
        final SubLObject v_term = (SubLObject)rkf_salient_descriptor.$kw80$TERM;
        SubLObject cdolist_list_var = info;
        SubLObject item = (SubLObject)rkf_salient_descriptor.NIL;
        item = cdolist_list_var.first();
        while (rkf_salient_descriptor.NIL != cdolist_list_var) {
            SubLObject current;
            final SubLObject datum = current = item;
            SubLObject bin_pred = (SubLObject)rkf_salient_descriptor.NIL;
            SubLObject superior = (SubLObject)rkf_salient_descriptor.NIL;
            SubLObject isa_or_genls = (SubLObject)rkf_salient_descriptor.NIL;
            cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)rkf_salient_descriptor.$list82);
            bin_pred = current.first();
            current = current.rest();
            cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)rkf_salient_descriptor.$list82);
            superior = current.first();
            current = current.rest();
            cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)rkf_salient_descriptor.$list82);
            isa_or_genls = current.first();
            current = current.rest();
            if (rkf_salient_descriptor.NIL == current) {
                final SubLObject sentence = el_utilities.make_binary_formula(bin_pred, v_term, var);
                final SubLObject property = properties.sentence_to_property(sentence, v_term);
                final SubLObject basis_property = rkf_sd_make_superior_basis_property(superior, isa_or_genls);
                final SubLObject rule_spec = new_rkf_salient_descriptor_rule_spec((SubLObject)rkf_salient_descriptor.$kw58$BIN_PRED, isa_or_genls, superior, bin_pred);
                v_properties = (SubLObject)ConsesLow.cons(property, v_properties);
                basis_properties = (SubLObject)ConsesLow.cons(basis_property, basis_properties);
                rule_specs = (SubLObject)ConsesLow.cons(rule_spec, rule_specs);
            }
            else {
                cdestructuring_bind.cdestructuring_bind_error(datum, (SubLObject)rkf_salient_descriptor.$list82);
            }
            cdolist_list_var = cdolist_list_var.rest();
            item = cdolist_list_var.first();
        }
        return Values.values(Sequences.nreverse(v_properties), Sequences.nreverse(basis_properties), Sequences.nreverse(rule_specs));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/rkf-salient-descriptor.lisp", position = 23971L)
    public static SubLObject rkf_sd_properties_from_meta_isa_info(final SubLObject info) {
        SubLObject v_properties = (SubLObject)rkf_salient_descriptor.NIL;
        SubLObject basis_properties = (SubLObject)rkf_salient_descriptor.NIL;
        SubLObject rule_specs = (SubLObject)rkf_salient_descriptor.NIL;
        final SubLObject var = (SubLObject)rkf_salient_descriptor.$sym77$_TYPE;
        final SubLObject v_term = (SubLObject)rkf_salient_descriptor.$kw80$TERM;
        SubLObject cdolist_list_var = info;
        SubLObject item = (SubLObject)rkf_salient_descriptor.NIL;
        item = cdolist_list_var.first();
        while (rkf_salient_descriptor.NIL != cdolist_list_var) {
            SubLObject current;
            final SubLObject datum = current = item;
            SubLObject meta_isa = (SubLObject)rkf_salient_descriptor.NIL;
            SubLObject superior = (SubLObject)rkf_salient_descriptor.NIL;
            SubLObject isa_or_genls = (SubLObject)rkf_salient_descriptor.NIL;
            cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)rkf_salient_descriptor.$list83);
            meta_isa = current.first();
            current = current.rest();
            cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)rkf_salient_descriptor.$list83);
            superior = current.first();
            current = current.rest();
            cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)rkf_salient_descriptor.$list83);
            isa_or_genls = current.first();
            current = current.rest();
            if (rkf_salient_descriptor.NIL == current) {
                final SubLObject sentence = el_utilities.make_conjunction((SubLObject)ConsesLow.list(el_utilities.make_binary_formula(rkf_salient_descriptor.$const24$isa, v_term, var), el_utilities.make_binary_formula(rkf_salient_descriptor.$const24$isa, var, meta_isa)));
                final SubLObject property = properties.sentence_to_property(sentence, v_term);
                final SubLObject basis_property = rkf_sd_make_superior_basis_property(superior, isa_or_genls);
                final SubLObject rule_spec = new_rkf_salient_descriptor_rule_spec((SubLObject)rkf_salient_descriptor.$kw60$META_ISA, isa_or_genls, superior, meta_isa);
                v_properties = (SubLObject)ConsesLow.cons(property, v_properties);
                basis_properties = (SubLObject)ConsesLow.cons(basis_property, basis_properties);
                rule_specs = (SubLObject)ConsesLow.cons(rule_spec, rule_specs);
            }
            else {
                cdestructuring_bind.cdestructuring_bind_error(datum, (SubLObject)rkf_salient_descriptor.$list83);
            }
            cdolist_list_var = cdolist_list_var.rest();
            item = cdolist_list_var.first();
        }
        return Values.values(Sequences.nreverse(v_properties), Sequences.nreverse(basis_properties), Sequences.nreverse(rule_specs));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/rkf-salient-descriptor.lisp", position = 24827L)
    public static SubLObject rkf_sd_make_superior_basis_property(final SubLObject superior, final SubLObject isa_or_genls) {
        return rkf_sd_construct_basis_property(superior, isa_or_genls);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/rkf-salient-descriptor.lisp", position = 24969L)
    public static SubLObject rkf_sd_induction_basis_properties(final SubLObject v_term, final SubLObject mt) {
        final SubLObject isa_properties = rkf_induced_salient_descriptor_superior_properties(v_term, mt, (SubLObject)rkf_salient_descriptor.$kw21$ISA, (SubLObject)rkf_salient_descriptor.UNPROVIDED);
        return (rkf_salient_descriptor.NIL != fort_types_interface.collectionP(v_term)) ? ConsesLow.append(isa_properties, rkf_induced_salient_descriptor_superior_properties(v_term, mt, (SubLObject)rkf_salient_descriptor.$kw81$GENLS, (SubLObject)rkf_salient_descriptor.UNPROVIDED)) : isa_properties;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/rkf-salient-descriptor.lisp", position = 25444L)
    public static SubLObject rkf_induced_salient_descriptor_superior_properties(final SubLObject v_term, final SubLObject mt, final SubLObject isa_or_genls, SubLObject maximally_generalP) {
        if (maximally_generalP == rkf_salient_descriptor.UNPROVIDED) {
            maximally_generalP = (SubLObject)rkf_salient_descriptor.NIL;
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject superior_property = (isa_or_genls == rkf_salient_descriptor.$kw21$ISA) ? properties.sentence_to_property((SubLObject)ConsesLow.listS(rkf_salient_descriptor.$const24$isa, v_term, (SubLObject)rkf_salient_descriptor.$list84), (SubLObject)rkf_salient_descriptor.$kw85$SUPERIOR) : properties.sentence_to_property((SubLObject)ConsesLow.listS(rkf_salient_descriptor.$const25$genls, v_term, (SubLObject)rkf_salient_descriptor.$list84), (SubLObject)rkf_salient_descriptor.$kw85$SUPERIOR);
        final SubLObject query_properties = (SubLObject)ConsesLow.list((SubLObject)rkf_salient_descriptor.$kw70$ANSWER_LANGUAGE, (SubLObject)rkf_salient_descriptor.$kw71$HL, (SubLObject)rkf_salient_descriptor.$kw69$PROBLEM_STORE, rkf_sd_find_or_make_problem_store());
        final SubLObject all_superiors = properties.property_extent(superior_property, mt, query_properties);
        final SubLObject superiors_cutoff = rkf_salient_descriptor.$rkf_sd_induced_superiors_cutoff$.getDynamicValue(thread);
        final SubLObject sorted_superiors = cardinality_estimates.sort_by_generality_estimate(all_superiors, (SubLObject)rkf_salient_descriptor.$kw86$ASCENDING);
        SubLObject superiors = superiors_cutoff.isNumber() ? list_utilities.first_n(superiors_cutoff, sorted_superiors) : sorted_superiors;
        if (rkf_salient_descriptor.NIL != maximally_generalP) {
            superiors = Sequences.nreverse(superiors);
        }
        SubLObject ans = (SubLObject)rkf_salient_descriptor.NIL;
        SubLObject cdolist_list_var = superiors;
        SubLObject superior = (SubLObject)rkf_salient_descriptor.NIL;
        superior = cdolist_list_var.first();
        while (rkf_salient_descriptor.NIL != cdolist_list_var) {
            ans = (SubLObject)ConsesLow.cons(rkf_sd_construct_basis_property(superior, isa_or_genls), ans);
            cdolist_list_var = cdolist_list_var.rest();
            superior = cdolist_list_var.first();
        }
        return Sequences.nreverse(ans);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/rkf-salient-descriptor.lisp", position = 26581L)
    public static SubLObject rkf_induced_salient_descriptor_superiors(final SubLObject v_term, final SubLObject mt, final SubLObject isa_or_genls, final SubLObject maximally_generalP) {
        final SubLObject superior_fn = (SubLObject)((isa_or_genls == rkf_salient_descriptor.$kw21$ISA) ? rkf_salient_descriptor.$sym87$ALL_ISA : rkf_salient_descriptor.$sym88$ALL_GENLS);
        final SubLObject superior_property = (isa_or_genls == rkf_salient_descriptor.$kw21$ISA) ? properties.sentence_to_property((SubLObject)ConsesLow.listS(rkf_salient_descriptor.$const24$isa, v_term, (SubLObject)rkf_salient_descriptor.$list84), (SubLObject)rkf_salient_descriptor.$kw85$SUPERIOR) : properties.sentence_to_property((SubLObject)ConsesLow.listS(rkf_salient_descriptor.$const25$genls, v_term, (SubLObject)rkf_salient_descriptor.$list84), (SubLObject)rkf_salient_descriptor.$kw85$SUPERIOR);
        final SubLObject superiors_cutoff = (SubLObject)rkf_salient_descriptor.FOUR_INTEGER;
        final SubLObject sorted_superiors = cardinality_estimates.sort_by_generality_estimate(Functions.funcall(superior_fn, v_term, mt), (SubLObject)rkf_salient_descriptor.$kw86$ASCENDING);
        SubLObject superiors = list_utilities.first_n(superiors_cutoff, sorted_superiors);
        if (rkf_salient_descriptor.NIL != maximally_generalP) {
            superiors = Sequences.nreverse(superiors);
        }
        return superiors;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/rkf-salient-descriptor.lisp", position = 27454L)
    public static SubLObject rkf_induced_salient_descriptor_slots(final SubLObject superiors, final SubLObject isa_or_genls, final SubLObject rule_type, final SubLObject mt, SubLObject known_meta_isas) {
        if (known_meta_isas == rkf_salient_descriptor.UNPROVIDED) {
            known_meta_isas = (SubLObject)rkf_salient_descriptor.NIL;
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject enoughP = (SubLObject)rkf_salient_descriptor.NIL;
        final SubLObject generality_cutoff = (SubLObject)rkf_salient_descriptor.$int62$25000;
        SubLObject v_slots = (SubLObject)rkf_salient_descriptor.NIL;
        final SubLObject reuse_existingP = rkf_sd_problem_store_okP(rkf_salient_descriptor.$rkf_sd_problem_store$.getDynamicValue(thread));
        final SubLObject _prev_bind_0 = rkf_salient_descriptor.$rkf_sd_problem_store$.currentBinding(thread);
        try {
            rkf_salient_descriptor.$rkf_sd_problem_store$.bind(rkf_sd_find_or_make_problem_store(), thread);
            final SubLObject store = rkf_salient_descriptor.$rkf_sd_problem_store$.getDynamicValue(thread);
            try {
                if (rkf_salient_descriptor.NIL == enoughP) {
                    SubLObject csome_list_var = superiors;
                    SubLObject superior = (SubLObject)rkf_salient_descriptor.NIL;
                    superior = csome_list_var.first();
                    while (rkf_salient_descriptor.NIL == enoughP && rkf_salient_descriptor.NIL != csome_list_var) {
                        if (cardinality_estimates.generality_estimate(superior).numL(generality_cutoff)) {
                            final SubLObject slot_fn = (SubLObject)((rule_type == rkf_salient_descriptor.$kw58$BIN_PRED) ? rkf_salient_descriptor.$sym89$RKF_INDUCED_SALIENT_DESCRIPTOR_BINARY_PREDS : rkf_salient_descriptor.$sym90$RKF_INDUCED_SALIENT_DESCRIPTOR_META_ISAS);
                            final SubLObject slot_args = (SubLObject)((rule_type == rkf_salient_descriptor.$kw58$BIN_PRED) ? ConsesLow.list(mt, superior, isa_or_genls) : ConsesLow.list(mt, superior, isa_or_genls, known_meta_isas));
                            SubLObject cdolist_list_var;
                            final SubLObject slot_counts = cdolist_list_var = Functions.apply(slot_fn, slot_args);
                            SubLObject slot_count = (SubLObject)rkf_salient_descriptor.NIL;
                            slot_count = cdolist_list_var.first();
                            while (rkf_salient_descriptor.NIL != cdolist_list_var) {
                                SubLObject current;
                                final SubLObject datum = current = slot_count;
                                SubLObject slot = (SubLObject)rkf_salient_descriptor.NIL;
                                SubLObject count = (SubLObject)rkf_salient_descriptor.NIL;
                                cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)rkf_salient_descriptor.$list66);
                                slot = current.first();
                                current = (count = current.rest());
                                if (rkf_salient_descriptor.NIL == subl_promotions.memberP(slot, v_slots, Symbols.symbol_function((SubLObject)rkf_salient_descriptor.EQUAL), Symbols.symbol_function((SubLObject)rkf_salient_descriptor.$sym91$CAR))) {
                                    v_slots = (SubLObject)ConsesLow.cons((SubLObject)ConsesLow.cons(slot, superior), v_slots);
                                }
                                cdolist_list_var = cdolist_list_var.rest();
                                slot_count = cdolist_list_var.first();
                            }
                            enoughP = (SubLObject)SubLObjectFactory.makeBoolean(rkf_salient_descriptor.$rkf_salient_descriptor_number_cutoff$.getDynamicValue(thread).isNumber() && rkf_salient_descriptor.NIL != list_utilities.lengthGE(v_slots, rkf_salient_descriptor.$rkf_salient_descriptor_number_cutoff$.getDynamicValue(thread), (SubLObject)rkf_salient_descriptor.UNPROVIDED));
                        }
                        csome_list_var = csome_list_var.rest();
                        superior = csome_list_var.first();
                    }
                }
            }
            finally {
                final SubLObject _prev_bind_0_$87 = Threads.$is_thread_performing_cleanupP$.currentBinding(thread);
                try {
                    Threads.$is_thread_performing_cleanupP$.bind((SubLObject)rkf_salient_descriptor.T, thread);
                    final SubLObject _values = Values.getValuesAsVector();
                    if (rkf_salient_descriptor.NIL == reuse_existingP) {
                        rkf_sd_free_problem_store(store);
                    }
                    Values.restoreValuesFromVector(_values);
                }
                finally {
                    Threads.$is_thread_performing_cleanupP$.rebind(_prev_bind_0_$87, thread);
                }
            }
        }
        finally {
            rkf_salient_descriptor.$rkf_sd_problem_store$.rebind(_prev_bind_0, thread);
        }
        return v_slots;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/rkf-salient-descriptor.lisp", position = 28627L)
    public static SubLObject rkf_salient_descriptor_specP(final SubLObject col1, final SubLObject col2, SubLObject mt) {
        if (mt == rkf_salient_descriptor.UNPROVIDED) {
            mt = mt_relevance_macros.$mt$.getDynamicValue();
        }
        return rkf_salient_descriptor_genlP(col2, col1, mt);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/rkf-salient-descriptor.lisp", position = 28758L)
    public static SubLObject rkf_salient_descriptor_genlP_internal(final SubLObject col1, final SubLObject col2, final SubLObject mt) {
        return genls.genlP(col1, col2, mt, (SubLObject)rkf_salient_descriptor.UNPROVIDED);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/rkf-salient-descriptor.lisp", position = 28758L)
    public static SubLObject rkf_salient_descriptor_genlP(final SubLObject col1, final SubLObject col2, final SubLObject mt) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject v_memoization_state = memoization_state.$memoization_state$.getDynamicValue(thread);
        SubLObject caching_state = (SubLObject)rkf_salient_descriptor.NIL;
        if (rkf_salient_descriptor.NIL == v_memoization_state) {
            return rkf_salient_descriptor_genlP_internal(col1, col2, mt);
        }
        caching_state = memoization_state.memoization_state_lookup(v_memoization_state, (SubLObject)rkf_salient_descriptor.$sym92$RKF_SALIENT_DESCRIPTOR_GENL_, (SubLObject)rkf_salient_descriptor.UNPROVIDED);
        if (rkf_salient_descriptor.NIL == caching_state) {
            caching_state = memoization_state.create_caching_state(memoization_state.memoization_state_lock(v_memoization_state), (SubLObject)rkf_salient_descriptor.$sym92$RKF_SALIENT_DESCRIPTOR_GENL_, (SubLObject)rkf_salient_descriptor.THREE_INTEGER, (SubLObject)rkf_salient_descriptor.NIL, (SubLObject)rkf_salient_descriptor.EQUAL, (SubLObject)rkf_salient_descriptor.UNPROVIDED);
            memoization_state.memoization_state_put(v_memoization_state, (SubLObject)rkf_salient_descriptor.$sym92$RKF_SALIENT_DESCRIPTOR_GENL_, caching_state);
        }
        final SubLObject sxhash = memoization_state.sxhash_calc_3(col1, col2, mt);
        final SubLObject collisions = memoization_state.caching_state_lookup(caching_state, sxhash, (SubLObject)rkf_salient_descriptor.UNPROVIDED);
        if (!collisions.eql(memoization_state.$memoized_item_not_found$.getGlobalValue())) {
            SubLObject cdolist_list_var = collisions;
            SubLObject collision = (SubLObject)rkf_salient_descriptor.NIL;
            collision = cdolist_list_var.first();
            while (rkf_salient_descriptor.NIL != cdolist_list_var) {
                SubLObject cached_args = collision.first();
                final SubLObject results2 = conses_high.second(collision);
                if (col1.equal(cached_args.first())) {
                    cached_args = cached_args.rest();
                    if (col2.equal(cached_args.first())) {
                        cached_args = cached_args.rest();
                        if (rkf_salient_descriptor.NIL != cached_args && rkf_salient_descriptor.NIL == cached_args.rest() && mt.equal(cached_args.first())) {
                            return memoization_state.caching_results(results2);
                        }
                    }
                }
                cdolist_list_var = cdolist_list_var.rest();
                collision = cdolist_list_var.first();
            }
        }
        final SubLObject results3 = Values.arg2(thread.resetMultipleValues(), (SubLObject)Values.multiple_value_list(rkf_salient_descriptor_genlP_internal(col1, col2, mt)));
        memoization_state.caching_state_enter_multi_key_n(caching_state, sxhash, collisions, results3, (SubLObject)ConsesLow.list(col1, col2, mt));
        return memoization_state.caching_results(results3);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/rkf-salient-descriptor.lisp", position = 28868L)
    public static SubLObject rkf_salient_descriptor_rule_from_spec(final SubLObject rule_spec, SubLObject mt) {
        if (mt == rkf_salient_descriptor.UNPROVIDED) {
            mt = control_vars.$rkf_mt$.getDynamicValue();
        }
        SubLObject rule_type = (SubLObject)rkf_salient_descriptor.NIL;
        SubLObject isa_or_genls = (SubLObject)rkf_salient_descriptor.NIL;
        SubLObject superior = (SubLObject)rkf_salient_descriptor.NIL;
        SubLObject slot = (SubLObject)rkf_salient_descriptor.NIL;
        cdestructuring_bind.destructuring_bind_must_consp(rule_spec, rule_spec, (SubLObject)rkf_salient_descriptor.$list93);
        rule_type = rule_spec.first();
        SubLObject current = rule_spec.rest();
        cdestructuring_bind.destructuring_bind_must_consp(current, rule_spec, (SubLObject)rkf_salient_descriptor.$list93);
        isa_or_genls = current.first();
        current = current.rest();
        cdestructuring_bind.destructuring_bind_must_consp(current, rule_spec, (SubLObject)rkf_salient_descriptor.$list93);
        superior = current.first();
        current = current.rest();
        cdestructuring_bind.destructuring_bind_must_consp(current, rule_spec, (SubLObject)rkf_salient_descriptor.$list93);
        slot = current.first();
        current = current.rest();
        if (rkf_salient_descriptor.NIL == current) {
            final SubLObject default_var = (SubLObject)((isa_or_genls == rkf_salient_descriptor.$kw21$ISA) ? rkf_salient_descriptor.$sym74$_INSTANCE : rkf_salient_descriptor.$sym94$_SPEC);
            final SubLObject term_var = czer_utilities.unique_el_var_wrt_expression(slot, default_var);
            final SubLObject formula_fn = (SubLObject)((rule_type == rkf_salient_descriptor.$kw58$BIN_PRED) ? rkf_salient_descriptor.$sym95$RKF_MAKE_BIN_PRED_FORMULA : rkf_salient_descriptor.$sym96$RKF_MAKE_META_ISA_FORMULA);
            final SubLObject consequent = Functions.funcall(formula_fn, term_var, slot);
            final SubLObject rule = rkf_make_salient_descriptor_rule(term_var, superior, consequent, isa_or_genls);
            return rkf_formula_optimizer.rkf_tersify(rule, mt);
        }
        cdestructuring_bind.cdestructuring_bind_error(rule_spec, (SubLObject)rkf_salient_descriptor.$list93);
        return (SubLObject)rkf_salient_descriptor.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/rkf-salient-descriptor.lisp", position = 29462L)
    public static SubLObject rkf_rule_spec_supports(final SubLObject v_term, final SubLObject rule_spec, final SubLObject mt) {
        final SubLObject super_sentence = rkf_justification_sentence_from_rule_spec(v_term, rule_spec);
        final SubLObject ask_results = ask_utilities.ask_justified(super_sentence, mt, (SubLObject)rkf_salient_descriptor.NIL, (SubLObject)rkf_salient_descriptor.UNPROVIDED, (SubLObject)rkf_salient_descriptor.UNPROVIDED, (SubLObject)rkf_salient_descriptor.UNPROVIDED);
        final SubLObject first_result = ask_results.first();
        SubLObject supports = conses_high.second(first_result);
        final SubLObject induced_rule_support = rkf_induced_rule_support(rule_spec, mt);
        if (rkf_salient_descriptor.NIL != induced_rule_support) {
            supports = (SubLObject)ConsesLow.cons(induced_rule_support, supports);
        }
        return Sequences.nreverse(supports);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/rkf-salient-descriptor.lisp", position = 29904L)
    public static SubLObject rkf_justification_sentence_from_rule_spec(final SubLObject v_term, final SubLObject rule_spec) {
        SubLObject current;
        final SubLObject datum = current = rule_spec.rest();
        SubLObject isa_or_genls = (SubLObject)rkf_salient_descriptor.NIL;
        SubLObject v_super = (SubLObject)rkf_salient_descriptor.NIL;
        SubLObject slot = (SubLObject)rkf_salient_descriptor.NIL;
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)rkf_salient_descriptor.$list97);
        isa_or_genls = current.first();
        current = current.rest();
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)rkf_salient_descriptor.$list97);
        v_super = current.first();
        current = current.rest();
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)rkf_salient_descriptor.$list97);
        slot = current.first();
        current = current.rest();
        if (rkf_salient_descriptor.NIL == current) {
            final SubLObject super_pred = (isa_or_genls == rkf_salient_descriptor.$kw21$ISA) ? rkf_salient_descriptor.$const24$isa : rkf_salient_descriptor.$const25$genls;
            final SubLObject super_sentence = el_utilities.make_binary_formula(super_pred, v_term, v_super);
            return super_sentence;
        }
        cdestructuring_bind.cdestructuring_bind_error(datum, (SubLObject)rkf_salient_descriptor.$list97);
        return (SubLObject)rkf_salient_descriptor.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/rkf-salient-descriptor.lisp", position = 30229L)
    public static SubLObject rkf_induced_rule_support(final SubLObject rule_spec, final SubLObject mt) {
        SubLObject rule_type = (SubLObject)rkf_salient_descriptor.NIL;
        SubLObject isa_or_genls = (SubLObject)rkf_salient_descriptor.NIL;
        SubLObject superior = (SubLObject)rkf_salient_descriptor.NIL;
        SubLObject slot = (SubLObject)rkf_salient_descriptor.NIL;
        cdestructuring_bind.destructuring_bind_must_consp(rule_spec, rule_spec, (SubLObject)rkf_salient_descriptor.$list93);
        rule_type = rule_spec.first();
        SubLObject current = rule_spec.rest();
        cdestructuring_bind.destructuring_bind_must_consp(current, rule_spec, (SubLObject)rkf_salient_descriptor.$list93);
        isa_or_genls = current.first();
        current = current.rest();
        cdestructuring_bind.destructuring_bind_must_consp(current, rule_spec, (SubLObject)rkf_salient_descriptor.$list93);
        superior = current.first();
        current = current.rest();
        cdestructuring_bind.destructuring_bind_must_consp(current, rule_spec, (SubLObject)rkf_salient_descriptor.$list93);
        slot = current.first();
        current = current.rest();
        if (rkf_salient_descriptor.NIL != current) {
            cdestructuring_bind.cdestructuring_bind_error(rule_spec, (SubLObject)rkf_salient_descriptor.$list93);
            return (SubLObject)rkf_salient_descriptor.NIL;
        }
        final SubLObject pcase_var = rule_type;
        if (pcase_var.eql((SubLObject)rkf_salient_descriptor.$kw60$META_ISA)) {
            final SubLObject super_pred = (isa_or_genls == rkf_salient_descriptor.$kw21$ISA) ? rkf_salient_descriptor.$const24$isa : rkf_salient_descriptor.$const25$genls;
            final SubLObject term_var = (SubLObject)rkf_salient_descriptor.$sym23$_X;
            final SubLObject rule_sentence = (SubLObject)ConsesLow.list(rkf_salient_descriptor.$const75$implies, (SubLObject)ConsesLow.list(super_pred, term_var, superior), (SubLObject)ConsesLow.list(rkf_salient_descriptor.$const11$keStrongSuggestion, term_var, rkf_make_meta_isa_formula(term_var, slot)));
            final SubLObject fake_hl_support = (SubLObject)ConsesLow.listS((SubLObject)rkf_salient_descriptor.$kw98$CODE, rule_sentence, mt, (SubLObject)rkf_salient_descriptor.$list99);
            return fake_hl_support;
        }
        return (SubLObject)rkf_salient_descriptor.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/rkf-salient-descriptor.lisp", position = 30787L)
    public static SubLObject rkf_salient_descriptor_rule_spec_p(final SubLObject obj) {
        return (SubLObject)SubLObjectFactory.makeBoolean(obj.isList() && rkf_salient_descriptor.NIL != list_utilities.lengthE(obj, (SubLObject)rkf_salient_descriptor.FOUR_INTEGER, (SubLObject)rkf_salient_descriptor.UNPROVIDED) && rkf_salient_descriptor.NIL != conses_high.member(obj.first(), (SubLObject)rkf_salient_descriptor.$list100, (SubLObject)rkf_salient_descriptor.UNPROVIDED, (SubLObject)rkf_salient_descriptor.UNPROVIDED));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/rkf-salient-descriptor.lisp", position = 30946L)
    public static SubLObject new_rkf_salient_descriptor_rule_spec(final SubLObject rule_type, final SubLObject isa_or_genls, final SubLObject superior, final SubLObject slot) {
        return (SubLObject)ConsesLow.list(rule_type, isa_or_genls, superior, slot);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/rkf-salient-descriptor.lisp", position = 31094L)
    public static SubLObject rkf_salient_descriptor_rule_spec_slot(final SubLObject rule_spec) {
        return conses_high.fourth(rule_spec);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/rkf-salient-descriptor.lisp", position = 31189L)
    public static SubLObject rkf_sd_binary_preds_inference_properties(final SubLObject var) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        return (SubLObject)ConsesLow.list(new SubLObject[] { rkf_salient_descriptor.$kw69$PROBLEM_STORE, rkf_sd_find_or_make_problem_store(), rkf_salient_descriptor.$kw70$ANSWER_LANGUAGE, rkf_salient_descriptor.$kw71$HL, rkf_salient_descriptor.$kw101$INTERMEDIATE_STEP_VALIDATION_LEVEL, rkf_salient_descriptor.$kw102$ARG_TYPE, rkf_salient_descriptor.$kw103$CACHE_INFERENCE_RESULTS_, rkf_salient_descriptor.NIL, rkf_salient_descriptor.$kw104$RESULT_UNIQUENESS, rkf_salient_descriptor.$kw105$BINDINGS, rkf_salient_descriptor.$kw106$RETURN, ConsesLow.list((SubLObject)rkf_salient_descriptor.$kw107$TEMPLATE, var), rkf_salient_descriptor.$kw108$PRODUCTIVITY_LIMIT, rkf_salient_descriptor.$int109$100000, rkf_salient_descriptor.$kw110$MAX_NUMBER, rkf_salient_descriptor.$rkf_salient_descriptor_number_cutoff$.getDynamicValue(thread), rkf_salient_descriptor.$kw111$MAX_TIME, rkf_salient_descriptor.$rkf_salient_descriptor_time_cutoff$.getDynamicValue(thread), rkf_salient_descriptor.$kw112$PROBABLY_APPROXIMATELY_DONE, rkf_salient_descriptor.ONE_INTEGER, rkf_salient_descriptor.$kw113$MAX_TRANSFORMATION_DEPTH, rkf_salient_descriptor.$rkf_salient_descriptor_transformation_cutoff$.getDynamicValue(thread) });
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/rkf-salient-descriptor.lisp", position = 31761L)
    public static SubLObject rkf_collection_promising_for_binary_pred_inductionP(final SubLObject mt, final SubLObject collection, SubLObject type, SubLObject minimum_to_count_as_promising) {
        if (type == rkf_salient_descriptor.UNPROVIDED) {
            type = (SubLObject)rkf_salient_descriptor.$kw21$ISA;
        }
        if (minimum_to_count_as_promising == rkf_salient_descriptor.UNPROVIDED) {
            minimum_to_count_as_promising = (SubLObject)rkf_salient_descriptor.THREE_INTEGER;
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject badP = (SubLObject)SubLObjectFactory.makeBoolean(rkf_salient_descriptor.NIL == forts.fort_p(collection));
        if (rkf_salient_descriptor.NIL == badP) {
            final SubLObject min_inferiors = (SubLObject)rkf_salient_descriptor.$int65$25;
            final SubLObject max_specs = (SubLObject)rkf_salient_descriptor.$int114$100;
            final SubLObject mt_var = mt_relevance_macros.with_inference_mt_relevance_validate(mt);
            final SubLObject _prev_bind_0 = mt_relevance_macros.$mt$.currentBinding(thread);
            final SubLObject _prev_bind_2 = mt_relevance_macros.$relevant_mt_function$.currentBinding(thread);
            final SubLObject _prev_bind_3 = mt_relevance_macros.$relevant_mts$.currentBinding(thread);
            try {
                mt_relevance_macros.$mt$.bind(mt_relevance_macros.update_inference_mt_relevance_mt(mt_var), thread);
                mt_relevance_macros.$relevant_mt_function$.bind(mt_relevance_macros.update_inference_mt_relevance_function(mt_var), thread);
                mt_relevance_macros.$relevant_mts$.bind(mt_relevance_macros.update_inference_mt_relevance_mt_list(mt_var), thread);
                final SubLObject inferior_estimate = (rkf_salient_descriptor.$kw21$ISA == type) ? cardinality_estimates.instance_cardinality(collection) : cardinality_estimates.spec_cardinality(collection);
                badP = (SubLObject)SubLObjectFactory.makeBoolean(inferior_estimate.numL(min_inferiors) || cardinality_estimates.spec_cardinality(collection).numG(max_specs) || rkf_salient_descriptor.NIL != list_utilities.lengthL(rkf_salient_descriptor_get_inferiors(mt, collection, type, min_inferiors), min_inferiors, (SubLObject)rkf_salient_descriptor.UNPROVIDED));
            }
            finally {
                mt_relevance_macros.$relevant_mts$.rebind(_prev_bind_3, thread);
                mt_relevance_macros.$relevant_mt_function$.rebind(_prev_bind_2, thread);
                mt_relevance_macros.$mt$.rebind(_prev_bind_0, thread);
            }
            if (rkf_salient_descriptor.NIL == badP) {
                final SubLObject _prev_bind_4 = rkf_salient_descriptor.$rkf_salient_descriptor_number_cutoff$.currentBinding(thread);
                try {
                    rkf_salient_descriptor.$rkf_salient_descriptor_number_cutoff$.bind(Numbers.multiply((SubLObject)rkf_salient_descriptor.TWO_INTEGER, minimum_to_count_as_promising), thread);
                    badP = list_utilities.lengthL(rkf_induced_salient_descriptor_binary_preds(mt, collection, type, (SubLObject)rkf_salient_descriptor.$int65$25, (SubLObject)rkf_salient_descriptor.$kw59$ALL, (SubLObject)rkf_salient_descriptor.UNPROVIDED), minimum_to_count_as_promising, (SubLObject)rkf_salient_descriptor.UNPROVIDED);
                }
                finally {
                    rkf_salient_descriptor.$rkf_salient_descriptor_number_cutoff$.rebind(_prev_bind_4, thread);
                }
            }
        }
        return (SubLObject)SubLObjectFactory.makeBoolean(rkf_salient_descriptor.NIL == badP);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/rkf-salient-descriptor.lisp", position = 32889L)
    public static SubLObject rkf_induced_suggestion_pred_of_strength(final SubLObject strength, final SubLObject type) {
        if (type.eql((SubLObject)rkf_salient_descriptor.$kw21$ISA)) {
            if (strength.eql((SubLObject)rkf_salient_descriptor.$kw3$STRONG)) {
                return rkf_salient_descriptor.$const115$keInducedStrongSuggestionPreds;
            }
            if (strength.eql((SubLObject)rkf_salient_descriptor.$kw4$WEAK)) {
                return rkf_salient_descriptor.$const116$keInducedWeakSuggestionPreds;
            }
            return rkf_salient_descriptor.$const117$keInducedSuggestionPreds;
        }
        else {
            if (strength.eql((SubLObject)rkf_salient_descriptor.$kw3$STRONG)) {
                return rkf_salient_descriptor.$const118$keGenlsInducedStrongSuggestionPre;
            }
            if (strength.eql((SubLObject)rkf_salient_descriptor.$kw4$WEAK)) {
                return rkf_salient_descriptor.$const119$keGenlsInducedWeakSuggestionPreds;
            }
            return rkf_salient_descriptor.$const120$keGenlsInducedSuggestionPreds;
        }
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/rkf-salient-descriptor.lisp", position = 33392L)
    public static SubLObject rkf_induced_salient_descriptor_binary_preds(final SubLObject mt, final SubLObject superior, final SubLObject type, SubLObject lax_factor, SubLObject strength, SubLObject omit_preds_for_genlsP) {
        if (lax_factor == rkf_salient_descriptor.UNPROVIDED) {
            lax_factor = (SubLObject)rkf_salient_descriptor.TEN_INTEGER;
        }
        if (strength == rkf_salient_descriptor.UNPROVIDED) {
            strength = (SubLObject)rkf_salient_descriptor.$kw3$STRONG;
        }
        if (omit_preds_for_genlsP == rkf_salient_descriptor.UNPROVIDED) {
            omit_preds_for_genlsP = (SubLObject)rkf_salient_descriptor.T;
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        assert rkf_salient_descriptor.NIL != subl_promotions.positive_integer_p(lax_factor) : lax_factor;
        if (type != rkf_salient_descriptor.$kw21$ISA) {
            final SubLObject siblings = rkf_salient_descriptor_get_inferiors(mt, superior, type, (SubLObject)rkf_salient_descriptor.UNPROVIDED);
            final SubLObject sibling_count = Sequences.length(siblings);
            final SubLObject strong_min_min = (SubLObject)rkf_salient_descriptor.FIVE_INTEGER;
            final SubLObject factored_min = Numbers.integerDivide(sibling_count, lax_factor);
            final SubLObject strong_min = number_utilities.maximum((SubLObject)ConsesLow.list(factored_min, strong_min_min), (SubLObject)rkf_salient_descriptor.UNPROVIDED);
            final SubLObject max_occurence = (SubLObject)((strength == rkf_salient_descriptor.$kw3$STRONG) ? rkf_salient_descriptor.NIL : number_utilities.f_1_(strong_min));
            final SubLObject min_min = (SubLObject)((strength == rkf_salient_descriptor.$kw3$STRONG) ? strong_min_min : rkf_salient_descriptor.TWO_INTEGER);
            final SubLObject min_occurence = number_utilities.maximum((SubLObject)ConsesLow.list(factored_min, min_min), (SubLObject)rkf_salient_descriptor.UNPROVIDED);
            SubLObject alist = (SubLObject)rkf_salient_descriptor.NIL;
            if (sibling_count.numG(min_occurence)) {
                SubLObject cdolist_list_var = siblings;
                SubLObject sibling = (SubLObject)rkf_salient_descriptor.NIL;
                sibling = cdolist_list_var.first();
                while (rkf_salient_descriptor.NIL != cdolist_list_var) {
                    SubLObject cdolist_list_var_$90 = rkf_term_binary_preds(sibling, mt);
                    SubLObject binary_pred = (SubLObject)rkf_salient_descriptor.NIL;
                    binary_pred = cdolist_list_var_$90.first();
                    while (rkf_salient_descriptor.NIL != cdolist_list_var_$90) {
                        final SubLObject current_count = list_utilities.alist_lookup(alist, binary_pred, Symbols.symbol_function((SubLObject)rkf_salient_descriptor.EQUAL), (SubLObject)rkf_salient_descriptor.ZERO_INTEGER);
                        alist = list_utilities.alist_enter(alist, binary_pred, number_utilities.f_1X(current_count), Symbols.symbol_function((SubLObject)rkf_salient_descriptor.EQUAL));
                        cdolist_list_var_$90 = cdolist_list_var_$90.rest();
                        binary_pred = cdolist_list_var_$90.first();
                    }
                    cdolist_list_var = cdolist_list_var.rest();
                    sibling = cdolist_list_var.first();
                }
            }
            SubLObject filtered = (SubLObject)rkf_salient_descriptor.NIL;
            SubLObject cdolist_list_var2 = alist;
            SubLObject item = (SubLObject)rkf_salient_descriptor.NIL;
            item = cdolist_list_var2.first();
            while (rkf_salient_descriptor.NIL != cdolist_list_var2) {
                SubLObject current;
                final SubLObject datum = current = item;
                SubLObject binary_pred2 = (SubLObject)rkf_salient_descriptor.NIL;
                SubLObject count = (SubLObject)rkf_salient_descriptor.NIL;
                cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)rkf_salient_descriptor.$list134);
                binary_pred2 = current.first();
                current = (count = current.rest());
                if (!count.numL(min_occurence)) {
                    if (rkf_salient_descriptor.NIL == max_occurence || !count.numG(max_occurence)) {
                        if (rkf_salient_descriptor.NIL != rkf_salient_descriptor_binary_pred_type_violationP(superior, binary_pred2, mt)) {
                            Errors.warn((SubLObject)rkf_salient_descriptor.$str135$Type_violation___S__S__S, superior, binary_pred2, mt);
                        }
                        else {
                            filtered = (SubLObject)ConsesLow.cons((SubLObject)ConsesLow.cons(binary_pred2, count), filtered);
                        }
                    }
                }
                cdolist_list_var2 = cdolist_list_var2.rest();
                item = cdolist_list_var2.first();
            }
            return filtered;
        }
        if (rkf_salient_descriptor.NIL != el_utilities.possibly_naut_p(superior) && cycl_utilities.nat_functor(superior).eql(rkf_salient_descriptor.$const121$SpecsFn)) {
            return rkf_induced_salient_descriptor_binary_preds(mt, cycl_utilities.nat_arg1(superior, (SubLObject)rkf_salient_descriptor.UNPROVIDED), (SubLObject)rkf_salient_descriptor.$kw122$GENL, lax_factor, strength, omit_preds_for_genlsP);
        }
        SubLObject ans = (SubLObject)rkf_salient_descriptor.NIL;
        final SubLObject var = (SubLObject)rkf_salient_descriptor.$sym123$_PRED;
        final SubLObject _prev_bind_0 = rkf_salient_descriptor.$rkf_salient_descriptor_transformation_cutoff$.currentBinding(thread);
        try {
            rkf_salient_descriptor.$rkf_salient_descriptor_transformation_cutoff$.bind((SubLObject)rkf_salient_descriptor.ZERO_INTEGER, thread);
            final SubLObject v_properties = rkf_sd_binary_preds_inference_properties(var);
            final SubLObject sugg_pred = rkf_induced_suggestion_pred_of_strength(strength, type);
            final SubLObject anytime_mt = hlmt_czer.canonicalize_hlmt(hlmt.new_hlmt((SubLObject)ConsesLow.list(mt, rkf_salient_descriptor.$const124$AnytimePSC)));
            SubLObject query_sentence = (SubLObject)ConsesLow.list(sugg_pred, superior, var);
            if (rkf_salient_descriptor.NIL != omit_preds_for_genlsP) {
                query_sentence = (SubLObject)ConsesLow.list(rkf_salient_descriptor.$const78$and, query_sentence, (SubLObject)ConsesLow.list(rkf_salient_descriptor.$const125$unknownSentence, (SubLObject)ConsesLow.list(rkf_salient_descriptor.$const76$thereExists, (SubLObject)rkf_salient_descriptor.$sym126$_GENL, (SubLObject)ConsesLow.list(rkf_salient_descriptor.$const78$and, (SubLObject)ConsesLow.listS(rkf_salient_descriptor.$const25$genls, superior, (SubLObject)rkf_salient_descriptor.$list127), (SubLObject)ConsesLow.listS(rkf_salient_descriptor.$const128$different, superior, (SubLObject)rkf_salient_descriptor.$list127), (SubLObject)ConsesLow.list(sugg_pred, (SubLObject)rkf_salient_descriptor.$sym126$_GENL, var)))));
            }
            thread.resetMultipleValues();
            final SubLObject preds = inference_kernel.new_cyc_query(query_sentence, anytime_mt, v_properties);
            final SubLObject reason = thread.secondMultipleValue();
            thread.resetMultipleValues();
            if (rkf_salient_descriptor.NIL == subl_promotions.memberP(reason, (SubLObject)rkf_salient_descriptor.$list129, (SubLObject)rkf_salient_descriptor.UNPROVIDED, (SubLObject)rkf_salient_descriptor.UNPROVIDED)) {
                Errors.warn((SubLObject)rkf_salient_descriptor.$str130$_S___halted_with_reason__S__, query_sentence, reason);
            }
            SubLObject cdolist_list_var = preds;
            SubLObject pred = (SubLObject)rkf_salient_descriptor.NIL;
            pred = cdolist_list_var.first();
            while (rkf_salient_descriptor.NIL != cdolist_list_var) {
                if (rkf_salient_descriptor.NIL == rkf_sd_never_use_binary_pred_p(pred)) {
                    final SubLObject count2 = ask_utilities.query_variable((SubLObject)rkf_salient_descriptor.$sym131$_COUNT, (SubLObject)ConsesLow.listS(rkf_salient_descriptor.$const132$assertedArg1BinaryPreds_Count, superior, pred, (SubLObject)rkf_salient_descriptor.$list133), mt, v_properties).first();
                    if (count2.isInteger()) {
                        ans = (SubLObject)ConsesLow.cons((SubLObject)ConsesLow.cons(pred, count2), ans);
                    }
                }
                cdolist_list_var = cdolist_list_var.rest();
                pred = cdolist_list_var.first();
            }
        }
        finally {
            rkf_salient_descriptor.$rkf_salient_descriptor_transformation_cutoff$.rebind(_prev_bind_0, thread);
        }
        return ans;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/rkf-salient-descriptor.lisp", position = 36594L)
    public static SubLObject rkf_noninduced_salient_descriptor_binary_preds(final SubLObject mt, final SubLObject superior, final SubLObject isa_or_genls) {
        if (isa_or_genls.eql((SubLObject)rkf_salient_descriptor.$kw21$ISA)) {
            SubLObject ans = (SubLObject)rkf_salient_descriptor.NIL;
            final SubLObject var = (SubLObject)rkf_salient_descriptor.$sym123$_PRED;
            final SubLObject v_properties = rkf_sd_binary_preds_inference_properties(var);
            SubLObject cdolist_list_var;
            final SubLObject preds = cdolist_list_var = inference_kernel.new_cyc_query((SubLObject)ConsesLow.list(rkf_salient_descriptor.$const136$keRelevantPreds, superior, var), mt, v_properties);
            SubLObject pred = (SubLObject)rkf_salient_descriptor.NIL;
            pred = cdolist_list_var.first();
            while (rkf_salient_descriptor.NIL != cdolist_list_var) {
                if (rkf_salient_descriptor.NIL == rkf_sd_never_use_binary_pred_p(pred)) {
                    ans = (SubLObject)ConsesLow.cons(pred, ans);
                }
                cdolist_list_var = cdolist_list_var.rest();
                pred = cdolist_list_var.first();
            }
            return ans;
        }
        return (SubLObject)rkf_salient_descriptor.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/rkf-salient-descriptor.lisp", position = 37064L)
    public static SubLObject rkf_sd_never_use_binary_pred_p(final SubLObject pred) {
        return Equality.eq(pred, rkf_salient_descriptor.$const24$isa);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/rkf-salient-descriptor.lisp", position = 37149L)
    public static SubLObject rkf_salient_descriptor_get_inferiors_internal(final SubLObject mt, final SubLObject superior, final SubLObject type, SubLObject inferior_max) {
        if (inferior_max == rkf_salient_descriptor.UNPROVIDED) {
            inferior_max = (SubLObject)rkf_salient_descriptor.$int138$200;
        }
        final SubLObject inferior_fn = (SubLObject)((type == rkf_salient_descriptor.$kw21$ISA) ? rkf_salient_descriptor.$sym139$INSTANCES : rkf_salient_descriptor.$sym140$SPECS);
        SubLObject inferiors = (SubLObject)rkf_salient_descriptor.NIL;
        SubLObject target_num = (SubLObject)rkf_salient_descriptor.NIL;
        SubLObject specs = (SubLObject)rkf_salient_descriptor.NIL;
        target_num = inferior_max;
        SubLObject new_inferiors;
        for (specs = (SubLObject)ConsesLow.cons(superior, genls.specs(superior, mt, (SubLObject)rkf_salient_descriptor.UNPROVIDED)); rkf_salient_descriptor.NIL != specs && rkf_salient_descriptor.NIL == list_utilities.lengthGE(inferiors, inferior_max, (SubLObject)rkf_salient_descriptor.UNPROVIDED); inferiors = ConsesLow.nconc(inferiors, new_inferiors), target_num = Numbers.subtract(inferior_max, Sequences.length(inferiors)), specs = specs.rest()) {
            final SubLObject current_term = specs.first();
            new_inferiors = list_utilities.random_n(target_num, Functions.funcall(inferior_fn, current_term, mt));
        }
        return inferiors;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/rkf-salient-descriptor.lisp", position = 37149L)
    public static SubLObject rkf_salient_descriptor_get_inferiors(final SubLObject mt, final SubLObject superior, final SubLObject type, SubLObject inferior_max) {
        if (inferior_max == rkf_salient_descriptor.UNPROVIDED) {
            inferior_max = (SubLObject)rkf_salient_descriptor.$int138$200;
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject v_memoization_state = memoization_state.$memoization_state$.getDynamicValue(thread);
        SubLObject caching_state = (SubLObject)rkf_salient_descriptor.NIL;
        if (rkf_salient_descriptor.NIL == v_memoization_state) {
            return rkf_salient_descriptor_get_inferiors_internal(mt, superior, type, inferior_max);
        }
        caching_state = memoization_state.memoization_state_lookup(v_memoization_state, (SubLObject)rkf_salient_descriptor.$sym137$RKF_SALIENT_DESCRIPTOR_GET_INFERIORS, (SubLObject)rkf_salient_descriptor.UNPROVIDED);
        if (rkf_salient_descriptor.NIL == caching_state) {
            caching_state = memoization_state.create_caching_state(memoization_state.memoization_state_lock(v_memoization_state), (SubLObject)rkf_salient_descriptor.$sym137$RKF_SALIENT_DESCRIPTOR_GET_INFERIORS, (SubLObject)rkf_salient_descriptor.FOUR_INTEGER, (SubLObject)rkf_salient_descriptor.NIL, (SubLObject)rkf_salient_descriptor.EQUAL, (SubLObject)rkf_salient_descriptor.UNPROVIDED);
            memoization_state.memoization_state_put(v_memoization_state, (SubLObject)rkf_salient_descriptor.$sym137$RKF_SALIENT_DESCRIPTOR_GET_INFERIORS, caching_state);
        }
        final SubLObject sxhash = memoization_state.sxhash_calc_4(mt, superior, type, inferior_max);
        final SubLObject collisions = memoization_state.caching_state_lookup(caching_state, sxhash, (SubLObject)rkf_salient_descriptor.UNPROVIDED);
        if (!collisions.eql(memoization_state.$memoized_item_not_found$.getGlobalValue())) {
            SubLObject cdolist_list_var = collisions;
            SubLObject collision = (SubLObject)rkf_salient_descriptor.NIL;
            collision = cdolist_list_var.first();
            while (rkf_salient_descriptor.NIL != cdolist_list_var) {
                SubLObject cached_args = collision.first();
                final SubLObject results2 = conses_high.second(collision);
                if (mt.equal(cached_args.first())) {
                    cached_args = cached_args.rest();
                    if (superior.equal(cached_args.first())) {
                        cached_args = cached_args.rest();
                        if (type.equal(cached_args.first())) {
                            cached_args = cached_args.rest();
                            if (rkf_salient_descriptor.NIL != cached_args && rkf_salient_descriptor.NIL == cached_args.rest() && inferior_max.equal(cached_args.first())) {
                                return memoization_state.caching_results(results2);
                            }
                        }
                    }
                }
                cdolist_list_var = cdolist_list_var.rest();
                collision = cdolist_list_var.first();
            }
        }
        final SubLObject results3 = Values.arg2(thread.resetMultipleValues(), (SubLObject)Values.multiple_value_list(rkf_salient_descriptor_get_inferiors_internal(mt, superior, type, inferior_max)));
        memoization_state.caching_state_enter_multi_key_n(caching_state, sxhash, collisions, results3, (SubLObject)ConsesLow.list(mt, superior, type, inferior_max));
        return memoization_state.caching_results(results3);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/rkf-salient-descriptor.lisp", position = 37747L)
    public static SubLObject rkf_salient_descriptor_binary_pred_type_violationP_internal(final SubLObject v_term, final SubLObject binary_pred, final SubLObject mt) {
        final SubLObject arg1_genls = kb_accessors.arg1_genl(binary_pred, mt);
        SubLObject malP = (SubLObject)rkf_salient_descriptor.NIL;
        if (rkf_salient_descriptor.NIL == malP) {
            SubLObject csome_list_var = arg1_genls;
            SubLObject arg1_genl = (SubLObject)rkf_salient_descriptor.NIL;
            arg1_genl = csome_list_var.first();
            while (rkf_salient_descriptor.NIL == malP && rkf_salient_descriptor.NIL != csome_list_var) {
                if (rkf_salient_descriptor.NIL != disjoint_with.collections_disjointP(v_term, arg1_genl, mt)) {
                    Errors.warn((SubLObject)rkf_salient_descriptor.$str142$violation___S_not_a_known_spec_of, v_term, arg1_genl, mt);
                    malP = (SubLObject)rkf_salient_descriptor.T;
                }
                csome_list_var = csome_list_var.rest();
                arg1_genl = csome_list_var.first();
            }
        }
        return malP;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/rkf-salient-descriptor.lisp", position = 37747L)
    public static SubLObject rkf_salient_descriptor_binary_pred_type_violationP(final SubLObject v_term, final SubLObject binary_pred, final SubLObject mt) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject v_memoization_state = memoization_state.$memoization_state$.getDynamicValue(thread);
        SubLObject caching_state = (SubLObject)rkf_salient_descriptor.NIL;
        if (rkf_salient_descriptor.NIL == v_memoization_state) {
            return rkf_salient_descriptor_binary_pred_type_violationP_internal(v_term, binary_pred, mt);
        }
        caching_state = memoization_state.memoization_state_lookup(v_memoization_state, (SubLObject)rkf_salient_descriptor.$sym141$RKF_SALIENT_DESCRIPTOR_BINARY_PRED_TYPE_VIOLATION_, (SubLObject)rkf_salient_descriptor.UNPROVIDED);
        if (rkf_salient_descriptor.NIL == caching_state) {
            caching_state = memoization_state.create_caching_state(memoization_state.memoization_state_lock(v_memoization_state), (SubLObject)rkf_salient_descriptor.$sym141$RKF_SALIENT_DESCRIPTOR_BINARY_PRED_TYPE_VIOLATION_, (SubLObject)rkf_salient_descriptor.THREE_INTEGER, (SubLObject)rkf_salient_descriptor.NIL, (SubLObject)rkf_salient_descriptor.EQUAL, (SubLObject)rkf_salient_descriptor.UNPROVIDED);
            memoization_state.memoization_state_put(v_memoization_state, (SubLObject)rkf_salient_descriptor.$sym141$RKF_SALIENT_DESCRIPTOR_BINARY_PRED_TYPE_VIOLATION_, caching_state);
        }
        final SubLObject sxhash = memoization_state.sxhash_calc_3(v_term, binary_pred, mt);
        final SubLObject collisions = memoization_state.caching_state_lookup(caching_state, sxhash, (SubLObject)rkf_salient_descriptor.UNPROVIDED);
        if (!collisions.eql(memoization_state.$memoized_item_not_found$.getGlobalValue())) {
            SubLObject cdolist_list_var = collisions;
            SubLObject collision = (SubLObject)rkf_salient_descriptor.NIL;
            collision = cdolist_list_var.first();
            while (rkf_salient_descriptor.NIL != cdolist_list_var) {
                SubLObject cached_args = collision.first();
                final SubLObject results2 = conses_high.second(collision);
                if (v_term.equal(cached_args.first())) {
                    cached_args = cached_args.rest();
                    if (binary_pred.equal(cached_args.first())) {
                        cached_args = cached_args.rest();
                        if (rkf_salient_descriptor.NIL != cached_args && rkf_salient_descriptor.NIL == cached_args.rest() && mt.equal(cached_args.first())) {
                            return memoization_state.caching_results(results2);
                        }
                    }
                }
                cdolist_list_var = cdolist_list_var.rest();
                collision = cdolist_list_var.first();
            }
        }
        final SubLObject results3 = Values.arg2(thread.resetMultipleValues(), (SubLObject)Values.multiple_value_list(rkf_salient_descriptor_binary_pred_type_violationP_internal(v_term, binary_pred, mt)));
        memoization_state.caching_state_enter_multi_key_n(caching_state, sxhash, collisions, results3, (SubLObject)ConsesLow.list(v_term, binary_pred, mt));
        return memoization_state.caching_results(results3);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/rkf-salient-descriptor.lisp", position = 38257L)
    public static SubLObject rkf_term_binary_preds_internal(final SubLObject v_term, final SubLObject mt) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject preds = (SubLObject)rkf_salient_descriptor.NIL;
        final SubLObject generality_cutoff = (SubLObject)rkf_salient_descriptor.$int144$10000;
        final SubLObject mt_var = mt_relevance_macros.with_inference_mt_relevance_validate(mt);
        final SubLObject _prev_bind_0 = mt_relevance_macros.$mt$.currentBinding(thread);
        final SubLObject _prev_bind_2 = mt_relevance_macros.$relevant_mt_function$.currentBinding(thread);
        final SubLObject _prev_bind_3 = mt_relevance_macros.$relevant_mts$.currentBinding(thread);
        try {
            mt_relevance_macros.$mt$.bind(mt_relevance_macros.update_inference_mt_relevance_mt(mt_var), thread);
            mt_relevance_macros.$relevant_mt_function$.bind(mt_relevance_macros.update_inference_mt_relevance_function(mt_var), thread);
            mt_relevance_macros.$relevant_mts$.bind(mt_relevance_macros.update_inference_mt_relevance_mt_list(mt_var), thread);
            final SubLObject pred_var = (SubLObject)rkf_salient_descriptor.NIL;
            if (rkf_salient_descriptor.NIL != kb_mapping_macros.do_gaf_arg_index_key_validator(v_term, (SubLObject)rkf_salient_descriptor.ONE_INTEGER, pred_var)) {
                final SubLObject iterator_var = kb_mapping_macros.new_gaf_arg_final_index_spec_iterator(v_term, (SubLObject)rkf_salient_descriptor.ONE_INTEGER, pred_var);
                SubLObject done_var = (SubLObject)rkf_salient_descriptor.NIL;
                final SubLObject token_var = (SubLObject)rkf_salient_descriptor.NIL;
                while (rkf_salient_descriptor.NIL == done_var) {
                    final SubLObject final_index_spec = iteration.iteration_next_without_values_macro_helper(iterator_var, token_var);
                    final SubLObject valid = (SubLObject)SubLObjectFactory.makeBoolean(!token_var.eql(final_index_spec));
                    if (rkf_salient_descriptor.NIL != valid) {
                        SubLObject final_index_iterator = (SubLObject)rkf_salient_descriptor.NIL;
                        try {
                            final_index_iterator = kb_mapping_macros.new_final_index_iterator(final_index_spec, (SubLObject)rkf_salient_descriptor.$kw145$GAF, (SubLObject)rkf_salient_descriptor.NIL, (SubLObject)rkf_salient_descriptor.NIL);
                            SubLObject done_var_$91 = (SubLObject)rkf_salient_descriptor.NIL;
                            final SubLObject token_var_$92 = (SubLObject)rkf_salient_descriptor.NIL;
                            while (rkf_salient_descriptor.NIL == done_var_$91) {
                                final SubLObject as = iteration.iteration_next_without_values_macro_helper(final_index_iterator, token_var_$92);
                                final SubLObject valid_$93 = (SubLObject)SubLObjectFactory.makeBoolean(!token_var_$92.eql(as));
                                if (rkf_salient_descriptor.NIL != valid_$93) {
                                    final SubLObject pred = assertions_high.gaf_arg0(as);
                                    if (rkf_salient_descriptor.NIL != assertions_high.asserted_assertionP(as) && rkf_salient_descriptor.NIL != list_utilities.lengthE(assertions_high.gaf_formula(as), (SubLObject)rkf_salient_descriptor.THREE_INTEGER, (SubLObject)rkf_salient_descriptor.UNPROVIDED) && cardinality_estimates.generality_estimate(pred).numL(generality_cutoff) && rkf_salient_descriptor.NIL == lexicon_vars.name_string_predP(pred) && rkf_salient_descriptor.NIL == lexicon_vars.term_strings_predP(pred) && rkf_salient_descriptor.NIL == rkf_relevance_utilities.rkf_irrelevant_term(pred, mt)) {
                                        final SubLObject item_var = pred;
                                        if (rkf_salient_descriptor.NIL == conses_high.member(item_var, preds, Symbols.symbol_function((SubLObject)rkf_salient_descriptor.EQL), Symbols.symbol_function((SubLObject)rkf_salient_descriptor.IDENTITY))) {
                                            preds = (SubLObject)ConsesLow.cons(item_var, preds);
                                        }
                                    }
                                }
                                done_var_$91 = (SubLObject)SubLObjectFactory.makeBoolean(rkf_salient_descriptor.NIL == valid_$93);
                            }
                        }
                        finally {
                            final SubLObject _prev_bind_0_$94 = Threads.$is_thread_performing_cleanupP$.currentBinding(thread);
                            try {
                                Threads.$is_thread_performing_cleanupP$.bind((SubLObject)rkf_salient_descriptor.T, thread);
                                final SubLObject _values = Values.getValuesAsVector();
                                if (rkf_salient_descriptor.NIL != final_index_iterator) {
                                    kb_mapping_macros.destroy_final_index_iterator(final_index_iterator);
                                }
                                Values.restoreValuesFromVector(_values);
                            }
                            finally {
                                Threads.$is_thread_performing_cleanupP$.rebind(_prev_bind_0_$94, thread);
                            }
                        }
                    }
                    done_var = (SubLObject)SubLObjectFactory.makeBoolean(rkf_salient_descriptor.NIL == valid);
                }
            }
        }
        finally {
            mt_relevance_macros.$relevant_mts$.rebind(_prev_bind_3, thread);
            mt_relevance_macros.$relevant_mt_function$.rebind(_prev_bind_2, thread);
            mt_relevance_macros.$mt$.rebind(_prev_bind_0, thread);
        }
        return preds;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/rkf-salient-descriptor.lisp", position = 38257L)
    public static SubLObject rkf_term_binary_preds(final SubLObject v_term, final SubLObject mt) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject v_memoization_state = memoization_state.$memoization_state$.getDynamicValue(thread);
        SubLObject caching_state = (SubLObject)rkf_salient_descriptor.NIL;
        if (rkf_salient_descriptor.NIL == v_memoization_state) {
            return rkf_term_binary_preds_internal(v_term, mt);
        }
        caching_state = memoization_state.memoization_state_lookup(v_memoization_state, (SubLObject)rkf_salient_descriptor.$sym143$RKF_TERM_BINARY_PREDS, (SubLObject)rkf_salient_descriptor.UNPROVIDED);
        if (rkf_salient_descriptor.NIL == caching_state) {
            caching_state = memoization_state.create_caching_state(memoization_state.memoization_state_lock(v_memoization_state), (SubLObject)rkf_salient_descriptor.$sym143$RKF_TERM_BINARY_PREDS, (SubLObject)rkf_salient_descriptor.TWO_INTEGER, (SubLObject)rkf_salient_descriptor.NIL, (SubLObject)rkf_salient_descriptor.EQUAL, (SubLObject)rkf_salient_descriptor.UNPROVIDED);
            memoization_state.memoization_state_put(v_memoization_state, (SubLObject)rkf_salient_descriptor.$sym143$RKF_TERM_BINARY_PREDS, caching_state);
        }
        final SubLObject sxhash = memoization_state.sxhash_calc_2(v_term, mt);
        final SubLObject collisions = memoization_state.caching_state_lookup(caching_state, sxhash, (SubLObject)rkf_salient_descriptor.UNPROVIDED);
        if (!collisions.eql(memoization_state.$memoized_item_not_found$.getGlobalValue())) {
            SubLObject cdolist_list_var = collisions;
            SubLObject collision = (SubLObject)rkf_salient_descriptor.NIL;
            collision = cdolist_list_var.first();
            while (rkf_salient_descriptor.NIL != cdolist_list_var) {
                SubLObject cached_args = collision.first();
                final SubLObject results2 = conses_high.second(collision);
                if (v_term.equal(cached_args.first())) {
                    cached_args = cached_args.rest();
                    if (rkf_salient_descriptor.NIL != cached_args && rkf_salient_descriptor.NIL == cached_args.rest() && mt.equal(cached_args.first())) {
                        return memoization_state.caching_results(results2);
                    }
                }
                cdolist_list_var = cdolist_list_var.rest();
                collision = cdolist_list_var.first();
            }
        }
        final SubLObject results3 = Values.arg2(thread.resetMultipleValues(), (SubLObject)Values.multiple_value_list(rkf_term_binary_preds_internal(v_term, mt)));
        memoization_state.caching_state_enter_multi_key_n(caching_state, sxhash, collisions, results3, (SubLObject)ConsesLow.list(v_term, mt));
        return memoization_state.caching_results(results3);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/rkf-salient-descriptor.lisp", position = 38892L)
    public static SubLObject rkf_term_meta_isas(final SubLObject v_term, final SubLObject mt) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject meta_isas = (SubLObject)rkf_salient_descriptor.NIL;
        final SubLObject mt_var = mt_relevance_macros.with_inference_mt_relevance_validate(mt);
        final SubLObject _prev_bind_0 = mt_relevance_macros.$mt$.currentBinding(thread);
        final SubLObject _prev_bind_2 = mt_relevance_macros.$relevant_mt_function$.currentBinding(thread);
        final SubLObject _prev_bind_3 = mt_relevance_macros.$relevant_mts$.currentBinding(thread);
        try {
            mt_relevance_macros.$mt$.bind(mt_relevance_macros.update_inference_mt_relevance_mt(mt_var), thread);
            mt_relevance_macros.$relevant_mt_function$.bind(mt_relevance_macros.update_inference_mt_relevance_function(mt_var), thread);
            mt_relevance_macros.$relevant_mts$.bind(mt_relevance_macros.update_inference_mt_relevance_mt_list(mt_var), thread);
            SubLObject cdolist_list_var = rkf_close_isas(v_term, mt);
            SubLObject v_isa = (SubLObject)rkf_salient_descriptor.NIL;
            v_isa = cdolist_list_var.first();
            while (rkf_salient_descriptor.NIL != cdolist_list_var) {
                SubLObject cdolist_list_var_$95 = rkf_close_isas(v_isa, mt);
                SubLObject meta_isa = (SubLObject)rkf_salient_descriptor.NIL;
                meta_isa = cdolist_list_var_$95.first();
                while (rkf_salient_descriptor.NIL != cdolist_list_var_$95) {
                    if (rkf_salient_descriptor.NIL == rkf_relevance_utilities.rkf_irrelevant_term(meta_isa, mt)) {
                        final SubLObject item_var = meta_isa;
                        if (rkf_salient_descriptor.NIL == conses_high.member(item_var, meta_isas, Symbols.symbol_function((SubLObject)rkf_salient_descriptor.EQL), Symbols.symbol_function((SubLObject)rkf_salient_descriptor.IDENTITY))) {
                            meta_isas = (SubLObject)ConsesLow.cons(item_var, meta_isas);
                        }
                    }
                    cdolist_list_var_$95 = cdolist_list_var_$95.rest();
                    meta_isa = cdolist_list_var_$95.first();
                }
                cdolist_list_var = cdolist_list_var.rest();
                v_isa = cdolist_list_var.first();
            }
        }
        finally {
            mt_relevance_macros.$relevant_mts$.rebind(_prev_bind_3, thread);
            mt_relevance_macros.$relevant_mt_function$.rebind(_prev_bind_2, thread);
            mt_relevance_macros.$mt$.rebind(_prev_bind_0, thread);
        }
        return meta_isas;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/rkf-salient-descriptor.lisp", position = 39282L)
    public static SubLObject rkf_term_all_meta_isas_internal(final SubLObject v_term, final SubLObject mt) {
        SubLObject meta_isas = (SubLObject)rkf_salient_descriptor.NIL;
        SubLObject irrelevant = (SubLObject)rkf_salient_descriptor.NIL;
        SubLObject cdolist_list_var = isa.all_isa(v_term, mt, (SubLObject)rkf_salient_descriptor.UNPROVIDED);
        SubLObject v_isa = (SubLObject)rkf_salient_descriptor.NIL;
        v_isa = cdolist_list_var.first();
        while (rkf_salient_descriptor.NIL != cdolist_list_var) {
            SubLObject cdolist_list_var_$96 = isa.all_isa(v_isa, mt, (SubLObject)rkf_salient_descriptor.UNPROVIDED);
            SubLObject meta_isa = (SubLObject)rkf_salient_descriptor.NIL;
            meta_isa = cdolist_list_var_$96.first();
            while (rkf_salient_descriptor.NIL != cdolist_list_var_$96) {
                if (rkf_salient_descriptor.NIL == conses_high.member(meta_isa, meta_isas, (SubLObject)rkf_salient_descriptor.UNPROVIDED, (SubLObject)rkf_salient_descriptor.UNPROVIDED)) {
                    if (rkf_salient_descriptor.NIL != rkf_relevance_utilities.rkf_irrelevant_term(meta_isa, mt)) {
                        final SubLObject item_var = meta_isa;
                        if (rkf_salient_descriptor.NIL == conses_high.member(item_var, irrelevant, Symbols.symbol_function((SubLObject)rkf_salient_descriptor.EQL), Symbols.symbol_function((SubLObject)rkf_salient_descriptor.IDENTITY))) {
                            irrelevant = (SubLObject)ConsesLow.cons(item_var, irrelevant);
                        }
                    }
                    else if (rkf_salient_descriptor.NIL == subl_promotions.memberP(meta_isa, irrelevant, (SubLObject)rkf_salient_descriptor.UNPROVIDED, (SubLObject)rkf_salient_descriptor.UNPROVIDED)) {
                        meta_isas = (SubLObject)ConsesLow.cons(meta_isa, meta_isas);
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
    public static SubLObject rkf_term_all_meta_isas(final SubLObject v_term, final SubLObject mt) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject v_memoization_state = memoization_state.$memoization_state$.getDynamicValue(thread);
        SubLObject caching_state = (SubLObject)rkf_salient_descriptor.NIL;
        if (rkf_salient_descriptor.NIL == v_memoization_state) {
            return rkf_term_all_meta_isas_internal(v_term, mt);
        }
        caching_state = memoization_state.memoization_state_lookup(v_memoization_state, (SubLObject)rkf_salient_descriptor.$sym146$RKF_TERM_ALL_META_ISAS, (SubLObject)rkf_salient_descriptor.UNPROVIDED);
        if (rkf_salient_descriptor.NIL == caching_state) {
            caching_state = memoization_state.create_caching_state(memoization_state.memoization_state_lock(v_memoization_state), (SubLObject)rkf_salient_descriptor.$sym146$RKF_TERM_ALL_META_ISAS, (SubLObject)rkf_salient_descriptor.TWO_INTEGER, (SubLObject)rkf_salient_descriptor.NIL, (SubLObject)rkf_salient_descriptor.EQUAL, (SubLObject)rkf_salient_descriptor.UNPROVIDED);
            memoization_state.memoization_state_put(v_memoization_state, (SubLObject)rkf_salient_descriptor.$sym146$RKF_TERM_ALL_META_ISAS, caching_state);
        }
        final SubLObject sxhash = memoization_state.sxhash_calc_2(v_term, mt);
        final SubLObject collisions = memoization_state.caching_state_lookup(caching_state, sxhash, (SubLObject)rkf_salient_descriptor.UNPROVIDED);
        if (!collisions.eql(memoization_state.$memoized_item_not_found$.getGlobalValue())) {
            SubLObject cdolist_list_var = collisions;
            SubLObject collision = (SubLObject)rkf_salient_descriptor.NIL;
            collision = cdolist_list_var.first();
            while (rkf_salient_descriptor.NIL != cdolist_list_var) {
                SubLObject cached_args = collision.first();
                final SubLObject results2 = conses_high.second(collision);
                if (v_term.equal(cached_args.first())) {
                    cached_args = cached_args.rest();
                    if (rkf_salient_descriptor.NIL != cached_args && rkf_salient_descriptor.NIL == cached_args.rest() && mt.equal(cached_args.first())) {
                        return memoization_state.caching_results(results2);
                    }
                }
                cdolist_list_var = cdolist_list_var.rest();
                collision = cdolist_list_var.first();
            }
        }
        final SubLObject results3 = Values.arg2(thread.resetMultipleValues(), (SubLObject)Values.multiple_value_list(rkf_term_all_meta_isas_internal(v_term, mt)));
        memoization_state.caching_state_enter_multi_key_n(caching_state, sxhash, collisions, results3, (SubLObject)ConsesLow.list(v_term, mt));
        return memoization_state.caching_results(results3);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/rkf-salient-descriptor.lisp", position = 39763L)
    public static SubLObject rkf_rule_cnfs_for_term(final SubLObject rule, final SubLObject v_term, SubLObject mt) {
        if (mt == rkf_salient_descriptor.UNPROVIDED) {
            mt = control_vars.$rkf_mt$.getDynamicValue();
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject cnf_pairs = (SubLObject)rkf_salient_descriptor.NIL;
        final SubLObject el_cnf = rkf_sd_el_cnf_of_rule(rule);
        final SubLObject local_state;
        final SubLObject state = local_state = memoization_state.possibly_new_memoization_state();
        final SubLObject _prev_bind_0 = memoization_state.$memoization_state$.currentBinding(thread);
        try {
            memoization_state.$memoization_state$.bind(local_state, thread);
            final SubLObject original_memoization_process = memoization_state.memoization_state_original_process(local_state);
            try {
                final SubLObject already_resourcing_p = sbhl_marking_vars.$resourcing_sbhl_marking_spaces_p$.getDynamicValue(thread);
                final SubLObject _prev_bind_0_$97 = sbhl_marking_vars.$resourced_sbhl_marking_space_limit$.currentBinding(thread);
                final SubLObject _prev_bind_2 = sbhl_marking_vars.$resourced_sbhl_marking_spaces$.currentBinding(thread);
                final SubLObject _prev_bind_3 = sbhl_marking_vars.$resourcing_sbhl_marking_spaces_p$.currentBinding(thread);
                try {
                    sbhl_marking_vars.$resourced_sbhl_marking_space_limit$.bind(sbhl_marking_vars.determine_resource_limit(already_resourcing_p, (SubLObject)rkf_salient_descriptor.SIX_INTEGER), thread);
                    sbhl_marking_vars.$resourced_sbhl_marking_spaces$.bind(sbhl_marking_vars.possibly_new_marking_resource(already_resourcing_p), thread);
                    sbhl_marking_vars.$resourcing_sbhl_marking_spaces_p$.bind((SubLObject)rkf_salient_descriptor.T, thread);
                    final SubLObject mt_var = mt_relevance_macros.with_inference_mt_relevance_validate(mt);
                    final SubLObject _prev_bind_0_$98 = mt_relevance_macros.$mt$.currentBinding(thread);
                    final SubLObject _prev_bind_1_$99 = mt_relevance_macros.$relevant_mt_function$.currentBinding(thread);
                    final SubLObject _prev_bind_2_$100 = mt_relevance_macros.$relevant_mts$.currentBinding(thread);
                    try {
                        mt_relevance_macros.$mt$.bind(mt_relevance_macros.update_inference_mt_relevance_mt(mt_var), thread);
                        mt_relevance_macros.$relevant_mt_function$.bind(mt_relevance_macros.update_inference_mt_relevance_function(mt_var), thread);
                        mt_relevance_macros.$relevant_mts$.bind(mt_relevance_macros.update_inference_mt_relevance_mt_list(mt_var), thread);
                        SubLObject cdolist_list_var = rkf_partial_bindings_for_term(rule, v_term, mt);
                        SubLObject v_bindings = (SubLObject)rkf_salient_descriptor.NIL;
                        v_bindings = cdolist_list_var.first();
                        while (rkf_salient_descriptor.NIL != cdolist_list_var) {
                            SubLObject bound_el_cnf = conses_high.copy_tree(el_cnf);
                            SubLObject deduced_neg_lits = (SubLObject)rkf_salient_descriptor.NIL;
                            SubLObject justification_conjuncts = (SubLObject)rkf_salient_descriptor.NIL;
                            SubLObject cdolist_list_var_$101 = v_bindings;
                            SubLObject cons = (SubLObject)rkf_salient_descriptor.NIL;
                            cons = cdolist_list_var_$101.first();
                            while (rkf_salient_descriptor.NIL != cdolist_list_var_$101) {
                                SubLObject current;
                                final SubLObject datum = current = cons;
                                SubLObject var = (SubLObject)rkf_salient_descriptor.NIL;
                                SubLObject v_term_$102 = (SubLObject)rkf_salient_descriptor.NIL;
                                cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)rkf_salient_descriptor.$list147);
                                var = current.first();
                                current = (v_term_$102 = current.rest());
                                bound_el_cnf = conses_high.nsubst(v_term_$102, var, bound_el_cnf, (SubLObject)rkf_salient_descriptor.UNPROVIDED, (SubLObject)rkf_salient_descriptor.UNPROVIDED);
                                cdolist_list_var_$101 = cdolist_list_var_$101.rest();
                                cons = cdolist_list_var_$101.first();
                            }
                            SubLObject cdolist_list_var_$102 = clauses.neg_lits(bound_el_cnf);
                            SubLObject neg_lit = (SubLObject)rkf_salient_descriptor.NIL;
                            neg_lit = cdolist_list_var_$102.first();
                            while (rkf_salient_descriptor.NIL != cdolist_list_var_$102) {
                                if (rkf_salient_descriptor.NIL != cycl_utilities.expression_find_if((SubLObject)rkf_salient_descriptor.$sym148$EL_VAR_, neg_lit, (SubLObject)rkf_salient_descriptor.UNPROVIDED, (SubLObject)rkf_salient_descriptor.UNPROVIDED) || rkf_salient_descriptor.NIL == rkf_sd_known(neg_lit, mt, (SubLObject)rkf_salient_descriptor.UNPROVIDED)) {
                                    deduced_neg_lits = (SubLObject)ConsesLow.cons(neg_lit, deduced_neg_lits);
                                }
                                else {
                                    justification_conjuncts = (SubLObject)ConsesLow.cons(neg_lit, justification_conjuncts);
                                }
                                cdolist_list_var_$102 = cdolist_list_var_$102.rest();
                                neg_lit = cdolist_list_var_$102.first();
                            }
                            final SubLObject deduced_cnf = clauses.make_clause(deduced_neg_lits, clauses.pos_lits(bound_el_cnf));
                            final SubLObject justification_formula = rkf_sd_conjoin(justification_conjuncts, (SubLObject)rkf_salient_descriptor.NIL, (SubLObject)rkf_salient_descriptor.NIL);
                            final SubLObject item_var = (SubLObject)ConsesLow.list(deduced_cnf, justification_formula);
                            if (rkf_salient_descriptor.NIL == conses_high.member(item_var, cnf_pairs, Symbols.symbol_function((SubLObject)rkf_salient_descriptor.EQUAL), Symbols.symbol_function((SubLObject)rkf_salient_descriptor.IDENTITY))) {
                                cnf_pairs = (SubLObject)ConsesLow.cons(item_var, cnf_pairs);
                            }
                            cdolist_list_var = cdolist_list_var.rest();
                            v_bindings = cdolist_list_var.first();
                        }
                    }
                    finally {
                        mt_relevance_macros.$relevant_mts$.rebind(_prev_bind_2_$100, thread);
                        mt_relevance_macros.$relevant_mt_function$.rebind(_prev_bind_1_$99, thread);
                        mt_relevance_macros.$mt$.rebind(_prev_bind_0_$98, thread);
                    }
                }
                finally {
                    sbhl_marking_vars.$resourcing_sbhl_marking_spaces_p$.rebind(_prev_bind_3, thread);
                    sbhl_marking_vars.$resourced_sbhl_marking_spaces$.rebind(_prev_bind_2, thread);
                    sbhl_marking_vars.$resourced_sbhl_marking_space_limit$.rebind(_prev_bind_0_$97, thread);
                }
            }
            finally {
                final SubLObject _prev_bind_0_$99 = Threads.$is_thread_performing_cleanupP$.currentBinding(thread);
                try {
                    Threads.$is_thread_performing_cleanupP$.bind((SubLObject)rkf_salient_descriptor.T, thread);
                    final SubLObject _values = Values.getValuesAsVector();
                    memoization_state.memoization_state_possibly_clear_original_process(local_state, original_memoization_process);
                    Values.restoreValuesFromVector(_values);
                }
                finally {
                    Threads.$is_thread_performing_cleanupP$.rebind(_prev_bind_0_$99, thread);
                }
            }
        }
        finally {
            memoization_state.$memoization_state$.rebind(_prev_bind_0, thread);
        }
        return cnf_pairs;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/rkf-salient-descriptor.lisp", position = 40953L)
    public static SubLObject rkf_sd_el_cnf_of_rule(final SubLObject rule) {
        final SubLObject hl_cnf = assertions_high.assertion_cnf(rule);
        final SubLObject el_vars = assertions_high.assertion_el_variables(rule);
        return rkf_sd_el_cnf_of_hl_cnf(hl_cnf, el_vars);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/rkf-salient-descriptor.lisp", position = 41136L)
    public static SubLObject rkf_sd_el_cnf_of_hl_cnf(final SubLObject hl_cnf, final SubLObject el_vars) {
        SubLObject el_cnf = conses_high.copy_tree(hl_cnf);
        SubLObject list_var = (SubLObject)rkf_salient_descriptor.NIL;
        SubLObject el_var = (SubLObject)rkf_salient_descriptor.NIL;
        SubLObject i = (SubLObject)rkf_salient_descriptor.NIL;
        list_var = el_vars;
        el_var = list_var.first();
        for (i = (SubLObject)rkf_salient_descriptor.ZERO_INTEGER; rkf_salient_descriptor.NIL != list_var; list_var = list_var.rest(), el_var = list_var.first(), i = Numbers.add((SubLObject)rkf_salient_descriptor.ONE_INTEGER, i)) {
            final SubLObject hl_var = variables.get_variable(i);
            el_cnf = conses_high.nsubst(el_var, hl_var, el_cnf, (SubLObject)rkf_salient_descriptor.UNPROVIDED, (SubLObject)rkf_salient_descriptor.UNPROVIDED);
        }
        return el_cnf;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/rkf-salient-descriptor.lisp", position = 41382L)
    public static SubLObject rkf_sd_el_wffP_internal(final SubLObject el_formula, final SubLObject mt) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject wffP = (SubLObject)rkf_salient_descriptor.NIL;
        final SubLObject _prev_bind_0 = at_vars.$at_admit_consistent_nartsP$.currentBinding(thread);
        final SubLObject _prev_bind_2 = at_vars.$at_admit_consistent_nautsP$.currentBinding(thread);
        final SubLObject _prev_bind_3 = wff_vars.$provide_wff_suggestionsP$.currentBinding(thread);
        final SubLObject _prev_bind_4 = control_vars.$within_assert$.currentBinding(thread);
        final SubLObject _prev_bind_5 = control_vars.$suppress_conflict_noticesP$.currentBinding(thread);
        try {
            at_vars.$at_admit_consistent_nartsP$.bind((SubLObject)rkf_salient_descriptor.NIL, thread);
            at_vars.$at_admit_consistent_nautsP$.bind((SubLObject)rkf_salient_descriptor.NIL, thread);
            wff_vars.$provide_wff_suggestionsP$.bind((SubLObject)rkf_salient_descriptor.NIL, thread);
            control_vars.$within_assert$.bind((SubLObject)rkf_salient_descriptor.T, thread);
            control_vars.$suppress_conflict_noticesP$.bind((SubLObject)rkf_salient_descriptor.T, thread);
            wffP = wff.el_wffP(el_formula, mt, (SubLObject)rkf_salient_descriptor.UNPROVIDED);
        }
        finally {
            control_vars.$suppress_conflict_noticesP$.rebind(_prev_bind_5, thread);
            control_vars.$within_assert$.rebind(_prev_bind_4, thread);
            wff_vars.$provide_wff_suggestionsP$.rebind(_prev_bind_3, thread);
            at_vars.$at_admit_consistent_nautsP$.rebind(_prev_bind_2, thread);
            at_vars.$at_admit_consistent_nartsP$.rebind(_prev_bind_0, thread);
        }
        return wffP;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/rkf-salient-descriptor.lisp", position = 41382L)
    public static SubLObject rkf_sd_el_wffP(final SubLObject el_formula, final SubLObject mt) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject v_memoization_state = memoization_state.$memoization_state$.getDynamicValue(thread);
        SubLObject caching_state = (SubLObject)rkf_salient_descriptor.NIL;
        if (rkf_salient_descriptor.NIL == v_memoization_state) {
            return rkf_sd_el_wffP_internal(el_formula, mt);
        }
        caching_state = memoization_state.memoization_state_lookup(v_memoization_state, (SubLObject)rkf_salient_descriptor.$sym149$RKF_SD_EL_WFF_, (SubLObject)rkf_salient_descriptor.UNPROVIDED);
        if (rkf_salient_descriptor.NIL == caching_state) {
            caching_state = memoization_state.create_caching_state(memoization_state.memoization_state_lock(v_memoization_state), (SubLObject)rkf_salient_descriptor.$sym149$RKF_SD_EL_WFF_, (SubLObject)rkf_salient_descriptor.TWO_INTEGER, (SubLObject)rkf_salient_descriptor.NIL, (SubLObject)rkf_salient_descriptor.EQUAL, (SubLObject)rkf_salient_descriptor.UNPROVIDED);
            memoization_state.memoization_state_put(v_memoization_state, (SubLObject)rkf_salient_descriptor.$sym149$RKF_SD_EL_WFF_, caching_state);
        }
        final SubLObject sxhash = memoization_state.sxhash_calc_2(el_formula, mt);
        final SubLObject collisions = memoization_state.caching_state_lookup(caching_state, sxhash, (SubLObject)rkf_salient_descriptor.UNPROVIDED);
        if (!collisions.eql(memoization_state.$memoized_item_not_found$.getGlobalValue())) {
            SubLObject cdolist_list_var = collisions;
            SubLObject collision = (SubLObject)rkf_salient_descriptor.NIL;
            collision = cdolist_list_var.first();
            while (rkf_salient_descriptor.NIL != cdolist_list_var) {
                SubLObject cached_args = collision.first();
                final SubLObject results2 = conses_high.second(collision);
                if (el_formula.equal(cached_args.first())) {
                    cached_args = cached_args.rest();
                    if (rkf_salient_descriptor.NIL != cached_args && rkf_salient_descriptor.NIL == cached_args.rest() && mt.equal(cached_args.first())) {
                        return memoization_state.caching_results(results2);
                    }
                }
                cdolist_list_var = cdolist_list_var.rest();
                collision = cdolist_list_var.first();
            }
        }
        final SubLObject results3 = Values.arg2(thread.resetMultipleValues(), (SubLObject)Values.multiple_value_list(rkf_sd_el_wffP_internal(el_formula, mt)));
        memoization_state.caching_state_enter_multi_key_n(caching_state, sxhash, collisions, results3, (SubLObject)ConsesLow.list(el_formula, mt));
        return memoization_state.caching_results(results3);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/rkf-salient-descriptor.lisp", position = 41709L)
    public static SubLObject rkf_partial_bindings_for_term(final SubLObject rule, final SubLObject v_term, SubLObject mt) {
        if (mt == rkf_salient_descriptor.UNPROVIDED) {
            mt = control_vars.$rkf_mt$.getDynamicValue();
        }
        SubLObject ans = (SubLObject)rkf_salient_descriptor.NIL;
        if (rkf_salient_descriptor.NIL != genl_mts.genl_mtP(mt, assertions_high.assertion_mt(rule), (SubLObject)rkf_salient_descriptor.UNPROVIDED, (SubLObject)rkf_salient_descriptor.UNPROVIDED)) {
            final SubLObject rule_formula = uncanonicalizer.assertion_el_formula(rule);
            final SubLObject constraint_table = rkf_sd_constraint_table(rule_formula, mt);
            final SubLObject antecedent = cycl_utilities.formula_arg1(rule_formula, (SubLObject)rkf_salient_descriptor.UNPROVIDED);
            SubLObject cdolist_list_var = cycl_utilities.expression_gather(antecedent, (SubLObject)rkf_salient_descriptor.$sym148$EL_VAR_, (SubLObject)rkf_salient_descriptor.UNPROVIDED, (SubLObject)rkf_salient_descriptor.UNPROVIDED, (SubLObject)rkf_salient_descriptor.UNPROVIDED, (SubLObject)rkf_salient_descriptor.UNPROVIDED);
            SubLObject el_var = (SubLObject)rkf_salient_descriptor.NIL;
            el_var = cdolist_list_var.first();
            while (rkf_salient_descriptor.NIL != cdolist_list_var) {
                final SubLObject el_var_constraint_clauses = dictionary.dictionary_lookup(constraint_table, el_var, (SubLObject)rkf_salient_descriptor.UNPROVIDED);
                final SubLObject el_var_constraint_formula = rkf_sd_conjoin(el_var_constraint_clauses, (SubLObject)rkf_salient_descriptor.NIL, (SubLObject)rkf_salient_descriptor.NIL);
                final SubLObject substituted = cycl_utilities.expression_subst(v_term, el_var, el_var_constraint_formula, (SubLObject)rkf_salient_descriptor.UNPROVIDED, (SubLObject)rkf_salient_descriptor.UNPROVIDED);
                final SubLObject rejectedP = (SubLObject)SubLObjectFactory.makeBoolean(rkf_salient_descriptor.NIL != el_utilities.el_formula_p(substituted) && rkf_salient_descriptor.NIL != rkf_sd_rejected(substituted, mt));
                if (rkf_salient_descriptor.NIL == rejectedP) {
                    SubLObject cdolist_list_var_$105 = rkf_partial_bindings_for_term_var(el_var, v_term, antecedent, mt);
                    SubLObject new_bindings = (SubLObject)rkf_salient_descriptor.NIL;
                    new_bindings = cdolist_list_var_$105.first();
                    while (rkf_salient_descriptor.NIL != cdolist_list_var_$105) {
                        final SubLObject item_var = new_bindings;
                        if (rkf_salient_descriptor.NIL == conses_high.member(item_var, ans, Symbols.symbol_function((SubLObject)rkf_salient_descriptor.$sym150$ALIST__), Symbols.symbol_function((SubLObject)rkf_salient_descriptor.IDENTITY))) {
                            ans = (SubLObject)ConsesLow.cons(item_var, ans);
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
    public static SubLObject rkf_partial_bindings_for_term_var(final SubLObject el_var, final SubLObject v_term, final SubLObject antecedent, final SubLObject mt) {
        final SubLObject query_formula = conses_high.subst(v_term, el_var, antecedent, (SubLObject)rkf_salient_descriptor.UNPROVIDED, (SubLObject)rkf_salient_descriptor.UNPROVIDED);
        SubLObject ans = (SubLObject)rkf_salient_descriptor.NIL;
        SubLObject cdolist_list_var = rkf_partial_bindings_for_formula(query_formula, mt, (SubLObject)rkf_salient_descriptor.UNPROVIDED, (SubLObject)rkf_salient_descriptor.UNPROVIDED, (SubLObject)rkf_salient_descriptor.UNPROVIDED);
        SubLObject more_bindings = (SubLObject)rkf_salient_descriptor.NIL;
        more_bindings = cdolist_list_var.first();
        while (rkf_salient_descriptor.NIL != cdolist_list_var) {
            final SubLObject item_var;
            final SubLObject full_bindings = item_var = list_utilities.alist_enter(more_bindings, el_var, v_term, (SubLObject)rkf_salient_descriptor.UNPROVIDED);
            if (rkf_salient_descriptor.NIL == conses_high.member(item_var, ans, Symbols.symbol_function((SubLObject)rkf_salient_descriptor.$sym150$ALIST__), Symbols.symbol_function((SubLObject)rkf_salient_descriptor.IDENTITY))) {
                ans = (SubLObject)ConsesLow.cons(item_var, ans);
            }
            cdolist_list_var = cdolist_list_var.rest();
            more_bindings = cdolist_list_var.first();
        }
        return ans;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/rkf-salient-descriptor.lisp", position = 43341L)
    public static SubLObject rkf_partial_bindings_for_formula(final SubLObject formula, final SubLObject mt, SubLObject unbound_var_max, SubLObject unknown_clause_max, SubLObject bindings_max) {
        if (unbound_var_max == rkf_salient_descriptor.UNPROVIDED) {
            unbound_var_max = (SubLObject)rkf_salient_descriptor.TWO_INTEGER;
        }
        if (unknown_clause_max == rkf_salient_descriptor.UNPROVIDED) {
            unknown_clause_max = (SubLObject)rkf_salient_descriptor.TWO_INTEGER;
        }
        if (bindings_max == rkf_salient_descriptor.UNPROVIDED) {
            bindings_max = (SubLObject)rkf_salient_descriptor.TWO_INTEGER;
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject ans = (SubLObject)rkf_salient_descriptor.NIL;
        SubLObject doneP = (SubLObject)rkf_salient_descriptor.NIL;
        if (rkf_salient_descriptor.NIL != el_utilities.el_conjunction_p(formula) && rkf_salient_descriptor.NIL != rkf_sd_el_wffP(formula, mt) && rkf_salient_descriptor.NIL == rkf_sd_known(formula, mt, (SubLObject)rkf_salient_descriptor.UNPROVIDED)) {
            final SubLObject constraint_table = rkf_sd_constraint_table(formula, mt);
            final SubLObject _prev_bind_0 = api_control_vars.$generate_readable_fi_results$.currentBinding(thread);
            try {
                api_control_vars.$generate_readable_fi_results$.bind((SubLObject)rkf_salient_descriptor.NIL, thread);
                if (rkf_salient_descriptor.NIL == doneP) {
                    SubLObject csome_list_var = cycl_utilities.formula_args(formula, (SubLObject)rkf_salient_descriptor.UNPROVIDED);
                    SubLObject conjunct = (SubLObject)rkf_salient_descriptor.NIL;
                    conjunct = csome_list_var.first();
                    while (rkf_salient_descriptor.NIL == doneP && rkf_salient_descriptor.NIL != csome_list_var) {
                        if (rkf_salient_descriptor.NIL == rkf_sd_el_fully_bound_p(conjunct)) {
                            SubLObject constraint_clauses = (SubLObject)rkf_salient_descriptor.NIL;
                            SubLObject cdolist_list_var = cycl_utilities.expression_gather(conjunct, (SubLObject)rkf_salient_descriptor.$sym148$EL_VAR_, (SubLObject)rkf_salient_descriptor.UNPROVIDED, (SubLObject)rkf_salient_descriptor.UNPROVIDED, (SubLObject)rkf_salient_descriptor.UNPROVIDED, (SubLObject)rkf_salient_descriptor.UNPROVIDED);
                            SubLObject conjunct_var = (SubLObject)rkf_salient_descriptor.NIL;
                            conjunct_var = cdolist_list_var.first();
                            while (rkf_salient_descriptor.NIL != cdolist_list_var) {
                                constraint_clauses = (SubLObject)ConsesLow.cons((SubLObject)ConsesLow.list(rkf_salient_descriptor.$const125$unknownSentence, (SubLObject)ConsesLow.listS(rkf_salient_descriptor.$const151$quotedIsa, conjunct_var, (SubLObject)rkf_salient_descriptor.$list152)), constraint_clauses);
                                SubLObject cdolist_list_var_$106 = dictionary.dictionary_lookup(constraint_table, conjunct_var, (SubLObject)rkf_salient_descriptor.UNPROVIDED);
                                SubLObject clause = (SubLObject)rkf_salient_descriptor.NIL;
                                clause = cdolist_list_var_$106.first();
                                while (rkf_salient_descriptor.NIL != cdolist_list_var_$106) {
                                    constraint_clauses = (SubLObject)ConsesLow.cons(clause, constraint_clauses);
                                    cdolist_list_var_$106 = cdolist_list_var_$106.rest();
                                    clause = cdolist_list_var_$106.first();
                                }
                                cdolist_list_var = cdolist_list_var.rest();
                                conjunct_var = cdolist_list_var.first();
                            }
                            final SubLObject query_formula = rkf_sd_conjoin((SubLObject)ConsesLow.cons(conjunct, constraint_clauses), (SubLObject)rkf_salient_descriptor.NIL, (SubLObject)rkf_salient_descriptor.NIL);
                            SubLObject cdolist_list_var2;
                            SubLObject unknown_conjuncts = cdolist_list_var2 = Sequences.remove(conjunct, cycl_utilities.formula_args(formula, (SubLObject)rkf_salient_descriptor.UNPROVIDED), (SubLObject)rkf_salient_descriptor.UNPROVIDED, (SubLObject)rkf_salient_descriptor.UNPROVIDED, (SubLObject)rkf_salient_descriptor.UNPROVIDED, (SubLObject)rkf_salient_descriptor.UNPROVIDED, (SubLObject)rkf_salient_descriptor.UNPROVIDED);
                            SubLObject unknown_conjunct = (SubLObject)rkf_salient_descriptor.NIL;
                            unknown_conjunct = cdolist_list_var2.first();
                            while (rkf_salient_descriptor.NIL != cdolist_list_var2) {
                                rkf_sd_known(unknown_conjunct, mt, (SubLObject)rkf_salient_descriptor.UNPROVIDED);
                                cdolist_list_var2 = cdolist_list_var2.rest();
                                unknown_conjunct = cdolist_list_var2.first();
                            }
                            if (rkf_salient_descriptor.NIL == doneP) {
                                SubLObject csome_list_var_$107 = rkf_sd_get_conjunct_bindings(query_formula, mt);
                                SubLObject v_bindings = (SubLObject)rkf_salient_descriptor.NIL;
                                v_bindings = csome_list_var_$107.first();
                                while (rkf_salient_descriptor.NIL == doneP && rkf_salient_descriptor.NIL != csome_list_var_$107) {
                                    if (rkf_salient_descriptor.NIL != v_bindings) {
                                        SubLObject cdolist_list_var3 = v_bindings;
                                        SubLObject cons = (SubLObject)rkf_salient_descriptor.NIL;
                                        cons = cdolist_list_var3.first();
                                        while (rkf_salient_descriptor.NIL != cdolist_list_var3) {
                                            SubLObject current;
                                            final SubLObject datum = current = cons;
                                            SubLObject el_var = (SubLObject)rkf_salient_descriptor.NIL;
                                            SubLObject v_term = (SubLObject)rkf_salient_descriptor.NIL;
                                            cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)rkf_salient_descriptor.$list153);
                                            el_var = current.first();
                                            current = (v_term = current.rest());
                                            unknown_conjuncts = conses_high.subst(v_term, el_var, unknown_conjuncts, (SubLObject)rkf_salient_descriptor.UNPROVIDED, (SubLObject)rkf_salient_descriptor.UNPROVIDED);
                                            cdolist_list_var3 = cdolist_list_var3.rest();
                                            cons = cdolist_list_var3.first();
                                        }
                                        if (rkf_salient_descriptor.NIL != list_utilities.lengthLE(list_utilities.tree_gather(unknown_conjuncts, (SubLObject)rkf_salient_descriptor.$sym148$EL_VAR_, (SubLObject)rkf_salient_descriptor.UNPROVIDED, (SubLObject)rkf_salient_descriptor.UNPROVIDED, (SubLObject)rkf_salient_descriptor.UNPROVIDED), unbound_var_max, (SubLObject)rkf_salient_descriptor.UNPROVIDED)) {
                                            SubLObject filtered_unknowns = (SubLObject)rkf_salient_descriptor.NIL;
                                            SubLObject malP = (SubLObject)rkf_salient_descriptor.NIL;
                                            if (rkf_salient_descriptor.NIL == malP) {
                                                SubLObject csome_list_var_$108 = unknown_conjuncts;
                                                SubLObject unknown = (SubLObject)rkf_salient_descriptor.NIL;
                                                unknown = csome_list_var_$108.first();
                                                while (rkf_salient_descriptor.NIL == malP && rkf_salient_descriptor.NIL != csome_list_var_$108) {
                                                    if (rkf_salient_descriptor.NIL == rkf_sd_el_fully_bound_p(unknown)) {
                                                        filtered_unknowns = (SubLObject)ConsesLow.cons(unknown, filtered_unknowns);
                                                    }
                                                    else if (rkf_salient_descriptor.NIL == rkf_sd_el_wffP(unknown, mt)) {
                                                        malP = (SubLObject)rkf_salient_descriptor.T;
                                                    }
                                                    else if (rkf_salient_descriptor.NIL != rkf_sd_rejected(unknown, mt)) {
                                                        malP = (SubLObject)rkf_salient_descriptor.T;
                                                    }
                                                    else if (rkf_salient_descriptor.NIL == rkf_sd_known(unknown, mt, (SubLObject)rkf_salient_descriptor.UNPROVIDED)) {
                                                        filtered_unknowns = (SubLObject)ConsesLow.cons(unknown, filtered_unknowns);
                                                    }
                                                    csome_list_var_$108 = csome_list_var_$108.rest();
                                                    unknown = csome_list_var_$108.first();
                                                }
                                            }
                                            malP = list_utilities.lengthG(filtered_unknowns, unknown_clause_max, (SubLObject)rkf_salient_descriptor.UNPROVIDED);
                                            if (rkf_salient_descriptor.NIL == malP) {
                                                final SubLObject mega_formula = rkf_sd_conjoin(filtered_unknowns, (SubLObject)rkf_salient_descriptor.UNPROVIDED, (SubLObject)rkf_salient_descriptor.UNPROVIDED);
                                                if (rkf_salient_descriptor.NIL != rkf_sd_el_wffP(mega_formula, mt)) {
                                                    final SubLObject item_var = v_bindings;
                                                    if (rkf_salient_descriptor.NIL == conses_high.member(item_var, ans, Symbols.symbol_function((SubLObject)rkf_salient_descriptor.$sym150$ALIST__), Symbols.symbol_function((SubLObject)rkf_salient_descriptor.IDENTITY))) {
                                                        ans = (SubLObject)ConsesLow.cons(item_var, ans);
                                                    }
                                                }
                                            }
                                        }
                                    }
                                    csome_list_var_$107 = csome_list_var_$107.rest();
                                    v_bindings = csome_list_var_$107.first();
                                }
                            }
                            doneP = list_utilities.lengthGE(ans, bindings_max, (SubLObject)rkf_salient_descriptor.UNPROVIDED);
                        }
                        csome_list_var = csome_list_var.rest();
                        conjunct = csome_list_var.first();
                    }
                }
            }
            finally {
                api_control_vars.$generate_readable_fi_results$.rebind(_prev_bind_0, thread);
            }
        }
        return ans;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/rkf-salient-descriptor.lisp", position = 45816L)
    public static SubLObject rkf_sd_constraint_table(final SubLObject formula, final SubLObject mt) {
        final SubLObject constraint_formula = at_var_types.inter_formula_variables_arg_constraints(formula, mt, (SubLObject)rkf_salient_descriptor.UNPROVIDED);
        final SubLObject conjuncts = (SubLObject)((rkf_salient_descriptor.NIL != el_utilities.el_conjunction_p(constraint_formula)) ? cycl_utilities.formula_args(constraint_formula, (SubLObject)rkf_salient_descriptor.UNPROVIDED) : ConsesLow.list(constraint_formula));
        final SubLObject constraint_table = dictionary.new_dictionary((SubLObject)rkf_salient_descriptor.UNPROVIDED, (SubLObject)rkf_salient_descriptor.UNPROVIDED);
        SubLObject cdolist_list_var = conjuncts;
        SubLObject conjunct = (SubLObject)rkf_salient_descriptor.NIL;
        conjunct = cdolist_list_var.first();
        while (rkf_salient_descriptor.NIL != cdolist_list_var) {
            if (rkf_salient_descriptor.NIL != formula_pattern_match.formula_matches_pattern(conjunct, (SubLObject)rkf_salient_descriptor.$list154) || rkf_salient_descriptor.NIL != formula_pattern_match.formula_matches_pattern(conjunct, (SubLObject)rkf_salient_descriptor.$list155)) {
                dictionary_utilities.dictionary_push(constraint_table, cycl_utilities.formula_arg1(conjunct, (SubLObject)rkf_salient_descriptor.UNPROVIDED), conjunct);
            }
            cdolist_list_var = cdolist_list_var.rest();
            conjunct = cdolist_list_var.first();
        }
        return constraint_table;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/rkf-salient-descriptor.lisp", position = 46486L)
    public static SubLObject rkf_sd_rejected(final SubLObject sentence, final SubLObject mt) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject negation_by_failureP = rkf_sd_use_negation_by_failureP(sentence);
        SubLObject rejectP = (SubLObject)rkf_salient_descriptor.T;
        if (rkf_salient_descriptor.NIL != el_utilities.el_formula_p(sentence)) {
            final SubLObject _prev_bind_0 = control_vars.$negation_by_failure$.currentBinding(thread);
            try {
                control_vars.$negation_by_failure$.bind(negation_by_failureP, thread);
                thread.resetMultipleValues();
                final SubLObject negation_knownP = rkf_sd_known(el_utilities.make_negation(sentence), mt, (SubLObject)rkf_salient_descriptor.UNPROVIDED);
                final SubLObject timed_outP = thread.secondMultipleValue();
                thread.resetMultipleValues();
                rejectP = (SubLObject)SubLObjectFactory.makeBoolean(rkf_salient_descriptor.NIL != negation_knownP || rkf_salient_descriptor.NIL != timed_outP);
            }
            finally {
                control_vars.$negation_by_failure$.rebind(_prev_bind_0, thread);
            }
        }
        return rejectP;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/rkf-salient-descriptor.lisp", position = 47143L)
    public static SubLObject rkf_sd_use_negation_by_failureP(final SubLObject sentence) {
        return formula_pattern_match.formula_matches_pattern(sentence, (SubLObject)rkf_salient_descriptor.$list156);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/rkf-salient-descriptor.lisp", position = 47268L)
    public static SubLObject rkf_sd_known_problem_store_properties() {
        final SubLThread thread = SubLProcess.currentSubLThread();
        return (SubLObject)ConsesLow.list((SubLObject)rkf_salient_descriptor.$kw101$INTERMEDIATE_STEP_VALIDATION_LEVEL, (SubLObject)rkf_salient_descriptor.$kw102$ARG_TYPE, (SubLObject)rkf_salient_descriptor.$kw157$NEGATION_BY_FAILURE_, control_vars.$negation_by_failure$.getDynamicValue(thread));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/rkf-salient-descriptor.lisp", position = 47438L)
    public static SubLObject rkf_sd_known_static_inference_properties(final SubLObject problem_store, SubLObject exclude_indeterminatesP) {
        if (exclude_indeterminatesP == rkf_salient_descriptor.UNPROVIDED) {
            exclude_indeterminatesP = (SubLObject)rkf_salient_descriptor.T;
        }
        final SubLObject v_properties = (SubLObject)ConsesLow.list((SubLObject)rkf_salient_descriptor.$kw69$PROBLEM_STORE, problem_store, (SubLObject)rkf_salient_descriptor.$kw104$RESULT_UNIQUENESS, (SubLObject)rkf_salient_descriptor.$kw105$BINDINGS, (SubLObject)rkf_salient_descriptor.$kw158$ALLOW_INDETERMINATE_RESULTS_, (SubLObject)SubLObjectFactory.makeBoolean(rkf_salient_descriptor.NIL == exclude_indeterminatesP));
        return v_properties;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/rkf-salient-descriptor.lisp", position = 48005L)
    public static SubLObject rkf_sd_known_dynamic_inference_properties(final SubLObject max_transformation_depth, final SubLObject max_transformation_depth_max) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        return (SubLObject)ConsesLow.list(new SubLObject[] { rkf_salient_descriptor.$kw70$ANSWER_LANGUAGE, rkf_salient_descriptor.$kw71$HL, rkf_salient_descriptor.$kw103$CACHE_INFERENCE_RESULTS_, rkf_salient_descriptor.NIL, rkf_salient_descriptor.$kw159$FORGET_EXTRA_RESULTS_, rkf_salient_descriptor.T, rkf_salient_descriptor.$kw110$MAX_NUMBER, rkf_salient_descriptor.ONE_INTEGER, rkf_salient_descriptor.$kw160$BROWSABLE_, rkf_salient_descriptor.T, rkf_salient_descriptor.$kw161$CONTINUABLE_, max_transformation_depth.eql(max_transformation_depth_max) ? rkf_salient_descriptor.NIL : rkf_salient_descriptor.T, rkf_salient_descriptor.$kw111$MAX_TIME, rkf_salient_descriptor.$rkf_sd_known_time_cutoff$.getDynamicValue(thread), rkf_salient_descriptor.$kw113$MAX_TRANSFORMATION_DEPTH, max_transformation_depth, rkf_salient_descriptor.$kw108$PRODUCTIVITY_LIMIT, rkf_salient_descriptor.$int109$100000 });
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/rkf-salient-descriptor.lisp", position = 48578L)
    public static SubLObject rkf_sd_known_internal(final SubLObject sentence, final SubLObject mt, SubLObject exclude_indeterminatesP) {
        if (exclude_indeterminatesP == rkf_salient_descriptor.UNPROVIDED) {
            exclude_indeterminatesP = (SubLObject)rkf_salient_descriptor.T;
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject ans = (SubLObject)rkf_salient_descriptor.NIL;
        SubLObject timed_outP = (SubLObject)rkf_salient_descriptor.NIL;
        if (rkf_salient_descriptor.NIL != el_utilities.el_formula_p(sentence)) {
            final SubLObject problem_store = rkf_sd_find_or_make_problem_store();
            final SubLObject already_resourcing_p = sbhl_marking_vars.$resourcing_sbhl_marking_spaces_p$.getDynamicValue(thread);
            final SubLObject _prev_bind_0 = sbhl_marking_vars.$resourced_sbhl_marking_space_limit$.currentBinding(thread);
            final SubLObject _prev_bind_2 = sbhl_marking_vars.$resourced_sbhl_marking_spaces$.currentBinding(thread);
            final SubLObject _prev_bind_3 = sbhl_marking_vars.$resourcing_sbhl_marking_spaces_p$.currentBinding(thread);
            try {
                sbhl_marking_vars.$resourced_sbhl_marking_space_limit$.bind(sbhl_marking_vars.determine_resource_limit(already_resourcing_p, (SubLObject)rkf_salient_descriptor.SIX_INTEGER), thread);
                sbhl_marking_vars.$resourced_sbhl_marking_spaces$.bind(sbhl_marking_vars.possibly_new_marking_resource(already_resourcing_p), thread);
                sbhl_marking_vars.$resourcing_sbhl_marking_spaces_p$.bind((SubLObject)rkf_salient_descriptor.T, thread);
                final SubLObject v_properties = rkf_sd_known_static_inference_properties(problem_store, exclude_indeterminatesP);
                final SubLObject inference = inference_kernel.new_continuable_inference(sentence, mt, v_properties);
                SubLObject max_depth = (SubLObject)rkf_salient_descriptor.ZERO_INTEGER;
                final SubLObject max_depth_max = rkf_salient_descriptor.$rkf_sd_known_max_depth_max$.getDynamicValue(thread);
                for (SubLObject no_more_bindingsP = (SubLObject)rkf_salient_descriptor.NIL; rkf_salient_descriptor.NIL == ans && rkf_salient_descriptor.NIL == no_more_bindingsP; ans = (SubLObject)rkf_salient_descriptor.T) {
                    thread.resetMultipleValues();
                    final SubLObject binding_lists = inference_kernel.continue_inference(inference, rkf_sd_known_dynamic_inference_properties(max_depth, max_depth_max));
                    final SubLObject exit_condition = thread.secondMultipleValue();
                    thread.resetMultipleValues();
                    if (rkf_salient_descriptor.$kw111$MAX_TIME == exit_condition) {
                        timed_outP = (SubLObject)rkf_salient_descriptor.T;
                        no_more_bindingsP = (SubLObject)rkf_salient_descriptor.T;
                    }
                    else if (rkf_salient_descriptor.NIL == inference_datastructures_inference.continuable_inference_p(inference)) {
                        if (rkf_salient_descriptor.NIL != inference_datastructures_enumerated_types.inference_error_suspend_status_p(exit_condition)) {
                            Errors.warn((SubLObject)rkf_salient_descriptor.$str163$_S_is_not_continuable____Exit_con, inference, exit_condition);
                        }
                        no_more_bindingsP = (SubLObject)rkf_salient_descriptor.T;
                    }
                    else if (rkf_salient_descriptor.NIL == binding_lists && max_depth.numGE(max_depth_max)) {
                        no_more_bindingsP = (SubLObject)rkf_salient_descriptor.T;
                    }
                    else if (rkf_salient_descriptor.$kw164$EXHAUST == exit_condition && max_depth.numL(max_depth_max)) {
                        max_depth = Numbers.add(max_depth, (SubLObject)rkf_salient_descriptor.ONE_INTEGER);
                    }
                    if (rkf_salient_descriptor.NIL != rkf_sd_known_some_good_binding_list_for_query_amongP(binding_lists, sentence, mt, exclude_indeterminatesP)) {}
                }
                if (rkf_salient_descriptor.NIL != rkf_salient_descriptor.$rkf_sd_known_destroy_inferencesP$.getDynamicValue(thread)) {
                    inference_datastructures_inference.destroy_inference(inference);
                }
            }
            finally {
                sbhl_marking_vars.$resourcing_sbhl_marking_spaces_p$.rebind(_prev_bind_3, thread);
                sbhl_marking_vars.$resourced_sbhl_marking_spaces$.rebind(_prev_bind_2, thread);
                sbhl_marking_vars.$resourced_sbhl_marking_space_limit$.rebind(_prev_bind_0, thread);
            }
        }
        if (rkf_salient_descriptor.NIL != timed_outP && rkf_salient_descriptor.$rkf_sd_known_time_cutoff$.getDynamicValue(thread).isPositive()) {
            Errors.warn((SubLObject)rkf_salient_descriptor.$str165$RKF_SD_KNOWN_timed_out_on__S, sentence);
        }
        return Values.values(ans, timed_outP);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/rkf-salient-descriptor.lisp", position = 48578L)
    public static SubLObject rkf_sd_known(final SubLObject sentence, final SubLObject mt, SubLObject exclude_indeterminatesP) {
        if (exclude_indeterminatesP == rkf_salient_descriptor.UNPROVIDED) {
            exclude_indeterminatesP = (SubLObject)rkf_salient_descriptor.T;
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject v_memoization_state = memoization_state.$memoization_state$.getDynamicValue(thread);
        SubLObject caching_state = (SubLObject)rkf_salient_descriptor.NIL;
        if (rkf_salient_descriptor.NIL == v_memoization_state) {
            return rkf_sd_known_internal(sentence, mt, exclude_indeterminatesP);
        }
        caching_state = memoization_state.memoization_state_lookup(v_memoization_state, (SubLObject)rkf_salient_descriptor.$sym162$RKF_SD_KNOWN, (SubLObject)rkf_salient_descriptor.UNPROVIDED);
        if (rkf_salient_descriptor.NIL == caching_state) {
            caching_state = memoization_state.create_caching_state(memoization_state.memoization_state_lock(v_memoization_state), (SubLObject)rkf_salient_descriptor.$sym162$RKF_SD_KNOWN, (SubLObject)rkf_salient_descriptor.THREE_INTEGER, (SubLObject)rkf_salient_descriptor.NIL, (SubLObject)rkf_salient_descriptor.EQUAL, (SubLObject)rkf_salient_descriptor.UNPROVIDED);
            memoization_state.memoization_state_put(v_memoization_state, (SubLObject)rkf_salient_descriptor.$sym162$RKF_SD_KNOWN, caching_state);
        }
        final SubLObject sxhash = memoization_state.sxhash_calc_3(sentence, mt, exclude_indeterminatesP);
        final SubLObject collisions = memoization_state.caching_state_lookup(caching_state, sxhash, (SubLObject)rkf_salient_descriptor.UNPROVIDED);
        if (!collisions.eql(memoization_state.$memoized_item_not_found$.getGlobalValue())) {
            SubLObject cdolist_list_var = collisions;
            SubLObject collision = (SubLObject)rkf_salient_descriptor.NIL;
            collision = cdolist_list_var.first();
            while (rkf_salient_descriptor.NIL != cdolist_list_var) {
                SubLObject cached_args = collision.first();
                final SubLObject results2 = conses_high.second(collision);
                if (sentence.equal(cached_args.first())) {
                    cached_args = cached_args.rest();
                    if (mt.equal(cached_args.first())) {
                        cached_args = cached_args.rest();
                        if (rkf_salient_descriptor.NIL != cached_args && rkf_salient_descriptor.NIL == cached_args.rest() && exclude_indeterminatesP.equal(cached_args.first())) {
                            return memoization_state.caching_results(results2);
                        }
                    }
                }
                cdolist_list_var = cdolist_list_var.rest();
                collision = cdolist_list_var.first();
            }
        }
        final SubLObject results3 = Values.arg2(thread.resetMultipleValues(), (SubLObject)Values.multiple_value_list(rkf_sd_known_internal(sentence, mt, exclude_indeterminatesP)));
        memoization_state.caching_state_enter_multi_key_n(caching_state, sxhash, collisions, results3, (SubLObject)ConsesLow.list(sentence, mt, exclude_indeterminatesP));
        return memoization_state.caching_results(results3);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/rkf-salient-descriptor.lisp", position = 50453L)
    public static SubLObject rkf_sd_existentially_unbind(final SubLObject sentence) {
        SubLObject new_sentence = el_utilities.copy_expression(sentence);
        SubLObject vars = (SubLObject)rkf_salient_descriptor.NIL;
        while (rkf_salient_descriptor.NIL != el_utilities.el_existential_p(new_sentence)) {
            SubLObject current;
            final SubLObject datum = current = cycl_utilities.formula_args(new_sentence, (SubLObject)rkf_salient_descriptor.UNPROVIDED);
            SubLObject var = (SubLObject)rkf_salient_descriptor.NIL;
            SubLObject body = (SubLObject)rkf_salient_descriptor.NIL;
            cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)rkf_salient_descriptor.$list166);
            var = current.first();
            current = current.rest();
            cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)rkf_salient_descriptor.$list166);
            body = current.first();
            current = current.rest();
            if (rkf_salient_descriptor.NIL == current) {
                new_sentence = body;
                vars = (SubLObject)ConsesLow.cons(var, vars);
            }
            else {
                cdestructuring_bind.cdestructuring_bind_error(datum, (SubLObject)rkf_salient_descriptor.$list166);
            }
        }
        return Values.values(new_sentence, vars);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/rkf-salient-descriptor.lisp", position = 50770L)
    public static SubLObject rkf_sd_possibly_existentially_unbind(final SubLObject sentence) {
        return (rkf_salient_descriptor.NIL != el_utilities.el_existential_p(sentence)) ? rkf_sd_existentially_unbind(sentence) : Values.values(sentence, el_utilities.sentence_free_variables(sentence, (SubLObject)rkf_salient_descriptor.UNPROVIDED, (SubLObject)rkf_salient_descriptor.UNPROVIDED, (SubLObject)rkf_salient_descriptor.UNPROVIDED));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/rkf-salient-descriptor.lisp", position = 51416L)
    public static SubLObject rkf_sd_known_some_good_binding_list_for_query_amongP(final SubLObject binding_lists, final SubLObject query_sentence, final SubLObject mt, final SubLObject exclude_indeterminatesP) {
        SubLObject good_foundP;
        SubLObject rest;
        SubLObject binding_list;
        for (good_foundP = (SubLObject)rkf_salient_descriptor.NIL, rest = (SubLObject)rkf_salient_descriptor.NIL, rest = binding_lists; rkf_salient_descriptor.NIL == good_foundP && rkf_salient_descriptor.NIL != rest; rest = rest.rest()) {
            binding_list = rest.first();
            if (rkf_salient_descriptor.NIL != rkf_sd_known_good_binding_list_for_queryP(binding_list, query_sentence, mt, exclude_indeterminatesP)) {
                good_foundP = (SubLObject)rkf_salient_descriptor.T;
            }
        }
        return good_foundP;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/rkf-salient-descriptor.lisp", position = 51876L)
    public static SubLObject rkf_sd_known_good_binding_list_for_queryP(final SubLObject binding_list, final SubLObject query_sentence, final SubLObject mt, final SubLObject exclude_indeterminatesP) {
        if (rkf_salient_descriptor.NIL == exclude_indeterminatesP || rkf_salient_descriptor.NIL != cyc_kernel.closed_query_bindings_p(binding_list)) {
            return (SubLObject)rkf_salient_descriptor.T;
        }
        final SubLObject bound_sentence = bindings.apply_bindings(binding_list, query_sentence);
        return (SubLObject)SubLObjectFactory.makeBoolean(rkf_salient_descriptor.NIL == pph_proof.sentence_trivial_for_justification_paraphraseP(bound_sentence, (SubLObject)rkf_salient_descriptor.UNPROVIDED));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/rkf-salient-descriptor.lisp", position = 52310L)
    public static SubLObject rkf_sd_get_conjunct_bindings_internal(final SubLObject conjunct, final SubLObject mt) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject inference_properties = (SubLObject)ConsesLow.list(new SubLObject[] { rkf_salient_descriptor.$kw69$PROBLEM_STORE, rkf_sd_find_or_make_problem_store(), rkf_salient_descriptor.$kw70$ANSWER_LANGUAGE, rkf_salient_descriptor.$kw71$HL, rkf_salient_descriptor.$kw103$CACHE_INFERENCE_RESULTS_, rkf_salient_descriptor.NIL, rkf_salient_descriptor.$kw104$RESULT_UNIQUENESS, rkf_salient_descriptor.$kw105$BINDINGS, rkf_salient_descriptor.$kw106$RETURN, rkf_salient_descriptor.$kw105$BINDINGS, rkf_salient_descriptor.$kw110$MAX_NUMBER, rkf_salient_descriptor.TWENTY_INTEGER, rkf_salient_descriptor.$kw111$MAX_TIME, rkf_salient_descriptor.ONE_INTEGER, rkf_salient_descriptor.$kw113$MAX_TRANSFORMATION_DEPTH, rkf_salient_descriptor.ZERO_INTEGER });
        final SubLObject scoped_vars = (SubLObject)rkf_salient_descriptor.NIL;
        thread.resetMultipleValues();
        final SubLObject hl_conjunct = rkf_sd_hl_for_el_vars_in_formula(conjunct);
        final SubLObject var_table = thread.secondMultipleValue();
        thread.resetMultipleValues();
        thread.resetMultipleValues();
        final SubLObject dnfs = clausifier.dnf_clausal_form(hl_conjunct, mt);
        final SubLObject new_mt = thread.secondMultipleValue();
        thread.resetMultipleValues();
        if (rkf_salient_descriptor.NIL != list_utilities.singletonP(dnfs)) {
            final SubLObject dnf = dnfs.first();
            final SubLObject hl_bindings = inference_kernel.new_cyc_query_from_dnf(dnf, new_mt, scoped_vars, inference_properties);
            SubLObject el_bindings = conses_high.copy_list(hl_bindings);
            SubLObject cdolist_list_var = var_table;
            SubLObject cons = (SubLObject)rkf_salient_descriptor.NIL;
            cons = cdolist_list_var.first();
            while (rkf_salient_descriptor.NIL != cdolist_list_var) {
                SubLObject current;
                final SubLObject datum = current = cons;
                SubLObject hl_var = (SubLObject)rkf_salient_descriptor.NIL;
                SubLObject el_var = (SubLObject)rkf_salient_descriptor.NIL;
                cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)rkf_salient_descriptor.$list168);
                hl_var = current.first();
                current = (el_var = current.rest());
                el_bindings = conses_high.subst(el_var, hl_var, el_bindings, (SubLObject)rkf_salient_descriptor.UNPROVIDED, (SubLObject)rkf_salient_descriptor.UNPROVIDED);
                cdolist_list_var = cdolist_list_var.rest();
                cons = cdolist_list_var.first();
            }
            return el_bindings;
        }
        return (SubLObject)rkf_salient_descriptor.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/rkf-salient-descriptor.lisp", position = 52310L)
    public static SubLObject rkf_sd_get_conjunct_bindings(final SubLObject conjunct, final SubLObject mt) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject v_memoization_state = memoization_state.$memoization_state$.getDynamicValue(thread);
        SubLObject caching_state = (SubLObject)rkf_salient_descriptor.NIL;
        if (rkf_salient_descriptor.NIL == v_memoization_state) {
            return rkf_sd_get_conjunct_bindings_internal(conjunct, mt);
        }
        caching_state = memoization_state.memoization_state_lookup(v_memoization_state, (SubLObject)rkf_salient_descriptor.$sym167$RKF_SD_GET_CONJUNCT_BINDINGS, (SubLObject)rkf_salient_descriptor.UNPROVIDED);
        if (rkf_salient_descriptor.NIL == caching_state) {
            caching_state = memoization_state.create_caching_state(memoization_state.memoization_state_lock(v_memoization_state), (SubLObject)rkf_salient_descriptor.$sym167$RKF_SD_GET_CONJUNCT_BINDINGS, (SubLObject)rkf_salient_descriptor.TWO_INTEGER, (SubLObject)rkf_salient_descriptor.NIL, (SubLObject)rkf_salient_descriptor.EQUAL, (SubLObject)rkf_salient_descriptor.UNPROVIDED);
            memoization_state.memoization_state_put(v_memoization_state, (SubLObject)rkf_salient_descriptor.$sym167$RKF_SD_GET_CONJUNCT_BINDINGS, caching_state);
        }
        final SubLObject sxhash = memoization_state.sxhash_calc_2(conjunct, mt);
        final SubLObject collisions = memoization_state.caching_state_lookup(caching_state, sxhash, (SubLObject)rkf_salient_descriptor.UNPROVIDED);
        if (!collisions.eql(memoization_state.$memoized_item_not_found$.getGlobalValue())) {
            SubLObject cdolist_list_var = collisions;
            SubLObject collision = (SubLObject)rkf_salient_descriptor.NIL;
            collision = cdolist_list_var.first();
            while (rkf_salient_descriptor.NIL != cdolist_list_var) {
                SubLObject cached_args = collision.first();
                final SubLObject results2 = conses_high.second(collision);
                if (conjunct.equal(cached_args.first())) {
                    cached_args = cached_args.rest();
                    if (rkf_salient_descriptor.NIL != cached_args && rkf_salient_descriptor.NIL == cached_args.rest() && mt.equal(cached_args.first())) {
                        return memoization_state.caching_results(results2);
                    }
                }
                cdolist_list_var = cdolist_list_var.rest();
                collision = cdolist_list_var.first();
            }
        }
        final SubLObject results3 = Values.arg2(thread.resetMultipleValues(), (SubLObject)Values.multiple_value_list(rkf_sd_get_conjunct_bindings_internal(conjunct, mt)));
        memoization_state.caching_state_enter_multi_key_n(caching_state, sxhash, collisions, results3, (SubLObject)ConsesLow.list(conjunct, mt));
        return memoization_state.caching_results(results3);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/rkf-salient-descriptor.lisp", position = 53158L)
    public static SubLObject rkf_sd_hl_for_el_vars_in_formula(final SubLObject formula) {
        SubLObject new_formula = el_utilities.copy_expression(formula);
        SubLObject table = (SubLObject)rkf_salient_descriptor.NIL;
        SubLObject next_hl_var_num = (SubLObject)rkf_salient_descriptor.ZERO_INTEGER;
        SubLObject cdolist_list_var = cycl_utilities.expression_gather(formula, (SubLObject)rkf_salient_descriptor.$sym148$EL_VAR_, (SubLObject)rkf_salient_descriptor.UNPROVIDED, (SubLObject)rkf_salient_descriptor.UNPROVIDED, (SubLObject)rkf_salient_descriptor.UNPROVIDED, (SubLObject)rkf_salient_descriptor.UNPROVIDED);
        SubLObject el_var = (SubLObject)rkf_salient_descriptor.NIL;
        el_var = cdolist_list_var.first();
        while (rkf_salient_descriptor.NIL != cdolist_list_var) {
            final SubLObject hl_var = variables.get_variable(next_hl_var_num);
            new_formula = cycl_utilities.expression_nsubst(hl_var, el_var, new_formula, (SubLObject)rkf_salient_descriptor.UNPROVIDED, (SubLObject)rkf_salient_descriptor.UNPROVIDED);
            table = list_utilities.alist_enter(table, hl_var, el_var, (SubLObject)rkf_salient_descriptor.UNPROVIDED);
            next_hl_var_num = Numbers.add(next_hl_var_num, (SubLObject)rkf_salient_descriptor.ONE_INTEGER);
            cdolist_list_var = cdolist_list_var.rest();
            el_var = cdolist_list_var.first();
        }
        return Values.values(new_formula, table);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/rkf-salient-descriptor.lisp", position = 53602L)
    public static SubLObject rkf_potential_rule_for_termP(final SubLObject rule, final SubLObject v_term, SubLObject mt) {
        if (mt == rkf_salient_descriptor.UNPROVIDED) {
            mt = control_vars.$rkf_mt$.getDynamicValue();
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject ans = (SubLObject)rkf_salient_descriptor.NIL;
        final SubLObject cnf = assertions_high.assertion_cnf(rule);
        if (rkf_salient_descriptor.NIL != genl_mts.genl_mtP(mt, assertions_high.assertion_mt(rule), (SubLObject)rkf_salient_descriptor.UNPROVIDED, (SubLObject)rkf_salient_descriptor.UNPROVIDED)) {
            final SubLObject mt_var = mt_relevance_macros.with_inference_mt_relevance_validate(mt);
            final SubLObject _prev_bind_0 = mt_relevance_macros.$mt$.currentBinding(thread);
            final SubLObject _prev_bind_2 = mt_relevance_macros.$relevant_mt_function$.currentBinding(thread);
            final SubLObject _prev_bind_3 = mt_relevance_macros.$relevant_mts$.currentBinding(thread);
            try {
                mt_relevance_macros.$mt$.bind(mt_relevance_macros.update_inference_mt_relevance_mt(mt_var), thread);
                mt_relevance_macros.$relevant_mt_function$.bind(mt_relevance_macros.update_inference_mt_relevance_function(mt_var), thread);
                mt_relevance_macros.$relevant_mts$.bind(mt_relevance_macros.update_inference_mt_relevance_mt_list(mt_var), thread);
                SubLObject cdolist_list_var = list_utilities.tree_gather(cnf, (SubLObject)rkf_salient_descriptor.$sym169$HL_VAR_, (SubLObject)rkf_salient_descriptor.UNPROVIDED, (SubLObject)rkf_salient_descriptor.UNPROVIDED, (SubLObject)rkf_salient_descriptor.UNPROVIDED);
                SubLObject var = (SubLObject)rkf_salient_descriptor.NIL;
                var = cdolist_list_var.first();
                while (rkf_salient_descriptor.NIL != cdolist_list_var) {
                    SubLObject bad_subP = (SubLObject)rkf_salient_descriptor.NIL;
                    final SubLObject subbed = conses_high.subst(v_term, var, conses_high.copy_tree(cnf), (SubLObject)rkf_salient_descriptor.UNPROVIDED, (SubLObject)rkf_salient_descriptor.UNPROVIDED);
                    if (rkf_salient_descriptor.NIL == bad_subP) {
                        SubLObject csome_list_var = ConsesLow.nconc(clauses.neg_lits(subbed), clauses.pos_lits(subbed));
                        SubLObject neg_lit = (SubLObject)rkf_salient_descriptor.NIL;
                        neg_lit = csome_list_var.first();
                        while (rkf_salient_descriptor.NIL == bad_subP && rkf_salient_descriptor.NIL != csome_list_var) {
                            if (rkf_salient_descriptor.NIL == wff.semantically_wf_literalP(neg_lit, (SubLObject)rkf_salient_descriptor.UNPROVIDED)) {
                                bad_subP = (SubLObject)rkf_salient_descriptor.T;
                            }
                            csome_list_var = csome_list_var.rest();
                            neg_lit = csome_list_var.first();
                        }
                    }
                    if (rkf_salient_descriptor.NIL == bad_subP) {
                        ans = (SubLObject)ConsesLow.cons(var, ans);
                    }
                    cdolist_list_var = cdolist_list_var.rest();
                    var = cdolist_list_var.first();
                }
            }
            finally {
                mt_relevance_macros.$relevant_mts$.rebind(_prev_bind_3, thread);
                mt_relevance_macros.$relevant_mt_function$.rebind(_prev_bind_2, thread);
                mt_relevance_macros.$mt$.rebind(_prev_bind_0, thread);
            }
        }
        return ans;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/rkf-salient-descriptor.lisp", position = 54299L)
    public static SubLObject rkf_sd_asent_unify(final SubLObject gaf_lit, final SubLObject rule_lit, SubLObject mt) {
        if (mt == rkf_salient_descriptor.UNPROVIDED) {
            mt = mt_relevance_macros.$mt$.getDynamicValue();
        }
        return unification_utilities.asent_unify(gaf_lit, rule_lit, (SubLObject)rkf_salient_descriptor.UNPROVIDED, (SubLObject)rkf_salient_descriptor.UNPROVIDED);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/rkf-salient-descriptor.lisp", position = 54428L)
    public static SubLObject rkf_unsatisfied_cnf_subbed_rule_formula(final SubLObject rule, final SubLObject gaf_lit, final SubLObject rule_sense, final SubLObject mt) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject cnf_copy = conses_high.copy_tree(assertions_high.assertion_cnf(rule));
        final SubLObject el_vars = assertions_high.assertion_el_variables(rule);
        SubLObject rejectedP = (SubLObject)rkf_salient_descriptor.NIL;
        SubLObject v_bindings = (SubLObject)rkf_salient_descriptor.NIL;
        SubLObject ans = (SubLObject)rkf_salient_descriptor.NIL;
        final SubLObject local_state;
        final SubLObject state = local_state = memoization_state.possibly_new_memoization_state();
        final SubLObject _prev_bind_0 = memoization_state.$memoization_state$.currentBinding(thread);
        try {
            memoization_state.$memoization_state$.bind(local_state, thread);
            final SubLObject original_memoization_process = memoization_state.memoization_state_original_process(local_state);
            try {
                final SubLObject already_resourcing_p = sbhl_marking_vars.$resourcing_sbhl_marking_spaces_p$.getDynamicValue(thread);
                final SubLObject _prev_bind_0_$109 = sbhl_marking_vars.$resourced_sbhl_marking_space_limit$.currentBinding(thread);
                final SubLObject _prev_bind_2 = sbhl_marking_vars.$resourced_sbhl_marking_spaces$.currentBinding(thread);
                final SubLObject _prev_bind_3 = sbhl_marking_vars.$resourcing_sbhl_marking_spaces_p$.currentBinding(thread);
                try {
                    sbhl_marking_vars.$resourced_sbhl_marking_space_limit$.bind(sbhl_marking_vars.determine_resource_limit(already_resourcing_p, (SubLObject)rkf_salient_descriptor.SIX_INTEGER), thread);
                    sbhl_marking_vars.$resourced_sbhl_marking_spaces$.bind(sbhl_marking_vars.possibly_new_marking_resource(already_resourcing_p), thread);
                    sbhl_marking_vars.$resourcing_sbhl_marking_spaces_p$.bind((SubLObject)rkf_salient_descriptor.T, thread);
                    final SubLObject reuse_existingP = rkf_sd_problem_store_okP(rkf_salient_descriptor.$rkf_sd_problem_store$.getDynamicValue(thread));
                    final SubLObject _prev_bind_0_$110 = rkf_salient_descriptor.$rkf_sd_problem_store$.currentBinding(thread);
                    try {
                        rkf_salient_descriptor.$rkf_sd_problem_store$.bind(rkf_sd_find_or_make_problem_store(), thread);
                        final SubLObject store = rkf_salient_descriptor.$rkf_sd_problem_store$.getDynamicValue(thread);
                        try {
                            if (rkf_salient_descriptor.$kw170$NEG == rule_sense) {
                                if (rkf_salient_descriptor.NIL == v_bindings) {
                                    SubLObject csome_list_var;
                                    SubLObject neg_lit;
                                    for (csome_list_var = clauses.neg_lits(cnf_copy), neg_lit = (SubLObject)rkf_salient_descriptor.NIL, neg_lit = csome_list_var.first(); rkf_salient_descriptor.NIL == v_bindings && rkf_salient_descriptor.NIL != csome_list_var; v_bindings = rkf_sd_asent_unify(gaf_lit, neg_lit, mt), csome_list_var = csome_list_var.rest(), neg_lit = csome_list_var.first()) {}
                                }
                                if (rkf_salient_descriptor.NIL != v_bindings) {
                                    cnf_copy = bindings.subst_bindings(v_bindings, cnf_copy);
                                    final SubLObject new_neg_lits = Sequences.remove(gaf_lit, clauses.neg_lits(cnf_copy), Symbols.symbol_function((SubLObject)rkf_salient_descriptor.EQUAL), (SubLObject)rkf_salient_descriptor.UNPROVIDED, (SubLObject)rkf_salient_descriptor.UNPROVIDED, (SubLObject)rkf_salient_descriptor.UNPROVIDED, (SubLObject)rkf_salient_descriptor.UNPROVIDED);
                                    cnf_copy = clauses.make_clause(new_neg_lits, clauses.pos_lits(cnf_copy));
                                    rejectedP = rkf_unsatisfied_cnf_rejectP(cnf_copy, mt, el_vars);
                                }
                                if (rkf_salient_descriptor.NIL == rejectedP) {
                                    ans = uncanonicalizer.cnf_el_formula(cnf_copy, mt, el_vars);
                                }
                            }
                        }
                        finally {
                            final SubLObject _prev_bind_0_$111 = Threads.$is_thread_performing_cleanupP$.currentBinding(thread);
                            try {
                                Threads.$is_thread_performing_cleanupP$.bind((SubLObject)rkf_salient_descriptor.T, thread);
                                final SubLObject _values = Values.getValuesAsVector();
                                if (rkf_salient_descriptor.NIL == reuse_existingP) {
                                    rkf_sd_free_problem_store(store);
                                }
                                Values.restoreValuesFromVector(_values);
                            }
                            finally {
                                Threads.$is_thread_performing_cleanupP$.rebind(_prev_bind_0_$111, thread);
                            }
                        }
                    }
                    finally {
                        rkf_salient_descriptor.$rkf_sd_problem_store$.rebind(_prev_bind_0_$110, thread);
                    }
                }
                finally {
                    sbhl_marking_vars.$resourcing_sbhl_marking_spaces_p$.rebind(_prev_bind_3, thread);
                    sbhl_marking_vars.$resourced_sbhl_marking_spaces$.rebind(_prev_bind_2, thread);
                    sbhl_marking_vars.$resourced_sbhl_marking_space_limit$.rebind(_prev_bind_0_$109, thread);
                }
            }
            finally {
                final SubLObject _prev_bind_0_$112 = Threads.$is_thread_performing_cleanupP$.currentBinding(thread);
                try {
                    Threads.$is_thread_performing_cleanupP$.bind((SubLObject)rkf_salient_descriptor.T, thread);
                    final SubLObject _values2 = Values.getValuesAsVector();
                    memoization_state.memoization_state_possibly_clear_original_process(local_state, original_memoization_process);
                    Values.restoreValuesFromVector(_values2);
                }
                finally {
                    Threads.$is_thread_performing_cleanupP$.rebind(_prev_bind_0_$112, thread);
                }
            }
        }
        finally {
            memoization_state.$memoization_state$.rebind(_prev_bind_0, thread);
        }
        return ans;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/rkf-salient-descriptor.lisp", position = 55355L)
    public static SubLObject rkf_unsatisfied_cnf_rejectP(final SubLObject cnf_copy, final SubLObject mt, final SubLObject el_vars) {
        final SubLObject pos_lits = clauses.pos_lits(cnf_copy);
        final SubLObject consequent = (SubLObject)((rkf_salient_descriptor.NIL != pos_lits) ? uncanonicalizer.cnf_el_formula(clauses.make_clause((SubLObject)rkf_salient_descriptor.NIL, pos_lits), mt, el_vars) : rkf_salient_descriptor.NIL);
        SubLObject rejectedP = (SubLObject)SubLObjectFactory.makeBoolean(rkf_salient_descriptor.NIL == pos_lits || (rkf_salient_descriptor.NIL != rkf_sd_el_fully_bound_p(consequent) && rkf_salient_descriptor.NIL != rkf_sd_known(consequent, mt, (SubLObject)rkf_salient_descriptor.UNPROVIDED)));
        if (rkf_salient_descriptor.NIL == rejectedP) {
            final SubLObject fully_bound_neg_lits = list_utilities.remove_if_not((SubLObject)rkf_salient_descriptor.$sym171$FULLY_BOUND_P, clauses.neg_lits(cnf_copy), (SubLObject)rkf_salient_descriptor.UNPROVIDED, (SubLObject)rkf_salient_descriptor.UNPROVIDED, (SubLObject)rkf_salient_descriptor.UNPROVIDED, (SubLObject)rkf_salient_descriptor.UNPROVIDED);
            rejectedP = (SubLObject)SubLObjectFactory.makeBoolean(rkf_salient_descriptor.NIL != fully_bound_neg_lits && rkf_salient_descriptor.NIL != rkf_sd_rejected(rkf_sd_conjoin(fully_bound_neg_lits, (SubLObject)rkf_salient_descriptor.NIL, (SubLObject)rkf_salient_descriptor.NIL), mt));
        }
        if (rkf_salient_descriptor.NIL == rejectedP) {
            final SubLObject fully_bound_pos_lits = list_utilities.remove_if_not((SubLObject)rkf_salient_descriptor.$sym171$FULLY_BOUND_P, clauses.pos_lits(cnf_copy), (SubLObject)rkf_salient_descriptor.UNPROVIDED, (SubLObject)rkf_salient_descriptor.UNPROVIDED, (SubLObject)rkf_salient_descriptor.UNPROVIDED, (SubLObject)rkf_salient_descriptor.UNPROVIDED);
            rejectedP = (SubLObject)SubLObjectFactory.makeBoolean(rkf_salient_descriptor.NIL != fully_bound_pos_lits && rkf_salient_descriptor.NIL != rkf_sd_rejected(rkf_sd_conjoin(fully_bound_pos_lits, (SubLObject)rkf_salient_descriptor.NIL, (SubLObject)rkf_salient_descriptor.NIL), mt));
        }
        return rejectedP;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/rkf-salient-descriptor.lisp", position = 56193L)
    public static SubLObject rkf_sd_neg_lits_knownP(final SubLObject neg_lits, final SubLObject mt) {
        if (rkf_salient_descriptor.NIL != neg_lits) {
            final SubLObject antecedent_formula = rkf_sd_conjoin(neg_lits, (SubLObject)rkf_salient_descriptor.UNPROVIDED, (SubLObject)rkf_salient_descriptor.UNPROVIDED);
            return rkf_sd_known(rkf_sd_existentially_bind_vars(antecedent_formula), mt, (SubLObject)rkf_salient_descriptor.NIL);
        }
        return (SubLObject)rkf_salient_descriptor.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/rkf-salient-descriptor.lisp", position = 56417L)
    public static SubLObject rkf_sd_el_fully_bound_p(final SubLObject el_formula) {
        return (SubLObject)SubLObjectFactory.makeBoolean(rkf_salient_descriptor.NIL == cycl_utilities.expression_find_if((SubLObject)rkf_salient_descriptor.$sym148$EL_VAR_, el_formula, (SubLObject)rkf_salient_descriptor.UNPROVIDED, (SubLObject)rkf_salient_descriptor.UNPROVIDED));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/rkf-salient-descriptor.lisp", position = 56530L)
    public static SubLObject rkf_make_el_cnf(final SubLObject neg_lits, final SubLObject pos_lits, final SubLObject rule) {
        final SubLObject rule_el_vars = assertions_high.assertion_el_variables(rule);
        SubLObject cnf = conses_high.copy_tree(clauses.make_clause(neg_lits, pos_lits));
        SubLObject list_var = (SubLObject)rkf_salient_descriptor.NIL;
        SubLObject rule_el_var = (SubLObject)rkf_salient_descriptor.NIL;
        SubLObject i = (SubLObject)rkf_salient_descriptor.NIL;
        list_var = rule_el_vars;
        rule_el_var = list_var.first();
        for (i = (SubLObject)rkf_salient_descriptor.ZERO_INTEGER; rkf_salient_descriptor.NIL != list_var; list_var = list_var.rest(), rule_el_var = list_var.first(), i = Numbers.add((SubLObject)rkf_salient_descriptor.ONE_INTEGER, i)) {
            final SubLObject hl_var = variables.find_variable_by_id(i);
            cnf = conses_high.nsubst(rule_el_var, hl_var, cnf, (SubLObject)rkf_salient_descriptor.UNPROVIDED, (SubLObject)rkf_salient_descriptor.UNPROVIDED);
        }
        return cnf;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/rkf-salient-descriptor.lisp", position = 56903L)
    public static SubLObject rkf_make_el_conjunction(final SubLObject lits, final SubLObject rule) {
        final SubLObject rule_el_vars = assertions_high.assertion_el_variables(rule);
        SubLObject ans = rkf_sd_conjoin(lits, (SubLObject)rkf_salient_descriptor.NIL, (SubLObject)rkf_salient_descriptor.NIL);
        SubLObject list_var = (SubLObject)rkf_salient_descriptor.NIL;
        SubLObject rule_el_var = (SubLObject)rkf_salient_descriptor.NIL;
        SubLObject i = (SubLObject)rkf_salient_descriptor.NIL;
        list_var = rule_el_vars;
        rule_el_var = list_var.first();
        for (i = (SubLObject)rkf_salient_descriptor.ZERO_INTEGER; rkf_salient_descriptor.NIL != list_var; list_var = list_var.rest(), rule_el_var = list_var.first(), i = Numbers.add((SubLObject)rkf_salient_descriptor.ONE_INTEGER, i)) {
            final SubLObject hl_var = variables.find_variable_by_id(i);
            ans = conses_high.nsubst(rule_el_var, hl_var, ans, (SubLObject)rkf_salient_descriptor.UNPROVIDED, (SubLObject)rkf_salient_descriptor.UNPROVIDED);
        }
        return ans;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/rkf-salient-descriptor.lisp", position = 57257L)
    public static SubLObject rkf_rule_partially_satisfied_by_gaf_litP(final SubLObject rule, final SubLObject gaf_lit, final SubLObject rule_sense) {
        final SubLObject cnf = assertions_high.assertion_cnf(rule);
        final SubLObject complementary_truth_lits = (rkf_salient_descriptor.$kw170$NEG == rule_sense) ? clauses.neg_lits(cnf) : clauses.pos_lits(cnf);
        SubLObject matching_lit = (SubLObject)rkf_salient_descriptor.NIL;
        SubLObject v_bindings = (SubLObject)rkf_salient_descriptor.NIL;
        SubLObject unresolved_neg_lits = (SubLObject)rkf_salient_descriptor.NIL;
        SubLObject unresolved_pos_lits = (SubLObject)rkf_salient_descriptor.NIL;
        if (rkf_salient_descriptor.NIL == matching_lit) {
            SubLObject csome_list_var = complementary_truth_lits;
            SubLObject lit = (SubLObject)rkf_salient_descriptor.NIL;
            lit = csome_list_var.first();
            while (rkf_salient_descriptor.NIL == matching_lit && rkf_salient_descriptor.NIL != csome_list_var) {
                v_bindings = unification_utilities.asent_unify(gaf_lit, lit, (SubLObject)rkf_salient_descriptor.UNPROVIDED, (SubLObject)rkf_salient_descriptor.UNPROVIDED);
                if (rkf_salient_descriptor.NIL != v_bindings) {
                    matching_lit = lit;
                }
                csome_list_var = csome_list_var.rest();
                lit = csome_list_var.first();
            }
        }
        if (rkf_salient_descriptor.NIL == gaf_lit || rkf_salient_descriptor.NIL != matching_lit) {
            unresolved_neg_lits = rkf_find_unresolved_lits(rule, (SubLObject)rkf_salient_descriptor.$kw170$NEG, v_bindings, matching_lit);
            unresolved_pos_lits = (SubLObject)(unresolved_neg_lits.isList() ? rkf_find_unresolved_lits(rule, (SubLObject)rkf_salient_descriptor.$kw172$POS, v_bindings, matching_lit) : rkf_salient_descriptor.NIL);
        }
        return Values.values(unresolved_neg_lits, unresolved_pos_lits);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/rkf-salient-descriptor.lisp", position = 58077L)
    public static SubLObject rkf_find_unresolved_lits(final SubLObject rule, final SubLObject sense, final SubLObject v_bindings, final SubLObject matching_lit) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject mismatchP = (SubLObject)rkf_salient_descriptor.NIL;
        final SubLObject cnf = conses_high.copy_tree(assertions_high.assertion_cnf(rule));
        final SubLObject lits = (sense == rkf_salient_descriptor.$kw170$NEG) ? clauses.neg_lits(cnf) : clauses.pos_lits(cnf);
        final SubLObject el_vars = assertions_high.assertion_el_variables(rule);
        SubLObject unresolved = (SubLObject)rkf_salient_descriptor.NIL;
        SubLObject resolved = (SubLObject)rkf_salient_descriptor.NIL;
        if (rkf_salient_descriptor.NIL == mismatchP) {
            SubLObject csome_list_var = lits;
            SubLObject lit = (SubLObject)rkf_salient_descriptor.NIL;
            lit = csome_list_var.first();
            while (rkf_salient_descriptor.NIL == mismatchP && rkf_salient_descriptor.NIL != csome_list_var) {
                if (!lit.equal(matching_lit)) {
                    thread.resetMultipleValues();
                    final SubLObject result = rkf_sd_check_lit(lit, v_bindings, el_vars);
                    final SubLObject el_lit = thread.secondMultipleValue();
                    thread.resetMultipleValues();
                    final SubLObject pcase_var = result;
                    if (pcase_var.eql((SubLObject)rkf_salient_descriptor.$kw173$KNOWN)) {
                        resolved = (SubLObject)ConsesLow.cons(el_lit, resolved);
                    }
                    else if (pcase_var.eql((SubLObject)rkf_salient_descriptor.$kw174$UNKNOWN)) {
                        unresolved = (SubLObject)ConsesLow.cons(el_lit, unresolved);
                    }
                    else {
                        mismatchP = (SubLObject)rkf_salient_descriptor.T;
                    }
                }
                csome_list_var = csome_list_var.rest();
                lit = csome_list_var.first();
            }
        }
        return Values.values((SubLObject)((rkf_salient_descriptor.NIL != mismatchP) ? rkf_salient_descriptor.$kw175$MISMATCH : unresolved), resolved);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/rkf-salient-descriptor.lisp", position = 58748L)
    public static SubLObject rkf_subst_el_bindings(final SubLObject v_bindings, final SubLObject lit) {
        SubLObject ans = el_utilities.copy_expression(lit);
        SubLObject cdolist_list_var = v_bindings;
        SubLObject binding = (SubLObject)rkf_salient_descriptor.NIL;
        binding = cdolist_list_var.first();
        while (rkf_salient_descriptor.NIL != cdolist_list_var) {
            SubLObject current;
            final SubLObject datum = current = binding;
            SubLObject var = (SubLObject)rkf_salient_descriptor.NIL;
            SubLObject v_term = (SubLObject)rkf_salient_descriptor.NIL;
            cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)rkf_salient_descriptor.$list147);
            var = current.first();
            current = (v_term = current.rest());
            ans = conses_high.nsubst(v_term, var, ans, (SubLObject)rkf_salient_descriptor.UNPROVIDED, (SubLObject)rkf_salient_descriptor.UNPROVIDED);
            cdolist_list_var = cdolist_list_var.rest();
            binding = cdolist_list_var.first();
        }
        return ans;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/rkf-salient-descriptor.lisp", position = 58973L)
    public static SubLObject rkf_sd_existentially_bind_vars(SubLObject formula) {
        SubLObject cdolist_list_var = el_utilities.sentence_free_variables(formula, (SubLObject)rkf_salient_descriptor.UNPROVIDED, (SubLObject)rkf_salient_descriptor.UNPROVIDED, (SubLObject)rkf_salient_descriptor.UNPROVIDED);
        SubLObject var = (SubLObject)rkf_salient_descriptor.NIL;
        var = cdolist_list_var.first();
        while (rkf_salient_descriptor.NIL != cdolist_list_var) {
            formula = el_utilities.make_existential(var, formula);
            cdolist_list_var = cdolist_list_var.rest();
            var = cdolist_list_var.first();
        }
        return formula;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/rkf-salient-descriptor.lisp", position = 59153L)
    public static SubLObject rkf_sd_check_lit_internal(final SubLObject lit, final SubLObject el_bindings, final SubLObject el_vars) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject el = el_utilities.copy_expression(lit);
        SubLObject bound = (SubLObject)rkf_salient_descriptor.NIL;
        SubLObject result = (SubLObject)rkf_salient_descriptor.$kw174$UNKNOWN;
        SubLObject list_var = (SubLObject)rkf_salient_descriptor.NIL;
        SubLObject el_var = (SubLObject)rkf_salient_descriptor.NIL;
        SubLObject i = (SubLObject)rkf_salient_descriptor.NIL;
        list_var = el_vars;
        el_var = list_var.first();
        for (i = (SubLObject)rkf_salient_descriptor.ZERO_INTEGER; rkf_salient_descriptor.NIL != list_var; list_var = list_var.rest(), el_var = list_var.first(), i = Numbers.add((SubLObject)rkf_salient_descriptor.ONE_INTEGER, i)) {
            final SubLObject hl_var = variables.find_variable_by_id(i);
            el = conses_high.nsubst(el_var, hl_var, el, (SubLObject)rkf_salient_descriptor.UNPROVIDED, (SubLObject)rkf_salient_descriptor.UNPROVIDED);
        }
        el = rkf_subst_el_bindings(el_bindings, el);
        bound = rkf_sd_existentially_bind_vars(el_utilities.copy_expression(el));
        if (rkf_salient_descriptor.NIL == rkf_sd_el_wffP(el, mt_relevance_macros.$mt$.getDynamicValue(thread))) {
            result = (SubLObject)rkf_salient_descriptor.$kw177$MALFORMED;
        }
        else if (rkf_salient_descriptor.NIL != rkf_relevance_utilities.rkf_irrelevant_formula(lit, mt_relevance_macros.$mt$.getDynamicValue(thread))) {
            result = (SubLObject)rkf_salient_descriptor.$kw178$IRRELEVANT;
        }
        else if (rkf_salient_descriptor.NIL != rkf_sd_known(el_utilities.make_negation(bound), mt_relevance_macros.$mt$.getDynamicValue(thread), (SubLObject)rkf_salient_descriptor.UNPROVIDED)) {
            result = (SubLObject)rkf_salient_descriptor.$kw179$FALSE;
        }
        else if (rkf_salient_descriptor.NIL != rkf_sd_known(bound, mt_relevance_macros.$mt$.getDynamicValue(thread), (SubLObject)rkf_salient_descriptor.UNPROVIDED)) {
            result = (SubLObject)rkf_salient_descriptor.$kw173$KNOWN;
        }
        return Values.values(result, el);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/rkf-salient-descriptor.lisp", position = 59153L)
    public static SubLObject rkf_sd_check_lit(final SubLObject lit, final SubLObject el_bindings, final SubLObject el_vars) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject v_memoization_state = memoization_state.$memoization_state$.getDynamicValue(thread);
        SubLObject caching_state = (SubLObject)rkf_salient_descriptor.NIL;
        if (rkf_salient_descriptor.NIL == v_memoization_state) {
            return rkf_sd_check_lit_internal(lit, el_bindings, el_vars);
        }
        caching_state = memoization_state.memoization_state_lookup(v_memoization_state, (SubLObject)rkf_salient_descriptor.$sym176$RKF_SD_CHECK_LIT, (SubLObject)rkf_salient_descriptor.UNPROVIDED);
        if (rkf_salient_descriptor.NIL == caching_state) {
            caching_state = memoization_state.create_caching_state(memoization_state.memoization_state_lock(v_memoization_state), (SubLObject)rkf_salient_descriptor.$sym176$RKF_SD_CHECK_LIT, (SubLObject)rkf_salient_descriptor.THREE_INTEGER, (SubLObject)rkf_salient_descriptor.NIL, (SubLObject)rkf_salient_descriptor.EQUAL, (SubLObject)rkf_salient_descriptor.UNPROVIDED);
            memoization_state.memoization_state_put(v_memoization_state, (SubLObject)rkf_salient_descriptor.$sym176$RKF_SD_CHECK_LIT, caching_state);
        }
        final SubLObject sxhash = memoization_state.sxhash_calc_3(lit, el_bindings, el_vars);
        final SubLObject collisions = memoization_state.caching_state_lookup(caching_state, sxhash, (SubLObject)rkf_salient_descriptor.UNPROVIDED);
        if (!collisions.eql(memoization_state.$memoized_item_not_found$.getGlobalValue())) {
            SubLObject cdolist_list_var = collisions;
            SubLObject collision = (SubLObject)rkf_salient_descriptor.NIL;
            collision = cdolist_list_var.first();
            while (rkf_salient_descriptor.NIL != cdolist_list_var) {
                SubLObject cached_args = collision.first();
                final SubLObject results2 = conses_high.second(collision);
                if (lit.equal(cached_args.first())) {
                    cached_args = cached_args.rest();
                    if (el_bindings.equal(cached_args.first())) {
                        cached_args = cached_args.rest();
                        if (rkf_salient_descriptor.NIL != cached_args && rkf_salient_descriptor.NIL == cached_args.rest() && el_vars.equal(cached_args.first())) {
                            return memoization_state.caching_results(results2);
                        }
                    }
                }
                cdolist_list_var = cdolist_list_var.rest();
                collision = cdolist_list_var.first();
            }
        }
        final SubLObject results3 = Values.arg2(thread.resetMultipleValues(), (SubLObject)Values.multiple_value_list(rkf_sd_check_lit_internal(lit, el_bindings, el_vars)));
        memoization_state.caching_state_enter_multi_key_n(caching_state, sxhash, collisions, results3, (SubLObject)ConsesLow.list(lit, el_bindings, el_vars));
        return memoization_state.caching_results(results3);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/rkf-salient-descriptor.lisp", position = 60172L)
    public static SubLObject rkf_sd_formulas_static_inference_properties(final SubLObject problem_store) {
        return (SubLObject)ConsesLow.list((SubLObject)rkf_salient_descriptor.$kw69$PROBLEM_STORE, problem_store, (SubLObject)rkf_salient_descriptor.$kw104$RESULT_UNIQUENESS, (SubLObject)rkf_salient_descriptor.$kw105$BINDINGS);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/rkf-salient-descriptor.lisp", position = 60504L)
    public static SubLObject rkf_sd_formulas_dynamic_inference_properties(final SubLObject max_transformation_depth) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        return (SubLObject)ConsesLow.list(new SubLObject[] { rkf_salient_descriptor.$kw70$ANSWER_LANGUAGE, rkf_salient_descriptor.$kw71$HL, rkf_salient_descriptor.$kw103$CACHE_INFERENCE_RESULTS_, rkf_salient_descriptor.$cache_salient_descriptor_ask_resultsP$.getDynamicValue(thread), rkf_salient_descriptor.$kw159$FORGET_EXTRA_RESULTS_, rkf_salient_descriptor.NIL, rkf_salient_descriptor.$kw106$RETURN, rkf_salient_descriptor.$kw180$BINDINGS_AND_SUPPORTS, rkf_salient_descriptor.$kw110$MAX_NUMBER, rkf_salient_descriptor.ONE_INTEGER, rkf_salient_descriptor.$kw161$CONTINUABLE_, rkf_salient_descriptor.T, rkf_salient_descriptor.$kw111$MAX_TIME, rkf_salient_descriptor.$rkf_salient_descriptor_time_cutoff$.getDynamicValue(thread), rkf_salient_descriptor.$kw113$MAX_TRANSFORMATION_DEPTH, max_transformation_depth, rkf_salient_descriptor.$kw108$PRODUCTIVITY_LIMIT, rkf_salient_descriptor.$int109$100000 });
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/rkf-salient-descriptor.lisp", position = 61004L)
    public static SubLObject rkf_salient_descriptor_formulas(final SubLObject fort, final SubLObject salience_pred, SubLObject mt) {
        if (mt == rkf_salient_descriptor.UNPROVIDED) {
            mt = control_vars.$rkf_mt$.getDynamicValue();
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject formulas = (SubLObject)rkf_salient_descriptor.NIL;
        SubLObject justifications = (SubLObject)rkf_salient_descriptor.NIL;
        final SubLObject _prev_bind_0 = control_vars.$within_assert$.currentBinding(thread);
        final SubLObject _prev_bind_2 = wff_utilities.$check_arg_typesP$.currentBinding(thread);
        final SubLObject _prev_bind_3 = at_vars.$at_check_arg_typesP$.currentBinding(thread);
        final SubLObject _prev_bind_4 = wff_utilities.$check_wff_semanticsP$.currentBinding(thread);
        final SubLObject _prev_bind_5 = wff_utilities.$check_wff_coherenceP$.currentBinding(thread);
        final SubLObject _prev_bind_6 = wff_utilities.$check_var_typesP$.currentBinding(thread);
        final SubLObject _prev_bind_7 = czer_vars.$simplify_literalP$.currentBinding(thread);
        final SubLObject _prev_bind_8 = at_vars.$at_check_relator_constraintsP$.currentBinding(thread);
        final SubLObject _prev_bind_9 = at_vars.$at_check_arg_formatP$.currentBinding(thread);
        final SubLObject _prev_bind_10 = wff_vars.$validate_constantsP$.currentBinding(thread);
        final SubLObject _prev_bind_11 = system_parameters.$suspend_sbhl_type_checkingP$.currentBinding(thread);
        try {
            control_vars.$within_assert$.bind((SubLObject)rkf_salient_descriptor.NIL, thread);
            wff_utilities.$check_arg_typesP$.bind((SubLObject)rkf_salient_descriptor.NIL, thread);
            at_vars.$at_check_arg_typesP$.bind((SubLObject)rkf_salient_descriptor.NIL, thread);
            wff_utilities.$check_wff_semanticsP$.bind((SubLObject)rkf_salient_descriptor.NIL, thread);
            wff_utilities.$check_wff_coherenceP$.bind((SubLObject)rkf_salient_descriptor.NIL, thread);
            wff_utilities.$check_var_typesP$.bind((SubLObject)rkf_salient_descriptor.NIL, thread);
            czer_vars.$simplify_literalP$.bind((SubLObject)rkf_salient_descriptor.NIL, thread);
            at_vars.$at_check_relator_constraintsP$.bind((SubLObject)rkf_salient_descriptor.NIL, thread);
            at_vars.$at_check_arg_formatP$.bind((SubLObject)rkf_salient_descriptor.NIL, thread);
            wff_vars.$validate_constantsP$.bind((SubLObject)rkf_salient_descriptor.NIL, thread);
            system_parameters.$suspend_sbhl_type_checkingP$.bind((SubLObject)rkf_salient_descriptor.T, thread);
            final SubLObject local_state;
            final SubLObject state = local_state = memoization_state.possibly_new_memoization_state();
            final SubLObject _prev_bind_0_$113 = memoization_state.$memoization_state$.currentBinding(thread);
            try {
                memoization_state.$memoization_state$.bind(local_state, thread);
                final SubLObject original_memoization_process = memoization_state.memoization_state_original_process(local_state);
                try {
                    final SubLObject already_resourcing_p = sbhl_marking_vars.$resourcing_sbhl_marking_spaces_p$.getDynamicValue(thread);
                    final SubLObject _prev_bind_0_$114 = sbhl_marking_vars.$resourced_sbhl_marking_space_limit$.currentBinding(thread);
                    final SubLObject _prev_bind_1_$115 = sbhl_marking_vars.$resourced_sbhl_marking_spaces$.currentBinding(thread);
                    final SubLObject _prev_bind_2_$116 = sbhl_marking_vars.$resourcing_sbhl_marking_spaces_p$.currentBinding(thread);
                    try {
                        sbhl_marking_vars.$resourced_sbhl_marking_space_limit$.bind(sbhl_marking_vars.determine_resource_limit(already_resourcing_p, (SubLObject)rkf_salient_descriptor.SIX_INTEGER), thread);
                        sbhl_marking_vars.$resourced_sbhl_marking_spaces$.bind(sbhl_marking_vars.possibly_new_marking_resource(already_resourcing_p), thread);
                        sbhl_marking_vars.$resourcing_sbhl_marking_spaces_p$.bind((SubLObject)rkf_salient_descriptor.T, thread);
                        final SubLObject formula_var = (SubLObject)rkf_salient_descriptor.$sym181$_FORMULA;
                        final SubLObject inference = rkf_salient_descriptor_formulas_inference(fort, formula_var, salience_pred, mt);
                        final SubLObject max_depth_max = rkf_salient_descriptor.$rkf_sd_formulas_max_depth_max$.getDynamicValue(thread);
                        SubLObject max_depth = (SubLObject)rkf_salient_descriptor.ZERO_INTEGER;
                        SubLObject results_queue = (SubLObject)rkf_salient_descriptor.NIL;
                        SubLObject no_more_bindingsP = (SubLObject)rkf_salient_descriptor.NIL;
                        while (rkf_salient_descriptor.NIL == no_more_bindingsP && (!rkf_salient_descriptor.$rkf_salient_descriptor_number_cutoff$.getDynamicValue(thread).isNumber() || rkf_salient_descriptor.NIL == list_utilities.lengthG(formulas, rkf_salient_descriptor.$rkf_salient_descriptor_number_cutoff$.getDynamicValue(thread), (SubLObject)rkf_salient_descriptor.UNPROVIDED))) {
                            thread.resetMultipleValues();
                            final SubLObject new_formulas = rkf_salient_descriptor_formulas_one_batch(inference, max_depth, mt, formula_var, results_queue);
                            final SubLObject new_justs = thread.secondMultipleValue();
                            final SubLObject exit_condition = thread.thirdMultipleValue();
                            final SubLObject more_results = thread.fourthMultipleValue();
                            thread.resetMultipleValues();
                            results_queue = more_results;
                            SubLObject new_formula = (SubLObject)rkf_salient_descriptor.NIL;
                            SubLObject new_formula_$117 = (SubLObject)rkf_salient_descriptor.NIL;
                            SubLObject new_just = (SubLObject)rkf_salient_descriptor.NIL;
                            SubLObject new_just_$118 = (SubLObject)rkf_salient_descriptor.NIL;
                            new_formula = new_formulas;
                            new_formula_$117 = new_formula.first();
                            new_just = new_justs;
                            new_just_$118 = new_just.first();
                            while (rkf_salient_descriptor.NIL != new_just || rkf_salient_descriptor.NIL != new_formula) {
                                formulas = (SubLObject)ConsesLow.cons(new_formula_$117, formulas);
                                justifications = (SubLObject)ConsesLow.cons(new_just_$118, justifications);
                                new_formula = new_formula.rest();
                                new_formula_$117 = new_formula.first();
                                new_just = new_just.rest();
                                new_just_$118 = new_just.first();
                            }
                            if (rkf_salient_descriptor.$kw111$MAX_TIME == exit_condition) {
                                Errors.warn((SubLObject)rkf_salient_descriptor.$str182$Timed_out_after__S_seconds_gettin, rkf_salient_descriptor.$rkf_salient_descriptor_time_cutoff$.getDynamicValue(thread), salience_pred, fort);
                                no_more_bindingsP = (SubLObject)rkf_salient_descriptor.T;
                            }
                            else if (rkf_salient_descriptor.$kw112$PROBABLY_APPROXIMATELY_DONE == exit_condition) {
                                Errors.warn((SubLObject)rkf_salient_descriptor.$str183$P_A_D__getting__S_for__S___, salience_pred, fort);
                                no_more_bindingsP = (SubLObject)rkf_salient_descriptor.T;
                            }
                            else if (rkf_salient_descriptor.NIL == inference_datastructures_inference.continuable_inference_p(inference)) {
                                no_more_bindingsP = (SubLObject)rkf_salient_descriptor.T;
                            }
                            else if (rkf_salient_descriptor.NIL != inference_datastructures_enumerated_types.exhausted_inference_suspend_status_p(exit_condition) && max_depth.numGE(max_depth_max)) {
                                no_more_bindingsP = (SubLObject)rkf_salient_descriptor.T;
                            }
                            else {
                                if (rkf_salient_descriptor.NIL == inference_datastructures_enumerated_types.exhausted_inference_suspend_status_p(exit_condition)) {
                                    continue;
                                }
                                max_depth = Numbers.add(max_depth, (SubLObject)rkf_salient_descriptor.ONE_INTEGER);
                            }
                        }
                    }
                    finally {
                        sbhl_marking_vars.$resourcing_sbhl_marking_spaces_p$.rebind(_prev_bind_2_$116, thread);
                        sbhl_marking_vars.$resourced_sbhl_marking_spaces$.rebind(_prev_bind_1_$115, thread);
                        sbhl_marking_vars.$resourced_sbhl_marking_space_limit$.rebind(_prev_bind_0_$114, thread);
                    }
                }
                finally {
                    final SubLObject _prev_bind_0_$115 = Threads.$is_thread_performing_cleanupP$.currentBinding(thread);
                    try {
                        Threads.$is_thread_performing_cleanupP$.bind((SubLObject)rkf_salient_descriptor.T, thread);
                        final SubLObject _values = Values.getValuesAsVector();
                        memoization_state.memoization_state_possibly_clear_original_process(local_state, original_memoization_process);
                        Values.restoreValuesFromVector(_values);
                    }
                    finally {
                        Threads.$is_thread_performing_cleanupP$.rebind(_prev_bind_0_$115, thread);
                    }
                }
            }
            finally {
                memoization_state.$memoization_state$.rebind(_prev_bind_0_$113, thread);
            }
        }
        finally {
            system_parameters.$suspend_sbhl_type_checkingP$.rebind(_prev_bind_11, thread);
            wff_vars.$validate_constantsP$.rebind(_prev_bind_10, thread);
            at_vars.$at_check_arg_formatP$.rebind(_prev_bind_9, thread);
            at_vars.$at_check_relator_constraintsP$.rebind(_prev_bind_8, thread);
            czer_vars.$simplify_literalP$.rebind(_prev_bind_7, thread);
            wff_utilities.$check_var_typesP$.rebind(_prev_bind_6, thread);
            wff_utilities.$check_wff_coherenceP$.rebind(_prev_bind_5, thread);
            wff_utilities.$check_wff_semanticsP$.rebind(_prev_bind_4, thread);
            at_vars.$at_check_arg_typesP$.rebind(_prev_bind_3, thread);
            wff_utilities.$check_arg_typesP$.rebind(_prev_bind_2, thread);
            control_vars.$within_assert$.rebind(_prev_bind_0, thread);
        }
        return Values.values(formulas, justifications);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/rkf-salient-descriptor.lisp", position = 62871L)
    public static SubLObject rkf_salient_descriptor_formulas_inference(final SubLObject fort, final SubLObject formula_var, final SubLObject salience_pred, final SubLObject mt) {
        final SubLObject problem_store = rkf_sd_find_or_make_problem_store();
        final SubLObject test_sentence = (SubLObject)ConsesLow.list(salience_pred, fort, formula_var);
        final SubLObject inference = inference_kernel.new_continuable_inference(test_sentence, mt, rkf_sd_formulas_static_inference_properties(problem_store));
        return inference;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/rkf-salient-descriptor.lisp", position = 63238L)
    public static SubLObject rkf_salient_descriptor_formulas_one_batch_continue_inference(final SubLObject inference, final SubLObject inference_properties) {
        return inference_kernel.continue_inference(inference, inference_properties);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/rkf-salient-descriptor.lisp", position = 63410L)
    public static SubLObject rkf_salient_descriptor_formulas_one_batch(final SubLObject inference, final SubLObject max_depth, final SubLObject mt, final SubLObject formula_var, SubLObject ask_results) {
        if (ask_results == rkf_salient_descriptor.UNPROVIDED) {
            ask_results = (SubLObject)rkf_salient_descriptor.NIL;
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject formulas = (SubLObject)rkf_salient_descriptor.NIL;
        SubLObject justifications = (SubLObject)rkf_salient_descriptor.NIL;
        final SubLObject inference_properties = rkf_sd_formulas_dynamic_inference_properties(max_depth);
        final SubLObject max_time = conses_high.getf(inference_properties, (SubLObject)rkf_salient_descriptor.$kw111$MAX_TIME, (SubLObject)rkf_salient_descriptor.NIL);
        final SubLObject max_internal_real_time = (SubLObject)((rkf_salient_descriptor.NIL != max_time) ? numeric_date_utilities.elapsed_seconds_to_elapsed_internal_real_time(max_time) : rkf_salient_descriptor.NIL);
        SubLObject total_internal_real_time = (SubLObject)rkf_salient_descriptor.ZERO_INTEGER;
        for (SubLObject doneP = (SubLObject)rkf_salient_descriptor.NIL; rkf_salient_descriptor.NIL == doneP; doneP = (SubLObject)rkf_salient_descriptor.T) {
            final SubLObject start_internal_real_time = Time.get_internal_real_time();
            if (rkf_salient_descriptor.NIL == ask_results) {
                ask_results = rkf_salient_descriptor_formulas_one_batch_continue_inference(inference, inference_properties);
            }
            total_internal_real_time = Numbers.add(total_internal_real_time, numeric_date_utilities.elapsed_internal_real_time(start_internal_real_time, (SubLObject)rkf_salient_descriptor.UNPROVIDED));
            while (rkf_salient_descriptor.NIL != ask_results && rkf_salient_descriptor.NIL == formulas) {
                final SubLObject result = ask_results.first();
                ask_results = ask_results.rest();
                SubLObject current;
                final SubLObject datum = current = result;
                SubLObject v_bindings = (SubLObject)rkf_salient_descriptor.NIL;
                SubLObject supports = (SubLObject)rkf_salient_descriptor.NIL;
                cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)rkf_salient_descriptor.$list184);
                v_bindings = current.first();
                current = current.rest();
                cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)rkf_salient_descriptor.$list184);
                supports = current.first();
                current = current.rest();
                if (rkf_salient_descriptor.NIL == current) {
                    SubLObject badP = (SubLObject)rkf_salient_descriptor.NIL;
                    if (rkf_salient_descriptor.NIL == badP) {
                        SubLObject csome_list_var = supports;
                        SubLObject support = (SubLObject)rkf_salient_descriptor.NIL;
                        support = csome_list_var.first();
                        while (rkf_salient_descriptor.NIL == badP && rkf_salient_descriptor.NIL != csome_list_var) {
                            if (rkf_salient_descriptor.NIL != rkf_deprecated_sd_ruleP(support, mt)) {
                                badP = (SubLObject)rkf_salient_descriptor.T;
                            }
                            csome_list_var = csome_list_var.rest();
                            support = csome_list_var.first();
                        }
                    }
                    if (rkf_salient_descriptor.NIL != badP) {
                        continue;
                    }
                    final SubLObject formula = bindings.variable_lookup(formula_var, v_bindings);
                    if (rkf_salient_descriptor.NIL == el_utilities.el_existential_p(formula)) {
                        continue;
                    }
                    final SubLObject de_existentialized = rkf_sd_existentially_unbind(formula);
                    if (rkf_salient_descriptor.NIL != rkf_irrelevant_sd_formulaP(de_existentialized, mt) || (rkf_salient_descriptor.NIL != rkf_salient_descriptor.$rkf_sd_exclude_known_promptsP$.getDynamicValue(thread) && rkf_salient_descriptor.NIL != rkf_sd_known(de_existentialized, mt, (SubLObject)rkf_salient_descriptor.T))) {
                        continue;
                    }
                    formulas = (SubLObject)ConsesLow.cons(de_existentialized, formulas);
                    justifications = (SubLObject)ConsesLow.cons(supports, justifications);
                }
                else {
                    cdestructuring_bind.cdestructuring_bind_error(datum, (SubLObject)rkf_salient_descriptor.$list184);
                }
            }
            if (rkf_salient_descriptor.NIL != formulas || rkf_salient_descriptor.$kw110$MAX_NUMBER != inference_datastructures_inference.inference_suspend_status(inference) || (max_internal_real_time.isInteger() && !total_internal_real_time.numL(max_internal_real_time))) {}
        }
        return Values.values(formulas, justifications, inference_datastructures_inference.inference_suspend_status(inference), ask_results);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/rkf-salient-descriptor.lisp", position = 66091L)
    public static SubLObject rkf_irrelevant_sd_formulaP(final SubLObject de_existentialized_formula, final SubLObject mt) {
        final SubLObject prompt_formula = rkf_sd_remove_nonassertible_conjuncts(de_existentialized_formula);
        return (SubLObject)SubLObjectFactory.makeBoolean(rkf_salient_descriptor.NIL == prompt_formula || rkf_salient_descriptor.NIL != list_utilities.sublisp_boolean(rkf_relevance_utilities.rkf_irrelevant_formula(prompt_formula, mt)));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/rkf-salient-descriptor.lisp", position = 66554L)
    public static SubLObject rkf_sd_remove_nonassertible_conjuncts(final SubLObject el_formula) {
        if (rkf_salient_descriptor.NIL == el_utilities.el_conjunction_p(el_formula)) {
            return el_formula;
        }
        SubLObject assertible_conjuncts = (SubLObject)rkf_salient_descriptor.NIL;
        SubLObject cdolist_list_var;
        final SubLObject args = cdolist_list_var = cycl_utilities.formula_args(el_formula, (SubLObject)rkf_salient_descriptor.$kw185$IGNORE);
        SubLObject conjunct = (SubLObject)rkf_salient_descriptor.NIL;
        conjunct = cdolist_list_var.first();
        while (rkf_salient_descriptor.NIL != cdolist_list_var) {
            if (rkf_salient_descriptor.NIL == kb_accessors.not_assertible_predicateP(cycl_utilities.formula_arg0(conjunct), (SubLObject)rkf_salient_descriptor.UNPROVIDED)) {
                assertible_conjuncts = (SubLObject)ConsesLow.cons(conjunct, assertible_conjuncts);
            }
            cdolist_list_var = cdolist_list_var.rest();
            conjunct = cdolist_list_var.first();
        }
        return rkf_sd_conjoin(Sequences.nreverse(assertible_conjuncts), (SubLObject)rkf_salient_descriptor.UNPROVIDED, (SubLObject)rkf_salient_descriptor.UNPROVIDED);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/rkf-salient-descriptor.lisp", position = 70001L)
    public static SubLObject initialize_rkf_deprecated_rules() {
        final SubLThread thread = SubLProcess.currentSubLThread();
        rkf_salient_descriptor.$rkf_deprecated_rules$.setGlobalValue(dictionary.new_dictionary(Symbols.symbol_function((SubLObject)rkf_salient_descriptor.EQUAL), (SubLObject)rkf_salient_descriptor.UNPROVIDED));
        final SubLObject _prev_bind_0 = mt_relevance_macros.$relevant_mt_function$.currentBinding(thread);
        final SubLObject _prev_bind_2 = mt_relevance_macros.$mt$.currentBinding(thread);
        try {
            mt_relevance_macros.$relevant_mt_function$.bind((SubLObject)rkf_salient_descriptor.$sym187$RELEVANT_MT_IS_EVERYTHING, thread);
            mt_relevance_macros.$mt$.bind(rkf_salient_descriptor.$const188$EverythingPSC, thread);
            final SubLObject node_var = rkf_salient_descriptor.$const189$deprecatedSalientDescriptorRule;
            final SubLObject deck_type = (SubLObject)rkf_salient_descriptor.$kw29$QUEUE;
            final SubLObject recur_deck = deck.create_deck(deck_type);
            SubLObject node_and_predicate_mode = (SubLObject)rkf_salient_descriptor.NIL;
            final SubLObject _prev_bind_0_$120 = sbhl_marking_vars.$sbhl_space$.currentBinding(thread);
            try {
                sbhl_marking_vars.$sbhl_space$.bind(sbhl_marking_vars.get_sbhl_marking_space(), thread);
                try {
                    final SubLObject tv_var = (SubLObject)rkf_salient_descriptor.NIL;
                    final SubLObject _prev_bind_0_$121 = sbhl_search_vars.$sbhl_tv$.currentBinding(thread);
                    final SubLObject _prev_bind_1_$122 = sbhl_search_vars.$relevant_sbhl_tv_function$.currentBinding(thread);
                    try {
                        sbhl_search_vars.$sbhl_tv$.bind((rkf_salient_descriptor.NIL != tv_var) ? tv_var : sbhl_search_vars.get_sbhl_true_tv(), thread);
                        sbhl_search_vars.$relevant_sbhl_tv_function$.bind((SubLObject)((rkf_salient_descriptor.NIL != tv_var) ? rkf_salient_descriptor.$sym31$RELEVANT_SBHL_TV_IS_GENERAL_TV : sbhl_search_vars.$relevant_sbhl_tv_function$.getDynamicValue(thread)), thread);
                        if (rkf_salient_descriptor.NIL != tv_var && rkf_salient_descriptor.NIL != sbhl_paranoia.sbhl_object_type_checking_p() && rkf_salient_descriptor.NIL == sbhl_search_vars.sbhl_true_tv_p(tv_var)) {
                            final SubLObject pcase_var = sbhl_paranoia.$sbhl_type_error_action$.getDynamicValue(thread);
                            if (pcase_var.eql((SubLObject)rkf_salient_descriptor.$kw32$ERROR)) {
                                sbhl_paranoia.sbhl_error((SubLObject)rkf_salient_descriptor.ONE_INTEGER, (SubLObject)rkf_salient_descriptor.$str33$_A_is_not_a__A, tv_var, (SubLObject)rkf_salient_descriptor.$sym34$SBHL_TRUE_TV_P, (SubLObject)rkf_salient_descriptor.UNPROVIDED, (SubLObject)rkf_salient_descriptor.UNPROVIDED, (SubLObject)rkf_salient_descriptor.UNPROVIDED);
                            }
                            else if (pcase_var.eql((SubLObject)rkf_salient_descriptor.$kw35$CERROR)) {
                                sbhl_paranoia.sbhl_cerror((SubLObject)rkf_salient_descriptor.ONE_INTEGER, (SubLObject)rkf_salient_descriptor.$str36$continue_anyway, (SubLObject)rkf_salient_descriptor.$str33$_A_is_not_a__A, tv_var, (SubLObject)rkf_salient_descriptor.$sym34$SBHL_TRUE_TV_P, (SubLObject)rkf_salient_descriptor.UNPROVIDED, (SubLObject)rkf_salient_descriptor.UNPROVIDED, (SubLObject)rkf_salient_descriptor.UNPROVIDED);
                            }
                            else if (pcase_var.eql((SubLObject)rkf_salient_descriptor.$kw37$WARN)) {
                                Errors.warn((SubLObject)rkf_salient_descriptor.$str33$_A_is_not_a__A, tv_var, (SubLObject)rkf_salient_descriptor.$sym34$SBHL_TRUE_TV_P);
                            }
                            else {
                                Errors.warn((SubLObject)rkf_salient_descriptor.$str38$_A_is_not_a_valid__sbhl_type_erro, sbhl_paranoia.$sbhl_type_error_action$.getDynamicValue(thread));
                                Errors.cerror((SubLObject)rkf_salient_descriptor.$str36$continue_anyway, (SubLObject)rkf_salient_descriptor.$str33$_A_is_not_a__A, tv_var, (SubLObject)rkf_salient_descriptor.$sym34$SBHL_TRUE_TV_P);
                            }
                        }
                        final SubLObject _prev_bind_0_$122 = sbhl_search_vars.$sbhl_search_module$.currentBinding(thread);
                        final SubLObject _prev_bind_1_$123 = sbhl_search_vars.$sbhl_search_module_type$.currentBinding(thread);
                        final SubLObject _prev_bind_3 = sbhl_search_vars.$sbhl_add_node_to_result_test$.currentBinding(thread);
                        final SubLObject _prev_bind_4 = sbhl_search_vars.$genl_inverse_mode_p$.currentBinding(thread);
                        final SubLObject _prev_bind_5 = sbhl_module_vars.$sbhl_module$.currentBinding(thread);
                        try {
                            sbhl_search_vars.$sbhl_search_module$.bind(sbhl_module_vars.get_sbhl_module(rkf_salient_descriptor.$const41$genlPreds), thread);
                            sbhl_search_vars.$sbhl_search_module_type$.bind(sbhl_module_utilities.get_sbhl_module_type(sbhl_module_vars.get_sbhl_module(rkf_salient_descriptor.$const41$genlPreds)), thread);
                            sbhl_search_vars.$sbhl_add_node_to_result_test$.bind(sbhl_module_utilities.get_sbhl_add_node_to_result_test(sbhl_module_vars.get_sbhl_module(rkf_salient_descriptor.$const41$genlPreds)), thread);
                            sbhl_search_vars.$genl_inverse_mode_p$.bind((SubLObject)rkf_salient_descriptor.NIL, thread);
                            sbhl_module_vars.$sbhl_module$.bind(sbhl_module_vars.get_sbhl_module(rkf_salient_descriptor.$const41$genlPreds), thread);
                            if (rkf_salient_descriptor.NIL != sbhl_paranoia.suspend_sbhl_type_checkingP() || rkf_salient_descriptor.NIL != sbhl_module_utilities.apply_sbhl_module_type_test(rkf_salient_descriptor.$const189$deprecatedSalientDescriptorRule, sbhl_module_vars.get_sbhl_module((SubLObject)rkf_salient_descriptor.UNPROVIDED))) {
                                final SubLObject _prev_bind_0_$123 = sbhl_search_vars.$sbhl_search_direction$.currentBinding(thread);
                                final SubLObject _prev_bind_1_$124 = sbhl_link_vars.$sbhl_link_direction$.currentBinding(thread);
                                final SubLObject _prev_bind_2_$127 = sbhl_search_vars.$genl_inverse_mode_p$.currentBinding(thread);
                                try {
                                    sbhl_search_vars.$sbhl_search_direction$.bind(sbhl_search_vars.get_sbhl_backward_search_direction(), thread);
                                    sbhl_link_vars.$sbhl_link_direction$.bind(sbhl_module_utilities.sbhl_search_direction_to_link_direction(sbhl_search_vars.get_sbhl_backward_search_direction(), sbhl_module_vars.get_sbhl_module(rkf_salient_descriptor.$const41$genlPreds)), thread);
                                    sbhl_search_vars.$genl_inverse_mode_p$.bind((SubLObject)rkf_salient_descriptor.NIL, thread);
                                    sbhl_marking_utilities.sbhl_mark_node_marked(node_var, (SubLObject)rkf_salient_descriptor.UNPROVIDED);
                                    for (node_and_predicate_mode = (SubLObject)ConsesLow.list(rkf_salient_descriptor.$const189$deprecatedSalientDescriptorRule, sbhl_search_vars.genl_inverse_mode_p()); rkf_salient_descriptor.NIL != node_and_predicate_mode; node_and_predicate_mode = deck.deck_pop(recur_deck)) {
                                        final SubLObject node_var_$128 = node_and_predicate_mode.first();
                                        final SubLObject predicate_mode = conses_high.second(node_and_predicate_mode);
                                        final SubLObject dep_pred = node_var_$128;
                                        final SubLObject _prev_bind_0_$124 = sbhl_search_vars.$genl_inverse_mode_p$.currentBinding(thread);
                                        try {
                                            sbhl_search_vars.$genl_inverse_mode_p$.bind(predicate_mode, thread);
                                            if (rkf_salient_descriptor.NIL != sbhl_search_utilities.apply_sbhl_add_node_test(sbhl_search_vars.get_sbhl_search_add_node_test(), node_var_$128)) {
                                                final SubLObject pred_var = dep_pred;
                                                if (rkf_salient_descriptor.NIL != kb_mapping_macros.do_predicate_extent_index_key_validator(pred_var)) {
                                                    final SubLObject str = (SubLObject)rkf_salient_descriptor.NIL;
                                                    final SubLObject _prev_bind_0_$125 = utilities_macros.$progress_start_time$.currentBinding(thread);
                                                    final SubLObject _prev_bind_1_$125 = utilities_macros.$progress_last_pacification_time$.currentBinding(thread);
                                                    final SubLObject _prev_bind_2_$128 = utilities_macros.$progress_elapsed_seconds_for_notification$.currentBinding(thread);
                                                    final SubLObject _prev_bind_3_$133 = utilities_macros.$progress_notification_count$.currentBinding(thread);
                                                    final SubLObject _prev_bind_4_$134 = utilities_macros.$progress_pacifications_since_last_nl$.currentBinding(thread);
                                                    final SubLObject _prev_bind_6 = utilities_macros.$progress_count$.currentBinding(thread);
                                                    final SubLObject _prev_bind_7 = utilities_macros.$is_noting_progressP$.currentBinding(thread);
                                                    final SubLObject _prev_bind_8 = utilities_macros.$silent_progressP$.currentBinding(thread);
                                                    try {
                                                        utilities_macros.$progress_start_time$.bind(Time.get_universal_time(), thread);
                                                        utilities_macros.$progress_last_pacification_time$.bind(utilities_macros.$progress_start_time$.getDynamicValue(thread), thread);
                                                        utilities_macros.$progress_elapsed_seconds_for_notification$.bind(utilities_macros.$suppress_all_progress_faster_than_seconds$.getDynamicValue(thread), thread);
                                                        utilities_macros.$progress_notification_count$.bind((SubLObject)rkf_salient_descriptor.ZERO_INTEGER, thread);
                                                        utilities_macros.$progress_pacifications_since_last_nl$.bind((SubLObject)rkf_salient_descriptor.ZERO_INTEGER, thread);
                                                        utilities_macros.$progress_count$.bind((SubLObject)rkf_salient_descriptor.ZERO_INTEGER, thread);
                                                        utilities_macros.$is_noting_progressP$.bind((SubLObject)rkf_salient_descriptor.T, thread);
                                                        utilities_macros.$silent_progressP$.bind((SubLObject)((rkf_salient_descriptor.NIL != str) ? utilities_macros.$silent_progressP$.getDynamicValue(thread) : rkf_salient_descriptor.T), thread);
                                                        utilities_macros.noting_progress_preamble(str);
                                                        final SubLObject iterator_var = kb_mapping_macros.new_predicate_extent_final_index_spec_iterator(pred_var);
                                                        SubLObject done_var = (SubLObject)rkf_salient_descriptor.NIL;
                                                        final SubLObject token_var = (SubLObject)rkf_salient_descriptor.NIL;
                                                        while (rkf_salient_descriptor.NIL == done_var) {
                                                            final SubLObject final_index_spec = iteration.iteration_next_without_values_macro_helper(iterator_var, token_var);
                                                            final SubLObject valid = (SubLObject)SubLObjectFactory.makeBoolean(!token_var.eql(final_index_spec));
                                                            if (rkf_salient_descriptor.NIL != valid) {
                                                                utilities_macros.note_progress();
                                                                SubLObject final_index_iterator = (SubLObject)rkf_salient_descriptor.NIL;
                                                                try {
                                                                    final_index_iterator = kb_mapping_macros.new_final_index_iterator(final_index_spec, (SubLObject)rkf_salient_descriptor.$kw145$GAF, (SubLObject)rkf_salient_descriptor.NIL, (SubLObject)rkf_salient_descriptor.NIL);
                                                                    SubLObject done_var_$135 = (SubLObject)rkf_salient_descriptor.NIL;
                                                                    final SubLObject token_var_$136 = (SubLObject)rkf_salient_descriptor.NIL;
                                                                    while (rkf_salient_descriptor.NIL == done_var_$135) {
                                                                        final SubLObject as = iteration.iteration_next_without_values_macro_helper(final_index_iterator, token_var_$136);
                                                                        final SubLObject valid_$137 = (SubLObject)SubLObjectFactory.makeBoolean(!token_var_$136.eql(as));
                                                                        if (rkf_salient_descriptor.NIL != valid_$137) {
                                                                            rkf_deprecate_rule_internal(assertions_high.gaf_arg1(as), assertions_high.assertion_mt(as));
                                                                        }
                                                                        done_var_$135 = (SubLObject)SubLObjectFactory.makeBoolean(rkf_salient_descriptor.NIL == valid_$137);
                                                                    }
                                                                }
                                                                finally {
                                                                    final SubLObject _prev_bind_0_$126 = Threads.$is_thread_performing_cleanupP$.currentBinding(thread);
                                                                    try {
                                                                        Threads.$is_thread_performing_cleanupP$.bind((SubLObject)rkf_salient_descriptor.T, thread);
                                                                        final SubLObject _values = Values.getValuesAsVector();
                                                                        if (rkf_salient_descriptor.NIL != final_index_iterator) {
                                                                            kb_mapping_macros.destroy_final_index_iterator(final_index_iterator);
                                                                        }
                                                                        Values.restoreValuesFromVector(_values);
                                                                    }
                                                                    finally {
                                                                        Threads.$is_thread_performing_cleanupP$.rebind(_prev_bind_0_$126, thread);
                                                                    }
                                                                }
                                                            }
                                                            done_var = (SubLObject)SubLObjectFactory.makeBoolean(rkf_salient_descriptor.NIL == valid);
                                                        }
                                                        utilities_macros.noting_progress_postamble();
                                                    }
                                                    finally {
                                                        utilities_macros.$silent_progressP$.rebind(_prev_bind_8, thread);
                                                        utilities_macros.$is_noting_progressP$.rebind(_prev_bind_7, thread);
                                                        utilities_macros.$progress_count$.rebind(_prev_bind_6, thread);
                                                        utilities_macros.$progress_pacifications_since_last_nl$.rebind(_prev_bind_4_$134, thread);
                                                        utilities_macros.$progress_notification_count$.rebind(_prev_bind_3_$133, thread);
                                                        utilities_macros.$progress_elapsed_seconds_for_notification$.rebind(_prev_bind_2_$128, thread);
                                                        utilities_macros.$progress_last_pacification_time$.rebind(_prev_bind_1_$125, thread);
                                                        utilities_macros.$progress_start_time$.rebind(_prev_bind_0_$125, thread);
                                                    }
                                                }
                                            }
                                            SubLObject cdolist_list_var;
                                            final SubLObject accessible_modules = cdolist_list_var = sbhl_macros.get_sbhl_accessible_modules(sbhl_module_vars.get_sbhl_module(rkf_salient_descriptor.$const41$genlPreds));
                                            SubLObject module_var = (SubLObject)rkf_salient_descriptor.NIL;
                                            module_var = cdolist_list_var.first();
                                            while (rkf_salient_descriptor.NIL != cdolist_list_var) {
                                                final SubLObject _prev_bind_0_$127 = sbhl_module_vars.$sbhl_module$.currentBinding(thread);
                                                final SubLObject _prev_bind_1_$126 = sbhl_search_vars.$genl_inverse_mode_p$.currentBinding(thread);
                                                try {
                                                    sbhl_module_vars.$sbhl_module$.bind(module_var, thread);
                                                    sbhl_search_vars.$genl_inverse_mode_p$.bind((SubLObject)((rkf_salient_descriptor.NIL != sbhl_search_vars.flip_genl_inverse_modeP((SubLObject)rkf_salient_descriptor.UNPROVIDED, (SubLObject)rkf_salient_descriptor.UNPROVIDED)) ? SubLObjectFactory.makeBoolean(rkf_salient_descriptor.NIL == sbhl_search_vars.$genl_inverse_mode_p$.getDynamicValue(thread)) : sbhl_search_vars.$genl_inverse_mode_p$.getDynamicValue(thread)), thread);
                                                    final SubLObject node = function_terms.naut_to_nart(node_var_$128);
                                                    if (rkf_salient_descriptor.NIL != sbhl_link_vars.sbhl_node_object_p(node)) {
                                                        final SubLObject d_link = sbhl_graphs.get_sbhl_graph_link(node, sbhl_module_vars.get_sbhl_module((SubLObject)rkf_salient_descriptor.UNPROVIDED));
                                                        if (rkf_salient_descriptor.NIL != d_link) {
                                                            final SubLObject mt_links = sbhl_links.get_sbhl_mt_links(d_link, sbhl_link_vars.get_sbhl_link_direction(), sbhl_module_vars.get_sbhl_module((SubLObject)rkf_salient_descriptor.UNPROVIDED));
                                                            if (rkf_salient_descriptor.NIL != mt_links) {
                                                                SubLObject iteration_state;
                                                                for (iteration_state = dictionary_contents.do_dictionary_contents_state(dictionary.dictionary_contents(mt_links)); rkf_salient_descriptor.NIL == dictionary_contents.do_dictionary_contents_doneP(iteration_state); iteration_state = dictionary_contents.do_dictionary_contents_next(iteration_state)) {
                                                                    thread.resetMultipleValues();
                                                                    final SubLObject mt = dictionary_contents.do_dictionary_contents_key_value(iteration_state);
                                                                    final SubLObject tv_links = thread.secondMultipleValue();
                                                                    thread.resetMultipleValues();
                                                                    if (rkf_salient_descriptor.NIL != mt_relevance_macros.relevant_mtP(mt)) {
                                                                        final SubLObject _prev_bind_0_$128 = sbhl_link_vars.$sbhl_link_mt$.currentBinding(thread);
                                                                        try {
                                                                            sbhl_link_vars.$sbhl_link_mt$.bind(mt, thread);
                                                                            SubLObject iteration_state_$142;
                                                                            for (iteration_state_$142 = dictionary_contents.do_dictionary_contents_state(dictionary.dictionary_contents(tv_links)); rkf_salient_descriptor.NIL == dictionary_contents.do_dictionary_contents_doneP(iteration_state_$142); iteration_state_$142 = dictionary_contents.do_dictionary_contents_next(iteration_state_$142)) {
                                                                                thread.resetMultipleValues();
                                                                                final SubLObject tv = dictionary_contents.do_dictionary_contents_key_value(iteration_state_$142);
                                                                                final SubLObject link_nodes = thread.secondMultipleValue();
                                                                                thread.resetMultipleValues();
                                                                                if (rkf_salient_descriptor.NIL != sbhl_search_vars.relevant_sbhl_tvP(tv)) {
                                                                                    final SubLObject _prev_bind_0_$129 = sbhl_link_vars.$sbhl_link_tv$.currentBinding(thread);
                                                                                    try {
                                                                                        sbhl_link_vars.$sbhl_link_tv$.bind(tv, thread);
                                                                                        final SubLObject sol = link_nodes;
                                                                                        if (rkf_salient_descriptor.NIL != set.set_p(sol)) {
                                                                                            final SubLObject set_contents_var = set.do_set_internal(sol);
                                                                                            SubLObject basis_object;
                                                                                            SubLObject state;
                                                                                            SubLObject node_vars_link_node;
                                                                                            for (basis_object = set_contents.do_set_contents_basis_object(set_contents_var), state = (SubLObject)rkf_salient_descriptor.NIL, state = set_contents.do_set_contents_initial_state(basis_object, set_contents_var); rkf_salient_descriptor.NIL == set_contents.do_set_contents_doneP(basis_object, state); state = set_contents.do_set_contents_update_state(state)) {
                                                                                                node_vars_link_node = set_contents.do_set_contents_next(basis_object, state);
                                                                                                if (rkf_salient_descriptor.NIL != set_contents.do_set_contents_element_validP(state, node_vars_link_node) && rkf_salient_descriptor.NIL == sbhl_marking_utilities.sbhl_search_path_termination_p(node_vars_link_node, (SubLObject)rkf_salient_descriptor.UNPROVIDED)) {
                                                                                                    sbhl_marking_utilities.sbhl_mark_node_marked(node_vars_link_node, (SubLObject)rkf_salient_descriptor.UNPROVIDED);
                                                                                                    deck.deck_push((SubLObject)ConsesLow.list(node_vars_link_node, sbhl_search_vars.genl_inverse_mode_p()), recur_deck);
                                                                                                }
                                                                                            }
                                                                                        }
                                                                                        else if (sol.isList()) {
                                                                                            SubLObject csome_list_var = sol;
                                                                                            SubLObject node_vars_link_node2 = (SubLObject)rkf_salient_descriptor.NIL;
                                                                                            node_vars_link_node2 = csome_list_var.first();
                                                                                            while (rkf_salient_descriptor.NIL != csome_list_var) {
                                                                                                if (rkf_salient_descriptor.NIL == sbhl_marking_utilities.sbhl_search_path_termination_p(node_vars_link_node2, (SubLObject)rkf_salient_descriptor.UNPROVIDED)) {
                                                                                                    sbhl_marking_utilities.sbhl_mark_node_marked(node_vars_link_node2, (SubLObject)rkf_salient_descriptor.UNPROVIDED);
                                                                                                    deck.deck_push((SubLObject)ConsesLow.list(node_vars_link_node2, sbhl_search_vars.genl_inverse_mode_p()), recur_deck);
                                                                                                }
                                                                                                csome_list_var = csome_list_var.rest();
                                                                                                node_vars_link_node2 = csome_list_var.first();
                                                                                            }
                                                                                        }
                                                                                        else {
                                                                                            Errors.error((SubLObject)rkf_salient_descriptor.$str42$_A_is_neither_SET_P_nor_LISTP_, sol);
                                                                                        }
                                                                                    }
                                                                                    finally {
                                                                                        sbhl_link_vars.$sbhl_link_tv$.rebind(_prev_bind_0_$129, thread);
                                                                                    }
                                                                                }
                                                                            }
                                                                            dictionary_contents.do_dictionary_contents_finalize(iteration_state_$142);
                                                                        }
                                                                        finally {
                                                                            sbhl_link_vars.$sbhl_link_mt$.rebind(_prev_bind_0_$128, thread);
                                                                        }
                                                                    }
                                                                }
                                                                dictionary_contents.do_dictionary_contents_finalize(iteration_state);
                                                            }
                                                        }
                                                        else {
                                                            sbhl_paranoia.sbhl_error((SubLObject)rkf_salient_descriptor.FIVE_INTEGER, (SubLObject)rkf_salient_descriptor.$str43$attempting_to_bind_direction_link, (SubLObject)rkf_salient_descriptor.UNPROVIDED, (SubLObject)rkf_salient_descriptor.UNPROVIDED, (SubLObject)rkf_salient_descriptor.UNPROVIDED, (SubLObject)rkf_salient_descriptor.UNPROVIDED, (SubLObject)rkf_salient_descriptor.UNPROVIDED);
                                                        }
                                                    }
                                                    else if (rkf_salient_descriptor.NIL != obsolete.cnat_p(node, (SubLObject)rkf_salient_descriptor.UNPROVIDED)) {
                                                        SubLObject cdolist_list_var_$144;
                                                        final SubLObject new_list = cdolist_list_var_$144 = ((rkf_salient_descriptor.NIL != sbhl_link_vars.sbhl_randomize_lists_p()) ? list_utilities.randomize_list(sbhl_module_utilities.get_sbhl_module_relevant_naut_link_generators(sbhl_link_vars.get_sbhl_link_direction(), sbhl_search_vars.$sbhl_tv$.getDynamicValue(thread), sbhl_module_vars.get_sbhl_module((SubLObject)rkf_salient_descriptor.UNPROVIDED))) : sbhl_module_utilities.get_sbhl_module_relevant_naut_link_generators(sbhl_link_vars.get_sbhl_link_direction(), sbhl_search_vars.$sbhl_tv$.getDynamicValue(thread), sbhl_module_vars.get_sbhl_module((SubLObject)rkf_salient_descriptor.UNPROVIDED)));
                                                        SubLObject generating_fn = (SubLObject)rkf_salient_descriptor.NIL;
                                                        generating_fn = cdolist_list_var_$144.first();
                                                        while (rkf_salient_descriptor.NIL != cdolist_list_var_$144) {
                                                            final SubLObject _prev_bind_0_$130 = sbhl_link_vars.$sbhl_link_generator$.currentBinding(thread);
                                                            try {
                                                                sbhl_link_vars.$sbhl_link_generator$.bind(generating_fn, thread);
                                                                final SubLObject sol2;
                                                                final SubLObject link_nodes2 = sol2 = Functions.funcall(generating_fn, node);
                                                                if (rkf_salient_descriptor.NIL != set.set_p(sol2)) {
                                                                    final SubLObject set_contents_var2 = set.do_set_internal(sol2);
                                                                    SubLObject basis_object2;
                                                                    SubLObject state2;
                                                                    SubLObject node_vars_link_node3;
                                                                    for (basis_object2 = set_contents.do_set_contents_basis_object(set_contents_var2), state2 = (SubLObject)rkf_salient_descriptor.NIL, state2 = set_contents.do_set_contents_initial_state(basis_object2, set_contents_var2); rkf_salient_descriptor.NIL == set_contents.do_set_contents_doneP(basis_object2, state2); state2 = set_contents.do_set_contents_update_state(state2)) {
                                                                        node_vars_link_node3 = set_contents.do_set_contents_next(basis_object2, state2);
                                                                        if (rkf_salient_descriptor.NIL != set_contents.do_set_contents_element_validP(state2, node_vars_link_node3) && rkf_salient_descriptor.NIL == sbhl_marking_utilities.sbhl_search_path_termination_p(node_vars_link_node3, (SubLObject)rkf_salient_descriptor.UNPROVIDED)) {
                                                                            sbhl_marking_utilities.sbhl_mark_node_marked(node_vars_link_node3, (SubLObject)rkf_salient_descriptor.UNPROVIDED);
                                                                            deck.deck_push((SubLObject)ConsesLow.list(node_vars_link_node3, sbhl_search_vars.genl_inverse_mode_p()), recur_deck);
                                                                        }
                                                                    }
                                                                }
                                                                else if (sol2.isList()) {
                                                                    SubLObject csome_list_var2 = sol2;
                                                                    SubLObject node_vars_link_node4 = (SubLObject)rkf_salient_descriptor.NIL;
                                                                    node_vars_link_node4 = csome_list_var2.first();
                                                                    while (rkf_salient_descriptor.NIL != csome_list_var2) {
                                                                        if (rkf_salient_descriptor.NIL == sbhl_marking_utilities.sbhl_search_path_termination_p(node_vars_link_node4, (SubLObject)rkf_salient_descriptor.UNPROVIDED)) {
                                                                            sbhl_marking_utilities.sbhl_mark_node_marked(node_vars_link_node4, (SubLObject)rkf_salient_descriptor.UNPROVIDED);
                                                                            deck.deck_push((SubLObject)ConsesLow.list(node_vars_link_node4, sbhl_search_vars.genl_inverse_mode_p()), recur_deck);
                                                                        }
                                                                        csome_list_var2 = csome_list_var2.rest();
                                                                        node_vars_link_node4 = csome_list_var2.first();
                                                                    }
                                                                }
                                                                else {
                                                                    Errors.error((SubLObject)rkf_salient_descriptor.$str42$_A_is_neither_SET_P_nor_LISTP_, sol2);
                                                                }
                                                            }
                                                            finally {
                                                                sbhl_link_vars.$sbhl_link_generator$.rebind(_prev_bind_0_$130, thread);
                                                            }
                                                            cdolist_list_var_$144 = cdolist_list_var_$144.rest();
                                                            generating_fn = cdolist_list_var_$144.first();
                                                        }
                                                    }
                                                }
                                                finally {
                                                    sbhl_search_vars.$genl_inverse_mode_p$.rebind(_prev_bind_1_$126, thread);
                                                    sbhl_module_vars.$sbhl_module$.rebind(_prev_bind_0_$127, thread);
                                                }
                                                cdolist_list_var = cdolist_list_var.rest();
                                                module_var = cdolist_list_var.first();
                                            }
                                        }
                                        finally {
                                            sbhl_search_vars.$genl_inverse_mode_p$.rebind(_prev_bind_0_$124, thread);
                                        }
                                    }
                                }
                                finally {
                                    sbhl_search_vars.$genl_inverse_mode_p$.rebind(_prev_bind_2_$127, thread);
                                    sbhl_link_vars.$sbhl_link_direction$.rebind(_prev_bind_1_$124, thread);
                                    sbhl_search_vars.$sbhl_search_direction$.rebind(_prev_bind_0_$123, thread);
                                }
                            }
                            else {
                                sbhl_paranoia.sbhl_warn((SubLObject)rkf_salient_descriptor.TWO_INTEGER, (SubLObject)rkf_salient_descriptor.$str44$Node__a_does_not_pass_sbhl_type_t, rkf_salient_descriptor.$const189$deprecatedSalientDescriptorRule, sbhl_module_utilities.get_sbhl_type_test(sbhl_module_vars.get_sbhl_module((SubLObject)rkf_salient_descriptor.UNPROVIDED)), (SubLObject)rkf_salient_descriptor.UNPROVIDED, (SubLObject)rkf_salient_descriptor.UNPROVIDED, (SubLObject)rkf_salient_descriptor.UNPROVIDED);
                            }
                        }
                        finally {
                            sbhl_module_vars.$sbhl_module$.rebind(_prev_bind_5, thread);
                            sbhl_search_vars.$genl_inverse_mode_p$.rebind(_prev_bind_4, thread);
                            sbhl_search_vars.$sbhl_add_node_to_result_test$.rebind(_prev_bind_3, thread);
                            sbhl_search_vars.$sbhl_search_module_type$.rebind(_prev_bind_1_$123, thread);
                            sbhl_search_vars.$sbhl_search_module$.rebind(_prev_bind_0_$122, thread);
                        }
                    }
                    finally {
                        sbhl_search_vars.$relevant_sbhl_tv_function$.rebind(_prev_bind_1_$122, thread);
                        sbhl_search_vars.$sbhl_tv$.rebind(_prev_bind_0_$121, thread);
                    }
                }
                finally {
                    final SubLObject _prev_bind_0_$131 = Threads.$is_thread_performing_cleanupP$.currentBinding(thread);
                    try {
                        Threads.$is_thread_performing_cleanupP$.bind((SubLObject)rkf_salient_descriptor.T, thread);
                        final SubLObject _values2 = Values.getValuesAsVector();
                        sbhl_marking_vars.free_sbhl_marking_space(sbhl_marking_vars.$sbhl_space$.getDynamicValue(thread));
                        Values.restoreValuesFromVector(_values2);
                    }
                    finally {
                        Threads.$is_thread_performing_cleanupP$.rebind(_prev_bind_0_$131, thread);
                    }
                }
            }
            finally {
                sbhl_marking_vars.$sbhl_space$.rebind(_prev_bind_0_$120, thread);
            }
        }
        finally {
            mt_relevance_macros.$mt$.rebind(_prev_bind_2, thread);
            mt_relevance_macros.$relevant_mt_function$.rebind(_prev_bind_0, thread);
        }
        return rkf_salient_descriptor.$rkf_deprecated_rules$.getGlobalValue();
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/rkf-salient-descriptor.lisp", position = 70344L)
    public static SubLObject rkf_deprecate_rule_internal(final SubLObject rule, final SubLObject mt) {
        if (rkf_salient_descriptor.NIL == dictionary.dictionary_p(rkf_salient_descriptor.$rkf_deprecated_rules$.getGlobalValue())) {
            initialize_rkf_deprecated_rules();
        }
        dictionary.dictionary_enter(rkf_salient_descriptor.$rkf_deprecated_rules$.getGlobalValue(), rule, mt);
        return rule;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/rkf-salient-descriptor.lisp", position = 70553L)
    public static SubLObject rkf_salient_descriptor_deprecate_rule(final SubLObject rule, final SubLObject mt) {
        if (rkf_salient_descriptor.NIL != assertion_handles.assertion_p(rule)) {
            rkf_assertion_utilities.rkf_assert((SubLObject)ConsesLow.list(rkf_salient_descriptor.$const190$deprecatedSalientDescriptorRuleAs, rule), mt, (SubLObject)rkf_salient_descriptor.UNPROVIDED, (SubLObject)rkf_salient_descriptor.UNPROVIDED);
        }
        else if (rkf_salient_descriptor.NIL != el_utilities.el_formula_p(rule)) {
            rkf_assertion_utilities.rkf_assert((SubLObject)ConsesLow.list(rkf_salient_descriptor.$const189$deprecatedSalientDescriptorRule, rule), mt, (SubLObject)rkf_salient_descriptor.UNPROVIDED, (SubLObject)rkf_salient_descriptor.UNPROVIDED);
        }
        rkf_deprecate_rule_internal(rule, mt);
        return rule;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/rkf-salient-descriptor.lisp", position = 70865L)
    public static SubLObject deprecate_salient_descriptor_rule(final SubLObject argument, final SubLObject assertion) {
        final SubLObject rule = assertions_high.gaf_arg1(assertion);
        final SubLObject mt = assertions_high.assertion_mt(assertion);
        return rkf_deprecate_rule_internal(rule, mt);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/rkf-salient-descriptor.lisp", position = 71082L)
    public static SubLObject undeprecate_salient_descriptor_rule(final SubLObject argument, final SubLObject assertion) {
        rkf_salient_descriptor.$rkf_deprecated_rules$.setGlobalValue((SubLObject)rkf_salient_descriptor.$kw186$UNINITIALIZED);
        return assertion;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/rkf-salient-descriptor.lisp", position = 71260L)
    public static SubLObject rkf_deprecated_sd_ruleP(final SubLObject rule, final SubLObject mt) {
        if (rkf_salient_descriptor.NIL == dictionary.dictionary_p(rkf_salient_descriptor.$rkf_deprecated_rules$.getGlobalValue())) {
            initialize_rkf_deprecated_rules();
        }
        SubLObject ans = (SubLObject)rkf_salient_descriptor.NIL;
        if (rkf_salient_descriptor.NIL != assertion_handles.assertion_p(rule) || rkf_salient_descriptor.NIL != el_utilities.el_formula_p(rule)) {
            final SubLObject dep_mt = dictionary.dictionary_lookup(rkf_salient_descriptor.$rkf_deprecated_rules$.getGlobalValue(), rule, (SubLObject)rkf_salient_descriptor.$kw56$NOT_FOUND);
            ans = (SubLObject)SubLObjectFactory.makeBoolean(rkf_salient_descriptor.NIL != hlmt.hlmt_p(dep_mt) && rkf_salient_descriptor.NIL != genl_mts.genl_mtP(mt, dep_mt, (SubLObject)rkf_salient_descriptor.UNPROVIDED, (SubLObject)rkf_salient_descriptor.UNPROVIDED));
        }
        return ans;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/rkf-salient-descriptor.lisp", position = 71858L)
    public static SubLObject rkf_bad_sd_ruleP(final SubLObject rule, final SubLObject mt) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        if (rkf_salient_descriptor.NIL != assertion_handles.assertion_p(rule) && rkf_salient_descriptor.NIL != list_utilities.lengthG(clauses.neg_lits(assertions_high.assertion_cnf(rule)), rkf_salient_descriptor.$rkf_sd_rule_neg_lit_max$.getDynamicValue(thread), (SubLObject)rkf_salient_descriptor.UNPROVIDED)) {
            return (SubLObject)rkf_salient_descriptor.T;
        }
        if (rkf_salient_descriptor.NIL != assertion_handles.assertion_p(rule) && rkf_salient_descriptor.NIL != list_utilities.lengthL(clauses.neg_lits(assertions_high.assertion_cnf(rule)), rkf_salient_descriptor.$rkf_sd_rule_neg_lit_min$.getDynamicValue(thread), (SubLObject)rkf_salient_descriptor.UNPROVIDED)) {
            return (SubLObject)rkf_salient_descriptor.T;
        }
        if (rkf_salient_descriptor.NIL != assertion_handles.assertion_p(rule) && rkf_salient_descriptor.NIL != list_utilities.lengthG(clauses.pos_lits(assertions_high.assertion_cnf(rule)), rkf_salient_descriptor.$rkf_sd_rule_pos_lit_max$.getDynamicValue(thread), (SubLObject)rkf_salient_descriptor.UNPROVIDED)) {
            return (SubLObject)rkf_salient_descriptor.T;
        }
        if (rkf_salient_descriptor.NIL != assertion_handles.assertion_p(rule) && rkf_salient_descriptor.NIL != list_utilities.lengthL(clauses.pos_lits(assertions_high.assertion_cnf(rule)), rkf_salient_descriptor.$rkf_sd_rule_pos_lit_min$.getDynamicValue(thread), (SubLObject)rkf_salient_descriptor.UNPROVIDED)) {
            return (SubLObject)rkf_salient_descriptor.T;
        }
        if (rkf_salient_descriptor.NIL != rkf_deprecated_sd_ruleP(rule, mt)) {
            return (SubLObject)rkf_salient_descriptor.T;
        }
        if (rkf_salient_descriptor.NIL != assertion_handles.assertion_p(rule) && rkf_salient_descriptor.NIL != rkf_sd_tva_equivalent_ruleP(rule, (SubLObject)rkf_salient_descriptor.NIL)) {
            return (SubLObject)rkf_salient_descriptor.T;
        }
        if (rkf_salient_descriptor.NIL != assertion_handles.assertion_p(rule) && rkf_salient_descriptor.NIL != rkf_sd_type_based_strengthening_ruleP(rule)) {
            return (SubLObject)rkf_salient_descriptor.T;
        }
        if (rkf_salient_descriptor.NIL != assertion_handles.assertion_p(rule) && rkf_salient_descriptor.NIL != rkf_relevance_utilities.rkf_irrelevant_formula(uncanonicalizer.assertion_el_formula(rule), mt)) {
            return (SubLObject)rkf_salient_descriptor.T;
        }
        if (rkf_salient_descriptor.NIL != rkf_sd_arg_constraint_ruleP(rule)) {
            return (SubLObject)rkf_salient_descriptor.T;
        }
        return (SubLObject)rkf_salient_descriptor.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/rkf-salient-descriptor.lisp", position = 73223L)
    public static SubLObject rkf_sd_arg_constraint_ruleP(final SubLObject rule) {
        SubLObject ans = (SubLObject)rkf_salient_descriptor.NIL;
        if (rkf_salient_descriptor.NIL != assertion_handles.assertion_p(rule)) {
            final SubLObject cnf = assertions_high.assertion_cnf(rule);
            if (rkf_salient_descriptor.NIL == ans) {
                SubLObject csome_list_var = clauses.pos_lits(cnf);
                SubLObject pos_lit = (SubLObject)rkf_salient_descriptor.NIL;
                pos_lit = csome_list_var.first();
                while (rkf_salient_descriptor.NIL == ans && rkf_salient_descriptor.NIL != csome_list_var) {
                    if (rkf_salient_descriptor.NIL != isa.isaP(cycl_utilities.atomic_sentence_predicate(pos_lit), rkf_salient_descriptor.$const193$ArgConstraintPredicate, (SubLObject)rkf_salient_descriptor.UNPROVIDED, (SubLObject)rkf_salient_descriptor.UNPROVIDED)) {
                        ans = (SubLObject)rkf_salient_descriptor.T;
                    }
                    csome_list_var = csome_list_var.rest();
                    pos_lit = csome_list_var.first();
                }
            }
        }
        return ans;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/rkf-salient-descriptor.lisp", position = 73583L)
    public static SubLObject rkf_sd_tva_equivalent_ruleP(final SubLObject as, SubLObject strictP) {
        if (strictP == rkf_salient_descriptor.UNPROVIDED) {
            strictP = (SubLObject)rkf_salient_descriptor.T;
        }
        final SubLObject cnf = assertions_high.assertion_cnf(as);
        final SubLObject neg_lits = clauses.neg_lits(cnf);
        final SubLObject pos_lits = clauses.pos_lits(cnf);
        SubLObject tva = (SubLObject)rkf_salient_descriptor.NIL;
        if (rkf_salient_descriptor.NIL != list_utilities.lengthGE(neg_lits, (SubLObject)rkf_salient_descriptor.TWO_INTEGER, (SubLObject)rkf_salient_descriptor.UNPROVIDED) && (rkf_salient_descriptor.NIL == strictP || rkf_salient_descriptor.NIL != list_utilities.lengthE(neg_lits, (SubLObject)rkf_salient_descriptor.TWO_INTEGER, (SubLObject)rkf_salient_descriptor.UNPROVIDED)) && rkf_salient_descriptor.NIL != list_utilities.lengthE(pos_lits, (SubLObject)rkf_salient_descriptor.ONE_INTEGER, (SubLObject)rkf_salient_descriptor.UNPROVIDED) && (rkf_salient_descriptor.NIL == strictP || rkf_salient_descriptor.NIL == list_utilities.find_if_not((SubLObject)rkf_salient_descriptor.$sym169$HL_VAR_, cycl_utilities.formula_args(pos_lits.first(), (SubLObject)rkf_salient_descriptor.UNPROVIDED), (SubLObject)rkf_salient_descriptor.UNPROVIDED, (SubLObject)rkf_salient_descriptor.UNPROVIDED, (SubLObject)rkf_salient_descriptor.UNPROVIDED))) {
            final SubLObject pos_lit = pos_lits.first();
            SubLObject arg0 = (SubLObject)rkf_salient_descriptor.NIL;
            final SubLObject arg2 = cycl_utilities.atomic_sentence_predicate(pos_lit);
            final SubLObject neg_lit_pattern = el_utilities.make_binary_formula(arg2, (SubLObject)rkf_salient_descriptor.$list194, (SubLObject)((rkf_salient_descriptor.NIL != strictP) ? rkf_salient_descriptor.$list194 : rkf_salient_descriptor.$kw195$ANYTHING));
            SubLObject arg3 = (SubLObject)rkf_salient_descriptor.NIL;
            SubLObject arg4 = (SubLObject)rkf_salient_descriptor.NIL;
            if (rkf_salient_descriptor.NIL != forts.fort_p(arg2) && rkf_salient_descriptor.NIL == arg3) {
                SubLObject csome_list_var = neg_lits;
                SubLObject neg_lit = (SubLObject)rkf_salient_descriptor.NIL;
                neg_lit = csome_list_var.first();
                while (rkf_salient_descriptor.NIL == arg3 && rkf_salient_descriptor.NIL != csome_list_var) {
                    if (rkf_salient_descriptor.NIL != formula_pattern_match.formula_matches_pattern(neg_lit, neg_lit_pattern) && rkf_salient_descriptor.NIL == arg3) {
                        SubLObject csome_list_var_$147 = Sequences.remove(neg_lit, neg_lits, Symbols.symbol_function((SubLObject)rkf_salient_descriptor.EQUAL), (SubLObject)rkf_salient_descriptor.UNPROVIDED, (SubLObject)rkf_salient_descriptor.UNPROVIDED, (SubLObject)rkf_salient_descriptor.UNPROVIDED, (SubLObject)rkf_salient_descriptor.UNPROVIDED);
                        SubLObject other_lit = (SubLObject)rkf_salient_descriptor.NIL;
                        other_lit = csome_list_var_$147.first();
                        while (rkf_salient_descriptor.NIL == arg3 && rkf_salient_descriptor.NIL != csome_list_var_$147) {
                            final SubLObject other_pred = cycl_utilities.atomic_sentence_predicate(other_lit);
                            if (rkf_salient_descriptor.NIL != ((rkf_salient_descriptor.NIL != strictP) ? isa.isaP(other_pred, rkf_salient_descriptor.$const196$TransitiveBinaryPredicate, (SubLObject)rkf_salient_descriptor.UNPROVIDED, (SubLObject)rkf_salient_descriptor.UNPROVIDED) : isa.isaP(other_pred, rkf_salient_descriptor.$const197$BinaryPredicate, (SubLObject)rkf_salient_descriptor.UNPROVIDED, (SubLObject)rkf_salient_descriptor.UNPROVIDED))) {
                                SubLObject list_var = (SubLObject)rkf_salient_descriptor.NIL;
                                SubLObject pos_lit_arg = (SubLObject)rkf_salient_descriptor.NIL;
                                SubLObject arg_num = (SubLObject)rkf_salient_descriptor.NIL;
                                list_var = pos_lit;
                                pos_lit_arg = list_var.first();
                                for (arg_num = (SubLObject)rkf_salient_descriptor.ZERO_INTEGER; rkf_salient_descriptor.NIL == arg4 && rkf_salient_descriptor.NIL != list_var; list_var = list_var.rest(), pos_lit_arg = list_var.first(), arg_num = Numbers.add((SubLObject)rkf_salient_descriptor.ONE_INTEGER, arg_num)) {
                                    final SubLObject neg_lit_arg = cycl_utilities.atomic_sentence_arg(neg_lit, arg_num, (SubLObject)rkf_salient_descriptor.UNPROVIDED);
                                    if (!arg_num.isZero() && !pos_lit_arg.eql(neg_lit_arg) && pos_lit.equal(cycl_utilities.expression_subst(pos_lit_arg, neg_lit_arg, neg_lit, (SubLObject)rkf_salient_descriptor.UNPROVIDED, (SubLObject)rkf_salient_descriptor.UNPROVIDED))) {
                                        if (cycl_utilities.formula_args(other_lit, (SubLObject)rkf_salient_descriptor.UNPROVIDED).equal((SubLObject)ConsesLow.list(neg_lit_arg, pos_lit_arg))) {
                                            arg0 = rkf_salient_descriptor.$const198$transitiveViaArg;
                                        }
                                        else if (cycl_utilities.formula_args(other_lit, (SubLObject)rkf_salient_descriptor.UNPROVIDED).equal((SubLObject)ConsesLow.list(pos_lit_arg, neg_lit_arg))) {
                                            arg0 = rkf_salient_descriptor.$const199$transitiveViaArgInverse;
                                        }
                                        if (rkf_salient_descriptor.NIL != arg0) {
                                            arg4 = arg_num;
                                        }
                                    }
                                }
                                if (rkf_salient_descriptor.NIL != arg4) {
                                    arg3 = other_pred;
                                    if (arg3.eql(arg2)) {
                                        tva = el_utilities.make_binary_formula(rkf_salient_descriptor.$const24$isa, arg2, rkf_salient_descriptor.$const196$TransitiveBinaryPredicate);
                                    }
                                    else {
                                        tva = el_utilities.make_ternary_formula(arg0, arg2, arg3, arg4);
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
    public static SubLObject rkf_sd_type_based_strengthening_ruleP(final SubLObject rule) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject ans = (SubLObject)rkf_salient_descriptor.NIL;
        final SubLObject hl_cnf = assertions_high.assertion_cnf(rule);
        SubLObject current;
        final SubLObject datum = current = hl_cnf;
        SubLObject neg_lits = (SubLObject)rkf_salient_descriptor.NIL;
        SubLObject pos_lits = (SubLObject)rkf_salient_descriptor.NIL;
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)rkf_salient_descriptor.$list200);
        neg_lits = current.first();
        current = current.rest();
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)rkf_salient_descriptor.$list200);
        pos_lits = current.first();
        current = current.rest();
        if (rkf_salient_descriptor.NIL == current) {
            if (rkf_salient_descriptor.NIL != list_utilities.lengthE(neg_lits, (SubLObject)rkf_salient_descriptor.TWO_INTEGER, (SubLObject)rkf_salient_descriptor.UNPROVIDED) && rkf_salient_descriptor.NIL != list_utilities.lengthE(pos_lits, (SubLObject)rkf_salient_descriptor.ONE_INTEGER, (SubLObject)rkf_salient_descriptor.UNPROVIDED)) {
                SubLObject constraint_lit = (SubLObject)rkf_salient_descriptor.NIL;
                SubLObject constrained_var = (SubLObject)rkf_salient_descriptor.NIL;
                if (rkf_salient_descriptor.NIL == constraint_lit) {
                    SubLObject csome_list_var = neg_lits;
                    SubLObject neg_lit = (SubLObject)rkf_salient_descriptor.NIL;
                    neg_lit = csome_list_var.first();
                    while (rkf_salient_descriptor.NIL == constraint_lit && rkf_salient_descriptor.NIL != csome_list_var) {
                        if (rkf_salient_descriptor.NIL != subl_promotions.memberP(cycl_utilities.atomic_sentence_predicate(neg_lit), (SubLObject)rkf_salient_descriptor.$list201, (SubLObject)rkf_salient_descriptor.UNPROVIDED, (SubLObject)rkf_salient_descriptor.UNPROVIDED) && rkf_salient_descriptor.NIL != variables.variable_p(cycl_utilities.atomic_sentence_arg(neg_lit, (SubLObject)rkf_salient_descriptor.ONE_INTEGER, (SubLObject)rkf_salient_descriptor.UNPROVIDED))) {
                            constraint_lit = neg_lit;
                            constrained_var = cycl_utilities.atomic_sentence_arg(neg_lit, (SubLObject)rkf_salient_descriptor.ONE_INTEGER, (SubLObject)rkf_salient_descriptor.UNPROVIDED);
                        }
                        csome_list_var = csome_list_var.rest();
                        neg_lit = csome_list_var.first();
                    }
                }
                if (rkf_salient_descriptor.NIL != constraint_lit) {
                    final SubLObject other_neg_lit = Sequences.remove(constraint_lit, neg_lits, (SubLObject)rkf_salient_descriptor.UNPROVIDED, (SubLObject)rkf_salient_descriptor.UNPROVIDED, (SubLObject)rkf_salient_descriptor.UNPROVIDED, (SubLObject)rkf_salient_descriptor.UNPROVIDED, (SubLObject)rkf_salient_descriptor.UNPROVIDED).first();
                    final SubLObject other_neg_lit_pred = cycl_utilities.atomic_sentence_predicate(other_neg_lit);
                    final SubLObject pos_lit = pos_lits.first();
                    final SubLObject pos_lit_pred = cycl_utilities.atomic_sentence_predicate(pos_lit);
                    final SubLObject _prev_bind_0 = mt_relevance_macros.$relevant_mt_function$.currentBinding(thread);
                    final SubLObject _prev_bind_2 = mt_relevance_macros.$mt$.currentBinding(thread);
                    try {
                        mt_relevance_macros.$relevant_mt_function$.bind((SubLObject)rkf_salient_descriptor.$sym187$RELEVANT_MT_IS_EVERYTHING, thread);
                        mt_relevance_macros.$mt$.bind(rkf_salient_descriptor.$const188$EverythingPSC, thread);
                        ans = (SubLObject)SubLObjectFactory.makeBoolean(rkf_salient_descriptor.NIL != subl_promotions.memberP(constrained_var, cycl_utilities.formula_args(other_neg_lit, (SubLObject)rkf_salient_descriptor.UNPROVIDED), (SubLObject)rkf_salient_descriptor.UNPROVIDED, (SubLObject)rkf_salient_descriptor.UNPROVIDED) && rkf_salient_descriptor.NIL != conses_high.member(constrained_var, cycl_utilities.formula_args(pos_lit, (SubLObject)rkf_salient_descriptor.UNPROVIDED), (SubLObject)rkf_salient_descriptor.UNPROVIDED, (SubLObject)rkf_salient_descriptor.UNPROVIDED) && rkf_salient_descriptor.NIL != el_utilities.same_formula_arity_p(other_neg_lit, pos_lit, (SubLObject)rkf_salient_descriptor.UNPROVIDED) && rkf_salient_descriptor.NIL != forts.fort_p(other_neg_lit_pred) && rkf_salient_descriptor.NIL != forts.fort_p(pos_lit_pred) && rkf_salient_descriptor.NIL != sbhl_search_methods.sbhl_min_ceilings(rkf_salient_descriptor.$const41$genlPreds, (SubLObject)ConsesLow.list(other_neg_lit_pred, pos_lit_pred), (SubLObject)rkf_salient_descriptor.UNPROVIDED, (SubLObject)rkf_salient_descriptor.UNPROVIDED, (SubLObject)rkf_salient_descriptor.UNPROVIDED));
                    }
                    finally {
                        mt_relevance_macros.$mt$.rebind(_prev_bind_2, thread);
                        mt_relevance_macros.$relevant_mt_function$.rebind(_prev_bind_0, thread);
                    }
                }
            }
        }
        else {
            cdestructuring_bind.cdestructuring_bind_error(datum, (SubLObject)rkf_salient_descriptor.$list200);
        }
        return ans;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/rkf-salient-descriptor.lisp", position = 76836L)
    public static SubLObject rkf_sort_salient_formulas(final SubLObject suggestions) {
        return suggestions;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/rkf-salient-descriptor.lisp", position = 77273L)
    public static SubLObject rkf_sd_clear() {
        return Hashtables.clrhash(rkf_salient_descriptor.$rkf_salient_descriptor_cache$.getGlobalValue());
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/rkf-salient-descriptor.lisp", position = 77356L)
    public static SubLObject rkf_sd_present(final SubLObject cache_key) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        thread.resetMultipleValues();
        final SubLObject value = rkf_sd_lookup(cache_key);
        final SubLObject present = thread.secondMultipleValue();
        thread.resetMultipleValues();
        return present;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/rkf-salient-descriptor.lisp", position = 77505L)
    public static SubLObject rkf_sd_lookup(final SubLObject cache_key) {
        return Hashtables.gethash(cache_key, rkf_salient_descriptor.$rkf_salient_descriptor_cache$.getGlobalValue(), (SubLObject)rkf_salient_descriptor.NIL);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/rkf-salient-descriptor.lisp", position = 77612L)
    public static SubLObject rkf_sd_update(final SubLObject cache_key, final SubLObject formulas) {
        SubLObject release = (SubLObject)rkf_salient_descriptor.NIL;
        try {
            release = Locks.seize_lock(rkf_salient_descriptor.$rkf_salient_descriptor_cache_lock$.getGlobalValue());
            Hashtables.sethash(cache_key, rkf_salient_descriptor.$rkf_salient_descriptor_cache$.getGlobalValue(), formulas);
        }
        finally {
            if (rkf_salient_descriptor.NIL != release) {
                Locks.release_lock(rkf_salient_descriptor.$rkf_salient_descriptor_cache_lock$.getGlobalValue());
            }
        }
        return (SubLObject)rkf_salient_descriptor.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/rkf-salient-descriptor.lisp", position = 78141L)
    public static SubLObject rkf_sd_ignore_clear() {
        return Hashtables.clrhash(rkf_salient_descriptor.$rkf_salient_descriptor_ignore_cache$.getGlobalValue());
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/rkf-salient-descriptor.lisp", position = 78238L)
    public static SubLObject rkf_sd_ignore_present(final SubLObject cache_key) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        thread.resetMultipleValues();
        final SubLObject value = rkf_sd_lookup(cache_key);
        final SubLObject present = thread.secondMultipleValue();
        thread.resetMultipleValues();
        return present;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/rkf-salient-descriptor.lisp", position = 78394L)
    public static SubLObject rkf_sd_ignore_lookup(final SubLObject cache_key) {
        return Hashtables.gethash(cache_key, rkf_salient_descriptor.$rkf_salient_descriptor_ignore_cache$.getGlobalValue(), (SubLObject)rkf_salient_descriptor.NIL);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/rkf-salient-descriptor.lisp", position = 78515L)
    public static SubLObject rkf_sd_ignore_update(final SubLObject cache_key, final SubLObject formulas) {
        SubLObject release = (SubLObject)rkf_salient_descriptor.NIL;
        try {
            release = Locks.seize_lock(rkf_salient_descriptor.$rkf_salient_descriptor_ignore_cache_lock$.getGlobalValue());
            Hashtables.sethash(cache_key, rkf_salient_descriptor.$rkf_salient_descriptor_ignore_cache$.getGlobalValue(), formulas);
        }
        finally {
            if (rkf_salient_descriptor.NIL != release) {
                Locks.release_lock(rkf_salient_descriptor.$rkf_salient_descriptor_ignore_cache_lock$.getGlobalValue());
            }
        }
        return (SubLObject)rkf_salient_descriptor.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/rkf-salient-descriptor.lisp", position = 79256L)
    public static SubLObject rkf_salient_descriptor_get_subprompts(final SubLObject formula, final SubLObject v_term, final SubLObject domain_mt, final SubLObject confirmedP, SubLObject salient_property_sentence) {
        if (salient_property_sentence == rkf_salient_descriptor.UNPROVIDED) {
            salient_property_sentence = (SubLObject)rkf_salient_descriptor.NIL;
        }
        return (SubLObject)((rkf_salient_descriptor.NIL != confirmedP) ? rkf_salient_descriptor_followups(formula, v_term, domain_mt, salient_property_sentence) : ConsesLow.list(rkf_salient_descriptor_subprompt_from_formula(formula, v_term, domain_mt, salient_property_sentence)));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/rkf-salient-descriptor.lisp", position = 79631L)
    public static SubLObject rkf_salient_descriptor_single_entry_varP(final SubLObject var, final SubLObject formula, final SubLObject mt) {
        SubLObject single_entryP = rkf_sd_single_entry_var_top_levelP(var, formula, mt);
        final SubLObject args = cycl_utilities.formula_args(formula, (SubLObject)rkf_salient_descriptor.$kw185$IGNORE);
        SubLObject rest;
        SubLObject subformula;
        for (rest = (SubLObject)rkf_salient_descriptor.NIL, rest = args; rkf_salient_descriptor.NIL == single_entryP && rkf_salient_descriptor.NIL != rest; single_entryP = (SubLObject)SubLObjectFactory.makeBoolean(rkf_salient_descriptor.NIL != el_utilities.el_formula_p(subformula) && rkf_salient_descriptor.NIL != rkf_salient_descriptor_single_entry_varP(var, subformula, mt)), rest = rest.rest()) {
            subformula = rest.first();
        }
        return single_entryP;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/rkf-salient-descriptor.lisp", position = 80068L)
    public static SubLObject rkf_sd_single_entry_var_top_levelP(final SubLObject var, final SubLObject formula, final SubLObject mt) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject var_position = Sequences.position(var, formula, (SubLObject)rkf_salient_descriptor.UNPROVIDED, (SubLObject)rkf_salient_descriptor.UNPROVIDED, (SubLObject)rkf_salient_descriptor.UNPROVIDED, (SubLObject)rkf_salient_descriptor.UNPROVIDED);
        final SubLObject pred = cycl_utilities.formula_arg0(formula);
        SubLObject single_entryP = (SubLObject)rkf_salient_descriptor.NIL;
        if (var_position.isInteger()) {
            final SubLObject mt_var = mt_relevance_macros.with_inference_mt_relevance_validate(mt);
            final SubLObject _prev_bind_0 = mt_relevance_macros.$mt$.currentBinding(thread);
            final SubLObject _prev_bind_2 = mt_relevance_macros.$relevant_mt_function$.currentBinding(thread);
            final SubLObject _prev_bind_3 = mt_relevance_macros.$relevant_mts$.currentBinding(thread);
            try {
                mt_relevance_macros.$mt$.bind(mt_relevance_macros.update_inference_mt_relevance_mt(mt_var), thread);
                mt_relevance_macros.$relevant_mt_function$.bind(mt_relevance_macros.update_inference_mt_relevance_function(mt_var), thread);
                mt_relevance_macros.$relevant_mts$.bind(mt_relevance_macros.update_inference_mt_relevance_mt_list(mt_var), thread);
                single_entryP = subl_promotions.memberP(var_position, kb_mapping_utilities.pred_values(pred, rkf_salient_descriptor.$const205$singleEntryFormatInArgs, (SubLObject)rkf_salient_descriptor.UNPROVIDED, (SubLObject)rkf_salient_descriptor.UNPROVIDED, (SubLObject)rkf_salient_descriptor.UNPROVIDED), (SubLObject)rkf_salient_descriptor.UNPROVIDED, (SubLObject)rkf_salient_descriptor.UNPROVIDED);
                if (rkf_salient_descriptor.NIL == single_entryP) {
                    SubLObject csome_list_var = kb_mapping_utilities.pred_value_tuples(pred, rkf_salient_descriptor.$const208$argFormat, (SubLObject)rkf_salient_descriptor.ONE_INTEGER, (SubLObject)rkf_salient_descriptor.$list209, (SubLObject)rkf_salient_descriptor.UNPROVIDED);
                    SubLObject pair = (SubLObject)rkf_salient_descriptor.NIL;
                    pair = csome_list_var.first();
                    while (rkf_salient_descriptor.NIL == single_entryP && rkf_salient_descriptor.NIL != csome_list_var) {
                        SubLObject current;
                        final SubLObject datum = current = pair;
                        SubLObject argnum = (SubLObject)rkf_salient_descriptor.NIL;
                        SubLObject format = (SubLObject)rkf_salient_descriptor.NIL;
                        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)rkf_salient_descriptor.$list206);
                        argnum = current.first();
                        current = current.rest();
                        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)rkf_salient_descriptor.$list206);
                        format = current.first();
                        current = current.rest();
                        if (rkf_salient_descriptor.NIL == current) {
                            single_entryP = (SubLObject)SubLObjectFactory.makeBoolean(argnum.eql(var_position) && rkf_salient_descriptor.NIL != conses_high.member(format, (SubLObject)rkf_salient_descriptor.$list207, (SubLObject)rkf_salient_descriptor.UNPROVIDED, (SubLObject)rkf_salient_descriptor.UNPROVIDED));
                        }
                        else {
                            cdestructuring_bind.cdestructuring_bind_error(datum, (SubLObject)rkf_salient_descriptor.$list206);
                        }
                        csome_list_var = csome_list_var.rest();
                        pair = csome_list_var.first();
                    }
                }
            }
            finally {
                mt_relevance_macros.$relevant_mts$.rebind(_prev_bind_3, thread);
                mt_relevance_macros.$relevant_mt_function$.rebind(_prev_bind_2, thread);
                mt_relevance_macros.$mt$.rebind(_prev_bind_0, thread);
            }
        }
        return single_entryP;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/rkf-salient-descriptor.lisp", position = 80899L)
    public static SubLObject rkf_salient_property_sentence_from_justification(final SubLObject v_term, final SubLObject justification) {
        if (rkf_salient_descriptor.NIL != rkf_salient_descriptor_rule_spec_p(justification)) {
            return rkf_justification_sentence_from_rule_spec(v_term, justification);
        }
        if (rkf_salient_descriptor.NIL != arguments.supports_p(justification)) {
            SubLObject conjuncts = (SubLObject)rkf_salient_descriptor.NIL;
            SubLObject cdolist_list_var = justification;
            SubLObject support = (SubLObject)rkf_salient_descriptor.NIL;
            support = cdolist_list_var.first();
            while (rkf_salient_descriptor.NIL != cdolist_list_var) {
                final SubLObject support_sentence = arguments.support_sentence(support);
                if (rkf_salient_descriptor.NIL != cycl_utilities.expression_find(v_term, support_sentence, (SubLObject)rkf_salient_descriptor.NIL, Symbols.symbol_function((SubLObject)rkf_salient_descriptor.EQUAL), (SubLObject)rkf_salient_descriptor.UNPROVIDED)) {
                    conjuncts = (SubLObject)ConsesLow.cons(support_sentence, conjuncts);
                }
                cdolist_list_var = cdolist_list_var.rest();
                support = cdolist_list_var.first();
            }
            return rkf_sd_conjoin(conjuncts, (SubLObject)rkf_salient_descriptor.T, (SubLObject)rkf_salient_descriptor.NIL);
        }
        return (SubLObject)rkf_salient_descriptor.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/rkf-salient-descriptor.lisp", position = 81450L)
    public static SubLObject rkf_sd_conjoin(final SubLObject conjuncts, SubLObject simplifyP, SubLObject uniquifyP) {
        if (simplifyP == rkf_salient_descriptor.UNPROVIDED) {
            simplifyP = (SubLObject)rkf_salient_descriptor.NIL;
        }
        if (uniquifyP == rkf_salient_descriptor.UNPROVIDED) {
            uniquifyP = (SubLObject)rkf_salient_descriptor.NIL;
        }
        final SubLObject pcase_var = Sequences.length(conjuncts);
        if (pcase_var.eql((SubLObject)rkf_salient_descriptor.ZERO_INTEGER)) {
            return (SubLObject)rkf_salient_descriptor.NIL;
        }
        if (pcase_var.eql((SubLObject)rkf_salient_descriptor.ONE_INTEGER)) {
            return conjuncts.first();
        }
        final SubLObject uniquified_conjuncts = (rkf_salient_descriptor.NIL != uniquifyP) ? rkf_sd_uniquify_conjuncts(conjuncts) : conjuncts;
        return simplifier.conjoin(uniquified_conjuncts, simplifyP);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/rkf-salient-descriptor.lisp", position = 81952L)
    public static SubLObject rkf_sd_uniquify_conjuncts(final SubLObject conjuncts) {
        SubLObject new_conjuncts = (SubLObject)rkf_salient_descriptor.NIL;
        SubLObject cdolist_list_var = conjuncts;
        SubLObject conjunct = (SubLObject)rkf_salient_descriptor.NIL;
        conjunct = cdolist_list_var.first();
        while (rkf_salient_descriptor.NIL != cdolist_list_var) {
            if (rkf_salient_descriptor.NIL != new_conjuncts) {
                SubLObject cdolist_list_var_$148 = cycl_utilities.expression_gather(conjunct, (SubLObject)rkf_salient_descriptor.$sym148$EL_VAR_, (SubLObject)rkf_salient_descriptor.UNPROVIDED, (SubLObject)rkf_salient_descriptor.UNPROVIDED, (SubLObject)rkf_salient_descriptor.UNPROVIDED, (SubLObject)rkf_salient_descriptor.UNPROVIDED);
                SubLObject el_var = (SubLObject)rkf_salient_descriptor.NIL;
                el_var = cdolist_list_var_$148.first();
                while (rkf_salient_descriptor.NIL != cdolist_list_var_$148) {
                    if (rkf_salient_descriptor.NIL != subl_promotions.memberP(el_var, new_conjuncts, (SubLObject)rkf_salient_descriptor.$sym210$EXPRESSION_FIND, (SubLObject)rkf_salient_descriptor.UNPROVIDED)) {
                        final SubLObject replacement_var = czer_utilities.unique_el_var_wrt_expression(new_conjuncts, el_var);
                        conjunct = cycl_utilities.formula_subst(replacement_var, el_var, conjunct, (SubLObject)rkf_salient_descriptor.UNPROVIDED, (SubLObject)rkf_salient_descriptor.UNPROVIDED);
                    }
                    cdolist_list_var_$148 = cdolist_list_var_$148.rest();
                    el_var = cdolist_list_var_$148.first();
                }
            }
            new_conjuncts = (SubLObject)ConsesLow.cons(conjunct, new_conjuncts);
            cdolist_list_var = cdolist_list_var.rest();
            conjunct = cdolist_list_var.first();
        }
        return Sequences.nreverse(new_conjuncts);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/rkf-salient-descriptor.lisp", position = 82569L)
    public static SubLObject rkf_salient_descriptor_subprompts_p(final SubLObject v_object) {
        return (SubLObject)SubLObjectFactory.makeBoolean(rkf_salient_descriptor.NIL != list_utilities.proper_list_p(v_object) && rkf_salient_descriptor.NIL != list_utilities.every_in_list((SubLObject)rkf_salient_descriptor.$sym211$RKF_SALIENT_DESCRIPTOR_SUBPROMPT_P, v_object, (SubLObject)rkf_salient_descriptor.UNPROVIDED));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/rkf-salient-descriptor.lisp", position = 82738L)
    public static SubLObject rkf_salient_descriptor_subprompt_p(final SubLObject v_object) {
        return (SubLObject)SubLObjectFactory.makeBoolean(v_object.isList() && v_object.first().isKeyword() && rkf_salient_descriptor.NIL != conses_high.member(v_object.first(), (SubLObject)rkf_salient_descriptor.$list212, (SubLObject)rkf_salient_descriptor.UNPROVIDED, (SubLObject)rkf_salient_descriptor.UNPROVIDED));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/rkf-salient-descriptor.lisp", position = 82928L)
    public static SubLObject rkf_salient_descriptor_subprompt_assert_sentence(final SubLObject subprompt, SubLObject v_term, SubLObject var_to_specify) {
        if (v_term == rkf_salient_descriptor.UNPROVIDED) {
            v_term = (SubLObject)rkf_salient_descriptor.NIL;
        }
        if (var_to_specify == rkf_salient_descriptor.UNPROVIDED) {
            var_to_specify = (SubLObject)rkf_salient_descriptor.NIL;
        }
        final SubLObject pcase_var = rkf_salient_descriptor_subprompt_type(subprompt);
        if (pcase_var.eql((SubLObject)rkf_salient_descriptor.$kw213$CONFIRM)) {
            SubLObject template = conses_high.second(subprompt);
            final SubLObject constraints = rkf_salient_descriptor_subprompt_constraint_sentence(subprompt);
            if (rkf_salient_descriptor.NIL != var_to_specify) {
                if (rkf_salient_descriptor.NIL != formula_pattern_match.formula_matches_pattern(template, (SubLObject)ConsesLow.listS(rkf_salient_descriptor.$const76$thereExists, var_to_specify, (SubLObject)rkf_salient_descriptor.$list214))) {
                    template = cycl_utilities.formula_arg2(template, (SubLObject)rkf_salient_descriptor.UNPROVIDED);
                }
                template = rkf_sd_remove_constraints(template, constraints);
                return cycl_utilities.expression_subst(v_term, var_to_specify, template, (SubLObject)rkf_salient_descriptor.UNPROVIDED, (SubLObject)rkf_salient_descriptor.UNPROVIDED);
            }
            return template;
        }
        else {
            if (!pcase_var.eql((SubLObject)rkf_salient_descriptor.$kw215$CHOICE) && !pcase_var.eql((SubLObject)rkf_salient_descriptor.$kw216$SPECIFY)) {
                return (SubLObject)rkf_salient_descriptor.NIL;
            }
            final SubLObject template = conses_high.fourth(subprompt);
            if (rkf_salient_descriptor.NIL != var_to_specify) {
                return cycl_utilities.expression_subst(v_term, var_to_specify, template, (SubLObject)rkf_salient_descriptor.UNPROVIDED, (SubLObject)rkf_salient_descriptor.UNPROVIDED);
            }
            return template;
        }
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/rkf-salient-descriptor.lisp", position = 83727L)
    public static SubLObject rkf_salient_descriptor_subprompt_var(final SubLObject subprompt) {
        final SubLObject pcase_var = rkf_salient_descriptor_subprompt_type(subprompt);
        if (pcase_var.eql((SubLObject)rkf_salient_descriptor.$kw213$CONFIRM)) {
            return conses_high.third(subprompt);
        }
        if (pcase_var.eql((SubLObject)rkf_salient_descriptor.$kw216$SPECIFY)) {
            return conses_high.second(subprompt);
        }
        return (SubLObject)rkf_salient_descriptor.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/rkf-salient-descriptor.lisp", position = 83932L)
    public static SubLObject rkf_salient_descriptor_subprompt_known_check_sentence(final SubLObject subprompt) {
        final SubLObject pcase_var = rkf_salient_descriptor_subprompt_type(subprompt);
        if (pcase_var.eql((SubLObject)rkf_salient_descriptor.$kw213$CONFIRM) || pcase_var.eql((SubLObject)rkf_salient_descriptor.$kw215$CHOICE)) {
            return rkf_salient_descriptor_subprompt_assert_sentence(subprompt, (SubLObject)rkf_salient_descriptor.UNPROVIDED, (SubLObject)rkf_salient_descriptor.UNPROVIDED);
        }
        if (pcase_var.eql((SubLObject)rkf_salient_descriptor.$kw216$SPECIFY)) {
            final SubLObject var = conses_high.second(subprompt);
            final SubLObject var_constraint = (SubLObject)ConsesLow.list(rkf_salient_descriptor.$const125$unknownSentence, (SubLObject)ConsesLow.listS(rkf_salient_descriptor.$const24$isa, var, (SubLObject)rkf_salient_descriptor.$list217));
            return rkf_sd_conjoin((SubLObject)ConsesLow.list(conses_high.fourth(subprompt), var_constraint), (SubLObject)rkf_salient_descriptor.NIL, (SubLObject)rkf_salient_descriptor.NIL);
        }
        return (SubLObject)rkf_salient_descriptor.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/rkf-salient-descriptor.lisp", position = 84370L)
    public static SubLObject rkf_salient_descriptor_subprompt_constraint_sentence(final SubLObject subprompt) {
        final SubLObject pcase_var = rkf_salient_descriptor_subprompt_type(subprompt);
        if (pcase_var.eql((SubLObject)rkf_salient_descriptor.$kw213$CONFIRM)) {
            return conses_high.fifth(subprompt);
        }
        if (pcase_var.eql((SubLObject)rkf_salient_descriptor.$kw215$CHOICE) || pcase_var.eql((SubLObject)rkf_salient_descriptor.$kw216$SPECIFY)) {
            return conses_high.third(subprompt);
        }
        return (SubLObject)rkf_salient_descriptor.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/rkf-salient-descriptor.lisp", position = 84600L)
    public static SubLObject rkf_salient_descriptor_subprompt_examples(final SubLObject subprompt) {
        final SubLObject pcase_var = rkf_salient_descriptor_subprompt_type(subprompt);
        if (pcase_var.eql((SubLObject)rkf_salient_descriptor.$kw213$CONFIRM)) {
            return conses_high.fourth(subprompt);
        }
        if (pcase_var.eql((SubLObject)rkf_salient_descriptor.$kw216$SPECIFY)) {
            return conses_high.fifth(subprompt);
        }
        return (SubLObject)rkf_salient_descriptor.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/rkf-salient-descriptor.lisp", position = 84810L)
    public static SubLObject rkf_salient_descriptor_subprompt_set_examples(final SubLObject subprompt, final SubLObject examples) {
        final SubLObject pcase_var = rkf_salient_descriptor_subprompt_type(subprompt);
        if (pcase_var.eql((SubLObject)rkf_salient_descriptor.$kw213$CONFIRM)) {
            return ConsesLow.set_nth((SubLObject)rkf_salient_descriptor.THREE_INTEGER, subprompt, examples);
        }
        if (pcase_var.eql((SubLObject)rkf_salient_descriptor.$kw216$SPECIFY)) {
            return ConsesLow.set_nth((SubLObject)rkf_salient_descriptor.FOUR_INTEGER, subprompt, examples);
        }
        return (SubLObject)rkf_salient_descriptor.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/rkf-salient-descriptor.lisp", position = 85058L)
    public static SubLObject rkf_salient_descriptor_subprompt_type(final SubLObject subprompt) {
        return subprompt.first();
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/rkf-salient-descriptor.lisp", position = 85151L)
    public static SubLObject rkf_salient_descriptor_subprompt_from_formula(final SubLObject formula, final SubLObject v_term, SubLObject mt, SubLObject salient_property_sentence) {
        if (mt == rkf_salient_descriptor.UNPROVIDED) {
            mt = control_vars.$rkf_mt$.getDynamicValue();
        }
        if (salient_property_sentence == rkf_salient_descriptor.UNPROVIDED) {
            salient_property_sentence = (SubLObject)rkf_salient_descriptor.NIL;
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        thread.resetMultipleValues();
        final SubLObject examples = rkf_sd_examples(formula, v_term, mt, salient_property_sentence, (SubLObject)rkf_salient_descriptor.UNPROVIDED, (SubLObject)rkf_salient_descriptor.UNPROVIDED, (SubLObject)rkf_salient_descriptor.UNPROVIDED, (SubLObject)rkf_salient_descriptor.UNPROVIDED);
        final SubLObject var = thread.secondMultipleValue();
        final SubLObject constraint_sentence = thread.thirdMultipleValue();
        final SubLObject assert_sentence = thread.fourthMultipleValue();
        thread.resetMultipleValues();
        return (SubLObject)ConsesLow.list((SubLObject)rkf_salient_descriptor.$kw213$CONFIRM, formula, var, examples, constraint_sentence);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/rkf-salient-descriptor.lisp", position = 85530L)
    public static SubLObject rkf_salient_descriptor_followups(final SubLObject formula, final SubLObject v_term, SubLObject mt, SubLObject salient_property_sentence) {
        if (mt == rkf_salient_descriptor.UNPROVIDED) {
            mt = control_vars.$rkf_mt$.getDynamicValue();
        }
        if (salient_property_sentence == rkf_salient_descriptor.UNPROVIDED) {
            salient_property_sentence = (SubLObject)rkf_salient_descriptor.NIL;
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        thread.resetMultipleValues();
        final SubLObject body = rkf_sd_possibly_existentially_unbind(formula);
        final SubLObject v_variables = thread.secondMultipleValue();
        thread.resetMultipleValues();
        if (rkf_salient_descriptor.NIL != formula_pattern_match.formula_matches_pattern(body, (SubLObject)rkf_salient_descriptor.$list218)) {
            final SubLObject isa_sentence = cycl_utilities.formula_arg1(body, (SubLObject)rkf_salient_descriptor.UNPROVIDED);
            final SubLObject non_instance = cycl_utilities.atomic_sentence_arg1(isa_sentence, (SubLObject)rkf_salient_descriptor.UNPROVIDED);
            final SubLObject collection = cycl_utilities.atomic_sentence_arg2(isa_sentence, (SubLObject)rkf_salient_descriptor.UNPROVIDED);
            final SubLObject isas = isa.isa(non_instance, mt, rkf_salient_descriptor.$const219$True_JustificationTruth);
            SubLObject disjoint_sentences = (SubLObject)rkf_salient_descriptor.NIL;
            SubLObject cdolist_list_var = isas;
            SubLObject v_isa = (SubLObject)rkf_salient_descriptor.NIL;
            v_isa = cdolist_list_var.first();
            while (rkf_salient_descriptor.NIL != cdolist_list_var) {
                final SubLObject item_var = el_utilities.make_binary_formula(rkf_salient_descriptor.$const220$disjointWith, v_isa, collection);
                if (rkf_salient_descriptor.NIL == conses_high.member(item_var, disjoint_sentences, Symbols.symbol_function((SubLObject)rkf_salient_descriptor.EQL), Symbols.symbol_function((SubLObject)rkf_salient_descriptor.IDENTITY))) {
                    disjoint_sentences = (SubLObject)ConsesLow.cons(item_var, disjoint_sentences);
                }
                cdolist_list_var = cdolist_list_var.rest();
                v_isa = cdolist_list_var.first();
            }
            return (SubLObject)ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)rkf_salient_descriptor.$kw221$STRENGTHEN, disjoint_sentences));
        }
        SubLObject followups_for_variables = (SubLObject)rkf_salient_descriptor.NIL;
        SubLObject cdolist_list_var2 = v_variables;
        SubLObject variable = (SubLObject)rkf_salient_descriptor.NIL;
        variable = cdolist_list_var2.first();
        while (rkf_salient_descriptor.NIL != cdolist_list_var2) {
            followups_for_variables = (SubLObject)ConsesLow.cons(rkf_salient_descriptor_followup_for_variable(body, v_term, variable, mt, salient_property_sentence), followups_for_variables);
            cdolist_list_var2 = cdolist_list_var2.rest();
            variable = cdolist_list_var2.first();
        }
        return Sequences.nreverse(followups_for_variables);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/rkf-salient-descriptor.lisp", position = 86545L)
    public static SubLObject rkf_salient_descriptor_followup_for_variable(final SubLObject formula, final SubLObject v_term, final SubLObject variable, final SubLObject mt, final SubLObject salient_property_sentence) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject subform = rkf_salient_descriptor_assert_formula(formula);
        final SubLObject complete_coll_bindings = rkf_salient_descriptor_complete_coll_bindings(variable, subform, mt);
        final SubLObject small_set_bindings = (SubLObject)((rkf_salient_descriptor.NIL != complete_coll_bindings) ? rkf_salient_descriptor.NIL : rkf_salient_descriptor_small_set_bindings(variable, subform));
        if (rkf_salient_descriptor.NIL != complete_coll_bindings) {
            final SubLObject col = bindings.subst_bindings(complete_coll_bindings, variables.find_variable_by_id((SubLObject)rkf_salient_descriptor.ZERO_INTEGER));
            final SubLObject assert_formula = bindings.subst_bindings(complete_coll_bindings, variables.find_variable_by_id((SubLObject)rkf_salient_descriptor.ONE_INTEGER));
            final SubLObject all_fort_instances = rkf_ontology_utilities.rkf_all_fort_instances(col, mt);
            return (SubLObject)ConsesLow.list((SubLObject)rkf_salient_descriptor.$kw215$CHOICE, variable, all_fort_instances, assert_formula);
        }
        if (rkf_salient_descriptor.NIL != small_set_bindings) {
            final SubLObject elements = bindings.subst_bindings(small_set_bindings, variables.find_variable_by_id((SubLObject)rkf_salient_descriptor.ONE_INTEGER));
            final SubLObject assert_formula = bindings.subst_bindings(small_set_bindings, variables.find_variable_by_id((SubLObject)rkf_salient_descriptor.ZERO_INTEGER));
            return (SubLObject)ConsesLow.list((SubLObject)rkf_salient_descriptor.$kw215$CHOICE, variable, elements, assert_formula);
        }
        thread.resetMultipleValues();
        final SubLObject examples = rkf_sd_examples(formula, v_term, mt, salient_property_sentence, (SubLObject)rkf_salient_descriptor.NIL, (SubLObject)rkf_salient_descriptor.$kw59$ALL, variable, (SubLObject)rkf_salient_descriptor.UNPROVIDED);
        final SubLObject examples_var = thread.secondMultipleValue();
        final SubLObject variable_constraints = thread.thirdMultipleValue();
        final SubLObject assert_sentence = thread.fourthMultipleValue();
        thread.resetMultipleValues();
        return (SubLObject)ConsesLow.list((SubLObject)rkf_salient_descriptor.$kw216$SPECIFY, variable, variable_constraints, assert_sentence, examples);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/rkf-salient-descriptor.lisp", position = 88044L)
    public static SubLObject rkf_sd_examples_internal(final SubLObject formula, final SubLObject v_term, final SubLObject mt, final SubLObject salient_property_sentence, SubLObject used_examples, SubLObject include_types, SubLObject variable, SubLObject num_of_examples) {
        if (used_examples == rkf_salient_descriptor.UNPROVIDED) {
            used_examples = (SubLObject)rkf_salient_descriptor.NIL;
        }
        if (include_types == rkf_salient_descriptor.UNPROVIDED) {
            include_types = (SubLObject)rkf_salient_descriptor.$kw59$ALL;
        }
        if (variable == rkf_salient_descriptor.UNPROVIDED) {
            variable = (SubLObject)rkf_salient_descriptor.NIL;
        }
        if (num_of_examples == rkf_salient_descriptor.UNPROVIDED) {
            num_of_examples = (SubLObject)((rkf_salient_descriptor.NIL != rkf_macros.rkf_generate_examplesP()) ? rkf_salient_descriptor.$rkf_examples_to_show$.getDynamicValue() : rkf_salient_descriptor.ZERO_INTEGER);
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        assert rkf_salient_descriptor.NIL != el_utilities.el_formula_p(formula) : formula;
        thread.resetMultipleValues();
        final SubLObject body = rkf_sd_possibly_existentially_unbind(formula);
        final SubLObject v_variables = thread.secondMultipleValue();
        thread.resetMultipleValues();
        if (rkf_salient_descriptor.NIL != variable) {
            if (rkf_salient_descriptor.NIL == subl_promotions.memberP(variable, v_variables, Symbols.symbol_function((SubLObject)rkf_salient_descriptor.EQ), (SubLObject)rkf_salient_descriptor.UNPROVIDED)) {
                return Values.values((SubLObject)rkf_salient_descriptor.$kw224$NOT_TRIED, variable, (SubLObject)rkf_salient_descriptor.NIL, body);
            }
        }
        else {
            if (rkf_salient_descriptor.NIL == list_utilities.singletonP(v_variables)) {
                return Values.values((SubLObject)rkf_salient_descriptor.$kw224$NOT_TRIED, v_variables, (SubLObject)rkf_salient_descriptor.NIL, body);
            }
            variable = v_variables.first();
        }
        final SubLObject subform = rkf_salient_descriptor_assert_formula(body);
        final SubLObject variable_constraints = rkf_tools.rkf_type_constraints(variable, subform, mt);
        final SubLObject assert_sentence = subform;
        final SubLObject salient_property = properties.sentence_to_property(salient_property_sentence, v_term);
        final SubLObject examples = (SubLObject)(num_of_examples.numG((SubLObject)rkf_salient_descriptor.ONE_INTEGER) ? rkf_example_instances(variable, assert_sentence, v_term, variable_constraints, salient_property, mt, num_of_examples, used_examples, include_types) : rkf_salient_descriptor.$kw224$NOT_TRIED);
        return Values.values(examples, variable, variable_constraints, assert_sentence);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/rkf-salient-descriptor.lisp", position = 88044L)
    public static SubLObject rkf_sd_examples(final SubLObject formula, final SubLObject v_term, final SubLObject mt, final SubLObject salient_property_sentence, SubLObject used_examples, SubLObject include_types, SubLObject variable, SubLObject num_of_examples) {
        if (used_examples == rkf_salient_descriptor.UNPROVIDED) {
            used_examples = (SubLObject)rkf_salient_descriptor.NIL;
        }
        if (include_types == rkf_salient_descriptor.UNPROVIDED) {
            include_types = (SubLObject)rkf_salient_descriptor.$kw59$ALL;
        }
        if (variable == rkf_salient_descriptor.UNPROVIDED) {
            variable = (SubLObject)rkf_salient_descriptor.NIL;
        }
        if (num_of_examples == rkf_salient_descriptor.UNPROVIDED) {
            num_of_examples = (SubLObject)((rkf_salient_descriptor.NIL != rkf_macros.rkf_generate_examplesP()) ? rkf_salient_descriptor.$rkf_examples_to_show$.getDynamicValue() : rkf_salient_descriptor.ZERO_INTEGER);
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject v_memoization_state = memoization_state.$memoization_state$.getDynamicValue(thread);
        SubLObject caching_state = (SubLObject)rkf_salient_descriptor.NIL;
        if (rkf_salient_descriptor.NIL == v_memoization_state) {
            return rkf_sd_examples_internal(formula, v_term, mt, salient_property_sentence, used_examples, include_types, variable, num_of_examples);
        }
        caching_state = memoization_state.memoization_state_lookup(v_memoization_state, (SubLObject)rkf_salient_descriptor.$sym222$RKF_SD_EXAMPLES, (SubLObject)rkf_salient_descriptor.UNPROVIDED);
        if (rkf_salient_descriptor.NIL == caching_state) {
            caching_state = memoization_state.create_caching_state(memoization_state.memoization_state_lock(v_memoization_state), (SubLObject)rkf_salient_descriptor.$sym222$RKF_SD_EXAMPLES, (SubLObject)rkf_salient_descriptor.EIGHT_INTEGER, (SubLObject)rkf_salient_descriptor.NIL, (SubLObject)rkf_salient_descriptor.EQUAL, (SubLObject)rkf_salient_descriptor.UNPROVIDED);
            memoization_state.memoization_state_put(v_memoization_state, (SubLObject)rkf_salient_descriptor.$sym222$RKF_SD_EXAMPLES, caching_state);
        }
        final SubLObject sxhash = memoization_state.sxhash_calc_8(formula, v_term, mt, salient_property_sentence, used_examples, include_types, variable, num_of_examples);
        final SubLObject collisions = memoization_state.caching_state_lookup(caching_state, sxhash, (SubLObject)rkf_salient_descriptor.UNPROVIDED);
        if (!collisions.eql(memoization_state.$memoized_item_not_found$.getGlobalValue())) {
            SubLObject cdolist_list_var = collisions;
            SubLObject collision = (SubLObject)rkf_salient_descriptor.NIL;
            collision = cdolist_list_var.first();
            while (rkf_salient_descriptor.NIL != cdolist_list_var) {
                SubLObject cached_args = collision.first();
                final SubLObject results2 = conses_high.second(collision);
                if (formula.equal(cached_args.first())) {
                    cached_args = cached_args.rest();
                    if (v_term.equal(cached_args.first())) {
                        cached_args = cached_args.rest();
                        if (mt.equal(cached_args.first())) {
                            cached_args = cached_args.rest();
                            if (salient_property_sentence.equal(cached_args.first())) {
                                cached_args = cached_args.rest();
                                if (used_examples.equal(cached_args.first())) {
                                    cached_args = cached_args.rest();
                                    if (include_types.equal(cached_args.first())) {
                                        cached_args = cached_args.rest();
                                        if (variable.equal(cached_args.first())) {
                                            cached_args = cached_args.rest();
                                            if (rkf_salient_descriptor.NIL != cached_args && rkf_salient_descriptor.NIL == cached_args.rest() && num_of_examples.equal(cached_args.first())) {
                                                return memoization_state.caching_results(results2);
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
        final SubLObject results3 = Values.arg2(thread.resetMultipleValues(), (SubLObject)Values.multiple_value_list(rkf_sd_examples_internal(formula, v_term, mt, salient_property_sentence, used_examples, include_types, variable, num_of_examples)));
        memoization_state.caching_state_enter_multi_key_n(caching_state, sxhash, collisions, results3, (SubLObject)ConsesLow.list(formula, v_term, mt, salient_property_sentence, used_examples, include_types, variable, num_of_examples));
        return memoization_state.caching_results(results3);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/rkf-salient-descriptor.lisp", position = 89750L)
    public static SubLObject rkf_sd_precedent_query_sentence(final SubLObject new_var, final SubLObject v_term, final SubLObject knowledge_gap_sentence, SubLObject salient_property) {
        if (salient_property == rkf_salient_descriptor.UNPROVIDED) {
            salient_property = (SubLObject)rkf_salient_descriptor.NIL;
        }
        SubLObject combined = (rkf_salient_descriptor.NIL != salient_property) ? rkf_sd_add_salient_property(knowledge_gap_sentence, salient_property, v_term) : knowledge_gap_sentence;
        if (rkf_salient_descriptor.NIL != formula_pattern_match.formula_matches_pattern(knowledge_gap_sentence, (SubLObject)ConsesLow.listS((SubLObject)rkf_salient_descriptor.$kw225$FORT, v_term, (SubLObject)rkf_salient_descriptor.$list226)) && rkf_salient_descriptor.NIL != formula_pattern_match.formula_matches_pattern(salient_property, (SubLObject)rkf_salient_descriptor.$list227)) {
            final SubLObject rai_knowledge_gap_sentence = el_utilities.make_el_formula(rkf_salient_descriptor.$const228$relationAllInstance, cycl_utilities.formula_terms(knowledge_gap_sentence, (SubLObject)rkf_salient_descriptor.UNPROVIDED), (SubLObject)rkf_salient_descriptor.UNPROVIDED);
            final SubLObject genls_property = properties.sentence_to_property(el_utilities.make_el_formula(rkf_salient_descriptor.$const25$genls, cycl_utilities.formula_args(properties.property_to_sentence(salient_property, v_term), (SubLObject)rkf_salient_descriptor.UNPROVIDED), (SubLObject)rkf_salient_descriptor.UNPROVIDED), v_term);
            final SubLObject rai_combined = rkf_sd_add_salient_property(rai_knowledge_gap_sentence, genls_property, v_term);
            combined = simplifier.disjoin((SubLObject)ConsesLow.list(combined, rai_combined), (SubLObject)rkf_salient_descriptor.UNPROVIDED);
        }
        return cycl_utilities.expression_subst(new_var, v_term, combined, (SubLObject)rkf_salient_descriptor.UNPROVIDED, (SubLObject)rkf_salient_descriptor.UNPROVIDED);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/rkf-salient-descriptor.lisp", position = 90798L)
    public static SubLObject rkf_sd_add_salient_property(final SubLObject knowledge_gap_sentence, final SubLObject salient_property, final SubLObject v_term) {
        SubLObject salient_property_sentence = properties.property_to_sentence(salient_property, v_term);
        if (rkf_salient_descriptor.ZERO_INTEGER.eql(rkf_example_instances_backchain_level())) {
            salient_property_sentence = rkf_sd_add_known_sentence(salient_property_sentence);
        }
        return rkf_sd_conjoin((SubLObject)ConsesLow.list(knowledge_gap_sentence, salient_property_sentence), (SubLObject)rkf_salient_descriptor.T, (SubLObject)rkf_salient_descriptor.NIL);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/rkf-salient-descriptor.lisp", position = 91221L)
    public static SubLObject rkf_sd_add_known_sentence(final SubLObject sentence) {
        if (rkf_salient_descriptor.NIL != cycl_grammar.cycl_atomic_sentence_p(sentence)) {
            return el_utilities.make_unary_formula(rkf_salient_descriptor.$const229$knownSentence, sentence);
        }
        if (rkf_salient_descriptor.NIL != el_utilities.el_conjunction_p(sentence)) {
            return simplifier.conjoin(Mapping.mapcar((SubLObject)rkf_salient_descriptor.$sym230$RKF_SD_ADD_KNOWN_SENTENCE, cycl_utilities.formula_args(sentence, (SubLObject)rkf_salient_descriptor.UNPROVIDED)), (SubLObject)rkf_salient_descriptor.UNPROVIDED);
        }
        return sentence;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/rkf-salient-descriptor.lisp", position = 91585L)
    public static SubLObject rkf_sd_remove_constraints(final SubLObject subform, final SubLObject variable_constraints) {
        if (rkf_salient_descriptor.NIL != el_utilities.el_conjunction_p(subform)) {
            SubLObject assert_conjuncts = (SubLObject)rkf_salient_descriptor.NIL;
            SubLObject cdolist_list_var = cycl_utilities.formula_args(subform, (SubLObject)rkf_salient_descriptor.UNPROVIDED);
            SubLObject conjunct = (SubLObject)rkf_salient_descriptor.NIL;
            conjunct = cdolist_list_var.first();
            while (rkf_salient_descriptor.NIL != cdolist_list_var) {
                if (rkf_salient_descriptor.NIL == cycl_utilities.expression_find(conjunct, variable_constraints, (SubLObject)rkf_salient_descriptor.NIL, Symbols.symbol_function((SubLObject)rkf_salient_descriptor.EQUAL), (SubLObject)rkf_salient_descriptor.UNPROVIDED)) {
                    assert_conjuncts = (SubLObject)ConsesLow.cons(conjunct, assert_conjuncts);
                }
                cdolist_list_var = cdolist_list_var.rest();
                conjunct = cdolist_list_var.first();
            }
            return rkf_sd_conjoin(assert_conjuncts, (SubLObject)rkf_salient_descriptor.NIL, (SubLObject)rkf_salient_descriptor.NIL);
        }
        return subform;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/rkf-salient-descriptor.lisp", position = 92045L)
    public static SubLObject rkf_salient_descriptor_complete_coll_bindings(final SubLObject variable, final SubLObject subform, final SubLObject mt) {
        final SubLObject conjuncts = (SubLObject)ConsesLow.list((SubLObject)ConsesLow.list(rkf_salient_descriptor.$const24$isa, (SubLObject)rkf_salient_descriptor.$kw231$VAR, variables.find_variable_by_id((SubLObject)rkf_salient_descriptor.ZERO_INTEGER)), variables.find_variable_by_id((SubLObject)rkf_salient_descriptor.ONE_INTEGER));
        final SubLObject v_bindings = rkf_salient_descriptor_bindings(variable, subform, conjuncts, (SubLObject)rkf_salient_descriptor.$sym232$RKF_SD_COMPLETE_COLL_BINDINGS_OK_, mt);
        return v_bindings;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/rkf-salient-descriptor.lisp", position = 92369L)
    public static SubLObject rkf_sd_complete_coll_bindings_okP(final SubLObject v_bindings, final SubLObject mt) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        if (rkf_salient_descriptor.NIL == v_bindings) {
            return (SubLObject)rkf_salient_descriptor.NIL;
        }
        final SubLObject col = bindings.subst_bindings(v_bindings, variables.find_variable_by_id((SubLObject)rkf_salient_descriptor.ZERO_INTEGER));
        return (SubLObject)SubLObjectFactory.makeBoolean(rkf_salient_descriptor.NIL != forts.fort_p(col) && rkf_salient_descriptor.NIL != kb_accessors.completely_enumerable_collectionP(col, mt) && rkf_salient_descriptor.NIL != list_utilities.lengthLE(rkf_ontology_utilities.rkf_all_fort_instances(col, mt), rkf_salient_descriptor.$rkf_choice_count_cutoff$.getDynamicValue(thread), (SubLObject)rkf_salient_descriptor.UNPROVIDED));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/rkf-salient-descriptor.lisp", position = 92691L)
    public static SubLObject rkf_salient_descriptor_small_set_bindings(final SubLObject variable, final SubLObject subform) {
        final SubLObject conjuncts = (SubLObject)ConsesLow.list(variables.find_variable_by_id((SubLObject)rkf_salient_descriptor.ZERO_INTEGER), (SubLObject)ConsesLow.list(rkf_salient_descriptor.$const233$elementOf, (SubLObject)rkf_salient_descriptor.$kw231$VAR, reader.bq_cons(rkf_salient_descriptor.$const234$TheSet, variables.find_variable_by_id((SubLObject)rkf_salient_descriptor.ONE_INTEGER))));
        final SubLObject v_bindings = rkf_salient_descriptor_bindings(variable, subform, conjuncts, (SubLObject)rkf_salient_descriptor.$sym235$RKF_SD_SMALL_SET_BINDINGS_OK_, (SubLObject)rkf_salient_descriptor.UNPROVIDED);
        return v_bindings;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/rkf-salient-descriptor.lisp", position = 93020L)
    public static SubLObject rkf_sd_small_set_bindings_okP(final SubLObject v_bindings, final SubLObject mt) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        if (rkf_salient_descriptor.NIL == v_bindings) {
            return (SubLObject)rkf_salient_descriptor.NIL;
        }
        final SubLObject elements = bindings.subst_bindings(v_bindings, variables.find_variable_by_id((SubLObject)rkf_salient_descriptor.ONE_INTEGER));
        return list_utilities.lengthLE(elements, rkf_salient_descriptor.$rkf_choice_count_cutoff$.getDynamicValue(thread), (SubLObject)rkf_salient_descriptor.UNPROVIDED);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/rkf-salient-descriptor.lisp", position = 93255L)
    public static SubLObject rkf_salient_descriptor_bindings(final SubLObject variable, final SubLObject subform, final SubLObject conjuncts, final SubLObject test, SubLObject mt) {
        if (mt == rkf_salient_descriptor.UNPROVIDED) {
            mt = (SubLObject)rkf_salient_descriptor.NIL;
        }
        final SubLObject v_bindings = unification_utilities.term_unify(cycl_utilities.expression_subst(variable, (SubLObject)rkf_salient_descriptor.$kw231$VAR, el_utilities.make_conjunction(conjuncts), (SubLObject)rkf_salient_descriptor.UNPROVIDED, (SubLObject)rkf_salient_descriptor.UNPROVIDED), subform, (SubLObject)rkf_salient_descriptor.UNPROVIDED, (SubLObject)rkf_salient_descriptor.UNPROVIDED);
        if (rkf_salient_descriptor.NIL != Functions.funcall(test, v_bindings, mt)) {
            return v_bindings;
        }
        final SubLObject backward_bindings = unification_utilities.term_unify(cycl_utilities.expression_subst(variable, (SubLObject)rkf_salient_descriptor.$kw231$VAR, el_utilities.make_conjunction(Sequences.nreverse(conjuncts)), (SubLObject)rkf_salient_descriptor.UNPROVIDED, (SubLObject)rkf_salient_descriptor.UNPROVIDED), subform, (SubLObject)rkf_salient_descriptor.UNPROVIDED, (SubLObject)rkf_salient_descriptor.UNPROVIDED);
        return (SubLObject)((rkf_salient_descriptor.NIL != Functions.funcall(test, backward_bindings, mt)) ? backward_bindings : rkf_salient_descriptor.NIL);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/rkf-salient-descriptor.lisp", position = 93741L)
    public static SubLObject rkf_salient_descriptor_assert_formula(final SubLObject formula) {
        if (rkf_salient_descriptor.NIL == el_utilities.el_conjunction_p(formula)) {
            return formula;
        }
        SubLObject conjuncts = (SubLObject)rkf_salient_descriptor.NIL;
        SubLObject cdolist_list_var;
        final SubLObject args = cdolist_list_var = cycl_utilities.formula_args(formula, (SubLObject)rkf_salient_descriptor.$kw185$IGNORE);
        SubLObject subform = (SubLObject)rkf_salient_descriptor.NIL;
        subform = cdolist_list_var.first();
        while (rkf_salient_descriptor.NIL != cdolist_list_var) {
            if (rkf_salient_descriptor.NIL == rkf_salient_descriptor_not_assertible_sentenceP(subform)) {
                conjuncts = (SubLObject)ConsesLow.cons(subform, conjuncts);
            }
            cdolist_list_var = cdolist_list_var.rest();
            subform = cdolist_list_var.first();
        }
        return rkf_sd_conjoin(Sequences.nreverse(conjuncts), (SubLObject)rkf_salient_descriptor.T, (SubLObject)rkf_salient_descriptor.NIL);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/rkf-salient-descriptor.lisp", position = 94222L)
    public static SubLObject rkf_salient_descriptor_not_assertible_sentenceP(final SubLObject conjunct) {
        if (rkf_salient_descriptor.NIL != cycl_grammar.cycl_atomic_sentence_p(conjunct)) {
            final SubLObject predicate = cycl_utilities.atomic_sentence_predicate(conjunct);
            final SubLObject not_assertibleP = list_utilities.sublisp_boolean(kb_mapping_utilities.fpred_value(predicate, rkf_salient_descriptor.$const236$notAssertible, (SubLObject)rkf_salient_descriptor.ONE_INTEGER, (SubLObject)rkf_salient_descriptor.ONE_INTEGER, (SubLObject)rkf_salient_descriptor.UNPROVIDED));
            return not_assertibleP;
        }
        return (SubLObject)rkf_salient_descriptor.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/rkf-salient-descriptor.lisp", position = 94671L)
    public static SubLObject rkf_generate_interaction_example_instances_formula(final SubLObject variable, final SubLObject mt) {
        return el_utilities.list_to_elf((SubLObject)ConsesLow.list(rkf_salient_descriptor.$const237$or, (SubLObject)ConsesLow.list(rkf_salient_descriptor.$const238$termDependsOn, variable, mt), (SubLObject)ConsesLow.list(rkf_salient_descriptor.$const239$uiaDisplayTerm, variable, mt)));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/rkf-salient-descriptor.lisp", position = 94930L)
    public static SubLObject rkf_example_instances_backchain_level() {
        final SubLThread thread = SubLProcess.currentSubLThread();
        return rkf_salient_descriptor.$rkf_example_instances_backchain_level$.getDynamicValue(thread);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/rkf-salient-descriptor.lisp", position = 95329L)
    public static SubLObject rkf_example_instances(final SubLObject variable, final SubLObject knowledge_gap_sentence, final SubLObject v_term, final SubLObject constraints, final SubLObject salient_property, final SubLObject mt, SubLObject how_many, SubLObject used_examples, SubLObject include_types) {
        if (how_many == rkf_salient_descriptor.UNPROVIDED) {
            how_many = (SubLObject)rkf_salient_descriptor.THREE_INTEGER;
        }
        if (used_examples == rkf_salient_descriptor.UNPROVIDED) {
            used_examples = (SubLObject)rkf_salient_descriptor.NIL;
        }
        if (include_types == rkf_salient_descriptor.UNPROVIDED) {
            include_types = (SubLObject)rkf_salient_descriptor.$kw59$ALL;
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject examples = (SubLObject)rkf_salient_descriptor.NIL;
        final SubLObject focal_term_analog_var = czer_utilities.unique_el_var_wrt_expression(knowledge_gap_sentence, (SubLObject)rkf_salient_descriptor.UNPROVIDED);
        final SubLObject local_state;
        final SubLObject state = local_state = memoization_state.possibly_new_memoization_state();
        final SubLObject _prev_bind_0 = memoization_state.$memoization_state$.currentBinding(thread);
        try {
            memoization_state.$memoization_state$.bind(local_state, thread);
            final SubLObject original_memoization_process = memoization_state.memoization_state_original_process(local_state);
            try {
                final SubLObject already_resourcing_p = sbhl_marking_vars.$resourcing_sbhl_marking_spaces_p$.getDynamicValue(thread);
                final SubLObject _prev_bind_0_$149 = sbhl_marking_vars.$resourced_sbhl_marking_space_limit$.currentBinding(thread);
                final SubLObject _prev_bind_2 = sbhl_marking_vars.$resourced_sbhl_marking_spaces$.currentBinding(thread);
                final SubLObject _prev_bind_3 = sbhl_marking_vars.$resourcing_sbhl_marking_spaces_p$.currentBinding(thread);
                try {
                    sbhl_marking_vars.$resourced_sbhl_marking_space_limit$.bind(sbhl_marking_vars.determine_resource_limit(already_resourcing_p, (SubLObject)rkf_salient_descriptor.SIX_INTEGER), thread);
                    sbhl_marking_vars.$resourced_sbhl_marking_spaces$.bind(sbhl_marking_vars.possibly_new_marking_resource(already_resourcing_p), thread);
                    sbhl_marking_vars.$resourcing_sbhl_marking_spaces_p$.bind((SubLObject)rkf_salient_descriptor.T, thread);
                    final SubLObject reuse_existingP = rkf_sd_problem_store_okP(rkf_salient_descriptor.$rkf_sd_problem_store$.getDynamicValue(thread));
                    final SubLObject _prev_bind_0_$150 = rkf_salient_descriptor.$rkf_sd_problem_store$.currentBinding(thread);
                    try {
                        rkf_salient_descriptor.$rkf_sd_problem_store$.bind(rkf_sd_find_or_make_problem_store(), thread);
                        final SubLObject store = rkf_salient_descriptor.$rkf_sd_problem_store$.getDynamicValue(thread);
                        try {
                            SubLObject adjusted_how_many = rkf_sd_examples_adjusted_number_constraint(how_many);
                            final SubLObject local_terms = (SubLObject)((rkf_salient_descriptor.NIL != rkf_example_types_include_type_p(include_types, (SubLObject)rkf_salient_descriptor.$kw240$CONSTRAINT_MATCHER)) ? rkf_local_example_instances(variable, v_term, constraints, mt, adjusted_how_many, used_examples, focal_term_analog_var) : rkf_salient_descriptor.NIL);
                            SubLObject precedents = (SubLObject)rkf_salient_descriptor.NIL;
                            if (rkf_salient_descriptor.NIL != rkf_example_types_include_type_p(include_types, (SubLObject)rkf_salient_descriptor.$kw241$PRECEDENT)) {
                                final SubLObject precedent_query_sentence = rkf_sd_precedent_query_sentence(focal_term_analog_var, v_term, knowledge_gap_sentence, salient_property);
                                precedents = rkf_asserted_example_instances(variable, precedent_query_sentence, mt, how_many, used_examples, focal_term_analog_var);
                            }
                            examples = rkf_add_examples(conses_high.intersection(local_terms, precedents, Symbols.symbol_function((SubLObject)rkf_salient_descriptor.EQUAL), (SubLObject)rkf_salient_descriptor.$sym242$RKF_SD_EXAMPLE_TERM), variable, knowledge_gap_sentence, mt, examples, how_many, (SubLObject)rkf_salient_descriptor.UNPROVIDED);
                            examples = rkf_add_examples(local_terms, variable, knowledge_gap_sentence, mt, examples, how_many, (SubLObject)rkf_salient_descriptor.UNPROVIDED);
                            examples = rkf_add_examples(precedents, variable, knowledge_gap_sentence, mt, examples, how_many, (SubLObject)rkf_salient_descriptor.UNPROVIDED);
                            adjusted_how_many = rkf_sd_examples_adjusted_number_constraint(Numbers.subtract(how_many, Sequences.length(examples)));
                            if (adjusted_how_many.isPositive() && rkf_salient_descriptor.NIL != rkf_example_types_include_type_p(include_types, (SubLObject)rkf_salient_descriptor.$kw240$CONSTRAINT_MATCHER)) {
                                final SubLObject constraint_matchers = rkf_example_instances_ask(variable, constraints, mt, adjusted_how_many, (SubLObject)rkf_salient_descriptor.$kw240$CONSTRAINT_MATCHER, used_examples, focal_term_analog_var);
                                examples = rkf_add_examples(constraint_matchers, variable, knowledge_gap_sentence, mt, examples, how_many, (SubLObject)rkf_salient_descriptor.UNPROVIDED);
                            }
                        }
                        finally {
                            final SubLObject _prev_bind_0_$151 = Threads.$is_thread_performing_cleanupP$.currentBinding(thread);
                            try {
                                Threads.$is_thread_performing_cleanupP$.bind((SubLObject)rkf_salient_descriptor.T, thread);
                                final SubLObject _values = Values.getValuesAsVector();
                                if (rkf_salient_descriptor.NIL == reuse_existingP) {
                                    rkf_sd_free_problem_store(store);
                                }
                                Values.restoreValuesFromVector(_values);
                            }
                            finally {
                                Threads.$is_thread_performing_cleanupP$.rebind(_prev_bind_0_$151, thread);
                            }
                        }
                    }
                    finally {
                        rkf_salient_descriptor.$rkf_sd_problem_store$.rebind(_prev_bind_0_$150, thread);
                    }
                }
                finally {
                    sbhl_marking_vars.$resourcing_sbhl_marking_spaces_p$.rebind(_prev_bind_3, thread);
                    sbhl_marking_vars.$resourced_sbhl_marking_spaces$.rebind(_prev_bind_2, thread);
                    sbhl_marking_vars.$resourced_sbhl_marking_space_limit$.rebind(_prev_bind_0_$149, thread);
                }
            }
            finally {
                final SubLObject _prev_bind_0_$152 = Threads.$is_thread_performing_cleanupP$.currentBinding(thread);
                try {
                    Threads.$is_thread_performing_cleanupP$.bind((SubLObject)rkf_salient_descriptor.T, thread);
                    final SubLObject _values2 = Values.getValuesAsVector();
                    memoization_state.memoization_state_possibly_clear_original_process(local_state, original_memoization_process);
                    Values.restoreValuesFromVector(_values2);
                }
                finally {
                    Threads.$is_thread_performing_cleanupP$.rebind(_prev_bind_0_$152, thread);
                }
            }
        }
        finally {
            memoization_state.$memoization_state$.rebind(_prev_bind_0, thread);
        }
        return list_utilities.first_n(how_many, examples);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/rkf-salient-descriptor.lisp", position = 98079L)
    public static SubLObject rkf_sd_examples_adjusted_number_constraint(final SubLObject how_many) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject fudge_factor = (SubLObject)((rkf_salient_descriptor.NIL != rkf_salient_descriptor.$rkf_example_instances_wff_checkP$.getDynamicValue(thread)) ? rkf_salient_descriptor.FOUR_INTEGER : rkf_salient_descriptor.ONE_INTEGER);
        return Numbers.multiply(how_many, fudge_factor);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/rkf-salient-descriptor.lisp", position = 98258L)
    public static SubLObject rkf_asserted_example_instances(final SubLObject variable, final SubLObject precedent_query_sentence, final SubLObject mt, final SubLObject how_many, final SubLObject used_examples, final SubLObject focal_term_analog_var) {
        return rkf_example_instances_ask(variable, precedent_query_sentence, mt, how_many, (SubLObject)rkf_salient_descriptor.$kw241$PRECEDENT, used_examples, focal_term_analog_var);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/rkf-salient-descriptor.lisp", position = 98531L)
    public static SubLObject rkf_local_example_instances(final SubLObject variable, final SubLObject v_term, final SubLObject constraints, final SubLObject mt, final SubLObject how_many, final SubLObject used_examples, final SubLObject focal_term_analog_var) {
        final SubLObject local_terms_query_sentence = rkf_generate_interaction_example_instances_formula(variable, mt);
        final SubLObject constrained_local_query_sentence = (rkf_salient_descriptor.NIL != el_utilities.el_formula_p(constraints)) ? rkf_sd_conjoin((SubLObject)ConsesLow.list(constraints, local_terms_query_sentence), (SubLObject)rkf_salient_descriptor.NIL, (SubLObject)rkf_salient_descriptor.NIL) : local_terms_query_sentence;
        final SubLObject local_terms = Sequences.remove(v_term, rkf_example_instances_ask(variable, constrained_local_query_sentence, mt, how_many, (SubLObject)rkf_salient_descriptor.$kw240$CONSTRAINT_MATCHER, used_examples, focal_term_analog_var), Symbols.symbol_function((SubLObject)rkf_salient_descriptor.EQUAL), (SubLObject)rkf_salient_descriptor.$sym242$RKF_SD_EXAMPLE_TERM, (SubLObject)rkf_salient_descriptor.UNPROVIDED, (SubLObject)rkf_salient_descriptor.UNPROVIDED, (SubLObject)rkf_salient_descriptor.UNPROVIDED);
        return local_terms;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/rkf-salient-descriptor.lisp", position = 99207L)
    public static SubLObject rkf_example_types_include_type_p(final SubLObject include_types, final SubLObject type) {
        return (SubLObject)SubLObjectFactory.makeBoolean(include_types == rkf_salient_descriptor.$kw59$ALL || rkf_salient_descriptor.NIL != conses_high.member(type, include_types, (SubLObject)rkf_salient_descriptor.UNPROVIDED, (SubLObject)rkf_salient_descriptor.UNPROVIDED));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/rkf-salient-descriptor.lisp", position = 99409L)
    public static SubLObject rkf_add_examples(final SubLObject candidates, final SubLObject var, final SubLObject knowledge_gap_sentence, final SubLObject mt, final SubLObject examples, final SubLObject how_many, SubLObject further_constraint_sentence) {
        if (further_constraint_sentence == rkf_salient_descriptor.UNPROVIDED) {
            further_constraint_sentence = (SubLObject)rkf_salient_descriptor.NIL;
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject how_many_more = Numbers.subtract(how_many, Sequences.length(examples));
        SubLObject enoughP = (SubLObject)SubLObjectFactory.makeBoolean(!how_many_more.isPositive());
        SubLObject new_examples = (SubLObject)rkf_salient_descriptor.NIL;
        if (rkf_salient_descriptor.NIL == enoughP) {
            SubLObject csome_list_var = candidates;
            SubLObject candidate = (SubLObject)rkf_salient_descriptor.NIL;
            candidate = csome_list_var.first();
            while (rkf_salient_descriptor.NIL == enoughP && rkf_salient_descriptor.NIL != csome_list_var) {
                if (rkf_salient_descriptor.NIL == rkf_example_in_examplesP(candidate, examples) && rkf_salient_descriptor.NIL == rkf_example_in_examplesP(candidate, new_examples) && (rkf_salient_descriptor.NIL == el_utilities.el_formula_p(further_constraint_sentence) || rkf_salient_descriptor.NIL != rkf_sd_known(cycl_utilities.expression_subst(rkf_salient_descriptor_datastructures.rkf_sd_example_term(candidate), var, further_constraint_sentence, (SubLObject)rkf_salient_descriptor.UNPROVIDED, (SubLObject)rkf_salient_descriptor.UNPROVIDED), mt, (SubLObject)rkf_salient_descriptor.UNPROVIDED)) && (rkf_salient_descriptor.$kw240$CONSTRAINT_MATCHER != rkf_salient_descriptor_datastructures.rkf_sd_example_type(candidate) || rkf_salient_descriptor.NIL != rkf_example_not_known_falseP(candidate, var, knowledge_gap_sentence, mt)) && (rkf_salient_descriptor.NIL == rkf_salient_descriptor.$rkf_example_instances_wff_checkP$.getDynamicValue(thread) || rkf_salient_descriptor.NIL != rkf_example_wffP(candidate, var, knowledge_gap_sentence, mt))) {
                    new_examples = (SubLObject)ConsesLow.cons(candidate, new_examples);
                    enoughP = list_utilities.lengthGE(new_examples, how_many_more, (SubLObject)rkf_salient_descriptor.UNPROVIDED);
                }
                csome_list_var = csome_list_var.rest();
                candidate = csome_list_var.first();
            }
        }
        return ConsesLow.nconc(examples, Sequences.nreverse(new_examples));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/rkf-salient-descriptor.lisp", position = 100427L)
    public static SubLObject rkf_example_in_examplesP(final SubLObject candidate, final SubLObject examples) {
        return subl_promotions.memberP(rkf_salient_descriptor_datastructures.rkf_sd_example_term(candidate), examples, Symbols.symbol_function((SubLObject)rkf_salient_descriptor.EQUAL), Symbols.symbol_function((SubLObject)rkf_salient_descriptor.$sym242$RKF_SD_EXAMPLE_TERM));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/rkf-salient-descriptor.lisp", position = 100814L)
    public static SubLObject rkf_example_not_known_falseP(final SubLObject example, final SubLObject var, final SubLObject knowledge_gap_sentence, final SubLObject mt) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject example_term = rkf_salient_descriptor_datastructures.rkf_sd_example_term(example);
        final SubLObject ask_sentence = el_utilities.make_negation(cycl_utilities.expression_subst(example_term, var, knowledge_gap_sentence, (SubLObject)rkf_salient_descriptor.UNPROVIDED, (SubLObject)rkf_salient_descriptor.UNPROVIDED));
        SubLObject result = (SubLObject)rkf_salient_descriptor.NIL;
        final SubLObject _prev_bind_0 = rkf_salient_descriptor.$rkf_sd_known_time_cutoff$.currentBinding(thread);
        try {
            rkf_salient_descriptor.$rkf_sd_known_time_cutoff$.bind(rkf_salient_descriptor.$rkf_example_not_known_false_time_cutoff$.getDynamicValue(thread).isNumber() ? Numbers.min(rkf_salient_descriptor.$rkf_sd_known_time_cutoff$.getDynamicValue(thread), rkf_salient_descriptor.$rkf_example_not_known_false_time_cutoff$.getDynamicValue(thread)) : rkf_salient_descriptor.$rkf_sd_known_time_cutoff$.getDynamicValue(thread), thread);
            result = (SubLObject)SubLObjectFactory.makeBoolean(rkf_salient_descriptor.NIL == rkf_sd_known(ask_sentence, mt, (SubLObject)rkf_salient_descriptor.UNPROVIDED));
        }
        finally {
            rkf_salient_descriptor.$rkf_sd_known_time_cutoff$.rebind(_prev_bind_0, thread);
        }
        return result;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/rkf-salient-descriptor.lisp", position = 101357L)
    public static SubLObject rkf_example_wffP(final SubLObject example, final SubLObject var, final SubLObject knowledge_gap_sentence, final SubLObject mt) {
        final SubLObject example_term = rkf_salient_descriptor_datastructures.rkf_sd_example_term(example);
        final SubLObject ask_sentence = cycl_utilities.expression_subst(example_term, var, knowledge_gap_sentence, (SubLObject)rkf_salient_descriptor.UNPROVIDED, (SubLObject)rkf_salient_descriptor.UNPROVIDED);
        return rkf_example_wffP_int(ask_sentence, mt);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/rkf-salient-descriptor.lisp", position = 101613L)
    public static SubLObject rkf_example_wffP_int_internal(final SubLObject ask_sentence, final SubLObject mt) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject result = (SubLObject)rkf_salient_descriptor.NIL;
        SubLObject ignore_errors_tag = (SubLObject)rkf_salient_descriptor.NIL;
        try {
            thread.throwStack.push(rkf_salient_descriptor.$kw244$IGNORE_ERRORS_TARGET);
            final SubLObject _prev_bind_0 = Errors.$error_handler$.currentBinding(thread);
            try {
                Errors.$error_handler$.bind(Symbols.symbol_function((SubLObject)rkf_salient_descriptor.$sym245$IGNORE_ERRORS_HANDLER), thread);
                try {
                    final SubLObject _prev_bind_0_$153 = wff_vars.$validate_expansionsP$.currentBinding(thread);
                    final SubLObject _prev_bind_2 = control_vars.$suppress_conflict_noticesP$.currentBinding(thread);
                    try {
                        wff_vars.$validate_expansionsP$.bind((SubLObject)rkf_salient_descriptor.T, thread);
                        control_vars.$suppress_conflict_noticesP$.bind((SubLObject)rkf_salient_descriptor.T, thread);
                        result = wff.el_wff_assertibleP(ask_sentence, mt, (SubLObject)rkf_salient_descriptor.UNPROVIDED);
                    }
                    finally {
                        control_vars.$suppress_conflict_noticesP$.rebind(_prev_bind_2, thread);
                        wff_vars.$validate_expansionsP$.rebind(_prev_bind_0_$153, thread);
                    }
                }
                catch (Throwable catch_var) {
                    Errors.handleThrowable(catch_var, (SubLObject)rkf_salient_descriptor.NIL);
                }
            }
            finally {
                Errors.$error_handler$.rebind(_prev_bind_0, thread);
            }
        }
        catch (Throwable ccatch_env_var) {
            ignore_errors_tag = Errors.handleThrowable(ccatch_env_var, (SubLObject)rkf_salient_descriptor.$kw244$IGNORE_ERRORS_TARGET);
        }
        finally {
            thread.throwStack.pop();
        }
        return result;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/rkf-salient-descriptor.lisp", position = 101613L)
    public static SubLObject rkf_example_wffP_int(final SubLObject ask_sentence, final SubLObject mt) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject v_memoization_state = memoization_state.$memoization_state$.getDynamicValue(thread);
        SubLObject caching_state = (SubLObject)rkf_salient_descriptor.NIL;
        if (rkf_salient_descriptor.NIL == v_memoization_state) {
            return rkf_example_wffP_int_internal(ask_sentence, mt);
        }
        caching_state = memoization_state.memoization_state_lookup(v_memoization_state, (SubLObject)rkf_salient_descriptor.$sym243$RKF_EXAMPLE_WFF__INT, (SubLObject)rkf_salient_descriptor.UNPROVIDED);
        if (rkf_salient_descriptor.NIL == caching_state) {
            caching_state = memoization_state.create_caching_state(memoization_state.memoization_state_lock(v_memoization_state), (SubLObject)rkf_salient_descriptor.$sym243$RKF_EXAMPLE_WFF__INT, (SubLObject)rkf_salient_descriptor.TWO_INTEGER, (SubLObject)rkf_salient_descriptor.NIL, (SubLObject)rkf_salient_descriptor.EQUAL, (SubLObject)rkf_salient_descriptor.UNPROVIDED);
            memoization_state.memoization_state_put(v_memoization_state, (SubLObject)rkf_salient_descriptor.$sym243$RKF_EXAMPLE_WFF__INT, caching_state);
        }
        final SubLObject sxhash = memoization_state.sxhash_calc_2(ask_sentence, mt);
        final SubLObject collisions = memoization_state.caching_state_lookup(caching_state, sxhash, (SubLObject)rkf_salient_descriptor.UNPROVIDED);
        if (!collisions.eql(memoization_state.$memoized_item_not_found$.getGlobalValue())) {
            SubLObject cdolist_list_var = collisions;
            SubLObject collision = (SubLObject)rkf_salient_descriptor.NIL;
            collision = cdolist_list_var.first();
            while (rkf_salient_descriptor.NIL != cdolist_list_var) {
                SubLObject cached_args = collision.first();
                final SubLObject results2 = conses_high.second(collision);
                if (ask_sentence.equal(cached_args.first())) {
                    cached_args = cached_args.rest();
                    if (rkf_salient_descriptor.NIL != cached_args && rkf_salient_descriptor.NIL == cached_args.rest() && mt.equal(cached_args.first())) {
                        return memoization_state.caching_results(results2);
                    }
                }
                cdolist_list_var = cdolist_list_var.rest();
                collision = cdolist_list_var.first();
            }
        }
        final SubLObject results3 = Values.arg2(thread.resetMultipleValues(), (SubLObject)Values.multiple_value_list(rkf_example_wffP_int_internal(ask_sentence, mt)));
        memoization_state.caching_state_enter_multi_key_n(caching_state, sxhash, collisions, results3, (SubLObject)ConsesLow.list(ask_sentence, mt));
        return memoization_state.caching_results(results3);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/rkf-salient-descriptor.lisp", position = 101891L)
    public static SubLObject rkf_example_instances_ask_properties(final SubLObject how_many, final SubLObject how_many_known) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject fudge_factor = (SubLObject)rkf_salient_descriptor.TWO_INTEGER;
        if (rkf_salient_descriptor.NIL == rkf_salient_descriptor.$rkf_example_instances_wff_checkP$.getDynamicValue(thread)) {
            fudge_factor = (SubLObject)rkf_salient_descriptor.ONE_INTEGER;
        }
        return (SubLObject)ConsesLow.list(new SubLObject[] { rkf_salient_descriptor.$kw69$PROBLEM_STORE, rkf_sd_find_or_make_problem_store(), rkf_salient_descriptor.$kw70$ANSWER_LANGUAGE, rkf_salient_descriptor.$kw71$HL, rkf_salient_descriptor.$kw103$CACHE_INFERENCE_RESULTS_, rkf_salient_descriptor.NIL, rkf_salient_descriptor.$kw104$RESULT_UNIQUENESS, rkf_salient_descriptor.$kw105$BINDINGS, rkf_salient_descriptor.$kw106$RETURN, rkf_salient_descriptor.$kw180$BINDINGS_AND_SUPPORTS, rkf_salient_descriptor.$kw110$MAX_NUMBER, Numbers.add(how_many_known, Numbers.multiply(fudge_factor, how_many)), rkf_salient_descriptor.$kw159$FORGET_EXTRA_RESULTS_, rkf_salient_descriptor.T, rkf_salient_descriptor.$kw111$MAX_TIME, rkf_salient_descriptor.$rkf_example_instances_time_cutoff$.getDynamicValue(thread), rkf_salient_descriptor.$kw108$PRODUCTIVITY_LIMIT, rkf_salient_descriptor.$int109$100000, rkf_salient_descriptor.$kw113$MAX_TRANSFORMATION_DEPTH, rkf_example_instances_backchain_level() });
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/rkf-salient-descriptor.lisp", position = 102650L)
    public static SubLObject rkf_example_instances_ask(final SubLObject variable, SubLObject formula, final SubLObject mt, final SubLObject how_many, final SubLObject example_type, SubLObject used_examples, final SubLObject focal_term_analog_var) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        if (rkf_salient_descriptor.NIL == cycl_utilities.expression_find(variable, formula, (SubLObject)rkf_salient_descriptor.UNPROVIDED, (SubLObject)rkf_salient_descriptor.UNPROVIDED, (SubLObject)rkf_salient_descriptor.UNPROVIDED)) {
            return (SubLObject)rkf_salient_descriptor.NIL;
        }
        SubLObject cdolist_list_var = el_utilities.sentence_free_variables(formula, (SubLObject)rkf_salient_descriptor.UNPROVIDED, (SubLObject)rkf_salient_descriptor.UNPROVIDED, (SubLObject)rkf_salient_descriptor.UNPROVIDED);
        SubLObject var = (SubLObject)rkf_salient_descriptor.NIL;
        var = cdolist_list_var.first();
        while (rkf_salient_descriptor.NIL != cdolist_list_var) {
            if (!var.eql(variable) && !var.eql(focal_term_analog_var)) {
                formula = el_utilities.make_existential(var, formula);
            }
            cdolist_list_var = cdolist_list_var.rest();
            var = cdolist_list_var.first();
        }
        SubLObject ans = (SubLObject)rkf_salient_descriptor.NIL;
        SubLObject enoughP = list_utilities.lengthGE(ans, how_many, (SubLObject)rkf_salient_descriptor.UNPROVIDED);
        final SubLObject v_properties = rkf_example_instances_ask_properties(how_many, Sequences.length(used_examples));
        SubLObject candidates = (SubLObject)rkf_salient_descriptor.NIL;
        if (rkf_salient_descriptor.NIL == enoughP) {
            thread.resetMultipleValues();
            final SubLObject ask_results = inference_kernel.new_cyc_query(formula, mt, v_properties);
            final SubLObject exit_condition = thread.secondMultipleValue();
            thread.resetMultipleValues();
            if (rkf_salient_descriptor.$kw111$MAX_TIME == exit_condition && rkf_salient_descriptor.$rkf_example_instances_time_cutoff$.getDynamicValue(thread).isPositive()) {
                Errors.warn((SubLObject)rkf_salient_descriptor.$str246$__RKF_EXAMPLE_INSTANCES_ASK_timed, rkf_salient_descriptor.$rkf_example_instances_time_cutoff$.getDynamicValue(thread), formula, mt);
            }
            SubLObject cdolist_list_var2 = ask_results;
            SubLObject ask_result = (SubLObject)rkf_salient_descriptor.NIL;
            ask_result = cdolist_list_var2.first();
            while (rkf_salient_descriptor.NIL != cdolist_list_var2) {
                SubLObject current;
                final SubLObject datum = current = ask_result;
                SubLObject v_bindings = (SubLObject)rkf_salient_descriptor.NIL;
                SubLObject supports = (SubLObject)rkf_salient_descriptor.NIL;
                cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)rkf_salient_descriptor.$list184);
                v_bindings = current.first();
                current = current.rest();
                cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)rkf_salient_descriptor.$list184);
                supports = current.first();
                current = current.rest();
                if (rkf_salient_descriptor.NIL == current) {
                    final SubLObject v_term = bindings.variable_lookup(variable, v_bindings);
                    final SubLObject focal_term_analog = bindings.variable_lookup(focal_term_analog_var, v_bindings);
                    if (rkf_salient_descriptor.NIL == subl_promotions.memberP(v_term, candidates, Symbols.symbol_function((SubLObject)rkf_salient_descriptor.EQUAL), (SubLObject)rkf_salient_descriptor.$sym242$RKF_SD_EXAMPLE_TERM) && rkf_salient_descriptor.NIL == conses_high.member(v_term, used_examples, Symbols.symbol_function((SubLObject)rkf_salient_descriptor.EQUAL), (SubLObject)rkf_salient_descriptor.$sym242$RKF_SD_EXAMPLE_TERM)) {
                        final SubLObject example = rkf_salient_descriptor_datastructures.new_rkf_sd_example(example_type, v_term, supports, focal_term_analog);
                        candidates = (SubLObject)ConsesLow.cons(example, candidates);
                    }
                }
                else {
                    cdestructuring_bind.cdestructuring_bind_error(datum, (SubLObject)rkf_salient_descriptor.$list184);
                }
                cdolist_list_var2 = cdolist_list_var2.rest();
                ask_result = cdolist_list_var2.first();
            }
        }
        candidates = Sort.sort(candidates, (SubLObject)rkf_salient_descriptor.$sym247$GENERALITY_ESTIMATE_, (SubLObject)rkf_salient_descriptor.$sym242$RKF_SD_EXAMPLE_TERM);
        if (rkf_salient_descriptor.NIL == enoughP) {
            SubLObject csome_list_var = candidates;
            SubLObject candidate = (SubLObject)rkf_salient_descriptor.NIL;
            candidate = csome_list_var.first();
            while (rkf_salient_descriptor.NIL == enoughP && rkf_salient_descriptor.NIL != csome_list_var) {
                if (rkf_salient_descriptor.NIL == rkf_bad_exampleP(candidate, mt)) {
                    ans = (SubLObject)ConsesLow.cons(candidate, ans);
                    enoughP = list_utilities.lengthGE(ans, how_many, (SubLObject)rkf_salient_descriptor.UNPROVIDED);
                }
                csome_list_var = csome_list_var.rest();
                candidate = csome_list_var.first();
            }
        }
        ans = Sort.sort(ans, (SubLObject)rkf_salient_descriptor.$sym248$RKF_BETTER_EXAMPLE_, (SubLObject)rkf_salient_descriptor.UNPROVIDED);
        if (rkf_salient_descriptor.NIL == ans && rkf_salient_descriptor.NIL != el_utilities.el_disjunction_p(formula)) {
            SubLObject cdolist_list_var3 = cycl_utilities.formula_args(formula, (SubLObject)rkf_salient_descriptor.UNPROVIDED);
            SubLObject disjunct = (SubLObject)rkf_salient_descriptor.NIL;
            disjunct = cdolist_list_var3.first();
            while (rkf_salient_descriptor.NIL != cdolist_list_var3) {
                final SubLObject _prev_bind_0 = rkf_salient_descriptor.$rkf_sd_problem_store$.currentBinding(thread);
                try {
                    rkf_salient_descriptor.$rkf_sd_problem_store$.bind((SubLObject)rkf_salient_descriptor.$kw249$BUG_WORKAROUND, thread);
                    final SubLObject new_examples = rkf_example_instances_ask(variable, disjunct, mt, how_many, example_type, used_examples, focal_term_analog_var);
                    ans = (used_examples = ConsesLow.append(ans, new_examples));
                }
                finally {
                    rkf_salient_descriptor.$rkf_sd_problem_store$.rebind(_prev_bind_0, thread);
                }
                cdolist_list_var3 = cdolist_list_var3.rest();
                disjunct = cdolist_list_var3.first();
            }
        }
        return list_utilities.first_n(how_many, ans);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/rkf-salient-descriptor.lisp", position = 104990L)
    public static SubLObject rkf_bad_exampleP(final SubLObject candidate, final SubLObject mt) {
        final SubLObject v_term = rkf_salient_descriptor_datastructures.rkf_sd_example_term(candidate);
        return (SubLObject)SubLObjectFactory.makeBoolean(rkf_salient_descriptor.NIL != rkf_relevance_utilities.rkf_irrelevant_term(v_term, mt) || rkf_salient_descriptor.NIL != kb_accessors.indeterminate_termP(v_term));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/rkf-salient-descriptor.lisp", position = 105170L)
    public static SubLObject rkf_better_exampleP(final SubLObject ex1, final SubLObject ex2) {
        final SubLObject term1 = rkf_salient_descriptor_datastructures.rkf_sd_example_term(ex1);
        final SubLObject term2 = rkf_salient_descriptor_datastructures.rkf_sd_example_term(ex2);
        if (rkf_salient_descriptor.NIL != constant_handles.constant_p(term1) && rkf_salient_descriptor.NIL == constant_handles.constant_p(term2)) {
            return (SubLObject)rkf_salient_descriptor.T;
        }
        return (SubLObject)rkf_salient_descriptor.NIL;
    }
    
    public static SubLObject declare_rkf_salient_descriptor_file() {
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.rkf_salient_descriptor", "rkf_salient_descriptor_formula_type_p", "RKF-SALIENT-DESCRIPTOR-FORMULA-TYPE-P", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.rkf_salient_descriptor", "rkf_salient_formulas", "RKF-SALIENT-FORMULAS", 2, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.rkf_salient_descriptor", "rkf_salient_requirements", "RKF-SALIENT-REQUIREMENTS", 1, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.rkf_salient_descriptor", "rkf_salient_strong_suggestions", "RKF-SALIENT-STRONG-SUGGESTIONS", 1, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.rkf_salient_descriptor", "rkf_salient_weak_suggestions", "RKF-SALIENT-WEAK-SUGGESTIONS", 1, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.rkf_salient_descriptor", "rkf_salient_neighbor_suggestions", "RKF-SALIENT-NEIGHBOR-SUGGESTIONS", 1, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.rkf_salient_descriptor", "rkf_salient_descriptor", "RKF-SALIENT-DESCRIPTOR", 1, 2, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.rkf_salient_descriptor", "rkf_salient_descriptor_parallel", "RKF-SALIENT-DESCRIPTOR-PARALLEL", 1, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.rkf_salient_descriptor", "rkf_requirements", "RKF-REQUIREMENTS", 1, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.rkf_salient_descriptor", "rkf_strong_suggestions", "RKF-STRONG-SUGGESTIONS", 1, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.rkf_salient_descriptor", "rkf_neighbor_suggestions", "RKF-NEIGHBOR-SUGGESTIONS", 1, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.rkf_salient_descriptor", "rkf_weak_suggestions", "RKF-WEAK-SUGGESTIONS", 1, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.rkf_salient_descriptor", "rkf_interaction_requirements", "RKF-INTERACTION-REQUIREMENTS", 1, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.rkf_salient_descriptor", "rkf_interaction_strong_suggestions", "RKF-INTERACTION-STRONG-SUGGESTIONS", 1, 1, false);
        SubLFiles.declareMacro("com.cyc.cycjava.cycl.rkf_salient_descriptor", "with_rkf_sd_memoization", "WITH-RKF-SD-MEMOIZATION");
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.rkf_salient_descriptor", "rkf_induced_salient_descriptor_query_sentences", "RKF-INDUCED-SALIENT-DESCRIPTOR-QUERY-SENTENCES", 1, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.rkf_salient_descriptor", "rkf_sd_justifications_from_basis_properties", "RKF-SD-JUSTIFICATIONS-FROM-BASIS-PROPERTIES", 3, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.rkf_salient_descriptor", "rkf_close_isas", "RKF-CLOSE-ISAS", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.rkf_salient_descriptor", "rkf_close_genls", "RKF-CLOSE-GENLS", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.rkf_salient_descriptor", "rkf_induced_salient_descriptor_meta_isas", "RKF-INDUCED-SALIENT-DESCRIPTOR-META-ISAS", 3, 2, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.rkf_salient_descriptor", "rkf_make_meta_isa_formula", "RKF-MAKE-META-ISA-FORMULA", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.rkf_salient_descriptor", "rkf_make_bin_pred_formula", "RKF-MAKE-BIN-PRED-FORMULA", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.rkf_salient_descriptor", "rkf_make_salient_descriptor_rule", "RKF-MAKE-SALIENT-DESCRIPTOR-RULE", 4, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.rkf_salient_descriptor", "rkf_salient_descriptor_meta_isa_type_violationP_internal", "RKF-SALIENT-DESCRIPTOR-META-ISA-TYPE-VIOLATION?-INTERNAL", 3, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.rkf_salient_descriptor", "rkf_salient_descriptor_meta_isa_type_violationP", "RKF-SALIENT-DESCRIPTOR-META-ISA-TYPE-VIOLATION?", 3, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.rkf_salient_descriptor", "rkf_salient_descriptor_type_specs_internal", "RKF-SALIENT-DESCRIPTOR-TYPE-SPECS-INTERNAL", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.rkf_salient_descriptor", "rkf_salient_descriptor_type_specs", "RKF-SALIENT-DESCRIPTOR-TYPE-SPECS", 2, 0, false);
        SubLFiles.declareMacro("com.cyc.cycjava.cycl.rkf_salient_descriptor", "reusing_rkf_sd_problem_store", "REUSING-RKF-SD-PROBLEM-STORE");
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.rkf_salient_descriptor", "rkf_sd_problem_store_okP", "RKF-SD-PROBLEM-STORE-OK?", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.rkf_salient_descriptor", "rkf_sd_problem_store_checkpoint_currentP", "RKF-SD-PROBLEM-STORE-CHECKPOINT-CURRENT?", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.rkf_salient_descriptor", "rkf_sd_problem_store_checkpoint", "RKF-SD-PROBLEM-STORE-CHECKPOINT", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.rkf_salient_descriptor", "rkf_sd_find_or_make_problem_store", "RKF-SD-FIND-OR-MAKE-PROBLEM-STORE", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.rkf_salient_descriptor", "rkf_sd_make_problem_store", "RKF-SD-MAKE-PROBLEM-STORE", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.rkf_salient_descriptor", "rkf_sd_free_problem_store", "RKF-SD-FREE-PROBLEM-STORE", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.rkf_salient_descriptor", "rkf_induced_salient_descriptor_common_properties", "RKF-INDUCED-SALIENT-DESCRIPTOR-COMMON-PROPERTIES", 2, 2, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.rkf_salient_descriptor", "rkf_induced_salient_descriptor_common_properties_int", "RKF-INDUCED-SALIENT-DESCRIPTOR-COMMON-PROPERTIES-INT", 3, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.rkf_salient_descriptor", "rkf_induced_salient_descriptor_bin_pred_properties", "RKF-INDUCED-SALIENT-DESCRIPTOR-BIN-PRED-PROPERTIES", 4, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.rkf_salient_descriptor", "rkf_induced_salient_descriptor_bin_pred_info", "RKF-INDUCED-SALIENT-DESCRIPTOR-BIN-PRED-INFO", 4, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.rkf_salient_descriptor", "rkf_induced_salient_descriptor_meta_isa_properties", "RKF-INDUCED-SALIENT-DESCRIPTOR-META-ISA-PROPERTIES", 3, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.rkf_salient_descriptor", "rkf_known_meta_isas_from_basis_properties", "RKF-KNOWN-META-ISAS-FROM-BASIS-PROPERTIES", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.rkf_salient_descriptor", "rkf_known_meta_isas_from_basis_property", "RKF-KNOWN-META-ISAS-FROM-BASIS-PROPERTY", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.rkf_salient_descriptor", "rkf_induced_salient_descriptor_meta_isa_info", "RKF-INDUCED-SALIENT-DESCRIPTOR-META-ISA-INFO", 3, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.rkf_salient_descriptor", "rkf_sd_deconstruct_basis_property", "RKF-SD-DECONSTRUCT-BASIS-PROPERTY", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.rkf_salient_descriptor", "rkf_sd_construct_basis_property", "RKF-SD-CONSTRUCT-BASIS-PROPERTY", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.rkf_salient_descriptor", "rkf_sd_properties_from_bin_pred_info", "RKF-SD-PROPERTIES-FROM-BIN-PRED-INFO", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.rkf_salient_descriptor", "rkf_sd_properties_from_meta_isa_info", "RKF-SD-PROPERTIES-FROM-META-ISA-INFO", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.rkf_salient_descriptor", "rkf_sd_make_superior_basis_property", "RKF-SD-MAKE-SUPERIOR-BASIS-PROPERTY", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.rkf_salient_descriptor", "rkf_sd_induction_basis_properties", "RKF-SD-INDUCTION-BASIS-PROPERTIES", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.rkf_salient_descriptor", "rkf_induced_salient_descriptor_superior_properties", "RKF-INDUCED-SALIENT-DESCRIPTOR-SUPERIOR-PROPERTIES", 3, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.rkf_salient_descriptor", "rkf_induced_salient_descriptor_superiors", "RKF-INDUCED-SALIENT-DESCRIPTOR-SUPERIORS", 4, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.rkf_salient_descriptor", "rkf_induced_salient_descriptor_slots", "RKF-INDUCED-SALIENT-DESCRIPTOR-SLOTS", 4, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.rkf_salient_descriptor", "rkf_salient_descriptor_specP", "RKF-SALIENT-DESCRIPTOR-SPEC?", 2, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.rkf_salient_descriptor", "rkf_salient_descriptor_genlP_internal", "RKF-SALIENT-DESCRIPTOR-GENL?-INTERNAL", 3, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.rkf_salient_descriptor", "rkf_salient_descriptor_genlP", "RKF-SALIENT-DESCRIPTOR-GENL?", 3, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.rkf_salient_descriptor", "rkf_salient_descriptor_rule_from_spec", "RKF-SALIENT-DESCRIPTOR-RULE-FROM-SPEC", 1, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.rkf_salient_descriptor", "rkf_rule_spec_supports", "RKF-RULE-SPEC-SUPPORTS", 3, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.rkf_salient_descriptor", "rkf_justification_sentence_from_rule_spec", "RKF-JUSTIFICATION-SENTENCE-FROM-RULE-SPEC", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.rkf_salient_descriptor", "rkf_induced_rule_support", "RKF-INDUCED-RULE-SUPPORT", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.rkf_salient_descriptor", "rkf_salient_descriptor_rule_spec_p", "RKF-SALIENT-DESCRIPTOR-RULE-SPEC-P", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.rkf_salient_descriptor", "new_rkf_salient_descriptor_rule_spec", "NEW-RKF-SALIENT-DESCRIPTOR-RULE-SPEC", 4, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.rkf_salient_descriptor", "rkf_salient_descriptor_rule_spec_slot", "RKF-SALIENT-DESCRIPTOR-RULE-SPEC-SLOT", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.rkf_salient_descriptor", "rkf_sd_binary_preds_inference_properties", "RKF-SD-BINARY-PREDS-INFERENCE-PROPERTIES", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.rkf_salient_descriptor", "rkf_collection_promising_for_binary_pred_inductionP", "RKF-COLLECTION-PROMISING-FOR-BINARY-PRED-INDUCTION?", 2, 2, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.rkf_salient_descriptor", "rkf_induced_suggestion_pred_of_strength", "RKF-INDUCED-SUGGESTION-PRED-OF-STRENGTH", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.rkf_salient_descriptor", "rkf_induced_salient_descriptor_binary_preds", "RKF-INDUCED-SALIENT-DESCRIPTOR-BINARY-PREDS", 3, 3, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.rkf_salient_descriptor", "rkf_noninduced_salient_descriptor_binary_preds", "RKF-NONINDUCED-SALIENT-DESCRIPTOR-BINARY-PREDS", 3, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.rkf_salient_descriptor", "rkf_sd_never_use_binary_pred_p", "RKF-SD-NEVER-USE-BINARY-PRED-P", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.rkf_salient_descriptor", "rkf_salient_descriptor_get_inferiors_internal", "RKF-SALIENT-DESCRIPTOR-GET-INFERIORS-INTERNAL", 3, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.rkf_salient_descriptor", "rkf_salient_descriptor_get_inferiors", "RKF-SALIENT-DESCRIPTOR-GET-INFERIORS", 3, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.rkf_salient_descriptor", "rkf_salient_descriptor_binary_pred_type_violationP_internal", "RKF-SALIENT-DESCRIPTOR-BINARY-PRED-TYPE-VIOLATION?-INTERNAL", 3, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.rkf_salient_descriptor", "rkf_salient_descriptor_binary_pred_type_violationP", "RKF-SALIENT-DESCRIPTOR-BINARY-PRED-TYPE-VIOLATION?", 3, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.rkf_salient_descriptor", "rkf_term_binary_preds_internal", "RKF-TERM-BINARY-PREDS-INTERNAL", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.rkf_salient_descriptor", "rkf_term_binary_preds", "RKF-TERM-BINARY-PREDS", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.rkf_salient_descriptor", "rkf_term_meta_isas", "RKF-TERM-META-ISAS", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.rkf_salient_descriptor", "rkf_term_all_meta_isas_internal", "RKF-TERM-ALL-META-ISAS-INTERNAL", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.rkf_salient_descriptor", "rkf_term_all_meta_isas", "RKF-TERM-ALL-META-ISAS", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.rkf_salient_descriptor", "rkf_rule_cnfs_for_term", "RKF-RULE-CNFS-FOR-TERM", 2, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.rkf_salient_descriptor", "rkf_sd_el_cnf_of_rule", "RKF-SD-EL-CNF-OF-RULE", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.rkf_salient_descriptor", "rkf_sd_el_cnf_of_hl_cnf", "RKF-SD-EL-CNF-OF-HL-CNF", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.rkf_salient_descriptor", "rkf_sd_el_wffP_internal", "RKF-SD-EL-WFF?-INTERNAL", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.rkf_salient_descriptor", "rkf_sd_el_wffP", "RKF-SD-EL-WFF?", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.rkf_salient_descriptor", "rkf_partial_bindings_for_term", "RKF-PARTIAL-BINDINGS-FOR-TERM", 2, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.rkf_salient_descriptor", "rkf_partial_bindings_for_term_var", "RKF-PARTIAL-BINDINGS-FOR-TERM-VAR", 4, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.rkf_salient_descriptor", "rkf_partial_bindings_for_formula", "RKF-PARTIAL-BINDINGS-FOR-FORMULA", 2, 3, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.rkf_salient_descriptor", "rkf_sd_constraint_table", "RKF-SD-CONSTRAINT-TABLE", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.rkf_salient_descriptor", "rkf_sd_rejected", "RKF-SD-REJECTED", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.rkf_salient_descriptor", "rkf_sd_use_negation_by_failureP", "RKF-SD-USE-NEGATION-BY-FAILURE?", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.rkf_salient_descriptor", "rkf_sd_known_problem_store_properties", "RKF-SD-KNOWN-PROBLEM-STORE-PROPERTIES", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.rkf_salient_descriptor", "rkf_sd_known_static_inference_properties", "RKF-SD-KNOWN-STATIC-INFERENCE-PROPERTIES", 1, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.rkf_salient_descriptor", "rkf_sd_known_dynamic_inference_properties", "RKF-SD-KNOWN-DYNAMIC-INFERENCE-PROPERTIES", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.rkf_salient_descriptor", "rkf_sd_known_internal", "RKF-SD-KNOWN-INTERNAL", 2, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.rkf_salient_descriptor", "rkf_sd_known", "RKF-SD-KNOWN", 2, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.rkf_salient_descriptor", "rkf_sd_existentially_unbind", "RKF-SD-EXISTENTIALLY-UNBIND", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.rkf_salient_descriptor", "rkf_sd_possibly_existentially_unbind", "RKF-SD-POSSIBLY-EXISTENTIALLY-UNBIND", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.rkf_salient_descriptor", "rkf_sd_known_some_good_binding_list_for_query_amongP", "RKF-SD-KNOWN-SOME-GOOD-BINDING-LIST-FOR-QUERY-AMONG?", 4, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.rkf_salient_descriptor", "rkf_sd_known_good_binding_list_for_queryP", "RKF-SD-KNOWN-GOOD-BINDING-LIST-FOR-QUERY?", 4, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.rkf_salient_descriptor", "rkf_sd_get_conjunct_bindings_internal", "RKF-SD-GET-CONJUNCT-BINDINGS-INTERNAL", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.rkf_salient_descriptor", "rkf_sd_get_conjunct_bindings", "RKF-SD-GET-CONJUNCT-BINDINGS", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.rkf_salient_descriptor", "rkf_sd_hl_for_el_vars_in_formula", "RKF-SD-HL-FOR-EL-VARS-IN-FORMULA", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.rkf_salient_descriptor", "rkf_potential_rule_for_termP", "RKF-POTENTIAL-RULE-FOR-TERM?", 2, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.rkf_salient_descriptor", "rkf_sd_asent_unify", "RKF-SD-ASENT-UNIFY", 2, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.rkf_salient_descriptor", "rkf_unsatisfied_cnf_subbed_rule_formula", "RKF-UNSATISFIED-CNF-SUBBED-RULE-FORMULA", 4, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.rkf_salient_descriptor", "rkf_unsatisfied_cnf_rejectP", "RKF-UNSATISFIED-CNF-REJECT?", 3, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.rkf_salient_descriptor", "rkf_sd_neg_lits_knownP", "RKF-SD-NEG-LITS-KNOWN?", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.rkf_salient_descriptor", "rkf_sd_el_fully_bound_p", "RKF-SD-EL-FULLY-BOUND-P", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.rkf_salient_descriptor", "rkf_make_el_cnf", "RKF-MAKE-EL-CNF", 3, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.rkf_salient_descriptor", "rkf_make_el_conjunction", "RKF-MAKE-EL-CONJUNCTION", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.rkf_salient_descriptor", "rkf_rule_partially_satisfied_by_gaf_litP", "RKF-RULE-PARTIALLY-SATISFIED-BY-GAF-LIT?", 3, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.rkf_salient_descriptor", "rkf_find_unresolved_lits", "RKF-FIND-UNRESOLVED-LITS", 4, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.rkf_salient_descriptor", "rkf_subst_el_bindings", "RKF-SUBST-EL-BINDINGS", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.rkf_salient_descriptor", "rkf_sd_existentially_bind_vars", "RKF-SD-EXISTENTIALLY-BIND-VARS", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.rkf_salient_descriptor", "rkf_sd_check_lit_internal", "RKF-SD-CHECK-LIT-INTERNAL", 3, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.rkf_salient_descriptor", "rkf_sd_check_lit", "RKF-SD-CHECK-LIT", 3, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.rkf_salient_descriptor", "rkf_sd_formulas_static_inference_properties", "RKF-SD-FORMULAS-STATIC-INFERENCE-PROPERTIES", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.rkf_salient_descriptor", "rkf_sd_formulas_dynamic_inference_properties", "RKF-SD-FORMULAS-DYNAMIC-INFERENCE-PROPERTIES", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.rkf_salient_descriptor", "rkf_salient_descriptor_formulas", "RKF-SALIENT-DESCRIPTOR-FORMULAS", 2, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.rkf_salient_descriptor", "rkf_salient_descriptor_formulas_inference", "RKF-SALIENT-DESCRIPTOR-FORMULAS-INFERENCE", 4, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.rkf_salient_descriptor", "rkf_salient_descriptor_formulas_one_batch_continue_inference", "RKF-SALIENT-DESCRIPTOR-FORMULAS-ONE-BATCH-CONTINUE-INFERENCE", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.rkf_salient_descriptor", "rkf_salient_descriptor_formulas_one_batch", "RKF-SALIENT-DESCRIPTOR-FORMULAS-ONE-BATCH", 4, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.rkf_salient_descriptor", "rkf_irrelevant_sd_formulaP", "RKF-IRRELEVANT-SD-FORMULA?", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.rkf_salient_descriptor", "rkf_sd_remove_nonassertible_conjuncts", "RKF-SD-REMOVE-NONASSERTIBLE-CONJUNCTS", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.rkf_salient_descriptor", "initialize_rkf_deprecated_rules", "INITIALIZE-RKF-DEPRECATED-RULES", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.rkf_salient_descriptor", "rkf_deprecate_rule_internal", "RKF-DEPRECATE-RULE-INTERNAL", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.rkf_salient_descriptor", "rkf_salient_descriptor_deprecate_rule", "RKF-SALIENT-DESCRIPTOR-DEPRECATE-RULE", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.rkf_salient_descriptor", "deprecate_salient_descriptor_rule", "DEPRECATE-SALIENT-DESCRIPTOR-RULE", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.rkf_salient_descriptor", "undeprecate_salient_descriptor_rule", "UNDEPRECATE-SALIENT-DESCRIPTOR-RULE", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.rkf_salient_descriptor", "rkf_deprecated_sd_ruleP", "RKF-DEPRECATED-SD-RULE?", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.rkf_salient_descriptor", "rkf_bad_sd_ruleP", "RKF-BAD-SD-RULE?", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.rkf_salient_descriptor", "rkf_sd_arg_constraint_ruleP", "RKF-SD-ARG-CONSTRAINT-RULE?", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.rkf_salient_descriptor", "rkf_sd_tva_equivalent_ruleP", "RKF-SD-TVA-EQUIVALENT-RULE?", 1, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.rkf_salient_descriptor", "rkf_sd_type_based_strengthening_ruleP", "RKF-SD-TYPE-BASED-STRENGTHENING-RULE?", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.rkf_salient_descriptor", "rkf_sort_salient_formulas", "RKF-SORT-SALIENT-FORMULAS", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.rkf_salient_descriptor", "rkf_sd_clear", "RKF-SD-CLEAR", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.rkf_salient_descriptor", "rkf_sd_present", "RKF-SD-PRESENT", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.rkf_salient_descriptor", "rkf_sd_lookup", "RKF-SD-LOOKUP", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.rkf_salient_descriptor", "rkf_sd_update", "RKF-SD-UPDATE", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.rkf_salient_descriptor", "rkf_sd_ignore_clear", "RKF-SD-IGNORE-CLEAR", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.rkf_salient_descriptor", "rkf_sd_ignore_present", "RKF-SD-IGNORE-PRESENT", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.rkf_salient_descriptor", "rkf_sd_ignore_lookup", "RKF-SD-IGNORE-LOOKUP", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.rkf_salient_descriptor", "rkf_sd_ignore_update", "RKF-SD-IGNORE-UPDATE", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.rkf_salient_descriptor", "rkf_salient_descriptor_get_subprompts", "RKF-SALIENT-DESCRIPTOR-GET-SUBPROMPTS", 4, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.rkf_salient_descriptor", "rkf_salient_descriptor_single_entry_varP", "RKF-SALIENT-DESCRIPTOR-SINGLE-ENTRY-VAR?", 3, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.rkf_salient_descriptor", "rkf_sd_single_entry_var_top_levelP", "RKF-SD-SINGLE-ENTRY-VAR-TOP-LEVEL?", 3, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.rkf_salient_descriptor", "rkf_salient_property_sentence_from_justification", "RKF-SALIENT-PROPERTY-SENTENCE-FROM-JUSTIFICATION", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.rkf_salient_descriptor", "rkf_sd_conjoin", "RKF-SD-CONJOIN", 1, 2, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.rkf_salient_descriptor", "rkf_sd_uniquify_conjuncts", "RKF-SD-UNIQUIFY-CONJUNCTS", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.rkf_salient_descriptor", "rkf_salient_descriptor_subprompts_p", "RKF-SALIENT-DESCRIPTOR-SUBPROMPTS-P", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.rkf_salient_descriptor", "rkf_salient_descriptor_subprompt_p", "RKF-SALIENT-DESCRIPTOR-SUBPROMPT-P", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.rkf_salient_descriptor", "rkf_salient_descriptor_subprompt_assert_sentence", "RKF-SALIENT-DESCRIPTOR-SUBPROMPT-ASSERT-SENTENCE", 1, 2, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.rkf_salient_descriptor", "rkf_salient_descriptor_subprompt_var", "RKF-SALIENT-DESCRIPTOR-SUBPROMPT-VAR", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.rkf_salient_descriptor", "rkf_salient_descriptor_subprompt_known_check_sentence", "RKF-SALIENT-DESCRIPTOR-SUBPROMPT-KNOWN-CHECK-SENTENCE", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.rkf_salient_descriptor", "rkf_salient_descriptor_subprompt_constraint_sentence", "RKF-SALIENT-DESCRIPTOR-SUBPROMPT-CONSTRAINT-SENTENCE", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.rkf_salient_descriptor", "rkf_salient_descriptor_subprompt_examples", "RKF-SALIENT-DESCRIPTOR-SUBPROMPT-EXAMPLES", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.rkf_salient_descriptor", "rkf_salient_descriptor_subprompt_set_examples", "RKF-SALIENT-DESCRIPTOR-SUBPROMPT-SET-EXAMPLES", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.rkf_salient_descriptor", "rkf_salient_descriptor_subprompt_type", "RKF-SALIENT-DESCRIPTOR-SUBPROMPT-TYPE", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.rkf_salient_descriptor", "rkf_salient_descriptor_subprompt_from_formula", "RKF-SALIENT-DESCRIPTOR-SUBPROMPT-FROM-FORMULA", 2, 2, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.rkf_salient_descriptor", "rkf_salient_descriptor_followups", "RKF-SALIENT-DESCRIPTOR-FOLLOWUPS", 2, 2, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.rkf_salient_descriptor", "rkf_salient_descriptor_followup_for_variable", "RKF-SALIENT-DESCRIPTOR-FOLLOWUP-FOR-VARIABLE", 5, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.rkf_salient_descriptor", "rkf_sd_examples_internal", "RKF-SD-EXAMPLES-INTERNAL", 4, 4, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.rkf_salient_descriptor", "rkf_sd_examples", "RKF-SD-EXAMPLES", 4, 4, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.rkf_salient_descriptor", "rkf_sd_precedent_query_sentence", "RKF-SD-PRECEDENT-QUERY-SENTENCE", 3, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.rkf_salient_descriptor", "rkf_sd_add_salient_property", "RKF-SD-ADD-SALIENT-PROPERTY", 3, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.rkf_salient_descriptor", "rkf_sd_add_known_sentence", "RKF-SD-ADD-KNOWN-SENTENCE", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.rkf_salient_descriptor", "rkf_sd_remove_constraints", "RKF-SD-REMOVE-CONSTRAINTS", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.rkf_salient_descriptor", "rkf_salient_descriptor_complete_coll_bindings", "RKF-SALIENT-DESCRIPTOR-COMPLETE-COLL-BINDINGS", 3, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.rkf_salient_descriptor", "rkf_sd_complete_coll_bindings_okP", "RKF-SD-COMPLETE-COLL-BINDINGS-OK?", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.rkf_salient_descriptor", "rkf_salient_descriptor_small_set_bindings", "RKF-SALIENT-DESCRIPTOR-SMALL-SET-BINDINGS", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.rkf_salient_descriptor", "rkf_sd_small_set_bindings_okP", "RKF-SD-SMALL-SET-BINDINGS-OK?", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.rkf_salient_descriptor", "rkf_salient_descriptor_bindings", "RKF-SALIENT-DESCRIPTOR-BINDINGS", 4, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.rkf_salient_descriptor", "rkf_salient_descriptor_assert_formula", "RKF-SALIENT-DESCRIPTOR-ASSERT-FORMULA", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.rkf_salient_descriptor", "rkf_salient_descriptor_not_assertible_sentenceP", "RKF-SALIENT-DESCRIPTOR-NOT-ASSERTIBLE-SENTENCE?", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.rkf_salient_descriptor", "rkf_generate_interaction_example_instances_formula", "RKF-GENERATE-INTERACTION-EXAMPLE-INSTANCES-FORMULA", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.rkf_salient_descriptor", "rkf_example_instances_backchain_level", "RKF-EXAMPLE-INSTANCES-BACKCHAIN-LEVEL", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.rkf_salient_descriptor", "rkf_example_instances", "RKF-EXAMPLE-INSTANCES", 6, 3, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.rkf_salient_descriptor", "rkf_sd_examples_adjusted_number_constraint", "RKF-SD-EXAMPLES-ADJUSTED-NUMBER-CONSTRAINT", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.rkf_salient_descriptor", "rkf_asserted_example_instances", "RKF-ASSERTED-EXAMPLE-INSTANCES", 6, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.rkf_salient_descriptor", "rkf_local_example_instances", "RKF-LOCAL-EXAMPLE-INSTANCES", 7, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.rkf_salient_descriptor", "rkf_example_types_include_type_p", "RKF-EXAMPLE-TYPES-INCLUDE-TYPE-P", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.rkf_salient_descriptor", "rkf_add_examples", "RKF-ADD-EXAMPLES", 6, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.rkf_salient_descriptor", "rkf_example_in_examplesP", "RKF-EXAMPLE-IN-EXAMPLES?", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.rkf_salient_descriptor", "rkf_example_not_known_falseP", "RKF-EXAMPLE-NOT-KNOWN-FALSE?", 4, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.rkf_salient_descriptor", "rkf_example_wffP", "RKF-EXAMPLE-WFF?", 4, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.rkf_salient_descriptor", "rkf_example_wffP_int_internal", "RKF-EXAMPLE-WFF?-INT-INTERNAL", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.rkf_salient_descriptor", "rkf_example_wffP_int", "RKF-EXAMPLE-WFF?-INT", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.rkf_salient_descriptor", "rkf_example_instances_ask_properties", "RKF-EXAMPLE-INSTANCES-ASK-PROPERTIES", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.rkf_salient_descriptor", "rkf_example_instances_ask", "RKF-EXAMPLE-INSTANCES-ASK", 7, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.rkf_salient_descriptor", "rkf_bad_exampleP", "RKF-BAD-EXAMPLE?", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.rkf_salient_descriptor", "rkf_better_exampleP", "RKF-BETTER-EXAMPLE?", 2, 0, false);
        return (SubLObject)rkf_salient_descriptor.NIL;
    }
    
    public static SubLObject init_rkf_salient_descriptor_file() {
        rkf_salient_descriptor.$rkf_salient_formula_types$ = SubLFiles.deflexical("*RKF-SALIENT-FORMULA-TYPES*", (SubLObject)rkf_salient_descriptor.$list0);
        rkf_salient_descriptor.$rkf_salient_descriptor_number_cutoff$ = SubLFiles.defparameter("*RKF-SALIENT-DESCRIPTOR-NUMBER-CUTOFF*", (SubLObject)rkf_salient_descriptor.ONE_INTEGER);
        rkf_salient_descriptor.$rkf_salient_descriptor_time_cutoff$ = SubLFiles.defparameter("*RKF-SALIENT-DESCRIPTOR-TIME-CUTOFF*", (SubLObject)rkf_salient_descriptor.$int15$90);
        rkf_salient_descriptor.$rkf_salient_descriptor_transformation_cutoff$ = SubLFiles.defparameter("*RKF-SALIENT-DESCRIPTOR-TRANSFORMATION-CUTOFF*", (SubLObject)rkf_salient_descriptor.ONE_INTEGER);
        rkf_salient_descriptor.$rkf_sd_exclude_known_promptsP$ = SubLFiles.defparameter("*RKF-SD-EXCLUDE-KNOWN-PROMPTS?*", (SubLObject)rkf_salient_descriptor.T);
        rkf_salient_descriptor.$rkf_sd_problem_store$ = SubLFiles.defparameter("*RKF-SD-PROBLEM-STORE*", (SubLObject)rkf_salient_descriptor.NIL);
        rkf_salient_descriptor.$rkf_sd_problem_store_checkpoints$ = SubLFiles.deflexical("*RKF-SD-PROBLEM-STORE-CHECKPOINTS*", dictionary.new_dictionary((SubLObject)rkf_salient_descriptor.UNPROVIDED, (SubLObject)rkf_salient_descriptor.UNPROVIDED));
        rkf_salient_descriptor.$rkf_sd_reuse_problem_storeP$ = SubLFiles.defparameter("*RKF-SD-REUSE-PROBLEM-STORE?*", (SubLObject)rkf_salient_descriptor.T);
        rkf_salient_descriptor.$rkf_sd_induced_superiors_cutoff$ = SubLFiles.defparameter("*RKF-SD-INDUCED-SUPERIORS-CUTOFF*", (SubLObject)rkf_salient_descriptor.NIL);
        rkf_salient_descriptor.$rkf_sd_known_time_cutoff$ = SubLFiles.defparameter("*RKF-SD-KNOWN-TIME-CUTOFF*", (SubLObject)rkf_salient_descriptor.TEN_INTEGER);
        rkf_salient_descriptor.$rkf_sd_known_max_depth_max$ = SubLFiles.defparameter("*RKF-SD-KNOWN-MAX-DEPTH-MAX*", (SubLObject)rkf_salient_descriptor.ONE_INTEGER);
        rkf_salient_descriptor.$rkf_sd_known_destroy_inferencesP$ = SubLFiles.defparameter("*RKF-SD-KNOWN-DESTROY-INFERENCES?*", (SubLObject)rkf_salient_descriptor.T);
        rkf_salient_descriptor.$rkf_sd_formulas_max_depth_max$ = SubLFiles.defparameter("*RKF-SD-FORMULAS-MAX-DEPTH-MAX*", (SubLObject)rkf_salient_descriptor.ONE_INTEGER);
        rkf_salient_descriptor.$cache_salient_descriptor_ask_resultsP$ = SubLFiles.defparameter("*CACHE-SALIENT-DESCRIPTOR-ASK-RESULTS?*", (SubLObject)rkf_salient_descriptor.NIL);
        rkf_salient_descriptor.$rkf_deprecated_rules$ = SubLFiles.deflexical("*RKF-DEPRECATED-RULES*", (SubLObject)rkf_salient_descriptor.$kw186$UNINITIALIZED);
        rkf_salient_descriptor.$rkf_sd_rule_neg_lit_max$ = SubLFiles.defparameter("*RKF-SD-RULE-NEG-LIT-MAX*", (SubLObject)rkf_salient_descriptor.SIX_INTEGER);
        rkf_salient_descriptor.$rkf_sd_rule_pos_lit_max$ = SubLFiles.defparameter("*RKF-SD-RULE-POS-LIT-MAX*", (SubLObject)rkf_salient_descriptor.ONE_INTEGER);
        rkf_salient_descriptor.$rkf_sd_rule_neg_lit_min$ = SubLFiles.defparameter("*RKF-SD-RULE-NEG-LIT-MIN*", (SubLObject)rkf_salient_descriptor.TWO_INTEGER);
        rkf_salient_descriptor.$rkf_sd_rule_pos_lit_min$ = SubLFiles.defparameter("*RKF-SD-RULE-POS-LIT-MIN*", (SubLObject)rkf_salient_descriptor.ONE_INTEGER);
        rkf_salient_descriptor.$rkf_salient_descriptor_cache$ = SubLFiles.deflexical("*RKF-SALIENT-DESCRIPTOR-CACHE*", maybeDefault((SubLObject)rkf_salient_descriptor.$sym202$_RKF_SALIENT_DESCRIPTOR_CACHE_, rkf_salient_descriptor.$rkf_salient_descriptor_cache$, ()->(Hashtables.make_hash_table((SubLObject)rkf_salient_descriptor.TEN_INTEGER, Symbols.symbol_function((SubLObject)rkf_salient_descriptor.EQUAL), (SubLObject)rkf_salient_descriptor.UNPROVIDED))));
        rkf_salient_descriptor.$rkf_salient_descriptor_cache_lock$ = SubLFiles.deflexical("*RKF-SALIENT-DESCRIPTOR-CACHE-LOCK*", Locks.make_lock((SubLObject)rkf_salient_descriptor.$str203$RKF_Salient_Descriptor_Cache_Lock));
        rkf_salient_descriptor.$rkf_salient_descriptor_ignore_cache$ = SubLFiles.deflexical("*RKF-SALIENT-DESCRIPTOR-IGNORE-CACHE*", maybeDefault((SubLObject)rkf_salient_descriptor.$sym204$_RKF_SALIENT_DESCRIPTOR_IGNORE_CACHE_, rkf_salient_descriptor.$rkf_salient_descriptor_ignore_cache$, ()->(Hashtables.make_hash_table((SubLObject)rkf_salient_descriptor.TEN_INTEGER, Symbols.symbol_function((SubLObject)rkf_salient_descriptor.EQUAL), (SubLObject)rkf_salient_descriptor.UNPROVIDED))));
        rkf_salient_descriptor.$rkf_salient_descriptor_ignore_cache_lock$ = SubLFiles.deflexical("*RKF-SALIENT-DESCRIPTOR-IGNORE-CACHE-LOCK*", Locks.make_lock((SubLObject)rkf_salient_descriptor.$str203$RKF_Salient_Descriptor_Cache_Lock));
        rkf_salient_descriptor.$rkf_choice_count_cutoff$ = SubLFiles.defparameter("*RKF-CHOICE-COUNT-CUTOFF*", (SubLObject)rkf_salient_descriptor.TEN_INTEGER);
        rkf_salient_descriptor.$rkf_examples_to_show$ = SubLFiles.defparameter("*RKF-EXAMPLES-TO-SHOW*", (SubLObject)rkf_salient_descriptor.FIVE_INTEGER);
        rkf_salient_descriptor.$rkf_example_instances_backchain_level$ = SubLFiles.defparameter("*RKF-EXAMPLE-INSTANCES-BACKCHAIN-LEVEL*", (SubLObject)rkf_salient_descriptor.ZERO_INTEGER);
        rkf_salient_descriptor.$rkf_example_instances_time_cutoff$ = SubLFiles.defparameter("*RKF-EXAMPLE-INSTANCES-TIME-CUTOFF*", (SubLObject)rkf_salient_descriptor.FIVE_INTEGER);
        rkf_salient_descriptor.$rkf_example_instances_wff_checkP$ = SubLFiles.defvar("*RKF-EXAMPLE-INSTANCES-WFF-CHECK?*", (SubLObject)rkf_salient_descriptor.T);
        rkf_salient_descriptor.$rkf_example_not_known_false_time_cutoff$ = SubLFiles.defparameter("*RKF-EXAMPLE-NOT-KNOWN-FALSE-TIME-CUTOFF*", (SubLObject)rkf_salient_descriptor.NIL);
        return (SubLObject)rkf_salient_descriptor.NIL;
    }
    
    public static SubLObject setup_rkf_salient_descriptor_file() {
        memoization_state.note_memoized_function((SubLObject)rkf_salient_descriptor.$sym26$RKF_SALIENT_DESCRIPTOR_META_ISA_TYPE_VIOLATION_);
        memoization_state.note_memoized_function((SubLObject)rkf_salient_descriptor.$sym27$RKF_SALIENT_DESCRIPTOR_TYPE_SPECS);
        memoization_state.note_memoized_function((SubLObject)rkf_salient_descriptor.$sym92$RKF_SALIENT_DESCRIPTOR_GENL_);
        memoization_state.note_memoized_function((SubLObject)rkf_salient_descriptor.$sym137$RKF_SALIENT_DESCRIPTOR_GET_INFERIORS);
        memoization_state.note_memoized_function((SubLObject)rkf_salient_descriptor.$sym141$RKF_SALIENT_DESCRIPTOR_BINARY_PRED_TYPE_VIOLATION_);
        memoization_state.note_memoized_function((SubLObject)rkf_salient_descriptor.$sym143$RKF_TERM_BINARY_PREDS);
        memoization_state.note_memoized_function((SubLObject)rkf_salient_descriptor.$sym146$RKF_TERM_ALL_META_ISAS);
        memoization_state.note_memoized_function((SubLObject)rkf_salient_descriptor.$sym149$RKF_SD_EL_WFF_);
        memoization_state.note_memoized_function((SubLObject)rkf_salient_descriptor.$sym162$RKF_SD_KNOWN);
        memoization_state.note_memoized_function((SubLObject)rkf_salient_descriptor.$sym167$RKF_SD_GET_CONJUNCT_BINDINGS);
        memoization_state.note_memoized_function((SubLObject)rkf_salient_descriptor.$sym176$RKF_SD_CHECK_LIT);
        utilities_macros.register_kb_function((SubLObject)rkf_salient_descriptor.$sym191$DEPRECATE_SALIENT_DESCRIPTOR_RULE);
        utilities_macros.register_kb_function((SubLObject)rkf_salient_descriptor.$sym192$UNDEPRECATE_SALIENT_DESCRIPTOR_RULE);
        subl_macro_promotions.declare_defglobal((SubLObject)rkf_salient_descriptor.$sym202$_RKF_SALIENT_DESCRIPTOR_CACHE_);
        subl_macro_promotions.declare_defglobal((SubLObject)rkf_salient_descriptor.$sym204$_RKF_SALIENT_DESCRIPTOR_IGNORE_CACHE_);
        memoization_state.note_memoized_function((SubLObject)rkf_salient_descriptor.$sym222$RKF_SD_EXAMPLES);
        memoization_state.note_memoized_function((SubLObject)rkf_salient_descriptor.$sym243$RKF_EXAMPLE_WFF__INT);
        return (SubLObject)rkf_salient_descriptor.NIL;
    }
    
    @Override
	public void declareFunctions() {
        declare_rkf_salient_descriptor_file();
    }
    
    @Override
	public void initializeVariables() {
        init_rkf_salient_descriptor_file();
    }
    
    @Override
	public void runTopLevelForms() {
        setup_rkf_salient_descriptor_file();
    }
    
    static {
        me = (SubLFile)new rkf_salient_descriptor();
        rkf_salient_descriptor.$rkf_salient_formula_types$ = null;
        rkf_salient_descriptor.$rkf_salient_descriptor_number_cutoff$ = null;
        rkf_salient_descriptor.$rkf_salient_descriptor_time_cutoff$ = null;
        rkf_salient_descriptor.$rkf_salient_descriptor_transformation_cutoff$ = null;
        rkf_salient_descriptor.$rkf_sd_exclude_known_promptsP$ = null;
        rkf_salient_descriptor.$rkf_sd_problem_store$ = null;
        rkf_salient_descriptor.$rkf_sd_problem_store_checkpoints$ = null;
        rkf_salient_descriptor.$rkf_sd_reuse_problem_storeP$ = null;
        rkf_salient_descriptor.$rkf_sd_induced_superiors_cutoff$ = null;
        rkf_salient_descriptor.$rkf_sd_known_time_cutoff$ = null;
        rkf_salient_descriptor.$rkf_sd_known_max_depth_max$ = null;
        rkf_salient_descriptor.$rkf_sd_known_destroy_inferencesP$ = null;
        rkf_salient_descriptor.$rkf_sd_formulas_max_depth_max$ = null;
        rkf_salient_descriptor.$cache_salient_descriptor_ask_resultsP$ = null;
        rkf_salient_descriptor.$rkf_deprecated_rules$ = null;
        rkf_salient_descriptor.$rkf_sd_rule_neg_lit_max$ = null;
        rkf_salient_descriptor.$rkf_sd_rule_pos_lit_max$ = null;
        rkf_salient_descriptor.$rkf_sd_rule_neg_lit_min$ = null;
        rkf_salient_descriptor.$rkf_sd_rule_pos_lit_min$ = null;
        rkf_salient_descriptor.$rkf_salient_descriptor_cache$ = null;
        rkf_salient_descriptor.$rkf_salient_descriptor_cache_lock$ = null;
        rkf_salient_descriptor.$rkf_salient_descriptor_ignore_cache$ = null;
        rkf_salient_descriptor.$rkf_salient_descriptor_ignore_cache_lock$ = null;
        rkf_salient_descriptor.$rkf_choice_count_cutoff$ = null;
        rkf_salient_descriptor.$rkf_examples_to_show$ = null;
        rkf_salient_descriptor.$rkf_example_instances_backchain_level$ = null;
        rkf_salient_descriptor.$rkf_example_instances_time_cutoff$ = null;
        rkf_salient_descriptor.$rkf_example_instances_wff_checkP$ = null;
        rkf_salient_descriptor.$rkf_example_not_known_false_time_cutoff$ = null;
        $list0 = ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("REQUIREMENT"), (SubLObject)SubLObjectFactory.makeKeyword("STRONG"), (SubLObject)SubLObjectFactory.makeKeyword("WEAK"), (SubLObject)SubLObjectFactory.makeKeyword("NEIGHBOR"));
        $sym1$RKF_SALIENT_DESCRIPTOR_FORMULA_TYPE_P = SubLObjectFactory.makeSymbol("RKF-SALIENT-DESCRIPTOR-FORMULA-TYPE-P");
        $kw2$REQUIREMENT = SubLObjectFactory.makeKeyword("REQUIREMENT");
        $kw3$STRONG = SubLObjectFactory.makeKeyword("STRONG");
        $kw4$WEAK = SubLObjectFactory.makeKeyword("WEAK");
        $kw5$NEIGHBOR = SubLObjectFactory.makeKeyword("NEIGHBOR");
        $str6$_S_is_not_a_valid_salience_type = SubLObjectFactory.makeString("~S is not a valid salience-type");
        $sym7$FORT_P = SubLObjectFactory.makeSymbol("FORT-P");
        $sym8$HLMT_P = SubLObjectFactory.makeSymbol("HLMT-P");
        $sym9$LISTP = SubLObjectFactory.makeSymbol("LISTP");
        $const10$keRequirement = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("keRequirement"));
        $const11$keStrongSuggestion = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("keStrongSuggestion"));
        $const12$keWeakSuggestion = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("keWeakSuggestion"));
        $const13$keInteractionRequirement = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("keInteractionRequirement"));
        $const14$keInteractionStrongSuggestion = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("keInteractionStrongSuggestion"));
        $int15$90 = SubLObjectFactory.makeInteger(90);
        $sym16$WITH_POSSIBLY_NEW_MEMOIZATION_STATE = SubLObjectFactory.makeSymbol("WITH-POSSIBLY-NEW-MEMOIZATION-STATE");
        $sym17$WITH_SBHL_RESOURCED_MARKING_SPACES = SubLObjectFactory.makeSymbol("WITH-SBHL-RESOURCED-MARKING-SPACES");
        $str18$RKF_Salient_Descriptor__Couldn_t_ = SubLObjectFactory.makeString("RKF Salient Descriptor: Couldn't justify~% ~S in ~S~%");
        $int19$50000 = SubLObjectFactory.makeInteger(50000);
        $sym20$POSITIVE_INTEGER_P = SubLObjectFactory.makeSymbol("POSITIVE-INTEGER-P");
        $kw21$ISA = SubLObjectFactory.makeKeyword("ISA");
        $list22 = (SubLList)ConsesLow.cons((SubLObject)SubLObjectFactory.makeSymbol("META-ISA"), (SubLObject)SubLObjectFactory.makeSymbol("COUNT"));
        $sym23$_X = SubLObjectFactory.makeSymbol("?X");
        $const24$isa = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("isa"));
        $const25$genls = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("genls"));
        $sym26$RKF_SALIENT_DESCRIPTOR_META_ISA_TYPE_VIOLATION_ = SubLObjectFactory.makeSymbol("RKF-SALIENT-DESCRIPTOR-META-ISA-TYPE-VIOLATION?");
        $sym27$RKF_SALIENT_DESCRIPTOR_TYPE_SPECS = SubLObjectFactory.makeSymbol("RKF-SALIENT-DESCRIPTOR-TYPE-SPECS");
        $kw28$BREADTH = SubLObjectFactory.makeKeyword("BREADTH");
        $kw29$QUEUE = SubLObjectFactory.makeKeyword("QUEUE");
        $kw30$STACK = SubLObjectFactory.makeKeyword("STACK");
        $sym31$RELEVANT_SBHL_TV_IS_GENERAL_TV = SubLObjectFactory.makeSymbol("RELEVANT-SBHL-TV-IS-GENERAL-TV");
        $kw32$ERROR = SubLObjectFactory.makeKeyword("ERROR");
        $str33$_A_is_not_a__A = SubLObjectFactory.makeString("~A is not a ~A");
        $sym34$SBHL_TRUE_TV_P = SubLObjectFactory.makeSymbol("SBHL-TRUE-TV-P");
        $kw35$CERROR = SubLObjectFactory.makeKeyword("CERROR");
        $str36$continue_anyway = SubLObjectFactory.makeString("continue anyway");
        $kw37$WARN = SubLObjectFactory.makeKeyword("WARN");
        $str38$_A_is_not_a_valid__sbhl_type_erro = SubLObjectFactory.makeString("~A is not a valid *sbhl-type-error-action* value");
        $const39$typeGenls = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("typeGenls"));
        $kw40$DEPTH = SubLObjectFactory.makeKeyword("DEPTH");
        $const41$genlPreds = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("genlPreds"));
        $str42$_A_is_neither_SET_P_nor_LISTP_ = SubLObjectFactory.makeString("~A is neither SET-P nor LISTP.");
        $str43$attempting_to_bind_direction_link = SubLObjectFactory.makeString("attempting to bind direction link variable, to NIL. macro body not executed.");
        $str44$Node__a_does_not_pass_sbhl_type_t = SubLObjectFactory.makeString("Node ~a does not pass sbhl-type-test ~a~%");
        $const45$genlInverse = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("genlInverse"));
        $sym46$REUSE_EXISTING_ = SubLObjectFactory.makeUninternedSymbol("REUSE-EXISTING?");
        $sym47$STORE = SubLObjectFactory.makeUninternedSymbol("STORE");
        $sym48$CLET = SubLObjectFactory.makeSymbol("CLET");
        $list49 = ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("RKF-SD-PROBLEM-STORE-OK?"), (SubLObject)SubLObjectFactory.makeSymbol("*RKF-SD-PROBLEM-STORE*")));
        $list50 = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("*RKF-SD-PROBLEM-STORE*"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("RKF-SD-FIND-OR-MAKE-PROBLEM-STORE")));
        $list51 = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("*RKF-SD-PROBLEM-STORE*"));
        $sym52$CUNWIND_PROTECT = SubLObjectFactory.makeSymbol("CUNWIND-PROTECT");
        $sym53$PROGN = SubLObjectFactory.makeSymbol("PROGN");
        $sym54$PUNLESS = SubLObjectFactory.makeSymbol("PUNLESS");
        $sym55$RKF_SD_FREE_PROBLEM_STORE = SubLObjectFactory.makeSymbol("RKF-SD-FREE-PROBLEM-STORE");
        $kw56$NOT_FOUND = SubLObjectFactory.makeKeyword("NOT-FOUND");
        $kw57$ANY = SubLObjectFactory.makeKeyword("ANY");
        $kw58$BIN_PRED = SubLObjectFactory.makeKeyword("BIN-PRED");
        $kw59$ALL = SubLObjectFactory.makeKeyword("ALL");
        $kw60$META_ISA = SubLObjectFactory.makeKeyword("META-ISA");
        $str61$Can_t_identify__S_common_properti = SubLObjectFactory.makeString("Can't identify ~S common properties yet.");
        $int62$25000 = SubLObjectFactory.makeInteger(25000);
        $list63 = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("SLOT"), (SubLObject)SubLObjectFactory.makeSymbol("SUPERIOR"), (SubLObject)SubLObjectFactory.makeSymbol("ISA-OR-GENLS"));
        $sym64$FIRST = SubLObjectFactory.makeSymbol("FIRST");
        $int65$25 = SubLObjectFactory.makeInteger(25);
        $list66 = (SubLList)ConsesLow.cons((SubLObject)SubLObjectFactory.makeSymbol("SLOT"), (SubLObject)SubLObjectFactory.makeSymbol("COUNT"));
        $list67 = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("COLLECTION-TYPE"), (SubLObject)SubLObjectFactory.makeSymbol("SUPERIOR"), (SubLObject)SubLObjectFactory.makeSymbol("ISA-OR-GENLS"));
        $list68 = ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("isa")), (SubLObject)SubLObjectFactory.makeKeyword("TERM"), (SubLObject)SubLObjectFactory.makeKeyword("FORT"));
        $kw69$PROBLEM_STORE = SubLObjectFactory.makeKeyword("PROBLEM-STORE");
        $kw70$ANSWER_LANGUAGE = SubLObjectFactory.makeKeyword("ANSWER-LANGUAGE");
        $kw71$HL = SubLObjectFactory.makeKeyword("HL");
        $kw72$CONDITIONAL_SENTENCE_ = SubLObjectFactory.makeKeyword("CONDITIONAL-SENTENCE?");
        $sym73$_COLLECTION_TYPE = SubLObjectFactory.makeSymbol("?COLLECTION-TYPE");
        $sym74$_INSTANCE = SubLObjectFactory.makeSymbol("?INSTANCE");
        $const75$implies = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("implies"));
        $const76$thereExists = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("thereExists"));
        $sym77$_TYPE = SubLObjectFactory.makeSymbol("?TYPE");
        $const78$and = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("and"));
        $list79 = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("?TYPE"));
        $kw80$TERM = SubLObjectFactory.makeKeyword("TERM");
        $kw81$GENLS = SubLObjectFactory.makeKeyword("GENLS");
        $list82 = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("BIN-PRED"), (SubLObject)SubLObjectFactory.makeSymbol("SUPERIOR"), (SubLObject)SubLObjectFactory.makeSymbol("ISA-OR-GENLS"));
        $list83 = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("META-ISA"), (SubLObject)SubLObjectFactory.makeSymbol("SUPERIOR"), (SubLObject)SubLObjectFactory.makeSymbol("ISA-OR-GENLS"));
        $list84 = ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("SUPERIOR"));
        $kw85$SUPERIOR = SubLObjectFactory.makeKeyword("SUPERIOR");
        $kw86$ASCENDING = SubLObjectFactory.makeKeyword("ASCENDING");
        $sym87$ALL_ISA = SubLObjectFactory.makeSymbol("ALL-ISA");
        $sym88$ALL_GENLS = SubLObjectFactory.makeSymbol("ALL-GENLS");
        $sym89$RKF_INDUCED_SALIENT_DESCRIPTOR_BINARY_PREDS = SubLObjectFactory.makeSymbol("RKF-INDUCED-SALIENT-DESCRIPTOR-BINARY-PREDS");
        $sym90$RKF_INDUCED_SALIENT_DESCRIPTOR_META_ISAS = SubLObjectFactory.makeSymbol("RKF-INDUCED-SALIENT-DESCRIPTOR-META-ISAS");
        $sym91$CAR = SubLObjectFactory.makeSymbol("CAR");
        $sym92$RKF_SALIENT_DESCRIPTOR_GENL_ = SubLObjectFactory.makeSymbol("RKF-SALIENT-DESCRIPTOR-GENL?");
        $list93 = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("RULE-TYPE"), (SubLObject)SubLObjectFactory.makeSymbol("ISA-OR-GENLS"), (SubLObject)SubLObjectFactory.makeSymbol("SUPERIOR"), (SubLObject)SubLObjectFactory.makeSymbol("SLOT"));
        $sym94$_SPEC = SubLObjectFactory.makeSymbol("?SPEC");
        $sym95$RKF_MAKE_BIN_PRED_FORMULA = SubLObjectFactory.makeSymbol("RKF-MAKE-BIN-PRED-FORMULA");
        $sym96$RKF_MAKE_META_ISA_FORMULA = SubLObjectFactory.makeSymbol("RKF-MAKE-META-ISA-FORMULA");
        $list97 = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("ISA-OR-GENLS"), (SubLObject)SubLObjectFactory.makeSymbol("SUPER"), (SubLObject)SubLObjectFactory.makeSymbol("SLOT"));
        $kw98$CODE = SubLObjectFactory.makeKeyword("CODE");
        $list99 = ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("TRUE-DEF"));
        $list100 = ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("BIN-PRED"), (SubLObject)SubLObjectFactory.makeKeyword("META-ISA"));
        $kw101$INTERMEDIATE_STEP_VALIDATION_LEVEL = SubLObjectFactory.makeKeyword("INTERMEDIATE-STEP-VALIDATION-LEVEL");
        $kw102$ARG_TYPE = SubLObjectFactory.makeKeyword("ARG-TYPE");
        $kw103$CACHE_INFERENCE_RESULTS_ = SubLObjectFactory.makeKeyword("CACHE-INFERENCE-RESULTS?");
        $kw104$RESULT_UNIQUENESS = SubLObjectFactory.makeKeyword("RESULT-UNIQUENESS");
        $kw105$BINDINGS = SubLObjectFactory.makeKeyword("BINDINGS");
        $kw106$RETURN = SubLObjectFactory.makeKeyword("RETURN");
        $kw107$TEMPLATE = SubLObjectFactory.makeKeyword("TEMPLATE");
        $kw108$PRODUCTIVITY_LIMIT = SubLObjectFactory.makeKeyword("PRODUCTIVITY-LIMIT");
        $int109$100000 = SubLObjectFactory.makeInteger(100000);
        $kw110$MAX_NUMBER = SubLObjectFactory.makeKeyword("MAX-NUMBER");
        $kw111$MAX_TIME = SubLObjectFactory.makeKeyword("MAX-TIME");
        $kw112$PROBABLY_APPROXIMATELY_DONE = SubLObjectFactory.makeKeyword("PROBABLY-APPROXIMATELY-DONE");
        $kw113$MAX_TRANSFORMATION_DEPTH = SubLObjectFactory.makeKeyword("MAX-TRANSFORMATION-DEPTH");
        $int114$100 = SubLObjectFactory.makeInteger(100);
        $const115$keInducedStrongSuggestionPreds = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("keInducedStrongSuggestionPreds"));
        $const116$keInducedWeakSuggestionPreds = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("keInducedWeakSuggestionPreds"));
        $const117$keInducedSuggestionPreds = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("keInducedSuggestionPreds"));
        $const118$keGenlsInducedStrongSuggestionPre = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("keGenlsInducedStrongSuggestionPreds"));
        $const119$keGenlsInducedWeakSuggestionPreds = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("keGenlsInducedWeakSuggestionPreds"));
        $const120$keGenlsInducedSuggestionPreds = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("keGenlsInducedSuggestionPreds"));
        $const121$SpecsFn = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("SpecsFn"));
        $kw122$GENL = SubLObjectFactory.makeKeyword("GENL");
        $sym123$_PRED = SubLObjectFactory.makeSymbol("?PRED");
        $const124$AnytimePSC = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("AnytimePSC"));
        $const125$unknownSentence = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("unknownSentence"));
        $sym126$_GENL = SubLObjectFactory.makeSymbol("?GENL");
        $list127 = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("?GENL"));
        $const128$different = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("different"));
        $list129 = ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("EXHAUST-TOTAL"), (SubLObject)SubLObjectFactory.makeKeyword("MAX-NUMBER"));
        $str130$_S___halted_with_reason__S__ = SubLObjectFactory.makeString("~S~% halted with reason ~S~%");
        $sym131$_COUNT = SubLObjectFactory.makeSymbol("?COUNT");
        $const132$assertedArg1BinaryPreds_Count = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("assertedArg1BinaryPreds-Count"));
        $list133 = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("?COUNT"));
        $list134 = (SubLList)ConsesLow.cons((SubLObject)SubLObjectFactory.makeSymbol("BINARY-PRED"), (SubLObject)SubLObjectFactory.makeSymbol("COUNT"));
        $str135$Type_violation___S__S__S = SubLObjectFactory.makeString("Type violation: ~S ~S ~S");
        $const136$keRelevantPreds = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("keRelevantPreds"));
        $sym137$RKF_SALIENT_DESCRIPTOR_GET_INFERIORS = SubLObjectFactory.makeSymbol("RKF-SALIENT-DESCRIPTOR-GET-INFERIORS");
        $int138$200 = SubLObjectFactory.makeInteger(200);
        $sym139$INSTANCES = SubLObjectFactory.makeSymbol("INSTANCES");
        $sym140$SPECS = SubLObjectFactory.makeSymbol("SPECS");
        $sym141$RKF_SALIENT_DESCRIPTOR_BINARY_PRED_TYPE_VIOLATION_ = SubLObjectFactory.makeSymbol("RKF-SALIENT-DESCRIPTOR-BINARY-PRED-TYPE-VIOLATION?");
        $str142$violation___S_not_a_known_spec_of = SubLObjectFactory.makeString("violation: ~S not a known spec of ~S in ~S~%");
        $sym143$RKF_TERM_BINARY_PREDS = SubLObjectFactory.makeSymbol("RKF-TERM-BINARY-PREDS");
        $int144$10000 = SubLObjectFactory.makeInteger(10000);
        $kw145$GAF = SubLObjectFactory.makeKeyword("GAF");
        $sym146$RKF_TERM_ALL_META_ISAS = SubLObjectFactory.makeSymbol("RKF-TERM-ALL-META-ISAS");
        $list147 = (SubLList)ConsesLow.cons((SubLObject)SubLObjectFactory.makeSymbol("VAR"), (SubLObject)SubLObjectFactory.makeSymbol("TERM"));
        $sym148$EL_VAR_ = SubLObjectFactory.makeSymbol("EL-VAR?");
        $sym149$RKF_SD_EL_WFF_ = SubLObjectFactory.makeSymbol("RKF-SD-EL-WFF?");
        $sym150$ALIST__ = SubLObjectFactory.makeSymbol("ALIST-=");
        $const151$quotedIsa = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("quotedIsa"));
        $list152 = ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("CycLNonAtomicTerm")));
        $list153 = (SubLList)ConsesLow.cons((SubLObject)SubLObjectFactory.makeSymbol("EL-VAR"), (SubLObject)SubLObjectFactory.makeSymbol("TERM"));
        $list154 = ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("isa")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("TEST"), (SubLObject)SubLObjectFactory.makeSymbol("EL-VAR?")), (SubLObject)SubLObjectFactory.makeKeyword("FORT"));
        $list155 = ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("genls")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("TEST"), (SubLObject)SubLObjectFactory.makeSymbol("EL-VAR?")), (SubLObject)SubLObjectFactory.makeKeyword("FORT"));
        $list156 = ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("isa")), (SubLObject)SubLObjectFactory.makeKeyword("FORT"), (SubLObject)SubLObjectFactory.makeKeyword("FORT"));
        $kw157$NEGATION_BY_FAILURE_ = SubLObjectFactory.makeKeyword("NEGATION-BY-FAILURE?");
        $kw158$ALLOW_INDETERMINATE_RESULTS_ = SubLObjectFactory.makeKeyword("ALLOW-INDETERMINATE-RESULTS?");
        $kw159$FORGET_EXTRA_RESULTS_ = SubLObjectFactory.makeKeyword("FORGET-EXTRA-RESULTS?");
        $kw160$BROWSABLE_ = SubLObjectFactory.makeKeyword("BROWSABLE?");
        $kw161$CONTINUABLE_ = SubLObjectFactory.makeKeyword("CONTINUABLE?");
        $sym162$RKF_SD_KNOWN = SubLObjectFactory.makeSymbol("RKF-SD-KNOWN");
        $str163$_S_is_not_continuable____Exit_con = SubLObjectFactory.makeString("~S is not continuable.~% Exit condition: ~S~%");
        $kw164$EXHAUST = SubLObjectFactory.makeKeyword("EXHAUST");
        $str165$RKF_SD_KNOWN_timed_out_on__S = SubLObjectFactory.makeString("RKF-SD-KNOWN timed out on ~S");
        $list166 = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("VAR"), (SubLObject)SubLObjectFactory.makeSymbol("BODY"));
        $sym167$RKF_SD_GET_CONJUNCT_BINDINGS = SubLObjectFactory.makeSymbol("RKF-SD-GET-CONJUNCT-BINDINGS");
        $list168 = (SubLList)ConsesLow.cons((SubLObject)SubLObjectFactory.makeSymbol("HL-VAR"), (SubLObject)SubLObjectFactory.makeSymbol("EL-VAR"));
        $sym169$HL_VAR_ = SubLObjectFactory.makeSymbol("HL-VAR?");
        $kw170$NEG = SubLObjectFactory.makeKeyword("NEG");
        $sym171$FULLY_BOUND_P = SubLObjectFactory.makeSymbol("FULLY-BOUND-P");
        $kw172$POS = SubLObjectFactory.makeKeyword("POS");
        $kw173$KNOWN = SubLObjectFactory.makeKeyword("KNOWN");
        $kw174$UNKNOWN = SubLObjectFactory.makeKeyword("UNKNOWN");
        $kw175$MISMATCH = SubLObjectFactory.makeKeyword("MISMATCH");
        $sym176$RKF_SD_CHECK_LIT = SubLObjectFactory.makeSymbol("RKF-SD-CHECK-LIT");
        $kw177$MALFORMED = SubLObjectFactory.makeKeyword("MALFORMED");
        $kw178$IRRELEVANT = SubLObjectFactory.makeKeyword("IRRELEVANT");
        $kw179$FALSE = SubLObjectFactory.makeKeyword("FALSE");
        $kw180$BINDINGS_AND_SUPPORTS = SubLObjectFactory.makeKeyword("BINDINGS-AND-SUPPORTS");
        $sym181$_FORMULA = SubLObjectFactory.makeSymbol("?FORMULA");
        $str182$Timed_out_after__S_seconds_gettin = SubLObjectFactory.makeString("Timed out after ~S seconds getting ~S for ~S.~%");
        $str183$P_A_D__getting__S_for__S___ = SubLObjectFactory.makeString("P.A.D. getting ~S for ~S.~%");
        $list184 = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("BINDINGS"), (SubLObject)SubLObjectFactory.makeSymbol("SUPPORTS"));
        $kw185$IGNORE = SubLObjectFactory.makeKeyword("IGNORE");
        $kw186$UNINITIALIZED = SubLObjectFactory.makeKeyword("UNINITIALIZED");
        $sym187$RELEVANT_MT_IS_EVERYTHING = SubLObjectFactory.makeSymbol("RELEVANT-MT-IS-EVERYTHING");
        $const188$EverythingPSC = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("EverythingPSC"));
        $const189$deprecatedSalientDescriptorRule = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("deprecatedSalientDescriptorRule"));
        $const190$deprecatedSalientDescriptorRuleAs = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("deprecatedSalientDescriptorRuleAssertion"));
        $sym191$DEPRECATE_SALIENT_DESCRIPTOR_RULE = SubLObjectFactory.makeSymbol("DEPRECATE-SALIENT-DESCRIPTOR-RULE");
        $sym192$UNDEPRECATE_SALIENT_DESCRIPTOR_RULE = SubLObjectFactory.makeSymbol("UNDEPRECATE-SALIENT-DESCRIPTOR-RULE");
        $const193$ArgConstraintPredicate = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("ArgConstraintPredicate"));
        $list194 = ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("TEST"), (SubLObject)SubLObjectFactory.makeSymbol("HL-VAR?"));
        $kw195$ANYTHING = SubLObjectFactory.makeKeyword("ANYTHING");
        $const196$TransitiveBinaryPredicate = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("TransitiveBinaryPredicate"));
        $const197$BinaryPredicate = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("BinaryPredicate"));
        $const198$transitiveViaArg = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("transitiveViaArg"));
        $const199$transitiveViaArgInverse = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("transitiveViaArgInverse"));
        $list200 = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("NEG-LITS"), (SubLObject)SubLObjectFactory.makeSymbol("POS-LITS"));
        $list201 = ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("isa")), constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("genls")));
        $sym202$_RKF_SALIENT_DESCRIPTOR_CACHE_ = SubLObjectFactory.makeSymbol("*RKF-SALIENT-DESCRIPTOR-CACHE*");
        $str203$RKF_Salient_Descriptor_Cache_Lock = SubLObjectFactory.makeString("RKF Salient Descriptor Cache Lock");
        $sym204$_RKF_SALIENT_DESCRIPTOR_IGNORE_CACHE_ = SubLObjectFactory.makeSymbol("*RKF-SALIENT-DESCRIPTOR-IGNORE-CACHE*");
        $const205$singleEntryFormatInArgs = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("singleEntryFormatInArgs"));
        $list206 = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("ARGNUM"), (SubLObject)SubLObjectFactory.makeSymbol("FORMAT"));
        $list207 = ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("SingleEntry")), constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("singleEntryFormatInArgs")));
        $const208$argFormat = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("argFormat"));
        $list209 = ConsesLow.list((SubLObject)rkf_salient_descriptor.TWO_INTEGER, (SubLObject)rkf_salient_descriptor.THREE_INTEGER);
        $sym210$EXPRESSION_FIND = SubLObjectFactory.makeSymbol("EXPRESSION-FIND");
        $sym211$RKF_SALIENT_DESCRIPTOR_SUBPROMPT_P = SubLObjectFactory.makeSymbol("RKF-SALIENT-DESCRIPTOR-SUBPROMPT-P");
        $list212 = ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("CONFIRM"), (SubLObject)SubLObjectFactory.makeKeyword("CHOICE"), (SubLObject)SubLObjectFactory.makeKeyword("SPECIFY"), (SubLObject)SubLObjectFactory.makeKeyword("STRENGTHEN"));
        $kw213$CONFIRM = SubLObjectFactory.makeKeyword("CONFIRM");
        $list214 = ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("ANYTHING"));
        $kw215$CHOICE = SubLObjectFactory.makeKeyword("CHOICE");
        $kw216$SPECIFY = SubLObjectFactory.makeKeyword("SPECIFY");
        $list217 = ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("SkolemTerm")));
        $list218 = ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("not")), (SubLObject)ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("isa")), (SubLObject)SubLObjectFactory.makeKeyword("FORT"), (SubLObject)SubLObjectFactory.makeKeyword("FORT")));
        $const219$True_JustificationTruth = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("True-JustificationTruth"));
        $const220$disjointWith = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("disjointWith"));
        $kw221$STRENGTHEN = SubLObjectFactory.makeKeyword("STRENGTHEN");
        $sym222$RKF_SD_EXAMPLES = SubLObjectFactory.makeSymbol("RKF-SD-EXAMPLES");
        $sym223$EL_FORMULA_P = SubLObjectFactory.makeSymbol("EL-FORMULA-P");
        $kw224$NOT_TRIED = SubLObjectFactory.makeKeyword("NOT-TRIED");
        $kw225$FORT = SubLObjectFactory.makeKeyword("FORT");
        $list226 = ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("TEST"), (SubLObject)SubLObjectFactory.makeSymbol("EL-VAR?")));
        $list227 = ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("isa")), (SubLObject)SubLObjectFactory.makeKeyword("ANYTHING"), (SubLObject)SubLObjectFactory.makeKeyword("FORT"));
        $const228$relationAllInstance = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("relationAllInstance"));
        $const229$knownSentence = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("knownSentence"));
        $sym230$RKF_SD_ADD_KNOWN_SENTENCE = SubLObjectFactory.makeSymbol("RKF-SD-ADD-KNOWN-SENTENCE");
        $kw231$VAR = SubLObjectFactory.makeKeyword("VAR");
        $sym232$RKF_SD_COMPLETE_COLL_BINDINGS_OK_ = SubLObjectFactory.makeSymbol("RKF-SD-COMPLETE-COLL-BINDINGS-OK?");
        $const233$elementOf = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("elementOf"));
        $const234$TheSet = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("TheSet"));
        $sym235$RKF_SD_SMALL_SET_BINDINGS_OK_ = SubLObjectFactory.makeSymbol("RKF-SD-SMALL-SET-BINDINGS-OK?");
        $const236$notAssertible = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("notAssertible"));
        $const237$or = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("or"));
        $const238$termDependsOn = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("termDependsOn"));
        $const239$uiaDisplayTerm = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("uiaDisplayTerm"));
        $kw240$CONSTRAINT_MATCHER = SubLObjectFactory.makeKeyword("CONSTRAINT-MATCHER");
        $kw241$PRECEDENT = SubLObjectFactory.makeKeyword("PRECEDENT");
        $sym242$RKF_SD_EXAMPLE_TERM = SubLObjectFactory.makeSymbol("RKF-SD-EXAMPLE-TERM");
        $sym243$RKF_EXAMPLE_WFF__INT = SubLObjectFactory.makeSymbol("RKF-EXAMPLE-WFF?-INT");
        $kw244$IGNORE_ERRORS_TARGET = SubLObjectFactory.makeKeyword("IGNORE-ERRORS-TARGET");
        $sym245$IGNORE_ERRORS_HANDLER = SubLObjectFactory.makeSymbol("IGNORE-ERRORS-HANDLER", "SUBLISP");
        $str246$__RKF_EXAMPLE_INSTANCES_ASK_timed = SubLObjectFactory.makeString("~&RKF-EXAMPLE-INSTANCES-ASK timed out after ~S seconds on ~S in ~S");
        $sym247$GENERALITY_ESTIMATE_ = SubLObjectFactory.makeSymbol("GENERALITY-ESTIMATE>");
        $sym248$RKF_BETTER_EXAMPLE_ = SubLObjectFactory.makeSymbol("RKF-BETTER-EXAMPLE?");
        $kw249$BUG_WORKAROUND = SubLObjectFactory.makeKeyword("BUG-WORKAROUND");
    }
}

/*

	Total time: 4626 ms
	
*/