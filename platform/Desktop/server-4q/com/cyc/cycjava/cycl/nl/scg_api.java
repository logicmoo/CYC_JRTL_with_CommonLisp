package com.cyc.cycjava.cycl.nl;

import com.cyc.cycjava.cycl.constant_handles;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory;
import com.cyc.cycjava.cycl.cyc_testing.generic_testing;
import com.cyc.tool.subl.util.SubLFiles;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Functions;
import com.cyc.cycjava.cycl.cycl_grammar;
import com.cyc.cycjava.cycl.cycl_utilities;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Mapping;
import com.cyc.cycjava.cycl.kb_mapping;
import com.cyc.cycjava.cycl.el_utilities;
import com.cyc.cycjava.cycl.inference.ask_utilities;
import com.cyc.cycjava.cycl.mt_relevance_macros;
import com.cyc.cycjava.cycl.memoization_state;
import com.cyc.cycjava.cycl.xml_utilities;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.reader;
import com.cyc.cycjava.cycl.iteration;
import com.cyc.cycjava.cycl.xml_parsing_utilities;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.streams_high;
import com.cyc.cycjava.cycl.string_utilities;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.conses_high;
import com.cyc.cycjava.cycl.list_utilities;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Values;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Sequences;
import com.cyc.cycjava.cycl.format_nil;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Numbers;
import com.cyc.cycjava.cycl.system_parameters;
import com.cyc.cycjava.cycl.http_kernel;
import com.cyc.cycjava.cycl.misc_utilities;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.SubLThread;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Errors;
import com.cyc.cycjava.cycl.web_utilities;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLProcess;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObject;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLList;
import com.cyc.tool.subl.jrtl.nativeCode.type.number.SubLInteger;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLString;
import com.cyc.tool.subl.jrtl.nativeCode.type.symbol.SubLSymbol;
import com.cyc.tool.subl.util.SubLFile;
import com.cyc.tool.subl.util.SubLTranslatedFile;

public final class scg_api extends SubLTranslatedFile
{
    public static final SubLFile me;
    public static final String myName = "com.cyc.cycjava.cycl.nl.scg_api";
    public static final String myFingerPrint = "162e5219676c4e27e5956e0eefb7f4078bb2722944e49b3b03f07e1da4f6010f";
    @SubLTranslatedFile.SubL(source = "cycl/nl/scg-api.lisp", position = 911L)
    public static SubLSymbol $scg_parser_host$;
    @SubLTranslatedFile.SubL(source = "cycl/nl/scg-api.lisp", position = 1090L)
    private static SubLSymbol $scg_parser_port$;
    @SubLTranslatedFile.SubL(source = "cycl/nl/scg-api.lisp", position = 1245L)
    private static SubLSymbol $scg_default_max_time$;
    @SubLTranslatedFile.SubL(source = "cycl/nl/scg-api.lisp", position = 1378L)
    private static SubLSymbol $scg_parser_callback_host$;
    @SubLTranslatedFile.SubL(source = "cycl/nl/scg-api.lisp", position = 1548L)
    private static SubLSymbol $scg_parser_callback_port$;
    @SubLTranslatedFile.SubL(source = "cycl/nl/scg-api.lisp", position = 1641L)
    private static SubLSymbol $scg_parser_callback_fallback_host$;
    @SubLTranslatedFile.SubL(source = "cycl/nl/scg-api.lisp", position = 1719L)
    private static SubLSymbol $scg_parser_callback_fallback_base_port$;
    @SubLTranslatedFile.SubL(source = "cycl/nl/scg-api.lisp", position = 1788L)
    public static SubLSymbol $default_scg_tag_string$;
    @SubLTranslatedFile.SubL(source = "cycl/nl/scg-api.lisp", position = 6712L)
    private static SubLSymbol $scg_lexical_mt_caching_state$;
    private static final SubLString $str0$localhost;
    private static final SubLSymbol $kw1$UNINITIALIZED;
    private static final SubLString $str2$Unable_to_initialize__A__;
    private static final SubLInteger $int3$60;
    private static final SubLString $str4$public1_cyc_com;
    private static final SubLInteger $int5$3600;
    private static final SubLString $str6$general;
    private static final SubLString $str7$true;
    private static final SubLString $str8$false;
    private static final SubLString $str9$;
    private static final SubLString $str10$http___;
    private static final SubLString $str11$_;
    private static final SubLString $str12$_scg_text_translate_clearCaches_;
    private static final SubLString $str13$_inputText_;
    private static final SubLString $str14$_templateTags_;
    private static final SubLString $str15$_cycHost_;
    private static final SubLString $str16$_cycPort_;
    private static final SubLString $str17$_lexicalMt_;
    private static final SubLString $str18$_timeoutMsec_;
    private static final SubLInteger $int19$1000;
    private static final SubLList $list20;
    private static final SubLSymbol $kw21$TAG_STRING_PARAMETER;
    private static final SubLSymbol $kw22$LEXICAL_MT;
    private static final SubLSymbol $kw23$CLEAR_CACHES_;
    private static final SubLSymbol $kw24$COMPLETE_MATCHES_ONLY_;
    private static final SubLSymbol $kw25$MAX_TIME;
    private static final SubLString $str26$source;
    private static final SubLString $str27$start;
    private static final SubLString $str28$_cycl;
    private static final SubLSymbol $sym29$SCG_LEXICAL_MT;
    private static final SubLSymbol $sym30$_LEX_MT;
    private static final SubLObject $const31$scgLexicalMts;
    private static final SubLList $list32;
    private static final SubLObject $const33$InferencePSC;
    private static final SubLObject $const34$MtUnionFn;
    private static final SubLSymbol $sym35$_SCG_LEXICAL_MT_CACHING_STATE_;
    private static final SubLInteger $int36$32;
    private static final SubLSymbol $sym37$CLEAR_SCG_LEXICAL_MT;
    private static final SubLSymbol $sym38$RELEVANT_MT_IS_EVERYTHING;
    private static final SubLObject $const39$EverythingPSC;
    private static final SubLSymbol $sym40$GAF_ARG2;
    private static final SubLObject $const41$scgTags;
    private static final SubLSymbol $sym42$GAF_ARG1;
    private static final SubLObject $const43$scgTagRelevant;
    private static final SubLSymbol $kw44$TAG_STRING;
    private static final SubLObject $const45$equalSymbols;
    private static final SubLSymbol $sym46$SCG_PARSE_TEST;
    private static final SubLSymbol $kw47$TEST;
    private static final SubLSymbol $kw48$OWNER;
    private static final SubLSymbol $kw49$CLASSES;
    private static final SubLSymbol $kw50$KB;
    private static final SubLSymbol $kw51$FULL;
    private static final SubLSymbol $kw52$WORKING_;
    private static final SubLList $list53;
    
