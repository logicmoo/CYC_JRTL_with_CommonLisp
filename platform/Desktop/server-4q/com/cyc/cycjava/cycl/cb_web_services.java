package com.cyc.cycjava.cycl;

import com.cyc.tool.subl.util.SubLFiles;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Equality;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.streams_high;
import com.cyc.cycjava.cycl.inference.ask_utilities;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Dynamic;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.*;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.SubLThread;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Values;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Threads;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Numbers;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLProcess;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLList;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObject;
import com.cyc.tool.subl.jrtl.nativeCode.type.symbol.SubLSymbol;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLString;
import com.cyc.tool.subl.util.SubLFile;
import com.cyc.tool.subl.util.SubLTranslatedFile;

public final class cb_web_services extends SubLTranslatedFile
{
    public static final SubLFile me;
    public static final String myName = "com.cyc.cycjava.cycl.cb_web_services";
    public static final String myFingerPrint = "88dcc4d675c94f7a0801793c64857832772785ab2bcd5a70ad60706f7bc6f426";
    private static final SubLString $str0$createType;
    private static final SubLString $str1$name;
    private static final SubLString $str2$;
    private static final SubLString $str3$spec_pred;
    private static final SubLSymbol $kw4$DOWNCASE;
    private static final SubLSymbol $kw5$UPCASE;
    private static final SubLString $str6$baseType;
    private static final SubLObject $const7$EnglishMt;
    private static final SubLString $str8$instance;
    private static final SubLObject $const9$isa;
    private static final SubLString $str10$spec;
    private static final SubLList $list11;
    private static final SubLObject $const12$genls;
    private static final SubLString $str13$spec_mt;
    private static final SubLList $list14;
    private static final SubLObject $const15$UniversalVocabularyMt;
    private static final SubLObject $const16$genlMt;
    private static final SubLString $str17$concept;
    private static final SubLString $str18$externalId;
    private static final SubLString $str19$url;
    private static final SubLSymbol $kw20$UNINITIALIZED;
    private static final SubLSymbol $sym21$XML_TERM_CREATE;
    private static final SubLSymbol $kw22$XML_HANDLER;
    private static final SubLList $list23;
    private static final SubLObject $const24$genlPreds;
    private static final SubLObject $const25$argIsa;
    private static final SubLSymbol $kw26$GAF;
    private static final SubLSymbol $sym27$_X;
    private static final SubLObject $const28$and;
    private static final SubLList $list29;
    private static final SubLList $list30;
    private static final SubLObject $const31$AtemporalNecessarilyEssentialColl;
    private static final SubLSymbol $sym32$_MT;
    private static final SubLObject $const33$defaultDefiningMtForInstances;
    private static final SubLList $list34;
    private static final SubLObject $const35$BaseKB;
    private static final SubLObject $const36$defaultDefiningMtForSpecs;
    private static final SubLString $str37$assert;
    private static final SubLString $str38$add;
    private static final SubLString $str39$action;
    private static final SubLObject $const40$genStringAssertion;
    private static final SubLSymbol $sym41$XML_SET_GENSTRING_ASSERTION;
    private static final SubLString $str42$strength;
    private static final SubLList $list43;
    private static final SubLSymbol $kw44$DEFAULT;
    private static final SubLObject $const45$strengthOfLexicalMapping;
    private static final SubLSymbol $sym46$XML_SET_LEXICAL_MAPPING_STRENGTH;
    private static final SubLSymbol $sym47$RELEVANT_MT_IS_EVERYTHING;
    private static final SubLObject $const48$EverythingPSC;
    private static final SubLString $str49$term;
    private static final SubLString $str50$bookmarked;
    private static final SubLString $str51$result;
    private static final SubLString $str52$newClass;
    private static final SubLString $str53$title;
    private static final SubLSymbol $sym54$XML_SET_BOOKMARK;
    private static final SubLObject $const55$cyclistReadilyAvailableTerms;
    private static final SubLObject $const56$MtSpace;
    private static final SubLObject $const57$CyclistsMt;
    private static final SubLObject $const58$MtTimeWithGranularityDimFn;
    private static final SubLObject $const59$TimeIntervalInclusiveFn;
    private static final SubLList $list60;
    private static final SubLList $list61;
    private static final SubLSymbol $sym62$_ASSERT;
    private static final SubLObject $const63$assertionSentence;
    private static final SubLList $list64;
    private static final SubLObject $const65$InferencePSC;
    private static final SubLList $list66;
    private static final SubLSymbol $sym67$_INT;
    private static final SubLObject $const68$thereExists;
    private static final SubLSymbol $sym69$_WHEN;
    private static final SubLList $list70;
    private static final SubLObject $const71$equals;
    private static final SubLObject $const72$TemporalIntersectionFn;
    private static final SubLList $list73;
    private static final SubLList $list74;
    private static final SubLSymbol $sym75$_EXIT;
    private static final SubLList $list76;
    
