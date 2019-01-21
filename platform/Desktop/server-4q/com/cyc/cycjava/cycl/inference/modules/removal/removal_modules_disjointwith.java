package com.cyc.cycjava.cycl.inference.modules.removal;

import com.cyc.cycjava.cycl.constant_handles;
import com.cyc.cycjava.cycl.utilities_macros;
import com.cyc.cycjava.cycl.inference.modules.preference_modules;
import com.cyc.cycjava.cycl.inference.harness.inference_modules;
import com.cyc.tool.subl.util.SubLFiles;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Mapping;
import com.cyc.cycjava.cycl.cycl_utilities;
import com.cyc.cycjava.cycl.control_vars;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.cdestructuring_bind;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Numbers;
import com.cyc.cycjava.cycl.bindings;
import com.cyc.cycjava.cycl.unification_utilities;
import com.cyc.cycjava.cycl.variables;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Sequences;
import com.cyc.cycjava.cycl.genls;
import com.cyc.cycjava.cycl.cardinality_estimates;
import com.cyc.cycjava.cycl.forts;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory;
import com.cyc.cycjava.cycl.inference.inference_trampolines;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.SubLThread;
import com.cyc.cycjava.cycl.backward;
import com.cyc.cycjava.cycl.arguments;
import com.cyc.cycjava.cycl.backward_utilities;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow;
import com.cyc.cycjava.cycl.disjoint_with;
import com.cyc.cycjava.cycl.el_utilities;
import com.cyc.cycjava.cycl.sdc;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLProcess;
import com.cyc.tool.subl.jrtl.nativeCode.type.number.SubLInteger;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLList;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObject;
import com.cyc.tool.subl.jrtl.nativeCode.type.symbol.SubLSymbol;
import com.cyc.tool.subl.util.SubLFile;
import com.cyc.tool.subl.util.SubLTranslatedFile;

