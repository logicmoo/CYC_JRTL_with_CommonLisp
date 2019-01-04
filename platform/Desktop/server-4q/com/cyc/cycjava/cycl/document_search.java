package com.cyc.cycjava.cycl;

import com.cyc.cycjava.cycl.cyc_testing.generic_testing;
import com.cyc.tool.subl.util.SubLFiles;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Sort;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Threads;
import com.cyc.cycjava.cycl.sbhl.sbhl_marking_vars;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Values;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Locks;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Numbers;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Symbols;
import com.cyc.cycjava.cycl.quirk.search_engine;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Errors;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.SubLThread;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLProcess;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Sequences;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Functions;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.cdestructuring_bind;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.conses_high;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObject;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLString;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLList;
import com.cyc.tool.subl.jrtl.nativeCode.type.symbol.SubLSymbol;
import com.cyc.tool.subl.util.SubLFile;
import com.cyc.tool.subl.util.SubLTranslatedFile;

public final class document_search extends SubLTranslatedFile
{
    public static final SubLFile me;
    public static final String myName = "com.cyc.cycjava.cycl.document_search";
    public static final String myFingerPrint = "4c68a9504653a7d19a7a57bcdeeaa5d41d386e097733f0d2547c28eb0cc72f20";
    @SubLTranslatedFile.SubL(source = "cycl/document-search.lisp", position = 693L)
    private static SubLSymbol $search_engines$;
    @SubLTranslatedFile.SubL(source = "cycl/document-search.lisp", position = 1624L)
    private static SubLSymbol $search_engine_specs$;
    @SubLTranslatedFile.SubL(source = "cycl/document-search.lisp", position = 2397L)
    private static SubLSymbol $default_search_engine$;
    @SubLTranslatedFile.SubL(source = "cycl/document-search.lisp", position = 14873L)
    private static SubLSymbol $cluster_id_isg$;
    @SubLTranslatedFile.SubL(source = "cycl/document-search.lisp", position = 15014L)
    private static SubLSymbol $cluster_map$;
    @SubLTranslatedFile.SubL(source = "cycl/document-search.lisp", position = 15145L)
    private static SubLSymbol $cluster_lock$;
    private static final SubLList $list0;
    private static final SubLList $list1;
    private static final SubLSymbol $sym2$SEARCH_ENGINE_P;
    private static final SubLSymbol $sym3$REGISTER_SEARCH_ENGINE;
    private static final SubLList $list4;
    private static final SubLSymbol $kw5$ENGINE_UNKNOWN;
    private static final SubLSymbol $sym6$DEREGISTER_SEARCH_ENGINE;
    private static final SubLSymbol $sym7$GET_AVAILABLE_SEARCH_ENGINES;
    private static final SubLSymbol $sym8$SEARCH_ENGINE_AVAILABLE_;
    private static final SubLSymbol $sym9$GET_DEFAULT_SEARCH_ENGINE;
    private static final SubLSymbol $sym10$SET_DEFAULT_SEARCH_ENGINE;
    private static final SubLSymbol $sym11$GET_SEARCH_ENGINE_DESCRIPTION;
    private static final SubLString $str12$_;
    private static final SubLSymbol $sym13$SEARCH_DOCUMENTS_FOR_CYCL_SENTENCE;
    private static final SubLSymbol $sym14$SEARCH_DOCUMENTS_FOR_NL_SENTENCE;
    private static final SubLSymbol $kw15$CYC_SEMANTIC;
    private static final SubLSymbol $sym16$SEARCH_COUNT;
    private static final SubLSymbol $sym17$SEARCH_URL_AVAILABLE_;
    private static final SubLSymbol $sym18$SEARCH_URL;
    private static final SubLString $str19$Cannot_retrieve_a_search_url_beca;
    private static final SubLSymbol $sym20$SEARCH_URL_FOR_CYCL_SENTENCE;
    private static final SubLSymbol $kw21$SERVER_ERROR;
    private static final SubLString $str22$Server_error_;
    private static final SubLSymbol $kw23$ERROR;
    private static final SubLString $str24$Error_;
    private static final SubLSymbol $kw25$GOOGLE;
    private static final SubLSymbol $kw26$INTERP_ID;
    private static final SubLSymbol $sym27$CATCH_ERROR_MESSAGE_HANDLER;
    private static final SubLString $str28$0_0_q__0;
    private static final SubLSymbol $sym29$DOC_ANNOTATION_IRRELEVANT_TERM;
    private static final SubLSymbol $sym30$CYCL_FORT_P;
    private static final SubLString $str31$cycTermID____0_9____;
    private static final SubLString $str32$justification____a_zA_Z_0_9____;
    private static final SubLString $str33$_span2_type__tooltip__id__;
    private static final SubLString $str34$___strong_;
    private static final SubLString $str35$_span_______;
    private static final SubLString $str36$__span_;
    private static final SubLString $str37$__strong___span2_;
    private static final SubLString $str38$Cyc_Semantic_Search_was_unable_to;
    private static final SubLSymbol $kw39$URL;
    private static final SubLString $str40$_html__font_color___005522___b_;
    private static final SubLSymbol $kw41$TITLE;
    private static final SubLString $str42$__b___font___html_;
    private static final SubLSymbol $kw43$SNIPPET;
    private static final SubLString $str44$failed_to_replace_SPAN_tags___S__;
    private static final SubLObject $const45$InferencePSC;
    private static final SubLSymbol $sym46$VALID_CONCEPT_FILTER_NODES;
    private static final SubLList $list47;
    private static final SubLSymbol $sym48$CLET;
    private static final SubLSymbol $sym49$_DEFAULT_CONCEPT_FILTER_SPECIFICATION_;
    private static final SubLSymbol $sym50$_CLUSTER_ID_ISG_;
    private static final SubLSymbol $sym51$_CLUSTER_MAP_;
    private static final SubLSymbol $sym52$_CLUSTER_LOCK_;
    private static final SubLString $str53$Ontological_Cluster_Map_Lock;
    private static final SubLSymbol $sym54$CREATE_CLUSTER;
    private static final SubLObject $const55$Thing;
    private static final SubLSymbol $sym56$FREE_CLUSTER;
    private static final SubLSymbol $sym57$ADD_TERM_TO_CLUSTER;
    private static final SubLObject $const58$Collection;
    private static final SubLObject $const59$Event;
    private static final SubLSymbol $sym60$RETRIEVE_CLUSTER;
    private static final SubLSymbol $sym61$CLUSTER_TERMS_ONTOLOGICALLY;
    private static final SubLSymbol $sym62$NULL;
    private static final SubLSymbol $sym63$GET_TERMS_FROM_URL;
    private static final SubLString $str64$;
    private static final SubLString $str65$_nbsp_;
    private static final SubLSymbol $sym66$GET_TERMS_IN_STRING;
    private static final SubLObject $const67$EnglishParaphraseMt;
    private static final SubLSymbol $kw68$FILTER;
    private static final SubLSymbol $kw69$UNKNOWN;
    private static final SubLSymbol $kw70$DEFAULT;
    private static final SubLSymbol $kw71$NONE;
    private static final SubLSymbol $sym72$LIST_ITEM_;
    private static final SubLString $str73$failed_on__S____S__;
    private static final SubLSymbol $kw74$TEST;
    private static final SubLSymbol $sym75$SUPER_JAVALISTS_MORE_OR_LESS_EQUAL;
    private static final SubLSymbol $kw76$OWNER;
    private static final SubLSymbol $kw77$CLASSES;
    private static final SubLSymbol $kw78$KB;
    private static final SubLSymbol $kw79$FULL;
    private static final SubLSymbol $kw80$WORKING_;
    private static final SubLObject $list81;
    
