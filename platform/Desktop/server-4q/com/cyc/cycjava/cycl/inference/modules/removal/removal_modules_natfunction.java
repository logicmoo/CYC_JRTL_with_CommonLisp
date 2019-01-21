package com.cyc.cycjava.cycl.inference.modules.removal;

import com.cyc.cycjava.cycl.constant_handles;
import com.cyc.cycjava.cycl.subl_macro_promotions;
import com.cyc.cycjava.cycl.inference.modules.preference_modules;
import com.cyc.cycjava.cycl.inference.harness.inference_modules;
import com.cyc.tool.subl.util.SubLFiles;
import com.cyc.cycjava.cycl.inference.harness.removal_module_utilities;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Equality;
import com.cyc.cycjava.cycl.nart_handles;
import com.cyc.cycjava.cycl.narts_high;
import com.cyc.cycjava.cycl.inference.harness.inference_worker_removal;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Sequences;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory;
import com.cyc.cycjava.cycl.isa;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Values;
import com.cyc.cycjava.cycl.memoization_state;
import com.cyc.cycjava.cycl.list_utilities;
import com.cyc.cycjava.cycl.dictionary_contents;
import com.cyc.cycjava.cycl.dictionary_utilities;
import com.cyc.cycjava.cycl.dictionary;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.cdestructuring_bind;
import com.cyc.cycjava.cycl.clauses;
import com.cyc.cycjava.cycl.variables;
import com.cyc.cycjava.cycl.fort_types_interface;
import com.cyc.cycjava.cycl.number_utilities;
import com.cyc.cycjava.cycl.el_utilities;
import com.cyc.cycjava.cycl.subl_promotions;
import com.cyc.cycjava.cycl.backward_utilities;
import com.cyc.cycjava.cycl.kb_mapping;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Symbols;
import com.cyc.cycjava.cycl.control_vars;
import com.cyc.cycjava.cycl.unification_utilities;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Numbers;
import com.cyc.cycjava.cycl.kb_indexing;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.SubLThread;
import com.cyc.cycjava.cycl.arguments;
import com.cyc.cycjava.cycl.mt_vars;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLProcess;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow;
import com.cyc.cycjava.cycl.backward;
import com.cyc.cycjava.cycl.assertions_high;
import com.cyc.cycjava.cycl.function_terms;
import com.cyc.cycjava.cycl.cycl_utilities;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLList;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObject;
import com.cyc.tool.subl.jrtl.nativeCode.type.symbol.SubLSymbol;
import com.cyc.tool.subl.util.SubLFile;
import com.cyc.tool.subl.util.SubLTranslatedFile;

