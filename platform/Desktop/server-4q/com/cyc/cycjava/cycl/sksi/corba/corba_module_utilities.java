package com.cyc.cycjava.cycl.sksi.corba;

import com.cyc.cycjava.cycl.constant_handles;
import com.cyc.cycjava.cycl.subl_macro_promotions;
import com.cyc.tool.subl.util.SubLFiles;
import com.cyc.cycjava.cycl.genls;
import com.cyc.cycjava.cycl.kb_accessors;
import com.cyc.cycjava.cycl.hl_storage_modules;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.SubLThread;
import com.cyc.cycjava.cycl.inference.harness.inference_modules;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Numbers;
import com.cyc.cycjava.cycl.mt_relevance_macros;
import com.cyc.cycjava.cycl.sksi.sksi_infrastructure.sksi_kb_accessors;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLProcess;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory;
import com.cyc.cycjava.cycl.dictionary;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Packages;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Functions;
import com.cyc.cycjava.cycl.transform_list_utilities;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Symbols;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Strings;
import com.cyc.cycjava.cycl.list_utilities;
import com.cyc.cycjava.cycl.string_utilities;
import com.cyc.cycjava.cycl.constants_high;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Sequences;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.conses_high;
import com.cyc.cycjava.cycl.sksi.sksi_infrastructure.sksi_sks_accessors;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLString;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObject;
import com.cyc.tool.subl.jrtl.nativeCode.type.symbol.SubLSymbol;
import com.cyc.tool.subl.util.SubLFile;
import com.cyc.tool.subl.util.SubLTranslatedFile;

public final class corba_module_utilities extends SubLTranslatedFile
{
    public static final SubLFile me;
    public static final String myName = "com.cyc.cycjava.cycl.sksi.corba.corba_module_utilities";
    public static final String myFingerPrint = "be7fc5a200a6f40fd5f55d01a847ce4ddeae06d691309ef30c60194680bb21bf";
    @SubLTranslatedFile.SubL(source = "cycl/sksi/corba/corba-module-utilities.lisp", position = 873L)
    public static SubLSymbol $corba_connections_by_sks$;
    @SubLTranslatedFile.SubL(source = "cycl/sksi/corba/corba-module-utilities.lisp", position = 4379L)
    private static SubLSymbol $sksi_corba_modules$;
    private static final SubLSymbol $sym0$CORBA_CONNECTION_P;
    private static final SubLSymbol $sym1$SKS_P;
    private static final SubLObject $const2$sksProxyHost;
    private static final SubLObject $const3$sksProxyPort;
    private static final SubLObject $const4$corbaSKSInitialORBHost;
    private static final SubLObject $const5$corbaSKSInitialORBPort;
    private static final SubLObject $const6$corbaSKSServiceName;
    private static final SubLObject $const7$corbaSKSInitialObjectClass;
    private static final SubLString $str8$Helper;
    private static final SubLSymbol $kw9$PROXY_HOST;
    private static final SubLSymbol $kw10$PROXY_PORT;
    private static final SubLSymbol $kw11$INITIAL_ORB_HOST;
    private static final SubLSymbol $kw12$INITIAL_ORB_PORT;
    private static final SubLSymbol $kw13$SERVICE_NAME;
    private static final SubLSymbol $kw14$INITIAL_OBJECT_CLASS;
    private static final SubLSymbol $kw15$INITIAL_OBJECT_CLASS_HELPER;
    private static final SubLString $str16$removal;
    private static final SubLSymbol $sym17$CORBA_PREDICATE_P;
    private static final SubLString $str18$corba;
    private static final SubLString $str19$_;
    private static final SubLSymbol $sym20$KEYWORDP;
    private static final SubLSymbol $sym21$STRING_FROM_KEYWORD;
    private static final SubLSymbol $sym22$CCONCATENATE;
    private static final SubLSymbol $sym23$_SKSI_CORBA_MODULES_;
    private static final SubLObject $const24$CommonObjectRequestBrokerArchitec;
    private static final SubLSymbol $kw25$SENSE;
    private static final SubLSymbol $kw26$POS;
    private static final SubLSymbol $kw27$PREDICATE;
    private static final SubLSymbol $kw28$REQUIRED_PATTERN;
    private static final SubLSymbol $kw29$COST_EXPRESSION;
    private static final SubLSymbol $kw30$EXPAND;
    private static final SubLSymbol $kw31$REQUIRED_MT;
    private static final SubLSymbol $kw32$CORBA_H_P_A_C_K_S_CORBA_SET_OBJECT_METHOD_ARGS_STORAGE;
    private static final SubLSymbol $kw33$PRETTY_NAME;
    private static final SubLString $str34$__corbaSetObjectMethodArgs;
    private static final SubLSymbol $kw35$ARGUMENT_TYPE;
    private static final SubLSymbol $kw36$ARGUMENT;
    private static final SubLObject $const37$corbaSetObjectMethodArgs;
    private static final SubLSymbol $kw38$APPLICABILITY;
    private static final SubLSymbol $sym39$CORBA_SET_OBJECT_METHOD_ARGS_HL_STORAGE_MODULE_APPLICABLE_;
    private static final SubLSymbol $kw40$INCOMPLETENESS;
    private static final SubLSymbol $sym41$CORBA_SET_HL_STORAGE_MODULE_INCOMPLETENESS;
    private static final SubLSymbol $kw42$ADD;
    private static final SubLSymbol $sym43$CORBA_SET_HL_STORAGE_MODULE_ASSERT;
    private static final SubLSymbol $kw44$CORBA_H_P_A_C_K_S_CORBA_SET_OBJECT_FIELD_ARG_STORAGE;
    private static final SubLString $str45$__corbaSetObjectFieldArg;
    private static final SubLObject $const46$corbaSetObjectFieldArg;
    private static final SubLSymbol $sym47$CORBA_SET_OBJECT_FIELD_ARG_HL_STORAGE_MODULE_APPLICABLE_;
    private static final SubLSymbol $kw48$CORBA_H_P_A_C_K_S_CORBA_SET_CLASS_METHOD_ARGS_STORAGE;
    private static final SubLString $str49$__corbaSetClassMethodArgs;
    private static final SubLObject $const50$corbaSetClassMethodArgs;
    private static final SubLSymbol $sym51$CORBA_SET_CLASS_METHOD_ARGS_HL_STORAGE_MODULE_APPLICABLE_;
    private static final SubLSymbol $kw52$CORBA_H_P_A_C_K_S_CORBA_SET_CLASS_FIELD_ARG_STORAGE;
    private static final SubLString $str53$__corbaSetClassFieldArg;
    private static final SubLObject $const54$corbaSetClassFieldArg;
    private static final SubLSymbol $sym55$CORBA_SET_CLASS_FIELD_ARG_HL_STORAGE_MODULE_APPLICABLE_;
    private static final SubLObject $const56$SubLListOrAtom;
    private static final SubLObject $const57$CORBAMappingVocabularyMt;
    private static final SubLObject $const58$CycLClosedDenotationalTerm;
    
