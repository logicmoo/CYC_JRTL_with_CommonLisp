package com.cyc.cycjava.cycl;


import static com.cyc.cycjava.cycl.access_macros.register_external_symbol;
import static com.cyc.cycjava.cycl.constant_handles.reader_make_constant_shell;
import static com.cyc.cycjava.cycl.cyc_testing.generic_testing.define_test_case_table_int;
import static com.cyc.cycjava.cycl.html_utilities.remove_html_tags;
import static com.cyc.cycjava.cycl.subl_macro_promotions.$catch_error_message_target$;
import static com.cyc.cycjava.cycl.subl_macro_promotions.declare_defglobal;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow.append;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow.cons;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow.list;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow.listS;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow.nth;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow.set_nth;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Functions.apply;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Locks.make_lock;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Locks.release_lock;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Locks.seize_lock;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Numbers.add;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Sequences.cconcatenate;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Sequences.length;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Sequences.nreverse;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Sequences.remove;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Sequences.remove_if;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Sequences.reverse;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Symbols.symbol_function;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Threads.current_process;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Values.values;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.makeBoolean;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.makeKeyword;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.makeString;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.makeSymbol;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.cdestructuring_bind.cdestructuring_bind_error;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.cdestructuring_bind.destructuring_bind_must_consp;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.conses_high.assoc;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.conses_high.copy_list;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.conses_high.fifth;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.conses_high.fourth;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.conses_high.getf;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.conses_high.member;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.conses_high.second;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.conses_high.sixth;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.conses_high.third;
import static com.cyc.tool.subl.util.SubLFiles.declareFunction;
import static com.cyc.tool.subl.util.SubLFiles.declareMacro;
import static com.cyc.tool.subl.util.SubLFiles.deflexical;
import static com.cyc.tool.subl.util.SubLFiles.defparameter;

import com.cyc.cycjava.cycl.quirk.search_engine;
import com.cyc.cycjava.cycl.sbhl.sbhl_marking_vars;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Errors;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Sort;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.SubLThread;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLList;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObject;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLProcess;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLString;
import com.cyc.tool.subl.jrtl.nativeCode.type.symbol.SubLSymbol;
import com.cyc.tool.subl.util.SubLFile;
import com.cyc.tool.subl.util.SubLTrampolineFile;
import com.cyc.tool.subl.util.SubLTranslatedFile;


public final class document_search extends SubLTranslatedFile {
    public static final SubLFile me = new document_search();

    public static final String myName = "com.cyc.cycjava.cycl.document_search";

    public static final String myFingerPrint = "4c68a9504653a7d19a7a57bcdeeaa5d41d386e097733f0d2547c28eb0cc72f20";

    // deflexical
    private static final SubLSymbol $search_engines$ = makeSymbol("*SEARCH-ENGINES*");

    // deflexical
    // Possible search engines, and all the information needed to register them
    private static final SubLSymbol $search_engine_specs$ = makeSymbol("*SEARCH-ENGINE-SPECS*");

    // defparameter
    private static final SubLSymbol $default_search_engine$ = makeSymbol("*DEFAULT-SEARCH-ENGINE*");







    // Internal Constants
    public static final SubLList $list0 = list(list(makeKeyword("CYC-SEMANTIC"), makeString("Cyc Semantic Search"), makeSymbol("CYC-SEMANTIC-INDEX-SERVER-ALIVE?"), makeSymbol("CYC-SEMANTIC-QUERY-STRING-FOR-CYCL-SENTENCE"), makeSymbol("CYC-SEMANTIC-SEARCH-WRAPPER"), makeSymbol("CYC-SEMANTIC-COUNT-WRAPPER"), NIL), list(makeKeyword("YAHOO"), makeString("Yahoo!"), makeSymbol("YAHOO-AVAILABLE?"), makeSymbol("GENERIC-QUERY-STRING-FOR-CYCL-SENTENCE"), makeSymbol("YAHOO-SEARCH"), makeSymbol("YAHOO-COUNT"), makeSymbol("YAHOO-SEARCH-URL")), list(makeKeyword("GOOGLE"), makeString("Google"), makeSymbol("GET-GOOGLE-KEY"), makeSymbol("GOOGLE-QUERY-STRING-FOR-CYCL-SENTENCE"), makeSymbol("GOOGLE-SEARCH-WRAPPER"), makeSymbol("GOOGLE-COUNT"), makeSymbol("GOOGLE-SEARCH-URL")), list(makeKeyword("LUCENE"), makeString("Lucene"), makeSymbol("WS-INDEX-SERVER-ALIVE?"), makeSymbol("GENERIC-QUERY-STRING-FOR-CYCL-SENTENCE"), makeSymbol("LUCENE-SEARCH-WRAPPER"), makeSymbol("LUCENE-COUNT-WRAPPER"), NIL));

    public static final SubLList $list1 = list(list(makeKeyword("YAHOO"), makeString("Yahoo!"), makeSymbol("YAHOO-AVAILABLE?"), makeSymbol("GENERIC-QUERY-STRING-FOR-CYCL-SENTENCE"), makeSymbol("YAHOO-SEARCH"), makeSymbol("YAHOO-COUNT"), makeSymbol("YAHOO-SEARCH-URL")), list(makeKeyword("GOOGLE"), makeString("Google"), makeSymbol("GET-GOOGLE-KEY"), makeSymbol("GOOGLE-QUERY-STRING-FOR-CYCL-SENTENCE"), makeSymbol("GOOGLE-SEARCH-WRAPPER"), makeSymbol("GOOGLE-COUNT"), makeSymbol("GOOGLE-SEARCH-URL")), list(makeKeyword("LUCENE"), makeString("Lucene"), makeSymbol("WS-INDEX-SERVER-ALIVE?"), makeSymbol("GENERIC-QUERY-STRING-FOR-CYCL-SENTENCE"), makeSymbol("LUCENE-SEARCH-WRAPPER"), makeSymbol("LUCENE-COUNT-WRAPPER"), NIL), list(makeKeyword("CYC-SEMANTIC"), makeString("Cyc Semantic Search"), makeSymbol("CYC-SEMANTIC-INDEX-SERVER-ALIVE?"), makeSymbol("CYC-SEMANTIC-QUERY-STRING-FOR-CYCL-SENTENCE"), makeSymbol("CYC-SEMANTIC-SEARCH-WRAPPER"), makeSymbol("CYC-SEMANTIC-COUNT-WRAPPER"), NIL));

    public static final SubLSymbol SEARCH_ENGINE_P = makeSymbol("SEARCH-ENGINE-P");

    public static final SubLSymbol REGISTER_SEARCH_ENGINE = makeSymbol("REGISTER-SEARCH-ENGINE");

    public static final SubLList $list4 = list(makeSymbol("SYMBOL"), makeSymbol("DESCRIPTION"), makeSymbol("AVAILABLE?"), makeSymbol("STRING-FUNCTION"), makeSymbol("SEARCH-FUNCTION"), makeSymbol("COUNT-FUNCTION"), makeSymbol("SEARCH-URL-FUNC"));



    public static final SubLSymbol DEREGISTER_SEARCH_ENGINE = makeSymbol("DEREGISTER-SEARCH-ENGINE");

    public static final SubLSymbol GET_AVAILABLE_SEARCH_ENGINES = makeSymbol("GET-AVAILABLE-SEARCH-ENGINES");

    public static final SubLSymbol $sym8$SEARCH_ENGINE_AVAILABLE_ = makeSymbol("SEARCH-ENGINE-AVAILABLE?");

    public static final SubLSymbol GET_DEFAULT_SEARCH_ENGINE = makeSymbol("GET-DEFAULT-SEARCH-ENGINE");

    public static final SubLSymbol SET_DEFAULT_SEARCH_ENGINE = makeSymbol("SET-DEFAULT-SEARCH-ENGINE");

    public static final SubLSymbol GET_SEARCH_ENGINE_DESCRIPTION = makeSymbol("GET-SEARCH-ENGINE-DESCRIPTION");

    public static final SubLString $$$_ = makeString(" ");

    public static final SubLSymbol SEARCH_DOCUMENTS_FOR_CYCL_SENTENCE = makeSymbol("SEARCH-DOCUMENTS-FOR-CYCL-SENTENCE");

    public static final SubLSymbol SEARCH_DOCUMENTS_FOR_NL_SENTENCE = makeSymbol("SEARCH-DOCUMENTS-FOR-NL-SENTENCE");



    public static final SubLSymbol SEARCH_COUNT = makeSymbol("SEARCH-COUNT");

    public static final SubLSymbol $sym17$SEARCH_URL_AVAILABLE_ = makeSymbol("SEARCH-URL-AVAILABLE?");

    public static final SubLSymbol SEARCH_URL = makeSymbol("SEARCH-URL");

    public static final SubLString $str19$Cannot_retrieve_a_search_url_beca = makeString("Cannot retrieve a search url because ~A does not provide that capability.");

    public static final SubLSymbol SEARCH_URL_FOR_CYCL_SENTENCE = makeSymbol("SEARCH-URL-FOR-CYCL-SENTENCE");



    public static final SubLString $str22$Server_error_ = makeString("Server error.");



    public static final SubLString $str24$Error_ = makeString("Error.");







    public static final SubLString $str28$0_0_q__0 = makeString("0#0#q\\^0");

    public static final SubLSymbol DOC_ANNOTATION_IRRELEVANT_TERM = makeSymbol("DOC-ANNOTATION-IRRELEVANT-TERM");

    public static final SubLSymbol CYCL_FORT_P = makeSymbol("CYCL-FORT-P");

    public static final SubLString $str31$cycTermID____0_9____ = makeString("cycTermID=\"([0-9]+)\"");

    public static final SubLString $str32$justification____a_zA_Z_0_9____ = makeString("justification=\"([a-zA-Z 0-9]+)\"");

    public static final SubLString $str33$_span2_type__tooltip__id__ = makeString("<span2 type=\"tooltip\" id=\"");

    public static final SubLString $str34$___strong_ = makeString("\"><strong>");

    public static final SubLString $str35$_span_______ = makeString("<span [^>]+>");

    public static final SubLString $str36$__span_ = makeString("</span>");

