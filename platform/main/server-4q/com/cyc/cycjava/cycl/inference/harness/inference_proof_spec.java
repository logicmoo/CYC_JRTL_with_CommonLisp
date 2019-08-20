package com.cyc.cycjava.cycl.inference.harness;

import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow.*;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.*;
import static com.cyc.tool.subl.util.SubLFiles.*;

import com.cyc.cycjava.cycl.assertions_high;
import com.cyc.cycjava.cycl.bindings;
import com.cyc.cycjava.cycl.cfasl;
import com.cyc.cycjava.cycl.cfasl_utilities;
import com.cyc.cycjava.cycl.clause_utilities;
import com.cyc.cycjava.cycl.clauses;
import com.cyc.cycjava.cycl.cycl_grammar;
import com.cyc.cycjava.cycl.cycl_utilities;
import com.cyc.cycjava.cycl.dictionary;
import com.cyc.cycjava.cycl.dictionary_contents;
import com.cyc.cycjava.cycl.dictionary_utilities;
import com.cyc.cycjava.cycl.el_utilities;
import com.cyc.cycjava.cycl.forts;
import com.cyc.cycjava.cycl.list_utilities;
import com.cyc.cycjava.cycl.numeric_date_utilities;
import com.cyc.cycjava.cycl.pattern_match;
import com.cyc.cycjava.cycl.plot_generation;
import com.cyc.cycjava.cycl.set;
import com.cyc.cycjava.cycl.set_contents;
import com.cyc.cycjava.cycl.simplifier;
import com.cyc.cycjava.cycl.subl_macro_promotions;
import com.cyc.cycjava.cycl.subl_promotions;
import com.cyc.cycjava.cycl.transform_list_utilities;
import com.cyc.cycjava.cycl.utilities_macros;
import com.cyc.cycjava.cycl.variables;
import com.cyc.cycjava.cycl.cyc_testing.generic_testing;
import com.cyc.cycjava.cycl.inference.kb_query;
import com.cyc.cycjava.cycl.inference.kbq_query_run;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Errors;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Functions;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Mapping;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Numbers;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.PrintLow;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Sequences;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Sort;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.StreamsLow;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.SubLThread;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Symbols;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Threads;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Time;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Values;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLList;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObject;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLProcess;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLString;
import com.cyc.tool.subl.jrtl.nativeCode.type.number.SubLInteger;
import com.cyc.tool.subl.jrtl.nativeCode.type.symbol.SubLSymbol;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.cdestructuring_bind;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.compatibility;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.conses_high;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.print_high;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.reader;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.stream_macros;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.streams_high;
import com.cyc.tool.subl.util.SubLFile;
import com.cyc.tool.subl.util.SubLTranslatedFile;

public class inference_proof_spec extends SubLTranslatedFile {
    public static SubLFile me;
    public static String myFingerPrint = "59f6a05209317325ebad475df6c491c67769f20cdbbfdf494d5daa07b1c7a1a4";
    @SubL(source = "cycl/inference/harness/inference-proof-spec.lisp", position = 51900L)
    private static SubLSymbol $kbq_proof_spec_table$;
    @SubL(source = "cycl/inference/harness/inference-proof-spec.lisp", position = 52200L)
    private static SubLSymbol $use_kbq_proof_spec_tableP$;
    @SubL(source = "cycl/inference/harness/inference-proof-spec.lisp", position = 57900L)
    private static SubLSymbol $proof_spec_experiment_metrics$;
    private static SubLSymbol $ANYTHING;
    private static SubLSymbol $NOTHING;
    private static SubLSymbol $OR;
    private static SubLSymbol $sym3$PROOF_SPEC_P;
    private static SubLSymbol $UNION;
    private static SubLSymbol $JOIN;
    private static SubLSymbol $SPLIT;
    private static SubLSymbol $RESTRICTION;
    private static SubLSymbol $JOIN_ORDERED;
    private static SubLSymbol $REMOVAL;
    private static SubLSymbol $CONJUNCTIVE_REMOVAL;
    private static SubLSymbol $TRANSFORMATION;
    private static SubLSymbol $RESIDUAL_TRANSFORMATION;
    private static SubLSymbol $REWRITE;
    private static SubLSymbol $sym14$REMOVAL_MODULE_NAME_P;
    private static SubLSymbol $sym15$REMOVAL_MODULE_SPEC_P;
    private static SubLSymbol $sym16$CONJUNCTIVE_REMOVAL_MODULE_NAME_P;
    private static SubLSymbol $sym17$CONJUNCTIVE_REMOVAL_MODULE_SPEC_P;
    private static SubLSymbol $sym18$TRANSFORMATION_MODULE_NAME_P;
    private static SubLSymbol $sym19$TRANSFORMATION_MODULE_SPEC_P;
    private static SubLObject $$not;
    private static SubLSymbol $NOT;
    private static SubLSymbol $AND;
    private static SubLSymbol $sym23$SINGLE_LITERAL_PROOF_SPEC_P;
    private static SubLSymbol $sym24$RESTRICTION_PROOF_SPEC_P;
    private static SubLSymbol $sym25$JOIN_ORDERED_PROOF_SPEC_P;
    private static SubLSymbol $sym26$SPLIT_PROOF_SPEC_P;
    private static SubLSymbol $sym27$UNION_PROOF_SPEC_P;
    private static SubLSymbol $sym28$SECOND;
    private static SubLSymbol $sym29$TRANSFORMATION_PROOF_SPEC_P;
    private static SubLSymbol $sym30$RESIDUAL_TRANSFORMATION_PROOF_SPEC_P;
    private static SubLList $list31;
    private static SubLList $list32;
    private static SubLList $list33;
    private static SubLList $list34;
    private static SubLSymbol $sym35$PROOF_P;
    private static SubLString $str36$time_to_support__S_proofs;
    private static SubLSymbol $sym37$STRUCTURAL_PROOF_P;
    private static SubLSymbol $sym38$INFERENCE_P;
    private static SubLList $list39;
    private static SubLSymbol $sym40$CLET;
    private static SubLSymbol $sym41$SET_ADD;
    private static SubLSymbol $sym42$PROGN;
    private static SubLSymbol $sym43$CSETQ;
    private static SubLSymbol $sym44$DELETE;
    private static SubLSymbol $IGNORE;
    private static SubLSymbol $sym46$PCOND;
    private static SubLSymbol $sym47$NULL;
    private static SubLList $list48;
    private static SubLSymbol $sym49$SINGLETON_;
    private static SubLSymbol $sym50$FIRST;
    private static SubLSymbol $sym51$NREVERSE;
    private static SubLSymbol $sym52$CPUSH;
    private static SubLSymbol $sym53$RET;
    private static SubLString $str54$Non_union_tactic__A_mixed_in_with;
    private static SubLSymbol $ANSWER;
    private static SubLString $str56$Dont_know_how_to_handle_problem_l;
    private static SubLString $str57$What_is_an_answer_link_doing_here;
    private static SubLSymbol $sym58$TACTIC_EXECUTED_;
    private static SubLString $str59$This_should_never_be_called_;
    private static SubLString $str60$This_should_only_occur_at_the_top;
    private static SubLString $str61$Union_tactics_can_only_occur_at_t;
    private static SubLString $str62$Dont_know_how_to_compute_the_proo;
    private static SubLSymbol $sym63$MERGE_2_PROOF_SPECS;
    private static SubLList $list64;
    private static SubLList $list65;
    private static SubLSymbol $UNMERGEABLE;
    private static SubLList $list67;
    private static SubLList $list68;
    private static SubLSymbol $sym69$IST_SENTENCE_P;
    private static SubLSymbol $NEG;
    private static SubLSymbol $POS;
    private static SubLSymbol $sym72$CONTENT_PROOF_SPEC_P;
    private static SubLSymbol $sym73$GENERICIZE_CONTENT_PROOF_SPEC;
    private static SubLString $str74$Time_to_handle_proof_spec__s;
    private static SubLList $list75;
    private static SubLList $list76;
    private static SubLSymbol $FULLY_BOUND;
    private static SubLList $list78;
    private static SubLSymbol $INTEGER;
    private static SubLSymbol $NUMBER;
    private static SubLSymbol $STRING;
    private static SubLSymbol $PROOF_SPEC;
    private static SubLSymbol $ALLOWED_MODULES;
    private static SubLSymbol $ALLOWED_RULES;
    private static SubLList $list85;
    private static SubLList $list86;
    private static SubLList $list87;
    private static SubLSymbol $DETERMINE_NEW_TRANSFORMATION_TACTICS;
    private static SubLList $list89;
    private static SubLList $list90;
    private static SubLList $list91;
    private static SubLSymbol $DETERMINE_NEW_SPLIT_TACTICS;
    private static SubLList $list93;
    private static SubLSymbol $sym94$_KBQ_PROOF_SPEC_TABLE_;
    private static SubLSymbol $INFERENCE_PROOF_SPEC;
    private static SubLString $str96$possibly_ill_formed_proof_spec___;
    private static SubLList $list97;
    private static SubLObject $$InferencePSC;
    private static SubLString $str99$Doing_inference_for_all_elements_;
    private static SubLString $str100$cdolist;
    private static SubLSymbol $IGNORE_ERRORS_TARGET;
    private static SubLSymbol $sym102$IGNORE_ERRORS_HANDLER;
    private static SubLSymbol $METRICS;
    private static SubLList $list104;
    private static SubLSymbol $BROWSABLE_;
    private static SubLSymbol $MAX_TIME;
    private static SubLInteger $int$30;
    private static SubLString $str108$___A___A__;
    private static SubLSymbol $INPUT;
    private static SubLString $str110$Unable_to_open__S;
    private static SubLSymbol $EOF;
    private static SubLString $str112$Read_invalid_query_info__s;
    private static SubLList $list113;
    private static SubLSymbol $OUTPUT;
    private static SubLString $str115$Running_experiments___;
    private static SubLString $str116$Timeout___s;
    private static SubLList $list117;
    private static SubLList $list118;
    private static SubLList $list119;
    private static SubLSymbol $TIME_TO_FIRST_ANSWER;
    private static SubLSymbol $TOTAL_TIME;
    private static SubLSymbol $TIME_PER_ANSWER;
    private static SubLSymbol $TIME_TO_LAST_ANSWER;
    private static SubLSymbol $TACTIC_COUNT;
    private static SubLSymbol $EXECUTED_TACTIC_COUNT;
    private static SubLSymbol $ANSWER_COUNT;
    private static SubLSymbol $HALT_REASON;
    private static SubLString $str128$unhandled_metric__s;
    private static SubLSymbol $BOTH_ANSWERABLE;
    private static SubLSymbol $ONLY_BASELINE_ANSWERABLE;
    private static SubLSymbol $ONLY_PROOF_SPEC_ANSWERABLE;
    private static SubLSymbol $NEITHER_ANSWERABLE;
    private static SubLSymbol $BOTH;
    private static SubLSymbol $sym134$_;
    private static SubLSymbol $BASELINE;
    private static SubLSymbol $sym136$CAR;
    private static SubLSymbol $sym137$CDR;
    private static SubLSymbol $EXPERIMENT;
    private static SubLString $str139$unhandled_sort_by__s;
    private static SubLSymbol $sym140$COORDINATIFY;
    private static SubLList $list141;
    private static SubLList $list142;
    private static SubLList $list143;
    private static SubLString $str144$Proof_spec_query_is_slower___s_vs;
    private static SubLString $str145$Proof_spec_query_failed_to_get__s;
    private static SubLString $str146$Proof_spec_query_got_additional_a;
    private static SubLList $list147;
    private static SubLSymbol $TERSE;
    private static SubLSymbol $sym149$TEST_QUERY_FIRST_PROOF_SPEC;
    private static SubLObject $$EverythingPSC;
    private static SubLList $list151;
    private static SubLSymbol $TEST;
    private static SubLSymbol $OWNER;
    private static SubLSymbol $CLASSES;
    private static SubLSymbol $KB;
    private static SubLSymbol $TINY;
    private static SubLSymbol $WORKING_;
    private static SubLList $list158;
    private static SubLList $list159;

    @SubL(source = "cycl/inference/harness/inference-proof-spec.lisp", position = 3700L)
    public static SubLObject proof_spec_p(SubLObject proof_spec) {
        return makeBoolean(
                $ANYTHING == proof_spec || $NOTHING == proof_spec || (proof_spec.isCons() && $OR == proof_spec.first() && NIL != list_utilities.list_of_type_p($sym3$PROOF_SPEC_P, proof_spec.rest())) || NIL != structural_proof_spec_p(proof_spec) || NIL != content_proof_spec_p(proof_spec));
    }

    @SubL(source = "cycl/inference/harness/inference-proof-spec.lisp", position = 4100L)
    public static SubLObject structural_proof_spec_p(SubLObject proof_spec) {
        return makeBoolean(NIL != union_proof_spec_p(proof_spec) || NIL != join_ordered_proof_spec_p(proof_spec) || NIL != join_proof_spec_p(proof_spec) || NIL != split_proof_spec_p(proof_spec) || NIL != restriction_proof_spec_p(proof_spec) || NIL != conjunctive_removal_proof_spec_p(proof_spec));
    }

    @SubL(source = "cycl/inference/harness/inference-proof-spec.lisp", position = 4500L)
    public static SubLObject union_proof_spec_p(SubLObject proof_spec) {
        return branching_proof_spec_p($UNION, proof_spec);
    }

    @SubL(source = "cycl/inference/harness/inference-proof-spec.lisp", position = 4600L)
    public static SubLObject join_proof_spec_p(SubLObject proof_spec) {
        return branching_proof_spec_p($JOIN, proof_spec);
    }

    @SubL(source = "cycl/inference/harness/inference-proof-spec.lisp", position = 4700L)
    public static SubLObject split_proof_spec_p(SubLObject proof_spec) {
        return branching_proof_spec_p($SPLIT, proof_spec);
    }

    @SubL(source = "cycl/inference/harness/inference-proof-spec.lisp", position = 4800L)
    public static SubLObject restriction_proof_spec_p(SubLObject proof_spec) {
        return makeBoolean(proof_spec.isCons() && $RESTRICTION == proof_spec.first() && NIL != list_utilities.lengthE(proof_spec, TWO_INTEGER, UNPROVIDED) && NIL != proof_spec_p(conses_high.second(proof_spec)));
    }

    @SubL(source = "cycl/inference/harness/inference-proof-spec.lisp", position = 5000L)
    public static SubLObject join_ordered_proof_spec_p(SubLObject proof_spec) {
        return makeBoolean(proof_spec.isCons() && $JOIN_ORDERED == proof_spec.first() && NIL != list_utilities.lengthE(proof_spec, THREE_INTEGER, UNPROVIDED) && NIL != proof_spec_p(conses_high.second(proof_spec)) && NIL != proof_spec_p(conses_high.third(proof_spec)));
    }

    @SubL(source = "cycl/inference/harness/inference-proof-spec.lisp", position = 5300L)
    public static SubLObject content_proof_spec_p(SubLObject proof_spec) {
        return makeBoolean(NIL != removal_proof_spec_p(proof_spec) || NIL != transformation_proof_spec_p(proof_spec) || NIL != residual_transformation_proof_spec_p(proof_spec));
    }

    @SubL(source = "cycl/inference/harness/inference-proof-spec.lisp", position = 5500L)
    public static SubLObject removal_proof_spec_p(SubLObject proof_spec) {
        return makeBoolean(proof_spec.isCons() && $REMOVAL == proof_spec.first() && NIL != list_utilities.lengthE(proof_spec, THREE_INTEGER, UNPROVIDED) && NIL != literal_spec_p(conses_high.second(proof_spec)) && NIL != removal_module_spec_p(conses_high.third(proof_spec)));
    }

    @SubL(source = "cycl/inference/harness/inference-proof-spec.lisp", position = 5700L)
    public static SubLObject conjunctive_removal_proof_spec_p(SubLObject proof_spec) {
        return makeBoolean(
                proof_spec.isCons() && $CONJUNCTIVE_REMOVAL == proof_spec.first() && NIL != list_utilities.lengthE(proof_spec, THREE_INTEGER, UNPROVIDED) && NIL != conjunctive_removal_module_spec_p(conses_high.second(proof_spec)) && NIL != restriction_proof_spec_p(conses_high.third(proof_spec)));
    }

    @SubL(source = "cycl/inference/harness/inference-proof-spec.lisp", position = 6000L)
    public static SubLObject transformation_proof_spec_p(SubLObject proof_spec) {
        return transformational_proof_spec_p($TRANSFORMATION, proof_spec);
    }

    @SubL(source = "cycl/inference/harness/inference-proof-spec.lisp", position = 6200L)
    public static SubLObject residual_transformation_proof_spec_p(SubLObject proof_spec) {
        return transformational_proof_spec_p($RESIDUAL_TRANSFORMATION, proof_spec);
    }

    @SubL(source = "cycl/inference/harness/inference-proof-spec.lisp", position = 6300L)
    public static SubLObject rewrite_proof_spec_p(SubLObject proof_spec) {
        return makeBoolean(proof_spec.isCons() && $REWRITE == proof_spec.first() && NIL != list_utilities.lengthE(proof_spec, FOUR_INTEGER, UNPROVIDED) && conses_high.third(proof_spec).isKeyword());
    }

    @SubL(source = "cycl/inference/harness/inference-proof-spec.lisp", position = 6600L)
    public static SubLObject removal_module_spec_p(SubLObject module_spec) {
        return inference_module_spec_p(module_spec, $sym14$REMOVAL_MODULE_NAME_P, $sym15$REMOVAL_MODULE_SPEC_P);
    }

    @SubL(source = "cycl/inference/harness/inference-proof-spec.lisp", position = 6800L)
    public static SubLObject conjunctive_removal_module_spec_p(SubLObject module_spec) {
        return inference_module_spec_p(module_spec, $sym16$CONJUNCTIVE_REMOVAL_MODULE_NAME_P, $sym17$CONJUNCTIVE_REMOVAL_MODULE_SPEC_P);
    }

    @SubL(source = "cycl/inference/harness/inference-proof-spec.lisp", position = 6900L)
    public static SubLObject transformation_module_spec_p(SubLObject module_spec) {
        return inference_module_spec_p(module_spec, $sym18$TRANSFORMATION_MODULE_NAME_P, $sym19$TRANSFORMATION_MODULE_SPEC_P);
    }

    @SubL(source = "cycl/inference/harness/inference-proof-spec.lisp", position = 7100L)
    public static SubLObject literal_spec_p(SubLObject lit_spec) {
        return makeBoolean(NIL != cycl_grammar.cycl_atomic_sentence_p(lit_spec) || (lit_spec.isCons() && NIL != list_utilities.lengthE(lit_spec, TWO_INTEGER, UNPROVIDED) && $$not.eql(lit_spec.first()) && NIL != cycl_grammar.cycl_atomic_sentence_p(conses_high.second(lit_spec))));
    }

    @SubL(source = "cycl/inference/harness/inference-proof-spec.lisp", position = 7400L)
    public static SubLObject single_literal_proof_spec_p(SubLObject proof_spec) {
        return makeBoolean(NIL != rewrite_proof_spec_p(proof_spec) || NIL != removal_proof_spec_p(proof_spec) || NIL != transformation_proof_spec_p(proof_spec));
    }

    @SubL(source = "cycl/inference/harness/inference-proof-spec.lisp", position = 7600L)
    public static SubLObject removal_module_name_p(SubLObject name) {
        return inference_modules.removal_proof_module_p(inference_modules.find_hl_module_by_name(name));
    }

    @SubL(source = "cycl/inference/harness/inference-proof-spec.lisp", position = 7700L)
    public static SubLObject conjunctive_removal_module_name_p(SubLObject name) {
        return inference_modules.conjunctive_removal_module_p(inference_modules.find_hl_module_by_name(name));
    }

    @SubL(source = "cycl/inference/harness/inference-proof-spec.lisp", position = 7800L)
    public static SubLObject transformation_module_name_p(SubLObject name) {
        return inference_modules.transformation_module_p(inference_modules.find_hl_module_by_name(name));
    }

    @SubL(source = "cycl/inference/harness/inference-proof-spec.lisp", position = 8000L)
    public static SubLObject proof_spec_or_nothing_p(SubLObject proof_spec) {
        return makeBoolean($NOTHING == proof_spec || NIL != proof_spec_p(proof_spec));
    }

    @SubL(source = "cycl/inference/harness/inference-proof-spec.lisp", position = 8100L)
    public static SubLObject transformation_proof_rule_p(SubLObject v_object) {
        return makeBoolean($ANYTHING == v_object || NIL != assertions_high.rule_assertionP(v_object));
    }

    @SubL(source = "cycl/inference/harness/inference-proof-spec.lisp", position = 8200L)
    public static SubLObject transformational_proof_spec_p(SubLObject transformation_type, SubLObject proof_spec) {
        return makeBoolean(proof_spec.isCons() && transformation_type.eql(proof_spec.first()) && NIL != list_utilities.lengthE(proof_spec, FIVE_INTEGER, UNPROVIDED) && NIL != literal_spec_p(conses_high.second(proof_spec)) && NIL != transformation_module_spec_p(conses_high.third(proof_spec))
                && NIL != transformation_proof_rule_p(conses_high.fourth(proof_spec)) && NIL != proof_spec_or_nothing_p(conses_high.fifth(proof_spec)));
    }

    @SubL(source = "cycl/inference/harness/inference-proof-spec.lisp", position = 8700L)
    public static SubLObject branching_proof_spec_p(SubLObject operator, SubLObject proof_spec) {
        return makeBoolean(operator.eql(proof_spec.first()) && NIL != list_utilities.lengthG(proof_spec.rest(), ZERO_INTEGER, UNPROVIDED) && NIL != list_utilities.list_of_type_p($sym3$PROOF_SPEC_P, proof_spec.rest()));
    }

    @SubL(source = "cycl/inference/harness/inference-proof-spec.lisp", position = 8900L)
    public static SubLObject inference_module_spec_p(SubLObject module_spec, SubLObject module_name_fn, SubLObject module_type_checker_fn) {
        return makeBoolean($ANYTHING == module_spec || NIL != Functions.funcall(module_name_fn, module_spec)
                || (module_spec.isCons() && (NIL != negated_module_spec_p(module_spec, module_type_checker_fn) || NIL != conjunctive_module_spec_p(module_spec, module_type_checker_fn) || NIL != disjunctive_module_spec_p(module_spec, module_type_checker_fn))));
    }

    @SubL(source = "cycl/inference/harness/inference-proof-spec.lisp", position = 9400L)
    public static SubLObject negated_module_spec_p(SubLObject module_spec, SubLObject module_type_checker_fn) {
        return makeBoolean(module_spec.isCons() && $NOT == module_spec.first() && NIL != list_utilities.lengthE(module_spec, TWO_INTEGER, UNPROVIDED) && NIL != Functions.funcall(module_type_checker_fn, conses_high.second(module_spec)));
    }

    @SubL(source = "cycl/inference/harness/inference-proof-spec.lisp", position = 9600L)
    public static SubLObject conjunctive_module_spec_p(SubLObject module_spec, SubLObject module_type_checker_fn) {
        return makeBoolean(module_spec.isCons() && $AND == module_spec.first() && NIL != list_utilities.lengthG(module_spec, ONE_INTEGER, UNPROVIDED) && NIL != list_utilities.list_of_type_p(module_type_checker_fn, module_spec.rest()));
    }

    @SubL(source = "cycl/inference/harness/inference-proof-spec.lisp", position = 9900L)
    public static SubLObject disjunctive_module_spec_p(SubLObject module_spec, SubLObject module_type_checker_fn) {
        return makeBoolean(module_spec.isCons() && $OR == module_spec.first() && NIL != list_utilities.lengthG(module_spec, ONE_INTEGER, UNPROVIDED) && NIL != list_utilities.list_of_type_p(module_type_checker_fn, module_spec.rest()));
    }

    @SubL(source = "cycl/inference/harness/inference-proof-spec.lisp", position = 10100L)
    public static SubLObject single_literal_proof_spec_hl_sentence(SubLObject proof_spec) {
        assert NIL != single_literal_proof_spec_p(proof_spec) : proof_spec;
        return conses_high.second(proof_spec);
    }

    @SubL(source = "cycl/inference/harness/inference-proof-spec.lisp", position = 10300L)
    public static SubLObject restriction_proof_spec_restricted_proof_spec(SubLObject proof_spec) {
        assert NIL != restriction_proof_spec_p(proof_spec) : proof_spec;
        return conses_high.second(proof_spec);
    }

