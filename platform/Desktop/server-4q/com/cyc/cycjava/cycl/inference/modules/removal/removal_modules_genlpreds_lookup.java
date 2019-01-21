package com.cyc.cycjava.cycl.inference.modules.removal;

import com.cyc.tool.subl.jrtl.nativeCode.subLisp.BinaryFunction;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.UnaryFunction;
import com.cyc.cycjava.cycl.constant_handles;
import com.cyc.cycjava.cycl.subl_macro_promotions;
import com.cyc.cycjava.cycl.inference.harness.inference_modules;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Symbols;
import com.cyc.tool.subl.util.SubLFiles;
import com.cyc.cycjava.cycl.arguments;
import com.cyc.cycjava.cycl.inference.inference_trampolines;
import com.cyc.cycjava.cycl.unification_utilities;
import com.cyc.cycjava.cycl.backward_utilities;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Functions;
import com.cyc.cycjava.cycl.list_utilities;
import com.cyc.cycjava.cycl.obsolete;
import com.cyc.cycjava.cycl.set_contents;
import com.cyc.cycjava.cycl.set;
import com.cyc.cycjava.cycl.mt_relevance_macros;
import com.cyc.cycjava.cycl.dictionary_contents;
import com.cyc.cycjava.cycl.dictionary;
import com.cyc.cycjava.cycl.sbhl.sbhl_links;
import com.cyc.cycjava.cycl.sbhl.sbhl_graphs;
import com.cyc.cycjava.cycl.function_terms;
import com.cyc.cycjava.cycl.sbhl.sbhl_macros;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Numbers;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.conses_high;
import com.cyc.cycjava.cycl.sbhl.sbhl_marking_utilities;
import com.cyc.cycjava.cycl.sbhl.sbhl_link_vars;
import com.cyc.cycjava.cycl.sbhl.sbhl_module_utilities;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Errors;
import com.cyc.cycjava.cycl.sbhl.sbhl_paranoia;
import com.cyc.cycjava.cycl.sbhl.sbhl_marking_vars;
import com.cyc.cycjava.cycl.deck;
import com.cyc.cycjava.cycl.sbhl.sbhl_module_vars;
import com.cyc.cycjava.cycl.tva_inference;
import com.cyc.cycjava.cycl.kb_accessors;
import com.cyc.cycjava.cycl.cycl_utilities;
import com.cyc.cycjava.cycl.sbhl.sbhl_search_vars;
import com.cyc.cycjava.cycl.el_utilities;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.SubLThread;
import com.cyc.cycjava.cycl.assertions_high;
import com.cyc.cycjava.cycl.virtual_indexing;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Time;
import com.cyc.cycjava.cycl.utilities_macros;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Values;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Threads;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory;
import com.cyc.cycjava.cycl.iteration;
import com.cyc.cycjava.cycl.kb_mapping_macros;
import com.cyc.cycjava.cycl.kb_indexing;
import com.cyc.cycjava.cycl.enumeration_types;
import com.cyc.cycjava.cycl.pred_relevance_macros;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLProcess;
import com.cyc.cycjava.cycl.inference.harness.removal_module_utilities;
import com.cyc.cycjava.cycl.control_vars;
import com.cyc.cycjava.cycl.variables;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLString;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObject;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLList;
import com.cyc.tool.subl.jrtl.nativeCode.type.symbol.SubLSymbol;
import com.cyc.tool.subl.util.SubLFile;
import com.cyc.tool.subl.util.SubLTranslatedFile;

