/**
 * Copyright (c) 1995 - 2019 Cycorp, Inc.  All rights reserved.
 */
package com.cyc.cycjava.cycl.sksi.corba;


import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow.append;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow.list;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Functions.apply;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Numbers.add;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Packages.intern;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Sequences.cconcatenate;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Sequences.length;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Symbols.boundp;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Symbols.make_keyword;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Symbols.symbol_function;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.makeBoolean;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.makeKeyword;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.makeString;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.makeSymbol;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.conses_high.getf;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.conses_high.putf;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.conses_high.remf;
import static com.cyc.tool.subl.util.SubLFiles.declareFunction;
import static com.cyc.tool.subl.util.SubLFiles.deflexical;

import com.cyc.cycjava.cycl.V10;
import com.cyc.cycjava.cycl.constant_handles;
import com.cyc.cycjava.cycl.constants_high;
import com.cyc.cycjava.cycl.dictionary;
import com.cyc.cycjava.cycl.genls;
import com.cyc.cycjava.cycl.hl_storage_modules;
import com.cyc.cycjava.cycl.kb_accessors;
import com.cyc.cycjava.cycl.list_utilities;
import com.cyc.cycjava.cycl.mt_relevance_macros;
import com.cyc.cycjava.cycl.string_utilities;
import com.cyc.cycjava.cycl.subl_macro_promotions;
import com.cyc.cycjava.cycl.transform_list_utilities;
import com.cyc.cycjava.cycl.inference.harness.inference_modules;
import com.cyc.cycjava.cycl.sksi.sksi_infrastructure.sksi_kb_accessors;
import com.cyc.cycjava.cycl.sksi.sksi_infrastructure.sksi_sks_accessors;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Strings;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.SubLThread;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObject;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLProcess;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLString;
import com.cyc.tool.subl.jrtl.nativeCode.type.symbol.SubLSymbol;
import com.cyc.tool.subl.util.SubLFile;
import com.cyc.tool.subl.util.SubLTrampolineFile;
import com.cyc.tool.subl.util.SubLTranslatedFile;


/**
 * Copyright (c) 1995 - 2019 Cycorp, Inc.  All rights reserved.
 *  module:      CORBA-MODULE-UTILITIES
 *  source file: /cyc/top/cycl/sksi/corba/corba-module-utilities.lisp
 *  created:     2019/07/03 17:38:36
 */
public final class corba_module_utilities extends SubLTranslatedFile implements V10 {
    // // Constructor
    private corba_module_utilities() {
    }

    public static final SubLFile me = new corba_module_utilities();


    // // Definitions
    // deflexical
    public static final SubLSymbol $corba_connections_by_sks$ = makeSymbol("*CORBA-CONNECTIONS-BY-SKS*");

    public static final SubLObject add_corba_connection_by_sks(SubLObject corba_connection, SubLObject sks) {
        SubLTrampolineFile.checkType(corba_connection, CORBA_CONNECTION_P);
        SubLTrampolineFile.checkType(sks, SKS_P);
        $corba_connections_by_sks$.setGlobalValue(putf($corba_connections_by_sks$.getGlobalValue(), sks, corba_connection));
        return NIL;
    }

    public static final SubLObject rem_corba_connection_by_sks(SubLObject sks) {
        SubLTrampolineFile.checkType(sks, SKS_P);
        $corba_connections_by_sks$.setGlobalValue(remf($corba_connections_by_sks$.getGlobalValue(), sks));
        return NIL;
    }

    public static final SubLObject get_corba_connection_by_sks(SubLObject sks) {
        SubLTrampolineFile.checkType(sks, SKS_P);
        return getf($corba_connections_by_sks$.getGlobalValue(), sks, UNPROVIDED);
    }

    public static final SubLObject new_corba_connection_by_sks(SubLObject sks) {
        SubLTrampolineFile.checkType(sks, SKS_P);
        {
            SubLObject proxy_host = sksi_sks_accessors.sks_fget(sks, $$sksProxyHost, UNPROVIDED);
            SubLObject proxy_port = sksi_sks_accessors.sks_fget(sks, $$sksProxyPort, UNPROVIDED);
            SubLObject initial_orb_host = sksi_sks_accessors.sks_fget(sks, $$corbaSKSInitialORBHost, UNPROVIDED);
            SubLObject initial_orb_port = sksi_sks_accessors.sks_fget(sks, $$corbaSKSInitialORBPort, UNPROVIDED);
            SubLObject service_name = sksi_sks_accessors.sks_fget(sks, $$corbaSKSServiceName, UNPROVIDED);
            SubLObject initial_object_class = sksi_sks_accessors.sks_fget(sks, $$corbaSKSInitialObjectClass, UNPROVIDED);
            SubLObject initial_object_class_helper = (NIL != initial_object_class) ? ((SubLObject) (cconcatenate(initial_object_class, $$$Helper))) : NIL;
            SubLObject connection = corba_utilities.new_corba_connection(list(new SubLObject[]{ $PROXY_HOST, proxy_host, $PROXY_PORT, proxy_port, $INITIAL_ORB_HOST, initial_orb_host, $INITIAL_ORB_PORT, initial_orb_port, $SERVICE_NAME, service_name, $INITIAL_OBJECT_CLASS, initial_object_class, $INITIAL_OBJECT_CLASS_HELPER, initial_object_class_helper }));
            add_corba_connection_by_sks(connection, sks);
            return connection;
        }
    }