    @SubL(source = "cycl/inference/harness/inference-proof-spec.lisp", position = 10500L)
    public static SubLObject join_ordered_proof_spec_non_focal_proof_spec(SubLObject proof_spec) {
        assert NIL != join_ordered_proof_spec_p(proof_spec) : proof_spec;
        return conses_high.third(proof_spec);
    }

    @SubL(source = "cycl/inference/harness/inference-proof-spec.lisp", position = 10600L)
    public static SubLObject split_proof_spec_sub_proof_specs(SubLObject proof_spec) {
        assert NIL != split_proof_spec_p(proof_spec) : proof_spec;
        return proof_spec.rest();
    }

    @SubL(source = "cycl/inference/harness/inference-proof-spec.lisp", position = 10800L)
    public static SubLObject join_ordered_proof_spec_focal_proof_spec(SubLObject proof_spec) {
        assert NIL != join_ordered_proof_spec_p(proof_spec) : proof_spec;
        return conses_high.second(proof_spec);
    }

    @SubL(source = "cycl/inference/harness/inference-proof-spec.lisp", position = 10900L)
    public static SubLObject union_proof_spec_disjunct_proof_spec(SubLObject proof_spec) {
        assert NIL != union_proof_spec_p(proof_spec) : proof_spec;
        return conses_high.second(proof_spec);
    }

    @SubL(source = "cycl/inference/harness/inference-proof-spec.lisp", position = 11100L)
    public static SubLObject join_ordered_focal_proof_spec_pattern(SubLObject focal_proof_spec) {
        assert NIL != proof_spec_p(focal_proof_spec) : focal_proof_spec;
        SubLObject hl_sentence = NIL;
        SubLObject module_name = NIL;
        if (NIL != single_literal_proof_spec_p(focal_proof_spec)) {
            hl_sentence = single_literal_proof_spec_hl_sentence(focal_proof_spec);
        } else {
            SubLObject split = conses_high.second(conses_high.third(focal_proof_spec));
            SubLObject removals = split.rest();
            hl_sentence = simplifier.conjoin(Mapping.mapcar($sym28$SECOND, removals), UNPROVIDED);
        }
        return hl_sentence;
    }

    @SubL(source = "cycl/inference/harness/inference-proof-spec.lisp", position = 11700L)
    public static SubLObject transformation_proof_spec_rule(SubLObject proof_spec) {
        assert NIL != transformation_proof_spec_p(proof_spec) : proof_spec;
        return conses_high.fourth(proof_spec);
    }

    @SubL(source = "cycl/inference/harness/inference-proof-spec.lisp", position = 11800L)
    public static SubLObject transformation_proof_spec_supporting_proof_spec(SubLObject proof_spec) {
        assert NIL != transformation_proof_spec_p(proof_spec) : proof_spec;
        return conses_high.fifth(proof_spec);
    }

    @SubL(source = "cycl/inference/harness/inference-proof-spec.lisp", position = 12000L)
    public static SubLObject residual_transformation_proof_spec_rule(SubLObject proof_spec) {
        assert NIL != residual_transformation_proof_spec_p(proof_spec) : proof_spec;
        return conses_high.fourth(proof_spec);
    }

    @SubL(source = "cycl/inference/harness/inference-proof-spec.lisp", position = 12100L)
    public static SubLObject residual_transformation_proof_spec_supporting_proof_spec(SubLObject proof_spec) {
        assert NIL != residual_transformation_proof_spec_p(proof_spec) : proof_spec;
        return conses_high.fifth(proof_spec);
    }

    @SubL(source = "cycl/inference/harness/inference-proof-spec.lisp", position = 12300L)
    public static SubLObject proof_spec_literal_spec(SubLObject proof_spec) {
        if (NIL != removal_proof_spec_p(proof_spec)) {
            return single_literal_proof_spec_hl_sentence(proof_spec);
        }
        if (NIL != transformation_proof_spec_p(proof_spec)) {
            return single_literal_proof_spec_hl_sentence(proof_spec);
        }
        if (NIL != residual_transformation_proof_spec_p(proof_spec)) {
            return single_literal_proof_spec_hl_sentence(proof_spec);
        }
        return NIL;
    }

    @SubL(source = "cycl/inference/harness/inference-proof-spec.lisp", position = 12800L)
    public static SubLObject join_ordered_proof_spec_from_residual_transformation_proof_spec(SubLObject residual_transformation_proof_spec) {
        SubLObject rt_token = NIL;
        SubLObject literal_spec = NIL;
        SubLObject transformation_module_spec = NIL;
        SubLObject rule_spec = NIL;
        SubLObject sub_proof_spec = NIL;
        cdestructuring_bind.destructuring_bind_must_consp(residual_transformation_proof_spec, residual_transformation_proof_spec, $list31);
        rt_token = residual_transformation_proof_spec.first();
        SubLObject current = residual_transformation_proof_spec.rest();
        cdestructuring_bind.destructuring_bind_must_consp(current, residual_transformation_proof_spec, $list31);
        literal_spec = current.first();
        current = current.rest();
        cdestructuring_bind.destructuring_bind_must_consp(current, residual_transformation_proof_spec, $list31);
        transformation_module_spec = current.first();
        current = current.rest();
        cdestructuring_bind.destructuring_bind_must_consp(current, residual_transformation_proof_spec, $list31);
        rule_spec = current.first();
        current = current.rest();
        cdestructuring_bind.destructuring_bind_must_consp(current, residual_transformation_proof_spec, $list31);
        sub_proof_spec = current.first();
        current = current.rest();
        if (NIL == current) {
            SubLObject transformation_proof_spec = listS($TRANSFORMATION, literal_spec, transformation_module_spec, rule_spec, $list32);
            SubLObject join_ordered_proof_spec = listS($JOIN_ORDERED, transformation_proof_spec, $list32);
            return join_ordered_proof_spec;
        }
        cdestructuring_bind.cdestructuring_bind_error(residual_transformation_proof_spec, $list31);
        return NIL;
    }

    @SubL(source = "cycl/inference/harness/inference-proof-spec.lisp", position = 13500L)
    public static SubLObject filter_proof_specs_of_type(SubLObject proof_spec, SubLObject proof_spec_type_fn) {
        if (NIL != Functions.funcall(proof_spec_type_fn, proof_spec)) {
            return proof_spec;
        }
        if (NIL == or_pattern_p(proof_spec)) {
            return NIL;
        }
        SubLObject operator = NIL;
        cdestructuring_bind.destructuring_bind_must_consp(proof_spec, proof_spec, $list33);
        operator = proof_spec.first();
        SubLObject sub_proof_specs;
        SubLObject current = sub_proof_specs = proof_spec.rest();
        SubLObject filtered_proof_specs = NIL;
        SubLObject cdolist_list_var = sub_proof_specs;
        SubLObject sub_proof_spec = NIL;
        sub_proof_spec = cdolist_list_var.first();
        while (NIL != cdolist_list_var) {
            SubLObject filtered_sub_proof_spec = filter_proof_specs_of_type(sub_proof_spec, proof_spec_type_fn);
            if (NIL != or_pattern_p(filtered_sub_proof_spec)) {
                SubLObject current_$2;
                SubLObject datum_$1 = current_$2 = filtered_sub_proof_spec;
                SubLObject operator_$3 = NIL;
                cdestructuring_bind.destructuring_bind_must_consp(current_$2, datum_$1, $list34);
                operator_$3 = current_$2.first();
                current_$2 = current_$2.rest();
                SubLObject cdolist_list_var_$4;
                SubLObject sub_results = cdolist_list_var_$4 = current_$2;
                SubLObject sub_result = NIL;
                sub_result = cdolist_list_var_$4.first();
                while (NIL != cdolist_list_var_$4) {
                    filtered_proof_specs = cons(sub_result, filtered_proof_specs);
                    cdolist_list_var_$4 = cdolist_list_var_$4.rest();
                    sub_result = cdolist_list_var_$4.first();
                }
            } else if (NIL != filtered_sub_proof_spec) {
                filtered_proof_specs = cons(filtered_sub_proof_spec, filtered_proof_specs);
            }
            cdolist_list_var = cdolist_list_var.rest();
            sub_proof_spec = cdolist_list_var.first();
        }
        if (NIL != filtered_proof_specs) {
            return merge_proof_specs(filtered_proof_specs);
        }
        return NIL;
    }

    @SubL(source = "cycl/inference/harness/inference-proof-spec.lisp", position = 14800L)
    public static SubLObject compute_proof_spec(SubLObject proof) {
        assert NIL != inference_datastructures_proof.proof_p(proof) : proof;
        return compute_proof_spec_recursive(proof);
    }

    @SubL(source = "cycl/inference/harness/inference-proof-spec.lisp", position = 15000L)
    public static SubLObject compute_proof_spec_recursive(SubLObject proof) {
        if (NIL != inference_worker_removal.removal_proof_p(proof)) {
            return compute_removal_proof_spec(proof);
        }
        if (NIL != inference_worker_transformation.transformation_proof_p(proof)) {
            return compute_transformation_proof_spec(proof);
        }
        if (NIL != inference_worker_residual_transformation.residual_transformation_proof_p(proof)) {
            return compute_residual_transformation_proof_spec(proof);
        }
        if (NIL != conjunctive_removal_restriction_proof_p(proof)) {
            return compute_conjunctive_removal_restriction_proof_spec(proof);
        }
        if (NIL != inference_worker.structural_proof_p(proof)) {
            return compute_structural_proof_spec(proof);
        }
        if (NIL != inference_worker_rewrite.rewrite_proof_p(proof)) {
            return compute_rewrite_proof_spec(proof);
        }
        return Errors.error($str36$time_to_support__S_proofs, inference_datastructures_proof.proof_type(proof));
    }

    @SubL(source = "cycl/inference/harness/inference-proof-spec.lisp", position = 15700L)
    public static SubLObject compute_removal_proof_spec(SubLObject proof) {
        SubLThread thread = SubLProcess.currentSubLThread();
        thread.resetMultipleValues();
        SubLObject hl_sentence = extract_single_literal_proof_info_for_proof_spec(proof);
        SubLObject module_name = thread.secondMultipleValue();
        thread.resetMultipleValues();
        return list($REMOVAL, hl_sentence, module_name);
    }

    @SubL(source = "cycl/inference/harness/inference-proof-spec.lisp", position = 16000L)
    public static SubLObject compute_transformation_proof_spec(SubLObject proof) {
        SubLThread thread = SubLProcess.currentSubLThread();
        thread.resetMultipleValues();
        SubLObject hl_sentence = extract_single_literal_proof_info_for_proof_spec(proof);
        SubLObject module_name = thread.secondMultipleValue();
        thread.resetMultipleValues();
        SubLObject rule = inference_worker_transformation.transformation_proof_rule_assertion(proof);
        SubLObject subproof = inference_worker_transformation.transformation_proof_subproof(proof);
        SubLObject subspec = $NOTHING;
        if (NIL != subproof) {
            subspec = compute_proof_spec_recursive(subproof);
        }
        return list($TRANSFORMATION, hl_sentence, module_name, rule, subspec);
    }

    @SubL(source = "cycl/inference/harness/inference-proof-spec.lisp", position = 16600L)
    public static SubLObject compute_rewrite_proof_spec(SubLObject proof) {
        SubLThread thread = SubLProcess.currentSubLThread();
        thread.resetMultipleValues();
        SubLObject hl_sentence = extract_single_literal_proof_info_for_proof_spec(proof);
        SubLObject module_name = thread.secondMultipleValue();
        thread.resetMultipleValues();
        SubLObject subproof = inference_datastructures_proof.proof_sole_subproof(proof);
        SubLObject subspec = compute_proof_spec_recursive(subproof);
        return list($REWRITE, hl_sentence, module_name, subspec);
    }

    @SubL(source = "cycl/inference/harness/inference-proof-spec.lisp", position = 17200L)
    public static SubLObject compute_residual_transformation_proof_spec(SubLObject proof) {
        SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject module = inference_worker.content_proof_hl_module(proof);
        SubLObject module_name = inference_modules.hl_module_name(module);
        SubLObject proof_bindings = inference_datastructures_proof.proof_bindings(proof);
        SubLObject rt_link = inference_datastructures_proof.proof_link(proof);
        SubLObject jo_link = inference_worker_residual_transformation.residual_transformation_link_motivating_join_ordered_link(rt_link);
        SubLObject focal_mapped_problem = inference_worker_join_ordered.join_ordered_link_focal_mapped_problem(jo_link);
        SubLObject focal_query = inference_datastructures_problem.problem_query(inference_datastructures_problem_link.mapped_problem_problem(focal_mapped_problem));
        SubLObject focal_to_supported_variable_map = inference_datastructures_problem_link.mapped_problem_variable_map(focal_mapped_problem);
        SubLObject lifted_focal_query = bindings.apply_bindings(focal_to_supported_variable_map, focal_query);
        SubLObject lifted_proven_focal_query = bindings.apply_bindings(proof_bindings, lifted_focal_query);
        thread.resetMultipleValues();
        SubLObject mt = inference_datastructures_problem_query.mt_asent_sense_from_singleton_query(lifted_proven_focal_query);
        SubLObject asent = thread.secondMultipleValue();
        SubLObject sense = thread.thirdMultipleValue();
        thread.resetMultipleValues();
        SubLObject literal = clause_utilities.asent_sense_to_literal(asent, sense);
        SubLObject hl_sentence = el_utilities.make_ist_sentence(mt, literal);
        SubLObject rule = inference_worker_residual_transformation.residual_transformation_proof_rule_assertion(proof);
        SubLObject subproof = inference_worker_residual_transformation.residual_transformation_proof_subproof(proof);
        SubLObject subspec = compute_proof_spec_recursive(subproof);
        return list($RESIDUAL_TRANSFORMATION, hl_sentence, module_name, rule, subspec);
    }

    @SubL(source = "cycl/inference/harness/inference-proof-spec.lisp", position = 18700L)
    public static SubLObject conjunctive_removal_restriction_proof_p(SubLObject v_object) {
        if (NIL != inference_worker_restriction.restriction_proof_p(v_object)) {
            SubLObject module = inference_worker_restriction.restriction_proof_hl_module(v_object);
            if (NIL != module) {
                return inference_modules.conjunctive_removal_module_p(module);
            }
        }
        return NIL;
    }

    @SubL(source = "cycl/inference/harness/inference-proof-spec.lisp", position = 18900L)
    public static SubLObject compute_conjunctive_removal_restriction_proof_spec(SubLObject proof) {
        SubLObject module = inference_worker_restriction.restriction_proof_hl_module(proof);
        SubLObject module_name = inference_modules.hl_module_name(module);
        SubLObject subspec = compute_structural_proof_spec(proof);
        return list($CONJUNCTIVE_REMOVAL, module_name, subspec);
    }

    @SubL(source = "cycl/inference/harness/inference-proof-spec.lisp", position = 19300L)
    public static SubLObject extract_single_literal_proof_info_for_proof_spec(SubLObject proof) {
        SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject module = inference_worker.content_proof_hl_module(proof);
        SubLObject module_name = inference_modules.hl_module_name(module);
        SubLObject proven_query = inference_worker.proof_proven_query(proof);
        thread.resetMultipleValues();
        SubLObject mt = inference_datastructures_problem_query.mt_asent_sense_from_singleton_query(proven_query);
        SubLObject asent = thread.secondMultipleValue();
        SubLObject sense = thread.thirdMultipleValue();
        thread.resetMultipleValues();
        SubLObject literal = clause_utilities.asent_sense_to_literal(asent, sense);
        SubLObject hl_sentence = el_utilities.make_ist_sentence(mt, literal);
        return Values.values(hl_sentence, module_name);
    }

    @SubL(source = "cycl/inference/harness/inference-proof-spec.lisp", position = 19800L)
    public static SubLObject compute_structural_proof_spec(SubLObject proof) {
        assert NIL != inference_worker.structural_proof_p(proof) : proof;
        SubLObject type = inference_datastructures_proof.proof_type(proof);
        SubLObject subspecs = NIL;
        SubLObject cdolist_list_var = inference_datastructures_proof.proof_direct_subproofs(proof);
        SubLObject subproof = NIL;
        subproof = cdolist_list_var.first();
        while (NIL != cdolist_list_var) {
            SubLObject subspec = compute_proof_spec_recursive(subproof);
            subspecs = cons(subspec, subspecs);
            cdolist_list_var = cdolist_list_var.rest();
            subproof = cdolist_list_var.first();
        }
        return reader.bq_cons(type, append(Sequences.nreverse(subspecs), NIL));
    }

    @SubL(source = "cycl/inference/harness/inference-proof-spec.lisp", position = 20100L)
    public static SubLObject inference_proof_spec(SubLObject inference) {
        return merge_proof_specs(inference_all_answer_proof_specs(inference));
    }

    @SubL(source = "cycl/inference/harness/inference-proof-spec.lisp", position = 20300L)
    public static SubLObject inference_first_answer_proof_spec(SubLObject inference) {
        assert NIL != inference_datastructures_inference.inference_p(inference) : inference;
        return compute_proof_spec(inference_datastructures_inference.inference_first_proof(inference));
    }

    @SubL(source = "cycl/inference/harness/inference-proof-spec.lisp", position = 20500L)
    public static SubLObject inference_all_answer_proof_specs(SubLObject inference) {
        assert NIL != inference_datastructures_inference.inference_p(inference) : inference;
        SubLObject answer_proofs = inference_datastructures_inference.inference_all_answer_proofs(inference);
        SubLObject proof_specs = NIL;
        SubLObject cdolist_list_var = answer_proofs;
        SubLObject answer_proof = NIL;
        answer_proof = cdolist_list_var.first();
        while (NIL != cdolist_list_var) {
            proof_specs = cons(compute_proof_spec(answer_proof), proof_specs);
            cdolist_list_var = cdolist_list_var.rest();
            answer_proof = cdolist_list_var.first();
        }
        return Sequences.nreverse(proof_specs);
    }

    @SubL(source = "cycl/inference/harness/inference-proof-spec.lisp", position = 20800L)
    public static SubLObject failed_inference_proof_spec(SubLObject inference) {
        SubLObject visited = set.new_set(UNPROVIDED, UNPROVIDED);
        SubLObject root_problem = inference_datastructures_inference.inference_root_problem(inference);
        if (NIL != root_problem_has_top_level_disjunctP(root_problem)) {
            return failed_inference_union_problem_proof_spec(root_problem, visited);
        }
        return failed_inference_problem_proof_spec(root_problem, visited);
    }

    @SubL(source = "cycl/inference/harness/inference-proof-spec.lisp", position = 21400L)
    public static SubLObject root_problem_has_top_level_disjunctP(SubLObject root_problem) {
        return inference_worker_union.union_tactic_p(inference_datastructures_problem.problem_executed_tactics(root_problem).first());
    }

