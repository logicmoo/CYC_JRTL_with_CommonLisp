package com.cyc.cycjava.cycl.inference.modules.removal;

import com.cyc.cycjava.cycl.constant_handles;
import com.cyc.cycjava.cycl.inference.modules.preference_modules;
import com.cyc.cycjava.cycl.inference.harness.inference_modules;
import com.cyc.cycjava.cycl.control_vars;
import com.cyc.tool.subl.util.SubLFiles;
import com.cyc.cycjava.cycl.el_utilities;
import com.cyc.cycjava.cycl.unification_utilities;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.reader;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow;
import com.cyc.cycjava.cycl.list_utilities;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Numbers;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Sequences;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Values;
import com.cyc.cycjava.cycl.forts;
import com.cyc.cycjava.cycl.bindings;
import com.cyc.cycjava.cycl.inference.harness.prove;
import com.cyc.cycjava.cycl.at_vars;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Equality;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory;
import com.cyc.cycjava.cycl.isa;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.SubLThread;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLProcess;
import com.cyc.cycjava.cycl.backward;
import com.cyc.cycjava.cycl.mt_vars;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.conses_high;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Symbols;
import com.cyc.cycjava.cycl.cycl_utilities;
import com.cyc.cycjava.cycl.arguments;
import com.cyc.cycjava.cycl.mt_relevance_macros;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLList;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObject;
import com.cyc.tool.subl.jrtl.nativeCode.type.symbol.SubLSymbol;
import com.cyc.tool.subl.util.SubLFile;
import com.cyc.tool.subl.util.SubLTranslatedFile;