public final class removal_modules_genlpreds_lookup extends SubLTranslatedFile
{
    public static final SubLFile me;
    public static final String myName = "com.cyc.cycjava.cycl.inference.modules.removal.removal_modules_genlpreds_lookup";
    public static final String myFingerPrint = "bf7e71d12730d6fde394c40fa5b4faf3b65dcac27b912d2964e9e9d3ea624b63";
    @SubLTranslatedFile.SubL(source = "cycl/inference/modules/removal/removal-modules-genlpreds-lookup.lisp", position = 4767L)
    private static SubLSymbol $unknown_hl_variable$;
    private static final SubLSymbol $kw0$POS;
    private static final SubLSymbol $kw1$REMOVAL_GENLPREDS_LOOKUP_POS;
    private static final SubLList $list2;
    private static final SubLSymbol $kw3$NEG;
    private static final SubLSymbol $kw4$GROSSLY_INCOMPLETE;
    private static final SubLSymbol $kw5$INCOMPLETE;
    private static final SubLSymbol $kw6$REMOVAL_GENLPREDS_LOOKUP_NEG;
    private static final SubLList $list7;
    private static final SubLSymbol $kw8$GAF_ARG;
    private static final SubLSymbol $kw9$GAF;
    private static final SubLSymbol $kw10$PREDICATE_EXTENT;
    private static final SubLSymbol $kw11$OVERLAP;
    private static final SubLSymbol $sym12$_UNKNOWN_HL_VARIABLE_;
    private static final SubLList $list13;
    private static final SubLObject $const14$genlPreds;
    private static final SubLSymbol $kw15$DEPTH;
    private static final SubLSymbol $kw16$STACK;
    private static final SubLSymbol $kw17$QUEUE;
    private static final SubLSymbol $sym18$RELEVANT_SBHL_TV_IS_GENERAL_TV;
    private static final SubLSymbol $kw19$ERROR;
    private static final SubLString $str20$_A_is_not_a__A;
    private static final SubLSymbol $sym21$SBHL_TRUE_TV_P;
    private static final SubLSymbol $kw22$CERROR;
    private static final SubLString $str23$continue_anyway;
    private static final SubLSymbol $kw24$WARN;
    private static final SubLString $str25$_A_is_not_a_valid__sbhl_type_erro;
    private static final SubLString $str26$_A_is_neither_SET_P_nor_LISTP_;
    private static final SubLString $str27$attempting_to_bind_direction_link;
    private static final SubLString $str28$Node__a_does_not_pass_sbhl_type_t;
    private static final SubLSymbol $kw29$REMOVAL_GENLPREDS_PRED_INDEX_POS;
    private static final SubLList $list30;
    private static final SubLSymbol $kw31$REMOVAL_GENLPREDS_PRED_INDEX_NEG;
    private static final SubLList $list32;
    private static final SubLSymbol $kw33$REMOVAL_GENLINVERSE_LOOKUP_POS;
    private static final SubLList $list34;
    private static final SubLSymbol $kw35$REMOVAL_GENLINVERSE_LOOKUP_NEG;
    private static final SubLList $list36;
    private static final SubLSymbol $kw37$REMOVAL_GENLINVERSE_PRED_INDEX_POS;
    private static final SubLList $list38;
    private static final SubLSymbol $kw39$REMOVAL_GENLINVERSE_PRED_INDEX_NEG;
    private static final SubLList $list40;
    private static final SubLSymbol $sym41$INFERENCE_NEGATION_PREDICATE_;
    private static final SubLSymbol $kw42$TRUE;
    private static final SubLSymbol $kw43$REMOVAL_NEGATIONPREDS_LOOKUP;
    private static final SubLList $list44;
    private static final SubLObject $const45$negationPreds;
    private static final SubLSymbol $kw46$NEGATIONPREDS;
    private static final SubLSymbol $sym47$INFERENCE_NEGATION_INVERSE_;
    private static final SubLSymbol $kw48$REMOVAL_NEGATIONINVERSE_LOOKUP;
    private static final SubLList $list49;
    private static final SubLObject $const50$negationInverse;
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/modules/removal/removal-modules-genlpreds-lookup.lisp", position = 873L)
    public static SubLObject removal_genlpreds_lookup_pos_cost(final SubLObject asent, SubLObject sense) {
        if (sense == removal_modules_genlpreds_lookup.UNPROVIDED) {
            sense = (SubLObject)removal_modules_genlpreds_lookup.NIL;
        }
        if (removal_modules_genlpreds_lookup.NIL != variables.fully_bound_p(asent)) {
            return control_vars.$typical_hl_module_check_cost$.getGlobalValue();
        }
        return num_best_genlpreds_gaf_lookup_index(asent, (SubLObject)removal_modules_genlpreds_lookup.$kw0$POS);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/modules/removal/removal-modules-genlpreds-lookup.lisp", position = 1649L)
    public static SubLObject removal_genlpreds_lookup_pos_iterator(final SubLObject asent) {
        return removal_genlpreds_lookup_iterator(asent, (SubLObject)removal_modules_genlpreds_lookup.$kw0$POS);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/modules/removal/removal-modules-genlpreds-lookup.lisp", position = 2792L)
    public static SubLObject removal_genlpreds_lookup_neg_completeness(final SubLObject asent) {
        if (removal_modules_genlpreds_lookup.NIL != removal_module_utilities.negation_grossly_incompleteP(asent, (SubLObject)removal_modules_genlpreds_lookup.$kw3$NEG)) {
            return (SubLObject)removal_modules_genlpreds_lookup.$kw4$GROSSLY_INCOMPLETE;
        }
        return (SubLObject)removal_modules_genlpreds_lookup.$kw5$INCOMPLETE;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/modules/removal/removal-modules-genlpreds-lookup.lisp", position = 2969L)
    public static SubLObject removal_genlpreds_lookup_neg_cost(final SubLObject asent, SubLObject sense) {
        if (sense == removal_modules_genlpreds_lookup.UNPROVIDED) {
            sense = (SubLObject)removal_modules_genlpreds_lookup.NIL;
        }
        return num_best_genlpreds_gaf_lookup_index(asent, (SubLObject)removal_modules_genlpreds_lookup.$kw3$NEG);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/modules/removal/removal-modules-genlpreds-lookup.lisp", position = 3123L)
    public static SubLObject removal_genlpreds_lookup_neg_iterator(final SubLObject asent) {
        return removal_genlpreds_lookup_iterator(asent, (SubLObject)removal_modules_genlpreds_lookup.$kw3$NEG);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/modules/removal/removal-modules-genlpreds-lookup.lisp", position = 4273L)
    public static SubLObject removal_genlpreds_lookup_iterator(final SubLObject asent, final SubLObject sense) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject result = (SubLObject)removal_modules_genlpreds_lookup.NIL;
        final SubLObject obfuscated_asent = obfuscate_predicate(asent);
        final SubLObject _prev_bind_0 = pred_relevance_macros.$relevant_pred_function$.currentBinding(thread);
        final SubLObject _prev_bind_2 = control_vars.$inference_literal$.currentBinding(thread);
        final SubLObject _prev_bind_3 = control_vars.$inference_sense$.currentBinding(thread);
        try {
            pred_relevance_macros.$relevant_pred_function$.bind(pred_relevance_macros.determine_inference_genl_or_spec_pred_relevance(sense), thread);
            control_vars.$inference_literal$.bind(asent, thread);
            control_vars.$inference_sense$.bind(sense, thread);
            final SubLObject l_index = kb_indexing.best_gaf_lookup_index(obfuscated_asent, enumeration_types.sense_truth(sense), (SubLObject)removal_modules_genlpreds_lookup.NIL);
            final SubLObject pcase_var;
            final SubLObject method = pcase_var = kb_mapping_macros.do_gli_extract_method(l_index);
            if (pcase_var.eql((SubLObject)removal_modules_genlpreds_lookup.$kw8$GAF_ARG)) {
                thread.resetMultipleValues();
                final SubLObject v_term = kb_mapping_macros.do_gli_vga_extract_keys(l_index);
                final SubLObject argnum = thread.secondMultipleValue();
                final SubLObject predicate = thread.thirdMultipleValue();
                thread.resetMultipleValues();
                if (removal_modules_genlpreds_lookup.NIL != argnum) {
                    if (removal_modules_genlpreds_lookup.NIL != predicate) {
                        final SubLObject pred_var = predicate;
                        if (removal_modules_genlpreds_lookup.NIL != kb_mapping_macros.do_gaf_arg_index_key_validator(v_term, argnum, pred_var)) {
                            final SubLObject iterator_var = kb_mapping_macros.new_gaf_arg_final_index_spec_iterator(v_term, argnum, pred_var);
                            SubLObject done_var = (SubLObject)removal_modules_genlpreds_lookup.NIL;
                            final SubLObject token_var = (SubLObject)removal_modules_genlpreds_lookup.NIL;
                            while (removal_modules_genlpreds_lookup.NIL == done_var) {
                                final SubLObject final_index_spec = iteration.iteration_next_without_values_macro_helper(iterator_var, token_var);
                                final SubLObject valid = (SubLObject)SubLObjectFactory.makeBoolean(!token_var.eql(final_index_spec));
                                if (removal_modules_genlpreds_lookup.NIL != valid) {
                                    SubLObject final_index_iterator = (SubLObject)removal_modules_genlpreds_lookup.NIL;
                                    try {
                                        final_index_iterator = kb_mapping_macros.new_final_index_iterator(final_index_spec, (SubLObject)removal_modules_genlpreds_lookup.$kw9$GAF, enumeration_types.sense_truth(sense), (SubLObject)removal_modules_genlpreds_lookup.NIL);
                                        SubLObject done_var_$1 = (SubLObject)removal_modules_genlpreds_lookup.NIL;
                                        final SubLObject token_var_$2 = (SubLObject)removal_modules_genlpreds_lookup.NIL;
                                        while (removal_modules_genlpreds_lookup.NIL == done_var_$1) {
                                            final SubLObject gaf = iteration.iteration_next_without_values_macro_helper(final_index_iterator, token_var_$2);
                                            final SubLObject valid_$3 = (SubLObject)SubLObjectFactory.makeBoolean(!token_var_$2.eql(gaf));
                                            if (removal_modules_genlpreds_lookup.NIL != valid_$3) {
                                                final SubLObject var;
                                                final SubLObject bindings_assertion = var = removal_genlpreds_gaf_iterator_internal(gaf);
                                                if (removal_modules_genlpreds_lookup.NIL != var) {
                                                    result = (SubLObject)ConsesLow.cons(var, result);
                                                }
                                            }
                                            done_var_$1 = (SubLObject)SubLObjectFactory.makeBoolean(removal_modules_genlpreds_lookup.NIL == valid_$3);
                                        }
                                    }
                                    finally {
                                        final SubLObject _prev_bind_0_$4 = Threads.$is_thread_performing_cleanupP$.currentBinding(thread);
                                        try {
                                            Threads.$is_thread_performing_cleanupP$.bind((SubLObject)removal_modules_genlpreds_lookup.T, thread);
                                            final SubLObject _values = Values.getValuesAsVector();
                                            if (removal_modules_genlpreds_lookup.NIL != final_index_iterator) {
                                                kb_mapping_macros.destroy_final_index_iterator(final_index_iterator);
                                            }
                                            Values.restoreValuesFromVector(_values);
                                        }
                                        finally {
                                            Threads.$is_thread_performing_cleanupP$.rebind(_prev_bind_0_$4, thread);
                                        }
                                    }
                                }
                                done_var = (SubLObject)SubLObjectFactory.makeBoolean(removal_modules_genlpreds_lookup.NIL == valid);
                            }
                        }
                    }
                    else {
                        final SubLObject pred_var = (SubLObject)removal_modules_genlpreds_lookup.NIL;
                        if (removal_modules_genlpreds_lookup.NIL != kb_mapping_macros.do_gaf_arg_index_key_validator(v_term, argnum, pred_var)) {
                            final SubLObject iterator_var = kb_mapping_macros.new_gaf_arg_final_index_spec_iterator(v_term, argnum, pred_var);
                            SubLObject done_var = (SubLObject)removal_modules_genlpreds_lookup.NIL;
                            final SubLObject token_var = (SubLObject)removal_modules_genlpreds_lookup.NIL;
                            while (removal_modules_genlpreds_lookup.NIL == done_var) {
                                final SubLObject final_index_spec = iteration.iteration_next_without_values_macro_helper(iterator_var, token_var);
                                final SubLObject valid = (SubLObject)SubLObjectFactory.makeBoolean(!token_var.eql(final_index_spec));
                                if (removal_modules_genlpreds_lookup.NIL != valid) {
                                    SubLObject final_index_iterator = (SubLObject)removal_modules_genlpreds_lookup.NIL;
                                    try {
                                        final_index_iterator = kb_mapping_macros.new_final_index_iterator(final_index_spec, (SubLObject)removal_modules_genlpreds_lookup.$kw9$GAF, enumeration_types.sense_truth(sense), (SubLObject)removal_modules_genlpreds_lookup.NIL);
                                        SubLObject done_var_$2 = (SubLObject)removal_modules_genlpreds_lookup.NIL;
                                        final SubLObject token_var_$3 = (SubLObject)removal_modules_genlpreds_lookup.NIL;
                                        while (removal_modules_genlpreds_lookup.NIL == done_var_$2) {
                                            final SubLObject gaf = iteration.iteration_next_without_values_macro_helper(final_index_iterator, token_var_$3);
                                            final SubLObject valid_$4 = (SubLObject)SubLObjectFactory.makeBoolean(!token_var_$3.eql(gaf));
                                            if (removal_modules_genlpreds_lookup.NIL != valid_$4) {
                                                final SubLObject var;
                                                final SubLObject bindings_assertion = var = removal_genlpreds_gaf_iterator_internal(gaf);
                                                if (removal_modules_genlpreds_lookup.NIL != var) {
                                                    result = (SubLObject)ConsesLow.cons(var, result);
                                                }
                                            }
                                            done_var_$2 = (SubLObject)SubLObjectFactory.makeBoolean(removal_modules_genlpreds_lookup.NIL == valid_$4);
                                        }
                                    }
                                    finally {
                                        final SubLObject _prev_bind_0_$5 = Threads.$is_thread_performing_cleanupP$.currentBinding(thread);
                                        try {
                                            Threads.$is_thread_performing_cleanupP$.bind((SubLObject)removal_modules_genlpreds_lookup.T, thread);
                                            final SubLObject _values2 = Values.getValuesAsVector();
                                            if (removal_modules_genlpreds_lookup.NIL != final_index_iterator) {
                                                kb_mapping_macros.destroy_final_index_iterator(final_index_iterator);
                                            }
                                            Values.restoreValuesFromVector(_values2);
                                        }
                                        finally {
                                            Threads.$is_thread_performing_cleanupP$.rebind(_prev_bind_0_$5, thread);
                                        }
                                    }
                                }
                                done_var = (SubLObject)SubLObjectFactory.makeBoolean(removal_modules_genlpreds_lookup.NIL == valid);
                            }
                        }
                    }
                }
                else if (removal_modules_genlpreds_lookup.NIL != predicate) {
                    final SubLObject pred_var = predicate;
                    if (removal_modules_genlpreds_lookup.NIL != kb_mapping_macros.do_gaf_arg_index_key_validator(v_term, (SubLObject)removal_modules_genlpreds_lookup.NIL, pred_var)) {
                        final SubLObject iterator_var = kb_mapping_macros.new_gaf_arg_final_index_spec_iterator(v_term, (SubLObject)removal_modules_genlpreds_lookup.NIL, pred_var);
                        SubLObject done_var = (SubLObject)removal_modules_genlpreds_lookup.NIL;
                        final SubLObject token_var = (SubLObject)removal_modules_genlpreds_lookup.NIL;
                        while (removal_modules_genlpreds_lookup.NIL == done_var) {
                            final SubLObject final_index_spec = iteration.iteration_next_without_values_macro_helper(iterator_var, token_var);
                            final SubLObject valid = (SubLObject)SubLObjectFactory.makeBoolean(!token_var.eql(final_index_spec));
                            if (removal_modules_genlpreds_lookup.NIL != valid) {
                                SubLObject final_index_iterator = (SubLObject)removal_modules_genlpreds_lookup.NIL;
                                try {
                                    final_index_iterator = kb_mapping_macros.new_final_index_iterator(final_index_spec, (SubLObject)removal_modules_genlpreds_lookup.$kw9$GAF, enumeration_types.sense_truth(sense), (SubLObject)removal_modules_genlpreds_lookup.NIL);
                                    SubLObject done_var_$3 = (SubLObject)removal_modules_genlpreds_lookup.NIL;
                                    final SubLObject token_var_$4 = (SubLObject)removal_modules_genlpreds_lookup.NIL;
                                    while (removal_modules_genlpreds_lookup.NIL == done_var_$3) {
                                        final SubLObject gaf = iteration.iteration_next_without_values_macro_helper(final_index_iterator, token_var_$4);
                                        final SubLObject valid_$5 = (SubLObject)SubLObjectFactory.makeBoolean(!token_var_$4.eql(gaf));
                                        if (removal_modules_genlpreds_lookup.NIL != valid_$5) {
                                            final SubLObject var;
                                            final SubLObject bindings_assertion = var = removal_genlpreds_gaf_iterator_internal(gaf);
                                            if (removal_modules_genlpreds_lookup.NIL != var) {
                                                result = (SubLObject)ConsesLow.cons(var, result);
                                            }
                                        }
                                        done_var_$3 = (SubLObject)SubLObjectFactory.makeBoolean(removal_modules_genlpreds_lookup.NIL == valid_$5);
                                    }
                                }
                                finally {
                                    final SubLObject _prev_bind_0_$6 = Threads.$is_thread_performing_cleanupP$.currentBinding(thread);
                                    try {
                                        Threads.$is_thread_performing_cleanupP$.bind((SubLObject)removal_modules_genlpreds_lookup.T, thread);
                                        final SubLObject _values3 = Values.getValuesAsVector();
                                        if (removal_modules_genlpreds_lookup.NIL != final_index_iterator) {
                                            kb_mapping_macros.destroy_final_index_iterator(final_index_iterator);
                                        }
                                        Values.restoreValuesFromVector(_values3);
                                    }
                                    finally {
                                        Threads.$is_thread_performing_cleanupP$.rebind(_prev_bind_0_$6, thread);
                                    }
                                }
                            }
                            done_var = (SubLObject)SubLObjectFactory.makeBoolean(removal_modules_genlpreds_lookup.NIL == valid);
                        }
                    }
                }
                else {
                    final SubLObject pred_var = (SubLObject)removal_modules_genlpreds_lookup.NIL;
                    if (removal_modules_genlpreds_lookup.NIL != kb_mapping_macros.do_gaf_arg_index_key_validator(v_term, (SubLObject)removal_modules_genlpreds_lookup.NIL, pred_var)) {
                        final SubLObject iterator_var = kb_mapping_macros.new_gaf_arg_final_index_spec_iterator(v_term, (SubLObject)removal_modules_genlpreds_lookup.NIL, pred_var);
                        SubLObject done_var = (SubLObject)removal_modules_genlpreds_lookup.NIL;
                        final SubLObject token_var = (SubLObject)removal_modules_genlpreds_lookup.NIL;
                        while (removal_modules_genlpreds_lookup.NIL == done_var) {
                            final SubLObject final_index_spec = iteration.iteration_next_without_values_macro_helper(iterator_var, token_var);
                            final SubLObject valid = (SubLObject)SubLObjectFactory.makeBoolean(!token_var.eql(final_index_spec));
                            if (removal_modules_genlpreds_lookup.NIL != valid) {
                                SubLObject final_index_iterator = (SubLObject)removal_modules_genlpreds_lookup.NIL;
                                try {
                                    final_index_iterator = kb_mapping_macros.new_final_index_iterator(final_index_spec, (SubLObject)removal_modules_genlpreds_lookup.$kw9$GAF, enumeration_types.sense_truth(sense), (SubLObject)removal_modules_genlpreds_lookup.NIL);
                                    SubLObject done_var_$4 = (SubLObject)removal_modules_genlpreds_lookup.NIL;
                                    final SubLObject token_var_$5 = (SubLObject)removal_modules_genlpreds_lookup.NIL;
                                    while (removal_modules_genlpreds_lookup.NIL == done_var_$4) {
                                        final SubLObject gaf = iteration.iteration_next_without_values_macro_helper(final_index_iterator, token_var_$5);
                                        final SubLObject valid_$6 = (SubLObject)SubLObjectFactory.makeBoolean(!token_var_$5.eql(gaf));
                                        if (removal_modules_genlpreds_lookup.NIL != valid_$6) {
                                            final SubLObject var;
                                            final SubLObject bindings_assertion = var = removal_genlpreds_gaf_iterator_internal(gaf);
                                            if (removal_modules_genlpreds_lookup.NIL != var) {
                                                result = (SubLObject)ConsesLow.cons(var, result);
                                            }
                                        }
                                        done_var_$4 = (SubLObject)SubLObjectFactory.makeBoolean(removal_modules_genlpreds_lookup.NIL == valid_$6);
                                    }
                                }
                                finally {
                                    final SubLObject _prev_bind_0_$7 = Threads.$is_thread_performing_cleanupP$.currentBinding(thread);
                                    try {
                                        Threads.$is_thread_performing_cleanupP$.bind((SubLObject)removal_modules_genlpreds_lookup.T, thread);
                                        final SubLObject _values4 = Values.getValuesAsVector();
                                        if (removal_modules_genlpreds_lookup.NIL != final_index_iterator) {
                                            kb_mapping_macros.destroy_final_index_iterator(final_index_iterator);
                                        }
                                        Values.restoreValuesFromVector(_values4);
                                    }
                                    finally {
                                        Threads.$is_thread_performing_cleanupP$.rebind(_prev_bind_0_$7, thread);
                                    }
                                }
                            }
                            done_var = (SubLObject)SubLObjectFactory.makeBoolean(removal_modules_genlpreds_lookup.NIL == valid);
                        }
                    }
                }
            }
            else if (pcase_var.eql((SubLObject)removal_modules_genlpreds_lookup.$kw10$PREDICATE_EXTENT)) {
                final SubLObject pred_var2 = kb_mapping_macros.do_gli_vpe_extract_key(l_index);
                if (removal_modules_genlpreds_lookup.NIL != kb_mapping_macros.do_predicate_extent_index_key_validator(pred_var2)) {
                    final SubLObject str = (SubLObject)removal_modules_genlpreds_lookup.NIL;
                    final SubLObject _prev_bind_0_$8 = utilities_macros.$progress_start_time$.currentBinding(thread);
                    final SubLObject _prev_bind_1_$18 = utilities_macros.$progress_last_pacification_time$.currentBinding(thread);
                    final SubLObject _prev_bind_2_$19 = utilities_macros.$progress_elapsed_seconds_for_notification$.currentBinding(thread);
                    final SubLObject _prev_bind_4 = utilities_macros.$progress_notification_count$.currentBinding(thread);
                    final SubLObject _prev_bind_5 = utilities_macros.$progress_pacifications_since_last_nl$.currentBinding(thread);
                    final SubLObject _prev_bind_6 = utilities_macros.$progress_count$.currentBinding(thread);
                    final SubLObject _prev_bind_7 = utilities_macros.$is_noting_progressP$.currentBinding(thread);
                    final SubLObject _prev_bind_8 = utilities_macros.$silent_progressP$.currentBinding(thread);
                    try {
                        utilities_macros.$progress_start_time$.bind(Time.get_universal_time(), thread);
                        utilities_macros.$progress_last_pacification_time$.bind(utilities_macros.$progress_start_time$.getDynamicValue(thread), thread);
                        utilities_macros.$progress_elapsed_seconds_for_notification$.bind(utilities_macros.$suppress_all_progress_faster_than_seconds$.getDynamicValue(thread), thread);
                        utilities_macros.$progress_notification_count$.bind((SubLObject)removal_modules_genlpreds_lookup.ZERO_INTEGER, thread);
                        utilities_macros.$progress_pacifications_since_last_nl$.bind((SubLObject)removal_modules_genlpreds_lookup.ZERO_INTEGER, thread);
                        utilities_macros.$progress_count$.bind((SubLObject)removal_modules_genlpreds_lookup.ZERO_INTEGER, thread);
                        utilities_macros.$is_noting_progressP$.bind((SubLObject)removal_modules_genlpreds_lookup.T, thread);
                        utilities_macros.$silent_progressP$.bind((SubLObject)((removal_modules_genlpreds_lookup.NIL != str) ? utilities_macros.$silent_progressP$.getDynamicValue(thread) : removal_modules_genlpreds_lookup.T), thread);
                        utilities_macros.noting_progress_preamble(str);
                        final SubLObject iterator_var2 = kb_mapping_macros.new_predicate_extent_final_index_spec_iterator(pred_var2);
                        SubLObject done_var2 = (SubLObject)removal_modules_genlpreds_lookup.NIL;
                        final SubLObject token_var2 = (SubLObject)removal_modules_genlpreds_lookup.NIL;
                        while (removal_modules_genlpreds_lookup.NIL == done_var2) {
                            final SubLObject final_index_spec2 = iteration.iteration_next_without_values_macro_helper(iterator_var2, token_var2);
                            final SubLObject valid2 = (SubLObject)SubLObjectFactory.makeBoolean(!token_var2.eql(final_index_spec2));
                            if (removal_modules_genlpreds_lookup.NIL != valid2) {
                                utilities_macros.note_progress();
                                SubLObject final_index_iterator2 = (SubLObject)removal_modules_genlpreds_lookup.NIL;
                                try {
                                    final_index_iterator2 = kb_mapping_macros.new_final_index_iterator(final_index_spec2, (SubLObject)removal_modules_genlpreds_lookup.$kw9$GAF, enumeration_types.sense_truth(sense), (SubLObject)removal_modules_genlpreds_lookup.NIL);
                                    SubLObject done_var_$5 = (SubLObject)removal_modules_genlpreds_lookup.NIL;
                                    final SubLObject token_var_$6 = (SubLObject)removal_modules_genlpreds_lookup.NIL;
                                    while (removal_modules_genlpreds_lookup.NIL == done_var_$5) {
                                        final SubLObject gaf2 = iteration.iteration_next_without_values_macro_helper(final_index_iterator2, token_var_$6);
                                        final SubLObject valid_$7 = (SubLObject)SubLObjectFactory.makeBoolean(!token_var_$6.eql(gaf2));
                                        if (removal_modules_genlpreds_lookup.NIL != valid_$7) {
                                            final SubLObject var2;
                                            final SubLObject bindings_assertion2 = var2 = removal_genlpreds_gaf_iterator_internal(gaf2);
                                            if (removal_modules_genlpreds_lookup.NIL != var2) {
                                                result = (SubLObject)ConsesLow.cons(var2, result);
                                            }
                                        }
                                        done_var_$5 = (SubLObject)SubLObjectFactory.makeBoolean(removal_modules_genlpreds_lookup.NIL == valid_$7);
                                    }
                                }
                                finally {
                                    final SubLObject _prev_bind_0_$9 = Threads.$is_thread_performing_cleanupP$.currentBinding(thread);
                                    try {
                                        Threads.$is_thread_performing_cleanupP$.bind((SubLObject)removal_modules_genlpreds_lookup.T, thread);
                                        final SubLObject _values5 = Values.getValuesAsVector();
                                        if (removal_modules_genlpreds_lookup.NIL != final_index_iterator2) {
                                            kb_mapping_macros.destroy_final_index_iterator(final_index_iterator2);
                                        }
                                        Values.restoreValuesFromVector(_values5);
                                    }
                                    finally {
                                        Threads.$is_thread_performing_cleanupP$.rebind(_prev_bind_0_$9, thread);
                                    }
                                }
                            }
                            done_var2 = (SubLObject)SubLObjectFactory.makeBoolean(removal_modules_genlpreds_lookup.NIL == valid2);
                        }
                        utilities_macros.noting_progress_postamble();
                    }
                    finally {
                        utilities_macros.$silent_progressP$.rebind(_prev_bind_8, thread);
                        utilities_macros.$is_noting_progressP$.rebind(_prev_bind_7, thread);
                        utilities_macros.$progress_count$.rebind(_prev_bind_6, thread);
                        utilities_macros.$progress_pacifications_since_last_nl$.rebind(_prev_bind_5, thread);
                        utilities_macros.$progress_notification_count$.rebind(_prev_bind_4, thread);
                        utilities_macros.$progress_elapsed_seconds_for_notification$.rebind(_prev_bind_2_$19, thread);
                        utilities_macros.$progress_last_pacification_time$.rebind(_prev_bind_1_$18, thread);
                        utilities_macros.$progress_start_time$.rebind(_prev_bind_0_$8, thread);
                    }
                }
            }
            else if (pcase_var.eql((SubLObject)removal_modules_genlpreds_lookup.$kw11$OVERLAP)) {
                SubLObject cdolist_list_var = virtual_indexing.gather_overlap_index(kb_mapping_macros.do_gli_vo_extract_key(l_index), (SubLObject)removal_modules_genlpreds_lookup.UNPROVIDED);
                SubLObject gaf3 = (SubLObject)removal_modules_genlpreds_lookup.NIL;
                gaf3 = cdolist_list_var.first();
                while (removal_modules_genlpreds_lookup.NIL != cdolist_list_var) {
                    if (removal_modules_genlpreds_lookup.NIL == enumeration_types.sense_truth(sense) || removal_modules_genlpreds_lookup.NIL != assertions_high.assertion_has_truth(gaf3, enumeration_types.sense_truth(sense))) {
                        final SubLObject var3;
                        final SubLObject bindings_assertion3 = var3 = removal_genlpreds_gaf_iterator_internal(gaf3);
                        if (removal_modules_genlpreds_lookup.NIL != var3) {
                            result = (SubLObject)ConsesLow.cons(var3, result);
                        }
                    }
                    cdolist_list_var = cdolist_list_var.rest();
                    gaf3 = cdolist_list_var.first();
                }
            }
            else {
                kb_mapping_macros.do_gli_method_error(l_index, method);
            }
        }
        finally {
            control_vars.$inference_sense$.rebind(_prev_bind_3, thread);
            control_vars.$inference_literal$.rebind(_prev_bind_2, thread);
            pred_relevance_macros.$relevant_pred_function$.rebind(_prev_bind_0, thread);
        }
        if (removal_modules_genlpreds_lookup.NIL != result) {
            return iteration.new_list_iterator(result);
        }
        return (SubLObject)removal_modules_genlpreds_lookup.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/modules/removal/removal-modules-genlpreds-lookup.lisp", position = 4841L)
    public static SubLObject obfuscate_predicate(final SubLObject asent) {
        return el_utilities.replace_formula_arg((SubLObject)removal_modules_genlpreds_lookup.ZERO_INTEGER, removal_modules_genlpreds_lookup.$unknown_hl_variable$.getGlobalValue(), asent);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/modules/removal/removal-modules-genlpreds-lookup.lisp", position = 5065L)
    public static SubLObject best_genlpreds_gaf_lookup_index(final SubLObject asent, final SubLObject sense) {
        return kb_indexing.best_gaf_lookup_index(obfuscate_predicate(asent), enumeration_types.sense_truth(sense), (SubLObject)removal_modules_genlpreds_lookup.$list13);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/modules/removal/removal-modules-genlpreds-lookup.lisp", position = 5296L)
    public static SubLObject num_best_genlpreds_gaf_lookup_index(final SubLObject asent, final SubLObject sense) {
        return num_best_genlpreds_or_inverse_gaf_lookup_index(asent, sense, (SubLObject)removal_modules_genlpreds_lookup.NIL);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/modules/removal/removal-modules-genlpreds-lookup.lisp", position = 5437L)
    public static SubLObject num_best_genlpreds_or_inverse_gaf_lookup_index(final SubLObject asent, final SubLObject sense, final SubLObject inverse_modeP) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject direction = (sense == removal_modules_genlpreds_lookup.$kw0$POS) ? sbhl_search_vars.get_sbhl_backward_search_direction() : sbhl_search_vars.get_sbhl_forward_search_direction();
        final SubLObject pred = cycl_utilities.sentence_arg0(asent);
        final SubLObject binary_predicate_modeP = kb_accessors.binary_predicateP(cycl_utilities.sentence_arg0(asent));
        final SubLObject gaf_argnum = tva_inference.determine_term_argnums(asent).first();
        final SubLObject v_term = cycl_utilities.sentence_arg(asent, gaf_argnum, (SubLObject)removal_modules_genlpreds_lookup.UNPROVIDED);
        SubLObject num = (SubLObject)removal_modules_genlpreds_lookup.ZERO_INTEGER;
        final SubLObject module = sbhl_module_vars.get_sbhl_module(removal_modules_genlpreds_lookup.$const14$genlPreds);
        final SubLObject node_var = pred;
        final SubLObject deck_type = (SubLObject)removal_modules_genlpreds_lookup.$kw17$QUEUE;
        final SubLObject recur_deck = deck.create_deck(deck_type);
        SubLObject node_and_predicate_mode = (SubLObject)removal_modules_genlpreds_lookup.NIL;
        final SubLObject _prev_bind_0 = sbhl_marking_vars.$sbhl_space$.currentBinding(thread);
        try {
            sbhl_marking_vars.$sbhl_space$.bind(sbhl_marking_vars.get_sbhl_marking_space(), thread);
            try {
                final SubLObject tv_var = (SubLObject)removal_modules_genlpreds_lookup.NIL;
                final SubLObject _prev_bind_0_$24 = sbhl_search_vars.$sbhl_tv$.currentBinding(thread);
                final SubLObject _prev_bind_2 = sbhl_search_vars.$relevant_sbhl_tv_function$.currentBinding(thread);
                try {
                    sbhl_search_vars.$sbhl_tv$.bind((removal_modules_genlpreds_lookup.NIL != tv_var) ? tv_var : sbhl_search_vars.get_sbhl_true_tv(), thread);
                    sbhl_search_vars.$relevant_sbhl_tv_function$.bind((SubLObject)((removal_modules_genlpreds_lookup.NIL != tv_var) ? removal_modules_genlpreds_lookup.$sym18$RELEVANT_SBHL_TV_IS_GENERAL_TV : sbhl_search_vars.$relevant_sbhl_tv_function$.getDynamicValue(thread)), thread);
                    if (removal_modules_genlpreds_lookup.NIL != tv_var && removal_modules_genlpreds_lookup.NIL != sbhl_paranoia.sbhl_object_type_checking_p() && removal_modules_genlpreds_lookup.NIL == sbhl_search_vars.sbhl_true_tv_p(tv_var)) {
                        final SubLObject pcase_var = sbhl_paranoia.$sbhl_type_error_action$.getDynamicValue(thread);
                        if (pcase_var.eql((SubLObject)removal_modules_genlpreds_lookup.$kw19$ERROR)) {
                            sbhl_paranoia.sbhl_error((SubLObject)removal_modules_genlpreds_lookup.ONE_INTEGER, (SubLObject)removal_modules_genlpreds_lookup.$str20$_A_is_not_a__A, tv_var, (SubLObject)removal_modules_genlpreds_lookup.$sym21$SBHL_TRUE_TV_P, (SubLObject)removal_modules_genlpreds_lookup.UNPROVIDED, (SubLObject)removal_modules_genlpreds_lookup.UNPROVIDED, (SubLObject)removal_modules_genlpreds_lookup.UNPROVIDED);
                        }
                        else if (pcase_var.eql((SubLObject)removal_modules_genlpreds_lookup.$kw22$CERROR)) {
                            sbhl_paranoia.sbhl_cerror((SubLObject)removal_modules_genlpreds_lookup.ONE_INTEGER, (SubLObject)removal_modules_genlpreds_lookup.$str23$continue_anyway, (SubLObject)removal_modules_genlpreds_lookup.$str20$_A_is_not_a__A, tv_var, (SubLObject)removal_modules_genlpreds_lookup.$sym21$SBHL_TRUE_TV_P, (SubLObject)removal_modules_genlpreds_lookup.UNPROVIDED, (SubLObject)removal_modules_genlpreds_lookup.UNPROVIDED, (SubLObject)removal_modules_genlpreds_lookup.UNPROVIDED);
                        }
                        else if (pcase_var.eql((SubLObject)removal_modules_genlpreds_lookup.$kw24$WARN)) {
                            Errors.warn((SubLObject)removal_modules_genlpreds_lookup.$str20$_A_is_not_a__A, tv_var, (SubLObject)removal_modules_genlpreds_lookup.$sym21$SBHL_TRUE_TV_P);
                        }
                        else {
                            Errors.warn((SubLObject)removal_modules_genlpreds_lookup.$str25$_A_is_not_a_valid__sbhl_type_erro, sbhl_paranoia.$sbhl_type_error_action$.getDynamicValue(thread));
                            Errors.cerror((SubLObject)removal_modules_genlpreds_lookup.$str23$continue_anyway, (SubLObject)removal_modules_genlpreds_lookup.$str20$_A_is_not_a__A, tv_var, (SubLObject)removal_modules_genlpreds_lookup.$sym21$SBHL_TRUE_TV_P);
                        }
                    }
                    final SubLObject _prev_bind_0_$25 = sbhl_search_vars.$sbhl_search_module$.currentBinding(thread);
                    final SubLObject _prev_bind_1_$26 = sbhl_search_vars.$sbhl_search_module_type$.currentBinding(thread);
                    final SubLObject _prev_bind_3 = sbhl_search_vars.$sbhl_add_node_to_result_test$.currentBinding(thread);
                    final SubLObject _prev_bind_4 = sbhl_search_vars.$genl_inverse_mode_p$.currentBinding(thread);
                    final SubLObject _prev_bind_5 = sbhl_module_vars.$sbhl_module$.currentBinding(thread);
                    try {
                        sbhl_search_vars.$sbhl_search_module$.bind(module, thread);
                        sbhl_search_vars.$sbhl_search_module_type$.bind(sbhl_module_utilities.get_sbhl_module_type(module), thread);
                        sbhl_search_vars.$sbhl_add_node_to_result_test$.bind(sbhl_module_utilities.get_sbhl_add_node_to_result_test(module), thread);
                        sbhl_search_vars.$genl_inverse_mode_p$.bind((SubLObject)removal_modules_genlpreds_lookup.NIL, thread);
                        sbhl_module_vars.$sbhl_module$.bind(module, thread);
                        if (removal_modules_genlpreds_lookup.NIL != sbhl_paranoia.suspend_sbhl_type_checkingP() || removal_modules_genlpreds_lookup.NIL != sbhl_module_utilities.apply_sbhl_module_type_test(pred, sbhl_module_vars.get_sbhl_module((SubLObject)removal_modules_genlpreds_lookup.UNPROVIDED))) {
                            final SubLObject _prev_bind_0_$26 = sbhl_search_vars.$sbhl_search_direction$.currentBinding(thread);
                            final SubLObject _prev_bind_1_$27 = sbhl_link_vars.$sbhl_link_direction$.currentBinding(thread);
                            final SubLObject _prev_bind_2_$29 = sbhl_search_vars.$genl_inverse_mode_p$.currentBinding(thread);
                            try {
                                sbhl_search_vars.$sbhl_search_direction$.bind(direction, thread);
                                sbhl_link_vars.$sbhl_link_direction$.bind(sbhl_module_utilities.sbhl_search_direction_to_link_direction(direction, module), thread);
                                sbhl_search_vars.$genl_inverse_mode_p$.bind((SubLObject)removal_modules_genlpreds_lookup.NIL, thread);
                                sbhl_marking_utilities.sbhl_mark_node_marked(node_var, (SubLObject)removal_modules_genlpreds_lookup.UNPROVIDED);
                                for (node_and_predicate_mode = (SubLObject)ConsesLow.list(pred, sbhl_search_vars.genl_inverse_mode_p()); removal_modules_genlpreds_lookup.NIL != node_and_predicate_mode; node_and_predicate_mode = deck.deck_pop(recur_deck)) {
                                    final SubLObject node_var_$30 = node_and_predicate_mode.first();
                                    final SubLObject predicate_mode = conses_high.second(node_and_predicate_mode);
                                    final SubLObject spec_pred = node_var_$30;
                                    final SubLObject _prev_bind_0_$27 = sbhl_search_vars.$genl_inverse_mode_p$.currentBinding(thread);
                                    try {
                                        sbhl_search_vars.$genl_inverse_mode_p$.bind(predicate_mode, thread);
                                        final SubLObject inverseP = predicate_mode;
                                        if (!pred.eql(spec_pred) && inverse_modeP.eql(inverseP)) {
                                            final SubLObject spec_asent = el_utilities.replace_formula_arg((SubLObject)removal_modules_genlpreds_lookup.ZERO_INTEGER, spec_pred, asent);
                                            num = Numbers.add(num, kb_indexing.num_best_gaf_lookup_index(spec_asent, enumeration_types.sense_truth(sense), (SubLObject)removal_modules_genlpreds_lookup.UNPROVIDED));
                                        }
                                        SubLObject cdolist_list_var;
                                        final SubLObject accessible_modules = cdolist_list_var = sbhl_macros.get_sbhl_accessible_modules(module);
                                        SubLObject module_var = (SubLObject)removal_modules_genlpreds_lookup.NIL;
                                        module_var = cdolist_list_var.first();
                                        while (removal_modules_genlpreds_lookup.NIL != cdolist_list_var) {
                                            final SubLObject _prev_bind_0_$28 = sbhl_module_vars.$sbhl_module$.currentBinding(thread);
                                            final SubLObject _prev_bind_1_$28 = sbhl_search_vars.$genl_inverse_mode_p$.currentBinding(thread);
                                            try {
                                                sbhl_module_vars.$sbhl_module$.bind(module_var, thread);
                                                sbhl_search_vars.$genl_inverse_mode_p$.bind((SubLObject)((removal_modules_genlpreds_lookup.NIL != sbhl_search_vars.flip_genl_inverse_modeP((SubLObject)removal_modules_genlpreds_lookup.UNPROVIDED, (SubLObject)removal_modules_genlpreds_lookup.UNPROVIDED)) ? SubLObjectFactory.makeBoolean(removal_modules_genlpreds_lookup.NIL == sbhl_search_vars.$genl_inverse_mode_p$.getDynamicValue(thread)) : sbhl_search_vars.$genl_inverse_mode_p$.getDynamicValue(thread)), thread);
                                                final SubLObject node = function_terms.naut_to_nart(node_var_$30);
                                                if (removal_modules_genlpreds_lookup.NIL != sbhl_link_vars.sbhl_node_object_p(node)) {
                                                    final SubLObject d_link = sbhl_graphs.get_sbhl_graph_link(node, sbhl_module_vars.get_sbhl_module((SubLObject)removal_modules_genlpreds_lookup.UNPROVIDED));
                                                    if (removal_modules_genlpreds_lookup.NIL != d_link) {
                                                        final SubLObject mt_links = sbhl_links.get_sbhl_mt_links(d_link, sbhl_link_vars.get_sbhl_link_direction(), sbhl_module_vars.get_sbhl_module((SubLObject)removal_modules_genlpreds_lookup.UNPROVIDED));
                                                        if (removal_modules_genlpreds_lookup.NIL != mt_links) {
                                                            SubLObject iteration_state;
                                                            for (iteration_state = dictionary_contents.do_dictionary_contents_state(dictionary.dictionary_contents(mt_links)); removal_modules_genlpreds_lookup.NIL == dictionary_contents.do_dictionary_contents_doneP(iteration_state); iteration_state = dictionary_contents.do_dictionary_contents_next(iteration_state)) {
                                                                thread.resetMultipleValues();
                                                                final SubLObject mt = dictionary_contents.do_dictionary_contents_key_value(iteration_state);
                                                                final SubLObject tv_links = thread.secondMultipleValue();
                                                                thread.resetMultipleValues();
                                                                if (removal_modules_genlpreds_lookup.NIL != mt_relevance_macros.relevant_mtP(mt)) {
                                                                    final SubLObject _prev_bind_0_$29 = sbhl_link_vars.$sbhl_link_mt$.currentBinding(thread);
                                                                    try {
                                                                        sbhl_link_vars.$sbhl_link_mt$.bind(mt, thread);
                                                                        SubLObject iteration_state_$35;
                                                                        for (iteration_state_$35 = dictionary_contents.do_dictionary_contents_state(dictionary.dictionary_contents(tv_links)); removal_modules_genlpreds_lookup.NIL == dictionary_contents.do_dictionary_contents_doneP(iteration_state_$35); iteration_state_$35 = dictionary_contents.do_dictionary_contents_next(iteration_state_$35)) {
                                                                            thread.resetMultipleValues();
                                                                            final SubLObject tv = dictionary_contents.do_dictionary_contents_key_value(iteration_state_$35);
                                                                            final SubLObject link_nodes = thread.secondMultipleValue();
                                                                            thread.resetMultipleValues();
                                                                            if (removal_modules_genlpreds_lookup.NIL != sbhl_search_vars.relevant_sbhl_tvP(tv)) {
                                                                                final SubLObject _prev_bind_0_$30 = sbhl_link_vars.$sbhl_link_tv$.currentBinding(thread);
                                                                                try {
                                                                                    sbhl_link_vars.$sbhl_link_tv$.bind(tv, thread);
                                                                                    final SubLObject sol = link_nodes;
                                                                                    if (removal_modules_genlpreds_lookup.NIL != set.set_p(sol)) {
                                                                                        final SubLObject set_contents_var = set.do_set_internal(sol);
                                                                                        SubLObject basis_object;
                                                                                        SubLObject state;
                                                                                        SubLObject node_vars_link_node;
                                                                                        for (basis_object = set_contents.do_set_contents_basis_object(set_contents_var), state = (SubLObject)removal_modules_genlpreds_lookup.NIL, state = set_contents.do_set_contents_initial_state(basis_object, set_contents_var); removal_modules_genlpreds_lookup.NIL == set_contents.do_set_contents_doneP(basis_object, state); state = set_contents.do_set_contents_update_state(state)) {
                                                                                            node_vars_link_node = set_contents.do_set_contents_next(basis_object, state);
                                                                                            if (removal_modules_genlpreds_lookup.NIL != set_contents.do_set_contents_element_validP(state, node_vars_link_node) && removal_modules_genlpreds_lookup.NIL == sbhl_marking_utilities.sbhl_search_path_termination_p(node_vars_link_node, (SubLObject)removal_modules_genlpreds_lookup.UNPROVIDED)) {
                                                                                                sbhl_marking_utilities.sbhl_mark_node_marked(node_vars_link_node, (SubLObject)removal_modules_genlpreds_lookup.UNPROVIDED);
                                                                                                deck.deck_push((SubLObject)ConsesLow.list(node_vars_link_node, sbhl_search_vars.genl_inverse_mode_p()), recur_deck);
                                                                                            }
                                                                                        }
                                                                                    }
                                                                                    else if (sol.isList()) {
                                                                                        SubLObject csome_list_var = sol;
                                                                                        SubLObject node_vars_link_node2 = (SubLObject)removal_modules_genlpreds_lookup.NIL;
                                                                                        node_vars_link_node2 = csome_list_var.first();
                                                                                        while (removal_modules_genlpreds_lookup.NIL != csome_list_var) {
                                                                                            if (removal_modules_genlpreds_lookup.NIL == sbhl_marking_utilities.sbhl_search_path_termination_p(node_vars_link_node2, (SubLObject)removal_modules_genlpreds_lookup.UNPROVIDED)) {
                                                                                                sbhl_marking_utilities.sbhl_mark_node_marked(node_vars_link_node2, (SubLObject)removal_modules_genlpreds_lookup.UNPROVIDED);
                                                                                                deck.deck_push((SubLObject)ConsesLow.list(node_vars_link_node2, sbhl_search_vars.genl_inverse_mode_p()), recur_deck);
                                                                                            }
                                                                                            csome_list_var = csome_list_var.rest();
                                                                                            node_vars_link_node2 = csome_list_var.first();
                                                                                        }
                                                                                    }
                                                                                    else {
                                                                                        Errors.error((SubLObject)removal_modules_genlpreds_lookup.$str26$_A_is_neither_SET_P_nor_LISTP_, sol);
                                                                                    }
                                                                                }
                                                                                finally {
                                                                                    sbhl_link_vars.$sbhl_link_tv$.rebind(_prev_bind_0_$30, thread);
                                                                                }
                                                                            }
                                                                        }
                                                                        dictionary_contents.do_dictionary_contents_finalize(iteration_state_$35);
                                                                    }
                                                                    finally {
                                                                        sbhl_link_vars.$sbhl_link_mt$.rebind(_prev_bind_0_$29, thread);
                                                                    }
                                                                }
                                                            }
                                                            dictionary_contents.do_dictionary_contents_finalize(iteration_state);
                                                        }
                                                    }
                                                    else {
                                                        sbhl_paranoia.sbhl_error((SubLObject)removal_modules_genlpreds_lookup.FIVE_INTEGER, (SubLObject)removal_modules_genlpreds_lookup.$str27$attempting_to_bind_direction_link, (SubLObject)removal_modules_genlpreds_lookup.UNPROVIDED, (SubLObject)removal_modules_genlpreds_lookup.UNPROVIDED, (SubLObject)removal_modules_genlpreds_lookup.UNPROVIDED, (SubLObject)removal_modules_genlpreds_lookup.UNPROVIDED, (SubLObject)removal_modules_genlpreds_lookup.UNPROVIDED);
                                                    }
                                                }
                                                else if (removal_modules_genlpreds_lookup.NIL != obsolete.cnat_p(node, (SubLObject)removal_modules_genlpreds_lookup.UNPROVIDED)) {
                                                    SubLObject cdolist_list_var_$37;
                                                    final SubLObject new_list = cdolist_list_var_$37 = ((removal_modules_genlpreds_lookup.NIL != sbhl_link_vars.sbhl_randomize_lists_p()) ? list_utilities.randomize_list(sbhl_module_utilities.get_sbhl_module_relevant_naut_link_generators(sbhl_link_vars.get_sbhl_link_direction(), sbhl_search_vars.$sbhl_tv$.getDynamicValue(thread), sbhl_module_vars.get_sbhl_module((SubLObject)removal_modules_genlpreds_lookup.UNPROVIDED))) : sbhl_module_utilities.get_sbhl_module_relevant_naut_link_generators(sbhl_link_vars.get_sbhl_link_direction(), sbhl_search_vars.$sbhl_tv$.getDynamicValue(thread), sbhl_module_vars.get_sbhl_module((SubLObject)removal_modules_genlpreds_lookup.UNPROVIDED)));
                                                    SubLObject generating_fn = (SubLObject)removal_modules_genlpreds_lookup.NIL;
                                                    generating_fn = cdolist_list_var_$37.first();
                                                    while (removal_modules_genlpreds_lookup.NIL != cdolist_list_var_$37) {
                                                        final SubLObject _prev_bind_0_$31 = sbhl_link_vars.$sbhl_link_generator$.currentBinding(thread);
                                                        try {
                                                            sbhl_link_vars.$sbhl_link_generator$.bind(generating_fn, thread);
                                                            final SubLObject sol2;
                                                            final SubLObject link_nodes2 = sol2 = Functions.funcall(generating_fn, node);
                                                            if (removal_modules_genlpreds_lookup.NIL != set.set_p(sol2)) {
                                                                final SubLObject set_contents_var2 = set.do_set_internal(sol2);
                                                                SubLObject basis_object2;
                                                                SubLObject state2;
                                                                SubLObject node_vars_link_node3;
                                                                for (basis_object2 = set_contents.do_set_contents_basis_object(set_contents_var2), state2 = (SubLObject)removal_modules_genlpreds_lookup.NIL, state2 = set_contents.do_set_contents_initial_state(basis_object2, set_contents_var2); removal_modules_genlpreds_lookup.NIL == set_contents.do_set_contents_doneP(basis_object2, state2); state2 = set_contents.do_set_contents_update_state(state2)) {
                                                                    node_vars_link_node3 = set_contents.do_set_contents_next(basis_object2, state2);
                                                                    if (removal_modules_genlpreds_lookup.NIL != set_contents.do_set_contents_element_validP(state2, node_vars_link_node3) && removal_modules_genlpreds_lookup.NIL == sbhl_marking_utilities.sbhl_search_path_termination_p(node_vars_link_node3, (SubLObject)removal_modules_genlpreds_lookup.UNPROVIDED)) {
                                                                        sbhl_marking_utilities.sbhl_mark_node_marked(node_vars_link_node3, (SubLObject)removal_modules_genlpreds_lookup.UNPROVIDED);
                                                                        deck.deck_push((SubLObject)ConsesLow.list(node_vars_link_node3, sbhl_search_vars.genl_inverse_mode_p()), recur_deck);
                                                                    }
                                                                }
                                                            }
                                                            else if (sol2.isList()) {
                                                                SubLObject csome_list_var2 = sol2;
                                                                SubLObject node_vars_link_node4 = (SubLObject)removal_modules_genlpreds_lookup.NIL;
                                                                node_vars_link_node4 = csome_list_var2.first();
                                                                while (removal_modules_genlpreds_lookup.NIL != csome_list_var2) {
                                                                    if (removal_modules_genlpreds_lookup.NIL == sbhl_marking_utilities.sbhl_search_path_termination_p(node_vars_link_node4, (SubLObject)removal_modules_genlpreds_lookup.UNPROVIDED)) {
                                                                        sbhl_marking_utilities.sbhl_mark_node_marked(node_vars_link_node4, (SubLObject)removal_modules_genlpreds_lookup.UNPROVIDED);
                                                                        deck.deck_push((SubLObject)ConsesLow.list(node_vars_link_node4, sbhl_search_vars.genl_inverse_mode_p()), recur_deck);
                                                                    }
                                                                    csome_list_var2 = csome_list_var2.rest();
                                                                    node_vars_link_node4 = csome_list_var2.first();
                                                                }
                                                            }
                                                            else {
                                                                Errors.error((SubLObject)removal_modules_genlpreds_lookup.$str26$_A_is_neither_SET_P_nor_LISTP_, sol2);
                                                            }
                                                        }
                                                        finally {
                                                            sbhl_link_vars.$sbhl_link_generator$.rebind(_prev_bind_0_$31, thread);
                                                        }
                                                        cdolist_list_var_$37 = cdolist_list_var_$37.rest();
                                                        generating_fn = cdolist_list_var_$37.first();
                                                    }
                                                }
                                            }
                                            finally {
                                                sbhl_search_vars.$genl_inverse_mode_p$.rebind(_prev_bind_1_$28, thread);
                                                sbhl_module_vars.$sbhl_module$.rebind(_prev_bind_0_$28, thread);
                                            }
                                            cdolist_list_var = cdolist_list_var.rest();
                                            module_var = cdolist_list_var.first();
                                        }
                                    }
                                    finally {
                                        sbhl_search_vars.$genl_inverse_mode_p$.rebind(_prev_bind_0_$27, thread);
                                    }
                                }
                            }
                            finally {
                                sbhl_search_vars.$genl_inverse_mode_p$.rebind(_prev_bind_2_$29, thread);
                                sbhl_link_vars.$sbhl_link_direction$.rebind(_prev_bind_1_$27, thread);
                                sbhl_search_vars.$sbhl_search_direction$.rebind(_prev_bind_0_$26, thread);
                            }
                        }
                        else {
                            sbhl_paranoia.sbhl_warn((SubLObject)removal_modules_genlpreds_lookup.TWO_INTEGER, (SubLObject)removal_modules_genlpreds_lookup.$str28$Node__a_does_not_pass_sbhl_type_t, pred, sbhl_module_utilities.get_sbhl_type_test(sbhl_module_vars.get_sbhl_module((SubLObject)removal_modules_genlpreds_lookup.UNPROVIDED)), (SubLObject)removal_modules_genlpreds_lookup.UNPROVIDED, (SubLObject)removal_modules_genlpreds_lookup.UNPROVIDED, (SubLObject)removal_modules_genlpreds_lookup.UNPROVIDED);
                        }
                    }
                    finally {
                        sbhl_module_vars.$sbhl_module$.rebind(_prev_bind_5, thread);
                        sbhl_search_vars.$genl_inverse_mode_p$.rebind(_prev_bind_4, thread);
                        sbhl_search_vars.$sbhl_add_node_to_result_test$.rebind(_prev_bind_3, thread);
                        sbhl_search_vars.$sbhl_search_module_type$.rebind(_prev_bind_1_$26, thread);
                        sbhl_search_vars.$sbhl_search_module$.rebind(_prev_bind_0_$25, thread);
                    }
                }
                finally {
                    sbhl_search_vars.$relevant_sbhl_tv_function$.rebind(_prev_bind_2, thread);
                    sbhl_search_vars.$sbhl_tv$.rebind(_prev_bind_0_$24, thread);
                }
            }
            finally {
                final SubLObject _prev_bind_0_$32 = Threads.$is_thread_performing_cleanupP$.currentBinding(thread);
                try {
                    Threads.$is_thread_performing_cleanupP$.bind((SubLObject)removal_modules_genlpreds_lookup.T, thread);
                    final SubLObject _values = Values.getValuesAsVector();
                    sbhl_marking_vars.free_sbhl_marking_space(sbhl_marking_vars.$sbhl_space$.getDynamicValue(thread));
                    Values.restoreValuesFromVector(_values);
                }
                finally {
                    Threads.$is_thread_performing_cleanupP$.rebind(_prev_bind_0_$32, thread);
                }
            }
        }
        finally {
            sbhl_marking_vars.$sbhl_space$.rebind(_prev_bind_0, thread);
        }
        return num;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/modules/removal/removal-modules-genlpreds-lookup.lisp", position = 6246L)
    public static SubLObject removal_genlpreds_gaf_iterator_internal(final SubLObject assertion) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        if (removal_modules_genlpreds_lookup.NIL != backward_utilities.direction_is_relevant(assertion)) {
            final SubLObject assertion_asent = assertions_high.gaf_formula(assertion);
            final SubLObject ass_pred = cycl_utilities.atomic_sentence_predicate(assertion_asent);
            final SubLObject inf_pred = cycl_utilities.atomic_sentence_predicate(control_vars.$inference_literal$.getDynamicValue(thread));
            if (!ass_pred.eql(inf_pred)) {
                thread.resetMultipleValues();
                final SubLObject v_bindings = unification_utilities.gaf_asent_args_unify(control_vars.$inference_literal$.getDynamicValue(thread), assertion_asent, (SubLObject)removal_modules_genlpreds_lookup.UNPROVIDED, (SubLObject)removal_modules_genlpreds_lookup.UNPROVIDED);
                final SubLObject gaf_asent = thread.secondMultipleValue();
                final SubLObject unify_justification = thread.thirdMultipleValue();
                thread.resetMultipleValues();
                if (removal_modules_genlpreds_lookup.NIL != v_bindings) {
                    return (SubLObject)ConsesLow.list(v_bindings, assertion);
                }
            }
        }
        return (SubLObject)removal_modules_genlpreds_lookup.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/modules/removal/removal-modules-genlpreds-lookup.lisp", position = 6897L)
    public static SubLObject removal_genlpreds_lookup_supports(final SubLObject asent, final SubLObject assertion, final SubLObject sense) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject ass_pred = cycl_utilities.atomic_sentence_predicate(assertions_high.gaf_formula(assertion));
        final SubLObject inf_pred = cycl_utilities.atomic_sentence_predicate(asent);
        final SubLObject spec_pred = (removal_modules_genlpreds_lookup.$kw0$POS == sense) ? ass_pred : inf_pred;
        final SubLObject genl_pred = (removal_modules_genlpreds_lookup.$kw0$POS == sense) ? inf_pred : ass_pred;
        final SubLObject hl_support = removal_module_utilities.make_genl_preds_support(spec_pred, genl_pred);
        thread.resetMultipleValues();
        final SubLObject v_bindings = unification_utilities.gaf_asent_args_unify(asent, assertions_high.gaf_formula(assertion), (SubLObject)removal_modules_genlpreds_lookup.T, (SubLObject)removal_modules_genlpreds_lookup.T);
        final SubLObject gaf_asent = thread.secondMultipleValue();
        final SubLObject unify_justification = thread.thirdMultipleValue();
        thread.resetMultipleValues();
        return ConsesLow.append((SubLObject)ConsesLow.list(assertion, hl_support), unify_justification);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/modules/removal/removal-modules-genlpreds-lookup.lisp", position = 7498L)
    public static SubLObject removal_genlpreds_pred_index_pos_cost(final SubLObject asent, SubLObject sense) {
        if (sense == removal_modules_genlpreds_lookup.UNPROVIDED) {
            sense = (SubLObject)removal_modules_genlpreds_lookup.NIL;
        }
        if (removal_modules_genlpreds_lookup.NIL != variables.fully_bound_p(asent)) {
            return control_vars.$typical_hl_module_check_cost$.getGlobalValue();
        }
        return num_best_genlpreds_gaf_lookup_index(asent, (SubLObject)removal_modules_genlpreds_lookup.$kw0$POS);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/modules/removal/removal-modules-genlpreds-lookup.lisp", position = 8216L)
    public static SubLObject removal_genlpreds_pred_index_pos_iterator(final SubLObject asent) {
        return removal_genlpreds_pred_index_iterator(asent, (SubLObject)removal_modules_genlpreds_lookup.$kw0$POS);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/modules/removal/removal-modules-genlpreds-lookup.lisp", position = 9391L)
    public static SubLObject removal_genlpreds_pred_index_neg_completeness(final SubLObject asent) {
        if (removal_modules_genlpreds_lookup.NIL != removal_module_utilities.negation_grossly_incompleteP(asent, (SubLObject)removal_modules_genlpreds_lookup.$kw3$NEG)) {
            return (SubLObject)removal_modules_genlpreds_lookup.$kw4$GROSSLY_INCOMPLETE;
        }
        return (SubLObject)removal_modules_genlpreds_lookup.$kw5$INCOMPLETE;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/modules/removal/removal-modules-genlpreds-lookup.lisp", position = 9571L)
    public static SubLObject removal_genlpreds_pred_index_neg_cost(final SubLObject asent, SubLObject sense) {
        if (sense == removal_modules_genlpreds_lookup.UNPROVIDED) {
            sense = (SubLObject)removal_modules_genlpreds_lookup.NIL;
        }
        final SubLObject predicate = cycl_utilities.atomic_sentence_predicate(asent);
        final SubLObject genl_preds = inference_trampolines.inference_all_genl_predicates(predicate);
        SubLObject cost = (SubLObject)removal_modules_genlpreds_lookup.ZERO_INTEGER;
        SubLObject cdolist_list_var = genl_preds;
        SubLObject genl_pred = (SubLObject)removal_modules_genlpreds_lookup.NIL;
        genl_pred = cdolist_list_var.first();
        while (removal_modules_genlpreds_lookup.NIL != cdolist_list_var) {
            cost = Numbers.add(cost, kb_indexing.num_predicate_extent_index(genl_pred, (SubLObject)removal_modules_genlpreds_lookup.UNPROVIDED));
            cdolist_list_var = cdolist_list_var.rest();
            genl_pred = cdolist_list_var.first();
        }
        return cost;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/modules/removal/removal-modules-genlpreds-lookup.lisp", position = 9902L)
    public static SubLObject removal_genlpreds_pred_index_neg_iterator(final SubLObject asent) {
        return removal_genlpreds_pred_index_iterator(asent, (SubLObject)removal_modules_genlpreds_lookup.$kw3$NEG);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/modules/removal/removal-modules-genlpreds-lookup.lisp", position = 11157L)
    public static SubLObject removal_genlpreds_pred_index_iterator(final SubLObject asent, final SubLObject sense) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject result = (SubLObject)removal_modules_genlpreds_lookup.NIL;
        final SubLObject predicate = cycl_utilities.atomic_sentence_predicate(asent);
        final SubLObject _prev_bind_0 = control_vars.$inference_literal$.currentBinding(thread);
        try {
            control_vars.$inference_literal$.bind(asent, thread);
            SubLObject index_predicates = (SubLObject)removal_modules_genlpreds_lookup.NIL;
            if (removal_modules_genlpreds_lookup.$kw0$POS == sense) {
                index_predicates = inference_trampolines.inference_all_spec_predicates(predicate);
            }
            else {
                index_predicates = inference_trampolines.inference_all_genl_predicates(predicate);
            }
            SubLObject cdolist_list_var = index_predicates;
            SubLObject index_predicate = (SubLObject)removal_modules_genlpreds_lookup.NIL;
            index_predicate = cdolist_list_var.first();
            while (removal_modules_genlpreds_lookup.NIL != cdolist_list_var) {
                if (!index_predicate.eql(predicate)) {
                    final SubLObject index_asent = el_utilities.replace_formula_arg((SubLObject)removal_modules_genlpreds_lookup.ZERO_INTEGER, index_predicate, asent);
                    final SubLObject l_index = kb_indexing.best_gaf_lookup_index(index_asent, enumeration_types.sense_truth(sense), (SubLObject)removal_modules_genlpreds_lookup.NIL);
                    final SubLObject pcase_var;
                    final SubLObject method = pcase_var = kb_mapping_macros.do_gli_extract_method(l_index);
                    if (pcase_var.eql((SubLObject)removal_modules_genlpreds_lookup.$kw8$GAF_ARG)) {
                        thread.resetMultipleValues();
                        final SubLObject v_term = kb_mapping_macros.do_gli_vga_extract_keys(l_index);
                        final SubLObject argnum = thread.secondMultipleValue();
                        final SubLObject predicate_$40 = thread.thirdMultipleValue();
                        thread.resetMultipleValues();
                        if (removal_modules_genlpreds_lookup.NIL != argnum) {
                            if (removal_modules_genlpreds_lookup.NIL != predicate_$40) {
                                final SubLObject pred_var = predicate_$40;
                                if (removal_modules_genlpreds_lookup.NIL != kb_mapping_macros.do_gaf_arg_index_key_validator(v_term, argnum, pred_var)) {
                                    final SubLObject iterator_var = kb_mapping_macros.new_gaf_arg_final_index_spec_iterator(v_term, argnum, pred_var);
                                    SubLObject done_var = (SubLObject)removal_modules_genlpreds_lookup.NIL;
                                    final SubLObject token_var = (SubLObject)removal_modules_genlpreds_lookup.NIL;
                                    while (removal_modules_genlpreds_lookup.NIL == done_var) {
                                        final SubLObject final_index_spec = iteration.iteration_next_without_values_macro_helper(iterator_var, token_var);
                                        final SubLObject valid = (SubLObject)SubLObjectFactory.makeBoolean(!token_var.eql(final_index_spec));
                                        if (removal_modules_genlpreds_lookup.NIL != valid) {
                                            SubLObject final_index_iterator = (SubLObject)removal_modules_genlpreds_lookup.NIL;
                                            try {
                                                final_index_iterator = kb_mapping_macros.new_final_index_iterator(final_index_spec, (SubLObject)removal_modules_genlpreds_lookup.$kw9$GAF, enumeration_types.sense_truth(sense), (SubLObject)removal_modules_genlpreds_lookup.NIL);
                                                SubLObject done_var_$41 = (SubLObject)removal_modules_genlpreds_lookup.NIL;
                                                final SubLObject token_var_$42 = (SubLObject)removal_modules_genlpreds_lookup.NIL;
                                                while (removal_modules_genlpreds_lookup.NIL == done_var_$41) {
                                                    final SubLObject assertion = iteration.iteration_next_without_values_macro_helper(final_index_iterator, token_var_$42);
                                                    final SubLObject valid_$43 = (SubLObject)SubLObjectFactory.makeBoolean(!token_var_$42.eql(assertion));
                                                    if (removal_modules_genlpreds_lookup.NIL != valid_$43) {
                                                        final SubLObject var;
                                                        final SubLObject bindings_assertion = var = removal_genlpreds_gaf_iterator_internal(assertion);
                                                        if (removal_modules_genlpreds_lookup.NIL != var) {
                                                            result = (SubLObject)ConsesLow.cons(var, result);
                                                        }
                                                    }
                                                    done_var_$41 = (SubLObject)SubLObjectFactory.makeBoolean(removal_modules_genlpreds_lookup.NIL == valid_$43);
                                                }
                                            }
                                            finally {
                                                final SubLObject _prev_bind_0_$44 = Threads.$is_thread_performing_cleanupP$.currentBinding(thread);
                                                try {
                                                    Threads.$is_thread_performing_cleanupP$.bind((SubLObject)removal_modules_genlpreds_lookup.T, thread);
                                                    final SubLObject _values = Values.getValuesAsVector();
                                                    if (removal_modules_genlpreds_lookup.NIL != final_index_iterator) {
                                                        kb_mapping_macros.destroy_final_index_iterator(final_index_iterator);
                                                    }
                                                    Values.restoreValuesFromVector(_values);
                                                }
                                                finally {
                                                    Threads.$is_thread_performing_cleanupP$.rebind(_prev_bind_0_$44, thread);
                                                }
                                            }
                                        }
                                        done_var = (SubLObject)SubLObjectFactory.makeBoolean(removal_modules_genlpreds_lookup.NIL == valid);
                                    }
                                }
                            }
                            else {
                                final SubLObject pred_var = (SubLObject)removal_modules_genlpreds_lookup.NIL;
                                if (removal_modules_genlpreds_lookup.NIL != kb_mapping_macros.do_gaf_arg_index_key_validator(v_term, argnum, pred_var)) {
                                    final SubLObject iterator_var = kb_mapping_macros.new_gaf_arg_final_index_spec_iterator(v_term, argnum, pred_var);
                                    SubLObject done_var = (SubLObject)removal_modules_genlpreds_lookup.NIL;
                                    final SubLObject token_var = (SubLObject)removal_modules_genlpreds_lookup.NIL;
                                    while (removal_modules_genlpreds_lookup.NIL == done_var) {
                                        final SubLObject final_index_spec = iteration.iteration_next_without_values_macro_helper(iterator_var, token_var);
                                        final SubLObject valid = (SubLObject)SubLObjectFactory.makeBoolean(!token_var.eql(final_index_spec));
                                        if (removal_modules_genlpreds_lookup.NIL != valid) {
                                            SubLObject final_index_iterator = (SubLObject)removal_modules_genlpreds_lookup.NIL;
                                            try {
                                                final_index_iterator = kb_mapping_macros.new_final_index_iterator(final_index_spec, (SubLObject)removal_modules_genlpreds_lookup.$kw9$GAF, enumeration_types.sense_truth(sense), (SubLObject)removal_modules_genlpreds_lookup.NIL);
                                                SubLObject done_var_$42 = (SubLObject)removal_modules_genlpreds_lookup.NIL;
                                                final SubLObject token_var_$43 = (SubLObject)removal_modules_genlpreds_lookup.NIL;
                                                while (removal_modules_genlpreds_lookup.NIL == done_var_$42) {
                                                    final SubLObject assertion = iteration.iteration_next_without_values_macro_helper(final_index_iterator, token_var_$43);
                                                    final SubLObject valid_$44 = (SubLObject)SubLObjectFactory.makeBoolean(!token_var_$43.eql(assertion));
                                                    if (removal_modules_genlpreds_lookup.NIL != valid_$44) {
                                                        final SubLObject var;
                                                        final SubLObject bindings_assertion = var = removal_genlpreds_gaf_iterator_internal(assertion);
                                                        if (removal_modules_genlpreds_lookup.NIL != var) {
                                                            result = (SubLObject)ConsesLow.cons(var, result);
                                                        }
                                                    }
                                                    done_var_$42 = (SubLObject)SubLObjectFactory.makeBoolean(removal_modules_genlpreds_lookup.NIL == valid_$44);
                                                }
                                            }
                                            finally {
                                                final SubLObject _prev_bind_0_$45 = Threads.$is_thread_performing_cleanupP$.currentBinding(thread);
                                                try {
                                                    Threads.$is_thread_performing_cleanupP$.bind((SubLObject)removal_modules_genlpreds_lookup.T, thread);
                                                    final SubLObject _values2 = Values.getValuesAsVector();
                                                    if (removal_modules_genlpreds_lookup.NIL != final_index_iterator) {
                                                        kb_mapping_macros.destroy_final_index_iterator(final_index_iterator);
                                                    }
                                                    Values.restoreValuesFromVector(_values2);
                                                }
                                                finally {
                                                    Threads.$is_thread_performing_cleanupP$.rebind(_prev_bind_0_$45, thread);
                                                }
                                            }
                                        }
                                        done_var = (SubLObject)SubLObjectFactory.makeBoolean(removal_modules_genlpreds_lookup.NIL == valid);
                                    }
                                }
                            }
                        }
                        else if (removal_modules_genlpreds_lookup.NIL != predicate_$40) {
                            final SubLObject pred_var = predicate_$40;
                            if (removal_modules_genlpreds_lookup.NIL != kb_mapping_macros.do_gaf_arg_index_key_validator(v_term, (SubLObject)removal_modules_genlpreds_lookup.NIL, pred_var)) {
                                final SubLObject iterator_var = kb_mapping_macros.new_gaf_arg_final_index_spec_iterator(v_term, (SubLObject)removal_modules_genlpreds_lookup.NIL, pred_var);
                                SubLObject done_var = (SubLObject)removal_modules_genlpreds_lookup.NIL;
                                final SubLObject token_var = (SubLObject)removal_modules_genlpreds_lookup.NIL;
                                while (removal_modules_genlpreds_lookup.NIL == done_var) {
                                    final SubLObject final_index_spec = iteration.iteration_next_without_values_macro_helper(iterator_var, token_var);
                                    final SubLObject valid = (SubLObject)SubLObjectFactory.makeBoolean(!token_var.eql(final_index_spec));
                                    if (removal_modules_genlpreds_lookup.NIL != valid) {
                                        SubLObject final_index_iterator = (SubLObject)removal_modules_genlpreds_lookup.NIL;
                                        try {
                                            final_index_iterator = kb_mapping_macros.new_final_index_iterator(final_index_spec, (SubLObject)removal_modules_genlpreds_lookup.$kw9$GAF, enumeration_types.sense_truth(sense), (SubLObject)removal_modules_genlpreds_lookup.NIL);
                                            SubLObject done_var_$43 = (SubLObject)removal_modules_genlpreds_lookup.NIL;
                                            final SubLObject token_var_$44 = (SubLObject)removal_modules_genlpreds_lookup.NIL;
                                            while (removal_modules_genlpreds_lookup.NIL == done_var_$43) {
                                                final SubLObject assertion = iteration.iteration_next_without_values_macro_helper(final_index_iterator, token_var_$44);
                                                final SubLObject valid_$45 = (SubLObject)SubLObjectFactory.makeBoolean(!token_var_$44.eql(assertion));
                                                if (removal_modules_genlpreds_lookup.NIL != valid_$45) {
                                                    final SubLObject var;
                                                    final SubLObject bindings_assertion = var = removal_genlpreds_gaf_iterator_internal(assertion);
                                                    if (removal_modules_genlpreds_lookup.NIL != var) {
                                                        result = (SubLObject)ConsesLow.cons(var, result);
                                                    }
                                                }
                                                done_var_$43 = (SubLObject)SubLObjectFactory.makeBoolean(removal_modules_genlpreds_lookup.NIL == valid_$45);
                                            }
                                        }
                                        finally {
                                            final SubLObject _prev_bind_0_$46 = Threads.$is_thread_performing_cleanupP$.currentBinding(thread);
                                            try {
                                                Threads.$is_thread_performing_cleanupP$.bind((SubLObject)removal_modules_genlpreds_lookup.T, thread);
                                                final SubLObject _values3 = Values.getValuesAsVector();
                                                if (removal_modules_genlpreds_lookup.NIL != final_index_iterator) {
                                                    kb_mapping_macros.destroy_final_index_iterator(final_index_iterator);
                                                }
                                                Values.restoreValuesFromVector(_values3);
                                            }
                                            finally {
                                                Threads.$is_thread_performing_cleanupP$.rebind(_prev_bind_0_$46, thread);
                                            }
                                        }
                                    }
                                    done_var = (SubLObject)SubLObjectFactory.makeBoolean(removal_modules_genlpreds_lookup.NIL == valid);
                                }
                            }
                        }
                        else {
                            final SubLObject pred_var = (SubLObject)removal_modules_genlpreds_lookup.NIL;
                            if (removal_modules_genlpreds_lookup.NIL != kb_mapping_macros.do_gaf_arg_index_key_validator(v_term, (SubLObject)removal_modules_genlpreds_lookup.NIL, pred_var)) {
                                final SubLObject iterator_var = kb_mapping_macros.new_gaf_arg_final_index_spec_iterator(v_term, (SubLObject)removal_modules_genlpreds_lookup.NIL, pred_var);
                                SubLObject done_var = (SubLObject)removal_modules_genlpreds_lookup.NIL;
                                final SubLObject token_var = (SubLObject)removal_modules_genlpreds_lookup.NIL;
                                while (removal_modules_genlpreds_lookup.NIL == done_var) {
                                    final SubLObject final_index_spec = iteration.iteration_next_without_values_macro_helper(iterator_var, token_var);
                                    final SubLObject valid = (SubLObject)SubLObjectFactory.makeBoolean(!token_var.eql(final_index_spec));
                                    if (removal_modules_genlpreds_lookup.NIL != valid) {
                                        SubLObject final_index_iterator = (SubLObject)removal_modules_genlpreds_lookup.NIL;
                                        try {
                                            final_index_iterator = kb_mapping_macros.new_final_index_iterator(final_index_spec, (SubLObject)removal_modules_genlpreds_lookup.$kw9$GAF, enumeration_types.sense_truth(sense), (SubLObject)removal_modules_genlpreds_lookup.NIL);
                                            SubLObject done_var_$44 = (SubLObject)removal_modules_genlpreds_lookup.NIL;
                                            final SubLObject token_var_$45 = (SubLObject)removal_modules_genlpreds_lookup.NIL;
                                            while (removal_modules_genlpreds_lookup.NIL == done_var_$44) {
                                                final SubLObject assertion = iteration.iteration_next_without_values_macro_helper(final_index_iterator, token_var_$45);
                                                final SubLObject valid_$46 = (SubLObject)SubLObjectFactory.makeBoolean(!token_var_$45.eql(assertion));
                                                if (removal_modules_genlpreds_lookup.NIL != valid_$46) {
                                                    final SubLObject var;
                                                    final SubLObject bindings_assertion = var = removal_genlpreds_gaf_iterator_internal(assertion);
                                                    if (removal_modules_genlpreds_lookup.NIL != var) {
                                                        result = (SubLObject)ConsesLow.cons(var, result);
                                                    }
                                                }
                                                done_var_$44 = (SubLObject)SubLObjectFactory.makeBoolean(removal_modules_genlpreds_lookup.NIL == valid_$46);
                                            }
                                        }
                                        finally {
                                            final SubLObject _prev_bind_0_$47 = Threads.$is_thread_performing_cleanupP$.currentBinding(thread);
                                            try {
                                                Threads.$is_thread_performing_cleanupP$.bind((SubLObject)removal_modules_genlpreds_lookup.T, thread);
                                                final SubLObject _values4 = Values.getValuesAsVector();
                                                if (removal_modules_genlpreds_lookup.NIL != final_index_iterator) {
                                                    kb_mapping_macros.destroy_final_index_iterator(final_index_iterator);
                                                }
                                                Values.restoreValuesFromVector(_values4);
                                            }
                                            finally {
                                                Threads.$is_thread_performing_cleanupP$.rebind(_prev_bind_0_$47, thread);
                                            }
                                        }
                                    }
                                    done_var = (SubLObject)SubLObjectFactory.makeBoolean(removal_modules_genlpreds_lookup.NIL == valid);
                                }
                            }
                        }
                    }
                    else if (pcase_var.eql((SubLObject)removal_modules_genlpreds_lookup.$kw10$PREDICATE_EXTENT)) {
                        final SubLObject pred_var2 = kb_mapping_macros.do_gli_vpe_extract_key(l_index);
                        if (removal_modules_genlpreds_lookup.NIL != kb_mapping_macros.do_predicate_extent_index_key_validator(pred_var2)) {
                            final SubLObject str = (SubLObject)removal_modules_genlpreds_lookup.NIL;
                            final SubLObject _prev_bind_0_$48 = utilities_macros.$progress_start_time$.currentBinding(thread);
                            final SubLObject _prev_bind_2 = utilities_macros.$progress_last_pacification_time$.currentBinding(thread);
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
                                utilities_macros.$progress_notification_count$.bind((SubLObject)removal_modules_genlpreds_lookup.ZERO_INTEGER, thread);
                                utilities_macros.$progress_pacifications_since_last_nl$.bind((SubLObject)removal_modules_genlpreds_lookup.ZERO_INTEGER, thread);
                                utilities_macros.$progress_count$.bind((SubLObject)removal_modules_genlpreds_lookup.ZERO_INTEGER, thread);
                                utilities_macros.$is_noting_progressP$.bind((SubLObject)removal_modules_genlpreds_lookup.T, thread);
                                utilities_macros.$silent_progressP$.bind((SubLObject)((removal_modules_genlpreds_lookup.NIL != str) ? utilities_macros.$silent_progressP$.getDynamicValue(thread) : removal_modules_genlpreds_lookup.T), thread);
                                utilities_macros.noting_progress_preamble(str);
                                final SubLObject iterator_var2 = kb_mapping_macros.new_predicate_extent_final_index_spec_iterator(pred_var2);
                                SubLObject done_var2 = (SubLObject)removal_modules_genlpreds_lookup.NIL;
                                final SubLObject token_var2 = (SubLObject)removal_modules_genlpreds_lookup.NIL;
                                while (removal_modules_genlpreds_lookup.NIL == done_var2) {
                                    final SubLObject final_index_spec2 = iteration.iteration_next_without_values_macro_helper(iterator_var2, token_var2);
                                    final SubLObject valid2 = (SubLObject)SubLObjectFactory.makeBoolean(!token_var2.eql(final_index_spec2));
                                    if (removal_modules_genlpreds_lookup.NIL != valid2) {
                                        utilities_macros.note_progress();
                                        SubLObject final_index_iterator2 = (SubLObject)removal_modules_genlpreds_lookup.NIL;
                                        try {
                                            final_index_iterator2 = kb_mapping_macros.new_final_index_iterator(final_index_spec2, (SubLObject)removal_modules_genlpreds_lookup.$kw9$GAF, enumeration_types.sense_truth(sense), (SubLObject)removal_modules_genlpreds_lookup.NIL);
                                            SubLObject done_var_$45 = (SubLObject)removal_modules_genlpreds_lookup.NIL;
                                            final SubLObject token_var_$46 = (SubLObject)removal_modules_genlpreds_lookup.NIL;
                                            while (removal_modules_genlpreds_lookup.NIL == done_var_$45) {
                                                final SubLObject assertion2 = iteration.iteration_next_without_values_macro_helper(final_index_iterator2, token_var_$46);
                                                final SubLObject valid_$47 = (SubLObject)SubLObjectFactory.makeBoolean(!token_var_$46.eql(assertion2));
                                                if (removal_modules_genlpreds_lookup.NIL != valid_$47) {
                                                    final SubLObject var2;
                                                    final SubLObject bindings_assertion2 = var2 = removal_genlpreds_gaf_iterator_internal(assertion2);
                                                    if (removal_modules_genlpreds_lookup.NIL != var2) {
                                                        result = (SubLObject)ConsesLow.cons(var2, result);
                                                    }
                                                }
                                                done_var_$45 = (SubLObject)SubLObjectFactory.makeBoolean(removal_modules_genlpreds_lookup.NIL == valid_$47);
                                            }
                                        }
                                        finally {
                                            final SubLObject _prev_bind_0_$49 = Threads.$is_thread_performing_cleanupP$.currentBinding(thread);
                                            try {
                                                Threads.$is_thread_performing_cleanupP$.bind((SubLObject)removal_modules_genlpreds_lookup.T, thread);
                                                final SubLObject _values5 = Values.getValuesAsVector();
                                                if (removal_modules_genlpreds_lookup.NIL != final_index_iterator2) {
                                                    kb_mapping_macros.destroy_final_index_iterator(final_index_iterator2);
                                                }
                                                Values.restoreValuesFromVector(_values5);
                                            }
                                            finally {
                                                Threads.$is_thread_performing_cleanupP$.rebind(_prev_bind_0_$49, thread);
                                            }
                                        }
                                    }
                                    done_var2 = (SubLObject)SubLObjectFactory.makeBoolean(removal_modules_genlpreds_lookup.NIL == valid2);
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
                                utilities_macros.$progress_last_pacification_time$.rebind(_prev_bind_2, thread);
                                utilities_macros.$progress_start_time$.rebind(_prev_bind_0_$48, thread);
                            }
                        }
                    }
                    else if (pcase_var.eql((SubLObject)removal_modules_genlpreds_lookup.$kw11$OVERLAP)) {
                        SubLObject cdolist_list_var_$62 = virtual_indexing.gather_overlap_index(kb_mapping_macros.do_gli_vo_extract_key(l_index), (SubLObject)removal_modules_genlpreds_lookup.UNPROVIDED);
                        SubLObject assertion3 = (SubLObject)removal_modules_genlpreds_lookup.NIL;
                        assertion3 = cdolist_list_var_$62.first();
                        while (removal_modules_genlpreds_lookup.NIL != cdolist_list_var_$62) {
                            if (removal_modules_genlpreds_lookup.NIL == enumeration_types.sense_truth(sense) || removal_modules_genlpreds_lookup.NIL != assertions_high.assertion_has_truth(assertion3, enumeration_types.sense_truth(sense))) {
                                final SubLObject var3;
                                final SubLObject bindings_assertion3 = var3 = removal_genlpreds_gaf_iterator_internal(assertion3);
                                if (removal_modules_genlpreds_lookup.NIL != var3) {
                                    result = (SubLObject)ConsesLow.cons(var3, result);
                                }
                            }
                            cdolist_list_var_$62 = cdolist_list_var_$62.rest();
                            assertion3 = cdolist_list_var_$62.first();
                        }
                    }
                    else {
                        kb_mapping_macros.do_gli_method_error(l_index, method);
                    }
                }
                cdolist_list_var = cdolist_list_var.rest();
                index_predicate = cdolist_list_var.first();
            }
        }
        finally {
            control_vars.$inference_literal$.rebind(_prev_bind_0, thread);
        }
        if (removal_modules_genlpreds_lookup.NIL != result) {
            return iteration.new_list_iterator(result);
        }
        return (SubLObject)removal_modules_genlpreds_lookup.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/modules/removal/removal-modules-genlpreds-lookup.lisp", position = 11988L)
    public static SubLObject removal_genlinverse_lookup_pos_cost(final SubLObject asent, SubLObject sense) {
        if (sense == removal_modules_genlpreds_lookup.UNPROVIDED) {
            sense = (SubLObject)removal_modules_genlpreds_lookup.NIL;
        }
        if (removal_modules_genlpreds_lookup.NIL != variables.fully_bound_p(asent)) {
            return control_vars.$typical_hl_module_check_cost$.getGlobalValue();
        }
        return num_best_genlinverse_gaf_lookup_index(asent, (SubLObject)removal_modules_genlpreds_lookup.$kw0$POS);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/modules/removal/removal-modules-genlpreds-lookup.lisp", position = 12762L)
    public static SubLObject removal_genlinverse_lookup_pos_iterator(final SubLObject asent) {
        return removal_genlinverse_lookup_iterator(asent, (SubLObject)removal_modules_genlpreds_lookup.$kw0$POS);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/modules/removal/removal-modules-genlpreds-lookup.lisp", position = 13903L)
    public static SubLObject removal_genlinverse_lookup_neg_completeness(final SubLObject asent) {
        if (removal_modules_genlpreds_lookup.NIL != removal_module_utilities.negation_grossly_incompleteP(asent, (SubLObject)removal_modules_genlpreds_lookup.$kw3$NEG)) {
            return (SubLObject)removal_modules_genlpreds_lookup.$kw4$GROSSLY_INCOMPLETE;
        }
        return (SubLObject)removal_modules_genlpreds_lookup.$kw5$INCOMPLETE;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/modules/removal/removal-modules-genlpreds-lookup.lisp", position = 14081L)
    public static SubLObject removal_genlinverse_lookup_neg_cost(final SubLObject asent, SubLObject sense) {
        if (sense == removal_modules_genlpreds_lookup.UNPROVIDED) {
            sense = (SubLObject)removal_modules_genlpreds_lookup.NIL;
        }
        return num_best_genlinverse_gaf_lookup_index(asent, (SubLObject)removal_modules_genlpreds_lookup.$kw3$NEG);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/modules/removal/removal-modules-genlpreds-lookup.lisp", position = 14235L)
    public static SubLObject removal_genlinverse_lookup_neg_iterator(final SubLObject asent) {
        return removal_genlinverse_lookup_iterator(asent, (SubLObject)removal_modules_genlpreds_lookup.$kw3$NEG);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/modules/removal/removal-modules-genlpreds-lookup.lisp", position = 15448L)
    public static SubLObject removal_genlinverse_lookup_iterator(final SubLObject asent, final SubLObject sense) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject result = (SubLObject)removal_modules_genlpreds_lookup.NIL;
        final SubLObject obfuscated_asent = obfuscate_predicate(removal_modules_symmetry.symmetric_asent(asent));
        final SubLObject _prev_bind_0 = pred_relevance_macros.$relevant_pred_function$.currentBinding(thread);
        final SubLObject _prev_bind_2 = control_vars.$inference_literal$.currentBinding(thread);
        final SubLObject _prev_bind_3 = control_vars.$inference_sense$.currentBinding(thread);
        try {
            pred_relevance_macros.$relevant_pred_function$.bind(pred_relevance_macros.determine_inference_genl_or_spec_inverse_relevance(sense), thread);
            control_vars.$inference_literal$.bind(asent, thread);
            control_vars.$inference_sense$.bind(sense, thread);
            final SubLObject l_index = kb_indexing.best_gaf_lookup_index(obfuscated_asent, enumeration_types.sense_truth(sense), (SubLObject)removal_modules_genlpreds_lookup.NIL);
            final SubLObject pcase_var;
            final SubLObject method = pcase_var = kb_mapping_macros.do_gli_extract_method(l_index);
            if (pcase_var.eql((SubLObject)removal_modules_genlpreds_lookup.$kw8$GAF_ARG)) {
                thread.resetMultipleValues();
                final SubLObject v_term = kb_mapping_macros.do_gli_vga_extract_keys(l_index);
                final SubLObject argnum = thread.secondMultipleValue();
                final SubLObject predicate = thread.thirdMultipleValue();
                thread.resetMultipleValues();
                if (removal_modules_genlpreds_lookup.NIL != argnum) {
                    if (removal_modules_genlpreds_lookup.NIL != predicate) {
                        final SubLObject pred_var = predicate;
                        if (removal_modules_genlpreds_lookup.NIL != kb_mapping_macros.do_gaf_arg_index_key_validator(v_term, argnum, pred_var)) {
                            final SubLObject iterator_var = kb_mapping_macros.new_gaf_arg_final_index_spec_iterator(v_term, argnum, pred_var);
                            SubLObject done_var = (SubLObject)removal_modules_genlpreds_lookup.NIL;
                            final SubLObject token_var = (SubLObject)removal_modules_genlpreds_lookup.NIL;
                            while (removal_modules_genlpreds_lookup.NIL == done_var) {
                                final SubLObject final_index_spec = iteration.iteration_next_without_values_macro_helper(iterator_var, token_var);
                                final SubLObject valid = (SubLObject)SubLObjectFactory.makeBoolean(!token_var.eql(final_index_spec));
                                if (removal_modules_genlpreds_lookup.NIL != valid) {
                                    SubLObject final_index_iterator = (SubLObject)removal_modules_genlpreds_lookup.NIL;
                                    try {
                                        final_index_iterator = kb_mapping_macros.new_final_index_iterator(final_index_spec, (SubLObject)removal_modules_genlpreds_lookup.$kw9$GAF, enumeration_types.sense_truth(sense), (SubLObject)removal_modules_genlpreds_lookup.NIL);
                                        SubLObject done_var_$63 = (SubLObject)removal_modules_genlpreds_lookup.NIL;
                                        final SubLObject token_var_$64 = (SubLObject)removal_modules_genlpreds_lookup.NIL;
                                        while (removal_modules_genlpreds_lookup.NIL == done_var_$63) {
                                            final SubLObject gaf = iteration.iteration_next_without_values_macro_helper(final_index_iterator, token_var_$64);
                                            final SubLObject valid_$65 = (SubLObject)SubLObjectFactory.makeBoolean(!token_var_$64.eql(gaf));
                                            if (removal_modules_genlpreds_lookup.NIL != valid_$65) {
                                                final SubLObject bindings_assertion = removal_genlinverse_gaf_iterator_internal(asent, gaf);
                                                if (removal_modules_genlpreds_lookup.NIL != bindings_assertion) {
                                                    result = (SubLObject)ConsesLow.cons(bindings_assertion, result);
                                                }
                                            }
                                            done_var_$63 = (SubLObject)SubLObjectFactory.makeBoolean(removal_modules_genlpreds_lookup.NIL == valid_$65);
                                        }
                                    }
                                    finally {
                                        final SubLObject _prev_bind_0_$66 = Threads.$is_thread_performing_cleanupP$.currentBinding(thread);
                                        try {
                                            Threads.$is_thread_performing_cleanupP$.bind((SubLObject)removal_modules_genlpreds_lookup.T, thread);
                                            final SubLObject _values = Values.getValuesAsVector();
                                            if (removal_modules_genlpreds_lookup.NIL != final_index_iterator) {
                                                kb_mapping_macros.destroy_final_index_iterator(final_index_iterator);
                                            }
                                            Values.restoreValuesFromVector(_values);
                                        }
                                        finally {
                                            Threads.$is_thread_performing_cleanupP$.rebind(_prev_bind_0_$66, thread);
                                        }
                                    }
                                }
                                done_var = (SubLObject)SubLObjectFactory.makeBoolean(removal_modules_genlpreds_lookup.NIL == valid);
                            }
                        }
                    }
                    else {
                        final SubLObject pred_var = (SubLObject)removal_modules_genlpreds_lookup.NIL;
                        if (removal_modules_genlpreds_lookup.NIL != kb_mapping_macros.do_gaf_arg_index_key_validator(v_term, argnum, pred_var)) {
                            final SubLObject iterator_var = kb_mapping_macros.new_gaf_arg_final_index_spec_iterator(v_term, argnum, pred_var);
                            SubLObject done_var = (SubLObject)removal_modules_genlpreds_lookup.NIL;
                            final SubLObject token_var = (SubLObject)removal_modules_genlpreds_lookup.NIL;
                            while (removal_modules_genlpreds_lookup.NIL == done_var) {
                                final SubLObject final_index_spec = iteration.iteration_next_without_values_macro_helper(iterator_var, token_var);
                                final SubLObject valid = (SubLObject)SubLObjectFactory.makeBoolean(!token_var.eql(final_index_spec));
                                if (removal_modules_genlpreds_lookup.NIL != valid) {
                                    SubLObject final_index_iterator = (SubLObject)removal_modules_genlpreds_lookup.NIL;
                                    try {
                                        final_index_iterator = kb_mapping_macros.new_final_index_iterator(final_index_spec, (SubLObject)removal_modules_genlpreds_lookup.$kw9$GAF, enumeration_types.sense_truth(sense), (SubLObject)removal_modules_genlpreds_lookup.NIL);
                                        SubLObject done_var_$64 = (SubLObject)removal_modules_genlpreds_lookup.NIL;
                                        final SubLObject token_var_$65 = (SubLObject)removal_modules_genlpreds_lookup.NIL;
                                        while (removal_modules_genlpreds_lookup.NIL == done_var_$64) {
                                            final SubLObject gaf = iteration.iteration_next_without_values_macro_helper(final_index_iterator, token_var_$65);
                                            final SubLObject valid_$66 = (SubLObject)SubLObjectFactory.makeBoolean(!token_var_$65.eql(gaf));
                                            if (removal_modules_genlpreds_lookup.NIL != valid_$66) {
                                                final SubLObject bindings_assertion = removal_genlinverse_gaf_iterator_internal(asent, gaf);
                                                if (removal_modules_genlpreds_lookup.NIL != bindings_assertion) {
                                                    result = (SubLObject)ConsesLow.cons(bindings_assertion, result);
                                                }
                                            }
                                            done_var_$64 = (SubLObject)SubLObjectFactory.makeBoolean(removal_modules_genlpreds_lookup.NIL == valid_$66);
                                        }
                                    }
                                    finally {
                                        final SubLObject _prev_bind_0_$67 = Threads.$is_thread_performing_cleanupP$.currentBinding(thread);
                                        try {
                                            Threads.$is_thread_performing_cleanupP$.bind((SubLObject)removal_modules_genlpreds_lookup.T, thread);
                                            final SubLObject _values2 = Values.getValuesAsVector();
                                            if (removal_modules_genlpreds_lookup.NIL != final_index_iterator) {
                                                kb_mapping_macros.destroy_final_index_iterator(final_index_iterator);
                                            }
                                            Values.restoreValuesFromVector(_values2);
                                        }
                                        finally {
                                            Threads.$is_thread_performing_cleanupP$.rebind(_prev_bind_0_$67, thread);
                                        }
                                    }
                                }
                                done_var = (SubLObject)SubLObjectFactory.makeBoolean(removal_modules_genlpreds_lookup.NIL == valid);
                            }
                        }
                    }
                }
                else if (removal_modules_genlpreds_lookup.NIL != predicate) {
                    final SubLObject pred_var = predicate;
                    if (removal_modules_genlpreds_lookup.NIL != kb_mapping_macros.do_gaf_arg_index_key_validator(v_term, (SubLObject)removal_modules_genlpreds_lookup.NIL, pred_var)) {
                        final SubLObject iterator_var = kb_mapping_macros.new_gaf_arg_final_index_spec_iterator(v_term, (SubLObject)removal_modules_genlpreds_lookup.NIL, pred_var);
                        SubLObject done_var = (SubLObject)removal_modules_genlpreds_lookup.NIL;
                        final SubLObject token_var = (SubLObject)removal_modules_genlpreds_lookup.NIL;
                        while (removal_modules_genlpreds_lookup.NIL == done_var) {
                            final SubLObject final_index_spec = iteration.iteration_next_without_values_macro_helper(iterator_var, token_var);
                            final SubLObject valid = (SubLObject)SubLObjectFactory.makeBoolean(!token_var.eql(final_index_spec));
                            if (removal_modules_genlpreds_lookup.NIL != valid) {
                                SubLObject final_index_iterator = (SubLObject)removal_modules_genlpreds_lookup.NIL;
                                try {
                                    final_index_iterator = kb_mapping_macros.new_final_index_iterator(final_index_spec, (SubLObject)removal_modules_genlpreds_lookup.$kw9$GAF, enumeration_types.sense_truth(sense), (SubLObject)removal_modules_genlpreds_lookup.NIL);
                                    SubLObject done_var_$65 = (SubLObject)removal_modules_genlpreds_lookup.NIL;
                                    final SubLObject token_var_$66 = (SubLObject)removal_modules_genlpreds_lookup.NIL;
                                    while (removal_modules_genlpreds_lookup.NIL == done_var_$65) {
                                        final SubLObject gaf = iteration.iteration_next_without_values_macro_helper(final_index_iterator, token_var_$66);
                                        final SubLObject valid_$67 = (SubLObject)SubLObjectFactory.makeBoolean(!token_var_$66.eql(gaf));
                                        if (removal_modules_genlpreds_lookup.NIL != valid_$67) {
                                            final SubLObject bindings_assertion = removal_genlinverse_gaf_iterator_internal(asent, gaf);
                                            if (removal_modules_genlpreds_lookup.NIL != bindings_assertion) {
                                                result = (SubLObject)ConsesLow.cons(bindings_assertion, result);
                                            }
                                        }
                                        done_var_$65 = (SubLObject)SubLObjectFactory.makeBoolean(removal_modules_genlpreds_lookup.NIL == valid_$67);
                                    }
                                }
                                finally {
                                    final SubLObject _prev_bind_0_$68 = Threads.$is_thread_performing_cleanupP$.currentBinding(thread);
                                    try {
                                        Threads.$is_thread_performing_cleanupP$.bind((SubLObject)removal_modules_genlpreds_lookup.T, thread);
                                        final SubLObject _values3 = Values.getValuesAsVector();
                                        if (removal_modules_genlpreds_lookup.NIL != final_index_iterator) {
                                            kb_mapping_macros.destroy_final_index_iterator(final_index_iterator);
                                        }
                                        Values.restoreValuesFromVector(_values3);
                                    }
                                    finally {
                                        Threads.$is_thread_performing_cleanupP$.rebind(_prev_bind_0_$68, thread);
                                    }
                                }
                            }
                            done_var = (SubLObject)SubLObjectFactory.makeBoolean(removal_modules_genlpreds_lookup.NIL == valid);
                        }
                    }
                }
                else {
                    final SubLObject pred_var = (SubLObject)removal_modules_genlpreds_lookup.NIL;
                    if (removal_modules_genlpreds_lookup.NIL != kb_mapping_macros.do_gaf_arg_index_key_validator(v_term, (SubLObject)removal_modules_genlpreds_lookup.NIL, pred_var)) {
                        final SubLObject iterator_var = kb_mapping_macros.new_gaf_arg_final_index_spec_iterator(v_term, (SubLObject)removal_modules_genlpreds_lookup.NIL, pred_var);
                        SubLObject done_var = (SubLObject)removal_modules_genlpreds_lookup.NIL;
                        final SubLObject token_var = (SubLObject)removal_modules_genlpreds_lookup.NIL;
                        while (removal_modules_genlpreds_lookup.NIL == done_var) {
                            final SubLObject final_index_spec = iteration.iteration_next_without_values_macro_helper(iterator_var, token_var);
                            final SubLObject valid = (SubLObject)SubLObjectFactory.makeBoolean(!token_var.eql(final_index_spec));
                            if (removal_modules_genlpreds_lookup.NIL != valid) {
                                SubLObject final_index_iterator = (SubLObject)removal_modules_genlpreds_lookup.NIL;
                                try {
                                    final_index_iterator = kb_mapping_macros.new_final_index_iterator(final_index_spec, (SubLObject)removal_modules_genlpreds_lookup.$kw9$GAF, enumeration_types.sense_truth(sense), (SubLObject)removal_modules_genlpreds_lookup.NIL);
                                    SubLObject done_var_$66 = (SubLObject)removal_modules_genlpreds_lookup.NIL;
                                    final SubLObject token_var_$67 = (SubLObject)removal_modules_genlpreds_lookup.NIL;
                                    while (removal_modules_genlpreds_lookup.NIL == done_var_$66) {
                                        final SubLObject gaf = iteration.iteration_next_without_values_macro_helper(final_index_iterator, token_var_$67);
                                        final SubLObject valid_$68 = (SubLObject)SubLObjectFactory.makeBoolean(!token_var_$67.eql(gaf));
                                        if (removal_modules_genlpreds_lookup.NIL != valid_$68) {
                                            final SubLObject bindings_assertion = removal_genlinverse_gaf_iterator_internal(asent, gaf);
                                            if (removal_modules_genlpreds_lookup.NIL != bindings_assertion) {
                                                result = (SubLObject)ConsesLow.cons(bindings_assertion, result);
                                            }
                                        }
                                        done_var_$66 = (SubLObject)SubLObjectFactory.makeBoolean(removal_modules_genlpreds_lookup.NIL == valid_$68);
                                    }
                                }
                                finally {
                                    final SubLObject _prev_bind_0_$69 = Threads.$is_thread_performing_cleanupP$.currentBinding(thread);
                                    try {
                                        Threads.$is_thread_performing_cleanupP$.bind((SubLObject)removal_modules_genlpreds_lookup.T, thread);
                                        final SubLObject _values4 = Values.getValuesAsVector();
                                        if (removal_modules_genlpreds_lookup.NIL != final_index_iterator) {
                                            kb_mapping_macros.destroy_final_index_iterator(final_index_iterator);
                                        }
                                        Values.restoreValuesFromVector(_values4);
                                    }
                                    finally {
                                        Threads.$is_thread_performing_cleanupP$.rebind(_prev_bind_0_$69, thread);
                                    }
                                }
                            }
                            done_var = (SubLObject)SubLObjectFactory.makeBoolean(removal_modules_genlpreds_lookup.NIL == valid);
                        }
                    }
                }
            }
            else if (pcase_var.eql((SubLObject)removal_modules_genlpreds_lookup.$kw10$PREDICATE_EXTENT)) {
                final SubLObject pred_var2 = kb_mapping_macros.do_gli_vpe_extract_key(l_index);
                if (removal_modules_genlpreds_lookup.NIL != kb_mapping_macros.do_predicate_extent_index_key_validator(pred_var2)) {
                    final SubLObject str = (SubLObject)removal_modules_genlpreds_lookup.NIL;
                    final SubLObject _prev_bind_0_$70 = utilities_macros.$progress_start_time$.currentBinding(thread);
                    final SubLObject _prev_bind_1_$80 = utilities_macros.$progress_last_pacification_time$.currentBinding(thread);
                    final SubLObject _prev_bind_2_$81 = utilities_macros.$progress_elapsed_seconds_for_notification$.currentBinding(thread);
                    final SubLObject _prev_bind_4 = utilities_macros.$progress_notification_count$.currentBinding(thread);
                    final SubLObject _prev_bind_5 = utilities_macros.$progress_pacifications_since_last_nl$.currentBinding(thread);
                    final SubLObject _prev_bind_6 = utilities_macros.$progress_count$.currentBinding(thread);
                    final SubLObject _prev_bind_7 = utilities_macros.$is_noting_progressP$.currentBinding(thread);
                    final SubLObject _prev_bind_8 = utilities_macros.$silent_progressP$.currentBinding(thread);
                    try {
                        utilities_macros.$progress_start_time$.bind(Time.get_universal_time(), thread);
                        utilities_macros.$progress_last_pacification_time$.bind(utilities_macros.$progress_start_time$.getDynamicValue(thread), thread);
                        utilities_macros.$progress_elapsed_seconds_for_notification$.bind(utilities_macros.$suppress_all_progress_faster_than_seconds$.getDynamicValue(thread), thread);
                        utilities_macros.$progress_notification_count$.bind((SubLObject)removal_modules_genlpreds_lookup.ZERO_INTEGER, thread);
                        utilities_macros.$progress_pacifications_since_last_nl$.bind((SubLObject)removal_modules_genlpreds_lookup.ZERO_INTEGER, thread);
                        utilities_macros.$progress_count$.bind((SubLObject)removal_modules_genlpreds_lookup.ZERO_INTEGER, thread);
                        utilities_macros.$is_noting_progressP$.bind((SubLObject)removal_modules_genlpreds_lookup.T, thread);
                        utilities_macros.$silent_progressP$.bind((SubLObject)((removal_modules_genlpreds_lookup.NIL != str) ? utilities_macros.$silent_progressP$.getDynamicValue(thread) : removal_modules_genlpreds_lookup.T), thread);
                        utilities_macros.noting_progress_preamble(str);
                        final SubLObject iterator_var2 = kb_mapping_macros.new_predicate_extent_final_index_spec_iterator(pred_var2);
                        SubLObject done_var2 = (SubLObject)removal_modules_genlpreds_lookup.NIL;
                        final SubLObject token_var2 = (SubLObject)removal_modules_genlpreds_lookup.NIL;
                        while (removal_modules_genlpreds_lookup.NIL == done_var2) {
                            final SubLObject final_index_spec2 = iteration.iteration_next_without_values_macro_helper(iterator_var2, token_var2);
                            final SubLObject valid2 = (SubLObject)SubLObjectFactory.makeBoolean(!token_var2.eql(final_index_spec2));
                            if (removal_modules_genlpreds_lookup.NIL != valid2) {
                                utilities_macros.note_progress();
                                SubLObject final_index_iterator2 = (SubLObject)removal_modules_genlpreds_lookup.NIL;
                                try {
                                    final_index_iterator2 = kb_mapping_macros.new_final_index_iterator(final_index_spec2, (SubLObject)removal_modules_genlpreds_lookup.$kw9$GAF, enumeration_types.sense_truth(sense), (SubLObject)removal_modules_genlpreds_lookup.NIL);
                                    SubLObject done_var_$67 = (SubLObject)removal_modules_genlpreds_lookup.NIL;
                                    final SubLObject token_var_$68 = (SubLObject)removal_modules_genlpreds_lookup.NIL;
                                    while (removal_modules_genlpreds_lookup.NIL == done_var_$67) {
                                        final SubLObject gaf2 = iteration.iteration_next_without_values_macro_helper(final_index_iterator2, token_var_$68);
                                        final SubLObject valid_$69 = (SubLObject)SubLObjectFactory.makeBoolean(!token_var_$68.eql(gaf2));
                                        if (removal_modules_genlpreds_lookup.NIL != valid_$69) {
                                            final SubLObject bindings_assertion2 = removal_genlinverse_gaf_iterator_internal(asent, gaf2);
                                            if (removal_modules_genlpreds_lookup.NIL != bindings_assertion2) {
                                                result = (SubLObject)ConsesLow.cons(bindings_assertion2, result);
                                            }
                                        }
                                        done_var_$67 = (SubLObject)SubLObjectFactory.makeBoolean(removal_modules_genlpreds_lookup.NIL == valid_$69);
                                    }
                                }
                                finally {
                                    final SubLObject _prev_bind_0_$71 = Threads.$is_thread_performing_cleanupP$.currentBinding(thread);
                                    try {
                                        Threads.$is_thread_performing_cleanupP$.bind((SubLObject)removal_modules_genlpreds_lookup.T, thread);
                                        final SubLObject _values5 = Values.getValuesAsVector();
                                        if (removal_modules_genlpreds_lookup.NIL != final_index_iterator2) {
                                            kb_mapping_macros.destroy_final_index_iterator(final_index_iterator2);
                                        }
                                        Values.restoreValuesFromVector(_values5);
                                    }
                                    finally {
                                        Threads.$is_thread_performing_cleanupP$.rebind(_prev_bind_0_$71, thread);
                                    }
                                }
                            }
                            done_var2 = (SubLObject)SubLObjectFactory.makeBoolean(removal_modules_genlpreds_lookup.NIL == valid2);
                        }
                        utilities_macros.noting_progress_postamble();
                    }
                    finally {
                        utilities_macros.$silent_progressP$.rebind(_prev_bind_8, thread);
                        utilities_macros.$is_noting_progressP$.rebind(_prev_bind_7, thread);
                        utilities_macros.$progress_count$.rebind(_prev_bind_6, thread);
                        utilities_macros.$progress_pacifications_since_last_nl$.rebind(_prev_bind_5, thread);
                        utilities_macros.$progress_notification_count$.rebind(_prev_bind_4, thread);
                        utilities_macros.$progress_elapsed_seconds_for_notification$.rebind(_prev_bind_2_$81, thread);
                        utilities_macros.$progress_last_pacification_time$.rebind(_prev_bind_1_$80, thread);
                        utilities_macros.$progress_start_time$.rebind(_prev_bind_0_$70, thread);
                    }
                }
            }
            else if (pcase_var.eql((SubLObject)removal_modules_genlpreds_lookup.$kw11$OVERLAP)) {
                SubLObject cdolist_list_var = virtual_indexing.gather_overlap_index(kb_mapping_macros.do_gli_vo_extract_key(l_index), (SubLObject)removal_modules_genlpreds_lookup.UNPROVIDED);
                SubLObject gaf3 = (SubLObject)removal_modules_genlpreds_lookup.NIL;
                gaf3 = cdolist_list_var.first();
                while (removal_modules_genlpreds_lookup.NIL != cdolist_list_var) {
                    if (removal_modules_genlpreds_lookup.NIL == enumeration_types.sense_truth(sense) || removal_modules_genlpreds_lookup.NIL != assertions_high.assertion_has_truth(gaf3, enumeration_types.sense_truth(sense))) {
                        final SubLObject bindings_assertion3 = removal_genlinverse_gaf_iterator_internal(asent, gaf3);
                        if (removal_modules_genlpreds_lookup.NIL != bindings_assertion3) {
                            result = (SubLObject)ConsesLow.cons(bindings_assertion3, result);
                        }
                    }
                    cdolist_list_var = cdolist_list_var.rest();
                    gaf3 = cdolist_list_var.first();
                }
            }
            else {
                kb_mapping_macros.do_gli_method_error(l_index, method);
            }
        }
        finally {
            control_vars.$inference_sense$.rebind(_prev_bind_3, thread);
            control_vars.$inference_literal$.rebind(_prev_bind_2, thread);
            pred_relevance_macros.$relevant_pred_function$.rebind(_prev_bind_0, thread);
        }
        if (removal_modules_genlpreds_lookup.NIL != result) {
            return iteration.new_list_iterator(result);
        }
        return (SubLObject)removal_modules_genlpreds_lookup.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/modules/removal/removal-modules-genlpreds-lookup.lisp", position = 16000L)
    public static SubLObject best_genlinverse_gaf_lookup_index(final SubLObject asent, final SubLObject sense) {
        return kb_indexing.best_gaf_lookup_index(obfuscate_predicate(removal_modules_symmetry.symmetric_asent(asent)), enumeration_types.sense_truth(sense), (SubLObject)removal_modules_genlpreds_lookup.$list13);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/modules/removal/removal-modules-genlpreds-lookup.lisp", position = 16241L)
    public static SubLObject num_best_genlinverse_gaf_lookup_index(final SubLObject asent, final SubLObject sense) {
        return num_best_genlpreds_or_inverse_gaf_lookup_index(asent, sense, (SubLObject)removal_modules_genlpreds_lookup.T);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/modules/removal/removal-modules-genlpreds-lookup.lisp", position = 16382L)
    public static SubLObject removal_genlinverse_gaf_iterator_internal(final SubLObject asent, final SubLObject assertion) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        if (removal_modules_genlpreds_lookup.NIL != backward_utilities.direction_is_relevant(assertion)) {
            final SubLObject assertion_asent = assertions_high.gaf_formula(assertion);
            final SubLObject ass_pred = cycl_utilities.atomic_sentence_predicate(assertion_asent);
            final SubLObject inf_pred = cycl_utilities.atomic_sentence_predicate(asent);
            if (!ass_pred.eql(inf_pred)) {
                final SubLObject symmetric_asent = removal_modules_symmetry.symmetric_asent(asent);
                thread.resetMultipleValues();
                final SubLObject v_bindings = unification_utilities.gaf_asent_args_unify(symmetric_asent, assertion_asent, (SubLObject)removal_modules_genlpreds_lookup.T, (SubLObject)removal_modules_genlpreds_lookup.T);
                final SubLObject gaf_asent = thread.secondMultipleValue();
                final SubLObject unify_justification = thread.thirdMultipleValue();
                thread.resetMultipleValues();
                if (removal_modules_genlpreds_lookup.NIL != v_bindings) {
                    return (SubLObject)ConsesLow.list(v_bindings, assertion);
                }
            }
        }
        return (SubLObject)removal_modules_genlpreds_lookup.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/modules/removal/removal-modules-genlpreds-lookup.lisp", position = 17033L)
    public static SubLObject removal_genlinverse_lookup_supports(final SubLObject asent, final SubLObject assertion, final SubLObject sense) {
        final SubLObject ass_pred = cycl_utilities.atomic_sentence_predicate(assertions_high.gaf_formula(assertion));
        final SubLObject inf_pred = cycl_utilities.atomic_sentence_predicate(asent);
        final SubLObject spec_pred = (removal_modules_genlpreds_lookup.$kw0$POS == sense) ? ass_pred : inf_pred;
        final SubLObject genl_pred = (removal_modules_genlpreds_lookup.$kw0$POS == sense) ? inf_pred : ass_pred;
        final SubLObject hl_support = removal_module_utilities.make_genl_inverse_support(spec_pred, genl_pred);
        return (SubLObject)ConsesLow.list(assertion, hl_support);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/modules/removal/removal-modules-genlpreds-lookup.lisp", position = 17447L)
    public static SubLObject removal_genlinverse_pred_index_pos_cost(final SubLObject asent, SubLObject sense) {
        if (sense == removal_modules_genlpreds_lookup.UNPROVIDED) {
            sense = (SubLObject)removal_modules_genlpreds_lookup.NIL;
        }
        if (removal_modules_genlpreds_lookup.NIL != variables.fully_bound_p(asent)) {
            return control_vars.$typical_hl_module_check_cost$.getGlobalValue();
        }
        return num_best_genlinverse_gaf_lookup_index(asent, (SubLObject)removal_modules_genlpreds_lookup.$kw0$POS);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/modules/removal/removal-modules-genlpreds-lookup.lisp", position = 18179L)
    public static SubLObject removal_genlinverse_pred_index_pos_iterator(final SubLObject asent) {
        return removal_genlinverse_pred_index_iterator(asent, (SubLObject)removal_modules_genlpreds_lookup.$kw0$POS);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/modules/removal/removal-modules-genlpreds-lookup.lisp", position = 19311L)
    public static SubLObject removal_genlinverse_pred_index_neg_completeness(final SubLObject asent) {
        if (removal_modules_genlpreds_lookup.NIL != removal_module_utilities.negation_grossly_incompleteP(asent, (SubLObject)removal_modules_genlpreds_lookup.$kw3$NEG)) {
            return (SubLObject)removal_modules_genlpreds_lookup.$kw4$GROSSLY_INCOMPLETE;
        }
        return (SubLObject)removal_modules_genlpreds_lookup.$kw5$INCOMPLETE;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/modules/removal/removal-modules-genlpreds-lookup.lisp", position = 19493L)
    public static SubLObject removal_genlinverse_pred_index_neg_cost(final SubLObject asent, SubLObject sense) {
        if (sense == removal_modules_genlpreds_lookup.UNPROVIDED) {
            sense = (SubLObject)removal_modules_genlpreds_lookup.NIL;
        }
        if (removal_modules_genlpreds_lookup.NIL != variables.fully_bound_p(asent)) {
            return control_vars.$typical_hl_module_check_cost$.getGlobalValue();
        }
        final SubLObject predicate = cycl_utilities.atomic_sentence_predicate(asent);
        final SubLObject genl_preds = inference_trampolines.inference_all_genl_inverses(predicate);
        SubLObject cost = (SubLObject)removal_modules_genlpreds_lookup.ZERO_INTEGER;
        SubLObject cdolist_list_var = genl_preds;
        SubLObject genl_pred = (SubLObject)removal_modules_genlpreds_lookup.NIL;
        genl_pred = cdolist_list_var.first();
        while (removal_modules_genlpreds_lookup.NIL != cdolist_list_var) {
            cost = Numbers.add(cost, kb_indexing.num_predicate_extent_index(genl_pred, (SubLObject)removal_modules_genlpreds_lookup.UNPROVIDED));
            cdolist_list_var = cdolist_list_var.rest();
            genl_pred = cdolist_list_var.first();
        }
        return cost;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/modules/removal/removal-modules-genlpreds-lookup.lisp", position = 19914L)
    public static SubLObject removal_genlinverse_pred_index_neg_iterator(final SubLObject asent) {
        return removal_genlinverse_pred_index_iterator(asent, (SubLObject)removal_modules_genlpreds_lookup.$kw3$NEG);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/modules/removal/removal-modules-genlpreds-lookup.lisp", position = 21113L)
    public static SubLObject removal_genlinverse_pred_index_iterator(final SubLObject asent, final SubLObject sense) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject result = (SubLObject)removal_modules_genlpreds_lookup.NIL;
        final SubLObject predicate = cycl_utilities.atomic_sentence_predicate(asent);
        SubLObject index_predicates = (SubLObject)removal_modules_genlpreds_lookup.NIL;
        if (removal_modules_genlpreds_lookup.$kw0$POS == sense) {
            index_predicates = inference_trampolines.inference_all_spec_inverses(predicate);
        }
        else {
            index_predicates = inference_trampolines.inference_all_genl_inverses(predicate);
        }
        SubLObject cdolist_list_var = index_predicates;
        SubLObject index_predicate = (SubLObject)removal_modules_genlpreds_lookup.NIL;
        index_predicate = cdolist_list_var.first();
        while (removal_modules_genlpreds_lookup.NIL != cdolist_list_var) {
            if (!index_predicate.eql(predicate)) {
                final SubLObject index_asent = el_utilities.replace_formula_arg((SubLObject)removal_modules_genlpreds_lookup.ZERO_INTEGER, index_predicate, asent);
                final SubLObject l_index = kb_indexing.best_gaf_lookup_index(index_asent, enumeration_types.sense_truth(sense), (SubLObject)removal_modules_genlpreds_lookup.NIL);
                final SubLObject pcase_var;
                final SubLObject method = pcase_var = kb_mapping_macros.do_gli_extract_method(l_index);
                if (pcase_var.eql((SubLObject)removal_modules_genlpreds_lookup.$kw8$GAF_ARG)) {
                    thread.resetMultipleValues();
                    final SubLObject v_term = kb_mapping_macros.do_gli_vga_extract_keys(l_index);
                    final SubLObject argnum = thread.secondMultipleValue();
                    final SubLObject predicate_$86 = thread.thirdMultipleValue();
                    thread.resetMultipleValues();
                    if (removal_modules_genlpreds_lookup.NIL != argnum) {
                        if (removal_modules_genlpreds_lookup.NIL != predicate_$86) {
                            final SubLObject pred_var = predicate_$86;
                            if (removal_modules_genlpreds_lookup.NIL != kb_mapping_macros.do_gaf_arg_index_key_validator(v_term, argnum, pred_var)) {
                                final SubLObject iterator_var = kb_mapping_macros.new_gaf_arg_final_index_spec_iterator(v_term, argnum, pred_var);
                                SubLObject done_var = (SubLObject)removal_modules_genlpreds_lookup.NIL;
                                final SubLObject token_var = (SubLObject)removal_modules_genlpreds_lookup.NIL;
                                while (removal_modules_genlpreds_lookup.NIL == done_var) {
                                    final SubLObject final_index_spec = iteration.iteration_next_without_values_macro_helper(iterator_var, token_var);
                                    final SubLObject valid = (SubLObject)SubLObjectFactory.makeBoolean(!token_var.eql(final_index_spec));
                                    if (removal_modules_genlpreds_lookup.NIL != valid) {
                                        SubLObject final_index_iterator = (SubLObject)removal_modules_genlpreds_lookup.NIL;
                                        try {
                                            final_index_iterator = kb_mapping_macros.new_final_index_iterator(final_index_spec, (SubLObject)removal_modules_genlpreds_lookup.$kw9$GAF, enumeration_types.sense_truth(sense), (SubLObject)removal_modules_genlpreds_lookup.NIL);
                                            SubLObject done_var_$87 = (SubLObject)removal_modules_genlpreds_lookup.NIL;
                                            final SubLObject token_var_$88 = (SubLObject)removal_modules_genlpreds_lookup.NIL;
                                            while (removal_modules_genlpreds_lookup.NIL == done_var_$87) {
                                                final SubLObject assertion = iteration.iteration_next_without_values_macro_helper(final_index_iterator, token_var_$88);
                                                final SubLObject valid_$89 = (SubLObject)SubLObjectFactory.makeBoolean(!token_var_$88.eql(assertion));
                                                if (removal_modules_genlpreds_lookup.NIL != valid_$89) {
                                                    final SubLObject var;
                                                    final SubLObject bindings_assertion = var = removal_genlinverse_gaf_iterator_internal(asent, assertion);
                                                    if (removal_modules_genlpreds_lookup.NIL != var) {
                                                        result = (SubLObject)ConsesLow.cons(var, result);
                                                    }
                                                }
                                                done_var_$87 = (SubLObject)SubLObjectFactory.makeBoolean(removal_modules_genlpreds_lookup.NIL == valid_$89);
                                            }
                                        }
                                        finally {
                                            final SubLObject _prev_bind_0 = Threads.$is_thread_performing_cleanupP$.currentBinding(thread);
                                            try {
                                                Threads.$is_thread_performing_cleanupP$.bind((SubLObject)removal_modules_genlpreds_lookup.T, thread);
                                                final SubLObject _values = Values.getValuesAsVector();
                                                if (removal_modules_genlpreds_lookup.NIL != final_index_iterator) {
                                                    kb_mapping_macros.destroy_final_index_iterator(final_index_iterator);
                                                }
                                                Values.restoreValuesFromVector(_values);
                                            }
                                            finally {
                                                Threads.$is_thread_performing_cleanupP$.rebind(_prev_bind_0, thread);
                                            }
                                        }
                                    }
                                    done_var = (SubLObject)SubLObjectFactory.makeBoolean(removal_modules_genlpreds_lookup.NIL == valid);
                                }
                            }
                        }
                        else {
                            final SubLObject pred_var = (SubLObject)removal_modules_genlpreds_lookup.NIL;
                            if (removal_modules_genlpreds_lookup.NIL != kb_mapping_macros.do_gaf_arg_index_key_validator(v_term, argnum, pred_var)) {
                                final SubLObject iterator_var = kb_mapping_macros.new_gaf_arg_final_index_spec_iterator(v_term, argnum, pred_var);
                                SubLObject done_var = (SubLObject)removal_modules_genlpreds_lookup.NIL;
                                final SubLObject token_var = (SubLObject)removal_modules_genlpreds_lookup.NIL;
                                while (removal_modules_genlpreds_lookup.NIL == done_var) {
                                    final SubLObject final_index_spec = iteration.iteration_next_without_values_macro_helper(iterator_var, token_var);
                                    final SubLObject valid = (SubLObject)SubLObjectFactory.makeBoolean(!token_var.eql(final_index_spec));
                                    if (removal_modules_genlpreds_lookup.NIL != valid) {
                                        SubLObject final_index_iterator = (SubLObject)removal_modules_genlpreds_lookup.NIL;
                                        try {
                                            final_index_iterator = kb_mapping_macros.new_final_index_iterator(final_index_spec, (SubLObject)removal_modules_genlpreds_lookup.$kw9$GAF, enumeration_types.sense_truth(sense), (SubLObject)removal_modules_genlpreds_lookup.NIL);
                                            SubLObject done_var_$88 = (SubLObject)removal_modules_genlpreds_lookup.NIL;
                                            final SubLObject token_var_$89 = (SubLObject)removal_modules_genlpreds_lookup.NIL;
                                            while (removal_modules_genlpreds_lookup.NIL == done_var_$88) {
                                                final SubLObject assertion = iteration.iteration_next_without_values_macro_helper(final_index_iterator, token_var_$89);
                                                final SubLObject valid_$90 = (SubLObject)SubLObjectFactory.makeBoolean(!token_var_$89.eql(assertion));
                                                if (removal_modules_genlpreds_lookup.NIL != valid_$90) {
                                                    final SubLObject var;
                                                    final SubLObject bindings_assertion = var = removal_genlinverse_gaf_iterator_internal(asent, assertion);
                                                    if (removal_modules_genlpreds_lookup.NIL != var) {
                                                        result = (SubLObject)ConsesLow.cons(var, result);
                                                    }
                                                }
                                                done_var_$88 = (SubLObject)SubLObjectFactory.makeBoolean(removal_modules_genlpreds_lookup.NIL == valid_$90);
                                            }
                                        }
                                        finally {
                                            final SubLObject _prev_bind_2 = Threads.$is_thread_performing_cleanupP$.currentBinding(thread);
                                            try {
                                                Threads.$is_thread_performing_cleanupP$.bind((SubLObject)removal_modules_genlpreds_lookup.T, thread);
                                                final SubLObject _values2 = Values.getValuesAsVector();
                                                if (removal_modules_genlpreds_lookup.NIL != final_index_iterator) {
                                                    kb_mapping_macros.destroy_final_index_iterator(final_index_iterator);
                                                }
                                                Values.restoreValuesFromVector(_values2);
                                            }
                                            finally {
                                                Threads.$is_thread_performing_cleanupP$.rebind(_prev_bind_2, thread);
                                            }
                                        }
                                    }
                                    done_var = (SubLObject)SubLObjectFactory.makeBoolean(removal_modules_genlpreds_lookup.NIL == valid);
                                }
                            }
                        }
                    }
                    else if (removal_modules_genlpreds_lookup.NIL != predicate_$86) {
                        final SubLObject pred_var = predicate_$86;
                        if (removal_modules_genlpreds_lookup.NIL != kb_mapping_macros.do_gaf_arg_index_key_validator(v_term, (SubLObject)removal_modules_genlpreds_lookup.NIL, pred_var)) {
                            final SubLObject iterator_var = kb_mapping_macros.new_gaf_arg_final_index_spec_iterator(v_term, (SubLObject)removal_modules_genlpreds_lookup.NIL, pred_var);
                            SubLObject done_var = (SubLObject)removal_modules_genlpreds_lookup.NIL;
                            final SubLObject token_var = (SubLObject)removal_modules_genlpreds_lookup.NIL;
                            while (removal_modules_genlpreds_lookup.NIL == done_var) {
                                final SubLObject final_index_spec = iteration.iteration_next_without_values_macro_helper(iterator_var, token_var);
                                final SubLObject valid = (SubLObject)SubLObjectFactory.makeBoolean(!token_var.eql(final_index_spec));
                                if (removal_modules_genlpreds_lookup.NIL != valid) {
                                    SubLObject final_index_iterator = (SubLObject)removal_modules_genlpreds_lookup.NIL;
                                    try {
                                        final_index_iterator = kb_mapping_macros.new_final_index_iterator(final_index_spec, (SubLObject)removal_modules_genlpreds_lookup.$kw9$GAF, enumeration_types.sense_truth(sense), (SubLObject)removal_modules_genlpreds_lookup.NIL);
                                        SubLObject done_var_$89 = (SubLObject)removal_modules_genlpreds_lookup.NIL;
                                        final SubLObject token_var_$90 = (SubLObject)removal_modules_genlpreds_lookup.NIL;
                                        while (removal_modules_genlpreds_lookup.NIL == done_var_$89) {
                                            final SubLObject assertion = iteration.iteration_next_without_values_macro_helper(final_index_iterator, token_var_$90);
                                            final SubLObject valid_$91 = (SubLObject)SubLObjectFactory.makeBoolean(!token_var_$90.eql(assertion));
                                            if (removal_modules_genlpreds_lookup.NIL != valid_$91) {
                                                final SubLObject var;
                                                final SubLObject bindings_assertion = var = removal_genlinverse_gaf_iterator_internal(asent, assertion);
                                                if (removal_modules_genlpreds_lookup.NIL != var) {
                                                    result = (SubLObject)ConsesLow.cons(var, result);
                                                }
                                            }
                                            done_var_$89 = (SubLObject)SubLObjectFactory.makeBoolean(removal_modules_genlpreds_lookup.NIL == valid_$91);
                                        }
                                    }
                                    finally {
                                        final SubLObject _prev_bind_3 = Threads.$is_thread_performing_cleanupP$.currentBinding(thread);
                                        try {
                                            Threads.$is_thread_performing_cleanupP$.bind((SubLObject)removal_modules_genlpreds_lookup.T, thread);
                                            final SubLObject _values3 = Values.getValuesAsVector();
                                            if (removal_modules_genlpreds_lookup.NIL != final_index_iterator) {
                                                kb_mapping_macros.destroy_final_index_iterator(final_index_iterator);
                                            }
                                            Values.restoreValuesFromVector(_values3);
                                        }
                                        finally {
                                            Threads.$is_thread_performing_cleanupP$.rebind(_prev_bind_3, thread);
                                        }
                                    }
                                }
                                done_var = (SubLObject)SubLObjectFactory.makeBoolean(removal_modules_genlpreds_lookup.NIL == valid);
                            }
                        }
                    }
                    else {
                        final SubLObject pred_var = (SubLObject)removal_modules_genlpreds_lookup.NIL;
                        if (removal_modules_genlpreds_lookup.NIL != kb_mapping_macros.do_gaf_arg_index_key_validator(v_term, (SubLObject)removal_modules_genlpreds_lookup.NIL, pred_var)) {
                            final SubLObject iterator_var = kb_mapping_macros.new_gaf_arg_final_index_spec_iterator(v_term, (SubLObject)removal_modules_genlpreds_lookup.NIL, pred_var);
                            SubLObject done_var = (SubLObject)removal_modules_genlpreds_lookup.NIL;
                            final SubLObject token_var = (SubLObject)removal_modules_genlpreds_lookup.NIL;
                            while (removal_modules_genlpreds_lookup.NIL == done_var) {
                                final SubLObject final_index_spec = iteration.iteration_next_without_values_macro_helper(iterator_var, token_var);
                                final SubLObject valid = (SubLObject)SubLObjectFactory.makeBoolean(!token_var.eql(final_index_spec));
                                if (removal_modules_genlpreds_lookup.NIL != valid) {
                                    SubLObject final_index_iterator = (SubLObject)removal_modules_genlpreds_lookup.NIL;
                                    try {
                                        final_index_iterator = kb_mapping_macros.new_final_index_iterator(final_index_spec, (SubLObject)removal_modules_genlpreds_lookup.$kw9$GAF, enumeration_types.sense_truth(sense), (SubLObject)removal_modules_genlpreds_lookup.NIL);
                                        SubLObject done_var_$90 = (SubLObject)removal_modules_genlpreds_lookup.NIL;
                                        final SubLObject token_var_$91 = (SubLObject)removal_modules_genlpreds_lookup.NIL;
                                        while (removal_modules_genlpreds_lookup.NIL == done_var_$90) {
                                            final SubLObject assertion = iteration.iteration_next_without_values_macro_helper(final_index_iterator, token_var_$91);
                                            final SubLObject valid_$92 = (SubLObject)SubLObjectFactory.makeBoolean(!token_var_$91.eql(assertion));
                                            if (removal_modules_genlpreds_lookup.NIL != valid_$92) {
                                                final SubLObject var;
                                                final SubLObject bindings_assertion = var = removal_genlinverse_gaf_iterator_internal(asent, assertion);
                                                if (removal_modules_genlpreds_lookup.NIL != var) {
                                                    result = (SubLObject)ConsesLow.cons(var, result);
                                                }
                                            }
                                            done_var_$90 = (SubLObject)SubLObjectFactory.makeBoolean(removal_modules_genlpreds_lookup.NIL == valid_$92);
                                        }
                                    }
                                    finally {
                                        final SubLObject _prev_bind_4 = Threads.$is_thread_performing_cleanupP$.currentBinding(thread);
                                        try {
                                            Threads.$is_thread_performing_cleanupP$.bind((SubLObject)removal_modules_genlpreds_lookup.T, thread);
                                            final SubLObject _values4 = Values.getValuesAsVector();
                                            if (removal_modules_genlpreds_lookup.NIL != final_index_iterator) {
                                                kb_mapping_macros.destroy_final_index_iterator(final_index_iterator);
                                            }
                                            Values.restoreValuesFromVector(_values4);
                                        }
                                        finally {
                                            Threads.$is_thread_performing_cleanupP$.rebind(_prev_bind_4, thread);
                                        }
                                    }
                                }
                                done_var = (SubLObject)SubLObjectFactory.makeBoolean(removal_modules_genlpreds_lookup.NIL == valid);
                            }
                        }
                    }
                }
                else if (pcase_var.eql((SubLObject)removal_modules_genlpreds_lookup.$kw10$PREDICATE_EXTENT)) {
                    final SubLObject pred_var2 = kb_mapping_macros.do_gli_vpe_extract_key(l_index);
                    if (removal_modules_genlpreds_lookup.NIL != kb_mapping_macros.do_predicate_extent_index_key_validator(pred_var2)) {
                        final SubLObject str = (SubLObject)removal_modules_genlpreds_lookup.NIL;
                        final SubLObject _prev_bind_5 = utilities_macros.$progress_start_time$.currentBinding(thread);
                        final SubLObject _prev_bind_6 = utilities_macros.$progress_last_pacification_time$.currentBinding(thread);
                        final SubLObject _prev_bind_7 = utilities_macros.$progress_elapsed_seconds_for_notification$.currentBinding(thread);
                        final SubLObject _prev_bind_8 = utilities_macros.$progress_notification_count$.currentBinding(thread);
                        final SubLObject _prev_bind_9 = utilities_macros.$progress_pacifications_since_last_nl$.currentBinding(thread);
                        final SubLObject _prev_bind_10 = utilities_macros.$progress_count$.currentBinding(thread);
                        final SubLObject _prev_bind_11 = utilities_macros.$is_noting_progressP$.currentBinding(thread);
                        final SubLObject _prev_bind_12 = utilities_macros.$silent_progressP$.currentBinding(thread);
                        try {
                            utilities_macros.$progress_start_time$.bind(Time.get_universal_time(), thread);
                            utilities_macros.$progress_last_pacification_time$.bind(utilities_macros.$progress_start_time$.getDynamicValue(thread), thread);
                            utilities_macros.$progress_elapsed_seconds_for_notification$.bind(utilities_macros.$suppress_all_progress_faster_than_seconds$.getDynamicValue(thread), thread);
                            utilities_macros.$progress_notification_count$.bind((SubLObject)removal_modules_genlpreds_lookup.ZERO_INTEGER, thread);
                            utilities_macros.$progress_pacifications_since_last_nl$.bind((SubLObject)removal_modules_genlpreds_lookup.ZERO_INTEGER, thread);
                            utilities_macros.$progress_count$.bind((SubLObject)removal_modules_genlpreds_lookup.ZERO_INTEGER, thread);
                            utilities_macros.$is_noting_progressP$.bind((SubLObject)removal_modules_genlpreds_lookup.T, thread);
                            utilities_macros.$silent_progressP$.bind((SubLObject)((removal_modules_genlpreds_lookup.NIL != str) ? utilities_macros.$silent_progressP$.getDynamicValue(thread) : removal_modules_genlpreds_lookup.T), thread);
                            utilities_macros.noting_progress_preamble(str);
                            final SubLObject iterator_var2 = kb_mapping_macros.new_predicate_extent_final_index_spec_iterator(pred_var2);
                            SubLObject done_var2 = (SubLObject)removal_modules_genlpreds_lookup.NIL;
                            final SubLObject token_var2 = (SubLObject)removal_modules_genlpreds_lookup.NIL;
                            while (removal_modules_genlpreds_lookup.NIL == done_var2) {
                                final SubLObject final_index_spec2 = iteration.iteration_next_without_values_macro_helper(iterator_var2, token_var2);
                                final SubLObject valid2 = (SubLObject)SubLObjectFactory.makeBoolean(!token_var2.eql(final_index_spec2));
                                if (removal_modules_genlpreds_lookup.NIL != valid2) {
                                    utilities_macros.note_progress();
                                    SubLObject final_index_iterator2 = (SubLObject)removal_modules_genlpreds_lookup.NIL;
                                    try {
                                        final_index_iterator2 = kb_mapping_macros.new_final_index_iterator(final_index_spec2, (SubLObject)removal_modules_genlpreds_lookup.$kw9$GAF, enumeration_types.sense_truth(sense), (SubLObject)removal_modules_genlpreds_lookup.NIL);
                                        SubLObject done_var_$91 = (SubLObject)removal_modules_genlpreds_lookup.NIL;
                                        final SubLObject token_var_$92 = (SubLObject)removal_modules_genlpreds_lookup.NIL;
                                        while (removal_modules_genlpreds_lookup.NIL == done_var_$91) {
                                            final SubLObject assertion2 = iteration.iteration_next_without_values_macro_helper(final_index_iterator2, token_var_$92);
                                            final SubLObject valid_$93 = (SubLObject)SubLObjectFactory.makeBoolean(!token_var_$92.eql(assertion2));
                                            if (removal_modules_genlpreds_lookup.NIL != valid_$93) {
                                                final SubLObject var2;
                                                final SubLObject bindings_assertion2 = var2 = removal_genlinverse_gaf_iterator_internal(asent, assertion2);
                                                if (removal_modules_genlpreds_lookup.NIL != var2) {
                                                    result = (SubLObject)ConsesLow.cons(var2, result);
                                                }
                                            }
                                            done_var_$91 = (SubLObject)SubLObjectFactory.makeBoolean(removal_modules_genlpreds_lookup.NIL == valid_$93);
                                        }
                                    }
                                    finally {
                                        final SubLObject _prev_bind_0_$102 = Threads.$is_thread_performing_cleanupP$.currentBinding(thread);
                                        try {
                                            Threads.$is_thread_performing_cleanupP$.bind((SubLObject)removal_modules_genlpreds_lookup.T, thread);
                                            final SubLObject _values5 = Values.getValuesAsVector();
                                            if (removal_modules_genlpreds_lookup.NIL != final_index_iterator2) {
                                                kb_mapping_macros.destroy_final_index_iterator(final_index_iterator2);
                                            }
                                            Values.restoreValuesFromVector(_values5);
                                        }
                                        finally {
                                            Threads.$is_thread_performing_cleanupP$.rebind(_prev_bind_0_$102, thread);
                                        }
                                    }
                                }
                                done_var2 = (SubLObject)SubLObjectFactory.makeBoolean(removal_modules_genlpreds_lookup.NIL == valid2);
                            }
                            utilities_macros.noting_progress_postamble();
                        }
                        finally {
                            utilities_macros.$silent_progressP$.rebind(_prev_bind_12, thread);
                            utilities_macros.$is_noting_progressP$.rebind(_prev_bind_11, thread);
                            utilities_macros.$progress_count$.rebind(_prev_bind_10, thread);
                            utilities_macros.$progress_pacifications_since_last_nl$.rebind(_prev_bind_9, thread);
                            utilities_macros.$progress_notification_count$.rebind(_prev_bind_8, thread);
                            utilities_macros.$progress_elapsed_seconds_for_notification$.rebind(_prev_bind_7, thread);
                            utilities_macros.$progress_last_pacification_time$.rebind(_prev_bind_6, thread);
                            utilities_macros.$progress_start_time$.rebind(_prev_bind_5, thread);
                        }
                    }
                }
                else if (pcase_var.eql((SubLObject)removal_modules_genlpreds_lookup.$kw11$OVERLAP)) {
                    SubLObject cdolist_list_var_$103 = virtual_indexing.gather_overlap_index(kb_mapping_macros.do_gli_vo_extract_key(l_index), (SubLObject)removal_modules_genlpreds_lookup.UNPROVIDED);
                    SubLObject assertion3 = (SubLObject)removal_modules_genlpreds_lookup.NIL;
                    assertion3 = cdolist_list_var_$103.first();
                    while (removal_modules_genlpreds_lookup.NIL != cdolist_list_var_$103) {
                        if (removal_modules_genlpreds_lookup.NIL == enumeration_types.sense_truth(sense) || removal_modules_genlpreds_lookup.NIL != assertions_high.assertion_has_truth(assertion3, enumeration_types.sense_truth(sense))) {
                            final SubLObject var3;
                            final SubLObject bindings_assertion3 = var3 = removal_genlinverse_gaf_iterator_internal(asent, assertion3);
                            if (removal_modules_genlpreds_lookup.NIL != var3) {
                                result = (SubLObject)ConsesLow.cons(var3, result);
                            }
                        }
                        cdolist_list_var_$103 = cdolist_list_var_$103.rest();
                        assertion3 = cdolist_list_var_$103.first();
                    }
                }
                else {
                    kb_mapping_macros.do_gli_method_error(l_index, method);
                }
            }
            cdolist_list_var = cdolist_list_var.rest();
            index_predicate = cdolist_list_var.first();
        }
        if (removal_modules_genlpreds_lookup.NIL != result) {
            return iteration.new_list_iterator(result);
        }
        return (SubLObject)removal_modules_genlpreds_lookup.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/modules/removal/removal-modules-genlpreds-lookup.lisp", position = 21918L)
    public static SubLObject removal_negationpreds_lookup_completeness(final SubLObject asent) {
        if (removal_modules_genlpreds_lookup.NIL != removal_module_utilities.negation_grossly_incompleteP(asent, (SubLObject)removal_modules_genlpreds_lookup.$kw3$NEG)) {
            return (SubLObject)removal_modules_genlpreds_lookup.$kw4$GROSSLY_INCOMPLETE;
        }
        return (SubLObject)removal_modules_genlpreds_lookup.$kw5$INCOMPLETE;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/modules/removal/removal-modules-genlpreds-lookup.lisp", position = 22314L)
    public static SubLObject removal_negationpreds_lookup_cost(final SubLObject asent, SubLObject sense) {
        if (sense == removal_modules_genlpreds_lookup.UNPROVIDED) {
            sense = (SubLObject)removal_modules_genlpreds_lookup.NIL;
        }
        if (removal_modules_genlpreds_lookup.NIL != variables.fully_bound_p(asent)) {
            return control_vars.$typical_hl_module_check_cost$.getGlobalValue();
        }
        return Numbers.multiply((SubLObject)removal_modules_genlpreds_lookup.TWO_INTEGER, removal_genlpreds_lookup_neg_cost(asent, (SubLObject)removal_modules_genlpreds_lookup.UNPROVIDED));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/modules/removal/removal-modules-genlpreds-lookup.lisp", position = 22550L)
    public static SubLObject removal_negationpreds_lookup_iterator(final SubLObject asent) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject result = (SubLObject)removal_modules_genlpreds_lookup.NIL;
        final SubLObject obfuscated_asent = obfuscate_predicate(asent);
        final SubLObject _prev_bind_0 = control_vars.$inference_literal$.currentBinding(thread);
        final SubLObject _prev_bind_2 = pred_relevance_macros.$relevant_pred_function$.currentBinding(thread);
        try {
            control_vars.$inference_literal$.bind(asent, thread);
            pred_relevance_macros.$relevant_pred_function$.bind((SubLObject)removal_modules_genlpreds_lookup.$sym41$INFERENCE_NEGATION_PREDICATE_, thread);
            final SubLObject l_index = kb_indexing.best_gaf_lookup_index(obfuscated_asent, (SubLObject)removal_modules_genlpreds_lookup.$kw42$TRUE, (SubLObject)removal_modules_genlpreds_lookup.NIL);
            final SubLObject pcase_var;
            final SubLObject method = pcase_var = kb_mapping_macros.do_gli_extract_method(l_index);
            if (pcase_var.eql((SubLObject)removal_modules_genlpreds_lookup.$kw8$GAF_ARG)) {
                thread.resetMultipleValues();
                final SubLObject v_term = kb_mapping_macros.do_gli_vga_extract_keys(l_index);
                final SubLObject argnum = thread.secondMultipleValue();
                final SubLObject predicate = thread.thirdMultipleValue();
                thread.resetMultipleValues();
                if (removal_modules_genlpreds_lookup.NIL != argnum) {
                    if (removal_modules_genlpreds_lookup.NIL != predicate) {
                        final SubLObject pred_var = predicate;
                        if (removal_modules_genlpreds_lookup.NIL != kb_mapping_macros.do_gaf_arg_index_key_validator(v_term, argnum, pred_var)) {
                            final SubLObject iterator_var = kb_mapping_macros.new_gaf_arg_final_index_spec_iterator(v_term, argnum, pred_var);
                            SubLObject done_var = (SubLObject)removal_modules_genlpreds_lookup.NIL;
                            final SubLObject token_var = (SubLObject)removal_modules_genlpreds_lookup.NIL;
                            while (removal_modules_genlpreds_lookup.NIL == done_var) {
                                final SubLObject final_index_spec = iteration.iteration_next_without_values_macro_helper(iterator_var, token_var);
                                final SubLObject valid = (SubLObject)SubLObjectFactory.makeBoolean(!token_var.eql(final_index_spec));
                                if (removal_modules_genlpreds_lookup.NIL != valid) {
                                    SubLObject final_index_iterator = (SubLObject)removal_modules_genlpreds_lookup.NIL;
                                    try {
                                        final_index_iterator = kb_mapping_macros.new_final_index_iterator(final_index_spec, (SubLObject)removal_modules_genlpreds_lookup.$kw9$GAF, (SubLObject)removal_modules_genlpreds_lookup.$kw42$TRUE, (SubLObject)removal_modules_genlpreds_lookup.NIL);
                                        SubLObject done_var_$104 = (SubLObject)removal_modules_genlpreds_lookup.NIL;
                                        final SubLObject token_var_$105 = (SubLObject)removal_modules_genlpreds_lookup.NIL;
                                        while (removal_modules_genlpreds_lookup.NIL == done_var_$104) {
                                            final SubLObject gaf = iteration.iteration_next_without_values_macro_helper(final_index_iterator, token_var_$105);
                                            final SubLObject valid_$106 = (SubLObject)SubLObjectFactory.makeBoolean(!token_var_$105.eql(gaf));
                                            if (removal_modules_genlpreds_lookup.NIL != valid_$106) {
                                                final SubLObject var;
                                                final SubLObject bindings_assertion = var = removal_negationpreds_gaf_iterator_internal(gaf);
                                                if (removal_modules_genlpreds_lookup.NIL != var) {
                                                    result = (SubLObject)ConsesLow.cons(var, result);
                                                }
                                            }
                                            done_var_$104 = (SubLObject)SubLObjectFactory.makeBoolean(removal_modules_genlpreds_lookup.NIL == valid_$106);
                                        }
                                    }
                                    finally {
                                        final SubLObject _prev_bind_0_$107 = Threads.$is_thread_performing_cleanupP$.currentBinding(thread);
                                        try {
                                            Threads.$is_thread_performing_cleanupP$.bind((SubLObject)removal_modules_genlpreds_lookup.T, thread);
                                            final SubLObject _values = Values.getValuesAsVector();
                                            if (removal_modules_genlpreds_lookup.NIL != final_index_iterator) {
                                                kb_mapping_macros.destroy_final_index_iterator(final_index_iterator);
                                            }
                                            Values.restoreValuesFromVector(_values);
                                        }
                                        finally {
                                            Threads.$is_thread_performing_cleanupP$.rebind(_prev_bind_0_$107, thread);
                                        }
                                    }
                                }
                                done_var = (SubLObject)SubLObjectFactory.makeBoolean(removal_modules_genlpreds_lookup.NIL == valid);
                            }
                        }
                    }
                    else {
                        final SubLObject pred_var = (SubLObject)removal_modules_genlpreds_lookup.NIL;
                        if (removal_modules_genlpreds_lookup.NIL != kb_mapping_macros.do_gaf_arg_index_key_validator(v_term, argnum, pred_var)) {
                            final SubLObject iterator_var = kb_mapping_macros.new_gaf_arg_final_index_spec_iterator(v_term, argnum, pred_var);
                            SubLObject done_var = (SubLObject)removal_modules_genlpreds_lookup.NIL;
                            final SubLObject token_var = (SubLObject)removal_modules_genlpreds_lookup.NIL;
                            while (removal_modules_genlpreds_lookup.NIL == done_var) {
                                final SubLObject final_index_spec = iteration.iteration_next_without_values_macro_helper(iterator_var, token_var);
                                final SubLObject valid = (SubLObject)SubLObjectFactory.makeBoolean(!token_var.eql(final_index_spec));
                                if (removal_modules_genlpreds_lookup.NIL != valid) {
                                    SubLObject final_index_iterator = (SubLObject)removal_modules_genlpreds_lookup.NIL;
                                    try {
                                        final_index_iterator = kb_mapping_macros.new_final_index_iterator(final_index_spec, (SubLObject)removal_modules_genlpreds_lookup.$kw9$GAF, (SubLObject)removal_modules_genlpreds_lookup.$kw42$TRUE, (SubLObject)removal_modules_genlpreds_lookup.NIL);
                                        SubLObject done_var_$105 = (SubLObject)removal_modules_genlpreds_lookup.NIL;
                                        final SubLObject token_var_$106 = (SubLObject)removal_modules_genlpreds_lookup.NIL;
                                        while (removal_modules_genlpreds_lookup.NIL == done_var_$105) {
                                            final SubLObject gaf = iteration.iteration_next_without_values_macro_helper(final_index_iterator, token_var_$106);
                                            final SubLObject valid_$107 = (SubLObject)SubLObjectFactory.makeBoolean(!token_var_$106.eql(gaf));
                                            if (removal_modules_genlpreds_lookup.NIL != valid_$107) {
                                                final SubLObject var;
                                                final SubLObject bindings_assertion = var = removal_negationpreds_gaf_iterator_internal(gaf);
                                                if (removal_modules_genlpreds_lookup.NIL != var) {
                                                    result = (SubLObject)ConsesLow.cons(var, result);
                                                }
                                            }
                                            done_var_$105 = (SubLObject)SubLObjectFactory.makeBoolean(removal_modules_genlpreds_lookup.NIL == valid_$107);
                                        }
                                    }
                                    finally {
                                        final SubLObject _prev_bind_0_$108 = Threads.$is_thread_performing_cleanupP$.currentBinding(thread);
                                        try {
                                            Threads.$is_thread_performing_cleanupP$.bind((SubLObject)removal_modules_genlpreds_lookup.T, thread);
                                            final SubLObject _values2 = Values.getValuesAsVector();
                                            if (removal_modules_genlpreds_lookup.NIL != final_index_iterator) {
                                                kb_mapping_macros.destroy_final_index_iterator(final_index_iterator);
                                            }
                                            Values.restoreValuesFromVector(_values2);
                                        }
                                        finally {
                                            Threads.$is_thread_performing_cleanupP$.rebind(_prev_bind_0_$108, thread);
                                        }
                                    }
                                }
                                done_var = (SubLObject)SubLObjectFactory.makeBoolean(removal_modules_genlpreds_lookup.NIL == valid);
                            }
                        }
                    }
                }
                else if (removal_modules_genlpreds_lookup.NIL != predicate) {
                    final SubLObject pred_var = predicate;
                    if (removal_modules_genlpreds_lookup.NIL != kb_mapping_macros.do_gaf_arg_index_key_validator(v_term, (SubLObject)removal_modules_genlpreds_lookup.NIL, pred_var)) {
                        final SubLObject iterator_var = kb_mapping_macros.new_gaf_arg_final_index_spec_iterator(v_term, (SubLObject)removal_modules_genlpreds_lookup.NIL, pred_var);
                        SubLObject done_var = (SubLObject)removal_modules_genlpreds_lookup.NIL;
                        final SubLObject token_var = (SubLObject)removal_modules_genlpreds_lookup.NIL;
                        while (removal_modules_genlpreds_lookup.NIL == done_var) {
                            final SubLObject final_index_spec = iteration.iteration_next_without_values_macro_helper(iterator_var, token_var);
                            final SubLObject valid = (SubLObject)SubLObjectFactory.makeBoolean(!token_var.eql(final_index_spec));
                            if (removal_modules_genlpreds_lookup.NIL != valid) {
                                SubLObject final_index_iterator = (SubLObject)removal_modules_genlpreds_lookup.NIL;
                                try {
                                    final_index_iterator = kb_mapping_macros.new_final_index_iterator(final_index_spec, (SubLObject)removal_modules_genlpreds_lookup.$kw9$GAF, (SubLObject)removal_modules_genlpreds_lookup.$kw42$TRUE, (SubLObject)removal_modules_genlpreds_lookup.NIL);
                                    SubLObject done_var_$106 = (SubLObject)removal_modules_genlpreds_lookup.NIL;
                                    final SubLObject token_var_$107 = (SubLObject)removal_modules_genlpreds_lookup.NIL;
                                    while (removal_modules_genlpreds_lookup.NIL == done_var_$106) {
                                        final SubLObject gaf = iteration.iteration_next_without_values_macro_helper(final_index_iterator, token_var_$107);
                                        final SubLObject valid_$108 = (SubLObject)SubLObjectFactory.makeBoolean(!token_var_$107.eql(gaf));
                                        if (removal_modules_genlpreds_lookup.NIL != valid_$108) {
                                            final SubLObject var;
                                            final SubLObject bindings_assertion = var = removal_negationpreds_gaf_iterator_internal(gaf);
                                            if (removal_modules_genlpreds_lookup.NIL != var) {
                                                result = (SubLObject)ConsesLow.cons(var, result);
                                            }
                                        }
                                        done_var_$106 = (SubLObject)SubLObjectFactory.makeBoolean(removal_modules_genlpreds_lookup.NIL == valid_$108);
                                    }
                                }
                                finally {
                                    final SubLObject _prev_bind_0_$109 = Threads.$is_thread_performing_cleanupP$.currentBinding(thread);
                                    try {
                                        Threads.$is_thread_performing_cleanupP$.bind((SubLObject)removal_modules_genlpreds_lookup.T, thread);
                                        final SubLObject _values3 = Values.getValuesAsVector();
                                        if (removal_modules_genlpreds_lookup.NIL != final_index_iterator) {
                                            kb_mapping_macros.destroy_final_index_iterator(final_index_iterator);
                                        }
                                        Values.restoreValuesFromVector(_values3);
                                    }
                                    finally {
                                        Threads.$is_thread_performing_cleanupP$.rebind(_prev_bind_0_$109, thread);
                                    }
                                }
                            }
                            done_var = (SubLObject)SubLObjectFactory.makeBoolean(removal_modules_genlpreds_lookup.NIL == valid);
                        }
                    }
                }
                else {
                    final SubLObject pred_var = (SubLObject)removal_modules_genlpreds_lookup.NIL;
                    if (removal_modules_genlpreds_lookup.NIL != kb_mapping_macros.do_gaf_arg_index_key_validator(v_term, (SubLObject)removal_modules_genlpreds_lookup.NIL, pred_var)) {
                        final SubLObject iterator_var = kb_mapping_macros.new_gaf_arg_final_index_spec_iterator(v_term, (SubLObject)removal_modules_genlpreds_lookup.NIL, pred_var);
                        SubLObject done_var = (SubLObject)removal_modules_genlpreds_lookup.NIL;
                        final SubLObject token_var = (SubLObject)removal_modules_genlpreds_lookup.NIL;
                        while (removal_modules_genlpreds_lookup.NIL == done_var) {
                            final SubLObject final_index_spec = iteration.iteration_next_without_values_macro_helper(iterator_var, token_var);
                            final SubLObject valid = (SubLObject)SubLObjectFactory.makeBoolean(!token_var.eql(final_index_spec));
                            if (removal_modules_genlpreds_lookup.NIL != valid) {
                                SubLObject final_index_iterator = (SubLObject)removal_modules_genlpreds_lookup.NIL;
                                try {
                                    final_index_iterator = kb_mapping_macros.new_final_index_iterator(final_index_spec, (SubLObject)removal_modules_genlpreds_lookup.$kw9$GAF, (SubLObject)removal_modules_genlpreds_lookup.$kw42$TRUE, (SubLObject)removal_modules_genlpreds_lookup.NIL);
                                    SubLObject done_var_$107 = (SubLObject)removal_modules_genlpreds_lookup.NIL;
                                    final SubLObject token_var_$108 = (SubLObject)removal_modules_genlpreds_lookup.NIL;
                                    while (removal_modules_genlpreds_lookup.NIL == done_var_$107) {
                                        final SubLObject gaf = iteration.iteration_next_without_values_macro_helper(final_index_iterator, token_var_$108);
                                        final SubLObject valid_$109 = (SubLObject)SubLObjectFactory.makeBoolean(!token_var_$108.eql(gaf));
                                        if (removal_modules_genlpreds_lookup.NIL != valid_$109) {
                                            final SubLObject var;
                                            final SubLObject bindings_assertion = var = removal_negationpreds_gaf_iterator_internal(gaf);
                                            if (removal_modules_genlpreds_lookup.NIL != var) {
                                                result = (SubLObject)ConsesLow.cons(var, result);
                                            }
                                        }
                                        done_var_$107 = (SubLObject)SubLObjectFactory.makeBoolean(removal_modules_genlpreds_lookup.NIL == valid_$109);
                                    }
                                }
                                finally {
                                    final SubLObject _prev_bind_0_$110 = Threads.$is_thread_performing_cleanupP$.currentBinding(thread);
                                    try {
                                        Threads.$is_thread_performing_cleanupP$.bind((SubLObject)removal_modules_genlpreds_lookup.T, thread);
                                        final SubLObject _values4 = Values.getValuesAsVector();
                                        if (removal_modules_genlpreds_lookup.NIL != final_index_iterator) {
                                            kb_mapping_macros.destroy_final_index_iterator(final_index_iterator);
                                        }
                                        Values.restoreValuesFromVector(_values4);
                                    }
                                    finally {
                                        Threads.$is_thread_performing_cleanupP$.rebind(_prev_bind_0_$110, thread);
                                    }
                                }
                            }
                            done_var = (SubLObject)SubLObjectFactory.makeBoolean(removal_modules_genlpreds_lookup.NIL == valid);
                        }
                    }
                }
            }
            else if (pcase_var.eql((SubLObject)removal_modules_genlpreds_lookup.$kw10$PREDICATE_EXTENT)) {
                final SubLObject pred_var2 = kb_mapping_macros.do_gli_vpe_extract_key(l_index);
                if (removal_modules_genlpreds_lookup.NIL != kb_mapping_macros.do_predicate_extent_index_key_validator(pred_var2)) {
                    final SubLObject str = (SubLObject)removal_modules_genlpreds_lookup.NIL;
                    final SubLObject _prev_bind_0_$111 = utilities_macros.$progress_start_time$.currentBinding(thread);
                    final SubLObject _prev_bind_1_$121 = utilities_macros.$progress_last_pacification_time$.currentBinding(thread);
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
                        utilities_macros.$progress_notification_count$.bind((SubLObject)removal_modules_genlpreds_lookup.ZERO_INTEGER, thread);
                        utilities_macros.$progress_pacifications_since_last_nl$.bind((SubLObject)removal_modules_genlpreds_lookup.ZERO_INTEGER, thread);
                        utilities_macros.$progress_count$.bind((SubLObject)removal_modules_genlpreds_lookup.ZERO_INTEGER, thread);
                        utilities_macros.$is_noting_progressP$.bind((SubLObject)removal_modules_genlpreds_lookup.T, thread);
                        utilities_macros.$silent_progressP$.bind((SubLObject)((removal_modules_genlpreds_lookup.NIL != str) ? utilities_macros.$silent_progressP$.getDynamicValue(thread) : removal_modules_genlpreds_lookup.T), thread);
                        utilities_macros.noting_progress_preamble(str);
                        final SubLObject iterator_var2 = kb_mapping_macros.new_predicate_extent_final_index_spec_iterator(pred_var2);
                        SubLObject done_var2 = (SubLObject)removal_modules_genlpreds_lookup.NIL;
                        final SubLObject token_var2 = (SubLObject)removal_modules_genlpreds_lookup.NIL;
                        while (removal_modules_genlpreds_lookup.NIL == done_var2) {
                            final SubLObject final_index_spec2 = iteration.iteration_next_without_values_macro_helper(iterator_var2, token_var2);
                            final SubLObject valid2 = (SubLObject)SubLObjectFactory.makeBoolean(!token_var2.eql(final_index_spec2));
                            if (removal_modules_genlpreds_lookup.NIL != valid2) {
                                utilities_macros.note_progress();
                                SubLObject final_index_iterator2 = (SubLObject)removal_modules_genlpreds_lookup.NIL;
                                try {
                                    final_index_iterator2 = kb_mapping_macros.new_final_index_iterator(final_index_spec2, (SubLObject)removal_modules_genlpreds_lookup.$kw9$GAF, (SubLObject)removal_modules_genlpreds_lookup.$kw42$TRUE, (SubLObject)removal_modules_genlpreds_lookup.NIL);
                                    SubLObject done_var_$108 = (SubLObject)removal_modules_genlpreds_lookup.NIL;
                                    final SubLObject token_var_$109 = (SubLObject)removal_modules_genlpreds_lookup.NIL;
                                    while (removal_modules_genlpreds_lookup.NIL == done_var_$108) {
                                        final SubLObject gaf2 = iteration.iteration_next_without_values_macro_helper(final_index_iterator2, token_var_$109);
                                        final SubLObject valid_$110 = (SubLObject)SubLObjectFactory.makeBoolean(!token_var_$109.eql(gaf2));
                                        if (removal_modules_genlpreds_lookup.NIL != valid_$110) {
                                            final SubLObject var2;
                                            final SubLObject bindings_assertion2 = var2 = removal_negationpreds_gaf_iterator_internal(gaf2);
                                            if (removal_modules_genlpreds_lookup.NIL != var2) {
                                                result = (SubLObject)ConsesLow.cons(var2, result);
                                            }
                                        }
                                        done_var_$108 = (SubLObject)SubLObjectFactory.makeBoolean(removal_modules_genlpreds_lookup.NIL == valid_$110);
                                    }
                                }
                                finally {
                                    final SubLObject _prev_bind_0_$112 = Threads.$is_thread_performing_cleanupP$.currentBinding(thread);
                                    try {
                                        Threads.$is_thread_performing_cleanupP$.bind((SubLObject)removal_modules_genlpreds_lookup.T, thread);
                                        final SubLObject _values5 = Values.getValuesAsVector();
                                        if (removal_modules_genlpreds_lookup.NIL != final_index_iterator2) {
                                            kb_mapping_macros.destroy_final_index_iterator(final_index_iterator2);
                                        }
                                        Values.restoreValuesFromVector(_values5);
                                    }
                                    finally {
                                        Threads.$is_thread_performing_cleanupP$.rebind(_prev_bind_0_$112, thread);
                                    }
                                }
                            }
                            done_var2 = (SubLObject)SubLObjectFactory.makeBoolean(removal_modules_genlpreds_lookup.NIL == valid2);
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
                        utilities_macros.$progress_last_pacification_time$.rebind(_prev_bind_1_$121, thread);
                        utilities_macros.$progress_start_time$.rebind(_prev_bind_0_$111, thread);
                    }
                }
            }
            else if (pcase_var.eql((SubLObject)removal_modules_genlpreds_lookup.$kw11$OVERLAP)) {
                SubLObject cdolist_list_var = virtual_indexing.gather_overlap_index(kb_mapping_macros.do_gli_vo_extract_key(l_index), (SubLObject)removal_modules_genlpreds_lookup.UNPROVIDED);
                SubLObject gaf3 = (SubLObject)removal_modules_genlpreds_lookup.NIL;
                gaf3 = cdolist_list_var.first();
                while (removal_modules_genlpreds_lookup.NIL != cdolist_list_var) {
                    if (removal_modules_genlpreds_lookup.NIL != assertions_high.assertion_has_truth(gaf3, (SubLObject)removal_modules_genlpreds_lookup.$kw42$TRUE)) {
                        final SubLObject var3;
                        final SubLObject bindings_assertion3 = var3 = removal_negationpreds_gaf_iterator_internal(gaf3);
                        if (removal_modules_genlpreds_lookup.NIL != var3) {
                            result = (SubLObject)ConsesLow.cons(var3, result);
                        }
                    }
                    cdolist_list_var = cdolist_list_var.rest();
                    gaf3 = cdolist_list_var.first();
                }
            }
            else {
                kb_mapping_macros.do_gli_method_error(l_index, method);
            }
        }
        finally {
            pred_relevance_macros.$relevant_pred_function$.rebind(_prev_bind_2, thread);
            control_vars.$inference_literal$.rebind(_prev_bind_0, thread);
        }
        if (removal_modules_genlpreds_lookup.NIL != result) {
            return iteration.new_list_iterator(result);
        }
        return (SubLObject)removal_modules_genlpreds_lookup.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/modules/removal/removal-modules-genlpreds-lookup.lisp", position = 24080L)
    public static SubLObject removal_negationpreds_gaf_iterator_internal(final SubLObject assertion) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        if (removal_modules_genlpreds_lookup.NIL != backward_utilities.direction_is_relevant(assertion)) {
            final SubLObject assertion_asent = assertions_high.gaf_formula(assertion);
            thread.resetMultipleValues();
            final SubLObject v_bindings = unification_utilities.gaf_asent_args_unify(control_vars.$inference_literal$.getDynamicValue(thread), assertion_asent, (SubLObject)removal_modules_genlpreds_lookup.T, (SubLObject)removal_modules_genlpreds_lookup.T);
            final SubLObject gaf_asent = thread.secondMultipleValue();
            final SubLObject unify_justification = thread.thirdMultipleValue();
            thread.resetMultipleValues();
            if (removal_modules_genlpreds_lookup.NIL != v_bindings) {
                return (SubLObject)ConsesLow.list(v_bindings, assertion);
            }
        }
        return (SubLObject)removal_modules_genlpreds_lookup.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/modules/removal/removal-modules-genlpreds-lookup.lisp", position = 24532L)
    public static SubLObject removal_negationpreds_lookup_supports(final SubLObject asent, final SubLObject assertion) {
        final SubLObject ass_pred = cycl_utilities.atomic_sentence_predicate(assertion);
        final SubLObject inf_pred = cycl_utilities.atomic_sentence_predicate(asent);
        final SubLObject hl_formula = backward_utilities.inference_make_commutative_asent(removal_modules_genlpreds_lookup.$const45$negationPreds, (SubLObject)ConsesLow.list(inf_pred, ass_pred));
        final SubLObject hl_support = arguments.make_hl_support((SubLObject)removal_modules_genlpreds_lookup.$kw46$NEGATIONPREDS, hl_formula, (SubLObject)removal_modules_genlpreds_lookup.UNPROVIDED, (SubLObject)removal_modules_genlpreds_lookup.UNPROVIDED);
        return (SubLObject)ConsesLow.list(assertion, hl_support);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/modules/removal/removal-modules-genlpreds-lookup.lisp", position = 24906L)
    public static SubLObject removal_negationinverse_lookup_iterator(final SubLObject asent) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject result = (SubLObject)removal_modules_genlpreds_lookup.NIL;
        final SubLObject obfuscated_asent = obfuscate_predicate(removal_modules_symmetry.symmetric_asent(asent));
        final SubLObject _prev_bind_0 = control_vars.$inference_literal$.currentBinding(thread);
        final SubLObject _prev_bind_2 = pred_relevance_macros.$relevant_pred_function$.currentBinding(thread);
        try {
            control_vars.$inference_literal$.bind(asent, thread);
            pred_relevance_macros.$relevant_pred_function$.bind((SubLObject)removal_modules_genlpreds_lookup.$sym47$INFERENCE_NEGATION_INVERSE_, thread);
            final SubLObject l_index = kb_indexing.best_gaf_lookup_index(obfuscated_asent, (SubLObject)removal_modules_genlpreds_lookup.$kw42$TRUE, (SubLObject)removal_modules_genlpreds_lookup.NIL);
            final SubLObject pcase_var;
            final SubLObject method = pcase_var = kb_mapping_macros.do_gli_extract_method(l_index);
            if (pcase_var.eql((SubLObject)removal_modules_genlpreds_lookup.$kw8$GAF_ARG)) {
                thread.resetMultipleValues();
                final SubLObject v_term = kb_mapping_macros.do_gli_vga_extract_keys(l_index);
                final SubLObject argnum = thread.secondMultipleValue();
                final SubLObject predicate = thread.thirdMultipleValue();
                thread.resetMultipleValues();
                if (removal_modules_genlpreds_lookup.NIL != argnum) {
                    if (removal_modules_genlpreds_lookup.NIL != predicate) {
                        final SubLObject pred_var = predicate;
                        if (removal_modules_genlpreds_lookup.NIL != kb_mapping_macros.do_gaf_arg_index_key_validator(v_term, argnum, pred_var)) {
                            final SubLObject iterator_var = kb_mapping_macros.new_gaf_arg_final_index_spec_iterator(v_term, argnum, pred_var);
                            SubLObject done_var = (SubLObject)removal_modules_genlpreds_lookup.NIL;
                            final SubLObject token_var = (SubLObject)removal_modules_genlpreds_lookup.NIL;
                            while (removal_modules_genlpreds_lookup.NIL == done_var) {
                                final SubLObject final_index_spec = iteration.iteration_next_without_values_macro_helper(iterator_var, token_var);
                                final SubLObject valid = (SubLObject)SubLObjectFactory.makeBoolean(!token_var.eql(final_index_spec));
                                if (removal_modules_genlpreds_lookup.NIL != valid) {
                                    SubLObject final_index_iterator = (SubLObject)removal_modules_genlpreds_lookup.NIL;
                                    try {
                                        final_index_iterator = kb_mapping_macros.new_final_index_iterator(final_index_spec, (SubLObject)removal_modules_genlpreds_lookup.$kw9$GAF, (SubLObject)removal_modules_genlpreds_lookup.$kw42$TRUE, (SubLObject)removal_modules_genlpreds_lookup.NIL);
                                        SubLObject done_var_$126 = (SubLObject)removal_modules_genlpreds_lookup.NIL;
                                        final SubLObject token_var_$127 = (SubLObject)removal_modules_genlpreds_lookup.NIL;
                                        while (removal_modules_genlpreds_lookup.NIL == done_var_$126) {
                                            final SubLObject gaf = iteration.iteration_next_without_values_macro_helper(final_index_iterator, token_var_$127);
                                            final SubLObject valid_$128 = (SubLObject)SubLObjectFactory.makeBoolean(!token_var_$127.eql(gaf));
                                            if (removal_modules_genlpreds_lookup.NIL != valid_$128) {
                                                final SubLObject var;
                                                final SubLObject bindings_assertion = var = removal_negationinverse_gaf_iterator_internal(gaf);
                                                if (removal_modules_genlpreds_lookup.NIL != var) {
                                                    result = (SubLObject)ConsesLow.cons(var, result);
                                                }
                                            }
                                            done_var_$126 = (SubLObject)SubLObjectFactory.makeBoolean(removal_modules_genlpreds_lookup.NIL == valid_$128);
                                        }
                                    }
                                    finally {
                                        final SubLObject _prev_bind_0_$129 = Threads.$is_thread_performing_cleanupP$.currentBinding(thread);
                                        try {
                                            Threads.$is_thread_performing_cleanupP$.bind((SubLObject)removal_modules_genlpreds_lookup.T, thread);
                                            final SubLObject _values = Values.getValuesAsVector();
                                            if (removal_modules_genlpreds_lookup.NIL != final_index_iterator) {
                                                kb_mapping_macros.destroy_final_index_iterator(final_index_iterator);
                                            }
                                            Values.restoreValuesFromVector(_values);
                                        }
                                        finally {
                                            Threads.$is_thread_performing_cleanupP$.rebind(_prev_bind_0_$129, thread);
                                        }
                                    }
                                }
                                done_var = (SubLObject)SubLObjectFactory.makeBoolean(removal_modules_genlpreds_lookup.NIL == valid);
                            }
                        }
                    }
                    else {
                        final SubLObject pred_var = (SubLObject)removal_modules_genlpreds_lookup.NIL;
                        if (removal_modules_genlpreds_lookup.NIL != kb_mapping_macros.do_gaf_arg_index_key_validator(v_term, argnum, pred_var)) {
                            final SubLObject iterator_var = kb_mapping_macros.new_gaf_arg_final_index_spec_iterator(v_term, argnum, pred_var);
                            SubLObject done_var = (SubLObject)removal_modules_genlpreds_lookup.NIL;
                            final SubLObject token_var = (SubLObject)removal_modules_genlpreds_lookup.NIL;
                            while (removal_modules_genlpreds_lookup.NIL == done_var) {
                                final SubLObject final_index_spec = iteration.iteration_next_without_values_macro_helper(iterator_var, token_var);
                                final SubLObject valid = (SubLObject)SubLObjectFactory.makeBoolean(!token_var.eql(final_index_spec));
                                if (removal_modules_genlpreds_lookup.NIL != valid) {
                                    SubLObject final_index_iterator = (SubLObject)removal_modules_genlpreds_lookup.NIL;
                                    try {
                                        final_index_iterator = kb_mapping_macros.new_final_index_iterator(final_index_spec, (SubLObject)removal_modules_genlpreds_lookup.$kw9$GAF, (SubLObject)removal_modules_genlpreds_lookup.$kw42$TRUE, (SubLObject)removal_modules_genlpreds_lookup.NIL);
                                        SubLObject done_var_$127 = (SubLObject)removal_modules_genlpreds_lookup.NIL;
                                        final SubLObject token_var_$128 = (SubLObject)removal_modules_genlpreds_lookup.NIL;
                                        while (removal_modules_genlpreds_lookup.NIL == done_var_$127) {
                                            final SubLObject gaf = iteration.iteration_next_without_values_macro_helper(final_index_iterator, token_var_$128);
                                            final SubLObject valid_$129 = (SubLObject)SubLObjectFactory.makeBoolean(!token_var_$128.eql(gaf));
                                            if (removal_modules_genlpreds_lookup.NIL != valid_$129) {
                                                final SubLObject var;
                                                final SubLObject bindings_assertion = var = removal_negationinverse_gaf_iterator_internal(gaf);
                                                if (removal_modules_genlpreds_lookup.NIL != var) {
                                                    result = (SubLObject)ConsesLow.cons(var, result);
                                                }
                                            }
                                            done_var_$127 = (SubLObject)SubLObjectFactory.makeBoolean(removal_modules_genlpreds_lookup.NIL == valid_$129);
                                        }
                                    }
                                    finally {
                                        final SubLObject _prev_bind_0_$130 = Threads.$is_thread_performing_cleanupP$.currentBinding(thread);
                                        try {
                                            Threads.$is_thread_performing_cleanupP$.bind((SubLObject)removal_modules_genlpreds_lookup.T, thread);
                                            final SubLObject _values2 = Values.getValuesAsVector();
                                            if (removal_modules_genlpreds_lookup.NIL != final_index_iterator) {
                                                kb_mapping_macros.destroy_final_index_iterator(final_index_iterator);
                                            }
                                            Values.restoreValuesFromVector(_values2);
                                        }
                                        finally {
                                            Threads.$is_thread_performing_cleanupP$.rebind(_prev_bind_0_$130, thread);
                                        }
                                    }
                                }
                                done_var = (SubLObject)SubLObjectFactory.makeBoolean(removal_modules_genlpreds_lookup.NIL == valid);
                            }
                        }
                    }
                }
                else if (removal_modules_genlpreds_lookup.NIL != predicate) {
                    final SubLObject pred_var = predicate;
                    if (removal_modules_genlpreds_lookup.NIL != kb_mapping_macros.do_gaf_arg_index_key_validator(v_term, (SubLObject)removal_modules_genlpreds_lookup.NIL, pred_var)) {
                        final SubLObject iterator_var = kb_mapping_macros.new_gaf_arg_final_index_spec_iterator(v_term, (SubLObject)removal_modules_genlpreds_lookup.NIL, pred_var);
                        SubLObject done_var = (SubLObject)removal_modules_genlpreds_lookup.NIL;
                        final SubLObject token_var = (SubLObject)removal_modules_genlpreds_lookup.NIL;
                        while (removal_modules_genlpreds_lookup.NIL == done_var) {
                            final SubLObject final_index_spec = iteration.iteration_next_without_values_macro_helper(iterator_var, token_var);
                            final SubLObject valid = (SubLObject)SubLObjectFactory.makeBoolean(!token_var.eql(final_index_spec));
                            if (removal_modules_genlpreds_lookup.NIL != valid) {
                                SubLObject final_index_iterator = (SubLObject)removal_modules_genlpreds_lookup.NIL;
                                try {
                                    final_index_iterator = kb_mapping_macros.new_final_index_iterator(final_index_spec, (SubLObject)removal_modules_genlpreds_lookup.$kw9$GAF, (SubLObject)removal_modules_genlpreds_lookup.$kw42$TRUE, (SubLObject)removal_modules_genlpreds_lookup.NIL);
                                    SubLObject done_var_$128 = (SubLObject)removal_modules_genlpreds_lookup.NIL;
                                    final SubLObject token_var_$129 = (SubLObject)removal_modules_genlpreds_lookup.NIL;
                                    while (removal_modules_genlpreds_lookup.NIL == done_var_$128) {
                                        final SubLObject gaf = iteration.iteration_next_without_values_macro_helper(final_index_iterator, token_var_$129);
                                        final SubLObject valid_$130 = (SubLObject)SubLObjectFactory.makeBoolean(!token_var_$129.eql(gaf));
                                        if (removal_modules_genlpreds_lookup.NIL != valid_$130) {
                                            final SubLObject var;
                                            final SubLObject bindings_assertion = var = removal_negationinverse_gaf_iterator_internal(gaf);
                                            if (removal_modules_genlpreds_lookup.NIL != var) {
                                                result = (SubLObject)ConsesLow.cons(var, result);
                                            }
                                        }
                                        done_var_$128 = (SubLObject)SubLObjectFactory.makeBoolean(removal_modules_genlpreds_lookup.NIL == valid_$130);
                                    }
                                }
                                finally {
                                    final SubLObject _prev_bind_0_$131 = Threads.$is_thread_performing_cleanupP$.currentBinding(thread);
                                    try {
                                        Threads.$is_thread_performing_cleanupP$.bind((SubLObject)removal_modules_genlpreds_lookup.T, thread);
                                        final SubLObject _values3 = Values.getValuesAsVector();
                                        if (removal_modules_genlpreds_lookup.NIL != final_index_iterator) {
                                            kb_mapping_macros.destroy_final_index_iterator(final_index_iterator);
                                        }
                                        Values.restoreValuesFromVector(_values3);
                                    }
                                    finally {
                                        Threads.$is_thread_performing_cleanupP$.rebind(_prev_bind_0_$131, thread);
                                    }
                                }
                            }
                            done_var = (SubLObject)SubLObjectFactory.makeBoolean(removal_modules_genlpreds_lookup.NIL == valid);
                        }
                    }
                }
                else {
                    final SubLObject pred_var = (SubLObject)removal_modules_genlpreds_lookup.NIL;
                    if (removal_modules_genlpreds_lookup.NIL != kb_mapping_macros.do_gaf_arg_index_key_validator(v_term, (SubLObject)removal_modules_genlpreds_lookup.NIL, pred_var)) {
                        final SubLObject iterator_var = kb_mapping_macros.new_gaf_arg_final_index_spec_iterator(v_term, (SubLObject)removal_modules_genlpreds_lookup.NIL, pred_var);
                        SubLObject done_var = (SubLObject)removal_modules_genlpreds_lookup.NIL;
                        final SubLObject token_var = (SubLObject)removal_modules_genlpreds_lookup.NIL;
                        while (removal_modules_genlpreds_lookup.NIL == done_var) {
                            final SubLObject final_index_spec = iteration.iteration_next_without_values_macro_helper(iterator_var, token_var);
                            final SubLObject valid = (SubLObject)SubLObjectFactory.makeBoolean(!token_var.eql(final_index_spec));
                            if (removal_modules_genlpreds_lookup.NIL != valid) {
                                SubLObject final_index_iterator = (SubLObject)removal_modules_genlpreds_lookup.NIL;
                                try {
                                    final_index_iterator = kb_mapping_macros.new_final_index_iterator(final_index_spec, (SubLObject)removal_modules_genlpreds_lookup.$kw9$GAF, (SubLObject)removal_modules_genlpreds_lookup.$kw42$TRUE, (SubLObject)removal_modules_genlpreds_lookup.NIL);
                                    SubLObject done_var_$129 = (SubLObject)removal_modules_genlpreds_lookup.NIL;
                                    final SubLObject token_var_$130 = (SubLObject)removal_modules_genlpreds_lookup.NIL;
                                    while (removal_modules_genlpreds_lookup.NIL == done_var_$129) {
                                        final SubLObject gaf = iteration.iteration_next_without_values_macro_helper(final_index_iterator, token_var_$130);
                                        final SubLObject valid_$131 = (SubLObject)SubLObjectFactory.makeBoolean(!token_var_$130.eql(gaf));
                                        if (removal_modules_genlpreds_lookup.NIL != valid_$131) {
                                            final SubLObject var;
                                            final SubLObject bindings_assertion = var = removal_negationinverse_gaf_iterator_internal(gaf);
                                            if (removal_modules_genlpreds_lookup.NIL != var) {
                                                result = (SubLObject)ConsesLow.cons(var, result);
                                            }
                                        }
                                        done_var_$129 = (SubLObject)SubLObjectFactory.makeBoolean(removal_modules_genlpreds_lookup.NIL == valid_$131);
                                    }
                                }
                                finally {
                                    final SubLObject _prev_bind_0_$132 = Threads.$is_thread_performing_cleanupP$.currentBinding(thread);
                                    try {
                                        Threads.$is_thread_performing_cleanupP$.bind((SubLObject)removal_modules_genlpreds_lookup.T, thread);
                                        final SubLObject _values4 = Values.getValuesAsVector();
                                        if (removal_modules_genlpreds_lookup.NIL != final_index_iterator) {
                                            kb_mapping_macros.destroy_final_index_iterator(final_index_iterator);
                                        }
                                        Values.restoreValuesFromVector(_values4);
                                    }
                                    finally {
                                        Threads.$is_thread_performing_cleanupP$.rebind(_prev_bind_0_$132, thread);
                                    }
                                }
                            }
                            done_var = (SubLObject)SubLObjectFactory.makeBoolean(removal_modules_genlpreds_lookup.NIL == valid);
                        }
                    }
                }
            }
            else if (pcase_var.eql((SubLObject)removal_modules_genlpreds_lookup.$kw10$PREDICATE_EXTENT)) {
                final SubLObject pred_var2 = kb_mapping_macros.do_gli_vpe_extract_key(l_index);
                if (removal_modules_genlpreds_lookup.NIL != kb_mapping_macros.do_predicate_extent_index_key_validator(pred_var2)) {
                    final SubLObject str = (SubLObject)removal_modules_genlpreds_lookup.NIL;
                    final SubLObject _prev_bind_0_$133 = utilities_macros.$progress_start_time$.currentBinding(thread);
                    final SubLObject _prev_bind_1_$143 = utilities_macros.$progress_last_pacification_time$.currentBinding(thread);
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
                        utilities_macros.$progress_notification_count$.bind((SubLObject)removal_modules_genlpreds_lookup.ZERO_INTEGER, thread);
                        utilities_macros.$progress_pacifications_since_last_nl$.bind((SubLObject)removal_modules_genlpreds_lookup.ZERO_INTEGER, thread);
                        utilities_macros.$progress_count$.bind((SubLObject)removal_modules_genlpreds_lookup.ZERO_INTEGER, thread);
                        utilities_macros.$is_noting_progressP$.bind((SubLObject)removal_modules_genlpreds_lookup.T, thread);
                        utilities_macros.$silent_progressP$.bind((SubLObject)((removal_modules_genlpreds_lookup.NIL != str) ? utilities_macros.$silent_progressP$.getDynamicValue(thread) : removal_modules_genlpreds_lookup.T), thread);
                        utilities_macros.noting_progress_preamble(str);
                        final SubLObject iterator_var2 = kb_mapping_macros.new_predicate_extent_final_index_spec_iterator(pred_var2);
                        SubLObject done_var2 = (SubLObject)removal_modules_genlpreds_lookup.NIL;
                        final SubLObject token_var2 = (SubLObject)removal_modules_genlpreds_lookup.NIL;
                        while (removal_modules_genlpreds_lookup.NIL == done_var2) {
                            final SubLObject final_index_spec2 = iteration.iteration_next_without_values_macro_helper(iterator_var2, token_var2);
                            final SubLObject valid2 = (SubLObject)SubLObjectFactory.makeBoolean(!token_var2.eql(final_index_spec2));
                            if (removal_modules_genlpreds_lookup.NIL != valid2) {
                                utilities_macros.note_progress();
                                SubLObject final_index_iterator2 = (SubLObject)removal_modules_genlpreds_lookup.NIL;
                                try {
                                    final_index_iterator2 = kb_mapping_macros.new_final_index_iterator(final_index_spec2, (SubLObject)removal_modules_genlpreds_lookup.$kw9$GAF, (SubLObject)removal_modules_genlpreds_lookup.$kw42$TRUE, (SubLObject)removal_modules_genlpreds_lookup.NIL);
                                    SubLObject done_var_$130 = (SubLObject)removal_modules_genlpreds_lookup.NIL;
                                    final SubLObject token_var_$131 = (SubLObject)removal_modules_genlpreds_lookup.NIL;
                                    while (removal_modules_genlpreds_lookup.NIL == done_var_$130) {
                                        final SubLObject gaf2 = iteration.iteration_next_without_values_macro_helper(final_index_iterator2, token_var_$131);
                                        final SubLObject valid_$132 = (SubLObject)SubLObjectFactory.makeBoolean(!token_var_$131.eql(gaf2));
                                        if (removal_modules_genlpreds_lookup.NIL != valid_$132) {
                                            final SubLObject var2;
                                            final SubLObject bindings_assertion2 = var2 = removal_negationinverse_gaf_iterator_internal(gaf2);
                                            if (removal_modules_genlpreds_lookup.NIL != var2) {
                                                result = (SubLObject)ConsesLow.cons(var2, result);
                                            }
                                        }
                                        done_var_$130 = (SubLObject)SubLObjectFactory.makeBoolean(removal_modules_genlpreds_lookup.NIL == valid_$132);
                                    }
                                }
                                finally {
                                    final SubLObject _prev_bind_0_$134 = Threads.$is_thread_performing_cleanupP$.currentBinding(thread);
                                    try {
                                        Threads.$is_thread_performing_cleanupP$.bind((SubLObject)removal_modules_genlpreds_lookup.T, thread);
                                        final SubLObject _values5 = Values.getValuesAsVector();
                                        if (removal_modules_genlpreds_lookup.NIL != final_index_iterator2) {
                                            kb_mapping_macros.destroy_final_index_iterator(final_index_iterator2);
                                        }
                                        Values.restoreValuesFromVector(_values5);
                                    }
                                    finally {
                                        Threads.$is_thread_performing_cleanupP$.rebind(_prev_bind_0_$134, thread);
                                    }
                                }
                            }
                            done_var2 = (SubLObject)SubLObjectFactory.makeBoolean(removal_modules_genlpreds_lookup.NIL == valid2);
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
                        utilities_macros.$progress_last_pacification_time$.rebind(_prev_bind_1_$143, thread);
                        utilities_macros.$progress_start_time$.rebind(_prev_bind_0_$133, thread);
                    }
                }
            }
            else if (pcase_var.eql((SubLObject)removal_modules_genlpreds_lookup.$kw11$OVERLAP)) {
                SubLObject cdolist_list_var = virtual_indexing.gather_overlap_index(kb_mapping_macros.do_gli_vo_extract_key(l_index), (SubLObject)removal_modules_genlpreds_lookup.UNPROVIDED);
                SubLObject gaf3 = (SubLObject)removal_modules_genlpreds_lookup.NIL;
                gaf3 = cdolist_list_var.first();
                while (removal_modules_genlpreds_lookup.NIL != cdolist_list_var) {
                    if (removal_modules_genlpreds_lookup.NIL != assertions_high.assertion_has_truth(gaf3, (SubLObject)removal_modules_genlpreds_lookup.$kw42$TRUE)) {
                        final SubLObject var3;
                        final SubLObject bindings_assertion3 = var3 = removal_negationinverse_gaf_iterator_internal(gaf3);
                        if (removal_modules_genlpreds_lookup.NIL != var3) {
                            result = (SubLObject)ConsesLow.cons(var3, result);
                        }
                    }
                    cdolist_list_var = cdolist_list_var.rest();
                    gaf3 = cdolist_list_var.first();
                }
            }
            else {
                kb_mapping_macros.do_gli_method_error(l_index, method);
            }
        }
        finally {
            pred_relevance_macros.$relevant_pred_function$.rebind(_prev_bind_2, thread);
            control_vars.$inference_literal$.rebind(_prev_bind_0, thread);
        }
        if (removal_modules_genlpreds_lookup.NIL != result) {
            return iteration.new_list_iterator(result);
        }
        return (SubLObject)removal_modules_genlpreds_lookup.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/modules/removal/removal-modules-genlpreds-lookup.lisp", position = 27118L)
    public static SubLObject removal_negationinverse_gaf_iterator_internal(final SubLObject assertion) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        if (removal_modules_genlpreds_lookup.NIL != backward_utilities.direction_is_relevant(assertion)) {
            final SubLObject assertion_asent = assertions_high.gaf_formula(assertion);
            thread.resetMultipleValues();
            final SubLObject v_bindings = unification_utilities.gaf_asent_inverse_args_unify(control_vars.$inference_literal$.getDynamicValue(thread), assertion_asent, (SubLObject)removal_modules_genlpreds_lookup.UNPROVIDED, (SubLObject)removal_modules_genlpreds_lookup.UNPROVIDED);
            final SubLObject gaf_asent = thread.secondMultipleValue();
            final SubLObject unify_justification = thread.thirdMultipleValue();
            thread.resetMultipleValues();
            if (removal_modules_genlpreds_lookup.NIL != v_bindings) {
                return (SubLObject)ConsesLow.list(v_bindings, assertion);
            }
        }
        return (SubLObject)removal_modules_genlpreds_lookup.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/modules/removal/removal-modules-genlpreds-lookup.lisp", position = 27540L)
    public static SubLObject removal_negationinverse_lookup_supports(final SubLObject asent, final SubLObject assertion) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject ass_pred = cycl_utilities.atomic_sentence_predicate(assertion);
        final SubLObject inf_pred = cycl_utilities.atomic_sentence_predicate(asent);
        final SubLObject hl_formula = backward_utilities.inference_make_commutative_asent(removal_modules_genlpreds_lookup.$const50$negationInverse, (SubLObject)ConsesLow.list(inf_pred, ass_pred));
        final SubLObject hl_support = arguments.make_hl_support((SubLObject)removal_modules_genlpreds_lookup.$kw46$NEGATIONPREDS, hl_formula, (SubLObject)removal_modules_genlpreds_lookup.UNPROVIDED, (SubLObject)removal_modules_genlpreds_lookup.UNPROVIDED);
        thread.resetMultipleValues();
        final SubLObject v_bindings = unification_utilities.gaf_asent_inverse_args_unify(asent, assertions_high.gaf_formula(assertion), (SubLObject)removal_modules_genlpreds_lookup.T, (SubLObject)removal_modules_genlpreds_lookup.T);
        final SubLObject gaf_asent = thread.secondMultipleValue();
        final SubLObject unify_justification = thread.thirdMultipleValue();
        thread.resetMultipleValues();
        return ConsesLow.append((SubLObject)ConsesLow.list(assertion, hl_support), unify_justification);
    }
    
    public static SubLObject declare_removal_modules_genlpreds_lookup_file() {
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.modules.removal.removal_modules_genlpreds_lookup", "removal_genlpreds_lookup_pos_cost", "REMOVAL-GENLPREDS-LOOKUP-POS-COST", 1, 1, false);
        new $removal_genlpreds_lookup_pos_cost$UnaryFunction();
        new $removal_genlpreds_lookup_pos_cost$BinaryFunction();
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.modules.removal.removal_modules_genlpreds_lookup", "removal_genlpreds_lookup_pos_iterator", "REMOVAL-GENLPREDS-LOOKUP-POS-ITERATOR", 1, 0, false);
        new $removal_genlpreds_lookup_pos_iterator$UnaryFunction();
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.modules.removal.removal_modules_genlpreds_lookup", "removal_genlpreds_lookup_neg_completeness", "REMOVAL-GENLPREDS-LOOKUP-NEG-COMPLETENESS", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.modules.removal.removal_modules_genlpreds_lookup", "removal_genlpreds_lookup_neg_cost", "REMOVAL-GENLPREDS-LOOKUP-NEG-COST", 1, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.modules.removal.removal_modules_genlpreds_lookup", "removal_genlpreds_lookup_neg_iterator", "REMOVAL-GENLPREDS-LOOKUP-NEG-ITERATOR", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.modules.removal.removal_modules_genlpreds_lookup", "removal_genlpreds_lookup_iterator", "REMOVAL-GENLPREDS-LOOKUP-ITERATOR", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.modules.removal.removal_modules_genlpreds_lookup", "obfuscate_predicate", "OBFUSCATE-PREDICATE", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.modules.removal.removal_modules_genlpreds_lookup", "best_genlpreds_gaf_lookup_index", "BEST-GENLPREDS-GAF-LOOKUP-INDEX", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.modules.removal.removal_modules_genlpreds_lookup", "num_best_genlpreds_gaf_lookup_index", "NUM-BEST-GENLPREDS-GAF-LOOKUP-INDEX", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.modules.removal.removal_modules_genlpreds_lookup", "num_best_genlpreds_or_inverse_gaf_lookup_index", "NUM-BEST-GENLPREDS-OR-INVERSE-GAF-LOOKUP-INDEX", 3, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.modules.removal.removal_modules_genlpreds_lookup", "removal_genlpreds_gaf_iterator_internal", "REMOVAL-GENLPREDS-GAF-ITERATOR-INTERNAL", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.modules.removal.removal_modules_genlpreds_lookup", "removal_genlpreds_lookup_supports", "REMOVAL-GENLPREDS-LOOKUP-SUPPORTS", 3, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.modules.removal.removal_modules_genlpreds_lookup", "removal_genlpreds_pred_index_pos_cost", "REMOVAL-GENLPREDS-PRED-INDEX-POS-COST", 1, 1, false);
        new $removal_genlpreds_pred_index_pos_cost$UnaryFunction();
        new $removal_genlpreds_pred_index_pos_cost$BinaryFunction();
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.modules.removal.removal_modules_genlpreds_lookup", "removal_genlpreds_pred_index_pos_iterator", "REMOVAL-GENLPREDS-PRED-INDEX-POS-ITERATOR", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.modules.removal.removal_modules_genlpreds_lookup", "removal_genlpreds_pred_index_neg_completeness", "REMOVAL-GENLPREDS-PRED-INDEX-NEG-COMPLETENESS", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.modules.removal.removal_modules_genlpreds_lookup", "removal_genlpreds_pred_index_neg_cost", "REMOVAL-GENLPREDS-PRED-INDEX-NEG-COST", 1, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.modules.removal.removal_modules_genlpreds_lookup", "removal_genlpreds_pred_index_neg_iterator", "REMOVAL-GENLPREDS-PRED-INDEX-NEG-ITERATOR", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.modules.removal.removal_modules_genlpreds_lookup", "removal_genlpreds_pred_index_iterator", "REMOVAL-GENLPREDS-PRED-INDEX-ITERATOR", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.modules.removal.removal_modules_genlpreds_lookup", "removal_genlinverse_lookup_pos_cost", "REMOVAL-GENLINVERSE-LOOKUP-POS-COST", 1, 1, false);
        new $removal_genlinverse_lookup_pos_cost$UnaryFunction();
        new $removal_genlinverse_lookup_pos_cost$BinaryFunction();
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.modules.removal.removal_modules_genlpreds_lookup", "removal_genlinverse_lookup_pos_iterator", "REMOVAL-GENLINVERSE-LOOKUP-POS-ITERATOR", 1, 0, false);
        new $removal_genlinverse_lookup_pos_iterator$UnaryFunction();
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.modules.removal.removal_modules_genlpreds_lookup", "removal_genlinverse_lookup_neg_completeness", "REMOVAL-GENLINVERSE-LOOKUP-NEG-COMPLETENESS", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.modules.removal.removal_modules_genlpreds_lookup", "removal_genlinverse_lookup_neg_cost", "REMOVAL-GENLINVERSE-LOOKUP-NEG-COST", 1, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.modules.removal.removal_modules_genlpreds_lookup", "removal_genlinverse_lookup_neg_iterator", "REMOVAL-GENLINVERSE-LOOKUP-NEG-ITERATOR", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.modules.removal.removal_modules_genlpreds_lookup", "removal_genlinverse_lookup_iterator", "REMOVAL-GENLINVERSE-LOOKUP-ITERATOR", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.modules.removal.removal_modules_genlpreds_lookup", "best_genlinverse_gaf_lookup_index", "BEST-GENLINVERSE-GAF-LOOKUP-INDEX", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.modules.removal.removal_modules_genlpreds_lookup", "num_best_genlinverse_gaf_lookup_index", "NUM-BEST-GENLINVERSE-GAF-LOOKUP-INDEX", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.modules.removal.removal_modules_genlpreds_lookup", "removal_genlinverse_gaf_iterator_internal", "REMOVAL-GENLINVERSE-GAF-ITERATOR-INTERNAL", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.modules.removal.removal_modules_genlpreds_lookup", "removal_genlinverse_lookup_supports", "REMOVAL-GENLINVERSE-LOOKUP-SUPPORTS", 3, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.modules.removal.removal_modules_genlpreds_lookup", "removal_genlinverse_pred_index_pos_cost", "REMOVAL-GENLINVERSE-PRED-INDEX-POS-COST", 1, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.modules.removal.removal_modules_genlpreds_lookup", "removal_genlinverse_pred_index_pos_iterator", "REMOVAL-GENLINVERSE-PRED-INDEX-POS-ITERATOR", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.modules.removal.removal_modules_genlpreds_lookup", "removal_genlinverse_pred_index_neg_completeness", "REMOVAL-GENLINVERSE-PRED-INDEX-NEG-COMPLETENESS", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.modules.removal.removal_modules_genlpreds_lookup", "removal_genlinverse_pred_index_neg_cost", "REMOVAL-GENLINVERSE-PRED-INDEX-NEG-COST", 1, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.modules.removal.removal_modules_genlpreds_lookup", "removal_genlinverse_pred_index_neg_iterator", "REMOVAL-GENLINVERSE-PRED-INDEX-NEG-ITERATOR", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.modules.removal.removal_modules_genlpreds_lookup", "removal_genlinverse_pred_index_iterator", "REMOVAL-GENLINVERSE-PRED-INDEX-ITERATOR", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.modules.removal.removal_modules_genlpreds_lookup", "removal_negationpreds_lookup_completeness", "REMOVAL-NEGATIONPREDS-LOOKUP-COMPLETENESS", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.modules.removal.removal_modules_genlpreds_lookup", "removal_negationpreds_lookup_cost", "REMOVAL-NEGATIONPREDS-LOOKUP-COST", 1, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.modules.removal.removal_modules_genlpreds_lookup", "removal_negationpreds_lookup_iterator", "REMOVAL-NEGATIONPREDS-LOOKUP-ITERATOR", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.modules.removal.removal_modules_genlpreds_lookup", "removal_negationpreds_gaf_iterator_internal", "REMOVAL-NEGATIONPREDS-GAF-ITERATOR-INTERNAL", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.modules.removal.removal_modules_genlpreds_lookup", "removal_negationpreds_lookup_supports", "REMOVAL-NEGATIONPREDS-LOOKUP-SUPPORTS", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.modules.removal.removal_modules_genlpreds_lookup", "removal_negationinverse_lookup_iterator", "REMOVAL-NEGATIONINVERSE-LOOKUP-ITERATOR", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.modules.removal.removal_modules_genlpreds_lookup", "removal_negationinverse_gaf_iterator_internal", "REMOVAL-NEGATIONINVERSE-GAF-ITERATOR-INTERNAL", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.modules.removal.removal_modules_genlpreds_lookup", "removal_negationinverse_lookup_supports", "REMOVAL-NEGATIONINVERSE-LOOKUP-SUPPORTS", 2, 0, false);
        return (SubLObject)removal_modules_genlpreds_lookup.NIL;
    }
    
    public static SubLObject init_removal_modules_genlpreds_lookup_file() {
        removal_modules_genlpreds_lookup.$unknown_hl_variable$ = SubLFiles.deflexical("*UNKNOWN-HL-VARIABLE*", (removal_modules_genlpreds_lookup.NIL != Symbols.boundp((SubLObject)removal_modules_genlpreds_lookup.$sym12$_UNKNOWN_HL_VARIABLE_)) ? removal_modules_genlpreds_lookup.$unknown_hl_variable$.getGlobalValue() : variables.get_variable((SubLObject)removal_modules_genlpreds_lookup.ZERO_INTEGER));
        return (SubLObject)removal_modules_genlpreds_lookup.NIL;
    }
    
    public static SubLObject setup_removal_modules_genlpreds_lookup_file() {
        inference_modules.inference_removal_module((SubLObject)removal_modules_genlpreds_lookup.$kw1$REMOVAL_GENLPREDS_LOOKUP_POS, (SubLObject)removal_modules_genlpreds_lookup.$list2);
        inference_modules.inference_removal_module((SubLObject)removal_modules_genlpreds_lookup.$kw6$REMOVAL_GENLPREDS_LOOKUP_NEG, (SubLObject)removal_modules_genlpreds_lookup.$list7);
        subl_macro_promotions.declare_defglobal((SubLObject)removal_modules_genlpreds_lookup.$sym12$_UNKNOWN_HL_VARIABLE_);
        inference_modules.inference_removal_module((SubLObject)removal_modules_genlpreds_lookup.$kw29$REMOVAL_GENLPREDS_PRED_INDEX_POS, (SubLObject)removal_modules_genlpreds_lookup.$list30);
        inference_modules.inference_removal_module((SubLObject)removal_modules_genlpreds_lookup.$kw31$REMOVAL_GENLPREDS_PRED_INDEX_NEG, (SubLObject)removal_modules_genlpreds_lookup.$list32);
        inference_modules.inference_removal_module((SubLObject)removal_modules_genlpreds_lookup.$kw33$REMOVAL_GENLINVERSE_LOOKUP_POS, (SubLObject)removal_modules_genlpreds_lookup.$list34);
        inference_modules.inference_removal_module((SubLObject)removal_modules_genlpreds_lookup.$kw35$REMOVAL_GENLINVERSE_LOOKUP_NEG, (SubLObject)removal_modules_genlpreds_lookup.$list36);
        inference_modules.inference_removal_module((SubLObject)removal_modules_genlpreds_lookup.$kw37$REMOVAL_GENLINVERSE_PRED_INDEX_POS, (SubLObject)removal_modules_genlpreds_lookup.$list38);
        inference_modules.inference_removal_module((SubLObject)removal_modules_genlpreds_lookup.$kw39$REMOVAL_GENLINVERSE_PRED_INDEX_NEG, (SubLObject)removal_modules_genlpreds_lookup.$list40);
        inference_modules.inference_removal_module((SubLObject)removal_modules_genlpreds_lookup.$kw43$REMOVAL_NEGATIONPREDS_LOOKUP, (SubLObject)removal_modules_genlpreds_lookup.$list44);
        inference_modules.inference_removal_module((SubLObject)removal_modules_genlpreds_lookup.$kw48$REMOVAL_NEGATIONINVERSE_LOOKUP, (SubLObject)removal_modules_genlpreds_lookup.$list49);
        return (SubLObject)removal_modules_genlpreds_lookup.NIL;
    }
    
    @Override
	public void declareFunctions() {
        declare_removal_modules_genlpreds_lookup_file();
    }
    
    @Override
	public void initializeVariables() {
        init_removal_modules_genlpreds_lookup_file();
    }
    
    @Override
	public void runTopLevelForms() {
        setup_removal_modules_genlpreds_lookup_file();
    }
    
    static {
        me = (SubLFile)new removal_modules_genlpreds_lookup();
        removal_modules_genlpreds_lookup.$unknown_hl_variable$ = null;
        $kw0$POS = SubLObjectFactory.makeKeyword("POS");
        $kw1$REMOVAL_GENLPREDS_LOOKUP_POS = SubLObjectFactory.makeKeyword("REMOVAL-GENLPREDS-LOOKUP-POS");
        $list2 = ConsesLow.list(new SubLObject[] { SubLObjectFactory.makeKeyword("SENSE"), SubLObjectFactory.makeKeyword("POS"), SubLObjectFactory.makeKeyword("ARITY"), removal_modules_genlpreds_lookup.NIL, SubLObjectFactory.makeKeyword("REQUIRED-PATTERN"), ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("AND"), (SubLObject)ConsesLow.cons((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("TEST"), (SubLObject)SubLObjectFactory.makeSymbol("NON-HL-PREDICATE-P")), (SubLObject)SubLObjectFactory.makeKeyword("ANYTHING")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("TEST"), (SubLObject)SubLObjectFactory.makeSymbol("ASENT-HAS-INDEXED-TERM-ARG-P")), (SubLObject)ConsesLow.cons((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("TEST"), (SubLObject)SubLObjectFactory.makeSymbol("INFERENCE-SOME-SPEC-PRED-OR-INVERSE?")), (SubLObject)SubLObjectFactory.makeKeyword("ANYTHING"))), SubLObjectFactory.makeKeyword("COST"), SubLObjectFactory.makeSymbol("REMOVAL-GENLPREDS-LOOKUP-POS-COST"), SubLObjectFactory.makeKeyword("COMPLETENESS"), SubLObjectFactory.makeKeyword("INCOMPLETE"), SubLObjectFactory.makeKeyword("INPUT-EXTRACT-PATTERN"), ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("TEMPLATE"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("BIND"), (SubLObject)SubLObjectFactory.makeSymbol("ASENT")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("VALUE"), (SubLObject)SubLObjectFactory.makeSymbol("ASENT"))), SubLObjectFactory.makeKeyword("OUTPUT-GENERATE-PATTERN"), ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("CALL"), (SubLObject)SubLObjectFactory.makeSymbol("REMOVAL-GENLPREDS-LOOKUP-POS-ITERATOR"), (SubLObject)SubLObjectFactory.makeKeyword("INPUT")), SubLObjectFactory.makeKeyword("OUTPUT-DECODE-PATTERN"), ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("TEMPLATE"), (SubLObject)ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("BIND"), (SubLObject)SubLObjectFactory.makeSymbol("BINDINGS")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("BIND"), (SubLObject)SubLObjectFactory.makeSymbol("ASSERTION"))), (SubLObject)ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("VALUE"), (SubLObject)SubLObjectFactory.makeSymbol("BINDINGS")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("VALUE"), (SubLObject)SubLObjectFactory.makeSymbol("ASSERTION")))), SubLObjectFactory.makeKeyword("OUTPUT-CONSTRUCT-PATTERN"), ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("CALL"), (SubLObject)SubLObjectFactory.makeSymbol("SUBST-BINDINGS"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("VALUE"), (SubLObject)SubLObjectFactory.makeSymbol("BINDINGS")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("VALUE"), (SubLObject)SubLObjectFactory.makeSymbol("ASENT"))), SubLObjectFactory.makeKeyword("SUPPORT-PATTERN"), ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("CALL"), (SubLObject)SubLObjectFactory.makeSymbol("REMOVAL-GENLPREDS-LOOKUP-SUPPORTS"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("VALUE"), (SubLObject)SubLObjectFactory.makeSymbol("ASENT")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("VALUE"), (SubLObject)SubLObjectFactory.makeSymbol("ASSERTION")), (SubLObject)SubLObjectFactory.makeKeyword("POS")), SubLObjectFactory.makeKeyword("DOCUMENTATION"), SubLObjectFactory.makeString("(<predicate> ... <indexed-term> ... )\nusing true assertions using spec-preds of <predicate>"), SubLObjectFactory.makeKeyword("EXAMPLE"), SubLObjectFactory.makeString("(#$geopoliticalSubdivision #$France #$CityOfParisFrance)") });
        $kw3$NEG = SubLObjectFactory.makeKeyword("NEG");
        $kw4$GROSSLY_INCOMPLETE = SubLObjectFactory.makeKeyword("GROSSLY-INCOMPLETE");
        $kw5$INCOMPLETE = SubLObjectFactory.makeKeyword("INCOMPLETE");
        $kw6$REMOVAL_GENLPREDS_LOOKUP_NEG = SubLObjectFactory.makeKeyword("REMOVAL-GENLPREDS-LOOKUP-NEG");
        $list7 = ConsesLow.list(new SubLObject[] { SubLObjectFactory.makeKeyword("SENSE"), SubLObjectFactory.makeKeyword("NEG"), SubLObjectFactory.makeKeyword("ARITY"), removal_modules_genlpreds_lookup.NIL, SubLObjectFactory.makeKeyword("REQUIRED-PATTERN"), ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("AND"), (SubLObject)ConsesLow.cons((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("TEST"), (SubLObject)SubLObjectFactory.makeSymbol("NON-HL-PREDICATE-P")), (SubLObject)SubLObjectFactory.makeKeyword("ANYTHING")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("TEST"), (SubLObject)SubLObjectFactory.makeSymbol("ASENT-HAS-INDEXED-TERM-ARG-P")), (SubLObject)ConsesLow.cons((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("TEST"), (SubLObject)SubLObjectFactory.makeSymbol("INFERENCE-SOME-GENL-PRED-OR-INVERSE?")), (SubLObject)SubLObjectFactory.makeKeyword("ANYTHING"))), SubLObjectFactory.makeKeyword("COST"), SubLObjectFactory.makeSymbol("REMOVAL-GENLPREDS-LOOKUP-NEG-COST"), SubLObjectFactory.makeKeyword("COMPLETENESS-PATTERN"), ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("CALL"), (SubLObject)SubLObjectFactory.makeSymbol("REMOVAL-GENLPREDS-LOOKUP-NEG-COMPLETENESS"), (SubLObject)SubLObjectFactory.makeKeyword("INPUT")), SubLObjectFactory.makeKeyword("INPUT-EXTRACT-PATTERN"), ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("TEMPLATE"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("BIND"), (SubLObject)SubLObjectFactory.makeSymbol("ASENT")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("VALUE"), (SubLObject)SubLObjectFactory.makeSymbol("ASENT"))), SubLObjectFactory.makeKeyword("OUTPUT-GENERATE-PATTERN"), ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("CALL"), (SubLObject)SubLObjectFactory.makeSymbol("REMOVAL-GENLPREDS-LOOKUP-NEG-ITERATOR"), (SubLObject)SubLObjectFactory.makeKeyword("INPUT")), SubLObjectFactory.makeKeyword("OUTPUT-DECODE-PATTERN"), ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("TEMPLATE"), (SubLObject)ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("BIND"), (SubLObject)SubLObjectFactory.makeSymbol("BINDINGS")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("BIND"), (SubLObject)SubLObjectFactory.makeSymbol("ASSERTION"))), (SubLObject)ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("VALUE"), (SubLObject)SubLObjectFactory.makeSymbol("BINDINGS")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("VALUE"), (SubLObject)SubLObjectFactory.makeSymbol("ASSERTION")))), SubLObjectFactory.makeKeyword("OUTPUT-CONSTRUCT-PATTERN"), ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("CALL"), (SubLObject)SubLObjectFactory.makeSymbol("SUBST-BINDINGS"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("VALUE"), (SubLObject)SubLObjectFactory.makeSymbol("BINDINGS")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("VALUE"), (SubLObject)SubLObjectFactory.makeSymbol("ASENT"))), SubLObjectFactory.makeKeyword("SUPPORT-PATTERN"), ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("CALL"), (SubLObject)SubLObjectFactory.makeSymbol("REMOVAL-GENLPREDS-LOOKUP-SUPPORTS"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("VALUE"), (SubLObject)SubLObjectFactory.makeSymbol("ASENT")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("VALUE"), (SubLObject)SubLObjectFactory.makeSymbol("ASSERTION")), (SubLObject)SubLObjectFactory.makeKeyword("NEG")), SubLObjectFactory.makeKeyword("DOCUMENTATION"), SubLObjectFactory.makeString("(#$not (<predicate> ... <indexed-term> ... ))\nusing false assertions using genl-preds of <predicate>") });
        $kw8$GAF_ARG = SubLObjectFactory.makeKeyword("GAF-ARG");
        $kw9$GAF = SubLObjectFactory.makeKeyword("GAF");
        $kw10$PREDICATE_EXTENT = SubLObjectFactory.makeKeyword("PREDICATE-EXTENT");
        $kw11$OVERLAP = SubLObjectFactory.makeKeyword("OVERLAP");
        $sym12$_UNKNOWN_HL_VARIABLE_ = SubLObjectFactory.makeSymbol("*UNKNOWN-HL-VARIABLE*");
        $list13 = ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("PREDICATE-EXTENT"), (SubLObject)SubLObjectFactory.makeKeyword("GAF-ARG"));
        $const14$genlPreds = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("genlPreds"));
        $kw15$DEPTH = SubLObjectFactory.makeKeyword("DEPTH");
        $kw16$STACK = SubLObjectFactory.makeKeyword("STACK");
        $kw17$QUEUE = SubLObjectFactory.makeKeyword("QUEUE");
        $sym18$RELEVANT_SBHL_TV_IS_GENERAL_TV = SubLObjectFactory.makeSymbol("RELEVANT-SBHL-TV-IS-GENERAL-TV");
        $kw19$ERROR = SubLObjectFactory.makeKeyword("ERROR");
        $str20$_A_is_not_a__A = SubLObjectFactory.makeString("~A is not a ~A");
        $sym21$SBHL_TRUE_TV_P = SubLObjectFactory.makeSymbol("SBHL-TRUE-TV-P");
        $kw22$CERROR = SubLObjectFactory.makeKeyword("CERROR");
        $str23$continue_anyway = SubLObjectFactory.makeString("continue anyway");
        $kw24$WARN = SubLObjectFactory.makeKeyword("WARN");
        $str25$_A_is_not_a_valid__sbhl_type_erro = SubLObjectFactory.makeString("~A is not a valid *sbhl-type-error-action* value");
        $str26$_A_is_neither_SET_P_nor_LISTP_ = SubLObjectFactory.makeString("~A is neither SET-P nor LISTP.");
        $str27$attempting_to_bind_direction_link = SubLObjectFactory.makeString("attempting to bind direction link variable, to NIL. macro body not executed.");
        $str28$Node__a_does_not_pass_sbhl_type_t = SubLObjectFactory.makeString("Node ~a does not pass sbhl-type-test ~a~%");
        $kw29$REMOVAL_GENLPREDS_PRED_INDEX_POS = SubLObjectFactory.makeKeyword("REMOVAL-GENLPREDS-PRED-INDEX-POS");
        $list30 = ConsesLow.list(new SubLObject[] { SubLObjectFactory.makeKeyword("SENSE"), SubLObjectFactory.makeKeyword("POS"), SubLObjectFactory.makeKeyword("ARITY"), removal_modules_genlpreds_lookup.NIL, SubLObjectFactory.makeKeyword("REQUIRED-PATTERN"), ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("AND"), (SubLObject)ConsesLow.cons((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("TEST"), (SubLObject)SubLObjectFactory.makeSymbol("NON-HL-PREDICATE-P")), (SubLObject)SubLObjectFactory.makeKeyword("ANYTHING")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("NOT"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("TEST"), (SubLObject)SubLObjectFactory.makeSymbol("ASENT-HAS-INDEXED-TERM-ARG-P"))), (SubLObject)ConsesLow.cons((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("TEST"), (SubLObject)SubLObjectFactory.makeSymbol("INFERENCE-SOME-SPEC-PRED-OR-INVERSE?")), (SubLObject)SubLObjectFactory.makeKeyword("ANYTHING"))), SubLObjectFactory.makeKeyword("COST"), SubLObjectFactory.makeSymbol("REMOVAL-GENLPREDS-PRED-INDEX-POS-COST"), SubLObjectFactory.makeKeyword("COMPLETENESS"), SubLObjectFactory.makeKeyword("INCOMPLETE"), SubLObjectFactory.makeKeyword("INPUT-EXTRACT-PATTERN"), ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("TEMPLATE"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("BIND"), (SubLObject)SubLObjectFactory.makeSymbol("ASENT")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("VALUE"), (SubLObject)SubLObjectFactory.makeSymbol("ASENT"))), SubLObjectFactory.makeKeyword("OUTPUT-GENERATE-PATTERN"), ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("CALL"), (SubLObject)SubLObjectFactory.makeSymbol("REMOVAL-GENLPREDS-PRED-INDEX-POS-ITERATOR"), (SubLObject)SubLObjectFactory.makeKeyword("INPUT")), SubLObjectFactory.makeKeyword("OUTPUT-DECODE-PATTERN"), ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("TEMPLATE"), (SubLObject)ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("BIND"), (SubLObject)SubLObjectFactory.makeSymbol("BINDINGS")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("BIND"), (SubLObject)SubLObjectFactory.makeSymbol("ASSERTION"))), (SubLObject)ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("VALUE"), (SubLObject)SubLObjectFactory.makeSymbol("BINDINGS")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("VALUE"), (SubLObject)SubLObjectFactory.makeSymbol("ASSERTION")))), SubLObjectFactory.makeKeyword("OUTPUT-CONSTRUCT-PATTERN"), ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("CALL"), (SubLObject)SubLObjectFactory.makeSymbol("SUBST-BINDINGS"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("VALUE"), (SubLObject)SubLObjectFactory.makeSymbol("BINDINGS")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("VALUE"), (SubLObject)SubLObjectFactory.makeSymbol("ASENT"))), SubLObjectFactory.makeKeyword("SUPPORT-PATTERN"), ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("CALL"), (SubLObject)SubLObjectFactory.makeSymbol("REMOVAL-GENLPREDS-LOOKUP-SUPPORTS"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("VALUE"), (SubLObject)SubLObjectFactory.makeSymbol("ASENT")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("VALUE"), (SubLObject)SubLObjectFactory.makeSymbol("ASSERTION")), (SubLObject)SubLObjectFactory.makeKeyword("POS")), SubLObjectFactory.makeKeyword("DOCUMENTATION"), SubLObjectFactory.makeString("(<predicate> <non-indexed-term> ... <non-indexed-term>)\nusing true assertions using spec-preds of <predicate>"), SubLObjectFactory.makeKeyword("EXAMPLE"), SubLObjectFactory.makeString("(#$spatiallyIntersects ?WHAT ?WHAT-ELSE)") });
        $kw31$REMOVAL_GENLPREDS_PRED_INDEX_NEG = SubLObjectFactory.makeKeyword("REMOVAL-GENLPREDS-PRED-INDEX-NEG");
        $list32 = ConsesLow.list(new SubLObject[] { SubLObjectFactory.makeKeyword("SENSE"), SubLObjectFactory.makeKeyword("NEG"), SubLObjectFactory.makeKeyword("ARITY"), removal_modules_genlpreds_lookup.NIL, SubLObjectFactory.makeKeyword("REQUIRED-PATTERN"), ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("AND"), (SubLObject)ConsesLow.cons((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("TEST"), (SubLObject)SubLObjectFactory.makeSymbol("NON-HL-PREDICATE-P")), (SubLObject)SubLObjectFactory.makeKeyword("ANYTHING")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("NOT"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("TEST"), (SubLObject)SubLObjectFactory.makeSymbol("ASENT-HAS-INDEXED-TERM-ARG-P"))), (SubLObject)ConsesLow.cons((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("TEST"), (SubLObject)SubLObjectFactory.makeSymbol("INFERENCE-SOME-GENL-PRED-OR-INVERSE?")), (SubLObject)SubLObjectFactory.makeKeyword("ANYTHING"))), SubLObjectFactory.makeKeyword("COST"), SubLObjectFactory.makeSymbol("REMOVAL-GENLPREDS-PRED-INDEX-NEG-COST"), SubLObjectFactory.makeKeyword("COMPLETENESS-PATTERN"), ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("CALL"), (SubLObject)SubLObjectFactory.makeSymbol("REMOVAL-GENLPREDS-PRED-INDEX-NEG-COMPLETENESS"), (SubLObject)SubLObjectFactory.makeKeyword("INPUT")), SubLObjectFactory.makeKeyword("INPUT-EXTRACT-PATTERN"), ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("TEMPLATE"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("BIND"), (SubLObject)SubLObjectFactory.makeSymbol("ASENT")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("VALUE"), (SubLObject)SubLObjectFactory.makeSymbol("ASENT"))), SubLObjectFactory.makeKeyword("OUTPUT-GENERATE-PATTERN"), ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("CALL"), (SubLObject)SubLObjectFactory.makeSymbol("REMOVAL-GENLPREDS-PRED-INDEX-NEG-ITERATOR"), (SubLObject)SubLObjectFactory.makeKeyword("INPUT")), SubLObjectFactory.makeKeyword("OUTPUT-DECODE-PATTERN"), ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("TEMPLATE"), (SubLObject)ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("BIND"), (SubLObject)SubLObjectFactory.makeSymbol("BINDINGS")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("BIND"), (SubLObject)SubLObjectFactory.makeSymbol("ASSERTION"))), (SubLObject)ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("VALUE"), (SubLObject)SubLObjectFactory.makeSymbol("BINDINGS")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("VALUE"), (SubLObject)SubLObjectFactory.makeSymbol("ASSERTION")))), SubLObjectFactory.makeKeyword("OUTPUT-CONSTRUCT-PATTERN"), ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("CALL"), (SubLObject)SubLObjectFactory.makeSymbol("SUBST-BINDINGS"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("VALUE"), (SubLObject)SubLObjectFactory.makeSymbol("BINDINGS")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("VALUE"), (SubLObject)SubLObjectFactory.makeSymbol("ASENT"))), SubLObjectFactory.makeKeyword("SUPPORT-PATTERN"), ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("CALL"), (SubLObject)SubLObjectFactory.makeSymbol("REMOVAL-GENLPREDS-LOOKUP-SUPPORTS"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("VALUE"), (SubLObject)SubLObjectFactory.makeSymbol("ASENT")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("VALUE"), (SubLObject)SubLObjectFactory.makeSymbol("ASSERTION")), (SubLObject)SubLObjectFactory.makeKeyword("NEG")), SubLObjectFactory.makeKeyword("DOCUMENTATION"), SubLObjectFactory.makeString("(#$not (<predicate> <non-indexed-term> ... <non-indexed-term> ))\nusing false assertions using genl-preds of <predicate>"), SubLObjectFactory.makeKeyword("EXAMPLE"), SubLObjectFactory.makeString("(#$not (#$spatiallyIntersects ?WHAT ?WHAT-ELSE))") });
        $kw33$REMOVAL_GENLINVERSE_LOOKUP_POS = SubLObjectFactory.makeKeyword("REMOVAL-GENLINVERSE-LOOKUP-POS");
        $list34 = ConsesLow.list(new SubLObject[] { SubLObjectFactory.makeKeyword("SENSE"), SubLObjectFactory.makeKeyword("POS"), SubLObjectFactory.makeKeyword("ARITY"), removal_modules_genlpreds_lookup.TWO_INTEGER, SubLObjectFactory.makeKeyword("REQUIRED-PATTERN"), ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("AND"), (SubLObject)ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("TEST"), (SubLObject)SubLObjectFactory.makeSymbol("NON-HL-PREDICATE-P")), (SubLObject)SubLObjectFactory.makeKeyword("ANYTHING"), (SubLObject)SubLObjectFactory.makeKeyword("ANYTHING")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("TEST"), (SubLObject)SubLObjectFactory.makeSymbol("ASENT-HAS-INDEXED-TERM-ARG-P")), (SubLObject)ConsesLow.cons((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("TEST"), (SubLObject)SubLObjectFactory.makeSymbol("INFERENCE-SOME-SPEC-PRED-OR-INVERSE?")), (SubLObject)SubLObjectFactory.makeKeyword("ANYTHING"))), SubLObjectFactory.makeKeyword("COST"), SubLObjectFactory.makeSymbol("REMOVAL-GENLINVERSE-LOOKUP-POS-COST"), SubLObjectFactory.makeKeyword("COMPLETENESS"), SubLObjectFactory.makeKeyword("INCOMPLETE"), SubLObjectFactory.makeKeyword("INPUT-EXTRACT-PATTERN"), ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("TEMPLATE"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("BIND"), (SubLObject)SubLObjectFactory.makeSymbol("ASENT")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("VALUE"), (SubLObject)SubLObjectFactory.makeSymbol("ASENT"))), SubLObjectFactory.makeKeyword("OUTPUT-GENERATE-PATTERN"), ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("CALL"), (SubLObject)SubLObjectFactory.makeSymbol("REMOVAL-GENLINVERSE-LOOKUP-POS-ITERATOR"), (SubLObject)SubLObjectFactory.makeKeyword("INPUT")), SubLObjectFactory.makeKeyword("OUTPUT-DECODE-PATTERN"), ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("TEMPLATE"), (SubLObject)ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("BIND"), (SubLObject)SubLObjectFactory.makeSymbol("BINDINGS")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("BIND"), (SubLObject)SubLObjectFactory.makeSymbol("ASSERTION"))), (SubLObject)ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("VALUE"), (SubLObject)SubLObjectFactory.makeSymbol("BINDINGS")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("VALUE"), (SubLObject)SubLObjectFactory.makeSymbol("ASSERTION")))), SubLObjectFactory.makeKeyword("OUTPUT-CONSTRUCT-PATTERN"), ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("CALL"), (SubLObject)SubLObjectFactory.makeSymbol("SUBST-BINDINGS"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("VALUE"), (SubLObject)SubLObjectFactory.makeSymbol("BINDINGS")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("VALUE"), (SubLObject)SubLObjectFactory.makeSymbol("ASENT"))), SubLObjectFactory.makeKeyword("SUPPORT-PATTERN"), ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("CALL"), (SubLObject)SubLObjectFactory.makeSymbol("REMOVAL-GENLINVERSE-LOOKUP-SUPPORTS"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("VALUE"), (SubLObject)SubLObjectFactory.makeSymbol("ASENT")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("VALUE"), (SubLObject)SubLObjectFactory.makeSymbol("ASSERTION")), (SubLObject)SubLObjectFactory.makeKeyword("POS")), SubLObjectFactory.makeKeyword("DOCUMENTATION"), SubLObjectFactory.makeString("(<predicate> <indexed-term> <whatever>) and \n(<predicate> <whatever> <indexed-term>) \nusing true assertions using spec-inverses of <predicate>") });
        $kw35$REMOVAL_GENLINVERSE_LOOKUP_NEG = SubLObjectFactory.makeKeyword("REMOVAL-GENLINVERSE-LOOKUP-NEG");
        $list36 = ConsesLow.list(new SubLObject[] { SubLObjectFactory.makeKeyword("SENSE"), SubLObjectFactory.makeKeyword("NEG"), SubLObjectFactory.makeKeyword("ARITY"), removal_modules_genlpreds_lookup.TWO_INTEGER, SubLObjectFactory.makeKeyword("REQUIRED-PATTERN"), ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("AND"), (SubLObject)ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("TEST"), (SubLObject)SubLObjectFactory.makeSymbol("NON-HL-PREDICATE-P")), (SubLObject)SubLObjectFactory.makeKeyword("ANYTHING"), (SubLObject)SubLObjectFactory.makeKeyword("ANYTHING")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("TEST"), (SubLObject)SubLObjectFactory.makeSymbol("ASENT-HAS-INDEXED-TERM-ARG-P")), (SubLObject)ConsesLow.cons((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("TEST"), (SubLObject)SubLObjectFactory.makeSymbol("INFERENCE-SOME-GENL-PRED-OR-INVERSE?")), (SubLObject)SubLObjectFactory.makeKeyword("ANYTHING"))), SubLObjectFactory.makeKeyword("COST"), SubLObjectFactory.makeSymbol("REMOVAL-GENLINVERSE-LOOKUP-NEG-COST"), SubLObjectFactory.makeKeyword("COMPLETENESS-PATTERN"), ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("CALL"), (SubLObject)SubLObjectFactory.makeSymbol("REMOVAL-GENLINVERSE-LOOKUP-NEG-COMPLETENESS"), (SubLObject)SubLObjectFactory.makeKeyword("INPUT")), SubLObjectFactory.makeKeyword("INPUT-EXTRACT-PATTERN"), ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("TEMPLATE"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("BIND"), (SubLObject)SubLObjectFactory.makeSymbol("ASENT")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("VALUE"), (SubLObject)SubLObjectFactory.makeSymbol("ASENT"))), SubLObjectFactory.makeKeyword("OUTPUT-GENERATE-PATTERN"), ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("CALL"), (SubLObject)SubLObjectFactory.makeSymbol("REMOVAL-GENLINVERSE-LOOKUP-NEG-ITERATOR"), (SubLObject)SubLObjectFactory.makeKeyword("INPUT")), SubLObjectFactory.makeKeyword("OUTPUT-DECODE-PATTERN"), ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("TEMPLATE"), (SubLObject)ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("BIND"), (SubLObject)SubLObjectFactory.makeSymbol("BINDINGS")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("BIND"), (SubLObject)SubLObjectFactory.makeSymbol("ASSERTION"))), (SubLObject)ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("VALUE"), (SubLObject)SubLObjectFactory.makeSymbol("BINDINGS")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("VALUE"), (SubLObject)SubLObjectFactory.makeSymbol("ASSERTION")))), SubLObjectFactory.makeKeyword("OUTPUT-CONSTRUCT-PATTERN"), ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("CALL"), (SubLObject)SubLObjectFactory.makeSymbol("SUBST-BINDINGS"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("VALUE"), (SubLObject)SubLObjectFactory.makeSymbol("BINDINGS")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("VALUE"), (SubLObject)SubLObjectFactory.makeSymbol("ASENT"))), SubLObjectFactory.makeKeyword("SUPPORT-PATTERN"), ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("CALL"), (SubLObject)SubLObjectFactory.makeSymbol("REMOVAL-GENLINVERSE-LOOKUP-SUPPORTS"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("VALUE"), (SubLObject)SubLObjectFactory.makeSymbol("ASENT")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("VALUE"), (SubLObject)SubLObjectFactory.makeSymbol("ASSERTION")), (SubLObject)SubLObjectFactory.makeKeyword("NEG")), SubLObjectFactory.makeKeyword("DOCUMENTATION"), SubLObjectFactory.makeString("(#$not (<predicate> <indexed-term> <whatever>)) and \n(#$not (<predicate> <whatever> <indexed-term>))\nusing false assertions using genl-inverses of <predicate>") });
        $kw37$REMOVAL_GENLINVERSE_PRED_INDEX_POS = SubLObjectFactory.makeKeyword("REMOVAL-GENLINVERSE-PRED-INDEX-POS");
        $list38 = ConsesLow.list(new SubLObject[] { SubLObjectFactory.makeKeyword("SENSE"), SubLObjectFactory.makeKeyword("POS"), SubLObjectFactory.makeKeyword("ARITY"), removal_modules_genlpreds_lookup.TWO_INTEGER, SubLObjectFactory.makeKeyword("REQUIRED-PATTERN"), ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("AND"), (SubLObject)ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("TEST"), (SubLObject)SubLObjectFactory.makeSymbol("NON-HL-PREDICATE-P")), (SubLObject)SubLObjectFactory.makeKeyword("ANYTHING"), (SubLObject)SubLObjectFactory.makeKeyword("ANYTHING")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("NOT"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("TEST"), (SubLObject)SubLObjectFactory.makeSymbol("ASENT-HAS-INDEXED-TERM-ARG-P"))), (SubLObject)ConsesLow.cons((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("TEST"), (SubLObject)SubLObjectFactory.makeSymbol("INFERENCE-SOME-SPEC-PRED-OR-INVERSE?")), (SubLObject)SubLObjectFactory.makeKeyword("ANYTHING"))), SubLObjectFactory.makeKeyword("COST"), SubLObjectFactory.makeSymbol("REMOVAL-GENLINVERSE-PRED-INDEX-POS-COST"), SubLObjectFactory.makeKeyword("COMPLETENESS"), SubLObjectFactory.makeKeyword("INCOMPLETE"), SubLObjectFactory.makeKeyword("INPUT-EXTRACT-PATTERN"), ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("TEMPLATE"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("BIND"), (SubLObject)SubLObjectFactory.makeSymbol("ASENT")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("VALUE"), (SubLObject)SubLObjectFactory.makeSymbol("ASENT"))), SubLObjectFactory.makeKeyword("OUTPUT-GENERATE-PATTERN"), ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("CALL"), (SubLObject)SubLObjectFactory.makeSymbol("REMOVAL-GENLINVERSE-PRED-INDEX-POS-ITERATOR"), (SubLObject)SubLObjectFactory.makeKeyword("INPUT")), SubLObjectFactory.makeKeyword("OUTPUT-DECODE-PATTERN"), ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("TEMPLATE"), (SubLObject)ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("BIND"), (SubLObject)SubLObjectFactory.makeSymbol("BINDINGS")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("BIND"), (SubLObject)SubLObjectFactory.makeSymbol("ASSERTION"))), (SubLObject)ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("VALUE"), (SubLObject)SubLObjectFactory.makeSymbol("BINDINGS")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("VALUE"), (SubLObject)SubLObjectFactory.makeSymbol("ASSERTION")))), SubLObjectFactory.makeKeyword("OUTPUT-CONSTRUCT-PATTERN"), ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("CALL"), (SubLObject)SubLObjectFactory.makeSymbol("SUBST-BINDINGS"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("VALUE"), (SubLObject)SubLObjectFactory.makeSymbol("BINDINGS")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("VALUE"), (SubLObject)SubLObjectFactory.makeSymbol("ASENT"))), SubLObjectFactory.makeKeyword("SUPPORT-PATTERN"), ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("CALL"), (SubLObject)SubLObjectFactory.makeSymbol("REMOVAL-GENLINVERSE-LOOKUP-SUPPORTS"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("VALUE"), (SubLObject)SubLObjectFactory.makeSymbol("ASENT")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("VALUE"), (SubLObject)SubLObjectFactory.makeSymbol("ASSERTION")), (SubLObject)SubLObjectFactory.makeKeyword("POS")), SubLObjectFactory.makeKeyword("DOCUMENTATION"), SubLObjectFactory.makeString("(<predicate> <non-indexed-term> <non-indexed-term> )\nusing true assertions using spec-inverses of <predicate>") });
        $kw39$REMOVAL_GENLINVERSE_PRED_INDEX_NEG = SubLObjectFactory.makeKeyword("REMOVAL-GENLINVERSE-PRED-INDEX-NEG");
        $list40 = ConsesLow.list(new SubLObject[] { SubLObjectFactory.makeKeyword("SENSE"), SubLObjectFactory.makeKeyword("NEG"), SubLObjectFactory.makeKeyword("ARITY"), removal_modules_genlpreds_lookup.TWO_INTEGER, SubLObjectFactory.makeKeyword("REQUIRED-PATTERN"), ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("AND"), (SubLObject)ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("TEST"), (SubLObject)SubLObjectFactory.makeSymbol("NON-HL-PREDICATE-P")), (SubLObject)SubLObjectFactory.makeKeyword("ANYTHING"), (SubLObject)SubLObjectFactory.makeKeyword("ANYTHING")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("NOT"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("TEST"), (SubLObject)SubLObjectFactory.makeSymbol("ASENT-HAS-INDEXED-TERM-ARG-P"))), (SubLObject)ConsesLow.cons((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("TEST"), (SubLObject)SubLObjectFactory.makeSymbol("INFERENCE-SOME-GENL-PRED-OR-INVERSE?")), (SubLObject)SubLObjectFactory.makeKeyword("ANYTHING"))), SubLObjectFactory.makeKeyword("COST"), SubLObjectFactory.makeSymbol("REMOVAL-GENLINVERSE-PRED-INDEX-NEG-COST"), SubLObjectFactory.makeKeyword("COMPLETENESS-PATTERN"), ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("CALL"), (SubLObject)SubLObjectFactory.makeSymbol("REMOVAL-GENLINVERSE-PRED-INDEX-NEG-COMPLETENESS"), (SubLObject)SubLObjectFactory.makeKeyword("INPUT")), SubLObjectFactory.makeKeyword("INPUT-EXTRACT-PATTERN"), ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("TEMPLATE"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("BIND"), (SubLObject)SubLObjectFactory.makeSymbol("ASENT")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("VALUE"), (SubLObject)SubLObjectFactory.makeSymbol("ASENT"))), SubLObjectFactory.makeKeyword("OUTPUT-GENERATE-PATTERN"), ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("CALL"), (SubLObject)SubLObjectFactory.makeSymbol("REMOVAL-GENLINVERSE-PRED-INDEX-NEG-ITERATOR"), (SubLObject)SubLObjectFactory.makeKeyword("INPUT")), SubLObjectFactory.makeKeyword("OUTPUT-DECODE-PATTERN"), ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("TEMPLATE"), (SubLObject)ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("BIND"), (SubLObject)SubLObjectFactory.makeSymbol("BINDINGS")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("BIND"), (SubLObject)SubLObjectFactory.makeSymbol("ASSERTION"))), (SubLObject)ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("VALUE"), (SubLObject)SubLObjectFactory.makeSymbol("BINDINGS")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("VALUE"), (SubLObject)SubLObjectFactory.makeSymbol("ASSERTION")))), SubLObjectFactory.makeKeyword("OUTPUT-CONSTRUCT-PATTERN"), ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("CALL"), (SubLObject)SubLObjectFactory.makeSymbol("SUBST-BINDINGS"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("VALUE"), (SubLObject)SubLObjectFactory.makeSymbol("BINDINGS")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("VALUE"), (SubLObject)SubLObjectFactory.makeSymbol("ASENT"))), SubLObjectFactory.makeKeyword("SUPPORT-PATTERN"), ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("CALL"), (SubLObject)SubLObjectFactory.makeSymbol("REMOVAL-GENLINVERSE-LOOKUP-SUPPORTS"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("VALUE"), (SubLObject)SubLObjectFactory.makeSymbol("ASENT")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("VALUE"), (SubLObject)SubLObjectFactory.makeSymbol("ASSERTION")), (SubLObject)SubLObjectFactory.makeKeyword("NEG")), SubLObjectFactory.makeKeyword("DOCUMENTATION"), SubLObjectFactory.makeString("(#$not (<predicate> <non-indexed-term> <non-indexed-term> ))\nusing false assertions using genl-inverses of <predicate>") });
        $sym41$INFERENCE_NEGATION_PREDICATE_ = SubLObjectFactory.makeSymbol("INFERENCE-NEGATION-PREDICATE?");
        $kw42$TRUE = SubLObjectFactory.makeKeyword("TRUE");
        $kw43$REMOVAL_NEGATIONPREDS_LOOKUP = SubLObjectFactory.makeKeyword("REMOVAL-NEGATIONPREDS-LOOKUP");
        $list44 = ConsesLow.list(new SubLObject[] { SubLObjectFactory.makeKeyword("SENSE"), SubLObjectFactory.makeKeyword("NEG"), SubLObjectFactory.makeKeyword("ARITY"), removal_modules_genlpreds_lookup.NIL, SubLObjectFactory.makeKeyword("REQUIRED-PATTERN"), ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("AND"), (SubLObject)ConsesLow.cons((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("TEST"), (SubLObject)SubLObjectFactory.makeSymbol("NON-HL-PREDICATE-P")), (SubLObject)SubLObjectFactory.makeKeyword("ANYTHING")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("TEST"), (SubLObject)SubLObjectFactory.makeSymbol("ASENT-HAS-INDEXED-TERM-ARG-P")), (SubLObject)ConsesLow.cons((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("TEST"), (SubLObject)SubLObjectFactory.makeSymbol("INFERENCE-SOME-NEGATION-PRED-OR-INVERSE?")), (SubLObject)SubLObjectFactory.makeKeyword("ANYTHING"))), SubLObjectFactory.makeKeyword("COST"), SubLObjectFactory.makeSymbol("REMOVAL-NEGATIONPREDS-LOOKUP-COST"), SubLObjectFactory.makeKeyword("COMPLETENESS-PATTERN"), ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("CALL"), (SubLObject)SubLObjectFactory.makeSymbol("REMOVAL-NEGATIONPREDS-LOOKUP-COMPLETENESS"), (SubLObject)SubLObjectFactory.makeKeyword("INPUT")), SubLObjectFactory.makeKeyword("INPUT-EXTRACT-PATTERN"), ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("TEMPLATE"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("BIND"), (SubLObject)SubLObjectFactory.makeSymbol("ASENT")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("VALUE"), (SubLObject)SubLObjectFactory.makeSymbol("ASENT"))), SubLObjectFactory.makeKeyword("OUTPUT-GENERATE-PATTERN"), ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("CALL"), (SubLObject)SubLObjectFactory.makeSymbol("REMOVAL-NEGATIONPREDS-LOOKUP-ITERATOR"), (SubLObject)SubLObjectFactory.makeKeyword("INPUT")), SubLObjectFactory.makeKeyword("OUTPUT-DECODE-PATTERN"), ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("TEMPLATE"), (SubLObject)ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("BIND"), (SubLObject)SubLObjectFactory.makeSymbol("BINDINGS")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("BIND"), (SubLObject)SubLObjectFactory.makeSymbol("ASSERTION"))), (SubLObject)ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("VALUE"), (SubLObject)SubLObjectFactory.makeSymbol("BINDINGS")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("VALUE"), (SubLObject)SubLObjectFactory.makeSymbol("ASSERTION")))), SubLObjectFactory.makeKeyword("OUTPUT-CONSTRUCT-PATTERN"), ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("CALL"), (SubLObject)SubLObjectFactory.makeSymbol("SUBST-BINDINGS"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("VALUE"), (SubLObject)SubLObjectFactory.makeSymbol("BINDINGS")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("VALUE"), (SubLObject)SubLObjectFactory.makeSymbol("ASENT"))), SubLObjectFactory.makeKeyword("SUPPORT-PATTERN"), ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("CALL"), (SubLObject)SubLObjectFactory.makeSymbol("REMOVAL-NEGATIONPREDS-LOOKUP-SUPPORTS"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("VALUE"), (SubLObject)SubLObjectFactory.makeSymbol("ASENT")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("VALUE"), (SubLObject)SubLObjectFactory.makeSymbol("ASSERTION"))), SubLObjectFactory.makeKeyword("DOCUMENTATION"), SubLObjectFactory.makeString("(#$not (<predicate> ... <indexed-term> ... ))\nusing true assertions using negation-preds of <predicate>") });
        $const45$negationPreds = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("negationPreds"));
        $kw46$NEGATIONPREDS = SubLObjectFactory.makeKeyword("NEGATIONPREDS");
        $sym47$INFERENCE_NEGATION_INVERSE_ = SubLObjectFactory.makeSymbol("INFERENCE-NEGATION-INVERSE?");
        $kw48$REMOVAL_NEGATIONINVERSE_LOOKUP = SubLObjectFactory.makeKeyword("REMOVAL-NEGATIONINVERSE-LOOKUP");
        $list49 = ConsesLow.list(new SubLObject[] { SubLObjectFactory.makeKeyword("SENSE"), SubLObjectFactory.makeKeyword("NEG"), SubLObjectFactory.makeKeyword("ARITY"), removal_modules_genlpreds_lookup.NIL, SubLObjectFactory.makeKeyword("REQUIRED-PATTERN"), ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("AND"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("ANYTHING"), (SubLObject)SubLObjectFactory.makeKeyword("ANYTHING"), (SubLObject)SubLObjectFactory.makeKeyword("ANYTHING")), (SubLObject)ConsesLow.cons((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("TEST"), (SubLObject)SubLObjectFactory.makeSymbol("NON-HL-PREDICATE-P")), (SubLObject)SubLObjectFactory.makeKeyword("ANYTHING")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("TEST"), (SubLObject)SubLObjectFactory.makeSymbol("ASENT-HAS-INDEXED-TERM-ARG-P")), (SubLObject)ConsesLow.cons((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("TEST"), (SubLObject)SubLObjectFactory.makeSymbol("INFERENCE-SOME-NEGATION-PRED-OR-INVERSE?")), (SubLObject)SubLObjectFactory.makeKeyword("ANYTHING"))), SubLObjectFactory.makeKeyword("COST"), SubLObjectFactory.makeSymbol("REMOVAL-NEGATIONPREDS-LOOKUP-COST"), SubLObjectFactory.makeKeyword("COMPLETENESS-PATTERN"), ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("CALL"), (SubLObject)SubLObjectFactory.makeSymbol("REMOVAL-NEGATIONPREDS-LOOKUP-COMPLETENESS"), (SubLObject)SubLObjectFactory.makeKeyword("INPUT")), SubLObjectFactory.makeKeyword("INPUT-EXTRACT-PATTERN"), ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("TEMPLATE"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("BIND"), (SubLObject)SubLObjectFactory.makeSymbol("ASENT")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("VALUE"), (SubLObject)SubLObjectFactory.makeSymbol("ASENT"))), SubLObjectFactory.makeKeyword("OUTPUT-GENERATE-PATTERN"), ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("CALL"), (SubLObject)SubLObjectFactory.makeSymbol("REMOVAL-NEGATIONINVERSE-LOOKUP-ITERATOR"), (SubLObject)SubLObjectFactory.makeKeyword("INPUT")), SubLObjectFactory.makeKeyword("OUTPUT-DECODE-PATTERN"), ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("TEMPLATE"), (SubLObject)ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("BIND"), (SubLObject)SubLObjectFactory.makeSymbol("BINDINGS")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("BIND"), (SubLObject)SubLObjectFactory.makeSymbol("ASSERTION"))), (SubLObject)ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("VALUE"), (SubLObject)SubLObjectFactory.makeSymbol("BINDINGS")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("VALUE"), (SubLObject)SubLObjectFactory.makeSymbol("ASSERTION")))), SubLObjectFactory.makeKeyword("OUTPUT-CONSTRUCT-PATTERN"), ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("CALL"), (SubLObject)SubLObjectFactory.makeSymbol("SUBST-BINDINGS"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("VALUE"), (SubLObject)SubLObjectFactory.makeSymbol("BINDINGS")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("VALUE"), (SubLObject)SubLObjectFactory.makeSymbol("ASENT"))), SubLObjectFactory.makeKeyword("SUPPORT-PATTERN"), ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("CALL"), (SubLObject)SubLObjectFactory.makeSymbol("REMOVAL-NEGATIONINVERSE-LOOKUP-SUPPORTS"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("VALUE"), (SubLObject)SubLObjectFactory.makeSymbol("ASENT")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("VALUE"), (SubLObject)SubLObjectFactory.makeSymbol("ASSERTION"))), SubLObjectFactory.makeKeyword("DOCUMENTATION"), SubLObjectFactory.makeString("(#$not (<predicate> ... <indexed-term> ... ))\n    using true assertions using negation-inverses of <predicate>") });
        $const50$negationInverse = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("negationInverse"));
    }
    
    public static final class $removal_genlpreds_lookup_pos_cost$UnaryFunction extends UnaryFunction
    {
        public $removal_genlpreds_lookup_pos_cost$UnaryFunction() {
            super(SubLTranslatedFile.extractFunctionNamed("REMOVAL-GENLPREDS-LOOKUP-POS-COST"));
        }
        
        @Override
		public SubLObject processItem(final SubLObject arg1) {
            return removal_modules_genlpreds_lookup.removal_genlpreds_lookup_pos_cost(arg1, (SubLObject)$removal_genlpreds_lookup_pos_cost$UnaryFunction.UNPROVIDED);
        }
    }
    
    public static final class $removal_genlpreds_lookup_pos_cost$BinaryFunction extends BinaryFunction
    {
        public $removal_genlpreds_lookup_pos_cost$BinaryFunction() {
            super(SubLTranslatedFile.extractFunctionNamed("REMOVAL-GENLPREDS-LOOKUP-POS-COST"));
        }
        
        @Override
		public SubLObject processItem(final SubLObject arg1, final SubLObject arg2) {
            return removal_modules_genlpreds_lookup.removal_genlpreds_lookup_pos_cost(arg1, arg2);
        }
    }
    
    public static final class $removal_genlpreds_lookup_pos_iterator$UnaryFunction extends UnaryFunction
    {
        public $removal_genlpreds_lookup_pos_iterator$UnaryFunction() {
            super(SubLTranslatedFile.extractFunctionNamed("REMOVAL-GENLPREDS-LOOKUP-POS-ITERATOR"));
        }
        
        @Override
		public SubLObject processItem(final SubLObject arg1) {
            return removal_modules_genlpreds_lookup.removal_genlpreds_lookup_pos_iterator(arg1);
        }
    }
    
    public static final class $removal_genlpreds_pred_index_pos_cost$UnaryFunction extends UnaryFunction
    {
        public $removal_genlpreds_pred_index_pos_cost$UnaryFunction() {
            super(SubLTranslatedFile.extractFunctionNamed("REMOVAL-GENLPREDS-PRED-INDEX-POS-COST"));
        }
        
        @Override
		public SubLObject processItem(final SubLObject arg1) {
            return removal_modules_genlpreds_lookup.removal_genlpreds_pred_index_pos_cost(arg1, (SubLObject)$removal_genlpreds_pred_index_pos_cost$UnaryFunction.UNPROVIDED);
        }
    }
    
    public static final class $removal_genlpreds_pred_index_pos_cost$BinaryFunction extends BinaryFunction
    {
        public $removal_genlpreds_pred_index_pos_cost$BinaryFunction() {
            super(SubLTranslatedFile.extractFunctionNamed("REMOVAL-GENLPREDS-PRED-INDEX-POS-COST"));
        }
        
        @Override
		public SubLObject processItem(final SubLObject arg1, final SubLObject arg2) {
            return removal_modules_genlpreds_lookup.removal_genlpreds_pred_index_pos_cost(arg1, arg2);
        }
    }
    
    public static final class $removal_genlinverse_lookup_pos_cost$UnaryFunction extends UnaryFunction
    {
        public $removal_genlinverse_lookup_pos_cost$UnaryFunction() {
            super(SubLTranslatedFile.extractFunctionNamed("REMOVAL-GENLINVERSE-LOOKUP-POS-COST"));
        }
        
        @Override
		public SubLObject processItem(final SubLObject arg1) {
            return removal_modules_genlpreds_lookup.removal_genlinverse_lookup_pos_cost(arg1, (SubLObject)$removal_genlinverse_lookup_pos_cost$UnaryFunction.UNPROVIDED);
        }
    }
    
    public static final class $removal_genlinverse_lookup_pos_cost$BinaryFunction extends BinaryFunction
    {
        public $removal_genlinverse_lookup_pos_cost$BinaryFunction() {
            super(SubLTranslatedFile.extractFunctionNamed("REMOVAL-GENLINVERSE-LOOKUP-POS-COST"));
        }
        
        @Override
		public SubLObject processItem(final SubLObject arg1, final SubLObject arg2) {
            return removal_modules_genlpreds_lookup.removal_genlinverse_lookup_pos_cost(arg1, arg2);
        }
    }
    
    public static final class $removal_genlinverse_lookup_pos_iterator$UnaryFunction extends UnaryFunction
    {
        public $removal_genlinverse_lookup_pos_iterator$UnaryFunction() {
            super(SubLTranslatedFile.extractFunctionNamed("REMOVAL-GENLINVERSE-LOOKUP-POS-ITERATOR"));
        }
        
        @Override
		public SubLObject processItem(final SubLObject arg1) {
            return removal_modules_genlpreds_lookup.removal_genlinverse_lookup_pos_iterator(arg1);
        }
    }
}

/*

	Total time: 2502 ms
	
*/