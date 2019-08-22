package com.cyc.cycjava.cycl.rdf;


import static com.cyc.cycjava.cycl.cyc_testing.generic_testing.define_test_case_table_int;
import static com.cyc.cycjava.cycl.id_index.*;
import static com.cyc.cycjava.cycl.subl_macro_promotions.$catch_error_message_target$;
import static com.cyc.cycjava.cycl.utilities_macros.*;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Characters.*;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow.*;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Equality.equal;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Numbers.*;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.PrintLow.format;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Sequences.*;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Symbols.symbol_function;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Threads.$is_thread_performing_cleanupP$;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Time.get_universal_time;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Values.*;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.*;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.cdestructuring_bind.destructuring_bind_must_consp;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.conses_high.second;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.print_high.princ;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.reader.bq_cons;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.streams_high.*;
import static com.cyc.tool.subl.util.SubLFiles.*;

import com.cyc.cycjava.cycl.file_utilities;
import com.cyc.cycjava.cycl.format_nil;
import com.cyc.cycjava.cycl.integer_sequence_generator;
import com.cyc.cycjava.cycl.iteration;
import com.cyc.cycjava.cycl.list_utilities;
import com.cyc.cycjava.cycl.memoization_state;
import com.cyc.cycjava.cycl.misc_utilities;
import com.cyc.cycjava.cycl.number_utilities;
import com.cyc.cycjava.cycl.set;
import com.cyc.cycjava.cycl.string_utilities;
import com.cyc.cycjava.cycl.subl_promotions;
import com.cyc.cycjava.cycl.web_utilities;
import com.cyc.cycjava.cycl.xml_parsing_utilities;
import com.cyc.cycjava.cycl.xml_utilities;
import com.cyc.cycjava.cycl.xml_vars;
import com.cyc.cycjava.cycl.owl.owl_cycl_to_xml;
import com.cyc.cycjava.cycl.owl.owl_to_cycl;
import com.cyc.cycjava.cycl.owl.owl_uris_and_prefixes;
import com.cyc.cycjava.cycl.owl.owl_utilities;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Errors;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Filesys;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Sort;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Strings;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.SubLThread;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLList;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObject;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLProcess;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLString;
import com.cyc.tool.subl.jrtl.nativeCode.type.number.SubLInteger;
import com.cyc.tool.subl.jrtl.nativeCode.type.symbol.SubLSymbol;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.compatibility;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.stream_macros;
import com.cyc.tool.subl.util.SubLFile;
import com.cyc.tool.subl.util.SubLTrampolineFile;
import com.cyc.tool.subl.util.SubLTranslatedFile;


public final class rdf_parser extends SubLTranslatedFile {
    public static final SubLFile me = new rdf_parser();

    public static final String myName = "com.cyc.cycjava.cycl.rdf.rdf_parser";

    public static final String myFingerPrint = "b240a92bfa79ec66d578cbd47b93fc6881664e866657f8b386c5df71f6716ff4";

    // defparameter
    // Definitions
    private static final SubLSymbol $rdf_parser_current_lang$ = makeSymbol("*RDF-PARSER-CURRENT-LANG*");

    // defparameter
    // SET-P of node IDs introduced in the current document.
    private static final SubLSymbol $rdf_parser_node_ids$ = makeSymbol("*RDF-PARSER-NODE-IDS*");

    // defparameter
    private static final SubLSymbol $rdf_parser_blank_node_id_isg$ = makeSymbol("*RDF-PARSER-BLANK-NODE-ID-ISG*");

    // defparameter
    private static final SubLSymbol $rdf_parser_blank_node_index$ = makeSymbol("*RDF-PARSER-BLANK-NODE-INDEX*");

    // defparameter
    // Counter to convert rdf:li into rdf:_1, etc.
    private static final SubLSymbol $rdf_parser_next_list_item_number$ = makeSymbol("*RDF-PARSER-NEXT-LIST-ITEM-NUMBER*");

    // defparameter
    private static final SubLSymbol $rdf_parser_recursedP$ = makeSymbol("*RDF-PARSER-RECURSED?*");

    // deflexical
    private static final SubLSymbol $resolve_rdfXxml_uri_internal_caching_state$ = makeSymbol("*RESOLVE-RDF/XML-URI-INTERNAL-CACHING-STATE*");



    // deflexical
    private static final SubLSymbol $rdfXxml_core_syntax_uris$ = makeSymbol("*RDF/XML-CORE-SYNTAX-URIS*");

    // deflexical
    private static final SubLSymbol $rdfXxml_old_term_uris$ = makeSymbol("*RDF/XML-OLD-TERM-URIS*");

    // deflexical
    public static final SubLSymbol $rdfXxml_parser_test_directory$ = makeSymbol("*RDF/XML-PARSER-TEST-DIRECTORY*");

    // deflexical
    public static final SubLSymbol $rdfXxml_parser_test_base_uri$ = makeSymbol("*RDF/XML-PARSER-TEST-BASE-URI*");

    // Internal Constants
    public static final SubLString $str0$file__ = makeString("file:/");

    public static final SubLSymbol $sym1$FILE_EXISTS_ = makeSymbol("FILE-EXISTS?");



    public static final SubLString $str3$Unable_to_open__S = makeString("Unable to open ~S");

    private static final SubLString $$$Ontology = makeString("Ontology");

    private static final SubLString $$$type = makeString("type");

    private static final SubLSymbol URL_P = makeSymbol("URL-P");



    private static final SubLSymbol RDF_GRAPH_P = makeSymbol("RDF-GRAPH-P");

    private static final SubLString $$$base = makeString("base");

    private static final SubLString $$$lang = makeString("lang");

    private static final SubLInteger $int$10000 = makeInteger(10000);

    private static final SubLString $str12$Parsing_RDF_XML_stream___ = makeString("Parsing RDF/XML stream...");



    private static final SubLString $str14$_ = makeString(".");

    private static final SubLSymbol VALID_NODE_ELEMENT_RDF_URI_P = makeSymbol("VALID-NODE-ELEMENT-RDF-URI-P");

    private static final SubLString $$$li = makeString("li");

    private static final SubLString $str17$rdf_li_is_not_allowed_as_as_an_at = makeString("rdf:li is not allowed as as an attribute");

    private static final SubLString $$$Description = makeString("Description");

    private static final SubLString $str19$_ = makeString("_");

    private static final SubLString $$$resource = makeString("resource");

    private static final SubLString $str21$This_is_not_legal_RDF__specifying = makeString("This is not legal RDF; specifying an rdf:parseType of \"Literal\" and an rdf:resource attribute at the same time is an error.");

    private static final SubLString $$$Resource = makeString("Resource");

    private static final SubLString $$$parseType = makeString("parseType");

    private static final SubLString $$$Collection = makeString("Collection");

    private static final SubLString $str25$parseTypeOtherPropertyElt_not_yet = makeString("parseTypeOtherPropertyElt not yet implemented (7.2.20).");

    private static final SubLString $$$ID = makeString("ID");

    private static final SubLString $str27$Can_t_handle_property_element___A = makeString("Can't handle property element: ~A");

    private static final SubLSymbol VALID_PROPERTY_ATTRIBUTE_RDF_URI_P = makeSymbol("VALID-PROPERTY-ATTRIBUTE-RDF-URI-P");

    private static final SubLString $str29$rdf_parseType__Literal__is_forbid = makeString("rdf:parseType=\"Literal\" is forbidden here since we\'re creating an additional resource node.");

    private static final SubLString $$$datatype = makeString("datatype");

    private static final SubLString $str31$ = makeString("");

    private static final SubLString $$$Statement = makeString("Statement");

    private static final SubLString $$$subject = makeString("subject");

    private static final SubLString $$$predicate = makeString("predicate");

    private static final SubLString $$$object = makeString("object");

    private static final SubLString $$$nil = makeString("nil");

    private static final SubLString $$$rest = makeString("rest");

    private static final SubLString $$$first = makeString("first");

    private static final SubLString $$$Literal = makeString("Literal");

    private static final SubLList $list40 = cons(makeSymbol("ATTRIBUTE"), makeSymbol("VALUE"));

    private static final SubLString $$$xml = makeString("xml");

    private static final SubLString $str42$_S_has_been_removed_from_the_RDF_ = makeString("~S has been removed from the RDF specification.");

    private static final SubLSymbol $sym43$RESOLVE_RDF_XML_URI_INTERNAL = makeSymbol("RESOLVE-RDF/XML-URI-INTERNAL");

    private static final SubLString $$$xmlns = makeString("xmlns");

    private static final SubLSymbol $sym45$_RESOLVE_RDF_XML_URI_INTERNAL_CACHING_STATE_ = makeSymbol("*RESOLVE-RDF/XML-URI-INTERNAL-CACHING-STATE*");

    public static final SubLSymbol EXPAND_RDF_XML_URI_NAMESPACE_PREFIX = makeSymbol("EXPAND-RDF-XML-URI-NAMESPACE-PREFIX");

    public static final SubLString $str47$xmlns_ = makeString("xmlns:");

    public static final SubLSymbol $expand_rdf_xml_uri_namespace_prefix_caching_state$ = makeSymbol("*EXPAND-RDF-XML-URI-NAMESPACE-PREFIX-CACHING-STATE*");



    public static final SubLString $$$RDF = makeString("RDF");

    public static final SubLString $$$about = makeString("about");

    public static final SubLString $$$nodeID = makeString("nodeID");

    public static final SubLString $str53$Unable_to_initialize__A__ = makeString("Unable to initialize ~A~%");

    public static final SubLSymbol $sym54$RDF_URI_MATCHES_ = makeSymbol("RDF-URI-MATCHES?");

    public static final SubLString $$$aboutEach = makeString("aboutEach");

    public static final SubLString $$$aboutEachPrefix = makeString("aboutEachPrefix");

    public static final SubLString $$$bagID = makeString("bagID");

    public static final SubLString $$$XMLLiteral = makeString("XMLLiteral");

    public static final SubLString $str59$Cannot_have_rdf_nodeID_and_rdf_ID = makeString("Cannot have rdf:nodeID and rdf:ID.");

    public static final SubLString $str60$Cannot_have_rdf_about_and_rdf_ID_ = makeString("Cannot have rdf:about and rdf:ID.");

    public static final SubLString $str61$Cannot_have_rdf_nodeID_and_rdf_ab = makeString("Cannot have rdf:nodeID and rdf:about");

    public static final SubLString $str62$Cannot_have_rdf_nodeID_and_rdf_re = makeString("Cannot have rdf:nodeID and rdf:resource");

    public static final SubLSymbol VALID_XML_NAMESPACES_NAME_P = makeSymbol("VALID-XML-NAMESPACES-NAME-P");

    public static final SubLString $str64$Name_clash__Graph_already_has_nod = makeString("Name clash: Graph already has node with ID ~S");

    public static final SubLSymbol VALID_XML_NAME_P = makeSymbol("VALID-XML-NAME-P");

    public static final SubLString $str66$_ = makeString("#");

    public static final SubLString $str67$Couldn_t_resolve_local_name__S = makeString("Couldn't resolve local name ~S");

    public static final SubLString $str68$Output_must_be_to_either_an_RDF_G = makeString("Output must be to either an RDF Graph or an output stream, not ~S");

    public static final SubLSymbol $sym69$TEST_RDF_XML_PARSER = makeSymbol("TEST-RDF/XML-PARSER");







    private static final SubLList $list73 = list(makeSymbol("RDF-TEST-CASE-TABLES"));







    private static final SubLList $list77 = list(list(NIL, ZERO_INTEGER));

    private static final SubLSymbol TEST_RDF_TO_N_TRIPLES = makeSymbol("TEST-RDF-TO-N-TRIPLES");

    private static final SubLList $list79 = list(list(NIL, T));

    private static final SubLString $str80$_home_baxter_owl_rdf_approved_tes = makeString("/home/baxter/owl/rdf-approved-tests/");

