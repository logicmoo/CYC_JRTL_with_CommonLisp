package com.cyc.cycjava.cycl.inference.modules.removal;

import com.cyc.cycjava.cycl.constant_handles;
import com.cyc.cycjava.cycl.inference.modules.preference_modules;
import com.cyc.cycjava.cycl.inference.harness.inference_modules;
import com.cyc.tool.subl.util.SubLFiles;
import com.cyc.cycjava.cycl.kb_utilities;
import com.cyc.cycjava.cycl.genl_predicates;
import com.cyc.cycjava.cycl.variables;
import com.cyc.cycjava.cycl.fort_types_interface;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Hashtables;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Vectors;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Types;
import com.cyc.cycjava.cycl.id_index;
import com.cyc.cycjava.cycl.assertion_handles;
import com.cyc.cycjava.cycl.kb_indexing;
import com.cyc.cycjava.cycl.hlmt;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Sequences;
import com.cyc.cycjava.cycl.forts;
import com.cyc.cycjava.cycl.virtual_indexing;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Time;
import com.cyc.cycjava.cycl.utilities_macros;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Threads;
import com.cyc.cycjava.cycl.backward_utilities;
import com.cyc.cycjava.cycl.enumeration_types;
import com.cyc.cycjava.cycl.iteration;
import com.cyc.cycjava.cycl.kb_mapping_macros;
import com.cyc.cycjava.cycl.uncanonicalizer;
import com.cyc.cycjava.cycl.assertions_high;
import com.cyc.cycjava.cycl.list_utilities;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.conses_high;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Symbols;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Numbers;
import com.cyc.cycjava.cycl.unification_utilities;
import com.cyc.cycjava.cycl.bindings;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.SubLThread;
import com.cyc.cycjava.cycl.inference.harness.inference_utilities;
import com.cyc.cycjava.cycl.mt_relevance_macros;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLProcess;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory;
import com.cyc.cycjava.cycl.inference.inference_trampolines;
import com.cyc.cycjava.cycl.backward;
import com.cyc.cycjava.cycl.cycl_utilities;
import com.cyc.cycjava.cycl.arguments;
import com.cyc.cycjava.cycl.mt_vars;
import com.cyc.cycjava.cycl.el_utilities;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Values;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.cdestructuring_bind;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLString;
import com.cyc.tool.subl.jrtl.nativeCode.type.number.SubLFloat;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLList;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObject;
import com.cyc.tool.subl.jrtl.nativeCode.type.symbol.SubLSymbol;
import com.cyc.tool.subl.util.SubLFile;
import com.cyc.tool.subl.util.SubLTranslatedFile;

