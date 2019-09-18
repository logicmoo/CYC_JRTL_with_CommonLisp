/**
 * Copyright (c) 1995 - 2019 Cycorp, Inc.  All rights reserved.
 */
package com.cyc.cycjava.cycl;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow.cons;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow.list;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow.listS;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow.nconc;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow.rplacd;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Functions.apply;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Functions.funcall;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Hashtables.clrhash;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Hashtables.gethash;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Hashtables.make_hash_table;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Hashtables.sethash;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Numbers.add;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Numbers.divide;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Numbers.multiply;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.PrintLow.format;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Sequences.length;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Sequences.nreverse;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Sequences.remove;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Sequences.remove_duplicates;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Sequences.remove_if;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Symbols.boundp;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Symbols.fboundp;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Symbols.get;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Symbols.put;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Symbols.remprop;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Symbols.set;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Symbols.symbol_function;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Symbols.symbol_name;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Symbols.symbol_plist;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Symbols.symbol_value;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Threads.$is_thread_performing_cleanupP$;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Time.get_universal_time;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Types.$suspend_type_checkingP$;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Values.arg2;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Values.multiple_value_list;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Values.resetMultipleValues;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.makeBoolean;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.makeDouble;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.makeInteger;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.makeKeyword;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.makeString;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.makeSymbol;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.conses_high.adjoin;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.conses_high.assoc;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.conses_high.cddr;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.conses_high.copy_list;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.conses_high.copy_tree;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.conses_high.member;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.conses_high.second;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.print_high.print;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.reader.bq_cons;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.streams_high.close;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.streams_high.terpri;
import static com.cyc.tool.subl.util.SubLFiles.declareFunction;
import static com.cyc.tool.subl.util.SubLFiles.deflexical;
import static com.cyc.tool.subl.util.SubLFiles.defparameter;

import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Environment;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Errors;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Filesys;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Sort;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Strings;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.SubLThread;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLList;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObject;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLProcess;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLString;
import com.cyc.tool.subl.jrtl.nativeCode.type.number.SubLFloat;
import com.cyc.tool.subl.jrtl.nativeCode.type.number.SubLInteger;
import com.cyc.tool.subl.jrtl.nativeCode.type.symbol.SubLSymbol;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.compatibility;
import com.cyc.tool.subl.util.SubLFile;
import com.cyc.tool.subl.util.SubLSystemTrampolineFile;
import com.cyc.tool.subl.util.SubLTranslatedFile;


/**
 * Copyright (c) 1995 - 2019 Cycorp, Inc.  All rights reserved.
 *  module:      KBI-UTILITIES
 *  source file: /cyc/top/cycl/kbi-utilities.lisp
 *  created:     2019/07/03 17:39:05
 */
public final class kbi_utilities extends SubLTranslatedFile implements V02 {
    // // Constructor
    private kbi_utilities() {
    }

    public static final SubLFile me = new kbi_utilities();


    // // Definitions
    // defparameter
    public static final SubLSymbol $mapping_reference_data$ = makeSymbol("*MAPPING-REFERENCE-DATA*");

    public static final SubLObject constrains_arg(SubLObject constraint_pred, SubLObject mt) {
        if (mt == UNPROVIDED) {
            mt = NIL;
        }
        if (NIL != forts.fort_p(constraint_pred)) {
            return kb_mapping_utilities.fpred_value_in_relevant_mts(constraint_pred, $$constrainsArg, mt, UNPROVIDED, UNPROVIDED, UNPROVIDED);
        }
        return NIL;
    }

