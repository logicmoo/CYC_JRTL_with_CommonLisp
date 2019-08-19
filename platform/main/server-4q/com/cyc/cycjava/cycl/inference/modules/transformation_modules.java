package com.cyc.cycjava.cycl.inference.modules;

import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow.*;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.*;
import static com.cyc.tool.subl.util.SubLFiles.*;

import com.cyc.cycjava.cycl.arguments;
import com.cyc.cycjava.cycl.assertions_high;
import com.cyc.cycjava.cycl.auxiliary_indexing;
import com.cyc.cycjava.cycl.backward;
import com.cyc.cycjava.cycl.backward_utilities;
import com.cyc.cycjava.cycl.cardinality_estimates;
import com.cyc.cycjava.cycl.clauses;
import com.cyc.cycjava.cycl.control_vars;
import com.cyc.cycjava.cycl.cycl_utilities;
import com.cyc.cycjava.cycl.el_utilities;
import com.cyc.cycjava.cycl.fi;
import com.cyc.cycjava.cycl.fort_types_interface;
import com.cyc.cycjava.cycl.forts;
import com.cyc.cycjava.cycl.genl_mts;
import com.cyc.cycjava.cycl.genl_predicates;
import com.cyc.cycjava.cycl.genls;
import com.cyc.cycjava.cycl.iteration;
import com.cyc.cycjava.cycl.kb_indexing;
import com.cyc.cycjava.cycl.kb_mapping_macros;
import com.cyc.cycjava.cycl.kb_mapping_utilities;
import com.cyc.cycjava.cycl.memoization_state;
import com.cyc.cycjava.cycl.mt_relevance_macros;
import com.cyc.cycjava.cycl.mt_vars;
import com.cyc.cycjava.cycl.negation_predicate;
import com.cyc.cycjava.cycl.set_contents;
import com.cyc.cycjava.cycl.subl_promotions;
import com.cyc.cycjava.cycl.unification;
import com.cyc.cycjava.cycl.unification_utilities;
import com.cyc.cycjava.cycl.variables;
import com.cyc.cycjava.cycl.inference.inference_trampolines;
import com.cyc.cycjava.cycl.inference.harness.inference_abduction_utilities;
import com.cyc.cycjava.cycl.inference.harness.inference_czer;
import com.cyc.cycjava.cycl.inference.harness.inference_datastructures_problem_store;
import com.cyc.cycjava.cycl.inference.harness.inference_macros;
import com.cyc.cycjava.cycl.inference.harness.inference_modules;
import com.cyc.cycjava.cycl.inference.harness.inference_strategic_heuristics;
import com.cyc.cycjava.cycl.inference.harness.inference_worker;
import com.cyc.cycjava.cycl.inference.harness.inference_worker_transformation;
import com.cyc.cycjava.cycl.inference.harness.removal_module_utilities;
import com.cyc.cycjava.cycl.inference.modules.removal.removal_modules_symmetry;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.BinaryFunction;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Dynamic;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Errors;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Numbers;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Sequences;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Sort;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.SubLThread;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Symbols;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Threads;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.UnaryFunction;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Values;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLList;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObject;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLProcess;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLString;
import com.cyc.tool.subl.jrtl.nativeCode.type.symbol.SubLSymbol;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.cdestructuring_bind;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.conses_high;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.reader;
import com.cyc.tool.subl.util.SubLFile;
import com.cyc.tool.subl.util.SubLFiles;
import com.cyc.tool.subl.util.SubLTranslatedFile;

public class transformation_modules extends SubLTranslatedFile {
    public static SubLFile me;
    public static String myName = "com.cyc.cycjava.cycl.inference.modules.transformation_modules";
    public static String myFingerPrint = "6cdbc780222527aee65b4e0c356e56314a6a9b5f4bee5deda7317f9e658c8315";
    @SubL(source = "cycl/inference/modules/transformation-modules.lisp", position = 3500L)
    private static SubLSymbol $transformation_gaf_truth_known_disabled$;
    @SubL(source = "cycl/inference/modules/transformation-modules.lisp", position = 42800L)
    private static SubLSymbol $unbound_predicate_transformation_required_modules$;
    @SubL(source = "cycl/inference/modules/transformation-modules.lisp", position = 48000L)
    private static SubLSymbol $hl_predicate_transformation_required_modules$;
    @SubL(source = "cycl/inference/modules/transformation-modules.lisp", position = 69300L)
    private static SubLSymbol $genls_definitional_sentence$;
    @SubL(source = "cycl/inference/modules/transformation-modules.lisp", position = 69500L)
    private static SubLSymbol $genls_definitional_rules$;
    private static SubLObject $$genls;
    private static SubLSymbol $GENLS;
    private static SubLObject $$genlMt;
    private static SubLSymbol $GENLMT;
    private static SubLObject $$genlPreds;
    private static SubLSymbol $GENLPREDS;
    private static SubLObject $$genlInverse;
    private static SubLObject $$negationPreds;
    private static SubLSymbol $NEGATIONPREDS;
    private static SubLObject $$AsymmetricBinaryPredicate;
    private static SubLObject $$SymmetricBinaryPredicate;
    private static SubLObject $$CommutativePredicate;
    private static SubLObject $$PartiallyCommutativePredicate;
    private static SubLString $str13$Unexpected_commutative_predicate_;
    private static SubLSymbol $NEG;
    private static SubLList $list15;
    private static SubLSymbol $sym16$DO_LIST;
    private static SubLList $list17;
    private static SubLList $list18;
    private static SubLList $list19;
    private static SubLSymbol $ALLOW_OTHER_KEYS;
    private static SubLSymbol $PREDICATE;
    private static SubLSymbol $sym22$PREDICATE_VAR;
    private static SubLSymbol $sym23$CLET;
    private static SubLSymbol $sym24$DO_TRANSFORMATION_RULE_LITERALS;
    private static SubLSymbol $sym25$PWHEN;
    private static SubLSymbol $sym26$ATOMIC_SENTENCE_PREDICATE;
    private static SubLSymbol $sym27$RULE_VAR;
    private static SubLSymbol $sym28$RULE_RELEVANT_TO_PROOF;
    private static SubLSymbol $sym29$DO_ASSERTION_LITERALS;
    private static SubLSymbol $SENSE;
    private static SubLList $list31;
    private static SubLSymbol $sym32$DIRECTION_VAR;
    private static SubLSymbol $sym33$SENSE_VAR;
    private static SubLSymbol $sym34$PREDICATE_VAR;
    private static SubLSymbol $sym35$DO_TRANSFORMATION_RELEVANT_DIRECTIONS;
    private static SubLSymbol $sym36$DO_PREDICATE_RULE_INDEX;
    private static SubLSymbol $DIRECTION;
    private static SubLSymbol $sym38$CURRENT_INFERENCE_RULE_PREFERENCE__;
    private static SubLSymbol $sym39$TRANSFORMATION_RULE_UTILITY__;
    private static SubLSymbol $POS;
    private static SubLSymbol $TRANS_PREDICATE_POS;
    private static SubLList $list42;
    private static SubLSymbol $TRANS_PREDICATE_NEG;
    private static SubLList $list44;
    private static SubLSymbol $sym45$TRANS_PREDICATE_RULE_SELECT_INT;
    private static SubLSymbol $RULE;
    private static SubLString $str47$Invalid_sense__s;
    private static SubLSymbol $sym48$TRANS_PREDICATE_GENLPREDS_POS_RULE_SELECT_INT;
    private static SubLSymbol $TRANS_PREDICATE_GENLPREDS_POS;
    private static SubLList $list50;
    private static SubLSymbol $TRANS_PREDICATE_GENLPREDS_NEG;
    private static SubLList $list52;
    private static SubLSymbol $sym53$INFERENCE_PROPER_GENL_PREDICATE_;
    private static SubLSymbol $sym54$TRANS_PREDICATE_GENLINVERSE_POS_RULE_SELECT_INT;
    private static SubLSymbol $TRANS_PREDICATE_GENLINVERSE_POS;
    private static SubLList $list56;
    private static SubLSymbol $TRANS_PREDICATE_GENLINVERSE_NEG;
    private static SubLList $list58;
    private static SubLSymbol $sym59$INFERENCE_PROPER_GENL_INVERSE_;
    private static SubLSymbol $TRANS_PREDICATE_NEGATIONPREDS_NEG;
    private static SubLList $list61;
    private static SubLSymbol $TRANS_PREDICATE_SYMMETRY_POS;
    private static SubLList $list63;
    private static SubLSymbol $TRANS_PREDICATE_SYMMETRY_NEG;
    private static SubLList $list65;
    private static SubLSymbol $TRANS_PREDICATE_COMMUTATIVE_POS;
    private static SubLList $list67;
    private static SubLSymbol $TRANS_PREDICATE_COMMUTATIVE_NEG;
    private static SubLList $list69;
    private static SubLSymbol $TRANS_PREDICATE_PARTIALLY_COMMUTATIVE_POS;
    private static SubLList $list71;
    private static SubLSymbol $TRANS_PREDICATE_PARTIALLY_COMMUTATIVE_NEG;
    private static SubLList $list73;
    private static SubLSymbol $TRANS_PREDICATE_ASYMMETRY;
    private static SubLList $list75;
    private static SubLList $list76;
    private static SubLSymbol $TRANS_UNBOUND_PREDICATE_POS;
    private static SubLList $list78;
    private static SubLSymbol $TRANS_UNBOUND_PREDICATE_NEG;
    private static SubLList $list80;
    private static SubLSymbol $sym81$TRANS_UNBOUND_PREDICATE_RULE_SELECT;
    private static SubLList $list82;
    private static SubLSymbol $sym83$INFERENCE_MEMOIZED_ALL_SPECS;
    private static SubLSymbol $sym84$TRANS_ISA_POS_RULE_SELECT_COUNT;
    private static SubLObject $$isa;
    private static SubLSymbol $TRANS_ISA_POS;
    private static SubLList $list87;
    private static SubLSymbol $TRANS_ISA_NEG;
    private static SubLList $list89;
    private static SubLSymbol $TRANS_GENLS_POS;
    private static SubLList $list91;
    private static SubLSymbol $TRANS_GENLS_NEG;
    private static SubLList $list93;
    private static SubLSymbol $sym94$INFERENCE_MEMOIZED_ALL_SPEC_MTS;
    private static SubLSymbol $TRANS_GENL_MT_POS;
    private static SubLList $list96;
    private static SubLSymbol $TRANS_GENL_MT_NEG;
    private static SubLList $list98;
    private static SubLObject $$abnormal;
    private static SubLSymbol $TRANS_ABNORMAL;
    private static SubLList $list101;
    private static SubLList $list102;
    private static SubLSymbol $TRANSFORMATION_ABDUCTION_TO_SPECS;
    private static SubLList $list104;

    @SubL(source = "cycl/inference/modules/transformation-modules.lisp", position = 1100L)
    public static SubLObject additional_genls_supports(SubLObject spec, SubLObject genl) {
        if (!spec.eql(genl)) {
            SubLObject hl_formula = list($$genls, spec, genl);
            SubLObject hl_support = arguments.make_hl_support($GENLS, hl_formula, UNPROVIDED, UNPROVIDED);
            SubLObject additional_supports = list(hl_support);
            return additional_supports;
        }
        return NIL;
    }

    @SubL(source = "cycl/inference/modules/transformation-modules.lisp", position = 1600L)
    public static SubLObject additional_genl_mt_supports(SubLObject spec_mt, SubLObject genl_mt) {
        if (!spec_mt.eql(genl_mt)) {
            SubLObject hl_formula = list($$genlMt, spec_mt, genl_mt);
            SubLObject hl_support = arguments.make_hl_support($GENLMT, hl_formula, mt_vars.$mt_mt$.getGlobalValue(), UNPROVIDED);
            SubLObject additional_supports = list(hl_support);
            return additional_supports;
        }
        return NIL;
    }

    @SubL(source = "cycl/inference/modules/transformation-modules.lisp", position = 1900L)
    public static SubLObject additional_genlpreds_supports(SubLObject spec_pred, SubLObject genl_pred) {
        if (!spec_pred.eql(genl_pred)) {
            SubLObject hl_formula = list($$genlPreds, spec_pred, genl_pred);
            SubLObject hl_support = arguments.make_hl_support($GENLPREDS, hl_formula, UNPROVIDED, UNPROVIDED);
            SubLObject additional_supports = list(hl_support);
            return additional_supports;
        }
        return NIL;
    }

    @SubL(source = "cycl/inference/modules/transformation-modules.lisp", position = 2200L)
    public static SubLObject additional_genlinverse_supports(SubLObject spec_pred, SubLObject genl_inverse) {
        if (!spec_pred.eql(genl_inverse)) {
            SubLObject hl_formula = list($$genlInverse, spec_pred, genl_inverse);
            SubLObject hl_support = arguments.make_hl_support($GENLPREDS, hl_formula, UNPROVIDED, UNPROVIDED);
            SubLObject additional_supports = list(hl_support);
            return additional_supports;
        }
        return NIL;
    }

    @SubL(source = "cycl/inference/modules/transformation-modules.lisp", position = 2500L)
    public static SubLObject additional_negationpreds_supports(SubLObject pred, SubLObject negation_pred) {
        SubLObject hl_formula = list($$negationPreds, pred, negation_pred);
        SubLObject hl_support = arguments.make_hl_support($NEGATIONPREDS, hl_formula, UNPROVIDED, UNPROVIDED);
        SubLObject additional_supports = list(hl_support);
        return additional_supports;
    }

    @SubL(source = "cycl/inference/modules/transformation-modules.lisp", position = 2800L)
    public static SubLObject additional_asymmetry_supports(SubLObject predicate) {
        return removal_module_utilities.additional_isa_supports(predicate, $$AsymmetricBinaryPredicate);
    }

    @SubL(source = "cycl/inference/modules/transformation-modules.lisp", position = 2900L)
    public static SubLObject additional_predicate_commutativity_supports(SubLObject predicate) {
        if (NIL != inference_trampolines.inference_symmetric_predicateP(predicate)) {
            return removal_module_utilities.additional_isa_supports(predicate, $$SymmetricBinaryPredicate);
        }
        if (NIL != inference_trampolines.inference_commutative_predicate_p(predicate)) {
            return removal_module_utilities.additional_isa_supports(predicate, $$CommutativePredicate);
        }
        if (NIL != inference_trampolines.inference_partially_commutative_predicate_p(predicate)) {
            return append(removal_module_utilities.additional_isa_supports(predicate, $$PartiallyCommutativePredicate), removal_modules_symmetry.commutative_in_args_supports(predicate));
        }
        Errors.error($str13$Unexpected_commutative_predicate_, predicate);
        return NIL;
    }

    @SubL(source = "cycl/inference/modules/transformation-modules.lisp", position = 3700L)
    public static SubLObject transformation_gaf_truth_known(SubLObject gaf) {
        SubLThread thread = SubLProcess.currentSubLThread();
        if (NIL == $transformation_gaf_truth_known_disabled$.getDynamicValue(thread)) {
            return kb_mapping_utilities.gaf_truth_known(gaf);
        }
        return NIL;
    }

    @SubL(source = "cycl/inference/modules/transformation-modules.lisp", position = 3900L)
    public static SubLObject modus_tollens_transformation_module_p(SubLObject v_object) {
        return makeBoolean(NIL != inference_modules.transformation_module_p(v_object) && $NEG.eql(inference_modules.hl_module_sense(v_object)));
    }

    @SubL(source = "cycl/inference/modules/transformation-modules.lisp", position = 4000L)
    public static SubLObject modus_tollens_transformation_proof_p(SubLObject v_object) {
        return makeBoolean(NIL != inference_worker_transformation.transformation_proof_p(v_object) && NIL != modus_tollens_transformation_module_p(inference_worker.content_proof_hl_module(v_object)));
    }