    public static final SubLObject find_or_create_corba_connection_by_sks(SubLObject sks) {
        SubLTrampolineFile.checkType(sks, SKS_P);
        {
            SubLObject connection = get_corba_connection_by_sks(sks);
            if (NIL == connection) {
                connection = new_corba_connection_by_sks(sks);
            }
            if (NIL != corba_utilities.corba_connection_invalidP(connection)) {
                rem_corba_connection_by_sks(sks);
                connection = new_corba_connection_by_sks(sks);
            }
            return connection;
        }
    }

    public static final SubLObject make_corba_module_name_keyword(SubLObject sks, SubLObject pred, SubLObject type) {
        if (type == UNPROVIDED) {
            type = $$$removal;
        }
        SubLTrampolineFile.checkType(sks, SKS_P);
        SubLTrampolineFile.checkType(pred, CORBA_PREDICATE_P);
        {
            SubLObject sks_strings = string_utilities.relevant_substrings(constants_high.constant_name(sks));
            SubLObject pred_strings = string_utilities.relevant_substrings(constants_high.constant_name(pred));
            return corba_make_keyword(list_utilities.insert_between_each(append(list($$$corba), sks_strings, pred_strings, list(type)), $str_alt19$_));
        }
    }

    public static final SubLObject make_corba_gateway_keyword(SubLObject pred) {
        {
            SubLObject pred_strings = string_utilities.relevant_substrings(constants_high.constant_name(pred));
            if (NIL != Strings.stringE(pred_strings.first(), $$$corba, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED)) {
                pred_strings = pred_strings.rest();
            }
            return corba_make_keyword(list_utilities.insert_between_each(pred_strings, $str_alt19$_));
        }
    }

    public static final SubLObject corba_make_string(SubLObject args) {
        args = transform_list_utilities.transform(args, symbol_function(KEYWORDP), symbol_function(STRING_FROM_KEYWORD), UNPROVIDED);
        return Strings.string_upcase(apply(symbol_function(CCONCATENATE), args), UNPROVIDED, UNPROVIDED);
    }

    public static final SubLObject corba_make_keyword(SubLObject args) {
        return make_keyword(corba_make_string(args));
    }

    public static final SubLObject corba_make_symbol(SubLObject args) {
        return intern(corba_make_string(args), UNPROVIDED);
    }



    public static final SubLObject note_sksi_corba_module(SubLObject hl_module, SubLObject content_mt) {
        return dictionary.dictionary_enter($sksi_corba_modules$.getGlobalValue(), hl_module, content_mt);
    }

    public static final SubLObject un_note_sksi_corba_module(SubLObject hl_module) {
        return dictionary.dictionary_remove($sksi_corba_modules$.getGlobalValue(), hl_module);
    }

    public static final SubLObject clear_sksi_corba_modules() {
        return dictionary.clear_dictionary($sksi_corba_modules$.getGlobalValue());
    }

    public static final SubLObject look_up_sksi_corba_module(SubLObject hl_module) {
        return dictionary.dictionary_lookup($sksi_corba_modules$.getGlobalValue(), hl_module, UNPROVIDED);
    }

    public static final SubLObject sksi_corba_modules_count() {
        return dictionary.dictionary_length($sksi_corba_modules$.getGlobalValue());
    }

    public static final SubLObject some_sksi_corba_removal_module_registeredP() {
        return makeBoolean(NIL == dictionary.dictionary_empty_p($sksi_corba_modules$.getGlobalValue()));
    }