public final class removal_modules_ist extends SubLTranslatedFile
{
    public static final SubLFile me;
    public static final String myName = "com.cyc.cycjava.cycl.inference.modules.removal.removal_modules_ist";
    public static final String myFingerPrint = "d3c43d39b7048bc7a7a66ffd63d9c37df6c08db240607eeffd14127ce2473fb9";
    @SubLTranslatedFile.SubL(source = "cycl/inference/modules/removal/removal-modules-ist.lisp", position = 1681L)
    private static SubLSymbol $default_ist_formula_check_cost$;
    @SubLTranslatedFile.SubL(source = "cycl/inference/modules/removal/removal-modules-ist.lisp", position = 7708L)
    private static SubLSymbol $estimated_mts_per_formula$;
    @SubLTranslatedFile.SubL(source = "cycl/inference/modules/removal/removal-modules-ist.lisp", position = 7954L)
    private static SubLSymbol $default_ist_pos_gaf_mt_lookup_cost$;
    private static final SubLObject $const0$ist;
    private static final SubLSymbol $kw1$IST_MT_PROP_POS;
    private static final SubLList $list2;
    private static final SubLSymbol $kw3$IST_IN_WHAT_MTS_POS;
    private static final SubLList $list4;
    private static final SubLList $list5;
    private static final SubLSymbol $kw6$QUERY;
    private static final SubLFloat $float7$1_5;
    private static final SubLSymbol $kw8$REMOVAL_IST_FORMULA_CHECK;
    private static final SubLList $list9;
    private static final SubLSymbol $kw10$POS;
    private static final SubLSymbol $kw11$REMOVAL_IST_POS_GAF;
    private static final SubLList $list12;
    private static final SubLSymbol $kw13$REMOVAL_IST_PRED_UNBOUND_POS_GAF;
    private static final SubLList $list14;
    private static final SubLSymbol $kw15$TRUE;
    private static final SubLSymbol $kw16$NEG;
    private static final SubLSymbol $kw17$REMOVAL_IST_NEG_GAF;
    private static final SubLList $list18;
    private static final SubLSymbol $kw19$FALSE;
    private static final SubLList $list20;
    private static final SubLSymbol $kw21$REMOVAL_IST_POS_GAF_MT_LOOKUP;
    private static final SubLList $list22;
    private static final SubLSymbol $sym23$RELEVANT_MT_IS_EVERYTHING;
    private static final SubLObject $const24$EverythingPSC;
    private static final SubLObject $const25$InferencePSC;
    private static final SubLSymbol $kw26$REMOVAL_IST_UNBOUND_MT_GAF_LOOKUP_POS;
    private static final SubLList $list27;
    private static final SubLObject $const28$ist_Asserted;
    private static final SubLSymbol $sym29$RELEVANT_MT_IS_EQ;
    private static final SubLSymbol $kw30$GAF_ARG;
    private static final SubLSymbol $kw31$GAF;
    private static final SubLSymbol $kw32$PREDICATE_EXTENT;
    private static final SubLSymbol $kw33$OVERLAP;
    private static final SubLSymbol $sym34$HL_VAR_;
    private static final SubLObject $const35$not;
    private static final SubLSymbol $kw36$REMOVAL_IST_ASSERTED_GAF_LOOKUP_POS;
    private static final SubLList $list37;
    private static final SubLSymbol $sym38$FORT_P;
    private static final SubLSymbol $kw39$REMOVAL_IST_ASSERTED_UNBOUND_LOOKUP_POS;
    private static final SubLList $list40;
    private static final SubLSymbol $kw41$MT;
    private static final SubLSymbol $kw42$BROAD_MT;
    private static final SubLString $str43$do_broad_mt_index;
    private static final SubLSymbol $sym44$STRINGP;
    private static final SubLSymbol $kw45$SKIP;
    private static final SubLSymbol $kw46$REMOVAL_IST_ASSERTED_MT_CONTENTS;
    private static final SubLList $list47;
    private static final SubLSymbol $kw48$MINIMIZE;
    private static final SubLSymbol $kw49$REMOVAL_IST_ASSERTED_GAF_LOOKUP_NEG;
    private static final SubLList $list50;
    private static final SubLSymbol $kw51$REMOVAL_IST_ASSERTED_UNBOUND_MT_GAF_LOOKUP_POS;
    private static final SubLList $list52;
    private static final SubLSymbol $kw53$REMOVAL_IST_ASSERTED_UNBOUND_MT_UNBOUND_PRED_LOOKUP_POS;
    private static final SubLList $list54;
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/modules/removal/removal-modules-ist.lisp", position = 1143L)
    public static SubLObject make_ist_supports(final SubLObject mt, final SubLObject sentence) {
        SubLObject current;
        final SubLObject datum = current = make_ist_justification(mt, sentence);
        SubLObject support = (SubLObject)removal_modules_ist.NIL;
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)removal_modules_ist.$list5);
        support = current.first();
        final SubLObject more_supports;
        current = (more_supports = current.rest());
        return Values.values(support, more_supports);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/modules/removal/removal-modules-ist.lisp", position = 1331L)
    public static SubLObject make_ist_justification(final SubLObject mt, final SubLObject sentence) {
        return (SubLObject)ConsesLow.list(make_ist_support(mt, sentence));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/modules/removal/removal-modules-ist.lisp", position = 1431L)
    public static SubLObject make_ist_support(final SubLObject mt, final SubLObject sentence) {
        final SubLObject ist_sentence = el_utilities.make_binary_formula(removal_modules_ist.$const0$ist, mt, sentence);
        return arguments.make_hl_support((SubLObject)removal_modules_ist.$kw6$QUERY, ist_sentence, mt_vars.$ist_mt$.getGlobalValue(), (SubLObject)removal_modules_ist.UNPROVIDED);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/modules/removal/removal-modules-ist.lisp", position = 1886L)
    public static SubLObject removal_ist_formula_check_expand(final SubLObject asent, SubLObject sense) {
        if (sense == removal_modules_ist.UNPROVIDED) {
            sense = (SubLObject)removal_modules_ist.NIL;
        }
        final SubLObject mt = cycl_utilities.atomic_sentence_arg1(asent, (SubLObject)removal_modules_ist.UNPROVIDED);
        final SubLObject sentence = cycl_utilities.atomic_sentence_arg2(asent, (SubLObject)removal_modules_ist.UNPROVIDED);
        if (removal_modules_ist.NIL != removal_ist_check_query(mt, sentence)) {
            final SubLObject hl_support = make_ist_support(mt, sentence);
            backward.removal_add_node(hl_support, (SubLObject)removal_modules_ist.UNPROVIDED, (SubLObject)removal_modules_ist.UNPROVIDED);
        }
        return (SubLObject)removal_modules_ist.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/modules/removal/removal-modules-ist.lisp", position = 2961L)
    public static SubLObject removal_ist_check_query(final SubLObject mt, final SubLObject sentence) {
        return inference_trampolines.inference_known_sentence_recursive_query(sentence, mt, (SubLObject)removal_modules_ist.ONE_INTEGER);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/modules/removal/removal-modules-ist.lisp", position = 3096L)
    public static SubLObject removal_ist_pos_gaf_required(final SubLObject asent, SubLObject sense) {
        if (sense == removal_modules_ist.UNPROVIDED) {
            sense = (SubLObject)removal_modules_ist.NIL;
        }
        return (SubLObject)SubLObjectFactory.makeBoolean(!removal_ist_pos_gaf_cost(asent, sense).isZero());
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/modules/removal/removal-modules-ist.lisp", position = 3463L)
    public static SubLObject removal_ist_pos_gaf_cost(final SubLObject asent, SubLObject sense) {
        if (sense == removal_modules_ist.UNPROVIDED) {
            sense = (SubLObject)removal_modules_ist.NIL;
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject mt = cycl_utilities.atomic_sentence_arg1(asent, (SubLObject)removal_modules_ist.UNPROVIDED);
        final SubLObject gaf_sentence = cycl_utilities.atomic_sentence_arg2(asent, (SubLObject)removal_modules_ist.UNPROVIDED);
        SubLObject cost = (SubLObject)removal_modules_ist.NIL;
        final SubLObject mt_var = mt_relevance_macros.with_inference_mt_relevance_validate(mt);
        final SubLObject _prev_bind_0 = mt_relevance_macros.$mt$.currentBinding(thread);
        final SubLObject _prev_bind_2 = mt_relevance_macros.$relevant_mt_function$.currentBinding(thread);
        final SubLObject _prev_bind_3 = mt_relevance_macros.$relevant_mts$.currentBinding(thread);
        try {
            mt_relevance_macros.$mt$.bind(mt_relevance_macros.update_inference_mt_relevance_mt(mt_var), thread);
            mt_relevance_macros.$relevant_mt_function$.bind(mt_relevance_macros.update_inference_mt_relevance_function(mt_var), thread);
            mt_relevance_macros.$relevant_mts$.bind(mt_relevance_macros.update_inference_mt_relevance_mt_list(mt_var), thread);
            cost = inference_utilities.literal_removal_cost(gaf_sentence, (SubLObject)removal_modules_ist.$kw10$POS, (SubLObject)removal_modules_ist.UNPROVIDED, (SubLObject)removal_modules_ist.UNPROVIDED);
        }
        finally {
            mt_relevance_macros.$relevant_mts$.rebind(_prev_bind_3, thread);
            mt_relevance_macros.$relevant_mt_function$.rebind(_prev_bind_2, thread);
            mt_relevance_macros.$mt$.rebind(_prev_bind_0, thread);
        }
        return cost;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/modules/removal/removal-modules-ist.lisp", position = 3759L)
    public static SubLObject removal_ist_pos_gaf_expand(final SubLObject asent, SubLObject sense) {
        if (sense == removal_modules_ist.UNPROVIDED) {
            sense = (SubLObject)removal_modules_ist.NIL;
        }
        final SubLObject mt = cycl_utilities.atomic_sentence_arg1(asent, (SubLObject)removal_modules_ist.UNPROVIDED);
        final SubLObject gaf_sentence = cycl_utilities.atomic_sentence_arg2(asent, (SubLObject)removal_modules_ist.UNPROVIDED);
        final SubLObject results = removal_ist_pos_gaf_query(mt, gaf_sentence);
        if (removal_modules_ist.NIL != results) {
            SubLObject cdolist_list_var = results;
            SubLObject v_bindings = (SubLObject)removal_modules_ist.NIL;
            v_bindings = cdolist_list_var.first();
            while (removal_modules_ist.NIL != cdolist_list_var) {
                final SubLObject substituted_gaf_sentence = bindings.subst_bindings(v_bindings, gaf_sentence);
                final SubLObject hl_support = make_ist_support(mt, substituted_gaf_sentence);
                backward.removal_add_node(hl_support, v_bindings, (SubLObject)removal_modules_ist.UNPROVIDED);
                cdolist_list_var = cdolist_list_var.rest();
                v_bindings = cdolist_list_var.first();
            }
        }
        return (SubLObject)removal_modules_ist.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/modules/removal/removal-modules-ist.lisp", position = 4245L)
    public static SubLObject removal_ist_pos_gaf_completeness(final SubLObject asent, SubLObject sense) {
        if (sense == removal_modules_ist.UNPROVIDED) {
            sense = (SubLObject)removal_modules_ist.NIL;
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject mt = cycl_utilities.atomic_sentence_arg1(asent, (SubLObject)removal_modules_ist.UNPROVIDED);
        final SubLObject gaf_sentence = cycl_utilities.atomic_sentence_arg2(asent, (SubLObject)removal_modules_ist.UNPROVIDED);
        SubLObject completeness = (SubLObject)removal_modules_ist.NIL;
        final SubLObject mt_var = mt_relevance_macros.with_inference_mt_relevance_validate(mt);
        final SubLObject _prev_bind_0 = mt_relevance_macros.$mt$.currentBinding(thread);
        final SubLObject _prev_bind_2 = mt_relevance_macros.$relevant_mt_function$.currentBinding(thread);
        final SubLObject _prev_bind_3 = mt_relevance_macros.$relevant_mts$.currentBinding(thread);
        try {
            mt_relevance_macros.$mt$.bind(mt_relevance_macros.update_inference_mt_relevance_mt(mt_var), thread);
            mt_relevance_macros.$relevant_mt_function$.bind(mt_relevance_macros.update_inference_mt_relevance_function(mt_var), thread);
            mt_relevance_macros.$relevant_mts$.bind(mt_relevance_macros.update_inference_mt_relevance_mt_list(mt_var), thread);
            completeness = inference_utilities.literal_removal_completeness(gaf_sentence, (SubLObject)removal_modules_ist.$kw10$POS, (SubLObject)removal_modules_ist.UNPROVIDED);
        }
        finally {
            mt_relevance_macros.$relevant_mts$.rebind(_prev_bind_3, thread);
            mt_relevance_macros.$relevant_mt_function$.rebind(_prev_bind_2, thread);
            mt_relevance_macros.$mt$.rebind(_prev_bind_0, thread);
        }
        return completeness;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/modules/removal/removal-modules-ist.lisp", position = 5769L)
    public static SubLObject removal_ist_pos_gaf_query(final SubLObject mt, final SubLObject gaf_sentence) {
        return inference_trampolines.inference_known_sentence_removal_query(gaf_sentence, mt, (SubLObject)removal_modules_ist.$kw15$TRUE);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/modules/removal/removal-modules-ist.lisp", position = 5916L)
    public static SubLObject removal_ist_neg_gaf_cost(final SubLObject asent, SubLObject sense) {
        if (sense == removal_modules_ist.UNPROVIDED) {
            sense = (SubLObject)removal_modules_ist.NIL;
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject mt = cycl_utilities.atomic_sentence_arg1(asent, (SubLObject)removal_modules_ist.UNPROVIDED);
        final SubLObject negated_gaf_sentence = cycl_utilities.atomic_sentence_arg2(asent, (SubLObject)removal_modules_ist.UNPROVIDED);
        final SubLObject gaf_sentence = cycl_utilities.sentence_arg1(negated_gaf_sentence, (SubLObject)removal_modules_ist.UNPROVIDED);
        SubLObject cost = (SubLObject)removal_modules_ist.NIL;
        final SubLObject mt_var = mt_relevance_macros.with_inference_mt_relevance_validate(mt);
        final SubLObject _prev_bind_0 = mt_relevance_macros.$mt$.currentBinding(thread);
        final SubLObject _prev_bind_2 = mt_relevance_macros.$relevant_mt_function$.currentBinding(thread);
        final SubLObject _prev_bind_3 = mt_relevance_macros.$relevant_mts$.currentBinding(thread);
        try {
            mt_relevance_macros.$mt$.bind(mt_relevance_macros.update_inference_mt_relevance_mt(mt_var), thread);
            mt_relevance_macros.$relevant_mt_function$.bind(mt_relevance_macros.update_inference_mt_relevance_function(mt_var), thread);
            mt_relevance_macros.$relevant_mts$.bind(mt_relevance_macros.update_inference_mt_relevance_mt_list(mt_var), thread);
            cost = inference_utilities.literal_removal_cost(gaf_sentence, (SubLObject)removal_modules_ist.$kw16$NEG, (SubLObject)removal_modules_ist.UNPROVIDED, (SubLObject)removal_modules_ist.UNPROVIDED);
        }
        finally {
            mt_relevance_macros.$relevant_mts$.rebind(_prev_bind_3, thread);
            mt_relevance_macros.$relevant_mt_function$.rebind(_prev_bind_2, thread);
            mt_relevance_macros.$mt$.rebind(_prev_bind_0, thread);
        }
        return cost;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/modules/removal/removal-modules-ist.lisp", position = 6431L)
    public static SubLObject removal_ist_neg_gaf_expand(final SubLObject asent, SubLObject sense) {
        if (sense == removal_modules_ist.UNPROVIDED) {
            sense = (SubLObject)removal_modules_ist.NIL;
        }
        final SubLObject mt = cycl_utilities.atomic_sentence_arg1(asent, (SubLObject)removal_modules_ist.UNPROVIDED);
        final SubLObject negated_gaf_sentence = cycl_utilities.atomic_sentence_arg2(asent, (SubLObject)removal_modules_ist.UNPROVIDED);
        final SubLObject gaf_sentence = cycl_utilities.sentence_arg1(negated_gaf_sentence, (SubLObject)removal_modules_ist.UNPROVIDED);
        final SubLObject results = removal_ist_neg_gaf_query(mt, gaf_sentence);
        if (removal_modules_ist.NIL != results) {
            SubLObject cdolist_list_var = results;
            SubLObject v_bindings = (SubLObject)removal_modules_ist.NIL;
            v_bindings = cdolist_list_var.first();
            while (removal_modules_ist.NIL != cdolist_list_var) {
                final SubLObject substituted_gaf_sentence = bindings.subst_bindings(v_bindings, gaf_sentence);
                final SubLObject hl_support = make_ist_support(mt, cycl_utilities.negate(substituted_gaf_sentence));
                backward.removal_add_node(hl_support, v_bindings, (SubLObject)removal_modules_ist.UNPROVIDED);
                cdolist_list_var = cdolist_list_var.rest();
                v_bindings = cdolist_list_var.first();
            }
        }
        return (SubLObject)removal_modules_ist.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/modules/removal/removal-modules-ist.lisp", position = 7516L)
    public static SubLObject removal_ist_neg_gaf_query(final SubLObject mt, final SubLObject gaf_sentence) {
        return inference_trampolines.inference_known_sentence_removal_query(gaf_sentence, mt, (SubLObject)removal_modules_ist.$kw19$FALSE);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/modules/removal/removal-modules-ist.lisp", position = 8043L)
    public static SubLObject removal_ist_pos_gaf_mt_lookup_expand(final SubLObject asent, SubLObject sense) {
        if (sense == removal_modules_ist.UNPROVIDED) {
            sense = (SubLObject)removal_modules_ist.NIL;
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject arg1 = cycl_utilities.atomic_sentence_arg1(asent, (SubLObject)removal_modules_ist.UNPROVIDED);
        final SubLObject gaf_sentence = cycl_utilities.atomic_sentence_arg2(asent, (SubLObject)removal_modules_ist.UNPROVIDED);
        SubLObject cdolist_list_var;
        final SubLObject mt_support_combinations = cdolist_list_var = inference_trampolines.inference_mts_where_gaf_sentence_true_justified_memoized(gaf_sentence);
        SubLObject mt_support_combination = (SubLObject)removal_modules_ist.NIL;
        mt_support_combination = cdolist_list_var.first();
        while (removal_modules_ist.NIL != cdolist_list_var) {
            SubLObject current;
            final SubLObject datum = current = mt_support_combination;
            SubLObject mts = (SubLObject)removal_modules_ist.NIL;
            SubLObject justification = (SubLObject)removal_modules_ist.NIL;
            cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)removal_modules_ist.$list20);
            mts = current.first();
            current = current.rest();
            cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)removal_modules_ist.$list20);
            justification = current.first();
            current = current.rest();
            if (removal_modules_ist.NIL == current) {
                SubLObject cdolist_list_var_$1 = mts;
                SubLObject mt = (SubLObject)removal_modules_ist.NIL;
                mt = cdolist_list_var_$1.first();
                while (removal_modules_ist.NIL != cdolist_list_var_$1) {
                    final SubLObject v_bindings = unification_utilities.genl_mt_unify(arg1, mt, (SubLObject)removal_modules_ist.UNPROVIDED);
                    if (removal_modules_ist.NIL != v_bindings) {
                        thread.resetMultipleValues();
                        final SubLObject support = make_ist_supports(mt, gaf_sentence);
                        final SubLObject more_supports = thread.secondMultipleValue();
                        thread.resetMultipleValues();
                        backward.removal_add_node(support, v_bindings, more_supports);
                    }
                    cdolist_list_var_$1 = cdolist_list_var_$1.rest();
                    mt = cdolist_list_var_$1.first();
                }
            }
            else {
                cdestructuring_bind.cdestructuring_bind_error(datum, (SubLObject)removal_modules_ist.$list20);
            }
            cdolist_list_var = cdolist_list_var.rest();
            mt_support_combination = cdolist_list_var.first();
        }
        return (SubLObject)removal_modules_ist.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/modules/removal/removal-modules-ist.lisp", position = 9368L)
    public static SubLObject removal_ist_unbound_mt_gaf_lookup_pos_cost(final SubLObject asent, SubLObject sense) {
        if (sense == removal_modules_ist.UNPROVIDED) {
            sense = (SubLObject)removal_modules_ist.NIL;
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject cost = (SubLObject)removal_modules_ist.NIL;
        final SubLObject _prev_bind_0 = mt_relevance_macros.$relevant_mt_function$.currentBinding(thread);
        final SubLObject _prev_bind_2 = mt_relevance_macros.$mt$.currentBinding(thread);
        try {
            mt_relevance_macros.$relevant_mt_function$.bind((SubLObject)removal_modules_ist.$sym23$RELEVANT_MT_IS_EVERYTHING, thread);
            mt_relevance_macros.$mt$.bind(removal_modules_ist.$const24$EverythingPSC, thread);
            final SubLObject ist_formula = cycl_utilities.atomic_sentence_arg2(asent, (SubLObject)removal_modules_ist.UNPROVIDED);
            final SubLObject binding_cost = inference_utilities.literal_removal_cost(ist_formula, (SubLObject)removal_modules_ist.$kw10$POS, (SubLObject)removal_modules_ist.UNPROVIDED, (SubLObject)removal_modules_ist.UNPROVIDED);
            final SubLObject mt_cost = removal_modules_ist.$estimated_mts_per_formula$.getDynamicValue(thread);
            cost = Numbers.multiply(binding_cost, mt_cost);
        }
        finally {
            mt_relevance_macros.$mt$.rebind(_prev_bind_2, thread);
            mt_relevance_macros.$relevant_mt_function$.rebind(_prev_bind_0, thread);
        }
        return cost;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/modules/removal/removal-modules-ist.lisp", position = 9857L)
    public static SubLObject removal_ist_unbound_mt_gaf_lookup_pos_expand(final SubLObject asent, SubLObject sense) {
        if (sense == removal_modules_ist.UNPROVIDED) {
            sense = (SubLObject)removal_modules_ist.NIL;
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject ist_mt = cycl_utilities.atomic_sentence_arg1(asent, (SubLObject)removal_modules_ist.UNPROVIDED);
        final SubLObject ist_formula = cycl_utilities.atomic_sentence_arg2(asent, (SubLObject)removal_modules_ist.UNPROVIDED);
        SubLObject cdolist_list_var;
        final SubLObject bindings_list = cdolist_list_var = removal_ist_pos_gaf_query(removal_modules_ist.$const25$InferencePSC, ist_formula);
        SubLObject formula_bindings = (SubLObject)removal_modules_ist.NIL;
        formula_bindings = cdolist_list_var.first();
        while (removal_modules_ist.NIL != cdolist_list_var) {
            final SubLObject new_formula = conses_high.sublis(formula_bindings, ist_formula, Symbols.symbol_function((SubLObject)removal_modules_ist.EQL), (SubLObject)removal_modules_ist.UNPROVIDED);
            SubLObject cdolist_list_var_$2;
            final SubLObject mt_support_combinations = cdolist_list_var_$2 = inference_trampolines.inference_mts_where_gaf_sentence_true_justified_memoized(new_formula);
            SubLObject mt_support_combination = (SubLObject)removal_modules_ist.NIL;
            mt_support_combination = cdolist_list_var_$2.first();
            while (removal_modules_ist.NIL != cdolist_list_var_$2) {
                SubLObject current;
                final SubLObject datum = current = mt_support_combination;
                SubLObject mts = (SubLObject)removal_modules_ist.NIL;
                SubLObject justification = (SubLObject)removal_modules_ist.NIL;
                cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)removal_modules_ist.$list20);
                mts = current.first();
                current = current.rest();
                cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)removal_modules_ist.$list20);
                justification = current.first();
                current = current.rest();
                if (removal_modules_ist.NIL == current) {
                    SubLObject cdolist_list_var_$3 = mts;
                    SubLObject mt = (SubLObject)removal_modules_ist.NIL;
                    mt = cdolist_list_var_$3.first();
                    while (removal_modules_ist.NIL != cdolist_list_var_$3) {
                        final SubLObject mt_bindings = unification_utilities.genl_mt_unify(ist_mt, mt, (SubLObject)removal_modules_ist.UNPROVIDED);
                        if (removal_modules_ist.NIL != mt_bindings && removal_modules_ist.NIL != formula_bindings) {
                            final SubLObject v_bindings = list_utilities.fast_remove_duplicates(ConsesLow.append(mt_bindings, formula_bindings), Symbols.symbol_function((SubLObject)removal_modules_ist.EQUAL), (SubLObject)removal_modules_ist.UNPROVIDED, (SubLObject)removal_modules_ist.UNPROVIDED, (SubLObject)removal_modules_ist.UNPROVIDED, (SubLObject)removal_modules_ist.UNPROVIDED);
                            if (removal_modules_ist.NIL == list_utilities.duplicates(bindings.bindings_variables(v_bindings), (SubLObject)removal_modules_ist.UNPROVIDED, (SubLObject)removal_modules_ist.UNPROVIDED)) {
                                thread.resetMultipleValues();
                                final SubLObject support = make_ist_supports(mt, new_formula);
                                final SubLObject more_supports = thread.secondMultipleValue();
                                thread.resetMultipleValues();
                                backward.removal_add_node(support, v_bindings, more_supports);
                            }
                        }
                        cdolist_list_var_$3 = cdolist_list_var_$3.rest();
                        mt = cdolist_list_var_$3.first();
                    }
                }
                else {
                    cdestructuring_bind.cdestructuring_bind_error(datum, (SubLObject)removal_modules_ist.$list20);
                }
                cdolist_list_var_$2 = cdolist_list_var_$2.rest();
                mt_support_combination = cdolist_list_var_$2.first();
            }
            cdolist_list_var = cdolist_list_var.rest();
            formula_bindings = cdolist_list_var.first();
        }
        return (SubLObject)removal_modules_ist.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/modules/removal/removal-modules-ist.lisp", position = 11767L)
    public static SubLObject make_ist_asserted_justification(final SubLObject assertion) {
        return (SubLObject)ConsesLow.list(make_ist_asserted_support(assertion));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/modules/removal/removal-modules-ist.lisp", position = 11881L)
    public static SubLObject make_ist_asserted_support(final SubLObject assertion) {
        final SubLObject mt = assertions_high.assertion_mt(assertion);
        final SubLObject sentence = uncanonicalizer.assertion_el_formula(assertion);
        final SubLObject ist_asserted_sentence = el_utilities.make_binary_formula(removal_modules_ist.$const28$ist_Asserted, mt, sentence);
        return arguments.make_hl_support((SubLObject)removal_modules_ist.$kw6$QUERY, ist_asserted_sentence, mt_vars.$ist_mt$.getGlobalValue(), (SubLObject)removal_modules_ist.UNPROVIDED);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/modules/removal/removal-modules-ist.lisp", position = 12284L)
    public static SubLObject removal_ist_asserted_gaf_lookup_pos_cost(final SubLObject asent, SubLObject sense) {
        if (sense == removal_modules_ist.UNPROVIDED) {
            sense = (SubLObject)removal_modules_ist.NIL;
        }
        return removal_ist_asserted_gaf_lookup_cost(asent);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/modules/removal/removal-modules-ist.lisp", position = 12671L)
    public static SubLObject removal_ist_asserted_gaf_iterator(final SubLObject mt, final SubLObject formula) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject result = (SubLObject)removal_modules_ist.NIL;
        final SubLObject sub_literal = el_utilities.literal_atomic_sentence(formula);
        final SubLObject sub_sense = el_utilities.literal_sense(formula);
        final SubLObject _prev_bind_0 = mt_relevance_macros.$relevant_mt_function$.currentBinding(thread);
        final SubLObject _prev_bind_2 = mt_relevance_macros.$mt$.currentBinding(thread);
        try {
            mt_relevance_macros.$relevant_mt_function$.bind((SubLObject)removal_modules_ist.$sym29$RELEVANT_MT_IS_EQ, thread);
            mt_relevance_macros.$mt$.bind(mt, thread);
            final SubLObject source_formula_var = sub_literal;
            SubLObject cdolist_list_var = cycl_utilities.canonical_commutative_permutations(source_formula_var, Symbols.symbol_function((SubLObject)removal_modules_ist.$sym34$HL_VAR_), (SubLObject)removal_modules_ist.T);
            SubLObject permuted_literal = (SubLObject)removal_modules_ist.NIL;
            permuted_literal = cdolist_list_var.first();
            while (removal_modules_ist.NIL != cdolist_list_var) {
                final SubLObject l_index = inference_trampolines.inference_gaf_lookup_index(permuted_literal, sub_sense);
                final SubLObject pcase_var;
                final SubLObject method = pcase_var = kb_mapping_macros.do_gli_extract_method(l_index);
                if (pcase_var.eql((SubLObject)removal_modules_ist.$kw30$GAF_ARG)) {
                    thread.resetMultipleValues();
                    final SubLObject v_term = kb_mapping_macros.do_gli_vga_extract_keys(l_index);
                    final SubLObject argnum = thread.secondMultipleValue();
                    final SubLObject predicate = thread.thirdMultipleValue();
                    thread.resetMultipleValues();
                    if (removal_modules_ist.NIL != argnum) {
                        if (removal_modules_ist.NIL != predicate) {
                            final SubLObject pred_var = predicate;
                            if (removal_modules_ist.NIL != kb_mapping_macros.do_gaf_arg_index_key_validator(v_term, argnum, pred_var)) {
                                final SubLObject iterator_var = kb_mapping_macros.new_gaf_arg_final_index_spec_iterator(v_term, argnum, pred_var);
                                SubLObject done_var = (SubLObject)removal_modules_ist.NIL;
                                final SubLObject token_var = (SubLObject)removal_modules_ist.NIL;
                                while (removal_modules_ist.NIL == done_var) {
                                    final SubLObject final_index_spec = iteration.iteration_next_without_values_macro_helper(iterator_var, token_var);
                                    final SubLObject valid = (SubLObject)SubLObjectFactory.makeBoolean(!token_var.eql(final_index_spec));
                                    if (removal_modules_ist.NIL != valid) {
                                        SubLObject final_index_iterator = (SubLObject)removal_modules_ist.NIL;
                                        try {
                                            final_index_iterator = kb_mapping_macros.new_final_index_iterator(final_index_spec, (SubLObject)removal_modules_ist.$kw31$GAF, enumeration_types.sense_truth(sub_sense), (SubLObject)removal_modules_ist.NIL);
                                            SubLObject done_var_$4 = (SubLObject)removal_modules_ist.NIL;
                                            final SubLObject token_var_$5 = (SubLObject)removal_modules_ist.NIL;
                                            while (removal_modules_ist.NIL == done_var_$4) {
                                                final SubLObject assertion = iteration.iteration_next_without_values_macro_helper(final_index_iterator, token_var_$5);
                                                final SubLObject valid_$6 = (SubLObject)SubLObjectFactory.makeBoolean(!token_var_$5.eql(assertion));
                                                if (removal_modules_ist.NIL != valid_$6 && removal_modules_ist.NIL != backward_utilities.direction_is_relevant(assertion) && enumeration_types.truth_sense(assertions_high.assertion_truth(assertion)).eql(sub_sense)) {
                                                    thread.resetMultipleValues();
                                                    final SubLObject v_bindings = unification_utilities.gaf_asent_unify(permuted_literal, assertions_high.gaf_formula(assertion), (SubLObject)removal_modules_ist.T, (SubLObject)removal_modules_ist.T);
                                                    final SubLObject gaf_asent = thread.secondMultipleValue();
                                                    final SubLObject unify_justification = thread.thirdMultipleValue();
                                                    thread.resetMultipleValues();
                                                    if (removal_modules_ist.NIL != v_bindings) {
                                                        result = (SubLObject)ConsesLow.cons((SubLObject)ConsesLow.list(v_bindings, assertion), result);
                                                    }
                                                }
                                                done_var_$4 = (SubLObject)SubLObjectFactory.makeBoolean(removal_modules_ist.NIL == valid_$6);
                                            }
                                        }
                                        finally {
                                            final SubLObject _prev_bind_0_$7 = Threads.$is_thread_performing_cleanupP$.currentBinding(thread);
                                            try {
                                                Threads.$is_thread_performing_cleanupP$.bind((SubLObject)removal_modules_ist.T, thread);
                                                final SubLObject _values = Values.getValuesAsVector();
                                                if (removal_modules_ist.NIL != final_index_iterator) {
                                                    kb_mapping_macros.destroy_final_index_iterator(final_index_iterator);
                                                }
                                                Values.restoreValuesFromVector(_values);
                                            }
                                            finally {
                                                Threads.$is_thread_performing_cleanupP$.rebind(_prev_bind_0_$7, thread);
                                            }
                                        }
                                    }
                                    done_var = (SubLObject)SubLObjectFactory.makeBoolean(removal_modules_ist.NIL == valid);
                                }
                            }
                        }
                        else {
                            final SubLObject pred_var = (SubLObject)removal_modules_ist.NIL;
                            if (removal_modules_ist.NIL != kb_mapping_macros.do_gaf_arg_index_key_validator(v_term, argnum, pred_var)) {
                                final SubLObject iterator_var = kb_mapping_macros.new_gaf_arg_final_index_spec_iterator(v_term, argnum, pred_var);
                                SubLObject done_var = (SubLObject)removal_modules_ist.NIL;
                                final SubLObject token_var = (SubLObject)removal_modules_ist.NIL;
                                while (removal_modules_ist.NIL == done_var) {
                                    final SubLObject final_index_spec = iteration.iteration_next_without_values_macro_helper(iterator_var, token_var);
                                    final SubLObject valid = (SubLObject)SubLObjectFactory.makeBoolean(!token_var.eql(final_index_spec));
                                    if (removal_modules_ist.NIL != valid) {
                                        SubLObject final_index_iterator = (SubLObject)removal_modules_ist.NIL;
                                        try {
                                            final_index_iterator = kb_mapping_macros.new_final_index_iterator(final_index_spec, (SubLObject)removal_modules_ist.$kw31$GAF, enumeration_types.sense_truth(sub_sense), (SubLObject)removal_modules_ist.NIL);
                                            SubLObject done_var_$5 = (SubLObject)removal_modules_ist.NIL;
                                            final SubLObject token_var_$6 = (SubLObject)removal_modules_ist.NIL;
                                            while (removal_modules_ist.NIL == done_var_$5) {
                                                final SubLObject assertion = iteration.iteration_next_without_values_macro_helper(final_index_iterator, token_var_$6);
                                                final SubLObject valid_$7 = (SubLObject)SubLObjectFactory.makeBoolean(!token_var_$6.eql(assertion));
                                                if (removal_modules_ist.NIL != valid_$7 && removal_modules_ist.NIL != backward_utilities.direction_is_relevant(assertion) && enumeration_types.truth_sense(assertions_high.assertion_truth(assertion)).eql(sub_sense)) {
                                                    thread.resetMultipleValues();
                                                    final SubLObject v_bindings = unification_utilities.gaf_asent_unify(permuted_literal, assertions_high.gaf_formula(assertion), (SubLObject)removal_modules_ist.T, (SubLObject)removal_modules_ist.T);
                                                    final SubLObject gaf_asent = thread.secondMultipleValue();
                                                    final SubLObject unify_justification = thread.thirdMultipleValue();
                                                    thread.resetMultipleValues();
                                                    if (removal_modules_ist.NIL != v_bindings) {
                                                        result = (SubLObject)ConsesLow.cons((SubLObject)ConsesLow.list(v_bindings, assertion), result);
                                                    }
                                                }
                                                done_var_$5 = (SubLObject)SubLObjectFactory.makeBoolean(removal_modules_ist.NIL == valid_$7);
                                            }
                                        }
                                        finally {
                                            final SubLObject _prev_bind_0_$8 = Threads.$is_thread_performing_cleanupP$.currentBinding(thread);
                                            try {
                                                Threads.$is_thread_performing_cleanupP$.bind((SubLObject)removal_modules_ist.T, thread);
                                                final SubLObject _values2 = Values.getValuesAsVector();
                                                if (removal_modules_ist.NIL != final_index_iterator) {
                                                    kb_mapping_macros.destroy_final_index_iterator(final_index_iterator);
                                                }
                                                Values.restoreValuesFromVector(_values2);
                                            }
                                            finally {
                                                Threads.$is_thread_performing_cleanupP$.rebind(_prev_bind_0_$8, thread);
                                            }
                                        }
                                    }
                                    done_var = (SubLObject)SubLObjectFactory.makeBoolean(removal_modules_ist.NIL == valid);
                                }
                            }
                        }
                    }
                    else if (removal_modules_ist.NIL != predicate) {
                        final SubLObject pred_var = predicate;
                        if (removal_modules_ist.NIL != kb_mapping_macros.do_gaf_arg_index_key_validator(v_term, (SubLObject)removal_modules_ist.NIL, pred_var)) {
                            final SubLObject iterator_var = kb_mapping_macros.new_gaf_arg_final_index_spec_iterator(v_term, (SubLObject)removal_modules_ist.NIL, pred_var);
                            SubLObject done_var = (SubLObject)removal_modules_ist.NIL;
                            final SubLObject token_var = (SubLObject)removal_modules_ist.NIL;
                            while (removal_modules_ist.NIL == done_var) {
                                final SubLObject final_index_spec = iteration.iteration_next_without_values_macro_helper(iterator_var, token_var);
                                final SubLObject valid = (SubLObject)SubLObjectFactory.makeBoolean(!token_var.eql(final_index_spec));
                                if (removal_modules_ist.NIL != valid) {
                                    SubLObject final_index_iterator = (SubLObject)removal_modules_ist.NIL;
                                    try {
                                        final_index_iterator = kb_mapping_macros.new_final_index_iterator(final_index_spec, (SubLObject)removal_modules_ist.$kw31$GAF, enumeration_types.sense_truth(sub_sense), (SubLObject)removal_modules_ist.NIL);
                                        SubLObject done_var_$6 = (SubLObject)removal_modules_ist.NIL;
                                        final SubLObject token_var_$7 = (SubLObject)removal_modules_ist.NIL;
                                        while (removal_modules_ist.NIL == done_var_$6) {
                                            final SubLObject assertion = iteration.iteration_next_without_values_macro_helper(final_index_iterator, token_var_$7);
                                            final SubLObject valid_$8 = (SubLObject)SubLObjectFactory.makeBoolean(!token_var_$7.eql(assertion));
                                            if (removal_modules_ist.NIL != valid_$8 && removal_modules_ist.NIL != backward_utilities.direction_is_relevant(assertion) && enumeration_types.truth_sense(assertions_high.assertion_truth(assertion)).eql(sub_sense)) {
                                                thread.resetMultipleValues();
                                                final SubLObject v_bindings = unification_utilities.gaf_asent_unify(permuted_literal, assertions_high.gaf_formula(assertion), (SubLObject)removal_modules_ist.T, (SubLObject)removal_modules_ist.T);
                                                final SubLObject gaf_asent = thread.secondMultipleValue();
                                                final SubLObject unify_justification = thread.thirdMultipleValue();
                                                thread.resetMultipleValues();
                                                if (removal_modules_ist.NIL != v_bindings) {
                                                    result = (SubLObject)ConsesLow.cons((SubLObject)ConsesLow.list(v_bindings, assertion), result);
                                                }
                                            }
                                            done_var_$6 = (SubLObject)SubLObjectFactory.makeBoolean(removal_modules_ist.NIL == valid_$8);
                                        }
                                    }
                                    finally {
                                        final SubLObject _prev_bind_0_$9 = Threads.$is_thread_performing_cleanupP$.currentBinding(thread);
                                        try {
                                            Threads.$is_thread_performing_cleanupP$.bind((SubLObject)removal_modules_ist.T, thread);
                                            final SubLObject _values3 = Values.getValuesAsVector();
                                            if (removal_modules_ist.NIL != final_index_iterator) {
                                                kb_mapping_macros.destroy_final_index_iterator(final_index_iterator);
                                            }
                                            Values.restoreValuesFromVector(_values3);
                                        }
                                        finally {
                                            Threads.$is_thread_performing_cleanupP$.rebind(_prev_bind_0_$9, thread);
                                        }
                                    }
                                }
                                done_var = (SubLObject)SubLObjectFactory.makeBoolean(removal_modules_ist.NIL == valid);
                            }
                        }
                    }
                    else {
                        final SubLObject pred_var = (SubLObject)removal_modules_ist.NIL;
                        if (removal_modules_ist.NIL != kb_mapping_macros.do_gaf_arg_index_key_validator(v_term, (SubLObject)removal_modules_ist.NIL, pred_var)) {
                            final SubLObject iterator_var = kb_mapping_macros.new_gaf_arg_final_index_spec_iterator(v_term, (SubLObject)removal_modules_ist.NIL, pred_var);
                            SubLObject done_var = (SubLObject)removal_modules_ist.NIL;
                            final SubLObject token_var = (SubLObject)removal_modules_ist.NIL;
                            while (removal_modules_ist.NIL == done_var) {
                                final SubLObject final_index_spec = iteration.iteration_next_without_values_macro_helper(iterator_var, token_var);
                                final SubLObject valid = (SubLObject)SubLObjectFactory.makeBoolean(!token_var.eql(final_index_spec));
                                if (removal_modules_ist.NIL != valid) {
                                    SubLObject final_index_iterator = (SubLObject)removal_modules_ist.NIL;
                                    try {
                                        final_index_iterator = kb_mapping_macros.new_final_index_iterator(final_index_spec, (SubLObject)removal_modules_ist.$kw31$GAF, enumeration_types.sense_truth(sub_sense), (SubLObject)removal_modules_ist.NIL);
                                        SubLObject done_var_$7 = (SubLObject)removal_modules_ist.NIL;
                                        final SubLObject token_var_$8 = (SubLObject)removal_modules_ist.NIL;
                                        while (removal_modules_ist.NIL == done_var_$7) {
                                            final SubLObject assertion = iteration.iteration_next_without_values_macro_helper(final_index_iterator, token_var_$8);
                                            final SubLObject valid_$9 = (SubLObject)SubLObjectFactory.makeBoolean(!token_var_$8.eql(assertion));
                                            if (removal_modules_ist.NIL != valid_$9 && removal_modules_ist.NIL != backward_utilities.direction_is_relevant(assertion) && enumeration_types.truth_sense(assertions_high.assertion_truth(assertion)).eql(sub_sense)) {
                                                thread.resetMultipleValues();
                                                final SubLObject v_bindings = unification_utilities.gaf_asent_unify(permuted_literal, assertions_high.gaf_formula(assertion), (SubLObject)removal_modules_ist.T, (SubLObject)removal_modules_ist.T);
                                                final SubLObject gaf_asent = thread.secondMultipleValue();
                                                final SubLObject unify_justification = thread.thirdMultipleValue();
                                                thread.resetMultipleValues();
                                                if (removal_modules_ist.NIL != v_bindings) {
                                                    result = (SubLObject)ConsesLow.cons((SubLObject)ConsesLow.list(v_bindings, assertion), result);
                                                }
                                            }
                                            done_var_$7 = (SubLObject)SubLObjectFactory.makeBoolean(removal_modules_ist.NIL == valid_$9);
                                        }
                                    }
                                    finally {
                                        final SubLObject _prev_bind_0_$10 = Threads.$is_thread_performing_cleanupP$.currentBinding(thread);
                                        try {
                                            Threads.$is_thread_performing_cleanupP$.bind((SubLObject)removal_modules_ist.T, thread);
                                            final SubLObject _values4 = Values.getValuesAsVector();
                                            if (removal_modules_ist.NIL != final_index_iterator) {
                                                kb_mapping_macros.destroy_final_index_iterator(final_index_iterator);
                                            }
                                            Values.restoreValuesFromVector(_values4);
                                        }
                                        finally {
                                            Threads.$is_thread_performing_cleanupP$.rebind(_prev_bind_0_$10, thread);
                                        }
                                    }
                                }
                                done_var = (SubLObject)SubLObjectFactory.makeBoolean(removal_modules_ist.NIL == valid);
                            }
                        }
                    }
                }
                else if (pcase_var.eql((SubLObject)removal_modules_ist.$kw32$PREDICATE_EXTENT)) {
                    final SubLObject pred_var2 = kb_mapping_macros.do_gli_vpe_extract_key(l_index);
                    if (removal_modules_ist.NIL != kb_mapping_macros.do_predicate_extent_index_key_validator(pred_var2)) {
                        final SubLObject str = (SubLObject)removal_modules_ist.NIL;
                        final SubLObject _prev_bind_0_$11 = utilities_macros.$progress_start_time$.currentBinding(thread);
                        final SubLObject _prev_bind_1_$21 = utilities_macros.$progress_last_pacification_time$.currentBinding(thread);
                        final SubLObject _prev_bind_3 = utilities_macros.$progress_elapsed_seconds_for_notification$.currentBinding(thread);
                        final SubLObject _prev_bind_4 = utilities_macros.$progress_notification_count$.currentBinding(thread);
                        final SubLObject _prev_bind_5 = utilities_macros.$progress_pacifications_since_last_nl$.currentBinding(thread);
                        final SubLObject _prev_bind_6 = utilities_macros.$progress_count$.currentBinding(thread);
                        final SubLObject _prev_bind_7 = utilities_macros.$is_noting_progressP$.currentBinding(thread);
                        final SubLObject _prev_bind_8 = utilities_macros.$silent_progressP$.currentBinding(thread);
                        try {
                            utilities_macros.$progress_start_time$.bind(Time.get_universal_time(), thread);
                            utilities_macros.$progress_last_pacification_time$.bind(utilities_macros.$progress_start_time$.getDynamicValue(thread), thread);
                            utilities_macros.$progress_elapsed_seconds_for_notification$.bind(utilities_macros.$suppress_all_progress_faster_than_seconds$.getDynamicValue(thread), thread);
                            utilities_macros.$progress_notification_count$.bind((SubLObject)removal_modules_ist.ZERO_INTEGER, thread);
                            utilities_macros.$progress_pacifications_since_last_nl$.bind((SubLObject)removal_modules_ist.ZERO_INTEGER, thread);
                            utilities_macros.$progress_count$.bind((SubLObject)removal_modules_ist.ZERO_INTEGER, thread);
                            utilities_macros.$is_noting_progressP$.bind((SubLObject)removal_modules_ist.T, thread);
                            utilities_macros.$silent_progressP$.bind((SubLObject)((removal_modules_ist.NIL != str) ? utilities_macros.$silent_progressP$.getDynamicValue(thread) : removal_modules_ist.T), thread);
                            utilities_macros.noting_progress_preamble(str);
                            final SubLObject iterator_var2 = kb_mapping_macros.new_predicate_extent_final_index_spec_iterator(pred_var2);
                            SubLObject done_var2 = (SubLObject)removal_modules_ist.NIL;
                            final SubLObject token_var2 = (SubLObject)removal_modules_ist.NIL;
                            while (removal_modules_ist.NIL == done_var2) {
                                final SubLObject final_index_spec2 = iteration.iteration_next_without_values_macro_helper(iterator_var2, token_var2);
                                final SubLObject valid2 = (SubLObject)SubLObjectFactory.makeBoolean(!token_var2.eql(final_index_spec2));
                                if (removal_modules_ist.NIL != valid2) {
                                    utilities_macros.note_progress();
                                    SubLObject final_index_iterator2 = (SubLObject)removal_modules_ist.NIL;
                                    try {
                                        final_index_iterator2 = kb_mapping_macros.new_final_index_iterator(final_index_spec2, (SubLObject)removal_modules_ist.$kw31$GAF, enumeration_types.sense_truth(sub_sense), (SubLObject)removal_modules_ist.NIL);
                                        SubLObject done_var_$8 = (SubLObject)removal_modules_ist.NIL;
                                        final SubLObject token_var_$9 = (SubLObject)removal_modules_ist.NIL;
                                        while (removal_modules_ist.NIL == done_var_$8) {
                                            final SubLObject assertion2 = iteration.iteration_next_without_values_macro_helper(final_index_iterator2, token_var_$9);
                                            final SubLObject valid_$10 = (SubLObject)SubLObjectFactory.makeBoolean(!token_var_$9.eql(assertion2));
                                            if (removal_modules_ist.NIL != valid_$10 && removal_modules_ist.NIL != backward_utilities.direction_is_relevant(assertion2) && enumeration_types.truth_sense(assertions_high.assertion_truth(assertion2)).eql(sub_sense)) {
                                                thread.resetMultipleValues();
                                                final SubLObject v_bindings2 = unification_utilities.gaf_asent_unify(permuted_literal, assertions_high.gaf_formula(assertion2), (SubLObject)removal_modules_ist.T, (SubLObject)removal_modules_ist.T);
                                                final SubLObject gaf_asent2 = thread.secondMultipleValue();
                                                final SubLObject unify_justification2 = thread.thirdMultipleValue();
                                                thread.resetMultipleValues();
                                                if (removal_modules_ist.NIL != v_bindings2) {
                                                    result = (SubLObject)ConsesLow.cons((SubLObject)ConsesLow.list(v_bindings2, assertion2), result);
                                                }
                                            }
                                            done_var_$8 = (SubLObject)SubLObjectFactory.makeBoolean(removal_modules_ist.NIL == valid_$10);
                                        }
                                    }
                                    finally {
                                        final SubLObject _prev_bind_0_$12 = Threads.$is_thread_performing_cleanupP$.currentBinding(thread);
                                        try {
                                            Threads.$is_thread_performing_cleanupP$.bind((SubLObject)removal_modules_ist.T, thread);
                                            final SubLObject _values5 = Values.getValuesAsVector();
                                            if (removal_modules_ist.NIL != final_index_iterator2) {
                                                kb_mapping_macros.destroy_final_index_iterator(final_index_iterator2);
                                            }
                                            Values.restoreValuesFromVector(_values5);
                                        }
                                        finally {
                                            Threads.$is_thread_performing_cleanupP$.rebind(_prev_bind_0_$12, thread);
                                        }
                                    }
                                }
                                done_var2 = (SubLObject)SubLObjectFactory.makeBoolean(removal_modules_ist.NIL == valid2);
                            }
                            utilities_macros.noting_progress_postamble();
                        }
                        finally {
                            utilities_macros.$silent_progressP$.rebind(_prev_bind_8, thread);
                            utilities_macros.$is_noting_progressP$.rebind(_prev_bind_7, thread);
                            utilities_macros.$progress_count$.rebind(_prev_bind_6, thread);
                            utilities_macros.$progress_pacifications_since_last_nl$.rebind(_prev_bind_5, thread);
                            utilities_macros.$progress_notification_count$.rebind(_prev_bind_4, thread);
                            utilities_macros.$progress_elapsed_seconds_for_notification$.rebind(_prev_bind_3, thread);
                            utilities_macros.$progress_last_pacification_time$.rebind(_prev_bind_1_$21, thread);
                            utilities_macros.$progress_start_time$.rebind(_prev_bind_0_$11, thread);
                        }
                    }
                }
                else if (pcase_var.eql((SubLObject)removal_modules_ist.$kw33$OVERLAP)) {
                    SubLObject cdolist_list_var_$26 = virtual_indexing.gather_overlap_index(kb_mapping_macros.do_gli_vo_extract_key(l_index), (SubLObject)removal_modules_ist.UNPROVIDED);
                    SubLObject assertion3 = (SubLObject)removal_modules_ist.NIL;
                    assertion3 = cdolist_list_var_$26.first();
                    while (removal_modules_ist.NIL != cdolist_list_var_$26) {
                        if ((removal_modules_ist.NIL == enumeration_types.sense_truth(sub_sense) || removal_modules_ist.NIL != assertions_high.assertion_has_truth(assertion3, enumeration_types.sense_truth(sub_sense))) && removal_modules_ist.NIL != backward_utilities.direction_is_relevant(assertion3) && enumeration_types.truth_sense(assertions_high.assertion_truth(assertion3)).eql(sub_sense)) {
                            thread.resetMultipleValues();
                            final SubLObject v_bindings3 = unification_utilities.gaf_asent_unify(permuted_literal, assertions_high.gaf_formula(assertion3), (SubLObject)removal_modules_ist.T, (SubLObject)removal_modules_ist.T);
                            final SubLObject gaf_asent3 = thread.secondMultipleValue();
                            final SubLObject unify_justification3 = thread.thirdMultipleValue();
                            thread.resetMultipleValues();
                            if (removal_modules_ist.NIL != v_bindings3) {
                                result = (SubLObject)ConsesLow.cons((SubLObject)ConsesLow.list(v_bindings3, assertion3), result);
                            }
                        }
                        cdolist_list_var_$26 = cdolist_list_var_$26.rest();
                        assertion3 = cdolist_list_var_$26.first();
                    }
                }
                else {
                    kb_mapping_macros.do_gli_method_error(l_index, method);
                }
                cdolist_list_var = cdolist_list_var.rest();
                permuted_literal = cdolist_list_var.first();
            }
        }
        finally {
            mt_relevance_macros.$mt$.rebind(_prev_bind_2, thread);
            mt_relevance_macros.$relevant_mt_function$.rebind(_prev_bind_0, thread);
        }
        if (removal_modules_ist.NIL != result) {
            return iteration.new_inference_list_iterator(result);
        }
        return (SubLObject)removal_modules_ist.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/modules/removal/removal-modules-ist.lisp", position = 13558L)
    public static SubLObject removal_ist_asserted_pred_fort(final SubLObject v_object) {
        return (SubLObject)SubLObjectFactory.makeBoolean(!v_object.eql(removal_modules_ist.$const35$not) && removal_modules_ist.NIL != forts.fort_p(v_object));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/modules/removal/removal-modules-ist.lisp", position = 14833L)
    public static SubLObject removal_ist_asserted_gaf_lookup_cost(final SubLObject asent) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject mt = cycl_utilities.atomic_sentence_arg1(asent, (SubLObject)removal_modules_ist.UNPROVIDED);
        final SubLObject gaf_formula = cycl_utilities.atomic_sentence_arg2(asent, (SubLObject)removal_modules_ist.UNPROVIDED);
        final SubLObject sub_literal = el_utilities.literal_atomic_sentence(gaf_formula);
        final SubLObject sub_sense = el_utilities.literal_sense(gaf_formula);
        SubLObject total = (SubLObject)removal_modules_ist.ZERO_INTEGER;
        final SubLObject _prev_bind_0 = mt_relevance_macros.$relevant_mt_function$.currentBinding(thread);
        final SubLObject _prev_bind_2 = mt_relevance_macros.$mt$.currentBinding(thread);
        try {
            mt_relevance_macros.$relevant_mt_function$.bind((SubLObject)removal_modules_ist.$sym29$RELEVANT_MT_IS_EQ, thread);
            mt_relevance_macros.$mt$.bind(mt, thread);
            final SubLObject source_formula_var = sub_literal;
            SubLObject cdolist_list_var = cycl_utilities.canonical_commutative_permutations(source_formula_var, Symbols.symbol_function((SubLObject)removal_modules_ist.$sym34$HL_VAR_), (SubLObject)removal_modules_ist.T);
            SubLObject permuted_literal = (SubLObject)removal_modules_ist.NIL;
            permuted_literal = cdolist_list_var.first();
            while (removal_modules_ist.NIL != cdolist_list_var) {
                total = Numbers.add(total, inference_trampolines.inference_relevant_num_gaf_lookup_index(mt, permuted_literal, sub_sense));
                cdolist_list_var = cdolist_list_var.rest();
                permuted_literal = cdolist_list_var.first();
            }
        }
        finally {
            mt_relevance_macros.$mt$.rebind(_prev_bind_2, thread);
            mt_relevance_macros.$relevant_mt_function$.rebind(_prev_bind_0, thread);
        }
        return total;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/modules/removal/removal-modules-ist.lisp", position = 15347L)
    public static SubLObject removal_ist_asserted_unbound_lookup_pos_required(final SubLObject asent, SubLObject sense) {
        if (sense == removal_modules_ist.UNPROVIDED) {
            sense = (SubLObject)removal_modules_ist.NIL;
        }
        final SubLObject formula = el_utilities.literal_atomic_sentence(cycl_utilities.atomic_sentence_arg2(asent, (SubLObject)removal_modules_ist.UNPROVIDED));
        return Sequences.find_if(Symbols.symbol_function((SubLObject)removal_modules_ist.$sym38$FORT_P), cycl_utilities.atomic_sentence_args(formula, (SubLObject)removal_modules_ist.UNPROVIDED), (SubLObject)removal_modules_ist.UNPROVIDED, (SubLObject)removal_modules_ist.UNPROVIDED, (SubLObject)removal_modules_ist.UNPROVIDED);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/modules/removal/removal-modules-ist.lisp", position = 15792L)
    public static SubLObject removal_ist_asserted_unbound_lookup_pos_cost(final SubLObject asent, SubLObject sense) {
        if (sense == removal_modules_ist.UNPROVIDED) {
            sense = (SubLObject)removal_modules_ist.NIL;
        }
        return removal_ist_asserted_gaf_lookup_cost(asent);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/modules/removal/removal-modules-ist.lisp", position = 15949L)
    public static SubLObject removal_ist_asserted_unbound_lookup_iterator(final SubLObject mt, final SubLObject formula) {
        return removal_ist_asserted_gaf_iterator(mt, formula);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/modules/removal/removal-modules-ist.lisp", position = 17308L)
    public static SubLObject removal_ist_asserted_mt_contents_required(final SubLObject asent, SubLObject sense) {
        if (sense == removal_modules_ist.UNPROVIDED) {
            sense = (SubLObject)removal_modules_ist.NIL;
        }
        final SubLObject v_hlmt = cycl_utilities.atomic_sentence_arg1(asent, (SubLObject)removal_modules_ist.UNPROVIDED);
        final SubLObject formula = el_utilities.literal_atomic_sentence(cycl_utilities.atomic_sentence_arg2(asent, (SubLObject)removal_modules_ist.UNPROVIDED));
        return (SubLObject)SubLObjectFactory.makeBoolean(removal_modules_ist.NIL == kb_indexing.broad_mtP(hlmt.hlmt_monad_mt(v_hlmt)) && removal_modules_ist.NIL == list_utilities.tree_find_if(Symbols.symbol_function((SubLObject)removal_modules_ist.$sym38$FORT_P), formula, (SubLObject)removal_modules_ist.UNPROVIDED));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/modules/removal/removal-modules-ist.lisp", position = 17742L)
    public static SubLObject removal_ist_asserted_mt_contents_cost(final SubLObject asent, SubLObject sense) {
        if (sense == removal_modules_ist.UNPROVIDED) {
            sense = (SubLObject)removal_modules_ist.NIL;
        }
        final SubLObject mt = cycl_utilities.atomic_sentence_arg1(asent, (SubLObject)removal_modules_ist.UNPROVIDED);
        return kb_indexing.num_mt_index(mt);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/modules/removal/removal-modules-ist.lisp", position = 17912L)
    public static SubLObject removal_ist_asserted_mt_contents_iterator(final SubLObject mt, final SubLObject formula) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject result = (SubLObject)removal_modules_ist.NIL;
        final SubLObject pcase_var = kb_mapping_macros.do_mt_contents_method(mt);
        if (pcase_var.eql((SubLObject)removal_modules_ist.$kw41$MT)) {
            if (removal_modules_ist.NIL != kb_mapping_macros.do_mt_index_key_validator(mt, (SubLObject)removal_modules_ist.$kw31$GAF)) {
                final SubLObject final_index_spec = kb_mapping_macros.mt_final_index_spec(mt);
                SubLObject final_index_iterator = (SubLObject)removal_modules_ist.NIL;
                try {
                    final_index_iterator = kb_mapping_macros.new_final_index_iterator(final_index_spec, (SubLObject)removal_modules_ist.$kw31$GAF, (SubLObject)removal_modules_ist.NIL, (SubLObject)removal_modules_ist.NIL);
                    SubLObject done_var = (SubLObject)removal_modules_ist.NIL;
                    final SubLObject token_var = (SubLObject)removal_modules_ist.NIL;
                    while (removal_modules_ist.NIL == done_var) {
                        final SubLObject assertion = iteration.iteration_next_without_values_macro_helper(final_index_iterator, token_var);
                        final SubLObject valid = (SubLObject)SubLObjectFactory.makeBoolean(!token_var.eql(assertion));
                        if (removal_modules_ist.NIL != valid && removal_modules_ist.NIL != backward_utilities.direction_is_relevant(assertion)) {
                            final SubLObject gaf_formula = assertions_high.gaf_el_formula(assertion);
                            thread.resetMultipleValues();
                            final SubLObject v_bindings = unification_utilities.term_unify(formula, gaf_formula, (SubLObject)removal_modules_ist.UNPROVIDED, (SubLObject)removal_modules_ist.UNPROVIDED);
                            final SubLObject unify_justification = thread.secondMultipleValue();
                            thread.resetMultipleValues();
                            if (removal_modules_ist.NIL != v_bindings) {
                                result = (SubLObject)ConsesLow.cons(assertion, result);
                            }
                        }
                        done_var = (SubLObject)SubLObjectFactory.makeBoolean(removal_modules_ist.NIL == valid);
                    }
                }
                finally {
                    final SubLObject _prev_bind_0 = Threads.$is_thread_performing_cleanupP$.currentBinding(thread);
                    try {
                        Threads.$is_thread_performing_cleanupP$.bind((SubLObject)removal_modules_ist.T, thread);
                        final SubLObject _values = Values.getValuesAsVector();
                        if (removal_modules_ist.NIL != final_index_iterator) {
                            kb_mapping_macros.destroy_final_index_iterator(final_index_iterator);
                        }
                        Values.restoreValuesFromVector(_values);
                    }
                    finally {
                        Threads.$is_thread_performing_cleanupP$.rebind(_prev_bind_0, thread);
                    }
                }
            }
        }
        else if (pcase_var.eql((SubLObject)removal_modules_ist.$kw42$BROAD_MT) && removal_modules_ist.NIL != kb_mapping_macros.do_broad_mt_index_key_validator(mt, (SubLObject)removal_modules_ist.$kw31$GAF)) {
            final SubLObject idx = assertion_handles.do_assertions_table();
            final SubLObject mess = (SubLObject)removal_modules_ist.$str43$do_broad_mt_index;
            final SubLObject total = id_index.id_index_count(idx);
            SubLObject sofar = (SubLObject)removal_modules_ist.ZERO_INTEGER;
            assert removal_modules_ist.NIL != Types.stringp(mess) : mess;
            final SubLObject _prev_bind_2 = utilities_macros.$last_percent_progress_index$.currentBinding(thread);
            final SubLObject _prev_bind_3 = utilities_macros.$last_percent_progress_prediction$.currentBinding(thread);
            final SubLObject _prev_bind_4 = utilities_macros.$within_noting_percent_progress$.currentBinding(thread);
            final SubLObject _prev_bind_5 = utilities_macros.$percent_progress_start_time$.currentBinding(thread);
            try {
                utilities_macros.$last_percent_progress_index$.bind((SubLObject)removal_modules_ist.ZERO_INTEGER, thread);
                utilities_macros.$last_percent_progress_prediction$.bind((SubLObject)removal_modules_ist.NIL, thread);
                utilities_macros.$within_noting_percent_progress$.bind((SubLObject)removal_modules_ist.T, thread);
                utilities_macros.$percent_progress_start_time$.bind(Time.get_universal_time(), thread);
                try {
                    utilities_macros.noting_percent_progress_preamble(mess);
                    final SubLObject idx_$27 = idx;
                    if (removal_modules_ist.NIL == id_index.id_index_objects_empty_p(idx_$27, (SubLObject)removal_modules_ist.$kw45$SKIP)) {
                        final SubLObject idx_$28 = idx_$27;
                        if (removal_modules_ist.NIL == id_index.id_index_dense_objects_empty_p(idx_$28, (SubLObject)removal_modules_ist.$kw45$SKIP)) {
                            final SubLObject vector_var = id_index.id_index_dense_objects(idx_$28);
                            final SubLObject backwardP_var = (SubLObject)removal_modules_ist.NIL;
                            SubLObject length;
                            SubLObject v_iteration;
                            SubLObject a_id;
                            SubLObject a_handle;
                            SubLObject assertion2;
                            SubLObject gaf_formula2;
                            SubLObject v_bindings2;
                            SubLObject unify_justification2;
                            for (length = Sequences.length(vector_var), v_iteration = (SubLObject)removal_modules_ist.NIL, v_iteration = (SubLObject)removal_modules_ist.ZERO_INTEGER; v_iteration.numL(length); v_iteration = Numbers.add(v_iteration, (SubLObject)removal_modules_ist.ONE_INTEGER)) {
                                a_id = ((removal_modules_ist.NIL != backwardP_var) ? Numbers.subtract(length, v_iteration, (SubLObject)removal_modules_ist.ONE_INTEGER) : v_iteration);
                                a_handle = Vectors.aref(vector_var, a_id);
                                if (removal_modules_ist.NIL == id_index.id_index_tombstone_p(a_handle) || removal_modules_ist.NIL == id_index.id_index_skip_tombstones_p((SubLObject)removal_modules_ist.$kw45$SKIP)) {
                                    if (removal_modules_ist.NIL != id_index.id_index_tombstone_p(a_handle)) {
                                        a_handle = (SubLObject)removal_modules_ist.$kw45$SKIP;
                                    }
                                    assertion2 = assertion_handles.resolve_assertion_id_value_pair(a_id, a_handle);
                                    if (removal_modules_ist.NIL != kb_mapping_macros.do_broad_mt_index_match_p(assertion2, mt, (SubLObject)removal_modules_ist.$kw31$GAF, (SubLObject)removal_modules_ist.NIL) && removal_modules_ist.NIL != backward_utilities.direction_is_relevant(assertion2)) {
                                        gaf_formula2 = assertions_high.gaf_el_formula(assertion2);
                                        thread.resetMultipleValues();
                                        v_bindings2 = unification_utilities.term_unify(formula, gaf_formula2, (SubLObject)removal_modules_ist.UNPROVIDED, (SubLObject)removal_modules_ist.UNPROVIDED);
                                        unify_justification2 = thread.secondMultipleValue();
                                        thread.resetMultipleValues();
                                        if (removal_modules_ist.NIL != v_bindings2) {
                                            result = (SubLObject)ConsesLow.cons(assertion2, result);
                                        }
                                    }
                                    sofar = Numbers.add(sofar, (SubLObject)removal_modules_ist.ONE_INTEGER);
                                    utilities_macros.note_percent_progress(sofar, total);
                                }
                            }
                        }
                        final SubLObject idx_$29 = idx_$27;
                        if (removal_modules_ist.NIL == id_index.id_index_sparse_objects_empty_p(idx_$29) || removal_modules_ist.NIL == id_index.id_index_skip_tombstones_p((SubLObject)removal_modules_ist.$kw45$SKIP)) {
                            final SubLObject sparse = id_index.id_index_sparse_objects(idx_$29);
                            SubLObject a_id2 = id_index.id_index_sparse_id_threshold(idx_$29);
                            final SubLObject end_id = id_index.id_index_next_id(idx_$29);
                            final SubLObject v_default = (SubLObject)((removal_modules_ist.NIL != id_index.id_index_skip_tombstones_p((SubLObject)removal_modules_ist.$kw45$SKIP)) ? removal_modules_ist.NIL : removal_modules_ist.$kw45$SKIP);
                            while (a_id2.numL(end_id)) {
                                final SubLObject a_handle2 = Hashtables.gethash_without_values(a_id2, sparse, v_default);
                                if (removal_modules_ist.NIL == id_index.id_index_skip_tombstones_p((SubLObject)removal_modules_ist.$kw45$SKIP) || removal_modules_ist.NIL == id_index.id_index_tombstone_p(a_handle2)) {
                                    final SubLObject assertion3 = assertion_handles.resolve_assertion_id_value_pair(a_id2, a_handle2);
                                    if (removal_modules_ist.NIL != kb_mapping_macros.do_broad_mt_index_match_p(assertion3, mt, (SubLObject)removal_modules_ist.$kw31$GAF, (SubLObject)removal_modules_ist.NIL) && removal_modules_ist.NIL != backward_utilities.direction_is_relevant(assertion3)) {
                                        final SubLObject gaf_formula3 = assertions_high.gaf_el_formula(assertion3);
                                        thread.resetMultipleValues();
                                        final SubLObject v_bindings3 = unification_utilities.term_unify(formula, gaf_formula3, (SubLObject)removal_modules_ist.UNPROVIDED, (SubLObject)removal_modules_ist.UNPROVIDED);
                                        final SubLObject unify_justification3 = thread.secondMultipleValue();
                                        thread.resetMultipleValues();
                                        if (removal_modules_ist.NIL != v_bindings3) {
                                            result = (SubLObject)ConsesLow.cons(assertion3, result);
                                        }
                                    }
                                    sofar = Numbers.add(sofar, (SubLObject)removal_modules_ist.ONE_INTEGER);
                                    utilities_macros.note_percent_progress(sofar, total);
                                }
                                a_id2 = Numbers.add(a_id2, (SubLObject)removal_modules_ist.ONE_INTEGER);
                            }
                        }
                    }
                }
                finally {
                    final SubLObject _prev_bind_0_$30 = Threads.$is_thread_performing_cleanupP$.currentBinding(thread);
                    try {
                        Threads.$is_thread_performing_cleanupP$.bind((SubLObject)removal_modules_ist.T, thread);
                        final SubLObject _values2 = Values.getValuesAsVector();
                        utilities_macros.noting_percent_progress_postamble();
                        Values.restoreValuesFromVector(_values2);
                    }
                    finally {
                        Threads.$is_thread_performing_cleanupP$.rebind(_prev_bind_0_$30, thread);
                    }
                }
            }
            finally {
                utilities_macros.$percent_progress_start_time$.rebind(_prev_bind_5, thread);
                utilities_macros.$within_noting_percent_progress$.rebind(_prev_bind_4, thread);
                utilities_macros.$last_percent_progress_prediction$.rebind(_prev_bind_3, thread);
                utilities_macros.$last_percent_progress_index$.rebind(_prev_bind_2, thread);
            }
        }
        if (removal_modules_ist.NIL != result) {
            return iteration.new_inference_list_iterator(result);
        }
        return (SubLObject)removal_modules_ist.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/modules/removal/removal-modules-ist.lisp", position = 19426L)
    public static SubLObject removal_ist_asserted_gaf_lookup_neg_cost(final SubLObject asent, SubLObject sense) {
        if (sense == removal_modules_ist.UNPROVIDED) {
            sense = (SubLObject)removal_modules_ist.NIL;
        }
        return Numbers.subtract((SubLObject)removal_modules_ist.ONE_INTEGER, Numbers.min((SubLObject)removal_modules_ist.ONE_INTEGER, removal_ist_asserted_gaf_lookup_cost(asent)));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/modules/removal/removal-modules-ist.lisp", position = 19815L)
    public static SubLObject removal_ist_asserted_gaf_lookup_neg_expand(final SubLObject asent, SubLObject sense) {
        if (sense == removal_modules_ist.UNPROVIDED) {
            sense = (SubLObject)removal_modules_ist.NIL;
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject mt = cycl_utilities.atomic_sentence_arg1(asent, (SubLObject)removal_modules_ist.UNPROVIDED);
        final SubLObject formula = cycl_utilities.atomic_sentence_arg2(asent, (SubLObject)removal_modules_ist.UNPROVIDED);
        final SubLObject sub_literal = el_utilities.literal_atomic_sentence(formula);
        final SubLObject sub_sense = el_utilities.literal_sense(formula);
        SubLObject found = (SubLObject)removal_modules_ist.NIL;
        final SubLObject _prev_bind_0 = mt_relevance_macros.$relevant_mt_function$.currentBinding(thread);
        final SubLObject _prev_bind_2 = mt_relevance_macros.$mt$.currentBinding(thread);
        try {
            mt_relevance_macros.$relevant_mt_function$.bind((SubLObject)removal_modules_ist.$sym29$RELEVANT_MT_IS_EQ, thread);
            mt_relevance_macros.$mt$.bind(mt, thread);
            final SubLObject source_formula_var = sub_literal;
            SubLObject cdolist_list_var = cycl_utilities.canonical_commutative_permutations(source_formula_var, Symbols.symbol_function((SubLObject)removal_modules_ist.$sym34$HL_VAR_), (SubLObject)removal_modules_ist.T);
            SubLObject permuted_literal = (SubLObject)removal_modules_ist.NIL;
            permuted_literal = cdolist_list_var.first();
            while (removal_modules_ist.NIL != cdolist_list_var) {
                final SubLObject l_index = inference_trampolines.inference_gaf_lookup_index(permuted_literal, sub_sense);
                final SubLObject pcase_var;
                final SubLObject method = pcase_var = kb_mapping_macros.do_gli_extract_method(l_index);
                if (pcase_var.eql((SubLObject)removal_modules_ist.$kw30$GAF_ARG)) {
                    thread.resetMultipleValues();
                    final SubLObject v_term = kb_mapping_macros.do_gli_vga_extract_keys(l_index);
                    final SubLObject argnum = thread.secondMultipleValue();
                    final SubLObject predicate = thread.thirdMultipleValue();
                    thread.resetMultipleValues();
                    if (removal_modules_ist.NIL != argnum) {
                        if (removal_modules_ist.NIL != predicate) {
                            final SubLObject pred_var = predicate;
                            if (removal_modules_ist.NIL != kb_mapping_macros.do_gaf_arg_index_key_validator(v_term, argnum, pred_var)) {
                                final SubLObject iterator_var = kb_mapping_macros.new_gaf_arg_final_index_spec_iterator(v_term, argnum, pred_var);
                                SubLObject done_var = found;
                                final SubLObject token_var = (SubLObject)removal_modules_ist.NIL;
                                while (removal_modules_ist.NIL == done_var) {
                                    final SubLObject final_index_spec = iteration.iteration_next_without_values_macro_helper(iterator_var, token_var);
                                    final SubLObject valid = (SubLObject)SubLObjectFactory.makeBoolean(!token_var.eql(final_index_spec));
                                    if (removal_modules_ist.NIL != valid) {
                                        SubLObject final_index_iterator = (SubLObject)removal_modules_ist.NIL;
                                        try {
                                            final_index_iterator = kb_mapping_macros.new_final_index_iterator(final_index_spec, (SubLObject)removal_modules_ist.$kw31$GAF, enumeration_types.sense_truth(sub_sense), (SubLObject)removal_modules_ist.NIL);
                                            SubLObject done_var_$31 = found;
                                            final SubLObject token_var_$32 = (SubLObject)removal_modules_ist.NIL;
                                            while (removal_modules_ist.NIL == done_var_$31) {
                                                final SubLObject assertion = iteration.iteration_next_without_values_macro_helper(final_index_iterator, token_var_$32);
                                                final SubLObject valid_$33 = (SubLObject)SubLObjectFactory.makeBoolean(!token_var_$32.eql(assertion));
                                                if (removal_modules_ist.NIL != valid_$33) {
                                                    found = removal_ist_asserted_gaf_lookup_neg_expand_internal(assertion, permuted_literal);
                                                }
                                                done_var_$31 = (SubLObject)SubLObjectFactory.makeBoolean(removal_modules_ist.NIL == valid_$33 || removal_modules_ist.NIL != found);
                                            }
                                        }
                                        finally {
                                            final SubLObject _prev_bind_0_$34 = Threads.$is_thread_performing_cleanupP$.currentBinding(thread);
                                            try {
                                                Threads.$is_thread_performing_cleanupP$.bind((SubLObject)removal_modules_ist.T, thread);
                                                final SubLObject _values = Values.getValuesAsVector();
                                                if (removal_modules_ist.NIL != final_index_iterator) {
                                                    kb_mapping_macros.destroy_final_index_iterator(final_index_iterator);
                                                }
                                                Values.restoreValuesFromVector(_values);
                                            }
                                            finally {
                                                Threads.$is_thread_performing_cleanupP$.rebind(_prev_bind_0_$34, thread);
                                            }
                                        }
                                    }
                                    done_var = (SubLObject)SubLObjectFactory.makeBoolean(removal_modules_ist.NIL == valid || removal_modules_ist.NIL != found);
                                }
                            }
                        }
                        else {
                            final SubLObject pred_var = (SubLObject)removal_modules_ist.NIL;
                            if (removal_modules_ist.NIL != kb_mapping_macros.do_gaf_arg_index_key_validator(v_term, argnum, pred_var)) {
                                final SubLObject iterator_var = kb_mapping_macros.new_gaf_arg_final_index_spec_iterator(v_term, argnum, pred_var);
                                SubLObject done_var = found;
                                final SubLObject token_var = (SubLObject)removal_modules_ist.NIL;
                                while (removal_modules_ist.NIL == done_var) {
                                    final SubLObject final_index_spec = iteration.iteration_next_without_values_macro_helper(iterator_var, token_var);
                                    final SubLObject valid = (SubLObject)SubLObjectFactory.makeBoolean(!token_var.eql(final_index_spec));
                                    if (removal_modules_ist.NIL != valid) {
                                        SubLObject final_index_iterator = (SubLObject)removal_modules_ist.NIL;
                                        try {
                                            final_index_iterator = kb_mapping_macros.new_final_index_iterator(final_index_spec, (SubLObject)removal_modules_ist.$kw31$GAF, enumeration_types.sense_truth(sub_sense), (SubLObject)removal_modules_ist.NIL);
                                            SubLObject done_var_$32 = found;
                                            final SubLObject token_var_$33 = (SubLObject)removal_modules_ist.NIL;
                                            while (removal_modules_ist.NIL == done_var_$32) {
                                                final SubLObject assertion = iteration.iteration_next_without_values_macro_helper(final_index_iterator, token_var_$33);
                                                final SubLObject valid_$34 = (SubLObject)SubLObjectFactory.makeBoolean(!token_var_$33.eql(assertion));
                                                if (removal_modules_ist.NIL != valid_$34) {
                                                    found = removal_ist_asserted_gaf_lookup_neg_expand_internal(assertion, permuted_literal);
                                                }
                                                done_var_$32 = (SubLObject)SubLObjectFactory.makeBoolean(removal_modules_ist.NIL == valid_$34 || removal_modules_ist.NIL != found);
                                            }
                                        }
                                        finally {
                                            final SubLObject _prev_bind_0_$35 = Threads.$is_thread_performing_cleanupP$.currentBinding(thread);
                                            try {
                                                Threads.$is_thread_performing_cleanupP$.bind((SubLObject)removal_modules_ist.T, thread);
                                                final SubLObject _values2 = Values.getValuesAsVector();
                                                if (removal_modules_ist.NIL != final_index_iterator) {
                                                    kb_mapping_macros.destroy_final_index_iterator(final_index_iterator);
                                                }
                                                Values.restoreValuesFromVector(_values2);
                                            }
                                            finally {
                                                Threads.$is_thread_performing_cleanupP$.rebind(_prev_bind_0_$35, thread);
                                            }
                                        }
                                    }
                                    done_var = (SubLObject)SubLObjectFactory.makeBoolean(removal_modules_ist.NIL == valid || removal_modules_ist.NIL != found);
                                }
                            }
                        }
                    }
                    else if (removal_modules_ist.NIL != predicate) {
                        final SubLObject pred_var = predicate;
                        if (removal_modules_ist.NIL != kb_mapping_macros.do_gaf_arg_index_key_validator(v_term, (SubLObject)removal_modules_ist.NIL, pred_var)) {
                            final SubLObject iterator_var = kb_mapping_macros.new_gaf_arg_final_index_spec_iterator(v_term, (SubLObject)removal_modules_ist.NIL, pred_var);
                            SubLObject done_var = found;
                            final SubLObject token_var = (SubLObject)removal_modules_ist.NIL;
                            while (removal_modules_ist.NIL == done_var) {
                                final SubLObject final_index_spec = iteration.iteration_next_without_values_macro_helper(iterator_var, token_var);
                                final SubLObject valid = (SubLObject)SubLObjectFactory.makeBoolean(!token_var.eql(final_index_spec));
                                if (removal_modules_ist.NIL != valid) {
                                    SubLObject final_index_iterator = (SubLObject)removal_modules_ist.NIL;
                                    try {
                                        final_index_iterator = kb_mapping_macros.new_final_index_iterator(final_index_spec, (SubLObject)removal_modules_ist.$kw31$GAF, enumeration_types.sense_truth(sub_sense), (SubLObject)removal_modules_ist.NIL);
                                        SubLObject done_var_$33 = found;
                                        final SubLObject token_var_$34 = (SubLObject)removal_modules_ist.NIL;
                                        while (removal_modules_ist.NIL == done_var_$33) {
                                            final SubLObject assertion = iteration.iteration_next_without_values_macro_helper(final_index_iterator, token_var_$34);
                                            final SubLObject valid_$35 = (SubLObject)SubLObjectFactory.makeBoolean(!token_var_$34.eql(assertion));
                                            if (removal_modules_ist.NIL != valid_$35) {
                                                found = removal_ist_asserted_gaf_lookup_neg_expand_internal(assertion, permuted_literal);
                                            }
                                            done_var_$33 = (SubLObject)SubLObjectFactory.makeBoolean(removal_modules_ist.NIL == valid_$35 || removal_modules_ist.NIL != found);
                                        }
                                    }
                                    finally {
                                        final SubLObject _prev_bind_0_$36 = Threads.$is_thread_performing_cleanupP$.currentBinding(thread);
                                        try {
                                            Threads.$is_thread_performing_cleanupP$.bind((SubLObject)removal_modules_ist.T, thread);
                                            final SubLObject _values3 = Values.getValuesAsVector();
                                            if (removal_modules_ist.NIL != final_index_iterator) {
                                                kb_mapping_macros.destroy_final_index_iterator(final_index_iterator);
                                            }
                                            Values.restoreValuesFromVector(_values3);
                                        }
                                        finally {
                                            Threads.$is_thread_performing_cleanupP$.rebind(_prev_bind_0_$36, thread);
                                        }
                                    }
                                }
                                done_var = (SubLObject)SubLObjectFactory.makeBoolean(removal_modules_ist.NIL == valid || removal_modules_ist.NIL != found);
                            }
                        }
                    }
                    else {
                        final SubLObject pred_var = (SubLObject)removal_modules_ist.NIL;
                        if (removal_modules_ist.NIL != kb_mapping_macros.do_gaf_arg_index_key_validator(v_term, (SubLObject)removal_modules_ist.NIL, pred_var)) {
                            final SubLObject iterator_var = kb_mapping_macros.new_gaf_arg_final_index_spec_iterator(v_term, (SubLObject)removal_modules_ist.NIL, pred_var);
                            SubLObject done_var = found;
                            final SubLObject token_var = (SubLObject)removal_modules_ist.NIL;
                            while (removal_modules_ist.NIL == done_var) {
                                final SubLObject final_index_spec = iteration.iteration_next_without_values_macro_helper(iterator_var, token_var);
                                final SubLObject valid = (SubLObject)SubLObjectFactory.makeBoolean(!token_var.eql(final_index_spec));
                                if (removal_modules_ist.NIL != valid) {
                                    SubLObject final_index_iterator = (SubLObject)removal_modules_ist.NIL;
                                    try {
                                        final_index_iterator = kb_mapping_macros.new_final_index_iterator(final_index_spec, (SubLObject)removal_modules_ist.$kw31$GAF, enumeration_types.sense_truth(sub_sense), (SubLObject)removal_modules_ist.NIL);
                                        SubLObject done_var_$34 = found;
                                        final SubLObject token_var_$35 = (SubLObject)removal_modules_ist.NIL;
                                        while (removal_modules_ist.NIL == done_var_$34) {
                                            final SubLObject assertion = iteration.iteration_next_without_values_macro_helper(final_index_iterator, token_var_$35);
                                            final SubLObject valid_$36 = (SubLObject)SubLObjectFactory.makeBoolean(!token_var_$35.eql(assertion));
                                            if (removal_modules_ist.NIL != valid_$36) {
                                                found = removal_ist_asserted_gaf_lookup_neg_expand_internal(assertion, permuted_literal);
                                            }
                                            done_var_$34 = (SubLObject)SubLObjectFactory.makeBoolean(removal_modules_ist.NIL == valid_$36 || removal_modules_ist.NIL != found);
                                        }
                                    }
                                    finally {
                                        final SubLObject _prev_bind_0_$37 = Threads.$is_thread_performing_cleanupP$.currentBinding(thread);
                                        try {
                                            Threads.$is_thread_performing_cleanupP$.bind((SubLObject)removal_modules_ist.T, thread);
                                            final SubLObject _values4 = Values.getValuesAsVector();
                                            if (removal_modules_ist.NIL != final_index_iterator) {
                                                kb_mapping_macros.destroy_final_index_iterator(final_index_iterator);
                                            }
                                            Values.restoreValuesFromVector(_values4);
                                        }
                                        finally {
                                            Threads.$is_thread_performing_cleanupP$.rebind(_prev_bind_0_$37, thread);
                                        }
                                    }
                                }
                                done_var = (SubLObject)SubLObjectFactory.makeBoolean(removal_modules_ist.NIL == valid || removal_modules_ist.NIL != found);
                            }
                        }
                    }
                }
                else if (pcase_var.eql((SubLObject)removal_modules_ist.$kw32$PREDICATE_EXTENT)) {
                    final SubLObject pred_var2 = kb_mapping_macros.do_gli_vpe_extract_key(l_index);
                    if (removal_modules_ist.NIL != kb_mapping_macros.do_predicate_extent_index_key_validator(pred_var2)) {
                        final SubLObject str = (SubLObject)removal_modules_ist.NIL;
                        final SubLObject _prev_bind_0_$38 = utilities_macros.$progress_start_time$.currentBinding(thread);
                        final SubLObject _prev_bind_1_$48 = utilities_macros.$progress_last_pacification_time$.currentBinding(thread);
                        final SubLObject _prev_bind_3 = utilities_macros.$progress_elapsed_seconds_for_notification$.currentBinding(thread);
                        final SubLObject _prev_bind_4 = utilities_macros.$progress_notification_count$.currentBinding(thread);
                        final SubLObject _prev_bind_5 = utilities_macros.$progress_pacifications_since_last_nl$.currentBinding(thread);
                        final SubLObject _prev_bind_6 = utilities_macros.$progress_count$.currentBinding(thread);
                        final SubLObject _prev_bind_7 = utilities_macros.$is_noting_progressP$.currentBinding(thread);
                        final SubLObject _prev_bind_8 = utilities_macros.$silent_progressP$.currentBinding(thread);
                        try {
                            utilities_macros.$progress_start_time$.bind(Time.get_universal_time(), thread);
                            utilities_macros.$progress_last_pacification_time$.bind(utilities_macros.$progress_start_time$.getDynamicValue(thread), thread);
                            utilities_macros.$progress_elapsed_seconds_for_notification$.bind(utilities_macros.$suppress_all_progress_faster_than_seconds$.getDynamicValue(thread), thread);
                            utilities_macros.$progress_notification_count$.bind((SubLObject)removal_modules_ist.ZERO_INTEGER, thread);
                            utilities_macros.$progress_pacifications_since_last_nl$.bind((SubLObject)removal_modules_ist.ZERO_INTEGER, thread);
                            utilities_macros.$progress_count$.bind((SubLObject)removal_modules_ist.ZERO_INTEGER, thread);
                            utilities_macros.$is_noting_progressP$.bind((SubLObject)removal_modules_ist.T, thread);
                            utilities_macros.$silent_progressP$.bind((SubLObject)((removal_modules_ist.NIL != str) ? utilities_macros.$silent_progressP$.getDynamicValue(thread) : removal_modules_ist.T), thread);
                            utilities_macros.noting_progress_preamble(str);
                            final SubLObject iterator_var2 = kb_mapping_macros.new_predicate_extent_final_index_spec_iterator(pred_var2);
                            SubLObject done_var2 = found;
                            final SubLObject token_var2 = (SubLObject)removal_modules_ist.NIL;
                            while (removal_modules_ist.NIL == done_var2) {
                                final SubLObject final_index_spec2 = iteration.iteration_next_without_values_macro_helper(iterator_var2, token_var2);
                                final SubLObject valid2 = (SubLObject)SubLObjectFactory.makeBoolean(!token_var2.eql(final_index_spec2));
                                if (removal_modules_ist.NIL != valid2) {
                                    utilities_macros.note_progress();
                                    SubLObject final_index_iterator2 = (SubLObject)removal_modules_ist.NIL;
                                    try {
                                        final_index_iterator2 = kb_mapping_macros.new_final_index_iterator(final_index_spec2, (SubLObject)removal_modules_ist.$kw31$GAF, enumeration_types.sense_truth(sub_sense), (SubLObject)removal_modules_ist.NIL);
                                        SubLObject done_var_$35 = found;
                                        final SubLObject token_var_$36 = (SubLObject)removal_modules_ist.NIL;
                                        while (removal_modules_ist.NIL == done_var_$35) {
                                            final SubLObject assertion2 = iteration.iteration_next_without_values_macro_helper(final_index_iterator2, token_var_$36);
                                            final SubLObject valid_$37 = (SubLObject)SubLObjectFactory.makeBoolean(!token_var_$36.eql(assertion2));
                                            if (removal_modules_ist.NIL != valid_$37) {
                                                found = removal_ist_asserted_gaf_lookup_neg_expand_internal(assertion2, permuted_literal);
                                            }
                                            done_var_$35 = (SubLObject)SubLObjectFactory.makeBoolean(removal_modules_ist.NIL == valid_$37 || removal_modules_ist.NIL != found);
                                        }
                                    }
                                    finally {
                                        final SubLObject _prev_bind_0_$39 = Threads.$is_thread_performing_cleanupP$.currentBinding(thread);
                                        try {
                                            Threads.$is_thread_performing_cleanupP$.bind((SubLObject)removal_modules_ist.T, thread);
                                            final SubLObject _values5 = Values.getValuesAsVector();
                                            if (removal_modules_ist.NIL != final_index_iterator2) {
                                                kb_mapping_macros.destroy_final_index_iterator(final_index_iterator2);
                                            }
                                            Values.restoreValuesFromVector(_values5);
                                        }
                                        finally {
                                            Threads.$is_thread_performing_cleanupP$.rebind(_prev_bind_0_$39, thread);
                                        }
                                    }
                                }
                                done_var2 = (SubLObject)SubLObjectFactory.makeBoolean(removal_modules_ist.NIL == valid2 || removal_modules_ist.NIL != found);
                            }
                            utilities_macros.noting_progress_postamble();
                        }
                        finally {
                            utilities_macros.$silent_progressP$.rebind(_prev_bind_8, thread);
                            utilities_macros.$is_noting_progressP$.rebind(_prev_bind_7, thread);
                            utilities_macros.$progress_count$.rebind(_prev_bind_6, thread);
                            utilities_macros.$progress_pacifications_since_last_nl$.rebind(_prev_bind_5, thread);
                            utilities_macros.$progress_notification_count$.rebind(_prev_bind_4, thread);
                            utilities_macros.$progress_elapsed_seconds_for_notification$.rebind(_prev_bind_3, thread);
                            utilities_macros.$progress_last_pacification_time$.rebind(_prev_bind_1_$48, thread);
                            utilities_macros.$progress_start_time$.rebind(_prev_bind_0_$38, thread);
                        }
                    }
                }
                else if (pcase_var.eql((SubLObject)removal_modules_ist.$kw33$OVERLAP)) {
                    SubLObject rest;
                    SubLObject assertion3;
                    for (rest = (SubLObject)removal_modules_ist.NIL, rest = virtual_indexing.gather_overlap_index(kb_mapping_macros.do_gli_vo_extract_key(l_index), (SubLObject)removal_modules_ist.UNPROVIDED); removal_modules_ist.NIL == found && removal_modules_ist.NIL != rest; rest = rest.rest()) {
                        assertion3 = rest.first();
                        if (removal_modules_ist.NIL == enumeration_types.sense_truth(sub_sense) || removal_modules_ist.NIL != assertions_high.assertion_has_truth(assertion3, enumeration_types.sense_truth(sub_sense))) {
                            found = removal_ist_asserted_gaf_lookup_neg_expand_internal(assertion3, permuted_literal);
                        }
                    }
                }
                else {
                    kb_mapping_macros.do_gli_method_error(l_index, method);
                }
                cdolist_list_var = cdolist_list_var.rest();
                permuted_literal = cdolist_list_var.first();
            }
        }
        finally {
            mt_relevance_macros.$mt$.rebind(_prev_bind_2, thread);
            mt_relevance_macros.$relevant_mt_function$.rebind(_prev_bind_0, thread);
        }
        if (removal_modules_ist.NIL == found) {
            backward.removal_add_node(arguments.make_hl_support((SubLObject)removal_modules_ist.$kw48$MINIMIZE, cycl_utilities.negate(asent), (SubLObject)removal_modules_ist.UNPROVIDED, (SubLObject)removal_modules_ist.UNPROVIDED), (SubLObject)removal_modules_ist.UNPROVIDED, (SubLObject)removal_modules_ist.UNPROVIDED);
        }
        return (SubLObject)removal_modules_ist.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/modules/removal/removal-modules-ist.lisp", position = 21288L)
    public static SubLObject removal_ist_asserted_gaf_lookup_neg_expand_internal(final SubLObject assertion, final SubLObject formula) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        if (removal_modules_ist.NIL != backward_utilities.direction_is_relevant(assertion)) {
            thread.resetMultipleValues();
            final SubLObject v_bindings = unification_utilities.gaf_asent_unify(formula, assertions_high.gaf_formula(assertion), (SubLObject)removal_modules_ist.UNPROVIDED, (SubLObject)removal_modules_ist.UNPROVIDED);
            final SubLObject gaf_asent = thread.secondMultipleValue();
            final SubLObject unify_justification = thread.thirdMultipleValue();
            thread.resetMultipleValues();
            return list_utilities.sublisp_boolean(v_bindings);
        }
        return (SubLObject)removal_modules_ist.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/modules/removal/removal-modules-ist.lisp", position = 21630L)
    public static SubLObject removal_ist_asserted_unbound_mt_gaf_lookup_pos_required(final SubLObject asent, SubLObject sense) {
        if (sense == removal_modules_ist.UNPROVIDED) {
            sense = (SubLObject)removal_modules_ist.NIL;
        }
        final SubLObject ist_formula = el_utilities.literal_atomic_sentence(cycl_utilities.atomic_sentence_arg2(asent, (SubLObject)removal_modules_ist.UNPROVIDED));
        final SubLObject predicate = cycl_utilities.formula_arg0(ist_formula);
        return fort_types_interface.predicateP(predicate);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/modules/removal/removal-modules-ist.lisp", position = 22229L)
    public static SubLObject removal_ist_asserted_unbound_mt_gaf_lookup_pos_cost(final SubLObject asent, SubLObject sense) {
        if (sense == removal_modules_ist.UNPROVIDED) {
            sense = (SubLObject)removal_modules_ist.NIL;
        }
        return removal_ist_asserted_unbound_mt_gaf_lookup_cost(asent);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/modules/removal/removal-modules-ist.lisp", position = 22404L)
    public static SubLObject removal_ist_asserted_unbound_mt_gaf_lookup_iterator(final SubLObject asent) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject result = (SubLObject)removal_modules_ist.NIL;
        final SubLObject ist_formula = cycl_utilities.atomic_sentence_arg2(asent, (SubLObject)removal_modules_ist.UNPROVIDED);
        final SubLObject mt = cycl_utilities.atomic_sentence_arg1(asent, (SubLObject)removal_modules_ist.UNPROVIDED);
        final SubLObject mt_overlap_cost = virtual_indexing.estimated_num_overlap_index_for_mt(mt);
        final SubLObject sub_literal = el_utilities.literal_atomic_sentence(ist_formula);
        final SubLObject sub_sense = el_utilities.literal_sense(ist_formula);
        final SubLObject _prev_bind_0 = mt_relevance_macros.$relevant_mt_function$.currentBinding(thread);
        final SubLObject _prev_bind_2 = mt_relevance_macros.$mt$.currentBinding(thread);
        try {
            mt_relevance_macros.$relevant_mt_function$.bind((SubLObject)removal_modules_ist.$sym23$RELEVANT_MT_IS_EVERYTHING, thread);
            mt_relevance_macros.$mt$.bind(removal_modules_ist.$const24$EverythingPSC, thread);
            final SubLObject source_formula_var = sub_literal;
            SubLObject cdolist_list_var = cycl_utilities.canonical_commutative_permutations(source_formula_var, Symbols.symbol_function((SubLObject)removal_modules_ist.$sym34$HL_VAR_), (SubLObject)removal_modules_ist.T);
            SubLObject permuted_literal = (SubLObject)removal_modules_ist.NIL;
            permuted_literal = cdolist_list_var.first();
            while (removal_modules_ist.NIL != cdolist_list_var) {
                final SubLObject gaf_cost = inference_trampolines.inference_num_gaf_lookup_index(permuted_literal, sub_sense);
                if (mt_overlap_cost.numL(gaf_cost)) {
                    SubLObject cdolist_list_var_$53 = virtual_indexing.gather_overlap_index_for_mt(mt);
                    SubLObject assertion = (SubLObject)removal_modules_ist.NIL;
                    assertion = cdolist_list_var_$53.first();
                    while (removal_modules_ist.NIL != cdolist_list_var_$53) {
                        final SubLObject v_bindings = removal_ist_asserted_unify(assertion, permuted_literal, mt);
                        if (removal_modules_ist.NIL != v_bindings) {
                            result = (SubLObject)ConsesLow.cons((SubLObject)ConsesLow.list(v_bindings, assertion), result);
                        }
                        cdolist_list_var_$53 = cdolist_list_var_$53.rest();
                        assertion = cdolist_list_var_$53.first();
                    }
                }
                else {
                    final SubLObject l_index = inference_trampolines.inference_gaf_lookup_index(permuted_literal, sub_sense);
                    final SubLObject pcase_var;
                    final SubLObject method = pcase_var = kb_mapping_macros.do_gli_extract_method(l_index);
                    if (pcase_var.eql((SubLObject)removal_modules_ist.$kw30$GAF_ARG)) {
                        thread.resetMultipleValues();
                        final SubLObject v_term = kb_mapping_macros.do_gli_vga_extract_keys(l_index);
                        final SubLObject argnum = thread.secondMultipleValue();
                        final SubLObject predicate = thread.thirdMultipleValue();
                        thread.resetMultipleValues();
                        if (removal_modules_ist.NIL != argnum) {
                            if (removal_modules_ist.NIL != predicate) {
                                final SubLObject pred_var = predicate;
                                if (removal_modules_ist.NIL != kb_mapping_macros.do_gaf_arg_index_key_validator(v_term, argnum, pred_var)) {
                                    final SubLObject iterator_var = kb_mapping_macros.new_gaf_arg_final_index_spec_iterator(v_term, argnum, pred_var);
                                    SubLObject done_var = (SubLObject)removal_modules_ist.NIL;
                                    final SubLObject token_var = (SubLObject)removal_modules_ist.NIL;
                                    while (removal_modules_ist.NIL == done_var) {
                                        final SubLObject final_index_spec = iteration.iteration_next_without_values_macro_helper(iterator_var, token_var);
                                        final SubLObject valid = (SubLObject)SubLObjectFactory.makeBoolean(!token_var.eql(final_index_spec));
                                        if (removal_modules_ist.NIL != valid) {
                                            SubLObject final_index_iterator = (SubLObject)removal_modules_ist.NIL;
                                            try {
                                                final_index_iterator = kb_mapping_macros.new_final_index_iterator(final_index_spec, (SubLObject)removal_modules_ist.$kw31$GAF, enumeration_types.sense_truth(sub_sense), (SubLObject)removal_modules_ist.NIL);
                                                SubLObject done_var_$54 = (SubLObject)removal_modules_ist.NIL;
                                                final SubLObject token_var_$55 = (SubLObject)removal_modules_ist.NIL;
                                                while (removal_modules_ist.NIL == done_var_$54) {
                                                    final SubLObject assertion2 = iteration.iteration_next_without_values_macro_helper(final_index_iterator, token_var_$55);
                                                    final SubLObject valid_$56 = (SubLObject)SubLObjectFactory.makeBoolean(!token_var_$55.eql(assertion2));
                                                    if (removal_modules_ist.NIL != valid_$56) {
                                                        final SubLObject v_bindings2 = removal_ist_asserted_unify(assertion2, permuted_literal, mt);
                                                        if (removal_modules_ist.NIL != v_bindings2) {
                                                            result = (SubLObject)ConsesLow.cons((SubLObject)ConsesLow.list(v_bindings2, assertion2), result);
                                                        }
                                                    }
                                                    done_var_$54 = (SubLObject)SubLObjectFactory.makeBoolean(removal_modules_ist.NIL == valid_$56);
                                                }
                                            }
                                            finally {
                                                final SubLObject _prev_bind_0_$57 = Threads.$is_thread_performing_cleanupP$.currentBinding(thread);
                                                try {
                                                    Threads.$is_thread_performing_cleanupP$.bind((SubLObject)removal_modules_ist.T, thread);
                                                    final SubLObject _values = Values.getValuesAsVector();
                                                    if (removal_modules_ist.NIL != final_index_iterator) {
                                                        kb_mapping_macros.destroy_final_index_iterator(final_index_iterator);
                                                    }
                                                    Values.restoreValuesFromVector(_values);
                                                }
                                                finally {
                                                    Threads.$is_thread_performing_cleanupP$.rebind(_prev_bind_0_$57, thread);
                                                }
                                            }
                                        }
                                        done_var = (SubLObject)SubLObjectFactory.makeBoolean(removal_modules_ist.NIL == valid);
                                    }
                                }
                            }
                            else {
                                final SubLObject pred_var = (SubLObject)removal_modules_ist.NIL;
                                if (removal_modules_ist.NIL != kb_mapping_macros.do_gaf_arg_index_key_validator(v_term, argnum, pred_var)) {
                                    final SubLObject iterator_var = kb_mapping_macros.new_gaf_arg_final_index_spec_iterator(v_term, argnum, pred_var);
                                    SubLObject done_var = (SubLObject)removal_modules_ist.NIL;
                                    final SubLObject token_var = (SubLObject)removal_modules_ist.NIL;
                                    while (removal_modules_ist.NIL == done_var) {
                                        final SubLObject final_index_spec = iteration.iteration_next_without_values_macro_helper(iterator_var, token_var);
                                        final SubLObject valid = (SubLObject)SubLObjectFactory.makeBoolean(!token_var.eql(final_index_spec));
                                        if (removal_modules_ist.NIL != valid) {
                                            SubLObject final_index_iterator = (SubLObject)removal_modules_ist.NIL;
                                            try {
                                                final_index_iterator = kb_mapping_macros.new_final_index_iterator(final_index_spec, (SubLObject)removal_modules_ist.$kw31$GAF, enumeration_types.sense_truth(sub_sense), (SubLObject)removal_modules_ist.NIL);
                                                SubLObject done_var_$55 = (SubLObject)removal_modules_ist.NIL;
                                                final SubLObject token_var_$56 = (SubLObject)removal_modules_ist.NIL;
                                                while (removal_modules_ist.NIL == done_var_$55) {
                                                    final SubLObject assertion2 = iteration.iteration_next_without_values_macro_helper(final_index_iterator, token_var_$56);
                                                    final SubLObject valid_$57 = (SubLObject)SubLObjectFactory.makeBoolean(!token_var_$56.eql(assertion2));
                                                    if (removal_modules_ist.NIL != valid_$57) {
                                                        final SubLObject v_bindings2 = removal_ist_asserted_unify(assertion2, permuted_literal, mt);
                                                        if (removal_modules_ist.NIL != v_bindings2) {
                                                            result = (SubLObject)ConsesLow.cons((SubLObject)ConsesLow.list(v_bindings2, assertion2), result);
                                                        }
                                                    }
                                                    done_var_$55 = (SubLObject)SubLObjectFactory.makeBoolean(removal_modules_ist.NIL == valid_$57);
                                                }
                                            }
                                            finally {
                                                final SubLObject _prev_bind_0_$58 = Threads.$is_thread_performing_cleanupP$.currentBinding(thread);
                                                try {
                                                    Threads.$is_thread_performing_cleanupP$.bind((SubLObject)removal_modules_ist.T, thread);
                                                    final SubLObject _values2 = Values.getValuesAsVector();
                                                    if (removal_modules_ist.NIL != final_index_iterator) {
                                                        kb_mapping_macros.destroy_final_index_iterator(final_index_iterator);
                                                    }
                                                    Values.restoreValuesFromVector(_values2);
                                                }
                                                finally {
                                                    Threads.$is_thread_performing_cleanupP$.rebind(_prev_bind_0_$58, thread);
                                                }
                                            }
                                        }
                                        done_var = (SubLObject)SubLObjectFactory.makeBoolean(removal_modules_ist.NIL == valid);
                                    }
                                }
                            }
                        }
                        else if (removal_modules_ist.NIL != predicate) {
                            final SubLObject pred_var = predicate;
                            if (removal_modules_ist.NIL != kb_mapping_macros.do_gaf_arg_index_key_validator(v_term, (SubLObject)removal_modules_ist.NIL, pred_var)) {
                                final SubLObject iterator_var = kb_mapping_macros.new_gaf_arg_final_index_spec_iterator(v_term, (SubLObject)removal_modules_ist.NIL, pred_var);
                                SubLObject done_var = (SubLObject)removal_modules_ist.NIL;
                                final SubLObject token_var = (SubLObject)removal_modules_ist.NIL;
                                while (removal_modules_ist.NIL == done_var) {
                                    final SubLObject final_index_spec = iteration.iteration_next_without_values_macro_helper(iterator_var, token_var);
                                    final SubLObject valid = (SubLObject)SubLObjectFactory.makeBoolean(!token_var.eql(final_index_spec));
                                    if (removal_modules_ist.NIL != valid) {
                                        SubLObject final_index_iterator = (SubLObject)removal_modules_ist.NIL;
                                        try {
                                            final_index_iterator = kb_mapping_macros.new_final_index_iterator(final_index_spec, (SubLObject)removal_modules_ist.$kw31$GAF, enumeration_types.sense_truth(sub_sense), (SubLObject)removal_modules_ist.NIL);
                                            SubLObject done_var_$56 = (SubLObject)removal_modules_ist.NIL;
                                            final SubLObject token_var_$57 = (SubLObject)removal_modules_ist.NIL;
                                            while (removal_modules_ist.NIL == done_var_$56) {
                                                final SubLObject assertion2 = iteration.iteration_next_without_values_macro_helper(final_index_iterator, token_var_$57);
                                                final SubLObject valid_$58 = (SubLObject)SubLObjectFactory.makeBoolean(!token_var_$57.eql(assertion2));
                                                if (removal_modules_ist.NIL != valid_$58) {
                                                    final SubLObject v_bindings2 = removal_ist_asserted_unify(assertion2, permuted_literal, mt);
                                                    if (removal_modules_ist.NIL != v_bindings2) {
                                                        result = (SubLObject)ConsesLow.cons((SubLObject)ConsesLow.list(v_bindings2, assertion2), result);
                                                    }
                                                }
                                                done_var_$56 = (SubLObject)SubLObjectFactory.makeBoolean(removal_modules_ist.NIL == valid_$58);
                                            }
                                        }
                                        finally {
                                            final SubLObject _prev_bind_0_$59 = Threads.$is_thread_performing_cleanupP$.currentBinding(thread);
                                            try {
                                                Threads.$is_thread_performing_cleanupP$.bind((SubLObject)removal_modules_ist.T, thread);
                                                final SubLObject _values3 = Values.getValuesAsVector();
                                                if (removal_modules_ist.NIL != final_index_iterator) {
                                                    kb_mapping_macros.destroy_final_index_iterator(final_index_iterator);
                                                }
                                                Values.restoreValuesFromVector(_values3);
                                            }
                                            finally {
                                                Threads.$is_thread_performing_cleanupP$.rebind(_prev_bind_0_$59, thread);
                                            }
                                        }
                                    }
                                    done_var = (SubLObject)SubLObjectFactory.makeBoolean(removal_modules_ist.NIL == valid);
                                }
                            }
                        }
                        else {
                            final SubLObject pred_var = (SubLObject)removal_modules_ist.NIL;
                            if (removal_modules_ist.NIL != kb_mapping_macros.do_gaf_arg_index_key_validator(v_term, (SubLObject)removal_modules_ist.NIL, pred_var)) {
                                final SubLObject iterator_var = kb_mapping_macros.new_gaf_arg_final_index_spec_iterator(v_term, (SubLObject)removal_modules_ist.NIL, pred_var);
                                SubLObject done_var = (SubLObject)removal_modules_ist.NIL;
                                final SubLObject token_var = (SubLObject)removal_modules_ist.NIL;
                                while (removal_modules_ist.NIL == done_var) {
                                    final SubLObject final_index_spec = iteration.iteration_next_without_values_macro_helper(iterator_var, token_var);
                                    final SubLObject valid = (SubLObject)SubLObjectFactory.makeBoolean(!token_var.eql(final_index_spec));
                                    if (removal_modules_ist.NIL != valid) {
                                        SubLObject final_index_iterator = (SubLObject)removal_modules_ist.NIL;
                                        try {
                                            final_index_iterator = kb_mapping_macros.new_final_index_iterator(final_index_spec, (SubLObject)removal_modules_ist.$kw31$GAF, enumeration_types.sense_truth(sub_sense), (SubLObject)removal_modules_ist.NIL);
                                            SubLObject done_var_$57 = (SubLObject)removal_modules_ist.NIL;
                                            final SubLObject token_var_$58 = (SubLObject)removal_modules_ist.NIL;
                                            while (removal_modules_ist.NIL == done_var_$57) {
                                                final SubLObject assertion2 = iteration.iteration_next_without_values_macro_helper(final_index_iterator, token_var_$58);
                                                final SubLObject valid_$59 = (SubLObject)SubLObjectFactory.makeBoolean(!token_var_$58.eql(assertion2));
                                                if (removal_modules_ist.NIL != valid_$59) {
                                                    final SubLObject v_bindings2 = removal_ist_asserted_unify(assertion2, permuted_literal, mt);
                                                    if (removal_modules_ist.NIL != v_bindings2) {
                                                        result = (SubLObject)ConsesLow.cons((SubLObject)ConsesLow.list(v_bindings2, assertion2), result);
                                                    }
                                                }
                                                done_var_$57 = (SubLObject)SubLObjectFactory.makeBoolean(removal_modules_ist.NIL == valid_$59);
                                            }
                                        }
                                        finally {
                                            final SubLObject _prev_bind_0_$60 = Threads.$is_thread_performing_cleanupP$.currentBinding(thread);
                                            try {
                                                Threads.$is_thread_performing_cleanupP$.bind((SubLObject)removal_modules_ist.T, thread);
                                                final SubLObject _values4 = Values.getValuesAsVector();
                                                if (removal_modules_ist.NIL != final_index_iterator) {
                                                    kb_mapping_macros.destroy_final_index_iterator(final_index_iterator);
                                                }
                                                Values.restoreValuesFromVector(_values4);
                                            }
                                            finally {
                                                Threads.$is_thread_performing_cleanupP$.rebind(_prev_bind_0_$60, thread);
                                            }
                                        }
                                    }
                                    done_var = (SubLObject)SubLObjectFactory.makeBoolean(removal_modules_ist.NIL == valid);
                                }
                            }
                        }
                    }
                    else if (pcase_var.eql((SubLObject)removal_modules_ist.$kw32$PREDICATE_EXTENT)) {
                        final SubLObject pred_var2 = kb_mapping_macros.do_gli_vpe_extract_key(l_index);
                        if (removal_modules_ist.NIL != kb_mapping_macros.do_predicate_extent_index_key_validator(pred_var2)) {
                            final SubLObject str = (SubLObject)removal_modules_ist.NIL;
                            final SubLObject _prev_bind_0_$61 = utilities_macros.$progress_start_time$.currentBinding(thread);
                            final SubLObject _prev_bind_1_$71 = utilities_macros.$progress_last_pacification_time$.currentBinding(thread);
                            final SubLObject _prev_bind_3 = utilities_macros.$progress_elapsed_seconds_for_notification$.currentBinding(thread);
                            final SubLObject _prev_bind_4 = utilities_macros.$progress_notification_count$.currentBinding(thread);
                            final SubLObject _prev_bind_5 = utilities_macros.$progress_pacifications_since_last_nl$.currentBinding(thread);
                            final SubLObject _prev_bind_6 = utilities_macros.$progress_count$.currentBinding(thread);
                            final SubLObject _prev_bind_7 = utilities_macros.$is_noting_progressP$.currentBinding(thread);
                            final SubLObject _prev_bind_8 = utilities_macros.$silent_progressP$.currentBinding(thread);
                            try {
                                utilities_macros.$progress_start_time$.bind(Time.get_universal_time(), thread);
                                utilities_macros.$progress_last_pacification_time$.bind(utilities_macros.$progress_start_time$.getDynamicValue(thread), thread);
                                utilities_macros.$progress_elapsed_seconds_for_notification$.bind(utilities_macros.$suppress_all_progress_faster_than_seconds$.getDynamicValue(thread), thread);
                                utilities_macros.$progress_notification_count$.bind((SubLObject)removal_modules_ist.ZERO_INTEGER, thread);
                                utilities_macros.$progress_pacifications_since_last_nl$.bind((SubLObject)removal_modules_ist.ZERO_INTEGER, thread);
                                utilities_macros.$progress_count$.bind((SubLObject)removal_modules_ist.ZERO_INTEGER, thread);
                                utilities_macros.$is_noting_progressP$.bind((SubLObject)removal_modules_ist.T, thread);
                                utilities_macros.$silent_progressP$.bind((SubLObject)((removal_modules_ist.NIL != str) ? utilities_macros.$silent_progressP$.getDynamicValue(thread) : removal_modules_ist.T), thread);
                                utilities_macros.noting_progress_preamble(str);
                                final SubLObject iterator_var2 = kb_mapping_macros.new_predicate_extent_final_index_spec_iterator(pred_var2);
                                SubLObject done_var2 = (SubLObject)removal_modules_ist.NIL;
                                final SubLObject token_var2 = (SubLObject)removal_modules_ist.NIL;
                                while (removal_modules_ist.NIL == done_var2) {
                                    final SubLObject final_index_spec2 = iteration.iteration_next_without_values_macro_helper(iterator_var2, token_var2);
                                    final SubLObject valid2 = (SubLObject)SubLObjectFactory.makeBoolean(!token_var2.eql(final_index_spec2));
                                    if (removal_modules_ist.NIL != valid2) {
                                        utilities_macros.note_progress();
                                        SubLObject final_index_iterator2 = (SubLObject)removal_modules_ist.NIL;
                                        try {
                                            final_index_iterator2 = kb_mapping_macros.new_final_index_iterator(final_index_spec2, (SubLObject)removal_modules_ist.$kw31$GAF, enumeration_types.sense_truth(sub_sense), (SubLObject)removal_modules_ist.NIL);
                                            SubLObject done_var_$58 = (SubLObject)removal_modules_ist.NIL;
                                            final SubLObject token_var_$59 = (SubLObject)removal_modules_ist.NIL;
                                            while (removal_modules_ist.NIL == done_var_$58) {
                                                final SubLObject assertion3 = iteration.iteration_next_without_values_macro_helper(final_index_iterator2, token_var_$59);
                                                final SubLObject valid_$60 = (SubLObject)SubLObjectFactory.makeBoolean(!token_var_$59.eql(assertion3));
                                                if (removal_modules_ist.NIL != valid_$60) {
                                                    final SubLObject v_bindings3 = removal_ist_asserted_unify(assertion3, permuted_literal, mt);
                                                    if (removal_modules_ist.NIL != v_bindings3) {
                                                        result = (SubLObject)ConsesLow.cons((SubLObject)ConsesLow.list(v_bindings3, assertion3), result);
                                                    }
                                                }
                                                done_var_$58 = (SubLObject)SubLObjectFactory.makeBoolean(removal_modules_ist.NIL == valid_$60);
                                            }
                                        }
                                        finally {
                                            final SubLObject _prev_bind_0_$62 = Threads.$is_thread_performing_cleanupP$.currentBinding(thread);
                                            try {
                                                Threads.$is_thread_performing_cleanupP$.bind((SubLObject)removal_modules_ist.T, thread);
                                                final SubLObject _values5 = Values.getValuesAsVector();
                                                if (removal_modules_ist.NIL != final_index_iterator2) {
                                                    kb_mapping_macros.destroy_final_index_iterator(final_index_iterator2);
                                                }
                                                Values.restoreValuesFromVector(_values5);
                                            }
                                            finally {
                                                Threads.$is_thread_performing_cleanupP$.rebind(_prev_bind_0_$62, thread);
                                            }
                                        }
                                    }
                                    done_var2 = (SubLObject)SubLObjectFactory.makeBoolean(removal_modules_ist.NIL == valid2);
                                }
                                utilities_macros.noting_progress_postamble();
                            }
                            finally {
                                utilities_macros.$silent_progressP$.rebind(_prev_bind_8, thread);
                                utilities_macros.$is_noting_progressP$.rebind(_prev_bind_7, thread);
                                utilities_macros.$progress_count$.rebind(_prev_bind_6, thread);
                                utilities_macros.$progress_pacifications_since_last_nl$.rebind(_prev_bind_5, thread);
                                utilities_macros.$progress_notification_count$.rebind(_prev_bind_4, thread);
                                utilities_macros.$progress_elapsed_seconds_for_notification$.rebind(_prev_bind_3, thread);
                                utilities_macros.$progress_last_pacification_time$.rebind(_prev_bind_1_$71, thread);
                                utilities_macros.$progress_start_time$.rebind(_prev_bind_0_$61, thread);
                            }
                        }
                    }
                    else if (pcase_var.eql((SubLObject)removal_modules_ist.$kw33$OVERLAP)) {
                        SubLObject cdolist_list_var_$54 = virtual_indexing.gather_overlap_index(kb_mapping_macros.do_gli_vo_extract_key(l_index), (SubLObject)removal_modules_ist.UNPROVIDED);
                        SubLObject assertion4 = (SubLObject)removal_modules_ist.NIL;
                        assertion4 = cdolist_list_var_$54.first();
                        while (removal_modules_ist.NIL != cdolist_list_var_$54) {
                            if (removal_modules_ist.NIL == enumeration_types.sense_truth(sub_sense) || removal_modules_ist.NIL != assertions_high.assertion_has_truth(assertion4, enumeration_types.sense_truth(sub_sense))) {
                                final SubLObject v_bindings4 = removal_ist_asserted_unify(assertion4, permuted_literal, mt);
                                if (removal_modules_ist.NIL != v_bindings4) {
                                    result = (SubLObject)ConsesLow.cons((SubLObject)ConsesLow.list(v_bindings4, assertion4), result);
                                }
                            }
                            cdolist_list_var_$54 = cdolist_list_var_$54.rest();
                            assertion4 = cdolist_list_var_$54.first();
                        }
                    }
                    else {
                        kb_mapping_macros.do_gli_method_error(l_index, method);
                    }
                }
                cdolist_list_var = cdolist_list_var.rest();
                permuted_literal = cdolist_list_var.first();
            }
        }
        finally {
            mt_relevance_macros.$mt$.rebind(_prev_bind_2, thread);
            mt_relevance_macros.$relevant_mt_function$.rebind(_prev_bind_0, thread);
        }
        if (removal_modules_ist.NIL != result) {
            return iteration.new_inference_list_iterator(result);
        }
        return (SubLObject)removal_modules_ist.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/modules/removal/removal-modules-ist.lisp", position = 25046L)
    public static SubLObject removal_ist_asserted_unbound_mt_gaf_lookup_cost(final SubLObject asent) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject mt = cycl_utilities.atomic_sentence_arg1(asent, (SubLObject)removal_modules_ist.UNPROVIDED);
        final SubLObject ist_formula = cycl_utilities.atomic_sentence_arg2(asent, (SubLObject)removal_modules_ist.UNPROVIDED);
        final SubLObject sub_literal = el_utilities.literal_atomic_sentence(ist_formula);
        final SubLObject sub_sense = el_utilities.literal_sense(ist_formula);
        final SubLObject mt_overlap_cost = virtual_indexing.estimated_num_overlap_index_for_mt(mt);
        SubLObject total = (SubLObject)removal_modules_ist.ZERO_INTEGER;
        final SubLObject _prev_bind_0 = mt_relevance_macros.$relevant_mt_function$.currentBinding(thread);
        final SubLObject _prev_bind_2 = mt_relevance_macros.$mt$.currentBinding(thread);
        try {
            mt_relevance_macros.$relevant_mt_function$.bind((SubLObject)removal_modules_ist.$sym23$RELEVANT_MT_IS_EVERYTHING, thread);
            mt_relevance_macros.$mt$.bind(removal_modules_ist.$const24$EverythingPSC, thread);
            final SubLObject source_formula_var = sub_literal;
            SubLObject cdolist_list_var = cycl_utilities.canonical_commutative_permutations(source_formula_var, Symbols.symbol_function((SubLObject)removal_modules_ist.$sym34$HL_VAR_), (SubLObject)removal_modules_ist.T);
            SubLObject permuted_literal = (SubLObject)removal_modules_ist.NIL;
            permuted_literal = cdolist_list_var.first();
            while (removal_modules_ist.NIL != cdolist_list_var) {
                final SubLObject gaf_cost = inference_trampolines.inference_num_gaf_lookup_index(permuted_literal, sub_sense);
                final SubLObject best_cost = Numbers.min(mt_overlap_cost, gaf_cost);
                total = Numbers.add(total, best_cost);
                cdolist_list_var = cdolist_list_var.rest();
                permuted_literal = cdolist_list_var.first();
            }
        }
        finally {
            mt_relevance_macros.$mt$.rebind(_prev_bind_2, thread);
            mt_relevance_macros.$relevant_mt_function$.rebind(_prev_bind_0, thread);
        }
        return total;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/modules/removal/removal-modules-ist.lisp", position = 25687L)
    public static SubLObject removal_ist_asserted_unify(final SubLObject assertion, final SubLObject inference_literal, final SubLObject mt) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        if (removal_modules_ist.NIL != backward_utilities.direction_is_relevant(assertion)) {
            final SubLObject gaf_formula = assertions_high.gaf_formula(assertion);
            final SubLObject gaf_mt = assertions_high.assertion_mt(assertion);
            SubLObject gaf_asent = el_utilities.make_binary_formula(removal_modules_ist.$const28$ist_Asserted, gaf_mt, gaf_formula);
            SubLObject inf_asent = el_utilities.make_binary_formula(removal_modules_ist.$const28$ist_Asserted, mt, inference_literal);
            thread.resetMultipleValues();
            final SubLObject inf_asent_$77 = possibly_simplify_ist_sentences_for_unify(inf_asent, gaf_asent);
            final SubLObject gaf_asent_$78 = thread.secondMultipleValue();
            thread.resetMultipleValues();
            inf_asent = inf_asent_$77;
            gaf_asent = gaf_asent_$78;
            final SubLObject v_bindings = unification_utilities.gaf_asent_unify(inf_asent, gaf_asent, (SubLObject)removal_modules_ist.UNPROVIDED, (SubLObject)removal_modules_ist.UNPROVIDED);
            return v_bindings;
        }
        return (SubLObject)removal_modules_ist.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/modules/removal/removal-modules-ist.lisp", position = 26303L)
    public static SubLObject possibly_simplify_ist_sentences_for_unify(SubLObject inference_asent, SubLObject gaf_asent) {
        if (removal_modules_ist.NIL != el_utilities.ist_sentence_p(inference_asent, (SubLObject)removal_modules_ist.T) && removal_modules_ist.NIL != el_utilities.ist_sentence_p(gaf_asent, (SubLObject)removal_modules_ist.T)) {
            final SubLObject inference_asent_predicate = cycl_utilities.atomic_sentence_predicate(inference_asent);
            final SubLObject inference_asent_mt = el_utilities.designated_mt(inference_asent);
            final SubLObject gaf_asent_predicate = cycl_utilities.atomic_sentence_predicate(gaf_asent);
            final SubLObject gaf_asent_mt = el_utilities.designated_mt(gaf_asent);
            if (removal_modules_ist.NIL != variables.fully_bound_p(gaf_asent_mt) && removal_modules_ist.NIL != variables.fully_bound_p(inference_asent_mt) && removal_modules_ist.NIL != genl_predicates.genl_predP(gaf_asent_predicate, inference_asent_predicate, (SubLObject)removal_modules_ist.UNPROVIDED, (SubLObject)removal_modules_ist.UNPROVIDED) && (removal_modules_ist.NIL != kb_utilities.kbeq(gaf_asent_mt, inference_asent_mt) || (removal_modules_ist.NIL == kb_utilities.kbeq(inference_asent_predicate, removal_modules_ist.$const28$ist_Asserted) && removal_modules_ist.NIL != mt_relevance_macros.mt_relevant_to_mtP(gaf_asent_mt, inference_asent_mt)))) {
                inference_asent = el_utilities.designated_sentence(inference_asent);
                gaf_asent = el_utilities.designated_sentence(gaf_asent);
            }
        }
        return Values.values(inference_asent, gaf_asent);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/modules/removal/removal-modules-ist.lisp", position = 27247L)
    public static SubLObject removal_ist_asserted_unbound_mt_unbound_pred_lookup_pos_required(final SubLObject asent, SubLObject sense) {
        if (sense == removal_modules_ist.UNPROVIDED) {
            sense = (SubLObject)removal_modules_ist.NIL;
        }
        final SubLObject ist_formula = el_utilities.literal_atomic_sentence(cycl_utilities.atomic_sentence_arg2(asent, (SubLObject)removal_modules_ist.UNPROVIDED));
        return Sequences.find_if(Symbols.symbol_function((SubLObject)removal_modules_ist.$sym38$FORT_P), cycl_utilities.atomic_sentence_args(ist_formula, (SubLObject)removal_modules_ist.UNPROVIDED), (SubLObject)removal_modules_ist.UNPROVIDED, (SubLObject)removal_modules_ist.UNPROVIDED, (SubLObject)removal_modules_ist.UNPROVIDED);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/modules/removal/removal-modules-ist.lisp", position = 27781L)
    public static SubLObject removal_ist_asserted_unbound_mt_unbound_pred_lookup_pos_cost(final SubLObject asent, SubLObject sense) {
        if (sense == removal_modules_ist.UNPROVIDED) {
            sense = (SubLObject)removal_modules_ist.NIL;
        }
        return removal_ist_asserted_unbound_mt_gaf_lookup_cost(asent);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/modules/removal/removal-modules-ist.lisp", position = 27965L)
    public static SubLObject removal_ist_asserted_unbound_mt_unbound_pred_lookup_pos_iterator(final SubLObject asent) {
        return removal_ist_asserted_unbound_mt_gaf_lookup_iterator(asent);
    }
    
    public static SubLObject declare_removal_modules_ist_file() {
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.modules.removal.removal_modules_ist", "make_ist_supports", "MAKE-IST-SUPPORTS", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.modules.removal.removal_modules_ist", "make_ist_justification", "MAKE-IST-JUSTIFICATION", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.modules.removal.removal_modules_ist", "make_ist_support", "MAKE-IST-SUPPORT", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.modules.removal.removal_modules_ist", "removal_ist_formula_check_expand", "REMOVAL-IST-FORMULA-CHECK-EXPAND", 1, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.modules.removal.removal_modules_ist", "removal_ist_check_query", "REMOVAL-IST-CHECK-QUERY", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.modules.removal.removal_modules_ist", "removal_ist_pos_gaf_required", "REMOVAL-IST-POS-GAF-REQUIRED", 1, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.modules.removal.removal_modules_ist", "removal_ist_pos_gaf_cost", "REMOVAL-IST-POS-GAF-COST", 1, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.modules.removal.removal_modules_ist", "removal_ist_pos_gaf_expand", "REMOVAL-IST-POS-GAF-EXPAND", 1, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.modules.removal.removal_modules_ist", "removal_ist_pos_gaf_completeness", "REMOVAL-IST-POS-GAF-COMPLETENESS", 1, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.modules.removal.removal_modules_ist", "removal_ist_pos_gaf_query", "REMOVAL-IST-POS-GAF-QUERY", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.modules.removal.removal_modules_ist", "removal_ist_neg_gaf_cost", "REMOVAL-IST-NEG-GAF-COST", 1, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.modules.removal.removal_modules_ist", "removal_ist_neg_gaf_expand", "REMOVAL-IST-NEG-GAF-EXPAND", 1, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.modules.removal.removal_modules_ist", "removal_ist_neg_gaf_query", "REMOVAL-IST-NEG-GAF-QUERY", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.modules.removal.removal_modules_ist", "removal_ist_pos_gaf_mt_lookup_expand", "REMOVAL-IST-POS-GAF-MT-LOOKUP-EXPAND", 1, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.modules.removal.removal_modules_ist", "removal_ist_unbound_mt_gaf_lookup_pos_cost", "REMOVAL-IST-UNBOUND-MT-GAF-LOOKUP-POS-COST", 1, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.modules.removal.removal_modules_ist", "removal_ist_unbound_mt_gaf_lookup_pos_expand", "REMOVAL-IST-UNBOUND-MT-GAF-LOOKUP-POS-EXPAND", 1, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.modules.removal.removal_modules_ist", "make_ist_asserted_justification", "MAKE-IST-ASSERTED-JUSTIFICATION", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.modules.removal.removal_modules_ist", "make_ist_asserted_support", "MAKE-IST-ASSERTED-SUPPORT", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.modules.removal.removal_modules_ist", "removal_ist_asserted_gaf_lookup_pos_cost", "REMOVAL-IST-ASSERTED-GAF-LOOKUP-POS-COST", 1, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.modules.removal.removal_modules_ist", "removal_ist_asserted_gaf_iterator", "REMOVAL-IST-ASSERTED-GAF-ITERATOR", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.modules.removal.removal_modules_ist", "removal_ist_asserted_pred_fort", "REMOVAL-IST-ASSERTED-PRED-FORT", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.modules.removal.removal_modules_ist", "removal_ist_asserted_gaf_lookup_cost", "REMOVAL-IST-ASSERTED-GAF-LOOKUP-COST", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.modules.removal.removal_modules_ist", "removal_ist_asserted_unbound_lookup_pos_required", "REMOVAL-IST-ASSERTED-UNBOUND-LOOKUP-POS-REQUIRED", 1, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.modules.removal.removal_modules_ist", "removal_ist_asserted_unbound_lookup_pos_cost", "REMOVAL-IST-ASSERTED-UNBOUND-LOOKUP-POS-COST", 1, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.modules.removal.removal_modules_ist", "removal_ist_asserted_unbound_lookup_iterator", "REMOVAL-IST-ASSERTED-UNBOUND-LOOKUP-ITERATOR", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.modules.removal.removal_modules_ist", "removal_ist_asserted_mt_contents_required", "REMOVAL-IST-ASSERTED-MT-CONTENTS-REQUIRED", 1, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.modules.removal.removal_modules_ist", "removal_ist_asserted_mt_contents_cost", "REMOVAL-IST-ASSERTED-MT-CONTENTS-COST", 1, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.modules.removal.removal_modules_ist", "removal_ist_asserted_mt_contents_iterator", "REMOVAL-IST-ASSERTED-MT-CONTENTS-ITERATOR", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.modules.removal.removal_modules_ist", "removal_ist_asserted_gaf_lookup_neg_cost", "REMOVAL-IST-ASSERTED-GAF-LOOKUP-NEG-COST", 1, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.modules.removal.removal_modules_ist", "removal_ist_asserted_gaf_lookup_neg_expand", "REMOVAL-IST-ASSERTED-GAF-LOOKUP-NEG-EXPAND", 1, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.modules.removal.removal_modules_ist", "removal_ist_asserted_gaf_lookup_neg_expand_internal", "REMOVAL-IST-ASSERTED-GAF-LOOKUP-NEG-EXPAND-INTERNAL", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.modules.removal.removal_modules_ist", "removal_ist_asserted_unbound_mt_gaf_lookup_pos_required", "REMOVAL-IST-ASSERTED-UNBOUND-MT-GAF-LOOKUP-POS-REQUIRED", 1, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.modules.removal.removal_modules_ist", "removal_ist_asserted_unbound_mt_gaf_lookup_pos_cost", "REMOVAL-IST-ASSERTED-UNBOUND-MT-GAF-LOOKUP-POS-COST", 1, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.modules.removal.removal_modules_ist", "removal_ist_asserted_unbound_mt_gaf_lookup_iterator", "REMOVAL-IST-ASSERTED-UNBOUND-MT-GAF-LOOKUP-ITERATOR", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.modules.removal.removal_modules_ist", "removal_ist_asserted_unbound_mt_gaf_lookup_cost", "REMOVAL-IST-ASSERTED-UNBOUND-MT-GAF-LOOKUP-COST", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.modules.removal.removal_modules_ist", "removal_ist_asserted_unify", "REMOVAL-IST-ASSERTED-UNIFY", 3, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.modules.removal.removal_modules_ist", "possibly_simplify_ist_sentences_for_unify", "POSSIBLY-SIMPLIFY-IST-SENTENCES-FOR-UNIFY", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.modules.removal.removal_modules_ist", "removal_ist_asserted_unbound_mt_unbound_pred_lookup_pos_required", "REMOVAL-IST-ASSERTED-UNBOUND-MT-UNBOUND-PRED-LOOKUP-POS-REQUIRED", 1, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.modules.removal.removal_modules_ist", "removal_ist_asserted_unbound_mt_unbound_pred_lookup_pos_cost", "REMOVAL-IST-ASSERTED-UNBOUND-MT-UNBOUND-PRED-LOOKUP-POS-COST", 1, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.modules.removal.removal_modules_ist", "removal_ist_asserted_unbound_mt_unbound_pred_lookup_pos_iterator", "REMOVAL-IST-ASSERTED-UNBOUND-MT-UNBOUND-PRED-LOOKUP-POS-ITERATOR", 1, 0, false);
        return (SubLObject)removal_modules_ist.NIL;
    }
    
    public static SubLObject init_removal_modules_ist_file() {
        removal_modules_ist.$default_ist_formula_check_cost$ = SubLFiles.defparameter("*DEFAULT-IST-FORMULA-CHECK-COST*", (SubLObject)removal_modules_ist.$float7$1_5);
        removal_modules_ist.$estimated_mts_per_formula$ = SubLFiles.defparameter("*ESTIMATED-MTS-PER-FORMULA*", (SubLObject)removal_modules_ist.TWO_INTEGER);
        removal_modules_ist.$default_ist_pos_gaf_mt_lookup_cost$ = SubLFiles.defparameter("*DEFAULT-IST-POS-GAF-MT-LOOKUP-COST*", removal_modules_ist.$estimated_mts_per_formula$.getDynamicValue());
        return (SubLObject)removal_modules_ist.NIL;
    }
    
    public static SubLObject setup_removal_modules_ist_file() {
        inference_modules.register_solely_specific_removal_module_predicate(removal_modules_ist.$const0$ist);
        preference_modules.inference_preference_module((SubLObject)removal_modules_ist.$kw1$IST_MT_PROP_POS, (SubLObject)removal_modules_ist.$list2);
        preference_modules.inference_preference_module((SubLObject)removal_modules_ist.$kw3$IST_IN_WHAT_MTS_POS, (SubLObject)removal_modules_ist.$list4);
        inference_modules.inference_removal_module((SubLObject)removal_modules_ist.$kw8$REMOVAL_IST_FORMULA_CHECK, (SubLObject)removal_modules_ist.$list9);
        inference_modules.inference_removal_module((SubLObject)removal_modules_ist.$kw11$REMOVAL_IST_POS_GAF, (SubLObject)removal_modules_ist.$list12);
        inference_modules.inference_removal_module((SubLObject)removal_modules_ist.$kw13$REMOVAL_IST_PRED_UNBOUND_POS_GAF, (SubLObject)removal_modules_ist.$list14);
        inference_modules.inference_removal_module((SubLObject)removal_modules_ist.$kw17$REMOVAL_IST_NEG_GAF, (SubLObject)removal_modules_ist.$list18);
        inference_modules.inference_removal_module((SubLObject)removal_modules_ist.$kw21$REMOVAL_IST_POS_GAF_MT_LOOKUP, (SubLObject)removal_modules_ist.$list22);
        inference_modules.inference_removal_module((SubLObject)removal_modules_ist.$kw26$REMOVAL_IST_UNBOUND_MT_GAF_LOOKUP_POS, (SubLObject)removal_modules_ist.$list27);
        inference_modules.register_solely_specific_removal_module_predicate(removal_modules_ist.$const28$ist_Asserted);
        inference_modules.inference_removal_module((SubLObject)removal_modules_ist.$kw36$REMOVAL_IST_ASSERTED_GAF_LOOKUP_POS, (SubLObject)removal_modules_ist.$list37);
        inference_modules.inference_removal_module((SubLObject)removal_modules_ist.$kw39$REMOVAL_IST_ASSERTED_UNBOUND_LOOKUP_POS, (SubLObject)removal_modules_ist.$list40);
        inference_modules.inference_removal_module((SubLObject)removal_modules_ist.$kw46$REMOVAL_IST_ASSERTED_MT_CONTENTS, (SubLObject)removal_modules_ist.$list47);
        inference_modules.inference_removal_module((SubLObject)removal_modules_ist.$kw49$REMOVAL_IST_ASSERTED_GAF_LOOKUP_NEG, (SubLObject)removal_modules_ist.$list50);
        inference_modules.inference_removal_module((SubLObject)removal_modules_ist.$kw51$REMOVAL_IST_ASSERTED_UNBOUND_MT_GAF_LOOKUP_POS, (SubLObject)removal_modules_ist.$list52);
        inference_modules.inference_removal_module((SubLObject)removal_modules_ist.$kw53$REMOVAL_IST_ASSERTED_UNBOUND_MT_UNBOUND_PRED_LOOKUP_POS, (SubLObject)removal_modules_ist.$list54);
        return (SubLObject)removal_modules_ist.NIL;
    }
    
    public void declareFunctions() {
        declare_removal_modules_ist_file();
    }
    
    public void initializeVariables() {
        init_removal_modules_ist_file();
    }
    
    public void runTopLevelForms() {
        setup_removal_modules_ist_file();
    }
    
    static {
        me = (SubLFile)new removal_modules_ist();
        removal_modules_ist.$default_ist_formula_check_cost$ = null;
        removal_modules_ist.$estimated_mts_per_formula$ = null;
        removal_modules_ist.$default_ist_pos_gaf_mt_lookup_cost$ = null;
        $const0$ist = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("ist"));
        $kw1$IST_MT_PROP_POS = SubLObjectFactory.makeKeyword("IST-MT-PROP-POS");
        $list2 = ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("SENSE"), (SubLObject)SubLObjectFactory.makeKeyword("POS"), (SubLObject)SubLObjectFactory.makeKeyword("PREDICATE"), constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("ist")), (SubLObject)SubLObjectFactory.makeKeyword("REQUIRED-PATTERN"), (SubLObject)ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("ist")), (SubLObject)SubLObjectFactory.makeKeyword("NOT-FULLY-BOUND"), (SubLObject)SubLObjectFactory.makeKeyword("VARIABLE")), (SubLObject)SubLObjectFactory.makeKeyword("PREFERENCE-LEVEL"), (SubLObject)SubLObjectFactory.makeKeyword("DISALLOWED"));
        $kw3$IST_IN_WHAT_MTS_POS = SubLObjectFactory.makeKeyword("IST-IN-WHAT-MTS-POS");
        $list4 = ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("SENSE"), (SubLObject)SubLObjectFactory.makeKeyword("POS"), (SubLObject)SubLObjectFactory.makeKeyword("PREDICATE"), constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("ist")), (SubLObject)SubLObjectFactory.makeKeyword("REQUIRED-PATTERN"), (SubLObject)ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("ist")), (SubLObject)SubLObjectFactory.makeKeyword("NOT-FULLY-BOUND"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("NOT"), (SubLObject)SubLObjectFactory.makeKeyword("VARIABLE"))), (SubLObject)SubLObjectFactory.makeKeyword("PREFERENCE-LEVEL"), (SubLObject)SubLObjectFactory.makeKeyword("GROSSLY-DISPREFERRED"));
        $list5 = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("SUPPORT"), (SubLObject)SubLObjectFactory.makeSymbol("&REST"), (SubLObject)SubLObjectFactory.makeSymbol("MORE-SUPPORTS"));
        $kw6$QUERY = SubLObjectFactory.makeKeyword("QUERY");
        $float7$1_5 = (SubLFloat)SubLObjectFactory.makeDouble(1.5);
        $kw8$REMOVAL_IST_FORMULA_CHECK = SubLObjectFactory.makeKeyword("REMOVAL-IST-FORMULA-CHECK");
        $list9 = ConsesLow.list(new SubLObject[] { SubLObjectFactory.makeKeyword("SENSE"), SubLObjectFactory.makeKeyword("POS"), SubLObjectFactory.makeKeyword("PREDICATE"), constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("ist")), SubLObjectFactory.makeKeyword("REQUIRED-PATTERN"), ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("ist")), (SubLObject)SubLObjectFactory.makeKeyword("CLOSED-HLMT"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("AND"), (SubLObject)ConsesLow.cons((SubLObject)SubLObjectFactory.makeKeyword("FULLY-BOUND"), (SubLObject)SubLObjectFactory.makeKeyword("FULLY-BOUND")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("NOT"), (SubLObject)ConsesLow.cons((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("TEST"), (SubLObject)SubLObjectFactory.makeSymbol("INFERENCE-PREDICATE-P")), (SubLObject)SubLObjectFactory.makeKeyword("ANYTHING"))), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("NOT"), (SubLObject)ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("not")), (SubLObject)ConsesLow.cons((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("TEST"), (SubLObject)SubLObjectFactory.makeSymbol("INFERENCE-PREDICATE-P")), (SubLObject)SubLObjectFactory.makeKeyword("ANYTHING")))))), SubLObjectFactory.makeKeyword("COST-EXPRESSION"), SubLObjectFactory.makeSymbol("*DEFAULT-IST-FORMULA-CHECK-COST*"), SubLObjectFactory.makeKeyword("EXPAND"), SubLObjectFactory.makeSymbol("REMOVAL-IST-FORMULA-CHECK-EXPAND"), SubLObjectFactory.makeKeyword("DOCUMENTATION"), SubLObjectFactory.makeString("(#$ist <mt> (<non-predicate> . <fully-bound>))\n    by recursively querying sentence in <mt>\n    and succeeding if the query succeeds"), SubLObjectFactory.makeKeyword("EXAMPLE"), SubLObjectFactory.makeString("(#$ist #$BaseKB\n     (#$thereExists ?SPEC\n      (#$genls ?SPEC #$BinaryRelation)))") });
        $kw10$POS = SubLObjectFactory.makeKeyword("POS");
        $kw11$REMOVAL_IST_POS_GAF = SubLObjectFactory.makeKeyword("REMOVAL-IST-POS-GAF");
        $list12 = ConsesLow.list(new SubLObject[] { SubLObjectFactory.makeKeyword("SENSE"), SubLObjectFactory.makeKeyword("POS"), SubLObjectFactory.makeKeyword("PREDICATE"), constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("ist")), SubLObjectFactory.makeKeyword("REQUIRED-PATTERN"), ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("ist")), (SubLObject)SubLObjectFactory.makeKeyword("CLOSED-HLMT"), (SubLObject)ConsesLow.cons((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("TEST"), (SubLObject)SubLObjectFactory.makeSymbol("INFERENCE-PREDICATE-P")), (SubLObject)SubLObjectFactory.makeKeyword("ANYTHING"))), SubLObjectFactory.makeKeyword("REQUIRED"), SubLObjectFactory.makeSymbol("REMOVAL-IST-POS-GAF-REQUIRED"), SubLObjectFactory.makeKeyword("COST"), SubLObjectFactory.makeSymbol("REMOVAL-IST-POS-GAF-COST"), SubLObjectFactory.makeKeyword("EXPAND"), SubLObjectFactory.makeSymbol("REMOVAL-IST-POS-GAF-EXPAND"), SubLObjectFactory.makeKeyword("COMPLETENESS-PATTERN"), ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("CALL"), (SubLObject)SubLObjectFactory.makeSymbol("REMOVAL-IST-POS-GAF-COMPLETENESS"), (SubLObject)SubLObjectFactory.makeKeyword("INPUT")), SubLObjectFactory.makeKeyword("DOCUMENTATION"), SubLObjectFactory.makeString("(#$ist <mt> (<predicate> . <whatever>))\n    by recursively querying sentence (<predicate> . <whatever>)\n    in <mt>"), SubLObjectFactory.makeKeyword("EXAMPLE"), SubLObjectFactory.makeString("(#$ist #$BaseKB\n     (#$genls ?SPEC #$BinaryRelation))") });
        $kw13$REMOVAL_IST_PRED_UNBOUND_POS_GAF = SubLObjectFactory.makeKeyword("REMOVAL-IST-PRED-UNBOUND-POS-GAF");
        $list14 = ConsesLow.list(new SubLObject[] { SubLObjectFactory.makeKeyword("SENSE"), SubLObjectFactory.makeKeyword("POS"), SubLObjectFactory.makeKeyword("PREDICATE"), constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("ist")), SubLObjectFactory.makeKeyword("REQUIRED-PATTERN"), ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("ist")), (SubLObject)SubLObjectFactory.makeKeyword("CLOSED-HLMT"), (SubLObject)ConsesLow.cons((SubLObject)SubLObjectFactory.makeKeyword("NOT-FULLY-BOUND"), (SubLObject)SubLObjectFactory.makeKeyword("ANYTHING"))), SubLObjectFactory.makeKeyword("REQUIRED"), SubLObjectFactory.makeSymbol("REMOVAL-IST-POS-GAF-REQUIRED"), SubLObjectFactory.makeKeyword("COST"), SubLObjectFactory.makeSymbol("REMOVAL-IST-POS-GAF-COST"), SubLObjectFactory.makeKeyword("EXPAND"), SubLObjectFactory.makeSymbol("REMOVAL-IST-POS-GAF-EXPAND"), SubLObjectFactory.makeKeyword("COMPLETENESS-PATTERN"), ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("CALL"), (SubLObject)SubLObjectFactory.makeSymbol("REMOVAL-IST-POS-GAF-COMPLETENESS"), (SubLObject)SubLObjectFactory.makeKeyword("INPUT")), SubLObjectFactory.makeKeyword("DOCUMENTATION"), SubLObjectFactory.makeString("(#$ist <mt> (<variable> . <whatever>))\n    by recursively querying sentence (<variable> . <whatever>)\n    in <mt>"), SubLObjectFactory.makeKeyword("EXAMPLE"), SubLObjectFactory.makeString("(#$ist #$BaseKB\n     (?PRED ?SPEC #$BinaryRelation))") });
        $kw15$TRUE = SubLObjectFactory.makeKeyword("TRUE");
        $kw16$NEG = SubLObjectFactory.makeKeyword("NEG");
        $kw17$REMOVAL_IST_NEG_GAF = SubLObjectFactory.makeKeyword("REMOVAL-IST-NEG-GAF");
        $list18 = ConsesLow.list(new SubLObject[] { SubLObjectFactory.makeKeyword("SENSE"), SubLObjectFactory.makeKeyword("POS"), SubLObjectFactory.makeKeyword("PREDICATE"), constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("ist")), SubLObjectFactory.makeKeyword("REQUIRED-PATTERN"), ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("ist")), (SubLObject)SubLObjectFactory.makeKeyword("CLOSED-HLMT"), (SubLObject)ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("not")), (SubLObject)ConsesLow.cons((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("TEST"), (SubLObject)SubLObjectFactory.makeSymbol("INFERENCE-PREDICATE-P")), (SubLObject)SubLObjectFactory.makeKeyword("FULLY-BOUND")))), SubLObjectFactory.makeKeyword("COST"), SubLObjectFactory.makeSymbol("REMOVAL-IST-NEG-GAF-COST"), SubLObjectFactory.makeKeyword("EXPAND"), SubLObjectFactory.makeSymbol("REMOVAL-IST-NEG-GAF-EXPAND"), SubLObjectFactory.makeKeyword("DOCUMENTATION"), SubLObjectFactory.makeString("(#$ist <mt> (#$not (<predicate> . <fully-bound>)))\n    by recursively querying sentence (#$not (<predicate> . <fully-bound>))\n    in <mt>"), SubLObjectFactory.makeKeyword("EXAMPLE"), SubLObjectFactory.makeString("(#$ist #$BaseKB\n     (#$not (#$genls #$Microtheory #$BinaryPredicate)))") });
        $kw19$FALSE = SubLObjectFactory.makeKeyword("FALSE");
        $list20 = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("MTS"), (SubLObject)SubLObjectFactory.makeSymbol("JUSTIFICATION"));
        $kw21$REMOVAL_IST_POS_GAF_MT_LOOKUP = SubLObjectFactory.makeKeyword("REMOVAL-IST-POS-GAF-MT-LOOKUP");
        $list22 = ConsesLow.list(new SubLObject[] { SubLObjectFactory.makeKeyword("SENSE"), SubLObjectFactory.makeKeyword("POS"), SubLObjectFactory.makeKeyword("PREDICATE"), constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("ist")), SubLObjectFactory.makeKeyword("REQUIRED-PATTERN"), ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("ist")), (SubLObject)SubLObjectFactory.makeKeyword("NOT-FULLY-BOUND"), (SubLObject)ConsesLow.cons((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("TEST"), (SubLObject)SubLObjectFactory.makeSymbol("INFERENCE-PREDICATE-P")), (SubLObject)SubLObjectFactory.makeKeyword("FULLY-BOUND"))), SubLObjectFactory.makeKeyword("COST-EXPRESSION"), SubLObjectFactory.makeSymbol("*DEFAULT-IST-POS-GAF-MT-LOOKUP-COST*"), SubLObjectFactory.makeKeyword("COMPLETENESS"), SubLObjectFactory.makeKeyword("GROSSLY-INCOMPLETE"), SubLObjectFactory.makeKeyword("EXPAND"), SubLObjectFactory.makeSymbol("REMOVAL-IST-POS-GAF-MT-LOOKUP-EXPAND"), SubLObjectFactory.makeKeyword("DOCUMENTATION"), SubLObjectFactory.makeString("(#$ist <not fully-bound> (<predicate> . <fully-bound>)))\n    by recursively querying formula in #$InferencePSC\n    and computing appropriate mts from the justification."), SubLObjectFactory.makeKeyword("EXAMPLE"), SubLObjectFactory.makeString("(#$ist ?MT (#$genls #$BinaryPredicate #$Relation))") });
        $sym23$RELEVANT_MT_IS_EVERYTHING = SubLObjectFactory.makeSymbol("RELEVANT-MT-IS-EVERYTHING");
        $const24$EverythingPSC = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("EverythingPSC"));
        $const25$InferencePSC = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("InferencePSC"));
        $kw26$REMOVAL_IST_UNBOUND_MT_GAF_LOOKUP_POS = SubLObjectFactory.makeKeyword("REMOVAL-IST-UNBOUND-MT-GAF-LOOKUP-POS");
        $list27 = ConsesLow.list(new SubLObject[] { SubLObjectFactory.makeKeyword("SENSE"), SubLObjectFactory.makeKeyword("POS"), SubLObjectFactory.makeKeyword("PREDICATE"), constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("ist")), SubLObjectFactory.makeKeyword("REQUIRED-PATTERN"), ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("ist")), (SubLObject)SubLObjectFactory.makeKeyword("NOT-FULLY-BOUND"), (SubLObject)ConsesLow.cons((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("TEST"), (SubLObject)SubLObjectFactory.makeSymbol("INFERENCE-PREDICATE-P")), (SubLObject)SubLObjectFactory.makeKeyword("NOT-FULLY-BOUND"))), SubLObjectFactory.makeKeyword("COST"), SubLObjectFactory.makeSymbol("REMOVAL-IST-UNBOUND-MT-GAF-LOOKUP-POS-COST"), SubLObjectFactory.makeKeyword("COMPLETENESS"), SubLObjectFactory.makeKeyword("GROSSLY-INCOMPLETE"), SubLObjectFactory.makeKeyword("EXPAND"), SubLObjectFactory.makeSymbol("REMOVAL-IST-UNBOUND-MT-GAF-LOOKUP-POS-EXPAND"), SubLObjectFactory.makeKeyword("DOCUMENTATION"), SubLObjectFactory.makeString("(#$ist <not-fully-bound> <not-fully-bound>)"), SubLObjectFactory.makeKeyword("EXAMPLE"), SubLObjectFactory.makeString("(#$ist ?MT (#$acquaintedWith #$ThomasPynchon ?WHO))") });
        $const28$ist_Asserted = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("ist-Asserted"));
        $sym29$RELEVANT_MT_IS_EQ = SubLObjectFactory.makeSymbol("RELEVANT-MT-IS-EQ");
        $kw30$GAF_ARG = SubLObjectFactory.makeKeyword("GAF-ARG");
        $kw31$GAF = SubLObjectFactory.makeKeyword("GAF");
        $kw32$PREDICATE_EXTENT = SubLObjectFactory.makeKeyword("PREDICATE-EXTENT");
        $kw33$OVERLAP = SubLObjectFactory.makeKeyword("OVERLAP");
        $sym34$HL_VAR_ = SubLObjectFactory.makeSymbol("HL-VAR?");
        $const35$not = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("not"));
        $kw36$REMOVAL_IST_ASSERTED_GAF_LOOKUP_POS = SubLObjectFactory.makeKeyword("REMOVAL-IST-ASSERTED-GAF-LOOKUP-POS");
        $list37 = ConsesLow.list(new SubLObject[] { SubLObjectFactory.makeKeyword("SENSE"), SubLObjectFactory.makeKeyword("POS"), SubLObjectFactory.makeKeyword("PREDICATE"), constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("ist-Asserted")), SubLObjectFactory.makeKeyword("REQUIRED-PATTERN"), ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("ist-Asserted")), (SubLObject)SubLObjectFactory.makeKeyword("CLOSED-HLMT"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("OR"), (SubLObject)ConsesLow.cons((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("TEST"), (SubLObject)SubLObjectFactory.makeSymbol("REMOVAL-IST-ASSERTED-PRED-FORT")), (SubLObject)SubLObjectFactory.makeKeyword("ANYTHING")), (SubLObject)ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("not")), (SubLObject)ConsesLow.cons((SubLObject)SubLObjectFactory.makeKeyword("FORT"), (SubLObject)SubLObjectFactory.makeKeyword("ANYTHING"))))), SubLObjectFactory.makeKeyword("COST"), SubLObjectFactory.makeSymbol("REMOVAL-IST-ASSERTED-GAF-LOOKUP-POS-COST"), SubLObjectFactory.makeKeyword("COMPLETENESS"), SubLObjectFactory.makeKeyword("COMPLETE"), SubLObjectFactory.makeKeyword("INPUT-EXTRACT-PATTERN"), ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("TEMPLATE"), (SubLObject)ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("ist-Asserted")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("BIND"), (SubLObject)SubLObjectFactory.makeSymbol("MT")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("BIND"), (SubLObject)SubLObjectFactory.makeSymbol("FORMULA"))), (SubLObject)ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("VALUE"), (SubLObject)SubLObjectFactory.makeSymbol("MT")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("VALUE"), (SubLObject)SubLObjectFactory.makeSymbol("FORMULA")))), SubLObjectFactory.makeKeyword("OUTPUT-GENERATE-PATTERN"), ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("CALL"), (SubLObject)SubLObjectFactory.makeSymbol("REMOVAL-IST-ASSERTED-GAF-ITERATOR"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("VALUE"), (SubLObject)SubLObjectFactory.makeSymbol("MT")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("VALUE"), (SubLObject)SubLObjectFactory.makeSymbol("FORMULA"))), SubLObjectFactory.makeKeyword("OUTPUT-DECODE-PATTERN"), ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("TEMPLATE"), (SubLObject)ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("BIND"), (SubLObject)SubLObjectFactory.makeSymbol("BINDINGS")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("BIND"), (SubLObject)SubLObjectFactory.makeSymbol("ASSERTION"))), (SubLObject)ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("VALUE"), (SubLObject)SubLObjectFactory.makeSymbol("BINDINGS")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("VALUE"), (SubLObject)SubLObjectFactory.makeSymbol("ASSERTION")))), SubLObjectFactory.makeKeyword("OUTPUT-CONSTRUCT-PATTERN"), ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("ist-Asserted")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("VALUE"), (SubLObject)SubLObjectFactory.makeSymbol("MT")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("CALL"), (SubLObject)SubLObjectFactory.makeSymbol("SUBST-BINDINGS"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("VALUE"), (SubLObject)SubLObjectFactory.makeSymbol("BINDINGS")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("VALUE"), (SubLObject)SubLObjectFactory.makeSymbol("FORMULA")))), SubLObjectFactory.makeKeyword("SUPPORT-PATTERN"), ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("CALL"), (SubLObject)SubLObjectFactory.makeSymbol("MAKE-IST-ASSERTED-JUSTIFICATION"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("VALUE"), (SubLObject)SubLObjectFactory.makeSymbol("ASSERTION"))), SubLObjectFactory.makeKeyword("DOCUMENTATION"), SubLObjectFactory.makeString("(#$ist-Asserted <mt> (<predicate> . <whatever>))\nusing only the KB GAF indexing and explicit assertions in ARG1 MT involving <predicate>"), SubLObjectFactory.makeKeyword("EXAMPLE"), SubLObjectFactory.makeString("(#$ist-Asserted #$LogicalTruthMt (#$genls #$Predicate ?WHAT))") });
        $sym38$FORT_P = SubLObjectFactory.makeSymbol("FORT-P");
        $kw39$REMOVAL_IST_ASSERTED_UNBOUND_LOOKUP_POS = SubLObjectFactory.makeKeyword("REMOVAL-IST-ASSERTED-UNBOUND-LOOKUP-POS");
        $list40 = ConsesLow.list(new SubLObject[] { SubLObjectFactory.makeKeyword("SENSE"), SubLObjectFactory.makeKeyword("POS"), SubLObjectFactory.makeKeyword("PREDICATE"), constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("ist-Asserted")), SubLObjectFactory.makeKeyword("REQUIRED-PATTERN"), ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("ist-Asserted")), (SubLObject)SubLObjectFactory.makeKeyword("CLOSED-HLMT"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("OR"), (SubLObject)ConsesLow.cons((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("NOT"), (SubLObject)SubLObjectFactory.makeKeyword("FORT")), (SubLObject)SubLObjectFactory.makeKeyword("ANYTHING")), (SubLObject)ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("not")), (SubLObject)ConsesLow.cons((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("NOT"), (SubLObject)SubLObjectFactory.makeKeyword("FORT")), (SubLObject)SubLObjectFactory.makeKeyword("ANYTHING"))))), SubLObjectFactory.makeKeyword("REQUIRED"), SubLObjectFactory.makeSymbol("REMOVAL-IST-ASSERTED-UNBOUND-LOOKUP-POS-REQUIRED"), SubLObjectFactory.makeKeyword("COST"), SubLObjectFactory.makeSymbol("REMOVAL-IST-ASSERTED-UNBOUND-LOOKUP-POS-COST"), SubLObjectFactory.makeKeyword("COMPLETENESS"), SubLObjectFactory.makeKeyword("COMPLETE"), SubLObjectFactory.makeKeyword("INPUT-EXTRACT-PATTERN"), ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("TEMPLATE"), (SubLObject)ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("ist-Asserted")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("BIND"), (SubLObject)SubLObjectFactory.makeSymbol("MT")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("BIND"), (SubLObject)SubLObjectFactory.makeSymbol("FORMULA"))), (SubLObject)ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("VALUE"), (SubLObject)SubLObjectFactory.makeSymbol("MT")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("VALUE"), (SubLObject)SubLObjectFactory.makeSymbol("FORMULA")))), SubLObjectFactory.makeKeyword("OUTPUT-GENERATE-PATTERN"), ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("CALL"), (SubLObject)SubLObjectFactory.makeSymbol("REMOVAL-IST-ASSERTED-UNBOUND-LOOKUP-ITERATOR"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("VALUE"), (SubLObject)SubLObjectFactory.makeSymbol("MT")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("VALUE"), (SubLObject)SubLObjectFactory.makeSymbol("FORMULA"))), SubLObjectFactory.makeKeyword("OUTPUT-DECODE-PATTERN"), ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("TEMPLATE"), (SubLObject)ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("BIND"), (SubLObject)SubLObjectFactory.makeSymbol("BINDINGS")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("BIND"), (SubLObject)SubLObjectFactory.makeSymbol("ASSERTION"))), (SubLObject)ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("VALUE"), (SubLObject)SubLObjectFactory.makeSymbol("BINDINGS")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("VALUE"), (SubLObject)SubLObjectFactory.makeSymbol("ASSERTION")))), SubLObjectFactory.makeKeyword("OUTPUT-CONSTRUCT-PATTERN"), ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("ist-Asserted")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("VALUE"), (SubLObject)SubLObjectFactory.makeSymbol("MT")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("CALL"), (SubLObject)SubLObjectFactory.makeSymbol("SUBST-BINDINGS"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("VALUE"), (SubLObject)SubLObjectFactory.makeSymbol("BINDINGS")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("VALUE"), (SubLObject)SubLObjectFactory.makeSymbol("FORMULA")))), SubLObjectFactory.makeKeyword("SUPPORT-PATTERN"), ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("CALL"), (SubLObject)SubLObjectFactory.makeSymbol("MAKE-IST-ASSERTED-JUSTIFICATION"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("VALUE"), (SubLObject)SubLObjectFactory.makeSymbol("ASSERTION"))), SubLObjectFactory.makeKeyword("DOCUMENTATION"), SubLObjectFactory.makeString("(#$ist-Asserted <mt> (<not fully-bound> ... <fort> ...))\nwhere <mt> is a chlmt-p\nusing only the KB GAF indexing and explicit assertions involving <fort>"), SubLObjectFactory.makeKeyword("EXAMPLE"), SubLObjectFactory.makeString("(#$ist-Asserted #$LogicalTruthMt (?PRED #$Predicate ?WHAT))") });
        $kw41$MT = SubLObjectFactory.makeKeyword("MT");
        $kw42$BROAD_MT = SubLObjectFactory.makeKeyword("BROAD-MT");
        $str43$do_broad_mt_index = SubLObjectFactory.makeString("do-broad-mt-index");
        $sym44$STRINGP = SubLObjectFactory.makeSymbol("STRINGP");
        $kw45$SKIP = SubLObjectFactory.makeKeyword("SKIP");
        $kw46$REMOVAL_IST_ASSERTED_MT_CONTENTS = SubLObjectFactory.makeKeyword("REMOVAL-IST-ASSERTED-MT-CONTENTS");
        $list47 = ConsesLow.list(new SubLObject[] { SubLObjectFactory.makeKeyword("SENSE"), SubLObjectFactory.makeKeyword("POS"), SubLObjectFactory.makeKeyword("PREDICATE"), constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("ist-Asserted")), SubLObjectFactory.makeKeyword("REQUIRED-PATTERN"), ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("ist-Asserted")), (SubLObject)SubLObjectFactory.makeKeyword("CLOSED-HLMT"), (SubLObject)SubLObjectFactory.makeKeyword("NOT-FULLY-BOUND")), SubLObjectFactory.makeKeyword("REQUIRED"), SubLObjectFactory.makeSymbol("REMOVAL-IST-ASSERTED-MT-CONTENTS-REQUIRED"), SubLObjectFactory.makeKeyword("COST"), SubLObjectFactory.makeSymbol("REMOVAL-IST-ASSERTED-MT-CONTENTS-COST"), SubLObjectFactory.makeKeyword("COMPLETENESS"), SubLObjectFactory.makeKeyword("COMPLETE"), SubLObjectFactory.makeKeyword("INPUT-EXTRACT-PATTERN"), ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("TEMPLATE"), (SubLObject)ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("ist-Asserted")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("BIND"), (SubLObject)SubLObjectFactory.makeSymbol("MT")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("BIND"), (SubLObject)SubLObjectFactory.makeSymbol("FORMULA"))), (SubLObject)ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("VALUE"), (SubLObject)SubLObjectFactory.makeSymbol("MT")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("VALUE"), (SubLObject)SubLObjectFactory.makeSymbol("FORMULA")))), SubLObjectFactory.makeKeyword("OUTPUT-GENERATE-PATTERN"), ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("CALL"), (SubLObject)SubLObjectFactory.makeSymbol("REMOVAL-IST-ASSERTED-MT-CONTENTS-ITERATOR"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("VALUE"), (SubLObject)SubLObjectFactory.makeSymbol("MT")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("VALUE"), (SubLObject)SubLObjectFactory.makeSymbol("FORMULA"))), SubLObjectFactory.makeKeyword("OUTPUT-DECODE-PATTERN"), ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("TEMPLATE"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("BIND"), (SubLObject)SubLObjectFactory.makeSymbol("ASSERTION")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("VALUE"), (SubLObject)SubLObjectFactory.makeSymbol("ASSERTION"))), SubLObjectFactory.makeKeyword("OUTPUT-CONSTRUCT-PATTERN"), ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("ist-Asserted")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("VALUE"), (SubLObject)SubLObjectFactory.makeSymbol("MT")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("CALL"), (SubLObject)SubLObjectFactory.makeSymbol("GAF-EL-FORMULA"), (SubLObject)SubLObjectFactory.makeKeyword("INPUT"))), SubLObjectFactory.makeKeyword("SUPPORT-PATTERN"), ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("CALL"), (SubLObject)SubLObjectFactory.makeSymbol("MAKE-IST-ASSERTED-JUSTIFICATION"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("VALUE"), (SubLObject)SubLObjectFactory.makeSymbol("ASSERTION"))), SubLObjectFactory.makeKeyword("DOCUMENTATION"), SubLObjectFactory.makeString("(#$ist-Asserted <fort> <variable>)\nusing only the KB MT indexing and explicit GAF assertions in ARG1 MT"), SubLObjectFactory.makeKeyword("EXAMPLE"), SubLObjectFactory.makeString("(#$ist-Asserted #$ChristmasMythologyMt ?FORMULA)") });
        $kw48$MINIMIZE = SubLObjectFactory.makeKeyword("MINIMIZE");
        $kw49$REMOVAL_IST_ASSERTED_GAF_LOOKUP_NEG = SubLObjectFactory.makeKeyword("REMOVAL-IST-ASSERTED-GAF-LOOKUP-NEG");
        $list50 = ConsesLow.list(new SubLObject[] { SubLObjectFactory.makeKeyword("SENSE"), SubLObjectFactory.makeKeyword("NEG"), SubLObjectFactory.makeKeyword("PREDICATE"), constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("ist-Asserted")), SubLObjectFactory.makeKeyword("REQUIRED-PATTERN"), ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("ist-Asserted")), (SubLObject)SubLObjectFactory.makeKeyword("FORT"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("OR"), (SubLObject)ConsesLow.cons((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("TEST"), (SubLObject)SubLObjectFactory.makeSymbol("REMOVAL-IST-ASSERTED-PRED-FORT")), (SubLObject)SubLObjectFactory.makeKeyword("FULLY-BOUND")), (SubLObject)ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("not")), (SubLObject)ConsesLow.cons((SubLObject)SubLObjectFactory.makeKeyword("FORT"), (SubLObject)SubLObjectFactory.makeKeyword("FULLY-BOUND"))))), SubLObjectFactory.makeKeyword("COST"), SubLObjectFactory.makeSymbol("REMOVAL-IST-ASSERTED-GAF-LOOKUP-NEG-COST"), SubLObjectFactory.makeKeyword("COMPLETENESS"), SubLObjectFactory.makeKeyword("COMPLETE"), SubLObjectFactory.makeKeyword("EXPAND"), SubLObjectFactory.makeSymbol("REMOVAL-IST-ASSERTED-GAF-LOOKUP-NEG-EXPAND"), SubLObjectFactory.makeKeyword("DOCUMENTATION"), SubLObjectFactory.makeString("(#$not (#$ist-Asserted <fort> (<predicate> . <fully-bound>)))\nusing only the KB GAF indexing and explicit assertions in ARG1 MT involving <predicate>"), SubLObjectFactory.makeKeyword("EXAMPLE"), SubLObjectFactory.makeString("(#$not (#$ist-Asserted #$LogicalTruthMt (#$genls #$Predicate #$Thing)))") });
        $kw51$REMOVAL_IST_ASSERTED_UNBOUND_MT_GAF_LOOKUP_POS = SubLObjectFactory.makeKeyword("REMOVAL-IST-ASSERTED-UNBOUND-MT-GAF-LOOKUP-POS");
        $list52 = ConsesLow.list(new SubLObject[] { SubLObjectFactory.makeKeyword("SENSE"), SubLObjectFactory.makeKeyword("POS"), SubLObjectFactory.makeKeyword("PREDICATE"), constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("ist-Asserted")), SubLObjectFactory.makeKeyword("REQUIRED-PATTERN"), ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("ist-Asserted")), (SubLObject)SubLObjectFactory.makeKeyword("NOT-FULLY-BOUND"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("OR"), (SubLObject)ConsesLow.cons((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("TEST"), (SubLObject)SubLObjectFactory.makeSymbol("REMOVAL-IST-ASSERTED-PRED-FORT")), (SubLObject)SubLObjectFactory.makeKeyword("ANYTHING")), (SubLObject)ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("not")), (SubLObject)ConsesLow.cons((SubLObject)SubLObjectFactory.makeKeyword("FORT"), (SubLObject)SubLObjectFactory.makeKeyword("ANYTHING"))))), SubLObjectFactory.makeKeyword("REQUIRED"), SubLObjectFactory.makeSymbol("REMOVAL-IST-ASSERTED-UNBOUND-MT-GAF-LOOKUP-POS-REQUIRED"), SubLObjectFactory.makeKeyword("COST"), SubLObjectFactory.makeSymbol("REMOVAL-IST-ASSERTED-UNBOUND-MT-GAF-LOOKUP-POS-COST"), SubLObjectFactory.makeKeyword("COMPLETENESS"), SubLObjectFactory.makeKeyword("COMPLETE"), SubLObjectFactory.makeKeyword("INPUT-EXTRACT-PATTERN"), ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("TEMPLATE"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("BIND"), (SubLObject)SubLObjectFactory.makeSymbol("ASENT")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("VALUE"), (SubLObject)SubLObjectFactory.makeSymbol("ASENT"))), SubLObjectFactory.makeKeyword("OUTPUT-GENERATE-PATTERN"), ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("CALL"), (SubLObject)SubLObjectFactory.makeSymbol("REMOVAL-IST-ASSERTED-UNBOUND-MT-GAF-LOOKUP-ITERATOR"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("VALUE"), (SubLObject)SubLObjectFactory.makeSymbol("ASENT"))), SubLObjectFactory.makeKeyword("OUTPUT-DECODE-PATTERN"), ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("TEMPLATE"), (SubLObject)ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("BIND"), (SubLObject)SubLObjectFactory.makeSymbol("BINDINGS")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("BIND"), (SubLObject)SubLObjectFactory.makeSymbol("ASSERTION"))), (SubLObject)ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("VALUE"), (SubLObject)SubLObjectFactory.makeSymbol("BINDINGS")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("VALUE"), (SubLObject)SubLObjectFactory.makeSymbol("ASSERTION")))), SubLObjectFactory.makeKeyword("OUTPUT-CONSTRUCT-PATTERN"), ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("ist-Asserted")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("CALL"), (SubLObject)SubLObjectFactory.makeSymbol("ASSERTION-MT"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("VALUE"), (SubLObject)SubLObjectFactory.makeSymbol("ASSERTION"))), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("CALL"), (SubLObject)SubLObjectFactory.makeSymbol("SUBST-BINDINGS"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("VALUE"), (SubLObject)SubLObjectFactory.makeSymbol("BINDINGS")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("CALL"), (SubLObject)SubLObjectFactory.makeSymbol("ATOMIC-SENTENCE-ARG2"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("VALUE"), (SubLObject)SubLObjectFactory.makeSymbol("ASENT"))))), SubLObjectFactory.makeKeyword("SUPPORT-PATTERN"), ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("CALL"), (SubLObject)SubLObjectFactory.makeSymbol("MAKE-IST-ASSERTED-JUSTIFICATION"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("VALUE"), (SubLObject)SubLObjectFactory.makeSymbol("ASSERTION"))), SubLObjectFactory.makeKeyword("DOCUMENTATION"), SubLObjectFactory.makeString("(#$ist-Asserted <not fully-bound> (<predicate> . <anything>))\nusing only the KB GAF indexing and explicit assertions in ARG1 MT involving <predicate>"), SubLObjectFactory.makeKeyword("EXAMPLE"), SubLObjectFactory.makeString("(#$ist-Asserted ?MT (#$genls #$Dog #$CanineAnimal))\n    (#$ist-Asserted ?MT (#$genls #$Dog ?WHAT))") });
        $kw53$REMOVAL_IST_ASSERTED_UNBOUND_MT_UNBOUND_PRED_LOOKUP_POS = SubLObjectFactory.makeKeyword("REMOVAL-IST-ASSERTED-UNBOUND-MT-UNBOUND-PRED-LOOKUP-POS");
        $list54 = ConsesLow.list(new SubLObject[] { SubLObjectFactory.makeKeyword("SENSE"), SubLObjectFactory.makeKeyword("POS"), SubLObjectFactory.makeKeyword("PREDICATE"), constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("ist-Asserted")), SubLObjectFactory.makeKeyword("REQUIRED-PATTERN"), ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("ist-Asserted")), (SubLObject)SubLObjectFactory.makeKeyword("NOT-FULLY-BOUND"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("OR"), (SubLObject)ConsesLow.cons((SubLObject)SubLObjectFactory.makeKeyword("NOT-FULLY-BOUND"), (SubLObject)SubLObjectFactory.makeKeyword("ANYTHING")), (SubLObject)ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("not")), (SubLObject)ConsesLow.cons((SubLObject)SubLObjectFactory.makeKeyword("NOT-FULLY-BOUND"), (SubLObject)SubLObjectFactory.makeKeyword("ANYTHING"))))), SubLObjectFactory.makeKeyword("REQUIRED"), SubLObjectFactory.makeSymbol("REMOVAL-IST-ASSERTED-UNBOUND-MT-UNBOUND-PRED-LOOKUP-POS-REQUIRED"), SubLObjectFactory.makeKeyword("COST"), SubLObjectFactory.makeSymbol("REMOVAL-IST-ASSERTED-UNBOUND-MT-UNBOUND-PRED-LOOKUP-POS-COST"), SubLObjectFactory.makeKeyword("COMPLETENESS"), SubLObjectFactory.makeKeyword("COMPLETE"), SubLObjectFactory.makeKeyword("INPUT-EXTRACT-PATTERN"), ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("TEMPLATE"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("BIND"), (SubLObject)SubLObjectFactory.makeSymbol("ASENT")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("VALUE"), (SubLObject)SubLObjectFactory.makeSymbol("ASENT"))), SubLObjectFactory.makeKeyword("OUTPUT-GENERATE-PATTERN"), ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("CALL"), (SubLObject)SubLObjectFactory.makeSymbol("REMOVAL-IST-ASSERTED-UNBOUND-MT-UNBOUND-PRED-LOOKUP-POS-ITERATOR"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("VALUE"), (SubLObject)SubLObjectFactory.makeSymbol("ASENT"))), SubLObjectFactory.makeKeyword("OUTPUT-DECODE-PATTERN"), ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("TEMPLATE"), (SubLObject)ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("BIND"), (SubLObject)SubLObjectFactory.makeSymbol("BINDINGS")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("BIND"), (SubLObject)SubLObjectFactory.makeSymbol("ASSERTION"))), (SubLObject)ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("VALUE"), (SubLObject)SubLObjectFactory.makeSymbol("BINDINGS")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("VALUE"), (SubLObject)SubLObjectFactory.makeSymbol("ASSERTION")))), SubLObjectFactory.makeKeyword("OUTPUT-CONSTRUCT-PATTERN"), ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("ist-Asserted")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("CALL"), (SubLObject)SubLObjectFactory.makeSymbol("ASSERTION-MT"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("VALUE"), (SubLObject)SubLObjectFactory.makeSymbol("ASSERTION"))), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("CALL"), (SubLObject)SubLObjectFactory.makeSymbol("SUBST-BINDINGS"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("VALUE"), (SubLObject)SubLObjectFactory.makeSymbol("BINDINGS")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("CALL"), (SubLObject)SubLObjectFactory.makeSymbol("ATOMIC-SENTENCE-ARG2"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("VALUE"), (SubLObject)SubLObjectFactory.makeSymbol("ASENT"))))), SubLObjectFactory.makeKeyword("SUPPORT-PATTERN"), ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("CALL"), (SubLObject)SubLObjectFactory.makeSymbol("MAKE-IST-ASSERTED-JUSTIFICATION"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("VALUE"), (SubLObject)SubLObjectFactory.makeSymbol("ASSERTION"))), SubLObjectFactory.makeKeyword("DOCUMENTATION"), SubLObjectFactory.makeString("(#$ist-Asserted <not fully-bound> (<not fully-bound> ... <fort> ...))\nusing only the KB GAF indexing and explicit assertions in ARG1 MT with <fort> in its arg position."), SubLObjectFactory.makeKeyword("EXAMPLE"), SubLObjectFactory.makeString("(#$ist-Asserted ?MT (?PRED #$Madonna ?WHAT))") });
    }
}

/*

	Total time: 1885 ms
	
*/