public final class removal_modules_disjointwith extends SubLTranslatedFile
{
    public static final SubLFile me;
    public static final String myName = "com.cyc.cycjava.cycl.inference.modules.removal.removal_modules_disjointwith";
    public static final String myFingerPrint = "8047c575dc76b707a909369f2b180386cf996a6d98f1b533072ef75a625f16b3";
    @SubLTranslatedFile.SubL(source = "cycl/inference/modules/removal/removal-modules-disjointwith.lisp", position = 1611L)
    private static SubLSymbol $default_disjointwith_check_cost$;
    @SubLTranslatedFile.SubL(source = "cycl/inference/modules/removal/removal-modules-disjointwith.lisp", position = 2601L)
    private static SubLSymbol $default_sibling_disjoint_cost_factor$;
    @SubLTranslatedFile.SubL(source = "cycl/inference/modules/removal/removal-modules-disjointwith.lisp", position = 5942L)
    private static SubLSymbol $default_max_sibling_disjoint_cost_factor$;
    @SubLTranslatedFile.SubL(source = "cycl/inference/modules/removal/removal-modules-disjointwith.lisp", position = 8258L)
    private static SubLSymbol $default_not_disjointwith_check_cost$;
    @SubLTranslatedFile.SubL(source = "cycl/inference/modules/removal/removal-modules-disjointwith.lisp", position = 9834L)
    private static SubLSymbol $default_instancesofdisjointcollections_check_cost$;
    private static final SubLObject $const0$disjointWith;
    private static final SubLSymbol $kw1$POS;
    private static final SubLSymbol $kw2$NEG;
    private static final SubLSymbol $kw3$MAX_DISJOINT_WITH_POS;
    private static final SubLList $list4;
    private static final SubLSymbol $kw5$DISJOINTWITH;
    private static final SubLSymbol $kw6$REMOVAL_DISJOINTWITH_CHECK;
    private static final SubLList $list7;
    private static final SubLSymbol $kw8$SIBLING_DISJOINT;
    private static final SubLSymbol $kw9$REMOVAL_SIBLING_DISJOINT_CHECK;
    private static final SubLList $list10;
    private static final SubLSymbol $kw11$REMOVAL_MAX_DISJOINTWITH;
    private static final SubLList $list12;
    private static final SubLInteger $int13$100;
    private static final SubLSymbol $kw14$REMOVAL_MAX_SIBLING_DISJOINT;
    private static final SubLList $list15;
    private static final SubLList $list16;
    private static final SubLSymbol $kw17$MINIMIZE;
    private static final SubLSymbol $kw18$REMOVAL_NOT_DISJOINTWITH_CHECK;
    private static final SubLList $list19;
    private static final SubLObject $const20$instancesOfDisjointCollections;
    private static final SubLSymbol $kw21$REMOVAL_INSTANCES_OF_DISJOINT_COLLECTIONS;
    private static final SubLList $list22;
    private static final SubLObject $const23$maximalConsistentSubsets;
    private static final SubLSymbol $kw24$REMOVAL_MAXIMAL_CONSISTENT_SUBSETS_CHECK;
    private static final SubLList $list25;
    private static final SubLSymbol $kw26$REMOVAL_MAXIMAL_CONSISTENT_SUBSETS_UNIFY;
    private static final SubLList $list27;
    private static final SubLSymbol $sym28$REMOVAL_MAXIMAL_CONSISTENT_SUBSETS_UNIFY_COST;
    private static final SubLSymbol $sym29$CANONICALIZE_TERM;
    private static final SubLSymbol $sym30$MAKE_EL_SET;
    private static final SubLSymbol $sym31$REMOVAL_MAXIMAL_CONSISTENT_SUBSETS_UNIFY_OUTPUT_GENERATE;
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/modules/removal/removal-modules-disjointwith.lisp", position = 1893L)
    public static SubLObject removal_disjointwith_check_expand(final SubLObject literal, SubLObject sense) {
        if (sense == removal_modules_disjointwith.UNPROVIDED) {
            sense = (SubLObject)removal_modules_disjointwith.NIL;
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject _prev_bind_0 = sdc.$ignoring_sdcP$.currentBinding(thread);
        try {
            sdc.$ignoring_sdcP$.bind((SubLObject)removal_modules_disjointwith.T, thread);
            final SubLObject col1 = el_utilities.literal_arg1(literal, (SubLObject)removal_modules_disjointwith.UNPROVIDED);
            final SubLObject col2 = el_utilities.literal_arg2(literal, (SubLObject)removal_modules_disjointwith.UNPROVIDED);
            if (removal_modules_disjointwith.NIL != disjoint_with.disjoint_withP(col1, col2, (SubLObject)removal_modules_disjointwith.UNPROVIDED, (SubLObject)removal_modules_disjointwith.UNPROVIDED)) {
                final SubLObject hl_support_formula = backward_utilities.inference_make_commutative_literal(removal_modules_disjointwith.$const0$disjointWith, (SubLObject)ConsesLow.list(col1, col2));
                backward.removal_add_node(arguments.make_hl_support((SubLObject)removal_modules_disjointwith.$kw5$DISJOINTWITH, hl_support_formula, (SubLObject)removal_modules_disjointwith.UNPROVIDED, (SubLObject)removal_modules_disjointwith.UNPROVIDED), (SubLObject)removal_modules_disjointwith.UNPROVIDED, (SubLObject)removal_modules_disjointwith.UNPROVIDED);
            }
        }
        finally {
            sdc.$ignoring_sdcP$.rebind(_prev_bind_0, thread);
        }
        return (SubLObject)removal_modules_disjointwith.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/modules/removal/removal-modules-disjointwith.lisp", position = 2855L)
    public static SubLObject removal_sibling_disjoint_check_required(final SubLObject literal, SubLObject sense) {
        if (sense == removal_modules_disjointwith.UNPROVIDED) {
            sense = (SubLObject)removal_modules_disjointwith.NIL;
        }
        final SubLObject arg1 = el_utilities.literal_arg1(literal, (SubLObject)removal_modules_disjointwith.UNPROVIDED);
        final SubLObject arg2 = el_utilities.literal_arg2(literal, (SubLObject)removal_modules_disjointwith.UNPROVIDED);
        return (SubLObject)SubLObjectFactory.makeBoolean(removal_modules_disjointwith.NIL != inference_trampolines.inference_applicable_sdctP(arg1) && removal_modules_disjointwith.NIL != inference_trampolines.inference_applicable_sdctP(arg2) && removal_modules_disjointwith.NIL != sdc.isa_common_sdctP(arg1, arg2, (SubLObject)removal_modules_disjointwith.UNPROVIDED));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/modules/removal/removal-modules-disjointwith.lisp", position = 3224L)
    public static SubLObject removal_sibling_disjoint_check_expand(final SubLObject literal, SubLObject sense) {
        if (sense == removal_modules_disjointwith.UNPROVIDED) {
            sense = (SubLObject)removal_modules_disjointwith.NIL;
        }
        final SubLObject col1 = el_utilities.literal_arg1(literal, (SubLObject)removal_modules_disjointwith.UNPROVIDED);
        final SubLObject col2 = el_utilities.literal_arg2(literal, (SubLObject)removal_modules_disjointwith.UNPROVIDED);
        if (removal_modules_disjointwith.NIL != sdc.sdcP(col1, col2, (SubLObject)removal_modules_disjointwith.UNPROVIDED)) {
            final SubLObject hl_support_formula = backward_utilities.inference_make_commutative_literal(removal_modules_disjointwith.$const0$disjointWith, (SubLObject)ConsesLow.list(col1, col2));
            backward.removal_add_node(arguments.make_hl_support((SubLObject)removal_modules_disjointwith.$kw8$SIBLING_DISJOINT, hl_support_formula, (SubLObject)removal_modules_disjointwith.UNPROVIDED, (SubLObject)removal_modules_disjointwith.UNPROVIDED), (SubLObject)removal_modules_disjointwith.UNPROVIDED, (SubLObject)removal_modules_disjointwith.UNPROVIDED);
        }
        return (SubLObject)removal_modules_disjointwith.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/modules/removal/removal-modules-disjointwith.lisp", position = 4170L)
    public static SubLObject removal_max_disjointwith_cost(final SubLObject literal, SubLObject sense) {
        if (sense == removal_modules_disjointwith.UNPROVIDED) {
            sense = (SubLObject)removal_modules_disjointwith.NIL;
        }
        SubLObject v_term = el_utilities.literal_arg1(literal, (SubLObject)removal_modules_disjointwith.UNPROVIDED);
        SubLObject result = (SubLObject)removal_modules_disjointwith.NIL;
        if (removal_modules_disjointwith.NIL == forts.fort_p(v_term)) {
            v_term = el_utilities.literal_arg2(literal, (SubLObject)removal_modules_disjointwith.UNPROVIDED);
        }
        result = cardinality_estimates.genl_cardinality(v_term);
        if (result.isZero()) {
            result = Sequences.length(genls.all_genls(v_term, (SubLObject)removal_modules_disjointwith.UNPROVIDED, (SubLObject)removal_modules_disjointwith.UNPROVIDED));
        }
        return result;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/modules/removal/removal-modules-disjointwith.lisp", position = 4812L)
    public static SubLObject removal_max_disjointwith_expand(final SubLObject literal, SubLObject sense) {
        if (sense == removal_modules_disjointwith.UNPROVIDED) {
            sense = (SubLObject)removal_modules_disjointwith.NIL;
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject term1 = el_utilities.literal_arg1(literal, (SubLObject)removal_modules_disjointwith.UNPROVIDED);
        final SubLObject term2 = el_utilities.literal_arg2(literal, (SubLObject)removal_modules_disjointwith.UNPROVIDED);
        final SubLObject variable = (removal_modules_disjointwith.NIL != variables.variable_p(term1)) ? term1 : term2;
        final SubLObject fort = (removal_modules_disjointwith.NIL != forts.fort_p(term1)) ? term1 : term2;
        SubLObject cdolist_list_var;
        final SubLObject disjoint_terms = cdolist_list_var = disjoint_with.max_all_disjoint_with_no_sdc(fort, (SubLObject)removal_modules_disjointwith.UNPROVIDED, (SubLObject)removal_modules_disjointwith.UNPROVIDED);
        SubLObject disjoint_term = (SubLObject)removal_modules_disjointwith.NIL;
        disjoint_term = cdolist_list_var.first();
        while (removal_modules_disjointwith.NIL != cdolist_list_var) {
            thread.resetMultipleValues();
            final SubLObject v_bindings = unification_utilities.term_unify(variable, disjoint_term, (SubLObject)removal_modules_disjointwith.T, (SubLObject)removal_modules_disjointwith.T);
            final SubLObject unify_justification = thread.secondMultipleValue();
            thread.resetMultipleValues();
            final SubLObject subst_literal = bindings.subst_bindings(v_bindings, literal);
            final SubLObject hl_support_formula = backward_utilities.inference_make_commutative_literal(removal_modules_disjointwith.$const0$disjointWith, el_utilities.literal_args(subst_literal, (SubLObject)removal_modules_disjointwith.UNPROVIDED));
            backward.removal_add_node(arguments.make_hl_support((SubLObject)removal_modules_disjointwith.$kw5$DISJOINTWITH, hl_support_formula, (SubLObject)removal_modules_disjointwith.UNPROVIDED, (SubLObject)removal_modules_disjointwith.UNPROVIDED), v_bindings, unify_justification);
            cdolist_list_var = cdolist_list_var.rest();
            disjoint_term = cdolist_list_var.first();
        }
        return (SubLObject)removal_modules_disjointwith.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/modules/removal/removal-modules-disjointwith.lisp", position = 6246L)
    public static SubLObject removal_max_sibling_disjoint_required(final SubLObject literal, SubLObject sense) {
        if (sense == removal_modules_disjointwith.UNPROVIDED) {
            sense = (SubLObject)removal_modules_disjointwith.NIL;
        }
        final SubLObject arg1 = el_utilities.literal_arg1(literal, (SubLObject)removal_modules_disjointwith.UNPROVIDED);
        final SubLObject arg2 = el_utilities.literal_arg2(literal, (SubLObject)removal_modules_disjointwith.UNPROVIDED);
        return (SubLObject)SubLObjectFactory.makeBoolean((removal_modules_disjointwith.NIL != forts.fort_p(arg1) && removal_modules_disjointwith.NIL != inference_trampolines.inference_applicable_sdctP(arg1)) || (removal_modules_disjointwith.NIL != forts.fort_p(arg2) && removal_modules_disjointwith.NIL != inference_trampolines.inference_applicable_sdctP(arg2)));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/modules/removal/removal-modules-disjointwith.lisp", position = 6628L)
    public static SubLObject removal_max_sibling_disjoint_cost(final SubLObject literal, SubLObject sense) {
        if (sense == removal_modules_disjointwith.UNPROVIDED) {
            sense = (SubLObject)removal_modules_disjointwith.NIL;
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject disjoint_cost = removal_max_disjointwith_cost(literal, (SubLObject)removal_modules_disjointwith.UNPROVIDED);
        return Numbers.multiply(disjoint_cost, removal_modules_disjointwith.$default_max_sibling_disjoint_cost_factor$.getDynamicValue(thread));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/modules/removal/removal-modules-disjointwith.lisp", position = 7078L)
    public static SubLObject removal_max_sibling_disjoint_expand(final SubLObject literal, SubLObject sense) {
        if (sense == removal_modules_disjointwith.UNPROVIDED) {
            sense = (SubLObject)removal_modules_disjointwith.NIL;
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject term1 = el_utilities.literal_arg1(literal, (SubLObject)removal_modules_disjointwith.UNPROVIDED);
        final SubLObject term2 = el_utilities.literal_arg2(literal, (SubLObject)removal_modules_disjointwith.UNPROVIDED);
        final SubLObject variable = (removal_modules_disjointwith.NIL != variables.variable_p(term1)) ? term1 : term2;
        final SubLObject fort = (removal_modules_disjointwith.NIL != forts.fort_p(term1)) ? term1 : term2;
        SubLObject cdolist_list_var;
        final SubLObject disjoint_terms = cdolist_list_var = sdc.max_sdc(fort, (SubLObject)removal_modules_disjointwith.UNPROVIDED);
        SubLObject disjoint_term = (SubLObject)removal_modules_disjointwith.NIL;
        disjoint_term = cdolist_list_var.first();
        while (removal_modules_disjointwith.NIL != cdolist_list_var) {
            thread.resetMultipleValues();
            final SubLObject v_bindings = unification_utilities.term_unify(variable, disjoint_term, (SubLObject)removal_modules_disjointwith.T, (SubLObject)removal_modules_disjointwith.T);
            final SubLObject unify_justification = thread.secondMultipleValue();
            thread.resetMultipleValues();
            final SubLObject subst_literal = bindings.subst_bindings(v_bindings, literal);
            final SubLObject hl_support_formula = backward_utilities.inference_make_commutative_literal(removal_modules_disjointwith.$const0$disjointWith, el_utilities.literal_args(subst_literal, (SubLObject)removal_modules_disjointwith.UNPROVIDED));
            backward.removal_add_node(arguments.make_hl_support((SubLObject)removal_modules_disjointwith.$kw8$SIBLING_DISJOINT, hl_support_formula, (SubLObject)removal_modules_disjointwith.UNPROVIDED, (SubLObject)removal_modules_disjointwith.UNPROVIDED), v_bindings, unify_justification);
            cdolist_list_var = cdolist_list_var.rest();
            disjoint_term = cdolist_list_var.first();
        }
        return (SubLObject)removal_modules_disjointwith.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/modules/removal/removal-modules-disjointwith.lisp", position = 8428L)
    public static SubLObject removal_not_disjointwith_check_expand(final SubLObject literal, SubLObject sense) {
        if (sense == removal_modules_disjointwith.UNPROVIDED) {
            sense = (SubLObject)removal_modules_disjointwith.NIL;
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject current;
        final SubLObject datum = current = el_utilities.literal_args(literal, (SubLObject)removal_modules_disjointwith.UNPROVIDED);
        SubLObject col1 = (SubLObject)removal_modules_disjointwith.NIL;
        SubLObject col2 = (SubLObject)removal_modules_disjointwith.NIL;
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)removal_modules_disjointwith.$list16);
        col1 = current.first();
        current = current.rest();
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)removal_modules_disjointwith.$list16);
        col2 = current.first();
        current = current.rest();
        if (removal_modules_disjointwith.NIL == current) {
            if (removal_modules_disjointwith.NIL != control_vars.$negation_by_failure$.getDynamicValue(thread) && removal_modules_disjointwith.NIL == disjoint_with.disjoint_withP(col1, col2, (SubLObject)removal_modules_disjointwith.UNPROVIDED, (SubLObject)removal_modules_disjointwith.UNPROVIDED)) {
                final SubLObject hl_support_formula = backward_utilities.inference_make_commutative_literal(removal_modules_disjointwith.$const0$disjointWith, (SubLObject)ConsesLow.list(col1, col2));
                backward.removal_add_node(arguments.make_hl_support((SubLObject)removal_modules_disjointwith.$kw17$MINIMIZE, cycl_utilities.negate(hl_support_formula), (SubLObject)removal_modules_disjointwith.UNPROVIDED, (SubLObject)removal_modules_disjointwith.UNPROVIDED), (SubLObject)removal_modules_disjointwith.UNPROVIDED, (SubLObject)removal_modules_disjointwith.UNPROVIDED);
            }
            else if (removal_modules_disjointwith.NIL != disjoint_with.not_disjoint_withP(col1, col2, (SubLObject)removal_modules_disjointwith.UNPROVIDED, (SubLObject)removal_modules_disjointwith.UNPROVIDED)) {
                final SubLObject hl_support_formula = backward_utilities.inference_make_commutative_literal(removal_modules_disjointwith.$const0$disjointWith, (SubLObject)ConsesLow.list(col1, col2));
                backward.removal_add_node(arguments.make_hl_support((SubLObject)removal_modules_disjointwith.$kw5$DISJOINTWITH, cycl_utilities.negate(hl_support_formula), (SubLObject)removal_modules_disjointwith.UNPROVIDED, (SubLObject)removal_modules_disjointwith.UNPROVIDED), (SubLObject)removal_modules_disjointwith.UNPROVIDED, (SubLObject)removal_modules_disjointwith.UNPROVIDED);
            }
        }
        else {
            cdestructuring_bind.cdestructuring_bind_error(datum, (SubLObject)removal_modules_disjointwith.$list16);
        }
        return (SubLObject)removal_modules_disjointwith.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/modules/removal/removal-modules-disjointwith.lisp", position = 10997L)
    public static SubLObject removal_instances_of_disjoint_collections_expand(final SubLObject asent, SubLObject sense) {
        if (sense == removal_modules_disjointwith.UNPROVIDED) {
            sense = (SubLObject)removal_modules_disjointwith.NIL;
        }
        final SubLObject inst1 = cycl_utilities.atomic_sentence_arg1(asent, (SubLObject)removal_modules_disjointwith.UNPROVIDED);
        final SubLObject inst2 = cycl_utilities.atomic_sentence_arg2(asent, (SubLObject)removal_modules_disjointwith.UNPROVIDED);
        if (inst1.eql(inst2)) {
            return (SubLObject)removal_modules_disjointwith.NIL;
        }
        if (removal_modules_disjointwith.NIL != disjoint_with.instances_of_disjoint_collectionsP(inst1, inst2, (SubLObject)removal_modules_disjointwith.UNPROVIDED, (SubLObject)removal_modules_disjointwith.UNPROVIDED)) {
            backward.removal_add_node(arguments.make_hl_support((SubLObject)removal_modules_disjointwith.$kw5$DISJOINTWITH, asent, (SubLObject)removal_modules_disjointwith.UNPROVIDED, (SubLObject)removal_modules_disjointwith.UNPROVIDED), (SubLObject)removal_modules_disjointwith.UNPROVIDED, (SubLObject)removal_modules_disjointwith.UNPROVIDED);
        }
        return (SubLObject)removal_modules_disjointwith.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/modules/removal/removal-modules-disjointwith.lisp", position = 13907L)
    public static SubLObject removal_maximal_consistent_subsets_unify_cost(final SubLObject asent, SubLObject sense) {
        if (sense == removal_modules_disjointwith.UNPROVIDED) {
            sense = (SubLObject)removal_modules_disjointwith.NIL;
        }
        final SubLObject v_set = el_utilities.el_extensional_set_elements(cycl_utilities.atomic_sentence_arg1(asent, (SubLObject)removal_modules_disjointwith.UNPROVIDED));
        return Sequences.length(v_set);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/modules/removal/removal-modules-disjointwith.lisp", position = 14119L)
    public static SubLObject removal_maximal_consistent_subsets_unify_output_generate(final SubLObject v_set) {
        final SubLObject cols = el_utilities.el_extensional_set_elements(v_set);
        final SubLObject subsets = disjoint_with.maximal_consistent_subsets(cols);
        return Mapping.mapcar((SubLObject)removal_modules_disjointwith.$sym29$CANONICALIZE_TERM, Mapping.mapcar((SubLObject)removal_modules_disjointwith.$sym30$MAKE_EL_SET, subsets));
    }
    
    public static SubLObject declare_removal_modules_disjointwith_file() {
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.modules.removal.removal_modules_disjointwith", "removal_disjointwith_check_expand", "REMOVAL-DISJOINTWITH-CHECK-EXPAND", 1, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.modules.removal.removal_modules_disjointwith", "removal_sibling_disjoint_check_required", "REMOVAL-SIBLING-DISJOINT-CHECK-REQUIRED", 1, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.modules.removal.removal_modules_disjointwith", "removal_sibling_disjoint_check_expand", "REMOVAL-SIBLING-DISJOINT-CHECK-EXPAND", 1, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.modules.removal.removal_modules_disjointwith", "removal_max_disjointwith_cost", "REMOVAL-MAX-DISJOINTWITH-COST", 1, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.modules.removal.removal_modules_disjointwith", "removal_max_disjointwith_expand", "REMOVAL-MAX-DISJOINTWITH-EXPAND", 1, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.modules.removal.removal_modules_disjointwith", "removal_max_sibling_disjoint_required", "REMOVAL-MAX-SIBLING-DISJOINT-REQUIRED", 1, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.modules.removal.removal_modules_disjointwith", "removal_max_sibling_disjoint_cost", "REMOVAL-MAX-SIBLING-DISJOINT-COST", 1, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.modules.removal.removal_modules_disjointwith", "removal_max_sibling_disjoint_expand", "REMOVAL-MAX-SIBLING-DISJOINT-EXPAND", 1, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.modules.removal.removal_modules_disjointwith", "removal_not_disjointwith_check_expand", "REMOVAL-NOT-DISJOINTWITH-CHECK-EXPAND", 1, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.modules.removal.removal_modules_disjointwith", "removal_instances_of_disjoint_collections_expand", "REMOVAL-INSTANCES-OF-DISJOINT-COLLECTIONS-EXPAND", 1, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.modules.removal.removal_modules_disjointwith", "removal_maximal_consistent_subsets_unify_cost", "REMOVAL-MAXIMAL-CONSISTENT-SUBSETS-UNIFY-COST", 1, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.modules.removal.removal_modules_disjointwith", "removal_maximal_consistent_subsets_unify_output_generate", "REMOVAL-MAXIMAL-CONSISTENT-SUBSETS-UNIFY-OUTPUT-GENERATE", 1, 0, false);
        return (SubLObject)removal_modules_disjointwith.NIL;
    }
    
    public static SubLObject init_removal_modules_disjointwith_file() {
        removal_modules_disjointwith.$default_disjointwith_check_cost$ = SubLFiles.defparameter("*DEFAULT-DISJOINTWITH-CHECK-COST*", (SubLObject)removal_modules_disjointwith.TWO_INTEGER);
        removal_modules_disjointwith.$default_sibling_disjoint_cost_factor$ = SubLFiles.defparameter("*DEFAULT-SIBLING-DISJOINT-COST-FACTOR*", (SubLObject)removal_modules_disjointwith.TWO_INTEGER);
        removal_modules_disjointwith.$default_max_sibling_disjoint_cost_factor$ = SubLFiles.defparameter("*DEFAULT-MAX-SIBLING-DISJOINT-COST-FACTOR*", (SubLObject)removal_modules_disjointwith.$int13$100);
        removal_modules_disjointwith.$default_not_disjointwith_check_cost$ = SubLFiles.defparameter("*DEFAULT-NOT-DISJOINTWITH-CHECK-COST*", (SubLObject)removal_modules_disjointwith.FOUR_INTEGER);
        removal_modules_disjointwith.$default_instancesofdisjointcollections_check_cost$ = SubLFiles.defparameter("*DEFAULT-INSTANCESOFDISJOINTCOLLECTIONS-CHECK-COST*", removal_modules_disjointwith.$default_disjointwith_check_cost$.getDynamicValue());
        return (SubLObject)removal_modules_disjointwith.NIL;
    }
    
    public static SubLObject setup_removal_modules_disjointwith_file() {
        inference_modules.register_solely_specific_removal_module_predicate(removal_modules_disjointwith.$const0$disjointWith);
        preference_modules.doomed_unless_either_arg_bindable((SubLObject)removal_modules_disjointwith.$kw1$POS, removal_modules_disjointwith.$const0$disjointWith);
        preference_modules.doomed_unless_all_args_bindable((SubLObject)removal_modules_disjointwith.$kw2$NEG, removal_modules_disjointwith.$const0$disjointWith);
        preference_modules.inference_preference_module((SubLObject)removal_modules_disjointwith.$kw3$MAX_DISJOINT_WITH_POS, (SubLObject)removal_modules_disjointwith.$list4);
        inference_modules.inference_removal_module((SubLObject)removal_modules_disjointwith.$kw6$REMOVAL_DISJOINTWITH_CHECK, (SubLObject)removal_modules_disjointwith.$list7);
        inference_modules.inference_removal_module((SubLObject)removal_modules_disjointwith.$kw9$REMOVAL_SIBLING_DISJOINT_CHECK, (SubLObject)removal_modules_disjointwith.$list10);
        inference_modules.inference_removal_module((SubLObject)removal_modules_disjointwith.$kw11$REMOVAL_MAX_DISJOINTWITH, (SubLObject)removal_modules_disjointwith.$list12);
        inference_modules.inference_removal_module((SubLObject)removal_modules_disjointwith.$kw14$REMOVAL_MAX_SIBLING_DISJOINT, (SubLObject)removal_modules_disjointwith.$list15);
        inference_modules.inference_removal_module((SubLObject)removal_modules_disjointwith.$kw18$REMOVAL_NOT_DISJOINTWITH_CHECK, (SubLObject)removal_modules_disjointwith.$list19);
        inference_modules.register_solely_specific_removal_module_predicate(removal_modules_disjointwith.$const20$instancesOfDisjointCollections);
        preference_modules.doomed_unless_all_args_bindable((SubLObject)removal_modules_disjointwith.$kw1$POS, removal_modules_disjointwith.$const20$instancesOfDisjointCollections);
        inference_modules.inference_removal_module((SubLObject)removal_modules_disjointwith.$kw21$REMOVAL_INSTANCES_OF_DISJOINT_COLLECTIONS, (SubLObject)removal_modules_disjointwith.$list22);
        inference_modules.register_solely_specific_removal_module_predicate(removal_modules_disjointwith.$const23$maximalConsistentSubsets);
        preference_modules.doomed_unless_arg_bindable((SubLObject)removal_modules_disjointwith.$kw1$POS, removal_modules_disjointwith.$const23$maximalConsistentSubsets, (SubLObject)removal_modules_disjointwith.ONE_INTEGER);
        inference_modules.inference_removal_module((SubLObject)removal_modules_disjointwith.$kw24$REMOVAL_MAXIMAL_CONSISTENT_SUBSETS_CHECK, (SubLObject)removal_modules_disjointwith.$list25);
        inference_modules.inference_removal_module((SubLObject)removal_modules_disjointwith.$kw26$REMOVAL_MAXIMAL_CONSISTENT_SUBSETS_UNIFY, (SubLObject)removal_modules_disjointwith.$list27);
        utilities_macros.note_funcall_helper_function((SubLObject)removal_modules_disjointwith.$sym28$REMOVAL_MAXIMAL_CONSISTENT_SUBSETS_UNIFY_COST);
        utilities_macros.note_funcall_helper_function((SubLObject)removal_modules_disjointwith.$sym31$REMOVAL_MAXIMAL_CONSISTENT_SUBSETS_UNIFY_OUTPUT_GENERATE);
        return (SubLObject)removal_modules_disjointwith.NIL;
    }
    
    @Override
	public void declareFunctions() {
        declare_removal_modules_disjointwith_file();
    }
    
    @Override
	public void initializeVariables() {
        init_removal_modules_disjointwith_file();
    }
    
    @Override
	public void runTopLevelForms() {
        setup_removal_modules_disjointwith_file();
    }
    
    static {
        me = (SubLFile)new removal_modules_disjointwith();
        removal_modules_disjointwith.$default_disjointwith_check_cost$ = null;
        removal_modules_disjointwith.$default_sibling_disjoint_cost_factor$ = null;
        removal_modules_disjointwith.$default_max_sibling_disjoint_cost_factor$ = null;
        removal_modules_disjointwith.$default_not_disjointwith_check_cost$ = null;
        removal_modules_disjointwith.$default_instancesofdisjointcollections_check_cost$ = null;
        $const0$disjointWith = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("disjointWith"));
        $kw1$POS = SubLObjectFactory.makeKeyword("POS");
        $kw2$NEG = SubLObjectFactory.makeKeyword("NEG");
        $kw3$MAX_DISJOINT_WITH_POS = SubLObjectFactory.makeKeyword("MAX-DISJOINT-WITH-POS");
        $list4 = ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("SENSE"), (SubLObject)SubLObjectFactory.makeKeyword("POS"), (SubLObject)SubLObjectFactory.makeKeyword("PREDICATE"), constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("disjointWith")), (SubLObject)SubLObjectFactory.makeKeyword("REQUIRED-PATTERN"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("OR"), (SubLObject)ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("disjointWith")), (SubLObject)SubLObjectFactory.makeKeyword("NOT-FULLY-BOUND"), (SubLObject)SubLObjectFactory.makeKeyword("FULLY-BOUND")), (SubLObject)ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("disjointWith")), (SubLObject)SubLObjectFactory.makeKeyword("FULLY-BOUND"), (SubLObject)SubLObjectFactory.makeKeyword("NOT-FULLY-BOUND"))), (SubLObject)SubLObjectFactory.makeKeyword("PREFERENCE-LEVEL"), (SubLObject)SubLObjectFactory.makeKeyword("GROSSLY-DISPREFERRED"));
        $kw5$DISJOINTWITH = SubLObjectFactory.makeKeyword("DISJOINTWITH");
        $kw6$REMOVAL_DISJOINTWITH_CHECK = SubLObjectFactory.makeKeyword("REMOVAL-DISJOINTWITH-CHECK");
        $list7 = ConsesLow.list(new SubLObject[] { SubLObjectFactory.makeKeyword("SENSE"), SubLObjectFactory.makeKeyword("POS"), SubLObjectFactory.makeKeyword("PREDICATE"), constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("disjointWith")), SubLObjectFactory.makeKeyword("REQUIRED-PATTERN"), ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("disjointWith")), (SubLObject)SubLObjectFactory.makeKeyword("FORT"), (SubLObject)SubLObjectFactory.makeKeyword("FORT")), SubLObjectFactory.makeKeyword("COST-EXPRESSION"), SubLObjectFactory.makeSymbol("*DEFAULT-DISJOINTWITH-CHECK-COST*"), SubLObjectFactory.makeKeyword("EXPAND"), SubLObjectFactory.makeSymbol("REMOVAL-DISJOINTWITH-CHECK-EXPAND") });
        $kw8$SIBLING_DISJOINT = SubLObjectFactory.makeKeyword("SIBLING-DISJOINT");
        $kw9$REMOVAL_SIBLING_DISJOINT_CHECK = SubLObjectFactory.makeKeyword("REMOVAL-SIBLING-DISJOINT-CHECK");
        $list10 = ConsesLow.list(new SubLObject[] { SubLObjectFactory.makeKeyword("SENSE"), SubLObjectFactory.makeKeyword("POS"), SubLObjectFactory.makeKeyword("PREDICATE"), constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("disjointWith")), SubLObjectFactory.makeKeyword("REQUIRED-PATTERN"), ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("disjointWith")), (SubLObject)SubLObjectFactory.makeKeyword("FORT"), (SubLObject)SubLObjectFactory.makeKeyword("FORT")), SubLObjectFactory.makeKeyword("REQUIRED"), SubLObjectFactory.makeSymbol("REMOVAL-SIBLING-DISJOINT-CHECK-REQUIRED"), SubLObjectFactory.makeKeyword("COST-EXPRESSION"), ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("*"), (SubLObject)SubLObjectFactory.makeSymbol("*DEFAULT-DISJOINTWITH-CHECK-COST*"), (SubLObject)SubLObjectFactory.makeSymbol("*DEFAULT-SIBLING-DISJOINT-COST-FACTOR*")), SubLObjectFactory.makeKeyword("EXPAND"), SubLObjectFactory.makeSymbol("REMOVAL-SIBLING-DISJOINT-CHECK-EXPAND") });
        $kw11$REMOVAL_MAX_DISJOINTWITH = SubLObjectFactory.makeKeyword("REMOVAL-MAX-DISJOINTWITH");
        $list12 = ConsesLow.list(new SubLObject[] { SubLObjectFactory.makeKeyword("SENSE"), SubLObjectFactory.makeKeyword("POS"), SubLObjectFactory.makeKeyword("PREDICATE"), constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("disjointWith")), SubLObjectFactory.makeKeyword("REQUIRED-PATTERN"), ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("OR"), (SubLObject)ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("disjointWith")), (SubLObject)SubLObjectFactory.makeKeyword("FORT"), (SubLObject)SubLObjectFactory.makeKeyword("VARIABLE")), (SubLObject)ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("disjointWith")), (SubLObject)SubLObjectFactory.makeKeyword("VARIABLE"), (SubLObject)SubLObjectFactory.makeKeyword("FORT"))), SubLObjectFactory.makeKeyword("COST"), SubLObjectFactory.makeSymbol("REMOVAL-MAX-DISJOINTWITH-COST"), SubLObjectFactory.makeKeyword("COMPLETENESS"), SubLObjectFactory.makeKeyword("GROSSLY-INCOMPLETE"), SubLObjectFactory.makeKeyword("EXPAND"), SubLObjectFactory.makeSymbol("REMOVAL-MAX-DISJOINTWITH-EXPAND") });
        $int13$100 = SubLObjectFactory.makeInteger(100);
        $kw14$REMOVAL_MAX_SIBLING_DISJOINT = SubLObjectFactory.makeKeyword("REMOVAL-MAX-SIBLING-DISJOINT");
        $list15 = ConsesLow.list(new SubLObject[] { SubLObjectFactory.makeKeyword("SENSE"), SubLObjectFactory.makeKeyword("POS"), SubLObjectFactory.makeKeyword("PREDICATE"), constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("disjointWith")), SubLObjectFactory.makeKeyword("REQUIRED-PATTERN"), ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("OR"), (SubLObject)ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("disjointWith")), (SubLObject)SubLObjectFactory.makeKeyword("FORT"), (SubLObject)SubLObjectFactory.makeKeyword("VARIABLE")), (SubLObject)ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("disjointWith")), (SubLObject)SubLObjectFactory.makeKeyword("VARIABLE"), (SubLObject)SubLObjectFactory.makeKeyword("FORT"))), SubLObjectFactory.makeKeyword("REQUIRED"), SubLObjectFactory.makeSymbol("REMOVAL-MAX-SIBLING-DISJOINT-REQUIRED"), SubLObjectFactory.makeKeyword("COST"), SubLObjectFactory.makeSymbol("REMOVAL-MAX-SIBLING-DISJOINT-COST"), SubLObjectFactory.makeKeyword("COMPLETENESS"), SubLObjectFactory.makeKeyword("GROSSLY-INCOMPLETE"), SubLObjectFactory.makeKeyword("EXPAND"), SubLObjectFactory.makeSymbol("REMOVAL-MAX-SIBLING-DISJOINT-EXPAND") });
        $list16 = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("COL1"), (SubLObject)SubLObjectFactory.makeSymbol("COL2"));
        $kw17$MINIMIZE = SubLObjectFactory.makeKeyword("MINIMIZE");
        $kw18$REMOVAL_NOT_DISJOINTWITH_CHECK = SubLObjectFactory.makeKeyword("REMOVAL-NOT-DISJOINTWITH-CHECK");
        $list19 = ConsesLow.list(new SubLObject[] { SubLObjectFactory.makeKeyword("SENSE"), SubLObjectFactory.makeKeyword("NEG"), SubLObjectFactory.makeKeyword("PREDICATE"), constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("disjointWith")), SubLObjectFactory.makeKeyword("REQUIRED-PATTERN"), ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("disjointWith")), (SubLObject)SubLObjectFactory.makeKeyword("FORT"), (SubLObject)SubLObjectFactory.makeKeyword("FORT")), SubLObjectFactory.makeKeyword("COST-EXPRESSION"), SubLObjectFactory.makeSymbol("*DEFAULT-NOT-DISJOINTWITH-CHECK-COST*"), SubLObjectFactory.makeKeyword("EXPAND"), SubLObjectFactory.makeSymbol("REMOVAL-NOT-DISJOINTWITH-CHECK-EXPAND") });
        $const20$instancesOfDisjointCollections = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("instancesOfDisjointCollections"));
        $kw21$REMOVAL_INSTANCES_OF_DISJOINT_COLLECTIONS = SubLObjectFactory.makeKeyword("REMOVAL-INSTANCES-OF-DISJOINT-COLLECTIONS");
        $list22 = ConsesLow.list(new SubLObject[] { SubLObjectFactory.makeKeyword("SENSE"), SubLObjectFactory.makeKeyword("POS"), SubLObjectFactory.makeKeyword("PREDICATE"), constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("instancesOfDisjointCollections")), SubLObjectFactory.makeKeyword("REQUIRED-PATTERN"), ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("instancesOfDisjointCollections")), (SubLObject)SubLObjectFactory.makeKeyword("FULLY-BOUND"), (SubLObject)SubLObjectFactory.makeKeyword("FULLY-BOUND")), SubLObjectFactory.makeKeyword("COST-EXPRESSION"), SubLObjectFactory.makeSymbol("*DEFAULT-INSTANCESOFDISJOINTCOLLECTIONS-CHECK-COST*"), SubLObjectFactory.makeKeyword("EXPAND"), SubLObjectFactory.makeSymbol("REMOVAL-INSTANCES-OF-DISJOINT-COLLECTIONS-EXPAND"), SubLObjectFactory.makeKeyword("DOCUMENTATION"), SubLObjectFactory.makeString("(#$instancesOfDisjointCollections <fully-bound> <fully-bound>)"), SubLObjectFactory.makeKeyword("EXAMPLE"), SubLObjectFactory.makeString("(#$instancesOfDisjointCollections #$AbrahamLincoln #$CityOfAustinTX)\n    (#$instancesOfDisjointCollections (#$SomeFn #$Cat) (#$SomeFn #$Dog))") });
        $const23$maximalConsistentSubsets = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("maximalConsistentSubsets"));
        $kw24$REMOVAL_MAXIMAL_CONSISTENT_SUBSETS_CHECK = SubLObjectFactory.makeKeyword("REMOVAL-MAXIMAL-CONSISTENT-SUBSETS-CHECK");
        $list25 = ConsesLow.list(new SubLObject[] { SubLObjectFactory.makeKeyword("SENSE"), SubLObjectFactory.makeKeyword("POS"), SubLObjectFactory.makeKeyword("PREDICATE"), constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("maximalConsistentSubsets")), SubLObjectFactory.makeKeyword("REQUIRED-PATTERN"), ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("maximalConsistentSubsets")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("AND"), (SubLObject)SubLObjectFactory.makeKeyword("FULLY-BOUND"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("TEST"), (SubLObject)SubLObjectFactory.makeSymbol("EL-EXTENSIONAL-SET-P"))), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("AND"), (SubLObject)SubLObjectFactory.makeKeyword("FULLY-BOUND"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("TEST"), (SubLObject)SubLObjectFactory.makeSymbol("EL-EXTENSIONAL-SET-P")))), SubLObjectFactory.makeKeyword("COST-EXPRESSION"), SubLObjectFactory.makeSymbol("*EXPENSIVE-HL-MODULE-CHECK-COST*"), SubLObjectFactory.makeKeyword("INPUT-EXTRACT-PATTERN"), ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("TEMPLATE"), (SubLObject)ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("maximalConsistentSubsets")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("BIND"), (SubLObject)SubLObjectFactory.makeSymbol("SET")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("BIND"), (SubLObject)SubLObjectFactory.makeSymbol("SUBSET"))), (SubLObject)ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("VALUE"), (SubLObject)SubLObjectFactory.makeSymbol("SET")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("VALUE"), (SubLObject)SubLObjectFactory.makeSymbol("SUBSET")))), SubLObjectFactory.makeKeyword("OUTPUT-CHECK-PATTERN"), ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("TUPLE"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("SET"), (SubLObject)SubLObjectFactory.makeSymbol("SUBSET")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("CALL"), (SubLObject)SubLObjectFactory.makeSymbol("MAXIMAL-CONSISTENT-SUBSET?"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("CALL"), (SubLObject)SubLObjectFactory.makeSymbol("EL-EXTENSIONAL-SET-ELEMENTS"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("VALUE"), (SubLObject)SubLObjectFactory.makeSymbol("SET"))), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("CALL"), (SubLObject)SubLObjectFactory.makeSymbol("EL-EXTENSIONAL-SET-ELEMENTS"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("VALUE"), (SubLObject)SubLObjectFactory.makeSymbol("SUBSET"))))), SubLObjectFactory.makeKeyword("SUPPORT-MODULE"), SubLObjectFactory.makeKeyword("CODE"), SubLObjectFactory.makeKeyword("DOCUMENTATION"), SubLObjectFactory.makeString("(#$maximalConsistentSubsets <set-of-collections> <set-of-collections>)"), SubLObjectFactory.makeKeyword("EXAMPLE"), SubLObjectFactory.makeString("(#$maximalConsistentSubsets (#$TheSet #$Animal #$MaleAnimal #$FemaleAnimal) (#$TheSet #$Animal #$MaleAnimal))") });
        $kw26$REMOVAL_MAXIMAL_CONSISTENT_SUBSETS_UNIFY = SubLObjectFactory.makeKeyword("REMOVAL-MAXIMAL-CONSISTENT-SUBSETS-UNIFY");
        $list27 = ConsesLow.list(new SubLObject[] { SubLObjectFactory.makeKeyword("SENSE"), SubLObjectFactory.makeKeyword("POS"), SubLObjectFactory.makeKeyword("PREDICATE"), constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("maximalConsistentSubsets")), SubLObjectFactory.makeKeyword("REQUIRED-PATTERN"), ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("maximalConsistentSubsets")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("AND"), (SubLObject)SubLObjectFactory.makeKeyword("FULLY-BOUND"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("TEST"), (SubLObject)SubLObjectFactory.makeSymbol("EL-EXTENSIONAL-SET-P"))), (SubLObject)SubLObjectFactory.makeKeyword("NOT-FULLY-BOUND")), SubLObjectFactory.makeKeyword("COST"), SubLObjectFactory.makeSymbol("REMOVAL-MAXIMAL-CONSISTENT-SUBSETS-UNIFY-COST"), SubLObjectFactory.makeKeyword("INPUT-EXTRACT-PATTERN"), ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("TEMPLATE"), (SubLObject)ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("maximalConsistentSubsets")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("BIND"), (SubLObject)SubLObjectFactory.makeSymbol("SET")), (SubLObject)SubLObjectFactory.makeKeyword("ANYTHING")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("VALUE"), (SubLObject)SubLObjectFactory.makeSymbol("SET"))), SubLObjectFactory.makeKeyword("OUTPUT-GENERATE-PATTERN"), ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("CALL"), (SubLObject)SubLObjectFactory.makeSymbol("REMOVAL-MAXIMAL-CONSISTENT-SUBSETS-UNIFY-OUTPUT-GENERATE"), (SubLObject)SubLObjectFactory.makeKeyword("INPUT")), SubLObjectFactory.makeKeyword("OUTPUT-CONSTRUCT-PATTERN"), ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("maximalConsistentSubsets")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("VALUE"), (SubLObject)SubLObjectFactory.makeSymbol("SET")), (SubLObject)SubLObjectFactory.makeKeyword("INPUT")), SubLObjectFactory.makeKeyword("SUPPORT-MODULE"), SubLObjectFactory.makeKeyword("CODE"), SubLObjectFactory.makeKeyword("DOCUMENTATION"), SubLObjectFactory.makeString("(#$maximalConsistentSubsets <set-of-collections> <not-fully-bound>)"), SubLObjectFactory.makeKeyword("EXAMPLE"), SubLObjectFactory.makeString("(#$maximalConsistentSubsets (#$TheSet #$Animal #$MaleAnimal #$FemaleAnimal) ?WHAT)") });
        $sym28$REMOVAL_MAXIMAL_CONSISTENT_SUBSETS_UNIFY_COST = SubLObjectFactory.makeSymbol("REMOVAL-MAXIMAL-CONSISTENT-SUBSETS-UNIFY-COST");
        $sym29$CANONICALIZE_TERM = SubLObjectFactory.makeSymbol("CANONICALIZE-TERM");
        $sym30$MAKE_EL_SET = SubLObjectFactory.makeSymbol("MAKE-EL-SET");
        $sym31$REMOVAL_MAXIMAL_CONSISTENT_SUBSETS_UNIFY_OUTPUT_GENERATE = SubLObjectFactory.makeSymbol("REMOVAL-MAXIMAL-CONSISTENT-SUBSETS-UNIFY-OUTPUT-GENERATE");
    }
}

/*

	Total time: 132 ms
	
*/