package com.cyc.cycjava.cycl.inference.harness;

import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow.*;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.*;
import static com.cyc.tool.subl.util.SubLFiles.*;

import com.cyc.cycjava.cycl.access_macros;
import com.cyc.cycjava.cycl.assertion_utilities;
import com.cyc.cycjava.cycl.assertions_high;
import com.cyc.cycjava.cycl.clauses;
import com.cyc.cycjava.cycl.cycl_utilities;
import com.cyc.cycjava.cycl.dictionary;
import com.cyc.cycjava.cycl.dictionary_contents;
import com.cyc.cycjava.cycl.forts;
import com.cyc.cycjava.cycl.list_utilities;
import com.cyc.cycjava.cycl.memoization_state;
import com.cyc.cycjava.cycl.mt_relevance_macros;
import com.cyc.cycjava.cycl.number_utilities;
import com.cyc.cycjava.cycl.set;
import com.cyc.cycjava.cycl.set_contents;
import com.cyc.cycjava.cycl.subl_macro_promotions;
import com.cyc.cycjava.cycl.utilities_macros;
import com.cyc.cycjava.cycl.inference.inference_trampolines;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.BinaryFunction;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Errors;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Functions;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Mapping;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Numbers;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Sequences;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Sort;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.SubLThread;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Symbols;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Threads;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Types;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Values;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLList;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObject;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLProcess;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLString;
import com.cyc.tool.subl.jrtl.nativeCode.type.number.SubLInteger;
import com.cyc.tool.subl.jrtl.nativeCode.type.symbol.SubLSymbol;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.cdestructuring_bind;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.conses_high;
import com.cyc.tool.subl.util.SubLFile;
import com.cyc.tool.subl.util.SubLFiles;
import com.cyc.tool.subl.util.SubLTranslatedFile;

public class inference_strategic_heuristics extends SubLTranslatedFile {
    public static SubLFile me;
    public static String myName = "com.cyc.cycjava.cycl.inference.harness.inference_strategic_heuristics";
    public static String myFingerPrint = "c0387fa31e81b3a4dd1dc6567799db9cc03916f4357d4eb5344acdf1f8898c4c";
    @SubL(source = "cycl/inference/harness/inference-strategic-heuristics.lisp", position = 1300L)
    private static SubLSymbol $strategic_heuristic_index$;
    @SubL(source = "cycl/inference/harness/inference-strategic-heuristics.lisp", position = 2300L)
    private static SubLSymbol $heuristic_domains$;
    @SubL(source = "cycl/inference/harness/inference-strategic-heuristics.lisp", position = 5300L)
    private static SubLSymbol $overriding_strategic_heuristic_scaling_factors$;
    @SubL(source = "cycl/inference/harness/inference-strategic-heuristics.lisp", position = 9500L)
    private static SubLSymbol $strategic_uselessness_based_on_proof_depth_math_memoized_caching_state$;
    @SubL(source = "cycl/inference/harness/inference-strategic-heuristics.lisp", position = 10800L)
    private static SubLSymbol $strategic_heuristic_occams_razor_table$;
    @SubL(source = "cycl/inference/harness/inference-strategic-heuristics.lisp", position = 11100L)
    private static SubLSymbol $strategic_heuristic_occams_razor_table_default$;
    @SubL(source = "cycl/inference/harness/inference-strategic-heuristics.lisp", position = 13700L)
    private static SubLSymbol $backtracking_considered_harmfulP$;
    @SubL(source = "cycl/inference/harness/inference-strategic-heuristics.lisp", position = 14500L)
    private static SubLSymbol $strategic_heuristic_backtracking_table$;
    @SubL(source = "cycl/inference/harness/inference-strategic-heuristics.lisp", position = 14600L)
    private static SubLSymbol $strategic_heuristic_backtracking_table_default$;
    @SubL(source = "cycl/inference/harness/inference-strategic-heuristics.lisp", position = 15300L)
    private static SubLSymbol $early_removal_productivity_threshold$;
    @SubL(source = "cycl/inference/harness/inference-strategic-heuristics.lisp", position = 17700L)
    private static SubLSymbol $heuristic_rule_a_priori_utility_problem_recursion_stack$;
    @SubL(source = "cycl/inference/harness/inference-strategic-heuristics.lisp", position = 31400L)
    public static SubLSymbol $highly_relevant_term_enabledP$;
    @SubL(source = "cycl/inference/harness/inference-strategic-heuristics.lisp", position = 32400L)
    private static SubLSymbol $relevant_term_set$;
    @SubL(source = "cycl/inference/harness/inference-strategic-heuristics.lisp", position = 32500L)
    private static SubLSymbol $irrelevant_term_set$;
    @SubL(source = "cycl/inference/harness/inference-strategic-heuristics.lisp", position = 34100L)
    private static SubLSymbol $strategic_heuristic_rule_historical_utility_enabledP$;
    @SubL(source = "cycl/inference/harness/inference-strategic-heuristics.lisp", position = 35500L)
    private static SubLSymbol $heuristic_rule_historical_utility_problem_recursion_stack$;
    @SubL(source = "cycl/inference/harness/inference-strategic-heuristics.lisp", position = 44200L)
    private static SubLSymbol $strategic_heuristic_rule_historical_connectedness_enabledP$;
    @SubL(source = "cycl/inference/harness/inference-strategic-heuristics.lisp", position = 53000L)
    private static SubLSymbol $strategic_heuristic_literal_count_lookup_table$;
    @SubL(source = "cycl/inference/harness/inference-strategic-heuristics.lisp", position = 54800L)
    private static SubLSymbol $strategic_heuristic_skolem_count_lookup_table$;
    private static SubLSymbol $sym0$_STRATEGIC_HEURISTIC_INDEX_;
    private static SubLSymbol $sym1$STRATEGIC_HEURISTIC_INDEX;
    private static SubLSymbol $sym2$DO_STRATEGIC_HEURISTICS;
    private static SubLList $list3;
    private static SubLList $list4;
    private static SubLSymbol $ALLOW_OTHER_KEYS;
    private static SubLSymbol $OBJECT;
    private static SubLSymbol $DONE;
    private static SubLSymbol $sym8$DOMAIN;
    private static SubLSymbol $sym9$DO_DICTIONARY_KEYS;
    private static SubLList $list10;
    private static SubLSymbol $sym11$CLET;
    private static SubLSymbol $sym12$STRATEGIC_HEURISTIC_FUNCTION;
    private static SubLSymbol $sym13$STRATEGIC_HEURISTIC_SCALING_FACTOR;
    private static SubLSymbol $sym14$STRATEGIC_HEURISTIC_DOMAIN;
    private static SubLSymbol $sym15$PWHEN;
    private static SubLSymbol $sym16$DO_STRATEGIC_HEURISTICS_TACTIC_MATCH_P;
    private static SubLList $list17;
    private static SubLSymbol $PROBLEM;
    private static SubLSymbol $TACTIC;
    private static SubLSymbol $CONTENT_TACTIC;
    private static SubLSymbol $STRUCTURAL_TACTIC;
    private static SubLSymbol $CONNECTED_CONJUNCTION_TACTIC;
    private static SubLSymbol $GENERALIZED_REMOVAL_TACTIC;
    private static SubLSymbol $TRANSFORMATION_TACTIC;
    private static SubLString $str25$Unknown_heuristic_domain__s;
    private static SubLSymbol $sym26$KEYWORDP;
    private static SubLList $list27;
    private static SubLList $list28;
    private static SubLSymbol $FUNCTION;
    private static SubLSymbol $SCALING_FACTOR;
    private static SubLSymbol $PRETTY_NAME;
    private static SubLSymbol $COMMENT;
    private static SubLSymbol $DOMAIN;
    private static SubLSymbol $SHALLOW_AND_CHEAP;
    private static SubLList $list35;
    private static SubLSymbol $sym36$STRATEGIC_HEURISTIC_SHALLOW_AND_CHEAP;
    private static SubLSymbol $UNDETERMINED;
    private static SubLSymbol $sym38$STRATEGIC_USELESSNESS_BASED_ON_PROOF_DEPTH_MATH_MEMOIZED;
    private static SubLSymbol $sym39$_STRATEGIC_USELESSNESS_BASED_ON_PROOF_DEPTH_MATH_MEMOIZED_CACHING;
    private static SubLSymbol $COMPLETENESS;
    private static SubLList $list41;
    private static SubLSymbol $COMPLETE;
    private static SubLSymbol $sym43$STRATEGIC_HEURISTIC_COMPLETENESS;
    private static SubLSymbol $OCCAMS_RAZOR;
    private static SubLList $list45;
    private static SubLList $list46;
    private static SubLInteger $int$_100;
    private static SubLSymbol $sym48$STRATEGIC_HEURISTIC_OCCAMS_RAZOR;
    private static SubLSymbol $OCCAMS_RAZOR_TACTIC;
    private static SubLList $list50;
    private static SubLSymbol $sym51$STRATEGIC_HEURISTIC_OCCAMS_RAZOR_TACTIC;
    private static SubLSymbol $MAGIC_WAND;
    private static SubLList $list53;
    private static SubLSymbol $INCOMPLETE;
    private static SubLSymbol $sym55$STRATEGIC_HEURISTIC_MAGIC_WAND;
    private static SubLSymbol $BACKTRACKING_CONSIDERED_HARMFUL;
    private static SubLList $list57;
    private static SubLList $list58;
    private static SubLSymbol $sym59$STRATEGIC_HEURISTIC_BACKTRACKING;
    private static SubLInteger $int$400;
    private static SubLSymbol $CONNECTED_CONJUNCTION;
    private static SubLSymbol $EXECUTED;
    private static SubLSymbol $BACKCHAIN_REQUIRED;
    private static SubLList $list64;
    private static SubLInteger $int$100;
    private static SubLSymbol $sym66$STRATEGIC_HEURISTIC_BACKCHAIN_REQUIRED;
    private static SubLSymbol $RULE_A_PRIORI_UTILITY;
    private static SubLList $list68;
    private static SubLSymbol $sym69$STRATEGIC_HEURISTIC_RULE_A_PRIORI_UTILITY;
    private static SubLSymbol $LOOP;
    private static SubLSymbol $sym71$COUNT_A_PRIORI_UTILITY_RECURSIVE_INT;
    private static SubLSymbol $sym72$TRANSFORMATION_RULE_A_PRIORI_UTILITY_HAPPINESS;
    private static SubLSymbol $PROBLEM_RULE_A_PRIORI_UTILITY;
    private static SubLList $list74;
    private static SubLSymbol $sym75$STRATEGIC_HEURISTIC_PROBLEM_RULE_A_PRIORI_UTILITY;
    private static SubLSymbol $RELEVANT_TERM;
    private static SubLList $list77;
    private static SubLSymbol $sym78$STRATEGIC_HEURISTIC_RELEVANT_TERM;
    private static SubLSymbol $sym79$PROBLEM_RELEVANT_OR_IRRELEVANT_TERM_COUNT_INT;
    private static SubLSymbol $NEG;
    private static SubLList $list81;
    private static SubLSymbol $POS;
    private static SubLSymbol $sym83$ACCUMULATE_RELEVANT_OR_IRRELEVANT_TERM;
    private static SubLSymbol $RULE_HISTORICAL_UTILITY;
    private static SubLList $list85;
    private static SubLSymbol $sym86$STRATEGIC_HEURISTIC_RULE_HISTORICAL_UTILITY;
    private static SubLSymbol $sym87$COMPUTE_PROBLEM_RULE_HISTORICAL_UTILITY_RECURSIVE_INT;
    private static SubLSymbol $sym88$TRANSFORMATION_RULE_UTILITY;
    private static SubLSymbol $sym89$RULE_ASSERTION_;
    private static SubLSymbol $PROBLEM_RULE_HISTORICAL_UTILITY;
    private static SubLList $list91;
    private static SubLSymbol $sym92$STRATEGIC_HEURISTIC_PROBLEM_RULE_HISTORICAL_UTILITY;
    private static SubLSymbol $RULE_HISTORICAL_CONNECTEDNESS;
    private static SubLList $list94;
    private static SubLSymbol $sym95$STRATEGIC_HEURISTIC_RULE_HISTORICAL_CONNECTEDNESS;
    private static SubLSymbol $sym96$CACHED_PROBLEM_LINK_PATHS_RELEVANT_TO_INFERENCE;
    private static SubLSymbol $sym97$PROBLEM_P;
    private static SubLSymbol $sym98$INFERENCE_P;
    private static SubLSymbol $sym99$PROBLEM_LINK_PATH_RULE_SET;
    private static SubLSymbol $sym100$TACTIC_P;
    private static SubLSymbol $LITERAL_COUNT;
    private static SubLList $list102;
    private static SubLSymbol $sym103$STRATEGIC_HEURISTIC_LITERAL_COUNT;
    private static SubLSymbol $RULE_LITERAL_COUNT;
    private static SubLList $list105;
    private static SubLSymbol $sym106$STRATEGIC_HEURISTIC_RULE_LITERAL_COUNT;
    private static SubLList $list107;
    private static SubLList $list108;
    private static SubLSymbol $SKOLEM_COUNT;
    private static SubLList $list110;
    private static SubLSymbol $sym111$STRATEGIC_HEURISTIC_SKOLEM_COUNT;
    private static SubLSymbol $sym112$SKOLEM_FUNCTION_P;
    private static SubLList $list113;
    private static SubLSymbol $sym114$HAPPINESS__;
    private static SubLSymbol $sym115$THIRD;
    private static SubLSymbol $sym116$FOURTH;
    private static SubLSymbol $T_FLOWS_LIKE_WINE;
    private static SubLList $list118;
    private static SubLSymbol $sym119$STRATEGIC_HEURISTIC_T_FLOWS_LIKE_WINE;

    @SubL(source = "cycl/inference/harness/inference-strategic-heuristics.lisp", position = 1400L)
    public static SubLObject strategic_heuristic_index() {
        return $strategic_heuristic_index$.getGlobalValue();
    }