    @SubLTranslatedFile.SubL(source = "cycl/cb-web-services.lisp", position = 926L)
    public static SubLObject xml_term_create(final SubLObject args) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject create_type = html_utilities.html_extract_input((SubLObject)cb_web_services.$str0$createType, args);
        final SubLObject user_sugg_name = html_utilities.html_extract_input((SubLObject)cb_web_services.$str1$name, args);
        final SubLObject const_name = constants_high.suggest_constant_name(user_sugg_name, (SubLObject)cb_web_services.$str2$, (SubLObject)cb_web_services.$str2$, (SubLObject)(create_type.equalp((SubLObject)cb_web_services.$str3$spec_pred) ? cb_web_services.$kw4$DOWNCASE : cb_web_services.$kw5$UPCASE), (SubLObject)cb_web_services.UNPROVIDED, (SubLObject)cb_web_services.UNPROVIDED);
        final SubLObject new_term = ke.ke_create_now(const_name, (SubLObject)cb_web_services.UNPROVIDED);
        final SubLObject base_type = kb_utilities.find_object_by_compact_hl_external_id_string(html_utilities.html_extract_input((SubLObject)cb_web_services.$str6$baseType, args));
        final SubLObject mt = get_defining_mt_for_type(create_type, base_type);
        final SubLObject lexical_mt = cb_web_services.$const7$EnglishMt;
        if (create_type.equalp((SubLObject)cb_web_services.$str8$instance)) {
            ke.ke_assert((SubLObject)ConsesLow.list(cb_web_services.$const9$isa, new_term, base_type), mt, (SubLObject)cb_web_services.UNPROVIDED, (SubLObject)cb_web_services.UNPROVIDED);
        }
        else if (create_type.equalp((SubLObject)cb_web_services.$str10$spec)) {
            ke.ke_assert((SubLObject)ConsesLow.listS(cb_web_services.$const9$isa, new_term, (SubLObject)cb_web_services.$list11), mt, (SubLObject)cb_web_services.UNPROVIDED, (SubLObject)cb_web_services.UNPROVIDED);
            rkf_assertion_utilities.rkf_assert_with_implicature((SubLObject)ConsesLow.list(cb_web_services.$const12$genls, new_term, base_type), mt, (SubLObject)cb_web_services.T);
        }
        else if (create_type.equalp((SubLObject)cb_web_services.$str13$spec_mt)) {
            ke.ke_assert((SubLObject)ConsesLow.listS(cb_web_services.$const9$isa, new_term, (SubLObject)cb_web_services.$list14), cb_web_services.$const15$UniversalVocabularyMt, (SubLObject)cb_web_services.UNPROVIDED, (SubLObject)cb_web_services.UNPROVIDED);
            ke.ke_assert((SubLObject)ConsesLow.list(cb_web_services.$const16$genlMt, new_term, base_type), cb_web_services.$const15$UniversalVocabularyMt, (SubLObject)cb_web_services.UNPROVIDED, (SubLObject)cb_web_services.UNPROVIDED);
        }
        else if (create_type.equalp((SubLObject)cb_web_services.$str3$spec_pred)) {
            create_spec_pred(base_type, new_term);
        }
        SubLObject cdolist_list_var = auto_lexifier.auto_lexify(user_sugg_name, new_term, lexical_mt, mt);
        SubLObject lexical_formula = (SubLObject)cb_web_services.NIL;
        lexical_formula = cdolist_list_var.first();
        while (cb_web_services.NIL != cdolist_list_var) {
            ke.ke_assert(lexical_formula, lexical_mt, (SubLObject)cb_web_services.UNPROVIDED, (SubLObject)cb_web_services.UNPROVIDED);
            cdolist_list_var = cdolist_list_var.rest();
            lexical_formula = cdolist_list_var.first();
        }
        final SubLObject _prev_bind_0 = xml_vars.$xml_stream$.currentBinding(thread);
        try {
            xml_vars.$xml_stream$.bind(html_macros.$html_stream$.getDynamicValue(thread), thread);
            try {
                final SubLObject _prev_bind_0_$1 = xml_utilities.$xml_indentation_level$.currentBinding(thread);
                final SubLObject _prev_bind_2 = xml_utilities.$cycml_indent_level$.currentBinding(thread);
                try {
                    xml_utilities.$xml_indentation_level$.bind(Numbers.add(xml_utilities.$xml_indentation_amount$.getDynamicValue(thread), xml_utilities.$xml_indentation_level$.getDynamicValue(thread)), thread);
                    xml_utilities.$cycml_indent_level$.bind(xml_utilities.$xml_indentation_level$.getDynamicValue(thread), thread);
                    xml_utilities.xml_start_tag_internal((SubLObject)cb_web_services.$str17$concept, (SubLObject)ConsesLow.list((SubLObject)cb_web_services.$str18$externalId, kb_utilities.compact_hl_external_id_string(new_term), (SubLObject)cb_web_services.$str19$url, url_encoded_cb_form(new_term)), (SubLObject)cb_web_services.NIL, (SubLObject)cb_web_services.NIL, (SubLObject)cb_web_services.$kw20$UNINITIALIZED);
                    final SubLObject _prev_bind_0_$2 = xml_vars.$xml_default_namespace$.currentBinding(thread);
                    try {
                        xml_vars.$xml_default_namespace$.bind((SubLObject)cb_web_services.$kw20$UNINITIALIZED, thread);
                    }
                    finally {
                        xml_vars.$xml_default_namespace$.rebind(_prev_bind_0_$2, thread);
                    }
                }
                finally {
                    xml_utilities.$cycml_indent_level$.rebind(_prev_bind_2, thread);
                    xml_utilities.$xml_indentation_level$.rebind(_prev_bind_0_$1, thread);
                }
            }
            finally {
                final SubLObject _prev_bind_0_$3 = Threads.$is_thread_performing_cleanupP$.currentBinding(thread);
                try {
                    Threads.$is_thread_performing_cleanupP$.bind((SubLObject)cb_web_services.T, thread);
                    final SubLObject _values = Values.getValuesAsVector();
                    xml_utilities.xml_terpri();
                    xml_utilities.xml_end_tag_internal((SubLObject)cb_web_services.$str17$concept);
                    Values.restoreValuesFromVector(_values);
                }
                finally {
                    Threads.$is_thread_performing_cleanupP$.rebind(_prev_bind_0_$3, thread);
                }
            }
        }
        finally {
            xml_vars.$xml_stream$.rebind(_prev_bind_0, thread);
        }
        cb_tools.cb_add_to_constant_history(new_term);
        return (SubLObject)cb_web_services.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/cb-web-services.lisp", position = 2529L)
    public static SubLObject create_spec_pred(final SubLObject genl_pred, final SubLObject spec_pred) {
        ke.ke_assert((SubLObject)ConsesLow.listS(cb_web_services.$const9$isa, spec_pred, (SubLObject)cb_web_services.$list23), cb_web_services.$const15$UniversalVocabularyMt, (SubLObject)cb_web_services.UNPROVIDED, (SubLObject)cb_web_services.UNPROVIDED);
        rkf_assertion_utilities.rkf_assert_with_implicature((SubLObject)ConsesLow.list(cb_web_services.$const24$genlPreds, spec_pred, genl_pred), cb_web_services.$const15$UniversalVocabularyMt, (SubLObject)cb_web_services.UNPROVIDED);
        final SubLObject pred_var = cb_web_services.$const25$argIsa;
        if (cb_web_services.NIL != kb_mapping_macros.do_gaf_arg_index_key_validator(genl_pred, (SubLObject)cb_web_services.NIL, pred_var)) {
            final SubLObject iterator_var = kb_mapping_macros.new_gaf_arg_final_index_spec_iterator(genl_pred, (SubLObject)cb_web_services.NIL, pred_var);
            SubLObject done_var = (SubLObject)cb_web_services.NIL;
            final SubLObject token_var = (SubLObject)cb_web_services.NIL;
            while (cb_web_services.NIL == done_var) {
                final SubLObject final_index_spec = iteration.iteration_next_without_values_macro_helper(iterator_var, token_var);
                final SubLObject valid = (SubLObject)SubLObjectFactory.makeBoolean(!token_var.eql(final_index_spec));
                if (cb_web_services.NIL != valid) {
                    SubLObject final_index_iterator = (SubLObject)cb_web_services.NIL;
                    try {
                        final_index_iterator = kb_mapping_macros.new_final_index_iterator(final_index_spec, (SubLObject)cb_web_services.$kw26$GAF, (SubLObject)cb_web_services.NIL, (SubLObject)cb_web_services.NIL);
                        SubLObject done_var_$4 = (SubLObject)cb_web_services.NIL;
                        final SubLObject token_var_$5 = (SubLObject)cb_web_services.NIL;
                        while (cb_web_services.NIL == done_var_$4) {
                            final SubLObject v_assert = iteration.iteration_next_without_values_macro_helper(final_index_iterator, token_var_$5);
                            final SubLObject valid_$6 = (SubLObject)SubLObjectFactory.makeBoolean(!token_var_$5.eql(v_assert));
                            if (cb_web_services.NIL != valid_$6) {
                                ke.ke_assert(cycl_utilities.formula_subst(spec_pred, genl_pred, uncanonicalizer.assertion_el_formula(v_assert), (SubLObject)cb_web_services.UNPROVIDED, (SubLObject)cb_web_services.UNPROVIDED), assertions_high.assertion_mt(v_assert), (SubLObject)cb_web_services.UNPROVIDED, (SubLObject)cb_web_services.UNPROVIDED);
                            }
                            done_var_$4 = (SubLObject)SubLObjectFactory.makeBoolean(cb_web_services.NIL == valid_$6);
                        }
                    }
                    finally {
                        final SubLObject _prev_bind_0 = Dynamic.currentBinding(Threads.$is_thread_performing_cleanupP$);
                        try {
                            Dynamic.bind(Threads.$is_thread_performing_cleanupP$, (SubLObject)cb_web_services.T);
                            final SubLObject _values = Values.getValuesAsVector();
                            if (cb_web_services.NIL != final_index_iterator) {
                                kb_mapping_macros.destroy_final_index_iterator(final_index_iterator);
                            }
                            Values.restoreValuesFromVector(_values);
                        }
                        finally {
                            Dynamic.rebind(Threads.$is_thread_performing_cleanupP$, _prev_bind_0);
                        }
                    }
                }
                done_var = (SubLObject)SubLObjectFactory.makeBoolean(cb_web_services.NIL == valid);
            }
        }
        final SubLObject v_arity = ask_utilities.query_variable((SubLObject)cb_web_services.$sym27$_X, (SubLObject)ConsesLow.listS(cb_web_services.$const28$and, (SubLObject)ConsesLow.listS(cb_web_services.$const9$isa, genl_pred, (SubLObject)cb_web_services.$list29), (SubLObject)cb_web_services.$list30), cb_web_services.$const15$UniversalVocabularyMt, (SubLObject)cb_web_services.UNPROVIDED).first();
        ke.ke_assert((SubLObject)ConsesLow.list(cb_web_services.$const9$isa, spec_pred, v_arity), cb_web_services.$const15$UniversalVocabularyMt, (SubLObject)cb_web_services.UNPROVIDED, (SubLObject)cb_web_services.UNPROVIDED);
        return (SubLObject)cb_web_services.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/cb-web-services.lisp", position = 3139L)
    public static SubLObject url_encoded_cb_form(final SubLObject v_term) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject s = (SubLObject)cb_web_services.NIL;
        final SubLObject _prev_bind_0 = html_macros.$html_stream$.currentBinding(thread);
        try {
            html_macros.$html_stream$.bind((SubLObject)cb_web_services.NIL, thread);
            try {
                html_macros.$html_stream$.setDynamicValue(streams_high.make_private_string_output_stream(), thread);
                cb_utilities.cb_form(v_term, (SubLObject)cb_web_services.UNPROVIDED, (SubLObject)cb_web_services.UNPROVIDED);
                s = streams_high.get_output_stream_string(html_macros.$html_stream$.getDynamicValue(thread));
            }
            finally {
                final SubLObject _prev_bind_0_$7 = Threads.$is_thread_performing_cleanupP$.currentBinding(thread);
                try {
                    Threads.$is_thread_performing_cleanupP$.bind((SubLObject)cb_web_services.T, thread);
                    final SubLObject _values = Values.getValuesAsVector();
                    streams_high.close(html_macros.$html_stream$.getDynamicValue(thread), (SubLObject)cb_web_services.UNPROVIDED);
                    Values.restoreValuesFromVector(_values);
                }
                finally {
                    Threads.$is_thread_performing_cleanupP$.rebind(_prev_bind_0_$7, thread);
                }
            }
        }
        finally {
            html_macros.$html_stream$.rebind(_prev_bind_0, thread);
        }
        return web_utilities.html_url_encode(s, (SubLObject)cb_web_services.UNPROVIDED);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/cb-web-services.lisp", position = 3295L)
    public static SubLObject get_defining_mt_for_type(final SubLObject create_type, final SubLObject cycl_type) {
        SubLObject mt = (SubLObject)cb_web_services.NIL;
        if (create_type.equal((SubLObject)cb_web_services.$str8$instance) && cb_web_services.NIL != isa.isaP(create_type, cb_web_services.$const31$AtemporalNecessarilyEssentialColl, (SubLObject)cb_web_services.UNPROVIDED, (SubLObject)cb_web_services.UNPROVIDED)) {
            mt = cb_web_services.$const15$UniversalVocabularyMt;
        }
        else if (create_type.equal((SubLObject)cb_web_services.$str8$instance)) {
            mt = ask_utilities.query_variable((SubLObject)cb_web_services.$sym32$_MT, (SubLObject)ConsesLow.listS(cb_web_services.$const33$defaultDefiningMtForInstances, cycl_type, (SubLObject)cb_web_services.$list34), cb_web_services.$const35$BaseKB, (SubLObject)cb_web_services.UNPROVIDED).first();
        }
        else if (create_type.equal((SubLObject)cb_web_services.$str8$instance)) {
            mt = ask_utilities.query_variable((SubLObject)cb_web_services.$sym32$_MT, (SubLObject)ConsesLow.listS(cb_web_services.$const36$defaultDefiningMtForSpecs, cycl_type, (SubLObject)cb_web_services.$list34), cb_web_services.$const35$BaseKB, (SubLObject)cb_web_services.UNPROVIDED).first();
        }
        if (cb_web_services.NIL == mt) {
            mt = cb_web_services.$const15$UniversalVocabularyMt;
        }
        return mt;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/cb-web-services.lisp", position = 3891L)
    public static SubLObject xml_set_genstring_assertion(final SubLObject args) {
        final SubLObject assertion = cb_utilities.cb_guess_assertion(html_utilities.html_extract_input((SubLObject)cb_web_services.$str37$assert, args));
        final SubLObject base_formula = uncanonicalizer.assertion_el_ist_formula(assertion);
        final SubLObject mt = (SubLObject)((cb_web_services.NIL != assertion) ? assertions_high.assertion_mt(assertion) : cb_web_services.NIL);
        final SubLObject denot = (SubLObject)((cb_web_services.NIL != assertion) ? lexicon_accessors.assertion_denotation(assertion) : cb_web_services.NIL);
        final SubLObject addP = Equality.equal((SubLObject)cb_web_services.$str38$add, html_utilities.html_extract_input((SubLObject)cb_web_services.$str39$action, args));
        if (cb_web_services.NIL != mt) {
            if (cb_web_services.NIL != addP) {
                ke.ke_assert_now((SubLObject)ConsesLow.list(cb_web_services.$const40$genStringAssertion, denot, base_formula), mt, (SubLObject)cb_web_services.UNPROVIDED, (SubLObject)cb_web_services.UNPROVIDED);
            }
            else {
                unassert_all((SubLObject)ConsesLow.list(cb_web_services.$const40$genStringAssertion, denot, base_formula));
            }
        }
        return (SubLObject)cb_web_services.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/cb-web-services.lisp", position = 4720L)
    public static SubLObject xml_set_lexical_mapping_strength(final SubLObject args) {
        final SubLObject assertion = cb_utilities.cb_guess_assertion(html_utilities.html_extract_input((SubLObject)cb_web_services.$str37$assert, args));
        final SubLObject base_formula = uncanonicalizer.assertion_el_ist_formula(assertion);
        final SubLObject current_strength = cb_lexical_info.lexical_assertion_strength(assertion);
        final SubLObject mt = (SubLObject)((cb_web_services.NIL != assertion) ? assertions_high.assertion_mt(assertion) : cb_web_services.NIL);
        final SubLObject strength_str = html_utilities.html_extract_input((SubLObject)cb_web_services.$str42$strength, args);
        final SubLObject str = list_utilities.alist_lookup((SubLObject)cb_web_services.$list43, strength_str, (SubLObject)cb_web_services.EQUAL, (SubLObject)cb_web_services.UNPROVIDED);
        if (cb_web_services.NIL != mt && cb_web_services.NIL != str) {
            if (current_strength != cb_web_services.$kw44$DEFAULT) {
                unassert_all((SubLObject)ConsesLow.list(cb_web_services.$const45$strengthOfLexicalMapping, base_formula, current_strength));
            }
            if (str != cb_web_services.$kw44$DEFAULT) {
                ke.ke_assert_now((SubLObject)ConsesLow.list(cb_web_services.$const45$strengthOfLexicalMapping, base_formula, str), mt, (SubLObject)cb_web_services.UNPROVIDED, (SubLObject)cb_web_services.UNPROVIDED);
            }
        }
        return (SubLObject)cb_web_services.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/cb-web-services.lisp", position = 5951L)
    public static SubLObject unassert_all(final SubLObject sentence) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject unassert_count = (SubLObject)cb_web_services.ZERO_INTEGER;
        final SubLObject _prev_bind_0 = mt_relevance_macros.$relevant_mt_function$.currentBinding(thread);
        final SubLObject _prev_bind_2 = mt_relevance_macros.$mt$.currentBinding(thread);
        try {
            mt_relevance_macros.$relevant_mt_function$.bind((SubLObject)cb_web_services.$sym47$RELEVANT_MT_IS_EVERYTHING, thread);
            mt_relevance_macros.$mt$.bind(cb_web_services.$const48$EverythingPSC, thread);
            SubLObject cdolist_list_var = czer_meta.find_assertions_cycl(sentence, (SubLObject)cb_web_services.UNPROVIDED);
            SubLObject v_assert = (SubLObject)cb_web_services.NIL;
            v_assert = cdolist_list_var.first();
            while (cb_web_services.NIL != cdolist_list_var) {
                unassert_count = Numbers.add(unassert_count, (SubLObject)cb_web_services.ONE_INTEGER);
                ke.ke_unassert_now(sentence, assertions_high.assertion_mt(v_assert));
                cdolist_list_var = cdolist_list_var.rest();
                v_assert = cdolist_list_var.first();
            }
        }
        finally {
            mt_relevance_macros.$mt$.rebind(_prev_bind_2, thread);
            mt_relevance_macros.$relevant_mt_function$.rebind(_prev_bind_0, thread);
        }
        return unassert_count;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/cb-web-services.lisp", position = 6197L)
    public static SubLObject xml_set_bookmark(final SubLObject args) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject v_term = cb_utilities.cb_guess_term(html_utilities.html_extract_input((SubLObject)cb_web_services.$str49$term, args), (SubLObject)cb_web_services.UNPROVIDED);
        final SubLObject addP = Equality.equal((SubLObject)cb_web_services.$str38$add, html_utilities.html_extract_input((SubLObject)cb_web_services.$str39$action, args));
        final SubLObject new_class = (SubLObject)((cb_web_services.NIL != addP) ? cb_web_services.$str50$bookmarked : cb_web_services.$str2$);
        final SubLObject title = (cb_web_services.NIL != addP) ? cb_browser.$bookmarked_term_caption$.getDynamicValue(thread) : cb_browser.$unbookmarked_term_caption$.getDynamicValue(thread);
        if (cb_web_services.NIL != addP) {
            make_term_readily_available(v_term, api_control_vars.$the_cyclist$.getDynamicValue(thread));
        }
        else {
            make_term_unavailable(v_term, api_control_vars.$the_cyclist$.getDynamicValue(thread));
        }
        final SubLObject _prev_bind_0 = xml_vars.$xml_stream$.currentBinding(thread);
        try {
            xml_vars.$xml_stream$.bind(html_macros.$html_stream$.getDynamicValue(thread), thread);
            try {
                final SubLObject _prev_bind_0_$8 = xml_utilities.$xml_indentation_level$.currentBinding(thread);
                final SubLObject _prev_bind_2 = xml_utilities.$cycml_indent_level$.currentBinding(thread);
                try {
                    xml_utilities.$xml_indentation_level$.bind(Numbers.add(xml_utilities.$xml_indentation_amount$.getDynamicValue(thread), xml_utilities.$xml_indentation_level$.getDynamicValue(thread)), thread);
                    xml_utilities.$cycml_indent_level$.bind(xml_utilities.$xml_indentation_level$.getDynamicValue(thread), thread);
                    xml_utilities.xml_start_tag_internal((SubLObject)cb_web_services.$str51$result, (SubLObject)ConsesLow.list((SubLObject)cb_web_services.$str52$newClass, new_class, (SubLObject)cb_web_services.$str53$title, title), (SubLObject)cb_web_services.NIL, (SubLObject)cb_web_services.NIL, (SubLObject)cb_web_services.$kw20$UNINITIALIZED);
                    final SubLObject _prev_bind_0_$9 = xml_vars.$xml_default_namespace$.currentBinding(thread);
                    try {
                        xml_vars.$xml_default_namespace$.bind((SubLObject)cb_web_services.$kw20$UNINITIALIZED, thread);
                    }
                    finally {
                        xml_vars.$xml_default_namespace$.rebind(_prev_bind_0_$9, thread);
                    }
                }
                finally {
                    xml_utilities.$cycml_indent_level$.rebind(_prev_bind_2, thread);
                    xml_utilities.$xml_indentation_level$.rebind(_prev_bind_0_$8, thread);
                }
            }
            finally {
                final SubLObject _prev_bind_0_$10 = Threads.$is_thread_performing_cleanupP$.currentBinding(thread);
                try {
                    Threads.$is_thread_performing_cleanupP$.bind((SubLObject)cb_web_services.T, thread);
                    final SubLObject _values = Values.getValuesAsVector();
                    xml_utilities.xml_terpri();
                    xml_utilities.xml_end_tag_internal((SubLObject)cb_web_services.$str51$result);
                    Values.restoreValuesFromVector(_values);
                }
                finally {
                    Threads.$is_thread_performing_cleanupP$.rebind(_prev_bind_0_$10, thread);
                }
            }
        }
        finally {
            xml_vars.$xml_stream$.rebind(_prev_bind_0, thread);
        }
        return addP;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/cb-web-services.lisp", position = 6966L)
    public static SubLObject make_term_readily_available(final SubLObject v_term, final SubLObject cyclist) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject _prev_bind_0 = mt_relevance_macros.$relevant_mt_function$.currentBinding(thread);
        final SubLObject _prev_bind_2 = mt_relevance_macros.$mt$.currentBinding(thread);
        try {
            mt_relevance_macros.$relevant_mt_function$.bind((SubLObject)cb_web_services.$sym47$RELEVANT_MT_IS_EVERYTHING, thread);
            mt_relevance_macros.$mt$.bind(cb_web_services.$const48$EverythingPSC, thread);
            final SubLObject old_asserts = czer_meta.find_assertions_cycl((SubLObject)ConsesLow.list(cb_web_services.$const55$cyclistReadilyAvailableTerms, cyclist, v_term), (SubLObject)cb_web_services.UNPROVIDED);
            ke.ke_assert((SubLObject)ConsesLow.list(cb_web_services.$const55$cyclistReadilyAvailableTerms, api_control_vars.$the_cyclist$.getDynamicValue(thread), v_term), (SubLObject)ConsesLow.list(cb_web_services.$const56$MtSpace, cb_web_services.$const57$CyclistsMt, (SubLObject)ConsesLow.listS(cb_web_services.$const58$MtTimeWithGranularityDimFn, (SubLObject)ConsesLow.listS(cb_web_services.$const59$TimeIntervalInclusiveFn, date_utilities.indexical_now(), (SubLObject)cb_web_services.$list60), (SubLObject)cb_web_services.$list61)), (SubLObject)cb_web_services.UNPROVIDED, (SubLObject)cb_web_services.UNPROVIDED);
            SubLObject cdolist_list_var = old_asserts;
            SubLObject old_assert = (SubLObject)cb_web_services.NIL;
            old_assert = cdolist_list_var.first();
            while (cb_web_services.NIL != cdolist_list_var) {
                ke.ke_unassert_assertion(old_assert);
                cdolist_list_var = cdolist_list_var.rest();
                old_assert = cdolist_list_var.first();
            }
        }
        finally {
            mt_relevance_macros.$mt$.rebind(_prev_bind_2, thread);
            mt_relevance_macros.$relevant_mt_function$.rebind(_prev_bind_0, thread);
        }
        return (SubLObject)cb_web_services.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/cb-web-services.lisp", position = 7435L)
    public static SubLObject make_term_unavailable(final SubLObject v_term, final SubLObject cyclist) {
        SubLObject cdolist_list_var;
        final SubLObject old_assertions = cdolist_list_var = ask_utilities.query_variable((SubLObject)cb_web_services.$sym62$_ASSERT, (SubLObject)ConsesLow.listS(cb_web_services.$const28$and, (SubLObject)ConsesLow.list(cb_web_services.$const63$assertionSentence, (SubLObject)cb_web_services.$sym62$_ASSERT, (SubLObject)ConsesLow.list(cb_web_services.$const55$cyclistReadilyAvailableTerms, cyclist, v_term)), (SubLObject)cb_web_services.$list64), cb_web_services.$const65$InferencePSC, (SubLObject)cb_web_services.$list66);
        SubLObject old_assert = (SubLObject)cb_web_services.NIL;
        old_assert = cdolist_list_var.first();
        while (cb_web_services.NIL != cdolist_list_var) {
            final SubLObject old_assert_sentence = assertions_high.assertion_formula(old_assert);
            final SubLObject old_assert_mt = assertions_high.assertion_mt(old_assert);
            final SubLObject assertion_time = formula_template_utilities.mt_time_index(assertions_high.assertion_mt(old_assert));
            final SubLObject ended_time = ask_utilities.query_variable((SubLObject)cb_web_services.$sym67$_INT, (SubLObject)ConsesLow.list(cb_web_services.$const68$thereExists, (SubLObject)cb_web_services.$sym69$_WHEN, (SubLObject)ConsesLow.list(cb_web_services.$const28$and, (SubLObject)cb_web_services.$list70, (SubLObject)ConsesLow.listS(cb_web_services.$const71$equals, (SubLObject)ConsesLow.listS(cb_web_services.$const72$TemporalIntersectionFn, assertion_time, (SubLObject)cb_web_services.$list73), (SubLObject)cb_web_services.$list74))), cb_web_services.$const65$InferencePSC, (SubLObject)cb_web_services.UNPROVIDED).first();
            ke.ke_edit(old_assert_sentence, old_assert_sentence, old_assert_mt, (SubLObject)ConsesLow.list(cb_web_services.$const56$MtSpace, cb_web_services.$const57$CyclistsMt, (SubLObject)ConsesLow.listS(cb_web_services.$const58$MtTimeWithGranularityDimFn, (SubLObject)ConsesLow.list(cb_web_services.$const59$TimeIntervalInclusiveFn, ended_time, date_utilities.indexical_now()), (SubLObject)cb_web_services.$list61)), (SubLObject)cb_web_services.UNPROVIDED, (SubLObject)cb_web_services.UNPROVIDED);
            cdolist_list_var = cdolist_list_var.rest();
            old_assert = cdolist_list_var.first();
        }
        return (SubLObject)cb_web_services.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/cb-web-services.lisp", position = 8539L)
    public static SubLObject currently_bookmarkedP(final SubLObject v_term, SubLObject cyclist) {
        if (cyclist == cb_web_services.UNPROVIDED) {
            cyclist = api_control_vars.$the_cyclist$.getDynamicValue();
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject _prev_bind_0 = czer_vars.$disable_create_narts_regardless_of_whether_within_assertP$.currentBinding(thread);
        try {
            czer_vars.$disable_create_narts_regardless_of_whether_within_assertP$.bind((SubLObject)cb_web_services.T, thread);
            return ask_utilities.query_boolean((SubLObject)ConsesLow.list(cb_web_services.$const55$cyclistReadilyAvailableTerms, cyclist, narts_high.nart_substitute(v_term)), (SubLObject)cb_web_services.$list76, (SubLObject)cb_web_services.UNPROVIDED);
        }
        finally {
            czer_vars.$disable_create_narts_regardless_of_whether_within_assertP$.rebind(_prev_bind_0, thread);
        }
    }
    
    public static SubLObject declare_cb_web_services_file() {
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.cb_web_services", "xml_term_create", "XML-TERM-CREATE", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.cb_web_services", "create_spec_pred", "CREATE-SPEC-PRED", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.cb_web_services", "url_encoded_cb_form", "URL-ENCODED-CB-FORM", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.cb_web_services", "get_defining_mt_for_type", "GET-DEFINING-MT-FOR-TYPE", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.cb_web_services", "xml_set_genstring_assertion", "XML-SET-GENSTRING-ASSERTION", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.cb_web_services", "xml_set_lexical_mapping_strength", "XML-SET-LEXICAL-MAPPING-STRENGTH", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.cb_web_services", "unassert_all", "UNASSERT-ALL", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.cb_web_services", "xml_set_bookmark", "XML-SET-BOOKMARK", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.cb_web_services", "make_term_readily_available", "MAKE-TERM-READILY-AVAILABLE", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.cb_web_services", "make_term_unavailable", "MAKE-TERM-UNAVAILABLE", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.cb_web_services", "currently_bookmarkedP", "CURRENTLY-BOOKMARKED?", 1, 1, false);
        return (SubLObject)cb_web_services.NIL;
    }
    
    public static SubLObject init_cb_web_services_file() {
        return (SubLObject)cb_web_services.NIL;
    }
    
    public static SubLObject setup_cb_web_services_file() {
        html_macros.note_cgi_handler_function((SubLObject)cb_web_services.$sym21$XML_TERM_CREATE, (SubLObject)cb_web_services.$kw22$XML_HANDLER);
        html_macros.note_cgi_handler_function((SubLObject)cb_web_services.$sym41$XML_SET_GENSTRING_ASSERTION, (SubLObject)cb_web_services.$kw22$XML_HANDLER);
        html_macros.note_cgi_handler_function((SubLObject)cb_web_services.$sym46$XML_SET_LEXICAL_MAPPING_STRENGTH, (SubLObject)cb_web_services.$kw22$XML_HANDLER);
        html_macros.note_cgi_handler_function((SubLObject)cb_web_services.$sym54$XML_SET_BOOKMARK, (SubLObject)cb_web_services.$kw22$XML_HANDLER);
        return (SubLObject)cb_web_services.NIL;
    }
    
    @Override
	public void declareFunctions() {
        declare_cb_web_services_file();
    }
    
    @Override
	public void initializeVariables() {
        init_cb_web_services_file();
    }
    
    @Override
	public void runTopLevelForms() {
        setup_cb_web_services_file();
    }
    
    static {
        me = (SubLFile)new cb_web_services();
        $str0$createType = SubLObjectFactory.makeString("createType");
        $str1$name = SubLObjectFactory.makeString("name");
        $str2$ = SubLObjectFactory.makeString("");
        $str3$spec_pred = SubLObjectFactory.makeString("spec-pred");
        $kw4$DOWNCASE = SubLObjectFactory.makeKeyword("DOWNCASE");
        $kw5$UPCASE = SubLObjectFactory.makeKeyword("UPCASE");
        $str6$baseType = SubLObjectFactory.makeString("baseType");
        $const7$EnglishMt = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("EnglishMt"));
        $str8$instance = SubLObjectFactory.makeString("instance");
        $const9$isa = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("isa"));
        $str10$spec = SubLObjectFactory.makeString("spec");
        $list11 = ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("Collection")));
        $const12$genls = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("genls"));
        $str13$spec_mt = SubLObjectFactory.makeString("spec-mt");
        $list14 = ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("Microtheory")));
        $const15$UniversalVocabularyMt = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("UniversalVocabularyMt"));
        $const16$genlMt = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("genlMt"));
        $str17$concept = SubLObjectFactory.makeString("concept");
        $str18$externalId = SubLObjectFactory.makeString("externalId");
        $str19$url = SubLObjectFactory.makeString("url");
        $kw20$UNINITIALIZED = SubLObjectFactory.makeKeyword("UNINITIALIZED");
        $sym21$XML_TERM_CREATE = SubLObjectFactory.makeSymbol("XML-TERM-CREATE");
        $kw22$XML_HANDLER = SubLObjectFactory.makeKeyword("XML-HANDLER");
        $list23 = ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("Predicate")));
        $const24$genlPreds = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("genlPreds"));
        $const25$argIsa = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("argIsa"));
        $kw26$GAF = SubLObjectFactory.makeKeyword("GAF");
        $sym27$_X = SubLObjectFactory.makeSymbol("?X");
        $const28$and = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("and"));
        $list29 = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("?X"));
        $list30 = ConsesLow.list((SubLObject)ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("isa")), (SubLObject)SubLObjectFactory.makeSymbol("?X"), constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("PredicateTypeByArity"))));
        $const31$AtemporalNecessarilyEssentialColl = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("AtemporalNecessarilyEssentialCollectionType"));
        $sym32$_MT = SubLObjectFactory.makeSymbol("?MT");
        $const33$defaultDefiningMtForInstances = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("defaultDefiningMtForInstances"));
        $list34 = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("?MT"));
        $const35$BaseKB = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("BaseKB"));
        $const36$defaultDefiningMtForSpecs = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("defaultDefiningMtForSpecs"));
        $str37$assert = SubLObjectFactory.makeString("assert");
        $str38$add = SubLObjectFactory.makeString("add");
        $str39$action = SubLObjectFactory.makeString("action");
        $const40$genStringAssertion = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("genStringAssertion"));
        $sym41$XML_SET_GENSTRING_ASSERTION = SubLObjectFactory.makeSymbol("XML-SET-GENSTRING-ASSERTION");
        $str42$strength = SubLObjectFactory.makeString("strength");
        $list43 = ConsesLow.list((SubLObject)ConsesLow.cons((SubLObject)SubLObjectFactory.makeString("context"), constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("ContextuallyDependentLexicalMapping"))), (SubLObject)ConsesLow.cons((SubLObject)SubLObjectFactory.makeString("primary"), constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("PrimaryLexicalMapping"))), (SubLObject)ConsesLow.cons((SubLObject)SubLObjectFactory.makeString("default"), (SubLObject)SubLObjectFactory.makeKeyword("DEFAULT")), (SubLObject)ConsesLow.cons((SubLObject)SubLObjectFactory.makeString("vanishing"), constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("VanishinglyRareLexicalMapping"))));
        $kw44$DEFAULT = SubLObjectFactory.makeKeyword("DEFAULT");
        $const45$strengthOfLexicalMapping = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("strengthOfLexicalMapping"));
        $sym46$XML_SET_LEXICAL_MAPPING_STRENGTH = SubLObjectFactory.makeSymbol("XML-SET-LEXICAL-MAPPING-STRENGTH");
        $sym47$RELEVANT_MT_IS_EVERYTHING = SubLObjectFactory.makeSymbol("RELEVANT-MT-IS-EVERYTHING");
        $const48$EverythingPSC = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("EverythingPSC"));
        $str49$term = SubLObjectFactory.makeString("term");
        $str50$bookmarked = SubLObjectFactory.makeString("bookmarked");
        $str51$result = SubLObjectFactory.makeString("result");
        $str52$newClass = SubLObjectFactory.makeString("newClass");
        $str53$title = SubLObjectFactory.makeString("title");
        $sym54$XML_SET_BOOKMARK = SubLObjectFactory.makeSymbol("XML-SET-BOOKMARK");
        $const55$cyclistReadilyAvailableTerms = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("cyclistReadilyAvailableTerms"));
        $const56$MtSpace = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("MtSpace"));
        $const57$CyclistsMt = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("CyclistsMt"));
        $const58$MtTimeWithGranularityDimFn = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("MtTimeWithGranularityDimFn"));
        $const59$TimeIntervalInclusiveFn = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("TimeIntervalInclusiveFn"));
        $list60 = ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("Now")));
        $list61 = ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("TimePoint")));
        $sym62$_ASSERT = SubLObjectFactory.makeSymbol("?ASSERT");
        $const63$assertionSentence = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("assertionSentence"));
        $list64 = ConsesLow.list((SubLObject)ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("assertionMt")), (SubLObject)SubLObjectFactory.makeSymbol("?ASSERT"), (SubLObject)SubLObjectFactory.makeSymbol("?MT")), (SubLObject)ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("mtTimeIndex")), (SubLObject)SubLObjectFactory.makeSymbol("?MT"), (SubLObject)SubLObjectFactory.makeSymbol("?INTERVAL")), (SubLObject)ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("temporallySubsumes")), (SubLObject)SubLObjectFactory.makeSymbol("?INTERVAL"), constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("Now"))));
        $const65$InferencePSC = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("InferencePSC"));
        $list66 = ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("ANSWER-LANGUAGE"), (SubLObject)SubLObjectFactory.makeKeyword("HL"));
        $sym67$_INT = SubLObjectFactory.makeSymbol("?INT");
        $const68$thereExists = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("thereExists"));
        $sym69$_WHEN = SubLObjectFactory.makeSymbol("?WHEN");
        $list70 = ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("indexicalReferent")), constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("Now-Indexical")), (SubLObject)SubLObjectFactory.makeSymbol("?WHEN"));
        $const71$equals = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("equals"));
        $const72$TemporalIntersectionFn = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("TemporalIntersectionFn"));
        $list73 = ConsesLow.list((SubLObject)ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("IntervalEndedByFn")), (SubLObject)SubLObjectFactory.makeSymbol("?WHEN")));
        $list74 = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("?INT"));
        $sym75$_EXIT = SubLObjectFactory.makeSymbol("%EXIT");
        $list76 = ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("MtSpace")), constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("CyclistsMt")), (SubLObject)ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("MtTimeWithGranularityDimFn")), constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("Now")), constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("TimePoint"))));
    }
}

/*

	Total time: 183 ms
	
*/