    public static final SubLObject max_type_constrained_arg(SubLObject relation, SubLObject mt) {
        if (mt == UNPROVIDED) {
            mt = NIL;
        }
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            {
                SubLObject max = NIL;
                SubLObject mt_var = mt;
                {
                    SubLObject _prev_bind_0 = mt_relevance_macros.$relevant_mt_function$.currentBinding(thread);
                    SubLObject _prev_bind_1 = mt_relevance_macros.$mt$.currentBinding(thread);
                    SubLObject _prev_bind_2 = control_vars.$mapping_answer$.currentBinding(thread);
                    SubLObject _prev_bind_3 = control_vars.$mapping_data_1$.currentBinding(thread);
                    try {
                        mt_relevance_macros.$relevant_mt_function$.bind(mt_relevance_macros.possibly_in_mt_determine_function(mt_var), thread);
                        mt_relevance_macros.$mt$.bind(mt_relevance_macros.possibly_in_mt_determine_mt(mt_var), thread);
                        control_vars.$mapping_answer$.bind(MINUS_ONE_INTEGER, thread);
                        control_vars.$mapping_data_1$.bind(relation, thread);
                        isa.map_all_instances(symbol_function(GATHER_MAX_CONSTRAINED_ARG), $$ArgIsaBinaryPredicate, UNPROVIDED, UNPROVIDED);
                        isa.map_all_instances(symbol_function(GATHER_MAX_CONSTRAINED_ARG), $$InterArgIsaPredicate, UNPROVIDED, UNPROVIDED);
                        isa.map_all_instances(symbol_function(GATHER_MAX_CONSTRAINED_ARG), $$ArgGenlBinaryPredicate, UNPROVIDED, UNPROVIDED);
                        isa.map_all_instances(symbol_function(GATHER_MAX_CONSTRAINED_ARG), $$InterArgGenlPredicate, UNPROVIDED, UNPROVIDED);
                        max = control_vars.$mapping_answer$.getDynamicValue(thread);
                    } finally {
                        control_vars.$mapping_data_1$.rebind(_prev_bind_3, thread);
                        control_vars.$mapping_answer$.rebind(_prev_bind_2, thread);
                        mt_relevance_macros.$mt$.rebind(_prev_bind_1, thread);
                        mt_relevance_macros.$relevant_mt_function$.rebind(_prev_bind_0, thread);
                    }
                }
                if (NIL != el_utilities.valid_arity_p(max)) {
                    return max;
                }
            }
            return NIL;
        }
    }

    public static final SubLObject gather_max_constrained_arg(SubLObject arg_type_pred) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            kb_mapping.map_gaf_arg_index(symbol_function(ACCUMULATE_MAX_CONSTRAINED_ARG), control_vars.$mapping_data_1$.getDynamicValue(thread), ONE_INTEGER, arg_type_pred, UNPROVIDED, UNPROVIDED);
            return control_vars.$mapping_answer$.getDynamicValue(thread);
        }
    }

    public static final SubLObject accumulate_max_constrained_arg(SubLObject assertion) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            if (NIL != assertions_high.gaf_assertionP(assertion)) {
                {
                    SubLObject arg = constrains_arg(assertions_high.gaf_arg0(assertion), assertions_high.assertion_mt(assertion));
                    if (!arg.numE(ZERO_INTEGER)) {
                        if (NIL != el_utilities.valid_arity_p(arg)) {
                            if (arg.numG(control_vars.$mapping_answer$.getDynamicValue(thread))) {
                                control_vars.$mapping_answer$.setDynamicValue(arg, thread);
                            }
                        }
                    }
                }
            }
            return control_vars.$mapping_answer$.getDynamicValue(thread);
        }
    }

    /**
     * is OBJECT a known kbi module?
     */
    public static final SubLObject kbi_moduleP(SubLObject v_object) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            return subl_promotions.memberP(v_object, kbi_vars.$kbi_modules$.getDynamicValue(thread), UNPROVIDED, UNPROVIDED);
        }
    }

    /**
     * is OBJECT a valid attribute for an kbi module?
     */
    public static final SubLObject valid_kbi_attributeP(SubLObject v_object) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            return subl_promotions.memberP(v_object, kbi_vars.$kbi_module_attributes$.getDynamicValue(thread), UNPROVIDED, UNPROVIDED);
        }
    }

    public static final SubLObject validated_kbi_attributeP(SubLObject attribute, SubLObject attribute_test) {
        if (attribute_test == UNPROVIDED) {
            attribute_test = $sym7$VALID_KBI_ATTRIBUTE_;
        }
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            if (NIL != $suspend_type_checkingP$.getDynamicValue(thread)) {
                return T;
            } else {
                if (attribute_test.isFunctionSpec()) {
                    if (NIL != funcall(attribute_test, attribute)) {
                        return T;
                    } else {
                        kbi_cerror(TWO_INTEGER, $$$skip_attribute_and_continue, $str_alt9$_s_does_not_satisfy_kbi_attribute, attribute, attribute_test, UNPROVIDED, UNPROVIDED, UNPROVIDED);
                    }
                } else {
                    kbi_cerror(TWO_INTEGER, $$$skip_attribute_and_continue, $str_alt10$_s_is_used_as_an_kbi_attribute_te, attribute_test, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
                }
            }
            return NIL;
        }
    }

    public static final SubLObject validated_kbi_propertyP(SubLObject attribute, SubLObject value) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            if (NIL != $suspend_type_checkingP$.getDynamicValue(thread)) {
                return T;
            } else {
                {
                    SubLObject type_fn = get(attribute, $VALUE_TYPE, UNPROVIDED);
                    if (NIL != type_fn) {
                        if (type_fn.isFunctionSpec()) {
                            if (NIL != funcall(type_fn, value)) {
                                return T;
                            } else {
                                kbi_cerror(TWO_INTEGER, $$$skip_attribute_and_continue, $str_alt12$_s_does_not_satisfy_kbi_attribute, value, attribute, type_fn, UNPROVIDED, UNPROVIDED);
                            }
                        } else {
                            kbi_cerror(TWO_INTEGER, $$$skip_attribute_and_continue, $str_alt13$_s_appears_as_a__value_type_for_a, type_fn, attribute, UNPROVIDED, UNPROVIDED, UNPROVIDED);
                        }
                    } else {
                        {
                            SubLObject candidate_values = get(attribute, $CANDIDATE_VALUES, UNPROVIDED);
                            if (candidate_values.isList()) {
                                if (NIL != subl_promotions.memberP(value, candidate_values, UNPROVIDED, UNPROVIDED)) {
                                    return T;
                                } else {
                                    kbi_cerror(TWO_INTEGER, $$$skip_attribute_and_continue, $str_alt15$_s_is_not_among_attriubte__s_vali, value, attribute, candidate_values, UNPROVIDED, UNPROVIDED);
                                }
                            } else {
                                kbi_cerror(TWO_INTEGER, $$$skip_attribute_and_continue, $str_alt16$_s_appears_as_a__candidate_values, candidate_values, attribute, UNPROVIDED, UNPROVIDED, UNPROVIDED);
                            }
                        }
                    }
                }
            }
            return NIL;
        }
    }

    public static final SubLObject install_kbi_properties(SubLObject module, SubLObject v_properties, SubLObject attribute_test) {
        if (attribute_test == UNPROVIDED) {
            attribute_test = $sym7$VALID_KBI_ATTRIBUTE_;
        }
        {
            SubLObject attribute = NIL;
            SubLObject value = NIL;
            for (attribute = v_properties.first(), value = second(v_properties); NIL != v_properties; attribute = v_properties.first() , value = second(v_properties)) {
                set_module_property_int(module, attribute, value, attribute_test);
                v_properties = cddr(v_properties);
            }
            declare_kbi_module(module);
            return module;
        }
    }

    public static final SubLObject install_kbi_module(SubLObject module, SubLObject v_properties) {
        clear_kbi_module_properties(module);
        install_kbi_properties(module, v_properties, $sym7$VALID_KBI_ATTRIBUTE_);
        check_required_kbi_attributes(module);
        return module;
    }

    public static final SubLObject declare_kbi_module(SubLObject module) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            {
                SubLObject item_var = module;
                if (NIL == member(item_var, kbi_vars.$kbi_modules$.getDynamicValue(thread), symbol_function(EQL), symbol_function(IDENTITY))) {
                    kbi_vars.$kbi_modules$.setDynamicValue(cons(item_var, kbi_vars.$kbi_modules$.getDynamicValue(thread)), thread);
                }
            }
            {
                SubLObject domain = get(module, $KBI_DOMAIN, UNPROVIDED);
                if (NIL != domain) {
                    hash_table_utilities.pushnew_hash(domain, module, kbi_vars.$kbi_domain_modules$.getDynamicValue(thread), UNPROVIDED);
                } else {
                    kbi_cerror(TWO_INTEGER, $$$continue, $str_alt19$module__s_does_not_have_a__kbi_do, domain, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
                }
            }
            put(module, $CYC_SYMBOL, $KBI_MODULE);
            return NIL;
        }
    }

    public static final SubLObject clear_kbi_module_properties(SubLObject module) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            {
                SubLObject cdolist_list_var = kbi_vars.$kbi_module_attributes$.getDynamicValue(thread);
                SubLObject attribute = NIL;
                for (attribute = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , attribute = cdolist_list_var.first()) {
                    remprop(module, attribute);
                }
            }
            return NIL;
        }
    }

    public static final SubLObject check_required_kbi_attributes(SubLObject module) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            {
                SubLObject cdolist_list_var = kbi_vars.$kbi_module_attributes$.getDynamicValue(thread);
                SubLObject attribute = NIL;
                for (attribute = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , attribute = cdolist_list_var.first()) {
                    if (NIL == subl_promotions.memberP(attribute, symbol_plist(module), UNPROVIDED, UNPROVIDED)) {
                        if ($REQUIRED.eql(get(attribute, $NECESSITY, UNPROVIDED))) {
                            {
                                SubLObject v_default = get(attribute, $DEFAULT, UNPROVIDED);
                                if (NIL != v_default) {
                                    if (NIL != validated_kbi_propertyP(attribute, v_default)) {
                                        put(module, attribute, v_default);
                                    }
                                } else {
                                    kbi_cerror(TWO_INTEGER, $$$continue, $str_alt25$_s_does_not_have_a_value_for_requ, module, attribute, UNPROVIDED, UNPROVIDED, UNPROVIDED);
                                }
                            }
                        }
                    }
                }
            }
            return NIL;
        }
    }

    public static final SubLObject run_kbi_module(SubLObject module, SubLObject arg) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            {
                SubLObject resultP = kbi_module_resultP(module, arg);
                if (NIL != resultP) {
                    if (NIL != kbi_vars.$kbi_repairing_findingsP$.getDynamicValue(thread)) {
                        kbi_repair_result(arg, module);
                    } else
                        if (NIL != kbi_vars.$kbi_caching_findingsP$.getDynamicValue(thread)) {
                            kbi_cache_result(arg, module);
                        }

                }
                return resultP;
            }
        }
    }

    public static final SubLObject kbi_findingP(SubLObject module, SubLObject arg) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            {
                SubLObject predicate_fn = get(module, $KBI_PREDICATE_FN, UNPROVIDED);
                SubLObject result = NIL;
                if (predicate_fn.isFunctionSpec()) {
                    {
                        SubLObject _prev_bind_0 = kbi_macros.$kbi_module$.currentBinding(thread);
                        SubLObject _prev_bind_1 = kbi_macros.$kbi_arg$.currentBinding(thread);
                        SubLObject _prev_bind_2 = system_parameters.$suspend_sbhl_type_checkingP$.currentBinding(thread);
                        try {
                            kbi_macros.$kbi_module$.bind(module, thread);
                            kbi_macros.$kbi_arg$.bind(arg, thread);
                            system_parameters.$suspend_sbhl_type_checkingP$.bind(T, thread);
                            result = funcall(predicate_fn, arg);
                        } finally {
                            system_parameters.$suspend_sbhl_type_checkingP$.rebind(_prev_bind_2, thread);
                            kbi_macros.$kbi_arg$.rebind(_prev_bind_1, thread);
                            kbi_macros.$kbi_module$.rebind(_prev_bind_0, thread);
                        }
                    }
                } else {
                    kbi_cerror(THREE_INTEGER, $$$continue_anyway, $str_alt28$kbi_module__s_has_invalid_predica, module, predicate_fn, UNPROVIDED, UNPROVIDED, UNPROVIDED);
                }
                return result;
            }
        }
    }

    public static final SubLObject kbi_whyP(SubLObject module, SubLObject arg, SubLObject mode) {
        if (mode == UNPROVIDED) {
            mode = kbi_vars.$kbi_iXo_mode$.getDynamicValue();
        }
        return justify_kbi_module(module, arg, mode);
    }

    public static final SubLObject justify_kbi_module(SubLObject module, SubLObject arg, SubLObject mode) {
        if (mode == UNPROVIDED) {
            mode = kbi_vars.$kbi_iXo_mode$.getDynamicValue();
        }
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            {
                SubLObject justify_fn = get(module, $KBI_JUSTIFY_FN, UNPROVIDED);
                SubLObject result = NIL;
                if (justify_fn.isFunctionSpec()) {
                    {
                        SubLObject _prev_bind_0 = kbi_macros.$kbi_module$.currentBinding(thread);
                        SubLObject _prev_bind_1 = kbi_macros.$kbi_arg$.currentBinding(thread);
                        SubLObject _prev_bind_2 = system_parameters.$suspend_sbhl_type_checkingP$.currentBinding(thread);
                        try {
                            kbi_macros.$kbi_module$.bind(module, thread);
                            kbi_macros.$kbi_arg$.bind(arg, thread);
                            system_parameters.$suspend_sbhl_type_checkingP$.bind(T, thread);
                            result = funcall(justify_fn, arg, mode);
                        } finally {
                            system_parameters.$suspend_sbhl_type_checkingP$.rebind(_prev_bind_2, thread);
                            kbi_macros.$kbi_arg$.rebind(_prev_bind_1, thread);
                            kbi_macros.$kbi_module$.rebind(_prev_bind_0, thread);
                        }
                    }
                } else {
                    kbi_cerror(THREE_INTEGER, $$$continue_anyway, $str_alt30$kbi_module__s_has_invalid_conditi, module, justify_fn, UNPROVIDED, UNPROVIDED, UNPROVIDED);
                }
                return result;
            }
        }
    }

    public static final SubLObject kbi_why_verboseP(SubLObject module, SubLObject v_object) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            if (NIL != kbi_applies_toP(module, v_object)) {
                {
                    SubLObject data = NIL;
                    SubLObject result = NIL;
                    SubLObject evaluation_fn = get(module, $KBI_EVALUATION_FN, UNPROVIDED);
                    if (evaluation_fn.isFunctionSpec()) {
                        {
                            SubLObject _prev_bind_0 = kbi_macros.$kbi_result$.currentBinding(thread);
                            try {
                                kbi_macros.$kbi_result$.bind(NIL, thread);
                                {
                                    SubLObject error_message = NIL;
                                    try {
                                        {
                                            SubLObject _prev_bind_0_1 = Errors.$error_handler$.currentBinding(thread);
                                            try {
                                                Errors.$error_handler$.bind(CATCH_ERROR_MESSAGE_HANDLER, thread);
                                                try {
                                                    try {
                                                        funcall(evaluation_fn, v_object);
                                                    } finally {
                                                        {
                                                            SubLObject _prev_bind_0_2 = $is_thread_performing_cleanupP$.currentBinding(thread);
                                                            try {
                                                                $is_thread_performing_cleanupP$.bind(T, thread);
                                                                data = (kbi_macros.$kbi_result$.getDynamicValue(thread).isCons()) ? ((SubLObject) (nreverse(kbi_macros.$kbi_result$.getDynamicValue(thread)))) : kbi_macros.$kbi_result$.getDynamicValue(thread);
                                                            } finally {
                                                                $is_thread_performing_cleanupP$.rebind(_prev_bind_0_2, thread);
                                                            }
                                                        }
                                                    }
                                                } catch (Throwable catch_var) {
                                                    Errors.handleThrowable(catch_var, NIL);
                                                }
                                            } finally {
                                                Errors.$error_handler$.rebind(_prev_bind_0_1, thread);
                                            }
                                        }
                                    } catch (Throwable ccatch_env_var) {
                                        error_message = Errors.handleThrowable(ccatch_env_var, subl_macro_promotions.$catch_error_message_target$.getGlobalValue());
                                    }
                                    if (NIL != error_message) {
                                        kbi_macros.$kbi_errors$.setDynamicValue(cons(list($KBI_ERROR, kbi_macros.$kbi_module$.getDynamicValue(thread), kbi_macros.$kbi_arg$.getDynamicValue(thread), error_message), kbi_macros.$kbi_errors$.getDynamicValue(thread)), thread);
                                    }
                                }
                            } finally {
                                kbi_macros.$kbi_result$.rebind(_prev_bind_0, thread);
                            }
                        }
                        if (NIL != data) {
                            {
                                SubLObject justify_fn = get(module, $KBI_NL_VERBOSE_FN, UNPROVIDED);
                                if (justify_fn.isFunctionSpec()) {
                                    {
                                        SubLObject _prev_bind_0 = kbi_macros.$kbi_module$.currentBinding(thread);
                                        SubLObject _prev_bind_1 = kbi_macros.$kbi_arg$.currentBinding(thread);
                                        SubLObject _prev_bind_2 = system_parameters.$suspend_sbhl_type_checkingP$.currentBinding(thread);
                                        try {
                                            kbi_macros.$kbi_module$.bind(module, thread);
                                            kbi_macros.$kbi_arg$.bind(v_object, thread);
                                            system_parameters.$suspend_sbhl_type_checkingP$.bind(T, thread);
                                            result = funcall(justify_fn, v_object, data);
                                        } finally {
                                            system_parameters.$suspend_sbhl_type_checkingP$.rebind(_prev_bind_2, thread);
                                            kbi_macros.$kbi_arg$.rebind(_prev_bind_1, thread);
                                            kbi_macros.$kbi_module$.rebind(_prev_bind_0, thread);
                                        }
                                    }
                                }
                            }
                        }
                    }
                    return result;
                }
            }
            return NIL;
        }
    }

    public static final SubLObject kbi_module_resultP(SubLObject module, SubLObject arg) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            {
                SubLObject supplantedP = NIL;
                {
                    SubLObject _prev_bind_0 = kbi_vars.$kbi_disable_selection_filtersP$.currentBinding(thread);
                    try {
                        kbi_vars.$kbi_disable_selection_filtersP$.bind(T, thread);
                        if (NIL == supplantedP) {
                            {
                                SubLObject csome_list_var = get(module, $SUPPLANTED_BY, UNPROVIDED);
                                SubLObject supplanter = NIL;
                                for (supplanter = csome_list_var.first(); !((NIL != supplantedP) || (NIL == csome_list_var)); csome_list_var = csome_list_var.rest() , supplanter = csome_list_var.first()) {
                                    supplantedP = kbi_module_resultP(supplanter, arg);
                                }
                            }
                        }
                    } finally {
                        kbi_vars.$kbi_disable_selection_filtersP$.rebind(_prev_bind_0, thread);
                    }
                }
                if (NIL == supplantedP) {
                    return kbi_findingP(module, arg);
                }
            }
            return NIL;
        }
    }

    public static final SubLObject kbi_module_appliesP(SubLObject module, SubLObject arg) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            {
                SubLObject apply_fn = get(module, $KBI_APPLY_FN, UNPROVIDED);
                SubLObject result = NIL;
                if (apply_fn.isFunctionSpec()) {
                    {
                        SubLObject _prev_bind_0 = system_parameters.$suspend_sbhl_type_checkingP$.currentBinding(thread);
                        SubLObject _prev_bind_1 = mt_relevance_macros.$relevant_mt_function$.currentBinding(thread);
                        SubLObject _prev_bind_2 = mt_relevance_macros.$mt$.currentBinding(thread);
                        try {
                            system_parameters.$suspend_sbhl_type_checkingP$.bind(T, thread);
                            mt_relevance_macros.$relevant_mt_function$.bind(RELEVANT_MT_IS_EVERYTHING, thread);
                            mt_relevance_macros.$mt$.bind($$EverythingPSC, thread);
                            result = funcall(apply_fn, arg);
                        } finally {
                            mt_relevance_macros.$mt$.rebind(_prev_bind_2, thread);
                            mt_relevance_macros.$relevant_mt_function$.rebind(_prev_bind_1, thread);
                            system_parameters.$suspend_sbhl_type_checkingP$.rebind(_prev_bind_0, thread);
                        }
                    }
                } else {
                    kbi_cerror(THREE_INTEGER, $$$continue_anyway, $str_alt39$kbi_module__s_has_invalid_apply_f, module, apply_fn, UNPROVIDED, UNPROVIDED, UNPROVIDED);
                }
                return result;
            }
        }
    }

    public static final SubLObject kbi_repair_result(SubLObject result, SubLObject module) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            if (NIL != kbi_vars.$kbi_repairing_findingsP$.getDynamicValue(thread)) {
                {
                    SubLObject repair_fn = get(module, $KBI_REPAIR_FN, UNPROVIDED);
                    SubLObject repairedP = NIL;
                    if (repair_fn.isFunctionSpec()) {
                        funcall(repair_fn, result);
                        repairedP = makeBoolean(NIL == kbi_module_resultP(module, result));
                        if (NIL != repairedP) {
                            if (NIL != kbi_vars.$kbi_transmit_repairsP$.getDynamicValue(thread)) {
                                fi.fi_eval(list(repair_fn, result));
                            }
                        }
                    }
                    if (NIL != repairedP) {
                        kbi_cache_repair(result, module);
                    } else {
                        kbi_cache_result(result, module);
                    }
                }
            }
            return result;
        }
    }

    public static final SubLObject kbi_cache_result(SubLObject result, SubLObject module) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            if (NIL != kbi_vars.$kbi_caching_findingsP$.getDynamicValue(thread)) {
                {
                    SubLObject key = get(module, $KBI_CACHE_FN, UNPROVIDED);
                    SubLObject store = get(module, $KBI_RESULT_CACHE, UNPROVIDED);
                    if (NIL == fboundp(key)) {
                        key = get($KBI_CACHE_FN, $DEFAULT, UNPROVIDED);
                    }
                    if (NIL != store) {
                        if (NIL != boundp(store)) {
                            set(store, cons(funcall(key, result), symbol_value(store)));
                        } else {
                            kbi_cerror(TWO_INTEGER, $$$continue_anyway, $str_alt43$undefined__kbi_result_cache_for_m, module, store, UNPROVIDED, UNPROVIDED, UNPROVIDED);
                        }
                    } else {
                        kbi_cerror(TWO_INTEGER, $$$continue_anyway, $str_alt44$no__kbi_result_cache_for_module__, module, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
                    }
                }
            }
            return result;
        }
    }

    public static final SubLObject kbi_cache_repair(SubLObject result, SubLObject module) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            if (NIL != kbi_vars.$kbi_caching_findingsP$.getDynamicValue(thread)) {
                {
                    SubLObject key = get(module, $KBI_CACHE_FN, UNPROVIDED);
                    SubLObject store = get(module, $KBI_REPAIR_VAR, UNPROVIDED);
                    if (NIL == fboundp(key)) {
                        key = get($KBI_CACHE_FN, $DEFAULT, UNPROVIDED);
                    }
                    if (NIL != store) {
                        if (NIL != boundp(store)) {
                            set(store, cons(funcall(key, result), symbol_value(store)));
                        } else {
                            kbi_cerror(TWO_INTEGER, $$$continue_anyway, $str_alt46$unbound__kbi_repair_var_for_modul, module, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
                        }
                    } else {
                        kbi_cerror(TWO_INTEGER, $$$continue_anyway, $str_alt47$no__kbi_repair_var_for_module___s, module, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
                    }
                }
            }
            return result;
        }
    }

    public static final SubLObject kbi_required_satisfiedP(SubLObject module, SubLObject v_object) {
        {
            SubLObject required_fn = get(module, $KBI_REQUIRED_FN, UNPROVIDED);
            if (NIL == fboundp(required_fn)) {
                required_fn = get($KBI_REQUIRED_FN, $DEFAULT, UNPROVIDED);
            }
            if (NIL != fboundp(required_fn)) {
                return funcall(required_fn, v_object);
            } else {
                kbi_cerror(TWO_INTEGER, $$$continue_anyway, $str_alt49$unbound__kbi_required_fn_for_modu, module, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
            }
        }
        return NIL;
    }

    public static final SubLObject kbi_exceptionP(SubLObject module, SubLObject v_object) {
        {
            SubLObject exception_var = get(module, $KBI_EXCEPTIONS, UNPROVIDED);
            if (NIL != exception_var) {
                if (NIL != boundp(exception_var)) {
                    if (symbol_value(exception_var).isCons()) {
                        return subl_promotions.memberP(v_object, symbol_value(exception_var), UNPROVIDED, UNPROVIDED);
                    } else {
                        kbi_cerror(TWO_INTEGER, $$$continue_anyway, $str_alt51$invalid__kbi_exceptions_for_modul, module, exception_var, UNPROVIDED, UNPROVIDED, UNPROVIDED);
                    }
                } else {
                    kbi_cerror(TWO_INTEGER, $$$continue_anyway, $str_alt52$unbound__kbi_exceptions_for_modul, module, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
                }
            }
        }
        return NIL;
    }

    public static final SubLObject kbi_add_exception(SubLObject module, SubLObject result) {
        {
            SubLObject exception_var = get(module, $KBI_EXCEPTIONS, UNPROVIDED);
            if (NIL != exception_var) {
                if (NIL != boundp(exception_var)) {
                    if (symbol_value(exception_var).isCons()) {
                        set(exception_var, cons(result, symbol_value(exception_var)));
                        return length(symbol_value(exception_var));
                    } else {
                        kbi_cerror(TWO_INTEGER, $$$continue_anyway, $str_alt51$invalid__kbi_exceptions_for_modul, module, exception_var, UNPROVIDED, UNPROVIDED, UNPROVIDED);
                    }
                } else {
                    kbi_cerror(TWO_INTEGER, $$$continue_anyway, $str_alt52$unbound__kbi_exceptions_for_modul, module, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
                }
            }
        }
        return NIL;
    }

    public static final SubLObject kbi_remove_exception(SubLObject module, SubLObject result) {
        {
            SubLObject exception_var = get(module, $KBI_EXCEPTIONS, UNPROVIDED);
            if (NIL != exception_var) {
                if (NIL != boundp(exception_var)) {
                    if (symbol_value(exception_var).isCons()) {
                        set(exception_var, remove(result, symbol_value(exception_var), symbol_function(EQUAL), UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED));
                        return length(symbol_value(exception_var));
                    } else {
                        kbi_cerror(TWO_INTEGER, $$$continue_anyway, $str_alt51$invalid__kbi_exceptions_for_modul, module, exception_var, UNPROVIDED, UNPROVIDED, UNPROVIDED);
                    }
                } else {
                    kbi_cerror(TWO_INTEGER, $$$continue_anyway, $str_alt52$unbound__kbi_exceptions_for_modul, module, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
                }
            }
        }
        return NIL;
    }

    public static final SubLObject kbi_increment_count(SubLObject module) {
        {
            SubLObject var = get(module, $KBI_COUNT_CACHE, UNPROVIDED);
            if (NIL != boundp(var)) {
                if (symbol_value(var).isNumber()) {
                    set(var, add(ONE_INTEGER, symbol_value(var)));
                    return symbol_value(var);
                } else {
                    kbi_cerror(TWO_INTEGER, $$$continue_anyway, $str_alt54$invalid__kbi_count_cache_for_modu, module, var, UNPROVIDED, UNPROVIDED, UNPROVIDED);
                }
            } else {
                kbi_cerror(THREE_INTEGER, $$$continue_anyway, $str_alt55$kbi_module__s_has_invalid_count_c, module, var, UNPROVIDED, UNPROVIDED, UNPROVIDED);
            }
        }
        return NIL;
    }

    public static final SubLObject kbi_increment_time(SubLObject module, SubLObject time) {
        if (time.isNumber()) {
            {
                SubLObject var = get(module, $KBI_TIME_CACHE, UNPROVIDED);
                if (NIL != boundp(var)) {
                    if (symbol_value(var).isNumber()) {
                        set(var, add(time, symbol_value(var)));
                        return symbol_value(var);
                    } else {
                        kbi_cerror(TWO_INTEGER, $$$continue_anyway, $str_alt57$invalid__kbi_time_cache_for_modul, module, var, UNPROVIDED, UNPROVIDED, UNPROVIDED);
                    }
                } else {
                    kbi_cerror(THREE_INTEGER, $$$continue_anyway, $str_alt58$kbi_module__s_has_invalid_time_ca, module, var, UNPROVIDED, UNPROVIDED, UNPROVIDED);
                }
            }
        } else {
            kbi_cerror(THREE_INTEGER, $$$continue_anyway, $str_alt59$invalid_time_increment___s, time, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
        }
        return NIL;
    }

    public static final SubLObject define_kbi_attribute(SubLObject attribute, SubLObject v_properties) {
        clear_kbi_attribute_properties(attribute);
        install_kbi_attribute_properties(attribute, v_properties);
        return attribute;
    }

    public static final SubLObject declare_kbi_attribute(SubLObject attribute) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            {
                SubLObject item_var = attribute;
                if (NIL == member(item_var, kbi_vars.$kbi_module_attributes$.getDynamicValue(thread), symbol_function(EQL), symbol_function(IDENTITY))) {
                    kbi_vars.$kbi_module_attributes$.setDynamicValue(cons(item_var, kbi_vars.$kbi_module_attributes$.getDynamicValue(thread)), thread);
                }
            }
            put(attribute, $CYC_SYMBOL, $KBI_MODULE_ATTRIBUTE);
            return NIL;
        }
    }

    public static final SubLObject clear_kbi_attribute_properties(SubLObject attribute) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            {
                SubLObject cdolist_list_var = kbi_vars.$kbi_attribute_attributes$.getDynamicValue(thread);
                SubLObject meta_attribute = NIL;
                for (meta_attribute = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , meta_attribute = cdolist_list_var.first()) {
                    remprop(attribute, meta_attribute);
                }
            }
            return NIL;
        }
    }

    public static final SubLObject install_kbi_attribute_properties(SubLObject attribute, SubLObject v_properties) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            {
                SubLObject meta_attribute = NIL;
                SubLObject value = NIL;
                for (meta_attribute = v_properties.first(), value = second(v_properties); NIL != v_properties; meta_attribute = v_properties.first() , value = second(v_properties)) {
                    if (NIL != subl_promotions.memberP(meta_attribute, kbi_vars.$kbi_attribute_attributes$.getDynamicValue(thread), UNPROVIDED, UNPROVIDED)) {
                        put(attribute, meta_attribute, value);
                    } else {
                        kbi_cerror(TWO_INTEGER, $$$skip_attribute_and_continue, $str_alt61$_s_is_not_a_valid_kbi_meta_attrib, meta_attribute, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
                    }
                    v_properties = cddr(v_properties);
                }
                declare_kbi_attribute(attribute);
                return attribute;
            }
        }
    }

    public static final SubLObject define_kbi_domain_attribute(SubLObject attribute, SubLObject v_properties) {
        clear_kbi_domain_attribute_properties(attribute);
        install_kbi_domain_attribute_properties(attribute, v_properties);
        return attribute;
    }

    public static final SubLObject declare_kbi_domain_attribute(SubLObject attribute) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            {
                SubLObject item_var = attribute;
                if (NIL == member(item_var, kbi_vars.$kbi_domain_attributes$.getDynamicValue(thread), symbol_function(EQL), symbol_function(IDENTITY))) {
                    kbi_vars.$kbi_domain_attributes$.setDynamicValue(cons(item_var, kbi_vars.$kbi_domain_attributes$.getDynamicValue(thread)), thread);
                }
            }
            put(attribute, $CYC_SYMBOL, $KBI_DOMAIN_ATTRIBUTE);
            return NIL;
        }
    }

    public static final SubLObject clear_kbi_domain_attribute_properties(SubLObject attribute) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            {
                SubLObject cdolist_list_var = kbi_vars.$kbi_domain_attributes$.getDynamicValue(thread);
                SubLObject domain_attribute = NIL;
                for (domain_attribute = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , domain_attribute = cdolist_list_var.first()) {
                    remprop(attribute, domain_attribute);
                }
            }
            return NIL;
        }
    }

    public static final SubLObject install_kbi_domain_attribute_properties(SubLObject attribute, SubLObject v_properties) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            {
                SubLObject domain_attribute = NIL;
                SubLObject value = NIL;
                for (domain_attribute = v_properties.first(), value = second(v_properties); NIL != v_properties; domain_attribute = v_properties.first() , value = second(v_properties)) {
                    if (NIL != subl_promotions.memberP(domain_attribute, kbi_vars.$kbi_attribute_attributes$.getDynamicValue(thread), UNPROVIDED, UNPROVIDED)) {
                        put(attribute, domain_attribute, value);
                    } else {
                        kbi_cerror(TWO_INTEGER, $$$skip_attribute_and_continue, $str_alt63$_s_is_not_a_valid_kbi_domain_attr, domain_attribute, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
                    }
                    v_properties = cddr(v_properties);
                }
                declare_kbi_domain_attribute(attribute);
                return attribute;
            }
        }
    }

    public static final SubLObject kbi_domainP(SubLObject v_object) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            return subl_promotions.memberP(v_object, kbi_vars.$kbi_domains$.getDynamicValue(thread), UNPROVIDED, UNPROVIDED);
        }
    }

    public static final SubLObject define_kbi_domain(SubLObject domain, SubLObject v_properties) {
        clear_kbi_domain_properties(domain);
        install_kbi_domain_properties(domain, v_properties);
        return domain;
    }

    public static final SubLObject declare_kbi_domain(SubLObject domain) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            {
                SubLObject item_var = domain;
                if (NIL == member(item_var, kbi_vars.$kbi_domains$.getDynamicValue(thread), symbol_function(EQL), symbol_function(IDENTITY))) {
                    kbi_vars.$kbi_domains$.setDynamicValue(cons(item_var, kbi_vars.$kbi_domains$.getDynamicValue(thread)), thread);
                }
            }
            put(domain, $CYC_SYMBOL, $KBI_DOMAIN);
            clear_cached_kbi_sub_domain_modules();
            clear_kbi_external_sub_domain_modules();
            clear_kbi_accessible_modules();
            clear_kbi_all_sub_domains();
            return NIL;
        }
    }

    public static final SubLObject clear_kbi_domain_properties(SubLObject domain) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            {
                SubLObject cdolist_list_var = kbi_vars.$kbi_domain_attributes$.getDynamicValue(thread);
                SubLObject attribute = NIL;
                for (attribute = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , attribute = cdolist_list_var.first()) {
                    remprop(domain, attribute);
                }
            }
            return NIL;
        }
    }

    public static final SubLObject install_kbi_domain_properties(SubLObject domain, SubLObject v_properties) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            {
                SubLObject attribute = NIL;
                SubLObject value = NIL;
                for (attribute = v_properties.first(), value = second(v_properties); NIL != v_properties; attribute = v_properties.first() , value = second(v_properties)) {
                    if (NIL != subl_promotions.memberP(attribute, kbi_vars.$kbi_domain_attributes$.getDynamicValue(thread), UNPROVIDED, UNPROVIDED)) {
                        set_kbi_property_int(domain, attribute, value);
                    } else {
                        kbi_cerror(TWO_INTEGER, $$$skip_attribute_and_continue, $str_alt63$_s_is_not_a_valid_kbi_domain_attr, attribute, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
                    }
                    v_properties = cddr(v_properties);
                }
                declare_kbi_domain(domain);
                return domain;
            }
        }
    }

    public static final SubLObject in_kbi_module_domainP(SubLObject v_object, SubLObject module) {
        return kbi_applies_toP(module, v_object);
    }

    public static final SubLObject kbi_applies_toP(SubLObject module, SubLObject v_object) {
        if (((NIL != kbi_moduleP(module)) && (NIL != in_kbi_domainP(v_object, get(module, $KBI_DOMAIN, UNPROVIDED)))) && (NIL != kbi_required_satisfiedP(module, v_object))) {
            if (NIL == kbi_exceptionP(module, v_object)) {
                return T;
            }
        }
        return NIL;
    }

    public static final SubLObject diagnose_qua_domain(SubLObject v_object, SubLObject domain) {
        {
            SubLObject hits = NIL;
            SubLObject misses = NIL;
            if (NIL != in_kbi_domainP(v_object, domain)) {
                {
                    SubLObject cdolist_list_var = kbi_domain_modules(domain);
                    SubLObject module = NIL;
                    for (module = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , module = cdolist_list_var.first()) {
                        if (NIL != kbi_module_appliesP(module, v_object)) {
                            if (NIL != run_kbi_module(module, v_object)) {
                                hits = cons(module, hits);
                            } else {
                                misses = cons(module, misses);
                            }
                        }
                    }
                }
            }
            return hits;
        }
    }

    public static final SubLObject diagnose_qua_super_domains(SubLObject v_object, SubLObject domain) {
        {
            SubLObject hits = NIL;
            SubLObject misses = NIL;
            if (NIL != in_kbi_domainP(v_object, domain)) {
                {
                    SubLObject cdolist_list_var = kbi_super_domain_modules(domain);
                    SubLObject module = NIL;
                    for (module = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , module = cdolist_list_var.first()) {
                        if (NIL != kbi_module_appliesP(module, v_object)) {
                            if (NIL != run_kbi_module(module, v_object)) {
                                hits = cons(module, hits);
                            } else {
                                misses = cons(module, misses);
                            }
                        }
                    }
                }
            }
            return hits;
        }
    }

    public static final SubLObject diagnose_qua_sub_domains(SubLObject v_object, SubLObject domain) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            {
                SubLObject hits = NIL;
                SubLObject misses = NIL;
                if (NIL != in_kbi_domainP(v_object, domain)) {
                    {
                        SubLObject cdolist_list_var = kbi_sub_domain_modules(domain);
                        SubLObject module = NIL;
                        for (module = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , module = cdolist_list_var.first()) {
                            if (NIL != kbi_vars.$within_kbi_sweepP$.getDynamicValue(thread)) {
                                if (NIL != apply_kbi_module(module, v_object)) {
                                    hits = cons(module, hits);
                                } else {
                                    misses = cons(module, misses);
                                }
                            } else {
                                if (NIL != apply_kbi_module(module, v_object)) {
                                    hits = cons(module, hits);
                                } else {
                                    misses = cons(module, misses);
                                }
                            }
                        }
                    }
                }
                return hits;
            }
        }
    }

    public static final SubLObject apply_kbi_module(SubLObject module, SubLObject v_object) {
        if ((NIL != in_kbi_module_domainP(v_object, module)) && (NIL != kbi_module_appliesP(module, v_object))) {
            return run_kbi_module(module, v_object);
        }
        return NIL;
    }

    public static final SubLObject kbi_super_domain_modules(SubLObject domain) {
        {
            SubLObject result = copy_list(kbi_domain_modules(domain));
            SubLObject cdolist_list_var = get(domain, $SUPER_DOMAINS, UNPROVIDED);
            SubLObject v_super = NIL;
            for (v_super = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , v_super = cdolist_list_var.first()) {
                result = nconc(result, copy_list(kbi_super_domain_modules(v_super)));
            }
            return remove_duplicates(result, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
        }
    }



    /**
     * returns a list of kbi modules applicable to elements
     * of DOMAIN and all its sub domains
     */
    public static final SubLObject kbi_sub_domain_modules(SubLObject domain) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            thread.resetMultipleValues();
            {
                SubLObject value = gethash(domain, $kbi_external_sub_domain_modules_hash$.getDynamicValue(thread), UNPROVIDED);
                SubLObject foundP = thread.secondMultipleValue();
                thread.resetMultipleValues();
                if (NIL != foundP) {
                    return value;
                } else {
                    return cached_kbi_sub_domain_modules(domain);
                }
            }
        }
    }



    public static final SubLObject clear_cached_kbi_sub_domain_modules() {
        {
            SubLObject cs = $cached_kbi_sub_domain_modules_caching_state$.getGlobalValue();
            if (NIL != cs) {
                memoization_state.caching_state_clear(cs);
            }
        }
        return NIL;
    }

    public static final SubLObject remove_cached_kbi_sub_domain_modules(SubLObject domain) {
        return memoization_state.caching_state_remove_function_results_with_args($cached_kbi_sub_domain_modules_caching_state$.getGlobalValue(), list(domain), UNPROVIDED, UNPROVIDED);
    }

    public static final SubLObject cached_kbi_sub_domain_modules_internal(SubLObject domain) {
        {
            SubLObject result = copy_list(kbi_domain_modules(domain));
            SubLObject cdolist_list_var = get(domain, $SUB_DOMAINS, UNPROVIDED);
            SubLObject sub = NIL;
            for (sub = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , sub = cdolist_list_var.first()) {
                result = nconc(result, copy_list(kbi_sub_domain_modules(sub)));
            }
            return remove_duplicates(result, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
        }
    }

    public static final SubLObject cached_kbi_sub_domain_modules(SubLObject domain) {
        {
            SubLObject caching_state = $cached_kbi_sub_domain_modules_caching_state$.getGlobalValue();
            if (NIL == caching_state) {
                caching_state = memoization_state.create_global_caching_state_for_name(CACHED_KBI_SUB_DOMAIN_MODULES, $cached_kbi_sub_domain_modules_caching_state$, NIL, EQL, ONE_INTEGER, $int$32);
            }
            {
                SubLObject results = memoization_state.caching_state_lookup(caching_state, domain, $kw70$_MEMOIZED_ITEM_NOT_FOUND_);
                if (results == $kw70$_MEMOIZED_ITEM_NOT_FOUND_) {
                    results = arg2(resetMultipleValues(), multiple_value_list(cached_kbi_sub_domain_modules_internal(domain)));
                    memoization_state.caching_state_put(caching_state, domain, results, UNPROVIDED);
                }
                return memoization_state.caching_results(results);
            }
        }
    }

    /**
     * Accessor for the private hashtable generated by DEFINE-CACHED
     */
    public static final SubLObject set_kbi_external_sub_domain_modules(SubLObject domain, SubLObject v_modules) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            sethash(domain, $kbi_external_sub_domain_modules_hash$.getDynamicValue(thread), v_modules);
            return v_modules;
        }
    }

    public static final SubLObject clear_kbi_external_sub_domain_modules() {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            return clrhash($kbi_external_sub_domain_modules_hash$.getDynamicValue(thread));
        }
    }



    public static final SubLObject clear_kbi_accessible_modules() {
        {
            SubLObject cs = $kbi_accessible_modules_caching_state$.getGlobalValue();
            if (NIL != cs) {
                memoization_state.caching_state_clear(cs);
            }
        }
        return NIL;
    }

    public static final SubLObject remove_kbi_accessible_modules(SubLObject domain) {
        return memoization_state.caching_state_remove_function_results_with_args($kbi_accessible_modules_caching_state$.getGlobalValue(), list(domain), UNPROVIDED, UNPROVIDED);
    }

    /**
     * returns a list of kbi modules applicable to elements of DOMAIN
     * and all its dependent domains and all their sub domains
     */
    public static final SubLObject kbi_accessible_modules_internal(SubLObject domain) {
        {
            SubLObject result = kbi_sub_domain_modules(domain);
            SubLObject cdolist_list_var = get(domain, $DEPENDENTS, UNPROVIDED);
            SubLObject accessible = NIL;
            for (accessible = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , accessible = cdolist_list_var.first()) {
                result = nconc(result, copy_list(kbi_accessible_modules(accessible)));
            }
            return remove_duplicates(result, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
        }
    }

    public static final SubLObject kbi_accessible_modules(SubLObject domain) {
        {
            SubLObject caching_state = $kbi_accessible_modules_caching_state$.getGlobalValue();
            if (NIL == caching_state) {
                caching_state = memoization_state.create_global_caching_state_for_name(KBI_ACCESSIBLE_MODULES, $kbi_accessible_modules_caching_state$, NIL, EQL, ONE_INTEGER, $int$32);
            }
            {
                SubLObject results = memoization_state.caching_state_lookup(caching_state, domain, $kw70$_MEMOIZED_ITEM_NOT_FOUND_);
                if (results == $kw70$_MEMOIZED_ITEM_NOT_FOUND_) {
                    results = arg2(resetMultipleValues(), multiple_value_list(kbi_accessible_modules_internal(domain)));
                    memoization_state.caching_state_put(caching_state, domain, results, UNPROVIDED);
                }
                return memoization_state.caching_results(results);
            }
        }
    }



    public static final SubLObject clear_kbi_all_sub_domains() {
        {
            SubLObject cs = $kbi_all_sub_domains_caching_state$.getGlobalValue();
            if (NIL != cs) {
                memoization_state.caching_state_clear(cs);
            }
        }
        return NIL;
    }

    public static final SubLObject remove_kbi_all_sub_domains(SubLObject domain) {
        return memoization_state.caching_state_remove_function_results_with_args($kbi_all_sub_domains_caching_state$.getGlobalValue(), list(domain), UNPROVIDED, UNPROVIDED);
    }

    /**
     * returns a list of kbi domains that include DOMAIN and all its sub domains
     */
    public static final SubLObject kbi_all_sub_domains_internal(SubLObject domain) {
        {
            SubLObject result = list(domain);
            SubLObject cdolist_list_var = get(domain, $SUB_DOMAINS, UNPROVIDED);
            SubLObject sub = NIL;
            for (sub = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , sub = cdolist_list_var.first()) {
                result = nconc(result, copy_list(kbi_all_sub_domains(sub)));
            }
            return list_utilities.hash_remove_duplicates(result, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
        }
    }

    public static final SubLObject kbi_all_sub_domains(SubLObject domain) {
        {
            SubLObject caching_state = $kbi_all_sub_domains_caching_state$.getGlobalValue();
            if (NIL == caching_state) {
                caching_state = memoization_state.create_global_caching_state_for_name(KBI_ALL_SUB_DOMAINS, $kbi_all_sub_domains_caching_state$, NIL, EQL, ONE_INTEGER, $int$32);
            }
            {
                SubLObject results = memoization_state.caching_state_lookup(caching_state, domain, $kw70$_MEMOIZED_ITEM_NOT_FOUND_);
                if (results == $kw70$_MEMOIZED_ITEM_NOT_FOUND_) {
                    results = arg2(resetMultipleValues(), multiple_value_list(kbi_all_sub_domains_internal(domain)));
                    memoization_state.caching_state_put(caching_state, domain, results, UNPROVIDED);
                }
                return memoization_state.caching_results(results);
            }
        }
    }

    /**
     * returns a list of kbi modules applicable to elements of DOMAIN
     */
    public static final SubLObject kbi_domain_modules(SubLObject domain) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            return gethash(domain, kbi_vars.$kbi_domain_modules$.getDynamicValue(thread), UNPROVIDED);
        }
    }

    /**
     * returns a list of kbi modules applicable to OBJECT
     */
    public static final SubLObject kbi_applicable_modules(SubLObject v_object) {
        if (NIL != v_object) {
            {
                SubLObject v_modules = NIL;
                SubLObject cdolist_list_var = kbi_domains(v_object);
                SubLObject domain = NIL;
                for (domain = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , domain = cdolist_list_var.first()) {
                    v_modules = nconc(v_modules, copy_list(kbi_domain_modules(domain)));
                }
                return v_modules;
            }
        }
        return NIL;
    }

    public static final SubLObject kbi_domains(SubLObject v_object) {
        if (v_object == UNPROVIDED) {
            v_object = NIL;
        }
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            if (NIL != v_object) {
                {
                    SubLObject domains = NIL;
                    SubLObject cdolist_list_var = kbi_vars.$kbi_domains$.getDynamicValue(thread);
                    SubLObject domain = NIL;
                    for (domain = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , domain = cdolist_list_var.first()) {
                        if (NIL != in_kbi_domainP(v_object, domain)) {
                            domains = cons(domain, domains);
                        }
                    }
                    return domains;
                }
            } else {
                return kbi_vars.$kbi_domains$.getDynamicValue(thread);
            }
        }
    }

    public static final SubLObject in_kbi_domainP(SubLObject v_object, SubLObject domain) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            {
                SubLObject defn = get(domain, $DOMAIN_DEFN, UNPROVIDED);
                SubLObject result = NIL;
                if (defn.isFunctionSpec()) {
                    {
                        SubLObject _prev_bind_0 = system_parameters.$suspend_sbhl_type_checkingP$.currentBinding(thread);
                        SubLObject _prev_bind_1 = mt_relevance_macros.$relevant_mt_function$.currentBinding(thread);
                        SubLObject _prev_bind_2 = mt_relevance_macros.$mt$.currentBinding(thread);
                        try {
                            system_parameters.$suspend_sbhl_type_checkingP$.bind(T, thread);
                            mt_relevance_macros.$relevant_mt_function$.bind(RELEVANT_MT_IS_EVERYTHING, thread);
                            mt_relevance_macros.$mt$.bind($$EverythingPSC, thread);
                            result = funcall(defn, v_object);
                        } finally {
                            mt_relevance_macros.$mt$.rebind(_prev_bind_2, thread);
                            mt_relevance_macros.$relevant_mt_function$.rebind(_prev_bind_1, thread);
                            system_parameters.$suspend_sbhl_type_checkingP$.rebind(_prev_bind_0, thread);
                        }
                    }
                } else {
                    kbi_cerror(THREE_INTEGER, $$$continue_anyway, $str_alt77$kbi_domain__s_has_invalid_defn__s, domain, defn, UNPROVIDED, UNPROVIDED, UNPROVIDED);
                }
                return result;
            }
        }
    }

    public static final SubLObject kbi_result() {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            return kbi_macros.$kbi_result$.getDynamicValue(thread);
        }
    }

    public static final SubLObject kbi_resultP(SubLObject item, SubLObject test, SubLObject key) {
        if (test == UNPROVIDED) {
            test = symbol_function(EQL);
        }
        if (key == UNPROVIDED) {
            key = symbol_function(IDENTITY);
        }
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            return subl_promotions.memberP(item, kbi_macros.$kbi_result$.getDynamicValue(thread), test, key);
        }
    }

    public static final SubLObject set_kbi_result(SubLObject item) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            kbi_macros.$kbi_result$.setDynamicValue(item, thread);
            return kbi_macros.$kbi_result$.getDynamicValue(thread);
        }
    }

    public static final SubLObject add_kbi_result(SubLObject item) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            kbi_macros.$kbi_result$.setDynamicValue(cons(item, kbi_macros.$kbi_result$.getDynamicValue(thread)), thread);
            return kbi_macros.$kbi_result$.getDynamicValue(thread);
        }
    }

    public static final SubLObject adjoin_kbi_result(SubLObject item, SubLObject test, SubLObject key) {
        if (test == UNPROVIDED) {
            test = symbol_function(EQL);
        }
        if (key == UNPROVIDED) {
            key = symbol_function(IDENTITY);
        }
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            kbi_macros.$kbi_result$.setDynamicValue(adjoin(item, kbi_macros.$kbi_result$.getDynamicValue(thread), test, key), thread);
            return kbi_macros.$kbi_result$.getDynamicValue(thread);
        }
    }

    public static final SubLObject adjoin_prop_kbi_result(SubLObject attribute, SubLObject value, SubLObject test, SubLObject key) {
        if (test == UNPROVIDED) {
            test = symbol_function(EQL);
        }
        if (key == UNPROVIDED) {
            key = symbol_function(IDENTITY);
        }
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            {
                SubLObject current = assoc(attribute, kbi_macros.$kbi_result$.getDynamicValue(thread), test, key);
                if (NIL != current) {
                    if (NIL == subl_promotions.memberP(value, current.rest(), UNPROVIDED, UNPROVIDED)) {
                        rplacd(current, cons(value, current.rest()));
                    }
                } else {
                    kbi_macros.$kbi_result$.setDynamicValue(cons(list(attribute, value), kbi_macros.$kbi_result$.getDynamicValue(thread)), thread);
                }
            }
            return kbi_macros.$kbi_result$.getDynamicValue(thread);
        }
    }

    public static final SubLObject nreverse_kbi_result() {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            kbi_macros.$kbi_result$.setDynamicValue(nreverse(kbi_macros.$kbi_result$.getDynamicValue(thread)), thread);
            return kbi_macros.$kbi_result$.getDynamicValue(thread);
        }
    }

    public static final SubLObject kbi_doneP(SubLObject result) {
        if (result == UNPROVIDED) {
            result = kbi_macros.$kbi_result$.getDynamicValue();
        }
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            if (kbi_macros.$kbi_doneP_fn$.getDynamicValue(thread).isFunctionSpec()) {
                return funcall(kbi_macros.$kbi_doneP_fn$.getDynamicValue(thread), result);
            }
            return NIL;
        }
    }

    public static final SubLObject kbi_done_if_any_result(SubLObject result) {
        if (result == UNPROVIDED) {
            result = kbi_macros.$kbi_result$.getDynamicValue();
        }
        if (NIL != result) {
            return T;
        }
        return NIL;
    }

    public static final SubLObject run_kbi_moduleP(SubLObject module) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            if (NIL != kbi_moduleP(module)) {
                if (NIL != kbi_vars.$kbi_disable_selection_filtersP$.getDynamicValue(thread)) {
                    return T;
                } else {
                    {
                        SubLObject level = get(module, $KBI_LEVEL, UNPROVIDED);
                        SubLObject concern = get(module, $KBI_CONCERN_FOR, UNPROVIDED);
                        SubLObject concern_type = get(module, $KBI_CONCERN_TYPE, UNPROVIDED);
                        return makeBoolean((((((NIL != kbi_module_selectedP(module)) && ((!kbi_vars.$kbi_level$.getDynamicValue(thread).isNumber()) || (level.isNumber() && kbi_vars.$kbi_level$.getDynamicValue(thread).numGE(level)))) && ((NIL == kbi_vars.$kbi_only_concerns$.getDynamicValue(thread)) || (NIL != subl_promotions.memberP(concern, kbi_vars.$kbi_only_concerns$.getDynamicValue(thread), UNPROVIDED, UNPROVIDED)))) && ((NIL == kbi_vars.$kbi_only_criticalities$.getDynamicValue(thread)) || (NIL != subl_promotions.memberP(concern_type, kbi_vars.$kbi_only_criticalities$.getDynamicValue(thread), UNPROVIDED, UNPROVIDED)))) && (NIL == subl_promotions.memberP(concern, kbi_vars.$kbi_skip_concerns$.getDynamicValue(thread), UNPROVIDED, UNPROVIDED))) && (NIL == subl_promotions.memberP(concern_type, kbi_vars.$kbi_skip_criticalities$.getDynamicValue(thread), UNPROVIDED, UNPROVIDED)));
                    }
                }
            } else {
                kbi_error(FOUR_INTEGER, $str_alt81$invalid_kbi_module___s, module, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
            }
            return NIL;
        }
    }

    public static final SubLObject reset_kbi_state(SubLObject domain) {
        if (domain == UNPROVIDED) {
            domain = kbi_vars.$kbi_last_domain$.getDynamicValue();
        }
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            clear_kbi_cached_term_mts();
            clear_cached_kbi_sub_domain_modules();
            clear_kbi_external_sub_domain_modules();
            clear_kbi_accessible_modules();
            clear_kbi_all_sub_domains();
            reset_diagnostic_results(domain);
            sethash(domain, kbi_vars.$kbi_start_times$.getDynamicValue(thread), numeric_date_utilities.timestring(UNPROVIDED));
            return NIL;
        }
    }

    public static final SubLObject reset_diagnostic_results(SubLObject domain) {
        kbi_vars.$kbi_items_to_consider$.setDynamicValue(NIL);
        kbi_macros.$kbi_errors$.setDynamicValue(NIL);
        reset_kbi_domain_results(domain);
        {
            SubLObject cdolist_list_var = get(domain, $DEPENDENTS, UNPROVIDED);
            SubLObject dep_domain = NIL;
            for (dep_domain = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , dep_domain = cdolist_list_var.first()) {
                reset_diagnostic_results(dep_domain);
            }
        }
        return NIL;
    }

    public static final SubLObject reset_kbi_domain_results(SubLObject domain) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            sethash(domain, kbi_vars.$kbi_progress_counts$.getDynamicValue(thread), ZERO_INTEGER);
            {
                SubLObject cdolist_list_var = kbi_sub_domain_modules(domain);
                SubLObject module = NIL;
                for (module = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , module = cdolist_list_var.first()) {
                    reset_kbi_module_results(module, UNPROVIDED);
                }
            }
            return NIL;
        }
    }

    public static final SubLObject reset_kbi_module_results(SubLObject module, SubLObject value) {
        if (value == UNPROVIDED) {
            value = NIL;
        }
        {
            SubLObject result_cache = get(module, $KBI_RESULT_CACHE, UNPROVIDED);
            if (NIL != result_cache) {
                set(result_cache, value);
            }
        }
        reset_module_attribute(module, $KBI_COUNT_CACHE);
        reset_module_attribute(module, $KBI_TIME_CACHE);
        return NIL;
    }

    public static final SubLObject kbi_module_selectedP(SubLObject module) {
        return get(module, $kw82$KBI_SELECTED_, UNPROVIDED);
    }

    public static final SubLObject kbi_selected_modules(SubLObject domain) {
        if (domain == UNPROVIDED) {
            domain = NIL;
        }
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            if (NIL != domain) {
                return list_utilities.remove_if_not(symbol_function($sym83$KBI_MODULE_SELECTED_), kbi_sub_domain_modules(domain), UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
            } else {
                return list_utilities.remove_if_not(symbol_function($sym83$KBI_MODULE_SELECTED_), kbi_vars.$kbi_modules$.getDynamicValue(thread), UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
            }
        }
    }

    public static final SubLObject kbi_unselected_modules(SubLObject domain) {
        if (domain == UNPROVIDED) {
            domain = NIL;
        }
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            if (NIL != domain) {
                return remove_if(symbol_function($sym83$KBI_MODULE_SELECTED_), kbi_sub_domain_modules(domain), UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
            } else {
                return remove_if(symbol_function($sym83$KBI_MODULE_SELECTED_), kbi_vars.$kbi_modules$.getDynamicValue(thread), UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
            }
        }
    }

    public static final SubLObject kbi_unselect_modules(SubLObject v_modules) {
        {
            SubLObject cdolist_list_var = v_modules;
            SubLObject module = NIL;
            for (module = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , module = cdolist_list_var.first()) {
                kbi_unselect_module(module);
            }
        }
        return NIL;
    }

    public static final SubLObject kbi_select_modules(SubLObject v_modules) {
        {
            SubLObject cdolist_list_var = v_modules;
            SubLObject module = NIL;
            for (module = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , module = cdolist_list_var.first()) {
                kbi_select_module(module);
            }
        }
        return NIL;
    }

    public static final SubLObject kbi_apply(SubLObject module, SubLObject arg) {
        return run_kbi_module(module, arg);
    }

    public static final SubLObject kbi_select_module(SubLObject module) {
        return kbi_set_module_property(module, $kw82$KBI_SELECTED_, T);
    }

    public static final SubLObject kbi_unselect_module(SubLObject module) {
        return kbi_set_module_property(module, $kw82$KBI_SELECTED_, NIL);
    }

    public static final SubLObject kbi_set_module_property(SubLObject module, SubLObject attribute, SubLObject value) {
        if (NIL != kbi_moduleP(module)) {
            return set_module_property_int(module, attribute, value, $sym7$VALID_KBI_ATTRIBUTE_);
        } else {
            kbi_cerror(THREE_INTEGER, $$$continue_anyway, $str_alt81$invalid_kbi_module___s, module, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
        }
        return NIL;
    }

    public static final SubLObject set_module_property_int(SubLObject module, SubLObject attribute, SubLObject value, SubLObject attribute_test) {
        if (attribute_test == UNPROVIDED) {
            attribute_test = $sym7$VALID_KBI_ATTRIBUTE_;
        }
        if (NIL != validated_kbi_attributeP(attribute, attribute_test)) {
            if (NIL != validated_kbi_propertyP(attribute, value)) {
                set_kbi_property_int(module, attribute, value);
            }
        }
        return get(module, attribute, UNPROVIDED);
    }

    public static final SubLObject set_kbi_property_int(SubLObject v_object, SubLObject attribute, SubLObject value) {
        put(v_object, attribute, value);
        {
            SubLObject inverse = get(attribute, $INVERSE, UNPROVIDED);
            if (NIL != inverse) {
                if (LISTP.eql(get(attribute, $VALUE_TYPE, UNPROVIDED))) {
                    {
                        SubLObject cdolist_list_var = value;
                        SubLObject entry = NIL;
                        for (entry = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , entry = cdolist_list_var.first()) {
                            put(entry, inverse, cons(v_object, get(entry, inverse, UNPROVIDED)));
                        }
                    }
                } else {
                    put(value, inverse, attribute);
                }
            }
        }
        return get(v_object, attribute, UNPROVIDED);
    }

    public static final SubLObject kbi_redo_module_results(SubLObject module) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            {
                SubLObject results = kbi_result_data(module);
                set(kbi_result_cache(module), NIL);
                {
                    SubLObject _prev_bind_0 = kbi_vars.$kbi_caching_findingsP$.currentBinding(thread);
                    try {
                        kbi_vars.$kbi_caching_findingsP$.bind(T, thread);
                        {
                            SubLObject list_var = results;
                            utilities_macros.$progress_note$.setDynamicValue(format(NIL, $str_alt86$kbi_redo____s___s_, module, length(results)), thread);
                            utilities_macros.$progress_start_time$.setDynamicValue(get_universal_time(), thread);
                            utilities_macros.$progress_total$.setDynamicValue(length(list_var), thread);
                            utilities_macros.$progress_sofar$.setDynamicValue(ZERO_INTEGER, thread);
                            {
                                SubLObject _prev_bind_0_3 = utilities_macros.$last_percent_progress_index$.currentBinding(thread);
                                SubLObject _prev_bind_1 = utilities_macros.$last_percent_progress_prediction$.currentBinding(thread);
                                SubLObject _prev_bind_2 = utilities_macros.$within_noting_percent_progress$.currentBinding(thread);
                                SubLObject _prev_bind_3 = utilities_macros.$percent_progress_start_time$.currentBinding(thread);
                                try {
                                    utilities_macros.$last_percent_progress_index$.bind(ZERO_INTEGER, thread);
                                    utilities_macros.$last_percent_progress_prediction$.bind(NIL, thread);
                                    utilities_macros.$within_noting_percent_progress$.bind(T, thread);
                                    utilities_macros.$percent_progress_start_time$.bind(get_universal_time(), thread);
                                    utilities_macros.noting_percent_progress_preamble(utilities_macros.$progress_note$.getDynamicValue(thread));
                                    {
                                        SubLObject csome_list_var = list_var;
                                        SubLObject v_object = NIL;
                                        for (v_object = csome_list_var.first(); NIL != csome_list_var; csome_list_var = csome_list_var.rest() , v_object = csome_list_var.first()) {
                                            utilities_macros.note_percent_progress(utilities_macros.$progress_sofar$.getDynamicValue(thread), utilities_macros.$progress_total$.getDynamicValue(thread));
                                            utilities_macros.$progress_sofar$.setDynamicValue(add(utilities_macros.$progress_sofar$.getDynamicValue(thread), ONE_INTEGER), thread);
                                            if (NIL != kbi_module_appliesP(module, v_object)) {
                                                run_kbi_module(module, v_object);
                                            }
                                        }
                                    }
                                    utilities_macros.noting_percent_progress_postamble();
                                } finally {
                                    utilities_macros.$percent_progress_start_time$.rebind(_prev_bind_3, thread);
                                    utilities_macros.$within_noting_percent_progress$.rebind(_prev_bind_2, thread);
                                    utilities_macros.$last_percent_progress_prediction$.rebind(_prev_bind_1, thread);
                                    utilities_macros.$last_percent_progress_index$.rebind(_prev_bind_0_3, thread);
                                }
                            }
                        }
                    } finally {
                        kbi_vars.$kbi_caching_findingsP$.rebind(_prev_bind_0, thread);
                    }
                }
                return list(length(kbi_result_data(module)), length(results));
            }
        }
    }

    public static final SubLObject kbi_note(SubLObject level, SubLObject format_str, SubLObject arg1, SubLObject arg2, SubLObject arg3, SubLObject arg4, SubLObject arg5) {
        if (arg1 == UNPROVIDED) {
            arg1 = NIL;
        }
        if (arg2 == UNPROVIDED) {
            arg2 = NIL;
        }
        if (arg3 == UNPROVIDED) {
            arg3 = NIL;
        }
        if (arg4 == UNPROVIDED) {
            arg4 = NIL;
        }
        if (arg5 == UNPROVIDED) {
            arg5 = NIL;
        }
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            if (kbi_vars.$kbi_trace_level$.getDynamicValue(thread).numGE(level)) {
                format(T, format_str, new SubLObject[]{ arg1, arg2, arg3, arg4, arg5 });
                return NIL;
            }
            return NIL;
        }
    }

    public static final SubLObject kbi_error(SubLObject level, SubLObject format_str, SubLObject arg1, SubLObject arg2, SubLObject arg3, SubLObject arg4, SubLObject arg5) {
        if (arg1 == UNPROVIDED) {
            arg1 = NIL;
        }
        if (arg2 == UNPROVIDED) {
            arg2 = NIL;
        }
        if (arg3 == UNPROVIDED) {
            arg3 = NIL;
        }
        if (arg4 == UNPROVIDED) {
            arg4 = NIL;
        }
        if (arg5 == UNPROVIDED) {
            arg5 = NIL;
        }
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            if (kbi_vars.$kbi_trace_level$.getDynamicValue(thread).numGE(level)) {
                Errors.cerror($$$continue_anyway, format_str, new SubLObject[]{ arg1, arg2, arg3, arg4, arg5 });
            } else
                if (add(TWO_INTEGER, kbi_vars.$kbi_trace_level$.getDynamicValue(thread)).numGE(level)) {
                    Errors.warn(format_str, new SubLObject[]{ arg1, arg2, arg3, arg4, arg5 });
                }

            return NIL;
        }
    }

    public static final SubLObject kbi_cerror(SubLObject level, SubLObject continue_str, SubLObject format_str, SubLObject arg1, SubLObject arg2, SubLObject arg3, SubLObject arg4, SubLObject arg5) {
        if (arg1 == UNPROVIDED) {
            arg1 = NIL;
        }
        if (arg2 == UNPROVIDED) {
            arg2 = NIL;
        }
        if (arg3 == UNPROVIDED) {
            arg3 = NIL;
        }
        if (arg4 == UNPROVIDED) {
            arg4 = NIL;
        }
        if (arg5 == UNPROVIDED) {
            arg5 = NIL;
        }
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            if (kbi_vars.$kbi_trace_level$.getDynamicValue(thread).numGE(level)) {
                Errors.cerror(continue_str, format_str, new SubLObject[]{ arg1, arg2, arg3, arg4, arg5 });
            } else
                if (add(TWO_INTEGER, kbi_vars.$kbi_trace_level$.getDynamicValue(thread)).numGE(level)) {
                    Errors.warn(format_str, new SubLObject[]{ arg1, arg2, arg3, arg4, arg5 });
                }

            return NIL;
        }
    }

    public static final SubLObject kbi_warn(SubLObject level, SubLObject format_str, SubLObject arg1, SubLObject arg2, SubLObject arg3, SubLObject arg4, SubLObject arg5) {
        if (arg1 == UNPROVIDED) {
            arg1 = NIL;
        }
        if (arg2 == UNPROVIDED) {
            arg2 = NIL;
        }
        if (arg3 == UNPROVIDED) {
            arg3 = NIL;
        }
        if (arg4 == UNPROVIDED) {
            arg4 = NIL;
        }
        if (arg5 == UNPROVIDED) {
            arg5 = NIL;
        }
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            if (kbi_vars.$kbi_trace_level$.getDynamicValue(thread).numGE(level)) {
                apply(WARN, format_str, new SubLObject[]{ arg1, arg2, arg3, arg4, arg5 });
                return NIL;
            }
            return NIL;
        }
    }

    public static final SubLObject kbi_status(SubLObject domain, SubLObject skip_nilsP, SubLObject stream) {
        if (domain == UNPROVIDED) {
            domain = kbi_vars.$kbi_last_domain$.getDynamicValue();
        }
        if (skip_nilsP == UNPROVIDED) {
            skip_nilsP = T;
        }
        if (stream == UNPROVIDED) {
            stream = T;
        }
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            diagnostics_status(domain, skip_nilsP, stream, UNPROVIDED);
            if (NIL != kbi_macros.$kbi_errors$.getDynamicValue(thread)) {
                format(stream, $str_alt88$___kbi_errors____a, length(kbi_macros.$kbi_errors$.getDynamicValue(thread)));
            }
            return NIL;
        }
    }

    public static final SubLObject diagnostics_status(SubLObject domain, SubLObject skip_nilsP, SubLObject skip_unselectedP, SubLObject stream) {
        if (domain == UNPROVIDED) {
            domain = kbi_vars.$kbi_last_domain$.getDynamicValue();
        }
        if (skip_nilsP == UNPROVIDED) {
            skip_nilsP = T;
        }
        if (skip_unselectedP == UNPROVIDED) {
            skip_unselectedP = T;
        }
        if (stream == UNPROVIDED) {
            stream = T;
        }
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            if (NIL != domain) {
                format(stream, $str_alt89$____Status_of__a_diagnostics_, Strings.string_downcase(symbol_name(domain), UNPROVIDED, UNPROVIDED));
                {
                    SubLObject done = gethash(domain, kbi_vars.$kbi_progress_counts$.getDynamicValue(thread), UNPROVIDED);
                    SubLObject max = diagnostic_items_to_consider(domain);
                    format(stream, $str_alt90$___a_considered, done);
                    if ((max.isNumber() && max.numG(ZERO_INTEGER)) && done.isNumber()) {
                        format(stream, $str_alt91$___s__out_of__s_, number_utilities.float_n(multiply(divide(done, max), $int$100), ONE_INTEGER), max);
                    }
                }
                {
                    SubLObject unselected = NIL;
                    {
                        SubLObject cdolist_list_var = kbi_sub_domain_modules(domain);
                        SubLObject module = NIL;
                        for (module = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , module = cdolist_list_var.first()) {
                            if (NIL != kbi_module_selectedP(module)) {
                                print_kbi_result_status_line(module, skip_nilsP, stream);
                                print_kbi_repair_status_line(module, skip_nilsP, stream);
                            } else
                                if (NIL == skip_unselectedP) {
                                    unselected = cons(module, unselected);
                                }

                        }
                    }
                    if (NIL != unselected) {
                        format(stream, $str_alt93$____unselected____a, Strings.string_downcase(symbol_name(unselected.first()), UNPROVIDED, UNPROVIDED));
                        {
                            SubLObject cdolist_list_var = unselected.rest();
                            SubLObject module = NIL;
                            for (module = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , module = cdolist_list_var.first()) {
                                format(stream, $str_alt94$________________a, Strings.string_downcase(symbol_name(module), UNPROVIDED, UNPROVIDED));
                            }
                        }
                    }
                }
                return NIL;
            }
            return NIL;
        }
    }

    public static final SubLObject print_kbi_result_status_line(SubLObject module, SubLObject skip_nilsP, SubLObject stream) {
        if (skip_nilsP == UNPROVIDED) {
            skip_nilsP = T;
        }
        if (stream == UNPROVIDED) {
            stream = T;
        }
        {
            SubLObject result = kbi_result_data(module);
            SubLObject count = kbi_module_count(module);
            SubLObject time = kbi_module_time(module);
            SubLObject avg_time = ((count.isNumber() && time.isNumber()) && count.numG(ZERO_INTEGER)) ? ((SubLObject) (number_utilities.float_n(divide(time, count), TWO_INTEGER))) : NIL;
            if (((NIL != result) || (NIL == skip_nilsP)) || ((NIL != avg_time) && avg_time.numG($float$0_1))) {
                format(stream, $str_alt96$___a__, Strings.string_downcase(symbol_name(module), UNPROVIDED, UNPROVIDED));
                if (NIL != result) {
                    format(stream, $str_alt97$__a, length(result));
                }
                if ((NIL != result) || ((NIL != avg_time) && avg_time.numG($float$0_1))) {
                    if ((count.isNumber() && count.numG(ZERO_INTEGER)) || (time.isNumber() && time.numG(ZERO_INTEGER))) {
                        format(stream, $str_alt98$____a__a_, count.isNumber() && count.numG(ZERO_INTEGER) ? ((SubLObject) (count)) : $str_alt99$_, ((count.isNumber() && count.numG(ZERO_INTEGER)) && time.isNumber()) && time.numG(ZERO_INTEGER) ? ((SubLObject) (number_utilities.float_n(divide(time, count), TWO_INTEGER))) : $str_alt99$_);
                    }
                }
            }
        }
        return NIL;
    }

    public static final SubLObject print_kbi_repair_status_line(SubLObject module, SubLObject skip_nilsP, SubLObject stream) {
        if (skip_nilsP == UNPROVIDED) {
            skip_nilsP = T;
        }
        if (stream == UNPROVIDED) {
            stream = T;
        }
        {
            SubLObject result = kbi_repair_data(module);
            if ((NIL != result) || (NIL == skip_nilsP)) {
                format(stream, $str_alt100$___a__repaired_____a, Strings.string_downcase(symbol_name(module), UNPROVIDED, UNPROVIDED), length(result));
            }
        }
        return NIL;
    }

    public static final SubLObject kbi_result_cache(SubLObject module) {
        return get(module, $KBI_RESULT_CACHE, UNPROVIDED);
    }

    public static final SubLObject kbi_result_data(SubLObject module) {
        return symbol_value(kbi_result_cache(module));
    }

    public static final SubLObject kbi_repair_cache(SubLObject module) {
        return get(module, $KBI_REPAIR_CACHE, UNPROVIDED);
    }

    public static final SubLObject kbi_repair_data(SubLObject module) {
        return symbol_value(kbi_repair_cache(module));
    }

    public static final SubLObject kbi_examples(SubLObject module, SubLObject n) {
        if (n == UNPROVIDED) {
            n = FIVE_INTEGER;
        }
        return list_utilities.first_n(n, symbol_value(kbi_result_cache(module)));
    }

    public static final SubLObject kbi_domain(SubLObject module) {
        return get(module, $KBI_DOMAIN, UNPROVIDED);
    }

    public static final SubLObject diagnostic_items_to_consider(SubLObject domain) {
        if (domain == UNPROVIDED) {
            domain = kbi_vars.$kbi_last_domain$.getDynamicValue();
        }
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            if (domain == kbi_vars.$kbi_last_domain$.getDynamicValue(thread)) {
                if (kbi_vars.$kbi_items_to_consider$.getDynamicValue(thread).isNumber() && kbi_vars.$kbi_items_to_consider$.getDynamicValue(thread).numG(ZERO_INTEGER)) {
                    return kbi_vars.$kbi_items_to_consider$.getDynamicValue(thread);
                } else {
                    {
                        SubLObject domain_count = kbi_domain_count(domain);
                        if (domain_count.isNumber()) {
                            return domain_count;
                        } else {
                            kbi_warn(TWO_INTEGER, $str_alt102$unknown_count_for_kbi_domain___s, domain, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
                            return $str_alt103$_don_t_know_exactly__but_I_d_gues;
                        }
                    }
                }
            }
            return NIL;
        }
    }

    public static final SubLObject kbi_domain_count(SubLObject domain) {
        {
            SubLObject domain_count_fn = get(domain, $DOMAIN_COUNT_FN, UNPROVIDED);
            if (NIL != fboundp(domain_count_fn)) {
                return funcall(domain_count_fn);
            } else {
                kbi_cerror(TWO_INTEGER, $$$continue_anyway, $str_alt105$unbound__domain_count_fn_for_kbi_, domain, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
            }
        }
        return NIL;
    }

    public static final SubLObject kbi_module_count(SubLObject module) {
        {
            SubLObject var = get(module, $KBI_COUNT_CACHE, UNPROVIDED);
            if (NIL != boundp(var)) {
                return symbol_value(var);
            }
        }
        return NIL;
    }

    public static final SubLObject kbi_module_time(SubLObject module) {
        {
            SubLObject var = get(module, $KBI_TIME_CACHE, UNPROVIDED);
            if (NIL != boundp(var)) {
                return symbol_value(var);
            }
        }
        return NIL;
    }

    public static final SubLObject reset_module_attribute(SubLObject module, SubLObject attribute) {
        {
            SubLObject var = get(module, attribute, UNPROVIDED);
            SubLObject v_default = get(attribute, $DEFAULT, UNPROVIDED);
            if (NIL != boundp(var)) {
                set(var, v_default);
                return v_default;
            }
        }
        return NIL;
    }

    public static final SubLObject kbi_duplicates(SubLObject list, SubLObject test, SubLObject key) {
        if (test == UNPROVIDED) {
            test = symbol_function(EQL);
        }
        if (key == UNPROVIDED) {
            key = symbol_function(IDENTITY);
        }
        {
            SubLObject doneP = NIL;
            SubLObject element = NIL;
            SubLObject rest = NIL;
            for (element = list.first(), rest = list.rest(); !((NIL != doneP) || (NIL == rest)); element = rest.first() , rest = rest.rest()) {
                {
                    SubLObject duplicate = member(element, rest, test, key).first();
                    if (NIL != duplicate) {
                        add_kbi_result(list(element, duplicate));
                        doneP = kbi_doneP(UNPROVIDED);
                    }
                }
            }
            return kbi_result();
        }
    }

    public static final SubLObject kbi_cached_duplicates(SubLObject list, SubLObject test, SubLObject key) {
        if (test == UNPROVIDED) {
            test = symbol_function(EQL);
        }
        if (key == UNPROVIDED) {
            key = symbol_function(IDENTITY);
        }
        {
            SubLObject size = length(list);
            SubLObject hash = (test.eql(symbol_function(EQL))) ? ((SubLObject) (make_hash_table(size, UNPROVIDED, UNPROVIDED))) : make_hash_table(size, test, UNPROVIDED);
            SubLObject doneP = NIL;
            if (NIL == doneP) {
                {
                    SubLObject csome_list_var = list;
                    SubLObject element = NIL;
                    for (element = csome_list_var.first(); !((NIL != doneP) || (NIL == csome_list_var)); csome_list_var = csome_list_var.rest() , element = csome_list_var.first()) {
                        if (NIL != gethash(funcall(key, element), hash, UNPROVIDED)) {
                            add_kbi_result(element);
                            doneP = kbi_doneP(UNPROVIDED);
                        } else {
                            sethash(funcall(key, element), hash, T);
                        }
                    }
                }
            }
            return kbi_result();
        }
    }



    public static final SubLObject clear_kbi_cached_term_mts() {
        {
            SubLObject cs = $kbi_cached_term_mts_caching_state$.getGlobalValue();
            if (NIL != cs) {
                memoization_state.caching_state_clear(cs);
            }
        }
        return NIL;
    }

    public static final SubLObject remove_kbi_cached_term_mts(SubLObject v_term) {
        return memoization_state.caching_state_remove_function_results_with_args($kbi_cached_term_mts_caching_state$.getGlobalValue(), list(v_term), UNPROVIDED, UNPROVIDED);
    }

    public static final SubLObject kbi_cached_term_mts_internal(SubLObject v_term) {
        return kb_indexing.mts_of_indexed_term(v_term);
    }

    public static final SubLObject kbi_cached_term_mts(SubLObject v_term) {
        {
            SubLObject caching_state = $kbi_cached_term_mts_caching_state$.getGlobalValue();
            if (NIL == caching_state) {
                caching_state = memoization_state.create_global_caching_state_for_name(KBI_CACHED_TERM_MTS, $kbi_cached_term_mts_caching_state$, NIL, EQL, ONE_INTEGER, $int$2048);
            }
            {
                SubLObject results = memoization_state.caching_state_lookup(caching_state, v_term, $kw70$_MEMOIZED_ITEM_NOT_FOUND_);
                if (results == $kw70$_MEMOIZED_ITEM_NOT_FOUND_) {
                    results = arg2(resetMultipleValues(), multiple_value_list(kbi_cached_term_mts_internal(v_term)));
                    memoization_state.caching_state_put(caching_state, v_term, results, UNPROVIDED);
                }
                return memoization_state.caching_results(results);
            }
        }
    }

    public static final SubLObject kbi_check_predicate_doneP(SubLObject predicate) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            SubLSystemTrampolineFile.checkType(predicate, CONSTANT_P);
            return gethash(predicate, kbi_vars.$kbi_predicate_table$.getDynamicValue(thread), UNPROVIDED);
        }
    }

    public static final SubLObject kbi_check_predicate_done(SubLObject predicate) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            return sethash(predicate, kbi_vars.$kbi_predicate_table$.getDynamicValue(thread), T);
        }
    }

    public static final SubLObject kbi_why_not_isaP(SubLObject fort, SubLObject collection, SubLObject mt) {
        if (mt == UNPROVIDED) {
            mt = NIL;
        }
        {
            SubLObject why = isa.why_not_isaP(fort, collection, mt, UNPROVIDED, UNPROVIDED);
            if (NIL == why) {
                if (NIL == fort_types_interface.collectionP(collection)) {
                    why = list(bq_cons(list($$not, listS($$isa, collection, $list_alt112)), $list_alt113));
                }
            }
            return why;
        }
    }

    public static final SubLObject public_axiomP(SubLObject clause_struc) {
        if (NIL != clause_strucs.clause_struc_p(clause_struc)) {
            {
                SubLObject formula = fi.perform_fi_substitutions(copy_tree(clause_strucs.clause_struc_formula(clause_struc, UNPROVIDED)), UNPROVIDED);
                return cb_browser.public_el_formulaP(formula);
            }
        }
        return NIL;
    }

    public static final SubLObject public_natP(SubLObject nat) {
        if (NIL != nart_handles.nart_p(nat)) {
            return cb_browser.public_el_formulaP(narts_high.nart_el_formula(nat));
        }
        return NIL;
    }

    public static final SubLObject public_structureP(SubLObject structure) {
        if (NIL != assertion_handles.assertion_p(structure)) {
            return T;//cb_browser.public_assertionP(structure);
        } else
            if (NIL != clause_strucs.clause_struc_p(structure)) {
                return public_axiomP(structure);
            } else
                if (NIL != function_terms.term_of_unit(structure)) {
                    return public_natP(structure);
                } else
                    if (NIL != forts.fort_p(structure)) {
                        return T;//cb_browser.public_fortP(structure);
                    }



        return NIL;
    }

    public static final SubLObject non_public_structureP(SubLObject structure) {
        if (NIL != assertion_handles.assertion_p(structure)) {
            return makeBoolean(NIL == cb_browser.public_assertionP(structure));
        } else
            if (NIL != clause_strucs.clause_struc_p(structure)) {
                return makeBoolean(NIL == public_axiomP(structure));
            } else
                if (NIL != function_terms.term_of_unit(structure)) {
                    return makeBoolean(NIL == public_natP(structure));
                } else
                    if (NIL != forts.fort_p(structure)) {
                        return makeBoolean(NIL == cb_browser.public_fortP(structure));
                    }



        return NIL;
    }

    public static final SubLObject public_assertions_of_term(SubLObject v_term) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            {
                SubLObject result = NIL;
                {
                    SubLObject _prev_bind_0 = control_vars.$mapping_assertion_selection_fn$.currentBinding(thread);
                    SubLObject _prev_bind_1 = control_vars.$mapping_answer$.currentBinding(thread);
                    try {
                        control_vars.$mapping_assertion_selection_fn$.bind(symbol_function($sym114$PUBLIC_ASSERTION_), thread);
                        control_vars.$mapping_answer$.bind(NIL, thread);
                        kb_mapping.map_term(symbol_function(GATHER_ASSERTIONS), v_term);
                        result = nreverse(control_vars.$mapping_answer$.getDynamicValue(thread));
                    } finally {
                        control_vars.$mapping_answer$.rebind(_prev_bind_1, thread);
                        control_vars.$mapping_assertion_selection_fn$.rebind(_prev_bind_0, thread);
                    }
                }
                return result;
            }
        }
    }

    public static final SubLObject print_public_assertions_nl(SubLObject filename) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            {
                SubLObject stream = NIL;
                try {
                    stream = compatibility.open_text(filename, $OUTPUT, UNPROVIDED);
                    {
                        SubLObject idx = assertion_handles.do_assertions_table();
                        SubLObject total = id_index.id_index_count(idx);
                        SubLObject sofar = ZERO_INTEGER;
                        SubLSystemTrampolineFile.checkType($$$mapping_Cyc_assertions, STRINGP);
                        {
                            SubLObject _prev_bind_0 = utilities_macros.$last_percent_progress_index$.currentBinding(thread);
                            SubLObject _prev_bind_1 = utilities_macros.$last_percent_progress_prediction$.currentBinding(thread);
                            SubLObject _prev_bind_2 = utilities_macros.$within_noting_percent_progress$.currentBinding(thread);
                            SubLObject _prev_bind_3 = utilities_macros.$percent_progress_start_time$.currentBinding(thread);
                            try {
                                utilities_macros.$last_percent_progress_index$.bind(ZERO_INTEGER, thread);
                                utilities_macros.$last_percent_progress_prediction$.bind(NIL, thread);
                                utilities_macros.$within_noting_percent_progress$.bind(T, thread);
                                utilities_macros.$percent_progress_start_time$.bind(get_universal_time(), thread);
                                utilities_macros.noting_percent_progress_preamble($$$mapping_Cyc_assertions);
                                if (NIL == id_index.do_id_index_empty_p(idx, $SKIP)) {
                                    {
                                        SubLObject id = id_index.do_id_index_next_id(idx, T, NIL, NIL);
                                        SubLObject state_var = id_index.do_id_index_next_state(idx, T, id, NIL);
                                        SubLObject assertion = NIL;
                                        while (NIL != id) {
                                            assertion = id_index.do_id_index_state_object(idx, $SKIP, id, state_var);
                                            if (NIL != id_index.do_id_index_id_and_object_validP(id, assertion, $SKIP)) {
                                                utilities_macros.note_percent_progress(sofar, total);
                                                sofar = add(sofar, ONE_INTEGER);
                                                if (NIL != cb_browser.public_assertionP(assertion)) {
                                                    print(pph_main.generate_text(assertion, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED), stream);
                                                    terpri(stream);
                                                }
                                            }
                                            id = id_index.do_id_index_next_id(idx, T, id, state_var);
                                            state_var = id_index.do_id_index_next_state(idx, T, id, state_var);
                                        } 
                                    }
                                }
                                utilities_macros.noting_percent_progress_postamble();
                            } finally {
                                utilities_macros.$percent_progress_start_time$.rebind(_prev_bind_3, thread);
                                utilities_macros.$within_noting_percent_progress$.rebind(_prev_bind_2, thread);
                                utilities_macros.$last_percent_progress_prediction$.rebind(_prev_bind_1, thread);
                                utilities_macros.$last_percent_progress_index$.rebind(_prev_bind_0, thread);
                            }
                        }
                    }
                } finally {
                    {
                        SubLObject _prev_bind_0 = $is_thread_performing_cleanupP$.currentBinding(thread);
                        try {
                            $is_thread_performing_cleanupP$.bind(T, thread);
                            if (NIL != stream) {
                                close(stream, UNPROVIDED);
                            }
                        } finally {
                            $is_thread_performing_cleanupP$.rebind(_prev_bind_0, thread);
                        }
                    }
                }
                return filename;
            }
        }
    }

    public static final SubLObject kbi_transform(SubLObject v_object, SubLObject level) {
        if (level == UNPROVIDED) {
            level = $FI;
        }
        {
            SubLObject pcase_var = level;
            if (pcase_var.eql($HL)) {
                return v_object;
            } else
                if (pcase_var.eql($FI)) {
                    return kbi_transform_nats(kbi_transform_assertions(v_object, level), level);
                }

        }
        return NIL;
    }

    public static final SubLObject kbi_transform_nats(SubLObject v_object, SubLObject level) {
        if (level == UNPROVIDED) {
            level = $FI;
        }
        {
            SubLObject pcase_var = level;
            if (pcase_var.eql($HL)) {
                return v_object;
            } else
                if (pcase_var.eql($FI)) {
                    return narts_high.nart_expand(v_object);
                }

        }
        return NIL;
    }

    public static final SubLObject kbi_transform_assertions(SubLObject v_object, SubLObject level) {
        if (level == UNPROVIDED) {
            level = $FI;
        }
        {
            SubLObject pcase_var = level;
            if (pcase_var.eql($HL)) {
                return v_object;
            } else
                if (pcase_var.eql($FI)) {
                    return fi.assertion_ist_expand(v_object);
                }

        }
        return NIL;
    }

    public static final SubLObject kbi_print_results() {
        {
            SubLObject result = NIL;
            SubLObject cdolist_list_var = kbi_domains(UNPROVIDED);
            SubLObject domain = NIL;
            for (domain = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , domain = cdolist_list_var.first()) {
                if (NIL != kbi_domain_has_resultsP(domain)) {
                    result = cons(kbi_print_domain_results(domain), result);
                }
            }
            return nreverse(result);
        }
    }

    public static final SubLObject kbi_print_domain_results(SubLObject domain) {
        {
            SubLObject result = kbi_print_domain_summary(domain);
            kbi_print_domain_module_results(domain);
            return result;
        }
    }

    public static final SubLObject kbi_print_domain_summary(SubLObject domain) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            {
                SubLObject filename = kbi_summary_filename(domain);
                SubLObject unselected = NIL;
                SubLObject stream = NIL;
                try {
                    stream = compatibility.open_text(filename, $OUTPUT, UNPROVIDED);
                    kbi_print_file_header(stream);
                    format(stream, $str_alt122$_______a, filename);
                    format(stream, $str_alt123$_______a_diagnostics, domain);
                    format(stream, $str_alt124$______time_started___a, gethash(domain, kbi_vars.$kbi_start_times$.getDynamicValue(thread), UNPROVIDED));
                    kbi_print_environment_info(stream);
                    {
                        SubLObject cdolist_list_var = kbi_sub_domain_modules(domain);
                        SubLObject module = NIL;
                        for (module = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , module = cdolist_list_var.first()) {
                            if (NIL != kbi_module_selectedP(module)) {
                                {
                                    SubLObject data = kbi_result_data(module);
                                    if ((NIL != data) || (NIL != kbi_vars.$kbi_print_nilsP$.getDynamicValue(thread))) {
                                        format(stream, $str_alt125$___a___a, module, length(data));
                                        if (NIL != data) {
                                            format(stream, $str_alt126$___see__a, kbi_filename(symbol_name(module), UNPROVIDED));
                                        }
                                    }
                                }
                            } else {
                                unselected = cons(module, unselected);
                            }
                        }
                    }
                    if (NIL != unselected) {
                        format(stream, $str_alt93$____unselected____a, Strings.string_downcase(symbol_name(unselected.first()), UNPROVIDED, UNPROVIDED));
                        {
                            SubLObject cdolist_list_var = unselected.rest();
                            SubLObject module = NIL;
                            for (module = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , module = cdolist_list_var.first()) {
                                format(stream, $str_alt94$________________a, Strings.string_downcase(symbol_name(module), UNPROVIDED, UNPROVIDED));
                            }
                        }
                    }
                } finally {
                    {
                        SubLObject _prev_bind_0 = $is_thread_performing_cleanupP$.currentBinding(thread);
                        try {
                            $is_thread_performing_cleanupP$.bind(T, thread);
                            if (NIL != stream) {
                                close(stream, UNPROVIDED);
                            }
                        } finally {
                            $is_thread_performing_cleanupP$.rebind(_prev_bind_0, thread);
                        }
                    }
                }
                return filename;
            }
        }
    }

    public static final SubLObject kbi_print_domain_module_results(SubLObject domain) {
        {
            SubLObject cdolist_list_var = kbi_sub_domain_modules(domain);
            SubLObject module = NIL;
            for (module = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , module = cdolist_list_var.first()) {
                kbi_print_module_results(module, domain);
            }
        }
        return NIL;
    }

    public static final SubLObject kbi_domain_has_resultsP(SubLObject domain) {
        {
            SubLObject v_boolean = NIL;
            if (NIL == v_boolean) {
                {
                    SubLObject csome_list_var = kbi_sub_domain_modules(domain);
                    SubLObject module = NIL;
                    for (module = csome_list_var.first(); !((NIL != v_boolean) || (NIL == csome_list_var)); csome_list_var = csome_list_var.rest() , module = csome_list_var.first()) {
                        v_boolean = makeBoolean(NIL != kbi_result_data(module));
                    }
                }
            }
            return v_boolean;
        }
    }

    public static final SubLObject kbi_print_module_results(SubLObject module, SubLObject domain) {
        if (NIL != kbi_module_selectedP(module)) {
            kbi_print_module_data_results(module, domain, kbi_result_data(module));
        }
        return NIL;
    }

    public static final SubLObject kbi_print_module_data_results(SubLObject module, SubLObject domain, SubLObject data) {
        if (NIL != data) {
            if (NIL != subl_promotions.memberP(domain, kbi_all_sub_domains($FORT), UNPROVIDED, UNPROVIDED)) {
                if (NIL != list_utilities.find_if_not(CONSTANT_P, data, UNPROVIDED, UNPROVIDED, UNPROVIDED)) {
                    kbi_print_non_constant_data(data, module, domain);
                } else {
                    kbi_print_constant_data(data, module);
                }
            } else
                if ($CONSTANT.eql(domain)) {
                    kbi_print_constant_data(data, module);
                } else {
                    kbi_print_non_constant_data(data, module, domain);
                }

        }
        return length(data);
    }

    public static final SubLObject kbi_print_constant_data(SubLObject data, SubLObject module) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            {
                SubLObject filename = kbi_filename(symbol_name(module), UNPROVIDED);
                SubLObject doc = get(module, $KBI_DOC, UNPROVIDED);
                SubLObject verbose_fn = get(module, $KBI_NL_VERBOSE_FN, UNPROVIDED);
                SubLObject sorted_data = sort_constants_by_name(data);
                SubLObject stream = NIL;
                try {
                    stream = compatibility.open_text(filename, $OUTPUT, UNPROVIDED);
                    kbi_print_file_header(stream);
                    format(stream, $str_alt122$_______a, filename);
                    format(stream, $str_alt130$______kbi_module___a, Strings.string_downcase(symbol_name(module), UNPROVIDED, UNPROVIDED));
                    if (NIL != doc) {
                        format(stream, $str_alt131$___________________a, doc);
                    }
                    kbi_print_environment_info(stream);
                    format(stream, $str_alt132$______item_count___s, length(data));
                    {
                        SubLObject pcase_var = module;
                        if (pcase_var.eql($kw133$ARG_TYPE_W_O_DEFN)) {
                            format(stream, $str_alt134$________retrieve_relations_releva);
                            format(stream, $str_alt135$______retrieve_mal_axioms_wrt_an_);
                        }
                    }
                    format(stream, $str_alt136$____);
                    if (NIL != fboundp(verbose_fn)) {
                        {
                            SubLObject verbose_string = kbi_why_verboseP(module, sorted_data.first());
                            format(stream, $str_alt137$____explained_example_____a______, verbose_string);
                        }
                    }
                    {
                        SubLObject cdolist_list_var = sorted_data;
                        SubLObject datum = NIL;
                        for (datum = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , datum = cdolist_list_var.first()) {
                            if (kbi_vars.$kbi_print_note_fn$.getDynamicValue(thread).isFunctionSpec()) {
                                if (NIL != funcall(kbi_vars.$kbi_print_note_fn$.getDynamicValue(thread), datum)) {
                                    format(stream, kbi_vars.$kbi_print_note$.getDynamicValue(thread));
                                }
                            }
                            format(stream, $str_alt138$___s, datum);
                            if (NIL != kbi_vars.$kbi_print_whyP$.getDynamicValue(thread)) {
                                {
                                    SubLObject why = kbi_whyP(module, datum, $NL);
                                    if (why.isString()) {
                                        format(stream, $str_alt140$______a____, why);
                                    }
                                }
                            }
                        }
                    }
                } finally {
                    {
                        SubLObject _prev_bind_0 = $is_thread_performing_cleanupP$.currentBinding(thread);
                        try {
                            $is_thread_performing_cleanupP$.bind(T, thread);
                            if (NIL != stream) {
                                close(stream, UNPROVIDED);
                            }
                        } finally {
                            $is_thread_performing_cleanupP$.rebind(_prev_bind_0, thread);
                        }
                    }
                }
                return filename;
            }
        }
    }

    public static final SubLObject kbi_print_environment_info(SubLObject stream) {
        if (stream == UNPROVIDED) {
            stream = T;
        }
        format(stream, $str_alt141$______time_printed___a, numeric_date_utilities.timestring(UNPROVIDED));
        format(stream, $str_alt142$______with_machine___a, Environment.get_machine_name($$$unknown));
        format(stream, $str_alt144$________________KB___s__s, control_vars.kb_loaded(), operation_communication.kb_op_number());
        format(stream, $str_alt145$____________system___a, system_info.cyc_revision_string());
        return NIL;
    }

    public static final SubLObject kbi_print_non_constant_data(SubLObject data, SubLObject module, SubLObject domain) {
        if (domain == UNPROVIDED) {
            domain = kbi_vars.$kbi_last_domain$.getDynamicValue();
        }
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            {
                SubLObject filename = kbi_filename(symbol_name(module), UNPROVIDED);
                SubLObject doc = get(module, $KBI_DOC, UNPROVIDED);
                SubLObject verbose_fn = get(module, $KBI_NL_VERBOSE_FN, UNPROVIDED);
                SubLObject sorted_data = kbi_sort_structures(data);
                SubLObject count = length(data);
                SubLObject domain_name = Strings.string_downcase(symbol_name(domain), UNPROVIDED, UNPROVIDED);
                SubLObject stream = NIL;
                try {
                    stream = compatibility.open_text(filename, $OUTPUT, UNPROVIDED);
                    kbi_print_file_header(stream);
                    format(stream, $str_alt122$_______a, filename);
                    format(stream, $str_alt130$______kbi_module___a, Strings.string_downcase(symbol_name(module), UNPROVIDED, UNPROVIDED));
                    if (NIL != doc) {
                        format(stream, $str_alt131$___________________a, doc);
                    }
                    kbi_print_environment_info(stream);
                    format(stream, $str_alt146$______item_count___s__, count);
                    if (NIL != kbi_vars.$kbi_print_idsP$.getDynamicValue(thread)) {
                        format(stream, $str_alt147$______retrieve__a_from_id_with__a, domain_name, Strings.string_downcase(format(NIL, $str_alt148$_a, structure_from_id_fn(domain)), UNPROVIDED, UNPROVIDED));
                    }
                    format(stream, $str_alt136$____);
                    if (NIL != fboundp(verbose_fn)) {
                        {
                            SubLObject verbose_string = kbi_why_verboseP(module, sorted_data.first());
                            format(stream, $str_alt137$____explained_example_____a______, verbose_string);
                        }
                    }
                    {
                        SubLObject list_var = sorted_data;
                        utilities_macros.$progress_note$.setDynamicValue(format(NIL, $str_alt149$kbi__mapping__a__a_results, count, domain_name), thread);
                        utilities_macros.$progress_start_time$.setDynamicValue(get_universal_time(), thread);
                        utilities_macros.$progress_total$.setDynamicValue(length(list_var), thread);
                        utilities_macros.$progress_sofar$.setDynamicValue(ZERO_INTEGER, thread);
                        {
                            SubLObject _prev_bind_0 = utilities_macros.$last_percent_progress_index$.currentBinding(thread);
                            SubLObject _prev_bind_1 = utilities_macros.$last_percent_progress_prediction$.currentBinding(thread);
                            SubLObject _prev_bind_2 = utilities_macros.$within_noting_percent_progress$.currentBinding(thread);
                            SubLObject _prev_bind_3 = utilities_macros.$percent_progress_start_time$.currentBinding(thread);
                            try {
                                utilities_macros.$last_percent_progress_index$.bind(ZERO_INTEGER, thread);
                                utilities_macros.$last_percent_progress_prediction$.bind(NIL, thread);
                                utilities_macros.$within_noting_percent_progress$.bind(T, thread);
                                utilities_macros.$percent_progress_start_time$.bind(get_universal_time(), thread);
                                utilities_macros.noting_percent_progress_preamble(utilities_macros.$progress_note$.getDynamicValue(thread));
                                {
                                    SubLObject csome_list_var = list_var;
                                    SubLObject datum = NIL;
                                    for (datum = csome_list_var.first(); NIL != csome_list_var; csome_list_var = csome_list_var.rest() , datum = csome_list_var.first()) {
                                        utilities_macros.note_percent_progress(utilities_macros.$progress_sofar$.getDynamicValue(thread), utilities_macros.$progress_total$.getDynamicValue(thread));
                                        utilities_macros.$progress_sofar$.setDynamicValue(add(utilities_macros.$progress_sofar$.getDynamicValue(thread), ONE_INTEGER), thread);
                                        if (kbi_vars.$kbi_print_note_fn$.getDynamicValue(thread).isFunctionSpec()) {
                                            if (NIL != funcall(kbi_vars.$kbi_print_note_fn$.getDynamicValue(thread), datum)) {
                                                format(stream, kbi_vars.$kbi_print_note$.getDynamicValue(thread));
                                            }
                                        }
                                        if (NIL != constant_handles.constant_p(datum)) {
                                            format(stream, $str_alt138$___s, datum);
                                        } else
                                            if (NIL != nart_handles.nart_p(datum)) {
                                                format(stream, $str_alt138$___s, narts_high.nart_el_formula(datum));
                                            } else
                                                if (NIL != assertion_handles.assertion_p(datum)) {
                                                    format(stream, $str_alt150$__);
                                                    if (NIL != kbi_vars.$kbi_print_idsP$.getDynamicValue(thread)) {
                                                        format(stream, $str_alt138$___s, assertion_handles.assertion_id(datum));
                                                    }
                                                    format(stream, $str_alt151$___s___s, fi.assertion_fi_formula(datum, UNPROVIDED), assertions_high.assertion_mt(datum));
                                                } else
                                                    if (NIL != clause_strucs.clause_struc_p(datum)) {
                                                        format(stream, $str_alt150$__);
                                                        if (NIL != kbi_vars.$kbi_print_idsP$.getDynamicValue(thread)) {
                                                            format(stream, $str_alt138$___s, clause_strucs.clause_struc_id(datum));
                                                        }
                                                        format(stream, $str_alt138$___s, datum);
                                                    } else
                                                        if (NIL != deduction_handles.deduction_p(datum)) {
                                                            format(stream, $str_alt138$___s, deduction_handles.deduction_id(datum));
                                                        } else
                                                            if (NIL != clauses.cnf_p(datum)) {
                                                                format(stream, $str_alt152$_____s, datum);
                                                            } else
                                                                if (NIL != el_utilities.literalP(datum)) {
                                                                    format(stream, $str_alt152$_____s, datum);
                                                                } else {
                                                                    Errors.warn($str_alt153$unknown_type_of_kbi_result__s, datum);
                                                                }






                                        if (NIL != kbi_vars.$kbi_print_whyP$.getDynamicValue(thread)) {
                                            {
                                                SubLObject why = kbi_whyP(module, datum, $NL);
                                                if (why.isString()) {
                                                    format(stream, $str_alt154$____a____, why);
                                                }
                                            }
                                        }
                                    }
                                }
                                utilities_macros.noting_percent_progress_postamble();
                            } finally {
                                utilities_macros.$percent_progress_start_time$.rebind(_prev_bind_3, thread);
                                utilities_macros.$within_noting_percent_progress$.rebind(_prev_bind_2, thread);
                                utilities_macros.$last_percent_progress_prediction$.rebind(_prev_bind_1, thread);
                                utilities_macros.$last_percent_progress_index$.rebind(_prev_bind_0, thread);
                            }
                        }
                    }
                } finally {
                    {
                        SubLObject _prev_bind_0 = $is_thread_performing_cleanupP$.currentBinding(thread);
                        try {
                            $is_thread_performing_cleanupP$.bind(T, thread);
                            if (NIL != stream) {
                                close(stream, UNPROVIDED);
                            }
                        } finally {
                            $is_thread_performing_cleanupP$.rebind(_prev_bind_0, thread);
                        }
                    }
                }
                return filename;
            }
        }
    }

    public static final SubLObject default_diagnostics_directory(SubLObject mt) {
        if (mt == UNPROVIDED) {
            mt = NIL;
        }
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            if (NIL != kbi_vars.$kbi_directory$.getDynamicValue(thread)) {
                return kbi_vars.$kbi_directory$.getDynamicValue(thread);
            } else
                if (NIL != constant_handles.constant_p(mt)) {
                    return list($$$data, $$$kbi, string_utilities.str(control_vars.kb_loaded()), constants_high.constant_name(mt));
                } else {
                    return list($$$data, $$$kbi, string_utilities.str(control_vars.kb_loaded()));
                }

        }
    }

    public static final SubLObject kbi_summary_filename(SubLObject type) {
        {
            SubLObject name = format(NIL, $str_alt157$_a_summary, Strings.string_downcase(symbol_name(type), UNPROVIDED, UNPROVIDED));
            return kbi_filename(name, UNPROVIDED);
        }
    }

    public static final SubLObject kbi_filename(SubLObject name, SubLObject directory) {
        if (directory == UNPROVIDED) {
            directory = default_diagnostics_directory(UNPROVIDED);
        }
        return Filesys.construct_filename(directory, file_utilities.clean_filename(name), $$$text, T);
    }

    public static final SubLObject kbi_print_file_header(SubLObject stream) {
        format(stream, $str_alt159$________Mode__LISP__Package__CYC_);
        format(stream, $str_alt160$______Copyright__c__2000___2006_C);
        return NIL;
    }

    public static final SubLObject kbi_sort_structures(SubLObject data) {
        {
            SubLObject structure = data.first();
            if (NIL != constant_handles.constant_p(structure)) {
                if (NIL == list_utilities.find_if_not(CONSTANT_P, data, UNPROVIDED, UNPROVIDED, UNPROVIDED)) {
                    return Sort.sort(copy_list(data), symbol_function($sym161$TERM__), UNPROVIDED);
                }
            } else
                if (NIL != nart_handles.nart_p(structure)) {
                    if (NIL == list_utilities.find_if_not(NART_P, data, UNPROVIDED, UNPROVIDED, UNPROVIDED)) {
                        return Sort.sort(copy_list(data), symbol_function($sym161$TERM__), UNPROVIDED);
                    }
                } else
                    if (NIL != assertion_handles.assertion_p(structure)) {
                        if (NIL == list_utilities.find_if_not(ASSERTION_P, data, UNPROVIDED, UNPROVIDED, UNPROVIDED)) {
                            return Sort.sort(copy_list(data), symbol_function($sym164$_), symbol_function(ASSERTION_ID));
                        }
                    } else
                        if (NIL != deduction_handles.deduction_p(structure)) {
                            if (NIL == list_utilities.find_if_not(DEDUCTION_P, data, UNPROVIDED, UNPROVIDED, UNPROVIDED)) {
                                return Sort.sort(copy_list(data), symbol_function($sym164$_), symbol_function(DEDUCTION_ID));
                            }
                        } else
                            if (NIL != clause_strucs.clause_struc_p(structure)) {
                                if (NIL == list_utilities.find_if_not(CLAUSE_STRUC_P, data, UNPROVIDED, UNPROVIDED, UNPROVIDED)) {
                                    return Sort.sort(copy_list(data), symbol_function($sym164$_), symbol_function(CLAUSE_STRUC_ID));
                                }
                            }




            return data;
        }
    }

    public static final SubLObject structure_from_id_fn(SubLObject domain) {
        {
            SubLObject pcase_var = domain;
            if (pcase_var.eql($ASSERTION)) {
                return FIND_ASSERTION_BY_ID;
            } else
                if (pcase_var.eql($SOURCE)) {
                    return FIND_DEDUCTION_BY_ID;
                } else
                    if (pcase_var.eql($DEDUCTION)) {
                        return FIND_DEDUCTION_BY_ID;
                    } else
                        if (pcase_var.eql($AXIOM)) {
                            return FIND_CLAUSE_STRUC_BY_ID;
                        } else {
                            Errors.warn($str_alt177$unknown_type_of_structure___s, domain);
                        }



        }
        return NIL;
    }

    public static final SubLObject sort_constants_by_name(SubLObject constants) {
        {
            SubLObject archive = constants;
            SubLObject result = Sort.sort(copy_list(constants), symbol_function($sym178$STRING_), symbol_function(CONSTANT_NAME));
            if (length(archive) != length(result)) {
                Errors.error($str_alt180$pre_sort_cardinality__s__post_sor, length(archive), length(result));
            }
            return result;
        }
    }

    public static final SubLObject declare_kbi_utilities_file() {
        declareFunction("constrains_arg", "CONSTRAINS-ARG", 1, 1, false);
        declareFunction("max_type_constrained_arg", "MAX-TYPE-CONSTRAINED-ARG", 1, 1, false);
        declareFunction("gather_max_constrained_arg", "GATHER-MAX-CONSTRAINED-ARG", 1, 0, false);
        declareFunction("accumulate_max_constrained_arg", "ACCUMULATE-MAX-CONSTRAINED-ARG", 1, 0, false);
        declareFunction("kbi_moduleP", "KBI-MODULE?", 1, 0, false);
        declareFunction("valid_kbi_attributeP", "VALID-KBI-ATTRIBUTE?", 1, 0, false);
        declareFunction("validated_kbi_attributeP", "VALIDATED-KBI-ATTRIBUTE?", 1, 1, false);
        declareFunction("validated_kbi_propertyP", "VALIDATED-KBI-PROPERTY?", 2, 0, false);
        declareFunction("install_kbi_properties", "INSTALL-KBI-PROPERTIES", 2, 1, false);
        declareFunction("install_kbi_module", "INSTALL-KBI-MODULE", 2, 0, false);
        declareFunction("declare_kbi_module", "DECLARE-KBI-MODULE", 1, 0, false);
        declareFunction("clear_kbi_module_properties", "CLEAR-KBI-MODULE-PROPERTIES", 1, 0, false);
        declareFunction("check_required_kbi_attributes", "CHECK-REQUIRED-KBI-ATTRIBUTES", 1, 0, false);
        declareFunction("run_kbi_module", "RUN-KBI-MODULE", 2, 0, false);
        declareFunction("kbi_findingP", "KBI-FINDING?", 2, 0, false);
        declareFunction("kbi_whyP", "KBI-WHY?", 2, 1, false);
        declareFunction("justify_kbi_module", "JUSTIFY-KBI-MODULE", 2, 1, false);
        declareFunction("kbi_why_verboseP", "KBI-WHY-VERBOSE?", 2, 0, false);
        declareFunction("kbi_module_resultP", "KBI-MODULE-RESULT?", 2, 0, false);
        declareFunction("kbi_module_appliesP", "KBI-MODULE-APPLIES?", 2, 0, false);
        declareFunction("kbi_repair_result", "KBI-REPAIR-RESULT", 2, 0, false);
        declareFunction("kbi_cache_result", "KBI-CACHE-RESULT", 2, 0, false);
        declareFunction("kbi_cache_repair", "KBI-CACHE-REPAIR", 2, 0, false);
        declareFunction("kbi_required_satisfiedP", "KBI-REQUIRED-SATISFIED?", 2, 0, false);
        declareFunction("kbi_exceptionP", "KBI-EXCEPTION?", 2, 0, false);
        declareFunction("kbi_add_exception", "KBI-ADD-EXCEPTION", 2, 0, false);
        declareFunction("kbi_remove_exception", "KBI-REMOVE-EXCEPTION", 2, 0, false);
        declareFunction("kbi_increment_count", "KBI-INCREMENT-COUNT", 1, 0, false);
        declareFunction("kbi_increment_time", "KBI-INCREMENT-TIME", 2, 0, false);
        declareFunction("define_kbi_attribute", "DEFINE-KBI-ATTRIBUTE", 2, 0, false);
        declareFunction("declare_kbi_attribute", "DECLARE-KBI-ATTRIBUTE", 1, 0, false);
        declareFunction("clear_kbi_attribute_properties", "CLEAR-KBI-ATTRIBUTE-PROPERTIES", 1, 0, false);
        declareFunction("install_kbi_attribute_properties", "INSTALL-KBI-ATTRIBUTE-PROPERTIES", 2, 0, false);
        declareFunction("define_kbi_domain_attribute", "DEFINE-KBI-DOMAIN-ATTRIBUTE", 2, 0, false);
        declareFunction("declare_kbi_domain_attribute", "DECLARE-KBI-DOMAIN-ATTRIBUTE", 1, 0, false);
        declareFunction("clear_kbi_domain_attribute_properties", "CLEAR-KBI-DOMAIN-ATTRIBUTE-PROPERTIES", 1, 0, false);
        declareFunction("install_kbi_domain_attribute_properties", "INSTALL-KBI-DOMAIN-ATTRIBUTE-PROPERTIES", 2, 0, false);
        declareFunction("kbi_domainP", "KBI-DOMAIN?", 1, 0, false);
        declareFunction("define_kbi_domain", "DEFINE-KBI-DOMAIN", 2, 0, false);
        declareFunction("declare_kbi_domain", "DECLARE-KBI-DOMAIN", 1, 0, false);
        declareFunction("clear_kbi_domain_properties", "CLEAR-KBI-DOMAIN-PROPERTIES", 1, 0, false);
        declareFunction("install_kbi_domain_properties", "INSTALL-KBI-DOMAIN-PROPERTIES", 2, 0, false);
        declareFunction("in_kbi_module_domainP", "IN-KBI-MODULE-DOMAIN?", 2, 0, false);
        declareFunction("kbi_applies_toP", "KBI-APPLIES-TO?", 2, 0, false);
        declareFunction("diagnose_qua_domain", "DIAGNOSE-QUA-DOMAIN", 2, 0, false);
        declareFunction("diagnose_qua_super_domains", "DIAGNOSE-QUA-SUPER-DOMAINS", 2, 0, false);
        declareFunction("diagnose_qua_sub_domains", "DIAGNOSE-QUA-SUB-DOMAINS", 2, 0, false);
        declareFunction("apply_kbi_module", "APPLY-KBI-MODULE", 2, 0, false);
        declareFunction("kbi_super_domain_modules", "KBI-SUPER-DOMAIN-MODULES", 1, 0, false);
        declareFunction("kbi_sub_domain_modules", "KBI-SUB-DOMAIN-MODULES", 1, 0, false);
        declareFunction("clear_cached_kbi_sub_domain_modules", "CLEAR-CACHED-KBI-SUB-DOMAIN-MODULES", 0, 0, false);
        declareFunction("remove_cached_kbi_sub_domain_modules", "REMOVE-CACHED-KBI-SUB-DOMAIN-MODULES", 1, 0, false);
        declareFunction("cached_kbi_sub_domain_modules_internal", "CACHED-KBI-SUB-DOMAIN-MODULES-INTERNAL", 1, 0, false);
        declareFunction("cached_kbi_sub_domain_modules", "CACHED-KBI-SUB-DOMAIN-MODULES", 1, 0, false);
        declareFunction("set_kbi_external_sub_domain_modules", "SET-KBI-EXTERNAL-SUB-DOMAIN-MODULES", 2, 0, false);
        declareFunction("clear_kbi_external_sub_domain_modules", "CLEAR-KBI-EXTERNAL-SUB-DOMAIN-MODULES", 0, 0, false);
        declareFunction("clear_kbi_accessible_modules", "CLEAR-KBI-ACCESSIBLE-MODULES", 0, 0, false);
        declareFunction("remove_kbi_accessible_modules", "REMOVE-KBI-ACCESSIBLE-MODULES", 1, 0, false);
        declareFunction("kbi_accessible_modules_internal", "KBI-ACCESSIBLE-MODULES-INTERNAL", 1, 0, false);
        declareFunction("kbi_accessible_modules", "KBI-ACCESSIBLE-MODULES", 1, 0, false);
        declareFunction("clear_kbi_all_sub_domains", "CLEAR-KBI-ALL-SUB-DOMAINS", 0, 0, false);
        declareFunction("remove_kbi_all_sub_domains", "REMOVE-KBI-ALL-SUB-DOMAINS", 1, 0, false);
        declareFunction("kbi_all_sub_domains_internal", "KBI-ALL-SUB-DOMAINS-INTERNAL", 1, 0, false);
        declareFunction("kbi_all_sub_domains", "KBI-ALL-SUB-DOMAINS", 1, 0, false);
        declareFunction("kbi_domain_modules", "KBI-DOMAIN-MODULES", 1, 0, false);
        declareFunction("kbi_applicable_modules", "KBI-APPLICABLE-MODULES", 1, 0, false);
        declareFunction("kbi_domains", "KBI-DOMAINS", 0, 1, false);
        declareFunction("in_kbi_domainP", "IN-KBI-DOMAIN?", 2, 0, false);
        declareFunction("kbi_result", "KBI-RESULT", 0, 0, false);
        declareFunction("kbi_resultP", "KBI-RESULT?", 1, 2, false);
        declareFunction("set_kbi_result", "SET-KBI-RESULT", 1, 0, false);
        declareFunction("add_kbi_result", "ADD-KBI-RESULT", 1, 0, false);
        declareFunction("adjoin_kbi_result", "ADJOIN-KBI-RESULT", 1, 2, false);
        declareFunction("adjoin_prop_kbi_result", "ADJOIN-PROP-KBI-RESULT", 2, 2, false);
        declareFunction("nreverse_kbi_result", "NREVERSE-KBI-RESULT", 0, 0, false);
        declareFunction("kbi_doneP", "KBI-DONE?", 0, 1, false);
        declareFunction("kbi_done_if_any_result", "KBI-DONE-IF-ANY-RESULT", 0, 1, false);
        declareFunction("run_kbi_moduleP", "RUN-KBI-MODULE?", 1, 0, false);
        declareFunction("reset_kbi_state", "RESET-KBI-STATE", 0, 1, false);
        declareFunction("reset_diagnostic_results", "RESET-DIAGNOSTIC-RESULTS", 1, 0, false);
        declareFunction("reset_kbi_domain_results", "RESET-KBI-DOMAIN-RESULTS", 1, 0, false);
        declareFunction("reset_kbi_module_results", "RESET-KBI-MODULE-RESULTS", 1, 1, false);
        declareFunction("kbi_module_selectedP", "KBI-MODULE-SELECTED?", 1, 0, false);
        declareFunction("kbi_selected_modules", "KBI-SELECTED-MODULES", 0, 1, false);
        declareFunction("kbi_unselected_modules", "KBI-UNSELECTED-MODULES", 0, 1, false);
        declareFunction("kbi_unselect_modules", "KBI-UNSELECT-MODULES", 1, 0, false);
        declareFunction("kbi_select_modules", "KBI-SELECT-MODULES", 1, 0, false);
        declareFunction("kbi_apply", "KBI-APPLY", 2, 0, false);
        declareFunction("kbi_select_module", "KBI-SELECT-MODULE", 1, 0, false);
        declareFunction("kbi_unselect_module", "KBI-UNSELECT-MODULE", 1, 0, false);
        declareFunction("kbi_set_module_property", "KBI-SET-MODULE-PROPERTY", 3, 0, false);
        declareFunction("set_module_property_int", "SET-MODULE-PROPERTY-INT", 3, 1, false);
        declareFunction("set_kbi_property_int", "SET-KBI-PROPERTY-INT", 3, 0, false);
        declareFunction("kbi_redo_module_results", "KBI-REDO-MODULE-RESULTS", 1, 0, false);
        declareFunction("kbi_note", "KBI-NOTE", 2, 5, false);
        declareFunction("kbi_error", "KBI-ERROR", 2, 5, false);
        declareFunction("kbi_cerror", "KBI-CERROR", 3, 5, false);
        declareFunction("kbi_warn", "KBI-WARN", 2, 5, false);
        declareFunction("kbi_status", "KBI-STATUS", 0, 3, false);
        declareFunction("diagnostics_status", "DIAGNOSTICS-STATUS", 0, 4, false);
        declareFunction("print_kbi_result_status_line", "PRINT-KBI-RESULT-STATUS-LINE", 1, 2, false);
        declareFunction("print_kbi_repair_status_line", "PRINT-KBI-REPAIR-STATUS-LINE", 1, 2, false);
        declareFunction("kbi_result_cache", "KBI-RESULT-CACHE", 1, 0, false);
        declareFunction("kbi_result_data", "KBI-RESULT-DATA", 1, 0, false);
        declareFunction("kbi_repair_cache", "KBI-REPAIR-CACHE", 1, 0, false);
        declareFunction("kbi_repair_data", "KBI-REPAIR-DATA", 1, 0, false);
        declareFunction("kbi_examples", "KBI-EXAMPLES", 1, 1, false);
        declareFunction("kbi_domain", "KBI-DOMAIN", 1, 0, false);
        declareFunction("diagnostic_items_to_consider", "DIAGNOSTIC-ITEMS-TO-CONSIDER", 0, 1, false);
        declareFunction("kbi_domain_count", "KBI-DOMAIN-COUNT", 1, 0, false);
        declareFunction("kbi_module_count", "KBI-MODULE-COUNT", 1, 0, false);
        declareFunction("kbi_module_time", "KBI-MODULE-TIME", 1, 0, false);
        declareFunction("reset_module_attribute", "RESET-MODULE-ATTRIBUTE", 2, 0, false);
        declareFunction("kbi_duplicates", "KBI-DUPLICATES", 1, 2, false);
        declareFunction("kbi_cached_duplicates", "KBI-CACHED-DUPLICATES", 1, 2, false);
        declareFunction("clear_kbi_cached_term_mts", "CLEAR-KBI-CACHED-TERM-MTS", 0, 0, false);
        declareFunction("remove_kbi_cached_term_mts", "REMOVE-KBI-CACHED-TERM-MTS", 1, 0, false);
        declareFunction("kbi_cached_term_mts_internal", "KBI-CACHED-TERM-MTS-INTERNAL", 1, 0, false);
        declareFunction("kbi_cached_term_mts", "KBI-CACHED-TERM-MTS", 1, 0, false);
        declareFunction("kbi_check_predicate_doneP", "KBI-CHECK-PREDICATE-DONE?", 1, 0, false);
        declareFunction("kbi_check_predicate_done", "KBI-CHECK-PREDICATE-DONE", 1, 0, false);
        declareFunction("kbi_why_not_isaP", "KBI-WHY-NOT-ISA?", 2, 1, false);
        declareFunction("public_axiomP", "PUBLIC-AXIOM?", 1, 0, false);
        declareFunction("public_natP", "PUBLIC-NAT?", 1, 0, false);
        declareFunction("public_structureP", "PUBLIC-STRUCTURE?", 1, 0, false);
        declareFunction("non_public_structureP", "NON-PUBLIC-STRUCTURE?", 1, 0, false);
        declareFunction("public_assertions_of_term", "PUBLIC-ASSERTIONS-OF-TERM", 1, 0, false);
        declareFunction("print_public_assertions_nl", "PRINT-PUBLIC-ASSERTIONS-NL", 1, 0, false);
        declareFunction("kbi_transform", "KBI-TRANSFORM", 1, 1, false);
        declareFunction("kbi_transform_nats", "KBI-TRANSFORM-NATS", 1, 1, false);
        declareFunction("kbi_transform_assertions", "KBI-TRANSFORM-ASSERTIONS", 1, 1, false);
        declareFunction("kbi_print_results", "KBI-PRINT-RESULTS", 0, 0, false);
        declareFunction("kbi_print_domain_results", "KBI-PRINT-DOMAIN-RESULTS", 1, 0, false);
        declareFunction("kbi_print_domain_summary", "KBI-PRINT-DOMAIN-SUMMARY", 1, 0, false);
        declareFunction("kbi_print_domain_module_results", "KBI-PRINT-DOMAIN-MODULE-RESULTS", 1, 0, false);
        declareFunction("kbi_domain_has_resultsP", "KBI-DOMAIN-HAS-RESULTS?", 1, 0, false);
        declareFunction("kbi_print_module_results", "KBI-PRINT-MODULE-RESULTS", 2, 0, false);
        declareFunction("kbi_print_module_data_results", "KBI-PRINT-MODULE-DATA-RESULTS", 3, 0, false);
        declareFunction("kbi_print_constant_data", "KBI-PRINT-CONSTANT-DATA", 2, 0, false);
        declareFunction("kbi_print_environment_info", "KBI-PRINT-ENVIRONMENT-INFO", 0, 1, false);
        declareFunction("kbi_print_non_constant_data", "KBI-PRINT-NON-CONSTANT-DATA", 2, 1, false);
        declareFunction("default_diagnostics_directory", "DEFAULT-DIAGNOSTICS-DIRECTORY", 0, 1, false);
        declareFunction("kbi_summary_filename", "KBI-SUMMARY-FILENAME", 1, 0, false);
        declareFunction("kbi_filename", "KBI-FILENAME", 1, 1, false);
        declareFunction("kbi_print_file_header", "KBI-PRINT-FILE-HEADER", 1, 0, false);
        declareFunction("kbi_sort_structures", "KBI-SORT-STRUCTURES", 1, 0, false);
        declareFunction("structure_from_id_fn", "STRUCTURE-FROM-ID-FN", 1, 0, false);
        declareFunction("sort_constants_by_name", "SORT-CONSTANTS-BY-NAME", 1, 0, false);
        return NIL;
    }

    public static final SubLObject init_kbi_utilities_file() {
        defparameter("*MAPPING-REFERENCE-DATA*", NIL);
        defparameter("*KBI-EXTERNAL-SUB-DOMAIN-MODULES-HASH*", make_hash_table($int$32, UNPROVIDED, UNPROVIDED));
        deflexical("*CACHED-KBI-SUB-DOMAIN-MODULES-CACHING-STATE*", NIL);
        deflexical("*KBI-ACCESSIBLE-MODULES-CACHING-STATE*", NIL);
        deflexical("*KBI-ALL-SUB-DOMAINS-CACHING-STATE*", NIL);
        deflexical("*KBI-CACHED-TERM-MTS-CACHING-STATE*", NIL);
        return NIL;
    }

    public static final SubLObject setup_kbi_utilities_file() {
                {
            SubLObject item_var = $kbi_external_sub_domain_modules_hash$;
            if (NIL == member(item_var, utilities_macros.$kbi_state_variables$.getGlobalValue(), symbol_function(EQL), symbol_function(IDENTITY))) {
                utilities_macros.$kbi_state_variables$.setGlobalValue(cons(item_var, utilities_macros.$kbi_state_variables$.getGlobalValue()));
            }
        }
        utilities_macros.note_state_variable_documentation($kbi_external_sub_domain_modules_hash$, NIL);
        memoization_state.note_globally_cached_function(CACHED_KBI_SUB_DOMAIN_MODULES);
        memoization_state.note_globally_cached_function(KBI_ACCESSIBLE_MODULES);
        memoization_state.note_globally_cached_function(KBI_ALL_SUB_DOMAINS);
        memoization_state.note_globally_cached_function(KBI_CACHED_TERM_MTS);
        define_kbi_domain_attribute($DOMAIN_DEFN, $list_alt181);
        define_kbi_domain_attribute($DOMAIN_COUNT_FN, $list_alt182);
        define_kbi_domain_attribute($SUPER_DOMAINS, $list_alt183);
        define_kbi_domain_attribute($SUB_DOMAINS, $list_alt184);
        define_kbi_domain_attribute($DEPENDENTS, $list_alt185);
        define_kbi_domain_attribute($PRINT_NAME, $list_alt187);
        define_kbi_domain($FORT, $list_alt188);
        define_kbi_domain($CONSTANT, $list_alt189);
        define_kbi_domain($ASSERTION, $list_alt190);
        define_kbi_domain($AXIOM, $list_alt191);
        define_kbi_domain($SOURCE, $list_alt192);
        define_kbi_domain($NAT, $list_alt194);
        define_kbi_domain($NL_WORD, $list_alt196);
        define_kbi_domain($SBHL_FORT, $list_alt198);
        define_kbi_domain($COLLECTION, $list_alt200);
        define_kbi_domain($MT, $list_alt202);
        define_kbi_domain($ATTRIBUTE, $list_alt204);
        define_kbi_domain($RELATION, $list_alt206);
        define_kbi_domain($PREDICATE, $list_alt208);
        define_kbi_domain($FUNCTION, $list_alt210);
        define_kbi_domain($SKOLEM, $list_alt212);
        define_kbi_domain($CLAUSE, $list_alt214);
        define_kbi_domain($CNF, $list_alt216);
        define_kbi_domain($DNF, $list_alt218);
        define_kbi_domain($GAF, $list_alt220);
        define_kbi_domain($LITERAL, $list_alt222);
        define_kbi_domain($FORMULA, $list_alt224);
        define_kbi_attribute($KBI_DOMAIN, $list_alt225);
        define_kbi_attribute($KBI_LEVEL, $list_alt226);
        define_kbi_attribute($KBI_APPLY_FN, $list_alt227);
        define_kbi_attribute($SUPPLANTS, $list_alt229);
        define_kbi_attribute($SUPPLANTED_BY, $list_alt230);
        define_kbi_attribute($KBI_REQUIRED_FN, $list_alt231);
        define_kbi_attribute($KBI_EVALUATION_FN, $list_alt232);
        define_kbi_attribute($KBI_PREDICATE_FN, $list_alt233);
        define_kbi_attribute($KBI_RESULT_FN, $list_alt235);
        define_kbi_attribute($KBI_JUSTIFY_FN, $list_alt236);
        define_kbi_attribute($KBI_NL_JUST_FN, $list_alt238);
        define_kbi_attribute($KBI_NL_VERBOSE_FN, $list_alt239);
        define_kbi_attribute($KBI_REPAIR_FN, $list_alt240);
        define_kbi_attribute($KBI_CACHE_FN, $list_alt241);
        define_kbi_attribute($kw82$KBI_SELECTED_, $list_alt242);
        define_kbi_attribute($KBI_COUNT_CACHE, $list_alt243);
        define_kbi_attribute($KBI_TIME_CACHE, $list_alt244);
        define_kbi_attribute($kw245$KBI_CACHE_RESULTS_, $list_alt246);
        define_kbi_attribute($KBI_RESULT_CACHE, $list_alt247);
        define_kbi_attribute($kw248$KBI_CACHE_REPAIRS_, $list_alt249);
        define_kbi_attribute($KBI_REPAIR_CACHE, $list_alt250);
        define_kbi_attribute($KBI_CONCERN_FOR, $list_alt251);
        define_kbi_attribute($KBI_CONCERN_LEVEL, $list_alt253);
        define_kbi_attribute($KBI_CONCERN_TYPE, $list_alt254);
        define_kbi_attribute($KBI_RESULT_TYPE, $list_alt256);
        define_kbi_attribute($KBI_PRIORITY, $list_alt258);
        define_kbi_attribute($KBI_URGENCY, $list_alt260);
        define_kbi_attribute($KBI_DOC, $list_alt261);
        define_kbi_attribute($KBI_COMMENT, $list_alt263);
        define_kbi_attribute($KBI_AUTHOR, $list_alt265);
        define_kbi_attribute($KBI_DATE, $list_alt267);
        define_kbi_attribute($KBI_STATUS, $list_alt269);
        define_kbi_attribute($KBI_EL_FORMULA, $list_alt271);
        define_kbi_attribute($KBI_EXAMPLE_OBJECT, $list_alt273);
        define_kbi_attribute($KBI_EXAMPLE_RESULT, $list_alt275);
        define_kbi_attribute($KBI_EXAMPLE_REPAIR, $list_alt277);
        define_kbi_attribute($KBI_PRINT_NAME, $list_alt279);
        return NIL;
    }

    // // Internal Constants
    public static final SubLObject $$constrainsArg = constant_handles.reader_make_constant_shell(makeString("constrainsArg"));

    private static final SubLSymbol GATHER_MAX_CONSTRAINED_ARG = makeSymbol("GATHER-MAX-CONSTRAINED-ARG");

    public static final SubLObject $$ArgIsaBinaryPredicate = constant_handles.reader_make_constant_shell(makeString("ArgIsaBinaryPredicate"));

    public static final SubLObject $$InterArgIsaPredicate = constant_handles.reader_make_constant_shell(makeString("InterArgIsaPredicate"));

    public static final SubLObject $$ArgGenlBinaryPredicate = constant_handles.reader_make_constant_shell(makeString("ArgGenlBinaryPredicate"));

    public static final SubLObject $$InterArgGenlPredicate = constant_handles.reader_make_constant_shell(makeString("InterArgGenlPredicate"));

    private static final SubLSymbol ACCUMULATE_MAX_CONSTRAINED_ARG = makeSymbol("ACCUMULATE-MAX-CONSTRAINED-ARG");

    static private final SubLSymbol $sym7$VALID_KBI_ATTRIBUTE_ = makeSymbol("VALID-KBI-ATTRIBUTE?");

    static private final SubLString $$$skip_attribute_and_continue = makeString("skip attribute and continue");

    static private final SubLString $str_alt9$_s_does_not_satisfy_kbi_attribute = makeString("~s does not satisfy kbi-attribute test ~s");

    static private final SubLString $str_alt10$_s_is_used_as_an_kbi_attribute_te = makeString("~s is used as an kbi-attribute test but has no function definition");

    private static final SubLSymbol $VALUE_TYPE = makeKeyword("VALUE-TYPE");

    static private final SubLString $str_alt12$_s_does_not_satisfy_kbi_attribute = makeString("~s does not satisfy kbi-attribute ~s value test ~s");

    static private final SubLString $str_alt13$_s_appears_as_a__value_type_for_a = makeString("~s appears as a :value-type for attribute ~s but is not a function");

    private static final SubLSymbol $CANDIDATE_VALUES = makeKeyword("CANDIDATE-VALUES");

    static private final SubLString $str_alt15$_s_is_not_among_attriubte__s_vali = makeString("~s is not among attriubte ~s valid candidate values: ~s");

    static private final SubLString $str_alt16$_s_appears_as_a__candidate_values = makeString("~s appears as a :candidate-values for attribute ~s but is not a list");

    private static final SubLSymbol $KBI_DOMAIN = makeKeyword("KBI-DOMAIN");

    static private final SubLString $$$continue = makeString("continue");

    static private final SubLString $str_alt19$module__s_does_not_have_a__kbi_do = makeString("module ~s does not have a :kbi-domain");

    private static final SubLSymbol $CYC_SYMBOL = makeKeyword("CYC-SYMBOL");

    private static final SubLSymbol $KBI_MODULE = makeKeyword("KBI-MODULE");



    private static final SubLSymbol $NECESSITY = makeKeyword("NECESSITY");



    static private final SubLString $str_alt25$_s_does_not_have_a_value_for_requ = makeString("~s does not have a value for required kbi-attribute ~s");

    private static final SubLSymbol $KBI_PREDICATE_FN = makeKeyword("KBI-PREDICATE-FN");

    static private final SubLString $$$continue_anyway = makeString("continue anyway");

    static private final SubLString $str_alt28$kbi_module__s_has_invalid_predica = makeString("kbi module ~s has invalid predicate-fn ~s");

    private static final SubLSymbol $KBI_JUSTIFY_FN = makeKeyword("KBI-JUSTIFY-FN");

    static private final SubLString $str_alt30$kbi_module__s_has_invalid_conditi = makeString("kbi module ~s has invalid condition-fn ~s");

    private static final SubLSymbol $KBI_EVALUATION_FN = makeKeyword("KBI-EVALUATION-FN");



    private static final SubLSymbol $KBI_ERROR = makeKeyword("KBI-ERROR");

    private static final SubLSymbol $KBI_NL_VERBOSE_FN = makeKeyword("KBI-NL-VERBOSE-FN");

    private static final SubLSymbol $SUPPLANTED_BY = makeKeyword("SUPPLANTED-BY");

    private static final SubLSymbol $KBI_APPLY_FN = makeKeyword("KBI-APPLY-FN");



    public static final SubLObject $$EverythingPSC = constant_handles.reader_make_constant_shell(makeString("EverythingPSC"));

    static private final SubLString $str_alt39$kbi_module__s_has_invalid_apply_f = makeString("kbi module ~s has invalid apply-fn ~s");

    private static final SubLSymbol $KBI_REPAIR_FN = makeKeyword("KBI-REPAIR-FN");

    private static final SubLSymbol $KBI_CACHE_FN = makeKeyword("KBI-CACHE-FN");

    private static final SubLSymbol $KBI_RESULT_CACHE = makeKeyword("KBI-RESULT-CACHE");

    static private final SubLString $str_alt43$undefined__kbi_result_cache_for_m = makeString("undefined :kbi-result-cache for module ~s: ~s");

    static private final SubLString $str_alt44$no__kbi_result_cache_for_module__ = makeString("no :kbi-result-cache for module: ~s");

    private static final SubLSymbol $KBI_REPAIR_VAR = makeKeyword("KBI-REPAIR-VAR");

    static private final SubLString $str_alt46$unbound__kbi_repair_var_for_modul = makeString("unbound :kbi-repair-var for module: ~s");

    static private final SubLString $str_alt47$no__kbi_repair_var_for_module___s = makeString("no :kbi-repair-var for module: ~s");

    private static final SubLSymbol $KBI_REQUIRED_FN = makeKeyword("KBI-REQUIRED-FN");

    static private final SubLString $str_alt49$unbound__kbi_required_fn_for_modu = makeString("unbound :kbi-required-fn for module: ~s");

    private static final SubLSymbol $KBI_EXCEPTIONS = makeKeyword("KBI-EXCEPTIONS");

    static private final SubLString $str_alt51$invalid__kbi_exceptions_for_modul = makeString("invalid :kbi-exceptions for module ~s: ~s");

    static private final SubLString $str_alt52$unbound__kbi_exceptions_for_modul = makeString("unbound :kbi-exceptions for module: ~s");

    private static final SubLSymbol $KBI_COUNT_CACHE = makeKeyword("KBI-COUNT-CACHE");

    static private final SubLString $str_alt54$invalid__kbi_count_cache_for_modu = makeString("invalid :kbi-count-cache for module ~s: ~s");

    static private final SubLString $str_alt55$kbi_module__s_has_invalid_count_c = makeString("kbi module ~s has invalid count cache ~s");

    private static final SubLSymbol $KBI_TIME_CACHE = makeKeyword("KBI-TIME-CACHE");

    static private final SubLString $str_alt57$invalid__kbi_time_cache_for_modul = makeString("invalid :kbi-time-cache for module ~s: ~s");

    static private final SubLString $str_alt58$kbi_module__s_has_invalid_time_ca = makeString("kbi module ~s has invalid time cache ~s");

    static private final SubLString $str_alt59$invalid_time_increment___s = makeString("invalid time increment: ~s");

    private static final SubLSymbol $KBI_MODULE_ATTRIBUTE = makeKeyword("KBI-MODULE-ATTRIBUTE");

    static private final SubLString $str_alt61$_s_is_not_a_valid_kbi_meta_attrib = makeString("~s is not a valid kbi-meta-attribute");

    private static final SubLSymbol $KBI_DOMAIN_ATTRIBUTE = makeKeyword("KBI-DOMAIN-ATTRIBUTE");

    static private final SubLString $str_alt63$_s_is_not_a_valid_kbi_domain_attr = makeString("~s is not a valid kbi-domain-attribute");

    private static final SubLSymbol $SUPER_DOMAINS = makeKeyword("SUPER-DOMAINS");



    public static final SubLSymbol $kbi_external_sub_domain_modules_hash$ = makeSymbol("*KBI-EXTERNAL-SUB-DOMAIN-MODULES-HASH*");

    private static final SubLSymbol CACHED_KBI_SUB_DOMAIN_MODULES = makeSymbol("CACHED-KBI-SUB-DOMAIN-MODULES");

    private static final SubLSymbol $SUB_DOMAINS = makeKeyword("SUB-DOMAINS");

    public static final SubLSymbol $cached_kbi_sub_domain_modules_caching_state$ = makeSymbol("*CACHED-KBI-SUB-DOMAIN-MODULES-CACHING-STATE*");

    public static final SubLSymbol $kw70$_MEMOIZED_ITEM_NOT_FOUND_ = makeKeyword("&MEMOIZED-ITEM-NOT-FOUND&");

    private static final SubLSymbol KBI_ACCESSIBLE_MODULES = makeSymbol("KBI-ACCESSIBLE-MODULES");



    public static final SubLSymbol $kbi_accessible_modules_caching_state$ = makeSymbol("*KBI-ACCESSIBLE-MODULES-CACHING-STATE*");

    private static final SubLSymbol KBI_ALL_SUB_DOMAINS = makeSymbol("KBI-ALL-SUB-DOMAINS");

    public static final SubLSymbol $kbi_all_sub_domains_caching_state$ = makeSymbol("*KBI-ALL-SUB-DOMAINS-CACHING-STATE*");

    private static final SubLSymbol $DOMAIN_DEFN = makeKeyword("DOMAIN-DEFN");

    static private final SubLString $str_alt77$kbi_domain__s_has_invalid_defn__s = makeString("kbi domain ~s has invalid defn ~s");

    private static final SubLSymbol $KBI_LEVEL = makeKeyword("KBI-LEVEL");

    private static final SubLSymbol $KBI_CONCERN_FOR = makeKeyword("KBI-CONCERN-FOR");

    private static final SubLSymbol $KBI_CONCERN_TYPE = makeKeyword("KBI-CONCERN-TYPE");

    static private final SubLString $str_alt81$invalid_kbi_module___s = makeString("invalid kbi module: ~s");

    public static final SubLSymbol $kw82$KBI_SELECTED_ = makeKeyword("KBI-SELECTED?");

    static private final SubLSymbol $sym83$KBI_MODULE_SELECTED_ = makeSymbol("KBI-MODULE-SELECTED?");





    static private final SubLString $str_alt86$kbi_redo____s___s_ = makeString("kbi redo : ~s [~s]");



    static private final SubLString $str_alt88$___kbi_errors____a = makeString("~%:kbi-errors : ~a");

    static private final SubLString $str_alt89$____Status_of__a_diagnostics_ = makeString("~%~%Status of ~a diagnostics:");

    static private final SubLString $str_alt90$___a_considered = makeString("~%~a considered");

    static private final SubLString $str_alt91$___s__out_of__s_ = makeString(" (~s% out of ~s)");



    static private final SubLString $str_alt93$____unselected____a = makeString("~%~%unselected : ~a");

    static private final SubLString $str_alt94$________________a = makeString("~%             ~a");

    public static final SubLFloat $float$0_1 = makeDouble(0.1);

    static private final SubLString $str_alt96$___a__ = makeString("~%~a :");

    static private final SubLString $str_alt97$__a = makeString(" ~a");

    static private final SubLString $str_alt98$____a__a_ = makeString("  [~a ~a]");

    static private final SubLString $str_alt99$_ = makeString(".");

    static private final SubLString $str_alt100$___a__repaired_____a = makeString("~%~a (repaired) : ~a");

    private static final SubLSymbol $KBI_REPAIR_CACHE = makeKeyword("KBI-REPAIR-CACHE");

    static private final SubLString $str_alt102$unknown_count_for_kbi_domain___s = makeString("unknown count for kbi domain: ~s");

    static private final SubLString $str_alt103$_don_t_know_exactly__but_I_d_gues = makeString("(don't know exactly, but I'd guess it'd be purt near to a lot)");

    private static final SubLSymbol $DOMAIN_COUNT_FN = makeKeyword("DOMAIN-COUNT-FN");

    static private final SubLString $str_alt105$unbound__domain_count_fn_for_kbi_ = makeString("unbound :domain-count-fn for kbi domain: ~s");

    private static final SubLSymbol KBI_CACHED_TERM_MTS = makeSymbol("KBI-CACHED-TERM-MTS");

    public static final SubLSymbol $kbi_cached_term_mts_caching_state$ = makeSymbol("*KBI-CACHED-TERM-MTS-CACHING-STATE*");

    public static final SubLInteger $int$2048 = makeInteger(2048);



    public static final SubLObject $$not = constant_handles.reader_make_constant_shell(makeString("not"));

    public static final SubLObject $$isa = constant_handles.reader_make_constant_shell(makeString("isa"));

    static private final SubLList $list_alt112 = list(constant_handles.reader_make_constant_shell(makeString("Collection")));

    static private final SubLList $list_alt113 = list(makeKeyword("ASSUMED"));

    static private final SubLSymbol $sym114$PUBLIC_ASSERTION_ = makeSymbol("PUBLIC-ASSERTION?");

    private static final SubLSymbol GATHER_ASSERTIONS = makeSymbol("GATHER-ASSERTIONS");



    static private final SubLString $$$mapping_Cyc_assertions = makeString("mapping Cyc assertions");





    private static final SubLSymbol $FI = makeKeyword("FI");



    static private final SubLString $str_alt122$_______a = makeString("~%;;; ~a");

    static private final SubLString $str_alt123$_______a_diagnostics = makeString("~%;;; ~a diagnostics");

    static private final SubLString $str_alt124$______time_started___a = makeString("~%;;; time started: ~a");

    static private final SubLString $str_alt125$___a___a = makeString("~%~a: ~a");

    static private final SubLString $str_alt126$___see__a = makeString("   see ~a");





    private static final SubLSymbol $KBI_DOC = makeKeyword("KBI-DOC");

    static private final SubLString $str_alt130$______kbi_module___a = makeString("~%;;; kbi module: ~a");

    static private final SubLString $str_alt131$___________________a = makeString("~%;;;             ~a");

    static private final SubLString $str_alt132$______item_count___s = makeString("~%;;; item count: ~s");

    public static final SubLSymbol $kw133$ARG_TYPE_W_O_DEFN = makeKeyword("ARG-TYPE-W/O-DEFN");

    static private final SubLString $str_alt134$________retrieve_relations_releva = makeString("~%~%;;; retrieve relations relevant to an arg-type with arg-isa-of");

    static private final SubLString $str_alt135$______retrieve_mal_axioms_wrt_an_ = makeString("~%;;; retrieve mal axioms wrt an arg-type with mal-assertions-wrt-arg-isa");

    static private final SubLString $str_alt136$____ = makeString("~%~%");

    static private final SubLString $str_alt137$____explained_example_____a______ = makeString(";;; explained example~%~%~a~%~%;;; findings~%~%");

    static private final SubLString $str_alt138$___s = makeString("~%~s");



    static private final SubLString $str_alt140$______a____ = makeString(" : ~%~a~%~%");

    static private final SubLString $str_alt141$______time_printed___a = makeString("~%;;; time printed: ~a");

    static private final SubLString $str_alt142$______with_machine___a = makeString("~%;;; with machine: ~a");

    static private final SubLString $$$unknown = makeString("unknown");

    static private final SubLString $str_alt144$________________KB___s__s = makeString("~%;;;           KB: ~s.~s");

    static private final SubLString $str_alt145$____________system___a = makeString("~%;;;       system: ~a");

    static private final SubLString $str_alt146$______item_count___s__ = makeString("~%;;; item count: ~s~%");

    static private final SubLString $str_alt147$______retrieve__a_from_id_with__a = makeString("~%;;; retrieve ~a from id with ~a");

    static private final SubLString $str_alt148$_a = makeString("~a");

    static private final SubLString $str_alt149$kbi__mapping__a__a_results = makeString("kbi: mapping ~a ~a results");

    static private final SubLString $str_alt150$__ = makeString("~%");

    static private final SubLString $str_alt151$___s___s = makeString("~%~s~%~s");

    static private final SubLString $str_alt152$_____s = makeString("~%~%~s");

    static private final SubLString $str_alt153$unknown_type_of_kbi_result__s = makeString("unknown type of kbi result ~s");

    static private final SubLString $str_alt154$____a____ = makeString(" : ~a~%~%");

    static private final SubLString $$$data = makeString("data");

    static private final SubLString $$$kbi = makeString("kbi");

    static private final SubLString $str_alt157$_a_summary = makeString("~a-summary");

    static private final SubLString $$$text = makeString("text");

    static private final SubLString $str_alt159$________Mode__LISP__Package__CYC_ = makeString(";;; -*- Mode: LISP; Package: CYC; Syntax: ANSI-Common-Lisp -*-");

    static private final SubLString $str_alt160$______Copyright__c__2000___2006_C = makeString("~%;;; Copyright (c) 2000 - 2006 Cycorp, Inc.  All rights reserved.");

    static private final SubLSymbol $sym161$TERM__ = makeSymbol("TERM-<");





    static private final SubLSymbol $sym164$_ = makeSymbol("<");





    private static final SubLSymbol DEDUCTION_ID = makeSymbol("DEDUCTION-ID");

    private static final SubLSymbol CLAUSE_STRUC_P = makeSymbol("CLAUSE-STRUC-P");

    private static final SubLSymbol CLAUSE_STRUC_ID = makeSymbol("CLAUSE-STRUC-ID");







    private static final SubLSymbol FIND_DEDUCTION_BY_ID = makeSymbol("FIND-DEDUCTION-BY-ID");



    private static final SubLSymbol $AXIOM = makeKeyword("AXIOM");

    private static final SubLSymbol FIND_CLAUSE_STRUC_BY_ID = makeSymbol("FIND-CLAUSE-STRUC-BY-ID");

    static private final SubLString $str_alt177$unknown_type_of_structure___s = makeString("unknown type of structure: ~s");

    static private final SubLSymbol $sym178$STRING_ = makeSymbol("STRING<");



    static private final SubLString $str_alt180$pre_sort_cardinality__s__post_sor = makeString("pre-sort cardinality=~s; post-sort cardinality=~s");

    static private final SubLList $list_alt181 = list(makeKeyword("VALUE-TYPE"), makeSymbol("FUNCTION-SPEC-P"), makeKeyword("NECESSITY"), makeKeyword("REQUIRED"), makeKeyword("PRINT-NAME"), makeString("membership fn"), makeKeyword("DOC"), makeString("the boolean function that determines whether or not an object is a member of this kbi domain"));

    static private final SubLList $list_alt182 = list(makeKeyword("VALUE-TYPE"), makeSymbol("FUNCTION-SPEC-P"), makeKeyword("NECESSITY"), makeKeyword("OPTIONAL"), makeKeyword("PRINT-NAME"), makeString("count fn"), makeKeyword("DOC"), makeString("the function taht computes the cardinality of this kbi domain"));

    static private final SubLList $list_alt183 = list(new SubLObject[]{ makeKeyword("VALUE-TYPE"), makeSymbol("LISTP"), makeKeyword("NECESSITY"), makeKeyword("OPTIONAL"), makeKeyword("INVERSE"), makeKeyword("SUB-DOMAINS"), makeKeyword("PRINT-NAME"), makeString("super domains"), makeKeyword("DOC"), makeString("the kbi domains that include this domain") });

    static private final SubLList $list_alt184 = list(new SubLObject[]{ makeKeyword("VALUE-TYPE"), makeSymbol("LISTP"), makeKeyword("NECESSITY"), makeKeyword("OPTIONAL"), makeKeyword("INVERSE"), makeKeyword("SUPER-DOMAINS"), makeKeyword("PRINT-NAME"), makeString("sub domains"), makeKeyword("DOC"), makeString("the kbi domains that are included by this domain") });

    static private final SubLList $list_alt185 = list(makeKeyword("VALUE-TYPE"), makeSymbol("LISTP"), makeKeyword("NECESSITY"), makeKeyword("OPTIONAL"), makeKeyword("PRINT-NAME"), makeString("dependent domains"), makeKeyword("DOC"), makeString("the kbi domains that are dependent on (e.g., may be accessed by) this domain"));

    private static final SubLSymbol $PRINT_NAME = makeKeyword("PRINT-NAME");

    static private final SubLList $list_alt187 = list(makeKeyword("VALUE-TYPE"), makeSymbol("STRINGP"), makeKeyword("NECESSITY"), makeKeyword("OPTIONAL"), makeKeyword("PRINT-NAME"), makeString("print name"), makeKeyword("DOC"), makeString("the print string for this kbi domain"));

    static private final SubLList $list_alt188 = list(makeKeyword("DOMAIN-DEFN"), makeSymbol("FORT-P"), makeKeyword("DOMAIN-COUNT-FN"), makeSymbol("FORT-COUNT"), makeKeyword("DEPENDENTS"), list(makeKeyword("ASSERTION")), makeKeyword("PRINT-NAME"), makeString("cyc reified term"));

    static private final SubLList $list_alt189 = list(makeKeyword("DOMAIN-DEFN"), makeSymbol("CONSTANT-P"), makeKeyword("DOMAIN-COUNT-FN"), makeSymbol("CONSTANT-COUNT"), makeKeyword("SUPER-DOMAINS"), list($FORT), makeKeyword("PRINT-NAME"), makeString("cyc constant"));

    static private final SubLList $list_alt190 = list(makeKeyword("DOMAIN-DEFN"), makeSymbol("ASSERTION-P"), makeKeyword("DOMAIN-COUNT-FN"), makeSymbol("ASSERTION-COUNT"), makeKeyword("DEPENDENTS"), list(makeKeyword("AXIOM"), makeKeyword("SOURCE")), makeKeyword("PRINT-NAME"), makeString("kb assertion"));

    static private final SubLList $list_alt191 = list(makeKeyword("DOMAIN-DEFN"), makeSymbol("CLAUSE-STRUC-P"), makeKeyword("DOMAIN-COUNT-FN"), makeSymbol("CLAUSE-STRUC-COUNT"), makeKeyword("DEPENDENTS"), list(makeKeyword("CNF")), makeKeyword("PRINT-NAME"), makeString("kb clause-struc"));

    static private final SubLList $list_alt192 = list(makeKeyword("DOMAIN-DEFN"), makeSymbol("DEDUCTION-P"), makeKeyword("DOMAIN-COUNT-FN"), makeSymbol("DEDUCTION-COUNT"), makeKeyword("PRINT-NAME"), makeString("kb source"));



    static private final SubLList $list_alt194 = list(makeKeyword("DOMAIN-DEFN"), makeSymbol("NART-P"), makeKeyword("SUPER-DOMAINS"), list($FORT), makeKeyword("PRINT-NAME"), makeString("nat"));

    private static final SubLSymbol $NL_WORD = makeKeyword("NL-WORD");

    static private final SubLList $list_alt196 = list(makeKeyword("DOMAIN-DEFN"), makeSymbol("NL-WORD?"), makeKeyword("SUPER-DOMAINS"), list($FORT), makeKeyword("PRINT-NAME"), makeString("nl word"));

    private static final SubLSymbol $SBHL_FORT = makeKeyword("SBHL-FORT");

    static private final SubLList $list_alt198 = list(makeKeyword("DOMAIN-DEFN"), makeSymbol("SBHL-FORT?"), makeKeyword("SUPER-DOMAINS"), list($FORT), makeKeyword("PRINT-NAME"), makeString("sbhl fort"));



    static private final SubLList $list_alt200 = list(makeKeyword("DOMAIN-DEFN"), makeSymbol("COLLECTION?"), makeKeyword("SUPER-DOMAINS"), list(makeKeyword("SBHL-FORT")), makeKeyword("PRINT-NAME"), makeString("kb collection"));



    static private final SubLList $list_alt202 = list(makeKeyword("DOMAIN-DEFN"), makeSymbol("MT?"), makeKeyword("SUPER-DOMAINS"), list(makeKeyword("SBHL-FORT")), makeKeyword("PRINT-NAME"), makeString("microtheory"));

    private static final SubLSymbol $ATTRIBUTE = makeKeyword("ATTRIBUTE");

    static private final SubLList $list_alt204 = list(makeKeyword("DOMAIN-DEFN"), makeSymbol("ATTRIBUTE?"), makeKeyword("SUPER-DOMAINS"), list(makeKeyword("SBHL-FORT")), makeKeyword("PRINT-NAME"), makeString("kb attribute"));



    static private final SubLList $list_alt206 = list(makeKeyword("DOMAIN-DEFN"), makeSymbol("KB-RELATION?"), makeKeyword("SUPER-DOMAINS"), list($FORT), makeKeyword("PRINT-NAME"), makeString("kb relation"));



    static private final SubLList $list_alt208 = list(makeKeyword("DOMAIN-DEFN"), makeSymbol("PREDICATE?"), makeKeyword("SUPER-DOMAINS"), list(makeKeyword("SBHL-FORT"), makeKeyword("RELATION")), makeKeyword("PRINT-NAME"), makeString("kb predicate"));



    static private final SubLList $list_alt210 = list(makeKeyword("DOMAIN-DEFN"), makeSymbol("NON-PREDICATE-FUNCTION?"), makeKeyword("SUPER-DOMAINS"), list(makeKeyword("RELATION")), makeKeyword("PRINT-NAME"), makeString("kb function"));

    private static final SubLSymbol $SKOLEM = makeKeyword("SKOLEM");

    static private final SubLList $list_alt212 = list(makeKeyword("DOMAIN-DEFN"), makeSymbol("REIFIED-SKOLEM-FN-IN-ANY-MT?"), makeKeyword("SUPER-DOMAINS"), list(makeKeyword("FUNCTION")), makeKeyword("PRINT-NAME"), makeString("skolem fn"));



    static private final SubLList $list_alt214 = list(makeKeyword("DOMAIN-DEFN"), makeSymbol("CLAUSE-P"), makeKeyword("PRINT-NAME"), makeString("clause"));



    static private final SubLList $list_alt216 = list(makeKeyword("DOMAIN-DEFN"), makeSymbol("CNF-P"), makeKeyword("DEPENDENTS"), list(makeKeyword("GAF"), makeKeyword("LITERAL")), makeKeyword("PRINT-NAME"), makeString("cnf clause"));



    static private final SubLList $list_alt218 = list(makeKeyword("DOMAIN-DEFN"), makeSymbol("DNF-P"), makeKeyword("SUPER-DOMAINS"), list(makeKeyword("FUNCTION")), makeKeyword("PRINT-NAME"), makeString("dnf clause"));



    static private final SubLList $list_alt220 = list(makeKeyword("DOMAIN-DEFN"), makeSymbol("GAF?"), makeKeyword("SUPER-DOMAINS"), list(makeKeyword("LITERAL")), makeKeyword("PRINT-NAME"), makeString("gaf"));



    static private final SubLList $list_alt222 = list(makeKeyword("DOMAIN-DEFN"), makeSymbol("ATOMIC-SENTENCE?"), makeKeyword("SUPER-DOMAINS"), list(makeKeyword("FORMULA")), makeKeyword("PRINT-NAME"), makeString("literal"));



    static private final SubLList $list_alt224 = list(makeKeyword("DOMAIN-DEFN"), makeSymbol("RELATION-EXPRESSION?"), makeKeyword("PRINT-NAME"), makeString("formula"));

    static private final SubLList $list_alt225 = list(makeKeyword("VALUE-TYPE"), makeSymbol("KBI-DOMAIN?"), makeKeyword("NECESSITY"), makeKeyword("REQUIRED"), makeKeyword("PRINT-NAME"), makeString("domain"), makeKeyword("DOC"), makeString("the type of object (e.g., :fort) to which this kbi module applies"));

    static private final SubLList $list_alt226 = list(new SubLObject[]{ makeKeyword("CANDIDATE-VALUES"), list(ONE_INTEGER, TWO_INTEGER, THREE_INTEGER, FOUR_INTEGER, FIVE_INTEGER), makeKeyword("NECESSITY"), makeKeyword("REQUIRED"), makeKeyword("DEFAULT"), TWO_INTEGER, makeKeyword("PRINT-NAME"), makeString("level"), makeKeyword("DOC"), makeString("testing level [1 .. 5] of this kbi module (higher level implies more thorough test)") });

    static private final SubLList $list_alt227 = list(new SubLObject[]{ makeKeyword("VALUE-TYPE"), makeSymbol("FUNCTION-SPEC-P"), makeKeyword("NECESSITY"), makeKeyword("REQUIRED"), makeKeyword("DEFAULT"), makeSymbol("TRUE"), makeKeyword("PRINT-NAME"), makeString("apply if"), makeKeyword("DOC"), makeString("the function that determines if a domain object is appropriate for this kbi module") });



    static private final SubLList $list_alt229 = list(new SubLObject[]{ makeKeyword("VALUE-TYPE"), makeSymbol("LISTP"), makeKeyword("NECESSITY"), makeKeyword("OPTIONAL"), makeKeyword("INVERSE"), makeKeyword("SUPPLANTED-BY"), makeKeyword("PRINT-NAME"), makeString("supplants"), makeKeyword("DOC"), makeString("kbi modules supplanted by this module"), makeKeyword("VERBOSE"), makeString("When any supplanting module holds for an object, supplanted modules are not attempted.") });

    static private final SubLList $list_alt230 = list(new SubLObject[]{ makeKeyword("VALUE-TYPE"), makeSymbol("LISTP"), makeKeyword("NECESSITY"), makeKeyword("OPTIONAL"), makeKeyword("INVERSE"), makeKeyword("KBI-SUPPLANTS"), makeKeyword("PRINT-NAME"), makeString("supplanted by"), makeKeyword("DOC"), makeString("kbi modules that supplant this module"), makeKeyword("VERBOSE"), makeString("When any supplanting module holds for an object, supplanted modules are not attempted.") });

    static private final SubLList $list_alt231 = list(new SubLObject[]{ makeKeyword("VALUE-TYPE"), makeSymbol("SYMBOLP"), makeKeyword("NECESSITY"), makeKeyword("REQUIRED"), makeKeyword("DEFAULT"), makeSymbol("TRUE"), makeKeyword("PRINT-NAME"), makeString("apply only if"), makeKeyword("DOC"), makeString("the function that determines if a domain object is appropriate for this kbi module") });

    static private final SubLList $list_alt232 = list(makeKeyword("VALUE-TYPE"), makeSymbol("SYMBOLP"), makeKeyword("NECESSITY"), makeKeyword("REQUIRED"), makeKeyword("PRINT-NAME"), makeString("evaluation fn"), makeKeyword("DOC"), makeString("the function that implements the integrity check of this kbi module"));

    static private final SubLList $list_alt233 = list(makeKeyword("VALUE-TYPE"), makeSymbol("FUNCTION-SPEC-P"), makeKeyword("NECESSITY"), makeKeyword("REQUIRED"), makeKeyword("PRINT-NAME"), makeString("predicate fn"), makeKeyword("DOC"), makeString("the boolean function that applies this kbi module"));

    private static final SubLSymbol $KBI_RESULT_FN = makeKeyword("KBI-RESULT-FN");

    static private final SubLList $list_alt235 = list(makeKeyword("VALUE-TYPE"), makeSymbol("FUNCTION-SPEC-P"), makeKeyword("NECESSITY"), makeKeyword("OPTIONAL"), makeKeyword("PRINT-NAME"), makeString("result fn"), makeKeyword("DOC"), makeString("the function that returns results from the integrity check of this kbi module"));

    static private final SubLList $list_alt236 = list(makeKeyword("VALUE-TYPE"), makeSymbol("FUNCTION-SPEC-P"), makeKeyword("NECESSITY"), makeKeyword("REQUIRED"), makeKeyword("PRINT-NAME"), makeString("justify fn"), makeKeyword("DOC"), makeString("the function that justifies a finding of this kbi module"));

    private static final SubLSymbol $KBI_NL_JUST_FN = makeKeyword("KBI-NL-JUST-FN");

    static private final SubLList $list_alt238 = list(makeKeyword("VALUE-TYPE"), makeSymbol("SYMBOLP"), makeKeyword("NECESSITY"), makeKeyword("REQUIRED"), makeKeyword("PRINT-NAME"), makeString("nl justify fn"), makeKeyword("DOC"), makeString("the function that justifies in NL a finding of this kbi module"));

    static private final SubLList $list_alt239 = list(makeKeyword("VALUE-TYPE"), makeSymbol("SYMBOLP"), makeKeyword("NECESSITY"), makeKeyword("OPTIONAL"), makeKeyword("PRINT-NAME"), makeString("nl verbose fn"), makeKeyword("DOC"), makeString("the function that explains in more detail a finding of this kbi module"));

    static private final SubLList $list_alt240 = list(makeKeyword("VALUE-TYPE"), makeSymbol("SYMBOLP"), makeKeyword("NECESSITY"), makeKeyword("OPTIONAL"), makeKeyword("PRINT-NAME"), makeString("repair fn"), makeKeyword("DOC"), makeString("the function that repairs a finding of this kbi module"));

    static private final SubLList $list_alt241 = list(new SubLObject[]{ makeKeyword("VALUE-TYPE"), makeSymbol("SYMBOLP"), makeKeyword("NECESSITY"), makeKeyword("OPTIONAL"), makeKeyword("DEFAULT"), IDENTITY, makeKeyword("PRINT-NAME"), makeString("cache key"), makeKeyword("DOC"), makeString("the function that applies to a finding of this kbi module to determine what is cached") });

    static private final SubLList $list_alt242 = list(new SubLObject[]{ makeKeyword("VALUE-TYPE"), makeSymbol("BOOLEAN?"), makeKeyword("NECESSITY"), makeKeyword("REQUIRED"), makeKeyword("DEFAULT"), T, makeKeyword("PRINT-NAME"), makeString("selected status"), makeKeyword("DOC"), makeString("the boolean property that determines if this kbi module is applied") });

    static private final SubLList $list_alt243 = list(new SubLObject[]{ makeKeyword("VALUE-TYPE"), makeSymbol("BOUNDP"), makeKeyword("NECESSITY"), makeKeyword("REQUIRED"), makeKeyword("DEFAULT"), ZERO_INTEGER, makeKeyword("PRINT-NAME"), makeString("run count"), makeKeyword("DOC"), makeString("the cache where the number of applications of this kbi module are recorded") });

    static private final SubLList $list_alt244 = list(new SubLObject[]{ makeKeyword("VALUE-TYPE"), makeSymbol("BOUNDP"), makeKeyword("NECESSITY"), makeKeyword("REQUIRED"), makeKeyword("DEFAULT"), ZERO_INTEGER, makeKeyword("PRINT-NAME"), makeString("run time"), makeKeyword("DOC"), makeString("the cache where the total run time of this kbi module are recorded") });

    public static final SubLSymbol $kw245$KBI_CACHE_RESULTS_ = makeKeyword("KBI-CACHE-RESULTS?");

    static private final SubLList $list_alt246 = list(new SubLObject[]{ makeKeyword("VALUE-TYPE"), makeSymbol("BOOLEAN?"), makeKeyword("NECESSITY"), makeKeyword("REQUIRED"), makeKeyword("DEFAULT"), T, makeKeyword("PRINT-NAME"), makeString("cache results?"), makeKeyword("DOC"), makeString("should the violators of this kbi module be saved?") });

    static private final SubLList $list_alt247 = list(makeKeyword("VALUE-TYPE"), makeSymbol("BOUNDP"), makeKeyword("NECESSITY"), makeKeyword("OPTIONAL"), makeKeyword("PRINT-NAME"), makeString("result cache"), makeKeyword("DOC"), makeString("the cache where results of this kbi module are saved"));

    public static final SubLSymbol $kw248$KBI_CACHE_REPAIRS_ = makeKeyword("KBI-CACHE-REPAIRS?");

    static private final SubLList $list_alt249 = list(new SubLObject[]{ makeKeyword("VALUE-TYPE"), makeSymbol("BOUNDP"), makeKeyword("NECESSITY"), makeKeyword("OPTIONAL"), makeKeyword("DEFAULT"), T, makeKeyword("PRINT-NAME"), makeString("repair variable"), makeKeyword("DOC"), makeString("should the violators of this kbi module be repaired?") });

    static private final SubLList $list_alt250 = list(makeKeyword("VALUE-TYPE"), makeSymbol("BOUNDP"), makeKeyword("NECESSITY"), makeKeyword("OPTIONAL"), makeKeyword("PRINT-NAME"), makeString("repair cache"), makeKeyword("DOC"), makeString("the cache where repaired results of this kbi module are saved"));

    static private final SubLList $list_alt251 = list(new SubLObject[]{ makeKeyword("CANDIDATE-VALUES"), list(makeKeyword("KB"), makeKeyword("NL"), $CODE, makeKeyword("TMS")), makeKeyword("NECESSITY"), makeKeyword("REQUIRED"), makeKeyword("DEFAULT"), makeKeyword("KB"), makeKeyword("PRINT-NAME"), makeString("concern for"), makeKeyword("DOC"), makeString("cyc aspect [kb vs. code] relevant to findings of this kbi module") });

    private static final SubLSymbol $KBI_CONCERN_LEVEL = makeKeyword("KBI-CONCERN-LEVEL");

    static private final SubLList $list_alt253 = list(new SubLObject[]{ makeKeyword("CANDIDATE-VALUES"), list(makeKeyword("EL"), makeKeyword("TL"), makeKeyword("HL"), makeKeyword("NL"), $SBHL, makeKeyword("FI")), makeKeyword("NECESSITY"), makeKeyword("OPTIONAL"), makeKeyword("DEFAULT"), makeKeyword("KB"), makeKeyword("PRINT-NAME"), makeString("concern level"), makeKeyword("DOC"), makeString("cyc level [el vs. hl] relevant to findings of this kbi module") });

    static private final SubLList $list_alt254 = list(makeKeyword("CANDIDATE-VALUES"), list(new SubLObject[]{ makeKeyword("BUG"), makeKeyword("GAP"), makeKeyword("CONFLICT"), makeKeyword("REDUNDANCY"), makeKeyword("STYLE"), makeKeyword("STALE-DATA"), makeKeyword("INCOHERENT"), makeKeyword("INEFFICIENT"), makeKeyword("IMPRECISE"), makeKeyword("BOGUS"), makeKeyword("OTHER") }), makeKeyword("NECESSITY"), makeKeyword("OPTIONAL"), makeKeyword("PRINT-NAME"), makeString("result type"), makeKeyword("DOC"), makeString("how to regard results of this kbi module"));

    private static final SubLSymbol $KBI_RESULT_TYPE = makeKeyword("KBI-RESULT-TYPE");

    static private final SubLList $list_alt256 = list(makeKeyword("CANDIDATE-VALUES"), list(makeKeyword("ERROR"), $WARN, $NOTE, makeKeyword("ADMONISH")), makeKeyword("NECESSITY"), makeKeyword("OPTIONAL"), makeKeyword("PRINT-NAME"), makeString("result concern-type"), makeKeyword("DOC"), makeString("concern-type of results of this kbi module"));

    private static final SubLSymbol $KBI_PRIORITY = makeKeyword("KBI-PRIORITY");

    static private final SubLList $list_alt258 = list(new SubLObject[]{ makeKeyword("CANDIDATE-VALUES"), list(makeKeyword("VERY-LOW"), makeKeyword("LOW"), makeKeyword("MEDIUM"), $HIGH, makeKeyword("VERY-HIGH")), makeKeyword("NECESSITY"), makeKeyword("OPTIONAL"), makeKeyword("DEFAULT"), makeKeyword("MEDIUM"), makeKeyword("PRINT-NAME"), makeString("priority"), makeKeyword("DOC"), makeString("priority of finding results of this kbi module") });

    private static final SubLSymbol $KBI_URGENCY = makeKeyword("KBI-URGENCY");

    static private final SubLList $list_alt260 = list(new SubLObject[]{ makeKeyword("CANDIDATE-VALUES"), list(makeKeyword("VERY-LOW"), makeKeyword("LOW"), makeKeyword("MEDIUM"), $HIGH, makeKeyword("VERY-HIGH")), makeKeyword("NECESSITY"), makeKeyword("OPTIONAL"), makeKeyword("DEFAULT"), makeKeyword("MEDIUM"), makeKeyword("PRINT-NAME"), makeString("urgency"), makeKeyword("DOC"), makeString("urgency of responding to results of this kbi module") });

    static private final SubLList $list_alt261 = list(makeKeyword("VALUE-TYPE"), makeSymbol("STRINGP"), makeKeyword("NECESSITY"), makeKeyword("REQUIRED"), makeKeyword("PRINT-NAME"), makeString("doc"), makeKeyword("DOC"), makeString("documentation for this kbi module"));

    private static final SubLSymbol $KBI_COMMENT = makeKeyword("KBI-COMMENT");

    static private final SubLList $list_alt263 = list(makeKeyword("VALUE-TYPE"), makeSymbol("STRINGP"), makeKeyword("NECESSITY"), makeKeyword("OPTIONAL"), makeKeyword("PRINT-NAME"), makeString("comment"), makeKeyword("DOC"), makeString("additional documentation re this kbi module"));

    private static final SubLSymbol $KBI_AUTHOR = makeKeyword("KBI-AUTHOR");

    static private final SubLList $list_alt265 = list(makeKeyword("VALUE-TYPE"), makeSymbol("STRINGP"), makeKeyword("NECESSITY"), makeKeyword("OPTIONAL"), makeKeyword("PRINT-NAME"), makeString("author"), makeKeyword("DOC"), makeString("author of this kbi module"));

    private static final SubLSymbol $KBI_DATE = makeKeyword("KBI-DATE");

    static private final SubLList $list_alt267 = list(makeKeyword("VALUE-TYPE"), makeSymbol("STRINGP"), makeKeyword("NECESSITY"), makeKeyword("OPTIONAL"), makeKeyword("PRINT-NAME"), makeString("active since"), makeKeyword("DOC"), makeString("activation date of this kbi module"));

    private static final SubLSymbol $KBI_STATUS = makeKeyword("KBI-STATUS");

    static private final SubLList $list_alt269 = list(new SubLObject[]{ makeKeyword("CANDIDATE-VALUES"), list(makeKeyword("ALPHA"), makeKeyword("RELEASED")), makeKeyword("NECESSITY"), makeKeyword("REQUIRED"), makeKeyword("DEFAULT"), makeKeyword("ALPHA"), makeKeyword("PRINT-NAME"), makeString("status"), makeKeyword("DOC"), makeString("release status of this kbi module") });

    private static final SubLSymbol $KBI_EL_FORMULA = makeKeyword("KBI-EL-FORMULA");

    static private final SubLList $list_alt271 = list(makeKeyword("VALUE-TYPE"), makeSymbol("LISTP"), makeKeyword("NECESSITY"), makeKeyword("OPTIONAL"), makeKeyword("PRINT-NAME"), makeString("el formula"), makeKeyword("DOC"), makeString("the constraint implemented by this kbi module"));

    private static final SubLSymbol $KBI_EXAMPLE_OBJECT = makeKeyword("KBI-EXAMPLE-OBJECT");

    static private final SubLList $list_alt273 = list(makeKeyword("VALUE-TYPE"), IDENTITY, makeKeyword("NECESSITY"), makeKeyword("OPTIONAL"), makeKeyword("PRINT-NAME"), makeString("example"), makeKeyword("DOC"), makeString("an example test-case for this kbi module"));

    private static final SubLSymbol $KBI_EXAMPLE_RESULT = makeKeyword("KBI-EXAMPLE-RESULT");

    static private final SubLList $list_alt275 = list(makeKeyword("VALUE-TYPE"), IDENTITY, makeKeyword("NECESSITY"), makeKeyword("OPTIONAL"), makeKeyword("PRINT-NAME"), makeString("example result"), makeKeyword("DOC"), makeString("an example result of this kbi module"));

    private static final SubLSymbol $KBI_EXAMPLE_REPAIR = makeKeyword("KBI-EXAMPLE-REPAIR");

    static private final SubLList $list_alt277 = list(makeKeyword("VALUE-TYPE"), IDENTITY, makeKeyword("NECESSITY"), makeKeyword("OPTIONAL"), makeKeyword("PRINT-NAME"), makeString("example repair"), makeKeyword("DOC"), makeString("an example repair of this kbi module"));

    private static final SubLSymbol $KBI_PRINT_NAME = makeKeyword("KBI-PRINT-NAME");

    static private final SubLList $list_alt279 = list(makeKeyword("VALUE-TYPE"), makeSymbol("STRINGP"), makeKeyword("NECESSITY"), makeKeyword("OPTIONAL"), makeKeyword("PRINT-NAME"), makeString("print name"), makeKeyword("DOC"), makeString("the print string for this kbi module"));

    // // Initializers
    public void declareFunctions() {
        declare_kbi_utilities_file();
    }

    public void initializeVariables() {
        init_kbi_utilities_file();
    }

    public void runTopLevelForms() {
        setup_kbi_utilities_file();
    }
}

