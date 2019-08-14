package com.cyc.cycjava.cycl;


import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Numbers.subtract;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Sequences.cconcatenate;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Sequences.length;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Symbols.symbol_function;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Time.get_universal_time;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Values.nth_value_step_1;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Values.nth_value_step_2;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Values.values;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.makeInteger;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.makeKeyword;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.makeString;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.makeSymbol;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.conses_high.second;
import static com.cyc.tool.subl.util.SubLFiles.declareFunction;
import static com.cyc.tool.subl.util.SubLFiles.deflexical;

import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Errors;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.SubLThread;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObject;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLProcess;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLString;
import com.cyc.tool.subl.jrtl.nativeCode.type.number.SubLInteger;
import com.cyc.tool.subl.jrtl.nativeCode.type.symbol.SubLSymbol;
import com.cyc.tool.subl.util.SubLFile;
import com.cyc.tool.subl.util.SubLTrampolineFile;
import com.cyc.tool.subl.util.SubLTranslatedFile;


public final class xml_retrieval extends SubLTranslatedFile implements V10 {
    public static final SubLFile me = new xml_retrieval();

    public static final String myName = "com.cyc.cycjava_2.cycl.xml_retrieval";


    // deflexical
    private static final SubLSymbol $xml_retrieval_cache$ = makeSymbol("*XML-RETRIEVAL-CACHE*");

    private static final SubLInteger $int$80 = makeInteger(80);

    private static final SubLString $str1$ = makeString("");



    private static final SubLString $str3$Timed_out_getting__S_from__S__Rea = makeString("Timed out getting ~S from ~S: Reason: ~S");



    private static final SubLInteger $int$128 = makeInteger(128);

    private static final SubLSymbol $CACHE_TIME = makeKeyword("CACHE-TIME");



    private static final SubLString $str8$_ = makeString(":");

