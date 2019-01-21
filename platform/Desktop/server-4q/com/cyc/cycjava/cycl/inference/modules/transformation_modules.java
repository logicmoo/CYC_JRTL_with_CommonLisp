package com.cyc.cycjava.cycl.inference.modules;

import com.cyc.tool.subl.jrtl.nativeCode.subLisp.BinaryFunction;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.UnaryFunction;
import com.cyc.cycjava.cycl.constant_handles;
import com.cyc.tool.subl.util.SubLFiles;
import com.cyc.cycjava.cycl.fi;
import com.cyc.cycjava.cycl.inference.harness.inference_abduction_utilities;
import com.cyc.cycjava.cycl.inference.harness.inference_datastructures_problem_store;
import com.cyc.cycjava.cycl.genl_mts;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Sequences;
import com.cyc.cycjava.cycl.genls;
import com.cyc.cycjava.cycl.cardinality_estimates;
import com.cyc.cycjava.cycl.auxiliary_indexing;
import com.cyc.cycjava.cycl.subl_promotions;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Numbers;
import com.cyc.cycjava.cycl.negation_predicate;
import com.cyc.cycjava.cycl.genl_predicates;
import com.cyc.cycjava.cycl.fort_types_interface;
import com.cyc.cycjava.cycl.forts;
import com.cyc.cycjava.cycl.backward;
import com.cyc.cycjava.cycl.unification_utilities;
import com.cyc.cycjava.cycl.el_utilities;
import com.cyc.cycjava.cycl.inference.harness.inference_czer;
import com.cyc.cycjava.cycl.mt_relevance_macros;
import com.cyc.cycjava.cycl.unification;
import com.cyc.cycjava.cycl.clauses;
import com.cyc.cycjava.cycl.assertions_high;
import com.cyc.cycjava.cycl.memoization_state;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Values;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Dynamic;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Threads;
import com.cyc.cycjava.cycl.iteration;
import com.cyc.cycjava.cycl.kb_mapping_macros;
import com.cyc.cycjava.cycl.backward_utilities;
import com.cyc.cycjava.cycl.kb_indexing;
import com.cyc.cycjava.cycl.cycl_utilities;
import com.cyc.cycjava.cycl.variables;
import com.cyc.cycjava.cycl.control_vars;
import com.cyc.cycjava.cycl.inference.harness.inference_strategic_heuristics;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Sort;
import com.cyc.cycjava.cycl.inference.harness.inference_macros;
import com.cyc.cycjava.cycl.set_contents;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Symbols;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.conses_high;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.reader;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.cdestructuring_bind;
import com.cyc.cycjava.cycl.inference.harness.inference_worker;
import com.cyc.cycjava.cycl.inference.harness.inference_worker_transformation;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory;
import com.cyc.cycjava.cycl.inference.harness.inference_modules;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.SubLThread;
import com.cyc.cycjava.cycl.kb_mapping_utilities;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLProcess;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Errors;
import com.cyc.cycjava.cycl.inference.modules.removal.removal_modules_symmetry;
import com.cyc.cycjava.cycl.inference.inference_trampolines;
import com.cyc.cycjava.cycl.inference.harness.removal_module_utilities;
import com.cyc.cycjava.cycl.mt_vars;
import com.cyc.cycjava.cycl.arguments;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLList;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLString;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObject;
import com.cyc.tool.subl.jrtl.nativeCode.type.symbol.SubLSymbol;
import com.cyc.tool.subl.util.SubLFile;
import com.cyc.tool.subl.util.SubLTranslatedFile;