    @SubL(source = "cycl/inference/harness/inference-proof-spec.lisp", position = 21600L)
    public static SubLObject with_failed_proof_spec_for_object(SubLObject macroform, SubLObject environment) {
        SubLObject current;
        SubLObject datum = current = macroform.rest();
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, $list39);
        SubLObject temp = current.rest();
        current = current.first();
        SubLObject proof_spec = NIL;
        SubLObject v_object = NIL;
        SubLObject visited = NIL;
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, $list39);
        proof_spec = current.first();
        current = current.rest();
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, $list39);
        v_object = current.first();
        current = current.rest();
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, $list39);
        visited = current.first();
        current = current.rest();
        SubLObject combinator = current.isCons() ? current.first() : $OR;
        cdestructuring_bind.destructuring_bind_must_listp(current, datum, $list39);
        current = current.rest();
        if (NIL == current) {
            SubLObject body;
            current = (body = temp);
            return list($sym40$CLET, list(list(proof_spec)), list($sym41$SET_ADD, v_object, visited), reader.bq_cons($sym42$PROGN, append(body, NIL)), list($sym43$CSETQ, proof_spec, list($sym44$DELETE, $IGNORE, proof_spec)),
                    list($sym46$PCOND, list(list($sym47$NULL, proof_spec), listS($sym43$CSETQ, proof_spec, $list48)), list(list($sym49$SINGLETON_, proof_spec), list($sym43$CSETQ, proof_spec, list($sym50$FIRST, proof_spec))),
                            list(T, list($sym43$CSETQ, proof_spec, list($sym51$NREVERSE, proof_spec)), list($sym52$CPUSH, combinator, proof_spec))),
                    list($sym53$RET, proof_spec));
        }
        cdestructuring_bind.cdestructuring_bind_error(datum, $list39);
        return NIL;
    }

    @SubL(source = "cycl/inference/harness/inference-proof-spec.lisp", position = 22200L)
    public static SubLObject failed_inference_union_problem_proof_spec(SubLObject root_problem, SubLObject visited) {
        SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject proof_spec = NIL;
        set.set_add(root_problem, visited);
        SubLObject cdolist_list_var = inference_datastructures_problem.problem_executed_tactics(root_problem);
        SubLObject tactic = NIL;
        tactic = cdolist_list_var.first();
        while (NIL != cdolist_list_var) {
            if (NIL == Errors.$ignore_mustsP$.getDynamicValue(thread) && NIL == inference_worker_union.union_tactic_p(tactic)) {
                Errors.error($str54$Non_union_tactic__A_mixed_in_with, tactic);
            }
            SubLObject disjunct_mapped_problem = inference_worker_union.find_union_tactic_disjunct_mapped_problem(tactic, NIL);
            SubLObject problem = inference_datastructures_problem_link.mapped_problem_problem(disjunct_mapped_problem);
            proof_spec = cons(failed_inference_problem_proof_spec(problem, visited), proof_spec);
            cdolist_list_var = cdolist_list_var.rest();
            tactic = cdolist_list_var.first();
        }
        proof_spec = Sequences.delete($IGNORE, proof_spec, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
        if (NIL == proof_spec) {
            proof_spec = $ANYTHING;
        } else if (NIL != list_utilities.singletonP(proof_spec)) {
            proof_spec = proof_spec.first();
        } else {
            proof_spec = Sequences.nreverse(proof_spec);
            proof_spec = cons($UNION, proof_spec);
        }
        return proof_spec;
    }

    @SubL(source = "cycl/inference/harness/inference-proof-spec.lisp", position = 22900L)
    public static SubLObject failed_inference_problem_proof_spec(SubLObject problem, SubLObject visited) {
        SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject proof_spec = NIL;
        set.set_add(problem, visited);
        if (inference_datastructures_problem.problem_proof_count(problem, UNPROVIDED).isPositive()) {
            SubLObject sub_proof_specs = NIL;
            SubLObject iteration_state;
            for (iteration_state = dictionary_contents.do_dictionary_contents_state(inference_datastructures_problem.problem_proof_bindings_index(problem)); NIL == dictionary_contents.do_dictionary_contents_doneP(iteration_state); iteration_state = dictionary_contents.do_dictionary_contents_next(
                    iteration_state)) {
                thread.resetMultipleValues();
                SubLObject v_bindings = dictionary_contents.do_dictionary_contents_key_value(iteration_state);
                SubLObject proof_list = thread.secondMultipleValue();
                thread.resetMultipleValues();
                SubLObject cdolist_list_var = proof_list;
                SubLObject proof = NIL;
                proof = cdolist_list_var.first();
                while (NIL != cdolist_list_var) {
                    sub_proof_specs = cons(compute_proof_spec(proof), sub_proof_specs);
                    cdolist_list_var = cdolist_list_var.rest();
                    proof = cdolist_list_var.first();
                }
            }
            dictionary_contents.do_dictionary_contents_finalize(iteration_state);
            proof_spec = cons(merge_proof_specs(sub_proof_specs), proof_spec);
        } else {
            SubLObject set_contents_var = inference_datastructures_problem.problem_argument_links(problem);
            SubLObject basis_object;
            SubLObject state;
            SubLObject link;
            for (basis_object = set_contents.do_set_contents_basis_object(set_contents_var), state = NIL, state = set_contents.do_set_contents_initial_state(basis_object, set_contents_var); NIL == set_contents.do_set_contents_doneP(basis_object,
                    state); state = set_contents.do_set_contents_update_state(state)) {
                link = set_contents.do_set_contents_next(basis_object, state);
                if (NIL != set_contents.do_set_contents_element_validP(state, link) && NIL == set.set_memberP(link, visited) && NIL != problem_link_tactic_executedP(link)) {
                    proof_spec = cons(failed_inference_link_proof_spec(link, visited), proof_spec);
                }
            }
        }
        proof_spec = Sequences.delete($IGNORE, proof_spec, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
        if (NIL == proof_spec) {
            proof_spec = $ANYTHING;
        } else if (NIL != list_utilities.singletonP(proof_spec)) {
            proof_spec = proof_spec.first();
        } else {
            proof_spec = Sequences.nreverse(proof_spec);
            proof_spec = cons($OR, proof_spec);
        }
        return proof_spec;
    }

    @SubL(source = "cycl/inference/harness/inference-proof-spec.lisp", position = 23600L)
    public static SubLObject failed_inference_link_proof_spec(SubLObject link, SubLObject visited) {
        SubLObject proof_spec = NIL;
        set.set_add(link, visited);
        SubLObject pcase_var;
        SubLObject type = pcase_var = inference_datastructures_problem_link.problem_link_type(link);
        if (pcase_var.eql($REMOVAL)) {
            return failed_inference_removal_link_proof_spec(link, visited);
        }
        if (pcase_var.eql($REWRITE)) {
            return failed_inference_rewrite_link_proof_spec(link, visited);
        }
        if (pcase_var.eql($TRANSFORMATION)) {
            return failed_inference_transformation_link_proof_spec(link, visited);
        }
        if (pcase_var.eql($ANSWER)) {
            return failed_inference_answer_link_proof_spec(link, visited);
        }
        if (pcase_var.eql($RESTRICTION)) {
            return failed_inference_restriction_link_proof_spec(link, visited);
        }
        if (pcase_var.eql($SPLIT)) {
            return failed_inference_split_link_proof_spec(link, visited);
        }
        if (pcase_var.eql($JOIN_ORDERED)) {
            return failed_inference_join_ordered_link_proof_spec(link, visited);
        }
        if (pcase_var.eql($JOIN)) {
            return failed_inference_join_link_proof_spec(link, visited);
        }
        if (pcase_var.eql($UNION)) {
            return failed_inference_union_link_proof_spec(link, visited);
        }
        if (pcase_var.eql($RESIDUAL_TRANSFORMATION)) {
            return failed_inference_residual_transformation_link_proof_spec(link, visited);
        }
        Errors.error($str56$Dont_know_how_to_handle_problem_l, type);
        proof_spec = Sequences.delete($IGNORE, proof_spec, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
        if (NIL == proof_spec) {
            proof_spec = $ANYTHING;
        } else if (NIL != list_utilities.singletonP(proof_spec)) {
            proof_spec = proof_spec.first();
        } else {
            proof_spec = Sequences.nreverse(proof_spec);
            proof_spec = cons($OR, proof_spec);
        }
        return proof_spec;
    }

    @SubL(source = "cycl/inference/harness/inference-proof-spec.lisp", position = 24900L)
    public static SubLObject problem_link_tactic_executedP(SubLObject link) {
        SubLObject pcase_var;
        SubLObject type = pcase_var = inference_datastructures_problem_link.problem_link_type(link);
        if (pcase_var.eql($REMOVAL)) {
            return possibly_tactic_executedP(inference_worker_removal.removal_link_tactic(link));
        }
        if (pcase_var.eql($REWRITE)) {
            return possibly_tactic_executedP(inference_worker_rewrite.rewrite_link_tactic(link));
        }
        if (pcase_var.eql($TRANSFORMATION)) {
            return possibly_tactic_executedP(inference_worker_transformation.transformation_link_tactic(link));
        }
        if (pcase_var.eql($ANSWER)) {
            Errors.error($str57$What_is_an_answer_link_doing_here);
        } else {
            if (pcase_var.eql($RESTRICTION)) {
                return possibly_tactic_executedP(inference_worker_restriction.restriction_link_tactic(link));
            }
            if (pcase_var.eql($SPLIT)) {
                return Sequences.find_if($sym58$TACTIC_EXECUTED_, inference_worker_split.split_link_tactics(link), UNPROVIDED, UNPROVIDED, UNPROVIDED);
            }
            if (pcase_var.eql($JOIN_ORDERED)) {
                return possibly_tactic_executedP(inference_worker_join_ordered.join_ordered_link_tactic(link));
            }
            if (pcase_var.eql($JOIN)) {
                return possibly_tactic_executedP(inference_worker_join.join_link_tactic(link));
            }
            if (pcase_var.eql($UNION)) {
                return possibly_tactic_executedP(inference_worker_union.union_link_tactic(link));
            }
            if (pcase_var.eql($RESIDUAL_TRANSFORMATION)) {
                return problem_link_tactic_executedP(inference_worker_residual_transformation.residual_transformation_link_motivating_transformation_link(link));
            }
            Errors.error($str56$Dont_know_how_to_handle_problem_l, type);
        }
        return NIL;
    }

    @SubL(source = "cycl/inference/harness/inference-proof-spec.lisp", position = 26100L)
    public static SubLObject possibly_tactic_executedP(SubLObject v_object) {
        if (NIL != inference_datastructures_tactic.tactic_p(v_object)) {
            return inference_datastructures_tactic.tactic_executedP(v_object);
        }
        return NIL;
    }

    @SubL(source = "cycl/inference/harness/inference-proof-spec.lisp", position = 26200L)
    public static SubLObject failed_inference_removal_link_proof_spec(SubLObject link, SubLObject visited) {
        SubLObject proof_spec = NIL;
        set.set_add(link, visited);
        SubLObject tactic = inference_worker_removal.removal_link_tactic(link);
        proof_spec = cons(failed_inference_removal_tactic_proof_spec(tactic, visited), proof_spec);
        proof_spec = Sequences.delete($IGNORE, proof_spec, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
        if (NIL == proof_spec) {
            proof_spec = $ANYTHING;
        } else if (NIL != list_utilities.singletonP(proof_spec)) {
            proof_spec = proof_spec.first();
        } else {
            proof_spec = Sequences.nreverse(proof_spec);
            proof_spec = cons($OR, proof_spec);
        }
        return proof_spec;
    }

    @SubL(source = "cycl/inference/harness/inference-proof-spec.lisp", position = 26500L)
    public static SubLObject failed_inference_rewrite_link_proof_spec(SubLObject link, SubLObject visited) {
        SubLObject proof_spec = NIL;
        set.set_add(link, visited);
        SubLObject tactic = inference_worker_rewrite.rewrite_link_tactic(link);
        proof_spec = cons(failed_inference_rewrite_tactic_proof_spec(tactic, visited), proof_spec);
        proof_spec = Sequences.delete($IGNORE, proof_spec, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
        if (NIL == proof_spec) {
            proof_spec = $ANYTHING;
        } else if (NIL != list_utilities.singletonP(proof_spec)) {
            proof_spec = proof_spec.first();
        } else {
            proof_spec = Sequences.nreverse(proof_spec);
            proof_spec = cons($OR, proof_spec);
        }
        return proof_spec;
    }

    @SubL(source = "cycl/inference/harness/inference-proof-spec.lisp", position = 26800L)
    public static SubLObject failed_inference_transformation_link_proof_spec(SubLObject link, SubLObject visited) {
        SubLObject proof_spec = NIL;
        set.set_add(link, visited);
        SubLObject tactic = inference_worker_transformation.transformation_link_tactic(link);
        proof_spec = cons(failed_inference_transformation_tactic_proof_spec(tactic, visited), proof_spec);
        proof_spec = Sequences.delete($IGNORE, proof_spec, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
        if (NIL == proof_spec) {
            proof_spec = $ANYTHING;
        } else if (NIL != list_utilities.singletonP(proof_spec)) {
            proof_spec = proof_spec.first();
        } else {
            proof_spec = Sequences.nreverse(proof_spec);
            proof_spec = cons($OR, proof_spec);
        }
        return proof_spec;
    }

    @SubL(source = "cycl/inference/harness/inference-proof-spec.lisp", position = 27100L)
    public static SubLObject failed_inference_answer_link_proof_spec(SubLObject link, SubLObject visited) {
        SubLObject proof_spec = NIL;
        set.set_add(link, visited);
        Errors.error($str59$This_should_never_be_called_);
        proof_spec = Sequences.delete($IGNORE, proof_spec, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
        if (NIL == proof_spec) {
            proof_spec = $ANYTHING;
        } else if (NIL != list_utilities.singletonP(proof_spec)) {
            proof_spec = proof_spec.first();
        } else {
            proof_spec = Sequences.nreverse(proof_spec);
            proof_spec = cons($OR, proof_spec);
        }
        return proof_spec;
    }

    @SubL(source = "cycl/inference/harness/inference-proof-spec.lisp", position = 27300L)
    public static SubLObject failed_inference_restriction_link_proof_spec(SubLObject link, SubLObject visited) {
        SubLObject proof_spec = NIL;
        set.set_add(link, visited);
        SubLObject tactic = inference_worker_restriction.restriction_link_tactic(link);
        proof_spec = cons(failed_inference_restriction_tactic_proof_spec(tactic, visited), proof_spec);
        proof_spec = Sequences.delete($IGNORE, proof_spec, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
        if (NIL == proof_spec) {
            proof_spec = $ANYTHING;
        } else if (NIL != list_utilities.singletonP(proof_spec)) {
            proof_spec = proof_spec.first();
        } else {
            proof_spec = Sequences.nreverse(proof_spec);
            proof_spec = cons($OR, proof_spec);
        }
        return proof_spec;
    }

    @SubL(source = "cycl/inference/harness/inference-proof-spec.lisp", position = 27600L)
    public static SubLObject failed_inference_split_link_proof_spec(SubLObject link, SubLObject visited) {
        SubLObject proof_spec = NIL;
        set.set_add(link, visited);
        SubLObject cdolist_list_var;
        SubLObject tactics = cdolist_list_var = inference_worker_split.split_link_tactics(link);
        SubLObject tactic = NIL;
        tactic = cdolist_list_var.first();
        while (NIL != cdolist_list_var) {
            if (NIL != inference_datastructures_tactic.tactic_executedP(tactic)) {
                proof_spec = cons(failed_inference_split_tactic_proof_spec(tactic, visited), proof_spec);
            }
            cdolist_list_var = cdolist_list_var.rest();
            tactic = cdolist_list_var.first();
        }
        proof_spec = Sequences.delete($IGNORE, proof_spec, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
        if (NIL == proof_spec) {
            proof_spec = $ANYTHING;
        } else if (NIL != list_utilities.singletonP(proof_spec)) {
            proof_spec = proof_spec.first();
        } else {
            proof_spec = Sequences.nreverse(proof_spec);
            proof_spec = cons($OR, proof_spec);
        }
        return proof_spec;
    }

    @SubL(source = "cycl/inference/harness/inference-proof-spec.lisp", position = 28000L)
    public static SubLObject failed_inference_join_link_proof_spec(SubLObject link, SubLObject visited) {
        SubLObject proof_spec = NIL;
        set.set_add(link, visited);
        SubLObject tactic = inference_worker_join.join_link_tactic(link);
        proof_spec = cons(failed_inference_join_tactic_proof_spec(tactic, visited), proof_spec);
        proof_spec = Sequences.delete($IGNORE, proof_spec, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
        if (NIL == proof_spec) {
            proof_spec = $ANYTHING;
        } else if (NIL != list_utilities.singletonP(proof_spec)) {
            proof_spec = proof_spec.first();
        } else {
            proof_spec = Sequences.nreverse(proof_spec);
            proof_spec = cons($OR, proof_spec);
        }
        return proof_spec;
    }

    @SubL(source = "cycl/inference/harness/inference-proof-spec.lisp", position = 28200L)
    public static SubLObject failed_inference_join_ordered_link_proof_spec(SubLObject link, SubLObject visited) {
        SubLObject proof_spec = NIL;
        set.set_add(link, visited);
        SubLObject tactic = inference_worker_join_ordered.join_ordered_link_tactic(link);
        proof_spec = cons(failed_inference_join_ordered_tactic_proof_spec(tactic, visited), proof_spec);
        proof_spec = Sequences.delete($IGNORE, proof_spec, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
        if (NIL == proof_spec) {
            proof_spec = $ANYTHING;
        } else if (NIL != list_utilities.singletonP(proof_spec)) {
            proof_spec = proof_spec.first();
        } else {
            proof_spec = Sequences.nreverse(proof_spec);
            proof_spec = cons($OR, proof_spec);
        }
        return proof_spec;
    }

    @SubL(source = "cycl/inference/harness/inference-proof-spec.lisp", position = 28500L)
    public static SubLObject failed_inference_union_link_proof_spec(SubLObject link, SubLObject visited) {
        SubLObject proof_spec = NIL;
        set.set_add(link, visited);
        Errors.error($str60$This_should_only_occur_at_the_top);
        proof_spec = Sequences.delete($IGNORE, proof_spec, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
        if (NIL == proof_spec) {
            proof_spec = $ANYTHING;
        } else if (NIL != list_utilities.singletonP(proof_spec)) {
            proof_spec = proof_spec.first();
        } else {
            proof_spec = Sequences.nreverse(proof_spec);
            proof_spec = cons($OR, proof_spec);
        }
        return proof_spec;
    }

    @SubL(source = "cycl/inference/harness/inference-proof-spec.lisp", position = 28800L)
    public static SubLObject failed_inference_residual_transformation_link_proof_spec(SubLObject link, SubLObject visited) {
        SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject proof_spec = NIL;
        set.set_add(link, visited);
        SubLObject jo_link = inference_worker_residual_transformation.residual_transformation_link_motivating_join_ordered_link(link);
        SubLObject focal_mapped_problem = inference_worker_join_ordered.join_ordered_link_focal_mapped_problem(jo_link);
        SubLObject focal_query = inference_datastructures_problem.problem_query(inference_datastructures_problem_link.mapped_problem_problem(focal_mapped_problem));
        SubLObject focal_to_supported_variable_map = inference_datastructures_problem_link.mapped_problem_variable_map(focal_mapped_problem);
        SubLObject lifted_focal_query = bindings.apply_bindings(focal_to_supported_variable_map, focal_query);
        SubLObject tr_module = $ANYTHING;
        SubLObject tr_rule = $ANYTHING;
        SubLObject tr_link = inference_worker_residual_transformation.residual_transformation_link_motivating_transformation_link(link);
        SubLObject tactic = inference_worker_transformation.transformation_link_tactic(tr_link);
        SubLObject hl_module = inference_datastructures_tactic.tactic_hl_module(tactic);
        SubLObject module_name = inference_modules.hl_module_name(hl_module);
        SubLObject rule = inference_worker_transformation.transformation_tactic_lookahead_rule(tactic);
        if (NIL != module_name) {
            tr_module = module_name;
        }
        if (NIL != rule) {
            tr_rule = rule;
        }
        thread.resetMultipleValues();
        SubLObject mt = inference_datastructures_problem_query.mt_asent_sense_from_singleton_query(lifted_focal_query);
        SubLObject asent = thread.secondMultipleValue();
        SubLObject sense = thread.thirdMultipleValue();
        thread.resetMultipleValues();
        SubLObject literal = clause_utilities.asent_sense_to_literal(asent, sense);
        SubLObject hl_sentence = el_utilities.make_ist_sentence(mt, literal);
        SubLObject rt_proof_spec = list($RESIDUAL_TRANSFORMATION, hl_sentence, tr_module, tr_rule, $NOTHING);
        proof_spec = cons(rt_proof_spec, proof_spec);
        proof_spec = Sequences.delete($IGNORE, proof_spec, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
        if (NIL == proof_spec) {
            proof_spec = $ANYTHING;
        } else if (NIL != list_utilities.singletonP(proof_spec)) {
            proof_spec = proof_spec.first();
        } else {
            proof_spec = Sequences.nreverse(proof_spec);
            proof_spec = cons($OR, proof_spec);
        }
        return proof_spec;
    }

    @SubL(source = "cycl/inference/harness/inference-proof-spec.lisp", position = 30600L)
    public static SubLObject failed_inference_tactic_proof_spec(SubLObject tactic, SubLObject visited) {
        if (NIL != inference_worker_removal.removal_tactic_p(tactic)) {
            return failed_inference_removal_tactic_proof_spec(tactic, visited);
        }
        if (NIL != inference_worker_split.split_tactic_p(tactic)) {
            return failed_inference_split_tactic_proof_spec(tactic, visited);
        }
        if (NIL != inference_worker_join_ordered.join_ordered_tactic_p(tactic)) {
            return failed_inference_join_ordered_tactic_proof_spec(tactic, visited);
        }
        if (NIL != inference_worker_join.join_tactic_p(tactic)) {
            return failed_inference_join_tactic_proof_spec(tactic, visited);
        }
        if (NIL != inference_worker_union.union_tactic_p(tactic)) {
            Errors.error($str61$Union_tactics_can_only_occur_at_t);
        } else {
            if (NIL != inference_worker_transformation.transformation_tactic_p(tactic)) {
                return failed_inference_transformation_tactic_proof_spec(tactic, visited);
            }
            if (NIL != inference_worker_rewrite.rewrite_tactic_p(tactic)) {
                return failed_inference_rewrite_tactic_proof_spec(tactic, visited);
            }
            Errors.error($str62$Dont_know_how_to_compute_the_proo, tactic);
        }
        return $ANYTHING;
    }

    @SubL(source = "cycl/inference/harness/inference-proof-spec.lisp", position = 31700L)
    public static SubLObject failed_inference_removal_tactic_proof_spec(SubLObject tactic, SubLObject visited) {
        SubLObject proof_spec = NIL;
        set.set_add(tactic, visited);
        SubLObject hl_module = inference_datastructures_tactic.tactic_hl_module(tactic);
        SubLObject module_name = inference_modules.hl_module_name(hl_module);
        SubLObject problem_query = inference_datastructures_problem.problem_query(inference_datastructures_tactic.tactic_problem(tactic));
        SubLObject literal = hl_asent_from_problem_query(problem_query);
        proof_spec = cons(list($REMOVAL, literal, module_name), proof_spec);
        proof_spec = Sequences.delete($IGNORE, proof_spec, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
        if (NIL == proof_spec) {
            proof_spec = $ANYTHING;
        } else if (NIL != list_utilities.singletonP(proof_spec)) {
            proof_spec = proof_spec.first();
        } else {
            proof_spec = Sequences.nreverse(proof_spec);
            proof_spec = cons($OR, proof_spec);
        }
        return proof_spec;
    }

    @SubL(source = "cycl/inference/harness/inference-proof-spec.lisp", position = 32100L)
    public static SubLObject failed_inference_split_tactic_proof_spec(SubLObject tactic, SubLObject visited) {
        SubLObject proof_spec = NIL;
        set.set_add(tactic, visited);
        proof_spec = Sequences.delete($IGNORE, proof_spec, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
        if (NIL == proof_spec) {
            proof_spec = $ANYTHING;
        } else if (NIL != list_utilities.singletonP(proof_spec)) {
            proof_spec = proof_spec.first();
        } else {
            proof_spec = Sequences.nreverse(proof_spec);
            proof_spec = cons($SPLIT, proof_spec);
        }
        return proof_spec;
    }

    @SubL(source = "cycl/inference/harness/inference-proof-spec.lisp", position = 32300L)
    public static SubLObject failed_inference_join_ordered_tactic_proof_spec(SubLObject tactic, SubLObject visited) {
        SubLObject proof_spec = NIL;
        set.set_add(tactic, visited);
        SubLObject focal_mapped = inference_worker_join_ordered.find_or_create_join_ordered_tactic_focal_mapped_problem(tactic);
        SubLObject non_focal_mapped = inference_worker_join_ordered.find_or_create_join_ordered_tactic_non_focal_mapped_problem(tactic);
        SubLObject focal = inference_datastructures_problem_link.mapped_problem_problem(focal_mapped);
        SubLObject non_focal = inference_datastructures_problem_link.mapped_problem_problem(non_focal_mapped);
        proof_spec = cons(failed_inference_problem_proof_spec(focal, visited), proof_spec);
        proof_spec = cons(failed_inference_problem_proof_spec(non_focal, visited), proof_spec);
        proof_spec = Sequences.delete($IGNORE, proof_spec, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
        if (NIL == proof_spec) {
            proof_spec = $ANYTHING;
        } else if (NIL != list_utilities.singletonP(proof_spec)) {
            proof_spec = proof_spec.first();
        } else {
            proof_spec = Sequences.nreverse(proof_spec);
            proof_spec = cons($JOIN_ORDERED, proof_spec);
        }
        return proof_spec;
    }

    @SubL(source = "cycl/inference/harness/inference-proof-spec.lisp", position = 33000L)
    public static SubLObject failed_inference_join_tactic_proof_spec(SubLObject tactic, SubLObject visited) {
        SubLObject proof_spec = NIL;
        set.set_add(tactic, visited);
        SubLObject cdolist_list_var = Values.arg2(Values.resetMultipleValues(), Values.multiple_value_list(inference_worker_join.find_or_create_join_tactic_supporting_mapped_problems(tactic)));
        SubLObject mapped_problem = NIL;
        mapped_problem = cdolist_list_var.first();
        while (NIL != cdolist_list_var) {
            SubLObject problem = inference_datastructures_problem_link.mapped_problem_problem(mapped_problem);
            proof_spec = cons(failed_inference_problem_proof_spec(problem, visited), proof_spec);
            cdolist_list_var = cdolist_list_var.rest();
            mapped_problem = cdolist_list_var.first();
        }
        proof_spec = Sequences.delete($IGNORE, proof_spec, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
        if (NIL == proof_spec) {
            proof_spec = $ANYTHING;
        } else if (NIL != list_utilities.singletonP(proof_spec)) {
            proof_spec = proof_spec.first();
        } else {
            proof_spec = Sequences.nreverse(proof_spec);
            proof_spec = cons($JOIN, proof_spec);
        }
        return proof_spec;
    }

    @SubL(source = "cycl/inference/harness/inference-proof-spec.lisp", position = 33400L)
    public static SubLObject failed_inference_transformation_tactic_proof_spec(SubLObject tactic, SubLObject visited) {
        SubLObject proof_spec = NIL;
        set.set_add(tactic, visited);
        SubLObject hl_module = inference_datastructures_tactic.tactic_hl_module(tactic);
        SubLObject module_name = inference_modules.hl_module_name(hl_module);
        SubLObject problem_query = inference_datastructures_problem.problem_query(inference_datastructures_tactic.tactic_problem(tactic));
        SubLObject literal = hl_asent_from_problem_query(problem_query);
        SubLObject rule = inference_worker_transformation.transformation_tactic_lookahead_rule(tactic);
        SubLObject children = NIL;
        if (NIL == rule) {
            return $IGNORE;
        }
        if (NIL == children) {
            children = $NOTHING;
        }
        proof_spec = cons(list($TRANSFORMATION, literal, module_name, rule, children), proof_spec);
        proof_spec = Sequences.delete($IGNORE, proof_spec, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
        if (NIL == proof_spec) {
            proof_spec = $ANYTHING;
        } else if (NIL != list_utilities.singletonP(proof_spec)) {
            proof_spec = proof_spec.first();
        } else {
            proof_spec = Sequences.nreverse(proof_spec);
            proof_spec = cons($OR, proof_spec);
        }
        return proof_spec;
    }

    @SubL(source = "cycl/inference/harness/inference-proof-spec.lisp", position = 34200L)
    public static SubLObject failed_inference_rewrite_tactic_proof_spec(SubLObject tactic, SubLObject visited) {
        SubLObject proof_spec = NIL;
        set.set_add(tactic, visited);
        proof_spec = Sequences.delete($IGNORE, proof_spec, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
        if (NIL == proof_spec) {
            proof_spec = $ANYTHING;
        } else if (NIL != list_utilities.singletonP(proof_spec)) {
            proof_spec = proof_spec.first();
        } else {
            proof_spec = Sequences.nreverse(proof_spec);
            proof_spec = cons($OR, proof_spec);
        }
        return proof_spec;
    }

    @SubL(source = "cycl/inference/harness/inference-proof-spec.lisp", position = 34400L)
    public static SubLObject failed_inference_restriction_tactic_proof_spec(SubLObject tactic, SubLObject visited) {
        SubLObject proof_spec = NIL;
        set.set_add(tactic, visited);
        proof_spec = cons(list($RESTRICTION, $ANYTHING), proof_spec);
        proof_spec = Sequences.delete($IGNORE, proof_spec, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
        if (NIL == proof_spec) {
            proof_spec = $ANYTHING;
        } else if (NIL != list_utilities.singletonP(proof_spec)) {
            proof_spec = proof_spec.first();
        } else {
            proof_spec = Sequences.nreverse(proof_spec);
            proof_spec = cons($OR, proof_spec);
        }
        return proof_spec;
    }

    @SubL(source = "cycl/inference/harness/inference-proof-spec.lisp", position = 34600L)
    public static SubLObject hl_asent_from_problem_query(SubLObject problem_query) {
        SubLThread thread = SubLProcess.currentSubLThread();
        thread.resetMultipleValues();
        SubLObject mt = inference_datastructures_problem_query.mt_asent_sense_from_singleton_query(problem_query);
        SubLObject asent = thread.secondMultipleValue();
        SubLObject sense = thread.thirdMultipleValue();
        thread.resetMultipleValues();
        SubLObject literal = clause_utilities.asent_sense_to_literal(asent, sense);
        SubLObject hl_sentence = el_utilities.make_ist_sentence(mt, literal);
        return hl_sentence;
    }

    @SubL(source = "cycl/inference/harness/inference-proof-spec.lisp", position = 34900L)
    public static SubLObject merge_proof_specs(SubLObject proof_specs) {
        return Sequences.creduce(Symbols.symbol_function($sym63$MERGE_2_PROOF_SPECS), proof_specs, ZERO_INTEGER, NIL, $NOTHING);
    }

    @SubL(source = "cycl/inference/harness/inference-proof-spec.lisp", position = 35200L)
    public static SubLObject merge_2_proof_specs(SubLObject spec1, SubLObject spec2) {
        if (spec1.equal(spec2)) {
            return spec1;
        }
        if (spec1 == $NOTHING) {
            return spec2;
        }
        if (spec2 == $NOTHING) {
            return spec1;
        }
        if (spec1 == $ANYTHING) {
            return $ANYTHING;
        }
        if (spec2 == $ANYTHING) {
            return $ANYTHING;
        }
        if (spec1.isAtom() || spec2.isAtom()) {
            return make_or_pattern(spec1, spec2);
        }
        if ($REMOVAL == proof_spec_type(spec1) && $REMOVAL == proof_spec_type(spec2)) {
            return merge_removal_proof_specs(spec1, spec2);
        }
        if ($TRANSFORMATION == proof_spec_type(spec1) && $TRANSFORMATION == proof_spec_type(spec2)) {
            return merge_transformation_proof_specs(spec1, spec2);
        }
        if ($RESIDUAL_TRANSFORMATION == proof_spec_type(spec1) && $RESIDUAL_TRANSFORMATION == proof_spec_type(spec2)) {
            return merge_residual_transformation_proof_specs(spec1, spec2);
        }
        if (NIL != or_pattern_p(spec1) && NIL != or_pattern_p(spec2)) {
            return make_or_pattern(spec1, spec2);
        }
        if (!makeBoolean(NIL == or_pattern_p(spec1)).eql(makeBoolean(NIL == or_pattern_p(spec2)))) {
            return merge_into_or_pattern(spec1, spec2);
        }
        if (NIL != proof_specs_mergeable_wrt_typeP(spec1, spec2)) {
            SubLObject type = proof_spec_type(spec1);
            SubLObject merged_subspecs = NIL;
            SubLObject subspec1 = NIL;
            SubLObject subspec1_$5 = NIL;
            SubLObject subspec2 = NIL;
            SubLObject subspec2_$6 = NIL;
            subspec1 = spec1.rest();
            subspec1_$5 = subspec1.first();
            subspec2 = spec2.rest();
            subspec2_$6 = subspec2.first();
            while (NIL != subspec2 || NIL != subspec1) {
                merged_subspecs = cons(merge_2_proof_specs(subspec1_$5, subspec2_$6), merged_subspecs);
                subspec1 = subspec1.rest();
                subspec1_$5 = subspec1.first();
                subspec2 = subspec2.rest();
                subspec2_$6 = subspec2.first();
            }
            return reader.bq_cons(type, append(Sequences.nreverse(merged_subspecs), NIL));
        }
        return make_or_pattern(spec1, spec2);
    }

    @SubL(source = "cycl/inference/harness/inference-proof-spec.lisp", position = 36900L)
    public static SubLObject merge_into_or_pattern(SubLObject spec1, SubLObject spec2) {
        SubLObject or_spec_1P = or_pattern_p(spec1);
        SubLObject or_spec = (NIL != or_spec_1P) ? spec1 : spec2;
        SubLObject other_spec = (NIL != or_spec_1P) ? spec2 : spec1;
        SubLObject list_var = NIL;
        SubLObject subspec = NIL;
        SubLObject i = NIL;
        list_var = or_spec;
        subspec = list_var.first();
        for (i = ZERO_INTEGER; NIL != list_var; list_var = list_var.rest(), subspec = list_var.first(), i = Numbers.add(ONE_INTEGER, i)) {
            if (i.isPositive() && NIL != proof_specs_mergeable_wrt_typeP(subspec, other_spec)) {
                SubLObject merged_subspec = merge_2_proof_specs(subspec, other_spec);
                if (NIL == or_pattern_p(merged_subspec)) {
                    return list_utilities.replace_nth(i, merged_subspec, or_spec);
                }
            }
        }
        return make_or_pattern(spec1, spec2);
    }

    @SubL(source = "cycl/inference/harness/inference-proof-spec.lisp", position = 37400L)
    public static SubLObject proof_specs_mergeable_wrt_typeP(SubLObject spec1, SubLObject spec2) {
        return makeBoolean(proof_spec_type(spec1).eql(proof_spec_type(spec2)) && NIL != list_utilities.same_length_p(spec1, spec2));
    }

    @SubL(source = "cycl/inference/harness/inference-proof-spec.lisp", position = 37600L)
    public static SubLObject proof_spec_type(SubLObject proof_spec) {
        if (proof_spec.isCons()) {
            return proof_spec.first();
        }
        return NIL;
    }

    @SubL(source = "cycl/inference/harness/inference-proof-spec.lisp", position = 37700L)
    public static SubLObject merge_removal_proof_specs(SubLObject removal_spec_1, SubLObject removal_spec_2) {
        SubLObject current;
        SubLObject datum = current = removal_spec_1.rest();
        SubLObject formula_pattern_1 = NIL;
        SubLObject module_pattern_1 = NIL;
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, $list64);
        formula_pattern_1 = current.first();
        current = current.rest();
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, $list64);
        module_pattern_1 = current.first();
        current = current.rest();
        if (NIL == current) {
            SubLObject current_$8;
            SubLObject datum_$7 = current_$8 = removal_spec_2.rest();
            SubLObject formula_pattern_2 = NIL;
            SubLObject module_pattern_2 = NIL;
            cdestructuring_bind.destructuring_bind_must_consp(current_$8, datum_$7, $list65);
            formula_pattern_2 = current_$8.first();
            current_$8 = current_$8.rest();
            cdestructuring_bind.destructuring_bind_must_consp(current_$8, datum_$7, $list65);
            module_pattern_2 = current_$8.first();
            current_$8 = current_$8.rest();
            if (NIL == current_$8) {
                SubLObject merged_formula_pattern = merge_single_literal_formula_patterns(formula_pattern_1, formula_pattern_2);
                if ($UNMERGEABLE == merged_formula_pattern) {
                    return make_or_pattern(removal_spec_1, removal_spec_2);
                }
                SubLObject merged_module_pattern = merge_content_spec_module_patterns(module_pattern_1, module_pattern_2);
                return list($REMOVAL, merged_formula_pattern, merged_module_pattern);
            } else {
                cdestructuring_bind.cdestructuring_bind_error(datum_$7, $list65);
            }
        } else {
            cdestructuring_bind.cdestructuring_bind_error(datum, $list64);
        }
        return NIL;
    }

    @SubL(source = "cycl/inference/harness/inference-proof-spec.lisp", position = 38300L)
    public static SubLObject merge_transformation_proof_specs(SubLObject transformation_spec_1, SubLObject transformation_spec_2) {
        return merge_generalized_transformation_proof_specs(transformation_spec_1, transformation_spec_2, $TRANSFORMATION);
    }

    @SubL(source = "cycl/inference/harness/inference-proof-spec.lisp", position = 38500L)
    public static SubLObject merge_residual_transformation_proof_specs(SubLObject residual_transformation_spec_1, SubLObject residual_transformation_spec_2) {
        return merge_generalized_transformation_proof_specs(residual_transformation_spec_1, residual_transformation_spec_2, $RESIDUAL_TRANSFORMATION);
    }

    @SubL(source = "cycl/inference/harness/inference-proof-spec.lisp", position = 38800L)
    public static SubLObject merge_generalized_transformation_proof_specs(SubLObject transformation_spec_1, SubLObject transformation_spec_2, SubLObject type) {
        SubLObject current;
        SubLObject datum = current = transformation_spec_1.rest();
        SubLObject formula_pattern_1 = NIL;
        SubLObject module_pattern_1 = NIL;
        SubLObject rule_1 = NIL;
        SubLObject subspec_1 = NIL;
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, $list67);
        formula_pattern_1 = current.first();
        current = current.rest();
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, $list67);
        module_pattern_1 = current.first();
        current = current.rest();
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, $list67);
        rule_1 = current.first();
        current = current.rest();
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, $list67);
        subspec_1 = current.first();
        current = current.rest();
        if (NIL == current) {
            SubLObject current_$10;
            SubLObject datum_$9 = current_$10 = transformation_spec_2.rest();
            SubLObject formula_pattern_2 = NIL;
            SubLObject module_pattern_2 = NIL;
            SubLObject rule_2 = NIL;
            SubLObject subspec_2 = NIL;
            cdestructuring_bind.destructuring_bind_must_consp(current_$10, datum_$9, $list68);
            formula_pattern_2 = current_$10.first();
            current_$10 = current_$10.rest();
            cdestructuring_bind.destructuring_bind_must_consp(current_$10, datum_$9, $list68);
            module_pattern_2 = current_$10.first();
            current_$10 = current_$10.rest();
            cdestructuring_bind.destructuring_bind_must_consp(current_$10, datum_$9, $list68);
            rule_2 = current_$10.first();
            current_$10 = current_$10.rest();
            cdestructuring_bind.destructuring_bind_must_consp(current_$10, datum_$9, $list68);
            subspec_2 = current_$10.first();
            current_$10 = current_$10.rest();
            if (NIL == current_$10) {
                SubLObject merged_formula_pattern = rule_1.eql(rule_2) ? merge_single_literal_formula_patterns(formula_pattern_1, formula_pattern_2) : $UNMERGEABLE;
                if ($UNMERGEABLE == merged_formula_pattern) {
                    return make_or_pattern(transformation_spec_1, transformation_spec_2);
                }
                SubLObject merged_module_pattern = merge_content_spec_module_patterns(module_pattern_1, module_pattern_2);
                SubLObject merged_subspec = merge_2_proof_specs(subspec_1, subspec_2);
                return list(type, merged_formula_pattern, merged_module_pattern, rule_1, merged_subspec);
            } else {
                cdestructuring_bind.cdestructuring_bind_error(datum_$9, $list68);
            }
        } else {
            cdestructuring_bind.cdestructuring_bind_error(datum, $list67);
        }
        return NIL;
    }

    @SubL(source = "cycl/inference/harness/inference-proof-spec.lisp", position = 39700L)
    public static SubLObject merge_single_literal_formula_patterns(SubLObject formula_pattern_1, SubLObject formula_pattern_2) {
        SubLThread thread = SubLProcess.currentSubLThread();
        thread.resetMultipleValues();
        SubLObject mt_1 = destructure_single_literal_formula_pattern(formula_pattern_1);
        SubLObject asent_1 = thread.secondMultipleValue();
        SubLObject sense_1 = thread.thirdMultipleValue();
        thread.resetMultipleValues();
        thread.resetMultipleValues();
        SubLObject mt_2 = destructure_single_literal_formula_pattern(formula_pattern_2);
        SubLObject asent_2 = thread.secondMultipleValue();
        SubLObject sense_2 = thread.thirdMultipleValue();
        thread.resetMultipleValues();
        SubLObject predicate_1 = cycl_utilities.formula_operator(asent_1);
        SubLObject predicate_2 = cycl_utilities.formula_operator(asent_2);
        if (!sense_1.eql(sense_2) || !predicate_1.equal(predicate_2) || !el_utilities.formula_arity(asent_1, UNPROVIDED).eql(el_utilities.formula_arity(asent_2, UNPROVIDED))) {
            return $UNMERGEABLE;
        }
        SubLObject args_1 = cycl_utilities.formula_args(asent_1, UNPROVIDED);
        SubLObject args_2 = cycl_utilities.formula_args(asent_2, UNPROVIDED);
        SubLObject merged_mt = merge_proof_spec_term(mt_1, mt_2);
        SubLObject merged_predicate = predicate_1;
        SubLObject merged_formula_args = merge_proof_spec_terms(args_1, args_2);
        SubLObject merged_asent = el_utilities.make_formula(merged_predicate, merged_formula_args, UNPROVIDED);
        SubLObject merged_sense = sense_1;
        SubLObject merged_formula_pattern = el_utilities.make_ist_sentence_from_mt_asent_sense(merged_mt, merged_asent, merged_sense);
        return merged_formula_pattern;
    }

    @SubL(source = "cycl/inference/harness/inference-proof-spec.lisp", position = 40800L)
    public static SubLObject destructure_single_literal_formula_pattern(SubLObject formula_pattern) {
        SubLThread thread = SubLProcess.currentSubLThread();
        assert NIL != el_utilities.ist_sentence_p(formula_pattern, UNPROVIDED) : formula_pattern;
        thread.resetMultipleValues();
        SubLObject ist = el_utilities.unmake_binary_formula(formula_pattern);
        SubLObject mt = thread.secondMultipleValue();
        SubLObject literal = thread.thirdMultipleValue();
        thread.resetMultipleValues();
        if (NIL != el_utilities.el_negation_p(literal)) {
            return Values.values(mt, cycl_utilities.sentence_arg1(literal, UNPROVIDED), $NEG);
        }
        return Values.values(mt, literal, $POS);
    }

    @SubL(source = "cycl/inference/harness/inference-proof-spec.lisp", position = 41200L)
    public static SubLObject merge_content_spec_module_patterns(SubLObject module_pattern_1, SubLObject module_pattern_2) {
        if (module_pattern_1.eql(module_pattern_2)) {
            return module_pattern_1;
        }
        if (NIL != pattern_match.pattern_matches_tree_without_bindings(module_pattern_1, module_pattern_2)) {
            return module_pattern_1;
        }
        if (NIL != pattern_match.pattern_matches_tree_without_bindings(module_pattern_2, module_pattern_1)) {
            return module_pattern_2;
        }
        return make_or_pattern(module_pattern_1, module_pattern_2);
    }

    @SubL(source = "cycl/inference/harness/inference-proof-spec.lisp", position = 41600L)
    public static SubLObject make_or_pattern(SubLObject pattern1, SubLObject pattern2) {
        SubLObject subpatterns_1 = (NIL != or_pattern_p(pattern1)) ? pattern1.rest() : list(pattern1);
        SubLObject subpatterns_2 = (NIL != or_pattern_p(pattern2)) ? pattern2.rest() : list(pattern2);
        SubLObject merged_patterns = conses_high.union(subpatterns_1, subpatterns_2, Symbols.symbol_function(EQUAL), UNPROVIDED);
        return reader.bq_cons($OR, append(merged_patterns, NIL));
    }

    @SubL(source = "cycl/inference/harness/inference-proof-spec.lisp", position = 42000L)
    public static SubLObject or_pattern_p(SubLObject pattern) {
        return makeBoolean(pattern.isCons() && $OR == pattern.first());
    }

    @SubL(source = "cycl/inference/harness/inference-proof-spec.lisp", position = 42100L)
    public static SubLObject merge_proof_spec_terms(SubLObject terms_1, SubLObject terms_2) {
        SubLObject merged_terms = NIL;
        SubLObject term_1 = NIL;
        SubLObject term_1_$11 = NIL;
        SubLObject term_2 = NIL;
        SubLObject term_2_$12 = NIL;
        term_1 = terms_1;
        term_1_$11 = term_1.first();
        term_2 = terms_2;
        term_2_$12 = term_2.first();
        while (NIL != term_2 || NIL != term_1) {
            merged_terms = cons(merge_proof_spec_term(term_1_$11, term_2_$12), merged_terms);
            term_1 = term_1.rest();
            term_1_$11 = term_1.first();
            term_2 = term_2.rest();
            term_2_$12 = term_2.first();
        }
        return Sequences.nreverse(merged_terms);
    }

    @SubL(source = "cycl/inference/harness/inference-proof-spec.lisp", position = 42300L)
    public static SubLObject merge_proof_spec_term(SubLObject term_1, SubLObject term_2) {
        if (term_1.equal(term_2)) {
            return term_1;
        }
        if (NIL != pattern_match.pattern_matches_tree_without_bindings(term_1, term_2)) {
            return term_1;
        }
        if (NIL != pattern_match.pattern_matches_tree_without_bindings(term_2, term_1)) {
            return term_2;
        }
        return $ANYTHING;
    }

    @SubL(source = "cycl/inference/harness/inference-proof-spec.lisp", position = 42700L)
    public static SubLObject genericize_proof_spec(SubLObject proof_spec) {
        return transform_list_utilities.quiescent_transform(proof_spec, Symbols.symbol_function($sym72$CONTENT_PROOF_SPEC_P), Symbols.symbol_function($sym73$GENERICIZE_CONTENT_PROOF_SPEC), UNPROVIDED, UNPROVIDED);
    }

    @SubL(source = "cycl/inference/harness/inference-proof-spec.lisp", position = 43000L)
    public static SubLObject genericize_content_proof_spec(SubLObject proof_spec) {
        if (NIL != removal_proof_spec_p(proof_spec)) {
            return genericize_removal_proof_spec(proof_spec);
        }
        if (NIL != transformation_proof_spec_p(proof_spec)) {
            return genericize_transformation_proof_spec(proof_spec);
        }
        if (NIL != residual_transformation_proof_spec_p(proof_spec)) {
            return genericize_residual_transformation_proof_spec(proof_spec);
        }
        return Errors.error($str74$Time_to_handle_proof_spec__s, proof_spec);
    }

    @SubL(source = "cycl/inference/harness/inference-proof-spec.lisp", position = 43400L)
    public static SubLObject genericize_removal_proof_spec(SubLObject removal_spec) {
        SubLObject current;
        SubLObject datum = current = removal_spec.rest();
        SubLObject formula_pattern = NIL;
        SubLObject module_pattern = NIL;
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, $list75);
        formula_pattern = current.first();
        current = current.rest();
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, $list75);
        module_pattern = current.first();
        current = current.rest();
        if (NIL == current) {
            SubLObject generic_formula_pattern = genericize_single_literal_formula_pattern(formula_pattern);
            SubLObject generic_module_pattern = module_pattern;
            return list($REMOVAL, generic_formula_pattern, generic_module_pattern);
        }
        cdestructuring_bind.cdestructuring_bind_error(datum, $list75);
        return NIL;
    }

    @SubL(source = "cycl/inference/harness/inference-proof-spec.lisp", position = 43800L)
    public static SubLObject genericize_transformation_proof_spec(SubLObject transformation_spec) {
        return genericize_generalized_transformation_proof_spec(transformation_spec, $TRANSFORMATION);
    }

    @SubL(source = "cycl/inference/harness/inference-proof-spec.lisp", position = 44000L)
    public static SubLObject genericize_residual_transformation_proof_spec(SubLObject transformation_spec) {
        return genericize_generalized_transformation_proof_spec(transformation_spec, $RESIDUAL_TRANSFORMATION);
    }

    @SubL(source = "cycl/inference/harness/inference-proof-spec.lisp", position = 44200L)
    public static SubLObject genericize_generalized_transformation_proof_spec(SubLObject transformation_spec, SubLObject type) {
        SubLObject current;
        SubLObject datum = current = transformation_spec.rest();
        SubLObject formula_pattern = NIL;
        SubLObject module_pattern = NIL;
        SubLObject rule = NIL;
        SubLObject subspec = NIL;
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, $list76);
        formula_pattern = current.first();
        current = current.rest();
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, $list76);
        module_pattern = current.first();
        current = current.rest();
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, $list76);
        rule = current.first();
        current = current.rest();
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, $list76);
        subspec = current.first();
        current = current.rest();
        if (NIL == current) {
            SubLObject generic_formula_pattern = genericize_single_literal_formula_pattern(formula_pattern);
            SubLObject generic_module_pattern = module_pattern;
            SubLObject generic_rule = rule;
            SubLObject generic_subspec = genericize_proof_spec(subspec);
            return list(type, generic_formula_pattern, generic_module_pattern, generic_rule, generic_subspec);
        }
        cdestructuring_bind.cdestructuring_bind_error(datum, $list76);
        return NIL;
    }

    @SubL(source = "cycl/inference/harness/inference-proof-spec.lisp", position = 44800L)
    public static SubLObject genericize_single_literal_formula_pattern(SubLObject formula_pattern) {
        SubLThread thread = SubLProcess.currentSubLThread();
        thread.resetMultipleValues();
        SubLObject mt = destructure_single_literal_formula_pattern(formula_pattern);
        SubLObject asent = thread.secondMultipleValue();
        SubLObject sense = thread.thirdMultipleValue();
        thread.resetMultipleValues();
        SubLObject predicate = cycl_utilities.formula_operator(asent);
        SubLObject args = cycl_utilities.formula_args(asent, UNPROVIDED);
        SubLObject generic_mt = genericize_proof_spec_term(mt);
        SubLObject generic_args = genericize_proof_spec_terms(args);
        SubLObject generic_asent = el_utilities.make_formula(predicate, generic_args, UNPROVIDED);
        SubLObject generic_sense = sense;
        SubLObject generic_formula_pattern = el_utilities.make_ist_sentence_from_mt_asent_sense(generic_mt, generic_asent, generic_sense);
        return generic_formula_pattern;
    }

    @SubL(source = "cycl/inference/harness/inference-proof-spec.lisp", position = 45400L)
    public static SubLObject genericize_proof_spec_terms(SubLObject terms) {
        SubLObject generic_terms = NIL;
        SubLObject cdolist_list_var = terms;
        SubLObject v_term = NIL;
        v_term = cdolist_list_var.first();
        while (NIL != cdolist_list_var) {
            generic_terms = cons(genericize_proof_spec_term(v_term), generic_terms);
            cdolist_list_var = cdolist_list_var.rest();
            v_term = cdolist_list_var.first();
        }
        return Sequences.nreverse(generic_terms);
    }

    @SubL(source = "cycl/inference/harness/inference-proof-spec.lisp", position = 45600L)
    public static SubLObject genericize_proof_spec_term(SubLObject v_term) {
        if (v_term == $ANYTHING) {
            return v_term;
        }
        return $FULLY_BOUND;
    }

    @SubL(source = "cycl/inference/harness/inference-proof-spec.lisp", position = 45800L)
    public static SubLObject genericize_problem_query(SubLObject problem_query) {
        SubLObject generic_problem_query = NIL;
        SubLObject cdolist_list_var = problem_query;
        SubLObject clause = NIL;
        clause = cdolist_list_var.first();
        while (NIL != cdolist_list_var) {
            generic_problem_query = cons(genericize_contextualized_clause(clause), generic_problem_query);
            cdolist_list_var = cdolist_list_var.rest();
            clause = cdolist_list_var.first();
        }
        return Sequences.nreverse(generic_problem_query);
    }

    @SubL(source = "cycl/inference/harness/inference-proof-spec.lisp", position = 46200L)
    public static SubLObject genericize_contextualized_clause(SubLObject contextualized_clause) {
        SubLObject generic_neg_lits = NIL;
        SubLObject generic_pos_lits = NIL;
        SubLObject cdolist_list_var = clauses.neg_lits(contextualized_clause);
        SubLObject literal = NIL;
        literal = cdolist_list_var.first();
        while (NIL != cdolist_list_var) {
            generic_neg_lits = cons(genericize_contextualized_asent(literal), generic_neg_lits);
            cdolist_list_var = cdolist_list_var.rest();
            literal = cdolist_list_var.first();
        }
        cdolist_list_var = clauses.pos_lits(contextualized_clause);
        literal = NIL;
        literal = cdolist_list_var.first();
        while (NIL != cdolist_list_var) {
            generic_pos_lits = cons(genericize_contextualized_asent(literal), generic_pos_lits);
            cdolist_list_var = cdolist_list_var.rest();
            literal = cdolist_list_var.first();
        }
        return clauses.make_clause(Sequences.nreverse(generic_neg_lits), Sequences.nreverse(generic_pos_lits));
    }

    @SubL(source = "cycl/inference/harness/inference-proof-spec.lisp", position = 46700L)
    public static SubLObject genericize_contextualized_asent(SubLObject contextualized_asent) {
        SubLObject mt = NIL;
        SubLObject asent = NIL;
        cdestructuring_bind.destructuring_bind_must_consp(contextualized_asent, contextualized_asent, $list78);
        mt = contextualized_asent.first();
        SubLObject current = contextualized_asent.rest();
        cdestructuring_bind.destructuring_bind_must_consp(current, contextualized_asent, $list78);
        asent = current.first();
        current = current.rest();
        if (NIL == current) {
            SubLObject generic_mt = genericize_term_wrt_pattern_match(mt);
            SubLObject generic_asent = genericize_formula(asent);
            return inference_datastructures_problem_query.make_contextualized_asent(generic_mt, generic_asent);
        }
        cdestructuring_bind.cdestructuring_bind_error(contextualized_asent, $list78);
        return NIL;
    }

    @SubL(source = "cycl/inference/harness/inference-proof-spec.lisp", position = 47000L)
    public static SubLObject genericize_formula(SubLObject formula) {
        SubLObject relation = cycl_utilities.formula_operator(formula);
        SubLObject args = cycl_utilities.formula_args(formula, UNPROVIDED);
        SubLObject generic_args = genericize_formula_args(args);
        SubLObject generic_formula = el_utilities.make_formula(relation, generic_args, UNPROVIDED);
        return generic_formula;
    }

    @SubL(source = "cycl/inference/harness/inference-proof-spec.lisp", position = 47300L)
    public static SubLObject genericize_formula_args(SubLObject args) {
        SubLObject generic_args = NIL;
        SubLObject cdolist_list_var = args;
        SubLObject arg = NIL;
        arg = cdolist_list_var.first();
        while (NIL != cdolist_list_var) {
            generic_args = cons(genericize_term_wrt_pattern_match(arg), generic_args);
            cdolist_list_var = cdolist_list_var.rest();
            arg = cdolist_list_var.first();
        }
        return Sequences.nreverse(generic_args);
    }

    @SubL(source = "cycl/inference/harness/inference-proof-spec.lisp", position = 47500L)
    public static SubLObject genericize_term_wrt_pattern_match(SubLObject v_term) {
        if (NIL != forts.fort_p(v_term)) {
            return $FULLY_BOUND;
        }
        if (v_term.isInteger()) {
            return $INTEGER;
        }
        if (v_term.isDouble()) {
            return $NUMBER;
        }
        if (v_term.isString()) {
            return $STRING;
        }
        if (NIL != el_utilities.el_formula_p(v_term)) {
            return genericize_formula(v_term);
        }
        return v_term;
    }

    @SubL(source = "cycl/inference/harness/inference-proof-spec.lisp", position = 47800L)
    public static SubLObject proof_spec_possibly_admits_problemP(SubLObject proof_spec, SubLObject problem) {
        if ($NOTHING == proof_spec) {
            return NIL;
        }
        if ($ANYTHING == proof_spec) {
            return T;
        }
        if (NIL != removal_proof_spec_p(proof_spec)) {
            if (NIL != inference_datastructures_problem.single_literal_problem_p(problem)) {
                SubLObject literal_spec = proof_spec_literal_spec(proof_spec);
                return inference_tactician_strategic_uninterestingness.literal_spec_admits_single_literal_problemP(literal_spec, problem);
            }
            return NIL;
        } else {
            if (NIL == restriction_proof_spec_p(proof_spec)) {
                return T;
            }
            if (NIL != inference_datastructures_problem.open_problem_p(problem)) {
                SubLObject restricted_proof_spec = restriction_proof_spec_restricted_proof_spec(proof_spec);
                return proof_spec_possibly_admits_problemP(restricted_proof_spec, problem);
            }
            return NIL;
        }
    }

    @SubL(source = "cycl/inference/harness/inference-proof-spec.lisp", position = 48800L)
    public static SubLObject query_parameters_from_proof_spec(SubLObject proof_spec) {
        return list($PROOF_SPEC, proof_spec);
    }

    @SubL(source = "cycl/inference/harness/inference-proof-spec.lisp", position = 49000L)
    public static SubLObject query_allowance_parameters_from_proof_spec(SubLObject proof_spec) {
        SubLObject module_set = set.new_set(Symbols.symbol_function(EQL), ZERO_INTEGER);
        SubLObject rule_set = set.new_set(Symbols.symbol_function(EQL), ZERO_INTEGER);
        query_allowance_parameters_from_proof_spec_recursive(proof_spec, module_set, rule_set);
        SubLObject v_modules = set.set_element_list(module_set);
        SubLObject rules = set.set_element_list(rule_set);
        return append((NIL != v_modules) ? list($ALLOWED_MODULES, reader.bq_cons($OR, append(v_modules, NIL))) : NIL, (NIL != rules) ? list($ALLOWED_RULES, rules) : NIL, NIL);
    }

    @SubL(source = "cycl/inference/harness/inference-proof-spec.lisp", position = 49400L)
    public static SubLObject query_allowance_parameters_from_proof_spec_recursive(SubLObject proof_spec, SubLObject module_set, SubLObject rule_set) {
        if (!proof_spec.isAtom()) {
            if (NIL != or_pattern_p(proof_spec)) {
                SubLObject or = NIL;
                SubLObject sub_specs = NIL;
                cdestructuring_bind.destructuring_bind_must_consp(proof_spec, proof_spec, $list85);
                or = proof_spec.first();
                SubLObject current = proof_spec.rest();
                SubLObject cdolist_list_var;
                sub_specs = (cdolist_list_var = current);
                SubLObject sub_spec = NIL;
                sub_spec = cdolist_list_var.first();
                while (NIL != cdolist_list_var) {
                    query_allowance_parameters_from_proof_spec_recursive(sub_spec, module_set, rule_set);
                    cdolist_list_var = cdolist_list_var.rest();
                    sub_spec = cdolist_list_var.first();
                }
            } else if (NIL != removal_proof_spec_p(proof_spec)) {
                SubLObject removal = NIL;
                SubLObject formula_pattern = NIL;
                SubLObject module_pattern = NIL;
                cdestructuring_bind.destructuring_bind_must_consp(proof_spec, proof_spec, $list86);
                removal = proof_spec.first();
                SubLObject current = proof_spec.rest();
                cdestructuring_bind.destructuring_bind_must_consp(current, proof_spec, $list86);
                formula_pattern = current.first();
                current = current.rest();
                cdestructuring_bind.destructuring_bind_must_consp(current, proof_spec, $list86);
                module_pattern = current.first();
                current = current.rest();
                if (NIL == current) {
                    module_parameters_from_module_pattern(module_pattern, module_set);
                } else {
                    cdestructuring_bind.cdestructuring_bind_error(proof_spec, $list86);
                }
            } else if (NIL != transformation_proof_spec_p(proof_spec)) {
                SubLObject transformation = NIL;
                SubLObject formula_pattern = NIL;
                SubLObject module_pattern = NIL;
                SubLObject rule = NIL;
                SubLObject sub_spec2 = NIL;
                cdestructuring_bind.destructuring_bind_must_consp(proof_spec, proof_spec, $list87);
                transformation = proof_spec.first();
                SubLObject current = proof_spec.rest();
                cdestructuring_bind.destructuring_bind_must_consp(current, proof_spec, $list87);
                formula_pattern = current.first();
                current = current.rest();
                cdestructuring_bind.destructuring_bind_must_consp(current, proof_spec, $list87);
                module_pattern = current.first();
                current = current.rest();
                cdestructuring_bind.destructuring_bind_must_consp(current, proof_spec, $list87);
                rule = current.first();
                current = current.rest();
                cdestructuring_bind.destructuring_bind_must_consp(current, proof_spec, $list87);
                sub_spec2 = current.first();
                current = current.rest();
                if (NIL == current) {
                    set.set_add(rule, rule_set);
                    set.set_add($DETERMINE_NEW_TRANSFORMATION_TACTICS, module_set);
                    module_parameters_from_module_pattern(module_pattern, module_set);
                    query_allowance_parameters_from_proof_spec_recursive(sub_spec2, module_set, rule_set);
                } else {
                    cdestructuring_bind.cdestructuring_bind_error(proof_spec, $list87);
                }
            } else if (NIL != residual_transformation_proof_spec_p(proof_spec)) {
                SubLObject residual_transformation = NIL;
                SubLObject formula_pattern = NIL;
                SubLObject module_pattern = NIL;
                SubLObject rule = NIL;
                SubLObject sub_spec2 = NIL;
                cdestructuring_bind.destructuring_bind_must_consp(proof_spec, proof_spec, $list89);
                residual_transformation = proof_spec.first();
                SubLObject current = proof_spec.rest();
                cdestructuring_bind.destructuring_bind_must_consp(current, proof_spec, $list89);
                formula_pattern = current.first();
                current = current.rest();
                cdestructuring_bind.destructuring_bind_must_consp(current, proof_spec, $list89);
                module_pattern = current.first();
                current = current.rest();
                cdestructuring_bind.destructuring_bind_must_consp(current, proof_spec, $list89);
                rule = current.first();
                current = current.rest();
                cdestructuring_bind.destructuring_bind_must_consp(current, proof_spec, $list89);
                sub_spec2 = current.first();
                current = current.rest();
                if (NIL == current) {
                    set.set_add(rule, rule_set);
                    set.set_add($JOIN_ORDERED, module_set);
                    module_parameters_from_module_pattern(module_pattern, module_set);
                    query_allowance_parameters_from_proof_spec_recursive(sub_spec2, module_set, rule_set);
                } else {
                    cdestructuring_bind.cdestructuring_bind_error(proof_spec, $list89);
                }
            } else {
                SubLObject structural = NIL;
                SubLObject sub_specs = NIL;
                cdestructuring_bind.destructuring_bind_must_consp(proof_spec, proof_spec, $list90);
                structural = proof_spec.first();
                SubLObject current = sub_specs = proof_spec.rest();
                if (NIL != list_utilities.member_eqP(structural, $list91)) {
                    set.set_add(structural, module_set);
                }
                if (structural == $SPLIT) {
                    set.set_add($DETERMINE_NEW_SPLIT_TACTICS, module_set);
                }
                SubLObject cdolist_list_var = sub_specs;
                SubLObject sub_spec = NIL;
                sub_spec = cdolist_list_var.first();
                while (NIL != cdolist_list_var) {
                    query_allowance_parameters_from_proof_spec_recursive(sub_spec, module_set, rule_set);
                    cdolist_list_var = cdolist_list_var.rest();
                    sub_spec = cdolist_list_var.first();
                }
            }
        }
        return NIL;
    }

    @SubL(source = "cycl/inference/harness/inference-proof-spec.lisp", position = 51400L)
    public static SubLObject module_parameters_from_module_pattern(SubLObject module_pattern, SubLObject module_set) {
        if (module_pattern.isAtom()) {
            set.set_add(module_pattern, module_set);
        } else if (NIL != or_pattern_p(module_pattern)) {
            SubLObject or = NIL;
            SubLObject sub_patterns = NIL;
            cdestructuring_bind.destructuring_bind_must_consp(module_pattern, module_pattern, $list93);
            or = module_pattern.first();
            SubLObject current = module_pattern.rest();
            SubLObject cdolist_list_var;
            sub_patterns = (cdolist_list_var = current);
            SubLObject sub_pattern = NIL;
            sub_pattern = cdolist_list_var.first();
            while (NIL != cdolist_list_var) {
                module_parameters_from_module_pattern(sub_pattern, module_set);
                cdolist_list_var = cdolist_list_var.rest();
                sub_pattern = cdolist_list_var.first();
            }
        }
        return NIL;
    }

    @SubL(source = "cycl/inference/harness/inference-proof-spec.lisp", position = 52300L)
    public static SubLObject use_kbq_proof_spec_tableP() {
        SubLThread thread = SubLProcess.currentSubLThread();
        return $use_kbq_proof_spec_tableP$.getDynamicValue(thread);
    }

    @SubL(source = "cycl/inference/harness/inference-proof-spec.lisp", position = 52400L)
    public static SubLObject initialize_kbq_proof_spec_table(SubLObject filename) {
        dictionary.clear_dictionary($kbq_proof_spec_table$.getGlobalValue());
        SubLObject query_set_run = kbq_query_run.kbq_answerable_query_set_run(kbq_query_run.kbq_load_query_set_run(filename));
        SubLObject cdolist_list_var = kbq_query_run.kbq_query_set_run_query_runs(query_set_run);
        SubLObject query_run = NIL;
        query_run = cdolist_list_var.first();
        while (NIL != cdolist_list_var) {
            SubLObject query_spec = kbq_query_run.kbq_query_run_query(query_run);
            SubLObject proof_spec = kbq_query_run.kbq_query_run_property_value(query_run, $INFERENCE_PROOF_SPEC, UNPROVIDED);
            if (!proof_spec.isCons()) {
                Errors.warn($str96$possibly_ill_formed_proof_spec___, proof_spec);
            }
            dictionary.dictionary_enter($kbq_proof_spec_table$.getGlobalValue(), query_spec, proof_spec);
            cdolist_list_var = cdolist_list_var.rest();
            query_run = cdolist_list_var.first();
        }
        return $kbq_proof_spec_table$.getGlobalValue();
    }

    @SubL(source = "cycl/inference/harness/inference-proof-spec.lisp", position = 53000L)
    public static SubLObject overriding_experimental_proof_spec_properties(SubLObject query_spec) {
        SubLObject proof_spec = dictionary.dictionary_lookup($kbq_proof_spec_table$.getGlobalValue(), query_spec, UNPROVIDED);
        if (NIL != proof_spec) {
            return query_parameters_from_proof_spec(proof_spec);
        }
        return $list97;
    }

    @SubL(source = "cycl/inference/harness/inference-proof-spec.lisp", position = 53400L)
    public static SubLObject initialize_kbq_proof_spec_table_from_query_set(SubLObject kbq_query_set, SubLObject filename) {
        if (filename == UNPROVIDED) {
            filename = NIL;
        }
        SubLThread thread = SubLProcess.currentSubLThread();
        dictionary.clear_dictionary($kbq_proof_spec_table$.getGlobalValue());
        SubLObject list_var;
        SubLObject queries = list_var = list_utilities.randomize_list(kbq_query_run.all_instantiations_via_inference(kbq_query_set, $$InferencePSC));
        SubLObject _prev_bind_0 = utilities_macros.$progress_note$.currentBinding(thread);
        SubLObject _prev_bind_2 = utilities_macros.$progress_start_time$.currentBinding(thread);
        SubLObject _prev_bind_3 = utilities_macros.$progress_total$.currentBinding(thread);
        SubLObject _prev_bind_4 = utilities_macros.$progress_sofar$.currentBinding(thread);
        SubLObject _prev_bind_5 = utilities_macros.$last_percent_progress_index$.currentBinding(thread);
        SubLObject _prev_bind_6 = utilities_macros.$last_percent_progress_prediction$.currentBinding(thread);
        SubLObject _prev_bind_7 = utilities_macros.$within_noting_percent_progress$.currentBinding(thread);
        SubLObject _prev_bind_8 = utilities_macros.$percent_progress_start_time$.currentBinding(thread);
        try {
            utilities_macros.$progress_note$.bind($str99$Doing_inference_for_all_elements_, thread);
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
                SubLObject query = NIL;
                query = csome_list_var.first();
                while (NIL != csome_list_var) {
                    SubLObject proof_spec = proof_spec_for_kbq(query);
                    if (NIL != proof_spec) {
                        dictionary.dictionary_enter($kbq_proof_spec_table$.getGlobalValue(), query, proof_spec);
                        if (filename.isString()) {
                            cfasl_utilities.cfasl_save($kbq_proof_spec_table$.getGlobalValue(), filename);
                        }
                    }
                    utilities_macros.$progress_sofar$.setDynamicValue(Numbers.add(utilities_macros.$progress_sofar$.getDynamicValue(thread), ONE_INTEGER), thread);
                    utilities_macros.note_percent_progress(utilities_macros.$progress_sofar$.getDynamicValue(thread), utilities_macros.$progress_total$.getDynamicValue(thread));
                    csome_list_var = csome_list_var.rest();
                    query = csome_list_var.first();
                }
            } finally {
                SubLObject _prev_bind_0_$13 = Threads.$is_thread_performing_cleanupP$.currentBinding(thread);
                try {
                    Threads.$is_thread_performing_cleanupP$.bind(T, thread);
                    SubLObject _values = Values.getValuesAsVector();
                    utilities_macros.noting_percent_progress_postamble();
                    Values.restoreValuesFromVector(_values);
                } finally {
                    Threads.$is_thread_performing_cleanupP$.rebind(_prev_bind_0_$13, thread);
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
        return $kbq_proof_spec_table$.getGlobalValue();
    }

    @SubL(source = "cycl/inference/harness/inference-proof-spec.lisp", position = 54000L)
    public static SubLObject proof_spec_for_kbq(SubLObject query) {
        SubLObject results = inference_results_for_kbq(query);
        if (NIL != results) {
            SubLObject proof_spec = nth(THREE_INTEGER, results);
            return proof_spec;
        }
        return NIL;
    }

    @SubL(source = "cycl/inference/harness/inference-proof-spec.lisp", position = 54200L)
    public static SubLObject inference_results_for_kbq(SubLObject query) {
        SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject sentence = NIL;
        SubLObject mt = NIL;
        SubLObject v_properties = NIL;
        SubLObject ignore_errors_tag = NIL;
        try {
            thread.throwStack.push($IGNORE_ERRORS_TARGET);
            SubLObject _prev_bind_0 = Errors.$error_handler$.currentBinding(thread);
            try {
                Errors.$error_handler$.bind(Symbols.symbol_function($sym102$IGNORE_ERRORS_HANDLER), thread);
                try {
                    SubLObject kbq_properties = NIL;
                    sentence = kb_query.kbq_sentence(query);
                    mt = kb_query.kbq_mt(query);
                    kbq_properties = kb_query.kbq_query_properties(query);
                    v_properties = conses_high.putf(conses_high.putf(conses_high.putf(conses_high.copy_list(kbq_properties), $METRICS, $list104), $BROWSABLE_, T), $MAX_TIME, $int$30);
                    PrintLow.format(T, $str108$___A___A__, numeric_date_utilities.timestring(UNPROVIDED), query);
                    streams_high.force_output(T);
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
        if (NIL != list_utilities.sublisp_boolean(sentence) && NIL != list_utilities.sublisp_boolean(mt) && NIL != list_utilities.sublisp_boolean(v_properties)) {
            SubLObject results = Values.arg2(thread.resetMultipleValues(), Values.multiple_value_list(inference_kernel.new_cyc_query(sentence, mt, v_properties)));
            return results;
        }
        return NIL;
    }

    @SubL(source = "cycl/inference/harness/inference-proof-spec.lisp", position = 55000L)
    public static SubLObject analyze_asked_queries_for_proof_spec_overlap(SubLObject filename) {
        SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject dict = dictionary.new_dictionary(Symbols.symbol_function(EQUAL), UNPROVIDED);
        SubLObject done_varP = NIL;
        SubLObject i = ZERO_INTEGER;
        SubLObject stream = NIL;
        try {
            SubLObject _prev_bind_0 = stream_macros.$stream_requires_locking$.currentBinding(thread);
            try {
                stream_macros.$stream_requires_locking$.bind(NIL, thread);
                stream = compatibility.open_binary(filename, $INPUT);
            } finally {
                stream_macros.$stream_requires_locking$.rebind(_prev_bind_0, thread);
            }
            if (!stream.isStream()) {
                Errors.error($str110$Unable_to_open__S, filename);
            }
            SubLObject input_stream = stream;
            SubLObject _prev_bind_2 = cfasl.$cfasl_common_symbols$.currentBinding(thread);
            try {
                cfasl.$cfasl_common_symbols$.bind(NIL, thread);
                cfasl.cfasl_set_common_symbols(inference_analysis.asked_query_common_symbols());
                while (NIL == done_varP) {
                    SubLObject query_info = inference_analysis.load_asked_query_from_stream(input_stream);
                    if ($EOF == query_info) {
                        done_varP = T;
                    } else if (query_info.isString()) {
                        Errors.warn($str112$Read_invalid_query_info__s, query_info);
                    } else {
                        SubLObject current;
                        SubLObject datum = current = query_info;
                        SubLObject problem_query = NIL;
                        SubLObject mt = NIL;
                        SubLObject v_properties = NIL;
                        cdestructuring_bind.destructuring_bind_must_consp(current, datum, $list113);
                        problem_query = current.first();
                        current = current.rest();
                        cdestructuring_bind.destructuring_bind_must_consp(current, datum, $list113);
                        mt = current.first();
                        current = current.rest();
                        cdestructuring_bind.destructuring_bind_must_consp(current, datum, $list113);
                        v_properties = current.first();
                        current = current.rest();
                        if (NIL == current) {
                            if (NIL == inference_datastructures_problem_query.problem_query_p(problem_query)) {
                                problem_query = inference_czer.inference_canonicalize_ask_memoized(problem_query, mt, $IGNORE);
                            }
                            if (NIL != inference_datastructures_problem_query.problem_query_p(problem_query)) {
                                dictionary_utilities.dictionary_increment(dict, cons(mt, genericize_problem_query(problem_query)), UNPROVIDED);
                            } else {
                                print_high.print(problem_query, UNPROVIDED);
                            }
                        } else {
                            cdestructuring_bind.cdestructuring_bind_error(datum, $list113);
                        }
                        i = Numbers.add(i, ONE_INTEGER);
                    }
                }
            } finally {
                cfasl.$cfasl_common_symbols$.rebind(_prev_bind_2, thread);
            }
        } finally {
            SubLObject _prev_bind_3 = Threads.$is_thread_performing_cleanupP$.currentBinding(thread);
            try {
                Threads.$is_thread_performing_cleanupP$.bind(T, thread);
                SubLObject _values = Values.getValuesAsVector();
                if (stream.isStream()) {
                    streams_high.close(stream, UNPROVIDED);
                }
                Values.restoreValuesFromVector(_values);
            } finally {
                Threads.$is_thread_performing_cleanupP$.rebind(_prev_bind_3, thread);
            }
        }
        return dict;
    }

    @SubL(source = "cycl/inference/harness/inference-proof-spec.lisp", position = 56000L)
    public static SubLObject run_proof_spec_experiment(SubLObject output_filename, SubLObject query_specs, SubLObject overriding_query_properties) {
        if (overriding_query_properties == UNPROVIDED) {
            overriding_query_properties = NIL;
        }
        SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject stream = NIL;
        try {
            SubLObject _prev_bind_0 = stream_macros.$stream_requires_locking$.currentBinding(thread);
            try {
                stream_macros.$stream_requires_locking$.bind(NIL, thread);
                stream = compatibility.open_binary(output_filename, $OUTPUT);
            } finally {
                stream_macros.$stream_requires_locking$.rebind(_prev_bind_0, thread);
            }
            if (!stream.isStream()) {
                Errors.error($str110$Unable_to_open__S, output_filename);
            }
            SubLObject stream_$14 = stream;
            SubLObject _prev_bind_2 = utilities_macros.$progress_note$.currentBinding(thread);
            SubLObject _prev_bind_3 = utilities_macros.$progress_start_time$.currentBinding(thread);
            SubLObject _prev_bind_4 = utilities_macros.$progress_total$.currentBinding(thread);
            SubLObject _prev_bind_5 = utilities_macros.$progress_sofar$.currentBinding(thread);
            SubLObject _prev_bind_6 = utilities_macros.$last_percent_progress_index$.currentBinding(thread);
            SubLObject _prev_bind_7 = utilities_macros.$last_percent_progress_prediction$.currentBinding(thread);
            SubLObject _prev_bind_8 = utilities_macros.$within_noting_percent_progress$.currentBinding(thread);
            SubLObject _prev_bind_9 = utilities_macros.$percent_progress_start_time$.currentBinding(thread);
            try {
                utilities_macros.$progress_note$.bind($str115$Running_experiments___, thread);
                utilities_macros.$progress_start_time$.bind(Time.get_universal_time(), thread);
                utilities_macros.$progress_total$.bind(Sequences.length(query_specs), thread);
                utilities_macros.$progress_sofar$.bind(ZERO_INTEGER, thread);
                utilities_macros.$last_percent_progress_index$.bind(ZERO_INTEGER, thread);
                utilities_macros.$last_percent_progress_prediction$.bind(NIL, thread);
                utilities_macros.$within_noting_percent_progress$.bind(T, thread);
                utilities_macros.$percent_progress_start_time$.bind(Time.get_universal_time(), thread);
                try {
                    utilities_macros.noting_percent_progress_preamble(utilities_macros.$progress_note$.getDynamicValue(thread));
                    SubLObject csome_list_var = query_specs;
                    SubLObject query_spec = NIL;
                    query_spec = csome_list_var.first();
                    while (NIL != csome_list_var) {
                        SubLObject timed_outP = NIL;
                        SubLObject ignore_errors_tag = NIL;
                        try {
                            thread.throwStack.push($IGNORE_ERRORS_TARGET);
                            SubLObject _prev_bind_0_$15 = Errors.$error_handler$.currentBinding(thread);
                            try {
                                Errors.$error_handler$.bind(Symbols.symbol_function($sym102$IGNORE_ERRORS_HANDLER), thread);
                                try {
                                    SubLObject tag = subl_macro_promotions.with_timeout_make_tag();
                                    try {
                                        thread.throwStack.push(tag);
                                        SubLObject _prev_bind_0_$16 = subl_macro_promotions.$within_with_timeout$.currentBinding(thread);
                                        try {
                                            subl_macro_promotions.$within_with_timeout$.bind(T, thread);
                                            SubLObject timer = NIL;
                                            try {
                                                SubLObject _prev_bind_0_$17 = subl_macro_promotions.$with_timeout_nesting_depth$.currentBinding(thread);
                                                try {
                                                    subl_macro_promotions.$with_timeout_nesting_depth$.bind(Numbers.add(ONE_INTEGER, subl_macro_promotions.$with_timeout_nesting_depth$.getDynamicValue(thread)), thread);
                                                    timer = subl_macro_promotions.with_timeout_start_timer(kbq_query_run.$kbq_default_outlier_timeout$.getGlobalValue(), tag);
                                                    run_and_save_one_proof_spec_experiment(stream_$14, query_spec, overriding_query_properties);
                                                } finally {
                                                    subl_macro_promotions.$with_timeout_nesting_depth$.rebind(_prev_bind_0_$17, thread);
                                                }
                                            } finally {
                                                SubLObject _prev_bind_0_$18 = Threads.$is_thread_performing_cleanupP$.currentBinding(thread);
                                                try {
                                                    Threads.$is_thread_performing_cleanupP$.bind(T, thread);
                                                    SubLObject _values = Values.getValuesAsVector();
                                                    subl_macro_promotions.with_timeout_stop_timer(timer);
                                                    Values.restoreValuesFromVector(_values);
                                                } finally {
                                                    Threads.$is_thread_performing_cleanupP$.rebind(_prev_bind_0_$18, thread);
                                                }
                                            }
                                        } finally {
                                            subl_macro_promotions.$within_with_timeout$.rebind(_prev_bind_0_$16, thread);
                                        }
                                    } catch (Throwable ccatch_env_var) {
                                        timed_outP = Errors.handleThrowable(ccatch_env_var, tag);
                                    } finally {
                                        thread.throwStack.pop();
                                    }
                                } catch (Throwable catch_var) {
                                    Errors.handleThrowable(catch_var, NIL);
                                }
                            } finally {
                                Errors.$error_handler$.rebind(_prev_bind_0_$15, thread);
                            }
                        } catch (Throwable ccatch_env_var2) {
                            ignore_errors_tag = Errors.handleThrowable(ccatch_env_var2, $IGNORE_ERRORS_TARGET);
                        } finally {
                            thread.throwStack.pop();
                        }
                        if (NIL != timed_outP) {
                            Errors.warn($str116$Timeout___s, query_spec);
                        }
                        utilities_macros.$progress_sofar$.setDynamicValue(Numbers.add(utilities_macros.$progress_sofar$.getDynamicValue(thread), ONE_INTEGER), thread);
                        utilities_macros.note_percent_progress(utilities_macros.$progress_sofar$.getDynamicValue(thread), utilities_macros.$progress_total$.getDynamicValue(thread));
                        csome_list_var = csome_list_var.rest();
                        query_spec = csome_list_var.first();
                    }
                } finally {
                    SubLObject _prev_bind_0_$19 = Threads.$is_thread_performing_cleanupP$.currentBinding(thread);
                    try {
                        Threads.$is_thread_performing_cleanupP$.bind(T, thread);
                        SubLObject _values2 = Values.getValuesAsVector();
                        utilities_macros.noting_percent_progress_postamble();
                        Values.restoreValuesFromVector(_values2);
                    } finally {
                        Threads.$is_thread_performing_cleanupP$.rebind(_prev_bind_0_$19, thread);
                    }
                }
            } finally {
                utilities_macros.$percent_progress_start_time$.rebind(_prev_bind_9, thread);
                utilities_macros.$within_noting_percent_progress$.rebind(_prev_bind_8, thread);
                utilities_macros.$last_percent_progress_prediction$.rebind(_prev_bind_7, thread);
                utilities_macros.$last_percent_progress_index$.rebind(_prev_bind_6, thread);
                utilities_macros.$progress_sofar$.rebind(_prev_bind_5, thread);
                utilities_macros.$progress_total$.rebind(_prev_bind_4, thread);
                utilities_macros.$progress_start_time$.rebind(_prev_bind_3, thread);
                utilities_macros.$progress_note$.rebind(_prev_bind_2, thread);
            }
        } finally {
            SubLObject _prev_bind_10 = Threads.$is_thread_performing_cleanupP$.currentBinding(thread);
            try {
                Threads.$is_thread_performing_cleanupP$.bind(T, thread);
                SubLObject _values3 = Values.getValuesAsVector();
                if (stream.isStream()) {
                    streams_high.close(stream, UNPROVIDED);
                }
                Values.restoreValuesFromVector(_values3);
            } finally {
                Threads.$is_thread_performing_cleanupP$.rebind(_prev_bind_10, thread);
            }
        }
        return output_filename;
    }

    @SubL(source = "cycl/inference/harness/inference-proof-spec.lisp", position = 56500L)
    public static SubLObject run_and_save_one_proof_spec_experiment(SubLObject stream, SubLObject query_spec, SubLObject overriding_query_properties) {
        if (overriding_query_properties == UNPROVIDED) {
            overriding_query_properties = NIL;
        }
        SubLThread thread = SubLProcess.currentSubLThread();
        thread.resetMultipleValues();
        SubLObject metrics_1 = experiment_run_proof_spec_for_kbq(query_spec, overriding_query_properties);
        SubLObject metrics_2 = thread.secondMultipleValue();
        SubLObject halt_reason_1 = thread.thirdMultipleValue();
        SubLObject halt_reason_2 = thread.fourthMultipleValue();
        thread.resetMultipleValues();
        SubLObject current;
        SubLObject datum = current = metrics_1;
        SubLObject proof_spec_1 = NIL;
        SubLObject time_to_first_answer_1 = NIL;
        SubLObject total_time_1 = NIL;
        SubLObject time_per_answer_1 = NIL;
        SubLObject time_to_last_answer_1 = NIL;
        SubLObject tactic_count_1 = NIL;
        SubLObject executed_tactic_count_1 = NIL;
        SubLObject answer_count_1 = NIL;
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, $list117);
        proof_spec_1 = current.first();
        current = current.rest();
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, $list117);
        time_to_first_answer_1 = current.first();
        current = current.rest();
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, $list117);
        total_time_1 = current.first();
        current = current.rest();
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, $list117);
        time_per_answer_1 = current.first();
        current = current.rest();
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, $list117);
        time_to_last_answer_1 = current.first();
        current = current.rest();
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, $list117);
        tactic_count_1 = current.first();
        current = current.rest();
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, $list117);
        executed_tactic_count_1 = current.first();
        current = current.rest();
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, $list117);
        answer_count_1 = current.first();
        current = current.rest();
        if (NIL == current) {
            SubLObject current_$21;
            SubLObject datum_$20 = current_$21 = metrics_2;
            SubLObject time_to_first_answer_2 = NIL;
            SubLObject total_time_2 = NIL;
            SubLObject time_per_answer_2 = NIL;
            SubLObject time_to_last_answer_2 = NIL;
            SubLObject tactic_count_2 = NIL;
            SubLObject executed_tactic_count_2 = NIL;
            SubLObject answer_count_2 = NIL;
            cdestructuring_bind.destructuring_bind_must_consp(current_$21, datum_$20, $list118);
            time_to_first_answer_2 = current_$21.first();
            current_$21 = current_$21.rest();
            cdestructuring_bind.destructuring_bind_must_consp(current_$21, datum_$20, $list118);
            total_time_2 = current_$21.first();
            current_$21 = current_$21.rest();
            cdestructuring_bind.destructuring_bind_must_consp(current_$21, datum_$20, $list118);
            time_per_answer_2 = current_$21.first();
            current_$21 = current_$21.rest();
            cdestructuring_bind.destructuring_bind_must_consp(current_$21, datum_$20, $list118);
            time_to_last_answer_2 = current_$21.first();
            current_$21 = current_$21.rest();
            cdestructuring_bind.destructuring_bind_must_consp(current_$21, datum_$20, $list118);
            tactic_count_2 = current_$21.first();
            current_$21 = current_$21.rest();
            cdestructuring_bind.destructuring_bind_must_consp(current_$21, datum_$20, $list118);
            executed_tactic_count_2 = current_$21.first();
            current_$21 = current_$21.rest();
            cdestructuring_bind.destructuring_bind_must_consp(current_$21, datum_$20, $list118);
            answer_count_2 = current_$21.first();
            current_$21 = current_$21.rest();
            if (NIL == current_$21) {
                SubLObject datum_$21 = list(new SubLObject[] { time_to_first_answer_1, total_time_1, time_per_answer_1, time_to_last_answer_1, tactic_count_1, executed_tactic_count_1, answer_count_1, halt_reason_1, time_to_first_answer_2, total_time_2, time_per_answer_2, time_to_last_answer_2,
                        tactic_count_2, executed_tactic_count_2, answer_count_2, halt_reason_2 });
                cfasl.cfasl_output_externalized(datum_$21, stream);
                streams_high.force_output(stream);
                return datum_$21;
            }
            cdestructuring_bind.cdestructuring_bind_error(datum_$20, $list118);
        } else {
            cdestructuring_bind.cdestructuring_bind_error(datum, $list117);
        }
        return NIL;
    }

    @SubL(source = "cycl/inference/harness/inference-proof-spec.lisp", position = 57600L)
    public static SubLObject load_proof_spec_experiment(SubLObject filename) {
        SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject data = NIL;
        SubLObject stream = NIL;
        try {
            SubLObject _prev_bind_0 = stream_macros.$stream_requires_locking$.currentBinding(thread);
            try {
                stream_macros.$stream_requires_locking$.bind(NIL, thread);
                stream = compatibility.open_binary(filename, $INPUT);
            } finally {
                stream_macros.$stream_requires_locking$.rebind(_prev_bind_0, thread);
            }
            if (!stream.isStream()) {
                Errors.error($str110$Unable_to_open__S, filename);
            }
            SubLObject stream_$23 = stream;
            SubLObject datum = NIL;
            while ($EOF != datum) {
                datum = cfasl.cfasl_input(stream_$23, NIL, $EOF);
                if ($EOF != datum) {
                    data = cons(datum, data);
                }
            }
        } finally {
            SubLObject _prev_bind_2 = Threads.$is_thread_performing_cleanupP$.currentBinding(thread);
            try {
                Threads.$is_thread_performing_cleanupP$.bind(T, thread);
                SubLObject _values = Values.getValuesAsVector();
                if (stream.isStream()) {
                    streams_high.close(stream, UNPROVIDED);
                }
                Values.restoreValuesFromVector(_values);
            } finally {
                Threads.$is_thread_performing_cleanupP$.rebind(_prev_bind_2, thread);
            }
        }
        return Sequences.nreverse(data);
    }

    @SubL(source = "cycl/inference/harness/inference-proof-spec.lisp", position = 58200L)
    public static SubLObject proof_spec_data_metric_positions(SubLObject metric) {
        if (metric.eql($TIME_TO_FIRST_ANSWER)) {
            return Values.values(ZERO_INTEGER, EIGHT_INTEGER);
        }
        if (metric.eql($TOTAL_TIME)) {
            return Values.values(ONE_INTEGER, NINE_INTEGER);
        }
        if (metric.eql($TIME_PER_ANSWER)) {
            return Values.values(TWO_INTEGER, TEN_INTEGER);
        }
        if (metric.eql($TIME_TO_LAST_ANSWER)) {
            return Values.values(THREE_INTEGER, ELEVEN_INTEGER);
        }
        if (metric.eql($TACTIC_COUNT)) {
            return Values.values(FOUR_INTEGER, TWELVE_INTEGER);
        }
        if (metric.eql($EXECUTED_TACTIC_COUNT)) {
            return Values.values(FIVE_INTEGER, THIRTEEN_INTEGER);
        }
        if (metric.eql($ANSWER_COUNT)) {
            return Values.values(SIX_INTEGER, FOURTEEN_INTEGER);
        }
        if (metric.eql($HALT_REASON)) {
            return Values.values(SEVEN_INTEGER, FIFTEEN_INTEGER);
        }
        return Errors.error($str128$unhandled_metric__s, metric);
    }

    @SubL(source = "cycl/inference/harness/inference-proof-spec.lisp", position = 58700L)
    public static SubLObject proof_spec_data_lookup(SubLObject datum, SubLObject metric) {
        SubLThread thread = SubLProcess.currentSubLThread();
        thread.resetMultipleValues();
        SubLObject baseline_pos = proof_spec_data_metric_positions(metric);
        SubLObject proof_spec_pos = thread.secondMultipleValue();
        thread.resetMultipleValues();
        return Values.values(nth(baseline_pos, datum), nth(proof_spec_pos, datum));
    }

    @SubL(source = "cycl/inference/harness/inference-proof-spec.lisp", position = 58900L)
    public static SubLObject analyze_proof_spec_experiment_answerability(SubLObject filename) {
        SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject dict = dictionary.new_dictionary(Symbols.symbol_function(EQL), UNPROVIDED);
        SubLObject data = load_proof_spec_experiment(filename);
        if (data.isCons()) {
            SubLObject cdolist_list_var = data;
            SubLObject datum = NIL;
            datum = cdolist_list_var.first();
            while (NIL != cdolist_list_var) {
                thread.resetMultipleValues();
                SubLObject baseline_answer_count = proof_spec_data_lookup(datum, $ANSWER_COUNT);
                SubLObject proof_spec_answer_count = thread.secondMultipleValue();
                thread.resetMultipleValues();
                SubLObject baseline_answerableP = subl_promotions.positive_integer_p(baseline_answer_count);
                SubLObject proof_spec_answerableP = subl_promotions.positive_integer_p(proof_spec_answer_count);
                if (NIL != baseline_answerableP) {
                    if (NIL != proof_spec_answerableP) {
                        dictionary_utilities.dictionary_increment(dict, $BOTH_ANSWERABLE, UNPROVIDED);
                    } else {
                        dictionary_utilities.dictionary_increment(dict, $ONLY_BASELINE_ANSWERABLE, UNPROVIDED);
                    }
                } else if (NIL != proof_spec_answerableP) {
                    dictionary_utilities.dictionary_increment(dict, $ONLY_PROOF_SPEC_ANSWERABLE, UNPROVIDED);
                } else {
                    dictionary_utilities.dictionary_increment(dict, $NEITHER_ANSWERABLE, UNPROVIDED);
                }
                cdolist_list_var = cdolist_list_var.rest();
                datum = cdolist_list_var.first();
            }
        }
        return dict;
    }

    @SubL(source = "cycl/inference/harness/inference-proof-spec.lisp", position = 59700L)
    public static SubLObject graph_proof_spec_experiment_metric(SubLObject filename, SubLObject metric, SubLObject plot_properties, SubLObject sort_by) {
        if (plot_properties == UNPROVIDED) {
            plot_properties = NIL;
        }
        if (sort_by == UNPROVIDED) {
            sort_by = NIL;
        }
        SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject data = load_proof_spec_experiment(filename);
        SubLObject baseline_values = NIL;
        SubLObject proof_spec_values = NIL;
        if (data.isCons()) {
            SubLObject cdolist_list_var = data;
            SubLObject datum = NIL;
            datum = cdolist_list_var.first();
            while (NIL != cdolist_list_var) {
                thread.resetMultipleValues();
                SubLObject baseline_answer_count = proof_spec_data_lookup(datum, $ANSWER_COUNT);
                SubLObject proof_spec_answer_count = thread.secondMultipleValue();
                thread.resetMultipleValues();
                SubLObject baseline_answerableP = subl_promotions.positive_integer_p(baseline_answer_count);
                SubLObject proof_spec_answerableP = subl_promotions.positive_integer_p(proof_spec_answer_count);
                if (NIL != baseline_answerableP && NIL != proof_spec_answerableP) {
                    thread.resetMultipleValues();
                    SubLObject baseline_value = proof_spec_data_lookup(datum, metric);
                    SubLObject proof_spec_value = thread.secondMultipleValue();
                    thread.resetMultipleValues();
                    baseline_values = cons(baseline_value, baseline_values);
                    proof_spec_values = cons(proof_spec_value, proof_spec_values);
                }
                cdolist_list_var = cdolist_list_var.rest();
                datum = cdolist_list_var.first();
            }
        }
        SubLObject pcase_var = sort_by;
        if (pcase_var.eql($BOTH)) {
            baseline_values = Sort.sort(baseline_values, Symbols.symbol_function($sym134$_), UNPROVIDED);
            proof_spec_values = Sort.sort(proof_spec_values, Symbols.symbol_function($sym134$_), UNPROVIDED);
        } else if (pcase_var.eql($BASELINE)) {
            SubLObject tuples = NIL;
            SubLObject baseline_value2 = NIL;
            SubLObject baseline_value_$24 = NIL;
            SubLObject proof_spec_value2 = NIL;
            SubLObject proof_spec_value_$25 = NIL;
            baseline_value2 = baseline_values;
            baseline_value_$24 = baseline_value2.first();
            proof_spec_value2 = proof_spec_values;
            proof_spec_value_$25 = proof_spec_value2.first();
            while (NIL != proof_spec_value2 || NIL != baseline_value2) {
                tuples = cons(cons(baseline_value_$24, proof_spec_value_$25), tuples);
                baseline_value2 = baseline_value2.rest();
                baseline_value_$24 = baseline_value2.first();
                proof_spec_value2 = proof_spec_value2.rest();
                proof_spec_value_$25 = proof_spec_value2.first();
            }
            tuples = Sort.sort(tuples, Symbols.symbol_function($sym134$_), Symbols.symbol_function($sym136$CAR));
            baseline_values = Mapping.mapcar(Symbols.symbol_function($sym136$CAR), tuples);
            proof_spec_values = Mapping.mapcar(Symbols.symbol_function($sym137$CDR), tuples);
        } else if (pcase_var.eql($EXPERIMENT)) {
            SubLObject tuples = NIL;
            SubLObject baseline_value2 = NIL;
            SubLObject baseline_value_$25 = NIL;
            SubLObject proof_spec_value2 = NIL;
            SubLObject proof_spec_value_$26 = NIL;
            baseline_value2 = baseline_values;
            baseline_value_$25 = baseline_value2.first();
            proof_spec_value2 = proof_spec_values;
            proof_spec_value_$26 = proof_spec_value2.first();
            while (NIL != proof_spec_value2 || NIL != baseline_value2) {
                tuples = cons(cons(baseline_value_$25, proof_spec_value_$26), tuples);
                baseline_value2 = baseline_value2.rest();
                baseline_value_$25 = baseline_value2.first();
                proof_spec_value2 = proof_spec_value2.rest();
                proof_spec_value_$26 = proof_spec_value2.first();
            }
            tuples = Sort.sort(tuples, Symbols.symbol_function($sym134$_), Symbols.symbol_function($sym137$CDR));
            baseline_values = Mapping.mapcar(Symbols.symbol_function($sym136$CAR), tuples);
            proof_spec_values = Mapping.mapcar(Symbols.symbol_function($sym137$CDR), tuples);
        } else {
            Errors.error($str139$unhandled_sort_by__s, sort_by);
        }
        SubLObject coordinates_list = Mapping.mapcar($sym140$COORDINATIFY, list(baseline_values, proof_spec_values));
        if (sort_by == $BOTH) {
            plot_generation.generate_lines_graph(coordinates_list, plot_properties);
        } else {
            plot_generation.generate_points_graph(coordinates_list, plot_properties);
        }
        return NIL;
    }

    @SubL(source = "cycl/inference/harness/inference-proof-spec.lisp", position = 61700L)
    public static SubLObject experiment_run_proof_spec_for_kbq(SubLObject query_spec, SubLObject overriding_query_properties) {
        if (overriding_query_properties == UNPROVIDED) {
            overriding_query_properties = NIL;
        }
        SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject sentence = kb_query.kbq_sentence(query_spec);
        SubLObject mt = kb_query.kbq_mt(query_spec);
        SubLObject v_properties = kb_query.kbq_query_properties(query_spec);
        v_properties = list_utilities.merge_plist(v_properties, overriding_query_properties);
        thread.resetMultipleValues();
        SubLObject fewer_answersP = test_proof_spec_for_query_int(sentence, mt, v_properties, $proof_spec_experiment_metrics$.getGlobalValue());
        SubLObject slowerP = thread.secondMultipleValue();
        SubLObject result_1 = thread.thirdMultipleValue();
        SubLObject result_2 = thread.fourthMultipleValue();
        SubLObject halt_reason_1 = thread.fifthMultipleValue();
        SubLObject halt_reason_2 = thread.sixthMultipleValue();
        SubLObject metrics_1 = thread.seventhMultipleValue();
        SubLObject metrics_2 = thread.eighthMultipleValue();
        thread.resetMultipleValues();
        return Values.values(metrics_1, metrics_2, halt_reason_1, halt_reason_2);
    }

    @SubL(source = "cycl/inference/harness/inference-proof-spec.lisp", position = 62400L)
    public static SubLObject test_proof_spec_for_kbq(SubLObject query_spec, SubLObject overriding_query_properties) {
        if (overriding_query_properties == UNPROVIDED) {
            overriding_query_properties = NIL;
        }
        SubLObject sentence = kb_query.kbq_sentence(query_spec);
        SubLObject mt = kb_query.kbq_mt(query_spec);
        SubLObject v_properties = kb_query.kbq_query_properties(query_spec);
        v_properties = list_utilities.merge_plist(v_properties, overriding_query_properties);
        return test_proof_spec_for_query(sentence, mt, v_properties);
    }

    @SubL(source = "cycl/inference/harness/inference-proof-spec.lisp", position = 62800L)
    public static SubLObject test_proof_spec_for_query(SubLObject sentence, SubLObject mt, SubLObject v_properties) {
        if (v_properties == UNPROVIDED) {
            v_properties = NIL;
        }
        SubLThread thread = SubLProcess.currentSubLThread();
        thread.resetMultipleValues();
        SubLObject fewer_answersP = test_proof_spec_for_query_int(sentence, mt, v_properties, $list141);
        SubLObject slowerP = thread.secondMultipleValue();
        SubLObject result_1 = thread.thirdMultipleValue();
        SubLObject result_2 = thread.fourthMultipleValue();
        SubLObject halt_reason_1 = thread.fifthMultipleValue();
        SubLObject halt_reason_2 = thread.sixthMultipleValue();
        SubLObject metrics_1 = thread.seventhMultipleValue();
        SubLObject metrics_2 = thread.eighthMultipleValue();
        thread.resetMultipleValues();
        SubLObject current;
        SubLObject datum = current = metrics_1;
        SubLObject proof_spec = NIL;
        SubLObject total_time_1 = NIL;
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, $list142);
        proof_spec = current.first();
        current = current.rest();
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, $list142);
        total_time_1 = current.first();
        current = current.rest();
        if (NIL == current) {
            SubLObject current_$29;
            SubLObject datum_$28 = current_$29 = metrics_2;
            SubLObject total_time_2 = NIL;
            cdestructuring_bind.destructuring_bind_must_consp(current_$29, datum_$28, $list143);
            total_time_2 = current_$29.first();
            current_$29 = current_$29.rest();
            if (NIL == current_$29) {
                if (!total_time_2.numLE(total_time_1)) {
                    slowerP = T;
                    Errors.warn($str144$Proof_spec_query_is_slower___s_vs, total_time_1, total_time_2);
                }
                return list(new SubLObject[] { fewer_answersP, slowerP, proof_spec, result_1, result_2, halt_reason_1, halt_reason_2, total_time_1, total_time_2 });
            }
            cdestructuring_bind.cdestructuring_bind_error(datum_$28, $list143);
        } else {
            cdestructuring_bind.cdestructuring_bind_error(datum, $list142);
        }
        return NIL;
    }

    @SubL(source = "cycl/inference/harness/inference-proof-spec.lisp", position = 63700L)
    public static SubLObject test_proof_spec_for_query_int(SubLObject sentence, SubLObject mt, SubLObject v_properties, SubLObject metrics) {
        SubLThread thread = SubLProcess.currentSubLThread();
        v_properties = conses_high.putf(conses_high.copy_list(v_properties), $METRICS, cons($INFERENCE_PROOF_SPEC, metrics));
        thread.resetMultipleValues();
        SubLObject result_1 = inference_kernel.new_cyc_query(sentence, mt, v_properties);
        SubLObject halt_reason_1 = thread.secondMultipleValue();
        SubLObject inference_1 = thread.thirdMultipleValue();
        SubLObject metrics_1 = thread.fourthMultipleValue();
        thread.resetMultipleValues();
        SubLObject proof_spec = metrics_1.first();
        SubLObject some_new_properties = query_parameters_from_proof_spec(proof_spec);
        SubLObject new_properties = list_utilities.merge_plist(v_properties, some_new_properties);
        new_properties = conses_high.putf(conses_high.copy_list(new_properties), $METRICS, metrics);
        thread.resetMultipleValues();
        SubLObject result_2 = inference_kernel.new_cyc_query(sentence, mt, new_properties);
        SubLObject halt_reason_2 = thread.secondMultipleValue();
        SubLObject inference_2 = thread.thirdMultipleValue();
        SubLObject metrics_2 = thread.fourthMultipleValue();
        thread.resetMultipleValues();
        thread.resetMultipleValues();
        SubLObject answers_only_in_1 = bindings.compare_lists_of_binding_lists(result_1, result_2);
        SubLObject answers_only_in_2 = thread.secondMultipleValue();
        thread.resetMultipleValues();
        SubLObject fewer_answersP = NIL;
        SubLObject slowerP = NIL;
        if (NIL != answers_only_in_1) {
            fewer_answersP = T;
            Errors.warn($str145$Proof_spec_query_failed_to_get__s, answers_only_in_1);
        }
        if (NIL != answers_only_in_2) {
            Errors.warn($str146$Proof_spec_query_got_additional_a, answers_only_in_2);
        }
        inference_datastructures_inference.destroy_inference_and_problem_store(inference_1);
        inference_datastructures_inference.destroy_inference_and_problem_store(inference_2);
        return Values.values(fewer_answersP, slowerP, result_1, result_2, halt_reason_1, halt_reason_2, metrics_1, metrics_2);
    }

    @SubL(source = "cycl/inference/harness/inference-proof-spec.lisp", position = 65000L)
    public static SubLObject retest_proof_spec_for_kbq(SubLObject query_spec, SubLObject output) {
        SubLObject sentence = kb_query.kbq_sentence(query_spec);
        SubLObject mt = kb_query.kbq_mt(query_spec);
        SubLObject v_properties = kb_query.kbq_query_properties(query_spec);
        return retest_proof_spec_for_query(sentence, mt, v_properties, output);
    }

    @SubL(source = "cycl/inference/harness/inference-proof-spec.lisp", position = 65400L)
    public static SubLObject retest_proof_spec_for_query(SubLObject sentence, SubLObject mt, SubLObject v_properties, SubLObject output) {
        SubLObject fewer_answersP = NIL;
        SubLObject slowerP = NIL;
        SubLObject proof_spec = NIL;
        SubLObject result_1 = NIL;
        SubLObject result_2 = NIL;
        SubLObject halt_reason_1 = NIL;
        SubLObject halt_reason_2 = NIL;
        SubLObject total_time_1 = NIL;
        SubLObject total_time_2 = NIL;
        cdestructuring_bind.destructuring_bind_must_consp(output, output, $list147);
        fewer_answersP = output.first();
        SubLObject current = output.rest();
        cdestructuring_bind.destructuring_bind_must_consp(current, output, $list147);
        slowerP = current.first();
        current = current.rest();
        cdestructuring_bind.destructuring_bind_must_consp(current, output, $list147);
        proof_spec = current.first();
        current = current.rest();
        cdestructuring_bind.destructuring_bind_must_consp(current, output, $list147);
        result_1 = current.first();
        current = current.rest();
        cdestructuring_bind.destructuring_bind_must_consp(current, output, $list147);
        result_2 = current.first();
        current = current.rest();
        cdestructuring_bind.destructuring_bind_must_consp(current, output, $list147);
        halt_reason_1 = current.first();
        current = current.rest();
        cdestructuring_bind.destructuring_bind_must_consp(current, output, $list147);
        halt_reason_2 = current.first();
        current = current.rest();
        cdestructuring_bind.destructuring_bind_must_consp(current, output, $list147);
        total_time_1 = current.first();
        current = current.rest();
        cdestructuring_bind.destructuring_bind_must_consp(current, output, $list147);
        total_time_2 = current.first();
        current = current.rest();
        if (NIL == current) {
            SubLObject some_new_properties = query_parameters_from_proof_spec(proof_spec);
            SubLObject new_properties = list_utilities.merge_plist(v_properties, some_new_properties);
            new_properties = conses_high.putf(conses_high.copy_list(new_properties), $BROWSABLE_, T);
            return inference_kernel.new_cyc_query(sentence, mt, new_properties);
        }
        cdestructuring_bind.cdestructuring_bind_error(output, $list147);
        return NIL;
    }

    @SubL(source = "cycl/inference/harness/inference-proof-spec.lisp", position = 66200L)
    public static SubLObject test_inference_proof_spec(SubLObject verbosity) {
        if (verbosity == UNPROVIDED) {
            verbosity = $TERSE;
        }
        SubLThread thread = SubLProcess.currentSubLThread();
        generic_testing.run_test_case_table($sym149$TEST_QUERY_FIRST_PROOF_SPEC, StreamsLow.$standard_output$.getDynamicValue(thread), verbosity, UNPROVIDED);
        generic_testing.run_test_case_table($sym63$MERGE_2_PROOF_SPECS, StreamsLow.$standard_output$.getDynamicValue(thread), verbosity, UNPROVIDED);
        return NIL;
    }

    @SubL(source = "cycl/inference/harness/inference-proof-spec.lisp", position = 66500L)
    public static SubLObject test_query_first_proof_spec(SubLObject query) {
        SubLThread thread = SubLProcess.currentSubLThread();
        thread.resetMultipleValues();
        SubLObject result = inference_kernel.new_cyc_query(query, $$EverythingPSC, $list151);
        SubLObject halt_reason = thread.secondMultipleValue();
        SubLObject inference = thread.thirdMultipleValue();
        SubLObject metrics = thread.fourthMultipleValue();
        thread.resetMultipleValues();
        inference_datastructures_inference.destroy_inference(inference);
        return variables.uncanonicalize_hl_vars(list_utilities.only_one(metrics).first());
    }

    public static SubLObject declare_inference_proof_spec_file() {
        declareFunction("proof_spec_p", "PROOF-SPEC-P", 1, 0, false);
        declareFunction("structural_proof_spec_p", "STRUCTURAL-PROOF-SPEC-P", 1, 0, false);
        declareFunction("union_proof_spec_p", "UNION-PROOF-SPEC-P", 1, 0, false);
        declareFunction("join_proof_spec_p", "JOIN-PROOF-SPEC-P", 1, 0, false);
        declareFunction("split_proof_spec_p", "SPLIT-PROOF-SPEC-P", 1, 0, false);
        declareFunction("restriction_proof_spec_p", "RESTRICTION-PROOF-SPEC-P", 1, 0, false);
        declareFunction("join_ordered_proof_spec_p", "JOIN-ORDERED-PROOF-SPEC-P", 1, 0, false);
        declareFunction("content_proof_spec_p", "CONTENT-PROOF-SPEC-P", 1, 0, false);
        declareFunction("removal_proof_spec_p", "REMOVAL-PROOF-SPEC-P", 1, 0, false);
        declareFunction("conjunctive_removal_proof_spec_p", "CONJUNCTIVE-REMOVAL-PROOF-SPEC-P", 1, 0, false);
        declareFunction("transformation_proof_spec_p", "TRANSFORMATION-PROOF-SPEC-P", 1, 0, false);
        declareFunction("residual_transformation_proof_spec_p", "RESIDUAL-TRANSFORMATION-PROOF-SPEC-P", 1, 0, false);
        declareFunction("rewrite_proof_spec_p", "REWRITE-PROOF-SPEC-P", 1, 0, false);
        declareFunction("removal_module_spec_p", "REMOVAL-MODULE-SPEC-P", 1, 0, false);
        declareFunction("conjunctive_removal_module_spec_p", "CONJUNCTIVE-REMOVAL-MODULE-SPEC-P", 1, 0, false);
        declareFunction("transformation_module_spec_p", "TRANSFORMATION-MODULE-SPEC-P", 1, 0, false);
        declareFunction("literal_spec_p", "LITERAL-SPEC-P", 1, 0, false);
        declareFunction("single_literal_proof_spec_p", "SINGLE-LITERAL-PROOF-SPEC-P", 1, 0, false);
        declareFunction("removal_module_name_p", "REMOVAL-MODULE-NAME-P", 1, 0, false);
        declareFunction("conjunctive_removal_module_name_p", "CONJUNCTIVE-REMOVAL-MODULE-NAME-P", 1, 0, false);
        declareFunction("transformation_module_name_p", "TRANSFORMATION-MODULE-NAME-P", 1, 0, false);
        declareFunction("proof_spec_or_nothing_p", "PROOF-SPEC-OR-NOTHING-P", 1, 0, false);
        declareFunction("transformation_proof_rule_p", "TRANSFORMATION-PROOF-RULE-P", 1, 0, false);
        declareFunction("transformational_proof_spec_p", "TRANSFORMATIONAL-PROOF-SPEC-P", 2, 0, false);
        declareFunction("branching_proof_spec_p", "BRANCHING-PROOF-SPEC-P", 2, 0, false);
        declareFunction("inference_module_spec_p", "INFERENCE-MODULE-SPEC-P", 3, 0, false);
        declareFunction("negated_module_spec_p", "NEGATED-MODULE-SPEC-P", 2, 0, false);
        declareFunction("conjunctive_module_spec_p", "CONJUNCTIVE-MODULE-SPEC-P", 2, 0, false);
        declareFunction("disjunctive_module_spec_p", "DISJUNCTIVE-MODULE-SPEC-P", 2, 0, false);
        declareFunction("single_literal_proof_spec_hl_sentence", "SINGLE-LITERAL-PROOF-SPEC-HL-SENTENCE", 1, 0, false);
        declareFunction("restriction_proof_spec_restricted_proof_spec", "RESTRICTION-PROOF-SPEC-RESTRICTED-PROOF-SPEC", 1, 0, false);
        declareFunction("join_ordered_proof_spec_non_focal_proof_spec", "JOIN-ORDERED-PROOF-SPEC-NON-FOCAL-PROOF-SPEC", 1, 0, false);
        declareFunction("split_proof_spec_sub_proof_specs", "SPLIT-PROOF-SPEC-SUB-PROOF-SPECS", 1, 0, false);
        declareFunction("join_ordered_proof_spec_focal_proof_spec", "JOIN-ORDERED-PROOF-SPEC-FOCAL-PROOF-SPEC", 1, 0, false);
        declareFunction("union_proof_spec_disjunct_proof_spec", "UNION-PROOF-SPEC-DISJUNCT-PROOF-SPEC", 1, 0, false);
        declareFunction("join_ordered_focal_proof_spec_pattern", "JOIN-ORDERED-FOCAL-PROOF-SPEC-PATTERN", 1, 0, false);
        declareFunction("transformation_proof_spec_rule", "TRANSFORMATION-PROOF-SPEC-RULE", 1, 0, false);
        declareFunction("transformation_proof_spec_supporting_proof_spec", "TRANSFORMATION-PROOF-SPEC-SUPPORTING-PROOF-SPEC", 1, 0, false);
        declareFunction("residual_transformation_proof_spec_rule", "RESIDUAL-TRANSFORMATION-PROOF-SPEC-RULE", 1, 0, false);
        declareFunction("residual_transformation_proof_spec_supporting_proof_spec", "RESIDUAL-TRANSFORMATION-PROOF-SPEC-SUPPORTING-PROOF-SPEC", 1, 0, false);
        declareFunction("proof_spec_literal_spec", "PROOF-SPEC-LITERAL-SPEC", 1, 0, false);
        declareFunction("join_ordered_proof_spec_from_residual_transformation_proof_spec", "JOIN-ORDERED-PROOF-SPEC-FROM-RESIDUAL-TRANSFORMATION-PROOF-SPEC", 1, 0, false);
        declareFunction("filter_proof_specs_of_type", "FILTER-PROOF-SPECS-OF-TYPE", 2, 0, false);
        declareFunction("compute_proof_spec", "COMPUTE-PROOF-SPEC", 1, 0, false);
        declareFunction("compute_proof_spec_recursive", "COMPUTE-PROOF-SPEC-RECURSIVE", 1, 0, false);
        declareFunction("compute_removal_proof_spec", "COMPUTE-REMOVAL-PROOF-SPEC", 1, 0, false);
        declareFunction("compute_transformation_proof_spec", "COMPUTE-TRANSFORMATION-PROOF-SPEC", 1, 0, false);
        declareFunction("compute_rewrite_proof_spec", "COMPUTE-REWRITE-PROOF-SPEC", 1, 0, false);
        declareFunction("compute_residual_transformation_proof_spec", "COMPUTE-RESIDUAL-TRANSFORMATION-PROOF-SPEC", 1, 0, false);
        declareFunction("conjunctive_removal_restriction_proof_p", "CONJUNCTIVE-REMOVAL-RESTRICTION-PROOF-P", 1, 0, false);
        declareFunction("compute_conjunctive_removal_restriction_proof_spec", "COMPUTE-CONJUNCTIVE-REMOVAL-RESTRICTION-PROOF-SPEC", 1, 0, false);
        declareFunction("extract_single_literal_proof_info_for_proof_spec", "EXTRACT-SINGLE-LITERAL-PROOF-INFO-FOR-PROOF-SPEC", 1, 0, false);
        declareFunction("compute_structural_proof_spec", "COMPUTE-STRUCTURAL-PROOF-SPEC", 1, 0, false);
        declareFunction("inference_proof_spec", "INFERENCE-PROOF-SPEC", 1, 0, false);
        declareFunction("inference_first_answer_proof_spec", "INFERENCE-FIRST-ANSWER-PROOF-SPEC", 1, 0, false);
        declareFunction("inference_all_answer_proof_specs", "INFERENCE-ALL-ANSWER-PROOF-SPECS", 1, 0, false);
        declareFunction("failed_inference_proof_spec", "FAILED-INFERENCE-PROOF-SPEC", 1, 0, false);
        declareFunction("root_problem_has_top_level_disjunctP", "ROOT-PROBLEM-HAS-TOP-LEVEL-DISJUNCT?", 1, 0, false);
        declareMacro("with_failed_proof_spec_for_object", "WITH-FAILED-PROOF-SPEC-FOR-OBJECT");
        declareFunction("failed_inference_union_problem_proof_spec", "FAILED-INFERENCE-UNION-PROBLEM-PROOF-SPEC", 2, 0, false);
        declareFunction("failed_inference_problem_proof_spec", "FAILED-INFERENCE-PROBLEM-PROOF-SPEC", 2, 0, false);
        declareFunction("failed_inference_link_proof_spec", "FAILED-INFERENCE-LINK-PROOF-SPEC", 2, 0, false);
        declareFunction("problem_link_tactic_executedP", "PROBLEM-LINK-TACTIC-EXECUTED?", 1, 0, false);
        declareFunction("possibly_tactic_executedP", "POSSIBLY-TACTIC-EXECUTED?", 1, 0, false);
        declareFunction("failed_inference_removal_link_proof_spec", "FAILED-INFERENCE-REMOVAL-LINK-PROOF-SPEC", 2, 0, false);
        declareFunction("failed_inference_rewrite_link_proof_spec", "FAILED-INFERENCE-REWRITE-LINK-PROOF-SPEC", 2, 0, false);
        declareFunction("failed_inference_transformation_link_proof_spec", "FAILED-INFERENCE-TRANSFORMATION-LINK-PROOF-SPEC", 2, 0, false);
        declareFunction("failed_inference_answer_link_proof_spec", "FAILED-INFERENCE-ANSWER-LINK-PROOF-SPEC", 2, 0, false);
        declareFunction("failed_inference_restriction_link_proof_spec", "FAILED-INFERENCE-RESTRICTION-LINK-PROOF-SPEC", 2, 0, false);
        declareFunction("failed_inference_split_link_proof_spec", "FAILED-INFERENCE-SPLIT-LINK-PROOF-SPEC", 2, 0, false);
        declareFunction("failed_inference_join_link_proof_spec", "FAILED-INFERENCE-JOIN-LINK-PROOF-SPEC", 2, 0, false);
        declareFunction("failed_inference_join_ordered_link_proof_spec", "FAILED-INFERENCE-JOIN-ORDERED-LINK-PROOF-SPEC", 2, 0, false);
        declareFunction("failed_inference_union_link_proof_spec", "FAILED-INFERENCE-UNION-LINK-PROOF-SPEC", 2, 0, false);
        declareFunction("failed_inference_residual_transformation_link_proof_spec", "FAILED-INFERENCE-RESIDUAL-TRANSFORMATION-LINK-PROOF-SPEC", 2, 0, false);
        declareFunction("failed_inference_tactic_proof_spec", "FAILED-INFERENCE-TACTIC-PROOF-SPEC", 2, 0, false);
        declareFunction("failed_inference_removal_tactic_proof_spec", "FAILED-INFERENCE-REMOVAL-TACTIC-PROOF-SPEC", 2, 0, false);
        declareFunction("failed_inference_split_tactic_proof_spec", "FAILED-INFERENCE-SPLIT-TACTIC-PROOF-SPEC", 2, 0, false);
        declareFunction("failed_inference_join_ordered_tactic_proof_spec", "FAILED-INFERENCE-JOIN-ORDERED-TACTIC-PROOF-SPEC", 2, 0, false);
        declareFunction("failed_inference_join_tactic_proof_spec", "FAILED-INFERENCE-JOIN-TACTIC-PROOF-SPEC", 2, 0, false);
        declareFunction("failed_inference_transformation_tactic_proof_spec", "FAILED-INFERENCE-TRANSFORMATION-TACTIC-PROOF-SPEC", 2, 0, false);
        declareFunction("failed_inference_rewrite_tactic_proof_spec", "FAILED-INFERENCE-REWRITE-TACTIC-PROOF-SPEC", 2, 0, false);
        declareFunction("failed_inference_restriction_tactic_proof_spec", "FAILED-INFERENCE-RESTRICTION-TACTIC-PROOF-SPEC", 2, 0, false);
        declareFunction("hl_asent_from_problem_query", "HL-ASENT-FROM-PROBLEM-QUERY", 1, 0, false);
        declareFunction("merge_proof_specs", "MERGE-PROOF-SPECS", 1, 0, false);
        declareFunction("merge_2_proof_specs", "MERGE-2-PROOF-SPECS", 2, 0, false);
        declareFunction("merge_into_or_pattern", "MERGE-INTO-OR-PATTERN", 2, 0, false);
        declareFunction("proof_specs_mergeable_wrt_typeP", "PROOF-SPECS-MERGEABLE-WRT-TYPE?", 2, 0, false);
        declareFunction("proof_spec_type", "PROOF-SPEC-TYPE", 1, 0, false);
        declareFunction("merge_removal_proof_specs", "MERGE-REMOVAL-PROOF-SPECS", 2, 0, false);
        declareFunction("merge_transformation_proof_specs", "MERGE-TRANSFORMATION-PROOF-SPECS", 2, 0, false);
        declareFunction("merge_residual_transformation_proof_specs", "MERGE-RESIDUAL-TRANSFORMATION-PROOF-SPECS", 2, 0, false);
        declareFunction("merge_generalized_transformation_proof_specs", "MERGE-GENERALIZED-TRANSFORMATION-PROOF-SPECS", 3, 0, false);
        declareFunction("merge_single_literal_formula_patterns", "MERGE-SINGLE-LITERAL-FORMULA-PATTERNS", 2, 0, false);
        declareFunction("destructure_single_literal_formula_pattern", "DESTRUCTURE-SINGLE-LITERAL-FORMULA-PATTERN", 1, 0, false);
        declareFunction("merge_content_spec_module_patterns", "MERGE-CONTENT-SPEC-MODULE-PATTERNS", 2, 0, false);
        declareFunction("make_or_pattern", "MAKE-OR-PATTERN", 2, 0, false);
        declareFunction("or_pattern_p", "OR-PATTERN-P", 1, 0, false);
        declareFunction("merge_proof_spec_terms", "MERGE-PROOF-SPEC-TERMS", 2, 0, false);
        declareFunction("merge_proof_spec_term", "MERGE-PROOF-SPEC-TERM", 2, 0, false);
        declareFunction("genericize_proof_spec", "GENERICIZE-PROOF-SPEC", 1, 0, false);
        declareFunction("genericize_content_proof_spec", "GENERICIZE-CONTENT-PROOF-SPEC", 1, 0, false);
        declareFunction("genericize_removal_proof_spec", "GENERICIZE-REMOVAL-PROOF-SPEC", 1, 0, false);
        declareFunction("genericize_transformation_proof_spec", "GENERICIZE-TRANSFORMATION-PROOF-SPEC", 1, 0, false);
        declareFunction("genericize_residual_transformation_proof_spec", "GENERICIZE-RESIDUAL-TRANSFORMATION-PROOF-SPEC", 1, 0, false);
        declareFunction("genericize_generalized_transformation_proof_spec", "GENERICIZE-GENERALIZED-TRANSFORMATION-PROOF-SPEC", 2, 0, false);
        declareFunction("genericize_single_literal_formula_pattern", "GENERICIZE-SINGLE-LITERAL-FORMULA-PATTERN", 1, 0, false);
        declareFunction("genericize_proof_spec_terms", "GENERICIZE-PROOF-SPEC-TERMS", 1, 0, false);
        declareFunction("genericize_proof_spec_term", "GENERICIZE-PROOF-SPEC-TERM", 1, 0, false);
        declareFunction("genericize_problem_query", "GENERICIZE-PROBLEM-QUERY", 1, 0, false);
        declareFunction("genericize_contextualized_clause", "GENERICIZE-CONTEXTUALIZED-CLAUSE", 1, 0, false);
        declareFunction("genericize_contextualized_asent", "GENERICIZE-CONTEXTUALIZED-ASENT", 1, 0, false);
        declareFunction("genericize_formula", "GENERICIZE-FORMULA", 1, 0, false);
        declareFunction("genericize_formula_args", "GENERICIZE-FORMULA-ARGS", 1, 0, false);
        declareFunction("genericize_term_wrt_pattern_match", "GENERICIZE-TERM-WRT-PATTERN-MATCH", 1, 0, false);
        declareFunction("proof_spec_possibly_admits_problemP", "PROOF-SPEC-POSSIBLY-ADMITS-PROBLEM?", 2, 0, false);
        declareFunction("query_parameters_from_proof_spec", "QUERY-PARAMETERS-FROM-PROOF-SPEC", 1, 0, false);
        declareFunction("query_allowance_parameters_from_proof_spec", "QUERY-ALLOWANCE-PARAMETERS-FROM-PROOF-SPEC", 1, 0, false);
        declareFunction("query_allowance_parameters_from_proof_spec_recursive", "QUERY-ALLOWANCE-PARAMETERS-FROM-PROOF-SPEC-RECURSIVE", 3, 0, false);
        declareFunction("module_parameters_from_module_pattern", "MODULE-PARAMETERS-FROM-MODULE-PATTERN", 2, 0, false);
        declareFunction("use_kbq_proof_spec_tableP", "USE-KBQ-PROOF-SPEC-TABLE?", 0, 0, false);
        declareFunction("initialize_kbq_proof_spec_table", "INITIALIZE-KBQ-PROOF-SPEC-TABLE", 1, 0, false);
        declareFunction("overriding_experimental_proof_spec_properties", "OVERRIDING-EXPERIMENTAL-PROOF-SPEC-PROPERTIES", 1, 0, false);
        declareFunction("initialize_kbq_proof_spec_table_from_query_set", "INITIALIZE-KBQ-PROOF-SPEC-TABLE-FROM-QUERY-SET", 1, 1, false);
        declareFunction("proof_spec_for_kbq", "PROOF-SPEC-FOR-KBQ", 1, 0, false);
        declareFunction("inference_results_for_kbq", "INFERENCE-RESULTS-FOR-KBQ", 1, 0, false);
        declareFunction("analyze_asked_queries_for_proof_spec_overlap", "ANALYZE-ASKED-QUERIES-FOR-PROOF-SPEC-OVERLAP", 1, 0, false);
        declareFunction("run_proof_spec_experiment", "RUN-PROOF-SPEC-EXPERIMENT", 2, 1, false);
        declareFunction("run_and_save_one_proof_spec_experiment", "RUN-AND-SAVE-ONE-PROOF-SPEC-EXPERIMENT", 2, 1, false);
        declareFunction("load_proof_spec_experiment", "LOAD-PROOF-SPEC-EXPERIMENT", 1, 0, false);
        declareFunction("proof_spec_data_metric_positions", "PROOF-SPEC-DATA-METRIC-POSITIONS", 1, 0, false);
        declareFunction("proof_spec_data_lookup", "PROOF-SPEC-DATA-LOOKUP", 2, 0, false);
        declareFunction("analyze_proof_spec_experiment_answerability", "ANALYZE-PROOF-SPEC-EXPERIMENT-ANSWERABILITY", 1, 0, false);
        declareFunction("graph_proof_spec_experiment_metric", "GRAPH-PROOF-SPEC-EXPERIMENT-METRIC", 2, 2, false);
        declareFunction("experiment_run_proof_spec_for_kbq", "EXPERIMENT-RUN-PROOF-SPEC-FOR-KBQ", 1, 1, false);
        declareFunction("test_proof_spec_for_kbq", "TEST-PROOF-SPEC-FOR-KBQ", 1, 1, false);
        declareFunction("test_proof_spec_for_query", "TEST-PROOF-SPEC-FOR-QUERY", 2, 1, false);
        declareFunction("test_proof_spec_for_query_int", "TEST-PROOF-SPEC-FOR-QUERY-INT", 4, 0, false);
        declareFunction("retest_proof_spec_for_kbq", "RETEST-PROOF-SPEC-FOR-KBQ", 2, 0, false);
        declareFunction("retest_proof_spec_for_query", "RETEST-PROOF-SPEC-FOR-QUERY", 4, 0, false);
        declareFunction("test_inference_proof_spec", "TEST-INFERENCE-PROOF-SPEC", 0, 1, false);
        declareFunction("test_query_first_proof_spec", "TEST-QUERY-FIRST-PROOF-SPEC", 1, 0, false);
        return NIL;
    }

    public static SubLObject init_inference_proof_spec_file() {
        $kbq_proof_spec_table$ = deflexical("*KBQ-PROOF-SPEC-TABLE*", maybeDefault($sym94$_KBQ_PROOF_SPEC_TABLE_, $kbq_proof_spec_table$, () -> (dictionary.new_dictionary(Symbols.symbol_function(EQL), UNPROVIDED))));
        $use_kbq_proof_spec_tableP$ = defparameter("*USE-KBQ-PROOF-SPEC-TABLE?*", NIL);
        $proof_spec_experiment_metrics$ = deflexical("*PROOF-SPEC-EXPERIMENT-METRICS*", $list119);
        return NIL;
    }

    public static SubLObject setup_inference_proof_spec_file() {
        subl_macro_promotions.declare_defglobal($sym94$_KBQ_PROOF_SPEC_TABLE_);
        generic_testing.define_test_case_table_int($sym149$TEST_QUERY_FIRST_PROOF_SPEC, list(new SubLObject[] { $TEST, Symbols.symbol_function(EQUAL), $OWNER, NIL, $CLASSES, NIL, $KB, $TINY, $WORKING_, T }), $list158);
        generic_testing.define_test_case_table_int($sym63$MERGE_2_PROOF_SPECS, list(new SubLObject[] { $TEST, Symbols.symbol_function(EQUAL), $OWNER, NIL, $CLASSES, NIL, $KB, $TINY, $WORKING_, T }), $list159);
        return NIL;
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
        me = new inference_proof_spec();
        $kbq_proof_spec_table$ = null;
        $use_kbq_proof_spec_tableP$ = null;
        $proof_spec_experiment_metrics$ = null;
        $ANYTHING = makeKeyword("ANYTHING");
        $NOTHING = makeKeyword("NOTHING");
        $OR = makeKeyword("OR");
        $sym3$PROOF_SPEC_P = makeSymbol("PROOF-SPEC-P");
        $UNION = makeKeyword("UNION");
        $JOIN = makeKeyword("JOIN");
        $SPLIT = makeKeyword("SPLIT");
        $RESTRICTION = makeKeyword("RESTRICTION");
        $JOIN_ORDERED = makeKeyword("JOIN-ORDERED");
        $REMOVAL = makeKeyword("REMOVAL");
        $CONJUNCTIVE_REMOVAL = makeKeyword("CONJUNCTIVE-REMOVAL");
        $TRANSFORMATION = makeKeyword("TRANSFORMATION");
        $RESIDUAL_TRANSFORMATION = makeKeyword("RESIDUAL-TRANSFORMATION");
        $REWRITE = makeKeyword("REWRITE");
        $sym14$REMOVAL_MODULE_NAME_P = makeSymbol("REMOVAL-MODULE-NAME-P");
        $sym15$REMOVAL_MODULE_SPEC_P = makeSymbol("REMOVAL-MODULE-SPEC-P");
        $sym16$CONJUNCTIVE_REMOVAL_MODULE_NAME_P = makeSymbol("CONJUNCTIVE-REMOVAL-MODULE-NAME-P");
        $sym17$CONJUNCTIVE_REMOVAL_MODULE_SPEC_P = makeSymbol("CONJUNCTIVE-REMOVAL-MODULE-SPEC-P");
        $sym18$TRANSFORMATION_MODULE_NAME_P = makeSymbol("TRANSFORMATION-MODULE-NAME-P");
        $sym19$TRANSFORMATION_MODULE_SPEC_P = makeSymbol("TRANSFORMATION-MODULE-SPEC-P");
        $$not = makeConstSym(("not"));
        $NOT = makeKeyword("NOT");
        $AND = makeKeyword("AND");
        $sym23$SINGLE_LITERAL_PROOF_SPEC_P = makeSymbol("SINGLE-LITERAL-PROOF-SPEC-P");
        $sym24$RESTRICTION_PROOF_SPEC_P = makeSymbol("RESTRICTION-PROOF-SPEC-P");
        $sym25$JOIN_ORDERED_PROOF_SPEC_P = makeSymbol("JOIN-ORDERED-PROOF-SPEC-P");
        $sym26$SPLIT_PROOF_SPEC_P = makeSymbol("SPLIT-PROOF-SPEC-P");
        $sym27$UNION_PROOF_SPEC_P = makeSymbol("UNION-PROOF-SPEC-P");
        $sym28$SECOND = makeSymbol("SECOND");
        $sym29$TRANSFORMATION_PROOF_SPEC_P = makeSymbol("TRANSFORMATION-PROOF-SPEC-P");
        $sym30$RESIDUAL_TRANSFORMATION_PROOF_SPEC_P = makeSymbol("RESIDUAL-TRANSFORMATION-PROOF-SPEC-P");
        $list31 = list(makeSymbol("RT-TOKEN"), makeSymbol("LITERAL-SPEC"), makeSymbol("TRANSFORMATION-MODULE-SPEC"), makeSymbol("RULE-SPEC"), makeSymbol("SUB-PROOF-SPEC"));
        $list32 = list(makeKeyword("NOTHING"));
        $list33 = list(makeSymbol("OPERATOR"), makeSymbol("&REST"), makeSymbol("SUB-PROOF-SPECS"));
        $list34 = list(makeSymbol("OPERATOR"), makeSymbol("&REST"), makeSymbol("SUB-RESULTS"));
        $sym35$PROOF_P = makeSymbol("PROOF-P");
        $str36$time_to_support__S_proofs = makeString("time to support ~S proofs");
        $sym37$STRUCTURAL_PROOF_P = makeSymbol("STRUCTURAL-PROOF-P");
        $sym38$INFERENCE_P = makeSymbol("INFERENCE-P");
        $list39 = list(list(makeSymbol("PROOF-SPEC"), makeSymbol("OBJECT"), makeSymbol("VISITED"), makeSymbol("&OPTIONAL"), list(makeSymbol("COMBINATOR"), makeKeyword("OR"))), makeSymbol("&BODY"), makeSymbol("BODY"));
        $sym40$CLET = makeSymbol("CLET");
        $sym41$SET_ADD = makeSymbol("SET-ADD");
        $sym42$PROGN = makeSymbol("PROGN");
        $sym43$CSETQ = makeSymbol("CSETQ");
        $sym44$DELETE = makeSymbol("DELETE");
        $IGNORE = makeKeyword("IGNORE");
        $sym46$PCOND = makeSymbol("PCOND");
        $sym47$NULL = makeSymbol("NULL");
        $list48 = list(makeKeyword("ANYTHING"));
        $sym49$SINGLETON_ = makeSymbol("SINGLETON?");
        $sym50$FIRST = makeSymbol("FIRST");
        $sym51$NREVERSE = makeSymbol("NREVERSE");
        $sym52$CPUSH = makeSymbol("CPUSH");
        $sym53$RET = makeSymbol("RET");
        $str54$Non_union_tactic__A_mixed_in_with = makeString("Non-union tactic ~A mixed in with union tactics at the top level.");
        $ANSWER = makeKeyword("ANSWER");
        $str56$Dont_know_how_to_handle_problem_l = makeString("Dont know how to handle problem link type ~A.");
        $str57$What_is_an_answer_link_doing_here = makeString("What is an answer link doing here????");
        $sym58$TACTIC_EXECUTED_ = makeSymbol("TACTIC-EXECUTED?");
        $str59$This_should_never_be_called_ = makeString("This should never be called.");
        $str60$This_should_only_occur_at_the_top = makeString("This should only occur at the top level.");
        $str61$Union_tactics_can_only_occur_at_t = makeString("Union tactics can only occur at the top level. Talk to the canonicalizer.");
        $str62$Dont_know_how_to_compute_the_proo = makeString("Dont know how to compute the proof-spec for tactic ~A.");
        $sym63$MERGE_2_PROOF_SPECS = makeSymbol("MERGE-2-PROOF-SPECS");
        $list64 = list(makeSymbol("FORMULA-PATTERN-1"), makeSymbol("MODULE-PATTERN-1"));
        $list65 = list(makeSymbol("FORMULA-PATTERN-2"), makeSymbol("MODULE-PATTERN-2"));
        $UNMERGEABLE = makeKeyword("UNMERGEABLE");
        $list67 = list(makeSymbol("FORMULA-PATTERN-1"), makeSymbol("MODULE-PATTERN-1"), makeSymbol("RULE-1"), makeSymbol("SUBSPEC-1"));
        $list68 = list(makeSymbol("FORMULA-PATTERN-2"), makeSymbol("MODULE-PATTERN-2"), makeSymbol("RULE-2"), makeSymbol("SUBSPEC-2"));
        $sym69$IST_SENTENCE_P = makeSymbol("IST-SENTENCE-P");
        $NEG = makeKeyword("NEG");
        $POS = makeKeyword("POS");
        $sym72$CONTENT_PROOF_SPEC_P = makeSymbol("CONTENT-PROOF-SPEC-P");
        $sym73$GENERICIZE_CONTENT_PROOF_SPEC = makeSymbol("GENERICIZE-CONTENT-PROOF-SPEC");
        $str74$Time_to_handle_proof_spec__s = makeString("Time to handle proof spec ~s");
        $list75 = list(makeSymbol("FORMULA-PATTERN"), makeSymbol("MODULE-PATTERN"));
        $list76 = list(makeSymbol("FORMULA-PATTERN"), makeSymbol("MODULE-PATTERN"), makeSymbol("RULE"), makeSymbol("SUBSPEC"));
        $FULLY_BOUND = makeKeyword("FULLY-BOUND");
        $list78 = list(makeSymbol("MT"), makeSymbol("ASENT"));
        $INTEGER = makeKeyword("INTEGER");
        $NUMBER = makeKeyword("NUMBER");
        $STRING = makeKeyword("STRING");
        $PROOF_SPEC = makeKeyword("PROOF-SPEC");
        $ALLOWED_MODULES = makeKeyword("ALLOWED-MODULES");
        $ALLOWED_RULES = makeKeyword("ALLOWED-RULES");
        $list85 = cons(makeSymbol("OR"), makeSymbol("SUB-SPECS"));
        $list86 = list(makeSymbol("REMOVAL"), makeSymbol("FORMULA-PATTERN"), makeSymbol("MODULE-PATTERN"));
        $list87 = list(makeSymbol("TRANSFORMATION"), makeSymbol("FORMULA-PATTERN"), makeSymbol("MODULE-PATTERN"), makeSymbol("RULE"), makeSymbol("SUB-SPEC"));
        $DETERMINE_NEW_TRANSFORMATION_TACTICS = makeKeyword("DETERMINE-NEW-TRANSFORMATION-TACTICS");
        $list89 = list(makeSymbol("RESIDUAL-TRANSFORMATION"), makeSymbol("FORMULA-PATTERN"), makeSymbol("MODULE-PATTERN"), makeSymbol("RULE"), makeSymbol("SUB-SPEC"));
        $list90 = cons(makeSymbol("STRUCTURAL"), makeSymbol("SUB-SPECS"));
        $list91 = list(makeKeyword("JOIN-ORDERED"), makeKeyword("JOIN"), makeKeyword("SPLIT"), makeKeyword("UNION"));
        $DETERMINE_NEW_SPLIT_TACTICS = makeKeyword("DETERMINE-NEW-SPLIT-TACTICS");
        $list93 = cons(makeSymbol("OR"), makeSymbol("SUB-PATTERNS"));
        $sym94$_KBQ_PROOF_SPEC_TABLE_ = makeSymbol("*KBQ-PROOF-SPEC-TABLE*");
        $INFERENCE_PROOF_SPEC = makeKeyword("INFERENCE-PROOF-SPEC");
        $str96$possibly_ill_formed_proof_spec___ = makeString("possibly ill-formed proof-spec: ~s");
        $list97 = list(makeKeyword("MAX-STEP"), ZERO_INTEGER);
        $$InferencePSC = makeConstSym(("InferencePSC"));
        $str99$Doing_inference_for_all_elements_ = makeString("Doing inference for all elements of KBQ query set ....");
        $str100$cdolist = makeString("cdolist");
        $IGNORE_ERRORS_TARGET = makeKeyword("IGNORE-ERRORS-TARGET");
        $sym102$IGNORE_ERRORS_HANDLER = makeSymbol("IGNORE-ERRORS-HANDLER", "SUBLISP");
        $METRICS = makeKeyword("METRICS");
        $list104 = list(makeKeyword("TOTAL-TIME"), makeKeyword("INFERENCE-PROOF-SPEC"));
        $BROWSABLE_ = makeKeyword("BROWSABLE?");
        $MAX_TIME = makeKeyword("MAX-TIME");
        $int$30 = makeInteger(30);
        $str108$___A___A__ = makeString("~&~A: ~A~%");
        $INPUT = makeKeyword("INPUT");
        $str110$Unable_to_open__S = makeString("Unable to open ~S");
        $EOF = makeKeyword("EOF");
        $str112$Read_invalid_query_info__s = makeString("Read invalid query info ~s");
        $list113 = list(makeSymbol("PROBLEM-QUERY"), makeSymbol("MT"), makeSymbol("PROPERTIES"));
        $OUTPUT = makeKeyword("OUTPUT");
        $str115$Running_experiments___ = makeString("Running experiments...");
        $str116$Timeout___s = makeString("Timeout: ~s");
        $list117 = list(makeSymbol("PROOF-SPEC-1"), makeSymbol("TIME-TO-FIRST-ANSWER-1"), makeSymbol("TOTAL-TIME-1"), makeSymbol("TIME-PER-ANSWER-1"), makeSymbol("TIME-TO-LAST-ANSWER-1"), makeSymbol("TACTIC-COUNT-1"), makeSymbol("EXECUTED-TACTIC-COUNT-1"), makeSymbol("ANSWER-COUNT-1"));
        $list118 = list(makeSymbol("TIME-TO-FIRST-ANSWER-2"), makeSymbol("TOTAL-TIME-2"), makeSymbol("TIME-PER-ANSWER-2"), makeSymbol("TIME-TO-LAST-ANSWER-2"), makeSymbol("TACTIC-COUNT-2"), makeSymbol("EXECUTED-TACTIC-COUNT-2"), makeSymbol("ANSWER-COUNT-2"));
        $list119 = list(makeKeyword("TIME-TO-FIRST-ANSWER"), makeKeyword("TOTAL-TIME"), makeKeyword("TIME-PER-ANSWER"), makeKeyword("TIME-TO-LAST-ANSWER"), makeKeyword("TACTIC-COUNT"), makeKeyword("EXECUTED-TACTIC-COUNT"), makeKeyword("ANSWER-COUNT"));
        $TIME_TO_FIRST_ANSWER = makeKeyword("TIME-TO-FIRST-ANSWER");
        $TOTAL_TIME = makeKeyword("TOTAL-TIME");
        $TIME_PER_ANSWER = makeKeyword("TIME-PER-ANSWER");
        $TIME_TO_LAST_ANSWER = makeKeyword("TIME-TO-LAST-ANSWER");
        $TACTIC_COUNT = makeKeyword("TACTIC-COUNT");
        $EXECUTED_TACTIC_COUNT = makeKeyword("EXECUTED-TACTIC-COUNT");
        $ANSWER_COUNT = makeKeyword("ANSWER-COUNT");
        $HALT_REASON = makeKeyword("HALT-REASON");
        $str128$unhandled_metric__s = makeString("unhandled metric ~s");
        $BOTH_ANSWERABLE = makeKeyword("BOTH-ANSWERABLE");
        $ONLY_BASELINE_ANSWERABLE = makeKeyword("ONLY-BASELINE-ANSWERABLE");
        $ONLY_PROOF_SPEC_ANSWERABLE = makeKeyword("ONLY-PROOF-SPEC-ANSWERABLE");
        $NEITHER_ANSWERABLE = makeKeyword("NEITHER-ANSWERABLE");
        $BOTH = makeKeyword("BOTH");
        $sym134$_ = makeSymbol("<");
        $BASELINE = makeKeyword("BASELINE");
        $sym136$CAR = makeSymbol("CAR");
        $sym137$CDR = makeSymbol("CDR");
        $EXPERIMENT = makeKeyword("EXPERIMENT");
        $str139$unhandled_sort_by__s = makeString("unhandled sort-by ~s");
        $sym140$COORDINATIFY = makeSymbol("COORDINATIFY");
        $list141 = list(makeKeyword("TOTAL-TIME"));
        $list142 = list(makeSymbol("PROOF-SPEC"), makeSymbol("TOTAL-TIME-1"));
        $list143 = list(makeSymbol("TOTAL-TIME-2"));
        $str144$Proof_spec_query_is_slower___s_vs = makeString("Proof-spec query is slower: ~s vs. ~s");
        $str145$Proof_spec_query_failed_to_get__s = makeString("Proof-spec query failed to get ~s");
        $str146$Proof_spec_query_got_additional_a = makeString("Proof-spec query got additional answers: ~s");
        $list147 = list(new SubLObject[] { makeSymbol("FEWER-ANSWERS?"), makeSymbol("SLOWER?"), makeSymbol("PROOF-SPEC"), makeSymbol("RESULT-1"), makeSymbol("RESULT-2"), makeSymbol("HALT-REASON-1"), makeSymbol("HALT-REASON-2"), makeSymbol("TOTAL-TIME-1"), makeSymbol("TOTAL-TIME-2") });
        $TERSE = makeKeyword("TERSE");
        $sym149$TEST_QUERY_FIRST_PROOF_SPEC = makeSymbol("TEST-QUERY-FIRST-PROOF-SPEC");
        $$EverythingPSC = makeConstSym(("EverythingPSC"));
        $list151 = list(makeKeyword("BROWSABLE?"), T, makeKeyword("METRICS"), list(makeKeyword("ANSWER-PROOF-SPECS")));
        $TEST = makeKeyword("TEST");
        $OWNER = makeKeyword("OWNER");
        $CLASSES = makeKeyword("CLASSES");
        $KB = makeKeyword("KB");
        $TINY = makeKeyword("TINY");
        $WORKING_ = makeKeyword("WORKING?");
        $list158 = list(
                list(list(list(makeConstSym(("isa")), makeConstSym(("isa")), makeConstSym(("BinaryPredicate")))),
                        list(makeKeyword("REMOVAL"), list(makeConstSym(("ist")), makeConstSym(("EverythingPSC")), list(makeConstSym(("isa")), makeConstSym(("isa")), makeConstSym(("BinaryPredicate")))), makeKeyword("REMOVAL-ISA-COLLECTION-CHECK-POS"))),
                list(list(list(makeConstSym(("elementOf")), makeSymbol("?PRED"), list(makeConstSym(("TheSet")), makeConstSym(("isa")), makeConstSym(("genls"))))),
                        list(makeKeyword("REMOVAL"), list(makeConstSym(("ist")), makeConstSym(("EverythingPSC")), list(makeConstSym(("elementOf")), makeConstSym(("isa")), list(makeConstSym(("TheSet")), makeConstSym(("isa")), makeConstSym(("genls"))))), makeKeyword("REMOVAL-ELEMENTOF-UNIFY"))),
                list(list(list(makeConstSym(("and")), list(makeConstSym(("isa")), makeConstSym(("isa")), makeConstSym(("BinaryPredicate"))), list(makeConstSym(("isa")), ONE_INTEGER, makeConstSym(("PositiveInteger"))))),
                        list(makeKeyword("SPLIT"), list(makeKeyword("REMOVAL"), list(makeConstSym(("ist")), makeConstSym(("EverythingPSC")), list(makeConstSym(("isa")), makeConstSym(("isa")), makeConstSym(("BinaryPredicate")))), makeKeyword("REMOVAL-ISA-COLLECTION-CHECK-POS")),
                                list(makeKeyword("REMOVAL"), list(makeConstSym(("ist")), makeConstSym(("EverythingPSC")), list(makeConstSym(("isa")), ONE_INTEGER, makeConstSym(("PositiveInteger")))), makeKeyword("REMOVAL-ISA-DEFN-POS")))),
                list(list(list(makeConstSym(("and")), list(makeConstSym(("integerBetween")), MINUS_ONE_INTEGER, makeSymbol("?N"), ONE_INTEGER), list(makeConstSym(("isa")), makeSymbol("?N"), makeConstSym(("PositiveInteger"))))),
                        list(makeKeyword("JOIN-ORDERED"), list(makeKeyword("REMOVAL"), list(makeConstSym(("ist")), makeConstSym(("EverythingPSC")), list(makeConstSym(("integerBetween")), MINUS_ONE_INTEGER, ONE_INTEGER, ONE_INTEGER)), makeKeyword("REMOVAL-INTEGER-BETWEEN-UNIFY")),
                                list(makeKeyword("RESTRICTION"), list(makeKeyword("REMOVAL"), list(makeConstSym(("ist")), makeConstSym(("EverythingPSC")), list(makeConstSym(("isa")), ONE_INTEGER, makeConstSym(("PositiveInteger")))), makeKeyword("REMOVAL-ISA-DEFN-POS"))))));
        $list159 = list(list(
                list(list(makeKeyword("REMOVAL"), list(makeConstSym(("ist")), makeConstSym(("EverythingPSC")), list(makeConstSym(("isa")), makeConstSym(("isa")), makeConstSym(("BinaryPredicate")))), makeKeyword("REMOVAL-ISA-COLLECTION-CHECK-POS")),
                        list(makeKeyword("REMOVAL"), list(makeConstSym(("ist")), makeConstSym(("EverythingPSC")), list(makeConstSym(("isa")), makeConstSym(("genls")), makeConstSym(("BinaryPredicate")))), makeKeyword("REMOVAL-ISA-COLLECTION-CHECK-POS"))),
                list(makeKeyword("REMOVAL"), list(makeConstSym(("ist")), makeConstSym(("EverythingPSC")), list(makeConstSym(("isa")), makeKeyword("ANYTHING"), makeConstSym(("BinaryPredicate")))), makeKeyword("REMOVAL-ISA-COLLECTION-CHECK-POS"))));
    }
}
/*
 *
 * Total time: 837 ms
 *
 */