    private static final SubLString $str81$http___www_w3_org_2000_10_rdf_tes = makeString("http://www.w3.org/2000/10/rdf-tests/rdfcore/");

    private static final SubLString $$$Running_ = makeString("Running ");

    private static final SubLString $str83$_RDF_parsing_tests___ = makeString(" RDF parsing tests...");

    private static final SubLString $$$cdolist = makeString("cdolist");



    private static final SubLString $$$error = makeString("error");

    private static final SubLString $str87$__Failed___S__ = makeString("~&Failed: ~S~%");

    private static final SubLString $str88$__Summary___D_Parsed___D_Rightly_ = makeString("~&Summary: ~D Parsed. ~D Rightly errored. ~D Failed~%");



    private static final SubLString $str90$_Directory__ = makeString(" Directory: ");

    private static final SubLString $str91$_rdf = makeString(".rdf");

    private static final SubLString $str92$_nt = makeString(".nt");

    private static final SubLString $str93$Graph_mismatch__Extra___S___Missi = makeString("Graph mismatch. Extra: ~S~% Missing ~S~%");

    public static SubLObject parse_rdfXxml_file(final SubLObject filename, SubLObject base_uri) {
        if (base_uri == UNPROVIDED) {
            base_uri = cconcatenate($str0$file__, filename);
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLTrampolineFile.enforceType(filename, $sym1$FILE_EXISTS_);
        SubLObject v_graph = NIL;
        SubLObject stream = NIL;
        try {
            final SubLObject _prev_bind_0 = stream_macros.$stream_requires_locking$.currentBinding(thread);
            try {
                stream_macros.$stream_requires_locking$.bind(NIL, thread);
                stream = compatibility.open_text(filename, $INPUT);
            } finally {
                stream_macros.$stream_requires_locking$.rebind(_prev_bind_0, thread);
            }
            if (!stream.isStream()) {
                Errors.error($str3$Unable_to_open__S, filename);
            }
            final SubLObject xml_stream = stream;
            v_graph = parse_rdfXxml_stream(xml_stream, base_uri);
            rdf_graph.rdf_graph_note_file_location(v_graph, filename);
        } finally {
            final SubLObject _prev_bind_2 = $is_thread_performing_cleanupP$.currentBinding(thread);
            try {
                $is_thread_performing_cleanupP$.bind(T, thread);
                final SubLObject _values = getValuesAsVector();
                if (stream.isStream()) {
                    close(stream, UNPROVIDED);
                }
                restoreValuesFromVector(_values);
            } finally {
                $is_thread_performing_cleanupP$.rebind(_prev_bind_2, thread);
            }
        }
        return v_graph;
    }

    public static SubLObject parse_rdfXxml_file_with_detail(final SubLObject filename) {
        assert NIL != file_utilities.file_existsP(filename) : "file_utilities.file_existsP(filename) " + "CommonSymbols.NIL != file_utilities.file_existsP(filename) " + filename;
        final SubLObject v_graph = parse_rdfXxml_file(filename, UNPROVIDED);
        final SubLObject ontology_type_triple = rdf_graph.rdf_graph_find_object_triples(v_graph, rdf_graph.rdf_graph_get_uri(v_graph, owl_utilities.owl_expanded_name($$$Ontology), UNPROVIDED, UNPROVIDED), rdf_graph.rdf_graph_get_uri(v_graph, rdf_utilities.rdf_expanded_name($$$type), UNPROVIDED, UNPROVIDED)).first();
        final SubLObject uri_node = (NIL != ontology_type_triple) ? rdf_triple.rdf_triple_subject(ontology_type_triple) : NIL;
        if (NIL != rdf_uri.rdf_uri_p(uri_node)) {
            rdf_graph.rdf_graph_note_topic(v_graph, uri_node);
        }
        return v_graph;
    }

    public static SubLObject parse_rdfXxml_from_url(final SubLObject url, SubLObject base_uri) {
        if (base_uri == UNPROVIDED) {
            base_uri = url;
        }
        assert NIL != web_utilities.url_p(url) : "web_utilities.url_p(url) " + "CommonSymbols.NIL != web_utilities.url_p(url) " + url;
        final SubLObject tmp_file = rdf_utilities.download_rdf_url(url, UNPROVIDED);
        final SubLObject v_graph = (NIL != tmp_file) ? parse_rdfXxml_file(tmp_file, base_uri) : NIL;
        if (NIL != v_graph) {
            rdf_graph.rdf_graph_note_topic(v_graph, rdf_uri.get_rdf_uri(url, UNPROVIDED, UNPROVIDED));
        }
        return v_graph;
    }

    public static SubLObject parse_rdfXxml_stream(final SubLObject xml_stream, final SubLObject base_uri) {
        return parse_rdfXxml_stream_to_graph(xml_stream, base_uri, rdf_graph.new_rdf_graph());
    }

    public static SubLObject rdfXxml_to_n_triples(final SubLObject input_filename, final SubLObject output_filename, SubLObject base_uri) {
        if (base_uri == UNPROVIDED) {
            base_uri = cconcatenate($str0$file__, input_filename);
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLTrampolineFile.enforceType(input_filename, $sym1$FILE_EXISTS_);
        SubLObject nt_file = NIL;
        SubLObject stream = NIL;
        try {
            final SubLObject _prev_bind_0 = stream_macros.$stream_requires_locking$.currentBinding(thread);
            try {
                stream_macros.$stream_requires_locking$.bind(NIL, thread);
                stream = compatibility.open_text(input_filename, $INPUT);
            } finally {
                stream_macros.$stream_requires_locking$.rebind(_prev_bind_0, thread);
            }
            if (!stream.isStream()) {
                Errors.error($str3$Unable_to_open__S, input_filename);
            }
            final SubLObject xml_stream = stream;
            nt_file = parse_rdfXxml_stream_to_file(xml_stream, base_uri, output_filename);
        } finally {
            final SubLObject _prev_bind_2 = $is_thread_performing_cleanupP$.currentBinding(thread);
            try {
                $is_thread_performing_cleanupP$.bind(T, thread);
                final SubLObject _values = getValuesAsVector();
                if (stream.isStream()) {
                    close(stream, UNPROVIDED);
                }
                restoreValuesFromVector(_values);
            } finally {
                $is_thread_performing_cleanupP$.rebind(_prev_bind_2, thread);
            }
        }
        return nt_file;
    }

    public static SubLObject parse_rdfXxml_stream_to_file(final SubLObject xml_stream, final SubLObject base_uri, final SubLObject output_file) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject stream = NIL;
        try {
            final SubLObject _prev_bind_0 = stream_macros.$stream_requires_locking$.currentBinding(thread);
            try {
                stream_macros.$stream_requires_locking$.bind(NIL, thread);
                stream = compatibility.open_text(output_file, $OUTPUT);
            } finally {
                stream_macros.$stream_requires_locking$.rebind(_prev_bind_0, thread);
            }
            if (!stream.isStream()) {
                Errors.error($str3$Unable_to_open__S, output_file);
            }
            final SubLObject output_stream = stream;
            final SubLObject _prev_bind_2 = $rdf_parser_blank_node_index$.currentBinding(thread);
            final SubLObject _prev_bind_3 = $rdf_parser_blank_node_id_isg$.currentBinding(thread);
            try {
                $rdf_parser_blank_node_index$.bind(new_id_index(UNPROVIDED, UNPROVIDED), thread);
                $rdf_parser_blank_node_id_isg$.bind(integer_sequence_generator.new_integer_sequence_generator(UNPROVIDED, UNPROVIDED, UNPROVIDED), thread);
                parse_rdfXxml_stream_internal(xml_stream, base_uri, output_stream);
            } finally {
                $rdf_parser_blank_node_id_isg$.rebind(_prev_bind_3, thread);
                $rdf_parser_blank_node_index$.rebind(_prev_bind_2, thread);
            }
        } finally {
            final SubLObject _prev_bind_4 = $is_thread_performing_cleanupP$.currentBinding(thread);
            try {
                $is_thread_performing_cleanupP$.bind(T, thread);
                final SubLObject _values = getValuesAsVector();
                if (stream.isStream()) {
                    close(stream, UNPROVIDED);
                }
                restoreValuesFromVector(_values);
            } finally {
                $is_thread_performing_cleanupP$.rebind(_prev_bind_4, thread);
            }
        }
        return output_file;
    }

    public static SubLObject parse_rdfXxml_stream_to_graph(final SubLObject xml_stream, final SubLObject base_uri, final SubLObject v_graph) {
        assert NIL != rdf_graph.rdf_graph_p(v_graph) : "rdf_graph.rdf_graph_p(v_graph) " + "CommonSymbols.NIL != rdf_graph.rdf_graph_p(v_graph) " + v_graph;
        return parse_rdfXxml_stream_internal(xml_stream, base_uri, v_graph);
    }

    public static SubLObject parse_rdfXxml_stream_internal(final SubLObject xml_stream, final SubLObject base_uri, final SubLObject output_destination) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject token_iterator = xml_parsing_utilities.new_xml_token_iterator(xml_stream, T, T, NIL);
        final SubLObject top_attributes = list(bq_cons(owl_to_cycl.xml_name($$$base), base_uri));
        if (NIL == iteration.iteration_done(token_iterator)) {
            xml_parsing_utilities.advance_xml_token_iterator_to_next_element(token_iterator);
            final SubLObject first_token = iteration.xml_token_iterator_peek(token_iterator);
            final SubLObject parsed_first_token = xml_parsing_utilities.parse_xml_token(first_token);
            final SubLObject attributes = parsed_first_token.rest();
            final SubLObject local_lang = list_utilities.alist_lookup_without_values(attributes, owl_to_cycl.xml_name($$$lang), symbol_function(EQUAL), UNPROVIDED);
            final SubLObject _prev_bind_0 = $rdf_parser_current_lang$.currentBinding(thread);
            final SubLObject _prev_bind_2 = $rdf_parser_node_ids$.currentBinding(thread);
            try {
                $rdf_parser_current_lang$.bind(NIL != local_lang ? local_lang : $rdf_parser_current_lang$.getDynamicValue(thread), thread);
                $rdf_parser_node_ids$.bind(set.new_set(symbol_function(EQUAL), UNPROVIDED), thread);
                if (NIL != rdf_graph.rdf_graph_p(output_destination)) {
                    rdf_graph.rdf_graph_note_namespace_prefixes(output_destination, attributes);
                }
                final SubLObject _prev_bind_0_$1 = $silent_progressP$.currentBinding(thread);
                final SubLObject _prev_bind_1_$2 = $last_percent_progress_index$.currentBinding(thread);
                final SubLObject _prev_bind_3 = $last_percent_progress_prediction$.currentBinding(thread);
                final SubLObject _prev_bind_4 = $within_noting_percent_progress$.currentBinding(thread);
                final SubLObject _prev_bind_5 = $percent_progress_start_time$.currentBinding(thread);
                try {
                    $silent_progressP$.bind(numL(file_length(xml_stream), $int$10000), thread);
                    $last_percent_progress_index$.bind(ZERO_INTEGER, thread);
                    $last_percent_progress_prediction$.bind(NIL, thread);
                    $within_noting_percent_progress$.bind(T, thread);
                    $percent_progress_start_time$.bind(get_universal_time(), thread);
                    try {
                        noting_percent_progress_preamble($str12$Parsing_RDF_XML_stream___);
                        if (NIL != rdf_token_p(first_token)) {
                            iteration.iteration_next(token_iterator);
                            final SubLObject attribute_lists = list(attributes, top_attributes);
                            SubLObject doneP = NIL;
                            final SubLObject report_interval = $int$1000;
                            final SubLObject full_report_frequency = FIVE_INTEGER;
                            SubLObject report_count = ZERO_INTEGER;
                            while (NIL == doneP) {
                                thread.resetMultipleValues();
                                final SubLObject doneP_$3 = parse_next_rdfXxml_element(token_iterator, output_destination, attribute_lists, report_interval, full_report_frequency, report_count);
                                final SubLObject report_count_$4 = thread.secondMultipleValue();
                                thread.resetMultipleValues();
                                doneP = doneP_$3;
                                report_count = report_count_$4;
                            } 
                        } else {
                            final SubLObject sexpr = xml_parsing_utilities.xml_token_iterator_to_sexpr(token_iterator, UNPROVIDED);
                            parse_rdfXxml_node_element(sexpr, output_destination, list(attributes, top_attributes));
                        }
                    } finally {
                        final SubLObject _prev_bind_0_$2 = $is_thread_performing_cleanupP$.currentBinding(thread);
                        try {
                            $is_thread_performing_cleanupP$.bind(T, thread);
                            final SubLObject _values = getValuesAsVector();
                            noting_percent_progress_postamble();
                            restoreValuesFromVector(_values);
                        } finally {
                            $is_thread_performing_cleanupP$.rebind(_prev_bind_0_$2, thread);
                        }
                    }
                } finally {
                    $percent_progress_start_time$.rebind(_prev_bind_5, thread);
                    $within_noting_percent_progress$.rebind(_prev_bind_4, thread);
                    $last_percent_progress_prediction$.rebind(_prev_bind_3, thread);
                    $last_percent_progress_index$.rebind(_prev_bind_1_$2, thread);
                    $silent_progressP$.rebind(_prev_bind_0_$1, thread);
                }
            } finally {
                $rdf_parser_node_ids$.rebind(_prev_bind_2, thread);
                $rdf_parser_current_lang$.rebind(_prev_bind_0, thread);
            }
        }
        return output_destination;
    }