    @SubLTranslatedFile.SubL(source = "cycl/document-search.lisp", position = 2449L)
    public static SubLObject search_engine_p(final SubLObject v_object) {
        return list_utilities.alist_has_keyP(document_search.$search_engine_specs$.getGlobalValue(), v_object, (SubLObject)document_search.UNPROVIDED);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/document-search.lisp", position = 2547L)
    public static SubLObject register_search_engine(final SubLObject symbol) {
        if (document_search.NIL == list_utilities.alist_has_keyP(document_search.$search_engine_specs$.getGlobalValue(), symbol, (SubLObject)document_search.UNPROVIDED)) {
            return (SubLObject)document_search.$kw5$ENGINE_UNKNOWN;
        }
        SubLObject current;
        final SubLObject datum = current = conses_high.assoc(symbol, document_search.$search_engine_specs$.getGlobalValue(), (SubLObject)document_search.UNPROVIDED, (SubLObject)document_search.UNPROVIDED);
        SubLObject symbol_$1 = (SubLObject)document_search.NIL;
        SubLObject description = (SubLObject)document_search.NIL;
        SubLObject availableP = (SubLObject)document_search.NIL;
        SubLObject string_function = (SubLObject)document_search.NIL;
        SubLObject search_function = (SubLObject)document_search.NIL;
        SubLObject count_function = (SubLObject)document_search.NIL;
        SubLObject search_url_func = (SubLObject)document_search.NIL;
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)document_search.$list4);
        symbol_$1 = current.first();
        current = current.rest();
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)document_search.$list4);
        description = current.first();
        current = current.rest();
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)document_search.$list4);
        availableP = current.first();
        current = current.rest();
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)document_search.$list4);
        string_function = current.first();
        current = current.rest();
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)document_search.$list4);
        search_function = current.first();
        current = current.rest();
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)document_search.$list4);
        count_function = current.first();
        current = current.rest();
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)document_search.$list4);
        search_url_func = current.first();
        current = current.rest();
        if (document_search.NIL == current) {
            return register_search_engine_int(symbol_$1, description, availableP, string_function, search_function, count_function, search_url_func);
        }
        cdestructuring_bind.cdestructuring_bind_error(datum, (SubLObject)document_search.$list4);
        return (SubLObject)document_search.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/document-search.lisp", position = 3002L)
    public static SubLObject register_search_engine_int(final SubLObject symbol, final SubLObject description, final SubLObject availableP, final SubLObject string_function, final SubLObject search_function, final SubLObject count_function, final SubLObject search_url_func) {
        document_search.$search_engines$.setGlobalValue(list_utilities.alist_delete(document_search.$search_engines$.getGlobalValue(), symbol, (SubLObject)document_search.UNPROVIDED));
        document_search.$search_engines$.setGlobalValue(list_utilities.alist_enter(document_search.$search_engines$.getGlobalValue(), symbol, (SubLObject)ConsesLow.list(description, availableP, string_function, search_function, count_function, search_url_func), (SubLObject)document_search.UNPROVIDED));
        return symbol;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/document-search.lisp", position = 3427L)
    public static SubLObject deregister_search_engine(final SubLObject symbol) {
        document_search.$search_engines$.setGlobalValue(list_utilities.alist_delete(document_search.$search_engines$.getGlobalValue(), symbol, (SubLObject)document_search.UNPROVIDED));
        return symbol;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/document-search.lisp", position = 3561L)
    public static SubLObject get_available_search_engines() {
        SubLObject engines = (SubLObject)document_search.NIL;
        SubLObject cdolist_list_var = document_search.$search_engines$.getGlobalValue();
        SubLObject engine = (SubLObject)document_search.NIL;
        engine = cdolist_list_var.first();
        while (document_search.NIL != cdolist_list_var) {
            if (document_search.NIL != Functions.apply(conses_high.third(engine), (SubLObject)document_search.NIL)) {
                engines = (SubLObject)ConsesLow.cons(engine.first(), engines);
            }
            cdolist_list_var = cdolist_list_var.rest();
            engine = cdolist_list_var.first();
        }
        return Sequences.reverse(engines);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/document-search.lisp", position = 3772L)
    public static SubLObject search_engine_availableP(final SubLObject engine) {
        assert document_search.NIL != search_engine_p(engine) : engine;
        final SubLObject desc = list_utilities.alist_lookup(document_search.$search_engines$.getGlobalValue(), engine, (SubLObject)document_search.UNPROVIDED, (SubLObject)document_search.UNPROVIDED);
        if (document_search.NIL == desc) {
            return (SubLObject)document_search.NIL;
        }
        return Functions.apply(conses_high.second(desc), (SubLObject)document_search.NIL);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/document-search.lisp", position = 3996L)
    public static SubLObject get_default_search_engine() {
        final SubLThread thread = SubLProcess.currentSubLThread();
        if (document_search.NIL != document_search.$default_search_engine$.getDynamicValue(thread)) {
            return document_search.$default_search_engine$.getDynamicValue(thread);
        }
        set_default_search_engine(get_available_search_engines().first());
        return document_search.$default_search_engine$.getDynamicValue(thread);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/document-search.lisp", position = 4213L)
    public static SubLObject set_default_search_engine(final SubLObject engine) {
        assert document_search.NIL != search_engine_p(engine) : engine;
        document_search.$default_search_engine$.setDynamicValue(engine);
        return (SubLObject)document_search.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/document-search.lisp", position = 4358L)
    public static SubLObject get_search_engine_description(final SubLObject engine) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        assert document_search.NIL != search_engine_p(engine) : engine;
        SubLObject description = (SubLObject)document_search.NIL;
        thread.resetMultipleValues();
        final SubLObject desc = list_utilities.alist_lookup(document_search.$search_engines$.getGlobalValue(), engine, (SubLObject)document_search.UNPROVIDED, (SubLObject)document_search.UNPROVIDED);
        final SubLObject found = thread.secondMultipleValue();
        thread.resetMultipleValues();
        if (document_search.NIL != found) {
            description = desc.first();
        }
        return description;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/document-search.lisp", position = 4632L)
    public static SubLObject generic_query_string_for_cycl_sentence(final SubLObject cycl_sentence) {
        final SubLObject search_string = qua_query.qua_query_string_for_cycl_sentence(cycl_sentence, (SubLObject)document_search.UNPROVIDED, (SubLObject)document_search.UNPROVIDED);
        final SubLObject string_without_eol = string_utilities.replace_substring(search_string, string_utilities.$new_line_string$.getGlobalValue(), (SubLObject)document_search.$str12$_);
        return string_without_eol;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/document-search.lisp", position = 4893L)
    public static SubLObject query_string_for_cycl_sentence(final SubLObject cycl_sentence, final SubLObject engine) {
        assert document_search.NIL != search_engine_p(engine) : engine;
        final SubLObject engine_desc = list_utilities.alist_lookup(document_search.$search_engines$.getGlobalValue(), engine, (SubLObject)document_search.UNPROVIDED, (SubLObject)document_search.UNPROVIDED);
        if (document_search.NIL == engine_desc) {
            return (SubLObject)document_search.NIL;
        }
        return Functions.apply(conses_high.third(engine_desc), (SubLObject)ConsesLow.list(cycl_sentence));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/document-search.lisp", position = 5175L)
    public static SubLObject search_documents_for_cycl_sentence(final SubLObject search_sentence, SubLObject engine, SubLObject start, SubLObject hits) {
        if (engine == document_search.UNPROVIDED) {
            engine = get_default_search_engine();
        }
        if (start == document_search.UNPROVIDED) {
            start = (SubLObject)document_search.ONE_INTEGER;
        }
        if (hits == document_search.UNPROVIDED) {
            hits = (SubLObject)document_search.TEN_INTEGER;
        }
        assert document_search.NIL != search_engine_p(engine) : engine;
        final SubLObject search_string = query_string_for_cycl_sentence(search_sentence, engine);
        return search_documents(search_string, engine, start, hits);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/document-search.lisp", position = 5964L)
    public static SubLObject search_documents_for_nl_sentence(final SubLObject search_sentence, SubLObject engine, SubLObject start, SubLObject hits) {
        if (engine == document_search.UNPROVIDED) {
            engine = get_default_search_engine();
        }
        if (start == document_search.UNPROVIDED) {
            start = (SubLObject)document_search.ONE_INTEGER;
        }
        if (hits == document_search.UNPROVIDED) {
            hits = (SubLObject)document_search.TEN_INTEGER;
        }
        assert document_search.NIL != search_engine_p(engine) : engine;
        final SubLObject search_string = (engine == document_search.$kw15$CYC_SEMANTIC) ? cyc_semantic_search_string(search_sentence) : search_sentence;
        return search_documents(search_string, engine, start, hits);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/document-search.lisp", position = 6823L)
    public static SubLObject search_documents(final SubLObject search_string, SubLObject engine, SubLObject start, SubLObject hits) {
        if (engine == document_search.UNPROVIDED) {
            engine = get_default_search_engine();
        }
        if (start == document_search.UNPROVIDED) {
            start = (SubLObject)document_search.ONE_INTEGER;
        }
        if (hits == document_search.UNPROVIDED) {
            hits = (SubLObject)document_search.TEN_INTEGER;
        }
        assert document_search.NIL != search_engine_p(engine) : engine;
        final SubLObject engine_desc = list_utilities.alist_lookup(document_search.$search_engines$.getGlobalValue(), engine, (SubLObject)document_search.UNPROVIDED, (SubLObject)document_search.UNPROVIDED);
        if (document_search.NIL == engine_desc) {
            return (SubLObject)document_search.NIL;
        }
        return Functions.apply(conses_high.fourth(engine_desc), (SubLObject)ConsesLow.list(search_string, start, hits));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/document-search.lisp", position = 7633L)
    public static SubLObject search_count(final SubLObject search_string, SubLObject engine) {
        if (engine == document_search.UNPROVIDED) {
            engine = get_default_search_engine();
        }
        assert document_search.NIL != search_engine_p(engine) : engine;
        final SubLObject engine_desc = list_utilities.alist_lookup(document_search.$search_engines$.getGlobalValue(), engine, (SubLObject)document_search.UNPROVIDED, (SubLObject)document_search.UNPROVIDED);
        if (document_search.NIL == engine_desc) {
            return (SubLObject)document_search.NIL;
        }
        return Functions.apply(conses_high.fifth(engine_desc), (SubLObject)ConsesLow.list(search_string));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/document-search.lisp", position = 7936L)
    public static SubLObject search_url_availableP(SubLObject engine) {
        if (engine == document_search.UNPROVIDED) {
            engine = get_default_search_engine();
        }
        assert document_search.NIL != search_engine_p(engine) : engine;
        final SubLObject engine_desc = list_utilities.alist_lookup(document_search.$search_engines$.getGlobalValue(), engine, (SubLObject)document_search.UNPROVIDED, (SubLObject)document_search.UNPROVIDED);
        if (document_search.NIL == engine_desc) {
            return (SubLObject)document_search.NIL;
        }
        return (SubLObject)((document_search.NIL != conses_high.sixth(engine_desc)) ? document_search.T : document_search.NIL);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/document-search.lisp", position = 8217L)
    public static SubLObject search_url(final SubLObject search_string, SubLObject engine, SubLObject start, SubLObject hits) {
        if (engine == document_search.UNPROVIDED) {
            engine = get_default_search_engine();
        }
        if (start == document_search.UNPROVIDED) {
            start = (SubLObject)document_search.ONE_INTEGER;
        }
        if (hits == document_search.UNPROVIDED) {
            hits = (SubLObject)document_search.TEN_INTEGER;
        }
        assert document_search.NIL != search_engine_p(engine) : engine;
        final SubLObject engine_desc = list_utilities.alist_lookup(document_search.$search_engines$.getGlobalValue(), engine, (SubLObject)document_search.UNPROVIDED, (SubLObject)document_search.UNPROVIDED);
        if (document_search.NIL == engine_desc) {
            return (SubLObject)document_search.NIL;
        }
        if (document_search.NIL == conses_high.sixth(engine_desc)) {
            Errors.error((SubLObject)document_search.$str19$Cannot_retrieve_a_search_url_beca, engine_desc.first());
        }
        return Functions.apply(conses_high.sixth(engine_desc), (SubLObject)ConsesLow.list(search_string, start, hits));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/document-search.lisp", position = 8698L)
    public static SubLObject search_url_for_cycl_sentence(final SubLObject search_sentence, SubLObject engine, SubLObject start, SubLObject hits) {
        if (engine == document_search.UNPROVIDED) {
            engine = get_default_search_engine();
        }
        if (start == document_search.UNPROVIDED) {
            start = (SubLObject)document_search.ONE_INTEGER;
        }
        if (hits == document_search.UNPROVIDED) {
            hits = (SubLObject)document_search.TEN_INTEGER;
        }
        assert document_search.NIL != search_engine_p(engine) : engine;
        final SubLObject search_string = query_string_for_cycl_sentence(search_sentence, engine);
        return search_url(search_string, engine, start, hits);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/document-search.lisp", position = 9007L)
    public static SubLObject google_search_wrapper(final SubLObject search_string, final SubLObject start, final SubLObject hits) {
        final SubLObject google_results = search_engine.google_search(search_string, start, hits);
        SubLObject results = (SubLObject)document_search.NIL;
        if (document_search.$kw21$SERVER_ERROR == google_results) {
            return (SubLObject)document_search.$str22$Server_error_;
        }
        if (document_search.$kw23$ERROR == google_results) {
            return (SubLObject)document_search.$str24$Error_;
        }
        SubLObject list_var = (SubLObject)document_search.NIL;
        SubLObject result = (SubLObject)document_search.NIL;
        SubLObject result_number = (SubLObject)document_search.NIL;
        list_var = google_results;
        result = list_var.first();
        for (result_number = (SubLObject)document_search.ZERO_INTEGER; document_search.NIL != list_var; list_var = list_var.rest(), result = list_var.first(), result_number = Numbers.add((SubLObject)document_search.ONE_INTEGER, result_number)) {
            if (result_number.numL(hits)) {
                final SubLObject url = search_engine.google_passage_get_url_method(result);
                final SubLObject rank = search_engine.google_passage_get_rank_method(result);
                final SubLObject title = search_engine.google_passage_get_title_method(result);
                final SubLObject snippet = search_engine.google_passage_get_snippet_method(result);
                final SubLObject item_var;
                final SubLObject v_answer = item_var = (SubLObject)ConsesLow.list(rank, url, title, snippet);
                if (document_search.NIL == conses_high.member(item_var, results, Symbols.symbol_function((SubLObject)document_search.EQL), Symbols.symbol_function((SubLObject)document_search.IDENTITY))) {
                    results = (SubLObject)ConsesLow.cons(item_var, results);
                }
            }
        }
        return Sequences.reverse(results);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/document-search.lisp", position = 9825L)
    public static SubLObject google_query_string_for_cycl_sentence(final SubLObject cycl_sentence) {
        final SubLObject search_string = qua_query.qua_query_string_for_cycl_sentence(cycl_sentence, (SubLObject)document_search.$kw25$GOOGLE, (SubLObject)document_search.UNPROVIDED);
        final SubLObject string_without_eol = string_utilities.replace_substring(search_string, string_utilities.$new_line_string$.getGlobalValue(), (SubLObject)document_search.$str12$_);
        return string_without_eol;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/document-search.lisp", position = 10093L)
    public static SubLObject lucene_search_wrapper(final SubLObject search_string, final SubLObject start, final SubLObject hits) {
        final SubLObject pages = lucene_index.ws_index_search_with_titles_and_snippets(search_string, start, hits, (SubLObject)document_search.UNPROVIDED, (SubLObject)document_search.UNPROVIDED);
        SubLObject results = (SubLObject)document_search.NIL;
        SubLObject cdolist_list_var = pages;
        SubLObject result = (SubLObject)document_search.NIL;
        result = cdolist_list_var.first();
        while (document_search.NIL != cdolist_list_var) {
            final SubLObject rank = result.first();
            final SubLObject url = http_kernel.get_absolute_url(conses_high.second(result), (SubLObject)document_search.UNPROVIDED);
            final SubLObject title = conses_high.third(result);
            final SubLObject snippet = conses_high.fourth(result);
            results = (SubLObject)ConsesLow.cons((SubLObject)ConsesLow.list(rank, url, title, snippet), results);
            cdolist_list_var = cdolist_list_var.rest();
            result = cdolist_list_var.first();
        }
        return Sequences.reverse(results);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/document-search.lisp", position = 10512L)
    public static SubLObject lucene_count_wrapper(final SubLObject search_string) {
        return lucene_index.ws_index_count(search_string, (SubLObject)document_search.UNPROVIDED, (SubLObject)document_search.UNPROVIDED);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/document-search.lisp", position = 10606L)
    public static SubLObject cyc_semantic_search_string(final SubLObject text_string) {
        SubLObject ids = (SubLObject)document_search.NIL;
        SubLObject cdolist_list_var = document_annotation_widgets.terms_for_cyc_semantic_query(text_string);
        SubLObject record = (SubLObject)document_search.NIL;
        record = cdolist_list_var.first();
        while (document_search.NIL != cdolist_list_var) {
            SubLObject cdolist_list_var_$2 = record.rest();
            SubLObject interps = (SubLObject)document_search.NIL;
            interps = cdolist_list_var_$2.first();
            while (document_search.NIL != cdolist_list_var_$2) {
                ids = (SubLObject)ConsesLow.cons(conses_high.getf(interps, (SubLObject)document_search.$kw26$INTERP_ID, (SubLObject)document_search.UNPROVIDED), ids);
                cdolist_list_var_$2 = cdolist_list_var_$2.rest();
                interps = cdolist_list_var_$2.first();
            }
            cdolist_list_var = cdolist_list_var.rest();
            record = cdolist_list_var.first();
        }
        return string_utilities.bunge(Sequences.nreverse(ids), (SubLObject)document_search.UNPROVIDED);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/document-search.lisp", position = 10891L)
    public static SubLObject cyc_semantic_index_server_aliveP() {
        final SubLThread thread = SubLProcess.currentSubLThread();
        if (document_search.NIL == document_annotation_widgets.semantic_index_initializedP()) {
            return (SubLObject)document_search.NIL;
        }
        SubLObject error_msg = (SubLObject)document_search.NIL;
        try {
            thread.throwStack.push(subl_macro_promotions.$catch_error_message_target$.getGlobalValue());
            final SubLObject _prev_bind_0 = Errors.$error_handler$.currentBinding(thread);
            try {
                Errors.$error_handler$.bind((SubLObject)document_search.$sym27$CATCH_ERROR_MESSAGE_HANDLER, thread);
                try {
                    document_annotation_widgets.lucene_sem_query_with_sem_search_string((SubLObject)document_search.$str28$0_0_q__0, (SubLObject)document_search.ONE_INTEGER);
                }
                catch (Throwable catch_var) {
                    Errors.handleThrowable(catch_var, (SubLObject)document_search.NIL);
                }
            }
            finally {
                Errors.$error_handler$.rebind(_prev_bind_0, thread);
            }
        }
        catch (Throwable ccatch_env_var) {
            error_msg = Errors.handleThrowable(ccatch_env_var, subl_macro_promotions.$catch_error_message_target$.getGlobalValue());
        }
        finally {
            thread.throwStack.pop();
        }
        if (document_search.NIL == error_msg) {
            return (SubLObject)document_search.T;
        }
        return (SubLObject)document_search.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/document-search.lisp", position = 11327L)
    public static SubLObject cyc_semantic_query_string_for_cycl_sentence(final SubLObject cycl_sent) {
        final SubLObject cycl_terms = Sequences.remove_if((SubLObject)document_search.$sym29$DOC_ANNOTATION_IRRELEVANT_TERM, cycl_utilities.expression_gather(cycl_sent, (SubLObject)document_search.$sym30$CYCL_FORT_P, (SubLObject)document_search.UNPROVIDED, (SubLObject)document_search.UNPROVIDED, (SubLObject)document_search.UNPROVIDED, (SubLObject)document_search.UNPROVIDED), (SubLObject)document_search.UNPROVIDED, (SubLObject)document_search.UNPROVIDED, (SubLObject)document_search.UNPROVIDED, (SubLObject)document_search.UNPROVIDED);
        SubLObject query_terms = (SubLObject)document_search.NIL;
        SubLObject cdolist_list_var = cycl_terms;
        SubLObject cycl_term = (SubLObject)document_search.NIL;
        cycl_term = cdolist_list_var.first();
        while (document_search.NIL != cdolist_list_var) {
            final SubLObject item_var = document_annotation_widgets.cyc_semantic_search_token((SubLObject)document_search.NIL, cycl_term);
            if (document_search.NIL == conses_high.member(item_var, query_terms, Symbols.symbol_function((SubLObject)document_search.EQUAL), Symbols.symbol_function((SubLObject)document_search.IDENTITY))) {
                query_terms = (SubLObject)ConsesLow.cons(item_var, query_terms);
            }
            cdolist_list_var = cdolist_list_var.rest();
            cycl_term = cdolist_list_var.first();
        }
        return string_utilities.bunge(query_terms, (SubLObject)document_search.UNPROVIDED);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/document-search.lisp", position = 11677L)
    public static SubLObject replace_span_tags(SubLObject snippet) {
        SubLObject cdolist_list_var = regular_expression_utilities.find_all_matches_for_regular_expression((SubLObject)document_search.$str35$_span_______, snippet, (SubLObject)document_search.UNPROVIDED, (SubLObject)document_search.UNPROVIDED);
        SubLObject span_tag = (SubLObject)document_search.NIL;
        span_tag = cdolist_list_var.first();
        while (document_search.NIL != cdolist_list_var) {
            final SubLObject term_id = conses_high.second(regular_expression_utilities.regexp_capturing_match((SubLObject)document_search.$str31$cycTermID____0_9____, span_tag, (SubLObject)document_search.UNPROVIDED, (SubLObject)document_search.UNPROVIDED));
            final SubLObject justification_terms = string_utilities.split_string(conses_high.second(regular_expression_utilities.regexp_capturing_match((SubLObject)document_search.$str32$justification____a_zA_Z_0_9____, span_tag, (SubLObject)document_search.UNPROVIDED, (SubLObject)document_search.UNPROVIDED)), (SubLObject)document_search.UNPROVIDED);
            final SubLObject relation_id = justification_terms.first();
            final SubLObject related_term_id = conses_high.second(justification_terms);
            if (document_search.NIL != term_id && document_search.NIL != relation_id && document_search.NIL != related_term_id) {
                snippet = string_utilities.replace_substring(snippet, span_tag, Sequences.cconcatenate((SubLObject)document_search.$str33$_span2_type__tooltip__id__, new SubLObject[] { format_nil.format_nil_a_no_copy(term_id), document_search.$str12$_, format_nil.format_nil_a_no_copy(relation_id), document_search.$str12$_, format_nil.format_nil_a_no_copy(related_term_id), document_search.$str34$___strong_ }));
            }
            cdolist_list_var = cdolist_list_var.rest();
            span_tag = cdolist_list_var.first();
        }
        snippet = string_utilities.replace_substring(snippet, (SubLObject)document_search.$str36$__span_, (SubLObject)document_search.$str37$__strong___span2_);
        return snippet;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/document-search.lisp", position = 12745L)
    public static SubLObject cyc_semantic_search_wrapper(final SubLObject search_string, final SubLObject start, final SubLObject hits) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject rank = (SubLObject)document_search.ONE_INTEGER;
        SubLObject results = (SubLObject)document_search.NIL;
        SubLObject error_msg = (SubLObject)document_search.NIL;
        SubLObject search_results = (SubLObject)document_search.NIL;
        try {
            thread.throwStack.push(subl_macro_promotions.$catch_error_message_target$.getGlobalValue());
            final SubLObject _prev_bind_0 = Errors.$error_handler$.currentBinding(thread);
            try {
                Errors.$error_handler$.bind((SubLObject)document_search.$sym27$CATCH_ERROR_MESSAGE_HANDLER, thread);
                try {
                    search_results = document_annotation_widgets.lucene_sem_query_with_sem_search_string(search_string, hits);
                }
                catch (Throwable catch_var) {
                    Errors.handleThrowable(catch_var, (SubLObject)document_search.NIL);
                }
            }
            finally {
                Errors.$error_handler$.rebind(_prev_bind_0, thread);
            }
        }
        catch (Throwable ccatch_env_var) {
            error_msg = Errors.handleThrowable(ccatch_env_var, subl_macro_promotions.$catch_error_message_target$.getGlobalValue());
        }
        finally {
            thread.throwStack.pop();
        }
        if (document_search.NIL != error_msg) {
            return (SubLObject)document_search.$str38$Cyc_Semantic_Search_was_unable_to;
        }
        SubLObject cdolist_list_var = search_results;
        SubLObject search_result = (SubLObject)document_search.NIL;
        search_result = cdolist_list_var.first();
        while (document_search.NIL != cdolist_list_var) {
            final SubLObject url = list_utilities.plist_lookup(search_result, (SubLObject)document_search.$kw39$URL, (SubLObject)document_search.UNPROVIDED);
            final SubLObject title = Sequences.cconcatenate((SubLObject)document_search.$str40$_html__font_color___005522___b_, new SubLObject[] { list_utilities.plist_lookup(search_result, (SubLObject)document_search.$kw41$TITLE, (SubLObject)document_search.UNPROVIDED), document_search.$str42$__b___font___html_ });
            SubLObject snippet = list_utilities.plist_lookup(search_result, (SubLObject)document_search.$kw43$SNIPPET, (SubLObject)document_search.UNPROVIDED);
            error_msg = (SubLObject)document_search.NIL;
            try {
                thread.throwStack.push(subl_macro_promotions.$catch_error_message_target$.getGlobalValue());
                final SubLObject _prev_bind_2 = Errors.$error_handler$.currentBinding(thread);
                try {
                    Errors.$error_handler$.bind((SubLObject)document_search.$sym27$CATCH_ERROR_MESSAGE_HANDLER, thread);
                    try {
                        snippet = replace_span_tags(snippet);
                        results = (SubLObject)ConsesLow.cons((SubLObject)ConsesLow.list(rank, url, title, snippet), results);
                    }
                    catch (Throwable catch_var2) {
                        Errors.handleThrowable(catch_var2, (SubLObject)document_search.NIL);
                    }
                }
                finally {
                    Errors.$error_handler$.rebind(_prev_bind_2, thread);
                }
            }
            catch (Throwable ccatch_env_var2) {
                error_msg = Errors.handleThrowable(ccatch_env_var2, subl_macro_promotions.$catch_error_message_target$.getGlobalValue());
            }
            finally {
                thread.throwStack.pop();
            }
            if (document_search.NIL != error_msg) {
                Errors.warn((SubLObject)document_search.$str44$failed_to_replace_SPAN_tags___S__, error_msg);
            }
            rank = Numbers.add(rank, (SubLObject)document_search.ONE_INTEGER);
            cdolist_list_var = cdolist_list_var.rest();
            search_result = cdolist_list_var.first();
        }
        return Sequences.nreverse(results);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/document-search.lisp", position = 13739L)
    public static SubLObject cyc_semantic_count_wrapper(final SubLObject search_string) {
        return (SubLObject)document_search.TEN_INTEGER;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/document-search.lisp", position = 13845L)
    public static SubLObject min_cluster_parents_for_collection(final SubLObject col, SubLObject mt, SubLObject tv) {
        if (mt == document_search.UNPROVIDED) {
            mt = document_search.$const45$InferencePSC;
        }
        if (tv == document_search.UNPROVIDED) {
            tv = (SubLObject)document_search.NIL;
        }
        final SubLObject all_genls = genls.all_genls(col, mt, tv);
        final SubLObject genls_of_type = list_utilities.remove_if_not(Symbols.symbol_function((SubLObject)document_search.$sym46$VALID_CONCEPT_FILTER_NODES), all_genls, (SubLObject)document_search.UNPROVIDED, (SubLObject)document_search.UNPROVIDED, (SubLObject)document_search.UNPROVIDED, (SubLObject)document_search.UNPROVIDED);
        return genls.min_cols(Sequences.remove(col, genls_of_type, (SubLObject)document_search.UNPROVIDED, (SubLObject)document_search.UNPROVIDED, (SubLObject)document_search.UNPROVIDED, (SubLObject)document_search.UNPROVIDED, (SubLObject)document_search.UNPROVIDED), mt, tv);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/document-search.lisp", position = 14395L)
    public static SubLObject min_cluster_parents_for_individual(final SubLObject v_term, SubLObject mt, SubLObject tv) {
        if (mt == document_search.UNPROVIDED) {
            mt = document_search.$const45$InferencePSC;
        }
        if (tv == document_search.UNPROVIDED) {
            tv = (SubLObject)document_search.NIL;
        }
        final SubLObject all_isas = isa.all_isa(v_term, mt, tv);
        final SubLObject isas_of_type = list_utilities.remove_if_not(Symbols.symbol_function((SubLObject)document_search.$sym46$VALID_CONCEPT_FILTER_NODES), all_isas, (SubLObject)document_search.UNPROVIDED, (SubLObject)document_search.UNPROVIDED, (SubLObject)document_search.UNPROVIDED, (SubLObject)document_search.UNPROVIDED);
        return genls.min_cols(isas_of_type, mt, tv);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/document-search.lisp", position = 14730L)
    public static SubLObject with_cluster_taxonomy(final SubLObject macroform, final SubLObject environment) {
        SubLObject current;
        final SubLObject datum = current = macroform.rest();
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)document_search.$list47);
        final SubLObject temp = current.rest();
        current = current.first();
        SubLObject v_set = (SubLObject)document_search.NIL;
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)document_search.$list47);
        v_set = current.first();
        current = current.rest();
        if (document_search.NIL == current) {
            final SubLObject body;
            current = (body = temp);
            return (SubLObject)ConsesLow.listS((SubLObject)document_search.$sym48$CLET, (SubLObject)ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)document_search.$sym49$_DEFAULT_CONCEPT_FILTER_SPECIFICATION_, v_set)), ConsesLow.append(body, (SubLObject)document_search.NIL));
        }
        cdestructuring_bind.cdestructuring_bind_error(datum, (SubLObject)document_search.$list47);
        return (SubLObject)document_search.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/document-search.lisp", position = 15290L)
    public static SubLObject create_cluster() {
        final SubLObject v_graph = dictionary.new_dictionary((SubLObject)document_search.UNPROVIDED, (SubLObject)document_search.UNPROVIDED);
        final SubLObject root_node = document_search.$const55$Thing;
        final SubLObject uuid = task_processor.get_current_task_processor_client();
        final SubLObject id = integer_sequence_generator.integer_sequence_generator_next(document_search.$cluster_id_isg$.getGlobalValue());
        SubLObject release = (SubLObject)document_search.NIL;
        try {
            release = Locks.seize_lock(document_search.$cluster_lock$.getGlobalValue());
            dictionary.dictionary_enter(document_search.$cluster_map$.getGlobalValue(), id, (SubLObject)ConsesLow.list(v_graph, root_node, uuid));
        }
        finally {
            if (document_search.NIL != release) {
                Locks.release_lock(document_search.$cluster_lock$.getGlobalValue());
            }
        }
        dictionary.dictionary_enter(v_graph, root_node, (SubLObject)document_search.NIL);
        return id;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/document-search.lisp", position = 15752L)
    public static SubLObject lookup_cluster(final SubLObject graph_id) {
        SubLObject v_graph = (SubLObject)document_search.NIL;
        SubLObject root = (SubLObject)document_search.NIL;
        SubLObject uuid = (SubLObject)document_search.NIL;
        SubLObject release = (SubLObject)document_search.NIL;
        try {
            release = Locks.seize_lock(document_search.$cluster_lock$.getGlobalValue());
            final SubLObject graph_triplet = dictionary.dictionary_lookup(document_search.$cluster_map$.getGlobalValue(), graph_id, (SubLObject)document_search.UNPROVIDED);
            v_graph = graph_triplet.first();
            root = conses_high.second(graph_triplet);
            uuid = conses_high.third(graph_triplet);
        }
        finally {
            if (document_search.NIL != release) {
                Locks.release_lock(document_search.$cluster_lock$.getGlobalValue());
            }
        }
        return Values.values(v_graph, root, uuid);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/document-search.lisp", position = 16084L)
    public static SubLObject free_cluster(final SubLObject graph_id) {
        SubLObject release = (SubLObject)document_search.NIL;
        try {
            release = Locks.seize_lock(document_search.$cluster_lock$.getGlobalValue());
            dictionary.dictionary_remove(document_search.$cluster_map$.getGlobalValue(), graph_id);
        }
        finally {
            if (document_search.NIL != release) {
                Locks.release_lock(document_search.$cluster_lock$.getGlobalValue());
            }
        }
        return (SubLObject)document_search.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/document-search.lisp", position = 16354L)
    public static SubLObject release_cluster_resources_for_client(final SubLObject client_uuid) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject release = (SubLObject)document_search.NIL;
        try {
            release = Locks.seize_lock(document_search.$cluster_lock$.getGlobalValue());
            SubLObject iteration_state;
            for (iteration_state = dictionary_contents.do_dictionary_contents_state(dictionary.dictionary_contents(document_search.$cluster_map$.getGlobalValue())); document_search.NIL == dictionary_contents.do_dictionary_contents_doneP(iteration_state); iteration_state = dictionary_contents.do_dictionary_contents_next(iteration_state)) {
                thread.resetMultipleValues();
                final SubLObject id = dictionary_contents.do_dictionary_contents_key_value(iteration_state);
                final SubLObject graph_triplet = thread.secondMultipleValue();
                thread.resetMultipleValues();
                final SubLObject graph_uuid = conses_high.third(graph_triplet);
                if (graph_uuid.equal(client_uuid)) {
                    free_cluster(id);
                }
            }
            dictionary_contents.do_dictionary_contents_finalize(iteration_state);
        }
        finally {
            if (document_search.NIL != release) {
                Locks.release_lock(document_search.$cluster_lock$.getGlobalValue());
            }
        }
        return (SubLObject)document_search.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/document-search.lisp", position = 16758L)
    public static SubLObject add_term_to_cluster(final SubLObject graph_id, final SubLObject v_term, SubLObject mt, SubLObject seen_map) {
        if (mt == document_search.UNPROVIDED) {
            mt = document_search.$const45$InferencePSC;
        }
        if (seen_map == document_search.UNPROVIDED) {
            seen_map = dictionary.new_dictionary((SubLObject)document_search.UNPROVIDED, (SubLObject)document_search.UNPROVIDED);
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject already_resourcing_p = sbhl_marking_vars.$resourcing_sbhl_marking_spaces_p$.getDynamicValue(thread);
        final SubLObject _prev_bind_0 = sbhl_marking_vars.$resourced_sbhl_marking_space_limit$.currentBinding(thread);
        final SubLObject _prev_bind_2 = sbhl_marking_vars.$resourced_sbhl_marking_spaces$.currentBinding(thread);
        final SubLObject _prev_bind_3 = sbhl_marking_vars.$resourcing_sbhl_marking_spaces_p$.currentBinding(thread);
        try {
            sbhl_marking_vars.$resourced_sbhl_marking_space_limit$.bind(sbhl_marking_vars.determine_resource_limit(already_resourcing_p, (SubLObject)document_search.SIX_INTEGER), thread);
            sbhl_marking_vars.$resourced_sbhl_marking_spaces$.bind(sbhl_marking_vars.possibly_new_marking_resource(already_resourcing_p), thread);
            sbhl_marking_vars.$resourcing_sbhl_marking_spaces_p$.bind((SubLObject)document_search.T, thread);
            thread.resetMultipleValues();
            final SubLObject v_graph = lookup_cluster(graph_id);
            final SubLObject root = thread.secondMultipleValue();
            thread.resetMultipleValues();
            if (document_search.NIL == dictionary_utilities.dictionary_has_keyP(v_graph, v_term)) {
                dictionary.dictionary_enter(v_graph, v_term, (SubLObject)document_search.NIL);
                dictionary.dictionary_enter(seen_map, v_term, (SubLObject)document_search.T);
                final SubLObject parents = (document_search.NIL != isa.isaP(v_term, document_search.$const58$Collection, mt, (SubLObject)document_search.UNPROVIDED)) ? min_cluster_parents_for_collection(v_term, mt, (SubLObject)document_search.UNPROVIDED) : min_cluster_parents_for_individual(v_term, mt, (SubLObject)document_search.UNPROVIDED);
                SubLObject seen_a_parent = (SubLObject)document_search.NIL;
                SubLObject cdolist_list_var = parents;
                SubLObject parent = (SubLObject)document_search.NIL;
                parent = cdolist_list_var.first();
                while (document_search.NIL != cdolist_list_var) {
                    if (document_search.NIL == dictionary_utilities.dictionary_has_keyP(seen_map, parent) && document_search.NIL == cardinality_estimates.generality_estimateG(parent, document_search.$const59$Event)) {
                        seen_a_parent = (SubLObject)document_search.T;
                        add_term_to_cluster(graph_id, parent, mt, seen_map);
                        dictionary_utilities.dictionary_pushnew(v_graph, parent, v_term, (SubLObject)document_search.UNPROVIDED, (SubLObject)document_search.UNPROVIDED);
                    }
                    cdolist_list_var = cdolist_list_var.rest();
                    parent = cdolist_list_var.first();
                }
                if (document_search.NIL == seen_a_parent) {
                    dictionary_utilities.dictionary_pushnew(v_graph, root, v_term, (SubLObject)document_search.UNPROVIDED, (SubLObject)document_search.UNPROVIDED);
                }
                dictionary.dictionary_remove(seen_map, v_term);
            }
        }
        finally {
            sbhl_marking_vars.$resourcing_sbhl_marking_spaces_p$.rebind(_prev_bind_3, thread);
            sbhl_marking_vars.$resourced_sbhl_marking_spaces$.rebind(_prev_bind_2, thread);
            sbhl_marking_vars.$resourced_sbhl_marking_space_limit$.rebind(_prev_bind_0, thread);
        }
        return (SubLObject)document_search.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/document-search.lisp", position = 17889L)
    public static SubLObject retrieve_cluster(final SubLObject graph_id) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        thread.resetMultipleValues();
        final SubLObject v_graph = lookup_cluster(graph_id);
        final SubLObject root = thread.secondMultipleValue();
        thread.resetMultipleValues();
        return build_cluster_from_dag(root, v_graph, (SubLObject)document_search.UNPROVIDED);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/document-search.lisp", position = 18250L)
    public static SubLObject cluster_terms_ontologically(final SubLObject terms) {
        final SubLObject graph_id = create_cluster();
        SubLObject cdolist_list_var = terms;
        SubLObject v_term = (SubLObject)document_search.NIL;
        v_term = cdolist_list_var.first();
        while (document_search.NIL != cdolist_list_var) {
            add_term_to_cluster(graph_id, v_term, (SubLObject)document_search.UNPROVIDED, (SubLObject)document_search.UNPROVIDED);
            cdolist_list_var = cdolist_list_var.rest();
            v_term = cdolist_list_var.first();
        }
        final SubLObject v_answer = retrieve_cluster(graph_id);
        free_cluster(graph_id);
        return v_answer;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/document-search.lisp", position = 18790L)
    public static SubLObject find_term_in_cluster(final SubLObject v_term, final SubLObject cluster) {
        if (document_search.NIL == cluster) {
            return (SubLObject)document_search.NIL;
        }
        if (cluster.first().eql(v_term)) {
            return (SubLObject)document_search.T;
        }
        SubLObject cdolist_list_var = cluster.rest();
        SubLObject child = (SubLObject)document_search.NIL;
        child = cdolist_list_var.first();
        while (document_search.NIL != cdolist_list_var) {
            if (document_search.NIL != find_term_in_cluster(v_term, child)) {
                return (SubLObject)document_search.T;
            }
            cdolist_list_var = cdolist_list_var.rest();
            child = cdolist_list_var.first();
        }
        return (SubLObject)document_search.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/document-search.lisp", position = 19202L)
    public static SubLObject clean_cluster(final SubLObject cluster) {
        final SubLObject root_term = cluster.first();
        SubLObject children = cluster.rest();
        final SubLObject child_count = Sequences.length(children);
        SubLObject i = (SubLObject)document_search.ZERO_INTEGER;
        SubLObject j = (SubLObject)document_search.ZERO_INTEGER;
        if (document_search.ONE_INTEGER.numE(child_count)) {
            return children.first();
        }
        if (document_search.ZERO_INTEGER.numE(child_count)) {
            return cluster;
        }
        while (i.numL(child_count)) {
            if (document_search.NIL != ConsesLow.nth(i, children)) {
                for (j = (SubLObject)document_search.ZERO_INTEGER; j.numL(i); j = Numbers.add(j, (SubLObject)document_search.ONE_INTEGER)) {
                    if (document_search.NIL != ConsesLow.nth(j, children)) {
                        final SubLObject child1 = ConsesLow.nth(i, children);
                        final SubLObject child2 = ConsesLow.nth(j, children);
                        final SubLObject head1 = child1.first();
                        final SubLObject head2 = child2.first();
                        final SubLObject rest1 = child1.rest();
                        final SubLObject rest2 = child2.rest();
                        if (head1.eql(head2)) {
                            ConsesLow.set_nth(i, children, clean_cluster((SubLObject)ConsesLow.cons(head1, ConsesLow.append(rest1, rest2))));
                            ConsesLow.set_nth(j, children, (SubLObject)document_search.NIL);
                        }
                    }
                }
            }
            i = Numbers.add(i, (SubLObject)document_search.ONE_INTEGER);
        }
        for (i = (SubLObject)document_search.ZERO_INTEGER; i.numL(child_count); i = Numbers.add(i, (SubLObject)document_search.ONE_INTEGER)) {
            if (document_search.NIL != ConsesLow.nth(i, children)) {
                for (j = (SubLObject)document_search.ZERO_INTEGER; j.numL(child_count); j = Numbers.add(j, (SubLObject)document_search.ONE_INTEGER)) {
                    if (document_search.NIL != ConsesLow.nth(j, children) && !i.numE(j)) {
                        final SubLObject child1 = ConsesLow.nth(i, children);
                        final SubLObject child2 = ConsesLow.nth(j, children);
                        final SubLObject head1 = child1.first();
                        if (document_search.NIL != find_term_in_cluster(head1, child2)) {
                            ConsesLow.set_nth(i, children, (SubLObject)document_search.NIL);
                        }
                    }
                }
            }
        }
        children = Sequences.remove_if((SubLObject)document_search.$sym62$NULL, children, (SubLObject)document_search.UNPROVIDED, (SubLObject)document_search.UNPROVIDED, (SubLObject)document_search.UNPROVIDED, (SubLObject)document_search.UNPROVIDED);
        if (document_search.ONE_INTEGER.numE(Sequences.length(children))) {
            return children.first();
        }
        return (SubLObject)ConsesLow.cons(root_term, children);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/document-search.lisp", position = 21267L)
    public static SubLObject build_cluster_from_dag(final SubLObject root_term, final SubLObject link_map, SubLObject seen_map) {
        if (seen_map == document_search.UNPROVIDED) {
            seen_map = dictionary.new_dictionary((SubLObject)document_search.UNPROVIDED, (SubLObject)document_search.UNPROVIDED);
        }
        SubLObject result = (SubLObject)document_search.NIL;
        final SubLObject terms = dictionary.dictionary_lookup(link_map, root_term, (SubLObject)document_search.UNPROVIDED);
        if (document_search.NIL == dictionary.dictionary_lookup(seen_map, root_term, (SubLObject)document_search.UNPROVIDED)) {
            dictionary.dictionary_enter(seen_map, root_term, (SubLObject)document_search.T);
            SubLObject cdolist_list_var = terms;
            SubLObject v_term = (SubLObject)document_search.NIL;
            v_term = cdolist_list_var.first();
            while (document_search.NIL != cdolist_list_var) {
                result = (SubLObject)ConsesLow.cons(build_cluster_from_dag(v_term, link_map, seen_map), result);
                cdolist_list_var = cdolist_list_var.rest();
                v_term = cdolist_list_var.first();
            }
            dictionary.dictionary_remove(seen_map, root_term);
        }
        return clean_cluster((SubLObject)ConsesLow.cons(root_term, result));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/document-search.lisp", position = 22217L)
    public static SubLObject get_terms_from_url(final SubLObject url, SubLObject mt) {
        if (mt == document_search.UNPROVIDED) {
            mt = document_search.$const45$InferencePSC;
        }
        final SubLObject text_object = html_utilities.remove_html_tags(web_utilities.get_html_source_from_url(url, (SubLObject)document_search.UNPROVIDED, (SubLObject)document_search.UNPROVIDED), (SubLObject)document_search.UNPROVIDED);
        final SubLObject dirty_text = text_object.isString() ? text_object : conses_high.second(text_object);
        final SubLObject clean_text = (SubLObject)((document_search.NIL == dirty_text) ? document_search.$str64$ : string_utilities.string_substitute((SubLObject)document_search.$str12$_, (SubLObject)document_search.$str65$_nbsp_, dirty_text, (SubLObject)document_search.UNPROVIDED));
        return get_terms_in_string(clean_text, mt, (SubLObject)document_search.UNPROVIDED, (SubLObject)document_search.UNPROVIDED);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/document-search.lisp", position = 22833L)
    public static SubLObject get_terms_in_string(final SubLObject string, SubLObject mt, SubLObject generation_mt, SubLObject filter) {
        if (mt == document_search.UNPROVIDED) {
            mt = document_search.$const45$InferencePSC;
        }
        if (generation_mt == document_search.UNPROVIDED) {
            generation_mt = document_search.$const67$EnglishParaphraseMt;
        }
        if (filter == document_search.UNPROVIDED) {
            filter = concept_filter.get_default_concept_filter_specification();
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject v_document = document.new_document(string, (SubLObject)document_search.UNPROVIDED, (SubLObject)document_search.UNPROVIDED);
        final SubLObject iterator = concept_tagger.tag_concepts(v_document, (SubLObject)ConsesLow.list((SubLObject)document_search.$kw68$FILTER, filter));
        final SubLObject total = document.document_sentence_length(v_document);
        SubLObject current = (SubLObject)document_search.ZERO_INTEGER;
        SubLObject results = (SubLObject)document_search.NIL;
        while (document_search.NIL == iteration.iteration_done(iterator)) {
            final SubLObject mt_var = mt_relevance_macros.with_inference_mt_relevance_validate(mt);
            final SubLObject _prev_bind_0 = mt_relevance_macros.$mt$.currentBinding(thread);
            final SubLObject _prev_bind_2 = mt_relevance_macros.$relevant_mt_function$.currentBinding(thread);
            final SubLObject _prev_bind_3 = mt_relevance_macros.$relevant_mts$.currentBinding(thread);
            try {
                mt_relevance_macros.$mt$.bind(mt_relevance_macros.update_inference_mt_relevance_mt(mt_var), thread);
                mt_relevance_macros.$relevant_mt_function$.bind(mt_relevance_macros.update_inference_mt_relevance_function(mt_var), thread);
                mt_relevance_macros.$relevant_mts$.bind(mt_relevance_macros.update_inference_mt_relevance_mt_list(mt_var), thread);
                final SubLObject sentence = iteration.iteration_next(iterator);
                final SubLObject sentence_text = document.sentence_string(sentence);
                current = Numbers.add((SubLObject)document_search.ONE_INTEGER, current);
                SubLObject cdolist_list_var = document.sentence_yield_exhaustive(sentence);
                SubLObject word = (SubLObject)document_search.NIL;
                word = cdolist_list_var.first();
                while (document_search.NIL != cdolist_list_var) {
                    SubLObject cdolist_list_var_$3 = document.word_cycls(word);
                    SubLObject v_term = (SubLObject)document_search.NIL;
                    v_term = cdolist_list_var_$3.first();
                    while (document_search.NIL != cdolist_list_var_$3) {
                        final SubLObject _prev_bind_0_$4 = pph_vars.$pph_terse_modeP$.currentBinding(thread);
                        final SubLObject _prev_bind_1_$5 = pph_vars.$pph_use_bulleted_listsP$.currentBinding(thread);
                        final SubLObject _prev_bind_2_$6 = pph_vars.$pph_replace_bulleted_list_tagsP$.currentBinding(thread);
                        final SubLObject _prev_bind_4 = pph_vars.$paraphrase_precision$.currentBinding(thread);
                        final SubLObject _prev_bind_5 = pph_vars.$pph_terse_mt_scopeP$.currentBinding(thread);
                        final SubLObject _prev_bind_6 = pph_vars.$pph_maximize_linksP$.currentBinding(thread);
                        final SubLObject _prev_bind_7 = pph_vars.$pph_link_arg0P$.currentBinding(thread);
                        final SubLObject _prev_bind_8 = pph_vars.$pph_use_smart_variable_replacementP$.currentBinding(thread);
                        final SubLObject _prev_bind_9 = pph_vars.$pph_demerit_cutoff$.currentBinding(thread);
                        final SubLObject _prev_bind_10 = pph_vars.$pph_use_title_capitalizationP$.currentBinding(thread);
                        final SubLObject _prev_bind_11 = pph_vars.$pph_use_indexical_datesP$.currentBinding(thread);
                        final SubLObject _prev_bind_12 = pph_vars.$pph_addressee$.currentBinding(thread);
                        final SubLObject _prev_bind_13 = pph_vars.$pph_speaker$.currentBinding(thread);
                        final SubLObject _prev_bind_14 = pph_vars.$pph_quantify_varsP$.currentBinding(thread);
                        try {
                            pph_vars.$pph_terse_modeP$.bind((SubLObject)document_search.T, thread);
                            pph_vars.$pph_use_bulleted_listsP$.bind((SubLObject)document_search.T, thread);
                            pph_vars.$pph_replace_bulleted_list_tagsP$.bind((SubLObject)document_search.NIL, thread);
                            pph_vars.$paraphrase_precision$.bind((SubLObject)document_search.NIL, thread);
                            pph_vars.$pph_terse_mt_scopeP$.bind((SubLObject)document_search.T, thread);
                            pph_vars.$pph_maximize_linksP$.bind((SubLObject)document_search.T, thread);
                            pph_vars.$pph_link_arg0P$.bind((SubLObject)document_search.T, thread);
                            pph_vars.$pph_use_smart_variable_replacementP$.bind((SubLObject)document_search.T, thread);
                            pph_vars.$pph_demerit_cutoff$.bind(number_utilities.positive_infinity(), thread);
                            pph_vars.$pph_use_title_capitalizationP$.bind((SubLObject)document_search.NIL, thread);
                            pph_vars.$pph_use_indexical_datesP$.bind((SubLObject)document_search.NIL, thread);
                            pph_vars.$pph_addressee$.bind((SubLObject)document_search.$kw69$UNKNOWN, thread);
                            pph_vars.$pph_speaker$.bind((SubLObject)document_search.$kw69$UNKNOWN, thread);
                            pph_vars.$pph_quantify_varsP$.bind((SubLObject)document_search.T, thread);
                            final SubLObject java_phrase = pph_main.generate_phrase_for_java(v_term, (SubLObject)document_search.$kw70$DEFAULT, (SubLObject)document_search.$kw71$NONE, generation_mt, mt, (SubLObject)document_search.UNPROVIDED);
                            final SubLObject result = (SubLObject)ConsesLow.list(java_phrase, narts_high.nart_substitute(v_term));
                            if (document_search.NIL != task_processor.task_process_pool_p(task_processor.get_task_process_pool_for_process(Threads.current_process()))) {
                                task_processor.post_task_info_processor_partial_results((SubLObject)ConsesLow.list(result, sentence_text, current, total));
                            }
                            else {
                                results = (SubLObject)ConsesLow.cons((SubLObject)ConsesLow.list(result, sentence_text, current, total), results);
                            }
                        }
                        finally {
                            pph_vars.$pph_quantify_varsP$.rebind(_prev_bind_14, thread);
                            pph_vars.$pph_speaker$.rebind(_prev_bind_13, thread);
                            pph_vars.$pph_addressee$.rebind(_prev_bind_12, thread);
                            pph_vars.$pph_use_indexical_datesP$.rebind(_prev_bind_11, thread);
                            pph_vars.$pph_use_title_capitalizationP$.rebind(_prev_bind_10, thread);
                            pph_vars.$pph_demerit_cutoff$.rebind(_prev_bind_9, thread);
                            pph_vars.$pph_use_smart_variable_replacementP$.rebind(_prev_bind_8, thread);
                            pph_vars.$pph_link_arg0P$.rebind(_prev_bind_7, thread);
                            pph_vars.$pph_maximize_linksP$.rebind(_prev_bind_6, thread);
                            pph_vars.$pph_terse_mt_scopeP$.rebind(_prev_bind_5, thread);
                            pph_vars.$paraphrase_precision$.rebind(_prev_bind_4, thread);
                            pph_vars.$pph_replace_bulleted_list_tagsP$.rebind(_prev_bind_2_$6, thread);
                            pph_vars.$pph_use_bulleted_listsP$.rebind(_prev_bind_1_$5, thread);
                            pph_vars.$pph_terse_modeP$.rebind(_prev_bind_0_$4, thread);
                        }
                        cdolist_list_var_$3 = cdolist_list_var_$3.rest();
                        v_term = cdolist_list_var_$3.first();
                    }
                    cdolist_list_var = cdolist_list_var.rest();
                    word = cdolist_list_var.first();
                }
            }
            finally {
                mt_relevance_macros.$relevant_mts$.rebind(_prev_bind_3, thread);
                mt_relevance_macros.$relevant_mt_function$.rebind(_prev_bind_2, thread);
                mt_relevance_macros.$mt$.rebind(_prev_bind_0, thread);
            }
        }
        return Sequences.reverse(results);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/document-search.lisp", position = 24702L)
    public static SubLObject list_itemL(final SubLObject list_item1, final SubLObject list_item2) {
        final SubLObject pph_item1 = conses_high.second(list_item1.first().first()).first();
        final SubLObject pph_item2 = conses_high.second(list_item2.first().first()).first();
        final SubLObject term1 = czer_main.canonicalize_term(conses_high.second(pph_item1), (SubLObject)document_search.UNPROVIDED);
        final SubLObject term2 = czer_main.canonicalize_term(conses_high.second(pph_item2), (SubLObject)document_search.UNPROVIDED);
        return kb_utilities.term_L(term1, term2, (SubLObject)document_search.UNPROVIDED, (SubLObject)document_search.UNPROVIDED, (SubLObject)document_search.UNPROVIDED);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/document-search.lisp", position = 24702L)
    public static SubLObject super_javalists_more_or_less_equal(SubLObject super_jl1, SubLObject super_jl2) {
        super_jl1 = Sort.sort(conses_high.copy_list(super_jl1), Symbols.symbol_function((SubLObject)document_search.$sym72$LIST_ITEM_), (SubLObject)document_search.UNPROVIDED);
        super_jl2 = Sort.sort(conses_high.copy_list(super_jl2), Symbols.symbol_function((SubLObject)document_search.$sym72$LIST_ITEM_), (SubLObject)document_search.UNPROVIDED);
        SubLObject failureP = (SubLObject)document_search.NIL;
        SubLObject super_list1_item = (SubLObject)document_search.NIL;
        SubLObject super_list1_item_$7 = (SubLObject)document_search.NIL;
        SubLObject super_list2_item = (SubLObject)document_search.NIL;
        SubLObject super_list2_item_$8 = (SubLObject)document_search.NIL;
        super_list1_item = super_jl1;
        super_list1_item_$7 = super_list1_item.first();
        super_list2_item = super_jl2;
        super_list2_item_$8 = super_list2_item.first();
        while (document_search.NIL != super_list2_item || document_search.NIL != super_list1_item) {
            final SubLObject jl1 = super_list1_item_$7.first().first();
            final SubLObject jl2 = super_list2_item_$8.first().first();
            if (document_search.NIL == failureP) {
                failureP = (SubLObject)SubLObjectFactory.makeBoolean(document_search.NIL == javalists_more_or_less_equal(jl1, jl2));
            }
            super_list1_item = super_list1_item.rest();
            super_list1_item_$7 = super_list1_item.first();
            super_list2_item = super_list2_item.rest();
            super_list2_item_$8 = super_list2_item.first();
        }
        return (SubLObject)SubLObjectFactory.makeBoolean(document_search.NIL == failureP);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/document-search.lisp", position = 24702L)
    public static SubLObject javalists_more_or_less_equal(final SubLObject jl1, final SubLObject jl2) {
        final SubLObject display_string1 = jl1.first();
        final SubLObject display_string2 = jl2.first();
        final SubLObject pph_list1 = conses_high.second(jl1);
        final SubLObject pph_list2 = conses_high.second(jl2);
        SubLObject failureP = (SubLObject)document_search.NIL;
        if (document_search.NIL == failureP) {
            SubLObject pph_item1 = (SubLObject)document_search.NIL;
            SubLObject pph_item1_$9 = (SubLObject)document_search.NIL;
            SubLObject pph_item2 = (SubLObject)document_search.NIL;
            SubLObject pph_item2_$10 = (SubLObject)document_search.NIL;
            pph_item1 = pph_list1;
            pph_item1_$9 = pph_item1.first();
            pph_item2 = pph_list2;
            pph_item2_$10 = pph_item2.first();
            while (document_search.NIL == failureP && (document_search.NIL != pph_item2 || document_search.NIL != pph_item1)) {
                if (document_search.NIL == failureP && (!pph_item1_$9.first().equal(pph_item2_$10.first()) || document_search.NIL == czer_utilities.equals_elP(czer_main.canonicalize_term(conses_high.second(pph_item1_$9), (SubLObject)document_search.UNPROVIDED), czer_main.canonicalize_term(conses_high.second(pph_item2_$10), (SubLObject)document_search.UNPROVIDED), (SubLObject)document_search.UNPROVIDED, (SubLObject)document_search.UNPROVIDED, (SubLObject)document_search.UNPROVIDED) || !conses_high.third(pph_item1_$9).equal(conses_high.third(pph_item2_$10)) || !conses_high.fifth(pph_item1_$9).equal(conses_high.fifth(pph_item2_$10)) || !conses_high.sixth(pph_item1_$9).equal(conses_high.sixth(pph_item2_$10)) || !display_string1.equal(display_string2))) {
                    Errors.warn((SubLObject)document_search.$str73$failed_on__S____S__, pph_item1_$9, pph_item2_$10);
                    failureP = (SubLObject)document_search.T;
                }
                pph_item1 = pph_item1.rest();
                pph_item1_$9 = pph_item1.first();
                pph_item2 = pph_item2.rest();
                pph_item2_$10 = pph_item2.first();
            }
        }
        return (SubLObject)SubLObjectFactory.makeBoolean(document_search.NIL == failureP);
    }
    
    public static SubLObject declare_document_search_file() {
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.document_search", "search_engine_p", "SEARCH-ENGINE-P", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.document_search", "register_search_engine", "REGISTER-SEARCH-ENGINE", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.document_search", "register_search_engine_int", "REGISTER-SEARCH-ENGINE-INT", 7, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.document_search", "deregister_search_engine", "DEREGISTER-SEARCH-ENGINE", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.document_search", "get_available_search_engines", "GET-AVAILABLE-SEARCH-ENGINES", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.document_search", "search_engine_availableP", "SEARCH-ENGINE-AVAILABLE?", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.document_search", "get_default_search_engine", "GET-DEFAULT-SEARCH-ENGINE", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.document_search", "set_default_search_engine", "SET-DEFAULT-SEARCH-ENGINE", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.document_search", "get_search_engine_description", "GET-SEARCH-ENGINE-DESCRIPTION", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.document_search", "generic_query_string_for_cycl_sentence", "GENERIC-QUERY-STRING-FOR-CYCL-SENTENCE", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.document_search", "query_string_for_cycl_sentence", "QUERY-STRING-FOR-CYCL-SENTENCE", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.document_search", "search_documents_for_cycl_sentence", "SEARCH-DOCUMENTS-FOR-CYCL-SENTENCE", 1, 3, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.document_search", "search_documents_for_nl_sentence", "SEARCH-DOCUMENTS-FOR-NL-SENTENCE", 1, 3, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.document_search", "search_documents", "SEARCH-DOCUMENTS", 1, 3, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.document_search", "search_count", "SEARCH-COUNT", 1, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.document_search", "search_url_availableP", "SEARCH-URL-AVAILABLE?", 0, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.document_search", "search_url", "SEARCH-URL", 1, 3, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.document_search", "search_url_for_cycl_sentence", "SEARCH-URL-FOR-CYCL-SENTENCE", 1, 3, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.document_search", "google_search_wrapper", "GOOGLE-SEARCH-WRAPPER", 3, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.document_search", "google_query_string_for_cycl_sentence", "GOOGLE-QUERY-STRING-FOR-CYCL-SENTENCE", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.document_search", "lucene_search_wrapper", "LUCENE-SEARCH-WRAPPER", 3, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.document_search", "lucene_count_wrapper", "LUCENE-COUNT-WRAPPER", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.document_search", "cyc_semantic_search_string", "CYC-SEMANTIC-SEARCH-STRING", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.document_search", "cyc_semantic_index_server_aliveP", "CYC-SEMANTIC-INDEX-SERVER-ALIVE?", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.document_search", "cyc_semantic_query_string_for_cycl_sentence", "CYC-SEMANTIC-QUERY-STRING-FOR-CYCL-SENTENCE", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.document_search", "replace_span_tags", "REPLACE-SPAN-TAGS", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.document_search", "cyc_semantic_search_wrapper", "CYC-SEMANTIC-SEARCH-WRAPPER", 3, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.document_search", "cyc_semantic_count_wrapper", "CYC-SEMANTIC-COUNT-WRAPPER", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.document_search", "min_cluster_parents_for_collection", "MIN-CLUSTER-PARENTS-FOR-COLLECTION", 1, 2, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.document_search", "min_cluster_parents_for_individual", "MIN-CLUSTER-PARENTS-FOR-INDIVIDUAL", 1, 2, false);
        SubLFiles.declareMacro("com.cyc.cycjava.cycl.document_search", "with_cluster_taxonomy", "WITH-CLUSTER-TAXONOMY");
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.document_search", "create_cluster", "CREATE-CLUSTER", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.document_search", "lookup_cluster", "LOOKUP-CLUSTER", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.document_search", "free_cluster", "FREE-CLUSTER", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.document_search", "release_cluster_resources_for_client", "RELEASE-CLUSTER-RESOURCES-FOR-CLIENT", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.document_search", "add_term_to_cluster", "ADD-TERM-TO-CLUSTER", 2, 2, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.document_search", "retrieve_cluster", "RETRIEVE-CLUSTER", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.document_search", "cluster_terms_ontologically", "CLUSTER-TERMS-ONTOLOGICALLY", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.document_search", "find_term_in_cluster", "FIND-TERM-IN-CLUSTER", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.document_search", "clean_cluster", "CLEAN-CLUSTER", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.document_search", "build_cluster_from_dag", "BUILD-CLUSTER-FROM-DAG", 2, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.document_search", "get_terms_from_url", "GET-TERMS-FROM-URL", 1, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.document_search", "get_terms_in_string", "GET-TERMS-IN-STRING", 1, 3, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.document_search", "list_itemL", "LIST-ITEM<", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.document_search", "super_javalists_more_or_less_equal", "SUPER-JAVALISTS-MORE-OR-LESS-EQUAL", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.document_search", "javalists_more_or_less_equal", "JAVALISTS-MORE-OR-LESS-EQUAL", 2, 0, false);
        return (SubLObject)document_search.NIL;
    }
    
    public static SubLObject init_document_search_file() {
        document_search.$search_engines$ = SubLFiles.deflexical("*SEARCH-ENGINES*", (SubLObject)document_search.$list0);
        document_search.$search_engine_specs$ = SubLFiles.deflexical("*SEARCH-ENGINE-SPECS*", (SubLObject)document_search.$list1);
        document_search.$default_search_engine$ = SubLFiles.defparameter("*DEFAULT-SEARCH-ENGINE*", (SubLObject)document_search.NIL);
        document_search.$cluster_id_isg$ = SubLFiles.deflexical("*CLUSTER-ID-ISG*", (document_search.NIL != Symbols.boundp((SubLObject)document_search.$sym50$_CLUSTER_ID_ISG_)) ? document_search.$cluster_id_isg$.getGlobalValue() : integer_sequence_generator.new_integer_sequence_generator((SubLObject)document_search.UNPROVIDED, (SubLObject)document_search.UNPROVIDED, (SubLObject)document_search.UNPROVIDED));
        document_search.$cluster_map$ = SubLFiles.deflexical("*CLUSTER-MAP*", (document_search.NIL != Symbols.boundp((SubLObject)document_search.$sym51$_CLUSTER_MAP_)) ? document_search.$cluster_map$.getGlobalValue() : dictionary.new_dictionary((SubLObject)document_search.UNPROVIDED, (SubLObject)document_search.UNPROVIDED));
        document_search.$cluster_lock$ = SubLFiles.deflexical("*CLUSTER-LOCK*", (document_search.NIL != Symbols.boundp((SubLObject)document_search.$sym52$_CLUSTER_LOCK_)) ? document_search.$cluster_lock$.getGlobalValue() : Locks.make_lock((SubLObject)document_search.$str53$Ontological_Cluster_Map_Lock));
        return (SubLObject)document_search.NIL;
    }
    
    public static SubLObject setup_document_search_file() {
        access_macros.register_external_symbol((SubLObject)document_search.$sym2$SEARCH_ENGINE_P);
        access_macros.register_external_symbol((SubLObject)document_search.$sym3$REGISTER_SEARCH_ENGINE);
        access_macros.register_external_symbol((SubLObject)document_search.$sym6$DEREGISTER_SEARCH_ENGINE);
        access_macros.register_external_symbol((SubLObject)document_search.$sym7$GET_AVAILABLE_SEARCH_ENGINES);
        access_macros.register_external_symbol((SubLObject)document_search.$sym8$SEARCH_ENGINE_AVAILABLE_);
        access_macros.register_external_symbol((SubLObject)document_search.$sym9$GET_DEFAULT_SEARCH_ENGINE);
        access_macros.register_external_symbol((SubLObject)document_search.$sym10$SET_DEFAULT_SEARCH_ENGINE);
        access_macros.register_external_symbol((SubLObject)document_search.$sym11$GET_SEARCH_ENGINE_DESCRIPTION);
        access_macros.register_external_symbol((SubLObject)document_search.$sym13$SEARCH_DOCUMENTS_FOR_CYCL_SENTENCE);
        access_macros.register_external_symbol((SubLObject)document_search.$sym14$SEARCH_DOCUMENTS_FOR_NL_SENTENCE);
        access_macros.register_external_symbol((SubLObject)document_search.$sym16$SEARCH_COUNT);
        access_macros.register_external_symbol((SubLObject)document_search.$sym17$SEARCH_URL_AVAILABLE_);
        access_macros.register_external_symbol((SubLObject)document_search.$sym18$SEARCH_URL);
        access_macros.register_external_symbol((SubLObject)document_search.$sym20$SEARCH_URL_FOR_CYCL_SENTENCE);
        subl_macro_promotions.declare_defglobal((SubLObject)document_search.$sym50$_CLUSTER_ID_ISG_);
        subl_macro_promotions.declare_defglobal((SubLObject)document_search.$sym51$_CLUSTER_MAP_);
        subl_macro_promotions.declare_defglobal((SubLObject)document_search.$sym52$_CLUSTER_LOCK_);
        access_macros.register_external_symbol((SubLObject)document_search.$sym54$CREATE_CLUSTER);
        access_macros.register_external_symbol((SubLObject)document_search.$sym56$FREE_CLUSTER);
        access_macros.register_external_symbol((SubLObject)document_search.$sym57$ADD_TERM_TO_CLUSTER);
        access_macros.register_external_symbol((SubLObject)document_search.$sym60$RETRIEVE_CLUSTER);
        access_macros.register_external_symbol((SubLObject)document_search.$sym61$CLUSTER_TERMS_ONTOLOGICALLY);
        access_macros.register_external_symbol((SubLObject)document_search.$sym63$GET_TERMS_FROM_URL);
        access_macros.register_external_symbol((SubLObject)document_search.$sym66$GET_TERMS_IN_STRING);
        generic_testing.define_test_case_table_int((SubLObject)document_search.$sym66$GET_TERMS_IN_STRING, (SubLObject)ConsesLow.list(new SubLObject[] { document_search.$kw74$TEST, document_search.$sym75$SUPER_JAVALISTS_MORE_OR_LESS_EQUAL, document_search.$kw76$OWNER, document_search.NIL, document_search.$kw77$CLASSES, document_search.NIL, document_search.$kw78$KB, document_search.$kw79$FULL, document_search.$kw80$WORKING_, document_search.NIL }), document_search.$list81);
        return (SubLObject)document_search.NIL;
    }
    
    private static SubLObject _constant_81_initializer() {
        return (SubLObject)ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeString("George Washington chopped down an apple tree"), constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("InferencePSC")), constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("EnglishParaphraseMt")), (SubLObject)document_search.NIL), (SubLObject)ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeString("George Washington"), (SubLObject)ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeString("George"), constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("GeorgeWashington")), (SubLObject)document_search.NIL, (SubLObject)SubLObjectFactory.makeString("<a href=\"cg?CB-CF&14961\" target=\"_self\">"), (SubLObject)document_search.NIL, (SubLObject)document_search.ZERO_INTEGER), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeString(" "), constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("GeorgeWashington")), (SubLObject)document_search.NIL, (SubLObject)document_search.NIL, (SubLObject)document_search.NIL, (SubLObject)document_search.SIX_INTEGER), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeString("Washington"), constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("GeorgeWashington")), (SubLObject)document_search.NIL, (SubLObject)document_search.NIL, (SubLObject)SubLObjectFactory.makeString("</a>"), (SubLObject)document_search.SEVEN_INTEGER))), constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("GeorgeWashington"))), (SubLObject)SubLObjectFactory.makeString("George Washington chopped down an apple tree"), (SubLObject)document_search.ONE_INTEGER, (SubLObject)document_search.ONE_INTEGER), (SubLObject)ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeString("George Washington University"), (SubLObject)ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeString("George"), constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("GeorgeWashingtonUniversity")), (SubLObject)document_search.NIL, (SubLObject)SubLObjectFactory.makeString("<a href=\"cg?CB-CF&67586\" target=\"_self\">"), (SubLObject)document_search.NIL, (SubLObject)document_search.ZERO_INTEGER), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeString(" "), constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("GeorgeWashingtonUniversity")), (SubLObject)document_search.NIL, (SubLObject)document_search.NIL, (SubLObject)document_search.NIL, (SubLObject)document_search.SIX_INTEGER), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeString("Washington"), constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("GeorgeWashingtonUniversity")), (SubLObject)document_search.NIL, (SubLObject)document_search.NIL, (SubLObject)document_search.NIL, (SubLObject)document_search.SEVEN_INTEGER), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeString(" "), constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("GeorgeWashingtonUniversity")), (SubLObject)document_search.NIL, (SubLObject)document_search.NIL, (SubLObject)document_search.NIL, (SubLObject)document_search.SEVENTEEN_INTEGER), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeString("University"), constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("GeorgeWashingtonUniversity")), (SubLObject)document_search.NIL, (SubLObject)document_search.NIL, (SubLObject)SubLObjectFactory.makeString("</a>"), (SubLObject)document_search.EIGHTEEN_INTEGER))), constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("GeorgeWashingtonUniversity"))), (SubLObject)SubLObjectFactory.makeString("George Washington chopped down an apple tree"), (SubLObject)document_search.ONE_INTEGER, (SubLObject)document_search.ONE_INTEGER), (SubLObject)ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeString("chopping"), (SubLObject)ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeString("chopping"), constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("ChoppingSomething")), (SubLObject)document_search.NIL, (SubLObject)SubLObjectFactory.makeString("<a href=\"cg?CB-CF&7109\" target=\"_self\">"), (SubLObject)SubLObjectFactory.makeString("</a>"), (SubLObject)document_search.ZERO_INTEGER))), constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("ChoppingSomething"))), (SubLObject)SubLObjectFactory.makeString("George Washington chopped down an apple tree"), (SubLObject)document_search.ONE_INTEGER, (SubLObject)document_search.ONE_INTEGER), (SubLObject)ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeString("apple tree"), (SubLObject)ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeString("apple"), constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("AppleTree")), (SubLObject)document_search.NIL, (SubLObject)SubLObjectFactory.makeString("<a href=\"cg?CB-CF&607\" target=\"_self\">"), (SubLObject)document_search.NIL, (SubLObject)document_search.ZERO_INTEGER), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeString(" "), constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("AppleTree")), (SubLObject)document_search.NIL, (SubLObject)document_search.NIL, (SubLObject)document_search.NIL, (SubLObject)document_search.FIVE_INTEGER), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeString("tree"), constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("AppleTree")), (SubLObject)document_search.NIL, (SubLObject)document_search.NIL, (SubLObject)SubLObjectFactory.makeString("</a>"), (SubLObject)document_search.SIX_INTEGER))), constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("AppleTree"))), (SubLObject)SubLObjectFactory.makeString("George Washington chopped down an apple tree"), (SubLObject)document_search.ONE_INTEGER, (SubLObject)document_search.ONE_INTEGER))), (SubLObject)ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeString("Osama bin Laden has been sighted in Afghanistan, and Mohammed Atta was seen in New York")), (SubLObject)ConsesLow.list(new SubLObject[] { ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeString("Osama bin Laden"), (SubLObject)ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeString("Osama"), constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("OsamaBinLaden")), (SubLObject)document_search.NIL, (SubLObject)SubLObjectFactory.makeString("<a href=\"cg?CB-CF&44138\" target=\"_self\">"), (SubLObject)document_search.NIL, (SubLObject)document_search.ZERO_INTEGER), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeString(" "), constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("OsamaBinLaden")), (SubLObject)document_search.NIL, (SubLObject)document_search.NIL, (SubLObject)document_search.NIL, (SubLObject)document_search.FIVE_INTEGER), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeString("bin"), constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("OsamaBinLaden")), (SubLObject)document_search.NIL, (SubLObject)document_search.NIL, (SubLObject)document_search.NIL, (SubLObject)document_search.SIX_INTEGER), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeString(" "), constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("OsamaBinLaden")), (SubLObject)document_search.NIL, (SubLObject)document_search.NIL, (SubLObject)document_search.NIL, (SubLObject)document_search.NINE_INTEGER), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeString("Laden"), constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("OsamaBinLaden")), (SubLObject)document_search.NIL, (SubLObject)document_search.NIL, (SubLObject)SubLObjectFactory.makeString("</a>"), (SubLObject)document_search.TEN_INTEGER))), constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("OsamaBinLaden"))), (SubLObject)SubLObjectFactory.makeString("Osama bin Laden has been sighted in Afghanistan, and Mohammed Atta was seen in New York"), (SubLObject)document_search.ONE_INTEGER, (SubLObject)document_search.ONE_INTEGER), ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeString("belonging"), (SubLObject)ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeString("belonging"), constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("possesses")), (SubLObject)document_search.NIL, (SubLObject)SubLObjectFactory.makeString("<a href=\"cg?CB-CF&17858\" target=\"_self\">"), (SubLObject)SubLObjectFactory.makeString("</a>"), (SubLObject)document_search.ZERO_INTEGER))), constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("possesses"))), (SubLObject)SubLObjectFactory.makeString("Osama bin Laden has been sighted in Afghanistan, and Mohammed Atta was seen in New York"), (SubLObject)document_search.ONE_INTEGER, (SubLObject)document_search.ONE_INTEGER), ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeString("sighting"), (SubLObject)ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeString("sighting"), constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("Sighting")), (SubLObject)document_search.NIL, (SubLObject)SubLObjectFactory.makeString("<a href=\"cg?CB-CF&123172\" target=\"_self\">"), (SubLObject)SubLObjectFactory.makeString("</a>"), (SubLObject)document_search.ZERO_INTEGER))), constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("Sighting"))), (SubLObject)SubLObjectFactory.makeString("Osama bin Laden has been sighted in Afghanistan, and Mohammed Atta was seen in New York"), (SubLObject)document_search.ONE_INTEGER, (SubLObject)document_search.ONE_INTEGER), ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeString("Afghanistan"), (SubLObject)ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeString("Afghanistan"), constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("Afghanistan")), (SubLObject)document_search.NIL, (SubLObject)SubLObjectFactory.makeString("<a href=\"cg?CB-CF&2761\" target=\"_self\">"), (SubLObject)SubLObjectFactory.makeString("</a>"), (SubLObject)document_search.ZERO_INTEGER))), constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("Afghanistan"))), (SubLObject)SubLObjectFactory.makeString("Osama bin Laden has been sighted in Afghanistan, and Mohammed Atta was seen in New York"), (SubLObject)document_search.ONE_INTEGER, (SubLObject)document_search.ONE_INTEGER), ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeString("Mohamed Atta"), (SubLObject)ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeString("Mohamed"), constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("MohamedAtta")), (SubLObject)document_search.NIL, (SubLObject)SubLObjectFactory.makeString("<a href=\"cg?CB-CF&94907\" target=\"_self\">"), (SubLObject)document_search.NIL, (SubLObject)document_search.ZERO_INTEGER), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeString(" "), constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("MohamedAtta")), (SubLObject)document_search.NIL, (SubLObject)document_search.NIL, (SubLObject)document_search.NIL, (SubLObject)document_search.SEVEN_INTEGER), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeString("Atta"), constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("MohamedAtta")), (SubLObject)document_search.NIL, (SubLObject)document_search.NIL, (SubLObject)SubLObjectFactory.makeString("</a>"), (SubLObject)document_search.EIGHT_INTEGER))), constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("MohamedAtta"))), (SubLObject)SubLObjectFactory.makeString("Osama bin Laden has been sighted in Afghanistan, and Mohammed Atta was seen in New York"), (SubLObject)document_search.ONE_INTEGER, (SubLObject)document_search.ONE_INTEGER), ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeString("visit"), (SubLObject)ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeString("visit"), constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("VisitingSomeone")), (SubLObject)document_search.NIL, (SubLObject)SubLObjectFactory.makeString("<a href=\"cg?CB-CF&5536\" target=\"_self\">"), (SubLObject)SubLObjectFactory.makeString("</a>"), (SubLObject)document_search.ZERO_INTEGER))), constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("VisitingSomeone"))), (SubLObject)SubLObjectFactory.makeString("Osama bin Laden has been sighted in Afghanistan, and Mohammed Atta was seen in New York"), (SubLObject)document_search.ONE_INTEGER, (SubLObject)document_search.ONE_INTEGER), ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeString("sight"), (SubLObject)ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeString("sight"), constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("sees")), (SubLObject)document_search.NIL, (SubLObject)SubLObjectFactory.makeString("<a href=\"cg?CB-CF&5242\" target=\"_self\">"), (SubLObject)SubLObjectFactory.makeString("</a>"), (SubLObject)document_search.ZERO_INTEGER))), constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("sees"))), (SubLObject)SubLObjectFactory.makeString("Osama bin Laden has been sighted in Afghanistan, and Mohammed Atta was seen in New York"), (SubLObject)document_search.ONE_INTEGER, (SubLObject)document_search.ONE_INTEGER), ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeString("meeting event"), (SubLObject)ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeString("meeting"), constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("MeetingSomeone")), (SubLObject)document_search.NIL, (SubLObject)SubLObjectFactory.makeString("<a href=\"cg?CB-CF&21509\" target=\"_self\">"), (SubLObject)document_search.NIL, (SubLObject)document_search.ZERO_INTEGER), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeString(" "), constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("MeetingSomeone")), (SubLObject)document_search.NIL, (SubLObject)document_search.NIL, (SubLObject)document_search.NIL, (SubLObject)document_search.SEVEN_INTEGER), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeString("event"), constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("MeetingSomeone")), (SubLObject)document_search.NIL, (SubLObject)document_search.NIL, (SubLObject)SubLObjectFactory.makeString("</a>"), (SubLObject)document_search.EIGHT_INTEGER))), constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("MeetingSomeone"))), (SubLObject)SubLObjectFactory.makeString("Osama bin Laden has been sighted in Afghanistan, and Mohammed Atta was seen in New York"), (SubLObject)document_search.ONE_INTEGER, (SubLObject)document_search.ONE_INTEGER), ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeString("visual perception"), (SubLObject)ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeString("visual"), constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("VisualPerception")), (SubLObject)document_search.NIL, (SubLObject)SubLObjectFactory.makeString("<a href=\"cg?CB-CF&5427\" target=\"_self\">"), (SubLObject)document_search.NIL, (SubLObject)document_search.ZERO_INTEGER), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeString(" "), constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("VisualPerception")), (SubLObject)document_search.NIL, (SubLObject)document_search.NIL, (SubLObject)document_search.NIL, (SubLObject)document_search.SIX_INTEGER), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeString("perception"), constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("VisualPerception")), (SubLObject)document_search.NIL, (SubLObject)document_search.NIL, (SubLObject)SubLObjectFactory.makeString("</a>"), (SubLObject)document_search.SEVEN_INTEGER))), constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("VisualPerception"))), (SubLObject)SubLObjectFactory.makeString("Osama bin Laden has been sighted in Afghanistan, and Mohammed Atta was seen in New York"), (SubLObject)document_search.ONE_INTEGER, (SubLObject)document_search.ONE_INTEGER), ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeString("New York"), (SubLObject)ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeString("New"), constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("NewYork-State")), (SubLObject)document_search.NIL, (SubLObject)SubLObjectFactory.makeString("<a href=\"cg?CB-CF&503\" target=\"_self\">"), (SubLObject)document_search.NIL, (SubLObject)document_search.ZERO_INTEGER), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeString(" "), constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("NewYork-State")), (SubLObject)document_search.NIL, (SubLObject)document_search.NIL, (SubLObject)document_search.NIL, (SubLObject)document_search.THREE_INTEGER), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeString("York"), constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("NewYork-State")), (SubLObject)document_search.NIL, (SubLObject)document_search.NIL, (SubLObject)SubLObjectFactory.makeString("</a>"), (SubLObject)document_search.FOUR_INTEGER))), constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("NewYork-State"))), (SubLObject)SubLObjectFactory.makeString("Osama bin Laden has been sighted in Afghanistan, and Mohammed Atta was seen in New York"), (SubLObject)document_search.ONE_INTEGER, (SubLObject)document_search.ONE_INTEGER), ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeString("New York City, NY"), (SubLObject)ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeString("New"), constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("CityOfNewYorkNY")), (SubLObject)document_search.NIL, (SubLObject)SubLObjectFactory.makeString("<a href=\"cg?CB-CF&2405\" target=\"_self\">"), (SubLObject)document_search.NIL, (SubLObject)document_search.ZERO_INTEGER), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeString(" "), constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("CityOfNewYorkNY")), (SubLObject)document_search.NIL, (SubLObject)document_search.NIL, (SubLObject)document_search.NIL, (SubLObject)document_search.THREE_INTEGER), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeString("York"), constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("CityOfNewYorkNY")), (SubLObject)document_search.NIL, (SubLObject)document_search.NIL, (SubLObject)document_search.NIL, (SubLObject)document_search.FOUR_INTEGER), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeString(" "), constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("CityOfNewYorkNY")), (SubLObject)document_search.NIL, (SubLObject)document_search.NIL, (SubLObject)document_search.NIL, (SubLObject)document_search.EIGHT_INTEGER), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeString("City,"), constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("CityOfNewYorkNY")), (SubLObject)document_search.NIL, (SubLObject)document_search.NIL, (SubLObject)document_search.NIL, (SubLObject)document_search.NINE_INTEGER), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeString(" "), constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("CityOfNewYorkNY")), (SubLObject)document_search.NIL, (SubLObject)document_search.NIL, (SubLObject)document_search.NIL, (SubLObject)document_search.FOURTEEN_INTEGER), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeString("NY"), constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("CityOfNewYorkNY")), (SubLObject)document_search.NIL, (SubLObject)document_search.NIL, (SubLObject)SubLObjectFactory.makeString("</a>"), (SubLObject)document_search.FIFTEEN_INTEGER))), constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("CityOfNewYorkNY"))), (SubLObject)SubLObjectFactory.makeString("Osama bin Laden has been sighted in Afghanistan, and Mohammed Atta was seen in New York"), (SubLObject)document_search.ONE_INTEGER, (SubLObject)document_search.ONE_INTEGER), ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeString("New York"), (SubLObject)ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeString("New"), constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("NewYork-Colony")), (SubLObject)document_search.NIL, (SubLObject)SubLObjectFactory.makeString("<a href=\"cg?CB-CF&166826\" target=\"_self\">"), (SubLObject)document_search.NIL, (SubLObject)document_search.ZERO_INTEGER), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeString(" "), constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("NewYork-Colony")), (SubLObject)document_search.NIL, (SubLObject)document_search.NIL, (SubLObject)document_search.NIL, (SubLObject)document_search.THREE_INTEGER), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeString("York"), constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("NewYork-Colony")), (SubLObject)document_search.NIL, (SubLObject)document_search.NIL, (SubLObject)SubLObjectFactory.makeString("</a>"), (SubLObject)document_search.FOUR_INTEGER))), constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("NewYork-Colony"))), (SubLObject)SubLObjectFactory.makeString("Osama bin Laden has been sighted in Afghanistan, and Mohammed Atta was seen in New York"), (SubLObject)document_search.ONE_INTEGER, (SubLObject)document_search.ONE_INTEGER) })), (SubLObject)ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeString("George Washington likes to eat apples")), (SubLObject)ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeString("George Washington"), (SubLObject)ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeString("George"), constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("GeorgeWashington")), (SubLObject)document_search.NIL, (SubLObject)SubLObjectFactory.makeString("<a href=\"cg?CB-CF&14961\" target=\"_self\">"), (SubLObject)document_search.NIL, (SubLObject)document_search.ZERO_INTEGER), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeString(" "), constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("GeorgeWashington")), (SubLObject)document_search.NIL, (SubLObject)document_search.NIL, (SubLObject)document_search.NIL, (SubLObject)document_search.SIX_INTEGER), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeString("Washington"), constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("GeorgeWashington")), (SubLObject)document_search.NIL, (SubLObject)document_search.NIL, (SubLObject)SubLObjectFactory.makeString("</a>"), (SubLObject)document_search.SEVEN_INTEGER))), constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("GeorgeWashington"))), (SubLObject)SubLObjectFactory.makeString("George Washington likes to eat apples"), (SubLObject)document_search.ONE_INTEGER, (SubLObject)document_search.ONE_INTEGER), (SubLObject)ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeString("George Washington University"), (SubLObject)ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeString("George"), constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("GeorgeWashingtonUniversity")), (SubLObject)document_search.NIL, (SubLObject)SubLObjectFactory.makeString("<a href=\"cg?CB-CF&67586\" target=\"_self\">"), (SubLObject)document_search.NIL, (SubLObject)document_search.ZERO_INTEGER), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeString(" "), constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("GeorgeWashingtonUniversity")), (SubLObject)document_search.NIL, (SubLObject)document_search.NIL, (SubLObject)document_search.NIL, (SubLObject)document_search.SIX_INTEGER), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeString("Washington"), constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("GeorgeWashingtonUniversity")), (SubLObject)document_search.NIL, (SubLObject)document_search.NIL, (SubLObject)document_search.NIL, (SubLObject)document_search.SEVEN_INTEGER), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeString(" "), constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("GeorgeWashingtonUniversity")), (SubLObject)document_search.NIL, (SubLObject)document_search.NIL, (SubLObject)document_search.NIL, (SubLObject)document_search.SEVENTEEN_INTEGER), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeString("University"), constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("GeorgeWashingtonUniversity")), (SubLObject)document_search.NIL, (SubLObject)document_search.NIL, (SubLObject)SubLObjectFactory.makeString("</a>"), (SubLObject)document_search.EIGHTEEN_INTEGER))), constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("GeorgeWashingtonUniversity"))), (SubLObject)SubLObjectFactory.makeString("George Washington likes to eat apples"), (SubLObject)document_search.ONE_INTEGER, (SubLObject)document_search.ONE_INTEGER), (SubLObject)ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeString("liking"), (SubLObject)ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeString("liking"), (SubLObject)ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("ExperiencingEmotionFn")), constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("Like"))), (SubLObject)document_search.NIL, (SubLObject)SubLObjectFactory.makeString("<a href=\"cg?CB-CF&-119393\" target=\"_self\">"), (SubLObject)SubLObjectFactory.makeString("</a>"), (SubLObject)document_search.ZERO_INTEGER))), (SubLObject)ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("ExperiencingEmotionFn")), constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("Like")))), (SubLObject)SubLObjectFactory.makeString("George Washington likes to eat apples"), (SubLObject)document_search.ONE_INTEGER, (SubLObject)document_search.ONE_INTEGER), (SubLObject)ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeString("liking"), (SubLObject)ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeString("liking"), constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("likes-Generic")), (SubLObject)document_search.NIL, (SubLObject)SubLObjectFactory.makeString("<a href=\"cg?CB-CF&83363\" target=\"_self\">"), (SubLObject)SubLObjectFactory.makeString("</a>"), (SubLObject)document_search.ZERO_INTEGER))), constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("likes-Generic"))), (SubLObject)SubLObjectFactory.makeString("George Washington likes to eat apples"), (SubLObject)document_search.ONE_INTEGER, (SubLObject)document_search.ONE_INTEGER), (SubLObject)ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeString("eating"), (SubLObject)ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeString("eating"), constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("EatingEvent")), (SubLObject)document_search.NIL, (SubLObject)SubLObjectFactory.makeString("<a href=\"cg?CB-CF&293\" target=\"_self\">"), (SubLObject)SubLObjectFactory.makeString("</a>"), (SubLObject)document_search.ZERO_INTEGER))), constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("EatingEvent"))), (SubLObject)SubLObjectFactory.makeString("George Washington likes to eat apples"), (SubLObject)document_search.ONE_INTEGER, (SubLObject)document_search.ONE_INTEGER), (SubLObject)ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeString("apple"), (SubLObject)ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeString("apple"), (SubLObject)ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("FruitFn")), constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("AppleTree"))), (SubLObject)document_search.NIL, (SubLObject)SubLObjectFactory.makeString("<a href=\"cg?CB-CF&-3414\" target=\"_self\">"), (SubLObject)SubLObjectFactory.makeString("</a>"), (SubLObject)document_search.ZERO_INTEGER))), (SubLObject)ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("FruitFn")), constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("AppleTree")))), (SubLObject)SubLObjectFactory.makeString("George Washington likes to eat apples"), (SubLObject)document_search.ONE_INTEGER, (SubLObject)document_search.ONE_INTEGER))));
    }
    
    public void declareFunctions() {
        declare_document_search_file();
    }
    
    public void initializeVariables() {
        init_document_search_file();
    }
    
    public void runTopLevelForms() {
        setup_document_search_file();
    }
    
    static {
        me = (SubLFile)new document_search();
        document_search.$search_engines$ = null;
        document_search.$search_engine_specs$ = null;
        document_search.$default_search_engine$ = null;
        document_search.$cluster_id_isg$ = null;
        document_search.$cluster_map$ = null;
        document_search.$cluster_lock$ = null;
        $list0 = ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("CYC-SEMANTIC"), (SubLObject)SubLObjectFactory.makeString("Cyc Semantic Search"), (SubLObject)SubLObjectFactory.makeSymbol("CYC-SEMANTIC-INDEX-SERVER-ALIVE?"), (SubLObject)SubLObjectFactory.makeSymbol("CYC-SEMANTIC-QUERY-STRING-FOR-CYCL-SENTENCE"), (SubLObject)SubLObjectFactory.makeSymbol("CYC-SEMANTIC-SEARCH-WRAPPER"), (SubLObject)SubLObjectFactory.makeSymbol("CYC-SEMANTIC-COUNT-WRAPPER"), (SubLObject)document_search.NIL), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("YAHOO"), (SubLObject)SubLObjectFactory.makeString("Yahoo!"), (SubLObject)SubLObjectFactory.makeSymbol("YAHOO-AVAILABLE?"), (SubLObject)SubLObjectFactory.makeSymbol("GENERIC-QUERY-STRING-FOR-CYCL-SENTENCE"), (SubLObject)SubLObjectFactory.makeSymbol("YAHOO-SEARCH"), (SubLObject)SubLObjectFactory.makeSymbol("YAHOO-COUNT"), (SubLObject)SubLObjectFactory.makeSymbol("YAHOO-SEARCH-URL")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("GOOGLE"), (SubLObject)SubLObjectFactory.makeString("Google"), (SubLObject)SubLObjectFactory.makeSymbol("GET-GOOGLE-KEY"), (SubLObject)SubLObjectFactory.makeSymbol("GOOGLE-QUERY-STRING-FOR-CYCL-SENTENCE"), (SubLObject)SubLObjectFactory.makeSymbol("GOOGLE-SEARCH-WRAPPER"), (SubLObject)SubLObjectFactory.makeSymbol("GOOGLE-COUNT"), (SubLObject)SubLObjectFactory.makeSymbol("GOOGLE-SEARCH-URL")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("LUCENE"), (SubLObject)SubLObjectFactory.makeString("Lucene"), (SubLObject)SubLObjectFactory.makeSymbol("WS-INDEX-SERVER-ALIVE?"), (SubLObject)SubLObjectFactory.makeSymbol("GENERIC-QUERY-STRING-FOR-CYCL-SENTENCE"), (SubLObject)SubLObjectFactory.makeSymbol("LUCENE-SEARCH-WRAPPER"), (SubLObject)SubLObjectFactory.makeSymbol("LUCENE-COUNT-WRAPPER"), (SubLObject)document_search.NIL));
        $list1 = ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("YAHOO"), (SubLObject)SubLObjectFactory.makeString("Yahoo!"), (SubLObject)SubLObjectFactory.makeSymbol("YAHOO-AVAILABLE?"), (SubLObject)SubLObjectFactory.makeSymbol("GENERIC-QUERY-STRING-FOR-CYCL-SENTENCE"), (SubLObject)SubLObjectFactory.makeSymbol("YAHOO-SEARCH"), (SubLObject)SubLObjectFactory.makeSymbol("YAHOO-COUNT"), (SubLObject)SubLObjectFactory.makeSymbol("YAHOO-SEARCH-URL")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("GOOGLE"), (SubLObject)SubLObjectFactory.makeString("Google"), (SubLObject)SubLObjectFactory.makeSymbol("GET-GOOGLE-KEY"), (SubLObject)SubLObjectFactory.makeSymbol("GOOGLE-QUERY-STRING-FOR-CYCL-SENTENCE"), (SubLObject)SubLObjectFactory.makeSymbol("GOOGLE-SEARCH-WRAPPER"), (SubLObject)SubLObjectFactory.makeSymbol("GOOGLE-COUNT"), (SubLObject)SubLObjectFactory.makeSymbol("GOOGLE-SEARCH-URL")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("LUCENE"), (SubLObject)SubLObjectFactory.makeString("Lucene"), (SubLObject)SubLObjectFactory.makeSymbol("WS-INDEX-SERVER-ALIVE?"), (SubLObject)SubLObjectFactory.makeSymbol("GENERIC-QUERY-STRING-FOR-CYCL-SENTENCE"), (SubLObject)SubLObjectFactory.makeSymbol("LUCENE-SEARCH-WRAPPER"), (SubLObject)SubLObjectFactory.makeSymbol("LUCENE-COUNT-WRAPPER"), (SubLObject)document_search.NIL), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("CYC-SEMANTIC"), (SubLObject)SubLObjectFactory.makeString("Cyc Semantic Search"), (SubLObject)SubLObjectFactory.makeSymbol("CYC-SEMANTIC-INDEX-SERVER-ALIVE?"), (SubLObject)SubLObjectFactory.makeSymbol("CYC-SEMANTIC-QUERY-STRING-FOR-CYCL-SENTENCE"), (SubLObject)SubLObjectFactory.makeSymbol("CYC-SEMANTIC-SEARCH-WRAPPER"), (SubLObject)SubLObjectFactory.makeSymbol("CYC-SEMANTIC-COUNT-WRAPPER"), (SubLObject)document_search.NIL));
        $sym2$SEARCH_ENGINE_P = SubLObjectFactory.makeSymbol("SEARCH-ENGINE-P");
        $sym3$REGISTER_SEARCH_ENGINE = SubLObjectFactory.makeSymbol("REGISTER-SEARCH-ENGINE");
        $list4 = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("SYMBOL"), (SubLObject)SubLObjectFactory.makeSymbol("DESCRIPTION"), (SubLObject)SubLObjectFactory.makeSymbol("AVAILABLE?"), (SubLObject)SubLObjectFactory.makeSymbol("STRING-FUNCTION"), (SubLObject)SubLObjectFactory.makeSymbol("SEARCH-FUNCTION"), (SubLObject)SubLObjectFactory.makeSymbol("COUNT-FUNCTION"), (SubLObject)SubLObjectFactory.makeSymbol("SEARCH-URL-FUNC"));
        $kw5$ENGINE_UNKNOWN = SubLObjectFactory.makeKeyword("ENGINE-UNKNOWN");
        $sym6$DEREGISTER_SEARCH_ENGINE = SubLObjectFactory.makeSymbol("DEREGISTER-SEARCH-ENGINE");
        $sym7$GET_AVAILABLE_SEARCH_ENGINES = SubLObjectFactory.makeSymbol("GET-AVAILABLE-SEARCH-ENGINES");
        $sym8$SEARCH_ENGINE_AVAILABLE_ = SubLObjectFactory.makeSymbol("SEARCH-ENGINE-AVAILABLE?");
        $sym9$GET_DEFAULT_SEARCH_ENGINE = SubLObjectFactory.makeSymbol("GET-DEFAULT-SEARCH-ENGINE");
        $sym10$SET_DEFAULT_SEARCH_ENGINE = SubLObjectFactory.makeSymbol("SET-DEFAULT-SEARCH-ENGINE");
        $sym11$GET_SEARCH_ENGINE_DESCRIPTION = SubLObjectFactory.makeSymbol("GET-SEARCH-ENGINE-DESCRIPTION");
        $str12$_ = SubLObjectFactory.makeString(" ");
        $sym13$SEARCH_DOCUMENTS_FOR_CYCL_SENTENCE = SubLObjectFactory.makeSymbol("SEARCH-DOCUMENTS-FOR-CYCL-SENTENCE");
        $sym14$SEARCH_DOCUMENTS_FOR_NL_SENTENCE = SubLObjectFactory.makeSymbol("SEARCH-DOCUMENTS-FOR-NL-SENTENCE");
        $kw15$CYC_SEMANTIC = SubLObjectFactory.makeKeyword("CYC-SEMANTIC");
        $sym16$SEARCH_COUNT = SubLObjectFactory.makeSymbol("SEARCH-COUNT");
        $sym17$SEARCH_URL_AVAILABLE_ = SubLObjectFactory.makeSymbol("SEARCH-URL-AVAILABLE?");
        $sym18$SEARCH_URL = SubLObjectFactory.makeSymbol("SEARCH-URL");
        $str19$Cannot_retrieve_a_search_url_beca = SubLObjectFactory.makeString("Cannot retrieve a search url because ~A does not provide that capability.");
        $sym20$SEARCH_URL_FOR_CYCL_SENTENCE = SubLObjectFactory.makeSymbol("SEARCH-URL-FOR-CYCL-SENTENCE");
        $kw21$SERVER_ERROR = SubLObjectFactory.makeKeyword("SERVER-ERROR");
        $str22$Server_error_ = SubLObjectFactory.makeString("Server error.");
        $kw23$ERROR = SubLObjectFactory.makeKeyword("ERROR");
        $str24$Error_ = SubLObjectFactory.makeString("Error.");
        $kw25$GOOGLE = SubLObjectFactory.makeKeyword("GOOGLE");
        $kw26$INTERP_ID = SubLObjectFactory.makeKeyword("INTERP-ID");
        $sym27$CATCH_ERROR_MESSAGE_HANDLER = SubLObjectFactory.makeSymbol("CATCH-ERROR-MESSAGE-HANDLER");
        $str28$0_0_q__0 = SubLObjectFactory.makeString("0#0#q\\^0");
        $sym29$DOC_ANNOTATION_IRRELEVANT_TERM = SubLObjectFactory.makeSymbol("DOC-ANNOTATION-IRRELEVANT-TERM");
        $sym30$CYCL_FORT_P = SubLObjectFactory.makeSymbol("CYCL-FORT-P");
        $str31$cycTermID____0_9____ = SubLObjectFactory.makeString("cycTermID=\"([0-9]+)\"");
        $str32$justification____a_zA_Z_0_9____ = SubLObjectFactory.makeString("justification=\"([a-zA-Z 0-9]+)\"");
        $str33$_span2_type__tooltip__id__ = SubLObjectFactory.makeString("<span2 type=\"tooltip\" id=\"");
        $str34$___strong_ = SubLObjectFactory.makeString("\"><strong>");
        $str35$_span_______ = SubLObjectFactory.makeString("<span [^>]+>");
        $str36$__span_ = SubLObjectFactory.makeString("</span>");
        $str37$__strong___span2_ = SubLObjectFactory.makeString("</strong></span2>");
        $str38$Cyc_Semantic_Search_was_unable_to = SubLObjectFactory.makeString("Cyc Semantic Search was unable to perform the search.");
        $kw39$URL = SubLObjectFactory.makeKeyword("URL");
        $str40$_html__font_color___005522___b_ = SubLObjectFactory.makeString("<html><font color=\"#005522\"><b>");
        $kw41$TITLE = SubLObjectFactory.makeKeyword("TITLE");
        $str42$__b___font___html_ = SubLObjectFactory.makeString("</b></font></html>");
        $kw43$SNIPPET = SubLObjectFactory.makeKeyword("SNIPPET");
        $str44$failed_to_replace_SPAN_tags___S__ = SubLObjectFactory.makeString("failed to replace SPAN tags: ~S~%");
        $const45$InferencePSC = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("InferencePSC"));
        $sym46$VALID_CONCEPT_FILTER_NODES = SubLObjectFactory.makeSymbol("VALID-CONCEPT-FILTER-NODES");
        $list47 = ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("SET")), (SubLObject)SubLObjectFactory.makeSymbol("&BODY"), (SubLObject)SubLObjectFactory.makeSymbol("BODY"));
        $sym48$CLET = SubLObjectFactory.makeSymbol("CLET");
        $sym49$_DEFAULT_CONCEPT_FILTER_SPECIFICATION_ = SubLObjectFactory.makeSymbol("*DEFAULT-CONCEPT-FILTER-SPECIFICATION*");
        $sym50$_CLUSTER_ID_ISG_ = SubLObjectFactory.makeSymbol("*CLUSTER-ID-ISG*");
        $sym51$_CLUSTER_MAP_ = SubLObjectFactory.makeSymbol("*CLUSTER-MAP*");
        $sym52$_CLUSTER_LOCK_ = SubLObjectFactory.makeSymbol("*CLUSTER-LOCK*");
        $str53$Ontological_Cluster_Map_Lock = SubLObjectFactory.makeString("Ontological Cluster Map Lock");
        $sym54$CREATE_CLUSTER = SubLObjectFactory.makeSymbol("CREATE-CLUSTER");
        $const55$Thing = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("Thing"));
        $sym56$FREE_CLUSTER = SubLObjectFactory.makeSymbol("FREE-CLUSTER");
        $sym57$ADD_TERM_TO_CLUSTER = SubLObjectFactory.makeSymbol("ADD-TERM-TO-CLUSTER");
        $const58$Collection = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("Collection"));
        $const59$Event = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("Event"));
        $sym60$RETRIEVE_CLUSTER = SubLObjectFactory.makeSymbol("RETRIEVE-CLUSTER");
        $sym61$CLUSTER_TERMS_ONTOLOGICALLY = SubLObjectFactory.makeSymbol("CLUSTER-TERMS-ONTOLOGICALLY");
        $sym62$NULL = SubLObjectFactory.makeSymbol("NULL");
        $sym63$GET_TERMS_FROM_URL = SubLObjectFactory.makeSymbol("GET-TERMS-FROM-URL");
        $str64$ = SubLObjectFactory.makeString("");
        $str65$_nbsp_ = SubLObjectFactory.makeString("&nbsp;");
        $sym66$GET_TERMS_IN_STRING = SubLObjectFactory.makeSymbol("GET-TERMS-IN-STRING");
        $const67$EnglishParaphraseMt = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("EnglishParaphraseMt"));
        $kw68$FILTER = SubLObjectFactory.makeKeyword("FILTER");
        $kw69$UNKNOWN = SubLObjectFactory.makeKeyword("UNKNOWN");
        $kw70$DEFAULT = SubLObjectFactory.makeKeyword("DEFAULT");
        $kw71$NONE = SubLObjectFactory.makeKeyword("NONE");
        $sym72$LIST_ITEM_ = SubLObjectFactory.makeSymbol("LIST-ITEM<");
        $str73$failed_on__S____S__ = SubLObjectFactory.makeString("failed on ~S~% ~S~%");
        $kw74$TEST = SubLObjectFactory.makeKeyword("TEST");
        $sym75$SUPER_JAVALISTS_MORE_OR_LESS_EQUAL = SubLObjectFactory.makeSymbol("SUPER-JAVALISTS-MORE-OR-LESS-EQUAL");
        $kw76$OWNER = SubLObjectFactory.makeKeyword("OWNER");
        $kw77$CLASSES = SubLObjectFactory.makeKeyword("CLASSES");
        $kw78$KB = SubLObjectFactory.makeKeyword("KB");
        $kw79$FULL = SubLObjectFactory.makeKeyword("FULL");
        $kw80$WORKING_ = SubLObjectFactory.makeKeyword("WORKING?");
        $list81 = _constant_81_initializer();
    }
}

/*

	Total time: 462 ms
	
*/