    public static SubLObject get_xml_sexpr(final SubLObject machine, final SubLObject url, SubLObject port) {
        if (port == UNPROVIDED) {
            port = $int$80;
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        thread.resetMultipleValues();
        SubLObject tokens = xml_parsing_utilities.xml_tokenized_http_request(machine, url, $str1$, $GET, port, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
        final SubLObject timeout_reason = thread.secondMultipleValue();
        final SubLObject error_message = thread.thirdMultipleValue();
        thread.resetMultipleValues();
        if (NIL != string_utilities.non_empty_stringP(error_message)) {
            Errors.error(error_message);
        } else
            if (NIL != timeout_reason) {
                Errors.warn($str3$Timed_out_getting__S_from__S__Rea, url, machine, timeout_reason);
            }

        while ((NIL == list_utilities.empty_list_p(tokens)) && (NIL == xml_parsing_utilities.xml_opening_tag_p(tokens.first()))) {
            tokens = tokens.rest();
        } 
        return xml_parsing_utilities.xml_tokens_to_sexpr(tokens);
    }

    public static SubLObject get_xml_field_value(final SubLObject machine, final SubLObject url, final SubLObject field_name, SubLObject staleness_cutoff, SubLObject port, SubLObject cache_resultsP) {
        if (staleness_cutoff == UNPROVIDED) {
            staleness_cutoff = NIL;
        }
        if (port == UNPROVIDED) {
            port = $int$80;
        }
        if (cache_resultsP == UNPROVIDED) {
            cache_resultsP = T;
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        if (((NIL != staleness_cutoff) && (!SubLTrampolineFile.assertionsDisabledInClass)) && (NIL == subl_promotions.non_negative_integer_p(staleness_cutoff))) {
            throw new AssertionError(staleness_cutoff);
        }
        if (!ZERO_INTEGER.eql(staleness_cutoff)) {
            thread.resetMultipleValues();
            final SubLObject cached_value = lookup_cached_xml_retrieval_data(machine, url, port, field_name);
            final SubLObject cache_time = thread.secondMultipleValue();
            thread.resetMultipleValues();
            if ((NIL != cache_time) && ((NIL == staleness_cutoff) || subtract(get_universal_time(), cache_time).numL(staleness_cutoff))) {
                return cached_value;
            }
        }
        final SubLObject sexpr = get_xml_sexpr(machine, url, port);
        if (NIL != cache_resultsP) {
            cache_xml_retrieval_data(machine, url, port, sexpr);
            return nth_value_step_2(nth_value_step_1(ZERO_INTEGER), lookup_cached_xml_retrieval_data(machine, url, port, field_name));
        }
        return xml_parsing_utilities.get_field_value_from_xml_sexpr(field_name, sexpr);
    }

    public static SubLObject cache_xml_retrieval_data(final SubLObject machine, final SubLObject url, final SubLObject port, final SubLObject sexpr) {
        final SubLObject key = make_xml_retrival_key(machine, port);
        SubLObject machine_cache = cache.cache_get($xml_retrieval_cache$.getGlobalValue(), key);
        if (NIL == cache.cache_p(machine_cache)) {
            machine_cache = cache.new_cache($int$128, symbol_function(EQUAL));
            cache.cache_set($xml_retrieval_cache$.getGlobalValue(), key, machine_cache);
        }
        SubLObject url_cache = cache.cache_get(machine_cache, url);
        if (NIL == map_utilities.map_p(url_cache)) {
            url_cache = dictionary.new_dictionary(symbol_function(EQUAL), length(sexpr));
            cache.cache_set(machine_cache, url, url_cache);
        }
        map_utilities.map_remove_all(url_cache);
        map_utilities.map_put(url_cache, $CACHE_TIME, get_universal_time());
        SubLObject cdolist_list_var = sexpr.rest();
        SubLObject child = NIL;
        child = cdolist_list_var.first();
        while (NIL != cdolist_list_var) {
            final SubLObject field = child.first().first();
            final SubLObject value = second(child);
            map_utilities.map_put(url_cache, field, value);
            cdolist_list_var = cdolist_list_var.rest();
            child = cdolist_list_var.first();
        } 
        return NIL;
    }

    public static SubLObject lookup_cached_xml_retrieval_data(final SubLObject machine, final SubLObject url, final SubLObject port, final SubLObject field_name) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject key = make_xml_retrival_key(machine, port);
        final SubLObject machine_cache = cache.cache_get($xml_retrieval_cache$.getGlobalValue(), key);
        if (NIL != cache.cache_p(machine_cache)) {
            final SubLObject url_cache = cache.cache_get(machine_cache, url);
            if (NIL != map_utilities.map_p(url_cache)) {
                thread.resetMultipleValues();
                final SubLObject value = map_utilities.map_get(url_cache, field_name, UNPROVIDED);
                final SubLObject key_presentP = thread.secondMultipleValue();
                thread.resetMultipleValues();
                if (NIL != key_presentP) {
                    return values(value, map_utilities.map_get(url_cache, $CACHE_TIME, UNPROVIDED));
                }
            }
        }
        return values(NIL, NIL);
    }

    public static SubLObject make_xml_retrival_key(final SubLObject machine, final SubLObject port) {
        if (port.eql($int$80) || port.eql($DEFAULT)) {
            return machine;
        }
        return cconcatenate(format_nil.format_nil_a_no_copy(machine), new SubLObject[]{ $str8$_, format_nil.format_nil_a_no_copy(port) });
    }

    public static SubLObject declare_xml_retrieval_file() {
        declareFunction("get_xml_sexpr", "GET-XML-SEXPR", 2, 1, false);
        declareFunction("get_xml_field_value", "GET-XML-FIELD-VALUE", 3, 3, false);
        declareFunction("cache_xml_retrieval_data", "CACHE-XML-RETRIEVAL-DATA", 4, 0, false);
        declareFunction("lookup_cached_xml_retrieval_data", "LOOKUP-CACHED-XML-RETRIEVAL-DATA", 4, 0, false);
        declareFunction("make_xml_retrival_key", "MAKE-XML-RETRIVAL-KEY", 2, 0, false);
        return NIL;
    }

    public static SubLObject init_xml_retrieval_file() {
        deflexical("*XML-RETRIEVAL-CACHE*", cache.new_cache(SIXTEEN_INTEGER, symbol_function(EQUAL)));
        return NIL;
    }

    public static SubLObject setup_xml_retrieval_file() {
        return NIL;
    }

    @Override
    public void declareFunctions() {
        declare_xml_retrieval_file();
    }

    @Override
    public void initializeVariables() {
        init_xml_retrieval_file();
    }

    @Override
    public void runTopLevelForms() {
        setup_xml_retrieval_file();
    }

    static {











    }
}

/**
 * Total time: 146 ms synthetic
 */
