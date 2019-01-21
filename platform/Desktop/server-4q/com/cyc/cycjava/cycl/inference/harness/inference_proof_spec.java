package com.cyc.cycjava.cycl.inference.harness;

import com.cyc.cycjava.cycl.constant_handles;
import com.cyc.tool.subl.util.SubLFiles;
import com.cyc.cycjava.cycl.variables;
import com.cyc.cycjava.cycl.cyc_testing.generic_testing;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.StreamsLow;
import com.cyc.cycjava.cycl.plot_generation;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Sort;
import com.cyc.cycjava.cycl.subl_promotions;
import com.cyc.cycjava.cycl.subl_macro_promotions;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.print_high;
import com.cyc.cycjava.cycl.dictionary_utilities;
import com.cyc.cycjava.cycl.cfasl;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.compatibility;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.stream_macros;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.streams_high;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.PrintLow;
import com.cyc.cycjava.cycl.numeric_date_utilities;
import com.cyc.cycjava.cycl.inference.kb_query;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Threads;
import com.cyc.cycjava.cycl.cfasl_utilities;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Time;
import com.cyc.cycjava.cycl.utilities_macros;
import com.cyc.cycjava.cycl.inference.kbq_query_run;
import com.cyc.cycjava.cycl.dictionary;
import com.cyc.cycjava.cycl.forts;
import com.cyc.cycjava.cycl.clauses;
import com.cyc.cycjava.cycl.transform_list_utilities;
import com.cyc.cycjava.cycl.pattern_match;
import com.cyc.cycjava.cycl.cycl_utilities;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Numbers;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Symbols;
import com.cyc.cycjava.cycl.set_contents;
import com.cyc.cycjava.cycl.dictionary_contents;
import com.cyc.cycjava.cycl.set;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.reader;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Sequences;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Values;
import com.cyc.cycjava.cycl.el_utilities;
import com.cyc.cycjava.cycl.clause_utilities;
import com.cyc.cycjava.cycl.bindings;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.SubLThread;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLProcess;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Errors;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.cdestructuring_bind;
import com.cyc.cycjava.cycl.simplifier;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Mapping;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Functions;
import com.cyc.cycjava.cycl.assertions_high;
import com.cyc.cycjava.cycl.cycl_grammar;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.conses_high;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory;
import com.cyc.cycjava.cycl.list_utilities;
import com.cyc.tool.subl.jrtl.nativeCode.type.number.SubLInteger;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLString;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLList;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObject;
import com.cyc.tool.subl.jrtl.nativeCode.type.symbol.SubLSymbol;
import com.cyc.tool.subl.util.SubLFile;
import com.cyc.tool.subl.util.SubLTranslatedFile;