    public static final SubLString $str37$__strong___span2_ = makeString("</strong></span2>");

    public static final SubLString $str38$Cyc_Semantic_Search_was_unable_to = makeString("Cyc Semantic Search was unable to perform the search.");



    public static final SubLString $str40$_html__font_color___005522___b_ = makeString("<html><font color=\"#005522\"><b>");



    public static final SubLString $str42$__b___font___html_ = makeString("</b></font></html>");



    public static final SubLString $str44$failed_to_replace_SPAN_tags___S__ = makeString("failed to replace SPAN tags: ~S~%");

    private static final SubLObject $$InferencePSC = reader_make_constant_shell(makeString("InferencePSC"));

    public static final SubLSymbol VALID_CONCEPT_FILTER_NODES = makeSymbol("VALID-CONCEPT-FILTER-NODES");

    public static final SubLList $list47 = list(list(makeSymbol("SET")), makeSymbol("&BODY"), makeSymbol("BODY"));



    public static final SubLSymbol $default_concept_filter_specification$ = makeSymbol("*DEFAULT-CONCEPT-FILTER-SPECIFICATION*");

    public static final SubLSymbol $cluster_id_isg$ = makeSymbol("*CLUSTER-ID-ISG*");

    public static final SubLSymbol $cluster_map$ = makeSymbol("*CLUSTER-MAP*");

    public static final SubLSymbol $cluster_lock$ = makeSymbol("*CLUSTER-LOCK*");

    public static final SubLString $$$Ontological_Cluster_Map_Lock = makeString("Ontological Cluster Map Lock");

    public static final SubLSymbol CREATE_CLUSTER = makeSymbol("CREATE-CLUSTER");

    private static final SubLObject $$Thing = reader_make_constant_shell(makeString("Thing"));

    public static final SubLSymbol FREE_CLUSTER = makeSymbol("FREE-CLUSTER");

    public static final SubLSymbol ADD_TERM_TO_CLUSTER = makeSymbol("ADD-TERM-TO-CLUSTER");

    private static final SubLObject $$Collection = reader_make_constant_shell(makeString("Collection"));

    private static final SubLObject $$Event = reader_make_constant_shell(makeString("Event"));

    public static final SubLSymbol RETRIEVE_CLUSTER = makeSymbol("RETRIEVE-CLUSTER");

    public static final SubLSymbol CLUSTER_TERMS_ONTOLOGICALLY = makeSymbol("CLUSTER-TERMS-ONTOLOGICALLY");



    public static final SubLSymbol GET_TERMS_FROM_URL = makeSymbol("GET-TERMS-FROM-URL");

    public static final SubLString $str64$ = makeString("");

    public static final SubLString $str65$_nbsp_ = makeString("&nbsp;");

    public static final SubLSymbol GET_TERMS_IN_STRING = makeSymbol("GET-TERMS-IN-STRING");

    private static final SubLObject $$EnglishParaphraseMt = reader_make_constant_shell(makeString("EnglishParaphraseMt"));









    public static final SubLSymbol $sym72$LIST_ITEM_ = makeSymbol("LIST-ITEM<");

    public static final SubLString $str73$failed_on__S____S__ = makeString("failed on ~S~% ~S~%");



    public static final SubLSymbol SUPER_JAVALISTS_MORE_OR_LESS_EQUAL = makeSymbol("SUPER-JAVALISTS-MORE-OR-LESS-EQUAL");











    private static final SubLObject $list81 = _constant_81_initializer();

    public static SubLObject search_engine_p(final SubLObject v_object) {
        return list_utilities.alist_has_keyP($search_engine_specs$.getGlobalValue(), v_object, UNPROVIDED);
    }

    public static SubLObject register_search_engine(final SubLObject symbol) {
        if (NIL == list_utilities.alist_has_keyP($search_engine_specs$.getGlobalValue(), symbol, UNPROVIDED)) {
            return $ENGINE_UNKNOWN;
        }
        SubLObject current;
        final SubLObject datum = current = assoc(symbol, $search_engine_specs$.getGlobalValue(), UNPROVIDED, UNPROVIDED);
        SubLObject symbol_$1 = NIL;
        SubLObject description = NIL;
        SubLObject availableP = NIL;
        SubLObject string_function = NIL;
        SubLObject search_function = NIL;
        SubLObject count_function = NIL;
        SubLObject search_url_func = NIL;
        destructuring_bind_must_consp(current, datum, $list4);
        symbol_$1 = current.first();
        current = current.rest();
        destructuring_bind_must_consp(current, datum, $list4);
        description = current.first();
        current = current.rest();
        destructuring_bind_must_consp(current, datum, $list4);
        availableP = current.first();
        current = current.rest();
        destructuring_bind_must_consp(current, datum, $list4);
        string_function = current.first();
        current = current.rest();
        destructuring_bind_must_consp(current, datum, $list4);
        search_function = current.first();
        current = current.rest();
        destructuring_bind_must_consp(current, datum, $list4);
        count_function = current.first();
        current = current.rest();
        destructuring_bind_must_consp(current, datum, $list4);
        search_url_func = current.first();
        current = current.rest();
        if (NIL == current) {
            return register_search_engine_int(symbol_$1, description, availableP, string_function, search_function, count_function, search_url_func);
        }
        cdestructuring_bind_error(datum, $list4);
        return NIL;
    }

    public static SubLObject register_search_engine_int(final SubLObject symbol, final SubLObject description, final SubLObject availableP, final SubLObject string_function, final SubLObject search_function, final SubLObject count_function, final SubLObject search_url_func) {
        $search_engines$.setGlobalValue(list_utilities.alist_delete($search_engines$.getGlobalValue(), symbol, UNPROVIDED));
        $search_engines$.setGlobalValue(list_utilities.alist_enter($search_engines$.getGlobalValue(), symbol, list(description, availableP, string_function, search_function, count_function, search_url_func), UNPROVIDED));
        return symbol;
    }

    public static SubLObject deregister_search_engine(final SubLObject symbol) {
        $search_engines$.setGlobalValue(list_utilities.alist_delete($search_engines$.getGlobalValue(), symbol, UNPROVIDED));
        return symbol;
    }

    public static SubLObject get_available_search_engines() {
        SubLObject engines = NIL;
        SubLObject cdolist_list_var = $search_engines$.getGlobalValue();
        SubLObject engine = NIL;
        engine = cdolist_list_var.first();
        while (NIL != cdolist_list_var) {
            if (NIL != apply(third(engine), NIL)) {
                engines = cons(engine.first(), engines);
            }
            cdolist_list_var = cdolist_list_var.rest();
            engine = cdolist_list_var.first();
        } 
        return reverse(engines);
    }

    public static SubLObject search_engine_availableP(final SubLObject engine) {
        assert NIL != search_engine_p(engine) : "document_search.search_engine_p(engine) " + "CommonSymbols.NIL != document_search.search_engine_p(engine) " + engine;
        final SubLObject desc = list_utilities.alist_lookup($search_engines$.getGlobalValue(), engine, UNPROVIDED, UNPROVIDED);
        if (NIL == desc) {
            return NIL;
        }
        return apply(second(desc), NIL);
    }

    public static SubLObject get_default_search_engine() {
        final SubLThread thread = SubLProcess.currentSubLThread();
        if (NIL != $default_search_engine$.getDynamicValue(thread)) {
            return $default_search_engine$.getDynamicValue(thread);
        }
        set_default_search_engine(get_available_search_engines().first());
        return $default_search_engine$.getDynamicValue(thread);
    }

    public static SubLObject set_default_search_engine(final SubLObject engine) {
        assert NIL != search_engine_p(engine) : "document_search.search_engine_p(engine) " + "CommonSymbols.NIL != document_search.search_engine_p(engine) " + engine;
        $default_search_engine$.setDynamicValue(engine);
        return NIL;
    }

