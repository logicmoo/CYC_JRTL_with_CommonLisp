package com.cyc.cycjava.cycl.inference.modules.removal;

import com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow;
import com.cyc.cycjava.cycl.constant_handles;
import com.cyc.cycjava.cycl.inference.modules.preference_modules;
import com.cyc.cycjava.cycl.inference.harness.inference_modules;
import com.cyc.tool.subl.util.SubLFiles;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.SubLThread;
import com.cyc.cycjava.cycl.genls;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Values;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Threads;
import com.cyc.cycjava.cycl.at_defns;
import com.cyc.cycjava.cycl.isa;
import com.cyc.cycjava.cycl.forts;
import com.cyc.cycjava.cycl.assertions_high;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory;
import com.cyc.cycjava.cycl.iteration;
import com.cyc.cycjava.cycl.kb_mapping_macros;
import com.cyc.cycjava.cycl.mt_relevance_macros;
import com.cyc.cycjava.cycl.kb_accessors;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLProcess;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Equality;
import com.cyc.cycjava.cycl.at_admitted;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Numbers;
import com.cyc.cycjava.cycl.el_utilities;
import com.cyc.cycjava.cycl.backward;
import com.cyc.cycjava.cycl.arguments;
import com.cyc.cycjava.cycl.cycl_utilities;
import com.cyc.tool.subl.jrtl.nativeCode.type.number.SubLFloat;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLList;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObject;
import com.cyc.tool.subl.jrtl.nativeCode.type.symbol.SubLSymbol;
import com.cyc.tool.subl.util.SubLFile;
import com.cyc.tool.subl.util.SubLTranslatedFile;

