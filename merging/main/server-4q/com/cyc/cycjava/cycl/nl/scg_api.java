package com.cyc.cycjava.cycl.nl;


import static com.cyc.cycjava.cycl.constant_handles.reader_make_constant_shell;
import static com.cyc.cycjava.cycl.cyc_testing.generic_testing.define_test_case_table_int;
import static com.cyc.cycjava.cycl.el_utilities.make_formula;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow.cons;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow.list;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow.listS;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Functions.funcall;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Numbers.add;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Numbers.max;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Numbers.multiply;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Numbers.subtract;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Sequences.cconcatenate;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Sequences.length;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Values.arg2;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Values.multiple_value_list;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Values.resetMultipleValues;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Values.values;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.makeInteger;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.makeKeyword;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.makeString;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.makeSymbol;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.conses_high.getf;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.reader.read_from_string_ignoring_errors;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.streams_high.make_private_string_input_stream;
import static com.cyc.tool.subl.util.SubLFiles.declareFunction;
import static com.cyc.tool.subl.util.SubLFiles.deflexical;
import static com.cyc.tool.subl.util.SubLFiles.defparameter;

import com.cyc.cycjava.cycl.V10;
import com.cyc.cycjava.cycl.cycl_grammar;
import com.cyc.cycjava.cycl.cycl_utilities;
import com.cyc.cycjava.cycl.format_nil;
import com.cyc.cycjava.cycl.http_kernel;
import com.cyc.cycjava.cycl.iteration;
import com.cyc.cycjava.cycl.kb_mapping;
import com.cyc.cycjava.cycl.list_utilities;
import com.cyc.cycjava.cycl.memoization_state;
import com.cyc.cycjava.cycl.misc_utilities;
import com.cyc.cycjava.cycl.mt_relevance_macros;
import com.cyc.cycjava.cycl.string_utilities;
import com.cyc.cycjava.cycl.system_parameters;
import com.cyc.cycjava.cycl.web_utilities;
import com.cyc.cycjava.cycl.xml_parsing_utilities;
import com.cyc.cycjava.cycl.xml_utilities;
import com.cyc.cycjava.cycl.inference.ask_utilities;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Errors;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Mapping;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.SubLThread;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLList;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObject;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLProcess;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLString;
import com.cyc.tool.subl.jrtl.nativeCode.type.number.SubLInteger;
import com.cyc.tool.subl.jrtl.nativeCode.type.symbol.SubLSymbol;
import com.cyc.tool.subl.util.SubLFile;
import com.cyc.tool.subl.util.SubLTranslatedFile;


public final class scg_api extends SubLTranslatedFile implements V10 {
    public static final SubLFile me = new scg_api();

    public static final String myName = "com.cyc.cycjava_2.cycl.nl.scg_api";


    // defparameter
    public static final SubLSymbol $scg_parser_host$ = makeSymbol("*SCG-PARSER-HOST*");

    // defparameter
    private static final SubLSymbol $scg_parser_port$ = makeSymbol("*SCG-PARSER-PORT*");

    // defparameter
    private static final SubLSymbol $scg_default_max_time$ = makeSymbol("*SCG-DEFAULT-MAX-TIME*");

    // defparameter
    private static final SubLSymbol $scg_parser_callback_host$ = makeSymbol("*SCG-PARSER-CALLBACK-HOST*");

    // defparameter
    private static final SubLSymbol $scg_parser_callback_port$ = makeSymbol("*SCG-PARSER-CALLBACK-PORT*");

    // defparameter
    private static final SubLSymbol $scg_parser_callback_fallback_host$ = makeSymbol("*SCG-PARSER-CALLBACK-FALLBACK-HOST*");

    // defparameter
    private static final SubLSymbol $scg_parser_callback_fallback_base_port$ = makeSymbol("*SCG-PARSER-CALLBACK-FALLBACK-BASE-PORT*");

    // defparameter
    public static final SubLSymbol $default_scg_tag_string$ = makeSymbol("*DEFAULT-SCG-TAG-STRING*");



    private static final SubLString $$$localhost = makeString("localhost");



    private static final SubLString $str2$Unable_to_initialize__A__ = makeString("Unable to initialize ~A~%");

    private static final SubLInteger $int$60 = makeInteger(60);

    private static final SubLString $str4$public1_cyc_com = makeString("public1.cyc.com");

    private static final SubLInteger $int$3600 = makeInteger(3600);