public final class removal_modules_natfunction extends SubLTranslatedFile
{
    public static final SubLFile me;
    public static final String myName = "com.cyc.cycjava.cycl.inference.modules.removal.removal_modules_natfunction";
    public static final String myFingerPrint = "da661788d83b6b031a40c6ebeb24cf332a18050fe919e3c4e8ed13b151baa6d3";
    @SubLTranslatedFile.SubL(source = "cycl/inference/modules/removal/removal-modules-natfunction.lisp", position = 571L)
    private static SubLSymbol $nat_arguments_equal_enabled$;
    @SubLTranslatedFile.SubL(source = "cycl/inference/modules/removal/removal-modules-natfunction.lisp", position = 1218L)
    private static SubLSymbol $default_nat_function_check_cost$;
    @SubLTranslatedFile.SubL(source = "cycl/inference/modules/removal/removal-modules-natfunction.lisp", position = 2775L)
    private static SubLSymbol $nat_function_code_rule$;
    @SubLTranslatedFile.SubL(source = "cycl/inference/modules/removal/removal-modules-natfunction.lisp", position = 6800L)
    private static SubLSymbol $default_nat_argument_check_cost$;
    @SubLTranslatedFile.SubL(source = "cycl/inference/modules/removal/removal-modules-natfunction.lisp", position = 8364L)
    private static SubLSymbol $nat_argument_code_rule$;
    @SubLTranslatedFile.SubL(source = "cycl/inference/modules/removal/removal-modules-natfunction.lisp", position = 16746L)
    private static SubLSymbol $nat_arguments_equal_code_rule$;
    @SubLTranslatedFile.SubL(source = "cycl/inference/modules/removal/removal-modules-natfunction.lisp", position = 23496L)
    public static SubLSymbol $nart_id_defining_mt$;
    @SubLTranslatedFile.SubL(source = "cycl/inference/modules/removal/removal-modules-natfunction.lisp", position = 23958L)
    private static SubLSymbol $nart_id_check_default_cost$;
    @SubLTranslatedFile.SubL(source = "cycl/inference/modules/removal/removal-modules-natfunction.lisp", position = 25725L)
    private static SubLSymbol $nart_id_unify_default_cost$;
    private static final SubLObject $const0$natFunction;
    private static final SubLSymbol $kw1$POS;
    private static final SubLSymbol $kw2$NAT_FUNCTION_LOOKUP_POS;
    private static final SubLList $list3;
    private static final SubLSymbol $kw4$REMOVAL_NAT_FUNCTION_CHECK_POS;
    private static final SubLList $list5;
    private static final SubLList $list6;
    private static final SubLSymbol $kw7$CODE;
    private static final SubLSymbol $kw8$TRUE_MON;
    private static final SubLObject $const9$termOfUnit;
    private static final SubLSymbol $kw10$REMOVAL_NAT_FUNCTION_UNIFY;
    private static final SubLList $list11;
    private static final SubLSymbol $sym12$REMOVAL_NAT_FUNCTION_LOOKUP_INTERNAL;
    private static final SubLSymbol $kw13$REMOVAL_NAT_FUNCTION_LOOKUP;
    private static final SubLList $list14;
    private static final SubLObject $const15$natArgument;
    private static final SubLSymbol $kw16$NAT_ARGUMENT_LOOKUP_POS;
    private static final SubLList $list17;
    private static final SubLSymbol $kw18$REMOVAL_NAT_ARGUMENT_CHECK_POS;
    private static final SubLList $list19;
    private static final SubLList $list20;
    private static final SubLSymbol $kw21$REMOVAL_NAT_ARGUMENT_TERM_UNIFY;
    private static final SubLList $list22;
    private static final SubLSymbol $kw23$IGNORE;
    private static final SubLSymbol $kw24$REMOVAL_NAT_ARGUMENT_ARG_UNIFY;
    private static final SubLList $list25;
    private static final SubLSymbol $sym26$REMOVAL_NAT_ARGUMENT_LOOKUP_INTERNAL;
    private static final SubLSymbol $kw27$REMOVAL_NAT_ARGUMENT_LOOKUP;
    private static final SubLList $list28;
    private static final SubLObject $const29$natArgumentsEqual;
    private static final SubLSymbol $kw30$REMOVAL_NAT_ARGUMENTS_EQUAL_CHECK_POS;
    private static final SubLList $list31;
    private static final SubLList $list32;
    private static final SubLList $list33;
    private static final SubLSymbol $sym34$_;
    private static final SubLSymbol $sym35$REMOVAL_NAT_FUNC_ASENTS_WITH_NOT_FULLY_BOUND_ARG1_DICT;
    private static final SubLList $list36;
    private static final SubLSymbol $sym37$REMOVAL_NAT_FUNCTION_CONTEXTUALIZED_ASENT_P;
    private static final SubLList $list38;
    private static final SubLObject $const39$ReifiableFunction;
    private static final SubLSymbol $sym40$REMOVAL_NAT_ARGUMENT_CONTEXTUALIZED_ASENT_P;
    private static final SubLList $list41;
    private static final SubLList $list42;
    private static final SubLObject $const43$nartID;
    private static final SubLSymbol $kw44$NEG;
    private static final SubLSymbol $sym45$_NART_ID_DEFINING_MT_;
    private static final SubLObject $const46$BaseKB;
    private static final SubLSymbol $kw47$OPAQUE;
    private static final SubLSymbol $kw48$REMOVAL_NART_ID_CHECK_POS;
    private static final SubLList $list49;
    private static final SubLSymbol $kw50$REMOVAL_NART_ID_CHECK_NEG;
    private static final SubLList $list51;
    private static final SubLSymbol $kw52$REMOVAL_NART_ID_UNIFY;
    private static final SubLList $list53;
    private static final SubLSymbol $kw54$REMOVAL_NART_ID_LOOKUP;
    private static final SubLList $list55;
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/modules/removal/removal-modules-natfunction.lisp", position = 1473L)
    public static SubLObject removal_nat_function_check_pos_cost(final SubLObject asent, SubLObject sense) {
        if (sense == removal_modules_natfunction.UNPROVIDED) {
            sense = (SubLObject)removal_modules_natfunction.NIL;
        }
        final SubLObject nat = cycl_utilities.atomic_sentence_arg1(asent, (SubLObject)removal_modules_natfunction.UNPROVIDED);
        final SubLObject function = cycl_utilities.atomic_sentence_arg2(asent, (SubLObject)removal_modules_natfunction.UNPROVIDED);
        if (function.equal(cycl_utilities.nat_functor(nat))) {
            return removal_modules_natfunction.$default_nat_function_check_cost$.getGlobalValue();
        }
        return (SubLObject)removal_modules_natfunction.ZERO_INTEGER;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/modules/removal/removal-modules-natfunction.lisp", position = 1758L)
    public static SubLObject removal_nat_function_check_pos_expand(final SubLObject asent, SubLObject sense) {
        if (sense == removal_modules_natfunction.UNPROVIDED) {
            sense = (SubLObject)removal_modules_natfunction.NIL;
        }
        final SubLObject nat = cycl_utilities.atomic_sentence_arg1(asent, (SubLObject)removal_modules_natfunction.UNPROVIDED);
        final SubLObject function = cycl_utilities.atomic_sentence_arg2(asent, (SubLObject)removal_modules_natfunction.UNPROVIDED);
        final SubLObject assertion = function_terms.term_of_unit_assertion(nat);
        if (removal_modules_natfunction.NIL != assertion && function.equal(cycl_utilities.nat_functor(assertions_high.gaf_arg(assertion, (SubLObject)removal_modules_natfunction.TWO_INTEGER)))) {
            final SubLObject more_supports = additional_nat_function_supports();
            backward.removal_add_node(assertion, (SubLObject)removal_modules_natfunction.NIL, more_supports);
        }
        return (SubLObject)removal_modules_natfunction.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/modules/removal/removal-modules-natfunction.lisp", position = 2664L)
    public static SubLObject additional_nat_function_supports() {
        return (SubLObject)ConsesLow.list(nat_function_hl_support());
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/modules/removal/removal-modules-natfunction.lisp", position = 2924L)
    public static SubLObject nat_function_hl_support() {
        final SubLThread thread = SubLProcess.currentSubLThread();
        return arguments.make_hl_support((SubLObject)removal_modules_natfunction.$kw7$CODE, removal_modules_natfunction.$nat_function_code_rule$.getDynamicValue(thread), mt_vars.$tou_mt$.getGlobalValue(), (SubLObject)removal_modules_natfunction.$kw8$TRUE_MON);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/modules/removal/removal-modules-natfunction.lisp", position = 3045L)
    public static SubLObject removal_nat_function_unify_cost(final SubLObject asent, SubLObject sense) {
        if (sense == removal_modules_natfunction.UNPROVIDED) {
            sense = (SubLObject)removal_modules_natfunction.NIL;
        }
        final SubLObject nat = cycl_utilities.atomic_sentence_arg1(asent, (SubLObject)removal_modules_natfunction.UNPROVIDED);
        return Numbers.min((SubLObject)removal_modules_natfunction.ONE_INTEGER, kb_indexing.num_gaf_arg_index(nat, (SubLObject)removal_modules_natfunction.ONE_INTEGER, removal_modules_natfunction.$const9$termOfUnit, mt_vars.$tou_mt$.getGlobalValue()));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/modules/removal/removal-modules-natfunction.lisp", position = 3343L)
    public static SubLObject removal_nat_function_unify_expand(final SubLObject asent, SubLObject sense) {
        if (sense == removal_modules_natfunction.UNPROVIDED) {
            sense = (SubLObject)removal_modules_natfunction.NIL;
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject nat = cycl_utilities.atomic_sentence_arg1(asent, (SubLObject)removal_modules_natfunction.UNPROVIDED);
        final SubLObject arg2 = cycl_utilities.atomic_sentence_arg2(asent, (SubLObject)removal_modules_natfunction.UNPROVIDED);
        final SubLObject assertion = function_terms.term_of_unit_assertion(nat);
        if (removal_modules_natfunction.NIL != assertion) {
            thread.resetMultipleValues();
            final SubLObject v_bindings = unification_utilities.term_unify(arg2, cycl_utilities.nat_functor(assertions_high.gaf_arg(assertion, (SubLObject)removal_modules_natfunction.TWO_INTEGER)), (SubLObject)removal_modules_natfunction.T, (SubLObject)removal_modules_natfunction.T);
            final SubLObject unify_justification = thread.secondMultipleValue();
            thread.resetMultipleValues();
            if (removal_modules_natfunction.NIL != v_bindings) {
                final SubLObject more_supports = ConsesLow.append(additional_nat_function_supports(), unify_justification);
                backward.removal_add_node(assertion, v_bindings, more_supports);
            }
        }
        return (SubLObject)removal_modules_natfunction.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/modules/removal/removal-modules-natfunction.lisp", position = 4350L)
    public static SubLObject removal_nat_function_lookup_cost(final SubLObject asent, SubLObject sense) {
        if (sense == removal_modules_natfunction.UNPROVIDED) {
            sense = (SubLObject)removal_modules_natfunction.NIL;
        }
        final SubLObject function = cycl_utilities.atomic_sentence_arg2(asent, (SubLObject)removal_modules_natfunction.UNPROVIDED);
        return kb_indexing.num_function_extent_index(function);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/modules/removal/removal-modules-natfunction.lisp", position = 4637L)
    public static SubLObject removal_nat_function_lookup_expand(final SubLObject asent, SubLObject sense) {
        if (sense == removal_modules_natfunction.UNPROVIDED) {
            sense = (SubLObject)removal_modules_natfunction.NIL;
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject function = cycl_utilities.atomic_sentence_arg2(asent, (SubLObject)removal_modules_natfunction.UNPROVIDED);
        final SubLObject _prev_bind_0 = control_vars.$inference_literal$.currentBinding(thread);
        try {
            control_vars.$inference_literal$.bind(asent, thread);
            kb_mapping.map_function_extent_index(Symbols.symbol_function((SubLObject)removal_modules_natfunction.$sym12$REMOVAL_NAT_FUNCTION_LOOKUP_INTERNAL), function);
        }
        finally {
            control_vars.$inference_literal$.rebind(_prev_bind_0, thread);
        }
        return (SubLObject)removal_modules_natfunction.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/modules/removal/removal-modules-natfunction.lisp", position = 5393L)
    public static SubLObject removal_nat_function_lookup_internal(final SubLObject assertion) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        if (removal_modules_natfunction.NIL != backward_utilities.direction_is_relevant(assertion)) {
            final SubLObject asent = control_vars.$inference_literal$.getDynamicValue(thread);
            final SubLObject atomic_sentence_arg1 = cycl_utilities.atomic_sentence_arg1(asent, (SubLObject)removal_modules_natfunction.UNPROVIDED);
            final SubLObject nat = assertions_high.gaf_arg1(assertion);
            thread.resetMultipleValues();
            final SubLObject v_bindings = unification_utilities.term_unify(atomic_sentence_arg1, nat, (SubLObject)removal_modules_natfunction.T, (SubLObject)removal_modules_natfunction.T);
            final SubLObject unify_justification = thread.secondMultipleValue();
            thread.resetMultipleValues();
            if (removal_modules_natfunction.NIL != v_bindings) {
                final SubLObject more_supports = ConsesLow.append(additional_nat_function_supports(), unify_justification);
                backward.removal_add_node(assertion, v_bindings, more_supports);
            }
        }
        return (SubLObject)removal_modules_natfunction.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/modules/removal/removal-modules-natfunction.lisp", position = 6471L)
    public static SubLObject removal_nat_argument_check_pos_required(final SubLObject asent, SubLObject sense) {
        if (sense == removal_modules_natfunction.UNPROVIDED) {
            sense = (SubLObject)removal_modules_natfunction.NIL;
        }
        return subl_promotions.non_negative_integer_p(cycl_utilities.atomic_sentence_arg2(asent, (SubLObject)removal_modules_natfunction.UNPROVIDED));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/modules/removal/removal-modules-natfunction.lisp", position = 6887L)
    public static SubLObject removal_nat_argument_check_pos_cost(final SubLObject asent, SubLObject sense) {
        if (sense == removal_modules_natfunction.UNPROVIDED) {
            sense = (SubLObject)removal_modules_natfunction.NIL;
        }
        final SubLObject nat = cycl_utilities.atomic_sentence_arg1(asent, (SubLObject)removal_modules_natfunction.UNPROVIDED);
        final SubLObject num = cycl_utilities.atomic_sentence_arg2(asent, (SubLObject)removal_modules_natfunction.UNPROVIDED);
        final SubLObject v_term = cycl_utilities.atomic_sentence_arg3(asent, (SubLObject)removal_modules_natfunction.UNPROVIDED);
        if (v_term.equal(cycl_utilities.nat_arg(nat, num, (SubLObject)removal_modules_natfunction.UNPROVIDED))) {
            return removal_modules_natfunction.$default_nat_argument_check_cost$.getGlobalValue();
        }
        return (SubLObject)removal_modules_natfunction.ZERO_INTEGER;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/modules/removal/removal-modules-natfunction.lisp", position = 7224L)
    public static SubLObject removal_nat_argument_check_pos_expand(final SubLObject asent, SubLObject sense) {
        if (sense == removal_modules_natfunction.UNPROVIDED) {
            sense = (SubLObject)removal_modules_natfunction.NIL;
        }
        final SubLObject nat = cycl_utilities.atomic_sentence_arg1(asent, (SubLObject)removal_modules_natfunction.UNPROVIDED);
        final SubLObject num = cycl_utilities.atomic_sentence_arg2(asent, (SubLObject)removal_modules_natfunction.UNPROVIDED);
        final SubLObject v_term = cycl_utilities.atomic_sentence_arg3(asent, (SubLObject)removal_modules_natfunction.UNPROVIDED);
        final SubLObject assertion = function_terms.term_of_unit_assertion(nat);
        if (removal_modules_natfunction.NIL != assertion && v_term.equal(cycl_utilities.nat_arg(assertions_high.gaf_arg(assertion, (SubLObject)removal_modules_natfunction.TWO_INTEGER), num, (SubLObject)removal_modules_natfunction.UNPROVIDED))) {
            final SubLObject more_supports = additional_nat_argument_supports();
            backward.removal_add_node(assertion, (SubLObject)removal_modules_natfunction.NIL, more_supports);
        }
        return (SubLObject)removal_modules_natfunction.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/modules/removal/removal-modules-natfunction.lisp", position = 8253L)
    public static SubLObject additional_nat_argument_supports() {
        return (SubLObject)ConsesLow.list(nat_argument_hl_support());
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/modules/removal/removal-modules-natfunction.lisp", position = 8569L)
    public static SubLObject nat_argument_hl_support() {
        final SubLThread thread = SubLProcess.currentSubLThread();
        return arguments.make_hl_support((SubLObject)removal_modules_natfunction.$kw7$CODE, removal_modules_natfunction.$nat_argument_code_rule$.getDynamicValue(thread), mt_vars.$tou_mt$.getGlobalValue(), (SubLObject)removal_modules_natfunction.$kw8$TRUE_MON);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/modules/removal/removal-modules-natfunction.lisp", position = 8690L)
    public static SubLObject removal_nat_argument_term_unify_required(final SubLObject asent, SubLObject sense) {
        if (sense == removal_modules_natfunction.UNPROVIDED) {
            sense = (SubLObject)removal_modules_natfunction.NIL;
        }
        return subl_promotions.non_negative_integer_p(cycl_utilities.atomic_sentence_arg2(asent, (SubLObject)removal_modules_natfunction.UNPROVIDED));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/modules/removal/removal-modules-natfunction.lisp", position = 8961L)
    public static SubLObject removal_nat_argument_term_unify_cost(final SubLObject asent, SubLObject sense) {
        if (sense == removal_modules_natfunction.UNPROVIDED) {
            sense = (SubLObject)removal_modules_natfunction.NIL;
        }
        final SubLObject nat = cycl_utilities.atomic_sentence_arg1(asent, (SubLObject)removal_modules_natfunction.UNPROVIDED);
        return Numbers.min((SubLObject)removal_modules_natfunction.ONE_INTEGER, kb_indexing.num_gaf_arg_index(nat, (SubLObject)removal_modules_natfunction.ONE_INTEGER, removal_modules_natfunction.$const9$termOfUnit, mt_vars.$tou_mt$.getGlobalValue()));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/modules/removal/removal-modules-natfunction.lisp", position = 9169L)
    public static SubLObject removal_nat_argument_term_unify_expand(final SubLObject asent, SubLObject sense) {
        if (sense == removal_modules_natfunction.UNPROVIDED) {
            sense = (SubLObject)removal_modules_natfunction.NIL;
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject nat = cycl_utilities.atomic_sentence_arg1(asent, (SubLObject)removal_modules_natfunction.UNPROVIDED);
        final SubLObject num = cycl_utilities.atomic_sentence_arg2(asent, (SubLObject)removal_modules_natfunction.UNPROVIDED);
        final SubLObject arg3 = cycl_utilities.atomic_sentence_arg3(asent, (SubLObject)removal_modules_natfunction.UNPROVIDED);
        final SubLObject assertion = function_terms.term_of_unit_assertion(nat);
        if (removal_modules_natfunction.NIL != assertion) {
            thread.resetMultipleValues();
            final SubLObject v_bindings = unification_utilities.term_unify(arg3, cycl_utilities.nat_arg(assertions_high.gaf_arg(assertion, (SubLObject)removal_modules_natfunction.TWO_INTEGER), num, (SubLObject)removal_modules_natfunction.UNPROVIDED), (SubLObject)removal_modules_natfunction.T, (SubLObject)removal_modules_natfunction.T);
            final SubLObject unify_justification = thread.secondMultipleValue();
            thread.resetMultipleValues();
            if (removal_modules_natfunction.NIL != v_bindings) {
                final SubLObject more_supports = ConsesLow.append(additional_nat_argument_supports(), unify_justification);
                backward.removal_add_node(assertion, v_bindings, more_supports);
            }
        }
        return (SubLObject)removal_modules_natfunction.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/modules/removal/removal-modules-natfunction.lisp", position = 10339L)
    public static SubLObject removal_nat_argument_arg_unify_cost(final SubLObject asent, SubLObject sense) {
        if (sense == removal_modules_natfunction.UNPROVIDED) {
            sense = (SubLObject)removal_modules_natfunction.NIL;
        }
        final SubLObject nat = cycl_utilities.atomic_sentence_arg1(asent, (SubLObject)removal_modules_natfunction.UNPROVIDED);
        final SubLObject tou_gafs = Numbers.min((SubLObject)removal_modules_natfunction.ONE_INTEGER, kb_indexing.num_gaf_arg_index(nat, (SubLObject)removal_modules_natfunction.ONE_INTEGER, removal_modules_natfunction.$const9$termOfUnit, mt_vars.$tou_mt$.getGlobalValue()));
        final SubLObject nat_arity = cycl_utilities.nat_arity(nat, (SubLObject)removal_modules_natfunction.UNPROVIDED);
        return Numbers.multiply(tou_gafs, Numbers.add(nat_arity, (SubLObject)removal_modules_natfunction.ONE_INTEGER));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/modules/removal/removal-modules-natfunction.lisp", position = 10734L)
    public static SubLObject removal_nat_argument_arg_unify_expand(final SubLObject asent, SubLObject sense) {
        if (sense == removal_modules_natfunction.UNPROVIDED) {
            sense = (SubLObject)removal_modules_natfunction.NIL;
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject nat = cycl_utilities.atomic_sentence_arg1(asent, (SubLObject)removal_modules_natfunction.UNPROVIDED);
        final SubLObject assertion = function_terms.term_of_unit_assertion(nat);
        if (removal_modules_natfunction.NIL != assertion) {
            final SubLObject terms = cycl_utilities.formula_terms(nat, (SubLObject)removal_modules_natfunction.$kw23$IGNORE);
            SubLObject list_var = (SubLObject)removal_modules_natfunction.NIL;
            SubLObject v_term = (SubLObject)removal_modules_natfunction.NIL;
            SubLObject argnum = (SubLObject)removal_modules_natfunction.NIL;
            list_var = terms;
            v_term = list_var.first();
            for (argnum = (SubLObject)removal_modules_natfunction.ZERO_INTEGER; removal_modules_natfunction.NIL != list_var; list_var = list_var.rest(), v_term = list_var.first(), argnum = number_utilities.f_1X(argnum)) {
                final SubLObject candidate_asent = el_utilities.make_ternary_formula(removal_modules_natfunction.$const15$natArgument, nat, argnum, v_term);
                thread.resetMultipleValues();
                final SubLObject v_bindings = unification_utilities.term_unify(candidate_asent, asent, (SubLObject)removal_modules_natfunction.T, (SubLObject)removal_modules_natfunction.T);
                final SubLObject unify_justification = thread.secondMultipleValue();
                thread.resetMultipleValues();
                if (removal_modules_natfunction.NIL != v_bindings) {
                    final SubLObject more_supports = ConsesLow.append(additional_nat_argument_supports(), unify_justification);
                    backward.removal_add_node(assertion, v_bindings, more_supports);
                }
            }
        }
        return (SubLObject)removal_modules_natfunction.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/modules/removal/removal-modules-natfunction.lisp", position = 11903L)
    public static SubLObject removal_nat_argument_lookup_cost(final SubLObject asent, SubLObject sense) {
        if (sense == removal_modules_natfunction.UNPROVIDED) {
            sense = (SubLObject)removal_modules_natfunction.NIL;
        }
        final SubLObject fort = cycl_utilities.atomic_sentence_arg3(asent, (SubLObject)removal_modules_natfunction.UNPROVIDED);
        final SubLObject argnum = cycl_utilities.atomic_sentence_arg2(asent, (SubLObject)removal_modules_natfunction.UNPROVIDED);
        final SubLObject functionP = fort_types_interface.functionP(fort);
        if (removal_modules_natfunction.NIL != variables.variable_p(argnum)) {
            if (removal_modules_natfunction.NIL != functionP) {
                return Numbers.add(kb_indexing.num_nart_arg_index(fort, (SubLObject)removal_modules_natfunction.UNPROVIDED, (SubLObject)removal_modules_natfunction.UNPROVIDED), kb_indexing.num_function_extent_index(fort));
            }
            return kb_indexing.num_nart_arg_index(fort, (SubLObject)removal_modules_natfunction.UNPROVIDED, (SubLObject)removal_modules_natfunction.UNPROVIDED);
        }
        else {
            if (!argnum.isZero()) {
                return kb_indexing.num_nart_arg_index(fort, argnum, (SubLObject)removal_modules_natfunction.UNPROVIDED);
            }
            if (removal_modules_natfunction.NIL != functionP) {
                return kb_indexing.num_nart_arg_index(fort, (SubLObject)removal_modules_natfunction.UNPROVIDED, (SubLObject)removal_modules_natfunction.UNPROVIDED);
            }
            return (SubLObject)removal_modules_natfunction.ZERO_INTEGER;
        }
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/modules/removal/removal-modules-natfunction.lisp", position = 12557L)
    public static SubLObject removal_nat_argument_lookup_expand(final SubLObject asent, SubLObject sense) {
        if (sense == removal_modules_natfunction.UNPROVIDED) {
            sense = (SubLObject)removal_modules_natfunction.NIL;
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject fort = cycl_utilities.atomic_sentence_arg3(asent, (SubLObject)removal_modules_natfunction.UNPROVIDED);
        final SubLObject argnum = cycl_utilities.atomic_sentence_arg2(asent, (SubLObject)removal_modules_natfunction.UNPROVIDED);
        final SubLObject functionP = fort_types_interface.functionP(fort);
        final SubLObject _prev_bind_0 = control_vars.$inference_literal$.currentBinding(thread);
        try {
            control_vars.$inference_literal$.bind(asent, thread);
            if (removal_modules_natfunction.NIL != functionP && (removal_modules_natfunction.NIL != variables.variable_p(argnum) || argnum.isZero())) {
                kb_mapping.map_function_extent_index(Symbols.symbol_function((SubLObject)removal_modules_natfunction.$sym26$REMOVAL_NAT_ARGUMENT_LOOKUP_INTERNAL), fort);
            }
            if (removal_modules_natfunction.NIL != variables.variable_p(argnum)) {
                kb_mapping.map_nart_arg_index(Symbols.symbol_function((SubLObject)removal_modules_natfunction.$sym26$REMOVAL_NAT_ARGUMENT_LOOKUP_INTERNAL), fort, (SubLObject)removal_modules_natfunction.UNPROVIDED, (SubLObject)removal_modules_natfunction.UNPROVIDED);
            }
            else if (argnum.isPositive()) {
                kb_mapping.map_nart_arg_index(Symbols.symbol_function((SubLObject)removal_modules_natfunction.$sym26$REMOVAL_NAT_ARGUMENT_LOOKUP_INTERNAL), fort, argnum, (SubLObject)removal_modules_natfunction.UNPROVIDED);
            }
        }
        finally {
            control_vars.$inference_literal$.rebind(_prev_bind_0, thread);
        }
        return (SubLObject)removal_modules_natfunction.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/modules/removal/removal-modules-natfunction.lisp", position = 13740L)
    public static SubLObject removal_nat_argument_lookup_internal(final SubLObject assertion) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        if (removal_modules_natfunction.NIL != backward_utilities.direction_is_relevant(assertion)) {
            final SubLObject nat = assertions_high.gaf_arg1(assertion);
            final SubLObject asent = control_vars.$inference_literal$.getDynamicValue(thread);
            final SubLObject arg2 = cycl_utilities.atomic_sentence_arg2(asent, (SubLObject)removal_modules_natfunction.UNPROVIDED);
            final SubLObject terms = cycl_utilities.formula_terms(nat, (SubLObject)removal_modules_natfunction.$kw23$IGNORE);
            SubLObject list_var = (SubLObject)removal_modules_natfunction.NIL;
            SubLObject v_term = (SubLObject)removal_modules_natfunction.NIL;
            SubLObject argnum = (SubLObject)removal_modules_natfunction.NIL;
            list_var = terms;
            v_term = list_var.first();
            for (argnum = (SubLObject)removal_modules_natfunction.ZERO_INTEGER; removal_modules_natfunction.NIL != list_var; list_var = list_var.rest(), v_term = list_var.first(), argnum = number_utilities.f_1X(argnum)) {
                if (removal_modules_natfunction.NIL != variables.variable_p(arg2) || arg2.numE(argnum)) {}
                final SubLObject candidate_asent = el_utilities.make_ternary_formula(removal_modules_natfunction.$const15$natArgument, nat, argnum, v_term);
                thread.resetMultipleValues();
                final SubLObject v_bindings = unification_utilities.term_unify(candidate_asent, asent, (SubLObject)removal_modules_natfunction.T, (SubLObject)removal_modules_natfunction.T);
                final SubLObject unify_justification = thread.secondMultipleValue();
                thread.resetMultipleValues();
                if (removal_modules_natfunction.NIL != v_bindings) {
                    final SubLObject more_supports = ConsesLow.append(additional_nat_argument_supports(), unify_justification);
                    backward.removal_add_node(assertion, v_bindings, more_supports);
                }
            }
        }
        return (SubLObject)removal_modules_natfunction.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/modules/removal/removal-modules-natfunction.lisp", position = 14872L)
    public static SubLObject removal_nat_arguments_equal_check_pos_required(final SubLObject asent, SubLObject sense) {
        if (sense == removal_modules_natfunction.UNPROVIDED) {
            sense = (SubLObject)removal_modules_natfunction.NIL;
        }
        return removal_modules_natfunction.$nat_arguments_equal_enabled$.getGlobalValue();
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/modules/removal/removal-modules-natfunction.lisp", position = 15218L)
    public static SubLObject removal_nat_arguments_equal_check_pos_cost(final SubLObject asent, SubLObject sense) {
        if (sense == removal_modules_natfunction.UNPROVIDED) {
            sense = (SubLObject)removal_modules_natfunction.NIL;
        }
        return removal_nat_arguments_equal_check_cost(asent);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/modules/removal/removal-modules-natfunction.lisp", position = 15375L)
    public static SubLObject removal_nat_arguments_equal_check_pos_expand(final SubLObject asent, SubLObject sense) {
        if (sense == removal_modules_natfunction.UNPROVIDED) {
            sense = (SubLObject)removal_modules_natfunction.NIL;
        }
        final SubLObject nart_1 = cycl_utilities.atomic_sentence_arg1(asent, (SubLObject)removal_modules_natfunction.UNPROVIDED);
        final SubLObject nart_2 = cycl_utilities.atomic_sentence_arg2(asent, (SubLObject)removal_modules_natfunction.UNPROVIDED);
        final SubLObject tou_1 = function_terms.term_of_unit_assertion(nart_1);
        final SubLObject tou_2 = function_terms.term_of_unit_assertion(nart_2);
        if (removal_modules_natfunction.NIL != tou_1 && removal_modules_natfunction.NIL != tou_2 && cycl_utilities.nat_args(assertions_high.gaf_arg(tou_1, (SubLObject)removal_modules_natfunction.TWO_INTEGER), (SubLObject)removal_modules_natfunction.UNPROVIDED).equal(cycl_utilities.nat_args(assertions_high.gaf_arg(tou_2, (SubLObject)removal_modules_natfunction.TWO_INTEGER), (SubLObject)removal_modules_natfunction.UNPROVIDED))) {
            final SubLObject hl_support = nat_arguments_equal_hl_support();
            final SubLObject more_supports = (SubLObject)ConsesLow.list(tou_1, tou_2);
            backward.removal_add_node(hl_support, (SubLObject)removal_modules_natfunction.NIL, more_supports);
        }
        return (SubLObject)removal_modules_natfunction.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/modules/removal/removal-modules-natfunction.lisp", position = 16495L)
    public static SubLObject removal_nat_arguments_equal_check_cost(final SubLObject asent) {
        return Numbers.min((SubLObject)removal_modules_natfunction.ONE_INTEGER, new SubLObject[] { kb_indexing.num_gaf_arg_index(cycl_utilities.atomic_sentence_arg1(asent, (SubLObject)removal_modules_natfunction.UNPROVIDED), (SubLObject)removal_modules_natfunction.ONE_INTEGER, removal_modules_natfunction.$const9$termOfUnit, mt_vars.$tou_mt$.getGlobalValue()), kb_indexing.num_gaf_arg_index(cycl_utilities.atomic_sentence_arg2(asent, (SubLObject)removal_modules_natfunction.UNPROVIDED), (SubLObject)removal_modules_natfunction.ONE_INTEGER, removal_modules_natfunction.$const9$termOfUnit, mt_vars.$tou_mt$.getGlobalValue()) });
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/modules/removal/removal-modules-natfunction.lisp", position = 17079L)
    public static SubLObject nat_arguments_equal_hl_support() {
        final SubLThread thread = SubLProcess.currentSubLThread();
        return arguments.make_hl_support((SubLObject)removal_modules_natfunction.$kw7$CODE, removal_modules_natfunction.$nat_arguments_equal_code_rule$.getDynamicValue(thread), mt_vars.$tou_mt$.getGlobalValue(), (SubLObject)removal_modules_natfunction.$kw8$TRUE_MON);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/modules/removal/removal-modules-natfunction.lisp", position = 17214L)
    public static SubLObject removal_nat_function_nat_argument_applicability(final SubLObject contextualized_dnf_clause) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject pos_lits = clauses.pos_lits(contextualized_dnf_clause);
        final SubLObject func_pos_dict = removal_nat_func_asents_with_not_fully_bound_arg1_dict(pos_lits);
        SubLObject clause_numbers = (SubLObject)removal_modules_natfunction.NIL;
        SubLObject list_var = (SubLObject)removal_modules_natfunction.NIL;
        SubLObject pos_lit = (SubLObject)removal_modules_natfunction.NIL;
        SubLObject clause_number = (SubLObject)removal_modules_natfunction.NIL;
        list_var = pos_lits;
        pos_lit = list_var.first();
        for (clause_number = (SubLObject)removal_modules_natfunction.ZERO_INTEGER; removal_modules_natfunction.NIL != list_var; list_var = list_var.rest(), pos_lit = list_var.first(), clause_number = Numbers.add((SubLObject)removal_modules_natfunction.ONE_INTEGER, clause_number)) {
            if (removal_modules_natfunction.NIL != removal_nat_argument_contextualized_asent_p(pos_lit)) {
                SubLObject current;
                final SubLObject datum = current = pos_lit;
                SubLObject mt = (SubLObject)removal_modules_natfunction.NIL;
                SubLObject nat_arg_asent = (SubLObject)removal_modules_natfunction.NIL;
                cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)removal_modules_natfunction.$list33);
                mt = current.first();
                current = current.rest();
                cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)removal_modules_natfunction.$list33);
                nat_arg_asent = current.first();
                current = current.rest();
                if (removal_modules_natfunction.NIL == current) {
                    final SubLObject arg1 = cycl_utilities.atomic_sentence_arg1(nat_arg_asent, (SubLObject)removal_modules_natfunction.UNPROVIDED);
                    final SubLObject arg2 = cycl_utilities.atomic_sentence_arg2(nat_arg_asent, (SubLObject)removal_modules_natfunction.UNPROVIDED);
                    final SubLObject arg3 = cycl_utilities.atomic_sentence_arg3(nat_arg_asent, (SubLObject)removal_modules_natfunction.UNPROVIDED);
                    final SubLObject arg1_var_clauses = dictionary.dictionary_lookup(func_pos_dict, arg1, (SubLObject)removal_modules_natfunction.UNPROVIDED);
                    if (removal_modules_natfunction.NIL != variables.fully_bound_p(arg2) && removal_modules_natfunction.NIL != variables.fully_bound_p(arg3) && removal_modules_natfunction.NIL != arg1_var_clauses) {
                        dictionary_utilities.dictionary_pushnew(func_pos_dict, arg1, clause_number, Symbols.symbol_function((SubLObject)removal_modules_natfunction.$sym34$_), (SubLObject)removal_modules_natfunction.UNPROVIDED);
                    }
                }
                else {
                    cdestructuring_bind.cdestructuring_bind_error(datum, (SubLObject)removal_modules_natfunction.$list33);
                }
            }
        }
        SubLObject iteration_state;
        for (iteration_state = dictionary_contents.do_dictionary_contents_state(dictionary.dictionary_contents(func_pos_dict)); removal_modules_natfunction.NIL == dictionary_contents.do_dictionary_contents_doneP(iteration_state); iteration_state = dictionary_contents.do_dictionary_contents_next(iteration_state)) {
            thread.resetMultipleValues();
            final SubLObject arg4 = dictionary_contents.do_dictionary_contents_key_value(iteration_state);
            final SubLObject clause_nums = thread.secondMultipleValue();
            thread.resetMultipleValues();
            if (removal_modules_natfunction.NIL != list_utilities.lengthG(clause_nums, (SubLObject)removal_modules_natfunction.ONE_INTEGER, (SubLObject)removal_modules_natfunction.UNPROVIDED)) {
                clause_numbers = (SubLObject)ConsesLow.cons((SubLObject)ConsesLow.list((SubLObject)removal_modules_natfunction.NIL, clause_nums), clause_numbers);
            }
        }
        dictionary_contents.do_dictionary_contents_finalize(iteration_state);
        return clause_numbers;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/modules/removal/removal-modules-natfunction.lisp", position = 19292L)
    public static SubLObject removal_nat_func_asents_with_not_fully_bound_arg1_dict_internal(final SubLObject pos_lits) {
        final SubLObject func_pos_dict = dictionary.new_dictionary((SubLObject)removal_modules_natfunction.UNPROVIDED, (SubLObject)removal_modules_natfunction.UNPROVIDED);
        SubLObject list_var = (SubLObject)removal_modules_natfunction.NIL;
        SubLObject pos_lit = (SubLObject)removal_modules_natfunction.NIL;
        SubLObject clause_number = (SubLObject)removal_modules_natfunction.NIL;
        list_var = pos_lits;
        pos_lit = list_var.first();
        for (clause_number = (SubLObject)removal_modules_natfunction.ZERO_INTEGER; removal_modules_natfunction.NIL != list_var; list_var = list_var.rest(), pos_lit = list_var.first(), clause_number = Numbers.add((SubLObject)removal_modules_natfunction.ONE_INTEGER, clause_number)) {
            if (removal_modules_natfunction.NIL != removal_nat_function_contextualized_asent_p(pos_lit)) {
                SubLObject current;
                final SubLObject datum = current = pos_lit;
                SubLObject mt = (SubLObject)removal_modules_natfunction.NIL;
                SubLObject nat_fun_asent = (SubLObject)removal_modules_natfunction.NIL;
                cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)removal_modules_natfunction.$list36);
                mt = current.first();
                current = current.rest();
                cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)removal_modules_natfunction.$list36);
                nat_fun_asent = current.first();
                current = current.rest();
                if (removal_modules_natfunction.NIL == current) {
                    final SubLObject arg1 = cycl_utilities.atomic_sentence_arg1(nat_fun_asent, (SubLObject)removal_modules_natfunction.UNPROVIDED);
                    final SubLObject arg2 = cycl_utilities.atomic_sentence_arg2(nat_fun_asent, (SubLObject)removal_modules_natfunction.UNPROVIDED);
                    if (removal_modules_natfunction.NIL != variables.not_fully_bound_p(arg1) && removal_modules_natfunction.NIL != variables.fully_bound_p(arg2)) {
                        dictionary_utilities.dictionary_pushnew(func_pos_dict, arg1, clause_number, Symbols.symbol_function((SubLObject)removal_modules_natfunction.$sym34$_), (SubLObject)removal_modules_natfunction.UNPROVIDED);
                    }
                }
                else {
                    cdestructuring_bind.cdestructuring_bind_error(datum, (SubLObject)removal_modules_natfunction.$list36);
                }
            }
        }
        return func_pos_dict;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/modules/removal/removal-modules-natfunction.lisp", position = 19292L)
    public static SubLObject removal_nat_func_asents_with_not_fully_bound_arg1_dict(final SubLObject pos_lits) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject v_memoization_state = memoization_state.$memoization_state$.getDynamicValue(thread);
        SubLObject caching_state = (SubLObject)removal_modules_natfunction.NIL;
        if (removal_modules_natfunction.NIL == v_memoization_state) {
            return removal_nat_func_asents_with_not_fully_bound_arg1_dict_internal(pos_lits);
        }
        caching_state = memoization_state.memoization_state_lookup(v_memoization_state, (SubLObject)removal_modules_natfunction.$sym35$REMOVAL_NAT_FUNC_ASENTS_WITH_NOT_FULLY_BOUND_ARG1_DICT, (SubLObject)removal_modules_natfunction.UNPROVIDED);
        if (removal_modules_natfunction.NIL == caching_state) {
            caching_state = memoization_state.create_caching_state(memoization_state.memoization_state_lock(v_memoization_state), (SubLObject)removal_modules_natfunction.$sym35$REMOVAL_NAT_FUNC_ASENTS_WITH_NOT_FULLY_BOUND_ARG1_DICT, (SubLObject)removal_modules_natfunction.ONE_INTEGER, (SubLObject)removal_modules_natfunction.NIL, (SubLObject)removal_modules_natfunction.EQUAL, (SubLObject)removal_modules_natfunction.UNPROVIDED);
            memoization_state.memoization_state_put(v_memoization_state, (SubLObject)removal_modules_natfunction.$sym35$REMOVAL_NAT_FUNC_ASENTS_WITH_NOT_FULLY_BOUND_ARG1_DICT, caching_state);
        }
        SubLObject results = memoization_state.caching_state_lookup(caching_state, pos_lits, memoization_state.$memoized_item_not_found$.getGlobalValue());
        if (results.eql(memoization_state.$memoized_item_not_found$.getGlobalValue())) {
            results = Values.arg2(thread.resetMultipleValues(), (SubLObject)Values.multiple_value_list(removal_nat_func_asents_with_not_fully_bound_arg1_dict_internal(pos_lits)));
            memoization_state.caching_state_put(caching_state, pos_lits, results, (SubLObject)removal_modules_natfunction.UNPROVIDED);
        }
        return memoization_state.caching_results(results);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/modules/removal/removal-modules-natfunction.lisp", position = 19982L)
    public static SubLObject removal_nat_function_contextualized_asent_p_internal(final SubLObject contextualised_asent) {
        SubLObject mt = (SubLObject)removal_modules_natfunction.NIL;
        SubLObject asent = (SubLObject)removal_modules_natfunction.NIL;
        cdestructuring_bind.destructuring_bind_must_consp(contextualised_asent, contextualised_asent, (SubLObject)removal_modules_natfunction.$list38);
        mt = contextualised_asent.first();
        SubLObject current = contextualised_asent.rest();
        cdestructuring_bind.destructuring_bind_must_consp(current, contextualised_asent, (SubLObject)removal_modules_natfunction.$list38);
        asent = current.first();
        current = current.rest();
        if (removal_modules_natfunction.NIL == current) {
            return (SubLObject)SubLObjectFactory.makeBoolean(removal_modules_natfunction.NIL != el_utilities.el_formula_with_operator_p(asent, removal_modules_natfunction.$const0$natFunction) && removal_modules_natfunction.NIL != list_utilities.lengthE(asent, (SubLObject)removal_modules_natfunction.THREE_INTEGER, (SubLObject)removal_modules_natfunction.UNPROVIDED) && removal_modules_natfunction.NIL != isa.isaP(cycl_utilities.atomic_sentence_arg2(asent, (SubLObject)removal_modules_natfunction.UNPROVIDED), removal_modules_natfunction.$const39$ReifiableFunction, (SubLObject)removal_modules_natfunction.UNPROVIDED, (SubLObject)removal_modules_natfunction.UNPROVIDED));
        }
        cdestructuring_bind.cdestructuring_bind_error(contextualised_asent, (SubLObject)removal_modules_natfunction.$list38);
        return (SubLObject)removal_modules_natfunction.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/modules/removal/removal-modules-natfunction.lisp", position = 19982L)
    public static SubLObject removal_nat_function_contextualized_asent_p(final SubLObject contextualised_asent) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject v_memoization_state = memoization_state.$memoization_state$.getDynamicValue(thread);
        SubLObject caching_state = (SubLObject)removal_modules_natfunction.NIL;
        if (removal_modules_natfunction.NIL == v_memoization_state) {
            return removal_nat_function_contextualized_asent_p_internal(contextualised_asent);
        }
        caching_state = memoization_state.memoization_state_lookup(v_memoization_state, (SubLObject)removal_modules_natfunction.$sym37$REMOVAL_NAT_FUNCTION_CONTEXTUALIZED_ASENT_P, (SubLObject)removal_modules_natfunction.UNPROVIDED);
        if (removal_modules_natfunction.NIL == caching_state) {
            caching_state = memoization_state.create_caching_state(memoization_state.memoization_state_lock(v_memoization_state), (SubLObject)removal_modules_natfunction.$sym37$REMOVAL_NAT_FUNCTION_CONTEXTUALIZED_ASENT_P, (SubLObject)removal_modules_natfunction.ONE_INTEGER, (SubLObject)removal_modules_natfunction.NIL, (SubLObject)removal_modules_natfunction.EQUAL, (SubLObject)removal_modules_natfunction.UNPROVIDED);
            memoization_state.memoization_state_put(v_memoization_state, (SubLObject)removal_modules_natfunction.$sym37$REMOVAL_NAT_FUNCTION_CONTEXTUALIZED_ASENT_P, caching_state);
        }
        SubLObject results = memoization_state.caching_state_lookup(caching_state, contextualised_asent, memoization_state.$memoized_item_not_found$.getGlobalValue());
        if (results.eql(memoization_state.$memoized_item_not_found$.getGlobalValue())) {
            results = Values.arg2(thread.resetMultipleValues(), (SubLObject)Values.multiple_value_list(removal_nat_function_contextualized_asent_p_internal(contextualised_asent)));
            memoization_state.caching_state_put(caching_state, contextualised_asent, results, (SubLObject)removal_modules_natfunction.UNPROVIDED);
        }
        return memoization_state.caching_results(results);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/modules/removal/removal-modules-natfunction.lisp", position = 20425L)
    public static SubLObject removal_nat_argument_contextualized_asent_p_internal(final SubLObject contextualised_asent) {
        SubLObject mt = (SubLObject)removal_modules_natfunction.NIL;
        SubLObject asent = (SubLObject)removal_modules_natfunction.NIL;
        cdestructuring_bind.destructuring_bind_must_consp(contextualised_asent, contextualised_asent, (SubLObject)removal_modules_natfunction.$list38);
        mt = contextualised_asent.first();
        SubLObject current = contextualised_asent.rest();
        cdestructuring_bind.destructuring_bind_must_consp(current, contextualised_asent, (SubLObject)removal_modules_natfunction.$list38);
        asent = current.first();
        current = current.rest();
        if (removal_modules_natfunction.NIL == current) {
            return (SubLObject)SubLObjectFactory.makeBoolean(removal_modules_natfunction.NIL != el_utilities.el_formula_with_operator_p(asent, removal_modules_natfunction.$const15$natArgument) && removal_modules_natfunction.NIL != list_utilities.lengthE(asent, (SubLObject)removal_modules_natfunction.FOUR_INTEGER, (SubLObject)removal_modules_natfunction.UNPROVIDED));
        }
        cdestructuring_bind.cdestructuring_bind_error(contextualised_asent, (SubLObject)removal_modules_natfunction.$list38);
        return (SubLObject)removal_modules_natfunction.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/modules/removal/removal-modules-natfunction.lisp", position = 20425L)
    public static SubLObject removal_nat_argument_contextualized_asent_p(final SubLObject contextualised_asent) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject v_memoization_state = memoization_state.$memoization_state$.getDynamicValue(thread);
        SubLObject caching_state = (SubLObject)removal_modules_natfunction.NIL;
        if (removal_modules_natfunction.NIL == v_memoization_state) {
            return removal_nat_argument_contextualized_asent_p_internal(contextualised_asent);
        }
        caching_state = memoization_state.memoization_state_lookup(v_memoization_state, (SubLObject)removal_modules_natfunction.$sym40$REMOVAL_NAT_ARGUMENT_CONTEXTUALIZED_ASENT_P, (SubLObject)removal_modules_natfunction.UNPROVIDED);
        if (removal_modules_natfunction.NIL == caching_state) {
            caching_state = memoization_state.create_caching_state(memoization_state.memoization_state_lock(v_memoization_state), (SubLObject)removal_modules_natfunction.$sym40$REMOVAL_NAT_ARGUMENT_CONTEXTUALIZED_ASENT_P, (SubLObject)removal_modules_natfunction.ONE_INTEGER, (SubLObject)removal_modules_natfunction.NIL, (SubLObject)removal_modules_natfunction.EQUAL, (SubLObject)removal_modules_natfunction.UNPROVIDED);
            memoization_state.memoization_state_put(v_memoization_state, (SubLObject)removal_modules_natfunction.$sym40$REMOVAL_NAT_ARGUMENT_CONTEXTUALIZED_ASENT_P, caching_state);
        }
        SubLObject results = memoization_state.caching_state_lookup(caching_state, contextualised_asent, memoization_state.$memoized_item_not_found$.getGlobalValue());
        if (results.eql(memoization_state.$memoized_item_not_found$.getGlobalValue())) {
            results = Values.arg2(thread.resetMultipleValues(), (SubLObject)Values.multiple_value_list(removal_nat_argument_contextualized_asent_p_internal(contextualised_asent)));
            memoization_state.caching_state_put(caching_state, contextualised_asent, results, (SubLObject)removal_modules_natfunction.UNPROVIDED);
        }
        return memoization_state.caching_results(results);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/modules/removal/removal-modules-natfunction.lisp", position = 20744L)
    public static SubLObject removal_nat_function_nat_argument_cost(final SubLObject contextualized_dnf_clause) {
        return (SubLObject)removal_modules_natfunction.ONE_INTEGER;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/modules/removal/removal-modules-natfunction.lisp", position = 20887L)
    public static SubLObject removal_nat_function_nat_argument_expand(final SubLObject contextualized_dnf_clause) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject pos_lits = clauses.pos_lits(contextualized_dnf_clause);
        final SubLObject nat_fun_cont_asent = Sequences.find_if((SubLObject)removal_modules_natfunction.$sym37$REMOVAL_NAT_FUNCTION_CONTEXTUALIZED_ASENT_P, pos_lits, (SubLObject)removal_modules_natfunction.UNPROVIDED, (SubLObject)removal_modules_natfunction.UNPROVIDED, (SubLObject)removal_modules_natfunction.UNPROVIDED);
        final SubLObject nat_arg_cont_asents = list_utilities.find_all_if((SubLObject)removal_modules_natfunction.$sym40$REMOVAL_NAT_ARGUMENT_CONTEXTUALIZED_ASENT_P, pos_lits, (SubLObject)removal_modules_natfunction.UNPROVIDED);
        SubLObject nat_asents = (SubLObject)removal_modules_natfunction.NIL;
        SubLObject current;
        final SubLObject datum = current = nat_fun_cont_asent;
        SubLObject func_mt = (SubLObject)removal_modules_natfunction.NIL;
        SubLObject func_asent = (SubLObject)removal_modules_natfunction.NIL;
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)removal_modules_natfunction.$list41);
        func_mt = current.first();
        current = current.rest();
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)removal_modules_natfunction.$list41);
        func_asent = current.first();
        current = current.rest();
        if (removal_modules_natfunction.NIL == current) {
            final SubLObject unbound_nat = cycl_utilities.atomic_sentence_arg1(func_asent, (SubLObject)removal_modules_natfunction.UNPROVIDED);
            final SubLObject nat_functor = cycl_utilities.atomic_sentence_arg2(func_asent, (SubLObject)removal_modules_natfunction.UNPROVIDED);
            SubLObject argnum_to_arg_alist = (SubLObject)removal_modules_natfunction.NIL;
            nat_asents = (SubLObject)ConsesLow.cons(func_asent, nat_asents);
            SubLObject cdolist_list_var = nat_arg_cont_asents;
            SubLObject nat_arg_cont_asent = (SubLObject)removal_modules_natfunction.NIL;
            nat_arg_cont_asent = cdolist_list_var.first();
            while (removal_modules_natfunction.NIL != cdolist_list_var) {
                SubLObject current_$2;
                final SubLObject datum_$1 = current_$2 = nat_arg_cont_asent;
                SubLObject arg_mt = (SubLObject)removal_modules_natfunction.NIL;
                SubLObject arg_asent = (SubLObject)removal_modules_natfunction.NIL;
                cdestructuring_bind.destructuring_bind_must_consp(current_$2, datum_$1, (SubLObject)removal_modules_natfunction.$list42);
                arg_mt = current_$2.first();
                current_$2 = current_$2.rest();
                cdestructuring_bind.destructuring_bind_must_consp(current_$2, datum_$1, (SubLObject)removal_modules_natfunction.$list42);
                arg_asent = current_$2.first();
                current_$2 = current_$2.rest();
                if (removal_modules_natfunction.NIL == current_$2) {
                    nat_asents = (SubLObject)ConsesLow.cons(arg_asent, nat_asents);
                    final SubLObject nat_arg_num = cycl_utilities.atomic_sentence_arg2(arg_asent, (SubLObject)removal_modules_natfunction.UNPROVIDED);
                    final SubLObject nat_argument = cycl_utilities.atomic_sentence_arg3(arg_asent, (SubLObject)removal_modules_natfunction.UNPROVIDED);
                    argnum_to_arg_alist = list_utilities.alist_enter(argnum_to_arg_alist, nat_arg_num, nat_argument, (SubLObject)removal_modules_natfunction.UNPROVIDED);
                }
                else {
                    cdestructuring_bind.cdestructuring_bind_error(datum_$1, (SubLObject)removal_modules_natfunction.$list42);
                }
                cdolist_list_var = cdolist_list_var.rest();
                nat_arg_cont_asent = cdolist_list_var.first();
            }
            SubLObject bound_nat = (SubLObject)removal_modules_natfunction.NIL;
            SubLObject nat_args = (SubLObject)removal_modules_natfunction.NIL;
            SubLObject end_var;
            SubLObject argnum;
            for (end_var = (SubLObject)removal_modules_natfunction.ZERO_INTEGER, argnum = (SubLObject)removal_modules_natfunction.NIL, argnum = Sequences.length(argnum_to_arg_alist); !argnum.numLE(end_var); argnum = Numbers.add(argnum, (SubLObject)removal_modules_natfunction.MINUS_ONE_INTEGER)) {
                nat_args = (SubLObject)ConsesLow.cons(list_utilities.alist_lookup(argnum_to_arg_alist, argnum, (SubLObject)removal_modules_natfunction.UNPROVIDED, (SubLObject)removal_modules_natfunction.UNPROVIDED), nat_args);
            }
            bound_nat = (SubLObject)ConsesLow.cons(nat_functor, nat_args);
            thread.resetMultipleValues();
            final SubLObject v_bindings = unification_utilities.term_unify(unbound_nat, bound_nat, (SubLObject)removal_modules_natfunction.UNPROVIDED, (SubLObject)removal_modules_natfunction.UNPROVIDED);
            final SubLObject unify_justification = thread.secondMultipleValue();
            thread.resetMultipleValues();
            if (removal_modules_natfunction.NIL != v_bindings) {
                final SubLObject justifications = removal_nat_function_nat_argument_supports(bound_nat);
                if (removal_modules_natfunction.NIL != justifications) {
                    inference_worker_removal.conjunctive_removal_callback(v_bindings, justifications);
                }
            }
        }
        else {
            cdestructuring_bind.cdestructuring_bind_error(datum, (SubLObject)removal_modules_natfunction.$list41);
        }
        return (SubLObject)removal_modules_natfunction.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/modules/removal/removal-modules-natfunction.lisp", position = 22685L)
    public static SubLObject removal_nat_function_nat_argument_supports(final SubLObject bound_nat) {
        final SubLObject nart = narts_high.find_nart(bound_nat);
        if (removal_modules_natfunction.NIL != nart) {
            final SubLObject tou_support = removal_modules_termofunit.make_term_of_unit_support(nart, bound_nat);
            return (SubLObject)ConsesLow.list((SubLObject)ConsesLow.cons(tou_support, additional_nat_function_supports()), (SubLObject)ConsesLow.cons(tou_support, additional_nat_argument_supports()));
        }
        return (SubLObject)removal_modules_natfunction.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/modules/removal/removal-modules-natfunction.lisp", position = 23556L)
    public static SubLObject inference_nart_id_check(final SubLObject nart, final SubLObject id) {
        return Equality.eql(id, nart_handles.nart_id(nart));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/modules/removal/removal-modules-natfunction.lisp", position = 23640L)
    public static SubLObject make_nart_id_support(final SubLObject nart, final SubLObject id, SubLObject negateP) {
        if (negateP == removal_modules_natfunction.UNPROVIDED) {
            negateP = (SubLObject)removal_modules_natfunction.NIL;
        }
        final SubLObject support_formula = (SubLObject)ConsesLow.list(removal_modules_natfunction.$const43$nartID, nart, id);
        if (removal_modules_natfunction.NIL == negateP) {
            return arguments.make_hl_support((SubLObject)removal_modules_natfunction.$kw47$OPAQUE, support_formula, removal_modules_natfunction.$nart_id_defining_mt$.getGlobalValue(), (SubLObject)removal_modules_natfunction.$kw8$TRUE_MON);
        }
        return arguments.make_hl_support((SubLObject)removal_modules_natfunction.$kw47$OPAQUE, cycl_utilities.negate(support_formula), removal_modules_natfunction.$nart_id_defining_mt$.getGlobalValue(), (SubLObject)removal_modules_natfunction.$kw8$TRUE_MON);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/modules/removal/removal-modules-natfunction.lisp", position = 24175L)
    public static SubLObject removal_nart_id_check_pos_cost(final SubLObject asent, SubLObject sense) {
        if (sense == removal_modules_natfunction.UNPROVIDED) {
            sense = (SubLObject)removal_modules_natfunction.NIL;
        }
        return (SubLObject)((removal_modules_natfunction.NIL != removal_nart_id_check(asent)) ? removal_modules_natfunction.$nart_id_check_default_cost$.getGlobalValue() : removal_modules_natfunction.ZERO_INTEGER);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/modules/removal/removal-modules-natfunction.lisp", position = 24402L)
    public static SubLObject removal_nart_id_check_neg_cost(final SubLObject asent, SubLObject sense) {
        if (sense == removal_modules_natfunction.UNPROVIDED) {
            sense = (SubLObject)removal_modules_natfunction.NIL;
        }
        return removal_module_utilities.invert_removal_check_cost(removal_nart_id_check_pos_cost(asent, (SubLObject)removal_modules_natfunction.UNPROVIDED));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/modules/removal/removal-modules-natfunction.lisp", position = 24568L)
    public static SubLObject removal_nart_id_check(final SubLObject asent) {
        final SubLObject nart = cycl_utilities.atomic_sentence_arg1(asent, (SubLObject)removal_modules_natfunction.UNPROVIDED);
        final SubLObject id = cycl_utilities.atomic_sentence_arg2(asent, (SubLObject)removal_modules_natfunction.UNPROVIDED);
        return inference_nart_id_check(nart, id);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/modules/removal/removal-modules-natfunction.lisp", position = 26531L)
    public static SubLObject removal_nart_id_lookup_cost(final SubLObject asent, SubLObject sense) {
        if (sense == removal_modules_natfunction.UNPROVIDED) {
            sense = (SubLObject)removal_modules_natfunction.NIL;
        }
        final SubLObject id = cycl_utilities.atomic_sentence_arg2(asent, (SubLObject)removal_modules_natfunction.UNPROVIDED);
        return (SubLObject)((removal_modules_natfunction.NIL != nart_handles.find_nart_by_id(id)) ? removal_modules_natfunction.ONE_INTEGER : removal_modules_natfunction.ZERO_INTEGER);
    }
    
    public static SubLObject declare_removal_modules_natfunction_file() {
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.modules.removal.removal_modules_natfunction", "removal_nat_function_check_pos_cost", "REMOVAL-NAT-FUNCTION-CHECK-POS-COST", 1, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.modules.removal.removal_modules_natfunction", "removal_nat_function_check_pos_expand", "REMOVAL-NAT-FUNCTION-CHECK-POS-EXPAND", 1, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.modules.removal.removal_modules_natfunction", "additional_nat_function_supports", "ADDITIONAL-NAT-FUNCTION-SUPPORTS", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.modules.removal.removal_modules_natfunction", "nat_function_hl_support", "NAT-FUNCTION-HL-SUPPORT", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.modules.removal.removal_modules_natfunction", "removal_nat_function_unify_cost", "REMOVAL-NAT-FUNCTION-UNIFY-COST", 1, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.modules.removal.removal_modules_natfunction", "removal_nat_function_unify_expand", "REMOVAL-NAT-FUNCTION-UNIFY-EXPAND", 1, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.modules.removal.removal_modules_natfunction", "removal_nat_function_lookup_cost", "REMOVAL-NAT-FUNCTION-LOOKUP-COST", 1, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.modules.removal.removal_modules_natfunction", "removal_nat_function_lookup_expand", "REMOVAL-NAT-FUNCTION-LOOKUP-EXPAND", 1, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.modules.removal.removal_modules_natfunction", "removal_nat_function_lookup_internal", "REMOVAL-NAT-FUNCTION-LOOKUP-INTERNAL", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.modules.removal.removal_modules_natfunction", "removal_nat_argument_check_pos_required", "REMOVAL-NAT-ARGUMENT-CHECK-POS-REQUIRED", 1, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.modules.removal.removal_modules_natfunction", "removal_nat_argument_check_pos_cost", "REMOVAL-NAT-ARGUMENT-CHECK-POS-COST", 1, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.modules.removal.removal_modules_natfunction", "removal_nat_argument_check_pos_expand", "REMOVAL-NAT-ARGUMENT-CHECK-POS-EXPAND", 1, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.modules.removal.removal_modules_natfunction", "additional_nat_argument_supports", "ADDITIONAL-NAT-ARGUMENT-SUPPORTS", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.modules.removal.removal_modules_natfunction", "nat_argument_hl_support", "NAT-ARGUMENT-HL-SUPPORT", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.modules.removal.removal_modules_natfunction", "removal_nat_argument_term_unify_required", "REMOVAL-NAT-ARGUMENT-TERM-UNIFY-REQUIRED", 1, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.modules.removal.removal_modules_natfunction", "removal_nat_argument_term_unify_cost", "REMOVAL-NAT-ARGUMENT-TERM-UNIFY-COST", 1, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.modules.removal.removal_modules_natfunction", "removal_nat_argument_term_unify_expand", "REMOVAL-NAT-ARGUMENT-TERM-UNIFY-EXPAND", 1, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.modules.removal.removal_modules_natfunction", "removal_nat_argument_arg_unify_cost", "REMOVAL-NAT-ARGUMENT-ARG-UNIFY-COST", 1, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.modules.removal.removal_modules_natfunction", "removal_nat_argument_arg_unify_expand", "REMOVAL-NAT-ARGUMENT-ARG-UNIFY-EXPAND", 1, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.modules.removal.removal_modules_natfunction", "removal_nat_argument_lookup_cost", "REMOVAL-NAT-ARGUMENT-LOOKUP-COST", 1, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.modules.removal.removal_modules_natfunction", "removal_nat_argument_lookup_expand", "REMOVAL-NAT-ARGUMENT-LOOKUP-EXPAND", 1, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.modules.removal.removal_modules_natfunction", "removal_nat_argument_lookup_internal", "REMOVAL-NAT-ARGUMENT-LOOKUP-INTERNAL", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.modules.removal.removal_modules_natfunction", "removal_nat_arguments_equal_check_pos_required", "REMOVAL-NAT-ARGUMENTS-EQUAL-CHECK-POS-REQUIRED", 1, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.modules.removal.removal_modules_natfunction", "removal_nat_arguments_equal_check_pos_cost", "REMOVAL-NAT-ARGUMENTS-EQUAL-CHECK-POS-COST", 1, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.modules.removal.removal_modules_natfunction", "removal_nat_arguments_equal_check_pos_expand", "REMOVAL-NAT-ARGUMENTS-EQUAL-CHECK-POS-EXPAND", 1, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.modules.removal.removal_modules_natfunction", "removal_nat_arguments_equal_check_cost", "REMOVAL-NAT-ARGUMENTS-EQUAL-CHECK-COST", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.modules.removal.removal_modules_natfunction", "nat_arguments_equal_hl_support", "NAT-ARGUMENTS-EQUAL-HL-SUPPORT", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.modules.removal.removal_modules_natfunction", "removal_nat_function_nat_argument_applicability", "REMOVAL-NAT-FUNCTION-NAT-ARGUMENT-APPLICABILITY", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.modules.removal.removal_modules_natfunction", "removal_nat_func_asents_with_not_fully_bound_arg1_dict_internal", "REMOVAL-NAT-FUNC-ASENTS-WITH-NOT-FULLY-BOUND-ARG1-DICT-INTERNAL", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.modules.removal.removal_modules_natfunction", "removal_nat_func_asents_with_not_fully_bound_arg1_dict", "REMOVAL-NAT-FUNC-ASENTS-WITH-NOT-FULLY-BOUND-ARG1-DICT", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.modules.removal.removal_modules_natfunction", "removal_nat_function_contextualized_asent_p_internal", "REMOVAL-NAT-FUNCTION-CONTEXTUALIZED-ASENT-P-INTERNAL", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.modules.removal.removal_modules_natfunction", "removal_nat_function_contextualized_asent_p", "REMOVAL-NAT-FUNCTION-CONTEXTUALIZED-ASENT-P", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.modules.removal.removal_modules_natfunction", "removal_nat_argument_contextualized_asent_p_internal", "REMOVAL-NAT-ARGUMENT-CONTEXTUALIZED-ASENT-P-INTERNAL", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.modules.removal.removal_modules_natfunction", "removal_nat_argument_contextualized_asent_p", "REMOVAL-NAT-ARGUMENT-CONTEXTUALIZED-ASENT-P", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.modules.removal.removal_modules_natfunction", "removal_nat_function_nat_argument_cost", "REMOVAL-NAT-FUNCTION-NAT-ARGUMENT-COST", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.modules.removal.removal_modules_natfunction", "removal_nat_function_nat_argument_expand", "REMOVAL-NAT-FUNCTION-NAT-ARGUMENT-EXPAND", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.modules.removal.removal_modules_natfunction", "removal_nat_function_nat_argument_supports", "REMOVAL-NAT-FUNCTION-NAT-ARGUMENT-SUPPORTS", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.modules.removal.removal_modules_natfunction", "inference_nart_id_check", "INFERENCE-NART-ID-CHECK", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.modules.removal.removal_modules_natfunction", "make_nart_id_support", "MAKE-NART-ID-SUPPORT", 2, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.modules.removal.removal_modules_natfunction", "removal_nart_id_check_pos_cost", "REMOVAL-NART-ID-CHECK-POS-COST", 1, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.modules.removal.removal_modules_natfunction", "removal_nart_id_check_neg_cost", "REMOVAL-NART-ID-CHECK-NEG-COST", 1, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.modules.removal.removal_modules_natfunction", "removal_nart_id_check", "REMOVAL-NART-ID-CHECK", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.modules.removal.removal_modules_natfunction", "removal_nart_id_lookup_cost", "REMOVAL-NART-ID-LOOKUP-COST", 1, 1, false);
        return (SubLObject)removal_modules_natfunction.NIL;
    }
    
    public static SubLObject init_removal_modules_natfunction_file() {
        removal_modules_natfunction.$nat_arguments_equal_enabled$ = SubLFiles.deflexical("*NAT-ARGUMENTS-EQUAL-ENABLED*", (SubLObject)removal_modules_natfunction.NIL);
        removal_modules_natfunction.$default_nat_function_check_cost$ = SubLFiles.deflexical("*DEFAULT-NAT-FUNCTION-CHECK-COST*", control_vars.$hl_module_check_cost$.getDynamicValue());
        removal_modules_natfunction.$nat_function_code_rule$ = SubLFiles.defparameter("*NAT-FUNCTION-CODE-RULE*", (SubLObject)removal_modules_natfunction.$list6);
        removal_modules_natfunction.$default_nat_argument_check_cost$ = SubLFiles.deflexical("*DEFAULT-NAT-ARGUMENT-CHECK-COST*", control_vars.$hl_module_check_cost$.getDynamicValue());
        removal_modules_natfunction.$nat_argument_code_rule$ = SubLFiles.defparameter("*NAT-ARGUMENT-CODE-RULE*", (SubLObject)removal_modules_natfunction.$list20);
        removal_modules_natfunction.$nat_arguments_equal_code_rule$ = SubLFiles.defparameter("*NAT-ARGUMENTS-EQUAL-CODE-RULE*", (SubLObject)removal_modules_natfunction.$list32);
        removal_modules_natfunction.$nart_id_defining_mt$ = SubLFiles.deflexical("*NART-ID-DEFINING-MT*", (removal_modules_natfunction.NIL != Symbols.boundp((SubLObject)removal_modules_natfunction.$sym45$_NART_ID_DEFINING_MT_)) ? removal_modules_natfunction.$nart_id_defining_mt$.getGlobalValue() : removal_modules_natfunction.$const46$BaseKB);
        removal_modules_natfunction.$nart_id_check_default_cost$ = SubLFiles.deflexical("*NART-ID-CHECK-DEFAULT-COST*", control_vars.$cheap_hl_module_check_cost$.getGlobalValue());
        removal_modules_natfunction.$nart_id_unify_default_cost$ = SubLFiles.deflexical("*NART-ID-UNIFY-DEFAULT-COST*", (SubLObject)removal_modules_natfunction.ONE_INTEGER);
        return (SubLObject)removal_modules_natfunction.NIL;
    }
    
    public static SubLObject setup_removal_modules_natfunction_file() {
        inference_modules.register_solely_specific_removal_module_predicate(removal_modules_natfunction.$const0$natFunction);
        preference_modules.doomed_unless_either_arg_bindable((SubLObject)removal_modules_natfunction.$kw1$POS, removal_modules_natfunction.$const0$natFunction);
        preference_modules.inference_preference_module((SubLObject)removal_modules_natfunction.$kw2$NAT_FUNCTION_LOOKUP_POS, (SubLObject)removal_modules_natfunction.$list3);
        inference_modules.inference_removal_module((SubLObject)removal_modules_natfunction.$kw4$REMOVAL_NAT_FUNCTION_CHECK_POS, (SubLObject)removal_modules_natfunction.$list5);
        inference_modules.inference_removal_module((SubLObject)removal_modules_natfunction.$kw10$REMOVAL_NAT_FUNCTION_UNIFY, (SubLObject)removal_modules_natfunction.$list11);
        inference_modules.inference_removal_module((SubLObject)removal_modules_natfunction.$kw13$REMOVAL_NAT_FUNCTION_LOOKUP, (SubLObject)removal_modules_natfunction.$list14);
        inference_modules.register_solely_specific_removal_module_predicate(removal_modules_natfunction.$const15$natArgument);
        preference_modules.inference_preference_module((SubLObject)removal_modules_natfunction.$kw16$NAT_ARGUMENT_LOOKUP_POS, (SubLObject)removal_modules_natfunction.$list17);
        inference_modules.inference_removal_module((SubLObject)removal_modules_natfunction.$kw18$REMOVAL_NAT_ARGUMENT_CHECK_POS, (SubLObject)removal_modules_natfunction.$list19);
        inference_modules.inference_removal_module((SubLObject)removal_modules_natfunction.$kw21$REMOVAL_NAT_ARGUMENT_TERM_UNIFY, (SubLObject)removal_modules_natfunction.$list22);
        inference_modules.inference_removal_module((SubLObject)removal_modules_natfunction.$kw24$REMOVAL_NAT_ARGUMENT_ARG_UNIFY, (SubLObject)removal_modules_natfunction.$list25);
        inference_modules.inference_removal_module((SubLObject)removal_modules_natfunction.$kw27$REMOVAL_NAT_ARGUMENT_LOOKUP, (SubLObject)removal_modules_natfunction.$list28);
        inference_modules.register_solely_specific_removal_module_predicate(removal_modules_natfunction.$const29$natArgumentsEqual);
        preference_modules.doomed_unless_arg_bindable((SubLObject)removal_modules_natfunction.$kw1$POS, removal_modules_natfunction.$const29$natArgumentsEqual, (SubLObject)removal_modules_natfunction.ONE_INTEGER);
        preference_modules.doomed_unless_arg_bindable((SubLObject)removal_modules_natfunction.$kw1$POS, removal_modules_natfunction.$const29$natArgumentsEqual, (SubLObject)removal_modules_natfunction.TWO_INTEGER);
        inference_modules.inference_removal_module((SubLObject)removal_modules_natfunction.$kw30$REMOVAL_NAT_ARGUMENTS_EQUAL_CHECK_POS, (SubLObject)removal_modules_natfunction.$list31);
        memoization_state.note_memoized_function((SubLObject)removal_modules_natfunction.$sym35$REMOVAL_NAT_FUNC_ASENTS_WITH_NOT_FULLY_BOUND_ARG1_DICT);
        memoization_state.note_memoized_function((SubLObject)removal_modules_natfunction.$sym37$REMOVAL_NAT_FUNCTION_CONTEXTUALIZED_ASENT_P);
        memoization_state.note_memoized_function((SubLObject)removal_modules_natfunction.$sym40$REMOVAL_NAT_ARGUMENT_CONTEXTUALIZED_ASENT_P);
        inference_modules.register_solely_specific_removal_module_predicate(removal_modules_natfunction.$const43$nartID);
        preference_modules.doomed_unless_either_arg_bindable((SubLObject)removal_modules_natfunction.$kw1$POS, removal_modules_natfunction.$const43$nartID);
        preference_modules.doomed_unless_all_args_bindable((SubLObject)removal_modules_natfunction.$kw44$NEG, removal_modules_natfunction.$const43$nartID);
        subl_macro_promotions.declare_defglobal((SubLObject)removal_modules_natfunction.$sym45$_NART_ID_DEFINING_MT_);
        mt_vars.note_mt_var((SubLObject)removal_modules_natfunction.$sym45$_NART_ID_DEFINING_MT_, removal_modules_natfunction.$const43$nartID);
        inference_modules.inference_removal_module((SubLObject)removal_modules_natfunction.$kw48$REMOVAL_NART_ID_CHECK_POS, (SubLObject)removal_modules_natfunction.$list49);
        inference_modules.inference_removal_module((SubLObject)removal_modules_natfunction.$kw50$REMOVAL_NART_ID_CHECK_NEG, (SubLObject)removal_modules_natfunction.$list51);
        inference_modules.inference_removal_module((SubLObject)removal_modules_natfunction.$kw52$REMOVAL_NART_ID_UNIFY, (SubLObject)removal_modules_natfunction.$list53);
        inference_modules.inference_removal_module((SubLObject)removal_modules_natfunction.$kw54$REMOVAL_NART_ID_LOOKUP, (SubLObject)removal_modules_natfunction.$list55);
        return (SubLObject)removal_modules_natfunction.NIL;
    }
    
    @Override
	public void declareFunctions() {
        declare_removal_modules_natfunction_file();
    }
    
    @Override
	public void initializeVariables() {
        init_removal_modules_natfunction_file();
    }
    
    @Override
	public void runTopLevelForms() {
        setup_removal_modules_natfunction_file();
    }
    
    static {
        me = (SubLFile)new removal_modules_natfunction();
        removal_modules_natfunction.$nat_arguments_equal_enabled$ = null;
        removal_modules_natfunction.$default_nat_function_check_cost$ = null;
        removal_modules_natfunction.$nat_function_code_rule$ = null;
        removal_modules_natfunction.$default_nat_argument_check_cost$ = null;
        removal_modules_natfunction.$nat_argument_code_rule$ = null;
        removal_modules_natfunction.$nat_arguments_equal_code_rule$ = null;
        removal_modules_natfunction.$nart_id_defining_mt$ = null;
        removal_modules_natfunction.$nart_id_check_default_cost$ = null;
        removal_modules_natfunction.$nart_id_unify_default_cost$ = null;
        $const0$natFunction = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("natFunction"));
        $kw1$POS = SubLObjectFactory.makeKeyword("POS");
        $kw2$NAT_FUNCTION_LOOKUP_POS = SubLObjectFactory.makeKeyword("NAT-FUNCTION-LOOKUP-POS");
        $list3 = ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("SENSE"), (SubLObject)SubLObjectFactory.makeKeyword("POS"), (SubLObject)SubLObjectFactory.makeKeyword("PREDICATE"), constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("natFunction")), (SubLObject)SubLObjectFactory.makeKeyword("REQUIRED-PATTERN"), (SubLObject)ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("natFunction")), (SubLObject)SubLObjectFactory.makeKeyword("NOT-FULLY-BOUND"), (SubLObject)SubLObjectFactory.makeKeyword("FULLY-BOUND")), (SubLObject)SubLObjectFactory.makeKeyword("PREFERENCE-LEVEL"), (SubLObject)SubLObjectFactory.makeKeyword("GROSSLY-DISPREFERRED"));
        $kw4$REMOVAL_NAT_FUNCTION_CHECK_POS = SubLObjectFactory.makeKeyword("REMOVAL-NAT-FUNCTION-CHECK-POS");
        $list5 = ConsesLow.list(new SubLObject[] { SubLObjectFactory.makeKeyword("SENSE"), SubLObjectFactory.makeKeyword("POS"), SubLObjectFactory.makeKeyword("PREDICATE"), constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("natFunction")), SubLObjectFactory.makeKeyword("REQUIRED-PATTERN"), ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("natFunction")), (SubLObject)SubLObjectFactory.makeKeyword("NART"), (SubLObject)SubLObjectFactory.makeKeyword("FULLY-BOUND")), SubLObjectFactory.makeKeyword("COST"), SubLObjectFactory.makeSymbol("REMOVAL-NAT-FUNCTION-CHECK-POS-COST"), SubLObjectFactory.makeKeyword("COMPLETENESS"), SubLObjectFactory.makeKeyword("COMPLETE"), SubLObjectFactory.makeKeyword("EXPAND"), SubLObjectFactory.makeSymbol("REMOVAL-NAT-FUNCTION-CHECK-POS-EXPAND"), SubLObjectFactory.makeKeyword("DOCUMENTATION"), SubLObjectFactory.makeString("(#$natFunction <reified NAT> <fully-bound>)"), SubLObjectFactory.makeKeyword("EXAMPLE"), SubLObjectFactory.makeString("(#$natFunction (#$JuvenileFn #$Dog) #$JuvenileFn)") });
        $list6 = ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("implies")), (SubLObject)ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("termOfUnit")), (SubLObject)SubLObjectFactory.makeSymbol("?NAT"), (SubLObject)ConsesLow.cons((SubLObject)SubLObjectFactory.makeSymbol("?FUNCTION"), (SubLObject)SubLObjectFactory.makeSymbol("?ARGS"))), (SubLObject)ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("natFunction")), (SubLObject)SubLObjectFactory.makeSymbol("?NAT"), (SubLObject)SubLObjectFactory.makeSymbol("?FUNCTION")));
        $kw7$CODE = SubLObjectFactory.makeKeyword("CODE");
        $kw8$TRUE_MON = SubLObjectFactory.makeKeyword("TRUE-MON");
        $const9$termOfUnit = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("termOfUnit"));
        $kw10$REMOVAL_NAT_FUNCTION_UNIFY = SubLObjectFactory.makeKeyword("REMOVAL-NAT-FUNCTION-UNIFY");
        $list11 = ConsesLow.list(new SubLObject[] { SubLObjectFactory.makeKeyword("SENSE"), SubLObjectFactory.makeKeyword("POS"), SubLObjectFactory.makeKeyword("PREDICATE"), constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("natFunction")), SubLObjectFactory.makeKeyword("REQUIRED-PATTERN"), ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("natFunction")), (SubLObject)SubLObjectFactory.makeKeyword("NART"), (SubLObject)SubLObjectFactory.makeKeyword("NOT-FULLY-BOUND")), SubLObjectFactory.makeKeyword("COST"), SubLObjectFactory.makeSymbol("REMOVAL-NAT-FUNCTION-UNIFY-COST"), SubLObjectFactory.makeKeyword("COMPLETENESS"), SubLObjectFactory.makeKeyword("COMPLETE"), SubLObjectFactory.makeKeyword("EXPAND"), SubLObjectFactory.makeSymbol("REMOVAL-NAT-FUNCTION-UNIFY-EXPAND"), SubLObjectFactory.makeKeyword("DOCUMENTATION"), SubLObjectFactory.makeString("(#$natFunction <reified NAT> <not fully-bound>)"), SubLObjectFactory.makeKeyword("EXAMPLE"), SubLObjectFactory.makeString("(#$natFunction (#$JuvenileFn #$Dog) ?WHAT)") });
        $sym12$REMOVAL_NAT_FUNCTION_LOOKUP_INTERNAL = SubLObjectFactory.makeSymbol("REMOVAL-NAT-FUNCTION-LOOKUP-INTERNAL");
        $kw13$REMOVAL_NAT_FUNCTION_LOOKUP = SubLObjectFactory.makeKeyword("REMOVAL-NAT-FUNCTION-LOOKUP");
        $list14 = ConsesLow.list(new SubLObject[] { SubLObjectFactory.makeKeyword("SENSE"), SubLObjectFactory.makeKeyword("POS"), SubLObjectFactory.makeKeyword("PREDICATE"), constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("natFunction")), SubLObjectFactory.makeKeyword("REQUIRED-PATTERN"), ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("natFunction")), (SubLObject)SubLObjectFactory.makeKeyword("NOT-FULLY-BOUND"), (SubLObject)SubLObjectFactory.makeKeyword("FORT")), SubLObjectFactory.makeKeyword("COST"), SubLObjectFactory.makeSymbol("REMOVAL-NAT-FUNCTION-LOOKUP-COST"), SubLObjectFactory.makeKeyword("COMPLETENESS"), SubLObjectFactory.makeKeyword("COMPLETE"), SubLObjectFactory.makeKeyword("EXPAND"), SubLObjectFactory.makeSymbol("REMOVAL-NAT-FUNCTION-LOOKUP-EXPAND"), SubLObjectFactory.makeKeyword("DOCUMENTATION"), SubLObjectFactory.makeString("(#$natFunction <not fully-bound> <fort>)"), SubLObjectFactory.makeKeyword("EXAMPLE"), SubLObjectFactory.makeString("(#$natFunction ?NAT #$JuvenileFn)") });
        $const15$natArgument = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("natArgument"));
        $kw16$NAT_ARGUMENT_LOOKUP_POS = SubLObjectFactory.makeKeyword("NAT-ARGUMENT-LOOKUP-POS");
        $list17 = ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("SENSE"), (SubLObject)SubLObjectFactory.makeKeyword("POS"), (SubLObject)SubLObjectFactory.makeKeyword("PREDICATE"), constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("natArgument")), (SubLObject)SubLObjectFactory.makeKeyword("REQUIRED-PATTERN"), (SubLObject)ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("natArgument")), (SubLObject)SubLObjectFactory.makeKeyword("NOT-FULLY-BOUND"), (SubLObject)SubLObjectFactory.makeKeyword("ANYTHING"), (SubLObject)SubLObjectFactory.makeKeyword("FULLY-BOUND")), (SubLObject)SubLObjectFactory.makeKeyword("PREFERENCE-LEVEL"), (SubLObject)SubLObjectFactory.makeKeyword("GROSSLY-DISPREFERRED"));
        $kw18$REMOVAL_NAT_ARGUMENT_CHECK_POS = SubLObjectFactory.makeKeyword("REMOVAL-NAT-ARGUMENT-CHECK-POS");
        $list19 = ConsesLow.list(new SubLObject[] { SubLObjectFactory.makeKeyword("SENSE"), SubLObjectFactory.makeKeyword("POS"), SubLObjectFactory.makeKeyword("PREDICATE"), constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("natArgument")), SubLObjectFactory.makeKeyword("REQUIRED-PATTERN"), ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("natArgument")), (SubLObject)SubLObjectFactory.makeKeyword("NART"), (SubLObject)SubLObjectFactory.makeKeyword("INTEGER"), (SubLObject)SubLObjectFactory.makeKeyword("FULLY-BOUND")), SubLObjectFactory.makeKeyword("REQUIRED"), SubLObjectFactory.makeSymbol("REMOVAL-NAT-ARGUMENT-CHECK-POS-REQUIRED"), SubLObjectFactory.makeKeyword("COST"), SubLObjectFactory.makeSymbol("REMOVAL-NAT-ARGUMENT-CHECK-POS-COST"), SubLObjectFactory.makeKeyword("COMPLETENESS"), SubLObjectFactory.makeKeyword("COMPLETE"), SubLObjectFactory.makeKeyword("EXPAND"), SubLObjectFactory.makeSymbol("REMOVAL-NAT-ARGUMENT-CHECK-POS-EXPAND"), SubLObjectFactory.makeKeyword("DOCUMENTATION"), SubLObjectFactory.makeString("(#$natArgument <reified NAT> <non-negative integer> <fully bound>)"), SubLObjectFactory.makeKeyword("EXAMPLE"), SubLObjectFactory.makeString("(#$natArgument (#$JuvenileFn #$Dog) 1 #$Dog)") });
        $list20 = ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("implies")), (SubLObject)ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("and")), (SubLObject)ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("termOfUnit")), (SubLObject)SubLObjectFactory.makeSymbol("?NAT"), (SubLObject)SubLObjectFactory.makeSymbol("?FORMULA")), (SubLObject)ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("evaluate")), (SubLObject)SubLObjectFactory.makeSymbol("?TERM"), (SubLObject)ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("FormulaArgFn")), (SubLObject)SubLObjectFactory.makeSymbol("?ARG"), (SubLObject)SubLObjectFactory.makeSymbol("?FORMULA")))), (SubLObject)ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("natArgument")), (SubLObject)SubLObjectFactory.makeSymbol("?NAT"), (SubLObject)SubLObjectFactory.makeSymbol("?ARG"), (SubLObject)SubLObjectFactory.makeSymbol("?TERM")));
        $kw21$REMOVAL_NAT_ARGUMENT_TERM_UNIFY = SubLObjectFactory.makeKeyword("REMOVAL-NAT-ARGUMENT-TERM-UNIFY");
        $list22 = ConsesLow.list(new SubLObject[] { SubLObjectFactory.makeKeyword("SENSE"), SubLObjectFactory.makeKeyword("POS"), SubLObjectFactory.makeKeyword("PREDICATE"), constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("natArgument")), SubLObjectFactory.makeKeyword("REQUIRED-PATTERN"), ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("natArgument")), (SubLObject)SubLObjectFactory.makeKeyword("NART"), (SubLObject)SubLObjectFactory.makeKeyword("INTEGER"), (SubLObject)SubLObjectFactory.makeKeyword("NOT-FULLY-BOUND")), SubLObjectFactory.makeKeyword("REQUIRED"), SubLObjectFactory.makeSymbol("REMOVAL-NAT-ARGUMENT-TERM-UNIFY-REQUIRED"), SubLObjectFactory.makeKeyword("COST"), SubLObjectFactory.makeSymbol("REMOVAL-NAT-ARGUMENT-TERM-UNIFY-COST"), SubLObjectFactory.makeKeyword("COMPLETENESS"), SubLObjectFactory.makeKeyword("COMPLETE"), SubLObjectFactory.makeKeyword("EXPAND"), SubLObjectFactory.makeSymbol("REMOVAL-NAT-ARGUMENT-TERM-UNIFY-EXPAND"), SubLObjectFactory.makeKeyword("DOCUMENTATION"), SubLObjectFactory.makeString("(#$natArgument <reified NAT> <non-negative integer> <not fully-bound>)"), SubLObjectFactory.makeKeyword("EXAMPLE"), SubLObjectFactory.makeString("(#$natArgument (#$JuvenileFn #$Dog) 1 ?WHAT)") });
        $kw23$IGNORE = SubLObjectFactory.makeKeyword("IGNORE");
        $kw24$REMOVAL_NAT_ARGUMENT_ARG_UNIFY = SubLObjectFactory.makeKeyword("REMOVAL-NAT-ARGUMENT-ARG-UNIFY");
        $list25 = ConsesLow.list(new SubLObject[] { SubLObjectFactory.makeKeyword("SENSE"), SubLObjectFactory.makeKeyword("POS"), SubLObjectFactory.makeKeyword("PREDICATE"), constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("natArgument")), SubLObjectFactory.makeKeyword("REQUIRED-PATTERN"), ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("natArgument")), (SubLObject)SubLObjectFactory.makeKeyword("NART"), (SubLObject)SubLObjectFactory.makeKeyword("NOT-FULLY-BOUND"), (SubLObject)SubLObjectFactory.makeKeyword("ANYTHING")), SubLObjectFactory.makeKeyword("COST"), SubLObjectFactory.makeSymbol("REMOVAL-NAT-ARGUMENT-ARG-UNIFY-COST"), SubLObjectFactory.makeKeyword("COMPLETENESS"), SubLObjectFactory.makeKeyword("COMPLETE"), SubLObjectFactory.makeKeyword("EXPAND"), SubLObjectFactory.makeSymbol("REMOVAL-NAT-ARGUMENT-ARG-UNIFY-EXPAND"), SubLObjectFactory.makeKeyword("DOCUMENTATION"), SubLObjectFactory.makeString("(#$natArgument <reified NAT> <not fully-bound> <anything>)"), SubLObjectFactory.makeKeyword("EXAMPLE"), SubLObjectFactory.makeString("(#$natArgument (#$JuvenileFn #$Dog) ?ARG ?WHAT)\n    (#$natArgument (#$JuvenileFn #$Dog) ?ARG #$Dog)") });
        $sym26$REMOVAL_NAT_ARGUMENT_LOOKUP_INTERNAL = SubLObjectFactory.makeSymbol("REMOVAL-NAT-ARGUMENT-LOOKUP-INTERNAL");
        $kw27$REMOVAL_NAT_ARGUMENT_LOOKUP = SubLObjectFactory.makeKeyword("REMOVAL-NAT-ARGUMENT-LOOKUP");
        $list28 = ConsesLow.list(new SubLObject[] { SubLObjectFactory.makeKeyword("SENSE"), SubLObjectFactory.makeKeyword("POS"), SubLObjectFactory.makeKeyword("PREDICATE"), constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("natArgument")), SubLObjectFactory.makeKeyword("REQUIRED-PATTERN"), ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("natArgument")), (SubLObject)SubLObjectFactory.makeKeyword("NOT-FULLY-BOUND"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("OR"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("TEST"), (SubLObject)SubLObjectFactory.makeSymbol("NON-NEGATIVE-INTEGER-P")), (SubLObject)SubLObjectFactory.makeKeyword("VARIABLE")), (SubLObject)SubLObjectFactory.makeKeyword("FORT")), SubLObjectFactory.makeKeyword("COST"), SubLObjectFactory.makeSymbol("REMOVAL-NAT-ARGUMENT-LOOKUP-COST"), SubLObjectFactory.makeKeyword("COMPLETENESS"), SubLObjectFactory.makeKeyword("COMPLETE"), SubLObjectFactory.makeKeyword("EXPAND"), SubLObjectFactory.makeSymbol("REMOVAL-NAT-ARGUMENT-LOOKUP-EXPAND"), SubLObjectFactory.makeKeyword("DOCUMENTATION"), SubLObjectFactory.makeString("(#$natArgument <not fully-bound> <variable> <fort>)\n    (#$natArgument <not fully-bound> <integer>  <fort>)"), SubLObjectFactory.makeKeyword("EXAMPLE"), SubLObjectFactory.makeString("(#$natArgument ?NAT 1    #$Dog)\n    (#$natArgument ?NAT ?ARG #$Dog)") });
        $const29$natArgumentsEqual = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("natArgumentsEqual"));
        $kw30$REMOVAL_NAT_ARGUMENTS_EQUAL_CHECK_POS = SubLObjectFactory.makeKeyword("REMOVAL-NAT-ARGUMENTS-EQUAL-CHECK-POS");
        $list31 = ConsesLow.list(new SubLObject[] { SubLObjectFactory.makeKeyword("SENSE"), SubLObjectFactory.makeKeyword("POS"), SubLObjectFactory.makeKeyword("PREDICATE"), constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("natArgumentsEqual")), SubLObjectFactory.makeKeyword("REQUIRED-PATTERN"), ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("natArgumentsEqual")), (SubLObject)SubLObjectFactory.makeKeyword("NART"), (SubLObject)SubLObjectFactory.makeKeyword("NART")), SubLObjectFactory.makeKeyword("REQUIRED"), SubLObjectFactory.makeSymbol("REMOVAL-NAT-ARGUMENTS-EQUAL-CHECK-POS-REQUIRED"), SubLObjectFactory.makeKeyword("COST"), SubLObjectFactory.makeSymbol("REMOVAL-NAT-ARGUMENTS-EQUAL-CHECK-POS-COST"), SubLObjectFactory.makeKeyword("COMPLETENESS"), SubLObjectFactory.makeKeyword("COMPLETE"), SubLObjectFactory.makeKeyword("EXPAND"), SubLObjectFactory.makeSymbol("REMOVAL-NAT-ARGUMENTS-EQUAL-CHECK-POS-EXPAND"), SubLObjectFactory.makeKeyword("DOCUMENTATION"), SubLObjectFactory.makeString("(#$natArgumentsEqual <reified NAT> <reified NAT>)"), SubLObjectFactory.makeKeyword("EXAMPLE"), SubLObjectFactory.makeString("(#$natArgumentsEqual (#$LeftFn #$Leg) (#$RightFn #$Leg))") });
        $list32 = ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("implies")), (SubLObject)ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("and")), (SubLObject)ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("termOfUnit")), (SubLObject)SubLObjectFactory.makeSymbol("?NAT1"), (SubLObject)SubLObjectFactory.makeSymbol("?FORMULA1")), (SubLObject)ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("termOfUnit")), (SubLObject)SubLObjectFactory.makeSymbol("?NAT2"), (SubLObject)SubLObjectFactory.makeSymbol("?FORMULA2")), (SubLObject)ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("evaluate")), (SubLObject)SubLObjectFactory.makeSymbol("?ARGS-LIST"), (SubLObject)ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("FormulaArgListFn")), (SubLObject)SubLObjectFactory.makeSymbol("?FORMULA1"))), (SubLObject)ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("evaluate")), (SubLObject)SubLObjectFactory.makeSymbol("?ARGS-LIST"), (SubLObject)ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("FormulaArgListFn")), (SubLObject)SubLObjectFactory.makeSymbol("?FORMULA2")))), (SubLObject)ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("natArgumentsEqual")), (SubLObject)SubLObjectFactory.makeSymbol("?NAT1"), (SubLObject)SubLObjectFactory.makeSymbol("?NAT2")));
        $list33 = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("MT"), (SubLObject)SubLObjectFactory.makeSymbol("NAT-ARG-ASENT"));
        $sym34$_ = SubLObjectFactory.makeSymbol("=");
        $sym35$REMOVAL_NAT_FUNC_ASENTS_WITH_NOT_FULLY_BOUND_ARG1_DICT = SubLObjectFactory.makeSymbol("REMOVAL-NAT-FUNC-ASENTS-WITH-NOT-FULLY-BOUND-ARG1-DICT");
        $list36 = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("MT"), (SubLObject)SubLObjectFactory.makeSymbol("NAT-FUN-ASENT"));
        $sym37$REMOVAL_NAT_FUNCTION_CONTEXTUALIZED_ASENT_P = SubLObjectFactory.makeSymbol("REMOVAL-NAT-FUNCTION-CONTEXTUALIZED-ASENT-P");
        $list38 = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("MT"), (SubLObject)SubLObjectFactory.makeSymbol("ASENT"));
        $const39$ReifiableFunction = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("ReifiableFunction"));
        $sym40$REMOVAL_NAT_ARGUMENT_CONTEXTUALIZED_ASENT_P = SubLObjectFactory.makeSymbol("REMOVAL-NAT-ARGUMENT-CONTEXTUALIZED-ASENT-P");
        $list41 = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("FUNC-MT"), (SubLObject)SubLObjectFactory.makeSymbol("FUNC-ASENT"));
        $list42 = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("ARG-MT"), (SubLObject)SubLObjectFactory.makeSymbol("ARG-ASENT"));
        $const43$nartID = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("nartID"));
        $kw44$NEG = SubLObjectFactory.makeKeyword("NEG");
        $sym45$_NART_ID_DEFINING_MT_ = SubLObjectFactory.makeSymbol("*NART-ID-DEFINING-MT*");
        $const46$BaseKB = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("BaseKB"));
        $kw47$OPAQUE = SubLObjectFactory.makeKeyword("OPAQUE");
        $kw48$REMOVAL_NART_ID_CHECK_POS = SubLObjectFactory.makeKeyword("REMOVAL-NART-ID-CHECK-POS");
        $list49 = ConsesLow.list(new SubLObject[] { SubLObjectFactory.makeKeyword("SENSE"), SubLObjectFactory.makeKeyword("POS"), SubLObjectFactory.makeKeyword("PREDICATE"), constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("nartID")), SubLObjectFactory.makeKeyword("REQUIRED-PATTERN"), ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("nartID")), (SubLObject)SubLObjectFactory.makeKeyword("NART"), (SubLObject)SubLObjectFactory.makeKeyword("INTEGER")), SubLObjectFactory.makeKeyword("COST"), SubLObjectFactory.makeSymbol("REMOVAL-NART-ID-CHECK-POS-COST"), SubLObjectFactory.makeKeyword("COMPLETENESS"), SubLObjectFactory.makeKeyword("COMPLETE"), SubLObjectFactory.makeKeyword("CHECK"), removal_modules_natfunction.T, SubLObjectFactory.makeKeyword("OUTPUT-CHECK-PATTERN"), ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("CALL"), (SubLObject)SubLObjectFactory.makeSymbol("REMOVAL-NART-ID-CHECK"), (SubLObject)SubLObjectFactory.makeKeyword("INPUT")), SubLObjectFactory.makeKeyword("SUPPORT-MT"), SubLObjectFactory.makeSymbol("*NART-ID-DEFINING-MT*"), SubLObjectFactory.makeKeyword("SUPPORT-STRENGTH"), SubLObjectFactory.makeKeyword("MONOTONIC"), SubLObjectFactory.makeKeyword("DOCUMENTATION"), SubLObjectFactory.makeString("(#$nartID <nart-p> <integerp>)"), SubLObjectFactory.makeKeyword("EXAMPLE"), SubLObjectFactory.makeString("(#$nartID #$isa 260)") });
        $kw50$REMOVAL_NART_ID_CHECK_NEG = SubLObjectFactory.makeKeyword("REMOVAL-NART-ID-CHECK-NEG");
        $list51 = ConsesLow.list(new SubLObject[] { SubLObjectFactory.makeKeyword("SENSE"), SubLObjectFactory.makeKeyword("NEG"), SubLObjectFactory.makeKeyword("PREDICATE"), constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("nartID")), SubLObjectFactory.makeKeyword("REQUIRED-PATTERN"), ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("nartID")), (SubLObject)SubLObjectFactory.makeKeyword("NART"), (SubLObject)SubLObjectFactory.makeKeyword("INTEGER")), SubLObjectFactory.makeKeyword("COST"), SubLObjectFactory.makeSymbol("REMOVAL-NART-ID-CHECK-NEG-COST"), SubLObjectFactory.makeKeyword("COMPLETENESS"), SubLObjectFactory.makeKeyword("COMPLETE"), SubLObjectFactory.makeKeyword("CHECK"), removal_modules_natfunction.T, SubLObjectFactory.makeKeyword("OUTPUT-CHECK-PATTERN"), ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("CALL"), (SubLObject)SubLObjectFactory.makeSymbol("INVERT-BOOLEAN-ANSWER"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("CALL"), (SubLObject)SubLObjectFactory.makeSymbol("REMOVAL-NART-ID-CHECK"), (SubLObject)SubLObjectFactory.makeKeyword("INPUT"))), SubLObjectFactory.makeKeyword("SUPPORT-MT"), SubLObjectFactory.makeSymbol("*NART-ID-DEFINING-MT*"), SubLObjectFactory.makeKeyword("SUPPORT-STRENGTH"), SubLObjectFactory.makeKeyword("MONOTONIC"), SubLObjectFactory.makeKeyword("DOCUMENTATION"), SubLObjectFactory.makeString("(#$not (#$nartID <nart-p> <integerp>))"), SubLObjectFactory.makeKeyword("EXAMPLE"), SubLObjectFactory.makeString("(#$not (#$nartID #$Thing 260))") });
        $kw52$REMOVAL_NART_ID_UNIFY = SubLObjectFactory.makeKeyword("REMOVAL-NART-ID-UNIFY");
        $list53 = ConsesLow.list(new SubLObject[] { SubLObjectFactory.makeKeyword("SENSE"), SubLObjectFactory.makeKeyword("POS"), SubLObjectFactory.makeKeyword("PREDICATE"), constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("nartID")), SubLObjectFactory.makeKeyword("REQUIRED-PATTERN"), ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("nartID")), (SubLObject)SubLObjectFactory.makeKeyword("NART"), (SubLObject)SubLObjectFactory.makeKeyword("NOT-FULLY-BOUND")), SubLObjectFactory.makeKeyword("COST-EXPRESSION"), SubLObjectFactory.makeSymbol("*NART-ID-UNIFY-DEFAULT-COST*"), SubLObjectFactory.makeKeyword("COMPLETENESS"), SubLObjectFactory.makeKeyword("COMPLETE"), SubLObjectFactory.makeKeyword("INPUT-EXTRACT-PATTERN"), ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("TEMPLATE"), (SubLObject)ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("nartID")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("BIND"), (SubLObject)SubLObjectFactory.makeSymbol("NART")), (SubLObject)SubLObjectFactory.makeKeyword("ANYTHING")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("VALUE"), (SubLObject)SubLObjectFactory.makeSymbol("NART"))), SubLObjectFactory.makeKeyword("OUTPUT-GENERATE-PATTERN"), ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("CALL"), (SubLObject)SubLObjectFactory.makeSymbol("ANSWER-TO-SINGLETON"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("CALL"), (SubLObject)SubLObjectFactory.makeSymbol("NART-ID"), (SubLObject)SubLObjectFactory.makeKeyword("INPUT"))), SubLObjectFactory.makeKeyword("OUTPUT-CONSTRUCT-PATTERN"), ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("nartID")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("VALUE"), (SubLObject)SubLObjectFactory.makeSymbol("NART")), (SubLObject)SubLObjectFactory.makeKeyword("INPUT")), SubLObjectFactory.makeKeyword("SUPPORT-MT"), SubLObjectFactory.makeSymbol("*NART-ID-DEFINING-MT*"), SubLObjectFactory.makeKeyword("SUPPORT-STRENGTH"), SubLObjectFactory.makeKeyword("MONOTONIC"), SubLObjectFactory.makeKeyword("DOCUMENTATION"), SubLObjectFactory.makeString("(#$nartID <nart-p> <not fully-bound>)"), SubLObjectFactory.makeKeyword("EXAMPLE"), SubLObjectFactory.makeString("(#$nartID #$isa ?ID)") });
        $kw54$REMOVAL_NART_ID_LOOKUP = SubLObjectFactory.makeKeyword("REMOVAL-NART-ID-LOOKUP");
        $list55 = ConsesLow.list(new SubLObject[] { SubLObjectFactory.makeKeyword("SENSE"), SubLObjectFactory.makeKeyword("POS"), SubLObjectFactory.makeKeyword("PREDICATE"), constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("nartID")), SubLObjectFactory.makeKeyword("REQUIRED-PATTERN"), ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("nartID")), (SubLObject)SubLObjectFactory.makeKeyword("NOT-FULLY-BOUND"), (SubLObject)SubLObjectFactory.makeKeyword("INTEGER")), SubLObjectFactory.makeKeyword("COST"), SubLObjectFactory.makeSymbol("REMOVAL-NART-ID-LOOKUP-COST"), SubLObjectFactory.makeKeyword("COMPLETENESS"), SubLObjectFactory.makeKeyword("COMPLETE"), SubLObjectFactory.makeKeyword("INPUT-EXTRACT-PATTERN"), ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("TEMPLATE"), (SubLObject)ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("nartID")), (SubLObject)SubLObjectFactory.makeKeyword("ANYTHING"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("BIND"), (SubLObject)SubLObjectFactory.makeSymbol("ID"))), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("VALUE"), (SubLObject)SubLObjectFactory.makeSymbol("ID"))), SubLObjectFactory.makeKeyword("OUTPUT-GENERATE-PATTERN"), ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("CALL"), (SubLObject)SubLObjectFactory.makeSymbol("NON-NULL-ANSWER-TO-SINGLETON"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("CALL"), (SubLObject)SubLObjectFactory.makeSymbol("FIND-NART-BY-ID"), (SubLObject)SubLObjectFactory.makeKeyword("INPUT"))), SubLObjectFactory.makeKeyword("OUTPUT-CONSTRUCT-PATTERN"), ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("nartID")), (SubLObject)SubLObjectFactory.makeKeyword("INPUT"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("VALUE"), (SubLObject)SubLObjectFactory.makeSymbol("ID"))), SubLObjectFactory.makeKeyword("SUPPORT-MT"), SubLObjectFactory.makeSymbol("*NART-ID-DEFINING-MT*"), SubLObjectFactory.makeKeyword("SUPPORT-STRENGTH"), SubLObjectFactory.makeKeyword("MONOTONIC"), SubLObjectFactory.makeKeyword("DOCUMENTATION"), SubLObjectFactory.makeString("(#$nartID <not fully-bound> <integerp>)"), SubLObjectFactory.makeKeyword("EXAMPLE"), SubLObjectFactory.makeString("(#$nartID ?NART 260)") });
    }
}

/*

	Total time: 199 ms
	
*/