public final class transformation_modules extends SubLTranslatedFile
{
    public static final SubLFile me;
    public static final String myName = "com.cyc.cycjava.cycl.inference.modules.transformation_modules";
    public static final String myFingerPrint = "6cdbc780222527aee65b4e0c356e56314a6a9b5f4bee5deda7317f9e658c8315";
    @SubLTranslatedFile.SubL(source = "cycl/inference/modules/transformation-modules.lisp", position = 3580L)
    private static SubLSymbol $transformation_gaf_truth_known_disabled$;
    @SubLTranslatedFile.SubL(source = "cycl/inference/modules/transformation-modules.lisp", position = 42861L)
    private static SubLSymbol $unbound_predicate_transformation_required_modules$;
    @SubLTranslatedFile.SubL(source = "cycl/inference/modules/transformation-modules.lisp", position = 48010L)
    private static SubLSymbol $hl_predicate_transformation_required_modules$;
    @SubLTranslatedFile.SubL(source = "cycl/inference/modules/transformation-modules.lisp", position = 69397L)
    private static SubLSymbol $genls_definitional_sentence$;
    @SubLTranslatedFile.SubL(source = "cycl/inference/modules/transformation-modules.lisp", position = 69564L)
    private static SubLSymbol $genls_definitional_rules$;
    private static final SubLObject $const0$genls;
    private static final SubLSymbol $kw1$GENLS;
    private static final SubLObject $const2$genlMt;
    private static final SubLSymbol $kw3$GENLMT;
    private static final SubLObject $const4$genlPreds;
    private static final SubLSymbol $kw5$GENLPREDS;
    private static final SubLObject $const6$genlInverse;
    private static final SubLObject $const7$negationPreds;
    private static final SubLSymbol $kw8$NEGATIONPREDS;
    private static final SubLObject $const9$AsymmetricBinaryPredicate;
    private static final SubLObject $const10$SymmetricBinaryPredicate;
    private static final SubLObject $const11$CommutativePredicate;
    private static final SubLObject $const12$PartiallyCommutativePredicate;
    private static final SubLString $str13$Unexpected_commutative_predicate_;
    private static final SubLSymbol $kw14$NEG;
    private static final SubLList $list15;
    private static final SubLSymbol $sym16$DO_LIST;
    private static final SubLList $list17;
    private static final SubLList $list18;
    private static final SubLList $list19;
    private static final SubLSymbol $kw20$ALLOW_OTHER_KEYS;
    private static final SubLSymbol $kw21$PREDICATE;
    private static final SubLSymbol $sym22$PREDICATE_VAR;
    private static final SubLSymbol $sym23$CLET;
    private static final SubLSymbol $sym24$DO_TRANSFORMATION_RULE_LITERALS;
    private static final SubLSymbol $sym25$PWHEN;
    private static final SubLSymbol $sym26$ATOMIC_SENTENCE_PREDICATE;
    private static final SubLSymbol $sym27$RULE_VAR;
    private static final SubLSymbol $sym28$RULE_RELEVANT_TO_PROOF;
    private static final SubLSymbol $sym29$DO_ASSERTION_LITERALS;
    private static final SubLSymbol $kw30$SENSE;
    private static final SubLList $list31;
    private static final SubLSymbol $sym32$DIRECTION_VAR;
    private static final SubLSymbol $sym33$SENSE_VAR;
    private static final SubLSymbol $sym34$PREDICATE_VAR;
    private static final SubLSymbol $sym35$DO_TRANSFORMATION_RELEVANT_DIRECTIONS;
    private static final SubLSymbol $sym36$DO_PREDICATE_RULE_INDEX;
    private static final SubLSymbol $kw37$DIRECTION;
    private static final SubLSymbol $sym38$CURRENT_INFERENCE_RULE_PREFERENCE__;
    private static final SubLSymbol $sym39$TRANSFORMATION_RULE_UTILITY__;
    private static final SubLSymbol $kw40$POS;
    private static final SubLSymbol $kw41$TRANS_PREDICATE_POS;
    private static final SubLList $list42;
    private static final SubLSymbol $kw43$TRANS_PREDICATE_NEG;
    private static final SubLList $list44;
    private static final SubLSymbol $sym45$TRANS_PREDICATE_RULE_SELECT_INT;
    private static final SubLSymbol $kw46$RULE;
    private static final SubLString $str47$Invalid_sense__s;
    private static final SubLSymbol $sym48$TRANS_PREDICATE_GENLPREDS_POS_RULE_SELECT_INT;
    private static final SubLSymbol $kw49$TRANS_PREDICATE_GENLPREDS_POS;
    private static final SubLList $list50;
    private static final SubLSymbol $kw51$TRANS_PREDICATE_GENLPREDS_NEG;
    private static final SubLList $list52;
    private static final SubLSymbol $sym53$INFERENCE_PROPER_GENL_PREDICATE_;
    private static final SubLSymbol $sym54$TRANS_PREDICATE_GENLINVERSE_POS_RULE_SELECT_INT;
    private static final SubLSymbol $kw55$TRANS_PREDICATE_GENLINVERSE_POS;
    private static final SubLList $list56;
    private static final SubLSymbol $kw57$TRANS_PREDICATE_GENLINVERSE_NEG;
    private static final SubLList $list58;
    private static final SubLSymbol $sym59$INFERENCE_PROPER_GENL_INVERSE_;
    private static final SubLSymbol $kw60$TRANS_PREDICATE_NEGATIONPREDS_NEG;
    private static final SubLList $list61;
    private static final SubLSymbol $kw62$TRANS_PREDICATE_SYMMETRY_POS;
    private static final SubLList $list63;
    private static final SubLSymbol $kw64$TRANS_PREDICATE_SYMMETRY_NEG;
    private static final SubLList $list65;
    private static final SubLSymbol $kw66$TRANS_PREDICATE_COMMUTATIVE_POS;
    private static final SubLList $list67;
    private static final SubLSymbol $kw68$TRANS_PREDICATE_COMMUTATIVE_NEG;
    private static final SubLList $list69;
    private static final SubLSymbol $kw70$TRANS_PREDICATE_PARTIALLY_COMMUTATIVE_POS;
    private static final SubLList $list71;
    private static final SubLSymbol $kw72$TRANS_PREDICATE_PARTIALLY_COMMUTATIVE_NEG;
    private static final SubLList $list73;
    private static final SubLSymbol $kw74$TRANS_PREDICATE_ASYMMETRY;
    private static final SubLList $list75;
    private static final SubLList $list76;
    private static final SubLSymbol $kw77$TRANS_UNBOUND_PREDICATE_POS;
    private static final SubLList $list78;
    private static final SubLSymbol $kw79$TRANS_UNBOUND_PREDICATE_NEG;
    private static final SubLList $list80;
    private static final SubLSymbol $sym81$TRANS_UNBOUND_PREDICATE_RULE_SELECT;
    private static final SubLList $list82;
    private static final SubLSymbol $sym83$INFERENCE_MEMOIZED_ALL_SPECS;
    private static final SubLSymbol $sym84$TRANS_ISA_POS_RULE_SELECT_COUNT;
    private static final SubLObject $const85$isa;
    private static final SubLSymbol $kw86$TRANS_ISA_POS;
    private static final SubLList $list87;
    private static final SubLSymbol $kw88$TRANS_ISA_NEG;
    private static final SubLList $list89;
    private static final SubLSymbol $kw90$TRANS_GENLS_POS;
    private static final SubLList $list91;
    private static final SubLSymbol $kw92$TRANS_GENLS_NEG;
    private static final SubLList $list93;
    private static final SubLSymbol $sym94$INFERENCE_MEMOIZED_ALL_SPEC_MTS;
    private static final SubLSymbol $kw95$TRANS_GENL_MT_POS;
    private static final SubLList $list96;
    private static final SubLSymbol $kw97$TRANS_GENL_MT_NEG;
    private static final SubLList $list98;
    private static final SubLObject $const99$abnormal;
    private static final SubLSymbol $kw100$TRANS_ABNORMAL;
    private static final SubLList $list101;
    private static final SubLList $list102;
    private static final SubLSymbol $kw103$TRANSFORMATION_ABDUCTION_TO_SPECS;
    private static final SubLList $list104;
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/modules/transformation-modules.lisp", position = 1166L)
    public static SubLObject additional_genls_supports(final SubLObject spec, final SubLObject genl) {
        if (!spec.eql(genl)) {
            final SubLObject hl_formula = (SubLObject)ConsesLow.list(transformation_modules.$const0$genls, spec, genl);
            final SubLObject hl_support = arguments.make_hl_support((SubLObject)transformation_modules.$kw1$GENLS, hl_formula, (SubLObject)transformation_modules.UNPROVIDED, (SubLObject)transformation_modules.UNPROVIDED);
            final SubLObject additional_supports = (SubLObject)ConsesLow.list(hl_support);
            return additional_supports;
        }
        return (SubLObject)transformation_modules.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/modules/transformation-modules.lisp", position = 1630L)
    public static SubLObject additional_genl_mt_supports(final SubLObject spec_mt, final SubLObject genl_mt) {
        if (!spec_mt.eql(genl_mt)) {
            final SubLObject hl_formula = (SubLObject)ConsesLow.list(transformation_modules.$const2$genlMt, spec_mt, genl_mt);
            final SubLObject hl_support = arguments.make_hl_support((SubLObject)transformation_modules.$kw3$GENLMT, hl_formula, mt_vars.$mt_mt$.getGlobalValue(), (SubLObject)transformation_modules.UNPROVIDED);
            final SubLObject additional_supports = (SubLObject)ConsesLow.list(hl_support);
            return additional_supports;
        }
        return (SubLObject)transformation_modules.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/modules/transformation-modules.lisp", position = 1969L)
    public static SubLObject additional_genlpreds_supports(final SubLObject spec_pred, final SubLObject genl_pred) {
        if (!spec_pred.eql(genl_pred)) {
            final SubLObject hl_formula = (SubLObject)ConsesLow.list(transformation_modules.$const4$genlPreds, spec_pred, genl_pred);
            final SubLObject hl_support = arguments.make_hl_support((SubLObject)transformation_modules.$kw5$GENLPREDS, hl_formula, (SubLObject)transformation_modules.UNPROVIDED, (SubLObject)transformation_modules.UNPROVIDED);
            final SubLObject additional_supports = (SubLObject)ConsesLow.list(hl_support);
            return additional_supports;
        }
        return (SubLObject)transformation_modules.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/modules/transformation-modules.lisp", position = 2273L)
    public static SubLObject additional_genlinverse_supports(final SubLObject spec_pred, final SubLObject genl_inverse) {
        if (!spec_pred.eql(genl_inverse)) {
            final SubLObject hl_formula = (SubLObject)ConsesLow.list(transformation_modules.$const6$genlInverse, spec_pred, genl_inverse);
            final SubLObject hl_support = arguments.make_hl_support((SubLObject)transformation_modules.$kw5$GENLPREDS, hl_formula, (SubLObject)transformation_modules.UNPROVIDED, (SubLObject)transformation_modules.UNPROVIDED);
            final SubLObject additional_supports = (SubLObject)ConsesLow.list(hl_support);
            return additional_supports;
        }
        return (SubLObject)transformation_modules.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/modules/transformation-modules.lisp", position = 2590L)
    public static SubLObject additional_negationpreds_supports(final SubLObject pred, final SubLObject negation_pred) {
        final SubLObject hl_formula = (SubLObject)ConsesLow.list(transformation_modules.$const7$negationPreds, pred, negation_pred);
        final SubLObject hl_support = arguments.make_hl_support((SubLObject)transformation_modules.$kw8$NEGATIONPREDS, hl_formula, (SubLObject)transformation_modules.UNPROVIDED, (SubLObject)transformation_modules.UNPROVIDED);
        final SubLObject additional_supports = (SubLObject)ConsesLow.list(hl_support);
        return additional_supports;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/modules/transformation-modules.lisp", position = 2858L)
    public static SubLObject additional_asymmetry_supports(final SubLObject predicate) {
        return removal_module_utilities.additional_isa_supports(predicate, transformation_modules.$const9$AsymmetricBinaryPredicate);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/modules/transformation-modules.lisp", position = 2990L)
    public static SubLObject additional_predicate_commutativity_supports(final SubLObject predicate) {
        if (transformation_modules.NIL != inference_trampolines.inference_symmetric_predicateP(predicate)) {
            return removal_module_utilities.additional_isa_supports(predicate, transformation_modules.$const10$SymmetricBinaryPredicate);
        }
        if (transformation_modules.NIL != inference_trampolines.inference_commutative_predicate_p(predicate)) {
            return removal_module_utilities.additional_isa_supports(predicate, transformation_modules.$const11$CommutativePredicate);
        }
        if (transformation_modules.NIL != inference_trampolines.inference_partially_commutative_predicate_p(predicate)) {
            return ConsesLow.append(removal_module_utilities.additional_isa_supports(predicate, transformation_modules.$const12$PartiallyCommutativePredicate), removal_modules_symmetry.commutative_in_args_supports(predicate));
        }
        Errors.error((SubLObject)transformation_modules.$str13$Unexpected_commutative_predicate_, predicate);
        return (SubLObject)transformation_modules.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/modules/transformation-modules.lisp", position = 3757L)
    public static SubLObject transformation_gaf_truth_known(final SubLObject gaf) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        if (transformation_modules.NIL == transformation_modules.$transformation_gaf_truth_known_disabled$.getDynamicValue(thread)) {
            return kb_mapping_utilities.gaf_truth_known(gaf);
        }
        return (SubLObject)transformation_modules.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/modules/transformation-modules.lisp", position = 3910L)
    public static SubLObject modus_tollens_transformation_module_p(final SubLObject v_object) {
        return (SubLObject)SubLObjectFactory.makeBoolean(transformation_modules.NIL != inference_modules.transformation_module_p(v_object) && transformation_modules.$kw14$NEG.eql(inference_modules.hl_module_sense(v_object)));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/modules/transformation-modules.lisp", position = 4065L)
    public static SubLObject modus_tollens_transformation_proof_p(final SubLObject v_object) {
        return (SubLObject)SubLObjectFactory.makeBoolean(transformation_modules.NIL != inference_worker_transformation.transformation_proof_p(v_object) && transformation_modules.NIL != modus_tollens_transformation_module_p(inference_worker.content_proof_hl_module(v_object)));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/modules/transformation-modules.lisp", position = 4264L)
    public static SubLObject do_transformation_relevant_directions(final SubLObject macroform, final SubLObject environment) {
        SubLObject current;
        final SubLObject datum = current = macroform.rest();
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)transformation_modules.$list15);
        final SubLObject temp = current.rest();
        current = current.first();
        SubLObject direction_var = (SubLObject)transformation_modules.NIL;
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)transformation_modules.$list15);
        direction_var = current.first();
        current = current.rest();
        if (transformation_modules.NIL == current) {
            final SubLObject body;
            current = (body = temp);
            return (SubLObject)ConsesLow.listS((SubLObject)transformation_modules.$sym16$DO_LIST, reader.bq_cons(direction_var, (SubLObject)transformation_modules.$list17), ConsesLow.append(body, (SubLObject)transformation_modules.NIL));
        }
        cdestructuring_bind.cdestructuring_bind_error(datum, (SubLObject)transformation_modules.$list15);
        return (SubLObject)transformation_modules.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/modules/transformation-modules.lisp", position = 4459L)
    public static SubLObject do_transformation_rule_literals(final SubLObject macroform, final SubLObject environment) {
        SubLObject current;
        final SubLObject datum = current = macroform.rest();
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)transformation_modules.$list18);
        final SubLObject temp = current.rest();
        current = current.first();
        SubLObject rule_asent_var = (SubLObject)transformation_modules.NIL;
        SubLObject rule = (SubLObject)transformation_modules.NIL;
        SubLObject sense = (SubLObject)transformation_modules.NIL;
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)transformation_modules.$list18);
        rule_asent_var = current.first();
        current = current.rest();
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)transformation_modules.$list18);
        rule = current.first();
        current = current.rest();
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)transformation_modules.$list18);
        sense = current.first();
        current = current.rest();
        SubLObject allow_other_keys_p = (SubLObject)transformation_modules.NIL;
        SubLObject rest = current;
        SubLObject bad = (SubLObject)transformation_modules.NIL;
        SubLObject current_$1 = (SubLObject)transformation_modules.NIL;
        while (transformation_modules.NIL != rest) {
            cdestructuring_bind.destructuring_bind_must_consp(rest, datum, (SubLObject)transformation_modules.$list18);
            current_$1 = rest.first();
            rest = rest.rest();
            cdestructuring_bind.destructuring_bind_must_consp(rest, datum, (SubLObject)transformation_modules.$list18);
            if (transformation_modules.NIL == conses_high.member(current_$1, (SubLObject)transformation_modules.$list19, (SubLObject)transformation_modules.UNPROVIDED, (SubLObject)transformation_modules.UNPROVIDED)) {
                bad = (SubLObject)transformation_modules.T;
            }
            if (current_$1 == transformation_modules.$kw20$ALLOW_OTHER_KEYS) {
                allow_other_keys_p = rest.first();
            }
            rest = rest.rest();
        }
        if (transformation_modules.NIL != bad && transformation_modules.NIL == allow_other_keys_p) {
            cdestructuring_bind.cdestructuring_bind_error(datum, (SubLObject)transformation_modules.$list18);
        }
        final SubLObject predicate_tail = cdestructuring_bind.property_list_member((SubLObject)transformation_modules.$kw21$PREDICATE, current);
        final SubLObject predicate = (SubLObject)((transformation_modules.NIL != predicate_tail) ? conses_high.cadr(predicate_tail) : transformation_modules.NIL);
        final SubLObject body;
        current = (body = temp);
        if (transformation_modules.NIL != predicate) {
            final SubLObject predicate_var = (SubLObject)transformation_modules.$sym22$PREDICATE_VAR;
            return (SubLObject)ConsesLow.list((SubLObject)transformation_modules.$sym23$CLET, (SubLObject)ConsesLow.list((SubLObject)ConsesLow.list(predicate_var, predicate)), (SubLObject)ConsesLow.list((SubLObject)transformation_modules.$sym24$DO_TRANSFORMATION_RULE_LITERALS, (SubLObject)ConsesLow.list(rule_asent_var, rule, sense), (SubLObject)ConsesLow.listS((SubLObject)transformation_modules.$sym25$PWHEN, (SubLObject)ConsesLow.list((SubLObject)transformation_modules.EQL, predicate_var, (SubLObject)ConsesLow.list((SubLObject)transformation_modules.$sym26$ATOMIC_SENTENCE_PREDICATE, rule_asent_var)), ConsesLow.append(body, (SubLObject)transformation_modules.NIL))));
        }
        final SubLObject rule_var = (SubLObject)transformation_modules.$sym27$RULE_VAR;
        return (SubLObject)ConsesLow.list((SubLObject)transformation_modules.$sym23$CLET, (SubLObject)ConsesLow.list((SubLObject)ConsesLow.list(rule_var, rule)), (SubLObject)ConsesLow.list((SubLObject)transformation_modules.$sym25$PWHEN, (SubLObject)ConsesLow.list((SubLObject)transformation_modules.$sym28$RULE_RELEVANT_TO_PROOF, rule_var), (SubLObject)ConsesLow.listS((SubLObject)transformation_modules.$sym29$DO_ASSERTION_LITERALS, (SubLObject)ConsesLow.list(rule_asent_var, rule_var, (SubLObject)transformation_modules.$kw30$SENSE, sense, (SubLObject)transformation_modules.$kw21$PREDICATE, predicate), ConsesLow.append(body, (SubLObject)transformation_modules.NIL))));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/modules/transformation-modules.lisp", position = 5080L)
    public static SubLObject do_transformation_predicate_rule_index(final SubLObject macroform, final SubLObject environment) {
        SubLObject current;
        final SubLObject datum = current = macroform.rest();
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)transformation_modules.$list31);
        final SubLObject temp = current.rest();
        current = current.first();
        SubLObject rule_asent_var = (SubLObject)transformation_modules.NIL;
        SubLObject rule_var = (SubLObject)transformation_modules.NIL;
        SubLObject predicate = (SubLObject)transformation_modules.NIL;
        SubLObject sense = (SubLObject)transformation_modules.NIL;
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)transformation_modules.$list31);
        rule_asent_var = current.first();
        current = current.rest();
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)transformation_modules.$list31);
        rule_var = current.first();
        current = current.rest();
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)transformation_modules.$list31);
        predicate = current.first();
        current = current.rest();
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)transformation_modules.$list31);
        sense = current.first();
        current = current.rest();
        if (transformation_modules.NIL == current) {
            final SubLObject body;
            current = (body = temp);
            final SubLObject direction_var = (SubLObject)transformation_modules.$sym32$DIRECTION_VAR;
            final SubLObject sense_var = (SubLObject)transformation_modules.$sym33$SENSE_VAR;
            final SubLObject predicate_var = (SubLObject)transformation_modules.$sym34$PREDICATE_VAR;
            return (SubLObject)ConsesLow.list((SubLObject)transformation_modules.$sym23$CLET, (SubLObject)ConsesLow.list((SubLObject)ConsesLow.list(sense_var, sense), (SubLObject)ConsesLow.list(predicate_var, predicate)), (SubLObject)ConsesLow.list((SubLObject)transformation_modules.$sym35$DO_TRANSFORMATION_RELEVANT_DIRECTIONS, (SubLObject)ConsesLow.list(direction_var), (SubLObject)ConsesLow.list((SubLObject)transformation_modules.$sym36$DO_PREDICATE_RULE_INDEX, (SubLObject)ConsesLow.list(rule_var, predicate_var, (SubLObject)transformation_modules.$kw30$SENSE, sense_var, (SubLObject)transformation_modules.$kw37$DIRECTION, direction_var), (SubLObject)ConsesLow.listS((SubLObject)transformation_modules.$sym24$DO_TRANSFORMATION_RULE_LITERALS, (SubLObject)ConsesLow.list(rule_asent_var, rule_var, sense_var, (SubLObject)transformation_modules.$kw21$PREDICATE, predicate_var), ConsesLow.append(body, (SubLObject)transformation_modules.NIL)))));
        }
        cdestructuring_bind.cdestructuring_bind_error(datum, (SubLObject)transformation_modules.$list31);
        return (SubLObject)transformation_modules.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/modules/transformation-modules.lisp", position = 5602L)
    public static SubLObject new_selected_rules() {
        return set_contents.new_set_contents((SubLObject)transformation_modules.ZERO_INTEGER, Symbols.symbol_function((SubLObject)transformation_modules.EQL));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/modules/transformation-modules.lisp", position = 5732L)
    public static SubLObject add_selected_rule(final SubLObject rule, final SubLObject selected_rules) {
        return set_contents.set_contents_add(rule, selected_rules, Symbols.symbol_function((SubLObject)transformation_modules.EQL));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/modules/transformation-modules.lisp", position = 5843L)
    public static SubLObject finalize_selected_rules(final SubLObject selected_rules) {
        final SubLObject rules = set_contents.set_contents_element_list(selected_rules);
        return sort_rules_via_current_inference_rule_preference(rules);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/modules/transformation-modules.lisp", position = 6031L)
    public static SubLObject sort_rules_via_current_inference_rule_preference(final SubLObject rules) {
        if (transformation_modules.NIL != inference_macros.current_controlling_inference()) {
            return Sort.sort(rules, (SubLObject)transformation_modules.$sym38$CURRENT_INFERENCE_RULE_PREFERENCE__, (SubLObject)transformation_modules.UNPROVIDED);
        }
        return Sort.sort(rules, (SubLObject)transformation_modules.$sym39$TRANSFORMATION_RULE_UTILITY__, (SubLObject)transformation_modules.UNPROVIDED);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/modules/transformation-modules.lisp", position = 6268L)
    public static SubLObject current_inference_rule_preference_G(final SubLObject rule1, final SubLObject rule2) {
        return inference_strategic_heuristics.inference_rule_preference_G(inference_macros.current_controlling_inference(), rule1, rule2);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/modules/transformation-modules.lisp", position = 6418L)
    public static SubLObject trans_predicate_pos_required(final SubLObject asent) {
        return trans_predicate_required(asent);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/modules/transformation-modules.lisp", position = 6773L)
    public static SubLObject trans_predicate_neg_required(final SubLObject asent) {
        return trans_predicate_required(asent);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/modules/transformation-modules.lisp", position = 6869L)
    public static SubLObject trans_predicate_pos_cost(final SubLObject asent) {
        return trans_predicate_cost(asent, (SubLObject)transformation_modules.$kw40$POS);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/modules/transformation-modules.lisp", position = 6963L)
    public static SubLObject trans_predicate_neg_cost(final SubLObject asent) {
        return trans_predicate_cost(asent, (SubLObject)transformation_modules.$kw14$NEG);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/modules/transformation-modules.lisp", position = 7056L)
    public static SubLObject trans_predicate_pos_rule_select(final SubLObject asent) {
        return trans_predicate_rule_select(asent, (SubLObject)transformation_modules.$kw40$POS);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/modules/transformation-modules.lisp", position = 7164L)
    public static SubLObject trans_predicate_neg_rule_select(final SubLObject asent) {
        return trans_predicate_rule_select(asent, (SubLObject)transformation_modules.$kw14$NEG);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/modules/transformation-modules.lisp", position = 7271L)
    public static SubLObject trans_predicate_pos_rule_filter(final SubLObject asent, final SubLObject rule) {
        return trans_predicate_rule_filter(asent, (SubLObject)transformation_modules.$kw40$POS, rule);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/modules/transformation-modules.lisp", position = 7389L)
    public static SubLObject trans_predicate_neg_rule_filter(final SubLObject asent, final SubLObject rule) {
        return trans_predicate_rule_filter(asent, (SubLObject)transformation_modules.$kw14$NEG, rule);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/modules/transformation-modules.lisp", position = 7506L)
    public static SubLObject trans_predicate_pos_expand(final SubLObject asent, final SubLObject rule) {
        return trans_predicate_expand(asent, (SubLObject)transformation_modules.$kw40$POS, rule);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/modules/transformation-modules.lisp", position = 7614L)
    public static SubLObject trans_predicate_neg_expand(final SubLObject asent, final SubLObject rule) {
        return trans_predicate_expand(asent, (SubLObject)transformation_modules.$kw14$NEG, rule);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/modules/transformation-modules.lisp", position = 8986L)
    public static SubLObject trans_predicate_required(final SubLObject asent) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        return (SubLObject)SubLObjectFactory.makeBoolean(transformation_modules.NIL == control_vars.$unique_inference_result_bindings$.getDynamicValue(thread) || transformation_modules.NIL == variables.fully_bound_p(asent) || transformation_modules.NIL == transformation_gaf_truth_known(asent));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/modules/transformation-modules.lisp", position = 9268L)
    public static SubLObject trans_predicate_cost(final SubLObject asent, final SubLObject sense) {
        return kb_indexing.relevant_num_predicate_rule_index(cycl_utilities.atomic_sentence_predicate(asent), sense);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/modules/transformation-modules.lisp", position = 9405L)
    public static SubLObject trans_predicate_rule_select(final SubLObject asent, final SubLObject sense) {
        return conses_high.copy_list(trans_predicate_rule_select_int(cycl_utilities.atomic_sentence_predicate(asent), sense));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/modules/transformation-modules.lisp", position = 9559L)
    public static SubLObject trans_predicate_rule_select_int_internal(final SubLObject predicate, final SubLObject sense) {
        SubLObject rules = new_selected_rules();
        SubLObject cdolist_list_var = backward_utilities.relevant_directions();
        SubLObject direction = (SubLObject)transformation_modules.NIL;
        direction = cdolist_list_var.first();
        while (transformation_modules.NIL != cdolist_list_var) {
            if (transformation_modules.NIL != kb_mapping_macros.do_predicate_rule_index_key_validator(predicate, sense, direction)) {
                final SubLObject iterator_var = kb_mapping_macros.new_predicate_rule_final_index_spec_iterator(predicate, sense, direction);
                SubLObject done_var = (SubLObject)transformation_modules.NIL;
                final SubLObject token_var = (SubLObject)transformation_modules.NIL;
                while (transformation_modules.NIL == done_var) {
                    final SubLObject final_index_spec = iteration.iteration_next_without_values_macro_helper(iterator_var, token_var);
                    final SubLObject valid = (SubLObject)SubLObjectFactory.makeBoolean(!token_var.eql(final_index_spec));
                    if (transformation_modules.NIL != valid) {
                        SubLObject final_index_iterator = (SubLObject)transformation_modules.NIL;
                        try {
                            final_index_iterator = kb_mapping_macros.new_final_index_iterator(final_index_spec, (SubLObject)transformation_modules.$kw46$RULE, (SubLObject)transformation_modules.NIL, direction);
                            SubLObject done_var_$2 = (SubLObject)transformation_modules.NIL;
                            final SubLObject token_var_$3 = (SubLObject)transformation_modules.NIL;
                            while (transformation_modules.NIL == done_var_$2) {
                                final SubLObject rule = iteration.iteration_next_without_values_macro_helper(final_index_iterator, token_var_$3);
                                final SubLObject valid_$4 = (SubLObject)SubLObjectFactory.makeBoolean(!token_var_$3.eql(rule));
                                if (transformation_modules.NIL != valid_$4) {
                                    rules = add_selected_rule(rule, rules);
                                }
                                done_var_$2 = (SubLObject)SubLObjectFactory.makeBoolean(transformation_modules.NIL == valid_$4);
                            }
                        }
                        finally {
                            final SubLObject _prev_bind_0 = Dynamic.currentBinding(Threads.$is_thread_performing_cleanupP$);
                            try {
                                Dynamic.bind(Threads.$is_thread_performing_cleanupP$, (SubLObject)transformation_modules.T);
                                final SubLObject _values = Values.getValuesAsVector();
                                if (transformation_modules.NIL != final_index_iterator) {
                                    kb_mapping_macros.destroy_final_index_iterator(final_index_iterator);
                                }
                                Values.restoreValuesFromVector(_values);
                            }
                            finally {
                                Dynamic.rebind(Threads.$is_thread_performing_cleanupP$, _prev_bind_0);
                            }
                        }
                    }
                    done_var = (SubLObject)SubLObjectFactory.makeBoolean(transformation_modules.NIL == valid);
                }
            }
            cdolist_list_var = cdolist_list_var.rest();
            direction = cdolist_list_var.first();
        }
        return finalize_selected_rules(rules);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/modules/transformation-modules.lisp", position = 9559L)
    public static SubLObject trans_predicate_rule_select_int(final SubLObject predicate, final SubLObject sense) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject v_memoization_state = memoization_state.$memoization_state$.getDynamicValue(thread);
        SubLObject caching_state = (SubLObject)transformation_modules.NIL;
        if (transformation_modules.NIL == v_memoization_state) {
            return trans_predicate_rule_select_int_internal(predicate, sense);
        }
        caching_state = memoization_state.memoization_state_lookup(v_memoization_state, (SubLObject)transformation_modules.$sym45$TRANS_PREDICATE_RULE_SELECT_INT, (SubLObject)transformation_modules.UNPROVIDED);
        if (transformation_modules.NIL == caching_state) {
            caching_state = memoization_state.create_caching_state(memoization_state.memoization_state_lock(v_memoization_state), (SubLObject)transformation_modules.$sym45$TRANS_PREDICATE_RULE_SELECT_INT, (SubLObject)transformation_modules.TWO_INTEGER, (SubLObject)transformation_modules.NIL, (SubLObject)transformation_modules.EQL, (SubLObject)transformation_modules.UNPROVIDED);
            memoization_state.memoization_state_put(v_memoization_state, (SubLObject)transformation_modules.$sym45$TRANS_PREDICATE_RULE_SELECT_INT, caching_state);
        }
        final SubLObject sxhash = memoization_state.sxhash_calc_2(predicate, sense);
        final SubLObject collisions = memoization_state.caching_state_lookup(caching_state, sxhash, (SubLObject)transformation_modules.UNPROVIDED);
        if (!collisions.eql(memoization_state.$memoized_item_not_found$.getGlobalValue())) {
            SubLObject cdolist_list_var = collisions;
            SubLObject collision = (SubLObject)transformation_modules.NIL;
            collision = cdolist_list_var.first();
            while (transformation_modules.NIL != cdolist_list_var) {
                SubLObject cached_args = collision.first();
                final SubLObject results2 = conses_high.second(collision);
                if (predicate.eql(cached_args.first())) {
                    cached_args = cached_args.rest();
                    if (transformation_modules.NIL != cached_args && transformation_modules.NIL == cached_args.rest() && sense.eql(cached_args.first())) {
                        return memoization_state.caching_results(results2);
                    }
                }
                cdolist_list_var = cdolist_list_var.rest();
                collision = cdolist_list_var.first();
            }
        }
        final SubLObject results3 = Values.arg2(thread.resetMultipleValues(), (SubLObject)Values.multiple_value_list(trans_predicate_rule_select_int_internal(predicate, sense)));
        memoization_state.caching_state_enter_multi_key_n(caching_state, sxhash, collisions, results3, (SubLObject)ConsesLow.list(predicate, sense));
        return memoization_state.caching_results(results3);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/modules/transformation-modules.lisp", position = 9928L)
    public static SubLObject trans_predicate_rule_filter(final SubLObject asent, final SubLObject sense, final SubLObject rule) {
        final SubLObject predicate_var;
        final SubLObject predicate = predicate_var = cycl_utilities.atomic_sentence_predicate(asent);
        if (transformation_modules.NIL != backward_utilities.rule_relevant_to_proof(rule)) {
            final SubLObject cnf_var = assertions_high.assertion_cnf(rule);
            if (transformation_modules.$kw40$POS == sense) {
                SubLObject cdolist_list_var = clauses.pos_lits(cnf_var);
                SubLObject examine = (SubLObject)transformation_modules.NIL;
                examine = cdolist_list_var.first();
                while (transformation_modules.NIL != cdolist_list_var) {
                    if (predicate_var.eql(cycl_utilities.atomic_sentence_predicate(examine)) && transformation_modules.NIL != unification.unify_possible(asent, examine)) {
                        return (SubLObject)transformation_modules.T;
                    }
                    cdolist_list_var = cdolist_list_var.rest();
                    examine = cdolist_list_var.first();
                }
            }
            else if (transformation_modules.$kw14$NEG == sense) {
                SubLObject cdolist_list_var = clauses.neg_lits(cnf_var);
                SubLObject examine = (SubLObject)transformation_modules.NIL;
                examine = cdolist_list_var.first();
                while (transformation_modules.NIL != cdolist_list_var) {
                    if (predicate_var.eql(cycl_utilities.atomic_sentence_predicate(examine)) && transformation_modules.NIL != unification.unify_possible(asent, examine)) {
                        return (SubLObject)transformation_modules.T;
                    }
                    cdolist_list_var = cdolist_list_var.rest();
                    examine = cdolist_list_var.first();
                }
            }
            else {
                Errors.error((SubLObject)transformation_modules.$str47$Invalid_sense__s, sense);
            }
        }
        return (SubLObject)transformation_modules.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/modules/transformation-modules.lisp", position = 10196L)
    public static SubLObject trans_predicate_expand(SubLObject asent, final SubLObject sense, final SubLObject rule) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject mt = mt_relevance_macros.$mt$.getDynamicValue(thread);
        if (transformation_modules.NIL != inference_czer.backchaining_on_ist_enabledP() && transformation_modules.NIL != el_utilities.ist_sentence_p(asent, (SubLObject)transformation_modules.UNPROVIDED) && transformation_modules.NIL != variables.fully_bound_p(el_utilities.designated_mt(asent))) {
            mt = el_utilities.designated_mt(asent);
            asent = el_utilities.designated_sentence(asent);
        }
        final SubLObject mt_var = mt_relevance_macros.with_inference_mt_relevance_validate(mt);
        final SubLObject _prev_bind_0 = mt_relevance_macros.$mt$.currentBinding(thread);
        final SubLObject _prev_bind_2 = mt_relevance_macros.$relevant_mt_function$.currentBinding(thread);
        final SubLObject _prev_bind_3 = mt_relevance_macros.$relevant_mts$.currentBinding(thread);
        try {
            mt_relevance_macros.$mt$.bind(mt_relevance_macros.update_inference_mt_relevance_mt(mt_var), thread);
            mt_relevance_macros.$relevant_mt_function$.bind(mt_relevance_macros.update_inference_mt_relevance_function(mt_var), thread);
            mt_relevance_macros.$relevant_mts$.bind(mt_relevance_macros.update_inference_mt_relevance_mt_list(mt_var), thread);
            final SubLObject predicate_var;
            final SubLObject predicate = predicate_var = cycl_utilities.atomic_sentence_predicate(asent);
            if (transformation_modules.NIL != backward_utilities.rule_relevant_to_proof(rule)) {
                final SubLObject cnf_var = assertions_high.assertion_cnf(rule);
                if (transformation_modules.$kw40$POS == sense) {
                    SubLObject cdolist_list_var = clauses.pos_lits(cnf_var);
                    SubLObject examine = (SubLObject)transformation_modules.NIL;
                    examine = cdolist_list_var.first();
                    while (transformation_modules.NIL != cdolist_list_var) {
                        if (predicate_var.eql(cycl_utilities.atomic_sentence_predicate(examine))) {
                            final SubLObject v_bindings = unification_utilities.transformation_asent_unify(asent, examine);
                            if (transformation_modules.NIL != v_bindings) {
                                backward.transformation_add_node(rule, examine, sense, v_bindings, (SubLObject)transformation_modules.UNPROVIDED);
                            }
                        }
                        cdolist_list_var = cdolist_list_var.rest();
                        examine = cdolist_list_var.first();
                    }
                }
                else if (transformation_modules.$kw14$NEG == sense) {
                    SubLObject cdolist_list_var = clauses.neg_lits(cnf_var);
                    SubLObject examine = (SubLObject)transformation_modules.NIL;
                    examine = cdolist_list_var.first();
                    while (transformation_modules.NIL != cdolist_list_var) {
                        if (predicate_var.eql(cycl_utilities.atomic_sentence_predicate(examine))) {
                            final SubLObject v_bindings = unification_utilities.transformation_asent_unify(asent, examine);
                            if (transformation_modules.NIL != v_bindings) {
                                backward.transformation_add_node(rule, examine, sense, v_bindings, (SubLObject)transformation_modules.UNPROVIDED);
                            }
                        }
                        cdolist_list_var = cdolist_list_var.rest();
                        examine = cdolist_list_var.first();
                    }
                }
                else {
                    Errors.error((SubLObject)transformation_modules.$str47$Invalid_sense__s, sense);
                }
            }
        }
        finally {
            mt_relevance_macros.$relevant_mts$.rebind(_prev_bind_3, thread);
            mt_relevance_macros.$relevant_mt_function$.rebind(_prev_bind_2, thread);
            mt_relevance_macros.$mt$.rebind(_prev_bind_0, thread);
        }
        return (SubLObject)transformation_modules.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/modules/transformation-modules.lisp", position = 10879L)
    public static SubLObject trans_predicate_genlpreds_pos_required(final SubLObject asent) {
        return trans_predicate_genlpreds_required(asent);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/modules/transformation-modules.lisp", position = 11893L)
    public static SubLObject trans_predicate_genlpreds_neg_required(final SubLObject asent) {
        return trans_predicate_genlpreds_required(asent);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/modules/transformation-modules.lisp", position = 12009L)
    public static SubLObject trans_predicate_genlpreds_pos_cost(final SubLObject asent) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject predicate = cycl_utilities.atomic_sentence_predicate(asent);
        thread.resetMultipleValues();
        final SubLObject spec_preds = inference_trampolines.inference_all_proper_spec_predicates_with_axiom_index(predicate, (SubLObject)transformation_modules.$kw40$POS);
        final SubLObject cost = thread.secondMultipleValue();
        thread.resetMultipleValues();
        return cost;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/modules/transformation-modules.lisp", position = 12288L)
    public static SubLObject trans_predicate_genlpreds_neg_cost(final SubLObject asent) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject predicate = cycl_utilities.atomic_sentence_predicate(asent);
        thread.resetMultipleValues();
        final SubLObject genl_preds = inference_trampolines.inference_all_proper_genl_predicates_with_axiom_index(predicate, (SubLObject)transformation_modules.$kw14$NEG);
        final SubLObject cost = thread.secondMultipleValue();
        thread.resetMultipleValues();
        return cost;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/modules/transformation-modules.lisp", position = 12566L)
    public static SubLObject trans_predicate_genlpreds_pos_rule_select(final SubLObject asent) {
        return conses_high.copy_list(trans_predicate_genlpreds_pos_rule_select_int(cycl_utilities.atomic_sentence_predicate(asent)));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/modules/transformation-modules.lisp", position = 12737L)
    public static SubLObject trans_predicate_genlpreds_pos_rule_select_int_internal(final SubLObject predicate) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject rules = new_selected_rules();
        SubLObject cdolist_list_var = inference_trampolines.inference_all_proper_spec_predicates_with_axiom_index(predicate, (SubLObject)transformation_modules.$kw40$POS);
        SubLObject index_pred = (SubLObject)transformation_modules.NIL;
        index_pred = cdolist_list_var.first();
        while (transformation_modules.NIL != cdolist_list_var) {
            if (transformation_modules.NIL == inference_trampolines.inference_backchain_forbiddenP(index_pred, mt_relevance_macros.$mt$.getDynamicValue(thread))) {
                SubLObject cdolist_list_var_$5 = backward_utilities.relevant_directions();
                SubLObject direction = (SubLObject)transformation_modules.NIL;
                direction = cdolist_list_var_$5.first();
                while (transformation_modules.NIL != cdolist_list_var_$5) {
                    if (transformation_modules.NIL != kb_mapping_macros.do_predicate_rule_index_key_validator(index_pred, (SubLObject)transformation_modules.$kw40$POS, direction)) {
                        final SubLObject iterator_var = kb_mapping_macros.new_predicate_rule_final_index_spec_iterator(index_pred, (SubLObject)transformation_modules.$kw40$POS, direction);
                        SubLObject done_var = (SubLObject)transformation_modules.NIL;
                        final SubLObject token_var = (SubLObject)transformation_modules.NIL;
                        while (transformation_modules.NIL == done_var) {
                            final SubLObject final_index_spec = iteration.iteration_next_without_values_macro_helper(iterator_var, token_var);
                            final SubLObject valid = (SubLObject)SubLObjectFactory.makeBoolean(!token_var.eql(final_index_spec));
                            if (transformation_modules.NIL != valid) {
                                SubLObject final_index_iterator = (SubLObject)transformation_modules.NIL;
                                try {
                                    final_index_iterator = kb_mapping_macros.new_final_index_iterator(final_index_spec, (SubLObject)transformation_modules.$kw46$RULE, (SubLObject)transformation_modules.NIL, direction);
                                    SubLObject done_var_$6 = (SubLObject)transformation_modules.NIL;
                                    final SubLObject token_var_$7 = (SubLObject)transformation_modules.NIL;
                                    while (transformation_modules.NIL == done_var_$6) {
                                        final SubLObject rule = iteration.iteration_next_without_values_macro_helper(final_index_iterator, token_var_$7);
                                        final SubLObject valid_$8 = (SubLObject)SubLObjectFactory.makeBoolean(!token_var_$7.eql(rule));
                                        if (transformation_modules.NIL != valid_$8) {
                                            rules = add_selected_rule(rule, rules);
                                        }
                                        done_var_$6 = (SubLObject)SubLObjectFactory.makeBoolean(transformation_modules.NIL == valid_$8);
                                    }
                                }
                                finally {
                                    final SubLObject _prev_bind_0 = Threads.$is_thread_performing_cleanupP$.currentBinding(thread);
                                    try {
                                        Threads.$is_thread_performing_cleanupP$.bind((SubLObject)transformation_modules.T, thread);
                                        final SubLObject _values = Values.getValuesAsVector();
                                        if (transformation_modules.NIL != final_index_iterator) {
                                            kb_mapping_macros.destroy_final_index_iterator(final_index_iterator);
                                        }
                                        Values.restoreValuesFromVector(_values);
                                    }
                                    finally {
                                        Threads.$is_thread_performing_cleanupP$.rebind(_prev_bind_0, thread);
                                    }
                                }
                            }
                            done_var = (SubLObject)SubLObjectFactory.makeBoolean(transformation_modules.NIL == valid);
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
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/modules/transformation-modules.lisp", position = 12737L)
    public static SubLObject trans_predicate_genlpreds_pos_rule_select_int(final SubLObject predicate) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject v_memoization_state = memoization_state.$memoization_state$.getDynamicValue(thread);
        SubLObject caching_state = (SubLObject)transformation_modules.NIL;
        if (transformation_modules.NIL == v_memoization_state) {
            return trans_predicate_genlpreds_pos_rule_select_int_internal(predicate);
        }
        caching_state = memoization_state.memoization_state_lookup(v_memoization_state, (SubLObject)transformation_modules.$sym48$TRANS_PREDICATE_GENLPREDS_POS_RULE_SELECT_INT, (SubLObject)transformation_modules.UNPROVIDED);
        if (transformation_modules.NIL == caching_state) {
            caching_state = memoization_state.create_caching_state(memoization_state.memoization_state_lock(v_memoization_state), (SubLObject)transformation_modules.$sym48$TRANS_PREDICATE_GENLPREDS_POS_RULE_SELECT_INT, (SubLObject)transformation_modules.ONE_INTEGER, (SubLObject)transformation_modules.NIL, (SubLObject)transformation_modules.EQL, (SubLObject)transformation_modules.UNPROVIDED);
            memoization_state.memoization_state_put(v_memoization_state, (SubLObject)transformation_modules.$sym48$TRANS_PREDICATE_GENLPREDS_POS_RULE_SELECT_INT, caching_state);
        }
        SubLObject results = memoization_state.caching_state_lookup(caching_state, predicate, memoization_state.$memoized_item_not_found$.getGlobalValue());
        if (results.eql(memoization_state.$memoized_item_not_found$.getGlobalValue())) {
            results = Values.arg2(thread.resetMultipleValues(), (SubLObject)Values.multiple_value_list(trans_predicate_genlpreds_pos_rule_select_int_internal(predicate)));
            memoization_state.caching_state_put(caching_state, predicate, results, (SubLObject)transformation_modules.UNPROVIDED);
        }
        return memoization_state.caching_results(results);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/modules/transformation-modules.lisp", position = 13275L)
    public static SubLObject trans_predicate_genlpreds_neg_rule_select(final SubLObject asent) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject predicate = cycl_utilities.atomic_sentence_predicate(asent);
        SubLObject rules = new_selected_rules();
        SubLObject cdolist_list_var = inference_trampolines.inference_all_proper_genl_predicates_with_axiom_index(predicate, (SubLObject)transformation_modules.$kw14$NEG);
        SubLObject index_pred = (SubLObject)transformation_modules.NIL;
        index_pred = cdolist_list_var.first();
        while (transformation_modules.NIL != cdolist_list_var) {
            if (transformation_modules.NIL == inference_trampolines.inference_backchain_forbiddenP(index_pred, mt_relevance_macros.$mt$.getDynamicValue(thread))) {
                SubLObject cdolist_list_var_$9 = backward_utilities.relevant_directions();
                SubLObject direction = (SubLObject)transformation_modules.NIL;
                direction = cdolist_list_var_$9.first();
                while (transformation_modules.NIL != cdolist_list_var_$9) {
                    if (transformation_modules.NIL != kb_mapping_macros.do_predicate_rule_index_key_validator(index_pred, (SubLObject)transformation_modules.$kw14$NEG, direction)) {
                        final SubLObject iterator_var = kb_mapping_macros.new_predicate_rule_final_index_spec_iterator(index_pred, (SubLObject)transformation_modules.$kw14$NEG, direction);
                        SubLObject done_var = (SubLObject)transformation_modules.NIL;
                        final SubLObject token_var = (SubLObject)transformation_modules.NIL;
                        while (transformation_modules.NIL == done_var) {
                            final SubLObject final_index_spec = iteration.iteration_next_without_values_macro_helper(iterator_var, token_var);
                            final SubLObject valid = (SubLObject)SubLObjectFactory.makeBoolean(!token_var.eql(final_index_spec));
                            if (transformation_modules.NIL != valid) {
                                SubLObject final_index_iterator = (SubLObject)transformation_modules.NIL;
                                try {
                                    final_index_iterator = kb_mapping_macros.new_final_index_iterator(final_index_spec, (SubLObject)transformation_modules.$kw46$RULE, (SubLObject)transformation_modules.NIL, direction);
                                    SubLObject done_var_$10 = (SubLObject)transformation_modules.NIL;
                                    final SubLObject token_var_$11 = (SubLObject)transformation_modules.NIL;
                                    while (transformation_modules.NIL == done_var_$10) {
                                        final SubLObject rule = iteration.iteration_next_without_values_macro_helper(final_index_iterator, token_var_$11);
                                        final SubLObject valid_$12 = (SubLObject)SubLObjectFactory.makeBoolean(!token_var_$11.eql(rule));
                                        if (transformation_modules.NIL != valid_$12) {
                                            rules = add_selected_rule(rule, rules);
                                        }
                                        done_var_$10 = (SubLObject)SubLObjectFactory.makeBoolean(transformation_modules.NIL == valid_$12);
                                    }
                                }
                                finally {
                                    final SubLObject _prev_bind_0 = Threads.$is_thread_performing_cleanupP$.currentBinding(thread);
                                    try {
                                        Threads.$is_thread_performing_cleanupP$.bind((SubLObject)transformation_modules.T, thread);
                                        final SubLObject _values = Values.getValuesAsVector();
                                        if (transformation_modules.NIL != final_index_iterator) {
                                            kb_mapping_macros.destroy_final_index_iterator(final_index_iterator);
                                        }
                                        Values.restoreValuesFromVector(_values);
                                    }
                                    finally {
                                        Threads.$is_thread_performing_cleanupP$.rebind(_prev_bind_0, thread);
                                    }
                                }
                            }
                            done_var = (SubLObject)SubLObjectFactory.makeBoolean(transformation_modules.NIL == valid);
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
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/modules/transformation-modules.lisp", position = 13823L)
    public static SubLObject trans_predicate_genlpreds_pos_expand_int(final SubLObject asent, final SubLObject rule) {
        final SubLObject predicate = cycl_utilities.atomic_sentence_predicate(asent);
        if (transformation_modules.NIL != backward_utilities.rule_relevant_to_proof(rule)) {
            final SubLObject cnf_var = assertions_high.assertion_cnf(rule);
            SubLObject cdolist_list_var = clauses.pos_lits(cnf_var);
            SubLObject examine = (SubLObject)transformation_modules.NIL;
            examine = cdolist_list_var.first();
            while (transformation_modules.NIL != cdolist_list_var) {
                final SubLObject index_pred = cycl_utilities.atomic_sentence_predicate(examine);
                if (transformation_modules.NIL != inference_proper_genl_predicateP(index_pred, predicate, (SubLObject)transformation_modules.UNPROVIDED)) {
                    final SubLObject index_pred_asent = el_utilities.replace_formula_arg((SubLObject)transformation_modules.ZERO_INTEGER, index_pred, asent);
                    final SubLObject v_bindings = unification_utilities.transformation_asent_unify(index_pred_asent, examine);
                    if (transformation_modules.NIL != v_bindings) {
                        return Values.values(v_bindings, examine, index_pred, predicate);
                    }
                }
                cdolist_list_var = cdolist_list_var.rest();
                examine = cdolist_list_var.first();
            }
        }
        return Values.values((SubLObject)transformation_modules.NIL, (SubLObject)transformation_modules.NIL, (SubLObject)transformation_modules.NIL, (SubLObject)transformation_modules.NIL);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/modules/transformation-modules.lisp", position = 14394L)
    public static SubLObject trans_predicate_genlpreds_pos_rule_filter(final SubLObject asent, final SubLObject rule) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        thread.resetMultipleValues();
        final SubLObject v_bindings = trans_predicate_genlpreds_pos_expand_int(asent, rule);
        final SubLObject examine = thread.secondMultipleValue();
        final SubLObject index_pred = thread.thirdMultipleValue();
        final SubLObject predicate = thread.fourthMultipleValue();
        thread.resetMultipleValues();
        if (transformation_modules.NIL != v_bindings && transformation_modules.NIL == inference_trampolines.inference_backchain_forbiddenP(index_pred, mt_relevance_macros.$mt$.getDynamicValue(thread))) {
            return (SubLObject)transformation_modules.T;
        }
        return (SubLObject)transformation_modules.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/modules/transformation-modules.lisp", position = 14719L)
    public static SubLObject trans_predicate_genlpreds_pos_expand(final SubLObject asent, final SubLObject rule) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        thread.resetMultipleValues();
        final SubLObject v_bindings = trans_predicate_genlpreds_pos_expand_int(asent, rule);
        final SubLObject examine = thread.secondMultipleValue();
        final SubLObject index_pred = thread.thirdMultipleValue();
        final SubLObject predicate = thread.fourthMultipleValue();
        thread.resetMultipleValues();
        if (transformation_modules.NIL != v_bindings) {
            final SubLObject more_supports = additional_genlpreds_supports(index_pred, predicate);
            backward.transformation_add_node(rule, examine, (SubLObject)transformation_modules.$kw40$POS, v_bindings, more_supports);
        }
        return (SubLObject)transformation_modules.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/modules/transformation-modules.lisp", position = 15131L)
    public static SubLObject trans_predicate_genlpreds_neg_expand_int(final SubLObject asent, final SubLObject rule) {
        final SubLObject predicate = cycl_utilities.atomic_sentence_predicate(asent);
        if (transformation_modules.NIL != backward_utilities.rule_relevant_to_proof(rule)) {
            final SubLObject cnf_var = assertions_high.assertion_cnf(rule);
            SubLObject cdolist_list_var = clauses.neg_lits(cnf_var);
            SubLObject examine = (SubLObject)transformation_modules.NIL;
            examine = cdolist_list_var.first();
            while (transformation_modules.NIL != cdolist_list_var) {
                final SubLObject index_pred = cycl_utilities.atomic_sentence_predicate(examine);
                if (transformation_modules.NIL != inference_proper_genl_predicateP(predicate, index_pred, (SubLObject)transformation_modules.UNPROVIDED)) {
                    final SubLObject index_pred_asent = el_utilities.replace_formula_arg((SubLObject)transformation_modules.ZERO_INTEGER, index_pred, asent);
                    final SubLObject v_bindings = unification_utilities.transformation_asent_unify(index_pred_asent, examine);
                    if (transformation_modules.NIL != v_bindings) {
                        return Values.values(v_bindings, examine, predicate, index_pred);
                    }
                }
                cdolist_list_var = cdolist_list_var.rest();
                examine = cdolist_list_var.first();
            }
        }
        return Values.values((SubLObject)transformation_modules.NIL, (SubLObject)transformation_modules.NIL, (SubLObject)transformation_modules.NIL, (SubLObject)transformation_modules.NIL);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/modules/transformation-modules.lisp", position = 15702L)
    public static SubLObject trans_predicate_genlpreds_neg_rule_filter(final SubLObject asent, final SubLObject rule) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        thread.resetMultipleValues();
        final SubLObject v_bindings = trans_predicate_genlpreds_neg_expand_int(asent, rule);
        final SubLObject examine = thread.secondMultipleValue();
        final SubLObject predicate = thread.thirdMultipleValue();
        final SubLObject index_pred = thread.fourthMultipleValue();
        thread.resetMultipleValues();
        if (transformation_modules.NIL != v_bindings && transformation_modules.NIL == inference_trampolines.inference_backchain_forbiddenP(index_pred, mt_relevance_macros.$mt$.getDynamicValue(thread))) {
            return (SubLObject)transformation_modules.T;
        }
        return (SubLObject)transformation_modules.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/modules/transformation-modules.lisp", position = 16026L)
    public static SubLObject trans_predicate_genlpreds_neg_expand(final SubLObject asent, final SubLObject rule) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        thread.resetMultipleValues();
        final SubLObject v_bindings = trans_predicate_genlpreds_neg_expand_int(asent, rule);
        final SubLObject examine = thread.secondMultipleValue();
        final SubLObject predicate = thread.thirdMultipleValue();
        final SubLObject index_pred = thread.fourthMultipleValue();
        thread.resetMultipleValues();
        if (transformation_modules.NIL != v_bindings) {
            final SubLObject more_supports = additional_genlpreds_supports(predicate, index_pred);
            backward.transformation_add_node(rule, examine, (SubLObject)transformation_modules.$kw14$NEG, v_bindings, more_supports);
        }
        return (SubLObject)transformation_modules.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/modules/transformation-modules.lisp", position = 18092L)
    public static SubLObject trans_predicate_genlpreds_required(final SubLObject asent) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        return (SubLObject)SubLObjectFactory.makeBoolean(transformation_modules.NIL == control_vars.$unique_inference_result_bindings$.getDynamicValue(thread) || transformation_modules.NIL == variables.fully_bound_p(asent) || transformation_modules.NIL == transformation_gaf_truth_known(asent));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/modules/transformation-modules.lisp", position = 18384L)
    public static SubLObject inference_proper_genl_predicateP_internal(final SubLObject spec_pred, final SubLObject genl_pred, SubLObject mt) {
        if (mt == transformation_modules.UNPROVIDED) {
            mt = mt_relevance_macros.$mt$.getDynamicValue();
        }
        if (!spec_pred.eql(genl_pred) && transformation_modules.NIL != forts.fort_p(spec_pred) && transformation_modules.NIL != forts.fort_p(genl_pred) && transformation_modules.NIL != fort_types_interface.predicateP(spec_pred) && transformation_modules.NIL != fort_types_interface.predicateP(genl_pred)) {
            return genl_predicates.genl_predicateP(spec_pred, genl_pred, mt, (SubLObject)transformation_modules.UNPROVIDED);
        }
        return (SubLObject)transformation_modules.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/modules/transformation-modules.lisp", position = 18384L)
    public static SubLObject inference_proper_genl_predicateP(final SubLObject spec_pred, final SubLObject genl_pred, SubLObject mt) {
        if (mt == transformation_modules.UNPROVIDED) {
            mt = mt_relevance_macros.$mt$.getDynamicValue();
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject v_memoization_state = memoization_state.$memoization_state$.getDynamicValue(thread);
        SubLObject caching_state = (SubLObject)transformation_modules.NIL;
        if (transformation_modules.NIL == v_memoization_state) {
            return inference_proper_genl_predicateP_internal(spec_pred, genl_pred, mt);
        }
        caching_state = memoization_state.memoization_state_lookup(v_memoization_state, (SubLObject)transformation_modules.$sym53$INFERENCE_PROPER_GENL_PREDICATE_, (SubLObject)transformation_modules.UNPROVIDED);
        if (transformation_modules.NIL == caching_state) {
            caching_state = memoization_state.create_caching_state(memoization_state.memoization_state_lock(v_memoization_state), (SubLObject)transformation_modules.$sym53$INFERENCE_PROPER_GENL_PREDICATE_, (SubLObject)transformation_modules.THREE_INTEGER, (SubLObject)transformation_modules.NIL, (SubLObject)transformation_modules.EQL, (SubLObject)transformation_modules.UNPROVIDED);
            memoization_state.memoization_state_put(v_memoization_state, (SubLObject)transformation_modules.$sym53$INFERENCE_PROPER_GENL_PREDICATE_, caching_state);
        }
        final SubLObject sxhash = memoization_state.sxhash_calc_3(spec_pred, genl_pred, mt);
        final SubLObject collisions = memoization_state.caching_state_lookup(caching_state, sxhash, (SubLObject)transformation_modules.UNPROVIDED);
        if (!collisions.eql(memoization_state.$memoized_item_not_found$.getGlobalValue())) {
            SubLObject cdolist_list_var = collisions;
            SubLObject collision = (SubLObject)transformation_modules.NIL;
            collision = cdolist_list_var.first();
            while (transformation_modules.NIL != cdolist_list_var) {
                SubLObject cached_args = collision.first();
                final SubLObject results2 = conses_high.second(collision);
                if (spec_pred.eql(cached_args.first())) {
                    cached_args = cached_args.rest();
                    if (genl_pred.eql(cached_args.first())) {
                        cached_args = cached_args.rest();
                        if (transformation_modules.NIL != cached_args && transformation_modules.NIL == cached_args.rest() && mt.eql(cached_args.first())) {
                            return memoization_state.caching_results(results2);
                        }
                    }
                }
                cdolist_list_var = cdolist_list_var.rest();
                collision = cdolist_list_var.first();
            }
        }
        final SubLObject results3 = Values.arg2(thread.resetMultipleValues(), (SubLObject)Values.multiple_value_list(inference_proper_genl_predicateP_internal(spec_pred, genl_pred, mt)));
        memoization_state.caching_state_enter_multi_key_n(caching_state, sxhash, collisions, results3, (SubLObject)ConsesLow.list(spec_pred, genl_pred, mt));
        return memoization_state.caching_results(results3);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/modules/transformation-modules.lisp", position = 18737L)
    public static SubLObject trans_predicate_genlinverse_pos_required(final SubLObject asent) {
        return trans_predicate_genlpreds_required(asent);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/modules/transformation-modules.lisp", position = 19005L)
    public static SubLObject trans_predicate_genlinverse_neg_required(final SubLObject asent) {
        return trans_predicate_genlpreds_required(asent);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/modules/transformation-modules.lisp", position = 19123L)
    public static SubLObject trans_predicate_genlinverse_pos_cost(final SubLObject asent) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject predicate = cycl_utilities.atomic_sentence_predicate(asent);
        thread.resetMultipleValues();
        final SubLObject spec_inverses = inference_trampolines.inference_all_proper_spec_inverses_with_axiom_index(predicate, (SubLObject)transformation_modules.$kw40$POS);
        final SubLObject cost = thread.secondMultipleValue();
        thread.resetMultipleValues();
        return cost;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/modules/transformation-modules.lisp", position = 19407L)
    public static SubLObject trans_predicate_genlinverse_neg_cost(final SubLObject asent) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject predicate = cycl_utilities.atomic_sentence_predicate(asent);
        thread.resetMultipleValues();
        final SubLObject genl_inverses = inference_trampolines.inference_all_proper_genl_inverses_with_axiom_index(predicate, (SubLObject)transformation_modules.$kw14$NEG);
        final SubLObject cost = thread.secondMultipleValue();
        thread.resetMultipleValues();
        return cost;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/modules/transformation-modules.lisp", position = 19691L)
    public static SubLObject trans_predicate_genlinverse_pos_rule_select(final SubLObject asent) {
        return conses_high.copy_list(trans_predicate_genlinverse_pos_rule_select_int(cycl_utilities.atomic_sentence_predicate(asent)));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/modules/transformation-modules.lisp", position = 19865L)
    public static SubLObject trans_predicate_genlinverse_pos_rule_select_int_internal(final SubLObject predicate) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject rules = new_selected_rules();
        SubLObject cdolist_list_var = inference_trampolines.inference_all_proper_spec_inverses_with_axiom_index(predicate, (SubLObject)transformation_modules.$kw40$POS);
        SubLObject index_pred = (SubLObject)transformation_modules.NIL;
        index_pred = cdolist_list_var.first();
        while (transformation_modules.NIL != cdolist_list_var) {
            if (transformation_modules.NIL == inference_trampolines.inference_backchain_forbiddenP(index_pred, mt_relevance_macros.$mt$.getDynamicValue(thread))) {
                SubLObject cdolist_list_var_$13 = backward_utilities.relevant_directions();
                SubLObject direction = (SubLObject)transformation_modules.NIL;
                direction = cdolist_list_var_$13.first();
                while (transformation_modules.NIL != cdolist_list_var_$13) {
                    if (transformation_modules.NIL != kb_mapping_macros.do_predicate_rule_index_key_validator(index_pred, (SubLObject)transformation_modules.$kw40$POS, direction)) {
                        final SubLObject iterator_var = kb_mapping_macros.new_predicate_rule_final_index_spec_iterator(index_pred, (SubLObject)transformation_modules.$kw40$POS, direction);
                        SubLObject done_var = (SubLObject)transformation_modules.NIL;
                        final SubLObject token_var = (SubLObject)transformation_modules.NIL;
                        while (transformation_modules.NIL == done_var) {
                            final SubLObject final_index_spec = iteration.iteration_next_without_values_macro_helper(iterator_var, token_var);
                            final SubLObject valid = (SubLObject)SubLObjectFactory.makeBoolean(!token_var.eql(final_index_spec));
                            if (transformation_modules.NIL != valid) {
                                SubLObject final_index_iterator = (SubLObject)transformation_modules.NIL;
                                try {
                                    final_index_iterator = kb_mapping_macros.new_final_index_iterator(final_index_spec, (SubLObject)transformation_modules.$kw46$RULE, (SubLObject)transformation_modules.NIL, direction);
                                    SubLObject done_var_$14 = (SubLObject)transformation_modules.NIL;
                                    final SubLObject token_var_$15 = (SubLObject)transformation_modules.NIL;
                                    while (transformation_modules.NIL == done_var_$14) {
                                        final SubLObject rule = iteration.iteration_next_without_values_macro_helper(final_index_iterator, token_var_$15);
                                        final SubLObject valid_$16 = (SubLObject)SubLObjectFactory.makeBoolean(!token_var_$15.eql(rule));
                                        if (transformation_modules.NIL != valid_$16) {
                                            rules = add_selected_rule(rule, rules);
                                        }
                                        done_var_$14 = (SubLObject)SubLObjectFactory.makeBoolean(transformation_modules.NIL == valid_$16);
                                    }
                                }
                                finally {
                                    final SubLObject _prev_bind_0 = Threads.$is_thread_performing_cleanupP$.currentBinding(thread);
                                    try {
                                        Threads.$is_thread_performing_cleanupP$.bind((SubLObject)transformation_modules.T, thread);
                                        final SubLObject _values = Values.getValuesAsVector();
                                        if (transformation_modules.NIL != final_index_iterator) {
                                            kb_mapping_macros.destroy_final_index_iterator(final_index_iterator);
                                        }
                                        Values.restoreValuesFromVector(_values);
                                    }
                                    finally {
                                        Threads.$is_thread_performing_cleanupP$.rebind(_prev_bind_0, thread);
                                    }
                                }
                            }
                            done_var = (SubLObject)SubLObjectFactory.makeBoolean(transformation_modules.NIL == valid);
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
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/modules/transformation-modules.lisp", position = 19865L)
    public static SubLObject trans_predicate_genlinverse_pos_rule_select_int(final SubLObject predicate) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject v_memoization_state = memoization_state.$memoization_state$.getDynamicValue(thread);
        SubLObject caching_state = (SubLObject)transformation_modules.NIL;
        if (transformation_modules.NIL == v_memoization_state) {
            return trans_predicate_genlinverse_pos_rule_select_int_internal(predicate);
        }
        caching_state = memoization_state.memoization_state_lookup(v_memoization_state, (SubLObject)transformation_modules.$sym54$TRANS_PREDICATE_GENLINVERSE_POS_RULE_SELECT_INT, (SubLObject)transformation_modules.UNPROVIDED);
        if (transformation_modules.NIL == caching_state) {
            caching_state = memoization_state.create_caching_state(memoization_state.memoization_state_lock(v_memoization_state), (SubLObject)transformation_modules.$sym54$TRANS_PREDICATE_GENLINVERSE_POS_RULE_SELECT_INT, (SubLObject)transformation_modules.ONE_INTEGER, (SubLObject)transformation_modules.NIL, (SubLObject)transformation_modules.EQL, (SubLObject)transformation_modules.UNPROVIDED);
            memoization_state.memoization_state_put(v_memoization_state, (SubLObject)transformation_modules.$sym54$TRANS_PREDICATE_GENLINVERSE_POS_RULE_SELECT_INT, caching_state);
        }
        SubLObject results = memoization_state.caching_state_lookup(caching_state, predicate, memoization_state.$memoized_item_not_found$.getGlobalValue());
        if (results.eql(memoization_state.$memoized_item_not_found$.getGlobalValue())) {
            results = Values.arg2(thread.resetMultipleValues(), (SubLObject)Values.multiple_value_list(trans_predicate_genlinverse_pos_rule_select_int_internal(predicate)));
            memoization_state.caching_state_put(caching_state, predicate, results, (SubLObject)transformation_modules.UNPROVIDED);
        }
        return memoization_state.caching_results(results);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/modules/transformation-modules.lisp", position = 20403L)
    public static SubLObject trans_predicate_genlinverse_neg_rule_select(final SubLObject asent) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject predicate = cycl_utilities.atomic_sentence_predicate(asent);
        SubLObject rules = new_selected_rules();
        SubLObject cdolist_list_var = inference_trampolines.inference_all_proper_genl_inverses_with_axiom_index(predicate, (SubLObject)transformation_modules.$kw14$NEG);
        SubLObject index_pred = (SubLObject)transformation_modules.NIL;
        index_pred = cdolist_list_var.first();
        while (transformation_modules.NIL != cdolist_list_var) {
            if (transformation_modules.NIL == inference_trampolines.inference_backchain_forbiddenP(index_pred, mt_relevance_macros.$mt$.getDynamicValue(thread))) {
                SubLObject cdolist_list_var_$17 = backward_utilities.relevant_directions();
                SubLObject direction = (SubLObject)transformation_modules.NIL;
                direction = cdolist_list_var_$17.first();
                while (transformation_modules.NIL != cdolist_list_var_$17) {
                    if (transformation_modules.NIL != kb_mapping_macros.do_predicate_rule_index_key_validator(index_pred, (SubLObject)transformation_modules.$kw14$NEG, direction)) {
                        final SubLObject iterator_var = kb_mapping_macros.new_predicate_rule_final_index_spec_iterator(index_pred, (SubLObject)transformation_modules.$kw14$NEG, direction);
                        SubLObject done_var = (SubLObject)transformation_modules.NIL;
                        final SubLObject token_var = (SubLObject)transformation_modules.NIL;
                        while (transformation_modules.NIL == done_var) {
                            final SubLObject final_index_spec = iteration.iteration_next_without_values_macro_helper(iterator_var, token_var);
                            final SubLObject valid = (SubLObject)SubLObjectFactory.makeBoolean(!token_var.eql(final_index_spec));
                            if (transformation_modules.NIL != valid) {
                                SubLObject final_index_iterator = (SubLObject)transformation_modules.NIL;
                                try {
                                    final_index_iterator = kb_mapping_macros.new_final_index_iterator(final_index_spec, (SubLObject)transformation_modules.$kw46$RULE, (SubLObject)transformation_modules.NIL, direction);
                                    SubLObject done_var_$18 = (SubLObject)transformation_modules.NIL;
                                    final SubLObject token_var_$19 = (SubLObject)transformation_modules.NIL;
                                    while (transformation_modules.NIL == done_var_$18) {
                                        final SubLObject rule = iteration.iteration_next_without_values_macro_helper(final_index_iterator, token_var_$19);
                                        final SubLObject valid_$20 = (SubLObject)SubLObjectFactory.makeBoolean(!token_var_$19.eql(rule));
                                        if (transformation_modules.NIL != valid_$20) {
                                            rules = add_selected_rule(rule, rules);
                                        }
                                        done_var_$18 = (SubLObject)SubLObjectFactory.makeBoolean(transformation_modules.NIL == valid_$20);
                                    }
                                }
                                finally {
                                    final SubLObject _prev_bind_0 = Threads.$is_thread_performing_cleanupP$.currentBinding(thread);
                                    try {
                                        Threads.$is_thread_performing_cleanupP$.bind((SubLObject)transformation_modules.T, thread);
                                        final SubLObject _values = Values.getValuesAsVector();
                                        if (transformation_modules.NIL != final_index_iterator) {
                                            kb_mapping_macros.destroy_final_index_iterator(final_index_iterator);
                                        }
                                        Values.restoreValuesFromVector(_values);
                                    }
                                    finally {
                                        Threads.$is_thread_performing_cleanupP$.rebind(_prev_bind_0, thread);
                                    }
                                }
                            }
                            done_var = (SubLObject)SubLObjectFactory.makeBoolean(transformation_modules.NIL == valid);
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
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/modules/transformation-modules.lisp", position = 20951L)
    public static SubLObject trans_predicate_genlinverse_pos_expand_int(final SubLObject asent, final SubLObject rule) {
        final SubLObject inverted_asent = removal_modules_symmetry.symmetric_asent(asent);
        final SubLObject predicate = cycl_utilities.atomic_sentence_predicate(inverted_asent);
        if (transformation_modules.NIL != backward_utilities.rule_relevant_to_proof(rule)) {
            final SubLObject cnf_var = assertions_high.assertion_cnf(rule);
            SubLObject cdolist_list_var = clauses.pos_lits(cnf_var);
            SubLObject examine = (SubLObject)transformation_modules.NIL;
            examine = cdolist_list_var.first();
            while (transformation_modules.NIL != cdolist_list_var) {
                final SubLObject index_pred = cycl_utilities.atomic_sentence_predicate(examine);
                if (transformation_modules.NIL != inference_proper_genl_inverseP(index_pred, predicate, (SubLObject)transformation_modules.UNPROVIDED)) {
                    final SubLObject index_pred_asent = el_utilities.replace_formula_arg((SubLObject)transformation_modules.ZERO_INTEGER, index_pred, inverted_asent);
                    final SubLObject v_bindings = unification_utilities.transformation_asent_unify(index_pred_asent, examine);
                    if (transformation_modules.NIL != v_bindings) {
                        return Values.values(v_bindings, examine, index_pred, predicate);
                    }
                }
                cdolist_list_var = cdolist_list_var.rest();
                examine = cdolist_list_var.first();
            }
        }
        return Values.values((SubLObject)transformation_modules.NIL, (SubLObject)transformation_modules.NIL, (SubLObject)transformation_modules.NIL, (SubLObject)transformation_modules.NIL);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/modules/transformation-modules.lisp", position = 21583L)
    public static SubLObject trans_predicate_genlinverse_pos_rule_filter(final SubLObject asent, final SubLObject rule) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        thread.resetMultipleValues();
        final SubLObject v_bindings = trans_predicate_genlinverse_pos_expand_int(asent, rule);
        final SubLObject examine = thread.secondMultipleValue();
        final SubLObject index_pred = thread.thirdMultipleValue();
        final SubLObject predicate = thread.fourthMultipleValue();
        thread.resetMultipleValues();
        if (transformation_modules.NIL != v_bindings && transformation_modules.NIL == inference_trampolines.inference_backchain_forbiddenP(index_pred, mt_relevance_macros.$mt$.getDynamicValue(thread))) {
            return (SubLObject)transformation_modules.T;
        }
        return (SubLObject)transformation_modules.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/modules/transformation-modules.lisp", position = 21912L)
    public static SubLObject trans_predicate_genlinverse_pos_expand(final SubLObject asent, final SubLObject rule) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        thread.resetMultipleValues();
        final SubLObject v_bindings = trans_predicate_genlinverse_pos_expand_int(asent, rule);
        final SubLObject examine = thread.secondMultipleValue();
        final SubLObject index_pred = thread.thirdMultipleValue();
        final SubLObject predicate = thread.fourthMultipleValue();
        thread.resetMultipleValues();
        if (transformation_modules.NIL != v_bindings) {
            final SubLObject more_supports = additional_genlinverse_supports(index_pred, predicate);
            backward.transformation_add_node(rule, examine, (SubLObject)transformation_modules.$kw40$POS, v_bindings, more_supports);
        }
        return (SubLObject)transformation_modules.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/modules/transformation-modules.lisp", position = 22330L)
    public static SubLObject trans_predicate_genlinverse_neg_expand_int(final SubLObject asent, final SubLObject rule) {
        final SubLObject inverted_asent = removal_modules_symmetry.symmetric_asent(asent);
        final SubLObject predicate = cycl_utilities.atomic_sentence_predicate(inverted_asent);
        if (transformation_modules.NIL != backward_utilities.rule_relevant_to_proof(rule)) {
            final SubLObject cnf_var = assertions_high.assertion_cnf(rule);
            SubLObject cdolist_list_var = clauses.neg_lits(cnf_var);
            SubLObject examine = (SubLObject)transformation_modules.NIL;
            examine = cdolist_list_var.first();
            while (transformation_modules.NIL != cdolist_list_var) {
                final SubLObject index_pred = cycl_utilities.atomic_sentence_predicate(examine);
                if (transformation_modules.NIL != inference_proper_genl_inverseP(predicate, index_pred, (SubLObject)transformation_modules.UNPROVIDED)) {
                    final SubLObject index_pred_asent = el_utilities.replace_formula_arg((SubLObject)transformation_modules.ZERO_INTEGER, index_pred, inverted_asent);
                    final SubLObject v_bindings = unification_utilities.transformation_asent_unify(index_pred_asent, examine);
                    if (transformation_modules.NIL != v_bindings) {
                        return Values.values(v_bindings, examine, predicate, index_pred);
                    }
                }
                cdolist_list_var = cdolist_list_var.rest();
                examine = cdolist_list_var.first();
            }
        }
        return Values.values((SubLObject)transformation_modules.NIL, (SubLObject)transformation_modules.NIL, (SubLObject)transformation_modules.NIL, (SubLObject)transformation_modules.NIL);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/modules/transformation-modules.lisp", position = 22962L)
    public static SubLObject trans_predicate_genlinverse_neg_rule_filter(final SubLObject asent, final SubLObject rule) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        thread.resetMultipleValues();
        final SubLObject v_bindings = trans_predicate_genlinverse_neg_expand_int(asent, rule);
        final SubLObject examine = thread.secondMultipleValue();
        final SubLObject predicate = thread.thirdMultipleValue();
        final SubLObject index_pred = thread.fourthMultipleValue();
        thread.resetMultipleValues();
        if (transformation_modules.NIL != v_bindings && transformation_modules.NIL == inference_trampolines.inference_backchain_forbiddenP(index_pred, mt_relevance_macros.$mt$.getDynamicValue(thread))) {
            return (SubLObject)transformation_modules.T;
        }
        return (SubLObject)transformation_modules.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/modules/transformation-modules.lisp", position = 23290L)
    public static SubLObject trans_predicate_genlinverse_neg_expand(final SubLObject asent, final SubLObject rule) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        thread.resetMultipleValues();
        final SubLObject v_bindings = trans_predicate_genlinverse_neg_expand_int(asent, rule);
        final SubLObject examine = thread.secondMultipleValue();
        final SubLObject predicate = thread.thirdMultipleValue();
        final SubLObject index_pred = thread.fourthMultipleValue();
        thread.resetMultipleValues();
        if (transformation_modules.NIL != v_bindings) {
            final SubLObject more_supports = additional_genlinverse_supports(predicate, index_pred);
            backward.transformation_add_node(rule, examine, (SubLObject)transformation_modules.$kw14$NEG, v_bindings, more_supports);
        }
        return (SubLObject)transformation_modules.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/modules/transformation-modules.lisp", position = 25478L)
    public static SubLObject inference_proper_genl_inverseP_internal(final SubLObject spec_pred, final SubLObject genl_inverse, SubLObject mt) {
        if (mt == transformation_modules.UNPROVIDED) {
            mt = mt_relevance_macros.$mt$.getDynamicValue();
        }
        if (!spec_pred.eql(genl_inverse) && transformation_modules.NIL != forts.fort_p(spec_pred) && transformation_modules.NIL != forts.fort_p(genl_inverse) && transformation_modules.NIL != fort_types_interface.predicateP(spec_pred) && transformation_modules.NIL != fort_types_interface.predicateP(genl_inverse)) {
            return genl_predicates.genl_inverseP(spec_pred, genl_inverse, mt, (SubLObject)transformation_modules.UNPROVIDED);
        }
        return (SubLObject)transformation_modules.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/modules/transformation-modules.lisp", position = 25478L)
    public static SubLObject inference_proper_genl_inverseP(final SubLObject spec_pred, final SubLObject genl_inverse, SubLObject mt) {
        if (mt == transformation_modules.UNPROVIDED) {
            mt = mt_relevance_macros.$mt$.getDynamicValue();
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject v_memoization_state = memoization_state.$memoization_state$.getDynamicValue(thread);
        SubLObject caching_state = (SubLObject)transformation_modules.NIL;
        if (transformation_modules.NIL == v_memoization_state) {
            return inference_proper_genl_inverseP_internal(spec_pred, genl_inverse, mt);
        }
        caching_state = memoization_state.memoization_state_lookup(v_memoization_state, (SubLObject)transformation_modules.$sym59$INFERENCE_PROPER_GENL_INVERSE_, (SubLObject)transformation_modules.UNPROVIDED);
        if (transformation_modules.NIL == caching_state) {
            caching_state = memoization_state.create_caching_state(memoization_state.memoization_state_lock(v_memoization_state), (SubLObject)transformation_modules.$sym59$INFERENCE_PROPER_GENL_INVERSE_, (SubLObject)transformation_modules.THREE_INTEGER, (SubLObject)transformation_modules.NIL, (SubLObject)transformation_modules.EQL, (SubLObject)transformation_modules.UNPROVIDED);
            memoization_state.memoization_state_put(v_memoization_state, (SubLObject)transformation_modules.$sym59$INFERENCE_PROPER_GENL_INVERSE_, caching_state);
        }
        final SubLObject sxhash = memoization_state.sxhash_calc_3(spec_pred, genl_inverse, mt);
        final SubLObject collisions = memoization_state.caching_state_lookup(caching_state, sxhash, (SubLObject)transformation_modules.UNPROVIDED);
        if (!collisions.eql(memoization_state.$memoized_item_not_found$.getGlobalValue())) {
            SubLObject cdolist_list_var = collisions;
            SubLObject collision = (SubLObject)transformation_modules.NIL;
            collision = cdolist_list_var.first();
            while (transformation_modules.NIL != cdolist_list_var) {
                SubLObject cached_args = collision.first();
                final SubLObject results2 = conses_high.second(collision);
                if (spec_pred.eql(cached_args.first())) {
                    cached_args = cached_args.rest();
                    if (genl_inverse.eql(cached_args.first())) {
                        cached_args = cached_args.rest();
                        if (transformation_modules.NIL != cached_args && transformation_modules.NIL == cached_args.rest() && mt.eql(cached_args.first())) {
                            return memoization_state.caching_results(results2);
                        }
                    }
                }
                cdolist_list_var = cdolist_list_var.rest();
                collision = cdolist_list_var.first();
            }
        }
        final SubLObject results3 = Values.arg2(thread.resetMultipleValues(), (SubLObject)Values.multiple_value_list(inference_proper_genl_inverseP_internal(spec_pred, genl_inverse, mt)));
        memoization_state.caching_state_enter_multi_key_n(caching_state, sxhash, collisions, results3, (SubLObject)ConsesLow.list(spec_pred, genl_inverse, mt));
        return memoization_state.caching_results(results3);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/modules/transformation-modules.lisp", position = 25856L)
    public static SubLObject trans_predicate_negationpreds_neg_required(final SubLObject asent) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        return (SubLObject)SubLObjectFactory.makeBoolean(transformation_modules.NIL == control_vars.$unique_inference_result_bindings$.getDynamicValue(thread) || transformation_modules.NIL == variables.fully_bound_p(asent) || transformation_modules.NIL == transformation_gaf_truth_known(asent));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/modules/transformation-modules.lisp", position = 26294L)
    public static SubLObject trans_predicate_negationpreds_neg_cost(final SubLObject asent) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject predicate = cycl_utilities.atomic_sentence_predicate(asent);
        thread.resetMultipleValues();
        final SubLObject negation_preds = inference_trampolines.inference_all_negation_predicates_with_axiom_index(predicate, (SubLObject)transformation_modules.$kw40$POS);
        final SubLObject cost = thread.secondMultipleValue();
        thread.resetMultipleValues();
        return cost;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/modules/transformation-modules.lisp", position = 26581L)
    public static SubLObject trans_predicate_negationpreds_neg_rule_select(final SubLObject asent) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject predicate = cycl_utilities.atomic_sentence_predicate(asent);
        SubLObject rules = new_selected_rules();
        SubLObject cdolist_list_var = inference_trampolines.inference_all_negation_predicates_with_axiom_index(predicate, (SubLObject)transformation_modules.$kw40$POS);
        SubLObject index_pred = (SubLObject)transformation_modules.NIL;
        index_pred = cdolist_list_var.first();
        while (transformation_modules.NIL != cdolist_list_var) {
            if (transformation_modules.NIL == inference_trampolines.inference_backchain_forbiddenP(index_pred, mt_relevance_macros.$mt$.getDynamicValue(thread))) {
                SubLObject cdolist_list_var_$21 = backward_utilities.relevant_directions();
                SubLObject direction = (SubLObject)transformation_modules.NIL;
                direction = cdolist_list_var_$21.first();
                while (transformation_modules.NIL != cdolist_list_var_$21) {
                    if (transformation_modules.NIL != kb_mapping_macros.do_predicate_rule_index_key_validator(index_pred, (SubLObject)transformation_modules.$kw40$POS, direction)) {
                        final SubLObject iterator_var = kb_mapping_macros.new_predicate_rule_final_index_spec_iterator(index_pred, (SubLObject)transformation_modules.$kw40$POS, direction);
                        SubLObject done_var = (SubLObject)transformation_modules.NIL;
                        final SubLObject token_var = (SubLObject)transformation_modules.NIL;
                        while (transformation_modules.NIL == done_var) {
                            final SubLObject final_index_spec = iteration.iteration_next_without_values_macro_helper(iterator_var, token_var);
                            final SubLObject valid = (SubLObject)SubLObjectFactory.makeBoolean(!token_var.eql(final_index_spec));
                            if (transformation_modules.NIL != valid) {
                                SubLObject final_index_iterator = (SubLObject)transformation_modules.NIL;
                                try {
                                    final_index_iterator = kb_mapping_macros.new_final_index_iterator(final_index_spec, (SubLObject)transformation_modules.$kw46$RULE, (SubLObject)transformation_modules.NIL, direction);
                                    SubLObject done_var_$22 = (SubLObject)transformation_modules.NIL;
                                    final SubLObject token_var_$23 = (SubLObject)transformation_modules.NIL;
                                    while (transformation_modules.NIL == done_var_$22) {
                                        final SubLObject rule = iteration.iteration_next_without_values_macro_helper(final_index_iterator, token_var_$23);
                                        final SubLObject valid_$24 = (SubLObject)SubLObjectFactory.makeBoolean(!token_var_$23.eql(rule));
                                        if (transformation_modules.NIL != valid_$24) {
                                            rules = add_selected_rule(rule, rules);
                                        }
                                        done_var_$22 = (SubLObject)SubLObjectFactory.makeBoolean(transformation_modules.NIL == valid_$24);
                                    }
                                }
                                finally {
                                    final SubLObject _prev_bind_0 = Threads.$is_thread_performing_cleanupP$.currentBinding(thread);
                                    try {
                                        Threads.$is_thread_performing_cleanupP$.bind((SubLObject)transformation_modules.T, thread);
                                        final SubLObject _values = Values.getValuesAsVector();
                                        if (transformation_modules.NIL != final_index_iterator) {
                                            kb_mapping_macros.destroy_final_index_iterator(final_index_iterator);
                                        }
                                        Values.restoreValuesFromVector(_values);
                                    }
                                    finally {
                                        Threads.$is_thread_performing_cleanupP$.rebind(_prev_bind_0, thread);
                                    }
                                }
                            }
                            done_var = (SubLObject)SubLObjectFactory.makeBoolean(transformation_modules.NIL == valid);
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
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/modules/transformation-modules.lisp", position = 27130L)
    public static SubLObject trans_predicate_negationpreds_neg_expand_int(final SubLObject asent, final SubLObject rule) {
        final SubLObject predicate = cycl_utilities.atomic_sentence_predicate(asent);
        if (transformation_modules.NIL != backward_utilities.rule_relevant_to_proof(rule)) {
            final SubLObject cnf_var = assertions_high.assertion_cnf(rule);
            SubLObject cdolist_list_var = clauses.pos_lits(cnf_var);
            SubLObject examine = (SubLObject)transformation_modules.NIL;
            examine = cdolist_list_var.first();
            while (transformation_modules.NIL != cdolist_list_var) {
                final SubLObject index_pred = cycl_utilities.atomic_sentence_predicate(examine);
                if (transformation_modules.NIL != negation_predicate.negation_predicateP(index_pred, predicate, (SubLObject)transformation_modules.UNPROVIDED, (SubLObject)transformation_modules.UNPROVIDED)) {
                    final SubLObject index_pred_asent = el_utilities.replace_formula_arg((SubLObject)transformation_modules.ZERO_INTEGER, index_pred, asent);
                    final SubLObject v_bindings = unification_utilities.transformation_asent_unify(index_pred_asent, examine);
                    if (transformation_modules.NIL != v_bindings) {
                        return Values.values(v_bindings, examine, index_pred, predicate);
                    }
                }
                cdolist_list_var = cdolist_list_var.rest();
                examine = cdolist_list_var.first();
            }
        }
        return Values.values((SubLObject)transformation_modules.NIL, (SubLObject)transformation_modules.NIL, (SubLObject)transformation_modules.NIL, (SubLObject)transformation_modules.NIL);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/modules/transformation-modules.lisp", position = 27692L)
    public static SubLObject trans_predicate_negationpreds_neg_rule_filter(final SubLObject asent, final SubLObject rule) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        thread.resetMultipleValues();
        final SubLObject v_bindings = trans_predicate_negationpreds_neg_expand_int(asent, rule);
        final SubLObject examine = thread.secondMultipleValue();
        final SubLObject index_pred = thread.thirdMultipleValue();
        final SubLObject predicate = thread.fourthMultipleValue();
        thread.resetMultipleValues();
        if (transformation_modules.NIL != v_bindings && transformation_modules.NIL == inference_trampolines.inference_backchain_forbiddenP(index_pred, mt_relevance_macros.$mt$.getDynamicValue(thread))) {
            return (SubLObject)transformation_modules.T;
        }
        return (SubLObject)transformation_modules.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/modules/transformation-modules.lisp", position = 28024L)
    public static SubLObject trans_predicate_negationpreds_neg_expand(final SubLObject asent, final SubLObject rule) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        thread.resetMultipleValues();
        final SubLObject v_bindings = trans_predicate_negationpreds_neg_expand_int(asent, rule);
        final SubLObject examine = thread.secondMultipleValue();
        final SubLObject index_pred = thread.thirdMultipleValue();
        final SubLObject predicate = thread.fourthMultipleValue();
        thread.resetMultipleValues();
        if (transformation_modules.NIL != v_bindings) {
            final SubLObject more_supports = additional_negationpreds_supports(index_pred, predicate);
            backward.transformation_add_node(rule, examine, (SubLObject)transformation_modules.$kw40$POS, v_bindings, more_supports);
        }
        return (SubLObject)transformation_modules.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/modules/transformation-modules.lisp", position = 29348L)
    public static SubLObject trans_predicate_commutativity_cost(final SubLObject asent, final SubLObject sense) {
        SubLObject cost = (SubLObject)transformation_modules.ZERO_INTEGER;
        if (transformation_modules.NIL != el_utilities.el_binary_formula_p(asent)) {
            final SubLObject permuted_asent = removal_modules_symmetry.symmetric_asent(asent);
            cost = Numbers.add(cost, trans_predicate_cost(permuted_asent, sense));
        }
        else {
            SubLObject cdolist_list_var = cycl_utilities.formula_commutative_permutations(asent, (SubLObject)transformation_modules.UNPROVIDED);
            SubLObject permuted_asent2 = (SubLObject)transformation_modules.NIL;
            permuted_asent2 = cdolist_list_var.first();
            while (transformation_modules.NIL != cdolist_list_var) {
                if (!permuted_asent2.equal(asent)) {
                    cost = Numbers.add(cost, trans_predicate_cost(permuted_asent2, sense));
                }
                cdolist_list_var = cdolist_list_var.rest();
                permuted_asent2 = cdolist_list_var.first();
            }
        }
        return cost;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/modules/transformation-modules.lisp", position = 29793L)
    public static SubLObject trans_predicate_commutativity_rule_select(final SubLObject asent, final SubLObject sense) {
        final SubLObject predicate = cycl_utilities.atomic_sentence_predicate(asent);
        SubLObject rules = new_selected_rules();
        SubLObject cdolist_list_var = backward_utilities.relevant_directions();
        SubLObject direction = (SubLObject)transformation_modules.NIL;
        direction = cdolist_list_var.first();
        while (transformation_modules.NIL != cdolist_list_var) {
            if (transformation_modules.NIL != kb_mapping_macros.do_predicate_rule_index_key_validator(predicate, sense, direction)) {
                final SubLObject iterator_var = kb_mapping_macros.new_predicate_rule_final_index_spec_iterator(predicate, sense, direction);
                SubLObject done_var = (SubLObject)transformation_modules.NIL;
                final SubLObject token_var = (SubLObject)transformation_modules.NIL;
                while (transformation_modules.NIL == done_var) {
                    final SubLObject final_index_spec = iteration.iteration_next_without_values_macro_helper(iterator_var, token_var);
                    final SubLObject valid = (SubLObject)SubLObjectFactory.makeBoolean(!token_var.eql(final_index_spec));
                    if (transformation_modules.NIL != valid) {
                        SubLObject final_index_iterator = (SubLObject)transformation_modules.NIL;
                        try {
                            final_index_iterator = kb_mapping_macros.new_final_index_iterator(final_index_spec, (SubLObject)transformation_modules.$kw46$RULE, (SubLObject)transformation_modules.NIL, direction);
                            SubLObject done_var_$25 = (SubLObject)transformation_modules.NIL;
                            final SubLObject token_var_$26 = (SubLObject)transformation_modules.NIL;
                            while (transformation_modules.NIL == done_var_$25) {
                                final SubLObject rule = iteration.iteration_next_without_values_macro_helper(final_index_iterator, token_var_$26);
                                final SubLObject valid_$27 = (SubLObject)SubLObjectFactory.makeBoolean(!token_var_$26.eql(rule));
                                if (transformation_modules.NIL != valid_$27) {
                                    rules = add_selected_rule(rule, rules);
                                }
                                done_var_$25 = (SubLObject)SubLObjectFactory.makeBoolean(transformation_modules.NIL == valid_$27);
                            }
                        }
                        finally {
                            final SubLObject _prev_bind_0 = Dynamic.currentBinding(Threads.$is_thread_performing_cleanupP$);
                            try {
                                Dynamic.bind(Threads.$is_thread_performing_cleanupP$, (SubLObject)transformation_modules.T);
                                final SubLObject _values = Values.getValuesAsVector();
                                if (transformation_modules.NIL != final_index_iterator) {
                                    kb_mapping_macros.destroy_final_index_iterator(final_index_iterator);
                                }
                                Values.restoreValuesFromVector(_values);
                            }
                            finally {
                                Dynamic.rebind(Threads.$is_thread_performing_cleanupP$, _prev_bind_0);
                            }
                        }
                    }
                    done_var = (SubLObject)SubLObjectFactory.makeBoolean(transformation_modules.NIL == valid);
                }
            }
            cdolist_list_var = cdolist_list_var.rest();
            direction = cdolist_list_var.first();
        }
        return finalize_selected_rules(rules);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/modules/transformation-modules.lisp", position = 30182L)
    public static SubLObject trans_predicate_commutativity_expand_int(final SubLObject asent, final SubLObject sense, final SubLObject rule) {
        final SubLObject predicate = cycl_utilities.atomic_sentence_predicate(asent);
        if (transformation_modules.NIL != el_utilities.el_binary_formula_p(asent)) {
            final SubLObject permuted_asent = removal_modules_symmetry.symmetric_asent(asent);
            final SubLObject predicate_var = predicate;
            if (transformation_modules.NIL != backward_utilities.rule_relevant_to_proof(rule)) {
                final SubLObject cnf_var = assertions_high.assertion_cnf(rule);
                if (transformation_modules.$kw40$POS == sense) {
                    SubLObject cdolist_list_var = clauses.pos_lits(cnf_var);
                    SubLObject examine = (SubLObject)transformation_modules.NIL;
                    examine = cdolist_list_var.first();
                    while (transformation_modules.NIL != cdolist_list_var) {
                        if (predicate_var.eql(cycl_utilities.atomic_sentence_predicate(examine))) {
                            final SubLObject v_bindings = unification_utilities.transformation_asent_unify(permuted_asent, examine);
                            if (transformation_modules.NIL != v_bindings) {
                                return Values.values(v_bindings, examine, predicate);
                            }
                        }
                        cdolist_list_var = cdolist_list_var.rest();
                        examine = cdolist_list_var.first();
                    }
                }
                else if (transformation_modules.$kw14$NEG == sense) {
                    SubLObject cdolist_list_var = clauses.neg_lits(cnf_var);
                    SubLObject examine = (SubLObject)transformation_modules.NIL;
                    examine = cdolist_list_var.first();
                    while (transformation_modules.NIL != cdolist_list_var) {
                        if (predicate_var.eql(cycl_utilities.atomic_sentence_predicate(examine))) {
                            final SubLObject v_bindings = unification_utilities.transformation_asent_unify(permuted_asent, examine);
                            if (transformation_modules.NIL != v_bindings) {
                                return Values.values(v_bindings, examine, predicate);
                            }
                        }
                        cdolist_list_var = cdolist_list_var.rest();
                        examine = cdolist_list_var.first();
                    }
                }
                else {
                    Errors.error((SubLObject)transformation_modules.$str47$Invalid_sense__s, sense);
                }
            }
        }
        else {
            SubLObject cdolist_list_var2 = cycl_utilities.formula_commutative_permutations(asent, (SubLObject)transformation_modules.UNPROVIDED);
            SubLObject permuted_asent2 = (SubLObject)transformation_modules.NIL;
            permuted_asent2 = cdolist_list_var2.first();
            while (transformation_modules.NIL != cdolist_list_var2) {
                if (!permuted_asent2.equal(asent)) {
                    final SubLObject predicate_var2 = predicate;
                    if (transformation_modules.NIL != backward_utilities.rule_relevant_to_proof(rule)) {
                        final SubLObject cnf_var2 = assertions_high.assertion_cnf(rule);
                        if (transformation_modules.$kw40$POS == sense) {
                            SubLObject cdolist_list_var_$28 = clauses.pos_lits(cnf_var2);
                            SubLObject examine2 = (SubLObject)transformation_modules.NIL;
                            examine2 = cdolist_list_var_$28.first();
                            while (transformation_modules.NIL != cdolist_list_var_$28) {
                                if (predicate_var2.eql(cycl_utilities.atomic_sentence_predicate(examine2))) {
                                    final SubLObject v_bindings2 = unification_utilities.transformation_asent_unify(permuted_asent2, examine2);
                                    if (transformation_modules.NIL != v_bindings2) {
                                        return Values.values(v_bindings2, examine2, predicate);
                                    }
                                }
                                cdolist_list_var_$28 = cdolist_list_var_$28.rest();
                                examine2 = cdolist_list_var_$28.first();
                            }
                        }
                        else if (transformation_modules.$kw14$NEG == sense) {
                            SubLObject cdolist_list_var_$29 = clauses.neg_lits(cnf_var2);
                            SubLObject examine2 = (SubLObject)transformation_modules.NIL;
                            examine2 = cdolist_list_var_$29.first();
                            while (transformation_modules.NIL != cdolist_list_var_$29) {
                                if (predicate_var2.eql(cycl_utilities.atomic_sentence_predicate(examine2))) {
                                    final SubLObject v_bindings2 = unification_utilities.transformation_asent_unify(permuted_asent2, examine2);
                                    if (transformation_modules.NIL != v_bindings2) {
                                        return Values.values(v_bindings2, examine2, predicate);
                                    }
                                }
                                cdolist_list_var_$29 = cdolist_list_var_$29.rest();
                                examine2 = cdolist_list_var_$29.first();
                            }
                        }
                        else {
                            Errors.error((SubLObject)transformation_modules.$str47$Invalid_sense__s, sense);
                        }
                    }
                }
                cdolist_list_var2 = cdolist_list_var2.rest();
                permuted_asent2 = cdolist_list_var2.first();
            }
        }
        return Values.values((SubLObject)transformation_modules.NIL, (SubLObject)transformation_modules.NIL, (SubLObject)transformation_modules.NIL);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/modules/transformation-modules.lisp", position = 30633L)
    public static SubLObject trans_predicate_commutativity_rule_filter(final SubLObject asent, final SubLObject sense, final SubLObject rule) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        thread.resetMultipleValues();
        final SubLObject v_bindings = trans_predicate_commutativity_expand_int(asent, sense, rule);
        final SubLObject examine = thread.secondMultipleValue();
        final SubLObject predicate = thread.thirdMultipleValue();
        thread.resetMultipleValues();
        if (transformation_modules.NIL != v_bindings) {
            return (SubLObject)transformation_modules.T;
        }
        return (SubLObject)transformation_modules.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/modules/transformation-modules.lisp", position = 30898L)
    public static SubLObject trans_predicate_commutativity_expand(final SubLObject asent, final SubLObject sense, final SubLObject rule) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        thread.resetMultipleValues();
        final SubLObject v_bindings = trans_predicate_commutativity_expand_int(asent, sense, rule);
        final SubLObject examine = thread.secondMultipleValue();
        final SubLObject predicate = thread.thirdMultipleValue();
        thread.resetMultipleValues();
        if (transformation_modules.NIL != v_bindings) {
            backward.transformation_add_node(rule, examine, sense, v_bindings, additional_predicate_commutativity_supports(predicate));
        }
        return (SubLObject)transformation_modules.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/modules/transformation-modules.lisp", position = 31305L)
    public static SubLObject trans_predicate_symmetry_pos_cost(final SubLObject asent) {
        return trans_predicate_commutativity_cost(asent, (SubLObject)transformation_modules.$kw40$POS);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/modules/transformation-modules.lisp", position = 31554L)
    public static SubLObject trans_predicate_symmetry_neg_cost(final SubLObject asent) {
        return trans_predicate_commutativity_cost(asent, (SubLObject)transformation_modules.$kw14$NEG);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/modules/transformation-modules.lisp", position = 31670L)
    public static SubLObject trans_predicate_symmetry_pos_rule_select(final SubLObject asent) {
        return trans_predicate_commutativity_rule_select(asent, (SubLObject)transformation_modules.$kw40$POS);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/modules/transformation-modules.lisp", position = 31800L)
    public static SubLObject trans_predicate_symmetry_neg_rule_select(final SubLObject asent) {
        return trans_predicate_commutativity_rule_select(asent, (SubLObject)transformation_modules.$kw14$NEG);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/modules/transformation-modules.lisp", position = 31930L)
    public static SubLObject trans_predicate_symmetry_pos_rule_filter(final SubLObject asent, final SubLObject rule) {
        return trans_predicate_commutativity_rule_filter(asent, (SubLObject)transformation_modules.$kw40$POS, rule);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/modules/transformation-modules.lisp", position = 32070L)
    public static SubLObject trans_predicate_symmetry_neg_rule_filter(final SubLObject asent, final SubLObject rule) {
        return trans_predicate_commutativity_rule_filter(asent, (SubLObject)transformation_modules.$kw14$NEG, rule);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/modules/transformation-modules.lisp", position = 32210L)
    public static SubLObject trans_predicate_symmetry_pos_expand(final SubLObject asent, final SubLObject rule) {
        return trans_predicate_commutativity_expand(asent, (SubLObject)transformation_modules.$kw40$POS, rule);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/modules/transformation-modules.lisp", position = 32340L)
    public static SubLObject trans_predicate_symmetry_neg_expand(final SubLObject asent, final SubLObject rule) {
        return trans_predicate_commutativity_expand(asent, (SubLObject)transformation_modules.$kw14$NEG, rule);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/modules/transformation-modules.lisp", position = 34068L)
    public static SubLObject trans_predicate_commutative_pos_cost(final SubLObject asent) {
        return trans_predicate_commutativity_cost(asent, (SubLObject)transformation_modules.$kw40$POS);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/modules/transformation-modules.lisp", position = 34332L)
    public static SubLObject trans_predicate_commutative_neg_cost(final SubLObject asent) {
        return trans_predicate_commutativity_cost(asent, (SubLObject)transformation_modules.$kw14$NEG);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/modules/transformation-modules.lisp", position = 34451L)
    public static SubLObject trans_predicate_commutative_pos_rule_select(final SubLObject asent) {
        return trans_predicate_commutativity_rule_select(asent, (SubLObject)transformation_modules.$kw40$POS);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/modules/transformation-modules.lisp", position = 34584L)
    public static SubLObject trans_predicate_commutative_neg_rule_select(final SubLObject asent) {
        return trans_predicate_commutativity_rule_select(asent, (SubLObject)transformation_modules.$kw14$NEG);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/modules/transformation-modules.lisp", position = 34717L)
    public static SubLObject trans_predicate_commutative_pos_rule_filter(final SubLObject asent, final SubLObject rule) {
        return trans_predicate_commutativity_rule_filter(asent, (SubLObject)transformation_modules.$kw40$POS, rule);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/modules/transformation-modules.lisp", position = 34860L)
    public static SubLObject trans_predicate_commutative_neg_rule_filter(final SubLObject asent, final SubLObject rule) {
        return trans_predicate_commutativity_rule_filter(asent, (SubLObject)transformation_modules.$kw14$NEG, rule);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/modules/transformation-modules.lisp", position = 35003L)
    public static SubLObject trans_predicate_commutative_pos_expand(final SubLObject asent, final SubLObject rule) {
        return trans_predicate_commutativity_expand(asent, (SubLObject)transformation_modules.$kw40$POS, rule);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/modules/transformation-modules.lisp", position = 35136L)
    public static SubLObject trans_predicate_commutative_neg_expand(final SubLObject asent, final SubLObject rule) {
        return trans_predicate_commutativity_expand(asent, (SubLObject)transformation_modules.$kw14$NEG, rule);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/modules/transformation-modules.lisp", position = 37007L)
    public static SubLObject trans_predicate_partially_commutative_pos_cost(final SubLObject asent) {
        return trans_predicate_commutativity_cost(asent, (SubLObject)transformation_modules.$kw40$POS);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/modules/transformation-modules.lisp", position = 37321L)
    public static SubLObject trans_predicate_partially_commutative_neg_cost(final SubLObject asent) {
        return trans_predicate_commutativity_cost(asent, (SubLObject)transformation_modules.$kw14$NEG);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/modules/transformation-modules.lisp", position = 37450L)
    public static SubLObject trans_predicate_partially_commutative_pos_rule_select(final SubLObject asent) {
        return trans_predicate_commutativity_rule_select(asent, (SubLObject)transformation_modules.$kw40$POS);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/modules/transformation-modules.lisp", position = 37593L)
    public static SubLObject trans_predicate_partially_commutative_neg_rule_select(final SubLObject asent) {
        return trans_predicate_commutativity_rule_select(asent, (SubLObject)transformation_modules.$kw14$NEG);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/modules/transformation-modules.lisp", position = 37736L)
    public static SubLObject trans_predicate_partially_commutative_pos_rule_filter(final SubLObject asent, final SubLObject rule) {
        return trans_predicate_commutativity_rule_filter(asent, (SubLObject)transformation_modules.$kw40$POS, rule);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/modules/transformation-modules.lisp", position = 37889L)
    public static SubLObject trans_predicate_partially_commutative_neg_rule_filter(final SubLObject asent, final SubLObject rule) {
        return trans_predicate_commutativity_rule_filter(asent, (SubLObject)transformation_modules.$kw14$NEG, rule);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/modules/transformation-modules.lisp", position = 38042L)
    public static SubLObject trans_predicate_partially_commutative_pos_expand(final SubLObject asent, final SubLObject rule) {
        return trans_predicate_commutativity_expand(asent, (SubLObject)transformation_modules.$kw40$POS, rule);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/modules/transformation-modules.lisp", position = 38185L)
    public static SubLObject trans_predicate_partially_commutative_neg_expand(final SubLObject asent, final SubLObject rule) {
        return trans_predicate_commutativity_expand(asent, (SubLObject)transformation_modules.$kw14$NEG, rule);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/modules/transformation-modules.lisp", position = 40303L)
    public static SubLObject trans_predicate_asymmetry_cost(final SubLObject asent) {
        return trans_predicate_cost(asent, (SubLObject)transformation_modules.$kw40$POS);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/modules/transformation-modules.lisp", position = 40536L)
    public static SubLObject trans_predicate_asymmetry_rule_select(final SubLObject asent) {
        final SubLObject predicate = cycl_utilities.atomic_sentence_predicate(asent);
        SubLObject rules = new_selected_rules();
        SubLObject cdolist_list_var = backward_utilities.relevant_directions();
        SubLObject direction = (SubLObject)transformation_modules.NIL;
        direction = cdolist_list_var.first();
        while (transformation_modules.NIL != cdolist_list_var) {
            if (transformation_modules.NIL != kb_mapping_macros.do_predicate_rule_index_key_validator(predicate, (SubLObject)transformation_modules.$kw40$POS, direction)) {
                final SubLObject iterator_var = kb_mapping_macros.new_predicate_rule_final_index_spec_iterator(predicate, (SubLObject)transformation_modules.$kw40$POS, direction);
                SubLObject done_var = (SubLObject)transformation_modules.NIL;
                final SubLObject token_var = (SubLObject)transformation_modules.NIL;
                while (transformation_modules.NIL == done_var) {
                    final SubLObject final_index_spec = iteration.iteration_next_without_values_macro_helper(iterator_var, token_var);
                    final SubLObject valid = (SubLObject)SubLObjectFactory.makeBoolean(!token_var.eql(final_index_spec));
                    if (transformation_modules.NIL != valid) {
                        SubLObject final_index_iterator = (SubLObject)transformation_modules.NIL;
                        try {
                            final_index_iterator = kb_mapping_macros.new_final_index_iterator(final_index_spec, (SubLObject)transformation_modules.$kw46$RULE, (SubLObject)transformation_modules.NIL, direction);
                            SubLObject done_var_$30 = (SubLObject)transformation_modules.NIL;
                            final SubLObject token_var_$31 = (SubLObject)transformation_modules.NIL;
                            while (transformation_modules.NIL == done_var_$30) {
                                final SubLObject rule = iteration.iteration_next_without_values_macro_helper(final_index_iterator, token_var_$31);
                                final SubLObject valid_$32 = (SubLObject)SubLObjectFactory.makeBoolean(!token_var_$31.eql(rule));
                                if (transformation_modules.NIL != valid_$32) {
                                    rules = add_selected_rule(rule, rules);
                                }
                                done_var_$30 = (SubLObject)SubLObjectFactory.makeBoolean(transformation_modules.NIL == valid_$32);
                            }
                        }
                        finally {
                            final SubLObject _prev_bind_0 = Dynamic.currentBinding(Threads.$is_thread_performing_cleanupP$);
                            try {
                                Dynamic.bind(Threads.$is_thread_performing_cleanupP$, (SubLObject)transformation_modules.T);
                                final SubLObject _values = Values.getValuesAsVector();
                                if (transformation_modules.NIL != final_index_iterator) {
                                    kb_mapping_macros.destroy_final_index_iterator(final_index_iterator);
                                }
                                Values.restoreValuesFromVector(_values);
                            }
                            finally {
                                Dynamic.rebind(Threads.$is_thread_performing_cleanupP$, _prev_bind_0);
                            }
                        }
                    }
                    done_var = (SubLObject)SubLObjectFactory.makeBoolean(transformation_modules.NIL == valid);
                }
            }
            cdolist_list_var = cdolist_list_var.rest();
            direction = cdolist_list_var.first();
        }
        return finalize_selected_rules(rules);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/modules/transformation-modules.lisp", position = 40963L)
    public static SubLObject trans_predicate_asymmetry_expand_int(final SubLObject asent, final SubLObject rule) {
        final SubLObject predicate = cycl_utilities.atomic_sentence_predicate(asent);
        if (transformation_modules.NIL != el_utilities.el_binary_formula_p(asent)) {
            final SubLObject symmetric_asent = removal_modules_symmetry.symmetric_asent(asent);
            final SubLObject predicate_var = predicate;
            if (transformation_modules.NIL != backward_utilities.rule_relevant_to_proof(rule)) {
                final SubLObject cnf_var = assertions_high.assertion_cnf(rule);
                SubLObject cdolist_list_var = clauses.pos_lits(cnf_var);
                SubLObject examine = (SubLObject)transformation_modules.NIL;
                examine = cdolist_list_var.first();
                while (transformation_modules.NIL != cdolist_list_var) {
                    if (predicate_var.eql(cycl_utilities.atomic_sentence_predicate(examine))) {
                        final SubLObject v_bindings = unification_utilities.transformation_asent_unify(symmetric_asent, examine);
                        if (transformation_modules.NIL != v_bindings) {
                            return Values.values(v_bindings, examine, predicate);
                        }
                    }
                    cdolist_list_var = cdolist_list_var.rest();
                    examine = cdolist_list_var.first();
                }
            }
        }
        else {
            SubLObject cdolist_list_var2 = cycl_utilities.formula_commutative_permutations(asent, (SubLObject)transformation_modules.UNPROVIDED);
            SubLObject symmetric_asent2 = (SubLObject)transformation_modules.NIL;
            symmetric_asent2 = cdolist_list_var2.first();
            while (transformation_modules.NIL != cdolist_list_var2) {
                if (!symmetric_asent2.equal(asent)) {
                    final SubLObject predicate_var2 = predicate;
                    if (transformation_modules.NIL != backward_utilities.rule_relevant_to_proof(rule)) {
                        final SubLObject cnf_var2 = assertions_high.assertion_cnf(rule);
                        SubLObject cdolist_list_var_$33 = clauses.pos_lits(cnf_var2);
                        SubLObject examine2 = (SubLObject)transformation_modules.NIL;
                        examine2 = cdolist_list_var_$33.first();
                        while (transformation_modules.NIL != cdolist_list_var_$33) {
                            if (predicate_var2.eql(cycl_utilities.atomic_sentence_predicate(examine2))) {
                                final SubLObject v_bindings2 = unification_utilities.transformation_asent_unify(symmetric_asent2, examine2);
                                if (transformation_modules.NIL != v_bindings2) {
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
        return Values.values((SubLObject)transformation_modules.NIL, (SubLObject)transformation_modules.NIL, (SubLObject)transformation_modules.NIL);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/modules/transformation-modules.lisp", position = 41454L)
    public static SubLObject trans_predicate_asymmetry_rule_filter(final SubLObject asent, final SubLObject rule) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        thread.resetMultipleValues();
        final SubLObject v_bindings = trans_predicate_asymmetry_expand_int(asent, rule);
        final SubLObject examine = thread.secondMultipleValue();
        final SubLObject predicate = thread.thirdMultipleValue();
        thread.resetMultipleValues();
        if (transformation_modules.NIL != v_bindings) {
            return (SubLObject)transformation_modules.T;
        }
        return (SubLObject)transformation_modules.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/modules/transformation-modules.lisp", position = 41699L)
    public static SubLObject trans_predicate_asymmetry_expand(final SubLObject asent, final SubLObject rule) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        thread.resetMultipleValues();
        final SubLObject v_bindings = trans_predicate_asymmetry_expand_int(asent, rule);
        final SubLObject examine = thread.secondMultipleValue();
        final SubLObject predicate = thread.thirdMultipleValue();
        thread.resetMultipleValues();
        if (transformation_modules.NIL != v_bindings) {
            backward.transformation_add_node(rule, examine, (SubLObject)transformation_modules.$kw40$POS, v_bindings, additional_asymmetry_supports(predicate));
        }
        return (SubLObject)transformation_modules.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/modules/transformation-modules.lisp", position = 43263L)
    public static SubLObject trans_unbound_predicate_module_p(final SubLObject hl_module) {
        final SubLObject name = inference_modules.hl_module_name(hl_module);
        return subl_promotions.memberP(name, transformation_modules.$unbound_predicate_transformation_required_modules$.getGlobalValue(), Symbols.symbol_function((SubLObject)transformation_modules.EQL), (SubLObject)transformation_modules.UNPROVIDED);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/modules/transformation-modules.lisp", position = 43456L)
    public static SubLObject module_requires_unbound_predicate_transformationP(final SubLObject module_name) {
        return subl_promotions.memberP(module_name, transformation_modules.$unbound_predicate_transformation_required_modules$.getGlobalValue(), Symbols.symbol_function((SubLObject)transformation_modules.EQL), (SubLObject)transformation_modules.UNPROVIDED);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/modules/transformation-modules.lisp", position = 43628L)
    public static SubLObject trans_unbound_predicate_pos_required(final SubLObject asent) {
        return trans_unbound_predicate_required(asent);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/modules/transformation-modules.lisp", position = 43872L)
    public static SubLObject trans_unbound_predicate_neg_required(final SubLObject asent) {
        return trans_unbound_predicate_required(asent);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/modules/transformation-modules.lisp", position = 43984L)
    public static SubLObject trans_unbound_predicate_pos_cost(final SubLObject asent) {
        return trans_unbound_predicate_cost((SubLObject)transformation_modules.$kw40$POS);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/modules/transformation-modules.lisp", position = 44105L)
    public static SubLObject trans_unbound_predicate_neg_cost(final SubLObject asent) {
        return trans_unbound_predicate_cost((SubLObject)transformation_modules.$kw14$NEG);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/modules/transformation-modules.lisp", position = 44225L)
    public static SubLObject trans_unbound_predicate_pos_rule_select(final SubLObject asent) {
        return trans_unbound_predicate_rule_select((SubLObject)transformation_modules.$kw40$POS);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/modules/transformation-modules.lisp", position = 44360L)
    public static SubLObject trans_unbound_predicate_neg_rule_select(final SubLObject asent) {
        return trans_unbound_predicate_rule_select((SubLObject)transformation_modules.$kw14$NEG);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/modules/transformation-modules.lisp", position = 44494L)
    public static SubLObject trans_unbound_predicate_pos_rule_filter(final SubLObject asent, final SubLObject rule) {
        return trans_unbound_predicate_rule_filter((SubLObject)transformation_modules.$kw40$POS, rule);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/modules/transformation-modules.lisp", position = 44639L)
    public static SubLObject trans_unbound_predicate_neg_rule_filter(final SubLObject asent, final SubLObject rule) {
        return trans_unbound_predicate_rule_filter((SubLObject)transformation_modules.$kw14$NEG, rule);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/modules/transformation-modules.lisp", position = 44783L)
    public static SubLObject trans_unbound_predicate_pos_expand(final SubLObject asent, final SubLObject rule) {
        return trans_unbound_predicate_expand(asent, (SubLObject)transformation_modules.$kw40$POS, rule);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/modules/transformation-modules.lisp", position = 44907L)
    public static SubLObject trans_unbound_predicate_neg_expand(final SubLObject asent, final SubLObject rule) {
        return trans_unbound_predicate_expand(asent, (SubLObject)transformation_modules.$kw14$NEG, rule);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/modules/transformation-modules.lisp", position = 46416L)
    public static SubLObject trans_unbound_predicate_required(final SubLObject asent) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        return (SubLObject)SubLObjectFactory.makeBoolean(transformation_modules.NIL != control_vars.$unbound_rule_backchain_enabled$.getDynamicValue(thread) && (transformation_modules.NIL == control_vars.$unique_inference_result_bindings$.getDynamicValue(thread) || transformation_modules.NIL == variables.fully_bound_p(asent) || transformation_modules.NIL == transformation_gaf_truth_known(asent)));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/modules/transformation-modules.lisp", position = 46988L)
    public static SubLObject trans_unbound_predicate_cost(final SubLObject sense) {
        return auxiliary_indexing.relevant_num_unbound_rule_index(sense);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/modules/transformation-modules.lisp", position = 47091L)
    public static SubLObject trans_unbound_predicate_rule_select_internal(final SubLObject sense) {
        SubLObject rules = new_selected_rules();
        SubLObject cdolist_list_var = backward_utilities.relevant_directions();
        SubLObject direction = (SubLObject)transformation_modules.NIL;
        direction = cdolist_list_var.first();
        while (transformation_modules.NIL != cdolist_list_var) {
            if (transformation_modules.NIL != kb_mapping_macros.do_unbound_predicate_rule_index_key_validator(sense, direction)) {
                final SubLObject iterator_var = kb_mapping_macros.new_unbound_predicate_rule_final_index_spec_iterator(sense, direction);
                SubLObject done_var = (SubLObject)transformation_modules.NIL;
                final SubLObject token_var = (SubLObject)transformation_modules.NIL;
                while (transformation_modules.NIL == done_var) {
                    final SubLObject final_index_spec = iteration.iteration_next_without_values_macro_helper(iterator_var, token_var);
                    final SubLObject valid = (SubLObject)SubLObjectFactory.makeBoolean(!token_var.eql(final_index_spec));
                    if (transformation_modules.NIL != valid) {
                        SubLObject final_index_iterator = (SubLObject)transformation_modules.NIL;
                        try {
                            final_index_iterator = kb_mapping_macros.new_final_index_iterator(final_index_spec, (SubLObject)transformation_modules.$kw46$RULE, (SubLObject)transformation_modules.NIL, direction);
                            SubLObject done_var_$34 = (SubLObject)transformation_modules.NIL;
                            final SubLObject token_var_$35 = (SubLObject)transformation_modules.NIL;
                            while (transformation_modules.NIL == done_var_$34) {
                                final SubLObject rule = iteration.iteration_next_without_values_macro_helper(final_index_iterator, token_var_$35);
                                final SubLObject valid_$36 = (SubLObject)SubLObjectFactory.makeBoolean(!token_var_$35.eql(rule));
                                if (transformation_modules.NIL != valid_$36) {
                                    rules = add_selected_rule(rule, rules);
                                }
                                done_var_$34 = (SubLObject)SubLObjectFactory.makeBoolean(transformation_modules.NIL == valid_$36);
                            }
                        }
                        finally {
                            final SubLObject _prev_bind_0 = Dynamic.currentBinding(Threads.$is_thread_performing_cleanupP$);
                            try {
                                Dynamic.bind(Threads.$is_thread_performing_cleanupP$, (SubLObject)transformation_modules.T);
                                final SubLObject _values = Values.getValuesAsVector();
                                if (transformation_modules.NIL != final_index_iterator) {
                                    kb_mapping_macros.destroy_final_index_iterator(final_index_iterator);
                                }
                                Values.restoreValuesFromVector(_values);
                            }
                            finally {
                                Dynamic.rebind(Threads.$is_thread_performing_cleanupP$, _prev_bind_0);
                            }
                        }
                    }
                    done_var = (SubLObject)SubLObjectFactory.makeBoolean(transformation_modules.NIL == valid);
                }
            }
            cdolist_list_var = cdolist_list_var.rest();
            direction = cdolist_list_var.first();
        }
        return finalize_selected_rules(rules);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/modules/transformation-modules.lisp", position = 47091L)
    public static SubLObject trans_unbound_predicate_rule_select(final SubLObject sense) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject v_memoization_state = memoization_state.$memoization_state$.getDynamicValue(thread);
        SubLObject caching_state = (SubLObject)transformation_modules.NIL;
        if (transformation_modules.NIL == v_memoization_state) {
            return trans_unbound_predicate_rule_select_internal(sense);
        }
        caching_state = memoization_state.memoization_state_lookup(v_memoization_state, (SubLObject)transformation_modules.$sym81$TRANS_UNBOUND_PREDICATE_RULE_SELECT, (SubLObject)transformation_modules.UNPROVIDED);
        if (transformation_modules.NIL == caching_state) {
            caching_state = memoization_state.create_caching_state(memoization_state.memoization_state_lock(v_memoization_state), (SubLObject)transformation_modules.$sym81$TRANS_UNBOUND_PREDICATE_RULE_SELECT, (SubLObject)transformation_modules.ONE_INTEGER, (SubLObject)transformation_modules.NIL, (SubLObject)transformation_modules.EQL, (SubLObject)transformation_modules.UNPROVIDED);
            memoization_state.memoization_state_put(v_memoization_state, (SubLObject)transformation_modules.$sym81$TRANS_UNBOUND_PREDICATE_RULE_SELECT, caching_state);
        }
        SubLObject results = memoization_state.caching_state_lookup(caching_state, sense, memoization_state.$memoized_item_not_found$.getGlobalValue());
        if (results.eql(memoization_state.$memoized_item_not_found$.getGlobalValue())) {
            results = Values.arg2(thread.resetMultipleValues(), (SubLObject)Values.multiple_value_list(trans_unbound_predicate_rule_select_internal(sense)));
            memoization_state.caching_state_put(caching_state, sense, results, (SubLObject)transformation_modules.UNPROVIDED);
        }
        return memoization_state.caching_results(results);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/modules/transformation-modules.lisp", position = 47440L)
    public static SubLObject trans_unbound_predicate_rule_filter(final SubLObject sense, final SubLObject rule) {
        if (transformation_modules.NIL != backward_utilities.rule_relevant_to_proof(rule)) {
            final SubLObject cnf_var = assertions_high.assertion_cnf(rule);
            if (transformation_modules.$kw40$POS == sense) {
                SubLObject cdolist_list_var = clauses.pos_lits(cnf_var);
                SubLObject examine = (SubLObject)transformation_modules.NIL;
                examine = cdolist_list_var.first();
                while (transformation_modules.NIL != cdolist_list_var) {
                    if (transformation_modules.NIL != auxiliary_indexing.unbound_predicate_literal(examine)) {
                        return (SubLObject)transformation_modules.T;
                    }
                    cdolist_list_var = cdolist_list_var.rest();
                    examine = cdolist_list_var.first();
                }
            }
            else if (transformation_modules.$kw14$NEG == sense) {
                SubLObject cdolist_list_var = clauses.neg_lits(cnf_var);
                SubLObject examine = (SubLObject)transformation_modules.NIL;
                examine = cdolist_list_var.first();
                while (transformation_modules.NIL != cdolist_list_var) {
                    if (transformation_modules.NIL != auxiliary_indexing.unbound_predicate_literal(examine)) {
                        return (SubLObject)transformation_modules.T;
                    }
                    cdolist_list_var = cdolist_list_var.rest();
                    examine = cdolist_list_var.first();
                }
            }
            else {
                Errors.error((SubLObject)transformation_modules.$str47$Invalid_sense__s, sense);
            }
        }
        return (SubLObject)transformation_modules.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/modules/transformation-modules.lisp", position = 47638L)
    public static SubLObject trans_unbound_predicate_expand(final SubLObject asent, final SubLObject sense, final SubLObject rule) {
        if (transformation_modules.NIL != backward_utilities.rule_relevant_to_proof(rule)) {
            final SubLObject cnf_var = assertions_high.assertion_cnf(rule);
            if (transformation_modules.$kw40$POS == sense) {
                SubLObject cdolist_list_var = clauses.pos_lits(cnf_var);
                SubLObject examine = (SubLObject)transformation_modules.NIL;
                examine = cdolist_list_var.first();
                while (transformation_modules.NIL != cdolist_list_var) {
                    if (transformation_modules.NIL != auxiliary_indexing.unbound_predicate_literal(examine)) {
                        final SubLObject v_bindings = unification_utilities.transformation_asent_unify(asent, examine);
                        if (transformation_modules.NIL != v_bindings) {
                            backward.transformation_add_node(rule, examine, sense, v_bindings, (SubLObject)transformation_modules.UNPROVIDED);
                        }
                    }
                    cdolist_list_var = cdolist_list_var.rest();
                    examine = cdolist_list_var.first();
                }
            }
            else if (transformation_modules.$kw14$NEG == sense) {
                SubLObject cdolist_list_var = clauses.neg_lits(cnf_var);
                SubLObject examine = (SubLObject)transformation_modules.NIL;
                examine = cdolist_list_var.first();
                while (transformation_modules.NIL != cdolist_list_var) {
                    if (transformation_modules.NIL != auxiliary_indexing.unbound_predicate_literal(examine)) {
                        final SubLObject v_bindings = unification_utilities.transformation_asent_unify(asent, examine);
                        if (transformation_modules.NIL != v_bindings) {
                            backward.transformation_add_node(rule, examine, sense, v_bindings, (SubLObject)transformation_modules.UNPROVIDED);
                        }
                    }
                    cdolist_list_var = cdolist_list_var.rest();
                    examine = cdolist_list_var.first();
                }
            }
            else {
                Errors.error((SubLObject)transformation_modules.$str47$Invalid_sense__s, sense);
            }
        }
        return (SubLObject)transformation_modules.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/modules/transformation-modules.lisp", position = 48650L)
    public static SubLObject module_requires_hl_predicate_transformationP(final SubLObject module_name) {
        return subl_promotions.memberP(module_name, transformation_modules.$hl_predicate_transformation_required_modules$.getGlobalValue(), Symbols.symbol_function((SubLObject)transformation_modules.EQL), (SubLObject)transformation_modules.UNPROVIDED);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/modules/transformation-modules.lisp", position = 48812L)
    public static SubLObject trans_isa_pos_required(final SubLObject asent) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        return (SubLObject)SubLObjectFactory.makeBoolean(transformation_modules.NIL != control_vars.$hl_failure_backchaining$.getDynamicValue(thread) || transformation_modules.NIL != inference_trampolines.inference_collection_backchain_encouragedP(cycl_utilities.atomic_sentence_arg2(asent, (SubLObject)transformation_modules.UNPROVIDED), mt_relevance_macros.$mt$.getDynamicValue(thread)));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/modules/transformation-modules.lisp", position = 49038L)
    public static SubLObject trans_isa_neg_required(final SubLObject asent) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        return control_vars.$hl_failure_backchaining$.getDynamicValue(thread);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/modules/transformation-modules.lisp", position = 49138L)
    public static SubLObject trans_isa_pos_cost(final SubLObject asent) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        if (transformation_modules.NIL != inference_trampolines.inference_backchain_required_asentP(asent, mt_relevance_macros.$mt$.getDynamicValue(thread))) {
            return trans_isa_pos_rule_select_count(asent, mt_relevance_macros.$mt$.getDynamicValue(thread));
        }
        return cardinality_estimates.spec_cardinality(cycl_utilities.atomic_sentence_arg2(asent, (SubLObject)transformation_modules.UNPROVIDED));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/modules/transformation-modules.lisp", position = 49395L)
    public static SubLObject trans_isa_neg_cost(final SubLObject asent) {
        return cardinality_estimates.genl_cardinality(cycl_utilities.atomic_sentence_arg2(asent, (SubLObject)transformation_modules.UNPROVIDED));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/modules/transformation-modules.lisp", position = 49526L)
    public static SubLObject inference_memoized_all_specs_internal(final SubLObject col, SubLObject mt) {
        if (mt == transformation_modules.UNPROVIDED) {
            mt = (SubLObject)transformation_modules.NIL;
        }
        return genls.all_specs(col, mt, (SubLObject)transformation_modules.UNPROVIDED);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/modules/transformation-modules.lisp", position = 49526L)
    public static SubLObject inference_memoized_all_specs(final SubLObject col, SubLObject mt) {
        if (mt == transformation_modules.UNPROVIDED) {
            mt = (SubLObject)transformation_modules.NIL;
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject v_memoization_state = memoization_state.$memoization_state$.getDynamicValue(thread);
        SubLObject caching_state = (SubLObject)transformation_modules.NIL;
        if (transformation_modules.NIL == v_memoization_state) {
            return inference_memoized_all_specs_internal(col, mt);
        }
        caching_state = memoization_state.memoization_state_lookup(v_memoization_state, (SubLObject)transformation_modules.$sym83$INFERENCE_MEMOIZED_ALL_SPECS, (SubLObject)transformation_modules.UNPROVIDED);
        if (transformation_modules.NIL == caching_state) {
            caching_state = memoization_state.create_caching_state(memoization_state.memoization_state_lock(v_memoization_state), (SubLObject)transformation_modules.$sym83$INFERENCE_MEMOIZED_ALL_SPECS, (SubLObject)transformation_modules.TWO_INTEGER, (SubLObject)transformation_modules.NIL, (SubLObject)transformation_modules.EQL, (SubLObject)transformation_modules.UNPROVIDED);
            memoization_state.memoization_state_put(v_memoization_state, (SubLObject)transformation_modules.$sym83$INFERENCE_MEMOIZED_ALL_SPECS, caching_state);
        }
        final SubLObject sxhash = memoization_state.sxhash_calc_2(col, mt);
        final SubLObject collisions = memoization_state.caching_state_lookup(caching_state, sxhash, (SubLObject)transformation_modules.UNPROVIDED);
        if (!collisions.eql(memoization_state.$memoized_item_not_found$.getGlobalValue())) {
            SubLObject cdolist_list_var = collisions;
            SubLObject collision = (SubLObject)transformation_modules.NIL;
            collision = cdolist_list_var.first();
            while (transformation_modules.NIL != cdolist_list_var) {
                SubLObject cached_args = collision.first();
                final SubLObject results2 = conses_high.second(collision);
                if (col.eql(cached_args.first())) {
                    cached_args = cached_args.rest();
                    if (transformation_modules.NIL != cached_args && transformation_modules.NIL == cached_args.rest() && mt.eql(cached_args.first())) {
                        return memoization_state.caching_results(results2);
                    }
                }
                cdolist_list_var = cdolist_list_var.rest();
                collision = cdolist_list_var.first();
            }
        }
        final SubLObject results3 = Values.arg2(thread.resetMultipleValues(), (SubLObject)Values.multiple_value_list(inference_memoized_all_specs_internal(col, mt)));
        memoization_state.caching_state_enter_multi_key_n(caching_state, sxhash, collisions, results3, (SubLObject)ConsesLow.list(col, mt));
        return memoization_state.caching_results(results3);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/modules/transformation-modules.lisp", position = 49668L)
    public static SubLObject trans_isa_pos_rule_select_count_internal(final SubLObject asent, final SubLObject mt) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject result = (SubLObject)transformation_modules.NIL;
        final SubLObject _prev_bind_0 = mt_relevance_macros.$mt$.currentBinding(thread);
        final SubLObject _prev_bind_2 = mt_relevance_macros.$relevant_mt_function$.currentBinding(thread);
        final SubLObject _prev_bind_3 = mt_relevance_macros.$relevant_mts$.currentBinding(thread);
        try {
            mt_relevance_macros.$mt$.bind(mt_relevance_macros.update_inference_mt_relevance_mt(mt), thread);
            mt_relevance_macros.$relevant_mt_function$.bind(mt_relevance_macros.update_inference_mt_relevance_function(mt), thread);
            mt_relevance_macros.$relevant_mts$.bind(mt_relevance_macros.update_inference_mt_relevance_mt_list(mt), thread);
            result = Sequences.length(trans_isa_pos_rule_select(asent));
        }
        finally {
            mt_relevance_macros.$relevant_mts$.rebind(_prev_bind_3, thread);
            mt_relevance_macros.$relevant_mt_function$.rebind(_prev_bind_2, thread);
            mt_relevance_macros.$mt$.rebind(_prev_bind_0, thread);
        }
        return result;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/modules/transformation-modules.lisp", position = 49668L)
    public static SubLObject trans_isa_pos_rule_select_count(final SubLObject asent, final SubLObject mt) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject v_memoization_state = memoization_state.$memoization_state$.getDynamicValue(thread);
        SubLObject caching_state = (SubLObject)transformation_modules.NIL;
        if (transformation_modules.NIL == v_memoization_state) {
            return trans_isa_pos_rule_select_count_internal(asent, mt);
        }
        caching_state = memoization_state.memoization_state_lookup(v_memoization_state, (SubLObject)transformation_modules.$sym84$TRANS_ISA_POS_RULE_SELECT_COUNT, (SubLObject)transformation_modules.UNPROVIDED);
        if (transformation_modules.NIL == caching_state) {
            caching_state = memoization_state.create_caching_state(memoization_state.memoization_state_lock(v_memoization_state), (SubLObject)transformation_modules.$sym84$TRANS_ISA_POS_RULE_SELECT_COUNT, (SubLObject)transformation_modules.TWO_INTEGER, (SubLObject)transformation_modules.NIL, (SubLObject)transformation_modules.EQUAL, (SubLObject)transformation_modules.UNPROVIDED);
            memoization_state.memoization_state_put(v_memoization_state, (SubLObject)transformation_modules.$sym84$TRANS_ISA_POS_RULE_SELECT_COUNT, caching_state);
        }
        final SubLObject sxhash = memoization_state.sxhash_calc_2(asent, mt);
        final SubLObject collisions = memoization_state.caching_state_lookup(caching_state, sxhash, (SubLObject)transformation_modules.UNPROVIDED);
        if (!collisions.eql(memoization_state.$memoized_item_not_found$.getGlobalValue())) {
            SubLObject cdolist_list_var = collisions;
            SubLObject collision = (SubLObject)transformation_modules.NIL;
            collision = cdolist_list_var.first();
            while (transformation_modules.NIL != cdolist_list_var) {
                SubLObject cached_args = collision.first();
                final SubLObject results2 = conses_high.second(collision);
                if (asent.equal(cached_args.first())) {
                    cached_args = cached_args.rest();
                    if (transformation_modules.NIL != cached_args && transformation_modules.NIL == cached_args.rest() && mt.equal(cached_args.first())) {
                        return memoization_state.caching_results(results2);
                    }
                }
                cdolist_list_var = cdolist_list_var.rest();
                collision = cdolist_list_var.first();
            }
        }
        final SubLObject results3 = Values.arg2(thread.resetMultipleValues(), (SubLObject)Values.multiple_value_list(trans_isa_pos_rule_select_count_internal(asent, mt)));
        memoization_state.caching_state_enter_multi_key_n(caching_state, sxhash, collisions, results3, (SubLObject)ConsesLow.list(asent, mt));
        return memoization_state.caching_results(results3);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/modules/transformation-modules.lisp", position = 49892L)
    public static SubLObject trans_isa_pos_rule_select(final SubLObject asent) {
        SubLObject rules = new_selected_rules();
        final SubLObject inference_col = cycl_utilities.atomic_sentence_arg2(asent, (SubLObject)transformation_modules.UNPROVIDED);
        SubLObject cdolist_list_var;
        final SubLObject rule_subsets = cdolist_list_var = inference_memoized_all_specs(inference_col, (SubLObject)transformation_modules.NIL);
        SubLObject rule_subset = (SubLObject)transformation_modules.NIL;
        rule_subset = cdolist_list_var.first();
        while (transformation_modules.NIL != cdolist_list_var) {
            SubLObject cdolist_list_var_$37 = backward_utilities.relevant_directions();
            SubLObject direction = (SubLObject)transformation_modules.NIL;
            direction = cdolist_list_var_$37.first();
            while (transformation_modules.NIL != cdolist_list_var_$37) {
                if (transformation_modules.NIL != kb_mapping_macros.do_isa_rule_index_key_validator(rule_subset, (SubLObject)transformation_modules.$kw40$POS, direction)) {
                    final SubLObject iterator_var = kb_mapping_macros.new_isa_rule_final_index_spec_iterator(rule_subset, (SubLObject)transformation_modules.$kw40$POS, direction);
                    SubLObject done_var = (SubLObject)transformation_modules.NIL;
                    final SubLObject token_var = (SubLObject)transformation_modules.NIL;
                    while (transformation_modules.NIL == done_var) {
                        final SubLObject final_index_spec = iteration.iteration_next_without_values_macro_helper(iterator_var, token_var);
                        final SubLObject valid = (SubLObject)SubLObjectFactory.makeBoolean(!token_var.eql(final_index_spec));
                        if (transformation_modules.NIL != valid) {
                            SubLObject final_index_iterator = (SubLObject)transformation_modules.NIL;
                            try {
                                final_index_iterator = kb_mapping_macros.new_final_index_iterator(final_index_spec, (SubLObject)transformation_modules.$kw46$RULE, (SubLObject)transformation_modules.NIL, direction);
                                SubLObject done_var_$38 = (SubLObject)transformation_modules.NIL;
                                final SubLObject token_var_$39 = (SubLObject)transformation_modules.NIL;
                                while (transformation_modules.NIL == done_var_$38) {
                                    final SubLObject rule = iteration.iteration_next_without_values_macro_helper(final_index_iterator, token_var_$39);
                                    final SubLObject valid_$40 = (SubLObject)SubLObjectFactory.makeBoolean(!token_var_$39.eql(rule));
                                    if (transformation_modules.NIL != valid_$40) {
                                        rules = add_selected_rule(rule, rules);
                                    }
                                    done_var_$38 = (SubLObject)SubLObjectFactory.makeBoolean(transformation_modules.NIL == valid_$40);
                                }
                            }
                            finally {
                                final SubLObject _prev_bind_0 = Dynamic.currentBinding(Threads.$is_thread_performing_cleanupP$);
                                try {
                                    Dynamic.bind(Threads.$is_thread_performing_cleanupP$, (SubLObject)transformation_modules.T);
                                    final SubLObject _values = Values.getValuesAsVector();
                                    if (transformation_modules.NIL != final_index_iterator) {
                                        kb_mapping_macros.destroy_final_index_iterator(final_index_iterator);
                                    }
                                    Values.restoreValuesFromVector(_values);
                                }
                                finally {
                                    Dynamic.rebind(Threads.$is_thread_performing_cleanupP$, _prev_bind_0);
                                }
                            }
                        }
                        done_var = (SubLObject)SubLObjectFactory.makeBoolean(transformation_modules.NIL == valid);
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
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/modules/transformation-modules.lisp", position = 50371L)
    public static SubLObject trans_isa_pos_expand_int(final SubLObject asent, final SubLObject rule) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject inference_arg1 = cycl_utilities.atomic_sentence_arg1(asent, (SubLObject)transformation_modules.UNPROVIDED);
        final SubLObject inference_col = cycl_utilities.atomic_sentence_arg2(asent, (SubLObject)transformation_modules.UNPROVIDED);
        if (transformation_modules.NIL != backward_utilities.rule_relevant_to_proof(rule)) {
            final SubLObject cnf_var = assertions_high.assertion_cnf(rule);
            SubLObject cdolist_list_var = clauses.pos_lits(cnf_var);
            SubLObject examine = (SubLObject)transformation_modules.NIL;
            examine = cdolist_list_var.first();
            while (transformation_modules.NIL != cdolist_list_var) {
                if (transformation_modules.$const85$isa.eql(cycl_utilities.atomic_sentence_predicate(examine))) {
                    final SubLObject rule_subset = cycl_utilities.atomic_sentence_arg2(examine, (SubLObject)transformation_modules.UNPROVIDED);
                    if (transformation_modules.NIL != variables.fully_bound_p(rule_subset) && transformation_modules.NIL != genls.genlsP(rule_subset, inference_col, (SubLObject)transformation_modules.NIL, (SubLObject)transformation_modules.UNPROVIDED)) {
                        thread.resetMultipleValues();
                        final SubLObject v_bindings = unification_utilities.term_unify(inference_arg1, cycl_utilities.atomic_sentence_arg1(examine, (SubLObject)transformation_modules.UNPROVIDED), (SubLObject)transformation_modules.NIL, (SubLObject)transformation_modules.T);
                        final SubLObject unify_justification = thread.secondMultipleValue();
                        thread.resetMultipleValues();
                        if (transformation_modules.NIL != v_bindings) {
                            return Values.values(v_bindings, examine, inference_col, rule_subset, unify_justification);
                        }
                    }
                }
                cdolist_list_var = cdolist_list_var.rest();
                examine = cdolist_list_var.first();
            }
        }
        return Values.values((SubLObject)transformation_modules.NIL, (SubLObject)transformation_modules.NIL, (SubLObject)transformation_modules.NIL, (SubLObject)transformation_modules.NIL, (SubLObject)transformation_modules.NIL);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/modules/transformation-modules.lisp", position = 51102L)
    public static SubLObject trans_isa_pos_rule_filter(final SubLObject asent, final SubLObject rule) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        thread.resetMultipleValues();
        final SubLObject v_bindings = trans_isa_pos_expand_int(asent, rule);
        final SubLObject examine = thread.secondMultipleValue();
        final SubLObject inference_col = thread.thirdMultipleValue();
        final SubLObject rule_subset = thread.fourthMultipleValue();
        final SubLObject more_supports = thread.fifthMultipleValue();
        thread.resetMultipleValues();
        if (transformation_modules.NIL != v_bindings) {
            return (SubLObject)transformation_modules.T;
        }
        return (SubLObject)transformation_modules.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/modules/transformation-modules.lisp", position = 51383L)
    public static SubLObject trans_isa_pos_expand(final SubLObject asent, final SubLObject rule) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        thread.resetMultipleValues();
        final SubLObject v_bindings = trans_isa_pos_expand_int(asent, rule);
        final SubLObject examine = thread.secondMultipleValue();
        final SubLObject inference_col = thread.thirdMultipleValue();
        final SubLObject rule_subset = thread.fourthMultipleValue();
        final SubLObject more_supports = thread.fifthMultipleValue();
        thread.resetMultipleValues();
        if (transformation_modules.NIL != v_bindings) {
            final SubLObject genls_supports = additional_genls_supports(rule_subset, inference_col);
            backward.transformation_add_node(rule, examine, (SubLObject)transformation_modules.$kw40$POS, v_bindings, ConsesLow.append(genls_supports, more_supports));
        }
        return (SubLObject)transformation_modules.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/modules/transformation-modules.lisp", position = 51813L)
    public static SubLObject trans_isa_neg_rule_select(final SubLObject asent) {
        SubLObject rules = new_selected_rules();
        final SubLObject inference_col = cycl_utilities.atomic_sentence_arg2(asent, (SubLObject)transformation_modules.UNPROVIDED);
        SubLObject cdolist_list_var;
        final SubLObject rule_genls = cdolist_list_var = genls.all_genls(inference_col, (SubLObject)transformation_modules.NIL, (SubLObject)transformation_modules.UNPROVIDED);
        SubLObject rule_genl = (SubLObject)transformation_modules.NIL;
        rule_genl = cdolist_list_var.first();
        while (transformation_modules.NIL != cdolist_list_var) {
            SubLObject cdolist_list_var_$41 = backward_utilities.relevant_directions();
            SubLObject direction = (SubLObject)transformation_modules.NIL;
            direction = cdolist_list_var_$41.first();
            while (transformation_modules.NIL != cdolist_list_var_$41) {
                if (transformation_modules.NIL != kb_mapping_macros.do_isa_rule_index_key_validator(rule_genl, (SubLObject)transformation_modules.$kw14$NEG, direction)) {
                    final SubLObject iterator_var = kb_mapping_macros.new_isa_rule_final_index_spec_iterator(rule_genl, (SubLObject)transformation_modules.$kw14$NEG, direction);
                    SubLObject done_var = (SubLObject)transformation_modules.NIL;
                    final SubLObject token_var = (SubLObject)transformation_modules.NIL;
                    while (transformation_modules.NIL == done_var) {
                        final SubLObject final_index_spec = iteration.iteration_next_without_values_macro_helper(iterator_var, token_var);
                        final SubLObject valid = (SubLObject)SubLObjectFactory.makeBoolean(!token_var.eql(final_index_spec));
                        if (transformation_modules.NIL != valid) {
                            SubLObject final_index_iterator = (SubLObject)transformation_modules.NIL;
                            try {
                                final_index_iterator = kb_mapping_macros.new_final_index_iterator(final_index_spec, (SubLObject)transformation_modules.$kw46$RULE, (SubLObject)transformation_modules.NIL, direction);
                                SubLObject done_var_$42 = (SubLObject)transformation_modules.NIL;
                                final SubLObject token_var_$43 = (SubLObject)transformation_modules.NIL;
                                while (transformation_modules.NIL == done_var_$42) {
                                    final SubLObject rule = iteration.iteration_next_without_values_macro_helper(final_index_iterator, token_var_$43);
                                    final SubLObject valid_$44 = (SubLObject)SubLObjectFactory.makeBoolean(!token_var_$43.eql(rule));
                                    if (transformation_modules.NIL != valid_$44) {
                                        rules = add_selected_rule(rule, rules);
                                    }
                                    done_var_$42 = (SubLObject)SubLObjectFactory.makeBoolean(transformation_modules.NIL == valid_$44);
                                }
                            }
                            finally {
                                final SubLObject _prev_bind_0 = Dynamic.currentBinding(Threads.$is_thread_performing_cleanupP$);
                                try {
                                    Dynamic.bind(Threads.$is_thread_performing_cleanupP$, (SubLObject)transformation_modules.T);
                                    final SubLObject _values = Values.getValuesAsVector();
                                    if (transformation_modules.NIL != final_index_iterator) {
                                        kb_mapping_macros.destroy_final_index_iterator(final_index_iterator);
                                    }
                                    Values.restoreValuesFromVector(_values);
                                }
                                finally {
                                    Dynamic.rebind(Threads.$is_thread_performing_cleanupP$, _prev_bind_0);
                                }
                            }
                        }
                        done_var = (SubLObject)SubLObjectFactory.makeBoolean(transformation_modules.NIL == valid);
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
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/modules/transformation-modules.lisp", position = 52268L)
    public static SubLObject trans_isa_neg_expand_int(final SubLObject asent, final SubLObject rule) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject inference_arg1 = cycl_utilities.atomic_sentence_arg1(asent, (SubLObject)transformation_modules.UNPROVIDED);
        final SubLObject inference_col = cycl_utilities.atomic_sentence_arg2(asent, (SubLObject)transformation_modules.UNPROVIDED);
        if (transformation_modules.NIL != backward_utilities.rule_relevant_to_proof(rule)) {
            final SubLObject cnf_var = assertions_high.assertion_cnf(rule);
            SubLObject cdolist_list_var = clauses.neg_lits(cnf_var);
            SubLObject examine = (SubLObject)transformation_modules.NIL;
            examine = cdolist_list_var.first();
            while (transformation_modules.NIL != cdolist_list_var) {
                if (transformation_modules.$const85$isa.eql(cycl_utilities.atomic_sentence_predicate(examine))) {
                    final SubLObject rule_genl = cycl_utilities.atomic_sentence_arg2(examine, (SubLObject)transformation_modules.UNPROVIDED);
                    if (transformation_modules.NIL != variables.fully_bound_p(rule_genl) && transformation_modules.NIL != genls.genlsP(inference_col, rule_genl, (SubLObject)transformation_modules.NIL, (SubLObject)transformation_modules.UNPROVIDED)) {
                        thread.resetMultipleValues();
                        final SubLObject v_bindings = unification_utilities.term_unify(inference_arg1, cycl_utilities.atomic_sentence_arg1(examine, (SubLObject)transformation_modules.UNPROVIDED), (SubLObject)transformation_modules.NIL, (SubLObject)transformation_modules.T);
                        final SubLObject unify_justification = thread.secondMultipleValue();
                        thread.resetMultipleValues();
                        if (transformation_modules.NIL != v_bindings) {
                            return Values.values(v_bindings, examine, inference_col, rule_genl, unify_justification);
                        }
                    }
                }
                cdolist_list_var = cdolist_list_var.rest();
                examine = cdolist_list_var.first();
            }
        }
        return Values.values((SubLObject)transformation_modules.NIL, (SubLObject)transformation_modules.NIL, (SubLObject)transformation_modules.NIL, (SubLObject)transformation_modules.NIL, (SubLObject)transformation_modules.NIL);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/modules/transformation-modules.lisp", position = 52993L)
    public static SubLObject trans_isa_neg_rule_filter(final SubLObject asent, final SubLObject rule) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        thread.resetMultipleValues();
        final SubLObject v_bindings = trans_isa_neg_expand_int(asent, rule);
        final SubLObject examine = thread.secondMultipleValue();
        final SubLObject inference_col = thread.thirdMultipleValue();
        final SubLObject rule_genl = thread.fourthMultipleValue();
        final SubLObject more_supports = thread.fifthMultipleValue();
        thread.resetMultipleValues();
        if (transformation_modules.NIL != v_bindings) {
            return (SubLObject)transformation_modules.T;
        }
        return (SubLObject)transformation_modules.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/modules/transformation-modules.lisp", position = 53270L)
    public static SubLObject trans_isa_neg_expand(final SubLObject asent, final SubLObject rule) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        thread.resetMultipleValues();
        final SubLObject v_bindings = trans_isa_neg_expand_int(asent, rule);
        final SubLObject examine = thread.secondMultipleValue();
        final SubLObject inference_col = thread.thirdMultipleValue();
        final SubLObject rule_genl = thread.fourthMultipleValue();
        final SubLObject more_supports = thread.fifthMultipleValue();
        thread.resetMultipleValues();
        if (transformation_modules.NIL != v_bindings) {
            final SubLObject genls_supports = additional_genls_supports(inference_col, rule_genl);
            backward.transformation_add_node(rule, examine, (SubLObject)transformation_modules.$kw14$NEG, v_bindings, ConsesLow.append(genls_supports, more_supports));
        }
        return (SubLObject)transformation_modules.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/modules/transformation-modules.lisp", position = 55070L)
    public static SubLObject trans_genls_pos_required(final SubLObject asent) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        return control_vars.$hl_failure_backchaining$.getDynamicValue(thread);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/modules/transformation-modules.lisp", position = 55253L)
    public static SubLObject trans_genls_neg_required(final SubLObject asent) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        return control_vars.$hl_failure_backchaining$.getDynamicValue(thread);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/modules/transformation-modules.lisp", position = 55355L)
    public static SubLObject trans_genls_pos_cost(final SubLObject asent) {
        return cardinality_estimates.spec_cardinality(cycl_utilities.atomic_sentence_arg2(asent, (SubLObject)transformation_modules.UNPROVIDED));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/modules/transformation-modules.lisp", position = 55489L)
    public static SubLObject trans_genls_neg_cost(final SubLObject asent) {
        return cardinality_estimates.genl_cardinality(cycl_utilities.atomic_sentence_arg2(asent, (SubLObject)transformation_modules.UNPROVIDED));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/modules/transformation-modules.lisp", position = 55622L)
    public static SubLObject trans_genls_pos_rule_select(final SubLObject asent) {
        SubLObject rules = new_selected_rules();
        final SubLObject inference_col = cycl_utilities.atomic_sentence_arg2(asent, (SubLObject)transformation_modules.UNPROVIDED);
        SubLObject cdolist_list_var;
        final SubLObject rule_subsets = cdolist_list_var = inference_memoized_all_specs(inference_col, (SubLObject)transformation_modules.NIL);
        SubLObject rule_subset = (SubLObject)transformation_modules.NIL;
        rule_subset = cdolist_list_var.first();
        while (transformation_modules.NIL != cdolist_list_var) {
            SubLObject cdolist_list_var_$45 = backward_utilities.relevant_directions();
            SubLObject direction = (SubLObject)transformation_modules.NIL;
            direction = cdolist_list_var_$45.first();
            while (transformation_modules.NIL != cdolist_list_var_$45) {
                if (transformation_modules.NIL != kb_mapping_macros.do_genls_rule_index_key_validator(rule_subset, (SubLObject)transformation_modules.$kw40$POS, direction)) {
                    final SubLObject iterator_var = kb_mapping_macros.new_genls_rule_final_index_spec_iterator(rule_subset, (SubLObject)transformation_modules.$kw40$POS, direction);
                    SubLObject done_var = (SubLObject)transformation_modules.NIL;
                    final SubLObject token_var = (SubLObject)transformation_modules.NIL;
                    while (transformation_modules.NIL == done_var) {
                        final SubLObject final_index_spec = iteration.iteration_next_without_values_macro_helper(iterator_var, token_var);
                        final SubLObject valid = (SubLObject)SubLObjectFactory.makeBoolean(!token_var.eql(final_index_spec));
                        if (transformation_modules.NIL != valid) {
                            SubLObject final_index_iterator = (SubLObject)transformation_modules.NIL;
                            try {
                                final_index_iterator = kb_mapping_macros.new_final_index_iterator(final_index_spec, (SubLObject)transformation_modules.$kw46$RULE, (SubLObject)transformation_modules.NIL, direction);
                                SubLObject done_var_$46 = (SubLObject)transformation_modules.NIL;
                                final SubLObject token_var_$47 = (SubLObject)transformation_modules.NIL;
                                while (transformation_modules.NIL == done_var_$46) {
                                    final SubLObject rule = iteration.iteration_next_without_values_macro_helper(final_index_iterator, token_var_$47);
                                    final SubLObject valid_$48 = (SubLObject)SubLObjectFactory.makeBoolean(!token_var_$47.eql(rule));
                                    if (transformation_modules.NIL != valid_$48) {
                                        rules = add_selected_rule(rule, rules);
                                    }
                                    done_var_$46 = (SubLObject)SubLObjectFactory.makeBoolean(transformation_modules.NIL == valid_$48);
                                }
                            }
                            finally {
                                final SubLObject _prev_bind_0 = Dynamic.currentBinding(Threads.$is_thread_performing_cleanupP$);
                                try {
                                    Dynamic.bind(Threads.$is_thread_performing_cleanupP$, (SubLObject)transformation_modules.T);
                                    final SubLObject _values = Values.getValuesAsVector();
                                    if (transformation_modules.NIL != final_index_iterator) {
                                        kb_mapping_macros.destroy_final_index_iterator(final_index_iterator);
                                    }
                                    Values.restoreValuesFromVector(_values);
                                }
                                finally {
                                    Dynamic.rebind(Threads.$is_thread_performing_cleanupP$, _prev_bind_0);
                                }
                            }
                        }
                        done_var = (SubLObject)SubLObjectFactory.makeBoolean(transformation_modules.NIL == valid);
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
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/modules/transformation-modules.lisp", position = 56105L)
    public static SubLObject trans_genls_pos_expand_int(final SubLObject asent, final SubLObject rule) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject inference_arg1 = cycl_utilities.atomic_sentence_arg1(asent, (SubLObject)transformation_modules.UNPROVIDED);
        final SubLObject inference_col = cycl_utilities.atomic_sentence_arg2(asent, (SubLObject)transformation_modules.UNPROVIDED);
        if (transformation_modules.NIL != backward_utilities.rule_relevant_to_proof(rule)) {
            final SubLObject cnf_var = assertions_high.assertion_cnf(rule);
            SubLObject cdolist_list_var = clauses.pos_lits(cnf_var);
            SubLObject examine = (SubLObject)transformation_modules.NIL;
            examine = cdolist_list_var.first();
            while (transformation_modules.NIL != cdolist_list_var) {
                if (transformation_modules.$const0$genls.eql(cycl_utilities.atomic_sentence_predicate(examine))) {
                    final SubLObject rule_subset = cycl_utilities.atomic_sentence_arg2(examine, (SubLObject)transformation_modules.UNPROVIDED);
                    if (transformation_modules.NIL != variables.fully_bound_p(rule_subset) && transformation_modules.NIL != genls.genlsP(rule_subset, inference_col, (SubLObject)transformation_modules.NIL, (SubLObject)transformation_modules.UNPROVIDED)) {
                        thread.resetMultipleValues();
                        final SubLObject v_bindings = unification_utilities.term_unify(inference_arg1, cycl_utilities.atomic_sentence_arg1(examine, (SubLObject)transformation_modules.UNPROVIDED), (SubLObject)transformation_modules.NIL, (SubLObject)transformation_modules.T);
                        final SubLObject unify_justification = thread.secondMultipleValue();
                        thread.resetMultipleValues();
                        if (transformation_modules.NIL != v_bindings) {
                            return Values.values(v_bindings, examine, inference_col, rule_subset, unify_justification);
                        }
                    }
                }
                cdolist_list_var = cdolist_list_var.rest();
                examine = cdolist_list_var.first();
            }
        }
        return Values.values((SubLObject)transformation_modules.NIL, (SubLObject)transformation_modules.NIL, (SubLObject)transformation_modules.NIL, (SubLObject)transformation_modules.NIL, (SubLObject)transformation_modules.NIL);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/modules/transformation-modules.lisp", position = 56837L)
    public static SubLObject trans_genls_pos_rule_filter(final SubLObject asent, final SubLObject rule) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        thread.resetMultipleValues();
        final SubLObject v_bindings = trans_genls_pos_expand_int(asent, rule);
        final SubLObject examine = thread.secondMultipleValue();
        final SubLObject inference_col = thread.thirdMultipleValue();
        final SubLObject rule_subset = thread.fourthMultipleValue();
        final SubLObject more_supports = thread.fifthMultipleValue();
        thread.resetMultipleValues();
        if (transformation_modules.NIL != v_bindings) {
            return (SubLObject)transformation_modules.T;
        }
        return (SubLObject)transformation_modules.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/modules/transformation-modules.lisp", position = 57122L)
    public static SubLObject trans_genls_pos_expand(final SubLObject asent, final SubLObject rule) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        thread.resetMultipleValues();
        final SubLObject v_bindings = trans_genls_pos_expand_int(asent, rule);
        final SubLObject examine = thread.secondMultipleValue();
        final SubLObject inference_col = thread.thirdMultipleValue();
        final SubLObject rule_subset = thread.fourthMultipleValue();
        final SubLObject more_supports = thread.fifthMultipleValue();
        thread.resetMultipleValues();
        if (transformation_modules.NIL != v_bindings) {
            final SubLObject genls_supports = additional_genls_supports(rule_subset, inference_col);
            backward.transformation_add_node(rule, examine, (SubLObject)transformation_modules.$kw40$POS, v_bindings, ConsesLow.append(genls_supports, more_supports));
        }
        return (SubLObject)transformation_modules.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/modules/transformation-modules.lisp", position = 57556L)
    public static SubLObject trans_genls_neg_rule_select(final SubLObject asent) {
        SubLObject rules = new_selected_rules();
        final SubLObject inference_col = cycl_utilities.atomic_sentence_arg2(asent, (SubLObject)transformation_modules.UNPROVIDED);
        SubLObject cdolist_list_var;
        final SubLObject rule_genls = cdolist_list_var = genls.all_genls(inference_col, (SubLObject)transformation_modules.NIL, (SubLObject)transformation_modules.UNPROVIDED);
        SubLObject rule_genl = (SubLObject)transformation_modules.NIL;
        rule_genl = cdolist_list_var.first();
        while (transformation_modules.NIL != cdolist_list_var) {
            SubLObject cdolist_list_var_$49 = backward_utilities.relevant_directions();
            SubLObject direction = (SubLObject)transformation_modules.NIL;
            direction = cdolist_list_var_$49.first();
            while (transformation_modules.NIL != cdolist_list_var_$49) {
                if (transformation_modules.NIL != kb_mapping_macros.do_genls_rule_index_key_validator(rule_genl, (SubLObject)transformation_modules.$kw14$NEG, direction)) {
                    final SubLObject iterator_var = kb_mapping_macros.new_genls_rule_final_index_spec_iterator(rule_genl, (SubLObject)transformation_modules.$kw14$NEG, direction);
                    SubLObject done_var = (SubLObject)transformation_modules.NIL;
                    final SubLObject token_var = (SubLObject)transformation_modules.NIL;
                    while (transformation_modules.NIL == done_var) {
                        final SubLObject final_index_spec = iteration.iteration_next_without_values_macro_helper(iterator_var, token_var);
                        final SubLObject valid = (SubLObject)SubLObjectFactory.makeBoolean(!token_var.eql(final_index_spec));
                        if (transformation_modules.NIL != valid) {
                            SubLObject final_index_iterator = (SubLObject)transformation_modules.NIL;
                            try {
                                final_index_iterator = kb_mapping_macros.new_final_index_iterator(final_index_spec, (SubLObject)transformation_modules.$kw46$RULE, (SubLObject)transformation_modules.NIL, direction);
                                SubLObject done_var_$50 = (SubLObject)transformation_modules.NIL;
                                final SubLObject token_var_$51 = (SubLObject)transformation_modules.NIL;
                                while (transformation_modules.NIL == done_var_$50) {
                                    final SubLObject rule = iteration.iteration_next_without_values_macro_helper(final_index_iterator, token_var_$51);
                                    final SubLObject valid_$52 = (SubLObject)SubLObjectFactory.makeBoolean(!token_var_$51.eql(rule));
                                    if (transformation_modules.NIL != valid_$52) {
                                        rules = add_selected_rule(rule, rules);
                                    }
                                    done_var_$50 = (SubLObject)SubLObjectFactory.makeBoolean(transformation_modules.NIL == valid_$52);
                                }
                            }
                            finally {
                                final SubLObject _prev_bind_0 = Dynamic.currentBinding(Threads.$is_thread_performing_cleanupP$);
                                try {
                                    Dynamic.bind(Threads.$is_thread_performing_cleanupP$, (SubLObject)transformation_modules.T);
                                    final SubLObject _values = Values.getValuesAsVector();
                                    if (transformation_modules.NIL != final_index_iterator) {
                                        kb_mapping_macros.destroy_final_index_iterator(final_index_iterator);
                                    }
                                    Values.restoreValuesFromVector(_values);
                                }
                                finally {
                                    Dynamic.rebind(Threads.$is_thread_performing_cleanupP$, _prev_bind_0);
                                }
                            }
                        }
                        done_var = (SubLObject)SubLObjectFactory.makeBoolean(transformation_modules.NIL == valid);
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
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/modules/transformation-modules.lisp", position = 58014L)
    public static SubLObject trans_genls_neg_expand_int(final SubLObject asent, final SubLObject rule) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject inference_arg1 = cycl_utilities.atomic_sentence_arg1(asent, (SubLObject)transformation_modules.UNPROVIDED);
        final SubLObject inference_col = cycl_utilities.atomic_sentence_arg2(asent, (SubLObject)transformation_modules.UNPROVIDED);
        if (transformation_modules.NIL != backward_utilities.rule_relevant_to_proof(rule)) {
            final SubLObject cnf_var = assertions_high.assertion_cnf(rule);
            SubLObject cdolist_list_var = clauses.neg_lits(cnf_var);
            SubLObject examine = (SubLObject)transformation_modules.NIL;
            examine = cdolist_list_var.first();
            while (transformation_modules.NIL != cdolist_list_var) {
                if (transformation_modules.$const0$genls.eql(cycl_utilities.atomic_sentence_predicate(examine))) {
                    final SubLObject rule_genl = cycl_utilities.atomic_sentence_arg2(examine, (SubLObject)transformation_modules.UNPROVIDED);
                    if (transformation_modules.NIL != variables.fully_bound_p(rule_genl) && transformation_modules.NIL != genls.genlsP(inference_col, rule_genl, (SubLObject)transformation_modules.NIL, (SubLObject)transformation_modules.UNPROVIDED)) {
                        thread.resetMultipleValues();
                        final SubLObject v_bindings = unification_utilities.term_unify(inference_arg1, cycl_utilities.atomic_sentence_arg1(examine, (SubLObject)transformation_modules.UNPROVIDED), (SubLObject)transformation_modules.NIL, (SubLObject)transformation_modules.T);
                        final SubLObject unify_justification = thread.secondMultipleValue();
                        thread.resetMultipleValues();
                        if (transformation_modules.NIL != v_bindings) {
                            return Values.values(v_bindings, examine, inference_col, rule_genl, unify_justification);
                        }
                    }
                }
                cdolist_list_var = cdolist_list_var.rest();
                examine = cdolist_list_var.first();
            }
        }
        return Values.values((SubLObject)transformation_modules.NIL, (SubLObject)transformation_modules.NIL, (SubLObject)transformation_modules.NIL, (SubLObject)transformation_modules.NIL, (SubLObject)transformation_modules.NIL);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/modules/transformation-modules.lisp", position = 58740L)
    public static SubLObject trans_genls_neg_rule_filter(final SubLObject asent, final SubLObject rule) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        thread.resetMultipleValues();
        final SubLObject v_bindings = trans_genls_neg_expand_int(asent, rule);
        final SubLObject examine = thread.secondMultipleValue();
        final SubLObject inference_col = thread.thirdMultipleValue();
        final SubLObject rule_genl = thread.fourthMultipleValue();
        final SubLObject more_supports = thread.fifthMultipleValue();
        thread.resetMultipleValues();
        if (transformation_modules.NIL != v_bindings) {
            return (SubLObject)transformation_modules.T;
        }
        return (SubLObject)transformation_modules.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/modules/transformation-modules.lisp", position = 59022L)
    public static SubLObject trans_genls_neg_expand(final SubLObject asent, final SubLObject rule) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        thread.resetMultipleValues();
        final SubLObject v_bindings = trans_genls_neg_expand_int(asent, rule);
        final SubLObject examine = thread.secondMultipleValue();
        final SubLObject inference_col = thread.thirdMultipleValue();
        final SubLObject rule_genl = thread.fourthMultipleValue();
        final SubLObject more_supports = thread.fifthMultipleValue();
        thread.resetMultipleValues();
        if (transformation_modules.NIL != v_bindings) {
            final SubLObject genls_supports = additional_genls_supports(inference_col, rule_genl);
            backward.transformation_add_node(rule, examine, (SubLObject)transformation_modules.$kw14$NEG, v_bindings, ConsesLow.append(genls_supports, more_supports));
        }
        return (SubLObject)transformation_modules.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/modules/transformation-modules.lisp", position = 60884L)
    public static SubLObject trans_genl_mt_pos_required(final SubLObject asent) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        return control_vars.$hl_failure_backchaining$.getDynamicValue(thread);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/modules/transformation-modules.lisp", position = 61077L)
    public static SubLObject trans_genl_mt_neg_required(final SubLObject asent) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        return control_vars.$hl_failure_backchaining$.getDynamicValue(thread);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/modules/transformation-modules.lisp", position = 61181L)
    public static SubLObject trans_genl_mt_pos_cost(final SubLObject asent) {
        return cardinality_estimates.spec_cardinality(cycl_utilities.atomic_sentence_arg2(asent, (SubLObject)transformation_modules.UNPROVIDED));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/modules/transformation-modules.lisp", position = 61317L)
    public static SubLObject trans_genl_mt_neg_cost(final SubLObject asent) {
        return cardinality_estimates.genl_cardinality(cycl_utilities.atomic_sentence_arg2(asent, (SubLObject)transformation_modules.UNPROVIDED));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/modules/transformation-modules.lisp", position = 61452L)
    public static SubLObject inference_memoized_all_spec_mts_internal(final SubLObject inference_mt, SubLObject mt) {
        if (mt == transformation_modules.UNPROVIDED) {
            mt = (SubLObject)transformation_modules.NIL;
        }
        return genl_mts.all_spec_mts(inference_mt, mt, (SubLObject)transformation_modules.UNPROVIDED);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/modules/transformation-modules.lisp", position = 61452L)
    public static SubLObject inference_memoized_all_spec_mts(final SubLObject inference_mt, SubLObject mt) {
        if (mt == transformation_modules.UNPROVIDED) {
            mt = (SubLObject)transformation_modules.NIL;
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject v_memoization_state = memoization_state.$memoization_state$.getDynamicValue(thread);
        SubLObject caching_state = (SubLObject)transformation_modules.NIL;
        if (transformation_modules.NIL == v_memoization_state) {
            return inference_memoized_all_spec_mts_internal(inference_mt, mt);
        }
        caching_state = memoization_state.memoization_state_lookup(v_memoization_state, (SubLObject)transformation_modules.$sym94$INFERENCE_MEMOIZED_ALL_SPEC_MTS, (SubLObject)transformation_modules.UNPROVIDED);
        if (transformation_modules.NIL == caching_state) {
            caching_state = memoization_state.create_caching_state(memoization_state.memoization_state_lock(v_memoization_state), (SubLObject)transformation_modules.$sym94$INFERENCE_MEMOIZED_ALL_SPEC_MTS, (SubLObject)transformation_modules.TWO_INTEGER, (SubLObject)transformation_modules.NIL, (SubLObject)transformation_modules.EQL, (SubLObject)transformation_modules.UNPROVIDED);
            memoization_state.memoization_state_put(v_memoization_state, (SubLObject)transformation_modules.$sym94$INFERENCE_MEMOIZED_ALL_SPEC_MTS, caching_state);
        }
        final SubLObject sxhash = memoization_state.sxhash_calc_2(inference_mt, mt);
        final SubLObject collisions = memoization_state.caching_state_lookup(caching_state, sxhash, (SubLObject)transformation_modules.UNPROVIDED);
        if (!collisions.eql(memoization_state.$memoized_item_not_found$.getGlobalValue())) {
            SubLObject cdolist_list_var = collisions;
            SubLObject collision = (SubLObject)transformation_modules.NIL;
            collision = cdolist_list_var.first();
            while (transformation_modules.NIL != cdolist_list_var) {
                SubLObject cached_args = collision.first();
                final SubLObject results2 = conses_high.second(collision);
                if (inference_mt.eql(cached_args.first())) {
                    cached_args = cached_args.rest();
                    if (transformation_modules.NIL != cached_args && transformation_modules.NIL == cached_args.rest() && mt.eql(cached_args.first())) {
                        return memoization_state.caching_results(results2);
                    }
                }
                cdolist_list_var = cdolist_list_var.rest();
                collision = cdolist_list_var.first();
            }
        }
        final SubLObject results3 = Values.arg2(thread.resetMultipleValues(), (SubLObject)Values.multiple_value_list(inference_memoized_all_spec_mts_internal(inference_mt, mt)));
        memoization_state.caching_state_enter_multi_key_n(caching_state, sxhash, collisions, results3, (SubLObject)ConsesLow.list(inference_mt, mt));
        return memoization_state.caching_results(results3);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/modules/transformation-modules.lisp", position = 61617L)
    public static SubLObject trans_genl_mt_pos_rule_select(final SubLObject asent) {
        SubLObject rules = new_selected_rules();
        final SubLObject inference_mt = cycl_utilities.atomic_sentence_arg2(asent, (SubLObject)transformation_modules.UNPROVIDED);
        SubLObject cdolist_list_var;
        final SubLObject rule_spec_mts = cdolist_list_var = inference_memoized_all_spec_mts(inference_mt, (SubLObject)transformation_modules.NIL);
        SubLObject rule_spec_mt = (SubLObject)transformation_modules.NIL;
        rule_spec_mt = cdolist_list_var.first();
        while (transformation_modules.NIL != cdolist_list_var) {
            SubLObject cdolist_list_var_$53 = backward_utilities.relevant_directions();
            SubLObject direction = (SubLObject)transformation_modules.NIL;
            direction = cdolist_list_var_$53.first();
            while (transformation_modules.NIL != cdolist_list_var_$53) {
                if (transformation_modules.NIL != kb_mapping_macros.do_genl_mt_rule_index_key_validator(rule_spec_mt, (SubLObject)transformation_modules.$kw40$POS, direction)) {
                    final SubLObject iterator_var = kb_mapping_macros.new_genl_mt_rule_final_index_spec_iterator(rule_spec_mt, (SubLObject)transformation_modules.$kw40$POS, direction);
                    SubLObject done_var = (SubLObject)transformation_modules.NIL;
                    final SubLObject token_var = (SubLObject)transformation_modules.NIL;
                    while (transformation_modules.NIL == done_var) {
                        final SubLObject final_index_spec = iteration.iteration_next_without_values_macro_helper(iterator_var, token_var);
                        final SubLObject valid = (SubLObject)SubLObjectFactory.makeBoolean(!token_var.eql(final_index_spec));
                        if (transformation_modules.NIL != valid) {
                            SubLObject final_index_iterator = (SubLObject)transformation_modules.NIL;
                            try {
                                final_index_iterator = kb_mapping_macros.new_final_index_iterator(final_index_spec, (SubLObject)transformation_modules.$kw46$RULE, (SubLObject)transformation_modules.NIL, direction);
                                SubLObject done_var_$54 = (SubLObject)transformation_modules.NIL;
                                final SubLObject token_var_$55 = (SubLObject)transformation_modules.NIL;
                                while (transformation_modules.NIL == done_var_$54) {
                                    final SubLObject rule = iteration.iteration_next_without_values_macro_helper(final_index_iterator, token_var_$55);
                                    final SubLObject valid_$56 = (SubLObject)SubLObjectFactory.makeBoolean(!token_var_$55.eql(rule));
                                    if (transformation_modules.NIL != valid_$56) {
                                        rules = add_selected_rule(rule, rules);
                                    }
                                    done_var_$54 = (SubLObject)SubLObjectFactory.makeBoolean(transformation_modules.NIL == valid_$56);
                                }
                            }
                            finally {
                                final SubLObject _prev_bind_0 = Dynamic.currentBinding(Threads.$is_thread_performing_cleanupP$);
                                try {
                                    Dynamic.bind(Threads.$is_thread_performing_cleanupP$, (SubLObject)transformation_modules.T);
                                    final SubLObject _values = Values.getValuesAsVector();
                                    if (transformation_modules.NIL != final_index_iterator) {
                                        kb_mapping_macros.destroy_final_index_iterator(final_index_iterator);
                                    }
                                    Values.restoreValuesFromVector(_values);
                                }
                                finally {
                                    Dynamic.rebind(Threads.$is_thread_performing_cleanupP$, _prev_bind_0);
                                }
                            }
                        }
                        done_var = (SubLObject)SubLObjectFactory.makeBoolean(transformation_modules.NIL == valid);
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
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/modules/transformation-modules.lisp", position = 62106L)
    public static SubLObject trans_genl_mt_pos_expand_int(final SubLObject asent, final SubLObject rule) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject inference_arg1 = cycl_utilities.atomic_sentence_arg1(asent, (SubLObject)transformation_modules.UNPROVIDED);
        final SubLObject inference_mt = cycl_utilities.atomic_sentence_arg2(asent, (SubLObject)transformation_modules.UNPROVIDED);
        if (transformation_modules.NIL != backward_utilities.rule_relevant_to_proof(rule)) {
            final SubLObject cnf_var = assertions_high.assertion_cnf(rule);
            SubLObject cdolist_list_var = clauses.pos_lits(cnf_var);
            SubLObject examine = (SubLObject)transformation_modules.NIL;
            examine = cdolist_list_var.first();
            while (transformation_modules.NIL != cdolist_list_var) {
                if (transformation_modules.$const2$genlMt.eql(cycl_utilities.atomic_sentence_predicate(examine))) {
                    final SubLObject rule_spec_mt = cycl_utilities.atomic_sentence_arg2(examine, (SubLObject)transformation_modules.UNPROVIDED);
                    if (transformation_modules.NIL != variables.fully_bound_p(rule_spec_mt) && transformation_modules.NIL != genl_mts.genl_mtP(rule_spec_mt, inference_mt, (SubLObject)transformation_modules.NIL, (SubLObject)transformation_modules.UNPROVIDED)) {
                        thread.resetMultipleValues();
                        final SubLObject v_bindings = unification_utilities.term_unify(inference_arg1, cycl_utilities.atomic_sentence_arg1(examine, (SubLObject)transformation_modules.UNPROVIDED), (SubLObject)transformation_modules.NIL, (SubLObject)transformation_modules.T);
                        final SubLObject unify_justification = thread.secondMultipleValue();
                        thread.resetMultipleValues();
                        if (transformation_modules.NIL != v_bindings) {
                            return Values.values(v_bindings, examine, inference_mt, rule_spec_mt, unify_justification);
                        }
                    }
                }
                cdolist_list_var = cdolist_list_var.rest();
                examine = cdolist_list_var.first();
            }
        }
        return Values.values((SubLObject)transformation_modules.NIL, (SubLObject)transformation_modules.NIL, (SubLObject)transformation_modules.NIL, (SubLObject)transformation_modules.NIL, (SubLObject)transformation_modules.NIL);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/modules/transformation-modules.lisp", position = 62870L)
    public static SubLObject trans_genl_mt_pos_rule_filter(final SubLObject asent, final SubLObject rule) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        thread.resetMultipleValues();
        final SubLObject v_bindings = trans_genl_mt_pos_expand_int(asent, rule);
        final SubLObject examine = thread.secondMultipleValue();
        final SubLObject inference_mt = thread.thirdMultipleValue();
        final SubLObject rule_spec_mt = thread.fourthMultipleValue();
        final SubLObject more_supports = thread.fifthMultipleValue();
        thread.resetMultipleValues();
        if (transformation_modules.NIL != v_bindings) {
            return (SubLObject)transformation_modules.T;
        }
        return (SubLObject)transformation_modules.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/modules/transformation-modules.lisp", position = 63159L)
    public static SubLObject trans_genl_mt_pos_expand(final SubLObject asent, final SubLObject rule) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        thread.resetMultipleValues();
        final SubLObject v_bindings = trans_genl_mt_pos_expand_int(asent, rule);
        final SubLObject examine = thread.secondMultipleValue();
        final SubLObject inference_mt = thread.thirdMultipleValue();
        final SubLObject rule_spec_mt = thread.fourthMultipleValue();
        final SubLObject more_supports = thread.fifthMultipleValue();
        thread.resetMultipleValues();
        if (transformation_modules.NIL != v_bindings) {
            final SubLObject genl_mt_supports = additional_genl_mt_supports(rule_spec_mt, inference_mt);
            backward.transformation_add_node(rule, examine, (SubLObject)transformation_modules.$kw40$POS, v_bindings, ConsesLow.append(genl_mt_supports, more_supports));
        }
        return (SubLObject)transformation_modules.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/modules/transformation-modules.lisp", position = 63598L)
    public static SubLObject trans_genl_mt_neg_rule_select(final SubLObject asent) {
        SubLObject rules = new_selected_rules();
        final SubLObject inference_mt = cycl_utilities.atomic_sentence_arg2(asent, (SubLObject)transformation_modules.UNPROVIDED);
        SubLObject cdolist_list_var;
        final SubLObject rule_genl_mts = cdolist_list_var = genl_mts.all_genl_mts(inference_mt, (SubLObject)transformation_modules.NIL, (SubLObject)transformation_modules.UNPROVIDED);
        SubLObject rule_genl_mt = (SubLObject)transformation_modules.NIL;
        rule_genl_mt = cdolist_list_var.first();
        while (transformation_modules.NIL != cdolist_list_var) {
            SubLObject cdolist_list_var_$57 = backward_utilities.relevant_directions();
            SubLObject direction = (SubLObject)transformation_modules.NIL;
            direction = cdolist_list_var_$57.first();
            while (transformation_modules.NIL != cdolist_list_var_$57) {
                if (transformation_modules.NIL != kb_mapping_macros.do_genl_mt_rule_index_key_validator(rule_genl_mt, (SubLObject)transformation_modules.$kw14$NEG, direction)) {
                    final SubLObject iterator_var = kb_mapping_macros.new_genl_mt_rule_final_index_spec_iterator(rule_genl_mt, (SubLObject)transformation_modules.$kw14$NEG, direction);
                    SubLObject done_var = (SubLObject)transformation_modules.NIL;
                    final SubLObject token_var = (SubLObject)transformation_modules.NIL;
                    while (transformation_modules.NIL == done_var) {
                        final SubLObject final_index_spec = iteration.iteration_next_without_values_macro_helper(iterator_var, token_var);
                        final SubLObject valid = (SubLObject)SubLObjectFactory.makeBoolean(!token_var.eql(final_index_spec));
                        if (transformation_modules.NIL != valid) {
                            SubLObject final_index_iterator = (SubLObject)transformation_modules.NIL;
                            try {
                                final_index_iterator = kb_mapping_macros.new_final_index_iterator(final_index_spec, (SubLObject)transformation_modules.$kw46$RULE, (SubLObject)transformation_modules.NIL, direction);
                                SubLObject done_var_$58 = (SubLObject)transformation_modules.NIL;
                                final SubLObject token_var_$59 = (SubLObject)transformation_modules.NIL;
                                while (transformation_modules.NIL == done_var_$58) {
                                    final SubLObject rule = iteration.iteration_next_without_values_macro_helper(final_index_iterator, token_var_$59);
                                    final SubLObject valid_$60 = (SubLObject)SubLObjectFactory.makeBoolean(!token_var_$59.eql(rule));
                                    if (transformation_modules.NIL != valid_$60) {
                                        rules = add_selected_rule(rule, rules);
                                    }
                                    done_var_$58 = (SubLObject)SubLObjectFactory.makeBoolean(transformation_modules.NIL == valid_$60);
                                }
                            }
                            finally {
                                final SubLObject _prev_bind_0 = Dynamic.currentBinding(Threads.$is_thread_performing_cleanupP$);
                                try {
                                    Dynamic.bind(Threads.$is_thread_performing_cleanupP$, (SubLObject)transformation_modules.T);
                                    final SubLObject _values = Values.getValuesAsVector();
                                    if (transformation_modules.NIL != final_index_iterator) {
                                        kb_mapping_macros.destroy_final_index_iterator(final_index_iterator);
                                    }
                                    Values.restoreValuesFromVector(_values);
                                }
                                finally {
                                    Dynamic.rebind(Threads.$is_thread_performing_cleanupP$, _prev_bind_0);
                                }
                            }
                        }
                        done_var = (SubLObject)SubLObjectFactory.makeBoolean(transformation_modules.NIL == valid);
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
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/modules/transformation-modules.lisp", position = 64068L)
    public static SubLObject trans_genl_mt_neg_expand_int(final SubLObject asent, final SubLObject rule) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject inference_arg1 = cycl_utilities.atomic_sentence_arg1(asent, (SubLObject)transformation_modules.UNPROVIDED);
        final SubLObject inference_mt = cycl_utilities.atomic_sentence_arg2(asent, (SubLObject)transformation_modules.UNPROVIDED);
        if (transformation_modules.NIL != backward_utilities.rule_relevant_to_proof(rule)) {
            final SubLObject cnf_var = assertions_high.assertion_cnf(rule);
            SubLObject cdolist_list_var = clauses.neg_lits(cnf_var);
            SubLObject examine = (SubLObject)transformation_modules.NIL;
            examine = cdolist_list_var.first();
            while (transformation_modules.NIL != cdolist_list_var) {
                if (transformation_modules.$const2$genlMt.eql(cycl_utilities.atomic_sentence_predicate(examine))) {
                    final SubLObject rule_genl_mt = cycl_utilities.atomic_sentence_arg2(examine, (SubLObject)transformation_modules.UNPROVIDED);
                    if (transformation_modules.NIL != variables.fully_bound_p(rule_genl_mt) && transformation_modules.NIL != genl_mts.genl_mtP(inference_mt, rule_genl_mt, (SubLObject)transformation_modules.NIL, (SubLObject)transformation_modules.UNPROVIDED)) {
                        thread.resetMultipleValues();
                        final SubLObject v_bindings = unification_utilities.term_unify(inference_arg1, cycl_utilities.atomic_sentence_arg1(examine, (SubLObject)transformation_modules.UNPROVIDED), (SubLObject)transformation_modules.NIL, (SubLObject)transformation_modules.T);
                        final SubLObject unify_justification = thread.secondMultipleValue();
                        thread.resetMultipleValues();
                        if (transformation_modules.NIL != v_bindings) {
                            return Values.values(v_bindings, examine, inference_mt, rule_genl_mt, unify_justification);
                        }
                    }
                }
                cdolist_list_var = cdolist_list_var.rest();
                examine = cdolist_list_var.first();
            }
        }
        return Values.values((SubLObject)transformation_modules.NIL, (SubLObject)transformation_modules.NIL, (SubLObject)transformation_modules.NIL, (SubLObject)transformation_modules.NIL, (SubLObject)transformation_modules.NIL);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/modules/transformation-modules.lisp", position = 64807L)
    public static SubLObject trans_genl_mt_neg_rule_filter(final SubLObject asent, final SubLObject rule) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        thread.resetMultipleValues();
        final SubLObject v_bindings = trans_genl_mt_neg_expand_int(asent, rule);
        final SubLObject examine = thread.secondMultipleValue();
        final SubLObject inference_mt = thread.thirdMultipleValue();
        final SubLObject rule_genl_mt = thread.fourthMultipleValue();
        final SubLObject more_supports = thread.fifthMultipleValue();
        thread.resetMultipleValues();
        if (transformation_modules.NIL != v_bindings) {
            return (SubLObject)transformation_modules.T;
        }
        return (SubLObject)transformation_modules.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/modules/transformation-modules.lisp", position = 65096L)
    public static SubLObject trans_genl_mt_neg_expand(final SubLObject asent, final SubLObject rule) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        thread.resetMultipleValues();
        final SubLObject v_bindings = trans_genl_mt_neg_expand_int(asent, rule);
        final SubLObject examine = thread.secondMultipleValue();
        final SubLObject inference_mt = thread.thirdMultipleValue();
        final SubLObject rule_genl_mt = thread.fourthMultipleValue();
        final SubLObject more_supports = thread.fifthMultipleValue();
        thread.resetMultipleValues();
        if (transformation_modules.NIL != v_bindings) {
            final SubLObject genl_mt_supports = additional_genl_mt_supports(inference_mt, rule_genl_mt);
            backward.transformation_add_node(rule, examine, (SubLObject)transformation_modules.$kw14$NEG, v_bindings, ConsesLow.append(genl_mt_supports, more_supports));
        }
        return (SubLObject)transformation_modules.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/modules/transformation-modules.lisp", position = 67052L)
    public static SubLObject trans_abnormal_cost(final SubLObject asent) {
        return kb_indexing.relevant_num_exception_rule_index(cycl_utilities.atomic_sentence_arg2(asent, (SubLObject)transformation_modules.UNPROVIDED));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/modules/transformation-modules.lisp", position = 67229L)
    public static SubLObject trans_abnormal_rule_select(final SubLObject asent) {
        final SubLObject rule = cycl_utilities.atomic_sentence_arg2(asent, (SubLObject)transformation_modules.UNPROVIDED);
        SubLObject exceptions = new_selected_rules();
        SubLObject cdolist_list_var = backward_utilities.relevant_directions();
        SubLObject direction = (SubLObject)transformation_modules.NIL;
        direction = cdolist_list_var.first();
        while (transformation_modules.NIL != cdolist_list_var) {
            if (transformation_modules.NIL != kb_mapping_macros.do_exception_rule_index_key_validator(rule, direction)) {
                final SubLObject iterator_var = kb_mapping_macros.new_exception_rule_final_index_spec_iterator(rule, direction);
                SubLObject done_var = (SubLObject)transformation_modules.NIL;
                final SubLObject token_var = (SubLObject)transformation_modules.NIL;
                while (transformation_modules.NIL == done_var) {
                    final SubLObject final_index_spec = iteration.iteration_next_without_values_macro_helper(iterator_var, token_var);
                    final SubLObject valid = (SubLObject)SubLObjectFactory.makeBoolean(!token_var.eql(final_index_spec));
                    if (transformation_modules.NIL != valid) {
                        SubLObject final_index_iterator = (SubLObject)transformation_modules.NIL;
                        try {
                            final_index_iterator = kb_mapping_macros.new_final_index_iterator(final_index_spec, (SubLObject)transformation_modules.$kw46$RULE, (SubLObject)transformation_modules.NIL, direction);
                            SubLObject done_var_$61 = (SubLObject)transformation_modules.NIL;
                            final SubLObject token_var_$62 = (SubLObject)transformation_modules.NIL;
                            while (transformation_modules.NIL == done_var_$61) {
                                final SubLObject exception = iteration.iteration_next_without_values_macro_helper(final_index_iterator, token_var_$62);
                                final SubLObject valid_$63 = (SubLObject)SubLObjectFactory.makeBoolean(!token_var_$62.eql(exception));
                                if (transformation_modules.NIL != valid_$63) {
                                    exceptions = add_selected_rule(exception, exceptions);
                                }
                                done_var_$61 = (SubLObject)SubLObjectFactory.makeBoolean(transformation_modules.NIL == valid_$63);
                            }
                        }
                        finally {
                            final SubLObject _prev_bind_0 = Dynamic.currentBinding(Threads.$is_thread_performing_cleanupP$);
                            try {
                                Dynamic.bind(Threads.$is_thread_performing_cleanupP$, (SubLObject)transformation_modules.T);
                                final SubLObject _values = Values.getValuesAsVector();
                                if (transformation_modules.NIL != final_index_iterator) {
                                    kb_mapping_macros.destroy_final_index_iterator(final_index_iterator);
                                }
                                Values.restoreValuesFromVector(_values);
                            }
                            finally {
                                Dynamic.rebind(Threads.$is_thread_performing_cleanupP$, _prev_bind_0);
                            }
                        }
                    }
                    done_var = (SubLObject)SubLObjectFactory.makeBoolean(transformation_modules.NIL == valid);
                }
            }
            cdolist_list_var = cdolist_list_var.rest();
            direction = cdolist_list_var.first();
        }
        return finalize_selected_rules(exceptions);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/modules/transformation-modules.lisp", position = 67599L)
    public static SubLObject trans_abnormal_expand_int(final SubLObject asent, final SubLObject exception) {
        final SubLObject rule = cycl_utilities.atomic_sentence_arg2(asent, (SubLObject)transformation_modules.UNPROVIDED);
        final SubLObject predicate_var = transformation_modules.$const99$abnormal;
        if (transformation_modules.NIL != backward_utilities.rule_relevant_to_proof(exception)) {
            final SubLObject cnf_var = assertions_high.assertion_cnf(exception);
            SubLObject cdolist_list_var = clauses.pos_lits(cnf_var);
            SubLObject examine = (SubLObject)transformation_modules.NIL;
            examine = cdolist_list_var.first();
            while (transformation_modules.NIL != cdolist_list_var) {
                if (predicate_var.eql(cycl_utilities.atomic_sentence_predicate(examine)) && rule.eql(cycl_utilities.atomic_sentence_arg2(examine, (SubLObject)transformation_modules.UNPROVIDED))) {
                    final SubLObject v_bindings = unification_utilities.transformation_asent_unify(asent, examine);
                    if (transformation_modules.NIL != v_bindings) {
                        return Values.values(v_bindings, examine);
                    }
                }
                cdolist_list_var = cdolist_list_var.rest();
                examine = cdolist_list_var.first();
            }
        }
        return Values.values((SubLObject)transformation_modules.NIL, (SubLObject)transformation_modules.NIL);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/modules/transformation-modules.lisp", position = 68054L)
    public static SubLObject trans_abnormal_rule_filter(final SubLObject asent, final SubLObject exception) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        thread.resetMultipleValues();
        final SubLObject v_bindings = trans_abnormal_expand_int(asent, exception);
        final SubLObject examine = thread.secondMultipleValue();
        thread.resetMultipleValues();
        if (transformation_modules.NIL != v_bindings) {
            return (SubLObject)transformation_modules.T;
        }
        return (SubLObject)transformation_modules.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/modules/transformation-modules.lisp", position = 68268L)
    public static SubLObject trans_abnormal_expand(final SubLObject asent, final SubLObject exception) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        thread.resetMultipleValues();
        final SubLObject v_bindings = trans_abnormal_expand_int(asent, exception);
        final SubLObject examine = thread.secondMultipleValue();
        thread.resetMultipleValues();
        if (transformation_modules.NIL != v_bindings) {
            backward.transformation_add_node(exception, examine, (SubLObject)transformation_modules.$kw40$POS, v_bindings, (SubLObject)transformation_modules.UNPROVIDED);
        }
        return (SubLObject)transformation_modules.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/modules/transformation-modules.lisp", position = 68897L)
    public static SubLObject transformation_abduction_to_specs_required(final SubLObject asent, SubLObject sense) {
        if (sense == transformation_modules.UNPROVIDED) {
            sense = (SubLObject)transformation_modules.NIL;
        }
        final SubLObject problem_store = inference_worker.currently_active_problem_store();
        return (SubLObject)SubLObjectFactory.makeBoolean(transformation_modules.NIL != problem_store && transformation_modules.NIL != inference_datastructures_problem_store.problem_store_abduction_allowedP(problem_store) && transformation_modules.NIL != inference_abduction_utilities.abduction_allowed_on_asentP(asent, (SubLObject)transformation_modules.UNPROVIDED, (SubLObject)transformation_modules.UNPROVIDED));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/modules/transformation-modules.lisp", position = 69619L)
    public static SubLObject find_genls_definitional_rules() {
        final SubLThread thread = SubLProcess.currentSubLThread();
        if (transformation_modules.NIL != transformation_modules.$genls_definitional_rules$.getDynamicValue(thread)) {
            return transformation_modules.$genls_definitional_rules$.getDynamicValue(thread);
        }
        final SubLObject rules = fi.sentence_assertions(transformation_modules.$genls_definitional_sentence$.getDynamicValue(thread), mt_vars.$assertible_theory_mt_root$.getGlobalValue());
        if (transformation_modules.NIL != rules) {
            transformation_modules.$genls_definitional_rules$.setDynamicValue(rules, thread);
            return rules;
        }
        return (SubLObject)transformation_modules.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/modules/transformation-modules.lisp", position = 69928L)
    public static SubLObject transformation_abduction_to_specs_rule_select(final SubLObject asent) {
        return find_genls_definitional_rules();
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/modules/transformation-modules.lisp", position = 70057L)
    public static SubLObject transformation_abduction_to_specs_rule_filter(final SubLObject asent, final SubLObject rule) {
        return subl_promotions.memberP(rule, find_genls_definitional_rules(), Symbols.symbol_function((SubLObject)transformation_modules.EQL), (SubLObject)transformation_modules.UNPROVIDED);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/modules/transformation-modules.lisp", position = 70212L)
    public static SubLObject transformation_abduction_to_specs_expand(final SubLObject asent, final SubLObject rule) {
        final SubLObject predicate = cycl_utilities.atomic_sentence_predicate(asent);
        final SubLObject sense = (SubLObject)transformation_modules.$kw40$POS;
        final SubLObject predicate_var = predicate;
        if (transformation_modules.NIL != backward_utilities.rule_relevant_to_proof(rule)) {
            final SubLObject cnf_var = assertions_high.assertion_cnf(rule);
            if (transformation_modules.$kw40$POS == sense) {
                SubLObject cdolist_list_var = clauses.pos_lits(cnf_var);
                SubLObject examine = (SubLObject)transformation_modules.NIL;
                examine = cdolist_list_var.first();
                while (transformation_modules.NIL != cdolist_list_var) {
                    if (predicate_var.eql(cycl_utilities.atomic_sentence_predicate(examine))) {
                        final SubLObject v_bindings = unification_utilities.transformation_asent_unify(asent, examine);
                        if (transformation_modules.NIL != v_bindings) {
                            backward.transformation_add_node(rule, examine, sense, v_bindings, (SubLObject)transformation_modules.UNPROVIDED);
                        }
                    }
                    cdolist_list_var = cdolist_list_var.rest();
                    examine = cdolist_list_var.first();
                }
            }
            else if (transformation_modules.$kw14$NEG == sense) {
                SubLObject cdolist_list_var = clauses.neg_lits(cnf_var);
                SubLObject examine = (SubLObject)transformation_modules.NIL;
                examine = cdolist_list_var.first();
                while (transformation_modules.NIL != cdolist_list_var) {
                    if (predicate_var.eql(cycl_utilities.atomic_sentence_predicate(examine))) {
                        final SubLObject v_bindings = unification_utilities.transformation_asent_unify(asent, examine);
                        if (transformation_modules.NIL != v_bindings) {
                            backward.transformation_add_node(rule, examine, sense, v_bindings, (SubLObject)transformation_modules.UNPROVIDED);
                        }
                    }
                    cdolist_list_var = cdolist_list_var.rest();
                    examine = cdolist_list_var.first();
                }
            }
            else {
                Errors.error((SubLObject)transformation_modules.$str47$Invalid_sense__s, sense);
            }
        }
        return (SubLObject)transformation_modules.NIL;
    }
    
    public static SubLObject declare_transformation_modules_file() {
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.modules.transformation_modules", "additional_genls_supports", "ADDITIONAL-GENLS-SUPPORTS", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.modules.transformation_modules", "additional_genl_mt_supports", "ADDITIONAL-GENL-MT-SUPPORTS", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.modules.transformation_modules", "additional_genlpreds_supports", "ADDITIONAL-GENLPREDS-SUPPORTS", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.modules.transformation_modules", "additional_genlinverse_supports", "ADDITIONAL-GENLINVERSE-SUPPORTS", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.modules.transformation_modules", "additional_negationpreds_supports", "ADDITIONAL-NEGATIONPREDS-SUPPORTS", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.modules.transformation_modules", "additional_asymmetry_supports", "ADDITIONAL-ASYMMETRY-SUPPORTS", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.modules.transformation_modules", "additional_predicate_commutativity_supports", "ADDITIONAL-PREDICATE-COMMUTATIVITY-SUPPORTS", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.modules.transformation_modules", "transformation_gaf_truth_known", "TRANSFORMATION-GAF-TRUTH-KNOWN", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.modules.transformation_modules", "modus_tollens_transformation_module_p", "MODUS-TOLLENS-TRANSFORMATION-MODULE-P", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.modules.transformation_modules", "modus_tollens_transformation_proof_p", "MODUS-TOLLENS-TRANSFORMATION-PROOF-P", 1, 0, false);
        SubLFiles.declareMacro("com.cyc.cycjava.cycl.inference.modules.transformation_modules", "do_transformation_relevant_directions", "DO-TRANSFORMATION-RELEVANT-DIRECTIONS");
        SubLFiles.declareMacro("com.cyc.cycjava.cycl.inference.modules.transformation_modules", "do_transformation_rule_literals", "DO-TRANSFORMATION-RULE-LITERALS");
        SubLFiles.declareMacro("com.cyc.cycjava.cycl.inference.modules.transformation_modules", "do_transformation_predicate_rule_index", "DO-TRANSFORMATION-PREDICATE-RULE-INDEX");
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.modules.transformation_modules", "new_selected_rules", "NEW-SELECTED-RULES", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.modules.transformation_modules", "add_selected_rule", "ADD-SELECTED-RULE", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.modules.transformation_modules", "finalize_selected_rules", "FINALIZE-SELECTED-RULES", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.modules.transformation_modules", "sort_rules_via_current_inference_rule_preference", "SORT-RULES-VIA-CURRENT-INFERENCE-RULE-PREFERENCE", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.modules.transformation_modules", "current_inference_rule_preference_G", "CURRENT-INFERENCE-RULE-PREFERENCE->", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.modules.transformation_modules", "trans_predicate_pos_required", "TRANS-PREDICATE-POS-REQUIRED", 1, 0, false);
        new $trans_predicate_pos_required$UnaryFunction();
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.modules.transformation_modules", "trans_predicate_neg_required", "TRANS-PREDICATE-NEG-REQUIRED", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.modules.transformation_modules", "trans_predicate_pos_cost", "TRANS-PREDICATE-POS-COST", 1, 0, false);
        new $trans_predicate_pos_cost$UnaryFunction();
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.modules.transformation_modules", "trans_predicate_neg_cost", "TRANS-PREDICATE-NEG-COST", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.modules.transformation_modules", "trans_predicate_pos_rule_select", "TRANS-PREDICATE-POS-RULE-SELECT", 1, 0, false);
        new $trans_predicate_pos_rule_select$UnaryFunction();
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.modules.transformation_modules", "trans_predicate_neg_rule_select", "TRANS-PREDICATE-NEG-RULE-SELECT", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.modules.transformation_modules", "trans_predicate_pos_rule_filter", "TRANS-PREDICATE-POS-RULE-FILTER", 2, 0, false);
        new $trans_predicate_pos_rule_filter$BinaryFunction();
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.modules.transformation_modules", "trans_predicate_neg_rule_filter", "TRANS-PREDICATE-NEG-RULE-FILTER", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.modules.transformation_modules", "trans_predicate_pos_expand", "TRANS-PREDICATE-POS-EXPAND", 2, 0, false);
        new $trans_predicate_pos_expand$BinaryFunction();
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.modules.transformation_modules", "trans_predicate_neg_expand", "TRANS-PREDICATE-NEG-EXPAND", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.modules.transformation_modules", "trans_predicate_required", "TRANS-PREDICATE-REQUIRED", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.modules.transformation_modules", "trans_predicate_cost", "TRANS-PREDICATE-COST", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.modules.transformation_modules", "trans_predicate_rule_select", "TRANS-PREDICATE-RULE-SELECT", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.modules.transformation_modules", "trans_predicate_rule_select_int_internal", "TRANS-PREDICATE-RULE-SELECT-INT-INTERNAL", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.modules.transformation_modules", "trans_predicate_rule_select_int", "TRANS-PREDICATE-RULE-SELECT-INT", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.modules.transformation_modules", "trans_predicate_rule_filter", "TRANS-PREDICATE-RULE-FILTER", 3, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.modules.transformation_modules", "trans_predicate_expand", "TRANS-PREDICATE-EXPAND", 3, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.modules.transformation_modules", "trans_predicate_genlpreds_pos_required", "TRANS-PREDICATE-GENLPREDS-POS-REQUIRED", 1, 0, false);
        new $trans_predicate_genlpreds_pos_required$UnaryFunction();
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.modules.transformation_modules", "trans_predicate_genlpreds_neg_required", "TRANS-PREDICATE-GENLPREDS-NEG-REQUIRED", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.modules.transformation_modules", "trans_predicate_genlpreds_pos_cost", "TRANS-PREDICATE-GENLPREDS-POS-COST", 1, 0, false);
        new $trans_predicate_genlpreds_pos_cost$UnaryFunction();
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.modules.transformation_modules", "trans_predicate_genlpreds_neg_cost", "TRANS-PREDICATE-GENLPREDS-NEG-COST", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.modules.transformation_modules", "trans_predicate_genlpreds_pos_rule_select", "TRANS-PREDICATE-GENLPREDS-POS-RULE-SELECT", 1, 0, false);
        new $trans_predicate_genlpreds_pos_rule_select$UnaryFunction();
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.modules.transformation_modules", "trans_predicate_genlpreds_pos_rule_select_int_internal", "TRANS-PREDICATE-GENLPREDS-POS-RULE-SELECT-INT-INTERNAL", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.modules.transformation_modules", "trans_predicate_genlpreds_pos_rule_select_int", "TRANS-PREDICATE-GENLPREDS-POS-RULE-SELECT-INT", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.modules.transformation_modules", "trans_predicate_genlpreds_neg_rule_select", "TRANS-PREDICATE-GENLPREDS-NEG-RULE-SELECT", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.modules.transformation_modules", "trans_predicate_genlpreds_pos_expand_int", "TRANS-PREDICATE-GENLPREDS-POS-EXPAND-INT", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.modules.transformation_modules", "trans_predicate_genlpreds_pos_rule_filter", "TRANS-PREDICATE-GENLPREDS-POS-RULE-FILTER", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.modules.transformation_modules", "trans_predicate_genlpreds_pos_expand", "TRANS-PREDICATE-GENLPREDS-POS-EXPAND", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.modules.transformation_modules", "trans_predicate_genlpreds_neg_expand_int", "TRANS-PREDICATE-GENLPREDS-NEG-EXPAND-INT", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.modules.transformation_modules", "trans_predicate_genlpreds_neg_rule_filter", "TRANS-PREDICATE-GENLPREDS-NEG-RULE-FILTER", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.modules.transformation_modules", "trans_predicate_genlpreds_neg_expand", "TRANS-PREDICATE-GENLPREDS-NEG-EXPAND", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.modules.transformation_modules", "trans_predicate_genlpreds_required", "TRANS-PREDICATE-GENLPREDS-REQUIRED", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.modules.transformation_modules", "inference_proper_genl_predicateP_internal", "INFERENCE-PROPER-GENL-PREDICATE?-INTERNAL", 2, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.modules.transformation_modules", "inference_proper_genl_predicateP", "INFERENCE-PROPER-GENL-PREDICATE?", 2, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.modules.transformation_modules", "trans_predicate_genlinverse_pos_required", "TRANS-PREDICATE-GENLINVERSE-POS-REQUIRED", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.modules.transformation_modules", "trans_predicate_genlinverse_neg_required", "TRANS-PREDICATE-GENLINVERSE-NEG-REQUIRED", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.modules.transformation_modules", "trans_predicate_genlinverse_pos_cost", "TRANS-PREDICATE-GENLINVERSE-POS-COST", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.modules.transformation_modules", "trans_predicate_genlinverse_neg_cost", "TRANS-PREDICATE-GENLINVERSE-NEG-COST", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.modules.transformation_modules", "trans_predicate_genlinverse_pos_rule_select", "TRANS-PREDICATE-GENLINVERSE-POS-RULE-SELECT", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.modules.transformation_modules", "trans_predicate_genlinverse_pos_rule_select_int_internal", "TRANS-PREDICATE-GENLINVERSE-POS-RULE-SELECT-INT-INTERNAL", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.modules.transformation_modules", "trans_predicate_genlinverse_pos_rule_select_int", "TRANS-PREDICATE-GENLINVERSE-POS-RULE-SELECT-INT", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.modules.transformation_modules", "trans_predicate_genlinverse_neg_rule_select", "TRANS-PREDICATE-GENLINVERSE-NEG-RULE-SELECT", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.modules.transformation_modules", "trans_predicate_genlinverse_pos_expand_int", "TRANS-PREDICATE-GENLINVERSE-POS-EXPAND-INT", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.modules.transformation_modules", "trans_predicate_genlinverse_pos_rule_filter", "TRANS-PREDICATE-GENLINVERSE-POS-RULE-FILTER", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.modules.transformation_modules", "trans_predicate_genlinverse_pos_expand", "TRANS-PREDICATE-GENLINVERSE-POS-EXPAND", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.modules.transformation_modules", "trans_predicate_genlinverse_neg_expand_int", "TRANS-PREDICATE-GENLINVERSE-NEG-EXPAND-INT", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.modules.transformation_modules", "trans_predicate_genlinverse_neg_rule_filter", "TRANS-PREDICATE-GENLINVERSE-NEG-RULE-FILTER", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.modules.transformation_modules", "trans_predicate_genlinverse_neg_expand", "TRANS-PREDICATE-GENLINVERSE-NEG-EXPAND", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.modules.transformation_modules", "inference_proper_genl_inverseP_internal", "INFERENCE-PROPER-GENL-INVERSE?-INTERNAL", 2, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.modules.transformation_modules", "inference_proper_genl_inverseP", "INFERENCE-PROPER-GENL-INVERSE?", 2, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.modules.transformation_modules", "trans_predicate_negationpreds_neg_required", "TRANS-PREDICATE-NEGATIONPREDS-NEG-REQUIRED", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.modules.transformation_modules", "trans_predicate_negationpreds_neg_cost", "TRANS-PREDICATE-NEGATIONPREDS-NEG-COST", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.modules.transformation_modules", "trans_predicate_negationpreds_neg_rule_select", "TRANS-PREDICATE-NEGATIONPREDS-NEG-RULE-SELECT", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.modules.transformation_modules", "trans_predicate_negationpreds_neg_expand_int", "TRANS-PREDICATE-NEGATIONPREDS-NEG-EXPAND-INT", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.modules.transformation_modules", "trans_predicate_negationpreds_neg_rule_filter", "TRANS-PREDICATE-NEGATIONPREDS-NEG-RULE-FILTER", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.modules.transformation_modules", "trans_predicate_negationpreds_neg_expand", "TRANS-PREDICATE-NEGATIONPREDS-NEG-EXPAND", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.modules.transformation_modules", "trans_predicate_commutativity_cost", "TRANS-PREDICATE-COMMUTATIVITY-COST", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.modules.transformation_modules", "trans_predicate_commutativity_rule_select", "TRANS-PREDICATE-COMMUTATIVITY-RULE-SELECT", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.modules.transformation_modules", "trans_predicate_commutativity_expand_int", "TRANS-PREDICATE-COMMUTATIVITY-EXPAND-INT", 3, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.modules.transformation_modules", "trans_predicate_commutativity_rule_filter", "TRANS-PREDICATE-COMMUTATIVITY-RULE-FILTER", 3, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.modules.transformation_modules", "trans_predicate_commutativity_expand", "TRANS-PREDICATE-COMMUTATIVITY-EXPAND", 3, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.modules.transformation_modules", "trans_predicate_symmetry_pos_cost", "TRANS-PREDICATE-SYMMETRY-POS-COST", 1, 0, false);
        new $trans_predicate_symmetry_pos_cost$UnaryFunction();
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.modules.transformation_modules", "trans_predicate_symmetry_neg_cost", "TRANS-PREDICATE-SYMMETRY-NEG-COST", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.modules.transformation_modules", "trans_predicate_symmetry_pos_rule_select", "TRANS-PREDICATE-SYMMETRY-POS-RULE-SELECT", 1, 0, false);
        new $trans_predicate_symmetry_pos_rule_select$UnaryFunction();
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.modules.transformation_modules", "trans_predicate_symmetry_neg_rule_select", "TRANS-PREDICATE-SYMMETRY-NEG-RULE-SELECT", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.modules.transformation_modules", "trans_predicate_symmetry_pos_rule_filter", "TRANS-PREDICATE-SYMMETRY-POS-RULE-FILTER", 2, 0, false);
        new $trans_predicate_symmetry_pos_rule_filter$BinaryFunction();
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.modules.transformation_modules", "trans_predicate_symmetry_neg_rule_filter", "TRANS-PREDICATE-SYMMETRY-NEG-RULE-FILTER", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.modules.transformation_modules", "trans_predicate_symmetry_pos_expand", "TRANS-PREDICATE-SYMMETRY-POS-EXPAND", 2, 0, false);
        new $trans_predicate_symmetry_pos_expand$BinaryFunction();
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.modules.transformation_modules", "trans_predicate_symmetry_neg_expand", "TRANS-PREDICATE-SYMMETRY-NEG-EXPAND", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.modules.transformation_modules", "trans_predicate_commutative_pos_cost", "TRANS-PREDICATE-COMMUTATIVE-POS-COST", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.modules.transformation_modules", "trans_predicate_commutative_neg_cost", "TRANS-PREDICATE-COMMUTATIVE-NEG-COST", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.modules.transformation_modules", "trans_predicate_commutative_pos_rule_select", "TRANS-PREDICATE-COMMUTATIVE-POS-RULE-SELECT", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.modules.transformation_modules", "trans_predicate_commutative_neg_rule_select", "TRANS-PREDICATE-COMMUTATIVE-NEG-RULE-SELECT", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.modules.transformation_modules", "trans_predicate_commutative_pos_rule_filter", "TRANS-PREDICATE-COMMUTATIVE-POS-RULE-FILTER", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.modules.transformation_modules", "trans_predicate_commutative_neg_rule_filter", "TRANS-PREDICATE-COMMUTATIVE-NEG-RULE-FILTER", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.modules.transformation_modules", "trans_predicate_commutative_pos_expand", "TRANS-PREDICATE-COMMUTATIVE-POS-EXPAND", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.modules.transformation_modules", "trans_predicate_commutative_neg_expand", "TRANS-PREDICATE-COMMUTATIVE-NEG-EXPAND", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.modules.transformation_modules", "trans_predicate_partially_commutative_pos_cost", "TRANS-PREDICATE-PARTIALLY-COMMUTATIVE-POS-COST", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.modules.transformation_modules", "trans_predicate_partially_commutative_neg_cost", "TRANS-PREDICATE-PARTIALLY-COMMUTATIVE-NEG-COST", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.modules.transformation_modules", "trans_predicate_partially_commutative_pos_rule_select", "TRANS-PREDICATE-PARTIALLY-COMMUTATIVE-POS-RULE-SELECT", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.modules.transformation_modules", "trans_predicate_partially_commutative_neg_rule_select", "TRANS-PREDICATE-PARTIALLY-COMMUTATIVE-NEG-RULE-SELECT", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.modules.transformation_modules", "trans_predicate_partially_commutative_pos_rule_filter", "TRANS-PREDICATE-PARTIALLY-COMMUTATIVE-POS-RULE-FILTER", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.modules.transformation_modules", "trans_predicate_partially_commutative_neg_rule_filter", "TRANS-PREDICATE-PARTIALLY-COMMUTATIVE-NEG-RULE-FILTER", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.modules.transformation_modules", "trans_predicate_partially_commutative_pos_expand", "TRANS-PREDICATE-PARTIALLY-COMMUTATIVE-POS-EXPAND", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.modules.transformation_modules", "trans_predicate_partially_commutative_neg_expand", "TRANS-PREDICATE-PARTIALLY-COMMUTATIVE-NEG-EXPAND", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.modules.transformation_modules", "trans_predicate_asymmetry_cost", "TRANS-PREDICATE-ASYMMETRY-COST", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.modules.transformation_modules", "trans_predicate_asymmetry_rule_select", "TRANS-PREDICATE-ASYMMETRY-RULE-SELECT", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.modules.transformation_modules", "trans_predicate_asymmetry_expand_int", "TRANS-PREDICATE-ASYMMETRY-EXPAND-INT", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.modules.transformation_modules", "trans_predicate_asymmetry_rule_filter", "TRANS-PREDICATE-ASYMMETRY-RULE-FILTER", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.modules.transformation_modules", "trans_predicate_asymmetry_expand", "TRANS-PREDICATE-ASYMMETRY-EXPAND", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.modules.transformation_modules", "trans_unbound_predicate_module_p", "TRANS-UNBOUND-PREDICATE-MODULE-P", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.modules.transformation_modules", "module_requires_unbound_predicate_transformationP", "MODULE-REQUIRES-UNBOUND-PREDICATE-TRANSFORMATION?", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.modules.transformation_modules", "trans_unbound_predicate_pos_required", "TRANS-UNBOUND-PREDICATE-POS-REQUIRED", 1, 0, false);
        new $trans_unbound_predicate_pos_required$UnaryFunction();
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.modules.transformation_modules", "trans_unbound_predicate_neg_required", "TRANS-UNBOUND-PREDICATE-NEG-REQUIRED", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.modules.transformation_modules", "trans_unbound_predicate_pos_cost", "TRANS-UNBOUND-PREDICATE-POS-COST", 1, 0, false);
        new $trans_unbound_predicate_pos_cost$UnaryFunction();
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.modules.transformation_modules", "trans_unbound_predicate_neg_cost", "TRANS-UNBOUND-PREDICATE-NEG-COST", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.modules.transformation_modules", "trans_unbound_predicate_pos_rule_select", "TRANS-UNBOUND-PREDICATE-POS-RULE-SELECT", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.modules.transformation_modules", "trans_unbound_predicate_neg_rule_select", "TRANS-UNBOUND-PREDICATE-NEG-RULE-SELECT", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.modules.transformation_modules", "trans_unbound_predicate_pos_rule_filter", "TRANS-UNBOUND-PREDICATE-POS-RULE-FILTER", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.modules.transformation_modules", "trans_unbound_predicate_neg_rule_filter", "TRANS-UNBOUND-PREDICATE-NEG-RULE-FILTER", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.modules.transformation_modules", "trans_unbound_predicate_pos_expand", "TRANS-UNBOUND-PREDICATE-POS-EXPAND", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.modules.transformation_modules", "trans_unbound_predicate_neg_expand", "TRANS-UNBOUND-PREDICATE-NEG-EXPAND", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.modules.transformation_modules", "trans_unbound_predicate_required", "TRANS-UNBOUND-PREDICATE-REQUIRED", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.modules.transformation_modules", "trans_unbound_predicate_cost", "TRANS-UNBOUND-PREDICATE-COST", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.modules.transformation_modules", "trans_unbound_predicate_rule_select_internal", "TRANS-UNBOUND-PREDICATE-RULE-SELECT-INTERNAL", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.modules.transformation_modules", "trans_unbound_predicate_rule_select", "TRANS-UNBOUND-PREDICATE-RULE-SELECT", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.modules.transformation_modules", "trans_unbound_predicate_rule_filter", "TRANS-UNBOUND-PREDICATE-RULE-FILTER", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.modules.transformation_modules", "trans_unbound_predicate_expand", "TRANS-UNBOUND-PREDICATE-EXPAND", 3, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.modules.transformation_modules", "module_requires_hl_predicate_transformationP", "MODULE-REQUIRES-HL-PREDICATE-TRANSFORMATION?", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.modules.transformation_modules", "trans_isa_pos_required", "TRANS-ISA-POS-REQUIRED", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.modules.transformation_modules", "trans_isa_neg_required", "TRANS-ISA-NEG-REQUIRED", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.modules.transformation_modules", "trans_isa_pos_cost", "TRANS-ISA-POS-COST", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.modules.transformation_modules", "trans_isa_neg_cost", "TRANS-ISA-NEG-COST", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.modules.transformation_modules", "inference_memoized_all_specs_internal", "INFERENCE-MEMOIZED-ALL-SPECS-INTERNAL", 1, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.modules.transformation_modules", "inference_memoized_all_specs", "INFERENCE-MEMOIZED-ALL-SPECS", 1, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.modules.transformation_modules", "trans_isa_pos_rule_select_count_internal", "TRANS-ISA-POS-RULE-SELECT-COUNT-INTERNAL", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.modules.transformation_modules", "trans_isa_pos_rule_select_count", "TRANS-ISA-POS-RULE-SELECT-COUNT", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.modules.transformation_modules", "trans_isa_pos_rule_select", "TRANS-ISA-POS-RULE-SELECT", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.modules.transformation_modules", "trans_isa_pos_expand_int", "TRANS-ISA-POS-EXPAND-INT", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.modules.transformation_modules", "trans_isa_pos_rule_filter", "TRANS-ISA-POS-RULE-FILTER", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.modules.transformation_modules", "trans_isa_pos_expand", "TRANS-ISA-POS-EXPAND", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.modules.transformation_modules", "trans_isa_neg_rule_select", "TRANS-ISA-NEG-RULE-SELECT", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.modules.transformation_modules", "trans_isa_neg_expand_int", "TRANS-ISA-NEG-EXPAND-INT", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.modules.transformation_modules", "trans_isa_neg_rule_filter", "TRANS-ISA-NEG-RULE-FILTER", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.modules.transformation_modules", "trans_isa_neg_expand", "TRANS-ISA-NEG-EXPAND", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.modules.transformation_modules", "trans_genls_pos_required", "TRANS-GENLS-POS-REQUIRED", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.modules.transformation_modules", "trans_genls_neg_required", "TRANS-GENLS-NEG-REQUIRED", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.modules.transformation_modules", "trans_genls_pos_cost", "TRANS-GENLS-POS-COST", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.modules.transformation_modules", "trans_genls_neg_cost", "TRANS-GENLS-NEG-COST", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.modules.transformation_modules", "trans_genls_pos_rule_select", "TRANS-GENLS-POS-RULE-SELECT", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.modules.transformation_modules", "trans_genls_pos_expand_int", "TRANS-GENLS-POS-EXPAND-INT", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.modules.transformation_modules", "trans_genls_pos_rule_filter", "TRANS-GENLS-POS-RULE-FILTER", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.modules.transformation_modules", "trans_genls_pos_expand", "TRANS-GENLS-POS-EXPAND", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.modules.transformation_modules", "trans_genls_neg_rule_select", "TRANS-GENLS-NEG-RULE-SELECT", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.modules.transformation_modules", "trans_genls_neg_expand_int", "TRANS-GENLS-NEG-EXPAND-INT", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.modules.transformation_modules", "trans_genls_neg_rule_filter", "TRANS-GENLS-NEG-RULE-FILTER", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.modules.transformation_modules", "trans_genls_neg_expand", "TRANS-GENLS-NEG-EXPAND", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.modules.transformation_modules", "trans_genl_mt_pos_required", "TRANS-GENL-MT-POS-REQUIRED", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.modules.transformation_modules", "trans_genl_mt_neg_required", "TRANS-GENL-MT-NEG-REQUIRED", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.modules.transformation_modules", "trans_genl_mt_pos_cost", "TRANS-GENL-MT-POS-COST", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.modules.transformation_modules", "trans_genl_mt_neg_cost", "TRANS-GENL-MT-NEG-COST", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.modules.transformation_modules", "inference_memoized_all_spec_mts_internal", "INFERENCE-MEMOIZED-ALL-SPEC-MTS-INTERNAL", 1, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.modules.transformation_modules", "inference_memoized_all_spec_mts", "INFERENCE-MEMOIZED-ALL-SPEC-MTS", 1, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.modules.transformation_modules", "trans_genl_mt_pos_rule_select", "TRANS-GENL-MT-POS-RULE-SELECT", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.modules.transformation_modules", "trans_genl_mt_pos_expand_int", "TRANS-GENL-MT-POS-EXPAND-INT", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.modules.transformation_modules", "trans_genl_mt_pos_rule_filter", "TRANS-GENL-MT-POS-RULE-FILTER", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.modules.transformation_modules", "trans_genl_mt_pos_expand", "TRANS-GENL-MT-POS-EXPAND", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.modules.transformation_modules", "trans_genl_mt_neg_rule_select", "TRANS-GENL-MT-NEG-RULE-SELECT", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.modules.transformation_modules", "trans_genl_mt_neg_expand_int", "TRANS-GENL-MT-NEG-EXPAND-INT", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.modules.transformation_modules", "trans_genl_mt_neg_rule_filter", "TRANS-GENL-MT-NEG-RULE-FILTER", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.modules.transformation_modules", "trans_genl_mt_neg_expand", "TRANS-GENL-MT-NEG-EXPAND", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.modules.transformation_modules", "trans_abnormal_cost", "TRANS-ABNORMAL-COST", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.modules.transformation_modules", "trans_abnormal_rule_select", "TRANS-ABNORMAL-RULE-SELECT", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.modules.transformation_modules", "trans_abnormal_expand_int", "TRANS-ABNORMAL-EXPAND-INT", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.modules.transformation_modules", "trans_abnormal_rule_filter", "TRANS-ABNORMAL-RULE-FILTER", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.modules.transformation_modules", "trans_abnormal_expand", "TRANS-ABNORMAL-EXPAND", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.modules.transformation_modules", "transformation_abduction_to_specs_required", "TRANSFORMATION-ABDUCTION-TO-SPECS-REQUIRED", 1, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.modules.transformation_modules", "find_genls_definitional_rules", "FIND-GENLS-DEFINITIONAL-RULES", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.modules.transformation_modules", "transformation_abduction_to_specs_rule_select", "TRANSFORMATION-ABDUCTION-TO-SPECS-RULE-SELECT", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.modules.transformation_modules", "transformation_abduction_to_specs_rule_filter", "TRANSFORMATION-ABDUCTION-TO-SPECS-RULE-FILTER", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.modules.transformation_modules", "transformation_abduction_to_specs_expand", "TRANSFORMATION-ABDUCTION-TO-SPECS-EXPAND", 2, 0, false);
        return (SubLObject)transformation_modules.NIL;
    }
    
    public static SubLObject init_transformation_modules_file() {
        transformation_modules.$transformation_gaf_truth_known_disabled$ = SubLFiles.defparameter("*TRANSFORMATION-GAF-TRUTH-KNOWN-DISABLED*", (SubLObject)transformation_modules.T);
        transformation_modules.$unbound_predicate_transformation_required_modules$ = SubLFiles.deflexical("*UNBOUND-PREDICATE-TRANSFORMATION-REQUIRED-MODULES*", (SubLObject)transformation_modules.$list76);
        transformation_modules.$hl_predicate_transformation_required_modules$ = SubLFiles.deflexical("*HL-PREDICATE-TRANSFORMATION-REQUIRED-MODULES*", (SubLObject)transformation_modules.$list82);
        transformation_modules.$genls_definitional_sentence$ = SubLFiles.defparameter("*GENLS-DEFINITIONAL-SENTENCE*", (SubLObject)transformation_modules.$list102);
        transformation_modules.$genls_definitional_rules$ = SubLFiles.defparameter("*GENLS-DEFINITIONAL-RULES*", (SubLObject)transformation_modules.NIL);
        return (SubLObject)transformation_modules.NIL;
    }
    
    public static SubLObject setup_transformation_modules_file() {
        inference_modules.inference_transformation_module((SubLObject)transformation_modules.$kw41$TRANS_PREDICATE_POS, (SubLObject)transformation_modules.$list42);
        inference_modules.inference_transformation_module((SubLObject)transformation_modules.$kw43$TRANS_PREDICATE_NEG, (SubLObject)transformation_modules.$list44);
        memoization_state.note_memoized_function((SubLObject)transformation_modules.$sym45$TRANS_PREDICATE_RULE_SELECT_INT);
        memoization_state.note_memoized_function((SubLObject)transformation_modules.$sym48$TRANS_PREDICATE_GENLPREDS_POS_RULE_SELECT_INT);
        inference_modules.inference_transformation_module((SubLObject)transformation_modules.$kw49$TRANS_PREDICATE_GENLPREDS_POS, (SubLObject)transformation_modules.$list50);
        inference_modules.inference_transformation_module((SubLObject)transformation_modules.$kw51$TRANS_PREDICATE_GENLPREDS_NEG, (SubLObject)transformation_modules.$list52);
        memoization_state.note_memoized_function((SubLObject)transformation_modules.$sym53$INFERENCE_PROPER_GENL_PREDICATE_);
        memoization_state.note_memoized_function((SubLObject)transformation_modules.$sym54$TRANS_PREDICATE_GENLINVERSE_POS_RULE_SELECT_INT);
        inference_modules.inference_transformation_module((SubLObject)transformation_modules.$kw55$TRANS_PREDICATE_GENLINVERSE_POS, (SubLObject)transformation_modules.$list56);
        inference_modules.inference_transformation_module((SubLObject)transformation_modules.$kw57$TRANS_PREDICATE_GENLINVERSE_NEG, (SubLObject)transformation_modules.$list58);
        memoization_state.note_memoized_function((SubLObject)transformation_modules.$sym59$INFERENCE_PROPER_GENL_INVERSE_);
        inference_modules.inference_transformation_module((SubLObject)transformation_modules.$kw60$TRANS_PREDICATE_NEGATIONPREDS_NEG, (SubLObject)transformation_modules.$list61);
        inference_modules.inference_transformation_module((SubLObject)transformation_modules.$kw62$TRANS_PREDICATE_SYMMETRY_POS, (SubLObject)transformation_modules.$list63);
        inference_modules.inference_transformation_module((SubLObject)transformation_modules.$kw64$TRANS_PREDICATE_SYMMETRY_NEG, (SubLObject)transformation_modules.$list65);
        inference_modules.inference_transformation_module((SubLObject)transformation_modules.$kw66$TRANS_PREDICATE_COMMUTATIVE_POS, (SubLObject)transformation_modules.$list67);
        inference_modules.inference_transformation_module((SubLObject)transformation_modules.$kw68$TRANS_PREDICATE_COMMUTATIVE_NEG, (SubLObject)transformation_modules.$list69);
        inference_modules.inference_transformation_module((SubLObject)transformation_modules.$kw70$TRANS_PREDICATE_PARTIALLY_COMMUTATIVE_POS, (SubLObject)transformation_modules.$list71);
        inference_modules.inference_transformation_module((SubLObject)transformation_modules.$kw72$TRANS_PREDICATE_PARTIALLY_COMMUTATIVE_NEG, (SubLObject)transformation_modules.$list73);
        inference_modules.inference_transformation_module((SubLObject)transformation_modules.$kw74$TRANS_PREDICATE_ASYMMETRY, (SubLObject)transformation_modules.$list75);
        inference_modules.inference_transformation_module((SubLObject)transformation_modules.$kw77$TRANS_UNBOUND_PREDICATE_POS, (SubLObject)transformation_modules.$list78);
        inference_modules.inference_transformation_module((SubLObject)transformation_modules.$kw79$TRANS_UNBOUND_PREDICATE_NEG, (SubLObject)transformation_modules.$list80);
        memoization_state.note_memoized_function((SubLObject)transformation_modules.$sym81$TRANS_UNBOUND_PREDICATE_RULE_SELECT);
        memoization_state.note_memoized_function((SubLObject)transformation_modules.$sym83$INFERENCE_MEMOIZED_ALL_SPECS);
        memoization_state.note_memoized_function((SubLObject)transformation_modules.$sym84$TRANS_ISA_POS_RULE_SELECT_COUNT);
        inference_modules.inference_transformation_module((SubLObject)transformation_modules.$kw86$TRANS_ISA_POS, (SubLObject)transformation_modules.$list87);
        inference_modules.inference_transformation_module((SubLObject)transformation_modules.$kw88$TRANS_ISA_NEG, (SubLObject)transformation_modules.$list89);
        inference_modules.inference_transformation_module((SubLObject)transformation_modules.$kw90$TRANS_GENLS_POS, (SubLObject)transformation_modules.$list91);
        inference_modules.inference_transformation_module((SubLObject)transformation_modules.$kw92$TRANS_GENLS_NEG, (SubLObject)transformation_modules.$list93);
        memoization_state.note_memoized_function((SubLObject)transformation_modules.$sym94$INFERENCE_MEMOIZED_ALL_SPEC_MTS);
        inference_modules.inference_transformation_module((SubLObject)transformation_modules.$kw95$TRANS_GENL_MT_POS, (SubLObject)transformation_modules.$list96);
        inference_modules.inference_transformation_module((SubLObject)transformation_modules.$kw97$TRANS_GENL_MT_NEG, (SubLObject)transformation_modules.$list98);
        inference_modules.inference_transformation_module((SubLObject)transformation_modules.$kw100$TRANS_ABNORMAL, (SubLObject)transformation_modules.$list101);
        inference_modules.inference_transformation_module((SubLObject)transformation_modules.$kw103$TRANSFORMATION_ABDUCTION_TO_SPECS, (SubLObject)transformation_modules.$list104);
        return (SubLObject)transformation_modules.NIL;
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
        me = (SubLFile)new transformation_modules();
        transformation_modules.$transformation_gaf_truth_known_disabled$ = null;
        transformation_modules.$unbound_predicate_transformation_required_modules$ = null;
        transformation_modules.$hl_predicate_transformation_required_modules$ = null;
        transformation_modules.$genls_definitional_sentence$ = null;
        transformation_modules.$genls_definitional_rules$ = null;
        $const0$genls = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("genls"));
        $kw1$GENLS = SubLObjectFactory.makeKeyword("GENLS");
        $const2$genlMt = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("genlMt"));
        $kw3$GENLMT = SubLObjectFactory.makeKeyword("GENLMT");
        $const4$genlPreds = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("genlPreds"));
        $kw5$GENLPREDS = SubLObjectFactory.makeKeyword("GENLPREDS");
        $const6$genlInverse = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("genlInverse"));
        $const7$negationPreds = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("negationPreds"));
        $kw8$NEGATIONPREDS = SubLObjectFactory.makeKeyword("NEGATIONPREDS");
        $const9$AsymmetricBinaryPredicate = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("AsymmetricBinaryPredicate"));
        $const10$SymmetricBinaryPredicate = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("SymmetricBinaryPredicate"));
        $const11$CommutativePredicate = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("CommutativePredicate"));
        $const12$PartiallyCommutativePredicate = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("PartiallyCommutativePredicate"));
        $str13$Unexpected_commutative_predicate_ = SubLObjectFactory.makeString("Unexpected commutative predicate ~s");
        $kw14$NEG = SubLObjectFactory.makeKeyword("NEG");
        $list15 = ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("DIRECTION-VAR")), (SubLObject)SubLObjectFactory.makeSymbol("&BODY"), (SubLObject)SubLObjectFactory.makeSymbol("BODY"));
        $sym16$DO_LIST = SubLObjectFactory.makeSymbol("DO-LIST");
        $list17 = ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("RELEVANT-DIRECTIONS")));
        $list18 = ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("RULE-ASENT-VAR"), (SubLObject)SubLObjectFactory.makeSymbol("RULE"), (SubLObject)SubLObjectFactory.makeSymbol("SENSE"), (SubLObject)SubLObjectFactory.makeSymbol("&KEY"), (SubLObject)SubLObjectFactory.makeSymbol("PREDICATE")), (SubLObject)SubLObjectFactory.makeSymbol("&BODY"), (SubLObject)SubLObjectFactory.makeSymbol("BODY"));
        $list19 = ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("PREDICATE"));
        $kw20$ALLOW_OTHER_KEYS = SubLObjectFactory.makeKeyword("ALLOW-OTHER-KEYS");
        $kw21$PREDICATE = SubLObjectFactory.makeKeyword("PREDICATE");
        $sym22$PREDICATE_VAR = SubLObjectFactory.makeUninternedSymbol("PREDICATE-VAR");
        $sym23$CLET = SubLObjectFactory.makeSymbol("CLET");
        $sym24$DO_TRANSFORMATION_RULE_LITERALS = SubLObjectFactory.makeSymbol("DO-TRANSFORMATION-RULE-LITERALS");
        $sym25$PWHEN = SubLObjectFactory.makeSymbol("PWHEN");
        $sym26$ATOMIC_SENTENCE_PREDICATE = SubLObjectFactory.makeSymbol("ATOMIC-SENTENCE-PREDICATE");
        $sym27$RULE_VAR = SubLObjectFactory.makeUninternedSymbol("RULE-VAR");
        $sym28$RULE_RELEVANT_TO_PROOF = SubLObjectFactory.makeSymbol("RULE-RELEVANT-TO-PROOF");
        $sym29$DO_ASSERTION_LITERALS = SubLObjectFactory.makeSymbol("DO-ASSERTION-LITERALS");
        $kw30$SENSE = SubLObjectFactory.makeKeyword("SENSE");
        $list31 = ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("RULE-ASENT-VAR"), (SubLObject)SubLObjectFactory.makeSymbol("RULE-VAR"), (SubLObject)SubLObjectFactory.makeSymbol("PREDICATE"), (SubLObject)SubLObjectFactory.makeSymbol("SENSE")), (SubLObject)SubLObjectFactory.makeSymbol("&BODY"), (SubLObject)SubLObjectFactory.makeSymbol("BODY"));
        $sym32$DIRECTION_VAR = SubLObjectFactory.makeUninternedSymbol("DIRECTION-VAR");
        $sym33$SENSE_VAR = SubLObjectFactory.makeUninternedSymbol("SENSE-VAR");
        $sym34$PREDICATE_VAR = SubLObjectFactory.makeUninternedSymbol("PREDICATE-VAR");
        $sym35$DO_TRANSFORMATION_RELEVANT_DIRECTIONS = SubLObjectFactory.makeSymbol("DO-TRANSFORMATION-RELEVANT-DIRECTIONS");
        $sym36$DO_PREDICATE_RULE_INDEX = SubLObjectFactory.makeSymbol("DO-PREDICATE-RULE-INDEX");
        $kw37$DIRECTION = SubLObjectFactory.makeKeyword("DIRECTION");
        $sym38$CURRENT_INFERENCE_RULE_PREFERENCE__ = SubLObjectFactory.makeSymbol("CURRENT-INFERENCE-RULE-PREFERENCE->");
        $sym39$TRANSFORMATION_RULE_UTILITY__ = SubLObjectFactory.makeSymbol("TRANSFORMATION-RULE-UTILITY->");
        $kw40$POS = SubLObjectFactory.makeKeyword("POS");
        $kw41$TRANS_PREDICATE_POS = SubLObjectFactory.makeKeyword("TRANS-PREDICATE-POS");
        $list42 = ConsesLow.list(new SubLObject[] { SubLObjectFactory.makeKeyword("SENSE"), SubLObjectFactory.makeKeyword("POS"), SubLObjectFactory.makeKeyword("REQUIRED-PATTERN"), ConsesLow.cons((SubLObject)SubLObjectFactory.makeKeyword("FORT"), (SubLObject)SubLObjectFactory.makeKeyword("ANYTHING")), SubLObjectFactory.makeKeyword("REQUIRED"), SubLObjectFactory.makeSymbol("TRANS-PREDICATE-POS-REQUIRED"), SubLObjectFactory.makeKeyword("COST"), SubLObjectFactory.makeSymbol("TRANS-PREDICATE-POS-COST"), SubLObjectFactory.makeKeyword("RULE-SELECT"), SubLObjectFactory.makeSymbol("TRANS-PREDICATE-POS-RULE-SELECT"), SubLObjectFactory.makeKeyword("RULE-FILTER"), SubLObjectFactory.makeSymbol("TRANS-PREDICATE-POS-RULE-FILTER"), SubLObjectFactory.makeKeyword("EXPAND"), SubLObjectFactory.makeSymbol("TRANS-PREDICATE-POS-EXPAND"), SubLObjectFactory.makeKeyword("DOCUMENTATION"), SubLObjectFactory.makeString("(<predicate> . <whatever>)\nwhere <predicate> is a FORT\nfrom a rule concluding to <predicate>\nusing the predicate rule indexing in the KB"), SubLObjectFactory.makeKeyword("EXAMPLE"), SubLObjectFactory.makeString("(#$likesAsFriend #$AbrahamLincoln ?WHO)\nfrom a rule concluding to #$likesAsFriend") });
        $kw43$TRANS_PREDICATE_NEG = SubLObjectFactory.makeKeyword("TRANS-PREDICATE-NEG");
        $list44 = ConsesLow.list(new SubLObject[] { SubLObjectFactory.makeKeyword("SENSE"), SubLObjectFactory.makeKeyword("NEG"), SubLObjectFactory.makeKeyword("REQUIRED-PATTERN"), ConsesLow.cons((SubLObject)SubLObjectFactory.makeKeyword("FORT"), (SubLObject)SubLObjectFactory.makeKeyword("ANYTHING")), SubLObjectFactory.makeKeyword("REQUIRED"), SubLObjectFactory.makeSymbol("TRANS-PREDICATE-NEG-REQUIRED"), SubLObjectFactory.makeKeyword("COST"), SubLObjectFactory.makeSymbol("TRANS-PREDICATE-NEG-COST"), SubLObjectFactory.makeKeyword("RULE-SELECT"), SubLObjectFactory.makeSymbol("TRANS-PREDICATE-NEG-RULE-SELECT"), SubLObjectFactory.makeKeyword("RULE-FILTER"), SubLObjectFactory.makeSymbol("TRANS-PREDICATE-NEG-RULE-FILTER"), SubLObjectFactory.makeKeyword("EXPAND"), SubLObjectFactory.makeSymbol("TRANS-PREDICATE-NEG-EXPAND"), SubLObjectFactory.makeKeyword("DOCUMENTATION"), SubLObjectFactory.makeString("(#$not (<predicate> . <whatever>))\nwhere <predicate> is a FORT\nfrom a rule concluding from <predicate>\nusing the predicate rule indexing in the KB"), SubLObjectFactory.makeKeyword("EXAMPLE"), SubLObjectFactory.makeString("(#$not (#$likesAsFriend #$AbrahamLincoln ?WHO))\nfrom a rule concluding from #$likesAsFriend") });
        $sym45$TRANS_PREDICATE_RULE_SELECT_INT = SubLObjectFactory.makeSymbol("TRANS-PREDICATE-RULE-SELECT-INT");
        $kw46$RULE = SubLObjectFactory.makeKeyword("RULE");
        $str47$Invalid_sense__s = SubLObjectFactory.makeString("Invalid sense ~s");
        $sym48$TRANS_PREDICATE_GENLPREDS_POS_RULE_SELECT_INT = SubLObjectFactory.makeSymbol("TRANS-PREDICATE-GENLPREDS-POS-RULE-SELECT-INT");
        $kw49$TRANS_PREDICATE_GENLPREDS_POS = SubLObjectFactory.makeKeyword("TRANS-PREDICATE-GENLPREDS-POS");
        $list50 = ConsesLow.list(new SubLObject[] { SubLObjectFactory.makeKeyword("SENSE"), SubLObjectFactory.makeKeyword("POS"), SubLObjectFactory.makeKeyword("REQUIRED-PATTERN"), ConsesLow.cons((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("AND"), (SubLObject)SubLObjectFactory.makeKeyword("FORT"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("TEST"), (SubLObject)SubLObjectFactory.makeSymbol("INFERENCE-SOME-SPEC-PRED-OR-INVERSE?"))), (SubLObject)SubLObjectFactory.makeKeyword("ANYTHING")), SubLObjectFactory.makeKeyword("REQUIRED"), SubLObjectFactory.makeSymbol("TRANS-PREDICATE-GENLPREDS-POS-REQUIRED"), SubLObjectFactory.makeKeyword("COST"), SubLObjectFactory.makeSymbol("TRANS-PREDICATE-GENLPREDS-POS-COST"), SubLObjectFactory.makeKeyword("RULE-SELECT"), SubLObjectFactory.makeSymbol("TRANS-PREDICATE-GENLPREDS-POS-RULE-SELECT"), SubLObjectFactory.makeKeyword("RULE-FILTER"), SubLObjectFactory.makeSymbol("TRANS-PREDICATE-GENLPREDS-POS-RULE-FILTER"), SubLObjectFactory.makeKeyword("EXPAND"), SubLObjectFactory.makeSymbol("TRANS-PREDICATE-GENLPREDS-POS-EXPAND"), SubLObjectFactory.makeKeyword("DOCUMENTATION"), SubLObjectFactory.makeString("(<predicate> . <whatever>)\nwhere <predicate> is a FORT with some spec-preds\nfrom a rule concluding to a spec-pred of <predicate>\nusing the predicate rule indexing in the KB"), SubLObjectFactory.makeKeyword("EXAMPLE"), SubLObjectFactory.makeString("(#$acquaintedWith #$AbrahamLincoln ?WHO)\nfrom (#$genlPreds #$likesAsFriend #$acquaintedWith)\nand a rule concluding to #$likesAsFriend") });
        $kw51$TRANS_PREDICATE_GENLPREDS_NEG = SubLObjectFactory.makeKeyword("TRANS-PREDICATE-GENLPREDS-NEG");
        $list52 = ConsesLow.list(new SubLObject[] { SubLObjectFactory.makeKeyword("SENSE"), SubLObjectFactory.makeKeyword("NEG"), SubLObjectFactory.makeKeyword("REQUIRED-PATTERN"), ConsesLow.cons((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("AND"), (SubLObject)SubLObjectFactory.makeKeyword("FORT"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("TEST"), (SubLObject)SubLObjectFactory.makeSymbol("INFERENCE-SOME-GENL-PRED-OR-INVERSE?"))), (SubLObject)SubLObjectFactory.makeKeyword("ANYTHING")), SubLObjectFactory.makeKeyword("REQUIRED"), SubLObjectFactory.makeSymbol("TRANS-PREDICATE-GENLPREDS-NEG-REQUIRED"), SubLObjectFactory.makeKeyword("COST"), SubLObjectFactory.makeSymbol("TRANS-PREDICATE-GENLPREDS-NEG-COST"), SubLObjectFactory.makeKeyword("RULE-SELECT"), SubLObjectFactory.makeSymbol("TRANS-PREDICATE-GENLPREDS-NEG-RULE-SELECT"), SubLObjectFactory.makeKeyword("RULE-FILTER"), SubLObjectFactory.makeSymbol("TRANS-PREDICATE-GENLPREDS-NEG-RULE-FILTER"), SubLObjectFactory.makeKeyword("EXPAND"), SubLObjectFactory.makeSymbol("TRANS-PREDICATE-GENLPREDS-NEG-EXPAND"), SubLObjectFactory.makeKeyword("DOCUMENTATION"), SubLObjectFactory.makeString("(#$not (<predicate> . <whatever>))\nwhere <predicate> is a FORT with some genl-preds\nfrom a rule concluding from a genl-pred of <predicate>\nusing the predicate rule indexing in the KB"), SubLObjectFactory.makeKeyword("EXAMPLE"), SubLObjectFactory.makeString("(#$not (#$likesAsFriend #$AbrahamLincoln ?WHO))\nfrom (#$genlPreds #$likesAsFriend #$acquaintedWith)\nand a rule concluding from #$acquaintedWith") });
        $sym53$INFERENCE_PROPER_GENL_PREDICATE_ = SubLObjectFactory.makeSymbol("INFERENCE-PROPER-GENL-PREDICATE?");
        $sym54$TRANS_PREDICATE_GENLINVERSE_POS_RULE_SELECT_INT = SubLObjectFactory.makeSymbol("TRANS-PREDICATE-GENLINVERSE-POS-RULE-SELECT-INT");
        $kw55$TRANS_PREDICATE_GENLINVERSE_POS = SubLObjectFactory.makeKeyword("TRANS-PREDICATE-GENLINVERSE-POS");
        $list56 = ConsesLow.list(new SubLObject[] { SubLObjectFactory.makeKeyword("SENSE"), SubLObjectFactory.makeKeyword("POS"), SubLObjectFactory.makeKeyword("REQUIRED-PATTERN"), ConsesLow.cons((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("AND"), (SubLObject)SubLObjectFactory.makeKeyword("FORT"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("TEST"), (SubLObject)SubLObjectFactory.makeSymbol("INFERENCE-SOME-SPEC-PRED-OR-INVERSE?")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("NOT"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("TEST"), (SubLObject)SubLObjectFactory.makeSymbol("INFERENCE-SYMMETRIC-PREDICATE?")))), (SubLObject)SubLObjectFactory.makeKeyword("ANYTHING")), SubLObjectFactory.makeKeyword("REQUIRED"), SubLObjectFactory.makeSymbol("TRANS-PREDICATE-GENLINVERSE-POS-REQUIRED"), SubLObjectFactory.makeKeyword("COST"), SubLObjectFactory.makeSymbol("TRANS-PREDICATE-GENLINVERSE-POS-COST"), SubLObjectFactory.makeKeyword("RULE-SELECT"), SubLObjectFactory.makeSymbol("TRANS-PREDICATE-GENLINVERSE-POS-RULE-SELECT"), SubLObjectFactory.makeKeyword("RULE-FILTER"), SubLObjectFactory.makeSymbol("TRANS-PREDICATE-GENLINVERSE-POS-RULE-FILTER"), SubLObjectFactory.makeKeyword("EXPAND"), SubLObjectFactory.makeSymbol("TRANS-PREDICATE-GENLINVERSE-POS-EXPAND"), SubLObjectFactory.makeKeyword("DOCUMENTATION"), SubLObjectFactory.makeString("(<predicate> . <whatever>)\nwhere <predicate> is a FORT with some spec-preds\nfrom a rule concluding to a spec-pred of <predicate>\nusing the predicate rule indexing in the KB"), SubLObjectFactory.makeKeyword("EXAMPLE"), SubLObjectFactory.makeString("(#$awareOfExistenceOf #$MarvinMinsky ?WHO)\nfrom (#$genlInverse #$studentOf #$awareOfExistenceOf)\nand a rule concluding to #$studentOf") });
        $kw57$TRANS_PREDICATE_GENLINVERSE_NEG = SubLObjectFactory.makeKeyword("TRANS-PREDICATE-GENLINVERSE-NEG");
        $list58 = ConsesLow.list(new SubLObject[] { SubLObjectFactory.makeKeyword("SENSE"), SubLObjectFactory.makeKeyword("NEG"), SubLObjectFactory.makeKeyword("REQUIRED-PATTERN"), ConsesLow.cons((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("AND"), (SubLObject)SubLObjectFactory.makeKeyword("FORT"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("TEST"), (SubLObject)SubLObjectFactory.makeSymbol("INFERENCE-SOME-GENL-PRED-OR-INVERSE?")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("NOT"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("TEST"), (SubLObject)SubLObjectFactory.makeSymbol("INFERENCE-SYMMETRIC-PREDICATE?")))), (SubLObject)SubLObjectFactory.makeKeyword("ANYTHING")), SubLObjectFactory.makeKeyword("REQUIRED"), SubLObjectFactory.makeSymbol("TRANS-PREDICATE-GENLINVERSE-NEG-REQUIRED"), SubLObjectFactory.makeKeyword("COST"), SubLObjectFactory.makeSymbol("TRANS-PREDICATE-GENLINVERSE-NEG-COST"), SubLObjectFactory.makeKeyword("RULE-SELECT"), SubLObjectFactory.makeSymbol("TRANS-PREDICATE-GENLINVERSE-NEG-RULE-SELECT"), SubLObjectFactory.makeKeyword("RULE-FILTER"), SubLObjectFactory.makeSymbol("TRANS-PREDICATE-GENLINVERSE-NEG-RULE-FILTER"), SubLObjectFactory.makeKeyword("EXPAND"), SubLObjectFactory.makeSymbol("TRANS-PREDICATE-GENLINVERSE-NEG-EXPAND"), SubLObjectFactory.makeKeyword("DOCUMENTATION"), SubLObjectFactory.makeString("(#$not (<predicate> . <whatever>))\nwhere <predicate> is a FORT with some genl-preds\nfrom a rule concluding from a genl-pred of <predicate>\nusing the predicate rule indexing in the KB"), SubLObjectFactory.makeKeyword("EXAMPLE"), SubLObjectFactory.makeString("(#$not (#$studentOf #$MarvinMinsky ?WHO))\nfrom (#$genlInverse #$studentOf #$awareOfExistenceOf)\nand a rule concluding from #$awareOfExistenceOf") });
        $sym59$INFERENCE_PROPER_GENL_INVERSE_ = SubLObjectFactory.makeSymbol("INFERENCE-PROPER-GENL-INVERSE?");
        $kw60$TRANS_PREDICATE_NEGATIONPREDS_NEG = SubLObjectFactory.makeKeyword("TRANS-PREDICATE-NEGATIONPREDS-NEG");
        $list61 = ConsesLow.list(new SubLObject[] { SubLObjectFactory.makeKeyword("SENSE"), SubLObjectFactory.makeKeyword("NEG"), SubLObjectFactory.makeKeyword("REQUIRED-PATTERN"), ConsesLow.cons((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("AND"), (SubLObject)SubLObjectFactory.makeKeyword("FORT"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("TEST"), (SubLObject)SubLObjectFactory.makeSymbol("INFERENCE-SOME-NEGATION-PRED-OR-INVERSE?"))), (SubLObject)SubLObjectFactory.makeKeyword("ANYTHING")), SubLObjectFactory.makeKeyword("REQUIRED"), SubLObjectFactory.makeSymbol("TRANS-PREDICATE-NEGATIONPREDS-NEG-REQUIRED"), SubLObjectFactory.makeKeyword("COST"), SubLObjectFactory.makeSymbol("TRANS-PREDICATE-NEGATIONPREDS-NEG-COST"), SubLObjectFactory.makeKeyword("RULE-SELECT"), SubLObjectFactory.makeSymbol("TRANS-PREDICATE-NEGATIONPREDS-NEG-RULE-SELECT"), SubLObjectFactory.makeKeyword("RULE-FILTER"), SubLObjectFactory.makeSymbol("TRANS-PREDICATE-NEGATIONPREDS-NEG-RULE-FILTER"), SubLObjectFactory.makeKeyword("EXPAND"), SubLObjectFactory.makeSymbol("TRANS-PREDICATE-NEGATIONPREDS-NEG-EXPAND"), SubLObjectFactory.makeKeyword("DOCUMENTATION"), SubLObjectFactory.makeString("(#$not (<predicate> . <whatever>))\nwhere <predicate> is a FORT with some negationPreds,\neither asserted or inferrable via genlPreds,\nfrom a rule concluding to a negationPred of <predicate>\nusing the predicate rule indexing in the KB"), SubLObjectFactory.makeKeyword("EXAMPLE"), SubLObjectFactory.makeString("(#$not (#$likesAsFriend #$AbrahamLincoln ?WHO))\nfrom (#$negationPreds #$likesAsFriend #$hates)\nand a rule concluding to #$hates") });
        $kw62$TRANS_PREDICATE_SYMMETRY_POS = SubLObjectFactory.makeKeyword("TRANS-PREDICATE-SYMMETRY-POS");
        $list63 = ConsesLow.list(new SubLObject[] { SubLObjectFactory.makeKeyword("SENSE"), SubLObjectFactory.makeKeyword("POS"), SubLObjectFactory.makeKeyword("REQUIRED-PATTERN"), ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("AND"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("FORT"), (SubLObject)SubLObjectFactory.makeKeyword("ANYTHING"), (SubLObject)SubLObjectFactory.makeKeyword("ANYTHING")), (SubLObject)ConsesLow.cons((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("TEST"), (SubLObject)SubLObjectFactory.makeSymbol("INFERENCE-SYMMETRIC-PREDICATE?")), (SubLObject)SubLObjectFactory.makeKeyword("ANYTHING"))), SubLObjectFactory.makeKeyword("COST"), SubLObjectFactory.makeSymbol("TRANS-PREDICATE-SYMMETRY-POS-COST"), SubLObjectFactory.makeKeyword("RULE-SELECT"), SubLObjectFactory.makeSymbol("TRANS-PREDICATE-SYMMETRY-POS-RULE-SELECT"), SubLObjectFactory.makeKeyword("RULE-FILTER"), SubLObjectFactory.makeSymbol("TRANS-PREDICATE-SYMMETRY-POS-RULE-FILTER"), SubLObjectFactory.makeKeyword("EXPAND"), SubLObjectFactory.makeSymbol("TRANS-PREDICATE-SYMMETRY-POS-EXPAND"), SubLObjectFactory.makeKeyword("DOCUMENTATION"), SubLObjectFactory.makeString("(<predicate> <whatever> <whatever>)\nwhere <predicate> is a FORT\nand (#$isa <predicate> #$SymmetricBinaryPredicate)\nfrom a rule concluding to <predicate>\nusing the predicate rule indexing in the KB"), SubLObjectFactory.makeKeyword("EXAMPLE"), SubLObjectFactory.makeString("(#$bordersOn #$Canada ?WHAT)\nfrom (#$isa #$bordersOn #$SymmetricBinaryPredicate)\nand a rule concluding to #$bordersOn") });
        $kw64$TRANS_PREDICATE_SYMMETRY_NEG = SubLObjectFactory.makeKeyword("TRANS-PREDICATE-SYMMETRY-NEG");
        $list65 = ConsesLow.list(new SubLObject[] { SubLObjectFactory.makeKeyword("SENSE"), SubLObjectFactory.makeKeyword("NEG"), SubLObjectFactory.makeKeyword("REQUIRED-PATTERN"), ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("AND"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("FORT"), (SubLObject)SubLObjectFactory.makeKeyword("ANYTHING"), (SubLObject)SubLObjectFactory.makeKeyword("ANYTHING")), (SubLObject)ConsesLow.cons((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("TEST"), (SubLObject)SubLObjectFactory.makeSymbol("INFERENCE-SYMMETRIC-PREDICATE?")), (SubLObject)SubLObjectFactory.makeKeyword("ANYTHING"))), SubLObjectFactory.makeKeyword("COST"), SubLObjectFactory.makeSymbol("TRANS-PREDICATE-SYMMETRY-NEG-COST"), SubLObjectFactory.makeKeyword("RULE-SELECT"), SubLObjectFactory.makeSymbol("TRANS-PREDICATE-SYMMETRY-NEG-RULE-SELECT"), SubLObjectFactory.makeKeyword("RULE-FILTER"), SubLObjectFactory.makeSymbol("TRANS-PREDICATE-SYMMETRY-NEG-RULE-FILTER"), SubLObjectFactory.makeKeyword("EXPAND"), SubLObjectFactory.makeSymbol("TRANS-PREDICATE-SYMMETRY-NEG-EXPAND"), SubLObjectFactory.makeKeyword("DOCUMENTATION"), SubLObjectFactory.makeString("(#$not (<predicate> <whatever> <whatever>))\nwhere <predicate> is a FORT\nand (#$isa <predicate> #$SymmetricBinaryPredicate)\nfrom a rule concluding from <predicate>\nusing the predicate rule indexing in the KB"), SubLObjectFactory.makeKeyword("EXAMPLE"), SubLObjectFactory.makeString("(#$not (#$bordersOn #$Canada ?WHAT))\nfrom (#$isa #$bordersOn #$SymmetricBinaryPredicate)\nand a rule concluding from #$bordersOn") });
        $kw66$TRANS_PREDICATE_COMMUTATIVE_POS = SubLObjectFactory.makeKeyword("TRANS-PREDICATE-COMMUTATIVE-POS");
        $list67 = ConsesLow.list(new SubLObject[] { SubLObjectFactory.makeKeyword("SENSE"), SubLObjectFactory.makeKeyword("POS"), SubLObjectFactory.makeKeyword("REQUIRED-PATTERN"), ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("AND"), (SubLObject)ConsesLow.listS((SubLObject)SubLObjectFactory.makeKeyword("FORT"), (SubLObject)SubLObjectFactory.makeKeyword("ANYTHING"), (SubLObject)SubLObjectFactory.makeKeyword("ANYTHING"), (SubLObject)SubLObjectFactory.makeKeyword("ANYTHING"), (SubLObject)SubLObjectFactory.makeKeyword("ANYTHING")), (SubLObject)ConsesLow.cons((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("TEST"), (SubLObject)SubLObjectFactory.makeSymbol("INFERENCE-COMMUTATIVE-PREDICATE-P")), (SubLObject)SubLObjectFactory.makeKeyword("ANYTHING"))), SubLObjectFactory.makeKeyword("COST"), SubLObjectFactory.makeSymbol("TRANS-PREDICATE-COMMUTATIVE-POS-COST"), SubLObjectFactory.makeKeyword("RULE-SELECT"), SubLObjectFactory.makeSymbol("TRANS-PREDICATE-COMMUTATIVE-POS-RULE-SELECT"), SubLObjectFactory.makeKeyword("RULE-FILTER"), SubLObjectFactory.makeSymbol("TRANS-PREDICATE-COMMUTATIVE-POS-RULE-FILTER"), SubLObjectFactory.makeKeyword("EXPAND"), SubLObjectFactory.makeSymbol("TRANS-PREDICATE-COMMUTATIVE-POS-EXPAND"), SubLObjectFactory.makeKeyword("DOCUMENTATION"), SubLObjectFactory.makeString("(<predicate> . <args>)\nwhere <predicate> is a FORT\nthere are at least 3 args in <args>\nand (#$isa <predicate> #$CommutativePredicate)\nfrom a rule concluding to <predicate>\nusing the predicate rule indexing in the KB"), SubLObjectFactory.makeKeyword("EXAMPLE"), SubLObjectFactory.makeString("(#$collinear <point A> <point B> <point C>)\nfrom (#$isa #$collinear #$CommutativePredicate)\nand a rule concluding to #$collinear") });
        $kw68$TRANS_PREDICATE_COMMUTATIVE_NEG = SubLObjectFactory.makeKeyword("TRANS-PREDICATE-COMMUTATIVE-NEG");
        $list69 = ConsesLow.list(new SubLObject[] { SubLObjectFactory.makeKeyword("SENSE"), SubLObjectFactory.makeKeyword("NEG"), SubLObjectFactory.makeKeyword("REQUIRED-PATTERN"), ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("AND"), (SubLObject)ConsesLow.listS((SubLObject)SubLObjectFactory.makeKeyword("FORT"), (SubLObject)SubLObjectFactory.makeKeyword("ANYTHING"), (SubLObject)SubLObjectFactory.makeKeyword("ANYTHING"), (SubLObject)SubLObjectFactory.makeKeyword("ANYTHING"), (SubLObject)SubLObjectFactory.makeKeyword("ANYTHING")), (SubLObject)ConsesLow.cons((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("TEST"), (SubLObject)SubLObjectFactory.makeSymbol("INFERENCE-COMMUTATIVE-PREDICATE-P")), (SubLObject)SubLObjectFactory.makeKeyword("ANYTHING"))), SubLObjectFactory.makeKeyword("COST"), SubLObjectFactory.makeSymbol("TRANS-PREDICATE-COMMUTATIVE-NEG-COST"), SubLObjectFactory.makeKeyword("RULE-SELECT"), SubLObjectFactory.makeSymbol("TRANS-PREDICATE-COMMUTATIVE-NEG-RULE-SELECT"), SubLObjectFactory.makeKeyword("RULE-FILTER"), SubLObjectFactory.makeSymbol("TRANS-PREDICATE-COMMUTATIVE-NEG-RULE-FILTER"), SubLObjectFactory.makeKeyword("EXPAND"), SubLObjectFactory.makeSymbol("TRANS-PREDICATE-COMMUTATIVE-NEG-EXPAND"), SubLObjectFactory.makeKeyword("DOCUMENTATION"), SubLObjectFactory.makeString("(#$not (<predicate> . <args>))\nwhere <predicate> is a FORT\nthere are at least 3 args in <args>\nand (#$isa <predicate> #$CommutativePredicate)\nfrom a rule concluding from <predicate>\nusing the predicate rule indexing in the KB"), SubLObjectFactory.makeKeyword("EXAMPLE"), SubLObjectFactory.makeString("(#$not (#$collinear <point A> <point B> <point C>))\nfrom (#$isa #$collinear #$CommutativePredicate)\nand a rule concluding from #$collinear") });
        $kw70$TRANS_PREDICATE_PARTIALLY_COMMUTATIVE_POS = SubLObjectFactory.makeKeyword("TRANS-PREDICATE-PARTIALLY-COMMUTATIVE-POS");
        $list71 = ConsesLow.list(new SubLObject[] { SubLObjectFactory.makeKeyword("SENSE"), SubLObjectFactory.makeKeyword("POS"), SubLObjectFactory.makeKeyword("REQUIRED-PATTERN"), ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("AND"), (SubLObject)ConsesLow.listS((SubLObject)SubLObjectFactory.makeKeyword("FORT"), (SubLObject)SubLObjectFactory.makeKeyword("ANYTHING"), (SubLObject)SubLObjectFactory.makeKeyword("ANYTHING"), (SubLObject)SubLObjectFactory.makeKeyword("ANYTHING"), (SubLObject)SubLObjectFactory.makeKeyword("ANYTHING")), (SubLObject)ConsesLow.cons((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("TEST"), (SubLObject)SubLObjectFactory.makeSymbol("INFERENCE-PARTIALLY-COMMUTATIVE-PREDICATE-P")), (SubLObject)SubLObjectFactory.makeKeyword("ANYTHING"))), SubLObjectFactory.makeKeyword("COST"), SubLObjectFactory.makeSymbol("TRANS-PREDICATE-PARTIALLY-COMMUTATIVE-POS-COST"), SubLObjectFactory.makeKeyword("RULE-SELECT"), SubLObjectFactory.makeSymbol("TRANS-PREDICATE-PARTIALLY-COMMUTATIVE-POS-RULE-SELECT"), SubLObjectFactory.makeKeyword("RULE-FILTER"), SubLObjectFactory.makeSymbol("TRANS-PREDICATE-PARTIALLY-COMMUTATIVE-POS-RULE-FILTER"), SubLObjectFactory.makeKeyword("EXPAND"), SubLObjectFactory.makeSymbol("TRANS-PREDICATE-PARTIALLY-COMMUTATIVE-POS-EXPAND"), SubLObjectFactory.makeKeyword("DOCUMENTATION"), SubLObjectFactory.makeString("(<predicate> <whatever> <whatever>)\nwhere <predicate> is a FORT\nand (#$isa <predicate> #$PartiallyCommutativePredicate)\nfrom a rule concluding to <predicate>\nusing the predicate rule indexing in the KB"), SubLObjectFactory.makeKeyword("EXAMPLE"), SubLObjectFactory.makeString("(distanceBetween PlanetEarth Sun ((Mega Mile) 93))\nfrom (#$isa #$distanceBetween #$PartiallyCommutativePredicate)\nand  (#$commutativeInArgs #$distanceBetween 1 2)\nand a rule concluding to #$distanceBetween") });
        $kw72$TRANS_PREDICATE_PARTIALLY_COMMUTATIVE_NEG = SubLObjectFactory.makeKeyword("TRANS-PREDICATE-PARTIALLY-COMMUTATIVE-NEG");
        $list73 = ConsesLow.list(new SubLObject[] { SubLObjectFactory.makeKeyword("SENSE"), SubLObjectFactory.makeKeyword("NEG"), SubLObjectFactory.makeKeyword("REQUIRED-PATTERN"), ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("AND"), (SubLObject)ConsesLow.listS((SubLObject)SubLObjectFactory.makeKeyword("FORT"), (SubLObject)SubLObjectFactory.makeKeyword("ANYTHING"), (SubLObject)SubLObjectFactory.makeKeyword("ANYTHING"), (SubLObject)SubLObjectFactory.makeKeyword("ANYTHING"), (SubLObject)SubLObjectFactory.makeKeyword("ANYTHING")), (SubLObject)ConsesLow.cons((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("TEST"), (SubLObject)SubLObjectFactory.makeSymbol("INFERENCE-PARTIALLY-COMMUTATIVE-PREDICATE-P")), (SubLObject)SubLObjectFactory.makeKeyword("ANYTHING"))), SubLObjectFactory.makeKeyword("COST"), SubLObjectFactory.makeSymbol("TRANS-PREDICATE-PARTIALLY-COMMUTATIVE-NEG-COST"), SubLObjectFactory.makeKeyword("RULE-SELECT"), SubLObjectFactory.makeSymbol("TRANS-PREDICATE-PARTIALLY-COMMUTATIVE-NEG-RULE-SELECT"), SubLObjectFactory.makeKeyword("RULE-FILTER"), SubLObjectFactory.makeSymbol("TRANS-PREDICATE-PARTIALLY-COMMUTATIVE-NEG-RULE-FILTER"), SubLObjectFactory.makeKeyword("EXPAND"), SubLObjectFactory.makeSymbol("TRANS-PREDICATE-PARTIALLY-COMMUTATIVE-NEG-EXPAND"), SubLObjectFactory.makeKeyword("DOCUMENTATION"), SubLObjectFactory.makeString("(#$not (<predicate> <whatever> <whatever>))\nwhere <predicate> is a FORT\nand (#$isa <predicate> #$PartiallyCommutativePredicate)\nfrom a rule concluding from <predicate>\nusing the predicate rule indexing in the KB"), SubLObjectFactory.makeKeyword("EXAMPLE"), SubLObjectFactory.makeString("(not (distanceBetween PlanetEarth Sun (Inch 93)))\nfrom (#$isa #$distanceBetween #$PartiallyCommutativePredicate)\nand  (#$commutativeInArgs #$distanceBetween 1 2)\nand a rule concluding from #$distanceBetween") });
        $kw74$TRANS_PREDICATE_ASYMMETRY = SubLObjectFactory.makeKeyword("TRANS-PREDICATE-ASYMMETRY");
        $list75 = ConsesLow.list(new SubLObject[] { SubLObjectFactory.makeKeyword("SENSE"), SubLObjectFactory.makeKeyword("NEG"), SubLObjectFactory.makeKeyword("REQUIRED-PATTERN"), ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("AND"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("FORT"), (SubLObject)SubLObjectFactory.makeKeyword("ANYTHING"), (SubLObject)SubLObjectFactory.makeKeyword("ANYTHING")), (SubLObject)ConsesLow.cons((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("TEST"), (SubLObject)SubLObjectFactory.makeSymbol("INFERENCE-ASYMMETRIC-PREDICATE?")), (SubLObject)SubLObjectFactory.makeKeyword("ANYTHING"))), SubLObjectFactory.makeKeyword("COST"), SubLObjectFactory.makeSymbol("TRANS-PREDICATE-ASYMMETRY-COST"), SubLObjectFactory.makeKeyword("RULE-SELECT"), SubLObjectFactory.makeSymbol("TRANS-PREDICATE-ASYMMETRY-RULE-SELECT"), SubLObjectFactory.makeKeyword("RULE-FILTER"), SubLObjectFactory.makeSymbol("TRANS-PREDICATE-ASYMMETRY-RULE-FILTER"), SubLObjectFactory.makeKeyword("EXPAND"), SubLObjectFactory.makeSymbol("TRANS-PREDICATE-ASYMMETRY-EXPAND"), SubLObjectFactory.makeKeyword("DOCUMENTATION"), SubLObjectFactory.makeString("(#$not (<predicate> <whatever> <whatever>))\nwhere <predicate> is a FORT\nand (#$isa <predicate> #$AsymmetricBinaryPredicate)\nfrom a rule concluding to <predicate>\nusing the predicate rule indexing in the KB"), SubLObjectFactory.makeKeyword("EXAMPLE"), SubLObjectFactory.makeString("(#$not (#$northOf ?WHAT #$Canada))\nfrom (#$isa #$northOf #$AsymmetricBinaryPredicate)\nand a rule concluding to #$northOf") });
        $list76 = ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("TRANS-UNBOUND-PREDICATE-POS"), (SubLObject)SubLObjectFactory.makeKeyword("TRANS-UNBOUND-PREDICATE-NEG"));
        $kw77$TRANS_UNBOUND_PREDICATE_POS = SubLObjectFactory.makeKeyword("TRANS-UNBOUND-PREDICATE-POS");
        $list78 = ConsesLow.list(new SubLObject[] { SubLObjectFactory.makeKeyword("SENSE"), SubLObjectFactory.makeKeyword("POS"), SubLObjectFactory.makeKeyword("REQUIRED"), SubLObjectFactory.makeSymbol("TRANS-UNBOUND-PREDICATE-POS-REQUIRED"), SubLObjectFactory.makeKeyword("COST"), SubLObjectFactory.makeSymbol("TRANS-UNBOUND-PREDICATE-POS-COST"), SubLObjectFactory.makeKeyword("RULE-SELECT"), SubLObjectFactory.makeSymbol("TRANS-UNBOUND-PREDICATE-POS-RULE-SELECT"), SubLObjectFactory.makeKeyword("RULE-FILTER"), SubLObjectFactory.makeSymbol("TRANS-UNBOUND-PREDICATE-POS-RULE-FILTER"), SubLObjectFactory.makeKeyword("EXPAND"), SubLObjectFactory.makeSymbol("TRANS-UNBOUND-PREDICATE-POS-EXPAND"), SubLObjectFactory.makeKeyword("DOCUMENTATION"), SubLObjectFactory.makeString("(<whatever> . <whatever>)\nfrom a rule concluding to a sentence with a variable as the predicate\nusing the unbound predicate rule indexing in the KB"), SubLObjectFactory.makeKeyword("EXAMPLE"), SubLObjectFactory.makeString("(#$implies\n      (#$and (#$isa ?ORDER #$MathematicalOrdering) (#$baseSet ?ORDER ?SET)\n       (#$orderingRelations ?ORDER ?PRED) (#$elementOf ?X ?SET)\n       (#$elementOf ?Y ?SET) (?PRED ?X ?Y) (#$elementOf ?Z ?SET)\n       (?PRED ?Y ?Z))\n      (?PRED ?X ?Z))") });
        $kw79$TRANS_UNBOUND_PREDICATE_NEG = SubLObjectFactory.makeKeyword("TRANS-UNBOUND-PREDICATE-NEG");
        $list80 = ConsesLow.list(new SubLObject[] { SubLObjectFactory.makeKeyword("SENSE"), SubLObjectFactory.makeKeyword("NEG"), SubLObjectFactory.makeKeyword("REQUIRED"), SubLObjectFactory.makeSymbol("TRANS-UNBOUND-PREDICATE-NEG-REQUIRED"), SubLObjectFactory.makeKeyword("COST"), SubLObjectFactory.makeSymbol("TRANS-UNBOUND-PREDICATE-NEG-COST"), SubLObjectFactory.makeKeyword("RULE-SELECT"), SubLObjectFactory.makeSymbol("TRANS-UNBOUND-PREDICATE-NEG-RULE-SELECT"), SubLObjectFactory.makeKeyword("RULE-FILTER"), SubLObjectFactory.makeSymbol("TRANS-UNBOUND-PREDICATE-NEG-RULE-FILTER"), SubLObjectFactory.makeKeyword("EXPAND"), SubLObjectFactory.makeSymbol("TRANS-UNBOUND-PREDICATE-NEG-EXPAND"), SubLObjectFactory.makeKeyword("DOCUMENTATION"), SubLObjectFactory.makeString("(#$not (<whatever> . <whatever>))\nfrom a rule concluding from a sentence with a variable as the predicate\nusing the unbound predicate rule indexing in the KB"), SubLObjectFactory.makeKeyword("EXAMPLE"), SubLObjectFactory.makeString("no current example") });
        $sym81$TRANS_UNBOUND_PREDICATE_RULE_SELECT = SubLObjectFactory.makeSymbol("TRANS-UNBOUND-PREDICATE-RULE-SELECT");
        $list82 = ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("TRANS-ISA-POS"), (SubLObject)SubLObjectFactory.makeKeyword("TRANS-ISA-NEG"), (SubLObject)SubLObjectFactory.makeKeyword("TRANS-GENLS-POS"), (SubLObject)SubLObjectFactory.makeKeyword("TRANS-GENLS-NEG"), (SubLObject)SubLObjectFactory.makeKeyword("TRANS-GENL-MT-POS"), (SubLObject)SubLObjectFactory.makeKeyword("TRANS-GENL-MT-NEG"));
        $sym83$INFERENCE_MEMOIZED_ALL_SPECS = SubLObjectFactory.makeSymbol("INFERENCE-MEMOIZED-ALL-SPECS");
        $sym84$TRANS_ISA_POS_RULE_SELECT_COUNT = SubLObjectFactory.makeSymbol("TRANS-ISA-POS-RULE-SELECT-COUNT");
        $const85$isa = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("isa"));
        $kw86$TRANS_ISA_POS = SubLObjectFactory.makeKeyword("TRANS-ISA-POS");
        $list87 = ConsesLow.list(new SubLObject[] { SubLObjectFactory.makeKeyword("SENSE"), SubLObjectFactory.makeKeyword("POS"), SubLObjectFactory.makeKeyword("PREDICATE"), constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("isa")), SubLObjectFactory.makeKeyword("REQUIRED-PATTERN"), ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("isa")), (SubLObject)SubLObjectFactory.makeKeyword("ANYTHING"), (SubLObject)SubLObjectFactory.makeKeyword("FORT")), SubLObjectFactory.makeKeyword("REQUIRED"), SubLObjectFactory.makeSymbol("TRANS-ISA-POS-REQUIRED"), SubLObjectFactory.makeKeyword("COST"), SubLObjectFactory.makeSymbol("TRANS-ISA-POS-COST"), SubLObjectFactory.makeKeyword("RULE-SELECT"), SubLObjectFactory.makeSymbol("TRANS-ISA-POS-RULE-SELECT"), SubLObjectFactory.makeKeyword("RULE-FILTER"), SubLObjectFactory.makeSymbol("TRANS-ISA-POS-RULE-FILTER"), SubLObjectFactory.makeKeyword("EXPAND"), SubLObjectFactory.makeSymbol("TRANS-ISA-POS-EXPAND"), SubLObjectFactory.makeKeyword("DOCUMENTATION"), SubLObjectFactory.makeString("(#$isa <whatever> <collection>)\nwhere <collection> is a FORT\nfrom a rule concluding to a spec of <collection>\nusing the isa rule indexing in the KB"), SubLObjectFactory.makeKeyword("EXAMPLE"), SubLObjectFactory.makeString("(#$isa #$AbrahamLincoln #$FamousPerson)\nfrom (#$genls #$UnitedStatesPresident #$FamousPerson)\nand a rule concluding to #$isa #$UnitedStatesPresident") });
        $kw88$TRANS_ISA_NEG = SubLObjectFactory.makeKeyword("TRANS-ISA-NEG");
        $list89 = ConsesLow.list(new SubLObject[] { SubLObjectFactory.makeKeyword("SENSE"), SubLObjectFactory.makeKeyword("NEG"), SubLObjectFactory.makeKeyword("PREDICATE"), constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("isa")), SubLObjectFactory.makeKeyword("REQUIRED-PATTERN"), ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("isa")), (SubLObject)SubLObjectFactory.makeKeyword("ANYTHING"), (SubLObject)SubLObjectFactory.makeKeyword("FORT")), SubLObjectFactory.makeKeyword("REQUIRED"), SubLObjectFactory.makeSymbol("TRANS-ISA-NEG-REQUIRED"), SubLObjectFactory.makeKeyword("COST"), SubLObjectFactory.makeSymbol("TRANS-ISA-NEG-COST"), SubLObjectFactory.makeKeyword("RULE-SELECT"), SubLObjectFactory.makeSymbol("TRANS-ISA-NEG-RULE-SELECT"), SubLObjectFactory.makeKeyword("RULE-FILTER"), SubLObjectFactory.makeSymbol("TRANS-ISA-NEG-RULE-FILTER"), SubLObjectFactory.makeKeyword("EXPAND"), SubLObjectFactory.makeSymbol("TRANS-ISA-NEG-EXPAND"), SubLObjectFactory.makeKeyword("DOCUMENTATION"), SubLObjectFactory.makeString("(#$not (#$isa <whatever> <collection>))\nwhere <collection> is a FORT\nfrom a rule concluding from a genl of <collection>\nusing the isa rule indexing in the KB"), SubLObjectFactory.makeKeyword("EXAMPLE"), SubLObjectFactory.makeString("(#$not (#$isa #$AbrahamLincoln #$FrenchPerson))\nfrom (#$genls #$FrenchPerson #$EuropeanPerson)\nand a rule concluding from #$isa #$EuropeanPerson") });
        $kw90$TRANS_GENLS_POS = SubLObjectFactory.makeKeyword("TRANS-GENLS-POS");
        $list91 = ConsesLow.list(new SubLObject[] { SubLObjectFactory.makeKeyword("SENSE"), SubLObjectFactory.makeKeyword("POS"), SubLObjectFactory.makeKeyword("PREDICATE"), constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("genls")), SubLObjectFactory.makeKeyword("REQUIRED-PATTERN"), ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("genls")), (SubLObject)SubLObjectFactory.makeKeyword("ANYTHING"), (SubLObject)SubLObjectFactory.makeKeyword("FORT")), SubLObjectFactory.makeKeyword("REQUIRED"), SubLObjectFactory.makeSymbol("TRANS-GENLS-POS-REQUIRED"), SubLObjectFactory.makeKeyword("COST"), SubLObjectFactory.makeSymbol("TRANS-GENLS-POS-COST"), SubLObjectFactory.makeKeyword("RULE-SELECT"), SubLObjectFactory.makeSymbol("TRANS-GENLS-POS-RULE-SELECT"), SubLObjectFactory.makeKeyword("RULE-FILTER"), SubLObjectFactory.makeSymbol("TRANS-GENLS-POS-RULE-FILTER"), SubLObjectFactory.makeKeyword("EXPAND"), SubLObjectFactory.makeSymbol("TRANS-GENLS-POS-EXPAND"), SubLObjectFactory.makeKeyword("DOCUMENTATION"), SubLObjectFactory.makeString("(#$genls <whatever> <collection>)\nwhere <collection> is a FORT\nfrom a rule concluding to a spec of <collection>\nusing the genls rule indexing in the KB"), SubLObjectFactory.makeKeyword("EXAMPLE"), SubLObjectFactory.makeString("(#$genls #$UnitedStatesPresident #$FamousPerson)\nfrom (#$genls #$WorldLeader #$FamousPerson)\nand a rule concluding to (#$genls ?X #$WorldLeader)") });
        $kw92$TRANS_GENLS_NEG = SubLObjectFactory.makeKeyword("TRANS-GENLS-NEG");
        $list93 = ConsesLow.list(new SubLObject[] { SubLObjectFactory.makeKeyword("SENSE"), SubLObjectFactory.makeKeyword("NEG"), SubLObjectFactory.makeKeyword("PREDICATE"), constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("genls")), SubLObjectFactory.makeKeyword("REQUIRED-PATTERN"), ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("genls")), (SubLObject)SubLObjectFactory.makeKeyword("ANYTHING"), (SubLObject)SubLObjectFactory.makeKeyword("FORT")), SubLObjectFactory.makeKeyword("REQUIRED"), SubLObjectFactory.makeSymbol("TRANS-GENLS-NEG-REQUIRED"), SubLObjectFactory.makeKeyword("COST"), SubLObjectFactory.makeSymbol("TRANS-GENLS-NEG-COST"), SubLObjectFactory.makeKeyword("RULE-SELECT"), SubLObjectFactory.makeSymbol("TRANS-GENLS-NEG-RULE-SELECT"), SubLObjectFactory.makeKeyword("RULE-FILTER"), SubLObjectFactory.makeSymbol("TRANS-GENLS-NEG-RULE-FILTER"), SubLObjectFactory.makeKeyword("EXPAND"), SubLObjectFactory.makeSymbol("TRANS-GENLS-NEG-EXPAND"), SubLObjectFactory.makeKeyword("DOCUMENTATION"), SubLObjectFactory.makeString("(#$not (#$genls <whatever> <collection>))\nwhere <collection> is a FORT\nfrom a rule concluding from a genl of <collection>\nusing the genls rule indexing in the KB"), SubLObjectFactory.makeKeyword("EXAMPLE"), SubLObjectFactory.makeString("(#$not (#$genls #$UnitedStatesPresident #$FrenchPerson))\nfrom (#$genls #$FrenchPerson #$EuropeanPerson)\nand a rule concluding from (#$genls ?X #$EuropeanPerson)") });
        $sym94$INFERENCE_MEMOIZED_ALL_SPEC_MTS = SubLObjectFactory.makeSymbol("INFERENCE-MEMOIZED-ALL-SPEC-MTS");
        $kw95$TRANS_GENL_MT_POS = SubLObjectFactory.makeKeyword("TRANS-GENL-MT-POS");
        $list96 = ConsesLow.list(new SubLObject[] { SubLObjectFactory.makeKeyword("SENSE"), SubLObjectFactory.makeKeyword("POS"), SubLObjectFactory.makeKeyword("PREDICATE"), constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("genlMt")), SubLObjectFactory.makeKeyword("REQUIRED-PATTERN"), ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("genlMt")), (SubLObject)SubLObjectFactory.makeKeyword("ANYTHING"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("TEST"), (SubLObject)SubLObjectFactory.makeSymbol("HLMT-P"))), SubLObjectFactory.makeKeyword("REQUIRED"), SubLObjectFactory.makeSymbol("TRANS-GENL-MT-POS-REQUIRED"), SubLObjectFactory.makeKeyword("COST"), SubLObjectFactory.makeSymbol("TRANS-GENL-MT-POS-COST"), SubLObjectFactory.makeKeyword("RULE-SELECT"), SubLObjectFactory.makeSymbol("TRANS-GENL-MT-POS-RULE-SELECT"), SubLObjectFactory.makeKeyword("RULE-FILTER"), SubLObjectFactory.makeSymbol("TRANS-GENL-MT-POS-RULE-FILTER"), SubLObjectFactory.makeKeyword("EXPAND"), SubLObjectFactory.makeSymbol("TRANS-GENL-MT-POS-EXPAND"), SubLObjectFactory.makeKeyword("DOCUMENTATION"), SubLObjectFactory.makeString("(#$genlMt <whatever> <microtheory>)\nwhere <microtheory> is a FORT\nfrom a rule concluding to a spec of <microtheory>\nusing the genlMt rule indexing in the KB"), SubLObjectFactory.makeKeyword("EXAMPLE"), SubLObjectFactory.makeString("(#$genlMt #$UnitedStatesPresidentsMt #$FamousPeopleMt)\nfrom (#$genlMt #$WorldLeadersMt #$FamousPeopleMt)\nand a rule concluding to (#$genlMt ?X #$WorldLeadersMt)") });
        $kw97$TRANS_GENL_MT_NEG = SubLObjectFactory.makeKeyword("TRANS-GENL-MT-NEG");
        $list98 = ConsesLow.list(new SubLObject[] { SubLObjectFactory.makeKeyword("SENSE"), SubLObjectFactory.makeKeyword("NEG"), SubLObjectFactory.makeKeyword("PREDICATE"), constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("genlMt")), SubLObjectFactory.makeKeyword("REQUIRED-PATTERN"), ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("genlMt")), (SubLObject)SubLObjectFactory.makeKeyword("ANYTHING"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("TEST"), (SubLObject)SubLObjectFactory.makeSymbol("HLMT-P"))), SubLObjectFactory.makeKeyword("REQUIRED"), SubLObjectFactory.makeSymbol("TRANS-GENL-MT-NEG-REQUIRED"), SubLObjectFactory.makeKeyword("COST"), SubLObjectFactory.makeSymbol("TRANS-GENL-MT-NEG-COST"), SubLObjectFactory.makeKeyword("RULE-SELECT"), SubLObjectFactory.makeSymbol("TRANS-GENL-MT-NEG-RULE-SELECT"), SubLObjectFactory.makeKeyword("RULE-FILTER"), SubLObjectFactory.makeSymbol("TRANS-GENL-MT-NEG-RULE-FILTER"), SubLObjectFactory.makeKeyword("EXPAND"), SubLObjectFactory.makeSymbol("TRANS-GENL-MT-NEG-EXPAND"), SubLObjectFactory.makeKeyword("DOCUMENTATION"), SubLObjectFactory.makeString("(#$not (#$genlMt <whatever> <microtheory>))\nwhere <microtheory> is a FORT\nfrom a rule concluding from a genl of <microtheory>\nusing the genlMt rule indexing in the KB"), SubLObjectFactory.makeKeyword("EXAMPLE"), SubLObjectFactory.makeString("(#$not (#$genlMt #$UnitedStatesPresidentsMt #$FrenchPeopleMt))\nfrom (#$genlMt #$FrenchPeopleMt #$EuropeanPeopleMt)\nand a rule concluding from (#$genlMt ?X #$EuropeanPeopleMt)") });
        $const99$abnormal = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("abnormal"));
        $kw100$TRANS_ABNORMAL = SubLObjectFactory.makeKeyword("TRANS-ABNORMAL");
        $list101 = ConsesLow.list(new SubLObject[] { SubLObjectFactory.makeKeyword("SENSE"), SubLObjectFactory.makeKeyword("POS"), SubLObjectFactory.makeKeyword("PREDICATE"), constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("abnormal")), SubLObjectFactory.makeKeyword("REQUIRED-PATTERN"), ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("abnormal")), (SubLObject)SubLObjectFactory.makeKeyword("ANYTHING"), (SubLObject)SubLObjectFactory.makeKeyword("ASSERTION")), SubLObjectFactory.makeKeyword("EXCLUSIVE"), SubLObjectFactory.makeSymbol("TRUE"), SubLObjectFactory.makeKeyword("COST"), SubLObjectFactory.makeSymbol("TRANS-ABNORMAL-COST"), SubLObjectFactory.makeKeyword("RULE-SELECT"), SubLObjectFactory.makeSymbol("TRANS-ABNORMAL-RULE-SELECT"), SubLObjectFactory.makeKeyword("RULE-FILTER"), SubLObjectFactory.makeSymbol("TRANS-ABNORMAL-RULE-FILTER"), SubLObjectFactory.makeKeyword("EXPAND"), SubLObjectFactory.makeSymbol("TRANS-ABNORMAL-EXPAND") });
        $list102 = ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("implies")), (SubLObject)ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("and")), (SubLObject)ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("isa")), (SubLObject)SubLObjectFactory.makeSymbol("?OBJ"), (SubLObject)SubLObjectFactory.makeSymbol("?SUBSET")), (SubLObject)ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("genls")), (SubLObject)SubLObjectFactory.makeSymbol("?SUBSET"), (SubLObject)SubLObjectFactory.makeSymbol("?SUPERSET"))), (SubLObject)ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("isa")), (SubLObject)SubLObjectFactory.makeSymbol("?OBJ"), (SubLObject)SubLObjectFactory.makeSymbol("?SUPERSET")));
        $kw103$TRANSFORMATION_ABDUCTION_TO_SPECS = SubLObjectFactory.makeKeyword("TRANSFORMATION-ABDUCTION-TO-SPECS");
        $list104 = ConsesLow.list(new SubLObject[] { SubLObjectFactory.makeKeyword("SENSE"), SubLObjectFactory.makeKeyword("POS"), SubLObjectFactory.makeKeyword("ARITY"), transformation_modules.TWO_INTEGER, SubLObjectFactory.makeKeyword("PREDICATE"), constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("isa")), SubLObjectFactory.makeKeyword("REQUIRED-PATTERN"), ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("isa")), (SubLObject)SubLObjectFactory.makeKeyword("FORT"), (SubLObject)SubLObjectFactory.makeKeyword("FULLY-BOUND")), SubLObjectFactory.makeKeyword("REQUIRED"), SubLObjectFactory.makeSymbol("TRANSFORMATION-ABDUCTION-TO-SPECS-REQUIRED"), SubLObjectFactory.makeKeyword("COST-EXPRESSION"), SubLObjectFactory.makeSymbol("*DEFAULT-ABDUCTION-COST*"), SubLObjectFactory.makeKeyword("RULE-SELECT"), SubLObjectFactory.makeSymbol("TRANSFORMATION-ABDUCTION-TO-SPECS-RULE-SELECT"), SubLObjectFactory.makeKeyword("RULE-FILTER"), SubLObjectFactory.makeSymbol("TRANSFORMATION-ABDUCTION-TO-SPECS-RULE-FILTER"), SubLObjectFactory.makeKeyword("EXPAND"), SubLObjectFactory.makeSymbol("TRANSFORMATION-ABDUCTION-TO-SPECS-EXPAND"), SubLObjectFactory.makeKeyword("DOCUMENTATION"), SubLObjectFactory.makeString("(#$isa <fort> <fully-bound>)\n   where the asent is deemed abducible, and the problem store allows abduction,\n   using #$genls rules."), SubLObjectFactory.makeKeyword("EXAMPLE"), SubLObjectFactory.makeString("(#$isa #$GeorgeWBush #$Parent)") });
    }
    
    public static final class $trans_predicate_pos_required$UnaryFunction extends UnaryFunction
    {
        public $trans_predicate_pos_required$UnaryFunction() {
            super(SubLTranslatedFile.extractFunctionNamed("TRANS-PREDICATE-POS-REQUIRED"));
        }
        
        @Override
		public SubLObject processItem(final SubLObject arg1) {
            return transformation_modules.trans_predicate_pos_required(arg1);
        }
    }
    
    public static final class $trans_predicate_pos_cost$UnaryFunction extends UnaryFunction
    {
        public $trans_predicate_pos_cost$UnaryFunction() {
            super(SubLTranslatedFile.extractFunctionNamed("TRANS-PREDICATE-POS-COST"));
        }
        
        @Override
		public SubLObject processItem(final SubLObject arg1) {
            return transformation_modules.trans_predicate_pos_cost(arg1);
        }
    }
    
    public static final class $trans_predicate_pos_rule_select$UnaryFunction extends UnaryFunction
    {
        public $trans_predicate_pos_rule_select$UnaryFunction() {
            super(SubLTranslatedFile.extractFunctionNamed("TRANS-PREDICATE-POS-RULE-SELECT"));
        }
        
        @Override
		public SubLObject processItem(final SubLObject arg1) {
            return transformation_modules.trans_predicate_pos_rule_select(arg1);
        }
    }
    
    public static final class $trans_predicate_pos_rule_filter$BinaryFunction extends BinaryFunction
    {
        public $trans_predicate_pos_rule_filter$BinaryFunction() {
            super(SubLTranslatedFile.extractFunctionNamed("TRANS-PREDICATE-POS-RULE-FILTER"));
        }
        
        @Override
		public SubLObject processItem(final SubLObject arg1, final SubLObject arg2) {
            return transformation_modules.trans_predicate_pos_rule_filter(arg1, arg2);
        }
    }
    
    public static final class $trans_predicate_pos_expand$BinaryFunction extends BinaryFunction
    {
        public $trans_predicate_pos_expand$BinaryFunction() {
            super(SubLTranslatedFile.extractFunctionNamed("TRANS-PREDICATE-POS-EXPAND"));
        }
        
        @Override
		public SubLObject processItem(final SubLObject arg1, final SubLObject arg2) {
            return transformation_modules.trans_predicate_pos_expand(arg1, arg2);
        }
    }
    
    public static final class $trans_predicate_genlpreds_pos_required$UnaryFunction extends UnaryFunction
    {
        public $trans_predicate_genlpreds_pos_required$UnaryFunction() {
            super(SubLTranslatedFile.extractFunctionNamed("TRANS-PREDICATE-GENLPREDS-POS-REQUIRED"));
        }
        
        @Override
		public SubLObject processItem(final SubLObject arg1) {
            return transformation_modules.trans_predicate_genlpreds_pos_required(arg1);
        }
    }
    
    public static final class $trans_predicate_genlpreds_pos_cost$UnaryFunction extends UnaryFunction
    {
        public $trans_predicate_genlpreds_pos_cost$UnaryFunction() {
            super(SubLTranslatedFile.extractFunctionNamed("TRANS-PREDICATE-GENLPREDS-POS-COST"));
        }
        
        @Override
		public SubLObject processItem(final SubLObject arg1) {
            return transformation_modules.trans_predicate_genlpreds_pos_cost(arg1);
        }
    }
    
    public static final class $trans_predicate_genlpreds_pos_rule_select$UnaryFunction extends UnaryFunction
    {
        public $trans_predicate_genlpreds_pos_rule_select$UnaryFunction() {
            super(SubLTranslatedFile.extractFunctionNamed("TRANS-PREDICATE-GENLPREDS-POS-RULE-SELECT"));
        }
        
        @Override
		public SubLObject processItem(final SubLObject arg1) {
            return transformation_modules.trans_predicate_genlpreds_pos_rule_select(arg1);
        }
    }
    
    public static final class $trans_predicate_symmetry_pos_cost$UnaryFunction extends UnaryFunction
    {
        public $trans_predicate_symmetry_pos_cost$UnaryFunction() {
            super(SubLTranslatedFile.extractFunctionNamed("TRANS-PREDICATE-SYMMETRY-POS-COST"));
        }
        
        @Override
		public SubLObject processItem(final SubLObject arg1) {
            return transformation_modules.trans_predicate_symmetry_pos_cost(arg1);
        }
    }
    
    public static final class $trans_predicate_symmetry_pos_rule_select$UnaryFunction extends UnaryFunction
    {
        public $trans_predicate_symmetry_pos_rule_select$UnaryFunction() {
            super(SubLTranslatedFile.extractFunctionNamed("TRANS-PREDICATE-SYMMETRY-POS-RULE-SELECT"));
        }
        
        @Override
		public SubLObject processItem(final SubLObject arg1) {
            return transformation_modules.trans_predicate_symmetry_pos_rule_select(arg1);
        }
    }
    
    public static final class $trans_predicate_symmetry_pos_rule_filter$BinaryFunction extends BinaryFunction
    {
        public $trans_predicate_symmetry_pos_rule_filter$BinaryFunction() {
            super(SubLTranslatedFile.extractFunctionNamed("TRANS-PREDICATE-SYMMETRY-POS-RULE-FILTER"));
        }
        
        @Override
		public SubLObject processItem(final SubLObject arg1, final SubLObject arg2) {
            return transformation_modules.trans_predicate_symmetry_pos_rule_filter(arg1, arg2);
        }
    }
    
    public static final class $trans_predicate_symmetry_pos_expand$BinaryFunction extends BinaryFunction
    {
        public $trans_predicate_symmetry_pos_expand$BinaryFunction() {
            super(SubLTranslatedFile.extractFunctionNamed("TRANS-PREDICATE-SYMMETRY-POS-EXPAND"));
        }
        
        @Override
		public SubLObject processItem(final SubLObject arg1, final SubLObject arg2) {
            return transformation_modules.trans_predicate_symmetry_pos_expand(arg1, arg2);
        }
    }
    
    public static final class $trans_unbound_predicate_pos_required$UnaryFunction extends UnaryFunction
    {
        public $trans_unbound_predicate_pos_required$UnaryFunction() {
            super(SubLTranslatedFile.extractFunctionNamed("TRANS-UNBOUND-PREDICATE-POS-REQUIRED"));
        }
        
        @Override
		public SubLObject processItem(final SubLObject arg1) {
            return transformation_modules.trans_unbound_predicate_pos_required(arg1);
        }
    }
    
    public static final class $trans_unbound_predicate_pos_cost$UnaryFunction extends UnaryFunction
    {
        public $trans_unbound_predicate_pos_cost$UnaryFunction() {
            super(SubLTranslatedFile.extractFunctionNamed("TRANS-UNBOUND-PREDICATE-POS-COST"));
        }
        
        @Override
		public SubLObject processItem(final SubLObject arg1) {
            return transformation_modules.trans_unbound_predicate_pos_cost(arg1);
        }
    }
}

/*

	Total time: 878 ms
	
*/