    @SubL(source = "cycl/inference/harness/inference-strategic-heuristics.lisp", position = 1500L)
    public static SubLObject do_strategic_heuristics(SubLObject macroform, SubLObject environment) {
        SubLObject current;
        SubLObject datum = current = macroform.rest();
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, $list3);
        SubLObject temp = current.rest();
        current = current.first();
        SubLObject heuristic = NIL;
        SubLObject function = NIL;
        SubLObject scaling_factor = NIL;
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, $list3);
        heuristic = current.first();
        current = current.rest();
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, $list3);
        function = current.first();
        current = current.rest();
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, $list3);
        scaling_factor = current.first();
        current = current.rest();
        SubLObject allow_other_keys_p = NIL;
        SubLObject rest = current;
        SubLObject bad = NIL;
        SubLObject current_$1 = NIL;
        while (NIL != rest) {
            cdestructuring_bind.destructuring_bind_must_consp(rest, datum, $list3);
            current_$1 = rest.first();
            rest = rest.rest();
            cdestructuring_bind.destructuring_bind_must_consp(rest, datum, $list3);
            if (NIL == conses_high.member(current_$1, $list4, UNPROVIDED, UNPROVIDED)) {
                bad = T;
            }
            if (current_$1 == $ALLOW_OTHER_KEYS) {
                allow_other_keys_p = rest.first();
            }
            rest = rest.rest();
        }
        if (NIL != bad && NIL == allow_other_keys_p) {
            cdestructuring_bind.cdestructuring_bind_error(datum, $list3);
        }
        SubLObject object_tail = cdestructuring_bind.property_list_member($OBJECT, current);
        SubLObject v_object = (NIL != object_tail) ? conses_high.cadr(object_tail) : NIL;
        SubLObject done_tail = cdestructuring_bind.property_list_member($DONE, current);
        SubLObject done = (NIL != done_tail) ? conses_high.cadr(done_tail) : NIL;
        SubLObject body;
        current = (body = temp);
        SubLObject domain = $sym8$DOMAIN;
        return list($sym9$DO_DICTIONARY_KEYS, list(heuristic, $list10, $DONE, done),
                list($sym11$CLET, list(list(function, list($sym12$STRATEGIC_HEURISTIC_FUNCTION, heuristic)), list(scaling_factor, list($sym13$STRATEGIC_HEURISTIC_SCALING_FACTOR, heuristic)), list(domain, list($sym14$STRATEGIC_HEURISTIC_DOMAIN, heuristic))),
                        listS($sym15$PWHEN, list($sym16$DO_STRATEGIC_HEURISTICS_TACTIC_MATCH_P, v_object, domain), append(body, NIL))));
    }

    @SubL(source = "cycl/inference/harness/inference-strategic-heuristics.lisp", position = 2100L)
    public static SubLObject do_strategic_heuristics_tactic_match_p(SubLObject v_object, SubLObject domain) {
        return makeBoolean(NIL == v_object || NIL != object_in_heuristic_domainP(v_object, domain));
    }

    @SubL(source = "cycl/inference/harness/inference-strategic-heuristics.lisp", position = 2500L)
    public static SubLObject heuristic_domain_p(SubLObject v_object) {
        return list_utilities.member_eqP(v_object, $heuristic_domains$.getGlobalValue());
    }

    @SubL(source = "cycl/inference/harness/inference-strategic-heuristics.lisp", position = 2500L)
    public static SubLObject object_in_heuristic_domainP(SubLObject v_object, SubLObject domain) {
        if (domain.eql($PROBLEM)) {
            return inference_datastructures_problem.problem_p(v_object);
        }
        if (domain.eql($TACTIC)) {
            return inference_datastructures_tactic.tactic_p(v_object);
        }
        if (domain.eql($CONTENT_TACTIC)) {
            return inference_worker.content_tactic_p(v_object);
        }
        if (domain.eql($STRUCTURAL_TACTIC)) {
            return inference_worker.structural_tactic_p(v_object);
        }
        if (domain.eql($CONNECTED_CONJUNCTION_TACTIC)) {
            return inference_worker.connected_conjunction_tactic_p(v_object);
        }
        if (domain.eql($GENERALIZED_REMOVAL_TACTIC)) {
            return inference_worker_removal.generalized_removal_tactic_p(v_object);
        }
        if (domain.eql($TRANSFORMATION_TACTIC)) {
            return inference_worker_transformation.transformation_tactic_p(v_object);
        }
        Errors.error($str25$Unknown_heuristic_domain__s, domain);
        return NIL;
    }

    @SubL(source = "cycl/inference/harness/inference-strategic-heuristics.lisp", position = 3100L)
    public static SubLObject new_strategic_heuristic_data(SubLObject function, SubLObject scaling_factor, SubLObject pretty_name, SubLObject comment, SubLObject domain) {
        return list(function, scaling_factor, pretty_name, comment, domain);
    }

    @SubL(source = "cycl/inference/harness/inference-strategic-heuristics.lisp", position = 3300L)
    public static SubLObject declare_strategic_heuristic(SubLObject heuristic, SubLObject plist) {
        assert NIL != Types.keywordp(heuristic) : heuristic;
        SubLObject allow_other_keys_p = NIL;
        SubLObject rest = plist;
        SubLObject bad = NIL;
        SubLObject current_$2 = NIL;
        while (NIL != rest) {
            cdestructuring_bind.destructuring_bind_must_consp(rest, plist, $list27);
            current_$2 = rest.first();
            rest = rest.rest();
            cdestructuring_bind.destructuring_bind_must_consp(rest, plist, $list27);
            if (NIL == conses_high.member(current_$2, $list28, UNPROVIDED, UNPROVIDED)) {
                bad = T;
            }
            if (current_$2 == $ALLOW_OTHER_KEYS) {
                allow_other_keys_p = rest.first();
            }
            rest = rest.rest();
        }
        if (NIL != bad && NIL == allow_other_keys_p) {
            cdestructuring_bind.cdestructuring_bind_error(plist, $list27);
        }
        SubLObject function_tail = cdestructuring_bind.property_list_member($FUNCTION, plist);
        SubLObject function = (NIL != function_tail) ? conses_high.cadr(function_tail) : NIL;
        SubLObject scaling_factor_tail = cdestructuring_bind.property_list_member($SCALING_FACTOR, plist);
        SubLObject scaling_factor = (NIL != scaling_factor_tail) ? conses_high.cadr(scaling_factor_tail) : NIL;
        SubLObject pretty_name_tail = cdestructuring_bind.property_list_member($PRETTY_NAME, plist);
        SubLObject pretty_name = (NIL != pretty_name_tail) ? conses_high.cadr(pretty_name_tail) : NIL;
        SubLObject comment_tail = cdestructuring_bind.property_list_member($COMMENT, plist);
        SubLObject comment = (NIL != comment_tail) ? conses_high.cadr(comment_tail) : NIL;
        SubLObject domain_tail = cdestructuring_bind.property_list_member($DOMAIN, plist);
        SubLObject domain = (NIL != domain_tail) ? conses_high.cadr(domain_tail) : NIL;
        SubLObject data = new_strategic_heuristic_data(function, scaling_factor, pretty_name, comment, domain);
        dictionary.dictionary_enter($strategic_heuristic_index$.getGlobalValue(), heuristic, data);
        return heuristic;
    }

    @SubL(source = "cycl/inference/harness/inference-strategic-heuristics.lisp", position = 4900L)
    public static SubLObject undeclare_strategic_heuristic(SubLObject heuristic) {
        dictionary.dictionary_remove($strategic_heuristic_index$.getGlobalValue(), heuristic);
        return heuristic;
    }

    @SubL(source = "cycl/inference/harness/inference-strategic-heuristics.lisp", position = 5100L)
    public static SubLObject strategic_heuristic_function(SubLObject heuristic) {
        SubLObject data = dictionary.dictionary_lookup_without_values($strategic_heuristic_index$.getGlobalValue(), heuristic, UNPROVIDED);
        if (NIL != data) {
            return data.first();
        }
        return NIL;
    }

    @SubL(source = "cycl/inference/harness/inference-strategic-heuristics.lisp", position = 5600L)
    public static SubLObject strategic_heuristic_scaling_factor(SubLObject heuristic) {
        SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject overriding_scaling_factor = conses_high.getf($overriding_strategic_heuristic_scaling_factors$.getDynamicValue(thread), heuristic, NIL);
        if (NIL != overriding_scaling_factor) {
            return overriding_scaling_factor;
        }
        SubLObject data = dictionary.dictionary_lookup_without_values($strategic_heuristic_index$.getGlobalValue(), heuristic, UNPROVIDED);
        if (NIL != data) {
            return conses_high.second(data);
        }
        return NIL;
    }

    @SubL(source = "cycl/inference/harness/inference-strategic-heuristics.lisp", position = 6000L)
    public static SubLObject strategic_heuristic_name(SubLObject heuristic) {
        SubLObject pretty_name = strategic_heuristic_pretty_name(heuristic);
        return (NIL != pretty_name) ? pretty_name : Symbols.symbol_name(heuristic);
    }

    @SubL(source = "cycl/inference/harness/inference-strategic-heuristics.lisp", position = 6300L)
    public static SubLObject strategic_heuristic_pretty_name(SubLObject heuristic) {
        SubLObject data = dictionary.dictionary_lookup_without_values($strategic_heuristic_index$.getGlobalValue(), heuristic, UNPROVIDED);
        if (NIL != data) {
            return conses_high.third(data);
        }
        return NIL;
    }

    @SubL(source = "cycl/inference/harness/inference-strategic-heuristics.lisp", position = 6500L)
    public static SubLObject strategic_heuristic_comment(SubLObject heuristic) {
        SubLObject data = dictionary.dictionary_lookup_without_values($strategic_heuristic_index$.getGlobalValue(), heuristic, UNPROVIDED);
        if (NIL != data) {
            return conses_high.fourth(data);
        }
        return NIL;
    }

    @SubL(source = "cycl/inference/harness/inference-strategic-heuristics.lisp", position = 6800L)
    public static SubLObject strategic_heuristic_domain(SubLObject heuristic) {
        SubLObject data = dictionary.dictionary_lookup_without_values($strategic_heuristic_index$.getGlobalValue(), heuristic, UNPROVIDED);
        if (NIL != data) {
            return conses_high.fifth(data);
        }
        return NIL;
    }

    @SubL(source = "cycl/inference/harness/inference-strategic-heuristics.lisp", position = 7600L)
    public static SubLObject strategic_heuristic_shallow_and_cheap(SubLObject strategy, SubLObject problem) {
        SubLObject productivity = productivity_for_shallow_and_cheap_problem_heuristic(problem, strategy);
        SubLObject uselessness = problem_strategic_uselessness_based_on_proof_depth(problem, strategy);
        SubLObject unhappiness = (ZERO_INTEGER.eql(productivity) && NIL != number_utilities.positive_infinity_p(uselessness)) ? number_utilities.positive_infinity() : inference_datastructures_enumerated_types.productivity_times_number(productivity, uselessness);
        SubLObject happiness = inference_datastructures_enumerated_types.productivity_times_number(unhappiness, MINUS_ONE_INTEGER);
        return happiness;
    }

    @SubL(source = "cycl/inference/harness/inference-strategic-heuristics.lisp", position = 8300L)
    public static SubLObject productivity_for_shallow_and_cheap_problem_heuristic(SubLObject problem, SubLObject strategy) {
        if (NIL == new_root_tactician.new_root_strategy_p(strategy) && NIL == transformation_tactician_datastructures.transformation_strategy_p(strategy)) {
            return ZERO_INTEGER;
        }
        SubLObject r_strat = striping_tactician.sibling_removal_strategy(strategy, problem);
        if (NIL != r_strat) {
            return inference_worker.estimated_global_productivity_of_problem_possible_tactics(problem, r_strat);
        }
        return inference_datastructures_tactic.total_productivity_of_problem_possible_tactics(problem);
    }

    @SubL(source = "cycl/inference/harness/inference-strategic-heuristics.lisp", position = 9000L)
    public static SubLObject problem_strategic_uselessness_based_on_proof_depth(SubLObject problem, SubLObject strategy) {
        SubLObject inference = inference_datastructures_strategy.strategy_inference(strategy);
        SubLObject min_proof_depth = inference_datastructures_problem.problem_min_proof_depth(problem, inference);
        if ($UNDETERMINED == min_proof_depth) {
            return number_utilities.positive_infinity();
        }
        return strategic_uselessness_based_on_proof_depth_math_memoized(min_proof_depth);
    }

    @SubL(source = "cycl/inference/harness/inference-strategic-heuristics.lisp", position = 9500L)
    public static SubLObject clear_strategic_uselessness_based_on_proof_depth_math_memoized() {
        SubLObject cs = $strategic_uselessness_based_on_proof_depth_math_memoized_caching_state$.getGlobalValue();
        if (NIL != cs) {
            memoization_state.caching_state_clear(cs);
        }
        return NIL;
    }

    @SubL(source = "cycl/inference/harness/inference-strategic-heuristics.lisp", position = 9500L)
    public static SubLObject remove_strategic_uselessness_based_on_proof_depth_math_memoized(SubLObject min_proof_depth) {
        return memoization_state.caching_state_remove_function_results_with_args($strategic_uselessness_based_on_proof_depth_math_memoized_caching_state$.getGlobalValue(), list(min_proof_depth), UNPROVIDED, UNPROVIDED);
    }

    @SubL(source = "cycl/inference/harness/inference-strategic-heuristics.lisp", position = 9500L)
    public static SubLObject strategic_uselessness_based_on_proof_depth_math_memoized_internal(SubLObject min_proof_depth) {
        return Numbers.max(ONE_INTEGER, Numbers.round(Numbers.log(number_utilities.f_1X(min_proof_depth), TWO_INTEGER), UNPROVIDED));
    }

    @SubL(source = "cycl/inference/harness/inference-strategic-heuristics.lisp", position = 9500L)
    public static SubLObject strategic_uselessness_based_on_proof_depth_math_memoized(SubLObject min_proof_depth) {
        SubLObject caching_state = $strategic_uselessness_based_on_proof_depth_math_memoized_caching_state$.getGlobalValue();
        if (NIL == caching_state) {
            caching_state = memoization_state.create_global_caching_state_for_name($sym38$STRATEGIC_USELESSNESS_BASED_ON_PROOF_DEPTH_MATH_MEMOIZED, $sym39$_STRATEGIC_USELESSNESS_BASED_ON_PROOF_DEPTH_MATH_MEMOIZED_CACHING, NIL, EQL, ONE_INTEGER, ZERO_INTEGER);
        }
        SubLObject results = memoization_state.caching_state_lookup(caching_state, min_proof_depth, memoization_state.$memoized_item_not_found$.getGlobalValue());
        if (results.eql(memoization_state.$memoized_item_not_found$.getGlobalValue())) {
            results = Values.arg2(Values.resetMultipleValues(), Values.multiple_value_list(strategic_uselessness_based_on_proof_depth_math_memoized_internal(min_proof_depth)));
            memoization_state.caching_state_put(caching_state, min_proof_depth, results, UNPROVIDED);
        }
        return memoization_state.caching_results(results);
    }

    @SubL(source = "cycl/inference/harness/inference-strategic-heuristics.lisp", position = 10200L)
    public static SubLObject strategic_heuristic_completeness(SubLObject strategy, SubLObject content_tactic) {
        if (NIL != inference_worker.content_tactic_p(content_tactic) && $COMPLETE == inference_datastructures_strategy.tactic_strategic_completeness(content_tactic, strategy)) {
            return ONE_INTEGER;
        }
        return ZERO_INTEGER;
    }

    @SubL(source = "cycl/inference/harness/inference-strategic-heuristics.lisp", position = 11200L)
    public static SubLObject strategic_heuristic_occams_razor(SubLObject strategy, SubLObject problem) {
        return strategic_heuristic_occams_razor_int(strategy, problem, NIL);
    }

    @SubL(source = "cycl/inference/harness/inference-strategic-heuristics.lisp", position = 11300L)
    public static SubLObject strategic_heuristic_occams_razor_int(SubLObject strategy, SubLObject problem, SubLObject increment_depth_by_oneP) {
        SubLObject inference = inference_datastructures_strategy.strategy_inference(strategy);
        SubLObject happiness = ZERO_INTEGER;
        if (NIL != inference_strategist.inference_permits_transformationP(inference)) {
            SubLObject min_depth = inference_datastructures_problem.problem_intuitive_min_transformation_depth(problem, inference);
            if ($UNDETERMINED == min_depth || NIL == min_depth) {
                happiness = $strategic_heuristic_occams_razor_table_default$.getGlobalValue();
            } else {
                if (NIL != increment_depth_by_oneP) {
                    min_depth = Numbers.add(min_depth, ONE_INTEGER);
                }
                happiness = numeric_table_lookup(min_depth, $strategic_heuristic_occams_razor_table$.getGlobalValue(), UNPROVIDED);
            }
        }
        return happiness;
    }

    @SubL(source = "cycl/inference/harness/inference-strategic-heuristics.lisp", position = 12400L)
    public static SubLObject strategic_heuristic_occams_razor_tactic(SubLObject strategy, SubLObject content_tactic) {
        SubLObject half_ply_lookaheadP = inference_worker_transformation.transformation_tactic_p(content_tactic);
        return strategic_heuristic_occams_razor_int(strategy, inference_datastructures_tactic.tactic_problem(content_tactic), half_ply_lookaheadP);
    }

    @SubL(source = "cycl/inference/harness/inference-strategic-heuristics.lisp", position = 13300L)
    public static SubLObject strategic_heuristic_magic_wand(SubLObject strategy, SubLObject generalized_removal_tactic) {
        if (NIL != inference_worker_removal.generalized_removal_tactic_p(generalized_removal_tactic) && $INCOMPLETE == inference_datastructures_strategy.tactic_strategic_completeness(generalized_removal_tactic, strategy)
                && NIL != inference_datastructures_enumerated_types.productivity_E(ZERO_INTEGER, inference_datastructures_strategy.tactic_strategic_productivity(generalized_removal_tactic, strategy))) {
            return $int$_100;
        }
        return ZERO_INTEGER;
    }

    @SubL(source = "cycl/inference/harness/inference-strategic-heuristics.lisp", position = 14700L)
    public static SubLObject strategic_heuristic_backtracking(SubLObject strategy, SubLObject connected_conjunction_tactic) {
        SubLThread thread = SubLProcess.currentSubLThread();
        if (NIL == $backtracking_considered_harmfulP$.getDynamicValue(thread)) {
            return ZERO_INTEGER;
        }
        SubLObject problem = inference_datastructures_tactic.tactic_problem(connected_conjunction_tactic);
        SubLObject executed_connected_conjunction_tactic_count = executed_connected_conjunction_tactics_that_matter_count(problem, strategy);
        SubLObject table = $strategic_heuristic_backtracking_table$.getGlobalValue();
        SubLObject happiness = list_utilities.alist_lookup(table, executed_connected_conjunction_tactic_count, Symbols.symbol_function(EQL), $strategic_heuristic_backtracking_table_default$.getGlobalValue());
        return happiness;
    }

    @SubL(source = "cycl/inference/harness/inference-strategic-heuristics.lisp", position = 15400L)
    public static SubLObject executed_connected_conjunction_tactics_that_matter_count(SubLObject problem, SubLObject strategy) {
        SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject count = ZERO_INTEGER;
        SubLObject cdolist_list_var = inference_datastructures_problem.problem_tactics(problem);
        SubLObject tactic = NIL;
        tactic = cdolist_list_var.first();
        while (NIL != cdolist_list_var) {
            if (NIL != inference_datastructures_problem.do_problem_tactics_type_match(tactic, $CONNECTED_CONJUNCTION) && NIL != inference_datastructures_problem.do_problem_tactics_status_match(tactic, $EXECUTED)) {
                SubLObject productivity = inference_datastructures_strategy.tactic_strategic_productivity(tactic, strategy);
                if (NIL != inference_datastructures_enumerated_types.productivity_G(productivity, $early_removal_productivity_threshold$.getDynamicValue(thread))) {
                    count = Numbers.add(count, ONE_INTEGER);
                }
            }
            cdolist_list_var = cdolist_list_var.rest();
            tactic = cdolist_list_var.first();
        }
        return count;
    }

    @SubL(source = "cycl/inference/harness/inference-strategic-heuristics.lisp", position = 16500L)
    public static SubLObject strategic_heuristic_backchain_required(SubLObject strategy, SubLObject transformation_tactic) {
        SubLObject inference = inference_datastructures_strategy.strategy_inference(strategy);
        if (NIL != inference_strategist.inference_permits_transformationP(inference)) {
            SubLObject problem = inference_datastructures_tactic.tactic_problem(transformation_tactic);
            if (NIL != inference_datastructures_problem.single_literal_problem_p(problem)) {
                SubLObject asent = inference_datastructures_problem.single_literal_problem_atomic_sentence(problem);
                SubLObject mt = inference_datastructures_problem.single_literal_problem_mt(problem);
                if (NIL != inference_trampolines.inference_backchain_required_asentP(asent, mt)) {
                    return $int$100;
                }
            }
        }
        return ZERO_INTEGER;
    }

    @SubL(source = "cycl/inference/harness/inference-strategic-heuristics.lisp", position = 17900L)
    public static SubLObject strategic_heuristic_rule_a_priori_utility(SubLObject strategy, SubLObject content_tactic) {
        return strategic_heuristic_rule_a_priori_utility_int(strategy, inference_datastructures_tactic.tactic_problem(content_tactic), content_tactic);
    }

    @SubL(source = "cycl/inference/harness/inference-strategic-heuristics.lisp", position = 18700L)
    public static SubLObject strategic_heuristic_rule_a_priori_utility_int(SubLObject strategy, SubLObject problem, SubLObject v_object) {
        SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject happiness = $int$100;
        SubLObject inference = inference_datastructures_strategy.strategy_inference(strategy);
        if (NIL != inference_strategist.inference_permits_transformationP(inference) && (NIL != inference_worker.problem_has_been_transformedP(problem, inference) || NIL != inference_worker_transformation.transformation_tactic_p(v_object))) {
            SubLObject _prev_bind_0 = $heuristic_rule_a_priori_utility_problem_recursion_stack$.currentBinding(thread);
            try {
                $heuristic_rule_a_priori_utility_problem_recursion_stack$.bind(set.new_set(Symbols.symbol_function(EQL), UNPROVIDED), thread);
                thread.resetMultipleValues();
                SubLObject relevance_count = count_a_priori_utility_recursive(problem, inference);
                SubLObject total_count = thread.secondMultipleValue();
                thread.resetMultipleValues();
                if ($LOOP != total_count) {
                    if (NIL != inference_worker.content_tactic_p(v_object)) {
                        thread.resetMultipleValues();
                        SubLObject relevance_count_delta = determine_tactic_heuristic_relevance_delta(v_object);
                        SubLObject total_count_delta = thread.secondMultipleValue();
                        thread.resetMultipleValues();
                        relevance_count = Numbers.add(relevance_count, relevance_count_delta);
                        total_count = Numbers.add(total_count, total_count_delta);
                    }
                    if (!total_count.isZero()) {
                        happiness = Numbers.truncate(Numbers.multiply($int$100, relevance_count), total_count);
                    }
                }
            } finally {
                $heuristic_rule_a_priori_utility_problem_recursion_stack$.rebind(_prev_bind_0, thread);
            }
        }
        return happiness;
    }

    @SubL(source = "cycl/inference/harness/inference-strategic-heuristics.lisp", position = 19800L)
    public static SubLObject push_problem_onto_heuristic_rule_a_priori_utility_stack(SubLObject problem) {
        SubLThread thread = SubLProcess.currentSubLThread();
        return set.set_add(problem, $heuristic_rule_a_priori_utility_problem_recursion_stack$.getDynamicValue(thread));
    }

    @SubL(source = "cycl/inference/harness/inference-strategic-heuristics.lisp", position = 20000L)
    public static SubLObject problem_on_heuristic_rule_a_priori_utility_stackP(SubLObject problem) {
        SubLThread thread = SubLProcess.currentSubLThread();
        return set.set_memberP(problem, $heuristic_rule_a_priori_utility_problem_recursion_stack$.getDynamicValue(thread));
    }

    @SubL(source = "cycl/inference/harness/inference-strategic-heuristics.lisp", position = 20100L)
    public static SubLObject count_a_priori_utility_recursive(SubLObject problem, SubLObject inference) {
        SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject best_relevance_count = NIL;
        SubLObject best_total_count = NIL;
        SubLObject local_state = inference_datastructures_problem.problem_memoization_state(problem);
        SubLObject _prev_bind_0 = memoization_state.$memoization_state$.currentBinding(thread);
        try {
            memoization_state.$memoization_state$.bind(local_state, thread);
            SubLObject original_memoization_process = memoization_state.memoization_state_original_process(local_state);
            try {
                thread.resetMultipleValues();
                SubLObject best_relevance_count_$3 = count_a_priori_utility_recursive_int(problem, inference);
                SubLObject best_total_count_$4 = thread.secondMultipleValue();
                thread.resetMultipleValues();
                best_relevance_count = best_relevance_count_$3;
                best_total_count = best_total_count_$4;
            } finally {
                SubLObject _prev_bind_0_$5 = Threads.$is_thread_performing_cleanupP$.currentBinding(thread);
                try {
                    Threads.$is_thread_performing_cleanupP$.bind(T, thread);
                    SubLObject _values = Values.getValuesAsVector();
                    memoization_state.memoization_state_possibly_clear_original_process(local_state, original_memoization_process);
                    Values.restoreValuesFromVector(_values);
                } finally {
                    Threads.$is_thread_performing_cleanupP$.rebind(_prev_bind_0_$5, thread);
                }
            }
        } finally {
            memoization_state.$memoization_state$.rebind(_prev_bind_0, thread);
        }
        return Values.values(best_relevance_count, best_total_count);
    }

    @SubL(source = "cycl/inference/harness/inference-strategic-heuristics.lisp", position = 20500L)
    public static SubLObject count_a_priori_utility_recursive_int_internal(SubLObject problem, SubLObject inference) {
        SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject best_relevance_count = ZERO_INTEGER;
        SubLObject best_total_count = ZERO_INTEGER;
        SubLObject best_ratio = Numbers.$most_negative_fixnum$.getGlobalValue();
        SubLObject found_a_loopP = NIL;
        SubLObject found_a_non_loopP = NIL;
        if (NIL != problem_on_heuristic_rule_a_priori_utility_stackP(problem)) {
            return Values.values($LOOP, $LOOP);
        }
        push_problem_onto_heuristic_rule_a_priori_utility_stack(problem);
        SubLObject set_contents_var = inference_datastructures_problem.problem_dependent_links(problem);
        SubLObject basis_object;
        SubLObject state;
        SubLObject dependent_link;
        SubLObject supported_problem;
        SubLObject relevance_count;
        SubLObject total_count;
        SubLObject loopP;
        SubLObject t_link;
        SubLObject best_sub_relevance_count;
        SubLObject best_sub_total_count;
        SubLObject ratio;
        for (basis_object = set_contents.do_set_contents_basis_object(set_contents_var), state = NIL, state = set_contents.do_set_contents_initial_state(basis_object, set_contents_var); NIL == set_contents.do_set_contents_doneP(basis_object,
                state); state = set_contents.do_set_contents_update_state(state)) {
            dependent_link = set_contents.do_set_contents_next(basis_object, state);
            if (NIL != set_contents.do_set_contents_element_validP(state, dependent_link)) {
                supported_problem = inference_datastructures_problem_link.problem_link_supported_problem(dependent_link);
                relevance_count = ZERO_INTEGER;
                total_count = ZERO_INTEGER;
                loopP = NIL;
                if (NIL != inference_worker_transformation.generalized_transformation_link_p(dependent_link)) {
                    total_count = Numbers.add(total_count, ONE_INTEGER);
                    if (NIL != inference_datastructures_problem.problem_relevant_to_inferenceP(problem, inference)) {
                        t_link = ((NIL != inference_worker_transformation.transformation_link_p(dependent_link)) ? dependent_link : inference_worker_residual_transformation.residual_transformation_link_motivating_transformation_link(dependent_link));
                        if (NIL != generalized_transformation_link_relevantP(t_link)) {
                            relevance_count = Numbers.add(relevance_count, ONE_INTEGER);
                        } else if (NIL != generalized_transformation_link_irrelevantP(t_link)) {
                            relevance_count = Numbers.subtract(relevance_count, ONE_INTEGER);
                        } else if (NIL != generalized_transformation_link_has_rule_utilityP(t_link)) {
                            relevance_count = Numbers.add(relevance_count, generalized_transformation_link_rule_utility(t_link));
                        }
                    }
                }
                if (NIL == inference_worker_answer.answer_link_p(dependent_link)) {
                    thread.resetMultipleValues();
                    best_sub_relevance_count = count_a_priori_utility_recursive(supported_problem, inference);
                    best_sub_total_count = thread.secondMultipleValue();
                    thread.resetMultipleValues();
                    if ($LOOP == best_sub_total_count) {
                        loopP = T;
                        found_a_loopP = T;
                    } else {
                        found_a_non_loopP = T;
                        relevance_count = Numbers.add(relevance_count, best_sub_relevance_count);
                        total_count = Numbers.add(total_count, best_sub_total_count);
                    }
                }
                if (NIL == loopP) {
                    ratio = total_count.isZero() ? ZERO_INTEGER : Numbers.divide(relevance_count, total_count);
                    if (ratio.numG(best_ratio) || (ratio.numE(best_ratio) && total_count.numL(best_total_count))) {
                        best_relevance_count = relevance_count;
                        best_total_count = total_count;
                        best_ratio = ratio;
                    }
                }
            }
        }
        if (NIL != found_a_loopP && NIL == found_a_non_loopP) {
            return Values.values($LOOP, $LOOP);
        }
        return Values.values(best_relevance_count, best_total_count);
    }

    @SubL(source = "cycl/inference/harness/inference-strategic-heuristics.lisp", position = 20500L)
    public static SubLObject count_a_priori_utility_recursive_int(SubLObject problem, SubLObject inference) {
        SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject v_memoization_state = memoization_state.$memoization_state$.getDynamicValue(thread);
        SubLObject caching_state = NIL;
        if (NIL == v_memoization_state) {
            return count_a_priori_utility_recursive_int_internal(problem, inference);
        }
        caching_state = memoization_state.memoization_state_lookup(v_memoization_state, $sym71$COUNT_A_PRIORI_UTILITY_RECURSIVE_INT, UNPROVIDED);
        if (NIL == caching_state) {
            caching_state = memoization_state.create_caching_state(memoization_state.memoization_state_lock(v_memoization_state), $sym71$COUNT_A_PRIORI_UTILITY_RECURSIVE_INT, TWO_INTEGER, NIL, EQ, UNPROVIDED);
            memoization_state.memoization_state_put(v_memoization_state, $sym71$COUNT_A_PRIORI_UTILITY_RECURSIVE_INT, caching_state);
        }
        SubLObject sxhash = memoization_state.sxhash_calc_2(problem, inference);
        SubLObject collisions = memoization_state.caching_state_lookup(caching_state, sxhash, UNPROVIDED);
        if (!collisions.eql(memoization_state.$memoized_item_not_found$.getGlobalValue())) {
            SubLObject cdolist_list_var = collisions;
            SubLObject collision = NIL;
            collision = cdolist_list_var.first();
            while (NIL != cdolist_list_var) {
                SubLObject cached_args = collision.first();
                SubLObject results2 = conses_high.second(collision);
                if (problem.eql(cached_args.first())) {
                    cached_args = cached_args.rest();
                    if (NIL != cached_args && NIL == cached_args.rest() && inference.eql(cached_args.first())) {
                        return memoization_state.caching_results(results2);
                    }
                }
                cdolist_list_var = cdolist_list_var.rest();
                collision = cdolist_list_var.first();
            }
        }
        SubLObject results3 = Values.arg2(thread.resetMultipleValues(), Values.multiple_value_list(count_a_priori_utility_recursive_int_internal(problem, inference)));
        memoization_state.caching_state_enter_multi_key_n(caching_state, sxhash, collisions, results3, list(problem, inference));
        return memoization_state.caching_results(results3);
    }

    @SubL(source = "cycl/inference/harness/inference-strategic-heuristics.lisp", position = 23400L)
    public static SubLObject determine_tactic_heuristic_relevance_delta(SubLObject tactic) {
        SubLObject relevance_count = ZERO_INTEGER;
        SubLObject total_count = ZERO_INTEGER;
        if (NIL != inference_worker_transformation.transformation_tactic_p(tactic)) {
            if (NIL != transformation_tactic_relevantP(tactic)) {
                relevance_count = Numbers.add(relevance_count, ONE_INTEGER);
                total_count = Numbers.add(total_count, ONE_INTEGER);
            } else if (NIL != transformation_tactic_irrelevantP(tactic)) {
                relevance_count = Numbers.subtract(relevance_count, ONE_INTEGER);
                total_count = Numbers.add(total_count, ONE_INTEGER);
            } else if (NIL != transformation_tactic_has_utilityP(tactic)) {
                relevance_count = Numbers.add(relevance_count, transformation_tactic_utility(tactic));
                total_count = Numbers.add(total_count, ONE_INTEGER);
            } else if (NIL != inference_worker_transformation.transformation_tactic_lookahead_rule(tactic)) {
                total_count = Numbers.add(total_count, ONE_INTEGER);
            }
        }
        return Values.values(relevance_count, total_count);
    }

    @SubL(source = "cycl/inference/harness/inference-strategic-heuristics.lisp", position = 24100L)
    public static SubLObject generalized_transformation_link_relevantP(SubLObject generalized_transformation_link) {
        SubLObject rule = inference_worker_transformation.generalized_transformation_link_rule_assertion(generalized_transformation_link);
        SubLObject problem = inference_datastructures_problem_link.problem_link_supported_problem(generalized_transformation_link);
        return rule_relevant_to_problemP(rule, problem);
    }

    @SubL(source = "cycl/inference/harness/inference-strategic-heuristics.lisp", position = 24600L)
    public static SubLObject generalized_transformation_link_irrelevantP(SubLObject generalized_transformation_link) {
        SubLObject rule = inference_worker_transformation.generalized_transformation_link_rule_assertion(generalized_transformation_link);
        SubLObject problem = inference_datastructures_problem_link.problem_link_supported_problem(generalized_transformation_link);
        return rule_irrelevant_to_problemP(rule, problem);
    }

    @SubL(source = "cycl/inference/harness/inference-strategic-heuristics.lisp", position = 25200L)
    public static SubLObject generalized_transformation_link_has_rule_utilityP(SubLObject generalized_transformation_link) {
        SubLObject rule = inference_worker_transformation.generalized_transformation_link_rule_assertion(generalized_transformation_link);
        SubLObject problem = inference_datastructures_problem_link.problem_link_supported_problem(generalized_transformation_link);
        return rule_has_utility_wrt_problemP(rule, problem);
    }

    @SubL(source = "cycl/inference/harness/inference-strategic-heuristics.lisp", position = 25700L)
    public static SubLObject generalized_transformation_link_rule_utility(SubLObject generalized_transformation_link) {
        SubLObject rule = inference_worker_transformation.generalized_transformation_link_rule_assertion(generalized_transformation_link);
        SubLObject problem = inference_datastructures_problem_link.problem_link_supported_problem(generalized_transformation_link);
        SubLObject problem_mt = inference_datastructures_problem.single_literal_problem_mt(problem);
        return inference_trampolines.inference_rule_utility(rule, problem_mt);
    }

    @SubL(source = "cycl/inference/harness/inference-strategic-heuristics.lisp", position = 26200L)
    public static SubLObject transformation_tactic_relevantP(SubLObject transformation_tactic) {
        SubLObject rule = inference_worker_transformation.transformation_tactic_lookahead_rule(transformation_tactic);
        if (NIL != rule) {
            SubLObject problem = inference_datastructures_tactic.tactic_problem(transformation_tactic);
            return rule_relevant_to_problemP(rule, problem);
        }
        return NIL;
    }

    @SubL(source = "cycl/inference/harness/inference-strategic-heuristics.lisp", position = 26800L)
    public static SubLObject transformation_tactic_irrelevantP(SubLObject transformation_tactic) {
        SubLObject rule = inference_worker_transformation.transformation_tactic_lookahead_rule(transformation_tactic);
        if (NIL != rule) {
            SubLObject problem = inference_datastructures_tactic.tactic_problem(transformation_tactic);
            return rule_irrelevant_to_problemP(rule, problem);
        }
        return NIL;
    }

    @SubL(source = "cycl/inference/harness/inference-strategic-heuristics.lisp", position = 27300L)
    public static SubLObject transformation_tactic_has_utilityP(SubLObject transformation_tactic) {
        SubLObject rule = inference_worker_transformation.transformation_tactic_lookahead_rule(transformation_tactic);
        if (NIL != rule) {
            SubLObject problem = inference_datastructures_tactic.tactic_problem(transformation_tactic);
            return rule_has_utility_wrt_problemP(rule, problem);
        }
        return NIL;
    }

    @SubL(source = "cycl/inference/harness/inference-strategic-heuristics.lisp", position = 27600L)
    public static SubLObject transformation_tactic_utility(SubLObject transformation_tactic) {
        SubLObject rule = inference_worker_transformation.transformation_tactic_lookahead_rule(transformation_tactic);
        if (NIL != rule) {
            SubLObject problem = inference_datastructures_tactic.tactic_problem(transformation_tactic);
            SubLObject problem_mt = inference_datastructures_problem.single_literal_problem_mt(problem);
            return inference_trampolines.inference_rule_utility(rule, problem_mt);
        }
        return NIL;
    }

    @SubL(source = "cycl/inference/harness/inference-strategic-heuristics.lisp", position = 27900L)
    public static SubLObject rule_relevant_to_problemP(SubLObject rule, SubLObject problem) {
        SubLObject problem_mt = inference_datastructures_problem.problem_mt(problem);
        SubLObject rule_mt = assertions_high.assertion_mt(rule);
        if (NIL != inference_trampolines.inference_relevant_mtP(rule_mt, problem_mt)) {
            return T;
        }
        if (NIL == assertion_utilities.assertion_has_meta_assertionsP(rule)) {
            return NIL;
        }
        if (NIL != inference_trampolines.inference_relevant_assertionP(rule, problem_mt)) {
            return T;
        }
        SubLObject predicate = inference_datastructures_problem.single_literal_problem_predicate(problem);
        return inference_trampolines.inference_relevant_predicate_assertionP(predicate, rule, problem_mt);
    }

    @SubL(source = "cycl/inference/harness/inference-strategic-heuristics.lisp", position = 28500L)
    public static SubLObject rule_irrelevant_to_problemP(SubLObject rule, SubLObject problem) {
        SubLObject problem_mt = inference_datastructures_problem.problem_mt(problem);
        SubLObject rule_mt = assertions_high.assertion_mt(rule);
        if (NIL != inference_trampolines.inference_irrelevant_mtP(rule_mt, problem_mt)) {
            return T;
        }
        if (NIL == assertion_utilities.assertion_has_meta_assertionsP(rule)) {
            return NIL;
        }
        if (NIL != inference_trampolines.inference_irrelevant_assertionP(rule, problem_mt)) {
            return T;
        }
        SubLObject predicate = inference_datastructures_problem.single_literal_problem_predicate(problem);
        return inference_trampolines.inference_irrelevant_predicate_assertionP(predicate, rule, problem_mt);
    }

    @SubL(source = "cycl/inference/harness/inference-strategic-heuristics.lisp", position = 29000L)
    public static SubLObject rule_has_utility_wrt_problemP(SubLObject rule, SubLObject problem) {
        SubLObject problem_mt = inference_datastructures_problem.problem_mt(problem);
        if (NIL == assertion_utilities.assertion_has_meta_assertionsP(rule)) {
            return NIL;
        }
        if (NIL != inference_trampolines.inference_rule_has_utilityP(rule, problem_mt)) {
            return T;
        }
        return NIL;
    }

    @SubL(source = "cycl/inference/harness/inference-strategic-heuristics.lisp", position = 29300L)
    public static SubLObject transformation_rule_a_priori_utility(SubLObject rule) {
        if (NIL != inference_trampolines.inference_relevant_assertionP(rule, UNPROVIDED)) {
            return ONE_INTEGER;
        }
        if (NIL != inference_trampolines.inference_irrelevant_assertionP(rule, UNPROVIDED)) {
            return MINUS_ONE_INTEGER;
        }
        if (NIL != inference_trampolines.inference_rule_has_utilityP(rule, UNPROVIDED)) {
            return inference_trampolines.inference_rule_utility(rule, UNPROVIDED);
        }
        return ZERO_INTEGER;
    }

    @SubL(source = "cycl/inference/harness/inference-strategic-heuristics.lisp", position = 29800L)
    public static SubLObject transformation_rule_a_priori_utility_happiness_internal(SubLObject rule) {
        SubLObject happiness = Numbers.truncate(Numbers.multiply($int$100, transformation_rule_a_priori_utility(rule)), UNPROVIDED);
        return happiness;
    }

    @SubL(source = "cycl/inference/harness/inference-strategic-heuristics.lisp", position = 29800L)
    public static SubLObject transformation_rule_a_priori_utility_happiness(SubLObject rule) {
        SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject v_memoization_state = memoization_state.$memoization_state$.getDynamicValue(thread);
        SubLObject caching_state = NIL;
        if (NIL == v_memoization_state) {
            return transformation_rule_a_priori_utility_happiness_internal(rule);
        }
        caching_state = memoization_state.memoization_state_lookup(v_memoization_state, $sym72$TRANSFORMATION_RULE_A_PRIORI_UTILITY_HAPPINESS, UNPROVIDED);
        if (NIL == caching_state) {
            caching_state = memoization_state.create_caching_state(memoization_state.memoization_state_lock(v_memoization_state), $sym72$TRANSFORMATION_RULE_A_PRIORI_UTILITY_HAPPINESS, ONE_INTEGER, NIL, EQL, UNPROVIDED);
            memoization_state.memoization_state_put(v_memoization_state, $sym72$TRANSFORMATION_RULE_A_PRIORI_UTILITY_HAPPINESS, caching_state);
        }
        SubLObject results = memoization_state.caching_state_lookup(caching_state, rule, memoization_state.$memoized_item_not_found$.getGlobalValue());
        if (results.eql(memoization_state.$memoized_item_not_found$.getGlobalValue())) {
            results = Values.arg2(thread.resetMultipleValues(), Values.multiple_value_list(transformation_rule_a_priori_utility_happiness_internal(rule)));
            memoization_state.caching_state_put(caching_state, rule, results, UNPROVIDED);
        }
        return memoization_state.caching_results(results);
    }

    @SubL(source = "cycl/inference/harness/inference-strategic-heuristics.lisp", position = 30600L)
    public static SubLObject strategic_heuristic_problem_rule_a_priori_utility(SubLObject strategy, SubLObject problem) {
        return strategic_heuristic_rule_a_priori_utility_int(strategy, problem, problem);
    }

    @SubL(source = "cycl/inference/harness/inference-strategic-heuristics.lisp", position = 31800L)
    public static SubLObject strategic_heuristic_relevant_term(SubLObject strategy, SubLObject problem) {
        SubLThread thread = SubLProcess.currentSubLThread();
        if (NIL == $highly_relevant_term_enabledP$.getDynamicValue(thread)) {
            return ZERO_INTEGER;
        }
        SubLObject relevance_count = problem_relevant_or_irrelevant_term_count(problem);
        SubLObject heuristic = Numbers.multiply(relevance_count, TWENTY_INTEGER);
        heuristic = Numbers.min(heuristic, $int$100);
        heuristic = Numbers.max(heuristic, $int$_100);
        return heuristic;
    }

    @SubL(source = "cycl/inference/harness/inference-strategic-heuristics.lisp", position = 32600L)
    public static SubLObject problem_relevant_or_irrelevant_term_count(SubLObject problem) {
        SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject relevance = NIL;
        SubLObject local_state = inference_datastructures_problem.problem_memoization_state(problem);
        SubLObject _prev_bind_0 = memoization_state.$memoization_state$.currentBinding(thread);
        try {
            memoization_state.$memoization_state$.bind(local_state, thread);
            SubLObject original_memoization_process = memoization_state.memoization_state_original_process(local_state);
            try {
                relevance = problem_relevant_or_irrelevant_term_count_int(problem);
            } finally {
                SubLObject _prev_bind_0_$6 = Threads.$is_thread_performing_cleanupP$.currentBinding(thread);
                try {
                    Threads.$is_thread_performing_cleanupP$.bind(T, thread);
                    SubLObject _values = Values.getValuesAsVector();
                    memoization_state.memoization_state_possibly_clear_original_process(local_state, original_memoization_process);
                    Values.restoreValuesFromVector(_values);
                } finally {
                    Threads.$is_thread_performing_cleanupP$.rebind(_prev_bind_0_$6, thread);
                }
            }
        } finally {
            memoization_state.$memoization_state$.rebind(_prev_bind_0, thread);
        }
        return relevance;
    }

    @SubL(source = "cycl/inference/harness/inference-strategic-heuristics.lisp", position = 32800L)
    public static SubLObject problem_relevant_or_irrelevant_term_count_int_internal(SubLObject problem) {
        SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject relevance = NIL;
        SubLObject _prev_bind_0 = $relevant_term_set$.currentBinding(thread);
        SubLObject _prev_bind_2 = $irrelevant_term_set$.currentBinding(thread);
        try {
            $relevant_term_set$.bind(set.new_set(Symbols.symbol_function(EQL), UNPROVIDED), thread);
            $irrelevant_term_set$.bind(set.new_set(Symbols.symbol_function(EQL), UNPROVIDED), thread);
            SubLObject cdolist_list_var = inference_datastructures_problem.problem_query(problem);
            SubLObject contextualized_clause = NIL;
            contextualized_clause = cdolist_list_var.first();
            while (NIL != cdolist_list_var) {
                SubLObject sense = $NEG;
                SubLObject index_var = ZERO_INTEGER;
                SubLObject cdolist_list_var_$7 = clauses.neg_lits(contextualized_clause);
                SubLObject contextualized_asent = NIL;
                contextualized_asent = cdolist_list_var_$7.first();
                while (NIL != cdolist_list_var_$7) {
                    SubLObject current;
                    SubLObject datum = current = contextualized_asent;
                    SubLObject mt = NIL;
                    SubLObject asent = NIL;
                    cdestructuring_bind.destructuring_bind_must_consp(current, datum, $list81);
                    mt = current.first();
                    current = current.rest();
                    cdestructuring_bind.destructuring_bind_must_consp(current, datum, $list81);
                    asent = current.first();
                    current = current.rest();
                    if (NIL == current) {
                        SubLObject mt_var = mt_relevance_macros.with_inference_mt_relevance_validate(mt);
                        SubLObject _prev_bind_0_$8 = mt_relevance_macros.$mt$.currentBinding(thread);
                        SubLObject _prev_bind_1_$9 = mt_relevance_macros.$relevant_mt_function$.currentBinding(thread);
                        SubLObject _prev_bind_3 = mt_relevance_macros.$relevant_mts$.currentBinding(thread);
                        try {
                            mt_relevance_macros.$mt$.bind(mt_relevance_macros.update_inference_mt_relevance_mt(mt_var), thread);
                            mt_relevance_macros.$relevant_mt_function$.bind(mt_relevance_macros.update_inference_mt_relevance_function(mt_var), thread);
                            mt_relevance_macros.$relevant_mts$.bind(mt_relevance_macros.update_inference_mt_relevance_mt_list(mt_var), thread);
                            note_expression_relevant_or_irrelevant_terms(asent);
                        } finally {
                            mt_relevance_macros.$relevant_mts$.rebind(_prev_bind_3, thread);
                            mt_relevance_macros.$relevant_mt_function$.rebind(_prev_bind_1_$9, thread);
                            mt_relevance_macros.$mt$.rebind(_prev_bind_0_$8, thread);
                        }
                    } else {
                        cdestructuring_bind.cdestructuring_bind_error(datum, $list81);
                    }
                    index_var = Numbers.add(index_var, ONE_INTEGER);
                    cdolist_list_var_$7 = cdolist_list_var_$7.rest();
                    contextualized_asent = cdolist_list_var_$7.first();
                }
                sense = $POS;
                index_var = ZERO_INTEGER;
                SubLObject cdolist_list_var_$8 = clauses.pos_lits(contextualized_clause);
                contextualized_asent = NIL;
                contextualized_asent = cdolist_list_var_$8.first();
                while (NIL != cdolist_list_var_$8) {
                    SubLObject current;
                    SubLObject datum = current = contextualized_asent;
                    SubLObject mt = NIL;
                    SubLObject asent = NIL;
                    cdestructuring_bind.destructuring_bind_must_consp(current, datum, $list81);
                    mt = current.first();
                    current = current.rest();
                    cdestructuring_bind.destructuring_bind_must_consp(current, datum, $list81);
                    asent = current.first();
                    current = current.rest();
                    if (NIL == current) {
                        SubLObject mt_var = mt_relevance_macros.with_inference_mt_relevance_validate(mt);
                        SubLObject _prev_bind_0_$9 = mt_relevance_macros.$mt$.currentBinding(thread);
                        SubLObject _prev_bind_1_$10 = mt_relevance_macros.$relevant_mt_function$.currentBinding(thread);
                        SubLObject _prev_bind_3 = mt_relevance_macros.$relevant_mts$.currentBinding(thread);
                        try {
                            mt_relevance_macros.$mt$.bind(mt_relevance_macros.update_inference_mt_relevance_mt(mt_var), thread);
                            mt_relevance_macros.$relevant_mt_function$.bind(mt_relevance_macros.update_inference_mt_relevance_function(mt_var), thread);
                            mt_relevance_macros.$relevant_mts$.bind(mt_relevance_macros.update_inference_mt_relevance_mt_list(mt_var), thread);
                            note_expression_relevant_or_irrelevant_terms(asent);
                        } finally {
                            mt_relevance_macros.$relevant_mts$.rebind(_prev_bind_3, thread);
                            mt_relevance_macros.$relevant_mt_function$.rebind(_prev_bind_1_$10, thread);
                            mt_relevance_macros.$mt$.rebind(_prev_bind_0_$9, thread);
                        }
                    } else {
                        cdestructuring_bind.cdestructuring_bind_error(datum, $list81);
                    }
                    index_var = Numbers.add(index_var, ONE_INTEGER);
                    cdolist_list_var_$8 = cdolist_list_var_$8.rest();
                    contextualized_asent = cdolist_list_var_$8.first();
                }
                cdolist_list_var = cdolist_list_var.rest();
                contextualized_clause = cdolist_list_var.first();
            }
            relevance = Numbers.subtract(set.set_size($relevant_term_set$.getDynamicValue(thread)), set.set_size($irrelevant_term_set$.getDynamicValue(thread)));
        } finally {
            $irrelevant_term_set$.rebind(_prev_bind_2, thread);
            $relevant_term_set$.rebind(_prev_bind_0, thread);
        }
        return relevance;
    }

    @SubL(source = "cycl/inference/harness/inference-strategic-heuristics.lisp", position = 32800L)
    public static SubLObject problem_relevant_or_irrelevant_term_count_int(SubLObject problem) {
        SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject v_memoization_state = memoization_state.$memoization_state$.getDynamicValue(thread);
        SubLObject caching_state = NIL;
        if (NIL == v_memoization_state) {
            return problem_relevant_or_irrelevant_term_count_int_internal(problem);
        }
        caching_state = memoization_state.memoization_state_lookup(v_memoization_state, $sym79$PROBLEM_RELEVANT_OR_IRRELEVANT_TERM_COUNT_INT, UNPROVIDED);
        if (NIL == caching_state) {
            caching_state = memoization_state.create_caching_state(memoization_state.memoization_state_lock(v_memoization_state), $sym79$PROBLEM_RELEVANT_OR_IRRELEVANT_TERM_COUNT_INT, ONE_INTEGER, NIL, EQL, UNPROVIDED);
            memoization_state.memoization_state_put(v_memoization_state, $sym79$PROBLEM_RELEVANT_OR_IRRELEVANT_TERM_COUNT_INT, caching_state);
        }
        SubLObject results = memoization_state.caching_state_lookup(caching_state, problem, memoization_state.$memoized_item_not_found$.getGlobalValue());
        if (results.eql(memoization_state.$memoized_item_not_found$.getGlobalValue())) {
            results = Values.arg2(thread.resetMultipleValues(), Values.multiple_value_list(problem_relevant_or_irrelevant_term_count_int_internal(problem)));
            memoization_state.caching_state_put(caching_state, problem, results, UNPROVIDED);
        }
        return memoization_state.caching_results(results);
    }

    @SubL(source = "cycl/inference/harness/inference-strategic-heuristics.lisp", position = 33600L)
    public static SubLObject note_expression_relevant_or_irrelevant_terms(SubLObject expression) {
        return cycl_utilities.expression_map($sym83$ACCUMULATE_RELEVANT_OR_IRRELEVANT_TERM, expression, UNPROVIDED, UNPROVIDED);
    }

    @SubL(source = "cycl/inference/harness/inference-strategic-heuristics.lisp", position = 33800L)
    public static SubLObject accumulate_relevant_or_irrelevant_term(SubLObject v_term) {
        SubLThread thread = SubLProcess.currentSubLThread();
        if (NIL != forts.fort_p(v_term)) {
            if (NIL != inference_trampolines.inference_relevant_termP(v_term, UNPROVIDED)) {
                set.set_add(v_term, $relevant_term_set$.getDynamicValue(thread));
            }
            if (NIL != inference_trampolines.inference_irrelevant_termP(v_term, UNPROVIDED)) {
                set.set_add(v_term, $irrelevant_term_set$.getDynamicValue(thread));
            }
        }
        return NIL;
    }

    @SubL(source = "cycl/inference/harness/inference-strategic-heuristics.lisp", position = 34700L)
    public static SubLObject strategic_heuristic_rule_historical_utility_enabledP() {
        SubLThread thread = SubLProcess.currentSubLThread();
        return $strategic_heuristic_rule_historical_utility_enabledP$.getDynamicValue(thread);
    }

    @SubL(source = "cycl/inference/harness/inference-strategic-heuristics.lisp", position = 34800L)
    public static SubLObject enable_strategic_heuristic_rule_historical_utility() {
        $strategic_heuristic_rule_historical_utility_enabledP$.setDynamicValue(T);
        return T;
    }

    @SubL(source = "cycl/inference/harness/inference-strategic-heuristics.lisp", position = 34900L)
    public static SubLObject disable_strategic_heuristic_rule_historical_utility() {
        $strategic_heuristic_rule_historical_utility_enabledP$.setDynamicValue(NIL);
        return NIL;
    }

    @SubL(source = "cycl/inference/harness/inference-strategic-heuristics.lisp", position = 35700L)
    public static SubLObject strategic_heuristic_rule_historical_utility(SubLObject strategy, SubLObject content_tactic) {
        return strategic_heuristic_rule_historical_utility_int(strategy, inference_datastructures_tactic.tactic_problem(content_tactic), content_tactic);
    }

    @SubL(source = "cycl/inference/harness/inference-strategic-heuristics.lisp", position = 36600L)
    public static SubLObject strategic_heuristic_rule_historical_utility_int(SubLObject strategy, SubLObject problem, SubLObject v_object) {
        SubLThread thread = SubLProcess.currentSubLThread();
        if (NIL == $strategic_heuristic_rule_historical_utility_enabledP$.getDynamicValue(thread)) {
            return ZERO_INTEGER;
        }
        SubLObject happiness = $int$100;
        SubLObject inference = inference_datastructures_strategy.strategy_inference(strategy);
        if (NIL != inference_strategist.inference_permits_transformationP(inference) && (NIL != inference_worker.problem_has_been_transformedP(problem, inference) || NIL != inference_worker_transformation.transformation_tactic_p(v_object))) {
            SubLObject _prev_bind_0 = $heuristic_rule_historical_utility_problem_recursion_stack$.currentBinding(thread);
            try {
                $heuristic_rule_historical_utility_problem_recursion_stack$.bind(set.new_set(Symbols.symbol_function(EQL), UNPROVIDED), thread);
                thread.resetMultipleValues();
                SubLObject total_utility = compute_problem_rule_historical_utility_recursive(problem, inference);
                SubLObject total_count = thread.secondMultipleValue();
                thread.resetMultipleValues();
                if ($LOOP != total_count) {
                    if (NIL != inference_worker.content_tactic_p(v_object)) {
                        thread.resetMultipleValues();
                        SubLObject delta_utility = compute_tactic_rule_historical_utility(v_object);
                        SubLObject delta_count = thread.secondMultipleValue();
                        thread.resetMultipleValues();
                        total_utility = Numbers.add(total_utility, delta_utility);
                        total_count = Numbers.add(total_count, delta_count);
                    }
                    if (!total_count.isZero()) {
                        happiness = Numbers.integerDivide(total_utility, total_count);
                    }
                }
            } finally {
                $heuristic_rule_historical_utility_problem_recursion_stack$.rebind(_prev_bind_0, thread);
            }
        }
        return happiness;
    }

    @SubL(source = "cycl/inference/harness/inference-strategic-heuristics.lisp", position = 37700L)
    public static SubLObject push_problem_onto_rule_historical_utility_stack(SubLObject problem) {
        SubLThread thread = SubLProcess.currentSubLThread();
        return set.set_add(problem, $heuristic_rule_historical_utility_problem_recursion_stack$.getDynamicValue(thread));
    }

    @SubL(source = "cycl/inference/harness/inference-strategic-heuristics.lisp", position = 37900L)
    public static SubLObject problem_on_rule_historical_utility_stackP(SubLObject problem) {
        SubLThread thread = SubLProcess.currentSubLThread();
        return set.set_memberP(problem, $heuristic_rule_historical_utility_problem_recursion_stack$.getDynamicValue(thread));
    }

    @SubL(source = "cycl/inference/harness/inference-strategic-heuristics.lisp", position = 38100L)
    public static SubLObject compute_problem_rule_historical_utility_recursive(SubLObject problem, SubLObject inference) {
        SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject best_utility = NIL;
        SubLObject best_total_count = NIL;
        SubLObject local_state = inference_datastructures_problem.problem_memoization_state(problem);
        SubLObject _prev_bind_0 = memoization_state.$memoization_state$.currentBinding(thread);
        try {
            memoization_state.$memoization_state$.bind(local_state, thread);
            SubLObject original_memoization_process = memoization_state.memoization_state_original_process(local_state);
            try {
                thread.resetMultipleValues();
                SubLObject best_utility_$13 = compute_problem_rule_historical_utility_recursive_int(problem, inference);
                SubLObject best_total_count_$14 = thread.secondMultipleValue();
                thread.resetMultipleValues();
                best_utility = best_utility_$13;
                best_total_count = best_total_count_$14;
            } finally {
                SubLObject _prev_bind_0_$15 = Threads.$is_thread_performing_cleanupP$.currentBinding(thread);
                try {
                    Threads.$is_thread_performing_cleanupP$.bind(T, thread);
                    SubLObject _values = Values.getValuesAsVector();
                    memoization_state.memoization_state_possibly_clear_original_process(local_state, original_memoization_process);
                    Values.restoreValuesFromVector(_values);
                } finally {
                    Threads.$is_thread_performing_cleanupP$.rebind(_prev_bind_0_$15, thread);
                }
            }
        } finally {
            memoization_state.$memoization_state$.rebind(_prev_bind_0, thread);
        }
        return Values.values(best_utility, best_total_count);
    }

    @SubL(source = "cycl/inference/harness/inference-strategic-heuristics.lisp", position = 38400L)
    public static SubLObject compute_problem_rule_historical_utility_recursive_int_internal(SubLObject problem, SubLObject inference) {
        SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject best_utility = ZERO_INTEGER;
        SubLObject best_total_count = ZERO_INTEGER;
        SubLObject best_ratio = Numbers.$most_negative_fixnum$.getGlobalValue();
        SubLObject found_a_loopP = NIL;
        SubLObject found_a_non_loopP = NIL;
        if (NIL != problem_on_rule_historical_utility_stackP(problem)) {
            return Values.values($LOOP, $LOOP);
        }
        push_problem_onto_rule_historical_utility_stack(problem);
        SubLObject set_contents_var = inference_datastructures_problem.problem_dependent_links(problem);
        SubLObject basis_object;
        SubLObject state;
        SubLObject dependent_link;
        SubLObject supported_problem;
        SubLObject utility;
        SubLObject total_count;
        SubLObject loopP;
        SubLObject rule_assertion;
        SubLObject local_utility;
        SubLObject best_sub_utility;
        SubLObject best_sub_total_count;
        SubLObject ratio;
        for (basis_object = set_contents.do_set_contents_basis_object(set_contents_var), state = NIL, state = set_contents.do_set_contents_initial_state(basis_object, set_contents_var); NIL == set_contents.do_set_contents_doneP(basis_object,
                state); state = set_contents.do_set_contents_update_state(state)) {
            dependent_link = set_contents.do_set_contents_next(basis_object, state);
            if (NIL != set_contents.do_set_contents_element_validP(state, dependent_link)) {
                supported_problem = inference_datastructures_problem_link.problem_link_supported_problem(dependent_link);
                utility = ZERO_INTEGER;
                total_count = ZERO_INTEGER;
                loopP = NIL;
                if (NIL != inference_worker_transformation.generalized_transformation_link_p(dependent_link)) {
                    total_count = Numbers.add(total_count, ONE_INTEGER);
                    if (NIL != inference_datastructures_problem.problem_relevant_to_inferenceP(problem, inference)) {
                        rule_assertion = inference_worker_transformation.generalized_transformation_link_rule_assertion(dependent_link);
                        local_utility = inference_analysis.transformation_rule_historical_utility(rule_assertion);
                        utility = Numbers.add(utility, local_utility);
                    }
                }
                if (NIL == inference_worker_answer.answer_link_p(dependent_link)) {
                    thread.resetMultipleValues();
                    best_sub_utility = compute_problem_rule_historical_utility_recursive(supported_problem, inference);
                    best_sub_total_count = thread.secondMultipleValue();
                    thread.resetMultipleValues();
                    if ($LOOP == best_sub_total_count) {
                        loopP = T;
                        found_a_loopP = T;
                    } else {
                        found_a_non_loopP = T;
                        utility = Numbers.add(utility, best_sub_utility);
                        total_count = Numbers.add(total_count, best_sub_total_count);
                    }
                }
                if (NIL == loopP) {
                    ratio = total_count.isZero() ? ZERO_INTEGER : Numbers.divide(utility, total_count);
                    if (ratio.numG(best_ratio) || (ratio.numE(best_ratio) && total_count.numL(best_total_count))) {
                        best_utility = utility;
                        best_total_count = total_count;
                        best_ratio = ratio;
                    }
                }
            }
        }
        if (NIL != found_a_loopP && NIL == found_a_non_loopP) {
            return Values.values($LOOP, $LOOP);
        }
        return Values.values(best_utility, best_total_count);
    }

    @SubL(source = "cycl/inference/harness/inference-strategic-heuristics.lisp", position = 38400L)
    public static SubLObject compute_problem_rule_historical_utility_recursive_int(SubLObject problem, SubLObject inference) {
        SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject v_memoization_state = memoization_state.$memoization_state$.getDynamicValue(thread);
        SubLObject caching_state = NIL;
        if (NIL == v_memoization_state) {
            return compute_problem_rule_historical_utility_recursive_int_internal(problem, inference);
        }
        caching_state = memoization_state.memoization_state_lookup(v_memoization_state, $sym87$COMPUTE_PROBLEM_RULE_HISTORICAL_UTILITY_RECURSIVE_INT, UNPROVIDED);
        if (NIL == caching_state) {
            caching_state = memoization_state.create_caching_state(memoization_state.memoization_state_lock(v_memoization_state), $sym87$COMPUTE_PROBLEM_RULE_HISTORICAL_UTILITY_RECURSIVE_INT, TWO_INTEGER, NIL, EQ, UNPROVIDED);
            memoization_state.memoization_state_put(v_memoization_state, $sym87$COMPUTE_PROBLEM_RULE_HISTORICAL_UTILITY_RECURSIVE_INT, caching_state);
        }
        SubLObject sxhash = memoization_state.sxhash_calc_2(problem, inference);
        SubLObject collisions = memoization_state.caching_state_lookup(caching_state, sxhash, UNPROVIDED);
        if (!collisions.eql(memoization_state.$memoized_item_not_found$.getGlobalValue())) {
            SubLObject cdolist_list_var = collisions;
            SubLObject collision = NIL;
            collision = cdolist_list_var.first();
            while (NIL != cdolist_list_var) {
                SubLObject cached_args = collision.first();
                SubLObject results2 = conses_high.second(collision);
                if (problem.eql(cached_args.first())) {
                    cached_args = cached_args.rest();
                    if (NIL != cached_args && NIL == cached_args.rest() && inference.eql(cached_args.first())) {
                        return memoization_state.caching_results(results2);
                    }
                }
                cdolist_list_var = cdolist_list_var.rest();
                collision = cdolist_list_var.first();
            }
        }
        SubLObject results3 = Values.arg2(thread.resetMultipleValues(), Values.multiple_value_list(compute_problem_rule_historical_utility_recursive_int_internal(problem, inference)));
        memoization_state.caching_state_enter_multi_key_n(caching_state, sxhash, collisions, results3, list(problem, inference));
        return memoization_state.caching_results(results3);
    }

    @SubL(source = "cycl/inference/harness/inference-strategic-heuristics.lisp", position = 41000L)
    public static SubLObject compute_tactic_rule_historical_utility(SubLObject tactic) {
        SubLObject delta_utility = ZERO_INTEGER;
        SubLObject delta_count = ZERO_INTEGER;
        if (NIL != inference_worker_transformation.transformation_tactic_p(tactic)) {
            SubLObject rule = inference_worker_transformation.transformation_tactic_lookahead_rule(tactic);
            if (NIL != rule) {
                delta_utility = Numbers.add(delta_utility, inference_analysis.transformation_rule_historical_utility(rule));
                delta_count = Numbers.add(delta_count, ONE_INTEGER);
            }
        }
        return Values.values(delta_utility, delta_count);
    }

    @SubL(source = "cycl/inference/harness/inference-strategic-heuristics.lisp", position = 41400L)
    public static SubLObject inference_rule_preference_G(SubLObject inference, SubLObject rule1, SubLObject rule2) {
        SubLObject rule1_allowedP = inference_datastructures_inference.inference_allows_use_of_ruleP(inference, rule1);
        SubLObject rule2_allowedP = inference_datastructures_inference.inference_allows_use_of_ruleP(inference, rule2);
        if (NIL != rule1_allowedP) {
            if (NIL != rule2_allowedP) {
                return transformation_rule_utility_G_with_tiebreaker(rule1, rule2);
            }
            return T;
        } else {
            if (NIL != rule2_allowedP) {
                return NIL;
            }
            return transformation_rule_utility_G_with_tiebreaker(rule1, rule2);
        }
    }

    @SubL(source = "cycl/inference/harness/inference-strategic-heuristics.lisp", position = 41900L)
    public static SubLObject transformation_rule_utility_G(SubLObject rule1, SubLObject rule2) {
        return Numbers.numG(transformation_rule_utility(rule1), transformation_rule_utility(rule2));
    }

    @SubL(source = "cycl/inference/harness/inference-strategic-heuristics.lisp", position = 42000L)
    public static SubLObject transformation_rule_utility_G_with_tiebreaker(SubLObject rule1, SubLObject rule2) {
        if (NIL != transformation_rule_utility_G(rule1, rule2)) {
            return T;
        }
        if (NIL != transformation_rule_utility_G(rule2, rule1)) {
            return NIL;
        }
        return Numbers.numL(assertion_utilities.rule_literal_count(rule1), assertion_utilities.rule_literal_count(rule2));
    }

    @SubL(source = "cycl/inference/harness/inference-strategic-heuristics.lisp", position = 42300L)
    public static SubLObject transformation_rule_utility_internal(SubLObject rule) {
        SubLThread thread = SubLProcess.currentSubLThread();
        assert NIL != assertions_high.rule_assertionP(rule) : rule;
        SubLObject historical_utility = (NIL != $strategic_heuristic_rule_historical_utility_enabledP$.getDynamicValue(thread)) ? inference_analysis.transformation_rule_historical_utility(rule) : ZERO_INTEGER;
        SubLObject a_priori_utility = transformation_rule_a_priori_utility_happiness(rule);
        return Numbers.add(historical_utility, a_priori_utility);
    }

    @SubL(source = "cycl/inference/harness/inference-strategic-heuristics.lisp", position = 42300L)
    public static SubLObject transformation_rule_utility(SubLObject rule) {
        SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject v_memoization_state = memoization_state.$memoization_state$.getDynamicValue(thread);
        SubLObject caching_state = NIL;
        if (NIL == v_memoization_state) {
            return transformation_rule_utility_internal(rule);
        }
        caching_state = memoization_state.memoization_state_lookup(v_memoization_state, $sym88$TRANSFORMATION_RULE_UTILITY, UNPROVIDED);
        if (NIL == caching_state) {
            caching_state = memoization_state.create_caching_state(memoization_state.memoization_state_lock(v_memoization_state), $sym88$TRANSFORMATION_RULE_UTILITY, ONE_INTEGER, NIL, EQL, UNPROVIDED);
            memoization_state.memoization_state_put(v_memoization_state, $sym88$TRANSFORMATION_RULE_UTILITY, caching_state);
        }
        SubLObject results = memoization_state.caching_state_lookup(caching_state, rule, memoization_state.$memoized_item_not_found$.getGlobalValue());
        if (results.eql(memoization_state.$memoized_item_not_found$.getGlobalValue())) {
            results = Values.arg2(thread.resetMultipleValues(), Values.multiple_value_list(transformation_rule_utility_internal(rule)));
            memoization_state.caching_state_put(caching_state, rule, results, UNPROVIDED);
        }
        return memoization_state.caching_results(results);
    }

    @SubL(source = "cycl/inference/harness/inference-strategic-heuristics.lisp", position = 43400L)
    public static SubLObject strategic_heuristic_problem_rule_historical_utility(SubLObject strategy, SubLObject problem) {
        return strategic_heuristic_rule_historical_utility_int(strategy, problem, problem);
    }

    @SubL(source = "cycl/inference/harness/inference-strategic-heuristics.lisp", position = 44400L)
    public static SubLObject enable_rule_historical_connectedness() {
        transformation_tactician.enable_transformation_tactician_tactic_heuristic($RULE_HISTORICAL_CONNECTEDNESS);
        $strategic_heuristic_rule_historical_connectedness_enabledP$.setDynamicValue(T);
        return NIL;
    }

    @SubL(source = "cycl/inference/harness/inference-strategic-heuristics.lisp", position = 44600L)
    public static SubLObject disable_rule_historical_connectedness() {
        transformation_tactician.disable_transformation_tactician_tactic_heuristic($RULE_HISTORICAL_CONNECTEDNESS);
        $strategic_heuristic_rule_historical_connectedness_enabledP$.setDynamicValue(NIL);
        return NIL;
    }

    @SubL(source = "cycl/inference/harness/inference-strategic-heuristics.lisp", position = 45300L)
    public static SubLObject strategic_heuristic_rule_historical_connectedness(SubLObject strategy, SubLObject content_tactic) {
        SubLThread thread = SubLProcess.currentSubLThread();
        if (NIL == $strategic_heuristic_rule_historical_connectedness_enabledP$.getDynamicValue(thread)) {
            return ZERO_INTEGER;
        }
        SubLObject happiness = $int$100;
        SubLObject inference = inference_datastructures_strategy.strategy_inference(strategy);
        if (NIL != inference_strategist.inference_permits_transformationP(inference)) {
            SubLObject problem = inference_datastructures_tactic.tactic_problem(content_tactic);
            if (NIL != inference_worker.problem_has_been_transformedP(problem, inference) || NIL != inference_worker_transformation.transformation_tactic_p(content_tactic)) {
                SubLObject rule_sets = tactic_lookahead_rule_sets_relevant_to_inference(content_tactic, inference);
                SubLObject best_percent = ZERO_INTEGER;
                SubLObject some_rule_set_usedP = NIL;
                SubLObject cdolist_list_var = rule_sets;
                SubLObject rule_set = NIL;
                rule_set = cdolist_list_var.first();
                while (NIL != cdolist_list_var) {
                    if (NIL != list_utilities.lengthGE(rule_set, TWO_INTEGER, UNPROVIDED)) {
                        SubLObject percent = inference_analysis.rule_historical_connectedness_percentage(rule_set);
                        some_rule_set_usedP = T;
                        best_percent = Numbers.max(best_percent, percent);
                    }
                    cdolist_list_var = cdolist_list_var.rest();
                    rule_set = cdolist_list_var.first();
                }
                if (NIL != some_rule_set_usedP) {
                    happiness = best_percent;
                }
            }
        }
        return happiness;
    }

    @SubL(source = "cycl/inference/harness/inference-strategic-heuristics.lisp", position = 47100L)
    public static SubLObject problem_link_paths_relevant_to_inference(SubLObject problem, SubLObject inference) {
        if (NIL != inference_datastructures_problem.problem_relevant_to_inferenceP(problem, inference)) {
            return Sequences.nreverse(problem_link_paths_relevant_to_inference_recursive(problem, inference, NIL));
        }
        return NIL;
    }

    @SubL(source = "cycl/inference/harness/inference-strategic-heuristics.lisp", position = 47400L)
    public static SubLObject cached_problem_link_paths_relevant_to_inference_internal(SubLObject problem, SubLObject inference) {
        return problem_link_paths_relevant_to_inference(problem, inference);
    }

    @SubL(source = "cycl/inference/harness/inference-strategic-heuristics.lisp", position = 47400L)
    public static SubLObject cached_problem_link_paths_relevant_to_inference(SubLObject problem, SubLObject inference) {
        SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject v_memoization_state = memoization_state.$memoization_state$.getDynamicValue(thread);
        SubLObject caching_state = NIL;
        if (NIL == v_memoization_state) {
            return cached_problem_link_paths_relevant_to_inference_internal(problem, inference);
        }
        caching_state = memoization_state.memoization_state_lookup(v_memoization_state, $sym96$CACHED_PROBLEM_LINK_PATHS_RELEVANT_TO_INFERENCE, UNPROVIDED);
        if (NIL == caching_state) {
            caching_state = memoization_state.create_caching_state(memoization_state.memoization_state_lock(v_memoization_state), $sym96$CACHED_PROBLEM_LINK_PATHS_RELEVANT_TO_INFERENCE, TWO_INTEGER, NIL, EQ, UNPROVIDED);
            memoization_state.memoization_state_put(v_memoization_state, $sym96$CACHED_PROBLEM_LINK_PATHS_RELEVANT_TO_INFERENCE, caching_state);
        }
        SubLObject sxhash = memoization_state.sxhash_calc_2(problem, inference);
        SubLObject collisions = memoization_state.caching_state_lookup(caching_state, sxhash, UNPROVIDED);
        if (!collisions.eql(memoization_state.$memoized_item_not_found$.getGlobalValue())) {
            SubLObject cdolist_list_var = collisions;
            SubLObject collision = NIL;
            collision = cdolist_list_var.first();
            while (NIL != cdolist_list_var) {
                SubLObject cached_args = collision.first();
                SubLObject results2 = conses_high.second(collision);
                if (problem.eql(cached_args.first())) {
                    cached_args = cached_args.rest();
                    if (NIL != cached_args && NIL == cached_args.rest() && inference.eql(cached_args.first())) {
                        return memoization_state.caching_results(results2);
                    }
                }
                cdolist_list_var = cdolist_list_var.rest();
                collision = cdolist_list_var.first();
            }
        }
        SubLObject results3 = Values.arg2(thread.resetMultipleValues(), Values.multiple_value_list(cached_problem_link_paths_relevant_to_inference_internal(problem, inference)));
        memoization_state.caching_state_enter_multi_key_n(caching_state, sxhash, collisions, results3, list(problem, inference));
        return memoization_state.caching_results(results3);
    }

    @SubL(source = "cycl/inference/harness/inference-strategic-heuristics.lisp", position = 47600L)
    public static SubLObject problem_link_paths_relevant_to_inference_recursive(SubLObject problem, SubLObject inference, SubLObject visitedP) {
        SubLObject new_visitedP = cons(problem, visitedP);
        SubLObject paths = NIL;
        SubLObject set_contents_var = inference_datastructures_problem.problem_dependent_links(problem);
        SubLObject basis_object;
        SubLObject state;
        SubLObject dependent_link;
        SubLObject supported_problem;
        SubLObject cdolist_list_var;
        SubLObject sub_paths;
        SubLObject sub_path;
        for (basis_object = set_contents.do_set_contents_basis_object(set_contents_var), state = NIL, state = set_contents.do_set_contents_initial_state(basis_object, set_contents_var); NIL == set_contents.do_set_contents_doneP(basis_object,
                state); state = set_contents.do_set_contents_update_state(state)) {
            dependent_link = set_contents.do_set_contents_next(basis_object, state);
            if (NIL != set_contents.do_set_contents_element_validP(state, dependent_link) && NIL != inference_datastructures_problem_link.problem_link_openP(dependent_link)) {
                if (inference.eql(inference_datastructures_problem_link.problem_link_supported_inference(dependent_link))) {
                    paths = cons(list(dependent_link), paths);
                } else {
                    supported_problem = inference_datastructures_problem_link.problem_link_supported_problem(dependent_link);
                    if (NIL == list_utilities.member_eqP(supported_problem, new_visitedP) && NIL != inference_datastructures_problem.problem_relevant_to_inferenceP(supported_problem, inference)) {
                        sub_paths = (cdolist_list_var = problem_link_paths_relevant_to_inference_recursive(supported_problem, inference, new_visitedP));
                        sub_path = NIL;
                        sub_path = cdolist_list_var.first();
                        while (NIL != cdolist_list_var) {
                            paths = cons(cons(dependent_link, sub_path), paths);
                            cdolist_list_var = cdolist_list_var.rest();
                            sub_path = cdolist_list_var.first();
                        }
                    }
                }
            }
        }
        return paths;
    }

    @SubL(source = "cycl/inference/harness/inference-strategic-heuristics.lisp", position = 48400L)
    public static SubLObject problem_rule_sets_relevant_to_inference(SubLObject problem, SubLObject inference) {
        assert NIL != inference_datastructures_problem.problem_p(problem) : problem;
        assert NIL != inference_datastructures_inference.inference_p(inference) : inference;
        SubLObject link_paths = problem_link_paths_relevant_to_inference(problem, inference);
        SubLObject rule_sets = Mapping.mapcar(Symbols.symbol_function($sym99$PROBLEM_LINK_PATH_RULE_SET), link_paths);
        return Sequences.delete_duplicates(rule_sets, Symbols.symbol_function(EQUAL), UNPROVIDED, UNPROVIDED, UNPROVIDED);
    }

    @SubL(source = "cycl/inference/harness/inference-strategic-heuristics.lisp", position = 48900L)
    public static SubLObject tactic_lookahead_rule_sets_relevant_to_inference(SubLObject tactic, SubLObject inference) {
        assert NIL != inference_datastructures_tactic.tactic_p(tactic) : tactic;
        assert NIL != inference_datastructures_inference.inference_p(inference) : inference;
        SubLObject problem = inference_datastructures_tactic.tactic_problem(tactic);
        SubLObject rule_sets_to_problem = problem_rule_sets_relevant_to_inference(problem, inference);
        if (NIL == inference_worker_transformation.transformation_tactic_p(tactic)) {
            return rule_sets_to_problem;
        }
        SubLObject lookahead_rule = inference_worker_transformation.transformation_tactic_lookahead_rule(tactic);
        if (NIL == lookahead_rule) {
            return rule_sets_to_problem;
        }
        SubLObject lookahead_rule_sets = NIL;
        SubLObject cdolist_list_var = rule_sets_to_problem;
        SubLObject rule_set_to_problem = NIL;
        rule_set_to_problem = cdolist_list_var.first();
        while (NIL != cdolist_list_var) {
            SubLObject lookahead_rule_set = conses_high.adjoin(lookahead_rule, rule_set_to_problem, Symbols.symbol_function(EQL), UNPROVIDED);
            SubLObject item_var;
            lookahead_rule_set = (item_var = assertion_utilities.sort_assertions(lookahead_rule_set));
            if (NIL == conses_high.member(item_var, lookahead_rule_sets, Symbols.symbol_function(EQUAL), Symbols.symbol_function(IDENTITY))) {
                lookahead_rule_sets = cons(item_var, lookahead_rule_sets);
            }
            cdolist_list_var = cdolist_list_var.rest();
            rule_set_to_problem = cdolist_list_var.first();
        }
        return Sequences.nreverse(lookahead_rule_sets);
    }

    @SubL(source = "cycl/inference/harness/inference-strategic-heuristics.lisp", position = 49700L)
    public static SubLObject problem_link_path_rule_set(SubLObject link_path) {
        SubLObject rules = NIL;
        SubLObject cdolist_list_var = link_path;
        SubLObject link = NIL;
        link = cdolist_list_var.first();
        while (NIL != cdolist_list_var) {
            if (NIL != inference_worker_transformation.generalized_transformation_link_p(link)) {
                SubLObject item_var;
                SubLObject rule = item_var = inference_worker_transformation.generalized_transformation_link_rule_assertion(link);
                if (NIL == conses_high.member(item_var, rules, Symbols.symbol_function(EQL), Symbols.symbol_function(IDENTITY))) {
                    rules = cons(item_var, rules);
                }
            }
            cdolist_list_var = cdolist_list_var.rest();
            link = cdolist_list_var.first();
        }
        rules = assertion_utilities.sort_assertions(rules);
        return rules;
    }

    @SubL(source = "cycl/inference/harness/inference-strategic-heuristics.lisp", position = 51600L)
    public static SubLObject strategic_heuristic_literal_count(SubLObject strategy, SubLObject problem) {
        SubLObject literal_count = inference_datastructures_problem.problem_literal_count(problem, UNPROVIDED);
        SubLObject happiness = strategic_heuristic_happiness_due_to_literal_count(literal_count);
        return happiness;
    }

    @SubL(source = "cycl/inference/harness/inference-strategic-heuristics.lisp", position = 52200L)
    public static SubLObject strategic_heuristic_rule_literal_count(SubLObject strategy, SubLObject transformation_tactic) {
        if (NIL == inference_worker_transformation.transformation_tactic_p(transformation_tactic)) {
            return ZERO_INTEGER;
        }
        SubLObject rule_assertion = inference_worker_transformation.transformation_tactic_lookahead_rule(transformation_tactic);
        if (NIL != rule_assertion) {
            SubLObject literal_count = assertion_utilities.rule_literal_count(rule_assertion);
            SubLObject happiness = strategic_heuristic_happiness_due_to_literal_count(literal_count);
            return happiness;
        }
        return ZERO_INTEGER;
    }

    @SubL(source = "cycl/inference/harness/inference-strategic-heuristics.lisp", position = 52800L)
    public static SubLObject strategic_heuristic_happiness_due_to_literal_count(SubLObject literal_count) {
        return numeric_table_lookup(literal_count, $strategic_heuristic_literal_count_lookup_table$.getGlobalValue(), UNPROVIDED);
    }

    @SubL(source = "cycl/inference/harness/inference-strategic-heuristics.lisp", position = 53400L)
    public static SubLObject numeric_table_lookup(SubLObject n, SubLObject lookup_table, SubLObject v_default) {
        if (v_default == UNPROVIDED) {
            v_default = NIL;
        }
        SubLObject cdolist_list_var = lookup_table;
        SubLObject cons = NIL;
        cons = cdolist_list_var.first();
        while (NIL != cdolist_list_var) {
            SubLObject current;
            SubLObject datum = current = cons;
            SubLObject input = NIL;
            SubLObject output = NIL;
            cdestructuring_bind.destructuring_bind_must_consp(current, datum, $list108);
            input = current.first();
            current = (output = current.rest());
            if (NIL != number_utilities.potentially_infinite_number_LE(n, input)) {
                return output;
            }
            cdolist_list_var = cdolist_list_var.rest();
            cons = cdolist_list_var.first();
        }
        return v_default;
    }

    @SubL(source = "cycl/inference/harness/inference-strategic-heuristics.lisp", position = 54200L)
    public static SubLObject strategic_heuristic_skolem_count(SubLObject strategy, SubLObject problem) {
        SubLObject skolem_count = problem_skolem_count(problem);
        SubLObject happiness = strategic_heuristic_happiness_due_to_skolem_count(skolem_count);
        return happiness;
    }

    @SubL(source = "cycl/inference/harness/inference-strategic-heuristics.lisp", position = 54500L)
    public static SubLObject problem_skolem_count(SubLObject problem) {
        SubLObject query = inference_datastructures_problem.problem_query(problem);
        return list_utilities.tree_count_if($sym112$SKOLEM_FUNCTION_P, query, UNPROVIDED);
    }

    @SubL(source = "cycl/inference/harness/inference-strategic-heuristics.lisp", position = 54600L)
    public static SubLObject strategic_heuristic_happiness_due_to_skolem_count(SubLObject skolem_count) {
        return numeric_table_lookup(skolem_count, $strategic_heuristic_skolem_count_lookup_table$.getGlobalValue(), UNPROVIDED);
    }

    @SubL(source = "cycl/inference/harness/inference-strategic-heuristics.lisp", position = 55100L)
    public static SubLObject strategic_heuristic_happiness_table(SubLObject strategy, SubLObject strategem, SubLObject heuristics) {
        SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject happiness_table = NIL;
        SubLObject aggregate_happiness = ZERO_INTEGER;
        SubLObject iteration_state;
        for (iteration_state = dictionary_contents.do_dictionary_contents_state(dictionary.dictionary_contents(strategic_heuristic_index())); NIL == dictionary_contents.do_dictionary_contents_doneP(iteration_state); iteration_state = dictionary_contents.do_dictionary_contents_next(
                iteration_state)) {
            thread.resetMultipleValues();
            SubLObject heuristic = dictionary_contents.do_dictionary_contents_key_value(iteration_state);
            SubLObject value = thread.secondMultipleValue();
            thread.resetMultipleValues();
            SubLObject function = strategic_heuristic_function(heuristic);
            SubLObject scaling_factor = strategic_heuristic_scaling_factor(heuristic);
            SubLObject domain = strategic_heuristic_domain(heuristic);
            if (NIL != do_strategic_heuristics_tactic_match_p(strategem, domain) && NIL != set.set_memberP(heuristic, heuristics)) {
                SubLObject raw_happiness = Functions.funcall(function, strategy, strategem);
                if (!ZERO_INTEGER.eql(raw_happiness)) {
                    SubLObject scaled_happiness = number_utilities.potentially_infinite_integer_times(raw_happiness, scaling_factor);
                    aggregate_happiness = number_utilities.potentially_infinite_integer_plus(aggregate_happiness, scaled_happiness);
                    happiness_table = cons(list(heuristic, scaling_factor, raw_happiness, scaled_happiness), happiness_table);
                }
            }
        }
        dictionary_contents.do_dictionary_contents_finalize(iteration_state);
        happiness_table = Sort.sort(happiness_table, Symbols.symbol_function($sym114$HAPPINESS__), Symbols.symbol_function($sym115$THIRD));
        happiness_table = Sort.stable_sort(happiness_table, Symbols.symbol_function($sym114$HAPPINESS__), Symbols.symbol_function($sym116$FOURTH));
        return Values.values(happiness_table, aggregate_happiness);
    }

    @SubL(source = "cycl/inference/harness/inference-strategic-heuristics.lisp", position = 56400L)
    public static SubLObject strategic_heuristic_t_flows_like_wine(SubLObject strategy, SubLObject tactic) {
        if (NIL != inference_worker.structural_tactic_p(tactic)) {
            return ONE_INTEGER;
        }
        return ZERO_INTEGER;
    }

    public static SubLObject declare_inference_strategic_heuristics_file() {
        declareFunction(myName, "strategic_heuristic_index", "STRATEGIC-HEURISTIC-INDEX", 0, 0, false);
        declareMacro(me, "do_strategic_heuristics", "DO-STRATEGIC-HEURISTICS");
        declareFunction(myName, "do_strategic_heuristics_tactic_match_p", "DO-STRATEGIC-HEURISTICS-TACTIC-MATCH-P", 2, 0, false);
        declareFunction(myName, "heuristic_domain_p", "HEURISTIC-DOMAIN-P", 1, 0, false);
        declareFunction(myName, "object_in_heuristic_domainP", "OBJECT-IN-HEURISTIC-DOMAIN?", 2, 0, false);
        declareFunction(myName, "new_strategic_heuristic_data", "NEW-STRATEGIC-HEURISTIC-DATA", 5, 0, false);
        declareFunction(myName, "declare_strategic_heuristic", "DECLARE-STRATEGIC-HEURISTIC", 2, 0, false);
        declareFunction(myName, "undeclare_strategic_heuristic", "UNDECLARE-STRATEGIC-HEURISTIC", 1, 0, false);
        declareFunction(myName, "strategic_heuristic_function", "STRATEGIC-HEURISTIC-FUNCTION", 1, 0, false);
        declareFunction(myName, "strategic_heuristic_scaling_factor", "STRATEGIC-HEURISTIC-SCALING-FACTOR", 1, 0, false);
        declareFunction(myName, "strategic_heuristic_name", "STRATEGIC-HEURISTIC-NAME", 1, 0, false);
        declareFunction(myName, "strategic_heuristic_pretty_name", "STRATEGIC-HEURISTIC-PRETTY-NAME", 1, 0, false);
        declareFunction(myName, "strategic_heuristic_comment", "STRATEGIC-HEURISTIC-COMMENT", 1, 0, false);
        declareFunction(myName, "strategic_heuristic_domain", "STRATEGIC-HEURISTIC-DOMAIN", 1, 0, false);
        declareFunction(myName, "strategic_heuristic_shallow_and_cheap", "STRATEGIC-HEURISTIC-SHALLOW-AND-CHEAP", 2, 0, false);
        new $strategic_heuristic_shallow_and_cheap$BinaryFunction();
        declareFunction(myName, "productivity_for_shallow_and_cheap_problem_heuristic", "PRODUCTIVITY-FOR-SHALLOW-AND-CHEAP-PROBLEM-HEURISTIC", 2, 0, false);
        declareFunction(myName, "problem_strategic_uselessness_based_on_proof_depth", "PROBLEM-STRATEGIC-USELESSNESS-BASED-ON-PROOF-DEPTH", 2, 0, false);
        declareFunction(myName, "clear_strategic_uselessness_based_on_proof_depth_math_memoized", "CLEAR-STRATEGIC-USELESSNESS-BASED-ON-PROOF-DEPTH-MATH-MEMOIZED", 0, 0, false);
        declareFunction(myName, "remove_strategic_uselessness_based_on_proof_depth_math_memoized", "REMOVE-STRATEGIC-USELESSNESS-BASED-ON-PROOF-DEPTH-MATH-MEMOIZED", 1, 0, false);
        declareFunction(myName, "strategic_uselessness_based_on_proof_depth_math_memoized_internal", "STRATEGIC-USELESSNESS-BASED-ON-PROOF-DEPTH-MATH-MEMOIZED-INTERNAL", 1, 0, false);
        declareFunction(myName, "strategic_uselessness_based_on_proof_depth_math_memoized", "STRATEGIC-USELESSNESS-BASED-ON-PROOF-DEPTH-MATH-MEMOIZED", 1, 0, false);
        declareFunction(myName, "strategic_heuristic_completeness", "STRATEGIC-HEURISTIC-COMPLETENESS", 2, 0, false);
        new $strategic_heuristic_completeness$BinaryFunction();
        declareFunction(myName, "strategic_heuristic_occams_razor", "STRATEGIC-HEURISTIC-OCCAMS-RAZOR", 2, 0, false);
        new $strategic_heuristic_occams_razor$BinaryFunction();
        declareFunction(myName, "strategic_heuristic_occams_razor_int", "STRATEGIC-HEURISTIC-OCCAMS-RAZOR-INT", 3, 0, false);
        declareFunction(myName, "strategic_heuristic_occams_razor_tactic", "STRATEGIC-HEURISTIC-OCCAMS-RAZOR-TACTIC", 2, 0, false);
        declareFunction(myName, "strategic_heuristic_magic_wand", "STRATEGIC-HEURISTIC-MAGIC-WAND", 2, 0, false);
        new $strategic_heuristic_magic_wand$BinaryFunction();
        declareFunction(myName, "strategic_heuristic_backtracking", "STRATEGIC-HEURISTIC-BACKTRACKING", 2, 0, false);
        declareFunction(myName, "executed_connected_conjunction_tactics_that_matter_count", "EXECUTED-CONNECTED-CONJUNCTION-TACTICS-THAT-MATTER-COUNT", 2, 0, false);
        declareFunction(myName, "strategic_heuristic_backchain_required", "STRATEGIC-HEURISTIC-BACKCHAIN-REQUIRED", 2, 0, false);
        new $strategic_heuristic_backchain_required$BinaryFunction();
        declareFunction(myName, "strategic_heuristic_rule_a_priori_utility", "STRATEGIC-HEURISTIC-RULE-A-PRIORI-UTILITY", 2, 0, false);
        new $strategic_heuristic_rule_a_priori_utility$BinaryFunction();
        declareFunction(myName, "strategic_heuristic_rule_a_priori_utility_int", "STRATEGIC-HEURISTIC-RULE-A-PRIORI-UTILITY-INT", 3, 0, false);
        declareFunction(myName, "push_problem_onto_heuristic_rule_a_priori_utility_stack", "PUSH-PROBLEM-ONTO-HEURISTIC-RULE-A-PRIORI-UTILITY-STACK", 1, 0, false);
        declareFunction(myName, "problem_on_heuristic_rule_a_priori_utility_stackP", "PROBLEM-ON-HEURISTIC-RULE-A-PRIORI-UTILITY-STACK?", 1, 0, false);
        declareFunction(myName, "count_a_priori_utility_recursive", "COUNT-A-PRIORI-UTILITY-RECURSIVE", 2, 0, false);
        declareFunction(myName, "count_a_priori_utility_recursive_int_internal", "COUNT-A-PRIORI-UTILITY-RECURSIVE-INT-INTERNAL", 2, 0, false);
        declareFunction(myName, "count_a_priori_utility_recursive_int", "COUNT-A-PRIORI-UTILITY-RECURSIVE-INT", 2, 0, false);
        declareFunction(myName, "determine_tactic_heuristic_relevance_delta", "DETERMINE-TACTIC-HEURISTIC-RELEVANCE-DELTA", 1, 0, false);
        declareFunction(myName, "generalized_transformation_link_relevantP", "GENERALIZED-TRANSFORMATION-LINK-RELEVANT?", 1, 0, false);
        declareFunction(myName, "generalized_transformation_link_irrelevantP", "GENERALIZED-TRANSFORMATION-LINK-IRRELEVANT?", 1, 0, false);
        declareFunction(myName, "generalized_transformation_link_has_rule_utilityP", "GENERALIZED-TRANSFORMATION-LINK-HAS-RULE-UTILITY?", 1, 0, false);
        declareFunction(myName, "generalized_transformation_link_rule_utility", "GENERALIZED-TRANSFORMATION-LINK-RULE-UTILITY", 1, 0, false);
        declareFunction(myName, "transformation_tactic_relevantP", "TRANSFORMATION-TACTIC-RELEVANT?", 1, 0, false);
        declareFunction(myName, "transformation_tactic_irrelevantP", "TRANSFORMATION-TACTIC-IRRELEVANT?", 1, 0, false);
        declareFunction(myName, "transformation_tactic_has_utilityP", "TRANSFORMATION-TACTIC-HAS-UTILITY?", 1, 0, false);
        declareFunction(myName, "transformation_tactic_utility", "TRANSFORMATION-TACTIC-UTILITY", 1, 0, false);
        declareFunction(myName, "rule_relevant_to_problemP", "RULE-RELEVANT-TO-PROBLEM?", 2, 0, false);
        declareFunction(myName, "rule_irrelevant_to_problemP", "RULE-IRRELEVANT-TO-PROBLEM?", 2, 0, false);
        declareFunction(myName, "rule_has_utility_wrt_problemP", "RULE-HAS-UTILITY-WRT-PROBLEM?", 2, 0, false);
        declareFunction(myName, "transformation_rule_a_priori_utility", "TRANSFORMATION-RULE-A-PRIORI-UTILITY", 1, 0, false);
        declareFunction(myName, "transformation_rule_a_priori_utility_happiness_internal", "TRANSFORMATION-RULE-A-PRIORI-UTILITY-HAPPINESS-INTERNAL", 1, 0, false);
        declareFunction(myName, "transformation_rule_a_priori_utility_happiness", "TRANSFORMATION-RULE-A-PRIORI-UTILITY-HAPPINESS", 1, 0, false);
        declareFunction(myName, "strategic_heuristic_problem_rule_a_priori_utility", "STRATEGIC-HEURISTIC-PROBLEM-RULE-A-PRIORI-UTILITY", 2, 0, false);
        declareFunction(myName, "strategic_heuristic_relevant_term", "STRATEGIC-HEURISTIC-RELEVANT-TERM", 2, 0, false);
        new $strategic_heuristic_relevant_term$BinaryFunction();
        declareFunction(myName, "problem_relevant_or_irrelevant_term_count", "PROBLEM-RELEVANT-OR-IRRELEVANT-TERM-COUNT", 1, 0, false);
        declareFunction(myName, "problem_relevant_or_irrelevant_term_count_int_internal", "PROBLEM-RELEVANT-OR-IRRELEVANT-TERM-COUNT-INT-INTERNAL", 1, 0, false);
        declareFunction(myName, "problem_relevant_or_irrelevant_term_count_int", "PROBLEM-RELEVANT-OR-IRRELEVANT-TERM-COUNT-INT", 1, 0, false);
        declareFunction(myName, "note_expression_relevant_or_irrelevant_terms", "NOTE-EXPRESSION-RELEVANT-OR-IRRELEVANT-TERMS", 1, 0, false);
        declareFunction(myName, "accumulate_relevant_or_irrelevant_term", "ACCUMULATE-RELEVANT-OR-IRRELEVANT-TERM", 1, 0, false);
        declareFunction(myName, "strategic_heuristic_rule_historical_utility_enabledP", "STRATEGIC-HEURISTIC-RULE-HISTORICAL-UTILITY-ENABLED?", 0, 0, false);
        declareFunction(myName, "enable_strategic_heuristic_rule_historical_utility", "ENABLE-STRATEGIC-HEURISTIC-RULE-HISTORICAL-UTILITY", 0, 0, false);
        declareFunction(myName, "disable_strategic_heuristic_rule_historical_utility", "DISABLE-STRATEGIC-HEURISTIC-RULE-HISTORICAL-UTILITY", 0, 0, false);
        declareFunction(myName, "strategic_heuristic_rule_historical_utility", "STRATEGIC-HEURISTIC-RULE-HISTORICAL-UTILITY", 2, 0, false);
        new $strategic_heuristic_rule_historical_utility$BinaryFunction();
        declareFunction(myName, "strategic_heuristic_rule_historical_utility_int", "STRATEGIC-HEURISTIC-RULE-HISTORICAL-UTILITY-INT", 3, 0, false);
        declareFunction(myName, "push_problem_onto_rule_historical_utility_stack", "PUSH-PROBLEM-ONTO-RULE-HISTORICAL-UTILITY-STACK", 1, 0, false);
        declareFunction(myName, "problem_on_rule_historical_utility_stackP", "PROBLEM-ON-RULE-HISTORICAL-UTILITY-STACK?", 1, 0, false);
        declareFunction(myName, "compute_problem_rule_historical_utility_recursive", "COMPUTE-PROBLEM-RULE-HISTORICAL-UTILITY-RECURSIVE", 2, 0, false);
        declareFunction(myName, "compute_problem_rule_historical_utility_recursive_int_internal", "COMPUTE-PROBLEM-RULE-HISTORICAL-UTILITY-RECURSIVE-INT-INTERNAL", 2, 0, false);
        declareFunction(myName, "compute_problem_rule_historical_utility_recursive_int", "COMPUTE-PROBLEM-RULE-HISTORICAL-UTILITY-RECURSIVE-INT", 2, 0, false);
        declareFunction(myName, "compute_tactic_rule_historical_utility", "COMPUTE-TACTIC-RULE-HISTORICAL-UTILITY", 1, 0, false);
        declareFunction(myName, "inference_rule_preference_G", "INFERENCE-RULE-PREFERENCE->", 3, 0, false);
        declareFunction(myName, "transformation_rule_utility_G", "TRANSFORMATION-RULE-UTILITY->", 2, 0, false);
        declareFunction(myName, "transformation_rule_utility_G_with_tiebreaker", "TRANSFORMATION-RULE-UTILITY->-WITH-TIEBREAKER", 2, 0, false);
        declareFunction(myName, "transformation_rule_utility_internal", "TRANSFORMATION-RULE-UTILITY-INTERNAL", 1, 0, false);
        declareFunction(myName, "transformation_rule_utility", "TRANSFORMATION-RULE-UTILITY", 1, 0, false);
        declareFunction(myName, "strategic_heuristic_problem_rule_historical_utility", "STRATEGIC-HEURISTIC-PROBLEM-RULE-HISTORICAL-UTILITY", 2, 0, false);
        declareFunction(myName, "enable_rule_historical_connectedness", "ENABLE-RULE-HISTORICAL-CONNECTEDNESS", 0, 0, false);
        declareFunction(myName, "disable_rule_historical_connectedness", "DISABLE-RULE-HISTORICAL-CONNECTEDNESS", 0, 0, false);
        declareFunction(myName, "strategic_heuristic_rule_historical_connectedness", "STRATEGIC-HEURISTIC-RULE-HISTORICAL-CONNECTEDNESS", 2, 0, false);
        declareFunction(myName, "problem_link_paths_relevant_to_inference", "PROBLEM-LINK-PATHS-RELEVANT-TO-INFERENCE", 2, 0, false);
        declareFunction(myName, "cached_problem_link_paths_relevant_to_inference_internal", "CACHED-PROBLEM-LINK-PATHS-RELEVANT-TO-INFERENCE-INTERNAL", 2, 0, false);
        declareFunction(myName, "cached_problem_link_paths_relevant_to_inference", "CACHED-PROBLEM-LINK-PATHS-RELEVANT-TO-INFERENCE", 2, 0, false);
        declareFunction(myName, "problem_link_paths_relevant_to_inference_recursive", "PROBLEM-LINK-PATHS-RELEVANT-TO-INFERENCE-RECURSIVE", 3, 0, false);
        declareFunction(myName, "problem_rule_sets_relevant_to_inference", "PROBLEM-RULE-SETS-RELEVANT-TO-INFERENCE", 2, 0, false);
        declareFunction(myName, "tactic_lookahead_rule_sets_relevant_to_inference", "TACTIC-LOOKAHEAD-RULE-SETS-RELEVANT-TO-INFERENCE", 2, 0, false);
        declareFunction(myName, "problem_link_path_rule_set", "PROBLEM-LINK-PATH-RULE-SET", 1, 0, false);
        declareFunction(myName, "strategic_heuristic_literal_count", "STRATEGIC-HEURISTIC-LITERAL-COUNT", 2, 0, false);
        declareFunction(myName, "strategic_heuristic_rule_literal_count", "STRATEGIC-HEURISTIC-RULE-LITERAL-COUNT", 2, 0, false);
        new $strategic_heuristic_rule_literal_count$BinaryFunction();
        declareFunction(myName, "strategic_heuristic_happiness_due_to_literal_count", "STRATEGIC-HEURISTIC-HAPPINESS-DUE-TO-LITERAL-COUNT", 1, 0, false);
        declareFunction(myName, "numeric_table_lookup", "NUMERIC-TABLE-LOOKUP", 2, 1, false);
        declareFunction(myName, "strategic_heuristic_skolem_count", "STRATEGIC-HEURISTIC-SKOLEM-COUNT", 2, 0, false);
        declareFunction(myName, "problem_skolem_count", "PROBLEM-SKOLEM-COUNT", 1, 0, false);
        declareFunction(myName, "strategic_heuristic_happiness_due_to_skolem_count", "STRATEGIC-HEURISTIC-HAPPINESS-DUE-TO-SKOLEM-COUNT", 1, 0, false);
        declareFunction(myName, "strategic_heuristic_happiness_table", "STRATEGIC-HEURISTIC-HAPPINESS-TABLE", 3, 0, false);
        declareFunction(myName, "strategic_heuristic_t_flows_like_wine", "STRATEGIC-HEURISTIC-T-FLOWS-LIKE-WINE", 2, 0, false);
        return NIL;
    }

    public static SubLObject init_inference_strategic_heuristics_file() {
        $strategic_heuristic_index$ = deflexical("*STRATEGIC-HEURISTIC-INDEX*", maybeDefault($sym0$_STRATEGIC_HEURISTIC_INDEX_, $strategic_heuristic_index$, () -> (dictionary.new_dictionary(Symbols.symbol_function(EQ), UNPROVIDED))));
        $heuristic_domains$ = deflexical("*HEURISTIC-DOMAINS*", $list17);
        $overriding_strategic_heuristic_scaling_factors$ = SubLFiles.defvar("*OVERRIDING-STRATEGIC-HEURISTIC-SCALING-FACTORS*", NIL);
        $strategic_uselessness_based_on_proof_depth_math_memoized_caching_state$ = SubLFiles.deflexical("*STRATEGIC-USELESSNESS-BASED-ON-PROOF-DEPTH-MATH-MEMOIZED-CACHING-STATE*", NIL);
        $strategic_heuristic_occams_razor_table$ = deflexical("*STRATEGIC-HEURISTIC-OCCAMS-RAZOR-TABLE*", $list46);
        $strategic_heuristic_occams_razor_table_default$ = SubLFiles.deflexical("*STRATEGIC-HEURISTIC-OCCAMS-RAZOR-TABLE-DEFAULT*", $int$_100);
        $backtracking_considered_harmfulP$ = defvar("*BACKTRACKING-CONSIDERED-HARMFUL?*", T);
        $strategic_heuristic_backtracking_table$ = deflexical("*STRATEGIC-HEURISTIC-BACKTRACKING-TABLE*", $list58);
        $strategic_heuristic_backtracking_table_default$ = SubLFiles.deflexical("*STRATEGIC-HEURISTIC-BACKTRACKING-TABLE-DEFAULT*", $int$_100);
        $early_removal_productivity_threshold$ = defvar("*EARLY-REMOVAL-PRODUCTIVITY-THRESHOLD*", $int$400);
        $heuristic_rule_a_priori_utility_problem_recursion_stack$ = SubLFiles.defparameter("*HEURISTIC-RULE-A-PRIORI-UTILITY-PROBLEM-RECURSION-STACK*", NIL);
        $highly_relevant_term_enabledP$ = defvar("*HIGHLY-RELEVANT-TERM-ENABLED?*", T);
        $relevant_term_set$ = defparameter("*RELEVANT-TERM-SET*", NIL);
        $irrelevant_term_set$ = defparameter("*IRRELEVANT-TERM-SET*", NIL);
        $strategic_heuristic_rule_historical_utility_enabledP$ = SubLFiles.defvar("*STRATEGIC-HEURISTIC-RULE-HISTORICAL-UTILITY-ENABLED?*", T);
        $heuristic_rule_historical_utility_problem_recursion_stack$ = SubLFiles.defparameter("*HEURISTIC-RULE-HISTORICAL-UTILITY-PROBLEM-RECURSION-STACK*", NIL);
        $strategic_heuristic_rule_historical_connectedness_enabledP$ = SubLFiles.defparameter("*STRATEGIC-HEURISTIC-RULE-HISTORICAL-CONNECTEDNESS-ENABLED?*", NIL);
        $strategic_heuristic_literal_count_lookup_table$ = SubLFiles.deflexical("*STRATEGIC-HEURISTIC-LITERAL-COUNT-LOOKUP-TABLE*", $list107);
        $strategic_heuristic_skolem_count_lookup_table$ = SubLFiles.deflexical("*STRATEGIC-HEURISTIC-SKOLEM-COUNT-LOOKUP-TABLE*", $list113);
        return NIL;
    }

    public static SubLObject setup_inference_strategic_heuristics_file() {
        subl_macro_promotions.declare_defglobal($sym0$_STRATEGIC_HEURISTIC_INDEX_);
        access_macros.register_macro_helper($sym1$STRATEGIC_HEURISTIC_INDEX, $sym2$DO_STRATEGIC_HEURISTICS);
        access_macros.register_macro_helper($sym16$DO_STRATEGIC_HEURISTICS_TACTIC_MATCH_P, $sym2$DO_STRATEGIC_HEURISTICS);
        declare_strategic_heuristic($SHALLOW_AND_CHEAP, $list35);
        utilities_macros.note_funcall_helper_function($sym36$STRATEGIC_HEURISTIC_SHALLOW_AND_CHEAP);
        memoization_state.note_globally_cached_function($sym38$STRATEGIC_USELESSNESS_BASED_ON_PROOF_DEPTH_MATH_MEMOIZED);
        declare_strategic_heuristic($COMPLETENESS, $list41);
        utilities_macros.note_funcall_helper_function($sym43$STRATEGIC_HEURISTIC_COMPLETENESS);
        declare_strategic_heuristic($OCCAMS_RAZOR, $list45);
        utilities_macros.note_funcall_helper_function($sym48$STRATEGIC_HEURISTIC_OCCAMS_RAZOR);
        declare_strategic_heuristic($OCCAMS_RAZOR_TACTIC, $list50);
        utilities_macros.note_funcall_helper_function($sym51$STRATEGIC_HEURISTIC_OCCAMS_RAZOR_TACTIC);
        declare_strategic_heuristic($MAGIC_WAND, $list53);
        utilities_macros.note_funcall_helper_function($sym55$STRATEGIC_HEURISTIC_MAGIC_WAND);
        declare_strategic_heuristic($BACKTRACKING_CONSIDERED_HARMFUL, $list57);
        utilities_macros.note_funcall_helper_function($sym59$STRATEGIC_HEURISTIC_BACKTRACKING);
        declare_strategic_heuristic($BACKCHAIN_REQUIRED, $list64);
        utilities_macros.note_funcall_helper_function($sym66$STRATEGIC_HEURISTIC_BACKCHAIN_REQUIRED);
        declare_strategic_heuristic($RULE_A_PRIORI_UTILITY, $list68);
        utilities_macros.note_funcall_helper_function($sym69$STRATEGIC_HEURISTIC_RULE_A_PRIORI_UTILITY);
        memoization_state.note_memoized_function($sym71$COUNT_A_PRIORI_UTILITY_RECURSIVE_INT);
        memoization_state.note_memoized_function($sym72$TRANSFORMATION_RULE_A_PRIORI_UTILITY_HAPPINESS);
        declare_strategic_heuristic($PROBLEM_RULE_A_PRIORI_UTILITY, $list74);
        utilities_macros.note_funcall_helper_function($sym75$STRATEGIC_HEURISTIC_PROBLEM_RULE_A_PRIORI_UTILITY);
        declare_strategic_heuristic($RELEVANT_TERM, $list77);
        utilities_macros.note_funcall_helper_function($sym78$STRATEGIC_HEURISTIC_RELEVANT_TERM);
        memoization_state.note_memoized_function($sym79$PROBLEM_RELEVANT_OR_IRRELEVANT_TERM_COUNT_INT);
        utilities_macros.note_funcall_helper_function($sym83$ACCUMULATE_RELEVANT_OR_IRRELEVANT_TERM);
        declare_strategic_heuristic($RULE_HISTORICAL_UTILITY, $list85);
        utilities_macros.note_funcall_helper_function($sym86$STRATEGIC_HEURISTIC_RULE_HISTORICAL_UTILITY);
        memoization_state.note_memoized_function($sym87$COMPUTE_PROBLEM_RULE_HISTORICAL_UTILITY_RECURSIVE_INT);
        memoization_state.note_memoized_function($sym88$TRANSFORMATION_RULE_UTILITY);
        declare_strategic_heuristic($PROBLEM_RULE_HISTORICAL_UTILITY, $list91);
        utilities_macros.note_funcall_helper_function($sym92$STRATEGIC_HEURISTIC_PROBLEM_RULE_HISTORICAL_UTILITY);
        declare_strategic_heuristic($RULE_HISTORICAL_CONNECTEDNESS, $list94);
        utilities_macros.note_funcall_helper_function($sym95$STRATEGIC_HEURISTIC_RULE_HISTORICAL_CONNECTEDNESS);
        memoization_state.note_memoized_function($sym96$CACHED_PROBLEM_LINK_PATHS_RELEVANT_TO_INFERENCE);
        declare_strategic_heuristic($LITERAL_COUNT, $list102);
        utilities_macros.note_funcall_helper_function($sym103$STRATEGIC_HEURISTIC_LITERAL_COUNT);
        declare_strategic_heuristic($RULE_LITERAL_COUNT, $list105);
        utilities_macros.note_funcall_helper_function($sym106$STRATEGIC_HEURISTIC_RULE_LITERAL_COUNT);
        declare_strategic_heuristic($SKOLEM_COUNT, $list110);
        utilities_macros.note_funcall_helper_function($sym111$STRATEGIC_HEURISTIC_SKOLEM_COUNT);
        declare_strategic_heuristic($T_FLOWS_LIKE_WINE, $list118);
        utilities_macros.note_funcall_helper_function($sym119$STRATEGIC_HEURISTIC_T_FLOWS_LIKE_WINE);
        return NIL;
    }

    @Override
    public void declareFunctions() {
        declare_inference_strategic_heuristics_file();
    }

    @Override
    public void initializeVariables() {
        init_inference_strategic_heuristics_file();
    }

    @Override
    public void runTopLevelForms() {
        setup_inference_strategic_heuristics_file();
    }

    static {
        me = new inference_strategic_heuristics();
        $strategic_heuristic_index$ = null;
        $heuristic_domains$ = null;
        $overriding_strategic_heuristic_scaling_factors$ = null;
        $strategic_uselessness_based_on_proof_depth_math_memoized_caching_state$ = null;
        $strategic_heuristic_occams_razor_table$ = null;
        $strategic_heuristic_occams_razor_table_default$ = null;
        $backtracking_considered_harmfulP$ = null;
        $strategic_heuristic_backtracking_table$ = null;
        $strategic_heuristic_backtracking_table_default$ = null;
        $early_removal_productivity_threshold$ = null;
        $heuristic_rule_a_priori_utility_problem_recursion_stack$ = null;
        $highly_relevant_term_enabledP$ = null;
        $relevant_term_set$ = null;
        $irrelevant_term_set$ = null;
        $strategic_heuristic_rule_historical_utility_enabledP$ = null;
        $heuristic_rule_historical_utility_problem_recursion_stack$ = null;
        $strategic_heuristic_rule_historical_connectedness_enabledP$ = null;
        $strategic_heuristic_literal_count_lookup_table$ = null;
        $strategic_heuristic_skolem_count_lookup_table$ = null;
        $sym0$_STRATEGIC_HEURISTIC_INDEX_ = makeSymbol("*STRATEGIC-HEURISTIC-INDEX*");
        $sym1$STRATEGIC_HEURISTIC_INDEX = makeSymbol("STRATEGIC-HEURISTIC-INDEX");
        $sym2$DO_STRATEGIC_HEURISTICS = makeSymbol("DO-STRATEGIC-HEURISTICS");
        $list3 = list(list(makeSymbol("HEURISTIC"), makeSymbol("FUNCTION"), makeSymbol("SCALING-FACTOR"), makeSymbol("&KEY"), makeSymbol("OBJECT"), makeSymbol("DONE")), makeSymbol("&BODY"), makeSymbol("BODY"));
        $list4 = list(makeKeyword("OBJECT"), makeKeyword("DONE"));
        $ALLOW_OTHER_KEYS = makeKeyword("ALLOW-OTHER-KEYS");
        $OBJECT = makeKeyword("OBJECT");
        $DONE = makeKeyword("DONE");
        $sym8$DOMAIN = makeUninternedSymbol("DOMAIN");
        $sym9$DO_DICTIONARY_KEYS = makeSymbol("DO-DICTIONARY-KEYS");
        $list10 = list(makeSymbol("STRATEGIC-HEURISTIC-INDEX"));
        $sym11$CLET = makeSymbol("CLET");
        $sym12$STRATEGIC_HEURISTIC_FUNCTION = makeSymbol("STRATEGIC-HEURISTIC-FUNCTION");
        $sym13$STRATEGIC_HEURISTIC_SCALING_FACTOR = makeSymbol("STRATEGIC-HEURISTIC-SCALING-FACTOR");
        $sym14$STRATEGIC_HEURISTIC_DOMAIN = makeSymbol("STRATEGIC-HEURISTIC-DOMAIN");
        $sym15$PWHEN = makeSymbol("PWHEN");
        $sym16$DO_STRATEGIC_HEURISTICS_TACTIC_MATCH_P = makeSymbol("DO-STRATEGIC-HEURISTICS-TACTIC-MATCH-P");
        $list17 = list(makeKeyword("PROBLEM"), makeKeyword("TACTIC"), makeKeyword("CONTENT-TACTIC"), makeKeyword("STRUCTURAL-TACTIC"), makeKeyword("CONNECTED-CONJUNCTION-TACTIC"), makeKeyword("GENERALIZED-REMOVAL-TACTIC"), makeKeyword("TRANSFORMATION-TACTIC"));
        $PROBLEM = makeKeyword("PROBLEM");
        $TACTIC = makeKeyword("TACTIC");
        $CONTENT_TACTIC = makeKeyword("CONTENT-TACTIC");
        $STRUCTURAL_TACTIC = makeKeyword("STRUCTURAL-TACTIC");
        $CONNECTED_CONJUNCTION_TACTIC = makeKeyword("CONNECTED-CONJUNCTION-TACTIC");
        $GENERALIZED_REMOVAL_TACTIC = makeKeyword("GENERALIZED-REMOVAL-TACTIC");
        $TRANSFORMATION_TACTIC = makeKeyword("TRANSFORMATION-TACTIC");
        $str25$Unknown_heuristic_domain__s = makeString("Unknown heuristic domain ~s");
        $sym26$KEYWORDP = makeSymbol("KEYWORDP");
        $list27 = list(makeSymbol("&KEY"), makeSymbol("FUNCTION"), makeSymbol("SCALING-FACTOR"), makeSymbol("PRETTY-NAME"), makeSymbol("COMMENT"), makeSymbol("DOMAIN"));
        $list28 = list(makeKeyword("FUNCTION"), makeKeyword("SCALING-FACTOR"), makeKeyword("PRETTY-NAME"), makeKeyword("COMMENT"), makeKeyword("DOMAIN"));
        $FUNCTION = makeKeyword("FUNCTION");
        $SCALING_FACTOR = makeKeyword("SCALING-FACTOR");
        $PRETTY_NAME = makeKeyword("PRETTY-NAME");
        $COMMENT = makeKeyword("COMMENT");
        $DOMAIN = makeKeyword("DOMAIN");
        $SHALLOW_AND_CHEAP = makeKeyword("SHALLOW-AND-CHEAP");
        $list35 = list(new SubLObject[] { makeKeyword("FUNCTION"), makeSymbol("STRATEGIC-HEURISTIC-SHALLOW-AND-CHEAP"), makeKeyword("SCALING-FACTOR"), ONE_INTEGER, makeKeyword("DOMAIN"), makeKeyword("PROBLEM"), makeKeyword("PRETTY-NAME"), makeString("Shallow And Cheap"), makeKeyword("COMMENT"),
                makeString("Prefer problems which are shallower,\ni.e. have a lower min-proof-depth, and which are cheap,\ni.e. have a lower total productivity.") });
        $sym36$STRATEGIC_HEURISTIC_SHALLOW_AND_CHEAP = makeSymbol("STRATEGIC-HEURISTIC-SHALLOW-AND-CHEAP");
        $UNDETERMINED = makeKeyword("UNDETERMINED");
        $sym38$STRATEGIC_USELESSNESS_BASED_ON_PROOF_DEPTH_MATH_MEMOIZED = makeSymbol("STRATEGIC-USELESSNESS-BASED-ON-PROOF-DEPTH-MATH-MEMOIZED");
        $sym39$_STRATEGIC_USELESSNESS_BASED_ON_PROOF_DEPTH_MATH_MEMOIZED_CACHING = makeSymbol("*STRATEGIC-USELESSNESS-BASED-ON-PROOF-DEPTH-MATH-MEMOIZED-CACHING-STATE*");
        $COMPLETENESS = makeKeyword("COMPLETENESS");
        $list41 = list(new SubLObject[] { makeKeyword("FUNCTION"), makeSymbol("STRATEGIC-HEURISTIC-COMPLETENESS"), makeKeyword("SCALING-FACTOR"), ONE_INTEGER, makeKeyword("DOMAIN"), makeKeyword("TACTIC"), makeKeyword("PRETTY-NAME"), makeString("Completeness"), makeKeyword("COMMENT"),
                makeString("Prefer tactics which are complete.") });
        $COMPLETE = makeKeyword("COMPLETE");
        $sym43$STRATEGIC_HEURISTIC_COMPLETENESS = makeSymbol("STRATEGIC-HEURISTIC-COMPLETENESS");
        $OCCAMS_RAZOR = makeKeyword("OCCAMS-RAZOR");
        $list45 = list(new SubLObject[] { makeKeyword("FUNCTION"), makeSymbol("STRATEGIC-HEURISTIC-OCCAMS-RAZOR"), makeKeyword("SCALING-FACTOR"), makeInteger(250), makeKeyword("DOMAIN"), makeKeyword("PROBLEM"), makeKeyword("PRETTY-NAME"), makeString("Occam's Razor"), makeKeyword("COMMENT"),
                makeString("The simplest explanation is best.  Our measure\nof simplicity is the shallowest transformation depth.") });
        $list46 = list(new SubLObject[] { cons(ZERO_INTEGER, ZERO_INTEGER), cons(ONE_INTEGER, makeInteger(-10)), cons(TWO_INTEGER, makeInteger(-20)), cons(THREE_INTEGER, makeInteger(-30)), cons(FOUR_INTEGER, makeInteger(-40)), cons(FIVE_INTEGER, makeInteger(-50)),
                cons(SIX_INTEGER, makeInteger(-60)), cons(SEVEN_INTEGER, makeInteger(-70)), cons(EIGHT_INTEGER, makeInteger(-75)), cons(NINE_INTEGER, makeInteger(-80)), cons(TEN_INTEGER, makeInteger(-85)), cons(FIFTEEN_INTEGER, makeInteger(-90)), cons(TWENTY_INTEGER, makeInteger(-95)),
                cons(makeInteger(30), makeInteger(-99)), cons(makeKeyword("POSITIVE-INFINITY"), makeInteger(-100)) });
        $int$_100 = makeInteger(-100);
        $sym48$STRATEGIC_HEURISTIC_OCCAMS_RAZOR = makeSymbol("STRATEGIC-HEURISTIC-OCCAMS-RAZOR");
        $OCCAMS_RAZOR_TACTIC = makeKeyword("OCCAMS-RAZOR-TACTIC");
        $list50 = list(new SubLObject[] { makeKeyword("FUNCTION"), makeSymbol("STRATEGIC-HEURISTIC-OCCAMS-RAZOR-TACTIC"), makeKeyword("SCALING-FACTOR"), makeInteger(250), makeKeyword("DOMAIN"), makeKeyword("TACTIC"), makeKeyword("PRETTY-NAME"), makeString("Occam's Razor (Tactic-Based)"),
                makeKeyword("COMMENT"), makeString("The simplest explanation is best.  Our measure\nof simplicity is the shallowest transformation depth.\nThis heuristic takes the tactic into account, not just the problem.") });
        $sym51$STRATEGIC_HEURISTIC_OCCAMS_RAZOR_TACTIC = makeSymbol("STRATEGIC-HEURISTIC-OCCAMS-RAZOR-TACTIC");
        $MAGIC_WAND = makeKeyword("MAGIC-WAND");
        $list53 = list(new SubLObject[] { makeKeyword("FUNCTION"), makeSymbol("STRATEGIC-HEURISTIC-MAGIC-WAND"), makeKeyword("SCALING-FACTOR"), makeInteger(1000), makeKeyword("DOMAIN"), makeKeyword("TACTIC"), makeKeyword("PRETTY-NAME"), makeString("Magic Wand"), makeKeyword("COMMENT"), makeString(
                "Disprefer 'magic wand' tactics, which are\nincomplete (conjunctive) removal tactics which are expected\nto yield no answers, i.e. they have a productivity of 0.\nSince they are incomplete, they can't even yield the benefit\nof pruning, so unless the estimate of 0 is wrong, it's\na waste of time to execute them.") });
        $INCOMPLETE = makeKeyword("INCOMPLETE");
        $sym55$STRATEGIC_HEURISTIC_MAGIC_WAND = makeSymbol("STRATEGIC-HEURISTIC-MAGIC-WAND");
        $BACKTRACKING_CONSIDERED_HARMFUL = makeKeyword("BACKTRACKING-CONSIDERED-HARMFUL");
        $list57 = list(new SubLObject[] { makeKeyword("FUNCTION"), makeSymbol("STRATEGIC-HEURISTIC-BACKTRACKING"), makeKeyword("SCALING-FACTOR"), makeInteger(10000), makeKeyword("DOMAIN"), makeKeyword("TACTIC"), makeKeyword("PRETTY-NAME"), makeString("Backtracking Considered Harmful"),
                makeKeyword("COMMENT"),
                makeString("If we've already executed some non-trivial\nconnected conjunction tactics on this problem, then disprefer\nexecuting any more connected conjunction tactics on it.\nA connected conjunction tactic is deemed trivial if\nit's expected to generate 4 or fewer subproblems.") });
        $list58 = list(cons(ZERO_INTEGER, ZERO_INTEGER), cons(ONE_INTEGER, makeInteger(-20)), cons(TWO_INTEGER, makeInteger(-40)), cons(THREE_INTEGER, makeInteger(-60)), cons(FOUR_INTEGER, makeInteger(-80)));
        $sym59$STRATEGIC_HEURISTIC_BACKTRACKING = makeSymbol("STRATEGIC-HEURISTIC-BACKTRACKING");
        $int$400 = makeInteger(400);
        $CONNECTED_CONJUNCTION = makeKeyword("CONNECTED-CONJUNCTION");
        $EXECUTED = makeKeyword("EXECUTED");
        $BACKCHAIN_REQUIRED = makeKeyword("BACKCHAIN-REQUIRED");
        $list64 = ConsesLow.list(new SubLObject[] { makeKeyword("FUNCTION"), makeSymbol("STRATEGIC-HEURISTIC-BACKCHAIN-REQUIRED"), makeKeyword("SCALING-FACTOR"), makeInteger(10000), makeKeyword("DOMAIN"), makeKeyword("TACTIC"), makeKeyword("PRETTY-NAME"), makeString("backchainRequired"),
                makeKeyword("COMMENT"), makeString("Prefer transformation tactics on backchainRequired predicates.") });
        $int$100 = makeInteger(100);
        $sym66$STRATEGIC_HEURISTIC_BACKCHAIN_REQUIRED = makeSymbol("STRATEGIC-HEURISTIC-BACKCHAIN-REQUIRED");
        $RULE_A_PRIORI_UTILITY = makeKeyword("RULE-A-PRIORI-UTILITY");
        $list68 = list(new SubLObject[] { makeKeyword("FUNCTION"), makeSymbol("STRATEGIC-HEURISTIC-RULE-A-PRIORI-UTILITY"), makeKeyword("SCALING-FACTOR"), makeInteger(10000), makeKeyword("DOMAIN"), makeKeyword("TACTIC"), makeKeyword("PRETTY-NAME"), makeString("highlyRelevantAssertion"),
                makeKeyword("COMMENT"), makeString("Prefer proof paths using higher proportions of\nhighlyRelevantAssertions.  Assume that proof paths using no rules\nare 100% relevant.") });
        $sym69$STRATEGIC_HEURISTIC_RULE_A_PRIORI_UTILITY = makeSymbol("STRATEGIC-HEURISTIC-RULE-A-PRIORI-UTILITY");
        $LOOP = makeKeyword("LOOP");
        $sym71$COUNT_A_PRIORI_UTILITY_RECURSIVE_INT = makeSymbol("COUNT-A-PRIORI-UTILITY-RECURSIVE-INT");
        $sym72$TRANSFORMATION_RULE_A_PRIORI_UTILITY_HAPPINESS = makeSymbol("TRANSFORMATION-RULE-A-PRIORI-UTILITY-HAPPINESS");
        $PROBLEM_RULE_A_PRIORI_UTILITY = makeKeyword("PROBLEM-RULE-A-PRIORI-UTILITY");
        $list74 = list(new SubLObject[] { makeKeyword("FUNCTION"), makeSymbol("STRATEGIC-HEURISTIC-PROBLEM-RULE-A-PRIORI-UTILITY"), makeKeyword("SCALING-FACTOR"), makeInteger(10000), makeKeyword("DOMAIN"), makeKeyword("PROBLEM"), makeKeyword("PRETTY-NAME"),
                makeString("highlyRelevantAssertion (Problem-Based)"), makeKeyword("COMMENT"), makeString("Prefer proof paths using higher proportions of\nhighlyRelevantAssertions.  Assume that proof paths using no rules\nare 100% relevant.") });
        $sym75$STRATEGIC_HEURISTIC_PROBLEM_RULE_A_PRIORI_UTILITY = makeSymbol("STRATEGIC-HEURISTIC-PROBLEM-RULE-A-PRIORI-UTILITY");
        $RELEVANT_TERM = makeKeyword("RELEVANT-TERM");
        $list77 = list(new SubLObject[] { makeKeyword("FUNCTION"), makeSymbol("STRATEGIC-HEURISTIC-RELEVANT-TERM"), makeKeyword("SCALING-FACTOR"), makeInteger(10000), makeKeyword("DOMAIN"), makeKeyword("PROBLEM"), makeKeyword("PRETTY-NAME"), makeString("highlyRelevantTerm"), makeKeyword("COMMENT"),
                makeString("Prefer working on problems that contain more\nhighlyRelevantTerms.") });
        $sym78$STRATEGIC_HEURISTIC_RELEVANT_TERM = makeSymbol("STRATEGIC-HEURISTIC-RELEVANT-TERM");
        $sym79$PROBLEM_RELEVANT_OR_IRRELEVANT_TERM_COUNT_INT = makeSymbol("PROBLEM-RELEVANT-OR-IRRELEVANT-TERM-COUNT-INT");
        $NEG = makeKeyword("NEG");
        $list81 = list(makeSymbol("MT"), makeSymbol("ASENT"));
        $POS = makeKeyword("POS");
        $sym83$ACCUMULATE_RELEVANT_OR_IRRELEVANT_TERM = makeSymbol("ACCUMULATE-RELEVANT-OR-IRRELEVANT-TERM");
        $RULE_HISTORICAL_UTILITY = makeKeyword("RULE-HISTORICAL-UTILITY");
        $list85 = list(new SubLObject[] { makeKeyword("FUNCTION"), makeSymbol("STRATEGIC-HEURISTIC-RULE-HISTORICAL-UTILITY"), makeKeyword("SCALING-FACTOR"), makeInteger(20000), makeKeyword("DOMAIN"), makeKeyword("TACTIC"), makeKeyword("PRETTY-NAME"), makeString("Historical Utility"),
                makeKeyword("COMMENT"), makeString("Prefer proof paths using rules that have worked well in the past,\nwithout considering the situations in which they were used, i.e.\nprior probability.  Consider proof paths using no rules to be at 100%.") });
        $sym86$STRATEGIC_HEURISTIC_RULE_HISTORICAL_UTILITY = makeSymbol("STRATEGIC-HEURISTIC-RULE-HISTORICAL-UTILITY");
        $sym87$COMPUTE_PROBLEM_RULE_HISTORICAL_UTILITY_RECURSIVE_INT = makeSymbol("COMPUTE-PROBLEM-RULE-HISTORICAL-UTILITY-RECURSIVE-INT");
        $sym88$TRANSFORMATION_RULE_UTILITY = makeSymbol("TRANSFORMATION-RULE-UTILITY");
        $sym89$RULE_ASSERTION_ = makeSymbol("RULE-ASSERTION?");
        $PROBLEM_RULE_HISTORICAL_UTILITY = makeKeyword("PROBLEM-RULE-HISTORICAL-UTILITY");
        $list91 = list(
                new SubLObject[] { makeKeyword("FUNCTION"), makeSymbol("STRATEGIC-HEURISTIC-PROBLEM-RULE-HISTORICAL-UTILITY"), makeKeyword("SCALING-FACTOR"), makeInteger(20000), makeKeyword("DOMAIN"), makeKeyword("PROBLEM"), makeKeyword("PRETTY-NAME"), makeString("Problem Rule Historical Utility"),
                        makeKeyword("COMMENT"), makeString("Prefer new roots obtained via rules that have worked well in the past,\nwithout considering the situations in which they were used, i.e.\nprior probability.  Consider new roots obtained using no rules to be at 100%.") });
        $sym92$STRATEGIC_HEURISTIC_PROBLEM_RULE_HISTORICAL_UTILITY = makeSymbol("STRATEGIC-HEURISTIC-PROBLEM-RULE-HISTORICAL-UTILITY");
        $RULE_HISTORICAL_CONNECTEDNESS = makeKeyword("RULE-HISTORICAL-CONNECTEDNESS");
        $list94 = list(new SubLObject[] { makeKeyword("FUNCTION"), makeSymbol("STRATEGIC-HEURISTIC-RULE-HISTORICAL-CONNECTEDNESS"), makeKeyword("SCALING-FACTOR"), makeInteger(20000), makeKeyword("DOMAIN"), makeKeyword("TACTIC"), makeKeyword("PRETTY-NAME"), makeString("Rule Connectedness"),
                makeKeyword("COMMENT"), makeString("Prefer proof paths using sets of rules that have a larger fraction that have pairwise worked together in the past.\nConsider proof paths using fewer than 2 rules to be at 100%.") });
        $sym95$STRATEGIC_HEURISTIC_RULE_HISTORICAL_CONNECTEDNESS = makeSymbol("STRATEGIC-HEURISTIC-RULE-HISTORICAL-CONNECTEDNESS");
        $sym96$CACHED_PROBLEM_LINK_PATHS_RELEVANT_TO_INFERENCE = makeSymbol("CACHED-PROBLEM-LINK-PATHS-RELEVANT-TO-INFERENCE");
        $sym97$PROBLEM_P = makeSymbol("PROBLEM-P");
        $sym98$INFERENCE_P = makeSymbol("INFERENCE-P");
        $sym99$PROBLEM_LINK_PATH_RULE_SET = makeSymbol("PROBLEM-LINK-PATH-RULE-SET");
        $sym100$TACTIC_P = makeSymbol("TACTIC-P");
        $LITERAL_COUNT = makeKeyword("LITERAL-COUNT");
        $list102 = list(new SubLObject[] { makeKeyword("FUNCTION"), makeSymbol("STRATEGIC-HEURISTIC-LITERAL-COUNT"), makeKeyword("SCALING-FACTOR"), makeInteger(12000), makeKeyword("DOMAIN"), makeKeyword("PROBLEM"), makeKeyword("PRETTY-NAME"), makeString("# of Literals"), makeKeyword("COMMENT"),
                makeString("Prefer working on problems with a smaller number of literals.") });
        $sym103$STRATEGIC_HEURISTIC_LITERAL_COUNT = makeSymbol("STRATEGIC-HEURISTIC-LITERAL-COUNT");
        $RULE_LITERAL_COUNT = makeKeyword("RULE-LITERAL-COUNT");
        $list105 = ConsesLow.list(new SubLObject[] { makeKeyword("FUNCTION"), makeSymbol("STRATEGIC-HEURISTIC-RULE-LITERAL-COUNT"), makeKeyword("SCALING-FACTOR"), makeInteger(1000), makeKeyword("DOMAIN"), makeKeyword("TACTIC"), makeKeyword("PRETTY-NAME"), makeString("# of Rule Literals"),
                makeKeyword("COMMENT"), makeString("Prefer using rules with a smaller number of literals.") });
        $sym106$STRATEGIC_HEURISTIC_RULE_LITERAL_COUNT = makeSymbol("STRATEGIC-HEURISTIC-RULE-LITERAL-COUNT");
        $list107 = list(new SubLObject[] { cons(ONE_INTEGER, ZERO_INTEGER), cons(TWO_INTEGER, makeInteger(-15)), cons(THREE_INTEGER, makeInteger(-25)), cons(FOUR_INTEGER, makeInteger(-30)), cons(FIVE_INTEGER, makeInteger(-35)), cons(SIX_INTEGER, makeInteger(-40)),
                cons(SEVEN_INTEGER, makeInteger(-45)), cons(EIGHT_INTEGER, makeInteger(-50)), cons(NINE_INTEGER, makeInteger(-55)), cons(TEN_INTEGER, makeInteger(-60)), cons(THIRTEEN_INTEGER, makeInteger(-70)), cons(SEVENTEEN_INTEGER, makeInteger(-80)), cons(makeInteger(23), makeInteger(-85)),
                cons(makeInteger(30), makeInteger(-90)), cons(makeInteger(50), makeInteger(-95)), cons(makeInteger(70), makeInteger(-97)), cons(makeInteger(100), makeInteger(-99)), cons(makeKeyword("POSITIVE-INFINITY"), makeInteger(-100)) });
        $list108 = cons(makeSymbol("INPUT"), makeSymbol("OUTPUT"));
        $SKOLEM_COUNT = makeKeyword("SKOLEM-COUNT");
        $list110 = list(new SubLObject[] { makeKeyword("FUNCTION"), makeSymbol("STRATEGIC-HEURISTIC-SKOLEM-COUNT"), makeKeyword("SCALING-FACTOR"), makeInteger(300000), makeKeyword("DOMAIN"), makeKeyword("PROBLEM"), makeKeyword("PRETTY-NAME"), makeString("# of Skolems"), makeKeyword("COMMENT"),
                makeString("Prefer working on problems with a smaller number of skolem functions.") });
        $sym111$STRATEGIC_HEURISTIC_SKOLEM_COUNT = makeSymbol("STRATEGIC-HEURISTIC-SKOLEM-COUNT");
        $sym112$SKOLEM_FUNCTION_P = makeSymbol("SKOLEM-FUNCTION-P");
        $list113 = list(new SubLObject[] { cons(ZERO_INTEGER, ZERO_INTEGER), cons(ONE_INTEGER, MINUS_ONE_INTEGER), cons(TWO_INTEGER, makeInteger(-2)), cons(THREE_INTEGER, makeInteger(-4)), cons(FOUR_INTEGER, makeInteger(-8)), cons(FIVE_INTEGER, makeInteger(-16)), cons(SIX_INTEGER, makeInteger(-32)),
                cons(SEVEN_INTEGER, makeInteger(-64)), cons(EIGHT_INTEGER, makeInteger(-99)), cons(makeKeyword("POSITIVE-INFINITY"), makeInteger(-100)) });
        $sym114$HAPPINESS__ = makeSymbol("HAPPINESS->");
        $sym115$THIRD = makeSymbol("THIRD");
        $sym116$FOURTH = makeSymbol("FOURTH");
        $T_FLOWS_LIKE_WINE = makeKeyword("T-FLOWS-LIKE-WINE");
        $list118 = list(new SubLObject[] { makeKeyword("FUNCTION"), makeSymbol("STRATEGIC-HEURISTIC-T-FLOWS-LIKE-WINE"), makeKeyword("SCALING-FACTOR"), makeInteger(1000000), makeKeyword("DOMAIN"), makeKeyword("TACTIC"), makeKeyword("PRETTY-NAME"), makeString("T flows like wine"),
                makeKeyword("COMMENT"), makeString("Let T (transformation motivation) flow freely through structural tactics.") });
        $sym119$STRATEGIC_HEURISTIC_T_FLOWS_LIKE_WINE = makeSymbol("STRATEGIC-HEURISTIC-T-FLOWS-LIKE-WINE");
    }

    public static class $strategic_heuristic_shallow_and_cheap$BinaryFunction extends BinaryFunction {
        public $strategic_heuristic_shallow_and_cheap$BinaryFunction() {
            super(SubLTranslatedFile.extractFunctionNamed("STRATEGIC-HEURISTIC-SHALLOW-AND-CHEAP"));
        }

        @Override
        public SubLObject processItem(SubLObject arg1, SubLObject arg2) {
            return strategic_heuristic_shallow_and_cheap(arg1, arg2);
        }
    }

    public static class $strategic_heuristic_completeness$BinaryFunction extends BinaryFunction {
        public $strategic_heuristic_completeness$BinaryFunction() {
            super(SubLTranslatedFile.extractFunctionNamed("STRATEGIC-HEURISTIC-COMPLETENESS"));
        }

        @Override
        public SubLObject processItem(SubLObject arg1, SubLObject arg2) {
            return strategic_heuristic_completeness(arg1, arg2);
        }
    }

    public static class $strategic_heuristic_occams_razor$BinaryFunction extends BinaryFunction {
        public $strategic_heuristic_occams_razor$BinaryFunction() {
            super(SubLTranslatedFile.extractFunctionNamed("STRATEGIC-HEURISTIC-OCCAMS-RAZOR"));
        }

        @Override
        public SubLObject processItem(SubLObject arg1, SubLObject arg2) {
            return strategic_heuristic_occams_razor(arg1, arg2);
        }
    }

    public static class $strategic_heuristic_magic_wand$BinaryFunction extends BinaryFunction {
        public $strategic_heuristic_magic_wand$BinaryFunction() {
            super(SubLTranslatedFile.extractFunctionNamed("STRATEGIC-HEURISTIC-MAGIC-WAND"));
        }

        @Override
        public SubLObject processItem(SubLObject arg1, SubLObject arg2) {
            return strategic_heuristic_magic_wand(arg1, arg2);
        }
    }

    public static class $strategic_heuristic_backchain_required$BinaryFunction extends BinaryFunction {
        public $strategic_heuristic_backchain_required$BinaryFunction() {
            super(SubLTranslatedFile.extractFunctionNamed("STRATEGIC-HEURISTIC-BACKCHAIN-REQUIRED"));
        }

        @Override
        public SubLObject processItem(SubLObject arg1, SubLObject arg2) {
            return strategic_heuristic_backchain_required(arg1, arg2);
        }
    }

    public static class $strategic_heuristic_rule_a_priori_utility$BinaryFunction extends BinaryFunction {
        public $strategic_heuristic_rule_a_priori_utility$BinaryFunction() {
            super(SubLTranslatedFile.extractFunctionNamed("STRATEGIC-HEURISTIC-RULE-A-PRIORI-UTILITY"));
        }

        @Override
        public SubLObject processItem(SubLObject arg1, SubLObject arg2) {
            return strategic_heuristic_rule_a_priori_utility(arg1, arg2);
        }
    }

    public static class $strategic_heuristic_relevant_term$BinaryFunction extends BinaryFunction {
        public $strategic_heuristic_relevant_term$BinaryFunction() {
            super(SubLTranslatedFile.extractFunctionNamed("STRATEGIC-HEURISTIC-RELEVANT-TERM"));
        }

        @Override
        public SubLObject processItem(SubLObject arg1, SubLObject arg2) {
            return strategic_heuristic_relevant_term(arg1, arg2);
        }
    }

    public static class $strategic_heuristic_rule_historical_utility$BinaryFunction extends BinaryFunction {
        public $strategic_heuristic_rule_historical_utility$BinaryFunction() {
            super(SubLTranslatedFile.extractFunctionNamed("STRATEGIC-HEURISTIC-RULE-HISTORICAL-UTILITY"));
        }

        @Override
        public SubLObject processItem(SubLObject arg1, SubLObject arg2) {
            return strategic_heuristic_rule_historical_utility(arg1, arg2);
        }
    }

    public static class $strategic_heuristic_rule_literal_count$BinaryFunction extends BinaryFunction {
        public $strategic_heuristic_rule_literal_count$BinaryFunction() {
            super(SubLTranslatedFile.extractFunctionNamed("STRATEGIC-HEURISTIC-RULE-LITERAL-COUNT"));
        }

        @Override
        public SubLObject processItem(SubLObject arg1, SubLObject arg2) {
            return strategic_heuristic_rule_literal_count(arg1, arg2);
        }
    }

    /**
     * TODO Describe the purpose of this method.
     * @param heuristic
     * @return
     */
    public static SubLObject strategic_heuristic_tactic_type(SubLObject heuristic) {
        return com.cyc.cycjava.cycl.inference.harness.inference_strategic_heuristics.strategic_heuristic_tactic_type(heuristic);

    }
}
/*
 *
 * Total time: 510 ms
 *
 */