    private static final SubLString $$$general = makeString("general");

    private static final SubLString $$$true = makeString("true");

    private static final SubLString $$$false = makeString("false");

    private static final SubLString $str9$ = makeString("");

    private static final SubLString $str10$http___ = makeString("http://");

    private static final SubLString $str11$_ = makeString(":");

    private static final SubLString $str12$_scg_text_translate_clearCaches_ = makeString("/scg/text/translate?clearCaches=");

    private static final SubLString $str13$_inputText_ = makeString("&inputText=");

    private static final SubLString $str14$_templateTags_ = makeString("&templateTags=");

    private static final SubLString $str15$_cycHost_ = makeString("&cycHost=");

    private static final SubLString $str16$_cycPort_ = makeString("&cycPort=");

    private static final SubLString $str17$_lexicalMt_ = makeString("&lexicalMt=");

    private static final SubLString $str18$_timeoutMsec_ = makeString("&timeoutMsec=");



    private static final SubLList $list20 = list(makeString("text/xml"));

    private static final SubLSymbol $TAG_STRING_PARAMETER = makeKeyword("TAG-STRING-PARAMETER");



    private static final SubLSymbol $kw23$CLEAR_CACHES_ = makeKeyword("CLEAR-CACHES?");

    private static final SubLSymbol $kw24$COMPLETE_MATCHES_ONLY_ = makeKeyword("COMPLETE-MATCHES-ONLY?");



    private static final SubLString $$$source = makeString("source");

    private static final SubLString $$$start = makeString("start");

    private static final SubLString $str28$_cycl = makeString(":cycl");

    private static final SubLSymbol SCG_LEXICAL_MT = makeSymbol("SCG-LEXICAL-MT");

    private static final SubLSymbol $sym30$_LEX_MT = makeSymbol("?LEX-MT");

    private static final SubLObject $$scgLexicalMts = reader_make_constant_shell(makeString("scgLexicalMts"));

    private static final SubLList $list32 = list(makeSymbol("?LEX-MT"));

    private static final SubLObject $$InferencePSC = reader_make_constant_shell(makeString("InferencePSC"));

    private static final SubLObject $$MtUnionFn = reader_make_constant_shell(makeString("MtUnionFn"));

    private static final SubLSymbol $scg_lexical_mt_caching_state$ = makeSymbol("*SCG-LEXICAL-MT-CACHING-STATE*");



    private static final SubLSymbol CLEAR_SCG_LEXICAL_MT = makeSymbol("CLEAR-SCG-LEXICAL-MT");



    private static final SubLObject $$EverythingPSC = reader_make_constant_shell(makeString("EverythingPSC"));



    private static final SubLObject $$scgTags = reader_make_constant_shell(makeString("scgTags"));



    private static final SubLObject $$scgTagRelevant = reader_make_constant_shell(makeString("scgTagRelevant"));

    private static final SubLSymbol $TAG_STRING = makeKeyword("TAG-STRING");

    private static final SubLObject $$equalSymbols = reader_make_constant_shell(makeString("equalSymbols"));

    private static final SubLSymbol SCG_PARSE_TEST = makeSymbol("SCG-PARSE-TEST");













    private static final SubLList $list53 = list(list(list(makeString("Barack Obama flick flork flack"), NIL, EQUAL, NIL), T), list(list(makeString("Barack Obama was born in 1961"), NIL, makeSymbol("HAS-MEMBER-EQUAL?"), list(reader_make_constant_shell(makeString("birthDate")), reader_make_constant_shell(makeString("BarackObama")), list(reader_make_constant_shell(makeString("YearFn")), makeInteger(1961)))), T), list(list(makeString("Barack Obama was born blarg in 1961"), list(makeKeyword("COMPLETE-MATCHES-ONLY?"), NIL), makeSymbol("HAS-MEMBER-EQUAL?"), list(reader_make_constant_shell(makeString("equalSymbols")), makeSymbol("?X"), reader_make_constant_shell(makeString("BarackObama")))), T), list(list(makeString("Barack Obama was born in 1961"), NIL, makeSymbol("NOT-HAS-MEMBER-EQUAL?"), list(QUOTE, list(reader_make_constant_shell(makeString("equalSymbols")), makeSymbol("?X"), reader_make_constant_shell(makeString("BarackObama"))))), T));