public final class removal_modules_subset_of extends SubLTranslatedFile
{
    public static final SubLFile me;
    public static final String myName = "com.cyc.cycjava.cycl.inference.modules.removal.removal_modules_subset_of";
    public static final String myFingerPrint = "d858e5df7b3a48113aa127e4351ba14762b1a95c30ec588b671b6258bc4c40d6";
    @SubLTranslatedFile.SubL(source = "cycl/inference/modules/removal/removal-modules-subset-of.lisp", position = 4097L)
    private static SubLSymbol $removal_subsetof_theset_theset_cost$;
    @SubLTranslatedFile.SubL(source = "cycl/inference/modules/removal/removal-modules-subset-of.lisp", position = 7120L)
    private static SubLSymbol $removal_subsetof_theset_thesetof_cost$;
    @SubLTranslatedFile.SubL(source = "cycl/inference/modules/removal/removal-modules-subset-of.lisp", position = 10037L)
    private static SubLSymbol $default_subsetof_thesetof_hypothesize_cost$;
    @SubLTranslatedFile.SubL(source = "cycl/inference/modules/removal/removal-modules-subset-of.lisp", position = 11462L)
    private static SubLSymbol $default_genls_thecollectionof_hypothesize_cost$;
    @SubLTranslatedFile.SubL(source = "cycl/inference/modules/removal/removal-modules-subset-of.lisp", position = 15396L)
    private static SubLSymbol $default_subsetof_thesetof_check_cost$;
    @SubLTranslatedFile.SubL(source = "cycl/inference/modules/removal/removal-modules-subset-of.lisp", position = 16308L)
    private static SubLSymbol $default_genls_thecollectionof_check_cost$;
    @SubLTranslatedFile.SubL(source = "cycl/inference/modules/removal/removal-modules-subset-of.lisp", position = 20117L)
    private static SubLSymbol $default_subsetof_unbound_theset_max_cardinality$;
    private static final SubLSymbol $kw0$TRUE_DEF;
    private static final SubLSymbol $kw1$SUBSETOF;
    private static final SubLObject $const2$subsetOf;
    private static final SubLSymbol $kw3$BOTH;
    private static final SubLSymbol $kw4$TRUE_MON;
    private static final SubLSymbol $kw5$REMOVAL_SUBSETOF_THESET_THESET_POS;
    private static final SubLList $list6;
    private static final SubLSymbol $kw7$REMOVAL_SUBSETOF_THESET_THESET_NEG;
    private static final SubLList $list8;
    private static final SubLSymbol $kw9$REMOVAL_SUBSETOF_THESET_THESETOF_POS;
    private static final SubLList $list10;
    private static final SubLSymbol $kw11$REMOVAL_SUBSETOF_THESET_THESETOF_NEG;
    private static final SubLList $list12;
    private static final SubLSymbol $kw13$POS;
    private static final SubLSymbol $kw14$NEG;
    private static final SubLSymbol $kw15$REMOVAL_SUBSETOF_THESETOF_FORT_POS;
    private static final SubLList $list16;
    private static final SubLSymbol $kw17$REMOVAL_SUBSETOF_THESETOF_FORT_NEG;
    private static final SubLList $list18;
    private static final SubLSymbol $kw19$REMOVAL_GENLS_THECOLLECTIONOF_FORT_POS;
    private static final SubLList $list20;
    private static final SubLSymbol $kw21$REMOVAL_GENLS_THECOLLECTIONOF_FORT_NEG;
    private static final SubLList $list22;
    private static final SubLSymbol $kw23$REMOVAL_SUBSETOF_THESETOF_THESETOF_POS;
    private static final SubLList $list24;
    private static final SubLSymbol $kw25$REMOVAL_SUBSETOF_THESETOF_THESETOF_NEG;
    private static final SubLList $list26;
    private static final SubLSymbol $kw27$REMOVAL_GENLS_THECOLLECTIONOF_THECOLLECTIONOF_POS;
    private static final SubLList $list28;
    private static final SubLSymbol $kw29$REMOVAL_GENLS_THECOLLECTIONOF_THECOLLECTIONOF_NEG;
    private static final SubLList $list30;
    private static final SubLObject $const31$TheSet;
    private static final SubLObject $const32$UniversalVocabularyMt;
    private static final SubLSymbol $kw33$REMOVAL_SUBSETOF_VARIABLE_THESET_POS;
    private static final SubLList $list34;
    private static final SubLSymbol $sym35$VARIABLE_P;
    private static final SubLObject $const36$rewriteOf;
    private static final SubLSymbol $kw37$CODE;
    private static final SubLSymbol $kw38$REMOVAL_SUBSETOF_NOT_FULLY_BOUND_THESET_POS;
    private static final SubLList $list39;
    private static final SubLList $list40;
    private static final SubLObject $const41$BaseKB;
    private static final SubLSymbol $kw42$REMOVAL_SUBSETOF_THEEMPTYSET_SET_OR_COLLECTION;
    private static final SubLList $list43;
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/modules/removal/removal-modules-subset-of.lisp", position = 1582L)
    public static SubLObject make_subsetof_hl_support(final SubLObject formula, SubLObject mt, SubLObject tv) {
        if (mt == removal_modules_subset_of.UNPROVIDED) {
            mt = mt_relevance_macros.$mt$.getDynamicValue();
        }
        if (tv == removal_modules_subset_of.UNPROVIDED) {
            tv = (SubLObject)removal_modules_subset_of.$kw0$TRUE_DEF;
        }
        return arguments.make_hl_support((SubLObject)removal_modules_subset_of.$kw1$SUBSETOF, formula, mt, tv);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/modules/removal/removal-modules-subset-of.lisp", position = 1896L)
    public static SubLObject removal_subsetof_theset_theset_pos_expand(final SubLObject asent, SubLObject sense) {
        if (sense == removal_modules_subset_of.UNPROVIDED) {
            sense = (SubLObject)removal_modules_subset_of.NIL;
        }
        final SubLObject subset = cycl_utilities.atomic_sentence_arg1(asent, (SubLObject)removal_modules_subset_of.UNPROVIDED);
        final SubLObject superset = cycl_utilities.atomic_sentence_arg2(asent, (SubLObject)removal_modules_subset_of.UNPROVIDED);
        final SubLObject subset_elements = cycl_utilities.nat_args(subset, (SubLObject)removal_modules_subset_of.UNPROVIDED);
        final SubLObject superset_elements = cycl_utilities.nat_args(superset, (SubLObject)removal_modules_subset_of.UNPROVIDED);
        if (removal_modules_subset_of.NIL != conses_high.subsetp(subset_elements, superset_elements, Symbols.symbol_function((SubLObject)removal_modules_subset_of.EQUAL), (SubLObject)removal_modules_subset_of.UNPROVIDED)) {
            backward.removal_add_node(make_subsetof_hl_support(asent, mt_vars.$subset_of_defining_mt$.getGlobalValue(), (SubLObject)removal_modules_subset_of.$kw4$TRUE_MON), (SubLObject)removal_modules_subset_of.UNPROVIDED, (SubLObject)removal_modules_subset_of.UNPROVIDED);
        }
        return (SubLObject)removal_modules_subset_of.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/modules/removal/removal-modules-subset-of.lisp", position = 2602L)
    public static SubLObject removal_subsetof_theset_theset_neg_expand(final SubLObject asent, SubLObject sense) {
        if (sense == removal_modules_subset_of.UNPROVIDED) {
            sense = (SubLObject)removal_modules_subset_of.NIL;
        }
        final SubLObject subset = cycl_utilities.atomic_sentence_arg1(asent, (SubLObject)removal_modules_subset_of.UNPROVIDED);
        final SubLObject superset = cycl_utilities.atomic_sentence_arg2(asent, (SubLObject)removal_modules_subset_of.UNPROVIDED);
        final SubLObject subset_elements = cycl_utilities.nat_args(subset, (SubLObject)removal_modules_subset_of.UNPROVIDED);
        final SubLObject superset_elements = cycl_utilities.nat_args(superset, (SubLObject)removal_modules_subset_of.UNPROVIDED);
        if (removal_modules_subset_of.NIL == conses_high.subsetp(subset_elements, superset_elements, Symbols.symbol_function((SubLObject)removal_modules_subset_of.EQUAL), (SubLObject)removal_modules_subset_of.UNPROVIDED)) {
            backward.removal_add_node(make_subsetof_hl_support(cycl_utilities.negate(asent), mt_vars.$subset_of_defining_mt$.getGlobalValue(), (SubLObject)removal_modules_subset_of.$kw4$TRUE_MON), (SubLObject)removal_modules_subset_of.UNPROVIDED, (SubLObject)removal_modules_subset_of.UNPROVIDED);
        }
        return (SubLObject)removal_modules_subset_of.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/modules/removal/removal-modules-subset-of.lisp", position = 4211L)
    public static SubLObject removal_subsetof_theset_thesetof_pos_expand(final SubLObject asent, SubLObject sense) {
        if (sense == removal_modules_subset_of.UNPROVIDED) {
            sense = (SubLObject)removal_modules_subset_of.NIL;
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject arg1_set = cycl_utilities.atomic_sentence_arg1(asent, (SubLObject)removal_modules_subset_of.UNPROVIDED);
        final SubLObject arg2_set_of = cycl_utilities.atomic_sentence_arg2(asent, (SubLObject)removal_modules_subset_of.UNPROVIDED);
        SubLObject cdolist_list_var;
        final SubLObject arg1_elements = cdolist_list_var = cycl_utilities.nat_args(arg1_set, (SubLObject)removal_modules_subset_of.UNPROVIDED);
        SubLObject arg1_element = (SubLObject)removal_modules_subset_of.NIL;
        arg1_element = cdolist_list_var.first();
        while (removal_modules_subset_of.NIL != cdolist_list_var) {
            thread.resetMultipleValues();
            final SubLObject result = removal_modules_isa.inference_elementof_thesetof_check(arg1_element, arg2_set_of, (SubLObject)removal_modules_subset_of.UNPROVIDED);
            final SubLObject validP = thread.secondMultipleValue();
            thread.resetMultipleValues();
            if (removal_modules_subset_of.NIL == result && removal_modules_subset_of.NIL != validP) {
                return (SubLObject)removal_modules_subset_of.NIL;
            }
            cdolist_list_var = cdolist_list_var.rest();
            arg1_element = cdolist_list_var.first();
        }
        backward.removal_add_node(make_subsetof_hl_support(asent, (SubLObject)removal_modules_subset_of.UNPROVIDED, (SubLObject)removal_modules_subset_of.UNPROVIDED), (SubLObject)removal_modules_subset_of.UNPROVIDED, (SubLObject)removal_modules_subset_of.UNPROVIDED);
        return (SubLObject)removal_modules_subset_of.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/modules/removal/removal-modules-subset-of.lisp", position = 5280L)
    public static SubLObject removal_subsetof_theset_thesetof_neg_expand(final SubLObject asent, SubLObject sense) {
        if (sense == removal_modules_subset_of.UNPROVIDED) {
            sense = (SubLObject)removal_modules_subset_of.NIL;
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject arg1_set = cycl_utilities.atomic_sentence_arg1(asent, (SubLObject)removal_modules_subset_of.UNPROVIDED);
        final SubLObject arg2_set_of = cycl_utilities.atomic_sentence_arg2(asent, (SubLObject)removal_modules_subset_of.UNPROVIDED);
        SubLObject cdolist_list_var;
        final SubLObject arg1_elements = cdolist_list_var = cycl_utilities.nat_args(arg1_set, (SubLObject)removal_modules_subset_of.UNPROVIDED);
        SubLObject arg1_element = (SubLObject)removal_modules_subset_of.NIL;
        arg1_element = cdolist_list_var.first();
        while (removal_modules_subset_of.NIL != cdolist_list_var) {
            thread.resetMultipleValues();
            final SubLObject result = removal_modules_isa.inference_elementof_thesetof_check(arg1_element, arg2_set_of, (SubLObject)removal_modules_subset_of.UNPROVIDED);
            final SubLObject validP = thread.secondMultipleValue();
            thread.resetMultipleValues();
            if (removal_modules_subset_of.NIL == result && removal_modules_subset_of.NIL != validP) {
                backward.removal_add_node(make_subsetof_hl_support(cycl_utilities.negate(asent), (SubLObject)removal_modules_subset_of.UNPROVIDED, (SubLObject)removal_modules_subset_of.UNPROVIDED), (SubLObject)removal_modules_subset_of.UNPROVIDED, (SubLObject)removal_modules_subset_of.UNPROVIDED);
                return (SubLObject)removal_modules_subset_of.NIL;
            }
            cdolist_list_var = cdolist_list_var.rest();
            arg1_element = cdolist_list_var.first();
        }
        return (SubLObject)removal_modules_subset_of.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/modules/removal/removal-modules-subset-of.lisp", position = 7215L)
    public static SubLObject removal_subsetof_thesetof_fort_pos_expand(final SubLObject asent, SubLObject sense) {
        if (sense == removal_modules_subset_of.UNPROVIDED) {
            sense = (SubLObject)removal_modules_subset_of.NIL;
        }
        return removal_subsetof_thesetof_fort_expand(asent, (SubLObject)removal_modules_subset_of.$kw13$POS);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/modules/removal/removal-modules-subset-of.lisp", position = 8705L)
    public static SubLObject removal_subsetof_thesetof_fort_neg_expand(final SubLObject asent, SubLObject sense) {
        if (sense == removal_modules_subset_of.UNPROVIDED) {
            sense = (SubLObject)removal_modules_subset_of.NIL;
        }
        return removal_subsetof_thesetof_fort_expand(asent, (SubLObject)removal_modules_subset_of.$kw14$NEG);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/modules/removal/removal-modules-subset-of.lisp", position = 10130L)
    public static SubLObject removal_subsetof_thesetof_fort_expand(final SubLObject asent, final SubLObject sense) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject the_set_of = cycl_utilities.atomic_sentence_arg1(asent, (SubLObject)removal_modules_subset_of.UNPROVIDED);
        final SubLObject set_formula = cycl_utilities.nat_arg2(the_set_of, (SubLObject)removal_modules_subset_of.UNPROVIDED);
        final SubLObject collection = cycl_utilities.atomic_sentence_arg2(asent, (SubLObject)removal_modules_subset_of.UNPROVIDED);
        thread.resetMultipleValues();
        final SubLObject hypothetical_mt = inference_hypothesize_element(set_formula, (SubLObject)removal_modules_subset_of.UNPROVIDED);
        final SubLObject hypothetical_element = thread.secondMultipleValue();
        thread.resetMultipleValues();
        final SubLObject subset = (SubLObject)SubLObjectFactory.makeBoolean(removal_modules_subset_of.NIL != hypothetical_mt && removal_modules_subset_of.NIL != hypothetical_element && removal_modules_subset_of.NIL != isa.isaP(hypothetical_element, collection, hypothetical_mt, (SubLObject)removal_modules_subset_of.UNPROVIDED));
        if (removal_modules_subset_of.NIL != ((removal_modules_subset_of.NIL != subset) ? Equality.eq((SubLObject)removal_modules_subset_of.$kw13$POS, sense) : Equality.eq((SubLObject)removal_modules_subset_of.$kw14$NEG, sense))) {
            SubLObject support_formula = asent;
            if (removal_modules_subset_of.$kw14$NEG == sense) {
                support_formula = cycl_utilities.negate(support_formula);
            }
            backward.removal_add_node(make_subsetof_hl_support(support_formula, (SubLObject)removal_modules_subset_of.UNPROVIDED, (SubLObject)removal_modules_subset_of.UNPROVIDED), (SubLObject)removal_modules_subset_of.UNPROVIDED, (SubLObject)removal_modules_subset_of.UNPROVIDED);
        }
        return (SubLObject)removal_modules_subset_of.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/modules/removal/removal-modules-subset-of.lisp", position = 10844L)
    public static SubLObject inference_hypothesize_element(final SubLObject set_formula, SubLObject mt) {
        if (mt == removal_modules_subset_of.UNPROVIDED) {
            mt = mt_relevance_macros.$mt$.getDynamicValue();
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject hypothetical_mt = (SubLObject)removal_modules_subset_of.NIL;
        SubLObject hypothetical_element = (SubLObject)removal_modules_subset_of.NIL;
        final SubLObject _prev_bind_0 = at_vars.$at_apply_necessary_defnsP$.currentBinding(thread);
        try {
            at_vars.$at_apply_necessary_defnsP$.bind((SubLObject)removal_modules_subset_of.NIL, thread);
            thread.resetMultipleValues();
            final SubLObject hyp_mt = prove.prepare_hypothesis_mt(set_formula, mt, (SubLObject)removal_modules_subset_of.ZERO_INTEGER);
            final SubLObject term_bindings = thread.secondMultipleValue();
            final SubLObject failure_reasons = thread.thirdMultipleValue();
            thread.resetMultipleValues();
            if (removal_modules_subset_of.NIL == failure_reasons) {
                final SubLObject binding = term_bindings.first();
                final SubLObject hyp_element = bindings.variable_binding_value(binding);
                if (removal_modules_subset_of.NIL != forts.fort_p(hyp_element)) {
                    hypothetical_mt = hyp_mt;
                    hypothetical_element = hyp_element;
                }
            }
        }
        finally {
            at_vars.$at_apply_necessary_defnsP$.rebind(_prev_bind_0, thread);
        }
        if (removal_modules_subset_of.NIL != hypothetical_element) {
            return Values.values(hypothetical_mt, hypothetical_element);
        }
        return (SubLObject)removal_modules_subset_of.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/modules/removal/removal-modules-subset-of.lisp", position = 11675L)
    public static SubLObject removal_genls_thecollectionof_fort_pos_expand(final SubLObject asent, SubLObject sense) {
        if (sense == removal_modules_subset_of.UNPROVIDED) {
            sense = (SubLObject)removal_modules_subset_of.NIL;
        }
        return removal_subsetof_thesetof_fort_expand(asent, (SubLObject)removal_modules_subset_of.$kw13$POS);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/modules/removal/removal-modules-subset-of.lisp", position = 11839L)
    public static SubLObject removal_genls_thecollectionof_fort_neg_expand(final SubLObject asent, SubLObject sense) {
        if (sense == removal_modules_subset_of.UNPROVIDED) {
            sense = (SubLObject)removal_modules_subset_of.NIL;
        }
        return removal_subsetof_thesetof_fort_expand(asent, (SubLObject)removal_modules_subset_of.$kw14$NEG);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/modules/removal/removal-modules-subset-of.lisp", position = 13231L)
    public static SubLObject removal_subsetof_thesetof_thesetof_pos_expand(final SubLObject asent, SubLObject sense) {
        if (sense == removal_modules_subset_of.UNPROVIDED) {
            sense = (SubLObject)removal_modules_subset_of.NIL;
        }
        return removal_subsetof_thesetof_thesetof_expand(asent, (SubLObject)removal_modules_subset_of.$kw13$POS);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/modules/removal/removal-modules-subset-of.lisp", position = 13733L)
    public static SubLObject removal_subsetof_thesetof_thesetof_neg_expand(final SubLObject asent, SubLObject sense) {
        if (sense == removal_modules_subset_of.UNPROVIDED) {
            sense = (SubLObject)removal_modules_subset_of.NIL;
        }
        return removal_subsetof_thesetof_thesetof_expand(asent, (SubLObject)removal_modules_subset_of.$kw14$NEG);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/modules/removal/removal-modules-subset-of.lisp", position = 15483L)
    public static SubLObject removal_subsetof_thesetof_thesetof_expand(final SubLObject asent, final SubLObject sense) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject the_set_of_sub = cycl_utilities.atomic_sentence_arg1(asent, (SubLObject)removal_modules_subset_of.UNPROVIDED);
        final SubLObject set_formula_sub = cycl_utilities.nat_arg2(the_set_of_sub, (SubLObject)removal_modules_subset_of.UNPROVIDED);
        final SubLObject the_set_of_super = cycl_utilities.atomic_sentence_arg2(asent, (SubLObject)removal_modules_subset_of.UNPROVIDED);
        thread.resetMultipleValues();
        final SubLObject hypothetical_mt = inference_hypothesize_element(set_formula_sub, (SubLObject)removal_modules_subset_of.UNPROVIDED);
        final SubLObject hypothetical_element = thread.secondMultipleValue();
        thread.resetMultipleValues();
        if (removal_modules_subset_of.NIL != hypothetical_mt && removal_modules_subset_of.NIL != hypothetical_element) {
            thread.resetMultipleValues();
            final SubLObject subset = removal_modules_isa.inference_elementof_thesetof_check(hypothetical_element, the_set_of_super, hypothetical_mt);
            final SubLObject validP = thread.secondMultipleValue();
            thread.resetMultipleValues();
            if (removal_modules_subset_of.NIL != validP && removal_modules_subset_of.NIL != ((removal_modules_subset_of.NIL != subset) ? Equality.eq((SubLObject)removal_modules_subset_of.$kw13$POS, sense) : Equality.eq((SubLObject)removal_modules_subset_of.$kw14$NEG, sense))) {
                SubLObject support_formula = asent;
                if (removal_modules_subset_of.$kw14$NEG == sense) {
                    support_formula = cycl_utilities.negate(support_formula);
                }
                backward.removal_add_node(arguments.make_hl_support((SubLObject)removal_modules_subset_of.$kw1$SUBSETOF, support_formula, (SubLObject)removal_modules_subset_of.UNPROVIDED, (SubLObject)removal_modules_subset_of.UNPROVIDED), (SubLObject)removal_modules_subset_of.UNPROVIDED, (SubLObject)removal_modules_subset_of.UNPROVIDED);
            }
        }
        return (SubLObject)removal_modules_subset_of.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/modules/removal/removal-modules-subset-of.lisp", position = 16436L)
    public static SubLObject removal_genls_thecollectionof_thecollectionof_pos_expand(final SubLObject asent, SubLObject sense) {
        if (sense == removal_modules_subset_of.UNPROVIDED) {
            sense = (SubLObject)removal_modules_subset_of.NIL;
        }
        return removal_subsetof_thesetof_thesetof_expand(asent, (SubLObject)removal_modules_subset_of.$kw13$POS);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/modules/removal/removal-modules-subset-of.lisp", position = 16615L)
    public static SubLObject removal_genls_thecollectionof_thecollectionof_neg_expand(final SubLObject asent, SubLObject sense) {
        if (sense == removal_modules_subset_of.UNPROVIDED) {
            sense = (SubLObject)removal_modules_subset_of.NIL;
        }
        return removal_subsetof_thesetof_thesetof_expand(asent, (SubLObject)removal_modules_subset_of.$kw14$NEG);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/modules/removal/removal-modules-subset-of.lisp", position = 18581L)
    public static SubLObject removal_subsetof_variable_theset_cost(final SubLObject asent) {
        return Numbers.expt((SubLObject)removal_modules_subset_of.TWO_INTEGER, Sequences.length(cycl_utilities.nat_args(cycl_utilities.atomic_sentence_arg2(asent, (SubLObject)removal_modules_subset_of.UNPROVIDED), (SubLObject)removal_modules_subset_of.UNPROVIDED)));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/modules/removal/removal-modules-subset-of.lisp", position = 18916L)
    public static SubLObject removal_subsetof_variable_theset_expand(final SubLObject asent, final SubLObject sense) {
        final SubLObject arg1 = cycl_utilities.atomic_sentence_arg1(asent, (SubLObject)removal_modules_subset_of.UNPROVIDED);
        final SubLObject arg2 = cycl_utilities.atomic_sentence_arg2(asent, (SubLObject)removal_modules_subset_of.UNPROVIDED);
        final SubLObject superset = cycl_utilities.nat_args(arg2, (SubLObject)removal_modules_subset_of.UNPROVIDED);
        SubLObject cdolist_list_var = list_utilities.powerset(superset);
        SubLObject subset = (SubLObject)removal_modules_subset_of.NIL;
        subset = cdolist_list_var.first();
        while (removal_modules_subset_of.NIL != cdolist_list_var) {
            final SubLObject v_bindings = unification_utilities.term_unify(arg1, reader.bq_cons(removal_modules_subset_of.$const31$TheSet, ConsesLow.append(subset, (SubLObject)removal_modules_subset_of.NIL)), (SubLObject)removal_modules_subset_of.UNPROVIDED, (SubLObject)removal_modules_subset_of.UNPROVIDED);
            if (removal_modules_subset_of.NIL != v_bindings) {
                final SubLObject unify_arg1 = bindings.subst_bindings(v_bindings, arg1);
                final SubLObject formula = (SubLObject)ConsesLow.list(removal_modules_subset_of.$const2$subsetOf, unify_arg1, arg2);
                backward.removal_add_node(arguments.make_hl_support((SubLObject)removal_modules_subset_of.$kw1$SUBSETOF, formula, removal_modules_subset_of.$const32$UniversalVocabularyMt, (SubLObject)removal_modules_subset_of.$kw4$TRUE_MON), v_bindings, (SubLObject)removal_modules_subset_of.UNPROVIDED);
            }
            cdolist_list_var = cdolist_list_var.rest();
            subset = cdolist_list_var.first();
        }
        return (SubLObject)removal_modules_subset_of.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/modules/removal/removal-modules-subset-of.lisp", position = 20210L)
    public static SubLObject small_extensional_set_wrt_powersetP(final SubLObject v_object) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        if (removal_modules_subset_of.NIL != el_utilities.el_extensional_set_p(v_object)) {
            return Numbers.numLE(Sequences.length(el_utilities.extensional_set_elements(v_object)), removal_modules_subset_of.$default_subsetof_unbound_theset_max_cardinality$.getDynamicValue(thread));
        }
        return (SubLObject)removal_modules_subset_of.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/modules/removal/removal-modules-subset-of.lisp", position = 20530L)
    public static SubLObject all_extensional_set_elements_unboundP(final SubLObject v_object) {
        if (removal_modules_subset_of.NIL != el_utilities.el_extensional_set_p(v_object)) {
            return list_utilities.every_in_list(Symbols.symbol_function((SubLObject)removal_modules_subset_of.$sym35$VARIABLE_P), el_utilities.extensional_set_elements(v_object), (SubLObject)removal_modules_subset_of.UNPROVIDED);
        }
        return (SubLObject)removal_modules_subset_of.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/modules/removal/removal-modules-subset-of.lisp", position = 20798L)
    public static SubLObject removal_subsetof_not_fully_bound_theset_expand(final SubLObject asent, final SubLObject sense) {
        final SubLObject arg1 = cycl_utilities.atomic_sentence_arg1(asent, (SubLObject)removal_modules_subset_of.UNPROVIDED);
        final SubLObject arg2 = cycl_utilities.atomic_sentence_arg2(asent, (SubLObject)removal_modules_subset_of.UNPROVIDED);
        final SubLObject superset = cycl_utilities.nat_args(arg2, (SubLObject)removal_modules_subset_of.UNPROVIDED);
        SubLObject cdolist_list_var = list_utilities.powerset(superset);
        SubLObject subset = (SubLObject)removal_modules_subset_of.NIL;
        subset = cdolist_list_var.first();
        while (removal_modules_subset_of.NIL != cdolist_list_var) {
            SubLObject cdolist_list_var_$1 = list_utilities.permute_list(subset, (SubLObject)removal_modules_subset_of.UNPROVIDED);
            SubLObject perm = (SubLObject)removal_modules_subset_of.NIL;
            perm = cdolist_list_var_$1.first();
            while (removal_modules_subset_of.NIL != cdolist_list_var_$1) {
                final SubLObject candidate = reader.bq_cons(removal_modules_subset_of.$const31$TheSet, ConsesLow.append(perm, (SubLObject)removal_modules_subset_of.NIL));
                final SubLObject v_bindings = unification_utilities.term_unify(arg1, candidate, (SubLObject)removal_modules_subset_of.UNPROVIDED, (SubLObject)removal_modules_subset_of.UNPROVIDED);
                if (removal_modules_subset_of.NIL != v_bindings) {
                    final SubLObject unify_arg1 = bindings.subst_bindings(v_bindings, arg1);
                    final SubLObject formula = (SubLObject)ConsesLow.list(removal_modules_subset_of.$const2$subsetOf, unify_arg1, arg2);
                    final SubLObject canonical_candidate = el_utilities.canonicalize_extensional_set(candidate);
                    final SubLObject rewrite_formula = (SubLObject)ConsesLow.list(removal_modules_subset_of.$const36$rewriteOf, canonical_candidate, candidate);
                    final SubLObject additional_supports = (SubLObject)((removal_modules_subset_of.NIL != el_utilities.canonical_extensional_set_p(candidate)) ? removal_modules_subset_of.NIL : ConsesLow.list(arguments.make_hl_support((SubLObject)removal_modules_subset_of.$kw37$CODE, rewrite_formula, removal_modules_subset_of.$const32$UniversalVocabularyMt, (SubLObject)removal_modules_subset_of.$kw4$TRUE_MON)));
                    backward.removal_add_node(arguments.make_hl_support((SubLObject)removal_modules_subset_of.$kw1$SUBSETOF, formula, removal_modules_subset_of.$const32$UniversalVocabularyMt, (SubLObject)removal_modules_subset_of.$kw4$TRUE_MON), v_bindings, additional_supports);
                }
                cdolist_list_var_$1 = cdolist_list_var_$1.rest();
                perm = cdolist_list_var_$1.first();
            }
            cdolist_list_var = cdolist_list_var.rest();
            subset = cdolist_list_var.first();
        }
        return (SubLObject)removal_modules_subset_of.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/modules/removal/removal-modules-subset-of.lisp", position = 22656L)
    public static SubLObject make_empty_set_support() {
        return arguments.make_hl_support((SubLObject)removal_modules_subset_of.$kw37$CODE, (SubLObject)removal_modules_subset_of.$list40, removal_modules_subset_of.$const41$BaseKB, (SubLObject)removal_modules_subset_of.$kw4$TRUE_MON);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/modules/removal/removal-modules-subset-of.lisp", position = 24652L)
    public static SubLObject removal_subsetof_theemptyset_set_or_collection_expand(final SubLObject asent, SubLObject sense) {
        if (sense == removal_modules_subset_of.UNPROVIDED) {
            sense = (SubLObject)removal_modules_subset_of.NIL;
        }
        backward.removal_add_node(make_subsetof_hl_support(asent, (SubLObject)removal_modules_subset_of.UNPROVIDED, (SubLObject)removal_modules_subset_of.UNPROVIDED), (SubLObject)removal_modules_subset_of.NIL, (SubLObject)ConsesLow.list(make_empty_set_support()));
        return (SubLObject)removal_modules_subset_of.NIL;
    }
    
    public static SubLObject declare_removal_modules_subset_of_file() {
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.modules.removal.removal_modules_subset_of", "make_subsetof_hl_support", "MAKE-SUBSETOF-HL-SUPPORT", 1, 2, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.modules.removal.removal_modules_subset_of", "removal_subsetof_theset_theset_pos_expand", "REMOVAL-SUBSETOF-THESET-THESET-POS-EXPAND", 1, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.modules.removal.removal_modules_subset_of", "removal_subsetof_theset_theset_neg_expand", "REMOVAL-SUBSETOF-THESET-THESET-NEG-EXPAND", 1, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.modules.removal.removal_modules_subset_of", "removal_subsetof_theset_thesetof_pos_expand", "REMOVAL-SUBSETOF-THESET-THESETOF-POS-EXPAND", 1, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.modules.removal.removal_modules_subset_of", "removal_subsetof_theset_thesetof_neg_expand", "REMOVAL-SUBSETOF-THESET-THESETOF-NEG-EXPAND", 1, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.modules.removal.removal_modules_subset_of", "removal_subsetof_thesetof_fort_pos_expand", "REMOVAL-SUBSETOF-THESETOF-FORT-POS-EXPAND", 1, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.modules.removal.removal_modules_subset_of", "removal_subsetof_thesetof_fort_neg_expand", "REMOVAL-SUBSETOF-THESETOF-FORT-NEG-EXPAND", 1, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.modules.removal.removal_modules_subset_of", "removal_subsetof_thesetof_fort_expand", "REMOVAL-SUBSETOF-THESETOF-FORT-EXPAND", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.modules.removal.removal_modules_subset_of", "inference_hypothesize_element", "INFERENCE-HYPOTHESIZE-ELEMENT", 1, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.modules.removal.removal_modules_subset_of", "removal_genls_thecollectionof_fort_pos_expand", "REMOVAL-GENLS-THECOLLECTIONOF-FORT-POS-EXPAND", 1, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.modules.removal.removal_modules_subset_of", "removal_genls_thecollectionof_fort_neg_expand", "REMOVAL-GENLS-THECOLLECTIONOF-FORT-NEG-EXPAND", 1, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.modules.removal.removal_modules_subset_of", "removal_subsetof_thesetof_thesetof_pos_expand", "REMOVAL-SUBSETOF-THESETOF-THESETOF-POS-EXPAND", 1, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.modules.removal.removal_modules_subset_of", "removal_subsetof_thesetof_thesetof_neg_expand", "REMOVAL-SUBSETOF-THESETOF-THESETOF-NEG-EXPAND", 1, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.modules.removal.removal_modules_subset_of", "removal_subsetof_thesetof_thesetof_expand", "REMOVAL-SUBSETOF-THESETOF-THESETOF-EXPAND", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.modules.removal.removal_modules_subset_of", "removal_genls_thecollectionof_thecollectionof_pos_expand", "REMOVAL-GENLS-THECOLLECTIONOF-THECOLLECTIONOF-POS-EXPAND", 1, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.modules.removal.removal_modules_subset_of", "removal_genls_thecollectionof_thecollectionof_neg_expand", "REMOVAL-GENLS-THECOLLECTIONOF-THECOLLECTIONOF-NEG-EXPAND", 1, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.modules.removal.removal_modules_subset_of", "removal_subsetof_variable_theset_cost", "REMOVAL-SUBSETOF-VARIABLE-THESET-COST", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.modules.removal.removal_modules_subset_of", "removal_subsetof_variable_theset_expand", "REMOVAL-SUBSETOF-VARIABLE-THESET-EXPAND", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.modules.removal.removal_modules_subset_of", "small_extensional_set_wrt_powersetP", "SMALL-EXTENSIONAL-SET-WRT-POWERSET?", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.modules.removal.removal_modules_subset_of", "all_extensional_set_elements_unboundP", "ALL-EXTENSIONAL-SET-ELEMENTS-UNBOUND?", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.modules.removal.removal_modules_subset_of", "removal_subsetof_not_fully_bound_theset_expand", "REMOVAL-SUBSETOF-NOT-FULLY-BOUND-THESET-EXPAND", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.modules.removal.removal_modules_subset_of", "make_empty_set_support", "MAKE-EMPTY-SET-SUPPORT", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.modules.removal.removal_modules_subset_of", "removal_subsetof_theemptyset_set_or_collection_expand", "REMOVAL-SUBSETOF-THEEMPTYSET-SET-OR-COLLECTION-EXPAND", 1, 1, false);
        return (SubLObject)removal_modules_subset_of.NIL;
    }
    
    public static SubLObject init_removal_modules_subset_of_file() {
        removal_modules_subset_of.$removal_subsetof_theset_theset_cost$ = SubLFiles.defparameter("*REMOVAL-SUBSETOF-THESET-THESET-COST*", control_vars.$hl_module_check_cost$.getDynamicValue());
        removal_modules_subset_of.$removal_subsetof_theset_thesetof_cost$ = SubLFiles.defparameter("*REMOVAL-SUBSETOF-THESET-THESETOF-COST*", (SubLObject)removal_modules_subset_of.TWO_INTEGER);
        removal_modules_subset_of.$default_subsetof_thesetof_hypothesize_cost$ = SubLFiles.defparameter("*DEFAULT-SUBSETOF-THESETOF-HYPOTHESIZE-COST*", (SubLObject)removal_modules_subset_of.TWO_INTEGER);
        removal_modules_subset_of.$default_genls_thecollectionof_hypothesize_cost$ = SubLFiles.defparameter("*DEFAULT-GENLS-THECOLLECTIONOF-HYPOTHESIZE-COST*", removal_modules_subset_of.$default_subsetof_thesetof_hypothesize_cost$.getDynamicValue());
        removal_modules_subset_of.$default_subsetof_thesetof_check_cost$ = SubLFiles.defparameter("*DEFAULT-SUBSETOF-THESETOF-CHECK-COST*", (SubLObject)removal_modules_subset_of.TWO_INTEGER);
        removal_modules_subset_of.$default_genls_thecollectionof_check_cost$ = SubLFiles.defparameter("*DEFAULT-GENLS-THECOLLECTIONOF-CHECK-COST*", removal_modules_subset_of.$default_subsetof_thesetof_check_cost$.getDynamicValue());
        removal_modules_subset_of.$default_subsetof_unbound_theset_max_cardinality$ = SubLFiles.defparameter("*DEFAULT-SUBSETOF-UNBOUND-THESET-MAX-CARDINALITY*", (SubLObject)removal_modules_subset_of.TEN_INTEGER);
        return (SubLObject)removal_modules_subset_of.NIL;
    }
    
    public static SubLObject setup_removal_modules_subset_of_file() {
        inference_modules.register_solely_specific_removal_module_predicate(removal_modules_subset_of.$const2$subsetOf);
        preference_modules.doomed_unless_all_args_bindable((SubLObject)removal_modules_subset_of.$kw3$BOTH, removal_modules_subset_of.$const2$subsetOf);
        inference_modules.inference_removal_module((SubLObject)removal_modules_subset_of.$kw5$REMOVAL_SUBSETOF_THESET_THESET_POS, (SubLObject)removal_modules_subset_of.$list6);
        inference_modules.inference_removal_module((SubLObject)removal_modules_subset_of.$kw7$REMOVAL_SUBSETOF_THESET_THESET_NEG, (SubLObject)removal_modules_subset_of.$list8);
        inference_modules.inference_removal_module((SubLObject)removal_modules_subset_of.$kw9$REMOVAL_SUBSETOF_THESET_THESETOF_POS, (SubLObject)removal_modules_subset_of.$list10);
        inference_modules.inference_removal_module((SubLObject)removal_modules_subset_of.$kw11$REMOVAL_SUBSETOF_THESET_THESETOF_NEG, (SubLObject)removal_modules_subset_of.$list12);
        inference_modules.inference_removal_module((SubLObject)removal_modules_subset_of.$kw15$REMOVAL_SUBSETOF_THESETOF_FORT_POS, (SubLObject)removal_modules_subset_of.$list16);
        inference_modules.inference_removal_module((SubLObject)removal_modules_subset_of.$kw17$REMOVAL_SUBSETOF_THESETOF_FORT_NEG, (SubLObject)removal_modules_subset_of.$list18);
        inference_modules.inference_removal_module((SubLObject)removal_modules_subset_of.$kw19$REMOVAL_GENLS_THECOLLECTIONOF_FORT_POS, (SubLObject)removal_modules_subset_of.$list20);
        inference_modules.inference_removal_module((SubLObject)removal_modules_subset_of.$kw21$REMOVAL_GENLS_THECOLLECTIONOF_FORT_NEG, (SubLObject)removal_modules_subset_of.$list22);
        inference_modules.inference_removal_module((SubLObject)removal_modules_subset_of.$kw23$REMOVAL_SUBSETOF_THESETOF_THESETOF_POS, (SubLObject)removal_modules_subset_of.$list24);
        inference_modules.inference_removal_module((SubLObject)removal_modules_subset_of.$kw25$REMOVAL_SUBSETOF_THESETOF_THESETOF_NEG, (SubLObject)removal_modules_subset_of.$list26);
        inference_modules.inference_removal_module((SubLObject)removal_modules_subset_of.$kw27$REMOVAL_GENLS_THECOLLECTIONOF_THECOLLECTIONOF_POS, (SubLObject)removal_modules_subset_of.$list28);
        inference_modules.inference_removal_module((SubLObject)removal_modules_subset_of.$kw29$REMOVAL_GENLS_THECOLLECTIONOF_THECOLLECTIONOF_NEG, (SubLObject)removal_modules_subset_of.$list30);
        inference_modules.inference_removal_module((SubLObject)removal_modules_subset_of.$kw33$REMOVAL_SUBSETOF_VARIABLE_THESET_POS, (SubLObject)removal_modules_subset_of.$list34);
        inference_modules.inference_removal_module((SubLObject)removal_modules_subset_of.$kw38$REMOVAL_SUBSETOF_NOT_FULLY_BOUND_THESET_POS, (SubLObject)removal_modules_subset_of.$list39);
        inference_modules.inference_removal_module((SubLObject)removal_modules_subset_of.$kw42$REMOVAL_SUBSETOF_THEEMPTYSET_SET_OR_COLLECTION, (SubLObject)removal_modules_subset_of.$list43);
        return (SubLObject)removal_modules_subset_of.NIL;
    }
    
    @Override
	public void declareFunctions() {
        declare_removal_modules_subset_of_file();
    }
    
    @Override
	public void initializeVariables() {
        init_removal_modules_subset_of_file();
    }
    
    @Override
	public void runTopLevelForms() {
        setup_removal_modules_subset_of_file();
    }
    
    static {
        me = (SubLFile)new removal_modules_subset_of();
        removal_modules_subset_of.$removal_subsetof_theset_theset_cost$ = null;
        removal_modules_subset_of.$removal_subsetof_theset_thesetof_cost$ = null;
        removal_modules_subset_of.$default_subsetof_thesetof_hypothesize_cost$ = null;
        removal_modules_subset_of.$default_genls_thecollectionof_hypothesize_cost$ = null;
        removal_modules_subset_of.$default_subsetof_thesetof_check_cost$ = null;
        removal_modules_subset_of.$default_genls_thecollectionof_check_cost$ = null;
        removal_modules_subset_of.$default_subsetof_unbound_theset_max_cardinality$ = null;
        $kw0$TRUE_DEF = SubLObjectFactory.makeKeyword("TRUE-DEF");
        $kw1$SUBSETOF = SubLObjectFactory.makeKeyword("SUBSETOF");
        $const2$subsetOf = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("subsetOf"));
        $kw3$BOTH = SubLObjectFactory.makeKeyword("BOTH");
        $kw4$TRUE_MON = SubLObjectFactory.makeKeyword("TRUE-MON");
        $kw5$REMOVAL_SUBSETOF_THESET_THESET_POS = SubLObjectFactory.makeKeyword("REMOVAL-SUBSETOF-THESET-THESET-POS");
        $list6 = ConsesLow.list(new SubLObject[] { SubLObjectFactory.makeKeyword("SENSE"), SubLObjectFactory.makeKeyword("POS"), SubLObjectFactory.makeKeyword("PREDICATE"), constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("subsetOf")), SubLObjectFactory.makeKeyword("REQUIRED-PATTERN"), ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("subsetOf")), (SubLObject)ConsesLow.cons(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("TheSet")), (SubLObject)SubLObjectFactory.makeKeyword("FULLY-BOUND")), (SubLObject)ConsesLow.cons(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("TheSet")), (SubLObject)SubLObjectFactory.makeKeyword("FULLY-BOUND"))), SubLObjectFactory.makeKeyword("COST-EXPRESSION"), SubLObjectFactory.makeSymbol("*REMOVAL-SUBSETOF-THESET-THESET-COST*"), SubLObjectFactory.makeKeyword("COMPLETENESS"), SubLObjectFactory.makeKeyword("COMPLETE"), SubLObjectFactory.makeKeyword("EXPAND"), SubLObjectFactory.makeSymbol("REMOVAL-SUBSETOF-THESET-THESET-POS-EXPAND"), SubLObjectFactory.makeKeyword("DOCUMENTATION"), SubLObjectFactory.makeString("(#$subsetOf (#$TheSet . <fully-bound>)(#$TheSet . <fully-bound>))"), SubLObjectFactory.makeKeyword("EXAMPLE"), SubLObjectFactory.makeString("(#$subsetOf (#$TheSet 1 2)(#$TheSet 1 2 3))") });
        $kw7$REMOVAL_SUBSETOF_THESET_THESET_NEG = SubLObjectFactory.makeKeyword("REMOVAL-SUBSETOF-THESET-THESET-NEG");
        $list8 = ConsesLow.list(new SubLObject[] { SubLObjectFactory.makeKeyword("SENSE"), SubLObjectFactory.makeKeyword("NEG"), SubLObjectFactory.makeKeyword("PREDICATE"), constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("subsetOf")), SubLObjectFactory.makeKeyword("REQUIRED-PATTERN"), ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("subsetOf")), (SubLObject)ConsesLow.cons(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("TheSet")), (SubLObject)SubLObjectFactory.makeKeyword("FULLY-BOUND")), (SubLObject)ConsesLow.cons(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("TheSet")), (SubLObject)SubLObjectFactory.makeKeyword("FULLY-BOUND"))), SubLObjectFactory.makeKeyword("COST-EXPRESSION"), SubLObjectFactory.makeSymbol("*REMOVAL-SUBSETOF-THESET-THESET-COST*"), SubLObjectFactory.makeKeyword("COMPLETENESS"), SubLObjectFactory.makeKeyword("COMPLETE"), SubLObjectFactory.makeKeyword("EXPAND"), SubLObjectFactory.makeSymbol("REMOVAL-SUBSETOF-THESET-THESET-NEG-EXPAND"), SubLObjectFactory.makeKeyword("DOCUMENTATION"), SubLObjectFactory.makeString("(#$not (#$subsetOf (#$TheSet . <fully-bound>)(#$TheSet . <fully-bound>)))"), SubLObjectFactory.makeKeyword("EXAMPLE"), SubLObjectFactory.makeString("(#$not (#$subsetOf (#$TheSet 1 2 3)(#$TheSet 1 2)))") });
        $kw9$REMOVAL_SUBSETOF_THESET_THESETOF_POS = SubLObjectFactory.makeKeyword("REMOVAL-SUBSETOF-THESET-THESETOF-POS");
        $list10 = ConsesLow.list(new SubLObject[] { SubLObjectFactory.makeKeyword("SENSE"), SubLObjectFactory.makeKeyword("POS"), SubLObjectFactory.makeKeyword("PREDICATE"), constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("subsetOf")), SubLObjectFactory.makeKeyword("REQUIRED-PATTERN"), ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("subsetOf")), (SubLObject)ConsesLow.cons(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("TheSet")), (SubLObject)SubLObjectFactory.makeKeyword("FULLY-BOUND")), (SubLObject)ConsesLow.cons(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("TheSetOf")), (SubLObject)SubLObjectFactory.makeKeyword("FULLY-BOUND"))), SubLObjectFactory.makeKeyword("COST-EXPRESSION"), SubLObjectFactory.makeSymbol("*REMOVAL-SUBSETOF-THESET-THESETOF-COST*"), SubLObjectFactory.makeKeyword("COMPLETENESS"), SubLObjectFactory.makeKeyword("COMPLETE"), SubLObjectFactory.makeKeyword("EXPAND"), SubLObjectFactory.makeSymbol("REMOVAL-SUBSETOF-THESET-THESETOF-POS-EXPAND"), SubLObjectFactory.makeKeyword("DOCUMENTATION"), SubLObjectFactory.makeString("(#$subsetOf\n  (#$TheSet . <fully-bound>)\n  (#$TheSetOf <variable> <fully-bound>))"), SubLObjectFactory.makeKeyword("EXAMPLE"), SubLObjectFactory.makeString("(#$subsetOf\n  (#$TheSet #$France #$Austria)\n  (#$TheSetOf ?COUNTRY\n    (#$bordersOn #$Germany ?COUNTRY)))") });
        $kw11$REMOVAL_SUBSETOF_THESET_THESETOF_NEG = SubLObjectFactory.makeKeyword("REMOVAL-SUBSETOF-THESET-THESETOF-NEG");
        $list12 = ConsesLow.list(new SubLObject[] { SubLObjectFactory.makeKeyword("SENSE"), SubLObjectFactory.makeKeyword("NEG"), SubLObjectFactory.makeKeyword("PREDICATE"), constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("subsetOf")), SubLObjectFactory.makeKeyword("REQUIRED-PATTERN"), ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("subsetOf")), (SubLObject)ConsesLow.cons(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("TheSet")), (SubLObject)SubLObjectFactory.makeKeyword("FULLY-BOUND")), (SubLObject)ConsesLow.cons(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("TheSetOf")), (SubLObject)SubLObjectFactory.makeKeyword("FULLY-BOUND"))), SubLObjectFactory.makeKeyword("COST-EXPRESSION"), SubLObjectFactory.makeSymbol("*REMOVAL-SUBSETOF-THESET-THESETOF-COST*"), SubLObjectFactory.makeKeyword("COMPLETENESS"), SubLObjectFactory.makeKeyword("COMPLETE"), SubLObjectFactory.makeKeyword("EXPAND"), SubLObjectFactory.makeSymbol("REMOVAL-SUBSETOF-THESET-THESETOF-NEG-EXPAND"), SubLObjectFactory.makeKeyword("DOCUMENTATION"), SubLObjectFactory.makeString("(#$not \n (#$subsetOf\n  (#$TheSet . <fully-bound>)\n  (#$TheSetOf <variable> <fully-bound>)))"), SubLObjectFactory.makeKeyword("EXAMPLE"), SubLObjectFactory.makeString("(#$not\n (#$subsetOf\n  (#$TheSet #$France #$Canada)\n  (#$TheSetOf ?COUNTRY\n    (#$bordersOn #$Germany ?COUNTRY))))") });
        $kw13$POS = SubLObjectFactory.makeKeyword("POS");
        $kw14$NEG = SubLObjectFactory.makeKeyword("NEG");
        $kw15$REMOVAL_SUBSETOF_THESETOF_FORT_POS = SubLObjectFactory.makeKeyword("REMOVAL-SUBSETOF-THESETOF-FORT-POS");
        $list16 = ConsesLow.list(new SubLObject[] { SubLObjectFactory.makeKeyword("SENSE"), SubLObjectFactory.makeKeyword("POS"), SubLObjectFactory.makeKeyword("PREDICATE"), constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("subsetOf")), SubLObjectFactory.makeKeyword("REQUIRED-PATTERN"), ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("subsetOf")), (SubLObject)ConsesLow.cons(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("TheSetOf")), (SubLObject)SubLObjectFactory.makeKeyword("FULLY-BOUND")), (SubLObject)SubLObjectFactory.makeKeyword("FORT")), SubLObjectFactory.makeKeyword("COST-EXPRESSION"), SubLObjectFactory.makeSymbol("*DEFAULT-SUBSETOF-THESETOF-HYPOTHESIZE-COST*"), SubLObjectFactory.makeKeyword("COMPLETENESS"), SubLObjectFactory.makeKeyword("COMPLETE"), SubLObjectFactory.makeKeyword("EXPAND"), SubLObjectFactory.makeSymbol("REMOVAL-SUBSETOF-THESETOF-FORT-POS-EXPAND"), SubLObjectFactory.makeKeyword("DOCUMENTATION"), SubLObjectFactory.makeString("(#$subsetOf (#$TheSetOf <variable> <fully-bound>) <fort>)"), SubLObjectFactory.makeKeyword("EXAMPLE"), SubLObjectFactory.makeString("(#$subsetOf \n  (#$TheSetOf ?DOG \n    (#$and \n      (#$isa ?DOG #$Dog)\n      (#$colorOfObject ?DOG #$RedColor)))\n  #$Mammal)") });
        $kw17$REMOVAL_SUBSETOF_THESETOF_FORT_NEG = SubLObjectFactory.makeKeyword("REMOVAL-SUBSETOF-THESETOF-FORT-NEG");
        $list18 = ConsesLow.list(new SubLObject[] { SubLObjectFactory.makeKeyword("SENSE"), SubLObjectFactory.makeKeyword("NEG"), SubLObjectFactory.makeKeyword("PREDICATE"), constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("subsetOf")), SubLObjectFactory.makeKeyword("REQUIRED-PATTERN"), ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("subsetOf")), (SubLObject)ConsesLow.cons(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("TheSetOf")), (SubLObject)SubLObjectFactory.makeKeyword("FULLY-BOUND")), (SubLObject)SubLObjectFactory.makeKeyword("FORT")), SubLObjectFactory.makeKeyword("COST-EXPRESSION"), SubLObjectFactory.makeSymbol("*DEFAULT-SUBSETOF-THESETOF-HYPOTHESIZE-COST*"), SubLObjectFactory.makeKeyword("COMPLETENESS"), SubLObjectFactory.makeKeyword("COMPLETE"), SubLObjectFactory.makeKeyword("EXPAND"), SubLObjectFactory.makeSymbol("REMOVAL-SUBSETOF-THESETOF-FORT-NEG-EXPAND"), SubLObjectFactory.makeKeyword("DOCUMENTATION"), SubLObjectFactory.makeString("(#$not\n  (#$subsetOf (#$TheSetOf <variable> <fully-bound>) <fort>))"), SubLObjectFactory.makeKeyword("EXAMPLE"), SubLObjectFactory.makeString("(#$not\n  (#$subsetOf \n    (#$TheSetOf ?MAMMAL \n      (#$and \n        (#$isa ?MAMMAL #$Mammal)\n        (#$colorOfObject ?MAMMAL #$RedColor)))\n    #$Dog))") });
        $kw19$REMOVAL_GENLS_THECOLLECTIONOF_FORT_POS = SubLObjectFactory.makeKeyword("REMOVAL-GENLS-THECOLLECTIONOF-FORT-POS");
        $list20 = ConsesLow.list(new SubLObject[] { SubLObjectFactory.makeKeyword("SENSE"), SubLObjectFactory.makeKeyword("POS"), SubLObjectFactory.makeKeyword("PREDICATE"), constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("genls")), SubLObjectFactory.makeKeyword("REQUIRED-PATTERN"), ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("genls")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("NAT"), (SubLObject)ConsesLow.cons(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("TheCollectionOf")), (SubLObject)SubLObjectFactory.makeKeyword("FULLY-BOUND"))), (SubLObject)SubLObjectFactory.makeKeyword("FORT")), SubLObjectFactory.makeKeyword("COST-EXPRESSION"), SubLObjectFactory.makeSymbol("*DEFAULT-GENLS-THECOLLECTIONOF-HYPOTHESIZE-COST*"), SubLObjectFactory.makeKeyword("COMPLETENESS"), SubLObjectFactory.makeKeyword("COMPLETE"), SubLObjectFactory.makeKeyword("EXPAND"), SubLObjectFactory.makeSymbol("REMOVAL-GENLS-THECOLLECTIONOF-FORT-POS-EXPAND"), SubLObjectFactory.makeKeyword("DOCUMENTATION"), SubLObjectFactory.makeString("(#$genls (#$TheCollectionOf <variable> <fully-bound>) <fort>)"), SubLObjectFactory.makeKeyword("EXAMPLE"), SubLObjectFactory.makeString("(#$genls \n  (#$TheCollectionOf ?DOG \n    (#$and \n      (#$isa ?DOG #$Dog)\n      (#$colorOfObject ?DOG #$RedColor)))\n  #$Mammal)") });
        $kw21$REMOVAL_GENLS_THECOLLECTIONOF_FORT_NEG = SubLObjectFactory.makeKeyword("REMOVAL-GENLS-THECOLLECTIONOF-FORT-NEG");
        $list22 = ConsesLow.list(new SubLObject[] { SubLObjectFactory.makeKeyword("SENSE"), SubLObjectFactory.makeKeyword("NEG"), SubLObjectFactory.makeKeyword("PREDICATE"), constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("genls")), SubLObjectFactory.makeKeyword("REQUIRED-PATTERN"), ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("genls")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("NAT"), (SubLObject)ConsesLow.cons(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("TheCollectionOf")), (SubLObject)SubLObjectFactory.makeKeyword("FULLY-BOUND"))), (SubLObject)SubLObjectFactory.makeKeyword("FORT")), SubLObjectFactory.makeKeyword("COST-EXPRESSION"), SubLObjectFactory.makeSymbol("*DEFAULT-GENLS-THECOLLECTIONOF-HYPOTHESIZE-COST*"), SubLObjectFactory.makeKeyword("COMPLETENESS"), SubLObjectFactory.makeKeyword("COMPLETE"), SubLObjectFactory.makeKeyword("EXPAND"), SubLObjectFactory.makeSymbol("REMOVAL-GENLS-THECOLLECTIONOF-FORT-NEG-EXPAND"), SubLObjectFactory.makeKeyword("DOCUMENTATION"), SubLObjectFactory.makeString("(#$not\n  (#$genls (#$TheCollectionOf <variable> <fully-bound>) <fort>))"), SubLObjectFactory.makeKeyword("EXAMPLE"), SubLObjectFactory.makeString("(#$not\n  (#$genls \n    (#$TheCollectionOf ?MAMMAL \n      (#$and \n        (#$isa ?MAMMAL #$Mammal)\n        (#$colorOfObject ?MAMMAL #$RedColor)))\n    #$Dog))") });
        $kw23$REMOVAL_SUBSETOF_THESETOF_THESETOF_POS = SubLObjectFactory.makeKeyword("REMOVAL-SUBSETOF-THESETOF-THESETOF-POS");
        $list24 = ConsesLow.list(new SubLObject[] { SubLObjectFactory.makeKeyword("SENSE"), SubLObjectFactory.makeKeyword("POS"), SubLObjectFactory.makeKeyword("PREDICATE"), constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("subsetOf")), SubLObjectFactory.makeKeyword("REQUIRED-PATTERN"), ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("subsetOf")), (SubLObject)ConsesLow.cons(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("TheSetOf")), (SubLObject)SubLObjectFactory.makeKeyword("FULLY-BOUND")), (SubLObject)ConsesLow.cons(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("TheSetOf")), (SubLObject)SubLObjectFactory.makeKeyword("FULLY-BOUND"))), SubLObjectFactory.makeKeyword("COST-EXPRESSION"), SubLObjectFactory.makeSymbol("*DEFAULT-SUBSETOF-THESETOF-CHECK-COST*"), SubLObjectFactory.makeKeyword("COMPLETENESS"), SubLObjectFactory.makeKeyword("COMPLETE"), SubLObjectFactory.makeKeyword("EXPAND"), SubLObjectFactory.makeSymbol("REMOVAL-SUBSETOF-THESETOF-THESETOF-POS-EXPAND"), SubLObjectFactory.makeKeyword("DOCUMENTATION"), SubLObjectFactory.makeString("(#$subsetOf \n  (#$TheSetOf <variable> <fully-bound>) \n  (#$TheSetOf <variable> <fully-bound>))"), SubLObjectFactory.makeKeyword("EXAMPLE"), SubLObjectFactory.makeString("(#$subsetOf \n  (#$TheSetOf ?DOG \n    (#$and \n      (#$isa ?DOG #$Dog)\n      (#$colorOfObject ?DOG #$RedColor)))\n  (#$TheSetOf ?MAMMAL\n    (#$and \n      (#$isa ?MAMMAL #$Mammal)\n      (#$colorOfObject ?MAMMAL #$RedColor))))") });
        $kw25$REMOVAL_SUBSETOF_THESETOF_THESETOF_NEG = SubLObjectFactory.makeKeyword("REMOVAL-SUBSETOF-THESETOF-THESETOF-NEG");
        $list26 = ConsesLow.list(new SubLObject[] { SubLObjectFactory.makeKeyword("SENSE"), SubLObjectFactory.makeKeyword("NEG"), SubLObjectFactory.makeKeyword("PREDICATE"), constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("subsetOf")), SubLObjectFactory.makeKeyword("REQUIRED-PATTERN"), ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("subsetOf")), (SubLObject)ConsesLow.cons(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("TheSetOf")), (SubLObject)SubLObjectFactory.makeKeyword("FULLY-BOUND")), (SubLObject)ConsesLow.cons(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("TheSetOf")), (SubLObject)SubLObjectFactory.makeKeyword("FULLY-BOUND"))), SubLObjectFactory.makeKeyword("COST-EXPRESSION"), SubLObjectFactory.makeSymbol("*DEFAULT-SUBSETOF-THESETOF-CHECK-COST*"), SubLObjectFactory.makeKeyword("COMPLETENESS"), SubLObjectFactory.makeKeyword("COMPLETE"), SubLObjectFactory.makeKeyword("EXPAND"), SubLObjectFactory.makeSymbol("REMOVAL-SUBSETOF-THESETOF-THESETOF-NEG-EXPAND"), SubLObjectFactory.makeKeyword("DOCUMENTATION"), SubLObjectFactory.makeString("(#$not \n  (#$subsetOf \n    (#$TheSetOf <variable> <fully-bound>) \n    (#$TheSetOf <variable> <fully-bound>)))"), SubLObjectFactory.makeKeyword("EXAMPLE"), SubLObjectFactory.makeString("(#$not\n  (#$subsetOf \n    (#$TheSetOf ?MAMMAL\n      (#$and \n        (#$isa ?MAMMAL #$Mammal)\n        (#$colorOfObject ?MAMMAL #$RedColor)))\n    (#$TheSetOf ?DOG \n      (#$and \n        (#$isa ?DOG #$Dog)\n        (#$colorOfObject ?DOG #$RedColor)))))") });
        $kw27$REMOVAL_GENLS_THECOLLECTIONOF_THECOLLECTIONOF_POS = SubLObjectFactory.makeKeyword("REMOVAL-GENLS-THECOLLECTIONOF-THECOLLECTIONOF-POS");
        $list28 = ConsesLow.list(new SubLObject[] { SubLObjectFactory.makeKeyword("SENSE"), SubLObjectFactory.makeKeyword("POS"), SubLObjectFactory.makeKeyword("PREDICATE"), constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("genls")), SubLObjectFactory.makeKeyword("REQUIRED-PATTERN"), ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("genls")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("NAT"), (SubLObject)ConsesLow.cons(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("TheCollectionOf")), (SubLObject)SubLObjectFactory.makeKeyword("FULLY-BOUND"))), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("NAT"), (SubLObject)ConsesLow.cons(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("TheCollectionOf")), (SubLObject)SubLObjectFactory.makeKeyword("FULLY-BOUND")))), SubLObjectFactory.makeKeyword("EXCLUSIVE"), SubLObjectFactory.makeSymbol("TRUE"), SubLObjectFactory.makeKeyword("SUPPLANTS"), ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("REMOVAL-GENLS-THECOLLECTIONOF-FORT-POS")), SubLObjectFactory.makeKeyword("COST-EXPRESSION"), SubLObjectFactory.makeSymbol("*DEFAULT-GENLS-THECOLLECTIONOF-CHECK-COST*"), SubLObjectFactory.makeKeyword("COMPLETENESS"), SubLObjectFactory.makeKeyword("COMPLETE"), SubLObjectFactory.makeKeyword("EXPAND"), SubLObjectFactory.makeSymbol("REMOVAL-GENLS-THECOLLECTIONOF-THECOLLECTIONOF-POS-EXPAND"), SubLObjectFactory.makeKeyword("DOCUMENTATION"), SubLObjectFactory.makeString("(#$genls \n  (#$TheCollectionOf <variable> <fully-bound>) \n  (#$TheCollectionOf <variable> <fully-bound>))"), SubLObjectFactory.makeKeyword("EXAMPLE"), SubLObjectFactory.makeString("(#$genls \n  (#$TheCollectionOf ?DOG \n    (#$and \n      (#$isa ?DOG #$Dog)\n      (#$colorOfObject ?DOG #$RedColor)))\n  (#$TheCollectionOf ?MAMMAL\n    (#$and \n      (#$isa ?MAMMAL #$Mammal)\n      (#$colorOfObject ?MAMMAL #$RedColor))))") });
        $kw29$REMOVAL_GENLS_THECOLLECTIONOF_THECOLLECTIONOF_NEG = SubLObjectFactory.makeKeyword("REMOVAL-GENLS-THECOLLECTIONOF-THECOLLECTIONOF-NEG");
        $list30 = ConsesLow.list(new SubLObject[] { SubLObjectFactory.makeKeyword("SENSE"), SubLObjectFactory.makeKeyword("NEG"), SubLObjectFactory.makeKeyword("PREDICATE"), constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("genls")), SubLObjectFactory.makeKeyword("REQUIRED-PATTERN"), ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("genls")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("NAT"), (SubLObject)ConsesLow.cons(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("TheCollectionOf")), (SubLObject)SubLObjectFactory.makeKeyword("FULLY-BOUND"))), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("NAT"), (SubLObject)ConsesLow.cons(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("TheCollectionOf")), (SubLObject)SubLObjectFactory.makeKeyword("FULLY-BOUND")))), SubLObjectFactory.makeKeyword("EXCLUSIVE"), SubLObjectFactory.makeSymbol("TRUE"), SubLObjectFactory.makeKeyword("SUPPLANTS"), ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("REMOVAL-GENLS-THECOLLECTIONOF-FORT-NEG")), SubLObjectFactory.makeKeyword("COST-EXPRESSION"), SubLObjectFactory.makeSymbol("*DEFAULT-GENLS-THECOLLECTIONOF-CHECK-COST*"), SubLObjectFactory.makeKeyword("COMPLETENESS"), SubLObjectFactory.makeKeyword("COMPLETE"), SubLObjectFactory.makeKeyword("EXPAND"), SubLObjectFactory.makeSymbol("REMOVAL-GENLS-THECOLLECTIONOF-THECOLLECTIONOF-NEG-EXPAND"), SubLObjectFactory.makeKeyword("DOCUMENTATION"), SubLObjectFactory.makeString("(#$not \n  (#$genls \n    (#$TheCollectionOf <variable> <fully-bound>) \n    (#$TheCollectionOf <variable> <fully-bound>)))"), SubLObjectFactory.makeKeyword("EXAMPLE"), SubLObjectFactory.makeString("(#$not\n  (#$genls \n    (#$TheCollectionOf ?MAMMAL\n      (#$and \n        (#$isa ?MAMMAL #$Mammal)\n        (#$colorOfObject ?MAMMAL #$RedColor)))\n    (#$TheCollectionOf ?DOG \n      (#$and \n        (#$isa ?DOG #$Dog)\n        (#$colorOfObject ?DOG #$RedColor)))))") });
        $const31$TheSet = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("TheSet"));
        $const32$UniversalVocabularyMt = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("UniversalVocabularyMt"));
        $kw33$REMOVAL_SUBSETOF_VARIABLE_THESET_POS = SubLObjectFactory.makeKeyword("REMOVAL-SUBSETOF-VARIABLE-THESET-POS");
        $list34 = ConsesLow.list(new SubLObject[] { SubLObjectFactory.makeKeyword("SENSE"), SubLObjectFactory.makeKeyword("POS"), SubLObjectFactory.makeKeyword("PREDICATE"), constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("subsetOf")), SubLObjectFactory.makeKeyword("REQUIRED-PATTERN"), ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("subsetOf")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("OR"), (SubLObject)SubLObjectFactory.makeKeyword("VARIABLE"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("AND"), (SubLObject)ConsesLow.cons(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("TheSet")), (SubLObject)SubLObjectFactory.makeKeyword("NOT-FULLY-BOUND")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("TEST"), (SubLObject)SubLObjectFactory.makeSymbol("ALL-EXTENSIONAL-SET-ELEMENTS-UNBOUND?")))), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("AND"), (SubLObject)ConsesLow.cons(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("TheSet")), (SubLObject)SubLObjectFactory.makeKeyword("FULLY-BOUND")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("TEST"), (SubLObject)SubLObjectFactory.makeSymbol("SMALL-EXTENSIONAL-SET-WRT-POWERSET?")))), SubLObjectFactory.makeKeyword("COST"), SubLObjectFactory.makeSymbol("REMOVAL-SUBSETOF-VARIABLE-THESET-COST"), SubLObjectFactory.makeKeyword("COMPLETENESS"), SubLObjectFactory.makeKeyword("COMPLETE"), SubLObjectFactory.makeKeyword("EXPAND"), SubLObjectFactory.makeSymbol("REMOVAL-SUBSETOF-VARIABLE-THESET-EXPAND"), SubLObjectFactory.makeKeyword("DOCUMENTATION"), SubLObjectFactory.makeString("(#$subsetOf (<variable> or (#$TheSet . <all-unbound>) (#$TheSet . <fully-bound>))"), SubLObjectFactory.makeKeyword("EXAMPLE"), SubLObjectFactory.makeString("(#$subsetOf ?SUBSET (#$TheSet 1 2 3))") });
        $sym35$VARIABLE_P = SubLObjectFactory.makeSymbol("VARIABLE-P");
        $const36$rewriteOf = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("rewriteOf"));
        $kw37$CODE = SubLObjectFactory.makeKeyword("CODE");
        $kw38$REMOVAL_SUBSETOF_NOT_FULLY_BOUND_THESET_POS = SubLObjectFactory.makeKeyword("REMOVAL-SUBSETOF-NOT-FULLY-BOUND-THESET-POS");
        $list39 = ConsesLow.list(new SubLObject[] { SubLObjectFactory.makeKeyword("SENSE"), SubLObjectFactory.makeKeyword("POS"), SubLObjectFactory.makeKeyword("PREDICATE"), constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("subsetOf")), SubLObjectFactory.makeKeyword("REQUIRED-PATTERN"), ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("subsetOf")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("AND"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("NOT"), (SubLObject)SubLObjectFactory.makeKeyword("VARIABLE")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("AND"), (SubLObject)ConsesLow.cons(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("TheSet")), (SubLObject)SubLObjectFactory.makeKeyword("NOT-FULLY-BOUND")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("NOT"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("TEST"), (SubLObject)SubLObjectFactory.makeSymbol("ALL-EXTENSIONAL-SET-ELEMENTS-UNBOUND?"))))), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("AND"), (SubLObject)ConsesLow.cons(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("TheSet")), (SubLObject)SubLObjectFactory.makeKeyword("FULLY-BOUND")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("TEST"), (SubLObject)SubLObjectFactory.makeSymbol("SMALL-EXTENSIONAL-SET-WRT-POWERSET?")))), SubLObjectFactory.makeKeyword("COST"), SubLObjectFactory.makeSymbol("REMOVAL-SUBSETOF-VARIABLE-THESET-COST"), SubLObjectFactory.makeKeyword("COMPLETENESS"), SubLObjectFactory.makeKeyword("COMPLETE"), SubLObjectFactory.makeKeyword("EXPAND"), SubLObjectFactory.makeSymbol("REMOVAL-SUBSETOF-NOT-FULLY-BOUND-THESET-EXPAND"), SubLObjectFactory.makeKeyword("DOCUMENTATION"), SubLObjectFactory.makeString("(#$subsetOf (#$TheSet . <not-fully-bound>) (#$TheSet . <fully-bound>))"), SubLObjectFactory.makeKeyword("EXAMPLE"), SubLObjectFactory.makeString("(#$subsetOf (#$TheSet 1 ?X 3) (#$TheSet 1 2 3 4))") });
        $list40 = ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("subsetOf")), constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("TheEmptySet")), (SubLObject)SubLObjectFactory.makeSymbol("?SET"));
        $const41$BaseKB = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("BaseKB"));
        $kw42$REMOVAL_SUBSETOF_THEEMPTYSET_SET_OR_COLLECTION = SubLObjectFactory.makeKeyword("REMOVAL-SUBSETOF-THEEMPTYSET-SET-OR-COLLECTION");
        $list43 = ConsesLow.list(new SubLObject[] { SubLObjectFactory.makeKeyword("SENSE"), SubLObjectFactory.makeKeyword("POS"), SubLObjectFactory.makeKeyword("PREDICATE"), constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("subsetOf")), SubLObjectFactory.makeKeyword("REQUIRED-PATTERN"), ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("subsetOf")), constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("TheEmptySet")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("AND"), (SubLObject)SubLObjectFactory.makeKeyword("FULLY-BOUND"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("TEST"), (SubLObject)SubLObjectFactory.makeSymbol("SET-OR-COLLECTION?")))), SubLObjectFactory.makeKeyword("COST-EXPRESSION"), removal_modules_subset_of.ONE_INTEGER, SubLObjectFactory.makeKeyword("COMPLETENESS"), SubLObjectFactory.makeKeyword("COMPLETE"), SubLObjectFactory.makeKeyword("EXPAND"), SubLObjectFactory.makeSymbol("REMOVAL-SUBSETOF-THEEMPTYSET-SET-OR-COLLECTION-EXPAND"), SubLObjectFactory.makeKeyword("DOCUMENTATION"), SubLObjectFactory.makeString("(#$subsetOf #$TheEmptySet <fully-bound>)\n    where <fully-bound> arg2 is also a #$Set-Mathematical or a #$Collection"), SubLObjectFactory.makeKeyword("EXAMPLE"), SubLObjectFactory.makeString(" (#$subsetOf #$TheEmptySet #$TheEmptySet)\n\n  (#$subsetOf \n  #$TheEmptySet\n  (#$TheSet #$isa #$Thing #$Collection))\n\n  (#$subsetOf \n  #$TheEmptySet\n  (#$TheSetOf ?DOG \n    (#$and \n      (#$isa ?DOG #$Dog)\n      (#$colorOfObject ?DOG #$RedColor))))\n") });
    }
}

/*

	Total time: 245 ms
	
*/