    public static SubLObject parse_next_rdfXxml_element(final SubLObject token_iterator, final SubLObject graph_or_stream, final SubLObject attribute_lists, final SubLObject report_interval, final SubLObject full_report_frequency, SubLObject report_count) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject doneP = iteration.iteration_done(token_iterator);
        if (NIL == doneP) {
            xml_parsing_utilities.advance_xml_token_iterator_to_next_element(token_iterator);
            if ((NIL != rdf_token_p(iteration.xml_token_iterator_peek(token_iterator))) && (NIL != xml_parsing_utilities.xml_closing_tag_p(iteration.xml_token_iterator_peek(token_iterator)))) {
                doneP = T;
            } else {
                final SubLObject dtr = xml_parsing_utilities.xml_token_iterator_to_sexpr(token_iterator, UNPROVIDED);
                parse_rdfXxml_node_element(dtr, graph_or_stream, attribute_lists);
            }
            thread.resetMultipleValues();
            final SubLObject done = xml_parsing_utilities.xml_token_iterator_progress(token_iterator);
            final SubLObject total = thread.secondMultipleValue();
            thread.resetMultipleValues();
            note_percent_progress(done, total);
            final SubLObject target = multiply(report_interval, number_utilities.f_1X(report_count));
            if (set.set_size($rdf_parser_node_ids$.getDynamicValue(thread)).numGE(target)) {
                report_count = add(report_count, ONE_INTEGER);
                if (mod(report_count, full_report_frequency).isZero()) {
                    princ(target, UNPROVIDED);
                } else {
                    princ($str14$_, UNPROVIDED);
                }
                force_output(UNPROVIDED);
            }
        }
        return values(doneP, report_count);
    }

    public static SubLObject clear_rdf_parser_caches() {
        clear_resolve_rdfXxml_uri_internal();
        clear_expand_rdf_xml_uri_namespace_prefix();
        return NIL;
    }

    public static SubLObject parse_rdfXxml_node_element(final SubLObject sexpr, final SubLObject graph_or_stream, final SubLObject attribute_lists) {
        final SubLObject sexpr_type = xml_parsing_utilities.xml_sexpr_type(sexpr);
        final SubLObject subject = resolve_rdfXxml_subject(sexpr, graph_or_stream, attribute_lists);
        parse_rdfXxml_node_element_internal(subject, graph_or_stream, sexpr_type, xml_parsing_utilities.xml_sexpr_attributes(sexpr), xml_parsing_utilities.xml_sexpr_daughters(sexpr, UNPROVIDED), attribute_lists);
        return subject;
    }

    public static SubLObject parse_rdfXxml_node_element_internal(final SubLObject subject, final SubLObject graph_or_stream, final SubLObject sexpr_type, final SubLObject local_attributes, final SubLObject daughters, final SubLObject attribute_lists) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject local_lang = list_utilities.alist_lookup(local_attributes, owl_to_cycl.xml_name($$$lang), symbol_function(EQUAL), UNPROVIDED);
        final SubLObject uri = resolve_rdfXxml_uri(sexpr_type, attribute_lists, UNPROVIDED);
        SubLTrampolineFile.enforceType(uri, VALID_NODE_ELEMENT_RDF_URI_P);
        if (NIL != list_utilities.alist_lookup(local_attributes, rdf_utilities.rdf_name($$$li), symbol_function(EQUAL), UNPROVIDED)) {
            Errors.error($str17$rdf_li_is_not_allowed_as_as_an_at);
        }
        if (NIL == rdf_description_typeP(uri)) {
            note_parsed_triple(graph_or_stream, subject, rdf_type_uri(graph_or_stream), uri);
        }
        if ((NIL != rdf_graph.rdf_graph_p(graph_or_stream)) && (NIL == $rdf_parser_recursedP$.getDynamicValue(thread))) {
            rdf_graph.rdf_graph_note_focal_node(graph_or_stream, rdf_graph.canonicalize_rdf_triple_argument(subject, graph_or_stream));
        }
        final SubLObject _prev_bind_0 = $rdf_parser_current_lang$.currentBinding(thread);
        final SubLObject _prev_bind_2 = $rdf_parser_next_list_item_number$.currentBinding(thread);
        final SubLObject _prev_bind_3 = $rdf_parser_recursedP$.currentBinding(thread);
        try {
            $rdf_parser_current_lang$.bind(NIL != local_lang ? local_lang : $rdf_parser_current_lang$.getDynamicValue(thread), thread);
            $rdf_parser_next_list_item_number$.bind(ONE_INTEGER, thread);
            $rdf_parser_recursedP$.bind(T, thread);
            parse_rdfXxml_property_attributes(subject, graph_or_stream, local_attributes, attribute_lists);
            SubLObject cdolist_list_var = daughters;
            SubLObject dtr = NIL;
            dtr = cdolist_list_var.first();
            while (NIL != cdolist_list_var) {
                parse_rdfXxml_property_element(subject, dtr, graph_or_stream, cons(local_attributes, attribute_lists));
                cdolist_list_var = cdolist_list_var.rest();
                dtr = cdolist_list_var.first();
            } 
        } finally {
            $rdf_parser_recursedP$.rebind(_prev_bind_3, thread);
            $rdf_parser_next_list_item_number$.rebind(_prev_bind_2, thread);
            $rdf_parser_current_lang$.rebind(_prev_bind_0, thread);
        }
        return subject;
    }

    public static SubLObject rdf_description_typeP(final SubLObject uri) {
        return rdf_uri.rdf_namespace_uri_with_local_partP(uri, $$$Description);
    }

    public static SubLObject parse_rdfXxml_property_element(final SubLObject parent_node, final SubLObject property_sexpr, final SubLObject v_graph, final SubLObject attribute_lists) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject sexpr_type = xml_parsing_utilities.xml_sexpr_type(property_sexpr);
        final SubLObject local_lang = xml_parsing_utilities.xml_sexpr_attribute_value(property_sexpr, owl_to_cycl.xml_name($$$lang));
        final SubLObject _prev_bind_0 = $rdf_parser_current_lang$.currentBinding(thread);
        try {
            $rdf_parser_current_lang$.bind(NIL != local_lang ? local_lang : $rdf_parser_current_lang$.getDynamicValue(thread), thread);
            SubLObject uri = resolve_rdfXxml_uri(sexpr_type, cons(xml_parsing_utilities.xml_sexpr_attributes(property_sexpr), attribute_lists), UNPROVIDED);
            if (NIL != rdf_uri.rdf_namespace_uri_with_local_partP(uri, $$$li)) {
                uri = rdf_parser_get_rdf_namespace_uri(v_graph, cconcatenate($str19$_, format_nil.format_nil_d_no_copy($rdf_parser_next_list_item_number$.getDynamicValue(thread))));
                $rdf_parser_next_list_item_number$.setDynamicValue(add($rdf_parser_next_list_item_number$.getDynamicValue(thread), ONE_INTEGER), thread);
            }
            if ((NIL != xml_parsing_utilities.xml_sexpr_attribute_value(property_sexpr, rdf_utilities.rdf_name($$$resource))) && (NIL != literal_parse_type_sexprP(property_sexpr))) {
                Errors.error($str21$This_is_not_legal_RDF__specifying);
            }
            final SubLObject valid_property_elementP = valid_property_element_rdf_uri_p(uri);
            if ((NIL != valid_property_elementP) && (NIL != literal_parse_type_sexprP(property_sexpr))) {
                parse_rdfXxml_parse_type_literal_property_element(parent_node, property_sexpr, uri, v_graph, attribute_lists);
            } else
                if ((NIL != valid_property_elementP) && (NIL != list_utilities.empty_list_p(xml_parsing_utilities.xml_sexpr_daughters(property_sexpr, UNPROVIDED)))) {
                    parse_rdfXxml_empty_property_element(parent_node, property_sexpr, uri, v_graph, attribute_lists);
                } else
                    if ((NIL != valid_property_elementP) && $$$Resource.equal(xml_parsing_utilities.xml_sexpr_attribute_value(property_sexpr, rdf_utilities.rdf_name($$$parseType)))) {
                        parse_rdfXxml_resource_property_element(parent_node, property_sexpr, uri, v_graph, attribute_lists);
                    } else
                        if ((NIL != valid_property_elementP) && $$$Collection.equal(xml_parsing_utilities.xml_sexpr_attribute_value(property_sexpr, rdf_utilities.rdf_name($$$parseType)))) {
                            parse_rdfXxml_collection_property_element(parent_node, property_sexpr, uri, v_graph, attribute_lists);
                        } else
                            if ((NIL != valid_property_elementP) && (NIL != xml_parsing_utilities.xml_sexpr_attribute_value(property_sexpr, rdf_utilities.rdf_name($$$parseType)))) {
                                Errors.error($str25$parseTypeOtherPropertyElt_not_yet);
                            } else
                                if (((NIL != valid_property_elementP) && (NIL != list_utilities.singletonP(xml_parsing_utilities.xml_sexpr_daughters(property_sexpr, UNPROVIDED)))) && list_utilities.only_one(xml_parsing_utilities.xml_sexpr_daughters(property_sexpr, UNPROVIDED)).isList()) {
                                    final SubLObject v_object = parse_rdfXxml_node_element(list_utilities.only_one(xml_parsing_utilities.xml_sexpr_daughters(property_sexpr, UNPROVIDED)), v_graph, attribute_lists);
                                    final SubLObject id = xml_parsing_utilities.xml_sexpr_attribute_value(property_sexpr, rdf_utilities.rdf_name($$$ID));
                                    final SubLObject predicate_uri = (NIL != id) ? resolve_rdf_id(id, attribute_lists) : uri;
                                    note_parsed_triple(v_graph, parent_node, predicate_uri, v_object);
                                } else
                                    if (((NIL != valid_property_elementP) && (NIL != list_utilities.singletonP(xml_parsing_utilities.xml_sexpr_daughters(property_sexpr, UNPROVIDED)))) && list_utilities.only_one(xml_parsing_utilities.xml_sexpr_daughters(property_sexpr, UNPROVIDED)).isString()) {
                                        parse_rdfXxml_literal_property_element(parent_node, property_sexpr, uri, v_graph, attribute_lists);
                                    } else {
                                        SubLObject xml = NIL;
                                        SubLObject stream = NIL;
                                        try {
                                            stream = make_private_string_output_stream();
                                            final SubLObject _prev_bind_0_$6 = xml_vars.$xml_stream$.currentBinding(thread);
                                            try {
                                                xml_vars.$xml_stream$.bind(stream, thread);
                                                xml_utilities.xml_sexpr_output_as_xml(property_sexpr);
                                            } finally {
                                                xml_vars.$xml_stream$.rebind(_prev_bind_0_$6, thread);
                                            }
                                            xml = get_output_stream_string(stream);
                                        } finally {
                                            final SubLObject _prev_bind_0_$7 = $is_thread_performing_cleanupP$.currentBinding(thread);
                                            try {
                                                $is_thread_performing_cleanupP$.bind(T, thread);
                                                final SubLObject _values = getValuesAsVector();
                                                close(stream, UNPROVIDED);
                                                restoreValuesFromVector(_values);
                                            } finally {
                                                $is_thread_performing_cleanupP$.rebind(_prev_bind_0_$7, thread);
                                            }
                                        }
                                        Errors.error($str27$Can_t_handle_property_element___A, xml);
                                    }






        } finally {
            $rdf_parser_current_lang$.rebind(_prev_bind_0, thread);
        }
        return v_graph;
    }

    public static SubLObject parse_rdfXxml_parse_type_literal_property_element(final SubLObject parent_node, final SubLObject property_sexpr, final SubLObject uri, final SubLObject v_graph, final SubLObject attribute_lists) {
        if (NIL != find_if(VALID_PROPERTY_ATTRIBUTE_RDF_URI_P, resolve_rdfXxml_uris(list_utilities.alist_keys(xml_parsing_utilities.xml_sexpr_attributes(property_sexpr)), attribute_lists), UNPROVIDED, UNPROVIDED, UNPROVIDED)) {
            Errors.error($str29$rdf_parseType__Literal__is_forbid);
        }
        final SubLObject v_object = rdf_literal_value(v_graph, xml_parsing_utilities.xml_sexpr_daughters(property_sexpr, UNPROVIDED), attribute_lists);
        final SubLObject id = xml_parsing_utilities.xml_sexpr_attribute_value(property_sexpr, rdf_utilities.rdf_name($$$ID));
        final SubLObject predicate_uri = (NIL != id) ? resolve_rdf_id(id, attribute_lists) : uri;
        note_parsed_triple(v_graph, parent_node, predicate_uri, v_object);
        return NIL;
    }

    public static SubLObject parse_rdfXxml_literal_property_element(final SubLObject parent_node, final SubLObject property_sexpr, final SubLObject uri, final SubLObject v_graph, final SubLObject attribute_lists) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject object_lexical_form = list_utilities.only_one(xml_parsing_utilities.xml_sexpr_daughters(property_sexpr, UNPROVIDED));
        final SubLObject datatype_uri = xml_parsing_utilities.xml_sexpr_attribute_value(property_sexpr, rdf_utilities.rdf_name($$$datatype));
        final SubLObject datatype = (NIL != datatype_uri) ? datatype_uri : NIL;
        final SubLObject language = (NIL != datatype) ? NIL : $rdf_parser_current_lang$.getDynamicValue(thread);
        final SubLObject v_object = rdf_parser_get_literal(v_graph, object_lexical_form, language, datatype);
        final SubLObject id = xml_parsing_utilities.xml_sexpr_attribute_value(property_sexpr, rdf_utilities.rdf_name($$$ID));
        note_parsed_triple(v_graph, parent_node, uri, v_object);
        if (NIL != id) {
            reify_rdf_triple(v_graph, resolve_rdf_id(id, attribute_lists), parent_node, uri, v_object);
        }
        return NIL;
    }

    public static SubLObject parse_rdfXxml_resource_property_element(final SubLObject parent_node, final SubLObject property_sexpr, final SubLObject uri, final SubLObject v_graph, final SubLObject attribute_lists) {
        final SubLObject blank_node = rdf_parser_get_new_blank_node(v_graph);
        final SubLObject id = xml_parsing_utilities.xml_sexpr_attribute_value(property_sexpr, rdf_utilities.rdf_name($$$ID));
        final SubLObject predicate_uri = (NIL != id) ? resolve_rdf_id(id, attribute_lists) : uri;
        note_parsed_triple(v_graph, parent_node, predicate_uri, blank_node);
        if (NIL == xml_parsing_utilities.xml_sexpr_atomic_p(property_sexpr)) {
            parse_rdfXxml_node_element_internal(blank_node, v_graph, rdf_parser_get_rdf_namespace_uri(v_graph, $$$Description), xml_parsing_utilities.xml_sexpr_attributes(property_sexpr), xml_parsing_utilities.xml_sexpr_daughters(property_sexpr, UNPROVIDED), attribute_lists);
        }
        return NIL;
    }

    public static SubLObject parse_rdfXxml_empty_property_element(final SubLObject parent_node, final SubLObject property_sexpr, final SubLObject uri, final SubLObject v_graph, final SubLObject attribute_lists) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject attributes = xml_parsing_utilities.xml_sexpr_attributes(property_sexpr);
        SubLObject v_object = NIL;
        if (NIL == remove(rdf_utilities.rdf_name($$$ID), list_utilities.alist_keys(attributes), symbol_function(EQUAL), UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED)) {
            final SubLObject object_lexical_form = $str31$;
            v_object = rdf_parser_get_literal(v_graph, object_lexical_form, $rdf_parser_current_lang$.getDynamicValue(thread), UNPROVIDED);
        } else {
            v_object = resolve_rdfXxml_object_from_empty_property_element(property_sexpr, v_graph, attribute_lists);
            final SubLObject added_somethingP = parse_rdfXxml_property_attributes(v_object, v_graph, attributes, attribute_lists);
            if ((NIL != added_somethingP) && (NIL != literal_parse_type_sexprP(property_sexpr))) {
                Errors.error($str29$rdf_parseType__Literal__is_forbid);
            }
        }
        final SubLObject id = xml_parsing_utilities.xml_sexpr_attribute_value(property_sexpr, rdf_utilities.rdf_name($$$ID));
        note_parsed_triple(v_graph, parent_node, uri, v_object);
        if (NIL != id) {
            reify_rdf_triple(v_graph, resolve_rdf_id(id, attribute_lists), parent_node, uri, v_object);
        }
        return NIL;
    }

    public static SubLObject reify_rdf_triple(final SubLObject v_graph, final SubLObject id, final SubLObject subject, final SubLObject predicate, final SubLObject v_object) {
        note_parsed_triple(v_graph, id, rdf_parser_get_rdf_namespace_uri(v_graph, $$$type), rdf_parser_get_rdf_namespace_uri(v_graph, $$$Statement));
        note_parsed_triple(v_graph, id, rdf_parser_get_rdf_namespace_uri(v_graph, $$$subject), subject);
        note_parsed_triple(v_graph, id, rdf_parser_get_rdf_namespace_uri(v_graph, $$$predicate), predicate);
        note_parsed_triple(v_graph, id, rdf_parser_get_rdf_namespace_uri(v_graph, $$$object), v_object);
        return NIL;
    }

    public static SubLObject parse_rdfXxml_collection_property_element(final SubLObject parent_node, final SubLObject property_sexpr, final SubLObject uri, final SubLObject v_graph, final SubLObject attribute_lists) {
        final SubLObject id = xml_parsing_utilities.xml_sexpr_attribute_value(property_sexpr, rdf_utilities.rdf_name($$$ID));
        final SubLObject predicate_uri = (NIL != id) ? resolve_rdf_id(id, attribute_lists) : uri;
        if (NIL != xml_parsing_utilities.xml_sexpr_atomic_p(property_sexpr)) {
            note_parsed_triple(v_graph, parent_node, predicate_uri, rdf_parser_get_rdf_namespace_uri(v_graph, $$$nil));
        } else {
            SubLObject previous_blank_node = NIL;
            SubLObject cdolist_list_var = xml_parsing_utilities.xml_sexpr_daughters(property_sexpr, UNPROVIDED);
            SubLObject node_element_sexpr = NIL;
            node_element_sexpr = cdolist_list_var.first();
            while (NIL != cdolist_list_var) {
                final SubLObject blank_node = rdf_parser_get_new_blank_node(v_graph);
                if (NIL == previous_blank_node) {
                    note_parsed_triple(v_graph, parent_node, predicate_uri, blank_node);
                } else {
                    note_parsed_triple(v_graph, previous_blank_node, rdf_parser_get_rdf_namespace_uri(v_graph, $$$rest), blank_node);
                }
                note_parsed_triple(v_graph, blank_node, rdf_parser_get_rdf_namespace_uri(v_graph, $$$first), parse_rdfXxml_node_element(node_element_sexpr, v_graph, attribute_lists));
                previous_blank_node = blank_node;
                cdolist_list_var = cdolist_list_var.rest();
                node_element_sexpr = cdolist_list_var.first();
            } 
            note_parsed_triple(v_graph, previous_blank_node, rdf_parser_get_rdf_namespace_uri(v_graph, $$$rest), rdf_parser_get_rdf_namespace_uri(v_graph, $$$nil));
        }
        return NIL;
    }

    public static SubLObject literal_parse_type_sexprP(final SubLObject sexpr) {
        return equal($$$Literal, xml_parsing_utilities.xml_sexpr_attribute_value(sexpr, rdf_utilities.rdf_name($$$parseType)));
    }

    public static SubLObject parse_rdfXxml_property_attributes(final SubLObject subject, final SubLObject v_graph, final SubLObject attributes, final SubLObject attribute_lists) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject added_somethingP = NIL;
        SubLObject cdolist_list_var = attributes;
        SubLObject cons = NIL;
        cons = cdolist_list_var.first();
        while (NIL != cdolist_list_var) {
            SubLObject current;
            final SubLObject datum = current = cons;
            SubLObject attribute = NIL;
            SubLObject value = NIL;
            destructuring_bind_must_consp(current, datum, $list40);
            attribute = current.first();
            current = value = current.rest();
            if (NIL == string_utilities.starts_with(attribute, $$$xml)) {
                if (NIL != rdfXxml_old_term_rdf_uri_p(resolve_rdfXxml_uri(attribute, attribute_lists, UNPROVIDED))) {
                    Errors.error($str42$_S_has_been_removed_from_the_RDF_, attribute);
                } else
                    if (attribute.equal(rdf_utilities.rdf_name($$$type))) {
                        final SubLObject type_uri = resolve_rdfXxml_uri(value, attribute_lists, UNPROVIDED);
                        note_parsed_triple(v_graph, subject, rdf_type_uri(v_graph), type_uri);
                    } else
                        if (NIL != valid_property_attribute_rdf_uri_p(resolve_rdfXxml_uri(attribute, attribute_lists, UNPROVIDED))) {
                            final SubLObject predicate_uri = resolve_rdfXxml_uri(attribute, attribute_lists, UNPROVIDED);
                            final SubLObject v_object = rdf_parser_get_literal(v_graph, value, $rdf_parser_current_lang$.getDynamicValue(thread), UNPROVIDED);
                            note_parsed_triple(v_graph, subject, predicate_uri, v_object);
                            added_somethingP = T;
                        }


            }
            cdolist_list_var = cdolist_list_var.rest();
            cons = cdolist_list_var.first();
        } 
        return added_somethingP;
    }

    public static SubLObject rdf_literal_value(final SubLObject v_graph, final SubLObject xml_sexprs, final SubLObject attribute_lists) {
        final SubLObject xml_string = rdf_utilities.exclusive_canonical_xml_from_sexprs(xml_sexprs, attribute_lists);
        return rdf_parser_get_literal(v_graph, xml_string, NIL, rdf_xml_literal_uri());
    }

    public static SubLObject resolve_rdfXxml_uris(final SubLObject uris, final SubLObject attribute_lists) {
        SubLObject resolved = NIL;
        SubLObject cdolist_list_var = uris;
        SubLObject uri = NIL;
        uri = cdolist_list_var.first();
        while (NIL != cdolist_list_var) {
            resolved = cons(resolve_rdfXxml_uri(uri, attribute_lists, UNPROVIDED), resolved);
            cdolist_list_var = cdolist_list_var.rest();
            uri = cdolist_list_var.first();
        } 
        return nreverse(resolved);
    }

    public static SubLObject resolve_rdfXxml_uri(final SubLObject uri, final SubLObject attribute_lists, SubLObject use_baseP) {
        if (use_baseP == UNPROVIDED) {
            use_baseP = NIL;
        }
        if (NIL != rdf_uri.rdf_uri_p(uri)) {
            return uri;
        }
        SubLObject resolved = NIL;
        if (NIL == resolved) {
            SubLObject csome_list_var;
            SubLObject attributes;
            for (csome_list_var = attribute_lists, attributes = NIL, attributes = csome_list_var.first(); (NIL == resolved) && (NIL != csome_list_var); resolved = resolve_rdfXxml_uri_internal(uri, attributes, use_baseP) , csome_list_var = csome_list_var.rest() , attributes = csome_list_var.first()) {
            }
        }
        return NIL != resolved ? resolved : uri;
    }

    public static SubLObject clear_resolve_rdfXxml_uri_internal() {
        final SubLObject cs = $resolve_rdfXxml_uri_internal_caching_state$.getGlobalValue();
        if (NIL != cs) {
            memoization_state.caching_state_clear(cs);
        }
        return NIL;
    }

    public static SubLObject remove_resolve_rdfXxml_uri_internal(final SubLObject uri, final SubLObject rdf_attributes, SubLObject use_baseP) {
        if (use_baseP == UNPROVIDED) {
            use_baseP = NIL;
        }
        return memoization_state.caching_state_remove_function_results_with_args($resolve_rdfXxml_uri_internal_caching_state$.getGlobalValue(), list(uri, rdf_attributes, use_baseP), UNPROVIDED, UNPROVIDED);
    }

    public static SubLObject resolve_rdfXxml_uri_internal_internal(final SubLObject uri, final SubLObject rdf_attributes, final SubLObject use_baseP) {
        final SubLObject colon_pos = position(CHAR_colon, uri, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
        if ((NIL != subl_promotions.positive_integer_p(colon_pos)) && (NIL != list_utilities.lengthG(uri, number_utilities.f_1X(colon_pos), UNPROVIDED))) {
            final SubLObject prefix = string_utilities.substring(uri, ZERO_INTEGER, colon_pos);
            final SubLObject prefix_expansion = expand_rdf_xml_uri_namespace_prefix(prefix, rdf_attributes);
            final SubLObject relative_uri = string_utilities.substring(uri, number_utilities.f_1X(colon_pos), UNPROVIDED);
            return NIL != prefix_expansion ? rdf_uri.new_rdf_uri_from_two_parts(prefix_expansion, relative_uri) : NIL;
        }
        if (NIL == use_baseP) {
            final SubLObject default_namespace = list_utilities.alist_lookup(rdf_attributes, $$$xmlns, symbol_function(EQUAL), UNPROVIDED);
            return NIL != default_namespace ? rdf_uri.resolve_rdf_uri(default_namespace, uri) : NIL;
        }
        final SubLObject base_uri = possibly_remove_uri_fragment(list_utilities.alist_lookup(rdf_attributes, owl_to_cycl.xml_name($$$base), symbol_function(EQUAL), UNPROVIDED));
        if (NIL != base_uri) {
            return rdf_uri.resolve_rdf_uri(base_uri, uri);
        }
        return NIL;
    }

    public static SubLObject resolve_rdfXxml_uri_internal(final SubLObject uri, final SubLObject rdf_attributes, SubLObject use_baseP) {
        if (use_baseP == UNPROVIDED) {
            use_baseP = NIL;
        }
        SubLObject caching_state = $resolve_rdfXxml_uri_internal_caching_state$.getGlobalValue();
        if (NIL == caching_state) {
            caching_state = memoization_state.create_global_caching_state_for_name($sym43$RESOLVE_RDF_XML_URI_INTERNAL, $sym45$_RESOLVE_RDF_XML_URI_INTERNAL_CACHING_STATE_, NIL, EQUAL, THREE_INTEGER, ZERO_INTEGER);
        }
        final SubLObject sxhash = memoization_state.sxhash_calc_3(uri, rdf_attributes, use_baseP);
        final SubLObject collisions = memoization_state.caching_state_lookup(caching_state, sxhash, UNPROVIDED);
        if (!collisions.eql(memoization_state.$memoized_item_not_found$.getGlobalValue())) {
            SubLObject cdolist_list_var = collisions;
            SubLObject collision = NIL;
            collision = cdolist_list_var.first();
            while (NIL != cdolist_list_var) {
                SubLObject cached_args = collision.first();
                final SubLObject results2 = second(collision);
                if (uri.equal(cached_args.first())) {
                    cached_args = cached_args.rest();
                    if (rdf_attributes.equal(cached_args.first())) {
                        cached_args = cached_args.rest();
                        if (((NIL != cached_args) && (NIL == cached_args.rest())) && use_baseP.equal(cached_args.first())) {
                            return memoization_state.caching_results(results2);
                        }
                    }
                }
                cdolist_list_var = cdolist_list_var.rest();
                collision = cdolist_list_var.first();
            } 
        }
        final SubLObject results3 = arg2(resetMultipleValues(), multiple_value_list(resolve_rdfXxml_uri_internal_internal(uri, rdf_attributes, use_baseP)));
        memoization_state.caching_state_enter_multi_key_n(caching_state, sxhash, collisions, results3, list(uri, rdf_attributes, use_baseP));
        return memoization_state.caching_results(results3);
    }

    public static SubLObject possibly_remove_uri_fragment(final SubLObject uri) {
        SubLObject ans = uri;
        if (uri.isString()) {
            final SubLObject frag_start = position(CHAR_hash, uri, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
            if (NIL != frag_start) {
                ans = string_utilities.substring(uri, ZERO_INTEGER, frag_start);
            }
        }
        return ans;
    }

    public static SubLObject clear_expand_rdf_xml_uri_namespace_prefix() {
        final SubLObject cs = $expand_rdf_xml_uri_namespace_prefix_caching_state$.getGlobalValue();
        if (NIL != cs) {
            memoization_state.caching_state_clear(cs);
        }
        return NIL;
    }

    public static SubLObject remove_expand_rdf_xml_uri_namespace_prefix(final SubLObject prefix, final SubLObject rdf_attributes) {
        return memoization_state.caching_state_remove_function_results_with_args($expand_rdf_xml_uri_namespace_prefix_caching_state$.getGlobalValue(), list(prefix, rdf_attributes), UNPROVIDED, UNPROVIDED);
    }

    public static SubLObject expand_rdf_xml_uri_namespace_prefix_internal(final SubLObject prefix, final SubLObject rdf_attributes) {
        return list_utilities.alist_lookup(rdf_attributes, cconcatenate($str47$xmlns_, prefix), symbol_function(EQUAL), NIL);
    }

    public static SubLObject expand_rdf_xml_uri_namespace_prefix(final SubLObject prefix, final SubLObject rdf_attributes) {
        SubLObject caching_state = $expand_rdf_xml_uri_namespace_prefix_caching_state$.getGlobalValue();
        if (NIL == caching_state) {
            caching_state = memoization_state.create_global_caching_state_for_name(EXPAND_RDF_XML_URI_NAMESPACE_PREFIX, $expand_rdf_xml_uri_namespace_prefix_caching_state$, NIL, EQUAL, TWO_INTEGER, ZERO_INTEGER);
        }
        final SubLObject sxhash = memoization_state.sxhash_calc_2(prefix, rdf_attributes);
        final SubLObject collisions = memoization_state.caching_state_lookup(caching_state, sxhash, UNPROVIDED);
        if (!collisions.eql(memoization_state.$memoized_item_not_found$.getGlobalValue())) {
            SubLObject cdolist_list_var = collisions;
            SubLObject collision = NIL;
            collision = cdolist_list_var.first();
            while (NIL != cdolist_list_var) {
                SubLObject cached_args = collision.first();
                final SubLObject results2 = second(collision);
                if (prefix.equal(cached_args.first())) {
                    cached_args = cached_args.rest();
                    if (((NIL != cached_args) && (NIL == cached_args.rest())) && rdf_attributes.equal(cached_args.first())) {
                        return memoization_state.caching_results(results2);
                    }
                }
                cdolist_list_var = cdolist_list_var.rest();
                collision = cdolist_list_var.first();
            } 
        }
        final SubLObject results3 = arg2(resetMultipleValues(), multiple_value_list(expand_rdf_xml_uri_namespace_prefix_internal(prefix, rdf_attributes)));
        memoization_state.caching_state_enter_multi_key_n(caching_state, sxhash, collisions, results3, list(prefix, rdf_attributes));
        return memoization_state.caching_results(results3);
    }

    public static SubLObject valid_node_element_rdf_uri_p(final SubLObject v_object) {
        return makeBoolean((((NIL != rdf_uri.rdf_uri_p(v_object)) && (NIL == rdf_uri.rdf_namespace_uri_with_local_partP(v_object, $$$li))) && (NIL == rdfXxml_core_syntax_rdf_uri_p(v_object))) && (NIL == rdfXxml_old_term_rdf_uri_p(v_object)));
    }

    public static SubLObject valid_property_attribute_rdf_uri_p(final SubLObject v_object) {
        return makeBoolean(((((NIL != rdf_uri.rdf_uri_p(v_object)) && (NIL == rdf_uri.rdf_namespace_uri_with_local_partP(v_object, $$$li))) && (NIL == rdf_description_typeP(v_object))) && (NIL == rdfXxml_core_syntax_rdf_uri_p(v_object))) && (NIL == rdfXxml_old_term_rdf_uri_p(v_object)));
    }

    public static SubLObject valid_property_element_rdf_uri_p(final SubLObject v_object) {
        return makeBoolean((((NIL != rdf_uri.rdf_uri_p(v_object)) && (NIL == rdf_description_typeP(v_object))) && (NIL == rdfXxml_core_syntax_rdf_uri_p(v_object))) && (NIL == rdfXxml_old_term_rdf_uri_p(v_object)));
    }

    public static SubLObject rdfXxml_core_syntax_uris() {
        if ($rdfXxml_core_syntax_uris$.getGlobalValue() == $UNINITIALIZED) {
            final SubLObject init_value = list_utilities.list2vector(list(rdf_utilities.rdf_expanded_name($$$RDF), rdf_utilities.rdf_expanded_name($$$ID), rdf_utilities.rdf_expanded_name($$$about), rdf_utilities.rdf_expanded_name($$$parseType), rdf_utilities.rdf_expanded_name($$$resource), rdf_utilities.rdf_expanded_name($$$nodeID), rdf_utilities.rdf_expanded_name($$$datatype)));
            if (init_value == $UNINITIALIZED) {
                Errors.error($str53$Unable_to_initialize__A__, $rdfXxml_core_syntax_uris$.getGlobalValue());
            }
            $rdfXxml_core_syntax_uris$.setGlobalValue(init_value);
        }
        return $rdfXxml_core_syntax_uris$.getGlobalValue();
    }

    public static SubLObject rdfXxml_core_syntax_rdf_uri_p(final SubLObject v_object) {
        return find(v_object, rdfXxml_core_syntax_uris(), symbol_function($sym54$RDF_URI_MATCHES_), UNPROVIDED, UNPROVIDED, UNPROVIDED);
    }

    public static SubLObject rdfXxml_old_term_uris() {
        if ($rdfXxml_old_term_uris$.getGlobalValue() == $UNINITIALIZED) {
            final SubLObject init_value = list_utilities.list2vector(list(rdf_utilities.rdf_expanded_name($$$aboutEach), rdf_utilities.rdf_expanded_name($$$aboutEachPrefix), rdf_utilities.rdf_expanded_name($$$bagID)));
            if (init_value == $UNINITIALIZED) {
                Errors.error($str53$Unable_to_initialize__A__, $rdfXxml_old_term_uris$.getGlobalValue());
            }
            $rdfXxml_old_term_uris$.setGlobalValue(init_value);
        }
        return $rdfXxml_old_term_uris$.getGlobalValue();
    }

    public static SubLObject rdfXxml_old_term_rdf_uri_p(final SubLObject v_object) {
        return makeBoolean((NIL != rdf_uri.rdf_uri_p(v_object)) && (NIL != find(v_object, rdfXxml_old_term_uris(), symbol_function($sym54$RDF_URI_MATCHES_), UNPROVIDED, UNPROVIDED, UNPROVIDED)));
    }

    public static SubLObject rdf_xml_literal_uri() {
        return rdf_utilities.rdf_expanded_name($$$XMLLiteral);
    }

    public static SubLObject rdf_type_uri(final SubLObject graph_or_stream) {
        return rdf_parser_get_rdf_namespace_uri(graph_or_stream, $$$type);
    }

    public static SubLObject resolve_rdfXxml_subject(final SubLObject sexpr, final SubLObject graph_or_stream, final SubLObject attribute_lists) {
        final SubLObject id = xml_parsing_utilities.xml_sexpr_attribute_value(sexpr, rdf_utilities.rdf_name($$$ID));
        final SubLObject about = xml_parsing_utilities.xml_sexpr_attribute_value(sexpr, rdf_utilities.rdf_name($$$about));
        final SubLObject resource = xml_parsing_utilities.xml_sexpr_attribute_value(sexpr, rdf_utilities.rdf_name($$$resource));
        final SubLObject node_id = xml_parsing_utilities.xml_sexpr_attribute_value(sexpr, rdf_utilities.rdf_name($$$nodeID));
        SubLObject subject = NIL;
        if (NIL != id) {
            if (NIL != node_id) {
                Errors.error($str59$Cannot_have_rdf_nodeID_and_rdf_ID);
            }
            if (NIL != about) {
                Errors.error($str60$Cannot_have_rdf_about_and_rdf_ID_);
            }
            final SubLObject subject_uri = resolve_rdf_id(id, cons(xml_parsing_utilities.xml_sexpr_attributes(sexpr), attribute_lists));
            verify_rdf_id_is_new(subject_uri);
            subject = subject_uri;
        } else
            if (NIL != node_id) {
                if (NIL != id) {
                    Errors.error($str59$Cannot_have_rdf_nodeID_and_rdf_ID);
                }
                if (NIL != about) {
                    Errors.error($str61$Cannot_have_rdf_nodeID_and_rdf_ab);
                }
                if (NIL != resource) {
                    Errors.error($str62$Cannot_have_rdf_nodeID_and_rdf_re);
                }
                SubLTrampolineFile.enforceType(node_id, VALID_XML_NAMESPACES_NAME_P);
                subject = rdf_parser_get_blank_node(graph_or_stream, node_id);
            } else
                if (NIL != xml_parsing_utilities.xml_sexpr_attribute_value(sexpr, rdf_utilities.rdf_name($$$about))) {
                    if (NIL != node_id) {
                        Errors.error($str61$Cannot_have_rdf_nodeID_and_rdf_ab);
                    }
                    if (NIL != id) {
                        Errors.error($str60$Cannot_have_rdf_about_and_rdf_ID_);
                    }
                    final SubLObject subject_uri = subject = resolve_rdfXxml_uri(xml_parsing_utilities.xml_sexpr_attribute_value(sexpr, rdf_utilities.rdf_name($$$about)), attribute_lists, T);
                } else {
                    subject = rdf_parser_get_new_blank_node(graph_or_stream);
                }


        return subject;
    }

    public static SubLObject verify_rdf_id_is_new(final SubLObject id) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject newP = set.set_add(id, $rdf_parser_node_ids$.getDynamicValue(thread));
        if (NIL == newP) {
            Errors.error($str64$Name_clash__Graph_already_has_nod, id);
        }
        return NIL;
    }

    public static SubLObject resolve_rdfXxml_object_from_empty_property_element(final SubLObject sexpr, final SubLObject v_graph, final SubLObject attribute_lists) {
        final SubLObject resource = xml_parsing_utilities.xml_sexpr_attribute_value(sexpr, rdf_utilities.rdf_name($$$resource));
        final SubLObject node_id = xml_parsing_utilities.xml_sexpr_attribute_value(sexpr, rdf_utilities.rdf_name($$$nodeID));
        SubLObject subject = NIL;
        if (NIL != resource) {
            if (NIL != node_id) {
                Errors.error($str62$Cannot_have_rdf_nodeID_and_rdf_re);
            }
            subject = resolve_rdfXxml_uri(resource, attribute_lists, T);
        } else
            if (NIL != node_id) {
                if (NIL != resource) {
                    Errors.error($str62$Cannot_have_rdf_nodeID_and_rdf_re);
                }
                SubLTrampolineFile.enforceType(node_id, VALID_XML_NAMESPACES_NAME_P);
                subject = rdf_parser_get_blank_node(v_graph, node_id);
            } else {
                subject = rdf_parser_get_new_blank_node(v_graph);
            }

        return subject;
    }

    public static SubLObject valid_xml_namespaces_name_p(final SubLObject v_object) {
        return makeBoolean((NIL != xml_utilities.valid_xml_name_p(v_object)) && (NIL == find(CHAR_colon, v_object, symbol_function(EQL), symbol_function(IDENTITY), ONE_INTEGER, UNPROVIDED)));
    }

    public static SubLObject resolve_rdf_id(final SubLObject local_name, final SubLObject attribute_lists) {
        SubLTrampolineFile.enforceType(local_name, VALID_XML_NAME_P);
        final SubLObject hash_prefixed = cconcatenate($str66$_, local_name);
        final SubLObject resolved = resolve_rdfXxml_uri(hash_prefixed, attribute_lists, T);
        if (hash_prefixed.equal(resolved)) {
            Errors.error($str67$Couldn_t_resolve_local_name__S, local_name);
        }
        return resolved;
    }

    public static SubLObject rdf_sexpr_p(final SubLObject v_object) {
        return makeBoolean((NIL != Strings.stringE(xml_parsing_utilities.xml_sexpr_type(v_object), rdf_utilities.rdf_name($$$RDF), UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED)) || (NIL != Strings.stringE(xml_parsing_utilities.xml_sexpr_type(v_object), $$$RDF, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED)));
    }

    public static SubLObject rdf_token_p(final SubLObject v_object) {
        return makeBoolean(v_object.isString() && ((NIL != xml_parsing_utilities.xml_token_element_nameP(v_object, rdf_utilities.rdf_name($$$RDF))) || (NIL != xml_parsing_utilities.xml_token_element_nameP(v_object, $$$RDF))));
    }

    public static SubLObject note_parsed_triple(final SubLObject v_graph, final SubLObject subject, final SubLObject predicate, final SubLObject v_object) {
        if (NIL != rdf_graph.rdf_graph_p(v_graph)) {
            rdf_graph.rdf_graph_add_triple(v_graph, subject, predicate, v_object);
        } else
            if (NIL != output_stream_p(v_graph)) {
                rdf_n_triples_writer.write_n_triple(rdf_triple.new_rdf_triple(subject, predicate, v_object), v_graph);
            } else {
                Errors.error($str68$Output_must_be_to_either_an_RDF_G, v_graph);
            }

        return NIL;
    }

    public static SubLObject rdf_parser_get_rdf_namespace_uri(final SubLObject graph_or_stream, final SubLObject local_part) {
        if (NIL != rdf_graph.rdf_graph_p(graph_or_stream)) {
            return rdf_graph.rdf_graph_get_rdf_namesapce_uri(graph_or_stream, local_part);
        }
        return rdf_uri.get_rdf_uri(rdf_utilities.rdf_namespace(), string_utilities.$empty_string$.getGlobalValue(), local_part);
    }

    public static SubLObject rdf_parser_get_literal(final SubLObject v_graph, final SubLObject lexical_form, SubLObject language, SubLObject datatype) {
        if (language == UNPROVIDED) {
            language = NIL;
        }
        if (datatype == UNPROVIDED) {
            datatype = NIL;
        }
        if (NIL != rdf_graph.rdf_graph_p(v_graph)) {
            return rdf_graph.rdf_graph_get_literal(v_graph, lexical_form, language, datatype);
        }
        return rdf_literal.new_rdf_literal(lexical_form, language, datatype);
    }

    public static SubLObject rdf_parser_get_new_blank_node(final SubLObject v_graph) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        if (NIL != rdf_graph.rdf_graph_p(v_graph)) {
            return rdf_graph.rdf_graph_get_new_blank_node(v_graph);
        }
        final SubLObject id = integer_sequence_generator.integer_sequence_generator_next($rdf_parser_blank_node_id_isg$.getDynamicValue(thread));
        final SubLObject node = rdf_blank_node.new_rdf_blank_node(id);
        id_index_enter($rdf_parser_blank_node_index$.getDynamicValue(thread), id, node);
        return node;
    }

    public static SubLObject rdf_parser_get_blank_node(final SubLObject v_graph, final SubLObject id) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        if (NIL != rdf_graph.rdf_graph_p(v_graph)) {
            return rdf_graph.rdf_graph_get_blank_node(v_graph, id);
        }
        return rdf_blank_node.new_rdf_blank_node(integer_sequence_generator.integer_sequence_generator_next($rdf_parser_blank_node_id_isg$.getDynamicValue(thread)));
    }

    public static SubLObject test_rdf_to_n_triples() {
        return file_utilities.file_existsP(rdfXxml_to_n_triples(rdf_parser_test_files().first(), file_utilities.make_temp_filename(UNPROVIDED), UNPROVIDED));
    }

    public static SubLObject test_rdfXxml_parser() {
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject test_files = rdf_parser_test_files();
        SubLObject parsed = NIL;
        SubLObject rightly_errored = NIL;
        SubLObject failed = NIL;
        final SubLObject list_var = test_files;
        final SubLObject _prev_bind_0 = $progress_note$.currentBinding(thread);
        final SubLObject _prev_bind_2 = $progress_start_time$.currentBinding(thread);
        final SubLObject _prev_bind_3 = $progress_total$.currentBinding(thread);
        final SubLObject _prev_bind_4 = $progress_sofar$.currentBinding(thread);
        final SubLObject _prev_bind_5 = $last_percent_progress_index$.currentBinding(thread);
        final SubLObject _prev_bind_6 = $last_percent_progress_prediction$.currentBinding(thread);
        final SubLObject _prev_bind_7 = $within_noting_percent_progress$.currentBinding(thread);
        final SubLObject _prev_bind_8 = $percent_progress_start_time$.currentBinding(thread);
        try {
            $progress_note$.bind(NIL != cconcatenate($$$Running_, new SubLObject[]{ format_nil.format_nil_d_no_copy(length(test_files)), $str83$_RDF_parsing_tests___ }) ? cconcatenate($$$Running_, new SubLObject[]{ format_nil.format_nil_d_no_copy(length(test_files)), $str83$_RDF_parsing_tests___ }) : $$$cdolist, thread);
            $progress_start_time$.bind(get_universal_time(), thread);
            $progress_total$.bind(length(list_var), thread);
            $progress_sofar$.bind(ZERO_INTEGER, thread);
            $last_percent_progress_index$.bind(ZERO_INTEGER, thread);
            $last_percent_progress_prediction$.bind(NIL, thread);
            $within_noting_percent_progress$.bind(T, thread);
            $percent_progress_start_time$.bind(get_universal_time(), thread);
            try {
                noting_percent_progress_preamble($progress_note$.getDynamicValue(thread));
                SubLObject csome_list_var = list_var;
                SubLObject file = NIL;
                file = csome_list_var.first();
                while (NIL != csome_list_var) {
                    SubLObject error_message = NIL;
                    SubLObject v_graph = NIL;
                    final SubLObject _prev_bind_0_$8 = $silent_progressP$.currentBinding(thread);
                    try {
                        $silent_progressP$.bind(T, thread);
                        final SubLObject base_uri = web_utilities.resolve_relative_uri($rdfXxml_parser_test_base_uri$.getGlobalValue(), string_utilities.pre_remove(file, $rdfXxml_parser_test_directory$.getGlobalValue(), UNPROVIDED));
                        try {
                            thread.throwStack.push($catch_error_message_target$.getGlobalValue());
                            final SubLObject _prev_bind_0_$9 = Errors.$error_handler$.currentBinding(thread);
                            try {
                                Errors.$error_handler$.bind(CATCH_ERROR_MESSAGE_HANDLER, thread);
                                try {
                                    v_graph = parse_rdfXxml_file(file, base_uri);
                                } catch (final Throwable catch_var) {
                                    Errors.handleThrowable(catch_var, NIL);
                                }
                            } finally {
                                Errors.$error_handler$.rebind(_prev_bind_0_$9, thread);
                            }
                        } catch (final Throwable ccatch_env_var) {
                            error_message = Errors.handleThrowable(ccatch_env_var, $catch_error_message_target$.getGlobalValue());
                        } finally {
                            thread.throwStack.pop();
                        }
                        if (NIL != search($$$error, file, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED)) {
                            if (NIL != rdf_graph.rdf_graph_p(v_graph)) {
                                failed = cons(file, failed);
                            } else {
                                rightly_errored = cons(list(file, error_message), rightly_errored);
                            }
                        } else
                            if (NIL != rdf_graph.rdf_graph_p(v_graph)) {
                                try {
                                    thread.throwStack.push($catch_error_message_target$.getGlobalValue());
                                    final SubLObject _prev_bind_0_$10 = Errors.$error_handler$.currentBinding(thread);
                                    try {
                                        Errors.$error_handler$.bind(CATCH_ERROR_MESSAGE_HANDLER, thread);
                                        try {
                                            validate_rdf_test_graph(v_graph, file);
                                        } catch (final Throwable catch_var) {
                                            Errors.handleThrowable(catch_var, NIL);
                                        }
                                    } finally {
                                        Errors.$error_handler$.rebind(_prev_bind_0_$10, thread);
                                    }
                                } catch (final Throwable ccatch_env_var) {
                                    error_message = Errors.handleThrowable(ccatch_env_var, $catch_error_message_target$.getGlobalValue());
                                } finally {
                                    thread.throwStack.pop();
                                }
                                if (NIL == error_message) {
                                    parsed = cons(file, parsed);
                                } else {
                                    failed = cons(list(file, error_message), failed);
                                }
                            } else {
                                failed = cons(list(file, error_message), failed);
                            }

                    } finally {
                        $silent_progressP$.rebind(_prev_bind_0_$8, thread);
                    }
                    force_output(UNPROVIDED);
                    $progress_sofar$.setDynamicValue(add($progress_sofar$.getDynamicValue(thread), ONE_INTEGER), thread);
                    note_percent_progress($progress_sofar$.getDynamicValue(thread), $progress_total$.getDynamicValue(thread));
                    csome_list_var = csome_list_var.rest();
                    file = csome_list_var.first();
                } 
            } finally {
                final SubLObject _prev_bind_0_$11 = $is_thread_performing_cleanupP$.currentBinding(thread);
                try {
                    $is_thread_performing_cleanupP$.bind(T, thread);
                    final SubLObject _values = getValuesAsVector();
                    noting_percent_progress_postamble();
                    restoreValuesFromVector(_values);
                } finally {
                    $is_thread_performing_cleanupP$.rebind(_prev_bind_0_$11, thread);
                }
            }
        } finally {
            $percent_progress_start_time$.rebind(_prev_bind_8, thread);
            $within_noting_percent_progress$.rebind(_prev_bind_7, thread);
            $last_percent_progress_prediction$.rebind(_prev_bind_6, thread);
            $last_percent_progress_index$.rebind(_prev_bind_5, thread);
            $progress_sofar$.rebind(_prev_bind_4, thread);
            $progress_total$.rebind(_prev_bind_3, thread);
            $progress_start_time$.rebind(_prev_bind_2, thread);
            $progress_note$.rebind(_prev_bind_0, thread);
        }
        format(T, $str87$__Failed___S__, failed);
        format(T, $str88$__Summary___D_Parsed___D_Rightly_, new SubLObject[]{ length(parsed), length(rightly_errored), length(failed) });
        return length(failed);
    }

    public static SubLObject rdf_parser_test_files() {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject test_files = NIL;
        assert NIL != Filesys.directory_p($rdfXxml_parser_test_directory$.getGlobalValue()) : "Filesys.directory_p(rdf_parser.$rdfXxml_parser_test_directory$.getGlobalValue()) " + "CommonSymbols.NIL != Filesys.directory_p(rdf_parser.$rdfXxml_parser_test_directory$.getGlobalValue()) " + $rdfXxml_parser_test_directory$.getGlobalValue();
        SubLObject directory_list_var = list($rdfXxml_parser_test_directory$.getGlobalValue());
        SubLObject current_directory_var = NIL;
        current_directory_var = directory_list_var.first();
        while (NIL != directory_list_var) {
            directory_list_var = directory_list_var.rest();
            assert NIL != Filesys.directory_p(current_directory_var) : "Filesys.directory_p(current_directory_var) " + "CommonSymbols.NIL != Filesys.directory_p(current_directory_var) " + current_directory_var;
            SubLObject directory_contents_var = Filesys.directory(current_directory_var, T);
            final SubLObject progress_message_var = (NIL.isString()) ? cconcatenate(NIL, cconcatenate(format_nil.$format_nil_percent$.getGlobalValue(), new SubLObject[]{ $str90$_Directory__, format_nil.format_nil_s_no_copy(current_directory_var) })) : NIL;
            final SubLObject _prev_bind_0 = $silent_progressP$.currentBinding(thread);
            try {
                $silent_progressP$.bind(makeBoolean(!progress_message_var.isString()), thread);
                if (NIL.isFunctionSpec()) {
                    directory_contents_var = Sort.sort(directory_contents_var, NIL, UNPROVIDED);
                }
                final SubLObject list_var = directory_contents_var;
                final SubLObject _prev_bind_0_$12 = $progress_note$.currentBinding(thread);
                final SubLObject _prev_bind_2 = $progress_start_time$.currentBinding(thread);
                final SubLObject _prev_bind_3 = $progress_total$.currentBinding(thread);
                final SubLObject _prev_bind_4 = $progress_sofar$.currentBinding(thread);
                final SubLObject _prev_bind_5 = $last_percent_progress_index$.currentBinding(thread);
                final SubLObject _prev_bind_6 = $last_percent_progress_prediction$.currentBinding(thread);
                final SubLObject _prev_bind_7 = $within_noting_percent_progress$.currentBinding(thread);
                final SubLObject _prev_bind_8 = $percent_progress_start_time$.currentBinding(thread);
                try {
                    $progress_note$.bind(NIL != progress_message_var ? progress_message_var : $$$cdolist, thread);
                    $progress_start_time$.bind(get_universal_time(), thread);
                    $progress_total$.bind(length(list_var), thread);
                    $progress_sofar$.bind(ZERO_INTEGER, thread);
                    $last_percent_progress_index$.bind(ZERO_INTEGER, thread);
                    $last_percent_progress_prediction$.bind(NIL, thread);
                    $within_noting_percent_progress$.bind(T, thread);
                    $percent_progress_start_time$.bind(get_universal_time(), thread);
                    try {
                        noting_percent_progress_preamble($progress_note$.getDynamicValue(thread));
                        SubLObject csome_list_var = list_var;
                        SubLObject file = NIL;
                        file = csome_list_var.first();
                        while (NIL != csome_list_var) {
                            if (NIL != Filesys.directory_p(file)) {
                                directory_list_var = cons(file, directory_list_var);
                            } else
                                if (NIL != string_utilities.ends_with(file, $str91$_rdf, UNPROVIDED)) {
                                    test_files = cons(file, test_files);
                                }

                            $progress_sofar$.setDynamicValue(add($progress_sofar$.getDynamicValue(thread), ONE_INTEGER), thread);
                            note_percent_progress($progress_sofar$.getDynamicValue(thread), $progress_total$.getDynamicValue(thread));
                            csome_list_var = csome_list_var.rest();
                            file = csome_list_var.first();
                        } 
                    } finally {
                        final SubLObject _prev_bind_0_$13 = $is_thread_performing_cleanupP$.currentBinding(thread);
                        try {
                            $is_thread_performing_cleanupP$.bind(T, thread);
                            final SubLObject _values = getValuesAsVector();
                            noting_percent_progress_postamble();
                            restoreValuesFromVector(_values);
                        } finally {
                            $is_thread_performing_cleanupP$.rebind(_prev_bind_0_$13, thread);
                        }
                    }
                } finally {
                    $percent_progress_start_time$.rebind(_prev_bind_8, thread);
                    $within_noting_percent_progress$.rebind(_prev_bind_7, thread);
                    $last_percent_progress_prediction$.rebind(_prev_bind_6, thread);
                    $last_percent_progress_index$.rebind(_prev_bind_5, thread);
                    $progress_sofar$.rebind(_prev_bind_4, thread);
                    $progress_total$.rebind(_prev_bind_3, thread);
                    $progress_start_time$.rebind(_prev_bind_2, thread);
                    $progress_note$.rebind(_prev_bind_0_$12, thread);
                }
            } finally {
                $silent_progressP$.rebind(_prev_bind_0, thread);
            }
            current_directory_var = directory_list_var.first();
        } 
        return test_files;
    }

    public static SubLObject test_one_file(final SubLObject file) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        clear_rdf_parser_caches();
        final SubLObject base_uri = web_utilities.resolve_relative_uri($rdfXxml_parser_test_base_uri$.getGlobalValue(), string_utilities.pre_remove(file, $rdfXxml_parser_test_directory$.getGlobalValue(), UNPROVIDED));
        SubLObject v_graph = NIL;
        SubLObject error_message = NIL;
        try {
            thread.throwStack.push($catch_error_message_target$.getGlobalValue());
            final SubLObject _prev_bind_0 = Errors.$error_handler$.currentBinding(thread);
            try {
                Errors.$error_handler$.bind(CATCH_ERROR_MESSAGE_HANDLER, thread);
                try {
                    v_graph = parse_rdfXxml_file(file, base_uri);
                } catch (final Throwable catch_var) {
                    Errors.handleThrowable(catch_var, NIL);
                }
            } finally {
                Errors.$error_handler$.rebind(_prev_bind_0, thread);
            }
        } catch (final Throwable ccatch_env_var) {
            error_message = Errors.handleThrowable(ccatch_env_var, $catch_error_message_target$.getGlobalValue());
        } finally {
            thread.throwStack.pop();
        }
        if (NIL != search($$$error, file, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED)) {
            return list_utilities.sublisp_boolean(error_message);
        }
        if (NIL != v_graph) {
            return validate_rdf_test_graph(v_graph, file);
        }
        Errors.error(error_message);
        return NIL;
    }

    public static SubLObject validate_rdf_test_graph(final SubLObject v_graph, final SubLObject file) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject validP = rdf_graph.rdf_graph_p(v_graph);
        final SubLObject output_spec_file = cconcatenate(string_utilities.post_remove(file, $str91$_rdf, UNPROVIDED), $str92$_nt);
        if (NIL != file_utilities.file_existsP(output_spec_file)) {
            final SubLObject target_graph = rdf_n_triples_parser.rdf_graph_from_n_triples_file(output_spec_file);
            thread.resetMultipleValues();
            final SubLObject extra = rdf_graph.rdf_graph_diff(v_graph, target_graph);
            final SubLObject missing = thread.secondMultipleValue();
            thread.resetMultipleValues();
            if ((NIL != extra) || (NIL != missing)) {
                Errors.error($str93$Graph_mismatch__Extra___S___Missi, extra, missing);
            }
        }
        return validP;
    }

    public static SubLObject parse_cyc_owl_for_fort(final SubLObject fort) {
        return parse_rdfXxml_from_url(owl_cycl_to_xml.owl_opencyc_readable_uri_for_fort(fort, UNPROVIDED), owl_uris_and_prefixes.owl_english_opencyc_base_uri(UNPROVIDED));
    }

    public static SubLObject declare_rdf_parser_file() {
        declareFunction(me, "parse_rdfXxml_file", "PARSE-RDF/XML-FILE", 1, 1, false);
        declareFunction(me, "parse_rdfXxml_file_with_detail", "PARSE-RDF/XML-FILE-WITH-DETAIL", 1, 0, false);
        declareFunction(me, "parse_rdfXxml_from_url", "PARSE-RDF/XML-FROM-URL", 1, 1, false);
        declareFunction(me, "parse_rdfXxml_stream", "PARSE-RDF/XML-STREAM", 2, 0, false);
        declareFunction(me, "rdfXxml_to_n_triples", "RDF/XML-TO-N-TRIPLES", 2, 1, false);
        declareFunction(me, "parse_rdfXxml_stream_to_file", "PARSE-RDF/XML-STREAM-TO-FILE", 3, 0, false);
        declareFunction(me, "parse_rdfXxml_stream_to_graph", "PARSE-RDF/XML-STREAM-TO-GRAPH", 3, 0, false);
        declareFunction(me, "parse_rdfXxml_stream_internal", "PARSE-RDF/XML-STREAM-INTERNAL", 3, 0, false);
        declareFunction(me, "parse_next_rdfXxml_element", "PARSE-NEXT-RDF/XML-ELEMENT", 6, 0, false);
        declareFunction(me, "clear_rdf_parser_caches", "CLEAR-RDF-PARSER-CACHES", 0, 0, false);
        declareFunction(me, "parse_rdfXxml_node_element", "PARSE-RDF/XML-NODE-ELEMENT", 3, 0, false);
        declareFunction(me, "parse_rdfXxml_node_element_internal", "PARSE-RDF/XML-NODE-ELEMENT-INTERNAL", 6, 0, false);
        declareFunction(me, "rdf_description_typeP", "RDF-DESCRIPTION-TYPE?", 1, 0, false);
        declareFunction(me, "parse_rdfXxml_property_element", "PARSE-RDF/XML-PROPERTY-ELEMENT", 4, 0, false);
        declareFunction(me, "parse_rdfXxml_parse_type_literal_property_element", "PARSE-RDF/XML-PARSE-TYPE-LITERAL-PROPERTY-ELEMENT", 5, 0, false);
        declareFunction(me, "parse_rdfXxml_literal_property_element", "PARSE-RDF/XML-LITERAL-PROPERTY-ELEMENT", 5, 0, false);
        declareFunction(me, "parse_rdfXxml_resource_property_element", "PARSE-RDF/XML-RESOURCE-PROPERTY-ELEMENT", 5, 0, false);
        declareFunction(me, "parse_rdfXxml_empty_property_element", "PARSE-RDF/XML-EMPTY-PROPERTY-ELEMENT", 5, 0, false);
        declareFunction(me, "reify_rdf_triple", "REIFY-RDF-TRIPLE", 5, 0, false);
        declareFunction(me, "parse_rdfXxml_collection_property_element", "PARSE-RDF/XML-COLLECTION-PROPERTY-ELEMENT", 5, 0, false);
        declareFunction(me, "literal_parse_type_sexprP", "LITERAL-PARSE-TYPE-SEXPR?", 1, 0, false);
        declareFunction(me, "parse_rdfXxml_property_attributes", "PARSE-RDF/XML-PROPERTY-ATTRIBUTES", 4, 0, false);
        declareFunction(me, "rdf_literal_value", "RDF-LITERAL-VALUE", 3, 0, false);
        declareFunction(me, "resolve_rdfXxml_uris", "RESOLVE-RDF/XML-URIS", 2, 0, false);
        declareFunction(me, "resolve_rdfXxml_uri", "RESOLVE-RDF/XML-URI", 2, 1, false);
        declareFunction(me, "clear_resolve_rdfXxml_uri_internal", "CLEAR-RESOLVE-RDF/XML-URI-INTERNAL", 0, 0, false);
        declareFunction(me, "remove_resolve_rdfXxml_uri_internal", "REMOVE-RESOLVE-RDF/XML-URI-INTERNAL", 2, 1, false);
        declareFunction(me, "resolve_rdfXxml_uri_internal_internal", "RESOLVE-RDF/XML-URI-INTERNAL-INTERNAL", 3, 0, false);
        declareFunction(me, "resolve_rdfXxml_uri_internal", "RESOLVE-RDF/XML-URI-INTERNAL", 2, 1, false);
        declareFunction(me, "possibly_remove_uri_fragment", "POSSIBLY-REMOVE-URI-FRAGMENT", 1, 0, false);
        declareFunction(me, "clear_expand_rdf_xml_uri_namespace_prefix", "CLEAR-EXPAND-RDF-XML-URI-NAMESPACE-PREFIX", 0, 0, false);
        declareFunction(me, "remove_expand_rdf_xml_uri_namespace_prefix", "REMOVE-EXPAND-RDF-XML-URI-NAMESPACE-PREFIX", 2, 0, false);
        declareFunction(me, "expand_rdf_xml_uri_namespace_prefix_internal", "EXPAND-RDF-XML-URI-NAMESPACE-PREFIX-INTERNAL", 2, 0, false);
        declareFunction(me, "expand_rdf_xml_uri_namespace_prefix", "EXPAND-RDF-XML-URI-NAMESPACE-PREFIX", 2, 0, false);
        declareFunction(me, "valid_node_element_rdf_uri_p", "VALID-NODE-ELEMENT-RDF-URI-P", 1, 0, false);
        declareFunction(me, "valid_property_attribute_rdf_uri_p", "VALID-PROPERTY-ATTRIBUTE-RDF-URI-P", 1, 0, false);
        declareFunction(me, "valid_property_element_rdf_uri_p", "VALID-PROPERTY-ELEMENT-RDF-URI-P", 1, 0, false);
        declareFunction(me, "rdfXxml_core_syntax_uris", "RDF/XML-CORE-SYNTAX-URIS", 0, 0, false);
        declareFunction(me, "rdfXxml_core_syntax_rdf_uri_p", "RDF/XML-CORE-SYNTAX-RDF-URI-P", 1, 0, false);
        declareFunction(me, "rdfXxml_old_term_uris", "RDF/XML-OLD-TERM-URIS", 0, 0, false);
        declareFunction(me, "rdfXxml_old_term_rdf_uri_p", "RDF/XML-OLD-TERM-RDF-URI-P", 1, 0, false);
        declareFunction(me, "rdf_xml_literal_uri", "RDF-XML-LITERAL-URI", 0, 0, false);
        declareFunction(me, "rdf_type_uri", "RDF-TYPE-URI", 1, 0, false);
        declareFunction(me, "resolve_rdfXxml_subject", "RESOLVE-RDF/XML-SUBJECT", 3, 0, false);
        declareFunction(me, "verify_rdf_id_is_new", "VERIFY-RDF-ID-IS-NEW", 1, 0, false);
        declareFunction(me, "resolve_rdfXxml_object_from_empty_property_element", "RESOLVE-RDF/XML-OBJECT-FROM-EMPTY-PROPERTY-ELEMENT", 3, 0, false);
        declareFunction(me, "valid_xml_namespaces_name_p", "VALID-XML-NAMESPACES-NAME-P", 1, 0, false);
        declareFunction(me, "resolve_rdf_id", "RESOLVE-RDF-ID", 2, 0, false);
        declareFunction(me, "rdf_sexpr_p", "RDF-SEXPR-P", 1, 0, false);
        declareFunction(me, "rdf_token_p", "RDF-TOKEN-P", 1, 0, false);
        declareFunction(me, "note_parsed_triple", "NOTE-PARSED-TRIPLE", 4, 0, false);
        declareFunction(me, "rdf_parser_get_rdf_namespace_uri", "RDF-PARSER-GET-RDF-NAMESPACE-URI", 2, 0, false);
        declareFunction(me, "rdf_parser_get_literal", "RDF-PARSER-GET-LITERAL", 2, 2, false);
        declareFunction(me, "rdf_parser_get_new_blank_node", "RDF-PARSER-GET-NEW-BLANK-NODE", 1, 0, false);
        declareFunction(me, "rdf_parser_get_blank_node", "RDF-PARSER-GET-BLANK-NODE", 2, 0, false);
        declareFunction(me, "test_rdf_to_n_triples", "TEST-RDF-TO-N-TRIPLES", 0, 0, false);
        declareFunction(me, "test_rdfXxml_parser", "TEST-RDF/XML-PARSER", 0, 0, false);
        declareFunction(me, "rdf_parser_test_files", "RDF-PARSER-TEST-FILES", 0, 0, false);
        declareFunction(me, "test_one_file", "TEST-ONE-FILE", 1, 0, false);
        declareFunction(me, "validate_rdf_test_graph", "VALIDATE-RDF-TEST-GRAPH", 2, 0, false);
        declareFunction(me, "parse_cyc_owl_for_fort", "PARSE-CYC-OWL-FOR-FORT", 1, 0, false);
        return NIL;
    }

    public static SubLObject init_rdf_parser_file() {
        defparameter("*RDF-PARSER-CURRENT-LANG*", NIL);
        defparameter("*RDF-PARSER-NODE-IDS*", misc_utilities.uninitialized());
        defparameter("*RDF-PARSER-BLANK-NODE-ID-ISG*", misc_utilities.uninitialized());
        defparameter("*RDF-PARSER-BLANK-NODE-INDEX*", misc_utilities.uninitialized());
        defparameter("*RDF-PARSER-NEXT-LIST-ITEM-NUMBER*", misc_utilities.uninitialized());
        defparameter("*RDF-PARSER-RECURSED?*", NIL);
        deflexical("*RESOLVE-RDF/XML-URI-INTERNAL-CACHING-STATE*", NIL);
        deflexical("*EXPAND-RDF-XML-URI-NAMESPACE-PREFIX-CACHING-STATE*", NIL);
        deflexical("*RDF/XML-CORE-SYNTAX-URIS*", $UNINITIALIZED);
        deflexical("*RDF/XML-OLD-TERM-URIS*", $UNINITIALIZED);
        deflexical("*RDF/XML-PARSER-TEST-DIRECTORY*", $str80$_home_baxter_owl_rdf_approved_tes);
        deflexical("*RDF/XML-PARSER-TEST-BASE-URI*", $str81$http___www_w3_org_2000_10_rdf_tes);
        return NIL;
    }

    public static SubLObject setup_rdf_parser_file() {
        memoization_state.note_globally_cached_function($sym43$RESOLVE_RDF_XML_URI_INTERNAL);
        memoization_state.note_globally_cached_function(EXPAND_RDF_XML_URI_NAMESPACE_PREFIX);
        define_test_case_table_int($sym69$TEST_RDF_XML_PARSER, list(new SubLObject[]{ $TEST, NIL, $OWNER, NIL, $CLASSES, $list73, $KB, $TINY, $WORKING_, T }), $list77);
        define_test_case_table_int(TEST_RDF_TO_N_TRIPLES, list(new SubLObject[]{ $TEST, NIL, $OWNER, NIL, $CLASSES, $list73, $KB, $TINY, $WORKING_, T }), $list79);
        return NIL;
    }

    @Override
    public void declareFunctions() {
        declare_rdf_parser_file();
    }

    @Override
    public void initializeVariables() {
        init_rdf_parser_file();
    }

    @Override
    public void runTopLevelForms() {
        setup_rdf_parser_file();
    }

    
}

/**
 * Total time: 468 ms
 */