    @SubLTranslatedFile.SubL(source = "cycl/nl/scg-api.lisp", position = 1090L)
    public static SubLObject get_scg_parser_port() {
        final SubLThread thread = SubLProcess.currentSubLThread();
        if (scg_api.$scg_parser_port$.getDynamicValue(thread) == scg_api.$kw1$UNINITIALIZED) {
            final SubLObject init_value = web_utilities.servlet_container_port();
            if (init_value == scg_api.$kw1$UNINITIALIZED) {
                Errors.error((SubLObject)scg_api.$str2$Unable_to_initialize__A__, scg_api.$scg_parser_port$.getDynamicValue(thread));
            }
            scg_api.$scg_parser_port$.setDynamicValue(init_value, thread);
        }
        return scg_api.$scg_parser_port$.getDynamicValue(thread);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/nl/scg-api.lisp", position = 1378L)
    public static SubLObject get_scg_parser_callback_host() {
        final SubLThread thread = SubLProcess.currentSubLThread();
        if (scg_api.$scg_parser_callback_host$.getDynamicValue(thread) == scg_api.$kw1$UNINITIALIZED) {
            final SubLObject init_value = misc_utilities.machine_name();
            if (init_value == scg_api.$kw1$UNINITIALIZED) {
                Errors.error((SubLObject)scg_api.$str2$Unable_to_initialize__A__, scg_api.$scg_parser_callback_host$.getDynamicValue(thread));
            }
            scg_api.$scg_parser_callback_host$.setDynamicValue(init_value, thread);
        }
        return scg_api.$scg_parser_callback_host$.getDynamicValue(thread);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/nl/scg-api.lisp", position = 1548L)
    public static SubLObject get_scg_parser_callback_port() {
        final SubLThread thread = SubLProcess.currentSubLThread();
        if (scg_api.$scg_parser_callback_port$.getDynamicValue(thread) == scg_api.$kw1$UNINITIALIZED) {
            final SubLObject init_value = http_kernel.http_port();
            if (init_value == scg_api.$kw1$UNINITIALIZED) {
                Errors.error((SubLObject)scg_api.$str2$Unable_to_initialize__A__, scg_api.$scg_parser_callback_port$.getDynamicValue(thread));
            }
            scg_api.$scg_parser_callback_port$.setDynamicValue(init_value, thread);
        }
        return scg_api.$scg_parser_callback_port$.getDynamicValue(thread);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/nl/scg-api.lisp", position = 1993L)
    public static SubLObject set_scg_parse_host(final SubLObject parser_host, final SubLObject parser_base_port, SubLObject callback_host, SubLObject callback_base_port) {
        if (callback_host == scg_api.UNPROVIDED) {
            callback_host = misc_utilities.machine_name();
        }
        if (callback_base_port == scg_api.UNPROVIDED) {
            callback_base_port = system_parameters.$base_tcp_port$.getDynamicValue();
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        scg_api.$scg_parser_host$.setDynamicValue(parser_host, thread);
        scg_api.$scg_parser_port$.setDynamicValue(Numbers.add(parser_base_port, system_parameters.$servlet_port_offset$.getDynamicValue(thread)), thread);
        scg_api.$scg_parser_callback_host$.setDynamicValue(callback_host, thread);
        scg_api.$scg_parser_callback_port$.setDynamicValue(Numbers.add(callback_base_port, system_parameters.$http_port_offset$.getDynamicValue(thread)), thread);
        return (SubLObject)scg_api.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/nl/scg-api.lisp", position = 2470L)
    public static SubLObject get_scg_parse_results_in_xml(final SubLObject string_to_parse, SubLObject max_time, SubLObject tag_string, SubLObject lexical_mt, SubLObject clear_cachesP) {
        if (max_time == scg_api.UNPROVIDED) {
            max_time = scg_api.$scg_default_max_time$.getDynamicValue();
        }
        if (tag_string == scg_api.UNPROVIDED) {
            tag_string = scg_api.$default_scg_tag_string$.getDynamicValue();
        }
        if (lexical_mt == scg_api.UNPROVIDED) {
            lexical_mt = (SubLObject)scg_api.NIL;
        }
        if (clear_cachesP == scg_api.UNPROVIDED) {
            clear_cachesP = (SubLObject)scg_api.NIL;
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject clear_caches_value = (SubLObject)((scg_api.NIL != clear_cachesP) ? scg_api.$str7$true : scg_api.$str8$false);
        final SubLObject lexical_mt_string = (SubLObject)((scg_api.NIL != lexical_mt) ? lexical_mt : scg_api.$str9$);
        final SubLObject scg_parser_host = scg_api.$scg_parser_host$.getDynamicValue(thread);
        final SubLObject scg_parser_port = get_scg_parser_port();
        final SubLObject scg_parser_callback_host = get_scg_parser_callback_host();
        final SubLObject scg_parser_callback_port = get_scg_parser_callback_port();
        final SubLObject url = Sequences.cconcatenate((SubLObject)scg_api.$str10$http___, new SubLObject[] { format_nil.format_nil_a_no_copy(scg_parser_host), scg_api.$str11$_, format_nil.format_nil_a_no_copy(scg_parser_port), scg_api.$str12$_scg_text_translate_clearCaches_, format_nil.format_nil_a_no_copy(clear_caches_value), scg_api.$str13$_inputText_, format_nil.format_nil_a_no_copy(web_utilities.html_url_encode(string_to_parse, (SubLObject)scg_api.UNPROVIDED)), scg_api.$str14$_templateTags_, format_nil.format_nil_a_no_copy(web_utilities.html_url_encode(tag_string, (SubLObject)scg_api.UNPROVIDED)), scg_api.$str15$_cycHost_, format_nil.format_nil_a_no_copy(scg_parser_callback_host), scg_api.$str16$_cycPort_, format_nil.format_nil_a_no_copy(Numbers.subtract(scg_parser_callback_port, (SubLObject)scg_api.TWO_INTEGER)), scg_api.$str17$_lexicalMt_, format_nil.format_nil_a_no_copy(lexical_mt_string), scg_api.$str18$_timeoutMsec_, format_nil.format_nil_a_no_copy(Numbers.multiply((SubLObject)scg_api.$int19$1000, max_time)) });
        final SubLObject return_types = (SubLObject)scg_api.$list20;
        return Values.values(web_utilities.dereference_url(url, (SubLObject)scg_api.NIL, return_types, (SubLObject)scg_api.NIL, Numbers.add((SubLObject)scg_api.TWO_INTEGER, scg_api.$scg_default_max_time$.getDynamicValue(thread))), url);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/nl/scg-api.lisp", position = 4418L)
    public static SubLObject scg_parse(final SubLObject string_to_parse, SubLObject params) {
        if (params == scg_api.UNPROVIDED) {
            params = (SubLObject)ConsesLow.list(new SubLObject[] { scg_api.$kw21$TAG_STRING_PARAMETER, scg_api.NIL, scg_api.$kw22$LEXICAL_MT, scg_api.NIL, scg_api.$kw23$CLEAR_CACHES_, scg_api.NIL, scg_api.$kw24$COMPLETE_MATCHES_ONLY_, scg_api.T, scg_api.$kw25$MAX_TIME, scg_api.$scg_default_max_time$.getDynamicValue() });
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        params = list_utilities.augment_plist_with_defaults(params, (SubLObject)ConsesLow.list((SubLObject)scg_api.$kw24$COMPLETE_MATCHES_ONLY_, (SubLObject)scg_api.T, (SubLObject)scg_api.$kw25$MAX_TIME, scg_api.$scg_default_max_time$.getDynamicValue(thread)));
        final SubLObject max_time = (SubLObject)((scg_api.NIL == conses_high.getf(params, (SubLObject)scg_api.$kw25$MAX_TIME, (SubLObject)scg_api.UNPROVIDED)) ? scg_api.ZERO_INTEGER : Numbers.max((SubLObject)scg_api.ONE_INTEGER, conses_high.getf(params, (SubLObject)scg_api.$kw25$MAX_TIME, (SubLObject)scg_api.UNPROVIDED)));
        final SubLObject tag_string = (scg_api.NIL != conses_high.getf(params, (SubLObject)scg_api.$kw21$TAG_STRING_PARAMETER, (SubLObject)scg_api.UNPROVIDED)) ? conses_high.getf(params, (SubLObject)scg_api.$kw21$TAG_STRING_PARAMETER, (SubLObject)scg_api.UNPROVIDED) : scg_construction_tag_string((SubLObject)scg_api.UNPROVIDED);
        final SubLObject final_lexical_mt = (scg_api.NIL != conses_high.getf(params, (SubLObject)scg_api.$kw22$LEXICAL_MT, (SubLObject)scg_api.UNPROVIDED)) ? conses_high.getf(params, (SubLObject)scg_api.$kw22$LEXICAL_MT, (SubLObject)scg_api.UNPROVIDED) : scg_lexical_mt((SubLObject)scg_api.UNPROVIDED);
        final SubLObject lexical_mt_string = (SubLObject)((scg_api.NIL != final_lexical_mt) ? string_utilities.string_remove_constant_reader_prefixes(string_utilities.to_string(final_lexical_mt)) : scg_api.$str9$);
        final SubLObject complete_matchesP = conses_high.getf(params, (SubLObject)scg_api.$kw24$COMPLETE_MATCHES_ONLY_, (SubLObject)scg_api.T);
        final SubLObject clear_caches = (SubLObject)((scg_api.NIL != conses_high.getf(params, (SubLObject)scg_api.$kw23$CLEAR_CACHES_, (SubLObject)scg_api.UNPROVIDED)) ? conses_high.getf(params, (SubLObject)scg_api.$kw23$CLEAR_CACHES_, (SubLObject)scg_api.UNPROVIDED) : scg_api.NIL);
        thread.resetMultipleValues();
        final SubLObject xml_string = get_scg_parse_results_in_xml(string_to_parse, max_time, tag_string, lexical_mt_string, clear_caches);
        final SubLObject url = thread.secondMultipleValue();
        thread.resetMultipleValues();
        final SubLObject token_iterator = xml_parsing_utilities.new_xml_token_iterator(streams_high.make_private_string_input_stream(xml_string, (SubLObject)scg_api.UNPROVIDED, (SubLObject)scg_api.UNPROVIDED), (SubLObject)scg_api.UNPROVIDED, (SubLObject)scg_api.UNPROVIDED, (SubLObject)scg_api.UNPROVIDED);
        SubLObject working_on_correct_string = (SubLObject)scg_api.NIL;
        SubLObject current_string = (SubLObject)scg_api.NIL;
        SubLObject current_offset = (SubLObject)scg_api.NIL;
        SubLObject cycls = (SubLObject)scg_api.NIL;
        SubLObject strings = (SubLObject)scg_api.NIL;
        SubLObject offsets = (SubLObject)scg_api.NIL;
        while (scg_api.NIL == iteration.iteration_done(token_iterator)) {
            final SubLObject token = iteration.iteration_next(token_iterator);
            final SubLObject element_name = xml_parsing_utilities.xml_token_element_name(token);
            if (scg_api.NIL != xml_parsing_utilities.xml_opening_tag_p(token) && scg_api.$str26$source.equal(element_name)) {
                current_offset = reader.read_from_string_ignoring_errors(xml_parsing_utilities.xml_tag_attribute_value(token, (SubLObject)scg_api.$str27$start, (SubLObject)scg_api.UNPROVIDED), (SubLObject)scg_api.UNPROVIDED, (SubLObject)scg_api.UNPROVIDED, (SubLObject)scg_api.UNPROVIDED, (SubLObject)scg_api.UNPROVIDED);
                current_string = xml_utilities.xml_unescape_string(iteration.iteration_next(token_iterator));
                working_on_correct_string = list_utilities.lengthE(string_to_parse, Sequences.length(current_string), (SubLObject)scg_api.UNPROVIDED);
            }
            if ((scg_api.NIL != working_on_correct_string || scg_api.NIL == complete_matchesP) && scg_api.NIL != xml_parsing_utilities.xml_opening_tag_p(token) && scg_api.NIL != string_utilities.ends_with(element_name, (SubLObject)scg_api.$str28$_cycl, (SubLObject)scg_api.UNPROVIDED)) {
                cycls = (SubLObject)ConsesLow.cons(reader.read_from_string_ignoring_errors(iteration.iteration_next(token_iterator), (SubLObject)scg_api.UNPROVIDED, (SubLObject)scg_api.UNPROVIDED, (SubLObject)scg_api.UNPROVIDED, (SubLObject)scg_api.UNPROVIDED), cycls);
                strings = (SubLObject)ConsesLow.cons(current_string, strings);
                offsets = (SubLObject)ConsesLow.cons(current_offset, offsets);
            }
        }
        return Values.values(cycls, url, strings, offsets);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/nl/scg-api.lisp", position = 6712L)
    public static SubLObject clear_scg_lexical_mt() {
        final SubLObject cs = scg_api.$scg_lexical_mt_caching_state$.getGlobalValue();
        if (scg_api.NIL != cs) {
            memoization_state.caching_state_clear(cs);
        }
        return (SubLObject)scg_api.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/nl/scg-api.lisp", position = 6712L)
    public static SubLObject remove_scg_lexical_mt(SubLObject mt) {
        if (mt == scg_api.UNPROVIDED) {
            mt = mt_relevance_macros.$mt$.getDynamicValue();
        }
        return memoization_state.caching_state_remove_function_results_with_args(scg_api.$scg_lexical_mt_caching_state$.getGlobalValue(), (SubLObject)ConsesLow.list(mt), (SubLObject)scg_api.UNPROVIDED, (SubLObject)scg_api.UNPROVIDED);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/nl/scg-api.lisp", position = 6712L)
    public static SubLObject scg_lexical_mt_internal(final SubLObject mt) {
        final SubLObject lexical_mts = ask_utilities.query_variable((SubLObject)scg_api.$sym30$_LEX_MT, (SubLObject)ConsesLow.listS(scg_api.$const31$scgLexicalMts, mt, (SubLObject)scg_api.$list32), scg_api.$const33$InferencePSC, (SubLObject)scg_api.UNPROVIDED);
        if (scg_api.NIL != list_utilities.lengthG(lexical_mts, (SubLObject)scg_api.ONE_INTEGER, (SubLObject)scg_api.UNPROVIDED)) {
            return el_utilities.make_formula(scg_api.$const34$MtUnionFn, lexical_mts, (SubLObject)scg_api.UNPROVIDED);
        }
        if (scg_api.NIL != list_utilities.lengthE(lexical_mts, (SubLObject)scg_api.ONE_INTEGER, (SubLObject)scg_api.UNPROVIDED)) {
            return lexical_mts.first();
        }
        return (SubLObject)scg_api.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/nl/scg-api.lisp", position = 6712L)
    public static SubLObject scg_lexical_mt(SubLObject mt) {
        if (mt == scg_api.UNPROVIDED) {
            mt = mt_relevance_macros.$mt$.getDynamicValue();
        }
        SubLObject caching_state = scg_api.$scg_lexical_mt_caching_state$.getGlobalValue();
        if (scg_api.NIL == caching_state) {
            caching_state = memoization_state.create_global_caching_state_for_name((SubLObject)scg_api.$sym29$SCG_LEXICAL_MT, (SubLObject)scg_api.$sym35$_SCG_LEXICAL_MT_CACHING_STATE_, (SubLObject)scg_api.$int36$32, (SubLObject)scg_api.EQL, (SubLObject)scg_api.ONE_INTEGER, (SubLObject)scg_api.ZERO_INTEGER);
            memoization_state.register_hl_store_cache_clear_callback((SubLObject)scg_api.$sym37$CLEAR_SCG_LEXICAL_MT);
        }
        SubLObject results = memoization_state.caching_state_lookup(caching_state, mt, memoization_state.$memoized_item_not_found$.getGlobalValue());
        if (results.eql(memoization_state.$memoized_item_not_found$.getGlobalValue())) {
            results = Values.arg2(Values.resetMultipleValues(), (SubLObject)Values.multiple_value_list(scg_lexical_mt_internal(mt)));
            memoization_state.caching_state_put(caching_state, mt, results, (SubLObject)scg_api.UNPROVIDED);
        }
        return memoization_state.caching_results(results);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/nl/scg-api.lisp", position = 7104L)
    public static SubLObject scg_construction_tag_string(SubLObject mt) {
        if (mt == scg_api.UNPROVIDED) {
            mt = mt_relevance_macros.$mt$.getDynamicValue();
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject tags = (SubLObject)scg_api.NIL;
        final SubLObject _prev_bind_0 = mt_relevance_macros.$relevant_mt_function$.currentBinding(thread);
        final SubLObject _prev_bind_2 = mt_relevance_macros.$mt$.currentBinding(thread);
        try {
            mt_relevance_macros.$relevant_mt_function$.bind((SubLObject)scg_api.$sym38$RELEVANT_MT_IS_EVERYTHING, thread);
            mt_relevance_macros.$mt$.bind(scg_api.$const39$EverythingPSC, thread);
            tags = Mapping.mapcar((SubLObject)scg_api.$sym40$GAF_ARG2, kb_mapping.gather_gaf_arg_index(mt, (SubLObject)scg_api.ONE_INTEGER, scg_api.$const41$scgTags, (SubLObject)scg_api.UNPROVIDED, (SubLObject)scg_api.UNPROVIDED));
        }
        finally {
            mt_relevance_macros.$mt$.rebind(_prev_bind_2, thread);
            mt_relevance_macros.$relevant_mt_function$.rebind(_prev_bind_0, thread);
        }
        if (scg_api.NIL == tags) {
            tags = Mapping.mapcar((SubLObject)scg_api.$sym42$GAF_ARG1, kb_mapping.gather_predicate_extent_index(scg_api.$const43$scgTagRelevant, (SubLObject)scg_api.UNPROVIDED, (SubLObject)scg_api.UNPROVIDED));
        }
        if (scg_api.NIL != tags) {
            return string_utilities.bunge(tags, (SubLObject)scg_api.UNPROVIDED);
        }
        return (SubLObject)scg_api.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/nl/scg-api.lisp", position = 7437L)
    public static SubLObject scg_parse_term(final SubLObject string_to_parse, SubLObject tag_string, SubLObject lexical_mt) {
        if (tag_string == scg_api.UNPROVIDED) {
            tag_string = scg_api.$default_scg_tag_string$.getDynamicValue();
        }
        if (lexical_mt == scg_api.UNPROVIDED) {
            lexical_mt = (SubLObject)scg_api.NIL;
        }
        SubLObject terms = (SubLObject)scg_api.NIL;
        SubLObject cdolist_list_var;
        final SubLObject parses = cdolist_list_var = scg_parse(string_to_parse, (SubLObject)ConsesLow.list((SubLObject)scg_api.$kw44$TAG_STRING, tag_string, (SubLObject)scg_api.$kw22$LEXICAL_MT, lexical_mt));
        SubLObject parse = (SubLObject)scg_api.NIL;
        parse = cdolist_list_var.first();
        while (scg_api.NIL != cdolist_list_var) {
            if (cycl_utilities.formula_arg0(parse).eql(scg_api.$const45$equalSymbols) && scg_api.NIL != cycl_grammar.cycl_variable_p(cycl_utilities.formula_arg1(parse, (SubLObject)scg_api.UNPROVIDED))) {
                terms = (SubLObject)ConsesLow.cons(cycl_utilities.formula_arg2(parse, (SubLObject)scg_api.UNPROVIDED), terms);
            }
            cdolist_list_var = cdolist_list_var.rest();
            parse = cdolist_list_var.first();
        }
        return terms;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/nl/scg-api.lisp", position = 7845L)
    public static SubLObject scg_parse_test(final SubLObject string_to_parse, final SubLObject params, final SubLObject test, final SubLObject v_answer) {
        if (scg_api.NIL != params) {
            return Functions.funcall(test, scg_parse(string_to_parse, params), v_answer);
        }
        return Functions.funcall(test, scg_parse(string_to_parse, (SubLObject)scg_api.UNPROVIDED), v_answer);
    }
    
    public static SubLObject declare_scg_api_file() {
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.nl.scg_api", "get_scg_parser_port", "GET-SCG-PARSER-PORT", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.nl.scg_api", "get_scg_parser_callback_host", "GET-SCG-PARSER-CALLBACK-HOST", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.nl.scg_api", "get_scg_parser_callback_port", "GET-SCG-PARSER-CALLBACK-PORT", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.nl.scg_api", "set_scg_parse_host", "SET-SCG-PARSE-HOST", 2, 2, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.nl.scg_api", "get_scg_parse_results_in_xml", "GET-SCG-PARSE-RESULTS-IN-XML", 1, 4, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.nl.scg_api", "scg_parse", "SCG-PARSE", 1, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.nl.scg_api", "clear_scg_lexical_mt", "CLEAR-SCG-LEXICAL-MT", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.nl.scg_api", "remove_scg_lexical_mt", "REMOVE-SCG-LEXICAL-MT", 0, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.nl.scg_api", "scg_lexical_mt_internal", "SCG-LEXICAL-MT-INTERNAL", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.nl.scg_api", "scg_lexical_mt", "SCG-LEXICAL-MT", 0, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.nl.scg_api", "scg_construction_tag_string", "SCG-CONSTRUCTION-TAG-STRING", 0, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.nl.scg_api", "scg_parse_term", "SCG-PARSE-TERM", 1, 2, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.nl.scg_api", "scg_parse_test", "SCG-PARSE-TEST", 4, 0, false);
        return (SubLObject)scg_api.NIL;
    }
    
    public static SubLObject init_scg_api_file() {
        scg_api.$scg_parser_host$ = SubLFiles.defparameter("*SCG-PARSER-HOST*", (SubLObject)scg_api.$str0$localhost);
        scg_api.$scg_parser_port$ = SubLFiles.defparameter("*SCG-PARSER-PORT*", (SubLObject)scg_api.$kw1$UNINITIALIZED);
        scg_api.$scg_default_max_time$ = SubLFiles.defparameter("*SCG-DEFAULT-MAX-TIME*", Numbers.multiply((SubLObject)scg_api.TEN_INTEGER, (SubLObject)scg_api.$int3$60));
        scg_api.$scg_parser_callback_host$ = SubLFiles.defparameter("*SCG-PARSER-CALLBACK-HOST*", (SubLObject)scg_api.$kw1$UNINITIALIZED);
        scg_api.$scg_parser_callback_port$ = SubLFiles.defparameter("*SCG-PARSER-CALLBACK-PORT*", (SubLObject)scg_api.$kw1$UNINITIALIZED);
        scg_api.$scg_parser_callback_fallback_host$ = SubLFiles.defparameter("*SCG-PARSER-CALLBACK-FALLBACK-HOST*", (SubLObject)scg_api.$str4$public1_cyc_com);
        scg_api.$scg_parser_callback_fallback_base_port$ = SubLFiles.defparameter("*SCG-PARSER-CALLBACK-FALLBACK-BASE-PORT*", (SubLObject)scg_api.$int5$3600);
        scg_api.$default_scg_tag_string$ = SubLFiles.defparameter("*DEFAULT-SCG-TAG-STRING*", (SubLObject)scg_api.$str6$general);
        scg_api.$scg_lexical_mt_caching_state$ = SubLFiles.deflexical("*SCG-LEXICAL-MT-CACHING-STATE*", (SubLObject)scg_api.NIL);
        return (SubLObject)scg_api.NIL;
    }
    
    public static SubLObject setup_scg_api_file() {
        memoization_state.note_globally_cached_function((SubLObject)scg_api.$sym29$SCG_LEXICAL_MT);
        generic_testing.define_test_case_table_int((SubLObject)scg_api.$sym46$SCG_PARSE_TEST, (SubLObject)ConsesLow.list(new SubLObject[] { scg_api.$kw47$TEST, scg_api.EQUAL, scg_api.$kw48$OWNER, scg_api.NIL, scg_api.$kw49$CLASSES, scg_api.NIL, scg_api.$kw50$KB, scg_api.$kw51$FULL, scg_api.$kw52$WORKING_, scg_api.T }), (SubLObject)scg_api.$list53);
        return (SubLObject)scg_api.NIL;
    }
    
    public void declareFunctions() {
        declare_scg_api_file();
    }
    
    public void initializeVariables() {
        init_scg_api_file();
    }
    
    public void runTopLevelForms() {
        setup_scg_api_file();
    }
    
    static {
        me = (SubLFile)new scg_api();
        scg_api.$scg_parser_host$ = null;
        scg_api.$scg_parser_port$ = null;
        scg_api.$scg_default_max_time$ = null;
        scg_api.$scg_parser_callback_host$ = null;
        scg_api.$scg_parser_callback_port$ = null;
        scg_api.$scg_parser_callback_fallback_host$ = null;
        scg_api.$scg_parser_callback_fallback_base_port$ = null;
        scg_api.$default_scg_tag_string$ = null;
        scg_api.$scg_lexical_mt_caching_state$ = null;
        $str0$localhost = SubLObjectFactory.makeString("localhost");
        $kw1$UNINITIALIZED = SubLObjectFactory.makeKeyword("UNINITIALIZED");
        $str2$Unable_to_initialize__A__ = SubLObjectFactory.makeString("Unable to initialize ~A~%");
        $int3$60 = SubLObjectFactory.makeInteger(60);
        $str4$public1_cyc_com = SubLObjectFactory.makeString("public1.cyc.com");
        $int5$3600 = SubLObjectFactory.makeInteger(3600);
        $str6$general = SubLObjectFactory.makeString("general");
        $str7$true = SubLObjectFactory.makeString("true");
        $str8$false = SubLObjectFactory.makeString("false");
        $str9$ = SubLObjectFactory.makeString("");
        $str10$http___ = SubLObjectFactory.makeString("http://");
        $str11$_ = SubLObjectFactory.makeString(":");
        $str12$_scg_text_translate_clearCaches_ = SubLObjectFactory.makeString("/scg/text/translate?clearCaches=");
        $str13$_inputText_ = SubLObjectFactory.makeString("&inputText=");
        $str14$_templateTags_ = SubLObjectFactory.makeString("&templateTags=");
        $str15$_cycHost_ = SubLObjectFactory.makeString("&cycHost=");
        $str16$_cycPort_ = SubLObjectFactory.makeString("&cycPort=");
        $str17$_lexicalMt_ = SubLObjectFactory.makeString("&lexicalMt=");
        $str18$_timeoutMsec_ = SubLObjectFactory.makeString("&timeoutMsec=");
        $int19$1000 = SubLObjectFactory.makeInteger(1000);
        $list20 = ConsesLow.list((SubLObject)SubLObjectFactory.makeString("text/xml"));
        $kw21$TAG_STRING_PARAMETER = SubLObjectFactory.makeKeyword("TAG-STRING-PARAMETER");
        $kw22$LEXICAL_MT = SubLObjectFactory.makeKeyword("LEXICAL-MT");
        $kw23$CLEAR_CACHES_ = SubLObjectFactory.makeKeyword("CLEAR-CACHES?");
        $kw24$COMPLETE_MATCHES_ONLY_ = SubLObjectFactory.makeKeyword("COMPLETE-MATCHES-ONLY?");
        $kw25$MAX_TIME = SubLObjectFactory.makeKeyword("MAX-TIME");
        $str26$source = SubLObjectFactory.makeString("source");
        $str27$start = SubLObjectFactory.makeString("start");
        $str28$_cycl = SubLObjectFactory.makeString(":cycl");
        $sym29$SCG_LEXICAL_MT = SubLObjectFactory.makeSymbol("SCG-LEXICAL-MT");
        $sym30$_LEX_MT = SubLObjectFactory.makeSymbol("?LEX-MT");
        $const31$scgLexicalMts = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("scgLexicalMts"));
        $list32 = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("?LEX-MT"));
        $const33$InferencePSC = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("InferencePSC"));
        $const34$MtUnionFn = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("MtUnionFn"));
        $sym35$_SCG_LEXICAL_MT_CACHING_STATE_ = SubLObjectFactory.makeSymbol("*SCG-LEXICAL-MT-CACHING-STATE*");
        $int36$32 = SubLObjectFactory.makeInteger(32);
        $sym37$CLEAR_SCG_LEXICAL_MT = SubLObjectFactory.makeSymbol("CLEAR-SCG-LEXICAL-MT");
        $sym38$RELEVANT_MT_IS_EVERYTHING = SubLObjectFactory.makeSymbol("RELEVANT-MT-IS-EVERYTHING");
        $const39$EverythingPSC = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("EverythingPSC"));
        $sym40$GAF_ARG2 = SubLObjectFactory.makeSymbol("GAF-ARG2");
        $const41$scgTags = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("scgTags"));
        $sym42$GAF_ARG1 = SubLObjectFactory.makeSymbol("GAF-ARG1");
        $const43$scgTagRelevant = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("scgTagRelevant"));
        $kw44$TAG_STRING = SubLObjectFactory.makeKeyword("TAG-STRING");
        $const45$equalSymbols = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("equalSymbols"));
        $sym46$SCG_PARSE_TEST = SubLObjectFactory.makeSymbol("SCG-PARSE-TEST");
        $kw47$TEST = SubLObjectFactory.makeKeyword("TEST");
        $kw48$OWNER = SubLObjectFactory.makeKeyword("OWNER");
        $kw49$CLASSES = SubLObjectFactory.makeKeyword("CLASSES");
        $kw50$KB = SubLObjectFactory.makeKeyword("KB");
        $kw51$FULL = SubLObjectFactory.makeKeyword("FULL");
        $kw52$WORKING_ = SubLObjectFactory.makeKeyword("WORKING?");
        $list53 = ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeString("Barack Obama flick flork flack"), (SubLObject)scg_api.NIL, (SubLObject)scg_api.EQUAL, (SubLObject)scg_api.NIL), (SubLObject)scg_api.T), (SubLObject)ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeString("Barack Obama was born in 1961"), (SubLObject)scg_api.NIL, (SubLObject)SubLObjectFactory.makeSymbol("HAS-MEMBER-EQUAL?"), (SubLObject)ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("birthDate")), constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("BarackObama")), (SubLObject)ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("YearFn")), (SubLObject)SubLObjectFactory.makeInteger(1961)))), (SubLObject)scg_api.T), (SubLObject)ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeString("Barack Obama was born blarg in 1961"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("COMPLETE-MATCHES-ONLY?"), (SubLObject)scg_api.NIL), (SubLObject)SubLObjectFactory.makeSymbol("HAS-MEMBER-EQUAL?"), (SubLObject)ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("equalSymbols")), (SubLObject)SubLObjectFactory.makeSymbol("?X"), constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("BarackObama")))), (SubLObject)scg_api.T), (SubLObject)ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeString("Barack Obama was born in 1961"), (SubLObject)scg_api.NIL, (SubLObject)SubLObjectFactory.makeSymbol("NOT-HAS-MEMBER-EQUAL?"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("QUOTE"), (SubLObject)ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("equalSymbols")), (SubLObject)SubLObjectFactory.makeSymbol("?X"), constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("BarackObama"))))), (SubLObject)scg_api.T));
    }
}

/*

	Total time: 79 ms
	
*/