    @SubL(source = "cycl/inference/modules/transformation-modules.lisp", position = 4200L)
    public static SubLObject do_transformation_relevant_directions(SubLObject macroform, SubLObject environment) {
        SubLObject current;
        SubLObject datum = current = macroform.rest();
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, $list15);
        SubLObject temp = current.rest();
        current = current.first();
        SubLObject direction_var = NIL;
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, $list15);
        direction_var = current.first();
        current = current.rest();
        if (NIL == current) {
            SubLObject body;
            current = (body = temp);
            return listS($sym16$DO_LIST, reader.bq_cons(direction_var, $list17), append(body, NIL));
        }
        cdestructuring_bind.cdestructuring_bind_error(datum, $list15);
        return NIL;
    }

    @SubL(source = "cycl/inference/modules/transformation-modules.lisp", position = 4400L)
    public static SubLObject do_transformation_rule_literals(SubLObject macroform, SubLObject environment) {
        SubLObject current;
        SubLObject datum = current = macroform.rest();
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, $list18);
        SubLObject temp = current.rest();
        current = current.first();
        SubLObject rule_asent_var = NIL;
        SubLObject rule = NIL;
        SubLObject sense = NIL;
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, $list18);
        rule_asent_var = current.first();
        current = current.rest();
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, $list18);
        rule = current.first();
        current = current.rest();
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, $list18);
        sense = current.first();
        current = current.rest();
        SubLObject allow_other_keys_p = NIL;
        SubLObject rest = current;
        SubLObject bad = NIL;
        SubLObject current_$1 = NIL;
        while (NIL != rest) {
            cdestructuring_bind.destructuring_bind_must_consp(rest, datum, $list18);
            current_$1 = rest.first();
            rest = rest.rest();
            cdestructuring_bind.destructuring_bind_must_consp(rest, datum, $list18);
            if (NIL == conses_high.member(current_$1, $list19, UNPROVIDED, UNPROVIDED)) {
                bad = T;
            }
            if (current_$1 == $ALLOW_OTHER_KEYS) {
                allow_other_keys_p = rest.first();
            }
            rest = rest.rest();
        }
        if (NIL != bad && NIL == allow_other_keys_p) {
            cdestructuring_bind.cdestructuring_bind_error(datum, $list18);
        }
        SubLObject predicate_tail = cdestructuring_bind.property_list_member($PREDICATE, current);
        SubLObject predicate = (NIL != predicate_tail) ? conses_high.cadr(predicate_tail) : NIL;
        SubLObject body;
        current = (body = temp);
        if (NIL != predicate) {
            SubLObject predicate_var = $sym22$PREDICATE_VAR;
            return list($sym23$CLET, list(list(predicate_var, predicate)), list($sym24$DO_TRANSFORMATION_RULE_LITERALS, list(rule_asent_var, rule, sense), listS($sym25$PWHEN, list(EQL, predicate_var, list($sym26$ATOMIC_SENTENCE_PREDICATE, rule_asent_var)), append(body, NIL))));
        }
        SubLObject rule_var = $sym27$RULE_VAR;
        return list($sym23$CLET, list(list(rule_var, rule)), list($sym25$PWHEN, list($sym28$RULE_RELEVANT_TO_PROOF, rule_var), listS($sym29$DO_ASSERTION_LITERALS, list(rule_asent_var, rule_var, $SENSE, sense, $PREDICATE, predicate), append(body, NIL))));
    }

    @SubL(source = "cycl/inference/modules/transformation-modules.lisp", position = 5000L)
    public static SubLObject do_transformation_predicate_rule_index(SubLObject macroform, SubLObject environment) {
        SubLObject current;
        SubLObject datum = current = macroform.rest();
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, $list31);
        SubLObject temp = current.rest();
        current = current.first();
        SubLObject rule_asent_var = NIL;
        SubLObject rule_var = NIL;
        SubLObject predicate = NIL;
        SubLObject sense = NIL;
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, $list31);
        rule_asent_var = current.first();
        current = current.rest();
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, $list31);
        rule_var = current.first();
        current = current.rest();
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, $list31);
        predicate = current.first();
        current = current.rest();
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, $list31);
        sense = current.first();
        current = current.rest();
        if (NIL == current) {
            SubLObject body;
            current = (body = temp);
            SubLObject direction_var = $sym32$DIRECTION_VAR;
            SubLObject sense_var = $sym33$SENSE_VAR;
            SubLObject predicate_var = $sym34$PREDICATE_VAR;
            return list($sym23$CLET, list(list(sense_var, sense), list(predicate_var, predicate)), list($sym35$DO_TRANSFORMATION_RELEVANT_DIRECTIONS, list(direction_var),
                    list($sym36$DO_PREDICATE_RULE_INDEX, list(rule_var, predicate_var, $SENSE, sense_var, $DIRECTION, direction_var), listS($sym24$DO_TRANSFORMATION_RULE_LITERALS, list(rule_asent_var, rule_var, sense_var, $PREDICATE, predicate_var), append(body, NIL)))));
        }
        cdestructuring_bind.cdestructuring_bind_error(datum, $list31);
        return NIL;
    }

    @SubL(source = "cycl/inference/modules/transformation-modules.lisp", position = 5600L)
    public static SubLObject new_selected_rules() {
        return set_contents.new_set_contents(ZERO_INTEGER, Symbols.symbol_function(EQL));
    }

    @SubL(source = "cycl/inference/modules/transformation-modules.lisp", position = 5700L)
    public static SubLObject add_selected_rule(SubLObject rule, SubLObject selected_rules) {
        return set_contents.set_contents_add(rule, selected_rules, Symbols.symbol_function(EQL));
    }

    @SubL(source = "cycl/inference/modules/transformation-modules.lisp", position = 5800L)
    public static SubLObject finalize_selected_rules(SubLObject selected_rules) {
        SubLObject rules = set_contents.set_contents_element_list(selected_rules);
        return sort_rules_via_current_inference_rule_preference(rules);
    }

    @SubL(source = "cycl/inference/modules/transformation-modules.lisp", position = 6000L)
    public static SubLObject sort_rules_via_current_inference_rule_preference(SubLObject rules) {
        if (NIL != inference_macros.current_controlling_inference()) {
            return Sort.sort(rules, $sym38$CURRENT_INFERENCE_RULE_PREFERENCE__, UNPROVIDED);
        }
        return Sort.sort(rules, $sym39$TRANSFORMATION_RULE_UTILITY__, UNPROVIDED);
    }

    @SubL(source = "cycl/inference/modules/transformation-modules.lisp", position = 6200L)
    public static SubLObject current_inference_rule_preference_G(SubLObject rule1, SubLObject rule2) {
        return inference_strategic_heuristics.inference_rule_preference_G(inference_macros.current_controlling_inference(), rule1, rule2);
    }

    @SubL(source = "cycl/inference/modules/transformation-modules.lisp", position = 6400L)
    public static SubLObject trans_predicate_pos_required(SubLObject asent) {
        return trans_predicate_required(asent);
    }

    @SubL(source = "cycl/inference/modules/transformation-modules.lisp", position = 6700L)
    public static SubLObject trans_predicate_neg_required(SubLObject asent) {
        return trans_predicate_required(asent);
    }

    @SubL(source = "cycl/inference/modules/transformation-modules.lisp", position = 6800L)
    public static SubLObject trans_predicate_pos_cost(SubLObject asent) {
        return trans_predicate_cost(asent, $POS);
    }

    @SubL(source = "cycl/inference/modules/transformation-modules.lisp", position = 6900L)
    public static SubLObject trans_predicate_neg_cost(SubLObject asent) {
        return trans_predicate_cost(asent, $NEG);
    }

    @SubL(source = "cycl/inference/modules/transformation-modules.lisp", position = 7000L)
    public static SubLObject trans_predicate_pos_rule_select(SubLObject asent) {
        return trans_predicate_rule_select(asent, $POS);
    }

    @SubL(source = "cycl/inference/modules/transformation-modules.lisp", position = 7100L)
    public static SubLObject trans_predicate_neg_rule_select(SubLObject asent) {
        return trans_predicate_rule_select(asent, $NEG);
    }

    @SubL(source = "cycl/inference/modules/transformation-modules.lisp", position = 7200L)
    public static SubLObject trans_predicate_pos_rule_filter(SubLObject asent, SubLObject rule) {
        return trans_predicate_rule_filter(asent, $POS, rule);
    }

    @SubL(source = "cycl/inference/modules/transformation-modules.lisp", position = 7300L)
    public static SubLObject trans_predicate_neg_rule_filter(SubLObject asent, SubLObject rule) {
        return trans_predicate_rule_filter(asent, $NEG, rule);
    }

    @SubL(source = "cycl/inference/modules/transformation-modules.lisp", position = 7500L)
    public static SubLObject trans_predicate_pos_expand(SubLObject asent, SubLObject rule) {
        return trans_predicate_expand(asent, $POS, rule);
    }

    @SubL(source = "cycl/inference/modules/transformation-modules.lisp", position = 7600L)
    public static SubLObject trans_predicate_neg_expand(SubLObject asent, SubLObject rule) {
        return trans_predicate_expand(asent, $NEG, rule);
    }

    @SubL(source = "cycl/inference/modules/transformation-modules.lisp", position = 8900L)
    public static SubLObject trans_predicate_required(SubLObject asent) {
        SubLThread thread = SubLProcess.currentSubLThread();
        return makeBoolean(NIL == control_vars.$unique_inference_result_bindings$.getDynamicValue(thread) || NIL == variables.fully_bound_p(asent) || NIL == transformation_gaf_truth_known(asent));
    }

    @SubL(source = "cycl/inference/modules/transformation-modules.lisp", position = 9200L)
    public static SubLObject trans_predicate_cost(SubLObject asent, SubLObject sense) {
        return kb_indexing.relevant_num_predicate_rule_index(cycl_utilities.atomic_sentence_predicate(asent), sense);
    }

    @SubL(source = "cycl/inference/modules/transformation-modules.lisp", position = 9400L)
    public static SubLObject trans_predicate_rule_select(SubLObject asent, SubLObject sense) {
        return conses_high.copy_list(trans_predicate_rule_select_int(cycl_utilities.atomic_sentence_predicate(asent), sense));
    }

    @SubL(source = "cycl/inference/modules/transformation-modules.lisp", position = 9500L)
    public static SubLObject trans_predicate_rule_select_int_internal(SubLObject predicate, SubLObject sense) {
        SubLObject rules = new_selected_rules();
        SubLObject cdolist_list_var = backward_utilities.relevant_directions();
        SubLObject direction = NIL;
        direction = cdolist_list_var.first();
        while (NIL != cdolist_list_var) {
            if (NIL != kb_mapping_macros.do_predicate_rule_index_key_validator(predicate, sense, direction)) {
                SubLObject iterator_var = kb_mapping_macros.new_predicate_rule_final_index_spec_iterator(predicate, sense, direction);
                SubLObject done_var = NIL;
                SubLObject token_var = NIL;
                while (NIL == done_var) {
                    SubLObject final_index_spec = iteration.iteration_next_without_values_macro_helper(iterator_var, token_var);
                    SubLObject valid = makeBoolean(!token_var.eql(final_index_spec));
                    if (NIL != valid) {
                        SubLObject final_index_iterator = NIL;
                        try {
                            final_index_iterator = kb_mapping_macros.new_final_index_iterator(final_index_spec, $RULE, NIL, direction);
                            SubLObject done_var_$2 = NIL;
                            SubLObject token_var_$3 = NIL;
                            while (NIL == done_var_$2) {
                                SubLObject rule = iteration.iteration_next_without_values_macro_helper(final_index_iterator, token_var_$3);
                                SubLObject valid_$4 = makeBoolean(!token_var_$3.eql(rule));
                                if (NIL != valid_$4) {
                                    rules = add_selected_rule(rule, rules);
                                }
                                done_var_$2 = makeBoolean(NIL == valid_$4);
                            }
                        } finally {
                            SubLObject _prev_bind_0 = Dynamic.currentBinding(Threads.$is_thread_performing_cleanupP$);
                            try {
                                Dynamic.bind(Threads.$is_thread_performing_cleanupP$, T);
                                SubLObject _values = Values.getValuesAsVector();
                                if (NIL != final_index_iterator) {
                                    kb_mapping_macros.destroy_final_index_iterator(final_index_iterator);
                                }
                                Values.restoreValuesFromVector(_values);
                            } finally {
                                Dynamic.rebind(Threads.$is_thread_performing_cleanupP$, _prev_bind_0);
                            }
                        }
                    }
                    done_var = makeBoolean(NIL == valid);
                }
            }
            cdolist_list_var = cdolist_list_var.rest();
            direction = cdolist_list_var.first();
        }
        return finalize_selected_rules(rules);
    }

    @SubL(source = "cycl/inference/modules/transformation-modules.lisp", position = 9500L)
    public static SubLObject trans_predicate_rule_select_int(SubLObject predicate, SubLObject sense) {
        SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject v_memoization_state = memoization_state.$memoization_state$.getDynamicValue(thread);
        SubLObject caching_state = NIL;
        if (NIL == v_memoization_state) {
            return trans_predicate_rule_select_int_internal(predicate, sense);
        }
        caching_state = memoization_state.memoization_state_lookup(v_memoization_state, $sym45$TRANS_PREDICATE_RULE_SELECT_INT, UNPROVIDED);
        if (NIL == caching_state) {
            caching_state = memoization_state.create_caching_state(memoization_state.memoization_state_lock(v_memoization_state), $sym45$TRANS_PREDICATE_RULE_SELECT_INT, TWO_INTEGER, NIL, EQL, UNPROVIDED);
            memoization_state.memoization_state_put(v_memoization_state, $sym45$TRANS_PREDICATE_RULE_SELECT_INT, caching_state);
        }
        SubLObject sxhash = memoization_state.sxhash_calc_2(predicate, sense);
        SubLObject collisions = memoization_state.caching_state_lookup(caching_state, sxhash, UNPROVIDED);
        if (!collisions.eql(memoization_state.$memoized_item_not_found$.getGlobalValue())) {
            SubLObject cdolist_list_var = collisions;
            SubLObject collision = NIL;
            collision = cdolist_list_var.first();
            while (NIL != cdolist_list_var) {
                SubLObject cached_args = collision.first();
                SubLObject results2 = conses_high.second(collision);
                if (predicate.eql(cached_args.first())) {
                    cached_args = cached_args.rest();
                    if (NIL != cached_args && NIL == cached_args.rest() && sense.eql(cached_args.first())) {
                        return memoization_state.caching_results(results2);
                    }
                }
                cdolist_list_var = cdolist_list_var.rest();
                collision = cdolist_list_var.first();
            }
        }
        SubLObject results3 = Values.arg2(thread.resetMultipleValues(), Values.multiple_value_list(trans_predicate_rule_select_int_internal(predicate, sense)));
        memoization_state.caching_state_enter_multi_key_n(caching_state, sxhash, collisions, results3, list(predicate, sense));
        return memoization_state.caching_results(results3);
    }

    @SubL(source = "cycl/inference/modules/transformation-modules.lisp", position = 9900L)
    public static SubLObject trans_predicate_rule_filter(SubLObject asent, SubLObject sense, SubLObject rule) {
        SubLObject predicate_var;
        SubLObject predicate = predicate_var = cycl_utilities.atomic_sentence_predicate(asent);
        if (NIL != backward_utilities.rule_relevant_to_proof(rule)) {
            SubLObject cnf_var = assertions_high.assertion_cnf(rule);
            if ($POS == sense) {
                SubLObject cdolist_list_var = clauses.pos_lits(cnf_var);
                SubLObject examine = NIL;
                examine = cdolist_list_var.first();
                while (NIL != cdolist_list_var) {
                    if (predicate_var.eql(cycl_utilities.atomic_sentence_predicate(examine)) && NIL != unification.unify_possible(asent, examine)) {
                        return T;
                    }
                    cdolist_list_var = cdolist_list_var.rest();
                    examine = cdolist_list_var.first();
                }
            } else if ($NEG == sense) {
                SubLObject cdolist_list_var = clauses.neg_lits(cnf_var);
                SubLObject examine = NIL;
                examine = cdolist_list_var.first();
                while (NIL != cdolist_list_var) {
                    if (predicate_var.eql(cycl_utilities.atomic_sentence_predicate(examine)) && NIL != unification.unify_possible(asent, examine)) {
                        return T;
                    }
                    cdolist_list_var = cdolist_list_var.rest();
                    examine = cdolist_list_var.first();
                }
            } else {
                Errors.error($str47$Invalid_sense__s, sense);
            }
        }
        return NIL;
    }

    @SubL(source = "cycl/inference/modules/transformation-modules.lisp", position = 10100L)
    public static SubLObject trans_predicate_expand(SubLObject asent, SubLObject sense, SubLObject rule) {
        SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject mt = mt_relevance_macros.$mt$.getDynamicValue(thread);
        if (NIL != inference_czer.backchaining_on_ist_enabledP() && NIL != el_utilities.ist_sentence_p(asent, UNPROVIDED) && NIL != variables.fully_bound_p(el_utilities.designated_mt(asent))) {
            mt = el_utilities.designated_mt(asent);
            asent = el_utilities.designated_sentence(asent);
        }
        SubLObject mt_var = mt_relevance_macros.with_inference_mt_relevance_validate(mt);
        SubLObject _prev_bind_0 = mt_relevance_macros.$mt$.currentBinding(thread);
        SubLObject _prev_bind_2 = mt_relevance_macros.$relevant_mt_function$.currentBinding(thread);
        SubLObject _prev_bind_3 = mt_relevance_macros.$relevant_mts$.currentBinding(thread);
        try {
            mt_relevance_macros.$mt$.bind(mt_relevance_macros.update_inference_mt_relevance_mt(mt_var), thread);
            mt_relevance_macros.$relevant_mt_function$.bind(mt_relevance_macros.update_inference_mt_relevance_function(mt_var), thread);
            mt_relevance_macros.$relevant_mts$.bind(mt_relevance_macros.update_inference_mt_relevance_mt_list(mt_var), thread);
            SubLObject predicate_var;
            SubLObject predicate = predicate_var = cycl_utilities.atomic_sentence_predicate(asent);
            if (NIL != backward_utilities.rule_relevant_to_proof(rule)) {
                SubLObject cnf_var = assertions_high.assertion_cnf(rule);
                if ($POS == sense) {
                    SubLObject cdolist_list_var = clauses.pos_lits(cnf_var);
                    SubLObject examine = NIL;
                    examine = cdolist_list_var.first();
                    while (NIL != cdolist_list_var) {
                        if (predicate_var.eql(cycl_utilities.atomic_sentence_predicate(examine))) {
                            SubLObject v_bindings = unification_utilities.transformation_asent_unify(asent, examine);
                            if (NIL != v_bindings) {
                                backward.transformation_add_node(rule, examine, sense, v_bindings, UNPROVIDED);
                            }
                        }
                        cdolist_list_var = cdolist_list_var.rest();
                        examine = cdolist_list_var.first();
                    }
                } else if ($NEG == sense) {
                    SubLObject cdolist_list_var = clauses.neg_lits(cnf_var);
                    SubLObject examine = NIL;
                    examine = cdolist_list_var.first();
                    while (NIL != cdolist_list_var) {
                        if (predicate_var.eql(cycl_utilities.atomic_sentence_predicate(examine))) {
                            SubLObject v_bindings = unification_utilities.transformation_asent_unify(asent, examine);
                            if (NIL != v_bindings) {
                                backward.transformation_add_node(rule, examine, sense, v_bindings, UNPROVIDED);
                            }
                        }
                        cdolist_list_var = cdolist_list_var.rest();
                        examine = cdolist_list_var.first();
                    }
                } else {
                    Errors.error($str47$Invalid_sense__s, sense);
                }
            }
        } finally {
            mt_relevance_macros.$relevant_mts$.rebind(_prev_bind_3, thread);
            mt_relevance_macros.$relevant_mt_function$.rebind(_prev_bind_2, thread);
            mt_relevance_macros.$mt$.rebind(_prev_bind_0, thread);
        }
        return NIL;
    }

    @SubL(source = "cycl/inference/modules/transformation-modules.lisp", position = 10800L)
    public static SubLObject trans_predicate_genlpreds_pos_required(SubLObject asent) {
        return trans_predicate_genlpreds_required(asent);
    }

    @SubL(source = "cycl/inference/modules/transformation-modules.lisp", position = 11800L)
    public static SubLObject trans_predicate_genlpreds_neg_required(SubLObject asent) {
        return trans_predicate_genlpreds_required(asent);
    }

    @SubL(source = "cycl/inference/modules/transformation-modules.lisp", position = 12000L)
    public static SubLObject trans_predicate_genlpreds_pos_cost(SubLObject asent) {
        SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject predicate = cycl_utilities.atomic_sentence_predicate(asent);
        thread.resetMultipleValues();
        SubLObject spec_preds = inference_trampolines.inference_all_proper_spec_predicates_with_axiom_index(predicate, $POS);
        SubLObject cost = thread.secondMultipleValue();
        thread.resetMultipleValues();
        return cost;
    }

    @SubL(source = "cycl/inference/modules/transformation-modules.lisp", position = 12200L)
    public static SubLObject trans_predicate_genlpreds_neg_cost(SubLObject asent) {
        SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject predicate = cycl_utilities.atomic_sentence_predicate(asent);
        thread.resetMultipleValues();
        SubLObject genl_preds = inference_trampolines.inference_all_proper_genl_predicates_with_axiom_index(predicate, $NEG);
        SubLObject cost = thread.secondMultipleValue();
        thread.resetMultipleValues();
        return cost;
    }

    @SubL(source = "cycl/inference/modules/transformation-modules.lisp", position = 12500L)
    public static SubLObject trans_predicate_genlpreds_pos_rule_select(SubLObject asent) {
        return conses_high.copy_list(trans_predicate_genlpreds_pos_rule_select_int(cycl_utilities.atomic_sentence_predicate(asent)));
    }

    @SubL(source = "cycl/inference/modules/transformation-modules.lisp", position = 12700L)
    public static SubLObject trans_predicate_genlpreds_pos_rule_select_int_internal(SubLObject predicate) {
        SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject rules = new_selected_rules();
        SubLObject cdolist_list_var = inference_trampolines.inference_all_proper_spec_predicates_with_axiom_index(predicate, $POS);
        SubLObject index_pred = NIL;
        index_pred = cdolist_list_var.first();
        while (NIL != cdolist_list_var) {
            if (NIL == inference_trampolines.inference_backchain_forbiddenP(index_pred, mt_relevance_macros.$mt$.getDynamicValue(thread))) {
                SubLObject cdolist_list_var_$5 = backward_utilities.relevant_directions();
                SubLObject direction = NIL;
                direction = cdolist_list_var_$5.first();
                while (NIL != cdolist_list_var_$5) {
                    if (NIL != kb_mapping_macros.do_predicate_rule_index_key_validator(index_pred, $POS, direction)) {
                        SubLObject iterator_var = kb_mapping_macros.new_predicate_rule_final_index_spec_iterator(index_pred, $POS, direction);
                        SubLObject done_var = NIL;
                        SubLObject token_var = NIL;
                        while (NIL == done_var) {
                            SubLObject final_index_spec = iteration.iteration_next_without_values_macro_helper(iterator_var, token_var);
                            SubLObject valid = makeBoolean(!token_var.eql(final_index_spec));
                            if (NIL != valid) {
                                SubLObject final_index_iterator = NIL;
                                try {
                                    final_index_iterator = kb_mapping_macros.new_final_index_iterator(final_index_spec, $RULE, NIL, direction);
                                    SubLObject done_var_$6 = NIL;
                                    SubLObject token_var_$7 = NIL;
                                    while (NIL == done_var_$6) {
                                        SubLObject rule = iteration.iteration_next_without_values_macro_helper(final_index_iterator, token_var_$7);
                                        SubLObject valid_$8 = makeBoolean(!token_var_$7.eql(rule));
                                        if (NIL != valid_$8) {
                                            rules = add_selected_rule(rule, rules);
                                        }
                                        done_var_$6 = makeBoolean(NIL == valid_$8);
                                    }
                                } finally {
                                    SubLObject _prev_bind_0 = Threads.$is_thread_performing_cleanupP$.currentBinding(thread);
                                    try {
                                        Threads.$is_thread_performing_cleanupP$.bind(T, thread);
                                        SubLObject _values = Values.getValuesAsVector();
                                        if (NIL != final_index_iterator) {
                                            kb_mapping_macros.destroy_final_index_iterator(final_index_iterator);
                                        }
                                        Values.restoreValuesFromVector(_values);
                                    } finally {
                                        Threads.$is_thread_performing_cleanupP$.rebind(_prev_bind_0, thread);
                                    }
                                }
                            }
                            done_var = makeBoolean(NIL == valid);
                        }
                    }
                    cdolist_list_var_$5 = cdolist_list_var_$5.rest();
                    direction = cdolist_list_var_$5.first();
                }
            }
            cdolist_list_var = cdolist_list_var.rest();
            index_pred = cdolist_list_var.first();
        }
        return finalize_selected_rules(rules);
    }

    @SubL(source = "cycl/inference/modules/transformation-modules.lisp", position = 12700L)
    public static SubLObject trans_predicate_genlpreds_pos_rule_select_int(SubLObject predicate) {
        SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject v_memoization_state = memoization_state.$memoization_state$.getDynamicValue(thread);
        SubLObject caching_state = NIL;
        if (NIL == v_memoization_state) {
            return trans_predicate_genlpreds_pos_rule_select_int_internal(predicate);
        }
        caching_state = memoization_state.memoization_state_lookup(v_memoization_state, $sym48$TRANS_PREDICATE_GENLPREDS_POS_RULE_SELECT_INT, UNPROVIDED);
        if (NIL == caching_state) {
            caching_state = memoization_state.create_caching_state(memoization_state.memoization_state_lock(v_memoization_state), $sym48$TRANS_PREDICATE_GENLPREDS_POS_RULE_SELECT_INT, ONE_INTEGER, NIL, EQL, UNPROVIDED);
            memoization_state.memoization_state_put(v_memoization_state, $sym48$TRANS_PREDICATE_GENLPREDS_POS_RULE_SELECT_INT, caching_state);
        }
        SubLObject results = memoization_state.caching_state_lookup(caching_state, predicate, memoization_state.$memoized_item_not_found$.getGlobalValue());
        if (results.eql(memoization_state.$memoized_item_not_found$.getGlobalValue())) {
            results = Values.arg2(thread.resetMultipleValues(), Values.multiple_value_list(trans_predicate_genlpreds_pos_rule_select_int_internal(predicate)));
            memoization_state.caching_state_put(caching_state, predicate, results, UNPROVIDED);
        }
        return memoization_state.caching_results(results);
    }

    @SubL(source = "cycl/inference/modules/transformation-modules.lisp", position = 13200L)
    public static SubLObject trans_predicate_genlpreds_neg_rule_select(SubLObject asent) {
        SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject predicate = cycl_utilities.atomic_sentence_predicate(asent);
        SubLObject rules = new_selected_rules();
        SubLObject cdolist_list_var = inference_trampolines.inference_all_proper_genl_predicates_with_axiom_index(predicate, $NEG);
        SubLObject index_pred = NIL;
        index_pred = cdolist_list_var.first();
        while (NIL != cdolist_list_var) {
            if (NIL == inference_trampolines.inference_backchain_forbiddenP(index_pred, mt_relevance_macros.$mt$.getDynamicValue(thread))) {
                SubLObject cdolist_list_var_$9 = backward_utilities.relevant_directions();
                SubLObject direction = NIL;
                direction = cdolist_list_var_$9.first();
                while (NIL != cdolist_list_var_$9) {
                    if (NIL != kb_mapping_macros.do_predicate_rule_index_key_validator(index_pred, $NEG, direction)) {
                        SubLObject iterator_var = kb_mapping_macros.new_predicate_rule_final_index_spec_iterator(index_pred, $NEG, direction);
                        SubLObject done_var = NIL;
                        SubLObject token_var = NIL;
                        while (NIL == done_var) {
                            SubLObject final_index_spec = iteration.iteration_next_without_values_macro_helper(iterator_var, token_var);
                            SubLObject valid = makeBoolean(!token_var.eql(final_index_spec));
                            if (NIL != valid) {
                                SubLObject final_index_iterator = NIL;
                                try {
                                    final_index_iterator = kb_mapping_macros.new_final_index_iterator(final_index_spec, $RULE, NIL, direction);
                                    SubLObject done_var_$10 = NIL;
                                    SubLObject token_var_$11 = NIL;
                                    while (NIL == done_var_$10) {
                                        SubLObject rule = iteration.iteration_next_without_values_macro_helper(final_index_iterator, token_var_$11);
                                        SubLObject valid_$12 = makeBoolean(!token_var_$11.eql(rule));
                                        if (NIL != valid_$12) {
                                            rules = add_selected_rule(rule, rules);
                                        }
                                        done_var_$10 = makeBoolean(NIL == valid_$12);
                                    }
                                } finally {
                                    SubLObject _prev_bind_0 = Threads.$is_thread_performing_cleanupP$.currentBinding(thread);
                                    try {
                                        Threads.$is_thread_performing_cleanupP$.bind(T, thread);
                                        SubLObject _values = Values.getValuesAsVector();
                                        if (NIL != final_index_iterator) {
                                            kb_mapping_macros.destroy_final_index_iterator(final_index_iterator);
                                        }
                                        Values.restoreValuesFromVector(_values);
                                    } finally {
                                        Threads.$is_thread_performing_cleanupP$.rebind(_prev_bind_0, thread);
                                    }
                                }
                            }
                            done_var = makeBoolean(NIL == valid);
                        }
                    }
                    cdolist_list_var_$9 = cdolist_list_var_$9.rest();
                    direction = cdolist_list_var_$9.first();
                }
            }
            cdolist_list_var = cdolist_list_var.rest();
            index_pred = cdolist_list_var.first();
        }
        return finalize_selected_rules(rules);
    }

    @SubL(source = "cycl/inference/modules/transformation-modules.lisp", position = 13800L)
    public static SubLObject trans_predicate_genlpreds_pos_expand_int(SubLObject asent, SubLObject rule) {
        SubLObject predicate = cycl_utilities.atomic_sentence_predicate(asent);
        if (NIL != backward_utilities.rule_relevant_to_proof(rule)) {
            SubLObject cnf_var = assertions_high.assertion_cnf(rule);
            SubLObject cdolist_list_var = clauses.pos_lits(cnf_var);
            SubLObject examine = NIL;
            examine = cdolist_list_var.first();
            while (NIL != cdolist_list_var) {
                SubLObject index_pred = cycl_utilities.atomic_sentence_predicate(examine);
                if (NIL != inference_proper_genl_predicateP(index_pred, predicate, UNPROVIDED)) {
                    SubLObject index_pred_asent = el_utilities.replace_formula_arg(ZERO_INTEGER, index_pred, asent);
                    SubLObject v_bindings = unification_utilities.transformation_asent_unify(index_pred_asent, examine);
                    if (NIL != v_bindings) {
                        return Values.values(v_bindings, examine, index_pred, predicate);
                    }
                }
                cdolist_list_var = cdolist_list_var.rest();
                examine = cdolist_list_var.first();
            }
        }
        return Values.values(NIL, NIL, NIL, NIL);
    }

    @SubL(source = "cycl/inference/modules/transformation-modules.lisp", position = 14300L)
    public static SubLObject trans_predicate_genlpreds_pos_rule_filter(SubLObject asent, SubLObject rule) {
        SubLThread thread = SubLProcess.currentSubLThread();
        thread.resetMultipleValues();
        SubLObject v_bindings = trans_predicate_genlpreds_pos_expand_int(asent, rule);
        SubLObject examine = thread.secondMultipleValue();
        SubLObject index_pred = thread.thirdMultipleValue();
        SubLObject predicate = thread.fourthMultipleValue();
        thread.resetMultipleValues();
        if (NIL != v_bindings && NIL == inference_trampolines.inference_backchain_forbiddenP(index_pred, mt_relevance_macros.$mt$.getDynamicValue(thread))) {
            return T;
        }
        return NIL;
    }

    @SubL(source = "cycl/inference/modules/transformation-modules.lisp", position = 14700L)
    public static SubLObject trans_predicate_genlpreds_pos_expand(SubLObject asent, SubLObject rule) {
        SubLThread thread = SubLProcess.currentSubLThread();
        thread.resetMultipleValues();
        SubLObject v_bindings = trans_predicate_genlpreds_pos_expand_int(asent, rule);
        SubLObject examine = thread.secondMultipleValue();
        SubLObject index_pred = thread.thirdMultipleValue();
        SubLObject predicate = thread.fourthMultipleValue();
        thread.resetMultipleValues();
        if (NIL != v_bindings) {
            SubLObject more_supports = additional_genlpreds_supports(index_pred, predicate);
            backward.transformation_add_node(rule, examine, $POS, v_bindings, more_supports);
        }
        return NIL;
    }

    @SubL(source = "cycl/inference/modules/transformation-modules.lisp", position = 15100L)
    public static SubLObject trans_predicate_genlpreds_neg_expand_int(SubLObject asent, SubLObject rule) {
        SubLObject predicate = cycl_utilities.atomic_sentence_predicate(asent);
        if (NIL != backward_utilities.rule_relevant_to_proof(rule)) {
            SubLObject cnf_var = assertions_high.assertion_cnf(rule);
            SubLObject cdolist_list_var = clauses.neg_lits(cnf_var);
            SubLObject examine = NIL;
            examine = cdolist_list_var.first();
            while (NIL != cdolist_list_var) {
                SubLObject index_pred = cycl_utilities.atomic_sentence_predicate(examine);
                if (NIL != inference_proper_genl_predicateP(predicate, index_pred, UNPROVIDED)) {
                    SubLObject index_pred_asent = el_utilities.replace_formula_arg(ZERO_INTEGER, index_pred, asent);
                    SubLObject v_bindings = unification_utilities.transformation_asent_unify(index_pred_asent, examine);
                    if (NIL != v_bindings) {
                        return Values.values(v_bindings, examine, predicate, index_pred);
                    }
                }
                cdolist_list_var = cdolist_list_var.rest();
                examine = cdolist_list_var.first();
            }
        }
        return Values.values(NIL, NIL, NIL, NIL);
    }

    @SubL(source = "cycl/inference/modules/transformation-modules.lisp", position = 15700L)
    public static SubLObject trans_predicate_genlpreds_neg_rule_filter(SubLObject asent, SubLObject rule) {
        SubLThread thread = SubLProcess.currentSubLThread();
        thread.resetMultipleValues();
        SubLObject v_bindings = trans_predicate_genlpreds_neg_expand_int(asent, rule);
        SubLObject examine = thread.secondMultipleValue();
        SubLObject predicate = thread.thirdMultipleValue();
        SubLObject index_pred = thread.fourthMultipleValue();
        thread.resetMultipleValues();
        if (NIL != v_bindings && NIL == inference_trampolines.inference_backchain_forbiddenP(index_pred, mt_relevance_macros.$mt$.getDynamicValue(thread))) {
            return T;
        }
        return NIL;
    }

    @SubL(source = "cycl/inference/modules/transformation-modules.lisp", position = 16000L)
    public static SubLObject trans_predicate_genlpreds_neg_expand(SubLObject asent, SubLObject rule) {
        SubLThread thread = SubLProcess.currentSubLThread();
        thread.resetMultipleValues();
        SubLObject v_bindings = trans_predicate_genlpreds_neg_expand_int(asent, rule);
        SubLObject examine = thread.secondMultipleValue();
        SubLObject predicate = thread.thirdMultipleValue();
        SubLObject index_pred = thread.fourthMultipleValue();
        thread.resetMultipleValues();
        if (NIL != v_bindings) {
            SubLObject more_supports = additional_genlpreds_supports(predicate, index_pred);
            backward.transformation_add_node(rule, examine, $NEG, v_bindings, more_supports);
        }
        return NIL;
    }

    @SubL(source = "cycl/inference/modules/transformation-modules.lisp", position = 18000L)
    public static SubLObject trans_predicate_genlpreds_required(SubLObject asent) {
        SubLThread thread = SubLProcess.currentSubLThread();
        return makeBoolean(NIL == control_vars.$unique_inference_result_bindings$.getDynamicValue(thread) || NIL == variables.fully_bound_p(asent) || NIL == transformation_gaf_truth_known(asent));
    }

    @SubL(source = "cycl/inference/modules/transformation-modules.lisp", position = 18300L)
    public static SubLObject inference_proper_genl_predicateP_internal(SubLObject spec_pred, SubLObject genl_pred, SubLObject mt) {
        if (mt == UNPROVIDED) {
            mt = mt_relevance_macros.$mt$.getDynamicValue();
        }
        if (!spec_pred.eql(genl_pred) && NIL != forts.fort_p(spec_pred) && NIL != forts.fort_p(genl_pred) && NIL != fort_types_interface.predicateP(spec_pred) && NIL != fort_types_interface.predicateP(genl_pred)) {
            return genl_predicates.genl_predicateP(spec_pred, genl_pred, mt, UNPROVIDED);
        }
        return NIL;
    }

    @SubL(source = "cycl/inference/modules/transformation-modules.lisp", position = 18300L)
    public static SubLObject inference_proper_genl_predicateP(SubLObject spec_pred, SubLObject genl_pred, SubLObject mt) {
        if (mt == UNPROVIDED) {
            mt = mt_relevance_macros.$mt$.getDynamicValue();
        }
        SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject v_memoization_state = memoization_state.$memoization_state$.getDynamicValue(thread);
        SubLObject caching_state = NIL;
        if (NIL == v_memoization_state) {
            return inference_proper_genl_predicateP_internal(spec_pred, genl_pred, mt);
        }
        caching_state = memoization_state.memoization_state_lookup(v_memoization_state, $sym53$INFERENCE_PROPER_GENL_PREDICATE_, UNPROVIDED);
        if (NIL == caching_state) {
            caching_state = memoization_state.create_caching_state(memoization_state.memoization_state_lock(v_memoization_state), $sym53$INFERENCE_PROPER_GENL_PREDICATE_, THREE_INTEGER, NIL, EQL, UNPROVIDED);
            memoization_state.memoization_state_put(v_memoization_state, $sym53$INFERENCE_PROPER_GENL_PREDICATE_, caching_state);
        }
        SubLObject sxhash = memoization_state.sxhash_calc_3(spec_pred, genl_pred, mt);
        SubLObject collisions = memoization_state.caching_state_lookup(caching_state, sxhash, UNPROVIDED);
        if (!collisions.eql(memoization_state.$memoized_item_not_found$.getGlobalValue())) {
            SubLObject cdolist_list_var = collisions;
            SubLObject collision = NIL;
            collision = cdolist_list_var.first();
            while (NIL != cdolist_list_var) {
                SubLObject cached_args = collision.first();
                SubLObject results2 = conses_high.second(collision);
                if (spec_pred.eql(cached_args.first())) {
                    cached_args = cached_args.rest();
                    if (genl_pred.eql(cached_args.first())) {
                        cached_args = cached_args.rest();
                        if (NIL != cached_args && NIL == cached_args.rest() && mt.eql(cached_args.first())) {
                            return memoization_state.caching_results(results2);
                        }
                    }
                }
                cdolist_list_var = cdolist_list_var.rest();
                collision = cdolist_list_var.first();
            }
        }
        SubLObject results3 = Values.arg2(thread.resetMultipleValues(), Values.multiple_value_list(inference_proper_genl_predicateP_internal(spec_pred, genl_pred, mt)));
        memoization_state.caching_state_enter_multi_key_n(caching_state, sxhash, collisions, results3, list(spec_pred, genl_pred, mt));
        return memoization_state.caching_results(results3);
    }

    @SubL(source = "cycl/inference/modules/transformation-modules.lisp", position = 18700L)
    public static SubLObject trans_predicate_genlinverse_pos_required(SubLObject asent) {
        return trans_predicate_genlpreds_required(asent);
    }

    @SubL(source = "cycl/inference/modules/transformation-modules.lisp", position = 19000L)
    public static SubLObject trans_predicate_genlinverse_neg_required(SubLObject asent) {
        return trans_predicate_genlpreds_required(asent);
    }

    @SubL(source = "cycl/inference/modules/transformation-modules.lisp", position = 19100L)
    public static SubLObject trans_predicate_genlinverse_pos_cost(SubLObject asent) {
        SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject predicate = cycl_utilities.atomic_sentence_predicate(asent);
        thread.resetMultipleValues();
        SubLObject spec_inverses = inference_trampolines.inference_all_proper_spec_inverses_with_axiom_index(predicate, $POS);
        SubLObject cost = thread.secondMultipleValue();
        thread.resetMultipleValues();
        return cost;
    }

    @SubL(source = "cycl/inference/modules/transformation-modules.lisp", position = 19400L)
    public static SubLObject trans_predicate_genlinverse_neg_cost(SubLObject asent) {
        SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject predicate = cycl_utilities.atomic_sentence_predicate(asent);
        thread.resetMultipleValues();
        SubLObject genl_inverses = inference_trampolines.inference_all_proper_genl_inverses_with_axiom_index(predicate, $NEG);
        SubLObject cost = thread.secondMultipleValue();
        thread.resetMultipleValues();
        return cost;
    }

    @SubL(source = "cycl/inference/modules/transformation-modules.lisp", position = 19600L)
    public static SubLObject trans_predicate_genlinverse_pos_rule_select(SubLObject asent) {
        return conses_high.copy_list(trans_predicate_genlinverse_pos_rule_select_int(cycl_utilities.atomic_sentence_predicate(asent)));
    }

    @SubL(source = "cycl/inference/modules/transformation-modules.lisp", position = 19800L)
    public static SubLObject trans_predicate_genlinverse_pos_rule_select_int_internal(SubLObject predicate) {
        SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject rules = new_selected_rules();
        SubLObject cdolist_list_var = inference_trampolines.inference_all_proper_spec_inverses_with_axiom_index(predicate, $POS);
        SubLObject index_pred = NIL;
        index_pred = cdolist_list_var.first();
        while (NIL != cdolist_list_var) {
            if (NIL == inference_trampolines.inference_backchain_forbiddenP(index_pred, mt_relevance_macros.$mt$.getDynamicValue(thread))) {
                SubLObject cdolist_list_var_$13 = backward_utilities.relevant_directions();
                SubLObject direction = NIL;
                direction = cdolist_list_var_$13.first();
                while (NIL != cdolist_list_var_$13) {
                    if (NIL != kb_mapping_macros.do_predicate_rule_index_key_validator(index_pred, $POS, direction)) {
                        SubLObject iterator_var = kb_mapping_macros.new_predicate_rule_final_index_spec_iterator(index_pred, $POS, direction);
                        SubLObject done_var = NIL;
                        SubLObject token_var = NIL;
                        while (NIL == done_var) {
                            SubLObject final_index_spec = iteration.iteration_next_without_values_macro_helper(iterator_var, token_var);
                            SubLObject valid = makeBoolean(!token_var.eql(final_index_spec));
                            if (NIL != valid) {
                                SubLObject final_index_iterator = NIL;
                                try {
                                    final_index_iterator = kb_mapping_macros.new_final_index_iterator(final_index_spec, $RULE, NIL, direction);
                                    SubLObject done_var_$14 = NIL;
                                    SubLObject token_var_$15 = NIL;
                                    while (NIL == done_var_$14) {
                                        SubLObject rule = iteration.iteration_next_without_values_macro_helper(final_index_iterator, token_var_$15);
                                        SubLObject valid_$16 = makeBoolean(!token_var_$15.eql(rule));
                                        if (NIL != valid_$16) {
                                            rules = add_selected_rule(rule, rules);
                                        }
                                        done_var_$14 = makeBoolean(NIL == valid_$16);
                                    }
                                } finally {
                                    SubLObject _prev_bind_0 = Threads.$is_thread_performing_cleanupP$.currentBinding(thread);
                                    try {
                                        Threads.$is_thread_performing_cleanupP$.bind(T, thread);
                                        SubLObject _values = Values.getValuesAsVector();
                                        if (NIL != final_index_iterator) {
                                            kb_mapping_macros.destroy_final_index_iterator(final_index_iterator);
                                        }
                                        Values.restoreValuesFromVector(_values);
                                    } finally {
                                        Threads.$is_thread_performing_cleanupP$.rebind(_prev_bind_0, thread);
                                    }
                                }
                            }
                            done_var = makeBoolean(NIL == valid);
                        }
                    }
                    cdolist_list_var_$13 = cdolist_list_var_$13.rest();
                    direction = cdolist_list_var_$13.first();
                }
            }
            cdolist_list_var = cdolist_list_var.rest();
            index_pred = cdolist_list_var.first();
        }
        return finalize_selected_rules(rules);
    }

    @SubL(source = "cycl/inference/modules/transformation-modules.lisp", position = 19800L)
    public static SubLObject trans_predicate_genlinverse_pos_rule_select_int(SubLObject predicate) {
        SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject v_memoization_state = memoization_state.$memoization_state$.getDynamicValue(thread);
        SubLObject caching_state = NIL;
        if (NIL == v_memoization_state) {
            return trans_predicate_genlinverse_pos_rule_select_int_internal(predicate);
        }
        caching_state = memoization_state.memoization_state_lookup(v_memoization_state, $sym54$TRANS_PREDICATE_GENLINVERSE_POS_RULE_SELECT_INT, UNPROVIDED);
        if (NIL == caching_state) {
            caching_state = memoization_state.create_caching_state(memoization_state.memoization_state_lock(v_memoization_state), $sym54$TRANS_PREDICATE_GENLINVERSE_POS_RULE_SELECT_INT, ONE_INTEGER, NIL, EQL, UNPROVIDED);
            memoization_state.memoization_state_put(v_memoization_state, $sym54$TRANS_PREDICATE_GENLINVERSE_POS_RULE_SELECT_INT, caching_state);
        }
        SubLObject results = memoization_state.caching_state_lookup(caching_state, predicate, memoization_state.$memoized_item_not_found$.getGlobalValue());
        if (results.eql(memoization_state.$memoized_item_not_found$.getGlobalValue())) {
            results = Values.arg2(thread.resetMultipleValues(), Values.multiple_value_list(trans_predicate_genlinverse_pos_rule_select_int_internal(predicate)));
            memoization_state.caching_state_put(caching_state, predicate, results, UNPROVIDED);
        }
        return memoization_state.caching_results(results);
    }

    @SubL(source = "cycl/inference/modules/transformation-modules.lisp", position = 20400L)
    public static SubLObject trans_predicate_genlinverse_neg_rule_select(SubLObject asent) {
        SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject predicate = cycl_utilities.atomic_sentence_predicate(asent);
        SubLObject rules = new_selected_rules();
        SubLObject cdolist_list_var = inference_trampolines.inference_all_proper_genl_inverses_with_axiom_index(predicate, $NEG);
        SubLObject index_pred = NIL;
        index_pred = cdolist_list_var.first();
        while (NIL != cdolist_list_var) {
            if (NIL == inference_trampolines.inference_backchain_forbiddenP(index_pred, mt_relevance_macros.$mt$.getDynamicValue(thread))) {
                SubLObject cdolist_list_var_$17 = backward_utilities.relevant_directions();
                SubLObject direction = NIL;
                direction = cdolist_list_var_$17.first();
                while (NIL != cdolist_list_var_$17) {
                    if (NIL != kb_mapping_macros.do_predicate_rule_index_key_validator(index_pred, $NEG, direction)) {
                        SubLObject iterator_var = kb_mapping_macros.new_predicate_rule_final_index_spec_iterator(index_pred, $NEG, direction);
                        SubLObject done_var = NIL;
                        SubLObject token_var = NIL;
                        while (NIL == done_var) {
                            SubLObject final_index_spec = iteration.iteration_next_without_values_macro_helper(iterator_var, token_var);
                            SubLObject valid = makeBoolean(!token_var.eql(final_index_spec));
                            if (NIL != valid) {
                                SubLObject final_index_iterator = NIL;
                                try {
                                    final_index_iterator = kb_mapping_macros.new_final_index_iterator(final_index_spec, $RULE, NIL, direction);
                                    SubLObject done_var_$18 = NIL;
                                    SubLObject token_var_$19 = NIL;
                                    while (NIL == done_var_$18) {
                                        SubLObject rule = iteration.iteration_next_without_values_macro_helper(final_index_iterator, token_var_$19);
                                        SubLObject valid_$20 = makeBoolean(!token_var_$19.eql(rule));
                                        if (NIL != valid_$20) {
                                            rules = add_selected_rule(rule, rules);
                                        }
                                        done_var_$18 = makeBoolean(NIL == valid_$20);
                                    }
                                } finally {
                                    SubLObject _prev_bind_0 = Threads.$is_thread_performing_cleanupP$.currentBinding(thread);
                                    try {
                                        Threads.$is_thread_performing_cleanupP$.bind(T, thread);
                                        SubLObject _values = Values.getValuesAsVector();
                                        if (NIL != final_index_iterator) {
                                            kb_mapping_macros.destroy_final_index_iterator(final_index_iterator);
                                        }
                                        Values.restoreValuesFromVector(_values);
                                    } finally {
                                        Threads.$is_thread_performing_cleanupP$.rebind(_prev_bind_0, thread);
                                    }
                                }
                            }
                            done_var = makeBoolean(NIL == valid);
                        }
                    }
                    cdolist_list_var_$17 = cdolist_list_var_$17.rest();
                    direction = cdolist_list_var_$17.first();
                }
            }
            cdolist_list_var = cdolist_list_var.rest();
            index_pred = cdolist_list_var.first();
        }
        return finalize_selected_rules(rules);
    }

    @SubL(source = "cycl/inference/modules/transformation-modules.lisp", position = 20900L)
    public static SubLObject trans_predicate_genlinverse_pos_expand_int(SubLObject asent, SubLObject rule) {
        SubLObject inverted_asent = removal_modules_symmetry.symmetric_asent(asent);
        SubLObject predicate = cycl_utilities.atomic_sentence_predicate(inverted_asent);
        if (NIL != backward_utilities.rule_relevant_to_proof(rule)) {
            SubLObject cnf_var = assertions_high.assertion_cnf(rule);
            SubLObject cdolist_list_var = clauses.pos_lits(cnf_var);
            SubLObject examine = NIL;
            examine = cdolist_list_var.first();
            while (NIL != cdolist_list_var) {
                SubLObject index_pred = cycl_utilities.atomic_sentence_predicate(examine);
                if (NIL != inference_proper_genl_inverseP(index_pred, predicate, UNPROVIDED)) {
                    SubLObject index_pred_asent = el_utilities.replace_formula_arg(ZERO_INTEGER, index_pred, inverted_asent);
                    SubLObject v_bindings = unification_utilities.transformation_asent_unify(index_pred_asent, examine);
                    if (NIL != v_bindings) {
                        return Values.values(v_bindings, examine, index_pred, predicate);
                    }
                }
                cdolist_list_var = cdolist_list_var.rest();
                examine = cdolist_list_var.first();
            }
        }
        return Values.values(NIL, NIL, NIL, NIL);
    }

    @SubL(source = "cycl/inference/modules/transformation-modules.lisp", position = 21500L)
    public static SubLObject trans_predicate_genlinverse_pos_rule_filter(SubLObject asent, SubLObject rule) {
        SubLThread thread = SubLProcess.currentSubLThread();
        thread.resetMultipleValues();
        SubLObject v_bindings = trans_predicate_genlinverse_pos_expand_int(asent, rule);
        SubLObject examine = thread.secondMultipleValue();
        SubLObject index_pred = thread.thirdMultipleValue();
        SubLObject predicate = thread.fourthMultipleValue();
        thread.resetMultipleValues();
        if (NIL != v_bindings && NIL == inference_trampolines.inference_backchain_forbiddenP(index_pred, mt_relevance_macros.$mt$.getDynamicValue(thread))) {
            return T;
        }
        return NIL;
    }

    @SubL(source = "cycl/inference/modules/transformation-modules.lisp", position = 21900L)
    public static SubLObject trans_predicate_genlinverse_pos_expand(SubLObject asent, SubLObject rule) {
        SubLThread thread = SubLProcess.currentSubLThread();
        thread.resetMultipleValues();
        SubLObject v_bindings = trans_predicate_genlinverse_pos_expand_int(asent, rule);
        SubLObject examine = thread.secondMultipleValue();
        SubLObject index_pred = thread.thirdMultipleValue();
        SubLObject predicate = thread.fourthMultipleValue();
        thread.resetMultipleValues();
        if (NIL != v_bindings) {
            SubLObject more_supports = additional_genlinverse_supports(index_pred, predicate);
            backward.transformation_add_node(rule, examine, $POS, v_bindings, more_supports);
        }
        return NIL;
    }

    @SubL(source = "cycl/inference/modules/transformation-modules.lisp", position = 22300L)
    public static SubLObject trans_predicate_genlinverse_neg_expand_int(SubLObject asent, SubLObject rule) {
        SubLObject inverted_asent = removal_modules_symmetry.symmetric_asent(asent);
        SubLObject predicate = cycl_utilities.atomic_sentence_predicate(inverted_asent);
        if (NIL != backward_utilities.rule_relevant_to_proof(rule)) {
            SubLObject cnf_var = assertions_high.assertion_cnf(rule);
            SubLObject cdolist_list_var = clauses.neg_lits(cnf_var);
            SubLObject examine = NIL;
            examine = cdolist_list_var.first();
            while (NIL != cdolist_list_var) {
                SubLObject index_pred = cycl_utilities.atomic_sentence_predicate(examine);
                if (NIL != inference_proper_genl_inverseP(predicate, index_pred, UNPROVIDED)) {
                    SubLObject index_pred_asent = el_utilities.replace_formula_arg(ZERO_INTEGER, index_pred, inverted_asent);
                    SubLObject v_bindings = unification_utilities.transformation_asent_unify(index_pred_asent, examine);
                    if (NIL != v_bindings) {
                        return Values.values(v_bindings, examine, predicate, index_pred);
                    }
                }
                cdolist_list_var = cdolist_list_var.rest();
                examine = cdolist_list_var.first();
            }
        }
        return Values.values(NIL, NIL, NIL, NIL);
    }

    @SubL(source = "cycl/inference/modules/transformation-modules.lisp", position = 22900L)
    public static SubLObject trans_predicate_genlinverse_neg_rule_filter(SubLObject asent, SubLObject rule) {
        SubLThread thread = SubLProcess.currentSubLThread();
        thread.resetMultipleValues();
        SubLObject v_bindings = trans_predicate_genlinverse_neg_expand_int(asent, rule);
        SubLObject examine = thread.secondMultipleValue();
        SubLObject predicate = thread.thirdMultipleValue();
        SubLObject index_pred = thread.fourthMultipleValue();
        thread.resetMultipleValues();
        if (NIL != v_bindings && NIL == inference_trampolines.inference_backchain_forbiddenP(index_pred, mt_relevance_macros.$mt$.getDynamicValue(thread))) {
            return T;
        }
        return NIL;
    }

    @SubL(source = "cycl/inference/modules/transformation-modules.lisp", position = 23200L)
    public static SubLObject trans_predicate_genlinverse_neg_expand(SubLObject asent, SubLObject rule) {
        SubLThread thread = SubLProcess.currentSubLThread();
        thread.resetMultipleValues();
        SubLObject v_bindings = trans_predicate_genlinverse_neg_expand_int(asent, rule);
        SubLObject examine = thread.secondMultipleValue();
        SubLObject predicate = thread.thirdMultipleValue();
        SubLObject index_pred = thread.fourthMultipleValue();
        thread.resetMultipleValues();
        if (NIL != v_bindings) {
            SubLObject more_supports = additional_genlinverse_supports(predicate, index_pred);
            backward.transformation_add_node(rule, examine, $NEG, v_bindings, more_supports);
        }
        return NIL;
    }

    @SubL(source = "cycl/inference/modules/transformation-modules.lisp", position = 25400L)
    public static SubLObject inference_proper_genl_inverseP_internal(SubLObject spec_pred, SubLObject genl_inverse, SubLObject mt) {
        if (mt == UNPROVIDED) {
            mt = mt_relevance_macros.$mt$.getDynamicValue();
        }
        if (!spec_pred.eql(genl_inverse) && NIL != forts.fort_p(spec_pred) && NIL != forts.fort_p(genl_inverse) && NIL != fort_types_interface.predicateP(spec_pred) && NIL != fort_types_interface.predicateP(genl_inverse)) {
            return genl_predicates.genl_inverseP(spec_pred, genl_inverse, mt, UNPROVIDED);
        }
        return NIL;
    }

    @SubL(source = "cycl/inference/modules/transformation-modules.lisp", position = 25400L)
    public static SubLObject inference_proper_genl_inverseP(SubLObject spec_pred, SubLObject genl_inverse, SubLObject mt) {
        if (mt == UNPROVIDED) {
            mt = mt_relevance_macros.$mt$.getDynamicValue();
        }
        SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject v_memoization_state = memoization_state.$memoization_state$.getDynamicValue(thread);
        SubLObject caching_state = NIL;
        if (NIL == v_memoization_state) {
            return inference_proper_genl_inverseP_internal(spec_pred, genl_inverse, mt);
        }
        caching_state = memoization_state.memoization_state_lookup(v_memoization_state, $sym59$INFERENCE_PROPER_GENL_INVERSE_, UNPROVIDED);
        if (NIL == caching_state) {
            caching_state = memoization_state.create_caching_state(memoization_state.memoization_state_lock(v_memoization_state), $sym59$INFERENCE_PROPER_GENL_INVERSE_, THREE_INTEGER, NIL, EQL, UNPROVIDED);
            memoization_state.memoization_state_put(v_memoization_state, $sym59$INFERENCE_PROPER_GENL_INVERSE_, caching_state);
        }
        SubLObject sxhash = memoization_state.sxhash_calc_3(spec_pred, genl_inverse, mt);
        SubLObject collisions = memoization_state.caching_state_lookup(caching_state, sxhash, UNPROVIDED);
        if (!collisions.eql(memoization_state.$memoized_item_not_found$.getGlobalValue())) {
            SubLObject cdolist_list_var = collisions;
            SubLObject collision = NIL;
            collision = cdolist_list_var.first();
            while (NIL != cdolist_list_var) {
                SubLObject cached_args = collision.first();
                SubLObject results2 = conses_high.second(collision);
                if (spec_pred.eql(cached_args.first())) {
                    cached_args = cached_args.rest();
                    if (genl_inverse.eql(cached_args.first())) {
                        cached_args = cached_args.rest();
                        if (NIL != cached_args && NIL == cached_args.rest() && mt.eql(cached_args.first())) {
                            return memoization_state.caching_results(results2);
                        }
                    }
                }
                cdolist_list_var = cdolist_list_var.rest();
                collision = cdolist_list_var.first();
            }
        }
        SubLObject results3 = Values.arg2(thread.resetMultipleValues(), Values.multiple_value_list(inference_proper_genl_inverseP_internal(spec_pred, genl_inverse, mt)));
        memoization_state.caching_state_enter_multi_key_n(caching_state, sxhash, collisions, results3, list(spec_pred, genl_inverse, mt));
        return memoization_state.caching_results(results3);
    }

    @SubL(source = "cycl/inference/modules/transformation-modules.lisp", position = 25800L)
    public static SubLObject trans_predicate_negationpreds_neg_required(SubLObject asent) {
        SubLThread thread = SubLProcess.currentSubLThread();
        return makeBoolean(NIL == control_vars.$unique_inference_result_bindings$.getDynamicValue(thread) || NIL == variables.fully_bound_p(asent) || NIL == transformation_gaf_truth_known(asent));
    }

    @SubL(source = "cycl/inference/modules/transformation-modules.lisp", position = 26200L)
    public static SubLObject trans_predicate_negationpreds_neg_cost(SubLObject asent) {
        SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject predicate = cycl_utilities.atomic_sentence_predicate(asent);
        thread.resetMultipleValues();
        SubLObject negation_preds = inference_trampolines.inference_all_negation_predicates_with_axiom_index(predicate, $POS);
        SubLObject cost = thread.secondMultipleValue();
        thread.resetMultipleValues();
        return cost;
    }

    @SubL(source = "cycl/inference/modules/transformation-modules.lisp", position = 26500L)
    public static SubLObject trans_predicate_negationpreds_neg_rule_select(SubLObject asent) {
        SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject predicate = cycl_utilities.atomic_sentence_predicate(asent);
        SubLObject rules = new_selected_rules();
        SubLObject cdolist_list_var = inference_trampolines.inference_all_negation_predicates_with_axiom_index(predicate, $POS);
        SubLObject index_pred = NIL;
        index_pred = cdolist_list_var.first();
        while (NIL != cdolist_list_var) {
            if (NIL == inference_trampolines.inference_backchain_forbiddenP(index_pred, mt_relevance_macros.$mt$.getDynamicValue(thread))) {
                SubLObject cdolist_list_var_$21 = backward_utilities.relevant_directions();
                SubLObject direction = NIL;
                direction = cdolist_list_var_$21.first();
                while (NIL != cdolist_list_var_$21) {
                    if (NIL != kb_mapping_macros.do_predicate_rule_index_key_validator(index_pred, $POS, direction)) {
                        SubLObject iterator_var = kb_mapping_macros.new_predicate_rule_final_index_spec_iterator(index_pred, $POS, direction);
                        SubLObject done_var = NIL;
                        SubLObject token_var = NIL;
                        while (NIL == done_var) {
                            SubLObject final_index_spec = iteration.iteration_next_without_values_macro_helper(iterator_var, token_var);
                            SubLObject valid = makeBoolean(!token_var.eql(final_index_spec));
                            if (NIL != valid) {
                                SubLObject final_index_iterator = NIL;
                                try {
                                    final_index_iterator = kb_mapping_macros.new_final_index_iterator(final_index_spec, $RULE, NIL, direction);
                                    SubLObject done_var_$22 = NIL;
                                    SubLObject token_var_$23 = NIL;
                                    while (NIL == done_var_$22) {
                                        SubLObject rule = iteration.iteration_next_without_values_macro_helper(final_index_iterator, token_var_$23);
                                        SubLObject valid_$24 = makeBoolean(!token_var_$23.eql(rule));
                                        if (NIL != valid_$24) {
                                            rules = add_selected_rule(rule, rules);
                                        }
                                        done_var_$22 = makeBoolean(NIL == valid_$24);
                                    }
                                } finally {
                                    SubLObject _prev_bind_0 = Threads.$is_thread_performing_cleanupP$.currentBinding(thread);
                                    try {
                                        Threads.$is_thread_performing_cleanupP$.bind(T, thread);
                                        SubLObject _values = Values.getValuesAsVector();
                                        if (NIL != final_index_iterator) {
                                            kb_mapping_macros.destroy_final_index_iterator(final_index_iterator);
                                        }
                                        Values.restoreValuesFromVector(_values);
                                    } finally {
                                        Threads.$is_thread_performing_cleanupP$.rebind(_prev_bind_0, thread);
                                    }
                                }
                            }
                            done_var = makeBoolean(NIL == valid);
                        }
                    }
                    cdolist_list_var_$21 = cdolist_list_var_$21.rest();
                    direction = cdolist_list_var_$21.first();
                }
            }
            cdolist_list_var = cdolist_list_var.rest();
            index_pred = cdolist_list_var.first();
        }
        return finalize_selected_rules(rules);
    }

    @SubL(source = "cycl/inference/modules/transformation-modules.lisp", position = 27100L)
    public static SubLObject trans_predicate_negationpreds_neg_expand_int(SubLObject asent, SubLObject rule) {
        SubLObject predicate = cycl_utilities.atomic_sentence_predicate(asent);
        if (NIL != backward_utilities.rule_relevant_to_proof(rule)) {
            SubLObject cnf_var = assertions_high.assertion_cnf(rule);
            SubLObject cdolist_list_var = clauses.pos_lits(cnf_var);
            SubLObject examine = NIL;
            examine = cdolist_list_var.first();
            while (NIL != cdolist_list_var) {
                SubLObject index_pred = cycl_utilities.atomic_sentence_predicate(examine);
                if (NIL != negation_predicate.negation_predicateP(index_pred, predicate, UNPROVIDED, UNPROVIDED)) {
                    SubLObject index_pred_asent = el_utilities.replace_formula_arg(ZERO_INTEGER, index_pred, asent);
                    SubLObject v_bindings = unification_utilities.transformation_asent_unify(index_pred_asent, examine);
                    if (NIL != v_bindings) {
                        return Values.values(v_bindings, examine, index_pred, predicate);
                    }
                }
                cdolist_list_var = cdolist_list_var.rest();
                examine = cdolist_list_var.first();
            }
        }
        return Values.values(NIL, NIL, NIL, NIL);
    }

    @SubL(source = "cycl/inference/modules/transformation-modules.lisp", position = 27600L)
    public static SubLObject trans_predicate_negationpreds_neg_rule_filter(SubLObject asent, SubLObject rule) {
        SubLThread thread = SubLProcess.currentSubLThread();
        thread.resetMultipleValues();
        SubLObject v_bindings = trans_predicate_negationpreds_neg_expand_int(asent, rule);
        SubLObject examine = thread.secondMultipleValue();
        SubLObject index_pred = thread.thirdMultipleValue();
        SubLObject predicate = thread.fourthMultipleValue();
        thread.resetMultipleValues();
        if (NIL != v_bindings && NIL == inference_trampolines.inference_backchain_forbiddenP(index_pred, mt_relevance_macros.$mt$.getDynamicValue(thread))) {
            return T;
        }
        return NIL;
    }

    @SubL(source = "cycl/inference/modules/transformation-modules.lisp", position = 28000L)
    public static SubLObject trans_predicate_negationpreds_neg_expand(SubLObject asent, SubLObject rule) {
        SubLThread thread = SubLProcess.currentSubLThread();
        thread.resetMultipleValues();
        SubLObject v_bindings = trans_predicate_negationpreds_neg_expand_int(asent, rule);
        SubLObject examine = thread.secondMultipleValue();
        SubLObject index_pred = thread.thirdMultipleValue();
        SubLObject predicate = thread.fourthMultipleValue();
        thread.resetMultipleValues();
        if (NIL != v_bindings) {
            SubLObject more_supports = additional_negationpreds_supports(index_pred, predicate);
            backward.transformation_add_node(rule, examine, $POS, v_bindings, more_supports);
        }
        return NIL;
    }

    @SubL(source = "cycl/inference/modules/transformation-modules.lisp", position = 29300L)
    public static SubLObject trans_predicate_commutativity_cost(SubLObject asent, SubLObject sense) {
        SubLObject cost = ZERO_INTEGER;
        if (NIL != el_utilities.el_binary_formula_p(asent)) {
            SubLObject permuted_asent = removal_modules_symmetry.symmetric_asent(asent);
            cost = Numbers.add(cost, trans_predicate_cost(permuted_asent, sense));
        } else {
            SubLObject cdolist_list_var = cycl_utilities.formula_commutative_permutations(asent, UNPROVIDED);
            SubLObject permuted_asent2 = NIL;
            permuted_asent2 = cdolist_list_var.first();
            while (NIL != cdolist_list_var) {
                if (!permuted_asent2.equal(asent)) {
                    cost = Numbers.add(cost, trans_predicate_cost(permuted_asent2, sense));
                }
                cdolist_list_var = cdolist_list_var.rest();
                permuted_asent2 = cdolist_list_var.first();
            }
        }
        return cost;
    }

    @SubL(source = "cycl/inference/modules/transformation-modules.lisp", position = 29700L)
    public static SubLObject trans_predicate_commutativity_rule_select(SubLObject asent, SubLObject sense) {
        SubLObject predicate = cycl_utilities.atomic_sentence_predicate(asent);
        SubLObject rules = new_selected_rules();
        SubLObject cdolist_list_var = backward_utilities.relevant_directions();
        SubLObject direction = NIL;
        direction = cdolist_list_var.first();
        while (NIL != cdolist_list_var) {
            if (NIL != kb_mapping_macros.do_predicate_rule_index_key_validator(predicate, sense, direction)) {
                SubLObject iterator_var = kb_mapping_macros.new_predicate_rule_final_index_spec_iterator(predicate, sense, direction);
                SubLObject done_var = NIL;
                SubLObject token_var = NIL;
                while (NIL == done_var) {
                    SubLObject final_index_spec = iteration.iteration_next_without_values_macro_helper(iterator_var, token_var);
                    SubLObject valid = makeBoolean(!token_var.eql(final_index_spec));
                    if (NIL != valid) {
                        SubLObject final_index_iterator = NIL;
                        try {
                            final_index_iterator = kb_mapping_macros.new_final_index_iterator(final_index_spec, $RULE, NIL, direction);
                            SubLObject done_var_$25 = NIL;
                            SubLObject token_var_$26 = NIL;
                            while (NIL == done_var_$25) {
                                SubLObject rule = iteration.iteration_next_without_values_macro_helper(final_index_iterator, token_var_$26);
                                SubLObject valid_$27 = makeBoolean(!token_var_$26.eql(rule));
                                if (NIL != valid_$27) {
                                    rules = add_selected_rule(rule, rules);
                                }
                                done_var_$25 = makeBoolean(NIL == valid_$27);
                            }
                        } finally {
                            SubLObject _prev_bind_0 = Dynamic.currentBinding(Threads.$is_thread_performing_cleanupP$);
                            try {
                                Dynamic.bind(Threads.$is_thread_performing_cleanupP$, T);
                                SubLObject _values = Values.getValuesAsVector();
                                if (NIL != final_index_iterator) {
                                    kb_mapping_macros.destroy_final_index_iterator(final_index_iterator);
                                }
                                Values.restoreValuesFromVector(_values);
                            } finally {
                                Dynamic.rebind(Threads.$is_thread_performing_cleanupP$, _prev_bind_0);
                            }
                        }
                    }
                    done_var = makeBoolean(NIL == valid);
                }
            }
            cdolist_list_var = cdolist_list_var.rest();
            direction = cdolist_list_var.first();
        }
        return finalize_selected_rules(rules);
    }

    @SubL(source = "cycl/inference/modules/transformation-modules.lisp", position = 30100L)
    public static SubLObject trans_predicate_commutativity_expand_int(SubLObject asent, SubLObject sense, SubLObject rule) {
        SubLObject predicate = cycl_utilities.atomic_sentence_predicate(asent);
        if (NIL != el_utilities.el_binary_formula_p(asent)) {
            SubLObject permuted_asent = removal_modules_symmetry.symmetric_asent(asent);
            SubLObject predicate_var = predicate;
            if (NIL != backward_utilities.rule_relevant_to_proof(rule)) {
                SubLObject cnf_var = assertions_high.assertion_cnf(rule);
                if ($POS == sense) {
                    SubLObject cdolist_list_var = clauses.pos_lits(cnf_var);
                    SubLObject examine = NIL;
                    examine = cdolist_list_var.first();
                    while (NIL != cdolist_list_var) {
                        if (predicate_var.eql(cycl_utilities.atomic_sentence_predicate(examine))) {
                            SubLObject v_bindings = unification_utilities.transformation_asent_unify(permuted_asent, examine);
                            if (NIL != v_bindings) {
                                return Values.values(v_bindings, examine, predicate);
                            }
                        }
                        cdolist_list_var = cdolist_list_var.rest();
                        examine = cdolist_list_var.first();
                    }
                } else if ($NEG == sense) {
                    SubLObject cdolist_list_var = clauses.neg_lits(cnf_var);
                    SubLObject examine = NIL;
                    examine = cdolist_list_var.first();
                    while (NIL != cdolist_list_var) {
                        if (predicate_var.eql(cycl_utilities.atomic_sentence_predicate(examine))) {
                            SubLObject v_bindings = unification_utilities.transformation_asent_unify(permuted_asent, examine);
                            if (NIL != v_bindings) {
                                return Values.values(v_bindings, examine, predicate);
                            }
                        }
                        cdolist_list_var = cdolist_list_var.rest();
                        examine = cdolist_list_var.first();
                    }
                } else {
                    Errors.error($str47$Invalid_sense__s, sense);
                }
            }
        } else {
            SubLObject cdolist_list_var2 = cycl_utilities.formula_commutative_permutations(asent, UNPROVIDED);
            SubLObject permuted_asent2 = NIL;
            permuted_asent2 = cdolist_list_var2.first();
            while (NIL != cdolist_list_var2) {
                if (!permuted_asent2.equal(asent)) {
                    SubLObject predicate_var2 = predicate;
                    if (NIL != backward_utilities.rule_relevant_to_proof(rule)) {
                        SubLObject cnf_var2 = assertions_high.assertion_cnf(rule);
                        if ($POS == sense) {
                            SubLObject cdolist_list_var_$28 = clauses.pos_lits(cnf_var2);
                            SubLObject examine2 = NIL;
                            examine2 = cdolist_list_var_$28.first();
                            while (NIL != cdolist_list_var_$28) {
                                if (predicate_var2.eql(cycl_utilities.atomic_sentence_predicate(examine2))) {
                                    SubLObject v_bindings2 = unification_utilities.transformation_asent_unify(permuted_asent2, examine2);
                                    if (NIL != v_bindings2) {
                                        return Values.values(v_bindings2, examine2, predicate);
                                    }
                                }
                                cdolist_list_var_$28 = cdolist_list_var_$28.rest();
                                examine2 = cdolist_list_var_$28.first();
                            }
                        } else if ($NEG == sense) {
                            SubLObject cdolist_list_var_$29 = clauses.neg_lits(cnf_var2);
                            SubLObject examine2 = NIL;
                            examine2 = cdolist_list_var_$29.first();
                            while (NIL != cdolist_list_var_$29) {
                                if (predicate_var2.eql(cycl_utilities.atomic_sentence_predicate(examine2))) {
                                    SubLObject v_bindings2 = unification_utilities.transformation_asent_unify(permuted_asent2, examine2);
                                    if (NIL != v_bindings2) {
                                        return Values.values(v_bindings2, examine2, predicate);
                                    }
                                }
                                cdolist_list_var_$29 = cdolist_list_var_$29.rest();
                                examine2 = cdolist_list_var_$29.first();
                            }
                        } else {
                            Errors.error($str47$Invalid_sense__s, sense);
                        }
                    }
                }
                cdolist_list_var2 = cdolist_list_var2.rest();
                permuted_asent2 = cdolist_list_var2.first();
            }
        }
        return Values.values(NIL, NIL, NIL);
    }

    @SubL(source = "cycl/inference/modules/transformation-modules.lisp", position = 30600L)
    public static SubLObject trans_predicate_commutativity_rule_filter(SubLObject asent, SubLObject sense, SubLObject rule) {
        SubLThread thread = SubLProcess.currentSubLThread();
        thread.resetMultipleValues();
        SubLObject v_bindings = trans_predicate_commutativity_expand_int(asent, sense, rule);
        SubLObject examine = thread.secondMultipleValue();
        SubLObject predicate = thread.thirdMultipleValue();
        thread.resetMultipleValues();
        if (NIL != v_bindings) {
            return T;
        }
        return NIL;
    }

    @SubL(source = "cycl/inference/modules/transformation-modules.lisp", position = 30800L)
    public static SubLObject trans_predicate_commutativity_expand(SubLObject asent, SubLObject sense, SubLObject rule) {
        SubLThread thread = SubLProcess.currentSubLThread();
        thread.resetMultipleValues();
        SubLObject v_bindings = trans_predicate_commutativity_expand_int(asent, sense, rule);
        SubLObject examine = thread.secondMultipleValue();
        SubLObject predicate = thread.thirdMultipleValue();
        thread.resetMultipleValues();
        if (NIL != v_bindings) {
            backward.transformation_add_node(rule, examine, sense, v_bindings, additional_predicate_commutativity_supports(predicate));
        }
        return NIL;
    }

    @SubL(source = "cycl/inference/modules/transformation-modules.lisp", position = 31300L)
    public static SubLObject trans_predicate_symmetry_pos_cost(SubLObject asent) {
        return trans_predicate_commutativity_cost(asent, $POS);
    }

    @SubL(source = "cycl/inference/modules/transformation-modules.lisp", position = 31500L)
    public static SubLObject trans_predicate_symmetry_neg_cost(SubLObject asent) {
        return trans_predicate_commutativity_cost(asent, $NEG);
    }

    @SubL(source = "cycl/inference/modules/transformation-modules.lisp", position = 31600L)
    public static SubLObject trans_predicate_symmetry_pos_rule_select(SubLObject asent) {
        return trans_predicate_commutativity_rule_select(asent, $POS);
    }

    @SubL(source = "cycl/inference/modules/transformation-modules.lisp", position = 31800L)
    public static SubLObject trans_predicate_symmetry_neg_rule_select(SubLObject asent) {
        return trans_predicate_commutativity_rule_select(asent, $NEG);
    }

    @SubL(source = "cycl/inference/modules/transformation-modules.lisp", position = 31900L)
    public static SubLObject trans_predicate_symmetry_pos_rule_filter(SubLObject asent, SubLObject rule) {
        return trans_predicate_commutativity_rule_filter(asent, $POS, rule);
    }

    @SubL(source = "cycl/inference/modules/transformation-modules.lisp", position = 32000L)
    public static SubLObject trans_predicate_symmetry_neg_rule_filter(SubLObject asent, SubLObject rule) {
        return trans_predicate_commutativity_rule_filter(asent, $NEG, rule);
    }

    @SubL(source = "cycl/inference/modules/transformation-modules.lisp", position = 32200L)
    public static SubLObject trans_predicate_symmetry_pos_expand(SubLObject asent, SubLObject rule) {
        return trans_predicate_commutativity_expand(asent, $POS, rule);
    }

    @SubL(source = "cycl/inference/modules/transformation-modules.lisp", position = 32300L)
    public static SubLObject trans_predicate_symmetry_neg_expand(SubLObject asent, SubLObject rule) {
        return trans_predicate_commutativity_expand(asent, $NEG, rule);
    }

    @SubL(source = "cycl/inference/modules/transformation-modules.lisp", position = 34000L)
    public static SubLObject trans_predicate_commutative_pos_cost(SubLObject asent) {
        return trans_predicate_commutativity_cost(asent, $POS);
    }

    @SubL(source = "cycl/inference/modules/transformation-modules.lisp", position = 34300L)
    public static SubLObject trans_predicate_commutative_neg_cost(SubLObject asent) {
        return trans_predicate_commutativity_cost(asent, $NEG);
    }

    @SubL(source = "cycl/inference/modules/transformation-modules.lisp", position = 34400L)
    public static SubLObject trans_predicate_commutative_pos_rule_select(SubLObject asent) {
        return trans_predicate_commutativity_rule_select(asent, $POS);
    }

    @SubL(source = "cycl/inference/modules/transformation-modules.lisp", position = 34500L)
    public static SubLObject trans_predicate_commutative_neg_rule_select(SubLObject asent) {
        return trans_predicate_commutativity_rule_select(asent, $NEG);
    }

    @SubL(source = "cycl/inference/modules/transformation-modules.lisp", position = 34700L)
    public static SubLObject trans_predicate_commutative_pos_rule_filter(SubLObject asent, SubLObject rule) {
        return trans_predicate_commutativity_rule_filter(asent, $POS, rule);
    }

    @SubL(source = "cycl/inference/modules/transformation-modules.lisp", position = 34800L)
    public static SubLObject trans_predicate_commutative_neg_rule_filter(SubLObject asent, SubLObject rule) {
        return trans_predicate_commutativity_rule_filter(asent, $NEG, rule);
    }

    @SubL(source = "cycl/inference/modules/transformation-modules.lisp", position = 35000L)
    public static SubLObject trans_predicate_commutative_pos_expand(SubLObject asent, SubLObject rule) {
        return trans_predicate_commutativity_expand(asent, $POS, rule);
    }

    @SubL(source = "cycl/inference/modules/transformation-modules.lisp", position = 35100L)
    public static SubLObject trans_predicate_commutative_neg_expand(SubLObject asent, SubLObject rule) {
        return trans_predicate_commutativity_expand(asent, $NEG, rule);
    }

    @SubL(source = "cycl/inference/modules/transformation-modules.lisp", position = 37000L)
    public static SubLObject trans_predicate_partially_commutative_pos_cost(SubLObject asent) {
        return trans_predicate_commutativity_cost(asent, $POS);
    }

    @SubL(source = "cycl/inference/modules/transformation-modules.lisp", position = 37300L)
    public static SubLObject trans_predicate_partially_commutative_neg_cost(SubLObject asent) {
        return trans_predicate_commutativity_cost(asent, $NEG);
    }

    @SubL(source = "cycl/inference/modules/transformation-modules.lisp", position = 37400L)
    public static SubLObject trans_predicate_partially_commutative_pos_rule_select(SubLObject asent) {
        return trans_predicate_commutativity_rule_select(asent, $POS);
    }

    @SubL(source = "cycl/inference/modules/transformation-modules.lisp", position = 37500L)
    public static SubLObject trans_predicate_partially_commutative_neg_rule_select(SubLObject asent) {
        return trans_predicate_commutativity_rule_select(asent, $NEG);
    }

    @SubL(source = "cycl/inference/modules/transformation-modules.lisp", position = 37700L)
    public static SubLObject trans_predicate_partially_commutative_pos_rule_filter(SubLObject asent, SubLObject rule) {
        return trans_predicate_commutativity_rule_filter(asent, $POS, rule);
    }

    @SubL(source = "cycl/inference/modules/transformation-modules.lisp", position = 37800L)
    public static SubLObject trans_predicate_partially_commutative_neg_rule_filter(SubLObject asent, SubLObject rule) {
        return trans_predicate_commutativity_rule_filter(asent, $NEG, rule);
    }

    @SubL(source = "cycl/inference/modules/transformation-modules.lisp", position = 38000L)
    public static SubLObject trans_predicate_partially_commutative_pos_expand(SubLObject asent, SubLObject rule) {
        return trans_predicate_commutativity_expand(asent, $POS, rule);
    }

    @SubL(source = "cycl/inference/modules/transformation-modules.lisp", position = 38100L)
    public static SubLObject trans_predicate_partially_commutative_neg_expand(SubLObject asent, SubLObject rule) {
        return trans_predicate_commutativity_expand(asent, $NEG, rule);
    }

    @SubL(source = "cycl/inference/modules/transformation-modules.lisp", position = 40300L)
    public static SubLObject trans_predicate_asymmetry_cost(SubLObject asent) {
        return trans_predicate_cost(asent, $POS);
    }

    @SubL(source = "cycl/inference/modules/transformation-modules.lisp", position = 40500L)
    public static SubLObject trans_predicate_asymmetry_rule_select(SubLObject asent) {
        SubLObject predicate = cycl_utilities.atomic_sentence_predicate(asent);
        SubLObject rules = new_selected_rules();
        SubLObject cdolist_list_var = backward_utilities.relevant_directions();
        SubLObject direction = NIL;
        direction = cdolist_list_var.first();
        while (NIL != cdolist_list_var) {
            if (NIL != kb_mapping_macros.do_predicate_rule_index_key_validator(predicate, $POS, direction)) {
                SubLObject iterator_var = kb_mapping_macros.new_predicate_rule_final_index_spec_iterator(predicate, $POS, direction);
                SubLObject done_var = NIL;
                SubLObject token_var = NIL;
                while (NIL == done_var) {
                    SubLObject final_index_spec = iteration.iteration_next_without_values_macro_helper(iterator_var, token_var);
                    SubLObject valid = makeBoolean(!token_var.eql(final_index_spec));
                    if (NIL != valid) {
                        SubLObject final_index_iterator = NIL;
                        try {
                            final_index_iterator = kb_mapping_macros.new_final_index_iterator(final_index_spec, $RULE, NIL, direction);
                            SubLObject done_var_$30 = NIL;
                            SubLObject token_var_$31 = NIL;
                            while (NIL == done_var_$30) {
                                SubLObject rule = iteration.iteration_next_without_values_macro_helper(final_index_iterator, token_var_$31);
                                SubLObject valid_$32 = makeBoolean(!token_var_$31.eql(rule));
                                if (NIL != valid_$32) {
                                    rules = add_selected_rule(rule, rules);
                                }
                                done_var_$30 = makeBoolean(NIL == valid_$32);
                            }
                        } finally {
                            SubLObject _prev_bind_0 = Dynamic.currentBinding(Threads.$is_thread_performing_cleanupP$);
                            try {
                                Dynamic.bind(Threads.$is_thread_performing_cleanupP$, T);
                                SubLObject _values = Values.getValuesAsVector();
                                if (NIL != final_index_iterator) {
                                    kb_mapping_macros.destroy_final_index_iterator(final_index_iterator);
                                }
                                Values.restoreValuesFromVector(_values);
                            } finally {
                                Dynamic.rebind(Threads.$is_thread_performing_cleanupP$, _prev_bind_0);
                            }
                        }
                    }
                    done_var = makeBoolean(NIL == valid);
                }
            }
            cdolist_list_var = cdolist_list_var.rest();
            direction = cdolist_list_var.first();
        }
        return finalize_selected_rules(rules);
    }

    @SubL(source = "cycl/inference/modules/transformation-modules.lisp", position = 40900L)
    public static SubLObject trans_predicate_asymmetry_expand_int(SubLObject asent, SubLObject rule) {
        SubLObject predicate = cycl_utilities.atomic_sentence_predicate(asent);
        if (NIL != el_utilities.el_binary_formula_p(asent)) {
            SubLObject symmetric_asent = removal_modules_symmetry.symmetric_asent(asent);
            SubLObject predicate_var = predicate;
            if (NIL != backward_utilities.rule_relevant_to_proof(rule)) {
                SubLObject cnf_var = assertions_high.assertion_cnf(rule);
                SubLObject cdolist_list_var = clauses.pos_lits(cnf_var);
                SubLObject examine = NIL;
                examine = cdolist_list_var.first();
                while (NIL != cdolist_list_var) {
                    if (predicate_var.eql(cycl_utilities.atomic_sentence_predicate(examine))) {
                        SubLObject v_bindings = unification_utilities.transformation_asent_unify(symmetric_asent, examine);
                        if (NIL != v_bindings) {
                            return Values.values(v_bindings, examine, predicate);
                        }
                    }
                    cdolist_list_var = cdolist_list_var.rest();
                    examine = cdolist_list_var.first();
                }
            }
        } else {
            SubLObject cdolist_list_var2 = cycl_utilities.formula_commutative_permutations(asent, UNPROVIDED);
            SubLObject symmetric_asent2 = NIL;
            symmetric_asent2 = cdolist_list_var2.first();
            while (NIL != cdolist_list_var2) {
                if (!symmetric_asent2.equal(asent)) {
                    SubLObject predicate_var2 = predicate;
                    if (NIL != backward_utilities.rule_relevant_to_proof(rule)) {
                        SubLObject cnf_var2 = assertions_high.assertion_cnf(rule);
                        SubLObject cdolist_list_var_$33 = clauses.pos_lits(cnf_var2);
                        SubLObject examine2 = NIL;
                        examine2 = cdolist_list_var_$33.first();
                        while (NIL != cdolist_list_var_$33) {
                            if (predicate_var2.eql(cycl_utilities.atomic_sentence_predicate(examine2))) {
                                SubLObject v_bindings2 = unification_utilities.transformation_asent_unify(symmetric_asent2, examine2);
                                if (NIL != v_bindings2) {
                                    return Values.values(v_bindings2, examine2, predicate);
                                }
                            }
                            cdolist_list_var_$33 = cdolist_list_var_$33.rest();
                            examine2 = cdolist_list_var_$33.first();
                        }
                    }
                }
                cdolist_list_var2 = cdolist_list_var2.rest();
                symmetric_asent2 = cdolist_list_var2.first();
            }
        }
        return Values.values(NIL, NIL, NIL);
    }

    @SubL(source = "cycl/inference/modules/transformation-modules.lisp", position = 41400L)
    public static SubLObject trans_predicate_asymmetry_rule_filter(SubLObject asent, SubLObject rule) {
        SubLThread thread = SubLProcess.currentSubLThread();
        thread.resetMultipleValues();
        SubLObject v_bindings = trans_predicate_asymmetry_expand_int(asent, rule);
        SubLObject examine = thread.secondMultipleValue();
        SubLObject predicate = thread.thirdMultipleValue();
        thread.resetMultipleValues();
        if (NIL != v_bindings) {
            return T;
        }
        return NIL;
    }

    @SubL(source = "cycl/inference/modules/transformation-modules.lisp", position = 41600L)
    public static SubLObject trans_predicate_asymmetry_expand(SubLObject asent, SubLObject rule) {
        SubLThread thread = SubLProcess.currentSubLThread();
        thread.resetMultipleValues();
        SubLObject v_bindings = trans_predicate_asymmetry_expand_int(asent, rule);
        SubLObject examine = thread.secondMultipleValue();
        SubLObject predicate = thread.thirdMultipleValue();
        thread.resetMultipleValues();
        if (NIL != v_bindings) {
            backward.transformation_add_node(rule, examine, $POS, v_bindings, additional_asymmetry_supports(predicate));
        }
        return NIL;
    }

    @SubL(source = "cycl/inference/modules/transformation-modules.lisp", position = 43200L)
    public static SubLObject trans_unbound_predicate_module_p(SubLObject hl_module) {
        SubLObject name = inference_modules.hl_module_name(hl_module);
        return subl_promotions.memberP(name, $unbound_predicate_transformation_required_modules$.getGlobalValue(), Symbols.symbol_function(EQL), UNPROVIDED);
    }

    @SubL(source = "cycl/inference/modules/transformation-modules.lisp", position = 43400L)
    public static SubLObject module_requires_unbound_predicate_transformationP(SubLObject module_name) {
        return subl_promotions.memberP(module_name, $unbound_predicate_transformation_required_modules$.getGlobalValue(), Symbols.symbol_function(EQL), UNPROVIDED);
    }

    @SubL(source = "cycl/inference/modules/transformation-modules.lisp", position = 43600L)
    public static SubLObject trans_unbound_predicate_pos_required(SubLObject asent) {
        return trans_unbound_predicate_required(asent);
    }

    @SubL(source = "cycl/inference/modules/transformation-modules.lisp", position = 43800L)
    public static SubLObject trans_unbound_predicate_neg_required(SubLObject asent) {
        return trans_unbound_predicate_required(asent);
    }

    @SubL(source = "cycl/inference/modules/transformation-modules.lisp", position = 43900L)
    public static SubLObject trans_unbound_predicate_pos_cost(SubLObject asent) {
        return trans_unbound_predicate_cost($POS);
    }

    @SubL(source = "cycl/inference/modules/transformation-modules.lisp", position = 44100L)
    public static SubLObject trans_unbound_predicate_neg_cost(SubLObject asent) {
        return trans_unbound_predicate_cost($NEG);
    }

    @SubL(source = "cycl/inference/modules/transformation-modules.lisp", position = 44200L)
    public static SubLObject trans_unbound_predicate_pos_rule_select(SubLObject asent) {
        return trans_unbound_predicate_rule_select($POS);
    }

    @SubL(source = "cycl/inference/modules/transformation-modules.lisp", position = 44300L)
    public static SubLObject trans_unbound_predicate_neg_rule_select(SubLObject asent) {
        return trans_unbound_predicate_rule_select($NEG);
    }

    @SubL(source = "cycl/inference/modules/transformation-modules.lisp", position = 44400L)
    public static SubLObject trans_unbound_predicate_pos_rule_filter(SubLObject asent, SubLObject rule) {
        return trans_unbound_predicate_rule_filter($POS, rule);
    }

    @SubL(source = "cycl/inference/modules/transformation-modules.lisp", position = 44600L)
    public static SubLObject trans_unbound_predicate_neg_rule_filter(SubLObject asent, SubLObject rule) {
        return trans_unbound_predicate_rule_filter($NEG, rule);
    }

    @SubL(source = "cycl/inference/modules/transformation-modules.lisp", position = 44700L)
    public static SubLObject trans_unbound_predicate_pos_expand(SubLObject asent, SubLObject rule) {
        return trans_unbound_predicate_expand(asent, $POS, rule);
    }

    @SubL(source = "cycl/inference/modules/transformation-modules.lisp", position = 44900L)
    public static SubLObject trans_unbound_predicate_neg_expand(SubLObject asent, SubLObject rule) {
        return trans_unbound_predicate_expand(asent, $NEG, rule);
    }

    @SubL(source = "cycl/inference/modules/transformation-modules.lisp", position = 46400L)
    public static SubLObject trans_unbound_predicate_required(SubLObject asent) {
        SubLThread thread = SubLProcess.currentSubLThread();
        return makeBoolean(NIL != control_vars.$unbound_rule_backchain_enabled$.getDynamicValue(thread) && (NIL == control_vars.$unique_inference_result_bindings$.getDynamicValue(thread) || NIL == variables.fully_bound_p(asent) || NIL == transformation_gaf_truth_known(asent)));
    }

    @SubL(source = "cycl/inference/modules/transformation-modules.lisp", position = 46900L)
    public static SubLObject trans_unbound_predicate_cost(SubLObject sense) {
        return auxiliary_indexing.relevant_num_unbound_rule_index(sense);
    }

    @SubL(source = "cycl/inference/modules/transformation-modules.lisp", position = 47000L)
    public static SubLObject trans_unbound_predicate_rule_select_internal(SubLObject sense) {
        SubLObject rules = new_selected_rules();
        SubLObject cdolist_list_var = backward_utilities.relevant_directions();
        SubLObject direction = NIL;
        direction = cdolist_list_var.first();
        while (NIL != cdolist_list_var) {
            if (NIL != kb_mapping_macros.do_unbound_predicate_rule_index_key_validator(sense, direction)) {
                SubLObject iterator_var = kb_mapping_macros.new_unbound_predicate_rule_final_index_spec_iterator(sense, direction);
                SubLObject done_var = NIL;
                SubLObject token_var = NIL;
                while (NIL == done_var) {
                    SubLObject final_index_spec = iteration.iteration_next_without_values_macro_helper(iterator_var, token_var);
                    SubLObject valid = makeBoolean(!token_var.eql(final_index_spec));
                    if (NIL != valid) {
                        SubLObject final_index_iterator = NIL;
                        try {
                            final_index_iterator = kb_mapping_macros.new_final_index_iterator(final_index_spec, $RULE, NIL, direction);
                            SubLObject done_var_$34 = NIL;
                            SubLObject token_var_$35 = NIL;
                            while (NIL == done_var_$34) {
                                SubLObject rule = iteration.iteration_next_without_values_macro_helper(final_index_iterator, token_var_$35);
                                SubLObject valid_$36 = makeBoolean(!token_var_$35.eql(rule));
                                if (NIL != valid_$36) {
                                    rules = add_selected_rule(rule, rules);
                                }
                                done_var_$34 = makeBoolean(NIL == valid_$36);
                            }
                        } finally {
                            SubLObject _prev_bind_0 = Dynamic.currentBinding(Threads.$is_thread_performing_cleanupP$);
                            try {
                                Dynamic.bind(Threads.$is_thread_performing_cleanupP$, T);
                                SubLObject _values = Values.getValuesAsVector();
                                if (NIL != final_index_iterator) {
                                    kb_mapping_macros.destroy_final_index_iterator(final_index_iterator);
                                }
                                Values.restoreValuesFromVector(_values);
                            } finally {
                                Dynamic.rebind(Threads.$is_thread_performing_cleanupP$, _prev_bind_0);
                            }
                        }
                    }
                    done_var = makeBoolean(NIL == valid);
                }
            }
            cdolist_list_var = cdolist_list_var.rest();
            direction = cdolist_list_var.first();
        }
        return finalize_selected_rules(rules);
    }

    @SubL(source = "cycl/inference/modules/transformation-modules.lisp", position = 47000L)
    public static SubLObject trans_unbound_predicate_rule_select(SubLObject sense) {
        SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject v_memoization_state = memoization_state.$memoization_state$.getDynamicValue(thread);
        SubLObject caching_state = NIL;
        if (NIL == v_memoization_state) {
            return trans_unbound_predicate_rule_select_internal(sense);
        }
        caching_state = memoization_state.memoization_state_lookup(v_memoization_state, $sym81$TRANS_UNBOUND_PREDICATE_RULE_SELECT, UNPROVIDED);
        if (NIL == caching_state) {
            caching_state = memoization_state.create_caching_state(memoization_state.memoization_state_lock(v_memoization_state), $sym81$TRANS_UNBOUND_PREDICATE_RULE_SELECT, ONE_INTEGER, NIL, EQL, UNPROVIDED);
            memoization_state.memoization_state_put(v_memoization_state, $sym81$TRANS_UNBOUND_PREDICATE_RULE_SELECT, caching_state);
        }
        SubLObject results = memoization_state.caching_state_lookup(caching_state, sense, memoization_state.$memoized_item_not_found$.getGlobalValue());
        if (results.eql(memoization_state.$memoized_item_not_found$.getGlobalValue())) {
            results = Values.arg2(thread.resetMultipleValues(), Values.multiple_value_list(trans_unbound_predicate_rule_select_internal(sense)));
            memoization_state.caching_state_put(caching_state, sense, results, UNPROVIDED);
        }
        return memoization_state.caching_results(results);
    }

    @SubL(source = "cycl/inference/modules/transformation-modules.lisp", position = 47400L)
    public static SubLObject trans_unbound_predicate_rule_filter(SubLObject sense, SubLObject rule) {
        if (NIL != backward_utilities.rule_relevant_to_proof(rule)) {
            SubLObject cnf_var = assertions_high.assertion_cnf(rule);
            if ($POS == sense) {
                SubLObject cdolist_list_var = clauses.pos_lits(cnf_var);
                SubLObject examine = NIL;
                examine = cdolist_list_var.first();
                while (NIL != cdolist_list_var) {
                    if (NIL != auxiliary_indexing.unbound_predicate_literal(examine)) {
                        return T;
                    }
                    cdolist_list_var = cdolist_list_var.rest();
                    examine = cdolist_list_var.first();
                }
            } else if ($NEG == sense) {
                SubLObject cdolist_list_var = clauses.neg_lits(cnf_var);
                SubLObject examine = NIL;
                examine = cdolist_list_var.first();
                while (NIL != cdolist_list_var) {
                    if (NIL != auxiliary_indexing.unbound_predicate_literal(examine)) {
                        return T;
                    }
                    cdolist_list_var = cdolist_list_var.rest();
                    examine = cdolist_list_var.first();
                }
            } else {
                Errors.error($str47$Invalid_sense__s, sense);
            }
        }
        return NIL;
    }

    @SubL(source = "cycl/inference/modules/transformation-modules.lisp", position = 47600L)
    public static SubLObject trans_unbound_predicate_expand(SubLObject asent, SubLObject sense, SubLObject rule) {
        if (NIL != backward_utilities.rule_relevant_to_proof(rule)) {
            SubLObject cnf_var = assertions_high.assertion_cnf(rule);
            if ($POS == sense) {
                SubLObject cdolist_list_var = clauses.pos_lits(cnf_var);
                SubLObject examine = NIL;
                examine = cdolist_list_var.first();
                while (NIL != cdolist_list_var) {
                    if (NIL != auxiliary_indexing.unbound_predicate_literal(examine)) {
                        SubLObject v_bindings = unification_utilities.transformation_asent_unify(asent, examine);
                        if (NIL != v_bindings) {
                            backward.transformation_add_node(rule, examine, sense, v_bindings, UNPROVIDED);
                        }
                    }
                    cdolist_list_var = cdolist_list_var.rest();
                    examine = cdolist_list_var.first();
                }
            } else if ($NEG == sense) {
                SubLObject cdolist_list_var = clauses.neg_lits(cnf_var);
                SubLObject examine = NIL;
                examine = cdolist_list_var.first();
                while (NIL != cdolist_list_var) {
                    if (NIL != auxiliary_indexing.unbound_predicate_literal(examine)) {
                        SubLObject v_bindings = unification_utilities.transformation_asent_unify(asent, examine);
                        if (NIL != v_bindings) {
                            backward.transformation_add_node(rule, examine, sense, v_bindings, UNPROVIDED);
                        }
                    }
                    cdolist_list_var = cdolist_list_var.rest();
                    examine = cdolist_list_var.first();
                }
            } else {
                Errors.error($str47$Invalid_sense__s, sense);
            }
        }
        return NIL;
    }

    @SubL(source = "cycl/inference/modules/transformation-modules.lisp", position = 48600L)
    public static SubLObject module_requires_hl_predicate_transformationP(SubLObject module_name) {
        return subl_promotions.memberP(module_name, $hl_predicate_transformation_required_modules$.getGlobalValue(), Symbols.symbol_function(EQL), UNPROVIDED);
    }

    @SubL(source = "cycl/inference/modules/transformation-modules.lisp", position = 48800L)
    public static SubLObject trans_isa_pos_required(SubLObject asent) {
        SubLThread thread = SubLProcess.currentSubLThread();
        return makeBoolean(NIL != control_vars.$hl_failure_backchaining$.getDynamicValue(thread) || NIL != inference_trampolines.inference_collection_backchain_encouragedP(cycl_utilities.atomic_sentence_arg2(asent, UNPROVIDED), mt_relevance_macros.$mt$.getDynamicValue(thread)));
    }

    @SubL(source = "cycl/inference/modules/transformation-modules.lisp", position = 49000L)
    public static SubLObject trans_isa_neg_required(SubLObject asent) {
        SubLThread thread = SubLProcess.currentSubLThread();
        return control_vars.$hl_failure_backchaining$.getDynamicValue(thread);
    }

    @SubL(source = "cycl/inference/modules/transformation-modules.lisp", position = 49100L)
    public static SubLObject trans_isa_pos_cost(SubLObject asent) {
        SubLThread thread = SubLProcess.currentSubLThread();
        if (NIL != inference_trampolines.inference_backchain_required_asentP(asent, mt_relevance_macros.$mt$.getDynamicValue(thread))) {
            return trans_isa_pos_rule_select_count(asent, mt_relevance_macros.$mt$.getDynamicValue(thread));
        }
        return cardinality_estimates.spec_cardinality(cycl_utilities.atomic_sentence_arg2(asent, UNPROVIDED));
    }

    @SubL(source = "cycl/inference/modules/transformation-modules.lisp", position = 49300L)
    public static SubLObject trans_isa_neg_cost(SubLObject asent) {
        return cardinality_estimates.genl_cardinality(cycl_utilities.atomic_sentence_arg2(asent, UNPROVIDED));
    }

    @SubL(source = "cycl/inference/modules/transformation-modules.lisp", position = 49500L)
    public static SubLObject inference_memoized_all_specs_internal(SubLObject col, SubLObject mt) {
        if (mt == UNPROVIDED) {
            mt = NIL;
        }
        return genls.all_specs(col, mt, UNPROVIDED);
    }

    @SubL(source = "cycl/inference/modules/transformation-modules.lisp", position = 49500L)
    public static SubLObject inference_memoized_all_specs(SubLObject col, SubLObject mt) {
        if (mt == UNPROVIDED) {
            mt = NIL;
        }
        SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject v_memoization_state = memoization_state.$memoization_state$.getDynamicValue(thread);
        SubLObject caching_state = NIL;
        if (NIL == v_memoization_state) {
            return inference_memoized_all_specs_internal(col, mt);
        }
        caching_state = memoization_state.memoization_state_lookup(v_memoization_state, $sym83$INFERENCE_MEMOIZED_ALL_SPECS, UNPROVIDED);
        if (NIL == caching_state) {
            caching_state = memoization_state.create_caching_state(memoization_state.memoization_state_lock(v_memoization_state), $sym83$INFERENCE_MEMOIZED_ALL_SPECS, TWO_INTEGER, NIL, EQL, UNPROVIDED);
            memoization_state.memoization_state_put(v_memoization_state, $sym83$INFERENCE_MEMOIZED_ALL_SPECS, caching_state);
        }
        SubLObject sxhash = memoization_state.sxhash_calc_2(col, mt);
        SubLObject collisions = memoization_state.caching_state_lookup(caching_state, sxhash, UNPROVIDED);
        if (!collisions.eql(memoization_state.$memoized_item_not_found$.getGlobalValue())) {
            SubLObject cdolist_list_var = collisions;
            SubLObject collision = NIL;
            collision = cdolist_list_var.first();
            while (NIL != cdolist_list_var) {
                SubLObject cached_args = collision.first();
                SubLObject results2 = conses_high.second(collision);
                if (col.eql(cached_args.first())) {
                    cached_args = cached_args.rest();
                    if (NIL != cached_args && NIL == cached_args.rest() && mt.eql(cached_args.first())) {
                        return memoization_state.caching_results(results2);
                    }
                }
                cdolist_list_var = cdolist_list_var.rest();
                collision = cdolist_list_var.first();
            }
        }
        SubLObject results3 = Values.arg2(thread.resetMultipleValues(), Values.multiple_value_list(inference_memoized_all_specs_internal(col, mt)));
        memoization_state.caching_state_enter_multi_key_n(caching_state, sxhash, collisions, results3, list(col, mt));
        return memoization_state.caching_results(results3);
    }

    @SubL(source = "cycl/inference/modules/transformation-modules.lisp", position = 49600L)
    public static SubLObject trans_isa_pos_rule_select_count_internal(SubLObject asent, SubLObject mt) {
        SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject result = NIL;
        SubLObject _prev_bind_0 = mt_relevance_macros.$mt$.currentBinding(thread);
        SubLObject _prev_bind_2 = mt_relevance_macros.$relevant_mt_function$.currentBinding(thread);
        SubLObject _prev_bind_3 = mt_relevance_macros.$relevant_mts$.currentBinding(thread);
        try {
            mt_relevance_macros.$mt$.bind(mt_relevance_macros.update_inference_mt_relevance_mt(mt), thread);
            mt_relevance_macros.$relevant_mt_function$.bind(mt_relevance_macros.update_inference_mt_relevance_function(mt), thread);
            mt_relevance_macros.$relevant_mts$.bind(mt_relevance_macros.update_inference_mt_relevance_mt_list(mt), thread);
            result = Sequences.length(trans_isa_pos_rule_select(asent));
        } finally {
            mt_relevance_macros.$relevant_mts$.rebind(_prev_bind_3, thread);
            mt_relevance_macros.$relevant_mt_function$.rebind(_prev_bind_2, thread);
            mt_relevance_macros.$mt$.rebind(_prev_bind_0, thread);
        }
        return result;
    }

    @SubL(source = "cycl/inference/modules/transformation-modules.lisp", position = 49600L)
    public static SubLObject trans_isa_pos_rule_select_count(SubLObject asent, SubLObject mt) {
        SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject v_memoization_state = memoization_state.$memoization_state$.getDynamicValue(thread);
        SubLObject caching_state = NIL;
        if (NIL == v_memoization_state) {
            return trans_isa_pos_rule_select_count_internal(asent, mt);
        }
        caching_state = memoization_state.memoization_state_lookup(v_memoization_state, $sym84$TRANS_ISA_POS_RULE_SELECT_COUNT, UNPROVIDED);
        if (NIL == caching_state) {
            caching_state = memoization_state.create_caching_state(memoization_state.memoization_state_lock(v_memoization_state), $sym84$TRANS_ISA_POS_RULE_SELECT_COUNT, TWO_INTEGER, NIL, EQUAL, UNPROVIDED);
            memoization_state.memoization_state_put(v_memoization_state, $sym84$TRANS_ISA_POS_RULE_SELECT_COUNT, caching_state);
        }
        SubLObject sxhash = memoization_state.sxhash_calc_2(asent, mt);
        SubLObject collisions = memoization_state.caching_state_lookup(caching_state, sxhash, UNPROVIDED);
        if (!collisions.eql(memoization_state.$memoized_item_not_found$.getGlobalValue())) {
            SubLObject cdolist_list_var = collisions;
            SubLObject collision = NIL;
            collision = cdolist_list_var.first();
            while (NIL != cdolist_list_var) {
                SubLObject cached_args = collision.first();
                SubLObject results2 = conses_high.second(collision);
                if (asent.equal(cached_args.first())) {
                    cached_args = cached_args.rest();
                    if (NIL != cached_args && NIL == cached_args.rest() && mt.equal(cached_args.first())) {
                        return memoization_state.caching_results(results2);
                    }
                }
                cdolist_list_var = cdolist_list_var.rest();
                collision = cdolist_list_var.first();
            }
        }
        SubLObject results3 = Values.arg2(thread.resetMultipleValues(), Values.multiple_value_list(trans_isa_pos_rule_select_count_internal(asent, mt)));
        memoization_state.caching_state_enter_multi_key_n(caching_state, sxhash, collisions, results3, list(asent, mt));
        return memoization_state.caching_results(results3);
    }

    @SubL(source = "cycl/inference/modules/transformation-modules.lisp", position = 49800L)
    public static SubLObject trans_isa_pos_rule_select(SubLObject asent) {
        SubLObject rules = new_selected_rules();
        SubLObject inference_col = cycl_utilities.atomic_sentence_arg2(asent, UNPROVIDED);
        SubLObject cdolist_list_var;
        SubLObject rule_subsets = cdolist_list_var = inference_memoized_all_specs(inference_col, NIL);
        SubLObject rule_subset = NIL;
        rule_subset = cdolist_list_var.first();
        while (NIL != cdolist_list_var) {
            SubLObject cdolist_list_var_$37 = backward_utilities.relevant_directions();
            SubLObject direction = NIL;
            direction = cdolist_list_var_$37.first();
            while (NIL != cdolist_list_var_$37) {
                if (NIL != kb_mapping_macros.do_isa_rule_index_key_validator(rule_subset, $POS, direction)) {
                    SubLObject iterator_var = kb_mapping_macros.new_isa_rule_final_index_spec_iterator(rule_subset, $POS, direction);
                    SubLObject done_var = NIL;
                    SubLObject token_var = NIL;
                    while (NIL == done_var) {
                        SubLObject final_index_spec = iteration.iteration_next_without_values_macro_helper(iterator_var, token_var);
                        SubLObject valid = makeBoolean(!token_var.eql(final_index_spec));
                        if (NIL != valid) {
                            SubLObject final_index_iterator = NIL;
                            try {
                                final_index_iterator = kb_mapping_macros.new_final_index_iterator(final_index_spec, $RULE, NIL, direction);
                                SubLObject done_var_$38 = NIL;
                                SubLObject token_var_$39 = NIL;
                                while (NIL == done_var_$38) {
                                    SubLObject rule = iteration.iteration_next_without_values_macro_helper(final_index_iterator, token_var_$39);
                                    SubLObject valid_$40 = makeBoolean(!token_var_$39.eql(rule));
                                    if (NIL != valid_$40) {
                                        rules = add_selected_rule(rule, rules);
                                    }
                                    done_var_$38 = makeBoolean(NIL == valid_$40);
                                }
                            } finally {
                                SubLObject _prev_bind_0 = Dynamic.currentBinding(Threads.$is_thread_performing_cleanupP$);
                                try {
                                    Dynamic.bind(Threads.$is_thread_performing_cleanupP$, T);
                                    SubLObject _values = Values.getValuesAsVector();
                                    if (NIL != final_index_iterator) {
                                        kb_mapping_macros.destroy_final_index_iterator(final_index_iterator);
                                    }
                                    Values.restoreValuesFromVector(_values);
                                } finally {
                                    Dynamic.rebind(Threads.$is_thread_performing_cleanupP$, _prev_bind_0);
                                }
                            }
                        }
                        done_var = makeBoolean(NIL == valid);
                    }
                }
                cdolist_list_var_$37 = cdolist_list_var_$37.rest();
                direction = cdolist_list_var_$37.first();
            }
            cdolist_list_var = cdolist_list_var.rest();
            rule_subset = cdolist_list_var.first();
        }
        return finalize_selected_rules(rules);
    }

    @SubL(source = "cycl/inference/modules/transformation-modules.lisp", position = 50300L)
    public static SubLObject trans_isa_pos_expand_int(SubLObject asent, SubLObject rule) {
        SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject inference_arg1 = cycl_utilities.atomic_sentence_arg1(asent, UNPROVIDED);
        SubLObject inference_col = cycl_utilities.atomic_sentence_arg2(asent, UNPROVIDED);
        if (NIL != backward_utilities.rule_relevant_to_proof(rule)) {
            SubLObject cnf_var = assertions_high.assertion_cnf(rule);
            SubLObject cdolist_list_var = clauses.pos_lits(cnf_var);
            SubLObject examine = NIL;
            examine = cdolist_list_var.first();
            while (NIL != cdolist_list_var) {
                if ($$isa.eql(cycl_utilities.atomic_sentence_predicate(examine))) {
                    SubLObject rule_subset = cycl_utilities.atomic_sentence_arg2(examine, UNPROVIDED);
                    if (NIL != variables.fully_bound_p(rule_subset) && NIL != genls.genlsP(rule_subset, inference_col, NIL, UNPROVIDED)) {
                        thread.resetMultipleValues();
                        SubLObject v_bindings = unification_utilities.term_unify(inference_arg1, cycl_utilities.atomic_sentence_arg1(examine, UNPROVIDED), NIL, T);
                        SubLObject unify_justification = thread.secondMultipleValue();
                        thread.resetMultipleValues();
                        if (NIL != v_bindings) {
                            return Values.values(v_bindings, examine, inference_col, rule_subset, unify_justification);
                        }
                    }
                }
                cdolist_list_var = cdolist_list_var.rest();
                examine = cdolist_list_var.first();
            }
        }
        return Values.values(NIL, NIL, NIL, NIL, NIL);
    }

    @SubL(source = "cycl/inference/modules/transformation-modules.lisp", position = 51100L)
    public static SubLObject trans_isa_pos_rule_filter(SubLObject asent, SubLObject rule) {
        SubLThread thread = SubLProcess.currentSubLThread();
        thread.resetMultipleValues();
        SubLObject v_bindings = trans_isa_pos_expand_int(asent, rule);
        SubLObject examine = thread.secondMultipleValue();
        SubLObject inference_col = thread.thirdMultipleValue();
        SubLObject rule_subset = thread.fourthMultipleValue();
        SubLObject more_supports = thread.fifthMultipleValue();
        thread.resetMultipleValues();
        if (NIL != v_bindings) {
            return T;
        }
        return NIL;
    }

    @SubL(source = "cycl/inference/modules/transformation-modules.lisp", position = 51300L)
    public static SubLObject trans_isa_pos_expand(SubLObject asent, SubLObject rule) {
        SubLThread thread = SubLProcess.currentSubLThread();
        thread.resetMultipleValues();
        SubLObject v_bindings = trans_isa_pos_expand_int(asent, rule);
        SubLObject examine = thread.secondMultipleValue();
        SubLObject inference_col = thread.thirdMultipleValue();
        SubLObject rule_subset = thread.fourthMultipleValue();
        SubLObject more_supports = thread.fifthMultipleValue();
        thread.resetMultipleValues();
        if (NIL != v_bindings) {
            SubLObject genls_supports = additional_genls_supports(rule_subset, inference_col);
            backward.transformation_add_node(rule, examine, $POS, v_bindings, append(genls_supports, more_supports));
        }
        return NIL;
    }

    @SubL(source = "cycl/inference/modules/transformation-modules.lisp", position = 51800L)
    public static SubLObject trans_isa_neg_rule_select(SubLObject asent) {
        SubLObject rules = new_selected_rules();
        SubLObject inference_col = cycl_utilities.atomic_sentence_arg2(asent, UNPROVIDED);
        SubLObject cdolist_list_var;
        SubLObject rule_genls = cdolist_list_var = genls.all_genls(inference_col, NIL, UNPROVIDED);
        SubLObject rule_genl = NIL;
        rule_genl = cdolist_list_var.first();
        while (NIL != cdolist_list_var) {
            SubLObject cdolist_list_var_$41 = backward_utilities.relevant_directions();
            SubLObject direction = NIL;
            direction = cdolist_list_var_$41.first();
            while (NIL != cdolist_list_var_$41) {
                if (NIL != kb_mapping_macros.do_isa_rule_index_key_validator(rule_genl, $NEG, direction)) {
                    SubLObject iterator_var = kb_mapping_macros.new_isa_rule_final_index_spec_iterator(rule_genl, $NEG, direction);
                    SubLObject done_var = NIL;
                    SubLObject token_var = NIL;
                    while (NIL == done_var) {
                        SubLObject final_index_spec = iteration.iteration_next_without_values_macro_helper(iterator_var, token_var);
                        SubLObject valid = makeBoolean(!token_var.eql(final_index_spec));
                        if (NIL != valid) {
                            SubLObject final_index_iterator = NIL;
                            try {
                                final_index_iterator = kb_mapping_macros.new_final_index_iterator(final_index_spec, $RULE, NIL, direction);
                                SubLObject done_var_$42 = NIL;
                                SubLObject token_var_$43 = NIL;
                                while (NIL == done_var_$42) {
                                    SubLObject rule = iteration.iteration_next_without_values_macro_helper(final_index_iterator, token_var_$43);
                                    SubLObject valid_$44 = makeBoolean(!token_var_$43.eql(rule));
                                    if (NIL != valid_$44) {
                                        rules = add_selected_rule(rule, rules);
                                    }
                                    done_var_$42 = makeBoolean(NIL == valid_$44);
                                }
                            } finally {
                                SubLObject _prev_bind_0 = Dynamic.currentBinding(Threads.$is_thread_performing_cleanupP$);
                                try {
                                    Dynamic.bind(Threads.$is_thread_performing_cleanupP$, T);
                                    SubLObject _values = Values.getValuesAsVector();
                                    if (NIL != final_index_iterator) {
                                        kb_mapping_macros.destroy_final_index_iterator(final_index_iterator);
                                    }
                                    Values.restoreValuesFromVector(_values);
                                } finally {
                                    Dynamic.rebind(Threads.$is_thread_performing_cleanupP$, _prev_bind_0);
                                }
                            }
                        }
                        done_var = makeBoolean(NIL == valid);
                    }
                }
                cdolist_list_var_$41 = cdolist_list_var_$41.rest();
                direction = cdolist_list_var_$41.first();
            }
            cdolist_list_var = cdolist_list_var.rest();
            rule_genl = cdolist_list_var.first();
        }
        return finalize_selected_rules(rules);
    }

    @SubL(source = "cycl/inference/modules/transformation-modules.lisp", position = 52200L)
    public static SubLObject trans_isa_neg_expand_int(SubLObject asent, SubLObject rule) {
        SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject inference_arg1 = cycl_utilities.atomic_sentence_arg1(asent, UNPROVIDED);
        SubLObject inference_col = cycl_utilities.atomic_sentence_arg2(asent, UNPROVIDED);
        if (NIL != backward_utilities.rule_relevant_to_proof(rule)) {
            SubLObject cnf_var = assertions_high.assertion_cnf(rule);
            SubLObject cdolist_list_var = clauses.neg_lits(cnf_var);
            SubLObject examine = NIL;
            examine = cdolist_list_var.first();
            while (NIL != cdolist_list_var) {
                if ($$isa.eql(cycl_utilities.atomic_sentence_predicate(examine))) {
                    SubLObject rule_genl = cycl_utilities.atomic_sentence_arg2(examine, UNPROVIDED);
                    if (NIL != variables.fully_bound_p(rule_genl) && NIL != genls.genlsP(inference_col, rule_genl, NIL, UNPROVIDED)) {
                        thread.resetMultipleValues();
                        SubLObject v_bindings = unification_utilities.term_unify(inference_arg1, cycl_utilities.atomic_sentence_arg1(examine, UNPROVIDED), NIL, T);
                        SubLObject unify_justification = thread.secondMultipleValue();
                        thread.resetMultipleValues();
                        if (NIL != v_bindings) {
                            return Values.values(v_bindings, examine, inference_col, rule_genl, unify_justification);
                        }
                    }
                }
                cdolist_list_var = cdolist_list_var.rest();
                examine = cdolist_list_var.first();
            }
        }
        return Values.values(NIL, NIL, NIL, NIL, NIL);
    }

    @SubL(source = "cycl/inference/modules/transformation-modules.lisp", position = 52900L)
    public static SubLObject trans_isa_neg_rule_filter(SubLObject asent, SubLObject rule) {
        SubLThread thread = SubLProcess.currentSubLThread();
        thread.resetMultipleValues();
        SubLObject v_bindings = trans_isa_neg_expand_int(asent, rule);
        SubLObject examine = thread.secondMultipleValue();
        SubLObject inference_col = thread.thirdMultipleValue();
        SubLObject rule_genl = thread.fourthMultipleValue();
        SubLObject more_supports = thread.fifthMultipleValue();
        thread.resetMultipleValues();
        if (NIL != v_bindings) {
            return T;
        }
        return NIL;
    }

    @SubL(source = "cycl/inference/modules/transformation-modules.lisp", position = 53200L)
    public static SubLObject trans_isa_neg_expand(SubLObject asent, SubLObject rule) {
        SubLThread thread = SubLProcess.currentSubLThread();
        thread.resetMultipleValues();
        SubLObject v_bindings = trans_isa_neg_expand_int(asent, rule);
        SubLObject examine = thread.secondMultipleValue();
        SubLObject inference_col = thread.thirdMultipleValue();
        SubLObject rule_genl = thread.fourthMultipleValue();
        SubLObject more_supports = thread.fifthMultipleValue();
        thread.resetMultipleValues();
        if (NIL != v_bindings) {
            SubLObject genls_supports = additional_genls_supports(inference_col, rule_genl);
            backward.transformation_add_node(rule, examine, $NEG, v_bindings, append(genls_supports, more_supports));
        }
        return NIL;
    }

    @SubL(source = "cycl/inference/modules/transformation-modules.lisp", position = 55000L)
    public static SubLObject trans_genls_pos_required(SubLObject asent) {
        SubLThread thread = SubLProcess.currentSubLThread();
        return control_vars.$hl_failure_backchaining$.getDynamicValue(thread);
    }

    @SubL(source = "cycl/inference/modules/transformation-modules.lisp", position = 55200L)
    public static SubLObject trans_genls_neg_required(SubLObject asent) {
        SubLThread thread = SubLProcess.currentSubLThread();
        return control_vars.$hl_failure_backchaining$.getDynamicValue(thread);
    }

    @SubL(source = "cycl/inference/modules/transformation-modules.lisp", position = 55300L)
    public static SubLObject trans_genls_pos_cost(SubLObject asent) {
        return cardinality_estimates.spec_cardinality(cycl_utilities.atomic_sentence_arg2(asent, UNPROVIDED));
    }

    @SubL(source = "cycl/inference/modules/transformation-modules.lisp", position = 55400L)
    public static SubLObject trans_genls_neg_cost(SubLObject asent) {
        return cardinality_estimates.genl_cardinality(cycl_utilities.atomic_sentence_arg2(asent, UNPROVIDED));
    }

    @SubL(source = "cycl/inference/modules/transformation-modules.lisp", position = 55600L)
    public static SubLObject trans_genls_pos_rule_select(SubLObject asent) {
        SubLObject rules = new_selected_rules();
        SubLObject inference_col = cycl_utilities.atomic_sentence_arg2(asent, UNPROVIDED);
        SubLObject cdolist_list_var;
        SubLObject rule_subsets = cdolist_list_var = inference_memoized_all_specs(inference_col, NIL);
        SubLObject rule_subset = NIL;
        rule_subset = cdolist_list_var.first();
        while (NIL != cdolist_list_var) {
            SubLObject cdolist_list_var_$45 = backward_utilities.relevant_directions();
            SubLObject direction = NIL;
            direction = cdolist_list_var_$45.first();
            while (NIL != cdolist_list_var_$45) {
                if (NIL != kb_mapping_macros.do_genls_rule_index_key_validator(rule_subset, $POS, direction)) {
                    SubLObject iterator_var = kb_mapping_macros.new_genls_rule_final_index_spec_iterator(rule_subset, $POS, direction);
                    SubLObject done_var = NIL;
                    SubLObject token_var = NIL;
                    while (NIL == done_var) {
                        SubLObject final_index_spec = iteration.iteration_next_without_values_macro_helper(iterator_var, token_var);
                        SubLObject valid = makeBoolean(!token_var.eql(final_index_spec));
                        if (NIL != valid) {
                            SubLObject final_index_iterator = NIL;
                            try {
                                final_index_iterator = kb_mapping_macros.new_final_index_iterator(final_index_spec, $RULE, NIL, direction);
                                SubLObject done_var_$46 = NIL;
                                SubLObject token_var_$47 = NIL;
                                while (NIL == done_var_$46) {
                                    SubLObject rule = iteration.iteration_next_without_values_macro_helper(final_index_iterator, token_var_$47);
                                    SubLObject valid_$48 = makeBoolean(!token_var_$47.eql(rule));
                                    if (NIL != valid_$48) {
                                        rules = add_selected_rule(rule, rules);
                                    }
                                    done_var_$46 = makeBoolean(NIL == valid_$48);
                                }
                            } finally {
                                SubLObject _prev_bind_0 = Dynamic.currentBinding(Threads.$is_thread_performing_cleanupP$);
                                try {
                                    Dynamic.bind(Threads.$is_thread_performing_cleanupP$, T);
                                    SubLObject _values = Values.getValuesAsVector();
                                    if (NIL != final_index_iterator) {
                                        kb_mapping_macros.destroy_final_index_iterator(final_index_iterator);
                                    }
                                    Values.restoreValuesFromVector(_values);
                                } finally {
                                    Dynamic.rebind(Threads.$is_thread_performing_cleanupP$, _prev_bind_0);
                                }
                            }
                        }
                        done_var = makeBoolean(NIL == valid);
                    }
                }
                cdolist_list_var_$45 = cdolist_list_var_$45.rest();
                direction = cdolist_list_var_$45.first();
            }
            cdolist_list_var = cdolist_list_var.rest();
            rule_subset = cdolist_list_var.first();
        }
        return finalize_selected_rules(rules);
    }

    @SubL(source = "cycl/inference/modules/transformation-modules.lisp", position = 56100L)
    public static SubLObject trans_genls_pos_expand_int(SubLObject asent, SubLObject rule) {
        SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject inference_arg1 = cycl_utilities.atomic_sentence_arg1(asent, UNPROVIDED);
        SubLObject inference_col = cycl_utilities.atomic_sentence_arg2(asent, UNPROVIDED);
        if (NIL != backward_utilities.rule_relevant_to_proof(rule)) {
            SubLObject cnf_var = assertions_high.assertion_cnf(rule);
            SubLObject cdolist_list_var = clauses.pos_lits(cnf_var);
            SubLObject examine = NIL;
            examine = cdolist_list_var.first();
            while (NIL != cdolist_list_var) {
                if ($$genls.eql(cycl_utilities.atomic_sentence_predicate(examine))) {
                    SubLObject rule_subset = cycl_utilities.atomic_sentence_arg2(examine, UNPROVIDED);
                    if (NIL != variables.fully_bound_p(rule_subset) && NIL != genls.genlsP(rule_subset, inference_col, NIL, UNPROVIDED)) {
                        thread.resetMultipleValues();
                        SubLObject v_bindings = unification_utilities.term_unify(inference_arg1, cycl_utilities.atomic_sentence_arg1(examine, UNPROVIDED), NIL, T);
                        SubLObject unify_justification = thread.secondMultipleValue();
                        thread.resetMultipleValues();
                        if (NIL != v_bindings) {
                            return Values.values(v_bindings, examine, inference_col, rule_subset, unify_justification);
                        }
                    }
                }
                cdolist_list_var = cdolist_list_var.rest();
                examine = cdolist_list_var.first();
            }
        }
        return Values.values(NIL, NIL, NIL, NIL, NIL);
    }

    @SubL(source = "cycl/inference/modules/transformation-modules.lisp", position = 56800L)
    public static SubLObject trans_genls_pos_rule_filter(SubLObject asent, SubLObject rule) {
        SubLThread thread = SubLProcess.currentSubLThread();
        thread.resetMultipleValues();
        SubLObject v_bindings = trans_genls_pos_expand_int(asent, rule);
        SubLObject examine = thread.secondMultipleValue();
        SubLObject inference_col = thread.thirdMultipleValue();
        SubLObject rule_subset = thread.fourthMultipleValue();
        SubLObject more_supports = thread.fifthMultipleValue();
        thread.resetMultipleValues();
        if (NIL != v_bindings) {
            return T;
        }
        return NIL;
    }

    @SubL(source = "cycl/inference/modules/transformation-modules.lisp", position = 57100L)
    public static SubLObject trans_genls_pos_expand(SubLObject asent, SubLObject rule) {
        SubLThread thread = SubLProcess.currentSubLThread();
        thread.resetMultipleValues();
        SubLObject v_bindings = trans_genls_pos_expand_int(asent, rule);
        SubLObject examine = thread.secondMultipleValue();
        SubLObject inference_col = thread.thirdMultipleValue();
        SubLObject rule_subset = thread.fourthMultipleValue();
        SubLObject more_supports = thread.fifthMultipleValue();
        thread.resetMultipleValues();
        if (NIL != v_bindings) {
            SubLObject genls_supports = additional_genls_supports(rule_subset, inference_col);
            backward.transformation_add_node(rule, examine, $POS, v_bindings, append(genls_supports, more_supports));
        }
        return NIL;
    }

    @SubL(source = "cycl/inference/modules/transformation-modules.lisp", position = 57500L)
    public static SubLObject trans_genls_neg_rule_select(SubLObject asent) {
        SubLObject rules = new_selected_rules();
        SubLObject inference_col = cycl_utilities.atomic_sentence_arg2(asent, UNPROVIDED);
        SubLObject cdolist_list_var;
        SubLObject rule_genls = cdolist_list_var = genls.all_genls(inference_col, NIL, UNPROVIDED);
        SubLObject rule_genl = NIL;
        rule_genl = cdolist_list_var.first();
        while (NIL != cdolist_list_var) {
            SubLObject cdolist_list_var_$49 = backward_utilities.relevant_directions();
            SubLObject direction = NIL;
            direction = cdolist_list_var_$49.first();
            while (NIL != cdolist_list_var_$49) {
                if (NIL != kb_mapping_macros.do_genls_rule_index_key_validator(rule_genl, $NEG, direction)) {
                    SubLObject iterator_var = kb_mapping_macros.new_genls_rule_final_index_spec_iterator(rule_genl, $NEG, direction);
                    SubLObject done_var = NIL;
                    SubLObject token_var = NIL;
                    while (NIL == done_var) {
                        SubLObject final_index_spec = iteration.iteration_next_without_values_macro_helper(iterator_var, token_var);
                        SubLObject valid = makeBoolean(!token_var.eql(final_index_spec));
                        if (NIL != valid) {
                            SubLObject final_index_iterator = NIL;
                            try {
                                final_index_iterator = kb_mapping_macros.new_final_index_iterator(final_index_spec, $RULE, NIL, direction);
                                SubLObject done_var_$50 = NIL;
                                SubLObject token_var_$51 = NIL;
                                while (NIL == done_var_$50) {
                                    SubLObject rule = iteration.iteration_next_without_values_macro_helper(final_index_iterator, token_var_$51);
                                    SubLObject valid_$52 = makeBoolean(!token_var_$51.eql(rule));
                                    if (NIL != valid_$52) {
                                        rules = add_selected_rule(rule, rules);
                                    }
                                    done_var_$50 = makeBoolean(NIL == valid_$52);
                                }
                            } finally {
                                SubLObject _prev_bind_0 = Dynamic.currentBinding(Threads.$is_thread_performing_cleanupP$);
                                try {
                                    Dynamic.bind(Threads.$is_thread_performing_cleanupP$, T);
                                    SubLObject _values = Values.getValuesAsVector();
                                    if (NIL != final_index_iterator) {
                                        kb_mapping_macros.destroy_final_index_iterator(final_index_iterator);
                                    }
                                    Values.restoreValuesFromVector(_values);
                                } finally {
                                    Dynamic.rebind(Threads.$is_thread_performing_cleanupP$, _prev_bind_0);
                                }
                            }
                        }
                        done_var = makeBoolean(NIL == valid);
                    }
                }
                cdolist_list_var_$49 = cdolist_list_var_$49.rest();
                direction = cdolist_list_var_$49.first();
            }
            cdolist_list_var = cdolist_list_var.rest();
            rule_genl = cdolist_list_var.first();
        }
        return finalize_selected_rules(rules);
    }

    @SubL(source = "cycl/inference/modules/transformation-modules.lisp", position = 58000L)
    public static SubLObject trans_genls_neg_expand_int(SubLObject asent, SubLObject rule) {
        SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject inference_arg1 = cycl_utilities.atomic_sentence_arg1(asent, UNPROVIDED);
        SubLObject inference_col = cycl_utilities.atomic_sentence_arg2(asent, UNPROVIDED);
        if (NIL != backward_utilities.rule_relevant_to_proof(rule)) {
            SubLObject cnf_var = assertions_high.assertion_cnf(rule);
            SubLObject cdolist_list_var = clauses.neg_lits(cnf_var);
            SubLObject examine = NIL;
            examine = cdolist_list_var.first();
            while (NIL != cdolist_list_var) {
                if ($$genls.eql(cycl_utilities.atomic_sentence_predicate(examine))) {
                    SubLObject rule_genl = cycl_utilities.atomic_sentence_arg2(examine, UNPROVIDED);
                    if (NIL != variables.fully_bound_p(rule_genl) && NIL != genls.genlsP(inference_col, rule_genl, NIL, UNPROVIDED)) {
                        thread.resetMultipleValues();
                        SubLObject v_bindings = unification_utilities.term_unify(inference_arg1, cycl_utilities.atomic_sentence_arg1(examine, UNPROVIDED), NIL, T);
                        SubLObject unify_justification = thread.secondMultipleValue();
                        thread.resetMultipleValues();
                        if (NIL != v_bindings) {
                            return Values.values(v_bindings, examine, inference_col, rule_genl, unify_justification);
                        }
                    }
                }
                cdolist_list_var = cdolist_list_var.rest();
                examine = cdolist_list_var.first();
            }
        }
        return Values.values(NIL, NIL, NIL, NIL, NIL);
    }

    @SubL(source = "cycl/inference/modules/transformation-modules.lisp", position = 58700L)
    public static SubLObject trans_genls_neg_rule_filter(SubLObject asent, SubLObject rule) {
        SubLThread thread = SubLProcess.currentSubLThread();
        thread.resetMultipleValues();
        SubLObject v_bindings = trans_genls_neg_expand_int(asent, rule);
        SubLObject examine = thread.secondMultipleValue();
        SubLObject inference_col = thread.thirdMultipleValue();
        SubLObject rule_genl = thread.fourthMultipleValue();
        SubLObject more_supports = thread.fifthMultipleValue();
        thread.resetMultipleValues();
        if (NIL != v_bindings) {
            return T;
        }
        return NIL;
    }

    @SubL(source = "cycl/inference/modules/transformation-modules.lisp", position = 59000L)
    public static SubLObject trans_genls_neg_expand(SubLObject asent, SubLObject rule) {
        SubLThread thread = SubLProcess.currentSubLThread();
        thread.resetMultipleValues();
        SubLObject v_bindings = trans_genls_neg_expand_int(asent, rule);
        SubLObject examine = thread.secondMultipleValue();
        SubLObject inference_col = thread.thirdMultipleValue();
        SubLObject rule_genl = thread.fourthMultipleValue();
        SubLObject more_supports = thread.fifthMultipleValue();
        thread.resetMultipleValues();
        if (NIL != v_bindings) {
            SubLObject genls_supports = additional_genls_supports(inference_col, rule_genl);
            backward.transformation_add_node(rule, examine, $NEG, v_bindings, append(genls_supports, more_supports));
        }
        return NIL;
    }

    @SubL(source = "cycl/inference/modules/transformation-modules.lisp", position = 60800L)
    public static SubLObject trans_genl_mt_pos_required(SubLObject asent) {
        SubLThread thread = SubLProcess.currentSubLThread();
        return control_vars.$hl_failure_backchaining$.getDynamicValue(thread);
    }

    @SubL(source = "cycl/inference/modules/transformation-modules.lisp", position = 61000L)
    public static SubLObject trans_genl_mt_neg_required(SubLObject asent) {
        SubLThread thread = SubLProcess.currentSubLThread();
        return control_vars.$hl_failure_backchaining$.getDynamicValue(thread);
    }

    @SubL(source = "cycl/inference/modules/transformation-modules.lisp", position = 61100L)
    public static SubLObject trans_genl_mt_pos_cost(SubLObject asent) {
        return cardinality_estimates.spec_cardinality(cycl_utilities.atomic_sentence_arg2(asent, UNPROVIDED));
    }

    @SubL(source = "cycl/inference/modules/transformation-modules.lisp", position = 61300L)
    public static SubLObject trans_genl_mt_neg_cost(SubLObject asent) {
        return cardinality_estimates.genl_cardinality(cycl_utilities.atomic_sentence_arg2(asent, UNPROVIDED));
    }

    @SubL(source = "cycl/inference/modules/transformation-modules.lisp", position = 61400L)
    public static SubLObject inference_memoized_all_spec_mts_internal(SubLObject inference_mt, SubLObject mt) {
        if (mt == UNPROVIDED) {
            mt = NIL;
        }
        return genl_mts.all_spec_mts(inference_mt, mt, UNPROVIDED);
    }

    @SubL(source = "cycl/inference/modules/transformation-modules.lisp", position = 61400L)
    public static SubLObject inference_memoized_all_spec_mts(SubLObject inference_mt, SubLObject mt) {
        if (mt == UNPROVIDED) {
            mt = NIL;
        }
        SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject v_memoization_state = memoization_state.$memoization_state$.getDynamicValue(thread);
        SubLObject caching_state = NIL;
        if (NIL == v_memoization_state) {
            return inference_memoized_all_spec_mts_internal(inference_mt, mt);
        }
        caching_state = memoization_state.memoization_state_lookup(v_memoization_state, $sym94$INFERENCE_MEMOIZED_ALL_SPEC_MTS, UNPROVIDED);
        if (NIL == caching_state) {
            caching_state = memoization_state.create_caching_state(memoization_state.memoization_state_lock(v_memoization_state), $sym94$INFERENCE_MEMOIZED_ALL_SPEC_MTS, TWO_INTEGER, NIL, EQL, UNPROVIDED);
            memoization_state.memoization_state_put(v_memoization_state, $sym94$INFERENCE_MEMOIZED_ALL_SPEC_MTS, caching_state);
        }
        SubLObject sxhash = memoization_state.sxhash_calc_2(inference_mt, mt);
        SubLObject collisions = memoization_state.caching_state_lookup(caching_state, sxhash, UNPROVIDED);
        if (!collisions.eql(memoization_state.$memoized_item_not_found$.getGlobalValue())) {
            SubLObject cdolist_list_var = collisions;
            SubLObject collision = NIL;
            collision = cdolist_list_var.first();
            while (NIL != cdolist_list_var) {
                SubLObject cached_args = collision.first();
                SubLObject results2 = conses_high.second(collision);
                if (inference_mt.eql(cached_args.first())) {
                    cached_args = cached_args.rest();
                    if (NIL != cached_args && NIL == cached_args.rest() && mt.eql(cached_args.first())) {
                        return memoization_state.caching_results(results2);
                    }
                }
                cdolist_list_var = cdolist_list_var.rest();
                collision = cdolist_list_var.first();
            }
        }
        SubLObject results3 = Values.arg2(thread.resetMultipleValues(), Values.multiple_value_list(inference_memoized_all_spec_mts_internal(inference_mt, mt)));
        memoization_state.caching_state_enter_multi_key_n(caching_state, sxhash, collisions, results3, list(inference_mt, mt));
        return memoization_state.caching_results(results3);
    }

    @SubL(source = "cycl/inference/modules/transformation-modules.lisp", position = 61600L)
    public static SubLObject trans_genl_mt_pos_rule_select(SubLObject asent) {
        SubLObject rules = new_selected_rules();
        SubLObject inference_mt = cycl_utilities.atomic_sentence_arg2(asent, UNPROVIDED);
        SubLObject cdolist_list_var;
        SubLObject rule_spec_mts = cdolist_list_var = inference_memoized_all_spec_mts(inference_mt, NIL);
        SubLObject rule_spec_mt = NIL;
        rule_spec_mt = cdolist_list_var.first();
        while (NIL != cdolist_list_var) {
            SubLObject cdolist_list_var_$53 = backward_utilities.relevant_directions();
            SubLObject direction = NIL;
            direction = cdolist_list_var_$53.first();
            while (NIL != cdolist_list_var_$53) {
                if (NIL != kb_mapping_macros.do_genl_mt_rule_index_key_validator(rule_spec_mt, $POS, direction)) {
                    SubLObject iterator_var = kb_mapping_macros.new_genl_mt_rule_final_index_spec_iterator(rule_spec_mt, $POS, direction);
                    SubLObject done_var = NIL;
                    SubLObject token_var = NIL;
                    while (NIL == done_var) {
                        SubLObject final_index_spec = iteration.iteration_next_without_values_macro_helper(iterator_var, token_var);
                        SubLObject valid = makeBoolean(!token_var.eql(final_index_spec));
                        if (NIL != valid) {
                            SubLObject final_index_iterator = NIL;
                            try {
                                final_index_iterator = kb_mapping_macros.new_final_index_iterator(final_index_spec, $RULE, NIL, direction);
                                SubLObject done_var_$54 = NIL;
                                SubLObject token_var_$55 = NIL;
                                while (NIL == done_var_$54) {
                                    SubLObject rule = iteration.iteration_next_without_values_macro_helper(final_index_iterator, token_var_$55);
                                    SubLObject valid_$56 = makeBoolean(!token_var_$55.eql(rule));
                                    if (NIL != valid_$56) {
                                        rules = add_selected_rule(rule, rules);
                                    }
                                    done_var_$54 = makeBoolean(NIL == valid_$56);
                                }
                            } finally {
                                SubLObject _prev_bind_0 = Dynamic.currentBinding(Threads.$is_thread_performing_cleanupP$);
                                try {
                                    Dynamic.bind(Threads.$is_thread_performing_cleanupP$, T);
                                    SubLObject _values = Values.getValuesAsVector();
                                    if (NIL != final_index_iterator) {
                                        kb_mapping_macros.destroy_final_index_iterator(final_index_iterator);
                                    }
                                    Values.restoreValuesFromVector(_values);
                                } finally {
                                    Dynamic.rebind(Threads.$is_thread_performing_cleanupP$, _prev_bind_0);
                                }
                            }
                        }
                        done_var = makeBoolean(NIL == valid);
                    }
                }
                cdolist_list_var_$53 = cdolist_list_var_$53.rest();
                direction = cdolist_list_var_$53.first();
            }
            cdolist_list_var = cdolist_list_var.rest();
            rule_spec_mt = cdolist_list_var.first();
        }
        return finalize_selected_rules(rules);
    }

    @SubL(source = "cycl/inference/modules/transformation-modules.lisp", position = 62100L)
    public static SubLObject trans_genl_mt_pos_expand_int(SubLObject asent, SubLObject rule) {
        SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject inference_arg1 = cycl_utilities.atomic_sentence_arg1(asent, UNPROVIDED);
        SubLObject inference_mt = cycl_utilities.atomic_sentence_arg2(asent, UNPROVIDED);
        if (NIL != backward_utilities.rule_relevant_to_proof(rule)) {
            SubLObject cnf_var = assertions_high.assertion_cnf(rule);
            SubLObject cdolist_list_var = clauses.pos_lits(cnf_var);
            SubLObject examine = NIL;
            examine = cdolist_list_var.first();
            while (NIL != cdolist_list_var) {
                if ($$genlMt.eql(cycl_utilities.atomic_sentence_predicate(examine))) {
                    SubLObject rule_spec_mt = cycl_utilities.atomic_sentence_arg2(examine, UNPROVIDED);
                    if (NIL != variables.fully_bound_p(rule_spec_mt) && NIL != genl_mts.genl_mtP(rule_spec_mt, inference_mt, NIL, UNPROVIDED)) {
                        thread.resetMultipleValues();
                        SubLObject v_bindings = unification_utilities.term_unify(inference_arg1, cycl_utilities.atomic_sentence_arg1(examine, UNPROVIDED), NIL, T);
                        SubLObject unify_justification = thread.secondMultipleValue();
                        thread.resetMultipleValues();
                        if (NIL != v_bindings) {
                            return Values.values(v_bindings, examine, inference_mt, rule_spec_mt, unify_justification);
                        }
                    }
                }
                cdolist_list_var = cdolist_list_var.rest();
                examine = cdolist_list_var.first();
            }
        }
        return Values.values(NIL, NIL, NIL, NIL, NIL);
    }

    @SubL(source = "cycl/inference/modules/transformation-modules.lisp", position = 62800L)
    public static SubLObject trans_genl_mt_pos_rule_filter(SubLObject asent, SubLObject rule) {
        SubLThread thread = SubLProcess.currentSubLThread();
        thread.resetMultipleValues();
        SubLObject v_bindings = trans_genl_mt_pos_expand_int(asent, rule);
        SubLObject examine = thread.secondMultipleValue();
        SubLObject inference_mt = thread.thirdMultipleValue();
        SubLObject rule_spec_mt = thread.fourthMultipleValue();
        SubLObject more_supports = thread.fifthMultipleValue();
        thread.resetMultipleValues();
        if (NIL != v_bindings) {
            return T;
        }
        return NIL;
    }

    @SubL(source = "cycl/inference/modules/transformation-modules.lisp", position = 63100L)
    public static SubLObject trans_genl_mt_pos_expand(SubLObject asent, SubLObject rule) {
        SubLThread thread = SubLProcess.currentSubLThread();
        thread.resetMultipleValues();
        SubLObject v_bindings = trans_genl_mt_pos_expand_int(asent, rule);
        SubLObject examine = thread.secondMultipleValue();
        SubLObject inference_mt = thread.thirdMultipleValue();
        SubLObject rule_spec_mt = thread.fourthMultipleValue();
        SubLObject more_supports = thread.fifthMultipleValue();
        thread.resetMultipleValues();
        if (NIL != v_bindings) {
            SubLObject genl_mt_supports = additional_genl_mt_supports(rule_spec_mt, inference_mt);
            backward.transformation_add_node(rule, examine, $POS, v_bindings, append(genl_mt_supports, more_supports));
        }
        return NIL;
    }

    @SubL(source = "cycl/inference/modules/transformation-modules.lisp", position = 63500L)
    public static SubLObject trans_genl_mt_neg_rule_select(SubLObject asent) {
        SubLObject rules = new_selected_rules();
        SubLObject inference_mt = cycl_utilities.atomic_sentence_arg2(asent, UNPROVIDED);
        SubLObject cdolist_list_var;
        SubLObject rule_genl_mts = cdolist_list_var = genl_mts.all_genl_mts(inference_mt, NIL, UNPROVIDED);
        SubLObject rule_genl_mt = NIL;
        rule_genl_mt = cdolist_list_var.first();
        while (NIL != cdolist_list_var) {
            SubLObject cdolist_list_var_$57 = backward_utilities.relevant_directions();
            SubLObject direction = NIL;
            direction = cdolist_list_var_$57.first();
            while (NIL != cdolist_list_var_$57) {
                if (NIL != kb_mapping_macros.do_genl_mt_rule_index_key_validator(rule_genl_mt, $NEG, direction)) {
                    SubLObject iterator_var = kb_mapping_macros.new_genl_mt_rule_final_index_spec_iterator(rule_genl_mt, $NEG, direction);
                    SubLObject done_var = NIL;
                    SubLObject token_var = NIL;
                    while (NIL == done_var) {
                        SubLObject final_index_spec = iteration.iteration_next_without_values_macro_helper(iterator_var, token_var);
                        SubLObject valid = makeBoolean(!token_var.eql(final_index_spec));
                        if (NIL != valid) {
                            SubLObject final_index_iterator = NIL;
                            try {
                                final_index_iterator = kb_mapping_macros.new_final_index_iterator(final_index_spec, $RULE, NIL, direction);
                                SubLObject done_var_$58 = NIL;
                                SubLObject token_var_$59 = NIL;
                                while (NIL == done_var_$58) {
                                    SubLObject rule = iteration.iteration_next_without_values_macro_helper(final_index_iterator, token_var_$59);
                                    SubLObject valid_$60 = makeBoolean(!token_var_$59.eql(rule));
                                    if (NIL != valid_$60) {
                                        rules = add_selected_rule(rule, rules);
                                    }
                                    done_var_$58 = makeBoolean(NIL == valid_$60);
                                }
                            } finally {
                                SubLObject _prev_bind_0 = Dynamic.currentBinding(Threads.$is_thread_performing_cleanupP$);
                                try {
                                    Dynamic.bind(Threads.$is_thread_performing_cleanupP$, T);
                                    SubLObject _values = Values.getValuesAsVector();
                                    if (NIL != final_index_iterator) {
                                        kb_mapping_macros.destroy_final_index_iterator(final_index_iterator);
                                    }
                                    Values.restoreValuesFromVector(_values);
                                } finally {
                                    Dynamic.rebind(Threads.$is_thread_performing_cleanupP$, _prev_bind_0);
                                }
                            }
                        }
                        done_var = makeBoolean(NIL == valid);
                    }
                }
                cdolist_list_var_$57 = cdolist_list_var_$57.rest();
                direction = cdolist_list_var_$57.first();
            }
            cdolist_list_var = cdolist_list_var.rest();
            rule_genl_mt = cdolist_list_var.first();
        }
        return finalize_selected_rules(rules);
    }

    @SubL(source = "cycl/inference/modules/transformation-modules.lisp", position = 64000L)
    public static SubLObject trans_genl_mt_neg_expand_int(SubLObject asent, SubLObject rule) {
        SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject inference_arg1 = cycl_utilities.atomic_sentence_arg1(asent, UNPROVIDED);
        SubLObject inference_mt = cycl_utilities.atomic_sentence_arg2(asent, UNPROVIDED);
        if (NIL != backward_utilities.rule_relevant_to_proof(rule)) {
            SubLObject cnf_var = assertions_high.assertion_cnf(rule);
            SubLObject cdolist_list_var = clauses.neg_lits(cnf_var);
            SubLObject examine = NIL;
            examine = cdolist_list_var.first();
            while (NIL != cdolist_list_var) {
                if ($$genlMt.eql(cycl_utilities.atomic_sentence_predicate(examine))) {
                    SubLObject rule_genl_mt = cycl_utilities.atomic_sentence_arg2(examine, UNPROVIDED);
                    if (NIL != variables.fully_bound_p(rule_genl_mt) && NIL != genl_mts.genl_mtP(inference_mt, rule_genl_mt, NIL, UNPROVIDED)) {
                        thread.resetMultipleValues();
                        SubLObject v_bindings = unification_utilities.term_unify(inference_arg1, cycl_utilities.atomic_sentence_arg1(examine, UNPROVIDED), NIL, T);
                        SubLObject unify_justification = thread.secondMultipleValue();
                        thread.resetMultipleValues();
                        if (NIL != v_bindings) {
                            return Values.values(v_bindings, examine, inference_mt, rule_genl_mt, unify_justification);
                        }
                    }
                }
                cdolist_list_var = cdolist_list_var.rest();
                examine = cdolist_list_var.first();
            }
        }
        return Values.values(NIL, NIL, NIL, NIL, NIL);
    }

    @SubL(source = "cycl/inference/modules/transformation-modules.lisp", position = 64800L)
    public static SubLObject trans_genl_mt_neg_rule_filter(SubLObject asent, SubLObject rule) {
        SubLThread thread = SubLProcess.currentSubLThread();
        thread.resetMultipleValues();
        SubLObject v_bindings = trans_genl_mt_neg_expand_int(asent, rule);
        SubLObject examine = thread.secondMultipleValue();
        SubLObject inference_mt = thread.thirdMultipleValue();
        SubLObject rule_genl_mt = thread.fourthMultipleValue();
        SubLObject more_supports = thread.fifthMultipleValue();
        thread.resetMultipleValues();
        if (NIL != v_bindings) {
            return T;
        }
        return NIL;
    }

    @SubL(source = "cycl/inference/modules/transformation-modules.lisp", position = 65000L)
    public static SubLObject trans_genl_mt_neg_expand(SubLObject asent, SubLObject rule) {
        SubLThread thread = SubLProcess.currentSubLThread();
        thread.resetMultipleValues();
        SubLObject v_bindings = trans_genl_mt_neg_expand_int(asent, rule);
        SubLObject examine = thread.secondMultipleValue();
        SubLObject inference_mt = thread.thirdMultipleValue();
        SubLObject rule_genl_mt = thread.fourthMultipleValue();
        SubLObject more_supports = thread.fifthMultipleValue();
        thread.resetMultipleValues();
        if (NIL != v_bindings) {
            SubLObject genl_mt_supports = additional_genl_mt_supports(inference_mt, rule_genl_mt);
            backward.transformation_add_node(rule, examine, $NEG, v_bindings, append(genl_mt_supports, more_supports));
        }
        return NIL;
    }

    @SubL(source = "cycl/inference/modules/transformation-modules.lisp", position = 67000L)
    public static SubLObject trans_abnormal_cost(SubLObject asent) {
        return kb_indexing.relevant_num_exception_rule_index(cycl_utilities.atomic_sentence_arg2(asent, UNPROVIDED));
    }

    @SubL(source = "cycl/inference/modules/transformation-modules.lisp", position = 67200L)
    public static SubLObject trans_abnormal_rule_select(SubLObject asent) {
        SubLObject rule = cycl_utilities.atomic_sentence_arg2(asent, UNPROVIDED);
        SubLObject exceptions = new_selected_rules();
        SubLObject cdolist_list_var = backward_utilities.relevant_directions();
        SubLObject direction = NIL;
        direction = cdolist_list_var.first();
        while (NIL != cdolist_list_var) {
            if (NIL != kb_mapping_macros.do_exception_rule_index_key_validator(rule, direction)) {
                SubLObject iterator_var = kb_mapping_macros.new_exception_rule_final_index_spec_iterator(rule, direction);
                SubLObject done_var = NIL;
                SubLObject token_var = NIL;
                while (NIL == done_var) {
                    SubLObject final_index_spec = iteration.iteration_next_without_values_macro_helper(iterator_var, token_var);
                    SubLObject valid = makeBoolean(!token_var.eql(final_index_spec));
                    if (NIL != valid) {
                        SubLObject final_index_iterator = NIL;
                        try {
                            final_index_iterator = kb_mapping_macros.new_final_index_iterator(final_index_spec, $RULE, NIL, direction);
                            SubLObject done_var_$61 = NIL;
                            SubLObject token_var_$62 = NIL;
                            while (NIL == done_var_$61) {
                                SubLObject exception = iteration.iteration_next_without_values_macro_helper(final_index_iterator, token_var_$62);
                                SubLObject valid_$63 = makeBoolean(!token_var_$62.eql(exception));
                                if (NIL != valid_$63) {
                                    exceptions = add_selected_rule(exception, exceptions);
                                }
                                done_var_$61 = makeBoolean(NIL == valid_$63);
                            }
                        } finally {
                            SubLObject _prev_bind_0 = Dynamic.currentBinding(Threads.$is_thread_performing_cleanupP$);
                            try {
                                Dynamic.bind(Threads.$is_thread_performing_cleanupP$, T);
                                SubLObject _values = Values.getValuesAsVector();
                                if (NIL != final_index_iterator) {
                                    kb_mapping_macros.destroy_final_index_iterator(final_index_iterator);
                                }
                                Values.restoreValuesFromVector(_values);
                            } finally {
                                Dynamic.rebind(Threads.$is_thread_performing_cleanupP$, _prev_bind_0);
                            }
                        }
                    }
                    done_var = makeBoolean(NIL == valid);
                }
            }
            cdolist_list_var = cdolist_list_var.rest();
            direction = cdolist_list_var.first();
        }
        return finalize_selected_rules(exceptions);
    }

    @SubL(source = "cycl/inference/modules/transformation-modules.lisp", position = 67500L)
    public static SubLObject trans_abnormal_expand_int(SubLObject asent, SubLObject exception) {
        SubLObject rule = cycl_utilities.atomic_sentence_arg2(asent, UNPROVIDED);
        SubLObject predicate_var = $$abnormal;
        if (NIL != backward_utilities.rule_relevant_to_proof(exception)) {
            SubLObject cnf_var = assertions_high.assertion_cnf(exception);
            SubLObject cdolist_list_var = clauses.pos_lits(cnf_var);
            SubLObject examine = NIL;
            examine = cdolist_list_var.first();
            while (NIL != cdolist_list_var) {
                if (predicate_var.eql(cycl_utilities.atomic_sentence_predicate(examine)) && rule.eql(cycl_utilities.atomic_sentence_arg2(examine, UNPROVIDED))) {
                    SubLObject v_bindings = unification_utilities.transformation_asent_unify(asent, examine);
                    if (NIL != v_bindings) {
                        return Values.values(v_bindings, examine);
                    }
                }
                cdolist_list_var = cdolist_list_var.rest();
                examine = cdolist_list_var.first();
            }
        }
        return Values.values(NIL, NIL);
    }

    @SubL(source = "cycl/inference/modules/transformation-modules.lisp", position = 68000L)
    public static SubLObject trans_abnormal_rule_filter(SubLObject asent, SubLObject exception) {
        SubLThread thread = SubLProcess.currentSubLThread();
        thread.resetMultipleValues();
        SubLObject v_bindings = trans_abnormal_expand_int(asent, exception);
        SubLObject examine = thread.secondMultipleValue();
        thread.resetMultipleValues();
        if (NIL != v_bindings) {
            return T;
        }
        return NIL;
    }

    @SubL(source = "cycl/inference/modules/transformation-modules.lisp", position = 68200L)
    public static SubLObject trans_abnormal_expand(SubLObject asent, SubLObject exception) {
        SubLThread thread = SubLProcess.currentSubLThread();
        thread.resetMultipleValues();
        SubLObject v_bindings = trans_abnormal_expand_int(asent, exception);
        SubLObject examine = thread.secondMultipleValue();
        thread.resetMultipleValues();
        if (NIL != v_bindings) {
            backward.transformation_add_node(exception, examine, $POS, v_bindings, UNPROVIDED);
        }
        return NIL;
    }

    @SubL(source = "cycl/inference/modules/transformation-modules.lisp", position = 68800L)
    public static SubLObject transformation_abduction_to_specs_required(SubLObject asent, SubLObject sense) {
        if (sense == UNPROVIDED) {
            sense = NIL;
        }
        SubLObject problem_store = inference_worker.currently_active_problem_store();
        return makeBoolean(NIL != problem_store && NIL != inference_datastructures_problem_store.problem_store_abduction_allowedP(problem_store) && NIL != inference_abduction_utilities.abduction_allowed_on_asentP(asent, UNPROVIDED, UNPROVIDED));
    }

    @SubL(source = "cycl/inference/modules/transformation-modules.lisp", position = 69600L)
    public static SubLObject find_genls_definitional_rules() {
        SubLThread thread = SubLProcess.currentSubLThread();
        if (NIL != $genls_definitional_rules$.getDynamicValue(thread)) {
            return $genls_definitional_rules$.getDynamicValue(thread);
        }
        SubLObject rules = fi.sentence_assertions($genls_definitional_sentence$.getDynamicValue(thread), mt_vars.$assertible_theory_mt_root$.getGlobalValue());
        if (NIL != rules) {
            $genls_definitional_rules$.setDynamicValue(rules, thread);
            return rules;
        }
        return NIL;
    }

    @SubL(source = "cycl/inference/modules/transformation-modules.lisp", position = 69900L)
    public static SubLObject transformation_abduction_to_specs_rule_select(SubLObject asent) {
        return find_genls_definitional_rules();
    }

    @SubL(source = "cycl/inference/modules/transformation-modules.lisp", position = 70000L)
    public static SubLObject transformation_abduction_to_specs_rule_filter(SubLObject asent, SubLObject rule) {
        return subl_promotions.memberP(rule, find_genls_definitional_rules(), Symbols.symbol_function(EQL), UNPROVIDED);
    }

    @SubL(source = "cycl/inference/modules/transformation-modules.lisp", position = 70200L)
    public static SubLObject transformation_abduction_to_specs_expand(SubLObject asent, SubLObject rule) {
        SubLObject predicate = cycl_utilities.atomic_sentence_predicate(asent);
        SubLObject sense = $POS;
        SubLObject predicate_var = predicate;
        if (NIL != backward_utilities.rule_relevant_to_proof(rule)) {
            SubLObject cnf_var = assertions_high.assertion_cnf(rule);
            if ($POS == sense) {
                SubLObject cdolist_list_var = clauses.pos_lits(cnf_var);
                SubLObject examine = NIL;
                examine = cdolist_list_var.first();
                while (NIL != cdolist_list_var) {
                    if (predicate_var.eql(cycl_utilities.atomic_sentence_predicate(examine))) {
                        SubLObject v_bindings = unification_utilities.transformation_asent_unify(asent, examine);
                        if (NIL != v_bindings) {
                            backward.transformation_add_node(rule, examine, sense, v_bindings, UNPROVIDED);
                        }
                    }
                    cdolist_list_var = cdolist_list_var.rest();
                    examine = cdolist_list_var.first();
                }
            } else if ($NEG == sense) {
                SubLObject cdolist_list_var = clauses.neg_lits(cnf_var);
                SubLObject examine = NIL;
                examine = cdolist_list_var.first();
                while (NIL != cdolist_list_var) {
                    if (predicate_var.eql(cycl_utilities.atomic_sentence_predicate(examine))) {
                        SubLObject v_bindings = unification_utilities.transformation_asent_unify(asent, examine);
                        if (NIL != v_bindings) {
                            backward.transformation_add_node(rule, examine, sense, v_bindings, UNPROVIDED);
                        }
                    }
                    cdolist_list_var = cdolist_list_var.rest();
                    examine = cdolist_list_var.first();
                }
            } else {
                Errors.error($str47$Invalid_sense__s, sense);
            }
        }
        return NIL;
    }

    public static SubLObject declare_transformation_modules_file() {
        declareFunction(myName, "additional_genls_supports", "ADDITIONAL-GENLS-SUPPORTS", 2, 0, false);
        declareFunction(myName, "additional_genl_mt_supports", "ADDITIONAL-GENL-MT-SUPPORTS", 2, 0, false);
        declareFunction(myName, "additional_genlpreds_supports", "ADDITIONAL-GENLPREDS-SUPPORTS", 2, 0, false);
        declareFunction(myName, "additional_genlinverse_supports", "ADDITIONAL-GENLINVERSE-SUPPORTS", 2, 0, false);
        declareFunction(myName, "additional_negationpreds_supports", "ADDITIONAL-NEGATIONPREDS-SUPPORTS", 2, 0, false);
        declareFunction(myName, "additional_asymmetry_supports", "ADDITIONAL-ASYMMETRY-SUPPORTS", 1, 0, false);
        declareFunction(myName, "additional_predicate_commutativity_supports", "ADDITIONAL-PREDICATE-COMMUTATIVITY-SUPPORTS", 1, 0, false);
        declareFunction(myName, "transformation_gaf_truth_known", "TRANSFORMATION-GAF-TRUTH-KNOWN", 1, 0, false);
        declareFunction(myName, "modus_tollens_transformation_module_p", "MODUS-TOLLENS-TRANSFORMATION-MODULE-P", 1, 0, false);
        declareFunction(myName, "modus_tollens_transformation_proof_p", "MODUS-TOLLENS-TRANSFORMATION-PROOF-P", 1, 0, false);
        declareMacro(me, "do_transformation_relevant_directions", "DO-TRANSFORMATION-RELEVANT-DIRECTIONS");
        declareMacro(me, "do_transformation_rule_literals", "DO-TRANSFORMATION-RULE-LITERALS");
        declareMacro(me, "do_transformation_predicate_rule_index", "DO-TRANSFORMATION-PREDICATE-RULE-INDEX");
        declareFunction(myName, "new_selected_rules", "NEW-SELECTED-RULES", 0, 0, false);
        declareFunction(myName, "add_selected_rule", "ADD-SELECTED-RULE", 2, 0, false);
        declareFunction(myName, "finalize_selected_rules", "FINALIZE-SELECTED-RULES", 1, 0, false);
        declareFunction(myName, "sort_rules_via_current_inference_rule_preference", "SORT-RULES-VIA-CURRENT-INFERENCE-RULE-PREFERENCE", 1, 0, false);
        declareFunction(myName, "current_inference_rule_preference_G", "CURRENT-INFERENCE-RULE-PREFERENCE->", 2, 0, false);
        declareFunction(myName, "trans_predicate_pos_required", "TRANS-PREDICATE-POS-REQUIRED", 1, 0, false);
        new $trans_predicate_pos_required$UnaryFunction();
        declareFunction(myName, "trans_predicate_neg_required", "TRANS-PREDICATE-NEG-REQUIRED", 1, 0, false);
        declareFunction(myName, "trans_predicate_pos_cost", "TRANS-PREDICATE-POS-COST", 1, 0, false);
        new $trans_predicate_pos_cost$UnaryFunction();
        declareFunction(myName, "trans_predicate_neg_cost", "TRANS-PREDICATE-NEG-COST", 1, 0, false);
        declareFunction(myName, "trans_predicate_pos_rule_select", "TRANS-PREDICATE-POS-RULE-SELECT", 1, 0, false);
        new $trans_predicate_pos_rule_select$UnaryFunction();
        declareFunction(myName, "trans_predicate_neg_rule_select", "TRANS-PREDICATE-NEG-RULE-SELECT", 1, 0, false);
        declareFunction(myName, "trans_predicate_pos_rule_filter", "TRANS-PREDICATE-POS-RULE-FILTER", 2, 0, false);
        new $trans_predicate_pos_rule_filter$BinaryFunction();
        declareFunction(myName, "trans_predicate_neg_rule_filter", "TRANS-PREDICATE-NEG-RULE-FILTER", 2, 0, false);
        declareFunction(myName, "trans_predicate_pos_expand", "TRANS-PREDICATE-POS-EXPAND", 2, 0, false);
        new $trans_predicate_pos_expand$BinaryFunction();
        declareFunction(myName, "trans_predicate_neg_expand", "TRANS-PREDICATE-NEG-EXPAND", 2, 0, false);
        declareFunction(myName, "trans_predicate_required", "TRANS-PREDICATE-REQUIRED", 1, 0, false);
        declareFunction(myName, "trans_predicate_cost", "TRANS-PREDICATE-COST", 2, 0, false);
        declareFunction(myName, "trans_predicate_rule_select", "TRANS-PREDICATE-RULE-SELECT", 2, 0, false);
        declareFunction(myName, "trans_predicate_rule_select_int_internal", "TRANS-PREDICATE-RULE-SELECT-INT-INTERNAL", 2, 0, false);
        declareFunction(myName, "trans_predicate_rule_select_int", "TRANS-PREDICATE-RULE-SELECT-INT", 2, 0, false);
        declareFunction(myName, "trans_predicate_rule_filter", "TRANS-PREDICATE-RULE-FILTER", 3, 0, false);
        declareFunction(myName, "trans_predicate_expand", "TRANS-PREDICATE-EXPAND", 3, 0, false);
        declareFunction(myName, "trans_predicate_genlpreds_pos_required", "TRANS-PREDICATE-GENLPREDS-POS-REQUIRED", 1, 0, false);
        new $trans_predicate_genlpreds_pos_required$UnaryFunction();
        declareFunction(myName, "trans_predicate_genlpreds_neg_required", "TRANS-PREDICATE-GENLPREDS-NEG-REQUIRED", 1, 0, false);
        declareFunction(myName, "trans_predicate_genlpreds_pos_cost", "TRANS-PREDICATE-GENLPREDS-POS-COST", 1, 0, false);
        new $trans_predicate_genlpreds_pos_cost$UnaryFunction();
        declareFunction(myName, "trans_predicate_genlpreds_neg_cost", "TRANS-PREDICATE-GENLPREDS-NEG-COST", 1, 0, false);
        declareFunction(myName, "trans_predicate_genlpreds_pos_rule_select", "TRANS-PREDICATE-GENLPREDS-POS-RULE-SELECT", 1, 0, false);
        new $trans_predicate_genlpreds_pos_rule_select$UnaryFunction();
        declareFunction(myName, "trans_predicate_genlpreds_pos_rule_select_int_internal", "TRANS-PREDICATE-GENLPREDS-POS-RULE-SELECT-INT-INTERNAL", 1, 0, false);
        declareFunction(myName, "trans_predicate_genlpreds_pos_rule_select_int", "TRANS-PREDICATE-GENLPREDS-POS-RULE-SELECT-INT", 1, 0, false);
        declareFunction(myName, "trans_predicate_genlpreds_neg_rule_select", "TRANS-PREDICATE-GENLPREDS-NEG-RULE-SELECT", 1, 0, false);
        declareFunction(myName, "trans_predicate_genlpreds_pos_expand_int", "TRANS-PREDICATE-GENLPREDS-POS-EXPAND-INT", 2, 0, false);
        declareFunction(myName, "trans_predicate_genlpreds_pos_rule_filter", "TRANS-PREDICATE-GENLPREDS-POS-RULE-FILTER", 2, 0, false);
        declareFunction(myName, "trans_predicate_genlpreds_pos_expand", "TRANS-PREDICATE-GENLPREDS-POS-EXPAND", 2, 0, false);
        declareFunction(myName, "trans_predicate_genlpreds_neg_expand_int", "TRANS-PREDICATE-GENLPREDS-NEG-EXPAND-INT", 2, 0, false);
        declareFunction(myName, "trans_predicate_genlpreds_neg_rule_filter", "TRANS-PREDICATE-GENLPREDS-NEG-RULE-FILTER", 2, 0, false);
        declareFunction(myName, "trans_predicate_genlpreds_neg_expand", "TRANS-PREDICATE-GENLPREDS-NEG-EXPAND", 2, 0, false);
        declareFunction(myName, "trans_predicate_genlpreds_required", "TRANS-PREDICATE-GENLPREDS-REQUIRED", 1, 0, false);
        declareFunction(myName, "inference_proper_genl_predicateP_internal", "INFERENCE-PROPER-GENL-PREDICATE?-INTERNAL", 2, 1, false);
        declareFunction(myName, "inference_proper_genl_predicateP", "INFERENCE-PROPER-GENL-PREDICATE?", 2, 1, false);
        declareFunction(myName, "trans_predicate_genlinverse_pos_required", "TRANS-PREDICATE-GENLINVERSE-POS-REQUIRED", 1, 0, false);
        declareFunction(myName, "trans_predicate_genlinverse_neg_required", "TRANS-PREDICATE-GENLINVERSE-NEG-REQUIRED", 1, 0, false);
        declareFunction(myName, "trans_predicate_genlinverse_pos_cost", "TRANS-PREDICATE-GENLINVERSE-POS-COST", 1, 0, false);
        declareFunction(myName, "trans_predicate_genlinverse_neg_cost", "TRANS-PREDICATE-GENLINVERSE-NEG-COST", 1, 0, false);
        declareFunction(myName, "trans_predicate_genlinverse_pos_rule_select", "TRANS-PREDICATE-GENLINVERSE-POS-RULE-SELECT", 1, 0, false);
        declareFunction(myName, "trans_predicate_genlinverse_pos_rule_select_int_internal", "TRANS-PREDICATE-GENLINVERSE-POS-RULE-SELECT-INT-INTERNAL", 1, 0, false);
        declareFunction(myName, "trans_predicate_genlinverse_pos_rule_select_int", "TRANS-PREDICATE-GENLINVERSE-POS-RULE-SELECT-INT", 1, 0, false);
        declareFunction(myName, "trans_predicate_genlinverse_neg_rule_select", "TRANS-PREDICATE-GENLINVERSE-NEG-RULE-SELECT", 1, 0, false);
        declareFunction(myName, "trans_predicate_genlinverse_pos_expand_int", "TRANS-PREDICATE-GENLINVERSE-POS-EXPAND-INT", 2, 0, false);
        declareFunction(myName, "trans_predicate_genlinverse_pos_rule_filter", "TRANS-PREDICATE-GENLINVERSE-POS-RULE-FILTER", 2, 0, false);
        declareFunction(myName, "trans_predicate_genlinverse_pos_expand", "TRANS-PREDICATE-GENLINVERSE-POS-EXPAND", 2, 0, false);
        declareFunction(myName, "trans_predicate_genlinverse_neg_expand_int", "TRANS-PREDICATE-GENLINVERSE-NEG-EXPAND-INT", 2, 0, false);
        declareFunction(myName, "trans_predicate_genlinverse_neg_rule_filter", "TRANS-PREDICATE-GENLINVERSE-NEG-RULE-FILTER", 2, 0, false);
        declareFunction(myName, "trans_predicate_genlinverse_neg_expand", "TRANS-PREDICATE-GENLINVERSE-NEG-EXPAND", 2, 0, false);
        declareFunction(myName, "inference_proper_genl_inverseP_internal", "INFERENCE-PROPER-GENL-INVERSE?-INTERNAL", 2, 1, false);
        declareFunction(myName, "inference_proper_genl_inverseP", "INFERENCE-PROPER-GENL-INVERSE?", 2, 1, false);
        declareFunction(myName, "trans_predicate_negationpreds_neg_required", "TRANS-PREDICATE-NEGATIONPREDS-NEG-REQUIRED", 1, 0, false);
        declareFunction(myName, "trans_predicate_negationpreds_neg_cost", "TRANS-PREDICATE-NEGATIONPREDS-NEG-COST", 1, 0, false);
        declareFunction(myName, "trans_predicate_negationpreds_neg_rule_select", "TRANS-PREDICATE-NEGATIONPREDS-NEG-RULE-SELECT", 1, 0, false);
        declareFunction(myName, "trans_predicate_negationpreds_neg_expand_int", "TRANS-PREDICATE-NEGATIONPREDS-NEG-EXPAND-INT", 2, 0, false);
        declareFunction(myName, "trans_predicate_negationpreds_neg_rule_filter", "TRANS-PREDICATE-NEGATIONPREDS-NEG-RULE-FILTER", 2, 0, false);
        declareFunction(myName, "trans_predicate_negationpreds_neg_expand", "TRANS-PREDICATE-NEGATIONPREDS-NEG-EXPAND", 2, 0, false);
        declareFunction(myName, "trans_predicate_commutativity_cost", "TRANS-PREDICATE-COMMUTATIVITY-COST", 2, 0, false);
        declareFunction(myName, "trans_predicate_commutativity_rule_select", "TRANS-PREDICATE-COMMUTATIVITY-RULE-SELECT", 2, 0, false);
        declareFunction(myName, "trans_predicate_commutativity_expand_int", "TRANS-PREDICATE-COMMUTATIVITY-EXPAND-INT", 3, 0, false);
        declareFunction(myName, "trans_predicate_commutativity_rule_filter", "TRANS-PREDICATE-COMMUTATIVITY-RULE-FILTER", 3, 0, false);
        declareFunction(myName, "trans_predicate_commutativity_expand", "TRANS-PREDICATE-COMMUTATIVITY-EXPAND", 3, 0, false);
        declareFunction(myName, "trans_predicate_symmetry_pos_cost", "TRANS-PREDICATE-SYMMETRY-POS-COST", 1, 0, false);
        new $trans_predicate_symmetry_pos_cost$UnaryFunction();
        declareFunction(myName, "trans_predicate_symmetry_neg_cost", "TRANS-PREDICATE-SYMMETRY-NEG-COST", 1, 0, false);
        declareFunction(myName, "trans_predicate_symmetry_pos_rule_select", "TRANS-PREDICATE-SYMMETRY-POS-RULE-SELECT", 1, 0, false);
        new $trans_predicate_symmetry_pos_rule_select$UnaryFunction();
        declareFunction(myName, "trans_predicate_symmetry_neg_rule_select", "TRANS-PREDICATE-SYMMETRY-NEG-RULE-SELECT", 1, 0, false);
        declareFunction(myName, "trans_predicate_symmetry_pos_rule_filter", "TRANS-PREDICATE-SYMMETRY-POS-RULE-FILTER", 2, 0, false);
        new $trans_predicate_symmetry_pos_rule_filter$BinaryFunction();
        declareFunction(myName, "trans_predicate_symmetry_neg_rule_filter", "TRANS-PREDICATE-SYMMETRY-NEG-RULE-FILTER", 2, 0, false);
        declareFunction(myName, "trans_predicate_symmetry_pos_expand", "TRANS-PREDICATE-SYMMETRY-POS-EXPAND", 2, 0, false);
        new $trans_predicate_symmetry_pos_expand$BinaryFunction();
        declareFunction(myName, "trans_predicate_symmetry_neg_expand", "TRANS-PREDICATE-SYMMETRY-NEG-EXPAND", 2, 0, false);
        declareFunction(myName, "trans_predicate_commutative_pos_cost", "TRANS-PREDICATE-COMMUTATIVE-POS-COST", 1, 0, false);
        declareFunction(myName, "trans_predicate_commutative_neg_cost", "TRANS-PREDICATE-COMMUTATIVE-NEG-COST", 1, 0, false);
        declareFunction(myName, "trans_predicate_commutative_pos_rule_select", "TRANS-PREDICATE-COMMUTATIVE-POS-RULE-SELECT", 1, 0, false);
        declareFunction(myName, "trans_predicate_commutative_neg_rule_select", "TRANS-PREDICATE-COMMUTATIVE-NEG-RULE-SELECT", 1, 0, false);
        declareFunction(myName, "trans_predicate_commutative_pos_rule_filter", "TRANS-PREDICATE-COMMUTATIVE-POS-RULE-FILTER", 2, 0, false);
        declareFunction(myName, "trans_predicate_commutative_neg_rule_filter", "TRANS-PREDICATE-COMMUTATIVE-NEG-RULE-FILTER", 2, 0, false);
        declareFunction(myName, "trans_predicate_commutative_pos_expand", "TRANS-PREDICATE-COMMUTATIVE-POS-EXPAND", 2, 0, false);
        declareFunction(myName, "trans_predicate_commutative_neg_expand", "TRANS-PREDICATE-COMMUTATIVE-NEG-EXPAND", 2, 0, false);
        declareFunction(myName, "trans_predicate_partially_commutative_pos_cost", "TRANS-PREDICATE-PARTIALLY-COMMUTATIVE-POS-COST", 1, 0, false);
        declareFunction(myName, "trans_predicate_partially_commutative_neg_cost", "TRANS-PREDICATE-PARTIALLY-COMMUTATIVE-NEG-COST", 1, 0, false);
        declareFunction(myName, "trans_predicate_partially_commutative_pos_rule_select", "TRANS-PREDICATE-PARTIALLY-COMMUTATIVE-POS-RULE-SELECT", 1, 0, false);
        declareFunction(myName, "trans_predicate_partially_commutative_neg_rule_select", "TRANS-PREDICATE-PARTIALLY-COMMUTATIVE-NEG-RULE-SELECT", 1, 0, false);
        declareFunction(myName, "trans_predicate_partially_commutative_pos_rule_filter", "TRANS-PREDICATE-PARTIALLY-COMMUTATIVE-POS-RULE-FILTER", 2, 0, false);
        declareFunction(myName, "trans_predicate_partially_commutative_neg_rule_filter", "TRANS-PREDICATE-PARTIALLY-COMMUTATIVE-NEG-RULE-FILTER", 2, 0, false);
        declareFunction(myName, "trans_predicate_partially_commutative_pos_expand", "TRANS-PREDICATE-PARTIALLY-COMMUTATIVE-POS-EXPAND", 2, 0, false);
        declareFunction(myName, "trans_predicate_partially_commutative_neg_expand", "TRANS-PREDICATE-PARTIALLY-COMMUTATIVE-NEG-EXPAND", 2, 0, false);
        declareFunction(myName, "trans_predicate_asymmetry_cost", "TRANS-PREDICATE-ASYMMETRY-COST", 1, 0, false);
        declareFunction(myName, "trans_predicate_asymmetry_rule_select", "TRANS-PREDICATE-ASYMMETRY-RULE-SELECT", 1, 0, false);
        declareFunction(myName, "trans_predicate_asymmetry_expand_int", "TRANS-PREDICATE-ASYMMETRY-EXPAND-INT", 2, 0, false);
        declareFunction(myName, "trans_predicate_asymmetry_rule_filter", "TRANS-PREDICATE-ASYMMETRY-RULE-FILTER", 2, 0, false);
        declareFunction(myName, "trans_predicate_asymmetry_expand", "TRANS-PREDICATE-ASYMMETRY-EXPAND", 2, 0, false);
        declareFunction(myName, "trans_unbound_predicate_module_p", "TRANS-UNBOUND-PREDICATE-MODULE-P", 1, 0, false);
        declareFunction(myName, "module_requires_unbound_predicate_transformationP", "MODULE-REQUIRES-UNBOUND-PREDICATE-TRANSFORMATION?", 1, 0, false);
        declareFunction(myName, "trans_unbound_predicate_pos_required", "TRANS-UNBOUND-PREDICATE-POS-REQUIRED", 1, 0, false);
        new $trans_unbound_predicate_pos_required$UnaryFunction();
        declareFunction(myName, "trans_unbound_predicate_neg_required", "TRANS-UNBOUND-PREDICATE-NEG-REQUIRED", 1, 0, false);
        declareFunction(myName, "trans_unbound_predicate_pos_cost", "TRANS-UNBOUND-PREDICATE-POS-COST", 1, 0, false);
        new $trans_unbound_predicate_pos_cost$UnaryFunction();
        declareFunction(myName, "trans_unbound_predicate_neg_cost", "TRANS-UNBOUND-PREDICATE-NEG-COST", 1, 0, false);
        declareFunction(myName, "trans_unbound_predicate_pos_rule_select", "TRANS-UNBOUND-PREDICATE-POS-RULE-SELECT", 1, 0, false);
        declareFunction(myName, "trans_unbound_predicate_neg_rule_select", "TRANS-UNBOUND-PREDICATE-NEG-RULE-SELECT", 1, 0, false);
        declareFunction(myName, "trans_unbound_predicate_pos_rule_filter", "TRANS-UNBOUND-PREDICATE-POS-RULE-FILTER", 2, 0, false);
        declareFunction(myName, "trans_unbound_predicate_neg_rule_filter", "TRANS-UNBOUND-PREDICATE-NEG-RULE-FILTER", 2, 0, false);
        declareFunction(myName, "trans_unbound_predicate_pos_expand", "TRANS-UNBOUND-PREDICATE-POS-EXPAND", 2, 0, false);
        declareFunction(myName, "trans_unbound_predicate_neg_expand", "TRANS-UNBOUND-PREDICATE-NEG-EXPAND", 2, 0, false);
        declareFunction(myName, "trans_unbound_predicate_required", "TRANS-UNBOUND-PREDICATE-REQUIRED", 1, 0, false);
        declareFunction(myName, "trans_unbound_predicate_cost", "TRANS-UNBOUND-PREDICATE-COST", 1, 0, false);
        declareFunction(myName, "trans_unbound_predicate_rule_select_internal", "TRANS-UNBOUND-PREDICATE-RULE-SELECT-INTERNAL", 1, 0, false);
        declareFunction(myName, "trans_unbound_predicate_rule_select", "TRANS-UNBOUND-PREDICATE-RULE-SELECT", 1, 0, false);
        declareFunction(myName, "trans_unbound_predicate_rule_filter", "TRANS-UNBOUND-PREDICATE-RULE-FILTER", 2, 0, false);
        declareFunction(myName, "trans_unbound_predicate_expand", "TRANS-UNBOUND-PREDICATE-EXPAND", 3, 0, false);
        declareFunction(myName, "module_requires_hl_predicate_transformationP", "MODULE-REQUIRES-HL-PREDICATE-TRANSFORMATION?", 1, 0, false);
        declareFunction(myName, "trans_isa_pos_required", "TRANS-ISA-POS-REQUIRED", 1, 0, false);
        declareFunction(myName, "trans_isa_neg_required", "TRANS-ISA-NEG-REQUIRED", 1, 0, false);
        declareFunction(myName, "trans_isa_pos_cost", "TRANS-ISA-POS-COST", 1, 0, false);
        declareFunction(myName, "trans_isa_neg_cost", "TRANS-ISA-NEG-COST", 1, 0, false);
        declareFunction(myName, "inference_memoized_all_specs_internal", "INFERENCE-MEMOIZED-ALL-SPECS-INTERNAL", 1, 1, false);
        declareFunction(myName, "inference_memoized_all_specs", "INFERENCE-MEMOIZED-ALL-SPECS", 1, 1, false);
        declareFunction(myName, "trans_isa_pos_rule_select_count_internal", "TRANS-ISA-POS-RULE-SELECT-COUNT-INTERNAL", 2, 0, false);
        declareFunction(myName, "trans_isa_pos_rule_select_count", "TRANS-ISA-POS-RULE-SELECT-COUNT", 2, 0, false);
        declareFunction(myName, "trans_isa_pos_rule_select", "TRANS-ISA-POS-RULE-SELECT", 1, 0, false);
        declareFunction(myName, "trans_isa_pos_expand_int", "TRANS-ISA-POS-EXPAND-INT", 2, 0, false);
        declareFunction(myName, "trans_isa_pos_rule_filter", "TRANS-ISA-POS-RULE-FILTER", 2, 0, false);
        declareFunction(myName, "trans_isa_pos_expand", "TRANS-ISA-POS-EXPAND", 2, 0, false);
        declareFunction(myName, "trans_isa_neg_rule_select", "TRANS-ISA-NEG-RULE-SELECT", 1, 0, false);
        declareFunction(myName, "trans_isa_neg_expand_int", "TRANS-ISA-NEG-EXPAND-INT", 2, 0, false);
        declareFunction(myName, "trans_isa_neg_rule_filter", "TRANS-ISA-NEG-RULE-FILTER", 2, 0, false);
        declareFunction(myName, "trans_isa_neg_expand", "TRANS-ISA-NEG-EXPAND", 2, 0, false);
        declareFunction(myName, "trans_genls_pos_required", "TRANS-GENLS-POS-REQUIRED", 1, 0, false);
        declareFunction(myName, "trans_genls_neg_required", "TRANS-GENLS-NEG-REQUIRED", 1, 0, false);
        declareFunction(myName, "trans_genls_pos_cost", "TRANS-GENLS-POS-COST", 1, 0, false);
        declareFunction(myName, "trans_genls_neg_cost", "TRANS-GENLS-NEG-COST", 1, 0, false);
        declareFunction(myName, "trans_genls_pos_rule_select", "TRANS-GENLS-POS-RULE-SELECT", 1, 0, false);
        declareFunction(myName, "trans_genls_pos_expand_int", "TRANS-GENLS-POS-EXPAND-INT", 2, 0, false);
        declareFunction(myName, "trans_genls_pos_rule_filter", "TRANS-GENLS-POS-RULE-FILTER", 2, 0, false);
        declareFunction(myName, "trans_genls_pos_expand", "TRANS-GENLS-POS-EXPAND", 2, 0, false);
        declareFunction(myName, "trans_genls_neg_rule_select", "TRANS-GENLS-NEG-RULE-SELECT", 1, 0, false);
        declareFunction(myName, "trans_genls_neg_expand_int", "TRANS-GENLS-NEG-EXPAND-INT", 2, 0, false);
        declareFunction(myName, "trans_genls_neg_rule_filter", "TRANS-GENLS-NEG-RULE-FILTER", 2, 0, false);
        declareFunction(myName, "trans_genls_neg_expand", "TRANS-GENLS-NEG-EXPAND", 2, 0, false);
        declareFunction(myName, "trans_genl_mt_pos_required", "TRANS-GENL-MT-POS-REQUIRED", 1, 0, false);
        declareFunction(myName, "trans_genl_mt_neg_required", "TRANS-GENL-MT-NEG-REQUIRED", 1, 0, false);
        declareFunction(myName, "trans_genl_mt_pos_cost", "TRANS-GENL-MT-POS-COST", 1, 0, false);
        declareFunction(myName, "trans_genl_mt_neg_cost", "TRANS-GENL-MT-NEG-COST", 1, 0, false);
        declareFunction(myName, "inference_memoized_all_spec_mts_internal", "INFERENCE-MEMOIZED-ALL-SPEC-MTS-INTERNAL", 1, 1, false);
        declareFunction(myName, "inference_memoized_all_spec_mts", "INFERENCE-MEMOIZED-ALL-SPEC-MTS", 1, 1, false);
        declareFunction(myName, "trans_genl_mt_pos_rule_select", "TRANS-GENL-MT-POS-RULE-SELECT", 1, 0, false);
        declareFunction(myName, "trans_genl_mt_pos_expand_int", "TRANS-GENL-MT-POS-EXPAND-INT", 2, 0, false);
        declareFunction(myName, "trans_genl_mt_pos_rule_filter", "TRANS-GENL-MT-POS-RULE-FILTER", 2, 0, false);
        declareFunction(myName, "trans_genl_mt_pos_expand", "TRANS-GENL-MT-POS-EXPAND", 2, 0, false);
        declareFunction(myName, "trans_genl_mt_neg_rule_select", "TRANS-GENL-MT-NEG-RULE-SELECT", 1, 0, false);
        declareFunction(myName, "trans_genl_mt_neg_expand_int", "TRANS-GENL-MT-NEG-EXPAND-INT", 2, 0, false);
        declareFunction(myName, "trans_genl_mt_neg_rule_filter", "TRANS-GENL-MT-NEG-RULE-FILTER", 2, 0, false);
        declareFunction(myName, "trans_genl_mt_neg_expand", "TRANS-GENL-MT-NEG-EXPAND", 2, 0, false);
        declareFunction(myName, "trans_abnormal_cost", "TRANS-ABNORMAL-COST", 1, 0, false);
        declareFunction(myName, "trans_abnormal_rule_select", "TRANS-ABNORMAL-RULE-SELECT", 1, 0, false);
        declareFunction(myName, "trans_abnormal_expand_int", "TRANS-ABNORMAL-EXPAND-INT", 2, 0, false);
        declareFunction(myName, "trans_abnormal_rule_filter", "TRANS-ABNORMAL-RULE-FILTER", 2, 0, false);
        declareFunction(myName, "trans_abnormal_expand", "TRANS-ABNORMAL-EXPAND", 2, 0, false);
        declareFunction(myName, "transformation_abduction_to_specs_required", "TRANSFORMATION-ABDUCTION-TO-SPECS-REQUIRED", 1, 1, false);
        declareFunction(myName, "find_genls_definitional_rules", "FIND-GENLS-DEFINITIONAL-RULES", 0, 0, false);
        declareFunction(myName, "transformation_abduction_to_specs_rule_select", "TRANSFORMATION-ABDUCTION-TO-SPECS-RULE-SELECT", 1, 0, false);
        declareFunction(myName, "transformation_abduction_to_specs_rule_filter", "TRANSFORMATION-ABDUCTION-TO-SPECS-RULE-FILTER", 2, 0, false);
        declareFunction(myName, "transformation_abduction_to_specs_expand", "TRANSFORMATION-ABDUCTION-TO-SPECS-EXPAND", 2, 0, false);
        return NIL;
    }

    public static SubLObject init_transformation_modules_file() {
        $transformation_gaf_truth_known_disabled$ = defparameter("*TRANSFORMATION-GAF-TRUTH-KNOWN-DISABLED*", T);
        $unbound_predicate_transformation_required_modules$ = SubLFiles.deflexical("*UNBOUND-PREDICATE-TRANSFORMATION-REQUIRED-MODULES*", $list76);
        $hl_predicate_transformation_required_modules$ = SubLFiles.deflexical("*HL-PREDICATE-TRANSFORMATION-REQUIRED-MODULES*", $list82);
        $genls_definitional_sentence$ = defparameter("*GENLS-DEFINITIONAL-SENTENCE*", $list102);
        $genls_definitional_rules$ = defparameter("*GENLS-DEFINITIONAL-RULES*", NIL);
        return NIL;
    }

    public static SubLObject setup_transformation_modules_file() {
        inference_modules.inference_transformation_module($TRANS_PREDICATE_POS, $list42);
        inference_modules.inference_transformation_module($TRANS_PREDICATE_NEG, $list44);
        memoization_state.note_memoized_function($sym45$TRANS_PREDICATE_RULE_SELECT_INT);
        memoization_state.note_memoized_function($sym48$TRANS_PREDICATE_GENLPREDS_POS_RULE_SELECT_INT);
        inference_modules.inference_transformation_module($TRANS_PREDICATE_GENLPREDS_POS, $list50);
        inference_modules.inference_transformation_module($TRANS_PREDICATE_GENLPREDS_NEG, $list52);
        memoization_state.note_memoized_function($sym53$INFERENCE_PROPER_GENL_PREDICATE_);
        memoization_state.note_memoized_function($sym54$TRANS_PREDICATE_GENLINVERSE_POS_RULE_SELECT_INT);
        inference_modules.inference_transformation_module($TRANS_PREDICATE_GENLINVERSE_POS, $list56);
        inference_modules.inference_transformation_module($TRANS_PREDICATE_GENLINVERSE_NEG, $list58);
        memoization_state.note_memoized_function($sym59$INFERENCE_PROPER_GENL_INVERSE_);
        inference_modules.inference_transformation_module($TRANS_PREDICATE_NEGATIONPREDS_NEG, $list61);
        inference_modules.inference_transformation_module($TRANS_PREDICATE_SYMMETRY_POS, $list63);
        inference_modules.inference_transformation_module($TRANS_PREDICATE_SYMMETRY_NEG, $list65);
        inference_modules.inference_transformation_module($TRANS_PREDICATE_COMMUTATIVE_POS, $list67);
        inference_modules.inference_transformation_module($TRANS_PREDICATE_COMMUTATIVE_NEG, $list69);
        inference_modules.inference_transformation_module($TRANS_PREDICATE_PARTIALLY_COMMUTATIVE_POS, $list71);
        inference_modules.inference_transformation_module($TRANS_PREDICATE_PARTIALLY_COMMUTATIVE_NEG, $list73);
        inference_modules.inference_transformation_module($TRANS_PREDICATE_ASYMMETRY, $list75);
        inference_modules.inference_transformation_module($TRANS_UNBOUND_PREDICATE_POS, $list78);
        inference_modules.inference_transformation_module($TRANS_UNBOUND_PREDICATE_NEG, $list80);
        memoization_state.note_memoized_function($sym81$TRANS_UNBOUND_PREDICATE_RULE_SELECT);
        memoization_state.note_memoized_function($sym83$INFERENCE_MEMOIZED_ALL_SPECS);
        memoization_state.note_memoized_function($sym84$TRANS_ISA_POS_RULE_SELECT_COUNT);
        inference_modules.inference_transformation_module($TRANS_ISA_POS, $list87);
        inference_modules.inference_transformation_module($TRANS_ISA_NEG, $list89);
        inference_modules.inference_transformation_module($TRANS_GENLS_POS, $list91);
        inference_modules.inference_transformation_module($TRANS_GENLS_NEG, $list93);
        memoization_state.note_memoized_function($sym94$INFERENCE_MEMOIZED_ALL_SPEC_MTS);
        inference_modules.inference_transformation_module($TRANS_GENL_MT_POS, $list96);
        inference_modules.inference_transformation_module($TRANS_GENL_MT_NEG, $list98);
        inference_modules.inference_transformation_module($TRANS_ABNORMAL, $list101);
        inference_modules.inference_transformation_module($TRANSFORMATION_ABDUCTION_TO_SPECS, $list104);
        return NIL;
    }

    @Override
    public void declareFunctions() {
        declare_transformation_modules_file();
    }

    @Override
    public void initializeVariables() {
        init_transformation_modules_file();
    }

    @Override
    public void runTopLevelForms() {
        setup_transformation_modules_file();
    }

    static {
        me = new transformation_modules();
        $transformation_gaf_truth_known_disabled$ = null;
        $unbound_predicate_transformation_required_modules$ = null;
        $hl_predicate_transformation_required_modules$ = null;
        $genls_definitional_sentence$ = null;
        $genls_definitional_rules$ = null;
        $$genls = makeConstSym(("genls"));
        $GENLS = makeKeyword("GENLS");
        $$genlMt = makeConstSym(("genlMt"));
        $GENLMT = makeKeyword("GENLMT");
        $$genlPreds = makeConstSym(("genlPreds"));
        $GENLPREDS = makeKeyword("GENLPREDS");
        $$genlInverse = makeConstSym(("genlInverse"));
        $$negationPreds = makeConstSym(("negationPreds"));
        $NEGATIONPREDS = makeKeyword("NEGATIONPREDS");
        $$AsymmetricBinaryPredicate = makeConstSym(("AsymmetricBinaryPredicate"));
        $$SymmetricBinaryPredicate = makeConstSym(("SymmetricBinaryPredicate"));
        $$CommutativePredicate = makeConstSym(("CommutativePredicate"));
        $$PartiallyCommutativePredicate = makeConstSym(("PartiallyCommutativePredicate"));
        $str13$Unexpected_commutative_predicate_ = makeString("Unexpected commutative predicate ~s");
        $NEG = makeKeyword("NEG");
        $list15 = list(list(makeSymbol("DIRECTION-VAR")), makeSymbol("&BODY"), makeSymbol("BODY"));
        $sym16$DO_LIST = makeSymbol("DO-LIST");
        $list17 = list(list(makeSymbol("RELEVANT-DIRECTIONS")));
        $list18 = list(list(makeSymbol("RULE-ASENT-VAR"), makeSymbol("RULE"), makeSymbol("SENSE"), makeSymbol("&KEY"), makeSymbol("PREDICATE")), makeSymbol("&BODY"), makeSymbol("BODY"));
        $list19 = list(makeKeyword("PREDICATE"));
        $ALLOW_OTHER_KEYS = makeKeyword("ALLOW-OTHER-KEYS");
        $PREDICATE = makeKeyword("PREDICATE");
        $sym22$PREDICATE_VAR = makeUninternedSymbol("PREDICATE-VAR");
        $sym23$CLET = makeSymbol("CLET");
        $sym24$DO_TRANSFORMATION_RULE_LITERALS = makeSymbol("DO-TRANSFORMATION-RULE-LITERALS");
        $sym25$PWHEN = makeSymbol("PWHEN");
        $sym26$ATOMIC_SENTENCE_PREDICATE = makeSymbol("ATOMIC-SENTENCE-PREDICATE");
        $sym27$RULE_VAR = makeUninternedSymbol("RULE-VAR");
        $sym28$RULE_RELEVANT_TO_PROOF = makeSymbol("RULE-RELEVANT-TO-PROOF");
        $sym29$DO_ASSERTION_LITERALS = makeSymbol("DO-ASSERTION-LITERALS");
        $SENSE = makeKeyword("SENSE");
        $list31 = list(list(makeSymbol("RULE-ASENT-VAR"), makeSymbol("RULE-VAR"), makeSymbol("PREDICATE"), makeSymbol("SENSE")), makeSymbol("&BODY"), makeSymbol("BODY"));
        $sym32$DIRECTION_VAR = makeUninternedSymbol("DIRECTION-VAR");
        $sym33$SENSE_VAR = makeUninternedSymbol("SENSE-VAR");
        $sym34$PREDICATE_VAR = makeUninternedSymbol("PREDICATE-VAR");
        $sym35$DO_TRANSFORMATION_RELEVANT_DIRECTIONS = makeSymbol("DO-TRANSFORMATION-RELEVANT-DIRECTIONS");
        $sym36$DO_PREDICATE_RULE_INDEX = makeSymbol("DO-PREDICATE-RULE-INDEX");
        $DIRECTION = makeKeyword("DIRECTION");
        $sym38$CURRENT_INFERENCE_RULE_PREFERENCE__ = makeSymbol("CURRENT-INFERENCE-RULE-PREFERENCE->");
        $sym39$TRANSFORMATION_RULE_UTILITY__ = makeSymbol("TRANSFORMATION-RULE-UTILITY->");
        $POS = makeKeyword("POS");
        $TRANS_PREDICATE_POS = makeKeyword("TRANS-PREDICATE-POS");
        $list42 = list(new SubLObject[] { makeKeyword("SENSE"), makeKeyword("POS"), makeKeyword("REQUIRED-PATTERN"), cons(makeKeyword("FORT"), makeKeyword("ANYTHING")), makeKeyword("REQUIRED"), makeSymbol("TRANS-PREDICATE-POS-REQUIRED"), makeKeyword("COST"), makeSymbol("TRANS-PREDICATE-POS-COST"),
                makeKeyword("RULE-SELECT"), makeSymbol("TRANS-PREDICATE-POS-RULE-SELECT"), makeKeyword("RULE-FILTER"), makeSymbol("TRANS-PREDICATE-POS-RULE-FILTER"), makeKeyword("EXPAND"), makeSymbol("TRANS-PREDICATE-POS-EXPAND"), makeKeyword("DOCUMENTATION"),
                makeString("(<predicate> . <whatever>)\nwhere <predicate> is a FORT\nfrom a rule concluding to <predicate>\nusing the predicate rule indexing in the KB"), makeKeyword("EXAMPLE"), makeString("(#$likesAsFriend #$AbrahamLincoln ?WHO)\nfrom a rule concluding to #$likesAsFriend") });
        $TRANS_PREDICATE_NEG = makeKeyword("TRANS-PREDICATE-NEG");
        $list44 = list(new SubLObject[] { makeKeyword("SENSE"), makeKeyword("NEG"), makeKeyword("REQUIRED-PATTERN"), cons(makeKeyword("FORT"), makeKeyword("ANYTHING")), makeKeyword("REQUIRED"), makeSymbol("TRANS-PREDICATE-NEG-REQUIRED"), makeKeyword("COST"), makeSymbol("TRANS-PREDICATE-NEG-COST"),
                makeKeyword("RULE-SELECT"), makeSymbol("TRANS-PREDICATE-NEG-RULE-SELECT"), makeKeyword("RULE-FILTER"), makeSymbol("TRANS-PREDICATE-NEG-RULE-FILTER"), makeKeyword("EXPAND"), makeSymbol("TRANS-PREDICATE-NEG-EXPAND"), makeKeyword("DOCUMENTATION"),
                makeString("(#$not (<predicate> . <whatever>))\nwhere <predicate> is a FORT\nfrom a rule concluding from <predicate>\nusing the predicate rule indexing in the KB"), makeKeyword("EXAMPLE"),
                makeString("(#$not (#$likesAsFriend #$AbrahamLincoln ?WHO))\nfrom a rule concluding from #$likesAsFriend") });
        $sym45$TRANS_PREDICATE_RULE_SELECT_INT = makeSymbol("TRANS-PREDICATE-RULE-SELECT-INT");
        $RULE = makeKeyword("RULE");
        $str47$Invalid_sense__s = makeString("Invalid sense ~s");
        $sym48$TRANS_PREDICATE_GENLPREDS_POS_RULE_SELECT_INT = makeSymbol("TRANS-PREDICATE-GENLPREDS-POS-RULE-SELECT-INT");
        $TRANS_PREDICATE_GENLPREDS_POS = makeKeyword("TRANS-PREDICATE-GENLPREDS-POS");
        $list50 = ConsesLow.list(new SubLObject[] { makeKeyword("SENSE"), makeKeyword("POS"), makeKeyword("REQUIRED-PATTERN"), cons(list(makeKeyword("AND"), makeKeyword("FORT"), list(makeKeyword("TEST"), makeSymbol("INFERENCE-SOME-SPEC-PRED-OR-INVERSE?"))), makeKeyword("ANYTHING")),
                makeKeyword("REQUIRED"), makeSymbol("TRANS-PREDICATE-GENLPREDS-POS-REQUIRED"), makeKeyword("COST"), makeSymbol("TRANS-PREDICATE-GENLPREDS-POS-COST"), makeKeyword("RULE-SELECT"), makeSymbol("TRANS-PREDICATE-GENLPREDS-POS-RULE-SELECT"), makeKeyword("RULE-FILTER"),
                makeSymbol("TRANS-PREDICATE-GENLPREDS-POS-RULE-FILTER"), makeKeyword("EXPAND"), makeSymbol("TRANS-PREDICATE-GENLPREDS-POS-EXPAND"), makeKeyword("DOCUMENTATION"),
                makeString("(<predicate> . <whatever>)\nwhere <predicate> is a FORT with some spec-preds\nfrom a rule concluding to a spec-pred of <predicate>\nusing the predicate rule indexing in the KB"), makeKeyword("EXAMPLE"),
                makeString("(#$acquaintedWith #$AbrahamLincoln ?WHO)\nfrom (#$genlPreds #$likesAsFriend #$acquaintedWith)\nand a rule concluding to #$likesAsFriend") });
        $TRANS_PREDICATE_GENLPREDS_NEG = makeKeyword("TRANS-PREDICATE-GENLPREDS-NEG");
        $list52 = ConsesLow.list(new SubLObject[] { makeKeyword("SENSE"), makeKeyword("NEG"), makeKeyword("REQUIRED-PATTERN"), cons(list(makeKeyword("AND"), makeKeyword("FORT"), list(makeKeyword("TEST"), makeSymbol("INFERENCE-SOME-GENL-PRED-OR-INVERSE?"))), makeKeyword("ANYTHING")),
                makeKeyword("REQUIRED"), makeSymbol("TRANS-PREDICATE-GENLPREDS-NEG-REQUIRED"), makeKeyword("COST"), makeSymbol("TRANS-PREDICATE-GENLPREDS-NEG-COST"), makeKeyword("RULE-SELECT"), makeSymbol("TRANS-PREDICATE-GENLPREDS-NEG-RULE-SELECT"), makeKeyword("RULE-FILTER"),
                makeSymbol("TRANS-PREDICATE-GENLPREDS-NEG-RULE-FILTER"), makeKeyword("EXPAND"), makeSymbol("TRANS-PREDICATE-GENLPREDS-NEG-EXPAND"), makeKeyword("DOCUMENTATION"),
                makeString("(#$not (<predicate> . <whatever>))\nwhere <predicate> is a FORT with some genl-preds\nfrom a rule concluding from a genl-pred of <predicate>\nusing the predicate rule indexing in the KB"), makeKeyword("EXAMPLE"),
                makeString("(#$not (#$likesAsFriend #$AbrahamLincoln ?WHO))\nfrom (#$genlPreds #$likesAsFriend #$acquaintedWith)\nand a rule concluding from #$acquaintedWith") });
        $sym53$INFERENCE_PROPER_GENL_PREDICATE_ = makeSymbol("INFERENCE-PROPER-GENL-PREDICATE?");
        $sym54$TRANS_PREDICATE_GENLINVERSE_POS_RULE_SELECT_INT = makeSymbol("TRANS-PREDICATE-GENLINVERSE-POS-RULE-SELECT-INT");
        $TRANS_PREDICATE_GENLINVERSE_POS = makeKeyword("TRANS-PREDICATE-GENLINVERSE-POS");
        $list56 = list(new SubLObject[] { makeKeyword("SENSE"), makeKeyword("POS"), makeKeyword("REQUIRED-PATTERN"),
                cons(list(makeKeyword("AND"), makeKeyword("FORT"), list(makeKeyword("TEST"), makeSymbol("INFERENCE-SOME-SPEC-PRED-OR-INVERSE?")), list(makeKeyword("NOT"), list(makeKeyword("TEST"), makeSymbol("INFERENCE-SYMMETRIC-PREDICATE?")))), makeKeyword("ANYTHING")), makeKeyword("REQUIRED"),
                makeSymbol("TRANS-PREDICATE-GENLINVERSE-POS-REQUIRED"), makeKeyword("COST"), makeSymbol("TRANS-PREDICATE-GENLINVERSE-POS-COST"), makeKeyword("RULE-SELECT"), makeSymbol("TRANS-PREDICATE-GENLINVERSE-POS-RULE-SELECT"), makeKeyword("RULE-FILTER"),
                makeSymbol("TRANS-PREDICATE-GENLINVERSE-POS-RULE-FILTER"), makeKeyword("EXPAND"), makeSymbol("TRANS-PREDICATE-GENLINVERSE-POS-EXPAND"), makeKeyword("DOCUMENTATION"),
                makeString("(<predicate> . <whatever>)\nwhere <predicate> is a FORT with some spec-preds\nfrom a rule concluding to a spec-pred of <predicate>\nusing the predicate rule indexing in the KB"), makeKeyword("EXAMPLE"),
                makeString("(#$awareOfExistenceOf #$MarvinMinsky ?WHO)\nfrom (#$genlInverse #$studentOf #$awareOfExistenceOf)\nand a rule concluding to #$studentOf") });
        $TRANS_PREDICATE_GENLINVERSE_NEG = makeKeyword("TRANS-PREDICATE-GENLINVERSE-NEG");
        $list58 = list(new SubLObject[] { makeKeyword("SENSE"), makeKeyword("NEG"), makeKeyword("REQUIRED-PATTERN"),
                cons(list(makeKeyword("AND"), makeKeyword("FORT"), list(makeKeyword("TEST"), makeSymbol("INFERENCE-SOME-GENL-PRED-OR-INVERSE?")), list(makeKeyword("NOT"), list(makeKeyword("TEST"), makeSymbol("INFERENCE-SYMMETRIC-PREDICATE?")))), makeKeyword("ANYTHING")), makeKeyword("REQUIRED"),
                makeSymbol("TRANS-PREDICATE-GENLINVERSE-NEG-REQUIRED"), makeKeyword("COST"), makeSymbol("TRANS-PREDICATE-GENLINVERSE-NEG-COST"), makeKeyword("RULE-SELECT"), makeSymbol("TRANS-PREDICATE-GENLINVERSE-NEG-RULE-SELECT"), makeKeyword("RULE-FILTER"),
                makeSymbol("TRANS-PREDICATE-GENLINVERSE-NEG-RULE-FILTER"), makeKeyword("EXPAND"), makeSymbol("TRANS-PREDICATE-GENLINVERSE-NEG-EXPAND"), makeKeyword("DOCUMENTATION"),
                makeString("(#$not (<predicate> . <whatever>))\nwhere <predicate> is a FORT with some genl-preds\nfrom a rule concluding from a genl-pred of <predicate>\nusing the predicate rule indexing in the KB"), makeKeyword("EXAMPLE"),
                makeString("(#$not (#$studentOf #$MarvinMinsky ?WHO))\nfrom (#$genlInverse #$studentOf #$awareOfExistenceOf)\nand a rule concluding from #$awareOfExistenceOf") });
        $sym59$INFERENCE_PROPER_GENL_INVERSE_ = makeSymbol("INFERENCE-PROPER-GENL-INVERSE?");
        $TRANS_PREDICATE_NEGATIONPREDS_NEG = makeKeyword("TRANS-PREDICATE-NEGATIONPREDS-NEG");
        $list61 = ConsesLow.list(new SubLObject[] { makeKeyword("SENSE"), makeKeyword("NEG"), makeKeyword("REQUIRED-PATTERN"), cons(list(makeKeyword("AND"), makeKeyword("FORT"), list(makeKeyword("TEST"), makeSymbol("INFERENCE-SOME-NEGATION-PRED-OR-INVERSE?"))), makeKeyword("ANYTHING")),
                makeKeyword("REQUIRED"), makeSymbol("TRANS-PREDICATE-NEGATIONPREDS-NEG-REQUIRED"), makeKeyword("COST"), makeSymbol("TRANS-PREDICATE-NEGATIONPREDS-NEG-COST"), makeKeyword("RULE-SELECT"), makeSymbol("TRANS-PREDICATE-NEGATIONPREDS-NEG-RULE-SELECT"), makeKeyword("RULE-FILTER"),
                makeSymbol("TRANS-PREDICATE-NEGATIONPREDS-NEG-RULE-FILTER"), makeKeyword("EXPAND"), makeSymbol("TRANS-PREDICATE-NEGATIONPREDS-NEG-EXPAND"), makeKeyword("DOCUMENTATION"),
                makeString("(#$not (<predicate> . <whatever>))\nwhere <predicate> is a FORT with some negationPreds,\neither asserted or inferrable via genlPreds,\nfrom a rule concluding to a negationPred of <predicate>\nusing the predicate rule indexing in the KB"), makeKeyword("EXAMPLE"),
                makeString("(#$not (#$likesAsFriend #$AbrahamLincoln ?WHO))\nfrom (#$negationPreds #$likesAsFriend #$hates)\nand a rule concluding to #$hates") });
        $TRANS_PREDICATE_SYMMETRY_POS = makeKeyword("TRANS-PREDICATE-SYMMETRY-POS");
        $list63 = list(new SubLObject[] { makeKeyword("SENSE"), makeKeyword("POS"), makeKeyword("REQUIRED-PATTERN"),
                list(makeKeyword("AND"), list(makeKeyword("FORT"), makeKeyword("ANYTHING"), makeKeyword("ANYTHING")), cons(list(makeKeyword("TEST"), makeSymbol("INFERENCE-SYMMETRIC-PREDICATE?")), makeKeyword("ANYTHING"))), makeKeyword("COST"), makeSymbol("TRANS-PREDICATE-SYMMETRY-POS-COST"),
                makeKeyword("RULE-SELECT"), makeSymbol("TRANS-PREDICATE-SYMMETRY-POS-RULE-SELECT"), makeKeyword("RULE-FILTER"), makeSymbol("TRANS-PREDICATE-SYMMETRY-POS-RULE-FILTER"), makeKeyword("EXPAND"), makeSymbol("TRANS-PREDICATE-SYMMETRY-POS-EXPAND"), makeKeyword("DOCUMENTATION"),
                makeString("(<predicate> <whatever> <whatever>)\nwhere <predicate> is a FORT\nand (#$isa <predicate> #$SymmetricBinaryPredicate)\nfrom a rule concluding to <predicate>\nusing the predicate rule indexing in the KB"), makeKeyword("EXAMPLE"),
                makeString("(#$bordersOn #$Canada ?WHAT)\nfrom (#$isa #$bordersOn #$SymmetricBinaryPredicate)\nand a rule concluding to #$bordersOn") });
        $TRANS_PREDICATE_SYMMETRY_NEG = makeKeyword("TRANS-PREDICATE-SYMMETRY-NEG");
        $list65 = list(new SubLObject[] { makeKeyword("SENSE"), makeKeyword("NEG"), makeKeyword("REQUIRED-PATTERN"),
                list(makeKeyword("AND"), list(makeKeyword("FORT"), makeKeyword("ANYTHING"), makeKeyword("ANYTHING")), cons(list(makeKeyword("TEST"), makeSymbol("INFERENCE-SYMMETRIC-PREDICATE?")), makeKeyword("ANYTHING"))), makeKeyword("COST"), makeSymbol("TRANS-PREDICATE-SYMMETRY-NEG-COST"),
                makeKeyword("RULE-SELECT"), makeSymbol("TRANS-PREDICATE-SYMMETRY-NEG-RULE-SELECT"), makeKeyword("RULE-FILTER"), makeSymbol("TRANS-PREDICATE-SYMMETRY-NEG-RULE-FILTER"), makeKeyword("EXPAND"), makeSymbol("TRANS-PREDICATE-SYMMETRY-NEG-EXPAND"), makeKeyword("DOCUMENTATION"),
                makeString("(#$not (<predicate> <whatever> <whatever>))\nwhere <predicate> is a FORT\nand (#$isa <predicate> #$SymmetricBinaryPredicate)\nfrom a rule concluding from <predicate>\nusing the predicate rule indexing in the KB"), makeKeyword("EXAMPLE"),
                makeString("(#$not (#$bordersOn #$Canada ?WHAT))\nfrom (#$isa #$bordersOn #$SymmetricBinaryPredicate)\nand a rule concluding from #$bordersOn") });
        $TRANS_PREDICATE_COMMUTATIVE_POS = makeKeyword("TRANS-PREDICATE-COMMUTATIVE-POS");
        $list67 = list(new SubLObject[] { makeKeyword("SENSE"), makeKeyword("POS"), makeKeyword("REQUIRED-PATTERN"),
                list(makeKeyword("AND"), listS(makeKeyword("FORT"), makeKeyword("ANYTHING"), makeKeyword("ANYTHING"), makeKeyword("ANYTHING"), makeKeyword("ANYTHING")), cons(list(makeKeyword("TEST"), makeSymbol("INFERENCE-COMMUTATIVE-PREDICATE-P")), makeKeyword("ANYTHING"))), makeKeyword("COST"),
                makeSymbol("TRANS-PREDICATE-COMMUTATIVE-POS-COST"), makeKeyword("RULE-SELECT"), makeSymbol("TRANS-PREDICATE-COMMUTATIVE-POS-RULE-SELECT"), makeKeyword("RULE-FILTER"), makeSymbol("TRANS-PREDICATE-COMMUTATIVE-POS-RULE-FILTER"), makeKeyword("EXPAND"),
                makeSymbol("TRANS-PREDICATE-COMMUTATIVE-POS-EXPAND"), makeKeyword("DOCUMENTATION"),
                makeString("(<predicate> . <args>)\nwhere <predicate> is a FORT\nthere are at least 3 args in <args>\nand (#$isa <predicate> #$CommutativePredicate)\nfrom a rule concluding to <predicate>\nusing the predicate rule indexing in the KB"), makeKeyword("EXAMPLE"),
                makeString("(#$collinear <point A> <point B> <point C>)\nfrom (#$isa #$collinear #$CommutativePredicate)\nand a rule concluding to #$collinear") });
        $TRANS_PREDICATE_COMMUTATIVE_NEG = makeKeyword("TRANS-PREDICATE-COMMUTATIVE-NEG");
        $list69 = list(new SubLObject[] { makeKeyword("SENSE"), makeKeyword("NEG"), makeKeyword("REQUIRED-PATTERN"),
                list(makeKeyword("AND"), listS(makeKeyword("FORT"), makeKeyword("ANYTHING"), makeKeyword("ANYTHING"), makeKeyword("ANYTHING"), makeKeyword("ANYTHING")), cons(list(makeKeyword("TEST"), makeSymbol("INFERENCE-COMMUTATIVE-PREDICATE-P")), makeKeyword("ANYTHING"))), makeKeyword("COST"),
                makeSymbol("TRANS-PREDICATE-COMMUTATIVE-NEG-COST"), makeKeyword("RULE-SELECT"), makeSymbol("TRANS-PREDICATE-COMMUTATIVE-NEG-RULE-SELECT"), makeKeyword("RULE-FILTER"), makeSymbol("TRANS-PREDICATE-COMMUTATIVE-NEG-RULE-FILTER"), makeKeyword("EXPAND"),
                makeSymbol("TRANS-PREDICATE-COMMUTATIVE-NEG-EXPAND"), makeKeyword("DOCUMENTATION"),
                makeString("(#$not (<predicate> . <args>))\nwhere <predicate> is a FORT\nthere are at least 3 args in <args>\nand (#$isa <predicate> #$CommutativePredicate)\nfrom a rule concluding from <predicate>\nusing the predicate rule indexing in the KB"), makeKeyword("EXAMPLE"),
                makeString("(#$not (#$collinear <point A> <point B> <point C>))\nfrom (#$isa #$collinear #$CommutativePredicate)\nand a rule concluding from #$collinear") });
        $TRANS_PREDICATE_PARTIALLY_COMMUTATIVE_POS = makeKeyword("TRANS-PREDICATE-PARTIALLY-COMMUTATIVE-POS");
        $list71 = ConsesLow.list(new SubLObject[] { makeKeyword("SENSE"), makeKeyword("POS"), makeKeyword("REQUIRED-PATTERN"),
                list(makeKeyword("AND"), listS(makeKeyword("FORT"), makeKeyword("ANYTHING"), makeKeyword("ANYTHING"), makeKeyword("ANYTHING"), makeKeyword("ANYTHING")), cons(list(makeKeyword("TEST"), makeSymbol("INFERENCE-PARTIALLY-COMMUTATIVE-PREDICATE-P")), makeKeyword("ANYTHING"))),
                makeKeyword("COST"), makeSymbol("TRANS-PREDICATE-PARTIALLY-COMMUTATIVE-POS-COST"), makeKeyword("RULE-SELECT"), makeSymbol("TRANS-PREDICATE-PARTIALLY-COMMUTATIVE-POS-RULE-SELECT"), makeKeyword("RULE-FILTER"), makeSymbol("TRANS-PREDICATE-PARTIALLY-COMMUTATIVE-POS-RULE-FILTER"),
                makeKeyword("EXPAND"), makeSymbol("TRANS-PREDICATE-PARTIALLY-COMMUTATIVE-POS-EXPAND"), makeKeyword("DOCUMENTATION"),
                makeString("(<predicate> <whatever> <whatever>)\nwhere <predicate> is a FORT\nand (#$isa <predicate> #$PartiallyCommutativePredicate)\nfrom a rule concluding to <predicate>\nusing the predicate rule indexing in the KB"), makeKeyword("EXAMPLE"),
                makeString("(distanceBetween PlanetEarth Sun ((Mega Mile) 93))\nfrom (#$isa #$distanceBetween #$PartiallyCommutativePredicate)\nand  (#$commutativeInArgs #$distanceBetween 1 2)\nand a rule concluding to #$distanceBetween") });
        $TRANS_PREDICATE_PARTIALLY_COMMUTATIVE_NEG = makeKeyword("TRANS-PREDICATE-PARTIALLY-COMMUTATIVE-NEG");
        $list73 = ConsesLow.list(new SubLObject[] { makeKeyword("SENSE"), makeKeyword("NEG"), makeKeyword("REQUIRED-PATTERN"),
                list(makeKeyword("AND"), listS(makeKeyword("FORT"), makeKeyword("ANYTHING"), makeKeyword("ANYTHING"), makeKeyword("ANYTHING"), makeKeyword("ANYTHING")), cons(list(makeKeyword("TEST"), makeSymbol("INFERENCE-PARTIALLY-COMMUTATIVE-PREDICATE-P")), makeKeyword("ANYTHING"))),
                makeKeyword("COST"), makeSymbol("TRANS-PREDICATE-PARTIALLY-COMMUTATIVE-NEG-COST"), makeKeyword("RULE-SELECT"), makeSymbol("TRANS-PREDICATE-PARTIALLY-COMMUTATIVE-NEG-RULE-SELECT"), makeKeyword("RULE-FILTER"), makeSymbol("TRANS-PREDICATE-PARTIALLY-COMMUTATIVE-NEG-RULE-FILTER"),
                makeKeyword("EXPAND"), makeSymbol("TRANS-PREDICATE-PARTIALLY-COMMUTATIVE-NEG-EXPAND"), makeKeyword("DOCUMENTATION"),
                makeString("(#$not (<predicate> <whatever> <whatever>))\nwhere <predicate> is a FORT\nand (#$isa <predicate> #$PartiallyCommutativePredicate)\nfrom a rule concluding from <predicate>\nusing the predicate rule indexing in the KB"), makeKeyword("EXAMPLE"),
                makeString("(not (distanceBetween PlanetEarth Sun (Inch 93)))\nfrom (#$isa #$distanceBetween #$PartiallyCommutativePredicate)\nand  (#$commutativeInArgs #$distanceBetween 1 2)\nand a rule concluding from #$distanceBetween") });
        $TRANS_PREDICATE_ASYMMETRY = makeKeyword("TRANS-PREDICATE-ASYMMETRY");
        $list75 = list(new SubLObject[] { makeKeyword("SENSE"), makeKeyword("NEG"), makeKeyword("REQUIRED-PATTERN"),
                list(makeKeyword("AND"), list(makeKeyword("FORT"), makeKeyword("ANYTHING"), makeKeyword("ANYTHING")), cons(list(makeKeyword("TEST"), makeSymbol("INFERENCE-ASYMMETRIC-PREDICATE?")), makeKeyword("ANYTHING"))), makeKeyword("COST"), makeSymbol("TRANS-PREDICATE-ASYMMETRY-COST"),
                makeKeyword("RULE-SELECT"), makeSymbol("TRANS-PREDICATE-ASYMMETRY-RULE-SELECT"), makeKeyword("RULE-FILTER"), makeSymbol("TRANS-PREDICATE-ASYMMETRY-RULE-FILTER"), makeKeyword("EXPAND"), makeSymbol("TRANS-PREDICATE-ASYMMETRY-EXPAND"), makeKeyword("DOCUMENTATION"),
                makeString("(#$not (<predicate> <whatever> <whatever>))\nwhere <predicate> is a FORT\nand (#$isa <predicate> #$AsymmetricBinaryPredicate)\nfrom a rule concluding to <predicate>\nusing the predicate rule indexing in the KB"), makeKeyword("EXAMPLE"),
                makeString("(#$not (#$northOf ?WHAT #$Canada))\nfrom (#$isa #$northOf #$AsymmetricBinaryPredicate)\nand a rule concluding to #$northOf") });
        $list76 = list(makeKeyword("TRANS-UNBOUND-PREDICATE-POS"), makeKeyword("TRANS-UNBOUND-PREDICATE-NEG"));
        $TRANS_UNBOUND_PREDICATE_POS = makeKeyword("TRANS-UNBOUND-PREDICATE-POS");
        $list78 = list(new SubLObject[] { makeKeyword("SENSE"), makeKeyword("POS"), makeKeyword("REQUIRED"), makeSymbol("TRANS-UNBOUND-PREDICATE-POS-REQUIRED"), makeKeyword("COST"), makeSymbol("TRANS-UNBOUND-PREDICATE-POS-COST"), makeKeyword("RULE-SELECT"),
                makeSymbol("TRANS-UNBOUND-PREDICATE-POS-RULE-SELECT"), makeKeyword("RULE-FILTER"), makeSymbol("TRANS-UNBOUND-PREDICATE-POS-RULE-FILTER"), makeKeyword("EXPAND"), makeSymbol("TRANS-UNBOUND-PREDICATE-POS-EXPAND"), makeKeyword("DOCUMENTATION"),
                makeString("(<whatever> . <whatever>)\nfrom a rule concluding to a sentence with a variable as the predicate\nusing the unbound predicate rule indexing in the KB"), makeKeyword("EXAMPLE"),
                makeString("(#$implies\n      (#$and (#$isa ?ORDER #$MathematicalOrdering) (#$baseSet ?ORDER ?SET)\n       (#$orderingRelations ?ORDER ?PRED) (#$elementOf ?X ?SET)\n       (#$elementOf ?Y ?SET) (?PRED ?X ?Y) (#$elementOf ?Z ?SET)\n       (?PRED ?Y ?Z))\n      (?PRED ?X ?Z))") });
        $TRANS_UNBOUND_PREDICATE_NEG = makeKeyword("TRANS-UNBOUND-PREDICATE-NEG");
        $list80 = list(new SubLObject[] { makeKeyword("SENSE"), makeKeyword("NEG"), makeKeyword("REQUIRED"), makeSymbol("TRANS-UNBOUND-PREDICATE-NEG-REQUIRED"), makeKeyword("COST"), makeSymbol("TRANS-UNBOUND-PREDICATE-NEG-COST"), makeKeyword("RULE-SELECT"),
                makeSymbol("TRANS-UNBOUND-PREDICATE-NEG-RULE-SELECT"), makeKeyword("RULE-FILTER"), makeSymbol("TRANS-UNBOUND-PREDICATE-NEG-RULE-FILTER"), makeKeyword("EXPAND"), makeSymbol("TRANS-UNBOUND-PREDICATE-NEG-EXPAND"), makeKeyword("DOCUMENTATION"),
                makeString("(#$not (<whatever> . <whatever>))\nfrom a rule concluding from a sentence with a variable as the predicate\nusing the unbound predicate rule indexing in the KB"), makeKeyword("EXAMPLE"), makeString("no current example") });
        $sym81$TRANS_UNBOUND_PREDICATE_RULE_SELECT = makeSymbol("TRANS-UNBOUND-PREDICATE-RULE-SELECT");
        $list82 = list(makeKeyword("TRANS-ISA-POS"), makeKeyword("TRANS-ISA-NEG"), makeKeyword("TRANS-GENLS-POS"), makeKeyword("TRANS-GENLS-NEG"), makeKeyword("TRANS-GENL-MT-POS"), makeKeyword("TRANS-GENL-MT-NEG"));
        $sym83$INFERENCE_MEMOIZED_ALL_SPECS = makeSymbol("INFERENCE-MEMOIZED-ALL-SPECS");
        $sym84$TRANS_ISA_POS_RULE_SELECT_COUNT = makeSymbol("TRANS-ISA-POS-RULE-SELECT-COUNT");
        $$isa = makeConstSym(("isa"));
        $TRANS_ISA_POS = makeKeyword("TRANS-ISA-POS");
        $list87 = list(new SubLObject[] { makeKeyword("SENSE"), makeKeyword("POS"), makeKeyword("PREDICATE"), makeConstSym(("isa")), makeKeyword("REQUIRED-PATTERN"), list(makeConstSym(("isa")), makeKeyword("ANYTHING"), makeKeyword("FORT")), makeKeyword("REQUIRED"),
                makeSymbol("TRANS-ISA-POS-REQUIRED"), makeKeyword("COST"), makeSymbol("TRANS-ISA-POS-COST"), makeKeyword("RULE-SELECT"), makeSymbol("TRANS-ISA-POS-RULE-SELECT"), makeKeyword("RULE-FILTER"), makeSymbol("TRANS-ISA-POS-RULE-FILTER"), makeKeyword("EXPAND"),
                makeSymbol("TRANS-ISA-POS-EXPAND"), makeKeyword("DOCUMENTATION"), makeString("(#$isa <whatever> <collection>)\nwhere <collection> is a FORT\nfrom a rule concluding to a spec of <collection>\nusing the isa rule indexing in the KB"), makeKeyword("EXAMPLE"),
                makeString("(#$isa #$AbrahamLincoln #$FamousPerson)\nfrom (#$genls #$UnitedStatesPresident #$FamousPerson)\nand a rule concluding to #$isa #$UnitedStatesPresident") });
        $TRANS_ISA_NEG = makeKeyword("TRANS-ISA-NEG");
        $list89 = list(new SubLObject[] { makeKeyword("SENSE"), makeKeyword("NEG"), makeKeyword("PREDICATE"), makeConstSym(("isa")), makeKeyword("REQUIRED-PATTERN"), list(makeConstSym(("isa")), makeKeyword("ANYTHING"), makeKeyword("FORT")), makeKeyword("REQUIRED"),
                makeSymbol("TRANS-ISA-NEG-REQUIRED"), makeKeyword("COST"), makeSymbol("TRANS-ISA-NEG-COST"), makeKeyword("RULE-SELECT"), makeSymbol("TRANS-ISA-NEG-RULE-SELECT"), makeKeyword("RULE-FILTER"), makeSymbol("TRANS-ISA-NEG-RULE-FILTER"), makeKeyword("EXPAND"),
                makeSymbol("TRANS-ISA-NEG-EXPAND"), makeKeyword("DOCUMENTATION"), makeString("(#$not (#$isa <whatever> <collection>))\nwhere <collection> is a FORT\nfrom a rule concluding from a genl of <collection>\nusing the isa rule indexing in the KB"), makeKeyword("EXAMPLE"),
                makeString("(#$not (#$isa #$AbrahamLincoln #$FrenchPerson))\nfrom (#$genls #$FrenchPerson #$EuropeanPerson)\nand a rule concluding from #$isa #$EuropeanPerson") });
        $TRANS_GENLS_POS = makeKeyword("TRANS-GENLS-POS");
        $list91 = list(new SubLObject[] { makeKeyword("SENSE"), makeKeyword("POS"), makeKeyword("PREDICATE"), makeConstSym(("genls")), makeKeyword("REQUIRED-PATTERN"), list(makeConstSym(("genls")), makeKeyword("ANYTHING"), makeKeyword("FORT")), makeKeyword("REQUIRED"),
                makeSymbol("TRANS-GENLS-POS-REQUIRED"), makeKeyword("COST"), makeSymbol("TRANS-GENLS-POS-COST"), makeKeyword("RULE-SELECT"), makeSymbol("TRANS-GENLS-POS-RULE-SELECT"), makeKeyword("RULE-FILTER"), makeSymbol("TRANS-GENLS-POS-RULE-FILTER"), makeKeyword("EXPAND"),
                makeSymbol("TRANS-GENLS-POS-EXPAND"), makeKeyword("DOCUMENTATION"), makeString("(#$genls <whatever> <collection>)\nwhere <collection> is a FORT\nfrom a rule concluding to a spec of <collection>\nusing the genls rule indexing in the KB"), makeKeyword("EXAMPLE"),
                makeString("(#$genls #$UnitedStatesPresident #$FamousPerson)\nfrom (#$genls #$WorldLeader #$FamousPerson)\nand a rule concluding to (#$genls ?X #$WorldLeader)") });
        $TRANS_GENLS_NEG = makeKeyword("TRANS-GENLS-NEG");
        $list93 = list(new SubLObject[] { makeKeyword("SENSE"), makeKeyword("NEG"), makeKeyword("PREDICATE"), makeConstSym(("genls")), makeKeyword("REQUIRED-PATTERN"), list(makeConstSym(("genls")), makeKeyword("ANYTHING"), makeKeyword("FORT")), makeKeyword("REQUIRED"),
                makeSymbol("TRANS-GENLS-NEG-REQUIRED"), makeKeyword("COST"), makeSymbol("TRANS-GENLS-NEG-COST"), makeKeyword("RULE-SELECT"), makeSymbol("TRANS-GENLS-NEG-RULE-SELECT"), makeKeyword("RULE-FILTER"), makeSymbol("TRANS-GENLS-NEG-RULE-FILTER"), makeKeyword("EXPAND"),
                makeSymbol("TRANS-GENLS-NEG-EXPAND"), makeKeyword("DOCUMENTATION"), makeString("(#$not (#$genls <whatever> <collection>))\nwhere <collection> is a FORT\nfrom a rule concluding from a genl of <collection>\nusing the genls rule indexing in the KB"), makeKeyword("EXAMPLE"),
                makeString("(#$not (#$genls #$UnitedStatesPresident #$FrenchPerson))\nfrom (#$genls #$FrenchPerson #$EuropeanPerson)\nand a rule concluding from (#$genls ?X #$EuropeanPerson)") });
        $sym94$INFERENCE_MEMOIZED_ALL_SPEC_MTS = makeSymbol("INFERENCE-MEMOIZED-ALL-SPEC-MTS");
        $TRANS_GENL_MT_POS = makeKeyword("TRANS-GENL-MT-POS");
        $list96 = list(new SubLObject[] { makeKeyword("SENSE"), makeKeyword("POS"), makeKeyword("PREDICATE"), makeConstSym(("genlMt")), makeKeyword("REQUIRED-PATTERN"), list(makeConstSym(("genlMt")), makeKeyword("ANYTHING"), list(makeKeyword("TEST"), makeSymbol("HLMT-P"))), makeKeyword("REQUIRED"),
                makeSymbol("TRANS-GENL-MT-POS-REQUIRED"), makeKeyword("COST"), makeSymbol("TRANS-GENL-MT-POS-COST"), makeKeyword("RULE-SELECT"), makeSymbol("TRANS-GENL-MT-POS-RULE-SELECT"), makeKeyword("RULE-FILTER"), makeSymbol("TRANS-GENL-MT-POS-RULE-FILTER"), makeKeyword("EXPAND"),
                makeSymbol("TRANS-GENL-MT-POS-EXPAND"), makeKeyword("DOCUMENTATION"), makeString("(#$genlMt <whatever> <microtheory>)\nwhere <microtheory> is a FORT\nfrom a rule concluding to a spec of <microtheory>\nusing the genlMt rule indexing in the KB"), makeKeyword("EXAMPLE"),
                makeString("(#$genlMt #$UnitedStatesPresidentsMt #$FamousPeopleMt)\nfrom (#$genlMt #$WorldLeadersMt #$FamousPeopleMt)\nand a rule concluding to (#$genlMt ?X #$WorldLeadersMt)") });
        $TRANS_GENL_MT_NEG = makeKeyword("TRANS-GENL-MT-NEG");
        $list98 = list(new SubLObject[] { makeKeyword("SENSE"), makeKeyword("NEG"), makeKeyword("PREDICATE"), makeConstSym(("genlMt")), makeKeyword("REQUIRED-PATTERN"), list(makeConstSym(("genlMt")), makeKeyword("ANYTHING"), list(makeKeyword("TEST"), makeSymbol("HLMT-P"))), makeKeyword("REQUIRED"),
                makeSymbol("TRANS-GENL-MT-NEG-REQUIRED"), makeKeyword("COST"), makeSymbol("TRANS-GENL-MT-NEG-COST"), makeKeyword("RULE-SELECT"), makeSymbol("TRANS-GENL-MT-NEG-RULE-SELECT"), makeKeyword("RULE-FILTER"), makeSymbol("TRANS-GENL-MT-NEG-RULE-FILTER"), makeKeyword("EXPAND"),
                makeSymbol("TRANS-GENL-MT-NEG-EXPAND"), makeKeyword("DOCUMENTATION"), makeString("(#$not (#$genlMt <whatever> <microtheory>))\nwhere <microtheory> is a FORT\nfrom a rule concluding from a genl of <microtheory>\nusing the genlMt rule indexing in the KB"), makeKeyword("EXAMPLE"),
                makeString("(#$not (#$genlMt #$UnitedStatesPresidentsMt #$FrenchPeopleMt))\nfrom (#$genlMt #$FrenchPeopleMt #$EuropeanPeopleMt)\nand a rule concluding from (#$genlMt ?X #$EuropeanPeopleMt)") });
        $$abnormal = makeConstSym(("abnormal"));
        $TRANS_ABNORMAL = makeKeyword("TRANS-ABNORMAL");
        $list101 = list(new SubLObject[] { makeKeyword("SENSE"), makeKeyword("POS"), makeKeyword("PREDICATE"), makeConstSym(("abnormal")), makeKeyword("REQUIRED-PATTERN"), list(makeConstSym(("abnormal")), makeKeyword("ANYTHING"), makeKeyword("ASSERTION")), makeKeyword("EXCLUSIVE"),
                makeSymbol("TRUE"), makeKeyword("COST"), makeSymbol("TRANS-ABNORMAL-COST"), makeKeyword("RULE-SELECT"), makeSymbol("TRANS-ABNORMAL-RULE-SELECT"), makeKeyword("RULE-FILTER"), makeSymbol("TRANS-ABNORMAL-RULE-FILTER"), makeKeyword("EXPAND"), makeSymbol("TRANS-ABNORMAL-EXPAND") });
        $list102 = list(makeConstSym(("implies")), list(makeConstSym(("and")), list(makeConstSym(("isa")), makeSymbol("?OBJ"), makeSymbol("?SUBSET")), list(makeConstSym(("genls")), makeSymbol("?SUBSET"), makeSymbol("?SUPERSET"))),
                list(makeConstSym(("isa")), makeSymbol("?OBJ"), makeSymbol("?SUPERSET")));
        $TRANSFORMATION_ABDUCTION_TO_SPECS = makeKeyword("TRANSFORMATION-ABDUCTION-TO-SPECS");
        $list104 = list(new SubLObject[] { makeKeyword("SENSE"), makeKeyword("POS"), makeKeyword("ARITY"), TWO_INTEGER, makeKeyword("PREDICATE"), makeConstSym(("isa")), makeKeyword("REQUIRED-PATTERN"), list(makeConstSym(("isa")), makeKeyword("FORT"), makeKeyword("FULLY-BOUND")),
                makeKeyword("REQUIRED"), makeSymbol("TRANSFORMATION-ABDUCTION-TO-SPECS-REQUIRED"), makeKeyword("COST-EXPRESSION"), makeSymbol("*DEFAULT-ABDUCTION-COST*"), makeKeyword("RULE-SELECT"), makeSymbol("TRANSFORMATION-ABDUCTION-TO-SPECS-RULE-SELECT"), makeKeyword("RULE-FILTER"),
                makeSymbol("TRANSFORMATION-ABDUCTION-TO-SPECS-RULE-FILTER"), makeKeyword("EXPAND"), makeSymbol("TRANSFORMATION-ABDUCTION-TO-SPECS-EXPAND"), makeKeyword("DOCUMENTATION"),
                makeString("(#$isa <fort> <fully-bound>)\n   where the asent is deemed abducible, and the problem store allows abduction,\n   using #$genls rules."), makeKeyword("EXAMPLE"), makeString("(#$isa #$GeorgeWBush #$Parent)") });
    }

    public static class $trans_predicate_pos_required$UnaryFunction extends UnaryFunction {
        public $trans_predicate_pos_required$UnaryFunction() {
            super(SubLTranslatedFile.extractFunctionNamed("TRANS-PREDICATE-POS-REQUIRED"));
        }

        @Override
        public SubLObject processItem(SubLObject arg1) {
            return trans_predicate_pos_required(arg1);
        }
    }

    public static class $trans_predicate_pos_cost$UnaryFunction extends UnaryFunction {
        public $trans_predicate_pos_cost$UnaryFunction() {
            super(SubLTranslatedFile.extractFunctionNamed("TRANS-PREDICATE-POS-COST"));
        }

        @Override
        public SubLObject processItem(SubLObject arg1) {
            return trans_predicate_pos_cost(arg1);
        }
    }

    public static class $trans_predicate_pos_rule_select$UnaryFunction extends UnaryFunction {
        public $trans_predicate_pos_rule_select$UnaryFunction() {
            super(SubLTranslatedFile.extractFunctionNamed("TRANS-PREDICATE-POS-RULE-SELECT"));
        }

        @Override
        public SubLObject processItem(SubLObject arg1) {
            return trans_predicate_pos_rule_select(arg1);
        }
    }

    public static class $trans_predicate_pos_rule_filter$BinaryFunction extends BinaryFunction {
        public $trans_predicate_pos_rule_filter$BinaryFunction() {
            super(SubLTranslatedFile.extractFunctionNamed("TRANS-PREDICATE-POS-RULE-FILTER"));
        }

        @Override
        public SubLObject processItem(SubLObject arg1, SubLObject arg2) {
            return trans_predicate_pos_rule_filter(arg1, arg2);
        }
    }

    public static class $trans_predicate_pos_expand$BinaryFunction extends BinaryFunction {
        public $trans_predicate_pos_expand$BinaryFunction() {
            super(SubLTranslatedFile.extractFunctionNamed("TRANS-PREDICATE-POS-EXPAND"));
        }

        @Override
        public SubLObject processItem(SubLObject arg1, SubLObject arg2) {
            return trans_predicate_pos_expand(arg1, arg2);
        }
    }

    public static class $trans_predicate_genlpreds_pos_required$UnaryFunction extends UnaryFunction {
        public $trans_predicate_genlpreds_pos_required$UnaryFunction() {
            super(SubLTranslatedFile.extractFunctionNamed("TRANS-PREDICATE-GENLPREDS-POS-REQUIRED"));
        }

        @Override
        public SubLObject processItem(SubLObject arg1) {
            return trans_predicate_genlpreds_pos_required(arg1);
        }
    }

    public static class $trans_predicate_genlpreds_pos_cost$UnaryFunction extends UnaryFunction {
        public $trans_predicate_genlpreds_pos_cost$UnaryFunction() {
            super(SubLTranslatedFile.extractFunctionNamed("TRANS-PREDICATE-GENLPREDS-POS-COST"));
        }

        @Override
        public SubLObject processItem(SubLObject arg1) {
            return trans_predicate_genlpreds_pos_cost(arg1);
        }
    }

    public static class $trans_predicate_genlpreds_pos_rule_select$UnaryFunction extends UnaryFunction {
        public $trans_predicate_genlpreds_pos_rule_select$UnaryFunction() {
            super(SubLTranslatedFile.extractFunctionNamed("TRANS-PREDICATE-GENLPREDS-POS-RULE-SELECT"));
        }

        @Override
        public SubLObject processItem(SubLObject arg1) {
            return trans_predicate_genlpreds_pos_rule_select(arg1);
        }
    }

    public static class $trans_predicate_symmetry_pos_cost$UnaryFunction extends UnaryFunction {
        public $trans_predicate_symmetry_pos_cost$UnaryFunction() {
            super(SubLTranslatedFile.extractFunctionNamed("TRANS-PREDICATE-SYMMETRY-POS-COST"));
        }

        @Override
        public SubLObject processItem(SubLObject arg1) {
            return trans_predicate_symmetry_pos_cost(arg1);
        }
    }

    public static class $trans_predicate_symmetry_pos_rule_select$UnaryFunction extends UnaryFunction {
        public $trans_predicate_symmetry_pos_rule_select$UnaryFunction() {
            super(SubLTranslatedFile.extractFunctionNamed("TRANS-PREDICATE-SYMMETRY-POS-RULE-SELECT"));
        }

        @Override
        public SubLObject processItem(SubLObject arg1) {
            return trans_predicate_symmetry_pos_rule_select(arg1);
        }
    }

    public static class $trans_predicate_symmetry_pos_rule_filter$BinaryFunction extends BinaryFunction {
        public $trans_predicate_symmetry_pos_rule_filter$BinaryFunction() {
            super(SubLTranslatedFile.extractFunctionNamed("TRANS-PREDICATE-SYMMETRY-POS-RULE-FILTER"));
        }

        @Override
        public SubLObject processItem(SubLObject arg1, SubLObject arg2) {
            return trans_predicate_symmetry_pos_rule_filter(arg1, arg2);
        }
    }

    public static class $trans_predicate_symmetry_pos_expand$BinaryFunction extends BinaryFunction {
        public $trans_predicate_symmetry_pos_expand$BinaryFunction() {
            super(SubLTranslatedFile.extractFunctionNamed("TRANS-PREDICATE-SYMMETRY-POS-EXPAND"));
        }

        @Override
        public SubLObject processItem(SubLObject arg1, SubLObject arg2) {
            return trans_predicate_symmetry_pos_expand(arg1, arg2);
        }
    }

    public static class $trans_unbound_predicate_pos_required$UnaryFunction extends UnaryFunction {
        public $trans_unbound_predicate_pos_required$UnaryFunction() {
            super(SubLTranslatedFile.extractFunctionNamed("TRANS-UNBOUND-PREDICATE-POS-REQUIRED"));
        }

        @Override
        public SubLObject processItem(SubLObject arg1) {
            return trans_unbound_predicate_pos_required(arg1);
        }
    }

    public static class $trans_unbound_predicate_pos_cost$UnaryFunction extends UnaryFunction {
        public $trans_unbound_predicate_pos_cost$UnaryFunction() {
            super(SubLTranslatedFile.extractFunctionNamed("TRANS-UNBOUND-PREDICATE-POS-COST"));
        }

        @Override
        public SubLObject processItem(SubLObject arg1) {
            return trans_unbound_predicate_pos_cost(arg1);
        }
    }
}
/*
 *
 * Total time: 878 ms
 *
 */