    public static SubLObject get_search_engine_description(final SubLObject engine) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        assert NIL != search_engine_p(engine) : "document_search.search_engine_p(engine) " + "CommonSymbols.NIL != document_search.search_engine_p(engine) " + engine;
        SubLObject description = NIL;
        thread.resetMultipleValues();
        final SubLObject desc = list_utilities.alist_lookup($search_engines$.getGlobalValue(), engine, UNPROVIDED, UNPROVIDED);
        final SubLObject found = thread.secondMultipleValue();
        thread.resetMultipleValues();
        if (NIL != found) {
            description = desc.first();
        }
        return description;
    }

    public static SubLObject generic_query_string_for_cycl_sentence(final SubLObject cycl_sentence) {
        final SubLObject search_string = qua_query.qua_query_string_for_cycl_sentence(cycl_sentence, UNPROVIDED, UNPROVIDED);
        final SubLObject string_without_eol = string_utilities.replace_substring(search_string, string_utilities.$new_line_string$.getGlobalValue(), $$$_);
        return string_without_eol;
    }

    public static SubLObject query_string_for_cycl_sentence(final SubLObject cycl_sentence, final SubLObject engine) {
        assert NIL != search_engine_p(engine) : "document_search.search_engine_p(engine) " + "CommonSymbols.NIL != document_search.search_engine_p(engine) " + engine;
        final SubLObject engine_desc = list_utilities.alist_lookup($search_engines$.getGlobalValue(), engine, UNPROVIDED, UNPROVIDED);
        if (NIL == engine_desc) {
            return NIL;
        }
        return apply(third(engine_desc), list(cycl_sentence));
    }

    public static SubLObject search_documents_for_cycl_sentence(final SubLObject search_sentence, SubLObject engine, SubLObject start, SubLObject hits) {
        if (engine == UNPROVIDED) {
            engine = get_default_search_engine();
        }
        if (start == UNPROVIDED) {
            start = ONE_INTEGER;
        }
        if (hits == UNPROVIDED) {
            hits = TEN_INTEGER;
        }
        assert NIL != search_engine_p(engine) : "document_search.search_engine_p(engine) " + "CommonSymbols.NIL != document_search.search_engine_p(engine) " + engine;
        final SubLObject search_string = query_string_for_cycl_sentence(search_sentence, engine);
        return search_documents(search_string, engine, start, hits);
    }

    public static SubLObject search_documents_for_nl_sentence(final SubLObject search_sentence, SubLObject engine, SubLObject start, SubLObject hits) {
        if (engine == UNPROVIDED) {
            engine = get_default_search_engine();
        }
        if (start == UNPROVIDED) {
            start = ONE_INTEGER;
        }
        if (hits == UNPROVIDED) {
            hits = TEN_INTEGER;
        }
        assert NIL != search_engine_p(engine) : "document_search.search_engine_p(engine) " + "CommonSymbols.NIL != document_search.search_engine_p(engine) " + engine;
        final SubLObject search_string = (engine == $CYC_SEMANTIC) ? cyc_semantic_search_string(search_sentence) : search_sentence;
        return search_documents(search_string, engine, start, hits);
    }

    public static SubLObject search_documents(final SubLObject search_string, SubLObject engine, SubLObject start, SubLObject hits) {
        if (engine == UNPROVIDED) {
            engine = get_default_search_engine();
        }
        if (start == UNPROVIDED) {
            start = ONE_INTEGER;
        }
        if (hits == UNPROVIDED) {
            hits = TEN_INTEGER;
        }
        assert NIL != search_engine_p(engine) : "document_search.search_engine_p(engine) " + "CommonSymbols.NIL != document_search.search_engine_p(engine) " + engine;
        final SubLObject engine_desc = list_utilities.alist_lookup($search_engines$.getGlobalValue(), engine, UNPROVIDED, UNPROVIDED);
        if (NIL == engine_desc) {
            return NIL;
        }
        return apply(fourth(engine_desc), list(search_string, start, hits));
    }

    public static SubLObject search_count(final SubLObject search_string, SubLObject engine) {
        if (engine == UNPROVIDED) {
            engine = get_default_search_engine();
        }
        assert NIL != search_engine_p(engine) : "document_search.search_engine_p(engine) " + "CommonSymbols.NIL != document_search.search_engine_p(engine) " + engine;
        final SubLObject engine_desc = list_utilities.alist_lookup($search_engines$.getGlobalValue(), engine, UNPROVIDED, UNPROVIDED);
        if (NIL == engine_desc) {
            return NIL;
        }
        return apply(fifth(engine_desc), list(search_string));
    }

    public static SubLObject search_url_availableP(SubLObject engine) {
        if (engine == UNPROVIDED) {
            engine = get_default_search_engine();
        }
        assert NIL != search_engine_p(engine) : "document_search.search_engine_p(engine) " + "CommonSymbols.NIL != document_search.search_engine_p(engine) " + engine;
        final SubLObject engine_desc = list_utilities.alist_lookup($search_engines$.getGlobalValue(), engine, UNPROVIDED, UNPROVIDED);
        if (NIL == engine_desc) {
            return NIL;
        }
        return NIL != sixth(engine_desc) ? T : NIL;
    }

    public static SubLObject search_url(final SubLObject search_string, SubLObject engine, SubLObject start, SubLObject hits) {
        if (engine == UNPROVIDED) {
            engine = get_default_search_engine();
        }
        if (start == UNPROVIDED) {
            start = ONE_INTEGER;
        }
        if (hits == UNPROVIDED) {
            hits = TEN_INTEGER;
        }
        assert NIL != search_engine_p(engine) : "document_search.search_engine_p(engine) " + "CommonSymbols.NIL != document_search.search_engine_p(engine) " + engine;
        final SubLObject engine_desc = list_utilities.alist_lookup($search_engines$.getGlobalValue(), engine, UNPROVIDED, UNPROVIDED);
        if (NIL == engine_desc) {
            return NIL;
        }
        if (NIL == sixth(engine_desc)) {
            Errors.error($str19$Cannot_retrieve_a_search_url_beca, engine_desc.first());
        }
        return apply(sixth(engine_desc), list(search_string, start, hits));
    }

    public static SubLObject search_url_for_cycl_sentence(final SubLObject search_sentence, SubLObject engine, SubLObject start, SubLObject hits) {
        if (engine == UNPROVIDED) {
            engine = get_default_search_engine();
        }
        if (start == UNPROVIDED) {
            start = ONE_INTEGER;
        }
        if (hits == UNPROVIDED) {
            hits = TEN_INTEGER;
        }
        assert NIL != search_engine_p(engine) : "document_search.search_engine_p(engine) " + "CommonSymbols.NIL != document_search.search_engine_p(engine) " + engine;
        final SubLObject search_string = query_string_for_cycl_sentence(search_sentence, engine);
        return search_url(search_string, engine, start, hits);
    }

    public static SubLObject google_search_wrapper(final SubLObject search_string, final SubLObject start, final SubLObject hits) {
        final SubLObject google_results = search_engine.google_search(search_string, start, hits);
        SubLObject results = NIL;
        if ($SERVER_ERROR == google_results) {
            return $str22$Server_error_;
        }
        if ($ERROR == google_results) {
            return $str24$Error_;
        }
        SubLObject list_var = NIL;
        SubLObject result = NIL;
        SubLObject result_number = NIL;
        list_var = google_results;
        result = list_var.first();
        for (result_number = ZERO_INTEGER; NIL != list_var; list_var = list_var.rest() , result = list_var.first() , result_number = add(ONE_INTEGER, result_number)) {
            if (result_number.numL(hits)) {
                final SubLObject url = search_engine.google_passage_get_url_method(result);
                final SubLObject rank = search_engine.google_passage_get_rank_method(result);
                final SubLObject title = search_engine.google_passage_get_title_method(result);
                final SubLObject snippet = search_engine.google_passage_get_snippet_method(result);
                final SubLObject item_var;
                final SubLObject v_answer = item_var = list(rank, url, title, snippet);
                if (NIL == member(item_var, results, symbol_function(EQL), symbol_function(IDENTITY))) {
                    results = cons(item_var, results);
                }
            }
        }
        return reverse(results);
    }

    public static SubLObject google_query_string_for_cycl_sentence(final SubLObject cycl_sentence) {
        final SubLObject search_string = qua_query.qua_query_string_for_cycl_sentence(cycl_sentence, $GOOGLE, UNPROVIDED);
        final SubLObject string_without_eol = string_utilities.replace_substring(search_string, string_utilities.$new_line_string$.getGlobalValue(), $$$_);
        return string_without_eol;
    }

    public static SubLObject lucene_search_wrapper(final SubLObject search_string, final SubLObject start, final SubLObject hits) {
        final SubLObject pages = lucene_index.ws_index_search_with_titles_and_snippets(search_string, start, hits, UNPROVIDED, UNPROVIDED);
        SubLObject results = NIL;
        SubLObject cdolist_list_var = pages;
        SubLObject result = NIL;
        result = cdolist_list_var.first();
        while (NIL != cdolist_list_var) {
            final SubLObject rank = result.first();
            final SubLObject url = http_kernel.get_absolute_url(second(result), UNPROVIDED);
            final SubLObject title = third(result);
            final SubLObject snippet = fourth(result);
            results = cons(list(rank, url, title, snippet), results);
            cdolist_list_var = cdolist_list_var.rest();
            result = cdolist_list_var.first();
        } 
        return reverse(results);
    }

    public static SubLObject lucene_count_wrapper(final SubLObject search_string) {
        return lucene_index.ws_index_count(search_string, UNPROVIDED, UNPROVIDED);
    }

    public static SubLObject cyc_semantic_search_string(final SubLObject text_string) {
        SubLObject ids = NIL;
        SubLObject cdolist_list_var = document_annotation_widgets.terms_for_cyc_semantic_query(text_string);
        SubLObject record = NIL;
        record = cdolist_list_var.first();
        while (NIL != cdolist_list_var) {
            SubLObject cdolist_list_var_$2 = record.rest();
            SubLObject interps = NIL;
            interps = cdolist_list_var_$2.first();
            while (NIL != cdolist_list_var_$2) {
                ids = cons(getf(interps, $INTERP_ID, UNPROVIDED), ids);
                cdolist_list_var_$2 = cdolist_list_var_$2.rest();
                interps = cdolist_list_var_$2.first();
            } 
            cdolist_list_var = cdolist_list_var.rest();
            record = cdolist_list_var.first();
        } 
        return string_utilities.bunge(nreverse(ids), UNPROVIDED);
    }

    public static SubLObject cyc_semantic_index_server_aliveP() {
        final SubLThread thread = SubLProcess.currentSubLThread();
        if (NIL == document_annotation_widgets.semantic_index_initializedP()) {
            return NIL;
        }
        SubLObject error_msg = NIL;
        try {
            thread.throwStack.push($catch_error_message_target$.getGlobalValue());
            final SubLObject _prev_bind_0 = Errors.$error_handler$.currentBinding(thread);
            try {
                Errors.$error_handler$.bind(CATCH_ERROR_MESSAGE_HANDLER, thread);
                try {
                    document_annotation_widgets.lucene_sem_query_with_sem_search_string($str28$0_0_q__0, ONE_INTEGER);
                } catch (final Throwable catch_var) {
                    Errors.handleThrowable(catch_var, NIL);
                }
            } finally {
                Errors.$error_handler$.rebind(_prev_bind_0, thread);
            }
        } catch (final Throwable ccatch_env_var) {
            error_msg = Errors.handleThrowable(ccatch_env_var, $catch_error_message_target$.getGlobalValue());
        } finally {
            thread.throwStack.pop();
        }
        if (NIL == error_msg) {
            return T;
        }
        return NIL;
    }

    public static SubLObject cyc_semantic_query_string_for_cycl_sentence(final SubLObject cycl_sent) {
        final SubLObject cycl_terms = remove_if(DOC_ANNOTATION_IRRELEVANT_TERM, cycl_utilities.expression_gather(cycl_sent, CYCL_FORT_P, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED), UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
        SubLObject query_terms = NIL;
        SubLObject cdolist_list_var = cycl_terms;
        SubLObject cycl_term = NIL;
        cycl_term = cdolist_list_var.first();
        while (NIL != cdolist_list_var) {
            final SubLObject item_var = document_annotation_widgets.cyc_semantic_search_token(NIL, cycl_term);
            if (NIL == member(item_var, query_terms, symbol_function(EQUAL), symbol_function(IDENTITY))) {
                query_terms = cons(item_var, query_terms);
            }
            cdolist_list_var = cdolist_list_var.rest();
            cycl_term = cdolist_list_var.first();
        } 
        return string_utilities.bunge(query_terms, UNPROVIDED);
    }

    public static SubLObject replace_span_tags(SubLObject snippet) {
        SubLObject cdolist_list_var = regular_expression_utilities.find_all_matches_for_regular_expression($str35$_span_______, snippet, UNPROVIDED, UNPROVIDED);
        SubLObject span_tag = NIL;
        span_tag = cdolist_list_var.first();
        while (NIL != cdolist_list_var) {
            final SubLObject term_id = second(regular_expression_utilities.regexp_capturing_match($str31$cycTermID____0_9____, span_tag, UNPROVIDED, UNPROVIDED));
            final SubLObject justification_terms = string_utilities.split_string(second(regular_expression_utilities.regexp_capturing_match($str32$justification____a_zA_Z_0_9____, span_tag, UNPROVIDED, UNPROVIDED)), UNPROVIDED);
            final SubLObject relation_id = justification_terms.first();
            final SubLObject related_term_id = second(justification_terms);
            if (((NIL != term_id) && (NIL != relation_id)) && (NIL != related_term_id)) {
                snippet = string_utilities.replace_substring(snippet, span_tag, cconcatenate($str33$_span2_type__tooltip__id__, new SubLObject[]{ format_nil.format_nil_a_no_copy(term_id), $$$_, format_nil.format_nil_a_no_copy(relation_id), $$$_, format_nil.format_nil_a_no_copy(related_term_id), $str34$___strong_ }));
            }
            cdolist_list_var = cdolist_list_var.rest();
            span_tag = cdolist_list_var.first();
        } 
        snippet = string_utilities.replace_substring(snippet, $str36$__span_, $str37$__strong___span2_);
        return snippet;
    }

    public static SubLObject cyc_semantic_search_wrapper(final SubLObject search_string, final SubLObject start, final SubLObject hits) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject rank = ONE_INTEGER;
        SubLObject results = NIL;
        SubLObject error_msg = NIL;
        SubLObject search_results = NIL;
        try {
            thread.throwStack.push($catch_error_message_target$.getGlobalValue());
            final SubLObject _prev_bind_0 = Errors.$error_handler$.currentBinding(thread);
            try {
                Errors.$error_handler$.bind(CATCH_ERROR_MESSAGE_HANDLER, thread);
                try {
                    search_results = document_annotation_widgets.lucene_sem_query_with_sem_search_string(search_string, hits);
                } catch (final Throwable catch_var) {
                    Errors.handleThrowable(catch_var, NIL);
                }
            } finally {
                Errors.$error_handler$.rebind(_prev_bind_0, thread);
            }
        } catch (final Throwable ccatch_env_var) {
            error_msg = Errors.handleThrowable(ccatch_env_var, $catch_error_message_target$.getGlobalValue());
        } finally {
            thread.throwStack.pop();
        }
        if (NIL != error_msg) {
            return $str38$Cyc_Semantic_Search_was_unable_to;
        }
        SubLObject cdolist_list_var = search_results;
        SubLObject search_result = NIL;
        search_result = cdolist_list_var.first();
        while (NIL != cdolist_list_var) {
            final SubLObject url = list_utilities.plist_lookup(search_result, $URL, UNPROVIDED);
            final SubLObject title = cconcatenate($str40$_html__font_color___005522___b_, new SubLObject[]{ list_utilities.plist_lookup(search_result, $TITLE, UNPROVIDED), $str42$__b___font___html_ });
            SubLObject snippet = list_utilities.plist_lookup(search_result, $SNIPPET, UNPROVIDED);
            error_msg = NIL;
            try {
                thread.throwStack.push($catch_error_message_target$.getGlobalValue());
                final SubLObject _prev_bind_2 = Errors.$error_handler$.currentBinding(thread);
                try {
                    Errors.$error_handler$.bind(CATCH_ERROR_MESSAGE_HANDLER, thread);
                    try {
                        snippet = replace_span_tags(snippet);
                        results = cons(list(rank, url, title, snippet), results);
                    } catch (final Throwable catch_var2) {
                        Errors.handleThrowable(catch_var2, NIL);
                    }
                } finally {
                    Errors.$error_handler$.rebind(_prev_bind_2, thread);
                }
            } catch (final Throwable ccatch_env_var2) {
                error_msg = Errors.handleThrowable(ccatch_env_var2, $catch_error_message_target$.getGlobalValue());
            } finally {
                thread.throwStack.pop();
            }
            if (NIL != error_msg) {
                Errors.warn($str44$failed_to_replace_SPAN_tags___S__, error_msg);
            }
            rank = add(rank, ONE_INTEGER);
            cdolist_list_var = cdolist_list_var.rest();
            search_result = cdolist_list_var.first();
        } 
        return nreverse(results);
    }

    public static SubLObject cyc_semantic_count_wrapper(final SubLObject search_string) {
        return TEN_INTEGER;
    }

    public static SubLObject min_cluster_parents_for_collection(final SubLObject col, SubLObject mt, SubLObject tv) {
        if (mt == UNPROVIDED) {
            mt = $$InferencePSC;
        }
        if (tv == UNPROVIDED) {
            tv = NIL;
        }
        final SubLObject all_genls = genls.all_genls(col, mt, tv);
        final SubLObject genls_of_type = list_utilities.remove_if_not(symbol_function(VALID_CONCEPT_FILTER_NODES), all_genls, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
        return genls.min_cols(remove(col, genls_of_type, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED), mt, tv);
    }

    public static SubLObject min_cluster_parents_for_individual(final SubLObject v_term, SubLObject mt, SubLObject tv) {
        if (mt == UNPROVIDED) {
            mt = $$InferencePSC;
        }
        if (tv == UNPROVIDED) {
            tv = NIL;
        }
        final SubLObject all_isas = isa.all_isa(v_term, mt, tv);
        final SubLObject isas_of_type = list_utilities.remove_if_not(symbol_function(VALID_CONCEPT_FILTER_NODES), all_isas, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
        return genls.min_cols(isas_of_type, mt, tv);
    }

    public static SubLObject with_cluster_taxonomy(final SubLObject macroform, final SubLObject environment) {
        SubLObject current;
        final SubLObject datum = current = macroform.rest();
        destructuring_bind_must_consp(current, datum, $list47);
        final SubLObject temp = current.rest();
        current = current.first();
        SubLObject v_set = NIL;
        destructuring_bind_must_consp(current, datum, $list47);
        v_set = current.first();
        current = current.rest();
        if (NIL == current) {
            final SubLObject body;
            current = body = temp;
            return listS(CLET, list(list($default_concept_filter_specification$, v_set)), append(body, NIL));
        }
        cdestructuring_bind_error(datum, $list47);
        return NIL;
    }

    public static SubLObject create_cluster() {
        final SubLObject v_graph = dictionary.new_dictionary(UNPROVIDED, UNPROVIDED);
        final SubLObject root_node = $$Thing;
        final SubLObject uuid = task_processor.get_current_task_processor_client();
        final SubLObject id = integer_sequence_generator.integer_sequence_generator_next($cluster_id_isg$.getGlobalValue());
        SubLObject release = NIL;
        try {
            release = seize_lock($cluster_lock$.getGlobalValue());
            dictionary.dictionary_enter($cluster_map$.getGlobalValue(), id, list(v_graph, root_node, uuid));
        } finally {
            if (NIL != release) {
                release_lock($cluster_lock$.getGlobalValue());
            }
        }
        dictionary.dictionary_enter(v_graph, root_node, NIL);
        return id;
    }

    public static SubLObject lookup_cluster(final SubLObject graph_id) {
        SubLObject v_graph = NIL;
        SubLObject root = NIL;
        SubLObject uuid = NIL;
        SubLObject release = NIL;
        try {
            release = seize_lock($cluster_lock$.getGlobalValue());
            final SubLObject graph_triplet = dictionary.dictionary_lookup($cluster_map$.getGlobalValue(), graph_id, UNPROVIDED);
            v_graph = graph_triplet.first();
            root = second(graph_triplet);
            uuid = third(graph_triplet);
        } finally {
            if (NIL != release) {
                release_lock($cluster_lock$.getGlobalValue());
            }
        }
        return values(v_graph, root, uuid);
    }

    public static SubLObject free_cluster(final SubLObject graph_id) {
        SubLObject release = NIL;
        try {
            release = seize_lock($cluster_lock$.getGlobalValue());
            dictionary.dictionary_remove($cluster_map$.getGlobalValue(), graph_id);
        } finally {
            if (NIL != release) {
                release_lock($cluster_lock$.getGlobalValue());
            }
        }
        return NIL;
    }

    public static SubLObject release_cluster_resources_for_client(final SubLObject client_uuid) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject release = NIL;
        try {
            release = seize_lock($cluster_lock$.getGlobalValue());
            SubLObject iteration_state;
            for (iteration_state = dictionary_contents.do_dictionary_contents_state(dictionary.dictionary_contents($cluster_map$.getGlobalValue())); NIL == dictionary_contents.do_dictionary_contents_doneP(iteration_state); iteration_state = dictionary_contents.do_dictionary_contents_next(iteration_state)) {
                thread.resetMultipleValues();
                final SubLObject id = dictionary_contents.do_dictionary_contents_key_value(iteration_state);
                final SubLObject graph_triplet = thread.secondMultipleValue();
                thread.resetMultipleValues();
                final SubLObject graph_uuid = third(graph_triplet);
                if (graph_uuid.equal(client_uuid)) {
                    free_cluster(id);
                }
            }
            dictionary_contents.do_dictionary_contents_finalize(iteration_state);
        } finally {
            if (NIL != release) {
                release_lock($cluster_lock$.getGlobalValue());
            }
        }
        return NIL;
    }

    public static SubLObject add_term_to_cluster(final SubLObject graph_id, final SubLObject v_term, SubLObject mt, SubLObject seen_map) {
        if (mt == UNPROVIDED) {
            mt = $$InferencePSC;
        }
        if (seen_map == UNPROVIDED) {
            seen_map = dictionary.new_dictionary(UNPROVIDED, UNPROVIDED);
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject already_resourcing_p = sbhl_marking_vars.$resourcing_sbhl_marking_spaces_p$.getDynamicValue(thread);
        final SubLObject _prev_bind_0 = sbhl_marking_vars.$resourced_sbhl_marking_space_limit$.currentBinding(thread);
        final SubLObject _prev_bind_2 = sbhl_marking_vars.$resourced_sbhl_marking_spaces$.currentBinding(thread);
        final SubLObject _prev_bind_3 = sbhl_marking_vars.$resourcing_sbhl_marking_spaces_p$.currentBinding(thread);
        try {
            sbhl_marking_vars.$resourced_sbhl_marking_space_limit$.bind(sbhl_marking_vars.determine_resource_limit(already_resourcing_p, SIX_INTEGER), thread);
            sbhl_marking_vars.$resourced_sbhl_marking_spaces$.bind(sbhl_marking_vars.possibly_new_marking_resource(already_resourcing_p), thread);
            sbhl_marking_vars.$resourcing_sbhl_marking_spaces_p$.bind(T, thread);
            thread.resetMultipleValues();
            final SubLObject v_graph = lookup_cluster(graph_id);
            final SubLObject root = thread.secondMultipleValue();
            thread.resetMultipleValues();
            if (NIL == dictionary_utilities.dictionary_has_keyP(v_graph, v_term)) {
                dictionary.dictionary_enter(v_graph, v_term, NIL);
                dictionary.dictionary_enter(seen_map, v_term, T);
                final SubLObject parents = (NIL != isa.isaP(v_term, $$Collection, mt, UNPROVIDED)) ? min_cluster_parents_for_collection(v_term, mt, UNPROVIDED) : min_cluster_parents_for_individual(v_term, mt, UNPROVIDED);
                SubLObject seen_a_parent = NIL;
                SubLObject cdolist_list_var = parents;
                SubLObject parent = NIL;
                parent = cdolist_list_var.first();
                while (NIL != cdolist_list_var) {
                    if ((NIL == dictionary_utilities.dictionary_has_keyP(seen_map, parent)) && (NIL == cardinality_estimates.generality_estimateG(parent, $$Event))) {
                        seen_a_parent = T;
                        add_term_to_cluster(graph_id, parent, mt, seen_map);
                        dictionary_utilities.dictionary_pushnew(v_graph, parent, v_term, UNPROVIDED, UNPROVIDED);
                    }
                    cdolist_list_var = cdolist_list_var.rest();
                    parent = cdolist_list_var.first();
                } 
                if (NIL == seen_a_parent) {
                    dictionary_utilities.dictionary_pushnew(v_graph, root, v_term, UNPROVIDED, UNPROVIDED);
                }
                dictionary.dictionary_remove(seen_map, v_term);
            }
        } finally {
            sbhl_marking_vars.$resourcing_sbhl_marking_spaces_p$.rebind(_prev_bind_3, thread);
            sbhl_marking_vars.$resourced_sbhl_marking_spaces$.rebind(_prev_bind_2, thread);
            sbhl_marking_vars.$resourced_sbhl_marking_space_limit$.rebind(_prev_bind_0, thread);
        }
        return NIL;
    }

    public static SubLObject retrieve_cluster(final SubLObject graph_id) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        thread.resetMultipleValues();
        final SubLObject v_graph = lookup_cluster(graph_id);
        final SubLObject root = thread.secondMultipleValue();
        thread.resetMultipleValues();
        return build_cluster_from_dag(root, v_graph, UNPROVIDED);
    }

    public static SubLObject cluster_terms_ontologically(final SubLObject terms) {
        final SubLObject graph_id = create_cluster();
        SubLObject cdolist_list_var = terms;
        SubLObject v_term = NIL;
        v_term = cdolist_list_var.first();
        while (NIL != cdolist_list_var) {
            add_term_to_cluster(graph_id, v_term, UNPROVIDED, UNPROVIDED);
            cdolist_list_var = cdolist_list_var.rest();
            v_term = cdolist_list_var.first();
        } 
        final SubLObject v_answer = retrieve_cluster(graph_id);
        free_cluster(graph_id);
        return v_answer;
    }

    public static SubLObject find_term_in_cluster(final SubLObject v_term, final SubLObject cluster) {
        if (NIL == cluster) {
            return NIL;
        }
        if (cluster.first().eql(v_term)) {
            return T;
        }
        SubLObject cdolist_list_var = cluster.rest();
        SubLObject child = NIL;
        child = cdolist_list_var.first();
        while (NIL != cdolist_list_var) {
            if (NIL != find_term_in_cluster(v_term, child)) {
                return T;
            }
            cdolist_list_var = cdolist_list_var.rest();
            child = cdolist_list_var.first();
        } 
        return NIL;
    }

    public static SubLObject clean_cluster(final SubLObject cluster) {
        final SubLObject root_term = cluster.first();
        SubLObject children = cluster.rest();
        final SubLObject child_count = length(children);
        SubLObject i = ZERO_INTEGER;
        SubLObject j = ZERO_INTEGER;
        if (ONE_INTEGER.numE(child_count)) {
            return children.first();
        }
        if (ZERO_INTEGER.numE(child_count)) {
            return cluster;
        }
        while (i.numL(child_count)) {
            if (NIL != nth(i, children)) {
                for (j = ZERO_INTEGER; j.numL(i); j = add(j, ONE_INTEGER)) {
                    if (NIL != nth(j, children)) {
                        final SubLObject child1 = nth(i, children);
                        final SubLObject child2 = nth(j, children);
                        final SubLObject head1 = child1.first();
                        final SubLObject head2 = child2.first();
                        final SubLObject rest1 = child1.rest();
                        final SubLObject rest2 = child2.rest();
                        if (head1.eql(head2)) {
                            set_nth(i, children, clean_cluster(cons(head1, append(rest1, rest2))));
                            set_nth(j, children, NIL);
                        }
                    }
                }
            }
            i = add(i, ONE_INTEGER);
        } 
        for (i = ZERO_INTEGER; i.numL(child_count); i = add(i, ONE_INTEGER)) {
            if (NIL != nth(i, children)) {
                for (j = ZERO_INTEGER; j.numL(child_count); j = add(j, ONE_INTEGER)) {
                    if ((NIL != nth(j, children)) && (!i.numE(j))) {
                        final SubLObject child1 = nth(i, children);
                        final SubLObject child2 = nth(j, children);
                        final SubLObject head1 = child1.first();
                        if (NIL != find_term_in_cluster(head1, child2)) {
                            set_nth(i, children, NIL);
                        }
                    }
                }
            }
        }
        children = remove_if(NULL, children, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
        if (ONE_INTEGER.numE(length(children))) {
            return children.first();
        }
        return cons(root_term, children);
    }

    public static SubLObject build_cluster_from_dag(final SubLObject root_term, final SubLObject link_map, SubLObject seen_map) {
        if (seen_map == UNPROVIDED) {
            seen_map = dictionary.new_dictionary(UNPROVIDED, UNPROVIDED);
        }
        SubLObject result = NIL;
        final SubLObject terms = dictionary.dictionary_lookup(link_map, root_term, UNPROVIDED);
        if (NIL == dictionary.dictionary_lookup(seen_map, root_term, UNPROVIDED)) {
            dictionary.dictionary_enter(seen_map, root_term, T);
            SubLObject cdolist_list_var = terms;
            SubLObject v_term = NIL;
            v_term = cdolist_list_var.first();
            while (NIL != cdolist_list_var) {
                result = cons(build_cluster_from_dag(v_term, link_map, seen_map), result);
                cdolist_list_var = cdolist_list_var.rest();
                v_term = cdolist_list_var.first();
            } 
            dictionary.dictionary_remove(seen_map, root_term);
        }
        return clean_cluster(cons(root_term, result));
    }

    public static SubLObject get_terms_from_url(final SubLObject url, SubLObject mt) {
        if (mt == UNPROVIDED) {
            mt = $$InferencePSC;
        }
        final SubLObject text_object = remove_html_tags(web_utilities.get_html_source_from_url(url, UNPROVIDED, UNPROVIDED), UNPROVIDED);
        final SubLObject dirty_text = (text_object.isString()) ? text_object : second(text_object);
        final SubLObject clean_text = (NIL == dirty_text) ? $str64$ : string_utilities.string_substitute($$$_, $str65$_nbsp_, dirty_text, UNPROVIDED);
        return get_terms_in_string(clean_text, mt, UNPROVIDED, UNPROVIDED);
    }

    public static SubLObject get_terms_in_string(final SubLObject string, SubLObject mt, SubLObject generation_mt, SubLObject filter) {
        if (mt == UNPROVIDED) {
            mt = $$InferencePSC;
        }
        if (generation_mt == UNPROVIDED) {
            generation_mt = $$EnglishParaphraseMt;
        }
        if (filter == UNPROVIDED) {
            filter = concept_filter.get_default_concept_filter_specification();
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject v_document = document.new_document(string, UNPROVIDED, UNPROVIDED);
        final SubLObject iterator = concept_tagger.tag_concepts(v_document, list($FILTER, filter));
        final SubLObject total = document.document_sentence_length(v_document);
        SubLObject current = ZERO_INTEGER;
        SubLObject results = NIL;
        while (NIL == iteration.iteration_done(iterator)) {
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
                current = add(ONE_INTEGER, current);
                SubLObject cdolist_list_var = document.sentence_yield_exhaustive(sentence);
                SubLObject word = NIL;
                word = cdolist_list_var.first();
                while (NIL != cdolist_list_var) {
                    SubLObject cdolist_list_var_$3 = document.word_cycls(word);
                    SubLObject v_term = NIL;
                    v_term = cdolist_list_var_$3.first();
                    while (NIL != cdolist_list_var_$3) {
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
                            pph_vars.$pph_terse_modeP$.bind(T, thread);
                            pph_vars.$pph_use_bulleted_listsP$.bind(T, thread);
                            pph_vars.$pph_replace_bulleted_list_tagsP$.bind(NIL, thread);
                            pph_vars.$paraphrase_precision$.bind(NIL, thread);
                            pph_vars.$pph_terse_mt_scopeP$.bind(T, thread);
                            pph_vars.$pph_maximize_linksP$.bind(T, thread);
                            pph_vars.$pph_link_arg0P$.bind(T, thread);
                            pph_vars.$pph_use_smart_variable_replacementP$.bind(T, thread);
                            pph_vars.$pph_demerit_cutoff$.bind(number_utilities.positive_infinity(), thread);
                            pph_vars.$pph_use_title_capitalizationP$.bind(NIL, thread);
                            pph_vars.$pph_use_indexical_datesP$.bind(NIL, thread);
                            pph_vars.$pph_addressee$.bind($UNKNOWN, thread);
                            pph_vars.$pph_speaker$.bind($UNKNOWN, thread);
                            pph_vars.$pph_quantify_varsP$.bind(T, thread);
                            final SubLObject java_phrase = pph_main.generate_phrase_for_java(v_term, $DEFAULT, $NONE, generation_mt, mt, UNPROVIDED);
                            final SubLObject result = list(java_phrase, narts_high.nart_substitute(v_term));
                            if (NIL != task_processor.task_process_pool_p(task_processor.get_task_process_pool_for_process(current_process()))) {
                                task_processor.post_task_info_processor_partial_results(list(result, sentence_text, current, total));
                            } else {
                                results = cons(list(result, sentence_text, current, total), results);
                            }
                        } finally {
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
            } finally {
                mt_relevance_macros.$relevant_mts$.rebind(_prev_bind_3, thread);
                mt_relevance_macros.$relevant_mt_function$.rebind(_prev_bind_2, thread);
                mt_relevance_macros.$mt$.rebind(_prev_bind_0, thread);
            }
        } 
        return reverse(results);
    }

    public static SubLObject list_itemL(final SubLObject list_item1, final SubLObject list_item2) {
        final SubLObject pph_item1 = second(list_item1.first().first()).first();
        final SubLObject pph_item2 = second(list_item2.first().first()).first();
        final SubLObject term1 = czer_main.canonicalize_term(second(pph_item1), UNPROVIDED);
        final SubLObject term2 = czer_main.canonicalize_term(second(pph_item2), UNPROVIDED);
        return kb_utilities.term_L(term1, term2, UNPROVIDED, UNPROVIDED, UNPROVIDED);
    }

    public static SubLObject super_javalists_more_or_less_equal(SubLObject super_jl1, SubLObject super_jl2) {
        super_jl1 = Sort.sort(copy_list(super_jl1), symbol_function($sym72$LIST_ITEM_), UNPROVIDED);
        super_jl2 = Sort.sort(copy_list(super_jl2), symbol_function($sym72$LIST_ITEM_), UNPROVIDED);
        SubLObject failureP = NIL;
        SubLObject super_list1_item = NIL;
        SubLObject super_list1_item_$7 = NIL;
        SubLObject super_list2_item = NIL;
        SubLObject super_list2_item_$8 = NIL;
        super_list1_item = super_jl1;
        super_list1_item_$7 = super_list1_item.first();
        super_list2_item = super_jl2;
        super_list2_item_$8 = super_list2_item.first();
        while ((NIL != super_list2_item) || (NIL != super_list1_item)) {
            final SubLObject jl1 = super_list1_item_$7.first().first();
            final SubLObject jl2 = super_list2_item_$8.first().first();
            if (NIL == failureP) {
                failureP = makeBoolean(NIL == javalists_more_or_less_equal(jl1, jl2));
            }
            super_list1_item = super_list1_item.rest();
            super_list1_item_$7 = super_list1_item.first();
            super_list2_item = super_list2_item.rest();
            super_list2_item_$8 = super_list2_item.first();
        } 
        return makeBoolean(NIL == failureP);
    }

    public static SubLObject javalists_more_or_less_equal(final SubLObject jl1, final SubLObject jl2) {
        final SubLObject display_string1 = jl1.first();
        final SubLObject display_string2 = jl2.first();
        final SubLObject pph_list1 = second(jl1);
        final SubLObject pph_list2 = second(jl2);
        SubLObject failureP = NIL;
        if (NIL == failureP) {
            SubLObject pph_item1 = NIL;
            SubLObject pph_item1_$9 = NIL;
            SubLObject pph_item2 = NIL;
            SubLObject pph_item2_$10 = NIL;
            pph_item1 = pph_list1;
            pph_item1_$9 = pph_item1.first();
            pph_item2 = pph_list2;
            pph_item2_$10 = pph_item2.first();
            while ((NIL == failureP) && ((NIL != pph_item2) || (NIL != pph_item1))) {
                if ((NIL == failureP) && ((((((!pph_item1_$9.first().equal(pph_item2_$10.first())) || (NIL == czer_utilities.equals_elP(czer_main.canonicalize_term(second(pph_item1_$9), UNPROVIDED), czer_main.canonicalize_term(second(pph_item2_$10), UNPROVIDED), UNPROVIDED, UNPROVIDED, UNPROVIDED))) || (!third(pph_item1_$9).equal(third(pph_item2_$10)))) || (!fifth(pph_item1_$9).equal(fifth(pph_item2_$10)))) || (!sixth(pph_item1_$9).equal(sixth(pph_item2_$10)))) || (!display_string1.equal(display_string2)))) {
                    Errors.warn($str73$failed_on__S____S__, pph_item1_$9, pph_item2_$10);
                    failureP = T;
                }
                pph_item1 = pph_item1.rest();
                pph_item1_$9 = pph_item1.first();
                pph_item2 = pph_item2.rest();
                pph_item2_$10 = pph_item2.first();
            } 
        }
        return makeBoolean(NIL == failureP);
    }

    public static SubLObject declare_document_search_file() {
        declareFunction(me, "search_engine_p", "SEARCH-ENGINE-P", 1, 0, false);
        declareFunction(me, "register_search_engine", "REGISTER-SEARCH-ENGINE", 1, 0, false);
        declareFunction(me, "register_search_engine_int", "REGISTER-SEARCH-ENGINE-INT", 7, 0, false);
        declareFunction(me, "deregister_search_engine", "DEREGISTER-SEARCH-ENGINE", 1, 0, false);
        declareFunction(me, "get_available_search_engines", "GET-AVAILABLE-SEARCH-ENGINES", 0, 0, false);
        declareFunction(me, "search_engine_availableP", "SEARCH-ENGINE-AVAILABLE?", 1, 0, false);
        declareFunction(me, "get_default_search_engine", "GET-DEFAULT-SEARCH-ENGINE", 0, 0, false);
        declareFunction(me, "set_default_search_engine", "SET-DEFAULT-SEARCH-ENGINE", 1, 0, false);
        declareFunction(me, "get_search_engine_description", "GET-SEARCH-ENGINE-DESCRIPTION", 1, 0, false);
        declareFunction(me, "generic_query_string_for_cycl_sentence", "GENERIC-QUERY-STRING-FOR-CYCL-SENTENCE", 1, 0, false);
        declareFunction(me, "query_string_for_cycl_sentence", "QUERY-STRING-FOR-CYCL-SENTENCE", 2, 0, false);
        declareFunction(me, "search_documents_for_cycl_sentence", "SEARCH-DOCUMENTS-FOR-CYCL-SENTENCE", 1, 3, false);
        declareFunction(me, "search_documents_for_nl_sentence", "SEARCH-DOCUMENTS-FOR-NL-SENTENCE", 1, 3, false);
        declareFunction(me, "search_documents", "SEARCH-DOCUMENTS", 1, 3, false);
        declareFunction(me, "search_count", "SEARCH-COUNT", 1, 1, false);
        declareFunction(me, "search_url_availableP", "SEARCH-URL-AVAILABLE?", 0, 1, false);
        declareFunction(me, "search_url", "SEARCH-URL", 1, 3, false);
        declareFunction(me, "search_url_for_cycl_sentence", "SEARCH-URL-FOR-CYCL-SENTENCE", 1, 3, false);
        declareFunction(me, "google_search_wrapper", "GOOGLE-SEARCH-WRAPPER", 3, 0, false);
        declareFunction(me, "google_query_string_for_cycl_sentence", "GOOGLE-QUERY-STRING-FOR-CYCL-SENTENCE", 1, 0, false);
        declareFunction(me, "lucene_search_wrapper", "LUCENE-SEARCH-WRAPPER", 3, 0, false);
        declareFunction(me, "lucene_count_wrapper", "LUCENE-COUNT-WRAPPER", 1, 0, false);
        declareFunction(me, "cyc_semantic_search_string", "CYC-SEMANTIC-SEARCH-STRING", 1, 0, false);
        declareFunction(me, "cyc_semantic_index_server_aliveP", "CYC-SEMANTIC-INDEX-SERVER-ALIVE?", 0, 0, false);
        declareFunction(me, "cyc_semantic_query_string_for_cycl_sentence", "CYC-SEMANTIC-QUERY-STRING-FOR-CYCL-SENTENCE", 1, 0, false);
        declareFunction(me, "replace_span_tags", "REPLACE-SPAN-TAGS", 1, 0, false);
        declareFunction(me, "cyc_semantic_search_wrapper", "CYC-SEMANTIC-SEARCH-WRAPPER", 3, 0, false);
        declareFunction(me, "cyc_semantic_count_wrapper", "CYC-SEMANTIC-COUNT-WRAPPER", 1, 0, false);
        declareFunction(me, "min_cluster_parents_for_collection", "MIN-CLUSTER-PARENTS-FOR-COLLECTION", 1, 2, false);
        declareFunction(me, "min_cluster_parents_for_individual", "MIN-CLUSTER-PARENTS-FOR-INDIVIDUAL", 1, 2, false);
        declareMacro(me, "with_cluster_taxonomy", "WITH-CLUSTER-TAXONOMY");
        declareFunction(me, "create_cluster", "CREATE-CLUSTER", 0, 0, false);
        declareFunction(me, "lookup_cluster", "LOOKUP-CLUSTER", 1, 0, false);
        declareFunction(me, "free_cluster", "FREE-CLUSTER", 1, 0, false);
        declareFunction(me, "release_cluster_resources_for_client", "RELEASE-CLUSTER-RESOURCES-FOR-CLIENT", 1, 0, false);
        declareFunction(me, "add_term_to_cluster", "ADD-TERM-TO-CLUSTER", 2, 2, false);
        declareFunction(me, "retrieve_cluster", "RETRIEVE-CLUSTER", 1, 0, false);
        declareFunction(me, "cluster_terms_ontologically", "CLUSTER-TERMS-ONTOLOGICALLY", 1, 0, false);
        declareFunction(me, "find_term_in_cluster", "FIND-TERM-IN-CLUSTER", 2, 0, false);
        declareFunction(me, "clean_cluster", "CLEAN-CLUSTER", 1, 0, false);
        declareFunction(me, "build_cluster_from_dag", "BUILD-CLUSTER-FROM-DAG", 2, 1, false);
        declareFunction(me, "get_terms_from_url", "GET-TERMS-FROM-URL", 1, 1, false);
        declareFunction(me, "get_terms_in_string", "GET-TERMS-IN-STRING", 1, 3, false);
        declareFunction(me, "list_itemL", "LIST-ITEM<", 2, 0, false);
        declareFunction(me, "super_javalists_more_or_less_equal", "SUPER-JAVALISTS-MORE-OR-LESS-EQUAL", 2, 0, false);
        declareFunction(me, "javalists_more_or_less_equal", "JAVALISTS-MORE-OR-LESS-EQUAL", 2, 0, false);
        return NIL;
    }

    public static SubLObject init_document_search_file() {
        deflexical("*SEARCH-ENGINES*", $list0);
        deflexical("*SEARCH-ENGINE-SPECS*", $list1);
        defparameter("*DEFAULT-SEARCH-ENGINE*", NIL);
        deflexical("*CLUSTER-ID-ISG*", SubLTrampolineFile.maybeDefault($cluster_id_isg$, $cluster_id_isg$, () -> integer_sequence_generator.new_integer_sequence_generator(UNPROVIDED, UNPROVIDED, UNPROVIDED)));
        deflexical("*CLUSTER-MAP*", SubLTrampolineFile.maybeDefault($cluster_map$, $cluster_map$, () -> dictionary.new_dictionary(UNPROVIDED, UNPROVIDED)));
        deflexical("*CLUSTER-LOCK*", SubLTrampolineFile.maybeDefault($cluster_lock$, $cluster_lock$, () -> make_lock($$$Ontological_Cluster_Map_Lock)));
        return NIL;
    }

    public static SubLObject setup_document_search_file() {
        register_external_symbol(SEARCH_ENGINE_P);
        register_external_symbol(REGISTER_SEARCH_ENGINE);
        register_external_symbol(DEREGISTER_SEARCH_ENGINE);
        register_external_symbol(GET_AVAILABLE_SEARCH_ENGINES);
        register_external_symbol($sym8$SEARCH_ENGINE_AVAILABLE_);
        register_external_symbol(GET_DEFAULT_SEARCH_ENGINE);
        register_external_symbol(SET_DEFAULT_SEARCH_ENGINE);
        register_external_symbol(GET_SEARCH_ENGINE_DESCRIPTION);
        register_external_symbol(SEARCH_DOCUMENTS_FOR_CYCL_SENTENCE);
        register_external_symbol(SEARCH_DOCUMENTS_FOR_NL_SENTENCE);
        register_external_symbol(SEARCH_COUNT);
        register_external_symbol($sym17$SEARCH_URL_AVAILABLE_);
        register_external_symbol(SEARCH_URL);
        register_external_symbol(SEARCH_URL_FOR_CYCL_SENTENCE);
        declare_defglobal($cluster_id_isg$);
        declare_defglobal($cluster_map$);
        declare_defglobal($cluster_lock$);
        register_external_symbol(CREATE_CLUSTER);
        register_external_symbol(FREE_CLUSTER);
        register_external_symbol(ADD_TERM_TO_CLUSTER);
        register_external_symbol(RETRIEVE_CLUSTER);
        register_external_symbol(CLUSTER_TERMS_ONTOLOGICALLY);
        register_external_symbol(GET_TERMS_FROM_URL);
        register_external_symbol(GET_TERMS_IN_STRING);
        define_test_case_table_int(GET_TERMS_IN_STRING, list(new SubLObject[]{ $TEST, SUPER_JAVALISTS_MORE_OR_LESS_EQUAL, $OWNER, NIL, $CLASSES, NIL, $KB, $FULL, $WORKING_, NIL }), $list81);
        return NIL;
    }

    private static SubLObject _constant_81_initializer() {
        return list(list(list(makeString("George Washington chopped down an apple tree"), reader_make_constant_shell(makeString("InferencePSC")), reader_make_constant_shell(makeString("EnglishParaphraseMt")), NIL), list(list(list(list(makeString("George Washington"), list(list(makeString("George"), reader_make_constant_shell(makeString("GeorgeWashington")), NIL, makeString("<a href=\"cg?CB-CF&14961\" target=\"_self\">"), NIL, ZERO_INTEGER), list(makeString(" "), reader_make_constant_shell(makeString("GeorgeWashington")), NIL, NIL, NIL, SIX_INTEGER), list(makeString("Washington"), reader_make_constant_shell(makeString("GeorgeWashington")), NIL, NIL, makeString("</a>"), SEVEN_INTEGER))), reader_make_constant_shell(makeString("GeorgeWashington"))), makeString("George Washington chopped down an apple tree"), ONE_INTEGER, ONE_INTEGER), list(list(list(makeString("George Washington University"), list(list(makeString("George"), reader_make_constant_shell(makeString("GeorgeWashingtonUniversity")), NIL, makeString("<a href=\"cg?CB-CF&67586\" target=\"_self\">"), NIL, ZERO_INTEGER), list(makeString(" "), reader_make_constant_shell(makeString("GeorgeWashingtonUniversity")), NIL, NIL, NIL, SIX_INTEGER), list(makeString("Washington"), reader_make_constant_shell(makeString("GeorgeWashingtonUniversity")), NIL, NIL, NIL, SEVEN_INTEGER), list(makeString(" "), reader_make_constant_shell(makeString("GeorgeWashingtonUniversity")), NIL, NIL, NIL, SEVENTEEN_INTEGER), list(makeString("University"), reader_make_constant_shell(makeString("GeorgeWashingtonUniversity")), NIL, NIL, makeString("</a>"), EIGHTEEN_INTEGER))), reader_make_constant_shell(makeString("GeorgeWashingtonUniversity"))), makeString("George Washington chopped down an apple tree"), ONE_INTEGER, ONE_INTEGER), list(list(list(makeString("chopping"), list(list(makeString("chopping"), reader_make_constant_shell(makeString("ChoppingSomething")), NIL, makeString("<a href=\"cg?CB-CF&7109\" target=\"_self\">"), makeString("</a>"), ZERO_INTEGER))), reader_make_constant_shell(makeString("ChoppingSomething"))), makeString("George Washington chopped down an apple tree"), ONE_INTEGER, ONE_INTEGER), list(list(list(makeString("apple tree"), list(list(makeString("apple"), reader_make_constant_shell(makeString("AppleTree")), NIL, makeString("<a href=\"cg?CB-CF&607\" target=\"_self\">"), NIL, ZERO_INTEGER), list(makeString(" "), reader_make_constant_shell(makeString("AppleTree")), NIL, NIL, NIL, FIVE_INTEGER), list(makeString("tree"), reader_make_constant_shell(makeString("AppleTree")), NIL, NIL, makeString("</a>"), SIX_INTEGER))), reader_make_constant_shell(makeString("AppleTree"))), makeString("George Washington chopped down an apple tree"), ONE_INTEGER, ONE_INTEGER))), list(list(makeString("Osama bin Laden has been sighted in Afghanistan, and Mohammed Atta was seen in New York")), list(new SubLObject[]{ list(list(list(makeString("Osama bin Laden"), list(list(makeString("Osama"), reader_make_constant_shell(makeString("OsamaBinLaden")), NIL, makeString("<a href=\"cg?CB-CF&44138\" target=\"_self\">"), NIL, ZERO_INTEGER), list(makeString(" "), reader_make_constant_shell(makeString("OsamaBinLaden")), NIL, NIL, NIL, FIVE_INTEGER), list(makeString("bin"), reader_make_constant_shell(makeString("OsamaBinLaden")), NIL, NIL, NIL, SIX_INTEGER), list(makeString(" "), reader_make_constant_shell(makeString("OsamaBinLaden")), NIL, NIL, NIL, NINE_INTEGER), list(makeString("Laden"), reader_make_constant_shell(makeString("OsamaBinLaden")), NIL, NIL, makeString("</a>"), TEN_INTEGER))), reader_make_constant_shell(makeString("OsamaBinLaden"))), makeString("Osama bin Laden has been sighted in Afghanistan, and Mohammed Atta was seen in New York"), ONE_INTEGER, ONE_INTEGER), list(list(list(makeString("belonging"), list(list(makeString("belonging"), reader_make_constant_shell(makeString("possesses")), NIL, makeString("<a href=\"cg?CB-CF&17858\" target=\"_self\">"), makeString("</a>"), ZERO_INTEGER))), reader_make_constant_shell(makeString("possesses"))), makeString("Osama bin Laden has been sighted in Afghanistan, and Mohammed Atta was seen in New York"), ONE_INTEGER, ONE_INTEGER), list(list(list(makeString("sighting"), list(list(makeString("sighting"), reader_make_constant_shell(makeString("Sighting")), NIL, makeString("<a href=\"cg?CB-CF&123172\" target=\"_self\">"), makeString("</a>"), ZERO_INTEGER))), reader_make_constant_shell(makeString("Sighting"))), makeString("Osama bin Laden has been sighted in Afghanistan, and Mohammed Atta was seen in New York"), ONE_INTEGER, ONE_INTEGER), list(list(list(makeString("Afghanistan"), list(list(makeString("Afghanistan"), reader_make_constant_shell(makeString("Afghanistan")), NIL, makeString("<a href=\"cg?CB-CF&2761\" target=\"_self\">"), makeString("</a>"), ZERO_INTEGER))), reader_make_constant_shell(makeString("Afghanistan"))), makeString("Osama bin Laden has been sighted in Afghanistan, and Mohammed Atta was seen in New York"), ONE_INTEGER, ONE_INTEGER), list(list(list(makeString("Mohamed Atta"), list(list(makeString("Mohamed"), reader_make_constant_shell(makeString("MohamedAtta")), NIL, makeString("<a href=\"cg?CB-CF&94907\" target=\"_self\">"), NIL, ZERO_INTEGER), list(makeString(" "), reader_make_constant_shell(makeString("MohamedAtta")), NIL, NIL, NIL, SEVEN_INTEGER), list(makeString("Atta"), reader_make_constant_shell(makeString("MohamedAtta")), NIL, NIL, makeString("</a>"), EIGHT_INTEGER))), reader_make_constant_shell(makeString("MohamedAtta"))), makeString("Osama bin Laden has been sighted in Afghanistan, and Mohammed Atta was seen in New York"), ONE_INTEGER, ONE_INTEGER), list(list(list(makeString("visit"), list(list(makeString("visit"), reader_make_constant_shell(makeString("VisitingSomeone")), NIL, makeString("<a href=\"cg?CB-CF&5536\" target=\"_self\">"), makeString("</a>"), ZERO_INTEGER))), reader_make_constant_shell(makeString("VisitingSomeone"))), makeString("Osama bin Laden has been sighted in Afghanistan, and Mohammed Atta was seen in New York"), ONE_INTEGER, ONE_INTEGER), list(list(list(makeString("sight"), list(list(makeString("sight"), reader_make_constant_shell(makeString("sees")), NIL, makeString("<a href=\"cg?CB-CF&5242\" target=\"_self\">"), makeString("</a>"), ZERO_INTEGER))), reader_make_constant_shell(makeString("sees"))), makeString("Osama bin Laden has been sighted in Afghanistan, and Mohammed Atta was seen in New York"), ONE_INTEGER, ONE_INTEGER), list(list(list(makeString("meeting event"), list(list(makeString("meeting"), reader_make_constant_shell(makeString("MeetingSomeone")), NIL, makeString("<a href=\"cg?CB-CF&21509\" target=\"_self\">"), NIL, ZERO_INTEGER), list(makeString(" "), reader_make_constant_shell(makeString("MeetingSomeone")), NIL, NIL, NIL, SEVEN_INTEGER), list(makeString("event"), reader_make_constant_shell(makeString("MeetingSomeone")), NIL, NIL, makeString("</a>"), EIGHT_INTEGER))), reader_make_constant_shell(makeString("MeetingSomeone"))), makeString("Osama bin Laden has been sighted in Afghanistan, and Mohammed Atta was seen in New York"), ONE_INTEGER, ONE_INTEGER), list(list(list(makeString("visual perception"), list(list(makeString("visual"), reader_make_constant_shell(makeString("VisualPerception")), NIL, makeString("<a href=\"cg?CB-CF&5427\" target=\"_self\">"), NIL, ZERO_INTEGER), list(makeString(" "), reader_make_constant_shell(makeString("VisualPerception")), NIL, NIL, NIL, SIX_INTEGER), list(makeString("perception"), reader_make_constant_shell(makeString("VisualPerception")), NIL, NIL, makeString("</a>"), SEVEN_INTEGER))), reader_make_constant_shell(makeString("VisualPerception"))), makeString("Osama bin Laden has been sighted in Afghanistan, and Mohammed Atta was seen in New York"), ONE_INTEGER, ONE_INTEGER), list(list(list(makeString("New York"), list(list(makeString("New"), reader_make_constant_shell(makeString("NewYork-State")), NIL, makeString("<a href=\"cg?CB-CF&503\" target=\"_self\">"), NIL, ZERO_INTEGER), list(makeString(" "), reader_make_constant_shell(makeString("NewYork-State")), NIL, NIL, NIL, THREE_INTEGER), list(makeString("York"), reader_make_constant_shell(makeString("NewYork-State")), NIL, NIL, makeString("</a>"), FOUR_INTEGER))), reader_make_constant_shell(makeString("NewYork-State"))), makeString("Osama bin Laden has been sighted in Afghanistan, and Mohammed Atta was seen in New York"), ONE_INTEGER, ONE_INTEGER), list(list(list(makeString("New York City, NY"), list(list(makeString("New"), reader_make_constant_shell(makeString("CityOfNewYorkNY")), NIL, makeString("<a href=\"cg?CB-CF&2405\" target=\"_self\">"), NIL, ZERO_INTEGER), list(makeString(" "), reader_make_constant_shell(makeString("CityOfNewYorkNY")), NIL, NIL, NIL, THREE_INTEGER), list(makeString("York"), reader_make_constant_shell(makeString("CityOfNewYorkNY")), NIL, NIL, NIL, FOUR_INTEGER), list(makeString(" "), reader_make_constant_shell(makeString("CityOfNewYorkNY")), NIL, NIL, NIL, EIGHT_INTEGER), list(makeString("City,"), reader_make_constant_shell(makeString("CityOfNewYorkNY")), NIL, NIL, NIL, NINE_INTEGER), list(makeString(" "), reader_make_constant_shell(makeString("CityOfNewYorkNY")), NIL, NIL, NIL, FOURTEEN_INTEGER), list(makeString("NY"), reader_make_constant_shell(makeString("CityOfNewYorkNY")), NIL, NIL, makeString("</a>"), FIFTEEN_INTEGER))), reader_make_constant_shell(makeString("CityOfNewYorkNY"))), makeString("Osama bin Laden has been sighted in Afghanistan, and Mohammed Atta was seen in New York"), ONE_INTEGER, ONE_INTEGER), list(list(list(makeString("New York"), list(list(makeString("New"), reader_make_constant_shell(makeString("NewYork-Colony")), NIL, makeString("<a href=\"cg?CB-CF&166826\" target=\"_self\">"), NIL, ZERO_INTEGER), list(makeString(" "), reader_make_constant_shell(makeString("NewYork-Colony")), NIL, NIL, NIL, THREE_INTEGER), list(makeString("York"), reader_make_constant_shell(makeString("NewYork-Colony")), NIL, NIL, makeString("</a>"), FOUR_INTEGER))), reader_make_constant_shell(makeString("NewYork-Colony"))), makeString("Osama bin Laden has been sighted in Afghanistan, and Mohammed Atta was seen in New York"), ONE_INTEGER, ONE_INTEGER) })), list(list(makeString("George Washington likes to eat apples")), list(list(list(list(makeString("George Washington"), list(list(makeString("George"), reader_make_constant_shell(makeString("GeorgeWashington")), NIL, makeString("<a href=\"cg?CB-CF&14961\" target=\"_self\">"), NIL, ZERO_INTEGER), list(makeString(" "), reader_make_constant_shell(makeString("GeorgeWashington")), NIL, NIL, NIL, SIX_INTEGER), list(makeString("Washington"), reader_make_constant_shell(makeString("GeorgeWashington")), NIL, NIL, makeString("</a>"), SEVEN_INTEGER))), reader_make_constant_shell(makeString("GeorgeWashington"))), makeString("George Washington likes to eat apples"), ONE_INTEGER, ONE_INTEGER), list(list(list(makeString("George Washington University"), list(list(makeString("George"), reader_make_constant_shell(makeString("GeorgeWashingtonUniversity")), NIL, makeString("<a href=\"cg?CB-CF&67586\" target=\"_self\">"), NIL, ZERO_INTEGER), list(makeString(" "), reader_make_constant_shell(makeString("GeorgeWashingtonUniversity")), NIL, NIL, NIL, SIX_INTEGER), list(makeString("Washington"), reader_make_constant_shell(makeString("GeorgeWashingtonUniversity")), NIL, NIL, NIL, SEVEN_INTEGER), list(makeString(" "), reader_make_constant_shell(makeString("GeorgeWashingtonUniversity")), NIL, NIL, NIL, SEVENTEEN_INTEGER), list(makeString("University"), reader_make_constant_shell(makeString("GeorgeWashingtonUniversity")), NIL, NIL, makeString("</a>"), EIGHTEEN_INTEGER))), reader_make_constant_shell(makeString("GeorgeWashingtonUniversity"))), makeString("George Washington likes to eat apples"), ONE_INTEGER, ONE_INTEGER), list(list(list(makeString("liking"), list(list(makeString("liking"), list(reader_make_constant_shell(makeString("ExperiencingEmotionFn")), reader_make_constant_shell(makeString("Like"))), NIL, makeString("<a href=\"cg?CB-CF&-119393\" target=\"_self\">"), makeString("</a>"), ZERO_INTEGER))), list(reader_make_constant_shell(makeString("ExperiencingEmotionFn")), reader_make_constant_shell(makeString("Like")))), makeString("George Washington likes to eat apples"), ONE_INTEGER, ONE_INTEGER), list(list(list(makeString("liking"), list(list(makeString("liking"), reader_make_constant_shell(makeString("likes-Generic")), NIL, makeString("<a href=\"cg?CB-CF&83363\" target=\"_self\">"), makeString("</a>"), ZERO_INTEGER))), reader_make_constant_shell(makeString("likes-Generic"))), makeString("George Washington likes to eat apples"), ONE_INTEGER, ONE_INTEGER), list(list(list(makeString("eating"), list(list(makeString("eating"), reader_make_constant_shell(makeString("EatingEvent")), NIL, makeString("<a href=\"cg?CB-CF&293\" target=\"_self\">"), makeString("</a>"), ZERO_INTEGER))), reader_make_constant_shell(makeString("EatingEvent"))), makeString("George Washington likes to eat apples"), ONE_INTEGER, ONE_INTEGER), list(list(list(makeString("apple"), list(list(makeString("apple"), list(reader_make_constant_shell(makeString("FruitFn")), reader_make_constant_shell(makeString("AppleTree"))), NIL, makeString("<a href=\"cg?CB-CF&-3414\" target=\"_self\">"), makeString("</a>"), ZERO_INTEGER))), list(reader_make_constant_shell(makeString("FruitFn")), reader_make_constant_shell(makeString("AppleTree")))), makeString("George Washington likes to eat apples"), ONE_INTEGER, ONE_INTEGER))));
    }

    @Override
    public void declareFunctions() {
        declare_document_search_file();
    }

    @Override
    public void initializeVariables() {
        init_document_search_file();
    }

    @Override
    public void runTopLevelForms() {
        setup_document_search_file();
    }

    
}

/**
 * Total time: 462 ms
 */