    public static SubLObject get_scg_parser_port() {
        final SubLThread thread = SubLProcess.currentSubLThread();
        if ($scg_parser_port$.getDynamicValue(thread) == $UNINITIALIZED) {
            final SubLObject init_value = web_utilities.servlet_container_port();
            if (init_value == $UNINITIALIZED) {
                Errors.error($str2$Unable_to_initialize__A__, $scg_parser_port$.getDynamicValue(thread));
            }
            $scg_parser_port$.setDynamicValue(init_value, thread);
        }
        return $scg_parser_port$.getDynamicValue(thread);
    }

    public static SubLObject get_scg_parser_callback_host() {
        final SubLThread thread = SubLProcess.currentSubLThread();
        if ($scg_parser_callback_host$.getDynamicValue(thread) == $UNINITIALIZED) {
            final SubLObject init_value = misc_utilities.machine_name();
            if (init_value == $UNINITIALIZED) {
                Errors.error($str2$Unable_to_initialize__A__, $scg_parser_callback_host$.getDynamicValue(thread));
            }
            $scg_parser_callback_host$.setDynamicValue(init_value, thread);
        }
        return $scg_parser_callback_host$.getDynamicValue(thread);
    }

    public static SubLObject get_scg_parser_callback_port() {
        final SubLThread thread = SubLProcess.currentSubLThread();
        if ($scg_parser_callback_port$.getDynamicValue(thread) == $UNINITIALIZED) {
            final SubLObject init_value = http_kernel.http_port();
            if (init_value == $UNINITIALIZED) {
                Errors.error($str2$Unable_to_initialize__A__, $scg_parser_callback_port$.getDynamicValue(thread));
            }
            $scg_parser_callback_port$.setDynamicValue(init_value, thread);
        }
        return $scg_parser_callback_port$.getDynamicValue(thread);
    }