public final class inference_proof_spec extends SubLTranslatedFile
{
    public static final SubLFile me;
    public static final String myName = "com.cyc.cycjava.cycl.inference.harness.inference_proof_spec";
    public static final String myFingerPrint = "59f6a05209317325ebad475df6c491c67769f20cdbbfdf494d5daa07b1c7a1a4";
    @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-proof-spec.lisp", position = 51900L)
    private static SubLSymbol $kbq_proof_spec_table$;
    @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-proof-spec.lisp", position = 52229L)
    private static SubLSymbol $use_kbq_proof_spec_tableP$;
    @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-proof-spec.lisp", position = 57930L)
    private static SubLSymbol $proof_spec_experiment_metrics$;
    private static final SubLSymbol $kw0$ANYTHING;
    private static final SubLSymbol $kw1$NOTHING;
    private static final SubLSymbol $kw2$OR;
    private static final SubLSymbol $sym3$PROOF_SPEC_P;
    private static final SubLSymbol $kw4$UNION;
    private static final SubLSymbol $kw5$JOIN;
    private static final SubLSymbol $kw6$SPLIT;
    private static final SubLSymbol $kw7$RESTRICTION;
    private static final SubLSymbol $kw8$JOIN_ORDERED;
    private static final SubLSymbol $kw9$REMOVAL;
    private static final SubLSymbol $kw10$CONJUNCTIVE_REMOVAL;
    private static final SubLSymbol $kw11$TRANSFORMATION;
    private static final SubLSymbol $kw12$RESIDUAL_TRANSFORMATION;
    private static final SubLSymbol $kw13$REWRITE;
    private static final SubLSymbol $sym14$REMOVAL_MODULE_NAME_P;
    private static final SubLSymbol $sym15$REMOVAL_MODULE_SPEC_P;
    private static final SubLSymbol $sym16$CONJUNCTIVE_REMOVAL_MODULE_NAME_P;
    private static final SubLSymbol $sym17$CONJUNCTIVE_REMOVAL_MODULE_SPEC_P;
    private static final SubLSymbol $sym18$TRANSFORMATION_MODULE_NAME_P;
    private static final SubLSymbol $sym19$TRANSFORMATION_MODULE_SPEC_P;
    private static final SubLObject $const20$not;
    private static final SubLSymbol $kw21$NOT;
    private static final SubLSymbol $kw22$AND;
    private static final SubLSymbol $sym23$SINGLE_LITERAL_PROOF_SPEC_P;
    private static final SubLSymbol $sym24$RESTRICTION_PROOF_SPEC_P;
    private static final SubLSymbol $sym25$JOIN_ORDERED_PROOF_SPEC_P;
    private static final SubLSymbol $sym26$SPLIT_PROOF_SPEC_P;
    private static final SubLSymbol $sym27$UNION_PROOF_SPEC_P;
    private static final SubLSymbol $sym28$SECOND;
    private static final SubLSymbol $sym29$TRANSFORMATION_PROOF_SPEC_P;
    private static final SubLSymbol $sym30$RESIDUAL_TRANSFORMATION_PROOF_SPEC_P;
    private static final SubLList $list31;
    private static final SubLList $list32;
    private static final SubLList $list33;
    private static final SubLList $list34;
    private static final SubLSymbol $sym35$PROOF_P;
    private static final SubLString $str36$time_to_support__S_proofs;
    private static final SubLSymbol $sym37$STRUCTURAL_PROOF_P;
    private static final SubLSymbol $sym38$INFERENCE_P;
    private static final SubLList $list39;
    private static final SubLSymbol $sym40$CLET;
    private static final SubLSymbol $sym41$SET_ADD;
    private static final SubLSymbol $sym42$PROGN;
    private static final SubLSymbol $sym43$CSETQ;
    private static final SubLSymbol $sym44$DELETE;
    private static final SubLSymbol $kw45$IGNORE;
    private static final SubLSymbol $sym46$PCOND;
    private static final SubLSymbol $sym47$NULL;
    private static final SubLList $list48;
    private static final SubLSymbol $sym49$SINGLETON_;
    private static final SubLSymbol $sym50$FIRST;
    private static final SubLSymbol $sym51$NREVERSE;
    private static final SubLSymbol $sym52$CPUSH;
    private static final SubLSymbol $sym53$RET;
    private static final SubLString $str54$Non_union_tactic__A_mixed_in_with;
    private static final SubLSymbol $kw55$ANSWER;
    private static final SubLString $str56$Dont_know_how_to_handle_problem_l;
    private static final SubLString $str57$What_is_an_answer_link_doing_here;
    private static final SubLSymbol $sym58$TACTIC_EXECUTED_;
    private static final SubLString $str59$This_should_never_be_called_;
    private static final SubLString $str60$This_should_only_occur_at_the_top;
    private static final SubLString $str61$Union_tactics_can_only_occur_at_t;
    private static final SubLString $str62$Dont_know_how_to_compute_the_proo;
    private static final SubLSymbol $sym63$MERGE_2_PROOF_SPECS;
    private static final SubLList $list64;
    private static final SubLList $list65;
    private static final SubLSymbol $kw66$UNMERGEABLE;
    private static final SubLList $list67;
    private static final SubLList $list68;
    private static final SubLSymbol $sym69$IST_SENTENCE_P;
    private static final SubLSymbol $kw70$NEG;
    private static final SubLSymbol $kw71$POS;
    private static final SubLSymbol $sym72$CONTENT_PROOF_SPEC_P;
    private static final SubLSymbol $sym73$GENERICIZE_CONTENT_PROOF_SPEC;
    private static final SubLString $str74$Time_to_handle_proof_spec__s;
    private static final SubLList $list75;
    private static final SubLList $list76;
    private static final SubLSymbol $kw77$FULLY_BOUND;
    private static final SubLList $list78;
    private static final SubLSymbol $kw79$INTEGER;
    private static final SubLSymbol $kw80$NUMBER;
    private static final SubLSymbol $kw81$STRING;
    private static final SubLSymbol $kw82$PROOF_SPEC;
    private static final SubLSymbol $kw83$ALLOWED_MODULES;
    private static final SubLSymbol $kw84$ALLOWED_RULES;
    private static final SubLList $list85;
    private static final SubLList $list86;
    private static final SubLList $list87;
    private static final SubLSymbol $kw88$DETERMINE_NEW_TRANSFORMATION_TACTICS;
    private static final SubLList $list89;
    private static final SubLList $list90;
    private static final SubLList $list91;
    private static final SubLSymbol $kw92$DETERMINE_NEW_SPLIT_TACTICS;
    private static final SubLList $list93;
    private static final SubLSymbol $sym94$_KBQ_PROOF_SPEC_TABLE_;
    private static final SubLSymbol $kw95$INFERENCE_PROOF_SPEC;
    private static final SubLString $str96$possibly_ill_formed_proof_spec___;
    private static final SubLList $list97;
    private static final SubLObject $const98$InferencePSC;
    private static final SubLString $str99$Doing_inference_for_all_elements_;
    private static final SubLString $str100$cdolist;
    private static final SubLSymbol $kw101$IGNORE_ERRORS_TARGET;
    private static final SubLSymbol $sym102$IGNORE_ERRORS_HANDLER;
    private static final SubLSymbol $kw103$METRICS;
    private static final SubLList $list104;
    private static final SubLSymbol $kw105$BROWSABLE_;
    private static final SubLSymbol $kw106$MAX_TIME;
    private static final SubLInteger $int107$30;
    private static final SubLString $str108$___A___A__;
    private static final SubLSymbol $kw109$INPUT;
    private static final SubLString $str110$Unable_to_open__S;
    private static final SubLSymbol $kw111$EOF;
    private static final SubLString $str112$Read_invalid_query_info__s;
    private static final SubLList $list113;
    private static final SubLSymbol $kw114$OUTPUT;
    private static final SubLString $str115$Running_experiments___;
    private static final SubLString $str116$Timeout___s;
    private static final SubLList $list117;
    private static final SubLList $list118;
    private static final SubLList $list119;
    private static final SubLSymbol $kw120$TIME_TO_FIRST_ANSWER;
    private static final SubLSymbol $kw121$TOTAL_TIME;
    private static final SubLSymbol $kw122$TIME_PER_ANSWER;
    private static final SubLSymbol $kw123$TIME_TO_LAST_ANSWER;
    private static final SubLSymbol $kw124$TACTIC_COUNT;
    private static final SubLSymbol $kw125$EXECUTED_TACTIC_COUNT;
    private static final SubLSymbol $kw126$ANSWER_COUNT;
    private static final SubLSymbol $kw127$HALT_REASON;
    private static final SubLString $str128$unhandled_metric__s;
    private static final SubLSymbol $kw129$BOTH_ANSWERABLE;
    private static final SubLSymbol $kw130$ONLY_BASELINE_ANSWERABLE;
    private static final SubLSymbol $kw131$ONLY_PROOF_SPEC_ANSWERABLE;
    private static final SubLSymbol $kw132$NEITHER_ANSWERABLE;
    private static final SubLSymbol $kw133$BOTH;
    private static final SubLSymbol $sym134$_;
    private static final SubLSymbol $kw135$BASELINE;
    private static final SubLSymbol $sym136$CAR;
    private static final SubLSymbol $sym137$CDR;
    private static final SubLSymbol $kw138$EXPERIMENT;
    private static final SubLString $str139$unhandled_sort_by__s;
    private static final SubLSymbol $sym140$COORDINATIFY;
    private static final SubLList $list141;
    private static final SubLList $list142;
    private static final SubLList $list143;
    private static final SubLString $str144$Proof_spec_query_is_slower___s_vs;
    private static final SubLString $str145$Proof_spec_query_failed_to_get__s;
    private static final SubLString $str146$Proof_spec_query_got_additional_a;
    private static final SubLList $list147;
    private static final SubLSymbol $kw148$TERSE;
    private static final SubLSymbol $sym149$TEST_QUERY_FIRST_PROOF_SPEC;
    private static final SubLObject $const150$EverythingPSC;
    private static final SubLList $list151;
    private static final SubLSymbol $kw152$TEST;
    private static final SubLSymbol $kw153$OWNER;
    private static final SubLSymbol $kw154$CLASSES;
    private static final SubLSymbol $kw155$KB;
    private static final SubLSymbol $kw156$TINY;
    private static final SubLSymbol $kw157$WORKING_;
    private static final SubLList $list158;
    private static final SubLList $list159;
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-proof-spec.lisp", position = 3727L)
    public static SubLObject proof_spec_p(final SubLObject proof_spec) {
        return (SubLObject)SubLObjectFactory.makeBoolean(inference_proof_spec.$kw0$ANYTHING == proof_spec || inference_proof_spec.$kw1$NOTHING == proof_spec || (proof_spec.isCons() && inference_proof_spec.$kw2$OR == proof_spec.first() && inference_proof_spec.NIL != list_utilities.list_of_type_p((SubLObject)inference_proof_spec.$sym3$PROOF_SPEC_P, proof_spec.rest())) || inference_proof_spec.NIL != structural_proof_spec_p(proof_spec) || inference_proof_spec.NIL != content_proof_spec_p(proof_spec));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-proof-spec.lisp", position = 4159L)
    public static SubLObject structural_proof_spec_p(final SubLObject proof_spec) {
        return (SubLObject)SubLObjectFactory.makeBoolean(inference_proof_spec.NIL != union_proof_spec_p(proof_spec) || inference_proof_spec.NIL != join_ordered_proof_spec_p(proof_spec) || inference_proof_spec.NIL != join_proof_spec_p(proof_spec) || inference_proof_spec.NIL != split_proof_spec_p(proof_spec) || inference_proof_spec.NIL != restriction_proof_spec_p(proof_spec) || inference_proof_spec.NIL != conjunctive_removal_proof_spec_p(proof_spec));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-proof-spec.lisp", position = 4523L)
    public static SubLObject union_proof_spec_p(final SubLObject proof_spec) {
        return branching_proof_spec_p((SubLObject)inference_proof_spec.$kw4$UNION, proof_spec);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-proof-spec.lisp", position = 4627L)
    public static SubLObject join_proof_spec_p(final SubLObject proof_spec) {
        return branching_proof_spec_p((SubLObject)inference_proof_spec.$kw5$JOIN, proof_spec);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-proof-spec.lisp", position = 4728L)
    public static SubLObject split_proof_spec_p(final SubLObject proof_spec) {
        return branching_proof_spec_p((SubLObject)inference_proof_spec.$kw6$SPLIT, proof_spec);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-proof-spec.lisp", position = 4831L)
    public static SubLObject restriction_proof_spec_p(final SubLObject proof_spec) {
        return (SubLObject)SubLObjectFactory.makeBoolean(proof_spec.isCons() && inference_proof_spec.$kw7$RESTRICTION == proof_spec.first() && inference_proof_spec.NIL != list_utilities.lengthE(proof_spec, (SubLObject)inference_proof_spec.TWO_INTEGER, (SubLObject)inference_proof_spec.UNPROVIDED) && inference_proof_spec.NIL != proof_spec_p(conses_high.second(proof_spec)));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-proof-spec.lisp", position = 5051L)
    public static SubLObject join_ordered_proof_spec_p(final SubLObject proof_spec) {
        return (SubLObject)SubLObjectFactory.makeBoolean(proof_spec.isCons() && inference_proof_spec.$kw8$JOIN_ORDERED == proof_spec.first() && inference_proof_spec.NIL != list_utilities.lengthE(proof_spec, (SubLObject)inference_proof_spec.THREE_INTEGER, (SubLObject)inference_proof_spec.UNPROVIDED) && inference_proof_spec.NIL != proof_spec_p(conses_high.second(proof_spec)) && inference_proof_spec.NIL != proof_spec_p(conses_high.third(proof_spec)));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-proof-spec.lisp", position = 5319L)
    public static SubLObject content_proof_spec_p(final SubLObject proof_spec) {
        return (SubLObject)SubLObjectFactory.makeBoolean(inference_proof_spec.NIL != removal_proof_spec_p(proof_spec) || inference_proof_spec.NIL != transformation_proof_spec_p(proof_spec) || inference_proof_spec.NIL != residual_transformation_proof_spec_p(proof_spec));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-proof-spec.lisp", position = 5523L)
    public static SubLObject removal_proof_spec_p(final SubLObject proof_spec) {
        return (SubLObject)SubLObjectFactory.makeBoolean(proof_spec.isCons() && inference_proof_spec.$kw9$REMOVAL == proof_spec.first() && inference_proof_spec.NIL != list_utilities.lengthE(proof_spec, (SubLObject)inference_proof_spec.THREE_INTEGER, (SubLObject)inference_proof_spec.UNPROVIDED) && inference_proof_spec.NIL != literal_spec_p(conses_high.second(proof_spec)) && inference_proof_spec.NIL != removal_module_spec_p(conses_high.third(proof_spec)));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-proof-spec.lisp", position = 5785L)
    public static SubLObject conjunctive_removal_proof_spec_p(final SubLObject proof_spec) {
        return (SubLObject)SubLObjectFactory.makeBoolean(proof_spec.isCons() && inference_proof_spec.$kw10$CONJUNCTIVE_REMOVAL == proof_spec.first() && inference_proof_spec.NIL != list_utilities.lengthE(proof_spec, (SubLObject)inference_proof_spec.THREE_INTEGER, (SubLObject)inference_proof_spec.UNPROVIDED) && inference_proof_spec.NIL != conjunctive_removal_module_spec_p(conses_high.second(proof_spec)) && inference_proof_spec.NIL != restriction_proof_spec_p(conses_high.third(proof_spec)));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-proof-spec.lisp", position = 6080L)
    public static SubLObject transformation_proof_spec_p(final SubLObject proof_spec) {
        return transformational_proof_spec_p((SubLObject)inference_proof_spec.$kw11$TRANSFORMATION, proof_spec);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-proof-spec.lisp", position = 6209L)
    public static SubLObject residual_transformation_proof_spec_p(final SubLObject proof_spec) {
        return transformational_proof_spec_p((SubLObject)inference_proof_spec.$kw12$RESIDUAL_TRANSFORMATION, proof_spec);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-proof-spec.lisp", position = 6355L)
    public static SubLObject rewrite_proof_spec_p(final SubLObject proof_spec) {
        return (SubLObject)SubLObjectFactory.makeBoolean(proof_spec.isCons() && inference_proof_spec.$kw13$REWRITE == proof_spec.first() && inference_proof_spec.NIL != list_utilities.lengthE(proof_spec, (SubLObject)inference_proof_spec.FOUR_INTEGER, (SubLObject)inference_proof_spec.UNPROVIDED) && conses_high.third(proof_spec).isKeyword());
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-proof-spec.lisp", position = 6653L)
    public static SubLObject removal_module_spec_p(final SubLObject module_spec) {
        return inference_module_spec_p(module_spec, (SubLObject)inference_proof_spec.$sym14$REMOVAL_MODULE_NAME_P, (SubLObject)inference_proof_spec.$sym15$REMOVAL_MODULE_SPEC_P);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-proof-spec.lisp", position = 6801L)
    public static SubLObject conjunctive_removal_module_spec_p(final SubLObject module_spec) {
        return inference_module_spec_p(module_spec, (SubLObject)inference_proof_spec.$sym16$CONJUNCTIVE_REMOVAL_MODULE_NAME_P, (SubLObject)inference_proof_spec.$sym17$CONJUNCTIVE_REMOVAL_MODULE_SPEC_P);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-proof-spec.lisp", position = 6985L)
    public static SubLObject transformation_module_spec_p(final SubLObject module_spec) {
        return inference_module_spec_p(module_spec, (SubLObject)inference_proof_spec.$sym18$TRANSFORMATION_MODULE_NAME_P, (SubLObject)inference_proof_spec.$sym19$TRANSFORMATION_MODULE_SPEC_P);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-proof-spec.lisp", position = 7163L)
    public static SubLObject literal_spec_p(final SubLObject lit_spec) {
        return (SubLObject)SubLObjectFactory.makeBoolean(inference_proof_spec.NIL != cycl_grammar.cycl_atomic_sentence_p(lit_spec) || (lit_spec.isCons() && inference_proof_spec.NIL != list_utilities.lengthE(lit_spec, (SubLObject)inference_proof_spec.TWO_INTEGER, (SubLObject)inference_proof_spec.UNPROVIDED) && inference_proof_spec.$const20$not.eql(lit_spec.first()) && inference_proof_spec.NIL != cycl_grammar.cycl_atomic_sentence_p(conses_high.second(lit_spec))));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-proof-spec.lisp", position = 7440L)
    public static SubLObject single_literal_proof_spec_p(final SubLObject proof_spec) {
        return (SubLObject)SubLObjectFactory.makeBoolean(inference_proof_spec.NIL != rewrite_proof_spec_p(proof_spec) || inference_proof_spec.NIL != removal_proof_spec_p(proof_spec) || inference_proof_spec.NIL != transformation_proof_spec_p(proof_spec));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-proof-spec.lisp", position = 7634L)
    public static SubLObject removal_module_name_p(final SubLObject name) {
        return inference_modules.removal_proof_module_p(inference_modules.find_hl_module_by_name(name));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-proof-spec.lisp", position = 7759L)
    public static SubLObject conjunctive_removal_module_name_p(final SubLObject name) {
        return inference_modules.conjunctive_removal_module_p(inference_modules.find_hl_module_by_name(name));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-proof-spec.lisp", position = 7887L)
    public static SubLObject transformation_module_name_p(final SubLObject name) {
        return inference_modules.transformation_module_p(inference_modules.find_hl_module_by_name(name));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-proof-spec.lisp", position = 8005L)
    public static SubLObject proof_spec_or_nothing_p(final SubLObject proof_spec) {
        return (SubLObject)SubLObjectFactory.makeBoolean(inference_proof_spec.$kw1$NOTHING == proof_spec || inference_proof_spec.NIL != proof_spec_p(proof_spec));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-proof-spec.lisp", position = 8158L)
    public static SubLObject transformation_proof_rule_p(final SubLObject v_object) {
        return (SubLObject)SubLObjectFactory.makeBoolean(inference_proof_spec.$kw0$ANYTHING == v_object || inference_proof_spec.NIL != assertions_high.rule_assertionP(v_object));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-proof-spec.lisp", position = 8286L)
    public static SubLObject transformational_proof_spec_p(final SubLObject transformation_type, final SubLObject proof_spec) {
        return (SubLObject)SubLObjectFactory.makeBoolean(proof_spec.isCons() && transformation_type.eql(proof_spec.first()) && inference_proof_spec.NIL != list_utilities.lengthE(proof_spec, (SubLObject)inference_proof_spec.FIVE_INTEGER, (SubLObject)inference_proof_spec.UNPROVIDED) && inference_proof_spec.NIL != literal_spec_p(conses_high.second(proof_spec)) && inference_proof_spec.NIL != transformation_module_spec_p(conses_high.third(proof_spec)) && inference_proof_spec.NIL != transformation_proof_rule_p(conses_high.fourth(proof_spec)) && inference_proof_spec.NIL != proof_spec_or_nothing_p(conses_high.fifth(proof_spec)));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-proof-spec.lisp", position = 8716L)
    public static SubLObject branching_proof_spec_p(final SubLObject operator, final SubLObject proof_spec) {
        return (SubLObject)SubLObjectFactory.makeBoolean(operator.eql(proof_spec.first()) && inference_proof_spec.NIL != list_utilities.lengthG(proof_spec.rest(), (SubLObject)inference_proof_spec.ZERO_INTEGER, (SubLObject)inference_proof_spec.UNPROVIDED) && inference_proof_spec.NIL != list_utilities.list_of_type_p((SubLObject)inference_proof_spec.$sym3$PROOF_SPEC_P, proof_spec.rest()));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-proof-spec.lisp", position = 8934L)
    public static SubLObject inference_module_spec_p(final SubLObject module_spec, final SubLObject module_name_fn, final SubLObject module_type_checker_fn) {
        return (SubLObject)SubLObjectFactory.makeBoolean(inference_proof_spec.$kw0$ANYTHING == module_spec || inference_proof_spec.NIL != Functions.funcall(module_name_fn, module_spec) || (module_spec.isCons() && (inference_proof_spec.NIL != negated_module_spec_p(module_spec, module_type_checker_fn) || inference_proof_spec.NIL != conjunctive_module_spec_p(module_spec, module_type_checker_fn) || inference_proof_spec.NIL != disjunctive_module_spec_p(module_spec, module_type_checker_fn))));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-proof-spec.lisp", position = 9413L)
    public static SubLObject negated_module_spec_p(final SubLObject module_spec, final SubLObject module_type_checker_fn) {
        return (SubLObject)SubLObjectFactory.makeBoolean(module_spec.isCons() && inference_proof_spec.$kw21$NOT == module_spec.first() && inference_proof_spec.NIL != list_utilities.lengthE(module_spec, (SubLObject)inference_proof_spec.TWO_INTEGER, (SubLObject)inference_proof_spec.UNPROVIDED) && inference_proof_spec.NIL != Functions.funcall(module_type_checker_fn, conses_high.second(module_spec)));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-proof-spec.lisp", position = 9666L)
    public static SubLObject conjunctive_module_spec_p(final SubLObject module_spec, final SubLObject module_type_checker_fn) {
        return (SubLObject)SubLObjectFactory.makeBoolean(module_spec.isCons() && inference_proof_spec.$kw22$AND == module_spec.first() && inference_proof_spec.NIL != list_utilities.lengthG(module_spec, (SubLObject)inference_proof_spec.ONE_INTEGER, (SubLObject)inference_proof_spec.UNPROVIDED) && inference_proof_spec.NIL != list_utilities.list_of_type_p(module_type_checker_fn, module_spec.rest()));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-proof-spec.lisp", position = 9928L)
    public static SubLObject disjunctive_module_spec_p(final SubLObject module_spec, final SubLObject module_type_checker_fn) {
        return (SubLObject)SubLObjectFactory.makeBoolean(module_spec.isCons() && inference_proof_spec.$kw2$OR == module_spec.first() && inference_proof_spec.NIL != list_utilities.lengthG(module_spec, (SubLObject)inference_proof_spec.ONE_INTEGER, (SubLObject)inference_proof_spec.UNPROVIDED) && inference_proof_spec.NIL != list_utilities.list_of_type_p(module_type_checker_fn, module_spec.rest()));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-proof-spec.lisp", position = 10189L)
    public static SubLObject single_literal_proof_spec_hl_sentence(final SubLObject proof_spec) {
        assert inference_proof_spec.NIL != single_literal_proof_spec_p(proof_spec) : proof_spec;
        return conses_high.second(proof_spec);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-proof-spec.lisp", position = 10382L)
    public static SubLObject restriction_proof_spec_restricted_proof_spec(final SubLObject proof_spec) {
        assert inference_proof_spec.NIL != restriction_proof_spec_p(proof_spec) : proof_spec;
        return conses_high.second(proof_spec);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-proof-spec.lisp", position = 10539L)
    public static SubLObject join_ordered_proof_spec_non_focal_proof_spec(final SubLObject proof_spec) {
        assert inference_proof_spec.NIL != join_ordered_proof_spec_p(proof_spec) : proof_spec;
        return conses_high.third(proof_spec);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-proof-spec.lisp", position = 10696L)
    public static SubLObject split_proof_spec_sub_proof_specs(final SubLObject proof_spec) {
        assert inference_proof_spec.NIL != split_proof_spec_p(proof_spec) : proof_spec;
        return proof_spec.rest();
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-proof-spec.lisp", position = 10833L)
    public static SubLObject join_ordered_proof_spec_focal_proof_spec(final SubLObject proof_spec) {
        assert inference_proof_spec.NIL != join_ordered_proof_spec_p(proof_spec) : proof_spec;
        return conses_high.second(proof_spec);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-proof-spec.lisp", position = 10987L)
    public static SubLObject union_proof_spec_disjunct_proof_spec(final SubLObject proof_spec) {
        assert inference_proof_spec.NIL != union_proof_spec_p(proof_spec) : proof_spec;
        return conses_high.second(proof_spec);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-proof-spec.lisp", position = 11130L)
    public static SubLObject join_ordered_focal_proof_spec_pattern(final SubLObject focal_proof_spec) {
        assert inference_proof_spec.NIL != proof_spec_p(focal_proof_spec) : focal_proof_spec;
        SubLObject hl_sentence = (SubLObject)inference_proof_spec.NIL;
        final SubLObject module_name = (SubLObject)inference_proof_spec.NIL;
        if (inference_proof_spec.NIL != single_literal_proof_spec_p(focal_proof_spec)) {
            hl_sentence = single_literal_proof_spec_hl_sentence(focal_proof_spec);
        }
        else {
            final SubLObject split = conses_high.second(conses_high.third(focal_proof_spec));
            final SubLObject removals = split.rest();
            hl_sentence = simplifier.conjoin(Mapping.mapcar((SubLObject)inference_proof_spec.$sym28$SECOND, removals), (SubLObject)inference_proof_spec.UNPROVIDED);
        }
        return hl_sentence;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-proof-spec.lisp", position = 11727L)
    public static SubLObject transformation_proof_spec_rule(final SubLObject proof_spec) {
        assert inference_proof_spec.NIL != transformation_proof_spec_p(proof_spec) : proof_spec;
        return conses_high.fourth(proof_spec);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-proof-spec.lisp", position = 11873L)
    public static SubLObject transformation_proof_spec_supporting_proof_spec(final SubLObject proof_spec) {
        assert inference_proof_spec.NIL != transformation_proof_spec_p(proof_spec) : proof_spec;
        return conses_high.fifth(proof_spec);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-proof-spec.lisp", position = 12035L)
    public static SubLObject residual_transformation_proof_spec_rule(final SubLObject proof_spec) {
        assert inference_proof_spec.NIL != residual_transformation_proof_spec_p(proof_spec) : proof_spec;
        return conses_high.fourth(proof_spec);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-proof-spec.lisp", position = 12199L)
    public static SubLObject residual_transformation_proof_spec_supporting_proof_spec(final SubLObject proof_spec) {
        assert inference_proof_spec.NIL != residual_transformation_proof_spec_p(proof_spec) : proof_spec;
        return conses_high.fifth(proof_spec);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-proof-spec.lisp", position = 12379L)
    public static SubLObject proof_spec_literal_spec(final SubLObject proof_spec) {
        if (inference_proof_spec.NIL != removal_proof_spec_p(proof_spec)) {
            return single_literal_proof_spec_hl_sentence(proof_spec);
        }
        if (inference_proof_spec.NIL != transformation_proof_spec_p(proof_spec)) {
            return single_literal_proof_spec_hl_sentence(proof_spec);
        }
        if (inference_proof_spec.NIL != residual_transformation_proof_spec_p(proof_spec)) {
            return single_literal_proof_spec_hl_sentence(proof_spec);
        }
        return (SubLObject)inference_proof_spec.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-proof-spec.lisp", position = 12881L)
    public static SubLObject join_ordered_proof_spec_from_residual_transformation_proof_spec(final SubLObject residual_transformation_proof_spec) {
        SubLObject rt_token = (SubLObject)inference_proof_spec.NIL;
        SubLObject literal_spec = (SubLObject)inference_proof_spec.NIL;
        SubLObject transformation_module_spec = (SubLObject)inference_proof_spec.NIL;
        SubLObject rule_spec = (SubLObject)inference_proof_spec.NIL;
        SubLObject sub_proof_spec = (SubLObject)inference_proof_spec.NIL;
        cdestructuring_bind.destructuring_bind_must_consp(residual_transformation_proof_spec, residual_transformation_proof_spec, (SubLObject)inference_proof_spec.$list31);
        rt_token = residual_transformation_proof_spec.first();
        SubLObject current = residual_transformation_proof_spec.rest();
        cdestructuring_bind.destructuring_bind_must_consp(current, residual_transformation_proof_spec, (SubLObject)inference_proof_spec.$list31);
        literal_spec = current.first();
        current = current.rest();
        cdestructuring_bind.destructuring_bind_must_consp(current, residual_transformation_proof_spec, (SubLObject)inference_proof_spec.$list31);
        transformation_module_spec = current.first();
        current = current.rest();
        cdestructuring_bind.destructuring_bind_must_consp(current, residual_transformation_proof_spec, (SubLObject)inference_proof_spec.$list31);
        rule_spec = current.first();
        current = current.rest();
        cdestructuring_bind.destructuring_bind_must_consp(current, residual_transformation_proof_spec, (SubLObject)inference_proof_spec.$list31);
        sub_proof_spec = current.first();
        current = current.rest();
        if (inference_proof_spec.NIL == current) {
            final SubLObject transformation_proof_spec = (SubLObject)ConsesLow.listS((SubLObject)inference_proof_spec.$kw11$TRANSFORMATION, literal_spec, transformation_module_spec, rule_spec, (SubLObject)inference_proof_spec.$list32);
            final SubLObject join_ordered_proof_spec = (SubLObject)ConsesLow.listS((SubLObject)inference_proof_spec.$kw8$JOIN_ORDERED, transformation_proof_spec, (SubLObject)inference_proof_spec.$list32);
            return join_ordered_proof_spec;
        }
        cdestructuring_bind.cdestructuring_bind_error(residual_transformation_proof_spec, (SubLObject)inference_proof_spec.$list31);
        return (SubLObject)inference_proof_spec.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-proof-spec.lisp", position = 13507L)
    public static SubLObject filter_proof_specs_of_type(final SubLObject proof_spec, final SubLObject proof_spec_type_fn) {
        if (inference_proof_spec.NIL != Functions.funcall(proof_spec_type_fn, proof_spec)) {
            return proof_spec;
        }
        if (inference_proof_spec.NIL == or_pattern_p(proof_spec)) {
            return (SubLObject)inference_proof_spec.NIL;
        }
        SubLObject operator = (SubLObject)inference_proof_spec.NIL;
        cdestructuring_bind.destructuring_bind_must_consp(proof_spec, proof_spec, (SubLObject)inference_proof_spec.$list33);
        operator = proof_spec.first();
        final SubLObject sub_proof_specs;
        final SubLObject current = sub_proof_specs = proof_spec.rest();
        SubLObject filtered_proof_specs = (SubLObject)inference_proof_spec.NIL;
        SubLObject cdolist_list_var = sub_proof_specs;
        SubLObject sub_proof_spec = (SubLObject)inference_proof_spec.NIL;
        sub_proof_spec = cdolist_list_var.first();
        while (inference_proof_spec.NIL != cdolist_list_var) {
            final SubLObject filtered_sub_proof_spec = filter_proof_specs_of_type(sub_proof_spec, proof_spec_type_fn);
            if (inference_proof_spec.NIL != or_pattern_p(filtered_sub_proof_spec)) {
                SubLObject current_$2;
                final SubLObject datum_$1 = current_$2 = filtered_sub_proof_spec;
                SubLObject operator_$3 = (SubLObject)inference_proof_spec.NIL;
                cdestructuring_bind.destructuring_bind_must_consp(current_$2, datum_$1, (SubLObject)inference_proof_spec.$list34);
                operator_$3 = current_$2.first();
                current_$2 = current_$2.rest();
                SubLObject cdolist_list_var_$4;
                final SubLObject sub_results = cdolist_list_var_$4 = current_$2;
                SubLObject sub_result = (SubLObject)inference_proof_spec.NIL;
                sub_result = cdolist_list_var_$4.first();
                while (inference_proof_spec.NIL != cdolist_list_var_$4) {
                    filtered_proof_specs = (SubLObject)ConsesLow.cons(sub_result, filtered_proof_specs);
                    cdolist_list_var_$4 = cdolist_list_var_$4.rest();
                    sub_result = cdolist_list_var_$4.first();
                }
            }
            else if (inference_proof_spec.NIL != filtered_sub_proof_spec) {
                filtered_proof_specs = (SubLObject)ConsesLow.cons(filtered_sub_proof_spec, filtered_proof_specs);
            }
            cdolist_list_var = cdolist_list_var.rest();
            sub_proof_spec = cdolist_list_var.first();
        }
        if (inference_proof_spec.NIL != filtered_proof_specs) {
            return merge_proof_specs(filtered_proof_specs);
        }
        return (SubLObject)inference_proof_spec.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-proof-spec.lisp", position = 14866L)
    public static SubLObject compute_proof_spec(final SubLObject proof) {
        assert inference_proof_spec.NIL != inference_datastructures_proof.proof_p(proof) : proof;
        return compute_proof_spec_recursive(proof);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-proof-spec.lisp", position = 15090L)
    public static SubLObject compute_proof_spec_recursive(final SubLObject proof) {
        if (inference_proof_spec.NIL != inference_worker_removal.removal_proof_p(proof)) {
            return compute_removal_proof_spec(proof);
        }
        if (inference_proof_spec.NIL != inference_worker_transformation.transformation_proof_p(proof)) {
            return compute_transformation_proof_spec(proof);
        }
        if (inference_proof_spec.NIL != inference_worker_residual_transformation.residual_transformation_proof_p(proof)) {
            return compute_residual_transformation_proof_spec(proof);
        }
        if (inference_proof_spec.NIL != conjunctive_removal_restriction_proof_p(proof)) {
            return compute_conjunctive_removal_restriction_proof_spec(proof);
        }
        if (inference_proof_spec.NIL != inference_worker.structural_proof_p(proof)) {
            return compute_structural_proof_spec(proof);
        }
        if (inference_proof_spec.NIL != inference_worker_rewrite.rewrite_proof_p(proof)) {
            return compute_rewrite_proof_spec(proof);
        }
        return Errors.error((SubLObject)inference_proof_spec.$str36$time_to_support__S_proofs, inference_datastructures_proof.proof_type(proof));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-proof-spec.lisp", position = 15785L)
    public static SubLObject compute_removal_proof_spec(final SubLObject proof) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        thread.resetMultipleValues();
        final SubLObject hl_sentence = extract_single_literal_proof_info_for_proof_spec(proof);
        final SubLObject module_name = thread.secondMultipleValue();
        thread.resetMultipleValues();
        return (SubLObject)ConsesLow.list((SubLObject)inference_proof_spec.$kw9$REMOVAL, hl_sentence, module_name);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-proof-spec.lisp", position = 16080L)
    public static SubLObject compute_transformation_proof_spec(final SubLObject proof) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        thread.resetMultipleValues();
        final SubLObject hl_sentence = extract_single_literal_proof_info_for_proof_spec(proof);
        final SubLObject module_name = thread.secondMultipleValue();
        thread.resetMultipleValues();
        final SubLObject rule = inference_worker_transformation.transformation_proof_rule_assertion(proof);
        final SubLObject subproof = inference_worker_transformation.transformation_proof_subproof(proof);
        SubLObject subspec = (SubLObject)inference_proof_spec.$kw1$NOTHING;
        if (inference_proof_spec.NIL != subproof) {
            subspec = compute_proof_spec_recursive(subproof);
        }
        return (SubLObject)ConsesLow.list((SubLObject)inference_proof_spec.$kw11$TRANSFORMATION, hl_sentence, module_name, rule, subspec);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-proof-spec.lisp", position = 16661L)
    public static SubLObject compute_rewrite_proof_spec(final SubLObject proof) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        thread.resetMultipleValues();
        final SubLObject hl_sentence = extract_single_literal_proof_info_for_proof_spec(proof);
        final SubLObject module_name = thread.secondMultipleValue();
        thread.resetMultipleValues();
        final SubLObject subproof = inference_datastructures_proof.proof_sole_subproof(proof);
        final SubLObject subspec = compute_proof_spec_recursive(subproof);
        return (SubLObject)ConsesLow.list((SubLObject)inference_proof_spec.$kw13$REWRITE, hl_sentence, module_name, subspec);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-proof-spec.lisp", position = 17252L)
    public static SubLObject compute_residual_transformation_proof_spec(final SubLObject proof) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject module = inference_worker.content_proof_hl_module(proof);
        final SubLObject module_name = inference_modules.hl_module_name(module);
        final SubLObject proof_bindings = inference_datastructures_proof.proof_bindings(proof);
        final SubLObject rt_link = inference_datastructures_proof.proof_link(proof);
        final SubLObject jo_link = inference_worker_residual_transformation.residual_transformation_link_motivating_join_ordered_link(rt_link);
        final SubLObject focal_mapped_problem = inference_worker_join_ordered.join_ordered_link_focal_mapped_problem(jo_link);
        final SubLObject focal_query = inference_datastructures_problem.problem_query(inference_datastructures_problem_link.mapped_problem_problem(focal_mapped_problem));
        final SubLObject focal_to_supported_variable_map = inference_datastructures_problem_link.mapped_problem_variable_map(focal_mapped_problem);
        final SubLObject lifted_focal_query = bindings.apply_bindings(focal_to_supported_variable_map, focal_query);
        final SubLObject lifted_proven_focal_query = bindings.apply_bindings(proof_bindings, lifted_focal_query);
        thread.resetMultipleValues();
        final SubLObject mt = inference_datastructures_problem_query.mt_asent_sense_from_singleton_query(lifted_proven_focal_query);
        final SubLObject asent = thread.secondMultipleValue();
        final SubLObject sense = thread.thirdMultipleValue();
        thread.resetMultipleValues();
        final SubLObject literal = clause_utilities.asent_sense_to_literal(asent, sense);
        final SubLObject hl_sentence = el_utilities.make_ist_sentence(mt, literal);
        final SubLObject rule = inference_worker_residual_transformation.residual_transformation_proof_rule_assertion(proof);
        final SubLObject subproof = inference_worker_residual_transformation.residual_transformation_proof_subproof(proof);
        final SubLObject subspec = compute_proof_spec_recursive(subproof);
        return (SubLObject)ConsesLow.list((SubLObject)inference_proof_spec.$kw12$RESIDUAL_TRANSFORMATION, hl_sentence, module_name, rule, subspec);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-proof-spec.lisp", position = 18719L)
    public static SubLObject conjunctive_removal_restriction_proof_p(final SubLObject v_object) {
        if (inference_proof_spec.NIL != inference_worker_restriction.restriction_proof_p(v_object)) {
            final SubLObject module = inference_worker_restriction.restriction_proof_hl_module(v_object);
            if (inference_proof_spec.NIL != module) {
                return inference_modules.conjunctive_removal_module_p(module);
            }
        }
        return (SubLObject)inference_proof_spec.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-proof-spec.lisp", position = 18993L)
    public static SubLObject compute_conjunctive_removal_restriction_proof_spec(final SubLObject proof) {
        final SubLObject module = inference_worker_restriction.restriction_proof_hl_module(proof);
        final SubLObject module_name = inference_modules.hl_module_name(module);
        final SubLObject subspec = compute_structural_proof_spec(proof);
        return (SubLObject)ConsesLow.list((SubLObject)inference_proof_spec.$kw10$CONJUNCTIVE_REMOVAL, module_name, subspec);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-proof-spec.lisp", position = 19346L)
    public static SubLObject extract_single_literal_proof_info_for_proof_spec(final SubLObject proof) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject module = inference_worker.content_proof_hl_module(proof);
        final SubLObject module_name = inference_modules.hl_module_name(module);
        final SubLObject proven_query = inference_worker.proof_proven_query(proof);
        thread.resetMultipleValues();
        final SubLObject mt = inference_datastructures_problem_query.mt_asent_sense_from_singleton_query(proven_query);
        final SubLObject asent = thread.secondMultipleValue();
        final SubLObject sense = thread.thirdMultipleValue();
        thread.resetMultipleValues();
        final SubLObject literal = clause_utilities.asent_sense_to_literal(asent, sense);
        final SubLObject hl_sentence = el_utilities.make_ist_sentence(mt, literal);
        return Values.values(hl_sentence, module_name);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-proof-spec.lisp", position = 19820L)
    public static SubLObject compute_structural_proof_spec(final SubLObject proof) {
        assert inference_proof_spec.NIL != inference_worker.structural_proof_p(proof) : proof;
        final SubLObject type = inference_datastructures_proof.proof_type(proof);
        SubLObject subspecs = (SubLObject)inference_proof_spec.NIL;
        SubLObject cdolist_list_var = inference_datastructures_proof.proof_direct_subproofs(proof);
        SubLObject subproof = (SubLObject)inference_proof_spec.NIL;
        subproof = cdolist_list_var.first();
        while (inference_proof_spec.NIL != cdolist_list_var) {
            final SubLObject subspec = compute_proof_spec_recursive(subproof);
            subspecs = (SubLObject)ConsesLow.cons(subspec, subspecs);
            cdolist_list_var = cdolist_list_var.rest();
            subproof = cdolist_list_var.first();
        }
        return reader.bq_cons(type, ConsesLow.append(Sequences.nreverse(subspecs), (SubLObject)inference_proof_spec.NIL));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-proof-spec.lisp", position = 20150L)
    public static SubLObject inference_proof_spec(final SubLObject inference) {
        return merge_proof_specs(inference_all_answer_proof_specs(inference));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-proof-spec.lisp", position = 20343L)
    public static SubLObject inference_first_answer_proof_spec(final SubLObject inference) {
        assert inference_proof_spec.NIL != inference_datastructures_inference.inference_p(inference) : inference;
        return compute_proof_spec(inference_datastructures_inference.inference_first_proof(inference));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-proof-spec.lisp", position = 20509L)
    public static SubLObject inference_all_answer_proof_specs(final SubLObject inference) {
        assert inference_proof_spec.NIL != inference_datastructures_inference.inference_p(inference) : inference;
        final SubLObject answer_proofs = inference_datastructures_inference.inference_all_answer_proofs(inference);
        SubLObject proof_specs = (SubLObject)inference_proof_spec.NIL;
        SubLObject cdolist_list_var = answer_proofs;
        SubLObject answer_proof = (SubLObject)inference_proof_spec.NIL;
        answer_proof = cdolist_list_var.first();
        while (inference_proof_spec.NIL != cdolist_list_var) {
            proof_specs = (SubLObject)ConsesLow.cons(compute_proof_spec(answer_proof), proof_specs);
            cdolist_list_var = cdolist_list_var.rest();
            answer_proof = cdolist_list_var.first();
        }
        return Sequences.nreverse(proof_specs);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-proof-spec.lisp", position = 20833L)
    public static SubLObject failed_inference_proof_spec(final SubLObject inference) {
        final SubLObject visited = set.new_set((SubLObject)inference_proof_spec.UNPROVIDED, (SubLObject)inference_proof_spec.UNPROVIDED);
        final SubLObject root_problem = inference_datastructures_inference.inference_root_problem(inference);
        if (inference_proof_spec.NIL != root_problem_has_top_level_disjunctP(root_problem)) {
            return failed_inference_union_problem_proof_spec(root_problem, visited);
        }
        return failed_inference_problem_proof_spec(root_problem, visited);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-proof-spec.lisp", position = 21422L)
    public static SubLObject root_problem_has_top_level_disjunctP(final SubLObject root_problem) {
        return inference_worker_union.union_tactic_p(inference_datastructures_problem.problem_executed_tactics(root_problem).first());
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-proof-spec.lisp", position = 21601L)
    public static SubLObject with_failed_proof_spec_for_object(final SubLObject macroform, final SubLObject environment) {
        SubLObject current;
        final SubLObject datum = current = macroform.rest();
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)inference_proof_spec.$list39);
        final SubLObject temp = current.rest();
        current = current.first();
        SubLObject proof_spec = (SubLObject)inference_proof_spec.NIL;
        SubLObject v_object = (SubLObject)inference_proof_spec.NIL;
        SubLObject visited = (SubLObject)inference_proof_spec.NIL;
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)inference_proof_spec.$list39);
        proof_spec = current.first();
        current = current.rest();
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)inference_proof_spec.$list39);
        v_object = current.first();
        current = current.rest();
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)inference_proof_spec.$list39);
        visited = current.first();
        current = current.rest();
        final SubLObject combinator = (SubLObject)(current.isCons() ? current.first() : inference_proof_spec.$kw2$OR);
        cdestructuring_bind.destructuring_bind_must_listp(current, datum, (SubLObject)inference_proof_spec.$list39);
        current = current.rest();
        if (inference_proof_spec.NIL == current) {
            final SubLObject body;
            current = (body = temp);
            return (SubLObject)ConsesLow.list((SubLObject)inference_proof_spec.$sym40$CLET, (SubLObject)ConsesLow.list((SubLObject)ConsesLow.list(proof_spec)), (SubLObject)ConsesLow.list((SubLObject)inference_proof_spec.$sym41$SET_ADD, v_object, visited), reader.bq_cons((SubLObject)inference_proof_spec.$sym42$PROGN, ConsesLow.append(body, (SubLObject)inference_proof_spec.NIL)), (SubLObject)ConsesLow.list((SubLObject)inference_proof_spec.$sym43$CSETQ, proof_spec, (SubLObject)ConsesLow.list((SubLObject)inference_proof_spec.$sym44$DELETE, (SubLObject)inference_proof_spec.$kw45$IGNORE, proof_spec)), (SubLObject)ConsesLow.list((SubLObject)inference_proof_spec.$sym46$PCOND, (SubLObject)ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)inference_proof_spec.$sym47$NULL, proof_spec), (SubLObject)ConsesLow.listS((SubLObject)inference_proof_spec.$sym43$CSETQ, proof_spec, (SubLObject)inference_proof_spec.$list48)), (SubLObject)ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)inference_proof_spec.$sym49$SINGLETON_, proof_spec), (SubLObject)ConsesLow.list((SubLObject)inference_proof_spec.$sym43$CSETQ, proof_spec, (SubLObject)ConsesLow.list((SubLObject)inference_proof_spec.$sym50$FIRST, proof_spec))), (SubLObject)ConsesLow.list((SubLObject)inference_proof_spec.T, (SubLObject)ConsesLow.list((SubLObject)inference_proof_spec.$sym43$CSETQ, proof_spec, (SubLObject)ConsesLow.list((SubLObject)inference_proof_spec.$sym51$NREVERSE, proof_spec)), (SubLObject)ConsesLow.list((SubLObject)inference_proof_spec.$sym52$CPUSH, combinator, proof_spec))), (SubLObject)ConsesLow.list((SubLObject)inference_proof_spec.$sym53$RET, proof_spec));
        }
        cdestructuring_bind.cdestructuring_bind_error(datum, (SubLObject)inference_proof_spec.$list39);
        return (SubLObject)inference_proof_spec.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-proof-spec.lisp", position = 22294L)
    public static SubLObject failed_inference_union_problem_proof_spec(final SubLObject root_problem, final SubLObject visited) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject proof_spec = (SubLObject)inference_proof_spec.NIL;
        set.set_add(root_problem, visited);
        SubLObject cdolist_list_var = inference_datastructures_problem.problem_executed_tactics(root_problem);
        SubLObject tactic = (SubLObject)inference_proof_spec.NIL;
        tactic = cdolist_list_var.first();
        while (inference_proof_spec.NIL != cdolist_list_var) {
            if (inference_proof_spec.NIL == Errors.$ignore_mustsP$.getDynamicValue(thread) && inference_proof_spec.NIL == inference_worker_union.union_tactic_p(tactic)) {
                Errors.error((SubLObject)inference_proof_spec.$str54$Non_union_tactic__A_mixed_in_with, tactic);
            }
            final SubLObject disjunct_mapped_problem = inference_worker_union.find_union_tactic_disjunct_mapped_problem(tactic, (SubLObject)inference_proof_spec.NIL);
            final SubLObject problem = inference_datastructures_problem_link.mapped_problem_problem(disjunct_mapped_problem);
            proof_spec = (SubLObject)ConsesLow.cons(failed_inference_problem_proof_spec(problem, visited), proof_spec);
            cdolist_list_var = cdolist_list_var.rest();
            tactic = cdolist_list_var.first();
        }
        proof_spec = Sequences.delete((SubLObject)inference_proof_spec.$kw45$IGNORE, proof_spec, (SubLObject)inference_proof_spec.UNPROVIDED, (SubLObject)inference_proof_spec.UNPROVIDED, (SubLObject)inference_proof_spec.UNPROVIDED, (SubLObject)inference_proof_spec.UNPROVIDED, (SubLObject)inference_proof_spec.UNPROVIDED);
        if (inference_proof_spec.NIL == proof_spec) {
            proof_spec = (SubLObject)inference_proof_spec.$kw0$ANYTHING;
        }
        else if (inference_proof_spec.NIL != list_utilities.singletonP(proof_spec)) {
            proof_spec = proof_spec.first();
        }
        else {
            proof_spec = Sequences.nreverse(proof_spec);
            proof_spec = (SubLObject)ConsesLow.cons((SubLObject)inference_proof_spec.$kw4$UNION, proof_spec);
        }
        return proof_spec;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-proof-spec.lisp", position = 22921L)
    public static SubLObject failed_inference_problem_proof_spec(final SubLObject problem, final SubLObject visited) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject proof_spec = (SubLObject)inference_proof_spec.NIL;
        set.set_add(problem, visited);
        if (inference_datastructures_problem.problem_proof_count(problem, (SubLObject)inference_proof_spec.UNPROVIDED).isPositive()) {
            SubLObject sub_proof_specs = (SubLObject)inference_proof_spec.NIL;
            SubLObject iteration_state;
            for (iteration_state = dictionary_contents.do_dictionary_contents_state(inference_datastructures_problem.problem_proof_bindings_index(problem)); inference_proof_spec.NIL == dictionary_contents.do_dictionary_contents_doneP(iteration_state); iteration_state = dictionary_contents.do_dictionary_contents_next(iteration_state)) {
                thread.resetMultipleValues();
                final SubLObject v_bindings = dictionary_contents.do_dictionary_contents_key_value(iteration_state);
                final SubLObject proof_list = thread.secondMultipleValue();
                thread.resetMultipleValues();
                SubLObject cdolist_list_var = proof_list;
                SubLObject proof = (SubLObject)inference_proof_spec.NIL;
                proof = cdolist_list_var.first();
                while (inference_proof_spec.NIL != cdolist_list_var) {
                    sub_proof_specs = (SubLObject)ConsesLow.cons(compute_proof_spec(proof), sub_proof_specs);
                    cdolist_list_var = cdolist_list_var.rest();
                    proof = cdolist_list_var.first();
                }
            }
            dictionary_contents.do_dictionary_contents_finalize(iteration_state);
            proof_spec = (SubLObject)ConsesLow.cons(merge_proof_specs(sub_proof_specs), proof_spec);
        }
        else {
            final SubLObject set_contents_var = inference_datastructures_problem.problem_argument_links(problem);
            SubLObject basis_object;
            SubLObject state;
            SubLObject link;
            for (basis_object = set_contents.do_set_contents_basis_object(set_contents_var), state = (SubLObject)inference_proof_spec.NIL, state = set_contents.do_set_contents_initial_state(basis_object, set_contents_var); inference_proof_spec.NIL == set_contents.do_set_contents_doneP(basis_object, state); state = set_contents.do_set_contents_update_state(state)) {
                link = set_contents.do_set_contents_next(basis_object, state);
                if (inference_proof_spec.NIL != set_contents.do_set_contents_element_validP(state, link) && inference_proof_spec.NIL == set.set_memberP(link, visited) && inference_proof_spec.NIL != problem_link_tactic_executedP(link)) {
                    proof_spec = (SubLObject)ConsesLow.cons(failed_inference_link_proof_spec(link, visited), proof_spec);
                }
            }
        }
        proof_spec = Sequences.delete((SubLObject)inference_proof_spec.$kw45$IGNORE, proof_spec, (SubLObject)inference_proof_spec.UNPROVIDED, (SubLObject)inference_proof_spec.UNPROVIDED, (SubLObject)inference_proof_spec.UNPROVIDED, (SubLObject)inference_proof_spec.UNPROVIDED, (SubLObject)inference_proof_spec.UNPROVIDED);
        if (inference_proof_spec.NIL == proof_spec) {
            proof_spec = (SubLObject)inference_proof_spec.$kw0$ANYTHING;
        }
        else if (inference_proof_spec.NIL != list_utilities.singletonP(proof_spec)) {
            proof_spec = proof_spec.first();
        }
        else {
            proof_spec = Sequences.nreverse(proof_spec);
            proof_spec = (SubLObject)ConsesLow.cons((SubLObject)inference_proof_spec.$kw2$OR, proof_spec);
        }
        return proof_spec;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-proof-spec.lisp", position = 23653L)
    public static SubLObject failed_inference_link_proof_spec(final SubLObject link, final SubLObject visited) {
        SubLObject proof_spec = (SubLObject)inference_proof_spec.NIL;
        set.set_add(link, visited);
        final SubLObject pcase_var;
        final SubLObject type = pcase_var = inference_datastructures_problem_link.problem_link_type(link);
        if (pcase_var.eql((SubLObject)inference_proof_spec.$kw9$REMOVAL)) {
            return failed_inference_removal_link_proof_spec(link, visited);
        }
        if (pcase_var.eql((SubLObject)inference_proof_spec.$kw13$REWRITE)) {
            return failed_inference_rewrite_link_proof_spec(link, visited);
        }
        if (pcase_var.eql((SubLObject)inference_proof_spec.$kw11$TRANSFORMATION)) {
            return failed_inference_transformation_link_proof_spec(link, visited);
        }
        if (pcase_var.eql((SubLObject)inference_proof_spec.$kw55$ANSWER)) {
            return failed_inference_answer_link_proof_spec(link, visited);
        }
        if (pcase_var.eql((SubLObject)inference_proof_spec.$kw7$RESTRICTION)) {
            return failed_inference_restriction_link_proof_spec(link, visited);
        }
        if (pcase_var.eql((SubLObject)inference_proof_spec.$kw6$SPLIT)) {
            return failed_inference_split_link_proof_spec(link, visited);
        }
        if (pcase_var.eql((SubLObject)inference_proof_spec.$kw8$JOIN_ORDERED)) {
            return failed_inference_join_ordered_link_proof_spec(link, visited);
        }
        if (pcase_var.eql((SubLObject)inference_proof_spec.$kw5$JOIN)) {
            return failed_inference_join_link_proof_spec(link, visited);
        }
        if (pcase_var.eql((SubLObject)inference_proof_spec.$kw4$UNION)) {
            return failed_inference_union_link_proof_spec(link, visited);
        }
        if (pcase_var.eql((SubLObject)inference_proof_spec.$kw12$RESIDUAL_TRANSFORMATION)) {
            return failed_inference_residual_transformation_link_proof_spec(link, visited);
        }
        Errors.error((SubLObject)inference_proof_spec.$str56$Dont_know_how_to_handle_problem_l, type);
        proof_spec = Sequences.delete((SubLObject)inference_proof_spec.$kw45$IGNORE, proof_spec, (SubLObject)inference_proof_spec.UNPROVIDED, (SubLObject)inference_proof_spec.UNPROVIDED, (SubLObject)inference_proof_spec.UNPROVIDED, (SubLObject)inference_proof_spec.UNPROVIDED, (SubLObject)inference_proof_spec.UNPROVIDED);
        if (inference_proof_spec.NIL == proof_spec) {
            proof_spec = (SubLObject)inference_proof_spec.$kw0$ANYTHING;
        }
        else if (inference_proof_spec.NIL != list_utilities.singletonP(proof_spec)) {
            proof_spec = proof_spec.first();
        }
        else {
            proof_spec = Sequences.nreverse(proof_spec);
            proof_spec = (SubLObject)ConsesLow.cons((SubLObject)inference_proof_spec.$kw2$OR, proof_spec);
        }
        return proof_spec;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-proof-spec.lisp", position = 24934L)
    public static SubLObject problem_link_tactic_executedP(final SubLObject link) {
        final SubLObject pcase_var;
        final SubLObject type = pcase_var = inference_datastructures_problem_link.problem_link_type(link);
        if (pcase_var.eql((SubLObject)inference_proof_spec.$kw9$REMOVAL)) {
            return possibly_tactic_executedP(inference_worker_removal.removal_link_tactic(link));
        }
        if (pcase_var.eql((SubLObject)inference_proof_spec.$kw13$REWRITE)) {
            return possibly_tactic_executedP(inference_worker_rewrite.rewrite_link_tactic(link));
        }
        if (pcase_var.eql((SubLObject)inference_proof_spec.$kw11$TRANSFORMATION)) {
            return possibly_tactic_executedP(inference_worker_transformation.transformation_link_tactic(link));
        }
        if (pcase_var.eql((SubLObject)inference_proof_spec.$kw55$ANSWER)) {
            Errors.error((SubLObject)inference_proof_spec.$str57$What_is_an_answer_link_doing_here);
        }
        else {
            if (pcase_var.eql((SubLObject)inference_proof_spec.$kw7$RESTRICTION)) {
                return possibly_tactic_executedP(inference_worker_restriction.restriction_link_tactic(link));
            }
            if (pcase_var.eql((SubLObject)inference_proof_spec.$kw6$SPLIT)) {
                return Sequences.find_if((SubLObject)inference_proof_spec.$sym58$TACTIC_EXECUTED_, inference_worker_split.split_link_tactics(link), (SubLObject)inference_proof_spec.UNPROVIDED, (SubLObject)inference_proof_spec.UNPROVIDED, (SubLObject)inference_proof_spec.UNPROVIDED);
            }
            if (pcase_var.eql((SubLObject)inference_proof_spec.$kw8$JOIN_ORDERED)) {
                return possibly_tactic_executedP(inference_worker_join_ordered.join_ordered_link_tactic(link));
            }
            if (pcase_var.eql((SubLObject)inference_proof_spec.$kw5$JOIN)) {
                return possibly_tactic_executedP(inference_worker_join.join_link_tactic(link));
            }
            if (pcase_var.eql((SubLObject)inference_proof_spec.$kw4$UNION)) {
                return possibly_tactic_executedP(inference_worker_union.union_link_tactic(link));
            }
            if (pcase_var.eql((SubLObject)inference_proof_spec.$kw12$RESIDUAL_TRANSFORMATION)) {
                return problem_link_tactic_executedP(inference_worker_residual_transformation.residual_transformation_link_motivating_transformation_link(link));
            }
            Errors.error((SubLObject)inference_proof_spec.$str56$Dont_know_how_to_handle_problem_l, type);
        }
        return (SubLObject)inference_proof_spec.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-proof-spec.lisp", position = 26119L)
    public static SubLObject possibly_tactic_executedP(final SubLObject v_object) {
        if (inference_proof_spec.NIL != inference_datastructures_tactic.tactic_p(v_object)) {
            return inference_datastructures_tactic.tactic_executedP(v_object);
        }
        return (SubLObject)inference_proof_spec.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-proof-spec.lisp", position = 26249L)
    public static SubLObject failed_inference_removal_link_proof_spec(final SubLObject link, final SubLObject visited) {
        SubLObject proof_spec = (SubLObject)inference_proof_spec.NIL;
        set.set_add(link, visited);
        final SubLObject tactic = inference_worker_removal.removal_link_tactic(link);
        proof_spec = (SubLObject)ConsesLow.cons(failed_inference_removal_tactic_proof_spec(tactic, visited), proof_spec);
        proof_spec = Sequences.delete((SubLObject)inference_proof_spec.$kw45$IGNORE, proof_spec, (SubLObject)inference_proof_spec.UNPROVIDED, (SubLObject)inference_proof_spec.UNPROVIDED, (SubLObject)inference_proof_spec.UNPROVIDED, (SubLObject)inference_proof_spec.UNPROVIDED, (SubLObject)inference_proof_spec.UNPROVIDED);
        if (inference_proof_spec.NIL == proof_spec) {
            proof_spec = (SubLObject)inference_proof_spec.$kw0$ANYTHING;
        }
        else if (inference_proof_spec.NIL != list_utilities.singletonP(proof_spec)) {
            proof_spec = proof_spec.first();
        }
        else {
            proof_spec = Sequences.nreverse(proof_spec);
            proof_spec = (SubLObject)ConsesLow.cons((SubLObject)inference_proof_spec.$kw2$OR, proof_spec);
        }
        return proof_spec;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-proof-spec.lisp", position = 26540L)
    public static SubLObject failed_inference_rewrite_link_proof_spec(final SubLObject link, final SubLObject visited) {
        SubLObject proof_spec = (SubLObject)inference_proof_spec.NIL;
        set.set_add(link, visited);
        final SubLObject tactic = inference_worker_rewrite.rewrite_link_tactic(link);
        proof_spec = (SubLObject)ConsesLow.cons(failed_inference_rewrite_tactic_proof_spec(tactic, visited), proof_spec);
        proof_spec = Sequences.delete((SubLObject)inference_proof_spec.$kw45$IGNORE, proof_spec, (SubLObject)inference_proof_spec.UNPROVIDED, (SubLObject)inference_proof_spec.UNPROVIDED, (SubLObject)inference_proof_spec.UNPROVIDED, (SubLObject)inference_proof_spec.UNPROVIDED, (SubLObject)inference_proof_spec.UNPROVIDED);
        if (inference_proof_spec.NIL == proof_spec) {
            proof_spec = (SubLObject)inference_proof_spec.$kw0$ANYTHING;
        }
        else if (inference_proof_spec.NIL != list_utilities.singletonP(proof_spec)) {
            proof_spec = proof_spec.first();
        }
        else {
            proof_spec = Sequences.nreverse(proof_spec);
            proof_spec = (SubLObject)ConsesLow.cons((SubLObject)inference_proof_spec.$kw2$OR, proof_spec);
        }
        return proof_spec;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-proof-spec.lisp", position = 26831L)
    public static SubLObject failed_inference_transformation_link_proof_spec(final SubLObject link, final SubLObject visited) {
        SubLObject proof_spec = (SubLObject)inference_proof_spec.NIL;
        set.set_add(link, visited);
        final SubLObject tactic = inference_worker_transformation.transformation_link_tactic(link);
        proof_spec = (SubLObject)ConsesLow.cons(failed_inference_transformation_tactic_proof_spec(tactic, visited), proof_spec);
        proof_spec = Sequences.delete((SubLObject)inference_proof_spec.$kw45$IGNORE, proof_spec, (SubLObject)inference_proof_spec.UNPROVIDED, (SubLObject)inference_proof_spec.UNPROVIDED, (SubLObject)inference_proof_spec.UNPROVIDED, (SubLObject)inference_proof_spec.UNPROVIDED, (SubLObject)inference_proof_spec.UNPROVIDED);
        if (inference_proof_spec.NIL == proof_spec) {
            proof_spec = (SubLObject)inference_proof_spec.$kw0$ANYTHING;
        }
        else if (inference_proof_spec.NIL != list_utilities.singletonP(proof_spec)) {
            proof_spec = proof_spec.first();
        }
        else {
            proof_spec = Sequences.nreverse(proof_spec);
            proof_spec = (SubLObject)ConsesLow.cons((SubLObject)inference_proof_spec.$kw2$OR, proof_spec);
        }
        return proof_spec;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-proof-spec.lisp", position = 27143L)
    public static SubLObject failed_inference_answer_link_proof_spec(final SubLObject link, final SubLObject visited) {
        SubLObject proof_spec = (SubLObject)inference_proof_spec.NIL;
        set.set_add(link, visited);
        Errors.error((SubLObject)inference_proof_spec.$str59$This_should_never_be_called_);
        proof_spec = Sequences.delete((SubLObject)inference_proof_spec.$kw45$IGNORE, proof_spec, (SubLObject)inference_proof_spec.UNPROVIDED, (SubLObject)inference_proof_spec.UNPROVIDED, (SubLObject)inference_proof_spec.UNPROVIDED, (SubLObject)inference_proof_spec.UNPROVIDED, (SubLObject)inference_proof_spec.UNPROVIDED);
        if (inference_proof_spec.NIL == proof_spec) {
            proof_spec = (SubLObject)inference_proof_spec.$kw0$ANYTHING;
        }
        else if (inference_proof_spec.NIL != list_utilities.singletonP(proof_spec)) {
            proof_spec = proof_spec.first();
        }
        else {
            proof_spec = Sequences.nreverse(proof_spec);
            proof_spec = (SubLObject)ConsesLow.cons((SubLObject)inference_proof_spec.$kw2$OR, proof_spec);
        }
        return proof_spec;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-proof-spec.lisp", position = 27342L)
    public static SubLObject failed_inference_restriction_link_proof_spec(final SubLObject link, final SubLObject visited) {
        SubLObject proof_spec = (SubLObject)inference_proof_spec.NIL;
        set.set_add(link, visited);
        final SubLObject tactic = inference_worker_restriction.restriction_link_tactic(link);
        proof_spec = (SubLObject)ConsesLow.cons(failed_inference_restriction_tactic_proof_spec(tactic, visited), proof_spec);
        proof_spec = Sequences.delete((SubLObject)inference_proof_spec.$kw45$IGNORE, proof_spec, (SubLObject)inference_proof_spec.UNPROVIDED, (SubLObject)inference_proof_spec.UNPROVIDED, (SubLObject)inference_proof_spec.UNPROVIDED, (SubLObject)inference_proof_spec.UNPROVIDED, (SubLObject)inference_proof_spec.UNPROVIDED);
        if (inference_proof_spec.NIL == proof_spec) {
            proof_spec = (SubLObject)inference_proof_spec.$kw0$ANYTHING;
        }
        else if (inference_proof_spec.NIL != list_utilities.singletonP(proof_spec)) {
            proof_spec = proof_spec.first();
        }
        else {
            proof_spec = Sequences.nreverse(proof_spec);
            proof_spec = (SubLObject)ConsesLow.cons((SubLObject)inference_proof_spec.$kw2$OR, proof_spec);
        }
        return proof_spec;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-proof-spec.lisp", position = 27645L)
    public static SubLObject failed_inference_split_link_proof_spec(final SubLObject link, final SubLObject visited) {
        SubLObject proof_spec = (SubLObject)inference_proof_spec.NIL;
        set.set_add(link, visited);
        SubLObject cdolist_list_var;
        final SubLObject tactics = cdolist_list_var = inference_worker_split.split_link_tactics(link);
        SubLObject tactic = (SubLObject)inference_proof_spec.NIL;
        tactic = cdolist_list_var.first();
        while (inference_proof_spec.NIL != cdolist_list_var) {
            if (inference_proof_spec.NIL != inference_datastructures_tactic.tactic_executedP(tactic)) {
                proof_spec = (SubLObject)ConsesLow.cons(failed_inference_split_tactic_proof_spec(tactic, visited), proof_spec);
            }
            cdolist_list_var = cdolist_list_var.rest();
            tactic = cdolist_list_var.first();
        }
        proof_spec = Sequences.delete((SubLObject)inference_proof_spec.$kw45$IGNORE, proof_spec, (SubLObject)inference_proof_spec.UNPROVIDED, (SubLObject)inference_proof_spec.UNPROVIDED, (SubLObject)inference_proof_spec.UNPROVIDED, (SubLObject)inference_proof_spec.UNPROVIDED, (SubLObject)inference_proof_spec.UNPROVIDED);
        if (inference_proof_spec.NIL == proof_spec) {
            proof_spec = (SubLObject)inference_proof_spec.$kw0$ANYTHING;
        }
        else if (inference_proof_spec.NIL != list_utilities.singletonP(proof_spec)) {
            proof_spec = proof_spec.first();
        }
        else {
            proof_spec = Sequences.nreverse(proof_spec);
            proof_spec = (SubLObject)ConsesLow.cons((SubLObject)inference_proof_spec.$kw2$OR, proof_spec);
        }
        return proof_spec;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-proof-spec.lisp", position = 28011L)
    public static SubLObject failed_inference_join_link_proof_spec(final SubLObject link, final SubLObject visited) {
        SubLObject proof_spec = (SubLObject)inference_proof_spec.NIL;
        set.set_add(link, visited);
        final SubLObject tactic = inference_worker_join.join_link_tactic(link);
        proof_spec = (SubLObject)ConsesLow.cons(failed_inference_join_tactic_proof_spec(tactic, visited), proof_spec);
        proof_spec = Sequences.delete((SubLObject)inference_proof_spec.$kw45$IGNORE, proof_spec, (SubLObject)inference_proof_spec.UNPROVIDED, (SubLObject)inference_proof_spec.UNPROVIDED, (SubLObject)inference_proof_spec.UNPROVIDED, (SubLObject)inference_proof_spec.UNPROVIDED, (SubLObject)inference_proof_spec.UNPROVIDED);
        if (inference_proof_spec.NIL == proof_spec) {
            proof_spec = (SubLObject)inference_proof_spec.$kw0$ANYTHING;
        }
        else if (inference_proof_spec.NIL != list_utilities.singletonP(proof_spec)) {
            proof_spec = proof_spec.first();
        }
        else {
            proof_spec = Sequences.nreverse(proof_spec);
            proof_spec = (SubLObject)ConsesLow.cons((SubLObject)inference_proof_spec.$kw2$OR, proof_spec);
        }
        return proof_spec;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-proof-spec.lisp", position = 28293L)
    public static SubLObject failed_inference_join_ordered_link_proof_spec(final SubLObject link, final SubLObject visited) {
        SubLObject proof_spec = (SubLObject)inference_proof_spec.NIL;
        set.set_add(link, visited);
        final SubLObject tactic = inference_worker_join_ordered.join_ordered_link_tactic(link);
        proof_spec = (SubLObject)ConsesLow.cons(failed_inference_join_ordered_tactic_proof_spec(tactic, visited), proof_spec);
        proof_spec = Sequences.delete((SubLObject)inference_proof_spec.$kw45$IGNORE, proof_spec, (SubLObject)inference_proof_spec.UNPROVIDED, (SubLObject)inference_proof_spec.UNPROVIDED, (SubLObject)inference_proof_spec.UNPROVIDED, (SubLObject)inference_proof_spec.UNPROVIDED, (SubLObject)inference_proof_spec.UNPROVIDED);
        if (inference_proof_spec.NIL == proof_spec) {
            proof_spec = (SubLObject)inference_proof_spec.$kw0$ANYTHING;
        }
        else if (inference_proof_spec.NIL != list_utilities.singletonP(proof_spec)) {
            proof_spec = proof_spec.first();
        }
        else {
            proof_spec = Sequences.nreverse(proof_spec);
            proof_spec = (SubLObject)ConsesLow.cons((SubLObject)inference_proof_spec.$kw2$OR, proof_spec);
        }
        return proof_spec;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-proof-spec.lisp", position = 28599L)
    public static SubLObject failed_inference_union_link_proof_spec(final SubLObject link, final SubLObject visited) {
        SubLObject proof_spec = (SubLObject)inference_proof_spec.NIL;
        set.set_add(link, visited);
        Errors.error((SubLObject)inference_proof_spec.$str60$This_should_only_occur_at_the_top);
        proof_spec = Sequences.delete((SubLObject)inference_proof_spec.$kw45$IGNORE, proof_spec, (SubLObject)inference_proof_spec.UNPROVIDED, (SubLObject)inference_proof_spec.UNPROVIDED, (SubLObject)inference_proof_spec.UNPROVIDED, (SubLObject)inference_proof_spec.UNPROVIDED, (SubLObject)inference_proof_spec.UNPROVIDED);
        if (inference_proof_spec.NIL == proof_spec) {
            proof_spec = (SubLObject)inference_proof_spec.$kw0$ANYTHING;
        }
        else if (inference_proof_spec.NIL != list_utilities.singletonP(proof_spec)) {
            proof_spec = proof_spec.first();
        }
        else {
            proof_spec = Sequences.nreverse(proof_spec);
            proof_spec = (SubLObject)ConsesLow.cons((SubLObject)inference_proof_spec.$kw2$OR, proof_spec);
        }
        return proof_spec;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-proof-spec.lisp", position = 28809L)
    public static SubLObject failed_inference_residual_transformation_link_proof_spec(final SubLObject link, final SubLObject visited) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject proof_spec = (SubLObject)inference_proof_spec.NIL;
        set.set_add(link, visited);
        final SubLObject jo_link = inference_worker_residual_transformation.residual_transformation_link_motivating_join_ordered_link(link);
        final SubLObject focal_mapped_problem = inference_worker_join_ordered.join_ordered_link_focal_mapped_problem(jo_link);
        final SubLObject focal_query = inference_datastructures_problem.problem_query(inference_datastructures_problem_link.mapped_problem_problem(focal_mapped_problem));
        final SubLObject focal_to_supported_variable_map = inference_datastructures_problem_link.mapped_problem_variable_map(focal_mapped_problem);
        final SubLObject lifted_focal_query = bindings.apply_bindings(focal_to_supported_variable_map, focal_query);
        SubLObject tr_module = (SubLObject)inference_proof_spec.$kw0$ANYTHING;
        SubLObject tr_rule = (SubLObject)inference_proof_spec.$kw0$ANYTHING;
        final SubLObject tr_link = inference_worker_residual_transformation.residual_transformation_link_motivating_transformation_link(link);
        final SubLObject tactic = inference_worker_transformation.transformation_link_tactic(tr_link);
        final SubLObject hl_module = inference_datastructures_tactic.tactic_hl_module(tactic);
        final SubLObject module_name = inference_modules.hl_module_name(hl_module);
        final SubLObject rule = inference_worker_transformation.transformation_tactic_lookahead_rule(tactic);
        if (inference_proof_spec.NIL != module_name) {
            tr_module = module_name;
        }
        if (inference_proof_spec.NIL != rule) {
            tr_rule = rule;
        }
        thread.resetMultipleValues();
        final SubLObject mt = inference_datastructures_problem_query.mt_asent_sense_from_singleton_query(lifted_focal_query);
        final SubLObject asent = thread.secondMultipleValue();
        final SubLObject sense = thread.thirdMultipleValue();
        thread.resetMultipleValues();
        final SubLObject literal = clause_utilities.asent_sense_to_literal(asent, sense);
        final SubLObject hl_sentence = el_utilities.make_ist_sentence(mt, literal);
        final SubLObject rt_proof_spec = (SubLObject)ConsesLow.list((SubLObject)inference_proof_spec.$kw12$RESIDUAL_TRANSFORMATION, hl_sentence, tr_module, tr_rule, (SubLObject)inference_proof_spec.$kw1$NOTHING);
        proof_spec = (SubLObject)ConsesLow.cons(rt_proof_spec, proof_spec);
        proof_spec = Sequences.delete((SubLObject)inference_proof_spec.$kw45$IGNORE, proof_spec, (SubLObject)inference_proof_spec.UNPROVIDED, (SubLObject)inference_proof_spec.UNPROVIDED, (SubLObject)inference_proof_spec.UNPROVIDED, (SubLObject)inference_proof_spec.UNPROVIDED, (SubLObject)inference_proof_spec.UNPROVIDED);
        if (inference_proof_spec.NIL == proof_spec) {
            proof_spec = (SubLObject)inference_proof_spec.$kw0$ANYTHING;
        }
        else if (inference_proof_spec.NIL != list_utilities.singletonP(proof_spec)) {
            proof_spec = proof_spec.first();
        }
        else {
            proof_spec = Sequences.nreverse(proof_spec);
            proof_spec = (SubLObject)ConsesLow.cons((SubLObject)inference_proof_spec.$kw2$OR, proof_spec);
        }
        return proof_spec;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-proof-spec.lisp", position = 30642L)
    public static SubLObject failed_inference_tactic_proof_spec(final SubLObject tactic, final SubLObject visited) {
        if (inference_proof_spec.NIL != inference_worker_removal.removal_tactic_p(tactic)) {
            return failed_inference_removal_tactic_proof_spec(tactic, visited);
        }
        if (inference_proof_spec.NIL != inference_worker_split.split_tactic_p(tactic)) {
            return failed_inference_split_tactic_proof_spec(tactic, visited);
        }
        if (inference_proof_spec.NIL != inference_worker_join_ordered.join_ordered_tactic_p(tactic)) {
            return failed_inference_join_ordered_tactic_proof_spec(tactic, visited);
        }
        if (inference_proof_spec.NIL != inference_worker_join.join_tactic_p(tactic)) {
            return failed_inference_join_tactic_proof_spec(tactic, visited);
        }
        if (inference_proof_spec.NIL != inference_worker_union.union_tactic_p(tactic)) {
            Errors.error((SubLObject)inference_proof_spec.$str61$Union_tactics_can_only_occur_at_t);
        }
        else {
            if (inference_proof_spec.NIL != inference_worker_transformation.transformation_tactic_p(tactic)) {
                return failed_inference_transformation_tactic_proof_spec(tactic, visited);
            }
            if (inference_proof_spec.NIL != inference_worker_rewrite.rewrite_tactic_p(tactic)) {
                return failed_inference_rewrite_tactic_proof_spec(tactic, visited);
            }
            Errors.error((SubLObject)inference_proof_spec.$str62$Dont_know_how_to_compute_the_proo, tactic);
        }
        return (SubLObject)inference_proof_spec.$kw0$ANYTHING;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-proof-spec.lisp", position = 31715L)
    public static SubLObject failed_inference_removal_tactic_proof_spec(final SubLObject tactic, final SubLObject visited) {
        SubLObject proof_spec = (SubLObject)inference_proof_spec.NIL;
        set.set_add(tactic, visited);
        final SubLObject hl_module = inference_datastructures_tactic.tactic_hl_module(tactic);
        final SubLObject module_name = inference_modules.hl_module_name(hl_module);
        final SubLObject problem_query = inference_datastructures_problem.problem_query(inference_datastructures_tactic.tactic_problem(tactic));
        final SubLObject literal = hl_asent_from_problem_query(problem_query);
        proof_spec = (SubLObject)ConsesLow.cons((SubLObject)ConsesLow.list((SubLObject)inference_proof_spec.$kw9$REMOVAL, literal, module_name), proof_spec);
        proof_spec = Sequences.delete((SubLObject)inference_proof_spec.$kw45$IGNORE, proof_spec, (SubLObject)inference_proof_spec.UNPROVIDED, (SubLObject)inference_proof_spec.UNPROVIDED, (SubLObject)inference_proof_spec.UNPROVIDED, (SubLObject)inference_proof_spec.UNPROVIDED, (SubLObject)inference_proof_spec.UNPROVIDED);
        if (inference_proof_spec.NIL == proof_spec) {
            proof_spec = (SubLObject)inference_proof_spec.$kw0$ANYTHING;
        }
        else if (inference_proof_spec.NIL != list_utilities.singletonP(proof_spec)) {
            proof_spec = proof_spec.first();
        }
        else {
            proof_spec = Sequences.nreverse(proof_spec);
            proof_spec = (SubLObject)ConsesLow.cons((SubLObject)inference_proof_spec.$kw2$OR, proof_spec);
        }
        return proof_spec;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-proof-spec.lisp", position = 32174L)
    public static SubLObject failed_inference_split_tactic_proof_spec(final SubLObject tactic, final SubLObject visited) {
        SubLObject proof_spec = (SubLObject)inference_proof_spec.NIL;
        set.set_add(tactic, visited);
        proof_spec = Sequences.delete((SubLObject)inference_proof_spec.$kw45$IGNORE, proof_spec, (SubLObject)inference_proof_spec.UNPROVIDED, (SubLObject)inference_proof_spec.UNPROVIDED, (SubLObject)inference_proof_spec.UNPROVIDED, (SubLObject)inference_proof_spec.UNPROVIDED, (SubLObject)inference_proof_spec.UNPROVIDED);
        if (inference_proof_spec.NIL == proof_spec) {
            proof_spec = (SubLObject)inference_proof_spec.$kw0$ANYTHING;
        }
        else if (inference_proof_spec.NIL != list_utilities.singletonP(proof_spec)) {
            proof_spec = proof_spec.first();
        }
        else {
            proof_spec = Sequences.nreverse(proof_spec);
            proof_spec = (SubLObject)ConsesLow.cons((SubLObject)inference_proof_spec.$kw6$SPLIT, proof_spec);
        }
        return proof_spec;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-proof-spec.lisp", position = 32347L)
    public static SubLObject failed_inference_join_ordered_tactic_proof_spec(final SubLObject tactic, final SubLObject visited) {
        SubLObject proof_spec = (SubLObject)inference_proof_spec.NIL;
        set.set_add(tactic, visited);
        final SubLObject focal_mapped = inference_worker_join_ordered.find_or_create_join_ordered_tactic_focal_mapped_problem(tactic);
        final SubLObject non_focal_mapped = inference_worker_join_ordered.find_or_create_join_ordered_tactic_non_focal_mapped_problem(tactic);
        final SubLObject focal = inference_datastructures_problem_link.mapped_problem_problem(focal_mapped);
        final SubLObject non_focal = inference_datastructures_problem_link.mapped_problem_problem(non_focal_mapped);
        proof_spec = (SubLObject)ConsesLow.cons(failed_inference_problem_proof_spec(focal, visited), proof_spec);
        proof_spec = (SubLObject)ConsesLow.cons(failed_inference_problem_proof_spec(non_focal, visited), proof_spec);
        proof_spec = Sequences.delete((SubLObject)inference_proof_spec.$kw45$IGNORE, proof_spec, (SubLObject)inference_proof_spec.UNPROVIDED, (SubLObject)inference_proof_spec.UNPROVIDED, (SubLObject)inference_proof_spec.UNPROVIDED, (SubLObject)inference_proof_spec.UNPROVIDED, (SubLObject)inference_proof_spec.UNPROVIDED);
        if (inference_proof_spec.NIL == proof_spec) {
            proof_spec = (SubLObject)inference_proof_spec.$kw0$ANYTHING;
        }
        else if (inference_proof_spec.NIL != list_utilities.singletonP(proof_spec)) {
            proof_spec = proof_spec.first();
        }
        else {
            proof_spec = Sequences.nreverse(proof_spec);
            proof_spec = (SubLObject)ConsesLow.cons((SubLObject)inference_proof_spec.$kw8$JOIN_ORDERED, proof_spec);
        }
        return proof_spec;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-proof-spec.lisp", position = 33002L)
    public static SubLObject failed_inference_join_tactic_proof_spec(final SubLObject tactic, final SubLObject visited) {
        SubLObject proof_spec = (SubLObject)inference_proof_spec.NIL;
        set.set_add(tactic, visited);
        SubLObject cdolist_list_var = Values.arg2(Values.resetMultipleValues(), (SubLObject)Values.multiple_value_list(inference_worker_join.find_or_create_join_tactic_supporting_mapped_problems(tactic)));
        SubLObject mapped_problem = (SubLObject)inference_proof_spec.NIL;
        mapped_problem = cdolist_list_var.first();
        while (inference_proof_spec.NIL != cdolist_list_var) {
            final SubLObject problem = inference_datastructures_problem_link.mapped_problem_problem(mapped_problem);
            proof_spec = (SubLObject)ConsesLow.cons(failed_inference_problem_proof_spec(problem, visited), proof_spec);
            cdolist_list_var = cdolist_list_var.rest();
            mapped_problem = cdolist_list_var.first();
        }
        proof_spec = Sequences.delete((SubLObject)inference_proof_spec.$kw45$IGNORE, proof_spec, (SubLObject)inference_proof_spec.UNPROVIDED, (SubLObject)inference_proof_spec.UNPROVIDED, (SubLObject)inference_proof_spec.UNPROVIDED, (SubLObject)inference_proof_spec.UNPROVIDED, (SubLObject)inference_proof_spec.UNPROVIDED);
        if (inference_proof_spec.NIL == proof_spec) {
            proof_spec = (SubLObject)inference_proof_spec.$kw0$ANYTHING;
        }
        else if (inference_proof_spec.NIL != list_utilities.singletonP(proof_spec)) {
            proof_spec = proof_spec.first();
        }
        else {
            proof_spec = Sequences.nreverse(proof_spec);
            proof_spec = (SubLObject)ConsesLow.cons((SubLObject)inference_proof_spec.$kw5$JOIN, proof_spec);
        }
        return proof_spec;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-proof-spec.lisp", position = 33461L)
    public static SubLObject failed_inference_transformation_tactic_proof_spec(final SubLObject tactic, final SubLObject visited) {
        SubLObject proof_spec = (SubLObject)inference_proof_spec.NIL;
        set.set_add(tactic, visited);
        final SubLObject hl_module = inference_datastructures_tactic.tactic_hl_module(tactic);
        final SubLObject module_name = inference_modules.hl_module_name(hl_module);
        final SubLObject problem_query = inference_datastructures_problem.problem_query(inference_datastructures_tactic.tactic_problem(tactic));
        final SubLObject literal = hl_asent_from_problem_query(problem_query);
        final SubLObject rule = inference_worker_transformation.transformation_tactic_lookahead_rule(tactic);
        SubLObject children = (SubLObject)inference_proof_spec.NIL;
        if (inference_proof_spec.NIL == rule) {
            return (SubLObject)inference_proof_spec.$kw45$IGNORE;
        }
        if (inference_proof_spec.NIL == children) {
            children = (SubLObject)inference_proof_spec.$kw1$NOTHING;
        }
        proof_spec = (SubLObject)ConsesLow.cons((SubLObject)ConsesLow.list((SubLObject)inference_proof_spec.$kw11$TRANSFORMATION, literal, module_name, rule, children), proof_spec);
        proof_spec = Sequences.delete((SubLObject)inference_proof_spec.$kw45$IGNORE, proof_spec, (SubLObject)inference_proof_spec.UNPROVIDED, (SubLObject)inference_proof_spec.UNPROVIDED, (SubLObject)inference_proof_spec.UNPROVIDED, (SubLObject)inference_proof_spec.UNPROVIDED, (SubLObject)inference_proof_spec.UNPROVIDED);
        if (inference_proof_spec.NIL == proof_spec) {
            proof_spec = (SubLObject)inference_proof_spec.$kw0$ANYTHING;
        }
        else if (inference_proof_spec.NIL != list_utilities.singletonP(proof_spec)) {
            proof_spec = proof_spec.first();
        }
        else {
            proof_spec = Sequences.nreverse(proof_spec);
            proof_spec = (SubLObject)ConsesLow.cons((SubLObject)inference_proof_spec.$kw2$OR, proof_spec);
        }
        return proof_spec;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-proof-spec.lisp", position = 34247L)
    public static SubLObject failed_inference_rewrite_tactic_proof_spec(final SubLObject tactic, final SubLObject visited) {
        SubLObject proof_spec = (SubLObject)inference_proof_spec.NIL;
        set.set_add(tactic, visited);
        proof_spec = Sequences.delete((SubLObject)inference_proof_spec.$kw45$IGNORE, proof_spec, (SubLObject)inference_proof_spec.UNPROVIDED, (SubLObject)inference_proof_spec.UNPROVIDED, (SubLObject)inference_proof_spec.UNPROVIDED, (SubLObject)inference_proof_spec.UNPROVIDED, (SubLObject)inference_proof_spec.UNPROVIDED);
        if (inference_proof_spec.NIL == proof_spec) {
            proof_spec = (SubLObject)inference_proof_spec.$kw0$ANYTHING;
        }
        else if (inference_proof_spec.NIL != list_utilities.singletonP(proof_spec)) {
            proof_spec = proof_spec.first();
        }
        else {
            proof_spec = Sequences.nreverse(proof_spec);
            proof_spec = (SubLObject)ConsesLow.cons((SubLObject)inference_proof_spec.$kw2$OR, proof_spec);
        }
        return proof_spec;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-proof-spec.lisp", position = 34415L)
    public static SubLObject failed_inference_restriction_tactic_proof_spec(final SubLObject tactic, final SubLObject visited) {
        SubLObject proof_spec = (SubLObject)inference_proof_spec.NIL;
        set.set_add(tactic, visited);
        proof_spec = (SubLObject)ConsesLow.cons((SubLObject)ConsesLow.list((SubLObject)inference_proof_spec.$kw7$RESTRICTION, (SubLObject)inference_proof_spec.$kw0$ANYTHING), proof_spec);
        proof_spec = Sequences.delete((SubLObject)inference_proof_spec.$kw45$IGNORE, proof_spec, (SubLObject)inference_proof_spec.UNPROVIDED, (SubLObject)inference_proof_spec.UNPROVIDED, (SubLObject)inference_proof_spec.UNPROVIDED, (SubLObject)inference_proof_spec.UNPROVIDED, (SubLObject)inference_proof_spec.UNPROVIDED);
        if (inference_proof_spec.NIL == proof_spec) {
            proof_spec = (SubLObject)inference_proof_spec.$kw0$ANYTHING;
        }
        else if (inference_proof_spec.NIL != list_utilities.singletonP(proof_spec)) {
            proof_spec = proof_spec.first();
        }
        else {
            proof_spec = Sequences.nreverse(proof_spec);
            proof_spec = (SubLObject)ConsesLow.cons((SubLObject)inference_proof_spec.$kw2$OR, proof_spec);
        }
        return proof_spec;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-proof-spec.lisp", position = 34640L)
    public static SubLObject hl_asent_from_problem_query(final SubLObject problem_query) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        thread.resetMultipleValues();
        final SubLObject mt = inference_datastructures_problem_query.mt_asent_sense_from_singleton_query(problem_query);
        final SubLObject asent = thread.secondMultipleValue();
        final SubLObject sense = thread.thirdMultipleValue();
        thread.resetMultipleValues();
        final SubLObject literal = clause_utilities.asent_sense_to_literal(asent, sense);
        final SubLObject hl_sentence = el_utilities.make_ist_sentence(mt, literal);
        return hl_sentence;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-proof-spec.lisp", position = 34946L)
    public static SubLObject merge_proof_specs(final SubLObject proof_specs) {
        return Sequences.creduce(Symbols.symbol_function((SubLObject)inference_proof_spec.$sym63$MERGE_2_PROOF_SPECS), proof_specs, (SubLObject)inference_proof_spec.ZERO_INTEGER, (SubLObject)inference_proof_spec.NIL, (SubLObject)inference_proof_spec.$kw1$NOTHING);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-proof-spec.lisp", position = 35216L)
    public static SubLObject merge_2_proof_specs(final SubLObject spec1, final SubLObject spec2) {
        if (spec1.equal(spec2)) {
            return spec1;
        }
        if (spec1 == inference_proof_spec.$kw1$NOTHING) {
            return spec2;
        }
        if (spec2 == inference_proof_spec.$kw1$NOTHING) {
            return spec1;
        }
        if (spec1 == inference_proof_spec.$kw0$ANYTHING) {
            return (SubLObject)inference_proof_spec.$kw0$ANYTHING;
        }
        if (spec2 == inference_proof_spec.$kw0$ANYTHING) {
            return (SubLObject)inference_proof_spec.$kw0$ANYTHING;
        }
        if (spec1.isAtom() || spec2.isAtom()) {
            return make_or_pattern(spec1, spec2);
        }
        if (inference_proof_spec.$kw9$REMOVAL == proof_spec_type(spec1) && inference_proof_spec.$kw9$REMOVAL == proof_spec_type(spec2)) {
            return merge_removal_proof_specs(spec1, spec2);
        }
        if (inference_proof_spec.$kw11$TRANSFORMATION == proof_spec_type(spec1) && inference_proof_spec.$kw11$TRANSFORMATION == proof_spec_type(spec2)) {
            return merge_transformation_proof_specs(spec1, spec2);
        }
        if (inference_proof_spec.$kw12$RESIDUAL_TRANSFORMATION == proof_spec_type(spec1) && inference_proof_spec.$kw12$RESIDUAL_TRANSFORMATION == proof_spec_type(spec2)) {
            return merge_residual_transformation_proof_specs(spec1, spec2);
        }
        if (inference_proof_spec.NIL != or_pattern_p(spec1) && inference_proof_spec.NIL != or_pattern_p(spec2)) {
            return make_or_pattern(spec1, spec2);
        }
        if (!SubLObjectFactory.makeBoolean(inference_proof_spec.NIL == or_pattern_p(spec1)).eql((SubLObject)SubLObjectFactory.makeBoolean(inference_proof_spec.NIL == or_pattern_p(spec2)))) {
            return merge_into_or_pattern(spec1, spec2);
        }
        if (inference_proof_spec.NIL != proof_specs_mergeable_wrt_typeP(spec1, spec2)) {
            final SubLObject type = proof_spec_type(spec1);
            SubLObject merged_subspecs = (SubLObject)inference_proof_spec.NIL;
            SubLObject subspec1 = (SubLObject)inference_proof_spec.NIL;
            SubLObject subspec1_$5 = (SubLObject)inference_proof_spec.NIL;
            SubLObject subspec2 = (SubLObject)inference_proof_spec.NIL;
            SubLObject subspec2_$6 = (SubLObject)inference_proof_spec.NIL;
            subspec1 = spec1.rest();
            subspec1_$5 = subspec1.first();
            subspec2 = spec2.rest();
            subspec2_$6 = subspec2.first();
            while (inference_proof_spec.NIL != subspec2 || inference_proof_spec.NIL != subspec1) {
                merged_subspecs = (SubLObject)ConsesLow.cons(merge_2_proof_specs(subspec1_$5, subspec2_$6), merged_subspecs);
                subspec1 = subspec1.rest();
                subspec1_$5 = subspec1.first();
                subspec2 = subspec2.rest();
                subspec2_$6 = subspec2.first();
            }
            return reader.bq_cons(type, ConsesLow.append(Sequences.nreverse(merged_subspecs), (SubLObject)inference_proof_spec.NIL));
        }
        return make_or_pattern(spec1, spec2);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-proof-spec.lisp", position = 36913L)
    public static SubLObject merge_into_or_pattern(final SubLObject spec1, final SubLObject spec2) {
        final SubLObject or_spec_1P = or_pattern_p(spec1);
        final SubLObject or_spec = (inference_proof_spec.NIL != or_spec_1P) ? spec1 : spec2;
        final SubLObject other_spec = (inference_proof_spec.NIL != or_spec_1P) ? spec2 : spec1;
        SubLObject list_var = (SubLObject)inference_proof_spec.NIL;
        SubLObject subspec = (SubLObject)inference_proof_spec.NIL;
        SubLObject i = (SubLObject)inference_proof_spec.NIL;
        list_var = or_spec;
        subspec = list_var.first();
        for (i = (SubLObject)inference_proof_spec.ZERO_INTEGER; inference_proof_spec.NIL != list_var; list_var = list_var.rest(), subspec = list_var.first(), i = Numbers.add((SubLObject)inference_proof_spec.ONE_INTEGER, i)) {
            if (i.isPositive() && inference_proof_spec.NIL != proof_specs_mergeable_wrt_typeP(subspec, other_spec)) {
                final SubLObject merged_subspec = merge_2_proof_specs(subspec, other_spec);
                if (inference_proof_spec.NIL == or_pattern_p(merged_subspec)) {
                    return list_utilities.replace_nth(i, merged_subspec, or_spec);
                }
            }
        }
        return make_or_pattern(spec1, spec2);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-proof-spec.lisp", position = 37434L)
    public static SubLObject proof_specs_mergeable_wrt_typeP(final SubLObject spec1, final SubLObject spec2) {
        return (SubLObject)SubLObjectFactory.makeBoolean(proof_spec_type(spec1).eql(proof_spec_type(spec2)) && inference_proof_spec.NIL != list_utilities.same_length_p(spec1, spec2));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-proof-spec.lisp", position = 37604L)
    public static SubLObject proof_spec_type(final SubLObject proof_spec) {
        if (proof_spec.isCons()) {
            return proof_spec.first();
        }
        return (SubLObject)inference_proof_spec.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-proof-spec.lisp", position = 37709L)
    public static SubLObject merge_removal_proof_specs(final SubLObject removal_spec_1, final SubLObject removal_spec_2) {
        SubLObject current;
        final SubLObject datum = current = removal_spec_1.rest();
        SubLObject formula_pattern_1 = (SubLObject)inference_proof_spec.NIL;
        SubLObject module_pattern_1 = (SubLObject)inference_proof_spec.NIL;
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)inference_proof_spec.$list64);
        formula_pattern_1 = current.first();
        current = current.rest();
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)inference_proof_spec.$list64);
        module_pattern_1 = current.first();
        current = current.rest();
        if (inference_proof_spec.NIL == current) {
            SubLObject current_$8;
            final SubLObject datum_$7 = current_$8 = removal_spec_2.rest();
            SubLObject formula_pattern_2 = (SubLObject)inference_proof_spec.NIL;
            SubLObject module_pattern_2 = (SubLObject)inference_proof_spec.NIL;
            cdestructuring_bind.destructuring_bind_must_consp(current_$8, datum_$7, (SubLObject)inference_proof_spec.$list65);
            formula_pattern_2 = current_$8.first();
            current_$8 = current_$8.rest();
            cdestructuring_bind.destructuring_bind_must_consp(current_$8, datum_$7, (SubLObject)inference_proof_spec.$list65);
            module_pattern_2 = current_$8.first();
            current_$8 = current_$8.rest();
            if (inference_proof_spec.NIL == current_$8) {
                final SubLObject merged_formula_pattern = merge_single_literal_formula_patterns(formula_pattern_1, formula_pattern_2);
                if (inference_proof_spec.$kw66$UNMERGEABLE == merged_formula_pattern) {
                    return make_or_pattern(removal_spec_1, removal_spec_2);
                }
                final SubLObject merged_module_pattern = merge_content_spec_module_patterns(module_pattern_1, module_pattern_2);
                return (SubLObject)ConsesLow.list((SubLObject)inference_proof_spec.$kw9$REMOVAL, merged_formula_pattern, merged_module_pattern);
            }
            else {
                cdestructuring_bind.cdestructuring_bind_error(datum_$7, (SubLObject)inference_proof_spec.$list65);
            }
        }
        else {
            cdestructuring_bind.cdestructuring_bind_error(datum, (SubLObject)inference_proof_spec.$list64);
        }
        return (SubLObject)inference_proof_spec.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-proof-spec.lisp", position = 38362L)
    public static SubLObject merge_transformation_proof_specs(final SubLObject transformation_spec_1, final SubLObject transformation_spec_2) {
        return merge_generalized_transformation_proof_specs(transformation_spec_1, transformation_spec_2, (SubLObject)inference_proof_spec.$kw11$TRANSFORMATION);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-proof-spec.lisp", position = 38574L)
    public static SubLObject merge_residual_transformation_proof_specs(final SubLObject residual_transformation_spec_1, final SubLObject residual_transformation_spec_2) {
        return merge_generalized_transformation_proof_specs(residual_transformation_spec_1, residual_transformation_spec_2, (SubLObject)inference_proof_spec.$kw12$RESIDUAL_TRANSFORMATION);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-proof-spec.lisp", position = 38840L)
    public static SubLObject merge_generalized_transformation_proof_specs(final SubLObject transformation_spec_1, final SubLObject transformation_spec_2, final SubLObject type) {
        SubLObject current;
        final SubLObject datum = current = transformation_spec_1.rest();
        SubLObject formula_pattern_1 = (SubLObject)inference_proof_spec.NIL;
        SubLObject module_pattern_1 = (SubLObject)inference_proof_spec.NIL;
        SubLObject rule_1 = (SubLObject)inference_proof_spec.NIL;
        SubLObject subspec_1 = (SubLObject)inference_proof_spec.NIL;
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)inference_proof_spec.$list67);
        formula_pattern_1 = current.first();
        current = current.rest();
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)inference_proof_spec.$list67);
        module_pattern_1 = current.first();
        current = current.rest();
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)inference_proof_spec.$list67);
        rule_1 = current.first();
        current = current.rest();
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)inference_proof_spec.$list67);
        subspec_1 = current.first();
        current = current.rest();
        if (inference_proof_spec.NIL == current) {
            SubLObject current_$10;
            final SubLObject datum_$9 = current_$10 = transformation_spec_2.rest();
            SubLObject formula_pattern_2 = (SubLObject)inference_proof_spec.NIL;
            SubLObject module_pattern_2 = (SubLObject)inference_proof_spec.NIL;
            SubLObject rule_2 = (SubLObject)inference_proof_spec.NIL;
            SubLObject subspec_2 = (SubLObject)inference_proof_spec.NIL;
            cdestructuring_bind.destructuring_bind_must_consp(current_$10, datum_$9, (SubLObject)inference_proof_spec.$list68);
            formula_pattern_2 = current_$10.first();
            current_$10 = current_$10.rest();
            cdestructuring_bind.destructuring_bind_must_consp(current_$10, datum_$9, (SubLObject)inference_proof_spec.$list68);
            module_pattern_2 = current_$10.first();
            current_$10 = current_$10.rest();
            cdestructuring_bind.destructuring_bind_must_consp(current_$10, datum_$9, (SubLObject)inference_proof_spec.$list68);
            rule_2 = current_$10.first();
            current_$10 = current_$10.rest();
            cdestructuring_bind.destructuring_bind_must_consp(current_$10, datum_$9, (SubLObject)inference_proof_spec.$list68);
            subspec_2 = current_$10.first();
            current_$10 = current_$10.rest();
            if (inference_proof_spec.NIL == current_$10) {
                final SubLObject merged_formula_pattern = (SubLObject)(rule_1.eql(rule_2) ? merge_single_literal_formula_patterns(formula_pattern_1, formula_pattern_2) : inference_proof_spec.$kw66$UNMERGEABLE);
                if (inference_proof_spec.$kw66$UNMERGEABLE == merged_formula_pattern) {
                    return make_or_pattern(transformation_spec_1, transformation_spec_2);
                }
                final SubLObject merged_module_pattern = merge_content_spec_module_patterns(module_pattern_1, module_pattern_2);
                final SubLObject merged_subspec = merge_2_proof_specs(subspec_1, subspec_2);
                return (SubLObject)ConsesLow.list(type, merged_formula_pattern, merged_module_pattern, rule_1, merged_subspec);
            }
            else {
                cdestructuring_bind.cdestructuring_bind_error(datum_$9, (SubLObject)inference_proof_spec.$list68);
            }
        }
        else {
            cdestructuring_bind.cdestructuring_bind_error(datum, (SubLObject)inference_proof_spec.$list67);
        }
        return (SubLObject)inference_proof_spec.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-proof-spec.lisp", position = 39739L)
    public static SubLObject merge_single_literal_formula_patterns(final SubLObject formula_pattern_1, final SubLObject formula_pattern_2) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        thread.resetMultipleValues();
        final SubLObject mt_1 = destructure_single_literal_formula_pattern(formula_pattern_1);
        final SubLObject asent_1 = thread.secondMultipleValue();
        final SubLObject sense_1 = thread.thirdMultipleValue();
        thread.resetMultipleValues();
        thread.resetMultipleValues();
        final SubLObject mt_2 = destructure_single_literal_formula_pattern(formula_pattern_2);
        final SubLObject asent_2 = thread.secondMultipleValue();
        final SubLObject sense_2 = thread.thirdMultipleValue();
        thread.resetMultipleValues();
        final SubLObject predicate_1 = cycl_utilities.formula_operator(asent_1);
        final SubLObject predicate_2 = cycl_utilities.formula_operator(asent_2);
        if (!sense_1.eql(sense_2) || !predicate_1.equal(predicate_2) || !el_utilities.formula_arity(asent_1, (SubLObject)inference_proof_spec.UNPROVIDED).eql(el_utilities.formula_arity(asent_2, (SubLObject)inference_proof_spec.UNPROVIDED))) {
            return (SubLObject)inference_proof_spec.$kw66$UNMERGEABLE;
        }
        final SubLObject args_1 = cycl_utilities.formula_args(asent_1, (SubLObject)inference_proof_spec.UNPROVIDED);
        final SubLObject args_2 = cycl_utilities.formula_args(asent_2, (SubLObject)inference_proof_spec.UNPROVIDED);
        final SubLObject merged_mt = merge_proof_spec_term(mt_1, mt_2);
        final SubLObject merged_predicate = predicate_1;
        final SubLObject merged_formula_args = merge_proof_spec_terms(args_1, args_2);
        final SubLObject merged_asent = el_utilities.make_formula(merged_predicate, merged_formula_args, (SubLObject)inference_proof_spec.UNPROVIDED);
        final SubLObject merged_sense = sense_1;
        final SubLObject merged_formula_pattern = el_utilities.make_ist_sentence_from_mt_asent_sense(merged_mt, merged_asent, merged_sense);
        return merged_formula_pattern;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-proof-spec.lisp", position = 40876L)
    public static SubLObject destructure_single_literal_formula_pattern(final SubLObject formula_pattern) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        assert inference_proof_spec.NIL != el_utilities.ist_sentence_p(formula_pattern, (SubLObject)inference_proof_spec.UNPROVIDED) : formula_pattern;
        thread.resetMultipleValues();
        final SubLObject ist = el_utilities.unmake_binary_formula(formula_pattern);
        final SubLObject mt = thread.secondMultipleValue();
        final SubLObject literal = thread.thirdMultipleValue();
        thread.resetMultipleValues();
        if (inference_proof_spec.NIL != el_utilities.el_negation_p(literal)) {
            return Values.values(mt, cycl_utilities.sentence_arg1(literal, (SubLObject)inference_proof_spec.UNPROVIDED), (SubLObject)inference_proof_spec.$kw70$NEG);
        }
        return Values.values(mt, literal, (SubLObject)inference_proof_spec.$kw71$POS);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-proof-spec.lisp", position = 41232L)
    public static SubLObject merge_content_spec_module_patterns(final SubLObject module_pattern_1, final SubLObject module_pattern_2) {
        if (module_pattern_1.eql(module_pattern_2)) {
            return module_pattern_1;
        }
        if (inference_proof_spec.NIL != pattern_match.pattern_matches_tree_without_bindings(module_pattern_1, module_pattern_2)) {
            return module_pattern_1;
        }
        if (inference_proof_spec.NIL != pattern_match.pattern_matches_tree_without_bindings(module_pattern_2, module_pattern_1)) {
            return module_pattern_2;
        }
        return make_or_pattern(module_pattern_1, module_pattern_2);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-proof-spec.lisp", position = 41683L)
    public static SubLObject make_or_pattern(final SubLObject pattern1, final SubLObject pattern2) {
        final SubLObject subpatterns_1 = (SubLObject)((inference_proof_spec.NIL != or_pattern_p(pattern1)) ? pattern1.rest() : ConsesLow.list(pattern1));
        final SubLObject subpatterns_2 = (SubLObject)((inference_proof_spec.NIL != or_pattern_p(pattern2)) ? pattern2.rest() : ConsesLow.list(pattern2));
        final SubLObject merged_patterns = conses_high.union(subpatterns_1, subpatterns_2, Symbols.symbol_function((SubLObject)inference_proof_spec.EQUAL), (SubLObject)inference_proof_spec.UNPROVIDED);
        return reader.bq_cons((SubLObject)inference_proof_spec.$kw2$OR, ConsesLow.append(merged_patterns, (SubLObject)inference_proof_spec.NIL));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-proof-spec.lisp", position = 42005L)
    public static SubLObject or_pattern_p(final SubLObject pattern) {
        return (SubLObject)SubLObjectFactory.makeBoolean(pattern.isCons() && inference_proof_spec.$kw2$OR == pattern.first());
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-proof-spec.lisp", position = 42110L)
    public static SubLObject merge_proof_spec_terms(final SubLObject terms_1, final SubLObject terms_2) {
        SubLObject merged_terms = (SubLObject)inference_proof_spec.NIL;
        SubLObject term_1 = (SubLObject)inference_proof_spec.NIL;
        SubLObject term_1_$11 = (SubLObject)inference_proof_spec.NIL;
        SubLObject term_2 = (SubLObject)inference_proof_spec.NIL;
        SubLObject term_2_$12 = (SubLObject)inference_proof_spec.NIL;
        term_1 = terms_1;
        term_1_$11 = term_1.first();
        term_2 = terms_2;
        term_2_$12 = term_2.first();
        while (inference_proof_spec.NIL != term_2 || inference_proof_spec.NIL != term_1) {
            merged_terms = (SubLObject)ConsesLow.cons(merge_proof_spec_term(term_1_$11, term_2_$12), merged_terms);
            term_1 = term_1.rest();
            term_1_$11 = term_1.first();
            term_2 = term_2.rest();
            term_2_$12 = term_2.first();
        }
        return Sequences.nreverse(merged_terms);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-proof-spec.lisp", position = 42365L)
    public static SubLObject merge_proof_spec_term(final SubLObject term_1, final SubLObject term_2) {
        if (term_1.equal(term_2)) {
            return term_1;
        }
        if (inference_proof_spec.NIL != pattern_match.pattern_matches_tree_without_bindings(term_1, term_2)) {
            return term_1;
        }
        if (inference_proof_spec.NIL != pattern_match.pattern_matches_tree_without_bindings(term_2, term_1)) {
            return term_2;
        }
        return (SubLObject)inference_proof_spec.$kw0$ANYTHING;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-proof-spec.lisp", position = 42707L)
    public static SubLObject genericize_proof_spec(final SubLObject proof_spec) {
        return transform_list_utilities.quiescent_transform(proof_spec, Symbols.symbol_function((SubLObject)inference_proof_spec.$sym72$CONTENT_PROOF_SPEC_P), Symbols.symbol_function((SubLObject)inference_proof_spec.$sym73$GENERICIZE_CONTENT_PROOF_SPEC), (SubLObject)inference_proof_spec.UNPROVIDED, (SubLObject)inference_proof_spec.UNPROVIDED);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-proof-spec.lisp", position = 43045L)
    public static SubLObject genericize_content_proof_spec(final SubLObject proof_spec) {
        if (inference_proof_spec.NIL != removal_proof_spec_p(proof_spec)) {
            return genericize_removal_proof_spec(proof_spec);
        }
        if (inference_proof_spec.NIL != transformation_proof_spec_p(proof_spec)) {
            return genericize_transformation_proof_spec(proof_spec);
        }
        if (inference_proof_spec.NIL != residual_transformation_proof_spec_p(proof_spec)) {
            return genericize_residual_transformation_proof_spec(proof_spec);
        }
        return Errors.error((SubLObject)inference_proof_spec.$str74$Time_to_handle_proof_spec__s, proof_spec);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-proof-spec.lisp", position = 43495L)
    public static SubLObject genericize_removal_proof_spec(final SubLObject removal_spec) {
        SubLObject current;
        final SubLObject datum = current = removal_spec.rest();
        SubLObject formula_pattern = (SubLObject)inference_proof_spec.NIL;
        SubLObject module_pattern = (SubLObject)inference_proof_spec.NIL;
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)inference_proof_spec.$list75);
        formula_pattern = current.first();
        current = current.rest();
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)inference_proof_spec.$list75);
        module_pattern = current.first();
        current = current.rest();
        if (inference_proof_spec.NIL == current) {
            final SubLObject generic_formula_pattern = genericize_single_literal_formula_pattern(formula_pattern);
            final SubLObject generic_module_pattern = module_pattern;
            return (SubLObject)ConsesLow.list((SubLObject)inference_proof_spec.$kw9$REMOVAL, generic_formula_pattern, generic_module_pattern);
        }
        cdestructuring_bind.cdestructuring_bind_error(datum, (SubLObject)inference_proof_spec.$list75);
        return (SubLObject)inference_proof_spec.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-proof-spec.lisp", position = 43852L)
    public static SubLObject genericize_transformation_proof_spec(final SubLObject transformation_spec) {
        return genericize_generalized_transformation_proof_spec(transformation_spec, (SubLObject)inference_proof_spec.$kw11$TRANSFORMATION);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-proof-spec.lisp", position = 44024L)
    public static SubLObject genericize_residual_transformation_proof_spec(final SubLObject transformation_spec) {
        return genericize_generalized_transformation_proof_spec(transformation_spec, (SubLObject)inference_proof_spec.$kw12$RESIDUAL_TRANSFORMATION);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-proof-spec.lisp", position = 44214L)
    public static SubLObject genericize_generalized_transformation_proof_spec(final SubLObject transformation_spec, final SubLObject type) {
        SubLObject current;
        final SubLObject datum = current = transformation_spec.rest();
        SubLObject formula_pattern = (SubLObject)inference_proof_spec.NIL;
        SubLObject module_pattern = (SubLObject)inference_proof_spec.NIL;
        SubLObject rule = (SubLObject)inference_proof_spec.NIL;
        SubLObject subspec = (SubLObject)inference_proof_spec.NIL;
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)inference_proof_spec.$list76);
        formula_pattern = current.first();
        current = current.rest();
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)inference_proof_spec.$list76);
        module_pattern = current.first();
        current = current.rest();
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)inference_proof_spec.$list76);
        rule = current.first();
        current = current.rest();
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)inference_proof_spec.$list76);
        subspec = current.first();
        current = current.rest();
        if (inference_proof_spec.NIL == current) {
            final SubLObject generic_formula_pattern = genericize_single_literal_formula_pattern(formula_pattern);
            final SubLObject generic_module_pattern = module_pattern;
            final SubLObject generic_rule = rule;
            final SubLObject generic_subspec = genericize_proof_spec(subspec);
            return (SubLObject)ConsesLow.list(type, generic_formula_pattern, generic_module_pattern, generic_rule, generic_subspec);
        }
        cdestructuring_bind.cdestructuring_bind_error(datum, (SubLObject)inference_proof_spec.$list76);
        return (SubLObject)inference_proof_spec.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-proof-spec.lisp", position = 44840L)
    public static SubLObject genericize_single_literal_formula_pattern(final SubLObject formula_pattern) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        thread.resetMultipleValues();
        final SubLObject mt = destructure_single_literal_formula_pattern(formula_pattern);
        final SubLObject asent = thread.secondMultipleValue();
        final SubLObject sense = thread.thirdMultipleValue();
        thread.resetMultipleValues();
        final SubLObject predicate = cycl_utilities.formula_operator(asent);
        final SubLObject args = cycl_utilities.formula_args(asent, (SubLObject)inference_proof_spec.UNPROVIDED);
        final SubLObject generic_mt = genericize_proof_spec_term(mt);
        final SubLObject generic_args = genericize_proof_spec_terms(args);
        final SubLObject generic_asent = el_utilities.make_formula(predicate, generic_args, (SubLObject)inference_proof_spec.UNPROVIDED);
        final SubLObject generic_sense = sense;
        final SubLObject generic_formula_pattern = el_utilities.make_ist_sentence_from_mt_asent_sense(generic_mt, generic_asent, generic_sense);
        return generic_formula_pattern;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-proof-spec.lisp", position = 45459L)
    public static SubLObject genericize_proof_spec_terms(final SubLObject terms) {
        SubLObject generic_terms = (SubLObject)inference_proof_spec.NIL;
        SubLObject cdolist_list_var = terms;
        SubLObject v_term = (SubLObject)inference_proof_spec.NIL;
        v_term = cdolist_list_var.first();
        while (inference_proof_spec.NIL != cdolist_list_var) {
            generic_terms = (SubLObject)ConsesLow.cons(genericize_proof_spec_term(v_term), generic_terms);
            cdolist_list_var = cdolist_list_var.rest();
            v_term = cdolist_list_var.first();
        }
        return Sequences.nreverse(generic_terms);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-proof-spec.lisp", position = 45667L)
    public static SubLObject genericize_proof_spec_term(final SubLObject v_term) {
        if (v_term == inference_proof_spec.$kw0$ANYTHING) {
            return v_term;
        }
        return (SubLObject)inference_proof_spec.$kw77$FULLY_BOUND;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-proof-spec.lisp", position = 45835L)
    public static SubLObject genericize_problem_query(final SubLObject problem_query) {
        SubLObject generic_problem_query = (SubLObject)inference_proof_spec.NIL;
        SubLObject cdolist_list_var = problem_query;
        SubLObject clause = (SubLObject)inference_proof_spec.NIL;
        clause = cdolist_list_var.first();
        while (inference_proof_spec.NIL != cdolist_list_var) {
            generic_problem_query = (SubLObject)ConsesLow.cons(genericize_contextualized_clause(clause), generic_problem_query);
            cdolist_list_var = cdolist_list_var.rest();
            clause = cdolist_list_var.first();
        }
        return Sequences.nreverse(generic_problem_query);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-proof-spec.lisp", position = 46289L)
    public static SubLObject genericize_contextualized_clause(final SubLObject contextualized_clause) {
        SubLObject generic_neg_lits = (SubLObject)inference_proof_spec.NIL;
        SubLObject generic_pos_lits = (SubLObject)inference_proof_spec.NIL;
        SubLObject cdolist_list_var = clauses.neg_lits(contextualized_clause);
        SubLObject literal = (SubLObject)inference_proof_spec.NIL;
        literal = cdolist_list_var.first();
        while (inference_proof_spec.NIL != cdolist_list_var) {
            generic_neg_lits = (SubLObject)ConsesLow.cons(genericize_contextualized_asent(literal), generic_neg_lits);
            cdolist_list_var = cdolist_list_var.rest();
            literal = cdolist_list_var.first();
        }
        cdolist_list_var = clauses.pos_lits(contextualized_clause);
        literal = (SubLObject)inference_proof_spec.NIL;
        literal = cdolist_list_var.first();
        while (inference_proof_spec.NIL != cdolist_list_var) {
            generic_pos_lits = (SubLObject)ConsesLow.cons(genericize_contextualized_asent(literal), generic_pos_lits);
            cdolist_list_var = cdolist_list_var.rest();
            literal = cdolist_list_var.first();
        }
        return clauses.make_clause(Sequences.nreverse(generic_neg_lits), Sequences.nreverse(generic_pos_lits));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-proof-spec.lisp", position = 46769L)
    public static SubLObject genericize_contextualized_asent(final SubLObject contextualized_asent) {
        SubLObject mt = (SubLObject)inference_proof_spec.NIL;
        SubLObject asent = (SubLObject)inference_proof_spec.NIL;
        cdestructuring_bind.destructuring_bind_must_consp(contextualized_asent, contextualized_asent, (SubLObject)inference_proof_spec.$list78);
        mt = contextualized_asent.first();
        SubLObject current = contextualized_asent.rest();
        cdestructuring_bind.destructuring_bind_must_consp(current, contextualized_asent, (SubLObject)inference_proof_spec.$list78);
        asent = current.first();
        current = current.rest();
        if (inference_proof_spec.NIL == current) {
            final SubLObject generic_mt = genericize_term_wrt_pattern_match(mt);
            final SubLObject generic_asent = genericize_formula(asent);
            return inference_datastructures_problem_query.make_contextualized_asent(generic_mt, generic_asent);
        }
        cdestructuring_bind.cdestructuring_bind_error(contextualized_asent, (SubLObject)inference_proof_spec.$list78);
        return (SubLObject)inference_proof_spec.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-proof-spec.lisp", position = 47091L)
    public static SubLObject genericize_formula(final SubLObject formula) {
        final SubLObject relation = cycl_utilities.formula_operator(formula);
        final SubLObject args = cycl_utilities.formula_args(formula, (SubLObject)inference_proof_spec.UNPROVIDED);
        final SubLObject generic_args = genericize_formula_args(args);
        final SubLObject generic_formula = el_utilities.make_formula(relation, generic_args, (SubLObject)inference_proof_spec.UNPROVIDED);
        return generic_formula;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-proof-spec.lisp", position = 47361L)
    public static SubLObject genericize_formula_args(final SubLObject args) {
        SubLObject generic_args = (SubLObject)inference_proof_spec.NIL;
        SubLObject cdolist_list_var = args;
        SubLObject arg = (SubLObject)inference_proof_spec.NIL;
        arg = cdolist_list_var.first();
        while (inference_proof_spec.NIL != cdolist_list_var) {
            generic_args = (SubLObject)ConsesLow.cons(genericize_term_wrt_pattern_match(arg), generic_args);
            cdolist_list_var = cdolist_list_var.rest();
            arg = cdolist_list_var.first();
        }
        return Sequences.nreverse(generic_args);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-proof-spec.lisp", position = 47565L)
    public static SubLObject genericize_term_wrt_pattern_match(final SubLObject v_term) {
        if (inference_proof_spec.NIL != forts.fort_p(v_term)) {
            return (SubLObject)inference_proof_spec.$kw77$FULLY_BOUND;
        }
        if (v_term.isInteger()) {
            return (SubLObject)inference_proof_spec.$kw79$INTEGER;
        }
        if (v_term.isDouble()) {
            return (SubLObject)inference_proof_spec.$kw80$NUMBER;
        }
        if (v_term.isString()) {
            return (SubLObject)inference_proof_spec.$kw81$STRING;
        }
        if (inference_proof_spec.NIL != el_utilities.el_formula_p(v_term)) {
            return genericize_formula(v_term);
        }
        return v_term;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-proof-spec.lisp", position = 47889L)
    public static SubLObject proof_spec_possibly_admits_problemP(final SubLObject proof_spec, final SubLObject problem) {
        if (inference_proof_spec.$kw1$NOTHING == proof_spec) {
            return (SubLObject)inference_proof_spec.NIL;
        }
        if (inference_proof_spec.$kw0$ANYTHING == proof_spec) {
            return (SubLObject)inference_proof_spec.T;
        }
        if (inference_proof_spec.NIL != removal_proof_spec_p(proof_spec)) {
            if (inference_proof_spec.NIL != inference_datastructures_problem.single_literal_problem_p(problem)) {
                final SubLObject literal_spec = proof_spec_literal_spec(proof_spec);
                return inference_tactician_strategic_uninterestingness.literal_spec_admits_single_literal_problemP(literal_spec, problem);
            }
            return (SubLObject)inference_proof_spec.NIL;
        }
        else {
            if (inference_proof_spec.NIL == restriction_proof_spec_p(proof_spec)) {
                return (SubLObject)inference_proof_spec.T;
            }
            if (inference_proof_spec.NIL != inference_datastructures_problem.open_problem_p(problem)) {
                final SubLObject restricted_proof_spec = restriction_proof_spec_restricted_proof_spec(proof_spec);
                return proof_spec_possibly_admits_problemP(restricted_proof_spec, problem);
            }
            return (SubLObject)inference_proof_spec.NIL;
        }
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-proof-spec.lisp", position = 48810L)
    public static SubLObject query_parameters_from_proof_spec(final SubLObject proof_spec) {
        return (SubLObject)ConsesLow.list((SubLObject)inference_proof_spec.$kw82$PROOF_SPEC, proof_spec);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-proof-spec.lisp", position = 49003L)
    public static SubLObject query_allowance_parameters_from_proof_spec(final SubLObject proof_spec) {
        final SubLObject module_set = set.new_set(Symbols.symbol_function((SubLObject)inference_proof_spec.EQL), (SubLObject)inference_proof_spec.ZERO_INTEGER);
        final SubLObject rule_set = set.new_set(Symbols.symbol_function((SubLObject)inference_proof_spec.EQL), (SubLObject)inference_proof_spec.ZERO_INTEGER);
        query_allowance_parameters_from_proof_spec_recursive(proof_spec, module_set, rule_set);
        final SubLObject v_modules = set.set_element_list(module_set);
        final SubLObject rules = set.set_element_list(rule_set);
        return ConsesLow.append((SubLObject)((inference_proof_spec.NIL != v_modules) ? ConsesLow.list((SubLObject)inference_proof_spec.$kw83$ALLOWED_MODULES, reader.bq_cons((SubLObject)inference_proof_spec.$kw2$OR, ConsesLow.append(v_modules, (SubLObject)inference_proof_spec.NIL))) : inference_proof_spec.NIL), (SubLObject)((inference_proof_spec.NIL != rules) ? ConsesLow.list((SubLObject)inference_proof_spec.$kw84$ALLOWED_RULES, rules) : inference_proof_spec.NIL), (SubLObject)inference_proof_spec.NIL);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-proof-spec.lisp", position = 49473L)
    public static SubLObject query_allowance_parameters_from_proof_spec_recursive(final SubLObject proof_spec, final SubLObject module_set, final SubLObject rule_set) {
        if (!proof_spec.isAtom()) {
            if (inference_proof_spec.NIL != or_pattern_p(proof_spec)) {
                SubLObject or = (SubLObject)inference_proof_spec.NIL;
                SubLObject sub_specs = (SubLObject)inference_proof_spec.NIL;
                cdestructuring_bind.destructuring_bind_must_consp(proof_spec, proof_spec, (SubLObject)inference_proof_spec.$list85);
                or = proof_spec.first();
                final SubLObject current = proof_spec.rest();
                SubLObject cdolist_list_var;
                sub_specs = (cdolist_list_var = current);
                SubLObject sub_spec = (SubLObject)inference_proof_spec.NIL;
                sub_spec = cdolist_list_var.first();
                while (inference_proof_spec.NIL != cdolist_list_var) {
                    query_allowance_parameters_from_proof_spec_recursive(sub_spec, module_set, rule_set);
                    cdolist_list_var = cdolist_list_var.rest();
                    sub_spec = cdolist_list_var.first();
                }
            }
            else if (inference_proof_spec.NIL != removal_proof_spec_p(proof_spec)) {
                SubLObject removal = (SubLObject)inference_proof_spec.NIL;
                SubLObject formula_pattern = (SubLObject)inference_proof_spec.NIL;
                SubLObject module_pattern = (SubLObject)inference_proof_spec.NIL;
                cdestructuring_bind.destructuring_bind_must_consp(proof_spec, proof_spec, (SubLObject)inference_proof_spec.$list86);
                removal = proof_spec.first();
                SubLObject current = proof_spec.rest();
                cdestructuring_bind.destructuring_bind_must_consp(current, proof_spec, (SubLObject)inference_proof_spec.$list86);
                formula_pattern = current.first();
                current = current.rest();
                cdestructuring_bind.destructuring_bind_must_consp(current, proof_spec, (SubLObject)inference_proof_spec.$list86);
                module_pattern = current.first();
                current = current.rest();
                if (inference_proof_spec.NIL == current) {
                    module_parameters_from_module_pattern(module_pattern, module_set);
                }
                else {
                    cdestructuring_bind.cdestructuring_bind_error(proof_spec, (SubLObject)inference_proof_spec.$list86);
                }
            }
            else if (inference_proof_spec.NIL != transformation_proof_spec_p(proof_spec)) {
                SubLObject transformation = (SubLObject)inference_proof_spec.NIL;
                SubLObject formula_pattern = (SubLObject)inference_proof_spec.NIL;
                SubLObject module_pattern = (SubLObject)inference_proof_spec.NIL;
                SubLObject rule = (SubLObject)inference_proof_spec.NIL;
                SubLObject sub_spec2 = (SubLObject)inference_proof_spec.NIL;
                cdestructuring_bind.destructuring_bind_must_consp(proof_spec, proof_spec, (SubLObject)inference_proof_spec.$list87);
                transformation = proof_spec.first();
                SubLObject current = proof_spec.rest();
                cdestructuring_bind.destructuring_bind_must_consp(current, proof_spec, (SubLObject)inference_proof_spec.$list87);
                formula_pattern = current.first();
                current = current.rest();
                cdestructuring_bind.destructuring_bind_must_consp(current, proof_spec, (SubLObject)inference_proof_spec.$list87);
                module_pattern = current.first();
                current = current.rest();
                cdestructuring_bind.destructuring_bind_must_consp(current, proof_spec, (SubLObject)inference_proof_spec.$list87);
                rule = current.first();
                current = current.rest();
                cdestructuring_bind.destructuring_bind_must_consp(current, proof_spec, (SubLObject)inference_proof_spec.$list87);
                sub_spec2 = current.first();
                current = current.rest();
                if (inference_proof_spec.NIL == current) {
                    set.set_add(rule, rule_set);
                    set.set_add((SubLObject)inference_proof_spec.$kw88$DETERMINE_NEW_TRANSFORMATION_TACTICS, module_set);
                    module_parameters_from_module_pattern(module_pattern, module_set);
                    query_allowance_parameters_from_proof_spec_recursive(sub_spec2, module_set, rule_set);
                }
                else {
                    cdestructuring_bind.cdestructuring_bind_error(proof_spec, (SubLObject)inference_proof_spec.$list87);
                }
            }
            else if (inference_proof_spec.NIL != residual_transformation_proof_spec_p(proof_spec)) {
                SubLObject residual_transformation = (SubLObject)inference_proof_spec.NIL;
                SubLObject formula_pattern = (SubLObject)inference_proof_spec.NIL;
                SubLObject module_pattern = (SubLObject)inference_proof_spec.NIL;
                SubLObject rule = (SubLObject)inference_proof_spec.NIL;
                SubLObject sub_spec2 = (SubLObject)inference_proof_spec.NIL;
                cdestructuring_bind.destructuring_bind_must_consp(proof_spec, proof_spec, (SubLObject)inference_proof_spec.$list89);
                residual_transformation = proof_spec.first();
                SubLObject current = proof_spec.rest();
                cdestructuring_bind.destructuring_bind_must_consp(current, proof_spec, (SubLObject)inference_proof_spec.$list89);
                formula_pattern = current.first();
                current = current.rest();
                cdestructuring_bind.destructuring_bind_must_consp(current, proof_spec, (SubLObject)inference_proof_spec.$list89);
                module_pattern = current.first();
                current = current.rest();
                cdestructuring_bind.destructuring_bind_must_consp(current, proof_spec, (SubLObject)inference_proof_spec.$list89);
                rule = current.first();
                current = current.rest();
                cdestructuring_bind.destructuring_bind_must_consp(current, proof_spec, (SubLObject)inference_proof_spec.$list89);
                sub_spec2 = current.first();
                current = current.rest();
                if (inference_proof_spec.NIL == current) {
                    set.set_add(rule, rule_set);
                    set.set_add((SubLObject)inference_proof_spec.$kw8$JOIN_ORDERED, module_set);
                    module_parameters_from_module_pattern(module_pattern, module_set);
                    query_allowance_parameters_from_proof_spec_recursive(sub_spec2, module_set, rule_set);
                }
                else {
                    cdestructuring_bind.cdestructuring_bind_error(proof_spec, (SubLObject)inference_proof_spec.$list89);
                }
            }
            else {
                SubLObject structural = (SubLObject)inference_proof_spec.NIL;
                SubLObject sub_specs = (SubLObject)inference_proof_spec.NIL;
                cdestructuring_bind.destructuring_bind_must_consp(proof_spec, proof_spec, (SubLObject)inference_proof_spec.$list90);
                structural = proof_spec.first();
                final SubLObject current = sub_specs = proof_spec.rest();
                if (inference_proof_spec.NIL != list_utilities.member_eqP(structural, (SubLObject)inference_proof_spec.$list91)) {
                    set.set_add(structural, module_set);
                }
                if (structural == inference_proof_spec.$kw6$SPLIT) {
                    set.set_add((SubLObject)inference_proof_spec.$kw92$DETERMINE_NEW_SPLIT_TACTICS, module_set);
                }
                SubLObject cdolist_list_var = sub_specs;
                SubLObject sub_spec = (SubLObject)inference_proof_spec.NIL;
                sub_spec = cdolist_list_var.first();
                while (inference_proof_spec.NIL != cdolist_list_var) {
                    query_allowance_parameters_from_proof_spec_recursive(sub_spec, module_set, rule_set);
                    cdolist_list_var = cdolist_list_var.rest();
                    sub_spec = cdolist_list_var.first();
                }
            }
        }
        return (SubLObject)inference_proof_spec.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-proof-spec.lisp", position = 51474L)
    public static SubLObject module_parameters_from_module_pattern(final SubLObject module_pattern, final SubLObject module_set) {
        if (module_pattern.isAtom()) {
            set.set_add(module_pattern, module_set);
        }
        else if (inference_proof_spec.NIL != or_pattern_p(module_pattern)) {
            SubLObject or = (SubLObject)inference_proof_spec.NIL;
            SubLObject sub_patterns = (SubLObject)inference_proof_spec.NIL;
            cdestructuring_bind.destructuring_bind_must_consp(module_pattern, module_pattern, (SubLObject)inference_proof_spec.$list93);
            or = module_pattern.first();
            final SubLObject current = module_pattern.rest();
            SubLObject cdolist_list_var;
            sub_patterns = (cdolist_list_var = current);
            SubLObject sub_pattern = (SubLObject)inference_proof_spec.NIL;
            sub_pattern = cdolist_list_var.first();
            while (inference_proof_spec.NIL != cdolist_list_var) {
                module_parameters_from_module_pattern(sub_pattern, module_set);
                cdolist_list_var = cdolist_list_var.rest();
                sub_pattern = cdolist_list_var.first();
            }
        }
        return (SubLObject)inference_proof_spec.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-proof-spec.lisp", position = 52383L)
    public static SubLObject use_kbq_proof_spec_tableP() {
        final SubLThread thread = SubLProcess.currentSubLThread();
        return inference_proof_spec.$use_kbq_proof_spec_tableP$.getDynamicValue(thread);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-proof-spec.lisp", position = 52468L)
    public static SubLObject initialize_kbq_proof_spec_table(final SubLObject filename) {
        dictionary.clear_dictionary(inference_proof_spec.$kbq_proof_spec_table$.getGlobalValue());
        final SubLObject query_set_run = kbq_query_run.kbq_answerable_query_set_run(kbq_query_run.kbq_load_query_set_run(filename));
        SubLObject cdolist_list_var = kbq_query_run.kbq_query_set_run_query_runs(query_set_run);
        SubLObject query_run = (SubLObject)inference_proof_spec.NIL;
        query_run = cdolist_list_var.first();
        while (inference_proof_spec.NIL != cdolist_list_var) {
            final SubLObject query_spec = kbq_query_run.kbq_query_run_query(query_run);
            final SubLObject proof_spec = kbq_query_run.kbq_query_run_property_value(query_run, (SubLObject)inference_proof_spec.$kw95$INFERENCE_PROOF_SPEC, (SubLObject)inference_proof_spec.UNPROVIDED);
            if (!proof_spec.isCons()) {
                Errors.warn((SubLObject)inference_proof_spec.$str96$possibly_ill_formed_proof_spec___, proof_spec);
            }
            dictionary.dictionary_enter(inference_proof_spec.$kbq_proof_spec_table$.getGlobalValue(), query_spec, proof_spec);
            cdolist_list_var = cdolist_list_var.rest();
            query_run = cdolist_list_var.first();
        }
        return inference_proof_spec.$kbq_proof_spec_table$.getGlobalValue();
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-proof-spec.lisp", position = 53061L)
    public static SubLObject overriding_experimental_proof_spec_properties(final SubLObject query_spec) {
        final SubLObject proof_spec = dictionary.dictionary_lookup(inference_proof_spec.$kbq_proof_spec_table$.getGlobalValue(), query_spec, (SubLObject)inference_proof_spec.UNPROVIDED);
        if (inference_proof_spec.NIL != proof_spec) {
            return query_parameters_from_proof_spec(proof_spec);
        }
        return (SubLObject)inference_proof_spec.$list97;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-proof-spec.lisp", position = 53416L)
    public static SubLObject initialize_kbq_proof_spec_table_from_query_set(final SubLObject kbq_query_set, SubLObject filename) {
        if (filename == inference_proof_spec.UNPROVIDED) {
            filename = (SubLObject)inference_proof_spec.NIL;
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        dictionary.clear_dictionary(inference_proof_spec.$kbq_proof_spec_table$.getGlobalValue());
        final SubLObject list_var;
        final SubLObject queries = list_var = list_utilities.randomize_list(kbq_query_run.all_instantiations_via_inference(kbq_query_set, inference_proof_spec.$const98$InferencePSC));
        final SubLObject _prev_bind_0 = utilities_macros.$progress_note$.currentBinding(thread);
        final SubLObject _prev_bind_2 = utilities_macros.$progress_start_time$.currentBinding(thread);
        final SubLObject _prev_bind_3 = utilities_macros.$progress_total$.currentBinding(thread);
        final SubLObject _prev_bind_4 = utilities_macros.$progress_sofar$.currentBinding(thread);
        final SubLObject _prev_bind_5 = utilities_macros.$last_percent_progress_index$.currentBinding(thread);
        final SubLObject _prev_bind_6 = utilities_macros.$last_percent_progress_prediction$.currentBinding(thread);
        final SubLObject _prev_bind_7 = utilities_macros.$within_noting_percent_progress$.currentBinding(thread);
        final SubLObject _prev_bind_8 = utilities_macros.$percent_progress_start_time$.currentBinding(thread);
        try {
            utilities_macros.$progress_note$.bind((SubLObject)inference_proof_spec.$str99$Doing_inference_for_all_elements_, thread);
            utilities_macros.$progress_start_time$.bind(Time.get_universal_time(), thread);
            utilities_macros.$progress_total$.bind(Sequences.length(list_var), thread);
            utilities_macros.$progress_sofar$.bind((SubLObject)inference_proof_spec.ZERO_INTEGER, thread);
            utilities_macros.$last_percent_progress_index$.bind((SubLObject)inference_proof_spec.ZERO_INTEGER, thread);
            utilities_macros.$last_percent_progress_prediction$.bind((SubLObject)inference_proof_spec.NIL, thread);
            utilities_macros.$within_noting_percent_progress$.bind((SubLObject)inference_proof_spec.T, thread);
            utilities_macros.$percent_progress_start_time$.bind(Time.get_universal_time(), thread);
            try {
                utilities_macros.noting_percent_progress_preamble(utilities_macros.$progress_note$.getDynamicValue(thread));
                SubLObject csome_list_var = list_var;
                SubLObject query = (SubLObject)inference_proof_spec.NIL;
                query = csome_list_var.first();
                while (inference_proof_spec.NIL != csome_list_var) {
                    final SubLObject proof_spec = proof_spec_for_kbq(query);
                    if (inference_proof_spec.NIL != proof_spec) {
                        dictionary.dictionary_enter(inference_proof_spec.$kbq_proof_spec_table$.getGlobalValue(), query, proof_spec);
                        if (filename.isString()) {
                            cfasl_utilities.cfasl_save(inference_proof_spec.$kbq_proof_spec_table$.getGlobalValue(), filename);
                        }
                    }
                    utilities_macros.$progress_sofar$.setDynamicValue(Numbers.add(utilities_macros.$progress_sofar$.getDynamicValue(thread), (SubLObject)inference_proof_spec.ONE_INTEGER), thread);
                    utilities_macros.note_percent_progress(utilities_macros.$progress_sofar$.getDynamicValue(thread), utilities_macros.$progress_total$.getDynamicValue(thread));
                    csome_list_var = csome_list_var.rest();
                    query = csome_list_var.first();
                }
            }
            finally {
                final SubLObject _prev_bind_0_$13 = Threads.$is_thread_performing_cleanupP$.currentBinding(thread);
                try {
                    Threads.$is_thread_performing_cleanupP$.bind((SubLObject)inference_proof_spec.T, thread);
                    final SubLObject _values = Values.getValuesAsVector();
                    utilities_macros.noting_percent_progress_postamble();
                    Values.restoreValuesFromVector(_values);
                }
                finally {
                    Threads.$is_thread_performing_cleanupP$.rebind(_prev_bind_0_$13, thread);
                }
            }
        }
        finally {
            utilities_macros.$percent_progress_start_time$.rebind(_prev_bind_8, thread);
            utilities_macros.$within_noting_percent_progress$.rebind(_prev_bind_7, thread);
            utilities_macros.$last_percent_progress_prediction$.rebind(_prev_bind_6, thread);
            utilities_macros.$last_percent_progress_index$.rebind(_prev_bind_5, thread);
            utilities_macros.$progress_sofar$.rebind(_prev_bind_4, thread);
            utilities_macros.$progress_total$.rebind(_prev_bind_3, thread);
            utilities_macros.$progress_start_time$.rebind(_prev_bind_2, thread);
            utilities_macros.$progress_note$.rebind(_prev_bind_0, thread);
        }
        return inference_proof_spec.$kbq_proof_spec_table$.getGlobalValue();
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-proof-spec.lisp", position = 54044L)
    public static SubLObject proof_spec_for_kbq(final SubLObject query) {
        final SubLObject results = inference_results_for_kbq(query);
        if (inference_proof_spec.NIL != results) {
            final SubLObject proof_spec = ConsesLow.nth((SubLObject)inference_proof_spec.THREE_INTEGER, results);
            return proof_spec;
        }
        return (SubLObject)inference_proof_spec.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-proof-spec.lisp", position = 54252L)
    public static SubLObject inference_results_for_kbq(final SubLObject query) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject sentence = (SubLObject)inference_proof_spec.NIL;
        SubLObject mt = (SubLObject)inference_proof_spec.NIL;
        SubLObject v_properties = (SubLObject)inference_proof_spec.NIL;
        SubLObject ignore_errors_tag = (SubLObject)inference_proof_spec.NIL;
        try {
            thread.throwStack.push(inference_proof_spec.$kw101$IGNORE_ERRORS_TARGET);
            final SubLObject _prev_bind_0 = Errors.$error_handler$.currentBinding(thread);
            try {
                Errors.$error_handler$.bind(Symbols.symbol_function((SubLObject)inference_proof_spec.$sym102$IGNORE_ERRORS_HANDLER), thread);
                try {
                    SubLObject kbq_properties = (SubLObject)inference_proof_spec.NIL;
                    sentence = kb_query.kbq_sentence(query);
                    mt = kb_query.kbq_mt(query);
                    kbq_properties = kb_query.kbq_query_properties(query);
                    v_properties = conses_high.putf(conses_high.putf(conses_high.putf(conses_high.copy_list(kbq_properties), (SubLObject)inference_proof_spec.$kw103$METRICS, (SubLObject)inference_proof_spec.$list104), (SubLObject)inference_proof_spec.$kw105$BROWSABLE_, (SubLObject)inference_proof_spec.T), (SubLObject)inference_proof_spec.$kw106$MAX_TIME, (SubLObject)inference_proof_spec.$int107$30);
                    PrintLow.format((SubLObject)inference_proof_spec.T, (SubLObject)inference_proof_spec.$str108$___A___A__, numeric_date_utilities.timestring((SubLObject)inference_proof_spec.UNPROVIDED), query);
                    streams_high.force_output((SubLObject)inference_proof_spec.T);
                }
                catch (Throwable catch_var) {
                    Errors.handleThrowable(catch_var, (SubLObject)inference_proof_spec.NIL);
                }
            }
            finally {
                Errors.$error_handler$.rebind(_prev_bind_0, thread);
            }
        }
        catch (Throwable ccatch_env_var) {
            ignore_errors_tag = Errors.handleThrowable(ccatch_env_var, (SubLObject)inference_proof_spec.$kw101$IGNORE_ERRORS_TARGET);
        }
        finally {
            thread.throwStack.pop();
        }
        if (inference_proof_spec.NIL != list_utilities.sublisp_boolean(sentence) && inference_proof_spec.NIL != list_utilities.sublisp_boolean(mt) && inference_proof_spec.NIL != list_utilities.sublisp_boolean(v_properties)) {
            final SubLObject results = Values.arg2(thread.resetMultipleValues(), (SubLObject)Values.multiple_value_list(inference_kernel.new_cyc_query(sentence, mt, v_properties)));
            return results;
        }
        return (SubLObject)inference_proof_spec.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-proof-spec.lisp", position = 55094L)
    public static SubLObject analyze_asked_queries_for_proof_spec_overlap(final SubLObject filename) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject dict = dictionary.new_dictionary(Symbols.symbol_function((SubLObject)inference_proof_spec.EQUAL), (SubLObject)inference_proof_spec.UNPROVIDED);
        SubLObject done_varP = (SubLObject)inference_proof_spec.NIL;
        SubLObject i = (SubLObject)inference_proof_spec.ZERO_INTEGER;
        SubLObject stream = (SubLObject)inference_proof_spec.NIL;
        try {
            final SubLObject _prev_bind_0 = stream_macros.$stream_requires_locking$.currentBinding(thread);
            try {
                stream_macros.$stream_requires_locking$.bind((SubLObject)inference_proof_spec.NIL, thread);
                stream = compatibility.open_binary(filename, (SubLObject)inference_proof_spec.$kw109$INPUT);
            }
            finally {
                stream_macros.$stream_requires_locking$.rebind(_prev_bind_0, thread);
            }
            if (!stream.isStream()) {
                Errors.error((SubLObject)inference_proof_spec.$str110$Unable_to_open__S, filename);
            }
            final SubLObject input_stream = stream;
            final SubLObject _prev_bind_2 = cfasl.$cfasl_common_symbols$.currentBinding(thread);
            try {
                cfasl.$cfasl_common_symbols$.bind((SubLObject)inference_proof_spec.NIL, thread);
                cfasl.cfasl_set_common_symbols(inference_analysis.asked_query_common_symbols());
                while (inference_proof_spec.NIL == done_varP) {
                    final SubLObject query_info = inference_analysis.load_asked_query_from_stream(input_stream);
                    if (inference_proof_spec.$kw111$EOF == query_info) {
                        done_varP = (SubLObject)inference_proof_spec.T;
                    }
                    else if (query_info.isString()) {
                        Errors.warn((SubLObject)inference_proof_spec.$str112$Read_invalid_query_info__s, query_info);
                    }
                    else {
                        SubLObject current;
                        final SubLObject datum = current = query_info;
                        SubLObject problem_query = (SubLObject)inference_proof_spec.NIL;
                        SubLObject mt = (SubLObject)inference_proof_spec.NIL;
                        SubLObject v_properties = (SubLObject)inference_proof_spec.NIL;
                        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)inference_proof_spec.$list113);
                        problem_query = current.first();
                        current = current.rest();
                        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)inference_proof_spec.$list113);
                        mt = current.first();
                        current = current.rest();
                        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)inference_proof_spec.$list113);
                        v_properties = current.first();
                        current = current.rest();
                        if (inference_proof_spec.NIL == current) {
                            if (inference_proof_spec.NIL == inference_datastructures_problem_query.problem_query_p(problem_query)) {
                                problem_query = inference_czer.inference_canonicalize_ask_memoized(problem_query, mt, (SubLObject)inference_proof_spec.$kw45$IGNORE);
                            }
                            if (inference_proof_spec.NIL != inference_datastructures_problem_query.problem_query_p(problem_query)) {
                                dictionary_utilities.dictionary_increment(dict, (SubLObject)ConsesLow.cons(mt, genericize_problem_query(problem_query)), (SubLObject)inference_proof_spec.UNPROVIDED);
                            }
                            else {
                                print_high.print(problem_query, (SubLObject)inference_proof_spec.UNPROVIDED);
                            }
                        }
                        else {
                            cdestructuring_bind.cdestructuring_bind_error(datum, (SubLObject)inference_proof_spec.$list113);
                        }
                        i = Numbers.add(i, (SubLObject)inference_proof_spec.ONE_INTEGER);
                    }
                }
            }
            finally {
                cfasl.$cfasl_common_symbols$.rebind(_prev_bind_2, thread);
            }
        }
        finally {
            final SubLObject _prev_bind_3 = Threads.$is_thread_performing_cleanupP$.currentBinding(thread);
            try {
                Threads.$is_thread_performing_cleanupP$.bind((SubLObject)inference_proof_spec.T, thread);
                final SubLObject _values = Values.getValuesAsVector();
                if (stream.isStream()) {
                    streams_high.close(stream, (SubLObject)inference_proof_spec.UNPROVIDED);
                }
                Values.restoreValuesFromVector(_values);
            }
            finally {
                Threads.$is_thread_performing_cleanupP$.rebind(_prev_bind_3, thread);
            }
        }
        return dict;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-proof-spec.lisp", position = 56005L)
    public static SubLObject run_proof_spec_experiment(final SubLObject output_filename, final SubLObject query_specs, SubLObject overriding_query_properties) {
        if (overriding_query_properties == inference_proof_spec.UNPROVIDED) {
            overriding_query_properties = (SubLObject)inference_proof_spec.NIL;
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject stream = (SubLObject)inference_proof_spec.NIL;
        try {
            final SubLObject _prev_bind_0 = stream_macros.$stream_requires_locking$.currentBinding(thread);
            try {
                stream_macros.$stream_requires_locking$.bind((SubLObject)inference_proof_spec.NIL, thread);
                stream = compatibility.open_binary(output_filename, (SubLObject)inference_proof_spec.$kw114$OUTPUT);
            }
            finally {
                stream_macros.$stream_requires_locking$.rebind(_prev_bind_0, thread);
            }
            if (!stream.isStream()) {
                Errors.error((SubLObject)inference_proof_spec.$str110$Unable_to_open__S, output_filename);
            }
            final SubLObject stream_$14 = stream;
            final SubLObject _prev_bind_2 = utilities_macros.$progress_note$.currentBinding(thread);
            final SubLObject _prev_bind_3 = utilities_macros.$progress_start_time$.currentBinding(thread);
            final SubLObject _prev_bind_4 = utilities_macros.$progress_total$.currentBinding(thread);
            final SubLObject _prev_bind_5 = utilities_macros.$progress_sofar$.currentBinding(thread);
            final SubLObject _prev_bind_6 = utilities_macros.$last_percent_progress_index$.currentBinding(thread);
            final SubLObject _prev_bind_7 = utilities_macros.$last_percent_progress_prediction$.currentBinding(thread);
            final SubLObject _prev_bind_8 = utilities_macros.$within_noting_percent_progress$.currentBinding(thread);
            final SubLObject _prev_bind_9 = utilities_macros.$percent_progress_start_time$.currentBinding(thread);
            try {
                utilities_macros.$progress_note$.bind((SubLObject)inference_proof_spec.$str115$Running_experiments___, thread);
                utilities_macros.$progress_start_time$.bind(Time.get_universal_time(), thread);
                utilities_macros.$progress_total$.bind(Sequences.length(query_specs), thread);
                utilities_macros.$progress_sofar$.bind((SubLObject)inference_proof_spec.ZERO_INTEGER, thread);
                utilities_macros.$last_percent_progress_index$.bind((SubLObject)inference_proof_spec.ZERO_INTEGER, thread);
                utilities_macros.$last_percent_progress_prediction$.bind((SubLObject)inference_proof_spec.NIL, thread);
                utilities_macros.$within_noting_percent_progress$.bind((SubLObject)inference_proof_spec.T, thread);
                utilities_macros.$percent_progress_start_time$.bind(Time.get_universal_time(), thread);
                try {
                    utilities_macros.noting_percent_progress_preamble(utilities_macros.$progress_note$.getDynamicValue(thread));
                    SubLObject csome_list_var = query_specs;
                    SubLObject query_spec = (SubLObject)inference_proof_spec.NIL;
                    query_spec = csome_list_var.first();
                    while (inference_proof_spec.NIL != csome_list_var) {
                        SubLObject timed_outP = (SubLObject)inference_proof_spec.NIL;
                        SubLObject ignore_errors_tag = (SubLObject)inference_proof_spec.NIL;
                        try {
                            thread.throwStack.push(inference_proof_spec.$kw101$IGNORE_ERRORS_TARGET);
                            final SubLObject _prev_bind_0_$15 = Errors.$error_handler$.currentBinding(thread);
                            try {
                                Errors.$error_handler$.bind(Symbols.symbol_function((SubLObject)inference_proof_spec.$sym102$IGNORE_ERRORS_HANDLER), thread);
                                try {
                                    final SubLObject tag = subl_macro_promotions.with_timeout_make_tag();
                                    try {
                                        thread.throwStack.push(tag);
                                        final SubLObject _prev_bind_0_$16 = subl_macro_promotions.$within_with_timeout$.currentBinding(thread);
                                        try {
                                            subl_macro_promotions.$within_with_timeout$.bind((SubLObject)inference_proof_spec.T, thread);
                                            SubLObject timer = (SubLObject)inference_proof_spec.NIL;
                                            try {
                                                final SubLObject _prev_bind_0_$17 = subl_macro_promotions.$with_timeout_nesting_depth$.currentBinding(thread);
                                                try {
                                                    subl_macro_promotions.$with_timeout_nesting_depth$.bind(Numbers.add((SubLObject)inference_proof_spec.ONE_INTEGER, subl_macro_promotions.$with_timeout_nesting_depth$.getDynamicValue(thread)), thread);
                                                    timer = subl_macro_promotions.with_timeout_start_timer(kbq_query_run.$kbq_default_outlier_timeout$.getGlobalValue(), tag);
                                                    run_and_save_one_proof_spec_experiment(stream_$14, query_spec, overriding_query_properties);
                                                }
                                                finally {
                                                    subl_macro_promotions.$with_timeout_nesting_depth$.rebind(_prev_bind_0_$17, thread);
                                                }
                                            }
                                            finally {
                                                final SubLObject _prev_bind_0_$18 = Threads.$is_thread_performing_cleanupP$.currentBinding(thread);
                                                try {
                                                    Threads.$is_thread_performing_cleanupP$.bind((SubLObject)inference_proof_spec.T, thread);
                                                    final SubLObject _values = Values.getValuesAsVector();
                                                    subl_macro_promotions.with_timeout_stop_timer(timer);
                                                    Values.restoreValuesFromVector(_values);
                                                }
                                                finally {
                                                    Threads.$is_thread_performing_cleanupP$.rebind(_prev_bind_0_$18, thread);
                                                }
                                            }
                                        }
                                        finally {
                                            subl_macro_promotions.$within_with_timeout$.rebind(_prev_bind_0_$16, thread);
                                        }
                                    }
                                    catch (Throwable ccatch_env_var) {
                                        timed_outP = Errors.handleThrowable(ccatch_env_var, tag);
                                    }
                                    finally {
                                        thread.throwStack.pop();
                                    }
                                }
                                catch (Throwable catch_var) {
                                    Errors.handleThrowable(catch_var, (SubLObject)inference_proof_spec.NIL);
                                }
                            }
                            finally {
                                Errors.$error_handler$.rebind(_prev_bind_0_$15, thread);
                            }
                        }
                        catch (Throwable ccatch_env_var2) {
                            ignore_errors_tag = Errors.handleThrowable(ccatch_env_var2, (SubLObject)inference_proof_spec.$kw101$IGNORE_ERRORS_TARGET);
                        }
                        finally {
                            thread.throwStack.pop();
                        }
                        if (inference_proof_spec.NIL != timed_outP) {
                            Errors.warn((SubLObject)inference_proof_spec.$str116$Timeout___s, query_spec);
                        }
                        utilities_macros.$progress_sofar$.setDynamicValue(Numbers.add(utilities_macros.$progress_sofar$.getDynamicValue(thread), (SubLObject)inference_proof_spec.ONE_INTEGER), thread);
                        utilities_macros.note_percent_progress(utilities_macros.$progress_sofar$.getDynamicValue(thread), utilities_macros.$progress_total$.getDynamicValue(thread));
                        csome_list_var = csome_list_var.rest();
                        query_spec = csome_list_var.first();
                    }
                }
                finally {
                    final SubLObject _prev_bind_0_$19 = Threads.$is_thread_performing_cleanupP$.currentBinding(thread);
                    try {
                        Threads.$is_thread_performing_cleanupP$.bind((SubLObject)inference_proof_spec.T, thread);
                        final SubLObject _values2 = Values.getValuesAsVector();
                        utilities_macros.noting_percent_progress_postamble();
                        Values.restoreValuesFromVector(_values2);
                    }
                    finally {
                        Threads.$is_thread_performing_cleanupP$.rebind(_prev_bind_0_$19, thread);
                    }
                }
            }
            finally {
                utilities_macros.$percent_progress_start_time$.rebind(_prev_bind_9, thread);
                utilities_macros.$within_noting_percent_progress$.rebind(_prev_bind_8, thread);
                utilities_macros.$last_percent_progress_prediction$.rebind(_prev_bind_7, thread);
                utilities_macros.$last_percent_progress_index$.rebind(_prev_bind_6, thread);
                utilities_macros.$progress_sofar$.rebind(_prev_bind_5, thread);
                utilities_macros.$progress_total$.rebind(_prev_bind_4, thread);
                utilities_macros.$progress_start_time$.rebind(_prev_bind_3, thread);
                utilities_macros.$progress_note$.rebind(_prev_bind_2, thread);
            }
        }
        finally {
            final SubLObject _prev_bind_10 = Threads.$is_thread_performing_cleanupP$.currentBinding(thread);
            try {
                Threads.$is_thread_performing_cleanupP$.bind((SubLObject)inference_proof_spec.T, thread);
                final SubLObject _values3 = Values.getValuesAsVector();
                if (stream.isStream()) {
                    streams_high.close(stream, (SubLObject)inference_proof_spec.UNPROVIDED);
                }
                Values.restoreValuesFromVector(_values3);
            }
            finally {
                Threads.$is_thread_performing_cleanupP$.rebind(_prev_bind_10, thread);
            }
        }
        return output_filename;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-proof-spec.lisp", position = 56567L)
    public static SubLObject run_and_save_one_proof_spec_experiment(final SubLObject stream, final SubLObject query_spec, SubLObject overriding_query_properties) {
        if (overriding_query_properties == inference_proof_spec.UNPROVIDED) {
            overriding_query_properties = (SubLObject)inference_proof_spec.NIL;
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        thread.resetMultipleValues();
        final SubLObject metrics_1 = experiment_run_proof_spec_for_kbq(query_spec, overriding_query_properties);
        final SubLObject metrics_2 = thread.secondMultipleValue();
        final SubLObject halt_reason_1 = thread.thirdMultipleValue();
        final SubLObject halt_reason_2 = thread.fourthMultipleValue();
        thread.resetMultipleValues();
        SubLObject current;
        final SubLObject datum = current = metrics_1;
        SubLObject proof_spec_1 = (SubLObject)inference_proof_spec.NIL;
        SubLObject time_to_first_answer_1 = (SubLObject)inference_proof_spec.NIL;
        SubLObject total_time_1 = (SubLObject)inference_proof_spec.NIL;
        SubLObject time_per_answer_1 = (SubLObject)inference_proof_spec.NIL;
        SubLObject time_to_last_answer_1 = (SubLObject)inference_proof_spec.NIL;
        SubLObject tactic_count_1 = (SubLObject)inference_proof_spec.NIL;
        SubLObject executed_tactic_count_1 = (SubLObject)inference_proof_spec.NIL;
        SubLObject answer_count_1 = (SubLObject)inference_proof_spec.NIL;
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)inference_proof_spec.$list117);
        proof_spec_1 = current.first();
        current = current.rest();
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)inference_proof_spec.$list117);
        time_to_first_answer_1 = current.first();
        current = current.rest();
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)inference_proof_spec.$list117);
        total_time_1 = current.first();
        current = current.rest();
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)inference_proof_spec.$list117);
        time_per_answer_1 = current.first();
        current = current.rest();
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)inference_proof_spec.$list117);
        time_to_last_answer_1 = current.first();
        current = current.rest();
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)inference_proof_spec.$list117);
        tactic_count_1 = current.first();
        current = current.rest();
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)inference_proof_spec.$list117);
        executed_tactic_count_1 = current.first();
        current = current.rest();
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)inference_proof_spec.$list117);
        answer_count_1 = current.first();
        current = current.rest();
        if (inference_proof_spec.NIL == current) {
            SubLObject current_$21;
            final SubLObject datum_$20 = current_$21 = metrics_2;
            SubLObject time_to_first_answer_2 = (SubLObject)inference_proof_spec.NIL;
            SubLObject total_time_2 = (SubLObject)inference_proof_spec.NIL;
            SubLObject time_per_answer_2 = (SubLObject)inference_proof_spec.NIL;
            SubLObject time_to_last_answer_2 = (SubLObject)inference_proof_spec.NIL;
            SubLObject tactic_count_2 = (SubLObject)inference_proof_spec.NIL;
            SubLObject executed_tactic_count_2 = (SubLObject)inference_proof_spec.NIL;
            SubLObject answer_count_2 = (SubLObject)inference_proof_spec.NIL;
            cdestructuring_bind.destructuring_bind_must_consp(current_$21, datum_$20, (SubLObject)inference_proof_spec.$list118);
            time_to_first_answer_2 = current_$21.first();
            current_$21 = current_$21.rest();
            cdestructuring_bind.destructuring_bind_must_consp(current_$21, datum_$20, (SubLObject)inference_proof_spec.$list118);
            total_time_2 = current_$21.first();
            current_$21 = current_$21.rest();
            cdestructuring_bind.destructuring_bind_must_consp(current_$21, datum_$20, (SubLObject)inference_proof_spec.$list118);
            time_per_answer_2 = current_$21.first();
            current_$21 = current_$21.rest();
            cdestructuring_bind.destructuring_bind_must_consp(current_$21, datum_$20, (SubLObject)inference_proof_spec.$list118);
            time_to_last_answer_2 = current_$21.first();
            current_$21 = current_$21.rest();
            cdestructuring_bind.destructuring_bind_must_consp(current_$21, datum_$20, (SubLObject)inference_proof_spec.$list118);
            tactic_count_2 = current_$21.first();
            current_$21 = current_$21.rest();
            cdestructuring_bind.destructuring_bind_must_consp(current_$21, datum_$20, (SubLObject)inference_proof_spec.$list118);
            executed_tactic_count_2 = current_$21.first();
            current_$21 = current_$21.rest();
            cdestructuring_bind.destructuring_bind_must_consp(current_$21, datum_$20, (SubLObject)inference_proof_spec.$list118);
            answer_count_2 = current_$21.first();
            current_$21 = current_$21.rest();
            if (inference_proof_spec.NIL == current_$21) {
                final SubLObject datum_$21 = (SubLObject)ConsesLow.list(new SubLObject[] { time_to_first_answer_1, total_time_1, time_per_answer_1, time_to_last_answer_1, tactic_count_1, executed_tactic_count_1, answer_count_1, halt_reason_1, time_to_first_answer_2, total_time_2, time_per_answer_2, time_to_last_answer_2, tactic_count_2, executed_tactic_count_2, answer_count_2, halt_reason_2 });
                cfasl.cfasl_output_externalized(datum_$21, stream);
                streams_high.force_output(stream);
                return datum_$21;
            }
            cdestructuring_bind.cdestructuring_bind_error(datum_$20, (SubLObject)inference_proof_spec.$list118);
        }
        else {
            cdestructuring_bind.cdestructuring_bind_error(datum, (SubLObject)inference_proof_spec.$list117);
        }
        return (SubLObject)inference_proof_spec.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-proof-spec.lisp", position = 57613L)
    public static SubLObject load_proof_spec_experiment(final SubLObject filename) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject data = (SubLObject)inference_proof_spec.NIL;
        SubLObject stream = (SubLObject)inference_proof_spec.NIL;
        try {
            final SubLObject _prev_bind_0 = stream_macros.$stream_requires_locking$.currentBinding(thread);
            try {
                stream_macros.$stream_requires_locking$.bind((SubLObject)inference_proof_spec.NIL, thread);
                stream = compatibility.open_binary(filename, (SubLObject)inference_proof_spec.$kw109$INPUT);
            }
            finally {
                stream_macros.$stream_requires_locking$.rebind(_prev_bind_0, thread);
            }
            if (!stream.isStream()) {
                Errors.error((SubLObject)inference_proof_spec.$str110$Unable_to_open__S, filename);
            }
            final SubLObject stream_$23 = stream;
            SubLObject datum = (SubLObject)inference_proof_spec.NIL;
            while (inference_proof_spec.$kw111$EOF != datum) {
                datum = cfasl.cfasl_input(stream_$23, (SubLObject)inference_proof_spec.NIL, (SubLObject)inference_proof_spec.$kw111$EOF);
                if (inference_proof_spec.$kw111$EOF != datum) {
                    data = (SubLObject)ConsesLow.cons(datum, data);
                }
            }
        }
        finally {
            final SubLObject _prev_bind_2 = Threads.$is_thread_performing_cleanupP$.currentBinding(thread);
            try {
                Threads.$is_thread_performing_cleanupP$.bind((SubLObject)inference_proof_spec.T, thread);
                final SubLObject _values = Values.getValuesAsVector();
                if (stream.isStream()) {
                    streams_high.close(stream, (SubLObject)inference_proof_spec.UNPROVIDED);
                }
                Values.restoreValuesFromVector(_values);
            }
            finally {
                Threads.$is_thread_performing_cleanupP$.rebind(_prev_bind_2, thread);
            }
        }
        return Sequences.nreverse(data);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-proof-spec.lisp", position = 58222L)
    public static SubLObject proof_spec_data_metric_positions(final SubLObject metric) {
        if (metric.eql((SubLObject)inference_proof_spec.$kw120$TIME_TO_FIRST_ANSWER)) {
            return Values.values((SubLObject)inference_proof_spec.ZERO_INTEGER, (SubLObject)inference_proof_spec.EIGHT_INTEGER);
        }
        if (metric.eql((SubLObject)inference_proof_spec.$kw121$TOTAL_TIME)) {
            return Values.values((SubLObject)inference_proof_spec.ONE_INTEGER, (SubLObject)inference_proof_spec.NINE_INTEGER);
        }
        if (metric.eql((SubLObject)inference_proof_spec.$kw122$TIME_PER_ANSWER)) {
            return Values.values((SubLObject)inference_proof_spec.TWO_INTEGER, (SubLObject)inference_proof_spec.TEN_INTEGER);
        }
        if (metric.eql((SubLObject)inference_proof_spec.$kw123$TIME_TO_LAST_ANSWER)) {
            return Values.values((SubLObject)inference_proof_spec.THREE_INTEGER, (SubLObject)inference_proof_spec.ELEVEN_INTEGER);
        }
        if (metric.eql((SubLObject)inference_proof_spec.$kw124$TACTIC_COUNT)) {
            return Values.values((SubLObject)inference_proof_spec.FOUR_INTEGER, (SubLObject)inference_proof_spec.TWELVE_INTEGER);
        }
        if (metric.eql((SubLObject)inference_proof_spec.$kw125$EXECUTED_TACTIC_COUNT)) {
            return Values.values((SubLObject)inference_proof_spec.FIVE_INTEGER, (SubLObject)inference_proof_spec.THIRTEEN_INTEGER);
        }
        if (metric.eql((SubLObject)inference_proof_spec.$kw126$ANSWER_COUNT)) {
            return Values.values((SubLObject)inference_proof_spec.SIX_INTEGER, (SubLObject)inference_proof_spec.FOURTEEN_INTEGER);
        }
        if (metric.eql((SubLObject)inference_proof_spec.$kw127$HALT_REASON)) {
            return Values.values((SubLObject)inference_proof_spec.SEVEN_INTEGER, (SubLObject)inference_proof_spec.FIFTEEN_INTEGER);
        }
        return Errors.error((SubLObject)inference_proof_spec.$str128$unhandled_metric__s, metric);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-proof-spec.lisp", position = 58700L)
    public static SubLObject proof_spec_data_lookup(final SubLObject datum, final SubLObject metric) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        thread.resetMultipleValues();
        final SubLObject baseline_pos = proof_spec_data_metric_positions(metric);
        final SubLObject proof_spec_pos = thread.secondMultipleValue();
        thread.resetMultipleValues();
        return Values.values(ConsesLow.nth(baseline_pos, datum), ConsesLow.nth(proof_spec_pos, datum));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-proof-spec.lisp", position = 58924L)
    public static SubLObject analyze_proof_spec_experiment_answerability(final SubLObject filename) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject dict = dictionary.new_dictionary(Symbols.symbol_function((SubLObject)inference_proof_spec.EQL), (SubLObject)inference_proof_spec.UNPROVIDED);
        final SubLObject data = load_proof_spec_experiment(filename);
        if (data.isCons()) {
            SubLObject cdolist_list_var = data;
            SubLObject datum = (SubLObject)inference_proof_spec.NIL;
            datum = cdolist_list_var.first();
            while (inference_proof_spec.NIL != cdolist_list_var) {
                thread.resetMultipleValues();
                final SubLObject baseline_answer_count = proof_spec_data_lookup(datum, (SubLObject)inference_proof_spec.$kw126$ANSWER_COUNT);
                final SubLObject proof_spec_answer_count = thread.secondMultipleValue();
                thread.resetMultipleValues();
                final SubLObject baseline_answerableP = subl_promotions.positive_integer_p(baseline_answer_count);
                final SubLObject proof_spec_answerableP = subl_promotions.positive_integer_p(proof_spec_answer_count);
                if (inference_proof_spec.NIL != baseline_answerableP) {
                    if (inference_proof_spec.NIL != proof_spec_answerableP) {
                        dictionary_utilities.dictionary_increment(dict, (SubLObject)inference_proof_spec.$kw129$BOTH_ANSWERABLE, (SubLObject)inference_proof_spec.UNPROVIDED);
                    }
                    else {
                        dictionary_utilities.dictionary_increment(dict, (SubLObject)inference_proof_spec.$kw130$ONLY_BASELINE_ANSWERABLE, (SubLObject)inference_proof_spec.UNPROVIDED);
                    }
                }
                else if (inference_proof_spec.NIL != proof_spec_answerableP) {
                    dictionary_utilities.dictionary_increment(dict, (SubLObject)inference_proof_spec.$kw131$ONLY_PROOF_SPEC_ANSWERABLE, (SubLObject)inference_proof_spec.UNPROVIDED);
                }
                else {
                    dictionary_utilities.dictionary_increment(dict, (SubLObject)inference_proof_spec.$kw132$NEITHER_ANSWERABLE, (SubLObject)inference_proof_spec.UNPROVIDED);
                }
                cdolist_list_var = cdolist_list_var.rest();
                datum = cdolist_list_var.first();
            }
        }
        return dict;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-proof-spec.lisp", position = 59760L)
    public static SubLObject graph_proof_spec_experiment_metric(final SubLObject filename, final SubLObject metric, SubLObject plot_properties, SubLObject sort_by) {
        if (plot_properties == inference_proof_spec.UNPROVIDED) {
            plot_properties = (SubLObject)inference_proof_spec.NIL;
        }
        if (sort_by == inference_proof_spec.UNPROVIDED) {
            sort_by = (SubLObject)inference_proof_spec.NIL;
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject data = load_proof_spec_experiment(filename);
        SubLObject baseline_values = (SubLObject)inference_proof_spec.NIL;
        SubLObject proof_spec_values = (SubLObject)inference_proof_spec.NIL;
        if (data.isCons()) {
            SubLObject cdolist_list_var = data;
            SubLObject datum = (SubLObject)inference_proof_spec.NIL;
            datum = cdolist_list_var.first();
            while (inference_proof_spec.NIL != cdolist_list_var) {
                thread.resetMultipleValues();
                final SubLObject baseline_answer_count = proof_spec_data_lookup(datum, (SubLObject)inference_proof_spec.$kw126$ANSWER_COUNT);
                final SubLObject proof_spec_answer_count = thread.secondMultipleValue();
                thread.resetMultipleValues();
                final SubLObject baseline_answerableP = subl_promotions.positive_integer_p(baseline_answer_count);
                final SubLObject proof_spec_answerableP = subl_promotions.positive_integer_p(proof_spec_answer_count);
                if (inference_proof_spec.NIL != baseline_answerableP && inference_proof_spec.NIL != proof_spec_answerableP) {
                    thread.resetMultipleValues();
                    final SubLObject baseline_value = proof_spec_data_lookup(datum, metric);
                    final SubLObject proof_spec_value = thread.secondMultipleValue();
                    thread.resetMultipleValues();
                    baseline_values = (SubLObject)ConsesLow.cons(baseline_value, baseline_values);
                    proof_spec_values = (SubLObject)ConsesLow.cons(proof_spec_value, proof_spec_values);
                }
                cdolist_list_var = cdolist_list_var.rest();
                datum = cdolist_list_var.first();
            }
        }
        final SubLObject pcase_var = sort_by;
        if (pcase_var.eql((SubLObject)inference_proof_spec.$kw133$BOTH)) {
            baseline_values = Sort.sort(baseline_values, Symbols.symbol_function((SubLObject)inference_proof_spec.$sym134$_), (SubLObject)inference_proof_spec.UNPROVIDED);
            proof_spec_values = Sort.sort(proof_spec_values, Symbols.symbol_function((SubLObject)inference_proof_spec.$sym134$_), (SubLObject)inference_proof_spec.UNPROVIDED);
        }
        else if (pcase_var.eql((SubLObject)inference_proof_spec.$kw135$BASELINE)) {
            SubLObject tuples = (SubLObject)inference_proof_spec.NIL;
            SubLObject baseline_value2 = (SubLObject)inference_proof_spec.NIL;
            SubLObject baseline_value_$24 = (SubLObject)inference_proof_spec.NIL;
            SubLObject proof_spec_value2 = (SubLObject)inference_proof_spec.NIL;
            SubLObject proof_spec_value_$25 = (SubLObject)inference_proof_spec.NIL;
            baseline_value2 = baseline_values;
            baseline_value_$24 = baseline_value2.first();
            proof_spec_value2 = proof_spec_values;
            proof_spec_value_$25 = proof_spec_value2.first();
            while (inference_proof_spec.NIL != proof_spec_value2 || inference_proof_spec.NIL != baseline_value2) {
                tuples = (SubLObject)ConsesLow.cons((SubLObject)ConsesLow.cons(baseline_value_$24, proof_spec_value_$25), tuples);
                baseline_value2 = baseline_value2.rest();
                baseline_value_$24 = baseline_value2.first();
                proof_spec_value2 = proof_spec_value2.rest();
                proof_spec_value_$25 = proof_spec_value2.first();
            }
            tuples = Sort.sort(tuples, Symbols.symbol_function((SubLObject)inference_proof_spec.$sym134$_), Symbols.symbol_function((SubLObject)inference_proof_spec.$sym136$CAR));
            baseline_values = Mapping.mapcar(Symbols.symbol_function((SubLObject)inference_proof_spec.$sym136$CAR), tuples);
            proof_spec_values = Mapping.mapcar(Symbols.symbol_function((SubLObject)inference_proof_spec.$sym137$CDR), tuples);
        }
        else if (pcase_var.eql((SubLObject)inference_proof_spec.$kw138$EXPERIMENT)) {
            SubLObject tuples = (SubLObject)inference_proof_spec.NIL;
            SubLObject baseline_value2 = (SubLObject)inference_proof_spec.NIL;
            SubLObject baseline_value_$25 = (SubLObject)inference_proof_spec.NIL;
            SubLObject proof_spec_value2 = (SubLObject)inference_proof_spec.NIL;
            SubLObject proof_spec_value_$26 = (SubLObject)inference_proof_spec.NIL;
            baseline_value2 = baseline_values;
            baseline_value_$25 = baseline_value2.first();
            proof_spec_value2 = proof_spec_values;
            proof_spec_value_$26 = proof_spec_value2.first();
            while (inference_proof_spec.NIL != proof_spec_value2 || inference_proof_spec.NIL != baseline_value2) {
                tuples = (SubLObject)ConsesLow.cons((SubLObject)ConsesLow.cons(baseline_value_$25, proof_spec_value_$26), tuples);
                baseline_value2 = baseline_value2.rest();
                baseline_value_$25 = baseline_value2.first();
                proof_spec_value2 = proof_spec_value2.rest();
                proof_spec_value_$26 = proof_spec_value2.first();
            }
            tuples = Sort.sort(tuples, Symbols.symbol_function((SubLObject)inference_proof_spec.$sym134$_), Symbols.symbol_function((SubLObject)inference_proof_spec.$sym137$CDR));
            baseline_values = Mapping.mapcar(Symbols.symbol_function((SubLObject)inference_proof_spec.$sym136$CAR), tuples);
            proof_spec_values = Mapping.mapcar(Symbols.symbol_function((SubLObject)inference_proof_spec.$sym137$CDR), tuples);
        }
        else {
            Errors.error((SubLObject)inference_proof_spec.$str139$unhandled_sort_by__s, sort_by);
        }
        final SubLObject coordinates_list = Mapping.mapcar((SubLObject)inference_proof_spec.$sym140$COORDINATIFY, (SubLObject)ConsesLow.list(baseline_values, proof_spec_values));
        if (sort_by == inference_proof_spec.$kw133$BOTH) {
            plot_generation.generate_lines_graph(coordinates_list, plot_properties);
        }
        else {
            plot_generation.generate_points_graph(coordinates_list, plot_properties);
        }
        return (SubLObject)inference_proof_spec.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-proof-spec.lisp", position = 61783L)
    public static SubLObject experiment_run_proof_spec_for_kbq(final SubLObject query_spec, SubLObject overriding_query_properties) {
        if (overriding_query_properties == inference_proof_spec.UNPROVIDED) {
            overriding_query_properties = (SubLObject)inference_proof_spec.NIL;
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject sentence = kb_query.kbq_sentence(query_spec);
        final SubLObject mt = kb_query.kbq_mt(query_spec);
        SubLObject v_properties = kb_query.kbq_query_properties(query_spec);
        v_properties = list_utilities.merge_plist(v_properties, overriding_query_properties);
        thread.resetMultipleValues();
        final SubLObject fewer_answersP = test_proof_spec_for_query_int(sentence, mt, v_properties, inference_proof_spec.$proof_spec_experiment_metrics$.getGlobalValue());
        final SubLObject slowerP = thread.secondMultipleValue();
        final SubLObject result_1 = thread.thirdMultipleValue();
        final SubLObject result_2 = thread.fourthMultipleValue();
        final SubLObject halt_reason_1 = thread.fifthMultipleValue();
        final SubLObject halt_reason_2 = thread.sixthMultipleValue();
        final SubLObject metrics_1 = thread.seventhMultipleValue();
        final SubLObject metrics_2 = thread.eighthMultipleValue();
        thread.resetMultipleValues();
        return Values.values(metrics_1, metrics_2, halt_reason_1, halt_reason_2);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-proof-spec.lisp", position = 62469L)
    public static SubLObject test_proof_spec_for_kbq(final SubLObject query_spec, SubLObject overriding_query_properties) {
        if (overriding_query_properties == inference_proof_spec.UNPROVIDED) {
            overriding_query_properties = (SubLObject)inference_proof_spec.NIL;
        }
        final SubLObject sentence = kb_query.kbq_sentence(query_spec);
        final SubLObject mt = kb_query.kbq_mt(query_spec);
        SubLObject v_properties = kb_query.kbq_query_properties(query_spec);
        v_properties = list_utilities.merge_plist(v_properties, overriding_query_properties);
        return test_proof_spec_for_query(sentence, mt, v_properties);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-proof-spec.lisp", position = 62832L)
    public static SubLObject test_proof_spec_for_query(final SubLObject sentence, final SubLObject mt, SubLObject v_properties) {
        if (v_properties == inference_proof_spec.UNPROVIDED) {
            v_properties = (SubLObject)inference_proof_spec.NIL;
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        thread.resetMultipleValues();
        final SubLObject fewer_answersP = test_proof_spec_for_query_int(sentence, mt, v_properties, (SubLObject)inference_proof_spec.$list141);
        SubLObject slowerP = thread.secondMultipleValue();
        final SubLObject result_1 = thread.thirdMultipleValue();
        final SubLObject result_2 = thread.fourthMultipleValue();
        final SubLObject halt_reason_1 = thread.fifthMultipleValue();
        final SubLObject halt_reason_2 = thread.sixthMultipleValue();
        final SubLObject metrics_1 = thread.seventhMultipleValue();
        final SubLObject metrics_2 = thread.eighthMultipleValue();
        thread.resetMultipleValues();
        SubLObject current;
        final SubLObject datum = current = metrics_1;
        SubLObject proof_spec = (SubLObject)inference_proof_spec.NIL;
        SubLObject total_time_1 = (SubLObject)inference_proof_spec.NIL;
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)inference_proof_spec.$list142);
        proof_spec = current.first();
        current = current.rest();
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)inference_proof_spec.$list142);
        total_time_1 = current.first();
        current = current.rest();
        if (inference_proof_spec.NIL == current) {
            SubLObject current_$29;
            final SubLObject datum_$28 = current_$29 = metrics_2;
            SubLObject total_time_2 = (SubLObject)inference_proof_spec.NIL;
            cdestructuring_bind.destructuring_bind_must_consp(current_$29, datum_$28, (SubLObject)inference_proof_spec.$list143);
            total_time_2 = current_$29.first();
            current_$29 = current_$29.rest();
            if (inference_proof_spec.NIL == current_$29) {
                if (!total_time_2.numLE(total_time_1)) {
                    slowerP = (SubLObject)inference_proof_spec.T;
                    Errors.warn((SubLObject)inference_proof_spec.$str144$Proof_spec_query_is_slower___s_vs, total_time_1, total_time_2);
                }
                return (SubLObject)ConsesLow.list(new SubLObject[] { fewer_answersP, slowerP, proof_spec, result_1, result_2, halt_reason_1, halt_reason_2, total_time_1, total_time_2 });
            }
            cdestructuring_bind.cdestructuring_bind_error(datum_$28, (SubLObject)inference_proof_spec.$list143);
        }
        else {
            cdestructuring_bind.cdestructuring_bind_error(datum, (SubLObject)inference_proof_spec.$list142);
        }
        return (SubLObject)inference_proof_spec.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-proof-spec.lisp", position = 63779L)
    public static SubLObject test_proof_spec_for_query_int(final SubLObject sentence, final SubLObject mt, SubLObject v_properties, final SubLObject metrics) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        v_properties = conses_high.putf(conses_high.copy_list(v_properties), (SubLObject)inference_proof_spec.$kw103$METRICS, (SubLObject)ConsesLow.cons((SubLObject)inference_proof_spec.$kw95$INFERENCE_PROOF_SPEC, metrics));
        thread.resetMultipleValues();
        final SubLObject result_1 = inference_kernel.new_cyc_query(sentence, mt, v_properties);
        final SubLObject halt_reason_1 = thread.secondMultipleValue();
        final SubLObject inference_1 = thread.thirdMultipleValue();
        final SubLObject metrics_1 = thread.fourthMultipleValue();
        thread.resetMultipleValues();
        final SubLObject proof_spec = metrics_1.first();
        final SubLObject some_new_properties = query_parameters_from_proof_spec(proof_spec);
        SubLObject new_properties = list_utilities.merge_plist(v_properties, some_new_properties);
        new_properties = conses_high.putf(conses_high.copy_list(new_properties), (SubLObject)inference_proof_spec.$kw103$METRICS, metrics);
        thread.resetMultipleValues();
        final SubLObject result_2 = inference_kernel.new_cyc_query(sentence, mt, new_properties);
        final SubLObject halt_reason_2 = thread.secondMultipleValue();
        final SubLObject inference_2 = thread.thirdMultipleValue();
        final SubLObject metrics_2 = thread.fourthMultipleValue();
        thread.resetMultipleValues();
        thread.resetMultipleValues();
        final SubLObject answers_only_in_1 = bindings.compare_lists_of_binding_lists(result_1, result_2);
        final SubLObject answers_only_in_2 = thread.secondMultipleValue();
        thread.resetMultipleValues();
        SubLObject fewer_answersP = (SubLObject)inference_proof_spec.NIL;
        final SubLObject slowerP = (SubLObject)inference_proof_spec.NIL;
        if (inference_proof_spec.NIL != answers_only_in_1) {
            fewer_answersP = (SubLObject)inference_proof_spec.T;
            Errors.warn((SubLObject)inference_proof_spec.$str145$Proof_spec_query_failed_to_get__s, answers_only_in_1);
        }
        if (inference_proof_spec.NIL != answers_only_in_2) {
            Errors.warn((SubLObject)inference_proof_spec.$str146$Proof_spec_query_got_additional_a, answers_only_in_2);
        }
        inference_datastructures_inference.destroy_inference_and_problem_store(inference_1);
        inference_datastructures_inference.destroy_inference_and_problem_store(inference_2);
        return Values.values(fewer_answersP, slowerP, result_1, result_2, halt_reason_1, halt_reason_2, metrics_1, metrics_2);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-proof-spec.lisp", position = 65085L)
    public static SubLObject retest_proof_spec_for_kbq(final SubLObject query_spec, final SubLObject output) {
        final SubLObject sentence = kb_query.kbq_sentence(query_spec);
        final SubLObject mt = kb_query.kbq_mt(query_spec);
        final SubLObject v_properties = kb_query.kbq_query_properties(query_spec);
        return retest_proof_spec_for_query(sentence, mt, v_properties, output);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-proof-spec.lisp", position = 65478L)
    public static SubLObject retest_proof_spec_for_query(final SubLObject sentence, final SubLObject mt, final SubLObject v_properties, final SubLObject output) {
        SubLObject fewer_answersP = (SubLObject)inference_proof_spec.NIL;
        SubLObject slowerP = (SubLObject)inference_proof_spec.NIL;
        SubLObject proof_spec = (SubLObject)inference_proof_spec.NIL;
        SubLObject result_1 = (SubLObject)inference_proof_spec.NIL;
        SubLObject result_2 = (SubLObject)inference_proof_spec.NIL;
        SubLObject halt_reason_1 = (SubLObject)inference_proof_spec.NIL;
        SubLObject halt_reason_2 = (SubLObject)inference_proof_spec.NIL;
        SubLObject total_time_1 = (SubLObject)inference_proof_spec.NIL;
        SubLObject total_time_2 = (SubLObject)inference_proof_spec.NIL;
        cdestructuring_bind.destructuring_bind_must_consp(output, output, (SubLObject)inference_proof_spec.$list147);
        fewer_answersP = output.first();
        SubLObject current = output.rest();
        cdestructuring_bind.destructuring_bind_must_consp(current, output, (SubLObject)inference_proof_spec.$list147);
        slowerP = current.first();
        current = current.rest();
        cdestructuring_bind.destructuring_bind_must_consp(current, output, (SubLObject)inference_proof_spec.$list147);
        proof_spec = current.first();
        current = current.rest();
        cdestructuring_bind.destructuring_bind_must_consp(current, output, (SubLObject)inference_proof_spec.$list147);
        result_1 = current.first();
        current = current.rest();
        cdestructuring_bind.destructuring_bind_must_consp(current, output, (SubLObject)inference_proof_spec.$list147);
        result_2 = current.first();
        current = current.rest();
        cdestructuring_bind.destructuring_bind_must_consp(current, output, (SubLObject)inference_proof_spec.$list147);
        halt_reason_1 = current.first();
        current = current.rest();
        cdestructuring_bind.destructuring_bind_must_consp(current, output, (SubLObject)inference_proof_spec.$list147);
        halt_reason_2 = current.first();
        current = current.rest();
        cdestructuring_bind.destructuring_bind_must_consp(current, output, (SubLObject)inference_proof_spec.$list147);
        total_time_1 = current.first();
        current = current.rest();
        cdestructuring_bind.destructuring_bind_must_consp(current, output, (SubLObject)inference_proof_spec.$list147);
        total_time_2 = current.first();
        current = current.rest();
        if (inference_proof_spec.NIL == current) {
            final SubLObject some_new_properties = query_parameters_from_proof_spec(proof_spec);
            SubLObject new_properties = list_utilities.merge_plist(v_properties, some_new_properties);
            new_properties = conses_high.putf(conses_high.copy_list(new_properties), (SubLObject)inference_proof_spec.$kw105$BROWSABLE_, (SubLObject)inference_proof_spec.T);
            return inference_kernel.new_cyc_query(sentence, mt, new_properties);
        }
        cdestructuring_bind.cdestructuring_bind_error(output, (SubLObject)inference_proof_spec.$list147);
        return (SubLObject)inference_proof_spec.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-proof-spec.lisp", position = 66279L)
    public static SubLObject test_inference_proof_spec(SubLObject verbosity) {
        if (verbosity == inference_proof_spec.UNPROVIDED) {
            verbosity = (SubLObject)inference_proof_spec.$kw148$TERSE;
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        generic_testing.run_test_case_table((SubLObject)inference_proof_spec.$sym149$TEST_QUERY_FIRST_PROOF_SPEC, StreamsLow.$standard_output$.getDynamicValue(thread), verbosity, (SubLObject)inference_proof_spec.UNPROVIDED);
        generic_testing.run_test_case_table((SubLObject)inference_proof_spec.$sym63$MERGE_2_PROOF_SPECS, StreamsLow.$standard_output$.getDynamicValue(thread), verbosity, (SubLObject)inference_proof_spec.UNPROVIDED);
        return (SubLObject)inference_proof_spec.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-proof-spec.lisp", position = 66528L)
    public static SubLObject test_query_first_proof_spec(final SubLObject query) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        thread.resetMultipleValues();
        final SubLObject result = inference_kernel.new_cyc_query(query, inference_proof_spec.$const150$EverythingPSC, (SubLObject)inference_proof_spec.$list151);
        final SubLObject halt_reason = thread.secondMultipleValue();
        final SubLObject inference = thread.thirdMultipleValue();
        final SubLObject metrics = thread.fourthMultipleValue();
        thread.resetMultipleValues();
        inference_datastructures_inference.destroy_inference(inference);
        return variables.uncanonicalize_hl_vars(list_utilities.only_one(metrics).first());
    }
    
    public static SubLObject declare_inference_proof_spec_file() {
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.harness.inference_proof_spec", "proof_spec_p", "PROOF-SPEC-P", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.harness.inference_proof_spec", "structural_proof_spec_p", "STRUCTURAL-PROOF-SPEC-P", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.harness.inference_proof_spec", "union_proof_spec_p", "UNION-PROOF-SPEC-P", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.harness.inference_proof_spec", "join_proof_spec_p", "JOIN-PROOF-SPEC-P", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.harness.inference_proof_spec", "split_proof_spec_p", "SPLIT-PROOF-SPEC-P", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.harness.inference_proof_spec", "restriction_proof_spec_p", "RESTRICTION-PROOF-SPEC-P", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.harness.inference_proof_spec", "join_ordered_proof_spec_p", "JOIN-ORDERED-PROOF-SPEC-P", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.harness.inference_proof_spec", "content_proof_spec_p", "CONTENT-PROOF-SPEC-P", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.harness.inference_proof_spec", "removal_proof_spec_p", "REMOVAL-PROOF-SPEC-P", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.harness.inference_proof_spec", "conjunctive_removal_proof_spec_p", "CONJUNCTIVE-REMOVAL-PROOF-SPEC-P", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.harness.inference_proof_spec", "transformation_proof_spec_p", "TRANSFORMATION-PROOF-SPEC-P", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.harness.inference_proof_spec", "residual_transformation_proof_spec_p", "RESIDUAL-TRANSFORMATION-PROOF-SPEC-P", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.harness.inference_proof_spec", "rewrite_proof_spec_p", "REWRITE-PROOF-SPEC-P", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.harness.inference_proof_spec", "removal_module_spec_p", "REMOVAL-MODULE-SPEC-P", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.harness.inference_proof_spec", "conjunctive_removal_module_spec_p", "CONJUNCTIVE-REMOVAL-MODULE-SPEC-P", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.harness.inference_proof_spec", "transformation_module_spec_p", "TRANSFORMATION-MODULE-SPEC-P", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.harness.inference_proof_spec", "literal_spec_p", "LITERAL-SPEC-P", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.harness.inference_proof_spec", "single_literal_proof_spec_p", "SINGLE-LITERAL-PROOF-SPEC-P", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.harness.inference_proof_spec", "removal_module_name_p", "REMOVAL-MODULE-NAME-P", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.harness.inference_proof_spec", "conjunctive_removal_module_name_p", "CONJUNCTIVE-REMOVAL-MODULE-NAME-P", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.harness.inference_proof_spec", "transformation_module_name_p", "TRANSFORMATION-MODULE-NAME-P", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.harness.inference_proof_spec", "proof_spec_or_nothing_p", "PROOF-SPEC-OR-NOTHING-P", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.harness.inference_proof_spec", "transformation_proof_rule_p", "TRANSFORMATION-PROOF-RULE-P", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.harness.inference_proof_spec", "transformational_proof_spec_p", "TRANSFORMATIONAL-PROOF-SPEC-P", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.harness.inference_proof_spec", "branching_proof_spec_p", "BRANCHING-PROOF-SPEC-P", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.harness.inference_proof_spec", "inference_module_spec_p", "INFERENCE-MODULE-SPEC-P", 3, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.harness.inference_proof_spec", "negated_module_spec_p", "NEGATED-MODULE-SPEC-P", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.harness.inference_proof_spec", "conjunctive_module_spec_p", "CONJUNCTIVE-MODULE-SPEC-P", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.harness.inference_proof_spec", "disjunctive_module_spec_p", "DISJUNCTIVE-MODULE-SPEC-P", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.harness.inference_proof_spec", "single_literal_proof_spec_hl_sentence", "SINGLE-LITERAL-PROOF-SPEC-HL-SENTENCE", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.harness.inference_proof_spec", "restriction_proof_spec_restricted_proof_spec", "RESTRICTION-PROOF-SPEC-RESTRICTED-PROOF-SPEC", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.harness.inference_proof_spec", "join_ordered_proof_spec_non_focal_proof_spec", "JOIN-ORDERED-PROOF-SPEC-NON-FOCAL-PROOF-SPEC", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.harness.inference_proof_spec", "split_proof_spec_sub_proof_specs", "SPLIT-PROOF-SPEC-SUB-PROOF-SPECS", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.harness.inference_proof_spec", "join_ordered_proof_spec_focal_proof_spec", "JOIN-ORDERED-PROOF-SPEC-FOCAL-PROOF-SPEC", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.harness.inference_proof_spec", "union_proof_spec_disjunct_proof_spec", "UNION-PROOF-SPEC-DISJUNCT-PROOF-SPEC", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.harness.inference_proof_spec", "join_ordered_focal_proof_spec_pattern", "JOIN-ORDERED-FOCAL-PROOF-SPEC-PATTERN", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.harness.inference_proof_spec", "transformation_proof_spec_rule", "TRANSFORMATION-PROOF-SPEC-RULE", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.harness.inference_proof_spec", "transformation_proof_spec_supporting_proof_spec", "TRANSFORMATION-PROOF-SPEC-SUPPORTING-PROOF-SPEC", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.harness.inference_proof_spec", "residual_transformation_proof_spec_rule", "RESIDUAL-TRANSFORMATION-PROOF-SPEC-RULE", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.harness.inference_proof_spec", "residual_transformation_proof_spec_supporting_proof_spec", "RESIDUAL-TRANSFORMATION-PROOF-SPEC-SUPPORTING-PROOF-SPEC", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.harness.inference_proof_spec", "proof_spec_literal_spec", "PROOF-SPEC-LITERAL-SPEC", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.harness.inference_proof_spec", "join_ordered_proof_spec_from_residual_transformation_proof_spec", "JOIN-ORDERED-PROOF-SPEC-FROM-RESIDUAL-TRANSFORMATION-PROOF-SPEC", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.harness.inference_proof_spec", "filter_proof_specs_of_type", "FILTER-PROOF-SPECS-OF-TYPE", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.harness.inference_proof_spec", "compute_proof_spec", "COMPUTE-PROOF-SPEC", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.harness.inference_proof_spec", "compute_proof_spec_recursive", "COMPUTE-PROOF-SPEC-RECURSIVE", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.harness.inference_proof_spec", "compute_removal_proof_spec", "COMPUTE-REMOVAL-PROOF-SPEC", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.harness.inference_proof_spec", "compute_transformation_proof_spec", "COMPUTE-TRANSFORMATION-PROOF-SPEC", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.harness.inference_proof_spec", "compute_rewrite_proof_spec", "COMPUTE-REWRITE-PROOF-SPEC", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.harness.inference_proof_spec", "compute_residual_transformation_proof_spec", "COMPUTE-RESIDUAL-TRANSFORMATION-PROOF-SPEC", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.harness.inference_proof_spec", "conjunctive_removal_restriction_proof_p", "CONJUNCTIVE-REMOVAL-RESTRICTION-PROOF-P", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.harness.inference_proof_spec", "compute_conjunctive_removal_restriction_proof_spec", "COMPUTE-CONJUNCTIVE-REMOVAL-RESTRICTION-PROOF-SPEC", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.harness.inference_proof_spec", "extract_single_literal_proof_info_for_proof_spec", "EXTRACT-SINGLE-LITERAL-PROOF-INFO-FOR-PROOF-SPEC", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.harness.inference_proof_spec", "compute_structural_proof_spec", "COMPUTE-STRUCTURAL-PROOF-SPEC", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.harness.inference_proof_spec", "inference_proof_spec", "INFERENCE-PROOF-SPEC", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.harness.inference_proof_spec", "inference_first_answer_proof_spec", "INFERENCE-FIRST-ANSWER-PROOF-SPEC", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.harness.inference_proof_spec", "inference_all_answer_proof_specs", "INFERENCE-ALL-ANSWER-PROOF-SPECS", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.harness.inference_proof_spec", "failed_inference_proof_spec", "FAILED-INFERENCE-PROOF-SPEC", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.harness.inference_proof_spec", "root_problem_has_top_level_disjunctP", "ROOT-PROBLEM-HAS-TOP-LEVEL-DISJUNCT?", 1, 0, false);
        SubLFiles.declareMacro("com.cyc.cycjava.cycl.inference.harness.inference_proof_spec", "with_failed_proof_spec_for_object", "WITH-FAILED-PROOF-SPEC-FOR-OBJECT");
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.harness.inference_proof_spec", "failed_inference_union_problem_proof_spec", "FAILED-INFERENCE-UNION-PROBLEM-PROOF-SPEC", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.harness.inference_proof_spec", "failed_inference_problem_proof_spec", "FAILED-INFERENCE-PROBLEM-PROOF-SPEC", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.harness.inference_proof_spec", "failed_inference_link_proof_spec", "FAILED-INFERENCE-LINK-PROOF-SPEC", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.harness.inference_proof_spec", "problem_link_tactic_executedP", "PROBLEM-LINK-TACTIC-EXECUTED?", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.harness.inference_proof_spec", "possibly_tactic_executedP", "POSSIBLY-TACTIC-EXECUTED?", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.harness.inference_proof_spec", "failed_inference_removal_link_proof_spec", "FAILED-INFERENCE-REMOVAL-LINK-PROOF-SPEC", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.harness.inference_proof_spec", "failed_inference_rewrite_link_proof_spec", "FAILED-INFERENCE-REWRITE-LINK-PROOF-SPEC", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.harness.inference_proof_spec", "failed_inference_transformation_link_proof_spec", "FAILED-INFERENCE-TRANSFORMATION-LINK-PROOF-SPEC", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.harness.inference_proof_spec", "failed_inference_answer_link_proof_spec", "FAILED-INFERENCE-ANSWER-LINK-PROOF-SPEC", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.harness.inference_proof_spec", "failed_inference_restriction_link_proof_spec", "FAILED-INFERENCE-RESTRICTION-LINK-PROOF-SPEC", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.harness.inference_proof_spec", "failed_inference_split_link_proof_spec", "FAILED-INFERENCE-SPLIT-LINK-PROOF-SPEC", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.harness.inference_proof_spec", "failed_inference_join_link_proof_spec", "FAILED-INFERENCE-JOIN-LINK-PROOF-SPEC", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.harness.inference_proof_spec", "failed_inference_join_ordered_link_proof_spec", "FAILED-INFERENCE-JOIN-ORDERED-LINK-PROOF-SPEC", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.harness.inference_proof_spec", "failed_inference_union_link_proof_spec", "FAILED-INFERENCE-UNION-LINK-PROOF-SPEC", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.harness.inference_proof_spec", "failed_inference_residual_transformation_link_proof_spec", "FAILED-INFERENCE-RESIDUAL-TRANSFORMATION-LINK-PROOF-SPEC", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.harness.inference_proof_spec", "failed_inference_tactic_proof_spec", "FAILED-INFERENCE-TACTIC-PROOF-SPEC", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.harness.inference_proof_spec", "failed_inference_removal_tactic_proof_spec", "FAILED-INFERENCE-REMOVAL-TACTIC-PROOF-SPEC", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.harness.inference_proof_spec", "failed_inference_split_tactic_proof_spec", "FAILED-INFERENCE-SPLIT-TACTIC-PROOF-SPEC", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.harness.inference_proof_spec", "failed_inference_join_ordered_tactic_proof_spec", "FAILED-INFERENCE-JOIN-ORDERED-TACTIC-PROOF-SPEC", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.harness.inference_proof_spec", "failed_inference_join_tactic_proof_spec", "FAILED-INFERENCE-JOIN-TACTIC-PROOF-SPEC", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.harness.inference_proof_spec", "failed_inference_transformation_tactic_proof_spec", "FAILED-INFERENCE-TRANSFORMATION-TACTIC-PROOF-SPEC", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.harness.inference_proof_spec", "failed_inference_rewrite_tactic_proof_spec", "FAILED-INFERENCE-REWRITE-TACTIC-PROOF-SPEC", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.harness.inference_proof_spec", "failed_inference_restriction_tactic_proof_spec", "FAILED-INFERENCE-RESTRICTION-TACTIC-PROOF-SPEC", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.harness.inference_proof_spec", "hl_asent_from_problem_query", "HL-ASENT-FROM-PROBLEM-QUERY", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.harness.inference_proof_spec", "merge_proof_specs", "MERGE-PROOF-SPECS", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.harness.inference_proof_spec", "merge_2_proof_specs", "MERGE-2-PROOF-SPECS", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.harness.inference_proof_spec", "merge_into_or_pattern", "MERGE-INTO-OR-PATTERN", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.harness.inference_proof_spec", "proof_specs_mergeable_wrt_typeP", "PROOF-SPECS-MERGEABLE-WRT-TYPE?", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.harness.inference_proof_spec", "proof_spec_type", "PROOF-SPEC-TYPE", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.harness.inference_proof_spec", "merge_removal_proof_specs", "MERGE-REMOVAL-PROOF-SPECS", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.harness.inference_proof_spec", "merge_transformation_proof_specs", "MERGE-TRANSFORMATION-PROOF-SPECS", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.harness.inference_proof_spec", "merge_residual_transformation_proof_specs", "MERGE-RESIDUAL-TRANSFORMATION-PROOF-SPECS", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.harness.inference_proof_spec", "merge_generalized_transformation_proof_specs", "MERGE-GENERALIZED-TRANSFORMATION-PROOF-SPECS", 3, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.harness.inference_proof_spec", "merge_single_literal_formula_patterns", "MERGE-SINGLE-LITERAL-FORMULA-PATTERNS", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.harness.inference_proof_spec", "destructure_single_literal_formula_pattern", "DESTRUCTURE-SINGLE-LITERAL-FORMULA-PATTERN", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.harness.inference_proof_spec", "merge_content_spec_module_patterns", "MERGE-CONTENT-SPEC-MODULE-PATTERNS", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.harness.inference_proof_spec", "make_or_pattern", "MAKE-OR-PATTERN", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.harness.inference_proof_spec", "or_pattern_p", "OR-PATTERN-P", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.harness.inference_proof_spec", "merge_proof_spec_terms", "MERGE-PROOF-SPEC-TERMS", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.harness.inference_proof_spec", "merge_proof_spec_term", "MERGE-PROOF-SPEC-TERM", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.harness.inference_proof_spec", "genericize_proof_spec", "GENERICIZE-PROOF-SPEC", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.harness.inference_proof_spec", "genericize_content_proof_spec", "GENERICIZE-CONTENT-PROOF-SPEC", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.harness.inference_proof_spec", "genericize_removal_proof_spec", "GENERICIZE-REMOVAL-PROOF-SPEC", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.harness.inference_proof_spec", "genericize_transformation_proof_spec", "GENERICIZE-TRANSFORMATION-PROOF-SPEC", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.harness.inference_proof_spec", "genericize_residual_transformation_proof_spec", "GENERICIZE-RESIDUAL-TRANSFORMATION-PROOF-SPEC", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.harness.inference_proof_spec", "genericize_generalized_transformation_proof_spec", "GENERICIZE-GENERALIZED-TRANSFORMATION-PROOF-SPEC", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.harness.inference_proof_spec", "genericize_single_literal_formula_pattern", "GENERICIZE-SINGLE-LITERAL-FORMULA-PATTERN", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.harness.inference_proof_spec", "genericize_proof_spec_terms", "GENERICIZE-PROOF-SPEC-TERMS", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.harness.inference_proof_spec", "genericize_proof_spec_term", "GENERICIZE-PROOF-SPEC-TERM", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.harness.inference_proof_spec", "genericize_problem_query", "GENERICIZE-PROBLEM-QUERY", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.harness.inference_proof_spec", "genericize_contextualized_clause", "GENERICIZE-CONTEXTUALIZED-CLAUSE", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.harness.inference_proof_spec", "genericize_contextualized_asent", "GENERICIZE-CONTEXTUALIZED-ASENT", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.harness.inference_proof_spec", "genericize_formula", "GENERICIZE-FORMULA", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.harness.inference_proof_spec", "genericize_formula_args", "GENERICIZE-FORMULA-ARGS", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.harness.inference_proof_spec", "genericize_term_wrt_pattern_match", "GENERICIZE-TERM-WRT-PATTERN-MATCH", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.harness.inference_proof_spec", "proof_spec_possibly_admits_problemP", "PROOF-SPEC-POSSIBLY-ADMITS-PROBLEM?", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.harness.inference_proof_spec", "query_parameters_from_proof_spec", "QUERY-PARAMETERS-FROM-PROOF-SPEC", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.harness.inference_proof_spec", "query_allowance_parameters_from_proof_spec", "QUERY-ALLOWANCE-PARAMETERS-FROM-PROOF-SPEC", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.harness.inference_proof_spec", "query_allowance_parameters_from_proof_spec_recursive", "QUERY-ALLOWANCE-PARAMETERS-FROM-PROOF-SPEC-RECURSIVE", 3, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.harness.inference_proof_spec", "module_parameters_from_module_pattern", "MODULE-PARAMETERS-FROM-MODULE-PATTERN", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.harness.inference_proof_spec", "use_kbq_proof_spec_tableP", "USE-KBQ-PROOF-SPEC-TABLE?", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.harness.inference_proof_spec", "initialize_kbq_proof_spec_table", "INITIALIZE-KBQ-PROOF-SPEC-TABLE", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.harness.inference_proof_spec", "overriding_experimental_proof_spec_properties", "OVERRIDING-EXPERIMENTAL-PROOF-SPEC-PROPERTIES", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.harness.inference_proof_spec", "initialize_kbq_proof_spec_table_from_query_set", "INITIALIZE-KBQ-PROOF-SPEC-TABLE-FROM-QUERY-SET", 1, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.harness.inference_proof_spec", "proof_spec_for_kbq", "PROOF-SPEC-FOR-KBQ", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.harness.inference_proof_spec", "inference_results_for_kbq", "INFERENCE-RESULTS-FOR-KBQ", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.harness.inference_proof_spec", "analyze_asked_queries_for_proof_spec_overlap", "ANALYZE-ASKED-QUERIES-FOR-PROOF-SPEC-OVERLAP", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.harness.inference_proof_spec", "run_proof_spec_experiment", "RUN-PROOF-SPEC-EXPERIMENT", 2, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.harness.inference_proof_spec", "run_and_save_one_proof_spec_experiment", "RUN-AND-SAVE-ONE-PROOF-SPEC-EXPERIMENT", 2, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.harness.inference_proof_spec", "load_proof_spec_experiment", "LOAD-PROOF-SPEC-EXPERIMENT", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.harness.inference_proof_spec", "proof_spec_data_metric_positions", "PROOF-SPEC-DATA-METRIC-POSITIONS", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.harness.inference_proof_spec", "proof_spec_data_lookup", "PROOF-SPEC-DATA-LOOKUP", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.harness.inference_proof_spec", "analyze_proof_spec_experiment_answerability", "ANALYZE-PROOF-SPEC-EXPERIMENT-ANSWERABILITY", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.harness.inference_proof_spec", "graph_proof_spec_experiment_metric", "GRAPH-PROOF-SPEC-EXPERIMENT-METRIC", 2, 2, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.harness.inference_proof_spec", "experiment_run_proof_spec_for_kbq", "EXPERIMENT-RUN-PROOF-SPEC-FOR-KBQ", 1, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.harness.inference_proof_spec", "test_proof_spec_for_kbq", "TEST-PROOF-SPEC-FOR-KBQ", 1, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.harness.inference_proof_spec", "test_proof_spec_for_query", "TEST-PROOF-SPEC-FOR-QUERY", 2, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.harness.inference_proof_spec", "test_proof_spec_for_query_int", "TEST-PROOF-SPEC-FOR-QUERY-INT", 4, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.harness.inference_proof_spec", "retest_proof_spec_for_kbq", "RETEST-PROOF-SPEC-FOR-KBQ", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.harness.inference_proof_spec", "retest_proof_spec_for_query", "RETEST-PROOF-SPEC-FOR-QUERY", 4, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.harness.inference_proof_spec", "test_inference_proof_spec", "TEST-INFERENCE-PROOF-SPEC", 0, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.harness.inference_proof_spec", "test_query_first_proof_spec", "TEST-QUERY-FIRST-PROOF-SPEC", 1, 0, false);
        return (SubLObject)inference_proof_spec.NIL;
    }
    
    public static SubLObject init_inference_proof_spec_file() {
        inference_proof_spec.$kbq_proof_spec_table$ = SubLFiles.deflexical("*KBQ-PROOF-SPEC-TABLE*", (inference_proof_spec.NIL != Symbols.boundp((SubLObject)inference_proof_spec.$sym94$_KBQ_PROOF_SPEC_TABLE_)) ? inference_proof_spec.$kbq_proof_spec_table$.getGlobalValue() : dictionary.new_dictionary(Symbols.symbol_function((SubLObject)inference_proof_spec.EQL), (SubLObject)inference_proof_spec.UNPROVIDED));
        inference_proof_spec.$use_kbq_proof_spec_tableP$ = SubLFiles.defparameter("*USE-KBQ-PROOF-SPEC-TABLE?*", (SubLObject)inference_proof_spec.NIL);
        inference_proof_spec.$proof_spec_experiment_metrics$ = SubLFiles.deflexical("*PROOF-SPEC-EXPERIMENT-METRICS*", (SubLObject)inference_proof_spec.$list119);
        return (SubLObject)inference_proof_spec.NIL;
    }
    
    public static SubLObject setup_inference_proof_spec_file() {
        subl_macro_promotions.declare_defglobal((SubLObject)inference_proof_spec.$sym94$_KBQ_PROOF_SPEC_TABLE_);
        generic_testing.define_test_case_table_int((SubLObject)inference_proof_spec.$sym149$TEST_QUERY_FIRST_PROOF_SPEC, (SubLObject)ConsesLow.list(new SubLObject[] { inference_proof_spec.$kw152$TEST, Symbols.symbol_function((SubLObject)inference_proof_spec.EQUAL), inference_proof_spec.$kw153$OWNER, inference_proof_spec.NIL, inference_proof_spec.$kw154$CLASSES, inference_proof_spec.NIL, inference_proof_spec.$kw155$KB, inference_proof_spec.$kw156$TINY, inference_proof_spec.$kw157$WORKING_, inference_proof_spec.T }), (SubLObject)inference_proof_spec.$list158);
        generic_testing.define_test_case_table_int((SubLObject)inference_proof_spec.$sym63$MERGE_2_PROOF_SPECS, (SubLObject)ConsesLow.list(new SubLObject[] { inference_proof_spec.$kw152$TEST, Symbols.symbol_function((SubLObject)inference_proof_spec.EQUAL), inference_proof_spec.$kw153$OWNER, inference_proof_spec.NIL, inference_proof_spec.$kw154$CLASSES, inference_proof_spec.NIL, inference_proof_spec.$kw155$KB, inference_proof_spec.$kw156$TINY, inference_proof_spec.$kw157$WORKING_, inference_proof_spec.T }), (SubLObject)inference_proof_spec.$list159);
        return (SubLObject)inference_proof_spec.NIL;
    }
    
    @Override
	public void declareFunctions() {
        declare_inference_proof_spec_file();
    }
    
    @Override
	public void initializeVariables() {
        init_inference_proof_spec_file();
    }
    
    @Override
	public void runTopLevelForms() {
        setup_inference_proof_spec_file();
    }
    
    static {
        me = (SubLFile)new inference_proof_spec();
        inference_proof_spec.$kbq_proof_spec_table$ = null;
        inference_proof_spec.$use_kbq_proof_spec_tableP$ = null;
        inference_proof_spec.$proof_spec_experiment_metrics$ = null;
        $kw0$ANYTHING = SubLObjectFactory.makeKeyword("ANYTHING");
        $kw1$NOTHING = SubLObjectFactory.makeKeyword("NOTHING");
        $kw2$OR = SubLObjectFactory.makeKeyword("OR");
        $sym3$PROOF_SPEC_P = SubLObjectFactory.makeSymbol("PROOF-SPEC-P");
        $kw4$UNION = SubLObjectFactory.makeKeyword("UNION");
        $kw5$JOIN = SubLObjectFactory.makeKeyword("JOIN");
        $kw6$SPLIT = SubLObjectFactory.makeKeyword("SPLIT");
        $kw7$RESTRICTION = SubLObjectFactory.makeKeyword("RESTRICTION");
        $kw8$JOIN_ORDERED = SubLObjectFactory.makeKeyword("JOIN-ORDERED");
        $kw9$REMOVAL = SubLObjectFactory.makeKeyword("REMOVAL");
        $kw10$CONJUNCTIVE_REMOVAL = SubLObjectFactory.makeKeyword("CONJUNCTIVE-REMOVAL");
        $kw11$TRANSFORMATION = SubLObjectFactory.makeKeyword("TRANSFORMATION");
        $kw12$RESIDUAL_TRANSFORMATION = SubLObjectFactory.makeKeyword("RESIDUAL-TRANSFORMATION");
        $kw13$REWRITE = SubLObjectFactory.makeKeyword("REWRITE");
        $sym14$REMOVAL_MODULE_NAME_P = SubLObjectFactory.makeSymbol("REMOVAL-MODULE-NAME-P");
        $sym15$REMOVAL_MODULE_SPEC_P = SubLObjectFactory.makeSymbol("REMOVAL-MODULE-SPEC-P");
        $sym16$CONJUNCTIVE_REMOVAL_MODULE_NAME_P = SubLObjectFactory.makeSymbol("CONJUNCTIVE-REMOVAL-MODULE-NAME-P");
        $sym17$CONJUNCTIVE_REMOVAL_MODULE_SPEC_P = SubLObjectFactory.makeSymbol("CONJUNCTIVE-REMOVAL-MODULE-SPEC-P");
        $sym18$TRANSFORMATION_MODULE_NAME_P = SubLObjectFactory.makeSymbol("TRANSFORMATION-MODULE-NAME-P");
        $sym19$TRANSFORMATION_MODULE_SPEC_P = SubLObjectFactory.makeSymbol("TRANSFORMATION-MODULE-SPEC-P");
        $const20$not = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("not"));
        $kw21$NOT = SubLObjectFactory.makeKeyword("NOT");
        $kw22$AND = SubLObjectFactory.makeKeyword("AND");
        $sym23$SINGLE_LITERAL_PROOF_SPEC_P = SubLObjectFactory.makeSymbol("SINGLE-LITERAL-PROOF-SPEC-P");
        $sym24$RESTRICTION_PROOF_SPEC_P = SubLObjectFactory.makeSymbol("RESTRICTION-PROOF-SPEC-P");
        $sym25$JOIN_ORDERED_PROOF_SPEC_P = SubLObjectFactory.makeSymbol("JOIN-ORDERED-PROOF-SPEC-P");
        $sym26$SPLIT_PROOF_SPEC_P = SubLObjectFactory.makeSymbol("SPLIT-PROOF-SPEC-P");
        $sym27$UNION_PROOF_SPEC_P = SubLObjectFactory.makeSymbol("UNION-PROOF-SPEC-P");
        $sym28$SECOND = SubLObjectFactory.makeSymbol("SECOND");
        $sym29$TRANSFORMATION_PROOF_SPEC_P = SubLObjectFactory.makeSymbol("TRANSFORMATION-PROOF-SPEC-P");
        $sym30$RESIDUAL_TRANSFORMATION_PROOF_SPEC_P = SubLObjectFactory.makeSymbol("RESIDUAL-TRANSFORMATION-PROOF-SPEC-P");
        $list31 = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("RT-TOKEN"), (SubLObject)SubLObjectFactory.makeSymbol("LITERAL-SPEC"), (SubLObject)SubLObjectFactory.makeSymbol("TRANSFORMATION-MODULE-SPEC"), (SubLObject)SubLObjectFactory.makeSymbol("RULE-SPEC"), (SubLObject)SubLObjectFactory.makeSymbol("SUB-PROOF-SPEC"));
        $list32 = ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("NOTHING"));
        $list33 = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("OPERATOR"), (SubLObject)SubLObjectFactory.makeSymbol("&REST"), (SubLObject)SubLObjectFactory.makeSymbol("SUB-PROOF-SPECS"));
        $list34 = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("OPERATOR"), (SubLObject)SubLObjectFactory.makeSymbol("&REST"), (SubLObject)SubLObjectFactory.makeSymbol("SUB-RESULTS"));
        $sym35$PROOF_P = SubLObjectFactory.makeSymbol("PROOF-P");
        $str36$time_to_support__S_proofs = SubLObjectFactory.makeString("time to support ~S proofs");
        $sym37$STRUCTURAL_PROOF_P = SubLObjectFactory.makeSymbol("STRUCTURAL-PROOF-P");
        $sym38$INFERENCE_P = SubLObjectFactory.makeSymbol("INFERENCE-P");
        $list39 = ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("PROOF-SPEC"), (SubLObject)SubLObjectFactory.makeSymbol("OBJECT"), (SubLObject)SubLObjectFactory.makeSymbol("VISITED"), (SubLObject)SubLObjectFactory.makeSymbol("&OPTIONAL"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("COMBINATOR"), (SubLObject)SubLObjectFactory.makeKeyword("OR"))), (SubLObject)SubLObjectFactory.makeSymbol("&BODY"), (SubLObject)SubLObjectFactory.makeSymbol("BODY"));
        $sym40$CLET = SubLObjectFactory.makeSymbol("CLET");
        $sym41$SET_ADD = SubLObjectFactory.makeSymbol("SET-ADD");
        $sym42$PROGN = SubLObjectFactory.makeSymbol("PROGN");
        $sym43$CSETQ = SubLObjectFactory.makeSymbol("CSETQ");
        $sym44$DELETE = SubLObjectFactory.makeSymbol("DELETE");
        $kw45$IGNORE = SubLObjectFactory.makeKeyword("IGNORE");
        $sym46$PCOND = SubLObjectFactory.makeSymbol("PCOND");
        $sym47$NULL = SubLObjectFactory.makeSymbol("NULL");
        $list48 = ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("ANYTHING"));
        $sym49$SINGLETON_ = SubLObjectFactory.makeSymbol("SINGLETON?");
        $sym50$FIRST = SubLObjectFactory.makeSymbol("FIRST");
        $sym51$NREVERSE = SubLObjectFactory.makeSymbol("NREVERSE");
        $sym52$CPUSH = SubLObjectFactory.makeSymbol("CPUSH");
        $sym53$RET = SubLObjectFactory.makeSymbol("RET");
        $str54$Non_union_tactic__A_mixed_in_with = SubLObjectFactory.makeString("Non-union tactic ~A mixed in with union tactics at the top level.");
        $kw55$ANSWER = SubLObjectFactory.makeKeyword("ANSWER");
        $str56$Dont_know_how_to_handle_problem_l = SubLObjectFactory.makeString("Dont know how to handle problem link type ~A.");
        $str57$What_is_an_answer_link_doing_here = SubLObjectFactory.makeString("What is an answer link doing here????");
        $sym58$TACTIC_EXECUTED_ = SubLObjectFactory.makeSymbol("TACTIC-EXECUTED?");
        $str59$This_should_never_be_called_ = SubLObjectFactory.makeString("This should never be called.");
        $str60$This_should_only_occur_at_the_top = SubLObjectFactory.makeString("This should only occur at the top level.");
        $str61$Union_tactics_can_only_occur_at_t = SubLObjectFactory.makeString("Union tactics can only occur at the top level. Talk to the canonicalizer.");
        $str62$Dont_know_how_to_compute_the_proo = SubLObjectFactory.makeString("Dont know how to compute the proof-spec for tactic ~A.");
        $sym63$MERGE_2_PROOF_SPECS = SubLObjectFactory.makeSymbol("MERGE-2-PROOF-SPECS");
        $list64 = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("FORMULA-PATTERN-1"), (SubLObject)SubLObjectFactory.makeSymbol("MODULE-PATTERN-1"));
        $list65 = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("FORMULA-PATTERN-2"), (SubLObject)SubLObjectFactory.makeSymbol("MODULE-PATTERN-2"));
        $kw66$UNMERGEABLE = SubLObjectFactory.makeKeyword("UNMERGEABLE");
        $list67 = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("FORMULA-PATTERN-1"), (SubLObject)SubLObjectFactory.makeSymbol("MODULE-PATTERN-1"), (SubLObject)SubLObjectFactory.makeSymbol("RULE-1"), (SubLObject)SubLObjectFactory.makeSymbol("SUBSPEC-1"));
        $list68 = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("FORMULA-PATTERN-2"), (SubLObject)SubLObjectFactory.makeSymbol("MODULE-PATTERN-2"), (SubLObject)SubLObjectFactory.makeSymbol("RULE-2"), (SubLObject)SubLObjectFactory.makeSymbol("SUBSPEC-2"));
        $sym69$IST_SENTENCE_P = SubLObjectFactory.makeSymbol("IST-SENTENCE-P");
        $kw70$NEG = SubLObjectFactory.makeKeyword("NEG");
        $kw71$POS = SubLObjectFactory.makeKeyword("POS");
        $sym72$CONTENT_PROOF_SPEC_P = SubLObjectFactory.makeSymbol("CONTENT-PROOF-SPEC-P");
        $sym73$GENERICIZE_CONTENT_PROOF_SPEC = SubLObjectFactory.makeSymbol("GENERICIZE-CONTENT-PROOF-SPEC");
        $str74$Time_to_handle_proof_spec__s = SubLObjectFactory.makeString("Time to handle proof spec ~s");
        $list75 = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("FORMULA-PATTERN"), (SubLObject)SubLObjectFactory.makeSymbol("MODULE-PATTERN"));
        $list76 = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("FORMULA-PATTERN"), (SubLObject)SubLObjectFactory.makeSymbol("MODULE-PATTERN"), (SubLObject)SubLObjectFactory.makeSymbol("RULE"), (SubLObject)SubLObjectFactory.makeSymbol("SUBSPEC"));
        $kw77$FULLY_BOUND = SubLObjectFactory.makeKeyword("FULLY-BOUND");
        $list78 = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("MT"), (SubLObject)SubLObjectFactory.makeSymbol("ASENT"));
        $kw79$INTEGER = SubLObjectFactory.makeKeyword("INTEGER");
        $kw80$NUMBER = SubLObjectFactory.makeKeyword("NUMBER");
        $kw81$STRING = SubLObjectFactory.makeKeyword("STRING");
        $kw82$PROOF_SPEC = SubLObjectFactory.makeKeyword("PROOF-SPEC");
        $kw83$ALLOWED_MODULES = SubLObjectFactory.makeKeyword("ALLOWED-MODULES");
        $kw84$ALLOWED_RULES = SubLObjectFactory.makeKeyword("ALLOWED-RULES");
        $list85 = (SubLList)ConsesLow.cons((SubLObject)SubLObjectFactory.makeSymbol("OR"), (SubLObject)SubLObjectFactory.makeSymbol("SUB-SPECS"));
        $list86 = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("REMOVAL"), (SubLObject)SubLObjectFactory.makeSymbol("FORMULA-PATTERN"), (SubLObject)SubLObjectFactory.makeSymbol("MODULE-PATTERN"));
        $list87 = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("TRANSFORMATION"), (SubLObject)SubLObjectFactory.makeSymbol("FORMULA-PATTERN"), (SubLObject)SubLObjectFactory.makeSymbol("MODULE-PATTERN"), (SubLObject)SubLObjectFactory.makeSymbol("RULE"), (SubLObject)SubLObjectFactory.makeSymbol("SUB-SPEC"));
        $kw88$DETERMINE_NEW_TRANSFORMATION_TACTICS = SubLObjectFactory.makeKeyword("DETERMINE-NEW-TRANSFORMATION-TACTICS");
        $list89 = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("RESIDUAL-TRANSFORMATION"), (SubLObject)SubLObjectFactory.makeSymbol("FORMULA-PATTERN"), (SubLObject)SubLObjectFactory.makeSymbol("MODULE-PATTERN"), (SubLObject)SubLObjectFactory.makeSymbol("RULE"), (SubLObject)SubLObjectFactory.makeSymbol("SUB-SPEC"));
        $list90 = (SubLList)ConsesLow.cons((SubLObject)SubLObjectFactory.makeSymbol("STRUCTURAL"), (SubLObject)SubLObjectFactory.makeSymbol("SUB-SPECS"));
        $list91 = ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("JOIN-ORDERED"), (SubLObject)SubLObjectFactory.makeKeyword("JOIN"), (SubLObject)SubLObjectFactory.makeKeyword("SPLIT"), (SubLObject)SubLObjectFactory.makeKeyword("UNION"));
        $kw92$DETERMINE_NEW_SPLIT_TACTICS = SubLObjectFactory.makeKeyword("DETERMINE-NEW-SPLIT-TACTICS");
        $list93 = (SubLList)ConsesLow.cons((SubLObject)SubLObjectFactory.makeSymbol("OR"), (SubLObject)SubLObjectFactory.makeSymbol("SUB-PATTERNS"));
        $sym94$_KBQ_PROOF_SPEC_TABLE_ = SubLObjectFactory.makeSymbol("*KBQ-PROOF-SPEC-TABLE*");
        $kw95$INFERENCE_PROOF_SPEC = SubLObjectFactory.makeKeyword("INFERENCE-PROOF-SPEC");
        $str96$possibly_ill_formed_proof_spec___ = SubLObjectFactory.makeString("possibly ill-formed proof-spec: ~s");
        $list97 = ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("MAX-STEP"), (SubLObject)inference_proof_spec.ZERO_INTEGER);
        $const98$InferencePSC = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("InferencePSC"));
        $str99$Doing_inference_for_all_elements_ = SubLObjectFactory.makeString("Doing inference for all elements of KBQ query set ....");
        $str100$cdolist = SubLObjectFactory.makeString("cdolist");
        $kw101$IGNORE_ERRORS_TARGET = SubLObjectFactory.makeKeyword("IGNORE-ERRORS-TARGET");
        $sym102$IGNORE_ERRORS_HANDLER = SubLObjectFactory.makeSymbol("IGNORE-ERRORS-HANDLER", "SUBLISP");
        $kw103$METRICS = SubLObjectFactory.makeKeyword("METRICS");
        $list104 = ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("TOTAL-TIME"), (SubLObject)SubLObjectFactory.makeKeyword("INFERENCE-PROOF-SPEC"));
        $kw105$BROWSABLE_ = SubLObjectFactory.makeKeyword("BROWSABLE?");
        $kw106$MAX_TIME = SubLObjectFactory.makeKeyword("MAX-TIME");
        $int107$30 = SubLObjectFactory.makeInteger(30);
        $str108$___A___A__ = SubLObjectFactory.makeString("~&~A: ~A~%");
        $kw109$INPUT = SubLObjectFactory.makeKeyword("INPUT");
        $str110$Unable_to_open__S = SubLObjectFactory.makeString("Unable to open ~S");
        $kw111$EOF = SubLObjectFactory.makeKeyword("EOF");
        $str112$Read_invalid_query_info__s = SubLObjectFactory.makeString("Read invalid query info ~s");
        $list113 = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("PROBLEM-QUERY"), (SubLObject)SubLObjectFactory.makeSymbol("MT"), (SubLObject)SubLObjectFactory.makeSymbol("PROPERTIES"));
        $kw114$OUTPUT = SubLObjectFactory.makeKeyword("OUTPUT");
        $str115$Running_experiments___ = SubLObjectFactory.makeString("Running experiments...");
        $str116$Timeout___s = SubLObjectFactory.makeString("Timeout: ~s");
        $list117 = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("PROOF-SPEC-1"), (SubLObject)SubLObjectFactory.makeSymbol("TIME-TO-FIRST-ANSWER-1"), (SubLObject)SubLObjectFactory.makeSymbol("TOTAL-TIME-1"), (SubLObject)SubLObjectFactory.makeSymbol("TIME-PER-ANSWER-1"), (SubLObject)SubLObjectFactory.makeSymbol("TIME-TO-LAST-ANSWER-1"), (SubLObject)SubLObjectFactory.makeSymbol("TACTIC-COUNT-1"), (SubLObject)SubLObjectFactory.makeSymbol("EXECUTED-TACTIC-COUNT-1"), (SubLObject)SubLObjectFactory.makeSymbol("ANSWER-COUNT-1"));
        $list118 = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("TIME-TO-FIRST-ANSWER-2"), (SubLObject)SubLObjectFactory.makeSymbol("TOTAL-TIME-2"), (SubLObject)SubLObjectFactory.makeSymbol("TIME-PER-ANSWER-2"), (SubLObject)SubLObjectFactory.makeSymbol("TIME-TO-LAST-ANSWER-2"), (SubLObject)SubLObjectFactory.makeSymbol("TACTIC-COUNT-2"), (SubLObject)SubLObjectFactory.makeSymbol("EXECUTED-TACTIC-COUNT-2"), (SubLObject)SubLObjectFactory.makeSymbol("ANSWER-COUNT-2"));
        $list119 = ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("TIME-TO-FIRST-ANSWER"), (SubLObject)SubLObjectFactory.makeKeyword("TOTAL-TIME"), (SubLObject)SubLObjectFactory.makeKeyword("TIME-PER-ANSWER"), (SubLObject)SubLObjectFactory.makeKeyword("TIME-TO-LAST-ANSWER"), (SubLObject)SubLObjectFactory.makeKeyword("TACTIC-COUNT"), (SubLObject)SubLObjectFactory.makeKeyword("EXECUTED-TACTIC-COUNT"), (SubLObject)SubLObjectFactory.makeKeyword("ANSWER-COUNT"));
        $kw120$TIME_TO_FIRST_ANSWER = SubLObjectFactory.makeKeyword("TIME-TO-FIRST-ANSWER");
        $kw121$TOTAL_TIME = SubLObjectFactory.makeKeyword("TOTAL-TIME");
        $kw122$TIME_PER_ANSWER = SubLObjectFactory.makeKeyword("TIME-PER-ANSWER");
        $kw123$TIME_TO_LAST_ANSWER = SubLObjectFactory.makeKeyword("TIME-TO-LAST-ANSWER");
        $kw124$TACTIC_COUNT = SubLObjectFactory.makeKeyword("TACTIC-COUNT");
        $kw125$EXECUTED_TACTIC_COUNT = SubLObjectFactory.makeKeyword("EXECUTED-TACTIC-COUNT");
        $kw126$ANSWER_COUNT = SubLObjectFactory.makeKeyword("ANSWER-COUNT");
        $kw127$HALT_REASON = SubLObjectFactory.makeKeyword("HALT-REASON");
        $str128$unhandled_metric__s = SubLObjectFactory.makeString("unhandled metric ~s");
        $kw129$BOTH_ANSWERABLE = SubLObjectFactory.makeKeyword("BOTH-ANSWERABLE");
        $kw130$ONLY_BASELINE_ANSWERABLE = SubLObjectFactory.makeKeyword("ONLY-BASELINE-ANSWERABLE");
        $kw131$ONLY_PROOF_SPEC_ANSWERABLE = SubLObjectFactory.makeKeyword("ONLY-PROOF-SPEC-ANSWERABLE");
        $kw132$NEITHER_ANSWERABLE = SubLObjectFactory.makeKeyword("NEITHER-ANSWERABLE");
        $kw133$BOTH = SubLObjectFactory.makeKeyword("BOTH");
        $sym134$_ = SubLObjectFactory.makeSymbol("<");
        $kw135$BASELINE = SubLObjectFactory.makeKeyword("BASELINE");
        $sym136$CAR = SubLObjectFactory.makeSymbol("CAR");
        $sym137$CDR = SubLObjectFactory.makeSymbol("CDR");
        $kw138$EXPERIMENT = SubLObjectFactory.makeKeyword("EXPERIMENT");
        $str139$unhandled_sort_by__s = SubLObjectFactory.makeString("unhandled sort-by ~s");
        $sym140$COORDINATIFY = SubLObjectFactory.makeSymbol("COORDINATIFY");
        $list141 = ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("TOTAL-TIME"));
        $list142 = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("PROOF-SPEC"), (SubLObject)SubLObjectFactory.makeSymbol("TOTAL-TIME-1"));
        $list143 = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("TOTAL-TIME-2"));
        $str144$Proof_spec_query_is_slower___s_vs = SubLObjectFactory.makeString("Proof-spec query is slower: ~s vs. ~s");
        $str145$Proof_spec_query_failed_to_get__s = SubLObjectFactory.makeString("Proof-spec query failed to get ~s");
        $str146$Proof_spec_query_got_additional_a = SubLObjectFactory.makeString("Proof-spec query got additional answers: ~s");
        $list147 = ConsesLow.list(new SubLObject[] { SubLObjectFactory.makeSymbol("FEWER-ANSWERS?"), SubLObjectFactory.makeSymbol("SLOWER?"), SubLObjectFactory.makeSymbol("PROOF-SPEC"), SubLObjectFactory.makeSymbol("RESULT-1"), SubLObjectFactory.makeSymbol("RESULT-2"), SubLObjectFactory.makeSymbol("HALT-REASON-1"), SubLObjectFactory.makeSymbol("HALT-REASON-2"), SubLObjectFactory.makeSymbol("TOTAL-TIME-1"), SubLObjectFactory.makeSymbol("TOTAL-TIME-2") });
        $kw148$TERSE = SubLObjectFactory.makeKeyword("TERSE");
        $sym149$TEST_QUERY_FIRST_PROOF_SPEC = SubLObjectFactory.makeSymbol("TEST-QUERY-FIRST-PROOF-SPEC");
        $const150$EverythingPSC = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("EverythingPSC"));
        $list151 = ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("BROWSABLE?"), (SubLObject)inference_proof_spec.T, (SubLObject)SubLObjectFactory.makeKeyword("METRICS"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("ANSWER-PROOF-SPECS")));
        $kw152$TEST = SubLObjectFactory.makeKeyword("TEST");
        $kw153$OWNER = SubLObjectFactory.makeKeyword("OWNER");
        $kw154$CLASSES = SubLObjectFactory.makeKeyword("CLASSES");
        $kw155$KB = SubLObjectFactory.makeKeyword("KB");
        $kw156$TINY = SubLObjectFactory.makeKeyword("TINY");
        $kw157$WORKING_ = SubLObjectFactory.makeKeyword("WORKING?");
        $list158 = ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("isa")), constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("isa")), constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("BinaryPredicate")))), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("REMOVAL"), (SubLObject)ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("ist")), constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("EverythingPSC")), (SubLObject)ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("isa")), constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("isa")), constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("BinaryPredicate")))), (SubLObject)SubLObjectFactory.makeKeyword("REMOVAL-ISA-COLLECTION-CHECK-POS"))), (SubLObject)ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("elementOf")), (SubLObject)SubLObjectFactory.makeSymbol("?PRED"), (SubLObject)ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("TheSet")), constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("isa")), constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("genls"))))), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("REMOVAL"), (SubLObject)ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("ist")), constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("EverythingPSC")), (SubLObject)ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("elementOf")), constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("isa")), (SubLObject)ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("TheSet")), constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("isa")), constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("genls"))))), (SubLObject)SubLObjectFactory.makeKeyword("REMOVAL-ELEMENTOF-UNIFY"))), (SubLObject)ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("and")), (SubLObject)ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("isa")), constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("isa")), constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("BinaryPredicate"))), (SubLObject)ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("isa")), (SubLObject)inference_proof_spec.ONE_INTEGER, constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("PositiveInteger"))))), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("SPLIT"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("REMOVAL"), (SubLObject)ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("ist")), constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("EverythingPSC")), (SubLObject)ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("isa")), constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("isa")), constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("BinaryPredicate")))), (SubLObject)SubLObjectFactory.makeKeyword("REMOVAL-ISA-COLLECTION-CHECK-POS")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("REMOVAL"), (SubLObject)ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("ist")), constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("EverythingPSC")), (SubLObject)ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("isa")), (SubLObject)inference_proof_spec.ONE_INTEGER, constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("PositiveInteger")))), (SubLObject)SubLObjectFactory.makeKeyword("REMOVAL-ISA-DEFN-POS")))), (SubLObject)ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("and")), (SubLObject)ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("integerBetween")), (SubLObject)inference_proof_spec.MINUS_ONE_INTEGER, (SubLObject)SubLObjectFactory.makeSymbol("?N"), (SubLObject)inference_proof_spec.ONE_INTEGER), (SubLObject)ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("isa")), (SubLObject)SubLObjectFactory.makeSymbol("?N"), constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("PositiveInteger"))))), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("JOIN-ORDERED"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("REMOVAL"), (SubLObject)ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("ist")), constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("EverythingPSC")), (SubLObject)ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("integerBetween")), (SubLObject)inference_proof_spec.MINUS_ONE_INTEGER, (SubLObject)inference_proof_spec.ONE_INTEGER, (SubLObject)inference_proof_spec.ONE_INTEGER)), (SubLObject)SubLObjectFactory.makeKeyword("REMOVAL-INTEGER-BETWEEN-UNIFY")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("RESTRICTION"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("REMOVAL"), (SubLObject)ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("ist")), constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("EverythingPSC")), (SubLObject)ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("isa")), (SubLObject)inference_proof_spec.ONE_INTEGER, constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("PositiveInteger")))), (SubLObject)SubLObjectFactory.makeKeyword("REMOVAL-ISA-DEFN-POS"))))));
        $list159 = ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("REMOVAL"), (SubLObject)ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("ist")), constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("EverythingPSC")), (SubLObject)ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("isa")), constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("isa")), constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("BinaryPredicate")))), (SubLObject)SubLObjectFactory.makeKeyword("REMOVAL-ISA-COLLECTION-CHECK-POS")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("REMOVAL"), (SubLObject)ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("ist")), constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("EverythingPSC")), (SubLObject)ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("isa")), constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("genls")), constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("BinaryPredicate")))), (SubLObject)SubLObjectFactory.makeKeyword("REMOVAL-ISA-COLLECTION-CHECK-POS"))), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("REMOVAL"), (SubLObject)ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("ist")), constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("EverythingPSC")), (SubLObject)ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("isa")), (SubLObject)SubLObjectFactory.makeKeyword("ANYTHING"), constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("BinaryPredicate")))), (SubLObject)SubLObjectFactory.makeKeyword("REMOVAL-ISA-COLLECTION-CHECK-POS"))));
    }
}

/*

	Total time: 837 ms
	
*/