public final class removal_modules_admitted_formula extends SubLTranslatedFile
{
    public static final SubLFile me;
    public static final String myName = "com.cyc.cycjava.cycl.inference.modules.removal.removal_modules_admitted_formula";
    public static final String myFingerPrint = "6d343951bb19ad9dd8668f78dcdd51fa16961dfb548ad2d336a19e8907af439a";
    @SubLTranslatedFile.SubL(source = "cycl/inference/modules/removal/removal-modules-admitted-formula.lisp", position = 1930L)
    private static SubLSymbol $default_removal_admitted_formula_cost$;
    @SubLTranslatedFile.SubL(source = "cycl/inference/modules/removal/removal-modules-admitted-formula.lisp", position = 5669L)
    private static SubLSymbol $default_removal_admitted_argument_check_cost$;
    private static final SubLObject $const0$admittedSentence;
    private static final SubLSymbol $kw1$REMOVAL_NON_WFF_CHECK_NEG;
    private static final SubLSymbol $kw2$BOTH;
    private static final SubLSymbol $kw3$ADMIT;
    private static final SubLSymbol $kw4$REMOVAL_ADMITTED_SENTENCE_POS;
    private static final SubLList $list5;
    private static final SubLSymbol $kw6$IGNORE;
    private static final SubLObject $const7$True;
    private static final SubLSymbol $kw8$REMOVAL_ADMITTED_SENTENCE_NEG;
    private static final SubLList $list9;
    private static final SubLObject $const10$admittedArgument;
    private static final SubLSymbol $kw11$REMOVAL_ADMITTED_ARGUMENT_CHECK_POS;
    private static final SubLList $list12;
    private static final SubLFloat $float13$0_9;
    private static final SubLSymbol $kw14$GAF;
    private static final SubLSymbol $kw15$TRUE;
    private static final SubLObject $const16$Thing;
    private static final SubLSymbol $kw17$REMOVAL_ADMITTED_ARGUMENT_CHECK_NEG;
    private static final SubLList $list18;
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/modules/removal/removal-modules-admitted-formula.lisp", position = 978L)
    public static SubLObject removal_admitted_sentence_pos_expand(final SubLObject asent, SubLObject sense) {
        if (sense == removal_modules_admitted_formula.UNPROVIDED) {
            sense = (SubLObject)removal_modules_admitted_formula.NIL;
        }
        final SubLObject formula = cycl_utilities.atomic_sentence_arg1(asent, (SubLObject)removal_modules_admitted_formula.UNPROVIDED);
        final SubLObject admitted = inference_admitted_sentence(formula, (SubLObject)removal_modules_admitted_formula.UNPROVIDED);
        if (removal_modules_admitted_formula.NIL != admitted) {
            backward.removal_add_node(arguments.make_hl_support((SubLObject)removal_modules_admitted_formula.$kw3$ADMIT, asent, (SubLObject)removal_modules_admitted_formula.UNPROVIDED, (SubLObject)removal_modules_admitted_formula.UNPROVIDED), (SubLObject)removal_modules_admitted_formula.UNPROVIDED, (SubLObject)removal_modules_admitted_formula.UNPROVIDED);
        }
        return (SubLObject)removal_modules_admitted_formula.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/modules/removal/removal-modules-admitted-formula.lisp", position = 2010L)
    public static SubLObject inference_admitted_formula(final SubLObject formula, SubLObject mt) {
        if (mt == removal_modules_admitted_formula.UNPROVIDED) {
            mt = (SubLObject)removal_modules_admitted_formula.NIL;
        }
        if (removal_modules_admitted_formula.NIL != el_utilities.el_formula_p(formula)) {
            if (removal_modules_admitted_formula.NIL == el_utilities.contains_subformula_p(formula)) {
                final SubLObject relation = cycl_utilities.formula_operator(formula);
                SubLObject argnum = (SubLObject)removal_modules_admitted_formula.ZERO_INTEGER;
                SubLObject cdolist_list_var;
                final SubLObject args = cdolist_list_var = cycl_utilities.formula_args(formula, (SubLObject)removal_modules_admitted_formula.$kw6$IGNORE);
                SubLObject arg = (SubLObject)removal_modules_admitted_formula.NIL;
                arg = cdolist_list_var.first();
                while (removal_modules_admitted_formula.NIL != cdolist_list_var) {
                    argnum = Numbers.add(argnum, (SubLObject)removal_modules_admitted_formula.ONE_INTEGER);
                    if (removal_modules_admitted_formula.NIL == inference_admitted_argument(arg, argnum, relation, mt)) {
                        return (SubLObject)removal_modules_admitted_formula.NIL;
                    }
                    cdolist_list_var = cdolist_list_var.rest();
                    arg = cdolist_list_var.first();
                }
            }
            return at_admitted.admitted_formulaP(formula, mt);
        }
        return Equality.eql(removal_modules_admitted_formula.$const7$True, formula);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/modules/removal/removal-modules-admitted-formula.lisp", position = 2517L)
    public static SubLObject inference_admitted_sentence(final SubLObject sentence, SubLObject mt) {
        if (mt == removal_modules_admitted_formula.UNPROVIDED) {
            mt = (SubLObject)removal_modules_admitted_formula.NIL;
        }
        if (removal_modules_admitted_formula.NIL != el_utilities.el_formula_p(sentence)) {
            if (removal_modules_admitted_formula.NIL == el_utilities.contains_subformula_p(sentence)) {
                final SubLObject relation = cycl_utilities.formula_operator(sentence);
                SubLObject argnum = (SubLObject)removal_modules_admitted_formula.ZERO_INTEGER;
                SubLObject cdolist_list_var;
                final SubLObject args = cdolist_list_var = cycl_utilities.formula_args(sentence, (SubLObject)removal_modules_admitted_formula.$kw6$IGNORE);
                SubLObject arg = (SubLObject)removal_modules_admitted_formula.NIL;
                arg = cdolist_list_var.first();
                while (removal_modules_admitted_formula.NIL != cdolist_list_var) {
                    argnum = Numbers.add(argnum, (SubLObject)removal_modules_admitted_formula.ONE_INTEGER);
                    if (removal_modules_admitted_formula.NIL == inference_admitted_argument(arg, argnum, relation, mt)) {
                        return (SubLObject)removal_modules_admitted_formula.NIL;
                    }
                    cdolist_list_var = cdolist_list_var.rest();
                    arg = cdolist_list_var.first();
                }
            }
            return at_admitted.admitted_sentenceP(sentence, mt);
        }
        return Equality.eql(removal_modules_admitted_formula.$const7$True, sentence);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/modules/removal/removal-modules-admitted-formula.lisp", position = 3130L)
    public static SubLObject removal_admitted_sentence_neg_expand(final SubLObject asent, SubLObject sense) {
        if (sense == removal_modules_admitted_formula.UNPROVIDED) {
            sense = (SubLObject)removal_modules_admitted_formula.NIL;
        }
        final SubLObject formula = cycl_utilities.atomic_sentence_arg1(asent, (SubLObject)removal_modules_admitted_formula.UNPROVIDED);
        final SubLObject admitted = inference_admitted_sentence(formula, (SubLObject)removal_modules_admitted_formula.UNPROVIDED);
        if (removal_modules_admitted_formula.NIL == admitted) {
            backward.removal_add_node(arguments.make_hl_support((SubLObject)removal_modules_admitted_formula.$kw3$ADMIT, cycl_utilities.negate(asent), (SubLObject)removal_modules_admitted_formula.UNPROVIDED, (SubLObject)removal_modules_admitted_formula.UNPROVIDED), (SubLObject)removal_modules_admitted_formula.UNPROVIDED, (SubLObject)removal_modules_admitted_formula.UNPROVIDED);
        }
        return (SubLObject)removal_modules_admitted_formula.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/modules/removal/removal-modules-admitted-formula.lisp", position = 4520L)
    public static SubLObject removal_admitted_argument_check_pos_expand(final SubLObject asent, SubLObject sense) {
        if (sense == removal_modules_admitted_formula.UNPROVIDED) {
            sense = (SubLObject)removal_modules_admitted_formula.NIL;
        }
        final SubLObject v_term = cycl_utilities.atomic_sentence_arg1(asent, (SubLObject)removal_modules_admitted_formula.UNPROVIDED);
        final SubLObject arg = cycl_utilities.atomic_sentence_arg2(asent, (SubLObject)removal_modules_admitted_formula.UNPROVIDED);
        final SubLObject relation = cycl_utilities.atomic_sentence_arg3(asent, (SubLObject)removal_modules_admitted_formula.UNPROVIDED);
        final SubLObject admitted = inference_admitted_argument(v_term, arg, relation, (SubLObject)removal_modules_admitted_formula.UNPROVIDED);
        if (removal_modules_admitted_formula.NIL != admitted) {
            backward.removal_add_node(arguments.make_hl_support((SubLObject)removal_modules_admitted_formula.$kw3$ADMIT, asent, (SubLObject)removal_modules_admitted_formula.UNPROVIDED, (SubLObject)removal_modules_admitted_formula.UNPROVIDED), (SubLObject)removal_modules_admitted_formula.UNPROVIDED, (SubLObject)removal_modules_admitted_formula.UNPROVIDED);
        }
        return (SubLObject)removal_modules_admitted_formula.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/modules/removal/removal-modules-admitted-formula.lisp", position = 5758L)
    public static SubLObject inference_admitted_argument(final SubLObject v_term, final SubLObject argnum, final SubLObject relation, SubLObject mt) {
        if (mt == removal_modules_admitted_formula.UNPROVIDED) {
            mt = (SubLObject)removal_modules_admitted_formula.NIL;
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        if (removal_modules_admitted_formula.NIL == el_utilities.el_formula_p(v_term)) {
            SubLObject rejected = (SubLObject)removal_modules_admitted_formula.NIL;
            final SubLObject arg_isa_pred = kb_accessors.arg_isa_pred(argnum, relation, mt);
            SubLObject mt_var = mt;
            SubLObject _prev_bind_0 = mt_relevance_macros.$mt$.currentBinding(thread);
            SubLObject _prev_bind_2 = mt_relevance_macros.$relevant_mt_function$.currentBinding(thread);
            SubLObject _prev_bind_3 = mt_relevance_macros.$relevant_mts$.currentBinding(thread);
            try {
                mt_relevance_macros.$mt$.bind(mt_relevance_macros.update_inference_mt_relevance_mt(mt_var), thread);
                mt_relevance_macros.$relevant_mt_function$.bind(mt_relevance_macros.update_inference_mt_relevance_function(mt_var), thread);
                mt_relevance_macros.$relevant_mts$.bind(mt_relevance_macros.update_inference_mt_relevance_mt_list(mt_var), thread);
                SubLObject arg_isa = (SubLObject)removal_modules_admitted_formula.NIL;
                final SubLObject pred_var = arg_isa_pred;
                if (removal_modules_admitted_formula.NIL != kb_mapping_macros.do_gaf_arg_index_key_validator(relation, (SubLObject)removal_modules_admitted_formula.ONE_INTEGER, pred_var)) {
                    final SubLObject iterator_var = kb_mapping_macros.new_gaf_arg_final_index_spec_iterator(relation, (SubLObject)removal_modules_admitted_formula.ONE_INTEGER, pred_var);
                    SubLObject done_var = rejected;
                    final SubLObject token_var = (SubLObject)removal_modules_admitted_formula.NIL;
                    while (removal_modules_admitted_formula.NIL == done_var) {
                        final SubLObject final_index_spec = iteration.iteration_next_without_values_macro_helper(iterator_var, token_var);
                        final SubLObject valid = (SubLObject)SubLObjectFactory.makeBoolean(!token_var.eql(final_index_spec));
                        if (removal_modules_admitted_formula.NIL != valid) {
                            SubLObject final_index_iterator = (SubLObject)removal_modules_admitted_formula.NIL;
                            try {
                                final_index_iterator = kb_mapping_macros.new_final_index_iterator(final_index_spec, (SubLObject)removal_modules_admitted_formula.$kw14$GAF, (SubLObject)removal_modules_admitted_formula.$kw15$TRUE, (SubLObject)removal_modules_admitted_formula.NIL);
                                SubLObject done_var_$1 = rejected;
                                final SubLObject token_var_$2 = (SubLObject)removal_modules_admitted_formula.NIL;
                                while (removal_modules_admitted_formula.NIL == done_var_$1) {
                                    final SubLObject assertion = iteration.iteration_next_without_values_macro_helper(final_index_iterator, token_var_$2);
                                    final SubLObject valid_$3 = (SubLObject)SubLObjectFactory.makeBoolean(!token_var_$2.eql(assertion));
                                    if (removal_modules_admitted_formula.NIL != valid_$3) {
                                        arg_isa = assertions_high.gaf_arg(assertion, (SubLObject)removal_modules_admitted_formula.TWO_INTEGER);
                                        if (removal_modules_admitted_formula.NIL != forts.fort_p(arg_isa) && !arg_isa.eql(removal_modules_admitted_formula.$const16$Thing) && removal_modules_admitted_formula.NIL == isa.isaP(v_term, arg_isa, mt, (SubLObject)removal_modules_admitted_formula.UNPROVIDED) && removal_modules_admitted_formula.NIL == at_defns.defns_admitP(arg_isa, v_term, mt)) {
                                            rejected = (SubLObject)removal_modules_admitted_formula.T;
                                        }
                                    }
                                    done_var_$1 = (SubLObject)SubLObjectFactory.makeBoolean(removal_modules_admitted_formula.NIL == valid_$3 || removal_modules_admitted_formula.NIL != rejected);
                                }
                            }
                            finally {
                                final SubLObject _prev_bind_0_$4 = Threads.$is_thread_performing_cleanupP$.currentBinding(thread);
                                try {
                                    Threads.$is_thread_performing_cleanupP$.bind((SubLObject)removal_modules_admitted_formula.T, thread);
                                    final SubLObject _values = Values.getValuesAsVector();
                                    if (removal_modules_admitted_formula.NIL != final_index_iterator) {
                                        kb_mapping_macros.destroy_final_index_iterator(final_index_iterator);
                                    }
                                    Values.restoreValuesFromVector(_values);
                                }
                                finally {
                                    Threads.$is_thread_performing_cleanupP$.rebind(_prev_bind_0_$4, thread);
                                }
                            }
                        }
                        done_var = (SubLObject)SubLObjectFactory.makeBoolean(removal_modules_admitted_formula.NIL == valid || removal_modules_admitted_formula.NIL != rejected);
                    }
                }
            }
            finally {
                mt_relevance_macros.$relevant_mts$.rebind(_prev_bind_3, thread);
                mt_relevance_macros.$relevant_mt_function$.rebind(_prev_bind_2, thread);
                mt_relevance_macros.$mt$.rebind(_prev_bind_0, thread);
            }
            if (removal_modules_admitted_formula.NIL != rejected) {
                return (SubLObject)removal_modules_admitted_formula.NIL;
            }
            final SubLObject arg_genl_pred = kb_accessors.arg_genl_pred(argnum, (SubLObject)removal_modules_admitted_formula.UNPROVIDED, (SubLObject)removal_modules_admitted_formula.UNPROVIDED);
            mt_var = mt;
            _prev_bind_0 = mt_relevance_macros.$mt$.currentBinding(thread);
            _prev_bind_2 = mt_relevance_macros.$relevant_mt_function$.currentBinding(thread);
            _prev_bind_3 = mt_relevance_macros.$relevant_mts$.currentBinding(thread);
            try {
                mt_relevance_macros.$mt$.bind(mt_relevance_macros.update_inference_mt_relevance_mt(mt_var), thread);
                mt_relevance_macros.$relevant_mt_function$.bind(mt_relevance_macros.update_inference_mt_relevance_function(mt_var), thread);
                mt_relevance_macros.$relevant_mts$.bind(mt_relevance_macros.update_inference_mt_relevance_mt_list(mt_var), thread);
                SubLObject arg_genl = (SubLObject)removal_modules_admitted_formula.NIL;
                final SubLObject pred_var = arg_genl_pred;
                if (removal_modules_admitted_formula.NIL != kb_mapping_macros.do_gaf_arg_index_key_validator(relation, (SubLObject)removal_modules_admitted_formula.ONE_INTEGER, pred_var)) {
                    final SubLObject iterator_var = kb_mapping_macros.new_gaf_arg_final_index_spec_iterator(relation, (SubLObject)removal_modules_admitted_formula.ONE_INTEGER, pred_var);
                    SubLObject done_var = rejected;
                    final SubLObject token_var = (SubLObject)removal_modules_admitted_formula.NIL;
                    while (removal_modules_admitted_formula.NIL == done_var) {
                        final SubLObject final_index_spec = iteration.iteration_next_without_values_macro_helper(iterator_var, token_var);
                        final SubLObject valid = (SubLObject)SubLObjectFactory.makeBoolean(!token_var.eql(final_index_spec));
                        if (removal_modules_admitted_formula.NIL != valid) {
                            SubLObject final_index_iterator = (SubLObject)removal_modules_admitted_formula.NIL;
                            try {
                                final_index_iterator = kb_mapping_macros.new_final_index_iterator(final_index_spec, (SubLObject)removal_modules_admitted_formula.$kw14$GAF, (SubLObject)removal_modules_admitted_formula.$kw15$TRUE, (SubLObject)removal_modules_admitted_formula.NIL);
                                SubLObject done_var_$2 = rejected;
                                final SubLObject token_var_$3 = (SubLObject)removal_modules_admitted_formula.NIL;
                                while (removal_modules_admitted_formula.NIL == done_var_$2) {
                                    final SubLObject assertion = iteration.iteration_next_without_values_macro_helper(final_index_iterator, token_var_$3);
                                    final SubLObject valid_$4 = (SubLObject)SubLObjectFactory.makeBoolean(!token_var_$3.eql(assertion));
                                    if (removal_modules_admitted_formula.NIL != valid_$4) {
                                        arg_genl = assertions_high.gaf_arg(assertion, (SubLObject)removal_modules_admitted_formula.TWO_INTEGER);
                                        if (removal_modules_admitted_formula.NIL != forts.fort_p(arg_genl) && !arg_genl.eql(removal_modules_admitted_formula.$const16$Thing) && removal_modules_admitted_formula.NIL == genls.genlsP(v_term, arg_genl, mt, (SubLObject)removal_modules_admitted_formula.UNPROVIDED)) {
                                            rejected = (SubLObject)removal_modules_admitted_formula.T;
                                        }
                                    }
                                    done_var_$2 = (SubLObject)SubLObjectFactory.makeBoolean(removal_modules_admitted_formula.NIL == valid_$4 || removal_modules_admitted_formula.NIL != rejected);
                                }
                            }
                            finally {
                                final SubLObject _prev_bind_0_$5 = Threads.$is_thread_performing_cleanupP$.currentBinding(thread);
                                try {
                                    Threads.$is_thread_performing_cleanupP$.bind((SubLObject)removal_modules_admitted_formula.T, thread);
                                    final SubLObject _values2 = Values.getValuesAsVector();
                                    if (removal_modules_admitted_formula.NIL != final_index_iterator) {
                                        kb_mapping_macros.destroy_final_index_iterator(final_index_iterator);
                                    }
                                    Values.restoreValuesFromVector(_values2);
                                }
                                finally {
                                    Threads.$is_thread_performing_cleanupP$.rebind(_prev_bind_0_$5, thread);
                                }
                            }
                        }
                        done_var = (SubLObject)SubLObjectFactory.makeBoolean(removal_modules_admitted_formula.NIL == valid || removal_modules_admitted_formula.NIL != rejected);
                    }
                }
            }
            finally {
                mt_relevance_macros.$relevant_mts$.rebind(_prev_bind_3, thread);
                mt_relevance_macros.$relevant_mt_function$.rebind(_prev_bind_2, thread);
                mt_relevance_macros.$mt$.rebind(_prev_bind_0, thread);
            }
            if (removal_modules_admitted_formula.NIL != rejected) {
                return (SubLObject)removal_modules_admitted_formula.NIL;
            }
        }
        return at_admitted.admitted_argumentP(v_term, argnum, relation, mt);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/modules/removal/removal-modules-admitted-formula.lisp", position = 7007L)
    public static SubLObject removal_admitted_argument_check_neg_expand(final SubLObject asent, SubLObject sense) {
        if (sense == removal_modules_admitted_formula.UNPROVIDED) {
            sense = (SubLObject)removal_modules_admitted_formula.NIL;
        }
        final SubLObject v_term = cycl_utilities.atomic_sentence_arg1(asent, (SubLObject)removal_modules_admitted_formula.UNPROVIDED);
        final SubLObject arg = cycl_utilities.atomic_sentence_arg2(asent, (SubLObject)removal_modules_admitted_formula.UNPROVIDED);
        final SubLObject relation = cycl_utilities.atomic_sentence_arg3(asent, (SubLObject)removal_modules_admitted_formula.UNPROVIDED);
        final SubLObject admitted = inference_admitted_argument(v_term, arg, relation, (SubLObject)removal_modules_admitted_formula.UNPROVIDED);
        if (removal_modules_admitted_formula.NIL == admitted) {
            backward.removal_add_node(arguments.make_hl_support((SubLObject)removal_modules_admitted_formula.$kw3$ADMIT, cycl_utilities.negate(asent), (SubLObject)removal_modules_admitted_formula.UNPROVIDED, (SubLObject)removal_modules_admitted_formula.UNPROVIDED), (SubLObject)removal_modules_admitted_formula.UNPROVIDED, (SubLObject)removal_modules_admitted_formula.UNPROVIDED);
        }
        return (SubLObject)removal_modules_admitted_formula.NIL;
    }
    
    public static SubLObject declare_removal_modules_admitted_formula_file() {
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.modules.removal.removal_modules_admitted_formula", "removal_admitted_sentence_pos_expand", "REMOVAL-ADMITTED-SENTENCE-POS-EXPAND", 1, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.modules.removal.removal_modules_admitted_formula", "inference_admitted_formula", "INFERENCE-ADMITTED-FORMULA", 1, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.modules.removal.removal_modules_admitted_formula", "inference_admitted_sentence", "INFERENCE-ADMITTED-SENTENCE", 1, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.modules.removal.removal_modules_admitted_formula", "removal_admitted_sentence_neg_expand", "REMOVAL-ADMITTED-SENTENCE-NEG-EXPAND", 1, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.modules.removal.removal_modules_admitted_formula", "removal_admitted_argument_check_pos_expand", "REMOVAL-ADMITTED-ARGUMENT-CHECK-POS-EXPAND", 1, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.modules.removal.removal_modules_admitted_formula", "inference_admitted_argument", "INFERENCE-ADMITTED-ARGUMENT", 3, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.modules.removal.removal_modules_admitted_formula", "removal_admitted_argument_check_neg_expand", "REMOVAL-ADMITTED-ARGUMENT-CHECK-NEG-EXPAND", 1, 1, false);
        return (SubLObject)removal_modules_admitted_formula.NIL;
    }
    
    public static SubLObject init_removal_modules_admitted_formula_file() {
        removal_modules_admitted_formula.$default_removal_admitted_formula_cost$ = SubLFiles.defparameter("*DEFAULT-REMOVAL-ADMITTED-FORMULA-COST*", (SubLObject)removal_modules_admitted_formula.ONE_INTEGER);
        removal_modules_admitted_formula.$default_removal_admitted_argument_check_cost$ = SubLFiles.defparameter("*DEFAULT-REMOVAL-ADMITTED-ARGUMENT-CHECK-COST*", (SubLObject)removal_modules_admitted_formula.$float13$0_9);
        return (SubLObject)removal_modules_admitted_formula.NIL;
    }
    
    public static SubLObject setup_removal_modules_admitted_formula_file() {
        inference_modules.register_solely_specific_removal_module_predicate(removal_modules_admitted_formula.$const0$admittedSentence);
        inference_modules.inference_removal_module_dont_use_universal(removal_modules_admitted_formula.$const0$admittedSentence, (SubLObject)removal_modules_admitted_formula.$kw1$REMOVAL_NON_WFF_CHECK_NEG);
        preference_modules.doomed_unless_all_args_bindable((SubLObject)removal_modules_admitted_formula.$kw2$BOTH, removal_modules_admitted_formula.$const0$admittedSentence);
        inference_modules.inference_removal_module((SubLObject)removal_modules_admitted_formula.$kw4$REMOVAL_ADMITTED_SENTENCE_POS, (SubLObject)removal_modules_admitted_formula.$list5);
        inference_modules.inference_removal_module((SubLObject)removal_modules_admitted_formula.$kw8$REMOVAL_ADMITTED_SENTENCE_NEG, (SubLObject)removal_modules_admitted_formula.$list9);
        inference_modules.register_solely_specific_removal_module_predicate(removal_modules_admitted_formula.$const10$admittedArgument);
        inference_modules.inference_removal_module_dont_use_universal(removal_modules_admitted_formula.$const10$admittedArgument, (SubLObject)removal_modules_admitted_formula.$kw1$REMOVAL_NON_WFF_CHECK_NEG);
        preference_modules.doomed_unless_all_args_bindable((SubLObject)removal_modules_admitted_formula.$kw2$BOTH, removal_modules_admitted_formula.$const10$admittedArgument);
        inference_modules.inference_removal_module((SubLObject)removal_modules_admitted_formula.$kw11$REMOVAL_ADMITTED_ARGUMENT_CHECK_POS, (SubLObject)removal_modules_admitted_formula.$list12);
        inference_modules.inference_removal_module((SubLObject)removal_modules_admitted_formula.$kw17$REMOVAL_ADMITTED_ARGUMENT_CHECK_NEG, (SubLObject)removal_modules_admitted_formula.$list18);
        return (SubLObject)removal_modules_admitted_formula.NIL;
    }
    
    public void declareFunctions() {
        declare_removal_modules_admitted_formula_file();
    }
    
    public void initializeVariables() {
        init_removal_modules_admitted_formula_file();
    }
    
    public void runTopLevelForms() {
        setup_removal_modules_admitted_formula_file();
    }
    
    static {
        me = (SubLFile)new removal_modules_admitted_formula();
        removal_modules_admitted_formula.$default_removal_admitted_formula_cost$ = null;
        removal_modules_admitted_formula.$default_removal_admitted_argument_check_cost$ = null;
        $const0$admittedSentence = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("admittedSentence"));
        $kw1$REMOVAL_NON_WFF_CHECK_NEG = SubLObjectFactory.makeKeyword("REMOVAL-NON-WFF-CHECK-NEG");
        $kw2$BOTH = SubLObjectFactory.makeKeyword("BOTH");
        $kw3$ADMIT = SubLObjectFactory.makeKeyword("ADMIT");
        $kw4$REMOVAL_ADMITTED_SENTENCE_POS = SubLObjectFactory.makeKeyword("REMOVAL-ADMITTED-SENTENCE-POS");
        $list5 = ConsesLow.list(new SubLObject[] { SubLObjectFactory.makeKeyword("SENSE"), SubLObjectFactory.makeKeyword("POS"), SubLObjectFactory.makeKeyword("PREDICATE"), constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("admittedSentence")), SubLObjectFactory.makeKeyword("REQUIRED-PATTERN"), ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("admittedSentence")), (SubLObject)SubLObjectFactory.makeKeyword("FULLY-BOUND")), SubLObjectFactory.makeKeyword("COST-EXPRESSION"), SubLObjectFactory.makeSymbol("*DEFAULT-REMOVAL-ADMITTED-FORMULA-COST*"), SubLObjectFactory.makeKeyword("COMPLETENESS"), SubLObjectFactory.makeKeyword("COMPLETE"), SubLObjectFactory.makeKeyword("EXPAND"), SubLObjectFactory.makeSymbol("REMOVAL-ADMITTED-SENTENCE-POS-EXPAND"), SubLObjectFactory.makeKeyword("DOCUMENTATION"), SubLObjectFactory.makeString("(#$admittedSentence <fully-bound>)\nby checking that the formula is syntactically and semantically well-formed"), SubLObjectFactory.makeKeyword("EXAMPLE"), SubLObjectFactory.makeString("(#$admittedSentence (#$bordersOn #$Canada #$France))") });
        $kw6$IGNORE = SubLObjectFactory.makeKeyword("IGNORE");
        $const7$True = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("True"));
        $kw8$REMOVAL_ADMITTED_SENTENCE_NEG = SubLObjectFactory.makeKeyword("REMOVAL-ADMITTED-SENTENCE-NEG");
        $list9 = ConsesLow.list(new SubLObject[] { SubLObjectFactory.makeKeyword("SENSE"), SubLObjectFactory.makeKeyword("NEG"), SubLObjectFactory.makeKeyword("PREDICATE"), constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("admittedSentence")), SubLObjectFactory.makeKeyword("REQUIRED-PATTERN"), ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("admittedSentence")), (SubLObject)SubLObjectFactory.makeKeyword("FULLY-BOUND")), SubLObjectFactory.makeKeyword("COST-EXPRESSION"), SubLObjectFactory.makeSymbol("*DEFAULT-REMOVAL-ADMITTED-FORMULA-COST*"), SubLObjectFactory.makeKeyword("COMPLETENESS"), SubLObjectFactory.makeKeyword("COMPLETE"), SubLObjectFactory.makeKeyword("EXPAND"), SubLObjectFactory.makeSymbol("REMOVAL-ADMITTED-SENTENCE-NEG-EXPAND"), SubLObjectFactory.makeKeyword("DOCUMENTATION"), SubLObjectFactory.makeString("(#$not (#$admittedSentence <fully-bound>))\nby checking that the formula is not both syntactically and semantically well-formed"), SubLObjectFactory.makeKeyword("EXAMPLE"), SubLObjectFactory.makeString("(#$not (#$admittedSentence (#$genls #$Canada #$Country)))") });
        $const10$admittedArgument = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("admittedArgument"));
        $kw11$REMOVAL_ADMITTED_ARGUMENT_CHECK_POS = SubLObjectFactory.makeKeyword("REMOVAL-ADMITTED-ARGUMENT-CHECK-POS");
        $list12 = ConsesLow.list(new SubLObject[] { SubLObjectFactory.makeKeyword("SENSE"), SubLObjectFactory.makeKeyword("POS"), SubLObjectFactory.makeKeyword("PREDICATE"), constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("admittedArgument")), SubLObjectFactory.makeKeyword("REQUIRED-PATTERN"), ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("admittedArgument")), (SubLObject)SubLObjectFactory.makeKeyword("FULLY-BOUND"), (SubLObject)SubLObjectFactory.makeKeyword("INTEGER"), (SubLObject)SubLObjectFactory.makeKeyword("FORT")), SubLObjectFactory.makeKeyword("COST-EXPRESSION"), SubLObjectFactory.makeSymbol("*DEFAULT-REMOVAL-ADMITTED-ARGUMENT-CHECK-COST*"), SubLObjectFactory.makeKeyword("COMPLETENESS"), SubLObjectFactory.makeKeyword("COMPLETE"), SubLObjectFactory.makeKeyword("EXPAND"), SubLObjectFactory.makeSymbol("REMOVAL-ADMITTED-ARGUMENT-CHECK-POS-EXPAND"), SubLObjectFactory.makeKeyword("DOCUMENTATION"), SubLObjectFactory.makeString("(#$admittedArgument <fully-bound> <integer> <fort>)\nby checking that the argument is syntactically and semantically well-formed"), SubLObjectFactory.makeKeyword("EXAMPLE"), SubLObjectFactory.makeString("(#$admittedArgument #$Canada 1 #$bordersOn)\n (#$admittedArgument #$Dog 1 #$JuvenileFn)") });
        $float13$0_9 = (SubLFloat)SubLObjectFactory.makeDouble(0.9);
        $kw14$GAF = SubLObjectFactory.makeKeyword("GAF");
        $kw15$TRUE = SubLObjectFactory.makeKeyword("TRUE");
        $const16$Thing = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("Thing"));
        $kw17$REMOVAL_ADMITTED_ARGUMENT_CHECK_NEG = SubLObjectFactory.makeKeyword("REMOVAL-ADMITTED-ARGUMENT-CHECK-NEG");
        $list18 = ConsesLow.list(new SubLObject[] { SubLObjectFactory.makeKeyword("SENSE"), SubLObjectFactory.makeKeyword("NEG"), SubLObjectFactory.makeKeyword("PREDICATE"), constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("admittedArgument")), SubLObjectFactory.makeKeyword("REQUIRED-PATTERN"), ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("admittedArgument")), (SubLObject)SubLObjectFactory.makeKeyword("FULLY-BOUND"), (SubLObject)SubLObjectFactory.makeKeyword("INTEGER"), (SubLObject)SubLObjectFactory.makeKeyword("FORT")), SubLObjectFactory.makeKeyword("COST-EXPRESSION"), SubLObjectFactory.makeSymbol("*DEFAULT-REMOVAL-ADMITTED-ARGUMENT-CHECK-COST*"), SubLObjectFactory.makeKeyword("COMPLETENESS"), SubLObjectFactory.makeKeyword("COMPLETE"), SubLObjectFactory.makeKeyword("EXPAND"), SubLObjectFactory.makeSymbol("REMOVAL-ADMITTED-ARGUMENT-CHECK-NEG-EXPAND"), SubLObjectFactory.makeKeyword("DOCUMENTATION"), SubLObjectFactory.makeString("(#$not (#$admittedArgument <fully-bound> <integer> <fort>))\nby checking that the argument is not both syntactically and semantically well-formed"), SubLObjectFactory.makeKeyword("EXAMPLE"), SubLObjectFactory.makeString("(#$not (#$admittedArgument #$Canada 1 #$genls))\n (#$not (#$admittedArgument #$Dog 1 #$LeftFn))") });
    }
}

/*

	Total time: 134 ms
	
*/