    public static final SubLObject register_sksi_corba_modules_for_sks(SubLObject sks, SubLObject mapping_mt, SubLObject reclassifyP) {
        if (mapping_mt == UNPROVIDED) {
            mapping_mt = NIL;
        }
        if (reclassifyP == UNPROVIDED) {
            reclassifyP = T;
        }
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            {
                SubLObject count = ZERO_INTEGER;
                if (NIL == mapping_mt) {
                    mapping_mt = sksi_kb_accessors.sk_source_mapping_mt(sks);
                }
                {
                    SubLObject mt_var = mapping_mt;
                    {
                        SubLObject _prev_bind_0 = mt_relevance_macros.$relevant_mt_function$.currentBinding(thread);
                        SubLObject _prev_bind_1 = mt_relevance_macros.$mt$.currentBinding(thread);
                        try {
                            mt_relevance_macros.$relevant_mt_function$.bind(mt_relevance_macros.possibly_in_mt_determine_function(mt_var), thread);
                            mt_relevance_macros.$mt$.bind(mt_relevance_macros.possibly_in_mt_determine_mt(mt_var), thread);
                            {
                                SubLObject sub_ks_closure = sksi_kb_accessors.sk_source_sub_ks_closure(sks);
                                SubLObject cdolist_list_var = sub_ks_closure;
                                SubLObject ks = NIL;
                                for (ks = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , ks = cdolist_list_var.first()) {
                                    count = add(count, register_sksi_corba_modules_for_just_sks(ks, NIL));
                                }
                            }
                        } finally {
                            mt_relevance_macros.$mt$.rebind(_prev_bind_1, thread);
                            mt_relevance_macros.$relevant_mt_function$.rebind(_prev_bind_0, thread);
                        }
                    }
                }
                if (NIL != reclassifyP) {
                    inference_modules.reclassify_removal_modules();
                }
                return count;
            }
        }
    }

    public static final SubLObject register_sksi_corba_modules_for_just_sks(SubLObject sks, SubLObject reclassifyP) {
        if (reclassifyP == UNPROVIDED) {
            reclassifyP = T;
        }
        {
            SubLObject count = ZERO_INTEGER;
            if (sksi_sks_accessors.sks_get_type(sks) == $const24$CommonObjectRequestBrokerArchitec) {
                {
                    SubLObject cdolist_list_var = corba_utilities.get_corba_removal_predicates();
                    SubLObject pred = NIL;
                    for (pred = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , pred = cdolist_list_var.first()) {
                        {
                            SubLObject name = make_corba_module_name_keyword(sks, pred, UNPROVIDED);
                            SubLObject expand_fn = corba_removal_module_utilities.corba_pred_get_removal_module_expand_fn_symbol(pred);
                            SubLObject req_pattern = corba_removal_module_utilities.determine_corba_removal_module_required_pattern(pred);
                            SubLObject content_mt = sksi_sks_accessors.sks_get_content_mt(sks);
                            inference_modules.inference_removal_module(name, list(new SubLObject[]{ $SENSE, $POS, $PREDICATE, pred, $REQUIRED_PATTERN, req_pattern, $COST_EXPRESSION, FIVE_INTEGER, $EXPAND, expand_fn, $REQUIRED_MT, content_mt }));
                            note_sksi_corba_module(name, content_mt);
                            inference_modules.register_solely_specific_removal_module_predicate(pred);
                        }
                    }
                }
                count = add(count, length(corba_utilities.get_corba_removal_predicates()));
                {
                    SubLObject content_mt = sksi_sks_accessors.sks_get_content_mt(sks);
                    hl_storage_modules.hl_storage_module($CORBA_H_P_A_C_K_S_CORBA_SET_OBJECT_METHOD_ARGS_STORAGE, list(new SubLObject[]{ $PRETTY_NAME, $str_alt34$__corbaSetObjectMethodArgs, $ARGUMENT_TYPE, $ARGUMENT, $PREDICATE, $$corbaSetObjectMethodArgs, $APPLICABILITY, $sym39$CORBA_SET_OBJECT_METHOD_ARGS_HL_STORAGE_MODULE_APPLICABLE_, $INCOMPLETENESS, CORBA_SET_HL_STORAGE_MODULE_INCOMPLETENESS, $ADD, CORBA_SET_HL_STORAGE_MODULE_ASSERT, $REQUIRED_MT, content_mt }));
                    hl_storage_modules.register_solely_specific_hl_storage_module_predicate($$corbaSetObjectMethodArgs);
                    inference_modules.register_solely_specific_removal_module_predicate($$corbaSetObjectMethodArgs);
                    note_sksi_corba_module($CORBA_H_P_A_C_K_S_CORBA_SET_OBJECT_METHOD_ARGS_STORAGE, content_mt);
                    hl_storage_modules.hl_storage_module($CORBA_H_P_A_C_K_S_CORBA_SET_OBJECT_FIELD_ARG_STORAGE, list(new SubLObject[]{ $PRETTY_NAME, $str_alt45$__corbaSetObjectFieldArg, $ARGUMENT_TYPE, $ARGUMENT, $PREDICATE, $$corbaSetObjectFieldArg, $APPLICABILITY, $sym47$CORBA_SET_OBJECT_FIELD_ARG_HL_STORAGE_MODULE_APPLICABLE_, $INCOMPLETENESS, CORBA_SET_HL_STORAGE_MODULE_INCOMPLETENESS, $ADD, CORBA_SET_HL_STORAGE_MODULE_ASSERT, $REQUIRED_MT, content_mt }));
                    hl_storage_modules.register_solely_specific_hl_storage_module_predicate($$corbaSetObjectFieldArg);
                    inference_modules.register_solely_specific_removal_module_predicate($$corbaSetObjectMethodArgs);
                    note_sksi_corba_module($CORBA_H_P_A_C_K_S_CORBA_SET_OBJECT_FIELD_ARG_STORAGE, content_mt);
                    hl_storage_modules.hl_storage_module($CORBA_H_P_A_C_K_S_CORBA_SET_CLASS_METHOD_ARGS_STORAGE, list(new SubLObject[]{ $PRETTY_NAME, $str_alt49$__corbaSetClassMethodArgs, $ARGUMENT_TYPE, $ARGUMENT, $PREDICATE, $$corbaSetClassMethodArgs, $APPLICABILITY, $sym51$CORBA_SET_CLASS_METHOD_ARGS_HL_STORAGE_MODULE_APPLICABLE_, $INCOMPLETENESS, CORBA_SET_HL_STORAGE_MODULE_INCOMPLETENESS, $ADD, CORBA_SET_HL_STORAGE_MODULE_ASSERT, $REQUIRED_MT, content_mt }));
                    hl_storage_modules.register_solely_specific_hl_storage_module_predicate($$corbaSetClassMethodArgs);
                    inference_modules.register_solely_specific_removal_module_predicate($$corbaSetObjectMethodArgs);
                    note_sksi_corba_module($CORBA_H_P_A_C_K_S_CORBA_SET_CLASS_METHOD_ARGS_STORAGE, content_mt);
                    hl_storage_modules.hl_storage_module($CORBA_H_P_A_C_K_S_CORBA_SET_CLASS_FIELD_ARG_STORAGE, list(new SubLObject[]{ $PRETTY_NAME, $str_alt53$__corbaSetClassFieldArg, $ARGUMENT_TYPE, $ARGUMENT, $PREDICATE, $$corbaSetClassFieldArg, $APPLICABILITY, $sym55$CORBA_SET_CLASS_FIELD_ARG_HL_STORAGE_MODULE_APPLICABLE_, $INCOMPLETENESS, CORBA_SET_HL_STORAGE_MODULE_INCOMPLETENESS, $ADD, CORBA_SET_HL_STORAGE_MODULE_ASSERT, $REQUIRED_MT, content_mt }));
                    hl_storage_modules.register_solely_specific_hl_storage_module_predicate($$corbaSetClassFieldArg);
                    inference_modules.register_solely_specific_removal_module_predicate($$corbaSetObjectMethodArgs);
                    note_sksi_corba_module($CORBA_H_P_A_C_K_S_CORBA_SET_CLASS_FIELD_ARG_STORAGE, content_mt);
                }
                count = add(count, length(corba_utilities.get_corba_storage_predicates()));
                if (NIL != reclassifyP) {
                    inference_modules.reclassify_removal_modules();
                }
            }
            return count;
        }
    }

    public static final SubLObject corba_sks_declare_module_suites(SubLObject sks) {
        {
            SubLObject cdolist_list_var = corba_utilities.get_corba_removal_predicates();
            SubLObject pred = NIL;
            for (pred = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , pred = cdolist_list_var.first()) {
                {
                    SubLObject name = make_corba_module_name_keyword(sks, pred, UNPROVIDED);
                    SubLObject expand_fn = corba_removal_module_utilities.corba_pred_get_removal_module_expand_fn_symbol(pred);
                    SubLObject req_pattern = corba_removal_module_utilities.determine_corba_removal_module_required_pattern(pred);
                    SubLObject content_mt = sksi_sks_accessors.sks_get_content_mt(sks);
                    inference_modules.inference_removal_module(name, list(new SubLObject[]{ $SENSE, $POS, $PREDICATE, pred, $REQUIRED_PATTERN, req_pattern, $COST_EXPRESSION, FIVE_INTEGER, $EXPAND, expand_fn, $REQUIRED_MT, content_mt }));
                    note_sksi_corba_module(name, content_mt);
                    inference_modules.register_solely_specific_removal_module_predicate(pred);
                }
            }
        }
        {
            SubLObject content_mt = sksi_sks_accessors.sks_get_content_mt(sks);
            hl_storage_modules.hl_storage_module($CORBA_H_P_A_C_K_S_CORBA_SET_OBJECT_METHOD_ARGS_STORAGE, list(new SubLObject[]{ $PRETTY_NAME, $str_alt34$__corbaSetObjectMethodArgs, $ARGUMENT_TYPE, $ARGUMENT, $PREDICATE, $$corbaSetObjectMethodArgs, $APPLICABILITY, $sym39$CORBA_SET_OBJECT_METHOD_ARGS_HL_STORAGE_MODULE_APPLICABLE_, $INCOMPLETENESS, CORBA_SET_HL_STORAGE_MODULE_INCOMPLETENESS, $ADD, CORBA_SET_HL_STORAGE_MODULE_ASSERT, $REQUIRED_MT, content_mt }));
            hl_storage_modules.register_solely_specific_hl_storage_module_predicate($$corbaSetObjectMethodArgs);
            inference_modules.register_solely_specific_removal_module_predicate($$corbaSetObjectMethodArgs);
            note_sksi_corba_module($CORBA_H_P_A_C_K_S_CORBA_SET_OBJECT_METHOD_ARGS_STORAGE, content_mt);
            hl_storage_modules.hl_storage_module($CORBA_H_P_A_C_K_S_CORBA_SET_OBJECT_FIELD_ARG_STORAGE, list(new SubLObject[]{ $PRETTY_NAME, $str_alt45$__corbaSetObjectFieldArg, $ARGUMENT_TYPE, $ARGUMENT, $PREDICATE, $$corbaSetObjectFieldArg, $APPLICABILITY, $sym47$CORBA_SET_OBJECT_FIELD_ARG_HL_STORAGE_MODULE_APPLICABLE_, $INCOMPLETENESS, CORBA_SET_HL_STORAGE_MODULE_INCOMPLETENESS, $ADD, CORBA_SET_HL_STORAGE_MODULE_ASSERT, $REQUIRED_MT, content_mt }));
            hl_storage_modules.register_solely_specific_hl_storage_module_predicate($$corbaSetObjectFieldArg);
            inference_modules.register_solely_specific_removal_module_predicate($$corbaSetObjectMethodArgs);
            note_sksi_corba_module($CORBA_H_P_A_C_K_S_CORBA_SET_OBJECT_FIELD_ARG_STORAGE, content_mt);
            hl_storage_modules.hl_storage_module($CORBA_H_P_A_C_K_S_CORBA_SET_CLASS_METHOD_ARGS_STORAGE, list(new SubLObject[]{ $PRETTY_NAME, $str_alt49$__corbaSetClassMethodArgs, $ARGUMENT_TYPE, $ARGUMENT, $PREDICATE, $$corbaSetClassMethodArgs, $APPLICABILITY, $sym51$CORBA_SET_CLASS_METHOD_ARGS_HL_STORAGE_MODULE_APPLICABLE_, $INCOMPLETENESS, CORBA_SET_HL_STORAGE_MODULE_INCOMPLETENESS, $ADD, CORBA_SET_HL_STORAGE_MODULE_ASSERT, $REQUIRED_MT, content_mt }));
            hl_storage_modules.register_solely_specific_hl_storage_module_predicate($$corbaSetClassMethodArgs);
            inference_modules.register_solely_specific_removal_module_predicate($$corbaSetObjectMethodArgs);
            note_sksi_corba_module($CORBA_H_P_A_C_K_S_CORBA_SET_CLASS_METHOD_ARGS_STORAGE, content_mt);
            hl_storage_modules.hl_storage_module($CORBA_H_P_A_C_K_S_CORBA_SET_CLASS_FIELD_ARG_STORAGE, list(new SubLObject[]{ $PRETTY_NAME, $str_alt53$__corbaSetClassFieldArg, $ARGUMENT_TYPE, $ARGUMENT, $PREDICATE, $$corbaSetClassFieldArg, $APPLICABILITY, $sym55$CORBA_SET_CLASS_FIELD_ARG_HL_STORAGE_MODULE_APPLICABLE_, $INCOMPLETENESS, CORBA_SET_HL_STORAGE_MODULE_INCOMPLETENESS, $ADD, CORBA_SET_HL_STORAGE_MODULE_ASSERT, $REQUIRED_MT, content_mt }));
            hl_storage_modules.register_solely_specific_hl_storage_module_predicate($$corbaSetClassFieldArg);
            inference_modules.register_solely_specific_removal_module_predicate($$corbaSetObjectMethodArgs);
            note_sksi_corba_module($CORBA_H_P_A_C_K_S_CORBA_SET_CLASS_FIELD_ARG_STORAGE, content_mt);
        }
        return NIL;
    }

    public static final SubLObject corba_sks_undeclare_module_suites(SubLObject sks) {
        {
            SubLObject cdolist_list_var = corba_utilities.get_corba_removal_predicates();
            SubLObject pred = NIL;
            for (pred = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , pred = cdolist_list_var.first()) {
                {
                    SubLObject name = make_corba_module_name_keyword(sks, pred, UNPROVIDED);
                    inference_modules.undeclare_inference_removal_module(name, NIL);
                    un_note_sksi_corba_module(name);
                }
            }
        }
        {
            SubLObject cdolist_list_var = corba_utilities.get_corba_storage_predicates();
            SubLObject pred = NIL;
            for (pred = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , pred = cdolist_list_var.first()) {
                {
                    SubLObject name = make_corba_module_name_keyword(sks, pred, UNPROVIDED);
                    hl_storage_modules.undeclare_hl_storage_module(name);
                    un_note_sksi_corba_module(name);
                }
            }
        }
        inference_modules.reclassify_removal_modules();
        return NIL;
    }

    public static final SubLObject register_all_sksi_corba_modules() {
        return ZERO_INTEGER;
    }

    public static final SubLObject deregister_sksi_corba_modules_for_sks(SubLObject sks, SubLObject mapping_mt, SubLObject reclassifyP) {
        if (mapping_mt == UNPROVIDED) {
            mapping_mt = NIL;
        }
        if (reclassifyP == UNPROVIDED) {
            reclassifyP = T;
        }
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            {
                SubLObject count = ZERO_INTEGER;
                if (NIL == mapping_mt) {
                    mapping_mt = sksi_kb_accessors.sk_source_mapping_mt(sks);
                }
                {
                    SubLObject mt_var = mapping_mt;
                    {
                        SubLObject _prev_bind_0 = mt_relevance_macros.$relevant_mt_function$.currentBinding(thread);
                        SubLObject _prev_bind_1 = mt_relevance_macros.$mt$.currentBinding(thread);
                        try {
                            mt_relevance_macros.$relevant_mt_function$.bind(mt_relevance_macros.possibly_in_mt_determine_function(mt_var), thread);
                            mt_relevance_macros.$mt$.bind(mt_relevance_macros.possibly_in_mt_determine_mt(mt_var), thread);
                            {
                                SubLObject sub_ks_closure = sksi_kb_accessors.sk_source_sub_ks_closure(sks);
                                SubLObject cdolist_list_var = sub_ks_closure;
                                SubLObject ks = NIL;
                                for (ks = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , ks = cdolist_list_var.first()) {
                                    count = add(count, deregister_sksi_corba_modules_for_just_sks(ks, NIL));
                                }
                            }
                        } finally {
                            mt_relevance_macros.$mt$.rebind(_prev_bind_1, thread);
                            mt_relevance_macros.$relevant_mt_function$.rebind(_prev_bind_0, thread);
                        }
                    }
                }
                if (NIL != reclassifyP) {
                    inference_modules.reclassify_removal_modules();
                }
                return count;
            }
        }
    }

    public static final SubLObject deregister_sksi_corba_modules_for_just_sks(SubLObject sks, SubLObject reclassifyP) {
        if (reclassifyP == UNPROVIDED) {
            reclassifyP = T;
        }
        {
            SubLObject count = ZERO_INTEGER;
            if (sksi_sks_accessors.sks_get_type(sks) == $const24$CommonObjectRequestBrokerArchitec) {
                {
                    SubLObject cdolist_list_var = corba_utilities.get_corba_removal_predicates();
                    SubLObject pred = NIL;
                    for (pred = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , pred = cdolist_list_var.first()) {
                        {
                            SubLObject name = make_corba_module_name_keyword(sks, pred, UNPROVIDED);
                            inference_modules.undeclare_inference_removal_module(name, NIL);
                            un_note_sksi_corba_module(name);
                        }
                    }
                }
                count = add(count, length(corba_utilities.get_corba_removal_predicates()));
                {
                    SubLObject cdolist_list_var = corba_utilities.get_corba_storage_predicates();
                    SubLObject pred = NIL;
                    for (pred = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , pred = cdolist_list_var.first()) {
                        {
                            SubLObject name = make_corba_module_name_keyword(sks, pred, UNPROVIDED);
                            hl_storage_modules.undeclare_hl_storage_module(name);
                            un_note_sksi_corba_module(name);
                        }
                    }
                }
                count = add(count, length(corba_utilities.get_corba_storage_predicates()));
                if (NIL != reclassifyP) {
                    inference_modules.reclassify_removal_modules();
                }
            }
            corba_utilities.clear_corba_caches();
            return count;
        }
    }

    public static final SubLObject deregister_all_sksi_corba_modules() {
        return ZERO_INTEGER;
    }

    public static final SubLObject corba_predicate_returns_valueP(SubLObject corba_predicate) {
        SubLTrampolineFile.checkType(corba_predicate, CORBA_PREDICATE_P);
        if (NIL != genls.any_genlP($$SubLListOrAtom, kb_accessors.arg1_isa(corba_predicate, $$CORBAMappingVocabularyMt), UNPROVIDED, UNPROVIDED)) {
            return T;
        } else {
            return NIL;
        }
    }

    public static final SubLObject corba_predicate_returns_objectP(SubLObject corba_predicate) {
        SubLTrampolineFile.checkType(corba_predicate, CORBA_PREDICATE_P);
        if (NIL != genls.any_genlP($$CycLClosedDenotationalTerm, kb_accessors.arg1_isa(corba_predicate, $$CORBAMappingVocabularyMt), UNPROVIDED, UNPROVIDED)) {
            return T;
        } else {
            return NIL;
        }
    }

    public static final SubLObject declare_corba_module_utilities_file() {
        declareFunction("add_corba_connection_by_sks", "ADD-CORBA-CONNECTION-BY-SKS", 2, 0, false);
        declareFunction("rem_corba_connection_by_sks", "REM-CORBA-CONNECTION-BY-SKS", 1, 0, false);
        declareFunction("get_corba_connection_by_sks", "GET-CORBA-CONNECTION-BY-SKS", 1, 0, false);
        declareFunction("new_corba_connection_by_sks", "NEW-CORBA-CONNECTION-BY-SKS", 1, 0, false);
        declareFunction("find_or_create_corba_connection_by_sks", "FIND-OR-CREATE-CORBA-CONNECTION-BY-SKS", 1, 0, false);
        declareFunction("make_corba_module_name_keyword", "MAKE-CORBA-MODULE-NAME-KEYWORD", 2, 1, false);
        declareFunction("make_corba_gateway_keyword", "MAKE-CORBA-GATEWAY-KEYWORD", 1, 0, false);
        declareFunction("corba_make_string", "CORBA-MAKE-STRING", 1, 0, false);
        declareFunction("corba_make_keyword", "CORBA-MAKE-KEYWORD", 1, 0, false);
        declareFunction("corba_make_symbol", "CORBA-MAKE-SYMBOL", 1, 0, false);
        declareFunction("note_sksi_corba_module", "NOTE-SKSI-CORBA-MODULE", 2, 0, false);
        declareFunction("un_note_sksi_corba_module", "UN-NOTE-SKSI-CORBA-MODULE", 1, 0, false);
        declareFunction("clear_sksi_corba_modules", "CLEAR-SKSI-CORBA-MODULES", 0, 0, false);
        declareFunction("look_up_sksi_corba_module", "LOOK-UP-SKSI-CORBA-MODULE", 1, 0, false);
        declareFunction("sksi_corba_modules_count", "SKSI-CORBA-MODULES-COUNT", 0, 0, false);
        declareFunction("some_sksi_corba_removal_module_registeredP", "SOME-SKSI-CORBA-REMOVAL-MODULE-REGISTERED?", 0, 0, false);
        declareFunction("register_sksi_corba_modules_for_sks", "REGISTER-SKSI-CORBA-MODULES-FOR-SKS", 1, 2, false);
        declareFunction("register_sksi_corba_modules_for_just_sks", "REGISTER-SKSI-CORBA-MODULES-FOR-JUST-SKS", 1, 1, false);
        declareFunction("corba_sks_declare_module_suites", "CORBA-SKS-DECLARE-MODULE-SUITES", 1, 0, false);
        declareFunction("corba_sks_undeclare_module_suites", "CORBA-SKS-UNDECLARE-MODULE-SUITES", 1, 0, false);
        declareFunction("register_all_sksi_corba_modules", "REGISTER-ALL-SKSI-CORBA-MODULES", 0, 0, false);
        declareFunction("deregister_sksi_corba_modules_for_sks", "DEREGISTER-SKSI-CORBA-MODULES-FOR-SKS", 1, 2, false);
        declareFunction("deregister_sksi_corba_modules_for_just_sks", "DEREGISTER-SKSI-CORBA-MODULES-FOR-JUST-SKS", 1, 1, false);
        declareFunction("deregister_all_sksi_corba_modules", "DEREGISTER-ALL-SKSI-CORBA-MODULES", 0, 0, false);
        declareFunction("corba_predicate_returns_valueP", "CORBA-PREDICATE-RETURNS-VALUE?", 1, 0, false);
        declareFunction("corba_predicate_returns_objectP", "CORBA-PREDICATE-RETURNS-OBJECT?", 1, 0, false);
        return NIL;
    }

    public static final SubLObject init_corba_module_utilities_file() {
        deflexical("*CORBA-CONNECTIONS-BY-SKS*", NIL);
        deflexical("*SKSI-CORBA-MODULES*", NIL != boundp($sksi_corba_modules$) ? ((SubLObject) ($sksi_corba_modules$.getGlobalValue())) : dictionary.new_dictionary(symbol_function(EQUAL), UNPROVIDED));
        return NIL;
    }

    public static final SubLObject setup_corba_module_utilities_file() {
                subl_macro_promotions.declare_defglobal($sksi_corba_modules$);
        return NIL;
    }

    // // Internal Constants
    private static final SubLSymbol CORBA_CONNECTION_P = makeSymbol("CORBA-CONNECTION-P");

    private static final SubLSymbol SKS_P = makeSymbol("SKS-P");

    public static final SubLObject $$sksProxyHost = constant_handles.reader_make_constant_shell(makeString("sksProxyHost"));

    public static final SubLObject $$sksProxyPort = constant_handles.reader_make_constant_shell(makeString("sksProxyPort"));

    public static final SubLObject $$corbaSKSInitialORBHost = constant_handles.reader_make_constant_shell(makeString("corbaSKSInitialORBHost"));

    public static final SubLObject $$corbaSKSInitialORBPort = constant_handles.reader_make_constant_shell(makeString("corbaSKSInitialORBPort"));

    public static final SubLObject $$corbaSKSServiceName = constant_handles.reader_make_constant_shell(makeString("corbaSKSServiceName"));

    public static final SubLObject $$corbaSKSInitialObjectClass = constant_handles.reader_make_constant_shell(makeString("corbaSKSInitialObjectClass"));

    static private final SubLString $$$Helper = makeString("Helper");





    private static final SubLSymbol $INITIAL_ORB_HOST = makeKeyword("INITIAL-ORB-HOST");

    private static final SubLSymbol $INITIAL_ORB_PORT = makeKeyword("INITIAL-ORB-PORT");



    private static final SubLSymbol $INITIAL_OBJECT_CLASS = makeKeyword("INITIAL-OBJECT-CLASS");

    private static final SubLSymbol $INITIAL_OBJECT_CLASS_HELPER = makeKeyword("INITIAL-OBJECT-CLASS-HELPER");

    static private final SubLString $$$removal = makeString("removal");

    private static final SubLSymbol CORBA_PREDICATE_P = makeSymbol("CORBA-PREDICATE-P");

    static private final SubLString $$$corba = makeString("corba");

    static private final SubLString $str_alt19$_ = makeString("-");



    private static final SubLSymbol STRING_FROM_KEYWORD = makeSymbol("STRING-FROM-KEYWORD");



    public static final SubLSymbol $sksi_corba_modules$ = makeSymbol("*SKSI-CORBA-MODULES*");

    public static final SubLObject $const24$CommonObjectRequestBrokerArchitec = constant_handles.reader_make_constant_shell(makeString("CommonObjectRequestBrokerArchitecture"));















    private static final SubLSymbol $CORBA_H_P_A_C_K_S_CORBA_SET_OBJECT_METHOD_ARGS_STORAGE = makeKeyword("CORBA-H-P-A-C-K-S-CORBA-SET-OBJECT-METHOD-ARGS-STORAGE");



    static private final SubLString $str_alt34$__corbaSetObjectMethodArgs = makeString("#$corbaSetObjectMethodArgs");





    public static final SubLObject $$corbaSetObjectMethodArgs = constant_handles.reader_make_constant_shell(makeString("corbaSetObjectMethodArgs"));



    static private final SubLSymbol $sym39$CORBA_SET_OBJECT_METHOD_ARGS_HL_STORAGE_MODULE_APPLICABLE_ = makeSymbol("CORBA-SET-OBJECT-METHOD-ARGS-HL-STORAGE-MODULE-APPLICABLE?");



    private static final SubLSymbol CORBA_SET_HL_STORAGE_MODULE_INCOMPLETENESS = makeSymbol("CORBA-SET-HL-STORAGE-MODULE-INCOMPLETENESS");



    private static final SubLSymbol CORBA_SET_HL_STORAGE_MODULE_ASSERT = makeSymbol("CORBA-SET-HL-STORAGE-MODULE-ASSERT");

    private static final SubLSymbol $CORBA_H_P_A_C_K_S_CORBA_SET_OBJECT_FIELD_ARG_STORAGE = makeKeyword("CORBA-H-P-A-C-K-S-CORBA-SET-OBJECT-FIELD-ARG-STORAGE");

    static private final SubLString $str_alt45$__corbaSetObjectFieldArg = makeString("#$corbaSetObjectFieldArg");

    public static final SubLObject $$corbaSetObjectFieldArg = constant_handles.reader_make_constant_shell(makeString("corbaSetObjectFieldArg"));

    static private final SubLSymbol $sym47$CORBA_SET_OBJECT_FIELD_ARG_HL_STORAGE_MODULE_APPLICABLE_ = makeSymbol("CORBA-SET-OBJECT-FIELD-ARG-HL-STORAGE-MODULE-APPLICABLE?");

    private static final SubLSymbol $CORBA_H_P_A_C_K_S_CORBA_SET_CLASS_METHOD_ARGS_STORAGE = makeKeyword("CORBA-H-P-A-C-K-S-CORBA-SET-CLASS-METHOD-ARGS-STORAGE");

    static private final SubLString $str_alt49$__corbaSetClassMethodArgs = makeString("#$corbaSetClassMethodArgs");

    public static final SubLObject $$corbaSetClassMethodArgs = constant_handles.reader_make_constant_shell(makeString("corbaSetClassMethodArgs"));

    static private final SubLSymbol $sym51$CORBA_SET_CLASS_METHOD_ARGS_HL_STORAGE_MODULE_APPLICABLE_ = makeSymbol("CORBA-SET-CLASS-METHOD-ARGS-HL-STORAGE-MODULE-APPLICABLE?");

    private static final SubLSymbol $CORBA_H_P_A_C_K_S_CORBA_SET_CLASS_FIELD_ARG_STORAGE = makeKeyword("CORBA-H-P-A-C-K-S-CORBA-SET-CLASS-FIELD-ARG-STORAGE");

    static private final SubLString $str_alt53$__corbaSetClassFieldArg = makeString("#$corbaSetClassFieldArg");

    public static final SubLObject $$corbaSetClassFieldArg = constant_handles.reader_make_constant_shell(makeString("corbaSetClassFieldArg"));

    static private final SubLSymbol $sym55$CORBA_SET_CLASS_FIELD_ARG_HL_STORAGE_MODULE_APPLICABLE_ = makeSymbol("CORBA-SET-CLASS-FIELD-ARG-HL-STORAGE-MODULE-APPLICABLE?");

    public static final SubLObject $$SubLListOrAtom = constant_handles.reader_make_constant_shell(makeString("SubLListOrAtom"));

    public static final SubLObject $$CORBAMappingVocabularyMt = constant_handles.reader_make_constant_shell(makeString("CORBAMappingVocabularyMt"));

    public static final SubLObject $$CycLClosedDenotationalTerm = constant_handles.reader_make_constant_shell(makeString("CycLClosedDenotationalTerm"));

    // // Initializers
    @Override
    public void declareFunctions() {
        declare_corba_module_utilities_file();
    }

    @Override
    public void initializeVariables() {
        init_corba_module_utilities_file();
    }

    @Override
    public void runTopLevelForms() {
        setup_corba_module_utilities_file();
    }
}