    @SubLTranslatedFile.SubL(source = "cycl/sksi/corba/corba-module-utilities.lisp", position = 1060L)
    public static SubLObject add_corba_connection_by_sks(final SubLObject corba_connection, final SubLObject sks) {
        assert corba_module_utilities.NIL != corba_utilities.corba_connection_p(corba_connection) : corba_connection;
        assert corba_module_utilities.NIL != sksi_sks_accessors.sks_p(sks) : sks;
        corba_module_utilities.$corba_connections_by_sks$.setGlobalValue(conses_high.putf(corba_module_utilities.$corba_connections_by_sks$.getGlobalValue(), sks, corba_connection));
        return (SubLObject)corba_module_utilities.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/sksi/corba/corba-module-utilities.lisp", position = 1407L)
    public static SubLObject rem_corba_connection_by_sks(final SubLObject sks) {
        assert corba_module_utilities.NIL != sksi_sks_accessors.sks_p(sks) : sks;
        corba_module_utilities.$corba_connections_by_sks$.setGlobalValue(conses_high.remf(corba_module_utilities.$corba_connections_by_sks$.getGlobalValue(), sks));
        return (SubLObject)corba_module_utilities.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/sksi/corba/corba-module-utilities.lisp", position = 1671L)
    public static SubLObject get_corba_connection_by_sks(final SubLObject sks) {
        assert corba_module_utilities.NIL != sksi_sks_accessors.sks_p(sks) : sks;
        return conses_high.getf(corba_module_utilities.$corba_connections_by_sks$.getGlobalValue(), sks, (SubLObject)corba_module_utilities.UNPROVIDED);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/sksi/corba/corba-module-utilities.lisp", position = 1794L)
    public static SubLObject new_corba_connection_by_sks(final SubLObject sks) {
        assert corba_module_utilities.NIL != sksi_sks_accessors.sks_p(sks) : sks;
        final SubLObject proxy_host = sksi_sks_accessors.sks_fget(sks, corba_module_utilities.$const2$sksProxyHost, (SubLObject)corba_module_utilities.UNPROVIDED);
        final SubLObject proxy_port = sksi_sks_accessors.sks_fget(sks, corba_module_utilities.$const3$sksProxyPort, (SubLObject)corba_module_utilities.UNPROVIDED);
        final SubLObject initial_orb_host = sksi_sks_accessors.sks_fget(sks, corba_module_utilities.$const4$corbaSKSInitialORBHost, (SubLObject)corba_module_utilities.UNPROVIDED);
        final SubLObject initial_orb_port = sksi_sks_accessors.sks_fget(sks, corba_module_utilities.$const5$corbaSKSInitialORBPort, (SubLObject)corba_module_utilities.UNPROVIDED);
        final SubLObject service_name = sksi_sks_accessors.sks_fget(sks, corba_module_utilities.$const6$corbaSKSServiceName, (SubLObject)corba_module_utilities.UNPROVIDED);
        final SubLObject initial_object_class = sksi_sks_accessors.sks_fget(sks, corba_module_utilities.$const7$corbaSKSInitialObjectClass, (SubLObject)corba_module_utilities.UNPROVIDED);
        final SubLObject initial_object_class_helper = (SubLObject)((corba_module_utilities.NIL != initial_object_class) ? Sequences.cconcatenate(initial_object_class, (SubLObject)corba_module_utilities.$str8$Helper) : corba_module_utilities.NIL);
        final SubLObject connection = corba_utilities.new_corba_connection((SubLObject)ConsesLow.list(new SubLObject[] { corba_module_utilities.$kw9$PROXY_HOST, proxy_host, corba_module_utilities.$kw10$PROXY_PORT, proxy_port, corba_module_utilities.$kw11$INITIAL_ORB_HOST, initial_orb_host, corba_module_utilities.$kw12$INITIAL_ORB_PORT, initial_orb_port, corba_module_utilities.$kw13$SERVICE_NAME, service_name, corba_module_utilities.$kw14$INITIAL_OBJECT_CLASS, initial_object_class, corba_module_utilities.$kw15$INITIAL_OBJECT_CLASS_HELPER, initial_object_class_helper }));
        add_corba_connection_by_sks(connection, sks);
        return connection;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/sksi/corba/corba-module-utilities.lisp", position = 2731L)
    public static SubLObject find_or_create_corba_connection_by_sks(final SubLObject sks) {
        assert corba_module_utilities.NIL != sksi_sks_accessors.sks_p(sks) : sks;
        SubLObject connection = get_corba_connection_by_sks(sks);
        if (corba_module_utilities.NIL == connection) {
            connection = new_corba_connection_by_sks(sks);
        }
        if (corba_module_utilities.NIL != corba_utilities.corba_connection_invalidP(connection)) {
            rem_corba_connection_by_sks(sks);
            connection = new_corba_connection_by_sks(sks);
        }
        return connection;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/sksi/corba/corba-module-utilities.lisp", position = 3143L)
    public static SubLObject make_corba_module_name_keyword(final SubLObject sks, final SubLObject pred, SubLObject type) {
        if (type == corba_module_utilities.UNPROVIDED) {
            type = (SubLObject)corba_module_utilities.$str16$removal;
        }
        assert corba_module_utilities.NIL != sksi_sks_accessors.sks_p(sks) : sks;
        assert corba_module_utilities.NIL != corba_utilities.corba_predicate_p(pred) : pred;
        final SubLObject sks_strings = string_utilities.relevant_substrings(constants_high.constant_name(sks));
        final SubLObject pred_strings = string_utilities.relevant_substrings(constants_high.constant_name(pred));
        return corba_make_keyword(list_utilities.insert_between_each(ConsesLow.append((SubLObject)ConsesLow.list((SubLObject)corba_module_utilities.$str18$corba), sks_strings, pred_strings, (SubLObject)ConsesLow.list(type)), (SubLObject)corba_module_utilities.$str19$_));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/sksi/corba/corba-module-utilities.lisp", position = 3708L)
    public static SubLObject make_corba_gateway_keyword(final SubLObject pred) {
        SubLObject pred_strings = string_utilities.relevant_substrings(constants_high.constant_name(pred));
        if (corba_module_utilities.NIL != Strings.stringE(pred_strings.first(), (SubLObject)corba_module_utilities.$str18$corba, (SubLObject)corba_module_utilities.UNPROVIDED, (SubLObject)corba_module_utilities.UNPROVIDED, (SubLObject)corba_module_utilities.UNPROVIDED, (SubLObject)corba_module_utilities.UNPROVIDED)) {
            pred_strings = pred_strings.rest();
        }
        return corba_make_keyword(list_utilities.insert_between_each(pred_strings, (SubLObject)corba_module_utilities.$str19$_));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/sksi/corba/corba-module-utilities.lisp", position = 4036L)
    public static SubLObject corba_make_string(SubLObject args) {
        args = transform_list_utilities.transform(args, Symbols.symbol_function((SubLObject)corba_module_utilities.$sym20$KEYWORDP), Symbols.symbol_function((SubLObject)corba_module_utilities.$sym21$STRING_FROM_KEYWORD), (SubLObject)corba_module_utilities.UNPROVIDED);
        return Strings.string_upcase(Functions.apply(Symbols.symbol_function((SubLObject)corba_module_utilities.$sym22$CCONCATENATE), args), (SubLObject)corba_module_utilities.UNPROVIDED, (SubLObject)corba_module_utilities.UNPROVIDED);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/sksi/corba/corba-module-utilities.lisp", position = 4198L)
    public static SubLObject corba_make_keyword(final SubLObject args) {
        return Symbols.make_keyword(corba_make_string(args));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/sksi/corba/corba-module-utilities.lisp", position = 4292L)
    public static SubLObject corba_make_symbol(final SubLObject args) {
        return Packages.intern(corba_make_string(args), (SubLObject)corba_module_utilities.UNPROVIDED);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/sksi/corba/corba-module-utilities.lisp", position = 4569L)
    public static SubLObject note_sksi_corba_module(final SubLObject hl_module, final SubLObject content_mt) {
        return dictionary.dictionary_enter(corba_module_utilities.$sksi_corba_modules$.getGlobalValue(), hl_module, content_mt);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/sksi/corba/corba-module-utilities.lisp", position = 4702L)
    public static SubLObject un_note_sksi_corba_module(final SubLObject hl_module) {
        return dictionary.dictionary_remove(corba_module_utilities.$sksi_corba_modules$.getGlobalValue(), hl_module);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/sksi/corba/corba-module-utilities.lisp", position = 4817L)
    public static SubLObject clear_sksi_corba_modules() {
        return dictionary.clear_dictionary(corba_module_utilities.$sksi_corba_modules$.getGlobalValue());
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/sksi/corba/corba-module-utilities.lisp", position = 4911L)
    public static SubLObject look_up_sksi_corba_module(final SubLObject hl_module) {
        return dictionary.dictionary_lookup(corba_module_utilities.$sksi_corba_modules$.getGlobalValue(), hl_module, (SubLObject)corba_module_utilities.UNPROVIDED);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/sksi/corba/corba-module-utilities.lisp", position = 5026L)
    public static SubLObject sksi_corba_modules_count() {
        return dictionary.dictionary_length(corba_module_utilities.$sksi_corba_modules$.getGlobalValue());
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/sksi/corba/corba-module-utilities.lisp", position = 5123L)
    public static SubLObject some_sksi_corba_removal_module_registeredP() {
        return (SubLObject)SubLObjectFactory.makeBoolean(corba_module_utilities.NIL == dictionary.dictionary_empty_p(corba_module_utilities.$sksi_corba_modules$.getGlobalValue()));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/sksi/corba/corba-module-utilities.lisp", position = 5246L)
    public static SubLObject register_sksi_corba_modules_for_sks(final SubLObject sks, SubLObject mapping_mt, SubLObject reclassifyP) {
        if (mapping_mt == corba_module_utilities.UNPROVIDED) {
            mapping_mt = (SubLObject)corba_module_utilities.NIL;
        }
        if (reclassifyP == corba_module_utilities.UNPROVIDED) {
            reclassifyP = (SubLObject)corba_module_utilities.T;
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject count = (SubLObject)corba_module_utilities.ZERO_INTEGER;
        if (corba_module_utilities.NIL == mapping_mt) {
            mapping_mt = sksi_kb_accessors.sk_source_mapping_mt(sks);
        }
        final SubLObject mt_var = mapping_mt;
        final SubLObject _prev_bind_0 = mt_relevance_macros.$relevant_mt_function$.currentBinding(thread);
        final SubLObject _prev_bind_2 = mt_relevance_macros.$mt$.currentBinding(thread);
        try {
            mt_relevance_macros.$relevant_mt_function$.bind(mt_relevance_macros.possibly_in_mt_determine_function(mt_var), thread);
            mt_relevance_macros.$mt$.bind(mt_relevance_macros.possibly_in_mt_determine_mt(mt_var), thread);
            SubLObject cdolist_list_var;
            final SubLObject sub_ks_closure = cdolist_list_var = sksi_kb_accessors.sk_source_sub_ks_closure(sks);
            SubLObject ks = (SubLObject)corba_module_utilities.NIL;
            ks = cdolist_list_var.first();
            while (corba_module_utilities.NIL != cdolist_list_var) {
                count = Numbers.add(count, register_sksi_corba_modules_for_just_sks(ks, (SubLObject)corba_module_utilities.NIL));
                cdolist_list_var = cdolist_list_var.rest();
                ks = cdolist_list_var.first();
            }
        }
        finally {
            mt_relevance_macros.$mt$.rebind(_prev_bind_2, thread);
            mt_relevance_macros.$relevant_mt_function$.rebind(_prev_bind_0, thread);
        }
        if (corba_module_utilities.NIL != reclassifyP) {
            inference_modules.reclassify_removal_modules();
        }
        return count;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/sksi/corba/corba-module-utilities.lisp", position = 5792L)
    public static SubLObject register_sksi_corba_modules_for_just_sks(final SubLObject sks, SubLObject reclassifyP) {
        if (reclassifyP == corba_module_utilities.UNPROVIDED) {
            reclassifyP = (SubLObject)corba_module_utilities.T;
        }
        SubLObject count = (SubLObject)corba_module_utilities.ZERO_INTEGER;
        if (sksi_sks_accessors.sks_get_type(sks).eql(corba_module_utilities.$const24$CommonObjectRequestBrokerArchitec)) {
            SubLObject cdolist_list_var = corba_utilities.get_corba_removal_predicates();
            SubLObject pred = (SubLObject)corba_module_utilities.NIL;
            pred = cdolist_list_var.first();
            while (corba_module_utilities.NIL != cdolist_list_var) {
                final SubLObject name = make_corba_module_name_keyword(sks, pred, (SubLObject)corba_module_utilities.UNPROVIDED);
                final SubLObject expand_fn = corba_removal_module_utilities.corba_pred_get_removal_module_expand_fn_symbol(pred);
                final SubLObject req_pattern = corba_removal_module_utilities.determine_corba_removal_module_required_pattern(pred);
                final SubLObject content_mt = sksi_sks_accessors.sks_get_content_mt(sks);
                inference_modules.inference_removal_module(name, (SubLObject)ConsesLow.list(new SubLObject[] { corba_module_utilities.$kw25$SENSE, corba_module_utilities.$kw26$POS, corba_module_utilities.$kw27$PREDICATE, pred, corba_module_utilities.$kw28$REQUIRED_PATTERN, req_pattern, corba_module_utilities.$kw29$COST_EXPRESSION, corba_module_utilities.FIVE_INTEGER, corba_module_utilities.$kw30$EXPAND, expand_fn, corba_module_utilities.$kw31$REQUIRED_MT, content_mt }));
                note_sksi_corba_module(name, content_mt);
                inference_modules.register_solely_specific_removal_module_predicate(pred);
                cdolist_list_var = cdolist_list_var.rest();
                pred = cdolist_list_var.first();
            }
            count = Numbers.add(count, Sequences.length(corba_utilities.get_corba_removal_predicates()));
            final SubLObject content_mt2 = sksi_sks_accessors.sks_get_content_mt(sks);
            hl_storage_modules.hl_storage_module((SubLObject)corba_module_utilities.$kw32$CORBA_H_P_A_C_K_S_CORBA_SET_OBJECT_METHOD_ARGS_STORAGE, (SubLObject)ConsesLow.list(new SubLObject[] { corba_module_utilities.$kw33$PRETTY_NAME, corba_module_utilities.$str34$__corbaSetObjectMethodArgs, corba_module_utilities.$kw35$ARGUMENT_TYPE, corba_module_utilities.$kw36$ARGUMENT, corba_module_utilities.$kw27$PREDICATE, corba_module_utilities.$const37$corbaSetObjectMethodArgs, corba_module_utilities.$kw38$APPLICABILITY, corba_module_utilities.$sym39$CORBA_SET_OBJECT_METHOD_ARGS_HL_STORAGE_MODULE_APPLICABLE_, corba_module_utilities.$kw40$INCOMPLETENESS, corba_module_utilities.$sym41$CORBA_SET_HL_STORAGE_MODULE_INCOMPLETENESS, corba_module_utilities.$kw42$ADD, corba_module_utilities.$sym43$CORBA_SET_HL_STORAGE_MODULE_ASSERT, corba_module_utilities.$kw31$REQUIRED_MT, content_mt2 }));
            hl_storage_modules.register_solely_specific_hl_storage_module_predicate(corba_module_utilities.$const37$corbaSetObjectMethodArgs);
            inference_modules.register_solely_specific_removal_module_predicate(corba_module_utilities.$const37$corbaSetObjectMethodArgs);
            note_sksi_corba_module((SubLObject)corba_module_utilities.$kw32$CORBA_H_P_A_C_K_S_CORBA_SET_OBJECT_METHOD_ARGS_STORAGE, content_mt2);
            hl_storage_modules.hl_storage_module((SubLObject)corba_module_utilities.$kw44$CORBA_H_P_A_C_K_S_CORBA_SET_OBJECT_FIELD_ARG_STORAGE, (SubLObject)ConsesLow.list(new SubLObject[] { corba_module_utilities.$kw33$PRETTY_NAME, corba_module_utilities.$str45$__corbaSetObjectFieldArg, corba_module_utilities.$kw35$ARGUMENT_TYPE, corba_module_utilities.$kw36$ARGUMENT, corba_module_utilities.$kw27$PREDICATE, corba_module_utilities.$const46$corbaSetObjectFieldArg, corba_module_utilities.$kw38$APPLICABILITY, corba_module_utilities.$sym47$CORBA_SET_OBJECT_FIELD_ARG_HL_STORAGE_MODULE_APPLICABLE_, corba_module_utilities.$kw40$INCOMPLETENESS, corba_module_utilities.$sym41$CORBA_SET_HL_STORAGE_MODULE_INCOMPLETENESS, corba_module_utilities.$kw42$ADD, corba_module_utilities.$sym43$CORBA_SET_HL_STORAGE_MODULE_ASSERT, corba_module_utilities.$kw31$REQUIRED_MT, content_mt2 }));
            hl_storage_modules.register_solely_specific_hl_storage_module_predicate(corba_module_utilities.$const46$corbaSetObjectFieldArg);
            inference_modules.register_solely_specific_removal_module_predicate(corba_module_utilities.$const37$corbaSetObjectMethodArgs);
            note_sksi_corba_module((SubLObject)corba_module_utilities.$kw44$CORBA_H_P_A_C_K_S_CORBA_SET_OBJECT_FIELD_ARG_STORAGE, content_mt2);
            hl_storage_modules.hl_storage_module((SubLObject)corba_module_utilities.$kw48$CORBA_H_P_A_C_K_S_CORBA_SET_CLASS_METHOD_ARGS_STORAGE, (SubLObject)ConsesLow.list(new SubLObject[] { corba_module_utilities.$kw33$PRETTY_NAME, corba_module_utilities.$str49$__corbaSetClassMethodArgs, corba_module_utilities.$kw35$ARGUMENT_TYPE, corba_module_utilities.$kw36$ARGUMENT, corba_module_utilities.$kw27$PREDICATE, corba_module_utilities.$const50$corbaSetClassMethodArgs, corba_module_utilities.$kw38$APPLICABILITY, corba_module_utilities.$sym51$CORBA_SET_CLASS_METHOD_ARGS_HL_STORAGE_MODULE_APPLICABLE_, corba_module_utilities.$kw40$INCOMPLETENESS, corba_module_utilities.$sym41$CORBA_SET_HL_STORAGE_MODULE_INCOMPLETENESS, corba_module_utilities.$kw42$ADD, corba_module_utilities.$sym43$CORBA_SET_HL_STORAGE_MODULE_ASSERT, corba_module_utilities.$kw31$REQUIRED_MT, content_mt2 }));
            hl_storage_modules.register_solely_specific_hl_storage_module_predicate(corba_module_utilities.$const50$corbaSetClassMethodArgs);
            inference_modules.register_solely_specific_removal_module_predicate(corba_module_utilities.$const37$corbaSetObjectMethodArgs);
            note_sksi_corba_module((SubLObject)corba_module_utilities.$kw48$CORBA_H_P_A_C_K_S_CORBA_SET_CLASS_METHOD_ARGS_STORAGE, content_mt2);
            hl_storage_modules.hl_storage_module((SubLObject)corba_module_utilities.$kw52$CORBA_H_P_A_C_K_S_CORBA_SET_CLASS_FIELD_ARG_STORAGE, (SubLObject)ConsesLow.list(new SubLObject[] { corba_module_utilities.$kw33$PRETTY_NAME, corba_module_utilities.$str53$__corbaSetClassFieldArg, corba_module_utilities.$kw35$ARGUMENT_TYPE, corba_module_utilities.$kw36$ARGUMENT, corba_module_utilities.$kw27$PREDICATE, corba_module_utilities.$const54$corbaSetClassFieldArg, corba_module_utilities.$kw38$APPLICABILITY, corba_module_utilities.$sym55$CORBA_SET_CLASS_FIELD_ARG_HL_STORAGE_MODULE_APPLICABLE_, corba_module_utilities.$kw40$INCOMPLETENESS, corba_module_utilities.$sym41$CORBA_SET_HL_STORAGE_MODULE_INCOMPLETENESS, corba_module_utilities.$kw42$ADD, corba_module_utilities.$sym43$CORBA_SET_HL_STORAGE_MODULE_ASSERT, corba_module_utilities.$kw31$REQUIRED_MT, content_mt2 }));
            hl_storage_modules.register_solely_specific_hl_storage_module_predicate(corba_module_utilities.$const54$corbaSetClassFieldArg);
            inference_modules.register_solely_specific_removal_module_predicate(corba_module_utilities.$const37$corbaSetObjectMethodArgs);
            note_sksi_corba_module((SubLObject)corba_module_utilities.$kw52$CORBA_H_P_A_C_K_S_CORBA_SET_CLASS_FIELD_ARG_STORAGE, content_mt2);
            count = Numbers.add(count, Sequences.length(corba_utilities.get_corba_storage_predicates()));
            if (corba_module_utilities.NIL != reclassifyP) {
                inference_modules.reclassify_removal_modules();
            }
        }
        return count;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/sksi/corba/corba-module-utilities.lisp", position = 6274L)
    public static SubLObject corba_sks_declare_module_suites(final SubLObject sks) {
        SubLObject cdolist_list_var = corba_utilities.get_corba_removal_predicates();
        SubLObject pred = (SubLObject)corba_module_utilities.NIL;
        pred = cdolist_list_var.first();
        while (corba_module_utilities.NIL != cdolist_list_var) {
            final SubLObject name = make_corba_module_name_keyword(sks, pred, (SubLObject)corba_module_utilities.UNPROVIDED);
            final SubLObject expand_fn = corba_removal_module_utilities.corba_pred_get_removal_module_expand_fn_symbol(pred);
            final SubLObject req_pattern = corba_removal_module_utilities.determine_corba_removal_module_required_pattern(pred);
            final SubLObject content_mt = sksi_sks_accessors.sks_get_content_mt(sks);
            inference_modules.inference_removal_module(name, (SubLObject)ConsesLow.list(new SubLObject[] { corba_module_utilities.$kw25$SENSE, corba_module_utilities.$kw26$POS, corba_module_utilities.$kw27$PREDICATE, pred, corba_module_utilities.$kw28$REQUIRED_PATTERN, req_pattern, corba_module_utilities.$kw29$COST_EXPRESSION, corba_module_utilities.FIVE_INTEGER, corba_module_utilities.$kw30$EXPAND, expand_fn, corba_module_utilities.$kw31$REQUIRED_MT, content_mt }));
            note_sksi_corba_module(name, content_mt);
            inference_modules.register_solely_specific_removal_module_predicate(pred);
            cdolist_list_var = cdolist_list_var.rest();
            pred = cdolist_list_var.first();
        }
        final SubLObject content_mt2 = sksi_sks_accessors.sks_get_content_mt(sks);
        hl_storage_modules.hl_storage_module((SubLObject)corba_module_utilities.$kw32$CORBA_H_P_A_C_K_S_CORBA_SET_OBJECT_METHOD_ARGS_STORAGE, (SubLObject)ConsesLow.list(new SubLObject[] { corba_module_utilities.$kw33$PRETTY_NAME, corba_module_utilities.$str34$__corbaSetObjectMethodArgs, corba_module_utilities.$kw35$ARGUMENT_TYPE, corba_module_utilities.$kw36$ARGUMENT, corba_module_utilities.$kw27$PREDICATE, corba_module_utilities.$const37$corbaSetObjectMethodArgs, corba_module_utilities.$kw38$APPLICABILITY, corba_module_utilities.$sym39$CORBA_SET_OBJECT_METHOD_ARGS_HL_STORAGE_MODULE_APPLICABLE_, corba_module_utilities.$kw40$INCOMPLETENESS, corba_module_utilities.$sym41$CORBA_SET_HL_STORAGE_MODULE_INCOMPLETENESS, corba_module_utilities.$kw42$ADD, corba_module_utilities.$sym43$CORBA_SET_HL_STORAGE_MODULE_ASSERT, corba_module_utilities.$kw31$REQUIRED_MT, content_mt2 }));
        hl_storage_modules.register_solely_specific_hl_storage_module_predicate(corba_module_utilities.$const37$corbaSetObjectMethodArgs);
        inference_modules.register_solely_specific_removal_module_predicate(corba_module_utilities.$const37$corbaSetObjectMethodArgs);
        note_sksi_corba_module((SubLObject)corba_module_utilities.$kw32$CORBA_H_P_A_C_K_S_CORBA_SET_OBJECT_METHOD_ARGS_STORAGE, content_mt2);
        hl_storage_modules.hl_storage_module((SubLObject)corba_module_utilities.$kw44$CORBA_H_P_A_C_K_S_CORBA_SET_OBJECT_FIELD_ARG_STORAGE, (SubLObject)ConsesLow.list(new SubLObject[] { corba_module_utilities.$kw33$PRETTY_NAME, corba_module_utilities.$str45$__corbaSetObjectFieldArg, corba_module_utilities.$kw35$ARGUMENT_TYPE, corba_module_utilities.$kw36$ARGUMENT, corba_module_utilities.$kw27$PREDICATE, corba_module_utilities.$const46$corbaSetObjectFieldArg, corba_module_utilities.$kw38$APPLICABILITY, corba_module_utilities.$sym47$CORBA_SET_OBJECT_FIELD_ARG_HL_STORAGE_MODULE_APPLICABLE_, corba_module_utilities.$kw40$INCOMPLETENESS, corba_module_utilities.$sym41$CORBA_SET_HL_STORAGE_MODULE_INCOMPLETENESS, corba_module_utilities.$kw42$ADD, corba_module_utilities.$sym43$CORBA_SET_HL_STORAGE_MODULE_ASSERT, corba_module_utilities.$kw31$REQUIRED_MT, content_mt2 }));
        hl_storage_modules.register_solely_specific_hl_storage_module_predicate(corba_module_utilities.$const46$corbaSetObjectFieldArg);
        inference_modules.register_solely_specific_removal_module_predicate(corba_module_utilities.$const37$corbaSetObjectMethodArgs);
        note_sksi_corba_module((SubLObject)corba_module_utilities.$kw44$CORBA_H_P_A_C_K_S_CORBA_SET_OBJECT_FIELD_ARG_STORAGE, content_mt2);
        hl_storage_modules.hl_storage_module((SubLObject)corba_module_utilities.$kw48$CORBA_H_P_A_C_K_S_CORBA_SET_CLASS_METHOD_ARGS_STORAGE, (SubLObject)ConsesLow.list(new SubLObject[] { corba_module_utilities.$kw33$PRETTY_NAME, corba_module_utilities.$str49$__corbaSetClassMethodArgs, corba_module_utilities.$kw35$ARGUMENT_TYPE, corba_module_utilities.$kw36$ARGUMENT, corba_module_utilities.$kw27$PREDICATE, corba_module_utilities.$const50$corbaSetClassMethodArgs, corba_module_utilities.$kw38$APPLICABILITY, corba_module_utilities.$sym51$CORBA_SET_CLASS_METHOD_ARGS_HL_STORAGE_MODULE_APPLICABLE_, corba_module_utilities.$kw40$INCOMPLETENESS, corba_module_utilities.$sym41$CORBA_SET_HL_STORAGE_MODULE_INCOMPLETENESS, corba_module_utilities.$kw42$ADD, corba_module_utilities.$sym43$CORBA_SET_HL_STORAGE_MODULE_ASSERT, corba_module_utilities.$kw31$REQUIRED_MT, content_mt2 }));
        hl_storage_modules.register_solely_specific_hl_storage_module_predicate(corba_module_utilities.$const50$corbaSetClassMethodArgs);
        inference_modules.register_solely_specific_removal_module_predicate(corba_module_utilities.$const37$corbaSetObjectMethodArgs);
        note_sksi_corba_module((SubLObject)corba_module_utilities.$kw48$CORBA_H_P_A_C_K_S_CORBA_SET_CLASS_METHOD_ARGS_STORAGE, content_mt2);
        hl_storage_modules.hl_storage_module((SubLObject)corba_module_utilities.$kw52$CORBA_H_P_A_C_K_S_CORBA_SET_CLASS_FIELD_ARG_STORAGE, (SubLObject)ConsesLow.list(new SubLObject[] { corba_module_utilities.$kw33$PRETTY_NAME, corba_module_utilities.$str53$__corbaSetClassFieldArg, corba_module_utilities.$kw35$ARGUMENT_TYPE, corba_module_utilities.$kw36$ARGUMENT, corba_module_utilities.$kw27$PREDICATE, corba_module_utilities.$const54$corbaSetClassFieldArg, corba_module_utilities.$kw38$APPLICABILITY, corba_module_utilities.$sym55$CORBA_SET_CLASS_FIELD_ARG_HL_STORAGE_MODULE_APPLICABLE_, corba_module_utilities.$kw40$INCOMPLETENESS, corba_module_utilities.$sym41$CORBA_SET_HL_STORAGE_MODULE_INCOMPLETENESS, corba_module_utilities.$kw42$ADD, corba_module_utilities.$sym43$CORBA_SET_HL_STORAGE_MODULE_ASSERT, corba_module_utilities.$kw31$REQUIRED_MT, content_mt2 }));
        hl_storage_modules.register_solely_specific_hl_storage_module_predicate(corba_module_utilities.$const54$corbaSetClassFieldArg);
        inference_modules.register_solely_specific_removal_module_predicate(corba_module_utilities.$const37$corbaSetObjectMethodArgs);
        note_sksi_corba_module((SubLObject)corba_module_utilities.$kw52$CORBA_H_P_A_C_K_S_CORBA_SET_CLASS_FIELD_ARG_STORAGE, content_mt2);
        return (SubLObject)corba_module_utilities.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/sksi/corba/corba-module-utilities.lisp", position = 6438L)
    public static SubLObject corba_sks_undeclare_module_suites(final SubLObject sks) {
        SubLObject cdolist_list_var = corba_utilities.get_corba_removal_predicates();
        SubLObject pred = (SubLObject)corba_module_utilities.NIL;
        pred = cdolist_list_var.first();
        while (corba_module_utilities.NIL != cdolist_list_var) {
            final SubLObject name = make_corba_module_name_keyword(sks, pred, (SubLObject)corba_module_utilities.UNPROVIDED);
            inference_modules.undeclare_inference_removal_module(name, (SubLObject)corba_module_utilities.NIL);
            un_note_sksi_corba_module(name);
            cdolist_list_var = cdolist_list_var.rest();
            pred = cdolist_list_var.first();
        }
        cdolist_list_var = corba_utilities.get_corba_storage_predicates();
        pred = (SubLObject)corba_module_utilities.NIL;
        pred = cdolist_list_var.first();
        while (corba_module_utilities.NIL != cdolist_list_var) {
            final SubLObject name = make_corba_module_name_keyword(sks, pred, (SubLObject)corba_module_utilities.UNPROVIDED);
            hl_storage_modules.undeclare_hl_storage_module(name);
            un_note_sksi_corba_module(name);
            cdolist_list_var = cdolist_list_var.rest();
            pred = cdolist_list_var.first();
        }
        inference_modules.reclassify_removal_modules();
        return (SubLObject)corba_module_utilities.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/sksi/corba/corba-module-utilities.lisp", position = 6639L)
    public static SubLObject register_all_sksi_corba_modules() {
        return (SubLObject)corba_module_utilities.ZERO_INTEGER;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/sksi/corba/corba-module-utilities.lisp", position = 6720L)
    public static SubLObject deregister_sksi_corba_modules_for_sks(final SubLObject sks, SubLObject mapping_mt, SubLObject reclassifyP) {
        if (mapping_mt == corba_module_utilities.UNPROVIDED) {
            mapping_mt = (SubLObject)corba_module_utilities.NIL;
        }
        if (reclassifyP == corba_module_utilities.UNPROVIDED) {
            reclassifyP = (SubLObject)corba_module_utilities.T;
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject count = (SubLObject)corba_module_utilities.ZERO_INTEGER;
        if (corba_module_utilities.NIL == mapping_mt) {
            mapping_mt = sksi_kb_accessors.sk_source_mapping_mt(sks);
        }
        final SubLObject mt_var = mapping_mt;
        final SubLObject _prev_bind_0 = mt_relevance_macros.$relevant_mt_function$.currentBinding(thread);
        final SubLObject _prev_bind_2 = mt_relevance_macros.$mt$.currentBinding(thread);
        try {
            mt_relevance_macros.$relevant_mt_function$.bind(mt_relevance_macros.possibly_in_mt_determine_function(mt_var), thread);
            mt_relevance_macros.$mt$.bind(mt_relevance_macros.possibly_in_mt_determine_mt(mt_var), thread);
            SubLObject cdolist_list_var;
            final SubLObject sub_ks_closure = cdolist_list_var = sksi_kb_accessors.sk_source_sub_ks_closure(sks);
            SubLObject ks = (SubLObject)corba_module_utilities.NIL;
            ks = cdolist_list_var.first();
            while (corba_module_utilities.NIL != cdolist_list_var) {
                count = Numbers.add(count, deregister_sksi_corba_modules_for_just_sks(ks, (SubLObject)corba_module_utilities.NIL));
                cdolist_list_var = cdolist_list_var.rest();
                ks = cdolist_list_var.first();
            }
        }
        finally {
            mt_relevance_macros.$mt$.rebind(_prev_bind_2, thread);
            mt_relevance_macros.$relevant_mt_function$.rebind(_prev_bind_0, thread);
        }
        if (corba_module_utilities.NIL != reclassifyP) {
            inference_modules.reclassify_removal_modules();
        }
        return count;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/sksi/corba/corba-module-utilities.lisp", position = 7189L)
    public static SubLObject deregister_sksi_corba_modules_for_just_sks(final SubLObject sks, SubLObject reclassifyP) {
        if (reclassifyP == corba_module_utilities.UNPROVIDED) {
            reclassifyP = (SubLObject)corba_module_utilities.T;
        }
        SubLObject count = (SubLObject)corba_module_utilities.ZERO_INTEGER;
        if (sksi_sks_accessors.sks_get_type(sks).eql(corba_module_utilities.$const24$CommonObjectRequestBrokerArchitec)) {
            SubLObject cdolist_list_var = corba_utilities.get_corba_removal_predicates();
            SubLObject pred = (SubLObject)corba_module_utilities.NIL;
            pred = cdolist_list_var.first();
            while (corba_module_utilities.NIL != cdolist_list_var) {
                final SubLObject name = make_corba_module_name_keyword(sks, pred, (SubLObject)corba_module_utilities.UNPROVIDED);
                inference_modules.undeclare_inference_removal_module(name, (SubLObject)corba_module_utilities.NIL);
                un_note_sksi_corba_module(name);
                cdolist_list_var = cdolist_list_var.rest();
                pred = cdolist_list_var.first();
            }
            count = Numbers.add(count, Sequences.length(corba_utilities.get_corba_removal_predicates()));
            cdolist_list_var = corba_utilities.get_corba_storage_predicates();
            pred = (SubLObject)corba_module_utilities.NIL;
            pred = cdolist_list_var.first();
            while (corba_module_utilities.NIL != cdolist_list_var) {
                final SubLObject name = make_corba_module_name_keyword(sks, pred, (SubLObject)corba_module_utilities.UNPROVIDED);
                hl_storage_modules.undeclare_hl_storage_module(name);
                un_note_sksi_corba_module(name);
                cdolist_list_var = cdolist_list_var.rest();
                pred = cdolist_list_var.first();
            }
            count = Numbers.add(count, Sequences.length(corba_utilities.get_corba_storage_predicates()));
            if (corba_module_utilities.NIL != reclassifyP) {
                inference_modules.reclassify_removal_modules();
            }
        }
        corba_utilities.clear_corba_caches();
        return count;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/sksi/corba/corba-module-utilities.lisp", position = 7702L)
    public static SubLObject deregister_all_sksi_corba_modules() {
        return (SubLObject)corba_module_utilities.ZERO_INTEGER;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/sksi/corba/corba-module-utilities.lisp", position = 7785L)
    public static SubLObject corba_predicate_returns_valueP(final SubLObject corba_predicate) {
        assert corba_module_utilities.NIL != corba_utilities.corba_predicate_p(corba_predicate) : corba_predicate;
        if (corba_module_utilities.NIL != genls.any_genlP(corba_module_utilities.$const56$SubLListOrAtom, kb_accessors.arg1_isa(corba_predicate, corba_module_utilities.$const57$CORBAMappingVocabularyMt), (SubLObject)corba_module_utilities.UNPROVIDED, (SubLObject)corba_module_utilities.UNPROVIDED)) {
            return (SubLObject)corba_module_utilities.T;
        }
        return (SubLObject)corba_module_utilities.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/sksi/corba/corba-module-utilities.lisp", position = 8108L)
    public static SubLObject corba_predicate_returns_objectP(final SubLObject corba_predicate) {
        assert corba_module_utilities.NIL != corba_utilities.corba_predicate_p(corba_predicate) : corba_predicate;
        if (corba_module_utilities.NIL != genls.any_genlP(corba_module_utilities.$const58$CycLClosedDenotationalTerm, kb_accessors.arg1_isa(corba_predicate, corba_module_utilities.$const57$CORBAMappingVocabularyMt), (SubLObject)corba_module_utilities.UNPROVIDED, (SubLObject)corba_module_utilities.UNPROVIDED)) {
            return (SubLObject)corba_module_utilities.T;
        }
        return (SubLObject)corba_module_utilities.NIL;
    }
    
    public static SubLObject declare_corba_module_utilities_file() {
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.sksi.corba.corba_module_utilities", "add_corba_connection_by_sks", "ADD-CORBA-CONNECTION-BY-SKS", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.sksi.corba.corba_module_utilities", "rem_corba_connection_by_sks", "REM-CORBA-CONNECTION-BY-SKS", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.sksi.corba.corba_module_utilities", "get_corba_connection_by_sks", "GET-CORBA-CONNECTION-BY-SKS", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.sksi.corba.corba_module_utilities", "new_corba_connection_by_sks", "NEW-CORBA-CONNECTION-BY-SKS", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.sksi.corba.corba_module_utilities", "find_or_create_corba_connection_by_sks", "FIND-OR-CREATE-CORBA-CONNECTION-BY-SKS", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.sksi.corba.corba_module_utilities", "make_corba_module_name_keyword", "MAKE-CORBA-MODULE-NAME-KEYWORD", 2, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.sksi.corba.corba_module_utilities", "make_corba_gateway_keyword", "MAKE-CORBA-GATEWAY-KEYWORD", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.sksi.corba.corba_module_utilities", "corba_make_string", "CORBA-MAKE-STRING", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.sksi.corba.corba_module_utilities", "corba_make_keyword", "CORBA-MAKE-KEYWORD", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.sksi.corba.corba_module_utilities", "corba_make_symbol", "CORBA-MAKE-SYMBOL", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.sksi.corba.corba_module_utilities", "note_sksi_corba_module", "NOTE-SKSI-CORBA-MODULE", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.sksi.corba.corba_module_utilities", "un_note_sksi_corba_module", "UN-NOTE-SKSI-CORBA-MODULE", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.sksi.corba.corba_module_utilities", "clear_sksi_corba_modules", "CLEAR-SKSI-CORBA-MODULES", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.sksi.corba.corba_module_utilities", "look_up_sksi_corba_module", "LOOK-UP-SKSI-CORBA-MODULE", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.sksi.corba.corba_module_utilities", "sksi_corba_modules_count", "SKSI-CORBA-MODULES-COUNT", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.sksi.corba.corba_module_utilities", "some_sksi_corba_removal_module_registeredP", "SOME-SKSI-CORBA-REMOVAL-MODULE-REGISTERED?", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.sksi.corba.corba_module_utilities", "register_sksi_corba_modules_for_sks", "REGISTER-SKSI-CORBA-MODULES-FOR-SKS", 1, 2, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.sksi.corba.corba_module_utilities", "register_sksi_corba_modules_for_just_sks", "REGISTER-SKSI-CORBA-MODULES-FOR-JUST-SKS", 1, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.sksi.corba.corba_module_utilities", "corba_sks_declare_module_suites", "CORBA-SKS-DECLARE-MODULE-SUITES", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.sksi.corba.corba_module_utilities", "corba_sks_undeclare_module_suites", "CORBA-SKS-UNDECLARE-MODULE-SUITES", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.sksi.corba.corba_module_utilities", "register_all_sksi_corba_modules", "REGISTER-ALL-SKSI-CORBA-MODULES", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.sksi.corba.corba_module_utilities", "deregister_sksi_corba_modules_for_sks", "DEREGISTER-SKSI-CORBA-MODULES-FOR-SKS", 1, 2, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.sksi.corba.corba_module_utilities", "deregister_sksi_corba_modules_for_just_sks", "DEREGISTER-SKSI-CORBA-MODULES-FOR-JUST-SKS", 1, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.sksi.corba.corba_module_utilities", "deregister_all_sksi_corba_modules", "DEREGISTER-ALL-SKSI-CORBA-MODULES", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.sksi.corba.corba_module_utilities", "corba_predicate_returns_valueP", "CORBA-PREDICATE-RETURNS-VALUE?", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.sksi.corba.corba_module_utilities", "corba_predicate_returns_objectP", "CORBA-PREDICATE-RETURNS-OBJECT?", 1, 0, false);
        return (SubLObject)corba_module_utilities.NIL;
    }
    
    public static SubLObject init_corba_module_utilities_file() {
        corba_module_utilities.$corba_connections_by_sks$ = SubLFiles.deflexical("*CORBA-CONNECTIONS-BY-SKS*", (SubLObject)corba_module_utilities.NIL);
        corba_module_utilities.$sksi_corba_modules$ = SubLFiles.deflexical("*SKSI-CORBA-MODULES*", maybeDefault((SubLObject)corba_module_utilities.$sym23$_SKSI_CORBA_MODULES_, corba_module_utilities.$sksi_corba_modules$, ()->(dictionary.new_dictionary(Symbols.symbol_function((SubLObject)corba_module_utilities.EQUAL), (SubLObject)corba_module_utilities.UNPROVIDED))));
        return (SubLObject)corba_module_utilities.NIL;
    }
    
    public static SubLObject setup_corba_module_utilities_file() {
        subl_macro_promotions.declare_defglobal((SubLObject)corba_module_utilities.$sym23$_SKSI_CORBA_MODULES_);
        return (SubLObject)corba_module_utilities.NIL;
    }
    
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
    
    static {
        me = (SubLFile)new corba_module_utilities();
        corba_module_utilities.$corba_connections_by_sks$ = null;
        corba_module_utilities.$sksi_corba_modules$ = null;
        $sym0$CORBA_CONNECTION_P = SubLObjectFactory.makeSymbol("CORBA-CONNECTION-P");
        $sym1$SKS_P = SubLObjectFactory.makeSymbol("SKS-P");
        $const2$sksProxyHost = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("sksProxyHost"));
        $const3$sksProxyPort = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("sksProxyPort"));
        $const4$corbaSKSInitialORBHost = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("corbaSKSInitialORBHost"));
        $const5$corbaSKSInitialORBPort = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("corbaSKSInitialORBPort"));
        $const6$corbaSKSServiceName = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("corbaSKSServiceName"));
        $const7$corbaSKSInitialObjectClass = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("corbaSKSInitialObjectClass"));
        $str8$Helper = SubLObjectFactory.makeString("Helper");
        $kw9$PROXY_HOST = SubLObjectFactory.makeKeyword("PROXY-HOST");
        $kw10$PROXY_PORT = SubLObjectFactory.makeKeyword("PROXY-PORT");
        $kw11$INITIAL_ORB_HOST = SubLObjectFactory.makeKeyword("INITIAL-ORB-HOST");
        $kw12$INITIAL_ORB_PORT = SubLObjectFactory.makeKeyword("INITIAL-ORB-PORT");
        $kw13$SERVICE_NAME = SubLObjectFactory.makeKeyword("SERVICE-NAME");
        $kw14$INITIAL_OBJECT_CLASS = SubLObjectFactory.makeKeyword("INITIAL-OBJECT-CLASS");
        $kw15$INITIAL_OBJECT_CLASS_HELPER = SubLObjectFactory.makeKeyword("INITIAL-OBJECT-CLASS-HELPER");
        $str16$removal = SubLObjectFactory.makeString("removal");
        $sym17$CORBA_PREDICATE_P = SubLObjectFactory.makeSymbol("CORBA-PREDICATE-P");
        $str18$corba = SubLObjectFactory.makeString("corba");
        $str19$_ = SubLObjectFactory.makeString("-");
        $sym20$KEYWORDP = SubLObjectFactory.makeSymbol("KEYWORDP");
        $sym21$STRING_FROM_KEYWORD = SubLObjectFactory.makeSymbol("STRING-FROM-KEYWORD");
        $sym22$CCONCATENATE = SubLObjectFactory.makeSymbol("CCONCATENATE");
        $sym23$_SKSI_CORBA_MODULES_ = SubLObjectFactory.makeSymbol("*SKSI-CORBA-MODULES*");
        $const24$CommonObjectRequestBrokerArchitec = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("CommonObjectRequestBrokerArchitecture"));
        $kw25$SENSE = SubLObjectFactory.makeKeyword("SENSE");
        $kw26$POS = SubLObjectFactory.makeKeyword("POS");
        $kw27$PREDICATE = SubLObjectFactory.makeKeyword("PREDICATE");
        $kw28$REQUIRED_PATTERN = SubLObjectFactory.makeKeyword("REQUIRED-PATTERN");
        $kw29$COST_EXPRESSION = SubLObjectFactory.makeKeyword("COST-EXPRESSION");
        $kw30$EXPAND = SubLObjectFactory.makeKeyword("EXPAND");
        $kw31$REQUIRED_MT = SubLObjectFactory.makeKeyword("REQUIRED-MT");
        $kw32$CORBA_H_P_A_C_K_S_CORBA_SET_OBJECT_METHOD_ARGS_STORAGE = SubLObjectFactory.makeKeyword("CORBA-H-P-A-C-K-S-CORBA-SET-OBJECT-METHOD-ARGS-STORAGE");
        $kw33$PRETTY_NAME = SubLObjectFactory.makeKeyword("PRETTY-NAME");
        $str34$__corbaSetObjectMethodArgs = SubLObjectFactory.makeString("#$corbaSetObjectMethodArgs");
        $kw35$ARGUMENT_TYPE = SubLObjectFactory.makeKeyword("ARGUMENT-TYPE");
        $kw36$ARGUMENT = SubLObjectFactory.makeKeyword("ARGUMENT");
        $const37$corbaSetObjectMethodArgs = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("corbaSetObjectMethodArgs"));
        $kw38$APPLICABILITY = SubLObjectFactory.makeKeyword("APPLICABILITY");
        $sym39$CORBA_SET_OBJECT_METHOD_ARGS_HL_STORAGE_MODULE_APPLICABLE_ = SubLObjectFactory.makeSymbol("CORBA-SET-OBJECT-METHOD-ARGS-HL-STORAGE-MODULE-APPLICABLE?");
        $kw40$INCOMPLETENESS = SubLObjectFactory.makeKeyword("INCOMPLETENESS");
        $sym41$CORBA_SET_HL_STORAGE_MODULE_INCOMPLETENESS = SubLObjectFactory.makeSymbol("CORBA-SET-HL-STORAGE-MODULE-INCOMPLETENESS");
        $kw42$ADD = SubLObjectFactory.makeKeyword("ADD");
        $sym43$CORBA_SET_HL_STORAGE_MODULE_ASSERT = SubLObjectFactory.makeSymbol("CORBA-SET-HL-STORAGE-MODULE-ASSERT");
        $kw44$CORBA_H_P_A_C_K_S_CORBA_SET_OBJECT_FIELD_ARG_STORAGE = SubLObjectFactory.makeKeyword("CORBA-H-P-A-C-K-S-CORBA-SET-OBJECT-FIELD-ARG-STORAGE");
        $str45$__corbaSetObjectFieldArg = SubLObjectFactory.makeString("#$corbaSetObjectFieldArg");
        $const46$corbaSetObjectFieldArg = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("corbaSetObjectFieldArg"));
        $sym47$CORBA_SET_OBJECT_FIELD_ARG_HL_STORAGE_MODULE_APPLICABLE_ = SubLObjectFactory.makeSymbol("CORBA-SET-OBJECT-FIELD-ARG-HL-STORAGE-MODULE-APPLICABLE?");
        $kw48$CORBA_H_P_A_C_K_S_CORBA_SET_CLASS_METHOD_ARGS_STORAGE = SubLObjectFactory.makeKeyword("CORBA-H-P-A-C-K-S-CORBA-SET-CLASS-METHOD-ARGS-STORAGE");
        $str49$__corbaSetClassMethodArgs = SubLObjectFactory.makeString("#$corbaSetClassMethodArgs");
        $const50$corbaSetClassMethodArgs = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("corbaSetClassMethodArgs"));
        $sym51$CORBA_SET_CLASS_METHOD_ARGS_HL_STORAGE_MODULE_APPLICABLE_ = SubLObjectFactory.makeSymbol("CORBA-SET-CLASS-METHOD-ARGS-HL-STORAGE-MODULE-APPLICABLE?");
        $kw52$CORBA_H_P_A_C_K_S_CORBA_SET_CLASS_FIELD_ARG_STORAGE = SubLObjectFactory.makeKeyword("CORBA-H-P-A-C-K-S-CORBA-SET-CLASS-FIELD-ARG-STORAGE");
        $str53$__corbaSetClassFieldArg = SubLObjectFactory.makeString("#$corbaSetClassFieldArg");
        $const54$corbaSetClassFieldArg = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("corbaSetClassFieldArg"));
        $sym55$CORBA_SET_CLASS_FIELD_ARG_HL_STORAGE_MODULE_APPLICABLE_ = SubLObjectFactory.makeSymbol("CORBA-SET-CLASS-FIELD-ARG-HL-STORAGE-MODULE-APPLICABLE?");
        $const56$SubLListOrAtom = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("SubLListOrAtom"));
        $const57$CORBAMappingVocabularyMt = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("CORBAMappingVocabularyMt"));
        $const58$CycLClosedDenotationalTerm = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("CycLClosedDenotationalTerm"));
    }
}

/*

	Total time: 105 ms
	
*/