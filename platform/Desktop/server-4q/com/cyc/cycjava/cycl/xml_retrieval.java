package com.cyc.cycjava.cycl;

import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory;
import com.cyc.tool.subl.util.SubLFiles;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.conses_high;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Sequences;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Symbols;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Values;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Numbers;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Time;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.SubLThread;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Errors;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLProcess;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObject;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLString;
import com.cyc.tool.subl.jrtl.nativeCode.type.number.SubLInteger;
import com.cyc.tool.subl.jrtl.nativeCode.type.symbol.SubLSymbol;
import com.cyc.tool.subl.util.SubLFile;
import com.cyc.tool.subl.util.SubLTranslatedFile;

public final class xml_retrieval extends SubLTranslatedFile
{
    public static final SubLFile me;
    public static final String myName = "com.cyc.cycjava.cycl.xml_retrieval";
    public static final String myFingerPrint = "4f18a601af2ce50d874e59b41aec229258660130dc9777a97ce22fa89c571a25";
    @SubLTranslatedFile.SubL(source = "cycl/xml-retrieval.lisp", position = 2901L)
    private static SubLSymbol $xml_retrieval_cache$;
    private static final SubLInteger $int0$80;
    private static final SubLString $str1$;
    private static final SubLSymbol $kw2$GET;
    private static final SubLString $str3$Timed_out_getting__S_from__S__Rea;
    private static final SubLSymbol $sym4$NON_NEGATIVE_INTEGER_P;
    private static final SubLInteger $int5$128;
    private static final SubLSymbol $kw6$CACHE_TIME;
    private static final SubLSymbol $kw7$DEFAULT;
    private static final SubLString $str8$_;
    
    
    @SubLTranslatedFile.SubL(source = "cycl/xml-retrieval.lisp", position = 911L)
    public static SubLObject get_xml_sexpr(final SubLObject machine, final SubLObject url, SubLObject port) {
        if (port == xml_retrieval.UNPROVIDED) {
            port = (SubLObject)xml_retrieval.$int0$80;
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        thread.resetMultipleValues();
        SubLObject tokens = xml_parsing_utilities.xml_tokenized_http_request(machine, url, (SubLObject)xml_retrieval.$str1$, (SubLObject)xml_retrieval.$kw2$GET, port, (SubLObject)xml_retrieval.UNPROVIDED, (SubLObject)xml_retrieval.UNPROVIDED, (SubLObject)xml_retrieval.UNPROVIDED, (SubLObject)xml_retrieval.UNPROVIDED, (SubLObject)xml_retrieval.UNPROVIDED, (SubLObject)xml_retrieval.UNPROVIDED);
        final SubLObject timeout_reason = thread.secondMultipleValue();
        final SubLObject error_message = thread.thirdMultipleValue();
        thread.resetMultipleValues();
        if (xml_retrieval.NIL != string_utilities.non_empty_stringP(error_message)) {
            Errors.error(error_message);
        }
        else if (xml_retrieval.NIL != timeout_reason) {
            Errors.warn((SubLObject)xml_retrieval.$str3$Timed_out_getting__S_from__S__Rea, url, machine, timeout_reason);
        }
        while (xml_retrieval.NIL == list_utilities.empty_list_p(tokens) && xml_retrieval.NIL == xml_parsing_utilities.xml_opening_tag_p(tokens.first())) {
            tokens = tokens.rest();
        }
        return xml_parsing_utilities.xml_tokens_to_sexpr(tokens);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/xml-retrieval.lisp", position = 1530L)
    public static SubLObject get_xml_field_value(final SubLObject machine, final SubLObject url, final SubLObject field_name, SubLObject staleness_cutoff, SubLObject port, SubLObject cache_resultsP) {
        if (staleness_cutoff == xml_retrieval.UNPROVIDED) {
            staleness_cutoff = (SubLObject)xml_retrieval.NIL;
        }
        if (port == xml_retrieval.UNPROVIDED) {
            port = (SubLObject)xml_retrieval.$int0$80;
        }
        if (cache_resultsP == xml_retrieval.UNPROVIDED) {
            cache_resultsP = (SubLObject)xml_retrieval.T;
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        if (xml_retrieval.NIL != staleness_cutoff && !xml_retrieval.assertionsDisabledInClass && xml_retrieval.NIL == subl_promotions.non_negative_integer_p(staleness_cutoff)) {
            throw new AssertionError(staleness_cutoff);
        }
        if (!xml_retrieval.ZERO_INTEGER.eql(staleness_cutoff)) {
            thread.resetMultipleValues();
            final SubLObject cached_value = lookup_cached_xml_retrieval_data(machine, url, port, field_name);
            final SubLObject cache_time = thread.secondMultipleValue();
            thread.resetMultipleValues();
            if (xml_retrieval.NIL != cache_time && (xml_retrieval.NIL == staleness_cutoff || Numbers.subtract(Time.get_universal_time(), cache_time).numL(staleness_cutoff))) {
                return cached_value;
            }
        }
        final SubLObject sexpr = get_xml_sexpr(machine, url, port);
        if (xml_retrieval.NIL != cache_resultsP) {
            cache_xml_retrieval_data(machine, url, port, sexpr);
            return Values.nth_value_step_2(Values.nth_value_step_1((SubLObject)xml_retrieval.ZERO_INTEGER), lookup_cached_xml_retrieval_data(machine, url, port, field_name));
        }
        return xml_parsing_utilities.get_field_value_from_xml_sexpr(field_name, sexpr);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/xml-retrieval.lisp", position = 3060L)
    public static SubLObject cache_xml_retrieval_data(final SubLObject machine, final SubLObject url, final SubLObject port, final SubLObject sexpr) {
        final SubLObject key = make_xml_retrival_key(machine, port);
        SubLObject machine_cache = cache.cache_get(xml_retrieval.$xml_retrieval_cache$.getGlobalValue(), key);
        if (xml_retrieval.NIL == cache.cache_p(machine_cache)) {
            machine_cache = cache.new_cache((SubLObject)xml_retrieval.$int5$128, Symbols.symbol_function((SubLObject)xml_retrieval.EQUAL));
            cache.cache_set(xml_retrieval.$xml_retrieval_cache$.getGlobalValue(), key, machine_cache);
        }
        SubLObject url_cache = cache.cache_get(machine_cache, url);
        if (xml_retrieval.NIL == map_utilities.map_p(url_cache)) {
            url_cache = dictionary.new_dictionary(Symbols.symbol_function((SubLObject)xml_retrieval.EQUAL), Sequences.length(sexpr));
            cache.cache_set(machine_cache, url, url_cache);
        }
        map_utilities.map_remove_all(url_cache);
        map_utilities.map_put(url_cache, (SubLObject)xml_retrieval.$kw6$CACHE_TIME, Time.get_universal_time());
        SubLObject cdolist_list_var = sexpr.rest();
        SubLObject child = (SubLObject)xml_retrieval.NIL;
        child = cdolist_list_var.first();
        while (xml_retrieval.NIL != cdolist_list_var) {
            final SubLObject field = child.first().first();
            final SubLObject value = conses_high.second(child);
            map_utilities.map_put(url_cache, field, value);
            cdolist_list_var = cdolist_list_var.rest();
            child = cdolist_list_var.first();
        }
        return (SubLObject)xml_retrieval.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/xml-retrieval.lisp", position = 3822L)
    public static SubLObject lookup_cached_xml_retrieval_data(final SubLObject machine, final SubLObject url, final SubLObject port, final SubLObject field_name) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject key = make_xml_retrival_key(machine, port);
        final SubLObject machine_cache = cache.cache_get(xml_retrieval.$xml_retrieval_cache$.getGlobalValue(), key);
        if (xml_retrieval.NIL != cache.cache_p(machine_cache)) {
            final SubLObject url_cache = cache.cache_get(machine_cache, url);
            if (xml_retrieval.NIL != map_utilities.map_p(url_cache)) {
                thread.resetMultipleValues();
                final SubLObject value = map_utilities.map_get(url_cache, field_name, (SubLObject)xml_retrieval.UNPROVIDED);
                final SubLObject key_presentP = thread.secondMultipleValue();
                thread.resetMultipleValues();
                if (xml_retrieval.NIL != key_presentP) {
                    return Values.values(value, map_utilities.map_get(url_cache, (SubLObject)xml_retrieval.$kw6$CACHE_TIME, (SubLObject)xml_retrieval.UNPROVIDED));
                }
            }
        }
        return Values.values((SubLObject)xml_retrieval.NIL, (SubLObject)xml_retrieval.NIL);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/xml-retrieval.lisp", position = 4323L)
    public static SubLObject make_xml_retrival_key(final SubLObject machine, final SubLObject port) {
        if (port.eql((SubLObject)xml_retrieval.$int0$80) || port.eql((SubLObject)xml_retrieval.$kw7$DEFAULT)) {
            return machine;
        }
        return Sequences.cconcatenate(format_nil.format_nil_a_no_copy(machine), new SubLObject[] { xml_retrieval.$str8$_, format_nil.format_nil_a_no_copy(port) });
    }
    
    public static SubLObject declare_xml_retrieval_file() {
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.xml_retrieval", "get_xml_sexpr", "GET-XML-SEXPR", 2, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.xml_retrieval", "get_xml_field_value", "GET-XML-FIELD-VALUE", 3, 3, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.xml_retrieval", "cache_xml_retrieval_data", "CACHE-XML-RETRIEVAL-DATA", 4, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.xml_retrieval", "lookup_cached_xml_retrieval_data", "LOOKUP-CACHED-XML-RETRIEVAL-DATA", 4, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.xml_retrieval", "make_xml_retrival_key", "MAKE-XML-RETRIVAL-KEY", 2, 0, false);
        return (SubLObject)xml_retrieval.NIL;
    }
    
    public static SubLObject init_xml_retrieval_file() {
        xml_retrieval.$xml_retrieval_cache$ = SubLFiles.deflexical("*XML-RETRIEVAL-CACHE*", cache.new_cache((SubLObject)xml_retrieval.SIXTEEN_INTEGER, Symbols.symbol_function((SubLObject)xml_retrieval.EQUAL)));
        return (SubLObject)xml_retrieval.NIL;
    }
    
    public static SubLObject setup_xml_retrieval_file() {
        return (SubLObject)xml_retrieval.NIL;
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
        me = (SubLFile)new xml_retrieval();
        xml_retrieval.$xml_retrieval_cache$ = null;
        $int0$80 = SubLObjectFactory.makeInteger(80);
        $str1$ = SubLObjectFactory.makeString("");
        $kw2$GET = SubLObjectFactory.makeKeyword("GET");
        $str3$Timed_out_getting__S_from__S__Rea = SubLObjectFactory.makeString("Timed out getting ~S from ~S: Reason: ~S");
        $sym4$NON_NEGATIVE_INTEGER_P = SubLObjectFactory.makeSymbol("NON-NEGATIVE-INTEGER-P");
        $int5$128 = SubLObjectFactory.makeInteger(128);
        $kw6$CACHE_TIME = SubLObjectFactory.makeKeyword("CACHE-TIME");
        $kw7$DEFAULT = SubLObjectFactory.makeKeyword("DEFAULT");
        $str8$_ = SubLObjectFactory.makeString(":");
    }
}

/*

	Total time: 146 ms
	 synthetic 
*/