    public static SubLObject set_scg_parse_host(final SubLObject parser_host, final SubLObject parser_base_port, SubLObject callback_host, SubLObject callback_base_port) {
        if (callback_host == UNPROVIDED) {
            callback_host = misc_utilities.machine_name();
        }
        if (callback_base_port == UNPROVIDED) {
            callback_base_port = system_parameters.$base_tcp_port$.getDynamicValue();
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        $scg_parser_host$.setDynamicValue(parser_host, thread);
        $scg_parser_port$.setDynamicValue(add(parser_base_port, system_parameters.$servlet_port_offset$.getDynamicValue(thread)), thread);
        $scg_parser_callback_host$.setDynamicValue(callback_host, thread);
        $scg_parser_callback_port$.setDynamicValue(add(callback_base_port, system_parameters.$http_port_offset$.getDynamicValue(thread)), thread);
        return NIL;
    }

    public static SubLObject get_scg_parse_results_in_xml(final SubLObject string_to_parse, SubLObject max_time, SubLObject tag_string, SubLObject lexical_mt, SubLObject clear_cachesP) {
        if (max_time == UNPROVIDED) {
            max_time = $scg_default_max_time$.getDynamicValue();
        }
        if (tag_string == UNPROVIDED) {
            tag_string = $default_scg_tag_string$.getDynamicValue();
        }
        if (lexical_mt == UNPROVIDED) {
            lexical_mt = NIL;
        }
        if (clear_cachesP == UNPROVIDED) {
            clear_cachesP = NIL;
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject clear_caches_value = (NIL != clear_cachesP) ? $$$true : $$$false;
        final SubLObject lexical_mt_string = (NIL != lexical_mt) ? lexical_mt : $str9$;
        final SubLObject scg_parser_host = $scg_parser_host$.getDynamicValue(thread);
        final SubLObject scg_parser_port = get_scg_parser_port();
        final SubLObject scg_parser_callback_host = get_scg_parser_callback_host();
        final SubLObject scg_parser_callback_port = get_scg_parser_callback_port();
        final SubLObject url = cconcatenate($str10$http___, new SubLObject[]{ format_nil.format_nil_a_no_copy(scg_parser_host), $str11$_, format_nil.format_nil_a_no_copy(scg_parser_port), $str12$_scg_text_translate_clearCaches_, format_nil.format_nil_a_no_copy(clear_caches_value), $str13$_inputText_, format_nil.format_nil_a_no_copy(web_utilities.html_url_encode(string_to_parse, UNPROVIDED)), $str14$_templateTags_, format_nil.format_nil_a_no_copy(web_utilities.html_url_encode(tag_string, UNPROVIDED)), $str15$_cycHost_, format_nil.format_nil_a_no_copy(scg_parser_callback_host), $str16$_cycPort_, format_nil.format_nil_a_no_copy(subtract(scg_parser_callback_port, TWO_INTEGER)), $str17$_lexicalMt_, format_nil.format_nil_a_no_copy(lexical_mt_string), $str18$_timeoutMsec_, format_nil.format_nil_a_no_copy(multiply($int$1000, max_time)) });
        final SubLObject return_types = $list20;
        return values(web_utilities.dereference_url(url, NIL, return_types, NIL, add(TWO_INTEGER, $scg_default_max_time$.getDynamicValue(thread))), url);
    }

    public static SubLObject scg_parse(final SubLObject string_to_parse, SubLObject params) {
        if (params == UNPROVIDED) {
            params = list(new SubLObject[]{ $TAG_STRING_PARAMETER, NIL, $LEXICAL_MT, NIL, $kw23$CLEAR_CACHES_, NIL, $kw24$COMPLETE_MATCHES_ONLY_, T, $MAX_TIME, $scg_default_max_time$.getDynamicValue() });
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        params = list_utilities.augment_plist_with_defaults(params, list($kw24$COMPLETE_MATCHES_ONLY_, T, $MAX_TIME, $scg_default_max_time$.getDynamicValue(thread)));
        final SubLObject max_time = (NIL == getf(params, $MAX_TIME, UNPROVIDED)) ? ZERO_INTEGER : max(ONE_INTEGER, getf(params, $MAX_TIME, UNPROVIDED));
        final SubLObject tag_string = (NIL != getf(params, $TAG_STRING_PARAMETER, UNPROVIDED)) ? getf(params, $TAG_STRING_PARAMETER, UNPROVIDED) : scg_construction_tag_string(UNPROVIDED);
        final SubLObject final_lexical_mt = (NIL != getf(params, $LEXICAL_MT, UNPROVIDED)) ? getf(params, $LEXICAL_MT, UNPROVIDED) : scg_lexical_mt(UNPROVIDED);
        final SubLObject lexical_mt_string = (NIL != final_lexical_mt) ? string_utilities.string_remove_constant_reader_prefixes(string_utilities.to_string(final_lexical_mt)) : $str9$;
        final SubLObject complete_matchesP = getf(params, $kw24$COMPLETE_MATCHES_ONLY_, T);
        final SubLObject clear_caches = (NIL != getf(params, $kw23$CLEAR_CACHES_, UNPROVIDED)) ? getf(params, $kw23$CLEAR_CACHES_, UNPROVIDED) : NIL;
        thread.resetMultipleValues();
        final SubLObject xml_string = get_scg_parse_results_in_xml(string_to_parse, max_time, tag_string, lexical_mt_string, clear_caches);
        final SubLObject url = thread.secondMultipleValue();
        thread.resetMultipleValues();
        final SubLObject token_iterator = xml_parsing_utilities.new_xml_token_iterator(make_private_string_input_stream(xml_string, UNPROVIDED, UNPROVIDED), UNPROVIDED, UNPROVIDED, UNPROVIDED);
        SubLObject working_on_correct_string = NIL;
        SubLObject current_string = NIL;
        SubLObject current_offset = NIL;
        SubLObject cycls = NIL;
        SubLObject strings = NIL;
        SubLObject offsets = NIL;
        while (NIL == iteration.iteration_done(token_iterator)) {
            final SubLObject token = iteration.iteration_next(token_iterator);
            final SubLObject element_name = xml_parsing_utilities.xml_token_element_name(token);
            if ((NIL != xml_parsing_utilities.xml_opening_tag_p(token)) && $$$source.equal(element_name)) {
                current_offset = read_from_string_ignoring_errors(xml_parsing_utilities.xml_tag_attribute_value(token, $$$start, UNPROVIDED), UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
                current_string = xml_utilities.xml_unescape_string(iteration.iteration_next(token_iterator));
                working_on_correct_string = list_utilities.lengthE(string_to_parse, length(current_string), UNPROVIDED);
            }
            if ((((NIL != working_on_correct_string) || (NIL == complete_matchesP)) && (NIL != xml_parsing_utilities.xml_opening_tag_p(token))) && (NIL != string_utilities.ends_with(element_name, $str28$_cycl, UNPROVIDED))) {
                cycls = cons(read_from_string_ignoring_errors(iteration.iteration_next(token_iterator), UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED), cycls);
                strings = cons(current_string, strings);
                offsets = cons(current_offset, offsets);
            }
        } 
        return values(cycls, url, strings, offsets);
    }

    public static SubLObject clear_scg_lexical_mt() {
        final SubLObject cs = $scg_lexical_mt_caching_state$.getGlobalValue();
        if (NIL != cs) {
            memoization_state.caching_state_clear(cs);
        }
        return NIL;
    }

    public static SubLObject remove_scg_lexical_mt(SubLObject mt) {
        if (mt == UNPROVIDED) {
            mt = mt_relevance_macros.$mt$.getDynamicValue();
        }
        return memoization_state.caching_state_remove_function_results_with_args($scg_lexical_mt_caching_state$.getGlobalValue(), list(mt), UNPROVIDED, UNPROVIDED);
    }

    public static SubLObject scg_lexical_mt_internal(final SubLObject mt) {
        final SubLObject lexical_mts = ask_utilities.query_variable($sym30$_LEX_MT, listS($$scgLexicalMts, mt, $list32), $$InferencePSC, UNPROVIDED);
        if (NIL != list_utilities.lengthG(lexical_mts, ONE_INTEGER, UNPROVIDED)) {
            return make_formula($$MtUnionFn, lexical_mts, UNPROVIDED);
        }
        if (NIL != list_utilities.lengthE(lexical_mts, ONE_INTEGER, UNPROVIDED)) {
            return lexical_mts.first();
        }
        return NIL;
    }

    public static SubLObject scg_lexical_mt(SubLObject mt) {
        if (mt == UNPROVIDED) {
            mt = mt_relevance_macros.$mt$.getDynamicValue();
        }
        SubLObject caching_state = $scg_lexical_mt_caching_state$.getGlobalValue();
        if (NIL == caching_state) {
            caching_state = memoization_state.create_global_caching_state_for_name(SCG_LEXICAL_MT, $scg_lexical_mt_caching_state$, $int$32, EQL, ONE_INTEGER, ZERO_INTEGER);
            memoization_state.register_hl_store_cache_clear_callback(CLEAR_SCG_LEXICAL_MT);
        }
        SubLObject results = memoization_state.caching_state_lookup(caching_state, mt, memoization_state.$memoized_item_not_found$.getGlobalValue());
        if (results.eql(memoization_state.$memoized_item_not_found$.getGlobalValue())) {
            results = arg2(resetMultipleValues(), multiple_value_list(scg_lexical_mt_internal(mt)));
            memoization_state.caching_state_put(caching_state, mt, results, UNPROVIDED);
        }
        return memoization_state.caching_results(results);
    }

    public static SubLObject scg_construction_tag_string(SubLObject mt) {
        if (mt == UNPROVIDED) {
            mt = mt_relevance_macros.$mt$.getDynamicValue();
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject tags = NIL;
        final SubLObject _prev_bind_0 = mt_relevance_macros.$relevant_mt_function$.currentBinding(thread);
        final SubLObject _prev_bind_2 = mt_relevance_macros.$mt$.currentBinding(thread);
        try {
            mt_relevance_macros.$relevant_mt_function$.bind(RELEVANT_MT_IS_EVERYTHING, thread);
            mt_relevance_macros.$mt$.bind($$EverythingPSC, thread);
            tags = Mapping.mapcar(GAF_ARG2, kb_mapping.gather_gaf_arg_index(mt, ONE_INTEGER, $$scgTags, UNPROVIDED, UNPROVIDED));
        } finally {
            mt_relevance_macros.$mt$.rebind(_prev_bind_2, thread);
            mt_relevance_macros.$relevant_mt_function$.rebind(_prev_bind_0, thread);
        }
        if (NIL == tags) {
            tags = Mapping.mapcar(GAF_ARG1, kb_mapping.gather_predicate_extent_index($$scgTagRelevant, UNPROVIDED, UNPROVIDED));
        }
        if (NIL != tags) {
            return string_utilities.bunge(tags, UNPROVIDED);
        }
        return NIL;
    }

    public static SubLObject scg_parse_term(final SubLObject string_to_parse, SubLObject tag_string, SubLObject lexical_mt) {
        if (tag_string == UNPROVIDED) {
            tag_string = $default_scg_tag_string$.getDynamicValue();
        }
        if (lexical_mt == UNPROVIDED) {
            lexical_mt = NIL;
        }
        SubLObject terms = NIL;
        SubLObject cdolist_list_var;
        final SubLObject parses = cdolist_list_var = scg_parse(string_to_parse, list($TAG_STRING, tag_string, $LEXICAL_MT, lexical_mt));
        SubLObject parse = NIL;
        parse = cdolist_list_var.first();
        while (NIL != cdolist_list_var) {
            if (cycl_utilities.formula_arg0(parse).eql($$equalSymbols) && (NIL != cycl_grammar.cycl_variable_p(cycl_utilities.formula_arg1(parse, UNPROVIDED)))) {
                terms = cons(cycl_utilities.formula_arg2(parse, UNPROVIDED), terms);
            }
            cdolist_list_var = cdolist_list_var.rest();
            parse = cdolist_list_var.first();
        } 
        return terms;
    }

    public static SubLObject scg_parse_test(final SubLObject string_to_parse, final SubLObject params, final SubLObject test, final SubLObject v_answer) {
        if (NIL != params) {
            return funcall(test, scg_parse(string_to_parse, params), v_answer);
        }
        return funcall(test, scg_parse(string_to_parse, UNPROVIDED), v_answer);
    }

    public static SubLObject declare_scg_api_file() {
        declareFunction("get_scg_parser_port", "GET-SCG-PARSER-PORT", 0, 0, false);
        declareFunction("get_scg_parser_callback_host", "GET-SCG-PARSER-CALLBACK-HOST", 0, 0, false);
        declareFunction("get_scg_parser_callback_port", "GET-SCG-PARSER-CALLBACK-PORT", 0, 0, false);
        declareFunction("set_scg_parse_host", "SET-SCG-PARSE-HOST", 2, 2, false);
        declareFunction("get_scg_parse_results_in_xml", "GET-SCG-PARSE-RESULTS-IN-XML", 1, 4, false);
        declareFunction("scg_parse", "SCG-PARSE", 1, 1, false);
        declareFunction("clear_scg_lexical_mt", "CLEAR-SCG-LEXICAL-MT", 0, 0, false);
        declareFunction("remove_scg_lexical_mt", "REMOVE-SCG-LEXICAL-MT", 0, 1, false);
        declareFunction("scg_lexical_mt_internal", "SCG-LEXICAL-MT-INTERNAL", 1, 0, false);
        declareFunction("scg_lexical_mt", "SCG-LEXICAL-MT", 0, 1, false);
        declareFunction("scg_construction_tag_string", "SCG-CONSTRUCTION-TAG-STRING", 0, 1, false);
        declareFunction("scg_parse_term", "SCG-PARSE-TERM", 1, 2, false);
        declareFunction("scg_parse_test", "SCG-PARSE-TEST", 4, 0, false);
        return NIL;
    }

    public static SubLObject init_scg_api_file() {
        defparameter("*SCG-PARSER-HOST*", $$$localhost);
        defparameter("*SCG-PARSER-PORT*", $UNINITIALIZED);
        defparameter("*SCG-DEFAULT-MAX-TIME*", multiply(TEN_INTEGER, $int$60));
        defparameter("*SCG-PARSER-CALLBACK-HOST*", $UNINITIALIZED);
        defparameter("*SCG-PARSER-CALLBACK-PORT*", $UNINITIALIZED);
        defparameter("*SCG-PARSER-CALLBACK-FALLBACK-HOST*", $str4$public1_cyc_com);
        defparameter("*SCG-PARSER-CALLBACK-FALLBACK-BASE-PORT*", $int$3600);
        defparameter("*DEFAULT-SCG-TAG-STRING*", $$$general);
        deflexical("*SCG-LEXICAL-MT-CACHING-STATE*", NIL);
        return NIL;
    }

    public static SubLObject setup_scg_api_file() {
        memoization_state.note_globally_cached_function(SCG_LEXICAL_MT);
        define_test_case_table_int(SCG_PARSE_TEST, list(new SubLObject[]{ $TEST, EQUAL, $OWNER, NIL, $CLASSES, NIL, $KB, $FULL, $WORKING_, T }), $list53);
        return NIL;
    }

    @Override
    public void declareFunctions() {
        declare_scg_api_file();
    }

    @Override
    public void initializeVariables() {
        init_scg_api_file();
    }

    @Override
    public void runTopLevelForms() {
        setup_scg_api_file();
    }

    
}

/**
 * Total time: 79 ms
 */
